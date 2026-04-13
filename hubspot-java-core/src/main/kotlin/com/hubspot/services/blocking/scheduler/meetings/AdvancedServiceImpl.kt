// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.scheduler.meetings

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.scheduler.meetings.ExternalCalenderMeetingEventResponse
import com.hubspot.models.scheduler.meetings.ExternalMeetingBookingResponse
import com.hubspot.models.scheduler.meetings.advanced.AdvancedBookParams
import com.hubspot.models.scheduler.meetings.advanced.AdvancedCreateParams
import java.util.function.Consumer

class AdvancedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdvancedService {

    private val withRawResponse: AdvancedService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AdvancedService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedService =
        AdvancedServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AdvancedCreateParams,
        requestOptions: RequestOptions,
    ): ExternalCalenderMeetingEventResponse =
        // post /scheduler/2026-03/meetings/calendar
        withRawResponse().create(params, requestOptions).parse()

    override fun book(
        params: AdvancedBookParams,
        requestOptions: RequestOptions,
    ): ExternalMeetingBookingResponse =
        // post /scheduler/2026-03/meetings/meeting-links/book
        withRawResponse().book(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdvancedService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedService.WithRawResponse =
            AdvancedServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExternalCalenderMeetingEventResponse> =
            jsonHandler<ExternalCalenderMeetingEventResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AdvancedCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalCalenderMeetingEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "2026-03", "meetings", "calendar")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val bookHandler: Handler<ExternalMeetingBookingResponse> =
            jsonHandler<ExternalMeetingBookingResponse>(clientOptions.jsonMapper)

        override fun book(
            params: AdvancedBookParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMeetingBookingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "2026-03", "meetings", "meeting-links", "book")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
