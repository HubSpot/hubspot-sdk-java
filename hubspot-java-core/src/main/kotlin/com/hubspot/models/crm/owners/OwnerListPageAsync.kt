// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.owners

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.services.async.crm.OwnerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see OwnerServiceAsync.list */
class OwnerListPageAsync
private constructor(
    private val service: OwnerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OwnerListParams,
    private val response: CollectionResponsePublicOwnerForwardPaging,
) : PageAsync<PublicOwner> {

    /**
     * Delegates to [CollectionResponsePublicOwnerForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicOwnerForwardPaging.results
     */
    fun results(): List<PublicOwner> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicOwnerForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicOwnerForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicOwner> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): OwnerListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<OwnerListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicOwner> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OwnerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicOwnerForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OwnerListPageAsync].
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

    /** A builder for [OwnerListPageAsync]. */
    class Builder internal constructor() {

        private var service: OwnerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OwnerListParams? = null
        private var response: CollectionResponsePublicOwnerForwardPaging? = null

        @JvmSynthetic
        internal fun from(ownerListPageAsync: OwnerListPageAsync) = apply {
            service = ownerListPageAsync.service
            streamHandlerExecutor = ownerListPageAsync.streamHandlerExecutor
            params = ownerListPageAsync.params
            response = ownerListPageAsync.response
        }

        fun service(service: OwnerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OwnerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicOwnerForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OwnerListPageAsync].
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
        fun build(): OwnerListPageAsync =
            OwnerListPageAsync(
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

        return other is OwnerListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OwnerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
