// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot.sdk.models.webhooks.GdprPrivacyDeletionSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.ListMembershipSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.SettingsResponse
import com.hubspot.sdk.models.webhooks.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooks.SubscriptionListResponse
import com.hubspot.sdk.models.webhooks.SubscriptionResponse
import com.hubspot.sdk.models.webhooks.SubscriptionResponse1
import com.hubspot.sdk.models.webhooks.SubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.WebhookCreateBatchEventSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookCreateCrmSnapshotsParams
import com.hubspot.sdk.models.webhooks.WebhookCreateEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookCreateJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookCreateSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteJournalSubscriptionForPortalParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchByRequestParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchFromOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalStatusParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchByRequestParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchFromOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalStatusParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextJournalEntriesParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextLocalJournalEntriesParams
import com.hubspot.sdk.models.webhooks.WebhookGetSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookGetSubscriptionFilterParams
import com.hubspot.sdk.models.webhooks.WebhookListEventSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookListJournalSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookListSubscriptionFiltersParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateSettingsParams
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

    /** Batch create event subscriptions for the specified app. */
    fun createBatchEventSubscriptions(
        appId: Int,
        params: WebhookCreateBatchEventSubscriptionsParams,
    ): BatchResponseSubscriptionResponse =
        createBatchEventSubscriptions(appId, params, RequestOptions.none())

    /** @see createBatchEventSubscriptions */
    fun createBatchEventSubscriptions(
        appId: Int,
        params: WebhookCreateBatchEventSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse =
        createBatchEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createBatchEventSubscriptions */
    fun createBatchEventSubscriptions(
        params: WebhookCreateBatchEventSubscriptionsParams
    ): BatchResponseSubscriptionResponse =
        createBatchEventSubscriptions(params, RequestOptions.none())

    /** @see createBatchEventSubscriptions */
    fun createBatchEventSubscriptions(
        params: WebhookCreateBatchEventSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse

    /**
     * Create a batch of CRM object snapshots for a specified portal. This endpoint allows you to
     * capture the current state of CRM objects by submitting a batch request with the necessary
     * object details. It is useful for tracking changes or maintaining historical records of CRM
     * data.
     */
    fun createCrmSnapshots(
        params: WebhookCreateCrmSnapshotsParams
    ): CrmObjectSnapshotBatchResponse = createCrmSnapshots(params, RequestOptions.none())

    /** @see createCrmSnapshots */
    fun createCrmSnapshots(
        params: WebhookCreateCrmSnapshotsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse

    /** @see createCrmSnapshots */
    fun createCrmSnapshots(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse =
        createCrmSnapshots(
            WebhookCreateCrmSnapshotsParams.builder()
                .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see createCrmSnapshots */
    fun createCrmSnapshots(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
    ): CrmObjectSnapshotBatchResponse =
        createCrmSnapshots(crmObjectSnapshotBatchRequest, RequestOptions.none())

    /** Create new event subscription for the specified app. */
    fun createEventSubscription(
        appId: Int,
        params: WebhookCreateEventSubscriptionParams,
    ): SubscriptionResponse = createEventSubscription(appId, params, RequestOptions.none())

    /** @see createEventSubscription */
    fun createEventSubscription(
        appId: Int,
        params: WebhookCreateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        createEventSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createEventSubscription */
    fun createEventSubscription(
        params: WebhookCreateEventSubscriptionParams
    ): SubscriptionResponse = createEventSubscription(params, RequestOptions.none())

    /** @see createEventSubscription */
    fun createEventSubscription(
        params: WebhookCreateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /**
     * Create a new subscription in the webhooks journal for the specified version. This endpoint
     * allows you to define the subscription details, including actions and object types, to manage
     * webhook events effectively. It requires a valid request body with the subscription details.
     */
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

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
    ): SubscriptionResponse1 = createJournalSubscription(gdprPrivacyDeletion, RequestOptions.none())

    /**
     * Create a new filter for a webhook subscription in the HubSpot account. This endpoint allows
     * you to define conditions that determine when a webhook event should be triggered for a
     * specific subscription. The request body must include the subscription ID and the filter
     * details.
     */
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

    /** Delete an existing event subscription by ID. */
    fun deleteEventSubscription(subscriptionId: Int, params: WebhookDeleteEventSubscriptionParams) =
        deleteEventSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteEventSubscription */
    fun deleteEventSubscription(
        subscriptionId: Int,
        params: WebhookDeleteEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteEventSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteEventSubscription */
    fun deleteEventSubscription(params: WebhookDeleteEventSubscriptionParams) =
        deleteEventSubscription(params, RequestOptions.none())

    /** @see deleteEventSubscription */
    fun deleteEventSubscription(
        params: WebhookDeleteEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Delete a specific webhook journal subscription using its unique identifier. This operation is
     * useful for managing and cleaning up subscriptions that are no longer needed.
     */
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

    /**
     * Delete a webhook journal subscription for a specific portal. This operation removes the
     * subscription associated with the given portalId, effectively stopping any webhook events from
     * being sent to the portal.
     */
    fun deleteJournalSubscriptionForPortal(portalId: Long) =
        deleteJournalSubscriptionForPortal(
            portalId,
            WebhookDeleteJournalSubscriptionForPortalParams.none(),
        )

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        portalId: Long,
        params: WebhookDeleteJournalSubscriptionForPortalParams =
            WebhookDeleteJournalSubscriptionForPortalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteJournalSubscriptionForPortal(
            params.toBuilder().portalId(portalId).build(),
            requestOptions,
        )

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        portalId: Long,
        params: WebhookDeleteJournalSubscriptionForPortalParams =
            WebhookDeleteJournalSubscriptionForPortalParams.none(),
    ) = deleteJournalSubscriptionForPortal(portalId, params, RequestOptions.none())

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        params: WebhookDeleteJournalSubscriptionForPortalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        params: WebhookDeleteJournalSubscriptionForPortalParams
    ) = deleteJournalSubscriptionForPortal(params, RequestOptions.none())

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(portalId: Long, requestOptions: RequestOptions) =
        deleteJournalSubscriptionForPortal(
            portalId,
            WebhookDeleteJournalSubscriptionForPortalParams.none(),
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

    /**
     * Remove a specific filter from your webhook journal subscriptions. This operation is useful
     * when you need to clean up or modify the filters applied to your webhook subscriptions. The
     * filter identified by the filterId will be permanently deleted.
     */
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

    /**
     * Retrieve the earliest batch of webhook journal entries up to the specified count. This
     * endpoint is useful for fetching historical webhook data in batches, allowing you to process
     * or analyze them as needed.
     */
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

    /**
     * Retrieve the earliest entry from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the initial entries in the journal, which can be helpful for
     * debugging or auditing purposes.
     */
    @MustBeClosed
    fun getEarliestJournalEntry(): HttpResponse =
        getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none())

    /** @see getEarliestJournalEntry */
    @MustBeClosed
    fun getEarliestJournalEntry(
        params: WebhookGetEarliestJournalEntryParams = WebhookGetEarliestJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getEarliestJournalEntry */
    @MustBeClosed
    fun getEarliestJournalEntry(
        params: WebhookGetEarliestJournalEntryParams = WebhookGetEarliestJournalEntryParams.none()
    ): HttpResponse = getEarliestJournalEntry(params, RequestOptions.none())

    /** @see getEarliestJournalEntry */
    @MustBeClosed
    fun getEarliestJournalEntry(requestOptions: RequestOptions): HttpResponse =
        getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none(), requestOptions)

    /**
     * Retrieve the earliest batch of webhook journal entries up to a specified count. This endpoint
     * is useful for accessing the oldest records available in the webhook journal, allowing you to
     * process or analyze historical webhook data.
     */
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

    /**
     * Retrieve the earliest entry from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the oldest available data in the journal, which can be used for
     * historical analysis or troubleshooting.
     */
    @MustBeClosed
    fun getEarliestLocalJournalEntry(): HttpResponse =
        getEarliestLocalJournalEntry(WebhookGetEarliestLocalJournalEntryParams.none())

    /** @see getEarliestLocalJournalEntry */
    @MustBeClosed
    fun getEarliestLocalJournalEntry(
        params: WebhookGetEarliestLocalJournalEntryParams =
            WebhookGetEarliestLocalJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getEarliestLocalJournalEntry */
    @MustBeClosed
    fun getEarliestLocalJournalEntry(
        params: WebhookGetEarliestLocalJournalEntryParams =
            WebhookGetEarliestLocalJournalEntryParams.none()
    ): HttpResponse = getEarliestLocalJournalEntry(params, RequestOptions.none())

    /** @see getEarliestLocalJournalEntry */
    @MustBeClosed
    fun getEarliestLocalJournalEntry(requestOptions: RequestOptions): HttpResponse =
        getEarliestLocalJournalEntry(
            WebhookGetEarliestLocalJournalEntryParams.none(),
            requestOptions,
        )

    /** Retrieve a specific event subscription by ID. */
    fun getEventSubscription(
        subscriptionId: Int,
        params: WebhookGetEventSubscriptionParams,
    ): SubscriptionResponse = getEventSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getEventSubscription */
    fun getEventSubscription(
        subscriptionId: Int,
        params: WebhookGetEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        getEventSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getEventSubscription */
    fun getEventSubscription(params: WebhookGetEventSubscriptionParams): SubscriptionResponse =
        getEventSubscription(params, RequestOptions.none())

    /** @see getEventSubscription */
    fun getEventSubscription(
        params: WebhookGetEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /**
     * Read a batch of webhook journal entries for the specified portal. This endpoint allows you to
     * retrieve detailed information about webhook events processed by your HubSpot account. It is
     * useful for auditing and tracking webhook activity.
     */
    fun getJournalBatchByRequest(
        params: WebhookGetJournalBatchByRequestParams
    ): BatchResponseJournalFetchResponse = getJournalBatchByRequest(params, RequestOptions.none())

    /** @see getJournalBatchByRequest */
    fun getJournalBatchByRequest(
        params: WebhookGetJournalBatchByRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getJournalBatchByRequest */
    fun getJournalBatchByRequest(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getJournalBatchByRequest(
            WebhookGetJournalBatchByRequestParams.builder()
                .batchInputString(batchInputString)
                .build(),
            requestOptions,
        )

    /** @see getJournalBatchByRequest */
    fun getJournalBatchByRequest(
        batchInputString: BatchInputString
    ): BatchResponseJournalFetchResponse =
        getJournalBatchByRequest(batchInputString, RequestOptions.none())

    /**
     * Retrieve a batch of webhook journal entries starting from a specified offset. This endpoint
     * allows you to specify the number of entries to retrieve, helping you manage and paginate
     * through large sets of webhook data efficiently.
     */
    fun getJournalBatchFromOffset(
        count: Int,
        params: WebhookGetJournalBatchFromOffsetParams,
    ): BatchResponseJournalFetchResponse =
        getJournalBatchFromOffset(count, params, RequestOptions.none())

    /** @see getJournalBatchFromOffset */
    fun getJournalBatchFromOffset(
        count: Int,
        params: WebhookGetJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getJournalBatchFromOffset */
    fun getJournalBatchFromOffset(
        params: WebhookGetJournalBatchFromOffsetParams
    ): BatchResponseJournalFetchResponse = getJournalBatchFromOffset(params, RequestOptions.none())

    /** @see getJournalBatchFromOffset */
    fun getJournalBatchFromOffset(
        params: WebhookGetJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint is useful for monitoring the progress or outcome of a webhook operation, providing
     * insights into whether it is pending, in progress, completed, failed, or expired.
     */
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

    /**
     * Retrieve details of a specific webhook journal subscription using its unique identifier. This
     * endpoint is useful for obtaining information about a particular subscription, such as its
     * actions, object types, and associated properties.
     */
    fun getJournalSubscription(subscriptionId: Long): SubscriptionResponse1 =
        getJournalSubscription(subscriptionId, WebhookGetJournalSubscriptionParams.none())

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        subscriptionId: Long,
        params: WebhookGetJournalSubscriptionParams = WebhookGetJournalSubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1 =
        getJournalSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        subscriptionId: Long,
        params: WebhookGetJournalSubscriptionParams = WebhookGetJournalSubscriptionParams.none(),
    ): SubscriptionResponse1 = getJournalSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        params: WebhookGetJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse1

    /** @see getJournalSubscription */
    fun getJournalSubscription(params: WebhookGetJournalSubscriptionParams): SubscriptionResponse1 =
        getJournalSubscription(params, RequestOptions.none())

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): SubscriptionResponse1 =
        getJournalSubscription(
            subscriptionId,
            WebhookGetJournalSubscriptionParams.none(),
            requestOptions,
        )

    /**
     * Retrieve the latest batch of webhook journal entries up to a specified count. This endpoint
     * is useful for fetching the most recent webhook events processed by your HubSpot account. The
     * response includes details about each event, and you can specify the number of entries to
     * retrieve.
     */
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

    /**
     * Retrieve the latest entry from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the most recent webhook data available in the journal.
     */
    @MustBeClosed
    fun getLatestJournalEntry(): HttpResponse =
        getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none())

    /** @see getLatestJournalEntry */
    @MustBeClosed
    fun getLatestJournalEntry(
        params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLatestJournalEntry */
    @MustBeClosed
    fun getLatestJournalEntry(
        params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none()
    ): HttpResponse = getLatestJournalEntry(params, RequestOptions.none())

    /** @see getLatestJournalEntry */
    @MustBeClosed
    fun getLatestJournalEntry(requestOptions: RequestOptions): HttpResponse =
        getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none(), requestOptions)

    /**
     * Retrieve the latest batch of webhook journal entries up to a specified count. This endpoint
     * is useful for fetching the most recent webhook events processed by the system. It requires
     * authentication and supports various security schemes.
     */
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

    /**
     * Retrieve the latest entries from the webhooks journal. This endpoint is useful for accessing
     * the most recent webhook data for analysis or troubleshooting. It supports filtering by the
     * installPortalId to narrow down results to a specific portal.
     */
    @MustBeClosed
    fun getLatestLocalJournalEntry(): HttpResponse =
        getLatestLocalJournalEntry(WebhookGetLatestLocalJournalEntryParams.none())

    /** @see getLatestLocalJournalEntry */
    @MustBeClosed
    fun getLatestLocalJournalEntry(
        params: WebhookGetLatestLocalJournalEntryParams =
            WebhookGetLatestLocalJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getLatestLocalJournalEntry */
    @MustBeClosed
    fun getLatestLocalJournalEntry(
        params: WebhookGetLatestLocalJournalEntryParams =
            WebhookGetLatestLocalJournalEntryParams.none()
    ): HttpResponse = getLatestLocalJournalEntry(params, RequestOptions.none())

    /** @see getLatestLocalJournalEntry */
    @MustBeClosed
    fun getLatestLocalJournalEntry(requestOptions: RequestOptions): HttpResponse =
        getLatestLocalJournalEntry(WebhookGetLatestLocalJournalEntryParams.none(), requestOptions)

    /**
     * Perform a batch read operation on the webhooks journal. This endpoint allows you to retrieve
     * a batch of journal entries by providing the necessary input data. It is useful for processing
     * large volumes of webhook data efficiently.
     */
    fun getLocalJournalBatchByRequest(
        params: WebhookGetLocalJournalBatchByRequestParams
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchByRequest(params, RequestOptions.none())

    /** @see getLocalJournalBatchByRequest */
    fun getLocalJournalBatchByRequest(
        params: WebhookGetLocalJournalBatchByRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /** @see getLocalJournalBatchByRequest */
    fun getLocalJournalBatchByRequest(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchByRequest(
            WebhookGetLocalJournalBatchByRequestParams.builder()
                .batchInputString(batchInputString)
                .build(),
            requestOptions,
        )

    /** @see getLocalJournalBatchByRequest */
    fun getLocalJournalBatchByRequest(
        batchInputString: BatchInputString
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchByRequest(batchInputString, RequestOptions.none())

    /**
     * Retrieve a batch of webhook journal entries starting from a specified offset. This endpoint
     * is useful for fetching sequential batches of data, allowing you to paginate through large
     * sets of webhook journal entries efficiently.
     */
    fun getLocalJournalBatchFromOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchFromOffsetParams,
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchFromOffset(count, params, RequestOptions.none())

    /** @see getLocalJournalBatchFromOffset */
    fun getLocalJournalBatchFromOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalJournalBatchFromOffset */
    fun getLocalJournalBatchFromOffset(
        params: WebhookGetLocalJournalBatchFromOffsetParams
    ): BatchResponseJournalFetchResponse =
        getLocalJournalBatchFromOffset(params, RequestOptions.none())

    /** @see getLocalJournalBatchFromOffset */
    fun getLocalJournalBatchFromOffset(
        params: WebhookGetLocalJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseJournalFetchResponse

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint is useful for checking the progress or result of a webhook operation, such as
     * whether it is pending, in progress, completed, failed, or expired.
     */
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
     * Retrieve the next set of webhook journal entries starting from a specified offset. This
     * endpoint is useful for paginating through webhook journal entries in a HubSpot account. It
     * allows you to continue fetching entries from where the last request left off, using the
     * offset parameter.
     */
    @MustBeClosed
    fun getNextJournalEntries(offset: String): HttpResponse =
        getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none())

    /** @see getNextJournalEntries */
    @MustBeClosed
    fun getNextJournalEntries(
        offset: String,
        params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getNextJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalEntries */
    @MustBeClosed
    fun getNextJournalEntries(
        offset: String,
        params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
    ): HttpResponse = getNextJournalEntries(offset, params, RequestOptions.none())

    /** @see getNextJournalEntries */
    @MustBeClosed
    fun getNextJournalEntries(
        params: WebhookGetNextJournalEntriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextJournalEntries */
    @MustBeClosed
    fun getNextJournalEntries(params: WebhookGetNextJournalEntriesParams): HttpResponse =
        getNextJournalEntries(params, RequestOptions.none())

    /** @see getNextJournalEntries */
    @MustBeClosed
    fun getNextJournalEntries(offset: String, requestOptions: RequestOptions): HttpResponse =
        getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none(), requestOptions)

    /**
     * Retrieve the next set of journal entries starting from a specified offset. This endpoint is
     * useful for paginating through webhook journal entries in a sequential manner. It requires
     * specifying the offset from which the next entries should be fetched.
     */
    @MustBeClosed
    fun getNextLocalJournalEntries(offset: String): HttpResponse =
        getNextLocalJournalEntries(offset, WebhookGetNextLocalJournalEntriesParams.none())

    /** @see getNextLocalJournalEntries */
    @MustBeClosed
    fun getNextLocalJournalEntries(
        offset: String,
        params: WebhookGetNextLocalJournalEntriesParams =
            WebhookGetNextLocalJournalEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getNextLocalJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextLocalJournalEntries */
    @MustBeClosed
    fun getNextLocalJournalEntries(
        offset: String,
        params: WebhookGetNextLocalJournalEntriesParams =
            WebhookGetNextLocalJournalEntriesParams.none(),
    ): HttpResponse = getNextLocalJournalEntries(offset, params, RequestOptions.none())

    /** @see getNextLocalJournalEntries */
    @MustBeClosed
    fun getNextLocalJournalEntries(
        params: WebhookGetNextLocalJournalEntriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getNextLocalJournalEntries */
    @MustBeClosed
    fun getNextLocalJournalEntries(params: WebhookGetNextLocalJournalEntriesParams): HttpResponse =
        getNextLocalJournalEntries(params, RequestOptions.none())

    /** @see getNextLocalJournalEntries */
    @MustBeClosed
    fun getNextLocalJournalEntries(offset: String, requestOptions: RequestOptions): HttpResponse =
        getNextLocalJournalEntries(
            offset,
            WebhookGetNextLocalJournalEntriesParams.none(),
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

    /**
     * Retrieve a specific filter associated with a webhook journal subscription. This endpoint
     * allows you to access detailed information about the filter identified by the filterId path
     * parameter. It is useful for managing and reviewing filter configurations within your webhook
     * subscriptions.
     */
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

    /** Retrieve event subscriptions for the specified app. */
    fun listEventSubscriptions(appId: Int): SubscriptionListResponse =
        listEventSubscriptions(appId, WebhookListEventSubscriptionsParams.none())

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        appId: Int,
        params: WebhookListEventSubscriptionsParams = WebhookListEventSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse =
        listEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        appId: Int,
        params: WebhookListEventSubscriptionsParams = WebhookListEventSubscriptionsParams.none(),
    ): SubscriptionListResponse = listEventSubscriptions(appId, params, RequestOptions.none())

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        params: WebhookListEventSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        params: WebhookListEventSubscriptionsParams
    ): SubscriptionListResponse = listEventSubscriptions(params, RequestOptions.none())

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        appId: Int,
        requestOptions: RequestOptions,
    ): SubscriptionListResponse =
        listEventSubscriptions(appId, WebhookListEventSubscriptionsParams.none(), requestOptions)

    /**
     * Retrieve a list of webhook journal subscriptions for the specified version. This endpoint
     * allows you to view all active subscriptions without pagination. It is useful for managing and
     * auditing webhook subscriptions in your HubSpot account.
     */
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

    /**
     * Retrieve the filters associated with a specific webhook subscription. This endpoint is useful
     * for obtaining detailed information about the filters applied to a subscription, which can
     * help in managing and understanding the data flow through your webhook integrations.
     */
    fun listSubscriptionFilters(subscriptionId: Long): List<FilterResponse> =
        listSubscriptionFilters(subscriptionId, WebhookListSubscriptionFiltersParams.none())

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookListSubscriptionFiltersParams = WebhookListSubscriptionFiltersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse> =
        listSubscriptionFilters(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookListSubscriptionFiltersParams = WebhookListSubscriptionFiltersParams.none(),
    ): List<FilterResponse> = listSubscriptionFilters(subscriptionId, params, RequestOptions.none())

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        params: WebhookListSubscriptionFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterResponse>

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        params: WebhookListSubscriptionFiltersParams
    ): List<FilterResponse> = listSubscriptionFilters(params, RequestOptions.none())

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): List<FilterResponse> =
        listSubscriptionFilters(
            subscriptionId,
            WebhookListSubscriptionFiltersParams.none(),
            requestOptions,
        )

    /** Update an existing event subscription by ID. */
    fun updateEventSubscription(
        subscriptionId: Int,
        params: WebhookUpdateEventSubscriptionParams,
    ): SubscriptionResponse = updateEventSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateEventSubscription */
    fun updateEventSubscription(
        subscriptionId: Int,
        params: WebhookUpdateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        updateEventSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateEventSubscription */
    fun updateEventSubscription(
        params: WebhookUpdateEventSubscriptionParams
    ): SubscriptionResponse = updateEventSubscription(params, RequestOptions.none())

    /** @see updateEventSubscription */
    fun updateEventSubscription(
        params: WebhookUpdateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

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

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [WebhookService.createBatchEventSubscriptions].
         */
        @MustBeClosed
        fun createBatchEventSubscriptions(
            appId: Int,
            params: WebhookCreateBatchEventSubscriptionsParams,
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            createBatchEventSubscriptions(appId, params, RequestOptions.none())

        /** @see createBatchEventSubscriptions */
        @MustBeClosed
        fun createBatchEventSubscriptions(
            appId: Int,
            params: WebhookCreateBatchEventSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            createBatchEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createBatchEventSubscriptions */
        @MustBeClosed
        fun createBatchEventSubscriptions(
            params: WebhookCreateBatchEventSubscriptionsParams
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            createBatchEventSubscriptions(params, RequestOptions.none())

        /** @see createBatchEventSubscriptions */
        @MustBeClosed
        fun createBatchEventSubscriptions(
            params: WebhookCreateBatchEventSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [WebhookService.createCrmSnapshots].
         */
        @MustBeClosed
        fun createCrmSnapshots(
            params: WebhookCreateCrmSnapshotsParams
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshots(params, RequestOptions.none())

        /** @see createCrmSnapshots */
        @MustBeClosed
        fun createCrmSnapshots(
            params: WebhookCreateCrmSnapshotsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse>

        /** @see createCrmSnapshots */
        @MustBeClosed
        fun createCrmSnapshots(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshots(
                WebhookCreateCrmSnapshotsParams.builder()
                    .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                    .build(),
                requestOptions,
            )

        /** @see createCrmSnapshots */
        @MustBeClosed
        fun createCrmSnapshots(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            createCrmSnapshots(crmObjectSnapshotBatchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookService.createEventSubscription].
         */
        @MustBeClosed
        fun createEventSubscription(
            appId: Int,
            params: WebhookCreateEventSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            createEventSubscription(appId, params, RequestOptions.none())

        /** @see createEventSubscription */
        @MustBeClosed
        fun createEventSubscription(
            appId: Int,
            params: WebhookCreateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            createEventSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createEventSubscription */
        @MustBeClosed
        fun createEventSubscription(
            params: WebhookCreateEventSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> =
            createEventSubscription(params, RequestOptions.none())

        /** @see createEventSubscription */
        @MustBeClosed
        fun createEventSubscription(
            params: WebhookCreateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

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

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion),
                requestOptions,
            )

        /** @see createJournalSubscription */
        @MustBeClosed
        fun createJournalSubscription(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ): HttpResponseFor<SubscriptionResponse1> =
            createJournalSubscription(gdprPrivacyDeletion, RequestOptions.none())

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
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.deleteEventSubscription].
         */
        @MustBeClosed
        fun deleteEventSubscription(
            subscriptionId: Int,
            params: WebhookDeleteEventSubscriptionParams,
        ): HttpResponse = deleteEventSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteEventSubscription */
        @MustBeClosed
        fun deleteEventSubscription(
            subscriptionId: Int,
            params: WebhookDeleteEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteEventSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteEventSubscription */
        @MustBeClosed
        fun deleteEventSubscription(params: WebhookDeleteEventSubscriptionParams): HttpResponse =
            deleteEventSubscription(params, RequestOptions.none())

        /** @see deleteEventSubscription */
        @MustBeClosed
        fun deleteEventSubscription(
            params: WebhookDeleteEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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
         * [WebhookService.deleteJournalSubscriptionForPortal].
         */
        @MustBeClosed
        fun deleteJournalSubscriptionForPortal(portalId: Long): HttpResponse =
            deleteJournalSubscriptionForPortal(
                portalId,
                WebhookDeleteJournalSubscriptionForPortalParams.none(),
            )

        /** @see deleteJournalSubscriptionForPortal */
        @MustBeClosed
        fun deleteJournalSubscriptionForPortal(
            portalId: Long,
            params: WebhookDeleteJournalSubscriptionForPortalParams =
                WebhookDeleteJournalSubscriptionForPortalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteJournalSubscriptionForPortal(
                params.toBuilder().portalId(portalId).build(),
                requestOptions,
            )

        /** @see deleteJournalSubscriptionForPortal */
        @MustBeClosed
        fun deleteJournalSubscriptionForPortal(
            portalId: Long,
            params: WebhookDeleteJournalSubscriptionForPortalParams =
                WebhookDeleteJournalSubscriptionForPortalParams.none(),
        ): HttpResponse =
            deleteJournalSubscriptionForPortal(portalId, params, RequestOptions.none())

        /** @see deleteJournalSubscriptionForPortal */
        @MustBeClosed
        fun deleteJournalSubscriptionForPortal(
            params: WebhookDeleteJournalSubscriptionForPortalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteJournalSubscriptionForPortal */
        @MustBeClosed
        fun deleteJournalSubscriptionForPortal(
            params: WebhookDeleteJournalSubscriptionForPortalParams
        ): HttpResponse = deleteJournalSubscriptionForPortal(params, RequestOptions.none())

        /** @see deleteJournalSubscriptionForPortal */
        @MustBeClosed
        fun deleteJournalSubscriptionForPortal(
            portalId: Long,
            requestOptions: RequestOptions,
        ): HttpResponse =
            deleteJournalSubscriptionForPortal(
                portalId,
                WebhookDeleteJournalSubscriptionForPortalParams.none(),
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
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [WebhookService.getEarliestJournalEntry].
         */
        @MustBeClosed
        fun getEarliestJournalEntry(): HttpResponse =
            getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none())

        /** @see getEarliestJournalEntry */
        @MustBeClosed
        fun getEarliestJournalEntry(
            params: WebhookGetEarliestJournalEntryParams =
                WebhookGetEarliestJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getEarliestJournalEntry */
        @MustBeClosed
        fun getEarliestJournalEntry(
            params: WebhookGetEarliestJournalEntryParams =
                WebhookGetEarliestJournalEntryParams.none()
        ): HttpResponse = getEarliestJournalEntry(params, RequestOptions.none())

        /** @see getEarliestJournalEntry */
        @MustBeClosed
        fun getEarliestJournalEntry(requestOptions: RequestOptions): HttpResponse =
            getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookService.getEarliestLocalJournalEntry].
         */
        @MustBeClosed
        fun getEarliestLocalJournalEntry(): HttpResponse =
            getEarliestLocalJournalEntry(WebhookGetEarliestLocalJournalEntryParams.none())

        /** @see getEarliestLocalJournalEntry */
        @MustBeClosed
        fun getEarliestLocalJournalEntry(
            params: WebhookGetEarliestLocalJournalEntryParams =
                WebhookGetEarliestLocalJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getEarliestLocalJournalEntry */
        @MustBeClosed
        fun getEarliestLocalJournalEntry(
            params: WebhookGetEarliestLocalJournalEntryParams =
                WebhookGetEarliestLocalJournalEntryParams.none()
        ): HttpResponse = getEarliestLocalJournalEntry(params, RequestOptions.none())

        /** @see getEarliestLocalJournalEntry */
        @MustBeClosed
        fun getEarliestLocalJournalEntry(requestOptions: RequestOptions): HttpResponse =
            getEarliestLocalJournalEntry(
                WebhookGetEarliestLocalJournalEntryParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.getEventSubscription].
         */
        @MustBeClosed
        fun getEventSubscription(
            subscriptionId: Int,
            params: WebhookGetEventSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            getEventSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getEventSubscription */
        @MustBeClosed
        fun getEventSubscription(
            subscriptionId: Int,
            params: WebhookGetEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            getEventSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getEventSubscription */
        @MustBeClosed
        fun getEventSubscription(
            params: WebhookGetEventSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> =
            getEventSubscription(params, RequestOptions.none())

        /** @see getEventSubscription */
        @MustBeClosed
        fun getEventSubscription(
            params: WebhookGetEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [WebhookService.getJournalBatchByRequest].
         */
        @MustBeClosed
        fun getJournalBatchByRequest(
            params: WebhookGetJournalBatchByRequestParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchByRequest(params, RequestOptions.none())

        /** @see getJournalBatchByRequest */
        @MustBeClosed
        fun getJournalBatchByRequest(
            params: WebhookGetJournalBatchByRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getJournalBatchByRequest */
        @MustBeClosed
        fun getJournalBatchByRequest(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchByRequest(
                WebhookGetJournalBatchByRequestParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getJournalBatchByRequest */
        @MustBeClosed
        fun getJournalBatchByRequest(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchByRequest(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}`, but is otherwise the same
         * as [WebhookService.getJournalBatchFromOffset].
         */
        @MustBeClosed
        fun getJournalBatchFromOffset(
            count: Int,
            params: WebhookGetJournalBatchFromOffsetParams,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchFromOffset(count, params, RequestOptions.none())

        /** @see getJournalBatchFromOffset */
        @MustBeClosed
        fun getJournalBatchFromOffset(
            count: Int,
            params: WebhookGetJournalBatchFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getJournalBatchFromOffset */
        @MustBeClosed
        fun getJournalBatchFromOffset(
            params: WebhookGetJournalBatchFromOffsetParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getJournalBatchFromOffset(params, RequestOptions.none())

        /** @see getJournalBatchFromOffset */
        @MustBeClosed
        fun getJournalBatchFromOffset(
            params: WebhookGetJournalBatchFromOffsetParams,
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
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.getJournalSubscription].
         */
        @MustBeClosed
        fun getJournalSubscription(subscriptionId: Long): HttpResponseFor<SubscriptionResponse1> =
            getJournalSubscription(subscriptionId, WebhookGetJournalSubscriptionParams.none())

        /** @see getJournalSubscription */
        @MustBeClosed
        fun getJournalSubscription(
            subscriptionId: Long,
            params: WebhookGetJournalSubscriptionParams =
                WebhookGetJournalSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            getJournalSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getJournalSubscription */
        @MustBeClosed
        fun getJournalSubscription(
            subscriptionId: Long,
            params: WebhookGetJournalSubscriptionParams = WebhookGetJournalSubscriptionParams.none(),
        ): HttpResponseFor<SubscriptionResponse1> =
            getJournalSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getJournalSubscription */
        @MustBeClosed
        fun getJournalSubscription(
            params: WebhookGetJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse1>

        /** @see getJournalSubscription */
        @MustBeClosed
        fun getJournalSubscription(
            params: WebhookGetJournalSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse1> =
            getJournalSubscription(params, RequestOptions.none())

        /** @see getJournalSubscription */
        @MustBeClosed
        fun getJournalSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionResponse1> =
            getJournalSubscription(
                subscriptionId,
                WebhookGetJournalSubscriptionParams.none(),
                requestOptions,
            )

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookService.getLatestJournalEntry].
         */
        @MustBeClosed
        fun getLatestJournalEntry(): HttpResponse =
            getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none())

        /** @see getLatestJournalEntry */
        @MustBeClosed
        fun getLatestJournalEntry(
            params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatestJournalEntry */
        @MustBeClosed
        fun getLatestJournalEntry(
            params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none()
        ): HttpResponse = getLatestJournalEntry(params, RequestOptions.none())

        /** @see getLatestJournalEntry */
        @MustBeClosed
        fun getLatestJournalEntry(requestOptions: RequestOptions): HttpResponse =
            getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookService.getLatestLocalJournalEntry].
         */
        @MustBeClosed
        fun getLatestLocalJournalEntry(): HttpResponse =
            getLatestLocalJournalEntry(WebhookGetLatestLocalJournalEntryParams.none())

        /** @see getLatestLocalJournalEntry */
        @MustBeClosed
        fun getLatestLocalJournalEntry(
            params: WebhookGetLatestLocalJournalEntryParams =
                WebhookGetLatestLocalJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLatestLocalJournalEntry */
        @MustBeClosed
        fun getLatestLocalJournalEntry(
            params: WebhookGetLatestLocalJournalEntryParams =
                WebhookGetLatestLocalJournalEntryParams.none()
        ): HttpResponse = getLatestLocalJournalEntry(params, RequestOptions.none())

        /** @see getLatestLocalJournalEntry */
        @MustBeClosed
        fun getLatestLocalJournalEntry(requestOptions: RequestOptions): HttpResponse =
            getLatestLocalJournalEntry(
                WebhookGetLatestLocalJournalEntryParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /webhooks-journal/journal-local/2026-03/batch/read`, but is otherwise the same as
         * [WebhookService.getLocalJournalBatchByRequest].
         */
        @MustBeClosed
        fun getLocalJournalBatchByRequest(
            params: WebhookGetLocalJournalBatchByRequestParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchByRequest(params, RequestOptions.none())

        /** @see getLocalJournalBatchByRequest */
        @MustBeClosed
        fun getLocalJournalBatchByRequest(
            params: WebhookGetLocalJournalBatchByRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse>

        /** @see getLocalJournalBatchByRequest */
        @MustBeClosed
        fun getLocalJournalBatchByRequest(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchByRequest(
                WebhookGetLocalJournalBatchByRequestParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getLocalJournalBatchByRequest */
        @MustBeClosed
        fun getLocalJournalBatchByRequest(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchByRequest(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}`, but is otherwise
         * the same as [WebhookService.getLocalJournalBatchFromOffset].
         */
        @MustBeClosed
        fun getLocalJournalBatchFromOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchFromOffsetParams,
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchFromOffset(count, params, RequestOptions.none())

        /** @see getLocalJournalBatchFromOffset */
        @MustBeClosed
        fun getLocalJournalBatchFromOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalJournalBatchFromOffset */
        @MustBeClosed
        fun getLocalJournalBatchFromOffset(
            params: WebhookGetLocalJournalBatchFromOffsetParams
        ): HttpResponseFor<BatchResponseJournalFetchResponse> =
            getLocalJournalBatchFromOffset(params, RequestOptions.none())

        /** @see getLocalJournalBatchFromOffset */
        @MustBeClosed
        fun getLocalJournalBatchFromOffset(
            params: WebhookGetLocalJournalBatchFromOffsetParams,
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
         * [WebhookService.getNextJournalEntries].
         */
        @MustBeClosed
        fun getNextJournalEntries(offset: String): HttpResponse =
            getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none())

        /** @see getNextJournalEntries */
        @MustBeClosed
        fun getNextJournalEntries(
            offset: String,
            params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalEntries */
        @MustBeClosed
        fun getNextJournalEntries(
            offset: String,
            params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
        ): HttpResponse = getNextJournalEntries(offset, params, RequestOptions.none())

        /** @see getNextJournalEntries */
        @MustBeClosed
        fun getNextJournalEntries(
            params: WebhookGetNextJournalEntriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextJournalEntries */
        @MustBeClosed
        fun getNextJournalEntries(params: WebhookGetNextJournalEntriesParams): HttpResponse =
            getNextJournalEntries(params, RequestOptions.none())

        /** @see getNextJournalEntries */
        @MustBeClosed
        fun getNextJournalEntries(offset: String, requestOptions: RequestOptions): HttpResponse =
            getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookService.getNextLocalJournalEntries].
         */
        @MustBeClosed
        fun getNextLocalJournalEntries(offset: String): HttpResponse =
            getNextLocalJournalEntries(offset, WebhookGetNextLocalJournalEntriesParams.none())

        /** @see getNextLocalJournalEntries */
        @MustBeClosed
        fun getNextLocalJournalEntries(
            offset: String,
            params: WebhookGetNextLocalJournalEntriesParams =
                WebhookGetNextLocalJournalEntriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getNextLocalJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextLocalJournalEntries */
        @MustBeClosed
        fun getNextLocalJournalEntries(
            offset: String,
            params: WebhookGetNextLocalJournalEntriesParams =
                WebhookGetNextLocalJournalEntriesParams.none(),
        ): HttpResponse = getNextLocalJournalEntries(offset, params, RequestOptions.none())

        /** @see getNextLocalJournalEntries */
        @MustBeClosed
        fun getNextLocalJournalEntries(
            params: WebhookGetNextLocalJournalEntriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getNextLocalJournalEntries */
        @MustBeClosed
        fun getNextLocalJournalEntries(
            params: WebhookGetNextLocalJournalEntriesParams
        ): HttpResponse = getNextLocalJournalEntries(params, RequestOptions.none())

        /** @see getNextLocalJournalEntries */
        @MustBeClosed
        fun getNextLocalJournalEntries(
            offset: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            getNextLocalJournalEntries(
                offset,
                WebhookGetNextLocalJournalEntriesParams.none(),
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
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookService.listEventSubscriptions].
         */
        @MustBeClosed
        fun listEventSubscriptions(appId: Int): HttpResponseFor<SubscriptionListResponse> =
            listEventSubscriptions(appId, WebhookListEventSubscriptionsParams.none())

        /** @see listEventSubscriptions */
        @MustBeClosed
        fun listEventSubscriptions(
            appId: Int,
            params: WebhookListEventSubscriptionsParams =
                WebhookListEventSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listEventSubscriptions */
        @MustBeClosed
        fun listEventSubscriptions(
            appId: Int,
            params: WebhookListEventSubscriptionsParams = WebhookListEventSubscriptionsParams.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listEventSubscriptions(appId, params, RequestOptions.none())

        /** @see listEventSubscriptions */
        @MustBeClosed
        fun listEventSubscriptions(
            params: WebhookListEventSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see listEventSubscriptions */
        @MustBeClosed
        fun listEventSubscriptions(
            params: WebhookListEventSubscriptionsParams
        ): HttpResponseFor<SubscriptionListResponse> =
            listEventSubscriptions(params, RequestOptions.none())

        /** @see listEventSubscriptions */
        @MustBeClosed
        fun listEventSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> =
            listEventSubscriptions(
                appId,
                WebhookListEventSubscriptionsParams.none(),
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
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [WebhookService.listSubscriptionFilters].
         */
        @MustBeClosed
        fun listSubscriptionFilters(subscriptionId: Long): HttpResponseFor<List<FilterResponse>> =
            listSubscriptionFilters(subscriptionId, WebhookListSubscriptionFiltersParams.none())

        /** @see listSubscriptionFilters */
        @MustBeClosed
        fun listSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookListSubscriptionFiltersParams =
                WebhookListSubscriptionFiltersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            listSubscriptionFilters(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see listSubscriptionFilters */
        @MustBeClosed
        fun listSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookListSubscriptionFiltersParams =
                WebhookListSubscriptionFiltersParams.none(),
        ): HttpResponseFor<List<FilterResponse>> =
            listSubscriptionFilters(subscriptionId, params, RequestOptions.none())

        /** @see listSubscriptionFilters */
        @MustBeClosed
        fun listSubscriptionFilters(
            params: WebhookListSubscriptionFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterResponse>>

        /** @see listSubscriptionFilters */
        @MustBeClosed
        fun listSubscriptionFilters(
            params: WebhookListSubscriptionFiltersParams
        ): HttpResponseFor<List<FilterResponse>> =
            listSubscriptionFilters(params, RequestOptions.none())

        /** @see listSubscriptionFilters */
        @MustBeClosed
        fun listSubscriptionFilters(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FilterResponse>> =
            listSubscriptionFilters(
                subscriptionId,
                WebhookListSubscriptionFiltersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookService.updateEventSubscription].
         */
        @MustBeClosed
        fun updateEventSubscription(
            subscriptionId: Int,
            params: WebhookUpdateEventSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            updateEventSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateEventSubscription */
        @MustBeClosed
        fun updateEventSubscription(
            subscriptionId: Int,
            params: WebhookUpdateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            updateEventSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateEventSubscription */
        @MustBeClosed
        fun updateEventSubscription(
            params: WebhookUpdateEventSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> =
            updateEventSubscription(params, RequestOptions.none())

        /** @see updateEventSubscription */
        @MustBeClosed
        fun updateEventSubscription(
            params: WebhookUpdateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

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
    }
}
