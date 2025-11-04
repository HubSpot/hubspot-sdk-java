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
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.marketing.events.AttendanceCounters
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalParticipationBreakdownForwardPaging
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactPageAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdPageAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdPageAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ParticipationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ParticipationServiceAsync {

    private val withRawResponse: ParticipationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ParticipationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipationServiceAsync =
        ParticipationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getByExternalAccountAndEventId(
        params: ParticipationGetByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttendanceCounters> =
        // get /marketing/v3/marketing-events/participations/{externalAccountId}/{externalEventId}
        withRawResponse().getByExternalAccountAndEventId(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getById(
        params: ParticipationGetByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttendanceCounters> =
        // get /marketing/v3/marketing-events/participations/{marketingEventId}
        withRawResponse().getById(params, requestOptions).thenApply { it.parse() }

    override fun listBreakdownByContact(
        params: ParticipationListBreakdownByContactParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipationListBreakdownByContactPageAsync> =
        // get /marketing/v3/marketing-events/participations/contacts/{contactIdentifier}/breakdown
        withRawResponse().listBreakdownByContact(params, requestOptions).thenApply { it.parse() }

    override fun listBreakdownByExternalAccountAndEventId(
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync> =
        // get
        // /marketing/v3/marketing-events/participations/{externalAccountId}/{externalEventId}/breakdown
        withRawResponse()
            .listBreakdownByExternalAccountAndEventId(params, requestOptions)
            .thenApply { it.parse() }

    override fun listBreakdownById(
        params: ParticipationListBreakdownByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipationListBreakdownByIdPageAsync> =
        // get /marketing/v3/marketing-events/participations/{marketingEventId}/breakdown
        withRawResponse().listBreakdownById(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ParticipationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipationServiceAsync.WithRawResponse =
            ParticipationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getByExternalAccountAndEventIdHandler: Handler<AttendanceCounters> =
            jsonHandler<AttendanceCounters>(clientOptions.jsonMapper)

        override fun getByExternalAccountAndEventId(
            params: ParticipationGetByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "participations",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByExternalAccountAndEventIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByIdHandler: Handler<AttendanceCounters> =
            jsonHandler<AttendanceCounters>(clientOptions.jsonMapper)

        override fun getById(
            params: ParticipationGetByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("marketingEventId", params.marketingEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "participations",
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
                            .use { getByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listBreakdownByContactHandler:
            Handler<CollectionResponseWithTotalParticipationBreakdownForwardPaging> =
            jsonHandler<CollectionResponseWithTotalParticipationBreakdownForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun listBreakdownByContact(
            params: ParticipationListBreakdownByContactParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByContactPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactIdentifier", params.contactIdentifier().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "participations",
                        "contacts",
                        params._pathParam(0),
                        "breakdown",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBreakdownByContactHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ParticipationListBreakdownByContactPageAsync.builder()
                                    .service(ParticipationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listBreakdownByExternalAccountAndEventIdHandler:
            Handler<CollectionResponseWithTotalParticipationBreakdownForwardPaging> =
            jsonHandler<CollectionResponseWithTotalParticipationBreakdownForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun listBreakdownByExternalAccountAndEventId(
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "participations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "breakdown",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBreakdownByExternalAccountAndEventIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ParticipationListBreakdownByExternalAccountAndEventIdPageAsync
                                    .builder()
                                    .service(ParticipationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listBreakdownByIdHandler:
            Handler<CollectionResponseWithTotalParticipationBreakdownForwardPaging> =
            jsonHandler<CollectionResponseWithTotalParticipationBreakdownForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun listBreakdownById(
            params: ParticipationListBreakdownByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByIdPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("marketingEventId", params.marketingEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "participations",
                        params._pathParam(0),
                        "breakdown",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBreakdownByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ParticipationListBreakdownByIdPageAsync.builder()
                                    .service(ParticipationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
