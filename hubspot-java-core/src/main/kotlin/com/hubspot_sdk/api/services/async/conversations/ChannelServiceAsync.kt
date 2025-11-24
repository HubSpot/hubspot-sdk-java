// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.PublicChannel
import com.hubspot_sdk.api.models.conversations.channels.ChannelGetParams
import com.hubspot_sdk.api.models.conversations.channels.ChannelListPageAsync
import com.hubspot_sdk.api.models.conversations.channels.ChannelListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChannelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelServiceAsync

    fun list(): CompletableFuture<ChannelListPageAsync> = list(ChannelListParams.none())

    /** @see list */
    fun list(
        params: ChannelListParams = ChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelListPageAsync>

    /** @see list */
    fun list(
        params: ChannelListParams = ChannelListParams.none()
    ): CompletableFuture<ChannelListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ChannelListPageAsync> =
        list(ChannelListParams.none(), requestOptions)

    fun get(channelId: Int): CompletableFuture<PublicChannel> =
        get(channelId, ChannelGetParams.none())

    /** @see get */
    fun get(
        channelId: Int,
        params: ChannelGetParams = ChannelGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannel> =
        get(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see get */
    fun get(
        channelId: Int,
        params: ChannelGetParams = ChannelGetParams.none(),
    ): CompletableFuture<PublicChannel> = get(channelId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannel>

    /** @see get */
    fun get(params: ChannelGetParams): CompletableFuture<PublicChannel> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(channelId: Int, requestOptions: RequestOptions): CompletableFuture<PublicChannel> =
        get(channelId, ChannelGetParams.none(), requestOptions)

    /**
     * A view of [ChannelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/channels`, but is
         * otherwise the same as [ChannelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ChannelListPageAsync>> =
            list(ChannelListParams.none())

        /** @see list */
        fun list(
            params: ChannelListParams = ChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelListPageAsync>>

        /** @see list */
        fun list(
            params: ChannelListParams = ChannelListParams.none()
        ): CompletableFuture<HttpResponseFor<ChannelListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChannelListPageAsync>> =
            list(ChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/channels/{channelId}`, but is otherwise the same as
         * [ChannelServiceAsync.get].
         */
        fun get(channelId: Int): CompletableFuture<HttpResponseFor<PublicChannel>> =
            get(channelId, ChannelGetParams.none())

        /** @see get */
        fun get(
            channelId: Int,
            params: ChannelGetParams = ChannelGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannel>> =
            get(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see get */
        fun get(
            channelId: Int,
            params: ChannelGetParams = ChannelGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannel>> =
            get(channelId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannel>>

        /** @see get */
        fun get(params: ChannelGetParams): CompletableFuture<HttpResponseFor<PublicChannel>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            channelId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannel>> =
            get(channelId, ChannelGetParams.none(), requestOptions)
    }
}
