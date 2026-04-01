// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.blocking.crm.ListService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ListService.getMembershipsJoinOrder */
class ListGetMembershipsJoinOrderPage
private constructor(
    private val service: ListService,
    private val params: ListGetMembershipsJoinOrderParams,
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
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ListGetMembershipsJoinOrderParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ListGetMembershipsJoinOrderPage =
        service.getMembershipsJoinOrder(nextPageParams())

    fun autoPager(): AutoPager<JoinTimeAndRecordId> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ListGetMembershipsJoinOrderParams = params

    /** The response that this page was parsed from. */
    fun response(): ApiCollectionResponseJoinTimeAndRecordId = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ListGetMembershipsJoinOrderPage].
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

    /** A builder for [ListGetMembershipsJoinOrderPage]. */
    class Builder internal constructor() {

        private var service: ListService? = null
        private var params: ListGetMembershipsJoinOrderParams? = null
        private var response: ApiCollectionResponseJoinTimeAndRecordId? = null

        @JvmSynthetic
        internal fun from(listGetMembershipsJoinOrderPage: ListGetMembershipsJoinOrderPage) =
            apply {
                service = listGetMembershipsJoinOrderPage.service
                params = listGetMembershipsJoinOrderPage.params
                response = listGetMembershipsJoinOrderPage.response
            }

        fun service(service: ListService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ListGetMembershipsJoinOrderParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ApiCollectionResponseJoinTimeAndRecordId) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ListGetMembershipsJoinOrderPage].
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
        fun build(): ListGetMembershipsJoinOrderPage =
            ListGetMembershipsJoinOrderPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListGetMembershipsJoinOrderPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ListGetMembershipsJoinOrderPage{service=$service, params=$params, response=$response}"
}
