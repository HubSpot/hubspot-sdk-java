// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associations

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.models.crm.CollectionResponseMultiAssociatedObjectWithLabelForwardPaging
import com.hubspot.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot.services.async.crm.AssociationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AssociationServiceAsync.list */
class AssociationListPageAsync
private constructor(
    private val service: AssociationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AssociationListParams,
    private val response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging,
) : PageAsync<MultiAssociatedObjectWithLabel> {

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabelForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.results
     */
    fun results(): List<MultiAssociatedObjectWithLabel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabelForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<MultiAssociatedObjectWithLabel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): AssociationListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AssociationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MultiAssociatedObjectWithLabel> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AssociationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMultiAssociatedObjectWithLabelForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssociationListPageAsync].
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

    /** A builder for [AssociationListPageAsync]. */
    class Builder internal constructor() {

        private var service: AssociationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AssociationListParams? = null
        private var response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging? = null

        @JvmSynthetic
        internal fun from(associationListPageAsync: AssociationListPageAsync) = apply {
            service = associationListPageAsync.service
            streamHandlerExecutor = associationListPageAsync.streamHandlerExecutor
            params = associationListPageAsync.params
            response = associationListPageAsync.response
        }

        fun service(service: AssociationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AssociationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMultiAssociatedObjectWithLabelForwardPaging) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [AssociationListPageAsync].
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
        fun build(): AssociationListPageAsync =
            AssociationListPageAsync(
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

        return other is AssociationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AssociationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
