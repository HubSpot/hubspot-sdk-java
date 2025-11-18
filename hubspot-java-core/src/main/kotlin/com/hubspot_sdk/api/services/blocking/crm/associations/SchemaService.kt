// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.schema.CollectionResponsePublicAssociationDefinitionNoPaging
import com.hubspot_sdk.api.models.crm.associations.schema.SchemaListParams
import com.hubspot_sdk.api.services.blocking.crm.associations.schema.V4Service
import java.util.function.Consumer

interface SchemaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaService

    fun v4(): V4Service

    fun list(
        toObjectType: String,
        params: SchemaListParams,
    ): CollectionResponsePublicAssociationDefinitionNoPaging =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: SchemaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionNoPaging =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: SchemaListParams): CollectionResponsePublicAssociationDefinitionNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SchemaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicAssociationDefinitionNoPaging

    /** A view of [SchemaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaService.WithRawResponse

        fun v4(): V4Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/types`, but is otherwise the same as
         * [SchemaService.list].
         */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: SchemaListParams,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: SchemaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging>
    }
}
