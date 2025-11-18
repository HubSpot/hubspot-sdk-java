// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.automation.SequenceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SequenceServiceAsync.list */
class SequenceListPageAsync
private constructor(
    private val service: SequenceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SequenceListParams,
    private val response: CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging,
) : PageAsync<PublicSequenceLiteResponse> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.results
     */
    fun results(): List<PublicSequenceLiteResponse> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicSequenceLiteResponse> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SequenceListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SequenceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicSequenceLiteResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SequenceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SequenceListPageAsync].
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

    /** A builder for [SequenceListPageAsync]. */
    class Builder internal constructor() {

        private var service: SequenceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SequenceListParams? = null
        private var response: CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging? =
            null

        @JvmSynthetic
        internal fun from(sequenceListPageAsync: SequenceListPageAsync) = apply {
            service = sequenceListPageAsync.service
            streamHandlerExecutor = sequenceListPageAsync.streamHandlerExecutor
            params = sequenceListPageAsync.params
            response = sequenceListPageAsync.response
        }

        fun service(service: SequenceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SequenceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [SequenceListPageAsync].
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
        fun build(): SequenceListPageAsync =
            SequenceListPageAsync(
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

        return other is SequenceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SequenceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
