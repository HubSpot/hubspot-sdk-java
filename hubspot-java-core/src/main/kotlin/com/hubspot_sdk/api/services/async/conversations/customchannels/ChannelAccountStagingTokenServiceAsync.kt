// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens.ChannelAccountStagingTokenUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens.ChannelAccountStagingTokenUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChannelAccountStagingTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ChannelAccountStagingTokenServiceAsync

    /**
     * Update a channel account staging token's account name and delivery identifier. This
     * information will be applied to the channel account created from this staging token. This is
     * used for public apps.
     */
    fun update(
        accountToken: String,
        params: ChannelAccountStagingTokenUpdateParams,
    ): CompletableFuture<ChannelAccountStagingTokenUpdateResponse> =
        update(accountToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        accountToken: String,
        params: ChannelAccountStagingTokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelAccountStagingTokenUpdateResponse> =
        update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see update */
    fun update(
        params: ChannelAccountStagingTokenUpdateParams
    ): CompletableFuture<ChannelAccountStagingTokenUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelAccountStagingTokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelAccountStagingTokenUpdateResponse>

    /**
     * A view of [ChannelAccountStagingTokenServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelAccountStagingTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/v3/custom-channels/{channelId}/channel-account-staging-tokens/{accountToken}`,
         * but is otherwise the same as [ChannelAccountStagingTokenServiceAsync.update].
         */
        fun update(
            accountToken: String,
            params: ChannelAccountStagingTokenUpdateParams,
        ): CompletableFuture<HttpResponseFor<ChannelAccountStagingTokenUpdateResponse>> =
            update(accountToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            accountToken: String,
            params: ChannelAccountStagingTokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAccountStagingTokenUpdateResponse>> =
            update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChannelAccountStagingTokenUpdateParams
        ): CompletableFuture<HttpResponseFor<ChannelAccountStagingTokenUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChannelAccountStagingTokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAccountStagingTokenUpdateResponse>>
    }
}
