// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.marketing.CampaignServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CampaignServiceAsync.list */
class CampaignListPageAsync
private constructor(
    private val service: CampaignServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CampaignListParams,
    private val response: CollectionResponseWithTotalPublicCampaignForwardPaging,
) : PageAsync<PublicCampaign> {

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

    override fun nextPage(): CompletableFuture<CampaignListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicCampaign> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicCampaignForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignListPageAsync].
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

    /** A builder for [CampaignListPageAsync]. */
    class Builder internal constructor() {

        private var service: CampaignServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CampaignListParams? = null
        private var response: CollectionResponseWithTotalPublicCampaignForwardPaging? = null

        @JvmSynthetic
        internal fun from(campaignListPageAsync: CampaignListPageAsync) = apply {
            service = campaignListPageAsync.service
            streamHandlerExecutor = campaignListPageAsync.streamHandlerExecutor
            params = campaignListPageAsync.params
            response = campaignListPageAsync.response
        }

        fun service(service: CampaignServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicCampaignForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CampaignListPageAsync].
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
        fun build(): CampaignListPageAsync =
            CampaignListPageAsync(
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

        return other is CampaignListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CampaignListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
