// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
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
import com.hubspot.sdk.models.cms.pages.PageData
import com.hubspot.sdk.models.cms.pages.abtests.ABTestCreateLandingPageVariationParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestCreateSitePageVariationParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestEndLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestEndSitePageTestParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestRerunLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.abtests.ABTestRerunSitePageTestParams
import java.util.function.Consumer

class ABTestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ABTestService {

    private val withRawResponse: ABTestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ABTestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestService =
        ABTestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createLandingPageVariation(
        params: ABTestCreateLandingPageVariationParams,
        requestOptions: RequestOptions,
    ): PageData =
        // post /cms/pages/2026-03/landing-pages/ab-test/create-variation
        withRawResponse().createLandingPageVariation(params, requestOptions).parse()

    override fun createSitePageVariation(
        params: ABTestCreateSitePageVariationParams,
        requestOptions: RequestOptions,
    ): PageData =
        // post /cms/pages/2026-03/site-pages/ab-test/create-variation
        withRawResponse().createSitePageVariation(params, requestOptions).parse()

    override fun endLandingPageTest(
        params: ABTestEndLandingPageTestParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/landing-pages/ab-test/end
        withRawResponse().endLandingPageTest(params, requestOptions)
    }

    override fun endSitePageTest(
        params: ABTestEndSitePageTestParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/site-pages/ab-test/end
        withRawResponse().endSitePageTest(params, requestOptions)
    }

    override fun rerunLandingPageTest(
        params: ABTestRerunLandingPageTestParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/landing-pages/ab-test/rerun
        withRawResponse().rerunLandingPageTest(params, requestOptions)
    }

    override fun rerunSitePageTest(
        params: ABTestRerunSitePageTestParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/site-pages/ab-test/rerun
        withRawResponse().rerunSitePageTest(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ABTestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ABTestService.WithRawResponse =
            ABTestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createLandingPageVariationHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun createLandingPageVariation(
            params: ABTestCreateLandingPageVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageData> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "ab-test",
                        "create-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLandingPageVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createSitePageVariationHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun createSitePageVariation(
            params: ABTestCreateSitePageVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageData> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
                        "ab-test",
                        "create-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createSitePageVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val endLandingPageTestHandler: Handler<Void?> = emptyHandler()

        override fun endLandingPageTest(
            params: ABTestEndLandingPageTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "ab-test", "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { endLandingPageTestHandler.handle(it) }
            }
        }

        private val endSitePageTestHandler: Handler<Void?> = emptyHandler()

        override fun endSitePageTest(
            params: ABTestEndSitePageTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "ab-test", "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { endSitePageTestHandler.handle(it) }
            }
        }

        private val rerunLandingPageTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunLandingPageTest(
            params: ABTestRerunLandingPageTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "ab-test", "rerun")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { rerunLandingPageTestHandler.handle(it) }
            }
        }

        private val rerunSitePageTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunSitePageTest(
            params: ABTestRerunSitePageTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "ab-test", "rerun")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { rerunSitePageTestHandler.handle(it) }
            }
        }
    }
}
