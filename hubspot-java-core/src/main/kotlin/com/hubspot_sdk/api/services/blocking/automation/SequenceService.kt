// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentLiteResponse
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentResponse
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceResponse
import com.hubspot_sdk.api.models.automation.sequences.SequenceCreateEnrollmentParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetEnrollmentByContactIdParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListPage
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import java.util.function.Consumer

interface SequenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceService

    /**
     * Retrieve a list of sequences available in your HubSpot account. This endpoint allows you to
     * filter sequences by user ID and name, and supports pagination for large result sets. Use this
     * endpoint to manage and review your sequences effectively.
     */
    fun list(params: SequenceListParams): SequenceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SequenceListPage

    /**
     * Enroll a contact into a sequence using the specified sequence ID and sender email. This
     * endpoint requires the user ID to be provided as a query parameter and a valid JSON body with
     * the necessary enrollment details. It is used to automate the process of enrolling contacts
     * into predefined sequences for streamlined communication.
     */
    fun createEnrollment(
        params: SequenceCreateEnrollmentParams
    ): PublicSequenceEnrollmentLiteResponse = createEnrollment(params, RequestOptions.none())

    /** @see createEnrollment */
    fun createEnrollment(
        params: SequenceCreateEnrollmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceEnrollmentLiteResponse

    /**
     * Retrieve details of a specific sequence in your HubSpot account using the sequence ID. This
     * endpoint requires the user ID to be specified and provides comprehensive information about
     * the sequence, including its steps and dependencies.
     */
    fun get(sequenceId: String, params: SequenceGetParams): PublicSequenceResponse =
        get(sequenceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        sequenceId: String,
        params: SequenceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceResponse =
        get(params.toBuilder().sequenceId(sequenceId).build(), requestOptions)

    /** @see get */
    fun get(params: SequenceGetParams): PublicSequenceResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SequenceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceResponse

    /**
     * Retrieve the sequence enrollment details for a specific contact in your HubSpot account. This
     * endpoint provides information about the sequence a contact is enrolled in, including
     * enrollment timestamps and the sequence's name. It is useful for tracking the progress and
     * status of a contact within a sequence.
     */
    fun getEnrollmentByContactId(contactId: String): PublicSequenceEnrollmentResponse =
        getEnrollmentByContactId(contactId, SequenceGetEnrollmentByContactIdParams.none())

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        contactId: String,
        params: SequenceGetEnrollmentByContactIdParams =
            SequenceGetEnrollmentByContactIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceEnrollmentResponse =
        getEnrollmentByContactId(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        contactId: String,
        params: SequenceGetEnrollmentByContactIdParams =
            SequenceGetEnrollmentByContactIdParams.none(),
    ): PublicSequenceEnrollmentResponse =
        getEnrollmentByContactId(contactId, params, RequestOptions.none())

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        params: SequenceGetEnrollmentByContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceEnrollmentResponse

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        params: SequenceGetEnrollmentByContactIdParams
    ): PublicSequenceEnrollmentResponse = getEnrollmentByContactId(params, RequestOptions.none())

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        contactId: String,
        requestOptions: RequestOptions,
    ): PublicSequenceEnrollmentResponse =
        getEnrollmentByContactId(
            contactId,
            SequenceGetEnrollmentByContactIdParams.none(),
            requestOptions,
        )

    /** A view of [SequenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automation/sequences/2026-03`, but is otherwise the
         * same as [SequenceService.list].
         */
        @MustBeClosed
        fun list(params: SequenceListParams): HttpResponseFor<SequenceListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SequenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SequenceListPage>

        /**
         * Returns a raw HTTP response for `post /automation/sequences/2026-03/enrollments`, but is
         * otherwise the same as [SequenceService.createEnrollment].
         */
        @MustBeClosed
        fun createEnrollment(
            params: SequenceCreateEnrollmentParams
        ): HttpResponseFor<PublicSequenceEnrollmentLiteResponse> =
            createEnrollment(params, RequestOptions.none())

        /** @see createEnrollment */
        @MustBeClosed
        fun createEnrollment(
            params: SequenceCreateEnrollmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentLiteResponse>

        /**
         * Returns a raw HTTP response for `get /automation/sequences/2026-03/{sequenceId}`, but is
         * otherwise the same as [SequenceService.get].
         */
        @MustBeClosed
        fun get(
            sequenceId: String,
            params: SequenceGetParams,
        ): HttpResponseFor<PublicSequenceResponse> = get(sequenceId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            sequenceId: String,
            params: SequenceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceResponse> =
            get(params.toBuilder().sequenceId(sequenceId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: SequenceGetParams): HttpResponseFor<PublicSequenceResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SequenceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceResponse>

        /**
         * Returns a raw HTTP response for `get
         * /automation/sequences/2026-03/enrollments/contact/{contactId}`, but is otherwise the same
         * as [SequenceService.getEnrollmentByContactId].
         */
        @MustBeClosed
        fun getEnrollmentByContactId(
            contactId: String
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getEnrollmentByContactId(contactId, SequenceGetEnrollmentByContactIdParams.none())

        /** @see getEnrollmentByContactId */
        @MustBeClosed
        fun getEnrollmentByContactId(
            contactId: String,
            params: SequenceGetEnrollmentByContactIdParams =
                SequenceGetEnrollmentByContactIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getEnrollmentByContactId(
                params.toBuilder().contactId(contactId).build(),
                requestOptions,
            )

        /** @see getEnrollmentByContactId */
        @MustBeClosed
        fun getEnrollmentByContactId(
            contactId: String,
            params: SequenceGetEnrollmentByContactIdParams =
                SequenceGetEnrollmentByContactIdParams.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getEnrollmentByContactId(contactId, params, RequestOptions.none())

        /** @see getEnrollmentByContactId */
        @MustBeClosed
        fun getEnrollmentByContactId(
            params: SequenceGetEnrollmentByContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentResponse>

        /** @see getEnrollmentByContactId */
        @MustBeClosed
        fun getEnrollmentByContactId(
            params: SequenceGetEnrollmentByContactIdParams
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getEnrollmentByContactId(params, RequestOptions.none())

        /** @see getEnrollmentByContactId */
        @MustBeClosed
        fun getEnrollmentByContactId(
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getEnrollmentByContactId(
                contactId,
                SequenceGetEnrollmentByContactIdParams.none(),
                requestOptions,
            )
    }
}
