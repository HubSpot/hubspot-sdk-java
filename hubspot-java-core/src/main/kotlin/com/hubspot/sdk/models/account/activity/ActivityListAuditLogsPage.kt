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

/** @see ActivityService.listAuditLogs */
class ActivityListAuditLogsPage
private constructor(
    private val service: ActivityService,
    private val params: ActivityListAuditLogsParams,
    private val response: CollectionResponsePublicApiUserActionEventForwardPaging,
) : Page<PublicApiUserActionEvent> {

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

    override fun nextPage(): ActivityListAuditLogsPage = service.listAuditLogs(nextPageParams())

    fun autoPager(): AutoPager<PublicApiUserActionEvent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ActivityListAuditLogsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicApiUserActionEventForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ActivityListAuditLogsPage].
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

    /** A builder for [ActivityListAuditLogsPage]. */
    class Builder internal constructor() {

        private var service: ActivityService? = null
        private var params: ActivityListAuditLogsParams? = null
        private var response: CollectionResponsePublicApiUserActionEventForwardPaging? = null

        @JvmSynthetic
        internal fun from(activityListAuditLogsPage: ActivityListAuditLogsPage) = apply {
            service = activityListAuditLogsPage.service
            params = activityListAuditLogsPage.params
            response = activityListAuditLogsPage.response
        }

        fun service(service: ActivityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ActivityListAuditLogsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicApiUserActionEventForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ActivityListAuditLogsPage].
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
        fun build(): ActivityListAuditLogsPage =
            ActivityListAuditLogsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActivityListAuditLogsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ActivityListAuditLogsPage{service=$service, params=$params, response=$response}"
}
