// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountService
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountStagingTokenService
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.MessageService
import java.util.function.Consumer

interface CustomChannelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomChannelService

    fun channelAccountStagingTokens(): ChannelAccountStagingTokenService

    fun channelAccounts(): ChannelAccountService

    fun messages(): MessageService

    /**
     * Register a new channel along with its capabilities and the webhook url that will be used to
     * receive messages published over the channel
     */
    fun create(params: CustomChannelCreateParams): CustomChannelCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomChannelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChannelCreateResponse

    /**
     * Update the capabilities for an existing. You can also use it to update the channel's
     * webhookUri and its channelAccountConnectionRedirectUrl.
     */
    fun update(channelId: String, params: CustomChannelUpdateParams): CustomChannelUpdateResponse =
        update(channelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelId: String,
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChannelUpdateResponse =
        update(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see update */
    fun update(params: CustomChannelUpdateParams): CustomChannelUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChannelUpdateResponse

    /** Retrieve all custom channels associated with the app. */
    fun list(): CustomChannelListResponse = list(CustomChannelListParams.none())

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChannelListResponse

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none()
    ): CustomChannelListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomChannelListResponse =
        list(CustomChannelListParams.none(), requestOptions)

    /** Archive an existing registered custom channel */
    fun delete(channelId: String) = delete(channelId, CustomChannelDeleteParams.none())

    /** @see delete */
    fun delete(
        channelId: String,
        params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see delete */
    fun delete(
        channelId: String,
        params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
    ) = delete(channelId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomChannelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: CustomChannelDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(channelId: String, requestOptions: RequestOptions) =
        delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

    /**
     * Retrieve the details about a custom channel. This API allows you to see a custom channel's
     * current capabilties and other configuration metadata
     */
    fun get(channelId: String): CustomChannelGetResponse =
        get(channelId, CustomChannelGetParams.none())

    /** @see get */
    fun get(
        channelId: String,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChannelGetResponse =
        get(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see get */
    fun get(
        channelId: String,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
    ): CustomChannelGetResponse = get(channelId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChannelGetResponse

    /** @see get */
    fun get(params: CustomChannelGetParams): CustomChannelGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(channelId: String, requestOptions: RequestOptions): CustomChannelGetResponse =
        get(channelId, CustomChannelGetParams.none(), requestOptions)

    /**
     * A view of [CustomChannelService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomChannelService.WithRawResponse

        fun channelAccountStagingTokens(): ChannelAccountStagingTokenService.WithRawResponse

        fun channelAccounts(): ChannelAccountService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conversations/v3/custom-channels/`, but is
         * otherwise the same as [CustomChannelService.create].
         */
        @MustBeClosed
        fun create(
            params: CustomChannelCreateParams
        ): HttpResponseFor<CustomChannelCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomChannelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChannelCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /conversations/v3/custom-channels/{channelId}`,
         * but is otherwise the same as [CustomChannelService.update].
         */
        @MustBeClosed
        fun update(
            channelId: String,
            params: CustomChannelUpdateParams,
        ): HttpResponseFor<CustomChannelUpdateResponse> =
            update(channelId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            channelId: String,
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChannelUpdateResponse> =
            update(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomChannelUpdateParams
        ): HttpResponseFor<CustomChannelUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChannelUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /conversations/v3/custom-channels/`, but is
         * otherwise the same as [CustomChannelService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomChannelListResponse> =
            list(CustomChannelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChannelListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none()
        ): HttpResponseFor<CustomChannelListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomChannelListResponse> =
            list(CustomChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /conversations/v3/custom-channels/{channelId}`,
         * but is otherwise the same as [CustomChannelService.delete].
         */
        @MustBeClosed
        fun delete(channelId: String): HttpResponse =
            delete(channelId, CustomChannelDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            channelId: String,
            params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            channelId: String,
            params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
        ): HttpResponse = delete(channelId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomChannelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CustomChannelDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(channelId: String, requestOptions: RequestOptions): HttpResponse =
            delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conversations/v3/custom-channels/{channelId}`, but
         * is otherwise the same as [CustomChannelService.get].
         */
        @MustBeClosed
        fun get(channelId: String): HttpResponseFor<CustomChannelGetResponse> =
            get(channelId, CustomChannelGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChannelGetResponse> =
            get(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
        ): HttpResponseFor<CustomChannelGetResponse> = get(channelId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChannelGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: CustomChannelGetParams): HttpResponseFor<CustomChannelGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomChannelGetResponse> =
            get(channelId, CustomChannelGetParams.none(), requestOptions)
    }
}
