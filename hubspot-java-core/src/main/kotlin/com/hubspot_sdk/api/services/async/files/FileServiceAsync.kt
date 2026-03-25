// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.files.FileActionResponse
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import com.hubspot_sdk.api.models.files.ImportFromUrlTaskLocator
import com.hubspot_sdk.api.models.files.files.FileGetImportTaskStatusParams
import com.hubspot_sdk.api.models.files.files.FileImportFromUrlAsyncParams
import com.hubspot_sdk.api.models.files.files.FileSearchPageAsync
import com.hubspot_sdk.api.models.files.files.FileSearchParams
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

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

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
    }
}
