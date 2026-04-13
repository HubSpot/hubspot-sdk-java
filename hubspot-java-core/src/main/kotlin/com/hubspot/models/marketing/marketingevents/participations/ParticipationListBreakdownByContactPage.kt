// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents.participations

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.models.marketing.marketingevents.CollectionResponseWithTotalParticipationBreakdown
import com.hubspot.models.marketing.marketingevents.ParticipationBreakdown
import com.hubspot.services.blocking.marketing.marketingevents.ParticipationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ParticipationService.listBreakdownByContact */
class ParticipationListBreakdownByContactPage
private constructor(
    private val service: ParticipationService,
    private val params: ParticipationListBreakdownByContactParams,
    private val response: CollectionResponseWithTotalParticipationBreakdown,
) : Page<ParticipationBreakdown> {

    /**
     * Delegates to [CollectionResponseWithTotalParticipationBreakdown], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalParticipationBreakdown.results
     */
    fun results(): List<ParticipationBreakdown> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalParticipationBreakdown], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalParticipationBreakdown.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ParticipationBreakdown> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ParticipationListBreakdownByContactParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ParticipationListBreakdownByContactPage =
        service.listBreakdownByContact(nextPageParams())

    fun autoPager(): AutoPager<ParticipationBreakdown> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ParticipationListBreakdownByContactParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalParticipationBreakdown = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipationListBreakdownByContactPage].
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

    /** A builder for [ParticipationListBreakdownByContactPage]. */
    class Builder internal constructor() {

        private var service: ParticipationService? = null
        private var params: ParticipationListBreakdownByContactParams? = null
        private var response: CollectionResponseWithTotalParticipationBreakdown? = null

        @JvmSynthetic
        internal fun from(
            participationListBreakdownByContactPage: ParticipationListBreakdownByContactPage
        ) = apply {
            service = participationListBreakdownByContactPage.service
            params = participationListBreakdownByContactPage.params
            response = participationListBreakdownByContactPage.response
        }

        fun service(service: ParticipationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ParticipationListBreakdownByContactParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalParticipationBreakdown) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ParticipationListBreakdownByContactPage].
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
        fun build(): ParticipationListBreakdownByContactPage =
            ParticipationListBreakdownByContactPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationListBreakdownByContactPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ParticipationListBreakdownByContactPage{service=$service, params=$params, response=$response}"
}
