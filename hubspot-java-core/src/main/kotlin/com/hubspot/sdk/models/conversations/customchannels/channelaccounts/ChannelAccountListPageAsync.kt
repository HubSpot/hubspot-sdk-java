// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels.channelaccounts

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.conversations.customchannels.CollectionResponseWithTotalPublicChannelAccount
import com.hubspot.sdk.models.conversations.customchannels.PublicChannelAccount
import com.hubspot.sdk.services.async.conversations.customchannels.ChannelAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ChannelAccountServiceAsync.list */
class ChannelAccountListPageAsync
private constructor(
    private val service: ChannelAccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ChannelAccountListParams,
    private val response: CollectionResponseWithTotalPublicChannelAccount,
) : PageAsync<PublicChannelAccount> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelAccount], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelAccount.results
     */
    fun results(): List<PublicChannelAccount> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelAccount], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelAccount.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PublicChannelAccount> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ChannelAccountListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ChannelAccountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicChannelAccount> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ChannelAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicChannelAccount = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelAccountListPageAsync].
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

    /** A builder for [ChannelAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: ChannelAccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ChannelAccountListParams? = null
        private var response: CollectionResponseWithTotalPublicChannelAccount? = null

        @JvmSynthetic
        internal fun from(channelAccountListPageAsync: ChannelAccountListPageAsync) = apply {
            service = channelAccountListPageAsync.service
            streamHandlerExecutor = channelAccountListPageAsync.streamHandlerExecutor
            params = channelAccountListPageAsync.params
            response = channelAccountListPageAsync.response
        }

        fun service(service: ChannelAccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicChannelAccount) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ChannelAccountListPageAsync].
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
        fun build(): ChannelAccountListPageAsync =
            ChannelAccountListPageAsync(
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

        return other is ChannelAccountListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ChannelAccountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
