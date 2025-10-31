// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.events.EventDefinitionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EventDefinitionServiceAsync.list */
class EventDefinitionListPageAsync
private constructor(
    private val service: EventDefinitionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EventDefinitionListParams,
    private val response: EventDefinitionListPageResponse,
) : PageAsync<EventDefinitionListResponse> {

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

    override fun nextPage(): CompletableFuture<EventDefinitionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EventDefinitionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EventDefinitionListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventDefinitionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventDefinitionListPageAsync].
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

    /** A builder for [EventDefinitionListPageAsync]. */
    class Builder internal constructor() {

        private var service: EventDefinitionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EventDefinitionListParams? = null
        private var response: EventDefinitionListPageResponse? = null

        @JvmSynthetic
        internal fun from(eventDefinitionListPageAsync: EventDefinitionListPageAsync) = apply {
            service = eventDefinitionListPageAsync.service
            streamHandlerExecutor = eventDefinitionListPageAsync.streamHandlerExecutor
            params = eventDefinitionListPageAsync.params
            response = eventDefinitionListPageAsync.response
        }

        fun service(service: EventDefinitionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EventDefinitionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventDefinitionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventDefinitionListPageAsync].
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
        fun build(): EventDefinitionListPageAsync =
            EventDefinitionListPageAsync(
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

        return other is EventDefinitionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EventDefinitionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
