// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.blogs.tags

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.BatchInputString
import com.hubspot.models.cms.BatchInputJsonNode
import com.hubspot.models.cms.blogs.tags.BatchInputTag
import com.hubspot.models.cms.blogs.tags.batch.BatchCreateBatchParams
import com.hubspot.models.cms.blogs.tags.batch.BatchDeleteParams
import com.hubspot.models.cms.blogs.tags.batch.BatchGetBatchParams
import com.hubspot.models.cms.blogs.tags.batch.BatchUpdateBatchParams
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

    /** Delete the Blog Tag objects identified in the request body. */
    fun delete(params: BatchDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(
            BatchDeleteParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(batchInputString: BatchInputString): CompletableFuture<Void?> =
        delete(batchInputString, RequestOptions.none())

    /** Create the Blog Tag objects detailed in the request body. */
    fun createBatch(params: BatchCreateBatchParams): CompletableFuture<HttpResponse> =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: BatchCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see createBatch */
    fun createBatch(
        batchInputTag: BatchInputTag,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        createBatch(
            BatchCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputTag: BatchInputTag): CompletableFuture<HttpResponse> =
        createBatch(batchInputTag, RequestOptions.none())

    /** Retrieve the Blog Tag objects identified in the request body. */
    fun getBatch(params: BatchGetBatchParams): CompletableFuture<HttpResponse> =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: BatchGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getBatch(
            BatchGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
        getBatch(batchInputString, RequestOptions.none())

    /** Update the Blog Tag objects identified in the request body. */
    fun updateBatch(params: BatchUpdateBatchParams): CompletableFuture<HttpResponse> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: BatchUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateBatch(
            BatchUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<HttpResponse> =
        updateBatch(batchInputJsonNode, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/archive`, but is
         * otherwise the same as [BatchServiceAsync.delete].
         */
        fun delete(params: BatchDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                BatchDeleteParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            delete(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/create`, but is
         * otherwise the same as [BatchServiceAsync.createBatch].
         */
        fun createBatch(params: BatchCreateBatchParams): CompletableFuture<HttpResponse> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: BatchCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createBatch */
        fun createBatch(
            batchInputTag: BatchInputTag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createBatch(
                BatchCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
                requestOptions,
            )

        /** @see createBatch */
        fun createBatch(batchInputTag: BatchInputTag): CompletableFuture<HttpResponse> =
            createBatch(batchInputTag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.getBatch].
         */
        fun getBatch(params: BatchGetBatchParams): CompletableFuture<HttpResponse> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            params: BatchGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getBatch(
                BatchGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        fun getBatch(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/update`, but is
         * otherwise the same as [BatchServiceAsync.updateBatch].
         */
        fun updateBatch(params: BatchUpdateBatchParams): CompletableFuture<HttpResponse> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: BatchUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateBatch(
                BatchUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        fun updateBatch(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<HttpResponse> =
            updateBatch(batchInputJsonNode, RequestOptions.none())
    }
}
