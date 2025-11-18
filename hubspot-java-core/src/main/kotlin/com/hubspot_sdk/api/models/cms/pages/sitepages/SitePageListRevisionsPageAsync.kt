// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.sitepages

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.services.async.cms.pages.SitePageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SitePageServiceAsync.listRevisions */
class SitePageListRevisionsPageAsync
private constructor(
    private val service: SitePageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SitePageListRevisionsParams,
    private val response: CollectionResponseWithTotalVersionPage,
) : PageAsync<VersionPage> {

    /**
     * Delegates to [CollectionResponseWithTotalVersionPage], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalVersionPage.results
     */
    fun results(): List<VersionPage> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalVersionPage], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalVersionPage.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<VersionPage> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SitePageListRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SitePageListRevisionsPageAsync> =
        service.listRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<VersionPage> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SitePageListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionPage = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SitePageListRevisionsPageAsync].
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

    /** A builder for [SitePageListRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: SitePageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SitePageListRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionPage? = null

        @JvmSynthetic
        internal fun from(sitePageListRevisionsPageAsync: SitePageListRevisionsPageAsync) = apply {
            service = sitePageListRevisionsPageAsync.service
            streamHandlerExecutor = sitePageListRevisionsPageAsync.streamHandlerExecutor
            params = sitePageListRevisionsPageAsync.params
            response = sitePageListRevisionsPageAsync.response
        }

        fun service(service: SitePageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SitePageListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionPage) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SitePageListRevisionsPageAsync].
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
        fun build(): SitePageListRevisionsPageAsync =
            SitePageListRevisionsPageAsync(
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

        return other is SitePageListRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SitePageListRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
