// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs.posts

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.BatchInputString
import com.hubspot.models.cms.BatchInputJsonNode
import com.hubspot.models.cms.blogs.posts.BatchInputBlogPost
import com.hubspot.models.cms.blogs.posts.batch.BatchCreateParams
import com.hubspot.models.cms.blogs.posts.batch.BatchDeleteParams
import com.hubspot.models.cms.blogs.posts.batch.BatchGetParams
import com.hubspot.models.cms.blogs.posts.batch.BatchUpdateParams
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
    @MustBeClosed
    fun create(params: BatchCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see create */
    @MustBeClosed
    fun create(
        batchInputBlogPost: BatchInputBlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        create(
            BatchCreateParams.builder().batchInputBlogPost(batchInputBlogPost).build(),
            requestOptions,
        )

    /** @see create */
    @MustBeClosed
    fun create(batchInputBlogPost: BatchInputBlogPost): HttpResponse =
        create(batchInputBlogPost, RequestOptions.none())

    /** Update a batch of blog posts. */
    @MustBeClosed
    fun update(params: BatchUpdateParams): HttpResponse = update(params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see update */
    @MustBeClosed
    fun update(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        update(
            BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see update */
    @MustBeClosed
    fun update(batchInputJsonNode: BatchInputJsonNode): HttpResponse =
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
    @MustBeClosed fun get(params: BatchGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see get */
    @MustBeClosed
    fun get(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(batchInputString: BatchInputString): HttpResponse =
        get(batchInputString, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/batch/create`, but is
         * otherwise the same as [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputBlogPost: BatchInputBlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                BatchCreateParams.builder().batchInputBlogPost(batchInputBlogPost).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(batchInputBlogPost: BatchInputBlogPost): HttpResponse =
            create(batchInputBlogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/batch/update`, but is
         * otherwise the same as [BatchService.update].
         */
        @MustBeClosed
        fun update(params: BatchUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(
                BatchUpdateParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(batchInputJsonNode: BatchInputJsonNode): HttpResponse =
            update(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/batch/archive`, but is
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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/batch/read`, but is
         * otherwise the same as [BatchService.get].
         */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            get(BatchGetParams.builder().batchInputString(batchInputString).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(batchInputString: BatchInputString): HttpResponse =
            get(batchInputString, RequestOptions.none())
    }
}
