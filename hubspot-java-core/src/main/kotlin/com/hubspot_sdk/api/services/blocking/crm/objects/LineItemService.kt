// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemCreateParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemDeleteParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemGetParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemListPage
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemListParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemSearchParams
import com.hubspot_sdk.api.models.crm.objects.lineitems.LineItemUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.lineitems.BatchService
import java.util.function.Consumer

interface LineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemService

    fun batch(): BatchService

    /**
     * Create a line item with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard line items is provided.
     */
    fun create(params: LineItemCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            LineItemCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{lineItemId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{lineItemId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(lineItemId: String, params: LineItemUpdateParams): SimplePublicObject =
        update(lineItemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        lineItemId: String,
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

    /** @see update */
    fun update(params: LineItemUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of line items. Control what is returned via the `properties` query param. */
    fun list(): LineItemListPage = list(LineItemListParams.none())

    /** @see list */
    fun list(
        params: LineItemListParams = LineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemListPage

    /** @see list */
    fun list(params: LineItemListParams = LineItemListParams.none()): LineItemListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LineItemListPage =
        list(LineItemListParams.none(), requestOptions)

    /** Move an Object identified by `{lineItemId}` to the recycling bin. */
    fun delete(lineItemId: String) = delete(lineItemId, LineItemDeleteParams.none())

    /** @see delete */
    fun delete(
        lineItemId: String,
        params: LineItemDeleteParams = LineItemDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

    /** @see delete */
    fun delete(lineItemId: String, params: LineItemDeleteParams = LineItemDeleteParams.none()) =
        delete(lineItemId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: LineItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: LineItemDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(lineItemId: String, requestOptions: RequestOptions) =
        delete(lineItemId, LineItemDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{lineItemId}`. `{lineItemId}` refers to the internal object ID
     * by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(lineItemId: String): SimplePublicObjectWithAssociations =
        get(lineItemId, LineItemGetParams.none())

    /** @see get */
    fun get(
        lineItemId: String,
        params: LineItemGetParams = LineItemGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

    /** @see get */
    fun get(
        lineItemId: String,
        params: LineItemGetParams = LineItemGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(lineItemId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LineItemGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: LineItemGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        lineItemId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(lineItemId, LineItemGetParams.none(), requestOptions)

    /**
     * Execute a search for line items based on filters, properties, and sorting options provided in
     * the request body. This endpoint allows you to retrieve line items that match specific
     * conditions, facilitating targeted data retrieval in CRM operations.
     */
    fun search(params: LineItemSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: LineItemSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            LineItemSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [LineItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/line_items`, but is otherwise
         * the same as [LineItemService.create].
         */
        @MustBeClosed
        fun create(params: LineItemCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                LineItemCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/line_items/{lineItemId}`, but
         * is otherwise the same as [LineItemService.update].
         */
        @MustBeClosed
        fun update(
            lineItemId: String,
            params: LineItemUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(lineItemId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            lineItemId: String,
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LineItemUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/line_items`, but is otherwise
         * the same as [LineItemService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LineItemListPage> = list(LineItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LineItemListParams = LineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LineItemListParams = LineItemListParams.none()
        ): HttpResponseFor<LineItemListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LineItemListPage> =
            list(LineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/line_items/{lineItemId}`,
         * but is otherwise the same as [LineItemService.delete].
         */
        @MustBeClosed
        fun delete(lineItemId: String): HttpResponse =
            delete(lineItemId, LineItemDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            lineItemId: String,
            params: LineItemDeleteParams = LineItemDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            lineItemId: String,
            params: LineItemDeleteParams = LineItemDeleteParams.none(),
        ): HttpResponse = delete(lineItemId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LineItemDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(lineItemId: String, requestOptions: RequestOptions): HttpResponse =
            delete(lineItemId, LineItemDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/line_items/{lineItemId}`, but
         * is otherwise the same as [LineItemService.get].
         */
        @MustBeClosed
        fun get(lineItemId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(lineItemId, LineItemGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            lineItemId: String,
            params: LineItemGetParams = LineItemGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().lineItemId(lineItemId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            lineItemId: String,
            params: LineItemGetParams = LineItemGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(lineItemId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LineItemGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: LineItemGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            lineItemId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(lineItemId, LineItemGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/line_items/search`, but is
         * otherwise the same as [LineItemService.search].
         */
        @MustBeClosed
        fun search(
            params: LineItemSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: LineItemSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                LineItemSearchParams.builder()
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
