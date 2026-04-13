// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Create a batch of folders as detailed in the request body. */
    fun createFolders(params: BatchCreateFoldersParams): BatchResponseContentFolder =
        createFolders(params, RequestOptions.none())

    /** @see createFolders */
    fun createFolders(
        params: BatchCreateFoldersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder

    /** @see createFolders */
    fun createFolders(
        batchInputContentFolder: BatchInputContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder =
        createFolders(
            BatchCreateFoldersParams.builder()
                .batchInputContentFolder(batchInputContentFolder)
                .build(),
            requestOptions,
        )

    /** @see createFolders */
    fun createFolders(
        batchInputContentFolder: BatchInputContentFolder
    ): BatchResponseContentFolder = createFolders(batchInputContentFolder, RequestOptions.none())

    /** Create a batch of landing pages as detailed in the request body. */
    fun createLandingPages(params: BatchCreateLandingPagesParams): BatchResponsePage =
        createLandingPages(params, RequestOptions.none())

    /** @see createLandingPages */
    fun createLandingPages(
        params: BatchCreateLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see createLandingPages */
    fun createLandingPages(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        createLandingPages(
            BatchCreateLandingPagesParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createLandingPages */
    fun createLandingPages(batchInputPage: BatchInputPage): BatchResponsePage =
        createLandingPages(batchInputPage, RequestOptions.none())

    /** Create a batch of website pages as specified in the request body. */
    fun createSitePages(params: BatchCreateSitePagesParams): BatchResponsePage =
        createSitePages(params, RequestOptions.none())

    /** @see createSitePages */
    fun createSitePages(
        params: BatchCreateSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see createSitePages */
    fun createSitePages(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        createSitePages(
            BatchCreateSitePagesParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createSitePages */
    fun createSitePages(batchInputPage: BatchInputPage): BatchResponsePage =
        createSitePages(batchInputPage, RequestOptions.none())

    /** Delete a batch of folders as specified in the request body. */
    fun deleteFolders(params: BatchDeleteFoldersParams) =
        deleteFolders(params, RequestOptions.none())

    /** @see deleteFolders */
    fun deleteFolders(
        params: BatchDeleteFoldersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteFolders */
    fun deleteFolders(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteFolders(
            BatchDeleteFoldersParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteFolders */
    fun deleteFolders(batchInputString: BatchInputString) =
        deleteFolders(batchInputString, RequestOptions.none())

    /**
     * Delete landing pages specified by ID in the request body. Note: this is not the same as the
     * dashboard `archive` function. To perform a dashboard `archive` send an normal update with the
     * `archivedInDashboard` field set to `true`.
     */
    fun deleteLandingPages(params: BatchDeleteLandingPagesParams) =
        deleteLandingPages(params, RequestOptions.none())

    /** @see deleteLandingPages */
    fun deleteLandingPages(
        params: BatchDeleteLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteLandingPages */
    fun deleteLandingPages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteLandingPages(
            BatchDeleteLandingPagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteLandingPages */
    fun deleteLandingPages(batchInputString: BatchInputString) =
        deleteLandingPages(batchInputString, RequestOptions.none())

    /**
     * Delete a batch of website pages as specified in the request body. Note: this is not the same
     * as the dashboard `archive` function. To perform a dashboard `archive` send an normal update
     * with the `archivedInDashboard` field set to `true`.
     */
    fun deleteSitePages(params: BatchDeleteSitePagesParams) =
        deleteSitePages(params, RequestOptions.none())

    /** @see deleteSitePages */
    fun deleteSitePages(
        params: BatchDeleteSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteSitePages */
    fun deleteSitePages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteSitePages(
            BatchDeleteSitePagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteSitePages */
    fun deleteSitePages(batchInputString: BatchInputString) =
        deleteSitePages(batchInputString, RequestOptions.none())

    /** Retrieve a batch of landing pages as specified in the request body. */
    fun getLandingPages(params: BatchGetLandingPagesParams): BatchResponsePage =
        getLandingPages(params, RequestOptions.none())

    /** @see getLandingPages */
    fun getLandingPages(
        params: BatchGetLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see getLandingPages */
    fun getLandingPages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        getLandingPages(
            BatchGetLandingPagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getLandingPages */
    fun getLandingPages(batchInputString: BatchInputString): BatchResponsePage =
        getLandingPages(batchInputString, RequestOptions.none())

    /** Retrieve a batch of website pages as specified in the request body. */
    fun getSitePages(params: BatchGetSitePagesParams): BatchResponsePage =
        getSitePages(params, RequestOptions.none())

    /** @see getSitePages */
    fun getSitePages(
        params: BatchGetSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see getSitePages */
    fun getSitePages(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        getSitePages(
            BatchGetSitePagesParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getSitePages */
    fun getSitePages(batchInputString: BatchInputString): BatchResponsePage =
        getSitePages(batchInputString, RequestOptions.none())

    /** Update a batch of landing page folders as specified in the request body. */
    fun updateFolders(params: BatchUpdateFoldersParams): BatchResponseContentFolder =
        updateFolders(params, RequestOptions.none())

    /** @see updateFolders */
    fun updateFolders(
        params: BatchUpdateFoldersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder

    /** @see updateFolders */
    fun updateFolders(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder =
        updateFolders(
            BatchUpdateFoldersParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateFolders */
    fun updateFolders(batchInputJsonNode: BatchInputJsonNode): BatchResponseContentFolder =
        updateFolders(batchInputJsonNode, RequestOptions.none())

    /** Update a batch of landing pages as specified in the request body. */
    fun updateLandingPages(params: BatchUpdateLandingPagesParams): BatchResponsePage =
        updateLandingPages(params, RequestOptions.none())

    /** @see updateLandingPages */
    fun updateLandingPages(
        params: BatchUpdateLandingPagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see updateLandingPages */
    fun updateLandingPages(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        updateLandingPages(
            BatchUpdateLandingPagesParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateLandingPages */
    fun updateLandingPages(batchInputJsonNode: BatchInputJsonNode): BatchResponsePage =
        updateLandingPages(batchInputJsonNode, RequestOptions.none())

    /** Update a batch of website pages as specified in the request body. */
    fun updateSitePages(params: BatchUpdateSitePagesParams): BatchResponsePage =
        updateSitePages(params, RequestOptions.none())

    /** @see updateSitePages */
    fun updateSitePages(
        params: BatchUpdateSitePagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see updateSitePages */
    fun updateSitePages(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        updateSitePages(
            BatchUpdateSitePagesParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateSitePages */
    fun updateSitePages(batchInputJsonNode: BatchInputJsonNode): BatchResponsePage =
        updateSitePages(batchInputJsonNode, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/create`, but is otherwise the same as
         * [BatchService.createFolders].
         */
        @MustBeClosed
        fun createFolders(
            params: BatchCreateFoldersParams
        ): HttpResponseFor<BatchResponseContentFolder> =
            createFolders(params, RequestOptions.none())

        /** @see createFolders */
        @MustBeClosed
        fun createFolders(
            params: BatchCreateFoldersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder>

        /** @see createFolders */
        @MustBeClosed
        fun createFolders(
            batchInputContentFolder: BatchInputContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder> =
            createFolders(
                BatchCreateFoldersParams.builder()
                    .batchInputContentFolder(batchInputContentFolder)
                    .build(),
                requestOptions,
            )

        /** @see createFolders */
        @MustBeClosed
        fun createFolders(
            batchInputContentFolder: BatchInputContentFolder
        ): HttpResponseFor<BatchResponseContentFolder> =
            createFolders(batchInputContentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/create`, but
         * is otherwise the same as [BatchService.createLandingPages].
         */
        @MustBeClosed
        fun createLandingPages(
            params: BatchCreateLandingPagesParams
        ): HttpResponseFor<BatchResponsePage> = createLandingPages(params, RequestOptions.none())

        /** @see createLandingPages */
        @MustBeClosed
        fun createLandingPages(
            params: BatchCreateLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see createLandingPages */
        @MustBeClosed
        fun createLandingPages(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            createLandingPages(
                BatchCreateLandingPagesParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createLandingPages */
        @MustBeClosed
        fun createLandingPages(batchInputPage: BatchInputPage): HttpResponseFor<BatchResponsePage> =
            createLandingPages(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/create`, but is
         * otherwise the same as [BatchService.createSitePages].
         */
        @MustBeClosed
        fun createSitePages(
            params: BatchCreateSitePagesParams
        ): HttpResponseFor<BatchResponsePage> = createSitePages(params, RequestOptions.none())

        /** @see createSitePages */
        @MustBeClosed
        fun createSitePages(
            params: BatchCreateSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see createSitePages */
        @MustBeClosed
        fun createSitePages(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            createSitePages(
                BatchCreateSitePagesParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createSitePages */
        @MustBeClosed
        fun createSitePages(batchInputPage: BatchInputPage): HttpResponseFor<BatchResponsePage> =
            createSitePages(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/archive`, but is otherwise the same as
         * [BatchService.deleteFolders].
         */
        @MustBeClosed
        fun deleteFolders(params: BatchDeleteFoldersParams): HttpResponse =
            deleteFolders(params, RequestOptions.none())

        /** @see deleteFolders */
        @MustBeClosed
        fun deleteFolders(
            params: BatchDeleteFoldersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteFolders */
        @MustBeClosed
        fun deleteFolders(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteFolders(
                BatchDeleteFoldersParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteFolders */
        @MustBeClosed
        fun deleteFolders(batchInputString: BatchInputString): HttpResponse =
            deleteFolders(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/archive`,
         * but is otherwise the same as [BatchService.deleteLandingPages].
         */
        @MustBeClosed
        fun deleteLandingPages(params: BatchDeleteLandingPagesParams): HttpResponse =
            deleteLandingPages(params, RequestOptions.none())

        /** @see deleteLandingPages */
        @MustBeClosed
        fun deleteLandingPages(
            params: BatchDeleteLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteLandingPages */
        @MustBeClosed
        fun deleteLandingPages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteLandingPages(
                BatchDeleteLandingPagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteLandingPages */
        @MustBeClosed
        fun deleteLandingPages(batchInputString: BatchInputString): HttpResponse =
            deleteLandingPages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/archive`, but
         * is otherwise the same as [BatchService.deleteSitePages].
         */
        @MustBeClosed
        fun deleteSitePages(params: BatchDeleteSitePagesParams): HttpResponse =
            deleteSitePages(params, RequestOptions.none())

        /** @see deleteSitePages */
        @MustBeClosed
        fun deleteSitePages(
            params: BatchDeleteSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteSitePages */
        @MustBeClosed
        fun deleteSitePages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteSitePages(
                BatchDeleteSitePagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteSitePages */
        @MustBeClosed
        fun deleteSitePages(batchInputString: BatchInputString): HttpResponse =
            deleteSitePages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/read`, but
         * is otherwise the same as [BatchService.getLandingPages].
         */
        @MustBeClosed
        fun getLandingPages(
            params: BatchGetLandingPagesParams
        ): HttpResponseFor<BatchResponsePage> = getLandingPages(params, RequestOptions.none())

        /** @see getLandingPages */
        @MustBeClosed
        fun getLandingPages(
            params: BatchGetLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see getLandingPages */
        @MustBeClosed
        fun getLandingPages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            getLandingPages(
                BatchGetLandingPagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getLandingPages */
        @MustBeClosed
        fun getLandingPages(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponsePage> =
            getLandingPages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/read`, but is
         * otherwise the same as [BatchService.getSitePages].
         */
        @MustBeClosed
        fun getSitePages(params: BatchGetSitePagesParams): HttpResponseFor<BatchResponsePage> =
            getSitePages(params, RequestOptions.none())

        /** @see getSitePages */
        @MustBeClosed
        fun getSitePages(
            params: BatchGetSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see getSitePages */
        @MustBeClosed
        fun getSitePages(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            getSitePages(
                BatchGetSitePagesParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getSitePages */
        @MustBeClosed
        fun getSitePages(batchInputString: BatchInputString): HttpResponseFor<BatchResponsePage> =
            getSitePages(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/folders/batch/update`, but is otherwise the same as
         * [BatchService.updateFolders].
         */
        @MustBeClosed
        fun updateFolders(
            params: BatchUpdateFoldersParams
        ): HttpResponseFor<BatchResponseContentFolder> =
            updateFolders(params, RequestOptions.none())

        /** @see updateFolders */
        @MustBeClosed
        fun updateFolders(
            params: BatchUpdateFoldersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder>

        /** @see updateFolders */
        @MustBeClosed
        fun updateFolders(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder> =
            updateFolders(
                BatchUpdateFoldersParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateFolders */
        @MustBeClosed
        fun updateFolders(
            batchInputJsonNode: BatchInputJsonNode
        ): HttpResponseFor<BatchResponseContentFolder> =
            updateFolders(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/batch/update`, but
         * is otherwise the same as [BatchService.updateLandingPages].
         */
        @MustBeClosed
        fun updateLandingPages(
            params: BatchUpdateLandingPagesParams
        ): HttpResponseFor<BatchResponsePage> = updateLandingPages(params, RequestOptions.none())

        /** @see updateLandingPages */
        @MustBeClosed
        fun updateLandingPages(
            params: BatchUpdateLandingPagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see updateLandingPages */
        @MustBeClosed
        fun updateLandingPages(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            updateLandingPages(
                BatchUpdateLandingPagesParams.builder()
                    .batchInputJsonNode(batchInputJsonNode)
                    .build(),
                requestOptions,
            )

        /** @see updateLandingPages */
        @MustBeClosed
        fun updateLandingPages(
            batchInputJsonNode: BatchInputJsonNode
        ): HttpResponseFor<BatchResponsePage> =
            updateLandingPages(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/batch/update`, but is
         * otherwise the same as [BatchService.updateSitePages].
         */
        @MustBeClosed
        fun updateSitePages(
            params: BatchUpdateSitePagesParams
        ): HttpResponseFor<BatchResponsePage> = updateSitePages(params, RequestOptions.none())

        /** @see updateSitePages */
        @MustBeClosed
        fun updateSitePages(
            params: BatchUpdateSitePagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see updateSitePages */
        @MustBeClosed
        fun updateSitePages(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            updateSitePages(
                BatchUpdateSitePagesParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateSitePages */
        @MustBeClosed
        fun updateSitePages(
            batchInputJsonNode: BatchInputJsonNode
        ): HttpResponseFor<BatchResponsePage> =
            updateSitePages(batchInputJsonNode, RequestOptions.none())
    }
}
