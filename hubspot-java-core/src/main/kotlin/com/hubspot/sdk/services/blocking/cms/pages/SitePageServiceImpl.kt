// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageCloneParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageCreateParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageDeleteParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageGetParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListPage
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageScheduleParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageUpdateParams
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.AbTestService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.AbTestServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.BatchService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.BatchServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.DraftService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.DraftServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.MultiLanguageService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.MultiLanguageServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.RevisionService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.RevisionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SitePageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SitePageService {

    private val withRawResponse: SitePageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val abTest: AbTestService by lazy { AbTestServiceImpl(clientOptions) }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val draft: DraftService by lazy { DraftServiceImpl(clientOptions) }

    private val multiLanguage: MultiLanguageService by lazy {
        MultiLanguageServiceImpl(clientOptions)
    }

    private val revisions: RevisionService by lazy { RevisionServiceImpl(clientOptions) }

    override fun withRawResponse(): SitePageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageService =
        SitePageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun abTest(): AbTestService = abTest

    override fun batch(): BatchService = batch

    override fun draft(): DraftService = draft

    override fun multiLanguage(): MultiLanguageService = multiLanguage

    override fun revisions(): RevisionService = revisions

    override fun create(params: SitePageCreateParams, requestOptions: RequestOptions): PagesPage =
        // post /cms/pages/2026-03/site-pages
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: SitePageUpdateParams, requestOptions: RequestOptions): PagesPage =
        // patch /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SitePageListParams,
        requestOptions: RequestOptions,
    ): SitePageListPage =
        // get /cms/pages/2026-03/site-pages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SitePageDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun clone(params: SitePageCloneParams, requestOptions: RequestOptions): PagesPage =
        // post /cms/pages/2026-03/site-pages/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun get(params: SitePageGetParams, requestOptions: RequestOptions): PagesPage =
        // get /cms/pages/2026-03/site-pages/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun schedule(params: SitePageScheduleParams, requestOptions: RequestOptions) {
        // post /cms/pages/2026-03/site-pages/schedule
        withRawResponse().schedule(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SitePageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val abTest: AbTestService.WithRawResponse by lazy {
            AbTestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val draft: DraftService.WithRawResponse by lazy {
            DraftServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val multiLanguage: MultiLanguageService.WithRawResponse by lazy {
            MultiLanguageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val revisions: RevisionService.WithRawResponse by lazy {
            RevisionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SitePageService.WithRawResponse =
            SitePageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun abTest(): AbTestService.WithRawResponse = abTest

        override fun batch(): BatchService.WithRawResponse = batch

        override fun draft(): DraftService.WithRawResponse = draft

        override fun multiLanguage(): MultiLanguageService.WithRawResponse = multiLanguage

        override fun revisions(): RevisionService.WithRawResponse = revisions

        private val createHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun create(
            params: SitePageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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

        private val updateHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun update(
            params: SitePageUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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
            params: SitePageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SitePageListPage> {
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
                        SitePageListPage.builder()
                            .service(SitePageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SitePageDeleteParams,
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

        private val cloneHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun clone(
            params: SitePageCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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

        private val getHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun get(
            params: SitePageGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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

        private val scheduleHandler: Handler<Void?> = emptyHandler()

        override fun schedule(
            params: SitePageScheduleParams,
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
    }
}
