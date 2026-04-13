// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.webhooks.AppLifecycleEventSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.AssociationSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.BatchResponseJournalFetchResponse
import com.hubspot.sdk.models.webhooks.BatchResponseSubscriptionResponse
import com.hubspot.sdk.models.webhooks.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot.sdk.models.webhooks.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.webhooks.CrmObjectSnapshotBatchResponse
import com.hubspot.sdk.models.webhooks.FilterCreateRequest
import com.hubspot.sdk.models.webhooks.FilterCreateResponse
import com.hubspot.sdk.models.webhooks.FilterResponse
import com.hubspot.sdk.models.webhooks.ListMembershipSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.SettingsResponse
import com.hubspot.sdk.models.webhooks.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooks.SubscriptionListResponse
import com.hubspot.sdk.models.webhooks.SubscriptionResponse
import com.hubspot.sdk.models.webhooks.SubscriptionResponse1
import com.hubspot.sdk.models.webhooks.SubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.WebhookCreateCrmSnapshotParams
import com.hubspot.sdk.models.webhooks.WebhookCreateJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookCreateSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookCreateSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookCreateSubscriptionsBatchParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookDeletePortalSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalStatusParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalStatusParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextJournalAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextLocalJournalAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookGetSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookGetSubscriptionFiltersParams
import com.hubspot.sdk.models.webhooks.WebhookGetSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookListJournalSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookListSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateSubscriptionParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync

    fun createCrmSnapshot(
        params: WebhookCreateCrmSnapshotParams
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshot(params, RequestOptions.none())

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        params: WebhookCreateCrmSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse>

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshot(
            WebhookCreateCrmSnapshotParams.builder()
                .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshot(crmObjectSnapshotBatchRequest, RequestOptions.none())

    fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(params, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1>

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(
            WebhookCreateJournalSubscriptionParams.builder()
                .subscriptionUpsertRequest(subscriptionUpsertRequest)
                .build(),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(subscriptionUpsertRequest, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                objectSubscriptionUpsertRequest
            ),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(objectSubscriptionUpsertRequest, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        association: AssociationSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofAssociation(association),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        association: AssociationSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(association, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(appLifecycleEvent, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        listMembership: ListMembershipSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofListMembership(listMembership),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        listMembership: ListMembershipSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(listMembership, RequestOptions.none())

    /** Create new event subscription for the specified app. */
    fun createSubscription(
        appId: Int,
        params: WebhookCreateSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        createSubscription(appId, params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        appId: Int,
        params: WebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscription */
    fun createSubscription(
        params: WebhookCreateSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = createSubscription(params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        params: WebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    fun createSubscriptionFilter(
        params: WebhookCreateSubscriptionFilterParams
    ): CompletableFuture<FilterCreateResponse> =
        createSubscriptionFilter(params, RequestOptions.none())

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        params: WebhookCreateSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse>

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        filterCreateRequest: FilterCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse> =
        createSubscriptionFilter(
            WebhookCreateSubscriptionFilterParams.builder()
                .filterCreateRequest(filterCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        filterCreateRequest: FilterCreateRequest
    ): CompletableFuture<FilterCreateResponse> =
        createSubscriptionFilter(filterCreateRequest, RequestOptions.none())

    /** Batch create event subscriptions for the specified app. */
    fun createSubscriptionsBatch(
        appId: Int,
        params: WebhookCreateSubscriptionsBatchParams,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        createSubscriptionsBatch(appId, params, RequestOptions.none())

    /** @see createSubscriptionsBatch */
    fun createSubscriptionsBatch(
        appId: Int,
        params: WebhookCreateSubscriptionsBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        createSubscriptionsBatch(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscriptionsBatch */
    fun createSubscriptionsBatch(
        params: WebhookCreateSubscriptionsBatchParams
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        createSubscriptionsBatch(params, RequestOptions.none())

    /** @see createSubscriptionsBatch */
    fun createSubscriptionsBatch(
        params: WebhookCreateSubscriptionsBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse>

    fun deleteJournalSubscription(subscriptionId: Long): CompletableFuture<Void?> =
        deleteJournalSubscription(subscriptionId, WebhookDeleteJournalSubscriptionParams.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        params: WebhookDeleteJournalSubscriptionParams =
            WebhookDeleteJournalSubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteJournalSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        params: WebhookDeleteJournalSubscriptionParams =
            WebhookDeleteJournalSubscriptionParams.none(),
    ): CompletableFuture<Void?> =
        deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        params: WebhookDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        params: WebhookDeleteJournalSubscriptionParams
    ): CompletableFuture<Void?> = deleteJournalSubscription(params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteJournalSubscription(
            subscriptionId,
            WebhookDeleteJournalSubscriptionParams.none(),
            requestOptions,
        )

    fun deletePortalSubscriptions(portalId: Long): CompletableFuture<Void?> =
        deletePortalSubscriptions(portalId, WebhookDeletePortalSubscriptionsParams.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        params: WebhookDeletePortalSubscriptionsParams =
            WebhookDeletePortalSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        params: WebhookDeletePortalSubscriptionsParams =
            WebhookDeletePortalSubscriptionsParams.none(),
    ): CompletableFuture<Void?> = deletePortalSubscriptions(portalId, params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        params: WebhookDeletePortalSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        params: WebhookDeletePortalSubscriptionsParams
    ): CompletableFuture<Void?> = deletePortalSubscriptions(params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deletePortalSubscriptions(
            portalId,
            WebhookDeletePortalSubscriptionsParams.none(),
            requestOptions,
        )

    /**
     * Delete the webhook settings for the specified app. Event subscriptions will not be deleted,
     * but will be paused until another webhook is created.
     */
    fun deleteSettings(appId: Int): CompletableFuture<Void?> =
        deleteSettings(appId, WebhookDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
    ): CompletableFuture<Void?> = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: WebhookDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteSettings */
    fun deleteSettings(params: WebhookDeleteSettingsParams): CompletableFuture<Void?> =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteSettings(appId, WebhookDeleteSettingsParams.none(), requestOptions)

    /** Delete an existing event subscription by ID. */
    fun deleteSubscription(
        subscriptionId: Int,
        params: WebhookDeleteSubscriptionParams,
    ): CompletableFuture<Void?> = deleteSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        subscriptionId: Int,
        params: WebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteSubscription */
    fun deleteSubscription(params: WebhookDeleteSubscriptionParams): CompletableFuture<Void?> =
        deleteSubscription(params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        params: WebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun deleteSubscriptionFilter(filterId: Long): CompletableFuture<Void?> =
        deleteSubscriptionFilter(filterId, WebhookDeleteSubscriptionFilterParams.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookDeleteSubscriptionFilterParams =
            WebhookDeleteSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookDeleteSubscriptionFilterParams = WebhookDeleteSubscriptionFilterParams.none(),
    ): CompletableFuture<Void?> = deleteSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        params: WebhookDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        params: WebhookDeleteSubscriptionFilterParams
    ): CompletableFuture<Void?> = deleteSubscriptionFilter(params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteSubscriptionFilter(
            filterId,
            WebhookDeleteSubscriptionFilterParams.none(),
            requestOptions,
        )

    fun getEarliestJournal(): CompletableFuture<HttpResponse> =
        getEarliestJournal(WebhookGetEarliestJournalParams.none())

    /** @see getEarliestJournal */
    fun getEarliestJournal(
        params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getEarliestJournal */
    fun getEarliestJournal(
        params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none()
    ): CompletableFuture<HttpResponse> = getEarliestJournal(params, RequestOptions.none())

    /** @see getEarliestJournal */
    fun getEarliestJournal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getEarliestJournal(WebhookGetEarliestJournalParams.none(), requestOptions)

    fun getEarliestJournalBatch(count: Int): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestJournalBatch(count, WebhookGetEarliestJournalBatchParams.none())

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        count: Int,
        params: WebhookGetEarliestJournalBatchParams = WebhookGetEarliestJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        count: Int,
        params: WebhookGetEarliestJournalBatchParams = WebhookGetEarliestJournalBatchParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestJournalBatch(count, params, RequestOptions.none())

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        params: WebhookGetEarliestJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        params: WebhookGetEarliestJournalBatchParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestJournalBatch(params, RequestOptions.none())

    /** @see getEarliestJournalBatch */
    fun getEarliestJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestJournalBatch(count, WebhookGetEarliestJournalBatchParams.none(), requestOptions)

    fun getEarliestLocalJournal(): CompletableFuture<HttpResponse> =
        getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none())

    /** @see getEarliestLocalJournal */
    fun getEarliestLocalJournal(
        params: WebhookGetEarliestLocalJournalParams = WebhookGetEarliestLocalJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getEarliestLocalJournal */
    fun getEarliestLocalJournal(
        params: WebhookGetEarliestLocalJournalParams = WebhookGetEarliestLocalJournalParams.none()
    ): CompletableFuture<HttpResponse> = getEarliestLocalJournal(params, RequestOptions.none())

    /** @see getEarliestLocalJournal */
    fun getEarliestLocalJournal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none(), requestOptions)

    fun getEarliestLocalJournalBatch(
        count: Int
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestLocalJournalBatch(count, WebhookGetEarliestLocalJournalBatchParams.none())

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        count: Int,
        params: WebhookGetEarliestLocalJournalBatchParams =
            WebhookGetEarliestLocalJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        count: Int,
        params: WebhookGetEarliestLocalJournalBatchParams =
            WebhookGetEarliestLocalJournalBatchParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestLocalJournalBatch(count, params, RequestOptions.none())

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        params: WebhookGetEarliestLocalJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        params: WebhookGetEarliestLocalJournalBatchParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestLocalJournalBatch(params, RequestOptions.none())

    /** @see getEarliestLocalJournalBatch */
    fun getEarliestLocalJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getEarliestLocalJournalBatch(
            count,
            WebhookGetEarliestLocalJournalBatchParams.none(),
            requestOptions,
        )

    fun getJournalBatch(
        params: WebhookGetJournalBatchParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatch(params, RequestOptions.none())

    /** @see getJournalBatch */
    fun getJournalBatch(
        params: WebhookGetJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getJournalBatch */
    fun getJournalBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatch(
            WebhookGetJournalBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getJournalBatch */
    fun getJournalBatch(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatch(batchInputString, RequestOptions.none())

    fun getJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetJournalBatchAfterOffsetParams,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchAfterOffset(count, params, RequestOptions.none())

    /** @see getJournalBatchAfterOffset */
    fun getJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getJournalBatchAfterOffset */
    fun getJournalBatchAfterOffset(
        params: WebhookGetJournalBatchAfterOffsetParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchAfterOffset(params, RequestOptions.none())

    /** @see getJournalBatchAfterOffset */
    fun getJournalBatchAfterOffset(
        params: WebhookGetJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    fun getJournalStatus(statusId: String): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(statusId, WebhookGetJournalStatusParams.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(statusId, params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        params: WebhookGetJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse>

    /** @see getJournalStatus */
    fun getJournalStatus(
        params: WebhookGetJournalStatusParams
    ): CompletableFuture<SnapshotStatusResponse> = getJournalStatus(params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(statusId, WebhookGetJournalStatusParams.none(), requestOptions)

    fun getLatestJournal(): CompletableFuture<HttpResponse> =
        getLatestJournal(WebhookGetLatestJournalParams.none())

    /** @see getLatestJournal */
    fun getLatestJournal(
        params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLatestJournal */
    fun getLatestJournal(
        params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none()
    ): CompletableFuture<HttpResponse> = getLatestJournal(params, RequestOptions.none())

    /** @see getLatestJournal */
    fun getLatestJournal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLatestJournal(WebhookGetLatestJournalParams.none(), requestOptions)

    fun getLatestJournalBatch(count: Int): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none())

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        count: Int,
        params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        count: Int,
        params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestJournalBatch(count, params, RequestOptions.none())

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        params: WebhookGetLatestJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        params: WebhookGetLatestJournalBatchParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestJournalBatch(params, RequestOptions.none())

    /** @see getLatestJournalBatch */
    fun getLatestJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none(), requestOptions)

    fun getLatestLocalJournal(): CompletableFuture<HttpResponse> =
        getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none())

    /** @see getLatestLocalJournal */
    fun getLatestLocalJournal(
        params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLatestLocalJournal */
    fun getLatestLocalJournal(
        params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none()
    ): CompletableFuture<HttpResponse> = getLatestLocalJournal(params, RequestOptions.none())

    /** @see getLatestLocalJournal */
    fun getLatestLocalJournal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none(), requestOptions)

    fun getLatestLocalJournalBatch(
        count: Int
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestLocalJournalBatch(count, WebhookGetLatestLocalJournalBatchParams.none())

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        count: Int,
        params: WebhookGetLatestLocalJournalBatchParams =
            WebhookGetLatestLocalJournalBatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        count: Int,
        params: WebhookGetLatestLocalJournalBatchParams =
            WebhookGetLatestLocalJournalBatchParams.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestLocalJournalBatch(count, params, RequestOptions.none())

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        params: WebhookGetLatestLocalJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        params: WebhookGetLatestLocalJournalBatchParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestLocalJournalBatch(params, RequestOptions.none())

    /** @see getLatestLocalJournalBatch */
    fun getLatestLocalJournalBatch(
        count: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLatestLocalJournalBatch(
            count,
            WebhookGetLatestLocalJournalBatchParams.none(),
            requestOptions,
        )

    fun getLocalJournalBatch(
        params: WebhookGetLocalJournalBatchParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatch(params, RequestOptions.none())

    /** @see getLocalJournalBatch */
    fun getLocalJournalBatch(
        params: WebhookGetLocalJournalBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLocalJournalBatch */
    fun getLocalJournalBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatch(
            WebhookGetLocalJournalBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getLocalJournalBatch */
    fun getLocalJournalBatch(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatch(batchInputString, RequestOptions.none())

    fun getLocalJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchAfterOffsetParams,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchAfterOffset(count, params, RequestOptions.none())

    /** @see getLocalJournalBatchAfterOffset */
    fun getLocalJournalBatchAfterOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalJournalBatchAfterOffset */
    fun getLocalJournalBatchAfterOffset(
        params: WebhookGetLocalJournalBatchAfterOffsetParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchAfterOffset(params, RequestOptions.none())

    /** @see getLocalJournalBatchAfterOffset */
    fun getLocalJournalBatchAfterOffset(
        params: WebhookGetLocalJournalBatchAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    fun getLocalJournalStatus(statusId: String): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(statusId, WebhookGetLocalJournalStatusParams.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(statusId, params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        params: WebhookGetLocalJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse>

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        params: WebhookGetLocalJournalStatusParams
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(statusId, WebhookGetLocalJournalStatusParams.none(), requestOptions)

    fun getNextJournalAfterOffset(offset: String): CompletableFuture<HttpResponse> =
        getNextJournalAfterOffset(offset, WebhookGetNextJournalAfterOffsetParams.none())

    /** @see getNextJournalAfterOffset */
    fun getNextJournalAfterOffset(
        offset: String,
        params: WebhookGetNextJournalAfterOffsetParams =
            WebhookGetNextJournalAfterOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalAfterOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalAfterOffset */
    fun getNextJournalAfterOffset(
        offset: String,
        params: WebhookGetNextJournalAfterOffsetParams =
            WebhookGetNextJournalAfterOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalAfterOffset(offset, params, RequestOptions.none())

    /** @see getNextJournalAfterOffset */
    fun getNextJournalAfterOffset(
        params: WebhookGetNextJournalAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextJournalAfterOffset */
    fun getNextJournalAfterOffset(
        params: WebhookGetNextJournalAfterOffsetParams
    ): CompletableFuture<HttpResponse> = getNextJournalAfterOffset(params, RequestOptions.none())

    /** @see getNextJournalAfterOffset */
    fun getNextJournalAfterOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextJournalAfterOffset(
            offset,
            WebhookGetNextJournalAfterOffsetParams.none(),
            requestOptions,
        )

    fun getNextLocalJournalAfterOffset(offset: String): CompletableFuture<HttpResponse> =
        getNextLocalJournalAfterOffset(offset, WebhookGetNextLocalJournalAfterOffsetParams.none())

    /** @see getNextLocalJournalAfterOffset */
    fun getNextLocalJournalAfterOffset(
        offset: String,
        params: WebhookGetNextLocalJournalAfterOffsetParams =
            WebhookGetNextLocalJournalAfterOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextLocalJournalAfterOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextLocalJournalAfterOffset */
    fun getNextLocalJournalAfterOffset(
        offset: String,
        params: WebhookGetNextLocalJournalAfterOffsetParams =
            WebhookGetNextLocalJournalAfterOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getNextLocalJournalAfterOffset(offset, params, RequestOptions.none())

    /** @see getNextLocalJournalAfterOffset */
    fun getNextLocalJournalAfterOffset(
        params: WebhookGetNextLocalJournalAfterOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextLocalJournalAfterOffset */
    fun getNextLocalJournalAfterOffset(
        params: WebhookGetNextLocalJournalAfterOffsetParams
    ): CompletableFuture<HttpResponse> =
        getNextLocalJournalAfterOffset(params, RequestOptions.none())

    /** @see getNextLocalJournalAfterOffset */
    fun getNextLocalJournalAfterOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextLocalJournalAfterOffset(
            offset,
            WebhookGetNextLocalJournalAfterOffsetParams.none(),
            requestOptions,
        )

    /**
     * Retrieve the webhook settings for the specified app, including the webhook’s target URL,
     * throttle configuration, and create/update date.
     */
    fun getSettings(appId: Int): CompletableFuture<SettingsResponse> =
        getSettings(appId, WebhookGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
    ): CompletableFuture<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: WebhookGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** @see getSettings */
    fun getSettings(params: WebhookGetSettingsParams): CompletableFuture<SettingsResponse> =
        getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        getSettings(appId, WebhookGetSettingsParams.none(), requestOptions)

    /** Retrieve a specific event subscription by ID. */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookGetSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        getSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        getSubscription(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see getSubscription */
    fun getSubscription(
        params: WebhookGetSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = getSubscription(params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        params: WebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    fun getSubscriptionFilter(filterId: Long): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(filterId, WebhookGetSubscriptionFilterParams.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
    ): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        params: WebhookGetSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse>

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        params: WebhookGetSubscriptionFilterParams
    ): CompletableFuture<FilterResponse> = getSubscriptionFilter(params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(filterId, WebhookGetSubscriptionFilterParams.none(), requestOptions)

    fun getSubscriptionFilters(subscriptionId: Long): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilters(subscriptionId, WebhookGetSubscriptionFiltersParams.none())

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookGetSubscriptionFiltersParams = WebhookGetSubscriptionFiltersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilters(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookGetSubscriptionFiltersParams = WebhookGetSubscriptionFiltersParams.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilters(subscriptionId, params, RequestOptions.none())

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        params: WebhookGetSubscriptionFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>>

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        params: WebhookGetSubscriptionFiltersParams
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilters(params, RequestOptions.none())

    /** @see getSubscriptionFilters */
    fun getSubscriptionFilters(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilters(
            subscriptionId,
            WebhookGetSubscriptionFiltersParams.none(),
            requestOptions,
        )

    fun listJournalSubscriptions():
        CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookListJournalSubscriptionsParams =
            WebhookListJournalSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging>

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookListJournalSubscriptionsParams = WebhookListJournalSubscriptionsParams.none()
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        listJournalSubscriptions(params, RequestOptions.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none(), requestOptions)

    /** Retrieve event subscriptions for the specified app. */
    fun listSubscriptions(appId: Int): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, WebhookListSubscriptionsParams.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: WebhookListSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: WebhookListSubscriptionsParams
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, WebhookListSubscriptionsParams.none(), requestOptions)

    /** Update webhook settings for the specified app. */
    fun updateSettings(
        appId: Int,
        params: WebhookUpdateSettingsParams,
    ): CompletableFuture<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: WebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(params: WebhookUpdateSettingsParams): CompletableFuture<SettingsResponse> =
        updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: WebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** Update an existing event subscription by ID. */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookUpdateSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        updateSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        updateSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateSubscription */
    fun updateSubscription(
        params: WebhookUpdateSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = updateSubscription(params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        params: WebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [WebhookServiceAsync.createCrmSnapshot].
         */
        fun createCrmSnapshot(
            params: WebhookCreateCrmSnapshotParams
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshot(params, RequestOptions.none())

        /** @see createCrmSnapshot */
        fun createCrmSnapshot(
            params: WebhookCreateCrmSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>>

        /** @see createCrmSnapshot */
        fun createCrmSnapshot(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshot(
                WebhookCreateCrmSnapshotParams.builder()
                    .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                    .build(),
                requestOptions,
            )

        /** @see createCrmSnapshot */
        fun createCrmSnapshot(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshot(crmObjectSnapshotBatchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [WebhookServiceAsync.createJournalSubscription].
         */
        fun createJournalSubscription(
            params: WebhookCreateJournalSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(params, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            params: WebhookCreateJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>>

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(
                WebhookCreateJournalSubscriptionParams.builder()
                    .subscriptionUpsertRequest(subscriptionUpsertRequest)
                    .build(),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(subscriptionUpsertRequest, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                    objectSubscriptionUpsertRequest
                ),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(objectSubscriptionUpsertRequest, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            association: AssociationSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofAssociation(association),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            association: AssociationSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(association, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(appLifecycleEvent, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            listMembership: ListMembershipSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofListMembership(listMembership),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            listMembership: ListMembershipSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(listMembership, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookServiceAsync.createSubscription].
         */
        fun createSubscription(
            appId: Int,
            params: WebhookCreateSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(appId, params, RequestOptions.none())

        /** @see createSubscription */
        fun createSubscription(
            appId: Int,
            params: WebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscription */
        fun createSubscription(
            params: WebhookCreateSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(params, RequestOptions.none())

        /** @see createSubscription */
        fun createSubscription(
            params: WebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03/filters`,
         * but is otherwise the same as [WebhookServiceAsync.createSubscriptionFilter].
         */
        fun createSubscriptionFilter(
            params: WebhookCreateSubscriptionFilterParams
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createSubscriptionFilter(params, RequestOptions.none())

        /** @see createSubscriptionFilter */
        fun createSubscriptionFilter(
            params: WebhookCreateSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>>

        /** @see createSubscriptionFilter */
        fun createSubscriptionFilter(
            filterCreateRequest: FilterCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createSubscriptionFilter(
                WebhookCreateSubscriptionFilterParams.builder()
                    .filterCreateRequest(filterCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createSubscriptionFilter */
        fun createSubscriptionFilter(
            filterCreateRequest: FilterCreateRequest
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createSubscriptionFilter(filterCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [WebhookServiceAsync.createSubscriptionsBatch].
         */
        fun createSubscriptionsBatch(
            appId: Int,
            params: WebhookCreateSubscriptionsBatchParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            createSubscriptionsBatch(appId, params, RequestOptions.none())

        /** @see createSubscriptionsBatch */
        fun createSubscriptionsBatch(
            appId: Int,
            params: WebhookCreateSubscriptionsBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            createSubscriptionsBatch(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscriptionsBatch */
        fun createSubscriptionsBatch(
            params: WebhookCreateSubscriptionsBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            createSubscriptionsBatch(params, RequestOptions.none())

        /** @see createSubscriptionsBatch */
        fun createSubscriptionsBatch(
            params: WebhookCreateSubscriptionsBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.deleteJournalSubscription].
         */
        fun deleteJournalSubscription(subscriptionId: Long): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(subscriptionId, WebhookDeleteJournalSubscriptionParams.none())

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            subscriptionId: Long,
            params: WebhookDeleteJournalSubscriptionParams =
                WebhookDeleteJournalSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            subscriptionId: Long,
            params: WebhookDeleteJournalSubscriptionParams =
                WebhookDeleteJournalSubscriptionParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            params: WebhookDeleteJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            params: WebhookDeleteJournalSubscriptionParams
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(
                subscriptionId,
                WebhookDeleteJournalSubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [WebhookServiceAsync.deletePortalSubscriptions].
         */
        fun deletePortalSubscriptions(portalId: Long): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(portalId, WebhookDeletePortalSubscriptionsParams.none())

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookDeletePortalSubscriptionsParams =
                WebhookDeletePortalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookDeletePortalSubscriptionsParams =
                WebhookDeletePortalSubscriptionsParams.none(),
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(portalId, params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            params: WebhookDeletePortalSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            params: WebhookDeletePortalSubscriptionsParams
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            portalId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(
                portalId,
                WebhookDeletePortalSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookServiceAsync.deleteSettings].
         */
        fun deleteSettings(appId: Int): CompletableFuture<HttpResponse> =
            deleteSettings(appId, WebhookDeleteSettingsParams.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: WebhookDeleteSettingsParams = WebhookDeleteSettingsParams.none(),
        ): CompletableFuture<HttpResponse> = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            params: WebhookDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteSettings */
        fun deleteSettings(params: WebhookDeleteSettingsParams): CompletableFuture<HttpResponse> =
            deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteSettings(appId, WebhookDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.deleteSubscription].
         */
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookDeleteSubscriptionParams,
        ): CompletableFuture<HttpResponse> =
            deleteSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteSubscription */
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteSubscription */
        fun deleteSubscription(
            params: WebhookDeleteSubscriptionParams
        ): CompletableFuture<HttpResponse> = deleteSubscription(params, RequestOptions.none())

        /** @see deleteSubscription */
        fun deleteSubscription(
            params: WebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookServiceAsync.deleteSubscriptionFilter].
         */
        fun deleteSubscriptionFilter(filterId: Long): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(filterId, WebhookDeleteSubscriptionFilterParams.none())

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookDeleteSubscriptionFilterParams =
                WebhookDeleteSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookDeleteSubscriptionFilterParams =
                WebhookDeleteSubscriptionFilterParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            params: WebhookDeleteSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            params: WebhookDeleteSubscriptionFilterParams
        ): CompletableFuture<HttpResponse> = deleteSubscriptionFilter(params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(
                filterId,
                WebhookDeleteSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [WebhookServiceAsync.getEarliestJournal].
         */
        fun getEarliestJournal(): CompletableFuture<HttpResponse> =
            getEarliestJournal(WebhookGetEarliestJournalParams.none())

        /** @see getEarliestJournal */
        fun getEarliestJournal(
            params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getEarliestJournal */
        fun getEarliestJournal(
            params: WebhookGetEarliestJournalParams = WebhookGetEarliestJournalParams.none()
        ): CompletableFuture<HttpResponse> = getEarliestJournal(params, RequestOptions.none())

        /** @see getEarliestJournal */
        fun getEarliestJournal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getEarliestJournal(WebhookGetEarliestJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/earliest/{count}`, but is otherwise the same as
         * [WebhookServiceAsync.getEarliestJournalBatch].
         */
        fun getEarliestJournalBatch(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestJournalBatch(count, WebhookGetEarliestJournalBatchParams.none())

        /** @see getEarliestJournalBatch */
        fun getEarliestJournalBatch(
            count: Int,
            params: WebhookGetEarliestJournalBatchParams =
                WebhookGetEarliestJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getEarliestJournalBatch */
        fun getEarliestJournalBatch(
            count: Int,
            params: WebhookGetEarliestJournalBatchParams =
                WebhookGetEarliestJournalBatchParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestJournalBatch(count, params, RequestOptions.none())

        /** @see getEarliestJournalBatch */
        fun getEarliestJournalBatch(
            params: WebhookGetEarliestJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getEarliestJournalBatch */
        fun getEarliestJournalBatch(
            params: WebhookGetEarliestJournalBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestJournalBatch(params, RequestOptions.none())

        /** @see getEarliestJournalBatch */
        fun getEarliestJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestJournalBatch(
                count,
                WebhookGetEarliestJournalBatchParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookServiceAsync.getEarliestLocalJournal].
         */
        fun getEarliestLocalJournal(): CompletableFuture<HttpResponse> =
            getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none())

        /** @see getEarliestLocalJournal */
        fun getEarliestLocalJournal(
            params: WebhookGetEarliestLocalJournalParams =
                WebhookGetEarliestLocalJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getEarliestLocalJournal */
        fun getEarliestLocalJournal(
            params: WebhookGetEarliestLocalJournalParams =
                WebhookGetEarliestLocalJournalParams.none()
        ): CompletableFuture<HttpResponse> = getEarliestLocalJournal(params, RequestOptions.none())

        /** @see getEarliestLocalJournal */
        fun getEarliestLocalJournal(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            getEarliestLocalJournal(WebhookGetEarliestLocalJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/earliest/{count}`, but is otherwise the
         * same as [WebhookServiceAsync.getEarliestLocalJournalBatch].
         */
        fun getEarliestLocalJournalBatch(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestLocalJournalBatch(count, WebhookGetEarliestLocalJournalBatchParams.none())

        /** @see getEarliestLocalJournalBatch */
        fun getEarliestLocalJournalBatch(
            count: Int,
            params: WebhookGetEarliestLocalJournalBatchParams =
                WebhookGetEarliestLocalJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getEarliestLocalJournalBatch */
        fun getEarliestLocalJournalBatch(
            count: Int,
            params: WebhookGetEarliestLocalJournalBatchParams =
                WebhookGetEarliestLocalJournalBatchParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestLocalJournalBatch(count, params, RequestOptions.none())

        /** @see getEarliestLocalJournalBatch */
        fun getEarliestLocalJournalBatch(
            params: WebhookGetEarliestLocalJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getEarliestLocalJournalBatch */
        fun getEarliestLocalJournalBatch(
            params: WebhookGetEarliestLocalJournalBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestLocalJournalBatch(params, RequestOptions.none())

        /** @see getEarliestLocalJournalBatch */
        fun getEarliestLocalJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getEarliestLocalJournalBatch(
                count,
                WebhookGetEarliestLocalJournalBatchParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [WebhookServiceAsync.getJournalBatch].
         */
        fun getJournalBatch(
            params: WebhookGetJournalBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatch(params, RequestOptions.none())

        /** @see getJournalBatch */
        fun getJournalBatch(
            params: WebhookGetJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getJournalBatch */
        fun getJournalBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatch(
                WebhookGetJournalBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getJournalBatch */
        fun getJournalBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}`, but is otherwise the same
         * as [WebhookServiceAsync.getJournalBatchAfterOffset].
         */
        fun getJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetJournalBatchAfterOffsetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchAfterOffset(count, params, RequestOptions.none())

        /** @see getJournalBatchAfterOffset */
        fun getJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getJournalBatchAfterOffset */
        fun getJournalBatchAfterOffset(
            params: WebhookGetJournalBatchAfterOffsetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchAfterOffset(params, RequestOptions.none())

        /** @see getJournalBatchAfterOffset */
        fun getJournalBatchAfterOffset(
            params: WebhookGetJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookServiceAsync.getJournalStatus].
         */
        fun getJournalStatus(
            statusId: String
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(statusId, WebhookGetJournalStatusParams.none())

        /** @see getJournalStatus */
        fun getJournalStatus(
            statusId: String,
            params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getJournalStatus */
        fun getJournalStatus(
            statusId: String,
            params: WebhookGetJournalStatusParams = WebhookGetJournalStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(statusId, params, RequestOptions.none())

        /** @see getJournalStatus */
        fun getJournalStatus(
            params: WebhookGetJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>>

        /** @see getJournalStatus */
        fun getJournalStatus(
            params: WebhookGetJournalStatusParams
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(params, RequestOptions.none())

        /** @see getJournalStatus */
        fun getJournalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(statusId, WebhookGetJournalStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookServiceAsync.getLatestJournal].
         */
        fun getLatestJournal(): CompletableFuture<HttpResponse> =
            getLatestJournal(WebhookGetLatestJournalParams.none())

        /** @see getLatestJournal */
        fun getLatestJournal(
            params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLatestJournal */
        fun getLatestJournal(
            params: WebhookGetLatestJournalParams = WebhookGetLatestJournalParams.none()
        ): CompletableFuture<HttpResponse> = getLatestJournal(params, RequestOptions.none())

        /** @see getLatestJournal */
        fun getLatestJournal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLatestJournal(WebhookGetLatestJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/latest/{count}`, but is otherwise the same as
         * [WebhookServiceAsync.getLatestJournalBatch].
         */
        fun getLatestJournalBatch(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none())

        /** @see getLatestJournalBatch */
        fun getLatestJournalBatch(
            count: Int,
            params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLatestJournalBatch */
        fun getLatestJournalBatch(
            count: Int,
            params: WebhookGetLatestJournalBatchParams = WebhookGetLatestJournalBatchParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestJournalBatch(count, params, RequestOptions.none())

        /** @see getLatestJournalBatch */
        fun getLatestJournalBatch(
            params: WebhookGetLatestJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLatestJournalBatch */
        fun getLatestJournalBatch(
            params: WebhookGetLatestJournalBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestJournalBatch(params, RequestOptions.none())

        /** @see getLatestJournalBatch */
        fun getLatestJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestJournalBatch(count, WebhookGetLatestJournalBatchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookServiceAsync.getLatestLocalJournal].
         */
        fun getLatestLocalJournal(): CompletableFuture<HttpResponse> =
            getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none())

        /** @see getLatestLocalJournal */
        fun getLatestLocalJournal(
            params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLatestLocalJournal */
        fun getLatestLocalJournal(
            params: WebhookGetLatestLocalJournalParams = WebhookGetLatestLocalJournalParams.none()
        ): CompletableFuture<HttpResponse> = getLatestLocalJournal(params, RequestOptions.none())

        /** @see getLatestLocalJournal */
        fun getLatestLocalJournal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLatestLocalJournal(WebhookGetLatestLocalJournalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/latest/{count}`, but is otherwise the same
         * as [WebhookServiceAsync.getLatestLocalJournalBatch].
         */
        fun getLatestLocalJournalBatch(
            count: Int
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestLocalJournalBatch(count, WebhookGetLatestLocalJournalBatchParams.none())

        /** @see getLatestLocalJournalBatch */
        fun getLatestLocalJournalBatch(
            count: Int,
            params: WebhookGetLatestLocalJournalBatchParams =
                WebhookGetLatestLocalJournalBatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestLocalJournalBatch(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLatestLocalJournalBatch */
        fun getLatestLocalJournalBatch(
            count: Int,
            params: WebhookGetLatestLocalJournalBatchParams =
                WebhookGetLatestLocalJournalBatchParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestLocalJournalBatch(count, params, RequestOptions.none())

        /** @see getLatestLocalJournalBatch */
        fun getLatestLocalJournalBatch(
            params: WebhookGetLatestLocalJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLatestLocalJournalBatch */
        fun getLatestLocalJournalBatch(
            params: WebhookGetLatestLocalJournalBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestLocalJournalBatch(params, RequestOptions.none())

        /** @see getLatestLocalJournalBatch */
        fun getLatestLocalJournalBatch(
            count: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLatestLocalJournalBatch(
                count,
                WebhookGetLatestLocalJournalBatchParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /webhooks-journal/journal-local/2026-03/batch/read`, but is otherwise the same as
         * [WebhookServiceAsync.getLocalJournalBatch].
         */
        fun getLocalJournalBatch(
            params: WebhookGetLocalJournalBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatch(params, RequestOptions.none())

        /** @see getLocalJournalBatch */
        fun getLocalJournalBatch(
            params: WebhookGetLocalJournalBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLocalJournalBatch */
        fun getLocalJournalBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatch(
                WebhookGetLocalJournalBatchParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getLocalJournalBatch */
        fun getLocalJournalBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}`, but is otherwise
         * the same as [WebhookServiceAsync.getLocalJournalBatchAfterOffset].
         */
        fun getLocalJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchAfterOffsetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchAfterOffset(count, params, RequestOptions.none())

        /** @see getLocalJournalBatchAfterOffset */
        fun getLocalJournalBatchAfterOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchAfterOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalJournalBatchAfterOffset */
        fun getLocalJournalBatchAfterOffset(
            params: WebhookGetLocalJournalBatchAfterOffsetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchAfterOffset(params, RequestOptions.none())

        /** @see getLocalJournalBatchAfterOffset */
        fun getLocalJournalBatchAfterOffset(
            params: WebhookGetLocalJournalBatchAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookServiceAsync.getLocalJournalStatus].
         */
        fun getLocalJournalStatus(
            statusId: String
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(statusId, WebhookGetLocalJournalStatusParams.none())

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookGetLocalJournalStatusParams = WebhookGetLocalJournalStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(statusId, params, RequestOptions.none())

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            params: WebhookGetLocalJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>>

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            params: WebhookGetLocalJournalStatusParams
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(params, RequestOptions.none())

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(
                statusId,
                WebhookGetLocalJournalStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookServiceAsync.getNextJournalAfterOffset].
         */
        fun getNextJournalAfterOffset(offset: String): CompletableFuture<HttpResponse> =
            getNextJournalAfterOffset(offset, WebhookGetNextJournalAfterOffsetParams.none())

        /** @see getNextJournalAfterOffset */
        fun getNextJournalAfterOffset(
            offset: String,
            params: WebhookGetNextJournalAfterOffsetParams =
                WebhookGetNextJournalAfterOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalAfterOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalAfterOffset */
        fun getNextJournalAfterOffset(
            offset: String,
            params: WebhookGetNextJournalAfterOffsetParams =
                WebhookGetNextJournalAfterOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalAfterOffset(offset, params, RequestOptions.none())

        /** @see getNextJournalAfterOffset */
        fun getNextJournalAfterOffset(
            params: WebhookGetNextJournalAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextJournalAfterOffset */
        fun getNextJournalAfterOffset(
            params: WebhookGetNextJournalAfterOffsetParams
        ): CompletableFuture<HttpResponse> =
            getNextJournalAfterOffset(params, RequestOptions.none())

        /** @see getNextJournalAfterOffset */
        fun getNextJournalAfterOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextJournalAfterOffset(
                offset,
                WebhookGetNextJournalAfterOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookServiceAsync.getNextLocalJournalAfterOffset].
         */
        fun getNextLocalJournalAfterOffset(offset: String): CompletableFuture<HttpResponse> =
            getNextLocalJournalAfterOffset(
                offset,
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
            )

        /** @see getNextLocalJournalAfterOffset */
        fun getNextLocalJournalAfterOffset(
            offset: String,
            params: WebhookGetNextLocalJournalAfterOffsetParams =
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalAfterOffset(
                params.toBuilder().offset(offset).build(),
                requestOptions,
            )

        /** @see getNextLocalJournalAfterOffset */
        fun getNextLocalJournalAfterOffset(
            offset: String,
            params: WebhookGetNextLocalJournalAfterOffsetParams =
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalAfterOffset(offset, params, RequestOptions.none())

        /** @see getNextLocalJournalAfterOffset */
        fun getNextLocalJournalAfterOffset(
            params: WebhookGetNextLocalJournalAfterOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextLocalJournalAfterOffset */
        fun getNextLocalJournalAfterOffset(
            params: WebhookGetNextLocalJournalAfterOffsetParams
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalAfterOffset(params, RequestOptions.none())

        /** @see getNextLocalJournalAfterOffset */
        fun getNextLocalJournalAfterOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalAfterOffset(
                offset,
                WebhookGetNextLocalJournalAfterOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookServiceAsync.getSettings].
         */
        fun getSettings(appId: Int): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, WebhookGetSettingsParams.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: WebhookGetSettingsParams = WebhookGetSettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            params: WebhookGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /** @see getSettings */
        fun getSettings(
            params: WebhookGetSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, WebhookGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.getSubscription].
         */
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookGetSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscription */
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscription */
        fun getSubscription(
            params: WebhookGetSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(params, RequestOptions.none())

        /** @see getSubscription */
        fun getSubscription(
            params: WebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookServiceAsync.getSubscriptionFilter].
         */
        fun getSubscriptionFilter(
            filterId: Long
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(filterId, WebhookGetSubscriptionFilterParams.none())

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookGetSubscriptionFilterParams = WebhookGetSubscriptionFilterParams.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            params: WebhookGetSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>>

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            params: WebhookGetSubscriptionFilterParams
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(
                filterId,
                WebhookGetSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [WebhookServiceAsync.getSubscriptionFilters].
         */
        fun getSubscriptionFilters(
            subscriptionId: Long
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilters(subscriptionId, WebhookGetSubscriptionFiltersParams.none())

        /** @see getSubscriptionFilters */
        fun getSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFiltersParams =
                WebhookGetSubscriptionFiltersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilters(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscriptionFilters */
        fun getSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFiltersParams = WebhookGetSubscriptionFiltersParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilters(subscriptionId, params, RequestOptions.none())

        /** @see getSubscriptionFilters */
        fun getSubscriptionFilters(
            params: WebhookGetSubscriptionFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>>

        /** @see getSubscriptionFilters */
        fun getSubscriptionFilters(
            params: WebhookGetSubscriptionFiltersParams
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilters(params, RequestOptions.none())

        /** @see getSubscriptionFilters */
        fun getSubscriptionFilters(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilters(
                subscriptionId,
                WebhookGetSubscriptionFiltersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [WebhookServiceAsync.listJournalSubscriptions].
         */
        fun listJournalSubscriptions():
            CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>> =
            listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none())

        /** @see listJournalSubscriptions */
        fun listJournalSubscriptions(
            params: WebhookListJournalSubscriptionsParams =
                WebhookListJournalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>>

        /** @see listJournalSubscriptions */
        fun listJournalSubscriptions(
            params: WebhookListJournalSubscriptionsParams =
                WebhookListJournalSubscriptionsParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>> =
            listJournalSubscriptions(params, RequestOptions.none())

        /** @see listJournalSubscriptions */
        fun listJournalSubscriptions(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>> =
            listJournalSubscriptions(WebhookListJournalSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookServiceAsync.listSubscriptions].
         */
        fun listSubscriptions(
            appId: Int
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, WebhookListSubscriptionsParams.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            params: WebhookListSubscriptionsParams = WebhookListSubscriptionsParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, params, RequestOptions.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            params: WebhookListSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see listSubscriptions */
        fun listSubscriptions(
            params: WebhookListSubscriptionsParams
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(params, RequestOptions.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, WebhookListSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookServiceAsync.updateSettings].
         */
        fun updateSettings(
            appId: Int,
            params: WebhookUpdateSettingsParams,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            appId: Int,
            params: WebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        fun updateSettings(
            params: WebhookUpdateSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            params: WebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.updateSubscription].
         */
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookUpdateSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateSubscription */
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateSubscription */
        fun updateSubscription(
            params: WebhookUpdateSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(params, RequestOptions.none())

        /** @see updateSubscription */
        fun updateSubscription(
            params: WebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>
    }
}
