// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileoperations

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.files.CollectionResponseFile
import com.hubspot_sdk.api.models.files.File
import com.hubspot_sdk.api.services.async.files.FileOperationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FileOperationServiceAsync.search */
class FileOperationSearchPageAsync
private constructor(
    private val service: FileOperationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FileOperationSearchParams,
    private val response: CollectionResponseFile,
) : PageAsync<File> {

    /**
     * Delegates to [CollectionResponseFile], but gracefully handles missing data.
     *
     * @see CollectionResponseFile.results
     */
    fun results(): List<File> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseFile], but gracefully handles missing data.
     *
     * @see CollectionResponseFile.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<File> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FileOperationSearchParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<FileOperationSearchPageAsync> =
        service.search(nextPageParams())

    fun autoPager(): AutoPagerAsync<File> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FileOperationSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFile = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileOperationSearchPageAsync].
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

    /** A builder for [FileOperationSearchPageAsync]. */
    class Builder internal constructor() {

        private var service: FileOperationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FileOperationSearchParams? = null
        private var response: CollectionResponseFile? = null

        @JvmSynthetic
        internal fun from(fileOperationSearchPageAsync: FileOperationSearchPageAsync) = apply {
            service = fileOperationSearchPageAsync.service
            streamHandlerExecutor = fileOperationSearchPageAsync.streamHandlerExecutor
            params = fileOperationSearchPageAsync.params
            response = fileOperationSearchPageAsync.response
        }

        fun service(service: FileOperationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FileOperationSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFile) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FileOperationSearchPageAsync].
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
        fun build(): FileOperationSearchPageAsync =
            FileOperationSearchPageAsync(
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

        return other is FileOperationSearchPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FileOperationSearchPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
