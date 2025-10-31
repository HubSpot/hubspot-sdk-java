// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicMergeInput
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketCreateParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketDeleteParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketGetParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketListPageAsync
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketListParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketMergeParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketSearchParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.tickets.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TicketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TicketServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a ticket with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard tickets is provided.
     */
    fun create(params: TicketCreateParams): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TicketCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            TicketCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{ticketId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{ticketId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        ticketId: String,
        params: TicketUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(ticketId, params, RequestOptions.none())

    /** @see update */
    fun update(
        ticketId: String,
        params: TicketUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see update */
    fun update(params: TicketUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TicketUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of tickets. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<TicketListPageAsync> = list(TicketListParams.none())

    /** @see list */
    fun list(
        params: TicketListParams = TicketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TicketListPageAsync>

    /** @see list */
    fun list(
        params: TicketListParams = TicketListParams.none()
    ): CompletableFuture<TicketListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TicketListPageAsync> =
        list(TicketListParams.none(), requestOptions)

    /** Move an Object identified by `{ticketId}` to the recycling bin. */
    fun delete(ticketId: String): CompletableFuture<Void?> =
        delete(ticketId, TicketDeleteParams.none())

    /** @see delete */
    fun delete(
        ticketId: String,
        params: TicketDeleteParams = TicketDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ticketId: String,
        params: TicketDeleteParams = TicketDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(ticketId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TicketDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TicketDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(ticketId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(ticketId, TicketDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{ticketId}`. `{ticketId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(ticketId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(ticketId, TicketGetParams.none())

    /** @see get */
    fun get(
        ticketId: String,
        params: TicketGetParams = TicketGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see get */
    fun get(
        ticketId: String,
        params: TicketGetParams = TicketGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(ticketId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TicketGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: TicketGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        ticketId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(ticketId, TicketGetParams.none(), requestOptions)

    /** Merge two tickets, combining them into one ticket record. */
    fun merge(params: TicketMergeParams): CompletableFuture<SimplePublicObject> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: TicketMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        merge(
            TicketMergeParams.builder().publicMergeInput(publicMergeInput).build(),
            requestOptions,
        )

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): CompletableFuture<SimplePublicObject> =
        merge(publicMergeInput, RequestOptions.none())

    /**
     * Search for tickets by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(
        params: TicketSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: TicketSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            TicketSearchParams.builder()
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
     * A view of [TicketServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TicketServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets`, but is otherwise the same
         * as [TicketServiceAsync.create].
         */
        fun create(
            params: TicketCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TicketCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                TicketCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/v3/objects/tickets/{ticketId}`, but is
         * otherwise the same as [TicketServiceAsync.update].
         */
        fun update(
            ticketId: String,
            params: TicketUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(ticketId, params, RequestOptions.none())

        /** @see update */
        fun update(
            ticketId: String,
            params: TicketUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see update */
        fun update(
            params: TicketUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TicketUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/tickets`, but is otherwise the same
         * as [TicketServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TicketListPageAsync>> =
            list(TicketListParams.none())

        /** @see list */
        fun list(
            params: TicketListParams = TicketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TicketListPageAsync>>

        /** @see list */
        fun list(
            params: TicketListParams = TicketListParams.none()
        ): CompletableFuture<HttpResponseFor<TicketListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TicketListPageAsync>> =
            list(TicketListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/tickets/{ticketId}`, but is
         * otherwise the same as [TicketServiceAsync.delete].
         */
        fun delete(ticketId: String): CompletableFuture<HttpResponse> =
            delete(ticketId, TicketDeleteParams.none())

        /** @see delete */
        fun delete(
            ticketId: String,
            params: TicketDeleteParams = TicketDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see delete */
        fun delete(
            ticketId: String,
            params: TicketDeleteParams = TicketDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(ticketId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TicketDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TicketDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            ticketId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(ticketId, TicketDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/tickets/{ticketId}`, but is
         * otherwise the same as [TicketServiceAsync.get].
         */
        fun get(
            ticketId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(ticketId, TicketGetParams.none())

        /** @see get */
        fun get(
            ticketId: String,
            params: TicketGetParams = TicketGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see get */
        fun get(
            ticketId: String,
            params: TicketGetParams = TicketGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(ticketId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TicketGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: TicketGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            ticketId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(ticketId, TicketGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets/merge`, but is otherwise
         * the same as [TicketServiceAsync.merge].
         */
        fun merge(
            params: TicketMergeParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: TicketMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(
                TicketMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/tickets/search`, but is otherwise
         * the same as [TicketServiceAsync.search].
         */
        fun search(
            params: TicketSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: TicketSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                TicketSearchParams.builder()
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
