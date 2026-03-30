// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.files.File
import com.hubspot_sdk.api.models.files.FileActionResponse
import com.hubspot_sdk.api.models.files.FileStat
import com.hubspot_sdk.api.models.files.Folder
import com.hubspot_sdk.api.models.files.FolderInput
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import com.hubspot_sdk.api.models.files.ImportFromUrlTaskLocator
import com.hubspot_sdk.api.models.files.SignedUrl
import com.hubspot_sdk.api.models.files.files.FileCreateParams
import com.hubspot_sdk.api.models.files.files.FileDeleteParams
import com.hubspot_sdk.api.models.files.files.FileGdprDeleteParams
import com.hubspot_sdk.api.models.files.files.FileGetByPathParams
import com.hubspot_sdk.api.models.files.files.FileGetImportTaskStatusParams
import com.hubspot_sdk.api.models.files.files.FileGetParams
import com.hubspot_sdk.api.models.files.files.FileGetSignedUrlParams
import com.hubspot_sdk.api.models.files.files.FileImportFromUrlAsyncParams
import com.hubspot_sdk.api.models.files.files.FileReplaceParams
import com.hubspot_sdk.api.models.files.files.FileSearchPageAsync
import com.hubspot_sdk.api.models.files.files.FileSearchParams
import com.hubspot_sdk.api.models.files.files.FileUpdateParams
import com.hubspot_sdk.api.models.files.files.FileUploadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /** Creates a folder. */
    fun create(params: FileCreateParams): CompletableFuture<Folder> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder>

    /** @see create */
    fun create(
        folderInput: FolderInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder> =
        create(FileCreateParams.builder().folderInput(folderInput).build(), requestOptions)

    /** @see create */
    fun create(folderInput: FolderInput): CompletableFuture<Folder> =
        create(folderInput, RequestOptions.none())

    /** Update properties of file by ID. */
    fun update(fileId: String, params: FileUpdateParams): CompletableFuture<File> =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        fileId: String,
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileUpdateParams): CompletableFuture<File> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** Delete a file by ID */
    fun delete(fileId: String): CompletableFuture<Void?> = delete(fileId, FileDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FileDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(fileId, FileDeleteParams.none(), requestOptions)

    /** Delete a file in accordance with GDPR regulations. */
    fun gdprDelete(fileId: String): CompletableFuture<Void?> =
        gdprDelete(fileId, FileGdprDeleteParams.none())

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileGdprDeleteParams = FileGdprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileGdprDeleteParams = FileGdprDeleteParams.none(),
    ): CompletableFuture<Void?> = gdprDelete(fileId, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: FileGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see gdprDelete */
    fun gdprDelete(params: FileGdprDeleteParams): CompletableFuture<Void?> =
        gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(fileId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        gdprDelete(fileId, FileGdprDeleteParams.none(), requestOptions)

    /** Retrieve a file by its ID. */
    fun get(fileId: String): CompletableFuture<File> = get(fileId, FileGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileGetParams = FileGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(fileId: String, params: FileGetParams = FileGetParams.none()): CompletableFuture<File> =
        get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see get */
    fun get(params: FileGetParams): CompletableFuture<File> = get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): CompletableFuture<File> =
        get(fileId, FileGetParams.none(), requestOptions)

    /** Retrieve a file by its path. */
    fun getByPath(path: String): CompletableFuture<FileStat> =
        getByPath(path, FileGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileGetByPathParams = FileGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileStat> =
        getByPath(params.toBuilder().path(path).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileGetByPathParams = FileGetByPathParams.none(),
    ): CompletableFuture<FileStat> = getByPath(path, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FileGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileStat>

    /** @see getByPath */
    fun getByPath(params: FileGetByPathParams): CompletableFuture<FileStat> =
        getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(path: String, requestOptions: RequestOptions): CompletableFuture<FileStat> =
        getByPath(path, FileGetByPathParams.none(), requestOptions)

    /** Check the status of requested import. */
    fun getImportTaskStatus(taskId: String): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileGetImportTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileActionResponse>

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileGetImportTaskStatusParams
    ): CompletableFuture<FileActionResponse> = getImportTaskStatus(params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileActionResponse> =
        getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none(), requestOptions)

    /** Generates signed URL that allows temporary access to a private file. */
    fun getSignedUrl(fileId: String): CompletableFuture<SignedUrl> =
        getSignedUrl(fileId, FileGetSignedUrlParams.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignedUrl> =
        getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
    ): CompletableFuture<SignedUrl> = getSignedUrl(fileId, params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        params: FileGetSignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignedUrl>

    /** @see getSignedUrl */
    fun getSignedUrl(params: FileGetSignedUrlParams): CompletableFuture<SignedUrl> =
        getSignedUrl(params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(fileId: String, requestOptions: RequestOptions): CompletableFuture<SignedUrl> =
        getSignedUrl(fileId, FileGetSignedUrlParams.none(), requestOptions)

    /** Asynchronously imports the file at the given URL into the file manager. */
    fun importFromUrlAsync(
        params: FileImportFromUrlAsyncParams
    ): CompletableFuture<ImportFromUrlTaskLocator> =
        importFromUrlAsync(params, RequestOptions.none())

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        params: FileImportFromUrlAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportFromUrlTaskLocator>

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        importFromUrlInput: ImportFromUrlInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportFromUrlTaskLocator> =
        importFromUrlAsync(
            FileImportFromUrlAsyncParams.builder().importFromUrlInput(importFromUrlInput).build(),
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
    fun replace(fileId: String): CompletableFuture<File> = replace(fileId, FileReplaceParams.none())

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileReplaceParams = FileReplaceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File> = replace(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileReplaceParams = FileReplaceParams.none(),
    ): CompletableFuture<File> = replace(fileId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FileReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see replace */
    fun replace(params: FileReplaceParams): CompletableFuture<File> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(fileId: String, requestOptions: RequestOptions): CompletableFuture<File> =
        replace(fileId, FileReplaceParams.none(), requestOptions)

    /** Search through files in the file manager. Does not display hidden or archived files. */
    fun search(): CompletableFuture<FileSearchPageAsync> = search(FileSearchParams.none())

    /** @see search */
    fun search(
        params: FileSearchParams = FileSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileSearchPageAsync>

    /** @see search */
    fun search(
        params: FileSearchParams = FileSearchParams.none()
    ): CompletableFuture<FileSearchPageAsync> = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): CompletableFuture<FileSearchPageAsync> =
        search(FileSearchParams.none(), requestOptions)

    /** Upload a single file with content specified in request body. */
    fun upload(): CompletableFuture<File> = upload(FileUploadParams.none())

    /** @see upload */
    fun upload(
        params: FileUploadParams = FileUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<File>

    /** @see upload */
    fun upload(params: FileUploadParams = FileUploadParams.none()): CompletableFuture<File> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(requestOptions: RequestOptions): CompletableFuture<File> =
        upload(FileUploadParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /files/2026-03/folders`, but is otherwise the same
         * as [FileServiceAsync.create].
         */
        fun create(params: FileCreateParams): CompletableFuture<HttpResponseFor<Folder>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>>

        /** @see create */
        fun create(
            folderInput: FolderInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            create(FileCreateParams.builder().folderInput(folderInput).build(), requestOptions)

        /** @see create */
        fun create(folderInput: FolderInput): CompletableFuture<HttpResponseFor<Folder>> =
            create(folderInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileServiceAsync.update].
         */
        fun update(
            fileId: String,
            params: FileUpdateParams,
        ): CompletableFuture<HttpResponseFor<File>> = update(fileId, params, RequestOptions.none())

        /** @see update */
        fun update(
            fileId: String,
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        fun update(params: FileUpdateParams): CompletableFuture<HttpResponseFor<File>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileServiceAsync.delete].
         */
        fun delete(fileId: String): CompletableFuture<HttpResponse> =
            delete(fileId, FileDeleteParams.none())

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FileDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(fileId, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}/gdpr-delete`, but
         * is otherwise the same as [FileServiceAsync.gdprDelete].
         */
        fun gdprDelete(fileId: String): CompletableFuture<HttpResponse> =
            gdprDelete(fileId, FileGdprDeleteParams.none())

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            params: FileGdprDeleteParams = FileGdprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            params: FileGdprDeleteParams = FileGdprDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = gdprDelete(fileId, params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            params: FileGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see gdprDelete */
        fun gdprDelete(params: FileGdprDeleteParams): CompletableFuture<HttpResponse> =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            gdprDelete(fileId, FileGdprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}`, but is otherwise the
         * same as [FileServiceAsync.get].
         */
        fun get(fileId: String): CompletableFuture<HttpResponseFor<File>> =
            get(fileId, FileGetParams.none())

        /** @see get */
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
        ): CompletableFuture<HttpResponseFor<File>> = get(fileId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see get */
        fun get(params: FileGetParams): CompletableFuture<HttpResponseFor<File>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<File>> =
            get(fileId, FileGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/stat/{path}`, but is otherwise
         * the same as [FileServiceAsync.getByPath].
         */
        fun getByPath(path: String): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, FileGetByPathParams.none())

        /** @see getByPath */
        fun getByPath(
            path: String,
            params: FileGetByPathParams = FileGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(params.toBuilder().path(path).build(), requestOptions)

        /** @see getByPath */
        fun getByPath(
            path: String,
            params: FileGetByPathParams = FileGetByPathParams.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            params: FileGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileStat>>

        /** @see getByPath */
        fun getByPath(params: FileGetByPathParams): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            path: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileStat>> =
            getByPath(path, FileGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/2026-03/files/import-from-url/async/tasks/{taskId}/status`, but is otherwise the
         * same as [FileServiceAsync.getImportTaskStatus].
         */
        fun getImportTaskStatus(
            taskId: String
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, params, RequestOptions.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            params: FileGetImportTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileActionResponse>>

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            params: FileGetImportTaskStatusParams
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(params, RequestOptions.none())

        /** @see getImportTaskStatus */
        fun getImportTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileActionResponse>> =
            getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}/signed-url`, but is
         * otherwise the same as [FileServiceAsync.getSignedUrl].
         */
        fun getSignedUrl(fileId: String): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, FileGetSignedUrlParams.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, params, RequestOptions.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            params: FileGetSignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignedUrl>>

        /** @see getSignedUrl */
        fun getSignedUrl(
            params: FileGetSignedUrlParams
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(params, RequestOptions.none())

        /** @see getSignedUrl */
        fun getSignedUrl(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignedUrl>> =
            getSignedUrl(fileId, FileGetSignedUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files/import-from-url/async`, but is
         * otherwise the same as [FileServiceAsync.importFromUrlAsync].
         */
        fun importFromUrlAsync(
            params: FileImportFromUrlAsyncParams
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>> =
            importFromUrlAsync(params, RequestOptions.none())

        /** @see importFromUrlAsync */
        fun importFromUrlAsync(
            params: FileImportFromUrlAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>>

        /** @see importFromUrlAsync */
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportFromUrlTaskLocator>> =
            importFromUrlAsync(
                FileImportFromUrlAsyncParams.builder()
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
         * same as [FileServiceAsync.replace].
         */
        fun replace(fileId: String): CompletableFuture<HttpResponseFor<File>> =
            replace(fileId, FileReplaceParams.none())

        /** @see replace */
        fun replace(
            fileId: String,
            params: FileReplaceParams = FileReplaceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>> =
            replace(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see replace */
        fun replace(
            fileId: String,
            params: FileReplaceParams = FileReplaceParams.none(),
        ): CompletableFuture<HttpResponseFor<File>> = replace(fileId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: FileReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see replace */
        fun replace(params: FileReplaceParams): CompletableFuture<HttpResponseFor<File>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            fileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<File>> =
            replace(fileId, FileReplaceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/search`, but is otherwise the
         * same as [FileServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<FileSearchPageAsync>> =
            search(FileSearchParams.none())

        /** @see search */
        fun search(
            params: FileSearchParams = FileSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileSearchPageAsync>>

        /** @see search */
        fun search(
            params: FileSearchParams = FileSearchParams.none()
        ): CompletableFuture<HttpResponseFor<FileSearchPageAsync>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FileSearchPageAsync>> =
            search(FileSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files`, but is otherwise the same as
         * [FileServiceAsync.upload].
         */
        fun upload(): CompletableFuture<HttpResponseFor<File>> = upload(FileUploadParams.none())

        /** @see upload */
        fun upload(
            params: FileUploadParams = FileUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<File>>

        /** @see upload */
        fun upload(
            params: FileUploadParams = FileUploadParams.none()
        ): CompletableFuture<HttpResponseFor<File>> = upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<File>> =
            upload(FileUploadParams.none(), requestOptions)
    }
}
