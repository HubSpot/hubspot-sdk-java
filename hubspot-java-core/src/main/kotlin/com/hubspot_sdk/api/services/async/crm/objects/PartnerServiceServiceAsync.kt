// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListPageAsync
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceSearchParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.partnerservices.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PartnerServiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerServiceServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Perform a partial update of an Object identified by `{partnerServiceId}`or optionally a
     * unique property value as specified by the `idProperty` query param. `{partnerServiceId}`
     * refers to the internal object ID by default, and the `idProperty` query param refers to a
     * property whose values are unique for the object. Provided property values will be
     * overwritten. Read-only and non-existent properties will result in an error. Properties values
     * can be cleared by passing an empty string.
     */
    fun update(
        partnerServiceId: String,
        params: PartnerServiceUpdateParams,
    ): CompletableFuture<SimplePublicObject> =
        update(partnerServiceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        partnerServiceId: String,
        params: PartnerServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

    /** @see update */
    fun update(params: PartnerServiceUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartnerServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Retrieve a list of associations for a specific partner service, filtered by the type of
     * associated object.
     */
    fun list(
        toObjectType: String,
        params: PartnerServiceListParams,
    ): CompletableFuture<PartnerServiceListPageAsync> =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: PartnerServiceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerServiceListPageAsync> =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: PartnerServiceListParams): CompletableFuture<PartnerServiceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PartnerServiceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerServiceListPageAsync>

    /**
     * Read an Object identified by `{partnerServiceId}`. `{partnerServiceId}` refers to the
     * internal object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(partnerServiceId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(partnerServiceId, PartnerServiceGetParams.none())

    /** @see get */
    fun get(
        partnerServiceId: String,
        params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

    /** @see get */
    fun get(
        partnerServiceId: String,
        params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(partnerServiceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PartnerServiceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(
        params: PartnerServiceGetParams
    ): CompletableFuture<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        partnerServiceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(partnerServiceId, PartnerServiceGetParams.none(), requestOptions)

    /**
     * Execute a search query to find partner services based on defined filters, properties, and
     * sorting options. This endpoint allows you to retrieve a collection of partner services that
     * match the specified search criteria.
     */
    fun search(
        params: PartnerServiceSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PartnerServiceSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            PartnerServiceSearchParams.builder()
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
     * A view of [PartnerServiceServiceAsync] that provides access to raw HTTP responses for each
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
        ): PartnerServiceServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /crm/objects/2026-03/partner_services/{partnerServiceId}`, but is otherwise the same as
         * [PartnerServiceServiceAsync.update].
         */
        fun update(
            partnerServiceId: String,
            params: PartnerServiceUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(partnerServiceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            partnerServiceId: String,
            params: PartnerServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PartnerServiceUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PartnerServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/partner_services/{partnerServiceId}/associations/{toObjectType}`,
         * but is otherwise the same as [PartnerServiceServiceAsync.list].
         */
        fun list(
            toObjectType: String,
            params: PartnerServiceListParams,
        ): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            toObjectType: String,
            params: PartnerServiceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        fun list(
            params: PartnerServiceListParams
        ): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PartnerServiceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/partner_services/{partnerServiceId}`, but is otherwise the same as
         * [PartnerServiceServiceAsync.get].
         */
        fun get(
            partnerServiceId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(partnerServiceId, PartnerServiceGetParams.none())

        /** @see get */
        fun get(
            partnerServiceId: String,
            params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

        /** @see get */
        fun get(
            partnerServiceId: String,
            params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(partnerServiceId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PartnerServiceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: PartnerServiceGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            partnerServiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(partnerServiceId, PartnerServiceGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/partner_services/search`, but
         * is otherwise the same as [PartnerServiceServiceAsync.search].
         */
        fun search(
            params: PartnerServiceSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: PartnerServiceSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                PartnerServiceSearchParams.builder()
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
