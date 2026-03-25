// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

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
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractListPageAsync
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractListParams
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractSearchParams
import com.hubspot_sdk.api.models.crm.objects.contracts.ContractUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.contracts.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a contract with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard contracts is provided.
     */
    fun create(params: ContractCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            ContractCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{contractId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{contractId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        contractId: String,
        params: ContractUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(contractId, params, RequestOptions.none())

    /** @see update */
    fun update(
        contractId: String,
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().contractId(contractId).build(), requestOptions)

    /** @see update */
    fun update(params: ContractUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of contracts. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<ContractListPageAsync> = list(ContractListParams.none())

    /** @see list */
    fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractListPageAsync>

    /** @see list */
    fun list(
        params: ContractListParams = ContractListParams.none()
    ): CompletableFuture<ContractListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ContractListPageAsync> =
        list(ContractListParams.none(), requestOptions)

    /** Move an Object identified by `{contractId}` to the recycling bin. */
    fun delete(contractId: String): CompletableFuture<Void?> =
        delete(contractId, ContractDeleteParams.none())

    /** @see delete */
    fun delete(
        contractId: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().contractId(contractId).build(), requestOptions)

    /** @see delete */
    fun delete(
        contractId: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(contractId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ContractDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contractId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(contractId, ContractDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{contractId}`. `{contractId}` refers to the internal object ID
     * by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(contractId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(contractId, ContractGetParams.none())

    /** @see get */
    fun get(
        contractId: String,
        params: ContractGetParams = ContractGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().contractId(contractId).build(), requestOptions)

    /** @see get */
    fun get(
        contractId: String,
        params: ContractGetParams = ContractGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(contractId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ContractGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: ContractGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        contractId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(contractId, ContractGetParams.none(), requestOptions)

    /**
     * Execute a search query to find contracts based on defined filters, properties, and sorting
     * options. This allows for retrieving specific contract records that match the search criteria.
     */
    fun search(
        params: ContractSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ContractSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            ContractSearchParams.builder()
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
     * A view of [ContractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contracts`, but is otherwise
         * the same as [ContractServiceAsync.create].
         */
        fun create(
            params: ContractCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                ContractCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/contracts/{contractId}`, but
         * is otherwise the same as [ContractServiceAsync.update].
         */
        fun update(
            contractId: String,
            params: ContractUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(contractId, params, RequestOptions.none())

        /** @see update */
        fun update(
            contractId: String,
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().contractId(contractId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ContractUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/contracts`, but is otherwise
         * the same as [ContractServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(ContractListParams.none())

        /** @see list */
        fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>>

        /** @see list */
        fun list(
            params: ContractListParams = ContractListParams.none()
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(ContractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/contracts/{contractId}`, but
         * is otherwise the same as [ContractServiceAsync.delete].
         */
        fun delete(contractId: String): CompletableFuture<HttpResponse> =
            delete(contractId, ContractDeleteParams.none())

        /** @see delete */
        fun delete(
            contractId: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().contractId(contractId).build(), requestOptions)

        /** @see delete */
        fun delete(
            contractId: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(contractId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ContractDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            contractId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(contractId, ContractDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/contracts/{contractId}`, but is
         * otherwise the same as [ContractServiceAsync.get].
         */
        fun get(
            contractId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(contractId, ContractGetParams.none())

        /** @see get */
        fun get(
            contractId: String,
            params: ContractGetParams = ContractGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().contractId(contractId).build(), requestOptions)

        /** @see get */
        fun get(
            contractId: String,
            params: ContractGetParams = ContractGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(contractId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ContractGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: ContractGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            contractId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(contractId, ContractGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contracts/search`, but is
         * otherwise the same as [ContractServiceAsync.search].
         */
        fun search(
            params: ContractSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ContractSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                ContractSearchParams.builder()
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
