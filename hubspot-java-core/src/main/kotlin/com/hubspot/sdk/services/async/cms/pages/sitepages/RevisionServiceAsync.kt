// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.sitepages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionListSitePageRevisionsPageAsync
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionListSitePageRevisionsParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionToDraftParams
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

    /** Retrieve a previous version of a website page by the revision ID. */
    fun getSitePageRevision(
        revisionId: String,
        params: RevisionGetSitePageRevisionParams,
    ): CompletableFuture<PageVersion> =
        getSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        revisionId: String,
        params: RevisionGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion> =
        getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        params: RevisionGetSitePageRevisionParams
    ): CompletableFuture<PageVersion> = getSitePageRevision(params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        params: RevisionGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion>

    /** Retrieves all the previous versions of a website page, specified by page ID. */
    fun listSitePageRevisions(
        objectId: String
    ): CompletableFuture<RevisionListSitePageRevisionsPageAsync> =
        listSitePageRevisions(objectId, RevisionListSitePageRevisionsParams.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: RevisionListSitePageRevisionsParams = RevisionListSitePageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListSitePageRevisionsPageAsync> =
        listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: RevisionListSitePageRevisionsParams = RevisionListSitePageRevisionsParams.none(),
    ): CompletableFuture<RevisionListSitePageRevisionsPageAsync> =
        listSitePageRevisions(objectId, params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: RevisionListSitePageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListSitePageRevisionsPageAsync>

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: RevisionListSitePageRevisionsParams
    ): CompletableFuture<RevisionListSitePageRevisionsPageAsync> =
        listSitePageRevisions(params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RevisionListSitePageRevisionsPageAsync> =
        listSitePageRevisions(objectId, RevisionListSitePageRevisionsParams.none(), requestOptions)

    /** Restores a website page to a previous version, specified by page ID and version ID. */
    fun restoreSitePageRevision(
        revisionId: String,
        params: RevisionRestoreSitePageRevisionParams,
    ): CompletableFuture<PagesPage> =
        restoreSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        revisionId: String,
        params: RevisionRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        restoreSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        params: RevisionRestoreSitePageRevisionParams
    ): CompletableFuture<PagesPage> = restoreSitePageRevision(params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        params: RevisionRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /**
     * Takes a specified version of a website page and sets it as the new draft version of the page.
     */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreSitePageRevisionToDraftParams,
    ): CompletableFuture<PagesPage> =
        restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        restoreSitePageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: RevisionRestoreSitePageRevisionToDraftParams
    ): CompletableFuture<PagesPage> = restoreSitePageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: RevisionRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

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
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [RevisionServiceAsync.getSitePageRevision].
         */
        fun getSitePageRevision(
            revisionId: String,
            params: RevisionGetSitePageRevisionParams,
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see getSitePageRevision */
        fun getSitePageRevision(
            revisionId: String,
            params: RevisionGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getSitePageRevision */
        fun getSitePageRevision(
            params: RevisionGetSitePageRevisionParams
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getSitePageRevision(params, RequestOptions.none())

        /** @see getSitePageRevision */
        fun getSitePageRevision(
            params: RevisionGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/revisions`,
         * but is otherwise the same as [RevisionServiceAsync.listSitePageRevisions].
         */
        fun listSitePageRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<RevisionListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(objectId, RevisionListSitePageRevisionsParams.none())

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            objectId: String,
            params: RevisionListSitePageRevisionsParams =
                RevisionListSitePageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            objectId: String,
            params: RevisionListSitePageRevisionsParams = RevisionListSitePageRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(objectId, params, RequestOptions.none())

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            params: RevisionListSitePageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListSitePageRevisionsPageAsync>>

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            params: RevisionListSitePageRevisionsParams
        ): CompletableFuture<HttpResponseFor<RevisionListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(params, RequestOptions.none())

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RevisionListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(
                objectId,
                RevisionListSitePageRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [RevisionServiceAsync.restoreSitePageRevision].
         */
        fun restoreSitePageRevision(
            revisionId: String,
            params: RevisionRestoreSitePageRevisionParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        fun restoreSitePageRevision(
            revisionId: String,
            params: RevisionRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreSitePageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevision */
        fun restoreSitePageRevision(
            params: RevisionRestoreSitePageRevisionParams
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreSitePageRevision(params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        fun restoreSitePageRevision(
            params: RevisionRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [RevisionServiceAsync.restoreSitePageRevisionToDraft].
         */
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreSitePageRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreSitePageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevisionToDraft */
        fun restoreSitePageRevisionToDraft(
            params: RevisionRestoreSitePageRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreSitePageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        fun restoreSitePageRevisionToDraft(
            params: RevisionRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>
    }
}
