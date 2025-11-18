// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

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
import com.hubspot_sdk.api.models.scheduler.meetings.CollectionResponseWithTotalExternalLinkMetadataForwardPaging
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingInfo
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLinkAvailabilityAndBusyTimes
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBookingResponse
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkBookParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetAvailabilityBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetBookingInfoBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkListPageAsync
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MeetingsLinkServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingsLinkServiceAsync {

    private val withRawResponse: MeetingsLinkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MeetingsLinkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingsLinkServiceAsync =
        MeetingsLinkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MeetingsLinkListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingsLinkListPageAsync> =
        // get /scheduler/v3/meetings/meeting-links
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun book(
        params: MeetingsLinkBookParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMeetingBookingResponse> =
        // post /scheduler/v3/meetings/meeting-links/book
        withRawResponse().book(params, requestOptions).thenApply { it.parse() }

    override fun getAvailabilityBySlug(
        params: MeetingsLinkGetAvailabilityBySlugParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        // get /scheduler/v3/meetings/meeting-links/book/availability-page/{slug}
        withRawResponse().getAvailabilityBySlug(params, requestOptions).thenApply { it.parse() }

    override fun getBookingInfoBySlug(
        params: MeetingsLinkGetBookingInfoBySlugParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBookingInfo> =
        // get /scheduler/v3/meetings/meeting-links/book/{slug}
        withRawResponse().getBookingInfoBySlug(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingsLinkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingsLinkServiceAsync.WithRawResponse =
            MeetingsLinkServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler:
            Handler<CollectionResponseWithTotalExternalLinkMetadataForwardPaging> =
            jsonHandler<CollectionResponseWithTotalExternalLinkMetadataForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: MeetingsLinkListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingsLinkListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "v3", "meetings", "meeting-links")
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
                            .let {
                                MeetingsLinkListPageAsync.builder()
                                    .service(MeetingsLinkServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val bookHandler: Handler<ExternalMeetingBookingResponse> =
            jsonHandler<ExternalMeetingBookingResponse>(clientOptions.jsonMapper)

        override fun book(
            params: MeetingsLinkBookParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "v3", "meetings", "meeting-links", "book")
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

        private val getAvailabilityBySlugHandler: Handler<ExternalLinkAvailabilityAndBusyTimes> =
            jsonHandler<ExternalLinkAvailabilityAndBusyTimes>(clientOptions.jsonMapper)

        override fun getAvailabilityBySlug(
            params: MeetingsLinkGetAvailabilityBySlugParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "scheduler",
                        "v3",
                        "meetings",
                        "meeting-links",
                        "book",
                        "availability-page",
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
                            .use { getAvailabilityBySlugHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getBookingInfoBySlugHandler: Handler<ExternalBookingInfo> =
            jsonHandler<ExternalBookingInfo>(clientOptions.jsonMapper)

        override fun getBookingInfoBySlug(
            params: MeetingsLinkGetBookingInfoBySlugParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "scheduler",
                        "v3",
                        "meetings",
                        "meeting-links",
                        "book",
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
                            .use { getBookingInfoBySlugHandler.handle(it) }
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
