// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs.tags

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.blogs.tags.BatchInputTag
import com.hubspot_sdk.api.models.cms.blogs.tags.batch.BatchCreateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.tags.batch.BatchGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.batch.BatchUpdateBatchParams
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

    /** Delete the Blog Tag objects identified in the request body. */
    fun delete(params: BatchDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BatchDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            BatchDeleteParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(batchInputString: BatchInputString) = delete(batchInputString, RequestOptions.none())

    /** Create the Blog Tag objects detailed in the request body. */
    @MustBeClosed
    fun createBatch(params: BatchCreateBatchParams): HttpResponse =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    @MustBeClosed
    fun createBatch(
        params: BatchCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see createBatch */
    @MustBeClosed
    fun createBatch(
        batchInputTag: BatchInputTag,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        createBatch(
            BatchCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
            requestOptions,
        )

    /** @see createBatch */
    @MustBeClosed
    fun createBatch(batchInputTag: BatchInputTag): HttpResponse =
        createBatch(batchInputTag, RequestOptions.none())

    /** Retrieve the Blog Tag objects identified in the request body. */
    @MustBeClosed
    fun getBatch(params: BatchGetBatchParams): HttpResponse =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    @MustBeClosed
    fun getBatch(
        params: BatchGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getBatch */
    @MustBeClosed
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getBatch(
            BatchGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    @MustBeClosed
    fun getBatch(batchInputString: BatchInputString): HttpResponse =
        getBatch(batchInputString, RequestOptions.none())

    /** Update the Blog Tag objects identified in the request body. */
    @MustBeClosed
    fun updateBatch(params: BatchUpdateBatchParams): HttpResponse =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    @MustBeClosed
    fun updateBatch(
        params: BatchUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see updateBatch */
    @MustBeClosed
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        updateBatch(
            BatchUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    @MustBeClosed
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): HttpResponse =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/archive`, but is
         * otherwise the same as [BatchService.delete].
         */
        @MustBeClosed
        fun delete(params: BatchDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                BatchDeleteParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(batchInputString: BatchInputString): HttpResponse =
            delete(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/create`, but is
         * otherwise the same as [BatchService.createBatch].
         */
        @MustBeClosed
        fun createBatch(params: BatchCreateBatchParams): HttpResponse =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: BatchCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            batchInputTag: BatchInputTag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createBatch(
                BatchCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
                requestOptions,
            )

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(batchInputTag: BatchInputTag): HttpResponse =
            createBatch(batchInputTag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/read`, but is
         * otherwise the same as [BatchService.getBatch].
         */
        @MustBeClosed
        fun getBatch(params: BatchGetBatchParams): HttpResponse =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: BatchGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getBatch(
                BatchGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(batchInputString: BatchInputString): HttpResponse =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/update`, but is
         * otherwise the same as [BatchService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(params: BatchUpdateBatchParams): HttpResponse =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: BatchUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateBatch(
                BatchUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(batchInputJsonNode: BatchInputJsonNode): HttpResponse =
            updateBatch(batchInputJsonNode, RequestOptions.none())
    }
}
