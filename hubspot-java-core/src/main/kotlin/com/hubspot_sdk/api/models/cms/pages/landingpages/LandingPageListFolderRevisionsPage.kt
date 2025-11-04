// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionContentFolder
import com.hubspot_sdk.api.models.cms.pages.VersionContentFolder
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageService.listFolderRevisions */
class LandingPageListFolderRevisionsPage
private constructor(
    private val service: LandingPageService,
    private val params: LandingPageListFolderRevisionsParams,
    private val response: CollectionResponseWithTotalVersionContentFolder,
) : Page<VersionContentFolder> {

    /**
     * Delegates to [CollectionResponseWithTotalVersionContentFolder], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalVersionContentFolder.results
     */
    fun results(): List<VersionContentFolder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalVersionContentFolder], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalVersionContentFolder.paging
     */
    fun paging(): Optional<EmailsPaging> = response._paging().getOptional("paging")

    override fun items(): List<VersionContentFolder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): LandingPageListFolderRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): LandingPageListFolderRevisionsPage =
        service.listFolderRevisions(nextPageParams())

    fun autoPager(): AutoPager<VersionContentFolder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListFolderRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalVersionContentFolder = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LandingPageListFolderRevisionsPage].
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

    /** A builder for [LandingPageListFolderRevisionsPage]. */
    class Builder internal constructor() {

        private var service: LandingPageService? = null
        private var params: LandingPageListFolderRevisionsParams? = null
        private var response: CollectionResponseWithTotalVersionContentFolder? = null

        @JvmSynthetic
        internal fun from(landingPageListFolderRevisionsPage: LandingPageListFolderRevisionsPage) =
            apply {
                service = landingPageListFolderRevisionsPage.service
                params = landingPageListFolderRevisionsPage.params
                response = landingPageListFolderRevisionsPage.response
            }

        fun service(service: LandingPageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListFolderRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalVersionContentFolder) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListFolderRevisionsPage].
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
        fun build(): LandingPageListFolderRevisionsPage =
            LandingPageListFolderRevisionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LandingPageListFolderRevisionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LandingPageListFolderRevisionsPage{service=$service, params=$params, response=$response}"
}
