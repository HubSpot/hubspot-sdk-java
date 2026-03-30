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

    override fun getRevision(
        params: PageGetRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageVersion> =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).thenApply { it.parse() }

    override fun listLandingPageFolders(
        params: PageListLandingPageFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        // get /cms/pages/2026-03/landing-pages/folders/cursor
        withRawResponse().listLandingPageFolders(params, requestOptions).thenApply { it.parse() }

    override fun listLandingPages(
        params: PageListLandingPagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/landing-pages/cursor
        withRawResponse().listLandingPages(params, requestOptions).thenApply { it.parse() }

    override fun listRevisions(
        params: PageListRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageListRevisionsPageAsync> =
        // get /cms/pages/2026-03/site-pages/{objectId}/revisions
        withRawResponse().listRevisions(params, requestOptions).thenApply { it.parse() }

    override fun listSitePages(
        params: PageListSitePagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/site-pages/cursor
        withRawResponse().listSitePages(params, requestOptions).thenApply { it.parse() }

    override fun queryLandingPageFolders(
        params: PageQueryLandingPageFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultContentFolderLong> =
        // get /cms/pages/2026-03/landing-pages/folders/cursor/query
        withRawResponse().queryLandingPageFolders(params, requestOptions).thenApply { it.parse() }

    override fun queryLandingPages(
        params: PageQueryLandingPagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/landing-pages/cursor/query
        withRawResponse().queryLandingPages(params, requestOptions).thenApply { it.parse() }

    override fun querySitePages(
        params: PageQuerySitePagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CursorPagedResultPageLong> =
        // get /cms/pages/2026-03/site-pages/cursor/query
        withRawResponse().querySitePages(params, requestOptions).thenApply { it.parse() }

    override fun resetDraft(
        params: PageResetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/{objectId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions).thenAccept {}

    override fun restoreRevision(
        params: PageRestoreRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Page> =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions).thenApply { it.parse() }

    override fun restoreRevisionToDraft(
        params: PageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Page> =
        // post /cms/pages/2026-03/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreRevisionToDraft(params, requestOptions).thenApply { it.parse() }

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

        private val getRevisionHandler: Handler<PageVersion> =
            jsonHandler<PageVersion>(clientOptions.jsonMapper)

        override fun getRevision(
            params: PageGetRevisionParams,
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
                            .use { getRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listLandingPageFoldersHandler: Handler<CursorPagedResultContentFolderLong> =
            jsonHandler<CursorPagedResultContentFolderLong>(clientOptions.jsonMapper)

        override fun listLandingPageFolders(
            params: PageListLandingPageFoldersParams,
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
                            .use { listLandingPageFoldersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listLandingPagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun listLandingPages(
            params: PageListLandingPagesParams,
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
                            .use { listLandingPagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalPageVersion> =
            jsonHandler<CollectionResponseWithTotalPageVersion>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: PageListRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageListRevisionsPageAsync>> {
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
                            .use { listRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PageListRevisionsPageAsync.builder()
                                    .service(PageServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listSitePagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun listSitePages(
            params: PageListSitePagesParams,
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
                            .use { listSitePagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryLandingPageFoldersHandler: Handler<CursorPagedResultContentFolderLong> =
            jsonHandler<CursorPagedResultContentFolderLong>(clientOptions.jsonMapper)

        override fun queryLandingPageFolders(
            params: PageQueryLandingPageFoldersParams,
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
                            .use { queryLandingPageFoldersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryLandingPagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun queryLandingPages(
            params: PageQueryLandingPagesParams,
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
                            .use { queryLandingPagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val querySitePagesHandler: Handler<CursorPagedResultPageLong> =
            jsonHandler<CursorPagedResultPageLong>(clientOptions.jsonMapper)

        override fun querySitePages(
            params: PageQuerySitePagesParams,
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
                            .use { querySitePagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: PageResetDraftParams,
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
                        response.use { resetDraftHandler.handle(it) }
                    }
                }
        }

        private val restoreRevisionHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun restoreRevision(
            params: PageRestoreRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> {
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
                            .use { restoreRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val restoreRevisionToDraftHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun restoreRevisionToDraft(
            params: PageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> {
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
}
