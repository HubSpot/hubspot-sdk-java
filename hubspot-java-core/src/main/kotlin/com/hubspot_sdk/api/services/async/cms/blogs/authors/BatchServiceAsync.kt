// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs.authors

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.blogs.authors.BatchInputBlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.batch.BatchCreateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.authors.batch.BatchGetParams
import com.hubspot_sdk.api.models.cms.blogs.authors.batch.BatchUpdateParams
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

    /** Create the Blog Author objects detailed in the request body. */
    fun create(params: BatchCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see create */
    fun create(
        batchInputBlogAuthor: BatchInputBlogAuthor,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        create(
            BatchCreateParams.builder().batchInputBlogAuthor(batchInputBlogAuthor).build(),
            requestOptions,
        )

    /** @see create */
    fun create(batchInputBlogAuthor: BatchInputBlogAuthor): CompletableFuture<HttpResponse> =
        create(batchInputBlogAuthor, RequestOptions.none())

    /** Update the Blog Author objects identified in the request body. */
    fun update(params: BatchUpdateParams): CompletableFuture<HttpResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see update */
    fun update(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        update(
            BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see update */
    fun update(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<HttpResponse> =
        update(batchInputJsonNode, RequestOptions.none())

    /** Delete the Blog Author objects identified in the request body. */
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

    /** Retrieve the Blog Author objects identified in the request body. */
    fun get(params: BatchGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see get */
    fun get(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see get */
    fun get(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
        get(batchInputString, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/authors/batch/create`, but is
         * otherwise the same as [BatchServiceAsync.create].
         */
        fun create(params: BatchCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            batchInputBlogAuthor: BatchInputBlogAuthor,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(
                BatchCreateParams.builder().batchInputBlogAuthor(batchInputBlogAuthor).build(),
                requestOptions,
            )

        /** @see create */
        fun create(batchInputBlogAuthor: BatchInputBlogAuthor): CompletableFuture<HttpResponse> =
            create(batchInputBlogAuthor, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/authors/batch/update`, but is
         * otherwise the same as [BatchServiceAsync.update].
         */
        fun update(params: BatchUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(
                BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see update */
        fun update(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<HttpResponse> =
            update(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/authors/batch/archive`, but is
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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/authors/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.get].
         */
        fun get(params: BatchGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

        /** @see get */
        fun get(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            get(batchInputString, RequestOptions.none())
    }
}
