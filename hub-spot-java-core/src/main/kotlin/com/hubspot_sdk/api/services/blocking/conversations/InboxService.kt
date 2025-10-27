// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicInboxForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicInbox
import com.hubspot_sdk.api.models.conversations.inboxes.InboxGetParams
import com.hubspot_sdk.api.models.conversations.inboxes.InboxListParams
import java.util.function.Consumer

interface InboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService

    /** Retrieve a list of conversations inboxes, with optional filters and sorting. */
    fun list(): CollectionResponseWithTotalPublicInboxForwardPaging = list(InboxListParams.none())

    /** @see list */
    fun list(
        params: InboxListParams = InboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicInboxForwardPaging

    /** @see list */
    fun list(
        params: InboxListParams = InboxListParams.none()
    ): CollectionResponseWithTotalPublicInboxForwardPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionResponseWithTotalPublicInboxForwardPaging =
        list(InboxListParams.none(), requestOptions)

    /** Retrieve details of a single conversations inbox using the inbox ID. */
    fun get(inboxId: String): PublicInbox = get(inboxId, InboxGetParams.none())

    /** @see get */
    fun get(
        inboxId: String,
        params: InboxGetParams = InboxGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInbox = get(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see get */
    fun get(inboxId: String, params: InboxGetParams = InboxGetParams.none()): PublicInbox =
        get(inboxId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: InboxGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInbox

    /** @see get */
    fun get(params: InboxGetParams): PublicInbox = get(params, RequestOptions.none())

    /** @see get */
    fun get(inboxId: String, requestOptions: RequestOptions): PublicInbox =
        get(inboxId, InboxGetParams.none(), requestOptions)

    /** A view of [InboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/inboxes`, but is
         * otherwise the same as [InboxService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionResponseWithTotalPublicInboxForwardPaging> =
            list(InboxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboxListParams = InboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicInboxForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboxListParams = InboxListParams.none()
        ): HttpResponseFor<CollectionResponseWithTotalPublicInboxForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseWithTotalPublicInboxForwardPaging> =
            list(InboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/inboxes/{inboxId}`,
         * but is otherwise the same as [InboxService.get].
         */
        @MustBeClosed
        fun get(inboxId: String): HttpResponseFor<PublicInbox> = get(inboxId, InboxGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            inboxId: String,
            params: InboxGetParams = InboxGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInbox> =
            get(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            inboxId: String,
            params: InboxGetParams = InboxGetParams.none(),
        ): HttpResponseFor<PublicInbox> = get(inboxId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: InboxGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInbox>

        /** @see get */
        @MustBeClosed
        fun get(params: InboxGetParams): HttpResponseFor<PublicInbox> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(inboxId: String, requestOptions: RequestOptions): HttpResponseFor<PublicInbox> =
            get(inboxId, InboxGetParams.none(), requestOptions)
    }
}
