// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.owners.OwnerGetParams
import com.hubspot_sdk.api.models.crm.owners.OwnerListPageAsync
import com.hubspot_sdk.api.models.crm.owners.OwnerListParams
import com.hubspot_sdk.api.models.crm.owners.PublicOwner
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OwnerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OwnerServiceAsync

    fun list(): CompletableFuture<OwnerListPageAsync> = list(OwnerListParams.none())

    /** @see list */
    fun list(
        params: OwnerListParams = OwnerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OwnerListPageAsync>

    /** @see list */
    fun list(
        params: OwnerListParams = OwnerListParams.none()
    ): CompletableFuture<OwnerListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OwnerListPageAsync> =
        list(OwnerListParams.none(), requestOptions)

    /** Retrieve details of a specific owner using either their 'id' or 'userId'. */
    fun get(ownerId: Int): CompletableFuture<PublicOwner> = get(ownerId, OwnerGetParams.none())

    /** @see get */
    fun get(
        ownerId: Int,
        params: OwnerGetParams = OwnerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicOwner> =
        get(params.toBuilder().ownerId(ownerId).build(), requestOptions)

    /** @see get */
    fun get(
        ownerId: Int,
        params: OwnerGetParams = OwnerGetParams.none(),
    ): CompletableFuture<PublicOwner> = get(ownerId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OwnerGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicOwner>

    /** @see get */
    fun get(params: OwnerGetParams): CompletableFuture<PublicOwner> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(ownerId: Int, requestOptions: RequestOptions): CompletableFuture<PublicOwner> =
        get(ownerId, OwnerGetParams.none(), requestOptions)

    /** A view of [OwnerServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OwnerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/owners/2026-03`, but is otherwise the same as
         * [OwnerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OwnerListPageAsync>> =
            list(OwnerListParams.none())

        /** @see list */
        fun list(
            params: OwnerListParams = OwnerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OwnerListPageAsync>>

        /** @see list */
        fun list(
            params: OwnerListParams = OwnerListParams.none()
        ): CompletableFuture<HttpResponseFor<OwnerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OwnerListPageAsync>> =
            list(OwnerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/owners/2026-03/{ownerId}`, but is otherwise the
         * same as [OwnerServiceAsync.get].
         */
        fun get(ownerId: Int): CompletableFuture<HttpResponseFor<PublicOwner>> =
            get(ownerId, OwnerGetParams.none())

        /** @see get */
        fun get(
            ownerId: Int,
            params: OwnerGetParams = OwnerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicOwner>> =
            get(params.toBuilder().ownerId(ownerId).build(), requestOptions)

        /** @see get */
        fun get(
            ownerId: Int,
            params: OwnerGetParams = OwnerGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicOwner>> =
            get(ownerId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OwnerGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicOwner>>

        /** @see get */
        fun get(params: OwnerGetParams): CompletableFuture<HttpResponseFor<PublicOwner>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            ownerId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicOwner>> =
            get(ownerId, OwnerGetParams.none(), requestOptions)
    }
}
