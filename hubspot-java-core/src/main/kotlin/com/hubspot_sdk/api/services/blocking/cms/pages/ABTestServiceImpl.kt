// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestRerunAbTestParams
import java.util.function.Consumer

class ABTestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ABTestService {

    private val withRawResponse: ABTestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ABTestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestService =
        ABTestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAbTestVariation(
        params: ABTestCreateAbTestVariationParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/pages/2026-03/site-pages/ab-test/create-variation
        withRawResponse().createAbTestVariation(params, requestOptions).parse()

    override fun endAbTest(params: ABTestEndAbTestParams, requestOptions: RequestOptions) {
        // post /cms/pages/2026-03/site-pages/ab-test/end
        withRawResponse().endAbTest(params, requestOptions)
    }

    override fun rerunAbTest(params: ABTestRerunAbTestParams, requestOptions: RequestOptions) {
        // post /cms/pages/2026-03/site-pages/ab-test/rerun
        withRawResponse().rerunAbTest(params, requestOptions)
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

        private val createAbTestVariationHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun createAbTestVariation(
            params: ABTestCreateAbTestVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
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
                    .use { createAbTestVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val endAbTestHandler: Handler<Void?> = emptyHandler()

        override fun endAbTest(
            params: ABTestEndAbTestParams,
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
                response.use { endAbTestHandler.handle(it) }
            }
        }

        private val rerunAbTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunAbTest(
            params: ABTestRerunAbTestParams,
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
                response.use { rerunAbTestHandler.handle(it) }
            }
        }
    }
}
