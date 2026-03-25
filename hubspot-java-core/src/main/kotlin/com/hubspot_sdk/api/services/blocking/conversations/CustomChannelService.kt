// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelDeleteParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListPage
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelListParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccount
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannel
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannelCreate
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountService
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

    fun channelAccounts(): ChannelAccountService

    fun messages(): MessageService

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

    fun update(channelId: Int, params: CustomChannelUpdateParams): PublicChannelIntegrationChannel =
        update(channelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelId: Int,
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

    fun list(): CustomChannelListPage = list(CustomChannelListParams.none())

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChannelListPage

    /** @see list */
    fun list(
        params: CustomChannelListParams = CustomChannelListParams.none()
    ): CustomChannelListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomChannelListPage =
        list(CustomChannelListParams.none(), requestOptions)

    fun delete(channelId: Int) = delete(channelId, CustomChannelDeleteParams.none())

    /** @see delete */
    fun delete(
        channelId: Int,
        params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see delete */
    fun delete(
        channelId: Int,
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
    fun delete(channelId: Int, requestOptions: RequestOptions) =
        delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

    fun get(channelAccountId: Long, params: CustomChannelGetParams): PublicChannelAccount =
        get(channelAccountId, params, RequestOptions.none())

    /** @see get */
    fun get(
        channelAccountId: Long,
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount =
        get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

    /** @see get */
    fun get(params: CustomChannelGetParams): PublicChannelAccount =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CustomChannelGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicChannelAccount

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

        fun channelAccounts(): ChannelAccountService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conversations/custom-channels/2026-03`, but is
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
         * Returns a raw HTTP response for `patch
         * /conversations/custom-channels/2026-03/{channelId}`, but is otherwise the same as
         * [CustomChannelService.update].
         */
        @MustBeClosed
        fun update(
            channelId: Int,
            params: CustomChannelUpdateParams,
        ): HttpResponseFor<PublicChannelIntegrationChannel> =
            update(channelId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            channelId: Int,
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
         * Returns a raw HTTP response for `get /conversations/custom-channels/2026-03`, but is
         * otherwise the same as [CustomChannelService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomChannelListPage> = list(CustomChannelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChannelListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomChannelListParams = CustomChannelListParams.none()
        ): HttpResponseFor<CustomChannelListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomChannelListPage> =
            list(CustomChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /conversations/custom-channels/2026-03/{channelId}`, but is otherwise the same as
         * [CustomChannelService.delete].
         */
        @MustBeClosed
        fun delete(channelId: Int): HttpResponse =
            delete(channelId, CustomChannelDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            channelId: Int,
            params: CustomChannelDeleteParams = CustomChannelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            channelId: Int,
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
        fun delete(channelId: Int, requestOptions: RequestOptions): HttpResponse =
            delete(channelId, CustomChannelDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/custom-channels/2026-03/{channelId}/channel-accounts/{channelAccountId}`,
         * but is otherwise the same as [CustomChannelService.get].
         */
        @MustBeClosed
        fun get(
            channelAccountId: Long,
            params: CustomChannelGetParams,
        ): HttpResponseFor<PublicChannelAccount> =
            get(channelAccountId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            channelAccountId: Long,
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount> =
            get(params.toBuilder().channelAccountId(channelAccountId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: CustomChannelGetParams): HttpResponseFor<PublicChannelAccount> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CustomChannelGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicChannelAccount>
    }
}
