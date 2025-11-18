// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.PublicInbox
import com.hubspot_sdk.api.models.conversations.inboxes.InboxGetParams
import com.hubspot_sdk.api.models.conversations.inboxes.InboxListPageAsync
import com.hubspot_sdk.api.models.conversations.inboxes.InboxListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxServiceAsync

    /** Retrieve a list of conversations inboxes, with optional filters and sorting. */
    fun list(): CompletableFuture<InboxListPageAsync> = list(InboxListParams.none())

    /** @see list */
    fun list(
        params: InboxListParams = InboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboxListPageAsync>

    /** @see list */
    fun list(
        params: InboxListParams = InboxListParams.none()
    ): CompletableFuture<InboxListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboxListPageAsync> =
        list(InboxListParams.none(), requestOptions)

    /** Retrieve details of a single conversations inbox using the inbox ID. */
    fun get(inboxId: Int): CompletableFuture<PublicInbox> = get(inboxId, InboxGetParams.none())

    /** @see get */
    fun get(
        inboxId: Int,
        params: InboxGetParams = InboxGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInbox> =
        get(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see get */
    fun get(
        inboxId: Int,
        params: InboxGetParams = InboxGetParams.none(),
    ): CompletableFuture<PublicInbox> = get(inboxId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: InboxGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInbox>

    /** @see get */
    fun get(params: InboxGetParams): CompletableFuture<PublicInbox> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(inboxId: Int, requestOptions: RequestOptions): CompletableFuture<PublicInbox> =
        get(inboxId, InboxGetParams.none(), requestOptions)

    /** A view of [InboxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/inboxes`, but is
         * otherwise the same as [InboxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboxListPageAsync>> =
            list(InboxListParams.none())

        /** @see list */
        fun list(
            params: InboxListParams = InboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboxListPageAsync>>

        /** @see list */
        fun list(
            params: InboxListParams = InboxListParams.none()
        ): CompletableFuture<HttpResponseFor<InboxListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboxListPageAsync>> =
            list(InboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/inboxes/{inboxId}`,
         * but is otherwise the same as [InboxServiceAsync.get].
         */
        fun get(inboxId: Int): CompletableFuture<HttpResponseFor<PublicInbox>> =
            get(inboxId, InboxGetParams.none())

        /** @see get */
        fun get(
            inboxId: Int,
            params: InboxGetParams = InboxGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInbox>> =
            get(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see get */
        fun get(
            inboxId: Int,
            params: InboxGetParams = InboxGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicInbox>> =
            get(inboxId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: InboxGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInbox>>

        /** @see get */
        fun get(params: InboxGetParams): CompletableFuture<HttpResponseFor<PublicInbox>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            inboxId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicInbox>> =
            get(inboxId, InboxGetParams.none(), requestOptions)
    }
}
