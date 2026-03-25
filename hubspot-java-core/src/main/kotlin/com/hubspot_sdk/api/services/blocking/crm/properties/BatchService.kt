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
import com.hubspot_sdk.api.models.crm.properties.batch.BatchGetParams
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
     * Delete multiple properties in a single request. This method will return a 204 No Content
     * response on success regardless of the initial state of the property (e.g. active, already
     * archived, non-existent).
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

    /** Read a batch of properties. */
    fun get(objectType: String, params: BatchGetParams): BatchResponseProperty =
        get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectType: String,
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseProperty =
        get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(params: BatchGetParams): BatchResponseProperty = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
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
         * Returns a raw HTTP response for `post /crm/properties/2026-03/{objectType}/batch/create`,
         * but is otherwise the same as [BatchService.create].
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
         * Returns a raw HTTP response for `post
         * /crm/properties/2026-03/{objectType}/batch/archive`, but is otherwise the same as
         * [BatchService.delete].
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
         * Returns a raw HTTP response for `post /crm/properties/2026-03/{objectType}/batch/read`,
         * but is otherwise the same as [BatchService.get].
         */
        @MustBeClosed
        fun get(
            objectType: String,
            params: BatchGetParams,
        ): HttpResponseFor<BatchResponseProperty> = get(objectType, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectType: String,
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchResponseProperty> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseProperty>
    }
}
