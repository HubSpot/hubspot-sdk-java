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

/** @see ImportServiceAsync.listErrors */
class ImportListErrorsPageAsync
private constructor(
    private val service: ImportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ImportListErrorsParams,
    private val response: CollectionResponsePublicImportErrorForwardPaging,
) : PageAsync<PublicImportError> {

    /**
     * Delegates to [CollectionResponsePublicImportErrorForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportErrorForwardPaging.results
     */
    fun results(): List<PublicImportError> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicImportErrorForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportErrorForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicImportError> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ImportListErrorsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ImportListErrorsPageAsync> =
        service.listErrors(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicImportError> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ImportListErrorsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicImportErrorForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ImportListErrorsPageAsync].
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

    /** A builder for [ImportListErrorsPageAsync]. */
    class Builder internal constructor() {

        private var service: ImportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ImportListErrorsParams? = null
        private var response: CollectionResponsePublicImportErrorForwardPaging? = null

        @JvmSynthetic
        internal fun from(importListErrorsPageAsync: ImportListErrorsPageAsync) = apply {
            service = importListErrorsPageAsync.service
            streamHandlerExecutor = importListErrorsPageAsync.streamHandlerExecutor
            params = importListErrorsPageAsync.params
            response = importListErrorsPageAsync.response
        }

        fun service(service: ImportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ImportListErrorsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicImportErrorForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ImportListErrorsPageAsync].
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
        fun build(): ImportListErrorsPageAsync =
            ImportListErrorsPageAsync(
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

        return other is ImportListErrorsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ImportListErrorsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
