// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventCreateRequestParams
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventExternalUniqueIdentifier
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventPublicObjectIdDeleteRequest
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventPublicUpdateRequestFullV2
import com.hubspot.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponse
import com.hubspot.models.marketing.marketingevents.BatchResponseMarketingEventPublicDefaultResponseV2
import com.hubspot.models.marketing.marketingevents.CollectionResponseSearchPublicResponseWrapperNoPaging
import com.hubspot.models.marketing.marketingevents.CollectionResponseWithTotalMarketingEventIdentifiersResponse
import com.hubspot.models.marketing.marketingevents.MarketingEventCreateParams
import com.hubspot.models.marketing.marketingevents.MarketingEventCreateRequestParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDefaultResponse
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteBatchByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteBatchParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteParams
import com.hubspot.models.marketing.marketingevents.MarketingEventGetByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventGetParams
import com.hubspot.models.marketing.marketingevents.MarketingEventListPageAsync
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
import com.hubspot.services.async.marketing.marketingevents.AttendanceServiceAsync
import com.hubspot.services.async.marketing.marketingevents.EventServiceAsync
import com.hubspot.services.async.marketing.marketingevents.ListAssociationServiceAsync
import com.hubspot.services.async.marketing.marketingevents.ParticipationServiceAsync
import com.hubspot.services.async.marketing.marketingevents.SettingServiceAsync
import com.hubspot.services.async.marketing.marketingevents.SubscriberStateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MarketingEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingEventServiceAsync

    fun attendance(): AttendanceServiceAsync

    fun events(): EventServiceAsync

    fun listAssociations(): ListAssociationServiceAsync

    fun participations(): ParticipationServiceAsync

    fun settings(): SettingServiceAsync

    fun subscriberState(): SubscriberStateServiceAsync

    /** Creates a new marketing event in HubSpot */
    fun create(
        params: MarketingEventCreateParams
    ): CompletableFuture<MarketingEventDefaultResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MarketingEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse>

    /** @see create */
    fun create(
        marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventDefaultResponse> =
        create(
            MarketingEventCreateParams.builder()
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
        params: MarketingEventUpdateParams,
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: MarketingEventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(
        params: MarketingEventUpdateParams
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MarketingEventUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponseV2>

    fun list(): CompletableFuture<MarketingEventListPageAsync> =
        list(MarketingEventListParams.none())

    /** @see list */
    fun list(
        params: MarketingEventListParams = MarketingEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventListPageAsync>

    /** @see list */
    fun list(
        params: MarketingEventListParams = MarketingEventListParams.none()
    ): CompletableFuture<MarketingEventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MarketingEventListPageAsync> =
        list(MarketingEventListParams.none(), requestOptions)

    /** Deletes the existing Marketing Event with the specified objectId, if it exists. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, MarketingEventDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MarketingEventDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MarketingEventDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, MarketingEventDeleteParams.none(), requestOptions)

    /**
     * Deletes multiple Marketing Events from the portal based on their objectId, if they exist.
     *
     * Responses: 204: Returned if all specified Marketing Events were successfully deleted. 207:
     * Returned if some objectIds did not correspond to any existing Marketing Events.
     */
    fun deleteBatch(params: MarketingEventDeleteBatchParams): CompletableFuture<HttpResponse> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: MarketingEventDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputMarketingEventPublicObjectIdDeleteRequest:
            BatchInputMarketingEventPublicObjectIdDeleteRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        deleteBatch(
            MarketingEventDeleteBatchParams.builder()
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
     * Deletes multiple Marketing Events based on externalAccountId, externalEventId, and appId.
     *
     * Only Marketing Events created by the same apps will be deleted; events from other apps cannot
     * be removed by this endpoint.
     */
    fun deleteBatchByExternalEventId(
        params: MarketingEventDeleteBatchByExternalEventIdParams
    ): CompletableFuture<HttpResponse> = deleteBatchByExternalEventId(params, RequestOptions.none())

    /** @see deleteBatchByExternalEventId */
    fun deleteBatchByExternalEventId(
        params: MarketingEventDeleteBatchByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see deleteBatchByExternalEventId */
    fun deleteBatchByExternalEventId(
        batchInputMarketingEventExternalUniqueIdentifier:
            BatchInputMarketingEventExternalUniqueIdentifier,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        deleteBatchByExternalEventId(
            MarketingEventDeleteBatchByExternalEventIdParams.builder()
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
        params: MarketingEventDeleteByExternalEventIdParams,
    ): CompletableFuture<Void?> =
        deleteByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        externalEventId: String,
        params: MarketingEventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        params: MarketingEventDeleteByExternalEventIdParams
    ): CompletableFuture<Void?> = deleteByExternalEventId(params, RequestOptions.none())

    /** @see deleteByExternalEventId */
    fun deleteByExternalEventId(
        params: MarketingEventDeleteByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns the details of a Marketing Event with the specified objectId, if it exists. */
    fun get(objectId: String): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(objectId, MarketingEventGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: MarketingEventGetParams = MarketingEventGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: MarketingEventGetParams = MarketingEventGetParams.none(),
    ): CompletableFuture<MarketingEventPublicReadResponseV2> =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MarketingEventGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponseV2>

    /** @see get */
    fun get(
        params: MarketingEventGetParams
    ): CompletableFuture<MarketingEventPublicReadResponseV2> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketingEventPublicReadResponseV2> =
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
    ): CompletableFuture<MarketingEventPublicReadResponse> =
        getByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        externalEventId: String,
        params: MarketingEventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponse> =
        getByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: MarketingEventGetByExternalEventIdParams
    ): CompletableFuture<MarketingEventPublicReadResponse> =
        getByExternalEventId(params, RequestOptions.none())

    /** @see getByExternalEventId */
    fun getByExternalEventId(
        params: MarketingEventGetByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicReadResponse>

    /**
     * Retrieves Marketing Events where the externalEventId matches the value provided in the
     * request, limited to events created by the app making the request.
     *
     * Marketing Events created by other apps will not be included in the results.
     */
    fun searchByExternalEventId(
        params: MarketingEventSearchByExternalEventIdParams
    ): CompletableFuture<CollectionResponseSearchPublicResponseWrapperNoPaging> =
        searchByExternalEventId(params, RequestOptions.none())

    /** @see searchByExternalEventId */
    fun searchByExternalEventId(
        params: MarketingEventSearchByExternalEventIdParams,
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
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
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
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
        searchIdentifiersByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        params: MarketingEventSearchIdentifiersByExternalEventIdParams =
            MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
        searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: MarketingEventSearchIdentifiersByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponse>

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        params: MarketingEventSearchIdentifiersByExternalEventIdParams
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
        searchIdentifiersByExternalEventId(params, RequestOptions.none())

    /** @see searchIdentifiersByExternalEventId */
    fun searchIdentifiersByExternalEventId(
        externalEventId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalMarketingEventIdentifiersResponse> =
        searchIdentifiersByExternalEventId(
            externalEventId,
            MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
            requestOptions,
        )

    /** Updates multiple Marketing Events on the portal based on their objectId, if they exist. */
    fun updateBatch(
        params: MarketingEventUpdateBatchParams
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: MarketingEventUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2>

    /** @see updateBatch */
    fun updateBatch(
        batchInputMarketingEventPublicUpdateRequestFullV2:
            BatchInputMarketingEventPublicUpdateRequestFullV2,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponseV2> =
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
        params: MarketingEventUpdateByExternalEventIdParams,
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        updateByExternalEventId(externalEventId, params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        externalEventId: String,
        params: MarketingEventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        updateByExternalEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: MarketingEventUpdateByExternalEventIdParams
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        updateByExternalEventId(params, RequestOptions.none())

    /** @see updateByExternalEventId */
    fun updateByExternalEventId(
        params: MarketingEventUpdateByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse>

    /**
     * Upserts multiple Marketing Events. If a Marketing Event with the specified ID already exists,
     * it will be updated; otherwise, a new event will be created.
     *
     * Only Marketing Events originally created by the same app can be updated.
     */
    fun upsertBatch(
        params: MarketingEventUpsertBatchParams
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse> =
        upsertBatch(params, RequestOptions.none())

    /** @see upsertBatch */
    fun upsertBatch(
        params: MarketingEventUpsertBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse>

    /** @see upsertBatch */
    fun upsertBatch(
        batchInputMarketingEventCreateRequestParams: BatchInputMarketingEventCreateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse> =
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
    ): CompletableFuture<BatchResponseMarketingEventPublicDefaultResponse> =
        upsertBatch(batchInputMarketingEventCreateRequestParams, RequestOptions.none())

    /**
     * Upserts a marketing event If there is an existing marketing event with the specified ID, it
     * will be updated; otherwise a new event will be created.
     */
    fun upsertByExternalEventId(
        pathExternalEventId: String,
        params: MarketingEventUpsertByExternalEventIdParams,
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        pathExternalEventId: String,
        params: MarketingEventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        upsertByExternalEventId(
            params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
            requestOptions,
        )

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: MarketingEventUpsertByExternalEventIdParams
    ): CompletableFuture<MarketingEventPublicDefaultResponse> =
        upsertByExternalEventId(params, RequestOptions.none())

    /** @see upsertByExternalEventId */
    fun upsertByExternalEventId(
        params: MarketingEventUpsertByExternalEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketingEventPublicDefaultResponse>

    /**
     * A view of [MarketingEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingEventServiceAsync.WithRawResponse

        fun attendance(): AttendanceServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun listAssociations(): ListAssociationServiceAsync.WithRawResponse

        fun participations(): ParticipationServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun subscriberState(): SubscriberStateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/events`, but is
         * otherwise the same as [MarketingEventServiceAsync.create].
         */
        fun create(
            params: MarketingEventCreateParams
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MarketingEventCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>>

        /** @see create */
        fun create(
            marketingEventCreateRequestParams: MarketingEventCreateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventDefaultResponse>> =
            create(
                MarketingEventCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /marketing/marketing-events/2026-03/{objectId}`,
         * but is otherwise the same as [MarketingEventServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: MarketingEventUpdateParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: MarketingEventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(
            params: MarketingEventUpdateParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MarketingEventUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponseV2>>

        /**
         * Returns a raw HTTP response for `get /marketing/marketing-events/2026-03`, but is
         * otherwise the same as [MarketingEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MarketingEventListPageAsync>> =
            list(MarketingEventListParams.none())

        /** @see list */
        fun list(
            params: MarketingEventListParams = MarketingEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventListPageAsync>>

        /** @see list */
        fun list(
            params: MarketingEventListParams = MarketingEventListParams.none()
        ): CompletableFuture<HttpResponseFor<MarketingEventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MarketingEventListPageAsync>> =
            list(MarketingEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/marketing-events/2026-03/{objectId}`,
         * but is otherwise the same as [MarketingEventServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, MarketingEventDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: MarketingEventDeleteParams = MarketingEventDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MarketingEventDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MarketingEventDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, MarketingEventDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/batch/archive`,
         * but is otherwise the same as [MarketingEventServiceAsync.deleteBatch].
         */
        fun deleteBatch(params: MarketingEventDeleteBatchParams): CompletableFuture<HttpResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: MarketingEventDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatch */
        fun deleteBatch(
            batchInputMarketingEventPublicObjectIdDeleteRequest:
                BatchInputMarketingEventPublicObjectIdDeleteRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatch(
                MarketingEventDeleteBatchParams.builder()
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
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/events/delete`,
         * but is otherwise the same as [MarketingEventServiceAsync.deleteBatchByExternalEventId].
         */
        fun deleteBatchByExternalEventId(
            params: MarketingEventDeleteBatchByExternalEventIdParams
        ): CompletableFuture<HttpResponse> =
            deleteBatchByExternalEventId(params, RequestOptions.none())

        /** @see deleteBatchByExternalEventId */
        fun deleteBatchByExternalEventId(
            params: MarketingEventDeleteBatchByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatchByExternalEventId */
        fun deleteBatchByExternalEventId(
            batchInputMarketingEventExternalUniqueIdentifier:
                BatchInputMarketingEventExternalUniqueIdentifier,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatchByExternalEventId(
                MarketingEventDeleteBatchByExternalEventIdParams.builder()
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
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventServiceAsync.deleteByExternalEventId].
         */
        fun deleteByExternalEventId(
            externalEventId: String,
            params: MarketingEventDeleteByExternalEventIdParams,
        ): CompletableFuture<HttpResponse> =
            deleteByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        fun deleteByExternalEventId(
            externalEventId: String,
            params: MarketingEventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see deleteByExternalEventId */
        fun deleteByExternalEventId(
            params: MarketingEventDeleteByExternalEventIdParams
        ): CompletableFuture<HttpResponse> = deleteByExternalEventId(params, RequestOptions.none())

        /** @see deleteByExternalEventId */
        fun deleteByExternalEventId(
            params: MarketingEventDeleteByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /marketing/marketing-events/2026-03/{objectId}`, but
         * is otherwise the same as [MarketingEventServiceAsync.get].
         */
        fun get(
            objectId: String
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(objectId, MarketingEventGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: MarketingEventGetParams = MarketingEventGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: MarketingEventGetParams = MarketingEventGetParams.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: MarketingEventGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>>

        /** @see get */
        fun get(
            params: MarketingEventGetParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponseV2>> =
            get(objectId, MarketingEventGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventServiceAsync.getByExternalEventId].
         */
        fun getByExternalEventId(
            externalEventId: String,
            params: MarketingEventGetByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>> =
            getByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see getByExternalEventId */
        fun getByExternalEventId(
            externalEventId: String,
            params: MarketingEventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>> =
            getByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see getByExternalEventId */
        fun getByExternalEventId(
            params: MarketingEventGetByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>> =
            getByExternalEventId(params, RequestOptions.none())

        /** @see getByExternalEventId */
        fun getByExternalEventId(
            params: MarketingEventGetByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicReadResponse>>

        /**
         * Returns a raw HTTP response for `get /marketing/marketing-events/2026-03/events/search`,
         * but is otherwise the same as [MarketingEventServiceAsync.searchByExternalEventId].
         */
        fun searchByExternalEventId(
            params: MarketingEventSearchByExternalEventIdParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging>
        > = searchByExternalEventId(params, RequestOptions.none())

        /** @see searchByExternalEventId */
        fun searchByExternalEventId(
            params: MarketingEventSearchByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseSearchPublicResponseWrapperNoPaging>>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/{externalEventId}/identifiers`, but is otherwise the
         * same as [MarketingEventServiceAsync.searchIdentifiersByExternalEventId].
         */
        fun searchIdentifiersByExternalEventId(
            externalEventId: String
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>
        > =
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
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>
        > =
            searchIdentifiersByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            params: MarketingEventSearchIdentifiersByExternalEventIdParams =
                MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>
        > = searchIdentifiersByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            params: MarketingEventSearchIdentifiersByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>
        >

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            params: MarketingEventSearchIdentifiersByExternalEventIdParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>
        > = searchIdentifiersByExternalEventId(params, RequestOptions.none())

        /** @see searchIdentifiersByExternalEventId */
        fun searchIdentifiersByExternalEventId(
            externalEventId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalMarketingEventIdentifiersResponse>
        > =
            searchIdentifiersByExternalEventId(
                externalEventId,
                MarketingEventSearchIdentifiersByExternalEventIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/batch/update`,
         * but is otherwise the same as [MarketingEventServiceAsync.updateBatch].
         */
        fun updateBatch(
            params: MarketingEventUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: MarketingEventUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>>

        /** @see updateBatch */
        fun updateBatch(
            batchInputMarketingEventPublicUpdateRequestFullV2:
                BatchInputMarketingEventPublicUpdateRequestFullV2,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>> =
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
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponseV2>> =
            updateBatch(batchInputMarketingEventPublicUpdateRequestFullV2, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventServiceAsync.updateByExternalEventId].
         */
        fun updateByExternalEventId(
            externalEventId: String,
            params: MarketingEventUpdateByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            updateByExternalEventId(externalEventId, params, RequestOptions.none())

        /** @see updateByExternalEventId */
        fun updateByExternalEventId(
            externalEventId: String,
            params: MarketingEventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            updateByExternalEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see updateByExternalEventId */
        fun updateByExternalEventId(
            params: MarketingEventUpdateByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            updateByExternalEventId(params, RequestOptions.none())

        /** @see updateByExternalEventId */
        fun updateByExternalEventId(
            params: MarketingEventUpdateByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>>

        /**
         * Returns a raw HTTP response for `post /marketing/marketing-events/2026-03/events/upsert`,
         * but is otherwise the same as [MarketingEventServiceAsync.upsertBatch].
         */
        fun upsertBatch(
            params: MarketingEventUpsertBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>> =
            upsertBatch(params, RequestOptions.none())

        /** @see upsertBatch */
        fun upsertBatch(
            params: MarketingEventUpsertBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>>

        /** @see upsertBatch */
        fun upsertBatch(
            batchInputMarketingEventCreateRequestParams:
                BatchInputMarketingEventCreateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>> =
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
        ): CompletableFuture<HttpResponseFor<BatchResponseMarketingEventPublicDefaultResponse>> =
            upsertBatch(batchInputMarketingEventCreateRequestParams, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /marketing/marketing-events/2026-03/events/{externalEventId}`, but is otherwise the same
         * as [MarketingEventServiceAsync.upsertByExternalEventId].
         */
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: MarketingEventUpsertByExternalEventIdParams,
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            upsertByExternalEventId(pathExternalEventId, params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        fun upsertByExternalEventId(
            pathExternalEventId: String,
            params: MarketingEventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            upsertByExternalEventId(
                params.toBuilder().pathExternalEventId(pathExternalEventId).build(),
                requestOptions,
            )

        /** @see upsertByExternalEventId */
        fun upsertByExternalEventId(
            params: MarketingEventUpsertByExternalEventIdParams
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>> =
            upsertByExternalEventId(params, RequestOptions.none())

        /** @see upsertByExternalEventId */
        fun upsertByExternalEventId(
            params: MarketingEventUpsertByExternalEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketingEventPublicDefaultResponse>>
    }
}
