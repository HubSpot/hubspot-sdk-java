// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.settings.currencies

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.settings.currencies.CentralExchangeRatesInformation
import com.hubspot.sdk.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot.sdk.models.settings.currencies.CurrencyCreateRequest
import com.hubspot.sdk.models.settings.currencies.ExchangeRate
import com.hubspot.sdk.models.settings.currencies.centralfxrates.CentralFxRateCreateCurrencyParams
import com.hubspot.sdk.models.settings.currencies.centralfxrates.CentralFxRateGetInformationParams
import com.hubspot.sdk.models.settings.currencies.centralfxrates.CentralFxRateGetUnsupportedCurrenciesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CentralFxRateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CentralFxRateServiceAsync

    /**
     * Create a new currency with central exchange rates in the portal. Unsupported currencies
     * cannot be added here.
     */
    fun createCurrency(params: CentralFxRateCreateCurrencyParams): CompletableFuture<ExchangeRate> =
        createCurrency(params, RequestOptions.none())

    /** @see createCurrency */
    fun createCurrency(
        params: CentralFxRateCreateCurrencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate>

    /** @see createCurrency */
    fun createCurrency(
        currencyCreateRequest: CurrencyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate> =
        createCurrency(
            CentralFxRateCreateCurrencyParams.builder()
                .currencyCreateRequest(currencyCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createCurrency */
    fun createCurrency(
        currencyCreateRequest: CurrencyCreateRequest
    ): CompletableFuture<ExchangeRate> =
        createCurrency(currencyCreateRequest, RequestOptions.none())

    /** Retrieve details on whether the central exchange rates feature is enabled for the portal. */
    fun getInformation(): CompletableFuture<CentralExchangeRatesInformation> =
        getInformation(CentralFxRateGetInformationParams.none())

    /** @see getInformation */
    fun getInformation(
        params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CentralExchangeRatesInformation>

    /** @see getInformation */
    fun getInformation(
        params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none()
    ): CompletableFuture<CentralExchangeRatesInformation> =
        getInformation(params, RequestOptions.none())

    /** @see getInformation */
    fun getInformation(
        requestOptions: RequestOptions
    ): CompletableFuture<CentralExchangeRatesInformation> =
        getInformation(CentralFxRateGetInformationParams.none(), requestOptions)

    /**
     * Retrieve a list of currency codes that are not supported by the central exchange rates.
     * Unsupported currencies will need to be manually updated.
     */
    fun getUnsupportedCurrencies(): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        getUnsupportedCurrencies(CentralFxRateGetUnsupportedCurrenciesParams.none())

    /** @see getUnsupportedCurrencies */
    fun getUnsupportedCurrencies(
        params: CentralFxRateGetUnsupportedCurrenciesParams =
            CentralFxRateGetUnsupportedCurrenciesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging>

    /** @see getUnsupportedCurrencies */
    fun getUnsupportedCurrencies(
        params: CentralFxRateGetUnsupportedCurrenciesParams =
            CentralFxRateGetUnsupportedCurrenciesParams.none()
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        getUnsupportedCurrencies(params, RequestOptions.none())

    /** @see getUnsupportedCurrencies */
    fun getUnsupportedCurrencies(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        getUnsupportedCurrencies(CentralFxRateGetUnsupportedCurrenciesParams.none(), requestOptions)

    /**
     * A view of [CentralFxRateServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CentralFxRateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/central-fx-rates/add-currency`, but is otherwise the same as
         * [CentralFxRateServiceAsync.createCurrency].
         */
        fun createCurrency(
            params: CentralFxRateCreateCurrencyParams
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createCurrency(params, RequestOptions.none())

        /** @see createCurrency */
        fun createCurrency(
            params: CentralFxRateCreateCurrencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>>

        /** @see createCurrency */
        fun createCurrency(
            currencyCreateRequest: CurrencyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createCurrency(
                CentralFxRateCreateCurrencyParams.builder()
                    .currencyCreateRequest(currencyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createCurrency */
        fun createCurrency(
            currencyCreateRequest: CurrencyCreateRequest
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createCurrency(currencyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /settings/currencies/2026-03/central-fx-rates/information`, but is otherwise the same as
         * [CentralFxRateServiceAsync.getInformation].
         */
        fun getInformation(): CompletableFuture<HttpResponseFor<CentralExchangeRatesInformation>> =
            getInformation(CentralFxRateGetInformationParams.none())

        /** @see getInformation */
        fun getInformation(
            params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CentralExchangeRatesInformation>>

        /** @see getInformation */
        fun getInformation(
            params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none()
        ): CompletableFuture<HttpResponseFor<CentralExchangeRatesInformation>> =
            getInformation(params, RequestOptions.none())

        /** @see getInformation */
        fun getInformation(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CentralExchangeRatesInformation>> =
            getInformation(CentralFxRateGetInformationParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /settings/currencies/2026-03/central-fx-rates/unsupported-currencies`, but is otherwise
         * the same as [CentralFxRateServiceAsync.getUnsupportedCurrencies].
         */
        fun getUnsupportedCurrencies():
            CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> =
            getUnsupportedCurrencies(CentralFxRateGetUnsupportedCurrenciesParams.none())

        /** @see getUnsupportedCurrencies */
        fun getUnsupportedCurrencies(
            params: CentralFxRateGetUnsupportedCurrenciesParams =
                CentralFxRateGetUnsupportedCurrenciesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>>

        /** @see getUnsupportedCurrencies */
        fun getUnsupportedCurrencies(
            params: CentralFxRateGetUnsupportedCurrenciesParams =
                CentralFxRateGetUnsupportedCurrenciesParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> =
            getUnsupportedCurrencies(params, RequestOptions.none())

        /** @see getUnsupportedCurrencies */
        fun getUnsupportedCurrencies(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> =
            getUnsupportedCurrencies(
                CentralFxRateGetUnsupportedCurrenciesParams.none(),
                requestOptions,
            )
    }
}
