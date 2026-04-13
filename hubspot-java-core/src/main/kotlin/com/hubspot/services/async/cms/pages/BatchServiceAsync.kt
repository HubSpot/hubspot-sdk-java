// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.pages

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.BatchInputString
import com.hubspot.models.cms.BatchInputJsonNode
import com.hubspot.models.cms.pages.BatchInputContentFolder
import com.hubspot.models.cms.pages.BatchInputPage
import com.hubspot.models.cms.pages.BatchResponseContentFolder
import com.hubspot.models.cms.pages.BatchResponsePage
import com.hubspot.models.cms.pages.batch.BatchCreateFoldersParams
import com.hubspot.models.cms.pages.batch.BatchCreateLandingPagesParams
import com.hubspot.models.cms.pages.batch.BatchCreateSitePagesParams
import com.hubspot.models.cms.pages.batch.BatchDeleteFoldersParams
import com.hubspot.models.cms.pages.batch.BatchDeleteLandingPagesParams
import com.hubspot.models.cms.pages.batch.BatchDeleteSitePagesParams
import com.hubspot.models.cms.pages.batch.BatchGetLandingPagesParams
import com.hubspot.models.cms.pages.batch.BatchGetSitePagesParams
import com.hubspot.models.cms.pages.batch.BatchUpdateFoldersParams
import com.hubspot.models.cms.pages.batch.BatchUpdateLandingPagesParams
import com.hubspot.models.cms.pages.batch.BatchUpdateSitePagesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /** Create a batch of folders as detailed in the request body. */
    fun createFolders(
        params: BatchCreateFoldersParams
    ): CompletableFuture<BatchResponseContentFolder> = createFolders(params, RequestOptions.none())

    /** @see createFolders */
    fun createFolders(
        params: BatchCreateFoldersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder>

    /** @see createFolders */
    fun createFolders(
        batchInputContentFolder: BatchInputContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder> =
        createFolders(
            BatchCreateFoldersParams.builder()
                .batchInputContentFolder(batchInputContentFolder)
                .build(),
            requestOptions,
        )

    /** @see createFolders */
    fun createFolders(
        batchInputContentFolder: BatchInputContentFolder
    ): CompletableFuture<BatchResponseContentFolder> =
        createFolders(batchInputContentFolder, RequestOptions.none())

    /** Create a batch of landing pages as detailed in the request body. */
    fun createLandingPages(
        params: BatchCreateLandingPagesParams
    ): CompletableFuture<BatchResponsePage> = createLandingPages(params, RequestOptions.none())

    /** @see createLandingPages */
    fun createLandingPages(
        params: BatchCreateLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see createLandingPages */
    fun createLandingPages(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        createLandingPages(
            BatchCreateLandingPagesParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createLandingPages */
    fun createLandingPages(batchInputPage: BatchInputPage): CompletableFuture<BatchResponsePage> =
        createLandingPages(batchInputPage, RequestOptions.none())

    /** Create a batch of website pages as specified in the request body. */
    fun createSitePages(params: BatchCreateSitePagesParams): CompletableFuture<BatchResponsePage> =
        createSitePages(params, RequestOptions.none())

    /** @see createSitePages */
    fun createSitePages(
        params: BatchCreateSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see createSitePages */
    fun createSitePages(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        createSitePages(
            BatchCreateSitePagesParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createSitePages */
    fun createSitePages(batchInputPage: BatchInputPage): CompletableFuture<BatchResponsePage> =
        createSitePages(batchInputPage, RequestOptions.none())

    /** Delete a batch of folders as specified in the request body. */
    fun deleteFolders(params: BatchDeleteFoldersParams): CompletableFuture<Void?> =
        deleteFolders(params, RequestOptions.none())

    /** @see deleteFolders */
    fun deleteFolders(
        params: BatchDeleteFoldersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteFolders */
    fun deleteFolders(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteFolders(
            BatchDeleteFoldersParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteFolders */
    fun deleteFolders(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteFolders(batchInputString, RequestOptions.none())

    /**
     * Delete landing pages specified by ID in the request body. Note: this is not the same as the
     * dashboard `archive` function. To perform a dashboard `archive` send an normal update with the
     * `archivedInDashboard` field set to `true`.
     */
    fun deleteLandingPages(params: BatchDeleteLandingPagesParams): CompletableFuture<Void?> =
        deleteLandingPages(params, RequestOptions.none())

    /** @see deleteLandingPages */
    fun deleteLandingPages(
        params: BatchDeleteLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteLandingPages */
    fun deleteLandingPages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteLandingPages(
            BatchDeleteLandingPagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteLandingPages */
    fun deleteLandingPages(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteLandingPages(batchInputString, RequestOptions.none())

    /**
     * Delete a batch of website pages as specified in the request body. Note: this is not the same
     * as the dashboard `archive` function. To perform a dashboard `archive` send an normal update
     * with the `archivedInDashboard` field set to `true`.
     */
    fun deleteSitePages(params: BatchDeleteSitePagesParams): CompletableFuture<Void?> =
        deleteSitePages(params, RequestOptions.none())

    /** @see deleteSitePages */
    fun deleteSitePages(
        params: BatchDeleteSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteSitePages */
    fun deleteSitePages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSitePages(
            BatchDeleteSitePagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteSitePages */
    fun deleteSitePages(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteSitePages(batchInputString, RequestOptions.none())

    /** Retrieve a batch of landing pages as specified in the request body. */
    fun getLandingPages(params: BatchGetLandingPagesParams): CompletableFuture<BatchResponsePage> =
        getLandingPages(params, RequestOptions.none())

    /** @see getLandingPages */
    fun getLandingPages(
        params: BatchGetLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see getLandingPages */
    fun getLandingPages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        getLandingPages(
            BatchGetLandingPagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getLandingPages */
    fun getLandingPages(batchInputString: BatchInputString): CompletableFuture<BatchResponsePage> =
        getLandingPages(batchInputString, RequestOptions.none())

    /** Retrieve a batch of website pages as specified in the request body. */
    fun getSitePages(params: BatchGetSitePagesParams): CompletableFuture<BatchResponsePage> =
        getSitePages(params, RequestOptions.none())

    /** @see getSitePages */
    fun getSitePages(
        params: BatchGetSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see getSitePages */
    fun getSitePages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        getSitePages(
            BatchGetSitePagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getSitePages */
    fun getSitePages(batchInputString: BatchInputString): CompletableFuture<BatchResponsePage> =
        getSitePages(batchInputString, RequestOptions.none())

    /** Update a batch of landing page folders as specified in the request body. */
    fun updateFolders(
        params: BatchUpdateFoldersParams
    ): CompletableFuture<BatchResponseContentFolder> = updateFolders(params, RequestOptions.none())

    /** @see updateFolders */
    fun updateFolders(
        params: BatchUpdateFoldersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder>

    /** @see updateFolders */
    fun updateFolders(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder> =
        updateFolders(
            BatchUpdateFoldersParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateFolders */
    fun updateFolders(
        batchInputJsonNode: BatchInputJsonNode
    ): CompletableFuture<BatchResponseContentFolder> =
        updateFolders(batchInputJsonNode, RequestOptions.none())

    /** Update a batch of landing pages as specified in the request body. */
    fun updateLandingPages(
        params: BatchUpdateLandingPagesParams
    ): CompletableFuture<BatchResponsePage> = updateLandingPages(params, RequestOptions.none())

    /** @see updateLandingPages */
    fun updateLandingPages(
        params: BatchUpdateLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see updateLandingPages */
    fun updateLandingPages(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        updateLandingPages(
            BatchUpdateLandingPagesParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateLandingPages */
    fun updateLandingPages(
        batchInputJsonNode: BatchInputJsonNode
    ): CompletableFuture<BatchResponsePage> =
        updateLandingPages(batchInputJsonNode, RequestOptions.none())

    /** Update a batch of website pages as specified in the request body. */
    fun updateSitePages(params: BatchUpdateSitePagesParams): CompletableFuture<BatchResponsePage> =
        updateSitePages(params, RequestOptions.none())

    /** @see updateSitePages */
    fun updateSitePages(
        params: BatchUpdateSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see updateSitePages */
    fun updateSitePages(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        updateSitePages(
            BatchUpdateSitePagesParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateSitePages */
    fun updateSitePages(
        batchInputJsonNode: BatchInputJsonNode
    ): CompletableFuture<BatchResponsePage> =
        updateSitePages(batchInputJsonNode, RequestOptions.none())

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/create`, but is otherwise the same as
         * [BatchServiceAsync.createFolders].
         */
        fun createFolders(
            params: BatchCreateFoldersParams
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            createFolders(params, RequestOptions.none())

        /** @see createFolders */
        fun createFolders(
            params: BatchCreateFoldersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>>

        /** @see createFolders */
        fun createFolders(
            batchInputContentFolder: BatchInputContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            createFolders(
                BatchCreateFoldersParams.builder()
                    .batchInputContentFolder(batchInputContentFolder)
                    .build(),
                requestOptions,
            )

        /** @see createFolders */
        fun createFolders(
            batchInputContentFolder: BatchInputContentFolder
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            createFolders(batchInputContentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/create`, but
         * is otherwise the same as [BatchServiceAsync.createLandingPages].
         */
        fun createLandingPages(
            params: BatchCreateLandingPagesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createLandingPages(params, RequestOptions.none())

        /** @see createLandingPages */
        fun createLandingPages(
            params: BatchCreateLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see createLandingPages */
        fun createLandingPages(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createLandingPages(
                BatchCreateLandingPagesParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createLandingPages */
        fun createLandingPages(
            batchInputPage: BatchInputPage
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createLandingPages(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/create`, but is
         * otherwise the same as [BatchServiceAsync.createSitePages].
         */
        fun createSitePages(
            params: BatchCreateSitePagesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createSitePages(params, RequestOptions.none())

        /** @see createSitePages */
        fun createSitePages(
            params: BatchCreateSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see createSitePages */
        fun createSitePages(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createSitePages(
                BatchCreateSitePagesParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createSitePages */
        fun createSitePages(
            batchInputPage: BatchInputPage
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createSitePages(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/archive`, but is otherwise the same as
         * [BatchServiceAsync.deleteFolders].
         */
        fun deleteFolders(params: BatchDeleteFoldersParams): CompletableFuture<HttpResponse> =
            deleteFolders(params, RequestOptions.none())

        /** @see deleteFolders */
        fun deleteFolders(
            params: BatchDeleteFoldersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteFolders */
        fun deleteFolders(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteFolders(
                BatchDeleteFoldersParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteFolders */
        fun deleteFolders(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            deleteFolders(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/archive`,
         * but is otherwise the same as [BatchServiceAsync.deleteLandingPages].
         */
        fun deleteLandingPages(
            params: BatchDeleteLandingPagesParams
        ): CompletableFuture<HttpResponse> = deleteLandingPages(params, RequestOptions.none())

        /** @see deleteLandingPages */
        fun deleteLandingPages(
            params: BatchDeleteLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteLandingPages */
        fun deleteLandingPages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteLandingPages(
                BatchDeleteLandingPagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteLandingPages */
        fun deleteLandingPages(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponse> =
            deleteLandingPages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/archive`, but
         * is otherwise the same as [BatchServiceAsync.deleteSitePages].
         */
        fun deleteSitePages(params: BatchDeleteSitePagesParams): CompletableFuture<HttpResponse> =
            deleteSitePages(params, RequestOptions.none())

        /** @see deleteSitePages */
        fun deleteSitePages(
            params: BatchDeleteSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteSitePages */
        fun deleteSitePages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSitePages(
                BatchDeleteSitePagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteSitePages */
        fun deleteSitePages(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            deleteSitePages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/read`, but
         * is otherwise the same as [BatchServiceAsync.getLandingPages].
         */
        fun getLandingPages(
            params: BatchGetLandingPagesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getLandingPages(params, RequestOptions.none())

        /** @see getLandingPages */
        fun getLandingPages(
            params: BatchGetLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see getLandingPages */
        fun getLandingPages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getLandingPages(
                BatchGetLandingPagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getLandingPages */
        fun getLandingPages(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getLandingPages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.getSitePages].
         */
        fun getSitePages(
            params: BatchGetSitePagesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getSitePages(params, RequestOptions.none())

        /** @see getSitePages */
        fun getSitePages(
            params: BatchGetSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see getSitePages */
        fun getSitePages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getSitePages(
                BatchGetSitePagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getSitePages */
        fun getSitePages(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getSitePages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/update`, but is otherwise the same as
         * [BatchServiceAsync.updateFolders].
         */
        fun updateFolders(
            params: BatchUpdateFoldersParams
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            updateFolders(params, RequestOptions.none())

        /** @see updateFolders */
        fun updateFolders(
            params: BatchUpdateFoldersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>>

        /** @see updateFolders */
        fun updateFolders(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            updateFolders(
                BatchUpdateFoldersParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateFolders */
        fun updateFolders(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            updateFolders(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/update`, but
         * is otherwise the same as [BatchServiceAsync.updateLandingPages].
         */
        fun updateLandingPages(
            params: BatchUpdateLandingPagesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateLandingPages(params, RequestOptions.none())

        /** @see updateLandingPages */
        fun updateLandingPages(
            params: BatchUpdateLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see updateLandingPages */
        fun updateLandingPages(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateLandingPages(
                BatchUpdateLandingPagesParams.builder()
                    .batchInputJsonNode(batchInputJsonNode)
                    .build(),
                requestOptions,
            )

        /** @see updateLandingPages */
        fun updateLandingPages(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateLandingPages(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/update`, but is
         * otherwise the same as [BatchServiceAsync.updateSitePages].
         */
        fun updateSitePages(
            params: BatchUpdateSitePagesParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateSitePages(params, RequestOptions.none())

        /** @see updateSitePages */
        fun updateSitePages(
            params: BatchUpdateSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see updateSitePages */
        fun updateSitePages(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateSitePages(
                BatchUpdateSitePagesParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateSitePages */
        fun updateSitePages(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateSitePages(batchInputJsonNode, RequestOptions.none())
    }
}
