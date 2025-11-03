// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelAccountForwardPaging
import com.hubspot_sdk.api.models.conversations.ConversationsPublicChannelAccount
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountListParams
import java.util.function.Consumer

interface ChannelAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelAccountService

    /** Retrieve a list of channel accounts, with optional filters and sorting. */
    fun list(): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(ChannelAccountListParams.none())

    /** @see list */
    fun list(
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging

    /** @see list */
    fun list(
        params: ChannelAccountListParams = ChannelAccountListParams.none()
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(ChannelAccountListParams.none(), requestOptions)

    /** Retrieve details of a single channel account using the channel account ID. */
    fun get(channelAccountId: String): ConversationsPublicChannelAccount =
        get(channelAccountId, ChannelAccountGetParams.none())

    /** @see get */
    fun get(
        channelAccountId: String,
        params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationsPublicChannelAccount =
        get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see get */
    fun get(
        channelAccountId: String,
        params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
    ): ConversationsPublicChannelAccount = get(channelAccountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationsPublicChannelAccount

    /** @see get */
    fun get(params: ChannelAccountGetParams): ConversationsPublicChannelAccount =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        channelAccountId: String,
        requestOptions: RequestOptions,
    ): ConversationsPublicChannelAccount =
        get(channelAccountId, ChannelAccountGetParams.none(), requestOptions)

    /**
     * A view of [ChannelAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/channel-accounts`,
         * but is otherwise the same as [ChannelAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(ChannelAccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelAccountListParams = ChannelAccountListParams.none()
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(ChannelAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/channel-accounts/{channelAccountId}`, but is otherwise
         * the same as [ChannelAccountService.get].
         */
        @MustBeClosed
        fun get(channelAccountId: String): HttpResponseFor<ConversationsPublicChannelAccount> =
            get(channelAccountId, ChannelAccountGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: String,
            params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationsPublicChannelAccount> =
            get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: String,
            params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
        ): HttpResponseFor<ConversationsPublicChannelAccount> =
            get(channelAccountId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationsPublicChannelAccount>

        /** @see get */
        @MustBeClosed
        fun get(
            params: ChannelAccountGetParams
        ): HttpResponseFor<ConversationsPublicChannelAccount> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationsPublicChannelAccount> =
            get(channelAccountId, ChannelAccountGetParams.none(), requestOptions)
    }
}
