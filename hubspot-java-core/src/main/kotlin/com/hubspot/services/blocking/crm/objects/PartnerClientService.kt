// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.partnerclients.PartnerClientGetParams
import com.hubspot.models.crm.objects.partnerclients.PartnerClientListAssociationsPage
import com.hubspot.models.crm.objects.partnerclients.PartnerClientListAssociationsParams
import com.hubspot.models.crm.objects.partnerclients.PartnerClientListPage
import com.hubspot.models.crm.objects.partnerclients.PartnerClientListParams
import com.hubspot.models.crm.objects.partnerclients.PartnerClientSearchParams
import com.hubspot.models.crm.objects.partnerclients.PartnerClientUpdateParams
import com.hubspot.services.blocking.crm.objects.partnerclients.BatchService
import java.util.function.Consumer

interface PartnerClientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerClientService

    fun batch(): BatchService

    /** Update the specified properties of an existing partner client. */
    fun update(partnerClientId: String, params: PartnerClientUpdateParams): SimplePublicObject =
        update(partnerClientId, params, RequestOptions.none())

    /** @see update */
    fun update(
        partnerClientId: String,
        params: PartnerClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

    /** @see update */
    fun update(params: PartnerClientUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartnerClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve a list of partner clients with optional filtering by deleted status, associations,
     * and specific properties. The response can be paginated using the 'after' parameter.
     */
    fun list(): PartnerClientListPage = list(PartnerClientListParams.none())

    /** @see list */
    fun list(
        params: PartnerClientListParams = PartnerClientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerClientListPage

    /** @see list */
    fun list(
        params: PartnerClientListParams = PartnerClientListParams.none()
    ): PartnerClientListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PartnerClientListPage =
        list(PartnerClientListParams.none(), requestOptions)

    /**
     * Retrieve detailed information about a specific partner client, including selected properties
     * and associations. This endpoint is useful for accessing comprehensive client data for
     * analysis or integration purposes.
     */
    fun get(partnerClientId: String): SimplePublicObjectWithAssociations =
        get(partnerClientId, PartnerClientGetParams.none())

    /** @see get */
    fun get(
        partnerClientId: String,
        params: PartnerClientGetParams = PartnerClientGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

    /** @see get */
    fun get(
        partnerClientId: String,
        params: PartnerClientGetParams = PartnerClientGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(partnerClientId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PartnerClientGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: PartnerClientGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        partnerClientId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(partnerClientId, PartnerClientGetParams.none(), requestOptions)

    /**
     * Retrieve a list of associations for a specific partner client based on the specified object
     * type.
     */
    fun listAssociations(
        toObjectType: String,
        params: PartnerClientListAssociationsParams,
    ): PartnerClientListAssociationsPage =
        listAssociations(toObjectType, params, RequestOptions.none())

    /** @see listAssociations */
    fun listAssociations(
        toObjectType: String,
        params: PartnerClientListAssociationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerClientListAssociationsPage =
        listAssociations(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see listAssociations */
    fun listAssociations(
        params: PartnerClientListAssociationsParams
    ): PartnerClientListAssociationsPage = listAssociations(params, RequestOptions.none())

    /** @see listAssociations */
    fun listAssociations(
        params: PartnerClientListAssociationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerClientListAssociationsPage

    /**
     * Execute a search for partner clients based on defined filters, properties, and sorting
     * options. This endpoint allows you to retrieve partner client data that matches the search
     * criteria, facilitating integration and data synchronization with third-party systems.
     */
    fun search(params: PartnerClientSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PartnerClientSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            PartnerClientSearchParams.builder()
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
     * A view of [PartnerClientService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerClientService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /crm/objects/2026-03/partner_clients/{partnerClientId}`, but is otherwise the same as
         * [PartnerClientService.update].
         */
        @MustBeClosed
        fun update(
            partnerClientId: String,
            params: PartnerClientUpdateParams,
        ): HttpResponseFor<SimplePublicObject> =
            update(partnerClientId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            partnerClientId: String,
            params: PartnerClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PartnerClientUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PartnerClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/partner_clients`, but is
         * otherwise the same as [PartnerClientService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PartnerClientListPage> = list(PartnerClientListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PartnerClientListParams = PartnerClientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerClientListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PartnerClientListParams = PartnerClientListParams.none()
        ): HttpResponseFor<PartnerClientListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PartnerClientListPage> =
            list(PartnerClientListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/partner_clients/{partnerClientId}`, but is otherwise the same as
         * [PartnerClientService.get].
         */
        @MustBeClosed
        fun get(partnerClientId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(partnerClientId, PartnerClientGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            partnerClientId: String,
            params: PartnerClientGetParams = PartnerClientGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            partnerClientId: String,
            params: PartnerClientGetParams = PartnerClientGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(partnerClientId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PartnerClientGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(
            params: PartnerClientGetParams
        ): HttpResponseFor<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            partnerClientId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(partnerClientId, PartnerClientGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/partner_clients/{partnerClientId}/associations/{toObjectType}`, but
         * is otherwise the same as [PartnerClientService.listAssociations].
         */
        @MustBeClosed
        fun listAssociations(
            toObjectType: String,
            params: PartnerClientListAssociationsParams,
        ): HttpResponseFor<PartnerClientListAssociationsPage> =
            listAssociations(toObjectType, params, RequestOptions.none())

        /** @see listAssociations */
        @MustBeClosed
        fun listAssociations(
            toObjectType: String,
            params: PartnerClientListAssociationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerClientListAssociationsPage> =
            listAssociations(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see listAssociations */
        @MustBeClosed
        fun listAssociations(
            params: PartnerClientListAssociationsParams
        ): HttpResponseFor<PartnerClientListAssociationsPage> =
            listAssociations(params, RequestOptions.none())

        /** @see listAssociations */
        @MustBeClosed
        fun listAssociations(
            params: PartnerClientListAssociationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerClientListAssociationsPage>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/partner_clients/search`, but
         * is otherwise the same as [PartnerClientService.search].
         */
        @MustBeClosed
        fun search(
            params: PartnerClientSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: PartnerClientSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                PartnerClientSearchParams.builder()
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
