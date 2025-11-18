// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.PublicChannelAccount
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.channelaccounts.ChannelAccountListPage
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
    fun list(): ChannelAccountListPage = list(ChannelAccountListParams.none())

    /** @see list */
    fun list(
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelAccountListPage

    /** @see list */
    fun list(
        params: ChannelAccountListParams = ChannelAccountListParams.none()
    ): ChannelAccountListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ChannelAccountListPage =
        list(ChannelAccountListParams.none(), requestOptions)

    /** Retrieve details of a single channel account using the channel account ID. */
    fun get(channelAccountId: Long): PublicChannelAccount =
        get(channelAccountId, ChannelAccountGetParams.none())

    /** @see get */
    fun get(
        channelAccountId: Long,
        params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount =
        get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see get */
    fun get(
        channelAccountId: Long,
        params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
    ): PublicChannelAccount = get(channelAccountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount

    /** @see get */
    fun get(params: ChannelAccountGetParams): PublicChannelAccount =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(channelAccountId: Long, requestOptions: RequestOptions): PublicChannelAccount =
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
        fun list(): HttpResponseFor<ChannelAccountListPage> = list(ChannelAccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelAccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelAccountListParams = ChannelAccountListParams.none()
        ): HttpResponseFor<ChannelAccountListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ChannelAccountListPage> =
            list(ChannelAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/channel-accounts/{channelAccountId}`, but is otherwise
         * the same as [ChannelAccountService.get].
         */
        @MustBeClosed
        fun get(channelAccountId: Long): HttpResponseFor<PublicChannelAccount> =
            get(channelAccountId, ChannelAccountGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: Long,
            params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount> =
            get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: Long,
            params: ChannelAccountGetParams = ChannelAccountGetParams.none(),
        ): HttpResponseFor<PublicChannelAccount> =
            get(channelAccountId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount>

        /** @see get */
        @MustBeClosed
        fun get(params: ChannelAccountGetParams): HttpResponseFor<PublicChannelAccount> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelAccount> =
            get(channelAccountId, ChannelAccountGetParams.none(), requestOptions)
    }
}
