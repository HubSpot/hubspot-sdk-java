// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.domains

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.cms.DomainServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DomainServiceAsync.list */
class DomainListPageAsync
private constructor(
    private val service: DomainServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DomainListParams,
    private val response: CollectionResponseWithTotalDomainForwardPaging,
) : PageAsync<Domain> {

    /**
     * Delegates to [CollectionResponseWithTotalDomainForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalDomainForwardPaging.results
     */
    fun results(): List<Domain> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalDomainForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalDomainForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<Domain> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): DomainListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DomainListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Domain> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DomainListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalDomainForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DomainListPageAsync].
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

    /** A builder for [DomainListPageAsync]. */
    class Builder internal constructor() {

        private var service: DomainServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DomainListParams? = null
        private var response: CollectionResponseWithTotalDomainForwardPaging? = null

        @JvmSynthetic
        internal fun from(domainListPageAsync: DomainListPageAsync) = apply {
            service = domainListPageAsync.service
            streamHandlerExecutor = domainListPageAsync.streamHandlerExecutor
            params = domainListPageAsync.params
            response = domainListPageAsync.response
        }

        fun service(service: DomainServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DomainListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalDomainForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DomainListPageAsync].
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
        fun build(): DomainListPageAsync =
            DomainListPageAsync(
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

        return other is DomainListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DomainListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
