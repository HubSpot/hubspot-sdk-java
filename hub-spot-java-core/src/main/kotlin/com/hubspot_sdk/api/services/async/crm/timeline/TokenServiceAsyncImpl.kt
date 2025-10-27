// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

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
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenCreateParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenServiceAsync {

    private val withRawResponse: TokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenServiceAsync =
        TokenServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TimelineEventTemplateToken> =
        // post /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TokenUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TimelineEventTemplateToken> =
        // put /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens/{tokenName}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens/{tokenName}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenServiceAsync.WithRawResponse =
            TokenServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TimelineEventTemplateToken> =
            jsonHandler<TimelineEventTemplateToken>(clientOptions.jsonMapper)

        override fun create(
            params: TokenCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventTemplateId", params.eventTemplateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                        params._pathParam(1),
                        "tokens",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<TimelineEventTemplateToken> =
            jsonHandler<TimelineEventTemplateToken>(clientOptions.jsonMapper)

        override fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tokenName", params.tokenName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                        params._pathParam(1),
                        "tokens",
                        params._pathParam(2),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tokenName", params.tokenName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                        params._pathParam(1),
                        "tokens",
                        params._pathParam(2),
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
    }
}
