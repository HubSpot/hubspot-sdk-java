// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.orders.OrderCreateParams
import com.hubspot.models.crm.objects.orders.OrderDeleteParams
import com.hubspot.models.crm.objects.orders.OrderGetParams
import com.hubspot.models.crm.objects.orders.OrderListPage
import com.hubspot.models.crm.objects.orders.OrderListParams
import com.hubspot.models.crm.objects.orders.OrderSearchParams
import com.hubspot.models.crm.objects.orders.OrderUpdateParams
import com.hubspot.services.blocking.crm.objects.orders.BatchService
import java.util.function.Consumer

interface OrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderService

    fun batch(): BatchService

    /**
     * Create a order with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard orders is provided.
     */
    fun create(params: OrderCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            OrderCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{orderId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{orderId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(orderId: String, params: OrderUpdateParams): SimplePublicObject =
        update(orderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        orderId: String,
        params: OrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see update */
    fun update(params: OrderUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of orders. Control what is returned via the `properties` query param. */
    fun list(): OrderListPage = list(OrderListParams.none())

    /** @see list */
    fun list(
        params: OrderListParams = OrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderListPage

    /** @see list */
    fun list(params: OrderListParams = OrderListParams.none()): OrderListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OrderListPage =
        list(OrderListParams.none(), requestOptions)

    /** Move an Object identified by `{orderId}` to the recycling bin. */
    fun delete(orderId: String) = delete(orderId, OrderDeleteParams.none())

    /** @see delete */
    fun delete(
        orderId: String,
        params: OrderDeleteParams = OrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see delete */
    fun delete(orderId: String, params: OrderDeleteParams = OrderDeleteParams.none()) =
        delete(orderId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: OrderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OrderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(orderId: String, requestOptions: RequestOptions) =
        delete(orderId, OrderDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{orderId}`. `{orderId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(orderId: String): SimplePublicObjectWithAssociations =
        get(orderId, OrderGetParams.none())

    /** @see get */
    fun get(
        orderId: String,
        params: OrderGetParams = OrderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see get */
    fun get(
        orderId: String,
        params: OrderGetParams = OrderGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(orderId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: OrderGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(orderId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(orderId, OrderGetParams.none(), requestOptions)

    /** Execute a search for orders using specified criteria and return matching results. */
    fun search(params: OrderSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: OrderSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            OrderSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [OrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/orders`, but is otherwise the
         * same as [OrderService.create].
         */
        @MustBeClosed
        fun create(params: OrderCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                OrderCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/orders/{orderId}`, but is
         * otherwise the same as [OrderService.update].
         */
        @MustBeClosed
        fun update(
            orderId: String,
            params: OrderUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(orderId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            orderId: String,
            params: OrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OrderUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/orders`, but is otherwise the
         * same as [OrderService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<OrderListPage> = list(OrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrderListParams = OrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OrderListParams = OrderListParams.none()): HttpResponseFor<OrderListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrderListPage> =
            list(OrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/orders/{orderId}`, but is
         * otherwise the same as [OrderService.delete].
         */
        @MustBeClosed
        fun delete(orderId: String): HttpResponse = delete(orderId, OrderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            orderId: String,
            params: OrderDeleteParams = OrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            orderId: String,
            params: OrderDeleteParams = OrderDeleteParams.none(),
        ): HttpResponse = delete(orderId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OrderDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(orderId: String, requestOptions: RequestOptions): HttpResponse =
            delete(orderId, OrderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/orders/{orderId}`, but is
         * otherwise the same as [OrderService.get].
         */
        @MustBeClosed
        fun get(orderId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(orderId, OrderGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            orderId: String,
            params: OrderGetParams = OrderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            orderId: String,
            params: OrderGetParams = OrderGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(orderId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: OrderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: OrderGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            orderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(orderId, OrderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/orders/search`, but is
         * otherwise the same as [OrderService.search].
         */
        @MustBeClosed
        fun search(
            params: OrderSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: OrderSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                OrderSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
