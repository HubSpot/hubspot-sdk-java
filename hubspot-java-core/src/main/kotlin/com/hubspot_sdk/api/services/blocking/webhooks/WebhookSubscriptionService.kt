// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.services.blocking.webhooks.webhooksubscriptions.BatchService
import java.util.function.Consumer

interface WebhookSubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookSubscriptionService

    fun batch(): BatchService

    fun createCrmSnapshot(
        params: WebhookSubscriptionCreateCrmSnapshotParams
    ): CrmObjectSnapshotBatchResponse = createCrmSnapshot(params, RequestOptions.none())

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        params: WebhookSubscriptionCreateCrmSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse

    /** @see createCrmSnapshot */
    fun createCrmSnapshot(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse =
        createCrmSnapshot(
            WebhookSubscriptionCreateCrmSnapshotParams.builder()
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
        params: WebhookSubscriptionCreateJournalSubscriptionParams
    ): SubscriptionResponse1 = createJournalSubscription(params, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        params: WebhookSubscriptionCreateJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        createJournalSubscription(
            WebhookSubscriptionCreateJournalSubscriptionParams.builder()
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
        params: WebhookSubscriptionCreateSubscriptionParams,
    ): SubscriptionResponse = createSubscription(appId, params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        appId: Int,
        params: WebhookSubscriptionCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscription */
    fun createSubscription(
        params: WebhookSubscriptionCreateSubscriptionParams
    ): SubscriptionResponse = createSubscription(params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        params: WebhookSubscriptionCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    fun createSubscriptionFilter(
        params: WebhookSubscriptionCreateSubscriptionFilterParams
    ): FilterCreateResponse = createSubscriptionFilter(params, RequestOptions.none())

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        params: WebhookSubscriptionCreateSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterCreateResponse

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(
        filterCreateRequest: FilterCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterCreateResponse =
        createSubscriptionFilter(
            WebhookSubscriptionCreateSubscriptionFilterParams.builder()
                .filterCreateRequest(filterCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createSubscriptionFilter */
    fun createSubscriptionFilter(filterCreateRequest: FilterCreateRequest): FilterCreateResponse =
        createSubscriptionFilter(filterCreateRequest, RequestOptions.none())

    fun deleteJournalSubscription(subscriptionId: Long) =
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
    ) =
        deleteJournalSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        subscriptionId: Long,
        params: WebhookSubscriptionDeleteJournalSubscriptionParams =
            WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
    ) = deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(
        params: WebhookSubscriptionDeleteJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(params: WebhookSubscriptionDeleteJournalSubscriptionParams) =
        deleteJournalSubscription(params, RequestOptions.none())

    /** @see deleteJournalSubscription */
    fun deleteJournalSubscription(subscriptionId: Long, requestOptions: RequestOptions) =
        deleteJournalSubscription(
            subscriptionId,
            WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
            requestOptions,
        )

    fun deletePortalSubscriptions(portalId: Long) =
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
    ) = deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        portalId: Long,
        params: WebhookSubscriptionDeletePortalSubscriptionsParams =
            WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
    ) = deletePortalSubscriptions(portalId, params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(
        params: WebhookSubscriptionDeletePortalSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(params: WebhookSubscriptionDeletePortalSubscriptionsParams) =
        deletePortalSubscriptions(params, RequestOptions.none())

    /** @see deletePortalSubscriptions */
    fun deletePortalSubscriptions(portalId: Long, requestOptions: RequestOptions) =
        deletePortalSubscriptions(
            portalId,
            WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
            requestOptions,
        )

    /**
     * Delete the webhook settings for the specified app. Event subscriptions will not be deleted,
     * but will be paused until another webhook is created.
     */
    fun deleteSettings(appId: Int) =
        deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookSubscriptionDeleteSettingsParams =
            WebhookSubscriptionDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: WebhookSubscriptionDeleteSettingsParams =
            WebhookSubscriptionDeleteSettingsParams.none(),
    ) = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: WebhookSubscriptionDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteSettings */
    fun deleteSettings(params: WebhookSubscriptionDeleteSettingsParams) =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions) =
        deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none(), requestOptions)

    /** Delete an existing event subscription by ID. */
    fun deleteSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionDeleteSubscriptionParams,
    ) = deleteSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteSubscription */
    fun deleteSubscription(params: WebhookSubscriptionDeleteSubscriptionParams) =
        deleteSubscription(params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        params: WebhookSubscriptionDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun deleteSubscriptionFilter(filterId: Long) =
        deleteSubscriptionFilter(filterId, WebhookSubscriptionDeleteSubscriptionFilterParams.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionDeleteSubscriptionFilterParams =
            WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionDeleteSubscriptionFilterParams =
            WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
    ) = deleteSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(
        params: WebhookSubscriptionDeleteSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(params: WebhookSubscriptionDeleteSubscriptionFilterParams) =
        deleteSubscriptionFilter(params, RequestOptions.none())

    /** @see deleteSubscriptionFilter */
    fun deleteSubscriptionFilter(filterId: Long, requestOptions: RequestOptions) =
        deleteSubscriptionFilter(
            filterId,
            WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
            requestOptions,
        )

    @MustBeClosed
    fun getJournalEarliest(): HttpResponse =
        getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none())

    /** @see getJournalEarliest */
    @MustBeClosed
    fun getJournalEarliest(
        params: WebhookSubscriptionGetJournalEarliestParams =
            WebhookSubscriptionGetJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getJournalEarliest */
    @MustBeClosed
    fun getJournalEarliest(
        params: WebhookSubscriptionGetJournalEarliestParams =
            WebhookSubscriptionGetJournalEarliestParams.none()
    ): HttpResponse = getJournalEarliest(params, RequestOptions.none())

    /** @see getJournalEarliest */
    @MustBeClosed
    fun getJournalEarliest(requestOptions: RequestOptions): HttpResponse =
        getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none(), requestOptions)

    @MustBeClosed
    fun getJournalLatest(): HttpResponse =
        getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none())

    /** @see getJournalLatest */
    @MustBeClosed
    fun getJournalLatest(
        params: WebhookSubscriptionGetJournalLatestParams =
            WebhookSubscriptionGetJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getJournalLatest */
    @MustBeClosed
    fun getJournalLatest(
        params: WebhookSubscriptionGetJournalLatestParams =
            WebhookSubscriptionGetJournalLatestParams.none()
    ): HttpResponse = getJournalLatest(params, RequestOptions.none())

    /** @see getJournalLatest */
    @MustBeClosed
    fun getJournalLatest(requestOptions: RequestOptions): HttpResponse =
        getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none(), requestOptions)

    @MustBeClosed
    fun getJournalNextByOffset(offset: String): HttpResponse =
        getJournalNextByOffset(offset, WebhookSubscriptionGetJournalNextByOffsetParams.none())

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetJournalNextByOffsetParams =
            WebhookSubscriptionGetJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetJournalNextByOffsetParams =
            WebhookSubscriptionGetJournalNextByOffsetParams.none(),
    ): HttpResponse = getJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(
        params: WebhookSubscriptionGetJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(
        params: WebhookSubscriptionGetJournalNextByOffsetParams
    ): HttpResponse = getJournalNextByOffset(params, RequestOptions.none())

    /** @see getJournalNextByOffset */
    @MustBeClosed
    fun getJournalNextByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getJournalNextByOffset(
            offset,
            WebhookSubscriptionGetJournalNextByOffsetParams.none(),
            requestOptions,
        )

    fun getJournalStatus(statusId: String): SnapshotStatusResponse =
        getJournalStatus(statusId, WebhookSubscriptionGetJournalStatusParams.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetJournalStatusParams =
            WebhookSubscriptionGetJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse =
        getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getJournalStatus */
    fun getJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetJournalStatusParams =
            WebhookSubscriptionGetJournalStatusParams.none(),
    ): SnapshotStatusResponse = getJournalStatus(statusId, params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(
        params: WebhookSubscriptionGetJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse

    /** @see getJournalStatus */
    fun getJournalStatus(
        params: WebhookSubscriptionGetJournalStatusParams
    ): SnapshotStatusResponse = getJournalStatus(params, RequestOptions.none())

    /** @see getJournalStatus */
    fun getJournalStatus(statusId: String, requestOptions: RequestOptions): SnapshotStatusResponse =
        getJournalStatus(statusId, WebhookSubscriptionGetJournalStatusParams.none(), requestOptions)

    @MustBeClosed
    fun getLocalJournalEarliest(): HttpResponse =
        getLocalJournalEarliest(WebhookSubscriptionGetLocalJournalEarliestParams.none())

    /** @see getLocalJournalEarliest */
    @MustBeClosed
    fun getLocalJournalEarliest(
        params: WebhookSubscriptionGetLocalJournalEarliestParams =
            WebhookSubscriptionGetLocalJournalEarliestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLocalJournalEarliest */
    @MustBeClosed
    fun getLocalJournalEarliest(
        params: WebhookSubscriptionGetLocalJournalEarliestParams =
            WebhookSubscriptionGetLocalJournalEarliestParams.none()
    ): HttpResponse = getLocalJournalEarliest(params, RequestOptions.none())

    /** @see getLocalJournalEarliest */
    @MustBeClosed
    fun getLocalJournalEarliest(requestOptions: RequestOptions): HttpResponse =
        getLocalJournalEarliest(
            WebhookSubscriptionGetLocalJournalEarliestParams.none(),
            requestOptions,
        )

    @MustBeClosed
    fun getLocalJournalLatest(): HttpResponse =
        getLocalJournalLatest(WebhookSubscriptionGetLocalJournalLatestParams.none())

    /** @see getLocalJournalLatest */
    @MustBeClosed
    fun getLocalJournalLatest(
        params: WebhookSubscriptionGetLocalJournalLatestParams =
            WebhookSubscriptionGetLocalJournalLatestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLocalJournalLatest */
    @MustBeClosed
    fun getLocalJournalLatest(
        params: WebhookSubscriptionGetLocalJournalLatestParams =
            WebhookSubscriptionGetLocalJournalLatestParams.none()
    ): HttpResponse = getLocalJournalLatest(params, RequestOptions.none())

    /** @see getLocalJournalLatest */
    @MustBeClosed
    fun getLocalJournalLatest(requestOptions: RequestOptions): HttpResponse =
        getLocalJournalLatest(WebhookSubscriptionGetLocalJournalLatestParams.none(), requestOptions)

    @MustBeClosed
    fun getLocalJournalNextByOffset(offset: String): HttpResponse =
        getLocalJournalNextByOffset(
            offset,
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
        )

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        offset: String,
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
    ): HttpResponse = getLocalJournalNextByOffset(offset, params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(
        params: WebhookSubscriptionGetLocalJournalNextByOffsetParams
    ): HttpResponse = getLocalJournalNextByOffset(params, RequestOptions.none())

    /** @see getLocalJournalNextByOffset */
    @MustBeClosed
    fun getLocalJournalNextByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
        getLocalJournalNextByOffset(
            offset,
            WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
            requestOptions,
        )

    fun getLocalJournalStatus(statusId: String): SnapshotStatusResponse =
        getLocalJournalStatus(statusId, WebhookSubscriptionGetLocalJournalStatusParams.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetLocalJournalStatusParams =
            WebhookSubscriptionGetLocalJournalStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse =
        getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        params: WebhookSubscriptionGetLocalJournalStatusParams =
            WebhookSubscriptionGetLocalJournalStatusParams.none(),
    ): SnapshotStatusResponse = getLocalJournalStatus(statusId, params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        params: WebhookSubscriptionGetLocalJournalStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotStatusResponse

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        params: WebhookSubscriptionGetLocalJournalStatusParams
    ): SnapshotStatusResponse = getLocalJournalStatus(params, RequestOptions.none())

    /** @see getLocalJournalStatus */
    fun getLocalJournalStatus(
        statusId: String,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        getLocalJournalStatus(
            statusId,
            WebhookSubscriptionGetLocalJournalStatusParams.none(),
            requestOptions,
        )

    /**
     * Retrieve the webhook settings for the specified app, including the webhook’s target URL,
     * throttle configuration, and create/update date.
     */
    fun getSettings(appId: Int): SettingsResponse =
        getSettings(appId, WebhookSubscriptionGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookSubscriptionGetSettingsParams = WebhookSubscriptionGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: WebhookSubscriptionGetSettingsParams = WebhookSubscriptionGetSettingsParams.none(),
    ): SettingsResponse = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: WebhookSubscriptionGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** @see getSettings */
    fun getSettings(params: WebhookSubscriptionGetSettingsParams): SettingsResponse =
        getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(appId: Int, requestOptions: RequestOptions): SettingsResponse =
        getSettings(appId, WebhookSubscriptionGetSettingsParams.none(), requestOptions)

    /** Retrieve a specific event subscription by ID. */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionGetSubscriptionParams,
    ): SubscriptionResponse = getSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        getSubscription(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see getSubscription */
    fun getSubscription(params: WebhookSubscriptionGetSubscriptionParams): SubscriptionResponse =
        getSubscription(params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        params: WebhookSubscriptionGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    fun getSubscriptionFilter(filterId: Long): FilterResponse =
        getSubscriptionFilter(filterId, WebhookSubscriptionGetSubscriptionFilterParams.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionGetSubscriptionFilterParams =
            WebhookSubscriptionGetSubscriptionFilterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterResponse =
        getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        filterId: Long,
        params: WebhookSubscriptionGetSubscriptionFilterParams =
            WebhookSubscriptionGetSubscriptionFilterParams.none(),
    ): FilterResponse = getSubscriptionFilter(filterId, params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        params: WebhookSubscriptionGetSubscriptionFilterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterResponse

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(
        params: WebhookSubscriptionGetSubscriptionFilterParams
    ): FilterResponse = getSubscriptionFilter(params, RequestOptions.none())

    /** @see getSubscriptionFilter */
    fun getSubscriptionFilter(filterId: Long, requestOptions: RequestOptions): FilterResponse =
        getSubscriptionFilter(
            filterId,
            WebhookSubscriptionGetSubscriptionFilterParams.none(),
            requestOptions,
        )

    fun getSubscriptionFilterForSubscription(subscriptionId: Long): List<FilterResponse> =
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
    ): List<FilterResponse> =
        getSubscriptionFilterForSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams =
            WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
    ): List<FilterResponse> =
        getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse>

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams
    ): List<FilterResponse> = getSubscriptionFilterForSubscription(params, RequestOptions.none())

    /** @see getSubscriptionFilterForSubscription */
    fun getSubscriptionFilterForSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): List<FilterResponse> =
        getSubscriptionFilterForSubscription(
            subscriptionId,
            WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
            requestOptions,
        )

    fun listJournalSubscriptions(): CollectionResponseSubscriptionResponseNoPaging =
        listJournalSubscriptions(WebhookSubscriptionListJournalSubscriptionsParams.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookSubscriptionListJournalSubscriptionsParams =
            WebhookSubscriptionListJournalSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseSubscriptionResponseNoPaging

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        params: WebhookSubscriptionListJournalSubscriptionsParams =
            WebhookSubscriptionListJournalSubscriptionsParams.none()
    ): CollectionResponseSubscriptionResponseNoPaging =
        listJournalSubscriptions(params, RequestOptions.none())

    /** @see listJournalSubscriptions */
    fun listJournalSubscriptions(
        requestOptions: RequestOptions
    ): CollectionResponseSubscriptionResponseNoPaging =
        listJournalSubscriptions(
            WebhookSubscriptionListJournalSubscriptionsParams.none(),
            requestOptions,
        )

    /** Retrieve event subscriptions for the specified app. */
    fun listSubscriptions(appId: Int): SubscriptionListResponse =
        listSubscriptions(appId, WebhookSubscriptionListSubscriptionsParams.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookSubscriptionListSubscriptionsParams =
            WebhookSubscriptionListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse =
        listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: WebhookSubscriptionListSubscriptionsParams =
            WebhookSubscriptionListSubscriptionsParams.none(),
    ): SubscriptionListResponse = listSubscriptions(appId, params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: WebhookSubscriptionListSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: WebhookSubscriptionListSubscriptionsParams
    ): SubscriptionListResponse = listSubscriptions(params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(appId: Int, requestOptions: RequestOptions): SubscriptionListResponse =
        listSubscriptions(appId, WebhookSubscriptionListSubscriptionsParams.none(), requestOptions)

    /** Update webhook settings for the specified app. */
    fun updateSettings(
        appId: Int,
        params: WebhookSubscriptionUpdateSettingsParams,
    ): SettingsResponse = updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: WebhookSubscriptionUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(params: WebhookSubscriptionUpdateSettingsParams): SettingsResponse =
        updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: WebhookSubscriptionUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** Update an existing event subscription by ID. */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionUpdateSubscriptionParams,
    ): SubscriptionResponse = updateSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        subscriptionId: Int,
        params: WebhookSubscriptionUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        updateSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateSubscription */
    fun updateSubscription(
        params: WebhookSubscriptionUpdateSubscriptionParams
    ): SubscriptionResponse = updateSubscription(params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        params: WebhookSubscriptionUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /**
     * A view of [WebhookSubscriptionService] that provides access to raw HTTP responses for each
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
        ): WebhookSubscriptionService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [WebhookSubscriptionService.createCrmSnapshot].
         */
        @MustBeClosed
        fun createCrmSnapshot(
            params: WebhookSubscriptionCreateCrmSnapshotParams
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshot(params, RequestOptions.none())

        /** @see createCrmSnapshot */
        @MustBeClosed
        fun createCrmSnapshot(
            params: WebhookSubscriptionCreateCrmSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse>

        /** @see createCrmSnapshot */
        @MustBeClosed
        fun createCrmSnapshot(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshot(
                WebhookSubscriptionCreateCrmSnapshotParams.builder()
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
         * otherwise the same as [WebhookSubscriptionService.createJournalSubscription].
         */
        @MustBeClosed
        fun createJournalSubscription(
            params: WebhookSubscriptionCreateJournalSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(params, RequestOptions.none())

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            params: WebhookSubscriptionCreateJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1>

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(
                WebhookSubscriptionCreateJournalSubscriptionParams.builder()
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
         * otherwise the same as [WebhookSubscriptionService.createSubscription].
         */
        @MustBeClosed
        fun createSubscription(
            appId: Int,
            params: WebhookSubscriptionCreateSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            createSubscription(appId, params, RequestOptions.none())

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            appId: Int,
            params: WebhookSubscriptionCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            params: WebhookSubscriptionCreateSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = createSubscription(params, RequestOptions.none())

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            params: WebhookSubscriptionCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03/filters`,
         * but is otherwise the same as [WebhookSubscriptionService.createSubscriptionFilter].
         */
        @MustBeClosed
        fun createSubscriptionFilter(
            params: WebhookSubscriptionCreateSubscriptionFilterParams
        ): HttpResponseFor<FilterCreateResponse> =
            createSubscriptionFilter(params, RequestOptions.none())

        /** @see createSubscriptionFilter */
        @MustBeClosed
        fun createSubscriptionFilter(
            params: WebhookSubscriptionCreateSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterCreateResponse>

        /** @see createSubscriptionFilter */
        @MustBeClosed
        fun createSubscriptionFilter(
            filterCreateRequest: FilterCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterCreateResponse> =
            createSubscriptionFilter(
                WebhookSubscriptionCreateSubscriptionFilterParams.builder()
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
         * [WebhookSubscriptionService.deleteJournalSubscription].
         */
        @MustBeClosed
        fun deleteJournalSubscription(subscriptionId: Long): HttpResponse =
            deleteJournalSubscription(
                subscriptionId,
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
            )

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            subscriptionId: Long,
            params: WebhookSubscriptionDeleteJournalSubscriptionParams =
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
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
            params: WebhookSubscriptionDeleteJournalSubscriptionParams =
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
        ): HttpResponse = deleteJournalSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            params: WebhookSubscriptionDeleteJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            params: WebhookSubscriptionDeleteJournalSubscriptionParams
        ): HttpResponse = deleteJournalSubscription(params, RequestOptions.none())

        /** @see deleteJournalSubscription */
        @MustBeClosed
        fun deleteJournalSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponse =
            deleteJournalSubscription(
                subscriptionId,
                WebhookSubscriptionDeleteJournalSubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [WebhookSubscriptionService.deletePortalSubscriptions].
         */
        @MustBeClosed
        fun deletePortalSubscriptions(portalId: Long): HttpResponse =
            deletePortalSubscriptions(
                portalId,
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
            )

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookSubscriptionDeletePortalSubscriptionsParams =
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deletePortalSubscriptions(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            portalId: Long,
            params: WebhookSubscriptionDeletePortalSubscriptionsParams =
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
        ): HttpResponse = deletePortalSubscriptions(portalId, params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            params: WebhookSubscriptionDeletePortalSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            params: WebhookSubscriptionDeletePortalSubscriptionsParams
        ): HttpResponse = deletePortalSubscriptions(params, RequestOptions.none())

        /** @see deletePortalSubscriptions */
        @MustBeClosed
        fun deletePortalSubscriptions(
            portalId: Long,
            requestOptions: RequestOptions,
        ): HttpResponse =
            deletePortalSubscriptions(
                portalId,
                WebhookSubscriptionDeletePortalSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookSubscriptionService.deleteSettings].
         */
        @MustBeClosed
        fun deleteSettings(appId: Int): HttpResponse =
            deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: WebhookSubscriptionDeleteSettingsParams =
                WebhookSubscriptionDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: WebhookSubscriptionDeleteSettingsParams =
                WebhookSubscriptionDeleteSettingsParams.none(),
        ): HttpResponse = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            params: WebhookSubscriptionDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(params: WebhookSubscriptionDeleteSettingsParams): HttpResponse =
            deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(appId: Int, requestOptions: RequestOptions): HttpResponse =
            deleteSettings(appId, WebhookSubscriptionDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookSubscriptionService.deleteSubscription].
         */
        @MustBeClosed
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionDeleteSubscriptionParams,
        ): HttpResponse = deleteSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(params: WebhookSubscriptionDeleteSubscriptionParams): HttpResponse =
            deleteSubscription(params, RequestOptions.none())

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(
            params: WebhookSubscriptionDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookSubscriptionService.deleteSubscriptionFilter].
         */
        @MustBeClosed
        fun deleteSubscriptionFilter(filterId: Long): HttpResponse =
            deleteSubscriptionFilter(
                filterId,
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
            )

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionDeleteSubscriptionFilterParams =
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionDeleteSubscriptionFilterParams =
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
        ): HttpResponse = deleteSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(
            params: WebhookSubscriptionDeleteSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(
            params: WebhookSubscriptionDeleteSubscriptionFilterParams
        ): HttpResponse = deleteSubscriptionFilter(params, RequestOptions.none())

        /** @see deleteSubscriptionFilter */
        @MustBeClosed
        fun deleteSubscriptionFilter(filterId: Long, requestOptions: RequestOptions): HttpResponse =
            deleteSubscriptionFilter(
                filterId,
                WebhookSubscriptionDeleteSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [WebhookSubscriptionService.getJournalEarliest].
         */
        @MustBeClosed
        fun getJournalEarliest(): HttpResponse =
            getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none())

        /** @see getJournalEarliest */
        @MustBeClosed
        fun getJournalEarliest(
            params: WebhookSubscriptionGetJournalEarliestParams =
                WebhookSubscriptionGetJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getJournalEarliest */
        @MustBeClosed
        fun getJournalEarliest(
            params: WebhookSubscriptionGetJournalEarliestParams =
                WebhookSubscriptionGetJournalEarliestParams.none()
        ): HttpResponse = getJournalEarliest(params, RequestOptions.none())

        /** @see getJournalEarliest */
        @MustBeClosed
        fun getJournalEarliest(requestOptions: RequestOptions): HttpResponse =
            getJournalEarliest(WebhookSubscriptionGetJournalEarliestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookSubscriptionService.getJournalLatest].
         */
        @MustBeClosed
        fun getJournalLatest(): HttpResponse =
            getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none())

        /** @see getJournalLatest */
        @MustBeClosed
        fun getJournalLatest(
            params: WebhookSubscriptionGetJournalLatestParams =
                WebhookSubscriptionGetJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getJournalLatest */
        @MustBeClosed
        fun getJournalLatest(
            params: WebhookSubscriptionGetJournalLatestParams =
                WebhookSubscriptionGetJournalLatestParams.none()
        ): HttpResponse = getJournalLatest(params, RequestOptions.none())

        /** @see getJournalLatest */
        @MustBeClosed
        fun getJournalLatest(requestOptions: RequestOptions): HttpResponse =
            getJournalLatest(WebhookSubscriptionGetJournalLatestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/offset/{offset}/next`, but is otherwise the same as
         * [WebhookSubscriptionService.getJournalNextByOffset].
         */
        @MustBeClosed
        fun getJournalNextByOffset(offset: String): HttpResponse =
            getJournalNextByOffset(offset, WebhookSubscriptionGetJournalNextByOffsetParams.none())

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetJournalNextByOffsetParams =
                WebhookSubscriptionGetJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetJournalNextByOffsetParams =
                WebhookSubscriptionGetJournalNextByOffsetParams.none(),
        ): HttpResponse = getJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(
            params: WebhookSubscriptionGetJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(
            params: WebhookSubscriptionGetJournalNextByOffsetParams
        ): HttpResponse = getJournalNextByOffset(params, RequestOptions.none())

        /** @see getJournalNextByOffset */
        @MustBeClosed
        fun getJournalNextByOffset(offset: String, requestOptions: RequestOptions): HttpResponse =
            getJournalNextByOffset(
                offset,
                WebhookSubscriptionGetJournalNextByOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookSubscriptionService.getJournalStatus].
         */
        @MustBeClosed
        fun getJournalStatus(statusId: String): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(statusId, WebhookSubscriptionGetJournalStatusParams.none())

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetJournalStatusParams =
                WebhookSubscriptionGetJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetJournalStatusParams =
                WebhookSubscriptionGetJournalStatusParams.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(statusId, params, RequestOptions.none())

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            params: WebhookSubscriptionGetJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse>

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            params: WebhookSubscriptionGetJournalStatusParams
        ): HttpResponseFor<SnapshotStatusResponse> = getJournalStatus(params, RequestOptions.none())

        /** @see getJournalStatus */
        @MustBeClosed
        fun getJournalStatus(
            statusId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> =
            getJournalStatus(
                statusId,
                WebhookSubscriptionGetJournalStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookSubscriptionService.getLocalJournalEarliest].
         */
        @MustBeClosed
        fun getLocalJournalEarliest(): HttpResponse =
            getLocalJournalEarliest(WebhookSubscriptionGetLocalJournalEarliestParams.none())

        /** @see getLocalJournalEarliest */
        @MustBeClosed
        fun getLocalJournalEarliest(
            params: WebhookSubscriptionGetLocalJournalEarliestParams =
                WebhookSubscriptionGetLocalJournalEarliestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLocalJournalEarliest */
        @MustBeClosed
        fun getLocalJournalEarliest(
            params: WebhookSubscriptionGetLocalJournalEarliestParams =
                WebhookSubscriptionGetLocalJournalEarliestParams.none()
        ): HttpResponse = getLocalJournalEarliest(params, RequestOptions.none())

        /** @see getLocalJournalEarliest */
        @MustBeClosed
        fun getLocalJournalEarliest(requestOptions: RequestOptions): HttpResponse =
            getLocalJournalEarliest(
                WebhookSubscriptionGetLocalJournalEarliestParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookSubscriptionService.getLocalJournalLatest].
         */
        @MustBeClosed
        fun getLocalJournalLatest(): HttpResponse =
            getLocalJournalLatest(WebhookSubscriptionGetLocalJournalLatestParams.none())

        /** @see getLocalJournalLatest */
        @MustBeClosed
        fun getLocalJournalLatest(
            params: WebhookSubscriptionGetLocalJournalLatestParams =
                WebhookSubscriptionGetLocalJournalLatestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLocalJournalLatest */
        @MustBeClosed
        fun getLocalJournalLatest(
            params: WebhookSubscriptionGetLocalJournalLatestParams =
                WebhookSubscriptionGetLocalJournalLatestParams.none()
        ): HttpResponse = getLocalJournalLatest(params, RequestOptions.none())

        /** @see getLocalJournalLatest */
        @MustBeClosed
        fun getLocalJournalLatest(requestOptions: RequestOptions): HttpResponse =
            getLocalJournalLatest(
                WebhookSubscriptionGetLocalJournalLatestParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookSubscriptionService.getLocalJournalNextByOffset].
         */
        @MustBeClosed
        fun getLocalJournalNextByOffset(offset: String): HttpResponse =
            getLocalJournalNextByOffset(
                offset,
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
            )

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getLocalJournalNextByOffset(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            offset: String,
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams =
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
        ): HttpResponse = getLocalJournalNextByOffset(offset, params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            params: WebhookSubscriptionGetLocalJournalNextByOffsetParams
        ): HttpResponse = getLocalJournalNextByOffset(params, RequestOptions.none())

        /** @see getLocalJournalNextByOffset */
        @MustBeClosed
        fun getLocalJournalNextByOffset(
            offset: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            getLocalJournalNextByOffset(
                offset,
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/status/{statusId}`, but is otherwise the same as
         * [WebhookSubscriptionService.getLocalJournalStatus].
         */
        @MustBeClosed
        fun getLocalJournalStatus(statusId: String): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(statusId, WebhookSubscriptionGetLocalJournalStatusParams.none())

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetLocalJournalStatusParams =
                WebhookSubscriptionGetLocalJournalStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(params.toBuilder().statusId(statusId).build(), requestOptions)

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            statusId: String,
            params: WebhookSubscriptionGetLocalJournalStatusParams =
                WebhookSubscriptionGetLocalJournalStatusParams.none(),
        ): HttpResponseFor<SnapshotStatusResponse> =
            getLocalJournalStatus(statusId, params, RequestOptions.none())

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            params: WebhookSubscriptionGetLocalJournalStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotStatusResponse>

        /** @see getLocalJournalStatus */
        @MustBeClosed
        fun getLocalJournalStatus(
            params: WebhookSubscriptionGetLocalJournalStatusParams
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
                WebhookSubscriptionGetLocalJournalStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookSubscriptionService.getSettings].
         */
        @MustBeClosed
        fun getSettings(appId: Int): HttpResponseFor<SettingsResponse> =
            getSettings(appId, WebhookSubscriptionGetSettingsParams.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: WebhookSubscriptionGetSettingsParams =
                WebhookSubscriptionGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: WebhookSubscriptionGetSettingsParams =
                WebhookSubscriptionGetSettingsParams.none(),
        ): HttpResponseFor<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            params: WebhookSubscriptionGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            params: WebhookSubscriptionGetSettingsParams
        ): HttpResponseFor<SettingsResponse> = getSettings(params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> =
            getSettings(appId, WebhookSubscriptionGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookSubscriptionService.getSubscription].
         */
        @MustBeClosed
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionGetSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            getSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            getSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            params: WebhookSubscriptionGetSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = getSubscription(params, RequestOptions.none())

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            params: WebhookSubscriptionGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [WebhookSubscriptionService.getSubscriptionFilter].
         */
        @MustBeClosed
        fun getSubscriptionFilter(filterId: Long): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(filterId, WebhookSubscriptionGetSubscriptionFilterParams.none())

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionGetSubscriptionFilterParams =
                WebhookSubscriptionGetSubscriptionFilterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            filterId: Long,
            params: WebhookSubscriptionGetSubscriptionFilterParams =
                WebhookSubscriptionGetSubscriptionFilterParams.none(),
        ): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(filterId, params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            params: WebhookSubscriptionGetSubscriptionFilterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterResponse>

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            params: WebhookSubscriptionGetSubscriptionFilterParams
        ): HttpResponseFor<FilterResponse> = getSubscriptionFilter(params, RequestOptions.none())

        /** @see getSubscriptionFilter */
        @MustBeClosed
        fun getSubscriptionFilter(
            filterId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FilterResponse> =
            getSubscriptionFilter(
                filterId,
                WebhookSubscriptionGetSubscriptionFilterParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [WebhookSubscriptionService.getSubscriptionFilterForSubscription].
         */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilterForSubscription(
                subscriptionId,
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
            )

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            subscriptionId: Long,
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams =
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
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
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams =
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            getSubscriptionFilterForSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>>

        /** @see getSubscriptionFilterForSubscription */
        @MustBeClosed
        fun getSubscriptionFilterForSubscription(
            params: WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams
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
                WebhookSubscriptionGetSubscriptionFilterForSubscriptionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [WebhookSubscriptionService.listJournalSubscriptions].
         */
        @MustBeClosed
        fun listJournalSubscriptions():
            HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging> =
            listJournalSubscriptions(WebhookSubscriptionListJournalSubscriptionsParams.none())

        /** @see listJournalSubscriptions */
        @MustBeClosed
        fun listJournalSubscriptions(
            params: WebhookSubscriptionListJournalSubscriptionsParams =
                WebhookSubscriptionListJournalSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging>

        /** @see listJournalSubscriptions */
        @MustBeClosed
        fun listJournalSubscriptions(
            params: WebhookSubscriptionListJournalSubscriptionsParams =
                WebhookSubscriptionListJournalSubscriptionsParams.none()
        ): HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging> =
            listJournalSubscriptions(params, RequestOptions.none())

        /** @see listJournalSubscriptions */
        @MustBeClosed
        fun listJournalSubscriptions(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseSubscriptionResponseNoPaging> =
            listJournalSubscriptions(
                WebhookSubscriptionListJournalSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookSubscriptionService.listSubscriptions].
         */
        @MustBeClosed
        fun listSubscriptions(appId: Int): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, WebhookSubscriptionListSubscriptionsParams.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            params: WebhookSubscriptionListSubscriptionsParams =
                WebhookSubscriptionListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            params: WebhookSubscriptionListSubscriptionsParams =
                WebhookSubscriptionListSubscriptionsParams.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, params, RequestOptions.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            params: WebhookSubscriptionListSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            params: WebhookSubscriptionListSubscriptionsParams
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(params, RequestOptions.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(
                appId,
                WebhookSubscriptionListSubscriptionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put /webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [WebhookSubscriptionService.updateSettings].
         */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: WebhookSubscriptionUpdateSettingsParams,
        ): HttpResponseFor<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: WebhookSubscriptionUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: WebhookSubscriptionUpdateSettingsParams
        ): HttpResponseFor<SettingsResponse> = updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: WebhookSubscriptionUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookSubscriptionService.updateSubscription].
         */
        @MustBeClosed
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionUpdateSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            updateSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            subscriptionId: Int,
            params: WebhookSubscriptionUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            updateSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            params: WebhookSubscriptionUpdateSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = updateSubscription(params, RequestOptions.none())

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            params: WebhookSubscriptionUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>
    }
}
