// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.tables

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.models.cms.hubdb.CollectionResponseWithTotalHubDbTableV3
import com.hubspot.models.cms.hubdb.HubDbTableV3
import com.hubspot.services.blocking.cms.hubdb.TableService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TableService.listDraft */
class TableListDraftPage
private constructor(
    private val service: TableService,
    private val params: TableListDraftParams,
    private val response: CollectionResponseWithTotalHubDbTableV3,
) : Page<HubDbTableV3> {

    /**
     * Delegates to [CollectionResponseWithTotalHubDbTableV3], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalHubDbTableV3.results
     */
    fun results(): List<HubDbTableV3> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalHubDbTableV3], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalHubDbTableV3.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<HubDbTableV3> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): TableListDraftParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): TableListDraftPage = service.listDraft(nextPageParams())

    fun autoPager(): AutoPager<HubDbTableV3> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TableListDraftParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalHubDbTableV3 = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TableListDraftPage].
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

    /** A builder for [TableListDraftPage]. */
    class Builder internal constructor() {

        private var service: TableService? = null
        private var params: TableListDraftParams? = null
        private var response: CollectionResponseWithTotalHubDbTableV3? = null

        @JvmSynthetic
        internal fun from(tableListDraftPage: TableListDraftPage) = apply {
            service = tableListDraftPage.service
            params = tableListDraftPage.params
            response = tableListDraftPage.response
        }

        fun service(service: TableService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TableListDraftParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalHubDbTableV3) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TableListDraftPage].
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
        fun build(): TableListDraftPage =
            TableListDraftPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TableListDraftPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TableListDraftPage{service=$service, params=$params, response=$response}"
}
