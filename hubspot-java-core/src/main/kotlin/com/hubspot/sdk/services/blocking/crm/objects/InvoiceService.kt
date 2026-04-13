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
import com.hubspot.sdk.models.crm.objects.invoices.InvoiceCreateParams
import com.hubspot.sdk.models.crm.objects.invoices.InvoiceDeleteParams
import com.hubspot.sdk.models.crm.objects.invoices.InvoiceGetParams
import com.hubspot.sdk.models.crm.objects.invoices.InvoiceListPage
import com.hubspot.sdk.models.crm.objects.invoices.InvoiceListParams
import com.hubspot.sdk.models.crm.objects.invoices.InvoiceSearchParams
import com.hubspot.sdk.models.crm.objects.invoices.InvoiceUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.invoices.BatchService
import java.util.function.Consumer

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService

    fun batch(): BatchService

    /**
     * Create a invoice with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard invoices is provided.
     */
    fun create(params: InvoiceCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            InvoiceCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{invoiceId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{invoiceId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(invoiceId: String, params: InvoiceUpdateParams): SimplePublicObject =
        update(invoiceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see update */
    fun update(params: InvoiceUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of invoices. Control what is returned via the `properties` query param. */
    fun list(): InvoiceListPage = list(InvoiceListParams.none())

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPage

    /** @see list */
    fun list(params: InvoiceListParams = InvoiceListParams.none()): InvoiceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InvoiceListPage =
        list(InvoiceListParams.none(), requestOptions)

    /** Move an Object identified by `{invoiceId}` to the recycling bin. */
    fun delete(invoiceId: String) = delete(invoiceId, InvoiceDeleteParams.none())

    /** @see delete */
    fun delete(
        invoiceId: String,
        params: InvoiceDeleteParams = InvoiceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see delete */
    fun delete(invoiceId: String, params: InvoiceDeleteParams = InvoiceDeleteParams.none()) =
        delete(invoiceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: InvoiceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: InvoiceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(invoiceId: String, requestOptions: RequestOptions) =
        delete(invoiceId, InvoiceDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{invoiceId}`. `{invoiceId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(invoiceId: String): SimplePublicObjectWithAssociations =
        get(invoiceId, InvoiceGetParams.none())

    /** @see get */
    fun get(
        invoiceId: String,
        params: InvoiceGetParams = InvoiceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see get */
    fun get(
        invoiceId: String,
        params: InvoiceGetParams = InvoiceGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(invoiceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: InvoiceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: InvoiceGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(invoiceId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(invoiceId, InvoiceGetParams.none(), requestOptions)

    /**
     * Execute a search for invoices based on filter criteria, sorting options, and properties to
     * include in the response. This endpoint supports pagination and allows for complex queries
     * using multiple filter groups.
     */
    fun search(params: InvoiceSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: InvoiceSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            InvoiceSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/invoices`, but is otherwise
         * the same as [InvoiceService.create].
         */
        @MustBeClosed
        fun create(params: InvoiceCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                InvoiceCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/invoices/{invoiceId}`, but is
         * otherwise the same as [InvoiceService.update].
         */
        @MustBeClosed
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(invoiceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: InvoiceUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/invoices`, but is otherwise the
         * same as [InvoiceService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<InvoiceListPage> = list(InvoiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): HttpResponseFor<InvoiceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPage> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/invoices/{invoiceId}`, but
         * is otherwise the same as [InvoiceService.delete].
         */
        @MustBeClosed
        fun delete(invoiceId: String): HttpResponse = delete(invoiceId, InvoiceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            invoiceId: String,
            params: InvoiceDeleteParams = InvoiceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            invoiceId: String,
            params: InvoiceDeleteParams = InvoiceDeleteParams.none(),
        ): HttpResponse = delete(invoiceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: InvoiceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(invoiceId: String, requestOptions: RequestOptions): HttpResponse =
            delete(invoiceId, InvoiceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/invoices/{invoiceId}`, but is
         * otherwise the same as [InvoiceService.get].
         */
        @MustBeClosed
        fun get(invoiceId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(invoiceId, InvoiceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            invoiceId: String,
            params: InvoiceGetParams = InvoiceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            invoiceId: String,
            params: InvoiceGetParams = InvoiceGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(invoiceId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: InvoiceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: InvoiceGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(invoiceId, InvoiceGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/invoices/search`, but is
         * otherwise the same as [InvoiceService.search].
         */
        @MustBeClosed
        fun search(
            params: InvoiceSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: InvoiceSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                InvoiceSearchParams.builder()
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
