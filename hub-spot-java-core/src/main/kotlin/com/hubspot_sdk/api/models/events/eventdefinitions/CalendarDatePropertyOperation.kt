// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CalendarDatePropertyOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val operationType: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val operatorName: JsonField<String>,
    private val propertyType: JsonField<PropertyType>,
    private val timeUnit: JsonField<TimeUnit>,
    private val timeUnitCount: JsonField<Int>,
    private val useFiscalYear: JsonField<Boolean>,
    private val defaultValue: JsonField<String>,
    private val fiscalYearStart: JsonField<FiscalYearStart>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("operationType")
        @ExcludeMissing
        operationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("operatorName")
        @ExcludeMissing
        operatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyType")
        @ExcludeMissing
        propertyType: JsonField<PropertyType> = JsonMissing.of(),
        @JsonProperty("timeUnit") @ExcludeMissing timeUnit: JsonField<TimeUnit> = JsonMissing.of(),
        @JsonProperty("timeUnitCount")
        @ExcludeMissing
        timeUnitCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("useFiscalYear")
        @ExcludeMissing
        useFiscalYear: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("defaultValue")
        @ExcludeMissing
        defaultValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiscalYearStart")
        @ExcludeMissing
        fiscalYearStart: JsonField<FiscalYearStart> = JsonMissing.of(),
    ) : this(
        includeObjectsWithNoValueSet,
        operationType,
        operator,
        operatorName,
        propertyType,
        timeUnit,
        timeUnitCount,
        useFiscalYear,
        defaultValue,
        fiscalYearStart,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeObjectsWithNoValueSet(): Boolean =
        includeObjectsWithNoValueSet.getRequired("includeObjectsWithNoValueSet")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): String = operationType.getRequired("operationType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operatorName(): String = operatorName.getRequired("operatorName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyType(): PropertyType = propertyType.getRequired("propertyType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeUnit(): TimeUnit = timeUnit.getRequired("timeUnit")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeUnitCount(): Int = timeUnitCount.getRequired("timeUnitCount")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useFiscalYear(): Boolean = useFiscalYear.getRequired("useFiscalYear")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultValue(): Optional<String> = defaultValue.getOptional("defaultValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fiscalYearStart(): Optional<FiscalYearStart> =
        fiscalYearStart.getOptional("fiscalYearStart")

    /**
     * Returns the raw JSON value of [includeObjectsWithNoValueSet].
     *
     * Unlike [includeObjectsWithNoValueSet], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeObjectsWithNoValueSet")
    @ExcludeMissing
    fun _includeObjectsWithNoValueSet(): JsonField<Boolean> = includeObjectsWithNoValueSet

    /**
     * Returns the raw JSON value of [operationType].
     *
     * Unlike [operationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operationType")
    @ExcludeMissing
    fun _operationType(): JsonField<String> = operationType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [operatorName].
     *
     * Unlike [operatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatorName")
    @ExcludeMissing
    fun _operatorName(): JsonField<String> = operatorName

    /**
     * Returns the raw JSON value of [propertyType].
     *
     * Unlike [propertyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyType")
    @ExcludeMissing
    fun _propertyType(): JsonField<PropertyType> = propertyType

    /**
     * Returns the raw JSON value of [timeUnit].
     *
     * Unlike [timeUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeUnit") @ExcludeMissing fun _timeUnit(): JsonField<TimeUnit> = timeUnit

    /**
     * Returns the raw JSON value of [timeUnitCount].
     *
     * Unlike [timeUnitCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeUnitCount")
    @ExcludeMissing
    fun _timeUnitCount(): JsonField<Int> = timeUnitCount

    /**
     * Returns the raw JSON value of [useFiscalYear].
     *
     * Unlike [useFiscalYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useFiscalYear")
    @ExcludeMissing
    fun _useFiscalYear(): JsonField<Boolean> = useFiscalYear

    /**
     * Returns the raw JSON value of [defaultValue].
     *
     * Unlike [defaultValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultValue")
    @ExcludeMissing
    fun _defaultValue(): JsonField<String> = defaultValue

    /**
     * Returns the raw JSON value of [fiscalYearStart].
     *
     * Unlike [fiscalYearStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fiscalYearStart")
    @ExcludeMissing
    fun _fiscalYearStart(): JsonField<FiscalYearStart> = fiscalYearStart

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
         * Returns a mutable builder for constructing an instance of
         * [CalendarDatePropertyOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * .timeUnit()
         * .timeUnitCount()
         * .useFiscalYear()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalendarDatePropertyOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var operationType: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var operatorName: JsonField<String>? = null
        private var propertyType: JsonField<PropertyType>? = null
        private var timeUnit: JsonField<TimeUnit>? = null
        private var timeUnitCount: JsonField<Int>? = null
        private var useFiscalYear: JsonField<Boolean>? = null
        private var defaultValue: JsonField<String> = JsonMissing.of()
        private var fiscalYearStart: JsonField<FiscalYearStart> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(calendarDatePropertyOperation: CalendarDatePropertyOperation) = apply {
            includeObjectsWithNoValueSet =
                calendarDatePropertyOperation.includeObjectsWithNoValueSet
            operationType = calendarDatePropertyOperation.operationType
            operator = calendarDatePropertyOperation.operator
            operatorName = calendarDatePropertyOperation.operatorName
            propertyType = calendarDatePropertyOperation.propertyType
            timeUnit = calendarDatePropertyOperation.timeUnit
            timeUnitCount = calendarDatePropertyOperation.timeUnitCount
            useFiscalYear = calendarDatePropertyOperation.useFiscalYear
            defaultValue = calendarDatePropertyOperation.defaultValue
            fiscalYearStart = calendarDatePropertyOperation.fiscalYearStart
            additionalProperties = calendarDatePropertyOperation.additionalProperties.toMutableMap()
        }

        fun includeObjectsWithNoValueSet(includeObjectsWithNoValueSet: Boolean) =
            includeObjectsWithNoValueSet(JsonField.of(includeObjectsWithNoValueSet))

        /**
         * Sets [Builder.includeObjectsWithNoValueSet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeObjectsWithNoValueSet] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun includeObjectsWithNoValueSet(includeObjectsWithNoValueSet: JsonField<Boolean>) = apply {
            this.includeObjectsWithNoValueSet = includeObjectsWithNoValueSet
        }

        fun operationType(operationType: String) = operationType(JsonField.of(operationType))

        /**
         * Sets [Builder.operationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operationType(operationType: JsonField<String>) = apply {
            this.operationType = operationType
        }

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        fun operatorName(operatorName: String) = operatorName(JsonField.of(operatorName))

        /**
         * Sets [Builder.operatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operatorName(operatorName: JsonField<String>) = apply {
            this.operatorName = operatorName
        }

        fun propertyType(propertyType: PropertyType) = propertyType(JsonField.of(propertyType))

        /**
         * Sets [Builder.propertyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyType] with a well-typed [PropertyType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun propertyType(propertyType: JsonField<PropertyType>) = apply {
            this.propertyType = propertyType
        }

        fun timeUnit(timeUnit: TimeUnit) = timeUnit(JsonField.of(timeUnit))

        /**
         * Sets [Builder.timeUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUnit] with a well-typed [TimeUnit] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeUnit(timeUnit: JsonField<TimeUnit>) = apply { this.timeUnit = timeUnit }

        fun timeUnitCount(timeUnitCount: Int) = timeUnitCount(JsonField.of(timeUnitCount))

        /**
         * Sets [Builder.timeUnitCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUnitCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeUnitCount(timeUnitCount: JsonField<Int>) = apply {
            this.timeUnitCount = timeUnitCount
        }

        fun useFiscalYear(useFiscalYear: Boolean) = useFiscalYear(JsonField.of(useFiscalYear))

        /**
         * Sets [Builder.useFiscalYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useFiscalYear] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useFiscalYear(useFiscalYear: JsonField<Boolean>) = apply {
            this.useFiscalYear = useFiscalYear
        }

        fun defaultValue(defaultValue: String) = defaultValue(JsonField.of(defaultValue))

        /**
         * Sets [Builder.defaultValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultValue(defaultValue: JsonField<String>) = apply {
            this.defaultValue = defaultValue
        }

        fun fiscalYearStart(fiscalYearStart: FiscalYearStart) =
            fiscalYearStart(JsonField.of(fiscalYearStart))

        /**
         * Sets [Builder.fiscalYearStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fiscalYearStart] with a well-typed [FiscalYearStart]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fiscalYearStart(fiscalYearStart: JsonField<FiscalYearStart>) = apply {
            this.fiscalYearStart = fiscalYearStart
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
         * Returns an immutable instance of [CalendarDatePropertyOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * .timeUnit()
         * .timeUnitCount()
         * .useFiscalYear()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CalendarDatePropertyOperation =
            CalendarDatePropertyOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("operatorName", operatorName),
                checkRequired("propertyType", propertyType),
                checkRequired("timeUnit", timeUnit),
                checkRequired("timeUnitCount", timeUnitCount),
                checkRequired("useFiscalYear", useFiscalYear),
                defaultValue,
                fiscalYearStart,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CalendarDatePropertyOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        operationType()
        operator().validate()
        operatorName()
        propertyType().validate()
        timeUnit().validate()
        timeUnitCount()
        useFiscalYear()
        defaultValue()
        fiscalYearStart().ifPresent { it.validate() }
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
        (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (if (operationType.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatorName.asKnown().isPresent) 1 else 0) +
            (propertyType.asKnown().getOrNull()?.validity() ?: 0) +
            (timeUnit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timeUnitCount.asKnown().isPresent) 1 else 0) +
            (if (useFiscalYear.asKnown().isPresent) 1 else 0) +
            (if (defaultValue.asKnown().isPresent) 1 else 0) +
            (fiscalYearStart.asKnown().getOrNull()?.validity() ?: 0)

    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IN_THIS_TIME_UNIT = of("IN_THIS_TIME_UNIT")

            @JvmField val IN_THIS_TIME_UNIT_SO_FAR = of("IN_THIS_TIME_UNIT_SO_FAR")

            @JvmField val IN_NEXT_TIME_UNIT = of("IN_NEXT_TIME_UNIT")

            @JvmField val IN_LAST_TIME_UNIT = of("IN_LAST_TIME_UNIT")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IN_THIS_TIME_UNIT,
            IN_THIS_TIME_UNIT_SO_FAR,
            IN_NEXT_TIME_UNIT,
            IN_LAST_TIME_UNIT,
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IN_THIS_TIME_UNIT,
            IN_THIS_TIME_UNIT_SO_FAR,
            IN_NEXT_TIME_UNIT,
            IN_LAST_TIME_UNIT,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
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
                IN_THIS_TIME_UNIT -> Value.IN_THIS_TIME_UNIT
                IN_THIS_TIME_UNIT_SO_FAR -> Value.IN_THIS_TIME_UNIT_SO_FAR
                IN_NEXT_TIME_UNIT -> Value.IN_NEXT_TIME_UNIT
                IN_LAST_TIME_UNIT -> Value.IN_LAST_TIME_UNIT
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
                IN_THIS_TIME_UNIT -> Known.IN_THIS_TIME_UNIT
                IN_THIS_TIME_UNIT_SO_FAR -> Known.IN_THIS_TIME_UNIT_SO_FAR
                IN_NEXT_TIME_UNIT -> Known.IN_NEXT_TIME_UNIT
                IN_LAST_TIME_UNIT -> Known.IN_LAST_TIME_UNIT
                else -> throw HubSpotInvalidDataException("Unknown Operator: $value")
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

        fun validate(): Operator = apply {
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

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PropertyType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CALENDAR_DATE = of("calendar-date")

            @JvmStatic fun of(value: String) = PropertyType(JsonField.of(value))
        }

        /** An enum containing [PropertyType]'s known values. */
        enum class Known {
            CALENDAR_DATE
        }

        /**
         * An enum containing [PropertyType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PropertyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALENDAR_DATE,
            /**
             * An enum member indicating that [PropertyType] was instantiated with an unknown value.
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
                CALENDAR_DATE -> Value.CALENDAR_DATE
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
                CALENDAR_DATE -> Known.CALENDAR_DATE
                else -> throw HubSpotInvalidDataException("Unknown PropertyType: $value")
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

        fun validate(): PropertyType = apply {
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

            return other is PropertyType && value == other.value
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

            @JvmField val DAY = of("DAY")

            @JvmField val WEEK = of("WEEK")

            @JvmField val MONTH = of("MONTH")

            @JvmField val QUARTER = of("QUARTER")

            @JvmField val YEAR = of("YEAR")

            @JvmStatic fun of(value: String) = TimeUnit(JsonField.of(value))
        }

        /** An enum containing [TimeUnit]'s known values. */
        enum class Known {
            DAY,
            WEEK,
            MONTH,
            QUARTER,
            YEAR,
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
            DAY,
            WEEK,
            MONTH,
            QUARTER,
            YEAR,
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
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MONTH -> Value.MONTH
                QUARTER -> Value.QUARTER
                YEAR -> Value.YEAR
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
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MONTH -> Known.MONTH
                QUARTER -> Known.QUARTER
                YEAR -> Known.YEAR
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

    class FiscalYearStart @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val JANUARY = of("JANUARY")

            @JvmField val FEBRUARY = of("FEBRUARY")

            @JvmField val MARCH = of("MARCH")

            @JvmField val APRIL = of("APRIL")

            @JvmField val MAY = of("MAY")

            @JvmField val JUNE = of("JUNE")

            @JvmField val JULY = of("JULY")

            @JvmField val AUGUST = of("AUGUST")

            @JvmField val SEPTEMBER = of("SEPTEMBER")

            @JvmField val OCTOBER = of("OCTOBER")

            @JvmField val NOVEMBER = of("NOVEMBER")

            @JvmField val DECEMBER = of("DECEMBER")

            @JvmStatic fun of(value: String) = FiscalYearStart(JsonField.of(value))
        }

        /** An enum containing [FiscalYearStart]'s known values. */
        enum class Known {
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER,
        }

        /**
         * An enum containing [FiscalYearStart]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FiscalYearStart] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER,
            /**
             * An enum member indicating that [FiscalYearStart] was instantiated with an unknown
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
                JANUARY -> Value.JANUARY
                FEBRUARY -> Value.FEBRUARY
                MARCH -> Value.MARCH
                APRIL -> Value.APRIL
                MAY -> Value.MAY
                JUNE -> Value.JUNE
                JULY -> Value.JULY
                AUGUST -> Value.AUGUST
                SEPTEMBER -> Value.SEPTEMBER
                OCTOBER -> Value.OCTOBER
                NOVEMBER -> Value.NOVEMBER
                DECEMBER -> Value.DECEMBER
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
                JANUARY -> Known.JANUARY
                FEBRUARY -> Known.FEBRUARY
                MARCH -> Known.MARCH
                APRIL -> Known.APRIL
                MAY -> Known.MAY
                JUNE -> Known.JUNE
                JULY -> Known.JULY
                AUGUST -> Known.AUGUST
                SEPTEMBER -> Known.SEPTEMBER
                OCTOBER -> Known.OCTOBER
                NOVEMBER -> Known.NOVEMBER
                DECEMBER -> Known.DECEMBER
                else -> throw HubSpotInvalidDataException("Unknown FiscalYearStart: $value")
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

        fun validate(): FiscalYearStart = apply {
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

            return other is FiscalYearStart && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalendarDatePropertyOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            operationType == other.operationType &&
            operator == other.operator &&
            operatorName == other.operatorName &&
            propertyType == other.propertyType &&
            timeUnit == other.timeUnit &&
            timeUnitCount == other.timeUnitCount &&
            useFiscalYear == other.useFiscalYear &&
            defaultValue == other.defaultValue &&
            fiscalYearStart == other.fiscalYearStart &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            operationType,
            operator,
            operatorName,
            propertyType,
            timeUnit,
            timeUnitCount,
            useFiscalYear,
            defaultValue,
            fiscalYearStart,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CalendarDatePropertyOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, operationType=$operationType, operator=$operator, operatorName=$operatorName, propertyType=$propertyType, timeUnit=$timeUnit, timeUnitCount=$timeUnitCount, useFiscalYear=$useFiscalYear, defaultValue=$defaultValue, fiscalYearStart=$fiscalYearStart, additionalProperties=$additionalProperties}"
}
