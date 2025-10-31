// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.partnerservices.associations

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.crm.AssociatedId
import com.hubspot_sdk.api.models.crm.CollectionResponseAssociatedId
import com.hubspot_sdk.api.models.marketing.emails.Paging
import com.hubspot_sdk.api.services.blocking.crm.objects.partnerservices.AssociationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AssociationService.list */
class AssociationListPage
private constructor(
    private val service: AssociationService,
    private val params: AssociationListParams,
    private val response: CollectionResponseAssociatedId,
) : Page<AssociatedId> {

    /**
     * Delegates to [CollectionResponseAssociatedId], but gracefully handles missing data.
     *
     * @see CollectionResponseAssociatedId.results
     */
    fun results(): List<AssociatedId> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseAssociatedId], but gracefully handles missing data.
     *
     * @see CollectionResponseAssociatedId.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<AssociatedId> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): AssociationListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): AssociationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AssociatedId> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AssociationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseAssociatedId = response

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
        private var response: CollectionResponseAssociatedId? = null

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
        fun response(response: CollectionResponseAssociatedId) = apply { this.response = response }

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
