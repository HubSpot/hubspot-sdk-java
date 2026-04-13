// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.cms.pages.CollectionResponseWithTotalPageVersion
import com.hubspot.models.cms.pages.CursorPagedResultContentFolderLong
import com.hubspot.models.cms.pages.CursorPagedResultPageLong
import com.hubspot.models.cms.pages.PageData
import com.hubspot.models.cms.pages.PageGetLandingPageFoldersByQueryParams
import com.hubspot.models.cms.pages.PageGetLandingPageFoldersParams
import com.hubspot.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot.models.cms.pages.PageGetLandingPagesByQueryParams
import com.hubspot.models.cms.pages.PageGetLandingPagesParams
import com.hubspot.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot.models.cms.pages.PageGetSitePagesByQueryParams
import com.hubspot.models.cms.pages.PageGetSitePagesParams
import com.hubspot.models.cms.pages.PageListLandingPageRevisionsPage
import com.hubspot.models.cms.pages.PageListLandingPageRevisionsParams
import com.hubspot.models.cms.pages.PageListSitePageRevisionsPage
import com.hubspot.models.cms.pages.PageListSitePageRevisionsParams
import com.hubspot.models.cms.pages.PageResetSitePageDraftParams
import com.hubspot.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
import com.hubspot.models.cms.pages.PageVersion
import com.hubspot.services.blocking.cms.pages.ABTestService
import com.hubspot.services.blocking.cms.pages.ABTestServiceImpl
import com.hubspot.services.blocking.cms.pages.BatchService
import com.hubspot.services.blocking.cms.pages.BatchServiceImpl
import com.hubspot.services.blocking.cms.pages.FolderService
import com.hubspot.services.blocking.cms.pages.FolderServiceImpl
import com.hubspot.services.blocking.cms.pages.LandingPageService
import com.hubspot.services.blocking.cms.pages.LandingPageServiceImpl
import com.hubspot.services.blocking.cms.pages.MultiLanguageService
import com.hubspot.services.blocking.cms.pages.MultiLanguageServiceImpl
import com.hubspot.services.blocking.cms.pages.WebsitePageService
import com.hubspot.services.blocking.cms.pages.WebsitePageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PageServiceImpl internal constructor(private val clientOptions: ClientOptions) : PageService {

    private val withRawResponse: PageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val aBTests: ABTestService by lazy { ABTestServiceImpl(clientOptions) }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val folders: FolderService by lazy { FolderServiceImpl(clientOptions) }

    private val landingPages: LandingPageService by lazy { LandingPageServiceImpl(clientOptions) }

    private val multiLanguage: MultiLanguageService by lazy {
        MultiLanguageServiceImpl(clientOptions)
    }

    private val websitePages: WebsitePageService by lazy { WebsitePageServiceImpl(clientOptions) }

    override fun withRawResponse(): PageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService =
        PageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun aBTests(): ABTestService = aBTests

    override fun batch(): BatchService = batch

    override fun folders(): FolderService = folders

    override fun landingPages(): LandingPageService = landingPages

    override fun multiLanguage(): MultiLanguageService = multiLanguage

    override fun websitePages(): WebsitePageService = websitePages

    override fun getLandingPageFolders(
        params: PageGetLandingPageFoldersParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultContentFolderLong =
        // get /cms/pages/2026-03/landing-pages/folders/cursor
        withRawResponse().getLandingPageFolders(params, requestOptions).parse()

    override fun getLandingPageFoldersByQuery(
        params: PageGetLandingPageFoldersByQueryParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultContentFolderLong =
        // get /cms/pages/2026-03/landing-pages/folders/cursor/query
        withRawResponse().getLandingPageFoldersByQuery(params, requestOptions).parse()

    override fun getLandingPageRevision(
        params: PageGetLandingPageRevisionParams,
        requestOptions: RequestOptions,
    ): PageVersion =
        // get /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getLandingPageRevision(params, requestOptions).parse()

    override fun getLandingPages(
        params: PageGetLandingPagesParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/landing-pages/cursor
        withRawResponse().getLandingPages(params, requestOptions).parse()

    override fun getLandingPagesByQuery(
        params: PageGetLandingPagesByQueryParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/landing-pages/cursor/query
        withRawResponse().getLandingPagesByQuery(params, requestOptions).parse()

    override fun getSitePageRevision(
        params: PageGetSitePageRevisionParams,
        requestOptions: RequestOptions,
    ): PageVersion =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getSitePageRevision(params, requestOptions).parse()

    override fun getSitePages(
        params: PageGetSitePagesParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/site-pages/cursor
        withRawResponse().getSitePages(params, requestOptions).parse()

    override fun getSitePagesByQuery(
        params: PageGetSitePagesByQueryParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/site-pages/cursor/query
        withRawResponse().getSitePagesByQuery(params, requestOptions).parse()

    override fun listLandingPageRevisions(
        params: PageListLandingPageRevisionsParams,
        requestOptions: RequestOptions,
    ): PageListLandingPageRevisionsPage =
        // get /cms/pages/2026-03/landing-pages/{objectId}/revisions
        withRawResponse().listLandingPageRevisions(params, requestOptions).parse()

    override fun listSitePageRevisions(
        params: PageListSitePageRevisionsParams,
        requestOptions: RequestOptions,
    ): PageListSitePageRevisionsPage =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions
        withRawResponse().listSitePageRevisions(params, requestOptions).parse()

    override fun resetSitePageDraft(
        params: PageResetSitePageDraftParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/site-pages/{objectId}/draft/reset
        withRawResponse().resetSitePageDraft(params, requestOptions)
    }

    override fun restoreLandingPageRevision(
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions,
    ): PageData =
        // post /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreLandingPageRevision(params, requestOptions).parse()

    override fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): PageData =
        // post /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreLandingPageRevisionToDraft(params, requestOptions).parse()

    override fun restoreSitePageRevision(
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions,
    ): PageData =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreSitePageRevision(params, requestOptions).parse()

    override fun restoreSitePageRevisionToDraft(
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): PageData =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreSitePageRevisionToDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val aBTests: ABTestService.WithRawResponse by lazy {
            ABTestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val folders: FolderService.WithRawResponse by lazy {
            FolderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val landingPages: LandingPageService.WithRawResponse by lazy {
            LandingPageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val multiLanguage: MultiLanguageService.WithRawResponse by lazy {
            MultiLanguageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val websitePages: WebsitePageService.WithRawResponse by lazy {
            WebsitePageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PageService.WithRawResponse =
            PageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun aBTests(): ABTestService.WithRawResponse = aBTests

        override fun batch(): BatchService.WithRawResponse = batch

        override fun folders(): FolderService.WithRawResponse = folders

        override fun landingPages(): LandingPageService.WithRawResponse = landingPages

        override fun multiLanguage(): MultiLanguageService.WithRawResponse = multiLanguage

        override fun websitePages(): WebsitePageService.WithRawResponse = websitePages

        private val getLandingPageFoldersHandler: Handler<CursorPagedResultContentFolderLong> =
            jsonHandler<CursorPagedResultContentFolderLong>(clientOptions.jsonMapper)

        override fun getLandingPageFolders(
            params: PageGetLandingPageFoldersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CursorPagedResultContentFolderLong> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        "cursor",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLandingPageFoldersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLandingPageFoldersByQueryHandler:
            Handler<CursorPagedResultContentFolderLong> =
            jsonHandler<CursorPagedResultContentFolderLong>(clientOptions.jsonMapper)

        override fun getLandingPageFoldersByQuery(
            params: PageGetLandingPageFoldersByQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CursorPagedResultContentFolderLong> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        "cursor",
                        "query",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLandingPageFoldersByQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLandingPageRevisionHandler: Handler<PageVersion> =
            jsonHandler<PageVersion>(clientOptions.jsonMapper)

        override fun getLandingPageRevision(
            params: PageGetLandingPageRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLandingPageRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLandingPagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getLandingPages(
            params: PageGetLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CursorPagedResultPageLong> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "cursor")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLandingPagesByQueryHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getLandingPagesByQuery(
            params: PageGetLandingPagesByQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CursorPagedResultPageLong> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "cursor", "query")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLandingPagesByQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSitePageRevisionHandler: Handler<PageVersion> =
            jsonHandler<PageVersion>(clientOptions.jsonMapper)

        override fun getSitePageRevision(
            params: PageGetSitePageRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSitePageRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSitePagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getSitePages(
            params: PageGetSitePagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CursorPagedResultPageLong> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "cursor")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSitePagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSitePagesByQueryHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getSitePagesByQuery(
            params: PageGetSitePagesByQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CursorPagedResultPageLong> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "cursor", "query")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSitePagesByQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLandingPageRevisionsHandler:
            Handler<CollectionResponseWithTotalPageVersion> =
            jsonHandler<CollectionResponseWithTotalPageVersion>(clientOptions.jsonMapper)

        override fun listLandingPageRevisions(
            params: PageListLandingPageRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageListLandingPageRevisionsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLandingPageRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PageListLandingPageRevisionsPage.builder()
                            .service(PageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listSitePageRevisionsHandler: Handler<CollectionResponseWithTotalPageVersion> =
            jsonHandler<CollectionResponseWithTotalPageVersion>(clientOptions.jsonMapper)

        override fun listSitePageRevisions(
            params: PageListSitePageRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageListSitePageRevisionsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSitePageRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PageListSitePageRevisionsPage.builder()
                            .service(PageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val resetSitePageDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetSitePageDraft(
            params: PageResetSitePageDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
                        params._pathParam(0),
                        "draft",
                        "reset",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { resetSitePageDraftHandler.handle(it) }
            }
        }

        private val restoreLandingPageRevisionHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageData> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreLandingPageRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val restoreLandingPageRevisionToDraftHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageData> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreLandingPageRevisionToDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val restoreSitePageRevisionHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageData> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreSitePageRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val restoreSitePageRevisionToDraftHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageData> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreSitePageRevisionToDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
