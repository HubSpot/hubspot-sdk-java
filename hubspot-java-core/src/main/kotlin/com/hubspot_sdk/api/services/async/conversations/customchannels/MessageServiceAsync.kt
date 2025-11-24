// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.customchannels.PublicConversationsMessage
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.messages.MessageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    /** Publish a message over your custom channel */
    fun create(
        channelId: Int,
        params: MessageCreateParams,
    ): CompletableFuture<PublicConversationsMessage> =
        create(channelId, params, RequestOptions.none())

    /** @see create */
    fun create(
        channelId: Int,
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicConversationsMessage> =
        create(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see create */
    fun create(params: MessageCreateParams): CompletableFuture<PublicConversationsMessage> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicConversationsMessage>

    /**
     * Update a message's status to indicate if it was successfully sent, failed to send, or was
     * read. For failed messages, this can also include the error message for the failure.
     */
    fun update(
        messageId: String,
        params: MessageUpdateParams,
    ): CompletableFuture<PublicConversationsMessage> =
        update(messageId, params, RequestOptions.none())

    /** @see update */
    fun update(
        messageId: String,
        params: MessageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicConversationsMessage> =
        update(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see update */
    fun update(params: MessageUpdateParams): CompletableFuture<PublicConversationsMessage> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicConversationsMessage>

    /** Get the details for a specific message sent over a custom channel */
    fun get(
        messageId: String,
        params: MessageGetParams,
    ): CompletableFuture<PublicConversationsMessage> = get(messageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        messageId: String,
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicConversationsMessage> =
        get(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see get */
    fun get(params: MessageGetParams): CompletableFuture<PublicConversationsMessage> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicConversationsMessage>

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /conversations/v3/custom-channels/{channelId}/messages`, but is otherwise the same as
         * [MessageServiceAsync.create].
         */
        fun create(
            channelId: Int,
            params: MessageCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            create(channelId, params, RequestOptions.none())

        /** @see create */
        fun create(
            channelId: Int,
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            create(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see create */
        fun create(
            params: MessageCreateParams
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>>

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/v3/custom-channels/{channelId}/messages/{messageId}`, but is otherwise the
         * same as [MessageServiceAsync.update].
         */
        fun update(
            messageId: String,
            params: MessageUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            update(messageId, params, RequestOptions.none())

        /** @see update */
        fun update(
            messageId: String,
            params: MessageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            update(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see update */
        fun update(
            params: MessageUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MessageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/custom-channels/{channelId}/messages/{messageId}`, but is otherwise the
         * same as [MessageServiceAsync.get].
         */
        fun get(
            messageId: String,
            params: MessageGetParams,
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            get(messageId, params, RequestOptions.none())

        /** @see get */
        fun get(
            messageId: String,
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            get(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see get */
        fun get(
            params: MessageGetParams
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicConversationsMessage>>
    }
}
