// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

import com.hubspot.sdk.core.AutoPager
import com.hubspot.sdk.core.Page
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.services.blocking.account.ActivityService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ActivityService.listSecurityActivities */
class ActivityListSecurityActivitiesPage
private constructor(
    private val service: ActivityService,
    private val params: ActivityListSecurityActivitiesParams,
    private val response: CollectionResponseHydratedCriticalActionForwardPaging,
) : Page<HydratedCriticalAction> {

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

    override fun nextPage(): ActivityListSecurityActivitiesPage =
        service.listSecurityActivities(nextPageParams())

    fun autoPager(): AutoPager<HydratedCriticalAction> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActivityListSecurityActivitiesParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseHydratedCriticalActionForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActivityListSecurityActivitiesPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActivityListSecurityActivitiesPage]. */
    class Builder internal constructor() {

        private var service: ActivityService? = null
        private var params: ActivityListSecurityActivitiesParams? = null
        private var response: CollectionResponseHydratedCriticalActionForwardPaging? = null

        @JvmSynthetic
        internal fun from(activityListSecurityActivitiesPage: ActivityListSecurityActivitiesPage) =
            apply {
                service = activityListSecurityActivitiesPage.service
                params = activityListSecurityActivitiesPage.params
                response = activityListSecurityActivitiesPage.response
            }

        fun service(service: ActivityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActivityListSecurityActivitiesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseHydratedCriticalActionForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActivityListSecurityActivitiesPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActivityListSecurityActivitiesPage =
            ActivityListSecurityActivitiesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActivityListSecurityActivitiesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ActivityListSecurityActivitiesPage{service=$service, params=$params, response=$response}"
}
