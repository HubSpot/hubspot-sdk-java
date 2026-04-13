// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing.marketingevents

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.json
import com.hubspot.core.prepare
import com.hubspot.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByEmailParams
import com.hubspot.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByIdParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriberStateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriberStateService {

    private val withRawResponse: SubscriberStateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriberStateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriberStateService =
        SubscriberStateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun recordByEmail(
        params: SubscriberStateRecordByEmailParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post
        // /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/email-upsert
        withRawResponse().recordByEmail(params, requestOptions)

    override fun recordById(
        params: SubscriberStateRecordByIdParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post
        // /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/upsert
        withRawResponse().recordById(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriberStateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriberStateService.WithRawResponse =
            SubscriberStateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun recordByEmail(
            params: SubscriberStateRecordByEmailParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun recordById(
            params: SubscriberStateRecordByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
