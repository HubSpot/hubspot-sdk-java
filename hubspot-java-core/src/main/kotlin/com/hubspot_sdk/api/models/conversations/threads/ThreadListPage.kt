// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponsePublicThreadForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicThread
import com.hubspot_sdk.api.services.blocking.conversations.ThreadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ThreadService.list */
class ThreadListPage
private constructor(
    private val service: ThreadService,
    private val params: ThreadListParams,
    private val response: CollectionResponsePublicThreadForwardPaging,
) : Page<PublicThread> {

    /**
     * Delegates to [CollectionResponsePublicThreadForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicThreadForwardPaging.results
     */
    fun results(): List<PublicThread> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicThreadForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicThreadForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicThread> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ThreadListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ThreadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicThread> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ThreadListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicThreadForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadListPage].
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

    /** A builder for [ThreadListPage]. */
    class Builder internal constructor() {

        private var service: ThreadService? = null
        private var params: ThreadListParams? = null
        private var response: CollectionResponsePublicThreadForwardPaging? = null

        @JvmSynthetic
        internal fun from(threadListPage: ThreadListPage) = apply {
            service = threadListPage.service
            params = threadListPage.params
            response = threadListPage.response
        }

        fun service(service: ThreadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ThreadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicThreadForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ThreadListPage].
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
        fun build(): ThreadListPage =
            ThreadListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ThreadListPage{service=$service, params=$params, response=$response}"
}
