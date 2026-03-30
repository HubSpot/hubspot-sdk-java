// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.timeline.BatchInputAppEventOccurrence
import com.hubspot_sdk.api.models.crm.timeline.BatchResponseAppEventOccurrence
import com.hubspot_sdk.api.models.crm.timeline.batch.BatchCreateParams
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

    fun create(params: BatchCreateParams): CompletableFuture<BatchResponseAppEventOccurrence> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseAppEventOccurrence>

    /** @see create */
    fun create(
        batchInputAppEventOccurrence: BatchInputAppEventOccurrence,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseAppEventOccurrence> =
        create(
            BatchCreateParams.builder()
                .batchInputAppEventOccurrence(batchInputAppEventOccurrence)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputAppEventOccurrence: BatchInputAppEventOccurrence
    ): CompletableFuture<BatchResponseAppEventOccurrence> =
        create(batchInputAppEventOccurrence, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /integrators/timeline/2026-03/events/batch`, but is
         * otherwise the same as [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseAppEventOccurrence>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseAppEventOccurrence>>

        /** @see create */
        fun create(
            batchInputAppEventOccurrence: BatchInputAppEventOccurrence,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseAppEventOccurrence>> =
            create(
                BatchCreateParams.builder()
                    .batchInputAppEventOccurrence(batchInputAppEventOccurrence)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            batchInputAppEventOccurrence: BatchInputAppEventOccurrence
        ): CompletableFuture<HttpResponseFor<BatchResponseAppEventOccurrence>> =
            create(batchInputAppEventOccurrence, RequestOptions.none())
    }
}
