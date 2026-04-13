// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings.basic

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.scheduler.meetings.CollectionResponseWithTotalExternalLinkMetadata
import com.hubspot.sdk.models.scheduler.meetings.ExternalLinkMetadata
import com.hubspot.sdk.services.blocking.scheduler.meetings.BasicService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BasicService.list */
class BasicListPage
private constructor(
    private val service: BasicService,
    private val params: BasicListParams,
    private val response: CollectionResponseWithTotalExternalLinkMetadata,
) : Page<ExternalLinkMetadata> {

    /**
     * Delegates to [CollectionResponseWithTotalExternalLinkMetadata], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalExternalLinkMetadata.results
     */
    fun results(): List<ExternalLinkMetadata> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalExternalLinkMetadata], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalExternalLinkMetadata.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ExternalLinkMetadata> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): BasicListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): BasicListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalLinkMetadata> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BasicListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalLinkMetadata = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BasicListPage].
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

    /** A builder for [BasicListPage]. */
    class Builder internal constructor() {

        private var service: BasicService? = null
        private var params: BasicListParams? = null
        private var response: CollectionResponseWithTotalExternalLinkMetadata? = null

        @JvmSynthetic
        internal fun from(basicListPage: BasicListPage) = apply {
            service = basicListPage.service
            params = basicListPage.params
            response = basicListPage.response
        }

        fun service(service: BasicService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BasicListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalLinkMetadata) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BasicListPage].
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
        fun build(): BasicListPage =
            BasicListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BasicListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "BasicListPage{service=$service, params=$params, response=$response}"
}
