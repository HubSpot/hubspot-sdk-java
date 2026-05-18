// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.landingpages

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
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestCreateLandingPageVariationParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestEndLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestRerunLandingPageTestParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AbTestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AbTestServiceAsync {

    private val withRawResponse: AbTestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AbTestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AbTestServiceAsync =
        AbTestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createLandingPageVariation(
        params: AbTestCreateLandingPageVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // post /cms/pages/2026-03/landing-pages/ab-test/create-variation
        withRawResponse().createLandingPageVariation(params, requestOptions).thenApply {
            it.parse()
        }

    override fun endLandingPageTest(
        params: AbTestEndLandingPageTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/ab-test/end
        withRawResponse().endLandingPageTest(params, requestOptions).thenAccept {}

    override fun rerunLandingPageTest(
        params: AbTestRerunLandingPageTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/ab-test/rerun
        withRawResponse().rerunLandingPageTest(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AbTestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AbTestServiceAsync.WithRawResponse =
            AbTestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createLandingPageVariationHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun createLandingPageVariation(
            params: AbTestCreateLandingPageVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createLandingPageVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val endLandingPageTestHandler: Handler<Void?> = emptyHandler()

        override fun endLandingPageTest(
            params: AbTestEndLandingPageTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "ab-test", "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { endLandingPageTestHandler.handle(it) }
                    }
                }
        }

        private val rerunLandingPageTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunLandingPageTest(
            params: AbTestRerunLandingPageTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "ab-test", "rerun")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { rerunLandingPageTestHandler.handle(it) }
                    }
                }
        }
    }
}
