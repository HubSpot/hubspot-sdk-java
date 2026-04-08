// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageVersion
import com.hubspot_sdk.api.models.cms.pages.CursorPagedResultContentFolderLong
import com.hubspot_sdk.api.models.cms.pages.CursorPagedResultPageLong
import com.hubspot_sdk.api.models.cms.pages.PageData
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
import com.hubspot_sdk.api.services.async.cms.pages.ABTestServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.pages.BatchServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.BatchServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.pages.FolderServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.FolderServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.pages.LandingPageServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.LandingPageServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.pages.MultiLanguageServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.MultiLanguageServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.pages.WebsitePageServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.WebsitePageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PageServiceAsync {

    private val withRawResponse: PageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val aBTests: ABTestServiceAsync by lazy { ABTestServiceAsyncImpl(clientOptions) }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val folders: FolderServiceAsync by lazy { FolderServiceAsyncImpl(clientOptions) }

    private val landingPages: LandingPageServiceAsync by lazy {
        LandingPageServiceAsyncImpl(clientOptions)
    }

    private val multiLanguage: MultiLanguageServiceAsync by lazy {
        MultiLanguageServiceAsyncImpl(clientOptions)
    }

    private val websitePages: WebsitePageServiceAsync by lazy {
        WebsitePageServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync =
        PageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun aBTests(): ABTestServiceAsync = aBTests

    override fun batch(): BatchServiceAsync = batch

    override fun folders(): FolderServiceAsync = folders

    override fun landingPages(): LandingPageServiceAsync = landingPages

    override fun multiLanguage(): MultiLanguageServiceAsync = multiLanguage

    override fun websitePages(): WebsitePageServiceAsync = websitePages

    override fun getLandingPageFolders(
        params: PageGetLandingPageFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        // get /cms/pages/2026-03/landing-pages/folders/cursor
        withRawResponse().getLandingPageFolders(params, requestOptions).thenApply { it.parse() }

    override fun getLandingPageFoldersByQuery(
        params: PageGetLandingPageFoldersByQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        // get /cms/pages/2026-03/landing-pages/folders/cursor/query
        withRawResponse().getLandingPageFoldersByQuery(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getLandingPageRevision(
        params: PageGetLandingPageRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageVersion> =
        // get /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getLandingPageRevision(params, requestOptions).thenApply { it.parse() }

    override fun getLandingPages(
        params: PageGetLandingPagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/landing-pages/cursor
        withRawResponse().getLandingPages(params, requestOptions).thenApply { it.parse() }

    override fun getLandingPagesByQuery(
        params: PageGetLandingPagesByQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/landing-pages/cursor/query
        withRawResponse().getLandingPagesByQuery(params, requestOptions).thenApply { it.parse() }

    override fun getSitePageRevision(
        params: PageGetSitePageRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageVersion> =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getSitePageRevision(params, requestOptions).thenApply { it.parse() }

    override fun getSitePages(
        params: PageGetSitePagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/site-pages/cursor
        withRawResponse().getSitePages(params, requestOptions).thenApply { it.parse() }

    override fun getSitePagesByQuery(
        params: PageGetSitePagesByQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/site-pages/cursor/query
        withRawResponse().getSitePagesByQuery(params, requestOptions).thenApply { it.parse() }

    override fun listLandingPageRevisions(
        params: PageListLandingPageRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageListLandingPageRevisionsPageAsync> =
        // get /cms/pages/2026-03/landing-pages/{objectId}/revisions
        withRawResponse().listLandingPageRevisions(params, requestOptions).thenApply { it.parse() }

    override fun listSitePageRevisions(
        params: PageListSitePageRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageListSitePageRevisionsPageAsync> =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions
        withRawResponse().listSitePageRevisions(params, requestOptions).thenApply { it.parse() }

    override fun resetSitePageDraft(
        params: PageResetSitePageDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/{objectId}/draft/reset
        withRawResponse().resetSitePageDraft(params, requestOptions).thenAccept {}

    override fun restoreLandingPageRevision(
        params: PageRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // post /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreLandingPageRevision(params, requestOptions).thenApply {
            it.parse()
        }

    override fun restoreLandingPageRevisionToDraft(
        params: PageRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // post /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreLandingPageRevisionToDraft(params, requestOptions).thenApply {
            it.parse()
        }

    override fun restoreSitePageRevision(
        params: PageRestoreSitePageRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreSitePageRevision(params, requestOptions).thenApply { it.parse() }

    override fun restoreSitePageRevisionToDraft(
        params: PageRestoreSitePageRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreSitePageRevisionToDraft(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val aBTests: ABTestServiceAsync.WithRawResponse by lazy {
            ABTestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val folders: FolderServiceAsync.WithRawResponse by lazy {
            FolderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val landingPages: LandingPageServiceAsync.WithRawResponse by lazy {
            LandingPageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val multiLanguage: MultiLanguageServiceAsync.WithRawResponse by lazy {
            MultiLanguageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val websitePages: WebsitePageServiceAsync.WithRawResponse by lazy {
            WebsitePageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PageServiceAsync.WithRawResponse =
            PageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun aBTests(): ABTestServiceAsync.WithRawResponse = aBTests

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun folders(): FolderServiceAsync.WithRawResponse = folders

        override fun landingPages(): LandingPageServiceAsync.WithRawResponse = landingPages

        override fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse = multiLanguage

        override fun websitePages(): WebsitePageServiceAsync.WithRawResponse = websitePages

        private val getLandingPageFoldersHandler: Handler<CursorPagedResultContentFolderLong> =
            jsonHandler<CursorPagedResultContentFolderLong>(clientOptions.jsonMapper)

        override fun getLandingPageFolders(
            params: PageGetLandingPageFoldersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLandingPageFoldersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<CursorPagedResultContentFolderLong>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLandingPageFoldersByQueryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLandingPageRevisionHandler: Handler<PageVersion> =
            jsonHandler<PageVersion>(clientOptions.jsonMapper)

        override fun getLandingPageRevision(
            params: PageGetLandingPageRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageVersion>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLandingPageRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLandingPagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getLandingPages(
            params: PageGetLandingPagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "cursor")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLandingPagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLandingPagesByQueryHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getLandingPagesByQuery(
            params: PageGetLandingPagesByQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "cursor", "query")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLandingPagesByQueryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSitePageRevisionHandler: Handler<PageVersion> =
            jsonHandler<PageVersion>(clientOptions.jsonMapper)

        override fun getSitePageRevision(
            params: PageGetSitePageRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageVersion>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSitePageRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSitePagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getSitePages(
            params: PageGetSitePagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "cursor")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSitePagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSitePagesByQueryHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun getSitePagesByQuery(
            params: PageGetSitePagesByQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CursorPagedResultPageLong>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "cursor", "query")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSitePagesByQueryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<PageListLandingPageRevisionsPageAsync>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLandingPageRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PageListLandingPageRevisionsPageAsync.builder()
                                    .service(PageServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listSitePageRevisionsHandler: Handler<CollectionResponseWithTotalPageVersion> =
            jsonHandler<CollectionResponseWithTotalPageVersion>(clientOptions.jsonMapper)

        override fun listSitePageRevisions(
            params: PageListSitePageRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageListSitePageRevisionsPageAsync>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSitePageRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PageListSitePageRevisionsPageAsync.builder()
                                    .service(PageServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val resetSitePageDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetSitePageDraft(
            params: PageResetSitePageDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { resetSitePageDraftHandler.handle(it) }
                    }
                }
        }

        private val restoreLandingPageRevisionHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreLandingPageRevision(
            params: PageRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { restoreLandingPageRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val restoreLandingPageRevisionToDraftHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreLandingPageRevisionToDraft(
            params: PageRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { restoreLandingPageRevisionToDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val restoreSitePageRevisionHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreSitePageRevision(
            params: PageRestoreSitePageRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { restoreSitePageRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val restoreSitePageRevisionToDraftHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun restoreSitePageRevisionToDraft(
            params: PageRestoreSitePageRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
