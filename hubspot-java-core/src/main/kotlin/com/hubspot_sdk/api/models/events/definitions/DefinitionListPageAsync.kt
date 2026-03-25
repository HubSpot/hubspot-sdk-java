// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.events.CollectionResponseWithTotalExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.models.events.ExternalBehavioralEventTypeDefinition
import com.hubspot_sdk.api.services.async.events.DefinitionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DefinitionServiceAsync.list */
class DefinitionListPageAsync
private constructor(
    private val service: DefinitionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DefinitionListParams,
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

    fun nextPageParams(): DefinitionListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DefinitionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalBehavioralEventTypeDefinition> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DefinitionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalBehavioralEventTypeDefinition = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DefinitionListPageAsync].
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

    /** A builder for [DefinitionListPageAsync]. */
    class Builder internal constructor() {

        private var service: DefinitionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DefinitionListParams? = null
        private var response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition? =
            null

        @JvmSynthetic
        internal fun from(definitionListPageAsync: DefinitionListPageAsync) = apply {
            service = definitionListPageAsync.service
            streamHandlerExecutor = definitionListPageAsync.streamHandlerExecutor
            params = definitionListPageAsync.params
            response = definitionListPageAsync.response
        }

        fun service(service: DefinitionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DefinitionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [DefinitionListPageAsync].
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
        fun build(): DefinitionListPageAsync =
            DefinitionListPageAsync(
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

        return other is DefinitionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DefinitionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
