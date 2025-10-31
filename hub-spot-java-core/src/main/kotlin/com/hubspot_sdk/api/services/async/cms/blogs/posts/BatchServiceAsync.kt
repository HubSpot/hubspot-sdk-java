// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs.posts

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.blogs.posts.BatchInputBlogPost
import com.hubspot_sdk.api.models.cms.blogs.posts.BatchResponseBlogPost
import com.hubspot_sdk.api.models.cms.blogs.posts.batch.BatchCreateParams
import com.hubspot_sdk.api.models.cms.blogs.posts.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.posts.batch.BatchGetParams
import com.hubspot_sdk.api.models.cms.blogs.posts.batch.BatchUpdateParams
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

    /** Create a batch of blog posts, specifying their content in the request body. */
    fun create(params: BatchCreateParams): CompletableFuture<BatchResponseBlogPost> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogPost>

    /** @see create */
    fun create(
        batchInputBlogPost: BatchInputBlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogPost> =
        create(
            BatchCreateParams.builder().batchInputBlogPost(batchInputBlogPost).build(),
            requestOptions,
        )

    /** @see create */
    fun create(batchInputBlogPost: BatchInputBlogPost): CompletableFuture<BatchResponseBlogPost> =
        create(batchInputBlogPost, RequestOptions.none())

    /** Update a batch of blog posts. */
    fun update(params: BatchUpdateParams): CompletableFuture<BatchResponseBlogPost> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogPost>

    /** @see update */
    fun update(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogPost> =
        update(
            BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see update */
    fun update(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<BatchResponseBlogPost> =
        update(batchInputJsonNode, RequestOptions.none())

    /**
     * Delete a blog post by ID. Note: This is not the same as the in-app `archive` function. To
     * perform a dashboard `archive` send an normal update with the `archivedInDashboard` field set
     * to `true`.
     */
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

    /** Retrieve a batch of blog posts by ID. identified in the request body. */
    fun get(params: BatchGetParams): CompletableFuture<BatchResponseBlogPost> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogPost>

    /** @see get */
    fun get(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogPost> =
        get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see get */
    fun get(batchInputString: BatchInputString): CompletableFuture<BatchResponseBlogPost> =
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/create`, but is otherwise
         * the same as [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>>

        /** @see create */
        fun create(
            batchInputBlogPost: BatchInputBlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            create(
                BatchCreateParams.builder().batchInputBlogPost(batchInputBlogPost).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            batchInputBlogPost: BatchInputBlogPost
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            create(batchInputBlogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/update`, but is otherwise
         * the same as [BatchServiceAsync.update].
         */
        fun update(
            params: BatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>>

        /** @see update */
        fun update(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            update(
                BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            update(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/archive`, but is
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/read`, but is otherwise
         * the same as [BatchServiceAsync.get].
         */
        fun get(params: BatchGetParams): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>>

        /** @see get */
        fun get(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

        /** @see get */
        fun get(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogPost>> =
            get(batchInputString, RequestOptions.none())
    }
}
