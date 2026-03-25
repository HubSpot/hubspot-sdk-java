// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.discounts.DiscountCreateParams
import com.hubspot_sdk.api.models.crm.objects.discounts.DiscountDeleteParams
import com.hubspot_sdk.api.models.crm.objects.discounts.DiscountGetParams
import com.hubspot_sdk.api.models.crm.objects.discounts.DiscountListPage
import com.hubspot_sdk.api.models.crm.objects.discounts.DiscountListParams
import com.hubspot_sdk.api.models.crm.objects.discounts.DiscountSearchParams
import com.hubspot_sdk.api.models.crm.objects.discounts.DiscountUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.discounts.BatchService
import java.util.function.Consumer

interface DiscountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiscountService

    fun batch(): BatchService

    /** Create a discount */
    fun create(params: DiscountCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            DiscountCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{discountId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{discountId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(discountId: String, params: DiscountUpdateParams): SimplePublicObject =
        update(discountId, params, RequestOptions.none())

    /** @see update */
    fun update(
        discountId: String,
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see update */
    fun update(params: DiscountUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve all discounts, using query parameters to specify the information that gets returned.
     */
    fun list(): DiscountListPage = list(DiscountListParams.none())

    /** @see list */
    fun list(
        params: DiscountListParams = DiscountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DiscountListPage

    /** @see list */
    fun list(params: DiscountListParams = DiscountListParams.none()): DiscountListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DiscountListPage =
        list(DiscountListParams.none(), requestOptions)

    /** Delete a discount. */
    fun delete(discountId: String) = delete(discountId, DiscountDeleteParams.none())

    /** @see delete */
    fun delete(
        discountId: String,
        params: DiscountDeleteParams = DiscountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see delete */
    fun delete(discountId: String, params: DiscountDeleteParams = DiscountDeleteParams.none()) =
        delete(discountId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DiscountDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: DiscountDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(discountId: String, requestOptions: RequestOptions) =
        delete(discountId, DiscountDeleteParams.none(), requestOptions)

    /**
     * Retrieve a discount by its ID (`objectId`) or by a unique property (`idProperty`). You can
     * specify what is returned using the `properties` query parameter.
     */
    fun get(discountId: String): SimplePublicObjectWithAssociations =
        get(discountId, DiscountGetParams.none())

    /** @see get */
    fun get(
        discountId: String,
        params: DiscountGetParams = DiscountGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see get */
    fun get(
        discountId: String,
        params: DiscountGetParams = DiscountGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(discountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DiscountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: DiscountGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        discountId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(discountId, DiscountGetParams.none(), requestOptions)

    /** Search for a discount */
    fun search(params: DiscountSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: DiscountSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            DiscountSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [DiscountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiscountService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/discounts`, but is otherwise
         * the same as [DiscountService.create].
         */
        @MustBeClosed
        fun create(params: DiscountCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                DiscountCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/discounts/{discountId}`, but
         * is otherwise the same as [DiscountService.update].
         */
        @MustBeClosed
        fun update(
            discountId: String,
            params: DiscountUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(discountId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            discountId: String,
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DiscountUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/discounts`, but is otherwise
         * the same as [DiscountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DiscountListPage> = list(DiscountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DiscountListParams = DiscountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DiscountListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DiscountListParams = DiscountListParams.none()
        ): HttpResponseFor<DiscountListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DiscountListPage> =
            list(DiscountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/discounts/{discountId}`, but
         * is otherwise the same as [DiscountService.delete].
         */
        @MustBeClosed
        fun delete(discountId: String): HttpResponse =
            delete(discountId, DiscountDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
        ): HttpResponse = delete(discountId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DiscountDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(discountId: String, requestOptions: RequestOptions): HttpResponse =
            delete(discountId, DiscountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/discounts/{discountId}`, but is
         * otherwise the same as [DiscountService.get].
         */
        @MustBeClosed
        fun get(discountId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(discountId, DiscountGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            discountId: String,
            params: DiscountGetParams = DiscountGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            discountId: String,
            params: DiscountGetParams = DiscountGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(discountId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DiscountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: DiscountGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            discountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(discountId, DiscountGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/discounts/search`, but is
         * otherwise the same as [DiscountService.search].
         */
        @MustBeClosed
        fun search(
            params: DiscountSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: DiscountSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                DiscountSearchParams.builder()
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
