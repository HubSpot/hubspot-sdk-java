// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.CollectionResponseObjectSchemaNoPaging
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaCreateAssociationResponse
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaListParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaUpdateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchema
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectTypeDefinition
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

    /** Update the schema for an existing object type */
    fun update(objectType: String, params: SchemaUpdateParams): ObjectTypeDefinition =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeDefinition =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: SchemaUpdateParams): ObjectTypeDefinition =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeDefinition

    /** Get the schemas for all object types. */
    fun list(appId: String): CollectionResponseObjectSchemaNoPaging =
        list(appId, SchemaListParams.none())

    /** @see list */
    fun list(
        appId: String,
        params: SchemaListParams = SchemaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: String,
        params: SchemaListParams = SchemaListParams.none(),
    ): CollectionResponseObjectSchemaNoPaging = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SchemaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging

    /** @see list */
    fun list(params: SchemaListParams): CollectionResponseObjectSchemaNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        appId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectSchemaNoPaging = list(appId, SchemaListParams.none(), requestOptions)

    /** Create a new association definition for the specified object type. */
    fun createAssociation(
        objectType: String,
        params: SchemaCreateAssociationParams,
    ): SchemaCreateAssociationResponse =
        createAssociation(objectType, params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        objectType: String,
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SchemaCreateAssociationResponse =
        createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createAssociation */
    fun createAssociation(params: SchemaCreateAssociationParams): SchemaCreateAssociationResponse =
        createAssociation(params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SchemaCreateAssociationResponse

    /** Delete an existing association definition for an object type. */
    fun deleteAssociation(associationId: String, params: SchemaDeleteAssociationParams) =
        deleteAssociation(associationId, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationId: String,
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAssociation(params.toBuilder().associationId(associationId).build(), requestOptions)

    /** @see deleteAssociation */
    fun deleteAssociation(params: SchemaDeleteAssociationParams) =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the schema for a specified object type. */
    fun get(objectType: String, params: SchemaGetParams): ObjectSchema =
        get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectType: String,
        params: SchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema = get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(params: SchemaGetParams): ObjectSchema = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema

    /** A view of [SchemaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /media-bridge/v1/{appId}/schemas/{objectType}`,
         * but is otherwise the same as [SchemaService.update].
         */
        @MustBeClosed
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
        ): HttpResponseFor<ObjectTypeDefinition> = update(objectType, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeDefinition> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SchemaUpdateParams): HttpResponseFor<ObjectTypeDefinition> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeDefinition>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/schemas`, but is otherwise
         * the same as [SchemaService.list].
         */
        @MustBeClosed
        fun list(appId: String): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(appId, SchemaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: String,
            params: SchemaListParams = SchemaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            appId: String,
            params: SchemaListParams = SchemaListParams.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(appId, SchemaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/schemas/{objectType}/associations`, but is otherwise the same as
         * [SchemaService.createAssociation].
         */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: SchemaCreateAssociationParams,
        ): HttpResponseFor<SchemaCreateAssociationResponse> =
            createAssociation(objectType, params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: SchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SchemaCreateAssociationResponse> =
            createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: SchemaCreateAssociationParams
        ): HttpResponseFor<SchemaCreateAssociationResponse> =
            createAssociation(params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: SchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SchemaCreateAssociationResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/schemas/{objectType}/associations/{associationId}`, but is
         * otherwise the same as [SchemaService.deleteAssociation].
         */
        @MustBeClosed
        fun deleteAssociation(
            associationId: String,
            params: SchemaDeleteAssociationParams,
        ): HttpResponse = deleteAssociation(associationId, params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            associationId: String,
            params: SchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAssociation(
                params.toBuilder().associationId(associationId).build(),
                requestOptions,
            )

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(params: SchemaDeleteAssociationParams): HttpResponse =
            deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            params: SchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/schemas/{objectType}`, but
         * is otherwise the same as [SchemaService.get].
         */
        @MustBeClosed
        fun get(objectType: String, params: SchemaGetParams): HttpResponseFor<ObjectSchema> =
            get(objectType, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectType: String,
            params: SchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: SchemaGetParams): HttpResponseFor<ObjectSchema> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema>
    }
}
