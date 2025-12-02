// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaListParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaListResponse
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaUpdateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchema
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectsSchemasObjectTypeDefinition
import com.hubspot_sdk.api.models.events.eventdefinitions.AssociationDefinition
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

    /** Update the schema for an existing object type */
    fun update(
        objectType: String,
        params: SchemaUpdateParams,
    ): CompletableFuture<ObjectsSchemasObjectTypeDefinition> =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectsSchemasObjectTypeDefinition> =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: SchemaUpdateParams): CompletableFuture<ObjectsSchemasObjectTypeDefinition> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectsSchemasObjectTypeDefinition>

    /** Get the schemas for all object types. */
    fun list(appId: Int): CompletableFuture<SchemaListResponse> =
        list(appId, SchemaListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: SchemaListParams = SchemaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SchemaListResponse> =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: SchemaListParams = SchemaListParams.none(),
    ): CompletableFuture<SchemaListResponse> = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SchemaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SchemaListResponse>

    /** @see list */
    fun list(params: SchemaListParams): CompletableFuture<SchemaListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(appId: Int, requestOptions: RequestOptions): CompletableFuture<SchemaListResponse> =
        list(appId, SchemaListParams.none(), requestOptions)

    /** Create a new association definition for the specified object type. */
    fun createAssociation(
        objectType: String,
        params: SchemaCreateAssociationParams,
    ): CompletableFuture<AssociationDefinition> =
        createAssociation(objectType, params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        objectType: String,
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationDefinition> =
        createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createAssociation */
    fun createAssociation(
        params: SchemaCreateAssociationParams
    ): CompletableFuture<AssociationDefinition> = createAssociation(params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationDefinition>

    /** Delete an existing association definition for an object type. */
    fun deleteAssociation(
        associationId: String,
        params: SchemaDeleteAssociationParams,
    ): CompletableFuture<Void?> = deleteAssociation(associationId, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationId: String,
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAssociation(params.toBuilder().associationId(associationId).build(), requestOptions)

    /** @see deleteAssociation */
    fun deleteAssociation(params: SchemaDeleteAssociationParams): CompletableFuture<Void?> =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the schema for a specified object type. */
    fun get(objectType: String, params: SchemaGetParams): CompletableFuture<ObjectSchema> =
        get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectType: String,
        params: SchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema> =
        get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(params: SchemaGetParams): CompletableFuture<ObjectSchema> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema>

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

        /**
         * Returns a raw HTTP response for `patch /media-bridge/v1/{appId}/schemas/{objectType}`,
         * but is otherwise the same as [SchemaServiceAsync.update].
         */
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
        ): CompletableFuture<HttpResponseFor<ObjectsSchemasObjectTypeDefinition>> =
            update(objectType, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectsSchemasObjectTypeDefinition>> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        fun update(
            params: SchemaUpdateParams
        ): CompletableFuture<HttpResponseFor<ObjectsSchemasObjectTypeDefinition>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectsSchemasObjectTypeDefinition>>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/schemas`, but is otherwise
         * the same as [SchemaServiceAsync.list].
         */
        fun list(appId: Int): CompletableFuture<HttpResponseFor<SchemaListResponse>> =
            list(appId, SchemaListParams.none())

        /** @see list */
        fun list(
            appId: Int,
            params: SchemaListParams = SchemaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SchemaListResponse>> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        fun list(
            appId: Int,
            params: SchemaListParams = SchemaListParams.none(),
        ): CompletableFuture<HttpResponseFor<SchemaListResponse>> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SchemaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SchemaListResponse>>

        /** @see list */
        fun list(params: SchemaListParams): CompletableFuture<HttpResponseFor<SchemaListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SchemaListResponse>> =
            list(appId, SchemaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/schemas/{objectType}/associations`, but is otherwise the same as
         * [SchemaServiceAsync.createAssociation].
         */
        fun createAssociation(
            objectType: String,
            params: SchemaCreateAssociationParams,
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createAssociation(objectType, params, RequestOptions.none())

        /** @see createAssociation */
        fun createAssociation(
            objectType: String,
            params: SchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createAssociation */
        fun createAssociation(
            params: SchemaCreateAssociationParams
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> =
            createAssociation(params, RequestOptions.none())

        /** @see createAssociation */
        fun createAssociation(
            params: SchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/schemas/{objectType}/associations/{associationId}`, but is
         * otherwise the same as [SchemaServiceAsync.deleteAssociation].
         */
        fun deleteAssociation(
            associationId: String,
            params: SchemaDeleteAssociationParams,
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(associationId, params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            associationId: String,
            params: SchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(
                params.toBuilder().associationId(associationId).build(),
                requestOptions,
            )

        /** @see deleteAssociation */
        fun deleteAssociation(
            params: SchemaDeleteAssociationParams
        ): CompletableFuture<HttpResponse> = deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            params: SchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/schemas/{objectType}`, but
         * is otherwise the same as [SchemaServiceAsync.get].
         */
        fun get(
            objectType: String,
            params: SchemaGetParams,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(objectType, params, RequestOptions.none())

        /** @see get */
        fun get(
            objectType: String,
            params: SchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        fun get(params: SchemaGetParams): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>>
    }
}
