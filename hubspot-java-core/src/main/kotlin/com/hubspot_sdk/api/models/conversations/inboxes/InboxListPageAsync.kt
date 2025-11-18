// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.inboxes

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicInboxForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicInbox
import com.hubspot_sdk.api.services.async.conversations.InboxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InboxServiceAsync.list */
class InboxListPageAsync
private constructor(
    private val service: InboxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InboxListParams,
    private val response: CollectionResponseWithTotalPublicInboxForwardPaging,
) : PageAsync<PublicInbox> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicInboxForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicInboxForwardPaging.results
     */
    fun results(): List<PublicInbox> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicInboxForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicInboxForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicInbox> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): InboxListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<InboxListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicInbox> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicInboxForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboxListPageAsync].
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

    /** A builder for [InboxListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InboxListParams? = null
        private var response: CollectionResponseWithTotalPublicInboxForwardPaging? = null

        @JvmSynthetic
        internal fun from(inboxListPageAsync: InboxListPageAsync) = apply {
            service = inboxListPageAsync.service
            streamHandlerExecutor = inboxListPageAsync.streamHandlerExecutor
            params = inboxListPageAsync.params
            response = inboxListPageAsync.response
        }

        fun service(service: InboxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicInboxForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboxListPageAsync].
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
        fun build(): InboxListPageAsync =
            InboxListPageAsync(
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

        return other is InboxListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InboxListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
