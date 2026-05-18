// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.sitepages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.cms.BatchInputJsonNode
import com.hubspot.sdk.models.cms.pages.BatchInputPage
import com.hubspot.sdk.models.cms.pages.BatchResponsePage
import com.hubspot.sdk.models.cms.pages.sitepages.batch.BatchCreateSitePagesParams
import com.hubspot.sdk.models.cms.pages.sitepages.batch.BatchDeleteSitePagesParams
import com.hubspot.sdk.models.cms.pages.sitepages.batch.BatchGetSitePagesParams
import com.hubspot.sdk.models.cms.pages.sitepages.batch.BatchUpdateSitePagesParams
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

    /**
     * Delete a batch of website pages as specified in the request body. Note that this is not the
     * same as the dashboard `archive` function. To perform a dashboard `archive` send an normal
     * update with the `archivedInDashboard` field set to `true`.
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
