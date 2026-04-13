// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns.metrics

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.marketing.campaigns.CollectionResponseContactReferenceForwardPaging
import com.hubspot.models.marketing.campaigns.ContactReference
import com.hubspot.services.blocking.marketing.campaigns.MetricService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MetricService.listContactIdsByType */
class MetricListContactIdsByTypePage
private constructor(
    private val service: MetricService,
    private val params: MetricListContactIdsByTypeParams,
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

    fun nextPageParams(): MetricListContactIdsByTypeParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): MetricListContactIdsByTypePage =
        service.listContactIdsByType(nextPageParams())

    fun autoPager(): AutoPager<ContactReference> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MetricListContactIdsByTypeParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseContactReferenceForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MetricListContactIdsByTypePage].
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

    /** A builder for [MetricListContactIdsByTypePage]. */
    class Builder internal constructor() {

        private var service: MetricService? = null
        private var params: MetricListContactIdsByTypeParams? = null
        private var response: CollectionResponseContactReferenceForwardPaging? = null

        @JvmSynthetic
        internal fun from(metricListContactIdsByTypePage: MetricListContactIdsByTypePage) = apply {
            service = metricListContactIdsByTypePage.service
            params = metricListContactIdsByTypePage.params
            response = metricListContactIdsByTypePage.response
        }

        fun service(service: MetricService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MetricListContactIdsByTypeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseContactReferenceForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MetricListContactIdsByTypePage].
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
        fun build(): MetricListContactIdsByTypePage =
            MetricListContactIdsByTypePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricListContactIdsByTypePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MetricListContactIdsByTypePage{service=$service, params=$params, response=$response}"
}
