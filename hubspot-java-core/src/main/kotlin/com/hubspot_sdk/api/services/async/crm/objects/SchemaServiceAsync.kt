// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.CollectionResponseObjectSchemaNoPaging
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchema
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchemaEgg
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectsSchemasObjectTypeDefinition
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaGetParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaListParams
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

    fun deleteAssociation(
        associationIdentifier: String,
        params: SchemaDeleteAssociationParams,
    ): CompletableFuture<Void?> =
        deleteAssociation(associationIdentifier, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationIdentifier: String,
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAssociation(
            params.toBuilder().associationIdentifier(associationIdentifier).build(),
            requestOptions,
        )

    /** @see deleteAssociation */
    fun deleteAssociation(params: SchemaDeleteAssociationParams): CompletableFuture<Void?> =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun get(objectType: String): CompletableFuture<ObjectSchema> =
        get(objectType, SchemaGetParams.none())

    /** @see get */
    fun get(
        objectType: String,
        params: SchemaGetParams = SchemaGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema> =
        get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(
        objectType: String,
        params: SchemaGetParams = SchemaGetParams.none(),
    ): CompletableFuture<ObjectSchema> = get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema>

    /** @see get */
    fun get(params: SchemaGetParams): CompletableFuture<ObjectSchema> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectType: String, requestOptions: RequestOptions): CompletableFuture<ObjectSchema> =
        get(objectType, SchemaGetParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/v3/schemas/{objectType}/associations/{associationIdentifier}`, but is
         * otherwise the same as [SchemaServiceAsync.deleteAssociation].
         */
        fun deleteAssociation(
            associationIdentifier: String,
            params: SchemaDeleteAssociationParams,
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(associationIdentifier, params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            associationIdentifier: String,
            params: SchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(
                params.toBuilder().associationIdentifier(associationIdentifier).build(),
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
         * Returns a raw HTTP response for `get /crm-object-schemas/v3/schemas/{objectType}`, but is
         * otherwise the same as [SchemaServiceAsync.get].
         */
        fun get(objectType: String): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(objectType, SchemaGetParams.none())

        /** @see get */
        fun get(
            objectType: String,
            params: SchemaGetParams = SchemaGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        fun get(
            objectType: String,
            params: SchemaGetParams = SchemaGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(objectType, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>>

        /** @see get */
        fun get(params: SchemaGetParams): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(objectType, SchemaGetParams.none(), requestOptions)
    }
}
