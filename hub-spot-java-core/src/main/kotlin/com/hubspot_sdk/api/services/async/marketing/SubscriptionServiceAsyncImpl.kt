// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

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
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicSubscriptionStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicSubscriptionStatusesResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionDefinitionsResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionGetEmailStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionListParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionSubscribeParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionUnsubscribeParams
import com.hubspot_sdk.api.services.async.marketing.subscriptions.V4ServiceAsync
import com.hubspot_sdk.api.services.async.marketing.subscriptions.V4ServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v4: V4ServiceAsync by lazy { V4ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync =
        SubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v4(): V4ServiceAsync = v4

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionDefinitionsResponse> =
        // get /communication-preferences/v3/definitions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getEmailStatus(
        params: SubscriptionGetEmailStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSubscriptionStatusesResponse> =
        // get /communication-preferences/v3/status/email/{emailAddress}
        withRawResponse().getEmailStatus(params, requestOptions).thenApply { it.parse() }

    override fun subscribe(
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSubscriptionStatus> =
        // post /communication-preferences/v3/subscribe
        withRawResponse().subscribe(params, requestOptions).thenApply { it.parse() }

    override fun unsubscribe(
        params: SubscriptionUnsubscribeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSubscriptionStatus> =
        // post /communication-preferences/v3/unsubscribe
        withRawResponse().unsubscribe(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val v4: V4ServiceAsync.WithRawResponse by lazy {
            V4ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse =
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v4(): V4ServiceAsync.WithRawResponse = v4

        private val listHandler: Handler<SubscriptionDefinitionsResponse> =
            jsonHandler<SubscriptionDefinitionsResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionDefinitionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v3", "definitions")
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
                    }
                }
        }

        private val getEmailStatusHandler: Handler<PublicSubscriptionStatusesResponse> =
            jsonHandler<PublicSubscriptionStatusesResponse>(clientOptions.jsonMapper)

        override fun getEmailStatus(
            params: SubscriptionGetEmailStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatusesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailAddress", params.emailAddress().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v3",
                        "status",
                        "email",
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
                            .use { getEmailStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val subscribeHandler: Handler<PublicSubscriptionStatus> =
            jsonHandler<PublicSubscriptionStatus>(clientOptions.jsonMapper)

        override fun subscribe(
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v3", "subscribe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { subscribeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unsubscribeHandler: Handler<PublicSubscriptionStatus> =
            jsonHandler<PublicSubscriptionStatus>(clientOptions.jsonMapper)

        override fun unsubscribe(
            params: SubscriptionUnsubscribeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v3", "unsubscribe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { unsubscribeHandler.handle(it) }
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
