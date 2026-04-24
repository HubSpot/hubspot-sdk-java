// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.websitepages

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot.sdk.models.cms.pages.PageData
import com.hubspot.sdk.services.async.cms.pages.WebsitePageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see WebsitePageServiceAsync.list */
class WebsitePageListPageAsync
private constructor(
    private val service: WebsitePageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WebsitePageListParams,
    private val response: CollectionResponseWithTotalPageForwardPaging,
) : PageAsync<PageData> {

    /**
     * Delegates to [CollectionResponseWithTotalPageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalPageForwardPaging.results
     */
    fun results(): List<PageData> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalPageForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PageData> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): WebsitePageListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<WebsitePageListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PageData> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WebsitePageListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebsitePageListPageAsync].
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

    /** A builder for [WebsitePageListPageAsync]. */
    class Builder internal constructor() {

        private var service: WebsitePageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WebsitePageListParams? = null
        private var response: CollectionResponseWithTotalPageForwardPaging? = null

        @JvmSynthetic
        internal fun from(websitePageListPageAsync: WebsitePageListPageAsync) = apply {
            service = websitePageListPageAsync.service
            streamHandlerExecutor = websitePageListPageAsync.streamHandlerExecutor
            params = websitePageListPageAsync.params
            response = websitePageListPageAsync.response
        }

        fun service(service: WebsitePageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WebsitePageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WebsitePageListPageAsync].
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
        fun build(): WebsitePageListPageAsync =
            WebsitePageListPageAsync(
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

        return other is WebsitePageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WebsitePageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
