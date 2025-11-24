// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.channels

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicChannel
import com.hubspot_sdk.api.services.blocking.conversations.ChannelService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ChannelService.list */
class ChannelListPage
private constructor(
    private val service: ChannelService,
    private val params: ChannelListParams,
    private val response: CollectionResponseWithTotalPublicChannelForwardPaging,
) : Page<PublicChannel> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelForwardPaging.results
     */
    fun results(): List<PublicChannel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicChannel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ChannelListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ChannelListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicChannel> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ChannelListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicChannelForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelListPage].
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

    /** A builder for [ChannelListPage]. */
    class Builder internal constructor() {

        private var service: ChannelService? = null
        private var params: ChannelListParams? = null
        private var response: CollectionResponseWithTotalPublicChannelForwardPaging? = null

        @JvmSynthetic
        internal fun from(channelListPage: ChannelListPage) = apply {
            service = channelListPage.service
            params = channelListPage.params
            response = channelListPage.response
        }

        fun service(service: ChannelService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicChannelForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ChannelListPage].
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
        fun build(): ChannelListPage =
            ChannelListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ChannelListPage{service=$service, params=$params, response=$response}"
}
