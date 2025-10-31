// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponsePublicThreadForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicThread
import com.hubspot_sdk.api.models.conversations.threads.ThreadDeleteParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadGetParams
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

    /**
     * Updates a single thread. Either a thread's status can be updated, or the thread can be
     * restored.
     */
    fun update(threadId: String, params: ThreadUpdateParams): CompletableFuture<PublicThread> =
        update(threadId, params, RequestOptions.none())

    /** @see update */
    fun update(
        threadId: String,
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

    /** Retrieve a list of threads, with optional filters and sorting. */
    fun list(): CompletableFuture<CollectionResponsePublicThreadForwardPaging> =
        list(ThreadListParams.none())

    /** @see list */
    fun list(
        params: ThreadListParams = ThreadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicThreadForwardPaging>

    /** @see list */
    fun list(
        params: ThreadListParams = ThreadListParams.none()
    ): CompletableFuture<CollectionResponsePublicThreadForwardPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicThreadForwardPaging> =
        list(ThreadListParams.none(), requestOptions)

    /**
     * Archives a single thread. The thread will be permanently deleted 30 days after placed in an
     * archived state.
     */
    fun delete(threadId: String): CompletableFuture<Void?> =
        delete(threadId, ThreadDeleteParams.none())

    /** @see delete */
    fun delete(
        threadId: String,
        params: ThreadDeleteParams = ThreadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see delete */
    fun delete(
        threadId: String,
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
    fun delete(threadId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(threadId, ThreadDeleteParams.none(), requestOptions)

    /** Retrieve a single thread by its ID */
    fun get(threadId: String): CompletableFuture<PublicThread> =
        get(threadId, ThreadGetParams.none())

    /** @see get */
    fun get(
        threadId: String,
        params: ThreadGetParams = ThreadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicThread> =
        get(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see get */
    fun get(
        threadId: String,
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
    fun get(threadId: String, requestOptions: RequestOptions): CompletableFuture<PublicThread> =
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
            threadId: String,
            params: ThreadUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            update(threadId, params, RequestOptions.none())

        /** @see update */
        fun update(
            threadId: String,
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
        fun list():
            CompletableFuture<HttpResponseFor<CollectionResponsePublicThreadForwardPaging>> =
            list(ThreadListParams.none())

        /** @see list */
        fun list(
            params: ThreadListParams = ThreadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicThreadForwardPaging>>

        /** @see list */
        fun list(
            params: ThreadListParams = ThreadListParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicThreadForwardPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicThreadForwardPaging>> =
            list(ThreadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /conversations/v3/conversations/threads/{threadId}`, but is otherwise the same as
         * [ThreadServiceAsync.delete].
         */
        fun delete(threadId: String): CompletableFuture<HttpResponse> =
            delete(threadId, ThreadDeleteParams.none())

        /** @see delete */
        fun delete(
            threadId: String,
            params: ThreadDeleteParams = ThreadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see delete */
        fun delete(
            threadId: String,
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
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(threadId, ThreadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/threads/{threadId}`,
         * but is otherwise the same as [ThreadServiceAsync.get].
         */
        fun get(threadId: String): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(threadId, ThreadGetParams.none())

        /** @see get */
        fun get(
            threadId: String,
            params: ThreadGetParams = ThreadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see get */
        fun get(
            threadId: String,
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
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicThread>> =
            get(threadId, ThreadGetParams.none(), requestOptions)
    }
}
