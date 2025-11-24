// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails.statistics

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get aggregated statistics in intervals for a specified time span. Each interval contains
 * aggregated statistics of the emails that were sent in that time.
 */
class StatisticGetHistogramParams
private constructor(
    private val emailIds: List<Long>?,
    private val endTimestamp: String?,
    private val interval: Interval?,
    private val startTimestamp: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by email IDs. Only include statistics of emails with these IDs. */
    fun emailIds(): Optional<List<Long>> = Optional.ofNullable(emailIds)

    /** The end timestamp of the time span, in ISO8601 representation. */
    fun endTimestamp(): Optional<String> = Optional.ofNullable(endTimestamp)

    /** The interval to aggregate statistics for. */
    fun interval(): Optional<Interval> = Optional.ofNullable(interval)

    /** The start timestamp of the time span, in ISO8601 representation. */
    fun startTimestamp(): Optional<String> = Optional.ofNullable(startTimestamp)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StatisticGetHistogramParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [StatisticGetHistogramParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatisticGetHistogramParams]. */
    class Builder internal constructor() {

        private var emailIds: MutableList<Long>? = null
        private var endTimestamp: String? = null
        private var interval: Interval? = null
        private var startTimestamp: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(statisticGetHistogramParams: StatisticGetHistogramParams) = apply {
            emailIds = statisticGetHistogramParams.emailIds?.toMutableList()
            endTimestamp = statisticGetHistogramParams.endTimestamp
            interval = statisticGetHistogramParams.interval
            startTimestamp = statisticGetHistogramParams.startTimestamp
            additionalHeaders = statisticGetHistogramParams.additionalHeaders.toBuilder()
            additionalQueryParams = statisticGetHistogramParams.additionalQueryParams.toBuilder()
        }

        /** Filter by email IDs. Only include statistics of emails with these IDs. */
        fun emailIds(emailIds: List<Long>?) = apply { this.emailIds = emailIds?.toMutableList() }

        /** Alias for calling [Builder.emailIds] with `emailIds.orElse(null)`. */
        fun emailIds(emailIds: Optional<List<Long>>) = emailIds(emailIds.getOrNull())

        /**
         * Adds a single [Long] to [emailIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmailId(emailId: Long) = apply {
            emailIds = (emailIds ?: mutableListOf()).apply { add(emailId) }
        }

        /** The end timestamp of the time span, in ISO8601 representation. */
        fun endTimestamp(endTimestamp: String?) = apply { this.endTimestamp = endTimestamp }

        /** Alias for calling [Builder.endTimestamp] with `endTimestamp.orElse(null)`. */
        fun endTimestamp(endTimestamp: Optional<String>) = endTimestamp(endTimestamp.getOrNull())

        /** The interval to aggregate statistics for. */
        fun interval(interval: Interval?) = apply { this.interval = interval }

        /** Alias for calling [Builder.interval] with `interval.orElse(null)`. */
        fun interval(interval: Optional<Interval>) = interval(interval.getOrNull())

        /** The start timestamp of the time span, in ISO8601 representation. */
        fun startTimestamp(startTimestamp: String?) = apply { this.startTimestamp = startTimestamp }

        /** Alias for calling [Builder.startTimestamp] with `startTimestamp.orElse(null)`. */
        fun startTimestamp(startTimestamp: Optional<String>) =
            startTimestamp(startTimestamp.getOrNull())

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
         * Returns an immutable instance of [StatisticGetHistogramParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StatisticGetHistogramParams =
            StatisticGetHistogramParams(
                emailIds?.toImmutable(),
                endTimestamp,
                interval,
                startTimestamp,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                emailIds?.let { put("emailIds", it.joinToString(",") { it.toString() }) }
                endTimestamp?.let { put("endTimestamp", it) }
                interval?.let { put("interval", it.toString()) }
                startTimestamp?.let { put("startTimestamp", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** The interval to aggregate statistics for. */
    class Interval @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DAY = of("DAY")

            @JvmField val HOUR = of("HOUR")

            @JvmField val MINUTE = of("MINUTE")

            @JvmField val MONTH = of("MONTH")

            @JvmField val QUARTER = of("QUARTER")

            @JvmField val QUARTER_HOUR = of("QUARTER_HOUR")

            @JvmField val SECOND = of("SECOND")

            @JvmField val WEEK = of("WEEK")

            @JvmField val YEAR = of("YEAR")

            @JvmStatic fun of(value: String) = Interval(JsonField.of(value))
        }

        /** An enum containing [Interval]'s known values. */
        enum class Known {
            DAY,
            HOUR,
            MINUTE,
            MONTH,
            QUARTER,
            QUARTER_HOUR,
            SECOND,
            WEEK,
            YEAR,
        }

        /**
         * An enum containing [Interval]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Interval] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAY,
            HOUR,
            MINUTE,
            MONTH,
            QUARTER,
            QUARTER_HOUR,
            SECOND,
            WEEK,
            YEAR,
            /** An enum member indicating that [Interval] was instantiated with an unknown value. */
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
                DAY -> Value.DAY
                HOUR -> Value.HOUR
                MINUTE -> Value.MINUTE
                MONTH -> Value.MONTH
                QUARTER -> Value.QUARTER
                QUARTER_HOUR -> Value.QUARTER_HOUR
                SECOND -> Value.SECOND
                WEEK -> Value.WEEK
                YEAR -> Value.YEAR
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
                DAY -> Known.DAY
                HOUR -> Known.HOUR
                MINUTE -> Known.MINUTE
                MONTH -> Known.MONTH
                QUARTER -> Known.QUARTER
                QUARTER_HOUR -> Known.QUARTER_HOUR
                SECOND -> Known.SECOND
                WEEK -> Known.WEEK
                YEAR -> Known.YEAR
                else -> throw HubspotInvalidDataException("Unknown Interval: $value")
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

        fun validate(): Interval = apply {
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

            return other is Interval && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatisticGetHistogramParams &&
            emailIds == other.emailIds &&
            endTimestamp == other.endTimestamp &&
            interval == other.interval &&
            startTimestamp == other.startTimestamp &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailIds,
            endTimestamp,
            interval,
            startTimestamp,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "StatisticGetHistogramParams{emailIds=$emailIds, endTimestamp=$endTimestamp, interval=$interval, startTimestamp=$startTimestamp, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
