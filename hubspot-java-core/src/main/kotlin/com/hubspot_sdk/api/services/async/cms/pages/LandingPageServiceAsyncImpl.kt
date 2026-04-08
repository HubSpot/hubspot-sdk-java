// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

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
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot_sdk.api.models.cms.pages.PageData
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListPageAsync
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPagePushDraftLiveParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LandingPageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LandingPageServiceAsync {

    private val withRawResponse: LandingPageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LandingPageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageServiceAsync =
        LandingPageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // post /cms/pages/2026-03/landing-pages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
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
    ): CompletableFuture<PageData> =
        // post /cms/pages/2026-03/landing-pages/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: LandingPageGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // get /cms/pages/2026-03/landing-pages/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getDraft(
        params: LandingPageGetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // get /cms/pages/2026-03/landing-pages/{objectId}/draft
        withRawResponse().getDraft(params, requestOptions).thenApply { it.parse() }

    override fun pushDraftLive(
        params: LandingPagePushDraftLiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/{objectId}/draft/push-live
        withRawResponse().pushDraftLive(params, requestOptions).thenAccept {}

    override fun resetDraft(
        params: LandingPageResetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/{objectId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions).thenAccept {}

    override fun schedule(
        params: LandingPageScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/schedule
        withRawResponse().schedule(params, requestOptions).thenAccept {}

    override fun updateDraft(
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // patch /cms/pages/2026-03/landing-pages/{objectId}/draft
        withRawResponse().updateDraft(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LandingPageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageServiceAsync.WithRawResponse =
            LandingPageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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

        private val updateHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun update(
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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

        private val cloneHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun clone(
            params: LandingPageCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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

        private val getHandler: Handler<PageData> = jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun get(
            params: LandingPageGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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

        private val getDraftHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun getDraft(
            params: LandingPageGetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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
                        "draft",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val pushDraftLiveHandler: Handler<Void?> = emptyHandler()

        override fun pushDraftLive(
            params: LandingPagePushDraftLiveParams,
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
                        "landing-pages",
                        params._pathParam(0),
                        "draft",
                        "push-live",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { pushDraftLiveHandler.handle(it) }
                    }
                }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: LandingPageResetDraftParams,
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
                        "landing-pages",
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

        private val updateDraftHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
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
                        "draft",
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
                            .use { updateDraftHandler.handle(it) }
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
