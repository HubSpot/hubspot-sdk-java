// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations.customchannels

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelAccountForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicChannelAccount
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountListParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
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

    /**
     * Create a new account for a channel. Multiple accounts can communicate over a single channel
     * using different delivery identifiers.
     */
    fun create(channelId: String, params: ChannelAccountCreateParams): PublicChannelAccount =
        create(channelId, params, RequestOptions.none())

    /** @see create */
    fun create(
        channelId: String,
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount =
        create(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see create */
    fun create(params: ChannelAccountCreateParams): PublicChannelAccount =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChannelAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount

    /**
     * This API is used to update the name of the channel account and it's isAuthorized status.
     * Setting to isAuthorized flag to False disables the channel account.
     */
    fun update(channelAccountId: String, params: ChannelAccountUpdateParams): PublicChannelAccount =
        update(channelAccountId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelAccountId: String,
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount =
        update(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelAccountUpdateParams): PublicChannelAccount =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount

    /** Retrieve a list of accounts for a custom channel. */
    fun list(channelId: String): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(channelId, ChannelAccountListParams.none())

    /** @see list */
    fun list(
        channelId: String,
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see list */
    fun list(
        channelId: String,
        params: ChannelAccountListParams = ChannelAccountListParams.none(),
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(channelId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ChannelAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging

    /** @see list */
    fun list(
        params: ChannelAccountListParams
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        channelId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicChannelAccountForwardPaging =
        list(channelId, ChannelAccountListParams.none(), requestOptions)

    /**
     * Retrieve the details for a specific channel account. This contains all the metadata about
     * your channel account, including its channel, associated inbox id, and delivery identifier
     * information.
     */
    fun get(channelAccountId: String, params: ChannelAccountGetParams): PublicChannelAccount =
        get(channelAccountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        channelAccountId: String,
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount =
        get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see get */
    fun get(params: ChannelAccountGetParams): PublicChannelAccount =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelAccountGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount

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
         * Returns a raw HTTP response for `post
         * /conversations/v3/custom-channels/{channelId}/channel-accounts`, but is otherwise the
         * same as [ChannelAccountService.create].
         */
        @MustBeClosed
        fun create(
            channelId: String,
            params: ChannelAccountCreateParams,
        ): HttpResponseFor<PublicChannelAccount> = create(channelId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            channelId: String,
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount> =
            create(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ChannelAccountCreateParams): HttpResponseFor<PublicChannelAccount> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChannelAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount>

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/v3/custom-channels/{channelId}/channel-accounts/{channelAccountId}`, but
         * is otherwise the same as [ChannelAccountService.update].
         */
        @MustBeClosed
        fun update(
            channelAccountId: String,
            params: ChannelAccountUpdateParams,
        ): HttpResponseFor<PublicChannelAccount> =
            update(channelAccountId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            channelAccountId: String,
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount> =
            update(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ChannelAccountUpdateParams): HttpResponseFor<PublicChannelAccount> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChannelAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/custom-channels/{channelId}/channel-accounts`, but is otherwise the
         * same as [ChannelAccountService.list].
         */
        @MustBeClosed
        fun list(
            channelId: String
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(channelId, ChannelAccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            channelId: String,
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            channelId: String,
            params: ChannelAccountListParams = ChannelAccountListParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(channelId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelAccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChannelAccountListParams
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            channelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelAccountForwardPaging> =
            list(channelId, ChannelAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/custom-channels/{channelId}/channel-accounts/{channelAccountId}`, but
         * is otherwise the same as [ChannelAccountService.get].
         */
        @MustBeClosed
        fun get(
            channelAccountId: String,
            params: ChannelAccountGetParams,
        ): HttpResponseFor<PublicChannelAccount> =
            get(channelAccountId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: String,
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount> =
            get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: ChannelAccountGetParams): HttpResponseFor<PublicChannelAccount> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ChannelAccountGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount>
    }
}
