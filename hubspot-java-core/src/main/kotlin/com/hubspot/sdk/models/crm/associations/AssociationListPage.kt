// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associations

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.crm.CollectionResponseMultiAssociatedObjectWithLabelForwardPaging
import com.hubspot.sdk.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot.sdk.services.blocking.crm.AssociationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AssociationService.list */
class AssociationListPage
private constructor(
    private val service: AssociationService,
    private val params: AssociationListParams,
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

    fun nextPageParams(): AssociationListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): AssociationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MultiAssociatedObjectWithLabel> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AssociationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMultiAssociatedObjectWithLabelForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssociationListPage].
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

    /** A builder for [AssociationListPage]. */
    class Builder internal constructor() {

        private var service: AssociationService? = null
        private var params: AssociationListParams? = null
        private var response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging? = null

        @JvmSynthetic
        internal fun from(associationListPage: AssociationListPage) = apply {
            service = associationListPage.service
            params = associationListPage.params
            response = associationListPage.response
        }

        fun service(service: AssociationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AssociationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [AssociationListPage].
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
        fun build(): AssociationListPage =
            AssociationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssociationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AssociationListPage{service=$service, params=$params, response=$response}"
}
