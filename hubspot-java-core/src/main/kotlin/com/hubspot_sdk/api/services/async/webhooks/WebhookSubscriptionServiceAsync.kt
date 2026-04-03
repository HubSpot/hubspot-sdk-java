// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.AppLifecycleEventSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.AssociationSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.CrmObjectSnapshotBatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.CrmObjectSnapshotBatchResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.FilterCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.FilterCreateResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.FilterResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.ListMembershipSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.ObjectSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SettingsResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SnapshotStatusResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionListResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionResponse1
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateCrmSnapshotParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateJournalSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteJournalSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeletePortalSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionListJournalSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionListSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionUpdateSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionUpdateSubscriptionParams
import com.hubspot_sdk.api.services.async.webhooks.webhooksubscriptions.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookSubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookSubscriptionServiceAsync

    fun batch(): BatchServiceAsync

    fun createCrmSnapshot(
        params: WebhookSubscriptionCreateCrmSnapshotParams
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshot(params, RequestOptions.none())

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        params: WebhookSubscriptionCreateCrmSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse>

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshot(
            WebhookSubscriptionCreateCrmSnapshotParams.builder()
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
        params: WebhookSubscriptionCreateJournalSubscriptionParams
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(params, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        params: WebhookSubscriptionCreateJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1>

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse1> =
        createJournalSubscription(
            WebhookSubscriptionCreateJournalSubscriptionParams.builder()
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
        params: WebhookSubscriptionCreateSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        createSubscription(appId, params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        appId: Int,
        params: WebhookSubscriptionCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscription */
    fun createSubscription(
        params: WebhookSubscriptionCreateSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = createSubscription(params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        params: WebhookSubscriptionCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    fun createSubscriptionFilter(
        params: WebhookSubscriptionCreateSubscriptionFilterParams
    ): CompletableFuture<FilterCreateResponse> =
        createSubscriptionFilter(params, RequestOptions.none())

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        params: WebhookSubscriptionCreateSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse>

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        filterCreateRequest: FilterCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse> =
        createSubscriptionFilter(
            WebhookSubscriptionCreateSubscriptionFilterParams.builder()
                .filterCreateRequest(filterCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        filterCreateRequest: FilterCreateRequest
    ): CompletableFuture<FilterCreateResponse> =
        createSubscriptionFilter(filterCreateRequest, RequestOptions.none())

    fun deleteJournalSubscription(subscriptionId: Long): CompletableFuture<Void?> =
        deleteJournalSubscription(
            subscriptionId,
            WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
        )

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        params: WebhookSubscriptionDeleteJournalSubscriptionParams =
            WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteJournalSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        params: WebhookSubscriptionDeleteJournalSubscriptionParams =
            WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
    ): CompletableFuture<Void?> =
        deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        params: WebhookSubscriptionDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        params: WebhookSubscriptionDeleteJournalSubscriptionParams
    ): CompletableFuture<Void?> = deleteJournalSubscription(params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteJournalSubscription(
            subscriptionId,
            WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
            requestOptions,
        )

    fun deletePortalSubscriptions(portalId: Long): CompletableFuture<Void?> =
        deletePortalSubscriptions(
            portalId,
            WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
        )

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        params: WebhookSubscriptionDeletePortalSubscriptionsParams =
            WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        params: WebhookSubscriptionDeletePortalSubscriptionsParams =
            WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
    ): CompletableFuture<Void?> = deletePortalSubscriptions(portalId, params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        params: WebhookSubscriptionDeletePortalSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        params: WebhookSubscriptionDeletePortalSubscriptionsParams
    ): CompletableFuture<Void?> = deletePortalSubscriptions(params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deletePortalSubscriptions(
            portalId,
            WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
            requestOptions,
        )

    /**
     * Delete the webhook settings for the specified app. Event subscriptions will not be deleted,
     * but will be paused until another webhook is created.
     */
    fun deleteSettings(appId: Int): CompletableFuture<Void?> =
        deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookSubscriptionDeleteSettingsParams =
            WebhookSubscriptionDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookSubscriptionDeleteSettingsParams =
            WebhookSubscriptionDeleteSettingsParams.none(),
    ): CompletableFuture<Void?> = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: WebhookSubscriptionDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteSettings */
    fun deleteSettings(params: WebhookSubscriptionDeleteSettingsParams): CompletableFuture<Void?> =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none(), requestOptions)

    /** Delete an existing event subscription by ID. */
    fun deleteSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionDeleteSubscriptionParams,
    ): CompletableFuture<Void?> = deleteSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteSubscription */
    fun deleteSubscription(
        params: WebhookSubscriptionDeleteSubscriptionParams
    ): CompletableFuture<Void?> = deleteSubscription(params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        params: WebhookSubscriptionDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun deleteSubscriptionFilter(filterId: Long): CompletableFuture<Void?> =
        deleteSubscriptionFilter(filterId, WebhookSubscriptionDeleteSubscriptionFilterParams.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionDeleteSubscriptionFilterParams =
            WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionDeleteSubscriptionFilterParams =
            WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
    ): CompletableFuture<Void?> = deleteSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        params: WebhookSubscriptionDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        params: WebhookSubscriptionDeleteSubscriptionFilterParams
    ): CompletableFuture<Void?> = deleteSubscriptionFilter(params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteSubscriptionFilter(
            filterId,
            WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
            requestOptions,
        )

    fun getJournalEarliest(): CompletableFuture<HttpResponse> =
        getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none())

    /** @see getJournalEarliest */
    fun getJournalEarliest(
        params: WebhookSubscriptionGetJournalEarliestParams =
            WebhookSubscriptionGetJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getJournalEarliest */
    fun getJournalEarliest(
        params: WebhookSubscriptionGetJournalEarliestParams =
            WebhookSubscriptionGetJournalEarliestParams.none()
    ): CompletableFuture<HttpResponse> = getJournalEarliest(params, RequestOptions.none())

    /** @see getJournalEarliest */
    fun getJournalEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none(), requestOptions)

    fun getJournalLatest(): CompletableFuture<HttpResponse> =
        getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none())

    /** @see getJournalLatest */
    fun getJournalLatest(
        params: WebhookSubscriptionGetJournalLatestParams =
            WebhookSubscriptionGetJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getJournalLatest */
    fun getJournalLatest(
        params: WebhookSubscriptionGetJournalLatestParams =
            WebhookSubscriptionGetJournalLatestParams.none()
    ): CompletableFuture<HttpResponse> = getJournalLatest(params, RequestOptions.none())

    /** @see getJournalLatest */
    fun getJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none(), requestOptions)

    fun getJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(offset, WebhookSubscriptionGetJournalNextByOffsetParams.none())

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetJournalNextByOffsetParams =
            WebhookSubscriptionGetJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetJournalNextByOffsetParams =
            WebhookSubscriptionGetJournalNextByOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        params: WebhookSubscriptionGetJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        params: WebhookSubscriptionGetJournalNextByOffsetParams
    ): CompletableFuture<HttpResponse> = getJournalNextByOffset(params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(
            offset,
            WebhookSubscriptionGetJournalNextByOffsetParams.none(),
            requestOptions,
        )

    fun getJournalStatus(statusId: String): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(statusId, WebhookSubscriptionGetJournalStatusParams.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetJournalStatusParams =
            WebhookSubscriptionGetJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetJournalStatusParams =
            WebhookSubscriptionGetJournalStatusParams.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(statusId, params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        params: WebhookSubscriptionGetJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse>

    /** @see getJournalStatus */
    fun getJournalStatus(
        params: WebhookSubscriptionGetJournalStatusParams
    ): CompletableFuture<SnapshotStatusResponse> = getJournalStatus(params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalStatus(statusId, WebhookSubscriptionGetJournalStatusParams.none(), requestOptions)

    fun getLocalJournalEarliest(): CompletableFuture<HttpResponse> =
        getLocalJournalEarliest(WebhookSubscriptionGetLocalJournalEarliestParams.none())

    /** @see getLocalJournalEarliest */
    fun getLocalJournalEarliest(
        params: WebhookSubscriptionGetLocalJournalEarliestParams =
            WebhookSubscriptionGetLocalJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLocalJournalEarliest */
    fun getLocalJournalEarliest(
        params: WebhookSubscriptionGetLocalJournalEarliestParams =
            WebhookSubscriptionGetLocalJournalEarliestParams.none()
    ): CompletableFuture<HttpResponse> = getLocalJournalEarliest(params, RequestOptions.none())

    /** @see getLocalJournalEarliest */
    fun getLocalJournalEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLocalJournalEarliest(
            WebhookSubscriptionGetLocalJournalEarliestParams.none(),
            requestOptions,
        )

    fun getLocalJournalLatest(): CompletableFuture<HttpResponse> =
        getLocalJournalLatest(WebhookSubscriptionGetLocalJournalLatestParams.none())

    /** @see getLocalJournalLatest */
    fun getLocalJournalLatest(
        params: WebhookSubscriptionGetLocalJournalLatestParams =
            WebhookSubscriptionGetLocalJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLocalJournalLatest */
    fun getLocalJournalLatest(
        params: WebhookSubscriptionGetLocalJournalLatestParams =
            WebhookSubscriptionGetLocalJournalLatestParams.none()
    ): CompletableFuture<HttpResponse> = getLocalJournalLatest(params, RequestOptions.none())

    /** @see getLocalJournalLatest */
    fun getLocalJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLocalJournalLatest(WebhookSubscriptionGetLocalJournalLatestParams.none(), requestOptions)

    fun getLocalJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(
            offset,
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
        )

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams
    ): CompletableFuture<HttpResponse> = getLocalJournalNextByOffset(params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(
            offset,
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
            requestOptions,
        )

    fun getLocalJournalStatus(statusId: String): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(statusId, WebhookSubscriptionGetLocalJournalStatusParams.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetLocalJournalStatusParams =
            WebhookSubscriptionGetLocalJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetLocalJournalStatusParams =
            WebhookSubscriptionGetLocalJournalStatusParams.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(statusId, params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        params: WebhookSubscriptionGetLocalJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse>

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        params: WebhookSubscriptionGetLocalJournalStatusParams
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        getLocalJournalStatus(
            statusId,
            WebhookSubscriptionGetLocalJournalStatusParams.none(),
            requestOptions,
        )

    /**
     * Retrieve the webhook settings for the specified app, including the webhook’s target URL,
     * throttle configuration, and create/update date.
     */
    fun getSettings(appId: Int): CompletableFuture<SettingsResponse> =
        getSettings(appId, WebhookSubscriptionGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookSubscriptionGetSettingsParams = WebhookSubscriptionGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookSubscriptionGetSettingsParams = WebhookSubscriptionGetSettingsParams.none(),
    ): CompletableFuture<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: WebhookSubscriptionGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** @see getSettings */
    fun getSettings(
        params: WebhookSubscriptionGetSettingsParams
    ): CompletableFuture<SettingsResponse> = getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        getSettings(appId, WebhookSubscriptionGetSettingsParams.none(), requestOptions)

    /** Retrieve a specific event subscription by ID. */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionGetSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        getSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        getSubscription(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see getSubscription */
    fun getSubscription(
        params: WebhookSubscriptionGetSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = getSubscription(params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        params: WebhookSubscriptionGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    fun getSubscriptionFilter(filterId: Long): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(filterId, WebhookSubscriptionGetSubscriptionFilterParams.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionGetSubscriptionFilterParams =
            WebhookSubscriptionGetSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionGetSubscriptionFilterParams =
            WebhookSubscriptionGetSubscriptionFilterParams.none(),
    ): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        params: WebhookSubscriptionGetSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse>

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        params: WebhookSubscriptionGetSubscriptionFilterParams
    ): CompletableFuture<FilterResponse> = getSubscriptionFilter(params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterResponse> =
        getSubscriptionFilter(
            filterId,
            WebhookSubscriptionGetSubscriptionFilterParams.none(),
            requestOptions,
        )

    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(
            subscriptionId,
            WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
        )

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams =
            WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams =
            WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>>

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(
            subscriptionId,
            WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
            requestOptions,
        )

    fun listJournalSubscriptions():
        CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        listJournalSubscriptions(WebhookSubscriptionListJournalSubscriptionsParams.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookSubscriptionListJournalSubscriptionsParams =
            WebhookSubscriptionListJournalSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging>

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookSubscriptionListJournalSubscriptionsParams =
            WebhookSubscriptionListJournalSubscriptionsParams.none()
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        listJournalSubscriptions(params, RequestOptions.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseSubscriptionResponseNoPaging> =
        listJournalSubscriptions(
            WebhookSubscriptionListJournalSubscriptionsParams.none(),
            requestOptions,
        )

    /** Retrieve event subscriptions for the specified app. */
    fun listSubscriptions(appId: Int): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, WebhookSubscriptionListSubscriptionsParams.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookSubscriptionListSubscriptionsParams =
            WebhookSubscriptionListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookSubscriptionListSubscriptionsParams =
            WebhookSubscriptionListSubscriptionsParams.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: WebhookSubscriptionListSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: WebhookSubscriptionListSubscriptionsParams
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, WebhookSubscriptionListSubscriptionsParams.none(), requestOptions)

    /** Update webhook settings for the specified app. */
    fun updateSettings(
        appId: Int,
        params: WebhookSubscriptionUpdateSettingsParams,
    ): CompletableFuture<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: WebhookSubscriptionUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(
        params: WebhookSubscriptionUpdateSettingsParams
    ): CompletableFuture<SettingsResponse> = updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: WebhookSubscriptionUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** Update an existing event subscription by ID. */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionUpdateSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        updateSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        updateSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateSubscription */
    fun updateSubscription(
        params: WebhookSubscriptionUpdateSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = updateSubscription(params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        params: WebhookSubscriptionUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /**
     * A view of [WebhookSubscriptionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookSubscriptionServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.createCrmSnapshot].
         */
        fun createCrmSnapshot(
            params: WebhookSubscriptionCreateCrmSnapshotParams
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshot(params, RequestOptions.none())

        /** @see createCrmSnapshot */
        fun createCrmSnapshot(
            params: WebhookSubscriptionCreateCrmSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>>

        /** @see createCrmSnapshot */
        fun createCrmSnapshot(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshot(
                WebhookSubscriptionCreateCrmSnapshotParams.builder()
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
         * otherwise the same as [WebhookSubscriptionServiceAsync.createJournalSubscription].
         */
        fun createJournalSubscription(
            params: WebhookSubscriptionCreateJournalSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(params, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            params: WebhookSubscriptionCreateJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>>

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse1>> =
            createJournalSubscription(
                WebhookSubscriptionCreateJournalSubscriptionParams.builder()
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
         * otherwise the same as [WebhookSubscriptionServiceAsync.createSubscription].
         */
        fun createSubscription(
            appId: Int,
            params: WebhookSubscriptionCreateSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(appId, params, RequestOptions.none())

        /** @see createSubscription */
        fun createSubscription(
            appId: Int,
            params: WebhookSubscriptionCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscription */
        fun createSubscription(
            params: WebhookSubscriptionCreateSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(params, RequestOptions.none())

        /** @see createSubscription */
        fun createSubscription(
            params: WebhookSubscriptionCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03/filters`,
         * but is otherwise the same as [WebhookSubscriptionServiceAsync.createSubscriptionFilter].
         */
        fun createSubscriptionFilter(
            params: WebhookSubscriptionCreateSubscriptionFilterParams
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createSubscriptionFilter(params, RequestOptions.none())

        /** @see createSubscriptionFilter */
        fun createSubscriptionFilter(
            params: WebhookSubscriptionCreateSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>>

        /** @see createSubscriptionFilter */
        fun createSubscriptionFilter(
            filterCreateRequest: FilterCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createSubscriptionFilter(
                WebhookSubscriptionCreateSubscriptionFilterParams.builder()
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
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.deleteJournalSubscription].
         */
        fun deleteJournalSubscription(subscriptionId: Long): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(
                subscriptionId,
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
            )

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            subscriptionId: Long,
            params: WebhookSubscriptionDeleteJournalSubscriptionParams =
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            subscriptionId: Long,
            params: WebhookSubscriptionDeleteJournalSubscriptionParams =
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            params: WebhookSubscriptionDeleteJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            params: WebhookSubscriptionDeleteJournalSubscriptionParams
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        fun deleteJournalSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscription(
                subscriptionId,
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.deletePortalSubscriptions].
         */
        fun deletePortalSubscriptions(portalId: Long): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(
                portalId,
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
            )

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookSubscriptionDeletePortalSubscriptionsParams =
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookSubscriptionDeletePortalSubscriptionsParams =
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(portalId, params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            params: WebhookSubscriptionDeletePortalSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            params: WebhookSubscriptionDeletePortalSubscriptionsParams
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        fun deletePortalSubscriptions(
            portalId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deletePortalSubscriptions(
                portalId,
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.deleteSettings].
         */
        fun deleteSettings(appId: Int): CompletableFuture<HttpResponse> =
            deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: WebhookSubscriptionDeleteSettingsParams =
                WebhookSubscriptionDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: WebhookSubscriptionDeleteSettingsParams =
                WebhookSubscriptionDeleteSettingsParams.none(),
        ): CompletableFuture<HttpResponse> = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            params: WebhookSubscriptionDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteSettings */
        fun deleteSettings(
            params: WebhookSubscriptionDeleteSettingsParams
        ): CompletableFuture<HttpResponse> = deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.deleteSubscription].
         */
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionDeleteSubscriptionParams,
        ): CompletableFuture<HttpResponse> =
            deleteSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteSubscription */
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteSubscription */
        fun deleteSubscription(
            params: WebhookSubscriptionDeleteSubscriptionParams
        ): CompletableFuture<HttpResponse> = deleteSubscription(params, RequestOptions.none())

        /** @see deleteSubscription */
        fun deleteSubscription(
            params: WebhookSubscriptionDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.deleteSubscriptionFilter].
         */
        fun deleteSubscriptionFilter(filterId: Long): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(
                filterId,
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
            )

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionDeleteSubscriptionFilterParams =
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionDeleteSubscriptionFilterParams =
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            params: WebhookSubscriptionDeleteSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            params: WebhookSubscriptionDeleteSubscriptionFilterParams
        ): CompletableFuture<HttpResponse> = deleteSubscriptionFilter(params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        fun deleteSubscriptionFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteSubscriptionFilter(
                filterId,
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.getJournalEarliest].
         */
        fun getJournalEarliest(): CompletableFuture<HttpResponse> =
            getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none())

        /** @see getJournalEarliest */
        fun getJournalEarliest(
            params: WebhookSubscriptionGetJournalEarliestParams =
                WebhookSubscriptionGetJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getJournalEarliest */
        fun getJournalEarliest(
            params: WebhookSubscriptionGetJournalEarliestParams =
                WebhookSubscriptionGetJournalEarliestParams.none()
        ): CompletableFuture<HttpResponse> = getJournalEarliest(params, RequestOptions.none())

        /** @see getJournalEarliest */
        fun getJournalEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.getJournalLatest].
         */
        fun getJournalLatest(): CompletableFuture<HttpResponse> =
            getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none())

        /** @see getJournalLatest */
        fun getJournalLatest(
            params: WebhookSubscriptionGetJournalLatestParams =
                WebhookSubscriptionGetJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getJournalLatest */
        fun getJournalLatest(
            params: WebhookSubscriptionGetJournalLatestParams =
                WebhookSubscriptionGetJournalLatestParams.none()
        ): CompletableFuture<HttpResponse> = getJournalLatest(params, RequestOptions.none())

        /** @see getJournalLatest */
        fun getJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.getJournalNextByOffset].
         */
        fun getJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(offset, WebhookSubscriptionGetJournalNextByOffsetParams.none())

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetJournalNextByOffsetParams =
                WebhookSubscriptionGetJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetJournalNextByOffsetParams =
                WebhookSubscriptionGetJournalNextByOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            params: WebhookSubscriptionGetJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            params: WebhookSubscriptionGetJournalNextByOffsetParams
        ): CompletableFuture<HttpResponse> = getJournalNextByOffset(params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(
                offset,
                WebhookSubscriptionGetJournalNextByOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.getJournalStatus].
         */
        fun getJournalStatus(
            statusId: String
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(statusId, WebhookSubscriptionGetJournalStatusParams.none())

        /** @see getJournalStatus */
        fun getJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetJournalStatusParams =
                WebhookSubscriptionGetJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getJournalStatus */
        fun getJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetJournalStatusParams =
                WebhookSubscriptionGetJournalStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(statusId, params, RequestOptions.none())

        /** @see getJournalStatus */
        fun getJournalStatus(
            params: WebhookSubscriptionGetJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>>

        /** @see getJournalStatus */
        fun getJournalStatus(
            params: WebhookSubscriptionGetJournalStatusParams
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(params, RequestOptions.none())

        /** @see getJournalStatus */
        fun getJournalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalStatus(
                statusId,
                WebhookSubscriptionGetJournalStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookSubscriptionServiceAsync.getLocalJournalEarliest].
         */
        fun getLocalJournalEarliest(): CompletableFuture<HttpResponse> =
            getLocalJournalEarliest(WebhookSubscriptionGetLocalJournalEarliestParams.none())

        /** @see getLocalJournalEarliest */
        fun getLocalJournalEarliest(
            params: WebhookSubscriptionGetLocalJournalEarliestParams =
                WebhookSubscriptionGetLocalJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLocalJournalEarliest */
        fun getLocalJournalEarliest(
            params: WebhookSubscriptionGetLocalJournalEarliestParams =
                WebhookSubscriptionGetLocalJournalEarliestParams.none()
        ): CompletableFuture<HttpResponse> = getLocalJournalEarliest(params, RequestOptions.none())

        /** @see getLocalJournalEarliest */
        fun getLocalJournalEarliest(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            getLocalJournalEarliest(
                WebhookSubscriptionGetLocalJournalEarliestParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookSubscriptionServiceAsync.getLocalJournalLatest].
         */
        fun getLocalJournalLatest(): CompletableFuture<HttpResponse> =
            getLocalJournalLatest(WebhookSubscriptionGetLocalJournalLatestParams.none())

        /** @see getLocalJournalLatest */
        fun getLocalJournalLatest(
            params: WebhookSubscriptionGetLocalJournalLatestParams =
                WebhookSubscriptionGetLocalJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLocalJournalLatest */
        fun getLocalJournalLatest(
            params: WebhookSubscriptionGetLocalJournalLatestParams =
                WebhookSubscriptionGetLocalJournalLatestParams.none()
        ): CompletableFuture<HttpResponse> = getLocalJournalLatest(params, RequestOptions.none())

        /** @see getLocalJournalLatest */
        fun getLocalJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLocalJournalLatest(
                WebhookSubscriptionGetLocalJournalLatestParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookSubscriptionServiceAsync.getLocalJournalNextByOffset].
         */
        fun getLocalJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(
                offset,
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
            )

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(
                offset,
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.getLocalJournalStatus].
         */
        fun getLocalJournalStatus(
            statusId: String
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(statusId, WebhookSubscriptionGetLocalJournalStatusParams.none())

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetLocalJournalStatusParams =
                WebhookSubscriptionGetLocalJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetLocalJournalStatusParams =
                WebhookSubscriptionGetLocalJournalStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(statusId, params, RequestOptions.none())

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            params: WebhookSubscriptionGetLocalJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>>

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            params: WebhookSubscriptionGetLocalJournalStatusParams
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(params, RequestOptions.none())

        /** @see getLocalJournalStatus */
        fun getLocalJournalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getLocalJournalStatus(
                statusId,
                WebhookSubscriptionGetLocalJournalStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.getSettings].
         */
        fun getSettings(appId: Int): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, WebhookSubscriptionGetSettingsParams.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: WebhookSubscriptionGetSettingsParams =
                WebhookSubscriptionGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: WebhookSubscriptionGetSettingsParams =
                WebhookSubscriptionGetSettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            params: WebhookSubscriptionGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /** @see getSettings */
        fun getSettings(
            params: WebhookSubscriptionGetSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, WebhookSubscriptionGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.getSubscription].
         */
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionGetSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscription */
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscription */
        fun getSubscription(
            params: WebhookSubscriptionGetSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(params, RequestOptions.none())

        /** @see getSubscription */
        fun getSubscription(
            params: WebhookSubscriptionGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.getSubscriptionFilter].
         */
        fun getSubscriptionFilter(
            filterId: Long
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(filterId, WebhookSubscriptionGetSubscriptionFilterParams.none())

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionGetSubscriptionFilterParams =
                WebhookSubscriptionGetSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionGetSubscriptionFilterParams =
                WebhookSubscriptionGetSubscriptionFilterParams.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            params: WebhookSubscriptionGetSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>>

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            params: WebhookSubscriptionGetSubscriptionFilterParams
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        fun getSubscriptionFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getSubscriptionFilter(
                filterId,
                WebhookSubscriptionGetSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as
         * [WebhookSubscriptionServiceAsync.getSubscriptionFilterForSubscription].
         */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(
                subscriptionId,
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
            )

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams =
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams =
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>>

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(params, RequestOptions.none())

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(
                subscriptionId,
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.listJournalSubscriptions].
         */
        fun listJournalSubscriptions():
            CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>> =
            listJournalSubscriptions(WebhookSubscriptionListJournalSubscriptionsParams.none())

        /** @see listJournalSubscriptions */
        fun listJournalSubscriptions(
            params: WebhookSubscriptionListJournalSubscriptionsParams =
                WebhookSubscriptionListJournalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>>

        /** @see listJournalSubscriptions */
        fun listJournalSubscriptions(
            params: WebhookSubscriptionListJournalSubscriptionsParams =
                WebhookSubscriptionListJournalSubscriptionsParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>> =
            listJournalSubscriptions(params, RequestOptions.none())

        /** @see listJournalSubscriptions */
        fun listJournalSubscriptions(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>> =
            listJournalSubscriptions(
                WebhookSubscriptionListJournalSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.listSubscriptions].
         */
        fun listSubscriptions(
            appId: Int
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, WebhookSubscriptionListSubscriptionsParams.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            params: WebhookSubscriptionListSubscriptionsParams =
                WebhookSubscriptionListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            params: WebhookSubscriptionListSubscriptionsParams =
                WebhookSubscriptionListSubscriptionsParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, params, RequestOptions.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            params: WebhookSubscriptionListSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see listSubscriptions */
        fun listSubscriptions(
            params: WebhookSubscriptionListSubscriptionsParams
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(params, RequestOptions.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(
                appId,
                WebhookSubscriptionListSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookSubscriptionServiceAsync.updateSettings].
         */
        fun updateSettings(
            appId: Int,
            params: WebhookSubscriptionUpdateSettingsParams,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            appId: Int,
            params: WebhookSubscriptionUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        fun updateSettings(
            params: WebhookSubscriptionUpdateSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            params: WebhookSubscriptionUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookSubscriptionServiceAsync.updateSubscription].
         */
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionUpdateSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateSubscription */
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateSubscription */
        fun updateSubscription(
            params: WebhookSubscriptionUpdateSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(params, RequestOptions.none())

        /** @see updateSubscription */
        fun updateSubscription(
            params: WebhookSubscriptionUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>
    }
}
