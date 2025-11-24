// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.projects.associations

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.crm.AssociatedId
import com.hubspot_sdk.api.models.crm.CollectionResponseAssociatedId
import com.hubspot_sdk.api.services.async.crm.objects.projects.AssociationServiceAsync
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
    private val response: CollectionResponseAssociatedId,
) : PageAsync<AssociatedId> {

    /**
     * Delegates to [CollectionResponseAssociatedId], but gracefully handles missing data.
     *
     * @see CollectionResponseAssociatedId.results
     */
    fun results(): List<AssociatedId> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseAssociatedId], but gracefully handles missing data.
     *
     * @see CollectionResponseAssociatedId.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<AssociatedId> = results()

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

    fun autoPager(): AutoPagerAsync<AssociatedId> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AssociationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseAssociatedId = response

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
        private var response: CollectionResponseAssociatedId? = null

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
        fun response(response: CollectionResponseAssociatedId) = apply { this.response = response }

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
