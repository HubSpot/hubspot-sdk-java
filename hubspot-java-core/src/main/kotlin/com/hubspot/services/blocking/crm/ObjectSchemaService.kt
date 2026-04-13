// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.AssociationDefinition
import com.hubspot.models.ObjectTypeDefinition
import com.hubspot.models.crm.objectschemas.CollectionResponseObjectSchemaNoPaging
import com.hubspot.models.crm.objectschemas.ObjectSchema
import com.hubspot.models.crm.objectschemas.ObjectSchemaCreateAssociationParams
import com.hubspot.models.crm.objectschemas.ObjectSchemaCreateParams
import com.hubspot.models.crm.objectschemas.ObjectSchemaDeleteAssociationParams
import com.hubspot.models.crm.objectschemas.ObjectSchemaDeleteParams
import com.hubspot.models.crm.objectschemas.ObjectSchemaEgg
import com.hubspot.models.crm.objectschemas.ObjectSchemaGetParams
import com.hubspot.models.crm.objectschemas.ObjectSchemaListParams
import com.hubspot.models.crm.objectschemas.ObjectSchemaUpdateParams
import com.hubspot.services.blocking.crm.objectschemas.BatchService
import java.util.function.Consumer

interface ObjectSchemaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectSchemaService

    fun batch(): BatchService

    /** Create a new custom object schema by defining its properties and associations. */
    fun create(params: ObjectSchemaCreateParams): ObjectSchema =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ObjectSchemaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema

    /** @see create */
    fun create(
        objectSchemaEgg: ObjectSchemaEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema =
        create(
            ObjectSchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
            requestOptions,
        )

    /** @see create */
    fun create(objectSchemaEgg: ObjectSchemaEgg): ObjectSchema =
        create(objectSchemaEgg, RequestOptions.none())

    /**
     * Update attributes of a custom object schema, such as properties and labels, using the object
     * type ID or fully qualified name.
     */
    fun update(objectType: String, params: ObjectSchemaUpdateParams): ObjectTypeDefinition =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: ObjectSchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeDefinition =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: ObjectSchemaUpdateParams): ObjectTypeDefinition =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ObjectSchemaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeDefinition

    /**
     * Retrieve all custom object schemas, with options to include property definitions, association
     * definitions, and audit metadata.
     */
    fun list(): CollectionResponseObjectSchemaNoPaging = list(ObjectSchemaListParams.none())

    /** @see list */
    fun list(
        params: ObjectSchemaListParams = ObjectSchemaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging

    /** @see list */
    fun list(
        params: ObjectSchemaListParams = ObjectSchemaListParams.none()
    ): CollectionResponseObjectSchemaNoPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionResponseObjectSchemaNoPaging =
        list(ObjectSchemaListParams.none(), requestOptions)

    /**
     * Remove a custom object schema from the account using its object type ID or fully qualified
     * name.
     */
    fun delete(objectType: String) = delete(objectType, ObjectSchemaDeleteParams.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectType: String,
        params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
    ) = delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ObjectSchemaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ObjectSchemaDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectType: String, requestOptions: RequestOptions) =
        delete(objectType, ObjectSchemaDeleteParams.none(), requestOptions)

    /**
     * Create a new association between the specified object type and another object type. This
     * operation requires the definition of the association attributes, such as the primary and
     * target object type IDs.
     */
    fun createAssociation(
        objectType: String,
        params: ObjectSchemaCreateAssociationParams,
    ): AssociationDefinition = createAssociation(objectType, params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        objectType: String,
        params: ObjectSchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition =
        createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see createAssociation */
    fun createAssociation(params: ObjectSchemaCreateAssociationParams): AssociationDefinition =
        createAssociation(params, RequestOptions.none())

    /** @see createAssociation */
    fun createAssociation(
        params: ObjectSchemaCreateAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationDefinition

    /**
     * Remove an association between two object types identified by the association identifier and
     * object type. This operation is irreversible and will permanently delete the specified
     * association.
     */
    fun deleteAssociation(
        associationIdentifier: String,
        params: ObjectSchemaDeleteAssociationParams,
    ) = deleteAssociation(associationIdentifier, params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        associationIdentifier: String,
        params: ObjectSchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteAssociation(
            params.toBuilder().associationIdentifier(associationIdentifier).build(),
            requestOptions,
        )

    /** @see deleteAssociation */
    fun deleteAssociation(params: ObjectSchemaDeleteAssociationParams) =
        deleteAssociation(params, RequestOptions.none())

    /** @see deleteAssociation */
    fun deleteAssociation(
        params: ObjectSchemaDeleteAssociationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieve details of a custom object schema, including its properties and associations, using
     * the object type ID or fully qualified name.
     */
    fun get(objectType: String): ObjectSchema = get(objectType, ObjectSchemaGetParams.none())

    /** @see get */
    fun get(
        objectType: String,
        params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema = get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(
        objectType: String,
        params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
    ): ObjectSchema = get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ObjectSchemaGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectSchema

    /** @see get */
    fun get(params: ObjectSchemaGetParams): ObjectSchema = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectType: String, requestOptions: RequestOptions): ObjectSchema =
        get(objectType, ObjectSchemaGetParams.none(), requestOptions)

    /**
     * A view of [ObjectSchemaService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectSchemaService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm-object-schemas/2026-03/schemas`, but is
         * otherwise the same as [ObjectSchemaService.create].
         */
        @MustBeClosed
        fun create(params: ObjectSchemaCreateParams): HttpResponseFor<ObjectSchema> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ObjectSchemaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema>

        /** @see create */
        @MustBeClosed
        fun create(
            objectSchemaEgg: ObjectSchemaEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema> =
            create(
                ObjectSchemaCreateParams.builder().objectSchemaEgg(objectSchemaEgg).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(objectSchemaEgg: ObjectSchemaEgg): HttpResponseFor<ObjectSchema> =
            create(objectSchemaEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm-object-schemas/2026-03/schemas/{objectType}`,
         * but is otherwise the same as [ObjectSchemaService.update].
         */
        @MustBeClosed
        fun update(
            objectType: String,
            params: ObjectSchemaUpdateParams,
        ): HttpResponseFor<ObjectTypeDefinition> = update(objectType, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectType: String,
            params: ObjectSchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeDefinition> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ObjectSchemaUpdateParams): HttpResponseFor<ObjectTypeDefinition> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ObjectSchemaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeDefinition>

        /**
         * Returns a raw HTTP response for `get /crm-object-schemas/2026-03/schemas`, but is
         * otherwise the same as [ObjectSchemaService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(ObjectSchemaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ObjectSchemaListParams = ObjectSchemaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ObjectSchemaListParams = ObjectSchemaListParams.none()
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            list(ObjectSchemaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/2026-03/schemas/{objectType}`, but is otherwise the same as
         * [ObjectSchemaService.delete].
         */
        @MustBeClosed
        fun delete(objectType: String): HttpResponse =
            delete(objectType, ObjectSchemaDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectType: String,
            params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectType: String,
            params: ObjectSchemaDeleteParams = ObjectSchemaDeleteParams.none(),
        ): HttpResponse = delete(objectType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ObjectSchemaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ObjectSchemaDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectType: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectType, ObjectSchemaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm-object-schemas/2026-03/schemas/{objectType}/associations`, but is otherwise the same
         * as [ObjectSchemaService.createAssociation].
         */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: ObjectSchemaCreateAssociationParams,
        ): HttpResponseFor<AssociationDefinition> =
            createAssociation(objectType, params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            objectType: String,
            params: ObjectSchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition> =
            createAssociation(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: ObjectSchemaCreateAssociationParams
        ): HttpResponseFor<AssociationDefinition> = createAssociation(params, RequestOptions.none())

        /** @see createAssociation */
        @MustBeClosed
        fun createAssociation(
            params: ObjectSchemaCreateAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationDefinition>

        /**
         * Returns a raw HTTP response for `delete
         * /crm-object-schemas/2026-03/schemas/{objectType}/associations/{associationIdentifier}`,
         * but is otherwise the same as [ObjectSchemaService.deleteAssociation].
         */
        @MustBeClosed
        fun deleteAssociation(
            associationIdentifier: String,
            params: ObjectSchemaDeleteAssociationParams,
        ): HttpResponse = deleteAssociation(associationIdentifier, params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            associationIdentifier: String,
            params: ObjectSchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteAssociation(
                params.toBuilder().associationIdentifier(associationIdentifier).build(),
                requestOptions,
            )

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(params: ObjectSchemaDeleteAssociationParams): HttpResponse =
            deleteAssociation(params, RequestOptions.none())

        /** @see deleteAssociation */
        @MustBeClosed
        fun deleteAssociation(
            params: ObjectSchemaDeleteAssociationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /crm-object-schemas/2026-03/schemas/{objectType}`,
         * but is otherwise the same as [ObjectSchemaService.get].
         */
        @MustBeClosed
        fun get(objectType: String): HttpResponseFor<ObjectSchema> =
            get(objectType, ObjectSchemaGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectType: String,
            params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectType: String,
            params: ObjectSchemaGetParams = ObjectSchemaGetParams.none(),
        ): HttpResponseFor<ObjectSchema> = get(objectType, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ObjectSchemaGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectSchema>

        /** @see get */
        @MustBeClosed
        fun get(params: ObjectSchemaGetParams): HttpResponseFor<ObjectSchema> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectType: String, requestOptions: RequestOptions): HttpResponseFor<ObjectSchema> =
            get(objectType, ObjectSchemaGetParams.none(), requestOptions)
    }
}
