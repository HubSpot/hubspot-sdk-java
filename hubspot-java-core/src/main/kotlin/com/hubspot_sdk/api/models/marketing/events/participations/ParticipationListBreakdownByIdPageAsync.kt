// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events.participations

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalParticipationBreakdownForwardPaging
import com.hubspot_sdk.api.models.marketing.events.ParticipationBreakdown
import com.hubspot_sdk.api.services.async.marketing.events.ParticipationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ParticipationServiceAsync.listBreakdownById */
class ParticipationListBreakdownByIdPageAsync
private constructor(
    private val service: ParticipationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ParticipationListBreakdownByIdParams,
    private val response: CollectionResponseWithTotalParticipationBreakdownForwardPaging,
) : PageAsync<ParticipationBreakdown> {

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

    override fun nextPage(): CompletableFuture<ParticipationListBreakdownByIdPageAsync> =
        service.listBreakdownById(nextPageParams())

    fun autoPager(): AutoPagerAsync<ParticipationBreakdown> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ParticipationListBreakdownByIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalParticipationBreakdownForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipationListBreakdownByIdPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ParticipationListBreakdownByIdPageAsync]. */
    class Builder internal constructor() {

        private var service: ParticipationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ParticipationListBreakdownByIdParams? = null
        private var response: CollectionResponseWithTotalParticipationBreakdownForwardPaging? = null

        @JvmSynthetic
        internal fun from(
            participationListBreakdownByIdPageAsync: ParticipationListBreakdownByIdPageAsync
        ) = apply {
            service = participationListBreakdownByIdPageAsync.service
            streamHandlerExecutor = participationListBreakdownByIdPageAsync.streamHandlerExecutor
            params = participationListBreakdownByIdPageAsync.params
            response = participationListBreakdownByIdPageAsync.response
        }

        fun service(service: ParticipationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ParticipationListBreakdownByIdParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalParticipationBreakdownForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [ParticipationListBreakdownByIdPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ParticipationListBreakdownByIdPageAsync =
            ParticipationListBreakdownByIdPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParticipationListBreakdownByIdPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ParticipationListBreakdownByIdPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
