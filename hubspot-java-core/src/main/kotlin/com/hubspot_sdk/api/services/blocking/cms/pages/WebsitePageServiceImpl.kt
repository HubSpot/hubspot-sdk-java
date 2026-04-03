// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

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
import com.hubspot_sdk.api.models.cms.pages.CmsPage
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCloneParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCreateParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListPage
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebsitePageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebsitePageService {

    private val withRawResponse: WebsitePageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebsitePageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsitePageService =
        WebsitePageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: WebsitePageCreateParams, requestOptions: RequestOptions): CmsPage =
        // post /cms/pages/2026-03/site-pages
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: WebsitePageUpdateParams, requestOptions: RequestOptions): CmsPage =
        // patch /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WebsitePageListParams,
        requestOptions: RequestOptions,
    ): WebsitePageListPage =
        // get /cms/pages/2026-03/site-pages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: WebsitePageDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun clone(params: WebsitePageCloneParams, requestOptions: RequestOptions): CmsPage =
        // post /cms/pages/2026-03/site-pages/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun get(params: WebsitePageGetParams, requestOptions: RequestOptions): CmsPage =
        // get /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getDraft(
        params: WebsitePageGetDraftParams,
        requestOptions: RequestOptions,
    ): CmsPage =
        // get /cms/pages/2026-03/site-pages/{objectId}/draft
        withRawResponse().getDraft(params, requestOptions).parse()

    override fun publishDraft(
        params: WebsitePagePublishDraftParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/site-pages/{objectId}/draft/push-live
        withRawResponse().publishDraft(params, requestOptions)
    }

    override fun schedule(params: WebsitePageScheduleParams, requestOptions: RequestOptions) {
        // post /cms/pages/2026-03/site-pages/schedule
        withRawResponse().schedule(params, requestOptions)
    }

    override fun setNewLangPrimary(
        params: WebsitePageSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ) {
        // put /cms/pages/2026-03/landing-pages/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions)
    }

    override fun updateDraft(
        params: WebsitePageUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CmsPage =
        // patch /cms/pages/2026-03/site-pages/{objectId}/draft
        withRawResponse().updateDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebsitePageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebsitePageService.WithRawResponse =
            WebsitePageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun create(
            params: WebsitePageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CmsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun update(
            params: WebsitePageUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CmsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseWithTotalPageForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPageForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: WebsitePageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebsitePageListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        WebsitePageListPage.builder()
                            .service(WebsitePageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: WebsitePageDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val cloneHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun clone(
            params: WebsitePageCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CmsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<CmsPage> = jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun get(
            params: WebsitePageGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CmsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDraftHandler: Handler<CmsPage> =
            jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun getDraft(
            params: WebsitePageGetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CmsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val publishDraftHandler: Handler<Void?> = emptyHandler()

        override fun publishDraft(
            params: WebsitePagePublishDraftParams,
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
                        "push-live",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { publishDraftHandler.handle(it) }
            }
        }

        private val scheduleHandler: Handler<Void?> = emptyHandler()

        override fun schedule(
            params: WebsitePageScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { scheduleHandler.handle(it) }
            }
        }

        private val setNewLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setNewLangPrimary(
            params: WebsitePageSetNewLangPrimaryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setNewLangPrimaryHandler.handle(it) }
            }
        }

        private val updateDraftHandler: Handler<CmsPage> =
            jsonHandler<CmsPage>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: WebsitePageUpdateDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CmsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
