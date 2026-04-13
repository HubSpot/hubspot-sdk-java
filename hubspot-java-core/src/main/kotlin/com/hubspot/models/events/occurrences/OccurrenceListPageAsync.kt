// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.occurrences

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.services.async.events.OccurrenceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see OccurrenceServiceAsync.list */
class OccurrenceListPageAsync
private constructor(
    private val service: OccurrenceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OccurrenceListParams,
    private val response: CollectionResponseExternalUnifiedEvent,
) : PageAsync<ExternalUnifiedEvent> {

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

    override fun nextPage(): CompletableFuture<OccurrenceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalUnifiedEvent> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OccurrenceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseExternalUnifiedEvent = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OccurrenceListPageAsync].
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

    /** A builder for [OccurrenceListPageAsync]. */
    class Builder internal constructor() {

        private var service: OccurrenceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OccurrenceListParams? = null
        private var response: CollectionResponseExternalUnifiedEvent? = null

        @JvmSynthetic
        internal fun from(occurrenceListPageAsync: OccurrenceListPageAsync) = apply {
            service = occurrenceListPageAsync.service
            streamHandlerExecutor = occurrenceListPageAsync.streamHandlerExecutor
            params = occurrenceListPageAsync.params
            response = occurrenceListPageAsync.response
        }

        fun service(service: OccurrenceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OccurrenceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseExternalUnifiedEvent) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OccurrenceListPageAsync].
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
        fun build(): OccurrenceListPageAsync =
            OccurrenceListPageAsync(
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

        return other is OccurrenceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OccurrenceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
