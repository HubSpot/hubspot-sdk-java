// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings.currencies.exchangerates

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateCreateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchInputExchangeRateUpdateRequest
import com.hubspot_sdk.api.models.settings.currencies.BatchResponseExchangeRate
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.batch.BatchCreateParams
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.batch.BatchGetParams
import com.hubspot_sdk.api.models.settings.currencies.exchangerates.batch.BatchUpdateParams
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Create multiple exchange rates in a single request. */
    fun create(params: BatchCreateParams): BatchResponseExchangeRate =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate

    /** @see create */
    fun create(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate =
        create(
            BatchCreateParams.builder()
                .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
    ): BatchResponseExchangeRate =
        create(batchInputExchangeRateCreateRequest, RequestOptions.none())

    /** Update the conversion rates for multiple exchange rates in a batch operation. */
    fun update(params: BatchUpdateParams): BatchResponseExchangeRate =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate

    /** @see update */
    fun update(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate =
        update(
            BatchUpdateParams.builder()
                .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
    ): BatchResponseExchangeRate =
        update(batchInputExchangeRateUpdateRequest, RequestOptions.none())

    /**
     * Retrieve the details of multiple exchange rates in a single request, specified by their IDs.
     */
    fun get(params: BatchGetParams): BatchResponseExchangeRate = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate

    /** @see get */
    fun get(
        batchInputPublicObjectId: BatchInputPublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseExchangeRate =
        get(
            BatchGetParams.builder().batchInputPublicObjectId(batchInputPublicObjectId).build(),
            requestOptions,
        )

    /** @see get */
    fun get(batchInputPublicObjectId: BatchInputPublicObjectId): BatchResponseExchangeRate =
        get(batchInputPublicObjectId, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/batch/create`, but is otherwise the same as
         * [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponseExchangeRate> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate>

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate> =
            create(
                BatchCreateParams.builder()
                    .batchInputExchangeRateCreateRequest(batchInputExchangeRateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputExchangeRateCreateRequest: BatchInputExchangeRateCreateRequest
        ): HttpResponseFor<BatchResponseExchangeRate> =
            create(batchInputExchangeRateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/batch/update`, but is otherwise the same as
         * [BatchService.update].
         */
        @MustBeClosed
        fun update(params: BatchUpdateParams): HttpResponseFor<BatchResponseExchangeRate> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate>

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate> =
            update(
                BatchUpdateParams.builder()
                    .batchInputExchangeRateUpdateRequest(batchInputExchangeRateUpdateRequest)
                    .build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputExchangeRateUpdateRequest: BatchInputExchangeRateUpdateRequest
        ): HttpResponseFor<BatchResponseExchangeRate> =
            update(batchInputExchangeRateUpdateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /settings/currencies/2026-03/exchange-rates/batch/read`, but is otherwise the same as
         * [BatchService.get].
         */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchResponseExchangeRate> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate>

        /** @see get */
        @MustBeClosed
        fun get(
            batchInputPublicObjectId: BatchInputPublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseExchangeRate> =
            get(
                BatchGetParams.builder().batchInputPublicObjectId(batchInputPublicObjectId).build(),
                requestOptions,
            )

        /** @see get */
        @MustBeClosed
        fun get(
            batchInputPublicObjectId: BatchInputPublicObjectId
        ): HttpResponseFor<BatchResponseExchangeRate> =
            get(batchInputPublicObjectId, RequestOptions.none())
    }
}
