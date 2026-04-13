// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.folders

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.files.CollectionResponseFolder
import com.hubspot.sdk.models.files.Folder
import com.hubspot.sdk.services.async.files.FolderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FolderServiceAsync.search */
class FolderSearchPageAsync
private constructor(
    private val service: FolderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FolderSearchParams,
    private val response: CollectionResponseFolder,
) : PageAsync<Folder> {

    /**
     * Delegates to [CollectionResponseFolder], but gracefully handles missing data.
     *
     * @see CollectionResponseFolder.results
     */
    fun results(): List<Folder> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseFolder], but gracefully handles missing data.
     *
     * @see CollectionResponseFolder.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<Folder> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FolderSearchParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<FolderSearchPageAsync> =
        service.search(nextPageParams())

    fun autoPager(): AutoPagerAsync<Folder> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FolderSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFolder = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FolderSearchPageAsync].
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

    /** A builder for [FolderSearchPageAsync]. */
    class Builder internal constructor() {

        private var service: FolderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FolderSearchParams? = null
        private var response: CollectionResponseFolder? = null

        @JvmSynthetic
        internal fun from(folderSearchPageAsync: FolderSearchPageAsync) = apply {
            service = folderSearchPageAsync.service
            streamHandlerExecutor = folderSearchPageAsync.streamHandlerExecutor
            params = folderSearchPageAsync.params
            response = folderSearchPageAsync.response
        }

        fun service(service: FolderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FolderSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFolder) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FolderSearchPageAsync].
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
        fun build(): FolderSearchPageAsync =
            FolderSearchPageAsync(
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

        return other is FolderSearchPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FolderSearchPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
