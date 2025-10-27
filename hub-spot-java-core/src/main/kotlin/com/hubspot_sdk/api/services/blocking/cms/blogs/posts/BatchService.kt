// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs.posts

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.cms.blogs.posts.batch.BatchReadParams
import com.hubspot_sdk.api.models.cms.blogs.posts.batch.BatchUpdateParams
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

    /** Create a batch of blog posts, specifying their content in the request body. */
    fun create(params: BatchCreateParams): BatchResponseBlogPost =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogPost

    /** @see create */
    fun create(
        batchInputBlogPost: BatchInputBlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogPost =
        create(
            BatchCreateParams.builder().batchInputBlogPost(batchInputBlogPost).build(),
            requestOptions,
        )

    /** @see create */
    fun create(batchInputBlogPost: BatchInputBlogPost): BatchResponseBlogPost =
        create(batchInputBlogPost, RequestOptions.none())

    /** Update a batch of blog posts. */
    fun update(params: BatchUpdateParams): BatchResponseBlogPost =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogPost

    /** @see update */
    fun update(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogPost =
        update(
            BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see update */
    fun update(batchInputJsonNode: BatchInputJsonNode): BatchResponseBlogPost =
        update(batchInputJsonNode, RequestOptions.none())

    /**
     * Delete a blog post by ID. Note: This is not the same as the in-app `archive` function. To
     * perform a dashboard `archive` send an normal update with the `archivedInDashboard` field set
     * to `true`.
     */
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

    /** Retrieve a batch of blog posts by ID. identified in the request body. */
    fun read(params: BatchReadParams): BatchResponseBlogPost = read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogPost

    /** @see read */
    fun read(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseBlogPost =
        read(BatchReadParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see read */
    fun read(batchInputString: BatchInputString): BatchResponseBlogPost =
        read(batchInputString, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/create`, but is otherwise
         * the same as [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponseBlogPost> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogPost>

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputBlogPost: BatchInputBlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogPost> =
            create(
                BatchCreateParams.builder().batchInputBlogPost(batchInputBlogPost).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(batchInputBlogPost: BatchInputBlogPost): HttpResponseFor<BatchResponseBlogPost> =
            create(batchInputBlogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/update`, but is otherwise
         * the same as [BatchService.update].
         */
        @MustBeClosed
        fun update(params: BatchUpdateParams): HttpResponseFor<BatchResponseBlogPost> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogPost>

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogPost> =
            update(
                BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(batchInputJsonNode: BatchInputJsonNode): HttpResponseFor<BatchResponseBlogPost> =
            update(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/archive`, but is
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/batch/read`, but is otherwise
         * the same as [BatchService.read].
         */
        @MustBeClosed
        fun read(params: BatchReadParams): HttpResponseFor<BatchResponseBlogPost> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogPost>

        /** @see read */
        @MustBeClosed
        fun read(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseBlogPost> =
            read(
                BatchReadParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see read */
        @MustBeClosed
        fun read(batchInputString: BatchInputString): HttpResponseFor<BatchResponseBlogPost> =
            read(batchInputString, RequestOptions.none())
    }
}
