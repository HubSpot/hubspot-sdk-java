// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.google.errorprone.annotations.MustBeClosed
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
    fun getJournalEarliest(): HttpResponse =
        getJournalEarliest(WebhookGetJournalEarliestParams.none())

    /** @see getJournalEarliest */
    @MustBeClosed
    fun getJournalEarliest(
        params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getJournalEarliest */
    @MustBeClosed
    fun getJournalEarliest(
        params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none()
    ): HttpResponse = getJournalEarliest(params, RequestOptions.none())

    /** @see getJournalEarliest */
    @MustBeClosed
    fun getJournalEarliest(requestOptions: RequestOptions): HttpResponse =
        getJournalEarliest(WebhookGetJournalEarliestParams.none(), requestOptions)

    @MustBeClosed
    fun getJournalLatest(): HttpResponse = getJournalLatest(WebhookGetJournalLatestParams.none())

    /** @see getJournalLatest */
    @MustBeClosed
    fun getJournalLatest(
        params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getJournalLatest */
    @MustBeClosed
    fun getJournalLatest(
        params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none()
    ): HttpResponse = getJournalLatest(params, RequestOptions.none())

    /** @see getJournalLatest */
    @MustBeClosed
    fun getJournalLatest(requestOptions: RequestOptions): HttpResponse =
        getJournalLatest(WebhookGetJournalLatestParams.none(), requestOptions)

    @MustBeClosed
    fun getJournalNextByOffset(offset: String): HttpResponse =
        getJournalNextByOffset(offset, WebhookGetJournalNextByOffsetParams.none())

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookGetJournalNextByOffsetParams = WebhookGetJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookGetJournalNextByOffsetParams = WebhookGetJournalNextByOffsetParams.none(),
    ): HttpResponse = getJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(
        params: WebhookGetJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(params: WebhookGetJournalNextByOffsetParams): HttpResponse =
        getJournalNextByOffset(params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getJournalNextByOffset(offset, WebhookGetJournalNextByOffsetParams.none(), requestOptions)

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
    fun getLocalJournalEarliest(): HttpResponse =
        getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none())

    /** @see getLocalJournalEarliest */
    @MustBeClosed
    fun getLocalJournalEarliest(
        params: WebhookGetLocalJournalEarliestParams = WebhookGetLocalJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLocalJournalEarliest */
    @MustBeClosed
    fun getLocalJournalEarliest(
        params: WebhookGetLocalJournalEarliestParams = WebhookGetLocalJournalEarliestParams.none()
    ): HttpResponse = getLocalJournalEarliest(params, RequestOptions.none())

    /** @see getLocalJournalEarliest */
    @MustBeClosed
    fun getLocalJournalEarliest(requestOptions: RequestOptions): HttpResponse =
        getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none(), requestOptions)

    @MustBeClosed
    fun getLocalJournalLatest(): HttpResponse =
        getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none())

    /** @see getLocalJournalLatest */
    @MustBeClosed
    fun getLocalJournalLatest(
        params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLocalJournalLatest */
    @MustBeClosed
    fun getLocalJournalLatest(
        params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none()
    ): HttpResponse = getLocalJournalLatest(params, RequestOptions.none())

    /** @see getLocalJournalLatest */
    @MustBeClosed
    fun getLocalJournalLatest(requestOptions: RequestOptions): HttpResponse =
        getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none(), requestOptions)

    @MustBeClosed
    fun getLocalJournalNextByOffset(offset: String): HttpResponse =
        getLocalJournalNextByOffset(offset, WebhookGetLocalJournalNextByOffsetParams.none())

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookGetLocalJournalNextByOffsetParams =
            WebhookGetLocalJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookGetLocalJournalNextByOffsetParams =
            WebhookGetLocalJournalNextByOffsetParams.none(),
    ): HttpResponse = getLocalJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        params: WebhookGetLocalJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        params: WebhookGetLocalJournalNextByOffsetParams
    ): HttpResponse = getLocalJournalNextByOffset(params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getLocalJournalNextByOffset(
            offset,
            WebhookGetLocalJournalNextByOffsetParams.none(),
            requestOptions,
        )

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

    fun getSubscriptionFilterForSubscription(subscriptionId: Long): List<FilterResponse> =
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
    ): List<FilterResponse> =
        getSubscriptionFilterForSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        params: WebhookGetSubscriptionFilterForSubscriptionParams =
            WebhookGetSubscriptionFilterForSubscriptionParams.none(),
    ): List<FilterResponse> =
        getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookGetSubscriptionFilterForSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse>

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookGetSubscriptionFilterForSubscriptionParams
    ): List<FilterResponse> = getSubscriptionFilterForSubscription(params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): List<FilterResponse> =
        getSubscriptionFilterForSubscription(
            subscriptionId,
            WebhookGetSubscriptionFilterForSubscriptionParams.none(),
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
         * otherwise the same as [WebhookService.getJournalEarliest].
         */
        @MustBeClosed
        fun getJournalEarliest(): HttpResponse =
            getJournalEarliest(WebhookGetJournalEarliestParams.none())

        /** @see getJournalEarliest */
        @MustBeClosed
        fun getJournalEarliest(
            params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getJournalEarliest */
        @MustBeClosed
        fun getJournalEarliest(
            params: WebhookGetJournalEarliestParams = WebhookGetJournalEarliestParams.none()
        ): HttpResponse = getJournalEarliest(params, RequestOptions.none())

        /** @see getJournalEarliest */
        @MustBeClosed
        fun getJournalEarliest(requestOptions: RequestOptions): HttpResponse =
            getJournalEarliest(WebhookGetJournalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookService.getJournalLatest].
         */
        @MustBeClosed
        fun getJournalLatest(): HttpResponse =
            getJournalLatest(WebhookGetJournalLatestParams.none())

        /** @see getJournalLatest */
        @MustBeClosed
        fun getJournalLatest(
            params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getJournalLatest */
        @MustBeClosed
        fun getJournalLatest(
            params: WebhookGetJournalLatestParams = WebhookGetJournalLatestParams.none()
        ): HttpResponse = getJournalLatest(params, RequestOptions.none())

        /** @see getJournalLatest */
        @MustBeClosed
        fun getJournalLatest(requestOptions: RequestOptions): HttpResponse =
            getJournalLatest(WebhookGetJournalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookService.getJournalNextByOffset].
         */
        @MustBeClosed
        fun getJournalNextByOffset(offset: String): HttpResponse =
            getJournalNextByOffset(offset, WebhookGetJournalNextByOffsetParams.none())

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookGetJournalNextByOffsetParams =
                WebhookGetJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookGetJournalNextByOffsetParams = WebhookGetJournalNextByOffsetParams.none(),
        ): HttpResponse = getJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(
            params: WebhookGetJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(params: WebhookGetJournalNextByOffsetParams): HttpResponse =
            getJournalNextByOffset(params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
            getJournalNextByOffset(
                offset,
                WebhookGetJournalNextByOffsetParams.none(),
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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookService.getLocalJournalEarliest].
         */
        @MustBeClosed
        fun getLocalJournalEarliest(): HttpResponse =
            getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none())

        /** @see getLocalJournalEarliest */
        @MustBeClosed
        fun getLocalJournalEarliest(
            params: WebhookGetLocalJournalEarliestParams =
                WebhookGetLocalJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLocalJournalEarliest */
        @MustBeClosed
        fun getLocalJournalEarliest(
            params: WebhookGetLocalJournalEarliestParams =
                WebhookGetLocalJournalEarliestParams.none()
        ): HttpResponse = getLocalJournalEarliest(params, RequestOptions.none())

        /** @see getLocalJournalEarliest */
        @MustBeClosed
        fun getLocalJournalEarliest(requestOptions: RequestOptions): HttpResponse =
            getLocalJournalEarliest(WebhookGetLocalJournalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookService.getLocalJournalLatest].
         */
        @MustBeClosed
        fun getLocalJournalLatest(): HttpResponse =
            getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none())

        /** @see getLocalJournalLatest */
        @MustBeClosed
        fun getLocalJournalLatest(
            params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLocalJournalLatest */
        @MustBeClosed
        fun getLocalJournalLatest(
            params: WebhookGetLocalJournalLatestParams = WebhookGetLocalJournalLatestParams.none()
        ): HttpResponse = getLocalJournalLatest(params, RequestOptions.none())

        /** @see getLocalJournalLatest */
        @MustBeClosed
        fun getLocalJournalLatest(requestOptions: RequestOptions): HttpResponse =
            getLocalJournalLatest(WebhookGetLocalJournalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookService.getLocalJournalNextByOffset].
         */
        @MustBeClosed
        fun getLocalJournalNextByOffset(offset: String): HttpResponse =
            getLocalJournalNextByOffset(offset, WebhookGetLocalJournalNextByOffsetParams.none())

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookGetLocalJournalNextByOffsetParams =
                WebhookGetLocalJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookGetLocalJournalNextByOffsetParams =
                WebhookGetLocalJournalNextByOffsetParams.none(),
        ): HttpResponse = getLocalJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            params: WebhookGetLocalJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            params: WebhookGetLocalJournalNextByOffsetParams
        ): HttpResponse = getLocalJournalNextByOffset(params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            getLocalJournalNextByOffset(
                offset,
                WebhookGetLocalJournalNextByOffsetParams.none(),
                requestOptions,
            )

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
         * otherwise the same as [WebhookService.getSubscriptionFilterForSubscription].
         */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilterForSubscription(
                subscriptionId,
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
            )

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFilterForSubscriptionParams =
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilterForSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            params: WebhookGetSubscriptionFilterForSubscriptionParams =
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            params: WebhookGetSubscriptionFilterForSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>>

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            params: WebhookGetSubscriptionFilterForSubscriptionParams
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilterForSubscription(params, RequestOptions.none())

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilterForSubscription(
                subscriptionId,
                WebhookGetSubscriptionFilterForSubscriptionParams.none(),
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
