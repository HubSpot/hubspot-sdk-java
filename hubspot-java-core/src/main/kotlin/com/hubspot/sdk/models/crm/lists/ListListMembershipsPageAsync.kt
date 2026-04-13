// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.services.async.crm.ListServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ListServiceAsync.listMemberships */
class ListListMembershipsPageAsync
private constructor(
    private val service: ListServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ListListMembershipsParams,
    private val response: ApiCollectionResponseJoinTimeAndRecordId,
) : PageAsync<JoinTimeAndRecordId> {

    /**
     * Delegates to [ApiCollectionResponseJoinTimeAndRecordId], but gracefully handles missing data.
     *
     * @see ApiCollectionResponseJoinTimeAndRecordId.results
     */
    fun results(): List<JoinTimeAndRecordId> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [ApiCollectionResponseJoinTimeAndRecordId], but gracefully handles missing data.
     *
     * @see ApiCollectionResponseJoinTimeAndRecordId.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<JoinTimeAndRecordId> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ListListMembershipsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ListListMembershipsPageAsync> =
        service.listMemberships(nextPageParams())

    fun autoPager(): AutoPagerAsync<JoinTimeAndRecordId> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ListListMembershipsParams = params

    /** The response that this page was parsed from. */
    fun response(): ApiCollectionResponseJoinTimeAndRecordId = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ListListMembershipsPageAsync].
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

    /** A builder for [ListListMembershipsPageAsync]. */
    class Builder internal constructor() {

        private var service: ListServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ListListMembershipsParams? = null
        private var response: ApiCollectionResponseJoinTimeAndRecordId? = null

        @JvmSynthetic
        internal fun from(listListMembershipsPageAsync: ListListMembershipsPageAsync) = apply {
            service = listListMembershipsPageAsync.service
            streamHandlerExecutor = listListMembershipsPageAsync.streamHandlerExecutor
            params = listListMembershipsPageAsync.params
            response = listListMembershipsPageAsync.response
        }

        fun service(service: ListServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ListListMembershipsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ApiCollectionResponseJoinTimeAndRecordId) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ListListMembershipsPageAsync].
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
        fun build(): ListListMembershipsPageAsync =
            ListListMembershipsPageAsync(
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

        return other is ListListMembershipsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ListListMembershipsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
