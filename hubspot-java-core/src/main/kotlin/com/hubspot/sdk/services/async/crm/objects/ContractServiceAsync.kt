// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.contracts.ContractGetParams
import com.hubspot.sdk.models.crm.objects.contracts.ContractListPageAsync
import com.hubspot.sdk.models.crm.objects.contracts.ContractListParams
import com.hubspot.sdk.services.async.crm.objects.contracts.BatchServiceAsync
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
    }
}
