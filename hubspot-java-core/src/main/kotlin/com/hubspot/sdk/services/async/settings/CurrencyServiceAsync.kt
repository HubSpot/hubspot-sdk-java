// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.settings

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot.sdk.models.settings.currencies.CompanyCurrency
import com.hubspot.sdk.models.settings.currencies.CompanyCurrencyUpdateRequest
import com.hubspot.sdk.models.settings.currencies.CurrencyGetCompanyCurrencyParams
import com.hubspot.sdk.models.settings.currencies.CurrencyListCodesParams
import com.hubspot.sdk.models.settings.currencies.CurrencyUpdateCompanyCurrencyParams
import com.hubspot.sdk.services.async.settings.currencies.CentralFxRateServiceAsync
import com.hubspot.sdk.services.async.settings.currencies.ExchangeRateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CurrencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyServiceAsync

    fun centralFxRates(): CentralFxRateServiceAsync

    fun exchangeRates(): ExchangeRateServiceAsync

    /**
     * Get the details for the company currency. The company currency is used in deal totals,
     * reports, and the default currency for new deals.
     */
    fun getCompanyCurrency(): CompletableFuture<CompanyCurrency> =
        getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none())

    /** @see getCompanyCurrency */
    fun getCompanyCurrency(
        params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyCurrency>

    /** @see getCompanyCurrency */
    fun getCompanyCurrency(
        params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none()
    ): CompletableFuture<CompanyCurrency> = getCompanyCurrency(params, RequestOptions.none())

    /** @see getCompanyCurrency */
    fun getCompanyCurrency(requestOptions: RequestOptions): CompletableFuture<CompanyCurrency> =
        getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none(), requestOptions)

    /** Retrieve a list of all available currency codes and their names. */
    fun listCodes(): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        listCodes(CurrencyListCodesParams.none())

    /** @see listCodes */
    fun listCodes(
        params: CurrencyListCodesParams = CurrencyListCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging>

    /** @see listCodes */
    fun listCodes(
        params: CurrencyListCodesParams = CurrencyListCodesParams.none()
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        listCodes(params, RequestOptions.none())

    /** @see listCodes */
    fun listCodes(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseCurrencyCodeInfoNoPaging> =
        listCodes(CurrencyListCodesParams.none(), requestOptions)

    /** Set or update the primary company currency. */
    fun updateCompanyCurrency(
        params: CurrencyUpdateCompanyCurrencyParams
    ): CompletableFuture<CompanyCurrency> = updateCompanyCurrency(params, RequestOptions.none())

    /** @see updateCompanyCurrency */
    fun updateCompanyCurrency(
        params: CurrencyUpdateCompanyCurrencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyCurrency>

    /** @see updateCompanyCurrency */
    fun updateCompanyCurrency(
        companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyCurrency> =
        updateCompanyCurrency(
            CurrencyUpdateCompanyCurrencyParams.builder()
                .companyCurrencyUpdateRequest(companyCurrencyUpdateRequest)
                .build(),
            requestOptions,
        )

    /** @see updateCompanyCurrency */
    fun updateCompanyCurrency(
        companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest
    ): CompletableFuture<CompanyCurrency> =
        updateCompanyCurrency(companyCurrencyUpdateRequest, RequestOptions.none())

    /**
     * A view of [CurrencyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrencyServiceAsync.WithRawResponse

        fun centralFxRates(): CentralFxRateServiceAsync.WithRawResponse

        fun exchangeRates(): ExchangeRateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /settings/currencies/2026-03/company-currency`, but
         * is otherwise the same as [CurrencyServiceAsync.getCompanyCurrency].
         */
        fun getCompanyCurrency(): CompletableFuture<HttpResponseFor<CompanyCurrency>> =
            getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none())

        /** @see getCompanyCurrency */
        fun getCompanyCurrency(
            params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>>

        /** @see getCompanyCurrency */
        fun getCompanyCurrency(
            params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none()
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>> =
            getCompanyCurrency(params, RequestOptions.none())

        /** @see getCompanyCurrency */
        fun getCompanyCurrency(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>> =
            getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/currencies/2026-03/codes`, but is
         * otherwise the same as [CurrencyServiceAsync.listCodes].
         */
        fun listCodes():
            CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> =
            listCodes(CurrencyListCodesParams.none())

        /** @see listCodes */
        fun listCodes(
            params: CurrencyListCodesParams = CurrencyListCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>>

        /** @see listCodes */
        fun listCodes(
            params: CurrencyListCodesParams = CurrencyListCodesParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> =
            listCodes(params, RequestOptions.none())

        /** @see listCodes */
        fun listCodes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>> =
            listCodes(CurrencyListCodesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /settings/currencies/2026-03/company-currency`, but
         * is otherwise the same as [CurrencyServiceAsync.updateCompanyCurrency].
         */
        fun updateCompanyCurrency(
            params: CurrencyUpdateCompanyCurrencyParams
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>> =
            updateCompanyCurrency(params, RequestOptions.none())

        /** @see updateCompanyCurrency */
        fun updateCompanyCurrency(
            params: CurrencyUpdateCompanyCurrencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>>

        /** @see updateCompanyCurrency */
        fun updateCompanyCurrency(
            companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>> =
            updateCompanyCurrency(
                CurrencyUpdateCompanyCurrencyParams.builder()
                    .companyCurrencyUpdateRequest(companyCurrencyUpdateRequest)
                    .build(),
                requestOptions,
            )

        /** @see updateCompanyCurrency */
        fun updateCompanyCurrency(
            companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest
        ): CompletableFuture<HttpResponseFor<CompanyCurrency>> =
            updateCompanyCurrency(companyCurrencyUpdateRequest, RequestOptions.none())
    }
}
