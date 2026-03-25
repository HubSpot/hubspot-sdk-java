// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.meta.origins

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.meta.origins.CollectionResponseIpRangeNoPaging
import com.hubspot_sdk.api.models.meta.origins.ipranges.IpRangeListParams
import com.hubspot_sdk.api.models.meta.origins.ipranges.IpRangeListSimpleParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IpRangeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpRangeServiceAsync

    /**
     * Retrieve a collection of IP ranges associated with specific services and directions, such as
     * `EMAIL`, `API`, `DNS`, or `WEB_SCRAPING`. The response includes details like CIDR notation,
     * description, and the direction of IP traffic.
     */
    fun list(): CompletableFuture<CollectionResponseIpRangeNoPaging> =
        list(IpRangeListParams.none())

    /** @see list */
    fun list(
        params: IpRangeListParams = IpRangeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseIpRangeNoPaging>

    /** @see list */
    fun list(
        params: IpRangeListParams = IpRangeListParams.none()
    ): CompletableFuture<CollectionResponseIpRangeNoPaging> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CollectionResponseIpRangeNoPaging> =
        list(IpRangeListParams.none(), requestOptions)

    /**
     * Retrieve a simplified list of IP ranges for specified services and directions in plain text
     * format. This endpoint provides a straightforward representation of IP ranges without
     * additional metadata.
     */
    fun listSimple(): CompletableFuture<String> = listSimple(IpRangeListSimpleParams.none())

    /** @see listSimple */
    fun listSimple(
        params: IpRangeListSimpleParams = IpRangeListSimpleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see listSimple */
    fun listSimple(
        params: IpRangeListSimpleParams = IpRangeListSimpleParams.none()
    ): CompletableFuture<String> = listSimple(params, RequestOptions.none())

    /** @see listSimple */
    fun listSimple(requestOptions: RequestOptions): CompletableFuture<String> =
        listSimple(IpRangeListSimpleParams.none(), requestOptions)

    /**
     * A view of [IpRangeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpRangeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /meta/network-origins/2026-03/ip-ranges`, but is
         * otherwise the same as [IpRangeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CollectionResponseIpRangeNoPaging>> =
            list(IpRangeListParams.none())

        /** @see list */
        fun list(
            params: IpRangeListParams = IpRangeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseIpRangeNoPaging>>

        /** @see list */
        fun list(
            params: IpRangeListParams = IpRangeListParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseIpRangeNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseIpRangeNoPaging>> =
            list(IpRangeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meta/network-origins/2026-03/ip-ranges/simple`, but
         * is otherwise the same as [IpRangeServiceAsync.listSimple].
         */
        fun listSimple(): CompletableFuture<HttpResponseFor<String>> =
            listSimple(IpRangeListSimpleParams.none())

        /** @see listSimple */
        fun listSimple(
            params: IpRangeListSimpleParams = IpRangeListSimpleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see listSimple */
        fun listSimple(
            params: IpRangeListSimpleParams = IpRangeListSimpleParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = listSimple(params, RequestOptions.none())

        /** @see listSimple */
        fun listSimple(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            listSimple(IpRangeListSimpleParams.none(), requestOptions)
    }
}
