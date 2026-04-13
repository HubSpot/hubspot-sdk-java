// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.BatchInputString
import com.hubspot.models.cms.pages.BatchResponseContentFolder
import com.hubspot.models.cms.pages.ContentFolder
import com.hubspot.models.cms.pages.ContentFolderVersion
import com.hubspot.models.cms.pages.folders.FolderBatchGetParams
import com.hubspot.models.cms.pages.folders.FolderCreateParams
import com.hubspot.models.cms.pages.folders.FolderDeleteParams
import com.hubspot.models.cms.pages.folders.FolderGetParams
import com.hubspot.models.cms.pages.folders.FolderGetRevisionParams
import com.hubspot.models.cms.pages.folders.FolderListPage
import com.hubspot.models.cms.pages.folders.FolderListParams
import com.hubspot.models.cms.pages.folders.FolderListRevisionsPage
import com.hubspot.models.cms.pages.folders.FolderListRevisionsParams
import com.hubspot.models.cms.pages.folders.FolderRestoreRevisionParams
import com.hubspot.models.cms.pages.folders.FolderUpdateParams
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
    fun create(params: FolderCreateParams): ContentFolder = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** @see create */
    fun create(
        contentFolder: ContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder =
        create(FolderCreateParams.builder().contentFolder(contentFolder).build(), requestOptions)

    /** @see create */
    fun create(contentFolder: ContentFolder): ContentFolder =
        create(contentFolder, RequestOptions.none())

    /**
     * Partially update a landing page folder, specified by the folder ID. You only need to specify
     * the details values that you are modifying.
     */
    fun update(objectId: String, params: FolderUpdateParams): ContentFolder =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: FolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: FolderUpdateParams): ContentFolder = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /**
     * Get the list of Landing Page Folders. Supports paging and filtering. This method would be
     * useful for an integration that examined these models and used an external service to suggest
     * edits.
     */
    fun list(): FolderListPage = list(FolderListParams.none())

    /** @see list */
    fun list(
        params: FolderListParams = FolderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderListPage

    /** @see list */
    fun list(params: FolderListParams = FolderListParams.none()): FolderListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FolderListPage =
        list(FolderListParams.none(), requestOptions)

    /** Delete a landing page folder, specified by its ID. */
    fun delete(objectId: String) = delete(objectId, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: FolderDeleteParams = FolderDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FolderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FolderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, FolderDeleteParams.none(), requestOptions)

    /** Retrieve a batch of landing page folders as identified in the request body. */
    fun batchGet(params: FolderBatchGetParams): BatchResponseContentFolder =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: FolderBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder

    /** @see batchGet */
    fun batchGet(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder =
        batchGet(
            FolderBatchGetParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(batchInputString: BatchInputString): BatchResponseContentFolder =
        batchGet(batchInputString, RequestOptions.none())

    /** Retrieve a landing page folder, specified by its ID. */
    fun get(objectId: String): ContentFolder = get(objectId, FolderGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: FolderGetParams = FolderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: FolderGetParams = FolderGetParams.none()): ContentFolder =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FolderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** @see get */
    fun get(params: FolderGetParams): ContentFolder = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): ContentFolder =
        get(objectId, FolderGetParams.none(), requestOptions)

    /** Retrieve a previous version of a folder, specified by the folder ID and revision ID. */
    fun getRevision(revisionId: String, params: FolderGetRevisionParams): ContentFolderVersion =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: FolderGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolderVersion =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: FolderGetRevisionParams): ContentFolderVersion =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: FolderGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolderVersion

    /** Retrieves all the previous versions of a landing page folder. */
    fun listRevisions(objectId: String): FolderListRevisionsPage =
        listRevisions(objectId, FolderListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderListRevisionsPage =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
    ): FolderListRevisionsPage = listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: FolderListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderListRevisionsPage

    /** @see listRevisions */
    fun listRevisions(params: FolderListRevisionsParams): FolderListRevisionsPage =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(objectId: String, requestOptions: RequestOptions): FolderListRevisionsPage =
        listRevisions(objectId, FolderListRevisionsParams.none(), requestOptions)

    /** Takes a specified version of a landing page folder and restores it. */
    fun restoreRevision(revisionId: String, params: FolderRestoreRevisionParams): ContentFolder =
        restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: FolderRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder =
        restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: FolderRestoreRevisionParams): ContentFolder =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: FolderRestoreRevisionParams,
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
         * otherwise the same as [FolderService.create].
         */
        @MustBeClosed
        fun create(params: FolderCreateParams): HttpResponseFor<ContentFolder> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /** @see create */
        @MustBeClosed
        fun create(
            contentFolder: ContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            create(
                FolderCreateParams.builder().contentFolder(contentFolder).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(contentFolder: ContentFolder): HttpResponseFor<ContentFolder> =
            create(contentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: FolderUpdateParams): HttpResponseFor<ContentFolder> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: FolderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FolderUpdateParams): HttpResponseFor<ContentFolder> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FolderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders`, but is
         * otherwise the same as [FolderService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FolderListPage> = list(FolderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FolderListParams = FolderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FolderListParams = FolderListParams.none()
        ): HttpResponseFor<FolderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FolderListPage> =
            list(FolderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, FolderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FolderDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/read`, but is otherwise the same as
         * [FolderService.batchGet].
         */
        @MustBeClosed
        fun batchGet(params: FolderBatchGetParams): HttpResponseFor<BatchResponseContentFolder> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            params: FolderBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder>

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder> =
            batchGet(
                FolderBatchGetParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseContentFolder> =
            batchGet(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<ContentFolder> =
            get(objectId, FolderGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: FolderGetParams = FolderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: FolderGetParams = FolderGetParams.none(),
        ): HttpResponseFor<ContentFolder> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FolderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /** @see get */
        @MustBeClosed
        fun get(params: FolderGetParams): HttpResponseFor<ContentFolder> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<ContentFolder> =
            get(objectId, FolderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}`, but is
         * otherwise the same as [FolderService.getRevision].
         */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: FolderGetRevisionParams,
        ): HttpResponseFor<ContentFolderVersion> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: FolderGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolderVersion> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(params: FolderGetRevisionParams): HttpResponseFor<ContentFolderVersion> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            params: FolderGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolderVersion>

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions`, but is otherwise the same
         * as [FolderService.listRevisions].
         */
        @MustBeClosed
        fun listRevisions(objectId: String): HttpResponseFor<FolderListRevisionsPage> =
            listRevisions(objectId, FolderListRevisionsParams.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderListRevisionsPage> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
        ): HttpResponseFor<FolderListRevisionsPage> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: FolderListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderListRevisionsPage>

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: FolderListRevisionsParams
        ): HttpResponseFor<FolderListRevisionsPage> = listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderListRevisionsPage> =
            listRevisions(objectId, FolderListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}/restore`, but
         * is otherwise the same as [FolderService.restoreRevision].
         */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: FolderRestoreRevisionParams,
        ): HttpResponseFor<ContentFolder> =
            restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: FolderRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(params: FolderRestoreRevisionParams): HttpResponseFor<ContentFolder> =
            restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            params: FolderRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>
    }
}
