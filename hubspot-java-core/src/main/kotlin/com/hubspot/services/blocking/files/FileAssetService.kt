// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.files

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.files.File
import com.hubspot.models.files.FileActionResponse
import com.hubspot.models.files.FileStat
import com.hubspot.models.files.Folder
import com.hubspot.models.files.FolderInput
import com.hubspot.models.files.ImportFromUrlInput
import com.hubspot.models.files.ImportFromUrlTaskLocator
import com.hubspot.models.files.SignedUrl
import com.hubspot.models.files.fileassets.FileAssetCreateParams
import com.hubspot.models.files.fileassets.FileAssetDeleteParams
import com.hubspot.models.files.fileassets.FileAssetGdprDeleteParams
import com.hubspot.models.files.fileassets.FileAssetGetByPathParams
import com.hubspot.models.files.fileassets.FileAssetGetImportTaskStatusParams
import com.hubspot.models.files.fileassets.FileAssetGetParams
import com.hubspot.models.files.fileassets.FileAssetGetSignedUrlParams
import com.hubspot.models.files.fileassets.FileAssetImportFromUrlAsyncParams
import com.hubspot.models.files.fileassets.FileAssetReplaceParams
import com.hubspot.models.files.fileassets.FileAssetSearchPage
import com.hubspot.models.files.fileassets.FileAssetSearchParams
import com.hubspot.models.files.fileassets.FileAssetUpdateParams
import com.hubspot.models.files.fileassets.FileAssetUploadParams
import java.util.function.Consumer

