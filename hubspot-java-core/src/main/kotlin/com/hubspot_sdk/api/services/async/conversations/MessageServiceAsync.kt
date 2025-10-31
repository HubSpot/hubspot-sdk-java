// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponsePublicMessageForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicMessage
import com.hubspot_sdk.api.models.conversations.PublicMessageContent
import com.hubspot_sdk.api.models.conversations.messages.MessageCreateParams
import com.hubspot_sdk.api.models.conversations.messages.MessageGetOriginalContentParams
import com.hubspot_sdk.api.models.conversations.messages.MessageGetParams
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

    /** Send a new message on a thread at the current timestamp. */
    fun create(threadId: String, params: MessageCreateParams): CompletableFuture<PublicMessage> =
        create(threadId, params, RequestOptions.none())

    /** @see create */
    fun create(
        threadId: String,
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

    /** Retrieve the message history for a specific thread. */
    fun list(threadId: String): CompletableFuture<CollectionResponsePublicMessageForwardPaging> =
        list(threadId, MessageListParams.none())

    /** @see list */
    fun list(
        threadId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicMessageForwardPaging> =
        list(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see list */
    fun list(
        threadId: String,
        params: MessageListParams = MessageListParams.none(),
    ): CompletableFuture<CollectionResponsePublicMessageForwardPaging> =
        list(threadId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicMessageForwardPaging>

    /** @see list */
    fun list(
        params: MessageListParams
    ): CompletableFuture<CollectionResponsePublicMessageForwardPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        threadId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicMessageForwardPaging> =
        list(threadId, MessageListParams.none(), requestOptions)

    /** Retrieve a single message from a thread using the message ID. */
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

    /**
     * Returns the complete original text and rich text bodies of a message. This will be different
     * from the text and rich text in the message itself if the message's `truncationStatus` is
     * anything other than `NOT_TRUNCATED`.
     */
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
            threadId: String,
            params: MessageCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicMessage>> =
            create(threadId, params, RequestOptions.none())

        /** @see create */
        fun create(
            threadId: String,
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
        fun list(
            threadId: String
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicMessageForwardPaging>> =
            list(threadId, MessageListParams.none())

        /** @see list */
        fun list(
            threadId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicMessageForwardPaging>> =
            list(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see list */
        fun list(
            threadId: String,
            params: MessageListParams = MessageListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicMessageForwardPaging>> =
            list(threadId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicMessageForwardPaging>>

        /** @see list */
        fun list(
            params: MessageListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicMessageForwardPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicMessageForwardPaging>> =
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
