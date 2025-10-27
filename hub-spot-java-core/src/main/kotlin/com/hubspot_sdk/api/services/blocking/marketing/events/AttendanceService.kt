// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.BatchResponseSubscriberEmailResponse
import com.hubspot_sdk.api.models.marketing.events.BatchResponseSubscriberVidResponse
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByEventIdAndEmailParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByExternalEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByExternalEventIdAndEmailParams
import java.util.function.Consumer

interface AttendanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttendanceService

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
    ): BatchResponseSubscriberVidResponse =
        createByEventIdAndContactId(subscriberState, params, RequestOptions.none())

    /** @see createByEventIdAndContactId */
    fun createByEventIdAndContactId(
        subscriberState: String,
        params: AttendanceCreateByEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberVidResponse =
        createByEventIdAndContactId(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByEventIdAndContactId */
    fun createByEventIdAndContactId(
        params: AttendanceCreateByEventIdAndContactIdParams
    ): BatchResponseSubscriberVidResponse =
        createByEventIdAndContactId(params, RequestOptions.none())

    /** @see createByEventIdAndContactId */
    fun createByEventIdAndContactId(
        params: AttendanceCreateByEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberVidResponse

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
    ): BatchResponseSubscriberEmailResponse =
        createByEventIdAndEmail(subscriberState, params, RequestOptions.none())

    /** @see createByEventIdAndEmail */
    fun createByEventIdAndEmail(
        subscriberState: String,
        params: AttendanceCreateByEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberEmailResponse =
        createByEventIdAndEmail(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByEventIdAndEmail */
    fun createByEventIdAndEmail(
        params: AttendanceCreateByEventIdAndEmailParams
    ): BatchResponseSubscriberEmailResponse = createByEventIdAndEmail(params, RequestOptions.none())

    /** @see createByEventIdAndEmail */
    fun createByEventIdAndEmail(
        params: AttendanceCreateByEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberEmailResponse

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
    ): BatchResponseSubscriberVidResponse =
        createByExternalEventIdAndContactId(subscriberState, params, RequestOptions.none())

    /** @see createByExternalEventIdAndContactId */
    fun createByExternalEventIdAndContactId(
        subscriberState: String,
        params: AttendanceCreateByExternalEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberVidResponse =
        createByExternalEventIdAndContactId(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByExternalEventIdAndContactId */
    fun createByExternalEventIdAndContactId(
        params: AttendanceCreateByExternalEventIdAndContactIdParams
    ): BatchResponseSubscriberVidResponse =
        createByExternalEventIdAndContactId(params, RequestOptions.none())

    /** @see createByExternalEventIdAndContactId */
    fun createByExternalEventIdAndContactId(
        params: AttendanceCreateByExternalEventIdAndContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberVidResponse

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
    ): BatchResponseSubscriberEmailResponse =
        createByExternalEventIdAndEmail(subscriberState, params, RequestOptions.none())

    /** @see createByExternalEventIdAndEmail */
    fun createByExternalEventIdAndEmail(
        subscriberState: String,
        params: AttendanceCreateByExternalEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberEmailResponse =
        createByExternalEventIdAndEmail(
            params.toBuilder().subscriberState(subscriberState).build(),
            requestOptions,
        )

    /** @see createByExternalEventIdAndEmail */
    fun createByExternalEventIdAndEmail(
        params: AttendanceCreateByExternalEventIdAndEmailParams
    ): BatchResponseSubscriberEmailResponse =
        createByExternalEventIdAndEmail(params, RequestOptions.none())

    /** @see createByExternalEventIdAndEmail */
    fun createByExternalEventIdAndEmail(
        params: AttendanceCreateByExternalEventIdAndEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriberEmailResponse

    /** A view of [AttendanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttendanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/{objectId}/attendance/{subscriberState}/create`, but is
         * otherwise the same as [AttendanceService.createByEventIdAndContactId].
         */
        @MustBeClosed
        fun createByEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndContactIdParams,
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> =
            createByEventIdAndContactId(subscriberState, params, RequestOptions.none())

        /** @see createByEventIdAndContactId */
        @MustBeClosed
        fun createByEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> =
            createByEventIdAndContactId(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByEventIdAndContactId */
        @MustBeClosed
        fun createByEventIdAndContactId(
            params: AttendanceCreateByEventIdAndContactIdParams
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> =
            createByEventIdAndContactId(params, RequestOptions.none())

        /** @see createByEventIdAndContactId */
        @MustBeClosed
        fun createByEventIdAndContactId(
            params: AttendanceCreateByEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberVidResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/{objectId}/attendance/{subscriberState}/email-create`, but
         * is otherwise the same as [AttendanceService.createByEventIdAndEmail].
         */
        @MustBeClosed
        fun createByEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndEmailParams,
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> =
            createByEventIdAndEmail(subscriberState, params, RequestOptions.none())

        /** @see createByEventIdAndEmail */
        @MustBeClosed
        fun createByEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> =
            createByEventIdAndEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByEventIdAndEmail */
        @MustBeClosed
        fun createByEventIdAndEmail(
            params: AttendanceCreateByEventIdAndEmailParams
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> =
            createByEventIdAndEmail(params, RequestOptions.none())

        /** @see createByEventIdAndEmail */
        @MustBeClosed
        fun createByEventIdAndEmail(
            params: AttendanceCreateByEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/attendance/{externalEventId}/{subscriberState}/create`,
         * but is otherwise the same as [AttendanceService.createByExternalEventIdAndContactId].
         */
        @MustBeClosed
        fun createByExternalEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndContactIdParams,
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> =
            createByExternalEventIdAndContactId(subscriberState, params, RequestOptions.none())

        /** @see createByExternalEventIdAndContactId */
        @MustBeClosed
        fun createByExternalEventIdAndContactId(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> =
            createByExternalEventIdAndContactId(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByExternalEventIdAndContactId */
        @MustBeClosed
        fun createByExternalEventIdAndContactId(
            params: AttendanceCreateByExternalEventIdAndContactIdParams
        ): HttpResponseFor<BatchResponseSubscriberVidResponse> =
            createByExternalEventIdAndContactId(params, RequestOptions.none())

        /** @see createByExternalEventIdAndContactId */
        @MustBeClosed
        fun createByExternalEventIdAndContactId(
            params: AttendanceCreateByExternalEventIdAndContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberVidResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/marketing-events/attendance/{externalEventId}/{subscriberState}/email-create`,
         * but is otherwise the same as [AttendanceService.createByExternalEventIdAndEmail].
         */
        @MustBeClosed
        fun createByExternalEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndEmailParams,
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> =
            createByExternalEventIdAndEmail(subscriberState, params, RequestOptions.none())

        /** @see createByExternalEventIdAndEmail */
        @MustBeClosed
        fun createByExternalEventIdAndEmail(
            subscriberState: String,
            params: AttendanceCreateByExternalEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> =
            createByExternalEventIdAndEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see createByExternalEventIdAndEmail */
        @MustBeClosed
        fun createByExternalEventIdAndEmail(
            params: AttendanceCreateByExternalEventIdAndEmailParams
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse> =
            createByExternalEventIdAndEmail(params, RequestOptions.none())

        /** @see createByExternalEventIdAndEmail */
        @MustBeClosed
        fun createByExternalEventIdAndEmail(
            params: AttendanceCreateByExternalEventIdAndEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriberEmailResponse>
    }
}
