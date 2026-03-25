// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.crm.ImportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ImportServiceAsync.list */
class ImportListPageAsync
private constructor(
    private val service: ImportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ImportListParams,
    private val response: CollectionResponsePublicImportResponseForwardPaging,
) : PageAsync<PublicImportResponse> {

    /**
     * Delegates to [CollectionResponsePublicImportResponseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportResponseForwardPaging.results
     */
    fun results(): List<PublicImportResponse> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicImportResponseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportResponseForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicImportResponse> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ImportListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ImportListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicImportResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ImportListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicImportResponseForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ImportListPageAsync].
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

    /** A builder for [ImportListPageAsync]. */
    class Builder internal constructor() {

        private var service: ImportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ImportListParams? = null
        private var response: CollectionResponsePublicImportResponseForwardPaging? = null

        @JvmSynthetic
        internal fun from(importListPageAsync: ImportListPageAsync) = apply {
            service = importListPageAsync.service
            streamHandlerExecutor = importListPageAsync.streamHandlerExecutor
            params = importListPageAsync.params
            response = importListPageAsync.response
        }

        fun service(service: ImportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ImportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicImportResponseForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ImportListPageAsync].
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
        fun build(): ImportListPageAsync =
            ImportListPageAsync(
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

        return other is ImportListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ImportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
