// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.objects.ObjectCreateParams
import com.hubspot_sdk.api.models.crm.objects.objects.ObjectDeleteParams
import com.hubspot_sdk.api.models.crm.objects.objects.ObjectGetParams
import com.hubspot_sdk.api.models.crm.objects.objects.ObjectListPage
import com.hubspot_sdk.api.models.crm.objects.objects.ObjectListParams
import com.hubspot_sdk.api.models.crm.objects.objects.ObjectSearchParams
import com.hubspot_sdk.api.models.crm.objects.objects.ObjectUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.objects.BatchService
import java.util.function.Consumer

interface ObjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService

    fun batch(): BatchService

    /**
     * Create a CRM object with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard objects is provided.
     */
    fun create(objectType: String, params: ObjectCreateParams): CreatedResponseSimplePublicObject =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: ObjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: ObjectCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ObjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /**
     * Perform a partial update of an Object identified by `{objectId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{objectId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(objectId: String, params: ObjectUpdateParams): SimplePublicObject =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: ObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: ObjectUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of objects. Control what is returned via the `properties` query param. */
    fun list(objectType: String): ObjectListPage = list(objectType, ObjectListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: ObjectListParams = ObjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectListPage = list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: ObjectListParams = ObjectListParams.none(),
    ): ObjectListPage = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ObjectListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectListPage

    /** @see list */
    fun list(params: ObjectListParams): ObjectListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(objectType: String, requestOptions: RequestOptions): ObjectListPage =
        list(objectType, ObjectListParams.none(), requestOptions)

    /** Move an Object identified by `{objectId}` to the recycling bin. */
    fun delete(objectId: String, params: ObjectDeleteParams) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: ObjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ObjectDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ObjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Read an Object identified by `{objectId}`. `{objectId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(objectId: String, params: ObjectGetParams): SimplePublicObjectWithAssociations =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectId: String,
        params: ObjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(params: ObjectGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ObjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    fun search(
        objectType: String,
        params: ObjectSearchParams,
    ): CollectionResponseWithTotalSimplePublicObject =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: ObjectSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(params: ObjectSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ObjectSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** A view of [ObjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/{objectType}`, but is otherwise the
         * same as [ObjectService.create].
         */
        @MustBeClosed
        fun create(
            objectType: String,
            params: ObjectCreateParams,
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: ObjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ObjectCreateParams): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ObjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/{objectType}/{objectId}`, but is
         * otherwise the same as [ObjectService.update].
         */
        @MustBeClosed
        fun update(
            objectId: String,
            params: ObjectUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: ObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ObjectUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/{objectType}`, but is otherwise the
         * same as [ObjectService.list].
         */
        @MustBeClosed
        fun list(objectType: String): HttpResponseFor<ObjectListPage> =
            list(objectType, ObjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: ObjectListParams = ObjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectListPage> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: ObjectListParams = ObjectListParams.none(),
        ): HttpResponseFor<ObjectListPage> = list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ObjectListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ObjectListParams): HttpResponseFor<ObjectListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectListPage> =
            list(objectType, ObjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/{objectType}/{objectId}`, but is
         * otherwise the same as [ObjectService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String, params: ObjectDeleteParams): HttpResponse =
            delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: ObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ObjectDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/{objectType}/{objectId}`, but is
         * otherwise the same as [ObjectService.get].
         */
        @MustBeClosed
        fun get(
            objectId: String,
            params: ObjectGetParams,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: ObjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: ObjectGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ObjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/{objectType}/search`, but is
         * otherwise the same as [ObjectService.search].
         */
        @MustBeClosed
        fun search(
            objectType: String,
            params: ObjectSearchParams,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            objectType: String,
            params: ObjectSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
        @MustBeClosed
        fun search(
            params: ObjectSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ObjectSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>
    }
}
