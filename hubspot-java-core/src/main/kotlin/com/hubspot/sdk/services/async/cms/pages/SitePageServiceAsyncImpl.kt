// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageCloneParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageCreateParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageDeleteParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageGetParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListPageAsync
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageScheduleParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageUpdateParams
import com.hubspot.sdk.services.async.cms.pages.sitepages.AbTestServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.AbTestServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.sitepages.BatchServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.BatchServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.sitepages.DraftServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.DraftServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.sitepages.MultiLanguageServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.MultiLanguageServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.sitepages.RevisionServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.RevisionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SitePageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SitePageServiceAsync {

    private val withRawResponse: SitePageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val abTest: AbTestServiceAsync by lazy { AbTestServiceAsyncImpl(clientOptions) }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val draft: DraftServiceAsync by lazy { DraftServiceAsyncImpl(clientOptions) }

    private val multiLanguage: MultiLanguageServiceAsync by lazy {
        MultiLanguageServiceAsyncImpl(clientOptions)
    }

    private val revisions: RevisionServiceAsync by lazy { RevisionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SitePageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageServiceAsync =
        SitePageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun abTest(): AbTestServiceAsync = abTest

    override fun batch(): BatchServiceAsync = batch

    override fun draft(): DraftServiceAsync = draft

    override fun multiLanguage(): MultiLanguageServiceAsync = multiLanguage

    override fun revisions(): RevisionServiceAsync = revisions

    override fun create(
        params: SitePageCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // post /cms/pages/2026-03/site-pages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SitePageUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // patch /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SitePageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SitePageListPageAsync> =
        // get /cms/pages/2026-03/site-pages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SitePageDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun clone(
        params: SitePageCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // post /cms/pages/2026-03/site-pages/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SitePageGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // get /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun schedule(
        params: SitePageScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/schedule
        withRawResponse().schedule(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SitePageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val abTest: AbTestServiceAsync.WithRawResponse by lazy {
            AbTestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val draft: DraftServiceAsync.WithRawResponse by lazy {
            DraftServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val multiLanguage: MultiLanguageServiceAsync.WithRawResponse by lazy {
            MultiLanguageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val revisions: RevisionServiceAsync.WithRawResponse by lazy {
            RevisionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SitePageServiceAsync.WithRawResponse =
            SitePageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun abTest(): AbTestServiceAsync.WithRawResponse = abTest

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun draft(): DraftServiceAsync.WithRawResponse = draft

        override fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse = multiLanguage

        override fun revisions(): RevisionServiceAsync.WithRawResponse = revisions

        private val createHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun create(
            params: SitePageCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun update(
            params: SitePageUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponseWithTotalPageForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPageForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: SitePageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SitePageListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SitePageListPageAsync.builder()
                                    .service(SitePageServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SitePageDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val cloneHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun clone(
            params: SitePageCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun get(
            params: SitePageGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val scheduleHandler: Handler<Void?> = emptyHandler()

        override fun schedule(
            params: SitePageScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { scheduleHandler.handle(it) }
                    }
                }
        }
    }
}
