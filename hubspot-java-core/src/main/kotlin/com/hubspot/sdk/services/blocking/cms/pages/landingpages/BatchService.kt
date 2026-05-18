// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.google.errorprone.annotations.MustBeClosed
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

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

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
    }
}
