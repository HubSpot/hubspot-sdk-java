// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.automation.WorkflowService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see WorkflowService.list */
class WorkflowListPage
private constructor(
    private val service: WorkflowService,
    private val params: WorkflowListParams,
    private val response: CollectionResponseApiFlowListingForwardPaging,
) : Page<ApiFlowListing> {

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

    override fun nextPage(): WorkflowListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ApiFlowListing> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WorkflowListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseApiFlowListingForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkflowListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkflowListPage]. */
    class Builder internal constructor() {

        private var service: WorkflowService? = null
        private var params: WorkflowListParams? = null
        private var response: CollectionResponseApiFlowListingForwardPaging? = null

        @JvmSynthetic
        internal fun from(workflowListPage: WorkflowListPage) = apply {
            service = workflowListPage.service
            params = workflowListPage.params
            response = workflowListPage.response
        }

        fun service(service: WorkflowService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WorkflowListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseApiFlowListingForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WorkflowListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WorkflowListPage =
            WorkflowListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkflowListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WorkflowListPage{service=$service, params=$params, response=$response}"
}
