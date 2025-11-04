// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.reports

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponseContactReferenceForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.ContactReference
import com.hubspot_sdk.api.services.async.marketing.campaigns.ReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ReportServiceAsync.listContactIdsByType */
class ReportListContactIdsByTypePageAsync
private constructor(
    private val service: ReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReportListContactIdsByTypeParams,
    private val response: CollectionResponseContactReferenceForwardPaging,
) : PageAsync<ContactReference> {

    /**
     * Delegates to [CollectionResponseContactReferenceForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseContactReferenceForwardPaging.results
     */
    fun results(): List<ContactReference> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseContactReferenceForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseContactReferenceForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<ContactReference> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ReportListContactIdsByTypeParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ReportListContactIdsByTypePageAsync> =
        service.listContactIdsByType(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContactReference> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReportListContactIdsByTypeParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseContactReferenceForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportListContactIdsByTypePageAsync].
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

    /** A builder for [ReportListContactIdsByTypePageAsync]. */
    class Builder internal constructor() {

        private var service: ReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReportListContactIdsByTypeParams? = null
        private var response: CollectionResponseContactReferenceForwardPaging? = null

        @JvmSynthetic
        internal fun from(
            reportListContactIdsByTypePageAsync: ReportListContactIdsByTypePageAsync
        ) = apply {
            service = reportListContactIdsByTypePageAsync.service
            streamHandlerExecutor = reportListContactIdsByTypePageAsync.streamHandlerExecutor
            params = reportListContactIdsByTypePageAsync.params
            response = reportListContactIdsByTypePageAsync.response
        }

        fun service(service: ReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListContactIdsByTypeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseContactReferenceForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportListContactIdsByTypePageAsync].
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
        fun build(): ReportListContactIdsByTypePageAsync =
            ReportListContactIdsByTypePageAsync(
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

        return other is ReportListContactIdsByTypePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ReportListContactIdsByTypePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
