// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.settings.currencies

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.settings.currencies.CollectionResponseExchangeRateNoPaging
import com.hubspot.sdk.models.settings.currencies.CurrencyPairUpdate
import com.hubspot.sdk.models.settings.currencies.ExchangeRate
import com.hubspot.sdk.models.settings.currencies.ExchangeRateCreateRequest
import com.hubspot.sdk.models.settings.currencies.exchangerates.ExchangeRateCreateExchangeRateParams
import com.hubspot.sdk.models.settings.currencies.exchangerates.ExchangeRateGetExchangeRateByIdParams
import com.hubspot.sdk.models.settings.currencies.exchangerates.ExchangeRateListCurrentExchangeRatesParams
import com.hubspot.sdk.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesPage
import com.hubspot.sdk.models.settings.currencies.exchangerates.ExchangeRateListExchangeRatesParams
import com.hubspot.sdk.models.settings.currencies.exchangerates.ExchangeRateUpdateExchangeRateParams
import com.hubspot.sdk.models.settings.currencies.exchangerates.ExchangeRateUpdateVisibilityParams
import com.hubspot.sdk.services.blocking.settings.currencies.exchangerates.BatchService
import java.util.function.Consumer

interface ExchangeRateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExchangeRateService

    fun batch(): BatchService

    /** Create a new exchange rate with specified conversion rate and currency codes. */
    fun createExchangeRate(params: ExchangeRateCreateExchangeRateParams): ExchangeRate =
        createExchangeRate(params, RequestOptions.none())

    /** @see createExchangeRate */
    fun createExchangeRate(
        params: ExchangeRateCreateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate

    /** @see createExchangeRate */
    fun createExchangeRate(
        exchangeRateCreateRequest: ExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate =
        createExchangeRate(
            ExchangeRateCreateExchangeRateParams.builder()
                .exchangeRateCreateRequest(exchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createExchangeRate */
    fun createExchangeRate(exchangeRateCreateRequest: ExchangeRateCreateRequest): ExchangeRate =
        createExchangeRate(exchangeRateCreateRequest, RequestOptions.none())

    /** Retrieve the details for a specific exchange rate specified by its ID. */
    fun getExchangeRateById(exchangeRateId: String): ExchangeRate =
        getExchangeRateById(exchangeRateId, ExchangeRateGetExchangeRateByIdParams.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: ExchangeRateGetExchangeRateByIdParams =
            ExchangeRateGetExchangeRateByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate =
        getExchangeRateById(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        exchangeRateId: String,
        params: ExchangeRateGetExchangeRateByIdParams = ExchangeRateGetExchangeRateByIdParams.none(),
    ): ExchangeRate = getExchangeRateById(exchangeRateId, params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(
        params: ExchangeRateGetExchangeRateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate

    /** @see getExchangeRateById */
    fun getExchangeRateById(params: ExchangeRateGetExchangeRateByIdParams): ExchangeRate =
        getExchangeRateById(params, RequestOptions.none())

    /** @see getExchangeRateById */
    fun getExchangeRateById(exchangeRateId: String, requestOptions: RequestOptions): ExchangeRate =
        getExchangeRateById(
            exchangeRateId,
            ExchangeRateGetExchangeRateByIdParams.none(),
            requestOptions,
        )

    /** Retrieve all current exchange rates for all currency pairs. */
    fun listCurrentExchangeRates(): CollectionResponseExchangeRateNoPaging =
        listCurrentExchangeRates(ExchangeRateListCurrentExchangeRatesParams.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: ExchangeRateListCurrentExchangeRatesParams =
            ExchangeRateListCurrentExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseExchangeRateNoPaging

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        params: ExchangeRateListCurrentExchangeRatesParams =
            ExchangeRateListCurrentExchangeRatesParams.none()
    ): CollectionResponseExchangeRateNoPaging =
        listCurrentExchangeRates(params, RequestOptions.none())

    /** @see listCurrentExchangeRates */
    fun listCurrentExchangeRates(
        requestOptions: RequestOptions
    ): CollectionResponseExchangeRateNoPaging =
        listCurrentExchangeRates(ExchangeRateListCurrentExchangeRatesParams.none(), requestOptions)

    /** Get a list of exchange rates */
    fun listExchangeRates(): ExchangeRateListExchangeRatesPage =
        listExchangeRates(ExchangeRateListExchangeRatesParams.none())

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: ExchangeRateListExchangeRatesParams = ExchangeRateListExchangeRatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRateListExchangeRatesPage

    /** @see listExchangeRates */
    fun listExchangeRates(
        params: ExchangeRateListExchangeRatesParams = ExchangeRateListExchangeRatesParams.none()
    ): ExchangeRateListExchangeRatesPage = listExchangeRates(params, RequestOptions.none())

    /** @see listExchangeRates */
    fun listExchangeRates(requestOptions: RequestOptions): ExchangeRateListExchangeRatesPage =
        listExchangeRates(ExchangeRateListExchangeRatesParams.none(), requestOptions)

    /** Update an existing conversion rate, specified by its ID. */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: ExchangeRateUpdateExchangeRateParams,
    ): ExchangeRate = updateExchangeRate(exchangeRateId, params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        exchangeRateId: String,
        params: ExchangeRateUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate =
        updateExchangeRate(
            params.toBuilder().exchangeRateId(exchangeRateId).build(),
            requestOptions,
        )

    /** @see updateExchangeRate */
    fun updateExchangeRate(params: ExchangeRateUpdateExchangeRateParams): ExchangeRate =
        updateExchangeRate(params, RequestOptions.none())

    /** @see updateExchangeRate */
    fun updateExchangeRate(
        params: ExchangeRateUpdateExchangeRateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExchangeRate

    /**
     * Change the visibility setting for a currency pair. This will hide or display a currency pair
     * for users in the HubSpot app.
     */
    fun updateVisibility(params: ExchangeRateUpdateVisibilityParams) =
        updateVisibility(params, RequestOptions.none())

    /** @see updateVisibility */
    fun updateVisibility(
        params: ExchangeRateUpdateVisibilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateVisibility */
    fun updateVisibility(
        currencyPairUpdate: CurrencyPairUpdate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateVisibility(
            ExchangeRateUpdateVisibilityParams.builder()
                .currencyPairUpdate(currencyPairUpdate)
                .build(),
            requestOptions,
        )

    /** @see updateVisibility */
    fun updateVisibility(currencyPairUpdate: CurrencyPairUpdate) =
        updateVisibility(currencyPairUpdate, RequestOptions.none())

    /**
     * A view of [ExchangeRateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExchangeRateService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /settings/currencies/2026-03/exchange-rates`, but
         * is otherwise the same as [ExchangeRateService.createExchangeRate].
         */
        @MustBeClosed
        fun createExchangeRate(
            params: ExchangeRateCreateExchangeRateParams
        ): HttpResponseFor<ExchangeRate> = createExchangeRate(params, RequestOptions.none())

        /** @see createExchangeRate */
        @MustBeClosed
        fun createExchangeRate(
            params: ExchangeRateCreateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate>

        /** @see createExchangeRate */
        @MustBeClosed
        fun createExchangeRate(
            exchangeRateCreateRequest: ExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate> =
            createExchangeRate(
                ExchangeRateCreateExchangeRateParams.builder()
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
         * Returns a raw HTTP response for `get
         * /settings/currencies/2026-03/exchange-rates/{exchangeRateId}`, but is otherwise the same
         * as [ExchangeRateService.getExchangeRateById].
         */
        @MustBeClosed
        fun getExchangeRateById(exchangeRateId: String): HttpResponseFor<ExchangeRate> =
            getExchangeRateById(exchangeRateId, ExchangeRateGetExchangeRateByIdParams.none())

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            exchangeRateId: String,
            params: ExchangeRateGetExchangeRateByIdParams =
                ExchangeRateGetExchangeRateByIdParams.none(),
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
            params: ExchangeRateGetExchangeRateByIdParams =
                ExchangeRateGetExchangeRateByIdParams.none(),
        ): HttpResponseFor<ExchangeRate> =
            getExchangeRateById(exchangeRateId, params, RequestOptions.none())

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            params: ExchangeRateGetExchangeRateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate>

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            params: ExchangeRateGetExchangeRateByIdParams
        ): HttpResponseFor<ExchangeRate> = getExchangeRateById(params, RequestOptions.none())

        /** @see getExchangeRateById */
        @MustBeClosed
        fun getExchangeRateById(
            exchangeRateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExchangeRate> =
            getExchangeRateById(
                exchangeRateId,
                ExchangeRateGetExchangeRateByIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /settings/currencies/2026-03/exchange-rates/current`, but is otherwise the same as
         * [ExchangeRateService.listCurrentExchangeRates].
         */
        @MustBeClosed
        fun listCurrentExchangeRates(): HttpResponseFor<CollectionResponseExchangeRateNoPaging> =
            listCurrentExchangeRates(ExchangeRateListCurrentExchangeRatesParams.none())

        /** @see listCurrentExchangeRates */
        @MustBeClosed
        fun listCurrentExchangeRates(
            params: ExchangeRateListCurrentExchangeRatesParams =
                ExchangeRateListCurrentExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseExchangeRateNoPaging>

        /** @see listCurrentExchangeRates */
        @MustBeClosed
        fun listCurrentExchangeRates(
            params: ExchangeRateListCurrentExchangeRatesParams =
                ExchangeRateListCurrentExchangeRatesParams.none()
        ): HttpResponseFor<CollectionResponseExchangeRateNoPaging> =
            listCurrentExchangeRates(params, RequestOptions.none())

        /** @see listCurrentExchangeRates */
        @MustBeClosed
        fun listCurrentExchangeRates(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseExchangeRateNoPaging> =
            listCurrentExchangeRates(
                ExchangeRateListCurrentExchangeRatesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /settings/currencies/2026-03/exchange-rates`, but is
         * otherwise the same as [ExchangeRateService.listExchangeRates].
         */
        @MustBeClosed
        fun listExchangeRates(): HttpResponseFor<ExchangeRateListExchangeRatesPage> =
            listExchangeRates(ExchangeRateListExchangeRatesParams.none())

        /** @see listExchangeRates */
        @MustBeClosed
        fun listExchangeRates(
            params: ExchangeRateListExchangeRatesParams =
                ExchangeRateListExchangeRatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRateListExchangeRatesPage>

        /** @see listExchangeRates */
        @MustBeClosed
        fun listExchangeRates(
            params: ExchangeRateListExchangeRatesParams = ExchangeRateListExchangeRatesParams.none()
        ): HttpResponseFor<ExchangeRateListExchangeRatesPage> =
            listExchangeRates(params, RequestOptions.none())

        /** @see listExchangeRates */
        @MustBeClosed
        fun listExchangeRates(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExchangeRateListExchangeRatesPage> =
            listExchangeRates(ExchangeRateListExchangeRatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /settings/currencies/2026-03/exchange-rates/{exchangeRateId}`, but is otherwise the same
         * as [ExchangeRateService.updateExchangeRate].
         */
        @MustBeClosed
        fun updateExchangeRate(
            exchangeRateId: String,
            params: ExchangeRateUpdateExchangeRateParams,
        ): HttpResponseFor<ExchangeRate> =
            updateExchangeRate(exchangeRateId, params, RequestOptions.none())

        /** @see updateExchangeRate */
        @MustBeClosed
        fun updateExchangeRate(
            exchangeRateId: String,
            params: ExchangeRateUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate> =
            updateExchangeRate(
                params.toBuilder().exchangeRateId(exchangeRateId).build(),
                requestOptions,
            )

        /** @see updateExchangeRate */
        @MustBeClosed
        fun updateExchangeRate(
            params: ExchangeRateUpdateExchangeRateParams
        ): HttpResponseFor<ExchangeRate> = updateExchangeRate(params, RequestOptions.none())

        /** @see updateExchangeRate */
        @MustBeClosed
        fun updateExchangeRate(
            params: ExchangeRateUpdateExchangeRateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExchangeRate>

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/update-visibility`, but is otherwise the same
         * as [ExchangeRateService.updateVisibility].
         */
        @MustBeClosed
        fun updateVisibility(params: ExchangeRateUpdateVisibilityParams): HttpResponse =
            updateVisibility(params, RequestOptions.none())

        /** @see updateVisibility */
        @MustBeClosed
        fun updateVisibility(
            params: ExchangeRateUpdateVisibilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateVisibility */
        @MustBeClosed
        fun updateVisibility(
            currencyPairUpdate: CurrencyPairUpdate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateVisibility(
                ExchangeRateUpdateVisibilityParams.builder()
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
