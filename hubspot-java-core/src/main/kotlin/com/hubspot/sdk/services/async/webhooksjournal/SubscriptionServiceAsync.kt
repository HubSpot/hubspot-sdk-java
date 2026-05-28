// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AppLifecycleEventSubscriptionUpsertRequest
import com.hubspot.sdk.models.AssociationSubscriptionUpsertRequest
import com.hubspot.sdk.models.GdprPrivacyDeletionSubscriptionUpsertRequest
import com.hubspot.sdk.models.ListMembershipSubscriptionUpsertRequest
import com.hubspot.sdk.models.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.SubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooksjournal.JournalCollectionResponseSubscriptionResponseNoPaging
import com.hubspot.sdk.models.webhooksjournal.JournalSubscriptionResponse
import com.hubspot.sdk.models.webhooksjournal.subscriptions.SubscriptionCreateParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.SubscriptionDeleteForPortalParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.SubscriptionDeleteParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.SubscriptionGetParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.SubscriptionListParams
import com.hubspot.sdk.services.async.webhooksjournal.subscriptions.FilterServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    fun filters(): FilterServiceAsync

    /**
     * Create a new subscription in the Webhooks Journal for the specified version. This endpoint
     * allows you to define the subscription details by providing the necessary information in the
     * request body. It supports various types of subscriptions, including object, association,
     * event, app lifecycle event, list membership, and GDPR privacy deletion. Ensure that all
     * required fields are included in the request to successfully create a subscription.
     */
    fun create(params: SubscriptionCreateParams): CompletableFuture<JournalSubscriptionResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse>

    /** @see create */
    fun create(
        subscriptionUpsertRequest: SubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(
            SubscriptionCreateParams.builder()
                .subscriptionUpsertRequest(subscriptionUpsertRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        subscriptionUpsertRequest: SubscriptionUpsertRequest
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(subscriptionUpsertRequest, RequestOptions.none())

    /** @see create */
    fun create(
        object_: ObjectSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(SubscriptionUpsertRequest.ofObject(object_), requestOptions)

    /** @see create */
    fun create(
        object_: ObjectSubscriptionUpsertRequest
    ): CompletableFuture<JournalSubscriptionResponse> = create(object_, RequestOptions.none())

    /** @see create */
    fun create(
        association: AssociationSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(SubscriptionUpsertRequest.ofAssociation(association), requestOptions)

    /** @see create */
    fun create(
        association: AssociationSubscriptionUpsertRequest
    ): CompletableFuture<JournalSubscriptionResponse> = create(association, RequestOptions.none())

    /** @see create */
    fun create(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent), requestOptions)

    /** @see create */
    fun create(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(appLifecycleEvent, RequestOptions.none())

    /** @see create */
    fun create(
        listMembership: ListMembershipSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(SubscriptionUpsertRequest.ofListMembership(listMembership), requestOptions)

    /** @see create */
    fun create(
        listMembership: ListMembershipSubscriptionUpsertRequest
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(listMembership, RequestOptions.none())

    /** @see create */
    fun create(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion), requestOptions)

    /** @see create */
    fun create(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
    ): CompletableFuture<JournalSubscriptionResponse> =
        create(gdprPrivacyDeletion, RequestOptions.none())

    /**
     * Retrieve a list of webhook journal subscriptions for the specified version. This endpoint
     * allows you to view all active subscriptions without pagination. It is useful for monitoring
     * and managing webhook subscriptions in your HubSpot account.
     */
    fun list(): CompletableFuture<JournalCollectionResponseSubscriptionResponseNoPaging> =
        list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalCollectionResponseSubscriptionResponseNoPaging>

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<JournalCollectionResponseSubscriptionResponseNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<JournalCollectionResponseSubscriptionResponseNoPaging> =
        list(SubscriptionListParams.none(), requestOptions)

    /**
     * Delete a specific webhook journal subscription using its unique identifier. This operation is
     * useful for managing and cleaning up subscriptions that are no longer needed in your HubSpot
     * account.
     */
    fun delete(subscriptionId: Long): CompletableFuture<Void?> =
        delete(subscriptionId, SubscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        subscriptionId: Long,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        subscriptionId: Long,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(subscriptionId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

    /**
     * Delete a webhook journal subscription for a specific portal. This operation removes the
     * subscription associated with the given portalId, ensuring that no further webhook events are
     * sent for this portal. Use this endpoint to manage and clean up subscriptions that are no
     * longer needed.
     */
    fun deleteForPortal(portalId: Long): CompletableFuture<Void?> =
        deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none())

    /** @see deleteForPortal */
    fun deleteForPortal(
        portalId: Long,
        params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteForPortal(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deleteForPortal */
    fun deleteForPortal(
        portalId: Long,
        params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
    ): CompletableFuture<Void?> = deleteForPortal(portalId, params, RequestOptions.none())

    /** @see deleteForPortal */
    fun deleteForPortal(
        params: SubscriptionDeleteForPortalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteForPortal */
    fun deleteForPortal(params: SubscriptionDeleteForPortalParams): CompletableFuture<Void?> =
        deleteForPortal(params, RequestOptions.none())

    /** @see deleteForPortal */
    fun deleteForPortal(portalId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none(), requestOptions)

    /**
     * Retrieve details of a specific webhook subscription using its unique identifier. This
     * endpoint is useful for obtaining information about a particular subscription, such as its
     * actions, object type, and associated properties.
     */
    fun get(subscriptionId: Long): CompletableFuture<JournalSubscriptionResponse> =
        get(subscriptionId, SubscriptionGetParams.none())

    /** @see get */
    fun get(
        subscriptionId: Long,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see get */
    fun get(
        subscriptionId: Long,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
    ): CompletableFuture<JournalSubscriptionResponse> =
        get(subscriptionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JournalSubscriptionResponse>

    /** @see get */
    fun get(params: SubscriptionGetParams): CompletableFuture<JournalSubscriptionResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<JournalSubscriptionResponse> =
        get(subscriptionId, SubscriptionGetParams.none(), requestOptions)

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubscriptionServiceAsync.WithRawResponse

        fun filters(): FilterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [SubscriptionServiceAsync.create].
         */
        fun create(
            params: SubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>>

        /** @see create */
        fun create(
            subscriptionUpsertRequest: SubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(
                SubscriptionCreateParams.builder()
                    .subscriptionUpsertRequest(subscriptionUpsertRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            subscriptionUpsertRequest: SubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(subscriptionUpsertRequest, RequestOptions.none())

        /** @see create */
        fun create(
            object_: ObjectSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(SubscriptionUpsertRequest.ofObject(object_), requestOptions)

        /** @see create */
        fun create(
            object_: ObjectSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(object_, RequestOptions.none())

        /** @see create */
        fun create(
            association: AssociationSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(SubscriptionUpsertRequest.ofAssociation(association), requestOptions)

        /** @see create */
        fun create(
            association: AssociationSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(association, RequestOptions.none())

        /** @see create */
        fun create(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent), requestOptions)

        /** @see create */
        fun create(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(appLifecycleEvent, RequestOptions.none())

        /** @see create */
        fun create(
            listMembership: ListMembershipSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(SubscriptionUpsertRequest.ofListMembership(listMembership), requestOptions)

        /** @see create */
        fun create(
            listMembership: ListMembershipSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(listMembership, RequestOptions.none())

        /** @see create */
        fun create(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(
                SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion),
                requestOptions,
            )

        /** @see create */
        fun create(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            create(gdprPrivacyDeletion, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        fun list():
            CompletableFuture<
                HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging>
            > = list(SubscriptionListParams.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging>>

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<
            HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging>
        > = list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        fun delete(subscriptionId: Long): CompletableFuture<HttpResponse> =
            delete(subscriptionId, SubscriptionDeleteParams.none())

        /** @see delete */
        fun delete(
            subscriptionId: Long,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            subscriptionId: Long,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SubscriptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.deleteForPortal].
         */
        fun deleteForPortal(portalId: Long): CompletableFuture<HttpResponse> =
            deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none())

        /** @see deleteForPortal */
        fun deleteForPortal(
            portalId: Long,
            params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteForPortal(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deleteForPortal */
        fun deleteForPortal(
            portalId: Long,
            params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteForPortal(portalId, params, RequestOptions.none())

        /** @see deleteForPortal */
        fun deleteForPortal(
            params: SubscriptionDeleteForPortalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteForPortal */
        fun deleteForPortal(
            params: SubscriptionDeleteForPortalParams
        ): CompletableFuture<HttpResponse> = deleteForPortal(params, RequestOptions.none())

        /** @see deleteForPortal */
        fun deleteForPortal(
            portalId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.get].
         */
        fun get(
            subscriptionId: Long
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            get(subscriptionId, SubscriptionGetParams.none())

        /** @see get */
        fun get(
            subscriptionId: Long,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see get */
        fun get(
            subscriptionId: Long,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            get(subscriptionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>>

        /** @see get */
        fun get(
            params: SubscriptionGetParams
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JournalSubscriptionResponse>> =
            get(subscriptionId, SubscriptionGetParams.none(), requestOptions)
    }
}
