// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.channels

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicChannel
import com.hubspot_sdk.api.services.async.conversations.ChannelServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ChannelServiceAsync.list */
class ChannelListPageAsync
private constructor(
    private val service: ChannelServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ChannelListParams,
    private val response: CollectionResponseWithTotalPublicChannelForwardPaging,
) : PageAsync<PublicChannel> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelForwardPaging.results
     */
    fun results(): List<PublicChannel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicChannel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ChannelListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ChannelListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicChannel> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ChannelListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicChannelForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelListPageAsync].
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

    /** A builder for [ChannelListPageAsync]. */
    class Builder internal constructor() {

        private var service: ChannelServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ChannelListParams? = null
        private var response: CollectionResponseWithTotalPublicChannelForwardPaging? = null

        @JvmSynthetic
        internal fun from(channelListPageAsync: ChannelListPageAsync) = apply {
            service = channelListPageAsync.service
            streamHandlerExecutor = channelListPageAsync.streamHandlerExecutor
            params = channelListPageAsync.params
            response = channelListPageAsync.response
        }

        fun service(service: ChannelServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicChannelForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ChannelListPageAsync].
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
        fun build(): ChannelListPageAsync =
            ChannelListPageAsync(
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

        return other is ChannelListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ChannelListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
