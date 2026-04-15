// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.imports

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.services.blocking.crm.ImportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ImportService.listErrors */
class ImportListErrorsPage
private constructor(
    private val service: ImportService,
    private val params: ImportListErrorsParams,
    private val response: CollectionResponsePublicImportErrorForwardPaging,
) : Page<PublicImportError> {

    /**
     * Delegates to [CollectionResponsePublicImportErrorForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportErrorForwardPaging.results
     */
    fun results(): List<PublicImportError> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicImportErrorForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicImportErrorForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicImportError> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ImportListErrorsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): ImportListErrorsPage = service.listErrors(nextPageParams())

    fun autoPager(): AutoPager<PublicImportError> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ImportListErrorsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicImportErrorForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ImportListErrorsPage].
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

    /** A builder for [ImportListErrorsPage]. */
    class Builder internal constructor() {

        private var service: ImportService? = null
        private var params: ImportListErrorsParams? = null
        private var response: CollectionResponsePublicImportErrorForwardPaging? = null

        @JvmSynthetic
        internal fun from(importListErrorsPage: ImportListErrorsPage) = apply {
            service = importListErrorsPage.service
            params = importListErrorsPage.params
            response = importListErrorsPage.response
        }

        fun service(service: ImportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ImportListErrorsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicImportErrorForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ImportListErrorsPage].
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
        fun build(): ImportListErrorsPage =
            ImportListErrorsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportListErrorsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ImportListErrorsPage{service=$service, params=$params, response=$response}"
}
