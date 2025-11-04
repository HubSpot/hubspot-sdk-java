// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.hubspot_sdk.api.core.AutoPagerAsync
import com.hubspot_sdk.api.core.PageAsync
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.services.async.account.ActivityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ActivityServiceAsync.listLoginActivities */
class ActivityListLoginActivitiesPageAsync
private constructor(
    private val service: ActivityServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ActivityListLoginActivitiesParams,
    private val response: CollectionResponsePublicLoginAuditForwardPaging,
) : PageAsync<PublicLoginAudit> {

    /**
     * Delegates to [CollectionResponsePublicLoginAuditForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicLoginAuditForwardPaging.results
     */
    fun results(): List<PublicLoginAudit> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicLoginAuditForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponsePublicLoginAuditForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicLoginAudit> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ActivityListLoginActivitiesParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ActivityListLoginActivitiesPageAsync> =
        service.listLoginActivities(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicLoginAudit> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ActivityListLoginActivitiesParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicLoginAuditForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActivityListLoginActivitiesPageAsync].
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

    /** A builder for [ActivityListLoginActivitiesPageAsync]. */
    class Builder internal constructor() {

        private var service: ActivityServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ActivityListLoginActivitiesParams? = null
        private var response: CollectionResponsePublicLoginAuditForwardPaging? = null

        @JvmSynthetic
        internal fun from(
            activityListLoginActivitiesPageAsync: ActivityListLoginActivitiesPageAsync
        ) = apply {
            service = activityListLoginActivitiesPageAsync.service
            streamHandlerExecutor = activityListLoginActivitiesPageAsync.streamHandlerExecutor
            params = activityListLoginActivitiesPageAsync.params
            response = activityListLoginActivitiesPageAsync.response
        }

        fun service(service: ActivityServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ActivityListLoginActivitiesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicLoginAuditForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActivityListLoginActivitiesPageAsync].
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
        fun build(): ActivityListLoginActivitiesPageAsync =
            ActivityListLoginActivitiesPageAsync(
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

        return other is ActivityListLoginActivitiesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ActivityListLoginActivitiesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
