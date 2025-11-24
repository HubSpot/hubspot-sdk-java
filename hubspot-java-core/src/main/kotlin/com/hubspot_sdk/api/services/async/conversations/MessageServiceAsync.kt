// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.PublicMessage
import com.hubspot_sdk.api.models.conversations.PublicMessageContent
import com.hubspot_sdk.api.models.conversations.messages.MessageCreateParams
import com.hubspot_sdk.api.models.conversations.messages.MessageGetOriginalContentParams
import com.hubspot_sdk.api.models.conversations.messages.MessageGetParams
import com.hubspot_sdk.api.models.conversations.messages.MessageListPageAsync
import com.hubspot_sdk.api.models.conversations.messages.MessageListParams
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

    fun create(threadId: Long, params: MessageCreateParams): CompletableFuture<PublicMessage> =
        create(threadId, params, RequestOptions.none())

    /** @see create */
    fun create(
        threadId: Long,
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMessage> =
        create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see create */
    fun create(params: MessageCreateParams): CompletableFuture<PublicMessage> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMessage>

    fun list(threadId: Long): CompletableFuture<MessageListPageAsync> =
        list(threadId, MessageListParams.none())

    /** @see list */
    fun list(
        threadId: Long,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListPageAsync> =
        list(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see list */
    fun list(
        threadId: Long,
        params: MessageListParams = MessageListParams.none(),
    ): CompletableFuture<MessageListPageAsync> = list(threadId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListPageAsync>

    /** @see list */
    fun list(params: MessageListParams): CompletableFuture<MessageListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        threadId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListPageAsync> =
        list(threadId, MessageListParams.none(), requestOptions)

    fun get(messageId: String, params: MessageGetParams): CompletableFuture<PublicMessage> =
        get(messageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        messageId: String,
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMessage> =
        get(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see get */
    fun get(params: MessageGetParams): CompletableFuture<PublicMessage> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMessage>

    fun getOriginalContent(
        messageId: String,
        params: MessageGetOriginalContentParams,
    ): CompletableFuture<PublicMessageContent> =
        getOriginalContent(messageId, params, RequestOptions.none())

    /** @see getOriginalContent */
    fun getOriginalContent(
        messageId: String,
        params: MessageGetOriginalContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMessageContent> =
        getOriginalContent(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getOriginalContent */
    fun getOriginalContent(
        params: MessageGetOriginalContentParams
    ): CompletableFuture<PublicMessageContent> = getOriginalContent(params, RequestOptions.none())

    /** @see getOriginalContent */
    fun getOriginalContent(
        params: MessageGetOriginalContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMessageContent>

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
         * /conversations/v3/conversations/threads/{threadId}/messages`, but is otherwise the same
         * as [MessageServiceAsync.create].
         */
        fun create(
            threadId: Long,
            params: MessageCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicMessage>> =
            create(threadId, params, RequestOptions.none())

        /** @see create */
        fun create(
            threadId: Long,
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMessage>> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see create */
        fun create(params: MessageCreateParams): CompletableFuture<HttpResponseFor<PublicMessage>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMessage>>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/threads/{threadId}/messages`, but is otherwise the same
         * as [MessageServiceAsync.list].
         */
        fun list(threadId: Long): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(threadId, MessageListParams.none())

        /** @see list */
        fun list(
            threadId: Long,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see list */
        fun list(
            threadId: Long,
            params: MessageListParams = MessageListParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(threadId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>>

        /** @see list */
        fun list(
            params: MessageListParams
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            threadId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(threadId, MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/threads/{threadId}/messages/{messageId}`, but is
         * otherwise the same as [MessageServiceAsync.get].
         */
        fun get(
            messageId: String,
            params: MessageGetParams,
        ): CompletableFuture<HttpResponseFor<PublicMessage>> =
            get(messageId, params, RequestOptions.none())

        /** @see get */
        fun get(
            messageId: String,
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMessage>> =
            get(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see get */
        fun get(params: MessageGetParams): CompletableFuture<HttpResponseFor<PublicMessage>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMessage>>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/threads/{threadId}/messages/{messageId}/original-content`,
         * but is otherwise the same as [MessageServiceAsync.getOriginalContent].
         */
        fun getOriginalContent(
            messageId: String,
            params: MessageGetOriginalContentParams,
        ): CompletableFuture<HttpResponseFor<PublicMessageContent>> =
            getOriginalContent(messageId, params, RequestOptions.none())

        /** @see getOriginalContent */
        fun getOriginalContent(
            messageId: String,
            params: MessageGetOriginalContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMessageContent>> =
            getOriginalContent(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getOriginalContent */
        fun getOriginalContent(
            params: MessageGetOriginalContentParams
        ): CompletableFuture<HttpResponseFor<PublicMessageContent>> =
            getOriginalContent(params, RequestOptions.none())

        /** @see getOriginalContent */
        fun getOriginalContent(
            params: MessageGetOriginalContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMessageContent>>
    }
}
