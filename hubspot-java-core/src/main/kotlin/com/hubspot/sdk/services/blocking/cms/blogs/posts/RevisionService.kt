// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.blogs.posts

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionsParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionToDraftParams
import java.util.function.Consumer

interface RevisionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionService

    /** Retrieve a previous version of a blog post. */
    @MustBeClosed
    fun getPreviousVersion(
        revisionId: String,
        params: RevisionGetPreviousVersionParams,
    ): HttpResponse = getPreviousVersion(revisionId, params, RequestOptions.none())

    /** @see getPreviousVersion */
    @MustBeClosed
    fun getPreviousVersion(
        revisionId: String,
        params: RevisionGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getPreviousVersion */
    @MustBeClosed
    fun getPreviousVersion(params: RevisionGetPreviousVersionParams): HttpResponse =
        getPreviousVersion(params, RequestOptions.none())

    /** @see getPreviousVersion */
    @MustBeClosed
    fun getPreviousVersion(
        params: RevisionGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** Retrieve all the previous versions of a blog post. */
    @MustBeClosed
    fun getPreviousVersions(objectId: String): HttpResponse =
        getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none())

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(
        objectId: String,
        params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(
        objectId: String,
        params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
    ): HttpResponse = getPreviousVersions(objectId, params, RequestOptions.none())

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(
        params: RevisionGetPreviousVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(params: RevisionGetPreviousVersionsParams): HttpResponse =
        getPreviousVersions(params, RequestOptions.none())

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(objectId: String, requestOptions: RequestOptions): HttpResponse =
        getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none(), requestOptions)

    /** Restores a blog post to one of its previous versions. */
    @MustBeClosed
    fun restorePreviousVersion(
        revisionId: String,
        params: RevisionRestorePreviousVersionParams,
    ): HttpResponse = restorePreviousVersion(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersion */
    @MustBeClosed
    fun restorePreviousVersion(
        revisionId: String,
        params: RevisionRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        restorePreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restorePreviousVersion */
    @MustBeClosed
    fun restorePreviousVersion(params: RevisionRestorePreviousVersionParams): HttpResponse =
        restorePreviousVersion(params, RequestOptions.none())

    /** @see restorePreviousVersion */
    @MustBeClosed
    fun restorePreviousVersion(
        params: RevisionRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Takes a specified version of a blog post, sets it as the new draft version of the blog post.
     */
    @MustBeClosed
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: RevisionRestorePreviousVersionToDraftParams,
    ): HttpResponse = restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    @MustBeClosed
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: RevisionRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        restorePreviousVersionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restorePreviousVersionToDraft */
    @MustBeClosed
    fun restorePreviousVersionToDraft(
        params: RevisionRestorePreviousVersionToDraftParams
    ): HttpResponse = restorePreviousVersionToDraft(params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    @MustBeClosed
    fun restorePreviousVersionToDraft(
        params: RevisionRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** A view of [RevisionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [RevisionService.getPreviousVersion].
         */
        @MustBeClosed
        fun getPreviousVersion(
            revisionId: String,
            params: RevisionGetPreviousVersionParams,
        ): HttpResponse = getPreviousVersion(revisionId, params, RequestOptions.none())

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(
            revisionId: String,
            params: RevisionGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(params: RevisionGetPreviousVersionParams): HttpResponse =
            getPreviousVersion(params, RequestOptions.none())

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(
            params: RevisionGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/revisions`, but
         * is otherwise the same as [RevisionService.getPreviousVersions].
         */
        @MustBeClosed
        fun getPreviousVersions(objectId: String): HttpResponse =
            getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            objectId: String,
            params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            objectId: String,
            params: RevisionGetPreviousVersionsParams = RevisionGetPreviousVersionsParams.none(),
        ): HttpResponse = getPreviousVersions(objectId, params, RequestOptions.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            params: RevisionGetPreviousVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(params: RevisionGetPreviousVersionsParams): HttpResponse =
            getPreviousVersions(params, RequestOptions.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(objectId: String, requestOptions: RequestOptions): HttpResponse =
            getPreviousVersions(objectId, RevisionGetPreviousVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [RevisionService.restorePreviousVersion].
         */
        @MustBeClosed
        fun restorePreviousVersion(
            revisionId: String,
            params: RevisionRestorePreviousVersionParams,
        ): HttpResponse = restorePreviousVersion(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(
            revisionId: String,
            params: RevisionRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            restorePreviousVersion(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(params: RevisionRestorePreviousVersionParams): HttpResponse =
            restorePreviousVersion(params, RequestOptions.none())

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(
            params: RevisionRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [RevisionService.restorePreviousVersionToDraft].
         */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: RevisionRestorePreviousVersionToDraftParams,
        ): HttpResponse = restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: RevisionRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            restorePreviousVersionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            params: RevisionRestorePreviousVersionToDraftParams
        ): HttpResponse = restorePreviousVersionToDraft(params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            params: RevisionRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
