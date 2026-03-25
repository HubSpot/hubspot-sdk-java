// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.occurrences

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.blocking.events.OccurrenceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see OccurrenceService.list */
class OccurrenceListPage
private constructor(
    private val service: OccurrenceService,
    private val params: OccurrenceListParams,
    private val response: CollectionResponseExternalUnifiedEvent,
) : Page<ExternalUnifiedEvent> {

    /**
     * Delegates to [CollectionResponseExternalUnifiedEvent], but gracefully handles missing data.
     *
     * @see CollectionResponseExternalUnifiedEvent.results
     */
    fun results(): List<ExternalUnifiedEvent> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseExternalUnifiedEvent], but gracefully handles missing data.
     *
     * @see CollectionResponseExternalUnifiedEvent.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ExternalUnifiedEvent> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): OccurrenceListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): OccurrenceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalUnifiedEvent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OccurrenceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseExternalUnifiedEvent = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OccurrenceListPage].
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

    /** A builder for [OccurrenceListPage]. */
    class Builder internal constructor() {

        private var service: OccurrenceService? = null
        private var params: OccurrenceListParams? = null
        private var response: CollectionResponseExternalUnifiedEvent? = null

        @JvmSynthetic
        internal fun from(occurrenceListPage: OccurrenceListPage) = apply {
            service = occurrenceListPage.service
            params = occurrenceListPage.params
            response = occurrenceListPage.response
        }

        fun service(service: OccurrenceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OccurrenceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseExternalUnifiedEvent) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OccurrenceListPage].
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
        fun build(): OccurrenceListPage =
            OccurrenceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OccurrenceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OccurrenceListPage{service=$service, params=$params, response=$response}"
}
