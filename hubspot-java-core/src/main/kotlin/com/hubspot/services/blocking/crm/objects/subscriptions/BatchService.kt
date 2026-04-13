// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects.subscriptions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot.models.crm.objects.subscriptions.batch.BatchCreateParams
import com.hubspot.models.crm.objects.subscriptions.batch.BatchDeleteParams
import com.hubspot.models.crm.objects.subscriptions.batch.BatchGetParams
import com.hubspot.models.crm.objects.subscriptions.batch.BatchUpdateParams
import com.hubspot.models.crm.objects.subscriptions.batch.BatchUpsertParams
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

    /**
     * Create multiple subscription objects in a single batch operation, allowing for efficient data
     * entry and management.
     */
    fun create(params: BatchCreateParams): BatchResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see create */
    fun create(
        batchInputSimplePublicObjectBatchInputForCreate:
            BatchInputSimplePublicObjectBatchInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        create(
            BatchCreateParams.builder()
                .batchInputSimplePublicObjectBatchInputForCreate(
                    batchInputSimplePublicObjectBatchInputForCreate
                )
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputSimplePublicObjectBatchInputForCreate:
            BatchInputSimplePublicObjectBatchInputForCreate
    ): BatchResponseSimplePublicObject =
        create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

    /**
     * Update multiple subscription objects in a single batch operation, allowing for efficient
     * modifications of CRM subscription records.
     */
    fun update(params: BatchUpdateParams): BatchResponseSimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        update(
            BatchUpdateParams.builder()
                .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
    ): BatchResponseSimplePublicObject =
        update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

    /** Archive a batch of subscription objects by providing their IDs in the request body. */
    fun delete(params: BatchDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BatchDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            BatchDeleteParams.builder()
                .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId) =
        delete(batchInputSimplePublicObjectId, RequestOptions.none())

    /**
     * Retrieve a batch of CRM subscription objects by their IDs, including specified properties and
     * their histories.
     */
    fun get(params: BatchGetParams): BatchResponseSimplePublicObject =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        get(
            BatchGetParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): BatchResponseSimplePublicObject =
        get(batchReadInputSimplePublicObjectId, RequestOptions.none())

    /**
     * This endpoint allows you to perform a batch upsert operation on subscription objects, which
     * will either update existing records or create new ones if they do not already exist. The
     * operation returns the status, timestamps, and a list of successfully processed objects.
     */
    fun upsert(params: BatchUpsertParams): BatchResponseSimplePublicUpsertObject =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject

    /** @see upsert */
    fun upsert(
        batchInputSimplePublicObjectBatchInputUpsert: BatchInputSimplePublicObjectBatchInputUpsert,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject =
        upsert(
            BatchUpsertParams.builder()
                .batchInputSimplePublicObjectBatchInputUpsert(
                    batchInputSimplePublicObjectBatchInputUpsert
                )
                .build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(
        batchInputSimplePublicObjectBatchInputUpsert: BatchInputSimplePublicObjectBatchInputUpsert
    ): BatchResponseSimplePublicUpsertObject =
        upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions/batch/create`,
         * but is otherwise the same as [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputSimplePublicObjectBatchInputForCreate:
                BatchInputSimplePublicObjectBatchInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(
                BatchCreateParams.builder()
                    .batchInputSimplePublicObjectBatchInputForCreate(
                        batchInputSimplePublicObjectBatchInputForCreate
                    )
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputSimplePublicObjectBatchInputForCreate:
                BatchInputSimplePublicObjectBatchInputForCreate
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions/batch/update`,
         * but is otherwise the same as [BatchService.update].
         */
        @MustBeClosed
        fun update(params: BatchUpdateParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(
                BatchUpdateParams.builder()
                    .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                    .build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions/batch/archive`,
         * but is otherwise the same as [BatchService.delete].
         */
        @MustBeClosed
        fun delete(params: BatchDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                BatchDeleteParams.builder()
                    .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId): HttpResponse =
            delete(batchInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions/batch/read`, but
         * is otherwise the same as [BatchService.get].
         */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see get */
        @MustBeClosed
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(
                BatchGetParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see get */
        @MustBeClosed
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(batchReadInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions/batch/upsert`,
         * but is otherwise the same as [BatchService.upsert].
         */
        @MustBeClosed
        fun upsert(
            params: BatchUpsertParams
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject>

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(
                BatchUpsertParams.builder()
                    .batchInputSimplePublicObjectBatchInputUpsert(
                        batchInputSimplePublicObjectBatchInputUpsert
                    )
                    .build(),
                requestOptions,
            )

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())
    }
}
