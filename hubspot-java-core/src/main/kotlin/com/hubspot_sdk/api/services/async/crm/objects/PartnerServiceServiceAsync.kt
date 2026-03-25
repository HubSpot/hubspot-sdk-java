// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListPageAsync
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceSearchParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceUpdateParams
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

    /**
     * Update multiple partner services using their internal IDs or unique property values. This
     * operation allows for batch processing of updates, ensuring efficient synchronization of
     * service data between HubSpot and other systems.
     */
    fun update(
        params: PartnerServiceUpdateParams
    ): CompletableFuture<BatchResponseSimplePublicObject> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartnerServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(
            PartnerServiceUpdateParams.builder()
                .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

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
     * Retrieve records by record ID or include the `idProperty` parameter to retrieve records by a
     * custom unique value property.
     */
    fun get(params: PartnerServiceGetParams): CompletableFuture<BatchResponseSimplePublicObject> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PartnerServiceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject>

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(
            PartnerServiceGetParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        get(batchReadInputSimplePublicObjectId, RequestOptions.none())

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

        /**
         * Returns a raw HTTP response for `post
         * /crm/objects/2026-03/partner_services/batch/update`, but is otherwise the same as
         * [PartnerServiceServiceAsync.update].
         */
        fun update(
            params: PartnerServiceUpdateParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PartnerServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see update */
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(
                PartnerServiceUpdateParams.builder()
                    .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                    .build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /crm/objects/2026-03/partner_services/batch/read`,
         * but is otherwise the same as [PartnerServiceServiceAsync.get].
         */
        fun get(
            params: PartnerServiceGetParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PartnerServiceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>>

        /** @see get */
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(
                PartnerServiceGetParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see get */
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> =
            get(batchReadInputSimplePublicObjectId, RequestOptions.none())

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
