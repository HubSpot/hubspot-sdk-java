// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

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
import com.hubspot_sdk.api.models.marketing.events.BatchResponseMarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.BatchResponseMarketingEventPublicDefaultResponseV2
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseSearchPublicResponseWrapperNoPaging
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging
import com.hubspot_sdk.api.models.marketing.events.EventCancelByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventCompleteByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventCreateParams
import com.hubspot_sdk.api.models.marketing.events.EventDeleteBatchByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventDeleteBatchParams
import com.hubspot_sdk.api.models.marketing.events.EventDeleteByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventDeleteParams
import com.hubspot_sdk.api.models.marketing.events.EventGetByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventGetParams
import com.hubspot_sdk.api.models.marketing.events.EventListPage
import com.hubspot_sdk.api.models.marketing.events.EventListParams
import com.hubspot_sdk.api.models.marketing.events.EventSearchByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventSearchIdentifiersByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpdateBatchParams
import com.hubspot_sdk.api.models.marketing.events.EventUpdateByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpdateParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertBatchParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertSubscriberStateByEmailParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertSubscriberStateByIdParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicDefaultResponseV2
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicReadResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicReadResponseV2
import com.hubspot_sdk.api.services.blocking.marketing.events.AssociationService
import com.hubspot_sdk.api.services.blocking.marketing.events.AssociationServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.events.AttendanceService
import com.hubspot_sdk.api.services.blocking.marketing.events.AttendanceServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.events.ParticipationService
import com.hubspot_sdk.api.services.blocking.marketing.events.ParticipationServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.events.SettingService
import com.hubspot_sdk.api.services.blocking.marketing.events.SettingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val associations: AssociationService by lazy { AssociationServiceImpl(clientOptions) }

    private val attendance: AttendanceService by lazy { AttendanceServiceImpl(clientOptions) }

    private val participations: ParticipationService by lazy {
        ParticipationServiceImpl(clientOptions)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService =
        EventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun associations(): AssociationService = associations

    override fun attendance(): AttendanceService = attendance

    override fun participations(): ParticipationService = participations

    override fun settings(): SettingService = settings

    override fun create(
        params: EventCreateParams,
        requestOptions: RequestOptions,
    ): MarketingEventDefaultResponse =
        // post /marketing/v3/marketing-events/events
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: EventUpdateParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicDefaultResponseV2 =
        // patch /marketing/v3/marketing-events/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: EventListParams, requestOptions: RequestOptions): EventListPage =
        // get /marketing/v3/marketing-events/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EventDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/v3/marketing-events/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventDefaultResponse =
        // post /marketing/v3/marketing-events/events/{externalEventId}/cancel
        withRawResponse().cancelByExternalEventId(params, requestOptions).parse()

    override fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventDefaultResponse =
        // post /marketing/v3/marketing-events/events/{externalEventId}/complete
        withRawResponse().completeByExternalEventId(params, requestOptions).parse()

    override fun deleteBatch(params: EventDeleteBatchParams, requestOptions: RequestOptions) {
        // post /marketing/v3/marketing-events/batch/archive
        withRawResponse().deleteBatch(params, requestOptions)
    }

    override fun deleteBatchByExternalEventId(
        params: EventDeleteBatchByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /marketing/v3/marketing-events/events/delete
        withRawResponse().deleteBatchByExternalEventId(params, requestOptions)

    override fun deleteByExternalEventId(
        params: EventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions,
    ) {
        // delete /marketing/v3/marketing-events/events/{externalEventId}
        withRawResponse().deleteByExternalEventId(params, requestOptions)
    }

    override fun get(
        params: EventGetParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicReadResponseV2 =
        // get /marketing/v3/marketing-events/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getByExternalEventId(
        params: EventGetByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicReadResponse =
        // get /marketing/v3/marketing-events/events/{externalEventId}
        withRawResponse().getByExternalEventId(params, requestOptions).parse()

    override fun searchByExternalEventId(
        params: EventSearchByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CollectionResponseSearchPublicResponseWrapperNoPaging =
        // get /marketing/v3/marketing-events/events/search
        withRawResponse().searchByExternalEventId(params, requestOptions).parse()

    override fun searchIdentifiersByExternalEventId(
        params: EventSearchIdentifiersByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
        // get /marketing/v3/marketing-events/{externalEventId}/identifiers
        withRawResponse().searchIdentifiersByExternalEventId(params, requestOptions).parse()

    override fun updateBatch(
        params: EventUpdateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseMarketingEventPublicDefaultResponseV2 =
        // post /marketing/v3/marketing-events/batch/update
        withRawResponse().updateBatch(params, requestOptions).parse()

    override fun updateByExternalEventId(
        params: EventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicDefaultResponse =
        // patch /marketing/v3/marketing-events/events/{externalEventId}
        withRawResponse().updateByExternalEventId(params, requestOptions).parse()

    override fun upsertBatch(
        params: EventUpsertBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseMarketingEventPublicDefaultResponse =
        // post /marketing/v3/marketing-events/events/upsert
        withRawResponse().upsertBatch(params, requestOptions).parse()

    override fun upsertByExternalEventId(
        params: EventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicDefaultResponse =
        // put /marketing/v3/marketing-events/events/{externalEventId}
        withRawResponse().upsertByExternalEventId(params, requestOptions).parse()

    override fun upsertSubscriberStateByEmail(
        params: EventUpsertSubscriberStateByEmailParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post
        // /marketing/v3/marketing-events/events/{externalEventId}/{subscriberState}/email-upsert
        withRawResponse().upsertSubscriberStateByEmail(params, requestOptions)

    override fun upsertSubscriberStateById(
        params: EventUpsertSubscriberStateByIdParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /marketing/v3/marketing-events/events/{externalEventId}/{subscriberState}/upsert
        withRawResponse().upsertSubscriberStateById(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val associations: AssociationService.WithRawResponse by lazy {
            AssociationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val attendance: AttendanceService.WithRawResponse by lazy {
            AttendanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val participations: ParticipationService.WithRawResponse by lazy {
            ParticipationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventService.WithRawResponse =
            EventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun associations(): AssociationService.WithRawResponse = associations

        override fun attendance(): AttendanceService.WithRawResponse = attendance

        override fun participations(): ParticipationService.WithRawResponse = participations

        override fun settings(): SettingService.WithRawResponse = settings

        private val createHandler: Handler<MarketingEventDefaultResponse> =
            jsonHandler<MarketingEventDefaultResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EventCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventDefaultResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", "events")
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

        private val updateHandler: Handler<MarketingEventPublicDefaultResponseV2> =
            jsonHandler<MarketingEventPublicDefaultResponseV2>(clientOptions.jsonMapper)

        override fun update(
            params: EventUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", params._pathParam(0))
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

        private val listHandler:
            Handler<CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging> =
            jsonHandler<CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: EventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", "")
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
                        EventListPage.builder()
                            .service(EventServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EventDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val cancelByExternalEventIdHandler: Handler<MarketingEventDefaultResponse> =
            jsonHandler<MarketingEventDefaultResponse>(clientOptions.jsonMapper)

        override fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventDefaultResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "events",
                        params._pathParam(0),
                        "cancel",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelByExternalEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val completeByExternalEventIdHandler: Handler<MarketingEventDefaultResponse> =
            jsonHandler<MarketingEventDefaultResponse>(clientOptions.jsonMapper)

        override fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventDefaultResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "events",
                        params._pathParam(0),
                        "complete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { completeByExternalEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteBatchHandler: Handler<Void?> = emptyHandler()

        override fun deleteBatch(
            params: EventDeleteBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteBatchHandler.handle(it) }
            }
        }

        override fun deleteBatchByExternalEventId(
            params: EventDeleteBatchByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", "events", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val deleteByExternalEventIdHandler: Handler<Void?> = emptyHandler()

        override fun deleteByExternalEventId(
            params: EventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "events",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteByExternalEventIdHandler.handle(it) }
            }
        }

        private val getHandler: Handler<MarketingEventPublicReadResponseV2> =
            jsonHandler<MarketingEventPublicReadResponseV2>(clientOptions.jsonMapper)

        override fun get(
            params: EventGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", params._pathParam(0))
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

        private val getByExternalEventIdHandler: Handler<MarketingEventPublicReadResponse> =
            jsonHandler<MarketingEventPublicReadResponse>(clientOptions.jsonMapper)

        override fun getByExternalEventId(
            params: EventGetByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicReadResponse> {
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
                        "events",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByExternalEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchByExternalEventIdHandler:
            Handler<CollectionResponseSearchPublicResponseWrapperNoPaging> =
            jsonHandler<CollectionResponseSearchPublicResponseWrapperNoPaging>(
                clientOptions.jsonMapper
            )

        override fun searchByExternalEventId(
            params: EventSearchByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", "events", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchByExternalEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchIdentifiersByExternalEventIdHandler:
            Handler<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
            jsonHandler<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>(
                clientOptions.jsonMapper
            )

        override fun searchIdentifiersByExternalEventId(
            params: EventSearchIdentifiersByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> {
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
                        params._pathParam(0),
                        "identifiers",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchIdentifiersByExternalEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateBatchHandler:
            Handler<BatchResponseMarketingEventPublicDefaultResponseV2> =
            jsonHandler<BatchResponseMarketingEventPublicDefaultResponseV2>(
                clientOptions.jsonMapper
            )

        override fun updateBatch(
            params: EventUpdateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateByExternalEventIdHandler: Handler<MarketingEventPublicDefaultResponse> =
            jsonHandler<MarketingEventPublicDefaultResponse>(clientOptions.jsonMapper)

        override fun updateByExternalEventId(
            params: EventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "events",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateByExternalEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertBatchHandler: Handler<BatchResponseMarketingEventPublicDefaultResponse> =
            jsonHandler<BatchResponseMarketingEventPublicDefaultResponse>(clientOptions.jsonMapper)

        override fun upsertBatch(
            params: EventUpsertBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "marketing-events", "events", "upsert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { upsertBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertByExternalEventIdHandler: Handler<MarketingEventPublicDefaultResponse> =
            jsonHandler<MarketingEventPublicDefaultResponse>(clientOptions.jsonMapper)

        override fun upsertByExternalEventId(
            params: EventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathExternalEventId", params.pathExternalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "events",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { upsertByExternalEventIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun upsertSubscriberStateByEmail(
            params: EventUpsertSubscriberStateByEmailParams,
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
                        "v3",
                        "marketing-events",
                        "events",
                        params._pathParam(0),
                        params._pathParam(1),
                        "email-upsert",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun upsertSubscriberStateById(
            params: EventUpsertSubscriberStateByIdParams,
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
                        "v3",
                        "marketing-events",
                        "events",
                        params._pathParam(0),
                        params._pathParam(1),
                        "upsert",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
