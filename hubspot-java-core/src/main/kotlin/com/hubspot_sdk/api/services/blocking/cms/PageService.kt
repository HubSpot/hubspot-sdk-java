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
import com.hubspot_sdk.api.models.cms.pages.PageGetRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageListRevisionsPage
import com.hubspot_sdk.api.models.cms.pages.PageListRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.PageListSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageQueryLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageQueryLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageQuerySitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreRevisionToDraftParams
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

    /** Retrieve a previous version of a website page by the revision ID. */
    fun getRevision(revisionId: String, params: PageGetRevisionParams): PageVersion =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: PageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion = getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: PageGetRevisionParams): PageVersion =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: PageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageVersion

    fun listLandingPageFolders(): CursorPagedResultContentFolderLong =
        listLandingPageFolders(PageListLandingPageFoldersParams.none())

    /** @see listLandingPageFolders */
    fun listLandingPageFolders(
        params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultContentFolderLong

    /** @see listLandingPageFolders */
    fun listLandingPageFolders(
        params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none()
    ): CursorPagedResultContentFolderLong = listLandingPageFolders(params, RequestOptions.none())

    /** @see listLandingPageFolders */
    fun listLandingPageFolders(requestOptions: RequestOptions): CursorPagedResultContentFolderLong =
        listLandingPageFolders(PageListLandingPageFoldersParams.none(), requestOptions)

    fun listLandingPages(): CursorPagedResultPageLong =
        listLandingPages(PageListLandingPagesParams.none())

    /** @see listLandingPages */
    fun listLandingPages(
        params: PageListLandingPagesParams = PageListLandingPagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see listLandingPages */
    fun listLandingPages(
        params: PageListLandingPagesParams = PageListLandingPagesParams.none()
    ): CursorPagedResultPageLong = listLandingPages(params, RequestOptions.none())

    /** @see listLandingPages */
    fun listLandingPages(requestOptions: RequestOptions): CursorPagedResultPageLong =
        listLandingPages(PageListLandingPagesParams.none(), requestOptions)

    /** Retrieves all the previous versions of a website page, specified by page ID. */
    fun listRevisions(objectId: String): PageListRevisionsPage =
        listRevisions(objectId, PageListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: PageListRevisionsParams = PageListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageListRevisionsPage =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: PageListRevisionsParams = PageListRevisionsParams.none(),
    ): PageListRevisionsPage = listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: PageListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageListRevisionsPage

    /** @see listRevisions */
    fun listRevisions(params: PageListRevisionsParams): PageListRevisionsPage =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(objectId: String, requestOptions: RequestOptions): PageListRevisionsPage =
        listRevisions(objectId, PageListRevisionsParams.none(), requestOptions)

    fun listSitePages(): CursorPagedResultPageLong = listSitePages(PageListSitePagesParams.none())

    /** @see listSitePages */
    fun listSitePages(
        params: PageListSitePagesParams = PageListSitePagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see listSitePages */
    fun listSitePages(
        params: PageListSitePagesParams = PageListSitePagesParams.none()
    ): CursorPagedResultPageLong = listSitePages(params, RequestOptions.none())

    /** @see listSitePages */
    fun listSitePages(requestOptions: RequestOptions): CursorPagedResultPageLong =
        listSitePages(PageListSitePagesParams.none(), requestOptions)

    fun queryLandingPageFolders(): CursorPagedResultContentFolderLong =
        queryLandingPageFolders(PageQueryLandingPageFoldersParams.none())

    /** @see queryLandingPageFolders */
    fun queryLandingPageFolders(
        params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultContentFolderLong

    /** @see queryLandingPageFolders */
    fun queryLandingPageFolders(
        params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none()
    ): CursorPagedResultContentFolderLong = queryLandingPageFolders(params, RequestOptions.none())

    /** @see queryLandingPageFolders */
    fun queryLandingPageFolders(
        requestOptions: RequestOptions
    ): CursorPagedResultContentFolderLong =
        queryLandingPageFolders(PageQueryLandingPageFoldersParams.none(), requestOptions)

    fun queryLandingPages(): CursorPagedResultPageLong =
        queryLandingPages(PageQueryLandingPagesParams.none())

    /** @see queryLandingPages */
    fun queryLandingPages(
        params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see queryLandingPages */
    fun queryLandingPages(
        params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none()
    ): CursorPagedResultPageLong = queryLandingPages(params, RequestOptions.none())

    /** @see queryLandingPages */
    fun queryLandingPages(requestOptions: RequestOptions): CursorPagedResultPageLong =
        queryLandingPages(PageQueryLandingPagesParams.none(), requestOptions)

    fun querySitePages(): CursorPagedResultPageLong =
        querySitePages(PageQuerySitePagesParams.none())

    /** @see querySitePages */
    fun querySitePages(
        params: PageQuerySitePagesParams = PageQuerySitePagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CursorPagedResultPageLong

    /** @see querySitePages */
    fun querySitePages(
        params: PageQuerySitePagesParams = PageQuerySitePagesParams.none()
    ): CursorPagedResultPageLong = querySitePages(params, RequestOptions.none())

    /** @see querySitePages */
    fun querySitePages(requestOptions: RequestOptions): CursorPagedResultPageLong =
        querySitePages(PageQuerySitePagesParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetDraft(objectId: String) = resetDraft(objectId, PageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PageResetDraftParams = PageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(objectId: String, params: PageResetDraftParams = PageResetDraftParams.none()) =
        resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: PageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetDraft */
    fun resetDraft(params: PageResetDraftParams) = resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions) =
        resetDraft(objectId, PageResetDraftParams.none(), requestOptions)

    /** Restores a website page to a previous version, specified by page ID and version ID. */
    fun restoreRevision(revisionId: String, params: PageRestoreRevisionParams): Page =
        restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: PageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: PageRestoreRevisionParams): Page =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: PageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Takes a specified version of a website page and sets it as the new draft version of the page.
     */
    fun restoreRevisionToDraft(revisionId: Long, params: PageRestoreRevisionToDraftParams): Page =
        restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: PageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(params: PageRestoreRevisionToDraftParams): Page =
        restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: PageRestoreRevisionToDraftParams,
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
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [PageService.getRevision].
         */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: PageGetRevisionParams,
        ): HttpResponseFor<PageVersion> = getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: PageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(params: PageGetRevisionParams): HttpResponseFor<PageVersion> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            params: PageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageVersion>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders/cursor`,
         * but is otherwise the same as [PageService.listLandingPageFolders].
         */
        @MustBeClosed
        fun listLandingPageFolders(): HttpResponseFor<CursorPagedResultContentFolderLong> =
            listLandingPageFolders(PageListLandingPageFoldersParams.none())

        /** @see listLandingPageFolders */
        @MustBeClosed
        fun listLandingPageFolders(
            params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultContentFolderLong>

        /** @see listLandingPageFolders */
        @MustBeClosed
        fun listLandingPageFolders(
            params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none()
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            listLandingPageFolders(params, RequestOptions.none())

        /** @see listLandingPageFolders */
        @MustBeClosed
        fun listLandingPageFolders(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            listLandingPageFolders(PageListLandingPageFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor`, but is
         * otherwise the same as [PageService.listLandingPages].
         */
        @MustBeClosed
        fun listLandingPages(): HttpResponseFor<CursorPagedResultPageLong> =
            listLandingPages(PageListLandingPagesParams.none())

        /** @see listLandingPages */
        @MustBeClosed
        fun listLandingPages(
            params: PageListLandingPagesParams = PageListLandingPagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see listLandingPages */
        @MustBeClosed
        fun listLandingPages(
            params: PageListLandingPagesParams = PageListLandingPagesParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> =
            listLandingPages(params, RequestOptions.none())

        /** @see listLandingPages */
        @MustBeClosed
        fun listLandingPages(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            listLandingPages(PageListLandingPagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/revisions`,
         * but is otherwise the same as [PageService.listRevisions].
         */
        @MustBeClosed
        fun listRevisions(objectId: String): HttpResponseFor<PageListRevisionsPage> =
            listRevisions(objectId, PageListRevisionsParams.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: PageListRevisionsParams = PageListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageListRevisionsPage> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: PageListRevisionsParams = PageListRevisionsParams.none(),
        ): HttpResponseFor<PageListRevisionsPage> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: PageListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageListRevisionsPage>

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(params: PageListRevisionsParams): HttpResponseFor<PageListRevisionsPage> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageListRevisionsPage> =
            listRevisions(objectId, PageListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor`, but is
         * otherwise the same as [PageService.listSitePages].
         */
        @MustBeClosed
        fun listSitePages(): HttpResponseFor<CursorPagedResultPageLong> =
            listSitePages(PageListSitePagesParams.none())

        /** @see listSitePages */
        @MustBeClosed
        fun listSitePages(
            params: PageListSitePagesParams = PageListSitePagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see listSitePages */
        @MustBeClosed
        fun listSitePages(
            params: PageListSitePagesParams = PageListSitePagesParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> = listSitePages(params, RequestOptions.none())

        /** @see listSitePages */
        @MustBeClosed
        fun listSitePages(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            listSitePages(PageListSitePagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/cursor/query`, but is otherwise the same as
         * [PageService.queryLandingPageFolders].
         */
        @MustBeClosed
        fun queryLandingPageFolders(): HttpResponseFor<CursorPagedResultContentFolderLong> =
            queryLandingPageFolders(PageQueryLandingPageFoldersParams.none())

        /** @see queryLandingPageFolders */
        @MustBeClosed
        fun queryLandingPageFolders(
            params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultContentFolderLong>

        /** @see queryLandingPageFolders */
        @MustBeClosed
        fun queryLandingPageFolders(
            params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none()
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            queryLandingPageFolders(params, RequestOptions.none())

        /** @see queryLandingPageFolders */
        @MustBeClosed
        fun queryLandingPageFolders(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultContentFolderLong> =
            queryLandingPageFolders(PageQueryLandingPageFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor/query`, but
         * is otherwise the same as [PageService.queryLandingPages].
         */
        @MustBeClosed
        fun queryLandingPages(): HttpResponseFor<CursorPagedResultPageLong> =
            queryLandingPages(PageQueryLandingPagesParams.none())

        /** @see queryLandingPages */
        @MustBeClosed
        fun queryLandingPages(
            params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see queryLandingPages */
        @MustBeClosed
        fun queryLandingPages(
            params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> =
            queryLandingPages(params, RequestOptions.none())

        /** @see queryLandingPages */
        @MustBeClosed
        fun queryLandingPages(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            queryLandingPages(PageQueryLandingPagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor/query`, but is
         * otherwise the same as [PageService.querySitePages].
         */
        @MustBeClosed
        fun querySitePages(): HttpResponseFor<CursorPagedResultPageLong> =
            querySitePages(PageQuerySitePagesParams.none())

        /** @see querySitePages */
        @MustBeClosed
        fun querySitePages(
            params: PageQuerySitePagesParams = PageQuerySitePagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CursorPagedResultPageLong>

        /** @see querySitePages */
        @MustBeClosed
        fun querySitePages(
            params: PageQuerySitePagesParams = PageQuerySitePagesParams.none()
        ): HttpResponseFor<CursorPagedResultPageLong> =
            querySitePages(params, RequestOptions.none())

        /** @see querySitePages */
        @MustBeClosed
        fun querySitePages(
            requestOptions: RequestOptions
        ): HttpResponseFor<CursorPagedResultPageLong> =
            querySitePages(PageQuerySitePagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [PageService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(objectId: String): HttpResponse =
            resetDraft(objectId, PageResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: PageResetDraftParams = PageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: PageResetDraftParams = PageResetDraftParams.none(),
        ): HttpResponse = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: PageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: PageResetDraftParams): HttpResponse =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetDraft(objectId, PageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [PageService.restoreRevision].
         */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: PageRestoreRevisionParams,
        ): HttpResponseFor<Page> = restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: PageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(params: PageRestoreRevisionParams): HttpResponseFor<Page> =
            restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            params: PageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [PageService.restoreRevisionToDraft].
         */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: PageRestoreRevisionToDraftParams,
        ): HttpResponseFor<Page> = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: PageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: PageRestoreRevisionToDraftParams
        ): HttpResponseFor<Page> = restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: PageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>
    }
}
