// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.ActionResponse
import com.hubspot_sdk.api.models.TaskLocator
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeCreateParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeCreateResponse
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeDeleteParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetExtractionStatusParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetMetadataParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetMetadataResponse
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeUpsertParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeUpsertResponse
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeValidateParams
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
    fun create(path: String, params: SourceCodeCreateParams): SourceCodeCreateResponse =
        create(path, params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        path: String,
        params: SourceCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCodeCreateResponse = create(params.toBuilder().path(path).build(), requestOptions)

    /** @see create */
    @Deprecated("deprecated")
    fun create(params: SourceCodeCreateParams): SourceCodeCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: SourceCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCodeCreateResponse

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
    fun getMetadata(
        path: String,
        params: SourceCodeGetMetadataParams,
    ): SourceCodeGetMetadataResponse = getMetadata(path, params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        path: String,
        params: SourceCodeGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCodeGetMetadataResponse =
        getMetadata(params.toBuilder().path(path).build(), requestOptions)

    /** @see getMetadata */
    fun getMetadata(params: SourceCodeGetMetadataParams): SourceCodeGetMetadataResponse =
        getMetadata(params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        params: SourceCodeGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCodeGetMetadataResponse

    /**
     * Upserts a file at the specified path in the specified environment. Accepts
     * multipart/form-data content type.
     */
    fun upsert(path: String, params: SourceCodeUpsertParams): SourceCodeUpsertResponse =
        upsert(path, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        path: String,
        params: SourceCodeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCodeUpsertResponse = upsert(params.toBuilder().path(path).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: SourceCodeUpsertParams): SourceCodeUpsertResponse =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: SourceCodeUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SourceCodeUpsertResponse

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
         * Returns a raw HTTP response for `post /cms/v3/source-code/{environment}/content/{path}`,
         * but is otherwise the same as [SourceCodeService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            path: String,
            params: SourceCodeCreateParams,
        ): HttpResponseFor<SourceCodeCreateResponse> = create(path, params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            path: String,
            params: SourceCodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCodeCreateResponse> =
            create(params.toBuilder().path(path).build(), requestOptions)

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: SourceCodeCreateParams): HttpResponseFor<SourceCodeCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: SourceCodeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCodeCreateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/v3/source-code/{environment}/content/{path}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `post /cms/v3/source-code/extract/async`, but is
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

        /**
         * Returns a raw HTTP response for `get /cms/v3/source-code/{environment}/content/{path}`,
         * but is otherwise the same as [SourceCodeService.get].
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
         * /cms/v3/source-code/extract/async/tasks/{taskId}/status`, but is otherwise the same as
         * [SourceCodeService.getExtractionStatus].
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
         * Returns a raw HTTP response for `get /cms/v3/source-code/{environment}/metadata/{path}`,
         * but is otherwise the same as [SourceCodeService.getMetadata].
         */
        @MustBeClosed
        fun getMetadata(
            path: String,
            params: SourceCodeGetMetadataParams,
        ): HttpResponseFor<SourceCodeGetMetadataResponse> =
            getMetadata(path, params, RequestOptions.none())

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            path: String,
            params: SourceCodeGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCodeGetMetadataResponse> =
            getMetadata(params.toBuilder().path(path).build(), requestOptions)

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            params: SourceCodeGetMetadataParams
        ): HttpResponseFor<SourceCodeGetMetadataResponse> =
            getMetadata(params, RequestOptions.none())

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            params: SourceCodeGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCodeGetMetadataResponse>

        /**
         * Returns a raw HTTP response for `put /cms/v3/source-code/{environment}/content/{path}`,
         * but is otherwise the same as [SourceCodeService.upsert].
         */
        @MustBeClosed
        fun upsert(
            path: String,
            params: SourceCodeUpsertParams,
        ): HttpResponseFor<SourceCodeUpsertResponse> = upsert(path, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            path: String,
            params: SourceCodeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCodeUpsertResponse> =
            upsert(params.toBuilder().path(path).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(params: SourceCodeUpsertParams): HttpResponseFor<SourceCodeUpsertResponse> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: SourceCodeUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SourceCodeUpsertResponse>

        /**
         * Returns a raw HTTP response for `post /cms/v3/source-code/{environment}/validate/{path}`,
         * but is otherwise the same as [SourceCodeService.validate].
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
