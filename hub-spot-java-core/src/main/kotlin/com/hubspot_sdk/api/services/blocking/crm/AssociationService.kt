// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.AssociationCreateParams
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.associations.AssociationReadParams
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociation
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociationMulti
import com.hubspot_sdk.api.services.blocking.crm.associations.SchemaService
import com.hubspot_sdk.api.services.blocking.crm.associations.V4Service
import java.util.function.Consumer

interface AssociationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService

    fun schema(): SchemaService

    fun v4(): V4Service

    fun create(
        toObjectType: String,
        params: AssociationCreateParams,
    ): BatchResponsePublicAssociation = create(toObjectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectType: String,
        params: AssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociation =
        create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see create */
    fun create(params: AssociationCreateParams): BatchResponsePublicAssociation =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociation

    fun delete(toObjectType: String, params: AssociationDeleteParams) =
        delete(toObjectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectType: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun read(
        toObjectType: String,
        params: AssociationReadParams,
    ): BatchResponsePublicAssociationMulti = read(toObjectType, params, RequestOptions.none())

    /** @see read */
    fun read(
        toObjectType: String,
        params: AssociationReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMulti =
        read(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see read */
    fun read(params: AssociationReadParams): BatchResponsePublicAssociationMulti =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: AssociationReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicAssociationMulti

    /**
     * A view of [AssociationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse

        fun schema(): SchemaService.WithRawResponse

        fun v4(): V4Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/create`, but is otherwise the
         * same as [AssociationService.create].
         */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: AssociationCreateParams,
        ): HttpResponseFor<BatchResponsePublicAssociation> =
            create(toObjectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: AssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociation> =
            create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: AssociationCreateParams
        ): HttpResponseFor<BatchResponsePublicAssociation> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociation>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/archive`, but is otherwise the
         * same as [AssociationService.delete].
         */
        @MustBeClosed
        fun delete(toObjectType: String, params: AssociationDeleteParams): HttpResponse =
            delete(toObjectType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toObjectType: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AssociationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise the
         * same as [AssociationService.read].
         */
        @MustBeClosed
        fun read(
            toObjectType: String,
            params: AssociationReadParams,
        ): HttpResponseFor<BatchResponsePublicAssociationMulti> =
            read(toObjectType, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            toObjectType: String,
            params: AssociationReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMulti> =
            read(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(
            params: AssociationReadParams
        ): HttpResponseFor<BatchResponsePublicAssociationMulti> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: AssociationReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicAssociationMulti>
    }
}
