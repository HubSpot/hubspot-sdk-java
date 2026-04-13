// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.blogs.posts

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionParams
import com.hubspot.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionsParams
import com.hubspot.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionParams
import com.hubspot.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionToDraftParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RevisionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionServiceAsync

    /** Retrieve a previous version of a blog post. */
    fun getPreviousVersion(
        revisionId: String,
        params: RevisionGetPreviousVersionParams,
    ): CompletableFuture<HttpResponse> =
        getPreviousVersion(revisionId, params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        revisionId: String,
        params: RevisionGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        params: RevisionGetPreviousVersionParams
    ): CompletableFuture<HttpResponse> = getPreviousVersion(params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        params: RevisionGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** Retrieve all the previous versions of a blog post. */
    fun getPreviousVersions(objectId: String): CompletableFuture<HttpResponse> =
        getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
    ): CompletableFuture<HttpResponse> =
        getPreviousVersions(objectId, params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        params: RevisionGetPreviousVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        params: RevisionGetPreviousVersionsParams
    ): CompletableFuture<HttpResponse> = getPreviousVersions(params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none(), requestOptions)

    /** Restores a blog post to one of its previous versions. */
    fun restorePreviousVersion(
        revisionId: String,
        params: RevisionRestorePreviousVersionParams,
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersion(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        revisionId: String,
        params: RevisionRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        params: RevisionRestorePreviousVersionParams
    ): CompletableFuture<HttpResponse> = restorePreviousVersion(params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        params: RevisionRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Takes a specified version of a blog post, sets it as the new draft version of the blog post.
     */
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: RevisionRestorePreviousVersionToDraftParams,
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: RevisionRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        params: RevisionRestorePreviousVersionToDraftParams
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersionToDraft(params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        params: RevisionRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * A view of [RevisionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevisionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [RevisionServiceAsync.getPreviousVersion].
         */
        fun getPreviousVersion(
            revisionId: String,
            params: RevisionGetPreviousVersionParams,
        ): CompletableFuture<HttpResponse> =
            getPreviousVersion(revisionId, params, RequestOptions.none())

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            revisionId: String,
            params: RevisionGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            params: RevisionGetPreviousVersionParams
        ): CompletableFuture<HttpResponse> = getPreviousVersion(params, RequestOptions.none())

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            params: RevisionGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/revisions`, but
         * is otherwise the same as [RevisionServiceAsync.getPreviousVersions].
         */
        fun getPreviousVersions(objectId: String): CompletableFuture<HttpResponse> =
            getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
        ): CompletableFuture<HttpResponse> =
            getPreviousVersions(objectId, params, RequestOptions.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            params: RevisionGetPreviousVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            params: RevisionGetPreviousVersionsParams
        ): CompletableFuture<HttpResponse> = getPreviousVersions(params, RequestOptions.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [RevisionServiceAsync.restorePreviousVersion].
         */
        fun restorePreviousVersion(
            revisionId: String,
            params: RevisionRestorePreviousVersionParams,
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersion(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            revisionId: String,
            params: RevisionRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersion(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            params: RevisionRestorePreviousVersionParams
        ): CompletableFuture<HttpResponse> = restorePreviousVersion(params, RequestOptions.none())

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            params: RevisionRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [RevisionServiceAsync.restorePreviousVersionToDraft].
         */
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: RevisionRestorePreviousVersionToDraftParams,
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: RevisionRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            params: RevisionRestorePreviousVersionToDraftParams
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersionToDraft(params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            params: RevisionRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
