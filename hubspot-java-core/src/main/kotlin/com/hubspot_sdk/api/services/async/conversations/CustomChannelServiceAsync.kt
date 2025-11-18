// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListPageAsync
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannel
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannelCreate
import com.hubspot_sdk.api.services.async.conversations.customchannels.ChannelAccountServiceAsync
import com.hubspot_sdk.api.services.async.conversations.customchannels.ChannelAccountStagingTokenServiceAsync
import com.hubspot_sdk.api.services.async.conversations.customchannels.MessageServiceAsync
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

    fun channelAccountStagingTokens(): ChannelAccountStagingTokenServiceAsync

    fun channelAccounts(): ChannelAccountServiceAsync

    fun messages(): MessageServiceAsync

    /**
     * Register a new channel along with its capabilities and the webhook url that will be used to
     * receive messages published over the channel
     */
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

    /** Retrieve all custom channels associated with the app. */
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
     * Retrieve the details about a custom channel. This API allows you to see a custom channel's
     * current capabilties and other configuration metadata
     */
    fun get(channelId: Int): CompletableFuture<PublicChannelIntegrationChannel> =
        get(channelId, CustomChannelGetParams.none())

    /** @see get */
    fun get(
        channelId: Int,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        get(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see get */
    fun get(
        channelId: Int,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        get(channelId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicChannelIntegrationChannel>

    /** @see get */
    fun get(params: CustomChannelGetParams): CompletableFuture<PublicChannelIntegrationChannel> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        channelId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicChannelIntegrationChannel> =
        get(channelId, CustomChannelGetParams.none(), requestOptions)

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

        fun channelAccountStagingTokens(): ChannelAccountStagingTokenServiceAsync.WithRawResponse

        fun channelAccounts(): ChannelAccountServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conversations/v3/custom-channels/`, but is
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
         * Returns a raw HTTP response for `patch /conversations/v3/custom-channels/{channelId}`,
         * but is otherwise the same as [CustomChannelServiceAsync.update].
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
         * Returns a raw HTTP response for `get /conversations/v3/custom-channels/`, but is
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
         * Returns a raw HTTP response for `delete /conversations/v3/custom-channels/{channelId}`,
         * but is otherwise the same as [CustomChannelServiceAsync.delete].
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
         * Returns a raw HTTP response for `get /conversations/v3/custom-channels/{channelId}`, but
         * is otherwise the same as [CustomChannelServiceAsync.get].
         */
        fun get(
            channelId: Int
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            get(channelId, CustomChannelGetParams.none())

        /** @see get */
        fun get(
            channelId: Int,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            get(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see get */
        fun get(
            channelId: Int,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            get(channelId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>>

        /** @see get */
        fun get(
            params: CustomChannelGetParams
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            channelId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicChannelIntegrationChannel>> =
            get(channelId, CustomChannelGetParams.none(), requestOptions)
    }
}
