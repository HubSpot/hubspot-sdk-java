// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.commercepayments.CommercePaymentCreateParams
import com.hubspot.sdk.models.crm.objects.commercepayments.CommercePaymentDeleteParams
import com.hubspot.sdk.models.crm.objects.commercepayments.CommercePaymentGetParams
import com.hubspot.sdk.models.crm.objects.commercepayments.CommercePaymentListPage
import com.hubspot.sdk.models.crm.objects.commercepayments.CommercePaymentListParams
import com.hubspot.sdk.models.crm.objects.commercepayments.CommercePaymentSearchParams
import com.hubspot.sdk.models.crm.objects.commercepayments.CommercePaymentUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.commercepayments.BatchService
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
     * Create a commerce payment with the given properties and return a copy of the object,
     * including the ID. Documentation and examples for creating standard commerce payments is
     * provided.
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
     * Perform a partial update of an Object identified by `{commercePaymentId}`or optionally a
     * unique property value as specified by the `idProperty` query param. `{commercePaymentId}`
     * refers to the internal object ID by default, and the `idProperty` query param refers to a
     * property whose values are unique for the object. Provided property values will be
     * overwritten. Read-only and non-existent properties will result in an error. Properties values
     * can be cleared by passing an empty string.
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
     * Read a page of commerce payments. Control what is returned via the `properties` query param.
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

    /** Move an Object identified by `{commercePaymentId}` to the recycling bin. */
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
     * Read an Object identified by `{commercePaymentId}`. `{commercePaymentId}` refers to the
     * internal object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
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
     * Execute a search for commerce payments based on the provided filter groups, properties, and
     * sorting options. This endpoint allows for complex queries to retrieve specific payment
     * records from the CRM.
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
