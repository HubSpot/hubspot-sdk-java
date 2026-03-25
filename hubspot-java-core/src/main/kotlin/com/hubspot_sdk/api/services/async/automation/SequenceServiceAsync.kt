// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentLiteResponse
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentResponse
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceResponse
import com.hubspot_sdk.api.models.automation.sequences.SequenceCreateEnrollmentParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetEnrollmentByContactIdParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListPageAsync
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SequenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceServiceAsync

    /**
     * Retrieve a list of sequences available in your HubSpot account. This endpoint allows you to
     * filter sequences by user ID and name, and supports pagination for large result sets. Use this
     * endpoint to manage and review your sequences effectively.
     */
    fun list(params: SequenceListParams): CompletableFuture<SequenceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SequenceListPageAsync>

    /**
     * Enroll a contact into a sequence using the specified sequence ID and sender email. This
     * endpoint requires the user ID to be provided as a query parameter and a valid JSON body with
     * the necessary enrollment details. It is used to automate the process of enrolling contacts
     * into predefined sequences for streamlined communication.
     */
    fun createEnrollment(
        params: SequenceCreateEnrollmentParams
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse> =
        createEnrollment(params, RequestOptions.none())

    /** @see createEnrollment */
    fun createEnrollment(
        params: SequenceCreateEnrollmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse>

    /**
     * Retrieve details of a specific sequence in your HubSpot account using the sequence ID. This
     * endpoint requires the user ID to be specified and provides comprehensive information about
     * the sequence, including its steps and dependencies.
     */
    fun get(
        sequenceId: String,
        params: SequenceGetParams,
    ): CompletableFuture<PublicSequenceResponse> = get(sequenceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        sequenceId: String,
        params: SequenceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceResponse> =
        get(params.toBuilder().sequenceId(sequenceId).build(), requestOptions)

    /** @see get */
    fun get(params: SequenceGetParams): CompletableFuture<PublicSequenceResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SequenceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceResponse>

    /**
     * Retrieve the sequence enrollment details for a specific contact in your HubSpot account. This
     * endpoint provides information about the sequence a contact is enrolled in, including
     * enrollment timestamps and the sequence's name. It is useful for tracking the progress and
     * status of a contact within a sequence.
     */
    fun getEnrollmentByContactId(
        contactId: String
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getEnrollmentByContactId(contactId, SequenceGetEnrollmentByContactIdParams.none())

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        contactId: String,
        params: SequenceGetEnrollmentByContactIdParams =
            SequenceGetEnrollmentByContactIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getEnrollmentByContactId(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        contactId: String,
        params: SequenceGetEnrollmentByContactIdParams =
            SequenceGetEnrollmentByContactIdParams.none(),
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getEnrollmentByContactId(contactId, params, RequestOptions.none())

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        params: SequenceGetEnrollmentByContactIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSequenceEnrollmentResponse>

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        params: SequenceGetEnrollmentByContactIdParams
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getEnrollmentByContactId(params, RequestOptions.none())

    /** @see getEnrollmentByContactId */
    fun getEnrollmentByContactId(
        contactId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        getEnrollmentByContactId(
            contactId,
            SequenceGetEnrollmentByContactIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [SequenceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SequenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automation/sequences/2026-03`, but is otherwise the
         * same as [SequenceServiceAsync.list].
         */
        fun list(
            params: SequenceListParams
        ): CompletableFuture<HttpResponseFor<SequenceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SequenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SequenceListPageAsync>>

        /**
         * Returns a raw HTTP response for `post /automation/sequences/2026-03/enrollments`, but is
         * otherwise the same as [SequenceServiceAsync.createEnrollment].
         */
        fun createEnrollment(
            params: SequenceCreateEnrollmentParams
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>> =
            createEnrollment(params, RequestOptions.none())

        /** @see createEnrollment */
        fun createEnrollment(
            params: SequenceCreateEnrollmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>>

        /**
         * Returns a raw HTTP response for `get /automation/sequences/2026-03/{sequenceId}`, but is
         * otherwise the same as [SequenceServiceAsync.get].
         */
        fun get(
            sequenceId: String,
            params: SequenceGetParams,
        ): CompletableFuture<HttpResponseFor<PublicSequenceResponse>> =
            get(sequenceId, params, RequestOptions.none())

        /** @see get */
        fun get(
            sequenceId: String,
            params: SequenceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceResponse>> =
            get(params.toBuilder().sequenceId(sequenceId).build(), requestOptions)

        /** @see get */
        fun get(
            params: SequenceGetParams
        ): CompletableFuture<HttpResponseFor<PublicSequenceResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SequenceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /automation/sequences/2026-03/enrollments/contact/{contactId}`, but is otherwise the same
         * as [SequenceServiceAsync.getEnrollmentByContactId].
         */
        fun getEnrollmentByContactId(
            contactId: String
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getEnrollmentByContactId(contactId, SequenceGetEnrollmentByContactIdParams.none())

        /** @see getEnrollmentByContactId */
        fun getEnrollmentByContactId(
            contactId: String,
            params: SequenceGetEnrollmentByContactIdParams =
                SequenceGetEnrollmentByContactIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getEnrollmentByContactId(
                params.toBuilder().contactId(contactId).build(),
                requestOptions,
            )

        /** @see getEnrollmentByContactId */
        fun getEnrollmentByContactId(
            contactId: String,
            params: SequenceGetEnrollmentByContactIdParams =
                SequenceGetEnrollmentByContactIdParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getEnrollmentByContactId(contactId, params, RequestOptions.none())

        /** @see getEnrollmentByContactId */
        fun getEnrollmentByContactId(
            params: SequenceGetEnrollmentByContactIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>>

        /** @see getEnrollmentByContactId */
        fun getEnrollmentByContactId(
            params: SequenceGetEnrollmentByContactIdParams
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getEnrollmentByContactId(params, RequestOptions.none())

        /** @see getEnrollmentByContactId */
        fun getEnrollmentByContactId(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> =
            getEnrollmentByContactId(
                contactId,
                SequenceGetEnrollmentByContactIdParams.none(),
                requestOptions,
            )
    }
}
