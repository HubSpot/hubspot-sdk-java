// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.landingpages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionListLandingPageRevisionsPageAsync
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionListLandingPageRevisionsParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionToDraftParams
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

    /** Retrieve a previous version of a landing page, specified by page ID and revision ID. */
    fun getLandingPageRevision(
        revisionId: String,
        params: RevisionGetLandingPageRevisionParams,
    ): CompletableFuture<PageVersion> =
        getLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        revisionId: String,
        params: RevisionGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion> =
        getLandingPageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        params: RevisionGetLandingPageRevisionParams
    ): CompletableFuture<PageVersion> = getLandingPageRevision(params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        params: RevisionGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion>

    /** Retrieve all the previous versions of a landing page, specified by page ID. */
    fun listLandingPageRevisions(
        objectId: String
    ): CompletableFuture<RevisionListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(objectId, RevisionListLandingPageRevisionsParams.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: RevisionListLandingPageRevisionsParams =
            RevisionListLandingPageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: RevisionListLandingPageRevisionsParams =
            RevisionListLandingPageRevisionsParams.none(),
    ): CompletableFuture<RevisionListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(objectId, params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: RevisionListLandingPageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RevisionListLandingPageRevisionsPageAsync>

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: RevisionListLandingPageRevisionsParams
    ): CompletableFuture<RevisionListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RevisionListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(
            objectId,
            RevisionListLandingPageRevisionsParams.none(),
            requestOptions,
        )

    /** Restores a previous version of a landing page, specified by page ID and revision ID. */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: RevisionRestoreLandingPageRevisionParams,
    ): CompletableFuture<PagesPage> =
        restoreLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: RevisionRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        restoreLandingPageRevision(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        params: RevisionRestoreLandingPageRevisionParams
    ): CompletableFuture<PagesPage> = restoreLandingPageRevision(params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        params: RevisionRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** Specify a previous version of a landing page to set as the page draft. */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreLandingPageRevisionToDraftParams,
    ): CompletableFuture<PagesPage> =
        restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: RevisionRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        restoreLandingPageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: RevisionRestoreLandingPageRevisionToDraftParams
    ): CompletableFuture<PagesPage> =
        restoreLandingPageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: RevisionRestoreLandingPageRevisionToDraftParams,
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
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [RevisionServiceAsync.getLandingPageRevision].
         */
        fun getLandingPageRevision(
            revisionId: String,
            params: RevisionGetLandingPageRevisionParams,
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see getLandingPageRevision */
        fun getLandingPageRevision(
            revisionId: String,
            params: RevisionGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see getLandingPageRevision */
        fun getLandingPageRevision(
            params: RevisionGetLandingPageRevisionParams
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getLandingPageRevision(params, RequestOptions.none())

        /** @see getLandingPageRevision */
        fun getLandingPageRevision(
            params: RevisionGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>>

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions`, but is otherwise the same as
         * [RevisionServiceAsync.listLandingPageRevisions].
         */
        fun listLandingPageRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<RevisionListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(objectId, RevisionListLandingPageRevisionsParams.none())

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            objectId: String,
            params: RevisionListLandingPageRevisionsParams =
                RevisionListLandingPageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            objectId: String,
            params: RevisionListLandingPageRevisionsParams =
                RevisionListLandingPageRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(objectId, params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            params: RevisionListLandingPageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RevisionListLandingPageRevisionsPageAsync>>

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            params: RevisionListLandingPageRevisionsParams
        ): CompletableFuture<HttpResponseFor<RevisionListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RevisionListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(
                objectId,
                RevisionListLandingPageRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [RevisionServiceAsync.restoreLandingPageRevision].
         */
        fun restoreLandingPageRevision(
            revisionId: String,
            params: RevisionRestoreLandingPageRevisionParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        fun restoreLandingPageRevision(
            revisionId: String,
            params: RevisionRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevision */
        fun restoreLandingPageRevision(
            params: RevisionRestoreLandingPageRevisionParams
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreLandingPageRevision(params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        fun restoreLandingPageRevision(
            params: RevisionRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but
         * is otherwise the same as [RevisionServiceAsync.restoreLandingPageRevisionToDraft].
         */
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreLandingPageRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: RevisionRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreLandingPageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevisionToDraft */
        fun restoreLandingPageRevisionToDraft(
            params: RevisionRestoreLandingPageRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            restoreLandingPageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        fun restoreLandingPageRevisionToDraft(
            params: RevisionRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>
    }
}
