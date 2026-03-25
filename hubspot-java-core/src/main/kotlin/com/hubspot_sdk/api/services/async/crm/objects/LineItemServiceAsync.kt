// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemCreateParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemDeleteParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemGetParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemListPageAsync
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemListParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemSearchParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.lineitems.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a line item with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard line items is provided.
     */
    fun create(params: LineItemCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            LineItemCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{lineItemId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{lineItemId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        lineItemId: String,
        params: LineItemUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(lineItemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        lineItemId: String,
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

    /** @see update */
    fun update(params: LineItemUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of line items. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<LineItemListPageAsync> = list(LineItemListParams.none())

    /** @see list */
    fun list(
        params: LineItemListParams = LineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemListPageAsync>

    /** @see list */
    fun list(
        params: LineItemListParams = LineItemListParams.none()
    ): CompletableFuture<LineItemListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LineItemListPageAsync> =
        list(LineItemListParams.none(), requestOptions)

    /** Move an Object identified by `{lineItemId}` to the recycling bin. */
    fun delete(lineItemId: String): CompletableFuture<Void?> =
        delete(lineItemId, LineItemDeleteParams.none())

    /** @see delete */
    fun delete(
        lineItemId: String,
        params: LineItemDeleteParams = LineItemDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

    /** @see delete */
    fun delete(
        lineItemId: String,
        params: LineItemDeleteParams = LineItemDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(lineItemId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LineItemDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(lineItemId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(lineItemId, LineItemDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{lineItemId}`. `{lineItemId}` refers to the internal object ID
     * by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(lineItemId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(lineItemId, LineItemGetParams.none())

    /** @see get */
    fun get(
        lineItemId: String,
        params: LineItemGetParams = LineItemGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

    /** @see get */
    fun get(
        lineItemId: String,
        params: LineItemGetParams = LineItemGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(lineItemId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LineItemGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: LineItemGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        lineItemId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(lineItemId, LineItemGetParams.none(), requestOptions)

    /**
     * Execute a search for line items based on filters, properties, and sorting options provided in
     * the request body. This endpoint allows you to retrieve line items that match specific
     * conditions, facilitating targeted data retrieval in CRM operations.
     */
    fun search(
        params: LineItemSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: LineItemSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            LineItemSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LineItemServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/line_items`, but is otherwise
         * the same as [LineItemServiceAsync.create].
         */
        fun create(
            params: LineItemCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                LineItemCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/line_items/{lineItemId}`, but
         * is otherwise the same as [LineItemServiceAsync.update].
         */
        fun update(
            lineItemId: String,
            params: LineItemUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(lineItemId, params, RequestOptions.none())

        /** @see update */
        fun update(
            lineItemId: String,
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

        /** @see update */
        fun update(
            params: LineItemUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/line_items`, but is otherwise
         * the same as [LineItemServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LineItemListPageAsync>> =
            list(LineItemListParams.none())

        /** @see list */
        fun list(
            params: LineItemListParams = LineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemListPageAsync>>

        /** @see list */
        fun list(
            params: LineItemListParams = LineItemListParams.none()
        ): CompletableFuture<HttpResponseFor<LineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LineItemListPageAsync>> =
            list(LineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/line_items/{lineItemId}`,
         * but is otherwise the same as [LineItemServiceAsync.delete].
         */
        fun delete(lineItemId: String): CompletableFuture<HttpResponse> =
            delete(lineItemId, LineItemDeleteParams.none())

        /** @see delete */
        fun delete(
            lineItemId: String,
            params: LineItemDeleteParams = LineItemDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

        /** @see delete */
        fun delete(
            lineItemId: String,
            params: LineItemDeleteParams = LineItemDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(lineItemId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LineItemDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            lineItemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(lineItemId, LineItemDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/line_items/{lineItemId}`, but
         * is otherwise the same as [LineItemServiceAsync.get].
         */
        fun get(
            lineItemId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(lineItemId, LineItemGetParams.none())

        /** @see get */
        fun get(
            lineItemId: String,
            params: LineItemGetParams = LineItemGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

        /** @see get */
        fun get(
            lineItemId: String,
            params: LineItemGetParams = LineItemGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(lineItemId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LineItemGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: LineItemGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            lineItemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(lineItemId, LineItemGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/line_items/search`, but is
         * otherwise the same as [LineItemServiceAsync.search].
         */
        fun search(
            params: LineItemSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: LineItemSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                LineItemSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
