// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionListLandingPageRevisionsPage
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionListLandingPageRevisionsParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionToDraftParams
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

    /** Retrieve a previous version of a landing page, specified by page ID and revision ID. */
    fun getLandingPageRevision(
        revisionId: String,
        params: RevisionGetLandingPageRevisionParams,
    ): PageVersion = getLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        revisionId: String,
        params: RevisionGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion =
        getLandingPageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(params: RevisionGetLandingPageRevisionParams): PageVersion =
        getLandingPageRevision(params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        params: RevisionGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion

    /** Retrieve all the previous versions of a landing page, specified by page ID. */
    fun listLandingPageRevisions(objectId: String): RevisionListLandingPageRevisionsPage =
        listLandingPageRevisions(objectId, RevisionListLandingPageRevisionsParams.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: RevisionListLandingPageRevisionsParams =
            RevisionListLandingPageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevisionListLandingPageRevisionsPage =
        listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: RevisionListLandingPageRevisionsParams =
            RevisionListLandingPageRevisionsParams.none(),
    ): RevisionListLandingPageRevisionsPage =
        listLandingPageRevisions(objectId, params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: RevisionListLandingPageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevisionListLandingPageRevisionsPage

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: RevisionListLandingPageRevisionsParams
    ): RevisionListLandingPageRevisionsPage =
        listLandingPageRevisions(params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): RevisionListLandingPageRevisionsPage =
        listLandingPageRevisions(
            objectId,
            RevisionListLandingPageRevisionsParams.none(),
            requestOptions,
        )

    /** Restores a previous version of a landing page, specified by page ID and revision ID. */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: RevisionRestoreLandingPageRevisionParams,
    ): PagesPage = restoreLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: RevisionRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        restoreLandingPageRevision(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(params: RevisionRestoreLandingPageRevisionParams): PagesPage =
        restoreLandingPageRevision(params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        params: RevisionRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** Specify a previous version of a landing page to set as the page draft. */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreLandingPageRevisionToDraftParams,
    ): PagesPage = restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        restoreLandingPageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: RevisionRestoreLandingPageRevisionToDraftParams
    ): PagesPage = restoreLandingPageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: RevisionRestoreLandingPageRevisionToDraftParams,
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
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [RevisionService.getLandingPageRevision].
         */
        @MustBeClosed
        fun getLandingPageRevision(
            revisionId: String,
            params: RevisionGetLandingPageRevisionParams,
        ): HttpResponseFor<PageVersion> =
            getLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see getLandingPageRevision */
        @MustBeClosed
        fun getLandingPageRevision(
            revisionId: String,
            params: RevisionGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion> =
            getLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see getLandingPageRevision */
        @MustBeClosed
        fun getLandingPageRevision(
            params: RevisionGetLandingPageRevisionParams
        ): HttpResponseFor<PageVersion> = getLandingPageRevision(params, RequestOptions.none())

        /** @see getLandingPageRevision */
        @MustBeClosed
        fun getLandingPageRevision(
            params: RevisionGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion>

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions`, but is otherwise the same as
         * [RevisionService.listLandingPageRevisions].
         */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String
        ): HttpResponseFor<RevisionListLandingPageRevisionsPage> =
            listLandingPageRevisions(objectId, RevisionListLandingPageRevisionsParams.none())

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String,
            params: RevisionListLandingPageRevisionsParams =
                RevisionListLandingPageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevisionListLandingPageRevisionsPage> =
            listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String,
            params: RevisionListLandingPageRevisionsParams =
                RevisionListLandingPageRevisionsParams.none(),
        ): HttpResponseFor<RevisionListLandingPageRevisionsPage> =
            listLandingPageRevisions(objectId, params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            params: RevisionListLandingPageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevisionListLandingPageRevisionsPage>

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            params: RevisionListLandingPageRevisionsParams
        ): HttpResponseFor<RevisionListLandingPageRevisionsPage> =
            listLandingPageRevisions(params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RevisionListLandingPageRevisionsPage> =
            listLandingPageRevisions(
                objectId,
                RevisionListLandingPageRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [RevisionService.restoreLandingPageRevision].
         */
        @MustBeClosed
        fun restoreLandingPageRevision(
            revisionId: String,
            params: RevisionRestoreLandingPageRevisionParams,
        ): HttpResponseFor<PagesPage> =
            restoreLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            revisionId: String,
            params: RevisionRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            restoreLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            params: RevisionRestoreLandingPageRevisionParams
        ): HttpResponseFor<PagesPage> = restoreLandingPageRevision(params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            params: RevisionRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but
         * is otherwise the same as [RevisionService.restoreLandingPageRevisionToDraft].
         */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreLandingPageRevisionToDraftParams,
        ): HttpResponseFor<PagesPage> =
            restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            restoreLandingPageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            params: RevisionRestoreLandingPageRevisionToDraftParams
        ): HttpResponseFor<PagesPage> =
            restoreLandingPageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            params: RevisionRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>
    }
}
