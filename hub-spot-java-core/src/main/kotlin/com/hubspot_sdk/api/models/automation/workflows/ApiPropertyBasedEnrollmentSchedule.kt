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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ApiPropertyBasedEnrollmentSchedule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dateProperty: JsonField<String>,
    private val daysDelta: JsonField<Int>,
    private val timeOfDay: JsonField<ApiTimeOfDay>,
    private val type: JsonField<Type>,
    private val yearly: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dateProperty")
        @ExcludeMissing
        dateProperty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daysDelta") @ExcludeMissing daysDelta: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timeOfDay")
        @ExcludeMissing
        timeOfDay: JsonField<ApiTimeOfDay> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("yearly") @ExcludeMissing yearly: JsonField<Boolean> = JsonMissing.of(),
    ) : this(dateProperty, daysDelta, timeOfDay, type, yearly, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateProperty(): String = dateProperty.getRequired("dateProperty")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daysDelta(): Int = daysDelta.getRequired("daysDelta")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeOfDay(): ApiTimeOfDay = timeOfDay.getRequired("timeOfDay")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun yearly(): Boolean = yearly.getRequired("yearly")

    /**
     * Returns the raw JSON value of [dateProperty].
     *
     * Unlike [dateProperty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateProperty")
    @ExcludeMissing
    fun _dateProperty(): JsonField<String> = dateProperty

    /**
     * Returns the raw JSON value of [daysDelta].
     *
     * Unlike [daysDelta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daysDelta") @ExcludeMissing fun _daysDelta(): JsonField<Int> = daysDelta

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

    /**
     * Returns the raw JSON value of [yearly].
     *
     * Unlike [yearly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yearly") @ExcludeMissing fun _yearly(): JsonField<Boolean> = yearly

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
         * [ApiPropertyBasedEnrollmentSchedule].
         *
         * The following fields are required:
         * ```java
         * .dateProperty()
         * .daysDelta()
         * .timeOfDay()
         * .type()
         * .yearly()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiPropertyBasedEnrollmentSchedule]. */
    class Builder internal constructor() {

        private var dateProperty: JsonField<String>? = null
        private var daysDelta: JsonField<Int>? = null
        private var timeOfDay: JsonField<ApiTimeOfDay>? = null
        private var type: JsonField<Type>? = null
        private var yearly: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiPropertyBasedEnrollmentSchedule: ApiPropertyBasedEnrollmentSchedule) =
            apply {
                dateProperty = apiPropertyBasedEnrollmentSchedule.dateProperty
                daysDelta = apiPropertyBasedEnrollmentSchedule.daysDelta
                timeOfDay = apiPropertyBasedEnrollmentSchedule.timeOfDay
                type = apiPropertyBasedEnrollmentSchedule.type
                yearly = apiPropertyBasedEnrollmentSchedule.yearly
                additionalProperties =
                    apiPropertyBasedEnrollmentSchedule.additionalProperties.toMutableMap()
            }

        fun dateProperty(dateProperty: String) = dateProperty(JsonField.of(dateProperty))

        /**
         * Sets [Builder.dateProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateProperty] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateProperty(dateProperty: JsonField<String>) = apply {
            this.dateProperty = dateProperty
        }

        fun daysDelta(daysDelta: Int) = daysDelta(JsonField.of(daysDelta))

        /**
         * Sets [Builder.daysDelta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysDelta] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun daysDelta(daysDelta: JsonField<Int>) = apply { this.daysDelta = daysDelta }

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

        fun yearly(yearly: Boolean) = yearly(JsonField.of(yearly))

        /**
         * Sets [Builder.yearly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yearly] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yearly(yearly: JsonField<Boolean>) = apply { this.yearly = yearly }

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
         * Returns an immutable instance of [ApiPropertyBasedEnrollmentSchedule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dateProperty()
         * .daysDelta()
         * .timeOfDay()
         * .type()
         * .yearly()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiPropertyBasedEnrollmentSchedule =
            ApiPropertyBasedEnrollmentSchedule(
                checkRequired("dateProperty", dateProperty),
                checkRequired("daysDelta", daysDelta),
                checkRequired("timeOfDay", timeOfDay),
                checkRequired("type", type),
                checkRequired("yearly", yearly),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiPropertyBasedEnrollmentSchedule = apply {
        if (validated) {
            return@apply
        }

        dateProperty()
        daysDelta()
        timeOfDay().validate()
        type().validate()
        yearly()
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
        (if (dateProperty.asKnown().isPresent) 1 else 0) +
            (if (daysDelta.asKnown().isPresent) 1 else 0) +
            (timeOfDay.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (yearly.asKnown().isPresent) 1 else 0)

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

            @JvmField val PROPERTY_BASED = of("PROPERTY_BASED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PROPERTY_BASED
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
            PROPERTY_BASED,
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
                PROPERTY_BASED -> Value.PROPERTY_BASED
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
                PROPERTY_BASED -> Known.PROPERTY_BASED
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

        return other is ApiPropertyBasedEnrollmentSchedule &&
            dateProperty == other.dateProperty &&
            daysDelta == other.daysDelta &&
            timeOfDay == other.timeOfDay &&
            type == other.type &&
            yearly == other.yearly &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dateProperty, daysDelta, timeOfDay, type, yearly, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiPropertyBasedEnrollmentSchedule{dateProperty=$dateProperty, daysDelta=$daysDelta, timeOfDay=$timeOfDay, type=$type, yearly=$yearly, additionalProperties=$additionalProperties}"
}
