// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.urlredirects

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.services.async.cms.UrlRedirectServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see UrlRedirectServiceAsync.list */
class UrlRedirectListPageAsync
private constructor(
    private val service: UrlRedirectServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UrlRedirectListParams,
    private val response: CollectionResponseWithTotalUrlMappingForwardPaging,
) : PageAsync<UrlMapping> {

    /**
     * Delegates to [CollectionResponseWithTotalUrlMappingForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalUrlMappingForwardPaging.results
     */
    fun results(): List<UrlMapping> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalUrlMappingForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalUrlMappingForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<UrlMapping> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): UrlRedirectListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<UrlRedirectListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UrlMapping> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UrlRedirectListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalUrlMappingForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UrlRedirectListPageAsync].
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

    /** A builder for [UrlRedirectListPageAsync]. */
    class Builder internal constructor() {

        private var service: UrlRedirectServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UrlRedirectListParams? = null
        private var response: CollectionResponseWithTotalUrlMappingForwardPaging? = null

        @JvmSynthetic
        internal fun from(urlRedirectListPageAsync: UrlRedirectListPageAsync) = apply {
            service = urlRedirectListPageAsync.service
            streamHandlerExecutor = urlRedirectListPageAsync.streamHandlerExecutor
            params = urlRedirectListPageAsync.params
            response = urlRedirectListPageAsync.response
        }

        fun service(service: UrlRedirectServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UrlRedirectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalUrlMappingForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [UrlRedirectListPageAsync].
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
        fun build(): UrlRedirectListPageAsync =
            UrlRedirectListPageAsync(
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

        return other is UrlRedirectListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UrlRedirectListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
