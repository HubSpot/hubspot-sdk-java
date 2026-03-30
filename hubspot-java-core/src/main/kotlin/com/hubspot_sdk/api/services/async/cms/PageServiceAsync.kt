// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

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
import com.hubspot_sdk.api.models.cms.pages.PageListRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.pages.PageListRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.PageListSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageQueryLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageQueryLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageQuerySitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageVersion
import com.hubspot_sdk.api.services.async.cms.pages.ABTestServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.BatchServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.FolderServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.LandingPageServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.MultiLanguageServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.WebsitePageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync

    fun aBTests(): ABTestServiceAsync

    fun batch(): BatchServiceAsync

    fun folders(): FolderServiceAsync

    fun landingPages(): LandingPageServiceAsync

    fun multiLanguage(): MultiLanguageServiceAsync

    fun websitePages(): WebsitePageServiceAsync

    /** Retrieve a previous version of a website page by the revision ID. */
    fun getRevision(
        revisionId: String,
        params: PageGetRevisionParams,
    ): CompletableFuture<PageVersion> = getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: PageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion> =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: PageGetRevisionParams): CompletableFuture<PageVersion> =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: PageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion>

    fun listLandingPageFolders(): CompletableFuture<CursorPagedResultContentFolderLong> =
        listLandingPageFolders(PageListLandingPageFoldersParams.none())

    /** @see listLandingPageFolders */
    fun listLandingPageFolders(
        params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultContentFolderLong>

    /** @see listLandingPageFolders */
    fun listLandingPageFolders(
        params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none()
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        listLandingPageFolders(params, RequestOptions.none())

    /** @see listLandingPageFolders */
    fun listLandingPageFolders(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        listLandingPageFolders(PageListLandingPageFoldersParams.none(), requestOptions)

    fun listLandingPages(): CompletableFuture<CursorPagedResultPageLong> =
        listLandingPages(PageListLandingPagesParams.none())

    /** @see listLandingPages */
    fun listLandingPages(
        params: PageListLandingPagesParams = PageListLandingPagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see listLandingPages */
    fun listLandingPages(
        params: PageListLandingPagesParams = PageListLandingPagesParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> =
        listLandingPages(params, RequestOptions.none())

    /** @see listLandingPages */
    fun listLandingPages(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultPageLong> =
        listLandingPages(PageListLandingPagesParams.none(), requestOptions)

    /** Retrieves all the previous versions of a website page, specified by page ID. */
    fun listRevisions(objectId: String): CompletableFuture<PageListRevisionsPageAsync> =
        listRevisions(objectId, PageListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: PageListRevisionsParams = PageListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageListRevisionsPageAsync> =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: PageListRevisionsParams = PageListRevisionsParams.none(),
    ): CompletableFuture<PageListRevisionsPageAsync> =
        listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: PageListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageListRevisionsPageAsync>

    /** @see listRevisions */
    fun listRevisions(
        params: PageListRevisionsParams
    ): CompletableFuture<PageListRevisionsPageAsync> = listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageListRevisionsPageAsync> =
        listRevisions(objectId, PageListRevisionsParams.none(), requestOptions)

    fun listSitePages(): CompletableFuture<CursorPagedResultPageLong> =
        listSitePages(PageListSitePagesParams.none())

    /** @see listSitePages */
    fun listSitePages(
        params: PageListSitePagesParams = PageListSitePagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see listSitePages */
    fun listSitePages(
        params: PageListSitePagesParams = PageListSitePagesParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> = listSitePages(params, RequestOptions.none())

    /** @see listSitePages */
    fun listSitePages(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultPageLong> =
        listSitePages(PageListSitePagesParams.none(), requestOptions)

    fun queryLandingPageFolders(): CompletableFuture<CursorPagedResultContentFolderLong> =
        queryLandingPageFolders(PageQueryLandingPageFoldersParams.none())

    /** @see queryLandingPageFolders */
    fun queryLandingPageFolders(
        params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultContentFolderLong>

    /** @see queryLandingPageFolders */
    fun queryLandingPageFolders(
        params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none()
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        queryLandingPageFolders(params, RequestOptions.none())

    /** @see queryLandingPageFolders */
    fun queryLandingPageFolders(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        queryLandingPageFolders(PageQueryLandingPageFoldersParams.none(), requestOptions)

    fun queryLandingPages(): CompletableFuture<CursorPagedResultPageLong> =
        queryLandingPages(PageQueryLandingPagesParams.none())

    /** @see queryLandingPages */
    fun queryLandingPages(
        params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see queryLandingPages */
    fun queryLandingPages(
        params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> =
        queryLandingPages(params, RequestOptions.none())

    /** @see queryLandingPages */
    fun queryLandingPages(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultPageLong> =
        queryLandingPages(PageQueryLandingPagesParams.none(), requestOptions)

    fun querySitePages(): CompletableFuture<CursorPagedResultPageLong> =
        querySitePages(PageQuerySitePagesParams.none())

    /** @see querySitePages */
    fun querySitePages(
        params: PageQuerySitePagesParams = PageQuerySitePagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see querySitePages */
    fun querySitePages(
        params: PageQuerySitePagesParams = PageQuerySitePagesParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> = querySitePages(params, RequestOptions.none())

    /** @see querySitePages */
    fun querySitePages(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultPageLong> =
        querySitePages(PageQuerySitePagesParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetDraft(objectId: String): CompletableFuture<Void?> =
        resetDraft(objectId, PageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PageResetDraftParams = PageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PageResetDraftParams = PageResetDraftParams.none(),
    ): CompletableFuture<Void?> = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: PageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetDraft */
    fun resetDraft(params: PageResetDraftParams): CompletableFuture<Void?> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resetDraft(objectId, PageResetDraftParams.none(), requestOptions)

    /** Restores a website page to a previous version, specified by page ID and version ID. */
    fun restoreRevision(
        revisionId: String,
        params: PageRestoreRevisionParams,
    ): CompletableFuture<Page> = restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: PageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: PageRestoreRevisionParams): CompletableFuture<Page> =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: PageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Takes a specified version of a website page and sets it as the new draft version of the page.
     */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: PageRestoreRevisionToDraftParams,
    ): CompletableFuture<Page> = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: PageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(params: PageRestoreRevisionToDraftParams): CompletableFuture<Page> =
        restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: PageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** A view of [PageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync.WithRawResponse

        fun aBTests(): ABTestServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun folders(): FolderServiceAsync.WithRawResponse

        fun landingPages(): LandingPageServiceAsync.WithRawResponse

        fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse

        fun websitePages(): WebsitePageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [PageServiceAsync.getRevision].
         */
        fun getRevision(
            revisionId: String,
            params: PageGetRevisionParams,
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            revisionId: String,
            params: PageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        fun getRevision(
            params: PageGetRevisionParams
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            params: PageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders/cursor`,
         * but is otherwise the same as [PageServiceAsync.listLandingPageFolders].
         */
        fun listLandingPageFolders():
            CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            listLandingPageFolders(PageListLandingPageFoldersParams.none())

        /** @see listLandingPageFolders */
        fun listLandingPageFolders(
            params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>>

        /** @see listLandingPageFolders */
        fun listLandingPageFolders(
            params: PageListLandingPageFoldersParams = PageListLandingPageFoldersParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            listLandingPageFolders(params, RequestOptions.none())

        /** @see listLandingPageFolders */
        fun listLandingPageFolders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            listLandingPageFolders(PageListLandingPageFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor`, but is
         * otherwise the same as [PageServiceAsync.listLandingPages].
         */
        fun listLandingPages(): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            listLandingPages(PageListLandingPagesParams.none())

        /** @see listLandingPages */
        fun listLandingPages(
            params: PageListLandingPagesParams = PageListLandingPagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see listLandingPages */
        fun listLandingPages(
            params: PageListLandingPagesParams = PageListLandingPagesParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            listLandingPages(params, RequestOptions.none())

        /** @see listLandingPages */
        fun listLandingPages(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            listLandingPages(PageListLandingPagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/revisions`,
         * but is otherwise the same as [PageServiceAsync.listRevisions].
         */
        fun listRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<PageListRevisionsPageAsync>> =
            listRevisions(objectId, PageListRevisionsParams.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: PageListRevisionsParams = PageListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageListRevisionsPageAsync>> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: PageListRevisionsParams = PageListRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PageListRevisionsPageAsync>> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            params: PageListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageListRevisionsPageAsync>>

        /** @see listRevisions */
        fun listRevisions(
            params: PageListRevisionsParams
        ): CompletableFuture<HttpResponseFor<PageListRevisionsPageAsync>> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageListRevisionsPageAsync>> =
            listRevisions(objectId, PageListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor`, but is
         * otherwise the same as [PageServiceAsync.listSitePages].
         */
        fun listSitePages(): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            listSitePages(PageListSitePagesParams.none())

        /** @see listSitePages */
        fun listSitePages(
            params: PageListSitePagesParams = PageListSitePagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see listSitePages */
        fun listSitePages(
            params: PageListSitePagesParams = PageListSitePagesParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            listSitePages(params, RequestOptions.none())

        /** @see listSitePages */
        fun listSitePages(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            listSitePages(PageListSitePagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/cursor/query`, but is otherwise the same as
         * [PageServiceAsync.queryLandingPageFolders].
         */
        fun queryLandingPageFolders():
            CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            queryLandingPageFolders(PageQueryLandingPageFoldersParams.none())

        /** @see queryLandingPageFolders */
        fun queryLandingPageFolders(
            params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>>

        /** @see queryLandingPageFolders */
        fun queryLandingPageFolders(
            params: PageQueryLandingPageFoldersParams = PageQueryLandingPageFoldersParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            queryLandingPageFolders(params, RequestOptions.none())

        /** @see queryLandingPageFolders */
        fun queryLandingPageFolders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            queryLandingPageFolders(PageQueryLandingPageFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor/query`, but
         * is otherwise the same as [PageServiceAsync.queryLandingPages].
         */
        fun queryLandingPages(): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            queryLandingPages(PageQueryLandingPagesParams.none())

        /** @see queryLandingPages */
        fun queryLandingPages(
            params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see queryLandingPages */
        fun queryLandingPages(
            params: PageQueryLandingPagesParams = PageQueryLandingPagesParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            queryLandingPages(params, RequestOptions.none())

        /** @see queryLandingPages */
        fun queryLandingPages(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            queryLandingPages(PageQueryLandingPagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor/query`, but is
         * otherwise the same as [PageServiceAsync.querySitePages].
         */
        fun querySitePages(): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            querySitePages(PageQuerySitePagesParams.none())

        /** @see querySitePages */
        fun querySitePages(
            params: PageQuerySitePagesParams = PageQuerySitePagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see querySitePages */
        fun querySitePages(
            params: PageQuerySitePagesParams = PageQuerySitePagesParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            querySitePages(params, RequestOptions.none())

        /** @see querySitePages */
        fun querySitePages(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            querySitePages(PageQuerySitePagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [PageServiceAsync.resetDraft].
         */
        fun resetDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetDraft(objectId, PageResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: PageResetDraftParams = PageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: PageResetDraftParams = PageResetDraftParams.none(),
        ): CompletableFuture<HttpResponse> = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: PageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetDraft */
        fun resetDraft(params: PageResetDraftParams): CompletableFuture<HttpResponse> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetDraft(objectId, PageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [PageServiceAsync.restoreRevision].
         */
        fun restoreRevision(
            revisionId: String,
            params: PageRestoreRevisionParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            revisionId: String,
            params: PageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        fun restoreRevision(
            params: PageRestoreRevisionParams
        ): CompletableFuture<HttpResponseFor<Page>> = restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            params: PageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [PageServiceAsync.restoreRevisionToDraft].
         */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: PageRestoreRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: PageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: PageRestoreRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: PageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>
    }
}
