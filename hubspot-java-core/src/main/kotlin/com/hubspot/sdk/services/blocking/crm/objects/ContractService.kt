// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.contracts.ContractGetParams
import com.hubspot.sdk.models.crm.objects.contracts.ContractListPage
import com.hubspot.sdk.models.crm.objects.contracts.ContractListParams
import com.hubspot.sdk.services.blocking.crm.objects.contracts.BatchService
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
    }
}
