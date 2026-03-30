// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.webhooks.webhooks.CrmObjectSnapshotBatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.CrmObjectSnapshotBatchResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.FilterCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.FilterCreateResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.FilterResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SettingsResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SnapshotStatusResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionListResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateCrmSnapshotParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeletePortalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetEarliestJournalLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetEarliestJournalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetFilterBySubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetFilterParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalLocalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalStatusParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLatestJournalLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLatestJournalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetNextJournalByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetNextJournalLocalByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetSubscriptionParams
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

    fun createFilter(params: WebhookCreateFilterParams): CompletableFuture<FilterCreateResponse> =
        createFilter(params, RequestOptions.none())

    /** @see createFilter */
    fun createFilter(
        params: WebhookCreateFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse>

    /** @see createFilter */
    fun createFilter(
        filterCreateRequest: FilterCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse> =
        createFilter(
            WebhookCreateFilterParams.builder().filterCreateRequest(filterCreateRequest).build(),
            requestOptions,
        )

    /** @see createFilter */
    fun createFilter(
        filterCreateRequest: FilterCreateRequest
    ): CompletableFuture<FilterCreateResponse> =
        createFilter(filterCreateRequest, RequestOptions.none())

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

    fun deleteFilter(filterId: Long): CompletableFuture<Void?> =
        deleteFilter(filterId, WebhookDeleteFilterParams.none())

    /** @see deleteFilter */
    fun deleteFilter(
        filterId: Long,
        params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see deleteFilter */
    fun deleteFilter(
        filterId: Long,
        params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
    ): CompletableFuture<Void?> = deleteFilter(filterId, params, RequestOptions.none())

    /** @see deleteFilter */
    fun deleteFilter(
        params: WebhookDeleteFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteFilter */
    fun deleteFilter(params: WebhookDeleteFilterParams): CompletableFuture<Void?> =
        deleteFilter(params, RequestOptions.none())

    /** @see deleteFilter */
    fun deleteFilter(filterId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteFilter(filterId, WebhookDeleteFilterParams.none(), requestOptions)

    fun deletePortal(portalId: Long): CompletableFuture<Void?> =
        deletePortal(portalId, WebhookDeletePortalParams.none())

    /** @see deletePortal */
    fun deletePortal(
        portalId: Long,
        params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deletePortal(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortal */
    fun deletePortal(
        portalId: Long,
        params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
    ): CompletableFuture<Void?> = deletePortal(portalId, params, RequestOptions.none())

    /** @see deletePortal */
    fun deletePortal(
        params: WebhookDeletePortalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deletePortal */
    fun deletePortal(params: WebhookDeletePortalParams): CompletableFuture<Void?> =
        deletePortal(params, RequestOptions.none())

    /** @see deletePortal */
    fun deletePortal(portalId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deletePortal(portalId, WebhookDeletePortalParams.none(), requestOptions)

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

    fun getEarliestJournalLocal(): CompletableFuture<HttpResponse> =
        getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none())

    /** @see getEarliestJournalLocal */
    fun getEarliestJournalLocal(
        params: WebhookGetEarliestJournalLocalParams = WebhookGetEarliestJournalLocalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getEarliestJournalLocal */
    fun getEarliestJournalLocal(
        params: WebhookGetEarliestJournalLocalParams = WebhookGetEarliestJournalLocalParams.none()
    ): CompletableFuture<HttpResponse> = getEarliestJournalLocal(params, RequestOptions.none())

    /** @see getEarliestJournalLocal */
    fun getEarliestJournalLocal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none(), requestOptions)

    fun getFilter(filterId: Long): CompletableFuture<FilterResponse> =
        getFilter(filterId, WebhookGetFilterParams.none())

    /** @see getFilter */
    fun getFilter(
        filterId: Long,
        params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse> =
        getFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see getFilter */
    fun getFilter(
        filterId: Long,
        params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
    ): CompletableFuture<FilterResponse> = getFilter(filterId, params, RequestOptions.none())

    /** @see getFilter */
    fun getFilter(
        params: WebhookGetFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse>

    /** @see getFilter */
    fun getFilter(params: WebhookGetFilterParams): CompletableFuture<FilterResponse> =
        getFilter(params, RequestOptions.none())

    /** @see getFilter */
    fun getFilter(
        filterId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterResponse> =
        getFilter(filterId, WebhookGetFilterParams.none(), requestOptions)

    fun getFilterBySubscription(subscriptionId: Long): CompletableFuture<List<FilterResponse>> =
        getFilterBySubscription(subscriptionId, WebhookGetFilterBySubscriptionParams.none())

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        subscriptionId: Long,
        params: WebhookGetFilterBySubscriptionParams = WebhookGetFilterBySubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getFilterBySubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        subscriptionId: Long,
        params: WebhookGetFilterBySubscriptionParams = WebhookGetFilterBySubscriptionParams.none(),
    ): CompletableFuture<List<FilterResponse>> =
        getFilterBySubscription(subscriptionId, params, RequestOptions.none())

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        params: WebhookGetFilterBySubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>>

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        params: WebhookGetFilterBySubscriptionParams
    ): CompletableFuture<List<FilterResponse>> =
        getFilterBySubscription(params, RequestOptions.none())

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        getFilterBySubscription(
            subscriptionId,
            WebhookGetFilterBySubscriptionParams.none(),
            requestOptions,
        )

    fun getJournalLocalStatus(statusId: String): CompletableFuture<SnapshotStatusResponse> =
        getJournalLocalStatus(statusId, WebhookGetJournalLocalStatusParams.none())

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        statusId: String,
        params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalLocalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        statusId: String,
        params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalLocalStatus(statusId, params, RequestOptions.none())

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        params: WebhookGetJournalLocalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotStatusResponse>

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        params: WebhookGetJournalLocalStatusParams
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalLocalStatus(params, RequestOptions.none())

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotStatusResponse> =
        getJournalLocalStatus(statusId, WebhookGetJournalLocalStatusParams.none(), requestOptions)

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

    fun getLatestJournalLocal(): CompletableFuture<HttpResponse> =
        getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none())

    /** @see getLatestJournalLocal */
    fun getLatestJournalLocal(
        params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLatestJournalLocal */
    fun getLatestJournalLocal(
        params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none()
    ): CompletableFuture<HttpResponse> = getLatestJournalLocal(params, RequestOptions.none())

    /** @see getLatestJournalLocal */
    fun getLatestJournalLocal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none(), requestOptions)

    fun getNextJournalByOffset(offset: String): CompletableFuture<HttpResponse> =
        getNextJournalByOffset(offset, WebhookGetNextJournalByOffsetParams.none())

    /** @see getNextJournalByOffset */
    fun getNextJournalByOffset(
        offset: String,
        params: WebhookGetNextJournalByOffsetParams = WebhookGetNextJournalByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalByOffset */
    fun getNextJournalByOffset(
        offset: String,
        params: WebhookGetNextJournalByOffsetParams = WebhookGetNextJournalByOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalByOffset(offset, params, RequestOptions.none())

    /** @see getNextJournalByOffset */
    fun getNextJournalByOffset(
        params: WebhookGetNextJournalByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextJournalByOffset */
    fun getNextJournalByOffset(
        params: WebhookGetNextJournalByOffsetParams
    ): CompletableFuture<HttpResponse> = getNextJournalByOffset(params, RequestOptions.none())

    /** @see getNextJournalByOffset */
    fun getNextJournalByOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextJournalByOffset(offset, WebhookGetNextJournalByOffsetParams.none(), requestOptions)

    fun getNextJournalLocalByOffset(offset: String): CompletableFuture<HttpResponse> =
        getNextJournalLocalByOffset(offset, WebhookGetNextJournalLocalByOffsetParams.none())

    /** @see getNextJournalLocalByOffset */
    fun getNextJournalLocalByOffset(
        offset: String,
        params: WebhookGetNextJournalLocalByOffsetParams =
            WebhookGetNextJournalLocalByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalLocalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalLocalByOffset */
    fun getNextJournalLocalByOffset(
        offset: String,
        params: WebhookGetNextJournalLocalByOffsetParams =
            WebhookGetNextJournalLocalByOffsetParams.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalLocalByOffset(offset, params, RequestOptions.none())

    /** @see getNextJournalLocalByOffset */
    fun getNextJournalLocalByOffset(
        params: WebhookGetNextJournalLocalByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextJournalLocalByOffset */
    fun getNextJournalLocalByOffset(
        params: WebhookGetNextJournalLocalByOffsetParams
    ): CompletableFuture<HttpResponse> = getNextJournalLocalByOffset(params, RequestOptions.none())

    /** @see getNextJournalLocalByOffset */
    fun getNextJournalLocalByOffset(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextJournalLocalByOffset(
            offset,
            WebhookGetNextJournalLocalByOffsetParams.none(),
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
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03/filters`,
         * but is otherwise the same as [WebhookServiceAsync.createFilter].
         */
        fun createFilter(
            params: WebhookCreateFilterParams
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createFilter(params, RequestOptions.none())

        /** @see createFilter */
        fun createFilter(
            params: WebhookCreateFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>>

        /** @see createFilter */
        fun createFilter(
            filterCreateRequest: FilterCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createFilter(
                WebhookCreateFilterParams.builder()
                    .filterCreateRequest(filterCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createFilter */
        fun createFilter(
            filterCreateRequest: FilterCreateRequest
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            createFilter(filterCreateRequest, RequestOptions.none())

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
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookServiceAsync.deleteFilter].
         */
        fun deleteFilter(filterId: Long): CompletableFuture<HttpResponse> =
            deleteFilter(filterId, WebhookDeleteFilterParams.none())

        /** @see deleteFilter */
        fun deleteFilter(
            filterId: Long,
            params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see deleteFilter */
        fun deleteFilter(
            filterId: Long,
            params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
        ): CompletableFuture<HttpResponse> = deleteFilter(filterId, params, RequestOptions.none())

        /** @see deleteFilter */
        fun deleteFilter(
            params: WebhookDeleteFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteFilter */
        fun deleteFilter(params: WebhookDeleteFilterParams): CompletableFuture<HttpResponse> =
            deleteFilter(params, RequestOptions.none())

        /** @see deleteFilter */
        fun deleteFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteFilter(filterId, WebhookDeleteFilterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [WebhookServiceAsync.deletePortal].
         */
        fun deletePortal(portalId: Long): CompletableFuture<HttpResponse> =
            deletePortal(portalId, WebhookDeletePortalParams.none())

        /** @see deletePortal */
        fun deletePortal(
            portalId: Long,
            params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deletePortal(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortal */
        fun deletePortal(
            portalId: Long,
            params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
        ): CompletableFuture<HttpResponse> = deletePortal(portalId, params, RequestOptions.none())

        /** @see deletePortal */
        fun deletePortal(
            params: WebhookDeletePortalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deletePortal */
        fun deletePortal(params: WebhookDeletePortalParams): CompletableFuture<HttpResponse> =
            deletePortal(params, RequestOptions.none())

        /** @see deletePortal */
        fun deletePortal(
            portalId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deletePortal(portalId, WebhookDeletePortalParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookServiceAsync.getEarliestJournalLocal].
         */
        fun getEarliestJournalLocal(): CompletableFuture<HttpResponse> =
            getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none())

        /** @see getEarliestJournalLocal */
        fun getEarliestJournalLocal(
            params: WebhookGetEarliestJournalLocalParams =
                WebhookGetEarliestJournalLocalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getEarliestJournalLocal */
        fun getEarliestJournalLocal(
            params: WebhookGetEarliestJournalLocalParams =
                WebhookGetEarliestJournalLocalParams.none()
        ): CompletableFuture<HttpResponse> = getEarliestJournalLocal(params, RequestOptions.none())

        /** @see getEarliestJournalLocal */
        fun getEarliestJournalLocal(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookServiceAsync.getFilter].
         */
        fun getFilter(filterId: Long): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getFilter(filterId, WebhookGetFilterParams.none())

        /** @see getFilter */
        fun getFilter(
            filterId: Long,
            params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see getFilter */
        fun getFilter(
            filterId: Long,
            params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getFilter(filterId, params, RequestOptions.none())

        /** @see getFilter */
        fun getFilter(
            params: WebhookGetFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>>

        /** @see getFilter */
        fun getFilter(
            params: WebhookGetFilterParams
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getFilter(params, RequestOptions.none())

        /** @see getFilter */
        fun getFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            getFilter(filterId, WebhookGetFilterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [WebhookServiceAsync.getFilterBySubscription].
         */
        fun getFilterBySubscription(
            subscriptionId: Long
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getFilterBySubscription(subscriptionId, WebhookGetFilterBySubscriptionParams.none())

        /** @see getFilterBySubscription */
        fun getFilterBySubscription(
            subscriptionId: Long,
            params: WebhookGetFilterBySubscriptionParams =
                WebhookGetFilterBySubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getFilterBySubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getFilterBySubscription */
        fun getFilterBySubscription(
            subscriptionId: Long,
            params: WebhookGetFilterBySubscriptionParams =
                WebhookGetFilterBySubscriptionParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getFilterBySubscription(subscriptionId, params, RequestOptions.none())

        /** @see getFilterBySubscription */
        fun getFilterBySubscription(
            params: WebhookGetFilterBySubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>>

        /** @see getFilterBySubscription */
        fun getFilterBySubscription(
            params: WebhookGetFilterBySubscriptionParams
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getFilterBySubscription(params, RequestOptions.none())

        /** @see getFilterBySubscription */
        fun getFilterBySubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            getFilterBySubscription(
                subscriptionId,
                WebhookGetFilterBySubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookServiceAsync.getJournalLocalStatus].
         */
        fun getJournalLocalStatus(
            statusId: String
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalLocalStatus(statusId, WebhookGetJournalLocalStatusParams.none())

        /** @see getJournalLocalStatus */
        fun getJournalLocalStatus(
            statusId: String,
            params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalLocalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getJournalLocalStatus */
        fun getJournalLocalStatus(
            statusId: String,
            params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalLocalStatus(statusId, params, RequestOptions.none())

        /** @see getJournalLocalStatus */
        fun getJournalLocalStatus(
            params: WebhookGetJournalLocalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>>

        /** @see getJournalLocalStatus */
        fun getJournalLocalStatus(
            params: WebhookGetJournalLocalStatusParams
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalLocalStatus(params, RequestOptions.none())

        /** @see getJournalLocalStatus */
        fun getJournalLocalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotStatusResponse>> =
            getJournalLocalStatus(
                statusId,
                WebhookGetJournalLocalStatusParams.none(),
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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookServiceAsync.getLatestJournalLocal].
         */
        fun getLatestJournalLocal(): CompletableFuture<HttpResponse> =
            getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none())

        /** @see getLatestJournalLocal */
        fun getLatestJournalLocal(
            params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLatestJournalLocal */
        fun getLatestJournalLocal(
            params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none()
        ): CompletableFuture<HttpResponse> = getLatestJournalLocal(params, RequestOptions.none())

        /** @see getLatestJournalLocal */
        fun getLatestJournalLocal(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookServiceAsync.getNextJournalByOffset].
         */
        fun getNextJournalByOffset(offset: String): CompletableFuture<HttpResponse> =
            getNextJournalByOffset(offset, WebhookGetNextJournalByOffsetParams.none())

        /** @see getNextJournalByOffset */
        fun getNextJournalByOffset(
            offset: String,
            params: WebhookGetNextJournalByOffsetParams =
                WebhookGetNextJournalByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalByOffset */
        fun getNextJournalByOffset(
            offset: String,
            params: WebhookGetNextJournalByOffsetParams = WebhookGetNextJournalByOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalByOffset(offset, params, RequestOptions.none())

        /** @see getNextJournalByOffset */
        fun getNextJournalByOffset(
            params: WebhookGetNextJournalByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextJournalByOffset */
        fun getNextJournalByOffset(
            params: WebhookGetNextJournalByOffsetParams
        ): CompletableFuture<HttpResponse> = getNextJournalByOffset(params, RequestOptions.none())

        /** @see getNextJournalByOffset */
        fun getNextJournalByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextJournalByOffset(
                offset,
                WebhookGetNextJournalByOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookServiceAsync.getNextJournalLocalByOffset].
         */
        fun getNextJournalLocalByOffset(offset: String): CompletableFuture<HttpResponse> =
            getNextJournalLocalByOffset(offset, WebhookGetNextJournalLocalByOffsetParams.none())

        /** @see getNextJournalLocalByOffset */
        fun getNextJournalLocalByOffset(
            offset: String,
            params: WebhookGetNextJournalLocalByOffsetParams =
                WebhookGetNextJournalLocalByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalLocalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalLocalByOffset */
        fun getNextJournalLocalByOffset(
            offset: String,
            params: WebhookGetNextJournalLocalByOffsetParams =
                WebhookGetNextJournalLocalByOffsetParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalLocalByOffset(offset, params, RequestOptions.none())

        /** @see getNextJournalLocalByOffset */
        fun getNextJournalLocalByOffset(
            params: WebhookGetNextJournalLocalByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextJournalLocalByOffset */
        fun getNextJournalLocalByOffset(
            params: WebhookGetNextJournalLocalByOffsetParams
        ): CompletableFuture<HttpResponse> =
            getNextJournalLocalByOffset(params, RequestOptions.none())

        /** @see getNextJournalLocalByOffset */
        fun getNextJournalLocalByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextJournalLocalByOffset(
                offset,
                WebhookGetNextJournalLocalByOffsetParams.none(),
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
