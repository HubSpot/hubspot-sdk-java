// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations.customchannels

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountStagingToken
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens.ChannelAccountStagingTokenUpdateParams
import java.util.function.Consumer

interface ChannelAccountStagingTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelAccountStagingTokenService

    /**
     * Update a channel account staging token's account name and delivery identifier. This
     * information will be applied to the channel account created from this staging token. This is
     * used for public apps.
     */
    fun update(
        accountToken: String,
        params: ChannelAccountStagingTokenUpdateParams,
    ): PublicChannelAccountStagingToken = update(accountToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        accountToken: String,
        params: ChannelAccountStagingTokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccountStagingToken =
        update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelAccountStagingTokenUpdateParams): PublicChannelAccountStagingToken =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelAccountStagingTokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccountStagingToken

    /**
     * A view of [ChannelAccountStagingTokenService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelAccountStagingTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/v3/custom-channels/{channelId}/channel-account-staging-tokens/{accountToken}`,
         * but is otherwise the same as [ChannelAccountStagingTokenService.update].
         */
        @MustBeClosed
        fun update(
            accountToken: String,
            params: ChannelAccountStagingTokenUpdateParams,
        ): HttpResponseFor<PublicChannelAccountStagingToken> =
            update(accountToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            accountToken: String,
            params: ChannelAccountStagingTokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccountStagingToken> =
            update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChannelAccountStagingTokenUpdateParams
        ): HttpResponseFor<PublicChannelAccountStagingToken> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChannelAccountStagingTokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccountStagingToken>
    }
}
