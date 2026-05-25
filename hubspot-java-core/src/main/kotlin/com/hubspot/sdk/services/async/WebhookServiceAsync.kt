// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AppLifecycleEventSubscriptionUpsertRequest
import com.hubspot.sdk.models.AssociationSubscriptionUpsertRequest
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.BatchResponseJournalFetchResponse
import com.hubspot.sdk.models.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.CrmObjectSnapshotBatchResponse
import com.hubspot.sdk.models.FilterCreateRequest
import com.hubspot.sdk.models.FilterCreateResponse
import com.hubspot.sdk.models.FilterResponse
import com.hubspot.sdk.models.GdprPrivacyDeletionSubscriptionUpsertRequest
import com.hubspot.sdk.models.ListMembershipSubscriptionUpsertRequest
import com.hubspot.sdk.models.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.SnapshotStatusResponse
import com.hubspot.sdk.models.SubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.BatchResponseSubscriptionResponse
import com.hubspot.sdk.models.webhooks.SettingsResponse
import com.hubspot.sdk.models.webhooks.SubscriptionListResponse
import com.hubspot.sdk.models.webhooks.SubscriptionResponse
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
import com.hubspot.sdk.models.webhooksjournal.CollectionResponseSubscriptionResponseNoPaging
import com.hubspot.sdk.models.webhooksjournal.SubscriptionResponse
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

    /** Batch create event subscriptions for the specified app. */
    fun createBatchEventSubscriptions(
        appId: Int,
        params: WebhookCreateBatchEventSubscriptionsParams,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        createBatchEventSubscriptions(appId, params, RequestOptions.none())

    /** @see createBatchEventSubscriptions */
    fun createBatchEventSubscriptions(
        appId: Int,
        params: WebhookCreateBatchEventSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        createBatchEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createBatchEventSubscriptions */
    fun createBatchEventSubscriptions(
        params: WebhookCreateBatchEventSubscriptionsParams
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        createBatchEventSubscriptions(params, RequestOptions.none())

    /** @see createBatchEventSubscriptions */
    fun createBatchEventSubscriptions(
        params: WebhookCreateBatchEventSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse>

    /**
     * Create a batch of CRM object snapshots in HubSpot. This endpoint is used to capture the
     * current state of specified CRM objects for later reference or analysis. It requires a JSON
     * payload containing the details of the CRM objects to snapshot. This operation is exempt from
     * daily and ten-secondly rate limits.
     */
    fun createCrmSnapshots(
        params: WebhookCreateCrmSnapshotsParams
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshots(params, RequestOptions.none())

    /** @see createCrmSnapshots */
    fun createCrmSnapshots(
        params: WebhookCreateCrmSnapshotsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse>

    /** @see createCrmSnapshots */
    fun createCrmSnapshots(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshots(
            WebhookCreateCrmSnapshotsParams.builder()
                .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see createCrmSnapshots */
    fun createCrmSnapshots(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        createCrmSnapshots(crmObjectSnapshotBatchRequest, RequestOptions.none())

    /** Create new event subscription for the specified app. */
    fun createEventSubscription(
        appId: Int,
        params: WebhookCreateEventSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        createEventSubscription(appId, params, RequestOptions.none())

    /** @see createEventSubscription */
    fun createEventSubscription(
        appId: Int,
        params: WebhookCreateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createEventSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createEventSubscription */
    fun createEventSubscription(
        params: WebhookCreateEventSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> =
        createEventSubscription(params, RequestOptions.none())

    /** @see createEventSubscription */
    fun createEventSubscription(
        params: WebhookCreateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /**
     * Create a new subscription in the Webhooks Journal for the specified version. This endpoint
     * allows you to define the subscription details by providing the necessary information in the
     * request body. It supports various types of subscriptions, including object, association,
     * event, app lifecycle event, list membership, and GDPR privacy deletion. Ensure that all
     * required fields are included in the request to successfully create a subscription.
     */
    fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(params, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        params: WebhookCreateJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(
            WebhookCreateJournalSubscriptionParams.builder()
                .subscriptionUpsertRequest(subscriptionUpsertRequest)
                .build(),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        subscriptionUpsertRequest: SubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(subscriptionUpsertRequest, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                objectSubscriptionUpsertRequest
            ),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(objectSubscriptionUpsertRequest, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        association: AssociationSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofAssociation(association),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        association: AssociationSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(association, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(appLifecycleEvent, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        listMembership: ListMembershipSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofListMembership(listMembership),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        listMembership: ListMembershipSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(listMembership, RequestOptions.none())

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(
            SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion),
            requestOptions,
        )

    /** @see createJournalSubscription */
    fun createJournalSubscription(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
    ): CompletableFuture<SubscriptionResponse> =
        createJournalSubscription(gdprPrivacyDeletion, RequestOptions.none())

    /**
     * Create a new filter for a specific webhook subscription in the HubSpot account. This endpoint
     * allows you to define conditions that determine when a webhook should be triggered. The filter
     * is associated with a subscription identified by its ID, and the request must include the
     * filter details.
     */
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

    /** Delete an existing event subscription by ID. */
    fun deleteEventSubscription(
        subscriptionId: Int,
        params: WebhookDeleteEventSubscriptionParams,
    ): CompletableFuture<Void?> =
        deleteEventSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteEventSubscription */
    fun deleteEventSubscription(
        subscriptionId: Int,
        params: WebhookDeleteEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteEventSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteEventSubscription */
    fun deleteEventSubscription(
        params: WebhookDeleteEventSubscriptionParams
    ): CompletableFuture<Void?> = deleteEventSubscription(params, RequestOptions.none())

    /** @see deleteEventSubscription */
    fun deleteEventSubscription(
        params: WebhookDeleteEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Delete a specific webhook journal subscription using its unique identifier. This operation is
     * useful for managing and cleaning up subscriptions that are no longer needed in your HubSpot
     * account.
     */
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

    /**
     * Delete a webhook journal subscription for a specific portal. This operation removes the
     * subscription associated with the given portalId, ensuring that no further webhook events are
     * sent for this portal. Use this endpoint to manage and clean up subscriptions that are no
     * longer needed.
     */
    fun deleteJournalSubscriptionForPortal(portalId: Long): CompletableFuture<Void?> =
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
    ): CompletableFuture<Void?> =
        deleteJournalSubscriptionForPortal(
            params.toBuilder().portalId(portalId).build(),
            requestOptions,
        )

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        portalId: Long,
        params: WebhookDeleteJournalSubscriptionForPortalParams =
            WebhookDeleteJournalSubscriptionForPortalParams.none(),
    ): CompletableFuture<Void?> =
        deleteJournalSubscriptionForPortal(portalId, params, RequestOptions.none())

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        params: WebhookDeleteJournalSubscriptionForPortalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        params: WebhookDeleteJournalSubscriptionForPortalParams
    ): CompletableFuture<Void?> = deleteJournalSubscriptionForPortal(params, RequestOptions.none())

    /** @see deleteJournalSubscriptionForPortal */
    fun deleteJournalSubscriptionForPortal(
        portalId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteJournalSubscriptionForPortal(
            portalId,
            WebhookDeleteJournalSubscriptionForPortalParams.none(),
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

    /**
     * Remove a specific filter from the webhooks journal subscriptions. This operation is useful
     * for managing and cleaning up filters that are no longer needed. Once deleted, the filter
     * cannot be recovered.
     */
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

    /**
     * Retrieve the earliest batch of webhook journal entries for a specified count. This endpoint
     * is useful for accessing historical webhook data in batches, allowing you to process or
     * analyze older entries. The number of entries retrieved is determined by the count parameter.
     */
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

    /**
     * Retrieve the earliest entry from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the first recorded webhook event in the journal, which can be helpful
     * for auditing or debugging purposes.
     */
    fun getEarliestJournalEntry(): CompletableFuture<HttpResponse> =
        getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none())

    /** @see getEarliestJournalEntry */
    fun getEarliestJournalEntry(
        params: WebhookGetEarliestJournalEntryParams = WebhookGetEarliestJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getEarliestJournalEntry */
    fun getEarliestJournalEntry(
        params: WebhookGetEarliestJournalEntryParams = WebhookGetEarliestJournalEntryParams.none()
    ): CompletableFuture<HttpResponse> = getEarliestJournalEntry(params, RequestOptions.none())

    /** @see getEarliestJournalEntry */
    fun getEarliestJournalEntry(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none(), requestOptions)

    /**
     * Retrieve the earliest batch of webhook journal entries. This endpoint is useful for accessing
     * the oldest available data in the webhook journal, allowing users to process or analyze
     * historical webhook events. The number of entries to fetch is specified by the 'count' path
     * parameter.
     */
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

    /**
     * Retrieve the earliest webhook journal entries for the specified portal. This endpoint can be
     * used to access the oldest records available in the webhook journal, which may be useful for
     * auditing or historical analysis.
     */
    fun getEarliestLocalJournalEntry(): CompletableFuture<HttpResponse> =
        getEarliestLocalJournalEntry(WebhookGetEarliestLocalJournalEntryParams.none())

    /** @see getEarliestLocalJournalEntry */
    fun getEarliestLocalJournalEntry(
        params: WebhookGetEarliestLocalJournalEntryParams =
            WebhookGetEarliestLocalJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getEarliestLocalJournalEntry */
    fun getEarliestLocalJournalEntry(
        params: WebhookGetEarliestLocalJournalEntryParams =
            WebhookGetEarliestLocalJournalEntryParams.none()
    ): CompletableFuture<HttpResponse> = getEarliestLocalJournalEntry(params, RequestOptions.none())

    /** @see getEarliestLocalJournalEntry */
    fun getEarliestLocalJournalEntry(
        requestOptions: RequestOptions
    ): CompletableFuture<HttpResponse> =
        getEarliestLocalJournalEntry(
            WebhookGetEarliestLocalJournalEntryParams.none(),
            requestOptions,
        )

    /** Retrieve a specific event subscription by ID. */
    fun getEventSubscription(
        subscriptionId: Int,
        params: WebhookGetEventSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        getEventSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getEventSubscription */
    fun getEventSubscription(
        subscriptionId: Int,
        params: WebhookGetEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        getEventSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getEventSubscription */
    fun getEventSubscription(
        params: WebhookGetEventSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = getEventSubscription(params, RequestOptions.none())

    /** @see getEventSubscription */
    fun getEventSubscription(
        params: WebhookGetEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /**
     * Execute a batch read operation on the webhooks journal for the specified date, 2026-03. This
     * endpoint allows you to retrieve multiple entries from the webhooks journal in a single
     * request, which can be useful for processing large amounts of data efficiently. Ensure that
     * the request body is provided in the required format.
     */
    fun getJournalBatchByRequest(
        params: WebhookGetJournalBatchByRequestParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchByRequest(params, RequestOptions.none())

    /** @see getJournalBatchByRequest */
    fun getJournalBatchByRequest(
        params: WebhookGetJournalBatchByRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getJournalBatchByRequest */
    fun getJournalBatchByRequest(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchByRequest(
            WebhookGetJournalBatchByRequestParams.builder()
                .batchInputString(batchInputString)
                .build(),
            requestOptions,
        )

    /** @see getJournalBatchByRequest */
    fun getJournalBatchByRequest(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchByRequest(batchInputString, RequestOptions.none())

    /**
     * Retrieve a batch of webhook journal entries starting from a specified offset. This endpoint
     * allows you to fetch a defined number of entries, which can be useful for processing large
     * datasets in manageable chunks.
     */
    fun getJournalBatchFromOffset(
        count: Int,
        params: WebhookGetJournalBatchFromOffsetParams,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchFromOffset(count, params, RequestOptions.none())

    /** @see getJournalBatchFromOffset */
    fun getJournalBatchFromOffset(
        count: Int,
        params: WebhookGetJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getJournalBatchFromOffset */
    fun getJournalBatchFromOffset(
        params: WebhookGetJournalBatchFromOffsetParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getJournalBatchFromOffset(params, RequestOptions.none())

    /** @see getJournalBatchFromOffset */
    fun getJournalBatchFromOffset(
        params: WebhookGetJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint provides detailed information about the status, including whether it is pending, in
     * progress, completed, failed, or expired. It is useful for monitoring and managing the state
     * of webhook journal entries.
     */
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

    /**
     * Retrieve details of a specific webhook subscription using its unique identifier. This
     * endpoint is useful for obtaining information about a particular subscription, such as its
     * actions, object type, and associated properties.
     */
    fun getJournalSubscription(subscriptionId: Long): CompletableFuture<SubscriptionResponse> =
        getJournalSubscription(subscriptionId, WebhookGetJournalSubscriptionParams.none())

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        subscriptionId: Long,
        params: WebhookGetJournalSubscriptionParams = WebhookGetJournalSubscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        getJournalSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        subscriptionId: Long,
        params: WebhookGetJournalSubscriptionParams = WebhookGetJournalSubscriptionParams.none(),
    ): CompletableFuture<SubscriptionResponse> =
        getJournalSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        params: WebhookGetJournalSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        params: WebhookGetJournalSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> =
        getJournalSubscription(params, RequestOptions.none())

    /** @see getJournalSubscription */
    fun getJournalSubscription(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionResponse> =
        getJournalSubscription(
            subscriptionId,
            WebhookGetJournalSubscriptionParams.none(),
            requestOptions,
        )

    /**
     * Retrieve the latest batch of webhook journal entries up to the specified count. This endpoint
     * is useful for fetching recent webhook data for analysis or processing. The count parameter
     * determines the maximum number of entries to return.
     */
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

    /**
     * Retrieve the latest entries from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the most recent webhook events and their statuses, allowing you to
     * monitor and debug webhook activity effectively.
     */
    fun getLatestJournalEntry(): CompletableFuture<HttpResponse> =
        getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none())

    /** @see getLatestJournalEntry */
    fun getLatestJournalEntry(
        params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLatestJournalEntry */
    fun getLatestJournalEntry(
        params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none()
    ): CompletableFuture<HttpResponse> = getLatestJournalEntry(params, RequestOptions.none())

    /** @see getLatestJournalEntry */
    fun getLatestJournalEntry(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none(), requestOptions)

    /**
     * Retrieve the latest batch of webhook journal entries. This endpoint allows you to specify the
     * number of entries to fetch, providing a way to access the most recent webhook events
     * processed by your HubSpot account.
     */
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

    /**
     * Retrieve the latest entries from the webhooks journal for the specified portal. This endpoint
     * is useful for accessing the most recent webhook events that have been logged, allowing for
     * real-time monitoring or debugging of webhook activities.
     */
    fun getLatestLocalJournalEntry(): CompletableFuture<HttpResponse> =
        getLatestLocalJournalEntry(WebhookGetLatestLocalJournalEntryParams.none())

    /** @see getLatestLocalJournalEntry */
    fun getLatestLocalJournalEntry(
        params: WebhookGetLatestLocalJournalEntryParams =
            WebhookGetLatestLocalJournalEntryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getLatestLocalJournalEntry */
    fun getLatestLocalJournalEntry(
        params: WebhookGetLatestLocalJournalEntryParams =
            WebhookGetLatestLocalJournalEntryParams.none()
    ): CompletableFuture<HttpResponse> = getLatestLocalJournalEntry(params, RequestOptions.none())

    /** @see getLatestLocalJournalEntry */
    fun getLatestLocalJournalEntry(
        requestOptions: RequestOptions
    ): CompletableFuture<HttpResponse> =
        getLatestLocalJournalEntry(WebhookGetLatestLocalJournalEntryParams.none(), requestOptions)

    /**
     * Execute a batch read operation on the webhooks journal. This endpoint allows you to retrieve
     * a batch of webhook journal entries by providing the necessary input data. It is useful for
     * processing multiple records in a single request, streamlining data retrieval tasks.
     */
    fun getLocalJournalBatchByRequest(
        params: WebhookGetLocalJournalBatchByRequestParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchByRequest(params, RequestOptions.none())

    /** @see getLocalJournalBatchByRequest */
    fun getLocalJournalBatchByRequest(
        params: WebhookGetLocalJournalBatchByRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /** @see getLocalJournalBatchByRequest */
    fun getLocalJournalBatchByRequest(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchByRequest(
            WebhookGetLocalJournalBatchByRequestParams.builder()
                .batchInputString(batchInputString)
                .build(),
            requestOptions,
        )

    /** @see getLocalJournalBatchByRequest */
    fun getLocalJournalBatchByRequest(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchByRequest(batchInputString, RequestOptions.none())

    /**
     * Retrieve a batch of webhook journal entries starting from a specified offset. This endpoint
     * is useful for paginating through large sets of webhook data. The number of entries returned
     * is determined by the 'count' parameter.
     */
    fun getLocalJournalBatchFromOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchFromOffsetParams,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchFromOffset(count, params, RequestOptions.none())

    /** @see getLocalJournalBatchFromOffset */
    fun getLocalJournalBatchFromOffset(
        count: Int,
        params: WebhookGetLocalJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

    /** @see getLocalJournalBatchFromOffset */
    fun getLocalJournalBatchFromOffset(
        params: WebhookGetLocalJournalBatchFromOffsetParams
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        getLocalJournalBatchFromOffset(params, RequestOptions.none())

    /** @see getLocalJournalBatchFromOffset */
    fun getLocalJournalBatchFromOffset(
        params: WebhookGetLocalJournalBatchFromOffsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseJournalFetchResponse>

    /**
     * Retrieve the status of a specific webhook journal entry using its unique status ID. This
     * endpoint is useful for monitoring the progress or outcome of webhook journal entries,
     * allowing you to check if an entry is pending, in progress, completed, failed, or expired.
     */
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
     * Retrieve the next set of entries from the webhooks journal starting from a specified offset.
     * This endpoint is useful for paginating through journal entries to process or analyze webhook
     * events sequentially.
     */
    fun getNextJournalEntries(offset: String): CompletableFuture<HttpResponse> =
        getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none())

    /** @see getNextJournalEntries */
    fun getNextJournalEntries(
        offset: String,
        params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextJournalEntries */
    fun getNextJournalEntries(
        offset: String,
        params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
    ): CompletableFuture<HttpResponse> =
        getNextJournalEntries(offset, params, RequestOptions.none())

    /** @see getNextJournalEntries */
    fun getNextJournalEntries(
        params: WebhookGetNextJournalEntriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextJournalEntries */
    fun getNextJournalEntries(
        params: WebhookGetNextJournalEntriesParams
    ): CompletableFuture<HttpResponse> = getNextJournalEntries(params, RequestOptions.none())

    /** @see getNextJournalEntries */
    fun getNextJournalEntries(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none(), requestOptions)

    /**
     * Retrieve the next set of webhook journal entries starting from a specified offset. This
     * endpoint is useful for paginating through large sets of webhook data, allowing you to
     * continue from where a previous request left off.
     */
    fun getNextLocalJournalEntries(offset: String): CompletableFuture<HttpResponse> =
        getNextLocalJournalEntries(offset, WebhookGetNextLocalJournalEntriesParams.none())

    /** @see getNextLocalJournalEntries */
    fun getNextLocalJournalEntries(
        offset: String,
        params: WebhookGetNextLocalJournalEntriesParams =
            WebhookGetNextLocalJournalEntriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getNextLocalJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

    /** @see getNextLocalJournalEntries */
    fun getNextLocalJournalEntries(
        offset: String,
        params: WebhookGetNextLocalJournalEntriesParams =
            WebhookGetNextLocalJournalEntriesParams.none(),
    ): CompletableFuture<HttpResponse> =
        getNextLocalJournalEntries(offset, params, RequestOptions.none())

    /** @see getNextLocalJournalEntries */
    fun getNextLocalJournalEntries(
        params: WebhookGetNextLocalJournalEntriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getNextLocalJournalEntries */
    fun getNextLocalJournalEntries(
        params: WebhookGetNextLocalJournalEntriesParams
    ): CompletableFuture<HttpResponse> = getNextLocalJournalEntries(params, RequestOptions.none())

    /** @see getNextLocalJournalEntries */
    fun getNextLocalJournalEntries(
        offset: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getNextLocalJournalEntries(
            offset,
            WebhookGetNextLocalJournalEntriesParams.none(),
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

    /**
     * Retrieve a specific filter associated with a webhook journal subscription. This endpoint
     * allows you to access the details of the filter identified by the filterId, which is useful
     * for managing and understanding the conditions applied to webhook events.
     */
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

    /** Retrieve event subscriptions for the specified app. */
    fun listEventSubscriptions(appId: Int): CompletableFuture<SubscriptionListResponse> =
        listEventSubscriptions(appId, WebhookListEventSubscriptionsParams.none())

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        appId: Int,
        params: WebhookListEventSubscriptionsParams = WebhookListEventSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        appId: Int,
        params: WebhookListEventSubscriptionsParams = WebhookListEventSubscriptionsParams.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listEventSubscriptions(appId, params, RequestOptions.none())

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        params: WebhookListEventSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        params: WebhookListEventSubscriptionsParams
    ): CompletableFuture<SubscriptionListResponse> =
        listEventSubscriptions(params, RequestOptions.none())

    /** @see listEventSubscriptions */
    fun listEventSubscriptions(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        listEventSubscriptions(appId, WebhookListEventSubscriptionsParams.none(), requestOptions)

    /**
     * Retrieve a list of webhook journal subscriptions for the specified version. This endpoint
     * allows you to view all active subscriptions without pagination. It is useful for monitoring
     * and managing webhook subscriptions in your HubSpot account.
     */
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

    /**
     * Retrieve the filters associated with a specific webhook subscription. This endpoint allows
     * you to view the filters applied to a subscription, which can help in managing and
     * understanding the conditions set for webhook events.
     */
    fun listSubscriptionFilters(subscriptionId: Long): CompletableFuture<List<FilterResponse>> =
        listSubscriptionFilters(subscriptionId, WebhookListSubscriptionFiltersParams.none())

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookListSubscriptionFiltersParams = WebhookListSubscriptionFiltersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>> =
        listSubscriptionFilters(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        subscriptionId: Long,
        params: WebhookListSubscriptionFiltersParams = WebhookListSubscriptionFiltersParams.none(),
    ): CompletableFuture<List<FilterResponse>> =
        listSubscriptionFilters(subscriptionId, params, RequestOptions.none())

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        params: WebhookListSubscriptionFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>>

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        params: WebhookListSubscriptionFiltersParams
    ): CompletableFuture<List<FilterResponse>> =
        listSubscriptionFilters(params, RequestOptions.none())

    /** @see listSubscriptionFilters */
    fun listSubscriptionFilters(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        listSubscriptionFilters(
            subscriptionId,
            WebhookListSubscriptionFiltersParams.none(),
            requestOptions,
        )

    /** Update an existing event subscription by ID. */
    fun updateEventSubscription(
        subscriptionId: Int,
        params: WebhookUpdateEventSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        updateEventSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateEventSubscription */
    fun updateEventSubscription(
        subscriptionId: Int,
        params: WebhookUpdateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        updateEventSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateEventSubscription */
    fun updateEventSubscription(
        params: WebhookUpdateEventSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> =
        updateEventSubscription(params, RequestOptions.none())

    /** @see updateEventSubscription */
    fun updateEventSubscription(
        params: WebhookUpdateEventSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

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
         * Returns a raw HTTP response for `post
         * /webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [WebhookServiceAsync.createBatchEventSubscriptions].
         */
        fun createBatchEventSubscriptions(
            appId: Int,
            params: WebhookCreateBatchEventSubscriptionsParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            createBatchEventSubscriptions(appId, params, RequestOptions.none())

        /** @see createBatchEventSubscriptions */
        fun createBatchEventSubscriptions(
            appId: Int,
            params: WebhookCreateBatchEventSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            createBatchEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createBatchEventSubscriptions */
        fun createBatchEventSubscriptions(
            params: WebhookCreateBatchEventSubscriptionsParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            createBatchEventSubscriptions(params, RequestOptions.none())

        /** @see createBatchEventSubscriptions */
        fun createBatchEventSubscriptions(
            params: WebhookCreateBatchEventSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [WebhookServiceAsync.createCrmSnapshots].
         */
        fun createCrmSnapshots(
            params: WebhookCreateCrmSnapshotsParams
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshots(params, RequestOptions.none())

        /** @see createCrmSnapshots */
        fun createCrmSnapshots(
            params: WebhookCreateCrmSnapshotsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>>

        /** @see createCrmSnapshots */
        fun createCrmSnapshots(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshots(
                WebhookCreateCrmSnapshotsParams.builder()
                    .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                    .build(),
                requestOptions,
            )

        /** @see createCrmSnapshots */
        fun createCrmSnapshots(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            createCrmSnapshots(crmObjectSnapshotBatchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookServiceAsync.createEventSubscription].
         */
        fun createEventSubscription(
            appId: Int,
            params: WebhookCreateEventSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createEventSubscription(appId, params, RequestOptions.none())

        /** @see createEventSubscription */
        fun createEventSubscription(
            appId: Int,
            params: WebhookCreateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createEventSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createEventSubscription */
        fun createEventSubscription(
            params: WebhookCreateEventSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createEventSubscription(params, RequestOptions.none())

        /** @see createEventSubscription */
        fun createEventSubscription(
            params: WebhookCreateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [WebhookServiceAsync.createJournalSubscription].
         */
        fun createJournalSubscription(
            params: WebhookCreateJournalSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(params, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            params: WebhookCreateJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(
                WebhookCreateJournalSubscriptionParams.builder()
                    .subscriptionUpsertRequest(subscriptionUpsertRequest)
                    .build(),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            subscriptionUpsertRequest: SubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(subscriptionUpsertRequest, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                    objectSubscriptionUpsertRequest
                ),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(objectSubscriptionUpsertRequest, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            association: AssociationSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofAssociation(association),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            association: AssociationSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(association, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(appLifecycleEvent, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            listMembership: ListMembershipSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofListMembership(listMembership),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            listMembership: ListMembershipSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(listMembership, RequestOptions.none())

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(
                SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion),
                requestOptions,
            )

        /** @see createJournalSubscription */
        fun createJournalSubscription(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createJournalSubscription(gdprPrivacyDeletion, RequestOptions.none())

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
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.deleteEventSubscription].
         */
        fun deleteEventSubscription(
            subscriptionId: Int,
            params: WebhookDeleteEventSubscriptionParams,
        ): CompletableFuture<HttpResponse> =
            deleteEventSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteEventSubscription */
        fun deleteEventSubscription(
            subscriptionId: Int,
            params: WebhookDeleteEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteEventSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteEventSubscription */
        fun deleteEventSubscription(
            params: WebhookDeleteEventSubscriptionParams
        ): CompletableFuture<HttpResponse> = deleteEventSubscription(params, RequestOptions.none())

        /** @see deleteEventSubscription */
        fun deleteEventSubscription(
            params: WebhookDeleteEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

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
         * [WebhookServiceAsync.deleteJournalSubscriptionForPortal].
         */
        fun deleteJournalSubscriptionForPortal(portalId: Long): CompletableFuture<HttpResponse> =
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
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscriptionForPortal(
                params.toBuilder().portalId(portalId).build(),
                requestOptions,
            )

        /** @see deleteJournalSubscriptionForPortal */
        fun deleteJournalSubscriptionForPortal(
            portalId: Long,
            params: WebhookDeleteJournalSubscriptionForPortalParams =
                WebhookDeleteJournalSubscriptionForPortalParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscriptionForPortal(portalId, params, RequestOptions.none())

        /** @see deleteJournalSubscriptionForPortal */
        fun deleteJournalSubscriptionForPortal(
            params: WebhookDeleteJournalSubscriptionForPortalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteJournalSubscriptionForPortal */
        fun deleteJournalSubscriptionForPortal(
            params: WebhookDeleteJournalSubscriptionForPortalParams
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscriptionForPortal(params, RequestOptions.none())

        /** @see deleteJournalSubscriptionForPortal */
        fun deleteJournalSubscriptionForPortal(
            portalId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteJournalSubscriptionForPortal(
                portalId,
                WebhookDeleteJournalSubscriptionForPortalParams.none(),
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
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/earliest`, but is
         * otherwise the same as [WebhookServiceAsync.getEarliestJournalEntry].
         */
        fun getEarliestJournalEntry(): CompletableFuture<HttpResponse> =
            getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none())

        /** @see getEarliestJournalEntry */
        fun getEarliestJournalEntry(
            params: WebhookGetEarliestJournalEntryParams =
                WebhookGetEarliestJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getEarliestJournalEntry */
        fun getEarliestJournalEntry(
            params: WebhookGetEarliestJournalEntryParams =
                WebhookGetEarliestJournalEntryParams.none()
        ): CompletableFuture<HttpResponse> = getEarliestJournalEntry(params, RequestOptions.none())

        /** @see getEarliestJournalEntry */
        fun getEarliestJournalEntry(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            getEarliestJournalEntry(WebhookGetEarliestJournalEntryParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/earliest`,
         * but is otherwise the same as [WebhookServiceAsync.getEarliestLocalJournalEntry].
         */
        fun getEarliestLocalJournalEntry(): CompletableFuture<HttpResponse> =
            getEarliestLocalJournalEntry(WebhookGetEarliestLocalJournalEntryParams.none())

        /** @see getEarliestLocalJournalEntry */
        fun getEarliestLocalJournalEntry(
            params: WebhookGetEarliestLocalJournalEntryParams =
                WebhookGetEarliestLocalJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getEarliestLocalJournalEntry */
        fun getEarliestLocalJournalEntry(
            params: WebhookGetEarliestLocalJournalEntryParams =
                WebhookGetEarliestLocalJournalEntryParams.none()
        ): CompletableFuture<HttpResponse> =
            getEarliestLocalJournalEntry(params, RequestOptions.none())

        /** @see getEarliestLocalJournalEntry */
        fun getEarliestLocalJournalEntry(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            getEarliestLocalJournalEntry(
                WebhookGetEarliestLocalJournalEntryParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.getEventSubscription].
         */
        fun getEventSubscription(
            subscriptionId: Int,
            params: WebhookGetEventSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getEventSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getEventSubscription */
        fun getEventSubscription(
            subscriptionId: Int,
            params: WebhookGetEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getEventSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getEventSubscription */
        fun getEventSubscription(
            params: WebhookGetEventSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getEventSubscription(params, RequestOptions.none())

        /** @see getEventSubscription */
        fun getEventSubscription(
            params: WebhookGetEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/journal/2026-03/batch/read`, but
         * is otherwise the same as [WebhookServiceAsync.getJournalBatchByRequest].
         */
        fun getJournalBatchByRequest(
            params: WebhookGetJournalBatchByRequestParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchByRequest(params, RequestOptions.none())

        /** @see getJournalBatchByRequest */
        fun getJournalBatchByRequest(
            params: WebhookGetJournalBatchByRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getJournalBatchByRequest */
        fun getJournalBatchByRequest(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchByRequest(
                WebhookGetJournalBatchByRequestParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getJournalBatchByRequest */
        fun getJournalBatchByRequest(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchByRequest(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}`, but is otherwise the same
         * as [WebhookServiceAsync.getJournalBatchFromOffset].
         */
        fun getJournalBatchFromOffset(
            count: Int,
            params: WebhookGetJournalBatchFromOffsetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchFromOffset(count, params, RequestOptions.none())

        /** @see getJournalBatchFromOffset */
        fun getJournalBatchFromOffset(
            count: Int,
            params: WebhookGetJournalBatchFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getJournalBatchFromOffset */
        fun getJournalBatchFromOffset(
            params: WebhookGetJournalBatchFromOffsetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getJournalBatchFromOffset(params, RequestOptions.none())

        /** @see getJournalBatchFromOffset */
        fun getJournalBatchFromOffset(
            params: WebhookGetJournalBatchFromOffsetParams,
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
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.getJournalSubscription].
         */
        fun getJournalSubscription(
            subscriptionId: Long
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getJournalSubscription(subscriptionId, WebhookGetJournalSubscriptionParams.none())

        /** @see getJournalSubscription */
        fun getJournalSubscription(
            subscriptionId: Long,
            params: WebhookGetJournalSubscriptionParams =
                WebhookGetJournalSubscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getJournalSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getJournalSubscription */
        fun getJournalSubscription(
            subscriptionId: Long,
            params: WebhookGetJournalSubscriptionParams = WebhookGetJournalSubscriptionParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getJournalSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getJournalSubscription */
        fun getJournalSubscription(
            params: WebhookGetJournalSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /** @see getJournalSubscription */
        fun getJournalSubscription(
            params: WebhookGetJournalSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getJournalSubscription(params, RequestOptions.none())

        /** @see getJournalSubscription */
        fun getJournalSubscription(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getJournalSubscription(
                subscriptionId,
                WebhookGetJournalSubscriptionParams.none(),
                requestOptions,
            )

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal/2026-03/latest`, but is
         * otherwise the same as [WebhookServiceAsync.getLatestJournalEntry].
         */
        fun getLatestJournalEntry(): CompletableFuture<HttpResponse> =
            getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none())

        /** @see getLatestJournalEntry */
        fun getLatestJournalEntry(
            params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLatestJournalEntry */
        fun getLatestJournalEntry(
            params: WebhookGetLatestJournalEntryParams = WebhookGetLatestJournalEntryParams.none()
        ): CompletableFuture<HttpResponse> = getLatestJournalEntry(params, RequestOptions.none())

        /** @see getLatestJournalEntry */
        fun getLatestJournalEntry(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLatestJournalEntry(WebhookGetLatestJournalEntryParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /webhooks-journal/journal-local/2026-03/latest`, but
         * is otherwise the same as [WebhookServiceAsync.getLatestLocalJournalEntry].
         */
        fun getLatestLocalJournalEntry(): CompletableFuture<HttpResponse> =
            getLatestLocalJournalEntry(WebhookGetLatestLocalJournalEntryParams.none())

        /** @see getLatestLocalJournalEntry */
        fun getLatestLocalJournalEntry(
            params: WebhookGetLatestLocalJournalEntryParams =
                WebhookGetLatestLocalJournalEntryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLatestLocalJournalEntry */
        fun getLatestLocalJournalEntry(
            params: WebhookGetLatestLocalJournalEntryParams =
                WebhookGetLatestLocalJournalEntryParams.none()
        ): CompletableFuture<HttpResponse> =
            getLatestLocalJournalEntry(params, RequestOptions.none())

        /** @see getLatestLocalJournalEntry */
        fun getLatestLocalJournalEntry(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            getLatestLocalJournalEntry(
                WebhookGetLatestLocalJournalEntryParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /webhooks-journal/journal-local/2026-03/batch/read`, but is otherwise the same as
         * [WebhookServiceAsync.getLocalJournalBatchByRequest].
         */
        fun getLocalJournalBatchByRequest(
            params: WebhookGetLocalJournalBatchByRequestParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchByRequest(params, RequestOptions.none())

        /** @see getLocalJournalBatchByRequest */
        fun getLocalJournalBatchByRequest(
            params: WebhookGetLocalJournalBatchByRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>>

        /** @see getLocalJournalBatchByRequest */
        fun getLocalJournalBatchByRequest(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchByRequest(
                WebhookGetLocalJournalBatchByRequestParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getLocalJournalBatchByRequest */
        fun getLocalJournalBatchByRequest(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchByRequest(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}`, but is otherwise
         * the same as [WebhookServiceAsync.getLocalJournalBatchFromOffset].
         */
        fun getLocalJournalBatchFromOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchFromOffsetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchFromOffset(count, params, RequestOptions.none())

        /** @see getLocalJournalBatchFromOffset */
        fun getLocalJournalBatchFromOffset(
            count: Int,
            params: WebhookGetLocalJournalBatchFromOffsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchFromOffset(params.toBuilder().count(count).build(), requestOptions)

        /** @see getLocalJournalBatchFromOffset */
        fun getLocalJournalBatchFromOffset(
            params: WebhookGetLocalJournalBatchFromOffsetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> =
            getLocalJournalBatchFromOffset(params, RequestOptions.none())

        /** @see getLocalJournalBatchFromOffset */
        fun getLocalJournalBatchFromOffset(
            params: WebhookGetLocalJournalBatchFromOffsetParams,
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
         * [WebhookServiceAsync.getNextJournalEntries].
         */
        fun getNextJournalEntries(offset: String): CompletableFuture<HttpResponse> =
            getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none())

        /** @see getNextJournalEntries */
        fun getNextJournalEntries(
            offset: String,
            params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextJournalEntries */
        fun getNextJournalEntries(
            offset: String,
            params: WebhookGetNextJournalEntriesParams = WebhookGetNextJournalEntriesParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextJournalEntries(offset, params, RequestOptions.none())

        /** @see getNextJournalEntries */
        fun getNextJournalEntries(
            params: WebhookGetNextJournalEntriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextJournalEntries */
        fun getNextJournalEntries(
            params: WebhookGetNextJournalEntriesParams
        ): CompletableFuture<HttpResponse> = getNextJournalEntries(params, RequestOptions.none())

        /** @see getNextJournalEntries */
        fun getNextJournalEntries(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextJournalEntries(offset, WebhookGetNextJournalEntriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/journal-local/2026-03/offset/{offset}/next`, but is otherwise the same
         * as [WebhookServiceAsync.getNextLocalJournalEntries].
         */
        fun getNextLocalJournalEntries(offset: String): CompletableFuture<HttpResponse> =
            getNextLocalJournalEntries(offset, WebhookGetNextLocalJournalEntriesParams.none())

        /** @see getNextLocalJournalEntries */
        fun getNextLocalJournalEntries(
            offset: String,
            params: WebhookGetNextLocalJournalEntriesParams =
                WebhookGetNextLocalJournalEntriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalEntries(params.toBuilder().offset(offset).build(), requestOptions)

        /** @see getNextLocalJournalEntries */
        fun getNextLocalJournalEntries(
            offset: String,
            params: WebhookGetNextLocalJournalEntriesParams =
                WebhookGetNextLocalJournalEntriesParams.none(),
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalEntries(offset, params, RequestOptions.none())

        /** @see getNextLocalJournalEntries */
        fun getNextLocalJournalEntries(
            params: WebhookGetNextLocalJournalEntriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getNextLocalJournalEntries */
        fun getNextLocalJournalEntries(
            params: WebhookGetNextLocalJournalEntriesParams
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalEntries(params, RequestOptions.none())

        /** @see getNextLocalJournalEntries */
        fun getNextLocalJournalEntries(
            offset: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getNextLocalJournalEntries(
                offset,
                WebhookGetNextLocalJournalEntriesParams.none(),
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
         * Returns a raw HTTP response for `get /webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [WebhookServiceAsync.listEventSubscriptions].
         */
        fun listEventSubscriptions(
            appId: Int
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listEventSubscriptions(appId, WebhookListEventSubscriptionsParams.none())

        /** @see listEventSubscriptions */
        fun listEventSubscriptions(
            appId: Int,
            params: WebhookListEventSubscriptionsParams =
                WebhookListEventSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listEventSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listEventSubscriptions */
        fun listEventSubscriptions(
            appId: Int,
            params: WebhookListEventSubscriptionsParams = WebhookListEventSubscriptionsParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listEventSubscriptions(appId, params, RequestOptions.none())

        /** @see listEventSubscriptions */
        fun listEventSubscriptions(
            params: WebhookListEventSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see listEventSubscriptions */
        fun listEventSubscriptions(
            params: WebhookListEventSubscriptionsParams
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listEventSubscriptions(params, RequestOptions.none())

        /** @see listEventSubscriptions */
        fun listEventSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listEventSubscriptions(
                appId,
                WebhookListEventSubscriptionsParams.none(),
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
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [WebhookServiceAsync.listSubscriptionFilters].
         */
        fun listSubscriptionFilters(
            subscriptionId: Long
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            listSubscriptionFilters(subscriptionId, WebhookListSubscriptionFiltersParams.none())

        /** @see listSubscriptionFilters */
        fun listSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookListSubscriptionFiltersParams =
                WebhookListSubscriptionFiltersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            listSubscriptionFilters(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see listSubscriptionFilters */
        fun listSubscriptionFilters(
            subscriptionId: Long,
            params: WebhookListSubscriptionFiltersParams =
                WebhookListSubscriptionFiltersParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            listSubscriptionFilters(subscriptionId, params, RequestOptions.none())

        /** @see listSubscriptionFilters */
        fun listSubscriptionFilters(
            params: WebhookListSubscriptionFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>>

        /** @see listSubscriptionFilters */
        fun listSubscriptionFilters(
            params: WebhookListSubscriptionFiltersParams
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            listSubscriptionFilters(params, RequestOptions.none())

        /** @see listSubscriptionFilters */
        fun listSubscriptionFilters(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            listSubscriptionFilters(
                subscriptionId,
                WebhookListSubscriptionFiltersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [WebhookServiceAsync.updateEventSubscription].
         */
        fun updateEventSubscription(
            subscriptionId: Int,
            params: WebhookUpdateEventSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateEventSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateEventSubscription */
        fun updateEventSubscription(
            subscriptionId: Int,
            params: WebhookUpdateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateEventSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateEventSubscription */
        fun updateEventSubscription(
            params: WebhookUpdateEventSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateEventSubscription(params, RequestOptions.none())

        /** @see updateEventSubscription */
        fun updateEventSubscription(
            params: WebhookUpdateEventSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

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
    }
}
