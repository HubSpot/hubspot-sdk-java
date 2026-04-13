// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.currencies.exchangerates

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.settings.currencies.CollectionResponseExchangeRateForwardPaging
import com.hubspot.models.settings.currencies.ExchangeRate
import com.hubspot.services.blocking.settings.currencies.ExchangeRateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExchangeRateService.listExchangeRates */
class ExchangeRateListExchangeRatesPage
private constructor(
    private val service: ExchangeRateService,
    private val params: ExchangeRateListExchangeRatesParams,
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

    fun nextPageParams(): ExchangeRateListExchangeRatesParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ExchangeRateListExchangeRatesPage =
        service.listExchangeRates(nextPageParams())

    fun autoPager(): AutoPager<ExchangeRate> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExchangeRateListExchangeRatesParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseExchangeRateForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExchangeRateListExchangeRatesPage].
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

    /** A builder for [ExchangeRateListExchangeRatesPage]. */
    class Builder internal constructor() {

        private var service: ExchangeRateService? = null
        private var params: ExchangeRateListExchangeRatesParams? = null
        private var response: CollectionResponseExchangeRateForwardPaging? = null

        @JvmSynthetic
        internal fun from(exchangeRateListExchangeRatesPage: ExchangeRateListExchangeRatesPage) =
            apply {
                service = exchangeRateListExchangeRatesPage.service
                params = exchangeRateListExchangeRatesPage.params
                response = exchangeRateListExchangeRatesPage.response
            }

        fun service(service: ExchangeRateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExchangeRateListExchangeRatesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseExchangeRateForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExchangeRateListExchangeRatesPage].
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
        fun build(): ExchangeRateListExchangeRatesPage =
            ExchangeRateListExchangeRatesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExchangeRateListExchangeRatesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExchangeRateListExchangeRatesPage{service=$service, params=$params, response=$response}"
}
