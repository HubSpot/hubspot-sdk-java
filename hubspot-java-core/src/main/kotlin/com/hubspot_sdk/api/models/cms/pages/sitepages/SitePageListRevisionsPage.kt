// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.sitepages

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.services.blocking.cms.pages.SitePageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SitePageService.listRevisions */
class SitePageListRevisionsPage
private constructor(
    private val service: SitePageService,
    private val params: SitePageListRevisionsParams,
    private val response: CollectionResponseWithTotalVersionPage,
) : Page<VersionPage> {

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

    override fun nextPage(): SitePageListRevisionsPage = service.listRevisions(nextPageParams())

    fun autoPager(): AutoPager<VersionPage> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SitePageListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionPage = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SitePageListRevisionsPage].
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

    /** A builder for [SitePageListRevisionsPage]. */
    class Builder internal constructor() {

        private var service: SitePageService? = null
        private var params: SitePageListRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionPage? = null

        @JvmSynthetic
        internal fun from(sitePageListRevisionsPage: SitePageListRevisionsPage) = apply {
            service = sitePageListRevisionsPage.service
            params = sitePageListRevisionsPage.params
            response = sitePageListRevisionsPage.response
        }

        fun service(service: SitePageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SitePageListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionPage) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SitePageListRevisionsPage].
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
        fun build(): SitePageListRevisionsPage =
            SitePageListRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SitePageListRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SitePageListRevisionsPage{service=$service, params=$params, response=$response}"
}
