// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.AssociationCreateParams
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.associations.AssociationReadParams
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociation
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociationMulti
import com.hubspot_sdk.api.services.async.crm.associations.SchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.V4ServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssociationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync

    fun schema(): SchemaServiceAsync

    fun v4(): V4ServiceAsync

    fun create(
        toObjectType: String,
        params: AssociationCreateParams,
    ): CompletableFuture<BatchResponsePublicAssociation> =
        create(toObjectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectType: String,
        params: AssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociation> =
        create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see create */
    fun create(params: AssociationCreateParams): CompletableFuture<BatchResponsePublicAssociation> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociation>

    fun delete(toObjectType: String, params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(toObjectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectType: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun read(
        toObjectType: String,
        params: AssociationReadParams,
    ): CompletableFuture<BatchResponsePublicAssociationMulti> =
        read(toObjectType, params, RequestOptions.none())

    /** @see read */
    fun read(
        toObjectType: String,
        params: AssociationReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMulti> =
        read(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see read */
    fun read(
        params: AssociationReadParams
    ): CompletableFuture<BatchResponsePublicAssociationMulti> = read(params, RequestOptions.none())

    /** @see read */
    fun read(
        params: AssociationReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicAssociationMulti>

    /**
     * A view of [AssociationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationServiceAsync.WithRawResponse

        fun schema(): SchemaServiceAsync.WithRawResponse

        fun v4(): V4ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/create`, but is otherwise the
         * same as [AssociationServiceAsync.create].
         */
        fun create(
            toObjectType: String,
            params: AssociationCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>> =
            create(toObjectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            toObjectType: String,
            params: AssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>> =
            create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: AssociationCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/archive`, but is otherwise the
         * same as [AssociationServiceAsync.delete].
         */
        fun delete(
            toObjectType: String,
            params: AssociationDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(toObjectType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            toObjectType: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see delete */
        fun delete(params: AssociationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/read`, but is otherwise the
         * same as [AssociationServiceAsync.read].
         */
        fun read(
            toObjectType: String,
            params: AssociationReadParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>> =
            read(toObjectType, params, RequestOptions.none())

        /** @see read */
        fun read(
            toObjectType: String,
            params: AssociationReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>> =
            read(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see read */
        fun read(
            params: AssociationReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            params: AssociationReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>>
    }
}
