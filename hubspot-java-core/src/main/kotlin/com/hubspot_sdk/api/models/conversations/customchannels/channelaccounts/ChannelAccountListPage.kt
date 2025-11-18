// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicChannelAccountForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicChannelAccount
import com.hubspot_sdk.api.services.blocking.conversations.customchannels.ChannelAccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ChannelAccountService.list */
class ChannelAccountListPage
private constructor(
    private val service: ChannelAccountService,
    private val params: ChannelAccountListParams,
    private val response: CollectionResponseWithTotalPublicChannelAccountForwardPaging,
) : Page<PublicChannelAccount> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelAccountForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelAccountForwardPaging.results
     */
    fun results(): List<PublicChannelAccount> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelAccountForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelAccountForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicChannelAccount> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ChannelAccountListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ChannelAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicChannelAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ChannelAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicChannelAccountForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChannelAccountListPage].
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

    /** A builder for [ChannelAccountListPage]. */
    class Builder internal constructor() {

        private var service: ChannelAccountService? = null
        private var params: ChannelAccountListParams? = null
        private var response: CollectionResponseWithTotalPublicChannelAccountForwardPaging? = null

        @JvmSynthetic
        internal fun from(channelAccountListPage: ChannelAccountListPage) = apply {
            service = channelAccountListPage.service
            params = channelAccountListPage.params
            response = channelAccountListPage.response
        }

        fun service(service: ChannelAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ChannelAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicChannelAccountForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [ChannelAccountListPage].
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
        fun build(): ChannelAccountListPage =
            ChannelAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelAccountListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ChannelAccountListPage{service=$service, params=$params, response=$response}"
}
