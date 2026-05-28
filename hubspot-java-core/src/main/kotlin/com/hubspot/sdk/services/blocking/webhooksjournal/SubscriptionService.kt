// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot.sdk.services.blocking.webhooksjournal.subscriptions.FilterService
import java.util.function.Consumer

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    fun filters(): FilterService

    /**
     * Create a new subscription in the Webhooks Journal for the specified version. This endpoint
     * allows you to define the subscription details by providing the necessary information in the
     * request body. It supports various types of subscriptions, including object, association,
     * event, app lifecycle event, list membership, and GDPR privacy deletion. Ensure that all
     * required fields are included in the request to successfully create a subscription.
     */
    fun create(params: SubscriptionCreateParams): JournalSubscriptionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse

    /** @see create */
    fun create(
        subscriptionUpsertRequest: SubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse =
        create(
            SubscriptionCreateParams.builder()
                .subscriptionUpsertRequest(subscriptionUpsertRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(subscriptionUpsertRequest: SubscriptionUpsertRequest): JournalSubscriptionResponse =
        create(subscriptionUpsertRequest, RequestOptions.none())

    /** @see create */
    fun create(
        object_: ObjectSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse =
        create(SubscriptionUpsertRequest.ofObject(object_), requestOptions)

    /** @see create */
    fun create(object_: ObjectSubscriptionUpsertRequest): JournalSubscriptionResponse =
        create(object_, RequestOptions.none())

    /** @see create */
    fun create(
        association: AssociationSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse =
        create(SubscriptionUpsertRequest.ofAssociation(association), requestOptions)

    /** @see create */
    fun create(association: AssociationSubscriptionUpsertRequest): JournalSubscriptionResponse =
        create(association, RequestOptions.none())

    /** @see create */
    fun create(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse =
        create(SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent), requestOptions)

    /** @see create */
    fun create(
        appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
    ): JournalSubscriptionResponse = create(appLifecycleEvent, RequestOptions.none())

    /** @see create */
    fun create(
        listMembership: ListMembershipSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse =
        create(SubscriptionUpsertRequest.ofListMembership(listMembership), requestOptions)

    /** @see create */
    fun create(
        listMembership: ListMembershipSubscriptionUpsertRequest
    ): JournalSubscriptionResponse = create(listMembership, RequestOptions.none())

    /** @see create */
    fun create(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse =
        create(SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion), requestOptions)

    /** @see create */
    fun create(
        gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
    ): JournalSubscriptionResponse = create(gdprPrivacyDeletion, RequestOptions.none())

    /**
     * Retrieve a list of webhook journal subscriptions for the specified version. This endpoint
     * allows you to view all active subscriptions without pagination. It is useful for monitoring
     * and managing webhook subscriptions in your HubSpot account.
     */
    fun list(): JournalCollectionResponseSubscriptionResponseNoPaging =
        list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalCollectionResponseSubscriptionResponseNoPaging

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): JournalCollectionResponseSubscriptionResponseNoPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): JournalCollectionResponseSubscriptionResponseNoPaging =
        list(SubscriptionListParams.none(), requestOptions)

    /**
     * Delete a specific webhook journal subscription using its unique identifier. This operation is
     * useful for managing and cleaning up subscriptions that are no longer needed in your HubSpot
     * account.
     */
    fun delete(subscriptionId: Long) = delete(subscriptionId, SubscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        subscriptionId: Long,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        subscriptionId: Long,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
    ) = delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(subscriptionId: Long, requestOptions: RequestOptions) =
        delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

    /**
     * Delete a webhook journal subscription for a specific portal. This operation removes the
     * subscription associated with the given portalId, ensuring that no further webhook events are
     * sent for this portal. Use this endpoint to manage and clean up subscriptions that are no
     * longer needed.
     */
    fun deleteForPortal(portalId: Long) =
        deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none())

    /** @see deleteForPortal */
    fun deleteForPortal(
        portalId: Long,
        params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteForPortal(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deleteForPortal */
    fun deleteForPortal(
        portalId: Long,
        params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
    ) = deleteForPortal(portalId, params, RequestOptions.none())

    /** @see deleteForPortal */
    fun deleteForPortal(
        params: SubscriptionDeleteForPortalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteForPortal */
    fun deleteForPortal(params: SubscriptionDeleteForPortalParams) =
        deleteForPortal(params, RequestOptions.none())

    /** @see deleteForPortal */
    fun deleteForPortal(portalId: Long, requestOptions: RequestOptions) =
        deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none(), requestOptions)

    /**
     * Retrieve details of a specific webhook subscription using its unique identifier. This
     * endpoint is useful for obtaining information about a particular subscription, such as its
     * actions, object type, and associated properties.
     */
    fun get(subscriptionId: Long): JournalSubscriptionResponse =
        get(subscriptionId, SubscriptionGetParams.none())

    /** @see get */
    fun get(
        subscriptionId: Long,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse =
        get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see get */
    fun get(
        subscriptionId: Long,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
    ): JournalSubscriptionResponse = get(subscriptionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JournalSubscriptionResponse

    /** @see get */
    fun get(params: SubscriptionGetParams): JournalSubscriptionResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(subscriptionId: Long, requestOptions: RequestOptions): JournalSubscriptionResponse =
        get(subscriptionId, SubscriptionGetParams.none(), requestOptions)

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        fun filters(): FilterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(params: SubscriptionCreateParams): HttpResponseFor<JournalSubscriptionResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            subscriptionUpsertRequest: SubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(
                SubscriptionCreateParams.builder()
                    .subscriptionUpsertRequest(subscriptionUpsertRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            subscriptionUpsertRequest: SubscriptionUpsertRequest
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(subscriptionUpsertRequest, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            object_: ObjectSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(SubscriptionUpsertRequest.ofObject(object_), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            object_: ObjectSubscriptionUpsertRequest
        ): HttpResponseFor<JournalSubscriptionResponse> = create(object_, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            association: AssociationSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(SubscriptionUpsertRequest.ofAssociation(association), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            association: AssociationSubscriptionUpsertRequest
        ): HttpResponseFor<JournalSubscriptionResponse> = create(association, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(appLifecycleEvent, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            listMembership: ListMembershipSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(SubscriptionUpsertRequest.ofListMembership(listMembership), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            listMembership: ListMembershipSubscriptionUpsertRequest
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(listMembership, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(
                SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ): HttpResponseFor<JournalSubscriptionResponse> =
            create(gdprPrivacyDeletion, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /webhooks-journal/subscriptions/2026-03`, but is
         * otherwise the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging> =
            list(SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<JournalCollectionResponseSubscriptionResponseNoPaging> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(subscriptionId: Long): HttpResponse =
            delete(subscriptionId, SubscriptionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: Long,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: Long,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        ): HttpResponse = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SubscriptionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(subscriptionId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/portals/{portalId}`, but is otherwise the same as
         * [SubscriptionService.deleteForPortal].
         */
        @MustBeClosed
        fun deleteForPortal(portalId: Long): HttpResponse =
            deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none())

        /** @see deleteForPortal */
        @MustBeClosed
        fun deleteForPortal(
            portalId: Long,
            params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteForPortal(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deleteForPortal */
        @MustBeClosed
        fun deleteForPortal(
            portalId: Long,
            params: SubscriptionDeleteForPortalParams = SubscriptionDeleteForPortalParams.none(),
        ): HttpResponse = deleteForPortal(portalId, params, RequestOptions.none())

        /** @see deleteForPortal */
        @MustBeClosed
        fun deleteForPortal(
            params: SubscriptionDeleteForPortalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteForPortal */
        @MustBeClosed
        fun deleteForPortal(params: SubscriptionDeleteForPortalParams): HttpResponse =
            deleteForPortal(params, RequestOptions.none())

        /** @see deleteForPortal */
        @MustBeClosed
        fun deleteForPortal(portalId: Long, requestOptions: RequestOptions): HttpResponse =
            deleteForPortal(portalId, SubscriptionDeleteForPortalParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.get].
         */
        @MustBeClosed
        fun get(subscriptionId: Long): HttpResponseFor<JournalSubscriptionResponse> =
            get(subscriptionId, SubscriptionGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            subscriptionId: Long,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            subscriptionId: Long,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
        ): HttpResponseFor<JournalSubscriptionResponse> =
            get(subscriptionId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JournalSubscriptionResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SubscriptionGetParams): HttpResponseFor<JournalSubscriptionResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JournalSubscriptionResponse> =
            get(subscriptionId, SubscriptionGetParams.none(), requestOptions)
    }
}
