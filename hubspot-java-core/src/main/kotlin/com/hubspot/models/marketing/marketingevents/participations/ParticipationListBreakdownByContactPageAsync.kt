// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents.participations

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.models.marketing.marketingevents.CollectionResponseWithTotalParticipationBreakdown
import com.hubspot.models.marketing.marketingevents.ParticipationBreakdown
import com.hubspot.services.async.marketing.marketingevents.ParticipationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ParticipationServiceAsync.listBreakdownByContact */
class ParticipationListBreakdownByContactPageAsync
private constructor(
    private val service: ParticipationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ParticipationListBreakdownByContactParams,
    private val response: CollectionResponseWithTotalParticipationBreakdown,
) : PageAsync<ParticipationBreakdown> {

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

    override fun nextPage(): CompletableFuture<ParticipationListBreakdownByContactPageAsync> =
        service.listBreakdownByContact(nextPageParams())

    fun autoPager(): AutoPagerAsync<ParticipationBreakdown> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ParticipationListBreakdownByContactParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalParticipationBreakdown = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipationListBreakdownByContactPageAsync].
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

    /** A builder for [ParticipationListBreakdownByContactPageAsync]. */
    class Builder internal constructor() {

        private var service: ParticipationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ParticipationListBreakdownByContactParams? = null
        private var response: CollectionResponseWithTotalParticipationBreakdown? = null

        @JvmSynthetic
        internal fun from(
            participationListBreakdownByContactPageAsync:
                ParticipationListBreakdownByContactPageAsync
        ) = apply {
            service = participationListBreakdownByContactPageAsync.service
            streamHandlerExecutor =
                participationListBreakdownByContactPageAsync.streamHandlerExecutor
            params = participationListBreakdownByContactPageAsync.params
            response = participationListBreakdownByContactPageAsync.response
        }

        fun service(service: ParticipationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ParticipationListBreakdownByContactParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalParticipationBreakdown) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ParticipationListBreakdownByContactPageAsync].
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
        fun build(): ParticipationListBreakdownByContactPageAsync =
            ParticipationListBreakdownByContactPageAsync(
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

        return other is ParticipationListBreakdownByContactPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ParticipationListBreakdownByContactPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
