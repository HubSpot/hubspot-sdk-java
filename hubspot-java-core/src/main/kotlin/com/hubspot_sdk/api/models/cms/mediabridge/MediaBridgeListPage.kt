// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.cms.MediaBridgeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MediaBridgeService.list */
class MediaBridgeListPage
private constructor(
    private val service: MediaBridgeService,
    private val params: MediaBridgeListParams,
    private val response: CollectionResponseMediaBridgeObjectForwardPaging,
) : Page<MediaBridgeObject> {

    /**
     * Delegates to [CollectionResponseMediaBridgeObjectForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMediaBridgeObjectForwardPaging.results
     */
    fun results(): List<MediaBridgeObject> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMediaBridgeObjectForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMediaBridgeObjectForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<MediaBridgeObject> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): MediaBridgeListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): MediaBridgeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MediaBridgeObject> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MediaBridgeListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMediaBridgeObjectForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MediaBridgeListPage].
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

    /** A builder for [MediaBridgeListPage]. */
    class Builder internal constructor() {

        private var service: MediaBridgeService? = null
        private var params: MediaBridgeListParams? = null
        private var response: CollectionResponseMediaBridgeObjectForwardPaging? = null

        @JvmSynthetic
        internal fun from(mediaBridgeListPage: MediaBridgeListPage) = apply {
            service = mediaBridgeListPage.service
            params = mediaBridgeListPage.params
            response = mediaBridgeListPage.response
        }

        fun service(service: MediaBridgeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MediaBridgeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMediaBridgeObjectForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MediaBridgeListPage].
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
        fun build(): MediaBridgeListPage =
            MediaBridgeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MediaBridgeListPage{service=$service, params=$params, response=$response}"
}
