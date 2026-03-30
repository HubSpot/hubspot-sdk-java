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
import com.hubspot_sdk.api.models.crm.objects.PublicMergeInput
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketCreateParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketDeleteParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketGetParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketListPage
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketListParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketMergeParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketSearchParams
import com.hubspot_sdk.api.models.crm.objects.tickets.TicketUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.tickets.BatchService
import java.util.function.Consumer

interface TicketService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TicketService

    fun batch(): BatchService

    /**
     * Create a ticket with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard tickets is provided.
     */
    fun create(params: TicketCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TicketCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            TicketCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{ticketId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{ticketId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(ticketId: String, params: TicketUpdateParams): SimplePublicObject =
        update(ticketId, params, RequestOptions.none())

    /** @see update */
    fun update(
        ticketId: String,
        params: TicketUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see update */
    fun update(params: TicketUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TicketUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of tickets. Control what is returned via the `properties` query param. */
    fun list(): TicketListPage = list(TicketListParams.none())

    /** @see list */
    fun list(
        params: TicketListParams = TicketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TicketListPage

    /** @see list */
    fun list(params: TicketListParams = TicketListParams.none()): TicketListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TicketListPage =
        list(TicketListParams.none(), requestOptions)

    /** Move an Object identified by `{ticketId}` to the recycling bin. */
    fun delete(ticketId: String) = delete(ticketId, TicketDeleteParams.none())

    /** @see delete */
    fun delete(
        ticketId: String,
        params: TicketDeleteParams = TicketDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see delete */
    fun delete(ticketId: String, params: TicketDeleteParams = TicketDeleteParams.none()) =
        delete(ticketId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TicketDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TicketDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(ticketId: String, requestOptions: RequestOptions) =
        delete(ticketId, TicketDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{ticketId}`. `{ticketId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(ticketId: String): SimplePublicObjectWithAssociations =
        get(ticketId, TicketGetParams.none())

    /** @see get */
    fun get(
        ticketId: String,
        params: TicketGetParams = TicketGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see get */
    fun get(
        ticketId: String,
        params: TicketGetParams = TicketGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(ticketId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TicketGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: TicketGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(ticketId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(ticketId, TicketGetParams.none(), requestOptions)

    /** Merge two tickets, combining them into one ticket record. */
    fun merge(params: TicketMergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: TicketMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        merge(
            TicketMergeParams.builder().publicMergeInput(publicMergeInput).build(),
            requestOptions,
        )

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): SimplePublicObject =
        merge(publicMergeInput, RequestOptions.none())

    /**
     * Search for tickets by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(params: TicketSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: TicketSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            TicketSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [TicketService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TicketService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/tickets`, but is otherwise the
         * same as [TicketService.create].
         */
        @MustBeClosed
        fun create(params: TicketCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TicketCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                TicketCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/tickets/{ticketId}`, but is
         * otherwise the same as [TicketService.update].
         */
        @MustBeClosed
        fun update(
            ticketId: String,
            params: TicketUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(ticketId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ticketId: String,
            params: TicketUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TicketUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TicketUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/tickets`, but is otherwise the
         * same as [TicketService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TicketListPage> = list(TicketListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TicketListParams = TicketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TicketListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TicketListParams = TicketListParams.none()
        ): HttpResponseFor<TicketListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TicketListPage> =
            list(TicketListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/tickets/{ticketId}`, but is
         * otherwise the same as [TicketService.delete].
         */
        @MustBeClosed
        fun delete(ticketId: String): HttpResponse = delete(ticketId, TicketDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ticketId: String,
            params: TicketDeleteParams = TicketDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            ticketId: String,
            params: TicketDeleteParams = TicketDeleteParams.none(),
        ): HttpResponse = delete(ticketId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TicketDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TicketDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(ticketId: String, requestOptions: RequestOptions): HttpResponse =
            delete(ticketId, TicketDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/tickets/{ticketId}`, but is
         * otherwise the same as [TicketService.get].
         */
        @MustBeClosed
        fun get(ticketId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(ticketId, TicketGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            ticketId: String,
            params: TicketGetParams = TicketGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            ticketId: String,
            params: TicketGetParams = TicketGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(ticketId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TicketGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: TicketGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            ticketId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(ticketId, TicketGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/tickets/merge`, but is
         * otherwise the same as [TicketService.merge].
         */
        @MustBeClosed
        fun merge(params: TicketMergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: TicketMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see merge */
        @MustBeClosed
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(
                TicketMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        @MustBeClosed
        fun merge(publicMergeInput: PublicMergeInput): HttpResponseFor<SimplePublicObject> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/tickets/search`, but is
         * otherwise the same as [TicketService.search].
         */
        @MustBeClosed
        fun search(
            params: TicketSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: TicketSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                TicketSearchParams.builder()
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
