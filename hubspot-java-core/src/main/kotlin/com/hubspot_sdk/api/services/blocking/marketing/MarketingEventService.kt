// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchInputMarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchInputMarketingEventExternalUniqueIdentifier
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchInputMarketingEventPublicObjectIdDeleteRequest
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchInputMarketingEventPublicUpdateRequestFullV2
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponseV2
import com.hubspot_sdk.api.models.marketing.marketingevents.CollectionResponseSearchPublicResponseWrapperNoPaging
import com.hubspot_sdk.api.models.marketing.marketingevents.CollectionResponseWithTotalMarketingEventIdentifiersResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventCreateParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDefaultResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteBatchByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteBatchParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventDeleteParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventGetByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventGetParams
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventListPage
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
import com.hubspot_sdk.api.services.blocking.marketing.marketingevents.AttendanceService
import com.hubspot_sdk.api.services.blocking.marketing.marketingevents.EventService
import com.hubspot_sdk.api.services.blocking.marketing.marketingevents.ListAssociationService
import com.hubspot_sdk.api.services.blocking.marketing.marketingevents.ParticipationService
import com.hubspot_sdk.api.services.blocking.marketing.marketingevents.SettingService
import com.hubspot_sdk.api.services.blocking.marketing.marketingevents.SubscriberStateService
import java.util.function.Consumer

