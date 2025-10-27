// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.events.send.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.BehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.SendSendBatchParams
import com.hubspot_sdk.api.models.events.send.SendSendParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync

    /** Send data for a single event completion. */
    fun send(params: SendSendParams): CompletableFuture<Void?> = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: SendSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see send */
    fun send(
        behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        send(
            SendSendParams.builder()
                .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                .build(),
            requestOptions,
        )

    /** @see send */
    fun send(
        behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest
    ): CompletableFuture<Void?> = send(behavioralEventHttpCompletionRequest, RequestOptions.none())

    /** Send multiple event completions at once. */
    fun sendBatch(params: SendSendBatchParams): CompletableFuture<Void?> =
        sendBatch(params, RequestOptions.none())

    /** @see sendBatch */
    fun sendBatch(
        params: SendSendBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see sendBatch */
    fun sendBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        sendBatch(
            SendSendBatchParams.builder()
                .batchedBehavioralEventHttpCompletionRequest(
                    batchedBehavioralEventHttpCompletionRequest
                )
                .build(),
            requestOptions,
        )

    /** @see sendBatch */
    fun sendBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
    ): CompletableFuture<Void?> =
        sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    /** A view of [SendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/v3/send`, but is otherwise the same as
         * [SendServiceAsync.send].
         */
        fun send(params: SendSendParams): CompletableFuture<HttpResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: SendSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see send */
        fun send(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            send(
                SendSendParams.builder()
                    .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                    .build(),
                requestOptions,
            )

        /** @see send */
        fun send(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest
        ): CompletableFuture<HttpResponse> =
            send(behavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /events/v3/send/batch`, but is otherwise the same
         * as [SendServiceAsync.sendBatch].
         */
        fun sendBatch(params: SendSendBatchParams): CompletableFuture<HttpResponse> =
            sendBatch(params, RequestOptions.none())

        /** @see sendBatch */
        fun sendBatch(
            params: SendSendBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see sendBatch */
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendBatch(
                SendSendBatchParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see sendBatch */
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): CompletableFuture<HttpResponse> =
            sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())
    }
}
