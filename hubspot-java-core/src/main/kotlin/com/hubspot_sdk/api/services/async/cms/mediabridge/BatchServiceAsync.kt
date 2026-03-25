// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchResponseProperty
import com.hubspot_sdk.api.models.cms.mediabridge.batch.BatchCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.batch.BatchGetParams
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

    /** Create a batch of properties of the specified object type. */
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

    /** Archive a batch of existing properties for the specified types. */
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

    /** Get the details for a batch of properties for a specified object type. */
    fun get(objectType: String, params: BatchGetParams): CompletableFuture<BatchResponseProperty> =
        get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectType: String,
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseProperty> =
        get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(params: BatchGetParams): CompletableFuture<BatchResponseProperty> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
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
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/properties/{objectType}/batch/create`, but is otherwise the
         * same as [BatchServiceAsync.create].
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
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/properties/{objectType}/batch/archive`, but is otherwise
         * the same as [BatchServiceAsync.delete].
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
         * Returns a raw HTTP response for `post
         * /media-bridge/2026-03/{appId}/properties/{objectType}/batch/read`, but is otherwise the
         * same as [BatchServiceAsync.get].
         */
        fun get(
            objectType: String,
            params: BatchGetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            get(objectType, params, RequestOptions.none())

        /** @see get */
        fun get(
            objectType: String,
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        fun get(params: BatchGetParams): CompletableFuture<HttpResponseFor<BatchResponseProperty>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>>
    }
}
