// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListPageAsync
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceSearchParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.partnerservices.AssociationServiceAsync
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

    fun associations(): AssociationServiceAsync

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
     * Read a page of partner services. Control what is returned via the `properties` query param.
     */
    fun list(): CompletableFuture<PartnerServiceListPageAsync> =
        list(PartnerServiceListParams.none())

    /** @see list */
    fun list(
        params: PartnerServiceListParams = PartnerServiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerServiceListPageAsync>

    /** @see list */
    fun list(
        params: PartnerServiceListParams = PartnerServiceListParams.none()
    ): CompletableFuture<PartnerServiceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PartnerServiceListPageAsync> =
        list(PartnerServiceListParams.none(), requestOptions)

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

        fun associations(): AssociationServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/objects/partner_services/{partnerServiceId}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /crm/v3/objects/partner_services`, but is otherwise
         * the same as [PartnerServiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>> =
            list(PartnerServiceListParams.none())

        /** @see list */
        fun list(
            params: PartnerServiceListParams = PartnerServiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>>

        /** @see list */
        fun list(
            params: PartnerServiceListParams = PartnerServiceListParams.none()
        ): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PartnerServiceListPageAsync>> =
            list(PartnerServiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/objects/partner_services/{partnerServiceId}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `post /crm/v3/objects/partner_services/search`, but is
         * otherwise the same as [PartnerServiceServiceAsync.search].
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
