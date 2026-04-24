// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.BaseAssociationDefinition
import com.hubspot.sdk.models.BaseObjectTypeDefinition
import com.hubspot.sdk.models.crm.objectschemas.CollectionResponseObjectSchemaNoPaging
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchema
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaCreateAssociationParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaCreateParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaDeleteAssociationParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaDeleteParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaEgg
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaGetParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaListParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaUpdateParams
import com.hubspot.sdk.services.async.crm.objectschemas.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ObjectSchemaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectSchemaServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a new custom object schema by defining its properties and associations. */
    fun create(params: ObjectSchemaCreateParams): CompletableFuture<ObjectSchema> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ObjectSchemaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema>

    /** @see create */
    fun create(
        objectSchemaEgg: ObjectSchemaEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema> =
        create(
            ObjectSchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
            requestOptions,
        )

    /** @see create */
    fun create(objectSchemaEgg: ObjectSchemaEgg): CompletableFuture<ObjectSchema> =
        create(objectSchemaEgg, RequestOptions.none())

    /**
     * Update attributes of a custom object schema, such as properties and labels, using the object
     * type ID or fully qualified name.
     */
    fun update(
        objectType: String,
        params: ObjectSchemaUpdateParams,
    ): CompletableFuture<BaseObjectTypeDefinition> =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: ObjectSchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseObjectTypeDefinition> =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: ObjectSchemaUpdateParams): CompletableFuture<BaseObjectTypeDefinition> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ObjectSchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseObjectTypeDefinition>

    /**
     * Retrieve all custom object schemas, with options to include property definitions, association
     * definitions, and audit metadata.
     */
    fun list(): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        list(ObjectSchemaListParams.none())

    /** @see list */
    fun list(
        params: ObjectSchemaListParams = ObjectSchemaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging>

    /** @see list */
    fun list(
        params: ObjectSchemaListParams = ObjectSchemaListParams.none()
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        list(ObjectSchemaListParams.none(), requestOptions)

    /**
     * Remove a custom object schema from the account using its object type ID or fully qualified
     * name.
     */
    fun delete(objectType: String): CompletableFuture<Void?> =
        delete(objectType, ObjectSchemaDeleteParams.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectType: String,
        params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ObjectSchemaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ObjectSchemaDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectType: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectType, ObjectSchemaDeleteParams.none(), requestOptions)

    /**
     * Create a new association between the specified object type and another object type. This
     * operation requires the definition of the association attributes, such as the primary and
     * target object type IDs.
     */
    fun createAssociation(
        objectType: String,
        params: ObjectSchemaCreateAssociationParams,
    ): CompletableFuture<BaseAssociationDefinition> =
        createAssociation(objectType, params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        objectType: String,
        params: ObjectSchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseAssociationDefinition> =
        createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createAssociation */
    fun createAssociation(
        params: ObjectSchemaCreateAssociationParams
    ): CompletableFuture<BaseAssociationDefinition> =
        createAssociation(params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        params: ObjectSchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseAssociationDefinition>

    /**
     * Remove an association between two object types identified by the association identifier and
     * object type. This operation is irreversible and will permanently delete the specified
     * association.
     */
    fun deleteAssociation(
        associationIdentifier: String,
        params: ObjectSchemaDeleteAssociationParams,
    ): CompletableFuture<Void?> =
        deleteAssociation(associationIdentifier, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationIdentifier: String,
        params: ObjectSchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAssociation(
            params.toBuilder().associationIdentifier(associationIdentifier).build(),
            requestOptions,
        )

    /** @see deleteAssociation */
    fun deleteAssociation(params: ObjectSchemaDeleteAssociationParams): CompletableFuture<Void?> =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: ObjectSchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve details of a custom object schema, including its properties and associations, using
     * the object type ID or fully qualified name.
     */
    fun get(objectType: String): CompletableFuture<ObjectSchema> =
        get(objectType, ObjectSchemaGetParams.none())

    /** @see get */
    fun get(
        objectType: String,
        params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema> =
        get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(
        objectType: String,
        params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
    ): CompletableFuture<ObjectSchema> = get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ObjectSchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectSchema>

    /** @see get */
    fun get(params: ObjectSchemaGetParams): CompletableFuture<ObjectSchema> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectType: String, requestOptions: RequestOptions): CompletableFuture<ObjectSchema> =
        get(objectType, ObjectSchemaGetParams.none(), requestOptions)

    /**
     * A view of [ObjectSchemaServiceAsync] that provides access to raw HTTP responses for each
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
        ): ObjectSchemaServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm-object-schemas/2026-03/schemas`, but is
         * otherwise the same as [ObjectSchemaServiceAsync.create].
         */
        fun create(
            params: ObjectSchemaCreateParams
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ObjectSchemaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>>

        /** @see create */
        fun create(
            objectSchemaEgg: ObjectSchemaEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            create(
                ObjectSchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            objectSchemaEgg: ObjectSchemaEgg
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            create(objectSchemaEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm-object-schemas/2026-03/schemas/{objectType}`,
         * but is otherwise the same as [ObjectSchemaServiceAsync.update].
         */
        fun update(
            objectType: String,
            params: ObjectSchemaUpdateParams,
        ): CompletableFuture<HttpResponseFor<BaseObjectTypeDefinition>> =
            update(objectType, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectType: String,
            params: ObjectSchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseObjectTypeDefinition>> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        fun update(
            params: ObjectSchemaUpdateParams
        ): CompletableFuture<HttpResponseFor<BaseObjectTypeDefinition>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ObjectSchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseObjectTypeDefinition>>

        /**
         * Returns a raw HTTP response for `get /crm-object-schemas/2026-03/schemas`, but is
         * otherwise the same as [ObjectSchemaServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            list(ObjectSchemaListParams.none())

        /** @see list */
        fun list(
            params: ObjectSchemaListParams = ObjectSchemaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>>

        /** @see list */
        fun list(
            params: ObjectSchemaListParams = ObjectSchemaListParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            list(ObjectSchemaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/2026-03/schemas/{objectType}`, but is otherwise the same as
         * [ObjectSchemaServiceAsync.delete].
         */
        fun delete(objectType: String): CompletableFuture<HttpResponse> =
            delete(objectType, ObjectSchemaDeleteParams.none())

        /** @see delete */
        fun delete(
            objectType: String,
            params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectType: String,
            params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ObjectSchemaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ObjectSchemaDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectType, ObjectSchemaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm-object-schemas/2026-03/schemas/{objectType}/associations`, but is otherwise the same
         * as [ObjectSchemaServiceAsync.createAssociation].
         */
        fun createAssociation(
            objectType: String,
            params: ObjectSchemaCreateAssociationParams,
        ): CompletableFuture<HttpResponseFor<BaseAssociationDefinition>> =
            createAssociation(objectType, params, RequestOptions.none())

        /** @see createAssociation */
        fun createAssociation(
            objectType: String,
            params: ObjectSchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseAssociationDefinition>> =
            createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createAssociation */
        fun createAssociation(
            params: ObjectSchemaCreateAssociationParams
        ): CompletableFuture<HttpResponseFor<BaseAssociationDefinition>> =
            createAssociation(params, RequestOptions.none())

        /** @see createAssociation */
        fun createAssociation(
            params: ObjectSchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseAssociationDefinition>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/2026-03/schemas/{objectType}/associations/{associationIdentifier}`,
         * but is otherwise the same as [ObjectSchemaServiceAsync.deleteAssociation].
         */
        fun deleteAssociation(
            associationIdentifier: String,
            params: ObjectSchemaDeleteAssociationParams,
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(associationIdentifier, params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            associationIdentifier: String,
            params: ObjectSchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAssociation(
                params.toBuilder().associationIdentifier(associationIdentifier).build(),
                requestOptions,
            )

        /** @see deleteAssociation */
        fun deleteAssociation(
            params: ObjectSchemaDeleteAssociationParams
        ): CompletableFuture<HttpResponse> = deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        fun deleteAssociation(
            params: ObjectSchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm-object-schemas/2026-03/schemas/{objectType}`,
         * but is otherwise the same as [ObjectSchemaServiceAsync.get].
         */
        fun get(objectType: String): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(objectType, ObjectSchemaGetParams.none())

        /** @see get */
        fun get(
            objectType: String,
            params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        fun get(
            objectType: String,
            params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(objectType, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ObjectSchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectSchema>>

        /** @see get */
        fun get(params: ObjectSchemaGetParams): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> =
            get(objectType, ObjectSchemaGetParams.none(), requestOptions)
    }
}
