// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.sequences

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentLiteResponse
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentRequest
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentResponse
import com.hubspot_sdk.api.models.automation.sequences.enrollments.EnrollmentEnrollParams
import com.hubspot_sdk.api.models.automation.sequences.enrollments.EnrollmentGetByContactIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EnrollmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnrollmentServiceAsync

    /** Enroll a contact into a sequence using the specified user ID and sequence details. */
    fun enroll(
        params: EnrollmentEnrollParams
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse> =
        enroll(params, RequestOptions.none())

    /** @see enroll */
    fun enroll(
        params: EnrollmentEnrollParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse>

    /** @see enroll */
    fun enroll(
        publicSequenceEnrollmentRequest: PublicSequenceEnrollmentRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse> =
        enroll(
            EnrollmentEnrollParams.builder()
                .publicSequenceEnrollmentRequest(publicSequenceEnrollmentRequest)
                .build(),
            requestOptions,
        )

    /** @see enroll */
    fun enroll(
        publicSequenceEnrollmentRequest: PublicSequenceEnrollmentRequest
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse> =
        enroll(publicSequenceEnrollmentRequest, RequestOptions.none())

    /** Get the enrollment status of a contact in sequences by their contact ID. */
    fun getByContactId(contactId: String): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getByContactId(contactId, EnrollmentGetByContactIdParams.none())

    /** @see getByContactId */
    fun getByContactId(
        contactId: String,
        params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getByContactId(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see getByContactId */
    fun getByContactId(
        contactId: String,
        params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getByContactId(contactId, params, RequestOptions.none())

    /** @see getByContactId */
    fun getByContactId(
        params: EnrollmentGetByContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceEnrollmentResponse>

    /** @see getByContactId */
    fun getByContactId(
        params: EnrollmentGetByContactIdParams
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getByContactId(params, RequestOptions.none())

    /** @see getByContactId */
    fun getByContactId(
        contactId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getByContactId(contactId, EnrollmentGetByContactIdParams.none(), requestOptions)

    /**
     * A view of [EnrollmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): EnrollmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automation/v4/sequences/enrollments`, but is
         * otherwise the same as [EnrollmentServiceAsync.enroll].
         */
        fun enroll(
            params: EnrollmentEnrollParams
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>> =
            enroll(params, RequestOptions.none())

        /** @see enroll */
        fun enroll(
            params: EnrollmentEnrollParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>>

        /** @see enroll */
        fun enroll(
            publicSequenceEnrollmentRequest: PublicSequenceEnrollmentRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>> =
            enroll(
                EnrollmentEnrollParams.builder()
                    .publicSequenceEnrollmentRequest(publicSequenceEnrollmentRequest)
                    .build(),
                requestOptions,
            )

        /** @see enroll */
        fun enroll(
            publicSequenceEnrollmentRequest: PublicSequenceEnrollmentRequest
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>> =
            enroll(publicSequenceEnrollmentRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /automation/v4/sequences/enrollments/contact/{contactId}`, but is otherwise the same as
         * [EnrollmentServiceAsync.getByContactId].
         */
        fun getByContactId(
            contactId: String
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getByContactId(contactId, EnrollmentGetByContactIdParams.none())

        /** @see getByContactId */
        fun getByContactId(
            contactId: String,
            params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getByContactId(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see getByContactId */
        fun getByContactId(
            contactId: String,
            params: EnrollmentGetByContactIdParams = EnrollmentGetByContactIdParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getByContactId(contactId, params, RequestOptions.none())

        /** @see getByContactId */
        fun getByContactId(
            params: EnrollmentGetByContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>>

        /** @see getByContactId */
        fun getByContactId(
            params: EnrollmentGetByContactIdParams
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getByContactId(params, RequestOptions.none())

        /** @see getByContactId */
        fun getByContactId(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getByContactId(contactId, EnrollmentGetByContactIdParams.none(), requestOptions)
    }
}
