// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.pages.BatchResponseContentFolder
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.models.cms.pages.ContentFolderVersion
import com.hubspot_sdk.api.models.cms.pages.folders.FolderCreateFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderDeleteFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFolderRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFolderRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFoldersPageAsync
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFoldersParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderRestoreFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderUpdateFolderParams
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

    /** Create a new folder for landing pages. */
    fun createFolder(params: FolderCreateFolderParams): CompletableFuture<ContentFolder> =
        createFolder(params, RequestOptions.none())

    /** @see createFolder */
    fun createFolder(
        params: FolderCreateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** @see createFolder */
    fun createFolder(
        contentFolder: ContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        createFolder(
            FolderCreateFolderParams.builder().contentFolder(contentFolder).build(),
            requestOptions,
        )

    /** @see createFolder */
    fun createFolder(contentFolder: ContentFolder): CompletableFuture<ContentFolder> =
        createFolder(contentFolder, RequestOptions.none())

    /** Delete a landing page folder, specified by its ID. */
    fun deleteFolder(objectId: String): CompletableFuture<Void?> =
        deleteFolder(objectId, FolderDeleteFolderParams.none())

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
    ): CompletableFuture<Void?> = deleteFolder(objectId, params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(
        params: FolderDeleteFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteFolder */
    fun deleteFolder(params: FolderDeleteFolderParams): CompletableFuture<Void?> =
        deleteFolder(params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteFolder(objectId, FolderDeleteFolderParams.none(), requestOptions)

    /** Retrieve a landing page folder, specified by its ID. */
    fun getFolder(objectId: String): CompletableFuture<ContentFolder> =
        getFolder(objectId, FolderGetFolderParams.none())

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: FolderGetFolderParams = FolderGetFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: FolderGetFolderParams = FolderGetFolderParams.none(),
    ): CompletableFuture<ContentFolder> = getFolder(objectId, params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(
        params: FolderGetFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** @see getFolder */
    fun getFolder(params: FolderGetFolderParams): CompletableFuture<ContentFolder> =
        getFolder(params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentFolder> =
        getFolder(objectId, FolderGetFolderParams.none(), requestOptions)

    /** Retrieve a previous version of a folder, specified by the folder ID and revision ID. */
    fun getFolderRevision(
        revisionId: String,
        params: FolderGetFolderRevisionParams,
    ): CompletableFuture<ContentFolderVersion> =
        getFolderRevision(revisionId, params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        revisionId: String,
        params: FolderGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolderVersion> =
        getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getFolderRevision */
    fun getFolderRevision(
        params: FolderGetFolderRevisionParams
    ): CompletableFuture<ContentFolderVersion> = getFolderRevision(params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        params: FolderGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolderVersion>

    /** Retrieve a batch of landing page folders as identified in the request body. */
    fun getFoldersBatch(
        params: FolderGetFoldersBatchParams
    ): CompletableFuture<BatchResponseContentFolder> =
        getFoldersBatch(params, RequestOptions.none())

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        params: FolderGetFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder>

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder> =
        getFoldersBatch(
            FolderGetFoldersBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseContentFolder> =
        getFoldersBatch(batchInputString, RequestOptions.none())

    /** Retrieves all the previous versions of a landing page folder. */
    fun listFolderRevisions(
        objectId: String
    ): CompletableFuture<FolderListFolderRevisionsPageAsync> =
        listFolderRevisions(objectId, FolderListFolderRevisionsParams.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderListFolderRevisionsPageAsync> =
        listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
    ): CompletableFuture<FolderListFolderRevisionsPageAsync> =
        listFolderRevisions(objectId, params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: FolderListFolderRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderListFolderRevisionsPageAsync>

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: FolderListFolderRevisionsParams
    ): CompletableFuture<FolderListFolderRevisionsPageAsync> =
        listFolderRevisions(params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderListFolderRevisionsPageAsync> =
        listFolderRevisions(objectId, FolderListFolderRevisionsParams.none(), requestOptions)

    /**
     * Get the list of Landing Page Folders. Supports paging and filtering. This method would be
     * useful for an integration that examined these models and used an external service to suggest
     * edits.
     */
    fun listFolders(): CompletableFuture<FolderListFoldersPageAsync> =
        listFolders(FolderListFoldersParams.none())

    /** @see listFolders */
    fun listFolders(
        params: FolderListFoldersParams = FolderListFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderListFoldersPageAsync>

    /** @see listFolders */
    fun listFolders(
        params: FolderListFoldersParams = FolderListFoldersParams.none()
    ): CompletableFuture<FolderListFoldersPageAsync> = listFolders(params, RequestOptions.none())

    /** @see listFolders */
    fun listFolders(requestOptions: RequestOptions): CompletableFuture<FolderListFoldersPageAsync> =
        listFolders(FolderListFoldersParams.none(), requestOptions)

    /** Takes a specified version of a landing page folder and restores it. */
    fun restoreFolderRevision(
        revisionId: String,
        params: FolderRestoreFolderRevisionParams,
    ): CompletableFuture<ContentFolder> =
        restoreFolderRevision(revisionId, params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        revisionId: String,
        params: FolderRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        params: FolderRestoreFolderRevisionParams
    ): CompletableFuture<ContentFolder> = restoreFolderRevision(params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        params: FolderRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /**
     * Partially update a landing page folder, specified by the folder ID. You only need to specify
     * the details values that you are modifying.
     */
    fun updateFolder(
        objectId: String,
        params: FolderUpdateFolderParams,
    ): CompletableFuture<ContentFolder> = updateFolder(objectId, params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        objectId: String,
        params: FolderUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateFolder */
    fun updateFolder(params: FolderUpdateFolderParams): CompletableFuture<ContentFolder> =
        updateFolder(params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        params: FolderUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

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
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/folders`, but is
         * otherwise the same as [FolderServiceAsync.createFolder].
         */
        fun createFolder(
            params: FolderCreateFolderParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            createFolder(params, RequestOptions.none())

        /** @see createFolder */
        fun createFolder(
            params: FolderCreateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /** @see createFolder */
        fun createFolder(
            contentFolder: ContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            createFolder(
                FolderCreateFolderParams.builder().contentFolder(contentFolder).build(),
                requestOptions,
            )

        /** @see createFolder */
        fun createFolder(
            contentFolder: ContentFolder
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            createFolder(contentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderServiceAsync.deleteFolder].
         */
        fun deleteFolder(objectId: String): CompletableFuture<HttpResponse> =
            deleteFolder(objectId, FolderDeleteFolderParams.none())

        /** @see deleteFolder */
        fun deleteFolder(
            objectId: String,
            params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see deleteFolder */
        fun deleteFolder(
            objectId: String,
            params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
        ): CompletableFuture<HttpResponse> = deleteFolder(objectId, params, RequestOptions.none())

        /** @see deleteFolder */
        fun deleteFolder(
            params: FolderDeleteFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteFolder */
        fun deleteFolder(params: FolderDeleteFolderParams): CompletableFuture<HttpResponse> =
            deleteFolder(params, RequestOptions.none())

        /** @see deleteFolder */
        fun deleteFolder(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteFolder(objectId, FolderDeleteFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderServiceAsync.getFolder].
         */
        fun getFolder(objectId: String): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(objectId, FolderGetFolderParams.none())

        /** @see getFolder */
        fun getFolder(
            objectId: String,
            params: FolderGetFolderParams = FolderGetFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getFolder */
        fun getFolder(
            objectId: String,
            params: FolderGetFolderParams = FolderGetFolderParams.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(objectId, params, RequestOptions.none())

        /** @see getFolder */
        fun getFolder(
            params: FolderGetFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /** @see getFolder */
        fun getFolder(
            params: FolderGetFolderParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(params, RequestOptions.none())

        /** @see getFolder */
        fun getFolder(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(objectId, FolderGetFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}`, but is
         * otherwise the same as [FolderServiceAsync.getFolderRevision].
         */
        fun getFolderRevision(
            revisionId: String,
            params: FolderGetFolderRevisionParams,
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>> =
            getFolderRevision(revisionId, params, RequestOptions.none())

        /** @see getFolderRevision */
        fun getFolderRevision(
            revisionId: String,
            params: FolderGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>> =
            getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getFolderRevision */
        fun getFolderRevision(
            params: FolderGetFolderRevisionParams
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>> =
            getFolderRevision(params, RequestOptions.none())

        /** @see getFolderRevision */
        fun getFolderRevision(
            params: FolderGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/read`, but is otherwise the same as
         * [FolderServiceAsync.getFoldersBatch].
         */
        fun getFoldersBatch(
            params: FolderGetFoldersBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            getFoldersBatch(params, RequestOptions.none())

        /** @see getFoldersBatch */
        fun getFoldersBatch(
            params: FolderGetFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>>

        /** @see getFoldersBatch */
        fun getFoldersBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            getFoldersBatch(
                FolderGetFoldersBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getFoldersBatch */
        fun getFoldersBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            getFoldersBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions`, but is otherwise the same
         * as [FolderServiceAsync.listFolderRevisions].
         */
        fun listFolderRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<FolderListFolderRevisionsPageAsync>> =
            listFolderRevisions(objectId, FolderListFolderRevisionsParams.none())

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            objectId: String,
            params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderListFolderRevisionsPageAsync>> =
            listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            objectId: String,
            params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<FolderListFolderRevisionsPageAsync>> =
            listFolderRevisions(objectId, params, RequestOptions.none())

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            params: FolderListFolderRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderListFolderRevisionsPageAsync>>

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            params: FolderListFolderRevisionsParams
        ): CompletableFuture<HttpResponseFor<FolderListFolderRevisionsPageAsync>> =
            listFolderRevisions(params, RequestOptions.none())

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderListFolderRevisionsPageAsync>> =
            listFolderRevisions(objectId, FolderListFolderRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders`, but is
         * otherwise the same as [FolderServiceAsync.listFolders].
         */
        fun listFolders(): CompletableFuture<HttpResponseFor<FolderListFoldersPageAsync>> =
            listFolders(FolderListFoldersParams.none())

        /** @see listFolders */
        fun listFolders(
            params: FolderListFoldersParams = FolderListFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderListFoldersPageAsync>>

        /** @see listFolders */
        fun listFolders(
            params: FolderListFoldersParams = FolderListFoldersParams.none()
        ): CompletableFuture<HttpResponseFor<FolderListFoldersPageAsync>> =
            listFolders(params, RequestOptions.none())

        /** @see listFolders */
        fun listFolders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FolderListFoldersPageAsync>> =
            listFolders(FolderListFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}/restore`, but
         * is otherwise the same as [FolderServiceAsync.restoreFolderRevision].
         */
        fun restoreFolderRevision(
            revisionId: String,
            params: FolderRestoreFolderRevisionParams,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreFolderRevision(revisionId, params, RequestOptions.none())

        /** @see restoreFolderRevision */
        fun restoreFolderRevision(
            revisionId: String,
            params: FolderRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreFolderRevision */
        fun restoreFolderRevision(
            params: FolderRestoreFolderRevisionParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreFolderRevision(params, RequestOptions.none())

        /** @see restoreFolderRevision */
        fun restoreFolderRevision(
            params: FolderRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /**
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderServiceAsync.updateFolder].
         */
        fun updateFolder(
            objectId: String,
            params: FolderUpdateFolderParams,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            updateFolder(objectId, params, RequestOptions.none())

        /** @see updateFolder */
        fun updateFolder(
            objectId: String,
            params: FolderUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateFolder */
        fun updateFolder(
            params: FolderUpdateFolderParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            updateFolder(params, RequestOptions.none())

        /** @see updateFolder */
        fun updateFolder(
            params: FolderUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>
    }
}
