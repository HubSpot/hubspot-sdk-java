// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.crm.objects.listings.ListingCreateParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingDeleteParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingGetParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingListPage
import com.hubspot_sdk.api.models.crm.objects.listings.ListingListParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingSearchParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.listings.BatchService
import java.util.function.Consumer

interface ListingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListingService

    fun batch(): BatchService

    /**
     * Create a listing with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard listings is provided.
     */
    fun create(params: ListingCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ListingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(
            ListingCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CreatedResponseSimplePublicObject =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{listingId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{listingId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(listingId: String, params: ListingUpdateParams): SimplePublicObject =
        update(listingId, params, RequestOptions.none())

    /** @see update */
    fun update(
        listingId: String,
        params: ListingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().listingId(listingId).build(), requestOptions)

    /** @see update */
    fun update(params: ListingUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ListingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of listings. Control what is returned via the `properties` query param. */
    fun list(): ListingListPage = list(ListingListParams.none())

    /** @see list */
    fun list(
        params: ListingListParams = ListingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListingListPage

    /** @see list */
    fun list(params: ListingListParams = ListingListParams.none()): ListingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ListingListPage =
        list(ListingListParams.none(), requestOptions)

    /** Move an Object identified by `{listingId}` to the recycling bin. */
    fun delete(listingId: String) = delete(listingId, ListingDeleteParams.none())

    /** @see delete */
    fun delete(
        listingId: String,
        params: ListingDeleteParams = ListingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().listingId(listingId).build(), requestOptions)

    /** @see delete */
    fun delete(listingId: String, params: ListingDeleteParams = ListingDeleteParams.none()) =
        delete(listingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ListingDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ListingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(listingId: String, requestOptions: RequestOptions) =
        delete(listingId, ListingDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{listingId}`. `{listingId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(listingId: String): SimplePublicObjectWithAssociations =
        get(listingId, ListingGetParams.none())

    /** @see get */
    fun get(
        listingId: String,
        params: ListingGetParams = ListingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().listingId(listingId).build(), requestOptions)

    /** @see get */
    fun get(
        listingId: String,
        params: ListingGetParams = ListingGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(listingId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ListingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: ListingGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(listingId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(listingId, ListingGetParams.none(), requestOptions)

    /** Execute a search query to find listings based on specified filters and properties. */
    fun search(params: ListingSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ListingSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            ListingSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [ListingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListingService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-420`, but is otherwise the same
         * as [ListingService.create].
         */
        @MustBeClosed
        fun create(
            params: ListingCreateParams
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ListingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(
                ListingCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/0-420/{listingId}`, but is
         * otherwise the same as [ListingService.update].
         */
        @MustBeClosed
        fun update(
            listingId: String,
            params: ListingUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(listingId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            listingId: String,
            params: ListingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().listingId(listingId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ListingUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ListingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-420`, but is otherwise the same as
         * [ListingService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ListingListPage> = list(ListingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListingListParams = ListingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListingListParams = ListingListParams.none()
        ): HttpResponseFor<ListingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ListingListPage> =
            list(ListingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/0-420/{listingId}`, but is
         * otherwise the same as [ListingService.delete].
         */
        @MustBeClosed
        fun delete(listingId: String): HttpResponse = delete(listingId, ListingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            listingId: String,
            params: ListingDeleteParams = ListingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().listingId(listingId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            listingId: String,
            params: ListingDeleteParams = ListingDeleteParams.none(),
        ): HttpResponse = delete(listingId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ListingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ListingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(listingId: String, requestOptions: RequestOptions): HttpResponse =
            delete(listingId, ListingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-420/{listingId}`, but is otherwise
         * the same as [ListingService.get].
         */
        @MustBeClosed
        fun get(listingId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(listingId, ListingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            listingId: String,
            params: ListingGetParams = ListingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().listingId(listingId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            listingId: String,
            params: ListingGetParams = ListingGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(listingId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ListingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: ListingGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            listingId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(listingId, ListingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-420/search`, but is otherwise the
         * same as [ListingService.search].
         */
        @MustBeClosed
        fun search(
            params: ListingSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ListingSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                ListingSearchParams.builder()
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
