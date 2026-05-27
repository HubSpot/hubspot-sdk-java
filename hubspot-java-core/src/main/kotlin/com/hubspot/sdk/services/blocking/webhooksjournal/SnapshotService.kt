// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.CrmObjectSnapshotBatchResponse
import com.hubspot.sdk.models.webhooksjournal.snapshots.SnapshotCreateParams
import java.util.function.Consumer

interface SnapshotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService

    /**
     * Create a batch of CRM object snapshots in HubSpot. This endpoint is used to capture the
     * current state of specified CRM objects for later reference or analysis. It requires a JSON
     * payload containing the details of the CRM objects to snapshot. This operation is exempt from
     * daily and ten-secondly rate limits.
     */
    fun create(params: SnapshotCreateParams): CrmObjectSnapshotBatchResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse

    /** @see create */
    fun create(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CrmObjectSnapshotBatchResponse =
        create(
            SnapshotCreateParams.builder()
                .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
    ): CrmObjectSnapshotBatchResponse = create(crmObjectSnapshotBatchRequest, RequestOptions.none())

    /** A view of [SnapshotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/snapshots/2026-03/crm`, but is
         * otherwise the same as [SnapshotService.create].
         */
        @MustBeClosed
        fun create(params: SnapshotCreateParams): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            create(
                SnapshotCreateParams.builder()
                    .crmObjectSnapshotBatchRequest(crmObjectSnapshotBatchRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            crmObjectSnapshotBatchRequest: CrmObjectSnapshotBatchRequest
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> =
            create(crmObjectSnapshotBatchRequest, RequestOptions.none())
    }
}
