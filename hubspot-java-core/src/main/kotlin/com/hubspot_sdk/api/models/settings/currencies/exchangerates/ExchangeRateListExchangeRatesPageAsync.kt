// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies.exchangerates

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseExchangeRateForwardPaging
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRate
import com.hubspot_sdk.api.services.async.settings.currencies.ExchangeRateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExchangeRateServiceAsync.listExchangeRates */
class ExchangeRateListExchangeRatesPageAsync
private constructor(
    private val service: ExchangeRateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExchangeRateListExchangeRatesParams,
    private val response: CollectionResponseExchangeRateForwardPaging,
) : PageAsync<ExchangeRate> {

    /**
     * Delegates to [CollectionResponseExchangeRateForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseExchangeRateForwardPaging.results
     */
    fun results(): List<ExchangeRate> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseExchangeRateForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseExchangeRateForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ExchangeRate> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ExchangeRateListExchangeRatesParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExchangeRateListExchangeRatesPageAsync> =
        service.listExchangeRates(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExchangeRate> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExchangeRateListExchangeRatesParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseExchangeRateForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExchangeRateListExchangeRatesPageAsync].
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

    /** A builder for [ExchangeRateListExchangeRatesPageAsync]. */
    class Builder internal constructor() {

        private var service: ExchangeRateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExchangeRateListExchangeRatesParams? = null
        private var response: CollectionResponseExchangeRateForwardPaging? = null

        @JvmSynthetic
        internal fun from(
            exchangeRateListExchangeRatesPageAsync: ExchangeRateListExchangeRatesPageAsync
        ) = apply {
            service = exchangeRateListExchangeRatesPageAsync.service
            streamHandlerExecutor = exchangeRateListExchangeRatesPageAsync.streamHandlerExecutor
            params = exchangeRateListExchangeRatesPageAsync.params
            response = exchangeRateListExchangeRatesPageAsync.response
        }

        fun service(service: ExchangeRateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExchangeRateListExchangeRatesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseExchangeRateForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExchangeRateListExchangeRatesPageAsync].
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
        fun build(): ExchangeRateListExchangeRatesPageAsync =
            ExchangeRateListExchangeRatesPageAsync(
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

        return other is ExchangeRateListExchangeRatesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExchangeRateListExchangeRatesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
