// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.threads

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of threads, with optional filters and sorting. */
class ThreadListParams
private constructor(
    private val after: String?,
    private val archived: Boolean?,
    private val associatedContactId: Long?,
    private val association: List<Association>?,
    private val inboxId: List<Int>?,
    private val latestMessageTimestampAfter: OffsetDateTime?,
    private val limit: Int?,
    private val property: String?,
    private val sort: List<String>?,
    private val threadStatus: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /**
     * Retrieve a filtered list of conversations for a specific contact by its ID. This parameter
     * cannot be used in conjunction with the `inboxId` property.
     */
    fun associatedContactId(): Optional<Long> = Optional.ofNullable(associatedContactId)

    /**
     * You can specify an association type here of `TICKET`. If this is set the response will
     * included a thread associations object and associated ticket id if present. If there are no
     * associations to a ticket with this conversation, then the thread associations object will not
     * be present on the response.
     */
    fun association(): Optional<List<Association>> = Optional.ofNullable(association)

    /**
     * The ID of the conversations inbox you can optionally include to retrieve the associated
     * messages for. This parameter cannot be used in conjunction with the `associatedContactId`
     * property.
     */
    fun inboxId(): Optional<List<Int>> = Optional.ofNullable(inboxId)

    /**
     * The minimum(earliest) `latestMessageTimestamp`. This is required only when sorting by
     * `latestMessageTimestamp`.
     */
    fun latestMessageTimestampAfter(): Optional<OffsetDateTime> =
        Optional.ofNullable(latestMessageTimestampAfter)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** A specific property to include in the thread response. */
    fun property(): Optional<String> = Optional.ofNullable(property)

    /**
     * Set the sort order of the response. Valid options are `id` (default) and
     * `latestMessageTimestamp` (which requires the `latestMessageTimestampAfter` field to also be
     * set). If you’re filtering threads by `associatedContactId` , you can sort in descending order
     * by prepending - to the sort option (e.g., `-id` or `-latestMessageTimestampAfter` ).
     * Otherwise, results are always returned in ascending order.
     */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /**
     * The status of the associated conversations to filter by (either `OPEN` or `CLOSED`). This
     * property must be provided if you’re including the `associatedContactId` query parameter.
     */
    fun threadStatus(): Optional<String> = Optional.ofNullable(threadStatus)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ThreadListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ThreadListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var archived: Boolean? = null
        private var associatedContactId: Long? = null
        private var association: MutableList<Association>? = null
        private var inboxId: MutableList<Int>? = null
        private var latestMessageTimestampAfter: OffsetDateTime? = null
        private var limit: Int? = null
        private var property: String? = null
        private var sort: MutableList<String>? = null
        private var threadStatus: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(threadListParams: ThreadListParams) = apply {
            after = threadListParams.after
            archived = threadListParams.archived
            associatedContactId = threadListParams.associatedContactId
            association = threadListParams.association?.toMutableList()
            inboxId = threadListParams.inboxId?.toMutableList()
            latestMessageTimestampAfter = threadListParams.latestMessageTimestampAfter
            limit = threadListParams.limit
            property = threadListParams.property
            sort = threadListParams.sort?.toMutableList()
            threadStatus = threadListParams.threadStatus
            additionalHeaders = threadListParams.additionalHeaders.toBuilder()
            additionalQueryParams = threadListParams.additionalQueryParams.toBuilder()
        }

        /**
         * The paging cursor token of the last successfully read resource will be returned as the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Whether to return only results that have been archived. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /**
         * Retrieve a filtered list of conversations for a specific contact by its ID. This
         * parameter cannot be used in conjunction with the `inboxId` property.
         */
        fun associatedContactId(associatedContactId: Long?) = apply {
            this.associatedContactId = associatedContactId
        }

        /**
         * Alias for [Builder.associatedContactId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun associatedContactId(associatedContactId: Long) =
            associatedContactId(associatedContactId as Long?)

        /**
         * Alias for calling [Builder.associatedContactId] with `associatedContactId.orElse(null)`.
         */
        fun associatedContactId(associatedContactId: Optional<Long>) =
            associatedContactId(associatedContactId.getOrNull())

        /**
         * You can specify an association type here of `TICKET`. If this is set the response will
         * included a thread associations object and associated ticket id if present. If there are
         * no associations to a ticket with this conversation, then the thread associations object
         * will not be present on the response.
         */
        fun association(association: List<Association>?) = apply {
            this.association = association?.toMutableList()
        }

        /** Alias for calling [Builder.association] with `association.orElse(null)`. */
        fun association(association: Optional<List<Association>>) =
            association(association.getOrNull())

        /**
         * Adds a single [Association] to [Builder.association].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: Association) = apply {
            this.association = (this.association ?: mutableListOf()).apply { add(association) }
        }

        /**
         * The ID of the conversations inbox you can optionally include to retrieve the associated
         * messages for. This parameter cannot be used in conjunction with the `associatedContactId`
         * property.
         */
        fun inboxId(inboxId: List<Int>?) = apply { this.inboxId = inboxId?.toMutableList() }

        /** Alias for calling [Builder.inboxId] with `inboxId.orElse(null)`. */
        fun inboxId(inboxId: Optional<List<Int>>) = inboxId(inboxId.getOrNull())

        /**
         * Adds a single [Int] to [Builder.inboxId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInboxId(inboxId: Int) = apply {
            this.inboxId = (this.inboxId ?: mutableListOf()).apply { add(inboxId) }
        }

        /**
         * The minimum(earliest) `latestMessageTimestamp`. This is required only when sorting by
         * `latestMessageTimestamp`.
         */
        fun latestMessageTimestampAfter(latestMessageTimestampAfter: OffsetDateTime?) = apply {
            this.latestMessageTimestampAfter = latestMessageTimestampAfter
        }

        /**
         * Alias for calling [Builder.latestMessageTimestampAfter] with
         * `latestMessageTimestampAfter.orElse(null)`.
         */
        fun latestMessageTimestampAfter(latestMessageTimestampAfter: Optional<OffsetDateTime>) =
            latestMessageTimestampAfter(latestMessageTimestampAfter.getOrNull())

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

        /** A specific property to include in the thread response. */
        fun property(property: String?) = apply { this.property = property }

        /** Alias for calling [Builder.property] with `property.orElse(null)`. */
        fun property(property: Optional<String>) = property(property.getOrNull())

        /**
         * Set the sort order of the response. Valid options are `id` (default) and
         * `latestMessageTimestamp` (which requires the `latestMessageTimestampAfter` field to also
         * be set). If you’re filtering threads by `associatedContactId` , you can sort in
         * descending order by prepending - to the sort option (e.g., `-id` or
         * `-latestMessageTimestampAfter` ). Otherwise, results are always returned in ascending
         * order.
         */
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

        /**
         * The status of the associated conversations to filter by (either `OPEN` or `CLOSED`). This
         * property must be provided if you’re including the `associatedContactId` query parameter.
         */
        fun threadStatus(threadStatus: String?) = apply { this.threadStatus = threadStatus }

        /** Alias for calling [Builder.threadStatus] with `threadStatus.orElse(null)`. */
        fun threadStatus(threadStatus: Optional<String>) = threadStatus(threadStatus.getOrNull())

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
         * Returns an immutable instance of [ThreadListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThreadListParams =
            ThreadListParams(
                after,
                archived,
                associatedContactId,
                association?.toImmutable(),
                inboxId?.toImmutable(),
                latestMessageTimestampAfter,
                limit,
                property,
                sort?.toImmutable(),
                threadStatus,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                archived?.let { put("archived", it.toString()) }
                associatedContactId?.let { put("associatedContactId", it.toString()) }
                association?.let { put("association", it.joinToString(",") { it.toString() }) }
                inboxId?.let { put("inboxId", it.joinToString(",") { it.toString() }) }
                latestMessageTimestampAfter?.let {
                    put(
                        "latestMessageTimestampAfter",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                limit?.let { put("limit", it.toString()) }
                property?.let { put("property", it) }
                sort?.let { put("sort", it.joinToString(",")) }
                threadStatus?.let { put("threadStatus", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Association @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TICKET = of("TICKET")

            @JvmStatic fun of(value: String) = Association(JsonField.of(value))
        }

        /** An enum containing [Association]'s known values. */
        enum class Known {
            TICKET
        }

        /**
         * An enum containing [Association]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Association] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TICKET,
            /**
             * An enum member indicating that [Association] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TICKET -> Value.TICKET
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TICKET -> Known.TICKET
                else -> throw HubspotInvalidDataException("Unknown Association: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Association = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubspotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Association && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadListParams &&
            after == other.after &&
            archived == other.archived &&
            associatedContactId == other.associatedContactId &&
            association == other.association &&
            inboxId == other.inboxId &&
            latestMessageTimestampAfter == other.latestMessageTimestampAfter &&
            limit == other.limit &&
            property == other.property &&
            sort == other.sort &&
            threadStatus == other.threadStatus &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            archived,
            associatedContactId,
            association,
            inboxId,
            latestMessageTimestampAfter,
            limit,
            property,
            sort,
            threadStatus,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ThreadListParams{after=$after, archived=$archived, associatedContactId=$associatedContactId, association=$association, inboxId=$inboxId, latestMessageTimestampAfter=$latestMessageTimestampAfter, limit=$limit, property=$property, sort=$sort, threadStatus=$threadStatus, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
