// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.async.events.SendServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SendServiceAsync.listEventDefinitions */
class SendListEventDefinitionsPageAsync
private constructor(
    private val service: SendServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SendListEventDefinitionsParams,
    private val response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition,
) : PageAsync<ExternalBehavioralEventTypeDefinition> {

    /**
     * Delegates to [CollectionResponseWithTotalExternalBehavioralEventTypeDefinition], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalExternalBehavioralEventTypeDefinition.results
     */
    fun results(): List<ExternalBehavioralEventTypeDefinition> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalExternalBehavioralEventTypeDefinition], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalExternalBehavioralEventTypeDefinition.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ExternalBehavioralEventTypeDefinition> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SendListEventDefinitionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SendListEventDefinitionsPageAsync> =
        service.listEventDefinitions(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalBehavioralEventTypeDefinition> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SendListEventDefinitionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalBehavioralEventTypeDefinition = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SendListEventDefinitionsPageAsync].
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

    /** A builder for [SendListEventDefinitionsPageAsync]. */
    class Builder internal constructor() {

        private var service: SendServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SendListEventDefinitionsParams? = null
        private var response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition? =
            null

        @JvmSynthetic
        internal fun from(sendListEventDefinitionsPageAsync: SendListEventDefinitionsPageAsync) =
            apply {
                service = sendListEventDefinitionsPageAsync.service
                streamHandlerExecutor = sendListEventDefinitionsPageAsync.streamHandlerExecutor
                params = sendListEventDefinitionsPageAsync.params
                response = sendListEventDefinitionsPageAsync.response
            }

        fun service(service: SendServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SendListEventDefinitionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [SendListEventDefinitionsPageAsync].
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
        fun build(): SendListEventDefinitionsPageAsync =
            SendListEventDefinitionsPageAsync(
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

        return other is SendListEventDefinitionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SendListEventDefinitionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
