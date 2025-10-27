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
import com.hubspot_sdk.api.models.crm.objects.carts.CartCreateParams
import com.hubspot_sdk.api.models.crm.objects.carts.CartDeleteParams
import com.hubspot_sdk.api.models.crm.objects.carts.CartGetParams
import com.hubspot_sdk.api.models.crm.objects.carts.CartListPageAsync
import com.hubspot_sdk.api.models.crm.objects.carts.CartListParams
import com.hubspot_sdk.api.models.crm.objects.carts.CartSearchParams
import com.hubspot_sdk.api.models.crm.objects.carts.CartUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.carts.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CartServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a cart with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard carts is provided.
     */
    fun create(params: CartCreateParams): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CartCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            CartCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{cartId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{cartId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(cartId: String, params: CartUpdateParams): CompletableFuture<SimplePublicObject> =
        update(cartId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cartId: String,
        params: CartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().cartId(cartId).build(), requestOptions)

    /** @see update */
    fun update(params: CartUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CartUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of carts. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<CartListPageAsync> = list(CartListParams.none())

    /** @see list */
    fun list(
        params: CartListParams = CartListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CartListPageAsync>

    /** @see list */
    fun list(params: CartListParams = CartListParams.none()): CompletableFuture<CartListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CartListPageAsync> =
        list(CartListParams.none(), requestOptions)

    /** Move an Object identified by `{cartId}` to the recycling bin. */
    fun delete(cartId: String): CompletableFuture<Void?> = delete(cartId, CartDeleteParams.none())

    /** @see delete */
    fun delete(
        cartId: String,
        params: CartDeleteParams = CartDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().cartId(cartId).build(), requestOptions)

    /** @see delete */
    fun delete(
        cartId: String,
        params: CartDeleteParams = CartDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(cartId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CartDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CartDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(cartId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(cartId, CartDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{cartId}`. `{cartId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(cartId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(cartId, CartGetParams.none())

    /** @see get */
    fun get(
        cartId: String,
        params: CartGetParams = CartGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().cartId(cartId).build(), requestOptions)

    /** @see get */
    fun get(
        cartId: String,
        params: CartGetParams = CartGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(cartId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CartGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: CartGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        cartId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(cartId, CartGetParams.none(), requestOptions)

    fun search(
        params: CartSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CartSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            CartSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [CartServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CartServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/carts`, but is otherwise the same
         * as [CartServiceAsync.create].
         */
        fun create(
            params: CartCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CartCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                CartCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/v3/objects/carts/{cartId}`, but is otherwise
         * the same as [CartServiceAsync.update].
         */
        fun update(
            cartId: String,
            params: CartUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(cartId, params, RequestOptions.none())

        /** @see update */
        fun update(
            cartId: String,
            params: CartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().cartId(cartId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CartUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CartUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/carts`, but is otherwise the same as
         * [CartServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CartListPageAsync>> =
            list(CartListParams.none())

        /** @see list */
        fun list(
            params: CartListParams = CartListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CartListPageAsync>>

        /** @see list */
        fun list(
            params: CartListParams = CartListParams.none()
        ): CompletableFuture<HttpResponseFor<CartListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CartListPageAsync>> =
            list(CartListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/carts/{cartId}`, but is otherwise
         * the same as [CartServiceAsync.delete].
         */
        fun delete(cartId: String): CompletableFuture<HttpResponse> =
            delete(cartId, CartDeleteParams.none())

        /** @see delete */
        fun delete(
            cartId: String,
            params: CartDeleteParams = CartDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().cartId(cartId).build(), requestOptions)

        /** @see delete */
        fun delete(
            cartId: String,
            params: CartDeleteParams = CartDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(cartId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CartDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CartDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            cartId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(cartId, CartDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/carts/{cartId}`, but is otherwise
         * the same as [CartServiceAsync.get].
         */
        fun get(
            cartId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(cartId, CartGetParams.none())

        /** @see get */
        fun get(
            cartId: String,
            params: CartGetParams = CartGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().cartId(cartId).build(), requestOptions)

        /** @see get */
        fun get(
            cartId: String,
            params: CartGetParams = CartGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(cartId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CartGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: CartGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            cartId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(cartId, CartGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/carts/search`, but is otherwise the
         * same as [CartServiceAsync.search].
         */
        fun search(
            params: CartSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: CartSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                CartSearchParams.builder()
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
