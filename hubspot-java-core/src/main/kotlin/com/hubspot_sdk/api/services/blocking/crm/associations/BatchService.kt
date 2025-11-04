// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociation
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociationMulti
import com.hubspot_sdk.api.models.crm.associations.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.batch.BatchGetParams
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

    fun create(toObjectType: String, params: BatchCreateParams): BatchResponsePublicAssociation =
        create(toObjectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectType: String,
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociation =
        create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see create */
    fun create(params: BatchCreateParams): BatchResponsePublicAssociation =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociation

    /**
     * This endpoint allows you to archive multiple associations between specified 'from' and 'to'
     * object types in a single batch request.
     */
    fun delete(toObjectType: String, params: BatchDeleteParams) =
        delete(toObjectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectType: String,
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: BatchDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BatchDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    fun get(toObjectType: String, params: BatchGetParams): BatchResponsePublicAssociationMulti =
        get(toObjectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        toObjectType: String,
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMulti =
        get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see get */
    fun get(params: BatchGetParams): BatchResponsePublicAssociationMulti =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMulti

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/create`, but is otherwise the
         * same as [BatchService.create].
         */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: BatchCreateParams,
        ): HttpResponseFor<BatchResponsePublicAssociation> =
            create(toObjectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociation> =
            create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchResponsePublicAssociation> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociation>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/archive`, but is otherwise the
         * same as [BatchService.delete].
         */
        @MustBeClosed
        fun delete(toObjectType: String, params: BatchDeleteParams): HttpResponse =
            delete(toObjectType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toObjectType: String,
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

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
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise the
         * same as [BatchService.get].
         */
        @MustBeClosed
        fun get(
            toObjectType: String,
            params: BatchGetParams,
        ): HttpResponseFor<BatchResponsePublicAssociationMulti> =
            get(toObjectType, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            toObjectType: String,
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMulti> =
            get(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<BatchResponsePublicAssociationMulti> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMulti>
    }
}
