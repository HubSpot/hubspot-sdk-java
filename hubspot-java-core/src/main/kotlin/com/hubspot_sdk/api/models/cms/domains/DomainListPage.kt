// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.domains

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.cms.DomainService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DomainService.list */
class DomainListPage
private constructor(
    private val service: DomainService,
    private val params: DomainListParams,
    private val response: CollectionResponseWithTotalDomainForwardPaging,
) : Page<Domain> {

    /**
     * Delegates to [CollectionResponseWithTotalDomainForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalDomainForwardPaging.results
     */
    fun results(): List<Domain> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalDomainForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponseWithTotalDomainForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<Domain> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): DomainListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): DomainListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Domain> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DomainListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalDomainForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DomainListPage].
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

    /** A builder for [DomainListPage]. */
    class Builder internal constructor() {

        private var service: DomainService? = null
        private var params: DomainListParams? = null
        private var response: CollectionResponseWithTotalDomainForwardPaging? = null

        @JvmSynthetic
        internal fun from(domainListPage: DomainListPage) = apply {
            service = domainListPage.service
            params = domainListPage.params
            response = domainListPage.response
        }

        fun service(service: DomainService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DomainListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalDomainForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DomainListPage].
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
        fun build(): DomainListPage =
            DomainListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DomainListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "DomainListPage{service=$service, params=$params, response=$response}"
}
