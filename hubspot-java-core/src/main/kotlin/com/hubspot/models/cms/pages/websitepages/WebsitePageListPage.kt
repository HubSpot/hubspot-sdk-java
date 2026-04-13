// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.websitepages

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot.models.cms.pages.PageData
import com.hubspot.services.blocking.cms.pages.WebsitePageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see WebsitePageService.list */
class WebsitePageListPage
private constructor(
    private val service: WebsitePageService,
    private val params: WebsitePageListParams,
    private val response: CollectionResponseWithTotalPageForwardPaging,
) : Page<PageData> {

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

    override fun nextPage(): WebsitePageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PageData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WebsitePageListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebsitePageListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebsitePageListPage]. */
    class Builder internal constructor() {

        private var service: WebsitePageService? = null
        private var params: WebsitePageListParams? = null
        private var response: CollectionResponseWithTotalPageForwardPaging? = null

        @JvmSynthetic
        internal fun from(websitePageListPage: WebsitePageListPage) = apply {
            service = websitePageListPage.service
            params = websitePageListPage.params
            response = websitePageListPage.response
        }

        fun service(service: WebsitePageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebsitePageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WebsitePageListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebsitePageListPage =
            WebsitePageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebsitePageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WebsitePageListPage{service=$service, params=$params, response=$response}"
}
