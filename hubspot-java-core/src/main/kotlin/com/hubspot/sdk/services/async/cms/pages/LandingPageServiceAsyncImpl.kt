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
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageListPageAsync
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageUpdateParams
import com.hubspot.sdk.services.async.cms.pages.landingpages.AbTestServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.AbTestServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.landingpages.BatchServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.BatchServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.landingpages.DraftServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.DraftServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.landingpages.FolderServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.FolderServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.landingpages.MultiLanguageServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.MultiLanguageServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.landingpages.RevisionServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.RevisionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LandingPageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LandingPageServiceAsync {

    private val withRawResponse: LandingPageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val abTest: AbTestServiceAsync by lazy { AbTestServiceAsyncImpl(clientOptions) }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val draft: DraftServiceAsync by lazy { DraftServiceAsyncImpl(clientOptions) }

    private val folders: FolderServiceAsync by lazy { FolderServiceAsyncImpl(clientOptions) }

    private val multiLanguage: MultiLanguageServiceAsync by lazy {
        MultiLanguageServiceAsyncImpl(clientOptions)
    }

    private val revisions: RevisionServiceAsync by lazy { RevisionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LandingPageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageServiceAsync =
        LandingPageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun abTest(): AbTestServiceAsync = abTest

    override fun batch(): BatchServiceAsync = batch

    override fun draft(): DraftServiceAsync = draft

    override fun folders(): FolderServiceAsync = folders

    override fun multiLanguage(): MultiLanguageServiceAsync = multiLanguage

    override fun revisions(): RevisionServiceAsync = revisions

    override fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // post /cms/pages/2026-03/landing-pages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // patch /cms/pages/2026-03/landing-pages/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LandingPageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LandingPageListPageAsync> =
        // get /cms/pages/2026-03/landing-pages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LandingPageDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/pages/2026-03/landing-pages/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun clone(
        params: LandingPageCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // post /cms/pages/2026-03/landing-pages/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: LandingPageGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // get /cms/pages/2026-03/landing-pages/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun schedule(
        params: LandingPageScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/schedule
        withRawResponse().schedule(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LandingPageServiceAsync.WithRawResponse {

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

        private val folders: FolderServiceAsync.WithRawResponse by lazy {
            FolderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val multiLanguage: MultiLanguageServiceAsync.WithRawResponse by lazy {
            MultiLanguageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val revisions: RevisionServiceAsync.WithRawResponse by lazy {
            RevisionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageServiceAsync.WithRawResponse =
            LandingPageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun abTest(): AbTestServiceAsync.WithRawResponse = abTest

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun draft(): DraftServiceAsync.WithRawResponse = draft

        override fun folders(): FolderServiceAsync.WithRawResponse = folders

        override fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse = multiLanguage

        override fun revisions(): RevisionServiceAsync.WithRawResponse = revisions

        private val createHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages")
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
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        params._pathParam(0),
                    )
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
            params: LandingPageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages")
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
                                LandingPageListPageAsync.builder()
                                    .service(LandingPageServiceAsyncImpl(clientOptions))
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
            params: LandingPageDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        params._pathParam(0),
                    )
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
            params: LandingPageCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "clone")
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
            params: LandingPageGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
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
                    )
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
            params: LandingPageScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "schedule")
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
