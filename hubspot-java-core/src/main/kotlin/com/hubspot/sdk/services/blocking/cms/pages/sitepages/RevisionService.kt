// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.sitepages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionListSitePageRevisionsPage
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionListSitePageRevisionsParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionToDraftParams
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

    /** Retrieve a previous version of a website page by the revision ID. */
    fun getSitePageRevision(
        revisionId: String,
        params: RevisionGetSitePageRevisionParams,
    ): PageVersion = getSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        revisionId: String,
        params: RevisionGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion =
        getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getSitePageRevision */
    fun getSitePageRevision(params: RevisionGetSitePageRevisionParams): PageVersion =
        getSitePageRevision(params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        params: RevisionGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion

    /** Retrieves all the previous versions of a website page, specified by page ID. */
    fun listSitePageRevisions(objectId: String): RevisionListSitePageRevisionsPage =
        listSitePageRevisions(objectId, RevisionListSitePageRevisionsParams.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: RevisionListSitePageRevisionsParams = RevisionListSitePageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevisionListSitePageRevisionsPage =
        listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: RevisionListSitePageRevisionsParams = RevisionListSitePageRevisionsParams.none(),
    ): RevisionListSitePageRevisionsPage =
        listSitePageRevisions(objectId, params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: RevisionListSitePageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevisionListSitePageRevisionsPage

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: RevisionListSitePageRevisionsParams
    ): RevisionListSitePageRevisionsPage = listSitePageRevisions(params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): RevisionListSitePageRevisionsPage =
        listSitePageRevisions(objectId, RevisionListSitePageRevisionsParams.none(), requestOptions)

    /** Restores a website page to a previous version, specified by page ID and version ID. */
    fun restoreSitePageRevision(
        revisionId: String,
        params: RevisionRestoreSitePageRevisionParams,
    ): PagesPage = restoreSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        revisionId: String,
        params: RevisionRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        restoreSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(params: RevisionRestoreSitePageRevisionParams): PagesPage =
        restoreSitePageRevision(params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        params: RevisionRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /**
     * Takes a specified version of a website page and sets it as the new draft version of the page.
     */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreSitePageRevisionToDraftParams,
    ): PagesPage = restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        restoreSitePageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: RevisionRestoreSitePageRevisionToDraftParams
    ): PagesPage = restoreSitePageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: RevisionRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

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
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [RevisionService.getSitePageRevision].
         */
        @MustBeClosed
        fun getSitePageRevision(
            revisionId: String,
            params: RevisionGetSitePageRevisionParams,
        ): HttpResponseFor<PageVersion> =
            getSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see getSitePageRevision */
        @MustBeClosed
        fun getSitePageRevision(
            revisionId: String,
            params: RevisionGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion> =
            getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getSitePageRevision */
        @MustBeClosed
        fun getSitePageRevision(
            params: RevisionGetSitePageRevisionParams
        ): HttpResponseFor<PageVersion> = getSitePageRevision(params, RequestOptions.none())

        /** @see getSitePageRevision */
        @MustBeClosed
        fun getSitePageRevision(
            params: RevisionGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/revisions`,
         * but is otherwise the same as [RevisionService.listSitePageRevisions].
         */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String
        ): HttpResponseFor<RevisionListSitePageRevisionsPage> =
            listSitePageRevisions(objectId, RevisionListSitePageRevisionsParams.none())

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String,
            params: RevisionListSitePageRevisionsParams =
                RevisionListSitePageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevisionListSitePageRevisionsPage> =
            listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String,
            params: RevisionListSitePageRevisionsParams = RevisionListSitePageRevisionsParams.none(),
        ): HttpResponseFor<RevisionListSitePageRevisionsPage> =
            listSitePageRevisions(objectId, params, RequestOptions.none())

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            params: RevisionListSitePageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevisionListSitePageRevisionsPage>

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            params: RevisionListSitePageRevisionsParams
        ): HttpResponseFor<RevisionListSitePageRevisionsPage> =
            listSitePageRevisions(params, RequestOptions.none())

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RevisionListSitePageRevisionsPage> =
            listSitePageRevisions(
                objectId,
                RevisionListSitePageRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [RevisionService.restoreSitePageRevision].
         */
        @MustBeClosed
        fun restoreSitePageRevision(
            revisionId: String,
            params: RevisionRestoreSitePageRevisionParams,
        ): HttpResponseFor<PagesPage> =
            restoreSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            revisionId: String,
            params: RevisionRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            restoreSitePageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            params: RevisionRestoreSitePageRevisionParams
        ): HttpResponseFor<PagesPage> = restoreSitePageRevision(params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            params: RevisionRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [RevisionService.restoreSitePageRevisionToDraft].
         */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreSitePageRevisionToDraftParams,
        ): HttpResponseFor<PagesPage> =
            restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            restoreSitePageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            params: RevisionRestoreSitePageRevisionToDraftParams
        ): HttpResponseFor<PagesPage> =
            restoreSitePageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            params: RevisionRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>
    }
}
