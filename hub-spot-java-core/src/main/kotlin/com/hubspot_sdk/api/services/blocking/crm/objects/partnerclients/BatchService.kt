// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects.partnerclients

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.partnerclients.batch.BatchBatchGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.batch.BatchBatchUpdateParams
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

    /** Read a batch of objects by internal ID, or unique property values */
    fun batchGet(params: BatchBatchGetParams): BatchResponseSimplePublicObject =
        batchGet(params, RequestOptions.none())

    /** @see batchGet */
    fun batchGet(
        params: BatchBatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see batchGet */
    fun batchGet(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        batchGet(
            BatchBatchGetParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see batchGet */
    fun batchGet(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): BatchResponseSimplePublicObject =
        batchGet(batchReadInputSimplePublicObjectId, RequestOptions.none())

    /** Update a batch of objects */
    fun batchUpdate(params: BatchBatchUpdateParams): BatchResponseSimplePublicObject =
        batchUpdate(params, RequestOptions.none())

    /** @see batchUpdate */
    fun batchUpdate(
        params: BatchBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        batchUpdate(
            BatchBatchUpdateParams.builder()
                .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                .build(),
            requestOptions,
        )

    /** @see batchUpdate */
    fun batchUpdate(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
    ): BatchResponseSimplePublicObject =
        batchUpdate(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/partner_clients/batch/read`, but is
         * otherwise the same as [BatchService.batchGet].
         */
        @MustBeClosed
        fun batchGet(
            params: BatchBatchGetParams
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            batchGet(params, RequestOptions.none())

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            params: BatchBatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            batchGet(
                BatchBatchGetParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see batchGet */
        @MustBeClosed
        fun batchGet(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            batchGet(batchReadInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/partner_clients/batch/update`, but
         * is otherwise the same as [BatchService.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(
            params: BatchBatchUpdateParams
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            batchUpdate(params, RequestOptions.none())

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            params: BatchBatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            batchUpdate(
                BatchBatchUpdateParams.builder()
                    .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                    .build(),
                requestOptions,
            )

        /** @see batchUpdate */
        @MustBeClosed
        fun batchUpdate(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            batchUpdate(batchInputSimplePublicObjectBatchInput, RequestOptions.none())
    }
}
