// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.marketing.events.MarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicDefaultResponseV2
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicReadResponse
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicReadResponseV2
import com.hubspot_sdk.api.services.blocking.marketing.events.AssociationService
import com.hubspot_sdk.api.services.blocking.marketing.events.AttendanceService
import com.hubspot_sdk.api.services.blocking.marketing.events.ParticipationService
import com.hubspot_sdk.api.services.blocking.marketing.events.SettingService
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    fun associations(): AssociationService

    fun attendance(): AttendanceService

    fun participations(): ParticipationService

    fun settings(): SettingService

    /** Creates a new marketing event in HubSpot */
    fun create(params: EventCreateParams): MarketingEventDefaultResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse

    /** @see create */
    fun create(
        marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse =
        create(
            EventCreateParams.builder()
                .marketingEventCreateRequestParams(marketingEventCreateRequestParams)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        marketingEventCreateRequestParams: MarketingEventCreateRequestParams
    ): MarketingEventDefaultResponse =
        create(marketingEventCreateRequestParams, RequestOptions.none())

    /**
     * Updates the details of an existing Marketing Event identified by its objectId, if it exists.
     */
    fun update(objectId: String, params: EventUpdateParams): MarketingEventPublicDefaultResponseV2 =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: EventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponseV2 =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: EventUpdateParams): MarketingEventPublicDefaultResponseV2 =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponseV2

    /**
     * Returns all Marketing Events available on the portal, along with their properties, regardless
     * of whether they were created manually or through the application.
     *
     * The marketing events returned by this endpoint are sorted by objectId.
     */
    fun list(): EventListPage = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage

    /** @see list */
    fun list(params: EventListParams = EventListParams.none()): EventListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EventListPage =
        list(EventListParams.none(), requestOptions)

    /** Deletes the existing Marketing Event with the specified objectId, if it exists. */
    fun delete(objectId: String) = delete(objectId, EventDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: EventDeleteParams = EventDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: EventDeleteParams = EventDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EventDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EventDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, EventDeleteParams.none(), requestOptions)

    /** Mark a marketing event as cancelled. */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
    ): MarketingEventDefaultResponse =
        cancelByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        externalEventId: String,
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse =
        cancelByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams
    ): MarketingEventDefaultResponse = cancelByExternalEventId(params, RequestOptions.none())

    /** @see cancelByExternalEventId */
    fun cancelByExternalEventId(
        params: EventCancelByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse

    /** Mark a marketing event as completed */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
    ): MarketingEventDefaultResponse =
        completeByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        externalEventId: String,
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse =
        completeByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams
    ): MarketingEventDefaultResponse = completeByExternalEventId(params, RequestOptions.none())

    /** @see completeByExternalEventId */
    fun completeByExternalEventId(
        params: EventCompleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse

    /**
     * Deletes multiple Marketing Events from the portal based on their objectId, if they exist.
     *
     * Responses: 204: Returned if all specified Marketing Events were successfully deleted. 207:
     * Returned if some objectIds did not correspond to any existing Marketing Events.
     */
    fun deleteBatch(params: EventDeleteBatchParams) = deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: EventDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputMarketingEventPublicObjectIdDeleteRequest:
            BatchInputMarketingEventPublicObjectIdDeleteRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
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
    ) = deleteBatch(batchInputMarketingEventPublicObjectIdDeleteRequest, RequestOptions.none())

    /**
     * Deletes multiple Marketing Events based on externalAccountId, externalEventId, and appId.
     *
     * Only Marketing Events created by the same apps will be deleted; events from other apps cannot
     * be removed by this endpoint.
     */
    @MustBeClosed
    fun deleteBatchByExternalEventId(
        params: EventDeleteBatchByExternalEventIdParams
    ): HttpResponse = deleteBatchByExternalEventId(params, RequestOptions.none())

    /** @see deleteBatchByExternalEventId */
    @MustBeClosed
    fun deleteBatchByExternalEventId(
        params: EventDeleteBatchByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see deleteBatchByExternalEventId */
    @MustBeClosed
    fun deleteBatchByExternalEventId(
        batchInputMarketingEventExternalUniqueIdentifier:
            BatchInputMarketingEventExternalUniqueIdentifier,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        deleteBatchByExternalEventId(
            EventDeleteBatchByExternalEventIdParams.builder()
                .batchInputMarketingEventExternalUniqueIdentifier(
                    batchInputMarketingEventExternalUniqueIdentifier
                )
                .build(),
            requestOptions,
        )

    /** @see deleteBatchByExternalEventId */
    @MustBeClosed
    fun deleteBatchByExternalEventId(
        batchInputMarketingEventExternalUniqueIdentifier:
            BatchInputMarketingEventExternalUniqueIdentifier
    ): HttpResponse =
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
    ) = deleteByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        externalEventId: String,
        params: EventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(params: EventDeleteByExternalEventIdParams) =
        deleteByExternalEventId(params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        params: EventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Returns the details of a Marketing Event with the specified objectId, if it exists. */
    fun get(objectId: String): MarketingEventPublicReadResponseV2 =
        get(objectId, EventGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: EventGetParams = EventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponseV2 =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: EventGetParams = EventGetParams.none(),
    ): MarketingEventPublicReadResponseV2 = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponseV2

    /** @see get */
    fun get(params: EventGetParams): MarketingEventPublicReadResponseV2 =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): MarketingEventPublicReadResponseV2 =
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
    ): MarketingEventPublicReadResponse =
        getByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        externalEventId: String,
        params: EventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponse =
        getByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: EventGetByExternalEventIdParams
    ): MarketingEventPublicReadResponse = getByExternalEventId(params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: EventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponse

    /**
     * Retrieves Marketing Events where the externalEventId matches the value provided in the
     * request, limited to events created by the app making the request.
     *
     * Marketing Events created by other apps will not be included in the results.
     */
    fun searchByExternalEventId(
        params: EventSearchByExternalEventIdParams
    ): CollectionResponseSearchPublicResponseWrapperNoPaging =
        searchByExternalEventId(params, RequestOptions.none())

    /** @see searchByExternalEventId */
    fun searchByExternalEventId(
        params: EventSearchByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseSearchPublicResponseWrapperNoPaging

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
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
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
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
        searchIdentifiersByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        params: EventSearchIdentifiersByExternalEventIdParams =
            EventSearchIdentifiersByExternalEventIdParams.none(),
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
        searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: EventSearchIdentifiersByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: EventSearchIdentifiersByExternalEventIdParams
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
        searchIdentifiersByExternalEventId(params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
        searchIdentifiersByExternalEventId(
            externalEventId,
            EventSearchIdentifiersByExternalEventIdParams.none(),
            requestOptions,
        )

    /** Updates multiple Marketing Events on the portal based on their objectId, if they exist. */
    fun updateBatch(
        params: EventUpdateBatchParams
    ): BatchResponseMarketingEventPublicDefaultResponseV2 =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: EventUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponseV2

    /** @see updateBatch */
    fun updateBatch(
        batchInputMarketingEventPublicUpdateRequestFullV2:
            BatchInputMarketingEventPublicUpdateRequestFullV2,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponseV2 =
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
    ): BatchResponseMarketingEventPublicDefaultResponseV2 =
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
    ): MarketingEventPublicDefaultResponse =
        updateByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        externalEventId: String,
        params: EventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse =
        updateByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: EventUpdateByExternalEventIdParams
    ): MarketingEventPublicDefaultResponse = updateByExternalEventId(params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: EventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse

    /**
     * Upserts multiple Marketing Events. If a Marketing Event with the specified ID already exists,
     * it will be updated; otherwise, a new event will be created.
     *
     * Only Marketing Events originally created by the same app can be updated.
     */
    fun upsertBatch(
        params: EventUpsertBatchParams
    ): BatchResponseMarketingEventPublicDefaultResponse = upsertBatch(params, RequestOptions.none())

    /** @see upsertBatch */
    fun upsertBatch(
        params: EventUpsertBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponse

    /** @see upsertBatch */
    fun upsertBatch(
        batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponse =
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
    ): BatchResponseMarketingEventPublicDefaultResponse =
        upsertBatch(batchInputMarketingEventCreateRequestParams, RequestOptions.none())

    /**
     * Upserts a marketing event If there is an existing marketing event with the specified ID, it
     * will be updated; otherwise a new event will be created.
     */
    fun upsertByExternalEventId(
        pathExternalEventId: String,
        params: EventUpsertByExternalEventIdParams,
    ): MarketingEventPublicDefaultResponse =
        upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        pathExternalEventId: String,
        params: EventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse =
        upsertByExternalEventId(
            params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
            requestOptions,
        )

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: EventUpsertByExternalEventIdParams
    ): MarketingEventPublicDefaultResponse = upsertByExternalEventId(params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: EventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * contact email addresses. Note that the contact must already exist in HubSpot; a contact will
     * not be created. The contactProperties field is used only when creating a new contact. These
     * properties will not update existing contacts.
     */
    @MustBeClosed
    fun upsertSubscriberStateByEmail(
        subscriberState: String,
        params: EventUpsertSubscriberStateByEmailParams,
    ): HttpResponse = upsertSubscriberStateByEmail(subscriberState, params, RequestOptions.none())

    /** @see upsertSubscriberStateByEmail */
    @MustBeClosed
    fun upsertSubscriberStateByEmail(
        subscriberState: String,
        params: EventUpsertSubscriberStateByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        upsertSubscriberStateByEmail(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see upsertSubscriberStateByEmail */
    @MustBeClosed
    fun upsertSubscriberStateByEmail(
        params: EventUpsertSubscriberStateByEmailParams
    ): HttpResponse = upsertSubscriberStateByEmail(params, RequestOptions.none())

    /** @see upsertSubscriberStateByEmail */
    @MustBeClosed
    fun upsertSubscriberStateByEmail(
        params: EventUpsertSubscriberStateByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * HubSpot contact IDs. Note that the contact must already exist in HubSpot; a contact will not
     * be created.
     */
    @MustBeClosed
    fun upsertSubscriberStateById(
        subscriberState: String,
        params: EventUpsertSubscriberStateByIdParams,
    ): HttpResponse = upsertSubscriberStateById(subscriberState, params, RequestOptions.none())

    /** @see upsertSubscriberStateById */
    @MustBeClosed
    fun upsertSubscriberStateById(
        subscriberState: String,
        params: EventUpsertSubscriberStateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        upsertSubscriberStateById(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see upsertSubscriberStateById */
    @MustBeClosed
    fun upsertSubscriberStateById(params: EventUpsertSubscriberStateByIdParams): HttpResponse =
        upsertSubscriberStateById(params, RequestOptions.none())

    /** @see upsertSubscriberStateById */
    @MustBeClosed
    fun upsertSubscriberStateById(
        params: EventUpsertSubscriberStateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        fun associations(): AssociationService.WithRawResponse

        fun attendance(): AttendanceService.WithRawResponse

        fun participations(): ParticipationService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/events`, but is
         * otherwise the same as [EventService.create].
         */
        @MustBeClosed
        fun create(params: EventCreateParams): HttpResponseFor<MarketingEventDefaultResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            create(
                EventCreateParams.builder()
                    .marketingEventCreateRequestParams(marketingEventCreateRequestParams)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            marketingEventCreateRequestParams: MarketingEventCreateRequestParams
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            create(marketingEventCreateRequestParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/v3/marketing-events/{objectId}`, but is
         * otherwise the same as [EventService.update].
         */
        @MustBeClosed
        fun update(
            objectId: String,
            params: EventUpdateParams,
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: EventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: EventUpdateParams
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2>

        /**
         * Returns a raw HTTP response for `get /marketing/v3/marketing-events/`, but is otherwise
         * the same as [EventService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EventListPage> = list(EventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none()): HttpResponseFor<EventListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPage> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/v3/marketing-events/{objectId}`, but
         * is otherwise the same as [EventService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, EventDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: EventDeleteParams = EventDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: EventDeleteParams = EventDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EventDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, EventDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/cancel`, but is otherwise the
         * same as [EventService.cancelByExternalEventId].
         */
        @MustBeClosed
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            cancelByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        @MustBeClosed
        fun cancelByExternalEventId(
            externalEventId: String,
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            cancelByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see cancelByExternalEventId */
        @MustBeClosed
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            cancelByExternalEventId(params, RequestOptions.none())

        /** @see cancelByExternalEventId */
        @MustBeClosed
        fun cancelByExternalEventId(
            params: EventCancelByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/complete`, but is otherwise the
         * same as [EventService.completeByExternalEventId].
         */
        @MustBeClosed
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            completeByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see completeByExternalEventId */
        @MustBeClosed
        fun completeByExternalEventId(
            externalEventId: String,
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            completeByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see completeByExternalEventId */
        @MustBeClosed
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            completeByExternalEventId(params, RequestOptions.none())

        /** @see completeByExternalEventId */
        @MustBeClosed
        fun completeByExternalEventId(
            params: EventCompleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse>

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/batch/archive`, but
         * is otherwise the same as [EventService.deleteBatch].
         */
        @MustBeClosed
        fun deleteBatch(params: EventDeleteBatchParams): HttpResponse =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            params: EventDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            batchInputMarketingEventPublicObjectIdDeleteRequest:
                BatchInputMarketingEventPublicObjectIdDeleteRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteBatch(
                EventDeleteBatchParams.builder()
                    .batchInputMarketingEventPublicObjectIdDeleteRequest(
                        batchInputMarketingEventPublicObjectIdDeleteRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            batchInputMarketingEventPublicObjectIdDeleteRequest:
                BatchInputMarketingEventPublicObjectIdDeleteRequest
        ): HttpResponse =
            deleteBatch(batchInputMarketingEventPublicObjectIdDeleteRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/events/delete`, but
         * is otherwise the same as [EventService.deleteBatchByExternalEventId].
         */
        @MustBeClosed
        fun deleteBatchByExternalEventId(
            params: EventDeleteBatchByExternalEventIdParams
        ): HttpResponse = deleteBatchByExternalEventId(params, RequestOptions.none())

        /** @see deleteBatchByExternalEventId */
        @MustBeClosed
        fun deleteBatchByExternalEventId(
            params: EventDeleteBatchByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteBatchByExternalEventId */
        @MustBeClosed
        fun deleteBatchByExternalEventId(
            batchInputMarketingEventExternalUniqueIdentifier:
                BatchInputMarketingEventExternalUniqueIdentifier,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteBatchByExternalEventId(
                EventDeleteBatchByExternalEventIdParams.builder()
                    .batchInputMarketingEventExternalUniqueIdentifier(
                        batchInputMarketingEventExternalUniqueIdentifier
                    )
                    .build(),
                requestOptions,
            )

        /** @see deleteBatchByExternalEventId */
        @MustBeClosed
        fun deleteBatchByExternalEventId(
            batchInputMarketingEventExternalUniqueIdentifier:
                BatchInputMarketingEventExternalUniqueIdentifier
        ): HttpResponse =
            deleteBatchByExternalEventId(
                batchInputMarketingEventExternalUniqueIdentifier,
                RequestOptions.none(),
            )

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventService.deleteByExternalEventId].
         */
        @MustBeClosed
        fun deleteByExternalEventId(
            externalEventId: String,
            params: EventDeleteByExternalEventIdParams,
        ): HttpResponse = deleteByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        @MustBeClosed
        fun deleteByExternalEventId(
            externalEventId: String,
            params: EventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see deleteByExternalEventId */
        @MustBeClosed
        fun deleteByExternalEventId(params: EventDeleteByExternalEventIdParams): HttpResponse =
            deleteByExternalEventId(params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        @MustBeClosed
        fun deleteByExternalEventId(
            params: EventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /marketing/v3/marketing-events/{objectId}`, but is
         * otherwise the same as [EventService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(objectId, EventGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: EventGetParams = EventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: EventGetParams = EventGetParams.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponseV2>

        /** @see get */
        @MustBeClosed
        fun get(params: EventGetParams): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(objectId, EventGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventService.getByExternalEventId].
         */
        @MustBeClosed
        fun getByExternalEventId(
            externalEventId: String,
            params: EventGetByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventPublicReadResponse> =
            getByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see getByExternalEventId */
        @MustBeClosed
        fun getByExternalEventId(
            externalEventId: String,
            params: EventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponse> =
            getByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see getByExternalEventId */
        @MustBeClosed
        fun getByExternalEventId(
            params: EventGetByExternalEventIdParams
        ): HttpResponseFor<MarketingEventPublicReadResponse> =
            getByExternalEventId(params, RequestOptions.none())

        /** @see getByExternalEventId */
        @MustBeClosed
        fun getByExternalEventId(
            params: EventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponse>

        /**
         * Returns a raw HTTP response for `get /marketing/v3/marketing-events/events/search`, but
         * is otherwise the same as [EventService.searchByExternalEventId].
         */
        @MustBeClosed
        fun searchByExternalEventId(
            params: EventSearchByExternalEventIdParams
        ): HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging> =
            searchByExternalEventId(params, RequestOptions.none())

        /** @see searchByExternalEventId */
        @MustBeClosed
        fun searchByExternalEventId(
            params: EventSearchByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/{externalEventId}/identifiers`, but is otherwise the same
         * as [EventService.searchIdentifiersByExternalEventId].
         */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
            searchIdentifiersByExternalEventId(
                externalEventId,
                EventSearchIdentifiersByExternalEventIdParams.none(),
            )

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            params: EventSearchIdentifiersByExternalEventIdParams =
                EventSearchIdentifiersByExternalEventIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
            searchIdentifiersByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            params: EventSearchIdentifiersByExternalEventIdParams =
                EventSearchIdentifiersByExternalEventIdParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
            searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            params: EventSearchIdentifiersByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging>

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            params: EventSearchIdentifiersByExternalEventIdParams
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
            searchIdentifiersByExternalEventId(params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging> =
            searchIdentifiersByExternalEventId(
                externalEventId,
                EventSearchIdentifiersByExternalEventIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/batch/update`, but
         * is otherwise the same as [EventService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(
            params: EventUpdateBatchParams
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: EventUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputMarketingEventPublicUpdateRequestFullV2:
                BatchInputMarketingEventPublicUpdateRequestFullV2,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2> =
            updateBatch(
                EventUpdateBatchParams.builder()
                    .batchInputMarketingEventPublicUpdateRequestFullV2(
                        batchInputMarketingEventPublicUpdateRequestFullV2
                    )
                    .build(),
                requestOptions,
            )

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputMarketingEventPublicUpdateRequestFullV2:
                BatchInputMarketingEventPublicUpdateRequestFullV2
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2> =
            updateBatch(batchInputMarketingEventPublicUpdateRequestFullV2, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventService.updateByExternalEventId].
         */
        @MustBeClosed
        fun updateByExternalEventId(
            externalEventId: String,
            params: EventUpdateByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            updateByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see updateByExternalEventId */
        @MustBeClosed
        fun updateByExternalEventId(
            externalEventId: String,
            params: EventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            updateByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see updateByExternalEventId */
        @MustBeClosed
        fun updateByExternalEventId(
            params: EventUpdateByExternalEventIdParams
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            updateByExternalEventId(params, RequestOptions.none())

        /** @see updateByExternalEventId */
        @MustBeClosed
        fun updateByExternalEventId(
            params: EventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse>

        /**
         * Returns a raw HTTP response for `post /marketing/v3/marketing-events/events/upsert`, but
         * is otherwise the same as [EventService.upsertBatch].
         */
        @MustBeClosed
        fun upsertBatch(
            params: EventUpsertBatchParams
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse> =
            upsertBatch(params, RequestOptions.none())

        /** @see upsertBatch */
        @MustBeClosed
        fun upsertBatch(
            params: EventUpsertBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>

        /** @see upsertBatch */
        @MustBeClosed
        fun upsertBatch(
            batchInputMarketingEventCreateRequestParams:
                BatchInputMarketingEventCreateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse> =
            upsertBatch(
                EventUpsertBatchParams.builder()
                    .batchInputMarketingEventCreateRequestParams(
                        batchInputMarketingEventCreateRequestParams
                    )
                    .build(),
                requestOptions,
            )

        /** @see upsertBatch */
        @MustBeClosed
        fun upsertBatch(
            batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse> =
            upsertBatch(batchInputMarketingEventCreateRequestParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /marketing/v3/marketing-events/events/{externalEventId}`, but is otherwise the same as
         * [EventService.upsertByExternalEventId].
         */
        @MustBeClosed
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: EventUpsertByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        @MustBeClosed
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: EventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            upsertByExternalEventId(
                params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
                requestOptions,
            )

        /** @see upsertByExternalEventId */
        @MustBeClosed
        fun upsertByExternalEventId(
            params: EventUpsertByExternalEventIdParams
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            upsertByExternalEventId(params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        @MustBeClosed
        fun upsertByExternalEventId(
            params: EventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/{subscriberState}/email-upsert`,
         * but is otherwise the same as [EventService.upsertSubscriberStateByEmail].
         */
        @MustBeClosed
        fun upsertSubscriberStateByEmail(
            subscriberState: String,
            params: EventUpsertSubscriberStateByEmailParams,
        ): HttpResponse =
            upsertSubscriberStateByEmail(subscriberState, params, RequestOptions.none())

        /** @see upsertSubscriberStateByEmail */
        @MustBeClosed
        fun upsertSubscriberStateByEmail(
            subscriberState: String,
            params: EventUpsertSubscriberStateByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            upsertSubscriberStateByEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see upsertSubscriberStateByEmail */
        @MustBeClosed
        fun upsertSubscriberStateByEmail(
            params: EventUpsertSubscriberStateByEmailParams
        ): HttpResponse = upsertSubscriberStateByEmail(params, RequestOptions.none())

        /** @see upsertSubscriberStateByEmail */
        @MustBeClosed
        fun upsertSubscriberStateByEmail(
            params: EventUpsertSubscriberStateByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/events/{externalEventId}/{subscriberState}/upsert`, but is
         * otherwise the same as [EventService.upsertSubscriberStateById].
         */
        @MustBeClosed
        fun upsertSubscriberStateById(
            subscriberState: String,
            params: EventUpsertSubscriberStateByIdParams,
        ): HttpResponse = upsertSubscriberStateById(subscriberState, params, RequestOptions.none())

        /** @see upsertSubscriberStateById */
        @MustBeClosed
        fun upsertSubscriberStateById(
            subscriberState: String,
            params: EventUpsertSubscriberStateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            upsertSubscriberStateById(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see upsertSubscriberStateById */
        @MustBeClosed
        fun upsertSubscriberStateById(params: EventUpsertSubscriberStateByIdParams): HttpResponse =
            upsertSubscriberStateById(params, RequestOptions.none())

        /** @see upsertSubscriberStateById */
        @MustBeClosed
        fun upsertSubscriberStateById(
            params: EventUpsertSubscriberStateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
