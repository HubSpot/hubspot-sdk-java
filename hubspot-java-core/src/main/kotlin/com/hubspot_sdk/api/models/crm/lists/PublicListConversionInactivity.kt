// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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

class PublicListConversionInactivity
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val conversionType: JsonField<ConversionType>,
    private val offset: JsonField<Int>,
    private val timeUnit: JsonField<TimeUnit>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("conversionType")
        @ExcludeMissing
        conversionType: JsonField<ConversionType> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timeUnit") @ExcludeMissing timeUnit: JsonField<TimeUnit> = JsonMissing.of(),
    ) : this(conversionType, offset, timeUnit, mutableMapOf())

    /**
     * Specifies the type of conversion (INACTIVITY).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conversionType(): ConversionType = conversionType.getRequired("conversionType")

    /**
     * Value used to paginate through lists. The `offset` provided in the response can be used in
     * the next request to fetch the next page of results. Defaults to `0` if no offset is provided.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offset(): Int = offset.getRequired("offset")

    /**
     * The unit of time for the inactivity period, such as (DAY, MONTH, WEEK).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeUnit(): TimeUnit = timeUnit.getRequired("timeUnit")

    /**
     * Returns the raw JSON value of [conversionType].
     *
     * Unlike [conversionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversionType")
    @ExcludeMissing
    fun _conversionType(): JsonField<ConversionType> = conversionType

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Int> = offset

    /**
     * Returns the raw JSON value of [timeUnit].
     *
     * Unlike [timeUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeUnit") @ExcludeMissing fun _timeUnit(): JsonField<TimeUnit> = timeUnit

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
         * [PublicListConversionInactivity].
         *
         * The following fields are required:
         * ```java
         * .conversionType()
         * .offset()
         * .timeUnit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicListConversionInactivity]. */
    class Builder internal constructor() {

        private var conversionType: JsonField<ConversionType>? = null
        private var offset: JsonField<Int>? = null
        private var timeUnit: JsonField<TimeUnit>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicListConversionInactivity: PublicListConversionInactivity) = apply {
            conversionType = publicListConversionInactivity.conversionType
            offset = publicListConversionInactivity.offset
            timeUnit = publicListConversionInactivity.timeUnit
            additionalProperties =
                publicListConversionInactivity.additionalProperties.toMutableMap()
        }

        /** Specifies the type of conversion (INACTIVITY). */
        fun conversionType(conversionType: ConversionType) =
            conversionType(JsonField.of(conversionType))

        /**
         * Sets [Builder.conversionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionType] with a well-typed [ConversionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversionType(conversionType: JsonField<ConversionType>) = apply {
            this.conversionType = conversionType
        }

        /**
         * Value used to paginate through lists. The `offset` provided in the response can be used
         * in the next request to fetch the next page of results. Defaults to `0` if no offset is
         * provided.
         */
        fun offset(offset: Int) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Int>) = apply { this.offset = offset }

        /** The unit of time for the inactivity period, such as (DAY, MONTH, WEEK). */
        fun timeUnit(timeUnit: TimeUnit) = timeUnit(JsonField.of(timeUnit))

        /**
         * Sets [Builder.timeUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUnit] with a well-typed [TimeUnit] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeUnit(timeUnit: JsonField<TimeUnit>) = apply { this.timeUnit = timeUnit }

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
         * Returns an immutable instance of [PublicListConversionInactivity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .conversionType()
         * .offset()
         * .timeUnit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicListConversionInactivity =
            PublicListConversionInactivity(
                checkRequired("conversionType", conversionType),
                checkRequired("offset", offset),
                checkRequired("timeUnit", timeUnit),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicListConversionInactivity = apply {
        if (validated) {
            return@apply
        }

        conversionType().validate()
        offset()
        timeUnit().validate()
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
        (conversionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (timeUnit.asKnown().getOrNull()?.validity() ?: 0)

    /** Specifies the type of conversion (INACTIVITY). */
    class ConversionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INACTIVITY = of("INACTIVITY")

            @JvmStatic fun of(value: String) = ConversionType(JsonField.of(value))
        }

        /** An enum containing [ConversionType]'s known values. */
        enum class Known {
            INACTIVITY
        }

        /**
         * An enum containing [ConversionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConversionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INACTIVITY,
            /**
             * An enum member indicating that [ConversionType] was instantiated with an unknown
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
                INACTIVITY -> Value.INACTIVITY
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
                INACTIVITY -> Known.INACTIVITY
                else -> throw HubSpotInvalidDataException("Unknown ConversionType: $value")
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

        fun validate(): ConversionType = apply {
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

            return other is ConversionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The unit of time for the inactivity period, such as (DAY, MONTH, WEEK). */
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

            @JvmField val MONTH = of("MONTH")

            @JvmField val WEEK = of("WEEK")

            @JvmStatic fun of(value: String) = TimeUnit(JsonField.of(value))
        }

        /** An enum containing [TimeUnit]'s known values. */
        enum class Known {
            DAY,
            MONTH,
            WEEK,
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
            MONTH,
            WEEK,
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
                MONTH -> Value.MONTH
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
                DAY -> Known.DAY
                MONTH -> Known.MONTH
                WEEK -> Known.WEEK
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

        return other is PublicListConversionInactivity &&
            conversionType == other.conversionType &&
            offset == other.offset &&
            timeUnit == other.timeUnit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(conversionType, offset, timeUnit, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicListConversionInactivity{conversionType=$conversionType, offset=$offset, timeUnit=$timeUnit, additionalProperties=$additionalProperties}"
}
