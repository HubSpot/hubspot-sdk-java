// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal.subscriptions

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
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.FilterCreateResponse
import com.hubspot.sdk.models.FilterResponse
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterCreateParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterDeleteParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterGetParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FilterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FilterServiceAsync {

    private val withRawResponse: FilterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FilterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FilterServiceAsync =
        FilterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FilterCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterCreateResponse> =
        // post /webhooks-journal/subscriptions/2026-03/filters
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FilterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        // get /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FilterDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: FilterGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterResponse> =
        // get /webhooks-journal/subscriptions/2026-03/filters/{filterId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FilterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FilterServiceAsync.WithRawResponse =
            FilterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FilterCreateResponse> =
            jsonHandler<FilterCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FilterCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "subscriptions", "2026-03", "filters")
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

        private val listHandler: Handler<List<FilterResponse>> =
            jsonHandler<List<FilterResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: FilterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        "filters",
                        "subscription",
                        params._pathParam(0),
                    )
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FilterDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("filterId", params.filterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        "filters",
                        params._pathParam(0),
                    )
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

        private val getHandler: Handler<FilterResponse> =
            jsonHandler<FilterResponse>(clientOptions.jsonMapper)

        override fun get(
            params: FilterGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("filterId", params.filterId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "subscriptions",
                        "2026-03",
                        "filters",
                        params._pathParam(0),
                    )
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
