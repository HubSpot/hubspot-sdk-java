// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PageData
import com.hubspot.sdk.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageListLandingPageRevisionsPage
import com.hubspot.sdk.models.cms.pages.PageListLandingPageRevisionsParams
import com.hubspot.sdk.models.cms.pages.PageListSitePageRevisionsPage
import com.hubspot.sdk.models.cms.pages.PageListSitePageRevisionsParams
import com.hubspot.sdk.models.cms.pages.PageResetSitePageDraftParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.services.blocking.cms.pages.ABTestService
import com.hubspot.sdk.services.blocking.cms.pages.BatchService
import com.hubspot.sdk.services.blocking.cms.pages.FolderService
import com.hubspot.sdk.services.blocking.cms.pages.LandingPageService
import com.hubspot.sdk.services.blocking.cms.pages.MultiLanguageService
import com.hubspot.sdk.services.blocking.cms.pages.WebsitePageService
import java.util.function.Consumer

interface PageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService

    fun aBTests(): ABTestService

    fun batch(): BatchService

    fun folders(): FolderService

    fun landingPages(): LandingPageService

    fun multiLanguage(): MultiLanguageService

    fun websitePages(): WebsitePageService

    /** Retrieve a previous version of a landing page, specified by page ID and revision ID. */
    fun getLandingPageRevision(
        revisionId: String,
        params: PageGetLandingPageRevisionParams,
    ): PageVersion = getLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        revisionId: String,
        params: PageGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion =
        getLandingPageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(params: PageGetLandingPageRevisionParams): PageVersion =
        getLandingPageRevision(params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        params: PageGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion

    /** Retrieve a previous version of a website page by the revision ID. */
    fun getSitePageRevision(
        revisionId: String,
        params: PageGetSitePageRevisionParams,
    ): PageVersion = getSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        revisionId: String,
        params: PageGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion =
        getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getSitePageRevision */
    fun getSitePageRevision(params: PageGetSitePageRevisionParams): PageVersion =
        getSitePageRevision(params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        params: PageGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion

    /** Retrieve all the previous versions of a landing page, specified by page ID. */
    fun listLandingPageRevisions(objectId: String): PageListLandingPageRevisionsPage =
        listLandingPageRevisions(objectId, PageListLandingPageRevisionsParams.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageListLandingPageRevisionsPage =
        listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
    ): PageListLandingPageRevisionsPage =
        listLandingPageRevisions(objectId, params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: PageListLandingPageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageListLandingPageRevisionsPage

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: PageListLandingPageRevisionsParams
    ): PageListLandingPageRevisionsPage = listLandingPageRevisions(params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): PageListLandingPageRevisionsPage =
        listLandingPageRevisions(
            objectId,
            PageListLandingPageRevisionsParams.none(),
            requestOptions,
        )

    /** Retrieves all the previous versions of a website page, specified by page ID. */
    fun listSitePageRevisions(objectId: String): PageListSitePageRevisionsPage =
        listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageListSitePageRevisionsPage =
        listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
    ): PageListSitePageRevisionsPage =
        listSitePageRevisions(objectId, params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: PageListSitePageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageListSitePageRevisionsPage

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: PageListSitePageRevisionsParams
    ): PageListSitePageRevisionsPage = listSitePageRevisions(params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): PageListSitePageRevisionsPage =
        listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetSitePageDraft(objectId: String) =
        resetSitePageDraft(objectId, PageResetSitePageDraftParams.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
    ) = resetSitePageDraft(objectId, params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        params: PageResetSitePageDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(params: PageResetSitePageDraftParams) =
        resetSitePageDraft(params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(objectId: String, requestOptions: RequestOptions) =
        resetSitePageDraft(objectId, PageResetSitePageDraftParams.none(), requestOptions)

    /** Restores a previous version of a landing page, specified by page ID and revision ID. */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: PageRestoreLandingPageRevisionParams,
    ): PageData = restoreLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData =
        restoreLandingPageRevision(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(params: PageRestoreLandingPageRevisionParams): PageData =
        restoreLandingPageRevision(params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData

    /** Specify a previous version of a landing page to set as the page draft. */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreLandingPageRevisionToDraftParams,
    ): PageData = restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData =
        restoreLandingPageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams
    ): PageData = restoreLandingPageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData

    /** Restores a website page to a previous version, specified by page ID and version ID. */
    fun restoreSitePageRevision(
        revisionId: String,
        params: PageRestoreSitePageRevisionParams,
    ): PageData = restoreSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        revisionId: String,
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData =
        restoreSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(params: PageRestoreSitePageRevisionParams): PageData =
        restoreSitePageRevision(params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData

    /**
     * Takes a specified version of a website page and sets it as the new draft version of the page.
     */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreSitePageRevisionToDraftParams,
    ): PageData = restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData =
        restoreSitePageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(params: PageRestoreSitePageRevisionToDraftParams): PageData =
        restoreSitePageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageData

    /** A view of [PageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService.WithRawResponse

        fun aBTests(): ABTestService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun folders(): FolderService.WithRawResponse

        fun landingPages(): LandingPageService.WithRawResponse

        fun multiLanguage(): MultiLanguageService.WithRawResponse

        fun websitePages(): WebsitePageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [PageService.getLandingPageRevision].
         */
        @MustBeClosed
        fun getLandingPageRevision(
            revisionId: String,
            params: PageGetLandingPageRevisionParams,
        ): HttpResponseFor<PageVersion> =
            getLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see getLandingPageRevision */
        @MustBeClosed
        fun getLandingPageRevision(
            revisionId: String,
            params: PageGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion> =
            getLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see getLandingPageRevision */
        @MustBeClosed
        fun getLandingPageRevision(
            params: PageGetLandingPageRevisionParams
        ): HttpResponseFor<PageVersion> = getLandingPageRevision(params, RequestOptions.none())

        /** @see getLandingPageRevision */
        @MustBeClosed
        fun getLandingPageRevision(
            params: PageGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion>

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [PageService.getSitePageRevision].
         */
        @MustBeClosed
        fun getSitePageRevision(
            revisionId: String,
            params: PageGetSitePageRevisionParams,
        ): HttpResponseFor<PageVersion> =
            getSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see getSitePageRevision */
        @MustBeClosed
        fun getSitePageRevision(
            revisionId: String,
            params: PageGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion> =
            getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getSitePageRevision */
        @MustBeClosed
        fun getSitePageRevision(
            params: PageGetSitePageRevisionParams
        ): HttpResponseFor<PageVersion> = getSitePageRevision(params, RequestOptions.none())

        /** @see getSitePageRevision */
        @MustBeClosed
        fun getSitePageRevision(
            params: PageGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion>

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions`, but is otherwise the same as
         * [PageService.listLandingPageRevisions].
         */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String
        ): HttpResponseFor<PageListLandingPageRevisionsPage> =
            listLandingPageRevisions(objectId, PageListLandingPageRevisionsParams.none())

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String,
            params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageListLandingPageRevisionsPage> =
            listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String,
            params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
        ): HttpResponseFor<PageListLandingPageRevisionsPage> =
            listLandingPageRevisions(objectId, params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            params: PageListLandingPageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageListLandingPageRevisionsPage>

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            params: PageListLandingPageRevisionsParams
        ): HttpResponseFor<PageListLandingPageRevisionsPage> =
            listLandingPageRevisions(params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        @MustBeClosed
        fun listLandingPageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageListLandingPageRevisionsPage> =
            listLandingPageRevisions(
                objectId,
                PageListLandingPageRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/revisions`,
         * but is otherwise the same as [PageService.listSitePageRevisions].
         */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String
        ): HttpResponseFor<PageListSitePageRevisionsPage> =
            listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none())

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String,
            params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageListSitePageRevisionsPage> =
            listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String,
            params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
        ): HttpResponseFor<PageListSitePageRevisionsPage> =
            listSitePageRevisions(objectId, params, RequestOptions.none())

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            params: PageListSitePageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageListSitePageRevisionsPage>

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            params: PageListSitePageRevisionsParams
        ): HttpResponseFor<PageListSitePageRevisionsPage> =
            listSitePageRevisions(params, RequestOptions.none())

        /** @see listSitePageRevisions */
        @MustBeClosed
        fun listSitePageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageListSitePageRevisionsPage> =
            listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [PageService.resetSitePageDraft].
         */
        @MustBeClosed
        fun resetSitePageDraft(objectId: String): HttpResponse =
            resetSitePageDraft(objectId, PageResetSitePageDraftParams.none())

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(
            objectId: String,
            params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(
            objectId: String,
            params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
        ): HttpResponse = resetSitePageDraft(objectId, params, RequestOptions.none())

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(
            params: PageResetSitePageDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(params: PageResetSitePageDraftParams): HttpResponse =
            resetSitePageDraft(params, RequestOptions.none())

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetSitePageDraft(objectId, PageResetSitePageDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [PageService.restoreLandingPageRevision].
         */
        @MustBeClosed
        fun restoreLandingPageRevision(
            revisionId: String,
            params: PageRestoreLandingPageRevisionParams,
        ): HttpResponseFor<PageData> =
            restoreLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            revisionId: String,
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData> =
            restoreLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams
        ): HttpResponseFor<PageData> = restoreLandingPageRevision(params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but
         * is otherwise the same as [PageService.restoreLandingPageRevisionToDraft].
         */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreLandingPageRevisionToDraftParams,
        ): HttpResponseFor<PageData> =
            restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData> =
            restoreLandingPageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams
        ): HttpResponseFor<PageData> =
            restoreLandingPageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [PageService.restoreSitePageRevision].
         */
        @MustBeClosed
        fun restoreSitePageRevision(
            revisionId: String,
            params: PageRestoreSitePageRevisionParams,
        ): HttpResponseFor<PageData> =
            restoreSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            revisionId: String,
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData> =
            restoreSitePageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams
        ): HttpResponseFor<PageData> = restoreSitePageRevision(params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [PageService.restoreSitePageRevisionToDraft].
         */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreSitePageRevisionToDraftParams,
        ): HttpResponseFor<PageData> =
            restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData> =
            restoreSitePageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams
        ): HttpResponseFor<PageData> = restoreSitePageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageData>
    }
}
