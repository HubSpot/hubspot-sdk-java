// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.CollectionResponseObjectSchemaNoPaging
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchema
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchemaEgg
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectTypeDefinition
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaArchiveAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaListParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaReadParams
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

    /**
     * Define a new object schema, along with custom properties and associations. The entire object
     * schema, including its object type ID, properties, and associations will be returned in the
     * response.
     */
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

    /** Update the details for an existing object schema. */
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

    /** Returns all object schemas that have been defined for your account. */
    fun list(): CollectionResponseObjectSchemaNoPaging = list(SchemaListParams.none())

    /** @see list */
    fun list(
        params: SchemaListParams = SchemaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging

    /** @see list */
    fun list(
        params: SchemaListParams = SchemaListParams.none()
    ): CollectionResponseObjectSchemaNoPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionResponseObjectSchemaNoPaging =
        list(SchemaListParams.none(), requestOptions)

    /**
     * Deletes a schema. Any existing records of this schema must be deleted **first**. Otherwise
     * this call will fail.
     */
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

    /** Removes an existing association from a schema. */
    fun archiveAssociation(associationIdentifier: String, params: SchemaArchiveAssociationParams) =
        archiveAssociation(associationIdentifier, params, RequestOptions.none())

    /** @see archiveAssociation */
    fun archiveAssociation(
        associationIdentifier: String,
        params: SchemaArchiveAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        archiveAssociation(
            params.toBuilder().associationIdentifier(associationIdentifier).build(),
            requestOptions,
        )

    /** @see archiveAssociation */
    fun archiveAssociation(params: SchemaArchiveAssociationParams) =
        archiveAssociation(params, RequestOptions.none())

    /** @see archiveAssociation */
    fun archiveAssociation(
        params: SchemaArchiveAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Defines a new association between the primary schema's object type and other object types.
     */
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

    /** Returns an existing object schema. */
    fun read(objectType: String): ObjectSchema = read(objectType, SchemaReadParams.none())

    /** @see read */
    fun read(
        objectType: String,
        params: SchemaReadParams = SchemaReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema = read(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see read */
    fun read(objectType: String, params: SchemaReadParams = SchemaReadParams.none()): ObjectSchema =
        read(objectType, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: SchemaReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema

    /** @see read */
    fun read(params: SchemaReadParams): ObjectSchema = read(params, RequestOptions.none())

    /** @see read */
    fun read(objectType: String, requestOptions: RequestOptions): ObjectSchema =
        read(objectType, SchemaReadParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /crm-object-schemas/v3/schemas`, but is otherwise
         * the same as [SchemaService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(SchemaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams = SchemaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SchemaListParams = SchemaListParams.none()
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
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
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/v3/schemas/{objectType}/associations/{associationIdentifier}`, but is
         * otherwise the same as [SchemaService.archiveAssociation].
         */
        @MustBeClosed
        fun archiveAssociation(
            associationIdentifier: String,
            params: SchemaArchiveAssociationParams,
        ): HttpResponse = archiveAssociation(associationIdentifier, params, RequestOptions.none())

        /** @see archiveAssociation */
        @MustBeClosed
        fun archiveAssociation(
            associationIdentifier: String,
            params: SchemaArchiveAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            archiveAssociation(
                params.toBuilder().associationIdentifier(associationIdentifier).build(),
                requestOptions,
            )

        /** @see archiveAssociation */
        @MustBeClosed
        fun archiveAssociation(params: SchemaArchiveAssociationParams): HttpResponse =
            archiveAssociation(params, RequestOptions.none())

        /** @see archiveAssociation */
        @MustBeClosed
        fun archiveAssociation(
            params: SchemaArchiveAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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
         * Returns a raw HTTP response for `get /crm-object-schemas/v3/schemas/{objectType}`, but is
         * otherwise the same as [SchemaService.read].
         */
        @MustBeClosed
        fun read(objectType: String): HttpResponseFor<ObjectSchema> =
            read(objectType, SchemaReadParams.none())

        /** @see read */
        @MustBeClosed
        fun read(
            objectType: String,
            params: SchemaReadParams = SchemaReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema> =
            read(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(
            objectType: String,
            params: SchemaReadParams = SchemaReadParams.none(),
        ): HttpResponseFor<ObjectSchema> = read(objectType, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: SchemaReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema>

        /** @see read */
        @MustBeClosed
        fun read(params: SchemaReadParams): HttpResponseFor<ObjectSchema> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectSchema> = read(objectType, SchemaReadParams.none(), requestOptions)
    }
}
