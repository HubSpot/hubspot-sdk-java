// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.imports

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.services.blocking.crm.ImportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ImportService.list */
class ImportListPage
private constructor(
    private val service: ImportService,
    private val params: ImportListParams,
    private val response: CollectionResponsePublicImportResponseForwardPaging,
) : Page<PublicImportResponse> {

    /**
     * Delegates to [CollectionResponsePublicImportResponseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportResponseForwardPaging.results
     */
    fun results(): List<PublicImportResponse> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicImportResponseForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportResponseForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicImportResponse> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ImportListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ImportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicImportResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ImportListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicImportResponseForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ImportListPage].
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

    /** A builder for [ImportListPage]. */
    class Builder internal constructor() {

        private var service: ImportService? = null
        private var params: ImportListParams? = null
        private var response: CollectionResponsePublicImportResponseForwardPaging? = null

        @JvmSynthetic
        internal fun from(importListPage: ImportListPage) = apply {
            service = importListPage.service
            params = importListPage.params
            response = importListPage.response
        }

        fun service(service: ImportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ImportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicImportResponseForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ImportListPage].
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
        fun build(): ImportListPage =
            ImportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ImportListPage{service=$service, params=$params, response=$response}"
}
