// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.events

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot.models.events.BehavioralEventHttpCompletionRequest
import com.hubspot.models.events.send.SendBatchSendParams
import com.hubspot.models.events.send.SendSendParams
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

    /** Send multiple event occurrences at once. */
    fun batchSend(params: SendBatchSendParams): CompletableFuture<Void?> =
        batchSend(params, RequestOptions.none())

    /** @see batchSend */
    fun batchSend(
        params: SendBatchSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see batchSend */
    fun batchSend(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        batchSend(
            SendBatchSendParams.builder()
                .batchedBehavioralEventHttpCompletionRequest(
                    batchedBehavioralEventHttpCompletionRequest
                )
                .build(),
            requestOptions,
        )

    /** @see batchSend */
    fun batchSend(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
    ): CompletableFuture<Void?> =
        batchSend(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    /** Send data for a single custom event occurrence. */
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

    /** A view of [SendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/2026-03/send/batch`, but is otherwise the
         * same as [SendServiceAsync.batchSend].
         */
        fun batchSend(params: SendBatchSendParams): CompletableFuture<HttpResponse> =
            batchSend(params, RequestOptions.none())

        /** @see batchSend */
        fun batchSend(
            params: SendBatchSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see batchSend */
        fun batchSend(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            batchSend(
                SendBatchSendParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see batchSend */
        fun batchSend(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): CompletableFuture<HttpResponse> =
            batchSend(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /events/2026-03/send`, but is otherwise the same as
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
    }
}
