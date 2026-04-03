// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileassets

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.files.CollectionResponseFile
import com.hubspot_sdk.api.models.files.File
import com.hubspot_sdk.api.services.async.files.FileAssetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FileAssetServiceAsync.search */
class FileAssetSearchPageAsync
private constructor(
    private val service: FileAssetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FileAssetSearchParams,
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

    fun nextPageParams(): FileAssetSearchParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<FileAssetSearchPageAsync> =
        service.search(nextPageParams())

    fun autoPager(): AutoPagerAsync<File> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FileAssetSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseFile = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileAssetSearchPageAsync].
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

    /** A builder for [FileAssetSearchPageAsync]. */
    class Builder internal constructor() {

        private var service: FileAssetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FileAssetSearchParams? = null
        private var response: CollectionResponseFile? = null

        @JvmSynthetic
        internal fun from(fileAssetSearchPageAsync: FileAssetSearchPageAsync) = apply {
            service = fileAssetSearchPageAsync.service
            streamHandlerExecutor = fileAssetSearchPageAsync.streamHandlerExecutor
            params = fileAssetSearchPageAsync.params
            response = fileAssetSearchPageAsync.response
        }

        fun service(service: FileAssetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FileAssetSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseFile) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FileAssetSearchPageAsync].
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
        fun build(): FileAssetSearchPageAsync =
            FileAssetSearchPageAsync(
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

        return other is FileAssetSearchPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FileAssetSearchPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
