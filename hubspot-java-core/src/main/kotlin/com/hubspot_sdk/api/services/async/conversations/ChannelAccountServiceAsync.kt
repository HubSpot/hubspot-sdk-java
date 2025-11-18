// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.PublicChannelAccount
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountListPageAsync
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChannelAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelAccountServiceAsync

    /** Retrieve a list of channel accounts, with optional filters and sorting. */
    fun list(): CompletableFuture<ChannelAccountListPageAsync> =
        list(ChannelAccountListParams.none())

    /** @see list */
    fun list(
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelAccountListPageAsync>

    /** @see list */
    fun list(
        params: ChannelAccountListParams = ChannelAccountListParams.none()
    ): CompletableFuture<ChannelAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ChannelAccountListPageAsync> =
        list(ChannelAccountListParams.none(), requestOptions)

    /** Retrieve details of a single channel account using the channel account ID. */
    fun get(channelAccountId: Long): CompletableFuture<PublicChannelAccount> =
        get(channelAccountId, ChannelAccountGetParams.none())

    /** @see get */
    fun get(
        channelAccountId: Long,
        params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount> =
        get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see get */
    fun get(
        channelAccountId: Long,
        params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
    ): CompletableFuture<PublicChannelAccount> =
        get(channelAccountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount>

    /** @see get */
    fun get(params: ChannelAccountGetParams): CompletableFuture<PublicChannelAccount> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        channelAccountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelAccount> =
        get(channelAccountId, ChannelAccountGetParams.none(), requestOptions)

    /**
     * A view of [ChannelAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): ChannelAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/channel-accounts`,
         * but is otherwise the same as [ChannelAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(ChannelAccountListParams.none())

        /** @see list */
        fun list(
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>>

        /** @see list */
        fun list(
            params: ChannelAccountListParams = ChannelAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(ChannelAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/channel-accounts/{channelAccountId}`, but is otherwise
         * the same as [ChannelAccountServiceAsync.get].
         */
        fun get(channelAccountId: Long): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(channelAccountId, ChannelAccountGetParams.none())

        /** @see get */
        fun get(
            channelAccountId: Long,
            params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see get */
        fun get(
            channelAccountId: Long,
            params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(channelAccountId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>>

        /** @see get */
        fun get(
            params: ChannelAccountGetParams
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            channelAccountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(channelAccountId, ChannelAccountGetParams.none(), requestOptions)
    }
}
