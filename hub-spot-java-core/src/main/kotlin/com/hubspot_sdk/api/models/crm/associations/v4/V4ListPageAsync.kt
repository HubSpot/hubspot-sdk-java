// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.crm.CollectionResponseMultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.marketing.emails.Paging
import com.hubspot_sdk.api.services.async.crm.associations.V4ServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see V4ServiceAsync.list */
class V4ListPageAsync
private constructor(
    private val service: V4ServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: V4ListParams,
    private val response: CollectionResponseMultiAssociatedObjectWithLabel,
) : PageAsync<MultiAssociatedObjectWithLabel> {

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabel], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabel.results
     */
    fun results(): List<MultiAssociatedObjectWithLabel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabel], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabel.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<MultiAssociatedObjectWithLabel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): V4ListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<V4ListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MultiAssociatedObjectWithLabel> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): V4ListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMultiAssociatedObjectWithLabel = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V4ListPageAsync].
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

    /** A builder for [V4ListPageAsync]. */
    class Builder internal constructor() {

        private var service: V4ServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: V4ListParams? = null
        private var response: CollectionResponseMultiAssociatedObjectWithLabel? = null

        @JvmSynthetic
        internal fun from(v4ListPageAsync: V4ListPageAsync) = apply {
            service = v4ListPageAsync.service
            streamHandlerExecutor = v4ListPageAsync.streamHandlerExecutor
            params = v4ListPageAsync.params
            response = v4ListPageAsync.response
        }

        fun service(service: V4ServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: V4ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMultiAssociatedObjectWithLabel) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [V4ListPageAsync].
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
        fun build(): V4ListPageAsync =
            V4ListPageAsync(
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

        return other is V4ListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "V4ListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
