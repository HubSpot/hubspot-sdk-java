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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ApiMonthlySpecificDaysEnrollmentSchedule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val daysOfMonth: JsonField<List<Int>>,
    private val timeOfDay: JsonField<ApiTimeOfDay>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("daysOfMonth")
        @ExcludeMissing
        daysOfMonth: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("timeOfDay")
        @ExcludeMissing
        timeOfDay: JsonField<ApiTimeOfDay> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(daysOfMonth, timeOfDay, type, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daysOfMonth(): List<Int> = daysOfMonth.getRequired("daysOfMonth")

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
     * Returns the raw JSON value of [daysOfMonth].
     *
     * Unlike [daysOfMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daysOfMonth")
    @ExcludeMissing
    fun _daysOfMonth(): JsonField<List<Int>> = daysOfMonth

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
         * [ApiMonthlySpecificDaysEnrollmentSchedule].
         *
         * The following fields are required:
         * ```java
         * .daysOfMonth()
         * .timeOfDay()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiMonthlySpecificDaysEnrollmentSchedule]. */
    class Builder internal constructor() {

        private var daysOfMonth: JsonField<MutableList<Int>>? = null
        private var timeOfDay: JsonField<ApiTimeOfDay>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            apiMonthlySpecificDaysEnrollmentSchedule: ApiMonthlySpecificDaysEnrollmentSchedule
        ) = apply {
            daysOfMonth =
                apiMonthlySpecificDaysEnrollmentSchedule.daysOfMonth.map { it.toMutableList() }
            timeOfDay = apiMonthlySpecificDaysEnrollmentSchedule.timeOfDay
            type = apiMonthlySpecificDaysEnrollmentSchedule.type
            additionalProperties =
                apiMonthlySpecificDaysEnrollmentSchedule.additionalProperties.toMutableMap()
        }

        fun daysOfMonth(daysOfMonth: List<Int>) = daysOfMonth(JsonField.of(daysOfMonth))

        /**
         * Sets [Builder.daysOfMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysOfMonth] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun daysOfMonth(daysOfMonth: JsonField<List<Int>>) = apply {
            this.daysOfMonth = daysOfMonth.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.daysOfMonth].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDaysOfMonth(daysOfMonth: Int) = apply {
            this.daysOfMonth =
                (this.daysOfMonth ?: JsonField.of(mutableListOf())).also {
                    checkKnown("daysOfMonth", it).add(daysOfMonth)
                }
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
         * Returns an immutable instance of [ApiMonthlySpecificDaysEnrollmentSchedule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .daysOfMonth()
         * .timeOfDay()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiMonthlySpecificDaysEnrollmentSchedule =
            ApiMonthlySpecificDaysEnrollmentSchedule(
                checkRequired("daysOfMonth", daysOfMonth).map { it.toImmutable() },
                checkRequired("timeOfDay", timeOfDay),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiMonthlySpecificDaysEnrollmentSchedule = apply {
        if (validated) {
            return@apply
        }

        daysOfMonth()
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
        (daysOfMonth.asKnown().getOrNull()?.size ?: 0) +
            (timeOfDay.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val MONTHLY_SPECIFIC_DAYS = of("MONTHLY_SPECIFIC_DAYS")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            MONTHLY_SPECIFIC_DAYS
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
            MONTHLY_SPECIFIC_DAYS,
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
                MONTHLY_SPECIFIC_DAYS -> Value.MONTHLY_SPECIFIC_DAYS
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
                MONTHLY_SPECIFIC_DAYS -> Known.MONTHLY_SPECIFIC_DAYS
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

        return other is ApiMonthlySpecificDaysEnrollmentSchedule &&
            daysOfMonth == other.daysOfMonth &&
            timeOfDay == other.timeOfDay &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(daysOfMonth, timeOfDay, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiMonthlySpecificDaysEnrollmentSchedule{daysOfMonth=$daysOfMonth, timeOfDay=$timeOfDay, type=$type, additionalProperties=$additionalProperties}"
}
