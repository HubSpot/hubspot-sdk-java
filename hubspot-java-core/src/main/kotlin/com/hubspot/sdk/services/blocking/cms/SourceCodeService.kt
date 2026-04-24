// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.ActionResponse
import com.hubspot.sdk.models.TaskLocator
import com.hubspot.sdk.models.cms.sourcecode.FileExtractRequest
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeGetExtractionStatusParams
import java.util.function.Consumer

interface SourceCodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceCodeService

    /**
     * Extract a zip file in the developer file system. Extraction status can be checked with the
     * `/extract/async/tasks/taskId/status` endpoint below.
     */
    fun extractAsync(params: SourceCodeExtractAsyncParams): TaskLocator =
        extractAsync(params, RequestOptions.none())

    /** @see extractAsync */
    fun extractAsync(
        params: SourceCodeExtractAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator

    /** @see extractAsync */
    fun extractAsync(
        fileExtractRequest: FileExtractRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator =
        extractAsync(
            SourceCodeExtractAsyncParams.builder().fileExtractRequest(fileExtractRequest).build(),
            requestOptions,
        )

    /** @see extractAsync */
    fun extractAsync(fileExtractRequest: FileExtractRequest): TaskLocator =
        extractAsync(fileExtractRequest, RequestOptions.none())

    /**
     * Get the status of an extraction by the `taskId` returned from the initial `extract/async`
     * request.
     */
    fun getExtractionStatus(taskId: Int): ActionResponse =
        getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none())

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        taskId: Int,
        params: SourceCodeGetExtractionStatusParams = SourceCodeGetExtractionStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponse =
        getExtractionStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        taskId: Int,
        params: SourceCodeGetExtractionStatusParams = SourceCodeGetExtractionStatusParams.none(),
    ): ActionResponse = getExtractionStatus(taskId, params, RequestOptions.none())

    /** @see getExtractionStatus */
    fun getExtractionStatus(
        params: SourceCodeGetExtractionStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponse

    /** @see getExtractionStatus */
    fun getExtractionStatus(params: SourceCodeGetExtractionStatusParams): ActionResponse =
        getExtractionStatus(params, RequestOptions.none())

    /** @see getExtractionStatus */
    fun getExtractionStatus(taskId: Int, requestOptions: RequestOptions): ActionResponse =
        getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none(), requestOptions)

    /** A view of [SourceCodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SourceCodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/source-code/2026-03/extract/async`, but is
         * otherwise the same as [SourceCodeService.extractAsync].
         */
        @MustBeClosed
        fun extractAsync(params: SourceCodeExtractAsyncParams): HttpResponseFor<TaskLocator> =
            extractAsync(params, RequestOptions.none())

        /** @see extractAsync */
        @MustBeClosed
        fun extractAsync(
            params: SourceCodeExtractAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator>

        /** @see extractAsync */
        @MustBeClosed
        fun extractAsync(
            fileExtractRequest: FileExtractRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator> =
            extractAsync(
                SourceCodeExtractAsyncParams.builder()
                    .fileExtractRequest(fileExtractRequest)
                    .build(),
                requestOptions,
            )

        /** @see extractAsync */
        @MustBeClosed
        fun extractAsync(fileExtractRequest: FileExtractRequest): HttpResponseFor<TaskLocator> =
            extractAsync(fileExtractRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/source-code/2026-03/extract/async/tasks/{taskId}/status`, but is otherwise the same
         * as [SourceCodeService.getExtractionStatus].
         */
        @MustBeClosed
        fun getExtractionStatus(taskId: Int): HttpResponseFor<ActionResponse> =
            getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none())

        /** @see getExtractionStatus */
        @MustBeClosed
        fun getExtractionStatus(
            taskId: Int,
            params: SourceCodeGetExtractionStatusParams =
                SourceCodeGetExtractionStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponse> =
            getExtractionStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getExtractionStatus */
        @MustBeClosed
        fun getExtractionStatus(
            taskId: Int,
            params: SourceCodeGetExtractionStatusParams = SourceCodeGetExtractionStatusParams.none(),
        ): HttpResponseFor<ActionResponse> =
            getExtractionStatus(taskId, params, RequestOptions.none())

        /** @see getExtractionStatus */
        @MustBeClosed
        fun getExtractionStatus(
            params: SourceCodeGetExtractionStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponse>

        /** @see getExtractionStatus */
        @MustBeClosed
        fun getExtractionStatus(
            params: SourceCodeGetExtractionStatusParams
        ): HttpResponseFor<ActionResponse> = getExtractionStatus(params, RequestOptions.none())

        /** @see getExtractionStatus */
        @MustBeClosed
        fun getExtractionStatus(
            taskId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponse> =
            getExtractionStatus(taskId, SourceCodeGetExtractionStatusParams.none(), requestOptions)
    }
}
