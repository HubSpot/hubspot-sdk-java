// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.taxrates

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.services.async.settings.TaxRateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TaxRateServiceAsync.list */
class TaxRateListPageAsync
private constructor(
    private val service: TaxRateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TaxRateListParams,
    private val response: CollectionResponsePublicTaxRateGroupForwardPaging,
) : PageAsync<PublicTaxRateGroup> {

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

    override fun nextPage(): CompletableFuture<TaxRateListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicTaxRateGroup> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TaxRateListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicTaxRateGroupForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaxRateListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TaxRateListPageAsync]. */
    class Builder internal constructor() {

        private var service: TaxRateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TaxRateListParams? = null
        private var response: CollectionResponsePublicTaxRateGroupForwardPaging? = null

        @JvmSynthetic
        internal fun from(taxRateListPageAsync: TaxRateListPageAsync) = apply {
            service = taxRateListPageAsync.service
            streamHandlerExecutor = taxRateListPageAsync.streamHandlerExecutor
            params = taxRateListPageAsync.params
            response = taxRateListPageAsync.response
        }

        fun service(service: TaxRateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TaxRateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicTaxRateGroupForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TaxRateListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TaxRateListPageAsync =
            TaxRateListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaxRateListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TaxRateListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
