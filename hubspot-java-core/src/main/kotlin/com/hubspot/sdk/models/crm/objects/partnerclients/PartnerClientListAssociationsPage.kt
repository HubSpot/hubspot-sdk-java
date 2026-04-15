// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.partnerclients

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.crm.CollectionResponseMultiAssociatedObjectWithLabelForwardPaging
import com.hubspot.sdk.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot.sdk.services.blocking.crm.objects.PartnerClientService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PartnerClientService.listAssociations */
class PartnerClientListAssociationsPage
private constructor(
    private val service: PartnerClientService,
    private val params: PartnerClientListAssociationsParams,
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

    fun nextPageParams(): PartnerClientListAssociationsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): PartnerClientListAssociationsPage =
        service.listAssociations(nextPageParams())

    fun autoPager(): AutoPager<MultiAssociatedObjectWithLabel> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PartnerClientListAssociationsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMultiAssociatedObjectWithLabelForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PartnerClientListAssociationsPage].
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

    /** A builder for [PartnerClientListAssociationsPage]. */
    class Builder internal constructor() {

        private var service: PartnerClientService? = null
        private var params: PartnerClientListAssociationsParams? = null
        private var response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging? = null

        @JvmSynthetic
        internal fun from(partnerClientListAssociationsPage: PartnerClientListAssociationsPage) =
            apply {
                service = partnerClientListAssociationsPage.service
                params = partnerClientListAssociationsPage.params
                response = partnerClientListAssociationsPage.response
            }

        fun service(service: PartnerClientService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerClientListAssociationsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [PartnerClientListAssociationsPage].
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
        fun build(): PartnerClientListAssociationsPage =
            PartnerClientListAssociationsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerClientListAssociationsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PartnerClientListAssociationsPage{service=$service, params=$params, response=$response}"
}
