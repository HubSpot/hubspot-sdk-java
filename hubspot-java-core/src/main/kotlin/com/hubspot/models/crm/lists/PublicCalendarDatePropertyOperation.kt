// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

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

class PublicCalendarDatePropertyOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val operationType: JsonField<OperationType>,
    private val operator: JsonField<String>,
    private val timeUnit: JsonField<String>,
    private val fiscalYearStart: JsonField<FiscalYearStart>,
    private val timeUnitCount: JsonField<Int>,
    private val useFiscalYear: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("operationType")
        @ExcludeMissing
        operationType: JsonField<OperationType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeUnit") @ExcludeMissing timeUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiscalYearStart")
        @ExcludeMissing
        fiscalYearStart: JsonField<FiscalYearStart> = JsonMissing.of(),
        @JsonProperty("timeUnitCount")
        @ExcludeMissing
        timeUnitCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("useFiscalYear")
        @ExcludeMissing
        useFiscalYear: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        includeObjectsWithNoValueSet,
        operationType,
        operator,
        timeUnit,
        fiscalYearStart,
        timeUnitCount,
        useFiscalYear,
        mutableMapOf(),
    )

    /**
     * Indicates whether objects with no value set for the property should be included.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeObjectsWithNoValueSet(): Boolean =
        includeObjectsWithNoValueSet.getRequired("includeObjectsWithNoValueSet")

    /**
     * The type of operation, which is (CALENDAR_DATE).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): OperationType = operationType.getRequired("operationType")

    /**
     * Defines the operation to be applied to the calendar date property (IN_THIS_TIME_UNIT,
     * IN_THIS_TIME_UNIT_SO_FAR, IN_NEXT_TIME_UNIT, IN_LAST_TIME_UNIT).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * The unit of time to be used in the operation (DAY, WEEK, MONTH, QUARTER, YEAR).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeUnit(): String = timeUnit.getRequired("timeUnit")

    /**
     * The month in which the fiscal year starts.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fiscalYearStart(): Optional<FiscalYearStart> =
        fiscalYearStart.getOptional("fiscalYearStart")

    /**
     * The count of time units to be applied in the operation (1).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeUnitCount(): Optional<Int> = timeUnitCount.getOptional("timeUnitCount")

    /**
     * Specifies whether the fiscal year should be used in the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useFiscalYear(): Optional<Boolean> = useFiscalYear.getOptional("useFiscalYear")

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
    fun _operationType(): JsonField<OperationType> = operationType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [timeUnit].
     *
     * Unlike [timeUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeUnit") @ExcludeMissing fun _timeUnit(): JsonField<String> = timeUnit

    /**
     * Returns the raw JSON value of [fiscalYearStart].
     *
     * Unlike [fiscalYearStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fiscalYearStart")
    @ExcludeMissing
    fun _fiscalYearStart(): JsonField<FiscalYearStart> = fiscalYearStart

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
         * [PublicCalendarDatePropertyOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .timeUnit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicCalendarDatePropertyOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var operationType: JsonField<OperationType>? = null
        private var operator: JsonField<String>? = null
        private var timeUnit: JsonField<String>? = null
        private var fiscalYearStart: JsonField<FiscalYearStart> = JsonMissing.of()
        private var timeUnitCount: JsonField<Int> = JsonMissing.of()
        private var useFiscalYear: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicCalendarDatePropertyOperation: PublicCalendarDatePropertyOperation
        ) = apply {
            includeObjectsWithNoValueSet =
                publicCalendarDatePropertyOperation.includeObjectsWithNoValueSet
            operationType = publicCalendarDatePropertyOperation.operationType
            operator = publicCalendarDatePropertyOperation.operator
            timeUnit = publicCalendarDatePropertyOperation.timeUnit
            fiscalYearStart = publicCalendarDatePropertyOperation.fiscalYearStart
            timeUnitCount = publicCalendarDatePropertyOperation.timeUnitCount
            useFiscalYear = publicCalendarDatePropertyOperation.useFiscalYear
            additionalProperties =
                publicCalendarDatePropertyOperation.additionalProperties.toMutableMap()
        }

        /** Indicates whether objects with no value set for the property should be included. */
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

        /** The type of operation, which is (CALENDAR_DATE). */
        fun operationType(operationType: OperationType) = operationType(JsonField.of(operationType))

        /**
         * Sets [Builder.operationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationType] with a well-typed [OperationType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operationType(operationType: JsonField<OperationType>) = apply {
            this.operationType = operationType
        }

        /**
         * Defines the operation to be applied to the calendar date property (IN_THIS_TIME_UNIT,
         * IN_THIS_TIME_UNIT_SO_FAR, IN_NEXT_TIME_UNIT, IN_LAST_TIME_UNIT).
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** The unit of time to be used in the operation (DAY, WEEK, MONTH, QUARTER, YEAR). */
        fun timeUnit(timeUnit: String) = timeUnit(JsonField.of(timeUnit))

        /**
         * Sets [Builder.timeUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUnit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeUnit(timeUnit: JsonField<String>) = apply { this.timeUnit = timeUnit }

        /** The month in which the fiscal year starts. */
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

        /** The count of time units to be applied in the operation (1). */
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

        /** Specifies whether the fiscal year should be used in the operation. */
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
         * Returns an immutable instance of [PublicCalendarDatePropertyOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .timeUnit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicCalendarDatePropertyOperation =
            PublicCalendarDatePropertyOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("timeUnit", timeUnit),
                fiscalYearStart,
                timeUnitCount,
                useFiscalYear,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicCalendarDatePropertyOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        operationType().validate()
        operator()
        timeUnit()
        fiscalYearStart().ifPresent { it.validate() }
        timeUnitCount()
        useFiscalYear()
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
            (operationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (timeUnit.asKnown().isPresent) 1 else 0) +
            (fiscalYearStart.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timeUnitCount.asKnown().isPresent) 1 else 0) +
            (if (useFiscalYear.asKnown().isPresent) 1 else 0)

    /** The type of operation, which is (CALENDAR_DATE). */
    class OperationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CALENDAR_DATE = of("CALENDAR_DATE")

            @JvmStatic fun of(value: String) = OperationType(JsonField.of(value))
        }

        /** An enum containing [OperationType]'s known values. */
        enum class Known {
            CALENDAR_DATE
        }

        /**
         * An enum containing [OperationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OperationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALENDAR_DATE,
            /**
             * An enum member indicating that [OperationType] was instantiated with an unknown
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
                else -> throw HubSpotInvalidDataException("Unknown OperationType: $value")
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

        fun validate(): OperationType = apply {
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

            return other is OperationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The month in which the fiscal year starts. */
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

            @JvmField val APRIL = of("APRIL")

            @JvmField val AUGUST = of("AUGUST")

            @JvmField val DECEMBER = of("DECEMBER")

            @JvmField val FEBRUARY = of("FEBRUARY")

            @JvmField val JANUARY = of("JANUARY")

            @JvmField val JULY = of("JULY")

            @JvmField val JUNE = of("JUNE")

            @JvmField val MARCH = of("MARCH")

            @JvmField val MAY = of("MAY")

            @JvmField val NOVEMBER = of("NOVEMBER")

            @JvmField val OCTOBER = of("OCTOBER")

            @JvmField val SEPTEMBER = of("SEPTEMBER")

            @JvmStatic fun of(value: String) = FiscalYearStart(JsonField.of(value))
        }

        /** An enum containing [FiscalYearStart]'s known values. */
        enum class Known {
            APRIL,
            AUGUST,
            DECEMBER,
            FEBRUARY,
            JANUARY,
            JULY,
            JUNE,
            MARCH,
            MAY,
            NOVEMBER,
            OCTOBER,
            SEPTEMBER,
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
            APRIL,
            AUGUST,
            DECEMBER,
            FEBRUARY,
            JANUARY,
            JULY,
            JUNE,
            MARCH,
            MAY,
            NOVEMBER,
            OCTOBER,
            SEPTEMBER,
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
                APRIL -> Value.APRIL
                AUGUST -> Value.AUGUST
                DECEMBER -> Value.DECEMBER
                FEBRUARY -> Value.FEBRUARY
                JANUARY -> Value.JANUARY
                JULY -> Value.JULY
                JUNE -> Value.JUNE
                MARCH -> Value.MARCH
                MAY -> Value.MAY
                NOVEMBER -> Value.NOVEMBER
                OCTOBER -> Value.OCTOBER
                SEPTEMBER -> Value.SEPTEMBER
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
                APRIL -> Known.APRIL
                AUGUST -> Known.AUGUST
                DECEMBER -> Known.DECEMBER
                FEBRUARY -> Known.FEBRUARY
                JANUARY -> Known.JANUARY
                JULY -> Known.JULY
                JUNE -> Known.JUNE
                MARCH -> Known.MARCH
                MAY -> Known.MAY
                NOVEMBER -> Known.NOVEMBER
                OCTOBER -> Known.OCTOBER
                SEPTEMBER -> Known.SEPTEMBER
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

        return other is PublicCalendarDatePropertyOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            operationType == other.operationType &&
            operator == other.operator &&
            timeUnit == other.timeUnit &&
            fiscalYearStart == other.fiscalYearStart &&
            timeUnitCount == other.timeUnitCount &&
            useFiscalYear == other.useFiscalYear &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            operationType,
            operator,
            timeUnit,
            fiscalYearStart,
            timeUnitCount,
            useFiscalYear,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicCalendarDatePropertyOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, operationType=$operationType, operator=$operator, timeUnit=$timeUnit, fiscalYearStart=$fiscalYearStart, timeUnitCount=$timeUnitCount, useFiscalYear=$useFiscalYear, additionalProperties=$additionalProperties}"
}
