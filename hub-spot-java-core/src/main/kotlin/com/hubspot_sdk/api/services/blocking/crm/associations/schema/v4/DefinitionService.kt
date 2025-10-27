// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponseAssociationSpecWithLabelNoPaging
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionListParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionUpdateParams
import java.util.function.Consumer

interface DefinitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService

    /** Create a user defined association definition */
    fun create(
        toObjectType: String,
        params: DefinitionCreateParams,
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        create(toObjectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectType: String,
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see create */
    fun create(params: DefinitionCreateParams): CollectionResponseAssociationSpecWithLabelNoPaging =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging

    /** Update a user defined association definition */
    fun update(toObjectType: String, params: DefinitionUpdateParams) =
        update(toObjectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        toObjectType: String,
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see update */
    fun update(params: DefinitionUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Returns all association types between two object types */
    fun list(
        toObjectType: String,
        params: DefinitionListParams,
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: DefinitionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: DefinitionListParams): CollectionResponseAssociationSpecWithLabelNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DefinitionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationSpecWithLabelNoPaging

    /** Deletes an association definition */
    fun delete(associationTypeId: Int, params: DefinitionDeleteParams) =
        delete(associationTypeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        associationTypeId: Int,
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DefinitionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [DefinitionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionService.create].
         */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: DefinitionCreateParams,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            create(toObjectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            toObjectType: String,
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            create(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: DefinitionCreateParams
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionService.update].
         */
        @MustBeClosed
        fun update(toObjectType: String, params: DefinitionUpdateParams): HttpResponse =
            update(toObjectType, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            toObjectType: String,
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DefinitionUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels`, but is otherwise the same
         * as [DefinitionService.list].
         */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: DefinitionListParams,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: DefinitionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: DefinitionListParams
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DefinitionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v4/associations/{fromObjectType}/{toObjectType}/labels/{associationTypeId}`, but is
         * otherwise the same as [DefinitionService.delete].
         */
        @MustBeClosed
        fun delete(associationTypeId: Int, params: DefinitionDeleteParams): HttpResponse =
            delete(associationTypeId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            associationTypeId: Int,
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().associationTypeId(associationTypeId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: DefinitionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
