// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
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
import com.hubspot.sdk.models.cms.pages.CollectionResponseWithTotalPageVersion
import com.hubspot.sdk.models.cms.pages.PageVersion
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionListLandingPageRevisionsPage
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionListLandingPageRevisionsParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionToDraftParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RevisionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RevisionService {

    private val withRawResponse: RevisionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RevisionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionService =
        RevisionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getLandingPageRevision(
        params: RevisionGetLandingPageRevisionParams,
        requestOptions: RequestOptions,
    ): PageVersion =
        // get /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getLandingPageRevision(params, requestOptions).parse()

    override fun listLandingPageRevisions(
        params: RevisionListLandingPageRevisionsParams,
        requestOptions: RequestOptions,
    ): RevisionListLandingPageRevisionsPage =
        // get /cms/pages/2026-03/landing-pages/{objectId}/revisions
        withRawResponse().listLandingPageRevisions(params, requestOptions).parse()

    override fun restoreLandingPageRevision(
        params: RevisionRestoreLandingPageRevisionParams,
        requestOptions: RequestOptions,
    ): PagesPage =
        // post /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreLandingPageRevision(params, requestOptions).parse()

    override fun restoreLandingPageRevisionToDraft(
        params: RevisionRestoreLandingPageRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): PagesPage =
        // post /cms/pages/2026-03/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreLandingPageRevisionToDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RevisionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevisionService.WithRawResponse =
            RevisionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getLandingPageRevisionHandler: Handler<PageVersion> =
            jsonHandler<PageVersion>(clientOptions.jsonMapper)

        override fun getLandingPageRevision(
            params: RevisionGetLandingPageRevisionParams,
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
                        "landing-pages",
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
                    .use { getLandingPageRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLandingPageRevisionsHandler:
            Handler<CollectionResponseWithTotalPageVersion> =
            jsonHandler<CollectionResponseWithTotalPageVersion>(clientOptions.jsonMapper)

        override fun listLandingPageRevisions(
            params: RevisionListLandingPageRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RevisionListLandingPageRevisionsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLandingPageRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RevisionListLandingPageRevisionsPage.builder()
                            .service(RevisionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val restoreLandingPageRevisionHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun restoreLandingPageRevision(
            params: RevisionRestoreLandingPageRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreLandingPageRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val restoreLandingPageRevisionToDraftHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun restoreLandingPageRevisionToDraft(
            params: RevisionRestoreLandingPageRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
