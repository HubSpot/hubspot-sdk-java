// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.participations

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.marketing.marketingevents.CollectionResponseWithTotalParticipationBreakdown
import com.hubspot.sdk.models.marketing.marketingevents.ParticipationBreakdown
import com.hubspot.sdk.services.blocking.marketing.marketingevents.ParticipationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ParticipationService.listBreakdownByExternalAccountAndEventId */
class ParticipationListBreakdownByExternalAccountAndEventIdPage
private constructor(
    private val service: ParticipationService,
    private val params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
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

    fun nextPageParams(): ParticipationListBreakdownByExternalAccountAndEventIdParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ParticipationListBreakdownByExternalAccountAndEventIdPage =
        service.listBreakdownByExternalAccountAndEventId(nextPageParams())

    fun autoPager(): AutoPager<ParticipationBreakdown> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ParticipationListBreakdownByExternalAccountAndEventIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalParticipationBreakdown = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipationListBreakdownByExternalAccountAndEventIdPage].
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

    /** A builder for [ParticipationListBreakdownByExternalAccountAndEventIdPage]. */
    class Builder internal constructor() {

        private var service: ParticipationService? = null
        private var params: ParticipationListBreakdownByExternalAccountAndEventIdParams? = null
        private var response: CollectionResponseWithTotalParticipationBreakdown? = null

        @JvmSynthetic
        internal fun from(
            participationListBreakdownByExternalAccountAndEventIdPage:
                ParticipationListBreakdownByExternalAccountAndEventIdPage
        ) = apply {
            service = participationListBreakdownByExternalAccountAndEventIdPage.service
            params = participationListBreakdownByExternalAccountAndEventIdPage.params
            response = participationListBreakdownByExternalAccountAndEventIdPage.response
        }

        fun service(service: ParticipationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ParticipationListBreakdownByExternalAccountAndEventIdParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalParticipationBreakdown) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of
         * [ParticipationListBreakdownByExternalAccountAndEventIdPage].
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
        fun build(): ParticipationListBreakdownByExternalAccountAndEventIdPage =
            ParticipationListBreakdownByExternalAccountAndEventIdPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationListBreakdownByExternalAccountAndEventIdPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ParticipationListBreakdownByExternalAccountAndEventIdPage{service=$service, params=$params, response=$response}"
}
