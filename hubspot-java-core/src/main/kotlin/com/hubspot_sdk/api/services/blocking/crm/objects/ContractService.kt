// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractCreateParams
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractDeleteParams
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractGetParams
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractListPage
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractListParams
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractSearchParams
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.contracts.BatchService
import java.util.function.Consumer

interface ContractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService

    fun batch(): BatchService

    /**
     * Create a contract with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard contracts is provided.
     */
    fun create(params: ContractCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            ContractCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{contractId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{contractId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(contractId: String, params: ContractUpdateParams): SimplePublicObject =
        update(contractId, params, RequestOptions.none())

    /** @see update */
    fun update(
        contractId: String,
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().contractId(contractId).build(), requestOptions)

    /** @see update */
    fun update(params: ContractUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of contracts. Control what is returned via the `properties` query param. */
    fun list(): ContractListPage = list(ContractListParams.none())

    /** @see list */
    fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractListPage

    /** @see list */
    fun list(params: ContractListParams = ContractListParams.none()): ContractListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ContractListPage =
        list(ContractListParams.none(), requestOptions)

    /** Move an Object identified by `{contractId}` to the recycling bin. */
    fun delete(contractId: String) = delete(contractId, ContractDeleteParams.none())

    /** @see delete */
    fun delete(
        contractId: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().contractId(contractId).build(), requestOptions)

    /** @see delete */
    fun delete(contractId: String, params: ContractDeleteParams = ContractDeleteParams.none()) =
        delete(contractId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ContractDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ContractDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contractId: String, requestOptions: RequestOptions) =
        delete(contractId, ContractDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{contractId}`. `{contractId}` refers to the internal object ID
     * by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(contractId: String): SimplePublicObjectWithAssociations =
        get(contractId, ContractGetParams.none())

    /** @see get */
    fun get(
        contractId: String,
        params: ContractGetParams = ContractGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().contractId(contractId).build(), requestOptions)

    /** @see get */
    fun get(
        contractId: String,
        params: ContractGetParams = ContractGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(contractId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ContractGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: ContractGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        contractId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(contractId, ContractGetParams.none(), requestOptions)

    /**
     * Execute a search query to find contracts based on defined filters, properties, and sorting
     * options. This allows for retrieving specific contract records that match the search criteria.
     */
    fun search(params: ContractSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ContractSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            ContractSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [ContractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contracts`, but is otherwise
         * the same as [ContractService.create].
         */
        @MustBeClosed
        fun create(params: ContractCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                ContractCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/contracts/{contractId}`, but
         * is otherwise the same as [ContractService.update].
         */
        @MustBeClosed
        fun update(
            contractId: String,
            params: ContractUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(contractId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            contractId: String,
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().contractId(contractId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ContractUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/contracts`, but is otherwise
         * the same as [ContractService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ContractListPage> = list(ContractListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none()
        ): HttpResponseFor<ContractListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ContractListPage> =
            list(ContractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/contracts/{contractId}`, but
         * is otherwise the same as [ContractService.delete].
         */
        @MustBeClosed
        fun delete(contractId: String): HttpResponse =
            delete(contractId, ContractDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            contractId: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().contractId(contractId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            contractId: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
        ): HttpResponse = delete(contractId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ContractDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(contractId: String, requestOptions: RequestOptions): HttpResponse =
            delete(contractId, ContractDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/contracts/{contractId}`, but is
         * otherwise the same as [ContractService.get].
         */
        @MustBeClosed
        fun get(contractId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(contractId, ContractGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            contractId: String,
            params: ContractGetParams = ContractGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().contractId(contractId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            contractId: String,
            params: ContractGetParams = ContractGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(contractId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ContractGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: ContractGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            contractId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(contractId, ContractGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contracts/search`, but is
         * otherwise the same as [ContractService.search].
         */
        @MustBeClosed
        fun search(
            params: ContractSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ContractSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                ContractSearchParams.builder()
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
