// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.services.blocking.cms.PageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PageService.listLandingPageRevisions */
class PageListLandingPageRevisionsPage
private constructor(
    private val service: PageService,
    private val params: PageListLandingPageRevisionsParams,
    private val response: CollectionResponseWithTotalPageVersion,
) : Page<PageVersion> {

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

    fun nextPageParams(): PageListLandingPageRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): PageListLandingPageRevisionsPage =
        service.listLandingPageRevisions(nextPageParams())

    fun autoPager(): AutoPager<PageVersion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PageListLandingPageRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PageListLandingPageRevisionsPage].
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

    /** A builder for [PageListLandingPageRevisionsPage]. */
    class Builder internal constructor() {

        private var service: PageService? = null
        private var params: PageListLandingPageRevisionsParams? = null
        private var response: CollectionResponseWithTotalPageVersion? = null

        @JvmSynthetic
        internal fun from(pageListLandingPageRevisionsPage: PageListLandingPageRevisionsPage) =
            apply {
                service = pageListLandingPageRevisionsPage.service
                params = pageListLandingPageRevisionsPage.params
                response = pageListLandingPageRevisionsPage.response
            }

        fun service(service: PageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PageListLandingPageRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PageListLandingPageRevisionsPage].
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
        fun build(): PageListLandingPageRevisionsPage =
            PageListLandingPageRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PageListLandingPageRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PageListLandingPageRevisionsPage{service=$service, params=$params, response=$response}"
}
