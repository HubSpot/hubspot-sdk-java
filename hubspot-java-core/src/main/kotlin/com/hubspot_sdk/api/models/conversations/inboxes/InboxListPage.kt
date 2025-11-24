// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.inboxes

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponseWithTotalPublicInboxForwardPaging
import com.hubspot_sdk.api.models.conversations.PublicInbox
import com.hubspot_sdk.api.services.blocking.conversations.InboxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InboxService.list */
class InboxListPage
private constructor(
    private val service: InboxService,
    private val params: InboxListParams,
    private val response: CollectionResponseWithTotalPublicInboxForwardPaging,
) : Page<PublicInbox> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicInboxForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicInboxForwardPaging.results
     */
    fun results(): List<PublicInbox> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicInboxForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalPublicInboxForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicInbox> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): InboxListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): InboxListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicInbox> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicInboxForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboxListPage].
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

    /** A builder for [InboxListPage]. */
    class Builder internal constructor() {

        private var service: InboxService? = null
        private var params: InboxListParams? = null
        private var response: CollectionResponseWithTotalPublicInboxForwardPaging? = null

        @JvmSynthetic
        internal fun from(inboxListPage: InboxListPage) = apply {
            service = inboxListPage.service
            params = inboxListPage.params
            response = inboxListPage.response
        }

        fun service(service: InboxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicInboxForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboxListPage].
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
        fun build(): InboxListPage =
            InboxListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboxListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "InboxListPage{service=$service, params=$params, response=$response}"
}
