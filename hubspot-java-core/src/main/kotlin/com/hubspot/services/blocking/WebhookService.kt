// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.BatchInputString
import com.hubspot.models.webhooks.AppLifecycleEventSubscriptionUpsertRequest
import com.hubspot.models.webhooks.AssociationSubscriptionUpsertRequest
import com.hubspot.models.webhooks.BatchResponseJournalFetchResponse
import com.hubspot.models.webhooks.BatchResponseSubscriptionResponse
import com.hubspot.models.webhooks.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot.models.webhooks.CrmObjectSnapshotBatchRequest
import com.hubspot.models.webhooks.CrmObjectSnapshotBatchResponse
import com.hubspot.models.webhooks.FilterCreateRequest
import com.hubspot.models.webhooks.FilterCreateResponse
import com.hubspot.models.webhooks.FilterResponse
import com.hubspot.models.webhooks.ListMembershipSubscriptionUpsertRequest
import com.hubspot.models.webhooks.ObjectSubscriptionUpsertRequest
import com.hubspot.models.webhooks.SettingsResponse
import com.hubspot.models.webhooks.SnapshotStatusResponse
import com.hubspot.models.webhooks.SubscriptionListResponse
import com.hubspot.models.webhooks.SubscriptionResponse
import com.hubspot.models.webhooks.SubscriptionResponse1
import com.hubspot.models.webhooks.SubscriptionUpsertRequest
import com.hubspot.models.webhooks.WebhookCreateCrmSnapshotParams
import com.hubspot.models.webhooks.WebhookCreateJournalSubscriptionParams
import com.hubspot.models.webhooks.WebhookCreateSubscriptionFilterParams
import com.hubspot.models.webhooks.WebhookCreateSubscriptionParams
import com.hubspot.models.webhooks.WebhookCreateSubscriptionsBatchParams
import com.hubspot.models.webhooks.WebhookDeleteJournalSubscriptionParams
import com.hubspot.models.webhooks.WebhookDeletePortalSubscriptionsParams
import com.hubspot.models.webhooks.WebhookDeleteSettingsParams
import com.hubspot.models.webhooks.WebhookDeleteSubscriptionFilterParams
import com.hubspot.models.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot.models.webhooks.WebhookGetEarliestJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetEarliestJournalParams
import com.hubspot.models.webhooks.WebhookGetEarliestLocalJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetEarliestLocalJournalParams
import com.hubspot.models.webhooks.WebhookGetJournalBatchAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetJournalStatusParams
import com.hubspot.models.webhooks.WebhookGetLatestJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetLatestJournalParams
import com.hubspot.models.webhooks.WebhookGetLatestLocalJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetLatestLocalJournalParams
import com.hubspot.models.webhooks.WebhookGetLocalJournalBatchAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetLocalJournalBatchParams
import com.hubspot.models.webhooks.WebhookGetLocalJournalStatusParams
import com.hubspot.models.webhooks.WebhookGetNextJournalAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetNextLocalJournalAfterOffsetParams
import com.hubspot.models.webhooks.WebhookGetSettingsParams
import com.hubspot.models.webhooks.WebhookGetSubscriptionFilterParams
import com.hubspot.models.webhooks.WebhookGetSubscriptionFiltersParams
import com.hubspot.models.webhooks.WebhookGetSubscriptionParams
import com.hubspot.models.webhooks.WebhookListJournalSubscriptionsParams
import com.hubspot.models.webhooks.WebhookListSubscriptionsParams
import com.hubspot.models.webhooks.WebhookUpdateSettingsParams
import com.hubspot.models.webhooks.WebhookUpdateSubscriptionParams
import java.util.function.Consumer

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    fun createCrmSnapshot(params: WebhookCreateCrmSnapshotParams): CrmObjectSnapshotBatchResponse =
        createCrmSnapshot(params, RequestOptions.none())

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        params: WebhookCreateCrmSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse =
        createCrmSnapshot(
            WebhookCreateCrmSnapshotParams.builder()
                .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
    ): CrmObjectSnapshotBatchResponse =
        createCrmSnapshot(crmObjectSnapshotBatchRequest, RequestOptions.none())

    fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams
    ): SubscriptionResponse1 = createJournalSubscription(params, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        createJournalSubscription(
            WebhookCreateJournalSubscriptionParams.builder()
                .subscriptionUpsertRequest(subscriptionUpsertRequest)
                .build(),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest
    ): SubscriptionResponse1 =
        createJournalSubscription(subscriptionUpsertRequest, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                objectSubscriptionUpsertRequest
            ),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
    ): SubscriptionResponse1 =
        createJournalSubscription(objectSubscriptionUpsertRequest, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        association: AssociationSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofAssociation(association),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        association: AssociationSubscriptionUpsertRequest
    ): SubscriptionResponse1 = createJournalSubscription(association, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
    ): SubscriptionResponse1 = createJournalSubscription(appLifecycleEvent, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        listMembership: ListMembershipSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofListMembership(listMembership),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        listMembership: ListMembershipSubscriptionUpsertRequest
    ): SubscriptionResponse1 = createJournalSubscription(listMembership, RequestOptions.none())

    /** Create new event subscription for the specified app. */
    fun createSubscription(
        appId: Int,
        params: WebhookCreateSubscriptionParams,
    ): SubscriptionResponse = createSubscription(appId, params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        appId: Int,
        params: WebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscription */
    fun createSubscription(params: WebhookCreateSubscriptionParams): SubscriptionResponse =
        createSubscription(params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        params: WebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    fun createSubscriptionFilter(
        params: WebhookCreateSubscriptionFilterParams
    ): FilterCreateResponse = createSubscriptionFilter(params, RequestOptions.none())

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        params: WebhookCreateSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterCreateResponse

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        filterCreateRequest: FilterCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterCreateResponse =
        createSubscriptionFilter(
            WebhookCreateSubscriptionFilterParams.builder()
                .filterCreateRequest(filterCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(filterCreateRequest: FilterCreateRequest): FilterCreateResponse =
        createSubscriptionFilter(filterCreateRequest, RequestOptions.none())

    /** Batch create event subscriptions for the specified app. */
    fun createSubscriptionsBatch(
        appId: Int,
        params: WebhookCreateSubscriptionsBatchParams,
    ): BatchResponseSubscriptionResponse =
        createSubscriptionsBatch(appId, params, RequestOptions.none())

    /** @see createSubscriptionsBatch */
    fun createSubscriptionsBatch(
        appId: Int,
        params: WebhookCreateSubscriptionsBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse =
        createSubscriptionsBatch(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscriptionsBatch */
    fun createSubscriptionsBatch(
        params: WebhookCreateSubscriptionsBatchParams
    ): BatchResponseSubscriptionResponse = createSubscriptionsBatch(params, RequestOptions.none())

    /** @see createSubscriptionsBatch */
    fun createSubscriptionsBatch(
        params: WebhookCreateSubscriptionsBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse

    fun deleteJournalSubscription(subscriptionId: Long) =
        deleteJournalSubscription(subscriptionId, WebhookDeleteJournalSubscriptionParams.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        params: WebhookDeleteJournalSubscriptionParams =
            WebhookDeleteJournalSubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteJournalSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        params: WebhookDeleteJournalSubscriptionParams =
            WebhookDeleteJournalSubscriptionParams.none(),
    ) = deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        params: WebhookDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(params: WebhookDeleteJournalSubscriptionParams) =
        deleteJournalSubscription(params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(subscriptionId: Long, requestOptions: RequestOptions) =
        deleteJournalSubscription(
            subscriptionId,
            WebhookDeleteJournalSubscriptionParams.none(),
            requestOptions,
        )

    fun deletePortalSubscriptions(portalId: Long) =
        deletePortalSubscriptions(portalId, WebhookDeletePortalSubscriptionsParams.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        params: WebhookDeletePortalSubscriptionsParams =
            WebhookDeletePortalSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        params: WebhookDeletePortalSubscriptionsParams =
            WebhookDeletePortalSubscriptionsParams.none(),
    ) = deletePortalSubscriptions(portalId, params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        params: WebhookDeletePortalSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(params: WebhookDeletePortalSubscriptionsParams) =
        deletePortalSubscriptions(params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(portalId: Long, requestOptions: RequestOptions) =
        deletePortalSubscriptions(
            portalId,
            WebhookDeletePortalSubscriptionsParams.none(),
            requestOptions,
        )

    /**
     * Delete the webhook settings for the specified app. Event subscriptions will not be deleted,
     * but will be paused until another webhook is created.
     */
    fun deleteSettings(appId: Int) = deleteSettings(appId, WebhookDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
    ) = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: WebhookDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteSettings */
    fun deleteSettings(params: WebhookDeleteSettingsParams) =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions) =
        deleteSettings(appId, WebhookDeleteSettingsParams.none(), requestOptions)

    /** Delete an existing event subscription by ID. */
    fun deleteSubscription(subscriptionId: Int, params: WebhookDeleteSubscriptionParams) =
        deleteSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        subscriptionId: Int,
        params: WebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteSubscription */
    fun deleteSubscription(params: WebhookDeleteSubscriptionParams) =
        deleteSubscription(params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        params: WebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun deleteSubscriptionFilter(filterId: Long) =
        deleteSubscriptionFilter(filterId, WebhookDeleteSubscriptionFilterParams.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookDeleteSubscriptionFilterParams =
            WebhookDeleteSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookDeleteSubscriptionFilterParams = WebhookDeleteSubscriptionFilterParams.none(),
    ) = deleteSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        params: WebhookDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(params: WebhookDeleteSubscriptionFilterParams) =
        deleteSubscriptionFilter(params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(filterId: Long, requestOptions: RequestOptions) =
        deleteSubscriptionFilter(
            filterId,
            WebhookDeleteSubscriptionFilterParams.none(),
            requestOptions,
        )

    @MustBeClosed
    fun getEarliestJournal(): HttpResponse =
        getEarliestJournal(WebhookGetEarliestJournalParams.none())

    /** @see getEarliestJournal */
    @MustBeClosed
    fun getEarliestJournal(
        params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getEarliestJournal */
    @MustBeClosed
    fun getEarliestJournal(
        params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none()
    ): HttpResponse = getEarliestJournal(params, RequestOptions.none())

    /** @see getEarliestJournal */
    @MustBeClosed
    fun getEarliestJournal(requestOptions: RequestOptions): HttpResponse =
        getEarliestJournal(WebhookGetEarliestJournalParams.none(), requestOptions)

    fun getEarliestJournalBatch(count: Int): BatchResponseJournalFetchResponse =
        getEarliestJournalBatch(count, WebhookGetEarliestJournalBatchParams.none())

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        count: Int,
        params: WebhookGetEarliestJournalBatchParams = WebhookGetEarliestJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getEarliestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        count: Int,
        params: WebhookGetEarliestJournalBatchParams = WebhookGetEarliestJournalBatchParams.none(),
    ): BatchResponseJournalFetchResponse =
        getEarliestJournalBatch(count, params, RequestOptions.none())

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        params: WebhookGetEarliestJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        params: WebhookGetEarliestJournalBatchParams
    ): BatchResponseJournalFetchResponse = getEarliestJournalBatch(params, RequestOptions.none())

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        getEarliestJournalBatch(count, WebhookGetEarliestJournalBatchParams.none(), requestOptions)

    @MustBeClosed
    fun getEarliestLocalJournal(): HttpResponse =
        getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none())

    /** @see getEarliestLocalJournal */
    @MustBeClosed
    fun getEarliestLocalJournal(
        params: WebhookGetEarliestLocalJournalParams = WebhookGetEarliestLocalJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getEarliestLocalJournal */
    @MustBeClosed
    fun getEarliestLocalJournal(
        params: WebhookGetEarliestLocalJournalParams = WebhookGetEarliestLocalJournalParams.none()
    ): HttpResponse = getEarliestLocalJournal(params, RequestOptions.none())

    /** @see getEarliestLocalJournal */
    @MustBeClosed
    fun getEarliestLocalJournal(requestOptions: RequestOptions): HttpResponse =
        getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none(), requestOptions)

    fun getEarliestLocalJournalBatch(count: Int): BatchResponseJournalFetchResponse =
        getEarliestLocalJournalBatch(count, WebhookGetEarliestLocalJournalBatchParams.none())

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        count: Int,
        params: WebhookGetEarliestLocalJournalBatchParams =
            WebhookGetEarliestLocalJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getEarliestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        count: Int,
        params: WebhookGetEarliestLocalJournalBatchParams =
            WebhookGetEarliestLocalJournalBatchParams.none(),
    ): BatchResponseJournalFetchResponse =
        getEarliestLocalJournalBatch(count, params, RequestOptions.none())

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        params: WebhookGetEarliestLocalJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        params: WebhookGetEarliestLocalJournalBatchParams
    ): BatchResponseJournalFetchResponse =
        getEarliestLocalJournalBatch(params, RequestOptions.none())

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        getEarliestLocalJournalBatch(
            count,
            WebhookGetEarliestLocalJournalBatchParams.none(),
            requestOptions,
        )

    fun getJournalBatch(params: WebhookGetJournalBatchParams): BatchResponseJournalFetchResponse =
        getJournalBatch(params, RequestOptions.none())

    /** @see getJournalBatch */
    fun getJournalBatch(
        params: WebhookGetJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getJournalBatch */
    fun getJournalBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getJournalBatch(
            WebhookGetJournalBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getJournalBatch */
    fun getJournalBatch(batchInputString: BatchInputString): BatchResponseJournalFetchResponse =
        getJournalBatch(batchInputString, RequestOptions.none())

    fun getJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetJournalBatchAfterOffsetParams,
    ): BatchResponseJournalFetchResponse =
        getJournalBatchAfterOffset(count, params, RequestOptions.none())

    /** @see getJournalBatchAfterOffset */
    fun getJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getJournalBatchAfterOffset */
    fun getJournalBatchAfterOffset(
        params: WebhookGetJournalBatchAfterOffsetParams
    ): BatchResponseJournalFetchResponse = getJournalBatchAfterOffset(params, RequestOptions.none())

    /** @see getJournalBatchAfterOffset */
    fun getJournalBatchAfterOffset(
        params: WebhookGetJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    fun getJournalStatus(statusId: String): SnapshotStatusResponse =
        getJournalStatus(statusId, WebhookGetJournalStatusParams.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse =
        getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
    ): SnapshotStatusResponse = getJournalStatus(statusId, params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        params: WebhookGetJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse

    /** @see getJournalStatus */
    fun getJournalStatus(params: WebhookGetJournalStatusParams): SnapshotStatusResponse =
        getJournalStatus(params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(statusId: String, requestOptions: RequestOptions): SnapshotStatusResponse =
        getJournalStatus(statusId, WebhookGetJournalStatusParams.none(), requestOptions)

    @MustBeClosed
    fun getLatestJournal(): HttpResponse = getLatestJournal(WebhookGetLatestJournalParams.none())

    /** @see getLatestJournal */
    @MustBeClosed
    fun getLatestJournal(
        params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLatestJournal */
    @MustBeClosed
    fun getLatestJournal(
        params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none()
    ): HttpResponse = getLatestJournal(params, RequestOptions.none())

    /** @see getLatestJournal */
    @MustBeClosed
    fun getLatestJournal(requestOptions: RequestOptions): HttpResponse =
        getLatestJournal(WebhookGetLatestJournalParams.none(), requestOptions)

    fun getLatestJournalBatch(count: Int): BatchResponseJournalFetchResponse =
        getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none())

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        count: Int,
        params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLatestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        count: Int,
        params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
    ): BatchResponseJournalFetchResponse =
        getLatestJournalBatch(count, params, RequestOptions.none())

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        params: WebhookGetLatestJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        params: WebhookGetLatestJournalBatchParams
    ): BatchResponseJournalFetchResponse = getLatestJournalBatch(params, RequestOptions.none())

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none(), requestOptions)

    @MustBeClosed
    fun getLatestLocalJournal(): HttpResponse =
        getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none())

    /** @see getLatestLocalJournal */
    @MustBeClosed
    fun getLatestLocalJournal(
        params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLatestLocalJournal */
    @MustBeClosed
    fun getLatestLocalJournal(
        params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none()
    ): HttpResponse = getLatestLocalJournal(params, RequestOptions.none())

    /** @see getLatestLocalJournal */
    @MustBeClosed
    fun getLatestLocalJournal(requestOptions: RequestOptions): HttpResponse =
        getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none(), requestOptions)

    fun getLatestLocalJournalBatch(count: Int): BatchResponseJournalFetchResponse =
        getLatestLocalJournalBatch(count, WebhookGetLatestLocalJournalBatchParams.none())

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        count: Int,
        params: WebhookGetLatestLocalJournalBatchParams =
            WebhookGetLatestLocalJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLatestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        count: Int,
        params: WebhookGetLatestLocalJournalBatchParams =
            WebhookGetLatestLocalJournalBatchParams.none(),
    ): BatchResponseJournalFetchResponse =
        getLatestLocalJournalBatch(count, params, RequestOptions.none())

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        params: WebhookGetLatestLocalJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        params: WebhookGetLatestLocalJournalBatchParams
    ): BatchResponseJournalFetchResponse = getLatestLocalJournalBatch(params, RequestOptions.none())

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): BatchResponseJournalFetchResponse =
        getLatestLocalJournalBatch(
            count,
            WebhookGetLatestLocalJournalBatchParams.none(),
            requestOptions,
        )

    fun getLocalJournalBatch(
        params: WebhookGetLocalJournalBatchParams
    ): BatchResponseJournalFetchResponse = getLocalJournalBatch(params, RequestOptions.none())

    /** @see getLocalJournalBatch */
    fun getLocalJournalBatch(
        params: WebhookGetLocalJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLocalJournalBatch */
    fun getLocalJournalBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatch(
            WebhookGetLocalJournalBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getLocalJournalBatch */
    fun getLocalJournalBatch(
        batchInputString: BatchInputString
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatch(batchInputString, RequestOptions.none())

    fun getLocalJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchAfterOffsetParams,
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchAfterOffset(count, params, RequestOptions.none())

    /** @see getLocalJournalBatchAfterOffset */
    fun getLocalJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalJournalBatchAfterOffset */
    fun getLocalJournalBatchAfterOffset(
        params: WebhookGetLocalJournalBatchAfterOffsetParams
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchAfterOffset(params, RequestOptions.none())

    /** @see getLocalJournalBatchAfterOffset */
    fun getLocalJournalBatchAfterOffset(
        params: WebhookGetLocalJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    fun getLocalJournalStatus(statusId: String): SnapshotStatusResponse =
        getLocalJournalStatus(statusId, WebhookGetLocalJournalStatusParams.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse =
        getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
    ): SnapshotStatusResponse = getLocalJournalStatus(statusId, params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        params: WebhookGetLocalJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(params: WebhookGetLocalJournalStatusParams): SnapshotStatusResponse =
        getLocalJournalStatus(params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        getLocalJournalStatus(statusId, WebhookGetLocalJournalStatusParams.none(), requestOptions)

    @MustBeClosed
    fun getNextJournalAfterOffset(offset: String): HttpResponse =
        getNextJournalAfterOffset(offset, WebhookGetNextJournalAfterOffsetParams.none())

    /** @see getNextJournalAfterOffset */
    @MustBeClosed
    fun getNextJournalAfterOffset(
        offset: String,
        params: WebhookGetNextJournalAfterOffsetParams =
            WebhookGetNextJournalAfterOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getNextJournalAfterOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalAfterOffset */
    @MustBeClosed
    fun getNextJournalAfterOffset(
        offset: String,
        params: WebhookGetNextJournalAfterOffsetParams =
            WebhookGetNextJournalAfterOffsetParams.none(),
    ): HttpResponse = getNextJournalAfterOffset(offset, params, RequestOptions.none())

    /** @see getNextJournalAfterOffset */
    @MustBeClosed
    fun getNextJournalAfterOffset(
        params: WebhookGetNextJournalAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextJournalAfterOffset */
    @MustBeClosed
    fun getNextJournalAfterOffset(params: WebhookGetNextJournalAfterOffsetParams): HttpResponse =
        getNextJournalAfterOffset(params, RequestOptions.none())

    /** @see getNextJournalAfterOffset */
    @MustBeClosed
    fun getNextJournalAfterOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getNextJournalAfterOffset(
            offset,
            WebhookGetNextJournalAfterOffsetParams.none(),
            requestOptions,
        )

    @MustBeClosed
    fun getNextLocalJournalAfterOffset(offset: String): HttpResponse =
        getNextLocalJournalAfterOffset(offset, WebhookGetNextLocalJournalAfterOffsetParams.none())

    /** @see getNextLocalJournalAfterOffset */
    @MustBeClosed
    fun getNextLocalJournalAfterOffset(
        offset: String,
        params: WebhookGetNextLocalJournalAfterOffsetParams =
            WebhookGetNextLocalJournalAfterOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getNextLocalJournalAfterOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextLocalJournalAfterOffset */
    @MustBeClosed
    fun getNextLocalJournalAfterOffset(
        offset: String,
        params: WebhookGetNextLocalJournalAfterOffsetParams =
            WebhookGetNextLocalJournalAfterOffsetParams.none(),
    ): HttpResponse = getNextLocalJournalAfterOffset(offset, params, RequestOptions.none())

    /** @see getNextLocalJournalAfterOffset */
    @MustBeClosed
    fun getNextLocalJournalAfterOffset(
        params: WebhookGetNextLocalJournalAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextLocalJournalAfterOffset */
    @MustBeClosed
    fun getNextLocalJournalAfterOffset(
        params: WebhookGetNextLocalJournalAfterOffsetParams
    ): HttpResponse = getNextLocalJournalAfterOffset(params, RequestOptions.none())

    /** @see getNextLocalJournalAfterOffset */
    @MustBeClosed
    fun getNextLocalJournalAfterOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): HttpResponse =
        getNextLocalJournalAfterOffset(
            offset,
            WebhookGetNextLocalJournalAfterOffsetParams.none(),
            requestOptions,
        )

    /**
     * Retrieve the webhook settings for the specified app, including the webhook’s target URL,
     * throttle configuration, and create/update date.
     */
    fun getSettings(appId: Int): SettingsResponse =
        getSettings(appId, WebhookGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
    ): SettingsResponse = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: WebhookGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** @see getSettings */
    fun getSettings(params: WebhookGetSettingsParams): SettingsResponse =
        getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(appId: Int, requestOptions: RequestOptions): SettingsResponse =
        getSettings(appId, WebhookGetSettingsParams.none(), requestOptions)

    /** Retrieve a specific event subscription by ID. */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookGetSubscriptionParams,
    ): SubscriptionResponse = getSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        getSubscription(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see getSubscription */
    fun getSubscription(params: WebhookGetSubscriptionParams): SubscriptionResponse =
        getSubscription(params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        params: WebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    fun getSubscriptionFilter(filterId: Long): FilterResponse =
        getSubscriptionFilter(filterId, WebhookGetSubscriptionFilterParams.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterResponse =
        getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
    ): FilterResponse = getSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        params: WebhookGetSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterResponse

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(params: WebhookGetSubscriptionFilterParams): FilterResponse =
        getSubscriptionFilter(params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(filterId: Long, requestOptions: RequestOptions): FilterResponse =
        getSubscriptionFilter(filterId, WebhookGetSubscriptionFilterParams.none(), requestOptions)

    fun getSubscriptionFilters(subscriptionId: Long): List<FilterResponse> =
        getSubscriptionFilters(subscriptionId, WebhookGetSubscriptionFiltersParams.none())

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookGetSubscriptionFiltersParams = WebhookGetSubscriptionFiltersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse> =
        getSubscriptionFilters(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookGetSubscriptionFiltersParams = WebhookGetSubscriptionFiltersParams.none(),
    ): List<FilterResponse> = getSubscriptionFilters(subscriptionId, params, RequestOptions.none())

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        params: WebhookGetSubscriptionFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse>

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(params: WebhookGetSubscriptionFiltersParams): List<FilterResponse> =
        getSubscriptionFilters(params, RequestOptions.none())

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): List<FilterResponse> =
        getSubscriptionFilters(
            subscriptionId,
            WebhookGetSubscriptionFiltersParams.none(),
            requestOptions,
        )

    fun listJournalSubscriptions(): CollectionResponseSubscriptionResponseNoPaging =
        listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookListJournalSubscriptionsParams =
            WebhookListJournalSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseSubscriptionResponseNoPaging

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookListJournalSubscriptionsParams = WebhookListJournalSubscriptionsParams.none()
    ): CollectionResponseSubscriptionResponseNoPaging =
        listJournalSubscriptions(params, RequestOptions.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        requestOptions: RequestOptions
    ): CollectionResponseSubscriptionResponseNoPaging =
        listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none(), requestOptions)

    /** Retrieve event subscriptions for the specified app. */
    fun listSubscriptions(appId: Int): SubscriptionListResponse =
        listSubscriptions(appId, WebhookListSubscriptionsParams.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse =
        listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
    ): SubscriptionListResponse = listSubscriptions(appId, params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: WebhookListSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see listSubscriptions */
    fun listSubscriptions(params: WebhookListSubscriptionsParams): SubscriptionListResponse =
        listSubscriptions(params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(appId: Int, requestOptions: RequestOptions): SubscriptionListResponse =
        listSubscriptions(appId, WebhookListSubscriptionsParams.none(), requestOptions)

    /** Update webhook settings for the specified app. */
    fun updateSettings(appId: Int, params: WebhookUpdateSettingsParams): SettingsResponse =
        updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: WebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(params: WebhookUpdateSettingsParams): SettingsResponse =
        updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: WebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** Update an existing event subscription by ID. */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookUpdateSubscriptionParams,
    ): SubscriptionResponse = updateSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        updateSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateSubscription */
    fun updateSubscription(params: WebhookUpdateSubscriptionParams): SubscriptionResponse =
        updateSubscription(params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        params: WebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [WebhookService.createCrmSnapshot].
         */
        @MustBeClosed
        fun createCrmSnapshot(
            params: WebhookCreateCrmSnapshotParams
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshot(params, RequestOptions.none())

        /** @see createCrmSnapshot */
        @MustBeClosed
        fun createCrmSnapshot(
            params: WebhookCreateCrmSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse>

        /** @see createCrmSnapshot */
        @MustBeClosed
        fun createCrmSnapshot(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshot(
                WebhookCreateCrmSnapshotParams.builder()
                    .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                    .build(),
                requestOptions,
            )

        /** @see createCrmSnapshot */
        @MustBeClosed
        fun createCrmSnapshot(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshot(crmObjectSnapshotBatchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [WebhookService.createJournalSubscription].
         */
        @MustBeClosed
        fun createJournalSubscription(
            params: WebhookCreateJournalSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(params, RequestOptions.none())

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            params: WebhookCreateJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1>

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(
                WebhookCreateJournalSubscriptionParams.builder()
                    .subscriptionUpsertRequest(subscriptionUpsertRequest)
                    .build(),
                requestOptions,
            )

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(subscriptionUpsertRequest, RequestOptions.none())

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                    objectSubscriptionUpsertRequest
                ),
                requestOptions,
            )

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(objectSubscriptionUpsertRequest, RequestOptions.none())

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            association: AssociationSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofAssociation(association),
                requestOptions,
            )

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            association: AssociationSubscriptionUpsertRequest
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(association, RequestOptions.none())

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent),
                requestOptions,
            )

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(appLifecycleEvent, RequestOptions.none())

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            listMembership: ListMembershipSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofListMembership(listMembership),
                requestOptions,
            )

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            listMembership: ListMembershipSubscriptionUpsertRequest
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(listMembership, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookService.createSubscription].
         */
        @MustBeClosed
        fun createSubscription(
            appId: Int,
            params: WebhookCreateSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            createSubscription(appId, params, RequestOptions.none())

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            appId: Int,
            params: WebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            params: WebhookCreateSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = createSubscription(params, RequestOptions.none())

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            params: WebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03/filters`,
         * but is otherwise the same as [WebhookService.createSubscriptionFilter].
         */
        @MustBeClosed
        fun createSubscriptionFilter(
            params: WebhookCreateSubscriptionFilterParams
        ): HttpResponseFor<FilterCreateResponse> =
            createSubscriptionFilter(params, RequestOptions.none())

        /** @see createSubscriptionFilter */
        @MustBeClosed
        fun createSubscriptionFilter(
            params: WebhookCreateSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterCreateResponse>

        /** @see createSubscriptionFilter */
        @MustBeClosed
        fun createSubscriptionFilter(
            filterCreateRequest: FilterCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterCreateResponse> =
            createSubscriptionFilter(
                WebhookCreateSubscriptionFilterParams.builder()
                    .filterCreateRequest(filterCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createSubscriptionFilter */
        @MustBeClosed
        fun createSubscriptionFilter(
            filterCreateRequest: FilterCreateRequest
        ): HttpResponseFor<FilterCreateResponse> =
            createSubscriptionFilter(filterCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [WebhookService.createSubscriptionsBatch].
         */
        @MustBeClosed
        fun createSubscriptionsBatch(
            appId: Int,
            params: WebhookCreateSubscriptionsBatchParams,
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            createSubscriptionsBatch(appId, params, RequestOptions.none())

        /** @see createSubscriptionsBatch */
        @MustBeClosed
        fun createSubscriptionsBatch(
            appId: Int,
            params: WebhookCreateSubscriptionsBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            createSubscriptionsBatch(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscriptionsBatch */
        @MustBeClosed
        fun createSubscriptionsBatch(
            params: WebhookCreateSubscriptionsBatchParams
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            createSubscriptionsBatch(params, RequestOptions.none())

        /** @see createSubscriptionsBatch */
        @MustBeClosed
        fun createSubscriptionsBatch(
            params: WebhookCreateSubscriptionsBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.deleteJournalSubscription].
         */
        @MustBeClosed
        fun deleteJournalSubscription(subscriptionId: Long): HttpResponse =
            deleteJournalSubscription(subscriptionId, WebhookDeleteJournalSubscriptionParams.none())

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            subscriptionId: Long,
            params: WebhookDeleteJournalSubscriptionParams =
                WebhookDeleteJournalSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteJournalSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            subscriptionId: Long,
            params: WebhookDeleteJournalSubscriptionParams =
                WebhookDeleteJournalSubscriptionParams.none(),
        ): HttpResponse = deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            params: WebhookDeleteJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            params: WebhookDeleteJournalSubscriptionParams
        ): HttpResponse = deleteJournalSubscription(params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponse =
            deleteJournalSubscription(
                subscriptionId,
                WebhookDeleteJournalSubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [WebhookService.deletePortalSubscriptions].
         */
        @MustBeClosed
        fun deletePortalSubscriptions(portalId: Long): HttpResponse =
            deletePortalSubscriptions(portalId, WebhookDeletePortalSubscriptionsParams.none())

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookDeletePortalSubscriptionsParams =
                WebhookDeletePortalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookDeletePortalSubscriptionsParams =
                WebhookDeletePortalSubscriptionsParams.none(),
        ): HttpResponse = deletePortalSubscriptions(portalId, params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            params: WebhookDeletePortalSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            params: WebhookDeletePortalSubscriptionsParams
        ): HttpResponse = deletePortalSubscriptions(params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            portalId: Long,
            requestOptions: RequestOptions,
        ): HttpResponse =
            deletePortalSubscriptions(
                portalId,
                WebhookDeletePortalSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookService.deleteSettings].
         */
        @MustBeClosed
        fun deleteSettings(appId: Int): HttpResponse =
            deleteSettings(appId, WebhookDeleteSettingsParams.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
        ): HttpResponse = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            params: WebhookDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(params: WebhookDeleteSettingsParams): HttpResponse =
            deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(appId: Int, requestOptions: RequestOptions): HttpResponse =
            deleteSettings(appId, WebhookDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.deleteSubscription].
         */
        @MustBeClosed
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookDeleteSubscriptionParams,
        ): HttpResponse = deleteSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(params: WebhookDeleteSubscriptionParams): HttpResponse =
            deleteSubscription(params, RequestOptions.none())

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(
            params: WebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookService.deleteSubscriptionFilter].
         */
        @MustBeClosed
        fun deleteSubscriptionFilter(filterId: Long): HttpResponse =
            deleteSubscriptionFilter(filterId, WebhookDeleteSubscriptionFilterParams.none())

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookDeleteSubscriptionFilterParams =
                WebhookDeleteSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookDeleteSubscriptionFilterParams =
                WebhookDeleteSubscriptionFilterParams.none(),
        ): HttpResponse = deleteSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(
            params: WebhookDeleteSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(params: WebhookDeleteSubscriptionFilterParams): HttpResponse =
            deleteSubscriptionFilter(params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(filterId: Long, requestOptions: RequestOptions): HttpResponse =
            deleteSubscriptionFilter(
                filterId,
                WebhookDeleteSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [WebhookService.getEarliestJournal].
         */
        @MustBeClosed
        fun getEarliestJournal(): HttpResponse =
            getEarliestJournal(WebhookGetEarliestJournalParams.none())

        /** @see getEarliestJournal */
        @MustBeClosed
        fun getEarliestJournal(
            params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getEarliestJournal */
        @MustBeClosed
        fun getEarliestJournal(
            params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none()
        ): HttpResponse = getEarliestJournal(params, RequestOptions.none())

        /** @see getEarliestJournal */
        @MustBeClosed
        fun getEarliestJournal(requestOptions: RequestOptions): HttpResponse =
            getEarliestJournal(WebhookGetEarliestJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/earliest/{count}`, but is otherwise the same as
         * [WebhookService.getEarliestJournalBatch].
         */
        @MustBeClosed
        fun getEarliestJournalBatch(
            count: Int
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestJournalBatch(count, WebhookGetEarliestJournalBatchParams.none())

        /** @see getEarliestJournalBatch */
        @MustBeClosed
        fun getEarliestJournalBatch(
            count: Int,
            params: WebhookGetEarliestJournalBatchParams =
                WebhookGetEarliestJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getEarliestJournalBatch */
        @MustBeClosed
        fun getEarliestJournalBatch(
            count: Int,
            params: WebhookGetEarliestJournalBatchParams =
                WebhookGetEarliestJournalBatchParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestJournalBatch(count, params, RequestOptions.none())

        /** @see getEarliestJournalBatch */
        @MustBeClosed
        fun getEarliestJournalBatch(
            params: WebhookGetEarliestJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getEarliestJournalBatch */
        @MustBeClosed
        fun getEarliestJournalBatch(
            params: WebhookGetEarliestJournalBatchParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestJournalBatch(params, RequestOptions.none())

        /** @see getEarliestJournalBatch */
        @MustBeClosed
        fun getEarliestJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestJournalBatch(
                count,
                WebhookGetEarliestJournalBatchParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookService.getEarliestLocalJournal].
         */
        @MustBeClosed
        fun getEarliestLocalJournal(): HttpResponse =
            getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none())

        /** @see getEarliestLocalJournal */
        @MustBeClosed
        fun getEarliestLocalJournal(
            params: WebhookGetEarliestLocalJournalParams =
                WebhookGetEarliestLocalJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getEarliestLocalJournal */
        @MustBeClosed
        fun getEarliestLocalJournal(
            params: WebhookGetEarliestLocalJournalParams =
                WebhookGetEarliestLocalJournalParams.none()
        ): HttpResponse = getEarliestLocalJournal(params, RequestOptions.none())

        /** @see getEarliestLocalJournal */
        @MustBeClosed
        fun getEarliestLocalJournal(requestOptions: RequestOptions): HttpResponse =
            getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/earliest/{count}`, but is otherwise the
         * same as [WebhookService.getEarliestLocalJournalBatch].
         */
        @MustBeClosed
        fun getEarliestLocalJournalBatch(
            count: Int
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestLocalJournalBatch(count, WebhookGetEarliestLocalJournalBatchParams.none())

        /** @see getEarliestLocalJournalBatch */
        @MustBeClosed
        fun getEarliestLocalJournalBatch(
            count: Int,
            params: WebhookGetEarliestLocalJournalBatchParams =
                WebhookGetEarliestLocalJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getEarliestLocalJournalBatch */
        @MustBeClosed
        fun getEarliestLocalJournalBatch(
            count: Int,
            params: WebhookGetEarliestLocalJournalBatchParams =
                WebhookGetEarliestLocalJournalBatchParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestLocalJournalBatch(count, params, RequestOptions.none())

        /** @see getEarliestLocalJournalBatch */
        @MustBeClosed
        fun getEarliestLocalJournalBatch(
            params: WebhookGetEarliestLocalJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getEarliestLocalJournalBatch */
        @MustBeClosed
        fun getEarliestLocalJournalBatch(
            params: WebhookGetEarliestLocalJournalBatchParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestLocalJournalBatch(params, RequestOptions.none())

        /** @see getEarliestLocalJournalBatch */
        @MustBeClosed
        fun getEarliestLocalJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getEarliestLocalJournalBatch(
                count,
                WebhookGetEarliestLocalJournalBatchParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [WebhookService.getJournalBatch].
         */
        @MustBeClosed
        fun getJournalBatch(
            params: WebhookGetJournalBatchParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatch(params, RequestOptions.none())

        /** @see getJournalBatch */
        @MustBeClosed
        fun getJournalBatch(
            params: WebhookGetJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getJournalBatch */
        @MustBeClosed
        fun getJournalBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatch(
                WebhookGetJournalBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getJournalBatch */
        @MustBeClosed
        fun getJournalBatch(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}`, but is otherwise the same
         * as [WebhookService.getJournalBatchAfterOffset].
         */
        @MustBeClosed
        fun getJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetJournalBatchAfterOffsetParams,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchAfterOffset(count, params, RequestOptions.none())

        /** @see getJournalBatchAfterOffset */
        @MustBeClosed
        fun getJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getJournalBatchAfterOffset */
        @MustBeClosed
        fun getJournalBatchAfterOffset(
            params: WebhookGetJournalBatchAfterOffsetParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchAfterOffset(params, RequestOptions.none())

        /** @see getJournalBatchAfterOffset */
        @MustBeClosed
        fun getJournalBatchAfterOffset(
            params: WebhookGetJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookService.getJournalStatus].
         */
        @MustBeClosed
        fun getJournalStatus(statusId: String): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(statusId, WebhookGetJournalStatusParams.none())

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            statusId: String,
            params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            statusId: String,
            params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(statusId, params, RequestOptions.none())

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            params: WebhookGetJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse>

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            params: WebhookGetJournalStatusParams
        ): HttpResponseFor<SnapshotStatusResponse> = getJournalStatus(params, RequestOptions.none())

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(statusId, WebhookGetJournalStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookService.getLatestJournal].
         */
        @MustBeClosed
        fun getLatestJournal(): HttpResponse =
            getLatestJournal(WebhookGetLatestJournalParams.none())

        /** @see getLatestJournal */
        @MustBeClosed
        fun getLatestJournal(
            params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatestJournal */
        @MustBeClosed
        fun getLatestJournal(
            params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none()
        ): HttpResponse = getLatestJournal(params, RequestOptions.none())

        /** @see getLatestJournal */
        @MustBeClosed
        fun getLatestJournal(requestOptions: RequestOptions): HttpResponse =
            getLatestJournal(WebhookGetLatestJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/latest/{count}`, but is otherwise the same as
         * [WebhookService.getLatestJournalBatch].
         */
        @MustBeClosed
        fun getLatestJournalBatch(count: Int): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none())

        /** @see getLatestJournalBatch */
        @MustBeClosed
        fun getLatestJournalBatch(
            count: Int,
            params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLatestJournalBatch */
        @MustBeClosed
        fun getLatestJournalBatch(
            count: Int,
            params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestJournalBatch(count, params, RequestOptions.none())

        /** @see getLatestJournalBatch */
        @MustBeClosed
        fun getLatestJournalBatch(
            params: WebhookGetLatestJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLatestJournalBatch */
        @MustBeClosed
        fun getLatestJournalBatch(
            params: WebhookGetLatestJournalBatchParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestJournalBatch(params, RequestOptions.none())

        /** @see getLatestJournalBatch */
        @MustBeClosed
        fun getLatestJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookService.getLatestLocalJournal].
         */
        @MustBeClosed
        fun getLatestLocalJournal(): HttpResponse =
            getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none())

        /** @see getLatestLocalJournal */
        @MustBeClosed
        fun getLatestLocalJournal(
            params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatestLocalJournal */
        @MustBeClosed
        fun getLatestLocalJournal(
            params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none()
        ): HttpResponse = getLatestLocalJournal(params, RequestOptions.none())

        /** @see getLatestLocalJournal */
        @MustBeClosed
        fun getLatestLocalJournal(requestOptions: RequestOptions): HttpResponse =
            getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/latest/{count}`, but is otherwise the same
         * as [WebhookService.getLatestLocalJournalBatch].
         */
        @MustBeClosed
        fun getLatestLocalJournalBatch(
            count: Int
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestLocalJournalBatch(count, WebhookGetLatestLocalJournalBatchParams.none())

        /** @see getLatestLocalJournalBatch */
        @MustBeClosed
        fun getLatestLocalJournalBatch(
            count: Int,
            params: WebhookGetLatestLocalJournalBatchParams =
                WebhookGetLatestLocalJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLatestLocalJournalBatch */
        @MustBeClosed
        fun getLatestLocalJournalBatch(
            count: Int,
            params: WebhookGetLatestLocalJournalBatchParams =
                WebhookGetLatestLocalJournalBatchParams.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestLocalJournalBatch(count, params, RequestOptions.none())

        /** @see getLatestLocalJournalBatch */
        @MustBeClosed
        fun getLatestLocalJournalBatch(
            params: WebhookGetLatestLocalJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLatestLocalJournalBatch */
        @MustBeClosed
        fun getLatestLocalJournalBatch(
            params: WebhookGetLatestLocalJournalBatchParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestLocalJournalBatch(params, RequestOptions.none())

        /** @see getLatestLocalJournalBatch */
        @MustBeClosed
        fun getLatestLocalJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLatestLocalJournalBatch(
                count,
                WebhookGetLatestLocalJournalBatchParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /webhooks-journal/journal-local/2026-03/batch/read`, but is otherwise the same as
         * [WebhookService.getLocalJournalBatch].
         */
        @MustBeClosed
        fun getLocalJournalBatch(
            params: WebhookGetLocalJournalBatchParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatch(params, RequestOptions.none())

        /** @see getLocalJournalBatch */
        @MustBeClosed
        fun getLocalJournalBatch(
            params: WebhookGetLocalJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLocalJournalBatch */
        @MustBeClosed
        fun getLocalJournalBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatch(
                WebhookGetLocalJournalBatchParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getLocalJournalBatch */
        @MustBeClosed
        fun getLocalJournalBatch(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}`, but is otherwise
         * the same as [WebhookService.getLocalJournalBatchAfterOffset].
         */
        @MustBeClosed
        fun getLocalJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchAfterOffsetParams,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchAfterOffset(count, params, RequestOptions.none())

        /** @see getLocalJournalBatchAfterOffset */
        @MustBeClosed
        fun getLocalJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalJournalBatchAfterOffset */
        @MustBeClosed
        fun getLocalJournalBatchAfterOffset(
            params: WebhookGetLocalJournalBatchAfterOffsetParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchAfterOffset(params, RequestOptions.none())

        /** @see getLocalJournalBatchAfterOffset */
        @MustBeClosed
        fun getLocalJournalBatchAfterOffset(
            params: WebhookGetLocalJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookService.getLocalJournalStatus].
         */
        @MustBeClosed
        fun getLocalJournalStatus(statusId: String): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(statusId, WebhookGetLocalJournalStatusParams.none())

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(statusId, params, RequestOptions.none())

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            params: WebhookGetLocalJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse>

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            params: WebhookGetLocalJournalStatusParams
        ): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(params, RequestOptions.none())

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(
                statusId,
                WebhookGetLocalJournalStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookService.getNextJournalAfterOffset].
         */
        @MustBeClosed
        fun getNextJournalAfterOffset(offset: String): HttpResponse =
            getNextJournalAfterOffset(offset, WebhookGetNextJournalAfterOffsetParams.none())

        /** @see getNextJournalAfterOffset */
        @MustBeClosed
        fun getNextJournalAfterOffset(
            offset: String,
            params: WebhookGetNextJournalAfterOffsetParams =
                WebhookGetNextJournalAfterOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextJournalAfterOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalAfterOffset */
        @MustBeClosed
        fun getNextJournalAfterOffset(
            offset: String,
            params: WebhookGetNextJournalAfterOffsetParams =
                WebhookGetNextJournalAfterOffsetParams.none(),
        ): HttpResponse = getNextJournalAfterOffset(offset, params, RequestOptions.none())

        /** @see getNextJournalAfterOffset */
        @MustBeClosed
        fun getNextJournalAfterOffset(
            params: WebhookGetNextJournalAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextJournalAfterOffset */
        @MustBeClosed
        fun getNextJournalAfterOffset(
            params: WebhookGetNextJournalAfterOffsetParams
        ): HttpResponse = getNextJournalAfterOffset(params, RequestOptions.none())

        /** @see getNextJournalAfterOffset */
        @MustBeClosed
        fun getNextJournalAfterOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            getNextJournalAfterOffset(
                offset,
                WebhookGetNextJournalAfterOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookService.getNextLocalJournalAfterOffset].
         */
        @MustBeClosed
        fun getNextLocalJournalAfterOffset(offset: String): HttpResponse =
            getNextLocalJournalAfterOffset(
                offset,
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
            )

        /** @see getNextLocalJournalAfterOffset */
        @MustBeClosed
        fun getNextLocalJournalAfterOffset(
            offset: String,
            params: WebhookGetNextLocalJournalAfterOffsetParams =
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextLocalJournalAfterOffset(
                params.toBuilder().offset(offset).build(),
                requestOptions,
            )

        /** @see getNextLocalJournalAfterOffset */
        @MustBeClosed
        fun getNextLocalJournalAfterOffset(
            offset: String,
            params: WebhookGetNextLocalJournalAfterOffsetParams =
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
        ): HttpResponse = getNextLocalJournalAfterOffset(offset, params, RequestOptions.none())

        /** @see getNextLocalJournalAfterOffset */
        @MustBeClosed
        fun getNextLocalJournalAfterOffset(
            params: WebhookGetNextLocalJournalAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextLocalJournalAfterOffset */
        @MustBeClosed
        fun getNextLocalJournalAfterOffset(
            params: WebhookGetNextLocalJournalAfterOffsetParams
        ): HttpResponse = getNextLocalJournalAfterOffset(params, RequestOptions.none())

        /** @see getNextLocalJournalAfterOffset */
        @MustBeClosed
        fun getNextLocalJournalAfterOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            getNextLocalJournalAfterOffset(
                offset,
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookService.getSettings].
         */
        @MustBeClosed
        fun getSettings(appId: Int): HttpResponseFor<SettingsResponse> =
            getSettings(appId, WebhookGetSettingsParams.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
        ): HttpResponseFor<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            params: WebhookGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(params: WebhookGetSettingsParams): HttpResponseFor<SettingsResponse> =
            getSettings(params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> =
            getSettings(appId, WebhookGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.getSubscription].
         */
        @MustBeClosed
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookGetSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            getSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            getSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            params: WebhookGetSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = getSubscription(params, RequestOptions.none())

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            params: WebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookService.getSubscriptionFilter].
         */
        @MustBeClosed
        fun getSubscriptionFilter(filterId: Long): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(filterId, WebhookGetSubscriptionFilterParams.none())

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
        ): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            params: WebhookGetSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterResponse>

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            params: WebhookGetSubscriptionFilterParams
        ): HttpResponseFor<FilterResponse> = getSubscriptionFilter(params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(
                filterId,
                WebhookGetSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [WebhookService.getSubscriptionFilters].
         */
        @MustBeClosed
        fun getSubscriptionFilters(subscriptionId: Long): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilters(subscriptionId, WebhookGetSubscriptionFiltersParams.none())

        /** @see getSubscriptionFilters */
        @MustBeClosed
        fun getSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFiltersParams =
                WebhookGetSubscriptionFiltersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilters(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscriptionFilters */
        @MustBeClosed
        fun getSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFiltersParams = WebhookGetSubscriptionFiltersParams.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilters(subscriptionId, params, RequestOptions.none())

        /** @see getSubscriptionFilters */
        @MustBeClosed
        fun getSubscriptionFilters(
            params: WebhookGetSubscriptionFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>>

        /** @see getSubscriptionFilters */
        @MustBeClosed
        fun getSubscriptionFilters(
            params: WebhookGetSubscriptionFiltersParams
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilters(params, RequestOptions.none())

        /** @see getSubscriptionFilters */
        @MustBeClosed
        fun getSubscriptionFilters(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilters(
                subscriptionId,
                WebhookGetSubscriptionFiltersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [WebhookService.listJournalSubscriptions].
         */
        @MustBeClosed
        fun listJournalSubscriptions():
            HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging> =
            listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none())

        /** @see listJournalSubscriptions */
        @MustBeClosed
        fun listJournalSubscriptions(
            params: WebhookListJournalSubscriptionsParams =
                WebhookListJournalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>

        /** @see listJournalSubscriptions */
        @MustBeClosed
        fun listJournalSubscriptions(
            params: WebhookListJournalSubscriptionsParams =
                WebhookListJournalSubscriptionsParams.none()
        ): HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging> =
            listJournalSubscriptions(params, RequestOptions.none())

        /** @see listJournalSubscriptions */
        @MustBeClosed
        fun listJournalSubscriptions(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging> =
            listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookService.listSubscriptions].
         */
        @MustBeClosed
        fun listSubscriptions(appId: Int): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, WebhookListSubscriptionsParams.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, params, RequestOptions.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            params: WebhookListSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            params: WebhookListSubscriptionsParams
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(params, RequestOptions.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, WebhookListSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookService.updateSettings].
         */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: WebhookUpdateSettingsParams,
        ): HttpResponseFor<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: WebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(params: WebhookUpdateSettingsParams): HttpResponseFor<SettingsResponse> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: WebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.updateSubscription].
         */
        @MustBeClosed
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookUpdateSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            updateSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            updateSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            params: WebhookUpdateSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = updateSubscription(params, RequestOptions.none())

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            params: WebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>
    }
}
