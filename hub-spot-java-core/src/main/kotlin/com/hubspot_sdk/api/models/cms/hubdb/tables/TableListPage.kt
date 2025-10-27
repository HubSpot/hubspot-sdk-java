// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.tables

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.cms.hubdb.CollectionResponseWithTotalHubDbTableV3ForwardPaging
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3
import com.hubspot_sdk.api.services.blocking.cms.hubdb.TableService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TableService.list */
class TableListPage
private constructor(
    private val service: TableService,
    private val params: TableListParams,
    private val response: CollectionResponseWithTotalHubDbTableV3ForwardPaging,
) : Page<HubDbTableV3> {

    /**
     * Delegates to [CollectionResponseWithTotalHubDbTableV3ForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalHubDbTableV3ForwardPaging.results
     */
    fun results(): List<HubDbTableV3> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalHubDbTableV3ForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseWithTotalHubDbTableV3ForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<HubDbTableV3> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): TableListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): TableListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<HubDbTableV3> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TableListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalHubDbTableV3ForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TableListPage].
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

    /** A builder for [TableListPage]. */
    class Builder internal constructor() {

        private var service: TableService? = null
        private var params: TableListParams? = null
        private var response: CollectionResponseWithTotalHubDbTableV3ForwardPaging? = null

        @JvmSynthetic
        internal fun from(tableListPage: TableListPage) = apply {
            service = tableListPage.service
            params = tableListPage.params
            response = tableListPage.response
        }

        fun service(service: TableService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TableListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalHubDbTableV3ForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TableListPage].
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
        fun build(): TableListPage =
            TableListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TableListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TableListPage{service=$service, params=$params, response=$response}"
}
