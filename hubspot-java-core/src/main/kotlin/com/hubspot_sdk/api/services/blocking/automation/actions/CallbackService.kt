// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.callbacks.CallbackCompleteBatchParams
import com.hubspot_sdk.api.models.automation.actions.callbacks.CallbackCompleteParams
import java.util.function.Consumer

interface CallbackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallbackService

    /** Complete a specific blocked action execution by ID. */
    fun complete(callbackId: String, params: CallbackCompleteParams) =
        complete(callbackId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        callbackId: String,
        params: CallbackCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

    /** @see complete */
    fun complete(params: CallbackCompleteParams) = complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: CallbackCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Complete a batch of blocked action executions. */
    fun completeBatch(params: CallbackCompleteBatchParams) =
        completeBatch(params, RequestOptions.none())

    /** @see completeBatch */
    fun completeBatch(
        params: CallbackCompleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        completeBatch(
            CallbackCompleteBatchParams.builder()
                .batchInputCallbackCompletionBatchRequest(batchInputCallbackCompletionBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see completeBatch */
    fun completeBatch(
        batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
    ) = completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())

    /** A view of [CallbackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallbackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /automation/actions/callbacks/2026-03/{callbackId}/complete`, but is otherwise the same
         * as [CallbackService.complete].
         */
        @MustBeClosed
        fun complete(callbackId: String, params: CallbackCompleteParams): HttpResponse =
            complete(callbackId, params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            callbackId: String,
            params: CallbackCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            complete(params.toBuilder().callbackId(callbackId).build(), requestOptions)

        /** @see complete */
        @MustBeClosed
        fun complete(params: CallbackCompleteParams): HttpResponse =
            complete(params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: CallbackCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /automation/actions/callbacks/2026-03/complete`,
         * but is otherwise the same as [CallbackService.completeBatch].
         */
        @MustBeClosed
        fun completeBatch(params: CallbackCompleteBatchParams): HttpResponse =
            completeBatch(params, RequestOptions.none())

        /** @see completeBatch */
        @MustBeClosed
        fun completeBatch(
            params: CallbackCompleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see completeBatch */
        @MustBeClosed
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            completeBatch(
                CallbackCompleteBatchParams.builder()
                    .batchInputCallbackCompletionBatchRequest(
                        batchInputCallbackCompletionBatchRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see completeBatch */
        @MustBeClosed
        fun completeBatch(
            batchInputCallbackCompletionBatchRequest: BatchInputCallbackCompletionBatchRequest
        ): HttpResponse =
            completeBatch(batchInputCallbackCompletionBatchRequest, RequestOptions.none())
    }
}
