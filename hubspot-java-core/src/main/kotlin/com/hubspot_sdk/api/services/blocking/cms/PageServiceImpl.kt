// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageVersion
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
import com.hubspot_sdk.api.services.blocking.cms.pages.ABTestServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.pages.BatchService
import com.hubspot_sdk.api.services.blocking.cms.pages.BatchServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.pages.FolderService
import com.hubspot_sdk.api.services.blocking.cms.pages.FolderServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageService
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.pages.MultiLanguageService
import com.hubspot_sdk.api.services.blocking.cms.pages.MultiLanguageServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.pages.WebsitePageService
import com.hubspot_sdk.api.services.blocking.cms.pages.WebsitePageServiceImpl
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

    override fun getRevision(
        params: PageGetRevisionParams,
        requestOptions: RequestOptions,
    ): PageVersion =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).parse()

    override fun listLandingPageFolders(
        params: PageListLandingPageFoldersParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultContentFolderLong =
        // get /cms/pages/2026-03/landing-pages/folders/cursor
        withRawResponse().listLandingPageFolders(params, requestOptions).parse()

    override fun listLandingPages(
        params: PageListLandingPagesParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/landing-pages/cursor
        withRawResponse().listLandingPages(params, requestOptions).parse()

    override fun listRevisions(
        params: PageListRevisionsParams,
        requestOptions: RequestOptions,
    ): PageListRevisionsPage =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions
        withRawResponse().listRevisions(params, requestOptions).parse()

    override fun listSitePages(
        params: PageListSitePagesParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/site-pages/cursor
        withRawResponse().listSitePages(params, requestOptions).parse()

    override fun queryLandingPageFolders(
        params: PageQueryLandingPageFoldersParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultContentFolderLong =
        // get /cms/pages/2026-03/landing-pages/folders/cursor/query
        withRawResponse().queryLandingPageFolders(params, requestOptions).parse()

    override fun queryLandingPages(
        params: PageQueryLandingPagesParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/landing-pages/cursor/query
        withRawResponse().queryLandingPages(params, requestOptions).parse()

    override fun querySitePages(
        params: PageQuerySitePagesParams,
        requestOptions: RequestOptions,
    ): CursorPagedResultPageLong =
        // get /cms/pages/2026-03/site-pages/cursor/query
        withRawResponse().querySitePages(params, requestOptions).parse()

    override fun resetDraft(params: PageResetDraftParams, requestOptions: RequestOptions) {
        // post /cms/pages/2026-03/site-pages/{objectId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions)
    }

    override fun restoreRevision(
        params: PageRestoreRevisionParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions).parse()

    override fun restoreRevisionToDraft(
        params: PageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreRevisionToDraft(params, requestOptions).parse()

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

        private val getRevisionHandler: Handler<PageVersion> =
            jsonHandler<PageVersion>(clientOptions.jsonMapper)

        override fun getRevision(
            params: PageGetRevisionParams,
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
                    .use { getRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLandingPageFoldersHandler: Handler<CursorPagedResultContentFolderLong> =
            jsonHandler<CursorPagedResultContentFolderLong>(clientOptions.jsonMapper)

        override fun listLandingPageFolders(
            params: PageListLandingPageFoldersParams,
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
                    .use { listLandingPageFoldersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLandingPagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun listLandingPages(
            params: PageListLandingPagesParams,
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
                    .use { listLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalPageVersion> =
            jsonHandler<CollectionResponseWithTotalPageVersion>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: PageListRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageListRevisionsPage> {
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
                    .use { listRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PageListRevisionsPage.builder()
                            .service(PageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listSitePagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun listSitePages(
            params: PageListSitePagesParams,
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
                    .use { listSitePagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryLandingPageFoldersHandler: Handler<CursorPagedResultContentFolderLong> =
            jsonHandler<CursorPagedResultContentFolderLong>(clientOptions.jsonMapper)

        override fun queryLandingPageFolders(
            params: PageQueryLandingPageFoldersParams,
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
                    .use { queryLandingPageFoldersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryLandingPagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun queryLandingPages(
            params: PageQueryLandingPagesParams,
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
                    .use { queryLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val querySitePagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun querySitePages(
            params: PageQuerySitePagesParams,
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
                    .use { querySitePagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: PageResetDraftParams,
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
                response.use { resetDraftHandler.handle(it) }
            }
        }

        private val restoreRevisionHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun restoreRevision(
            params: PageRestoreRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
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
                    .use { restoreRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val restoreRevisionToDraftHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun restoreRevisionToDraft(
            params: PageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
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
                    .use { restoreRevisionToDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
