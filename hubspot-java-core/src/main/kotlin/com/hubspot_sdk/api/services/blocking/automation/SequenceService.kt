// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceResponse
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListPage
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import com.hubspot_sdk.api.services.blocking.automation.sequences.EnrollmentService
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

    fun enrollments(): EnrollmentService

    /** Retrieve a list of sequences that belong to a specific user. */
    fun list(params: SequenceListParams): SequenceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SequenceListPage

    /** Retrieve details of a specific sequence by its ID. */
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

    /** A view of [SequenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceService.WithRawResponse

        fun enrollments(): EnrollmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automation/v4/sequences/`, but is otherwise the
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
         * Returns a raw HTTP response for `get /automation/v4/sequences/{sequenceId}`, but is
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
    }
}
