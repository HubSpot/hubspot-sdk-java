// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns.metrics

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.marketing.campaigns.CollectionResponseContactReferenceForwardPaging
import com.hubspot.sdk.models.marketing.campaigns.ContactReference
import com.hubspot.sdk.services.async.marketing.campaigns.MetricServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MetricServiceAsync.listContactIdsByType */
class MetricListContactIdsByTypePageAsync
private constructor(
    private val service: MetricServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MetricListContactIdsByTypeParams,
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

    fun nextPageParams(): MetricListContactIdsByTypeParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MetricListContactIdsByTypePageAsync> =
        service.listContactIdsByType(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContactReference> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MetricListContactIdsByTypeParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseContactReferenceForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MetricListContactIdsByTypePageAsync].
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

    /** A builder for [MetricListContactIdsByTypePageAsync]. */
    class Builder internal constructor() {

        private var service: MetricServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MetricListContactIdsByTypeParams? = null
        private var response: CollectionResponseContactReferenceForwardPaging? = null

        @JvmSynthetic
        internal fun from(
            metricListContactIdsByTypePageAsync: MetricListContactIdsByTypePageAsync
        ) = apply {
            service = metricListContactIdsByTypePageAsync.service
            streamHandlerExecutor = metricListContactIdsByTypePageAsync.streamHandlerExecutor
            params = metricListContactIdsByTypePageAsync.params
            response = metricListContactIdsByTypePageAsync.response
        }

        fun service(service: MetricServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MetricListContactIdsByTypeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseContactReferenceForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MetricListContactIdsByTypePageAsync].
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
        fun build(): MetricListContactIdsByTypePageAsync =
            MetricListContactIdsByTypePageAsync(
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

        return other is MetricListContactIdsByTypePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MetricListContactIdsByTypePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
