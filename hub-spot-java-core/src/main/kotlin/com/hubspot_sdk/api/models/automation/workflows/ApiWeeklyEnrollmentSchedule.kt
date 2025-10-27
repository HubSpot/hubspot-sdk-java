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
import kotlin.jvm.optionals.getOrNull

class ApiWeeklyEnrollmentSchedule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val daysOfWeek: JsonField<List<DaysOfWeek>>,
    private val timeOfDay: JsonField<ApiTimeOfDay>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("daysOfWeek")
        @ExcludeMissing
        daysOfWeek: JsonField<List<DaysOfWeek>> = JsonMissing.of(),
        @JsonProperty("timeOfDay")
        @ExcludeMissing
        timeOfDay: JsonField<ApiTimeOfDay> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(daysOfWeek, timeOfDay, type, mutableMapOf())

    /**
     * Which days of the week to allow enrollments.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daysOfWeek(): List<DaysOfWeek> = daysOfWeek.getRequired("daysOfWeek")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeOfDay(): ApiTimeOfDay = timeOfDay.getRequired("timeOfDay")

    /**
     * The type of enrollment schedule this is, can be: "DAILY", "WEEKLY", "MONTHLY_SPECIFIC_DAYS",
     * "MONTHLY_RELATIVE_DAYS", "YEARLY"
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [daysOfWeek].
     *
     * Unlike [daysOfWeek], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daysOfWeek")
    @ExcludeMissing
    fun _daysOfWeek(): JsonField<List<DaysOfWeek>> = daysOfWeek

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
         * Returns a mutable builder for constructing an instance of [ApiWeeklyEnrollmentSchedule].
         *
         * The following fields are required:
         * ```java
         * .daysOfWeek()
         * .timeOfDay()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiWeeklyEnrollmentSchedule]. */
    class Builder internal constructor() {

        private var daysOfWeek: JsonField<MutableList<DaysOfWeek>>? = null
        private var timeOfDay: JsonField<ApiTimeOfDay>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiWeeklyEnrollmentSchedule: ApiWeeklyEnrollmentSchedule) = apply {
            daysOfWeek = apiWeeklyEnrollmentSchedule.daysOfWeek.map { it.toMutableList() }
            timeOfDay = apiWeeklyEnrollmentSchedule.timeOfDay
            type = apiWeeklyEnrollmentSchedule.type
            additionalProperties = apiWeeklyEnrollmentSchedule.additionalProperties.toMutableMap()
        }

        /** Which days of the week to allow enrollments. */
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

        fun timeOfDay(timeOfDay: ApiTimeOfDay) = timeOfDay(JsonField.of(timeOfDay))

        /**
         * Sets [Builder.timeOfDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeOfDay] with a well-typed [ApiTimeOfDay] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeOfDay(timeOfDay: JsonField<ApiTimeOfDay>) = apply { this.timeOfDay = timeOfDay }

        /**
         * The type of enrollment schedule this is, can be: "DAILY", "WEEKLY",
         * "MONTHLY_SPECIFIC_DAYS", "MONTHLY_RELATIVE_DAYS", "YEARLY"
         */
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
         * Returns an immutable instance of [ApiWeeklyEnrollmentSchedule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .daysOfWeek()
         * .timeOfDay()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiWeeklyEnrollmentSchedule =
            ApiWeeklyEnrollmentSchedule(
                checkRequired("daysOfWeek", daysOfWeek).map { it.toImmutable() },
                checkRequired("timeOfDay", timeOfDay),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiWeeklyEnrollmentSchedule = apply {
        if (validated) {
            return@apply
        }

        daysOfWeek().forEach { it.validate() }
        timeOfDay().validate()
        type().validate()
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
            (timeOfDay.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

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

    /**
     * The type of enrollment schedule this is, can be: "DAILY", "WEEKLY", "MONTHLY_SPECIFIC_DAYS",
     * "MONTHLY_RELATIVE_DAYS", "YEARLY"
     */
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

            @JvmField val WEEKLY = of("WEEKLY")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WEEKLY
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
            WEEKLY,
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
                WEEKLY -> Value.WEEKLY
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
                WEEKLY -> Known.WEEKLY
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiWeeklyEnrollmentSchedule &&
            daysOfWeek == other.daysOfWeek &&
            timeOfDay == other.timeOfDay &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(daysOfWeek, timeOfDay, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiWeeklyEnrollmentSchedule{daysOfWeek=$daysOfWeek, timeOfDay=$timeOfDay, type=$type, additionalProperties=$additionalProperties}"
}
