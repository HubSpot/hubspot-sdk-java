// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.conversations

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot.models.conversations.customchannels.CustomChannelListPageAsync
import com.hubspot.models.conversations.customchannels.CustomChannelListParams
import com.hubspot.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot.models.conversations.customchannels.PublicChannelAccount
import com.hubspot.models.conversations.customchannels.PublicChannelIntegrationChannel
import com.hubspot.models.conversations.customchannels.PublicChannelIntegrationChannelCreate
import com.hubspot.services.async.conversations.customchannels.ChannelAccountServiceAsync
import com.hubspot.services.async.conversations.customchannels.MessageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomChannelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomChannelServiceAsync

    fun channelAccounts(): ChannelAccountServiceAsync

    fun messages(): MessageServiceAsync

    fun create(
        params: CustomChannelCreateParams
    ): CompletableFuture<PublicChannelIntegrationChannel> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomChannelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelIntegrationChannel>

    /** @see create */
    fun create(
        publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        create(
            CustomChannelCreateParams.builder()
                .publicChannelIntegrationChannelCreate(publicChannelIntegrationChannelCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        create(publicChannelIntegrationChannelCreate, RequestOptions.none())

    /**
     * Update the capabilities for an existing. You can also use it to update the channel's
     * webhookUri and its channelAccountConnectionRedirectUrl.
     */
    fun update(
        channelId: Int,
        params: CustomChannelUpdateParams,
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        update(channelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelId: Int,
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        update(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see update */
    fun update(
        params: CustomChannelUpdateParams
    ): CompletableFuture<PublicChannelIntegrationChannel> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelIntegrationChannel>

    fun list(): CompletableFuture<CustomChannelListPageAsync> = list(CustomChannelListParams.none())

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChannelListPageAsync>

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none()
    ): CompletableFuture<CustomChannelListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomChannelListPageAsync> =
        list(CustomChannelListParams.none(), requestOptions)

    /** Archive an existing registered custom channel */
    fun delete(channelId: Int): CompletableFuture<Void?> =
        delete(channelId, CustomChannelDeleteParams.none())

    /** @see delete */
    fun delete(
        channelId: Int,
        params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see delete */
    fun delete(
        channelId: Int,
        params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(channelId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomChannelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CustomChannelDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(channelId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

    /**
     * Retrieve the details for a specific channel account. This contains all the metadata about
     * your channel account, including its channel, associated inbox id, and delivery identifier
     * information.
     */
    fun get(
        channelAccountId: Long,
        params: CustomChannelGetParams,
    ): CompletableFuture<PublicChannelAccount> =
        get(channelAccountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        channelAccountId: Long,
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount> =
        get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see get */
    fun get(params: CustomChannelGetParams): CompletableFuture<PublicChannelAccount> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelAccount>

    /**
     * A view of [CustomChannelServiceAsync] that provides access to raw HTTP responses for each
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
        ): CustomChannelServiceAsync.WithRawResponse

        fun channelAccounts(): ChannelAccountServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conversations/custom-channels/2026-03`, but is
         * otherwise the same as [CustomChannelServiceAsync.create].
         */
        fun create(
            params: CustomChannelCreateParams
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomChannelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>>

        /** @see create */
        fun create(
            publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            create(
                CustomChannelCreateParams.builder()
                    .publicChannelIntegrationChannelCreate(publicChannelIntegrationChannelCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            create(publicChannelIntegrationChannelCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/custom-channels/2026-03/{channelId}`, but is otherwise the same as
         * [CustomChannelServiceAsync.update].
         */
        fun update(
            channelId: Int,
            params: CustomChannelUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            update(channelId, params, RequestOptions.none())

        /** @see update */
        fun update(
            channelId: Int,
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            update(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CustomChannelUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>>

        /**
         * Returns a raw HTTP response for `get /conversations/custom-channels/2026-03`, but is
         * otherwise the same as [CustomChannelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomChannelListPageAsync>> =
            list(CustomChannelListParams.none())

        /** @see list */
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelListPageAsync>>

        /** @see list */
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomChannelListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomChannelListPageAsync>> =
            list(CustomChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /conversations/custom-channels/2026-03/{channelId}`, but is otherwise the same as
         * [CustomChannelServiceAsync.delete].
         */
        fun delete(channelId: Int): CompletableFuture<HttpResponse> =
            delete(channelId, CustomChannelDeleteParams.none())

        /** @see delete */
        fun delete(
            channelId: Int,
            params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see delete */
        fun delete(
            channelId: Int,
            params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(channelId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CustomChannelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CustomChannelDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            channelId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/custom-channels/2026-03/{channelId}/channel-accounts/{channelAccountId}`,
         * but is otherwise the same as [CustomChannelServiceAsync.get].
         */
        fun get(
            channelAccountId: Long,
            params: CustomChannelGetParams,
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(channelAccountId, params, RequestOptions.none())

        /** @see get */
        fun get(
            channelAccountId: Long,
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see get */
        fun get(
            params: CustomChannelGetParams
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelAccount>>
    }
}
