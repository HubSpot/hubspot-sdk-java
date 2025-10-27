// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.files.Folder
import com.hubspot_sdk.api.models.files.FolderActionResponse
import com.hubspot_sdk.api.models.files.FolderInput
import com.hubspot_sdk.api.models.files.FolderUpdateInputWithId
import com.hubspot_sdk.api.models.files.FolderUpdateTaskLocator
import com.hubspot_sdk.api.models.files.folders.FolderCreateParams
import com.hubspot_sdk.api.models.files.folders.FolderDeleteByIdParams
import com.hubspot_sdk.api.models.files.folders.FolderDeleteByPathParams
import com.hubspot_sdk.api.models.files.folders.FolderGetByIdParams
import com.hubspot_sdk.api.models.files.folders.FolderGetByPathParams
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

    /** Creates a folder. */
    fun create(params: FolderCreateParams): CompletableFuture<Folder> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder>

    /** @see create */
    fun create(
        folderInput: FolderInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder> =
        create(FolderCreateParams.builder().folderInput(folderInput).build(), requestOptions)

    /** @see create */
    fun create(folderInput: FolderInput): CompletableFuture<Folder> =
        create(folderInput, RequestOptions.none())

    /** Delete folder by ID. */
    fun deleteById(folderId: String): CompletableFuture<Void?> =
        deleteById(folderId, FolderDeleteByIdParams.none())

    /** @see deleteById */
    fun deleteById(
        folderId: String,
        params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteById(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see deleteById */
    fun deleteById(
        folderId: String,
        params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
    ): CompletableFuture<Void?> = deleteById(folderId, params, RequestOptions.none())

    /** @see deleteById */
    fun deleteById(
        params: FolderDeleteByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteById */
    fun deleteById(params: FolderDeleteByIdParams): CompletableFuture<Void?> =
        deleteById(params, RequestOptions.none())

    /** @see deleteById */
    fun deleteById(folderId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteById(folderId, FolderDeleteByIdParams.none(), requestOptions)

    /** Delete a folder, identified by its path. */
    fun deleteByPath(folderPath: String): CompletableFuture<Void?> =
        deleteByPath(folderPath, FolderDeleteByPathParams.none())

    /** @see deleteByPath */
    fun deleteByPath(
        folderPath: String,
        params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

    /** @see deleteByPath */
    fun deleteByPath(
        folderPath: String,
        params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
    ): CompletableFuture<Void?> = deleteByPath(folderPath, params, RequestOptions.none())

    /** @see deleteByPath */
    fun deleteByPath(
        params: FolderDeleteByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteByPath */
    fun deleteByPath(params: FolderDeleteByPathParams): CompletableFuture<Void?> =
        deleteByPath(params, RequestOptions.none())

    /** @see deleteByPath */
    fun deleteByPath(folderPath: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteByPath(folderPath, FolderDeleteByPathParams.none(), requestOptions)

    /** Retrieve a folder by its ID. */
    fun getById(folderId: String): CompletableFuture<Folder> =
        getById(folderId, FolderGetByIdParams.none())

    /** @see getById */
    fun getById(
        folderId: String,
        params: FolderGetByIdParams = FolderGetByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder> =
        getById(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see getById */
    fun getById(
        folderId: String,
        params: FolderGetByIdParams = FolderGetByIdParams.none(),
    ): CompletableFuture<Folder> = getById(folderId, params, RequestOptions.none())

    /** @see getById */
    fun getById(
        params: FolderGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder>

    /** @see getById */
    fun getById(params: FolderGetByIdParams): CompletableFuture<Folder> =
        getById(params, RequestOptions.none())

    /** @see getById */
    fun getById(folderId: String, requestOptions: RequestOptions): CompletableFuture<Folder> =
        getById(folderId, FolderGetByIdParams.none(), requestOptions)

    /** Retrieve a folder, identified by its path. */
    fun getByPath(folderPath: String): CompletableFuture<Folder> =
        getByPath(folderPath, FolderGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        folderPath: String,
        params: FolderGetByPathParams = FolderGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder> =
        getByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        folderPath: String,
        params: FolderGetByPathParams = FolderGetByPathParams.none(),
    ): CompletableFuture<Folder> = getByPath(folderPath, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FolderGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder>

    /** @see getByPath */
    fun getByPath(params: FolderGetByPathParams): CompletableFuture<Folder> =
        getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(folderPath: String, requestOptions: RequestOptions): CompletableFuture<Folder> =
        getByPath(folderPath, FolderGetByPathParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /files/v3/folders`, but is otherwise the same as
         * [FolderServiceAsync.create].
         */
        fun create(params: FolderCreateParams): CompletableFuture<HttpResponseFor<Folder>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>>

        /** @see create */
        fun create(
            folderInput: FolderInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            create(FolderCreateParams.builder().folderInput(folderInput).build(), requestOptions)

        /** @see create */
        fun create(folderInput: FolderInput): CompletableFuture<HttpResponseFor<Folder>> =
            create(folderInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /files/v3/folders/{folderId}`, but is otherwise
         * the same as [FolderServiceAsync.deleteById].
         */
        fun deleteById(folderId: String): CompletableFuture<HttpResponse> =
            deleteById(folderId, FolderDeleteByIdParams.none())

        /** @see deleteById */
        fun deleteById(
            folderId: String,
            params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteById(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see deleteById */
        fun deleteById(
            folderId: String,
            params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
        ): CompletableFuture<HttpResponse> = deleteById(folderId, params, RequestOptions.none())

        /** @see deleteById */
        fun deleteById(
            params: FolderDeleteByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteById */
        fun deleteById(params: FolderDeleteByIdParams): CompletableFuture<HttpResponse> =
            deleteById(params, RequestOptions.none())

        /** @see deleteById */
        fun deleteById(
            folderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteById(folderId, FolderDeleteByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/v3/folders/{folderPath}`, but is otherwise
         * the same as [FolderServiceAsync.deleteByPath].
         */
        fun deleteByPath(folderPath: String): CompletableFuture<HttpResponse> =
            deleteByPath(folderPath, FolderDeleteByPathParams.none())

        /** @see deleteByPath */
        fun deleteByPath(
            folderPath: String,
            params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

        /** @see deleteByPath */
        fun deleteByPath(
            folderPath: String,
            params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
        ): CompletableFuture<HttpResponse> = deleteByPath(folderPath, params, RequestOptions.none())

        /** @see deleteByPath */
        fun deleteByPath(
            params: FolderDeleteByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteByPath */
        fun deleteByPath(params: FolderDeleteByPathParams): CompletableFuture<HttpResponse> =
            deleteByPath(params, RequestOptions.none())

        /** @see deleteByPath */
        fun deleteByPath(
            folderPath: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteByPath(folderPath, FolderDeleteByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/folders/{folderId}`, but is otherwise the
         * same as [FolderServiceAsync.getById].
         */
        fun getById(folderId: String): CompletableFuture<HttpResponseFor<Folder>> =
            getById(folderId, FolderGetByIdParams.none())

        /** @see getById */
        fun getById(
            folderId: String,
            params: FolderGetByIdParams = FolderGetByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            getById(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see getById */
        fun getById(
            folderId: String,
            params: FolderGetByIdParams = FolderGetByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            getById(folderId, params, RequestOptions.none())

        /** @see getById */
        fun getById(
            params: FolderGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>>

        /** @see getById */
        fun getById(params: FolderGetByIdParams): CompletableFuture<HttpResponseFor<Folder>> =
            getById(params, RequestOptions.none())

        /** @see getById */
        fun getById(
            folderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Folder>> =
            getById(folderId, FolderGetByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/v3/folders/{folderPath}`, but is otherwise
         * the same as [FolderServiceAsync.getByPath].
         */
        fun getByPath(folderPath: String): CompletableFuture<HttpResponseFor<Folder>> =
            getByPath(folderPath, FolderGetByPathParams.none())

        /** @see getByPath */
        fun getByPath(
            folderPath: String,
            params: FolderGetByPathParams = FolderGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            getByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

        /** @see getByPath */
        fun getByPath(
            folderPath: String,
            params: FolderGetByPathParams = FolderGetByPathParams.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            getByPath(folderPath, params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            params: FolderGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>>

        /** @see getByPath */
        fun getByPath(params: FolderGetByPathParams): CompletableFuture<HttpResponseFor<Folder>> =
            getByPath(params, RequestOptions.none())

        /** @see getByPath */
        fun getByPath(
            folderPath: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Folder>> =
            getByPath(folderPath, FolderGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/v3/folders/update/async/tasks/{taskId}/status`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /files/v3/folders/search`, but is otherwise the same
         * as [FolderServiceAsync.search].
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
         * Returns a raw HTTP response for `post /files/v3/folders/update/async`, but is otherwise
         * the same as [FolderServiceAsync.updateAsyncById].
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
         * Returns a raw HTTP response for `patch /files/v3/folders/{folderId}`, but is otherwise
         * the same as [FolderServiceAsync.updateById].
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
