// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.genericobjects.GenericObjectCreateParams
import com.hubspot.sdk.models.crm.objects.genericobjects.GenericObjectDeleteParams
import com.hubspot.sdk.models.crm.objects.genericobjects.GenericObjectGetParams
import com.hubspot.sdk.models.crm.objects.genericobjects.GenericObjectListPageAsync
import com.hubspot.sdk.models.crm.objects.genericobjects.GenericObjectListParams
import com.hubspot.sdk.models.crm.objects.genericobjects.GenericObjectSearchParams
import com.hubspot.sdk.models.crm.objects.genericobjects.GenericObjectUpdateParams
import com.hubspot.sdk.services.async.crm.objects.genericobjects.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GenericObjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GenericObjectServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a CRM object with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard objects is provided.
     */
    fun create(
        objectType: String,
        params: GenericObjectCreateParams,
    ): CompletableFuture<SimplePublicObject> = create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: GenericObjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: GenericObjectCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GenericObjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Perform a partial update of an Object identified by `{objectId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{objectId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        objectId: String,
        params: GenericObjectUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: GenericObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: GenericObjectUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GenericObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of objects. Control what is returned via the `properties` query param. */
    fun list(objectType: String): CompletableFuture<GenericObjectListPageAsync> =
        list(objectType, GenericObjectListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: GenericObjectListParams = GenericObjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GenericObjectListPageAsync> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: GenericObjectListParams = GenericObjectListParams.none(),
    ): CompletableFuture<GenericObjectListPageAsync> =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GenericObjectListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GenericObjectListPageAsync>

    /** @see list */
    fun list(params: GenericObjectListParams): CompletableFuture<GenericObjectListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GenericObjectListPageAsync> =
        list(objectType, GenericObjectListParams.none(), requestOptions)

    /** Move an Object identified by `{objectId}` to the recycling bin. */
    fun delete(objectId: String, params: GenericObjectDeleteParams): CompletableFuture<Void?> =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: GenericObjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: GenericObjectDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GenericObjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Read an Object identified by `{objectId}`. `{objectId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(
        objectId: String,
        params: GenericObjectGetParams,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectId: String,
        params: GenericObjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(params: GenericObjectGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GenericObjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    fun search(
        objectType: String,
        params: GenericObjectSearchParams,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: GenericObjectSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(
        params: GenericObjectSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: GenericObjectSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /**
     * A view of [GenericObjectServiceAsync] that provides access to raw HTTP responses for each
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
        ): GenericObjectServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}`, but is
         * otherwise the same as [GenericObjectServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: GenericObjectCreateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: GenericObjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: GenericObjectCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GenericObjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [GenericObjectServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: GenericObjectUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: GenericObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(
            params: GenericObjectUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GenericObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}`, but is otherwise
         * the same as [GenericObjectServiceAsync.list].
         */
        fun list(
            objectType: String
        ): CompletableFuture<HttpResponseFor<GenericObjectListPageAsync>> =
            list(objectType, GenericObjectListParams.none())

        /** @see list */
        fun list(
            objectType: String,
            params: GenericObjectListParams = GenericObjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GenericObjectListPageAsync>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            objectType: String,
            params: GenericObjectListParams = GenericObjectListParams.none(),
        ): CompletableFuture<HttpResponseFor<GenericObjectListPageAsync>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GenericObjectListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GenericObjectListPageAsync>>

        /** @see list */
        fun list(
            params: GenericObjectListParams
        ): CompletableFuture<HttpResponseFor<GenericObjectListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GenericObjectListPageAsync>> =
            list(objectType, GenericObjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/{objectType}/{objectId}`,
         * but is otherwise the same as [GenericObjectServiceAsync.delete].
         */
        fun delete(
            objectId: String,
            params: GenericObjectDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: GenericObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(params: GenericObjectDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GenericObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [GenericObjectServiceAsync.get].
         */
        fun get(
            objectId: String,
            params: GenericObjectGetParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            params: GenericObjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            params: GenericObjectGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: GenericObjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/search`, but is
         * otherwise the same as [GenericObjectServiceAsync.search].
         */
        fun search(
            objectType: String,
            params: GenericObjectSearchParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        fun search(
            objectType: String,
            params: GenericObjectSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
        fun search(
            params: GenericObjectSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: GenericObjectSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>
    }
}
