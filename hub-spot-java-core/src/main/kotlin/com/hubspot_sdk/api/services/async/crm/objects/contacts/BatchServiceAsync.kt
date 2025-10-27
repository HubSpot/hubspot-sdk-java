// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.contacts

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
import com.hubspot_sdk.api.models.crm.objects.contacts.batch.BatchArchiveParams
import com.hubspot_sdk.api.models.crm.objects.contacts.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.objects.contacts.batch.BatchReadParams
import com.hubspot_sdk.api.models.crm.objects.contacts.batch.BatchUpdateParams
import com.hubspot_sdk.api.models.crm.objects.contacts.batch.BatchUpsertParams
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
     * Create a batch of contacts. The `inputs` array can contain a `properties` object to define
     * property values for each record, along with an `associations` array to define
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
     * Update a batch of contacts by ID (`contactId`) or unique property value (`idProperty`).
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
     * Archive a batch of contacts by ID. Archived contacts can be restored within 90 days of
     * deletion. Learn more about the
     * [data impacted by contact deletions](https://knowledge.hubspot.com/privacy-and-consent/understand-restorable-and-permanent-contact-deletions)
     * and how to
     * [restore archived records](https://knowledge.hubspot.com/records/restore-deleted-records).
     */
    fun archive(params: BatchArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: BatchArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(
            BatchArchiveParams.builder()
                .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see archive */
    fun archive(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId
    ): CompletableFuture<Void?> = archive(batchInputSimplePublicObjectId, RequestOptions.none())

    /** Retrieve a batch of contacts by ID (`contactId`) or unique property value (`idProperty`). */
    fun read(params: BatchReadParams): CompletableFuture<BatchResponseSimplePublicObject> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see read */
    fun read(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        read(
            BatchReadParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see read */
    fun read(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        read(batchReadInputSimplePublicObjectId, RequestOptions.none())

    /**
     * Upsert a batch of contacts. The `inputs` array can contain a `properties` object to define
     * property values for each record.
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
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/batch/create`, but is
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
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/batch/update`, but is
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
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/batch/archive`, but is
         * otherwise the same as [BatchServiceAsync.archive].
         */
        fun archive(params: BatchArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: BatchArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(
                BatchArchiveParams.builder()
                    .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see archive */
        fun archive(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId
        ): CompletableFuture<HttpResponse> =
            archive(batchInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.read].
         */
        fun read(
            params: BatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see read */
        fun read(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            read(
                BatchReadParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see read */
        fun read(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            read(batchReadInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/batch/upsert`, but is
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
