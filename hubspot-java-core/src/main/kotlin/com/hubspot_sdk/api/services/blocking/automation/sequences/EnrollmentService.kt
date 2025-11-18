// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.sequences

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentLiteResponse
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentResponse
import com.hubspot_sdk.api.models.automation.sequences.enrollments.EnrollmentEnrollParams
import com.hubspot_sdk.api.models.automation.sequences.enrollments.EnrollmentGetByContactIdParams
import java.util.function.Consumer

interface EnrollmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnrollmentService

    /** Enroll a contact into a sequence using the specified user ID and sequence details. */
    fun enroll(params: EnrollmentEnrollParams): PublicSequenceEnrollmentLiteResponse =
        enroll(params, RequestOptions.none())

    /** @see enroll */
    fun enroll(
        params: EnrollmentEnrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceEnrollmentLiteResponse

    /** Get the enrollment status of a contact in sequences by their contact ID. */
    fun getByContactId(contactId: String): PublicSequenceEnrollmentResponse =
        getByContactId(contactId, EnrollmentGetByContactIdParams.none())

    /** @see getByContactId */
    fun getByContactId(
        contactId: String,
        params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceEnrollmentResponse =
        getByContactId(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see getByContactId */
    fun getByContactId(
        contactId: String,
        params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
    ): PublicSequenceEnrollmentResponse = getByContactId(contactId, params, RequestOptions.none())

    /** @see getByContactId */
    fun getByContactId(
        params: EnrollmentGetByContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSequenceEnrollmentResponse

    /** @see getByContactId */
    fun getByContactId(params: EnrollmentGetByContactIdParams): PublicSequenceEnrollmentResponse =
        getByContactId(params, RequestOptions.none())

    /** @see getByContactId */
    fun getByContactId(
        contactId: String,
        requestOptions: RequestOptions,
    ): PublicSequenceEnrollmentResponse =
        getByContactId(contactId, EnrollmentGetByContactIdParams.none(), requestOptions)

    /** A view of [EnrollmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnrollmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/v4/sequences/enrollments`, but is
         * otherwise the same as [EnrollmentService.enroll].
         */
        @MustBeClosed
        fun enroll(
            params: EnrollmentEnrollParams
        ): HttpResponseFor<PublicSequenceEnrollmentLiteResponse> =
            enroll(params, RequestOptions.none())

        /** @see enroll */
        @MustBeClosed
        fun enroll(
            params: EnrollmentEnrollParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentLiteResponse>

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/sequences/enrollments/contact/{contactId}`, but is otherwise the same as
         * [EnrollmentService.getByContactId].
         */
        @MustBeClosed
        fun getByContactId(contactId: String): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getByContactId(contactId, EnrollmentGetByContactIdParams.none())

        /** @see getByContactId */
        @MustBeClosed
        fun getByContactId(
            contactId: String,
            params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getByContactId(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see getByContactId */
        @MustBeClosed
        fun getByContactId(
            contactId: String,
            params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getByContactId(contactId, params, RequestOptions.none())

        /** @see getByContactId */
        @MustBeClosed
        fun getByContactId(
            params: EnrollmentGetByContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSequenceEnrollmentResponse>

        /** @see getByContactId */
        @MustBeClosed
        fun getByContactId(
            params: EnrollmentGetByContactIdParams
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getByContactId(params, RequestOptions.none())

        /** @see getByContactId */
        @MustBeClosed
        fun getByContactId(
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> =
            getByContactId(contactId, EnrollmentGetByContactIdParams.none(), requestOptions)
    }
}
