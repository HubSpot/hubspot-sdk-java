// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events.participations

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalParticipationBreakdownForwardPaging
import com.hubspot_sdk.api.models.marketing.events.ParticipationBreakdown
import com.hubspot_sdk.api.services.blocking.marketing.events.ParticipationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ParticipationService.listBreakdownById */
class ParticipationListBreakdownByIdPage
private constructor(
    private val service: ParticipationService,
    private val params: ParticipationListBreakdownByIdParams,
    private val response: CollectionResponseWithTotalParticipationBreakdownForwardPaging,
) : Page<ParticipationBreakdown> {

    /**
     * Delegates to [CollectionResponseWithTotalParticipationBreakdownForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalParticipationBreakdownForwardPaging.results
     */
    fun results(): List<ParticipationBreakdown> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalParticipationBreakdownForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalParticipationBreakdownForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ParticipationBreakdown> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ParticipationListBreakdownByIdParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ParticipationListBreakdownByIdPage =
        service.listBreakdownById(nextPageParams())

    fun autoPager(): AutoPager<ParticipationBreakdown> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ParticipationListBreakdownByIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalParticipationBreakdownForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipationListBreakdownByIdPage].
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

    /** A builder for [ParticipationListBreakdownByIdPage]. */
    class Builder internal constructor() {

        private var service: ParticipationService? = null
        private var params: ParticipationListBreakdownByIdParams? = null
        private var response: CollectionResponseWithTotalParticipationBreakdownForwardPaging? = null

        @JvmSynthetic
        internal fun from(participationListBreakdownByIdPage: ParticipationListBreakdownByIdPage) =
            apply {
                service = participationListBreakdownByIdPage.service
                params = participationListBreakdownByIdPage.params
                response = participationListBreakdownByIdPage.response
            }

        fun service(service: ParticipationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ParticipationListBreakdownByIdParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalParticipationBreakdownForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [ParticipationListBreakdownByIdPage].
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
        fun build(): ParticipationListBreakdownByIdPage =
            ParticipationListBreakdownByIdPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationListBreakdownByIdPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ParticipationListBreakdownByIdPage{service=$service, params=$params, response=$response}"
}
