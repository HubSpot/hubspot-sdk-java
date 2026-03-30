// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.folders

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderVersion
import com.hubspot_sdk.api.models.cms.pages.ContentFolderVersion
import com.hubspot_sdk.api.services.async.cms.pages.FolderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FolderServiceAsync.listFolderRevisions */
class FolderListFolderRevisionsPageAsync
private constructor(
    private val service: FolderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FolderListFolderRevisionsParams,
    private val response: CollectionResponseWithTotalContentFolderVersion,
) : PageAsync<ContentFolderVersion> {

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderVersion], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderVersion.results
     */
    fun results(): List<ContentFolderVersion> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalContentFolderVersion], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalContentFolderVersion.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ContentFolderVersion> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): FolderListFolderRevisionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<FolderListFolderRevisionsPageAsync> =
        service.listFolderRevisions(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContentFolderVersion> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FolderListFolderRevisionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalContentFolderVersion = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FolderListFolderRevisionsPageAsync].
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

    /** A builder for [FolderListFolderRevisionsPageAsync]. */
    class Builder internal constructor() {

        private var service: FolderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FolderListFolderRevisionsParams? = null
        private var response: CollectionResponseWithTotalContentFolderVersion? = null

        @JvmSynthetic
        internal fun from(folderListFolderRevisionsPageAsync: FolderListFolderRevisionsPageAsync) =
            apply {
                service = folderListFolderRevisionsPageAsync.service
                streamHandlerExecutor = folderListFolderRevisionsPageAsync.streamHandlerExecutor
                params = folderListFolderRevisionsPageAsync.params
                response = folderListFolderRevisionsPageAsync.response
            }

        fun service(service: FolderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FolderListFolderRevisionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalContentFolderVersion) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FolderListFolderRevisionsPageAsync].
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
        fun build(): FolderListFolderRevisionsPageAsync =
            FolderListFolderRevisionsPageAsync(
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

        return other is FolderListFolderRevisionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FolderListFolderRevisionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
