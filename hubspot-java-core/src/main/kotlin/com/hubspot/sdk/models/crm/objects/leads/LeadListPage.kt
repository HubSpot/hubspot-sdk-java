// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.leads

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.services.blocking.crm.objects.LeadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LeadService.list */
class LeadListPage
private constructor(
    private val service: LeadService,
    private val params: LeadListParams,
    private val response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging,
) : Page<SimplePublicObjectWithAssociations> {

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.results
     */
    fun results(): List<SimplePublicObjectWithAssociations> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociationsForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<SimplePublicObjectWithAssociations> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): LeadListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): LeadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SimplePublicObjectWithAssociations> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LeadListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSimplePublicObjectWithAssociationsForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LeadListPage].
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

    /** A builder for [LeadListPage]. */
    class Builder internal constructor() {

        private var service: LeadService? = null
        private var params: LeadListParams? = null
        private var response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(leadListPage: LeadListPage) = apply {
            service = leadListPage.service
            params = leadListPage.params
            response = leadListPage.response
        }

        fun service(service: LeadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LeadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSimplePublicObjectWithAssociationsForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [LeadListPage].
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
        fun build(): LeadListPage =
            LeadListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LeadListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "LeadListPage{service=$service, params=$params, response=$response}"
}
