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
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageListPage
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageUpdateParams
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.AbTestService
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.AbTestServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.BatchService
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.BatchServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.DraftService
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.DraftServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.FolderService
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.FolderServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.MultiLanguageService
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.MultiLanguageServiceImpl
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.RevisionService
import com.hubspot.sdk.services.blocking.cms.pages.landingpages.RevisionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LandingPageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LandingPageService {

    private val withRawResponse: LandingPageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val abTest: AbTestService by lazy { AbTestServiceImpl(clientOptions) }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val draft: DraftService by lazy { DraftServiceImpl(clientOptions) }

    private val folders: FolderService by lazy { FolderServiceImpl(clientOptions) }

    private val multiLanguage: MultiLanguageService by lazy {
        MultiLanguageServiceImpl(clientOptions)
    }

    private val revisions: RevisionService by lazy { RevisionServiceImpl(clientOptions) }

    override fun withRawResponse(): LandingPageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageService =
        LandingPageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun abTest(): AbTestService = abTest

    override fun batch(): BatchService = batch

    override fun draft(): DraftService = draft

    override fun folders(): FolderService = folders

    override fun multiLanguage(): MultiLanguageService = multiLanguage

    override fun revisions(): RevisionService = revisions

    override fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions,
    ): PagesPage =
        // post /cms/pages/2026-03/landing-pages
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions,
    ): PagesPage =
        // patch /cms/pages/2026-03/landing-pages/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LandingPageListParams,
        requestOptions: RequestOptions,
    ): LandingPageListPage =
        // get /cms/pages/2026-03/landing-pages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LandingPageDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/pages/2026-03/landing-pages/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun clone(params: LandingPageCloneParams, requestOptions: RequestOptions): PagesPage =
        // post /cms/pages/2026-03/landing-pages/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun get(params: LandingPageGetParams, requestOptions: RequestOptions): PagesPage =
        // get /cms/pages/2026-03/landing-pages/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun schedule(params: LandingPageScheduleParams, requestOptions: RequestOptions) {
        // post /cms/pages/2026-03/landing-pages/schedule
        withRawResponse().schedule(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LandingPageService.WithRawResponse {

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

        private val folders: FolderService.WithRawResponse by lazy {
            FolderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val multiLanguage: MultiLanguageService.WithRawResponse by lazy {
            MultiLanguageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val revisions: RevisionService.WithRawResponse by lazy {
            RevisionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageService.WithRawResponse =
            LandingPageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun abTest(): AbTestService.WithRawResponse = abTest

        override fun batch(): BatchService.WithRawResponse = batch

        override fun draft(): DraftService.WithRawResponse = draft

        override fun folders(): FolderService.WithRawResponse = folders

        override fun multiLanguage(): MultiLanguageService.WithRawResponse = multiLanguage

        override fun revisions(): RevisionService.WithRawResponse = revisions

        private val createHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages")
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
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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
            params: LandingPageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LandingPageListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages")
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
                        LandingPageListPage.builder()
                            .service(LandingPageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LandingPageDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
            params: LandingPageCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "clone")
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
            params: LandingPageGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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
            params: LandingPageScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "schedule")
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
