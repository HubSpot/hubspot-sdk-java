// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.events.send.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.BehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.SendSendBatchParams
import com.hubspot_sdk.api.models.events.send.SendSendParams
import java.util.function.Consumer

interface SendService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService

    /** Send data for a single event completion. */
    fun send(params: SendSendParams) = send(params, RequestOptions.none())

    /** @see send */
    fun send(params: SendSendParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see send */
    fun send(
        behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        send(
            SendSendParams.builder()
                .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                .build(),
            requestOptions,
        )

    /** @see send */
    fun send(behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest) =
        send(behavioralEventHttpCompletionRequest, RequestOptions.none())

    /** Send multiple event completions at once. */
    fun sendBatch(params: SendSendBatchParams) = sendBatch(params, RequestOptions.none())

    /** @see sendBatch */
    fun sendBatch(
        params: SendSendBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see sendBatch */
    fun sendBatch(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
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
    ) = sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    /** A view of [SendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/v3/send`, but is otherwise the same as
         * [SendService.send].
         */
        @MustBeClosed
        fun send(params: SendSendParams): HttpResponse = send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: SendSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see send */
        @MustBeClosed
        fun send(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            send(
                SendSendParams.builder()
                    .behavioralEventHttpCompletionRequest(behavioralEventHttpCompletionRequest)
                    .build(),
                requestOptions,
            )

        /** @see send */
        @MustBeClosed
        fun send(
            behavioralEventHttpCompletionRequest: BehavioralEventHttpCompletionRequest
        ): HttpResponse = send(behavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /events/v3/send/batch`, but is otherwise the same
         * as [SendService.sendBatch].
         */
        @MustBeClosed
        fun sendBatch(params: SendSendBatchParams): HttpResponse =
            sendBatch(params, RequestOptions.none())

        /** @see sendBatch */
        @MustBeClosed
        fun sendBatch(
            params: SendSendBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see sendBatch */
        @MustBeClosed
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            sendBatch(
                SendSendBatchParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see sendBatch */
        @MustBeClosed
        fun sendBatch(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): HttpResponse =
            sendBatch(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())
    }
}
