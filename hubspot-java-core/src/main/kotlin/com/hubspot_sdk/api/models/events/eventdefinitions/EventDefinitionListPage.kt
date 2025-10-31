// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.events.EventDefinitionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EventDefinitionService.list */
class EventDefinitionListPage
private constructor(
    private val service: EventDefinitionService,
    private val params: EventDefinitionListParams,
    private val response: EventDefinitionListPageResponse,
) : Page<EventDefinitionListResponse> {

    /**
     * Delegates to [EventDefinitionListPageResponse], but gracefully handles missing data.
     *
     * @see EventDefinitionListPageResponse.results
     */
    fun results(): List<EventDefinitionListResponse> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventDefinitionListPageResponse], but gracefully handles missing data.
     *
     * @see EventDefinitionListPageResponse.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<EventDefinitionListResponse> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): EventDefinitionListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): EventDefinitionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EventDefinitionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventDefinitionListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventDefinitionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventDefinitionListPage].
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

    /** A builder for [EventDefinitionListPage]. */
    class Builder internal constructor() {

        private var service: EventDefinitionService? = null
        private var params: EventDefinitionListParams? = null
        private var response: EventDefinitionListPageResponse? = null

        @JvmSynthetic
        internal fun from(eventDefinitionListPage: EventDefinitionListPage) = apply {
            service = eventDefinitionListPage.service
            params = eventDefinitionListPage.params
            response = eventDefinitionListPage.response
        }

        fun service(service: EventDefinitionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventDefinitionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventDefinitionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventDefinitionListPage].
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
        fun build(): EventDefinitionListPage =
            EventDefinitionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventDefinitionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EventDefinitionListPage{service=$service, params=$params, response=$response}"
}
