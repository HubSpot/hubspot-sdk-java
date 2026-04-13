// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.cms.blogs.settings.Blog
import com.hubspot.models.cms.blogs.settings.BlogVersion
import com.hubspot.models.cms.blogs.settings.SettingGetParams
import com.hubspot.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot.models.cms.blogs.settings.SettingListPage
import com.hubspot.models.cms.blogs.settings.SettingListParams
import com.hubspot.models.cms.blogs.settings.SettingListRevisionsPage
import com.hubspot.models.cms.blogs.settings.SettingListRevisionsParams
import com.hubspot.services.blocking.cms.blogs.settings.MultiLanguageService
import java.util.function.Consumer

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService

    fun multiLanguage(): MultiLanguageService

    /** Get the list of blogs. Results can be limited and filtered by creation or updated date. */
    fun list(): SettingListPage = list(SettingListParams.none())

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingListPage

    /** @see list */
    fun list(params: SettingListParams = SettingListParams.none()): SettingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SettingListPage =
        list(SettingListParams.none(), requestOptions)

    /** Retrieve a specific blog by its ID. */
    fun get(blogId: String): Blog = get(blogId, SettingGetParams.none())

    /** @see get */
    fun get(
        blogId: String,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Blog = get(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see get */
    fun get(blogId: String, params: SettingGetParams = SettingGetParams.none()): Blog =
        get(blogId, params, RequestOptions.none())

    /** @see get */
    fun get(params: SettingGetParams, requestOptions: RequestOptions = RequestOptions.none()): Blog

    /** @see get */
    fun get(params: SettingGetParams): Blog = get(params, RequestOptions.none())

    /** @see get */
    fun get(blogId: String, requestOptions: RequestOptions): Blog =
        get(blogId, SettingGetParams.none(), requestOptions)

    /** Get a specific blog revision. */
    fun getRevision(revisionId: String, params: SettingGetRevisionParams): BlogVersion =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogVersion = getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: SettingGetRevisionParams): BlogVersion =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogVersion

    /**
     * Get the list of blog revisions. Results can be limited and filtered by creation or updated
     * date.
     */
    fun listRevisions(blogId: String): SettingListRevisionsPage =
        listRevisions(blogId, SettingListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingListRevisionsPage =
        listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
    ): SettingListRevisionsPage = listRevisions(blogId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: SettingListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingListRevisionsPage

    /** @see listRevisions */
    fun listRevisions(params: SettingListRevisionsParams): SettingListRevisionsPage =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(blogId: String, requestOptions: RequestOptions): SettingListRevisionsPage =
        listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        fun multiLanguage(): MultiLanguageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/blog-settings/2026-03/settings`, but is
         * otherwise the same as [SettingService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SettingListPage> = list(SettingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams = SettingListParams.none()
        ): HttpResponseFor<SettingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SettingListPage> =
            list(SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blog-settings/2026-03/settings/{blogId}`, but
         * is otherwise the same as [SettingService.get].
         */
        @MustBeClosed
        fun get(blogId: String): HttpResponseFor<Blog> = get(blogId, SettingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Blog> = get(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
        ): HttpResponseFor<Blog> = get(blogId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Blog>

        /** @see get */
        @MustBeClosed
        fun get(params: SettingGetParams): HttpResponseFor<Blog> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(blogId: String, requestOptions: RequestOptions): HttpResponseFor<Blog> =
            get(blogId, SettingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/blog-settings/2026-03/settings/{blogId}/revisions/{revisionId}`, but is otherwise
         * the same as [SettingService.getRevision].
         */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
        ): HttpResponseFor<BlogVersion> = getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogVersion> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(params: SettingGetRevisionParams): HttpResponseFor<BlogVersion> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogVersion>

        /**
         * Returns a raw HTTP response for `get
         * /cms/blog-settings/2026-03/settings/{blogId}/revisions`, but is otherwise the same as
         * [SettingService.listRevisions].
         */
        @MustBeClosed
        fun listRevisions(blogId: String): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(blogId, SettingListRevisionsParams.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        ): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(blogId, params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: SettingListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingListRevisionsPage>

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: SettingListRevisionsParams
        ): HttpResponseFor<SettingListRevisionsPage> = listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            blogId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)
    }
}
