// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.auditlogs

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.services.blocking.cms.AuditLogService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AuditLogService.list */
class AuditLogListPage
private constructor(
    private val service: AuditLogService,
    private val params: AuditLogListParams,
    private val response: CollectionResponsePublicAuditLog,
) : Page<PublicAuditLog> {

    /**
     * Delegates to [CollectionResponsePublicAuditLog], but gracefully handles missing data.
     *
     * @see CollectionResponsePublicAuditLog.results
     */
    fun results(): List<PublicAuditLog> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponsePublicAuditLog], but gracefully handles missing data.
     *
     * @see CollectionResponsePublicAuditLog.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PublicAuditLog> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): AuditLogListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): AuditLogListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicAuditLog> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AuditLogListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponsePublicAuditLog = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuditLogListPage].
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

    /** A builder for [AuditLogListPage]. */
    class Builder internal constructor() {

        private var service: AuditLogService? = null
        private var params: AuditLogListParams? = null
        private var response: CollectionResponsePublicAuditLog? = null

        @JvmSynthetic
        internal fun from(auditLogListPage: AuditLogListPage) = apply {
            service = auditLogListPage.service
            params = auditLogListPage.params
            response = auditLogListPage.response
        }

        fun service(service: AuditLogService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AuditLogListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponsePublicAuditLog) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AuditLogListPage].
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
        fun build(): AuditLogListPage =
            AuditLogListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditLogListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AuditLogListPage{service=$service, params=$params, response=$response}"
}
