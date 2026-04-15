// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions.revisions

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.automation.actions.CollectionResponsePublicActionRevisionForwardPaging
import com.hubspot.sdk.models.automation.actions.PublicActionRevision
import com.hubspot.sdk.services.async.automation.actions.RevisionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RevisionServiceAsync.list */
class RevisionListPageAsync
private constructor(
    private val service: RevisionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RevisionListParams,
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

    fun nextPageParams(): RevisionListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RevisionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicActionRevision> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RevisionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicActionRevisionForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RevisionListPageAsync].
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

    /** A builder for [RevisionListPageAsync]. */
    class Builder internal constructor() {

        private var service: RevisionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RevisionListParams? = null
        private var response: CollectionResponsePublicActionRevisionForwardPaging? = null

        @JvmSynthetic
        internal fun from(revisionListPageAsync: RevisionListPageAsync) = apply {
            service = revisionListPageAsync.service
            streamHandlerExecutor = revisionListPageAsync.streamHandlerExecutor
            params = revisionListPageAsync.params
            response = revisionListPageAsync.response
        }

        fun service(service: RevisionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RevisionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicActionRevisionForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RevisionListPageAsync].
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
        fun build(): RevisionListPageAsync =
            RevisionListPageAsync(
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

        return other is RevisionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RevisionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
