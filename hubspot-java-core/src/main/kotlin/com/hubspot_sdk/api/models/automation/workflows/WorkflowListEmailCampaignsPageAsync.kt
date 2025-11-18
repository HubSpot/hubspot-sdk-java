// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.async.automation.WorkflowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see WorkflowServiceAsync.listEmailCampaigns */
class WorkflowListEmailCampaignsPageAsync
private constructor(
    private val service: WorkflowServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WorkflowListEmailCampaignsParams,
    private val response: CollectionResponseApiFlowEmailCampaign,
) : PageAsync<ApiFlowEmailCampaign> {

    /**
     * Delegates to [CollectionResponseApiFlowEmailCampaign], but gracefully handles missing data.
     *
     * @see CollectionResponseApiFlowEmailCampaign.results
     */
    fun results(): List<ApiFlowEmailCampaign> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseApiFlowEmailCampaign], but gracefully handles missing data.
     *
     * @see CollectionResponseApiFlowEmailCampaign.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ApiFlowEmailCampaign> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): WorkflowListEmailCampaignsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<WorkflowListEmailCampaignsPageAsync> =
        service.listEmailCampaigns(nextPageParams())

    fun autoPager(): AutoPagerAsync<ApiFlowEmailCampaign> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WorkflowListEmailCampaignsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseApiFlowEmailCampaign = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WorkflowListEmailCampaignsPageAsync].
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

    /** A builder for [WorkflowListEmailCampaignsPageAsync]. */
    class Builder internal constructor() {

        private var service: WorkflowServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WorkflowListEmailCampaignsParams? = null
        private var response: CollectionResponseApiFlowEmailCampaign? = null

        @JvmSynthetic
        internal fun from(
            workflowListEmailCampaignsPageAsync: WorkflowListEmailCampaignsPageAsync
        ) = apply {
            service = workflowListEmailCampaignsPageAsync.service
            streamHandlerExecutor = workflowListEmailCampaignsPageAsync.streamHandlerExecutor
            params = workflowListEmailCampaignsPageAsync.params
            response = workflowListEmailCampaignsPageAsync.response
        }

        fun service(service: WorkflowServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WorkflowListEmailCampaignsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseApiFlowEmailCampaign) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WorkflowListEmailCampaignsPageAsync].
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
        fun build(): WorkflowListEmailCampaignsPageAsync =
            WorkflowListEmailCampaignsPageAsync(
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

        return other is WorkflowListEmailCampaignsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WorkflowListEmailCampaignsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
