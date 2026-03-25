// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.ActionResponse
import com.hubspot_sdk.api.models.TaskLocator
import com.hubspot_sdk.api.models.cms.sourcecode.AssetFileMetadata
import com.hubspot_sdk.api.models.cms.sourcecode.FileExtractRequest
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeCreateParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeDeleteParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetExtractionStatusParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetMetadataParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeUpsertParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeValidateParams
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
     * Upload a content file to a specified environment and path in the HubSpot CMS. This endpoint
     * allows you to add new content files to your HubSpot account by specifying the environment and
     * path where the file should be stored. The request must include a file in binary format.
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

    /**
     * Delete a specific content file from the specified environment in your HubSpot CMS. This
     * operation is useful for removing outdated or unnecessary files from your source code
     * repository. Ensure you have the necessary permissions to perform this action.
     */
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
     * Initiate an asynchronous extraction of source code files in the HubSpot CMS. This endpoint is
     * useful for handling large file extractions without blocking the client application. Upon
     * acceptance, it returns a task locator that can be used to check the status of the extraction
     * process.
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
     * Retrieve content from the specified environment and path in your HubSpot CMS. This endpoint
     * allows you to access specific content files based on the environment and path parameters,
     * which can be useful for managing and displaying content in different environments.
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
     * Retrieve the status of an asynchronous task related to source code extraction. This endpoint
     * is useful for checking the progress or completion of a task initiated through the
     * asynchronous file extraction process.
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
     * Retrieve metadata for a specific file or folder within a specified environment in the HubSpot
     * CMS. This endpoint is useful for obtaining detailed information about content files, such as
     * their creation and update timestamps, and other metadata attributes.
     */
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
     * Update the content file in the specified environment and path within the HubSpot CMS. This
     * operation allows you to upload a new file to replace the existing content at the given path.
     * It is useful for managing and updating your website's source code files directly through the
     * API.
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
     * Validate a source code file within a specified environment in your HubSpot account. This
     * endpoint is useful for checking the correctness of code files before deployment or further
     * processing. The validation process requires the file to be uploaded in a multipart/form-data
     * request.
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
