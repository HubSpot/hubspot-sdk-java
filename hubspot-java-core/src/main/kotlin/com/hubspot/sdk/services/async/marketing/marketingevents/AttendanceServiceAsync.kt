// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.marketingevents

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.marketing.marketingevents.BatchResponseSubscriberEmailResponse
import com.hubspot.sdk.models.marketing.marketingevents.BatchResponseSubscriberVidResponse
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByEventIdAndContactIdParams
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByEventIdAndEmailParams
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByExternalEventIdAndContactIdParams
import com.hubspot.sdk.models.marketing.marketingevents.attendance.AttendanceCreateByExternalEventIdAndEmailParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttendanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttendanceServiceAsync

    /**
     * Records the participation of multiple HubSpot contacts in a Marketing Event using their
     * HubSpot contact IDs.
     *
     * Additional Functionality:
     * - Adds a timeline event to the contacts.
     *
     * Allowed Properties: For the state "attend":
     * - joinedAt
     * - leftAt
     */
    fun createByEventIdAndContactId(
        subscriberState: String,
        params: AttendanceCreateByEventIdAndContactIdParams,
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        createByEventIdAndContactId(subscriberState, params, RequestOptions.none())

    /** @see createByEventIdAndContactId */
    fun createByEventIdAndContactId(
        subscriberState: String,
        params: AttendanceCreateByEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        createByEventIdAndContactId(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByEventIdAndContactId */
    fun createByEventIdAndContactId(
        params: AttendanceCreateByEventIdAndContactIdParams
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        createByEventIdAndContactId(params, RequestOptions.none())

    /** @see createByEventIdAndContactId */
    fun createByEventIdAndContactId(
        params: AttendanceCreateByEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberVidResponse>

    /**
     * Records the participation of multiple HubSpot contacts in a Marketing Event using their email
     * addresses.
     *
     * If a contact does not exist, it will be automatically created. The contactProperties field is
     * used exclusively for creating new contacts and will not update properties of existing
     * contacts.
     *
     * Additional Functionality:
     * - Adds a timeline event to the contacts.
     *
     * Allowed Properties: For the state "attend":
     * - joinedAt
     * - leftAt
     */
    fun createByEventIdAndEmail(
        subscriberState: String,
        params: AttendanceCreateByEventIdAndEmailParams,
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        createByEventIdAndEmail(subscriberState, params, RequestOptions.none())

    /** @see createByEventIdAndEmail */
    fun createByEventIdAndEmail(
        subscriberState: String,
        params: AttendanceCreateByEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        createByEventIdAndEmail(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByEventIdAndEmail */
    fun createByEventIdAndEmail(
        params: AttendanceCreateByEventIdAndEmailParams
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        createByEventIdAndEmail(params, RequestOptions.none())

    /** @see createByEventIdAndEmail */
    fun createByEventIdAndEmail(
        params: AttendanceCreateByEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberEmailResponse>

    /**
     * Records the participation of multiple HubSpot contacts in a Marketing Event using their
     * HubSpot contact IDs.
     *
     * Additional Functionality:
     * - Adds a timeline event to the contacts.
     *
     * Allowed Properties: For the state "attend":
     * - joinedAt
     * - leftAt
     */
    fun createByExternalEventIdAndContactId(
        subscriberState: String,
        params: AttendanceCreateByExternalEventIdAndContactIdParams,
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        createByExternalEventIdAndContactId(subscriberState, params, RequestOptions.none())

    /** @see createByExternalEventIdAndContactId */
    fun createByExternalEventIdAndContactId(
        subscriberState: String,
        params: AttendanceCreateByExternalEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        createByExternalEventIdAndContactId(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByExternalEventIdAndContactId */
    fun createByExternalEventIdAndContactId(
        params: AttendanceCreateByExternalEventIdAndContactIdParams
    ): CompletableFuture<BatchResponseSubscriberVidResponse> =
        createByExternalEventIdAndContactId(params, RequestOptions.none())

    /** @see createByExternalEventIdAndContactId */
    fun createByExternalEventIdAndContactId(
        params: AttendanceCreateByExternalEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberVidResponse>

    /**
     * Records the participation of multiple HubSpot contacts in a Marketing Event using their email
     * addresses.
     *
     * If a contact does not exist, it will be automatically created. The contactProperties field is
     * used exclusively for creating new contacts and will not update properties of existing
     * contacts.
     *
     * Additional Functionality:
     * - Adds a timeline event to the contacts.
     *
     * Allowed Properties: For the state "attend":
     * - joinedAt
     * - leftAt
     */
    fun createByExternalEventIdAndEmail(
        subscriberState: String,
        params: AttendanceCreateByExternalEventIdAndEmailParams,
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        createByExternalEventIdAndEmail(subscriberState, params, RequestOptions.none())

    /** @see createByExternalEventIdAndEmail */
    fun createByExternalEventIdAndEmail(
        subscriberState: String,
        params: AttendanceCreateByExternalEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        createByExternalEventIdAndEmail(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByExternalEventIdAndEmail */
    fun createByExternalEventIdAndEmail(
        params: AttendanceCreateByExternalEventIdAndEmailParams
    ): CompletableFuture<BatchResponseSubscriberEmailResponse> =
        createByExternalEventIdAndEmail(params, RequestOptions.none())

    /** @see createByExternalEventIdAndEmail */
    fun createByExternalEventIdAndEmail(
        params: AttendanceCreateByExternalEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriberEmailResponse>

    /**
     * A view of [AttendanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): AttendanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/{objectId}/attendance/{subscriberState}/create`, but
         * is otherwise the same as [AttendanceServiceAsync.createByEventIdAndContactId].
         */
        fun createByEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndContactIdParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> =
            createByEventIdAndContactId(subscriberState, params, RequestOptions.none())

        /** @see createByEventIdAndContactId */
        fun createByEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> =
            createByEventIdAndContactId(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByEventIdAndContactId */
        fun createByEventIdAndContactId(
            params: AttendanceCreateByEventIdAndContactIdParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> =
            createByEventIdAndContactId(params, RequestOptions.none())

        /** @see createByEventIdAndContactId */
        fun createByEventIdAndContactId(
            params: AttendanceCreateByEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/{objectId}/attendance/{subscriberState}/email-create`,
         * but is otherwise the same as [AttendanceServiceAsync.createByEventIdAndEmail].
         */
        fun createByEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndEmailParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> =
            createByEventIdAndEmail(subscriberState, params, RequestOptions.none())

        /** @see createByEventIdAndEmail */
        fun createByEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> =
            createByEventIdAndEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByEventIdAndEmail */
        fun createByEventIdAndEmail(
            params: AttendanceCreateByEventIdAndEmailParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> =
            createByEventIdAndEmail(params, RequestOptions.none())

        /** @see createByEventIdAndEmail */
        fun createByEventIdAndEmail(
            params: AttendanceCreateByEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/attendance/{externalEventId}/{subscriberState}/create`,
         * but is otherwise the same as
         * [AttendanceServiceAsync.createByExternalEventIdAndContactId].
         */
        fun createByExternalEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndContactIdParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> =
            createByExternalEventIdAndContactId(subscriberState, params, RequestOptions.none())

        /** @see createByExternalEventIdAndContactId */
        fun createByExternalEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> =
            createByExternalEventIdAndContactId(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByExternalEventIdAndContactId */
        fun createByExternalEventIdAndContactId(
            params: AttendanceCreateByExternalEventIdAndContactIdParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>> =
            createByExternalEventIdAndContactId(params, RequestOptions.none())

        /** @see createByExternalEventIdAndContactId */
        fun createByExternalEventIdAndContactId(
            params: AttendanceCreateByExternalEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberVidResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/attendance/{externalEventId}/{subscriberState}/email-create`,
         * but is otherwise the same as [AttendanceServiceAsync.createByExternalEventIdAndEmail].
         */
        fun createByExternalEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndEmailParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> =
            createByExternalEventIdAndEmail(subscriberState, params, RequestOptions.none())

        /** @see createByExternalEventIdAndEmail */
        fun createByExternalEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> =
            createByExternalEventIdAndEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByExternalEventIdAndEmail */
        fun createByExternalEventIdAndEmail(
            params: AttendanceCreateByExternalEventIdAndEmailParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>> =
            createByExternalEventIdAndEmail(params, RequestOptions.none())

        /** @see createByExternalEventIdAndEmail */
        fun createByExternalEventIdAndEmail(
            params: AttendanceCreateByExternalEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriberEmailResponse>>
    }
}