interface FileAssetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileAssetService

    /** Creates a folder. */
    fun create(params: FileAssetCreateParams): Folder = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileAssetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder

    /** @see create */
    fun create(
        folderInput: FolderInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder =
        create(FileAssetCreateParams.builder().folderInput(folderInput).build(), requestOptions)

    /** @see create */
    fun create(folderInput: FolderInput): Folder = create(folderInput, RequestOptions.none())

    /** Update properties of file by ID. */
    fun update(fileId: String, params: FileAssetUpdateParams): File =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        fileId: String,
        params: FileAssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileAssetUpdateParams): File = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileAssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Delete a file by ID */
    fun delete(fileId: String) = delete(fileId, FileAssetDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileAssetDeleteParams = FileAssetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(fileId: String, params: FileAssetDeleteParams = FileAssetDeleteParams.none()) =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileAssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: FileAssetDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions) =
        delete(fileId, FileAssetDeleteParams.none(), requestOptions)

    /** Delete a file in accordance with GDPR regulations. */
    fun gdprDelete(fileId: String) = gdprDelete(fileId, FileAssetGdprDeleteParams.none())

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
    ) = gdprDelete(fileId, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: FileAssetGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see gdprDelete */
    fun gdprDelete(params: FileAssetGdprDeleteParams) = gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(fileId: String, requestOptions: RequestOptions) =
        gdprDelete(fileId, FileAssetGdprDeleteParams.none(), requestOptions)

    /** Retrieve a file by its ID. */
    fun get(fileId: String): File = get(fileId, FileAssetGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileAssetGetParams = FileAssetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(fileId: String, params: FileAssetGetParams = FileAssetGetParams.none()): File =
        get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileAssetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see get */
    fun get(params: FileAssetGetParams): File = get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): File =
        get(fileId, FileAssetGetParams.none(), requestOptions)

    /** Retrieve a file by its path. */
    fun getByPath(path: String): FileStat = getByPath(path, FileAssetGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileStat = getByPath(params.toBuilder().path(path).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        path: String,
        params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
    ): FileStat = getByPath(path, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FileAssetGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileStat

    /** @see getByPath */
    fun getByPath(params: FileAssetGetByPathParams): FileStat =
        getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(path: String, requestOptions: RequestOptions): FileStat =
        getByPath(path, FileAssetGetByPathParams.none(), requestOptions)

    /** Check the status of requested import. */
    fun getImportTaskStatus(taskId: String): FileActionResponse =
        getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileActionResponse =
        getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
    ): FileActionResponse = getImportTaskStatus(taskId, params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileAssetGetImportTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileActionResponse

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(params: FileAssetGetImportTaskStatusParams): FileActionResponse =
        getImportTaskStatus(params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(taskId: String, requestOptions: RequestOptions): FileActionResponse =
        getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none(), requestOptions)

    /** Generates signed URL that allows temporary access to a private file. */
    fun getSignedUrl(fileId: String): SignedUrl =
        getSignedUrl(fileId, FileAssetGetSignedUrlParams.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignedUrl = getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
    ): SignedUrl = getSignedUrl(fileId, params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        params: FileAssetGetSignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignedUrl

    /** @see getSignedUrl */
    fun getSignedUrl(params: FileAssetGetSignedUrlParams): SignedUrl =
        getSignedUrl(params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(fileId: String, requestOptions: RequestOptions): SignedUrl =
        getSignedUrl(fileId, FileAssetGetSignedUrlParams.none(), requestOptions)

    /** Asynchronously imports the file at the given URL into the file manager. */
    fun importFromUrlAsync(params: FileAssetImportFromUrlAsyncParams): ImportFromUrlTaskLocator =
        importFromUrlAsync(params, RequestOptions.none())

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        params: FileAssetImportFromUrlAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportFromUrlTaskLocator

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        importFromUrlInput: ImportFromUrlInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportFromUrlTaskLocator =
        importFromUrlAsync(
            FileAssetImportFromUrlAsyncParams.builder()
                .importFromUrlInput(importFromUrlInput)
                .build(),
            requestOptions,
        )

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(importFromUrlInput: ImportFromUrlInput): ImportFromUrlTaskLocator =
        importFromUrlAsync(importFromUrlInput, RequestOptions.none())

    /**
     * Replace existing file data with new file data. Can be used to change image content without
     * having to upload a new file and update all references.
     */
    fun replace(fileId: String): File = replace(fileId, FileAssetReplaceParams.none())

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = replace(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
    ): File = replace(fileId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FileAssetReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see replace */
    fun replace(params: FileAssetReplaceParams): File = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(fileId: String, requestOptions: RequestOptions): File =
        replace(fileId, FileAssetReplaceParams.none(), requestOptions)

    /** Search through files in the file manager. Does not display hidden or archived files. */
    fun search(): FileAssetSearchPage = search(FileAssetSearchParams.none())

    /** @see search */
    fun search(
        params: FileAssetSearchParams = FileAssetSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileAssetSearchPage

    /** @see search */
    fun search(params: FileAssetSearchParams = FileAssetSearchParams.none()): FileAssetSearchPage =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): FileAssetSearchPage =
        search(FileAssetSearchParams.none(), requestOptions)

    /** Upload a single file with content specified in request body. */
    fun upload(): File = upload(FileAssetUploadParams.none())

    /** @see upload */
    fun upload(
        params: FileAssetUploadParams = FileAssetUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see upload */
    fun upload(params: FileAssetUploadParams = FileAssetUploadParams.none()): File =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(requestOptions: RequestOptions): File =
        upload(FileAssetUploadParams.none(), requestOptions)

    /** A view of [FileAssetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileAssetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /files/2026-03/folders`, but is otherwise the same
         * as [FileAssetService.create].
         */
        @MustBeClosed
        fun create(params: FileAssetCreateParams): HttpResponseFor<Folder> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FileAssetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder>

        /** @see create */
        @MustBeClosed
        fun create(
            folderInput: FolderInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder> =
            create(FileAssetCreateParams.builder().folderInput(folderInput).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(folderInput: FolderInput): HttpResponseFor<Folder> =
            create(folderInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileAssetService.update].
         */
        @MustBeClosed
        fun update(fileId: String, params: FileAssetUpdateParams): HttpResponseFor<File> =
            update(fileId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            fileId: String,
            params: FileAssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> = update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FileAssetUpdateParams): HttpResponseFor<File> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FileAssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}`, but is otherwise
         * the same as [FileAssetService.delete].
         */
        @MustBeClosed
        fun delete(fileId: String): HttpResponse = delete(fileId, FileAssetDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileAssetDeleteParams = FileAssetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileAssetDeleteParams = FileAssetDeleteParams.none(),
        ): HttpResponse = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileAssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FileAssetDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(fileId: String, requestOptions: RequestOptions): HttpResponse =
            delete(fileId, FileAssetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/files/{fileId}/gdpr-delete`, but
         * is otherwise the same as [FileAssetService.gdprDelete].
         */
        @MustBeClosed
        fun gdprDelete(fileId: String): HttpResponse =
            gdprDelete(fileId, FileAssetGdprDeleteParams.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            fileId: String,
            params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            fileId: String,
            params: FileAssetGdprDeleteParams = FileAssetGdprDeleteParams.none(),
        ): HttpResponse = gdprDelete(fileId, params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            params: FileAssetGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(params: FileAssetGdprDeleteParams): HttpResponse =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(fileId: String, requestOptions: RequestOptions): HttpResponse =
            gdprDelete(fileId, FileAssetGdprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}`, but is otherwise the
         * same as [FileAssetService.get].
         */
        @MustBeClosed
        fun get(fileId: String): HttpResponseFor<File> = get(fileId, FileAssetGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileAssetGetParams = FileAssetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> = get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileAssetGetParams = FileAssetGetParams.none(),
        ): HttpResponseFor<File> = get(fileId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FileAssetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see get */
        @MustBeClosed
        fun get(params: FileAssetGetParams): HttpResponseFor<File> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            get(fileId, FileAssetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/stat/{path}`, but is otherwise
         * the same as [FileAssetService.getByPath].
         */
        @MustBeClosed
        fun getByPath(path: String): HttpResponseFor<FileStat> =
            getByPath(path, FileAssetGetByPathParams.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            path: String,
            params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileStat> =
            getByPath(params.toBuilder().path(path).build(), requestOptions)

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            path: String,
            params: FileAssetGetByPathParams = FileAssetGetByPathParams.none(),
        ): HttpResponseFor<FileStat> = getByPath(path, params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            params: FileAssetGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileStat>

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(params: FileAssetGetByPathParams): HttpResponseFor<FileStat> =
            getByPath(params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(path: String, requestOptions: RequestOptions): HttpResponseFor<FileStat> =
            getByPath(path, FileAssetGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/2026-03/files/import-from-url/async/tasks/{taskId}/status`, but is otherwise the
         * same as [FileAssetService.getImportTaskStatus].
         */
        @MustBeClosed
        fun getImportTaskStatus(taskId: String): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            params: FileAssetGetImportTaskStatusParams = FileAssetGetImportTaskStatusParams.none(),
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, params, RequestOptions.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            params: FileAssetGetImportTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileActionResponse>

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            params: FileAssetGetImportTaskStatusParams
        ): HttpResponseFor<FileActionResponse> = getImportTaskStatus(params, RequestOptions.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, FileAssetGetImportTaskStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/{fileId}/signed-url`, but is
         * otherwise the same as [FileAssetService.getSignedUrl].
         */
        @MustBeClosed
        fun getSignedUrl(fileId: String): HttpResponseFor<SignedUrl> =
            getSignedUrl(fileId, FileAssetGetSignedUrlParams.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignedUrl> =
            getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            params: FileAssetGetSignedUrlParams = FileAssetGetSignedUrlParams.none(),
        ): HttpResponseFor<SignedUrl> = getSignedUrl(fileId, params, RequestOptions.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            params: FileAssetGetSignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignedUrl>

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(params: FileAssetGetSignedUrlParams): HttpResponseFor<SignedUrl> =
            getSignedUrl(params, RequestOptions.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignedUrl> =
            getSignedUrl(fileId, FileAssetGetSignedUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files/import-from-url/async`, but is
         * otherwise the same as [FileAssetService.importFromUrlAsync].
         */
        @MustBeClosed
        fun importFromUrlAsync(
            params: FileAssetImportFromUrlAsyncParams
        ): HttpResponseFor<ImportFromUrlTaskLocator> =
            importFromUrlAsync(params, RequestOptions.none())

        /** @see importFromUrlAsync */
        @MustBeClosed
        fun importFromUrlAsync(
            params: FileAssetImportFromUrlAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportFromUrlTaskLocator>

        /** @see importFromUrlAsync */
        @MustBeClosed
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportFromUrlTaskLocator> =
            importFromUrlAsync(
                FileAssetImportFromUrlAsyncParams.builder()
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
         * same as [FileAssetService.replace].
         */
        @MustBeClosed
        fun replace(fileId: String): HttpResponseFor<File> =
            replace(fileId, FileAssetReplaceParams.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            fileId: String,
            params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            replace(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            fileId: String,
            params: FileAssetReplaceParams = FileAssetReplaceParams.none(),
        ): HttpResponseFor<File> = replace(fileId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: FileAssetReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see replace */
        @MustBeClosed
        fun replace(params: FileAssetReplaceParams): HttpResponseFor<File> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            replace(fileId, FileAssetReplaceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/files/search`, but is otherwise the
         * same as [FileAssetService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<FileAssetSearchPage> = search(FileAssetSearchParams.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: FileAssetSearchParams = FileAssetSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileAssetSearchPage>

        /** @see search */
        @MustBeClosed
        fun search(
            params: FileAssetSearchParams = FileAssetSearchParams.none()
        ): HttpResponseFor<FileAssetSearchPage> = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<FileAssetSearchPage> =
            search(FileAssetSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/files`, but is otherwise the same as
         * [FileAssetService.upload].
         */
        @MustBeClosed fun upload(): HttpResponseFor<File> = upload(FileAssetUploadParams.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: FileAssetUploadParams = FileAssetUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: FileAssetUploadParams = FileAssetUploadParams.none()
        ): HttpResponseFor<File> = upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(requestOptions: RequestOptions): HttpResponseFor<File> =
            upload(FileAssetUploadParams.none(), requestOptions)
    }
}
