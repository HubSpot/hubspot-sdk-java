// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.marketing.EventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EventService.list */
class EventListPage
private constructor(
    private val service: EventService,
    private val params: EventListParams,
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

    fun nextPageParams(): EventListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): EventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MarketingEventPublicReadResponseV2> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventListPage].
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

    /** A builder for [EventListPage]. */
    class Builder internal constructor() {

        private var service: EventService? = null
        private var params: EventListParams? = null
        private var response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(eventListPage: EventListPage) = apply {
            service = eventListPage.service
            params = eventListPage.params
            response = eventListPage.response
        }

        fun service(service: EventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [EventListPage].
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
        fun build(): EventListPage =
            EventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "EventListPage{service=$service, params=$params, response=$response}"
}
