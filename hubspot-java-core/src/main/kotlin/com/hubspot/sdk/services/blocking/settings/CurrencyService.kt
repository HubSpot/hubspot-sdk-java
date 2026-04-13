// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.settings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot.sdk.models.settings.currencies.CompanyCurrency
import com.hubspot.sdk.models.settings.currencies.CompanyCurrencyUpdateRequest
import com.hubspot.sdk.models.settings.currencies.CurrencyGetCompanyCurrencyParams
import com.hubspot.sdk.models.settings.currencies.CurrencyListCodesParams
import com.hubspot.sdk.models.settings.currencies.CurrencyUpdateCompanyCurrencyParams
import com.hubspot.sdk.services.blocking.settings.currencies.CentralFxRateService
import com.hubspot.sdk.services.blocking.settings.currencies.ExchangeRateService
import java.util.function.Consumer

interface CurrencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyService

    fun centralFxRates(): CentralFxRateService

    fun exchangeRates(): ExchangeRateService

    /**
     * Get the details for the company currency. The company currency is used in deal totals,
     * reports, and the default currency for new deals.
     */
    fun getCompanyCurrency(): CompanyCurrency =
        getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none())

    /** @see getCompanyCurrency */
    fun getCompanyCurrency(
        params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyCurrency

    /** @see getCompanyCurrency */
    fun getCompanyCurrency(
        params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none()
    ): CompanyCurrency = getCompanyCurrency(params, RequestOptions.none())

    /** @see getCompanyCurrency */
    fun getCompanyCurrency(requestOptions: RequestOptions): CompanyCurrency =
        getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none(), requestOptions)

    /** Retrieve a list of all available currency codes and their names. */
    fun listCodes(): CollectionResponseCurrencyCodeInfoNoPaging =
        listCodes(CurrencyListCodesParams.none())

    /** @see listCodes */
    fun listCodes(
        params: CurrencyListCodesParams = CurrencyListCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseCurrencyCodeInfoNoPaging

    /** @see listCodes */
    fun listCodes(
        params: CurrencyListCodesParams = CurrencyListCodesParams.none()
    ): CollectionResponseCurrencyCodeInfoNoPaging = listCodes(params, RequestOptions.none())

    /** @see listCodes */
    fun listCodes(requestOptions: RequestOptions): CollectionResponseCurrencyCodeInfoNoPaging =
        listCodes(CurrencyListCodesParams.none(), requestOptions)

    /** Set or update the primary company currency. */
    fun updateCompanyCurrency(params: CurrencyUpdateCompanyCurrencyParams): CompanyCurrency =
        updateCompanyCurrency(params, RequestOptions.none())

    /** @see updateCompanyCurrency */
    fun updateCompanyCurrency(
        params: CurrencyUpdateCompanyCurrencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyCurrency

    /** @see updateCompanyCurrency */
    fun updateCompanyCurrency(
        companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyCurrency =
        updateCompanyCurrency(
            CurrencyUpdateCompanyCurrencyParams.builder()
                .companyCurrencyUpdateRequest(companyCurrencyUpdateRequest)
                .build(),
            requestOptions,
        )

    /** @see updateCompanyCurrency */
    fun updateCompanyCurrency(
        companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest
    ): CompanyCurrency = updateCompanyCurrency(companyCurrencyUpdateRequest, RequestOptions.none())

    /** A view of [CurrencyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyService.WithRawResponse

        fun centralFxRates(): CentralFxRateService.WithRawResponse

        fun exchangeRates(): ExchangeRateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /settings/currencies/2026-03/company-currency`, but
         * is otherwise the same as [CurrencyService.getCompanyCurrency].
         */
        @MustBeClosed
        fun getCompanyCurrency(): HttpResponseFor<CompanyCurrency> =
            getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none())

        /** @see getCompanyCurrency */
        @MustBeClosed
        fun getCompanyCurrency(
            params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyCurrency>

        /** @see getCompanyCurrency */
        @MustBeClosed
        fun getCompanyCurrency(
            params: CurrencyGetCompanyCurrencyParams = CurrencyGetCompanyCurrencyParams.none()
        ): HttpResponseFor<CompanyCurrency> = getCompanyCurrency(params, RequestOptions.none())

        /** @see getCompanyCurrency */
        @MustBeClosed
        fun getCompanyCurrency(requestOptions: RequestOptions): HttpResponseFor<CompanyCurrency> =
            getCompanyCurrency(CurrencyGetCompanyCurrencyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/currencies/2026-03/codes`, but is
         * otherwise the same as [CurrencyService.listCodes].
         */
        @MustBeClosed
        fun listCodes(): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> =
            listCodes(CurrencyListCodesParams.none())

        /** @see listCodes */
        @MustBeClosed
        fun listCodes(
            params: CurrencyListCodesParams = CurrencyListCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging>

        /** @see listCodes */
        @MustBeClosed
        fun listCodes(
            params: CurrencyListCodesParams = CurrencyListCodesParams.none()
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> =
            listCodes(params, RequestOptions.none())

        /** @see listCodes */
        @MustBeClosed
        fun listCodes(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseCurrencyCodeInfoNoPaging> =
            listCodes(CurrencyListCodesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /settings/currencies/2026-03/company-currency`, but
         * is otherwise the same as [CurrencyService.updateCompanyCurrency].
         */
        @MustBeClosed
        fun updateCompanyCurrency(
            params: CurrencyUpdateCompanyCurrencyParams
        ): HttpResponseFor<CompanyCurrency> = updateCompanyCurrency(params, RequestOptions.none())

        /** @see updateCompanyCurrency */
        @MustBeClosed
        fun updateCompanyCurrency(
            params: CurrencyUpdateCompanyCurrencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyCurrency>

        /** @see updateCompanyCurrency */
        @MustBeClosed
        fun updateCompanyCurrency(
            companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyCurrency> =
            updateCompanyCurrency(
                CurrencyUpdateCompanyCurrencyParams.builder()
                    .companyCurrencyUpdateRequest(companyCurrencyUpdateRequest)
                    .build(),
                requestOptions,
            )

        /** @see updateCompanyCurrency */
        @MustBeClosed
        fun updateCompanyCurrency(
            companyCurrencyUpdateRequest: CompanyCurrencyUpdateRequest
        ): HttpResponseFor<CompanyCurrency> =
            updateCompanyCurrency(companyCurrencyUpdateRequest, RequestOptions.none())
    }
}
