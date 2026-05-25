// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.CrmObjectSnapshotBatchResponse
import com.hubspot.sdk.models.webhooksjournal.snapshots.SnapshotCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SnapshotServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotServiceAsync

    /**
     * Create a batch of CRM object snapshots in HubSpot. This endpoint is used to capture the
     * current state of specified CRM objects for later reference or analysis. It requires a JSON
     * payload containing the details of the CRM objects to snapshot. This operation is exempt from
     * daily and ten-secondly rate limits.
     */
    fun create(params: SnapshotCreateParams): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse>

    /** @see create */
    fun create(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        create(
            SnapshotCreateParams.builder()
                .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
    ): CompletableFuture<CrmObjectSnapshotBatchResponse> =
        create(crmObjectSnapshotBatchRequest, RequestOptions.none())

    /**
     * A view of [SnapshotServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapshotServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [SnapshotServiceAsync.create].
         */
        fun create(
            params: SnapshotCreateParams
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>>

        /** @see create */
        fun create(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            create(
                SnapshotCreateParams.builder()
                    .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
        ): CompletableFuture<HttpResponseFor<CrmObjectSnapshotBatchResponse>> =
            create(crmObjectSnapshotBatchRequest, RequestOptions.none())
    }
}
