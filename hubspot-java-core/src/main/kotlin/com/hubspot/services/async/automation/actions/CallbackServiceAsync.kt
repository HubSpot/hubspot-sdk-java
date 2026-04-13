// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.automation.actions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot.models.automation.actions.callbacks.CallbackCompleteBatchParams
import com.hubspot.models.automation.actions.callbacks.CallbackCompleteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallbackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallbackServiceAsync

    /** Complete a specific blocked action execution by ID. */
    fun complete(callbackId: String, params: CallbackCompleteParams): CompletableFuture<Void?> =
        complete(callbackId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        callbackId: String,
        params: CallbackCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

    /** @see complete */
    fun complete(params: CallbackCompleteParams): CompletableFuture<Void?> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: CallbackCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Complete a batch of blocked action executions. */
    fun completeBatch(params: CallbackCompleteBatchParams): CompletableFuture<Void?> =
        completeBatch(params, RequestOptions.none())

    /** @see completeBatch */
    fun completeBatch(
        params: CallbackCompleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        completeBatch(
            CallbackCompleteBatchParams.builder()
                .batchInputCallbackCompletionBatchRequest(batchInputCallbackCompletionBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
    ): CompletableFuture<Void?> =
        completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())

    /**
     * A view of [CallbackServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallbackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /automation/actions/callbacks/2026-03/{callbackId}/complete`, but is otherwise the same
         * as [CallbackServiceAsync.complete].
         */
        fun complete(
            callbackId: String,
            params: CallbackCompleteParams,
        ): CompletableFuture<HttpResponse> = complete(callbackId, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            callbackId: String,
            params: CallbackCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

        /** @see complete */
        fun complete(params: CallbackCompleteParams): CompletableFuture<HttpResponse> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: CallbackCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /automation/actions/callbacks/2026-03/complete`,
         * but is otherwise the same as [CallbackServiceAsync.completeBatch].
         */
        fun completeBatch(params: CallbackCompleteBatchParams): CompletableFuture<HttpResponse> =
            completeBatch(params, RequestOptions.none())

        /** @see completeBatch */
        fun completeBatch(
            params: CallbackCompleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see completeBatch */
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            completeBatch(
                CallbackCompleteBatchParams.builder()
                    .batchInputCallbackCompletionBatchRequest(
                        batchInputCallbackCompletionBatchRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see completeBatch */
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
        ): CompletableFuture<HttpResponse> =
            completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())
    }
}
