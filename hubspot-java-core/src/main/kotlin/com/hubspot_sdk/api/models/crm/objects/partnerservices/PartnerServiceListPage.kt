// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.partnerservices

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.services.blocking.crm.objects.PartnerServiceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PartnerServiceService.list */
class PartnerServiceListPage
private constructor(
    private val service: PartnerServiceService,
    private val params: PartnerServiceListParams,
    private val response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging,
) : Page<MultiAssociatedObjectWithLabel> {

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabelForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.results
     */
    fun results(): List<MultiAssociatedObjectWithLabel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabelForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<MultiAssociatedObjectWithLabel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): PartnerServiceListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): PartnerServiceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MultiAssociatedObjectWithLabel> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PartnerServiceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMultiAssociatedObjectWithLabelForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PartnerServiceListPage].
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

    /** A builder for [PartnerServiceListPage]. */
    class Builder internal constructor() {

        private var service: PartnerServiceService? = null
        private var params: PartnerServiceListParams? = null
        private var response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging? = null

        @JvmSynthetic
        internal fun from(partnerServiceListPage: PartnerServiceListPage) = apply {
            service = partnerServiceListPage.service
            params = partnerServiceListPage.params
            response = partnerServiceListPage.response
        }

        fun service(service: PartnerServiceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerServiceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [PartnerServiceListPage].
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
        fun build(): PartnerServiceListPage =
            PartnerServiceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerServiceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PartnerServiceListPage{service=$service, params=$params, response=$response}"
}
