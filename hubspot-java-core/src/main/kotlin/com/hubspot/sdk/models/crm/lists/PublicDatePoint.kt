// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicDatePoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val day: JsonField<Int>,
    private val month: JsonField<Int>,
    private val timeType: JsonField<TimeType>,
    private val year: JsonField<Int>,
    private val zoneId: JsonField<String>,
    private val hour: JsonField<Int>,
    private val millisecond: JsonField<Int>,
    private val minute: JsonField<Int>,
    private val second: JsonField<Int>,
    private val timezoneSource: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("day") @ExcludeMissing day: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("month") @ExcludeMissing month: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timeType") @ExcludeMissing timeType: JsonField<TimeType> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing year: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("zoneId") @ExcludeMissing zoneId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hour") @ExcludeMissing hour: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("millisecond") @ExcludeMissing millisecond: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minute") @ExcludeMissing minute: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("second") @ExcludeMissing second: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timezoneSource")
        @ExcludeMissing
        timezoneSource: JsonField<String> = JsonMissing.of(),
    ) : this(
        day,
        month,
        timeType,
        year,
        zoneId,
        hour,
        millisecond,
        minute,
        second,
        timezoneSource,
        mutableMapOf(),
    )

    /**
     * The day component of the date.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun day(): Int = day.getRequired("day")

    /**
     * The month component of the date.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun month(): Int = month.getRequired("month")

    /**
     * Specifies the type of time (DATE).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeType(): TimeType = timeType.getRequired("timeType")

    /**
     * The year component of the date.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun year(): Int = year.getRequired("year")

    /**
     * The identifier for the time zone.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zoneId(): String = zoneId.getRequired("zoneId")

    /**
     * The hour component of the time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hour(): Optional<Int> = hour.getOptional("hour")

    /**
     * The millisecond component of the time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun millisecond(): Optional<Int> = millisecond.getOptional("millisecond")

    /**
     * The minute component of the time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minute(): Optional<Int> = minute.getOptional("minute")

    /**
     * The second component of the time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun second(): Optional<Int> = second.getOptional("second")

    /**
     * The source of the time zone information.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezoneSource(): Optional<String> = timezoneSource.getOptional("timezoneSource")

    /**
     * Returns the raw JSON value of [day].
     *
     * Unlike [day], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Int> = day

    /**
     * Returns the raw JSON value of [month].
     *
     * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Int> = month

    /**
     * Returns the raw JSON value of [timeType].
     *
     * Unlike [timeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeType") @ExcludeMissing fun _timeType(): JsonField<TimeType> = timeType

    /**
     * Returns the raw JSON value of [year].
     *
     * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Int> = year

    /**
     * Returns the raw JSON value of [zoneId].
     *
     * Unlike [zoneId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneId") @ExcludeMissing fun _zoneId(): JsonField<String> = zoneId

    /**
     * Returns the raw JSON value of [hour].
     *
     * Unlike [hour], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hour") @ExcludeMissing fun _hour(): JsonField<Int> = hour

    /**
     * Returns the raw JSON value of [millisecond].
     *
     * Unlike [millisecond], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("millisecond") @ExcludeMissing fun _millisecond(): JsonField<Int> = millisecond

    /**
     * Returns the raw JSON value of [minute].
     *
     * Unlike [minute], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minute") @ExcludeMissing fun _minute(): JsonField<Int> = minute

    /**
     * Returns the raw JSON value of [second].
     *
     * Unlike [second], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("second") @ExcludeMissing fun _second(): JsonField<Int> = second

    /**
     * Returns the raw JSON value of [timezoneSource].
     *
     * Unlike [timezoneSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezoneSource")
    @ExcludeMissing
    fun _timezoneSource(): JsonField<String> = timezoneSource

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PublicDatePoint].
         *
         * The following fields are required:
         * ```java
         * .day()
         * .month()
         * .timeType()
         * .year()
         * .zoneId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicDatePoint]. */
    class Builder internal constructor() {

        private var day: JsonField<Int>? = null
        private var month: JsonField<Int>? = null
        private var timeType: JsonField<TimeType>? = null
        private var year: JsonField<Int>? = null
        private var zoneId: JsonField<String>? = null
        private var hour: JsonField<Int> = JsonMissing.of()
        private var millisecond: JsonField<Int> = JsonMissing.of()
        private var minute: JsonField<Int> = JsonMissing.of()
        private var second: JsonField<Int> = JsonMissing.of()
        private var timezoneSource: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicDatePoint: PublicDatePoint) = apply {
            day = publicDatePoint.day
            month = publicDatePoint.month
            timeType = publicDatePoint.timeType
            year = publicDatePoint.year
            zoneId = publicDatePoint.zoneId
            hour = publicDatePoint.hour
            millisecond = publicDatePoint.millisecond
            minute = publicDatePoint.minute
            second = publicDatePoint.second
            timezoneSource = publicDatePoint.timezoneSource
            additionalProperties = publicDatePoint.additionalProperties.toMutableMap()
        }

        /** The day component of the date. */
        fun day(day: Int) = day(JsonField.of(day))

        /**
         * Sets [Builder.day] to an arbitrary JSON value.
         *
         * You should usually call [Builder.day] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun day(day: JsonField<Int>) = apply { this.day = day }

        /** The month component of the date. */
        fun month(month: Int) = month(JsonField.of(month))

        /**
         * Sets [Builder.month] to an arbitrary JSON value.
         *
         * You should usually call [Builder.month] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun month(month: JsonField<Int>) = apply { this.month = month }

        /** Specifies the type of time (DATE). */
        fun timeType(timeType: TimeType) = timeType(JsonField.of(timeType))

        /**
         * Sets [Builder.timeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeType] with a well-typed [TimeType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeType(timeType: JsonField<TimeType>) = apply { this.timeType = timeType }

        /** The year component of the date. */
        fun year(year: Int) = year(JsonField.of(year))

        /**
         * Sets [Builder.year] to an arbitrary JSON value.
         *
         * You should usually call [Builder.year] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun year(year: JsonField<Int>) = apply { this.year = year }

        /** The identifier for the time zone. */
        fun zoneId(zoneId: String) = zoneId(JsonField.of(zoneId))

        /**
         * Sets [Builder.zoneId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoneId(zoneId: JsonField<String>) = apply { this.zoneId = zoneId }

        /** The hour component of the time. */
        fun hour(hour: Int) = hour(JsonField.of(hour))

        /**
         * Sets [Builder.hour] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hour] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hour(hour: JsonField<Int>) = apply { this.hour = hour }

        /** The millisecond component of the time. */
        fun millisecond(millisecond: Int) = millisecond(JsonField.of(millisecond))

        /**
         * Sets [Builder.millisecond] to an arbitrary JSON value.
         *
         * You should usually call [Builder.millisecond] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun millisecond(millisecond: JsonField<Int>) = apply { this.millisecond = millisecond }

        /** The minute component of the time. */
        fun minute(minute: Int) = minute(JsonField.of(minute))

        /**
         * Sets [Builder.minute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minute] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minute(minute: JsonField<Int>) = apply { this.minute = minute }

        /** The second component of the time. */
        fun second(second: Int) = second(JsonField.of(second))

        /**
         * Sets [Builder.second] to an arbitrary JSON value.
         *
         * You should usually call [Builder.second] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun second(second: JsonField<Int>) = apply { this.second = second }

        /** The source of the time zone information. */
        fun timezoneSource(timezoneSource: String) = timezoneSource(JsonField.of(timezoneSource))

        /**
         * Sets [Builder.timezoneSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezoneSource] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timezoneSource(timezoneSource: JsonField<String>) = apply {
            this.timezoneSource = timezoneSource
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PublicDatePoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .day()
         * .month()
         * .timeType()
         * .year()
         * .zoneId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicDatePoint =
            PublicDatePoint(
                checkRequired("day", day),
                checkRequired("month", month),
                checkRequired("timeType", timeType),
                checkRequired("year", year),
                checkRequired("zoneId", zoneId),
                hour,
                millisecond,
                minute,
                second,
                timezoneSource,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PublicDatePoint = apply {
        if (validated) {
            return@apply
        }

        day()
        month()
        timeType().validate()
        year()
        zoneId()
        hour()
        millisecond()
        minute()
        second()
        timezoneSource()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (day.asKnown().isPresent) 1 else 0) +
            (if (month.asKnown().isPresent) 1 else 0) +
            (timeType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (year.asKnown().isPresent) 1 else 0) +
            (if (zoneId.asKnown().isPresent) 1 else 0) +
            (if (hour.asKnown().isPresent) 1 else 0) +
            (if (millisecond.asKnown().isPresent) 1 else 0) +
            (if (minute.asKnown().isPresent) 1 else 0) +
            (if (second.asKnown().isPresent) 1 else 0) +
            (if (timezoneSource.asKnown().isPresent) 1 else 0)

    /** Specifies the type of time (DATE). */
    class TimeType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DATE = of("DATE")

            @JvmStatic fun of(value: String) = TimeType(JsonField.of(value))
        }

        /** An enum containing [TimeType]'s known values. */
        enum class Known {
            DATE
        }

        /**
         * An enum containing [TimeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DATE,
            /** An enum member indicating that [TimeType] was instantiated with an unknown value. */
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
                DATE -> Value.DATE
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
                DATE -> Known.DATE
                else -> throw HubSpotInvalidDataException("Unknown TimeType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TimeType = apply {
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

            return other is TimeType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDatePoint &&
            day == other.day &&
            month == other.month &&
            timeType == other.timeType &&
            year == other.year &&
            zoneId == other.zoneId &&
            hour == other.hour &&
            millisecond == other.millisecond &&
            minute == other.minute &&
            second == other.second &&
            timezoneSource == other.timezoneSource &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            day,
            month,
            timeType,
            year,
            zoneId,
            hour,
            millisecond,
            minute,
            second,
            timezoneSource,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicDatePoint{day=$day, month=$month, timeType=$timeType, year=$year, zoneId=$zoneId, hour=$hour, millisecond=$millisecond, minute=$minute, second=$second, timezoneSource=$timezoneSource, additionalProperties=$additionalProperties}"
}
