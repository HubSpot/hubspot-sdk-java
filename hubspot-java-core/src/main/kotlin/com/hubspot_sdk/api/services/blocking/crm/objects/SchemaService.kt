// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchema
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchemaEgg
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectsSchemasObjectTypeDefinition
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaGetParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaListParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaListResponse
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.AssociationDefinition
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

    fun create(params: SchemaCreateParams): ObjectSchema = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SchemaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema

    /** @see create */
    fun create(
        objectSchemaEgg: ObjectSchemaEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema =
        create(
            SchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
            requestOptions,
        )

    /** @see create */
    fun create(objectSchemaEgg: ObjectSchemaEgg): ObjectSchema =
        create(objectSchemaEgg, RequestOptions.none())

    fun update(objectType: String, params: SchemaUpdateParams): ObjectsSchemasObjectTypeDefinition =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectsSchemasObjectTypeDefinition =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: SchemaUpdateParams): ObjectsSchemasObjectTypeDefinition =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectsSchemasObjectTypeDefinition

    fun list(): SchemaListResponse = list(SchemaListParams.none())

    /** @see list */
    fun list(
        params: SchemaListParams = SchemaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SchemaListResponse

    /** @see list */
    fun list(params: SchemaListParams = SchemaListParams.none()): SchemaListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SchemaListResponse =
        list(SchemaListParams.none(), requestOptions)

    fun delete(objectType: String) = delete(objectType, SchemaDeleteParams.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: SchemaDeleteParams = SchemaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(objectType: String, params: SchemaDeleteParams = SchemaDeleteParams.none()) =
        delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SchemaDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SchemaDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectType: String, requestOptions: RequestOptions) =
        delete(objectType, SchemaDeleteParams.none(), requestOptions)

    fun createAssociation(
        objectType: String,
        params: SchemaCreateAssociationParams,
    ): AssociationDefinition = createAssociation(objectType, params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        objectType: String,
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition =
        createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createAssociation */
    fun createAssociation(params: SchemaCreateAssociationParams): AssociationDefinition =
        createAssociation(params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition

    fun deleteAssociation(associationIdentifier: String, params: SchemaDeleteAssociationParams) =
        deleteAssociation(associationIdentifier, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationIdentifier: String,
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteAssociation(
            params.toBuilder().associationIdentifier(associationIdentifier).build(),
            requestOptions,
        )

    /** @see deleteAssociation */
    fun deleteAssociation(params: SchemaDeleteAssociationParams) =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun get(objectType: String): ObjectSchema = get(objectType, SchemaGetParams.none())

    /** @see get */
    fun get(
        objectType: String,
        params: SchemaGetParams = SchemaGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema = get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(objectType: String, params: SchemaGetParams = SchemaGetParams.none()): ObjectSchema =
        get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema

    /** @see get */
    fun get(params: SchemaGetParams): ObjectSchema = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectType: String, requestOptions: RequestOptions): ObjectSchema =
        get(objectType, SchemaGetParams.none(), requestOptions)

    /** A view of [SchemaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm-object-schemas/v3/schemas`, but is otherwise
         * the same as [SchemaService.create].
         */
        @MustBeClosed
        fun create(params: SchemaCreateParams): HttpResponseFor<ObjectSchema> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SchemaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema>

        /** @see create */
        @MustBeClosed
        fun create(
            objectSchemaEgg: ObjectSchemaEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema> =
            create(
                SchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(objectSchemaEgg: ObjectSchemaEgg): HttpResponseFor<ObjectSchema> =
            create(objectSchemaEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm-object-schemas/v3/schemas/{objectType}`, but
         * is otherwise the same as [SchemaService.update].
         */
        @MustBeClosed
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
        ): HttpResponseFor<ObjectsSchemasObjectTypeDefinition> =
            update(objectType, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectsSchemasObjectTypeDefinition> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: SchemaUpdateParams
        ): HttpResponseFor<ObjectsSchemasObjectTypeDefinition> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectsSchemasObjectTypeDefinition>

        /**
         * Returns a raw HTTP response for `get /crm-object-schemas/v3/schemas`, but is otherwise
         * the same as [SchemaService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SchemaListResponse> = list(SchemaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams = SchemaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SchemaListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams = SchemaListParams.none()
        ): HttpResponseFor<SchemaListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SchemaListResponse> =
            list(SchemaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm-object-schemas/v3/schemas/{objectType}`, but
         * is otherwise the same as [SchemaService.delete].
         */
        @MustBeClosed
        fun delete(objectType: String): HttpResponse = delete(objectType, SchemaDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectType: String,
            params: SchemaDeleteParams = SchemaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectType: String,
            params: SchemaDeleteParams = SchemaDeleteParams.none(),
        ): HttpResponse = delete(objectType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SchemaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SchemaDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectType: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectType, SchemaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm-object-schemas/v3/schemas/{objectType}/associations`, but is otherwise the same as
         * [SchemaService.createAssociation].
         */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: SchemaCreateAssociationParams,
        ): HttpResponseFor<AssociationDefinition> =
            createAssociation(objectType, params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: SchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition> =
            createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: SchemaCreateAssociationParams
        ): HttpResponseFor<AssociationDefinition> = createAssociation(params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: SchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition>

        /**
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/v3/schemas/{objectType}/associations/{associationIdentifier}`, but is
         * otherwise the same as [SchemaService.deleteAssociation].
         */
        @MustBeClosed
        fun deleteAssociation(
            associationIdentifier: String,
            params: SchemaDeleteAssociationParams,
        ): HttpResponse = deleteAssociation(associationIdentifier, params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            associationIdentifier: String,
            params: SchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAssociation(
                params.toBuilder().associationIdentifier(associationIdentifier).build(),
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
         * Returns a raw HTTP response for `get /crm-object-schemas/v3/schemas/{objectType}`, but is
         * otherwise the same as [SchemaService.get].
         */
        @MustBeClosed
        fun get(objectType: String): HttpResponseFor<ObjectSchema> =
            get(objectType, SchemaGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectType: String,
            params: SchemaGetParams = SchemaGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectType: String,
            params: SchemaGetParams = SchemaGetParams.none(),
        ): HttpResponseFor<ObjectSchema> = get(objectType, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema>

        /** @see get */
        @MustBeClosed
        fun get(params: SchemaGetParams): HttpResponseFor<ObjectSchema> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectType: String, requestOptions: RequestOptions): HttpResponseFor<ObjectSchema> =
            get(objectType, SchemaGetParams.none(), requestOptions)
    }
}
