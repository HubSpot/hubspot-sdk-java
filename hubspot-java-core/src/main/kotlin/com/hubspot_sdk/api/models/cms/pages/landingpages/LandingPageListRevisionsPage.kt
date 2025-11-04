// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageService.listRevisions */
class LandingPageListRevisionsPage
private constructor(
    private val service: LandingPageService,
    private val params: LandingPageListRevisionsParams,
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
    fun paging(): Optional<EmailsPaging> = response._paging().getOptional("paging")

    override fun items(): List<VersionPage> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): LandingPageListRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): LandingPageListRevisionsPage = service.listRevisions(nextPageParams())

    fun autoPager(): AutoPager<VersionPage> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionPage = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LandingPageListRevisionsPage].
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

    /** A builder for [LandingPageListRevisionsPage]. */
    class Builder internal constructor() {

        private var service: LandingPageService? = null
        private var params: LandingPageListRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionPage? = null

        @JvmSynthetic
        internal fun from(landingPageListRevisionsPage: LandingPageListRevisionsPage) = apply {
            service = landingPageListRevisionsPage.service
            params = landingPageListRevisionsPage.params
            response = landingPageListRevisionsPage.response
        }

        fun service(service: LandingPageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionPage) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListRevisionsPage].
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
        fun build(): LandingPageListRevisionsPage =
            LandingPageListRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LandingPageListRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LandingPageListRevisionsPage{service=$service, params=$params, response=$response}"
}
