// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.memberships

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.crm.lists.ApiCollectionResponseJoinTimeAndRecordId
import com.hubspot_sdk.api.models.crm.lists.JoinTimeAndRecordId
import com.hubspot_sdk.api.models.marketing.emails.Paging
import com.hubspot_sdk.api.services.blocking.crm.lists.MembershipService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MembershipService.getPageOrderedByAddedToListDate */
class MembershipGetPageOrderedByAddedToListDatePage
private constructor(
    private val service: MembershipService,
    private val params: MembershipGetPageOrderedByAddedToListDateParams,
    private val response: ApiCollectionResponseJoinTimeAndRecordId,
) : Page<JoinTimeAndRecordId> {

    /**
     * Delegates to [ApiCollectionResponseJoinTimeAndRecordId], but gracefully handles missing data.
     *
     * @see ApiCollectionResponseJoinTimeAndRecordId.results
     */
    fun results(): List<JoinTimeAndRecordId> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [ApiCollectionResponseJoinTimeAndRecordId], but gracefully handles missing data.
     *
     * @see ApiCollectionResponseJoinTimeAndRecordId.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<JoinTimeAndRecordId> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): MembershipGetPageOrderedByAddedToListDateParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): MembershipGetPageOrderedByAddedToListDatePage =
        service.getPageOrderedByAddedToListDate(nextPageParams())

    fun autoPager(): AutoPager<JoinTimeAndRecordId> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MembershipGetPageOrderedByAddedToListDateParams = params

    /** The response that this page was parsed from. */
    fun response(): ApiCollectionResponseJoinTimeAndRecordId = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MembershipGetPageOrderedByAddedToListDatePage].
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

    /** A builder for [MembershipGetPageOrderedByAddedToListDatePage]. */
    class Builder internal constructor() {

        private var service: MembershipService? = null
        private var params: MembershipGetPageOrderedByAddedToListDateParams? = null
        private var response: ApiCollectionResponseJoinTimeAndRecordId? = null

        @JvmSynthetic
        internal fun from(
            membershipGetPageOrderedByAddedToListDatePage:
                MembershipGetPageOrderedByAddedToListDatePage
        ) = apply {
            service = membershipGetPageOrderedByAddedToListDatePage.service
            params = membershipGetPageOrderedByAddedToListDatePage.params
            response = membershipGetPageOrderedByAddedToListDatePage.response
        }

        fun service(service: MembershipService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MembershipGetPageOrderedByAddedToListDateParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: ApiCollectionResponseJoinTimeAndRecordId) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MembershipGetPageOrderedByAddedToListDatePage].
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
        fun build(): MembershipGetPageOrderedByAddedToListDatePage =
            MembershipGetPageOrderedByAddedToListDatePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MembershipGetPageOrderedByAddedToListDatePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MembershipGetPageOrderedByAddedToListDatePage{service=$service, params=$params, response=$response}"
}
