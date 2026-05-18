// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.landingpages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.cms.BatchInputJsonNode
import com.hubspot.sdk.models.cms.pages.BatchInputPage
import com.hubspot.sdk.models.cms.pages.BatchResponsePage
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchCreateLandingPagesParams
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchDeleteLandingPagesParams
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchGetLandingPagesParams
import com.hubspot.sdk.models.cms.pages.landingpages.batch.BatchUpdateLandingPagesParams
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
    }
}
