// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.services.async.marketing.MarketingEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MarketingEventServiceAsync.list */
class MarketingEventListPageAsync
private constructor(
    private val service: MarketingEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MarketingEventListParams,
    private val response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging,
) : PageAsync<MarketingEventPublicReadResponseV2> {

    /**
     * Delegates to [CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging.results
     */
    fun results(): List<MarketingEventPublicReadResponseV2> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<MarketingEventPublicReadResponseV2> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): MarketingEventListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MarketingEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MarketingEventPublicReadResponseV2> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MarketingEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MarketingEventListPageAsync].
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

    /** A builder for [MarketingEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: MarketingEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MarketingEventListParams? = null
        private var response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(marketingEventListPageAsync: MarketingEventListPageAsync) = apply {
            service = marketingEventListPageAsync.service
            streamHandlerExecutor = marketingEventListPageAsync.streamHandlerExecutor
            params = marketingEventListPageAsync.params
            response = marketingEventListPageAsync.response
        }

        fun service(service: MarketingEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MarketingEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [MarketingEventListPageAsync].
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
        fun build(): MarketingEventListPageAsync =
            MarketingEventListPageAsync(
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

        return other is MarketingEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MarketingEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
