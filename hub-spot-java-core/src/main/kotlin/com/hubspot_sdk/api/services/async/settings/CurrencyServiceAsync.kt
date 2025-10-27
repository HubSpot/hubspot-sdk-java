// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

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
import com.hubspot_sdk.api.services.async.settings.currencies.CentralFxRateServiceAsync
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

    /** Create multiple exchange rates in a single request. */
    fun batchCreate(
        params: CurrencyBatchCreateParams
    ): CompletableFuture<BatchResponseExchangeRate> = batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: CurrencyBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate>

    /** @see batchCreate */
    fun batchCreate(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate> =
        batchCreate(
            CurrencyBatchCreateParams.builder()
                .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see batchCreate */
    fun batchCreate(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
    ): CompletableFuture<BatchResponseExchangeRate> =
        batchCreate(batchInputExchangeRateCreateRequest, RequestOptions.none())

    /**
     * Retrieve the details of multiple exchange rates in a single request, specified by their IDs.
     */
    fun batchGet(params: CurrencyBatchGetParams): CompletableFuture<BatchResponseExchangeRate> =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: CurrencyBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate>

    /** @see batchGet */
    fun batchGet(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate> =
        batchGet(
            CurrencyBatchGetParams.builder()
                .batchInputPublicObjectId(batchInputPublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(
        batchInputPublicObjectId: BatchInputPublicObjectId
    ): CompletableFuture<BatchResponseExchangeRate> =
        batchGet(batchInputPublicObjectId, RequestOptions.none())

    /** Update the conversion rates for multiple exchange rates in a batch operation. */
    fun batchUpdate(
        params: CurrencyBatchUpdateParams
    ): CompletableFuture<BatchResponseExchangeRate> = batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: CurrencyBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate>

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate> =
        batchUpdate(
            CurrencyBatchUpdateParams.builder()
                .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                .build(),
            requestOptions,
        )

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
    ): CompletableFuture<BatchResponseExchangeRate> =
        batchUpdate(batchInputExchangeRateUpdateRequest, RequestOptions.none())

    /** Create a new exchange rate with specified conversion rate and currency codes. */
    fun createExchangeRate(
        params: CurrencyCreateExchangeRateParams
    ): CompletableFuture<ExchangeRate> = createExchangeRate(params, RequestOptions.none())

    /** @see createExchangeRate */
    fun createExchangeRate(
        params: CurrencyCreateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate>

    /** @see createExchangeRate */
    fun createExchangeRate(
        exchangeRateCreateRequest: ExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate> =
        createExchangeRate(
            CurrencyCreateExchangeRateParams.builder()
                .exchangeRateCreateRequest(exchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createExchangeRate */
    fun createExchangeRate(
        exchangeRateCreateRequest: ExchangeRateCreateRequest
    ): CompletableFuture<ExchangeRate> =
        createExchangeRate(exchangeRateCreateRequest, RequestOptions.none())

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

    /** Retrieve the details for a specific exchange rate specified by its ID. */
    fun getExchangeRateById(exchangeRateId: String): CompletableFuture<ExchangeRate> =
        getExchangeRateById(exchangeRateId, CurrencyGetExchangeRateByIdParams.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate> =
        getExchangeRateById(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
    ): CompletableFuture<ExchangeRate> =
        getExchangeRateById(exchangeRateId, params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        params: CurrencyGetExchangeRateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate>

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        params: CurrencyGetExchangeRateByIdParams
    ): CompletableFuture<ExchangeRate> = getExchangeRateById(params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        getExchangeRateById(
            exchangeRateId,
            CurrencyGetExchangeRateByIdParams.none(),
            requestOptions,
        )

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

    /** Retrieve all current exchange rates for all currency pairs. */
    fun listCurrentExchangeRates(): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: CurrencyListCurrentExchangeRatesParams =
            CurrencyListCurrentExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging>

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: CurrencyListCurrentExchangeRatesParams =
            CurrencyListCurrentExchangeRatesParams.none()
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        listCurrentExchangeRates(params, RequestOptions.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none(), requestOptions)

    /** Get a list of exchange rates */
    fun listExchangeRates(): CompletableFuture<CollectionResponseExchangeRateForwardPaging> =
        listExchangeRates(CurrencyListExchangeRatesParams.none())

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseExchangeRateForwardPaging>

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none()
    ): CompletableFuture<CollectionResponseExchangeRateForwardPaging> =
        listExchangeRates(params, RequestOptions.none())

    /** @see listExchangeRates */
    fun listExchangeRates(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseExchangeRateForwardPaging> =
        listExchangeRates(CurrencyListExchangeRatesParams.none(), requestOptions)

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

    /** Update an existing conversion rate, specified by its ID. */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: CurrencyUpdateExchangeRateParams,
    ): CompletableFuture<ExchangeRate> =
        updateExchangeRate(exchangeRateId, params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: CurrencyUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate> =
        updateExchangeRate(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        params: CurrencyUpdateExchangeRateParams
    ): CompletableFuture<ExchangeRate> = updateExchangeRate(params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        params: CurrencyUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate>

    /**
     * Change the visibility setting for a currency pair. This will hide or display a currency pair
     * for users in the HubSpot app.
     */
    fun updateVisibility(params: CurrencyUpdateVisibilityParams): CompletableFuture<Void?> =
        updateVisibility(params, RequestOptions.none())

    /** @see updateVisibility */
    fun updateVisibility(
        params: CurrencyUpdateVisibilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateVisibility */
    fun updateVisibility(
        currencyPairUpdate: CurrencyPairUpdate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateVisibility(
            CurrencyUpdateVisibilityParams.builder().currencyPairUpdate(currencyPairUpdate).build(),
            requestOptions,
        )

    /** @see updateVisibility */
    fun updateVisibility(currencyPairUpdate: CurrencyPairUpdate): CompletableFuture<Void?> =
        updateVisibility(currencyPairUpdate, RequestOptions.none())

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

        /**
         * Returns a raw HTTP response for `post
         * /settings/v3/currencies/exchange-rates/batch/create`, but is otherwise the same as
         * [CurrencyServiceAsync.batchCreate].
         */
        fun batchCreate(
            params: CurrencyBatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            params: CurrencyBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>>

        /** @see batchCreate */
        fun batchCreate(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchCreate(
                CurrencyBatchCreateParams.builder()
                    .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see batchCreate */
        fun batchCreate(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchCreate(batchInputExchangeRateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /settings/v3/currencies/exchange-rates/batch/read`,
         * but is otherwise the same as [CurrencyServiceAsync.batchGet].
         */
        fun batchGet(
            params: CurrencyBatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        fun batchGet(
            params: CurrencyBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>>

        /** @see batchGet */
        fun batchGet(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchGet(
                CurrencyBatchGetParams.builder()
                    .batchInputPublicObjectId(batchInputPublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see batchGet */
        fun batchGet(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchGet(batchInputPublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /settings/v3/currencies/exchange-rates/batch/update`, but is otherwise the same as
         * [CurrencyServiceAsync.batchUpdate].
         */
        fun batchUpdate(
            params: CurrencyBatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        fun batchUpdate(
            params: CurrencyBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>>

        /** @see batchUpdate */
        fun batchUpdate(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchUpdate(
                CurrencyBatchUpdateParams.builder()
                    .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                    .build(),
                requestOptions,
            )

        /** @see batchUpdate */
        fun batchUpdate(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            batchUpdate(batchInputExchangeRateUpdateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /settings/v3/currencies/exchange-rates`, but is
         * otherwise the same as [CurrencyServiceAsync.createExchangeRate].
         */
        fun createExchangeRate(
            params: CurrencyCreateExchangeRateParams
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createExchangeRate(params, RequestOptions.none())

        /** @see createExchangeRate */
        fun createExchangeRate(
            params: CurrencyCreateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>>

        /** @see createExchangeRate */
        fun createExchangeRate(
            exchangeRateCreateRequest: ExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createExchangeRate(
                CurrencyCreateExchangeRateParams.builder()
                    .exchangeRateCreateRequest(exchangeRateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createExchangeRate */
        fun createExchangeRate(
            exchangeRateCreateRequest: ExchangeRateCreateRequest
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createExchangeRate(exchangeRateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /settings/v3/currencies/company-currency`, but is
         * otherwise the same as [CurrencyServiceAsync.getCompanyCurrency].
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
         * Returns a raw HTTP response for `get
         * /settings/v3/currencies/exchange-rates/{exchangeRateId}`, but is otherwise the same as
         * [CurrencyServiceAsync.getExchangeRateById].
         */
        fun getExchangeRateById(
            exchangeRateId: String
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(exchangeRateId, CurrencyGetExchangeRateByIdParams.none())

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            exchangeRateId: String,
            params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(
                params.toBuilder().exchangeRateId(exchangeRateId).build(),
                requestOptions,
            )

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            exchangeRateId: String,
            params: CurrencyGetExchangeRateByIdParams = CurrencyGetExchangeRateByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(exchangeRateId, params, RequestOptions.none())

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            params: CurrencyGetExchangeRateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>>

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            params: CurrencyGetExchangeRateByIdParams
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(params, RequestOptions.none())

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            exchangeRateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(
                exchangeRateId,
                CurrencyGetExchangeRateByIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /settings/v3/currencies/codes`, but is otherwise the
         * same as [CurrencyServiceAsync.listCodes].
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
         * Returns a raw HTTP response for `get /settings/v3/currencies/exchange-rates/current`, but
         * is otherwise the same as [CurrencyServiceAsync.listCurrentExchangeRates].
         */
        fun listCurrentExchangeRates():
            CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> =
            listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none())

        /** @see listCurrentExchangeRates */
        fun listCurrentExchangeRates(
            params: CurrencyListCurrentExchangeRatesParams =
                CurrencyListCurrentExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>>

        /** @see listCurrentExchangeRates */
        fun listCurrentExchangeRates(
            params: CurrencyListCurrentExchangeRatesParams =
                CurrencyListCurrentExchangeRatesParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> =
            listCurrentExchangeRates(params, RequestOptions.none())

        /** @see listCurrentExchangeRates */
        fun listCurrentExchangeRates(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> =
            listCurrentExchangeRates(CurrencyListCurrentExchangeRatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/v3/currencies/exchange-rates`, but is
         * otherwise the same as [CurrencyServiceAsync.listExchangeRates].
         */
        fun listExchangeRates():
            CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateForwardPaging>> =
            listExchangeRates(CurrencyListExchangeRatesParams.none())

        /** @see listExchangeRates */
        fun listExchangeRates(
            params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateForwardPaging>>

        /** @see listExchangeRates */
        fun listExchangeRates(
            params: CurrencyListExchangeRatesParams = CurrencyListExchangeRatesParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateForwardPaging>> =
            listExchangeRates(params, RequestOptions.none())

        /** @see listExchangeRates */
        fun listExchangeRates(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateForwardPaging>> =
            listExchangeRates(CurrencyListExchangeRatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /settings/v3/currencies/company-currency`, but is
         * otherwise the same as [CurrencyServiceAsync.updateCompanyCurrency].
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

        /**
         * Returns a raw HTTP response for `patch
         * /settings/v3/currencies/exchange-rates/{exchangeRateId}`, but is otherwise the same as
         * [CurrencyServiceAsync.updateExchangeRate].
         */
        fun updateExchangeRate(
            exchangeRateId: String,
            params: CurrencyUpdateExchangeRateParams,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            updateExchangeRate(exchangeRateId, params, RequestOptions.none())

        /** @see updateExchangeRate */
        fun updateExchangeRate(
            exchangeRateId: String,
            params: CurrencyUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            updateExchangeRate(
                params.toBuilder().exchangeRateId(exchangeRateId).build(),
                requestOptions,
            )

        /** @see updateExchangeRate */
        fun updateExchangeRate(
            params: CurrencyUpdateExchangeRateParams
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            updateExchangeRate(params, RequestOptions.none())

        /** @see updateExchangeRate */
        fun updateExchangeRate(
            params: CurrencyUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>>

        /**
         * Returns a raw HTTP response for `post
         * /settings/v3/currencies/exchange-rates/update-visibility`, but is otherwise the same as
         * [CurrencyServiceAsync.updateVisibility].
         */
        fun updateVisibility(
            params: CurrencyUpdateVisibilityParams
        ): CompletableFuture<HttpResponse> = updateVisibility(params, RequestOptions.none())

        /** @see updateVisibility */
        fun updateVisibility(
            params: CurrencyUpdateVisibilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateVisibility */
        fun updateVisibility(
            currencyPairUpdate: CurrencyPairUpdate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateVisibility(
                CurrencyUpdateVisibilityParams.builder()
                    .currencyPairUpdate(currencyPairUpdate)
                    .build(),
                requestOptions,
            )

        /** @see updateVisibility */
        fun updateVisibility(
            currencyPairUpdate: CurrencyPairUpdate
        ): CompletableFuture<HttpResponse> =
            updateVisibility(currencyPairUpdate, RequestOptions.none())
    }
}
