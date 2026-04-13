// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.files

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.files.File
import com.hubspot.sdk.models.files.FileActionResponse
import com.hubspot.sdk.models.files.FileStat
import com.hubspot.sdk.models.files.Folder
import com.hubspot.sdk.models.files.FolderInput
import com.hubspot.sdk.models.files.ImportFromUrlInput
import com.hubspot.sdk.models.files.ImportFromUrlTaskLocator
import com.hubspot.sdk.models.files.SignedUrl
import com.hubspot.sdk.models.files.fileassets.FileAssetCreateParams
import com.hubspot.sdk.models.files.fileassets.FileAssetDeleteParams
import com.hubspot.sdk.models.files.fileassets.FileAssetGdprDeleteParams
import com.hubspot.sdk.models.files.fileassets.FileAssetGetByPathParams
import com.hubspot.sdk.models.files.fileassets.FileAssetGetImportTaskStatusParams
import com.hubspot.sdk.models.files.fileassets.FileAssetGetParams
import com.hubspot.sdk.models.files.fileassets.FileAssetGetSignedUrlParams
import com.hubspot.sdk.models.files.fileassets.FileAssetImportFromUrlAsyncParams
import com.hubspot.sdk.models.files.fileassets.FileAssetReplaceParams
import com.hubspot.sdk.models.files.fileassets.FileAssetSearchPageAsync
import com.hubspot.sdk.models.files.fileassets.FileAssetSearchParams
import com.hubspot.sdk.models.files.fileassets.FileAssetUpdateParams
import com.hubspot.sdk.models.files.fileassets.FileAssetUploadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileAssetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileAssetServiceAsync

    /** Creates a folder. */
    fun create(params: FileAssetCreateParams): CompletableFuture<Folder> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileAssetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder>

    /** @see create */
    fun create(
        folderInput: FolderInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder> =
        create(FileAssetCreateParams.builder().folderInput(folderInput).build(), requestOptions)

    /** @see create */
    fun create(folderInput: FolderInput): CompletableFuture<Folder> =
        create(folderInput, RequestOptions.none())

    /** Update properties of file by ID. */
    fun update(fileId: String, params: FileAssetUpdateParams): CompletableFuture<File> =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        fileId: String,
        params: FileAssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileAssetUpdateParams): CompletableFuture<File> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileAssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** Delete a file by ID */
    fun delete(fileId: String): CompletableFuture<Void?> =
        delete(fileId, FileAssetDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileAssetDeleteParams = FileAssetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileAssetDeleteParams = FileAssetDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileAssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FileAssetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(fileId, FileAssetDeleteParams.none(), requestOptions)

    /** Delete a file in accordance with GDPR regulations. */
    fun gdprDelete(fileId: String): CompletableFuture<Void?> =
        gdprDelete(fileId, FileAssetGdprDeleteParams.none())

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
    ): CompletableFuture<Void?> = gdprDelete(fileId, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: FileAssetGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see gdprDelete */
    fun gdprDelete(params: FileAssetGdprDeleteParams): CompletableFuture<Void?> =
        gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(fileId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        gdprDelete(fileId, FileAssetGdprDeleteParams.none(), requestOptions)

    /** Retrieve a file by its ID. */
    fun get(fileId: String): CompletableFuture<File> = get(fileId, FileAssetGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileAssetGetParams = FileAssetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(
        fileId: String,
        params: FileAssetGetParams = FileAssetGetParams.none(),
    ): CompletableFuture<File> = get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileAssetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see get */
    fun get(params: FileAssetGetParams): CompletableFuture<File> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): CompletableFuture<File> =
        get(fileId, FileAssetGetParams.none(), requestOptions)

    /** Retrieve a file by its path. */
    fun getByPath(path: String): CompletableFuture<FileStat> =
        getByPath(path, FileAssetGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileStat> =
        getByPath(params.toBuilder().path(path).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
    ): CompletableFuture<FileStat> = getByPath(path, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FileAssetGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileStat>

    /** @see getByPath */
    fun getByPath(params: FileAssetGetByPathParams): CompletableFuture<FileStat> =
        getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(path: String, requestOptions: RequestOptions): CompletableFuture<FileStat> =
        getByPath(path, FileAssetGetByPathParams.none(), requestOptions)

    /** Check the status of requested import. */
    fun getImportTaskStatus(taskId: String): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileAssetGetImportTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileActionResponse>

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileAssetGetImportTaskStatusParams
    ): CompletableFuture<FileActionResponse> = getImportTaskStatus(params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none(), requestOptions)

    /** Generates signed URL that allows temporary access to a private file. */
    fun getSignedUrl(fileId: String): CompletableFuture<SignedUrl> =
        getSignedUrl(fileId, FileAssetGetSignedUrlParams.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignedUrl> =
        getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
    ): CompletableFuture<SignedUrl> = getSignedUrl(fileId, params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        params: FileAssetGetSignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignedUrl>

    /** @see getSignedUrl */
    fun getSignedUrl(params: FileAssetGetSignedUrlParams): CompletableFuture<SignedUrl> =
        getSignedUrl(params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(fileId: String, requestOptions: RequestOptions): CompletableFuture<SignedUrl> =
        getSignedUrl(fileId, FileAssetGetSignedUrlParams.none(), requestOptions)

    /** Asynchronously imports the file at the given URL into the file manager. */
    fun importFromUrlAsync(
        params: FileAssetImportFromUrlAsyncParams
    ): CompletableFuture<ImportFromUrlTaskLocator> =
        importFromUrlAsync(params, RequestOptions.none())

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        params: FileAssetImportFromUrlAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportFromUrlTaskLocator>

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        importFromUrlInput: ImportFromUrlInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportFromUrlTaskLocator> =
        importFromUrlAsync(
            FileAssetImportFromUrlAsyncParams.builder()
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
        replace(fileId, FileAssetReplaceParams.none())

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = replace(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
    ): CompletableFuture<File> = replace(fileId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FileAssetReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see replace */
    fun replace(params: FileAssetReplaceParams): CompletableFuture<File> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(fileId: String, requestOptions: RequestOptions): CompletableFuture<File> =
        replace(fileId, FileAssetReplaceParams.none(), requestOptions)

    /** Search through files in the file manager. Does not display hidden or archived files. */
    fun search(): CompletableFuture<FileAssetSearchPageAsync> = search(FileAssetSearchParams.none())

    /** @see search */
    fun search(
        params: FileAssetSearchParams = FileAssetSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileAssetSearchPageAsync>

    /** @see search */
    fun search(
        params: FileAssetSearchParams = FileAssetSearchParams.none()
    ): CompletableFuture<FileAssetSearchPageAsync> = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): CompletableFuture<FileAssetSearchPageAsync> =
        search(FileAssetSearchParams.none(), requestOptions)

    /** Upload a single file with content specified in request body. */
    fun upload(): CompletableFuture<File> = upload(FileAssetUploadParams.none())

    /** @see upload */
    fun upload(
        params: FileAssetUploadParams = FileAssetUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see upload */
    fun upload(
        params: FileAssetUploadParams = FileAssetUploadParams.none()
    ): CompletableFuture<File> = upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(requestOptions: RequestOptions): CompletableFuture<File> =
        upload(FileAssetUploadParams.none(), requestOptions)

    /**
     * A view of [FileAssetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileAssetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /files/2026-03/folders`, but is otherwise the same
         * as [FileAssetServiceAsync.create].
         */
        fun create(params: FileAssetCreateParams): CompletableFuture<HttpResponseFor<Folder>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FileAssetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>>

        /** @see create */
        fun create(
            folderInput: FolderInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            create(FileAssetCreateParams.builder().folderInput(folderInput).build(), requestOptions)

        /** @see create */
        fun create(folderInput: FolderInput): CompletableFuture<HttpResponseFor<Folder>> =
            create(folderInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileAssetServiceAsync.update].
         */
        fun update(
            fileId: String,
            params: FileAssetUpdateParams,
        ): CompletableFuture<HttpResponseFor<File>> = update(fileId, params, RequestOptions.none())

        /** @see update */
        fun update(
            fileId: String,
            params: FileAssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        fun update(params: FileAssetUpdateParams): CompletableFuture<HttpResponseFor<File>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FileAssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileAssetServiceAsync.delete].
         */
        fun delete(fileId: String): CompletableFuture<HttpResponse> =
            delete(fileId, FileAssetDeleteParams.none())

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileAssetDeleteParams = FileAssetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileAssetDeleteParams = FileAssetDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FileAssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FileAssetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(fileId, FileAssetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}/gdpr-delete`, but
         * is otherwise the same as [FileAssetServiceAsync.gdprDelete].
         */
        fun gdprDelete(fileId: String): CompletableFuture<HttpResponse> =
            gdprDelete(fileId, FileAssetGdprDeleteParams.none())

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = gdprDelete(fileId, params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            params: FileAssetGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see gdprDelete */
        fun gdprDelete(params: FileAssetGdprDeleteParams): CompletableFuture<HttpResponse> =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            gdprDelete(fileId, FileAssetGdprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}`, but is otherwise the
         * same as [FileAssetServiceAsync.get].
         */
        fun get(fileId: String): CompletableFuture<HttpResponseFor<File>> =
            get(fileId, FileAssetGetParams.none())

        /** @see get */
        fun get(
            fileId: String,
            params: FileAssetGetParams = FileAssetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        fun get(
            fileId: String,
            params: FileAssetGetParams = FileAssetGetParams.none(),
        ): CompletableFuture<HttpResponseFor<File>> = get(fileId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FileAssetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see get */
        fun get(params: FileAssetGetParams): CompletableFuture<HttpResponseFor<File>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<File>> =
            get(fileId, FileAssetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/stat/{path}`, but is otherwise
         * the same as [FileAssetServiceAsync.getByPath].
         */
        fun getByPath(path: String): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, FileAssetGetByPathParams.none())

        /** @see getByPath */
        fun getByPath(
            path: String,
            params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(params.toBuilder().path(path).build(), requestOptions)

        /** @see getByPath */
        fun getByPath(
            path: String,
            params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            params: FileAssetGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>>

        /** @see getByPath */
        fun getByPath(
            params: FileAssetGetByPathParams
        ): CompletableFuture<HttpResponseFor<FileStat>> = getByPath(params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            path: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, FileAssetGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/2026-03/files/import-from-url/async/tasks/{taskId}/status`, but is otherwise the
         * same as [FileAssetServiceAsync.getImportTaskStatus].
         */
        fun getImportTaskStatus(
            taskId: String
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, params, RequestOptions.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            params: FileAssetGetImportTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>>

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            params: FileAssetGetImportTaskStatusParams
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(params, RequestOptions.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}/signed-url`, but is
         * otherwise the same as [FileAssetServiceAsync.getSignedUrl].
         */
        fun getSignedUrl(fileId: String): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, FileAssetGetSignedUrlParams.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, params, RequestOptions.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            params: FileAssetGetSignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>>

        /** @see getSignedUrl */
        fun getSignedUrl(
            params: FileAssetGetSignedUrlParams
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(params, RequestOptions.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, FileAssetGetSignedUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files/import-from-url/async`, but is
         * otherwise the same as [FileAssetServiceAsync.importFromUrlAsync].
         */
        fun importFromUrlAsync(
            params: FileAssetImportFromUrlAsyncParams
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>> =
            importFromUrlAsync(params, RequestOptions.none())

        /** @see importFromUrlAsync */
        fun importFromUrlAsync(
            params: FileAssetImportFromUrlAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>>

        /** @see importFromUrlAsync */
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>> =
            importFromUrlAsync(
                FileAssetImportFromUrlAsyncParams.builder()
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
         * Returns a raw HTTP response for `put /files/2026-03/files/{fileId}`, but is otherwise the
         * same as [FileAssetServiceAsync.replace].
         */
        fun replace(fileId: String): CompletableFuture<HttpResponseFor<File>> =
            replace(fileId, FileAssetReplaceParams.none())

        /** @see replace */
        fun replace(
            fileId: String,
            params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            replace(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see replace */
        fun replace(
            fileId: String,
            params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
        ): CompletableFuture<HttpResponseFor<File>> = replace(fileId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: FileAssetReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see replace */
        fun replace(params: FileAssetReplaceParams): CompletableFuture<HttpResponseFor<File>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<File>> =
            replace(fileId, FileAssetReplaceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/search`, but is otherwise the
         * same as [FileAssetServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<FileAssetSearchPageAsync>> =
            search(FileAssetSearchParams.none())

        /** @see search */
        fun search(
            params: FileAssetSearchParams = FileAssetSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileAssetSearchPageAsync>>

        /** @see search */
        fun search(
            params: FileAssetSearchParams = FileAssetSearchParams.none()
        ): CompletableFuture<HttpResponseFor<FileAssetSearchPageAsync>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FileAssetSearchPageAsync>> =
            search(FileAssetSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files`, but is otherwise the same as
         * [FileAssetServiceAsync.upload].
         */
        fun upload(): CompletableFuture<HttpResponseFor<File>> =
            upload(FileAssetUploadParams.none())

        /** @see upload */
        fun upload(
            params: FileAssetUploadParams = FileAssetUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see upload */
        fun upload(
            params: FileAssetUploadParams = FileAssetUploadParams.none()
        ): CompletableFuture<HttpResponseFor<File>> = upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<File>> =
            upload(FileAssetUploadParams.none(), requestOptions)
    }
}
