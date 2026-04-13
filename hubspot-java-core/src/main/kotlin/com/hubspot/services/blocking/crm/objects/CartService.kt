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
import com.hubspot.models.crm.objects.carts.CartCreateParams
import com.hubspot.models.crm.objects.carts.CartDeleteParams
import com.hubspot.models.crm.objects.carts.CartGetParams
import com.hubspot.models.crm.objects.carts.CartListPage
import com.hubspot.models.crm.objects.carts.CartListParams
import com.hubspot.models.crm.objects.carts.CartSearchParams
import com.hubspot.models.crm.objects.carts.CartUpdateParams
import com.hubspot.services.blocking.crm.objects.carts.BatchService
import java.util.function.Consumer

interface CartService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CartService

    fun batch(): BatchService

    /**
     * Create a cart with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard carts is provided.
     */
    fun create(params: CartCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CartCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            CartCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of a cart, specified by its ID. Alternatively, you can specify a
     * cart by a unique property value using the `idProperty` query parameter. Provided property
     * values will be overwritten. Read-only and non-existent properties will result in an error.
     * Properties values can be cleared by passing an empty string.
     */
    fun update(cartId: String, params: CartUpdateParams): SimplePublicObject =
        update(cartId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cartId: String,
        params: CartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().cartId(cartId).build(), requestOptions)

    /** @see update */
    fun update(params: CartUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve all carts. You can control what is returned via the `properties` query parameter.
     */
    fun list(): CartListPage = list(CartListParams.none())

    /** @see list */
    fun list(
        params: CartListParams = CartListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CartListPage

    /** @see list */
    fun list(params: CartListParams = CartListParams.none()): CartListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CartListPage =
        list(CartListParams.none(), requestOptions)

    /** Delete a cart by its ID, moving it to the recycling bin. */
    fun delete(cartId: String) = delete(cartId, CartDeleteParams.none())

    /** @see delete */
    fun delete(
        cartId: String,
        params: CartDeleteParams = CartDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().cartId(cartId).build(), requestOptions)

    /** @see delete */
    fun delete(cartId: String, params: CartDeleteParams = CartDeleteParams.none()) =
        delete(cartId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CartDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CartDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(cartId: String, requestOptions: RequestOptions) =
        delete(cartId, CartDeleteParams.none(), requestOptions)

    /**
     * Retrieve a cart by its ID. You can control what is returned via the `properties` query
     * parameter.
     */
    fun get(cartId: String): SimplePublicObjectWithAssociations = get(cartId, CartGetParams.none())

    /** @see get */
    fun get(
        cartId: String,
        params: CartGetParams = CartGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().cartId(cartId).build(), requestOptions)

    /** @see get */
    fun get(
        cartId: String,
        params: CartGetParams = CartGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(cartId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CartGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: CartGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(cartId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(cartId, CartGetParams.none(), requestOptions)

    /**
     * Search for carts based on the specified search criteria, such as filters and properties, and
     * retrieve the matching results.
     */
    fun search(params: CartSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CartSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            CartSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [CartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CartService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/carts`, but is otherwise the
         * same as [CartService.create].
         */
        @MustBeClosed
        fun create(params: CartCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CartCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                CartCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/carts/{cartId}`, but is
         * otherwise the same as [CartService.update].
         */
        @MustBeClosed
        fun update(cartId: String, params: CartUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(cartId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            cartId: String,
            params: CartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().cartId(cartId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CartUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/carts`, but is otherwise the
         * same as [CartService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CartListPage> = list(CartListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CartListParams = CartListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CartListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CartListParams = CartListParams.none()): HttpResponseFor<CartListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CartListPage> =
            list(CartListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/carts/{cartId}`, but is
         * otherwise the same as [CartService.delete].
         */
        @MustBeClosed
        fun delete(cartId: String): HttpResponse = delete(cartId, CartDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            cartId: String,
            params: CartDeleteParams = CartDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().cartId(cartId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            cartId: String,
            params: CartDeleteParams = CartDeleteParams.none(),
        ): HttpResponse = delete(cartId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CartDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CartDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(cartId: String, requestOptions: RequestOptions): HttpResponse =
            delete(cartId, CartDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/carts/{cartId}`, but is
         * otherwise the same as [CartService.get].
         */
        @MustBeClosed
        fun get(cartId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(cartId, CartGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            cartId: String,
            params: CartGetParams = CartGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().cartId(cartId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            cartId: String,
            params: CartGetParams = CartGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(cartId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CartGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: CartGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            cartId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(cartId, CartGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/carts/search`, but is
         * otherwise the same as [CartService.search].
         */
        @MustBeClosed
        fun search(
            params: CartSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CartSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                CartSearchParams.builder()
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
