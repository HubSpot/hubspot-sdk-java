// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.schema.CollectionResponsePublicAssociationDefinitionNoPaging
import com.hubspot_sdk.api.models.crm.associations.schema.SchemaListParams
import com.hubspot_sdk.api.services.async.crm.associations.schema.V4ServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SchemaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaServiceAsync

    fun v4(): V4ServiceAsync

    /** List all the valid association types available between two object types */
    fun list(
        toObjectType: String,
        params: SchemaListParams,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionNoPaging> =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: SchemaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionNoPaging> =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(
        params: SchemaListParams
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SchemaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionNoPaging>

    /**
     * A view of [SchemaServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SchemaServiceAsync.WithRawResponse

        fun v4(): V4ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/associations/{fromObjectType}/{toObjectType}/types`, but is otherwise the same as
         * [SchemaServiceAsync.list].
         */
        fun list(
            toObjectType: String,
            params: SchemaListParams,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging>
        > = list(toObjectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            toObjectType: String,
            params: SchemaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging>
        > = list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        fun list(
            params: SchemaListParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SchemaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging>>
    }
}
