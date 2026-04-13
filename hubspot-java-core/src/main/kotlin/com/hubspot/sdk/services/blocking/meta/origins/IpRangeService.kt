// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.meta.origins

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.meta.origins.CollectionResponseIpRangeNoPaging
import com.hubspot.sdk.models.meta.origins.ipranges.IpRangeListParams
import com.hubspot.sdk.models.meta.origins.ipranges.IpRangeListSimpleParams
import java.util.function.Consumer

interface IpRangeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpRangeService

    /**
     * Retrieve a collection of IP ranges associated with specific services and directions, such as
     * `EMAIL`, `API`, `DNS`, or `WEB_SCRAPING`. The response includes details like CIDR notation,
     * description, and the direction of IP traffic.
     */
    fun list(): CollectionResponseIpRangeNoPaging = list(IpRangeListParams.none())

    /** @see list */
    fun list(
        params: IpRangeListParams = IpRangeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseIpRangeNoPaging

    /** @see list */
    fun list(
        params: IpRangeListParams = IpRangeListParams.none()
    ): CollectionResponseIpRangeNoPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionResponseIpRangeNoPaging =
        list(IpRangeListParams.none(), requestOptions)

    /**
     * Retrieve a simplified list of IP ranges for specified services and directions in plain text
     * format. This endpoint provides a straightforward representation of IP ranges without
     * additional metadata.
     */
    fun listSimple(): String = listSimple(IpRangeListSimpleParams.none())

    /** @see listSimple */
    fun listSimple(
        params: IpRangeListSimpleParams = IpRangeListSimpleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see listSimple */
    fun listSimple(params: IpRangeListSimpleParams = IpRangeListSimpleParams.none()): String =
        listSimple(params, RequestOptions.none())

    /** @see listSimple */
    fun listSimple(requestOptions: RequestOptions): String =
        listSimple(IpRangeListSimpleParams.none(), requestOptions)

    /** A view of [IpRangeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpRangeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /meta/network-origins/2026-03/ip-ranges`, but is
         * otherwise the same as [IpRangeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionResponseIpRangeNoPaging> =
            list(IpRangeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IpRangeListParams = IpRangeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseIpRangeNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IpRangeListParams = IpRangeListParams.none()
        ): HttpResponseFor<CollectionResponseIpRangeNoPaging> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseIpRangeNoPaging> =
            list(IpRangeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meta/network-origins/2026-03/ip-ranges/simple`, but
         * is otherwise the same as [IpRangeService.listSimple].
         */
        @MustBeClosed
        fun listSimple(): HttpResponseFor<String> = listSimple(IpRangeListSimpleParams.none())

        /** @see listSimple */
        @MustBeClosed
        fun listSimple(
            params: IpRangeListSimpleParams = IpRangeListSimpleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see listSimple */
        @MustBeClosed
        fun listSimple(
            params: IpRangeListSimpleParams = IpRangeListSimpleParams.none()
        ): HttpResponseFor<String> = listSimple(params, RequestOptions.none())

        /** @see listSimple */
        @MustBeClosed
        fun listSimple(requestOptions: RequestOptions): HttpResponseFor<String> =
            listSimple(IpRangeListSimpleParams.none(), requestOptions)
    }
}
