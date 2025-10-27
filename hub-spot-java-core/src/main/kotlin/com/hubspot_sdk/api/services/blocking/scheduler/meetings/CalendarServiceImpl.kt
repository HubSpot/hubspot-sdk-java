// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler.meetings

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalenderMeetingEventResponse
import com.hubspot_sdk.api.models.scheduler.meetings.calendar.CalendarCreateParams
import java.util.function.Consumer

class CalendarServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarService {

    private val withRawResponse: CalendarService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CalendarService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService =
        CalendarServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CalendarCreateParams,
        requestOptions: RequestOptions,
    ): ExternalCalenderMeetingEventResponse =
        // post /scheduler/v3/meetings/calendar
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarService.WithRawResponse =
            CalendarServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExternalCalenderMeetingEventResponse> =
            jsonHandler<ExternalCalenderMeetingEventResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CalendarCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalCalenderMeetingEventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "v3", "meetings", "calendar")
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
    }
}
