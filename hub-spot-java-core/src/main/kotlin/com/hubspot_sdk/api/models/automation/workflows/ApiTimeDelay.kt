// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiTimeDelay
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val daysOfWeek: JsonField<List<DaysOfWeek>>,
    private val delta: JsonField<Int>,
    private val timeUnit: JsonField<TimeUnit>,
    private val timeOfDay: JsonField<ApiTimeOfDay>,
    private val timeZoneStrategy: JsonField<ApiStaticTimeZoneStrategy>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("daysOfWeek")
        @ExcludeMissing
        daysOfWeek: JsonField<List<DaysOfWeek>> = JsonMissing.of(),
        @JsonProperty("delta") @ExcludeMissing delta: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timeUnit") @ExcludeMissing timeUnit: JsonField<TimeUnit> = JsonMissing.of(),
        @JsonProperty("timeOfDay")
        @ExcludeMissing
        timeOfDay: JsonField<ApiTimeOfDay> = JsonMissing.of(),
        @JsonProperty("timeZoneStrategy")
        @ExcludeMissing
        timeZoneStrategy: JsonField<ApiStaticTimeZoneStrategy> = JsonMissing.of(),
    ) : this(daysOfWeek, delta, timeUnit, timeOfDay, timeZoneStrategy, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daysOfWeek(): List<DaysOfWeek> = daysOfWeek.getRequired("daysOfWeek")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun delta(): Int = delta.getRequired("delta")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeUnit(): TimeUnit = timeUnit.getRequired("timeUnit")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeOfDay(): Optional<ApiTimeOfDay> = timeOfDay.getOptional("timeOfDay")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeZoneStrategy(): Optional<ApiStaticTimeZoneStrategy> =
        timeZoneStrategy.getOptional("timeZoneStrategy")

    /**
     * Returns the raw JSON value of [daysOfWeek].
     *
     * Unlike [daysOfWeek], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daysOfWeek")
    @ExcludeMissing
    fun _daysOfWeek(): JsonField<List<DaysOfWeek>> = daysOfWeek

    /**
     * Returns the raw JSON value of [delta].
     *
     * Unlike [delta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<Int> = delta

    /**
     * Returns the raw JSON value of [timeUnit].
     *
     * Unlike [timeUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeUnit") @ExcludeMissing fun _timeUnit(): JsonField<TimeUnit> = timeUnit

    /**
     * Returns the raw JSON value of [timeOfDay].
     *
     * Unlike [timeOfDay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeOfDay") @ExcludeMissing fun _timeOfDay(): JsonField<ApiTimeOfDay> = timeOfDay

    /**
     * Returns the raw JSON value of [timeZoneStrategy].
     *
     * Unlike [timeZoneStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("timeZoneStrategy")
    @ExcludeMissing
    fun _timeZoneStrategy(): JsonField<ApiStaticTimeZoneStrategy> = timeZoneStrategy

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
         * Returns a mutable builder for constructing an instance of [ApiTimeDelay].
         *
         * The following fields are required:
         * ```java
         * .daysOfWeek()
         * .delta()
         * .timeUnit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiTimeDelay]. */
    class Builder internal constructor() {

        private var daysOfWeek: JsonField<MutableList<DaysOfWeek>>? = null
        private var delta: JsonField<Int>? = null
        private var timeUnit: JsonField<TimeUnit>? = null
        private var timeOfDay: JsonField<ApiTimeOfDay> = JsonMissing.of()
        private var timeZoneStrategy: JsonField<ApiStaticTimeZoneStrategy> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiTimeDelay: ApiTimeDelay) = apply {
            daysOfWeek = apiTimeDelay.daysOfWeek.map { it.toMutableList() }
            delta = apiTimeDelay.delta
            timeUnit = apiTimeDelay.timeUnit
            timeOfDay = apiTimeDelay.timeOfDay
            timeZoneStrategy = apiTimeDelay.timeZoneStrategy
            additionalProperties = apiTimeDelay.additionalProperties.toMutableMap()
        }

        fun daysOfWeek(daysOfWeek: List<DaysOfWeek>) = daysOfWeek(JsonField.of(daysOfWeek))

        /**
         * Sets [Builder.daysOfWeek] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysOfWeek] with a well-typed `List<DaysOfWeek>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun daysOfWeek(daysOfWeek: JsonField<List<DaysOfWeek>>) = apply {
            this.daysOfWeek = daysOfWeek.map { it.toMutableList() }
        }

        /**
         * Adds a single [DaysOfWeek] to [Builder.daysOfWeek].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDaysOfWeek(daysOfWeek: DaysOfWeek) = apply {
            this.daysOfWeek =
                (this.daysOfWeek ?: JsonField.of(mutableListOf())).also {
                    checkKnown("daysOfWeek", it).add(daysOfWeek)
                }
        }

        fun delta(delta: Int) = delta(JsonField.of(delta))

        /**
         * Sets [Builder.delta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delta] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun delta(delta: JsonField<Int>) = apply { this.delta = delta }

        fun timeUnit(timeUnit: TimeUnit) = timeUnit(JsonField.of(timeUnit))

        /**
         * Sets [Builder.timeUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUnit] with a well-typed [TimeUnit] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeUnit(timeUnit: JsonField<TimeUnit>) = apply { this.timeUnit = timeUnit }

        fun timeOfDay(timeOfDay: ApiTimeOfDay) = timeOfDay(JsonField.of(timeOfDay))

        /**
         * Sets [Builder.timeOfDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeOfDay] with a well-typed [ApiTimeOfDay] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeOfDay(timeOfDay: JsonField<ApiTimeOfDay>) = apply { this.timeOfDay = timeOfDay }

        fun timeZoneStrategy(timeZoneStrategy: ApiStaticTimeZoneStrategy) =
            timeZoneStrategy(JsonField.of(timeZoneStrategy))

        /**
         * Sets [Builder.timeZoneStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeZoneStrategy] with a well-typed
         * [ApiStaticTimeZoneStrategy] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun timeZoneStrategy(timeZoneStrategy: JsonField<ApiStaticTimeZoneStrategy>) = apply {
            this.timeZoneStrategy = timeZoneStrategy
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
         * Returns an immutable instance of [ApiTimeDelay].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .daysOfWeek()
         * .delta()
         * .timeUnit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiTimeDelay =
            ApiTimeDelay(
                checkRequired("daysOfWeek", daysOfWeek).map { it.toImmutable() },
                checkRequired("delta", delta),
                checkRequired("timeUnit", timeUnit),
                timeOfDay,
                timeZoneStrategy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiTimeDelay = apply {
        if (validated) {
            return@apply
        }

        daysOfWeek().forEach { it.validate() }
        delta()
        timeUnit().validate()
        timeOfDay().ifPresent { it.validate() }
        timeZoneStrategy().ifPresent { it.validate() }
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
        (daysOfWeek.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (delta.asKnown().isPresent) 1 else 0) +
            (timeUnit.asKnown().getOrNull()?.validity() ?: 0) +
            (timeOfDay.asKnown().getOrNull()?.validity() ?: 0) +
            (timeZoneStrategy.asKnown().getOrNull()?.validity() ?: 0)

    class DaysOfWeek @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MONDAY = of("MONDAY")

            @JvmField val TUESDAY = of("TUESDAY")

            @JvmField val WEDNESDAY = of("WEDNESDAY")

            @JvmField val THURSDAY = of("THURSDAY")

            @JvmField val FRIDAY = of("FRIDAY")

            @JvmField val SATURDAY = of("SATURDAY")

            @JvmField val SUNDAY = of("SUNDAY")

            @JvmStatic fun of(value: String) = DaysOfWeek(JsonField.of(value))
        }

        /** An enum containing [DaysOfWeek]'s known values. */
        enum class Known {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY,
        }

        /**
         * An enum containing [DaysOfWeek]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DaysOfWeek] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY,
            /**
             * An enum member indicating that [DaysOfWeek] was instantiated with an unknown value.
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
                MONDAY -> Value.MONDAY
                TUESDAY -> Value.TUESDAY
                WEDNESDAY -> Value.WEDNESDAY
                THURSDAY -> Value.THURSDAY
                FRIDAY -> Value.FRIDAY
                SATURDAY -> Value.SATURDAY
                SUNDAY -> Value.SUNDAY
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
                MONDAY -> Known.MONDAY
                TUESDAY -> Known.TUESDAY
                WEDNESDAY -> Known.WEDNESDAY
                THURSDAY -> Known.THURSDAY
                FRIDAY -> Known.FRIDAY
                SATURDAY -> Known.SATURDAY
                SUNDAY -> Known.SUNDAY
                else -> throw HubSpotInvalidDataException("Unknown DaysOfWeek: $value")
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

        fun validate(): DaysOfWeek = apply {
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

            return other is DaysOfWeek && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TimeUnit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NANOS = of("NANOS")

            @JvmField val MICROS = of("MICROS")

            @JvmField val MILLIS = of("MILLIS")

            @JvmField val SECONDS = of("SECONDS")

            @JvmField val MINUTES = of("MINUTES")

            @JvmField val HOURS = of("HOURS")

            @JvmField val HALF_DAYS = of("HALF_DAYS")

            @JvmField val DAYS = of("DAYS")

            @JvmField val WEEKS = of("WEEKS")

            @JvmField val MONTHS = of("MONTHS")

            @JvmField val YEARS = of("YEARS")

            @JvmField val DECADES = of("DECADES")

            @JvmField val CENTURIES = of("CENTURIES")

            @JvmField val MILLENNIA = of("MILLENNIA")

            @JvmField val ERAS = of("ERAS")

            @JvmField val FOREVER = of("FOREVER")

            @JvmStatic fun of(value: String) = TimeUnit(JsonField.of(value))
        }

        /** An enum containing [TimeUnit]'s known values. */
        enum class Known {
            NANOS,
            MICROS,
            MILLIS,
            SECONDS,
            MINUTES,
            HOURS,
            HALF_DAYS,
            DAYS,
            WEEKS,
            MONTHS,
            YEARS,
            DECADES,
            CENTURIES,
            MILLENNIA,
            ERAS,
            FOREVER,
        }

        /**
         * An enum containing [TimeUnit]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimeUnit] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NANOS,
            MICROS,
            MILLIS,
            SECONDS,
            MINUTES,
            HOURS,
            HALF_DAYS,
            DAYS,
            WEEKS,
            MONTHS,
            YEARS,
            DECADES,
            CENTURIES,
            MILLENNIA,
            ERAS,
            FOREVER,
            /** An enum member indicating that [TimeUnit] was instantiated with an unknown value. */
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
                NANOS -> Value.NANOS
                MICROS -> Value.MICROS
                MILLIS -> Value.MILLIS
                SECONDS -> Value.SECONDS
                MINUTES -> Value.MINUTES
                HOURS -> Value.HOURS
                HALF_DAYS -> Value.HALF_DAYS
                DAYS -> Value.DAYS
                WEEKS -> Value.WEEKS
                MONTHS -> Value.MONTHS
                YEARS -> Value.YEARS
                DECADES -> Value.DECADES
                CENTURIES -> Value.CENTURIES
                MILLENNIA -> Value.MILLENNIA
                ERAS -> Value.ERAS
                FOREVER -> Value.FOREVER
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
                NANOS -> Known.NANOS
                MICROS -> Known.MICROS
                MILLIS -> Known.MILLIS
                SECONDS -> Known.SECONDS
                MINUTES -> Known.MINUTES
                HOURS -> Known.HOURS
                HALF_DAYS -> Known.HALF_DAYS
                DAYS -> Known.DAYS
                WEEKS -> Known.WEEKS
                MONTHS -> Known.MONTHS
                YEARS -> Known.YEARS
                DECADES -> Known.DECADES
                CENTURIES -> Known.CENTURIES
                MILLENNIA -> Known.MILLENNIA
                ERAS -> Known.ERAS
                FOREVER -> Known.FOREVER
                else -> throw HubSpotInvalidDataException("Unknown TimeUnit: $value")
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

        fun validate(): TimeUnit = apply {
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

            return other is TimeUnit && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiTimeDelay &&
            daysOfWeek == other.daysOfWeek &&
            delta == other.delta &&
            timeUnit == other.timeUnit &&
            timeOfDay == other.timeOfDay &&
            timeZoneStrategy == other.timeZoneStrategy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(daysOfWeek, delta, timeUnit, timeOfDay, timeZoneStrategy, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiTimeDelay{daysOfWeek=$daysOfWeek, delta=$delta, timeUnit=$timeUnit, timeOfDay=$timeOfDay, timeZoneStrategy=$timeZoneStrategy, additionalProperties=$additionalProperties}"
}
