// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientListPageAsync
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientListParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientSearchParams
import com.hubspot_sdk.api.models.crm.objects.partnerclients.PartnerClientUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.partnerclients.AssociationServiceAsync
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

    fun associations(): AssociationServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Perform a partial update of an Object identified by `{objectId}`. `{objectId}` refers to the
     * internal object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Provided property values will be overwritten. Read-only and
     * non-existent properties will be ignored. Properties values can be cleared by passing an empty
     * string.
     */
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

    /** Read a page of objects. Control what is returned via the `properties` query param. */
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
     * Read an Object identified by `{objectId}`. `{objectId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
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

        fun associations(): AssociationServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/objects/partner_clients/{partnerClientId}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /crm/v3/objects/partner_clients`, but is otherwise
         * the same as [PartnerClientServiceAsync.list].
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
         * Returns a raw HTTP response for `get /crm/v3/objects/partner_clients/{partnerClientId}`,
         * but is otherwise the same as [PartnerClientServiceAsync.get].
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
         * Returns a raw HTTP response for `post /crm/v3/objects/partner_clients/search`, but is
         * otherwise the same as [PartnerClientServiceAsync.search].
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
