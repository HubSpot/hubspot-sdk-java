// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot.models.events.BehavioralEventHttpCompletionRequest
import com.hubspot.models.events.send.SendBatchSendParams
import com.hubspot.models.events.send.SendSendParams
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

    /** Send multiple event occurrences at once. */
    fun batchSend(params: SendBatchSendParams) = batchSend(params, RequestOptions.none())

    /** @see batchSend */
    fun batchSend(
        params: SendBatchSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see batchSend */
    fun batchSend(
        batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
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
    ) = batchSend(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

    /** Send data for a single custom event occurrence. */
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

    /** A view of [SendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /events/2026-03/send/batch`, but is otherwise the
         * same as [SendService.batchSend].
         */
        @MustBeClosed
        fun batchSend(params: SendBatchSendParams): HttpResponse =
            batchSend(params, RequestOptions.none())

        /** @see batchSend */
        @MustBeClosed
        fun batchSend(
            params: SendBatchSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see batchSend */
        @MustBeClosed
        fun batchSend(
            batchedBehavioralEventHttpCompletionRequest:
                BatchedBehavioralEventHttpCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            batchSend(
                SendBatchSendParams.builder()
                    .batchedBehavioralEventHttpCompletionRequest(
                        batchedBehavioralEventHttpCompletionRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see batchSend */
        @MustBeClosed
        fun batchSend(
            batchedBehavioralEventHttpCompletionRequest: BatchedBehavioralEventHttpCompletionRequest
        ): HttpResponse =
            batchSend(batchedBehavioralEventHttpCompletionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /events/2026-03/send`, but is otherwise the same as
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
    }
}
