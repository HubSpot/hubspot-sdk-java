// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.marketingevents

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByEmailParams
import com.hubspot.sdk.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriberStateServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SubscriberStateServiceAsync {

    private val withRawResponse: SubscriberStateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriberStateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SubscriberStateServiceAsync =
        SubscriberStateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun recordByEmail(
        params: SubscriberStateRecordByEmailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post
        // /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/email-upsert
        withRawResponse().recordByEmail(params, requestOptions)

    override fun recordById(
        params: SubscriberStateRecordByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post
        // /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/upsert
        withRawResponse().recordById(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriberStateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriberStateServiceAsync.WithRawResponse =
            SubscriberStateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun recordByEmail(
            params: SubscriberStateRecordByEmailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberState", params.subscriberState().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "events",
                        params._pathParam(0),
                        params._pathParam(1),
                        "email-upsert",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun recordById(
            params: SubscriberStateRecordByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberState", params.subscriberState().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "events",
                        params._pathParam(0),
                        params._pathParam(1),
                        "upsert",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
