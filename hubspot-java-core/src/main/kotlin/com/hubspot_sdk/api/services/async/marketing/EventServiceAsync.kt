// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventExternalUniqueIdentifier
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventPublicObjectIdDeleteRequest
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventPublicUpdateRequestFullV2
import com.hubspot_sdk.api.models.marketing.events.BatchResponseMarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.BatchResponseMarketingEventPublicDefaultResponseV2
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
import com.hubspot_sdk.api.models.marketing.events.EventListPageAsync
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
import com.hubspot_sdk.api.models.marketing.events.MarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicDefaultResponseV2
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicReadResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicReadResponseV2
import com.hubspot_sdk.api.services.async.marketing.events.AssociationServiceAsync
import com.hubspot_sdk.api.services.async.marketing.events.AttendanceServiceAsync
import com.hubspot_sdk.api.services.async.marketing.events.ParticipationServiceAsync
import com.hubspot_sdk.api.services.async.marketing.events.SettingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    fun associations(): AssociationServiceAsync

    fun attendance(): AttendanceServiceAsync

    fun participations(): ParticipationServiceAsync

    fun settings(): SettingServiceAsync

    /** Creates a new marketing event in HubSpot */
    fun create(params: EventCreateParams): CompletableFuture<MarketingEventDefaultResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse>

    /** @see create */
    fun create(
        marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse> =
        create(
            EventCreateParams.builder()
                .marketingEventCreateRequestParams(marketingEventCreateRequestParams)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        marketingEventCreateRequestParams: MarketingEventCreateRequestParams
    ): CompletableFuture<MarketingEventDefaultResponse> =
        create(marketingEventCreateRequestParams, RequestOptions.none())

    /**
     * Updates the details of an existing Marketing Event identified by its objectId, if it exists.
     */
    fun update(
        objectId: String,
        params: EventUpdateParams,
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: EventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(
        params: EventUpdateParams
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2>

    /**
     * Returns all Marketing Events available on the portal, along with their properties, regardless
     * of whether they were created manually or through the application.
     *
     * The marketing events returned by this endpoint are sorted by objectId.
     */
    fun list(): CompletableFuture<EventListPageAsync> = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none()
    ): CompletableFuture<EventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListPageAsync> =
        list(EventListParams.none(), requestOptions)

    /** Deletes the existing Marketing Event with the specified objectId, if it exists. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, EventDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: EventDeleteParams = EventDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: EventDeleteParams = EventDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EventDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, EventDeleteParams.none(), requestOptions)

    /** Mark a marketing event as cancelled. */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
    ): CompletableFuture<MarketingEventDefaultResponse> =
        cancelByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse> =
        cancelByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams
    ): CompletableFuture<MarketingEventDefaultResponse> =
        cancelByExternalEventId(params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse>

    /** Mark a marketing event as completed */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
    ): CompletableFuture<MarketingEventDefaultResponse> =
        completeByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse> =
        completeByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams
    ): CompletableFuture<MarketingEventDefaultResponse> =
        completeByExternalEventId(params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse>

    /**
     * Deletes multiple Marketing Events from the portal based on their objectId, if they exist.
     *
     * Responses: 204: Returned if all specified Marketing Events were successfully deleted. 207:
     * Returned if some objectIds did not correspond to any existing Marketing Events.
     */
    fun deleteBatch(params: EventDeleteBatchParams): CompletableFuture<Void?> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: EventDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputMarketingEventPublicObjectIdDeleteRequest:
            BatchInputMarketingEventPublicObjectIdDeleteRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteBatch(
            EventDeleteBatchParams.builder()
                .batchInputMarketingEventPublicObjectIdDeleteRequest(
                    batchInputMarketingEventPublicObjectIdDeleteRequest
                )
                .build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputMarketingEventPublicObjectIdDeleteRequest:
            BatchInputMarketingEventPublicObjectIdDeleteRequest
    ): CompletableFuture<Void?> =
        deleteBatch(batchInputMarketingEventPublicObjectIdDeleteRequest, RequestOptions.none())

    /**
     * Deletes multiple Marketing Events based on externalAccountId, externalEventId, and appId.
     *
     * Only Marketing Events created by the same apps will be deleted; events from other apps cannot
     * be removed by this endpoint.
     */
    fun deleteBatchByExternalEventId(
        params: EventDeleteBatchByExternalEventIdParams
    ): CompletableFuture<HttpResponse> = deleteBatchByExternalEventId(params, RequestOptions.none())

    /** @see deleteBatchByExternalEventId */
    fun deleteBatchByExternalEventId(
        params: EventDeleteBatchByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see deleteBatchByExternalEventId */
    fun deleteBatchByExternalEventId(
        batchInputMarketingEventExternalUniqueIdentifier:
            BatchInputMarketingEventExternalUniqueIdentifier,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        deleteBatchByExternalEventId(
            EventDeleteBatchByExternalEventIdParams.builder()
                .batchInputMarketingEventExternalUniqueIdentifier(
                    batchInputMarketingEventExternalUniqueIdentifier
                )
                .build(),
            requestOptions,
        )

    /** @see deleteBatchByExternalEventId */
    fun deleteBatchByExternalEventId(
        batchInputMarketingEventExternalUniqueIdentifier:
            BatchInputMarketingEventExternalUniqueIdentifier
    ): CompletableFuture<HttpResponse> =
        deleteBatchByExternalEventId(
            batchInputMarketingEventExternalUniqueIdentifier,
            RequestOptions.none(),
        )

    /**
     * Deletes the existing Marketing Event with the specified externalAccountId, externalEventId,
     * if it exists.
     *
     * Only Marketing Events created by the same app can be deleted.
     */
    fun deleteByExternalEventId(
        externalEventId: String,
        params: EventDeleteByExternalEventIdParams,
    ): CompletableFuture<Void?> =
        deleteByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        externalEventId: String,
        params: EventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        params: EventDeleteByExternalEventIdParams
    ): CompletableFuture<Void?> = deleteByExternalEventId(params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        params: EventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns the details of a Marketing Event with the specified objectId, if it exists. */
    fun get(objectId: String): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(objectId, EventGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: EventGetParams = EventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: EventGetParams = EventGetParams.none(),
    ): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponseV2>

    /** @see get */
    fun get(params: EventGetParams): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(objectId, EventGetParams.none(), requestOptions)

    /**
     * Returns the details of a Marketing Event with the specified externalAccountId,
     * externalEventId, if it exists.
     *
     * Only Marketing Events created by the same app making the request can be retrieved.
     */
    fun getByExternalEventId(
        externalEventId: String,
        params: EventGetByExternalEventIdParams,
    ): CompletableFuture<MarketingEventPublicReadResponse> =
        getByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        externalEventId: String,
        params: EventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponse> =
        getByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: EventGetByExternalEventIdParams
    ): CompletableFuture<MarketingEventPublicReadResponse> =
        getByExternalEventId(params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: EventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponse>

    /**
     * Retrieves Marketing Events where the externalEventId matches the value provided in the
     * request, limited to events created by the app making the request.
     *
     * Marketing Events created by other apps will not be included in the results.
     */
    fun searchByExternalEventId(
        params: EventSearchByExternalEventIdParams
    ): CompletableFuture<CollectionResponseSearchPublicResponseWrapperNoPaging> =
        searchByExternalEventId(params, RequestOptions.none())

    /** @see searchByExternalEventId */
    fun searchByExternalEventId(
        params: EventSearchByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseSearchPublicResponseWrapperNoPaging>

    /**
     * This endpoint searches the portal for all Marketing Events whose externalEventId matches the
     * value provided in the request.
     *
     * It retrieves the objectId and additional event details for each matching Marketing Event.
     *
     * Since multiple Marketing Events can have the same externalEventId, the endpoint returns all
     * matching results.
     *
     * Note: Marketing Events become searchable by externalEventId a few minutes after creation.
     */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
        searchIdentifiersByExternalEventId(
            externalEventId,
            EventSearchIdentifiersByExternalEventIdParams.none(),
        )

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        params: EventSearchIdentifiersByExternalEventIdParams =
            EventSearchIdentifiersByExternalEventIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
        searchIdentifiersByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        params: EventSearchIdentifiersByExternalEventIdParams =
            EventSearchIdentifiersByExternalEventIdParams.none(),
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
        searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: EventSearchIdentifiersByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: EventSearchIdentifiersByExternalEventIdParams
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
        searchIdentifiersByExternalEventId(params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
        searchIdentifiersByExternalEventId(
            externalEventId,
            EventSearchIdentifiersByExternalEventIdParams.none(),
            requestOptions,
        )

    /** Updates multiple Marketing Events on the portal based on their objectId, if they exist. */
    fun updateBatch(
        params: EventUpdateBatchParams
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: EventUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2>

    /** @see updateBatch */
    fun updateBatch(
        batchInputMarketingEventPublicUpdateRequestFullV2:
            BatchInputMarketingEventPublicUpdateRequestFullV2,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2> =
        updateBatch(
            EventUpdateBatchParams.builder()
                .batchInputMarketingEventPublicUpdateRequestFullV2(
                    batchInputMarketingEventPublicUpdateRequestFullV2
                )
                .build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(
        batchInputMarketingEventPublicUpdateRequestFullV2:
            BatchInputMarketingEventPublicUpdateRequestFullV2
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2> =
        updateBatch(batchInputMarketingEventPublicUpdateRequestFullV2, RequestOptions.none())

    /**
     * Updates the details of an existing Marketing Event identified by its externalAccountId,
     * externalEventId if it exists.
     *
     * Only Marketing Events created by the same app can be updated.
     */
    fun updateByExternalEventId(
        externalEventId: String,
        params: EventUpdateByExternalEventIdParams,
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        updateByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        externalEventId: String,
        params: EventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        updateByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: EventUpdateByExternalEventIdParams
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        updateByExternalEventId(params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: EventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse>

    /**
     * Upserts multiple Marketing Events. If a Marketing Event with the specified ID already exists,
     * it will be updated; otherwise, a new event will be created.
     *
     * Only Marketing Events originally created by the same app can be updated.
     */
    fun upsertBatch(
        params: EventUpsertBatchParams
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse> =
        upsertBatch(params, RequestOptions.none())

    /** @see upsertBatch */
    fun upsertBatch(
        params: EventUpsertBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse>

    /** @see upsertBatch */
    fun upsertBatch(
        batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse> =
        upsertBatch(
            EventUpsertBatchParams.builder()
                .batchInputMarketingEventCreateRequestParams(
                    batchInputMarketingEventCreateRequestParams
                )
                .build(),
            requestOptions,
        )

    /** @see upsertBatch */
    fun upsertBatch(
        batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse> =
        upsertBatch(batchInputMarketingEventCreateRequestParams, RequestOptions.none())

    /**
     * Upserts a marketing event If there is an existing marketing event with the specified ID, it
     * will be updated; otherwise a new event will be created.
     */
    fun upsertByExternalEventId(
        pathExternalEventId: String,
        params: EventUpsertByExternalEventIdParams,
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        pathExternalEventId: String,
        params: EventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        upsertByExternalEventId(
            params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
            requestOptions,
        )

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: EventUpsertByExternalEventIdParams
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        upsertByExternalEventId(params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: EventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse>

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * contact email addresses. Note that the contact must already exist in HubSpot; a contact will
     * not be created. The contactProperties field is used only when creating a new contact. These
     * properties will not update existing contacts.
     */
    fun upsertSubscriberStateByEmail(
        subscriberState: String,
        params: EventUpsertSubscriberStateByEmailParams,
    ): CompletableFuture<HttpResponse> =
        upsertSubscriberStateByEmail(subscriberState, params, RequestOptions.none())

    /** @see upsertSubscriberStateByEmail */
    fun upsertSubscriberStateByEmail(
        subscriberState: String,
        params: EventUpsertSubscriberStateByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        upsertSubscriberStateByEmail(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see upsertSubscriberStateByEmail */
    fun upsertSubscriberStateByEmail(
        params: EventUpsertSubscriberStateByEmailParams
    ): CompletableFuture<HttpResponse> = upsertSubscriberStateByEmail(params, RequestOptions.none())

    /** @see upsertSubscriberStateByEmail */
    fun upsertSubscriberStateByEmail(
        params: EventUpsertSubscriberStateByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * HubSpot contact IDs. Note that the contact must already exist in HubSpot; a contact will not
     * be created.
     */
    fun upsertSubscriberStateById(
        subscriberState: String,
        params: EventUpsertSubscriberStateByIdParams,
    ): CompletableFuture<HttpResponse> =
        upsertSubscriberStateById(subscriberState, params, RequestOptions.none())

    /** @see upsertSubscriberStateById */
    fun upsertSubscriberStateById(
        subscriberState: String,
        params: EventUpsertSubscriberStateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        upsertSubscriberStateById(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see upsertSubscriberStateById */
    fun upsertSubscriberStateById(
        params: EventUpsertSubscriberStateByIdParams
    ): CompletableFuture<HttpResponse> = upsertSubscriberStateById(params, RequestOptions.none())

    /** @see upsertSubscriberStateById */
    fun upsertSubscriberStateById(
        params: EventUpsertSubscriberStateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        fun associations(): AssociationServiceAsync.WithRawResponse

        fun attendance(): AttendanceServiceAsync.WithRawResponse

        fun participations(): ParticipationServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/events`, but is
         * otherwise the same as [EventServiceAsync.create].
         */
        fun create(
            params: EventCreateParams
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>>

        /** @see create */
        fun create(
            marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            create(
                EventCreateParams.builder()
                    .marketingEventCreateRequestParams(marketingEventCreateRequestParams)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            marketingEventCreateRequestParams: MarketingEventCreateRequestParams
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            create(marketingEventCreateRequestParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/v3/marketing-events/{objectId}`, but is
         * otherwise the same as [EventServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: EventUpdateParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: EventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(
            params: EventUpdateParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>>

        /**
         * Returns a raw HTTP response for `get /marketing/v3/marketing-events/`, but is otherwise
         * the same as [EventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none())

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /** @see list */
        fun list(
            params: EventListParams = EventListParams.none()
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/v3/marketing-events/{objectId}`, but
         * is otherwise the same as [EventServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, EventDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: EventDeleteParams = EventDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: EventDeleteParams = EventDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EventDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, EventDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/cancel`, but is otherwise the
         * same as [EventServiceAsync.cancelByExternalEventId].
         */
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            cancelByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            cancelByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see cancelByExternalEventId */
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            cancelByExternalEventId(params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/complete`, but is otherwise the
         * same as [EventServiceAsync.completeByExternalEventId].
         */
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            completeByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see completeByExternalEventId */
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            completeByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see completeByExternalEventId */
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            completeByExternalEventId(params, RequestOptions.none())

        /** @see completeByExternalEventId */
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>>

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/batch/archive`, but
         * is otherwise the same as [EventServiceAsync.deleteBatch].
         */
        fun deleteBatch(params: EventDeleteBatchParams): CompletableFuture<HttpResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: EventDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatch */
        fun deleteBatch(
            batchInputMarketingEventPublicObjectIdDeleteRequest:
                BatchInputMarketingEventPublicObjectIdDeleteRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatch(
                EventDeleteBatchParams.builder()
                    .batchInputMarketingEventPublicObjectIdDeleteRequest(
                        batchInputMarketingEventPublicObjectIdDeleteRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see deleteBatch */
        fun deleteBatch(
            batchInputMarketingEventPublicObjectIdDeleteRequest:
                BatchInputMarketingEventPublicObjectIdDeleteRequest
        ): CompletableFuture<HttpResponse> =
            deleteBatch(batchInputMarketingEventPublicObjectIdDeleteRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/events/delete`, but
         * is otherwise the same as [EventServiceAsync.deleteBatchByExternalEventId].
         */
        fun deleteBatchByExternalEventId(
            params: EventDeleteBatchByExternalEventIdParams
        ): CompletableFuture<HttpResponse> =
            deleteBatchByExternalEventId(params, RequestOptions.none())

        /** @see deleteBatchByExternalEventId */
        fun deleteBatchByExternalEventId(
            params: EventDeleteBatchByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatchByExternalEventId */
        fun deleteBatchByExternalEventId(
            batchInputMarketingEventExternalUniqueIdentifier:
                BatchInputMarketingEventExternalUniqueIdentifier,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatchByExternalEventId(
                EventDeleteBatchByExternalEventIdParams.builder()
                    .batchInputMarketingEventExternalUniqueIdentifier(
                        batchInputMarketingEventExternalUniqueIdentifier
                    )
                    .build(),
                requestOptions,
            )

        /** @see deleteBatchByExternalEventId */
        fun deleteBatchByExternalEventId(
            batchInputMarketingEventExternalUniqueIdentifier:
                BatchInputMarketingEventExternalUniqueIdentifier
        ): CompletableFuture<HttpResponse> =
            deleteBatchByExternalEventId(
                batchInputMarketingEventExternalUniqueIdentifier,
                RequestOptions.none(),
            )

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventServiceAsync.deleteByExternalEventId].
         */
        fun deleteByExternalEventId(
            externalEventId: String,
            params: EventDeleteByExternalEventIdParams,
        ): CompletableFuture<HttpResponse> =
            deleteByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        fun deleteByExternalEventId(
            externalEventId: String,
            params: EventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see deleteByExternalEventId */
        fun deleteByExternalEventId(
            params: EventDeleteByExternalEventIdParams
        ): CompletableFuture<HttpResponse> = deleteByExternalEventId(params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        fun deleteByExternalEventId(
            params: EventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /marketing/v3/marketing-events/{objectId}`, but is
         * otherwise the same as [EventServiceAsync.get].
         */
        fun get(
            objectId: String
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(objectId, EventGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: EventGetParams = EventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: EventGetParams = EventGetParams.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: EventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>>

        /** @see get */
        fun get(
            params: EventGetParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(objectId, EventGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventServiceAsync.getByExternalEventId].
         */
        fun getByExternalEventId(
            externalEventId: String,
            params: EventGetByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>> =
            getByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see getByExternalEventId */
        fun getByExternalEventId(
            externalEventId: String,
            params: EventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>> =
            getByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see getByExternalEventId */
        fun getByExternalEventId(
            params: EventGetByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>> =
            getByExternalEventId(params, RequestOptions.none())

        /** @see getByExternalEventId */
        fun getByExternalEventId(
            params: EventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>>

        /**
         * Returns a raw HTTP response for `get /marketing/v3/marketing-events/events/search`, but
         * is otherwise the same as [EventServiceAsync.searchByExternalEventId].
         */
        fun searchByExternalEventId(
            params: EventSearchByExternalEventIdParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging>
        > = searchByExternalEventId(params, RequestOptions.none())

        /** @see searchByExternalEventId */
        fun searchByExternalEventId(
            params: EventSearchByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging>>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/{externalEventId}/identifiers`, but is otherwise the same
         * as [EventServiceAsync.searchIdentifiersByExternalEventId].
         */
        fun searchIdentifiersByExternalEventId(
            externalEventId: String
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>
        > =
            searchIdentifiersByExternalEventId(
                externalEventId,
                EventSearchIdentifiersByExternalEventIdParams.none(),
            )

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            params: EventSearchIdentifiersByExternalEventIdParams =
                EventSearchIdentifiersByExternalEventIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>
        > =
            searchIdentifiersByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            params: EventSearchIdentifiersByExternalEventIdParams =
                EventSearchIdentifiersByExternalEventIdParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>
        > = searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            params: EventSearchIdentifiersByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>
        >

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            params: EventSearchIdentifiersByExternalEventIdParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>
        > = searchIdentifiersByExternalEventId(params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>
        > =
            searchIdentifiersByExternalEventId(
                externalEventId,
                EventSearchIdentifiersByExternalEventIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/batch/update`, but
         * is otherwise the same as [EventServiceAsync.updateBatch].
         */
        fun updateBatch(
            params: EventUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: EventUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>>

        /** @see updateBatch */
        fun updateBatch(
            batchInputMarketingEventPublicUpdateRequestFullV2:
                BatchInputMarketingEventPublicUpdateRequestFullV2,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>> =
            updateBatch(
                EventUpdateBatchParams.builder()
                    .batchInputMarketingEventPublicUpdateRequestFullV2(
                        batchInputMarketingEventPublicUpdateRequestFullV2
                    )
                    .build(),
                requestOptions,
            )

        /** @see updateBatch */
        fun updateBatch(
            batchInputMarketingEventPublicUpdateRequestFullV2:
                BatchInputMarketingEventPublicUpdateRequestFullV2
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>> =
            updateBatch(batchInputMarketingEventPublicUpdateRequestFullV2, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventServiceAsync.updateByExternalEventId].
         */
        fun updateByExternalEventId(
            externalEventId: String,
            params: EventUpdateByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            updateByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see updateByExternalEventId */
        fun updateByExternalEventId(
            externalEventId: String,
            params: EventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            updateByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see updateByExternalEventId */
        fun updateByExternalEventId(
            params: EventUpdateByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            updateByExternalEventId(params, RequestOptions.none())

        /** @see updateByExternalEventId */
        fun updateByExternalEventId(
            params: EventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>>

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/events/upsert`, but
         * is otherwise the same as [EventServiceAsync.upsertBatch].
         */
        fun upsertBatch(
            params: EventUpsertBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>> =
            upsertBatch(params, RequestOptions.none())

        /** @see upsertBatch */
        fun upsertBatch(
            params: EventUpsertBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>>

        /** @see upsertBatch */
        fun upsertBatch(
            batchInputMarketingEventCreateRequestParams:
                BatchInputMarketingEventCreateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>> =
            upsertBatch(
                EventUpsertBatchParams.builder()
                    .batchInputMarketingEventCreateRequestParams(
                        batchInputMarketingEventCreateRequestParams
                    )
                    .build(),
                requestOptions,
            )

        /** @see upsertBatch */
        fun upsertBatch(
            batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>> =
            upsertBatch(batchInputMarketingEventCreateRequestParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventServiceAsync.upsertByExternalEventId].
         */
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: EventUpsertByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: EventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            upsertByExternalEventId(
                params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
                requestOptions,
            )

        /** @see upsertByExternalEventId */
        fun upsertByExternalEventId(
            params: EventUpsertByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            upsertByExternalEventId(params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        fun upsertByExternalEventId(
            params: EventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/{subscriberState}/email-upsert`,
         * but is otherwise the same as [EventServiceAsync.upsertSubscriberStateByEmail].
         */
        fun upsertSubscriberStateByEmail(
            subscriberState: String,
            params: EventUpsertSubscriberStateByEmailParams,
        ): CompletableFuture<HttpResponse> =
            upsertSubscriberStateByEmail(subscriberState, params, RequestOptions.none())

        /** @see upsertSubscriberStateByEmail */
        fun upsertSubscriberStateByEmail(
            subscriberState: String,
            params: EventUpsertSubscriberStateByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            upsertSubscriberStateByEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see upsertSubscriberStateByEmail */
        fun upsertSubscriberStateByEmail(
            params: EventUpsertSubscriberStateByEmailParams
        ): CompletableFuture<HttpResponse> =
            upsertSubscriberStateByEmail(params, RequestOptions.none())

        /** @see upsertSubscriberStateByEmail */
        fun upsertSubscriberStateByEmail(
            params: EventUpsertSubscriberStateByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/{subscriberState}/upsert`, but is
         * otherwise the same as [EventServiceAsync.upsertSubscriberStateById].
         */
        fun upsertSubscriberStateById(
            subscriberState: String,
            params: EventUpsertSubscriberStateByIdParams,
        ): CompletableFuture<HttpResponse> =
            upsertSubscriberStateById(subscriberState, params, RequestOptions.none())

        /** @see upsertSubscriberStateById */
        fun upsertSubscriberStateById(
            subscriberState: String,
            params: EventUpsertSubscriberStateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            upsertSubscriberStateById(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see upsertSubscriberStateById */
        fun upsertSubscriberStateById(
            params: EventUpsertSubscriberStateByIdParams
        ): CompletableFuture<HttpResponse> =
            upsertSubscriberStateById(params, RequestOptions.none())

        /** @see upsertSubscriberStateById */
        fun upsertSubscriberStateById(
            params: EventUpsertSubscriberStateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
