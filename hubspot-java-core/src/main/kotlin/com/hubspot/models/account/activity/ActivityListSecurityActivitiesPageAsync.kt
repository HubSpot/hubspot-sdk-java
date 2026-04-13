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

/** @see ActivityServiceAsync.listSecurityActivities */
class ActivityListSecurityActivitiesPageAsync
private constructor(
    private val service: ActivityServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ActivityListSecurityActivitiesParams,
    private val response: CollectionResponseHydratedCriticalActionForwardPaging,
) : PageAsync<HydratedCriticalAction> {

    /**
     * Delegates to [CollectionResponseHydratedCriticalActionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseHydratedCriticalActionForwardPaging.results
     */
    fun results(): List<HydratedCriticalAction> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseHydratedCriticalActionForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseHydratedCriticalActionForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<HydratedCriticalAction> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): ActivityListSecurityActivitiesParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ActivityListSecurityActivitiesPageAsync> =
        service.listSecurityActivities(nextPageParams())

    fun autoPager(): AutoPagerAsync<HydratedCriticalAction> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ActivityListSecurityActivitiesParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseHydratedCriticalActionForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActivityListSecurityActivitiesPageAsync].
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

    /** A builder for [ActivityListSecurityActivitiesPageAsync]. */
    class Builder internal constructor() {

        private var service: ActivityServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ActivityListSecurityActivitiesParams? = null
        private var response: CollectionResponseHydratedCriticalActionForwardPaging? = null

        @JvmSynthetic
        internal fun from(
            activityListSecurityActivitiesPageAsync: ActivityListSecurityActivitiesPageAsync
        ) = apply {
            service = activityListSecurityActivitiesPageAsync.service
            streamHandlerExecutor = activityListSecurityActivitiesPageAsync.streamHandlerExecutor
            params = activityListSecurityActivitiesPageAsync.params
            response = activityListSecurityActivitiesPageAsync.response
        }

        fun service(service: ActivityServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ActivityListSecurityActivitiesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseHydratedCriticalActionForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActivityListSecurityActivitiesPageAsync].
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
        fun build(): ActivityListSecurityActivitiesPageAsync =
            ActivityListSecurityActivitiesPageAsync(
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

        return other is ActivityListSecurityActivitiesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ActivityListSecurityActivitiesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
