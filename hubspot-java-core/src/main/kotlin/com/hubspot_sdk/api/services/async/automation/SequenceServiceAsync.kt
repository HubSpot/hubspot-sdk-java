// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceResponse
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListPageAsync
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import com.hubspot_sdk.api.services.async.automation.sequences.EnrollmentServiceAsync
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

    fun enrollments(): EnrollmentServiceAsync

    /** Retrieve a list of sequences that belong to a specific user. */
    fun list(params: SequenceListParams): CompletableFuture<SequenceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SequenceListPageAsync>

    /** Retrieve details of a specific sequence by its ID. */
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

        fun enrollments(): EnrollmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automation/v4/sequences/`, but is otherwise the
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
         * Returns a raw HTTP response for `get /automation/v4/sequences/{sequenceId}`, but is
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
    }
}
