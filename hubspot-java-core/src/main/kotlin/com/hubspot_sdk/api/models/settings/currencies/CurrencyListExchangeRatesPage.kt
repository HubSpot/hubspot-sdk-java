// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.settings.CurrencyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CurrencyService.listExchangeRates */
class CurrencyListExchangeRatesPage
private constructor(
    private val service: CurrencyService,
    private val params: CurrencyListExchangeRatesParams,
    private val response: CollectionResponseExchangeRateForwardPaging,
) : Page<ExchangeRate> {

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

    fun nextPageParams(): CurrencyListExchangeRatesParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CurrencyListExchangeRatesPage =
        service.listExchangeRates(nextPageParams())

    fun autoPager(): AutoPager<ExchangeRate> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CurrencyListExchangeRatesParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseExchangeRateForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CurrencyListExchangeRatesPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyListExchangeRatesPage]. */
    class Builder internal constructor() {

        private var service: CurrencyService? = null
        private var params: CurrencyListExchangeRatesParams? = null
        private var response: CollectionResponseExchangeRateForwardPaging? = null

        @JvmSynthetic
        internal fun from(currencyListExchangeRatesPage: CurrencyListExchangeRatesPage) = apply {
            service = currencyListExchangeRatesPage.service
            params = currencyListExchangeRatesPage.params
            response = currencyListExchangeRatesPage.response
        }

        fun service(service: CurrencyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CurrencyListExchangeRatesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseExchangeRateForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CurrencyListExchangeRatesPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrencyListExchangeRatesPage =
            CurrencyListExchangeRatesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrencyListExchangeRatesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CurrencyListExchangeRatesPage{service=$service, params=$params, response=$response}"
}
