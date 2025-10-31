// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateUpdateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchResponseExchangeRate
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseCurrencyCodeInfoNoPaging
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseExchangeRateForwardPaging
import com.hubspot_sdk.api.models.settings.currencies.CollectionResponseExchangeRateNoPaging
import com.hubspot_sdk.api.models.settings.currencies.CompanyCurrency
import com.hubspot_sdk.api.models.settings.currencies.CompanyCurrencyUpdateRequest
import com.hubspot_sdk.api.models.settings.currencies.CurrencyBatchCreateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyBatchGetParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyBatchUpdateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyCreateExchangeRateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyGetCompanyCurrencyParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyGetExchangeRateByIdParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyListCodesParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyListCurrentExchangeRatesParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyListExchangeRatesParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyPairUpdate
import com.hubspot_sdk.api.models.settings.currencies.CurrencyUpdateCompanyCurrencyParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyUpdateExchangeRateParams
import com.hubspot_sdk.api.models.settings.currencies.CurrencyUpdateVisibilityParams
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRate
import com.hubspot_sdk.api.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot_sdk.api.services.blocking.settings.currencies.CentralFxRateService
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

    /** Create multiple exchange rates in a single request. */
    fun batchCreate(params: CurrencyBatchCreateParams): BatchResponseExchangeRate =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: CurrencyBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate

    /** @see batchCreate */
    fun batchCreate(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate =
        batchCreate(
            CurrencyBatchCreateParams.builder()
                .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see batchCreate */
    fun batchCreate(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
    ): BatchResponseExchangeRate =
        batchCreate(batchInputExchangeRateCreateRequest, RequestOptions.none())

    /**
     * Retrieve the details of multiple exchange rates in a single request, specified by their IDs.
     */
    fun batchGet(params: CurrencyBatchGetParams): BatchResponseExchangeRate =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: CurrencyBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate

    /** @see batchGet */
    fun batchGet(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate =
        batchGet(
            CurrencyBatchGetParams.builder()
                .batchInputPublicObjectId(batchInputPublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(batchInputPublicObjectId: BatchInputPublicObjectId): BatchResponseExchangeRate =
        batchGet(batchInputPublicObjectId, RequestOptions.none())

    /** Update the conversion rates for multiple exchange rates in a batch operation. */
    fun batchUpdate(params: CurrencyBatchUpdateParams): BatchResponseExchangeRate =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: CurrencyBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate =
        batchUpdate(
            CurrencyBatchUpdateParams.builder()
                .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                .build(),
            requestOptions,
        )

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
    ): BatchResponseExchangeRate =
        batchUpdate(batchInputExchangeRateUpdateRequest, RequestOptions.none())

    /** Create a new exchange rate with specified conversion rate and currency codes. */
    fun createExchangeRate(params: CurrencyCreateExchangeRateParams): ExchangeRate =
        createExchangeRate(params, RequestOptions.none())

    /** @see createExchangeRate */
    fun createExchangeRate(
        params: CurrencyCreateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate

    /** @see createExchangeRate */
    fun createExchangeRate(
        exchangeRateCreateRequest: ExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate =
        createExchangeRate(
            CurrencyCreateExchangeRateParams.builder()
                .exchangeRateCreateRequest(exchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createExchangeRate */
    fun createExchangeRate(exchangeRateCreateRequest: ExchangeRateCreateRequest): ExchangeRate =
        createExchangeRate(exchangeRateCreateRequest, RequestOptions.none())

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

    /** Retrieve the details for a specific exchange rate specified by its ID. */
    fun getExchangeRateById(exchangeRateId: String): ExchangeRate =
        getExchangeRateById(exchangeRateId, CurrencyGetExchangeRateByIdParams.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate =
        getExchangeRateById(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
    ): ExchangeRate = getExchangeRateById(exchangeRateId, params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        params: CurrencyGetExchangeRateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate

    /** @see getExchangeRateById */
    fun getExchangeRateById(params: CurrencyGetExchangeRateByIdParams): ExchangeRate =
        getExchangeRateById(params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(exchangeRateId: String, requestOptions: RequestOptions): ExchangeRate =
        getExchangeRateById(
            exchangeRateId,
            CurrencyGetExchangeRateByIdParams.none(),
            requestOptions,
        )

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

    /** Retrieve all current exchange rates for all currency pairs. */
    fun listCurrentExchangeRates(): CollectionResponseExchangeRateNoPaging =
        listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: CurrencyListCurrentExchangeRatesParams =
            CurrencyListCurrentExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseExchangeRateNoPaging

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: CurrencyListCurrentExchangeRatesParams =
            CurrencyListCurrentExchangeRatesParams.none()
    ): CollectionResponseExchangeRateNoPaging =
        listCurrentExchangeRates(params, RequestOptions.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        requestOptions: RequestOptions
    ): CollectionResponseExchangeRateNoPaging =
        listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none(), requestOptions)

    /** Get a list of exchange rates */
    fun listExchangeRates(): CollectionResponseExchangeRateForwardPaging =
        listExchangeRates(CurrencyListExchangeRatesParams.none())

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseExchangeRateForwardPaging

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none()
    ): CollectionResponseExchangeRateForwardPaging =
        listExchangeRates(params, RequestOptions.none())

    /** @see listExchangeRates */
    fun listExchangeRates(
        requestOptions: RequestOptions
    ): CollectionResponseExchangeRateForwardPaging =
        listExchangeRates(CurrencyListExchangeRatesParams.none(), requestOptions)

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

    /** Update an existing conversion rate, specified by its ID. */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: CurrencyUpdateExchangeRateParams,
    ): ExchangeRate = updateExchangeRate(exchangeRateId, params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: CurrencyUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate =
        updateExchangeRate(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see updateExchangeRate */
    fun updateExchangeRate(params: CurrencyUpdateExchangeRateParams): ExchangeRate =
        updateExchangeRate(params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        params: CurrencyUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate

    /**
     * Change the visibility setting for a currency pair. This will hide or display a currency pair
     * for users in the HubSpot app.
     */
    fun updateVisibility(params: CurrencyUpdateVisibilityParams) =
        updateVisibility(params, RequestOptions.none())

    /** @see updateVisibility */
    fun updateVisibility(
        params: CurrencyUpdateVisibilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateVisibility */
    fun updateVisibility(
        currencyPairUpdate: CurrencyPairUpdate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateVisibility(
            CurrencyUpdateVisibilityParams.builder().currencyPairUpdate(currencyPairUpdate).build(),
            requestOptions,
        )

    /** @see updateVisibility */
    fun updateVisibility(currencyPairUpdate: CurrencyPairUpdate) =
        updateVisibility(currencyPairUpdate, RequestOptions.none())

    /** A view of [CurrencyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyService.WithRawResponse

        fun centralFxRates(): CentralFxRateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /settings/v3/currencies/exchange-rates/batch/create`, but is otherwise the same as
         * [CurrencyService.batchCreate].
         */
        @MustBeClosed
        fun batchCreate(
            params: CurrencyBatchCreateParams
        ): HttpResponseFor<BatchResponseExchangeRate> = batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: CurrencyBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate>

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate> =
            batchCreate(
                CurrencyBatchCreateParams.builder()
                    .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
        ): HttpResponseFor<BatchResponseExchangeRate> =
            batchCreate(batchInputExchangeRateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /settings/v3/currencies/exchange-rates/batch/read`,
         * but is otherwise the same as [CurrencyService.batchGet].
         */
        @MustBeClosed
        fun batchGet(params: CurrencyBatchGetParams): HttpResponseFor<BatchResponseExchangeRate> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            params: CurrencyBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate>

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate> =
            batchGet(
                CurrencyBatchGetParams.builder()
                    .batchInputPublicObjectId(batchInputPublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): HttpResponseFor<BatchResponseExchangeRate> =
            batchGet(batchInputPublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /settings/v3/currencies/exchange-rates/batch/update`, but is otherwise the same as
         * [CurrencyService.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(
            params: CurrencyBatchUpdateParams
        ): HttpResponseFor<BatchResponseExchangeRate> = batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            params: CurrencyBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate>

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate> =
            batchUpdate(
                CurrencyBatchUpdateParams.builder()
                    .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                    .build(),
                requestOptions,
            )

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
        ): HttpResponseFor<BatchResponseExchangeRate> =
            batchUpdate(batchInputExchangeRateUpdateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /settings/v3/currencies/exchange-rates`, but is
         * otherwise the same as [CurrencyService.createExchangeRate].
         */
        @MustBeClosed
        fun createExchangeRate(
            params: CurrencyCreateExchangeRateParams
        ): HttpResponseFor<ExchangeRate> = createExchangeRate(params, RequestOptions.none())

        /** @see createExchangeRate */
        @MustBeClosed
        fun createExchangeRate(
            params: CurrencyCreateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate>

        /** @see createExchangeRate */
        @MustBeClosed
        fun createExchangeRate(
            exchangeRateCreateRequest: ExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate> =
            createExchangeRate(
                CurrencyCreateExchangeRateParams.builder()
                    .exchangeRateCreateRequest(exchangeRateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createExchangeRate */
        @MustBeClosed
        fun createExchangeRate(
            exchangeRateCreateRequest: ExchangeRateCreateRequest
        ): HttpResponseFor<ExchangeRate> =
            createExchangeRate(exchangeRateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /settings/v3/currencies/company-currency`, but is
         * otherwise the same as [CurrencyService.getCompanyCurrency].
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
         * Returns a raw HTTP response for `get
         * /settings/v3/currencies/exchange-rates/{exchangeRateId}`, but is otherwise the same as
         * [CurrencyService.getExchangeRateById].
         */
        @MustBeClosed
        fun getExchangeRateById(exchangeRateId: String): HttpResponseFor<ExchangeRate> =
            getExchangeRateById(exchangeRateId, CurrencyGetExchangeRateByIdParams.none())

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            exchangeRateId: String,
            params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate> =
            getExchangeRateById(
                params.toBuilder().exchangeRateId(exchangeRateId).build(),
                requestOptions,
            )

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            exchangeRateId: String,
            params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
        ): HttpResponseFor<ExchangeRate> =
            getExchangeRateById(exchangeRateId, params, RequestOptions.none())

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            params: CurrencyGetExchangeRateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate>

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            params: CurrencyGetExchangeRateByIdParams
        ): HttpResponseFor<ExchangeRate> = getExchangeRateById(params, RequestOptions.none())

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            exchangeRateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExchangeRate> =
            getExchangeRateById(
                exchangeRateId,
                CurrencyGetExchangeRateByIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /settings/v3/currencies/codes`, but is otherwise the
         * same as [CurrencyService.listCodes].
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
         * Returns a raw HTTP response for `get /settings/v3/currencies/exchange-rates/current`, but
         * is otherwise the same as [CurrencyService.listCurrentExchangeRates].
         */
        @MustBeClosed
        fun listCurrentExchangeRates(): HttpResponseFor<CollectionResponseExchangeRateNoPaging> =
            listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none())

        /** @see listCurrentExchangeRates */
        @MustBeClosed
        fun listCurrentExchangeRates(
            params: CurrencyListCurrentExchangeRatesParams =
                CurrencyListCurrentExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseExchangeRateNoPaging>

        /** @see listCurrentExchangeRates */
        @MustBeClosed
        fun listCurrentExchangeRates(
            params: CurrencyListCurrentExchangeRatesParams =
                CurrencyListCurrentExchangeRatesParams.none()
        ): HttpResponseFor<CollectionResponseExchangeRateNoPaging> =
            listCurrentExchangeRates(params, RequestOptions.none())

        /** @see listCurrentExchangeRates */
        @MustBeClosed
        fun listCurrentExchangeRates(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseExchangeRateNoPaging> =
            listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/v3/currencies/exchange-rates`, but is
         * otherwise the same as [CurrencyService.listExchangeRates].
         */
        @MustBeClosed
        fun listExchangeRates(): HttpResponseFor<CollectionResponseExchangeRateForwardPaging> =
            listExchangeRates(CurrencyListExchangeRatesParams.none())

        /** @see listExchangeRates */
        @MustBeClosed
        fun listExchangeRates(
            params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseExchangeRateForwardPaging>

        /** @see listExchangeRates */
        @MustBeClosed
        fun listExchangeRates(
            params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none()
        ): HttpResponseFor<CollectionResponseExchangeRateForwardPaging> =
            listExchangeRates(params, RequestOptions.none())

        /** @see listExchangeRates */
        @MustBeClosed
        fun listExchangeRates(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseExchangeRateForwardPaging> =
            listExchangeRates(CurrencyListExchangeRatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /settings/v3/currencies/company-currency`, but is
         * otherwise the same as [CurrencyService.updateCompanyCurrency].
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

        /**
         * Returns a raw HTTP response for `patch
         * /settings/v3/currencies/exchange-rates/{exchangeRateId}`, but is otherwise the same as
         * [CurrencyService.updateExchangeRate].
         */
        @MustBeClosed
        fun updateExchangeRate(
            exchangeRateId: String,
            params: CurrencyUpdateExchangeRateParams,
        ): HttpResponseFor<ExchangeRate> =
            updateExchangeRate(exchangeRateId, params, RequestOptions.none())

        /** @see updateExchangeRate */
        @MustBeClosed
        fun updateExchangeRate(
            exchangeRateId: String,
            params: CurrencyUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate> =
            updateExchangeRate(
                params.toBuilder().exchangeRateId(exchangeRateId).build(),
                requestOptions,
            )

        /** @see updateExchangeRate */
        @MustBeClosed
        fun updateExchangeRate(
            params: CurrencyUpdateExchangeRateParams
        ): HttpResponseFor<ExchangeRate> = updateExchangeRate(params, RequestOptions.none())

        /** @see updateExchangeRate */
        @MustBeClosed
        fun updateExchangeRate(
            params: CurrencyUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate>

        /**
         * Returns a raw HTTP response for `post
         * /settings/v3/currencies/exchange-rates/update-visibility`, but is otherwise the same as
         * [CurrencyService.updateVisibility].
         */
        @MustBeClosed
        fun updateVisibility(params: CurrencyUpdateVisibilityParams): HttpResponse =
            updateVisibility(params, RequestOptions.none())

        /** @see updateVisibility */
        @MustBeClosed
        fun updateVisibility(
            params: CurrencyUpdateVisibilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateVisibility */
        @MustBeClosed
        fun updateVisibility(
            currencyPairUpdate: CurrencyPairUpdate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateVisibility(
                CurrencyUpdateVisibilityParams.builder()
                    .currencyPairUpdate(currencyPairUpdate)
                    .build(),
                requestOptions,
            )

        /** @see updateVisibility */
        @MustBeClosed
        fun updateVisibility(currencyPairUpdate: CurrencyPairUpdate): HttpResponse =
            updateVisibility(currencyPairUpdate, RequestOptions.none())
    }
}
