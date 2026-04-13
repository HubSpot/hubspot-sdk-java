// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.settings.currencies

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.settings.currencies.CollectionResponseExchangeRateNoPaging
import com.hubspot.models.settings.currencies.CurrencyPairUpdate
import com.hubspot.models.settings.currencies.ExchangeRate
import com.hubspot.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateCreateExchangeRateParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateGetExchangeRateByIdParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListCurrentExchangeRatesParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesPageAsync
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateUpdateExchangeRateParams
import com.hubspot.models.settings.currencies.exchangerates.ExchangeRateUpdateVisibilityParams
import com.hubspot.services.async.settings.currencies.exchangerates.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExchangeRateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExchangeRateServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a new exchange rate with specified conversion rate and currency codes. */
    fun createExchangeRate(
        params: ExchangeRateCreateExchangeRateParams
    ): CompletableFuture<ExchangeRate> = createExchangeRate(params, RequestOptions.none())

    /** @see createExchangeRate */
    fun createExchangeRate(
        params: ExchangeRateCreateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate>

    /** @see createExchangeRate */
    fun createExchangeRate(
        exchangeRateCreateRequest: ExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate> =
        createExchangeRate(
            ExchangeRateCreateExchangeRateParams.builder()
                .exchangeRateCreateRequest(exchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createExchangeRate */
    fun createExchangeRate(
        exchangeRateCreateRequest: ExchangeRateCreateRequest
    ): CompletableFuture<ExchangeRate> =
        createExchangeRate(exchangeRateCreateRequest, RequestOptions.none())

    /** Retrieve the details for a specific exchange rate specified by its ID. */
    fun getExchangeRateById(exchangeRateId: String): CompletableFuture<ExchangeRate> =
        getExchangeRateById(exchangeRateId, ExchangeRateGetExchangeRateByIdParams.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: ExchangeRateGetExchangeRateByIdParams =
            ExchangeRateGetExchangeRateByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate> =
        getExchangeRateById(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: ExchangeRateGetExchangeRateByIdParams = ExchangeRateGetExchangeRateByIdParams.none(),
    ): CompletableFuture<ExchangeRate> =
        getExchangeRateById(exchangeRateId, params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        params: ExchangeRateGetExchangeRateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate>

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        params: ExchangeRateGetExchangeRateByIdParams
    ): CompletableFuture<ExchangeRate> = getExchangeRateById(params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExchangeRate> =
        getExchangeRateById(
            exchangeRateId,
            ExchangeRateGetExchangeRateByIdParams.none(),
            requestOptions,
        )

    /** Retrieve all current exchange rates for all currency pairs. */
    fun listCurrentExchangeRates(): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        listCurrentExchangeRates(ExchangeRateListCurrentExchangeRatesParams.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: ExchangeRateListCurrentExchangeRatesParams =
            ExchangeRateListCurrentExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging>

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: ExchangeRateListCurrentExchangeRatesParams =
            ExchangeRateListCurrentExchangeRatesParams.none()
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        listCurrentExchangeRates(params, RequestOptions.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseExchangeRateNoPaging> =
        listCurrentExchangeRates(ExchangeRateListCurrentExchangeRatesParams.none(), requestOptions)

    /** Get a list of exchange rates */
    fun listExchangeRates(): CompletableFuture<ExchangeRateListExchangeRatesPageAsync> =
        listExchangeRates(ExchangeRateListExchangeRatesParams.none())

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: ExchangeRateListExchangeRatesParams = ExchangeRateListExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRateListExchangeRatesPageAsync>

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: ExchangeRateListExchangeRatesParams = ExchangeRateListExchangeRatesParams.none()
    ): CompletableFuture<ExchangeRateListExchangeRatesPageAsync> =
        listExchangeRates(params, RequestOptions.none())

    /** @see listExchangeRates */
    fun listExchangeRates(
        requestOptions: RequestOptions
    ): CompletableFuture<ExchangeRateListExchangeRatesPageAsync> =
        listExchangeRates(ExchangeRateListExchangeRatesParams.none(), requestOptions)

    /** Update an existing conversion rate, specified by its ID. */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: ExchangeRateUpdateExchangeRateParams,
    ): CompletableFuture<ExchangeRate> =
        updateExchangeRate(exchangeRateId, params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: ExchangeRateUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate> =
        updateExchangeRate(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        params: ExchangeRateUpdateExchangeRateParams
    ): CompletableFuture<ExchangeRate> = updateExchangeRate(params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        params: ExchangeRateUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExchangeRate>

    /**
     * Change the visibility setting for a currency pair. This will hide or display a currency pair
     * for users in the HubSpot app.
     */
    fun updateVisibility(params: ExchangeRateUpdateVisibilityParams): CompletableFuture<Void?> =
        updateVisibility(params, RequestOptions.none())

    /** @see updateVisibility */
    fun updateVisibility(
        params: ExchangeRateUpdateVisibilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateVisibility */
    fun updateVisibility(
        currencyPairUpdate: CurrencyPairUpdate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateVisibility(
            ExchangeRateUpdateVisibilityParams.builder()
                .currencyPairUpdate(currencyPairUpdate)
                .build(),
            requestOptions,
        )

    /** @see updateVisibility */
    fun updateVisibility(currencyPairUpdate: CurrencyPairUpdate): CompletableFuture<Void?> =
        updateVisibility(currencyPairUpdate, RequestOptions.none())

    /**
     * A view of [ExchangeRateServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExchangeRateServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /settings/currencies/2026-03/exchange-rates`, but
         * is otherwise the same as [ExchangeRateServiceAsync.createExchangeRate].
         */
        fun createExchangeRate(
            params: ExchangeRateCreateExchangeRateParams
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createExchangeRate(params, RequestOptions.none())

        /** @see createExchangeRate */
        fun createExchangeRate(
            params: ExchangeRateCreateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>>

        /** @see createExchangeRate */
        fun createExchangeRate(
            exchangeRateCreateRequest: ExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            createExchangeRate(
                ExchangeRateCreateExchangeRateParams.builder()
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
         * Returns a raw HTTP response for `get
         * /settings/currencies/2026-03/exchange-rates/{exchangeRateId}`, but is otherwise the same
         * as [ExchangeRateServiceAsync.getExchangeRateById].
         */
        fun getExchangeRateById(
            exchangeRateId: String
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(exchangeRateId, ExchangeRateGetExchangeRateByIdParams.none())

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            exchangeRateId: String,
            params: ExchangeRateGetExchangeRateByIdParams =
                ExchangeRateGetExchangeRateByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(
                params.toBuilder().exchangeRateId(exchangeRateId).build(),
                requestOptions,
            )

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            exchangeRateId: String,
            params: ExchangeRateGetExchangeRateByIdParams =
                ExchangeRateGetExchangeRateByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(exchangeRateId, params, RequestOptions.none())

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            params: ExchangeRateGetExchangeRateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>>

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            params: ExchangeRateGetExchangeRateByIdParams
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(params, RequestOptions.none())

        /** @see getExchangeRateById */
        fun getExchangeRateById(
            exchangeRateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            getExchangeRateById(
                exchangeRateId,
                ExchangeRateGetExchangeRateByIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /settings/currencies/2026-03/exchange-rates/current`, but is otherwise the same as
         * [ExchangeRateServiceAsync.listCurrentExchangeRates].
         */
        fun listCurrentExchangeRates():
            CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> =
            listCurrentExchangeRates(ExchangeRateListCurrentExchangeRatesParams.none())

        /** @see listCurrentExchangeRates */
        fun listCurrentExchangeRates(
            params: ExchangeRateListCurrentExchangeRatesParams =
                ExchangeRateListCurrentExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>>

        /** @see listCurrentExchangeRates */
        fun listCurrentExchangeRates(
            params: ExchangeRateListCurrentExchangeRatesParams =
                ExchangeRateListCurrentExchangeRatesParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> =
            listCurrentExchangeRates(params, RequestOptions.none())

        /** @see listCurrentExchangeRates */
        fun listCurrentExchangeRates(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseExchangeRateNoPaging>> =
            listCurrentExchangeRates(
                ExchangeRateListCurrentExchangeRatesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /settings/currencies/2026-03/exchange-rates`, but is
         * otherwise the same as [ExchangeRateServiceAsync.listExchangeRates].
         */
        fun listExchangeRates():
            CompletableFuture<HttpResponseFor<ExchangeRateListExchangeRatesPageAsync>> =
            listExchangeRates(ExchangeRateListExchangeRatesParams.none())

        /** @see listExchangeRates */
        fun listExchangeRates(
            params: ExchangeRateListExchangeRatesParams =
                ExchangeRateListExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRateListExchangeRatesPageAsync>>

        /** @see listExchangeRates */
        fun listExchangeRates(
            params: ExchangeRateListExchangeRatesParams = ExchangeRateListExchangeRatesParams.none()
        ): CompletableFuture<HttpResponseFor<ExchangeRateListExchangeRatesPageAsync>> =
            listExchangeRates(params, RequestOptions.none())

        /** @see listExchangeRates */
        fun listExchangeRates(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExchangeRateListExchangeRatesPageAsync>> =
            listExchangeRates(ExchangeRateListExchangeRatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /settings/currencies/2026-03/exchange-rates/{exchangeRateId}`, but is otherwise the same
         * as [ExchangeRateServiceAsync.updateExchangeRate].
         */
        fun updateExchangeRate(
            exchangeRateId: String,
            params: ExchangeRateUpdateExchangeRateParams,
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            updateExchangeRate(exchangeRateId, params, RequestOptions.none())

        /** @see updateExchangeRate */
        fun updateExchangeRate(
            exchangeRateId: String,
            params: ExchangeRateUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            updateExchangeRate(
                params.toBuilder().exchangeRateId(exchangeRateId).build(),
                requestOptions,
            )

        /** @see updateExchangeRate */
        fun updateExchangeRate(
            params: ExchangeRateUpdateExchangeRateParams
        ): CompletableFuture<HttpResponseFor<ExchangeRate>> =
            updateExchangeRate(params, RequestOptions.none())

        /** @see updateExchangeRate */
        fun updateExchangeRate(
            params: ExchangeRateUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExchangeRate>>

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/update-visibility`, but is otherwise the same
         * as [ExchangeRateServiceAsync.updateVisibility].
         */
        fun updateVisibility(
            params: ExchangeRateUpdateVisibilityParams
        ): CompletableFuture<HttpResponse> = updateVisibility(params, RequestOptions.none())

        /** @see updateVisibility */
        fun updateVisibility(
            params: ExchangeRateUpdateVisibilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateVisibility */
        fun updateVisibility(
            currencyPairUpdate: CurrencyPairUpdate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateVisibility(
                ExchangeRateUpdateVisibilityParams.builder()
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
