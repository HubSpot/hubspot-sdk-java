// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events.participations

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalParticipationBreakdown
import com.hubspot_sdk.api.models.marketing.events.ParticipationBreakdown
import com.hubspot_sdk.api.services.async.marketing.events.ParticipationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ParticipationServiceAsync.listBreakdownByExternalAccountAndEventId */
class ParticipationListBreakdownByExternalAccountAndEventIdPageAsync
private constructor(
    private val service: ParticipationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
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

    fun nextPageParams(): ParticipationListBreakdownByExternalAccountAndEventIdParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage():
        CompletableFuture<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync> =
        service.listBreakdownByExternalAccountAndEventId(nextPageParams())

    fun autoPager(): AutoPagerAsync<ParticipationBreakdown> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ParticipationListBreakdownByExternalAccountAndEventIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalParticipationBreakdown = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ParticipationListBreakdownByExternalAccountAndEventIdPageAsync].
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

    /** A builder for [ParticipationListBreakdownByExternalAccountAndEventIdPageAsync]. */
    class Builder internal constructor() {

        private var service: ParticipationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ParticipationListBreakdownByExternalAccountAndEventIdParams? = null
        private var response: CollectionResponseWithTotalParticipationBreakdown? = null

        @JvmSynthetic
        internal fun from(
            participationListBreakdownByExternalAccountAndEventIdPageAsync:
                ParticipationListBreakdownByExternalAccountAndEventIdPageAsync
        ) = apply {
            service = participationListBreakdownByExternalAccountAndEventIdPageAsync.service
            streamHandlerExecutor =
                participationListBreakdownByExternalAccountAndEventIdPageAsync.streamHandlerExecutor
            params = participationListBreakdownByExternalAccountAndEventIdPageAsync.params
            response = participationListBreakdownByExternalAccountAndEventIdPageAsync.response
        }

        fun service(service: ParticipationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * [ParticipationListBreakdownByExternalAccountAndEventIdPageAsync].
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
        fun build(): ParticipationListBreakdownByExternalAccountAndEventIdPageAsync =
            ParticipationListBreakdownByExternalAccountAndEventIdPageAsync(
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

        return other is ParticipationListBreakdownByExternalAccountAndEventIdPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ParticipationListBreakdownByExternalAccountAndEventIdPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
