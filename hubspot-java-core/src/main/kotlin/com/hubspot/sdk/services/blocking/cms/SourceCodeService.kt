// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.ActionResponse
import com.hubspot.sdk.models.TaskLocator
import com.hubspot.sdk.models.cms.sourcecode.AssetFileMetadata
import com.hubspot.sdk.models.cms.sourcecode.FileExtractRequest
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeCreateParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeDeleteParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeGetExtractionStatusParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeGetMetadataParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeGetParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeUpsertParams
import com.hubspot.sdk.models.cms.sourcecode.SourceCodeValidateParams
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
     * Creates a file at the specified path in the specified environment. Accepts
     * multipart/form-data content type. Throws an error if a file already exists at the specified
     * path.
     */
    @Deprecated("deprecated")
    fun create(path: String, params: SourceCodeCreateParams): AssetFileMetadata =
        create(path, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        path: String,
        params: SourceCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetFileMetadata = create(params.toBuilder().path(path).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: SourceCodeCreateParams): AssetFileMetadata =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: SourceCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetFileMetadata

    /** Deletes the file at the specified path in the specified environment. */
    fun delete(path: String, params: SourceCodeDeleteParams) =
        delete(path, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        path: String,
        params: SourceCodeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().path(path).build(), requestOptions)

    /** @see delete */
    fun delete(params: SourceCodeDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SourceCodeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
     * Downloads the byte contents of the file at the specified path in the specified environment.
     */
    @MustBeClosed
    fun get(path: String, params: SourceCodeGetParams): HttpResponse =
        get(path, params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        path: String,
        params: SourceCodeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = get(params.toBuilder().path(path).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(params: SourceCodeGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: SourceCodeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

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

    /** Gets the metadata object for the file at the specified path in the specified environment. */
    fun getMetadata(path: String, params: SourceCodeGetMetadataParams): AssetFileMetadata =
        getMetadata(path, params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        path: String,
        params: SourceCodeGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetFileMetadata = getMetadata(params.toBuilder().path(path).build(), requestOptions)

    /** @see getMetadata */
    fun getMetadata(params: SourceCodeGetMetadataParams): AssetFileMetadata =
        getMetadata(params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        params: SourceCodeGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetFileMetadata

    /**
     * Upserts a file at the specified path in the specified environment. Accepts
     * multipart/form-data content type.
     */
    fun upsert(path: String, params: SourceCodeUpsertParams): AssetFileMetadata =
        upsert(path, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        path: String,
        params: SourceCodeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetFileMetadata = upsert(params.toBuilder().path(path).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: SourceCodeUpsertParams): AssetFileMetadata =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: SourceCodeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetFileMetadata

    /**
     * Validates the file contents passed to the endpoint given a specified path and environment.
     * Accepts multipart/form-data content type.
     */
    @MustBeClosed
    fun validate(path: String, params: SourceCodeValidateParams): HttpResponse =
        validate(path, params, RequestOptions.none())

    /** @see validate */
    @MustBeClosed
    fun validate(
        path: String,
        params: SourceCodeValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = validate(params.toBuilder().path(path).build(), requestOptions)

    /** @see validate */
    @MustBeClosed
    fun validate(params: SourceCodeValidateParams): HttpResponse =
        validate(params, RequestOptions.none())

    /** @see validate */
    @MustBeClosed
    fun validate(
        params: SourceCodeValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

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
         * Returns a raw HTTP response for `post
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            path: String,
            params: SourceCodeCreateParams,
        ): HttpResponseFor<AssetFileMetadata> = create(path, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            path: String,
            params: SourceCodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetFileMetadata> =
            create(params.toBuilder().path(path).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: SourceCodeCreateParams): HttpResponseFor<AssetFileMetadata> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: SourceCodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetFileMetadata>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeService.delete].
         */
        @MustBeClosed
        fun delete(path: String, params: SourceCodeDeleteParams): HttpResponse =
            delete(path, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            path: String,
            params: SourceCodeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().path(path).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: SourceCodeDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SourceCodeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeService.get].
         */
        @MustBeClosed
        fun get(path: String, params: SourceCodeGetParams): HttpResponse =
            get(path, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            path: String,
            params: SourceCodeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = get(params.toBuilder().path(path).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: SourceCodeGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SourceCodeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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

        /**
         * Returns a raw HTTP response for `get
         * /cms/source-code/2026-03/{environment}/metadata/{path}`, but is otherwise the same as
         * [SourceCodeService.getMetadata].
         */
        @MustBeClosed
        fun getMetadata(
            path: String,
            params: SourceCodeGetMetadataParams,
        ): HttpResponseFor<AssetFileMetadata> = getMetadata(path, params, RequestOptions.none())

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            path: String,
            params: SourceCodeGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetFileMetadata> =
            getMetadata(params.toBuilder().path(path).build(), requestOptions)

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(params: SourceCodeGetMetadataParams): HttpResponseFor<AssetFileMetadata> =
            getMetadata(params, RequestOptions.none())

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            params: SourceCodeGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetFileMetadata>

        /**
         * Returns a raw HTTP response for `put
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeService.upsert].
         */
        @MustBeClosed
        fun upsert(
            path: String,
            params: SourceCodeUpsertParams,
        ): HttpResponseFor<AssetFileMetadata> = upsert(path, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            path: String,
            params: SourceCodeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetFileMetadata> =
            upsert(params.toBuilder().path(path).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(params: SourceCodeUpsertParams): HttpResponseFor<AssetFileMetadata> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: SourceCodeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetFileMetadata>

        /**
         * Returns a raw HTTP response for `post
         * /cms/source-code/2026-03/{environment}/validate/{path}`, but is otherwise the same as
         * [SourceCodeService.validate].
         */
        @MustBeClosed
        fun validate(path: String, params: SourceCodeValidateParams): HttpResponse =
            validate(path, params, RequestOptions.none())

        /** @see validate */
        @MustBeClosed
        fun validate(
            path: String,
            params: SourceCodeValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = validate(params.toBuilder().path(path).build(), requestOptions)

        /** @see validate */
        @MustBeClosed
        fun validate(params: SourceCodeValidateParams): HttpResponse =
            validate(params, RequestOptions.none())

        /** @see validate */
        @MustBeClosed
        fun validate(
            params: SourceCodeValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
