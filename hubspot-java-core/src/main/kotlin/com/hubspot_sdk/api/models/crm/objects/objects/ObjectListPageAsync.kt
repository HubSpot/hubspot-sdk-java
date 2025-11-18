// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.objects

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.crm.CollectionResponseSimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.services.async.crm.objects.ObjectServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ObjectServiceAsync.list */
class ObjectListPageAsync
private constructor(
    private val service: ObjectServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ObjectListParams,
    private val response: CollectionResponseSimplePublicObjectWithAssociations,
) : PageAsync<SimplePublicObjectWithAssociations> {

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociations], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociations.results
     */
    fun results(): List<SimplePublicObjectWithAssociations> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSimplePublicObjectWithAssociations], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSimplePublicObjectWithAssociations.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<SimplePublicObjectWithAssociations> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ObjectListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ObjectListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplePublicObjectWithAssociations> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ObjectListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSimplePublicObjectWithAssociations = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObjectListPageAsync].
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

    /** A builder for [ObjectListPageAsync]. */
    class Builder internal constructor() {

        private var service: ObjectServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ObjectListParams? = null
        private var response: CollectionResponseSimplePublicObjectWithAssociations? = null

        @JvmSynthetic
        internal fun from(objectListPageAsync: ObjectListPageAsync) = apply {
            service = objectListPageAsync.service
            streamHandlerExecutor = objectListPageAsync.streamHandlerExecutor
            params = objectListPageAsync.params
            response = objectListPageAsync.response
        }

        fun service(service: ObjectServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ObjectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSimplePublicObjectWithAssociations) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ObjectListPageAsync].
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
        fun build(): ObjectListPageAsync =
            ObjectListPageAsync(
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

        return other is ObjectListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ObjectListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
