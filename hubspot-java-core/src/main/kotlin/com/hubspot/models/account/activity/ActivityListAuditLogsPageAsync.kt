// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.account.activity

import com.hubspot.core.AutoPagerAsync
import com.hubspot.core.PageAsync
import com.hubspot.core.checkRequired
import com.hubspot.models.ForwardPaging
import com.hubspot.services.async.account.ActivityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ActivityServiceAsync.listAuditLogs */
class ActivityListAuditLogsPageAsync
private constructor(
    private val service: ActivityServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ActivityListAuditLogsParams,
    private val response: CollectionResponsePublicApiUserActionEventForwardPaging,
) : PageAsync<PublicApiUserActionEvent> {

    /**
     * Delegates to [CollectionResponsePublicApiUserActionEventForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponsePublicApiUserActionEventForwardPaging.results
     */
    fun results(): List<PublicApiUserActionEvent> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicApiUserActionEventForwardPaging], but gracefully
     * handles missing data.
     *
     * @see CollectionResponsePublicApiUserActionEventForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<PublicApiUserActionEvent> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ActivityListAuditLogsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ActivityListAuditLogsPageAsync> =
        service.listAuditLogs(nextPageParams())

    fun autoPager(): AutoPagerAsync<PublicApiUserActionEvent> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ActivityListAuditLogsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicApiUserActionEventForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActivityListAuditLogsPageAsync].
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

    /** A builder for [ActivityListAuditLogsPageAsync]. */
    class Builder internal constructor() {

        private var service: ActivityServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ActivityListAuditLogsParams? = null
        private var response: CollectionResponsePublicApiUserActionEventForwardPaging? = null

        @JvmSynthetic
        internal fun from(activityListAuditLogsPageAsync: ActivityListAuditLogsPageAsync) = apply {
            service = activityListAuditLogsPageAsync.service
            streamHandlerExecutor = activityListAuditLogsPageAsync.streamHandlerExecutor
            params = activityListAuditLogsPageAsync.params
            response = activityListAuditLogsPageAsync.response
        }

        fun service(service: ActivityServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ActivityListAuditLogsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicApiUserActionEventForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActivityListAuditLogsPageAsync].
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
        fun build(): ActivityListAuditLogsPageAsync =
            ActivityListAuditLogsPageAsync(
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

        return other is ActivityListAuditLogsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ActivityListAuditLogsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
