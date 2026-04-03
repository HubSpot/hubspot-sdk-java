// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponseV2
import com.hubspot_sdk.api.models.marketing.marketingevents.CollectionResponseMarketingEventPublicReadResponseV2ForwardPaging
import com.hubspot_sdk.api.models.marketing.marketingevents.CollectionResponseSearchPublicResponseWrapperNoPaging
import com.hubspot_sdk.api.models.marketing.marketingevents.CollectionResponseWithTotalMarketingEventIdentifiersResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventCreateParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDefaultResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteBatchByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteBatchParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventGetByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventGetParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventListPageAsync
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventListParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventPublicDefaultResponseV2
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventPublicReadResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventPublicReadResponseV2
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventSearchByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventSearchIdentifiersByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventUpdateBatchParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventUpdateByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventUpdateParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventUpsertBatchParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventUpsertByExternalEventIdParams
import com.hubspot_sdk.api.services.async.marketing.marketingevents.AttendanceServiceAsync
import com.hubspot_sdk.api.services.async.marketing.marketingevents.AttendanceServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.marketingevents.EventServiceAsync
import com.hubspot_sdk.api.services.async.marketing.marketingevents.EventServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.marketingevents.ListAssociationServiceAsync
import com.hubspot_sdk.api.services.async.marketing.marketingevents.ListAssociationServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.marketingevents.ParticipationServiceAsync
import com.hubspot_sdk.api.services.async.marketing.marketingevents.ParticipationServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.marketingevents.SettingServiceAsync
import com.hubspot_sdk.api.services.async.marketing.marketingevents.SettingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.marketingevents.SubscriberStateServiceAsync
import com.hubspot_sdk.api.services.async.marketing.marketingevents.SubscriberStateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MarketingEventServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MarketingEventServiceAsync {

    private val withRawResponse: MarketingEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attendance: AttendanceServiceAsync by lazy {
        AttendanceServiceAsyncImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val listAssociations: ListAssociationServiceAsync by lazy {
        ListAssociationServiceAsyncImpl(clientOptions)
    }

    private val participations: ParticipationServiceAsync by lazy {
        ParticipationServiceAsyncImpl(clientOptions)
    }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    private val subscriberState: SubscriberStateServiceAsync by lazy {
        SubscriberStateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MarketingEventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MarketingEventServiceAsync =
        MarketingEventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attendance(): AttendanceServiceAsync = attendance

    override fun events(): EventServiceAsync = events

    override fun listAssociations(): ListAssociationServiceAsync = listAssociations

    override fun participations(): ParticipationServiceAsync = participations

    override fun settings(): SettingServiceAsync = settings

    override fun subscriberState(): SubscriberStateServiceAsync = subscriberState

    override fun create(
        params: MarketingEventCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventDefaultResponse> =
        // post /marketing/marketing-events/2026-03/events
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MarketingEventUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2> =
        // patch /marketing/marketing-events/2026-03/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MarketingEventListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventListPageAsync> =
        // get /marketing/marketing-events/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MarketingEventDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/marketing-events/2026-03/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun deleteBatch(
        params: MarketingEventDeleteBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /marketing/marketing-events/2026-03/batch/archive
        withRawResponse().deleteBatch(params, requestOptions)

    override fun deleteBatchByExternalEventId(
        params: MarketingEventDeleteBatchByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /marketing/marketing-events/2026-03/events/delete
        withRawResponse().deleteBatchByExternalEventId(params, requestOptions)

    override fun deleteByExternalEventId(
        params: MarketingEventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().deleteByExternalEventId(params, requestOptions).thenAccept {}

    override fun get(
        params: MarketingEventGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventPublicReadResponseV2> =
        // get /marketing/marketing-events/2026-03/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getByExternalEventId(
        params: MarketingEventGetByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventPublicReadResponse> =
        // get /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().getByExternalEventId(params, requestOptions).thenApply { it.parse() }

    override fun searchByExternalEventId(
        params: MarketingEventSearchByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseSearchPublicResponseWrapperNoPaging> =
        // get /marketing/marketing-events/2026-03/events/search
        withRawResponse().searchByExternalEventId(params, requestOptions).thenApply { it.parse() }

    override fun searchIdentifiersByExternalEventId(
        params: MarketingEventSearchIdentifiersByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
        // get /marketing/marketing-events/2026-03/{externalEventId}/identifiers
        withRawResponse().searchIdentifiersByExternalEventId(params, requestOptions).thenApply {
            it.parse()
        }

    override fun updateBatch(
        params: MarketingEventUpdateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2> =
        // post /marketing/marketing-events/2026-03/batch/update
        withRawResponse().updateBatch(params, requestOptions).thenApply { it.parse() }

    override fun updateByExternalEventId(
        params: MarketingEventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        // patch /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().updateByExternalEventId(params, requestOptions).thenApply { it.parse() }

    override fun upsertBatch(
        params: MarketingEventUpsertBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse> =
        // post /marketing/marketing-events/2026-03/events/upsert
        withRawResponse().upsertBatch(params, requestOptions).thenApply { it.parse() }

    override fun upsertByExternalEventId(
        params: MarketingEventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        // put /marketing/marketing-events/2026-03/events/{externalEventId}
        withRawResponse().upsertByExternalEventId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketingEventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val attendance: AttendanceServiceAsync.WithRawResponse by lazy {
            AttendanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val listAssociations: ListAssociationServiceAsync.WithRawResponse by lazy {
            ListAssociationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val participations: ParticipationServiceAsync.WithRawResponse by lazy {
            ParticipationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriberState: SubscriberStateServiceAsync.WithRawResponse by lazy {
            SubscriberStateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingEventServiceAsync.WithRawResponse =
            MarketingEventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun attendance(): AttendanceServiceAsync.WithRawResponse = attendance

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun listAssociations(): ListAssociationServiceAsync.WithRawResponse =
            listAssociations

        override fun participations(): ParticipationServiceAsync.WithRawResponse = participations

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun subscriberState(): SubscriberStateServiceAsync.WithRawResponse =
            subscriberState

        private val createHandler: Handler<MarketingEventDefaultResponse> =
            jsonHandler<MarketingEventDefaultResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MarketingEventCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<MarketingEventPublicDefaultResponseV2> =
            jsonHandler<MarketingEventPublicDefaultResponseV2>(clientOptions.jsonMapper)

        override fun update(
            params: MarketingEventUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<MarketingEventListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03")
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
                                MarketingEventListPageAsync.builder()
                                    .service(MarketingEventServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MarketingEventDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        override fun deleteBatch(
            params: MarketingEventDeleteBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "batch", "archive")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun deleteBatchByExternalEventId(
            params: MarketingEventDeleteBatchByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events", "delete")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val deleteByExternalEventIdHandler: Handler<Void?> = emptyHandler()

        override fun deleteByExternalEventId(
            params: MarketingEventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteByExternalEventIdHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<MarketingEventPublicReadResponseV2> =
            jsonHandler<MarketingEventPublicReadResponseV2>(clientOptions.jsonMapper)

        override fun get(
            params: MarketingEventGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val getByExternalEventIdHandler: Handler<MarketingEventPublicReadResponse> =
            jsonHandler<MarketingEventPublicReadResponse>(clientOptions.jsonMapper)

        override fun getByExternalEventId(
            params: MarketingEventGetByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByExternalEventIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchByExternalEventIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>
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
                        "marketing-events",
                        "2026-03",
                        params._pathParam(0),
                        "identifiers",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchIdentifiersByExternalEventIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateByExternalEventIdHandler: Handler<MarketingEventPublicDefaultResponse> =
            jsonHandler<MarketingEventPublicDefaultResponse>(clientOptions.jsonMapper)

        override fun updateByExternalEventId(
            params: MarketingEventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateByExternalEventIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val upsertBatchHandler: Handler<BatchResponseMarketingEventPublicDefaultResponse> =
            jsonHandler<BatchResponseMarketingEventPublicDefaultResponse>(clientOptions.jsonMapper)

        override fun upsertBatch(
            params: MarketingEventUpsertBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "marketing-events", "2026-03", "events", "upsert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { upsertBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val upsertByExternalEventIdHandler: Handler<MarketingEventPublicDefaultResponse> =
            jsonHandler<MarketingEventPublicDefaultResponse>(clientOptions.jsonMapper)

        override fun upsertByExternalEventId(
            params: MarketingEventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
