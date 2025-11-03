// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelAccountForwardPaging
import com.hubspot_sdk.api.models.conversations.ConversationsPublicChannelAccount
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountListParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
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

    /**
     * Create a new account for a channel. Multiple accounts can communicate over a single channel
     * using different delivery identifiers.
     */
    fun create(
        channelId: String,
        params: ChannelAccountCreateParams,
    ): CompletableFuture<ConversationsPublicChannelAccount> =
        create(channelId, params, RequestOptions.none())

    /** @see create */
    fun create(
        channelId: String,
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationsPublicChannelAccount> =
        create(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see create */
    fun create(
        params: ChannelAccountCreateParams
    ): CompletableFuture<ConversationsPublicChannelAccount> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationsPublicChannelAccount>

    /**
     * This API is used to update the name of the channel account and it's isAuthorized status.
     * Setting to isAuthorized flag to False disables the channel account.
     */
    fun update(
        channelAccountId: String,
        params: ChannelAccountUpdateParams,
    ): CompletableFuture<ConversationsPublicChannelAccount> =
        update(channelAccountId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelAccountId: String,
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationsPublicChannelAccount> =
        update(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see update */
    fun update(
        params: ChannelAccountUpdateParams
    ): CompletableFuture<ConversationsPublicChannelAccount> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationsPublicChannelAccount>

    /** Retrieve a list of accounts for a custom channel. */
    fun list(
        channelId: String
    ): CompletableFuture<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
        list(channelId, ChannelAccountListParams.none())

    /** @see list */
    fun list(
        channelId: String,
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
        list(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see list */
    fun list(
        channelId: String,
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
        list(channelId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ChannelAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalPublicChannelAccountForwardPaging>

    /** @see list */
    fun list(
        params: ChannelAccountListParams
    ): CompletableFuture<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        channelId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
        list(channelId, ChannelAccountListParams.none(), requestOptions)

    /**
     * Retrieve the details for a specific channel account. This contains all the metadata about
     * your channel account, including its channel, associated inbox id, and delivery identifier
     * information.
     */
    fun get(
        channelAccountId: String,
        params: ChannelAccountGetParams,
    ): CompletableFuture<ConversationsPublicChannelAccount> =
        get(channelAccountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        channelAccountId: String,
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationsPublicChannelAccount> =
        get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see get */
    fun get(params: ChannelAccountGetParams): CompletableFuture<ConversationsPublicChannelAccount> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationsPublicChannelAccount>

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
         * Returns a raw HTTP response for `post
         * /conversations/v3/custom-channels/{channelId}/channel-accounts`, but is otherwise the
         * same as [ChannelAccountServiceAsync.create].
         */
        fun create(
            channelId: String,
            params: ChannelAccountCreateParams,
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            create(channelId, params, RequestOptions.none())

        /** @see create */
        fun create(
            channelId: String,
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            create(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ChannelAccountCreateParams
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>>

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/v3/custom-channels/{channelId}/channel-accounts/{channelAccountId}`, but
         * is otherwise the same as [ChannelAccountServiceAsync.update].
         */
        fun update(
            channelAccountId: String,
            params: ChannelAccountUpdateParams,
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            update(channelAccountId, params, RequestOptions.none())

        /** @see update */
        fun update(
            channelAccountId: String,
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            update(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChannelAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/custom-channels/{channelId}/channel-accounts`, but is otherwise the
         * same as [ChannelAccountServiceAsync.list].
         */
        fun list(
            channelId: String
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>
        > = list(channelId, ChannelAccountListParams.none())

        /** @see list */
        fun list(
            channelId: String,
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>
        > = list(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see list */
        fun list(
            channelId: String,
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>
        > = list(channelId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ChannelAccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>
        >

        /** @see list */
        fun list(
            params: ChannelAccountListParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            channelId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>
        > = list(channelId, ChannelAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/custom-channels/{channelId}/channel-accounts/{channelAccountId}`, but
         * is otherwise the same as [ChannelAccountServiceAsync.get].
         */
        fun get(
            channelAccountId: String,
            params: ChannelAccountGetParams,
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            get(channelAccountId, params, RequestOptions.none())

        /** @see get */
        fun get(
            channelAccountId: String,
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see get */
        fun get(
            params: ChannelAccountGetParams
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationsPublicChannelAccount>>
    }
}
