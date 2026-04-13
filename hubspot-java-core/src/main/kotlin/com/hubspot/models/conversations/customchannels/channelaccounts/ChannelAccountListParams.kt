// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels.channelaccounts

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot.core.Enum
import com.hubspot.core.JsonField
import com.hubspot.core.Params
import com.hubspot.core.http.Headers
import com.hubspot.core.http.QueryParams
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of accounts for a custom channel. */
class ChannelAccountListParams
private constructor(
    private val channelId: Int?,
    private val after: String?,
    private val archived: Boolean?,
    private val defaultPageLength: Int?,
    private val deliveryIdentifierType: List<DeliveryIdentifierType>?,
    private val deliveryIdentifierValue: List<String>?,
    private val limit: Int?,
    private val sort: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun channelId(): Optional<Int> = Optional.ofNullable(channelId)

    /**
     * The paging cursor token of the last successfully read resource will be returned as the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Whether to return only results that have been archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    fun defaultPageLength(): Optional<Int> = Optional.ofNullable(defaultPageLength)

    fun deliveryIdentifierType(): Optional<List<DeliveryIdentifierType>> =
        Optional.ofNullable(deliveryIdentifierType)

    fun deliveryIdentifierValue(): Optional<List<String>> =
        Optional.ofNullable(deliveryIdentifierValue)

    /** The maximum number of results to display per page. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ChannelAccountListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ChannelAccountListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelAccountListParams]. */
    class Builder internal constructor() {

        private var channelId: Int? = null
        private var after: String? = null
        private var archived: Boolean? = null
        private var defaultPageLength: Int? = null
        private var deliveryIdentifierType: MutableList<DeliveryIdentifierType>? = null
        private var deliveryIdentifierValue: MutableList<String>? = null
        private var limit: Int? = null
        private var sort: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(channelAccountListParams: ChannelAccountListParams) = apply {
            channelId = channelAccountListParams.channelId
            after = channelAccountListParams.after
            archived = channelAccountListParams.archived
            defaultPageLength = channelAccountListParams.defaultPageLength
            deliveryIdentifierType =
                channelAccountListParams.deliveryIdentifierType?.toMutableList()
            deliveryIdentifierValue =
                channelAccountListParams.deliveryIdentifierValue?.toMutableList()
            limit = channelAccountListParams.limit
            sort = channelAccountListParams.sort?.toMutableList()
            additionalHeaders = channelAccountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = channelAccountListParams.additionalQueryParams.toBuilder()
        }

        fun channelId(channelId: Int?) = apply { this.channelId = channelId }

        /**
         * Alias for [Builder.channelId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun channelId(channelId: Int) = channelId(channelId as Int?)

        /** Alias for calling [Builder.channelId] with `channelId.orElse(null)`. */
        fun channelId(channelId: Optional<Int>) = channelId(channelId.getOrNull())

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

        fun defaultPageLength(defaultPageLength: Int?) = apply {
            this.defaultPageLength = defaultPageLength
        }

        /**
         * Alias for [Builder.defaultPageLength].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun defaultPageLength(defaultPageLength: Int) = defaultPageLength(defaultPageLength as Int?)

        /** Alias for calling [Builder.defaultPageLength] with `defaultPageLength.orElse(null)`. */
        fun defaultPageLength(defaultPageLength: Optional<Int>) =
            defaultPageLength(defaultPageLength.getOrNull())

        fun deliveryIdentifierType(deliveryIdentifierType: List<DeliveryIdentifierType>?) = apply {
            this.deliveryIdentifierType = deliveryIdentifierType?.toMutableList()
        }

        /**
         * Alias for calling [Builder.deliveryIdentifierType] with
         * `deliveryIdentifierType.orElse(null)`.
         */
        fun deliveryIdentifierType(deliveryIdentifierType: Optional<List<DeliveryIdentifierType>>) =
            deliveryIdentifierType(deliveryIdentifierType.getOrNull())

        /**
         * Adds a single [DeliveryIdentifierType] to [Builder.deliveryIdentifierType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeliveryIdentifierType(deliveryIdentifierType: DeliveryIdentifierType) = apply {
            this.deliveryIdentifierType =
                (this.deliveryIdentifierType ?: mutableListOf()).apply {
                    add(deliveryIdentifierType)
                }
        }

        fun deliveryIdentifierValue(deliveryIdentifierValue: List<String>?) = apply {
            this.deliveryIdentifierValue = deliveryIdentifierValue?.toMutableList()
        }

        /**
         * Alias for calling [Builder.deliveryIdentifierValue] with
         * `deliveryIdentifierValue.orElse(null)`.
         */
        fun deliveryIdentifierValue(deliveryIdentifierValue: Optional<List<String>>) =
            deliveryIdentifierValue(deliveryIdentifierValue.getOrNull())

        /**
         * Adds a single [String] to [Builder.deliveryIdentifierValue].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeliveryIdentifierValue(deliveryIdentifierValue: String) = apply {
            this.deliveryIdentifierValue =
                (this.deliveryIdentifierValue ?: mutableListOf()).apply {
                    add(deliveryIdentifierValue)
                }
        }

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
         * Returns an immutable instance of [ChannelAccountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChannelAccountListParams =
            ChannelAccountListParams(
                channelId,
                after,
                archived,
                defaultPageLength,
                deliveryIdentifierType?.toImmutable(),
                deliveryIdentifierValue?.toImmutable(),
                limit,
                sort?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> channelId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                archived?.let { put("archived", it.toString()) }
                defaultPageLength?.let { put("defaultPageLength", it.toString()) }
                deliveryIdentifierType?.let {
                    put("deliveryIdentifierType", it.joinToString(",") { it.toString() })
                }
                deliveryIdentifierValue?.let {
                    put("deliveryIdentifierValue", it.joinToString(","))
                }
                limit?.let { put("limit", it.toString()) }
                sort?.let { put("sort", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    class DeliveryIdentifierType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HS_EMAIL_ADDRESS = of("HS_EMAIL_ADDRESS")

            @JvmField val HS_PHONE_NUMBER = of("HS_PHONE_NUMBER")

            @JvmField val HS_SHORT_CODE = of("HS_SHORT_CODE")

            @JvmField val CHANNEL_SPECIFIC_OPAQUE_ID = of("CHANNEL_SPECIFIC_OPAQUE_ID")

            @JvmStatic fun of(value: String) = DeliveryIdentifierType(JsonField.of(value))
        }

        /** An enum containing [DeliveryIdentifierType]'s known values. */
        enum class Known {
            HS_EMAIL_ADDRESS,
            HS_PHONE_NUMBER,
            HS_SHORT_CODE,
            CHANNEL_SPECIFIC_OPAQUE_ID,
        }

        /**
         * An enum containing [DeliveryIdentifierType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DeliveryIdentifierType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HS_EMAIL_ADDRESS,
            HS_PHONE_NUMBER,
            HS_SHORT_CODE,
            CHANNEL_SPECIFIC_OPAQUE_ID,
            /**
             * An enum member indicating that [DeliveryIdentifierType] was instantiated with an
             * unknown value.
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
                HS_EMAIL_ADDRESS -> Value.HS_EMAIL_ADDRESS
                HS_PHONE_NUMBER -> Value.HS_PHONE_NUMBER
                HS_SHORT_CODE -> Value.HS_SHORT_CODE
                CHANNEL_SPECIFIC_OPAQUE_ID -> Value.CHANNEL_SPECIFIC_OPAQUE_ID
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HS_EMAIL_ADDRESS -> Known.HS_EMAIL_ADDRESS
                HS_PHONE_NUMBER -> Known.HS_PHONE_NUMBER
                HS_SHORT_CODE -> Known.HS_SHORT_CODE
                CHANNEL_SPECIFIC_OPAQUE_ID -> Known.CHANNEL_SPECIFIC_OPAQUE_ID
                else -> throw HubSpotInvalidDataException("Unknown DeliveryIdentifierType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DeliveryIdentifierType = apply {
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
            } catch (e: HubSpotInvalidDataException) {
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

            return other is DeliveryIdentifierType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelAccountListParams &&
            channelId == other.channelId &&
            after == other.after &&
            archived == other.archived &&
            defaultPageLength == other.defaultPageLength &&
            deliveryIdentifierType == other.deliveryIdentifierType &&
            deliveryIdentifierValue == other.deliveryIdentifierValue &&
            limit == other.limit &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            channelId,
            after,
            archived,
            defaultPageLength,
            deliveryIdentifierType,
            deliveryIdentifierValue,
            limit,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ChannelAccountListParams{channelId=$channelId, after=$after, archived=$archived, defaultPageLength=$defaultPageLength, deliveryIdentifierType=$deliveryIdentifierType, deliveryIdentifierValue=$deliveryIdentifierValue, limit=$limit, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
