// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.async.cms.PageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PageServiceAsync.listSitePageRevisions */
class PageListSitePageRevisionsPageAsync
private constructor(
    private val service: PageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PageListSitePageRevisionsParams,
    private val response: CollectionResponseWithTotalPageVersion,
) : PageAsync<PageVersion> {

    /**
     * Delegates to [CollectionResponseWithTotalPageVersion], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPageVersion.results
     */
    fun results(): List<PageVersion> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPageVersion], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPageVersion.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PageVersion> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): PageListSitePageRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PageListSitePageRevisionsPageAsync> =
        service.listSitePageRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<PageVersion> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PageListSitePageRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PageListSitePageRevisionsPageAsync].
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

    /** A builder for [PageListSitePageRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: PageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PageListSitePageRevisionsParams? = null
        private var response: CollectionResponseWithTotalPageVersion? = null

        @JvmSynthetic
        internal fun from(pageListSitePageRevisionsPageAsync: PageListSitePageRevisionsPageAsync) =
            apply {
                service = pageListSitePageRevisionsPageAsync.service
                streamHandlerExecutor = pageListSitePageRevisionsPageAsync.streamHandlerExecutor
                params = pageListSitePageRevisionsPageAsync.params
                response = pageListSitePageRevisionsPageAsync.response
            }

        fun service(service: PageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PageListSitePageRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PageListSitePageRevisionsPageAsync].
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
        fun build(): PageListSitePageRevisionsPageAsync =
            PageListSitePageRevisionsPageAsync(
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

        return other is PageListSitePageRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PageListSitePageRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
