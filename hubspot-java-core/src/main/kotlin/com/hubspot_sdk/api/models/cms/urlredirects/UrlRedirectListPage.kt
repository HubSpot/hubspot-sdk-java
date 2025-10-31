// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.cms.UrlRedirectService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see UrlRedirectService.list */
class UrlRedirectListPage
private constructor(
    private val service: UrlRedirectService,
    private val params: UrlRedirectListParams,
    private val response: UrlRedirectListPageResponse,
) : Page<UrlRedirectListResponse> {

    /**
     * Delegates to [UrlRedirectListPageResponse], but gracefully handles missing data.
     *
     * @see UrlRedirectListPageResponse.results
     */
    fun results(): List<UrlRedirectListResponse> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [UrlRedirectListPageResponse], but gracefully handles missing data.
     *
     * @see UrlRedirectListPageResponse.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<UrlRedirectListResponse> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): UrlRedirectListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): UrlRedirectListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<UrlRedirectListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UrlRedirectListParams = params

    /** The response that this page was parsed from. */
    fun response(): UrlRedirectListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UrlRedirectListPage].
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

    /** A builder for [UrlRedirectListPage]. */
    class Builder internal constructor() {

        private var service: UrlRedirectService? = null
        private var params: UrlRedirectListParams? = null
        private var response: UrlRedirectListPageResponse? = null

        @JvmSynthetic
        internal fun from(urlRedirectListPage: UrlRedirectListPage) = apply {
            service = urlRedirectListPage.service
            params = urlRedirectListPage.params
            response = urlRedirectListPage.response
        }

        fun service(service: UrlRedirectService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UrlRedirectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UrlRedirectListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UrlRedirectListPage].
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
        fun build(): UrlRedirectListPage =
            UrlRedirectListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlRedirectListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UrlRedirectListPage{service=$service, params=$params, response=$response}"
}
