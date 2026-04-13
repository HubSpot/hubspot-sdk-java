// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.services.async.conversations.CustomChannelServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CustomChannelServiceAsync.list */
class CustomChannelListPageAsync
private constructor(
    private val service: CustomChannelServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomChannelListParams,
    private val response: CollectionResponseWithTotalPublicChannelIntegrationChannel,
) : PageAsync<PublicChannelIntegrationChannel> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelIntegrationChannel], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelIntegrationChannel.results
     */
    fun results(): List<PublicChannelIntegrationChannel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelIntegrationChannel], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelIntegrationChannel.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PublicChannelIntegrationChannel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): CustomChannelListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomChannelListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicChannelIntegrationChannel> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomChannelListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicChannelIntegrationChannel = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomChannelListPageAsync].
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

    /** A builder for [CustomChannelListPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomChannelServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomChannelListParams? = null
        private var response: CollectionResponseWithTotalPublicChannelIntegrationChannel? = null

        @JvmSynthetic
        internal fun from(customChannelListPageAsync: CustomChannelListPageAsync) = apply {
            service = customChannelListPageAsync.service
            streamHandlerExecutor = customChannelListPageAsync.streamHandlerExecutor
            params = customChannelListPageAsync.params
            response = customChannelListPageAsync.response
        }

        fun service(service: CustomChannelServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomChannelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicChannelIntegrationChannel) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomChannelListPageAsync].
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
        fun build(): CustomChannelListPageAsync =
            CustomChannelListPageAsync(
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

        return other is CustomChannelListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomChannelListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
