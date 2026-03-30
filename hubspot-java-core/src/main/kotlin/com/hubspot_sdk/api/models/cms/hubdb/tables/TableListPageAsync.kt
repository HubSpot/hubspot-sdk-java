// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.tables

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.cms.hubdb.CollectionResponseWithTotalHubDbTableV3
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3
import com.hubspot_sdk.api.services.async.cms.hubdb.TableServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TableServiceAsync.list */
class TableListPageAsync
private constructor(
    private val service: TableServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TableListParams,
    private val response: CollectionResponseWithTotalHubDbTableV3,
) : PageAsync<HubDbTableV3> {

    /**
     * Delegates to [CollectionResponseWithTotalHubDbTableV3], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalHubDbTableV3.results
     */
    fun results(): List<HubDbTableV3> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalHubDbTableV3], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalHubDbTableV3.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<HubDbTableV3> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): TableListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<TableListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<HubDbTableV3> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TableListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalHubDbTableV3 = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TableListPageAsync].
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

    /** A builder for [TableListPageAsync]. */
    class Builder internal constructor() {

        private var service: TableServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TableListParams? = null
        private var response: CollectionResponseWithTotalHubDbTableV3? = null

        @JvmSynthetic
        internal fun from(tableListPageAsync: TableListPageAsync) = apply {
            service = tableListPageAsync.service
            streamHandlerExecutor = tableListPageAsync.streamHandlerExecutor
            params = tableListPageAsync.params
            response = tableListPageAsync.response
        }

        fun service(service: TableServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TableListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalHubDbTableV3) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TableListPageAsync].
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
        fun build(): TableListPageAsync =
            TableListPageAsync(
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

        return other is TableListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TableListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
