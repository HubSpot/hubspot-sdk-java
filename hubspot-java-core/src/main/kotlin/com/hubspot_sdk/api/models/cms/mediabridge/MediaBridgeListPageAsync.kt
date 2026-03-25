// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.cms.MediaBridgeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MediaBridgeServiceAsync.list */
class MediaBridgeListPageAsync
private constructor(
    private val service: MediaBridgeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MediaBridgeListParams,
    private val response: CollectionResponseMediaBridgeObjectForwardPaging,
) : PageAsync<MediaBridgeObject> {

    /**
     * Delegates to [CollectionResponseMediaBridgeObjectForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMediaBridgeObjectForwardPaging.results
     */
    fun results(): List<MediaBridgeObject> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMediaBridgeObjectForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMediaBridgeObjectForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<MediaBridgeObject> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): MediaBridgeListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MediaBridgeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MediaBridgeObject> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MediaBridgeListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMediaBridgeObjectForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MediaBridgeListPageAsync].
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

    /** A builder for [MediaBridgeListPageAsync]. */
    class Builder internal constructor() {

        private var service: MediaBridgeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MediaBridgeListParams? = null
        private var response: CollectionResponseMediaBridgeObjectForwardPaging? = null

        @JvmSynthetic
        internal fun from(mediaBridgeListPageAsync: MediaBridgeListPageAsync) = apply {
            service = mediaBridgeListPageAsync.service
            streamHandlerExecutor = mediaBridgeListPageAsync.streamHandlerExecutor
            params = mediaBridgeListPageAsync.params
            response = mediaBridgeListPageAsync.response
        }

        fun service(service: MediaBridgeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MediaBridgeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMediaBridgeObjectForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MediaBridgeListPageAsync].
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
        fun build(): MediaBridgeListPageAsync =
            MediaBridgeListPageAsync(
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

        return other is MediaBridgeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MediaBridgeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
