// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
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
import com.hubspot.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponse
import com.hubspot.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponseV2
import com.hubspot.models.marketing.marketingevents.CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging
import com.hubspot.models.marketing.marketingevents.CollectionResponseSearchPublicResponseWrapperNoPaging
import com.hubspot.models.marketing.marketingevents.CollectionResponseWithTotalMarketingEventIdentifiersResponse
import com.hubspot.models.marketing.marketingevents.MarketingEventCreateParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDefaultResponse
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteBatchByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteBatchParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteParams
import com.hubspot.models.marketing.marketingevents.MarketingEventGetByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventGetParams
import com.hubspot.models.marketing.marketingevents.MarketingEventListPage
import com.hubspot.models.marketing.marketingevents.MarketingEventListParams
import com.hubspot.models.marketing.marketingevents.MarketingEventPublicDefaultResponse
import com.hubspot.models.marketing.marketingevents.MarketingEventPublicDefaultResponseV2
import com.hubspot.models.marketing.marketingevents.MarketingEventPublicReadResponse
import com.hubspot.models.marketing.marketingevents.MarketingEventPublicReadResponseV2
import com.hubspot.models.marketing.marketingevents.MarketingEventSearchByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventSearchIdentifiersByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpdateBatchParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpdateByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpdateParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpsertBatchParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpsertByExternalEventIdParams
import com.hubspot.services.blocking.marketing.marketingevents.AttendanceService
import com.hubspot.services.blocking.marketing.marketingevents.AttendanceServiceImpl
import com.hubspot.services.blocking.marketing.marketingevents.EventService
import com.hubspot.services.blocking.marketing.marketingevents.EventServiceImpl
import com.hubspot.services.blocking.marketing.marketingevents.ListAssociationService
import com.hubspot.services.blocking.marketing.marketingevents.ListAssociationServiceImpl
import com.hubspot.services.blocking.marketing.marketingevents.ParticipationService
import com.hubspot.services.blocking.marketing.marketingevents.ParticipationServiceImpl
import com.hubspot.services.blocking.marketing.marketingevents.SettingService
import com.hubspot.services.blocking.marketing.marketingevents.SettingServiceImpl
import com.hubspot.services.blocking.marketing.marketingevents.SubscriberStateService
import com.hubspot.services.blocking.marketing.marketingevents.SubscriberStateServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MarketingEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketingEventService {

    private val withRawResponse: MarketingEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attendance: AttendanceService by lazy { AttendanceServiceImpl(clientOptions) }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val listAssociations: ListAssociationService by lazy {
        ListAssociationServiceImpl(clientOptions)
    }

    private val participations: ParticipationService by lazy {
        ParticipationServiceImpl(clientOptions)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    private val subscriberState: SubscriberStateService by lazy {
        SubscriberStateServiceImpl(clientOptions)
    }

    override fun withRawResponse(): MarketingEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingEventService =
        MarketingEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attendance(): AttendanceService = attendance

    override fun events(): EventService = events

    override fun listAssociations(): ListAssociationService = listAssociations

    override fun participations(): ParticipationService = participations

    override fun settings(): SettingService = settings

    override fun subscriberState(): SubscriberStateService = subscriberState

    override fun create(
        params: MarketingEventCreateParams,
        requestOptions: RequestOptions,
    ): MarketingEventDefaultResponse =
        // post /marketing/marketing-events/2026-03/events
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: MarketingEventUpdateParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicDefaultResponseV2 =
        // patch /marketing/marketing-events/2026-03/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MarketingEventListParams,
        requestOptions: RequestOptions,
    ): MarketingEventListPage =
        // get /marketing/marketing-events/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MarketingEventDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/marketing-events/2026-03/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun deleteBatch(
        params: MarketingEventDeleteBatchParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /marketing/marketing-events/2026-03/batch/archive
        withRawResponse().deleteBatch(params, requestOptions)

    override fun deleteBatchByExternalEventId(
        params: MarketingEventDeleteBatchByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /marketing/marketing-events/2026-03/events/delete
        withRawResponse().deleteBatchByExternalEventId(params, requestOptions)

    override fun deleteByExternalEventId(
        params: MarketingEventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions,
    ) {
        // delete /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().deleteByExternalEventId(params, requestOptions)
    }

    override fun get(
        params: MarketingEventGetParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicReadResponseV2 =
        // get /marketing/marketing-events/2026-03/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getByExternalEventId(
        params: MarketingEventGetByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicReadResponse =
        // get /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().getByExternalEventId(params, requestOptions).parse()

    override fun searchByExternalEventId(
        params: MarketingEventSearchByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CollectionResponseSearchPublicResponseWrapperNoPaging =
        // get /marketing/marketing-events/2026-03/events/search
        withRawResponse().searchByExternalEventId(params, requestOptions).parse()

    override fun searchIdentifiersByExternalEventId(
        params: MarketingEventSearchIdentifiersByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponse =
        // get /marketing/marketing-events/2026-03/{externalEventId}/identifiers
        withRawResponse().searchIdentifiersByExternalEventId(params, requestOptions).parse()

    override fun updateBatch(
        params: MarketingEventUpdateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseMarketingEventPublicDefaultResponseV2 =
        // post /marketing/marketing-events/2026-03/batch/update
        withRawResponse().updateBatch(params, requestOptions).parse()

    override fun updateByExternalEventId(
        params: MarketingEventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicDefaultResponse =
        // patch /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().updateByExternalEventId(params, requestOptions).parse()

    override fun upsertBatch(
        params: MarketingEventUpsertBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseMarketingEventPublicDefaultResponse =
        // post /marketing/marketing-events/2026-03/events/upsert
        withRawResponse().upsertBatch(params, requestOptions).parse()

    override fun upsertByExternalEventId(
        params: MarketingEventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): MarketingEventPublicDefaultResponse =
        // put /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().upsertByExternalEventId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketingEventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val attendance: AttendanceService.WithRawResponse by lazy {
            AttendanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val listAssociations: ListAssociationService.WithRawResponse by lazy {
            ListAssociationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val participations: ParticipationService.WithRawResponse by lazy {
            ParticipationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriberState: SubscriberStateService.WithRawResponse by lazy {
            SubscriberStateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingEventService.WithRawResponse =
            MarketingEventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun attendance(): AttendanceService.WithRawResponse = attendance

        override fun events(): EventService.WithRawResponse = events

        override fun listAssociations(): ListAssociationService.WithRawResponse = listAssociations

        override fun participations(): ParticipationService.WithRawResponse = participations

        override fun settings(): SettingService.WithRawResponse = settings

        override fun subscriberState(): SubscriberStateService.WithRawResponse = subscriberState

        private val createHandler: Handler<MarketingEventDefaultResponse> =
            jsonHandler<MarketingEventDefaultResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MarketingEventCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventDefaultResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events")
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
            params: MarketingEventUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        params._pathParam(0),
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

        private val listHandler:
            Handler<CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging> =
            jsonHandler<CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: MarketingEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03")
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
                        MarketingEventListPage.builder()
                            .service(MarketingEventServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MarketingEventDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        params._pathParam(0),
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

        override fun deleteBatch(
            params: MarketingEventDeleteBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "batch", "archive")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun deleteBatchByExternalEventId(
            params: MarketingEventDeleteBatchByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events", "delete")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val deleteByExternalEventIdHandler: Handler<Void?> = emptyHandler()

        override fun deleteByExternalEventId(
            params: MarketingEventDeleteByExternalEventIdParams,
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
                        "marketing-events",
                        "2026-03",
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
            params: MarketingEventGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        params._pathParam(0),
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

        private val getByExternalEventIdHandler: Handler<MarketingEventPublicReadResponse> =
            jsonHandler<MarketingEventPublicReadResponse>(clientOptions.jsonMapper)

        override fun getByExternalEventId(
            params: MarketingEventGetByExternalEventIdParams,
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
                        "marketing-events",
                        "2026-03",
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
            params: MarketingEventSearchByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events", "search")
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
            Handler<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
            jsonHandler<CollectionResponseWithTotalMarketingEventIdentifiersResponse>(
                clientOptions.jsonMapper
            )

        override fun searchIdentifiersByExternalEventId(
            params: MarketingEventSearchIdentifiersByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse> {
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
            params: MarketingEventUpdateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "batch", "update")
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
            params: MarketingEventUpdateByExternalEventIdParams,
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
                        "marketing-events",
                        "2026-03",
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
            params: MarketingEventUpsertBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events", "upsert")
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
            params: MarketingEventUpsertByExternalEventIdParams,
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
                        "marketing-events",
                        "2026-03",
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
    }
}
