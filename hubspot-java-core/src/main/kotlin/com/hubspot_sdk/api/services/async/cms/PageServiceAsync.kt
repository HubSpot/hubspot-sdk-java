// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.pages.CmsPage
import com.hubspot_sdk.api.models.cms.pages.CursorPagedResultContentFolderLong
import com.hubspot_sdk.api.models.cms.pages.CursorPagedResultPageLong
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageFoldersByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPagesByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePagesByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPageRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPageRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.PageListSitePageRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.pages.PageListSitePageRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.PageResetSitePageDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
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

    fun getLandingPageFolders(): CompletableFuture<CursorPagedResultContentFolderLong> =
        getLandingPageFolders(PageGetLandingPageFoldersParams.none())

    /** @see getLandingPageFolders */
    fun getLandingPageFolders(
        params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultContentFolderLong>

    /** @see getLandingPageFolders */
    fun getLandingPageFolders(
        params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none()
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        getLandingPageFolders(params, RequestOptions.none())

    /** @see getLandingPageFolders */
    fun getLandingPageFolders(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        getLandingPageFolders(PageGetLandingPageFoldersParams.none(), requestOptions)

    fun getLandingPageFoldersByQuery(): CompletableFuture<CursorPagedResultContentFolderLong> =
        getLandingPageFoldersByQuery(PageGetLandingPageFoldersByQueryParams.none())

    /** @see getLandingPageFoldersByQuery */
    fun getLandingPageFoldersByQuery(
        params: PageGetLandingPageFoldersByQueryParams =
            PageGetLandingPageFoldersByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultContentFolderLong>

    /** @see getLandingPageFoldersByQuery */
    fun getLandingPageFoldersByQuery(
        params: PageGetLandingPageFoldersByQueryParams =
            PageGetLandingPageFoldersByQueryParams.none()
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        getLandingPageFoldersByQuery(params, RequestOptions.none())

    /** @see getLandingPageFoldersByQuery */
    fun getLandingPageFoldersByQuery(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        getLandingPageFoldersByQuery(PageGetLandingPageFoldersByQueryParams.none(), requestOptions)

    /** Retrieve a previous version of a landing page, specified by page ID and revision ID. */
    fun getLandingPageRevision(
        revisionId: String,
        params: PageGetLandingPageRevisionParams,
    ): CompletableFuture<PageVersion> =
        getLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        revisionId: String,
        params: PageGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion> =
        getLandingPageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        params: PageGetLandingPageRevisionParams
    ): CompletableFuture<PageVersion> = getLandingPageRevision(params, RequestOptions.none())

    /** @see getLandingPageRevision */
    fun getLandingPageRevision(
        params: PageGetLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion>

    fun getLandingPages(): CompletableFuture<CursorPagedResultPageLong> =
        getLandingPages(PageGetLandingPagesParams.none())

    /** @see getLandingPages */
    fun getLandingPages(
        params: PageGetLandingPagesParams = PageGetLandingPagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see getLandingPages */
    fun getLandingPages(
        params: PageGetLandingPagesParams = PageGetLandingPagesParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> = getLandingPages(params, RequestOptions.none())

    /** @see getLandingPages */
    fun getLandingPages(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultPageLong> =
        getLandingPages(PageGetLandingPagesParams.none(), requestOptions)

    fun getLandingPagesByQuery(): CompletableFuture<CursorPagedResultPageLong> =
        getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none())

    /** @see getLandingPagesByQuery */
    fun getLandingPagesByQuery(
        params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see getLandingPagesByQuery */
    fun getLandingPagesByQuery(
        params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> =
        getLandingPagesByQuery(params, RequestOptions.none())

    /** @see getLandingPagesByQuery */
    fun getLandingPagesByQuery(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultPageLong> =
        getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none(), requestOptions)

    /** Retrieve a previous version of a website page by the revision ID. */
    fun getSitePageRevision(
        revisionId: String,
        params: PageGetSitePageRevisionParams,
    ): CompletableFuture<PageVersion> =
        getSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        revisionId: String,
        params: PageGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion> =
        getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getSitePageRevision */
    fun getSitePageRevision(params: PageGetSitePageRevisionParams): CompletableFuture<PageVersion> =
        getSitePageRevision(params, RequestOptions.none())

    /** @see getSitePageRevision */
    fun getSitePageRevision(
        params: PageGetSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageVersion>

    fun getSitePages(): CompletableFuture<CursorPagedResultPageLong> =
        getSitePages(PageGetSitePagesParams.none())

    /** @see getSitePages */
    fun getSitePages(
        params: PageGetSitePagesParams = PageGetSitePagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see getSitePages */
    fun getSitePages(
        params: PageGetSitePagesParams = PageGetSitePagesParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> = getSitePages(params, RequestOptions.none())

    /** @see getSitePages */
    fun getSitePages(requestOptions: RequestOptions): CompletableFuture<CursorPagedResultPageLong> =
        getSitePages(PageGetSitePagesParams.none(), requestOptions)

    fun getSitePagesByQuery(): CompletableFuture<CursorPagedResultPageLong> =
        getSitePagesByQuery(PageGetSitePagesByQueryParams.none())

    /** @see getSitePagesByQuery */
    fun getSitePagesByQuery(
        params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CursorPagedResultPageLong>

    /** @see getSitePagesByQuery */
    fun getSitePagesByQuery(
        params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none()
    ): CompletableFuture<CursorPagedResultPageLong> =
        getSitePagesByQuery(params, RequestOptions.none())

    /** @see getSitePagesByQuery */
    fun getSitePagesByQuery(
        requestOptions: RequestOptions
    ): CompletableFuture<CursorPagedResultPageLong> =
        getSitePagesByQuery(PageGetSitePagesByQueryParams.none(), requestOptions)

    /** Retrieve all the previous versions of a landing page, specified by page ID. */
    fun listLandingPageRevisions(
        objectId: String
    ): CompletableFuture<PageListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(objectId, PageListLandingPageRevisionsParams.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
    ): CompletableFuture<PageListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(objectId, params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: PageListLandingPageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageListLandingPageRevisionsPageAsync>

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        params: PageListLandingPageRevisionsParams
    ): CompletableFuture<PageListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(params, RequestOptions.none())

    /** @see listLandingPageRevisions */
    fun listLandingPageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageListLandingPageRevisionsPageAsync> =
        listLandingPageRevisions(
            objectId,
            PageListLandingPageRevisionsParams.none(),
            requestOptions,
        )

    /** Retrieves all the previous versions of a website page, specified by page ID. */
    fun listSitePageRevisions(
        objectId: String
    ): CompletableFuture<PageListSitePageRevisionsPageAsync> =
        listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageListSitePageRevisionsPageAsync> =
        listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
    ): CompletableFuture<PageListSitePageRevisionsPageAsync> =
        listSitePageRevisions(objectId, params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: PageListSitePageRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageListSitePageRevisionsPageAsync>

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        params: PageListSitePageRevisionsParams
    ): CompletableFuture<PageListSitePageRevisionsPageAsync> =
        listSitePageRevisions(params, RequestOptions.none())

    /** @see listSitePageRevisions */
    fun listSitePageRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageListSitePageRevisionsPageAsync> =
        listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetSitePageDraft(objectId: String): CompletableFuture<Void?> =
        resetSitePageDraft(objectId, PageResetSitePageDraftParams.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
    ): CompletableFuture<Void?> = resetSitePageDraft(objectId, params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        params: PageResetSitePageDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(params: PageResetSitePageDraftParams): CompletableFuture<Void?> =
        resetSitePageDraft(params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        resetSitePageDraft(objectId, PageResetSitePageDraftParams.none(), requestOptions)

    /** Restores a previous version of a landing page, specified by page ID and revision ID. */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: PageRestoreLandingPageRevisionParams,
    ): CompletableFuture<CmsPage> =
        restoreLandingPageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        revisionId: String,
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage> =
        restoreLandingPageRevision(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        params: PageRestoreLandingPageRevisionParams
    ): CompletableFuture<CmsPage> = restoreLandingPageRevision(params, RequestOptions.none())

    /** @see restoreLandingPageRevision */
    fun restoreLandingPageRevision(
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage>

    /** Specify a previous version of a landing page to set as the page draft. */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreLandingPageRevisionToDraftParams,
    ): CompletableFuture<CmsPage> =
        restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage> =
        restoreLandingPageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams
    ): CompletableFuture<CmsPage> = restoreLandingPageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreLandingPageRevisionToDraft */
    fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage>

    /** Restores a website page to a previous version, specified by page ID and version ID. */
    fun restoreSitePageRevision(
        revisionId: String,
        params: PageRestoreSitePageRevisionParams,
    ): CompletableFuture<CmsPage> =
        restoreSitePageRevision(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        revisionId: String,
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage> =
        restoreSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        params: PageRestoreSitePageRevisionParams
    ): CompletableFuture<CmsPage> = restoreSitePageRevision(params, RequestOptions.none())

    /** @see restoreSitePageRevision */
    fun restoreSitePageRevision(
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage>

    /**
     * Takes a specified version of a website page and sets it as the new draft version of the page.
     */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreSitePageRevisionToDraftParams,
    ): CompletableFuture<CmsPage> =
        restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        revisionId: Long,
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage> =
        restoreSitePageRevisionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: PageRestoreSitePageRevisionToDraftParams
    ): CompletableFuture<CmsPage> = restoreSitePageRevisionToDraft(params, RequestOptions.none())

    /** @see restoreSitePageRevisionToDraft */
    fun restoreSitePageRevisionToDraft(
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CmsPage>

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
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/folders/cursor`,
         * but is otherwise the same as [PageServiceAsync.getLandingPageFolders].
         */
        fun getLandingPageFolders():
            CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            getLandingPageFolders(PageGetLandingPageFoldersParams.none())

        /** @see getLandingPageFolders */
        fun getLandingPageFolders(
            params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>>

        /** @see getLandingPageFolders */
        fun getLandingPageFolders(
            params: PageGetLandingPageFoldersParams = PageGetLandingPageFoldersParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            getLandingPageFolders(params, RequestOptions.none())

        /** @see getLandingPageFolders */
        fun getLandingPageFolders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            getLandingPageFolders(PageGetLandingPageFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/folders/cursor/query`, but is otherwise the same as
         * [PageServiceAsync.getLandingPageFoldersByQuery].
         */
        fun getLandingPageFoldersByQuery():
            CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            getLandingPageFoldersByQuery(PageGetLandingPageFoldersByQueryParams.none())

        /** @see getLandingPageFoldersByQuery */
        fun getLandingPageFoldersByQuery(
            params: PageGetLandingPageFoldersByQueryParams =
                PageGetLandingPageFoldersByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>>

        /** @see getLandingPageFoldersByQuery */
        fun getLandingPageFoldersByQuery(
            params: PageGetLandingPageFoldersByQueryParams =
                PageGetLandingPageFoldersByQueryParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            getLandingPageFoldersByQuery(params, RequestOptions.none())

        /** @see getLandingPageFoldersByQuery */
        fun getLandingPageFoldersByQuery(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> =
            getLandingPageFoldersByQuery(
                PageGetLandingPageFoldersByQueryParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [PageServiceAsync.getLandingPageRevision].
         */
        fun getLandingPageRevision(
            revisionId: String,
            params: PageGetLandingPageRevisionParams,
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see getLandingPageRevision */
        fun getLandingPageRevision(
            revisionId: String,
            params: PageGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see getLandingPageRevision */
        fun getLandingPageRevision(
            params: PageGetLandingPageRevisionParams
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getLandingPageRevision(params, RequestOptions.none())

        /** @see getLandingPageRevision */
        fun getLandingPageRevision(
            params: PageGetLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor`, but is
         * otherwise the same as [PageServiceAsync.getLandingPages].
         */
        fun getLandingPages(): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getLandingPages(PageGetLandingPagesParams.none())

        /** @see getLandingPages */
        fun getLandingPages(
            params: PageGetLandingPagesParams = PageGetLandingPagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see getLandingPages */
        fun getLandingPages(
            params: PageGetLandingPagesParams = PageGetLandingPagesParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getLandingPages(params, RequestOptions.none())

        /** @see getLandingPages */
        fun getLandingPages(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getLandingPages(PageGetLandingPagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/cursor/query`, but
         * is otherwise the same as [PageServiceAsync.getLandingPagesByQuery].
         */
        fun getLandingPagesByQuery():
            CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none())

        /** @see getLandingPagesByQuery */
        fun getLandingPagesByQuery(
            params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see getLandingPagesByQuery */
        fun getLandingPagesByQuery(
            params: PageGetLandingPagesByQueryParams = PageGetLandingPagesByQueryParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getLandingPagesByQuery(params, RequestOptions.none())

        /** @see getLandingPagesByQuery */
        fun getLandingPagesByQuery(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getLandingPagesByQuery(PageGetLandingPagesByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the
         * same as [PageServiceAsync.getSitePageRevision].
         */
        fun getSitePageRevision(
            revisionId: String,
            params: PageGetSitePageRevisionParams,
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see getSitePageRevision */
        fun getSitePageRevision(
            revisionId: String,
            params: PageGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getSitePageRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getSitePageRevision */
        fun getSitePageRevision(
            params: PageGetSitePageRevisionParams
        ): CompletableFuture<HttpResponseFor<PageVersion>> =
            getSitePageRevision(params, RequestOptions.none())

        /** @see getSitePageRevision */
        fun getSitePageRevision(
            params: PageGetSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageVersion>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor`, but is
         * otherwise the same as [PageServiceAsync.getSitePages].
         */
        fun getSitePages(): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getSitePages(PageGetSitePagesParams.none())

        /** @see getSitePages */
        fun getSitePages(
            params: PageGetSitePagesParams = PageGetSitePagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see getSitePages */
        fun getSitePages(
            params: PageGetSitePagesParams = PageGetSitePagesParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getSitePages(params, RequestOptions.none())

        /** @see getSitePages */
        fun getSitePages(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getSitePages(PageGetSitePagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/cursor/query`, but is
         * otherwise the same as [PageServiceAsync.getSitePagesByQuery].
         */
        fun getSitePagesByQuery(): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getSitePagesByQuery(PageGetSitePagesByQueryParams.none())

        /** @see getSitePagesByQuery */
        fun getSitePagesByQuery(
            params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>>

        /** @see getSitePagesByQuery */
        fun getSitePagesByQuery(
            params: PageGetSitePagesByQueryParams = PageGetSitePagesByQueryParams.none()
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getSitePagesByQuery(params, RequestOptions.none())

        /** @see getSitePagesByQuery */
        fun getSitePagesByQuery(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> =
            getSitePagesByQuery(PageGetSitePagesByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions`, but is otherwise the same as
         * [PageServiceAsync.listLandingPageRevisions].
         */
        fun listLandingPageRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<PageListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(objectId, PageListLandingPageRevisionsParams.none())

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            objectId: String,
            params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            objectId: String,
            params: PageListLandingPageRevisionsParams = PageListLandingPageRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PageListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(objectId, params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            params: PageListLandingPageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageListLandingPageRevisionsPageAsync>>

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            params: PageListLandingPageRevisionsParams
        ): CompletableFuture<HttpResponseFor<PageListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(params, RequestOptions.none())

        /** @see listLandingPageRevisions */
        fun listLandingPageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageListLandingPageRevisionsPageAsync>> =
            listLandingPageRevisions(
                objectId,
                PageListLandingPageRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/revisions`,
         * but is otherwise the same as [PageServiceAsync.listSitePageRevisions].
         */
        fun listSitePageRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<PageListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none())

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            objectId: String,
            params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            objectId: String,
            params: PageListSitePageRevisionsParams = PageListSitePageRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PageListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(objectId, params, RequestOptions.none())

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            params: PageListSitePageRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageListSitePageRevisionsPageAsync>>

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            params: PageListSitePageRevisionsParams
        ): CompletableFuture<HttpResponseFor<PageListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(params, RequestOptions.none())

        /** @see listSitePageRevisions */
        fun listSitePageRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageListSitePageRevisionsPageAsync>> =
            listSitePageRevisions(objectId, PageListSitePageRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [PageServiceAsync.resetSitePageDraft].
         */
        fun resetSitePageDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetSitePageDraft(objectId, PageResetSitePageDraftParams.none())

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            objectId: String,
            params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            objectId: String,
            params: PageResetSitePageDraftParams = PageResetSitePageDraftParams.none(),
        ): CompletableFuture<HttpResponse> =
            resetSitePageDraft(objectId, params, RequestOptions.none())

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            params: PageResetSitePageDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            params: PageResetSitePageDraftParams
        ): CompletableFuture<HttpResponse> = resetSitePageDraft(params, RequestOptions.none())

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetSitePageDraft(objectId, PageResetSitePageDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [PageServiceAsync.restoreLandingPageRevision].
         */
        fun restoreLandingPageRevision(
            revisionId: String,
            params: PageRestoreLandingPageRevisionParams,
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreLandingPageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        fun restoreLandingPageRevision(
            revisionId: String,
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreLandingPageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevision */
        fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreLandingPageRevision(params, RequestOptions.none())

        /** @see restoreLandingPageRevision */
        fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but
         * is otherwise the same as [PageServiceAsync.restoreLandingPageRevisionToDraft].
         */
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreLandingPageRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreLandingPageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        fun restoreLandingPageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreLandingPageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreLandingPageRevisionToDraft */
        fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreLandingPageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreLandingPageRevisionToDraft */
        fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [PageServiceAsync.restoreSitePageRevision].
         */
        fun restoreSitePageRevision(
            revisionId: String,
            params: PageRestoreSitePageRevisionParams,
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreSitePageRevision(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        fun restoreSitePageRevision(
            revisionId: String,
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreSitePageRevision(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevision */
        fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreSitePageRevision(params, RequestOptions.none())

        /** @see restoreSitePageRevision */
        fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [PageServiceAsync.restoreSitePageRevisionToDraft].
         */
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreSitePageRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreSitePageRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        fun restoreSitePageRevisionToDraft(
            revisionId: Long,
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreSitePageRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreSitePageRevisionToDraft */
        fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<CmsPage>> =
            restoreSitePageRevisionToDraft(params, RequestOptions.none())

        /** @see restoreSitePageRevisionToDraft */
        fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CmsPage>>
    }
}
