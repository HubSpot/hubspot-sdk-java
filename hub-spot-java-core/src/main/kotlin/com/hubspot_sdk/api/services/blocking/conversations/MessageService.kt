// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
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

    /** Send a new message on a thread at the current timestamp. */
    fun create(threadId: String, params: MessageCreateParams): PublicMessage =
        create(threadId, params, RequestOptions.none())

    /** @see create */
    fun create(
        threadId: String,
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMessage = create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see create */
    fun create(params: MessageCreateParams): PublicMessage = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMessage

    /** Retrieve the message history for a specific thread. */
    fun list(threadId: String): CollectionResponsePublicMessageForwardPaging =
        list(threadId, MessageListParams.none())

    /** @see list */
    fun list(
        threadId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicMessageForwardPaging =
        list(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see list */
    fun list(
        threadId: String,
        params: MessageListParams = MessageListParams.none(),
    ): CollectionResponsePublicMessageForwardPaging = list(threadId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicMessageForwardPaging

    /** @see list */
    fun list(params: MessageListParams): CollectionResponsePublicMessageForwardPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        threadId: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicMessageForwardPaging =
        list(threadId, MessageListParams.none(), requestOptions)

    /** Retrieve a single message from a thread using the message ID. */
    fun get(messageId: String, params: MessageGetParams): PublicMessage =
        get(messageId, params, RequestOptions.none())

    /** @see get */
    fun get(
        messageId: String,
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMessage = get(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see get */
    fun get(params: MessageGetParams): PublicMessage = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MessageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMessage

    /**
     * Returns the complete original text and rich text bodies of a message. This will be different
     * from the text and rich text in the message itself if the message's `truncationStatus` is
     * anything other than `NOT_TRUNCATED`.
     */
    fun getOriginalContent(
        messageId: String,
        params: MessageGetOriginalContentParams,
    ): PublicMessageContent = getOriginalContent(messageId, params, RequestOptions.none())

    /** @see getOriginalContent */
    fun getOriginalContent(
        messageId: String,
        params: MessageGetOriginalContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMessageContent =
        getOriginalContent(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getOriginalContent */
    fun getOriginalContent(params: MessageGetOriginalContentParams): PublicMessageContent =
        getOriginalContent(params, RequestOptions.none())

    /** @see getOriginalContent */
    fun getOriginalContent(
        params: MessageGetOriginalContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMessageContent

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
         * /conversations/v3/conversations/threads/{threadId}/messages`, but is otherwise the same
         * as [MessageService.create].
         */
        @MustBeClosed
        fun create(threadId: String, params: MessageCreateParams): HttpResponseFor<PublicMessage> =
            create(threadId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            threadId: String,
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMessage> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: MessageCreateParams): HttpResponseFor<PublicMessage> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMessage>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/threads/{threadId}/messages`, but is otherwise the same
         * as [MessageService.list].
         */
        @MustBeClosed
        fun list(threadId: String): HttpResponseFor<CollectionResponsePublicMessageForwardPaging> =
            list(threadId, MessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            threadId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicMessageForwardPaging> =
            list(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            threadId: String,
            params: MessageListParams = MessageListParams.none(),
        ): HttpResponseFor<CollectionResponsePublicMessageForwardPaging> =
            list(threadId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicMessageForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams
        ): HttpResponseFor<CollectionResponsePublicMessageForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicMessageForwardPaging> =
            list(threadId, MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/threads/{threadId}/messages/{messageId}`, but is
         * otherwise the same as [MessageService.get].
         */
        @MustBeClosed
        fun get(messageId: String, params: MessageGetParams): HttpResponseFor<PublicMessage> =
            get(messageId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            messageId: String,
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMessage> =
            get(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: MessageGetParams): HttpResponseFor<PublicMessage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: MessageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMessage>

        /**
         * Returns a raw HTTP response for `get
         * /conversations/v3/conversations/threads/{threadId}/messages/{messageId}/original-content`,
         * but is otherwise the same as [MessageService.getOriginalContent].
         */
        @MustBeClosed
        fun getOriginalContent(
            messageId: String,
            params: MessageGetOriginalContentParams,
        ): HttpResponseFor<PublicMessageContent> =
            getOriginalContent(messageId, params, RequestOptions.none())

        /** @see getOriginalContent */
        @MustBeClosed
        fun getOriginalContent(
            messageId: String,
            params: MessageGetOriginalContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMessageContent> =
            getOriginalContent(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getOriginalContent */
        @MustBeClosed
        fun getOriginalContent(
            params: MessageGetOriginalContentParams
        ): HttpResponseFor<PublicMessageContent> = getOriginalContent(params, RequestOptions.none())

        /** @see getOriginalContent */
        @MustBeClosed
        fun getOriginalContent(
            params: MessageGetOriginalContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMessageContent>
    }
}
