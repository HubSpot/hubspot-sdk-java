// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.automation.ActionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ActionServiceAsync.list */
class ActionListPageAsync
private constructor(
    private val service: ActionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ActionListParams,
    private val response: CollectionResponsePublicActionRevisionForwardPaging,
) : PageAsync<PublicActionRevision> {

    /**
     * Delegates to [CollectionResponsePublicActionRevisionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicActionRevisionForwardPaging.results
     */
    fun results(): List<PublicActionRevision> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicActionRevisionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicActionRevisionForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicActionRevision> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ActionListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ActionListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicActionRevision> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicActionRevisionForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActionListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ActionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ActionListParams? = null
        private var response: CollectionResponsePublicActionRevisionForwardPaging? = null

        @JvmSynthetic
        internal fun from(actionListPageAsync: ActionListPageAsync) = apply {
            service = actionListPageAsync.service
            streamHandlerExecutor = actionListPageAsync.streamHandlerExecutor
            params = actionListPageAsync.params
            response = actionListPageAsync.response
        }

        fun service(service: ActionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicActionRevisionForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActionListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionListPageAsync =
            ActionListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ActionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
