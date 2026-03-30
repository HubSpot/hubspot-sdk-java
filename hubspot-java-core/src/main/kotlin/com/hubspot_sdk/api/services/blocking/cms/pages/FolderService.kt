// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFolderRevisionsPage
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFolderRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFoldersPage
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFoldersParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderRestoreFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderUpdateFolderParams
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

    /** Create a new folder for landing pages. */
    fun createFolder(params: FolderCreateFolderParams): ContentFolder =
        createFolder(params, RequestOptions.none())

    /** @see createFolder */
    fun createFolder(
        params: FolderCreateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** @see createFolder */
    fun createFolder(
        contentFolder: ContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder =
        createFolder(
            FolderCreateFolderParams.builder().contentFolder(contentFolder).build(),
            requestOptions,
        )

    /** @see createFolder */
    fun createFolder(contentFolder: ContentFolder): ContentFolder =
        createFolder(contentFolder, RequestOptions.none())

    /** Delete a landing page folder, specified by its ID. */
    fun deleteFolder(objectId: String) = deleteFolder(objectId, FolderDeleteFolderParams.none())

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
    ) = deleteFolder(objectId, params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(
        params: FolderDeleteFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteFolder */
    fun deleteFolder(params: FolderDeleteFolderParams) = deleteFolder(params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(objectId: String, requestOptions: RequestOptions) =
        deleteFolder(objectId, FolderDeleteFolderParams.none(), requestOptions)

    /** Retrieve a landing page folder, specified by its ID. */
    fun getFolder(objectId: String): ContentFolder =
        getFolder(objectId, FolderGetFolderParams.none())

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: FolderGetFolderParams = FolderGetFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder = getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: FolderGetFolderParams = FolderGetFolderParams.none(),
    ): ContentFolder = getFolder(objectId, params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(
        params: FolderGetFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** @see getFolder */
    fun getFolder(params: FolderGetFolderParams): ContentFolder =
        getFolder(params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(objectId: String, requestOptions: RequestOptions): ContentFolder =
        getFolder(objectId, FolderGetFolderParams.none(), requestOptions)

    /** Retrieve a previous version of a folder, specified by the folder ID and revision ID. */
    fun getFolderRevision(
        revisionId: String,
        params: FolderGetFolderRevisionParams,
    ): ContentFolderVersion = getFolderRevision(revisionId, params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        revisionId: String,
        params: FolderGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolderVersion =
        getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getFolderRevision */
    fun getFolderRevision(params: FolderGetFolderRevisionParams): ContentFolderVersion =
        getFolderRevision(params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        params: FolderGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolderVersion

    /** Retrieve a batch of landing page folders as identified in the request body. */
    fun getFoldersBatch(params: FolderGetFoldersBatchParams): BatchResponseContentFolder =
        getFoldersBatch(params, RequestOptions.none())

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        params: FolderGetFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder =
        getFoldersBatch(
            FolderGetFoldersBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getFoldersBatch */
    fun getFoldersBatch(batchInputString: BatchInputString): BatchResponseContentFolder =
        getFoldersBatch(batchInputString, RequestOptions.none())

    /** Retrieves all the previous versions of a landing page folder. */
    fun listFolderRevisions(objectId: String): FolderListFolderRevisionsPage =
        listFolderRevisions(objectId, FolderListFolderRevisionsParams.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderListFolderRevisionsPage =
        listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
    ): FolderListFolderRevisionsPage = listFolderRevisions(objectId, params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: FolderListFolderRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderListFolderRevisionsPage

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: FolderListFolderRevisionsParams
    ): FolderListFolderRevisionsPage = listFolderRevisions(params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): FolderListFolderRevisionsPage =
        listFolderRevisions(objectId, FolderListFolderRevisionsParams.none(), requestOptions)

    /**
     * Get the list of Landing Page Folders. Supports paging and filtering. This method would be
     * useful for an integration that examined these models and used an external service to suggest
     * edits.
     */
    fun listFolders(): FolderListFoldersPage = listFolders(FolderListFoldersParams.none())

    /** @see listFolders */
    fun listFolders(
        params: FolderListFoldersParams = FolderListFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderListFoldersPage

    /** @see listFolders */
    fun listFolders(
        params: FolderListFoldersParams = FolderListFoldersParams.none()
    ): FolderListFoldersPage = listFolders(params, RequestOptions.none())

    /** @see listFolders */
    fun listFolders(requestOptions: RequestOptions): FolderListFoldersPage =
        listFolders(FolderListFoldersParams.none(), requestOptions)

    /** Takes a specified version of a landing page folder and restores it. */
    fun restoreFolderRevision(
        revisionId: String,
        params: FolderRestoreFolderRevisionParams,
    ): ContentFolder = restoreFolderRevision(revisionId, params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        revisionId: String,
        params: FolderRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder =
        restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(params: FolderRestoreFolderRevisionParams): ContentFolder =
        restoreFolderRevision(params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        params: FolderRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /**
     * Partially update a landing page folder, specified by the folder ID. You only need to specify
     * the details values that you are modifying.
     */
    fun updateFolder(objectId: String, params: FolderUpdateFolderParams): ContentFolder =
        updateFolder(objectId, params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        objectId: String,
        params: FolderUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder = updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateFolder */
    fun updateFolder(params: FolderUpdateFolderParams): ContentFolder =
        updateFolder(params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        params: FolderUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** A view of [FolderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/folders`, but is
         * otherwise the same as [FolderService.createFolder].
         */
        @MustBeClosed
        fun createFolder(params: FolderCreateFolderParams): HttpResponseFor<ContentFolder> =
            createFolder(params, RequestOptions.none())

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(
            params: FolderCreateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(
            contentFolder: ContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            createFolder(
                FolderCreateFolderParams.builder().contentFolder(contentFolder).build(),
                requestOptions,
            )

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(contentFolder: ContentFolder): HttpResponseFor<ContentFolder> =
            createFolder(contentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderService.deleteFolder].
         */
        @MustBeClosed
        fun deleteFolder(objectId: String): HttpResponse =
            deleteFolder(objectId, FolderDeleteFolderParams.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            objectId: String,
            params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            objectId: String,
            params: FolderDeleteFolderParams = FolderDeleteFolderParams.none(),
        ): HttpResponse = deleteFolder(objectId, params, RequestOptions.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            params: FolderDeleteFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(params: FolderDeleteFolderParams): HttpResponse =
            deleteFolder(params, RequestOptions.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(objectId: String, requestOptions: RequestOptions): HttpResponse =
            deleteFolder(objectId, FolderDeleteFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderService.getFolder].
         */
        @MustBeClosed
        fun getFolder(objectId: String): HttpResponseFor<ContentFolder> =
            getFolder(objectId, FolderGetFolderParams.none())

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            objectId: String,
            params: FolderGetFolderParams = FolderGetFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            objectId: String,
            params: FolderGetFolderParams = FolderGetFolderParams.none(),
        ): HttpResponseFor<ContentFolder> = getFolder(objectId, params, RequestOptions.none())

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            params: FolderGetFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(params: FolderGetFolderParams): HttpResponseFor<ContentFolder> =
            getFolder(params, RequestOptions.none())

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolder> =
            getFolder(objectId, FolderGetFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}`, but is
         * otherwise the same as [FolderService.getFolderRevision].
         */
        @MustBeClosed
        fun getFolderRevision(
            revisionId: String,
            params: FolderGetFolderRevisionParams,
        ): HttpResponseFor<ContentFolderVersion> =
            getFolderRevision(revisionId, params, RequestOptions.none())

        /** @see getFolderRevision */
        @MustBeClosed
        fun getFolderRevision(
            revisionId: String,
            params: FolderGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolderVersion> =
            getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getFolderRevision */
        @MustBeClosed
        fun getFolderRevision(
            params: FolderGetFolderRevisionParams
        ): HttpResponseFor<ContentFolderVersion> = getFolderRevision(params, RequestOptions.none())

        /** @see getFolderRevision */
        @MustBeClosed
        fun getFolderRevision(
            params: FolderGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolderVersion>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/read`, but is otherwise the same as
         * [FolderService.getFoldersBatch].
         */
        @MustBeClosed
        fun getFoldersBatch(
            params: FolderGetFoldersBatchParams
        ): HttpResponseFor<BatchResponseContentFolder> =
            getFoldersBatch(params, RequestOptions.none())

        /** @see getFoldersBatch */
        @MustBeClosed
        fun getFoldersBatch(
            params: FolderGetFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder>

        /** @see getFoldersBatch */
        @MustBeClosed
        fun getFoldersBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder> =
            getFoldersBatch(
                FolderGetFoldersBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getFoldersBatch */
        @MustBeClosed
        fun getFoldersBatch(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseContentFolder> =
            getFoldersBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions`, but is otherwise the same
         * as [FolderService.listFolderRevisions].
         */
        @MustBeClosed
        fun listFolderRevisions(objectId: String): HttpResponseFor<FolderListFolderRevisionsPage> =
            listFolderRevisions(objectId, FolderListFolderRevisionsParams.none())

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            objectId: String,
            params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderListFolderRevisionsPage> =
            listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            objectId: String,
            params: FolderListFolderRevisionsParams = FolderListFolderRevisionsParams.none(),
        ): HttpResponseFor<FolderListFolderRevisionsPage> =
            listFolderRevisions(objectId, params, RequestOptions.none())

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            params: FolderListFolderRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderListFolderRevisionsPage>

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            params: FolderListFolderRevisionsParams
        ): HttpResponseFor<FolderListFolderRevisionsPage> =
            listFolderRevisions(params, RequestOptions.none())

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderListFolderRevisionsPage> =
            listFolderRevisions(objectId, FolderListFolderRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders`, but is
         * otherwise the same as [FolderService.listFolders].
         */
        @MustBeClosed
        fun listFolders(): HttpResponseFor<FolderListFoldersPage> =
            listFolders(FolderListFoldersParams.none())

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(
            params: FolderListFoldersParams = FolderListFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderListFoldersPage>

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(
            params: FolderListFoldersParams = FolderListFoldersParams.none()
        ): HttpResponseFor<FolderListFoldersPage> = listFolders(params, RequestOptions.none())

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(requestOptions: RequestOptions): HttpResponseFor<FolderListFoldersPage> =
            listFolders(FolderListFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}/restore`, but
         * is otherwise the same as [FolderService.restoreFolderRevision].
         */
        @MustBeClosed
        fun restoreFolderRevision(
            revisionId: String,
            params: FolderRestoreFolderRevisionParams,
        ): HttpResponseFor<ContentFolder> =
            restoreFolderRevision(revisionId, params, RequestOptions.none())

        /** @see restoreFolderRevision */
        @MustBeClosed
        fun restoreFolderRevision(
            revisionId: String,
            params: FolderRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreFolderRevision */
        @MustBeClosed
        fun restoreFolderRevision(
            params: FolderRestoreFolderRevisionParams
        ): HttpResponseFor<ContentFolder> = restoreFolderRevision(params, RequestOptions.none())

        /** @see restoreFolderRevision */
        @MustBeClosed
        fun restoreFolderRevision(
            params: FolderRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /**
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderService.updateFolder].
         */
        @MustBeClosed
        fun updateFolder(
            objectId: String,
            params: FolderUpdateFolderParams,
        ): HttpResponseFor<ContentFolder> = updateFolder(objectId, params, RequestOptions.none())

        /** @see updateFolder */
        @MustBeClosed
        fun updateFolder(
            objectId: String,
            params: FolderUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateFolder */
        @MustBeClosed
        fun updateFolder(params: FolderUpdateFolderParams): HttpResponseFor<ContentFolder> =
            updateFolder(params, RequestOptions.none())

        /** @see updateFolder */
        @MustBeClosed
        fun updateFolder(
            params: FolderUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>
    }
}
