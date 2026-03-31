// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.pages.CursorPagedResultContentFolderLong
import com.hubspot_sdk.api.models.cms.pages.CursorPagedResultPageLong
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageFoldersByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPagesByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePagesByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPageRevisionsPage
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPageRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.PageListSitePageRevisionsPage
import com.hubspot_sdk.api.models.cms.pages.PageListSitePageRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.PageResetSitePageDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageVersion
import com.hubspot_sdk.api.services.blocking.cms.pages.ABTestService
import com.hubspot_sdk.api.services.blocking.cms.pages.BatchService
import com.hubspot_sdk.api.services.blocking.cms.pages.FolderService
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageService
import com.hubspot_sdk.api.services.blocking.cms.pages.MultiLanguageService
import com.hubspot_sdk.api.services.blocking.cms.pages.WebsitePageService
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

    fun getLandingPageFolders(): CursorPagedResultContentFolderLong =
        getLandingPageFolders(PageGetLandingPageFoldersParams.none())

    /** @see getLandingPageFolders */
    fun getLandingPageFolders(
        params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultContentFolderLong

    /** @see getLandingPageFolders */
    fun getLandingPageFolders(
        params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none()
    ): CursorPagedResultContentFolderLong = getLandingPageFolders(params, RequestOptions.none())

    /** @see getLandingPageFolders */
    fun getLandingPageFolders(requestOptions: RequestOptions): CursorPagedResultContentFolderLong =
        getLandingPageFolders(PageGetLandingPageFoldersParams.none(), requestOptions)

    fun getLandingPageFoldersByQuery(): CursorPagedResultContentFolderLong =
        getLandingPageFoldersByQuery(PageGetLandingPageFoldersByQueryParams.none())

    /** @see getLandingPageFoldersByQuery */
    fun getLandingPageFoldersByQuery(
        params: PageGetLandingPageFoldersByQueryParams =
            PageGetLandingPageFoldersByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultContentFolderLong

    /** @see getLandingPageFoldersByQuery */
    fun getLandingPageFoldersByQuery(
        params: PageGetLandingPageFoldersByQueryParams =
            PageGetLandingPageFoldersByQueryParams.none()
    ): CursorPagedResultContentFolderLong =
        getLandingPageFoldersByQuery(params, RequestOptions.none())

    /** @see getLandingPageFoldersByQuery */
    fun getLandingPageFoldersByQuery(
        requestOptions: RequestOptions
    ): CursorPagedResultContentFolderLong =
        getLandingPageFoldersByQuery(PageGetLandingPageFoldersByQueryParams.none(), requestOptions)

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

    fun getLandingPages(): CursorPagedResultPageLong =
        getLandingPages(PageGetLandingPagesParams.none())

    /** @see getLandingPages */
    fun getLandingPages(
        params: PageGetLandingPagesParams = PageGetLandingPagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see getLandingPages */
    fun getLandingPages(
        params: PageGetLandingPagesParams = PageGetLandingPagesParams.none()
    ): CursorPagedResultPageLong = getLandingPages(params, RequestOptions.none())

    /** @see getLandingPages */
    fun getLandingPages(requestOptions: RequestOptions): CursorPagedResultPageLong =
        getLandingPages(PageGetLandingPagesParams.none(), requestOptions)

    fun getLandingPagesByQuery(): CursorPagedResultPageLong =
        getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none())

    /** @see getLandingPagesByQuery */
    fun getLandingPagesByQuery(
        params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see getLandingPagesByQuery */
    fun getLandingPagesByQuery(
        params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none()
    ): CursorPagedResultPageLong = getLandingPagesByQuery(params, RequestOptions.none())

    /** @see getLandingPagesByQuery */
    fun getLandingPagesByQuery(requestOptions: RequestOptions): CursorPagedResultPageLong =
        getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none(), requestOptions)

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

    fun getSitePages(): CursorPagedResultPageLong = getSitePages(PageGetSitePagesParams.none())

    /** @see getSitePages */
    fun getSitePages(
        params: PageGetSitePagesParams = PageGetSitePagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see getSitePages */
    fun getSitePages(
        params: PageGetSitePagesParams = PageGetSitePagesParams.none()
    ): CursorPagedResultPageLong = getSitePages(params, RequestOptions.none())

    /** @see getSitePages */
    fun getSitePages(requestOptions: RequestOptions): CursorPagedResultPageLong =
        getSitePages(PageGetSitePagesParams.none(), requestOptions)

    fun getSitePagesByQuery(): CursorPagedResultPageLong =
        getSitePagesByQuery(PageGetSitePagesByQueryParams.none())

    /** @see getSitePagesByQuery */
    fun getSitePagesByQuery(
        params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see getSitePagesByQuery */
    fun getSitePagesByQuery(
        params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none()
    ): CursorPagedResultPageLong = getSitePagesByQuery(params, RequestOptions.none())

    /** @see getSitePagesByQuery */
    fun getSitePagesByQuery(requestOptions: RequestOptions): CursorPagedResultPageLong =
        getSitePagesByQuery(PageGetSitePagesByQueryParams.none(), requestOptions)

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
    ): Page = restoreLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        restoreLandingPageRevision(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(params: PageRestoreLandingPageRevisionParams): Page =
        restoreLandingPageRevision(params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** Specify a previous version of a landing page to set as the page draft. */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreLandingPageRevisionToDraftParams,
    ): Page = restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        restoreLandingPageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams
    ): Page = restoreLandingPageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** Restores a website page to a previous version, specified by page ID and version ID. */
    fun restoreSitePageRevision(
        revisionId: String,
        params: PageRestoreSitePageRevisionParams,
    ): Page = restoreSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        revisionId: String,
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        restoreSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(params: PageRestoreSitePageRevisionParams): Page =
        restoreSitePageRevision(params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Takes a specified version of a website page and sets it as the new draft version of the page.
     */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreSitePageRevisionToDraftParams,
    ): Page = restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        restoreSitePageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(params: PageRestoreSitePageRevisionToDraftParams): Page =
        restoreSitePageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

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
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders/cursor`,
         * but is otherwise the same as [PageService.getLandingPageFolders].
         */
        @MustBeClosed
        fun getLandingPageFolders(): HttpResponseFor<CursorPagedResultContentFolderLong> =
            getLandingPageFolders(PageGetLandingPageFoldersParams.none())

        /** @see getLandingPageFolders */
        @MustBeClosed
        fun getLandingPageFolders(
            params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultContentFolderLong>

        /** @see getLandingPageFolders */
        @MustBeClosed
        fun getLandingPageFolders(
            params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none()
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            getLandingPageFolders(params, RequestOptions.none())

        /** @see getLandingPageFolders */
        @MustBeClosed
        fun getLandingPageFolders(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            getLandingPageFolders(PageGetLandingPageFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/cursor/query`, but is otherwise the same as
         * [PageService.getLandingPageFoldersByQuery].
         */
        @MustBeClosed
        fun getLandingPageFoldersByQuery(): HttpResponseFor<CursorPagedResultContentFolderLong> =
            getLandingPageFoldersByQuery(PageGetLandingPageFoldersByQueryParams.none())

        /** @see getLandingPageFoldersByQuery */
        @MustBeClosed
        fun getLandingPageFoldersByQuery(
            params: PageGetLandingPageFoldersByQueryParams =
                PageGetLandingPageFoldersByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultContentFolderLong>

        /** @see getLandingPageFoldersByQuery */
        @MustBeClosed
        fun getLandingPageFoldersByQuery(
            params: PageGetLandingPageFoldersByQueryParams =
                PageGetLandingPageFoldersByQueryParams.none()
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            getLandingPageFoldersByQuery(params, RequestOptions.none())

        /** @see getLandingPageFoldersByQuery */
        @MustBeClosed
        fun getLandingPageFoldersByQuery(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            getLandingPageFoldersByQuery(
                PageGetLandingPageFoldersByQueryParams.none(),
                requestOptions,
            )

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
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor`, but is
         * otherwise the same as [PageService.getLandingPages].
         */
        @MustBeClosed
        fun getLandingPages(): HttpResponseFor<CursorPagedResultPageLong> =
            getLandingPages(PageGetLandingPagesParams.none())

        /** @see getLandingPages */
        @MustBeClosed
        fun getLandingPages(
            params: PageGetLandingPagesParams = PageGetLandingPagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see getLandingPages */
        @MustBeClosed
        fun getLandingPages(
            params: PageGetLandingPagesParams = PageGetLandingPagesParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> =
            getLandingPages(params, RequestOptions.none())

        /** @see getLandingPages */
        @MustBeClosed
        fun getLandingPages(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            getLandingPages(PageGetLandingPagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor/query`, but
         * is otherwise the same as [PageService.getLandingPagesByQuery].
         */
        @MustBeClosed
        fun getLandingPagesByQuery(): HttpResponseFor<CursorPagedResultPageLong> =
            getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none())

        /** @see getLandingPagesByQuery */
        @MustBeClosed
        fun getLandingPagesByQuery(
            params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see getLandingPagesByQuery */
        @MustBeClosed
        fun getLandingPagesByQuery(
            params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> =
            getLandingPagesByQuery(params, RequestOptions.none())

        /** @see getLandingPagesByQuery */
        @MustBeClosed
        fun getLandingPagesByQuery(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor`, but is
         * otherwise the same as [PageService.getSitePages].
         */
        @MustBeClosed
        fun getSitePages(): HttpResponseFor<CursorPagedResultPageLong> =
            getSitePages(PageGetSitePagesParams.none())

        /** @see getSitePages */
        @MustBeClosed
        fun getSitePages(
            params: PageGetSitePagesParams = PageGetSitePagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see getSitePages */
        @MustBeClosed
        fun getSitePages(
            params: PageGetSitePagesParams = PageGetSitePagesParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> = getSitePages(params, RequestOptions.none())

        /** @see getSitePages */
        @MustBeClosed
        fun getSitePages(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            getSitePages(PageGetSitePagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor/query`, but is
         * otherwise the same as [PageService.getSitePagesByQuery].
         */
        @MustBeClosed
        fun getSitePagesByQuery(): HttpResponseFor<CursorPagedResultPageLong> =
            getSitePagesByQuery(PageGetSitePagesByQueryParams.none())

        /** @see getSitePagesByQuery */
        @MustBeClosed
        fun getSitePagesByQuery(
            params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see getSitePagesByQuery */
        @MustBeClosed
        fun getSitePagesByQuery(
            params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> =
            getSitePagesByQuery(params, RequestOptions.none())

        /** @see getSitePagesByQuery */
        @MustBeClosed
        fun getSitePagesByQuery(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            getSitePagesByQuery(PageGetSitePagesByQueryParams.none(), requestOptions)

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
        ): HttpResponseFor<Page> =
            restoreLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            revisionId: String,
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams
        ): HttpResponseFor<Page> = restoreLandingPageRevision(params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        @MustBeClosed
        fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but
         * is otherwise the same as [PageService.restoreLandingPageRevisionToDraft].
         */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreLandingPageRevisionToDraftParams,
        ): HttpResponseFor<Page> =
            restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreLandingPageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams
        ): HttpResponseFor<Page> = restoreLandingPageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        @MustBeClosed
        fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [PageService.restoreSitePageRevision].
         */
        @MustBeClosed
        fun restoreSitePageRevision(
            revisionId: String,
            params: PageRestoreSitePageRevisionParams,
        ): HttpResponseFor<Page> =
            restoreSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            revisionId: String,
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreSitePageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams
        ): HttpResponseFor<Page> = restoreSitePageRevision(params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        @MustBeClosed
        fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [PageService.restoreSitePageRevisionToDraft].
         */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreSitePageRevisionToDraftParams,
        ): HttpResponseFor<Page> =
            restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreSitePageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams
        ): HttpResponseFor<Page> = restoreSitePageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        @MustBeClosed
        fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>
    }
}
