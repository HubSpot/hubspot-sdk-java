// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.custom.CustomCreateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomDeleteParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomGetParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListPage
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomMergeParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomSearchParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpdateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpsertParams
import java.util.function.Consumer

interface CustomService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomService

    /**
     * Create multiple tasks in a single request by providing a batch of task properties and
     * associations. This endpoint allows for efficient task creation by processing multiple tasks
     * together.
     */
    fun create(objectType: String, params: CustomCreateParams): BatchResponseSimplePublicObject =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: CustomCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: CustomCreateParams): BatchResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /**
     * Update multiple tasks in a single request using their internal IDs or unique property values.
     * This operation allows you to modify the properties of each task in the batch, ensuring
     * efficient management of task data.
     */
    fun update(objectType: String, params: CustomUpdateParams): BatchResponseSimplePublicObject =
        update(objectType, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectType: String,
        params: CustomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        update(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see update */
    fun update(params: CustomUpdateParams): BatchResponseSimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** Read a page of tasks. Control what is returned via the `properties` query param. */
    fun list(objectType: String): CustomListPage = list(objectType, CustomListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: CustomListParams = CustomListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomListPage = list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: CustomListParams = CustomListParams.none(),
    ): CustomListPage = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CustomListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomListPage

    /** @see list */
    fun list(params: CustomListParams): CustomListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(objectType: String, requestOptions: RequestOptions): CustomListPage =
        list(objectType, CustomListParams.none(), requestOptions)

    /**
     * Archive a batch of tasks by their IDs, moving them to the recycling bin. This operation
     * requires a list of task IDs to be provided in the request body.
     */
    fun delete(objectType: String, params: CustomDeleteParams) =
        delete(objectType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectType: String,
        params: CustomDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see delete */
    fun delete(params: CustomDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CustomDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Retrieve records by record ID or include the `idProperty` parameter to retrieve records by a
     * custom unique value property.
     */
    fun get(objectType: String, params: CustomGetParams): BatchResponseSimplePublicObject =
        get(objectType, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectType: String,
        params: CustomGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        get(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see get */
    fun get(params: CustomGetParams): BatchResponseSimplePublicObject =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    fun merge(objectType: String, params: CustomMergeParams): SimplePublicObject =
        merge(objectType, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        objectType: String,
        params: CustomMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = merge(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see merge */
    fun merge(params: CustomMergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: CustomMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Execute a search for tasks based on the provided criteria, including filters, properties, and
     * sorting options. This allows for retrieving tasks that match specific conditions or property
     * values.
     */
    fun search(
        objectType: String,
        params: CustomSearchParams,
    ): CollectionResponseWithTotalSimplePublicObject =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: CustomSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(params: CustomSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CustomSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /**
     * Create or update records identified by a unique property value as specified by the
     * `idProperty` query param. `idProperty` query param refers to a property whose values are
     * unique for the object.
     */
    fun upsert(
        objectType: String,
        params: CustomUpsertParams,
    ): BatchResponseSimplePublicUpsertObject = upsert(objectType, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        objectType: String,
        params: CustomUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject =
        upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: CustomUpsertParams): BatchResponseSimplePublicUpsertObject =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: CustomUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject

    /** A view of [CustomService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/create`,
         * but is otherwise the same as [CustomService.create].
         */
        @MustBeClosed
        fun create(
            objectType: String,
            params: CustomCreateParams,
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: CustomCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CustomCreateParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/update`,
         * but is otherwise the same as [CustomService.update].
         */
        @MustBeClosed
        fun update(
            objectType: String,
            params: CustomUpdateParams,
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(objectType, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectType: String,
            params: CustomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CustomUpdateParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}`, but is otherwise
         * the same as [CustomService.list].
         */
        @MustBeClosed
        fun list(objectType: String): HttpResponseFor<CustomListPage> =
            list(objectType, CustomListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: CustomListParams = CustomListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomListPage> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: CustomListParams = CustomListParams.none(),
        ): HttpResponseFor<CustomListPage> = list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CustomListParams): HttpResponseFor<CustomListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomListPage> =
            list(objectType, CustomListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/archive`,
         * but is otherwise the same as [CustomService.delete].
         */
        @MustBeClosed
        fun delete(objectType: String, params: CustomDeleteParams): HttpResponse =
            delete(objectType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectType: String,
            params: CustomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: CustomDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/read`, but
         * is otherwise the same as [CustomService.get].
         */
        @MustBeClosed
        fun get(
            objectType: String,
            params: CustomGetParams,
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(objectType, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectType: String,
            params: CustomGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: CustomGetParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CustomGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/merge`, but is
         * otherwise the same as [CustomService.merge].
         */
        @MustBeClosed
        fun merge(
            objectType: String,
            params: CustomMergeParams,
        ): HttpResponseFor<SimplePublicObject> = merge(objectType, params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            objectType: String,
            params: CustomMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see merge */
        @MustBeClosed
        fun merge(params: CustomMergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: CustomMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/search`, but is
         * otherwise the same as [CustomService.search].
         */
        @MustBeClosed
        fun search(
            objectType: String,
            params: CustomSearchParams,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            objectType: String,
            params: CustomSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
        @MustBeClosed
        fun search(
            params: CustomSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CustomSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/batch/upsert`,
         * but is otherwise the same as [CustomService.upsert].
         */
        @MustBeClosed
        fun upsert(
            objectType: String,
            params: CustomUpsertParams,
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(objectType, params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            objectType: String,
            params: CustomUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: CustomUpsertParams
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: CustomUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject>
    }
}
