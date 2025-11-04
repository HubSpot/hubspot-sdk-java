// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import com.hubspot_sdk.api.services.blocking.automation.WorkflowService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see WorkflowService.listEmailCampaigns */
class WorkflowListEmailCampaignsPage
private constructor(
    private val service: WorkflowService,
    private val params: WorkflowListEmailCampaignsParams,
    private val response: CollectionResponseApiFlowEmailCampaign,
) : Page<ApiFlowEmailCampaign> {

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
    fun paging(): Optional<EmailsPaging> = response._paging().getOptional("paging")

    override fun items(): List<ApiFlowEmailCampaign> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): WorkflowListEmailCampaignsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): WorkflowListEmailCampaignsPage =
        service.listEmailCampaigns(nextPageParams())

    fun autoPager(): AutoPager<ApiFlowEmailCampaign> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WorkflowListEmailCampaignsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseApiFlowEmailCampaign = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WorkflowListEmailCampaignsPage].
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

    /** A builder for [WorkflowListEmailCampaignsPage]. */
    class Builder internal constructor() {

        private var service: WorkflowService? = null
        private var params: WorkflowListEmailCampaignsParams? = null
        private var response: CollectionResponseApiFlowEmailCampaign? = null

        @JvmSynthetic
        internal fun from(workflowListEmailCampaignsPage: WorkflowListEmailCampaignsPage) = apply {
            service = workflowListEmailCampaignsPage.service
            params = workflowListEmailCampaignsPage.params
            response = workflowListEmailCampaignsPage.response
        }

        fun service(service: WorkflowService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WorkflowListEmailCampaignsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseApiFlowEmailCampaign) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WorkflowListEmailCampaignsPage].
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
        fun build(): WorkflowListEmailCampaignsPage =
            WorkflowListEmailCampaignsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkflowListEmailCampaignsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WorkflowListEmailCampaignsPage{service=$service, params=$params, response=$response}"
}
