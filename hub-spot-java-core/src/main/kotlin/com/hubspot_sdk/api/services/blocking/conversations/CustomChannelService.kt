// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannel
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannelCreate
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
    fun create(params: CustomChannelCreateParams): PublicChannelIntegrationChannel =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomChannelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelIntegrationChannel

    /** @see create */
    fun create(
        publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelIntegrationChannel =
        create(
            CustomChannelCreateParams.builder()
                .publicChannelIntegrationChannelCreate(publicChannelIntegrationChannelCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate
    ): PublicChannelIntegrationChannel =
        create(publicChannelIntegrationChannelCreate, RequestOptions.none())

    /**
     * Update the capabilities for an existing. You can also use it to update the channel's
     * webhookUri and its channelAccountConnectionRedirectUrl.
     */
    fun update(
        channelId: String,
        params: CustomChannelUpdateParams,
    ): PublicChannelIntegrationChannel = update(channelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelId: String,
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelIntegrationChannel =
        update(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see update */
    fun update(params: CustomChannelUpdateParams): PublicChannelIntegrationChannel =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelIntegrationChannel

    /** Retrieve all custom channels associated with the app. */
    fun list(): CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
        list(CustomChannelListParams.none())

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none()
    ): CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
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
    fun get(channelId: String): PublicChannelIntegrationChannel =
        get(channelId, CustomChannelGetParams.none())

    /** @see get */
    fun get(
        channelId: String,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelIntegrationChannel =
        get(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see get */
    fun get(
        channelId: String,
        params: CustomChannelGetParams = CustomChannelGetParams.none(),
    ): PublicChannelIntegrationChannel = get(channelId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelIntegrationChannel

    /** @see get */
    fun get(params: CustomChannelGetParams): PublicChannelIntegrationChannel =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(channelId: String, requestOptions: RequestOptions): PublicChannelIntegrationChannel =
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
        ): HttpResponseFor<PublicChannelIntegrationChannel> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomChannelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelIntegrationChannel>

        /** @see create */
        @MustBeClosed
        fun create(
            publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            create(
                CustomChannelCreateParams.builder()
                    .publicChannelIntegrationChannelCreate(publicChannelIntegrationChannelCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            publicChannelIntegrationChannelCreate: PublicChannelIntegrationChannelCreate
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            create(publicChannelIntegrationChannelCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /conversations/v3/custom-channels/{channelId}`,
         * but is otherwise the same as [CustomChannelService.update].
         */
        @MustBeClosed
        fun update(
            channelId: String,
            params: CustomChannelUpdateParams,
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            update(channelId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            channelId: String,
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            update(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomChannelUpdateParams
        ): HttpResponseFor<PublicChannelIntegrationChannel> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelIntegrationChannel>

        /**
         * Returns a raw HTTP response for `get /conversations/v3/custom-channels/`, but is
         * otherwise the same as [CustomChannelService.list].
         */
        @MustBeClosed
        fun list():
            HttpResponseFor<
                CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
            > = list(CustomChannelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none()
        ): HttpResponseFor<
            CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
        > = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<
            CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
        > = list(CustomChannelListParams.none(), requestOptions)

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
        fun get(channelId: String): HttpResponseFor<PublicChannelIntegrationChannel> =
            get(channelId, CustomChannelGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            get(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            params: CustomChannelGetParams = CustomChannelGetParams.none(),
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            get(channelId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelIntegrationChannel>

        /** @see get */
        @MustBeClosed
        fun get(params: CustomChannelGetParams): HttpResponseFor<PublicChannelIntegrationChannel> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            get(channelId, CustomChannelGetParams.none(), requestOptions)
    }
}
