// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.files.files.FileSearchPage
import com.hubspot_sdk.api.models.files.files.FileSearchParams
import com.hubspot_sdk.api.models.files.files.FileUpdateParams
import com.hubspot_sdk.api.models.files.files.FileUploadParams
import java.util.function.Consumer

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /** Creates a folder. */
    fun create(params: FileCreateParams): Folder = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder

    /** @see create */
    fun create(
        folderInput: FolderInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder = create(FileCreateParams.builder().folderInput(folderInput).build(), requestOptions)

    /** @see create */
    fun create(folderInput: FolderInput): Folder = create(folderInput, RequestOptions.none())

    /** Update properties of file by ID. */
    fun update(fileId: String, params: FileUpdateParams): File =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        fileId: String,
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileUpdateParams): File = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Delete a file by ID */
    fun delete(fileId: String) = delete(fileId, FileDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(fileId: String, params: FileDeleteParams = FileDeleteParams.none()) =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FileDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions) =
        delete(fileId, FileDeleteParams.none(), requestOptions)

    /** Delete a file in accordance with GDPR regulations. */
    fun gdprDelete(fileId: String) = gdprDelete(fileId, FileGdprDeleteParams.none())

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileGdprDeleteParams = FileGdprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(fileId: String, params: FileGdprDeleteParams = FileGdprDeleteParams.none()) =
        gdprDelete(fileId, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: FileGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see gdprDelete */
    fun gdprDelete(params: FileGdprDeleteParams) = gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(fileId: String, requestOptions: RequestOptions) =
        gdprDelete(fileId, FileGdprDeleteParams.none(), requestOptions)

    /** Retrieve a file by its ID. */
    fun get(fileId: String): File = get(fileId, FileGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileGetParams = FileGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(fileId: String, params: FileGetParams = FileGetParams.none()): File =
        get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(params: FileGetParams, requestOptions: RequestOptions = RequestOptions.none()): File

    /** @see get */
    fun get(params: FileGetParams): File = get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): File =
        get(fileId, FileGetParams.none(), requestOptions)

    /** Retrieve a file by its path. */
    fun getByPath(path: String): FileStat = getByPath(path, FileGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileGetByPathParams = FileGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileStat = getByPath(params.toBuilder().path(path).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileGetByPathParams = FileGetByPathParams.none(),
    ): FileStat = getByPath(path, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FileGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileStat

    /** @see getByPath */
    fun getByPath(params: FileGetByPathParams): FileStat = getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(path: String, requestOptions: RequestOptions): FileStat =
        getByPath(path, FileGetByPathParams.none(), requestOptions)

    /** Check the status of requested import. */
    fun getImportTaskStatus(taskId: String): FileActionResponse =
        getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileActionResponse =
        getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
    ): FileActionResponse = getImportTaskStatus(taskId, params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileGetImportTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileActionResponse

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(params: FileGetImportTaskStatusParams): FileActionResponse =
        getImportTaskStatus(params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(taskId: String, requestOptions: RequestOptions): FileActionResponse =
        getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none(), requestOptions)

    /** Generates signed URL that allows temporary access to a private file. */
    fun getSignedUrl(fileId: String): SignedUrl =
        getSignedUrl(fileId, FileGetSignedUrlParams.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignedUrl = getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
    ): SignedUrl = getSignedUrl(fileId, params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        params: FileGetSignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignedUrl

    /** @see getSignedUrl */
    fun getSignedUrl(params: FileGetSignedUrlParams): SignedUrl =
        getSignedUrl(params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(fileId: String, requestOptions: RequestOptions): SignedUrl =
        getSignedUrl(fileId, FileGetSignedUrlParams.none(), requestOptions)

    /** Asynchronously imports the file at the given URL into the file manager. */
    fun importFromUrlAsync(params: FileImportFromUrlAsyncParams): ImportFromUrlTaskLocator =
        importFromUrlAsync(params, RequestOptions.none())

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        params: FileImportFromUrlAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportFromUrlTaskLocator

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        importFromUrlInput: ImportFromUrlInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportFromUrlTaskLocator =
        importFromUrlAsync(
            FileImportFromUrlAsyncParams.builder().importFromUrlInput(importFromUrlInput).build(),
            requestOptions,
        )

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(importFromUrlInput: ImportFromUrlInput): ImportFromUrlTaskLocator =
        importFromUrlAsync(importFromUrlInput, RequestOptions.none())

    /**
     * Replace existing file data with new file data. Can be used to change image content without
     * having to upload a new file and update all references.
     */
    fun replace(fileId: String): File = replace(fileId, FileReplaceParams.none())

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileReplaceParams = FileReplaceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = replace(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see replace */
    fun replace(fileId: String, params: FileReplaceParams = FileReplaceParams.none()): File =
        replace(fileId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FileReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see replace */
    fun replace(params: FileReplaceParams): File = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(fileId: String, requestOptions: RequestOptions): File =
        replace(fileId, FileReplaceParams.none(), requestOptions)

    /** Search through files in the file manager. Does not display hidden or archived files. */
    fun search(): FileSearchPage = search(FileSearchParams.none())

    /** @see search */
    fun search(
        params: FileSearchParams = FileSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileSearchPage

    /** @see search */
    fun search(params: FileSearchParams = FileSearchParams.none()): FileSearchPage =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): FileSearchPage =
        search(FileSearchParams.none(), requestOptions)

    /** Upload a single file with content specified in request body. */
    fun upload(): File = upload(FileUploadParams.none())

    /** @see upload */
    fun upload(
        params: FileUploadParams = FileUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see upload */
    fun upload(params: FileUploadParams = FileUploadParams.none()): File =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(requestOptions: RequestOptions): File =
        upload(FileUploadParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /files/2026-03/folders`, but is otherwise the same
         * as [FileService.create].
         */
        @MustBeClosed
        fun create(params: FileCreateParams): HttpResponseFor<Folder> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder>

        /** @see create */
        @MustBeClosed
        fun create(
            folderInput: FolderInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder> =
            create(FileCreateParams.builder().folderInput(folderInput).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(folderInput: FolderInput): HttpResponseFor<Folder> =
            create(folderInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileService.update].
         */
        @MustBeClosed
        fun update(fileId: String, params: FileUpdateParams): HttpResponseFor<File> =
            update(fileId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            fileId: String,
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> = update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FileUpdateParams): HttpResponseFor<File> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(fileId: String): HttpResponse = delete(fileId, FileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams = FileDeleteParams.none(),
        ): HttpResponse = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FileDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(fileId: String, requestOptions: RequestOptions): HttpResponse =
            delete(fileId, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}/gdpr-delete`, but
         * is otherwise the same as [FileService.gdprDelete].
         */
        @MustBeClosed
        fun gdprDelete(fileId: String): HttpResponse =
            gdprDelete(fileId, FileGdprDeleteParams.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            fileId: String,
            params: FileGdprDeleteParams = FileGdprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            fileId: String,
            params: FileGdprDeleteParams = FileGdprDeleteParams.none(),
        ): HttpResponse = gdprDelete(fileId, params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            params: FileGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(params: FileGdprDeleteParams): HttpResponse =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(fileId: String, requestOptions: RequestOptions): HttpResponse =
            gdprDelete(fileId, FileGdprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}`, but is otherwise the
         * same as [FileService.get].
         */
        @MustBeClosed
        fun get(fileId: String): HttpResponseFor<File> = get(fileId, FileGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> = get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileGetParams = FileGetParams.none(),
        ): HttpResponseFor<File> = get(fileId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FileGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see get */
        @MustBeClosed
        fun get(params: FileGetParams): HttpResponseFor<File> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            get(fileId, FileGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/stat/{path}`, but is otherwise
         * the same as [FileService.getByPath].
         */
        @MustBeClosed
        fun getByPath(path: String): HttpResponseFor<FileStat> =
            getByPath(path, FileGetByPathParams.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            path: String,
            params: FileGetByPathParams = FileGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileStat> =
            getByPath(params.toBuilder().path(path).build(), requestOptions)

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            path: String,
            params: FileGetByPathParams = FileGetByPathParams.none(),
        ): HttpResponseFor<FileStat> = getByPath(path, params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            params: FileGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileStat>

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(params: FileGetByPathParams): HttpResponseFor<FileStat> =
            getByPath(params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(path: String, requestOptions: RequestOptions): HttpResponseFor<FileStat> =
            getByPath(path, FileGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/2026-03/files/import-from-url/async/tasks/{taskId}/status`, but is otherwise the
         * same as [FileService.getImportTaskStatus].
         */
        @MustBeClosed
        fun getImportTaskStatus(taskId: String): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            params: FileGetImportTaskStatusParams = FileGetImportTaskStatusParams.none(),
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, params, RequestOptions.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            params: FileGetImportTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileActionResponse>

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            params: FileGetImportTaskStatusParams
        ): HttpResponseFor<FileActionResponse> = getImportTaskStatus(params, RequestOptions.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, FileGetImportTaskStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}/signed-url`, but is
         * otherwise the same as [FileService.getSignedUrl].
         */
        @MustBeClosed
        fun getSignedUrl(fileId: String): HttpResponseFor<SignedUrl> =
            getSignedUrl(fileId, FileGetSignedUrlParams.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignedUrl> =
            getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            params: FileGetSignedUrlParams = FileGetSignedUrlParams.none(),
        ): HttpResponseFor<SignedUrl> = getSignedUrl(fileId, params, RequestOptions.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            params: FileGetSignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignedUrl>

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(params: FileGetSignedUrlParams): HttpResponseFor<SignedUrl> =
            getSignedUrl(params, RequestOptions.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignedUrl> =
            getSignedUrl(fileId, FileGetSignedUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files/import-from-url/async`, but is
         * otherwise the same as [FileService.importFromUrlAsync].
         */
        @MustBeClosed
        fun importFromUrlAsync(
            params: FileImportFromUrlAsyncParams
        ): HttpResponseFor<ImportFromUrlTaskLocator> =
            importFromUrlAsync(params, RequestOptions.none())

        /** @see importFromUrlAsync */
        @MustBeClosed
        fun importFromUrlAsync(
            params: FileImportFromUrlAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportFromUrlTaskLocator>

        /** @see importFromUrlAsync */
        @MustBeClosed
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportFromUrlTaskLocator> =
            importFromUrlAsync(
                FileImportFromUrlAsyncParams.builder()
                    .importFromUrlInput(importFromUrlInput)
                    .build(),
                requestOptions,
            )

        /** @see importFromUrlAsync */
        @MustBeClosed
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput
        ): HttpResponseFor<ImportFromUrlTaskLocator> =
            importFromUrlAsync(importFromUrlInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /files/2026-03/files/{fileId}`, but is otherwise the
         * same as [FileService.replace].
         */
        @MustBeClosed
        fun replace(fileId: String): HttpResponseFor<File> =
            replace(fileId, FileReplaceParams.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            fileId: String,
            params: FileReplaceParams = FileReplaceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            replace(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            fileId: String,
            params: FileReplaceParams = FileReplaceParams.none(),
        ): HttpResponseFor<File> = replace(fileId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: FileReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see replace */
        @MustBeClosed
        fun replace(params: FileReplaceParams): HttpResponseFor<File> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            replace(fileId, FileReplaceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/search`, but is otherwise the
         * same as [FileService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<FileSearchPage> = search(FileSearchParams.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: FileSearchParams = FileSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileSearchPage>

        /** @see search */
        @MustBeClosed
        fun search(
            params: FileSearchParams = FileSearchParams.none()
        ): HttpResponseFor<FileSearchPage> = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<FileSearchPage> =
            search(FileSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files`, but is otherwise the same as
         * [FileService.upload].
         */
        @MustBeClosed fun upload(): HttpResponseFor<File> = upload(FileUploadParams.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: FileUploadParams = FileUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see upload */
        @MustBeClosed
        fun upload(params: FileUploadParams = FileUploadParams.none()): HttpResponseFor<File> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(requestOptions: RequestOptions): HttpResponseFor<File> =
            upload(FileUploadParams.none(), requestOptions)
    }
}
