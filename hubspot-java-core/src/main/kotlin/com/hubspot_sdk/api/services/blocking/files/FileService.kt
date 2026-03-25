// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.files.FileActionResponse
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import com.hubspot_sdk.api.models.files.ImportFromUrlTaskLocator
import com.hubspot_sdk.api.models.files.files.FileGetImportTaskStatusParams
import com.hubspot_sdk.api.models.files.files.FileImportFromUrlAsyncParams
import com.hubspot_sdk.api.models.files.files.FileSearchPage
import com.hubspot_sdk.api.models.files.files.FileSearchParams
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

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

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
    }
}
