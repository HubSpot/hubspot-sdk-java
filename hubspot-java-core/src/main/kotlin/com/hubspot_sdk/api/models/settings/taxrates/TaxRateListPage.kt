// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.taxrates

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.blocking.settings.TaxRateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TaxRateService.list */
class TaxRateListPage
private constructor(
    private val service: TaxRateService,
    private val params: TaxRateListParams,
    private val response: CollectionResponsePublicTaxRateGroupForwardPaging,
) : Page<PublicTaxRateGroup> {

    /**
     * Delegates to [CollectionResponsePublicTaxRateGroupForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicTaxRateGroupForwardPaging.results
     */
    fun results(): List<PublicTaxRateGroup> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicTaxRateGroupForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicTaxRateGroupForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicTaxRateGroup> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): TaxRateListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): TaxRateListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicTaxRateGroup> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TaxRateListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicTaxRateGroupForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaxRateListPage].
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

    /** A builder for [TaxRateListPage]. */
    class Builder internal constructor() {

        private var service: TaxRateService? = null
        private var params: TaxRateListParams? = null
        private var response: CollectionResponsePublicTaxRateGroupForwardPaging? = null

        @JvmSynthetic
        internal fun from(taxRateListPage: TaxRateListPage) = apply {
            service = taxRateListPage.service
            params = taxRateListPage.params
            response = taxRateListPage.response
        }

        fun service(service: TaxRateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TaxRateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicTaxRateGroupForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TaxRateListPage].
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
        fun build(): TaxRateListPage =
            TaxRateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaxRateListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TaxRateListPage{service=$service, params=$params, response=$response}"
}
