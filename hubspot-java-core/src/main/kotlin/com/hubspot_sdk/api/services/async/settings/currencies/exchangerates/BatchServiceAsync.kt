// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings.currencies.exchangerates

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateUpdateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.settings.currencies.BatchResponseExchangeRate
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.batch.BatchCreateParams
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.batch.BatchGetParams
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.batch.BatchUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    fun create(params: BatchCreateParams): CompletableFuture<BatchResponseExchangeRate> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate>

    /** @see create */
    fun create(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate> =
        create(
            BatchCreateParams.builder()
                .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
    ): CompletableFuture<BatchResponseExchangeRate> =
        create(batchInputExchangeRateCreateRequest, RequestOptions.none())

    fun update(params: BatchUpdateParams): CompletableFuture<BatchResponseExchangeRate> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate>

    /** @see update */
    fun update(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate> =
        update(
            BatchUpdateParams.builder()
                .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
    ): CompletableFuture<BatchResponseExchangeRate> =
        update(batchInputExchangeRateUpdateRequest, RequestOptions.none())

    fun get(params: BatchGetParams): CompletableFuture<BatchResponseExchangeRate> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate>

    /** @see get */
    fun get(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseExchangeRate> =
        get(
            BatchGetParams.builder().batchInputPublicObjectId(batchInputPublicObjectId).build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchInputPublicObjectId: BatchInputPublicObjectId
    ): CompletableFuture<BatchResponseExchangeRate> =
        get(batchInputPublicObjectId, RequestOptions.none())

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/batch/create`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>>

        /** @see create */
        fun create(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            create(
                BatchCreateParams.builder()
                    .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            create(batchInputExchangeRateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/batch/update`, but is otherwise the same as
         * [BatchServiceAsync.update].
         */
        fun update(
            params: BatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>>

        /** @see update */
        fun update(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            update(
                BatchUpdateParams.builder()
                    .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                    .build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            update(batchInputExchangeRateUpdateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/batch/read`, but is otherwise the same as
         * [BatchServiceAsync.get].
         */
        fun get(
            params: BatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>>

        /** @see get */
        fun get(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            get(
                BatchGetParams.builder().batchInputPublicObjectId(batchInputPublicObjectId).build(),
                requestOptions,
            )

        /** @see get */
        fun get(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseExchangeRate>> =
            get(batchInputPublicObjectId, RequestOptions.none())
    }
}
