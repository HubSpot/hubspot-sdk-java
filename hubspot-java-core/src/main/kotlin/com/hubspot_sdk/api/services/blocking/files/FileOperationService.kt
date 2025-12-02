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
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationSearchPage
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationSearchParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUpdateParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUploadParams
import java.util.function.Consumer

interface FileOperationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileOperationService

    /** Update properties of file by ID. */
    fun update(fileId: String, params: FileOperationUpdateParams): File =
        update(fileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        fileId: String,
        params: FileOperationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = update(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see update */
    fun update(params: FileOperationUpdateParams): File = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileOperationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Delete a file by ID */
    fun delete(fileId: String) = delete(fileId, FileOperationDeleteParams.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
    ) = delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileOperationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: FileOperationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileId: String, requestOptions: RequestOptions) =
        delete(fileId, FileOperationDeleteParams.none(), requestOptions)

    /** Delete a file in accordance with GDPR regulations. */
    fun gdprDelete(fileId: String) = gdprDelete(fileId, FileOperationGdprDeleteParams.none())

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(
        fileId: String,
        params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
    ) = gdprDelete(fileId, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: FileOperationGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see gdprDelete */
    fun gdprDelete(params: FileOperationGdprDeleteParams) =
        gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(fileId: String, requestOptions: RequestOptions) =
        gdprDelete(fileId, FileOperationGdprDeleteParams.none(), requestOptions)

    /** Retrieve a file by its ID. */
    fun get(fileId: String): File = get(fileId, FileOperationGetParams.none())

    /** @see get */
    fun get(
        fileId: String,
        params: FileOperationGetParams = FileOperationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = get(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see get */
    fun get(fileId: String, params: FileOperationGetParams = FileOperationGetParams.none()): File =
        get(fileId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FileOperationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see get */
    fun get(params: FileOperationGetParams): File = get(params, RequestOptions.none())

    /** @see get */
    fun get(fileId: String, requestOptions: RequestOptions): File =
        get(fileId, FileOperationGetParams.none(), requestOptions)

    /** Retrieve a file by its path. */
    fun getByPath(filePath: String): FileStat =
        getByPath(filePath, FileOperationGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        filePath: String,
        params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileStat = getByPath(params.toBuilder().filePath(filePath).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        filePath: String,
        params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
    ): FileStat = getByPath(filePath, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FileOperationGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileStat

    /** @see getByPath */
    fun getByPath(params: FileOperationGetByPathParams): FileStat =
        getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(filePath: String, requestOptions: RequestOptions): FileStat =
        getByPath(filePath, FileOperationGetByPathParams.none(), requestOptions)

    /** Check the status of requested import. */
    fun getImportTaskStatus(taskId: String): FileActionResponse =
        getImportTaskStatus(taskId, FileOperationGetImportTaskStatusParams.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileOperationGetImportTaskStatusParams =
            FileOperationGetImportTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileActionResponse =
        getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        taskId: String,
        params: FileOperationGetImportTaskStatusParams =
            FileOperationGetImportTaskStatusParams.none(),
    ): FileActionResponse = getImportTaskStatus(taskId, params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(
        params: FileOperationGetImportTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileActionResponse

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(params: FileOperationGetImportTaskStatusParams): FileActionResponse =
        getImportTaskStatus(params, RequestOptions.none())

    /** @see getImportTaskStatus */
    fun getImportTaskStatus(taskId: String, requestOptions: RequestOptions): FileActionResponse =
        getImportTaskStatus(taskId, FileOperationGetImportTaskStatusParams.none(), requestOptions)

    /** Generates signed URL that allows temporary access to a private file. */
    fun getSignedUrl(fileId: String): SignedUrl =
        getSignedUrl(fileId, FileOperationGetSignedUrlParams.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignedUrl = getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see getSignedUrl */
    fun getSignedUrl(
        fileId: String,
        params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
    ): SignedUrl = getSignedUrl(fileId, params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(
        params: FileOperationGetSignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignedUrl

    /** @see getSignedUrl */
    fun getSignedUrl(params: FileOperationGetSignedUrlParams): SignedUrl =
        getSignedUrl(params, RequestOptions.none())

    /** @see getSignedUrl */
    fun getSignedUrl(fileId: String, requestOptions: RequestOptions): SignedUrl =
        getSignedUrl(fileId, FileOperationGetSignedUrlParams.none(), requestOptions)

    /** Asynchronously imports the file at the given URL into the file manager. */
    fun importFromUrlAsync(
        params: FileOperationImportFromUrlAsyncParams
    ): ImportFromUrlTaskLocator = importFromUrlAsync(params, RequestOptions.none())

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        params: FileOperationImportFromUrlAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportFromUrlTaskLocator

    /** @see importFromUrlAsync */
    fun importFromUrlAsync(
        importFromUrlInput: ImportFromUrlInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportFromUrlTaskLocator =
        importFromUrlAsync(
            FileOperationImportFromUrlAsyncParams.builder()
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
    fun replace(fileId: String): File = replace(fileId, FileOperationReplaceParams.none())

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = replace(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see replace */
    fun replace(
        fileId: String,
        params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
    ): File = replace(fileId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FileOperationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see replace */
    fun replace(params: FileOperationReplaceParams): File = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(fileId: String, requestOptions: RequestOptions): File =
        replace(fileId, FileOperationReplaceParams.none(), requestOptions)

    /** Search through files in the file manager. Does not display hidden or archived files. */
    fun search(): FileOperationSearchPage = search(FileOperationSearchParams.none())

    /** @see search */
    fun search(
        params: FileOperationSearchParams = FileOperationSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileOperationSearchPage

    /** @see search */
    fun search(
        params: FileOperationSearchParams = FileOperationSearchParams.none()
    ): FileOperationSearchPage = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): FileOperationSearchPage =
        search(FileOperationSearchParams.none(), requestOptions)

    /** Upload a single file with content specified in request body. */
    fun upload(): File = upload(FileOperationUploadParams.none())

    /** @see upload */
    fun upload(
        params: FileOperationUploadParams = FileOperationUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see upload */
    fun upload(params: FileOperationUploadParams = FileOperationUploadParams.none()): File =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(requestOptions: RequestOptions): File =
        upload(FileOperationUploadParams.none(), requestOptions)

    /**
     * A view of [FileOperationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileOperationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /files/v3/files/{fileId}`, but is otherwise the
         * same as [FileOperationService.update].
         */
        @MustBeClosed
        fun update(fileId: String, params: FileOperationUpdateParams): HttpResponseFor<File> =
            update(fileId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            fileId: String,
            params: FileOperationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> = update(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FileOperationUpdateParams): HttpResponseFor<File> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FileOperationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `delete /files/v3/files/{fileId}`, but is otherwise the
         * same as [FileOperationService.delete].
         */
        @MustBeClosed
        fun delete(fileId: String): HttpResponse = delete(fileId, FileOperationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileOperationDeleteParams = FileOperationDeleteParams.none(),
        ): HttpResponse = delete(fileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileOperationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FileOperationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(fileId: String, requestOptions: RequestOptions): HttpResponse =
            delete(fileId, FileOperationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/v3/files/{fileId}/gdpr-delete`, but is
         * otherwise the same as [FileOperationService.gdprDelete].
         */
        @MustBeClosed
        fun gdprDelete(fileId: String): HttpResponse =
            gdprDelete(fileId, FileOperationGdprDeleteParams.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            fileId: String,
            params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = gdprDelete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            fileId: String,
            params: FileOperationGdprDeleteParams = FileOperationGdprDeleteParams.none(),
        ): HttpResponse = gdprDelete(fileId, params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            params: FileOperationGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(params: FileOperationGdprDeleteParams): HttpResponse =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(fileId: String, requestOptions: RequestOptions): HttpResponse =
            gdprDelete(fileId, FileOperationGdprDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/files/{fileId}`, but is otherwise the same
         * as [FileOperationService.get].
         */
        @MustBeClosed
        fun get(fileId: String): HttpResponseFor<File> = get(fileId, FileOperationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileOperationGetParams = FileOperationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> = get(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            fileId: String,
            params: FileOperationGetParams = FileOperationGetParams.none(),
        ): HttpResponseFor<File> = get(fileId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FileOperationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see get */
        @MustBeClosed
        fun get(params: FileOperationGetParams): HttpResponseFor<File> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            get(fileId, FileOperationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/files/stat/{path}`, but is otherwise the
         * same as [FileOperationService.getByPath].
         */
        @MustBeClosed
        fun getByPath(filePath: String): HttpResponseFor<FileStat> =
            getByPath(filePath, FileOperationGetByPathParams.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            filePath: String,
            params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileStat> =
            getByPath(params.toBuilder().filePath(filePath).build(), requestOptions)

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            filePath: String,
            params: FileOperationGetByPathParams = FileOperationGetByPathParams.none(),
        ): HttpResponseFor<FileStat> = getByPath(filePath, params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            params: FileOperationGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileStat>

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(params: FileOperationGetByPathParams): HttpResponseFor<FileStat> =
            getByPath(params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(filePath: String, requestOptions: RequestOptions): HttpResponseFor<FileStat> =
            getByPath(filePath, FileOperationGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/v3/files/import-from-url/async/tasks/{taskId}/status`, but is otherwise the same
         * as [FileOperationService.getImportTaskStatus].
         */
        @MustBeClosed
        fun getImportTaskStatus(taskId: String): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, FileOperationGetImportTaskStatusParams.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            params: FileOperationGetImportTaskStatusParams =
                FileOperationGetImportTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            params: FileOperationGetImportTaskStatusParams =
                FileOperationGetImportTaskStatusParams.none(),
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(taskId, params, RequestOptions.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            params: FileOperationGetImportTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileActionResponse>

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            params: FileOperationGetImportTaskStatusParams
        ): HttpResponseFor<FileActionResponse> = getImportTaskStatus(params, RequestOptions.none())

        /** @see getImportTaskStatus */
        @MustBeClosed
        fun getImportTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileActionResponse> =
            getImportTaskStatus(
                taskId,
                FileOperationGetImportTaskStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /files/v3/files/{fileId}/signed-url`, but is
         * otherwise the same as [FileOperationService.getSignedUrl].
         */
        @MustBeClosed
        fun getSignedUrl(fileId: String): HttpResponseFor<SignedUrl> =
            getSignedUrl(fileId, FileOperationGetSignedUrlParams.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignedUrl> =
            getSignedUrl(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            params: FileOperationGetSignedUrlParams = FileOperationGetSignedUrlParams.none(),
        ): HttpResponseFor<SignedUrl> = getSignedUrl(fileId, params, RequestOptions.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            params: FileOperationGetSignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignedUrl>

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(params: FileOperationGetSignedUrlParams): HttpResponseFor<SignedUrl> =
            getSignedUrl(params, RequestOptions.none())

        /** @see getSignedUrl */
        @MustBeClosed
        fun getSignedUrl(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignedUrl> =
            getSignedUrl(fileId, FileOperationGetSignedUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/v3/files/import-from-url/async`, but is
         * otherwise the same as [FileOperationService.importFromUrlAsync].
         */
        @MustBeClosed
        fun importFromUrlAsync(
            params: FileOperationImportFromUrlAsyncParams
        ): HttpResponseFor<ImportFromUrlTaskLocator> =
            importFromUrlAsync(params, RequestOptions.none())

        /** @see importFromUrlAsync */
        @MustBeClosed
        fun importFromUrlAsync(
            params: FileOperationImportFromUrlAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportFromUrlTaskLocator>

        /** @see importFromUrlAsync */
        @MustBeClosed
        fun importFromUrlAsync(
            importFromUrlInput: ImportFromUrlInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportFromUrlTaskLocator> =
            importFromUrlAsync(
                FileOperationImportFromUrlAsyncParams.builder()
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
         * Returns a raw HTTP response for `put /files/v3/files/{fileId}`, but is otherwise the same
         * as [FileOperationService.replace].
         */
        @MustBeClosed
        fun replace(fileId: String): HttpResponseFor<File> =
            replace(fileId, FileOperationReplaceParams.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            fileId: String,
            params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            replace(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            fileId: String,
            params: FileOperationReplaceParams = FileOperationReplaceParams.none(),
        ): HttpResponseFor<File> = replace(fileId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: FileOperationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see replace */
        @MustBeClosed
        fun replace(params: FileOperationReplaceParams): HttpResponseFor<File> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(fileId: String, requestOptions: RequestOptions): HttpResponseFor<File> =
            replace(fileId, FileOperationReplaceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/files/search`, but is otherwise the same
         * as [FileOperationService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<FileOperationSearchPage> =
            search(FileOperationSearchParams.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: FileOperationSearchParams = FileOperationSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileOperationSearchPage>

        /** @see search */
        @MustBeClosed
        fun search(
            params: FileOperationSearchParams = FileOperationSearchParams.none()
        ): HttpResponseFor<FileOperationSearchPage> = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<FileOperationSearchPage> =
            search(FileOperationSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/v3/files`, but is otherwise the same as
         * [FileOperationService.upload].
         */
        @MustBeClosed fun upload(): HttpResponseFor<File> = upload(FileOperationUploadParams.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: FileOperationUploadParams = FileOperationUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: FileOperationUploadParams = FileOperationUploadParams.none()
        ): HttpResponseFor<File> = upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(requestOptions: RequestOptions): HttpResponseFor<File> =
            upload(FileOperationUploadParams.none(), requestOptions)
    }
}
