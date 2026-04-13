// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing.marketingevents

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.marketing.marketingevents.AttendanceCounters
import com.hubspot.models.marketing.marketingevents.CollectionResponseWithTotalParticipationBreakdown
import com.hubspot.models.marketing.marketingevents.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot.models.marketing.marketingevents.participations.ParticipationGetByIdParams
import com.hubspot.models.marketing.marketingevents.participations.ParticipationListBreakdownByContactPage
import com.hubspot.models.marketing.marketingevents.participations.ParticipationListBreakdownByContactParams
import com.hubspot.models.marketing.marketingevents.participations.ParticipationListBreakdownByExternalAccountAndEventIdPage
import com.hubspot.models.marketing.marketingevents.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import com.hubspot.models.marketing.marketingevents.participations.ParticipationListBreakdownByIdPage
import com.hubspot.models.marketing.marketingevents.participations.ParticipationListBreakdownByIdParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ParticipationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ParticipationService {

    private val withRawResponse: ParticipationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ParticipationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipationService =
        ParticipationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getByExternalAccountAndEventId(
        params: ParticipationGetByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions,
    ): AttendanceCounters =
        // get
        // /marketing/marketing-events/2026-03/participations/{externalAccountId}/{externalEventId}
        withRawResponse().getByExternalAccountAndEventId(params, requestOptions).parse()

    override fun getById(
        params: ParticipationGetByIdParams,
        requestOptions: RequestOptions,
    ): AttendanceCounters =
        // get /marketing/marketing-events/2026-03/participations/{marketingEventId}
        withRawResponse().getById(params, requestOptions).parse()

    override fun listBreakdownByContact(
        params: ParticipationListBreakdownByContactParams,
        requestOptions: RequestOptions,
    ): ParticipationListBreakdownByContactPage =
        // get
        // /marketing/marketing-events/2026-03/participations/contacts/{contactIdentifier}/breakdown
        withRawResponse().listBreakdownByContact(params, requestOptions).parse()

    override fun listBreakdownByExternalAccountAndEventId(
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions,
    ): ParticipationListBreakdownByExternalAccountAndEventIdPage =
        // get
        // /marketing/marketing-events/2026-03/participations/{externalAccountId}/{externalEventId}/breakdown
        withRawResponse().listBreakdownByExternalAccountAndEventId(params, requestOptions).parse()

    override fun listBreakdownById(
        params: ParticipationListBreakdownByIdParams,
        requestOptions: RequestOptions,
    ): ParticipationListBreakdownByIdPage =
        // get /marketing/marketing-events/2026-03/participations/{marketingEventId}/breakdown
        withRawResponse().listBreakdownById(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ParticipationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipationService.WithRawResponse =
            ParticipationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getByExternalAccountAndEventIdHandler: Handler<AttendanceCounters> =
            jsonHandler<AttendanceCounters>(clientOptions.jsonMapper)

        override fun getByExternalAccountAndEventId(
            params: ParticipationGetByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttendanceCounters> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "participations",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByExternalAccountAndEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByIdHandler: Handler<AttendanceCounters> =
            jsonHandler<AttendanceCounters>(clientOptions.jsonMapper)

        override fun getById(
            params: ParticipationGetByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttendanceCounters> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("marketingEventId", params.marketingEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "participations",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBreakdownByContactHandler:
            Handler<CollectionResponseWithTotalParticipationBreakdown> =
            jsonHandler<CollectionResponseWithTotalParticipationBreakdown>(clientOptions.jsonMapper)

        override fun listBreakdownByContact(
            params: ParticipationListBreakdownByContactParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipationListBreakdownByContactPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactIdentifier", params.contactIdentifier().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "participations",
                        "contacts",
                        params._pathParam(0),
                        "breakdown",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBreakdownByContactHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ParticipationListBreakdownByContactPage.builder()
                            .service(ParticipationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listBreakdownByExternalAccountAndEventIdHandler:
            Handler<CollectionResponseWithTotalParticipationBreakdown> =
            jsonHandler<CollectionResponseWithTotalParticipationBreakdown>(clientOptions.jsonMapper)

        override fun listBreakdownByExternalAccountAndEventId(
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "participations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "breakdown",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBreakdownByExternalAccountAndEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ParticipationListBreakdownByExternalAccountAndEventIdPage.builder()
                            .service(ParticipationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listBreakdownByIdHandler:
            Handler<CollectionResponseWithTotalParticipationBreakdown> =
            jsonHandler<CollectionResponseWithTotalParticipationBreakdown>(clientOptions.jsonMapper)

        override fun listBreakdownById(
            params: ParticipationListBreakdownByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipationListBreakdownByIdPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("marketingEventId", params.marketingEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        "participations",
                        params._pathParam(0),
                        "breakdown",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBreakdownByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ParticipationListBreakdownByIdPage.builder()
                            .service(ParticipationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
