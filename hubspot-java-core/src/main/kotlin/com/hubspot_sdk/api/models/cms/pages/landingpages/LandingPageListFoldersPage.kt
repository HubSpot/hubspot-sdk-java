// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageService.listFolders */
class LandingPageListFoldersPage
private constructor(
    private val service: LandingPageService,
    private val params: LandingPageListFoldersParams,
    private val response: CollectionResponseWithTotalContentFolderForwardPaging,
) : Page<ContentFolder> {

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.results
     */
    fun results(): List<ContentFolder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ContentFolder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): LandingPageListFoldersParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): LandingPageListFoldersPage = service.listFolders(nextPageParams())

    fun autoPager(): AutoPager<ContentFolder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListFoldersParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LandingPageListFoldersPage].
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

    /** A builder for [LandingPageListFoldersPage]. */
    class Builder internal constructor() {

        private var service: LandingPageService? = null
        private var params: LandingPageListFoldersParams? = null
        private var response: CollectionResponseWithTotalContentFolderForwardPaging? = null

        @JvmSynthetic
        internal fun from(landingPageListFoldersPage: LandingPageListFoldersPage) = apply {
            service = landingPageListFoldersPage.service
            params = landingPageListFoldersPage.params
            response = landingPageListFoldersPage.response
        }

        fun service(service: LandingPageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListFoldersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListFoldersPage].
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
        fun build(): LandingPageListFoldersPage =
            LandingPageListFoldersPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LandingPageListFoldersPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LandingPageListFoldersPage{service=$service, params=$params, response=$response}"
}
