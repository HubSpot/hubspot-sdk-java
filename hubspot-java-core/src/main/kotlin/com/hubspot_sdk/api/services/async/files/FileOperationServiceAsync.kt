// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.files.File
import com.hubspot_sdk.api.models.files.FileActionResponse
import com.hubspot_sdk.api.models.files.FileStat
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import com.hubspot_sdk.api.models.files.ImportFromUrlTaskLocator
import com.hubspot_sdk.api.models.files.SignedUrl
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationDeleteParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGdprDeleteParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetByPathParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetImportTaskStatusParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetSignedUrlParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationImportFromUrlAsyncParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationReplaceParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationSearchPageAsync
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationSearchParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUpdateParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUploadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileOperationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileOperationServiceAsync

    /** Update properties of file by ID. */
    fun update(fileId: String, params: FileOperationUpdateParams): CompletableFuture<File> =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        fileId: String,
        params: FileOperationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileOperationUpdateParams): CompletableFuture<File> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileOperationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** Delete a file by ID */
    fun delete(fileId: String): CompletableFuture<Void?> =
        delete(fileId, FileOperationDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileOperationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FileOperationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(fileId, FileOperationDeleteParams.none(), requestOptions)

    /** Delete a file in accordance with GDPR regulations. */
    fun gdprDelete(fileId: String): CompletableFuture<Void?> =
        gdprDelete(fileId, FileOperationGdprDeleteParams.none())

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
    ): CompletableFuture<Void?> = gdprDelete(fileId, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: FileOperationGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see gdprDelete */
    fun gdprDelete(params: FileOperationGdprDeleteParams): CompletableFuture<Void?> =
        gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(fileId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        gdprDelete(fileId, FileOperationGdprDeleteParams.none(), requestOptions)

    /** Retrieve a file by its ID. */
    fun get(fileId: String): CompletableFuture<File> = get(fileId, FileOperationGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileOperationGetParams = FileOperationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(
        fileId: String,
        params: FileOperationGetParams = FileOperationGetParams.none(),
    ): CompletableFuture<File> = get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileOperationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see get */
    fun get(params: FileOperationGetParams): CompletableFuture<File> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): CompletableFuture<File> =
        get(fileId, FileOperationGetParams.none(), requestOptions)

    /** Retrieve a file by its path. */
    fun getByPath(path: String): CompletableFuture<FileStat> =
        getByPath(path, FileOperationGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileStat> =
        getByPath(params.toBuilder().path(path).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
    ): CompletableFuture<FileStat> = getByPath(path, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FileOperationGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileStat>

    /** @see getByPath */
    fun getByPath(params: FileOperationGetByPathParams): CompletableFuture<FileStat> =
        getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(path: String, requestOptions: RequestOptions): CompletableFuture<FileStat> =
        getByPath(path, FileOperationGetByPathParams.none(), requestOptions)

    /** Check the status of requested import. */
    fun getImportTaskStatus(taskId: String): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, FileOperationGetImportTaskStatusParams.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileOperationGetImportTaskStatusParams =
            FileOperationGetImportTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileOperationGetImportTaskStatusParams =
            FileOperationGetImportTaskStatusParams.none(),
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileOperationGetImportTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileActionResponse>

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileOperationGetImportTaskStatusParams
    ): CompletableFuture<FileActionResponse> = getImportTaskStatus(params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, FileOperationGetImportTaskStatusParams.none(), requestOptions)

    /** Generates signed URL that allows temporary access to a private file. */
    fun getSignedUrl(fileId: String): CompletableFuture<SignedUrl> =
        getSignedUrl(fileId, FileOperationGetSignedUrlParams.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignedUrl> =
        getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
    ): CompletableFuture<SignedUrl> = getSignedUrl(fileId, params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        params: FileOperationGetSignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignedUrl>

    /** @see getSignedUrl */
    fun getSignedUrl(params: FileOperationGetSignedUrlParams): CompletableFuture<SignedUrl> =
        getSignedUrl(params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(fileId: String, requestOptions: RequestOptions): CompletableFuture<SignedUrl> =
        getSignedUrl(fileId, FileOperationGetSignedUrlParams.none(), requestOptions)

    /** Asynchronously imports the file at the given URL into the file manager. */
    fun importFromUrlAsync(
        params: FileOperationImportFromUrlAsyncParams
    ): CompletableFuture<ImportFromUrlTaskLocator> =
        importFromUrlAsync(params, RequestOptions.none())

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        params: FileOperationImportFromUrlAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportFromUrlTaskLocator>

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        importFromUrlInput: ImportFromUrlInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportFromUrlTaskLocator> =
        importFromUrlAsync(
            FileOperationImportFromUrlAsyncParams.builder()
                .importFromUrlInput(importFromUrlInput)
                .build(),
            requestOptions,
        )

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        importFromUrlInput: ImportFromUrlInput
    ): CompletableFuture<ImportFromUrlTaskLocator> =
        importFromUrlAsync(importFromUrlInput, RequestOptions.none())

    /**
     * Replace existing file data with new file data. Can be used to change image content without
     * having to upload a new file and update all references.
     */
    fun replace(fileId: String): CompletableFuture<File> =
        replace(fileId, FileOperationReplaceParams.none())

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = replace(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
    ): CompletableFuture<File> = replace(fileId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FileOperationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see replace */
    fun replace(params: FileOperationReplaceParams): CompletableFuture<File> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(fileId: String, requestOptions: RequestOptions): CompletableFuture<File> =
        replace(fileId, FileOperationReplaceParams.none(), requestOptions)

    /** Search through files in the file manager. Does not display hidden or archived files. */
    fun search(): CompletableFuture<FileOperationSearchPageAsync> =
        search(FileOperationSearchParams.none())

    /** @see search */
    fun search(
        params: FileOperationSearchParams = FileOperationSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileOperationSearchPageAsync>

    /** @see search */
    fun search(
        params: FileOperationSearchParams = FileOperationSearchParams.none()
    ): CompletableFuture<FileOperationSearchPageAsync> = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): CompletableFuture<FileOperationSearchPageAsync> =
        search(FileOperationSearchParams.none(), requestOptions)

    /** Upload a single file with content specified in request body. */
    fun upload(): CompletableFuture<File> = upload(FileOperationUploadParams.none())

    /** @see upload */
    fun upload(
        params: FileOperationUploadParams = FileOperationUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see upload */
    fun upload(
        params: FileOperationUploadParams = FileOperationUploadParams.none()
    ): CompletableFuture<File> = upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(requestOptions: RequestOptions): CompletableFuture<File> =
        upload(FileOperationUploadParams.none(), requestOptions)

    /**
     * A view of [FileOperationServiceAsync] that provides access to raw HTTP responses for each
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
        ): FileOperationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /files/v3/files/{fileId}`, but is otherwise the
         * same as [FileOperationServiceAsync.update].
         */
        fun update(
            fileId: String,
            params: FileOperationUpdateParams,
        ): CompletableFuture<HttpResponseFor<File>> = update(fileId, params, RequestOptions.none())

        /** @see update */
        fun update(
            fileId: String,
            params: FileOperationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        fun update(params: FileOperationUpdateParams): CompletableFuture<HttpResponseFor<File>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FileOperationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /**
         * Returns a raw HTTP response for `delete /files/v3/files/{fileId}`, but is otherwise the
         * same as [FileOperationServiceAsync.delete].
         */
        fun delete(fileId: String): CompletableFuture<HttpResponse> =
            delete(fileId, FileOperationDeleteParams.none())

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FileOperationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FileOperationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(fileId, FileOperationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/v3/files/{fileId}/gdpr-delete`, but is
         * otherwise the same as [FileOperationServiceAsync.gdprDelete].
         */
        fun gdprDelete(fileId: String): CompletableFuture<HttpResponse> =
            gdprDelete(fileId, FileOperationGdprDeleteParams.none())

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = gdprDelete(fileId, params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            params: FileOperationGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see gdprDelete */
        fun gdprDelete(params: FileOperationGdprDeleteParams): CompletableFuture<HttpResponse> =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            gdprDelete(fileId, FileOperationGdprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/files/{fileId}`, but is otherwise the same
         * as [FileOperationServiceAsync.get].
         */
        fun get(fileId: String): CompletableFuture<HttpResponseFor<File>> =
            get(fileId, FileOperationGetParams.none())

        /** @see get */
        fun get(
            fileId: String,
            params: FileOperationGetParams = FileOperationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        fun get(
            fileId: String,
            params: FileOperationGetParams = FileOperationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<File>> = get(fileId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FileOperationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see get */
        fun get(params: FileOperationGetParams): CompletableFuture<HttpResponseFor<File>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<File>> =
            get(fileId, FileOperationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/files/stat/{path}`, but is otherwise the
         * same as [FileOperationServiceAsync.getByPath].
         */
        fun getByPath(path: String): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, FileOperationGetByPathParams.none())

        /** @see getByPath */
        fun getByPath(
            path: String,
            params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(params.toBuilder().path(path).build(), requestOptions)

        /** @see getByPath */
        fun getByPath(
            path: String,
            params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            params: FileOperationGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>>

        /** @see getByPath */
        fun getByPath(
            params: FileOperationGetByPathParams
        ): CompletableFuture<HttpResponseFor<FileStat>> = getByPath(params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            path: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, FileOperationGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/v3/files/import-from-url/async/tasks/{taskId}/status`, but is otherwise the same
         * as [FileOperationServiceAsync.getImportTaskStatus].
         */
        fun getImportTaskStatus(
            taskId: String
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, FileOperationGetImportTaskStatusParams.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            params: FileOperationGetImportTaskStatusParams =
                FileOperationGetImportTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            params: FileOperationGetImportTaskStatusParams =
                FileOperationGetImportTaskStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, params, RequestOptions.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            params: FileOperationGetImportTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>>

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            params: FileOperationGetImportTaskStatusParams
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(params, RequestOptions.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(
                taskId,
                FileOperationGetImportTaskStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /files/v3/files/{fileId}/signed-url`, but is
         * otherwise the same as [FileOperationServiceAsync.getSignedUrl].
         */
        fun getSignedUrl(fileId: String): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, FileOperationGetSignedUrlParams.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, params, RequestOptions.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            params: FileOperationGetSignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>>

        /** @see getSignedUrl */
        fun getSignedUrl(
            params: FileOperationGetSignedUrlParams
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(params, RequestOptions.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, FileOperationGetSignedUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/v3/files/import-from-url/async`, but is
         * otherwise the same as [FileOperationServiceAsync.importFromUrlAsync].
         */
        fun importFromUrlAsync(
            params: FileOperationImportFromUrlAsyncParams
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>> =
            importFromUrlAsync(params, RequestOptions.none())

        /** @see importFromUrlAsync */
        fun importFromUrlAsync(
            params: FileOperationImportFromUrlAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>>

        /** @see importFromUrlAsync */
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>> =
            importFromUrlAsync(
                FileOperationImportFromUrlAsyncParams.builder()
                    .importFromUrlInput(importFromUrlInput)
                    .build(),
                requestOptions,
            )

        /** @see importFromUrlAsync */
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>> =
            importFromUrlAsync(importFromUrlInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /files/v3/files/{fileId}`, but is otherwise the same
         * as [FileOperationServiceAsync.replace].
         */
        fun replace(fileId: String): CompletableFuture<HttpResponseFor<File>> =
            replace(fileId, FileOperationReplaceParams.none())

        /** @see replace */
        fun replace(
            fileId: String,
            params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            replace(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see replace */
        fun replace(
            fileId: String,
            params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
        ): CompletableFuture<HttpResponseFor<File>> = replace(fileId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: FileOperationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see replace */
        fun replace(params: FileOperationReplaceParams): CompletableFuture<HttpResponseFor<File>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<File>> =
            replace(fileId, FileOperationReplaceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/files/search`, but is otherwise the same
         * as [FileOperationServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<FileOperationSearchPageAsync>> =
            search(FileOperationSearchParams.none())

        /** @see search */
        fun search(
            params: FileOperationSearchParams = FileOperationSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileOperationSearchPageAsync>>

        /** @see search */
        fun search(
            params: FileOperationSearchParams = FileOperationSearchParams.none()
        ): CompletableFuture<HttpResponseFor<FileOperationSearchPageAsync>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FileOperationSearchPageAsync>> =
            search(FileOperationSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/v3/files`, but is otherwise the same as
         * [FileOperationServiceAsync.upload].
         */
        fun upload(): CompletableFuture<HttpResponseFor<File>> =
            upload(FileOperationUploadParams.none())

        /** @see upload */
        fun upload(
            params: FileOperationUploadParams = FileOperationUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see upload */
        fun upload(
            params: FileOperationUploadParams = FileOperationUploadParams.none()
        ): CompletableFuture<HttpResponseFor<File>> = upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<File>> =
            upload(FileOperationUploadParams.none(), requestOptions)
    }
}
