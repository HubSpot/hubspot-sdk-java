// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.scheduler.meetings

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
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.scheduler.meetings.CollectionResponseWithTotalExternalLinkMetadata
import com.hubspot.sdk.models.scheduler.meetings.ExternalBookingInfo
import com.hubspot.sdk.models.scheduler.meetings.ExternalLinkAvailabilityAndBusyTimes
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicGetAvailabilityBySlugParams
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicGetBookingInfoBySlugParams
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicListPage
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BasicServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BasicService {

    private val withRawResponse: BasicService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BasicService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BasicService =
        BasicServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: BasicListParams, requestOptions: RequestOptions): BasicListPage =
        // get /scheduler/2026-03/meetings/meeting-links
        withRawResponse().list(params, requestOptions).parse()

    override fun getAvailabilityBySlug(
        params: BasicGetAvailabilityBySlugParams,
        requestOptions: RequestOptions,
    ): ExternalLinkAvailabilityAndBusyTimes =
        // get /scheduler/2026-03/meetings/meeting-links/book/availability-page/{slug}
        withRawResponse().getAvailabilityBySlug(params, requestOptions).parse()

    override fun getBookingInfoBySlug(
        params: BasicGetBookingInfoBySlugParams,
        requestOptions: RequestOptions,
    ): ExternalBookingInfo =
        // get /scheduler/2026-03/meetings/meeting-links/book/{slug}
        withRawResponse().getBookingInfoBySlug(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BasicService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BasicService.WithRawResponse =
            BasicServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalExternalLinkMetadata> =
            jsonHandler<CollectionResponseWithTotalExternalLinkMetadata>(clientOptions.jsonMapper)

        override fun list(
            params: BasicListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BasicListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scheduler", "2026-03", "meetings", "meeting-links")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BasicListPage.builder()
                            .service(BasicServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getAvailabilityBySlugHandler: Handler<ExternalLinkAvailabilityAndBusyTimes> =
            jsonHandler<ExternalLinkAvailabilityAndBusyTimes>(clientOptions.jsonMapper)

        override fun getAvailabilityBySlug(
            params: BasicGetAvailabilityBySlugParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "scheduler",
                        "2026-03",
                        "meetings",
                        "meeting-links",
                        "book",
                        "availability-page",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAvailabilityBySlugHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getBookingInfoBySlugHandler: Handler<ExternalBookingInfo> =
            jsonHandler<ExternalBookingInfo>(clientOptions.jsonMapper)

        override fun getBookingInfoBySlug(
            params: BasicGetBookingInfoBySlugParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBookingInfo> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "scheduler",
                        "2026-03",
                        "meetings",
                        "meeting-links",
                        "book",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
