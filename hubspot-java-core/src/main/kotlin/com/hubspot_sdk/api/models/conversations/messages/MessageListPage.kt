// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.messages

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.conversations.CollectionResponsePublicMessageForwardPaging
import com.hubspot_sdk.api.services.blocking.conversations.MessageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MessageService.list */
class MessageListPage
private constructor(
    private val service: MessageService,
    private val params: MessageListParams,
    private val response: CollectionResponsePublicMessageForwardPaging,
) : Page<CollectionResponsePublicMessageForwardPaging.Result> {

    /**
     * Delegates to [CollectionResponsePublicMessageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicMessageForwardPaging.results
     */
    fun results(): List<CollectionResponsePublicMessageForwardPaging.Result> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicMessageForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicMessageForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<CollectionResponsePublicMessageForwardPaging.Result> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): MessageListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): MessageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CollectionResponsePublicMessageForwardPaging.Result> =
        AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessageListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicMessageForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageListPage].
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

    /** A builder for [MessageListPage]. */
    class Builder internal constructor() {

        private var service: MessageService? = null
        private var params: MessageListParams? = null
        private var response: CollectionResponsePublicMessageForwardPaging? = null

        @JvmSynthetic
        internal fun from(messageListPage: MessageListPage) = apply {
            service = messageListPage.service
            params = messageListPage.params
            response = messageListPage.response
        }

        fun service(service: MessageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicMessageForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessageListPage].
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
        fun build(): MessageListPage =
            MessageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessageListPage{service=$service, params=$params, response=$response}"
}
