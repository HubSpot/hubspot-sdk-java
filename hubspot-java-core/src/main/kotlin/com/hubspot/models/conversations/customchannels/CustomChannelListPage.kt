// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.services.blocking.conversations.CustomChannelService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CustomChannelService.list */
class CustomChannelListPage
private constructor(
    private val service: CustomChannelService,
    private val params: CustomChannelListParams,
    private val response: CollectionResponseWithTotalPublicChannelIntegrationChannel,
) : Page<PublicChannelIntegrationChannel> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelIntegrationChannel], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelIntegrationChannel.results
     */
    fun results(): List<PublicChannelIntegrationChannel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicChannelIntegrationChannel], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseWithTotalPublicChannelIntegrationChannel.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PublicChannelIntegrationChannel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): CustomChannelListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CustomChannelListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicChannelIntegrationChannel> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomChannelListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicChannelIntegrationChannel = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomChannelListPage].
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

    /** A builder for [CustomChannelListPage]. */
    class Builder internal constructor() {

        private var service: CustomChannelService? = null
        private var params: CustomChannelListParams? = null
        private var response: CollectionResponseWithTotalPublicChannelIntegrationChannel? = null

        @JvmSynthetic
        internal fun from(customChannelListPage: CustomChannelListPage) = apply {
            service = customChannelListPage.service
            params = customChannelListPage.params
            response = customChannelListPage.response
        }

        fun service(service: CustomChannelService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomChannelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicChannelIntegrationChannel) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomChannelListPage].
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
        fun build(): CustomChannelListPage =
            CustomChannelListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChannelListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomChannelListPage{service=$service, params=$params, response=$response}"
}
