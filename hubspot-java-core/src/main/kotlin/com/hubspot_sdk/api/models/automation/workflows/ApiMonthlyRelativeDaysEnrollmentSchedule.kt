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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ApiMonthlyRelativeDaysEnrollmentSchedule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val monthlyRelativeDays: JsonField<MonthlyRelativeDays>,
    private val timeOfDay: JsonField<ApiTimeOfDay>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("monthlyRelativeDays")
        @ExcludeMissing
        monthlyRelativeDays: JsonField<MonthlyRelativeDays> = JsonMissing.of(),
        @JsonProperty("timeOfDay")
        @ExcludeMissing
        timeOfDay: JsonField<ApiTimeOfDay> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(monthlyRelativeDays, timeOfDay, type, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun monthlyRelativeDays(): MonthlyRelativeDays =
        monthlyRelativeDays.getRequired("monthlyRelativeDays")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeOfDay(): ApiTimeOfDay = timeOfDay.getRequired("timeOfDay")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [monthlyRelativeDays].
     *
     * Unlike [monthlyRelativeDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("monthlyRelativeDays")
    @ExcludeMissing
    fun _monthlyRelativeDays(): JsonField<MonthlyRelativeDays> = monthlyRelativeDays

    /**
     * Returns the raw JSON value of [timeOfDay].
     *
     * Unlike [timeOfDay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeOfDay") @ExcludeMissing fun _timeOfDay(): JsonField<ApiTimeOfDay> = timeOfDay

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [ApiMonthlyRelativeDaysEnrollmentSchedule].
         *
         * The following fields are required:
         * ```java
         * .monthlyRelativeDays()
         * .timeOfDay()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiMonthlyRelativeDaysEnrollmentSchedule]. */
    class Builder internal constructor() {

        private var monthlyRelativeDays: JsonField<MonthlyRelativeDays>? = null
        private var timeOfDay: JsonField<ApiTimeOfDay>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            apiMonthlyRelativeDaysEnrollmentSchedule: ApiMonthlyRelativeDaysEnrollmentSchedule
        ) = apply {
            monthlyRelativeDays = apiMonthlyRelativeDaysEnrollmentSchedule.monthlyRelativeDays
            timeOfDay = apiMonthlyRelativeDaysEnrollmentSchedule.timeOfDay
            type = apiMonthlyRelativeDaysEnrollmentSchedule.type
            additionalProperties =
                apiMonthlyRelativeDaysEnrollmentSchedule.additionalProperties.toMutableMap()
        }

        fun monthlyRelativeDays(monthlyRelativeDays: MonthlyRelativeDays) =
            monthlyRelativeDays(JsonField.of(monthlyRelativeDays))

        /**
         * Sets [Builder.monthlyRelativeDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyRelativeDays] with a well-typed
         * [MonthlyRelativeDays] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun monthlyRelativeDays(monthlyRelativeDays: JsonField<MonthlyRelativeDays>) = apply {
            this.monthlyRelativeDays = monthlyRelativeDays
        }

        fun timeOfDay(timeOfDay: ApiTimeOfDay) = timeOfDay(JsonField.of(timeOfDay))

        /**
         * Sets [Builder.timeOfDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeOfDay] with a well-typed [ApiTimeOfDay] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeOfDay(timeOfDay: JsonField<ApiTimeOfDay>) = apply { this.timeOfDay = timeOfDay }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [ApiMonthlyRelativeDaysEnrollmentSchedule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .monthlyRelativeDays()
         * .timeOfDay()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiMonthlyRelativeDaysEnrollmentSchedule =
            ApiMonthlyRelativeDaysEnrollmentSchedule(
                checkRequired("monthlyRelativeDays", monthlyRelativeDays),
                checkRequired("timeOfDay", timeOfDay),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiMonthlyRelativeDaysEnrollmentSchedule = apply {
        if (validated) {
            return@apply
        }

        monthlyRelativeDays().validate()
        timeOfDay().validate()
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (monthlyRelativeDays.asKnown().getOrNull()?.validity() ?: 0) +
            (timeOfDay.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class MonthlyRelativeDays
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

            @JvmField val LAST_DAY_OF_MONTH = of("LAST_DAY_OF_MONTH")

            @JvmField val FIRST_MONDAY_OF_MONTH = of("FIRST_MONDAY_OF_MONTH")

            @JvmStatic fun of(value: String) = MonthlyRelativeDays(JsonField.of(value))
        }

        /** An enum containing [MonthlyRelativeDays]'s known values. */
        enum class Known {
            LAST_DAY_OF_MONTH,
            FIRST_MONDAY_OF_MONTH,
        }

        /**
         * An enum containing [MonthlyRelativeDays]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MonthlyRelativeDays] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LAST_DAY_OF_MONTH,
            FIRST_MONDAY_OF_MONTH,
            /**
             * An enum member indicating that [MonthlyRelativeDays] was instantiated with an unknown
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
                LAST_DAY_OF_MONTH -> Value.LAST_DAY_OF_MONTH
                FIRST_MONDAY_OF_MONTH -> Value.FIRST_MONDAY_OF_MONTH
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
                LAST_DAY_OF_MONTH -> Known.LAST_DAY_OF_MONTH
                FIRST_MONDAY_OF_MONTH -> Known.FIRST_MONDAY_OF_MONTH
                else -> throw HubspotInvalidDataException("Unknown MonthlyRelativeDays: $value")
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

        fun validate(): MonthlyRelativeDays = apply {
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

            return other is MonthlyRelativeDays && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MONTHLY_RELATIVE_DAYS = of("MONTHLY_RELATIVE_DAYS")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            MONTHLY_RELATIVE_DAYS
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONTHLY_RELATIVE_DAYS,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                MONTHLY_RELATIVE_DAYS -> Value.MONTHLY_RELATIVE_DAYS
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
                MONTHLY_RELATIVE_DAYS -> Known.MONTHLY_RELATIVE_DAYS
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiMonthlyRelativeDaysEnrollmentSchedule &&
            monthlyRelativeDays == other.monthlyRelativeDays &&
            timeOfDay == other.timeOfDay &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(monthlyRelativeDays, timeOfDay, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiMonthlyRelativeDaysEnrollmentSchedule{monthlyRelativeDays=$monthlyRelativeDays, timeOfDay=$timeOfDay, type=$type, additionalProperties=$additionalProperties}"
}
