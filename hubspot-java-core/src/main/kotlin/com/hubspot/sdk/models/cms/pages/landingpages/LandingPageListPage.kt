// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.landingpages

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot.sdk.models.cms.pages.PageData
import com.hubspot.sdk.services.blocking.cms.pages.LandingPageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LandingPageService.list */
class LandingPageListPage
private constructor(
    private val service: LandingPageService,
    private val params: LandingPageListParams,
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

    fun nextPageParams(): LandingPageListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): LandingPageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PageData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LandingPageListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPageForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LandingPageListPage].
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

    /** A builder for [LandingPageListPage]. */
    class Builder internal constructor() {

        private var service: LandingPageService? = null
        private var params: LandingPageListParams? = null
        private var response: CollectionResponseWithTotalPageForwardPaging? = null

        @JvmSynthetic
        internal fun from(landingPageListPage: LandingPageListPage) = apply {
            service = landingPageListPage.service
            params = landingPageListPage.params
            response = landingPageListPage.response
        }

        fun service(service: LandingPageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LandingPageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPageForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LandingPageListPage].
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
        fun build(): LandingPageListPage =
            LandingPageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LandingPageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LandingPageListPage{service=$service, params=$params, response=$response}"
}
