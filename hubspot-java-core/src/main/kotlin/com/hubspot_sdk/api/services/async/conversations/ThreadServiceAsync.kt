// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.PublicThread
import com.hubspot_sdk.api.models.conversations.threads.ThreadDeleteParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadGetParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadListPageAsync
import com.hubspot_sdk.api.models.conversations.threads.ThreadListParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ThreadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync

    fun update(threadId: Long, params: ThreadUpdateParams): CompletableFuture<PublicThread> =
        update(threadId, params, RequestOptions.none())

    /** @see update */
    fun update(
        threadId: Long,
        params: ThreadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicThread> =
        update(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see update */
    fun update(params: ThreadUpdateParams): CompletableFuture<PublicThread> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ThreadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicThread>

    fun list(): CompletableFuture<ThreadListPageAsync> = list(ThreadListParams.none())

    /** @see list */
    fun list(
        params: ThreadListParams = ThreadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadListPageAsync>

    /** @see list */
    fun list(
        params: ThreadListParams = ThreadListParams.none()
    ): CompletableFuture<ThreadListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ThreadListPageAsync> =
        list(ThreadListParams.none(), requestOptions)

    fun delete(threadId: Long): CompletableFuture<Void?> =
        delete(threadId, ThreadDeleteParams.none())

    /** @see delete */
    fun delete(
        threadId: Long,
        params: ThreadDeleteParams = ThreadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see delete */
    fun delete(
        threadId: Long,
        params: ThreadDeleteParams = ThreadDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(threadId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ThreadDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ThreadDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(threadId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(threadId, ThreadDeleteParams.none(), requestOptions)

    fun get(threadId: Long): CompletableFuture<PublicThread> = get(threadId, ThreadGetParams.none())

    /** @see get */
    fun get(
        threadId: Long,
        params: ThreadGetParams = ThreadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicThread> =
        get(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see get */
    fun get(
        threadId: Long,
        params: ThreadGetParams = ThreadGetParams.none(),
    ): CompletableFuture<PublicThread> = get(threadId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ThreadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicThread>

    /** @see get */
    fun get(params: ThreadGetParams): CompletableFuture<PublicThread> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(threadId: Long, requestOptions: RequestOptions): CompletableFuture<PublicThread> =
        get(threadId, ThreadGetParams.none(), requestOptions)

    /**
     * A view of [ThreadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/v3/conversations/threads/{threadId}`, but is otherwise the same as
         * [ThreadServiceAsync.update].
         */
        fun update(
            threadId: Long,
            params: ThreadUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            update(threadId, params, RequestOptions.none())

        /** @see update */
        fun update(
            threadId: Long,
            params: ThreadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            update(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see update */
        fun update(params: ThreadUpdateParams): CompletableFuture<HttpResponseFor<PublicThread>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ThreadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicThread>>

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/threads`, but is
         * otherwise the same as [ThreadServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(ThreadListParams.none())

        /** @see list */
        fun list(
            params: ThreadListParams = ThreadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>>

        /** @see list */
        fun list(
            params: ThreadListParams = ThreadListParams.none()
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(ThreadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /conversations/v3/conversations/threads/{threadId}`, but is otherwise the same as
         * [ThreadServiceAsync.delete].
         */
        fun delete(threadId: Long): CompletableFuture<HttpResponse> =
            delete(threadId, ThreadDeleteParams.none())

        /** @see delete */
        fun delete(
            threadId: Long,
            params: ThreadDeleteParams = ThreadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see delete */
        fun delete(
            threadId: Long,
            params: ThreadDeleteParams = ThreadDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(threadId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ThreadDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ThreadDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            threadId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(threadId, ThreadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/threads/{threadId}`,
         * but is otherwise the same as [ThreadServiceAsync.get].
         */
        fun get(threadId: Long): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(threadId, ThreadGetParams.none())

        /** @see get */
        fun get(
            threadId: Long,
            params: ThreadGetParams = ThreadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see get */
        fun get(
            threadId: Long,
            params: ThreadGetParams = ThreadGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(threadId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ThreadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicThread>>

        /** @see get */
        fun get(params: ThreadGetParams): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            threadId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(threadId, ThreadGetParams.none(), requestOptions)
    }
}
