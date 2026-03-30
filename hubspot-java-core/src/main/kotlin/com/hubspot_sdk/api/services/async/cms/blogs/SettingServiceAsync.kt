// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.blogs.settings.Blog
import com.hubspot_sdk.api.models.cms.blogs.settings.BlogVersion
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsParams
import com.hubspot_sdk.api.services.async.cms.blogs.settings.MultiLanguageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

    fun multiLanguage(): MultiLanguageServiceAsync

    /** Get the list of blogs. Results can be limited and filtered by creation or updated date. */
    fun list(): CompletableFuture<SettingListPageAsync> = list(SettingListParams.none())

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingListPageAsync>

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none()
    ): CompletableFuture<SettingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SettingListPageAsync> =
        list(SettingListParams.none(), requestOptions)

    /** Retrieve a specific blog by its ID. */
    fun get(blogId: String): CompletableFuture<Blog> = get(blogId, SettingGetParams.none())

    /** @see get */
    fun get(
        blogId: String,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Blog> = get(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see get */
    fun get(
        blogId: String,
        params: SettingGetParams = SettingGetParams.none(),
    ): CompletableFuture<Blog> = get(blogId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Blog>

    /** @see get */
    fun get(params: SettingGetParams): CompletableFuture<Blog> = get(params, RequestOptions.none())

    /** @see get */
    fun get(blogId: String, requestOptions: RequestOptions): CompletableFuture<Blog> =
        get(blogId, SettingGetParams.none(), requestOptions)

    /** Get a specific blog revision. */
    fun getRevision(
        revisionId: String,
        params: SettingGetRevisionParams,
    ): CompletableFuture<BlogVersion> = getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogVersion> =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: SettingGetRevisionParams): CompletableFuture<BlogVersion> =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogVersion>

    /**
     * Get the list of blog revisions. Results can be limited and filtered by creation or updated
     * date.
     */
    fun listRevisions(blogId: String): CompletableFuture<SettingListRevisionsPageAsync> =
        listRevisions(blogId, SettingListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingListRevisionsPageAsync> =
        listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
    ): CompletableFuture<SettingListRevisionsPageAsync> =
        listRevisions(blogId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: SettingListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingListRevisionsPageAsync>

    /** @see listRevisions */
    fun listRevisions(
        params: SettingListRevisionsParams
    ): CompletableFuture<SettingListRevisionsPageAsync> =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingListRevisionsPageAsync> =
        listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/blog-settings/2026-03/settings`, but is
         * otherwise the same as [SettingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SettingListPageAsync>> =
            list(SettingListParams.none())

        /** @see list */
        fun list(
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>>

        /** @see list */
        fun list(
            params: SettingListParams = SettingListParams.none()
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>> =
            list(SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blog-settings/2026-03/settings/{blogId}`, but
         * is otherwise the same as [SettingServiceAsync.get].
         */
        fun get(blogId: String): CompletableFuture<HttpResponseFor<Blog>> =
            get(blogId, SettingGetParams.none())

        /** @see get */
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Blog>> =
            get(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see get */
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Blog>> = get(blogId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Blog>>

        /** @see get */
        fun get(params: SettingGetParams): CompletableFuture<HttpResponseFor<Blog>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            blogId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Blog>> =
            get(blogId, SettingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/blog-settings/2026-03/settings/{blogId}/revisions/{revisionId}`, but is otherwise
         * the same as [SettingServiceAsync.getRevision].
         */
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
        ): CompletableFuture<HttpResponseFor<BlogVersion>> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogVersion>> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        fun getRevision(
            params: SettingGetRevisionParams
        ): CompletableFuture<HttpResponseFor<BlogVersion>> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogVersion>>

        /**
         * Returns a raw HTTP response for `get
         * /cms/blog-settings/2026-03/settings/{blogId}/revisions`, but is otherwise the same as
         * [SettingServiceAsync.listRevisions].
         */
        fun listRevisions(
            blogId: String
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>> =
            listRevisions(blogId, SettingListRevisionsParams.none())

        /** @see listRevisions */
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>> =
            listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see listRevisions */
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>> =
            listRevisions(blogId, params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            params: SettingListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>>

        /** @see listRevisions */
        fun listRevisions(
            params: SettingListRevisionsParams
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            blogId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>> =
            listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)
    }
}
