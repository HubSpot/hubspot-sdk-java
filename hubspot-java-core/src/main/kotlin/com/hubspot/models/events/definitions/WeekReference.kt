// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WeekReference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dayOfWeek: JsonField<DayOfWeek>,
    private val referenceType: JsonField<ReferenceType>,
    private val hour: JsonField<Int>,
    private val millisecond: JsonField<Int>,
    private val minute: JsonField<Int>,
    private val second: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dayOfWeek")
        @ExcludeMissing
        dayOfWeek: JsonField<DayOfWeek> = JsonMissing.of(),
        @JsonProperty("referenceType")
        @ExcludeMissing
        referenceType: JsonField<ReferenceType> = JsonMissing.of(),
        @JsonProperty("hour") @ExcludeMissing hour: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("millisecond") @ExcludeMissing millisecond: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minute") @ExcludeMissing minute: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("second") @ExcludeMissing second: JsonField<Int> = JsonMissing.of(),
    ) : this(dayOfWeek, referenceType, hour, millisecond, minute, second, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dayOfWeek(): DayOfWeek = dayOfWeek.getRequired("dayOfWeek")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceType(): ReferenceType = referenceType.getRequired("referenceType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hour(): Optional<Int> = hour.getOptional("hour")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun millisecond(): Optional<Int> = millisecond.getOptional("millisecond")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minute(): Optional<Int> = minute.getOptional("minute")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun second(): Optional<Int> = second.getOptional("second")

    /**
     * Returns the raw JSON value of [dayOfWeek].
     *
     * Unlike [dayOfWeek], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dayOfWeek") @ExcludeMissing fun _dayOfWeek(): JsonField<DayOfWeek> = dayOfWeek

    /**
     * Returns the raw JSON value of [referenceType].
     *
     * Unlike [referenceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceType")
    @ExcludeMissing
    fun _referenceType(): JsonField<ReferenceType> = referenceType

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
         * Returns a mutable builder for constructing an instance of [WeekReference].
         *
         * The following fields are required:
         * ```java
         * .dayOfWeek()
         * .referenceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WeekReference]. */
    class Builder internal constructor() {

        private var dayOfWeek: JsonField<DayOfWeek>? = null
        private var referenceType: JsonField<ReferenceType>? = null
        private var hour: JsonField<Int> = JsonMissing.of()
        private var millisecond: JsonField<Int> = JsonMissing.of()
        private var minute: JsonField<Int> = JsonMissing.of()
        private var second: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(weekReference: WeekReference) = apply {
            dayOfWeek = weekReference.dayOfWeek
            referenceType = weekReference.referenceType
            hour = weekReference.hour
            millisecond = weekReference.millisecond
            minute = weekReference.minute
            second = weekReference.second
            additionalProperties = weekReference.additionalProperties.toMutableMap()
        }

        fun dayOfWeek(dayOfWeek: DayOfWeek) = dayOfWeek(JsonField.of(dayOfWeek))

        /**
         * Sets [Builder.dayOfWeek] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayOfWeek] with a well-typed [DayOfWeek] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dayOfWeek(dayOfWeek: JsonField<DayOfWeek>) = apply { this.dayOfWeek = dayOfWeek }

        fun referenceType(referenceType: ReferenceType) = referenceType(JsonField.of(referenceType))

        /**
         * Sets [Builder.referenceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceType] with a well-typed [ReferenceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceType(referenceType: JsonField<ReferenceType>) = apply {
            this.referenceType = referenceType
        }

        fun hour(hour: Int) = hour(JsonField.of(hour))

        /**
         * Sets [Builder.hour] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hour] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hour(hour: JsonField<Int>) = apply { this.hour = hour }

        fun millisecond(millisecond: Int) = millisecond(JsonField.of(millisecond))

        /**
         * Sets [Builder.millisecond] to an arbitrary JSON value.
         *
         * You should usually call [Builder.millisecond] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun millisecond(millisecond: JsonField<Int>) = apply { this.millisecond = millisecond }

        fun minute(minute: Int) = minute(JsonField.of(minute))

        /**
         * Sets [Builder.minute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minute] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minute(minute: JsonField<Int>) = apply { this.minute = minute }

        fun second(second: Int) = second(JsonField.of(second))

        /**
         * Sets [Builder.second] to an arbitrary JSON value.
         *
         * You should usually call [Builder.second] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun second(second: JsonField<Int>) = apply { this.second = second }

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
         * Returns an immutable instance of [WeekReference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dayOfWeek()
         * .referenceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WeekReference =
            WeekReference(
                checkRequired("dayOfWeek", dayOfWeek),
                checkRequired("referenceType", referenceType),
                hour,
                millisecond,
                minute,
                second,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WeekReference = apply {
        if (validated) {
            return@apply
        }

        dayOfWeek().validate()
        referenceType().validate()
        hour()
        millisecond()
        minute()
        second()
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
        (dayOfWeek.asKnown().getOrNull()?.validity() ?: 0) +
            (referenceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hour.asKnown().isPresent) 1 else 0) +
            (if (millisecond.asKnown().isPresent) 1 else 0) +
            (if (minute.asKnown().isPresent) 1 else 0) +
            (if (second.asKnown().isPresent) 1 else 0)

    class DayOfWeek @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FRIDAY = of("FRIDAY")

            @JvmField val MONDAY = of("MONDAY")

            @JvmField val SATURDAY = of("SATURDAY")

            @JvmField val SUNDAY = of("SUNDAY")

            @JvmField val THURSDAY = of("THURSDAY")

            @JvmField val TUESDAY = of("TUESDAY")

            @JvmField val WEDNESDAY = of("WEDNESDAY")

            @JvmStatic fun of(value: String) = DayOfWeek(JsonField.of(value))
        }

        /** An enum containing [DayOfWeek]'s known values. */
        enum class Known {
            FRIDAY,
            MONDAY,
            SATURDAY,
            SUNDAY,
            THURSDAY,
            TUESDAY,
            WEDNESDAY,
        }

        /**
         * An enum containing [DayOfWeek]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DayOfWeek] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FRIDAY,
            MONDAY,
            SATURDAY,
            SUNDAY,
            THURSDAY,
            TUESDAY,
            WEDNESDAY,
            /**
             * An enum member indicating that [DayOfWeek] was instantiated with an unknown value.
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
                FRIDAY -> Value.FRIDAY
                MONDAY -> Value.MONDAY
                SATURDAY -> Value.SATURDAY
                SUNDAY -> Value.SUNDAY
                THURSDAY -> Value.THURSDAY
                TUESDAY -> Value.TUESDAY
                WEDNESDAY -> Value.WEDNESDAY
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
                FRIDAY -> Known.FRIDAY
                MONDAY -> Known.MONDAY
                SATURDAY -> Known.SATURDAY
                SUNDAY -> Known.SUNDAY
                THURSDAY -> Known.THURSDAY
                TUESDAY -> Known.TUESDAY
                WEDNESDAY -> Known.WEDNESDAY
                else -> throw HubSpotInvalidDataException("Unknown DayOfWeek: $value")
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

        fun validate(): DayOfWeek = apply {
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

            return other is DayOfWeek && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ReferenceType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val WEEK = of("WEEK")

            @JvmStatic fun of(value: String) = ReferenceType(JsonField.of(value))
        }

        /** An enum containing [ReferenceType]'s known values. */
        enum class Known {
            WEEK
        }

        /**
         * An enum containing [ReferenceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferenceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WEEK,
            /**
             * An enum member indicating that [ReferenceType] was instantiated with an unknown
             * value.
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
                WEEK -> Value.WEEK
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
                WEEK -> Known.WEEK
                else -> throw HubSpotInvalidDataException("Unknown ReferenceType: $value")
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

        fun validate(): ReferenceType = apply {
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

            return other is ReferenceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WeekReference &&
            dayOfWeek == other.dayOfWeek &&
            referenceType == other.referenceType &&
            hour == other.hour &&
            millisecond == other.millisecond &&
            minute == other.minute &&
            second == other.second &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dayOfWeek,
            referenceType,
            hour,
            millisecond,
            minute,
            second,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WeekReference{dayOfWeek=$dayOfWeek, referenceType=$referenceType, hour=$hour, millisecond=$millisecond, minute=$minute, second=$second, additionalProperties=$additionalProperties}"
}
