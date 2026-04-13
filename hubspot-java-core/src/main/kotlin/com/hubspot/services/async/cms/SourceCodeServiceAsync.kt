// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.ActionResponse
import com.hubspot.models.TaskLocator
import com.hubspot.models.cms.sourcecode.AssetFileMetadata
import com.hubspot.models.cms.sourcecode.FileExtractRequest
import com.hubspot.models.cms.sourcecode.SourceCodeCreateParams
import com.hubspot.models.cms.sourcecode.SourceCodeDeleteParams
import com.hubspot.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot.models.cms.sourcecode.SourceCodeGetExtractionStatusParams
import com.hubspot.models.cms.sourcecode.SourceCodeGetMetadataParams
import com.hubspot.models.cms.sourcecode.SourceCodeGetParams
import com.hubspot.models.cms.sourcecode.SourceCodeUpsertParams
import com.hubspot.models.cms.sourcecode.SourceCodeValidateParams
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
     * Creates a file at the specified path in the specified environment. Accepts
     * multipart/form-data content type. Throws an error if a file already exists at the specified
     * path.
     */
    @Deprecated("deprecated")
    fun create(path: String, params: SourceCodeCreateParams): CompletableFuture<AssetFileMetadata> =
        create(path, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        path: String,
        params: SourceCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetFileMetadata> =
        create(params.toBuilder().path(path).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: SourceCodeCreateParams): CompletableFuture<AssetFileMetadata> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: SourceCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetFileMetadata>

    /** Deletes the file at the specified path in the specified environment. */
    fun delete(path: String, params: SourceCodeDeleteParams): CompletableFuture<Void?> =
        delete(path, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        path: String,
        params: SourceCodeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().path(path).build(), requestOptions)

    /** @see delete */
    fun delete(params: SourceCodeDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SourceCodeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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
     * Downloads the byte contents of the file at the specified path in the specified environment.
     */
    fun get(path: String, params: SourceCodeGetParams): CompletableFuture<HttpResponse> =
        get(path, params, RequestOptions.none())

    /** @see get */
    fun get(
        path: String,
        params: SourceCodeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> = get(params.toBuilder().path(path).build(), requestOptions)

    /** @see get */
    fun get(params: SourceCodeGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SourceCodeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

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

    /** Gets the metadata object for the file at the specified path in the specified environment. */
    fun getMetadata(
        path: String,
        params: SourceCodeGetMetadataParams,
    ): CompletableFuture<AssetFileMetadata> = getMetadata(path, params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        path: String,
        params: SourceCodeGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetFileMetadata> =
        getMetadata(params.toBuilder().path(path).build(), requestOptions)

    /** @see getMetadata */
    fun getMetadata(params: SourceCodeGetMetadataParams): CompletableFuture<AssetFileMetadata> =
        getMetadata(params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        params: SourceCodeGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetFileMetadata>

    /**
     * Upserts a file at the specified path in the specified environment. Accepts
     * multipart/form-data content type.
     */
    fun upsert(path: String, params: SourceCodeUpsertParams): CompletableFuture<AssetFileMetadata> =
        upsert(path, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        path: String,
        params: SourceCodeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetFileMetadata> =
        upsert(params.toBuilder().path(path).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: SourceCodeUpsertParams): CompletableFuture<AssetFileMetadata> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: SourceCodeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetFileMetadata>

    /**
     * Validates the file contents passed to the endpoint given a specified path and environment.
     * Accepts multipart/form-data content type.
     */
    fun validate(path: String, params: SourceCodeValidateParams): CompletableFuture<HttpResponse> =
        validate(path, params, RequestOptions.none())

    /** @see validate */
    fun validate(
        path: String,
        params: SourceCodeValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        validate(params.toBuilder().path(path).build(), requestOptions)

    /** @see validate */
    fun validate(params: SourceCodeValidateParams): CompletableFuture<HttpResponse> =
        validate(params, RequestOptions.none())

    /** @see validate */
    fun validate(
        params: SourceCodeValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

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
         * Returns a raw HTTP response for `post
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeServiceAsync.create].
         */
        @Deprecated("deprecated")
        fun create(
            path: String,
            params: SourceCodeCreateParams,
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            create(path, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            path: String,
            params: SourceCodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            create(params.toBuilder().path(path).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: SourceCodeCreateParams
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: SourceCodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeServiceAsync.delete].
         */
        fun delete(path: String, params: SourceCodeDeleteParams): CompletableFuture<HttpResponse> =
            delete(path, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            path: String,
            params: SourceCodeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().path(path).build(), requestOptions)

        /** @see delete */
        fun delete(params: SourceCodeDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SourceCodeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

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
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeServiceAsync.get].
         */
        fun get(path: String, params: SourceCodeGetParams): CompletableFuture<HttpResponse> =
            get(path, params, RequestOptions.none())

        /** @see get */
        fun get(
            path: String,
            params: SourceCodeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            get(params.toBuilder().path(path).build(), requestOptions)

        /** @see get */
        fun get(params: SourceCodeGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SourceCodeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

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

        /**
         * Returns a raw HTTP response for `get
         * /cms/source-code/2026-03/{environment}/metadata/{path}`, but is otherwise the same as
         * [SourceCodeServiceAsync.getMetadata].
         */
        fun getMetadata(
            path: String,
            params: SourceCodeGetMetadataParams,
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            getMetadata(path, params, RequestOptions.none())

        /** @see getMetadata */
        fun getMetadata(
            path: String,
            params: SourceCodeGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            getMetadata(params.toBuilder().path(path).build(), requestOptions)

        /** @see getMetadata */
        fun getMetadata(
            params: SourceCodeGetMetadataParams
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            getMetadata(params, RequestOptions.none())

        /** @see getMetadata */
        fun getMetadata(
            params: SourceCodeGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>>

        /**
         * Returns a raw HTTP response for `put
         * /cms/source-code/2026-03/{environment}/content/{path}`, but is otherwise the same as
         * [SourceCodeServiceAsync.upsert].
         */
        fun upsert(
            path: String,
            params: SourceCodeUpsertParams,
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            upsert(path, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            path: String,
            params: SourceCodeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            upsert(params.toBuilder().path(path).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            params: SourceCodeUpsertParams
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: SourceCodeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetFileMetadata>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/source-code/2026-03/{environment}/validate/{path}`, but is otherwise the same as
         * [SourceCodeServiceAsync.validate].
         */
        fun validate(
            path: String,
            params: SourceCodeValidateParams,
        ): CompletableFuture<HttpResponse> = validate(path, params, RequestOptions.none())

        /** @see validate */
        fun validate(
            path: String,
            params: SourceCodeValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            validate(params.toBuilder().path(path).build(), requestOptions)

        /** @see validate */
        fun validate(params: SourceCodeValidateParams): CompletableFuture<HttpResponse> =
            validate(params, RequestOptions.none())

        /** @see validate */
        fun validate(
            params: SourceCodeValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
