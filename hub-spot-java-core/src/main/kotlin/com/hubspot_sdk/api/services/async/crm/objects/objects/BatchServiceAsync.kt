// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.objects.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.objects.objects.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.objects.objects.batch.BatchReadParams
import com.hubspot_sdk.api.models.crm.objects.objects.batch.BatchUpdateParams
import com.hubspot_sdk.api.models.crm.objects.objects.batch.BatchUpsertParams
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

    /** Create a batch of objects */
    fun create(
        objectType: String,
        params: BatchCreateParams,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** Update a batch of objects by internal ID, or unique property values */
    fun update(
        objectType: String,
        params: BatchUpdateParams,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: BatchUpdateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** Archive a batch of objects by ID */
    fun delete(objectType: String, params: BatchDeleteParams): CompletableFuture<Void?> =
        delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: BatchDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve records by record ID or include the `idProperty` parameter to retrieve records by a
     * custom unique value property.
     */
    fun read(
        objectType: String,
        params: BatchReadParams,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        read(objectType, params, RequestOptions.none())

    /** @see read */
    fun read(
        objectType: String,
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        read(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see read */
    fun read(params: BatchReadParams): CompletableFuture<BatchResponseSimplePublicObject> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /**
     * Create or update records identified by a unique property value as specified by the
     * `idProperty` query param. `idProperty` query param refers to a property whose values are
     * unique for the object.
     */
    fun upsert(
        objectType: String,
        params: BatchUpsertParams,
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(objectType, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        objectType: String,
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject>

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
         * Returns a raw HTTP response for `post /crm/v3/objects/{objectType}/batch/create`, but is
         * otherwise the same as [BatchServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: BatchCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/{objectType}/batch/update`, but is
         * otherwise the same as [BatchServiceAsync.update].
         */
        fun update(
            objectType: String,
            params: BatchUpdateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(objectType, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectType: String,
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        fun update(
            params: BatchUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BatchUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/{objectType}/batch/archive`, but is
         * otherwise the same as [BatchServiceAsync.delete].
         */
        fun delete(objectType: String, params: BatchDeleteParams): CompletableFuture<HttpResponse> =
            delete(objectType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectType: String,
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        fun delete(params: BatchDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/{objectType}/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.read].
         */
        fun read(
            objectType: String,
            params: BatchReadParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            read(objectType, params, RequestOptions.none())

        /** @see read */
        fun read(
            objectType: String,
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            read(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see read */
        fun read(
            params: BatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/{objectType}/batch/upsert`, but is
         * otherwise the same as [BatchServiceAsync.upsert].
         */
        fun upsert(
            objectType: String,
            params: BatchUpsertParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(objectType, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            objectType: String,
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            params: BatchUpsertParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>>
    }
}
