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
import com.hubspot_sdk.api.models.cms.pages.CmsPage
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCloneParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCreateParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListPageAsync
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebsitePageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebsitePageServiceAsync {

    private val withRawResponse: WebsitePageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebsitePageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsitePageServiceAsync =
        WebsitePageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WebsitePageCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CmsPage> =
        // post /cms/pages/2026-03/site-pages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WebsitePageUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CmsPage> =
        // patch /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WebsitePageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebsitePageListPageAsync> =
        // get /cms/pages/2026-03/site-pages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: WebsitePageDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun clone(
        params: WebsitePageCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CmsPage> =
        // post /cms/pages/2026-03/site-pages/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: WebsitePageGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CmsPage> =
        // get /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getDraft(
        params: WebsitePageGetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CmsPage> =
        // get /cms/pages/2026-03/site-pages/{objectId}/draft
        withRawResponse().getDraft(params, requestOptions).thenApply { it.parse() }

    override fun publishDraft(
        params: WebsitePagePublishDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/{objectId}/draft/push-live
        withRawResponse().publishDraft(params, requestOptions).thenAccept {}

    override fun schedule(
        params: WebsitePageScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/schedule
        withRawResponse().schedule(params, requestOptions).thenAccept {}

    override fun setNewLangPrimary(
        params: WebsitePageSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /cms/pages/2026-03/landing-pages/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions).thenAccept {}

    override fun updateDraft(
        params: WebsitePageUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CmsPage> =
        // patch /cms/pages/2026-03/site-pages/{objectId}/draft
        withRawResponse().updateDraft(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebsitePageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebsitePageServiceAsync.WithRawResponse =
            WebsitePageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun create(
            params: WebsitePageCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CmsPage>> {
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

        private val updateHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun update(
            params: WebsitePageUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CmsPage>> {
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
            params: WebsitePageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebsitePageListPageAsync>> {
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
                                WebsitePageListPageAsync.builder()
                                    .service(WebsitePageServiceAsyncImpl(clientOptions))
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
            params: WebsitePageDeleteParams,
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

        private val cloneHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun clone(
            params: WebsitePageCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CmsPage>> {
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

        private val getHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun get(
            params: WebsitePageGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CmsPage>> {
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

        private val getDraftHandler: Handler<CmsPage> =
            jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun getDraft(
            params: WebsitePageGetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CmsPage>> {
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

        private val publishDraftHandler: Handler<Void?> = emptyHandler()

        override fun publishDraft(
            params: WebsitePagePublishDraftParams,
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
                        response.use { publishDraftHandler.handle(it) }
                    }
                }
        }

        private val scheduleHandler: Handler<Void?> = emptyHandler()

        override fun schedule(
            params: WebsitePageScheduleParams,
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

        private val setNewLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setNewLangPrimary(
            params: WebsitePageSetNewLangPrimaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "multi-language",
                        "set-new-lang-primary",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { setNewLangPrimaryHandler.handle(it) }
                    }
                }
        }

        private val updateDraftHandler: Handler<CmsPage> =
            jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: WebsitePageUpdateDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CmsPage>> {
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
                        "site-pages",
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
