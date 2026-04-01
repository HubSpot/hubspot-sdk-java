// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientListAssociationsPageAsync
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientListAssociationsParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientListPageAsync
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientListParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientSearchParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.partnerclients.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PartnerClientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerClientServiceAsync

    fun batch(): BatchServiceAsync

    /** Update the specified properties of an existing partner client. */
    fun update(
        partnerClientId: String,
        params: PartnerClientUpdateParams,
    ): CompletableFuture<SimplePublicObject> =
        update(partnerClientId, params, RequestOptions.none())

    /** @see update */
    fun update(
        partnerClientId: String,
        params: PartnerClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

    /** @see update */
    fun update(params: PartnerClientUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartnerClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Retrieve a list of partner clients with optional filtering by deleted status, associations,
     * and specific properties. The response can be paginated using the 'after' parameter.
     */
    fun list(): CompletableFuture<PartnerClientListPageAsync> = list(PartnerClientListParams.none())

    /** @see list */
    fun list(
        params: PartnerClientListParams = PartnerClientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerClientListPageAsync>

    /** @see list */
    fun list(
        params: PartnerClientListParams = PartnerClientListParams.none()
    ): CompletableFuture<PartnerClientListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PartnerClientListPageAsync> =
        list(PartnerClientListParams.none(), requestOptions)

    /**
     * Retrieve detailed information about a specific partner client, including selected properties
     * and associations. This endpoint is useful for accessing comprehensive client data for
     * analysis or integration purposes.
     */
    fun get(partnerClientId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(partnerClientId, PartnerClientGetParams.none())

    /** @see get */
    fun get(
        partnerClientId: String,
        params: PartnerClientGetParams = PartnerClientGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

    /** @see get */
    fun get(
        partnerClientId: String,
        params: PartnerClientGetParams = PartnerClientGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(partnerClientId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PartnerClientGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: PartnerClientGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        partnerClientId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(partnerClientId, PartnerClientGetParams.none(), requestOptions)

    /**
     * Retrieve a list of associations for a specific partner client based on the specified object
     * type.
     */
    fun listAssociations(
        toObjectType: String,
        params: PartnerClientListAssociationsParams,
    ): CompletableFuture<PartnerClientListAssociationsPageAsync> =
        listAssociations(toObjectType, params, RequestOptions.none())

    /** @see listAssociations */
    fun listAssociations(
        toObjectType: String,
        params: PartnerClientListAssociationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerClientListAssociationsPageAsync> =
        listAssociations(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see listAssociations */
    fun listAssociations(
        params: PartnerClientListAssociationsParams
    ): CompletableFuture<PartnerClientListAssociationsPageAsync> =
        listAssociations(params, RequestOptions.none())

    /** @see listAssociations */
    fun listAssociations(
        params: PartnerClientListAssociationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerClientListAssociationsPageAsync>

    /**
     * Execute a search for partner clients based on defined filters, properties, and sorting
     * options. This endpoint allows you to retrieve partner client data that matches the search
     * criteria, facilitating integration and data synchronization with third-party systems.
     */
    fun search(
        params: PartnerClientSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PartnerClientSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            PartnerClientSearchParams.builder()
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
     * A view of [PartnerClientServiceAsync] that provides access to raw HTTP responses for each
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
        ): PartnerClientServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /crm/objects/2026-03/partner_clients/{partnerClientId}`, but is otherwise the same as
         * [PartnerClientServiceAsync.update].
         */
        fun update(
            partnerClientId: String,
            params: PartnerClientUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(partnerClientId, params, RequestOptions.none())

        /** @see update */
        fun update(
            partnerClientId: String,
            params: PartnerClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PartnerClientUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PartnerClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/partner_clients`, but is
         * otherwise the same as [PartnerClientServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PartnerClientListPageAsync>> =
            list(PartnerClientListParams.none())

        /** @see list */
        fun list(
            params: PartnerClientListParams = PartnerClientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerClientListPageAsync>>

        /** @see list */
        fun list(
            params: PartnerClientListParams = PartnerClientListParams.none()
        ): CompletableFuture<HttpResponseFor<PartnerClientListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PartnerClientListPageAsync>> =
            list(PartnerClientListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/partner_clients/{partnerClientId}`, but is otherwise the same as
         * [PartnerClientServiceAsync.get].
         */
        fun get(
            partnerClientId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(partnerClientId, PartnerClientGetParams.none())

        /** @see get */
        fun get(
            partnerClientId: String,
            params: PartnerClientGetParams = PartnerClientGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().partnerClientId(partnerClientId).build(), requestOptions)

        /** @see get */
        fun get(
            partnerClientId: String,
            params: PartnerClientGetParams = PartnerClientGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(partnerClientId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PartnerClientGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: PartnerClientGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            partnerClientId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(partnerClientId, PartnerClientGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/partner_clients/{partnerClientId}/associations/{toObjectType}`, but
         * is otherwise the same as [PartnerClientServiceAsync.listAssociations].
         */
        fun listAssociations(
            toObjectType: String,
            params: PartnerClientListAssociationsParams,
        ): CompletableFuture<HttpResponseFor<PartnerClientListAssociationsPageAsync>> =
            listAssociations(toObjectType, params, RequestOptions.none())

        /** @see listAssociations */
        fun listAssociations(
            toObjectType: String,
            params: PartnerClientListAssociationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerClientListAssociationsPageAsync>> =
            listAssociations(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see listAssociations */
        fun listAssociations(
            params: PartnerClientListAssociationsParams
        ): CompletableFuture<HttpResponseFor<PartnerClientListAssociationsPageAsync>> =
            listAssociations(params, RequestOptions.none())

        /** @see listAssociations */
        fun listAssociations(
            params: PartnerClientListAssociationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerClientListAssociationsPageAsync>>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/partner_clients/search`, but
         * is otherwise the same as [PartnerClientServiceAsync.search].
         */
        fun search(
            params: PartnerClientSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: PartnerClientSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                PartnerClientSearchParams.builder()
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
