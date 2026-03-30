// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.services.blocking.webhooks.webhooks.BatchService
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

    fun batch(): BatchService

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

    fun createFilter(params: WebhookCreateFilterParams): FilterCreateResponse =
        createFilter(params, RequestOptions.none())

    /** @see createFilter */
    fun createFilter(
        params: WebhookCreateFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterCreateResponse

    /** @see createFilter */
    fun createFilter(
        filterCreateRequest: FilterCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterCreateResponse =
        createFilter(
            WebhookCreateFilterParams.builder().filterCreateRequest(filterCreateRequest).build(),
            requestOptions,
        )

    /** @see createFilter */
    fun createFilter(filterCreateRequest: FilterCreateRequest): FilterCreateResponse =
        createFilter(filterCreateRequest, RequestOptions.none())

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

    fun deleteFilter(filterId: Long) = deleteFilter(filterId, WebhookDeleteFilterParams.none())

    /** @see deleteFilter */
    fun deleteFilter(
        filterId: Long,
        params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see deleteFilter */
    fun deleteFilter(
        filterId: Long,
        params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
    ) = deleteFilter(filterId, params, RequestOptions.none())

    /** @see deleteFilter */
    fun deleteFilter(
        params: WebhookDeleteFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteFilter */
    fun deleteFilter(params: WebhookDeleteFilterParams) =
        deleteFilter(params, RequestOptions.none())

    /** @see deleteFilter */
    fun deleteFilter(filterId: Long, requestOptions: RequestOptions) =
        deleteFilter(filterId, WebhookDeleteFilterParams.none(), requestOptions)

    fun deletePortal(portalId: Long) = deletePortal(portalId, WebhookDeletePortalParams.none())

    /** @see deletePortal */
    fun deletePortal(
        portalId: Long,
        params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deletePortal(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortal */
    fun deletePortal(
        portalId: Long,
        params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
    ) = deletePortal(portalId, params, RequestOptions.none())

    /** @see deletePortal */
    fun deletePortal(
        params: WebhookDeletePortalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deletePortal */
    fun deletePortal(params: WebhookDeletePortalParams) =
        deletePortal(params, RequestOptions.none())

    /** @see deletePortal */
    fun deletePortal(portalId: Long, requestOptions: RequestOptions) =
        deletePortal(portalId, WebhookDeletePortalParams.none(), requestOptions)

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

    @MustBeClosed
    fun getEarliestJournalLocal(): HttpResponse =
        getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none())

    /** @see getEarliestJournalLocal */
    @MustBeClosed
    fun getEarliestJournalLocal(
        params: WebhookGetEarliestJournalLocalParams = WebhookGetEarliestJournalLocalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getEarliestJournalLocal */
    @MustBeClosed
    fun getEarliestJournalLocal(
        params: WebhookGetEarliestJournalLocalParams = WebhookGetEarliestJournalLocalParams.none()
    ): HttpResponse = getEarliestJournalLocal(params, RequestOptions.none())

    /** @see getEarliestJournalLocal */
    @MustBeClosed
    fun getEarliestJournalLocal(requestOptions: RequestOptions): HttpResponse =
        getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none(), requestOptions)

    fun getFilter(filterId: Long): FilterResponse =
        getFilter(filterId, WebhookGetFilterParams.none())

    /** @see getFilter */
    fun getFilter(
        filterId: Long,
        params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterResponse = getFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see getFilter */
    fun getFilter(
        filterId: Long,
        params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
    ): FilterResponse = getFilter(filterId, params, RequestOptions.none())

    /** @see getFilter */
    fun getFilter(
        params: WebhookGetFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterResponse

    /** @see getFilter */
    fun getFilter(params: WebhookGetFilterParams): FilterResponse =
        getFilter(params, RequestOptions.none())

    /** @see getFilter */
    fun getFilter(filterId: Long, requestOptions: RequestOptions): FilterResponse =
        getFilter(filterId, WebhookGetFilterParams.none(), requestOptions)

    fun getFilterBySubscription(subscriptionId: Long): List<FilterResponse> =
        getFilterBySubscription(subscriptionId, WebhookGetFilterBySubscriptionParams.none())

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        subscriptionId: Long,
        params: WebhookGetFilterBySubscriptionParams = WebhookGetFilterBySubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse> =
        getFilterBySubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        subscriptionId: Long,
        params: WebhookGetFilterBySubscriptionParams = WebhookGetFilterBySubscriptionParams.none(),
    ): List<FilterResponse> = getFilterBySubscription(subscriptionId, params, RequestOptions.none())

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        params: WebhookGetFilterBySubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse>

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        params: WebhookGetFilterBySubscriptionParams
    ): List<FilterResponse> = getFilterBySubscription(params, RequestOptions.none())

    /** @see getFilterBySubscription */
    fun getFilterBySubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): List<FilterResponse> =
        getFilterBySubscription(
            subscriptionId,
            WebhookGetFilterBySubscriptionParams.none(),
            requestOptions,
        )

    fun getJournalLocalStatus(statusId: String): SnapshotStatusResponse =
        getJournalLocalStatus(statusId, WebhookGetJournalLocalStatusParams.none())

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        statusId: String,
        params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse =
        getJournalLocalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        statusId: String,
        params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
    ): SnapshotStatusResponse = getJournalLocalStatus(statusId, params, RequestOptions.none())

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        params: WebhookGetJournalLocalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(params: WebhookGetJournalLocalStatusParams): SnapshotStatusResponse =
        getJournalLocalStatus(params, RequestOptions.none())

    /** @see getJournalLocalStatus */
    fun getJournalLocalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        getJournalLocalStatus(statusId, WebhookGetJournalLocalStatusParams.none(), requestOptions)

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

    @MustBeClosed
    fun getLatestJournalLocal(): HttpResponse =
        getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none())

    /** @see getLatestJournalLocal */
    @MustBeClosed
    fun getLatestJournalLocal(
        params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLatestJournalLocal */
    @MustBeClosed
    fun getLatestJournalLocal(
        params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none()
    ): HttpResponse = getLatestJournalLocal(params, RequestOptions.none())

    /** @see getLatestJournalLocal */
    @MustBeClosed
    fun getLatestJournalLocal(requestOptions: RequestOptions): HttpResponse =
        getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none(), requestOptions)

    @MustBeClosed
    fun getNextJournalByOffset(offset: String): HttpResponse =
        getNextJournalByOffset(offset, WebhookGetNextJournalByOffsetParams.none())

    /** @see getNextJournalByOffset */
    @MustBeClosed
    fun getNextJournalByOffset(
        offset: String,
        params: WebhookGetNextJournalByOffsetParams = WebhookGetNextJournalByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getNextJournalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalByOffset */
    @MustBeClosed
    fun getNextJournalByOffset(
        offset: String,
        params: WebhookGetNextJournalByOffsetParams = WebhookGetNextJournalByOffsetParams.none(),
    ): HttpResponse = getNextJournalByOffset(offset, params, RequestOptions.none())

    /** @see getNextJournalByOffset */
    @MustBeClosed
    fun getNextJournalByOffset(
        params: WebhookGetNextJournalByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextJournalByOffset */
    @MustBeClosed
    fun getNextJournalByOffset(params: WebhookGetNextJournalByOffsetParams): HttpResponse =
        getNextJournalByOffset(params, RequestOptions.none())

    /** @see getNextJournalByOffset */
    @MustBeClosed
    fun getNextJournalByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getNextJournalByOffset(offset, WebhookGetNextJournalByOffsetParams.none(), requestOptions)

    @MustBeClosed
    fun getNextJournalLocalByOffset(offset: String): HttpResponse =
        getNextJournalLocalByOffset(offset, WebhookGetNextJournalLocalByOffsetParams.none())

    /** @see getNextJournalLocalByOffset */
    @MustBeClosed
    fun getNextJournalLocalByOffset(
        offset: String,
        params: WebhookGetNextJournalLocalByOffsetParams =
            WebhookGetNextJournalLocalByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getNextJournalLocalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalLocalByOffset */
    @MustBeClosed
    fun getNextJournalLocalByOffset(
        offset: String,
        params: WebhookGetNextJournalLocalByOffsetParams =
            WebhookGetNextJournalLocalByOffsetParams.none(),
    ): HttpResponse = getNextJournalLocalByOffset(offset, params, RequestOptions.none())

    /** @see getNextJournalLocalByOffset */
    @MustBeClosed
    fun getNextJournalLocalByOffset(
        params: WebhookGetNextJournalLocalByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextJournalLocalByOffset */
    @MustBeClosed
    fun getNextJournalLocalByOffset(
        params: WebhookGetNextJournalLocalByOffsetParams
    ): HttpResponse = getNextJournalLocalByOffset(params, RequestOptions.none())

    /** @see getNextJournalLocalByOffset */
    @MustBeClosed
    fun getNextJournalLocalByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getNextJournalLocalByOffset(
            offset,
            WebhookGetNextJournalLocalByOffsetParams.none(),
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

        fun batch(): BatchService.WithRawResponse

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
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03/filters`,
         * but is otherwise the same as [WebhookService.createFilter].
         */
        @MustBeClosed
        fun createFilter(params: WebhookCreateFilterParams): HttpResponseFor<FilterCreateResponse> =
            createFilter(params, RequestOptions.none())

        /** @see createFilter */
        @MustBeClosed
        fun createFilter(
            params: WebhookCreateFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterCreateResponse>

        /** @see createFilter */
        @MustBeClosed
        fun createFilter(
            filterCreateRequest: FilterCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterCreateResponse> =
            createFilter(
                WebhookCreateFilterParams.builder()
                    .filterCreateRequest(filterCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createFilter */
        @MustBeClosed
        fun createFilter(
            filterCreateRequest: FilterCreateRequest
        ): HttpResponseFor<FilterCreateResponse> =
            createFilter(filterCreateRequest, RequestOptions.none())

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
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookService.deleteFilter].
         */
        @MustBeClosed
        fun deleteFilter(filterId: Long): HttpResponse =
            deleteFilter(filterId, WebhookDeleteFilterParams.none())

        /** @see deleteFilter */
        @MustBeClosed
        fun deleteFilter(
            filterId: Long,
            params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see deleteFilter */
        @MustBeClosed
        fun deleteFilter(
            filterId: Long,
            params: WebhookDeleteFilterParams = WebhookDeleteFilterParams.none(),
        ): HttpResponse = deleteFilter(filterId, params, RequestOptions.none())

        /** @see deleteFilter */
        @MustBeClosed
        fun deleteFilter(
            params: WebhookDeleteFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteFilter */
        @MustBeClosed
        fun deleteFilter(params: WebhookDeleteFilterParams): HttpResponse =
            deleteFilter(params, RequestOptions.none())

        /** @see deleteFilter */
        @MustBeClosed
        fun deleteFilter(filterId: Long, requestOptions: RequestOptions): HttpResponse =
            deleteFilter(filterId, WebhookDeleteFilterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [WebhookService.deletePortal].
         */
        @MustBeClosed
        fun deletePortal(portalId: Long): HttpResponse =
            deletePortal(portalId, WebhookDeletePortalParams.none())

        /** @see deletePortal */
        @MustBeClosed
        fun deletePortal(
            portalId: Long,
            params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deletePortal(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortal */
        @MustBeClosed
        fun deletePortal(
            portalId: Long,
            params: WebhookDeletePortalParams = WebhookDeletePortalParams.none(),
        ): HttpResponse = deletePortal(portalId, params, RequestOptions.none())

        /** @see deletePortal */
        @MustBeClosed
        fun deletePortal(
            params: WebhookDeletePortalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deletePortal */
        @MustBeClosed
        fun deletePortal(params: WebhookDeletePortalParams): HttpResponse =
            deletePortal(params, RequestOptions.none())

        /** @see deletePortal */
        @MustBeClosed
        fun deletePortal(portalId: Long, requestOptions: RequestOptions): HttpResponse =
            deletePortal(portalId, WebhookDeletePortalParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookService.getEarliestJournalLocal].
         */
        @MustBeClosed
        fun getEarliestJournalLocal(): HttpResponse =
            getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none())

        /** @see getEarliestJournalLocal */
        @MustBeClosed
        fun getEarliestJournalLocal(
            params: WebhookGetEarliestJournalLocalParams =
                WebhookGetEarliestJournalLocalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getEarliestJournalLocal */
        @MustBeClosed
        fun getEarliestJournalLocal(
            params: WebhookGetEarliestJournalLocalParams =
                WebhookGetEarliestJournalLocalParams.none()
        ): HttpResponse = getEarliestJournalLocal(params, RequestOptions.none())

        /** @see getEarliestJournalLocal */
        @MustBeClosed
        fun getEarliestJournalLocal(requestOptions: RequestOptions): HttpResponse =
            getEarliestJournalLocal(WebhookGetEarliestJournalLocalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookService.getFilter].
         */
        @MustBeClosed
        fun getFilter(filterId: Long): HttpResponseFor<FilterResponse> =
            getFilter(filterId, WebhookGetFilterParams.none())

        /** @see getFilter */
        @MustBeClosed
        fun getFilter(
            filterId: Long,
            params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterResponse> =
            getFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see getFilter */
        @MustBeClosed
        fun getFilter(
            filterId: Long,
            params: WebhookGetFilterParams = WebhookGetFilterParams.none(),
        ): HttpResponseFor<FilterResponse> = getFilter(filterId, params, RequestOptions.none())

        /** @see getFilter */
        @MustBeClosed
        fun getFilter(
            params: WebhookGetFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterResponse>

        /** @see getFilter */
        @MustBeClosed
        fun getFilter(params: WebhookGetFilterParams): HttpResponseFor<FilterResponse> =
            getFilter(params, RequestOptions.none())

        /** @see getFilter */
        @MustBeClosed
        fun getFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterResponse> =
            getFilter(filterId, WebhookGetFilterParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [WebhookService.getFilterBySubscription].
         */
        @MustBeClosed
        fun getFilterBySubscription(subscriptionId: Long): HttpResponseFor<List<FilterResponse>> =
            getFilterBySubscription(subscriptionId, WebhookGetFilterBySubscriptionParams.none())

        /** @see getFilterBySubscription */
        @MustBeClosed
        fun getFilterBySubscription(
            subscriptionId: Long,
            params: WebhookGetFilterBySubscriptionParams =
                WebhookGetFilterBySubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            getFilterBySubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getFilterBySubscription */
        @MustBeClosed
        fun getFilterBySubscription(
            subscriptionId: Long,
            params: WebhookGetFilterBySubscriptionParams =
                WebhookGetFilterBySubscriptionParams.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            getFilterBySubscription(subscriptionId, params, RequestOptions.none())

        /** @see getFilterBySubscription */
        @MustBeClosed
        fun getFilterBySubscription(
            params: WebhookGetFilterBySubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>>

        /** @see getFilterBySubscription */
        @MustBeClosed
        fun getFilterBySubscription(
            params: WebhookGetFilterBySubscriptionParams
        ): HttpResponseFor<List<FilterResponse>> =
            getFilterBySubscription(params, RequestOptions.none())

        /** @see getFilterBySubscription */
        @MustBeClosed
        fun getFilterBySubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FilterResponse>> =
            getFilterBySubscription(
                subscriptionId,
                WebhookGetFilterBySubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookService.getJournalLocalStatus].
         */
        @MustBeClosed
        fun getJournalLocalStatus(statusId: String): HttpResponseFor<SnapshotStatusResponse> =
            getJournalLocalStatus(statusId, WebhookGetJournalLocalStatusParams.none())

        /** @see getJournalLocalStatus */
        @MustBeClosed
        fun getJournalLocalStatus(
            statusId: String,
            params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalLocalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getJournalLocalStatus */
        @MustBeClosed
        fun getJournalLocalStatus(
            statusId: String,
            params: WebhookGetJournalLocalStatusParams = WebhookGetJournalLocalStatusParams.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalLocalStatus(statusId, params, RequestOptions.none())

        /** @see getJournalLocalStatus */
        @MustBeClosed
        fun getJournalLocalStatus(
            params: WebhookGetJournalLocalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse>

        /** @see getJournalLocalStatus */
        @MustBeClosed
        fun getJournalLocalStatus(
            params: WebhookGetJournalLocalStatusParams
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalLocalStatus(params, RequestOptions.none())

        /** @see getJournalLocalStatus */
        @MustBeClosed
        fun getJournalLocalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalLocalStatus(
                statusId,
                WebhookGetJournalLocalStatusParams.none(),
                requestOptions,
            )

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookService.getLatestJournalLocal].
         */
        @MustBeClosed
        fun getLatestJournalLocal(): HttpResponse =
            getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none())

        /** @see getLatestJournalLocal */
        @MustBeClosed
        fun getLatestJournalLocal(
            params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatestJournalLocal */
        @MustBeClosed
        fun getLatestJournalLocal(
            params: WebhookGetLatestJournalLocalParams = WebhookGetLatestJournalLocalParams.none()
        ): HttpResponse = getLatestJournalLocal(params, RequestOptions.none())

        /** @see getLatestJournalLocal */
        @MustBeClosed
        fun getLatestJournalLocal(requestOptions: RequestOptions): HttpResponse =
            getLatestJournalLocal(WebhookGetLatestJournalLocalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookService.getNextJournalByOffset].
         */
        @MustBeClosed
        fun getNextJournalByOffset(offset: String): HttpResponse =
            getNextJournalByOffset(offset, WebhookGetNextJournalByOffsetParams.none())

        /** @see getNextJournalByOffset */
        @MustBeClosed
        fun getNextJournalByOffset(
            offset: String,
            params: WebhookGetNextJournalByOffsetParams =
                WebhookGetNextJournalByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextJournalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalByOffset */
        @MustBeClosed
        fun getNextJournalByOffset(
            offset: String,
            params: WebhookGetNextJournalByOffsetParams = WebhookGetNextJournalByOffsetParams.none(),
        ): HttpResponse = getNextJournalByOffset(offset, params, RequestOptions.none())

        /** @see getNextJournalByOffset */
        @MustBeClosed
        fun getNextJournalByOffset(
            params: WebhookGetNextJournalByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextJournalByOffset */
        @MustBeClosed
        fun getNextJournalByOffset(params: WebhookGetNextJournalByOffsetParams): HttpResponse =
            getNextJournalByOffset(params, RequestOptions.none())

        /** @see getNextJournalByOffset */
        @MustBeClosed
        fun getNextJournalByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
            getNextJournalByOffset(
                offset,
                WebhookGetNextJournalByOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookService.getNextJournalLocalByOffset].
         */
        @MustBeClosed
        fun getNextJournalLocalByOffset(offset: String): HttpResponse =
            getNextJournalLocalByOffset(offset, WebhookGetNextJournalLocalByOffsetParams.none())

        /** @see getNextJournalLocalByOffset */
        @MustBeClosed
        fun getNextJournalLocalByOffset(
            offset: String,
            params: WebhookGetNextJournalLocalByOffsetParams =
                WebhookGetNextJournalLocalByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextJournalLocalByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalLocalByOffset */
        @MustBeClosed
        fun getNextJournalLocalByOffset(
            offset: String,
            params: WebhookGetNextJournalLocalByOffsetParams =
                WebhookGetNextJournalLocalByOffsetParams.none(),
        ): HttpResponse = getNextJournalLocalByOffset(offset, params, RequestOptions.none())

        /** @see getNextJournalLocalByOffset */
        @MustBeClosed
        fun getNextJournalLocalByOffset(
            params: WebhookGetNextJournalLocalByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextJournalLocalByOffset */
        @MustBeClosed
        fun getNextJournalLocalByOffset(
            params: WebhookGetNextJournalLocalByOffsetParams
        ): HttpResponse = getNextJournalLocalByOffset(params, RequestOptions.none())

        /** @see getNextJournalLocalByOffset */
        @MustBeClosed
        fun getNextJournalLocalByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            getNextJournalLocalByOffset(
                offset,
                WebhookGetNextJournalLocalByOffsetParams.none(),
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
