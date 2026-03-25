// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.files.Folder
import com.hubspot_sdk.api.models.files.FolderActionResponse
import com.hubspot_sdk.api.models.files.FolderUpdateInputWithId
import com.hubspot_sdk.api.models.files.FolderUpdateTaskLocator
import com.hubspot_sdk.api.models.files.folders.FolderGetUpdateAsyncStatusParams
import com.hubspot_sdk.api.models.files.folders.FolderSearchPageAsync
import com.hubspot_sdk.api.models.files.folders.FolderSearchParams
import com.hubspot_sdk.api.models.files.folders.FolderUpdateAsyncByIdParams
import com.hubspot_sdk.api.models.files.folders.FolderUpdateByIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FolderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderServiceAsync

    /** Check status of folder update. Folder updates happen asynchronously. */
    fun getUpdateAsyncStatus(taskId: String): CompletableFuture<FolderActionResponse> =
        getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none())

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        taskId: String,
        params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderActionResponse> =
        getUpdateAsyncStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        taskId: String,
        params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
    ): CompletableFuture<FolderActionResponse> =
        getUpdateAsyncStatus(taskId, params, RequestOptions.none())

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        params: FolderGetUpdateAsyncStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderActionResponse>

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        params: FolderGetUpdateAsyncStatusParams
    ): CompletableFuture<FolderActionResponse> = getUpdateAsyncStatus(params, RequestOptions.none())

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderActionResponse> =
        getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none(), requestOptions)

    /** Search for folders. Does not contain hidden or archived folders. */
    fun search(): CompletableFuture<FolderSearchPageAsync> = search(FolderSearchParams.none())

    /** @see search */
    fun search(
        params: FolderSearchParams = FolderSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderSearchPageAsync>

    /** @see search */
    fun search(
        params: FolderSearchParams = FolderSearchParams.none()
    ): CompletableFuture<FolderSearchPageAsync> = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): CompletableFuture<FolderSearchPageAsync> =
        search(FolderSearchParams.none(), requestOptions)

    /**
     * Update properties of folder by given ID. This action happens asynchronously and will update
     * all of the folder's children as well.
     */
    fun updateAsyncById(
        params: FolderUpdateAsyncByIdParams
    ): CompletableFuture<FolderUpdateTaskLocator> = updateAsyncById(params, RequestOptions.none())

    /** @see updateAsyncById */
    fun updateAsyncById(
        params: FolderUpdateAsyncByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderUpdateTaskLocator>

    /** @see updateAsyncById */
    fun updateAsyncById(
        folderUpdateInputWithId: FolderUpdateInputWithId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderUpdateTaskLocator> =
        updateAsyncById(
            FolderUpdateAsyncByIdParams.builder()
                .folderUpdateInputWithId(folderUpdateInputWithId)
                .build(),
            requestOptions,
        )

    /** @see updateAsyncById */
    fun updateAsyncById(
        folderUpdateInputWithId: FolderUpdateInputWithId
    ): CompletableFuture<FolderUpdateTaskLocator> =
        updateAsyncById(folderUpdateInputWithId, RequestOptions.none())

    /** Update a folder's properties, identified by folder ID. */
    fun updateById(folderId: String, params: FolderUpdateByIdParams): CompletableFuture<Folder> =
        updateById(folderId, params, RequestOptions.none())

    /** @see updateById */
    fun updateById(
        folderId: String,
        params: FolderUpdateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder> =
        updateById(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see updateById */
    fun updateById(params: FolderUpdateByIdParams): CompletableFuture<Folder> =
        updateById(params, RequestOptions.none())

    /** @see updateById */
    fun updateById(
        params: FolderUpdateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder>

    /**
     * A view of [FolderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FolderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /files/2026-03/folders/update/async/tasks/{taskId}/status`, but is otherwise the same as
         * [FolderServiceAsync.getUpdateAsyncStatus].
         */
        fun getUpdateAsyncStatus(
            taskId: String
        ): CompletableFuture<HttpResponseFor<FolderActionResponse>> =
            getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none())

        /** @see getUpdateAsyncStatus */
        fun getUpdateAsyncStatus(
            taskId: String,
            params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderActionResponse>> =
            getUpdateAsyncStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getUpdateAsyncStatus */
        fun getUpdateAsyncStatus(
            taskId: String,
            params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<FolderActionResponse>> =
            getUpdateAsyncStatus(taskId, params, RequestOptions.none())

        /** @see getUpdateAsyncStatus */
        fun getUpdateAsyncStatus(
            params: FolderGetUpdateAsyncStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderActionResponse>>

        /** @see getUpdateAsyncStatus */
        fun getUpdateAsyncStatus(
            params: FolderGetUpdateAsyncStatusParams
        ): CompletableFuture<HttpResponseFor<FolderActionResponse>> =
            getUpdateAsyncStatus(params, RequestOptions.none())

        /** @see getUpdateAsyncStatus */
        fun getUpdateAsyncStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderActionResponse>> =
            getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/folders/search`, but is otherwise the
         * same as [FolderServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<FolderSearchPageAsync>> =
            search(FolderSearchParams.none())

        /** @see search */
        fun search(
            params: FolderSearchParams = FolderSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderSearchPageAsync>>

        /** @see search */
        fun search(
            params: FolderSearchParams = FolderSearchParams.none()
        ): CompletableFuture<HttpResponseFor<FolderSearchPageAsync>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FolderSearchPageAsync>> =
            search(FolderSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/folders/update/async`, but is
         * otherwise the same as [FolderServiceAsync.updateAsyncById].
         */
        fun updateAsyncById(
            params: FolderUpdateAsyncByIdParams
        ): CompletableFuture<HttpResponseFor<FolderUpdateTaskLocator>> =
            updateAsyncById(params, RequestOptions.none())

        /** @see updateAsyncById */
        fun updateAsyncById(
            params: FolderUpdateAsyncByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderUpdateTaskLocator>>

        /** @see updateAsyncById */
        fun updateAsyncById(
            folderUpdateInputWithId: FolderUpdateInputWithId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderUpdateTaskLocator>> =
            updateAsyncById(
                FolderUpdateAsyncByIdParams.builder()
                    .folderUpdateInputWithId(folderUpdateInputWithId)
                    .build(),
                requestOptions,
            )

        /** @see updateAsyncById */
        fun updateAsyncById(
            folderUpdateInputWithId: FolderUpdateInputWithId
        ): CompletableFuture<HttpResponseFor<FolderUpdateTaskLocator>> =
            updateAsyncById(folderUpdateInputWithId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /files/2026-03/folders/{folderId}`, but is
         * otherwise the same as [FolderServiceAsync.updateById].
         */
        fun updateById(
            folderId: String,
            params: FolderUpdateByIdParams,
        ): CompletableFuture<HttpResponseFor<Folder>> =
            updateById(folderId, params, RequestOptions.none())

        /** @see updateById */
        fun updateById(
            folderId: String,
            params: FolderUpdateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            updateById(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see updateById */
        fun updateById(params: FolderUpdateByIdParams): CompletableFuture<HttpResponseFor<Folder>> =
            updateById(params, RequestOptions.none())

        /** @see updateById */
        fun updateById(
            params: FolderUpdateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>>
    }
}