interface MarketingEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingEventService

    fun attendance(): AttendanceService

    fun events(): EventService

    fun listAssociations(): ListAssociationService

    fun participations(): ParticipationService

    fun settings(): SettingService

    fun subscriberState(): SubscriberStateService

    /** Creates a new marketing event in HubSpot */
    fun create(params: MarketingEventCreateParams): MarketingEventDefaultResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MarketingEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse

    /** @see create */
    fun create(
        marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventDefaultResponse =
        create(
            MarketingEventCreateParams.builder()
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
    fun update(
        objectId: String,
        params: MarketingEventUpdateParams,
    ): MarketingEventPublicDefaultResponseV2 = update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: MarketingEventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponseV2 =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: MarketingEventUpdateParams): MarketingEventPublicDefaultResponseV2 =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MarketingEventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponseV2

    fun list(): MarketingEventListPage = list(MarketingEventListParams.none())

    /** @see list */
    fun list(
        params: MarketingEventListParams = MarketingEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventListPage

    /** @see list */
    fun list(
        params: MarketingEventListParams = MarketingEventListParams.none()
    ): MarketingEventListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MarketingEventListPage =
        list(MarketingEventListParams.none(), requestOptions)

    /** Deletes the existing Marketing Event with the specified objectId, if it exists. */
    fun delete(objectId: String) = delete(objectId, MarketingEventDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
    ) = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MarketingEventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: MarketingEventDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, MarketingEventDeleteParams.none(), requestOptions)

    /**
     * Deletes multiple Marketing Events from the portal based on their objectId, if they exist.
     *
     * Responses: 204: Returned if all specified Marketing Events were successfully deleted. 207:
     * Returned if some objectIds did not correspond to any existing Marketing Events.
     */
    @MustBeClosed
    fun deleteBatch(params: MarketingEventDeleteBatchParams): HttpResponse =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    @MustBeClosed
    fun deleteBatch(
        params: MarketingEventDeleteBatchParams,
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
            MarketingEventDeleteBatchParams.builder()
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
     * Deletes multiple Marketing Events based on externalAccountId, externalEventId, and appId.
     *
     * Only Marketing Events created by the same apps will be deleted; events from other apps cannot
     * be removed by this endpoint.
     */
    @MustBeClosed
    fun deleteBatchByExternalEventId(
        params: MarketingEventDeleteBatchByExternalEventIdParams
    ): HttpResponse = deleteBatchByExternalEventId(params, RequestOptions.none())

    /** @see deleteBatchByExternalEventId */
    @MustBeClosed
    fun deleteBatchByExternalEventId(
        params: MarketingEventDeleteBatchByExternalEventIdParams,
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
            MarketingEventDeleteBatchByExternalEventIdParams.builder()
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
        params: MarketingEventDeleteByExternalEventIdParams,
    ) = deleteByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        externalEventId: String,
        params: MarketingEventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(params: MarketingEventDeleteByExternalEventIdParams) =
        deleteByExternalEventId(params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        params: MarketingEventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Returns the details of a Marketing Event with the specified objectId, if it exists. */
    fun get(objectId: String): MarketingEventPublicReadResponseV2 =
        get(objectId, MarketingEventGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: MarketingEventGetParams = MarketingEventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponseV2 =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: MarketingEventGetParams = MarketingEventGetParams.none(),
    ): MarketingEventPublicReadResponseV2 = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MarketingEventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponseV2

    /** @see get */
    fun get(params: MarketingEventGetParams): MarketingEventPublicReadResponseV2 =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): MarketingEventPublicReadResponseV2 =
        get(objectId, MarketingEventGetParams.none(), requestOptions)

    /**
     * Returns the details of a Marketing Event with the specified externalAccountId,
     * externalEventId, if it exists.
     *
     * Only Marketing Events created by the same app making the request can be retrieved.
     */
    fun getByExternalEventId(
        externalEventId: String,
        params: MarketingEventGetByExternalEventIdParams,
    ): MarketingEventPublicReadResponse =
        getByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        externalEventId: String,
        params: MarketingEventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponse =
        getByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: MarketingEventGetByExternalEventIdParams
    ): MarketingEventPublicReadResponse = getByExternalEventId(params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: MarketingEventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicReadResponse

    /**
     * Retrieves Marketing Events where the externalEventId matches the value provided in the
     * request, limited to events created by the app making the request.
     *
     * Marketing Events created by other apps will not be included in the results.
     */
    fun searchByExternalEventId(
        params: MarketingEventSearchByExternalEventIdParams
    ): CollectionResponseSearchPublicResponseWrapperNoPaging =
        searchByExternalEventId(params, RequestOptions.none())

    /** @see searchByExternalEventId */
    fun searchByExternalEventId(
        params: MarketingEventSearchByExternalEventIdParams,
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
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponse =
        searchIdentifiersByExternalEventId(
            externalEventId,
            MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
        )

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        params: MarketingEventSearchIdentifiersByExternalEventIdParams =
            MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponse =
        searchIdentifiersByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        params: MarketingEventSearchIdentifiersByExternalEventIdParams =
            MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponse =
        searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: MarketingEventSearchIdentifiersByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponse

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: MarketingEventSearchIdentifiersByExternalEventIdParams
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponse =
        searchIdentifiersByExternalEventId(params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalMarketingEventIdentifiersResponse =
        searchIdentifiersByExternalEventId(
            externalEventId,
            MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
            requestOptions,
        )

    /** Updates multiple Marketing Events on the portal based on their objectId, if they exist. */
    fun updateBatch(
        params: MarketingEventUpdateBatchParams
    ): BatchResponseMarketingEventPublicDefaultResponseV2 =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: MarketingEventUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponseV2

    /** @see updateBatch */
    fun updateBatch(
        batchInputMarketingEventPublicUpdateRequestFullV2:
            BatchInputMarketingEventPublicUpdateRequestFullV2,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponseV2 =
        updateBatch(
            MarketingEventUpdateBatchParams.builder()
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
        params: MarketingEventUpdateByExternalEventIdParams,
    ): MarketingEventPublicDefaultResponse =
        updateByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        externalEventId: String,
        params: MarketingEventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse =
        updateByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: MarketingEventUpdateByExternalEventIdParams
    ): MarketingEventPublicDefaultResponse = updateByExternalEventId(params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: MarketingEventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse

    /**
     * Upserts multiple Marketing Events. If a Marketing Event with the specified ID already exists,
     * it will be updated; otherwise, a new event will be created.
     *
     * Only Marketing Events originally created by the same app can be updated.
     */
    fun upsertBatch(
        params: MarketingEventUpsertBatchParams
    ): BatchResponseMarketingEventPublicDefaultResponse = upsertBatch(params, RequestOptions.none())

    /** @see upsertBatch */
    fun upsertBatch(
        params: MarketingEventUpsertBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponse

    /** @see upsertBatch */
    fun upsertBatch(
        batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseMarketingEventPublicDefaultResponse =
        upsertBatch(
            MarketingEventUpsertBatchParams.builder()
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
        params: MarketingEventUpsertByExternalEventIdParams,
    ): MarketingEventPublicDefaultResponse =
        upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        pathExternalEventId: String,
        params: MarketingEventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse =
        upsertByExternalEventId(
            params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
            requestOptions,
        )

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: MarketingEventUpsertByExternalEventIdParams
    ): MarketingEventPublicDefaultResponse = upsertByExternalEventId(params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: MarketingEventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketingEventPublicDefaultResponse

    /**
     * A view of [MarketingEventService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingEventService.WithRawResponse

        fun attendance(): AttendanceService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun listAssociations(): ListAssociationService.WithRawResponse

        fun participations(): ParticipationService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun subscriberState(): SubscriberStateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/events`, but is
         * otherwise the same as [MarketingEventService.create].
         */
        @MustBeClosed
        fun create(
            params: MarketingEventCreateParams
        ): HttpResponseFor<MarketingEventDefaultResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MarketingEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventDefaultResponse> =
            create(
                MarketingEventCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /marketing/marketing-events/2026-03/{objectId}`,
         * but is otherwise the same as [MarketingEventService.update].
         */
        @MustBeClosed
        fun update(
            objectId: String,
            params: MarketingEventUpdateParams,
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: MarketingEventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: MarketingEventUpdateParams
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MarketingEventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponseV2>

        /**
         * Returns a raw HTTP response for `get /marketing/marketing-events/2026-03`, but is
         * otherwise the same as [MarketingEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MarketingEventListPage> = list(MarketingEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MarketingEventListParams = MarketingEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MarketingEventListParams = MarketingEventListParams.none()
        ): HttpResponseFor<MarketingEventListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MarketingEventListPage> =
            list(MarketingEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/marketing-events/2026-03/{objectId}`,
         * but is otherwise the same as [MarketingEventService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse =
            delete(objectId, MarketingEventDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MarketingEventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MarketingEventDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, MarketingEventDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/batch/archive`,
         * but is otherwise the same as [MarketingEventService.deleteBatch].
         */
        @MustBeClosed
        fun deleteBatch(params: MarketingEventDeleteBatchParams): HttpResponse =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            params: MarketingEventDeleteBatchParams,
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
                MarketingEventDeleteBatchParams.builder()
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
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/events/delete`,
         * but is otherwise the same as [MarketingEventService.deleteBatchByExternalEventId].
         */
        @MustBeClosed
        fun deleteBatchByExternalEventId(
            params: MarketingEventDeleteBatchByExternalEventIdParams
        ): HttpResponse = deleteBatchByExternalEventId(params, RequestOptions.none())

        /** @see deleteBatchByExternalEventId */
        @MustBeClosed
        fun deleteBatchByExternalEventId(
            params: MarketingEventDeleteBatchByExternalEventIdParams,
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
                MarketingEventDeleteBatchByExternalEventIdParams.builder()
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
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventService.deleteByExternalEventId].
         */
        @MustBeClosed
        fun deleteByExternalEventId(
            externalEventId: String,
            params: MarketingEventDeleteByExternalEventIdParams,
        ): HttpResponse = deleteByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        @MustBeClosed
        fun deleteByExternalEventId(
            externalEventId: String,
            params: MarketingEventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see deleteByExternalEventId */
        @MustBeClosed
        fun deleteByExternalEventId(
            params: MarketingEventDeleteByExternalEventIdParams
        ): HttpResponse = deleteByExternalEventId(params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        @MustBeClosed
        fun deleteByExternalEventId(
            params: MarketingEventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /marketing/marketing-events/2026-03/{objectId}`, but
         * is otherwise the same as [MarketingEventService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(objectId, MarketingEventGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: MarketingEventGetParams = MarketingEventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: MarketingEventGetParams = MarketingEventGetParams.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: MarketingEventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponseV2>

        /** @see get */
        @MustBeClosed
        fun get(
            params: MarketingEventGetParams
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketingEventPublicReadResponseV2> =
            get(objectId, MarketingEventGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventService.getByExternalEventId].
         */
        @MustBeClosed
        fun getByExternalEventId(
            externalEventId: String,
            params: MarketingEventGetByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventPublicReadResponse> =
            getByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see getByExternalEventId */
        @MustBeClosed
        fun getByExternalEventId(
            externalEventId: String,
            params: MarketingEventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponse> =
            getByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see getByExternalEventId */
        @MustBeClosed
        fun getByExternalEventId(
            params: MarketingEventGetByExternalEventIdParams
        ): HttpResponseFor<MarketingEventPublicReadResponse> =
            getByExternalEventId(params, RequestOptions.none())

        /** @see getByExternalEventId */
        @MustBeClosed
        fun getByExternalEventId(
            params: MarketingEventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicReadResponse>

        /**
         * Returns a raw HTTP response for `get /marketing/marketing-events/2026-03/events/search`,
         * but is otherwise the same as [MarketingEventService.searchByExternalEventId].
         */
        @MustBeClosed
        fun searchByExternalEventId(
            params: MarketingEventSearchByExternalEventIdParams
        ): HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging> =
            searchByExternalEventId(params, RequestOptions.none())

        /** @see searchByExternalEventId */
        @MustBeClosed
        fun searchByExternalEventId(
            params: MarketingEventSearchByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/{externalEventId}/identifiers`, but is otherwise the
         * same as [MarketingEventService.searchIdentifiersByExternalEventId].
         */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
            searchIdentifiersByExternalEventId(
                externalEventId,
                MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
            )

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            params: MarketingEventSearchIdentifiersByExternalEventIdParams =
                MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
            searchIdentifiersByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            params: MarketingEventSearchIdentifiersByExternalEventIdParams =
                MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
            searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            params: MarketingEventSearchIdentifiersByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            params: MarketingEventSearchIdentifiersByExternalEventIdParams
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
            searchIdentifiersByExternalEventId(params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        @MustBeClosed
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
            searchIdentifiersByExternalEventId(
                externalEventId,
                MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/batch/update`,
         * but is otherwise the same as [MarketingEventService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(
            params: MarketingEventUpdateBatchParams
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: MarketingEventUpdateBatchParams,
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
                MarketingEventUpdateBatchParams.builder()
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
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventService.updateByExternalEventId].
         */
        @MustBeClosed
        fun updateByExternalEventId(
            externalEventId: String,
            params: MarketingEventUpdateByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            updateByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see updateByExternalEventId */
        @MustBeClosed
        fun updateByExternalEventId(
            externalEventId: String,
            params: MarketingEventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            updateByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see updateByExternalEventId */
        @MustBeClosed
        fun updateByExternalEventId(
            params: MarketingEventUpdateByExternalEventIdParams
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            updateByExternalEventId(params, RequestOptions.none())

        /** @see updateByExternalEventId */
        @MustBeClosed
        fun updateByExternalEventId(
            params: MarketingEventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse>

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/events/upsert`,
         * but is otherwise the same as [MarketingEventService.upsertBatch].
         */
        @MustBeClosed
        fun upsertBatch(
            params: MarketingEventUpsertBatchParams
        ): HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse> =
            upsertBatch(params, RequestOptions.none())

        /** @see upsertBatch */
        @MustBeClosed
        fun upsertBatch(
            params: MarketingEventUpsertBatchParams,
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
                MarketingEventUpsertBatchParams.builder()
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
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventService.upsertByExternalEventId].
         */
        @MustBeClosed
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: MarketingEventUpsertByExternalEventIdParams,
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        @MustBeClosed
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: MarketingEventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            upsertByExternalEventId(
                params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
                requestOptions,
            )

        /** @see upsertByExternalEventId */
        @MustBeClosed
        fun upsertByExternalEventId(
            params: MarketingEventUpsertByExternalEventIdParams
        ): HttpResponseFor<MarketingEventPublicDefaultResponse> =
            upsertByExternalEventId(params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        @MustBeClosed
        fun upsertByExternalEventId(
            params: MarketingEventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketingEventPublicDefaultResponse>
    }
}
