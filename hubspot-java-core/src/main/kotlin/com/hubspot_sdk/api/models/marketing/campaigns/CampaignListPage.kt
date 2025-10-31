// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.marketing.CampaignService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CampaignService.list */
class CampaignListPage
private constructor(
    private val service: CampaignService,
    private val params: CampaignListParams,
    private val response: CollectionResponseWithTotalPublicCampaignForwardPaging,
) : Page<PublicCampaign> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicCampaignForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicCampaignForwardPaging.results
     */
    fun results(): List<PublicCampaign> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicCampaignForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicCampaignForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicCampaign> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): CampaignListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CampaignListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicCampaign> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicCampaignForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignListPage].
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

    /** A builder for [CampaignListPage]. */
    class Builder internal constructor() {

        private var service: CampaignService? = null
        private var params: CampaignListParams? = null
        private var response: CollectionResponseWithTotalPublicCampaignForwardPaging? = null

        @JvmSynthetic
        internal fun from(campaignListPage: CampaignListPage) = apply {
            service = campaignListPage.service
            params = campaignListPage.params
            response = campaignListPage.response
        }

        fun service(service: CampaignService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicCampaignForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CampaignListPage].
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
        fun build(): CampaignListPage =
            CampaignListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CampaignListPage{service=$service, params=$params, response=$response}"
}
