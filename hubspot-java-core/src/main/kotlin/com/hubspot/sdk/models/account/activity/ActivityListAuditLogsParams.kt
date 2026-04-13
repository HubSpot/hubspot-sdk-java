// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve activity history for user actions related to approvals, content updates, CRM object
 * updates, security activity, and more (Enterprise only). Learn more about
 * [activities included in audit log exports](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history-in-a-centralized-audit-log?hubs_content=knowledge.hubspot.com/account-management/view-and-export-account-activity-history&hubs_content-cta=centralized%20audit%20log#data-included-in-the-centralized-audit-log).
 */
class ActivityListAuditLogsParams
private constructor(
    private val actingUserId: List<Int>?,
    private val after: String?,
    private val fillFinalTimestamp: Boolean?,
    private val limit: Int?,
    private val occurredAfter: OffsetDateTime?,
    private val occurredBefore: OffsetDateTime?,
    private val sort: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun actingUserId(): Optional<List<Int>> = Optional.ofNullable(actingUserId)

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    fun fillFinalTimestamp(): Optional<Boolean> = Optional.ofNullable(fillFinalTimestamp)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    fun occurredAfter(): Optional<OffsetDateTime> = Optional.ofNullable(occurredAfter)

    fun occurredBefore(): Optional<OffsetDateTime> = Optional.ofNullable(occurredBefore)

    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActivityListAuditLogsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ActivityListAuditLogsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActivityListAuditLogsParams]. */
    class Builder internal constructor() {

        private var actingUserId: MutableList<Int>? = null
        private var after: String? = null
        private var fillFinalTimestamp: Boolean? = null
        private var limit: Int? = null
        private var occurredAfter: OffsetDateTime? = null
        private var occurredBefore: OffsetDateTime? = null
        private var sort: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(activityListAuditLogsParams: ActivityListAuditLogsParams) = apply {
            actingUserId = activityListAuditLogsParams.actingUserId?.toMutableList()
            after = activityListAuditLogsParams.after
            fillFinalTimestamp = activityListAuditLogsParams.fillFinalTimestamp
            limit = activityListAuditLogsParams.limit
            occurredAfter = activityListAuditLogsParams.occurredAfter
            occurredBefore = activityListAuditLogsParams.occurredBefore
            sort = activityListAuditLogsParams.sort?.toMutableList()
            additionalHeaders = activityListAuditLogsParams.additionalHeaders.toBuilder()
            additionalQueryParams = activityListAuditLogsParams.additionalQueryParams.toBuilder()
        }

        fun actingUserId(actingUserId: List<Int>?) = apply {
            this.actingUserId = actingUserId?.toMutableList()
        }

        /** Alias for calling [Builder.actingUserId] with `actingUserId.orElse(null)`. */
        fun actingUserId(actingUserId: Optional<List<Int>>) = actingUserId(actingUserId.getOrNull())

        /**
         * Adds a single [Int] to [Builder.actingUserId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActingUserId(actingUserId: Int) = apply {
            this.actingUserId = (this.actingUserId ?: mutableListOf()).apply { add(actingUserId) }
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        fun fillFinalTimestamp(fillFinalTimestamp: Boolean?) = apply {
            this.fillFinalTimestamp = fillFinalTimestamp
        }

        /**
         * Alias for [Builder.fillFinalTimestamp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fillFinalTimestamp(fillFinalTimestamp: Boolean) =
            fillFinalTimestamp(fillFinalTimestamp as Boolean?)

        /**
         * Alias for calling [Builder.fillFinalTimestamp] with `fillFinalTimestamp.orElse(null)`.
         */
        fun fillFinalTimestamp(fillFinalTimestamp: Optional<Boolean>) =
            fillFinalTimestamp(fillFinalTimestamp.getOrNull())

        /** The maximum number of results to display per page. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        fun occurredAfter(occurredAfter: OffsetDateTime?) = apply {
            this.occurredAfter = occurredAfter
        }

        /** Alias for calling [Builder.occurredAfter] with `occurredAfter.orElse(null)`. */
        fun occurredAfter(occurredAfter: Optional<OffsetDateTime>) =
            occurredAfter(occurredAfter.getOrNull())

        fun occurredBefore(occurredBefore: OffsetDateTime?) = apply {
            this.occurredBefore = occurredBefore
        }

        /** Alias for calling [Builder.occurredBefore] with `occurredBefore.orElse(null)`. */
        fun occurredBefore(occurredBefore: Optional<OffsetDateTime>) =
            occurredBefore(occurredBefore.getOrNull())

        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ActivityListAuditLogsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActivityListAuditLogsParams =
            ActivityListAuditLogsParams(
                actingUserId?.toImmutable(),
                after,
                fillFinalTimestamp,
                limit,
                occurredAfter,
                occurredBefore,
                sort?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                actingUserId?.let { put("actingUserId", it.joinToString(",") { it.toString() }) }
                after?.let { put("after", it) }
                fillFinalTimestamp?.let { put("fillFinalTimestamp", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                occurredAfter?.let {
                    put("occurredAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                occurredBefore?.let {
                    put("occurredBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                sort?.let { put("sort", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActivityListAuditLogsParams &&
            actingUserId == other.actingUserId &&
            after == other.after &&
            fillFinalTimestamp == other.fillFinalTimestamp &&
            limit == other.limit &&
            occurredAfter == other.occurredAfter &&
            occurredBefore == other.occurredBefore &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            actingUserId,
            after,
            fillFinalTimestamp,
            limit,
            occurredAfter,
            occurredBefore,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ActivityListAuditLogsParams{actingUserId=$actingUserId, after=$after, fillFinalTimestamp=$fillFinalTimestamp, limit=$limit, occurredAfter=$occurredAfter, occurredBefore=$occurredBefore, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
