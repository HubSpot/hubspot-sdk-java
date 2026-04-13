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
import com.hubspot.models.crm.objects.listings.ListingCreateParams
import com.hubspot.models.crm.objects.listings.ListingDeleteParams
import com.hubspot.models.crm.objects.listings.ListingGetParams
import com.hubspot.models.crm.objects.listings.ListingListPageAsync
import com.hubspot.models.crm.objects.listings.ListingListParams
import com.hubspot.models.crm.objects.listings.ListingSearchParams
import com.hubspot.models.crm.objects.listings.ListingUpdateParams
import com.hubspot.services.async.crm.objects.listings.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ListingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListingServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a listing with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard listings is provided.
     */
    fun create(params: ListingCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ListingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            ListingCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{listingId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{listingId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        listingId: String,
        params: ListingUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(listingId, params, RequestOptions.none())

    /** @see update */
    fun update(
        listingId: String,
        params: ListingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().listingId(listingId).build(), requestOptions)

    /** @see update */
    fun update(params: ListingUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ListingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of listings. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<ListingListPageAsync> = list(ListingListParams.none())

    /** @see list */
    fun list(
        params: ListingListParams = ListingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListingListPageAsync>

    /** @see list */
    fun list(
        params: ListingListParams = ListingListParams.none()
    ): CompletableFuture<ListingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ListingListPageAsync> =
        list(ListingListParams.none(), requestOptions)

    /** Move an Object identified by `{listingId}` to the recycling bin. */
    fun delete(listingId: String): CompletableFuture<Void?> =
        delete(listingId, ListingDeleteParams.none())

    /** @see delete */
    fun delete(
        listingId: String,
        params: ListingDeleteParams = ListingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().listingId(listingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        listingId: String,
        params: ListingDeleteParams = ListingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(listingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ListingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ListingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(listingId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(listingId, ListingDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{listingId}`. `{listingId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(listingId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(listingId, ListingGetParams.none())

    /** @see get */
    fun get(
        listingId: String,
        params: ListingGetParams = ListingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().listingId(listingId).build(), requestOptions)

    /** @see get */
    fun get(
        listingId: String,
        params: ListingGetParams = ListingGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(listingId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ListingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: ListingGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        listingId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(listingId, ListingGetParams.none(), requestOptions)

    /** Execute a search query to find listings based on specified filters and properties. */
    fun search(
        params: ListingSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ListingSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            ListingSearchParams.builder()
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
     * A view of [ListingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListingServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-420`, but is otherwise the
         * same as [ListingServiceAsync.create].
         */
        fun create(
            params: ListingCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ListingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                ListingCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/0-420/{listingId}`, but is
         * otherwise the same as [ListingServiceAsync.update].
         */
        fun update(
            listingId: String,
            params: ListingUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(listingId, params, RequestOptions.none())

        /** @see update */
        fun update(
            listingId: String,
            params: ListingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().listingId(listingId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ListingUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ListingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-420`, but is otherwise the
         * same as [ListingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ListingListPageAsync>> =
            list(ListingListParams.none())

        /** @see list */
        fun list(
            params: ListingListParams = ListingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListingListPageAsync>>

        /** @see list */
        fun list(
            params: ListingListParams = ListingListParams.none()
        ): CompletableFuture<HttpResponseFor<ListingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ListingListPageAsync>> =
            list(ListingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/0-420/{listingId}`, but is
         * otherwise the same as [ListingServiceAsync.delete].
         */
        fun delete(listingId: String): CompletableFuture<HttpResponse> =
            delete(listingId, ListingDeleteParams.none())

        /** @see delete */
        fun delete(
            listingId: String,
            params: ListingDeleteParams = ListingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().listingId(listingId).build(), requestOptions)

        /** @see delete */
        fun delete(
            listingId: String,
            params: ListingDeleteParams = ListingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(listingId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ListingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ListingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            listingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(listingId, ListingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-420/{listingId}`, but is
         * otherwise the same as [ListingServiceAsync.get].
         */
        fun get(
            listingId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(listingId, ListingGetParams.none())

        /** @see get */
        fun get(
            listingId: String,
            params: ListingGetParams = ListingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().listingId(listingId).build(), requestOptions)

        /** @see get */
        fun get(
            listingId: String,
            params: ListingGetParams = ListingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(listingId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ListingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: ListingGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            listingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(listingId, ListingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-420/search`, but is
         * otherwise the same as [ListingServiceAsync.search].
         */
        fun search(
            params: ListingSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ListingSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                ListingSearchParams.builder()
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
