// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.properties

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchResponseProperty
import com.hubspot_sdk.api.models.crm.properties.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.properties.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.properties.batch.BatchReadParams
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
     * Create a batch of properties using the same rules as when creating an individual property.
     */
    fun create(objectType: String, params: BatchCreateParams): BatchResponseProperty =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): BatchResponseProperty =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty

    /**
     * Archive a provided list of properties. This method will return a 204 No Content response on
     * success regardless of the initial state of the property (e.g. active, already archived,
     * non-existent).
     */
    fun delete(objectType: String, params: BatchDeleteParams) =
        delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: BatchDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BatchDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Read a provided list of properties. */
    fun read(objectType: String, params: BatchReadParams): BatchResponseProperty =
        read(objectType, params, RequestOptions.none())

    /** @see read */
    fun read(
        objectType: String,
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty =
        read(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see read */
    fun read(params: BatchReadParams): BatchResponseProperty = read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/properties/{objectType}/batch/create`, but
         * is otherwise the same as [BatchService.create].
         */
        @MustBeClosed
        fun create(
            objectType: String,
            params: BatchCreateParams,
        ): HttpResponseFor<BatchResponseProperty> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponseProperty> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty>

        /**
         * Returns a raw HTTP response for `post /crm/v3/properties/{objectType}/batch/archive`, but
         * is otherwise the same as [BatchService.delete].
         */
        @MustBeClosed
        fun delete(objectType: String, params: BatchDeleteParams): HttpResponse =
            delete(objectType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectType: String,
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: BatchDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/properties/{objectType}/batch/read`, but is
         * otherwise the same as [BatchService.read].
         */
        @MustBeClosed
        fun read(
            objectType: String,
            params: BatchReadParams,
        ): HttpResponseFor<BatchResponseProperty> = read(objectType, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            objectType: String,
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty> =
            read(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(params: BatchReadParams): HttpResponseFor<BatchResponseProperty> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty>
    }
}
