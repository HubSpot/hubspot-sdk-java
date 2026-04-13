// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.folders

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot.models.cms.pages.ContentFolder
import com.hubspot.services.async.cms.pages.FolderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FolderServiceAsync.list */
class FolderListPageAsync
private constructor(
    private val service: FolderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FolderListParams,
    private val response: CollectionResponseWithTotalContentFolderForwardPaging,
) : PageAsync<ContentFolder> {

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.results
     */
    fun results(): List<ContentFolder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ContentFolder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FolderListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<FolderListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContentFolder> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FolderListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderListPageAsync].
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

    /** A builder for [FolderListPageAsync]. */
    class Builder internal constructor() {

        private var service: FolderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FolderListParams? = null
        private var response: CollectionResponseWithTotalContentFolderForwardPaging? = null

        @JvmSynthetic
        internal fun from(folderListPageAsync: FolderListPageAsync) = apply {
            service = folderListPageAsync.service
            streamHandlerExecutor = folderListPageAsync.streamHandlerExecutor
            params = folderListPageAsync.params
            response = folderListPageAsync.response
        }

        fun service(service: FolderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FolderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FolderListPageAsync].
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
        fun build(): FolderListPageAsync =
            FolderListPageAsync(
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

        return other is FolderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FolderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
