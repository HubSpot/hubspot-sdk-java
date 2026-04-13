// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.discounts.DiscountCreateParams
import com.hubspot.models.crm.objects.discounts.DiscountDeleteParams
import com.hubspot.models.crm.objects.discounts.DiscountGetParams
import com.hubspot.models.crm.objects.discounts.DiscountListPageAsync
import com.hubspot.models.crm.objects.discounts.DiscountListParams
import com.hubspot.models.crm.objects.discounts.DiscountSearchParams
import com.hubspot.models.crm.objects.discounts.DiscountUpdateParams
import com.hubspot.services.async.crm.objects.discounts.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DiscountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiscountServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a discount with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard discounts is provided.
     */
    fun create(params: DiscountCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            DiscountCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{discountId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{discountId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        discountId: String,
        params: DiscountUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(discountId, params, RequestOptions.none())

    /** @see update */
    fun update(
        discountId: String,
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see update */
    fun update(params: DiscountUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** List */
    fun list(): CompletableFuture<DiscountListPageAsync> = list(DiscountListParams.none())

    /** @see list */
    fun list(
        params: DiscountListParams = DiscountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiscountListPageAsync>

    /** @see list */
    fun list(
        params: DiscountListParams = DiscountListParams.none()
    ): CompletableFuture<DiscountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DiscountListPageAsync> =
        list(DiscountListParams.none(), requestOptions)

    /** Archive */
    fun delete(discountId: String): CompletableFuture<Void?> =
        delete(discountId, DiscountDeleteParams.none())

    /** @see delete */
    fun delete(
        discountId: String,
        params: DiscountDeleteParams = DiscountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see delete */
    fun delete(
        discountId: String,
        params: DiscountDeleteParams = DiscountDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(discountId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DiscountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DiscountDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(discountId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(discountId, DiscountDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{discountId}`. `{discountId}` refers to the internal object ID
     * by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(discountId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(discountId, DiscountGetParams.none())

    /** @see get */
    fun get(
        discountId: String,
        params: DiscountGetParams = DiscountGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see get */
    fun get(
        discountId: String,
        params: DiscountGetParams = DiscountGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(discountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DiscountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: DiscountGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        discountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(discountId, DiscountGetParams.none(), requestOptions)

    fun search(
        params: DiscountSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: DiscountSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            DiscountSearchParams.builder()
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
     * A view of [DiscountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DiscountServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/discounts`, but is otherwise
         * the same as [DiscountServiceAsync.create].
         */
        fun create(
            params: DiscountCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                DiscountCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/discounts/{discountId}`, but
         * is otherwise the same as [DiscountServiceAsync.update].
         */
        fun update(
            discountId: String,
            params: DiscountUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(discountId, params, RequestOptions.none())

        /** @see update */
        fun update(
            discountId: String,
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DiscountUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/discounts`, but is otherwise
         * the same as [DiscountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(DiscountListParams.none())

        /** @see list */
        fun list(
            params: DiscountListParams = DiscountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>>

        /** @see list */
        fun list(
            params: DiscountListParams = DiscountListParams.none()
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DiscountListPageAsync>> =
            list(DiscountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/discounts/{discountId}`, but
         * is otherwise the same as [DiscountServiceAsync.delete].
         */
        fun delete(discountId: String): CompletableFuture<HttpResponse> =
            delete(discountId, DiscountDeleteParams.none())

        /** @see delete */
        fun delete(
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see delete */
        fun delete(
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(discountId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DiscountDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            discountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(discountId, DiscountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/discounts/{discountId}`, but is
         * otherwise the same as [DiscountServiceAsync.get].
         */
        fun get(
            discountId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(discountId, DiscountGetParams.none())

        /** @see get */
        fun get(
            discountId: String,
            params: DiscountGetParams = DiscountGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see get */
        fun get(
            discountId: String,
            params: DiscountGetParams = DiscountGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(discountId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DiscountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: DiscountGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            discountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(discountId, DiscountGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/discounts/search`, but is
         * otherwise the same as [DiscountServiceAsync.search].
         */
        fun search(
            params: DiscountSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: DiscountSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                DiscountSearchParams.builder()
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
