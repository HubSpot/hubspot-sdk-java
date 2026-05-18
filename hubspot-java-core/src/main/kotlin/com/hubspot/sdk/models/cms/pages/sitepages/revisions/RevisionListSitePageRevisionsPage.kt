// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.sitepages.revisions

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalPageVersion
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.RevisionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RevisionService.listSitePageRevisions */
class RevisionListSitePageRevisionsPage
private constructor(
    private val service: RevisionService,
    private val params: RevisionListSitePageRevisionsParams,
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

    fun nextPageParams(): RevisionListSitePageRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): RevisionListSitePageRevisionsPage =
        service.listSitePageRevisions(nextPageParams())

    fun autoPager(): AutoPager<PageVersion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RevisionListSitePageRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RevisionListSitePageRevisionsPage].
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

    /** A builder for [RevisionListSitePageRevisionsPage]. */
    class Builder internal constructor() {

        private var service: RevisionService? = null
        private var params: RevisionListSitePageRevisionsParams? = null
        private var response: CollectionResponseWithTotalPageVersion? = null

        @JvmSynthetic
        internal fun from(revisionListSitePageRevisionsPage: RevisionListSitePageRevisionsPage) =
            apply {
                service = revisionListSitePageRevisionsPage.service
                params = revisionListSitePageRevisionsPage.params
                response = revisionListSitePageRevisionsPage.response
            }

        fun service(service: RevisionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RevisionListSitePageRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RevisionListSitePageRevisionsPage].
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
        fun build(): RevisionListSitePageRevisionsPage =
            RevisionListSitePageRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RevisionListSitePageRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RevisionListSitePageRevisionsPage{service=$service, params=$params, response=$response}"
}
