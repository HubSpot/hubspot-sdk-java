// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.sitepages

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.services.blocking.cms.pages.SitePageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SitePageService.list */
class SitePageListPage
private constructor(
    private val service: SitePageService,
    private val params: SitePageListParams,
    private val response: CollectionResponseWithTotalPageForwardPaging,
) : Page<Page> {

    /**
     * Delegates to [CollectionResponseWithTotalPageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalPageForwardPaging.results
     */
    fun results(): List<Page> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalPageForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<Page> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SitePageListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): SitePageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Page> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SitePageListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SitePageListPage].
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

    /** A builder for [SitePageListPage]. */
    class Builder internal constructor() {

        private var service: SitePageService? = null
        private var params: SitePageListParams? = null
        private var response: CollectionResponseWithTotalPageForwardPaging? = null

        @JvmSynthetic
        internal fun from(sitePageListPage: SitePageListPage) = apply {
            service = sitePageListPage.service
            params = sitePageListPage.params
            response = sitePageListPage.response
        }

        fun service(service: SitePageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SitePageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SitePageListPage].
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
        fun build(): SitePageListPage =
            SitePageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SitePageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SitePageListPage{service=$service, params=$params, response=$response}"
}
