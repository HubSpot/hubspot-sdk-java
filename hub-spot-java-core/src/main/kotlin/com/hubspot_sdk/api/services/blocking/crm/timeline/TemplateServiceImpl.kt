// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.timeline

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
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
import com.hubspot_sdk.api.models.crm.timeline.CollectionResponseTimelineEventTemplateNoPaging
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplate
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateCreateParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateGetParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateListParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TemplateService {

    private val withRawResponse: TemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService =
        TemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions,
    ): TimelineEventTemplate =
        // post /integrators/timeline/v3/{appId}/event-templates
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: TemplateUpdateParams,
        requestOptions: RequestOptions,
    ): TimelineEventTemplate =
        // put /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseTimelineEventTemplateNoPaging =
        // get /integrators/timeline/v3/{appId}/event-templates
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TemplateDeleteParams, requestOptions: RequestOptions) {
        // delete /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: TemplateGetParams,
        requestOptions: RequestOptions,
    ): TimelineEventTemplate =
        // get /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateService.WithRawResponse =
            TemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TimelineEventTemplate> =
            jsonHandler<TimelineEventTemplate>(clientOptions.jsonMapper)

        override fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TimelineEventTemplate> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                    )
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

        private val updateHandler: Handler<TimelineEventTemplate> =
            jsonHandler<TimelineEventTemplate>(clientOptions.jsonMapper)

        override fun update(
            params: TemplateUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TimelineEventTemplate> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventTemplateId", params.eventTemplateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseTimelineEventTemplateNoPaging> =
            jsonHandler<CollectionResponseTimelineEventTemplateNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                    )
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventTemplateId", params.eventTemplateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<TimelineEventTemplate> =
            jsonHandler<TimelineEventTemplate>(clientOptions.jsonMapper)

        override fun get(
            params: TemplateGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TimelineEventTemplate> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventTemplateId", params.eventTemplateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "integrators",
                        "timeline",
                        "v3",
                        params._pathParam(0),
                        "event-templates",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
