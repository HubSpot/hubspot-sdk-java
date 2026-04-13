// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.conversations.customchannels

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.conversations.customchannels.PublicConversationsMessage
import com.hubspot.models.conversations.customchannels.messages.MessageCreateParams
import com.hubspot.models.conversations.customchannels.messages.MessageGetParams
import com.hubspot.models.conversations.customchannels.messages.MessageUpdateParams
import java.util.function.Consumer

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /** Publish a message over your custom channel */
    fun create(channelId: Int, params: MessageCreateParams): PublicConversationsMessage =
        create(channelId, params, RequestOptions.none())

    /** @see create */
    fun create(
        channelId: Int,
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicConversationsMessage =
        create(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see create */
    fun create(params: MessageCreateParams): PublicConversationsMessage =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicConversationsMessage

    /**
     * Update a message's status to indicate if it was successfully sent, failed to send, or was
     * read. For failed messages, this can also include the error message for the failure.
     */
    fun update(messageId: String, params: MessageUpdateParams): PublicConversationsMessage =
        update(messageId, params, RequestOptions.none())

    /** @see update */
    fun update(
        messageId: String,
        params: MessageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicConversationsMessage =
        update(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see update */
    fun update(params: MessageUpdateParams): PublicConversationsMessage =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicConversationsMessage

    /** Get the details for a specific message sent over a custom channel */
    fun get(messageId: String, params: MessageGetParams): PublicConversationsMessage =
        get(messageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        messageId: String,
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicConversationsMessage =
        get(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see get */
    fun get(params: MessageGetParams): PublicConversationsMessage =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicConversationsMessage

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /conversations/custom-channels/2026-03/{channelId}/messages`, but is otherwise the same
         * as [MessageService.create].
         */
        @MustBeClosed
        fun create(
            channelId: Int,
            params: MessageCreateParams,
        ): HttpResponseFor<PublicConversationsMessage> =
            create(channelId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            channelId: Int,
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicConversationsMessage> =
            create(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: MessageCreateParams): HttpResponseFor<PublicConversationsMessage> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicConversationsMessage>

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/custom-channels/2026-03/{channelId}/messages/{messageId}`, but is
         * otherwise the same as [MessageService.update].
         */
        @MustBeClosed
        fun update(
            messageId: String,
            params: MessageUpdateParams,
        ): HttpResponseFor<PublicConversationsMessage> =
            update(messageId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            messageId: String,
            params: MessageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicConversationsMessage> =
            update(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: MessageUpdateParams): HttpResponseFor<PublicConversationsMessage> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicConversationsMessage>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/custom-channels/2026-03/{channelId}/messages/{messageId}`, but is
         * otherwise the same as [MessageService.get].
         */
        @MustBeClosed
        fun get(
            messageId: String,
            params: MessageGetParams,
        ): HttpResponseFor<PublicConversationsMessage> =
            get(messageId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            messageId: String,
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicConversationsMessage> =
            get(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: MessageGetParams): HttpResponseFor<PublicConversationsMessage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicConversationsMessage>
    }
}
