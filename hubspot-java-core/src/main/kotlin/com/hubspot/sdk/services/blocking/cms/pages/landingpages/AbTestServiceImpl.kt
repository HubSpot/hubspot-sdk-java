// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

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
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestCreateLandingPageVariationParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestEndLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestRerunLandingPageTestParams
import java.util.function.Consumer

class AbTestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AbTestService {

    private val withRawResponse: AbTestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AbTestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AbTestService =
        AbTestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createLandingPageVariation(
        params: AbTestCreateLandingPageVariationParams,
        requestOptions: RequestOptions,
    ): PagesPage =
        // post /cms/pages/2026-03/landing-pages/ab-test/create-variation
        withRawResponse().createLandingPageVariation(params, requestOptions).parse()

    override fun endLandingPageTest(
        params: AbTestEndLandingPageTestParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/landing-pages/ab-test/end
        withRawResponse().endLandingPageTest(params, requestOptions)
    }

    override fun rerunLandingPageTest(
        params: AbTestRerunLandingPageTestParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/landing-pages/ab-test/rerun
        withRawResponse().rerunLandingPageTest(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AbTestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AbTestService.WithRawResponse =
            AbTestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createLandingPageVariationHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun createLandingPageVariation(
            params: AbTestCreateLandingPageVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PagesPage> {
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

        private val endLandingPageTestHandler: Handler<Void?> = emptyHandler()

        override fun endLandingPageTest(
            params: AbTestEndLandingPageTestParams,
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

        private val rerunLandingPageTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunLandingPageTest(
            params: AbTestRerunLandingPageTestParams,
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
    }
}
