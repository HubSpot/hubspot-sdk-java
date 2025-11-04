// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.reports

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponseContactReferenceForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.ContactReference
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.ReportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ReportService.listContactIdsByType */
class ReportListContactIdsByTypePage
private constructor(
    private val service: ReportService,
    private val params: ReportListContactIdsByTypeParams,
    private val response: CollectionResponseContactReferenceForwardPaging,
) : Page<ContactReference> {

    /**
     * Delegates to [CollectionResponseContactReferenceForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseContactReferenceForwardPaging.results
     */
    fun results(): List<ContactReference> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseContactReferenceForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseContactReferenceForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ContactReference> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ReportListContactIdsByTypeParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ReportListContactIdsByTypePage =
        service.listContactIdsByType(nextPageParams())

    fun autoPager(): AutoPager<ContactReference> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportListContactIdsByTypeParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseContactReferenceForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportListContactIdsByTypePage].
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

    /** A builder for [ReportListContactIdsByTypePage]. */
    class Builder internal constructor() {

        private var service: ReportService? = null
        private var params: ReportListContactIdsByTypeParams? = null
        private var response: CollectionResponseContactReferenceForwardPaging? = null

        @JvmSynthetic
        internal fun from(reportListContactIdsByTypePage: ReportListContactIdsByTypePage) = apply {
            service = reportListContactIdsByTypePage.service
            params = reportListContactIdsByTypePage.params
            response = reportListContactIdsByTypePage.response
        }

        fun service(service: ReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListContactIdsByTypeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseContactReferenceForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportListContactIdsByTypePage].
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
        fun build(): ReportListContactIdsByTypePage =
            ReportListContactIdsByTypePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListContactIdsByTypePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ReportListContactIdsByTypePage{service=$service, params=$params, response=$response}"
}
