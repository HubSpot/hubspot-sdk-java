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
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentCreateParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentDeleteParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentGetParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentListPage
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentListParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentSearchParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.commercepayments.BatchService
import java.util.function.Consumer

interface CommercePaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommercePaymentService

    fun batch(): BatchService

    /**
     * Create a single payment. Include a `properties` object to define
     * [property values](https://developers.hubspot.com/docs/guides/api/crm/properties) for the
     * {objectName}, along with an `associations` array to define
     * [associations](https://developers.hubspot.com/docs/guides/api/crm/associations/associations-v4)
     * with other CRM records.
     */
    fun create(params: CommercePaymentCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommercePaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            CommercePaymentCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Update a payment by ID (`objectId`) or unique property value (`idProperty`). Provided
     * property values will be overwritten. Read-only and non-existent properties will result in an
     * error. Properties values can be cleared by passing an empty string.
     */
    fun update(commercePaymentId: String, params: CommercePaymentUpdateParams): SimplePublicObject =
        update(commercePaymentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        commercePaymentId: String,
        params: CommercePaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

    /** @see update */
    fun update(params: CommercePaymentUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommercePaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve all payments, using query parameters to specify the information that gets returned.
     */
    fun list(): CommercePaymentListPage = list(CommercePaymentListParams.none())

    /** @see list */
    fun list(
        params: CommercePaymentListParams = CommercePaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommercePaymentListPage

    /** @see list */
    fun list(
        params: CommercePaymentListParams = CommercePaymentListParams.none()
    ): CommercePaymentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CommercePaymentListPage =
        list(CommercePaymentListParams.none(), requestOptions)

    /** Delete a payment by ID. */
    fun delete(commercePaymentId: String) =
        delete(commercePaymentId, CommercePaymentDeleteParams.none())

    /** @see delete */
    fun delete(
        commercePaymentId: String,
        params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commercePaymentId: String,
        params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
    ) = delete(commercePaymentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommercePaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: CommercePaymentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(commercePaymentId: String, requestOptions: RequestOptions) =
        delete(commercePaymentId, CommercePaymentDeleteParams.none(), requestOptions)

    /**
     * Retrieve a payment by its ID (`objectId`) or by a unique property (`idProperty`). You can
     * specify what is returned using the `properties` query parameter.
     */
    fun get(commercePaymentId: String): SimplePublicObjectWithAssociations =
        get(commercePaymentId, CommercePaymentGetParams.none())

    /** @see get */
    fun get(
        commercePaymentId: String,
        params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

    /** @see get */
    fun get(
        commercePaymentId: String,
        params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(commercePaymentId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CommercePaymentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: CommercePaymentGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        commercePaymentId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(commercePaymentId, CommercePaymentGetParams.none(), requestOptions)

    /**
     * Search for payments by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(params: CommercePaymentSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CommercePaymentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            CommercePaymentSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [CommercePaymentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommercePaymentService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/commerce_payments`, but is
         * otherwise the same as [CommercePaymentService.create].
         */
        @MustBeClosed
        fun create(params: CommercePaymentCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommercePaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                CommercePaymentCreateParams.builder()
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
         * Returns a raw HTTP response for `patch
         * /crm/objects/2026-03/commerce_payments/{commercePaymentId}`, but is otherwise the same as
         * [CommercePaymentService.update].
         */
        @MustBeClosed
        fun update(
            commercePaymentId: String,
            params: CommercePaymentUpdateParams,
        ): HttpResponseFor<SimplePublicObject> =
            update(commercePaymentId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            commercePaymentId: String,
            params: CommercePaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CommercePaymentUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CommercePaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/commerce_payments`, but is
         * otherwise the same as [CommercePaymentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CommercePaymentListPage> =
            list(CommercePaymentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommercePaymentListParams = CommercePaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommercePaymentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommercePaymentListParams = CommercePaymentListParams.none()
        ): HttpResponseFor<CommercePaymentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CommercePaymentListPage> =
            list(CommercePaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/commerce_payments/{commercePaymentId}`, but is otherwise the same as
         * [CommercePaymentService.delete].
         */
        @MustBeClosed
        fun delete(commercePaymentId: String): HttpResponse =
            delete(commercePaymentId, CommercePaymentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commercePaymentId: String,
            params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            commercePaymentId: String,
            params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
        ): HttpResponse = delete(commercePaymentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CommercePaymentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CommercePaymentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(commercePaymentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(commercePaymentId, CommercePaymentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/commerce_payments/{commercePaymentId}`, but is otherwise the same as
         * [CommercePaymentService.get].
         */
        @MustBeClosed
        fun get(commercePaymentId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(commercePaymentId, CommercePaymentGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            commercePaymentId: String,
            params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            commercePaymentId: String,
            params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(commercePaymentId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CommercePaymentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(
            params: CommercePaymentGetParams
        ): HttpResponseFor<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            commercePaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(commercePaymentId, CommercePaymentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/commerce_payments/search`, but
         * is otherwise the same as [CommercePaymentService.search].
         */
        @MustBeClosed
        fun search(
            params: CommercePaymentSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CommercePaymentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                CommercePaymentSearchParams.builder()
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
