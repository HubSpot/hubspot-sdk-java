// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve logs of user actions related to
 * [security activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#security-activity-history).
 */
class ActivityListSecurityActivitiesParams
private constructor(
    private val after: String?,
    private val fromTimestamp: Long?,
    private val limit: Int?,
    private val toTimestamp: Long?,
    private val userId: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    fun fromTimestamp(): Optional<Long> = Optional.ofNullable(fromTimestamp)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    fun toTimestamp(): Optional<Long> = Optional.ofNullable(toTimestamp)

    fun userId(): Optional<Int> = Optional.ofNullable(userId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActivityListSecurityActivitiesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActivityListSecurityActivitiesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActivityListSecurityActivitiesParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var fromTimestamp: Long? = null
        private var limit: Int? = null
        private var toTimestamp: Long? = null
        private var userId: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            activityListSecurityActivitiesParams: ActivityListSecurityActivitiesParams
        ) = apply {
            after = activityListSecurityActivitiesParams.after
            fromTimestamp = activityListSecurityActivitiesParams.fromTimestamp
            limit = activityListSecurityActivitiesParams.limit
            toTimestamp = activityListSecurityActivitiesParams.toTimestamp
            userId = activityListSecurityActivitiesParams.userId
            additionalHeaders = activityListSecurityActivitiesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                activityListSecurityActivitiesParams.additionalQueryParams.toBuilder()
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        fun fromTimestamp(fromTimestamp: Long?) = apply { this.fromTimestamp = fromTimestamp }

        /**
         * Alias for [Builder.fromTimestamp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fromTimestamp(fromTimestamp: Long) = fromTimestamp(fromTimestamp as Long?)

        /** Alias for calling [Builder.fromTimestamp] with `fromTimestamp.orElse(null)`. */
        fun fromTimestamp(fromTimestamp: Optional<Long>) = fromTimestamp(fromTimestamp.getOrNull())

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

        fun toTimestamp(toTimestamp: Long?) = apply { this.toTimestamp = toTimestamp }

        /**
         * Alias for [Builder.toTimestamp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun toTimestamp(toTimestamp: Long) = toTimestamp(toTimestamp as Long?)

        /** Alias for calling [Builder.toTimestamp] with `toTimestamp.orElse(null)`. */
        fun toTimestamp(toTimestamp: Optional<Long>) = toTimestamp(toTimestamp.getOrNull())

        fun userId(userId: Int?) = apply { this.userId = userId }

        /**
         * Alias for [Builder.userId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun userId(userId: Int) = userId(userId as Int?)

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<Int>) = userId(userId.getOrNull())

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
         * Returns an immutable instance of [ActivityListSecurityActivitiesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActivityListSecurityActivitiesParams =
            ActivityListSecurityActivitiesParams(
                after,
                fromTimestamp,
                limit,
                toTimestamp,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                fromTimestamp?.let { put("fromTimestamp", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                toTimestamp?.let { put("toTimestamp", it.toString()) }
                userId?.let { put("userId", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActivityListSecurityActivitiesParams &&
            after == other.after &&
            fromTimestamp == other.fromTimestamp &&
            limit == other.limit &&
            toTimestamp == other.toTimestamp &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            fromTimestamp,
            limit,
            toTimestamp,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ActivityListSecurityActivitiesParams{after=$after, fromTimestamp=$fromTimestamp, limit=$limit, toTimestamp=$toTimestamp, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
