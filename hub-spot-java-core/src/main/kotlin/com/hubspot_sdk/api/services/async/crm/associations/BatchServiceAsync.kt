// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociation
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociationMulti
import com.hubspot_sdk.api.models.crm.associations.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchGetParams
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

    fun create(
        toObjectType: String,
        params: BatchCreateParams,
    ): CompletableFuture<BatchResponsePublicAssociation> =
        create(toObjectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectType: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociation> =
        create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): CompletableFuture<BatchResponsePublicAssociation> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociation>

    fun delete(toObjectType: String, params: BatchDeleteParams): CompletableFuture<Void?> =
        delete(toObjectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectType: String,
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: BatchDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun get(
        toObjectType: String,
        params: BatchGetParams,
    ): CompletableFuture<BatchResponsePublicAssociationMulti> =
        get(toObjectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        toObjectType: String,
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMulti> =
        get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see get */
    fun get(params: BatchGetParams): CompletableFuture<BatchResponsePublicAssociationMulti> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMulti>

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
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/create`, but is otherwise the
         * same as [BatchServiceAsync.create].
         */
        fun create(
            toObjectType: String,
            params: BatchCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>> =
            create(toObjectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            toObjectType: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>> =
            create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/archive`, but is otherwise the
         * same as [BatchServiceAsync.delete].
         */
        fun delete(
            toObjectType: String,
            params: BatchDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(toObjectType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            toObjectType: String,
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

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
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise the
         * same as [BatchServiceAsync.get].
         */
        fun get(
            toObjectType: String,
            params: BatchGetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>> =
            get(toObjectType, params, RequestOptions.none())

        /** @see get */
        fun get(
            toObjectType: String,
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>> =
            get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see get */
        fun get(
            params: BatchGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>>
    }
}
