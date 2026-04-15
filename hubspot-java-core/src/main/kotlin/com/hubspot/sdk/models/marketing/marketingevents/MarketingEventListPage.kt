// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.services.blocking.marketing.MarketingEventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MarketingEventService.list */
class MarketingEventListPage
private constructor(
    private val service: MarketingEventService,
    private val params: MarketingEventListParams,
    private val response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging,
) : Page<MarketingEventPublicReadResponseV2> {

    /**
     * Delegates to [CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging.results
     */
    fun results(): List<MarketingEventPublicReadResponseV2> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<MarketingEventPublicReadResponseV2> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): MarketingEventListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): MarketingEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MarketingEventPublicReadResponseV2> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MarketingEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MarketingEventListPage].
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

    /** A builder for [MarketingEventListPage]. */
    class Builder internal constructor() {

        private var service: MarketingEventService? = null
        private var params: MarketingEventListParams? = null
        private var response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(marketingEventListPage: MarketingEventListPage) = apply {
            service = marketingEventListPage.service
            params = marketingEventListPage.params
            response = marketingEventListPage.response
        }

        fun service(service: MarketingEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MarketingEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [MarketingEventListPage].
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
        fun build(): MarketingEventListPage =
            MarketingEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MarketingEventListPage{service=$service, params=$params, response=$response}"
}
