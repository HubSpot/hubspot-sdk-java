// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalenderMeetingEventResponse
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBookingResponse
import com.hubspot_sdk.api.models.scheduler.meetings.advanced.AdvancedBookParams
import com.hubspot_sdk.api.models.scheduler.meetings.advanced.AdvancedCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AdvancedServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdvancedServiceAsync {

    private val withRawResponse: AdvancedServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AdvancedServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedServiceAsync =
        AdvancedServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AdvancedCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalCalenderMeetingEventResponse> =
        // post /scheduler/2026-03/meetings/calendar
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun book(
        params: AdvancedBookParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMeetingBookingResponse> =
        // post /scheduler/2026-03/meetings/meeting-links/book
        withRawResponse().book(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdvancedServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedServiceAsync.WithRawResponse =
            AdvancedServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExternalCalenderMeetingEventResponse> =
            jsonHandler<ExternalCalenderMeetingEventResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AdvancedCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalCalenderMeetingEventResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "2026-03", "meetings", "calendar")
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

        private val bookHandler: Handler<ExternalMeetingBookingResponse> =
            jsonHandler<ExternalMeetingBookingResponse>(clientOptions.jsonMapper)

        override fun book(
            params: AdvancedBookParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "2026-03", "meetings", "meeting-links", "book")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { bookHandler.handle(it) }
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
