// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns audit logs based on filters. */
class AuditLogListParams
private constructor(
    private val after: String?,
    private val before: String?,
    private val eventType: List<String>?,
    private val limit: Int?,
    private val objectId: List<String>?,
    private val objectType: List<String>?,
    private val sort: List<String>?,
    private val userId: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Timestamp after which audit logs will be returned */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Timestamp before which audit logs will be returned */
    fun before(): Optional<String> = Optional.ofNullable(before)

    /**
     * Comma separated list of event types to filter by (CREATED, UPDATED, PUBLISHED, DELETED,
     * UNPUBLISHED).
     */
    fun eventType(): Optional<List<String>> = Optional.ofNullable(eventType)

    /** The number of logs to return. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Comma separated list of object ids to filter by. */
    fun objectId(): Optional<List<String>> = Optional.ofNullable(objectId)

    /**
     * Comma separated list of object types to filter by (BLOG, LANDING_PAGE, DOMAIN, HUBDB_TABLE
     * etc.)
     */
    fun objectType(): Optional<List<String>> = Optional.ofNullable(objectType)

    /** The sort direction for the audit logs. (Can only sort by timestamp). */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Comma separated list of user ids to filter by. */
    fun userId(): Optional<List<String>> = Optional.ofNullable(userId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AuditLogListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AuditLogListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditLogListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var before: String? = null
        private var eventType: MutableList<String>? = null
        private var limit: Int? = null
        private var objectId: MutableList<String>? = null
        private var objectType: MutableList<String>? = null
        private var sort: MutableList<String>? = null
        private var userId: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(auditLogListParams: AuditLogListParams) = apply {
            after = auditLogListParams.after
            before = auditLogListParams.before
            eventType = auditLogListParams.eventType?.toMutableList()
            limit = auditLogListParams.limit
            objectId = auditLogListParams.objectId?.toMutableList()
            objectType = auditLogListParams.objectType?.toMutableList()
            sort = auditLogListParams.sort?.toMutableList()
            userId = auditLogListParams.userId?.toMutableList()
            additionalHeaders = auditLogListParams.additionalHeaders.toBuilder()
            additionalQueryParams = auditLogListParams.additionalQueryParams.toBuilder()
        }

        /** Timestamp after which audit logs will be returned */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Timestamp before which audit logs will be returned */
        fun before(before: String?) = apply { this.before = before }

        /** Alias for calling [Builder.before] with `before.orElse(null)`. */
        fun before(before: Optional<String>) = before(before.getOrNull())

        /**
         * Comma separated list of event types to filter by (CREATED, UPDATED, PUBLISHED, DELETED,
         * UNPUBLISHED).
         */
        fun eventType(eventType: List<String>?) = apply {
            this.eventType = eventType?.toMutableList()
        }

        /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
        fun eventType(eventType: Optional<List<String>>) = eventType(eventType.getOrNull())

        /**
         * Adds a single [String] to [Builder.eventType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventType(eventType: String) = apply {
            this.eventType = (this.eventType ?: mutableListOf()).apply { add(eventType) }
        }

        /** The number of logs to return. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /** Comma separated list of object ids to filter by. */
        fun objectId(objectId: List<String>?) = apply { this.objectId = objectId?.toMutableList() }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<List<String>>) = objectId(objectId.getOrNull())

        /**
         * Adds a single [String] to [Builder.objectId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectId(objectId: String) = apply {
            this.objectId = (this.objectId ?: mutableListOf()).apply { add(objectId) }
        }

        /**
         * Comma separated list of object types to filter by (BLOG, LANDING_PAGE, DOMAIN,
         * HUBDB_TABLE etc.)
         */
        fun objectType(objectType: List<String>?) = apply {
            this.objectType = objectType?.toMutableList()
        }

        /** Alias for calling [Builder.objectType] with `objectType.orElse(null)`. */
        fun objectType(objectType: Optional<List<String>>) = objectType(objectType.getOrNull())

        /**
         * Adds a single [String] to [Builder.objectType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectType(objectType: String) = apply {
            this.objectType = (this.objectType ?: mutableListOf()).apply { add(objectType) }
        }

        /** The sort direction for the audit logs. (Can only sort by timestamp). */
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

        /** Comma separated list of user ids to filter by. */
        fun userId(userId: List<String>?) = apply { this.userId = userId?.toMutableList() }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<List<String>>) = userId(userId.getOrNull())

        /**
         * Adds a single [String] to [Builder.userId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUserId(userId: String) = apply {
            this.userId = (this.userId ?: mutableListOf()).apply { add(userId) }
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
         * Returns an immutable instance of [AuditLogListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuditLogListParams =
            AuditLogListParams(
                after,
                before,
                eventType?.toImmutable(),
                limit,
                objectId?.toImmutable(),
                objectType?.toImmutable(),
                sort?.toImmutable(),
                userId?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                before?.let { put("before", it) }
                eventType?.let { put("eventType", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                objectId?.let { put("objectId", it.joinToString(",")) }
                objectType?.let { put("objectType", it.joinToString(",")) }
                sort?.let { put("sort", it.joinToString(",")) }
                userId?.let { put("userId", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditLogListParams &&
            after == other.after &&
            before == other.before &&
            eventType == other.eventType &&
            limit == other.limit &&
            objectId == other.objectId &&
            objectType == other.objectType &&
            sort == other.sort &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            before,
            eventType,
            limit,
            objectId,
            objectType,
            sort,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AuditLogListParams{after=$after, before=$before, eventType=$eventType, limit=$limit, objectId=$objectId, objectType=$objectType, sort=$sort, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
