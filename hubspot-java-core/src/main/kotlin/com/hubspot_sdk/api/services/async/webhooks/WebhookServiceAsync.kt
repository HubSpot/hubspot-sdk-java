// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.webhooks.webhooks.AppLifecycleEventSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.AssociationSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot_sdk.api.models.webhooks.webhooks.CrmObjectSnapshotBatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.CrmObjectSnapshotBatchResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.FilterCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.FilterCreateResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.FilterResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.ListMembershipSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.ObjectSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SettingsResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SnapshotStatusResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionListResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionResponse1
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateCrmSnapshotParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateJournalSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteJournalSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeletePortalSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLocalJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLocalJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLocalJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLocalJournalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetSubscriptionFilterForSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetSubscriptionFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookListJournalSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookListSubscriptionsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookUpdateSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookUpdateSubscriptionParams
import com.hubspot_sdk.api.services.async.webhooks.webhooks.BatchServiceAsync
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

    fun batch(): BatchServiceAsync

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

    fun getJournalEarliest(): CompletableFuture<HttpResponse> =
        getJournalEarliest(WebhookGetJournalEarliestParams.none())

    /** @see getJournalEarliest */
    fun getJournalEarliest(
        params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getJournalEarliest */
    fun getJournalEarliest(
        params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none()
    ): CompletableFuture<HttpResponse> = getJournalEarliest(params, RequestOptions.none())

    /** @see getJournalEarliest */
    fun getJournalEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getJournalEarliest(WebhookGetJournalEarliestParams.none(), requestOptions)

    fun getJournalLatest(): CompletableFuture<HttpResponse> =
        getJournalLatest(WebhookGetJournalLatestParams.none())

    /** @see getJournalLatest */
    fun getJournalLatest(
        params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getJournalLatest */
    fun getJournalLatest(
        params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none()
    ): CompletableFuture<HttpResponse> = getJournalLatest(params, RequestOptions.none())

    /** @see getJournalLatest */
    fun getJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getJournalLatest(WebhookGetJournalLatestParams.none(), requestOptions)

    fun getJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(offset, WebhookGetJournalNextByOffsetParams.none())

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookGetJournalNextByOffsetParams = WebhookGetJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookGetJournalNextByOffsetParams = WebhookGetJournalNextByOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        params: WebhookGetJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        params: WebhookGetJournalNextByOffsetParams
    ): CompletableFuture<HttpResponse> = getJournalNextByOffset(params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    fun getJournalNextByOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getJournalNextByOffset(offset, WebhookGetJournalNextByOffsetParams.none(), requestOptions)

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

    fun getLocalJournalEarliest(): CompletableFuture<HttpResponse> =
        getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none())

    /** @see getLocalJournalEarliest */
    fun getLocalJournalEarliest(
        params: WebhookGetLocalJournalEarliestParams = WebhookGetLocalJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLocalJournalEarliest */
    fun getLocalJournalEarliest(
        params: WebhookGetLocalJournalEarliestParams = WebhookGetLocalJournalEarliestParams.none()
    ): CompletableFuture<HttpResponse> = getLocalJournalEarliest(params, RequestOptions.none())

    /** @see getLocalJournalEarliest */
    fun getLocalJournalEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none(), requestOptions)

    fun getLocalJournalLatest(): CompletableFuture<HttpResponse> =
        getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none())

    /** @see getLocalJournalLatest */
    fun getLocalJournalLatest(
        params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLocalJournalLatest */
    fun getLocalJournalLatest(
        params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none()
    ): CompletableFuture<HttpResponse> = getLocalJournalLatest(params, RequestOptions.none())

    /** @see getLocalJournalLatest */
    fun getLocalJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none(), requestOptions)

    fun getLocalJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(offset, WebhookGetLocalJournalNextByOffsetParams.none())

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookGetLocalJournalNextByOffsetParams =
            WebhookGetLocalJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookGetLocalJournalNextByOffsetParams =
            WebhookGetLocalJournalNextByOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        params: WebhookGetLocalJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        params: WebhookGetLocalJournalNextByOffsetParams
    ): CompletableFuture<HttpResponse> = getLocalJournalNextByOffset(params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    fun getLocalJournalNextByOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getLocalJournalNextByOffset(
            offset,
            WebhookGetLocalJournalNextByOffsetParams.none(),
            requestOptions,
        )

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

    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(
            subscriptionId,
            WebhookGetSubscriptionFilterForSubscriptionParams.none(),
        )

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        params: WebhookGetSubscriptionFilterForSubscriptionParams =
            WebhookGetSubscriptionFilterForSubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        params: WebhookGetSubscriptionFilterForSubscriptionParams =
            WebhookGetSubscriptionFilterForSubscriptionParams.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookGetSubscriptionFilterForSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>>

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookGetSubscriptionFilterForSubscriptionParams
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        getSubscriptionFilterForSubscription(
            subscriptionId,
            WebhookGetSubscriptionFilterForSubscriptionParams.none(),
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

        fun batch(): BatchServiceAsync.WithRawResponse

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
         * otherwise the same as [WebhookServiceAsync.getJournalEarliest].
         */
        fun getJournalEarliest(): CompletableFuture<HttpResponse> =
            getJournalEarliest(WebhookGetJournalEarliestParams.none())

        /** @see getJournalEarliest */
        fun getJournalEarliest(
            params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getJournalEarliest */
        fun getJournalEarliest(
            params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none()
        ): CompletableFuture<HttpResponse> = getJournalEarliest(params, RequestOptions.none())

        /** @see getJournalEarliest */
        fun getJournalEarliest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getJournalEarliest(WebhookGetJournalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookServiceAsync.getJournalLatest].
         */
        fun getJournalLatest(): CompletableFuture<HttpResponse> =
            getJournalLatest(WebhookGetJournalLatestParams.none())

        /** @see getJournalLatest */
        fun getJournalLatest(
            params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getJournalLatest */
        fun getJournalLatest(
            params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none()
        ): CompletableFuture<HttpResponse> = getJournalLatest(params, RequestOptions.none())

        /** @see getJournalLatest */
        fun getJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getJournalLatest(WebhookGetJournalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookServiceAsync.getJournalNextByOffset].
         */
        fun getJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(offset, WebhookGetJournalNextByOffsetParams.none())

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookGetJournalNextByOffsetParams =
                WebhookGetJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookGetJournalNextByOffsetParams = WebhookGetJournalNextByOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            params: WebhookGetJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            params: WebhookGetJournalNextByOffsetParams
        ): CompletableFuture<HttpResponse> = getJournalNextByOffset(params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        fun getJournalNextByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getJournalNextByOffset(
                offset,
                WebhookGetJournalNextByOffsetParams.none(),
                requestOptions,
            )

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookServiceAsync.getLocalJournalEarliest].
         */
        fun getLocalJournalEarliest(): CompletableFuture<HttpResponse> =
            getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none())

        /** @see getLocalJournalEarliest */
        fun getLocalJournalEarliest(
            params: WebhookGetLocalJournalEarliestParams =
                WebhookGetLocalJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLocalJournalEarliest */
        fun getLocalJournalEarliest(
            params: WebhookGetLocalJournalEarliestParams =
                WebhookGetLocalJournalEarliestParams.none()
        ): CompletableFuture<HttpResponse> = getLocalJournalEarliest(params, RequestOptions.none())

        /** @see getLocalJournalEarliest */
        fun getLocalJournalEarliest(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookServiceAsync.getLocalJournalLatest].
         */
        fun getLocalJournalLatest(): CompletableFuture<HttpResponse> =
            getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none())

        /** @see getLocalJournalLatest */
        fun getLocalJournalLatest(
            params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLocalJournalLatest */
        fun getLocalJournalLatest(
            params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none()
        ): CompletableFuture<HttpResponse> = getLocalJournalLatest(params, RequestOptions.none())

        /** @see getLocalJournalLatest */
        fun getLocalJournalLatest(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookServiceAsync.getLocalJournalNextByOffset].
         */
        fun getLocalJournalNextByOffset(offset: String): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(offset, WebhookGetLocalJournalNextByOffsetParams.none())

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookGetLocalJournalNextByOffsetParams =
                WebhookGetLocalJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookGetLocalJournalNextByOffsetParams =
                WebhookGetLocalJournalNextByOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            params: WebhookGetLocalJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            params: WebhookGetLocalJournalNextByOffsetParams
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        fun getLocalJournalNextByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getLocalJournalNextByOffset(
                offset,
                WebhookGetLocalJournalNextByOffsetParams.none(),
                requestOptions,
            )

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
         * otherwise the same as [WebhookServiceAsync.getSubscriptionFilterForSubscription].
         */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(
                subscriptionId,
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
            )

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFilterForSubscriptionParams =
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFilterForSubscriptionParams =
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            params: WebhookGetSubscriptionFilterForSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>>

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            params: WebhookGetSubscriptionFilterForSubscriptionParams
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(params, RequestOptions.none())

        /** @see getSubscriptionFilterForSubscription */
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getSubscriptionFilterForSubscription(
                subscriptionId,
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
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
