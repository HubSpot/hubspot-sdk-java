// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.abtests.ABTestRerunAbTestParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ABTestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ABTestServiceAsync {

    private val withRawResponse: ABTestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ABTestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ABTestServiceAsync =
        ABTestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAbTestVariation(
        params: ABTestCreateAbTestVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Page> =
        // post /cms/pages/2026-03/site-pages/ab-test/create-variation
        withRawResponse().createAbTestVariation(params, requestOptions).thenApply { it.parse() }

    override fun endAbTest(
        params: ABTestEndAbTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/ab-test/end
        withRawResponse().endAbTest(params, requestOptions).thenAccept {}

    override fun rerunAbTest(
        params: ABTestRerunAbTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/ab-test/rerun
        withRawResponse().rerunAbTest(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ABTestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ABTestServiceAsync.WithRawResponse =
            ABTestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createAbTestVariationHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun createAbTestVariation(
            params: ABTestCreateAbTestVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> {
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
                            .use { createAbTestVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val endAbTestHandler: Handler<Void?> = emptyHandler()

        override fun endAbTest(
            params: ABTestEndAbTestParams,
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
                        response.use { endAbTestHandler.handle(it) }
                    }
                }
        }

        private val rerunAbTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunAbTest(
            params: ABTestRerunAbTestParams,
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
                        response.use { rerunAbTestHandler.handle(it) }
                    }
                }
        }
    }
}
