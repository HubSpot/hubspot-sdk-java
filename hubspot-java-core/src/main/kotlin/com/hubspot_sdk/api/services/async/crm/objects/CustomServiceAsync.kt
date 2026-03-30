// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.custom.CustomCreateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomDeleteParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomGetParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListPageAsync
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomMergeParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomSearchParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.custom.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a CRM object with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard objects is provided.
     */
    fun create(
        objectType: String,
        params: CustomCreateParams,
    ): CompletableFuture<SimplePublicObject> = create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: CustomCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: CustomCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomCreateParams,
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
        params: CustomUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: CustomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: CustomUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of objects. Control what is returned via the `properties` query param. */
    fun list(objectType: String): CompletableFuture<CustomListPageAsync> =
        list(objectType, CustomListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: CustomListParams = CustomListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomListPageAsync> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: CustomListParams = CustomListParams.none(),
    ): CompletableFuture<CustomListPageAsync> = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CustomListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomListPageAsync>

    /** @see list */
    fun list(params: CustomListParams): CompletableFuture<CustomListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomListPageAsync> =
        list(objectType, CustomListParams.none(), requestOptions)

    /** Move an Object identified by `{objectId}` to the recycling bin. */
    fun delete(objectId: String, params: CustomDeleteParams): CompletableFuture<Void?> =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: CustomDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CustomDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Read an Object identified by `{objectId}`. `{objectId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(
        objectId: String,
        params: CustomGetParams,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectId: String,
        params: CustomGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(params: CustomGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /**
     * Merge two CRM objects of the same type by specifying one as the primary object and the other
     * as the object to be merged into it.
     */
    fun merge(
        objectType: String,
        params: CustomMergeParams,
    ): CompletableFuture<SimplePublicObject> = merge(objectType, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        objectType: String,
        params: CustomMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        merge(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see merge */
    fun merge(params: CustomMergeParams): CompletableFuture<SimplePublicObject> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: CustomMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    fun search(
        objectType: String,
        params: CustomSearchParams,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: CustomSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(
        params: CustomSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CustomSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /**
     * A view of [CustomServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}`, but is
         * otherwise the same as [CustomServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: CustomCreateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: CustomCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: CustomCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [CustomServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: CustomUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: CustomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CustomUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}`, but is otherwise
         * the same as [CustomServiceAsync.list].
         */
        fun list(objectType: String): CompletableFuture<HttpResponseFor<CustomListPageAsync>> =
            list(objectType, CustomListParams.none())

        /** @see list */
        fun list(
            objectType: String,
            params: CustomListParams = CustomListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomListPageAsync>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            objectType: String,
            params: CustomListParams = CustomListParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomListPageAsync>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CustomListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomListPageAsync>>

        /** @see list */
        fun list(
            params: CustomListParams
        ): CompletableFuture<HttpResponseFor<CustomListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomListPageAsync>> =
            list(objectType, CustomListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/{objectType}/{objectId}`,
         * but is otherwise the same as [CustomServiceAsync.delete].
         */
        fun delete(objectId: String, params: CustomDeleteParams): CompletableFuture<HttpResponse> =
            delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: CustomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(params: CustomDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CustomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [CustomServiceAsync.get].
         */
        fun get(
            objectId: String,
            params: CustomGetParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            params: CustomGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            params: CustomGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CustomGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/merge`, but is
         * otherwise the same as [CustomServiceAsync.merge].
         */
        fun merge(
            objectType: String,
            params: CustomMergeParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(objectType, params, RequestOptions.none())

        /** @see merge */
        fun merge(
            objectType: String,
            params: CustomMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see merge */
        fun merge(
            params: CustomMergeParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: CustomMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/search`, but is
         * otherwise the same as [CustomServiceAsync.search].
         */
        fun search(
            objectType: String,
            params: CustomSearchParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        fun search(
            objectType: String,
            params: CustomSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
        fun search(
            params: CustomSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: CustomSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>
    }
}
