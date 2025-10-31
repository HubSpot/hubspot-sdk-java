// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.automation.WorkflowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see WorkflowServiceAsync.list */
class WorkflowListPageAsync
private constructor(
    private val service: WorkflowServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WorkflowListParams,
    private val response: CollectionResponseApiFlowListingForwardPaging,
) : PageAsync<ApiFlowListing> {

    /**
     * Delegates to [CollectionResponseApiFlowListingForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseApiFlowListingForwardPaging.results
     */
    fun results(): List<ApiFlowListing> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseApiFlowListingForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseApiFlowListingForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ApiFlowListing> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): WorkflowListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<WorkflowListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ApiFlowListing> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WorkflowListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseApiFlowListingForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkflowListPageAsync].
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

    /** A builder for [WorkflowListPageAsync]. */
    class Builder internal constructor() {

        private var service: WorkflowServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WorkflowListParams? = null
        private var response: CollectionResponseApiFlowListingForwardPaging? = null

        @JvmSynthetic
        internal fun from(workflowListPageAsync: WorkflowListPageAsync) = apply {
            service = workflowListPageAsync.service
            streamHandlerExecutor = workflowListPageAsync.streamHandlerExecutor
            params = workflowListPageAsync.params
            response = workflowListPageAsync.response
        }

        fun service(service: WorkflowServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WorkflowListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseApiFlowListingForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WorkflowListPageAsync].
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
        fun build(): WorkflowListPageAsync =
            WorkflowListPageAsync(
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

        return other is WorkflowListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WorkflowListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
