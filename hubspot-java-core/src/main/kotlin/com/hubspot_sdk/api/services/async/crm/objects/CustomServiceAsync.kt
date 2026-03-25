// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.custom.CustomCreateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomDeleteParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomGetParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListPageAsync
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomMergeParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomSearchParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpdateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpsertParams
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

    /**
     * Create multiple CRM objects in a single request by specifying the object type and providing
     * the necessary properties and associations for each object.
     */
    fun create(
        objectType: String,
        params: CustomCreateParams,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: CustomCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: CustomCreateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /**
     * Update a batch of CRM objects by their internal IDs or unique property values, allowing for
     * efficient modifications of multiple records in a single request.
     */
    fun update(
        objectType: String,
        params: CustomUpdateParams,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: CustomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: CustomUpdateParams): CompletableFuture<BatchResponseSimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

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

    /**
     * Archive a batch of objects by their unique IDs. This operation moves the specified objects to
     * the recycling bin, effectively marking them as archived.
     */
    fun delete(objectType: String, params: CustomDeleteParams): CompletableFuture<Void?> =
        delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: CustomDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: CustomDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve records by record ID or include the `idProperty` parameter to retrieve records by a
     * custom unique value property.
     */
    fun get(
        objectType: String,
        params: CustomGetParams,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectType: String,
        params: CustomGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(params: CustomGetParams): CompletableFuture<BatchResponseSimplePublicObject> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

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

    /**
     * Execute a search query to find CRM objects of a given type, using specified filters and
     * properties. The search can be customized with filters, sorting, and pagination options.
     */
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
     * Create or update records identified by a unique property value as specified by the
     * `idProperty` query param. `idProperty` query param refers to a property whose values are
     * unique for the object.
     */
    fun upsert(
        objectType: String,
        params: CustomUpsertParams,
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(objectType, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        objectType: String,
        params: CustomUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see upsert */
    fun upsert(
        params: CustomUpsertParams
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: CustomUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject>

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

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/create`,
         * but is otherwise the same as [CustomServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: CustomCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: CustomCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: CustomCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/update`,
         * but is otherwise the same as [CustomServiceAsync.update].
         */
        fun update(
            objectType: String,
            params: CustomUpdateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(objectType, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectType: String,
            params: CustomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        fun update(
            params: CustomUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

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
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/archive`,
         * but is otherwise the same as [CustomServiceAsync.delete].
         */
        fun delete(
            objectType: String,
            params: CustomDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(objectType, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectType: String,
            params: CustomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        fun delete(params: CustomDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CustomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/read`, but
         * is otherwise the same as [CustomServiceAsync.get].
         */
        fun get(
            objectType: String,
            params: CustomGetParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(objectType, params, RequestOptions.none())

        /** @see get */
        fun get(
            objectType: String,
            params: CustomGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        fun get(
            params: CustomGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CustomGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

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

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/upsert`,
         * but is otherwise the same as [CustomServiceAsync.upsert].
         */
        fun upsert(
            objectType: String,
            params: CustomUpsertParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(objectType, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            objectType: String,
            params: CustomUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            params: CustomUpsertParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: CustomUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>>
    }
}
