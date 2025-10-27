// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

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
import com.hubspot_sdk.api.models.marketing.events.BatchResponseSubscriberEmailResponse
import com.hubspot_sdk.api.models.marketing.events.BatchResponseSubscriberVidResponse
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByEventIdAndEmailParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByExternalEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByExternalEventIdAndEmailParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AttendanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AttendanceServiceAsync {

    private val withRawResponse: AttendanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttendanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttendanceServiceAsync =
        AttendanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createByEventIdAndContactId(
        params: AttendanceCreateByEventIdAndContactIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        // post /marketing/v3/marketing-events/{objectId}/attendance/{subscriberState}/create
        withRawResponse().createByEventIdAndContactId(params, requestOptions).thenApply {
            it.parse()
        }

    override fun createByEventIdAndEmail(
        params: AttendanceCreateByEventIdAndEmailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        // post /marketing/v3/marketing-events/{objectId}/attendance/{subscriberState}/email-create
        withRawResponse().createByEventIdAndEmail(params, requestOptions).thenApply { it.parse() }

    override fun createByExternalEventIdAndContactId(
        params: AttendanceCreateByExternalEventIdAndContactIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        // post /marketing/v3/marketing-events/attendance/{externalEventId}/{subscriberState}/create
        withRawResponse().createByExternalEventIdAndContactId(params, requestOptions).thenApply {
            it.parse()
        }

    override fun createByExternalEventIdAndEmail(
        params: AttendanceCreateByExternalEventIdAndEmailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        // post
        // /marketing/v3/marketing-events/attendance/{externalEventId}/{subscriberState}/email-create
        withRawResponse().createByExternalEventIdAndEmail(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttendanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttendanceServiceAsync.WithRawResponse =
            AttendanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createByEventIdAndContactIdHandler:
            Handler<BatchResponseSubscriberVidResponse> =
            jsonHandler<BatchResponseSubscriberVidResponse>(clientOptions.jsonMapper)

        override fun createByEventIdAndContactId(
            params: AttendanceCreateByEventIdAndContactIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberState", params.subscriberState().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        params._pathParam(0),
                        "attendance",
                        params._pathParam(1),
                        "create",
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
                            .use { createByEventIdAndContactIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createByEventIdAndEmailHandler: Handler<BatchResponseSubscriberEmailResponse> =
            jsonHandler<BatchResponseSubscriberEmailResponse>(clientOptions.jsonMapper)

        override fun createByEventIdAndEmail(
            params: AttendanceCreateByEventIdAndEmailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberState", params.subscriberState().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        params._pathParam(0),
                        "attendance",
                        params._pathParam(1),
                        "email-create",
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
                            .use { createByEventIdAndEmailHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createByExternalEventIdAndContactIdHandler:
            Handler<BatchResponseSubscriberVidResponse> =
            jsonHandler<BatchResponseSubscriberVidResponse>(clientOptions.jsonMapper)

        override fun createByExternalEventIdAndContactId(
            params: AttendanceCreateByExternalEventIdAndContactIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberState", params.subscriberState().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "attendance",
                        params._pathParam(0),
                        params._pathParam(1),
                        "create",
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
                            .use { createByExternalEventIdAndContactIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createByExternalEventIdAndEmailHandler:
            Handler<BatchResponseSubscriberEmailResponse> =
            jsonHandler<BatchResponseSubscriberEmailResponse>(clientOptions.jsonMapper)

        override fun createByExternalEventIdAndEmail(
            params: AttendanceCreateByExternalEventIdAndEmailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberState", params.subscriberState().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "attendance",
                        params._pathParam(0),
                        params._pathParam(1),
                        "email-create",
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
                            .use { createByExternalEventIdAndEmailHandler.handle(it) }
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
