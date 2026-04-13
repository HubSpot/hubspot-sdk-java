// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.pages

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
import com.hubspot.models.cms.pages.folders.FolderListPageAsync
import com.hubspot.models.cms.pages.folders.FolderListParams
import com.hubspot.models.cms.pages.folders.FolderListRevisionsPageAsync
import com.hubspot.models.cms.pages.folders.FolderListRevisionsParams
import com.hubspot.models.cms.pages.folders.FolderRestoreRevisionParams
import com.hubspot.models.cms.pages.folders.FolderUpdateParams
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
    fun create(params: FolderCreateParams): CompletableFuture<ContentFolder> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** @see create */
    fun create(
        contentFolder: ContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        create(FolderCreateParams.builder().contentFolder(contentFolder).build(), requestOptions)

    /** @see create */
    fun create(contentFolder: ContentFolder): CompletableFuture<ContentFolder> =
        create(contentFolder, RequestOptions.none())

    /**
     * Partially update a landing page folder, specified by the folder ID. You only need to specify
     * the details values that you are modifying.
     */
    fun update(objectId: String, params: FolderUpdateParams): CompletableFuture<ContentFolder> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: FolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: FolderUpdateParams): CompletableFuture<ContentFolder> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FolderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /**
     * Get the list of Landing Page Folders. Supports paging and filtering. This method would be
     * useful for an integration that examined these models and used an external service to suggest
     * edits.
     */
    fun list(): CompletableFuture<FolderListPageAsync> = list(FolderListParams.none())

    /** @see list */
    fun list(
        params: FolderListParams = FolderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderListPageAsync>

    /** @see list */
    fun list(
        params: FolderListParams = FolderListParams.none()
    ): CompletableFuture<FolderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FolderListPageAsync> =
        list(FolderListParams.none(), requestOptions)

    /** Delete a landing page folder, specified by its ID. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FolderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FolderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, FolderDeleteParams.none(), requestOptions)

    /** Retrieve a batch of landing page folders as identified in the request body. */
    fun batchGet(params: FolderBatchGetParams): CompletableFuture<BatchResponseContentFolder> =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: FolderBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder>

    /** @see batchGet */
    fun batchGet(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder> =
        batchGet(
            FolderBatchGetParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseContentFolder> =
        batchGet(batchInputString, RequestOptions.none())

    /** Retrieve a landing page folder, specified by its ID. */
    fun get(objectId: String): CompletableFuture<ContentFolder> =
        get(objectId, FolderGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: FolderGetParams = FolderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: FolderGetParams = FolderGetParams.none(),
    ): CompletableFuture<ContentFolder> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FolderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** @see get */
    fun get(params: FolderGetParams): CompletableFuture<ContentFolder> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<ContentFolder> =
        get(objectId, FolderGetParams.none(), requestOptions)

    /** Retrieve a previous version of a folder, specified by the folder ID and revision ID. */
    fun getRevision(
        revisionId: String,
        params: FolderGetRevisionParams,
    ): CompletableFuture<ContentFolderVersion> =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: FolderGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolderVersion> =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: FolderGetRevisionParams): CompletableFuture<ContentFolderVersion> =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: FolderGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolderVersion>

    /** Retrieves all the previous versions of a landing page folder. */
    fun listRevisions(objectId: String): CompletableFuture<FolderListRevisionsPageAsync> =
        listRevisions(objectId, FolderListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderListRevisionsPageAsync> =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
    ): CompletableFuture<FolderListRevisionsPageAsync> =
        listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: FolderListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderListRevisionsPageAsync>

    /** @see listRevisions */
    fun listRevisions(
        params: FolderListRevisionsParams
    ): CompletableFuture<FolderListRevisionsPageAsync> =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderListRevisionsPageAsync> =
        listRevisions(objectId, FolderListRevisionsParams.none(), requestOptions)

    /** Takes a specified version of a landing page folder and restores it. */
    fun restoreRevision(
        revisionId: String,
        params: FolderRestoreRevisionParams,
    ): CompletableFuture<ContentFolder> = restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: FolderRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: FolderRestoreRevisionParams): CompletableFuture<ContentFolder> =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: FolderRestoreRevisionParams,
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
         * otherwise the same as [FolderServiceAsync.create].
         */
        fun create(params: FolderCreateParams): CompletableFuture<HttpResponseFor<ContentFolder>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /** @see create */
        fun create(
            contentFolder: ContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            create(
                FolderCreateParams.builder().contentFolder(contentFolder).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            contentFolder: ContentFolder
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            create(contentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: FolderUpdateParams,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: FolderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: FolderUpdateParams): CompletableFuture<HttpResponseFor<ContentFolder>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FolderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders`, but is
         * otherwise the same as [FolderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FolderListPageAsync>> =
            list(FolderListParams.none())

        /** @see list */
        fun list(
            params: FolderListParams = FolderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderListPageAsync>>

        /** @see list */
        fun list(
            params: FolderListParams = FolderListParams.none()
        ): CompletableFuture<HttpResponseFor<FolderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FolderListPageAsync>> =
            list(FolderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, FolderDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FolderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/read`, but is otherwise the same as
         * [FolderServiceAsync.batchGet].
         */
        fun batchGet(
            params: FolderBatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        fun batchGet(
            params: FolderBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>>

        /** @see batchGet */
        fun batchGet(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            batchGet(
                FolderBatchGetParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see batchGet */
        fun batchGet(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            batchGet(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}`, but is otherwise the same as
         * [FolderServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<ContentFolder>> =
            get(objectId, FolderGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: FolderGetParams = FolderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: FolderGetParams = FolderGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FolderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /** @see get */
        fun get(params: FolderGetParams): CompletableFuture<HttpResponseFor<ContentFolder>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            get(objectId, FolderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}`, but is
         * otherwise the same as [FolderServiceAsync.getRevision].
         */
        fun getRevision(
            revisionId: String,
            params: FolderGetRevisionParams,
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            revisionId: String,
            params: FolderGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        fun getRevision(
            params: FolderGetRevisionParams
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            params: FolderGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>>

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions`, but is otherwise the same
         * as [FolderServiceAsync.listRevisions].
         */
        fun listRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<FolderListRevisionsPageAsync>> =
            listRevisions(objectId, FolderListRevisionsParams.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderListRevisionsPageAsync>> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: FolderListRevisionsParams = FolderListRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<FolderListRevisionsPageAsync>> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            params: FolderListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderListRevisionsPageAsync>>

        /** @see listRevisions */
        fun listRevisions(
            params: FolderListRevisionsParams
        ): CompletableFuture<HttpResponseFor<FolderListRevisionsPageAsync>> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderListRevisionsPageAsync>> =
            listRevisions(objectId, FolderListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}/restore`, but
         * is otherwise the same as [FolderServiceAsync.restoreRevision].
         */
        fun restoreRevision(
            revisionId: String,
            params: FolderRestoreRevisionParams,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            revisionId: String,
            params: FolderRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        fun restoreRevision(
            params: FolderRestoreRevisionParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            params: FolderRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>
    }
}
