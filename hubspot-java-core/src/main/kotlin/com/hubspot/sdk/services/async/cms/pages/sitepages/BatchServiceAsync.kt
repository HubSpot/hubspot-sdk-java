// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.sitepages

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

    /**
     * Delete a batch of website pages as specified in the request body. Note that this is not the
     * same as the dashboard `archive` function. To perform a dashboard `archive` send an normal
     * update with the `archivedInDashboard` field set to `true`.
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
