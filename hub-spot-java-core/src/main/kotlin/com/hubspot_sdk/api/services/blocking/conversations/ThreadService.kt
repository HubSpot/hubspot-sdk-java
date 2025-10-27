// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.CollectionResponsePublicThreadForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicThread
import com.hubspot_sdk.api.models.conversations.threads.ThreadArchiveParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadGetParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadListParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadUpdateParams
import java.util.function.Consumer

interface ThreadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService

    /**
     * Updates a single thread. Either a thread's status can be updated, or the thread can be
     * restored.
     */
    fun update(threadId: String, params: ThreadUpdateParams): PublicThread =
        update(threadId, params, RequestOptions.none())

    /** @see update */
    fun update(
        threadId: String,
        params: ThreadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicThread = update(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see update */
    fun update(params: ThreadUpdateParams): PublicThread = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ThreadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicThread

    /** Retrieve a list of threads, with optional filters and sorting. */
    fun list(): CollectionResponsePublicThreadForwardPaging = list(ThreadListParams.none())

    /** @see list */
    fun list(
        params: ThreadListParams = ThreadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicThreadForwardPaging

    /** @see list */
    fun list(
        params: ThreadListParams = ThreadListParams.none()
    ): CollectionResponsePublicThreadForwardPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionResponsePublicThreadForwardPaging =
        list(ThreadListParams.none(), requestOptions)

    /**
     * Archives a single thread. The thread will be permanently deleted 30 days after placed in an
     * archived state.
     */
    fun archive(threadId: String) = archive(threadId, ThreadArchiveParams.none())

    /** @see archive */
    fun archive(
        threadId: String,
        params: ThreadArchiveParams = ThreadArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see archive */
    fun archive(threadId: String, params: ThreadArchiveParams = ThreadArchiveParams.none()) =
        archive(threadId, params, RequestOptions.none())

    /** @see archive */
    fun archive(params: ThreadArchiveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see archive */
    fun archive(params: ThreadArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(threadId: String, requestOptions: RequestOptions) =
        archive(threadId, ThreadArchiveParams.none(), requestOptions)

    /** Retrieve a single thread by its ID */
    fun get(threadId: String): PublicThread = get(threadId, ThreadGetParams.none())

    /** @see get */
    fun get(
        threadId: String,
        params: ThreadGetParams = ThreadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicThread = get(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see get */
    fun get(threadId: String, params: ThreadGetParams = ThreadGetParams.none()): PublicThread =
        get(threadId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ThreadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicThread

    /** @see get */
    fun get(params: ThreadGetParams): PublicThread = get(params, RequestOptions.none())

    /** @see get */
    fun get(threadId: String, requestOptions: RequestOptions): PublicThread =
        get(threadId, ThreadGetParams.none(), requestOptions)

    /** A view of [ThreadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /conversations/v3/conversations/threads/{threadId}`, but is otherwise the same as
         * [ThreadService.update].
         */
        @MustBeClosed
        fun update(threadId: String, params: ThreadUpdateParams): HttpResponseFor<PublicThread> =
            update(threadId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            threadId: String,
            params: ThreadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicThread> =
            update(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ThreadUpdateParams): HttpResponseFor<PublicThread> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ThreadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicThread>

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/threads`, but is
         * otherwise the same as [ThreadService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionResponsePublicThreadForwardPaging> =
            list(ThreadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ThreadListParams = ThreadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicThreadForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ThreadListParams = ThreadListParams.none()
        ): HttpResponseFor<CollectionResponsePublicThreadForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicThreadForwardPaging> =
            list(ThreadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /conversations/v3/conversations/threads/{threadId}`, but is otherwise the same as
         * [ThreadService.archive].
         */
        @MustBeClosed
        fun archive(threadId: String): HttpResponse = archive(threadId, ThreadArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            threadId: String,
            params: ThreadArchiveParams = ThreadArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            threadId: String,
            params: ThreadArchiveParams = ThreadArchiveParams.none(),
        ): HttpResponse = archive(threadId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: ThreadArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: ThreadArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(threadId: String, requestOptions: RequestOptions): HttpResponse =
            archive(threadId, ThreadArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/threads/{threadId}`,
         * but is otherwise the same as [ThreadService.get].
         */
        @MustBeClosed
        fun get(threadId: String): HttpResponseFor<PublicThread> =
            get(threadId, ThreadGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            threadId: String,
            params: ThreadGetParams = ThreadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicThread> =
            get(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            threadId: String,
            params: ThreadGetParams = ThreadGetParams.none(),
        ): HttpResponseFor<PublicThread> = get(threadId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ThreadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicThread>

        /** @see get */
        @MustBeClosed
        fun get(params: ThreadGetParams): HttpResponseFor<PublicThread> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(threadId: String, requestOptions: RequestOptions): HttpResponseFor<PublicThread> =
            get(threadId, ThreadGetParams.none(), requestOptions)
    }
}
