// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelCreateResponse
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetResponse
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListResponse
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateResponse
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
    fun create(params: CustomChannelCreateParams): CompletableFuture<CustomChannelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomChannelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChannelCreateResponse>

    /**
     * Update the capabilities for an existing. You can also use it to update the channel's
     * webhookUri and its channelAccountConnectionRedirectUrl.
     */
    fun update(
        channelId: String,
        params: CustomChannelUpdateParams,
    ): CompletableFuture<CustomChannelUpdateResponse> =
        update(channelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelId: String,
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChannelUpdateResponse> =
        update(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see update */
    fun update(params: CustomChannelUpdateParams): CompletableFuture<CustomChannelUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChannelUpdateResponse>

    /** Retrieve all custom channels associated with the app. */
    fun list(): CompletableFuture<CustomChannelListResponse> = list(CustomChannelListParams.none())

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChannelListResponse>

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none()
    ): CompletableFuture<CustomChannelListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomChannelListResponse> =
        list(CustomChannelListParams.none(), requestOptions)

    /** Archive an existing registered custom channel */
    fun delete(channelId: String): CompletableFuture<Void?> =
        delete(channelId, CustomChannelDeleteParams.none())

    /** @see delete */
    fun delete(
        channelId: String,
        params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see delete */
    fun delete(
        channelId: String,
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
    fun delete(channelId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

    /**
     * Retrieve the details about a custom channel. This API allows you to see a custom channel's
     * current capabilties and other configuration metadata
     */
    fun get(channelId: String): CompletableFuture<CustomChannelGetResponse> =
        get(channelId, CustomChannelGetParams.none())

    /** @see get */
    fun get(
        channelId: String,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChannelGetResponse> =
        get(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see get */
    fun get(
        channelId: String,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
    ): CompletableFuture<CustomChannelGetResponse> = get(channelId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChannelGetResponse>

    /** @see get */
    fun get(params: CustomChannelGetParams): CompletableFuture<CustomChannelGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        channelId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomChannelGetResponse> =
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
        ): CompletableFuture<HttpResponseFor<CustomChannelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomChannelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /conversations/v3/custom-channels/{channelId}`,
         * but is otherwise the same as [CustomChannelServiceAsync.update].
         */
        fun update(
            channelId: String,
            params: CustomChannelUpdateParams,
        ): CompletableFuture<HttpResponseFor<CustomChannelUpdateResponse>> =
            update(channelId, params, RequestOptions.none())

        /** @see update */
        fun update(
            channelId: String,
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelUpdateResponse>> =
            update(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CustomChannelUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomChannelUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /conversations/v3/custom-channels/`, but is
         * otherwise the same as [CustomChannelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomChannelListResponse>> =
            list(CustomChannelListParams.none())

        /** @see list */
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelListResponse>>

        /** @see list */
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomChannelListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomChannelListResponse>> =
            list(CustomChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /conversations/v3/custom-channels/{channelId}`,
         * but is otherwise the same as [CustomChannelServiceAsync.delete].
         */
        fun delete(channelId: String): CompletableFuture<HttpResponse> =
            delete(channelId, CustomChannelDeleteParams.none())

        /** @see delete */
        fun delete(
            channelId: String,
            params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see delete */
        fun delete(
            channelId: String,
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
            channelId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conversations/v3/custom-channels/{channelId}`, but
         * is otherwise the same as [CustomChannelServiceAsync.get].
         */
        fun get(channelId: String): CompletableFuture<HttpResponseFor<CustomChannelGetResponse>> =
            get(channelId, CustomChannelGetParams.none())

        /** @see get */
        fun get(
            channelId: String,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelGetResponse>> =
            get(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see get */
        fun get(
            channelId: String,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelGetResponse>> =
            get(channelId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChannelGetResponse>>

        /** @see get */
        fun get(
            params: CustomChannelGetParams
        ): CompletableFuture<HttpResponseFor<CustomChannelGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            channelId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomChannelGetResponse>> =
            get(channelId, CustomChannelGetParams.none(), requestOptions)
    }
}
