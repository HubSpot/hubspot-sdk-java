// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
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
import com.hubspot_sdk.api.models.conversations.BatchResponsePublicActor
import com.hubspot_sdk.api.models.conversations.PublicActor
import com.hubspot_sdk.api.models.conversations.actors.ActorBatchReadParams
import com.hubspot_sdk.api.models.conversations.actors.ActorGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActorServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActorServiceAsync {

    private val withRawResponse: ActorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActorServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActorServiceAsync =
        ActorServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchRead(
        params: ActorBatchReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicActor> =
        // post /conversations/v3/conversations/actors/batch/read
        withRawResponse().batchRead(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: ActorGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActor> =
        // get /conversations/v3/conversations/actors/{actorId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActorServiceAsync.WithRawResponse =
            ActorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchReadHandler: Handler<BatchResponsePublicActor> =
            jsonHandler<BatchResponsePublicActor>(clientOptions.jsonMapper)

        override fun batchRead(
            params: ActorBatchReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicActor>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "v3",
                        "conversations",
                        "actors",
                        "batch",
                        "read",
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
                            .use { batchReadHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicActor> =
            jsonHandler<PublicActor>(clientOptions.jsonMapper)

        override fun get(
            params: ActorGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActor>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("actorId", params.actorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conversations",
                        "v3",
                        "conversations",
                        "actors",
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
