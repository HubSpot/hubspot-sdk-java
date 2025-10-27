// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

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

    /**
     * Define a new object schema, along with custom properties and associations. The entire object
     * schema, including its object type ID, properties, and associations will be returned in the
     * response.
     */
    fun create(params: SchemaCreateParams): CompletableFuture<ObjectSchema> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SchemaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema>

    /** @see create */
    fun create(
        objectSchemaEgg: ObjectSchemaEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema> =
        create(
            SchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
            requestOptions,
        )

    /** @see create */
    fun create(objectSchemaEgg: ObjectSchemaEgg): CompletableFuture<ObjectSchema> =
        create(objectSchemaEgg, RequestOptions.none())

    /** Update the details for an existing object schema. */
    fun update(
        objectType: String,
        params: SchemaUpdateParams,
    ): CompletableFuture<ObjectTypeDefinition> = update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeDefinition> =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: SchemaUpdateParams): CompletableFuture<ObjectTypeDefinition> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeDefinition>

    /** Returns all object schemas that have been defined for your account. */
    fun list(): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        list(SchemaListParams.none())

    /** @see list */
    fun list(
        params: SchemaListParams = SchemaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging>

    /** @see list */
    fun list(
        params: SchemaListParams = SchemaListParams.none()
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        list(SchemaListParams.none(), requestOptions)

    /**
     * Deletes a schema. Any existing records of this schema must be deleted **first**. Otherwise
     * this call will fail.
     */
    fun delete(objectType: String): CompletableFuture<Void?> =
        delete(objectType, SchemaDeleteParams.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: SchemaDeleteParams = SchemaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectType: String,
        params: SchemaDeleteParams = SchemaDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SchemaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SchemaDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectType: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectType, SchemaDeleteParams.none(), requestOptions)

    /** Removes an existing association from a schema. */
    fun archiveAssociation(
        associationIdentifier: String,
        params: SchemaArchiveAssociationParams,
    ): CompletableFuture<Void?> =
        archiveAssociation(associationIdentifier, params, RequestOptions.none())

    /** @see archiveAssociation */
    fun archiveAssociation(
        associationIdentifier: String,
        params: SchemaArchiveAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archiveAssociation(
            params.toBuilder().associationIdentifier(associationIdentifier).build(),
            requestOptions,
        )

    /** @see archiveAssociation */
    fun archiveAssociation(params: SchemaArchiveAssociationParams): CompletableFuture<Void?> =
        archiveAssociation(params, RequestOptions.none())

    /** @see archiveAssociation */
    fun archiveAssociation(
        params: SchemaArchiveAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Defines a new association between the primary schema's object type and other object types.
     */
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

    /** Returns an existing object schema. */
    fun read(objectType: String): CompletableFuture<ObjectSchema> =
        read(objectType, SchemaReadParams.none())

    /** @see read */
    fun read(
        objectType: String,
        params: SchemaReadParams = SchemaReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema> =
        read(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see read */
    fun read(
        objectType: String,
        params: SchemaReadParams = SchemaReadParams.none(),
    ): CompletableFuture<ObjectSchema> = read(objectType, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: SchemaReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema>

    /** @see read */
    fun read(params: SchemaReadParams): CompletableFuture<ObjectSchema> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(objectType: String, requestOptions: RequestOptions): CompletableFuture<ObjectSchema> =
        read(objectType, SchemaReadParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /crm-object-schemas/v3/schemas`, but is otherwise
         * the same as [SchemaServiceAsync.create].
         */
        fun create(params: SchemaCreateParams): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SchemaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>>

        /** @see create */
        fun create(
            objectSchemaEgg: ObjectSchemaEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            create(
                SchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            objectSchemaEgg: ObjectSchemaEgg
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            create(objectSchemaEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm-object-schemas/v3/schemas/{objectType}`, but
         * is otherwise the same as [SchemaServiceAsync.update].
         */
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> =
            update(objectType, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectType: String,
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        fun update(
            params: SchemaUpdateParams
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>>

        /**
         * Returns a raw HTTP response for `get /crm-object-schemas/v3/schemas`, but is otherwise
         * the same as [SchemaServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            list(SchemaListParams.none())

        /** @see list */
        fun list(
            params: SchemaListParams = SchemaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>>

        /** @see list */
        fun list(
            params: SchemaListParams = SchemaListParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            list(SchemaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm-object-schemas/v3/schemas/{objectType}`, but
         * is otherwise the same as [SchemaServiceAsync.delete].
         */
        fun delete(objectType: String): CompletableFuture<HttpResponse> =
            delete(objectType, SchemaDeleteParams.none())

        /** @see delete */
        fun delete(
            objectType: String,
            params: SchemaDeleteParams = SchemaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectType: String,
            params: SchemaDeleteParams = SchemaDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SchemaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SchemaDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectType, SchemaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/v3/schemas/{objectType}/associations/{associationIdentifier}`, but is
         * otherwise the same as [SchemaServiceAsync.archiveAssociation].
         */
        fun archiveAssociation(
            associationIdentifier: String,
            params: SchemaArchiveAssociationParams,
        ): CompletableFuture<HttpResponse> =
            archiveAssociation(associationIdentifier, params, RequestOptions.none())

        /** @see archiveAssociation */
        fun archiveAssociation(
            associationIdentifier: String,
            params: SchemaArchiveAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archiveAssociation(
                params.toBuilder().associationIdentifier(associationIdentifier).build(),
                requestOptions,
            )

        /** @see archiveAssociation */
        fun archiveAssociation(
            params: SchemaArchiveAssociationParams
        ): CompletableFuture<HttpResponse> = archiveAssociation(params, RequestOptions.none())

        /** @see archiveAssociation */
        fun archiveAssociation(
            params: SchemaArchiveAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /crm-object-schemas/v3/schemas/{objectType}/associations`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /crm-object-schemas/v3/schemas/{objectType}`, but is
         * otherwise the same as [SchemaServiceAsync.read].
         */
        fun read(objectType: String): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            read(objectType, SchemaReadParams.none())

        /** @see read */
        fun read(
            objectType: String,
            params: SchemaReadParams = SchemaReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            read(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see read */
        fun read(
            objectType: String,
            params: SchemaReadParams = SchemaReadParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            read(objectType, params, RequestOptions.none())

        /** @see read */
        fun read(
            params: SchemaReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>>

        /** @see read */
        fun read(params: SchemaReadParams): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            read(objectType, SchemaReadParams.none(), requestOptions)
    }
}
