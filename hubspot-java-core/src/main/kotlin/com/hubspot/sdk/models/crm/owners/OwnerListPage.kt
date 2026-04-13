// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.owners

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.services.blocking.crm.OwnerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see OwnerService.list */
class OwnerListPage
private constructor(
    private val service: OwnerService,
    private val params: OwnerListParams,
    private val response: CollectionResponsePublicOwnerForwardPaging,
) : Page<PublicOwner> {

    /**
     * Delegates to [CollectionResponsePublicOwnerForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicOwnerForwardPaging.results
     */
    fun results(): List<PublicOwner> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicOwnerForwardPaging], but gracefully handles missing
     * data.
     *
     * @see CollectionResponsePublicOwnerForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicOwner> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): OwnerListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): OwnerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicOwner> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OwnerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicOwnerForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OwnerListPage].
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

    /** A builder for [OwnerListPage]. */
    class Builder internal constructor() {

        private var service: OwnerService? = null
        private var params: OwnerListParams? = null
        private var response: CollectionResponsePublicOwnerForwardPaging? = null

        @JvmSynthetic
        internal fun from(ownerListPage: OwnerListPage) = apply {
            service = ownerListPage.service
            params = ownerListPage.params
            response = ownerListPage.response
        }

        fun service(service: OwnerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OwnerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicOwnerForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OwnerListPage].
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
        fun build(): OwnerListPage =
            OwnerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OwnerListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "OwnerListPage{service=$service, params=$params, response=$response}"
}
