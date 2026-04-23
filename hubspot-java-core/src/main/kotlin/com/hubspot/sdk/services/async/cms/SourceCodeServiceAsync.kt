// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.ActionResponse
import com.hubspot.sdk.models.TaskLocator
import com.hubspot.sdk.models.cms.sourcecode.FileExtractRequest
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeGetExtractionStatusParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SourceCodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceCodeServiceAsync

    /**
     * Extract a zip file in the developer file system. Extraction status can be checked with the
     * `/extract/async/tasks/taskId/status` endpoint below.
     */
    fun extractAsync(params: SourceCodeExtractAsyncParams): CompletableFuture<TaskLocator> =
        extractAsync(params, RequestOptions.none())

    /** @see extractAsync */
    fun extractAsync(
        params: SourceCodeExtractAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator>

    /** @see extractAsync */
    fun extractAsync(
        fileExtractRequest: FileExtractRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator> =
        extractAsync(
            SourceCodeExtractAsyncParams.builder().fileExtractRequest(fileExtractRequest).build(),
            requestOptions,
        )

    /** @see extractAsync */
    fun extractAsync(fileExtractRequest: FileExtractRequest): CompletableFuture<TaskLocator> =
        extractAsync(fileExtractRequest, RequestOptions.none())

    /**
     * Get the status of an extraction by the `taskId` returned from the initial `extract/async`
     * request.
     */
    fun getExtractionStatus(taskId: Int): CompletableFuture<ActionResponse> =
        getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none())

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        taskId: Int,
        params: SourceCodeGetExtractionStatusParams = SourceCodeGetExtractionStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponse> =
        getExtractionStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        taskId: Int,
        params: SourceCodeGetExtractionStatusParams = SourceCodeGetExtractionStatusParams.none(),
    ): CompletableFuture<ActionResponse> =
        getExtractionStatus(taskId, params, RequestOptions.none())

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        params: SourceCodeGetExtractionStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponse>

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        params: SourceCodeGetExtractionStatusParams
    ): CompletableFuture<ActionResponse> = getExtractionStatus(params, RequestOptions.none())

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        taskId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponse> =
        getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none(), requestOptions)

    /**
     * A view of [SourceCodeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SourceCodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/source-code/2026-03/extract/async`, but is
         * otherwise the same as [SourceCodeServiceAsync.extractAsync].
         */
        fun extractAsync(
            params: SourceCodeExtractAsyncParams
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            extractAsync(params, RequestOptions.none())

        /** @see extractAsync */
        fun extractAsync(
            params: SourceCodeExtractAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>>

        /** @see extractAsync */
        fun extractAsync(
            fileExtractRequest: FileExtractRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            extractAsync(
                SourceCodeExtractAsyncParams.builder()
                    .fileExtractRequest(fileExtractRequest)
                    .build(),
                requestOptions,
            )

        /** @see extractAsync */
        fun extractAsync(
            fileExtractRequest: FileExtractRequest
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            extractAsync(fileExtractRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/source-code/2026-03/extract/async/tasks/{taskId}/status`, but is otherwise the same
         * as [SourceCodeServiceAsync.getExtractionStatus].
         */
        fun getExtractionStatus(taskId: Int): CompletableFuture<HttpResponseFor<ActionResponse>> =
            getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none())

        /** @see getExtractionStatus */
        fun getExtractionStatus(
            taskId: Int,
            params: SourceCodeGetExtractionStatusParams =
                SourceCodeGetExtractionStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponse>> =
            getExtractionStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getExtractionStatus */
        fun getExtractionStatus(
            taskId: Int,
            params: SourceCodeGetExtractionStatusParams = SourceCodeGetExtractionStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponse>> =
            getExtractionStatus(taskId, params, RequestOptions.none())

        /** @see getExtractionStatus */
        fun getExtractionStatus(
            params: SourceCodeGetExtractionStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponse>>

        /** @see getExtractionStatus */
        fun getExtractionStatus(
            params: SourceCodeGetExtractionStatusParams
        ): CompletableFuture<HttpResponseFor<ActionResponse>> =
            getExtractionStatus(params, RequestOptions.none())

        /** @see getExtractionStatus */
        fun getExtractionStatus(
            taskId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponse>> =
            getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none(), requestOptions)
    }
}
