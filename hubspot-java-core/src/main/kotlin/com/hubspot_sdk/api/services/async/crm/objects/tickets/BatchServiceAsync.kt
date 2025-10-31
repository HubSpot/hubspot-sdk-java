// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.tickets

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.tickets.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.objects.tickets.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.objects.tickets.batch.BatchGetParams
import com.hubspot_sdk.api.models.crm.objects.tickets.batch.BatchUpdateParams
import com.hubspot_sdk.api.models.crm.objects.tickets.batch.BatchUpsertParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /**
     * Create a batch of tickets. The `inputs` array can contain a `properties` object to define
     * property values for the ticket, along with an `associations` array to define
     * [associations](https://developers.hubspot.com/docs/guides/api/crm/associations/associations-v4)
     * with other CRM records.
     */
    fun create(params: BatchCreateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see create */
    fun create(
        batchInputSimplePublicObjectBatchInputForCreate:
            BatchInputSimplePublicObjectBatchInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
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
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

    /**
     * Update a batch of tickets by ID (`ticketId`) or unique property value (`idProperty`).
     * Provided property values will be overwritten. Read-only and non-existent properties will
     * result in an error. Properties values can be cleared by passing an empty string.
     */
    fun update(params: BatchUpdateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(
            BatchUpdateParams.builder()
                .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

    /**
     * Delete a batch of tickets by ID. Deleted tickets can be restored within 90 days of deletion.
     * Learn more about
     * [restoring records](https://knowledge.hubspot.com/records/restore-deleted-records).
     */
    fun delete(params: BatchDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(
            BatchDeleteParams.builder()
                .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId
    ): CompletableFuture<Void?> = delete(batchInputSimplePublicObjectId, RequestOptions.none())

    /** Retrieve a batch of tickets by ID (`ticketId`) or unique property value (`idProperty`). */
    fun get(params: BatchGetParams): CompletableFuture<BatchResponseSimplePublicObject> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(
            BatchGetParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(batchReadInputSimplePublicObjectId, RequestOptions.none())

    /**
     * Create or update records identified by a unique property value as specified by the
     * `idProperty` query param. `idProperty` query param refers to a property whose values are
     * unique for the object.
     */
    fun upsert(
        params: BatchUpsertParams
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject>

    /** @see upsert */
    fun upsert(
        batchInputSimplePublicObjectBatchInputUpsert: BatchInputSimplePublicObjectBatchInputUpsert,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
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
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets/batch/create`, but is
         * otherwise the same as [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see create */
        fun create(
            batchInputSimplePublicObjectBatchInputForCreate:
                BatchInputSimplePublicObjectBatchInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
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
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets/batch/update`, but is
         * otherwise the same as [BatchServiceAsync.update].
         */
        fun update(
            params: BatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see update */
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(
                BatchUpdateParams.builder()
                    .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                    .build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets/batch/archive`, but is
         * otherwise the same as [BatchServiceAsync.delete].
         */
        fun delete(params: BatchDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                BatchDeleteParams.builder()
                    .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId
        ): CompletableFuture<HttpResponse> =
            delete(batchInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.get].
         */
        fun get(
            params: BatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see get */
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(
                BatchGetParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see get */
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(batchReadInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets/batch/upsert`, but is
         * otherwise the same as [BatchServiceAsync.upsert].
         */
        fun upsert(
            params: BatchUpsertParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>>

        /** @see upsert */
        fun upsert(
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
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
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())
    }
}
