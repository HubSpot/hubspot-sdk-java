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
import com.hubspot.models.crm.objects.products.ProductCreateParams
import com.hubspot.models.crm.objects.products.ProductDeleteParams
import com.hubspot.models.crm.objects.products.ProductGetParams
import com.hubspot.models.crm.objects.products.ProductListPage
import com.hubspot.models.crm.objects.products.ProductListParams
import com.hubspot.models.crm.objects.products.ProductSearchParams
import com.hubspot.models.crm.objects.products.ProductUpdateParams
import com.hubspot.services.blocking.crm.objects.products.BatchService
import java.util.function.Consumer

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService

    fun batch(): BatchService

    /**
     * Create a product with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard products is provided.
     */
    fun create(params: ProductCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            ProductCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{productId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{productId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(productId: String, params: ProductUpdateParams): SimplePublicObject =
        update(productId, params, RequestOptions.none())

    /** @see update */
    fun update(
        productId: String,
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see update */
    fun update(params: ProductUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of products. Control what is returned via the `properties` query param. */
    fun list(): ProductListPage = list(ProductListParams.none())

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see list */
    fun list(params: ProductListParams = ProductListParams.none()): ProductListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    /** Move an Object identified by `{productId}` to the recycling bin. */
    fun delete(productId: String) = delete(productId, ProductDeleteParams.none())

    /** @see delete */
    fun delete(
        productId: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see delete */
    fun delete(productId: String, params: ProductDeleteParams = ProductDeleteParams.none()) =
        delete(productId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProductDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProductDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(productId: String, requestOptions: RequestOptions) =
        delete(productId, ProductDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{productId}`. `{productId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(productId: String): SimplePublicObjectWithAssociations =
        get(productId, ProductGetParams.none())

    /** @see get */
    fun get(
        productId: String,
        params: ProductGetParams = ProductGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see get */
    fun get(
        productId: String,
        params: ProductGetParams = ProductGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(productId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ProductGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: ProductGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(productId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(productId, ProductGetParams.none(), requestOptions)

    /**
     * Execute a search for products based on defined filters, properties, and sorting options. This
     * endpoint allows for detailed querying of product data within the CRM, enabling users to
     * retrieve specific product information by applying multiple filter groups and sorting
     * criteria.
     */
    fun search(params: ProductSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ProductSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            ProductSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/products`, but is otherwise
         * the same as [ProductService.create].
         */
        @MustBeClosed
        fun create(params: ProductCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                ProductCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/products/{productId}`, but is
         * otherwise the same as [ProductService.update].
         */
        @MustBeClosed
        fun update(
            productId: String,
            params: ProductUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(productId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            productId: String,
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ProductUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/products`, but is otherwise the
         * same as [ProductService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProductListPage> = list(ProductListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): HttpResponseFor<ProductListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/products/{productId}`, but
         * is otherwise the same as [ProductService.delete].
         */
        @MustBeClosed
        fun delete(productId: String): HttpResponse = delete(productId, ProductDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            productId: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            productId: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
        ): HttpResponse = delete(productId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProductDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(productId: String, requestOptions: RequestOptions): HttpResponse =
            delete(productId, ProductDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/products/{productId}`, but is
         * otherwise the same as [ProductService.get].
         */
        @MustBeClosed
        fun get(productId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(productId, ProductGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            productId: String,
            params: ProductGetParams = ProductGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            productId: String,
            params: ProductGetParams = ProductGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(productId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ProductGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: ProductGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            productId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(productId, ProductGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/products/search`, but is
         * otherwise the same as [ProductService.search].
         */
        @MustBeClosed
        fun search(
            params: ProductSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ProductSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                ProductSearchParams.builder()
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
