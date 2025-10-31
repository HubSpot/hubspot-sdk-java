// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.urlredirects.CollectionResponseWithTotalUrlMappingForwardPaging
import com.hubspot_sdk.api.models.cms.urlredirects.UrlMapping
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectCreateParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectDeleteParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectGetParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectListPageAsync
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectListParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UrlRedirectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UrlRedirectServiceAsync {

    private val withRawResponse: UrlRedirectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UrlRedirectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlRedirectServiceAsync =
        UrlRedirectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UrlRedirectCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlMapping> =
        // post /cms/v3/url-redirects/
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: UrlRedirectUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlMapping> =
        // patch /cms/v3/url-redirects/{urlRedirectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UrlRedirectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlRedirectListPageAsync> =
        // get /cms/v3/url-redirects/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: UrlRedirectDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/v3/url-redirects/{urlRedirectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: UrlRedirectGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlMapping> =
        // get /cms/v3/url-redirects/{urlRedirectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UrlRedirectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UrlRedirectServiceAsync.WithRawResponse =
            UrlRedirectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UrlMapping> =
            jsonHandler<UrlMapping>(clientOptions.jsonMapper)

        override fun create(
            params: UrlRedirectCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlMapping>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "url-redirects", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<UrlMapping> =
            jsonHandler<UrlMapping>(clientOptions.jsonMapper)

        override fun update(
            params: UrlRedirectUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlMapping>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("urlRedirectId", params.urlRedirectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "url-redirects", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponseWithTotalUrlMappingForwardPaging> =
            jsonHandler<CollectionResponseWithTotalUrlMappingForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: UrlRedirectListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlRedirectListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "url-redirects", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                UrlRedirectListPageAsync.builder()
                                    .service(UrlRedirectServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UrlRedirectDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("urlRedirectId", params.urlRedirectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "url-redirects", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<UrlMapping> =
            jsonHandler<UrlMapping>(clientOptions.jsonMapper)

        override fun get(
            params: UrlRedirectGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlMapping>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("urlRedirectId", params.urlRedirectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "url-redirects", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
