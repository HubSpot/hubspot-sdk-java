// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponseAssociationSpecWithLabelNoPaging
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionListParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DefinitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionServiceAsync

    /** Create a user defined association definition */
    fun create(
        toObjectType: String,
        params: DefinitionCreateParams,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        create(toObjectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectType: String,
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see create */
    fun create(
        params: DefinitionCreateParams
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging>

    /** Update a user defined association definition */
    fun update(toObjectType: String, params: DefinitionUpdateParams): CompletableFuture<Void?> =
        update(toObjectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        toObjectType: String,
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see update */
    fun update(params: DefinitionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns all association types between two object types */
    fun list(
        toObjectType: String,
        params: DefinitionListParams,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: DefinitionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(
        params: DefinitionListParams
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DefinitionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging>

    /** Deletes an association definition */
    fun delete(associationTypeId: Int, params: DefinitionDeleteParams): CompletableFuture<Void?> =
        delete(associationTypeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        associationTypeId: Int,
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DefinitionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DefinitionServiceAsync] that provides access to raw HTTP responses for each
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
        ): DefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionServiceAsync.create].
         */
        fun create(
            toObjectType: String,
            params: DefinitionCreateParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            create(toObjectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            toObjectType: String,
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: DefinitionCreateParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionServiceAsync.update].
         */
        fun update(
            toObjectType: String,
            params: DefinitionUpdateParams,
        ): CompletableFuture<HttpResponse> = update(toObjectType, params, RequestOptions.none())

        /** @see update */
        fun update(
            toObjectType: String,
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see update */
        fun update(params: DefinitionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionServiceAsync.list].
         */
        fun list(
            toObjectType: String,
            params: DefinitionListParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            toObjectType: String,
            params: DefinitionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        fun list(
            params: DefinitionListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DefinitionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels/{associationTypeId}`, but is
         * otherwise the same as [DefinitionServiceAsync.delete].
         */
        fun delete(
            associationTypeId: Int,
            params: DefinitionDeleteParams,
        ): CompletableFuture<HttpResponse> =
            delete(associationTypeId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            associationTypeId: Int,
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

        /** @see delete */
        fun delete(params: DefinitionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
