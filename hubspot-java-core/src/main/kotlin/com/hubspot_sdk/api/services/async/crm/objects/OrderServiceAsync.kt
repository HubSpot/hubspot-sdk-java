// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.orders.OrderCreateParams
import com.hubspot_sdk.api.models.crm.objects.orders.OrderDeleteParams
import com.hubspot_sdk.api.models.crm.objects.orders.OrderGetParams
import com.hubspot_sdk.api.models.crm.objects.orders.OrderListPageAsync
import com.hubspot_sdk.api.models.crm.objects.orders.OrderListParams
import com.hubspot_sdk.api.models.crm.objects.orders.OrderSearchParams
import com.hubspot_sdk.api.models.crm.objects.orders.OrderUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.orders.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a order with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard orders is provided.
     */
    fun create(params: OrderCreateParams): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            OrderCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{orderId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{orderId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(orderId: String, params: OrderUpdateParams): CompletableFuture<SimplePublicObject> =
        update(orderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        orderId: String,
        params: OrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see update */
    fun update(params: OrderUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of orders. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<OrderListPageAsync> = list(OrderListParams.none())

    /** @see list */
    fun list(
        params: OrderListParams = OrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderListPageAsync>

    /** @see list */
    fun list(
        params: OrderListParams = OrderListParams.none()
    ): CompletableFuture<OrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrderListPageAsync> =
        list(OrderListParams.none(), requestOptions)

    /** Move an Object identified by `{orderId}` to the recycling bin. */
    fun delete(orderId: String): CompletableFuture<Void?> =
        delete(orderId, OrderDeleteParams.none())

    /** @see delete */
    fun delete(
        orderId: String,
        params: OrderDeleteParams = OrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see delete */
    fun delete(
        orderId: String,
        params: OrderDeleteParams = OrderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(orderId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OrderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(orderId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(orderId, OrderDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{orderId}`. `{orderId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(orderId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(orderId, OrderGetParams.none())

    /** @see get */
    fun get(
        orderId: String,
        params: OrderGetParams = OrderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see get */
    fun get(
        orderId: String,
        params: OrderGetParams = OrderGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(orderId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: OrderGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        orderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(orderId, OrderGetParams.none(), requestOptions)

    fun search(
        params: OrderSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: OrderSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            OrderSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [OrderServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrderServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/orders`, but is otherwise the same
         * as [OrderServiceAsync.create].
         */
        fun create(
            params: OrderCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                OrderCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/orders/{orderId}`, but is
         * otherwise the same as [OrderServiceAsync.update].
         */
        fun update(
            orderId: String,
            params: OrderUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(orderId, params, RequestOptions.none())

        /** @see update */
        fun update(
            orderId: String,
            params: OrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see update */
        fun update(
            params: OrderUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/orders`, but is otherwise the same
         * as [OrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OrderListPageAsync>> =
            list(OrderListParams.none())

        /** @see list */
        fun list(
            params: OrderListParams = OrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderListPageAsync>>

        /** @see list */
        fun list(
            params: OrderListParams = OrderListParams.none()
        ): CompletableFuture<HttpResponseFor<OrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrderListPageAsync>> =
            list(OrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/orders/{orderId}`, but is
         * otherwise the same as [OrderServiceAsync.delete].
         */
        fun delete(orderId: String): CompletableFuture<HttpResponse> =
            delete(orderId, OrderDeleteParams.none())

        /** @see delete */
        fun delete(
            orderId: String,
            params: OrderDeleteParams = OrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see delete */
        fun delete(
            orderId: String,
            params: OrderDeleteParams = OrderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(orderId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OrderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            orderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(orderId, OrderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/orders/{orderId}`, but is otherwise
         * the same as [OrderServiceAsync.get].
         */
        fun get(
            orderId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(orderId, OrderGetParams.none())

        /** @see get */
        fun get(
            orderId: String,
            params: OrderGetParams = OrderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see get */
        fun get(
            orderId: String,
            params: OrderGetParams = OrderGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(orderId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OrderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: OrderGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            orderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(orderId, OrderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/orders/search`, but is otherwise
         * the same as [OrderServiceAsync.search].
         */
        fun search(
            params: OrderSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: OrderSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                OrderSearchParams.builder()
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
