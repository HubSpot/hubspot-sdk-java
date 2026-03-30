// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccount
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountStagingToken
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountListPageAsync
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountListParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateStagingTokenParams
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
        channelId: Int,
        params: ChannelAccountCreateParams,
    ): CompletableFuture<PublicChannelAccount> = create(channelId, params, RequestOptions.none())

    /** @see create */
    fun create(
        channelId: Int,
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount> =
        create(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see create */
    fun create(params: ChannelAccountCreateParams): CompletableFuture<PublicChannelAccount> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount>

    /**
     * This API is used to update the name of the channel account and it's isAuthorized status.
     * Setting to isAuthorized flag to False disables the channel account.
     */
    fun update(
        channelAccountId: Long,
        params: ChannelAccountUpdateParams,
    ): CompletableFuture<PublicChannelAccount> =
        update(channelAccountId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelAccountId: Long,
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount> =
        update(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelAccountUpdateParams): CompletableFuture<PublicChannelAccount> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount>

    /** Retrieve a list of accounts for a custom channel. */
    fun list(channelId: Int): CompletableFuture<ChannelAccountListPageAsync> =
        list(channelId, ChannelAccountListParams.none())

    /** @see list */
    fun list(
        channelId: Int,
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelAccountListPageAsync> =
        list(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see list */
    fun list(
        channelId: Int,
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
    ): CompletableFuture<ChannelAccountListPageAsync> =
        list(channelId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ChannelAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelAccountListPageAsync>

    /** @see list */
    fun list(params: ChannelAccountListParams): CompletableFuture<ChannelAccountListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        channelId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelAccountListPageAsync> =
        list(channelId, ChannelAccountListParams.none(), requestOptions)

    /**
     * Update a channel account staging token's account name and delivery identifier. This
     * information will be applied to the channel account created from this staging token. This is
     * used for public apps.
     */
    fun updateStagingToken(
        accountToken: String,
        params: ChannelAccountUpdateStagingTokenParams,
    ): CompletableFuture<PublicChannelAccountStagingToken> =
        updateStagingToken(accountToken, params, RequestOptions.none())

    /** @see updateStagingToken */
    fun updateStagingToken(
        accountToken: String,
        params: ChannelAccountUpdateStagingTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccountStagingToken> =
        updateStagingToken(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see updateStagingToken */
    fun updateStagingToken(
        params: ChannelAccountUpdateStagingTokenParams
    ): CompletableFuture<PublicChannelAccountStagingToken> =
        updateStagingToken(params, RequestOptions.none())

    /** @see updateStagingToken */
    fun updateStagingToken(
        params: ChannelAccountUpdateStagingTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccountStagingToken>

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
         * /conversations/custom-channels/2026-03/{channelId}/channel-accounts`, but is otherwise
         * the same as [ChannelAccountServiceAsync.create].
         */
        fun create(
            channelId: Int,
            params: ChannelAccountCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            create(channelId, params, RequestOptions.none())

        /** @see create */
        fun create(
            channelId: Int,
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            create(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ChannelAccountCreateParams
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>>

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/custom-channels/2026-03/{channelId}/channel-accounts/{channelAccountId}`,
         * but is otherwise the same as [ChannelAccountServiceAsync.update].
         */
        fun update(
            channelAccountId: Long,
            params: ChannelAccountUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            update(channelAccountId, params, RequestOptions.none())

        /** @see update */
        fun update(
            channelAccountId: Long,
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            update(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChannelAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/custom-channels/2026-03/{channelId}/channel-accounts`, but is otherwise
         * the same as [ChannelAccountServiceAsync.list].
         */
        fun list(channelId: Int): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(channelId, ChannelAccountListParams.none())

        /** @see list */
        fun list(
            channelId: Int,
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see list */
        fun list(
            channelId: Int,
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(channelId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ChannelAccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>>

        /** @see list */
        fun list(
            params: ChannelAccountListParams
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            channelId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelAccountListPageAsync>> =
            list(channelId, ChannelAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/custom-channels/2026-03/{channelId}/channel-account-staging-tokens/{accountToken}`,
         * but is otherwise the same as [ChannelAccountServiceAsync.updateStagingToken].
         */
        fun updateStagingToken(
            accountToken: String,
            params: ChannelAccountUpdateStagingTokenParams,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccountStagingToken>> =
            updateStagingToken(accountToken, params, RequestOptions.none())

        /** @see updateStagingToken */
        fun updateStagingToken(
            accountToken: String,
            params: ChannelAccountUpdateStagingTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccountStagingToken>> =
            updateStagingToken(
                params.toBuilder().accountToken(accountToken).build(),
                requestOptions,
            )

        /** @see updateStagingToken */
        fun updateStagingToken(
            params: ChannelAccountUpdateStagingTokenParams
        ): CompletableFuture<HttpResponseFor<PublicChannelAccountStagingToken>> =
            updateStagingToken(params, RequestOptions.none())

        /** @see updateStagingToken */
        fun updateStagingToken(
            params: ChannelAccountUpdateStagingTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccountStagingToken>>
    }
}
