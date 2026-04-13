// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.marketingevents

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.marketing.marketingevents.BatchResponseSubscriberEmailResponse
import com.hubspot.sdk.models.marketing.marketingevents.BatchResponseSubscriberVidResponse
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByEventIdAndContactIdParams
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByEventIdAndEmailParams
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByExternalEventIdAndContactIdParams
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByExternalEventIdAndEmailParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AttendanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AttendanceService {

    private val withRawResponse: AttendanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttendanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttendanceService =
        AttendanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createByEventIdAndContactId(
        params: AttendanceCreateByEventIdAndContactIdParams,
        requestOptions: RequestOptions,
    ): BatchResponseSubscriberVidResponse =
        // post /marketing/marketing-events/2026-03/{objectId}/attendance/{subscriberState}/create
        withRawResponse().createByEventIdAndContactId(params, requestOptions).parse()

    override fun createByEventIdAndEmail(
        params: AttendanceCreateByEventIdAndEmailParams,
        requestOptions: RequestOptions,
    ): BatchResponseSubscriberEmailResponse =
        // post
        // /marketing/marketing-events/2026-03/{objectId}/attendance/{subscriberState}/email-create
        withRawResponse().createByEventIdAndEmail(params, requestOptions).parse()

    override fun createByExternalEventIdAndContactId(
        params: AttendanceCreateByExternalEventIdAndContactIdParams,
        requestOptions: RequestOptions,
    ): BatchResponseSubscriberVidResponse =
        // post
        // /marketing/marketing-events/2026-03/attendance/{externalEventId}/{subscriberState}/create
        withRawResponse().createByExternalEventIdAndContactId(params, requestOptions).parse()

    override fun createByExternalEventIdAndEmail(
        params: AttendanceCreateByExternalEventIdAndEmailParams,
        requestOptions: RequestOptions,
    ): BatchResponseSubscriberEmailResponse =
        // post
        // /marketing/marketing-events/2026-03/attendance/{externalEventId}/{subscriberState}/email-create
        withRawResponse().createByExternalEventIdAndEmail(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttendanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttendanceService.WithRawResponse =
            AttendanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createByEventIdAndContactIdHandler:
            Handler<BatchResponseSubscriberVidResponse> =
            jsonHandler<BatchResponseSubscriberVidResponse>(clientOptions.jsonMapper)

        override fun createByEventIdAndContactId(
            params: AttendanceCreateByEventIdAndContactIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> {
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
                        params._pathParam(0),
                        "attendance",
                        params._pathParam(1),
                        "create",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createByEventIdAndContactIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createByEventIdAndEmailHandler: Handler<BatchResponseSubscriberEmailResponse> =
            jsonHandler<BatchResponseSubscriberEmailResponse>(clientOptions.jsonMapper)

        override fun createByEventIdAndEmail(
            params: AttendanceCreateByEventIdAndEmailParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> {
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
                        params._pathParam(0),
                        "attendance",
                        params._pathParam(1),
                        "email-create",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createByEventIdAndEmailHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> {
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
                        "attendance",
                        params._pathParam(0),
                        params._pathParam(1),
                        "create",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createByExternalEventIdAndContactIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> {
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
                        "attendance",
                        params._pathParam(0),
                        params._pathParam(1),
                        "email-create",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
