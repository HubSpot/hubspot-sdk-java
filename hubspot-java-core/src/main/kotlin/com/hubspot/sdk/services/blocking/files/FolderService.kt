// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.files

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.files.Folder
import com.hubspot.sdk.models.files.FolderActionResponse
import com.hubspot.sdk.models.files.FolderUpdateInputWithId
import com.hubspot.sdk.models.files.FolderUpdateTaskLocator
import com.hubspot.sdk.models.files.folders.FolderDeleteByIdParams
import com.hubspot.sdk.models.files.folders.FolderDeleteByPathParams
import com.hubspot.sdk.models.files.folders.FolderGetByIdParams
import com.hubspot.sdk.models.files.folders.FolderGetByPathParams
import com.hubspot.sdk.models.files.folders.FolderGetUpdateAsyncStatusParams
import com.hubspot.sdk.models.files.folders.FolderSearchPage
import com.hubspot.sdk.models.files.folders.FolderSearchParams
import com.hubspot.sdk.models.files.folders.FolderUpdateAsyncByIdParams
import com.hubspot.sdk.models.files.folders.FolderUpdateByIdParams
import java.util.function.Consumer

interface FolderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService

    /** Delete folder by ID. */
    fun deleteById(folderId: String) = deleteById(folderId, FolderDeleteByIdParams.none())

    /** @see deleteById */
    fun deleteById(
        folderId: String,
        params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteById(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see deleteById */
    fun deleteById(
        folderId: String,
        params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
    ) = deleteById(folderId, params, RequestOptions.none())

    /** @see deleteById */
    fun deleteById(
        params: FolderDeleteByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteById */
    fun deleteById(params: FolderDeleteByIdParams) = deleteById(params, RequestOptions.none())

    /** @see deleteById */
    fun deleteById(folderId: String, requestOptions: RequestOptions) =
        deleteById(folderId, FolderDeleteByIdParams.none(), requestOptions)

    /** Delete a folder, identified by its path. */
    fun deleteByPath(folderPath: String) = deleteByPath(folderPath, FolderDeleteByPathParams.none())

    /** @see deleteByPath */
    fun deleteByPath(
        folderPath: String,
        params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

    /** @see deleteByPath */
    fun deleteByPath(
        folderPath: String,
        params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
    ) = deleteByPath(folderPath, params, RequestOptions.none())

    /** @see deleteByPath */
    fun deleteByPath(
        params: FolderDeleteByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteByPath */
    fun deleteByPath(params: FolderDeleteByPathParams) = deleteByPath(params, RequestOptions.none())

    /** @see deleteByPath */
    fun deleteByPath(folderPath: String, requestOptions: RequestOptions) =
        deleteByPath(folderPath, FolderDeleteByPathParams.none(), requestOptions)

    /** Retrieve a folder by its ID. */
    fun getById(folderId: String): Folder = getById(folderId, FolderGetByIdParams.none())

    /** @see getById */
    fun getById(
        folderId: String,
        params: FolderGetByIdParams = FolderGetByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder = getById(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see getById */
    fun getById(
        folderId: String,
        params: FolderGetByIdParams = FolderGetByIdParams.none(),
    ): Folder = getById(folderId, params, RequestOptions.none())

    /** @see getById */
    fun getById(
        params: FolderGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder

    /** @see getById */
    fun getById(params: FolderGetByIdParams): Folder = getById(params, RequestOptions.none())

    /** @see getById */
    fun getById(folderId: String, requestOptions: RequestOptions): Folder =
        getById(folderId, FolderGetByIdParams.none(), requestOptions)

    /** Retrieve a folder, identified by its path. */
    fun getByPath(folderPath: String): Folder = getByPath(folderPath, FolderGetByPathParams.none())

    /** @see getByPath */
    fun getByPath(
        folderPath: String,
        params: FolderGetByPathParams = FolderGetByPathParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder = getByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

    /** @see getByPath */
    fun getByPath(
        folderPath: String,
        params: FolderGetByPathParams = FolderGetByPathParams.none(),
    ): Folder = getByPath(folderPath, params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(
        params: FolderGetByPathParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder

    /** @see getByPath */
    fun getByPath(params: FolderGetByPathParams): Folder = getByPath(params, RequestOptions.none())

    /** @see getByPath */
    fun getByPath(folderPath: String, requestOptions: RequestOptions): Folder =
        getByPath(folderPath, FolderGetByPathParams.none(), requestOptions)

    /** Check status of folder update. Folder updates happen asynchronously. */
    fun getUpdateAsyncStatus(taskId: String): FolderActionResponse =
        getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none())

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        taskId: String,
        params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderActionResponse =
        getUpdateAsyncStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        taskId: String,
        params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
    ): FolderActionResponse = getUpdateAsyncStatus(taskId, params, RequestOptions.none())

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(
        params: FolderGetUpdateAsyncStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderActionResponse

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(params: FolderGetUpdateAsyncStatusParams): FolderActionResponse =
        getUpdateAsyncStatus(params, RequestOptions.none())

    /** @see getUpdateAsyncStatus */
    fun getUpdateAsyncStatus(taskId: String, requestOptions: RequestOptions): FolderActionResponse =
        getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none(), requestOptions)

    /** Search for folders. Does not contain hidden or archived folders. */
    fun search(): FolderSearchPage = search(FolderSearchParams.none())

    /** @see search */
    fun search(
        params: FolderSearchParams = FolderSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderSearchPage

    /** @see search */
    fun search(params: FolderSearchParams = FolderSearchParams.none()): FolderSearchPage =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): FolderSearchPage =
        search(FolderSearchParams.none(), requestOptions)

    /**
     * Update properties of folder by given ID. This action happens asynchronously and will update
     * all of the folder's children as well.
     */
    fun updateAsyncById(params: FolderUpdateAsyncByIdParams): FolderUpdateTaskLocator =
        updateAsyncById(params, RequestOptions.none())

    /** @see updateAsyncById */
    fun updateAsyncById(
        params: FolderUpdateAsyncByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderUpdateTaskLocator

    /** @see updateAsyncById */
    fun updateAsyncById(
        folderUpdateInputWithId: FolderUpdateInputWithId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderUpdateTaskLocator =
        updateAsyncById(
            FolderUpdateAsyncByIdParams.builder()
                .folderUpdateInputWithId(folderUpdateInputWithId)
                .build(),
            requestOptions,
        )

    /** @see updateAsyncById */
    fun updateAsyncById(folderUpdateInputWithId: FolderUpdateInputWithId): FolderUpdateTaskLocator =
        updateAsyncById(folderUpdateInputWithId, RequestOptions.none())

    /** Update a folder's properties, identified by folder ID. */
    fun updateById(folderId: String, params: FolderUpdateByIdParams): Folder =
        updateById(folderId, params, RequestOptions.none())

    /** @see updateById */
    fun updateById(
        folderId: String,
        params: FolderUpdateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder = updateById(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see updateById */
    fun updateById(params: FolderUpdateByIdParams): Folder =
        updateById(params, RequestOptions.none())

    /** @see updateById */
    fun updateById(
        params: FolderUpdateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder

    /** A view of [FolderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/folders/{folderId}`, but is
         * otherwise the same as [FolderService.deleteById].
         */
        @MustBeClosed
        fun deleteById(folderId: String): HttpResponse =
            deleteById(folderId, FolderDeleteByIdParams.none())

        /** @see deleteById */
        @MustBeClosed
        fun deleteById(
            folderId: String,
            params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteById(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see deleteById */
        @MustBeClosed
        fun deleteById(
            folderId: String,
            params: FolderDeleteByIdParams = FolderDeleteByIdParams.none(),
        ): HttpResponse = deleteById(folderId, params, RequestOptions.none())

        /** @see deleteById */
        @MustBeClosed
        fun deleteById(
            params: FolderDeleteByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteById */
        @MustBeClosed
        fun deleteById(params: FolderDeleteByIdParams): HttpResponse =
            deleteById(params, RequestOptions.none())

        /** @see deleteById */
        @MustBeClosed
        fun deleteById(folderId: String, requestOptions: RequestOptions): HttpResponse =
            deleteById(folderId, FolderDeleteByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /files/2026-03/folders/{folderPath}`, but is
         * otherwise the same as [FolderService.deleteByPath].
         */
        @MustBeClosed
        fun deleteByPath(folderPath: String): HttpResponse =
            deleteByPath(folderPath, FolderDeleteByPathParams.none())

        /** @see deleteByPath */
        @MustBeClosed
        fun deleteByPath(
            folderPath: String,
            params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

        /** @see deleteByPath */
        @MustBeClosed
        fun deleteByPath(
            folderPath: String,
            params: FolderDeleteByPathParams = FolderDeleteByPathParams.none(),
        ): HttpResponse = deleteByPath(folderPath, params, RequestOptions.none())

        /** @see deleteByPath */
        @MustBeClosed
        fun deleteByPath(
            params: FolderDeleteByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteByPath */
        @MustBeClosed
        fun deleteByPath(params: FolderDeleteByPathParams): HttpResponse =
            deleteByPath(params, RequestOptions.none())

        /** @see deleteByPath */
        @MustBeClosed
        fun deleteByPath(folderPath: String, requestOptions: RequestOptions): HttpResponse =
            deleteByPath(folderPath, FolderDeleteByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/folders/{folderId}`, but is otherwise
         * the same as [FolderService.getById].
         */
        @MustBeClosed
        fun getById(folderId: String): HttpResponseFor<Folder> =
            getById(folderId, FolderGetByIdParams.none())

        /** @see getById */
        @MustBeClosed
        fun getById(
            folderId: String,
            params: FolderGetByIdParams = FolderGetByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder> =
            getById(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see getById */
        @MustBeClosed
        fun getById(
            folderId: String,
            params: FolderGetByIdParams = FolderGetByIdParams.none(),
        ): HttpResponseFor<Folder> = getById(folderId, params, RequestOptions.none())

        /** @see getById */
        @MustBeClosed
        fun getById(
            params: FolderGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder>

        /** @see getById */
        @MustBeClosed
        fun getById(params: FolderGetByIdParams): HttpResponseFor<Folder> =
            getById(params, RequestOptions.none())

        /** @see getById */
        @MustBeClosed
        fun getById(folderId: String, requestOptions: RequestOptions): HttpResponseFor<Folder> =
            getById(folderId, FolderGetByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/folders/{folderPath}`, but is
         * otherwise the same as [FolderService.getByPath].
         */
        @MustBeClosed
        fun getByPath(folderPath: String): HttpResponseFor<Folder> =
            getByPath(folderPath, FolderGetByPathParams.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            folderPath: String,
            params: FolderGetByPathParams = FolderGetByPathParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder> =
            getByPath(params.toBuilder().folderPath(folderPath).build(), requestOptions)

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            folderPath: String,
            params: FolderGetByPathParams = FolderGetByPathParams.none(),
        ): HttpResponseFor<Folder> = getByPath(folderPath, params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(
            params: FolderGetByPathParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder>

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(params: FolderGetByPathParams): HttpResponseFor<Folder> =
            getByPath(params, RequestOptions.none())

        /** @see getByPath */
        @MustBeClosed
        fun getByPath(folderPath: String, requestOptions: RequestOptions): HttpResponseFor<Folder> =
            getByPath(folderPath, FolderGetByPathParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /files/2026-03/folders/update/async/tasks/{taskId}/status`, but is otherwise the same as
         * [FolderService.getUpdateAsyncStatus].
         */
        @MustBeClosed
        fun getUpdateAsyncStatus(taskId: String): HttpResponseFor<FolderActionResponse> =
            getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none())

        /** @see getUpdateAsyncStatus */
        @MustBeClosed
        fun getUpdateAsyncStatus(
            taskId: String,
            params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderActionResponse> =
            getUpdateAsyncStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getUpdateAsyncStatus */
        @MustBeClosed
        fun getUpdateAsyncStatus(
            taskId: String,
            params: FolderGetUpdateAsyncStatusParams = FolderGetUpdateAsyncStatusParams.none(),
        ): HttpResponseFor<FolderActionResponse> =
            getUpdateAsyncStatus(taskId, params, RequestOptions.none())

        /** @see getUpdateAsyncStatus */
        @MustBeClosed
        fun getUpdateAsyncStatus(
            params: FolderGetUpdateAsyncStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderActionResponse>

        /** @see getUpdateAsyncStatus */
        @MustBeClosed
        fun getUpdateAsyncStatus(
            params: FolderGetUpdateAsyncStatusParams
        ): HttpResponseFor<FolderActionResponse> =
            getUpdateAsyncStatus(params, RequestOptions.none())

        /** @see getUpdateAsyncStatus */
        @MustBeClosed
        fun getUpdateAsyncStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderActionResponse> =
            getUpdateAsyncStatus(taskId, FolderGetUpdateAsyncStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files/2026-03/folders/search`, but is otherwise the
         * same as [FolderService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<FolderSearchPage> = search(FolderSearchParams.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: FolderSearchParams = FolderSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderSearchPage>

        /** @see search */
        @MustBeClosed
        fun search(
            params: FolderSearchParams = FolderSearchParams.none()
        ): HttpResponseFor<FolderSearchPage> = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<FolderSearchPage> =
            search(FolderSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /files/2026-03/folders/update/async`, but is
         * otherwise the same as [FolderService.updateAsyncById].
         */
        @MustBeClosed
        fun updateAsyncById(
            params: FolderUpdateAsyncByIdParams
        ): HttpResponseFor<FolderUpdateTaskLocator> = updateAsyncById(params, RequestOptions.none())

        /** @see updateAsyncById */
        @MustBeClosed
        fun updateAsyncById(
            params: FolderUpdateAsyncByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderUpdateTaskLocator>

        /** @see updateAsyncById */
        @MustBeClosed
        fun updateAsyncById(
            folderUpdateInputWithId: FolderUpdateInputWithId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderUpdateTaskLocator> =
            updateAsyncById(
                FolderUpdateAsyncByIdParams.builder()
                    .folderUpdateInputWithId(folderUpdateInputWithId)
                    .build(),
                requestOptions,
            )

        /** @see updateAsyncById */
        @MustBeClosed
        fun updateAsyncById(
            folderUpdateInputWithId: FolderUpdateInputWithId
        ): HttpResponseFor<FolderUpdateTaskLocator> =
            updateAsyncById(folderUpdateInputWithId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /files/2026-03/folders/{folderId}`, but is
         * otherwise the same as [FolderService.updateById].
         */
        @MustBeClosed
        fun updateById(folderId: String, params: FolderUpdateByIdParams): HttpResponseFor<Folder> =
            updateById(folderId, params, RequestOptions.none())

        /** @see updateById */
        @MustBeClosed
        fun updateById(
            folderId: String,
            params: FolderUpdateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder> =
            updateById(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see updateById */
        @MustBeClosed
        fun updateById(params: FolderUpdateByIdParams): HttpResponseFor<Folder> =
            updateById(params, RequestOptions.none())

        /** @see updateById */
        @MustBeClosed
        fun updateById(
            params: FolderUpdateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder>
    }
}
