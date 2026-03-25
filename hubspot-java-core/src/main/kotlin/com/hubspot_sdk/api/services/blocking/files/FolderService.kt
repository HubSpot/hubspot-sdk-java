// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.files.Folder
import com.hubspot_sdk.api.models.files.FolderActionResponse
import com.hubspot_sdk.api.models.files.FolderUpdateInputWithId
import com.hubspot_sdk.api.models.files.FolderUpdateTaskLocator
import com.hubspot_sdk.api.models.files.folders.FolderGetUpdateAsyncStatusParams
import com.hubspot_sdk.api.models.files.folders.FolderSearchPage
import com.hubspot_sdk.api.models.files.folders.FolderSearchParams
import com.hubspot_sdk.api.models.files.folders.FolderUpdateAsyncByIdParams
import com.hubspot_sdk.api.models.files.folders.FolderUpdateByIdParams
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
