// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.basic

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.scheduler.meetings.CollectionResponseWithTotalExternalLinkMetadata
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLinkMetadata
import com.hubspot_sdk.api.services.async.scheduler.meetings.BasicServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BasicServiceAsync.list */
class BasicListPageAsync
private constructor(
    private val service: BasicServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BasicListParams,
    private val response: CollectionResponseWithTotalExternalLinkMetadata,
) : PageAsync<ExternalLinkMetadata> {

    /**
     * Delegates to [CollectionResponseWithTotalExternalLinkMetadata], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalExternalLinkMetadata.results
     */
    fun results(): List<ExternalLinkMetadata> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalExternalLinkMetadata], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalExternalLinkMetadata.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ExternalLinkMetadata> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): BasicListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BasicListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalLinkMetadata> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BasicListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalLinkMetadata = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BasicListPageAsync].
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

    /** A builder for [BasicListPageAsync]. */
    class Builder internal constructor() {

        private var service: BasicServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BasicListParams? = null
        private var response: CollectionResponseWithTotalExternalLinkMetadata? = null

        @JvmSynthetic
        internal fun from(basicListPageAsync: BasicListPageAsync) = apply {
            service = basicListPageAsync.service
            streamHandlerExecutor = basicListPageAsync.streamHandlerExecutor
            params = basicListPageAsync.params
            response = basicListPageAsync.response
        }

        fun service(service: BasicServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BasicListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalLinkMetadata) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BasicListPageAsync].
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
        fun build(): BasicListPageAsync =
            BasicListPageAsync(
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

        return other is BasicListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BasicListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
