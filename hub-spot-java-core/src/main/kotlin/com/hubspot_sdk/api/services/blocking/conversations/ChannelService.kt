// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicChannel
import com.hubspot_sdk.api.models.conversations.channels.ChannelGetParams
import com.hubspot_sdk.api.models.conversations.channels.ChannelListParams
import java.util.function.Consumer

interface ChannelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService

    /** Retrieve a list of channels, with optional filters and sorting. */
    fun list(): CollectionResponseWithTotalPublicChannelForwardPaging =
        list(ChannelListParams.none())

    /** @see list */
    fun list(
        params: ChannelListParams = ChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicChannelForwardPaging

    /** @see list */
    fun list(
        params: ChannelListParams = ChannelListParams.none()
    ): CollectionResponseWithTotalPublicChannelForwardPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CollectionResponseWithTotalPublicChannelForwardPaging =
        list(ChannelListParams.none(), requestOptions)

    /** Retrieve details of a single channel using the channel ID. */
    fun get(channelId: String): PublicChannel = get(channelId, ChannelGetParams.none())

    /** @see get */
    fun get(
        channelId: String,
        params: ChannelGetParams = ChannelGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannel = get(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see get */
    fun get(channelId: String, params: ChannelGetParams = ChannelGetParams.none()): PublicChannel =
        get(channelId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannel

    /** @see get */
    fun get(params: ChannelGetParams): PublicChannel = get(params, RequestOptions.none())

    /** @see get */
    fun get(channelId: String, requestOptions: RequestOptions): PublicChannel =
        get(channelId, ChannelGetParams.none(), requestOptions)

    /** A view of [ChannelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/channels`, but is
         * otherwise the same as [ChannelService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionResponseWithTotalPublicChannelForwardPaging> =
            list(ChannelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelListParams = ChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelListParams = ChannelListParams.none()
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelForwardPaging> =
            list(ChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/channels/{channelId}`, but is otherwise the same as
         * [ChannelService.get].
         */
        @MustBeClosed
        fun get(channelId: String): HttpResponseFor<PublicChannel> =
            get(channelId, ChannelGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            params: ChannelGetParams = ChannelGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannel> =
            get(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            params: ChannelGetParams = ChannelGetParams.none(),
        ): HttpResponseFor<PublicChannel> = get(channelId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannel>

        /** @see get */
        @MustBeClosed
        fun get(params: ChannelGetParams): HttpResponseFor<PublicChannel> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(channelId: String, requestOptions: RequestOptions): HttpResponseFor<PublicChannel> =
            get(channelId, ChannelGetParams.none(), requestOptions)
    }
}
