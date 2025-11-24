// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponsePublicThreadForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicThread
import com.hubspot_sdk.api.services.async.conversations.ThreadServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ThreadServiceAsync.list */
class ThreadListPageAsync
private constructor(
    private val service: ThreadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ThreadListParams,
    private val response: CollectionResponsePublicThreadForwardPaging,
) : PageAsync<PublicThread> {

    /**
     * Delegates to [CollectionResponsePublicThreadForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicThreadForwardPaging.results
     */
    fun results(): List<PublicThread> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicThreadForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicThreadForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicThread> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ThreadListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ThreadListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicThread> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ThreadListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicThreadForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadListPageAsync]. */
    class Builder internal constructor() {

        private var service: ThreadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ThreadListParams? = null
        private var response: CollectionResponsePublicThreadForwardPaging? = null

        @JvmSynthetic
        internal fun from(threadListPageAsync: ThreadListPageAsync) = apply {
            service = threadListPageAsync.service
            streamHandlerExecutor = threadListPageAsync.streamHandlerExecutor
            params = threadListPageAsync.params
            response = threadListPageAsync.response
        }

        fun service(service: ThreadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ThreadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicThreadForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ThreadListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreadListPageAsync =
            ThreadListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ThreadListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
