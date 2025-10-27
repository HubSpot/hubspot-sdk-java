// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.properties

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchResponseProperty
import com.hubspot_sdk.api.models.crm.properties.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.properties.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.properties.batch.BatchReadParams
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
     * Create a batch of properties using the same rules as when creating an individual property.
     */
    fun create(
        objectType: String,
        params: BatchCreateParams,
    ): CompletableFuture<BatchResponseProperty> = create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): CompletableFuture<BatchResponseProperty> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty>

    /**
     * Archive a provided list of properties. This method will return a 204 No Content response on
     * success regardless of the initial state of the property (e.g. active, already archived,
     * non-existent).
     */
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

    /** Read a provided list of properties. */
    fun read(
        objectType: String,
        params: BatchReadParams,
    ): CompletableFuture<BatchResponseProperty> = read(objectType, params, RequestOptions.none())

    /** @see read */
    fun read(
        objectType: String,
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty> =
        read(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see read */
    fun read(params: BatchReadParams): CompletableFuture<BatchResponseProperty> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty>

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
         * Returns a raw HTTP response for `post /crm/v3/properties/{objectType}/batch/create`, but
         * is otherwise the same as [BatchServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: BatchCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>>

        /**
         * Returns a raw HTTP response for `post /crm/v3/properties/{objectType}/batch/archive`, but
         * is otherwise the same as [BatchServiceAsync.delete].
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
         * Returns a raw HTTP response for `post /crm/v3/properties/{objectType}/batch/read`, but is
         * otherwise the same as [BatchServiceAsync.read].
         */
        fun read(
            objectType: String,
            params: BatchReadParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            read(objectType, params, RequestOptions.none())

        /** @see read */
        fun read(
            objectType: String,
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            read(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see read */
        fun read(
            params: BatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>>
    }
}
