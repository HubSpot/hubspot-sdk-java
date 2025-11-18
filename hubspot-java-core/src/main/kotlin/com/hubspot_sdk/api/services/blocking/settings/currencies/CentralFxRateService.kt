// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings.currencies

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.settings.currencies.CentralExchangeRatesInformation
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot_sdk.api.models.settings.currencies.CurrencyCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRate
import com.hubspot_sdk.api.models.settings.currencies.centralfxrates.CentralFxRateCreateCurrencyParams
import com.hubspot_sdk.api.models.settings.currencies.centralfxrates.CentralFxRateGetInformationParams
import com.hubspot_sdk.api.models.settings.currencies.centralfxrates.CentralFxRateGetUnsupportedCurrenciesParams
import java.util.function.Consumer

interface CentralFxRateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CentralFxRateService

    /**
     * Create a new currency with central exchange rates in the portal. Unsupported currencies
     * cannot be added here.
     */
    fun createCurrency(params: CentralFxRateCreateCurrencyParams): ExchangeRate =
        createCurrency(params, RequestOptions.none())

    /** @see createCurrency */
    fun createCurrency(
        params: CentralFxRateCreateCurrencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate

    /** @see createCurrency */
    fun createCurrency(
        currencyCreateRequest: CurrencyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate =
        createCurrency(
            CentralFxRateCreateCurrencyParams.builder()
                .currencyCreateRequest(currencyCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createCurrency */
    fun createCurrency(currencyCreateRequest: CurrencyCreateRequest): ExchangeRate =
        createCurrency(currencyCreateRequest, RequestOptions.none())

    /** Retrieve details on whether the central exchange rates feature is enabled for the portal. */
    fun getInformation(): CentralExchangeRatesInformation =
        getInformation(CentralFxRateGetInformationParams.none())

    /** @see getInformation */
    fun getInformation(
        params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CentralExchangeRatesInformation

    /** @see getInformation */
    fun getInformation(
        params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none()
    ): CentralExchangeRatesInformation = getInformation(params, RequestOptions.none())

    /** @see getInformation */
    fun getInformation(requestOptions: RequestOptions): CentralExchangeRatesInformation =
        getInformation(CentralFxRateGetInformationParams.none(), requestOptions)

    /**
     * Retrieve a list of currency codes that are not supported by the central exchange rates.
     * Unsupported currencies will need to be manually updated.
     */
    fun getUnsupportedCurrencies(): CollectionResponseCurrencyCodeInfoNoPaging =
        getUnsupportedCurrencies(CentralFxRateGetUnsupportedCurrenciesParams.none())

    /** @see getUnsupportedCurrencies */
    fun getUnsupportedCurrencies(
        params: CentralFxRateGetUnsupportedCurrenciesParams =
            CentralFxRateGetUnsupportedCurrenciesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseCurrencyCodeInfoNoPaging

    /** @see getUnsupportedCurrencies */
    fun getUnsupportedCurrencies(
        params: CentralFxRateGetUnsupportedCurrenciesParams =
            CentralFxRateGetUnsupportedCurrenciesParams.none()
    ): CollectionResponseCurrencyCodeInfoNoPaging =
        getUnsupportedCurrencies(params, RequestOptions.none())

    /** @see getUnsupportedCurrencies */
    fun getUnsupportedCurrencies(
        requestOptions: RequestOptions
    ): CollectionResponseCurrencyCodeInfoNoPaging =
        getUnsupportedCurrencies(CentralFxRateGetUnsupportedCurrenciesParams.none(), requestOptions)

    /**
     * A view of [CentralFxRateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CentralFxRateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /settings/v3/currencies/central-fx-rates/add-currency`, but is otherwise the same as
         * [CentralFxRateService.createCurrency].
         */
        @MustBeClosed
        fun createCurrency(
            params: CentralFxRateCreateCurrencyParams
        ): HttpResponseFor<ExchangeRate> = createCurrency(params, RequestOptions.none())

        /** @see createCurrency */
        @MustBeClosed
        fun createCurrency(
            params: CentralFxRateCreateCurrencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate>

        /** @see createCurrency */
        @MustBeClosed
        fun createCurrency(
            currencyCreateRequest: CurrencyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate> =
            createCurrency(
                CentralFxRateCreateCurrencyParams.builder()
                    .currencyCreateRequest(currencyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createCurrency */
        @MustBeClosed
        fun createCurrency(
            currencyCreateRequest: CurrencyCreateRequest
        ): HttpResponseFor<ExchangeRate> =
            createCurrency(currencyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /settings/v3/currencies/central-fx-rates/information`, but is otherwise the same as
         * [CentralFxRateService.getInformation].
         */
        @MustBeClosed
        fun getInformation(): HttpResponseFor<CentralExchangeRatesInformation> =
            getInformation(CentralFxRateGetInformationParams.none())

        /** @see getInformation */
        @MustBeClosed
        fun getInformation(
            params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CentralExchangeRatesInformation>

        /** @see getInformation */
        @MustBeClosed
        fun getInformation(
            params: CentralFxRateGetInformationParams = CentralFxRateGetInformationParams.none()
        ): HttpResponseFor<CentralExchangeRatesInformation> =
            getInformation(params, RequestOptions.none())

        /** @see getInformation */
        @MustBeClosed
        fun getInformation(
            requestOptions: RequestOptions
        ): HttpResponseFor<CentralExchangeRatesInformation> =
            getInformation(CentralFxRateGetInformationParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /settings/v3/currencies/central-fx-rates/unsupported-currencies`, but is otherwise the
         * same as [CentralFxRateService.getUnsupportedCurrencies].
         */
        @MustBeClosed
        fun getUnsupportedCurrencies():
            HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> =
            getUnsupportedCurrencies(CentralFxRateGetUnsupportedCurrenciesParams.none())

        /** @see getUnsupportedCurrencies */
        @MustBeClosed
        fun getUnsupportedCurrencies(
            params: CentralFxRateGetUnsupportedCurrenciesParams =
                CentralFxRateGetUnsupportedCurrenciesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>

        /** @see getUnsupportedCurrencies */
        @MustBeClosed
        fun getUnsupportedCurrencies(
            params: CentralFxRateGetUnsupportedCurrenciesParams =
                CentralFxRateGetUnsupportedCurrenciesParams.none()
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> =
            getUnsupportedCurrencies(params, RequestOptions.none())

        /** @see getUnsupportedCurrencies */
        @MustBeClosed
        fun getUnsupportedCurrencies(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> =
            getUnsupportedCurrencies(
                CentralFxRateGetUnsupportedCurrenciesParams.none(),
                requestOptions,
            )
    }
}
