// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.sitepages

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
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestCreateSitePageVariationParams
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestEndSitePageTestParams
import com.hubspot.sdk.models.cms.pages.sitepages.abtest.AbTestRerunSitePageTestParams
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

    override fun createSitePageVariation(
        params: AbTestCreateSitePageVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PagesPage> =
        // post /cms/pages/2026-03/site-pages/ab-test/create-variation
        withRawResponse().createSitePageVariation(params, requestOptions).thenApply { it.parse() }

    override fun endSitePageTest(
        params: AbTestEndSitePageTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/ab-test/end
        withRawResponse().endSitePageTest(params, requestOptions).thenAccept {}

    override fun rerunSitePageTest(
        params: AbTestRerunSitePageTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/ab-test/rerun
        withRawResponse().rerunSitePageTest(params, requestOptions).thenAccept {}

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

        private val createSitePageVariationHandler: Handler<PagesPage> =
            jsonHandler<PagesPage>(clientOptions.jsonMapper)

        override fun createSitePageVariation(
            params: AbTestCreateSitePageVariationParams,
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
                        "site-pages",
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
                            .use { createSitePageVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val endSitePageTestHandler: Handler<Void?> = emptyHandler()

        override fun endSitePageTest(
            params: AbTestEndSitePageTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "ab-test", "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { endSitePageTestHandler.handle(it) }
                    }
                }
        }

        private val rerunSitePageTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunSitePageTest(
            params: AbTestRerunSitePageTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "ab-test", "rerun")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { rerunSitePageTestHandler.handle(it) }
                    }
                }
        }
    }
}
