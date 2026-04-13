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

/** @see ActivityService.listLoginActivities */
class ActivityListLoginActivitiesPage
private constructor(
    private val service: ActivityService,
    private val params: ActivityListLoginActivitiesParams,
    private val response: CollectionResponsePublicLoginAuditForwardPaging,
) : Page<PublicLoginAudit> {

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

    override fun nextPage(): ActivityListLoginActivitiesPage =
        service.listLoginActivities(nextPageParams())

    fun autoPager(): AutoPager<PublicLoginAudit> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActivityListLoginActivitiesParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicLoginAuditForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActivityListLoginActivitiesPage].
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

    /** A builder for [ActivityListLoginActivitiesPage]. */
    class Builder internal constructor() {

        private var service: ActivityService? = null
        private var params: ActivityListLoginActivitiesParams? = null
        private var response: CollectionResponsePublicLoginAuditForwardPaging? = null

        @JvmSynthetic
        internal fun from(activityListLoginActivitiesPage: ActivityListLoginActivitiesPage) =
            apply {
                service = activityListLoginActivitiesPage.service
                params = activityListLoginActivitiesPage.params
                response = activityListLoginActivitiesPage.response
            }

        fun service(service: ActivityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActivityListLoginActivitiesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicLoginAuditForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActivityListLoginActivitiesPage].
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
        fun build(): ActivityListLoginActivitiesPage =
            ActivityListLoginActivitiesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActivityListLoginActivitiesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ActivityListLoginActivitiesPage{service=$service, params=$params, response=$response}"
}
