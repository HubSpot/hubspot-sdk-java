// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.timeline

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.timeline.BatchInputAppEventOccurrence
import com.hubspot.sdk.models.crm.timeline.BatchResponseAppEventOccurrence
import com.hubspot.sdk.models.crm.timeline.batch.BatchCreateParams
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    fun create(params: BatchCreateParams): BatchResponseAppEventOccurrence =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseAppEventOccurrence

    /** @see create */
    fun create(
        batchInputAppEventOccurrence: BatchInputAppEventOccurrence,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseAppEventOccurrence =
        create(
            BatchCreateParams.builder()
                .batchInputAppEventOccurrence(batchInputAppEventOccurrence)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputAppEventOccurrence: BatchInputAppEventOccurrence
    ): BatchResponseAppEventOccurrence = create(batchInputAppEventOccurrence, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/2026-03/events/batch`, but is
         * otherwise the same as [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponseAppEventOccurrence> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseAppEventOccurrence>

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputAppEventOccurrence: BatchInputAppEventOccurrence,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseAppEventOccurrence> =
            create(
                BatchCreateParams.builder()
                    .batchInputAppEventOccurrence(batchInputAppEventOccurrence)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputAppEventOccurrence: BatchInputAppEventOccurrence
        ): HttpResponseFor<BatchResponseAppEventOccurrence> =
            create(batchInputAppEventOccurrence, RequestOptions.none())
    }
}
