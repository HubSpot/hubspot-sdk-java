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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicListConversionDate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val conversionType: JsonField<ConversionType>,
    private val day: JsonField<Int>,
    private val month: JsonField<Int>,
    private val year: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("conversionType")
        @ExcludeMissing
        conversionType: JsonField<ConversionType> = JsonMissing.of(),
        @JsonProperty("day") @ExcludeMissing day: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("month") @ExcludeMissing month: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing year: JsonField<Int> = JsonMissing.of(),
    ) : this(conversionType, day, month, year, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conversionType(): ConversionType = conversionType.getRequired("conversionType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun day(): Int = day.getRequired("day")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun month(): Int = month.getRequired("month")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun year(): Int = year.getRequired("year")

    /**
     * Returns the raw JSON value of [conversionType].
     *
     * Unlike [conversionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversionType")
    @ExcludeMissing
    fun _conversionType(): JsonField<ConversionType> = conversionType

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
     * Returns the raw JSON value of [year].
     *
     * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Int> = year

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
         * Returns a mutable builder for constructing an instance of [PublicListConversionDate].
         *
         * The following fields are required:
         * ```java
         * .conversionType()
         * .day()
         * .month()
         * .year()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicListConversionDate]. */
    class Builder internal constructor() {

        private var conversionType: JsonField<ConversionType>? = null
        private var day: JsonField<Int>? = null
        private var month: JsonField<Int>? = null
        private var year: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicListConversionDate: PublicListConversionDate) = apply {
            conversionType = publicListConversionDate.conversionType
            day = publicListConversionDate.day
            month = publicListConversionDate.month
            year = publicListConversionDate.year
            additionalProperties = publicListConversionDate.additionalProperties.toMutableMap()
        }

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

        fun day(day: Int) = day(JsonField.of(day))

        /**
         * Sets [Builder.day] to an arbitrary JSON value.
         *
         * You should usually call [Builder.day] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun day(day: JsonField<Int>) = apply { this.day = day }

        fun month(month: Int) = month(JsonField.of(month))

        /**
         * Sets [Builder.month] to an arbitrary JSON value.
         *
         * You should usually call [Builder.month] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun month(month: JsonField<Int>) = apply { this.month = month }

        fun year(year: Int) = year(JsonField.of(year))

        /**
         * Sets [Builder.year] to an arbitrary JSON value.
         *
         * You should usually call [Builder.year] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun year(year: JsonField<Int>) = apply { this.year = year }

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
         * Returns an immutable instance of [PublicListConversionDate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .conversionType()
         * .day()
         * .month()
         * .year()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicListConversionDate =
            PublicListConversionDate(
                checkRequired("conversionType", conversionType),
                checkRequired("day", day),
                checkRequired("month", month),
                checkRequired("year", year),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicListConversionDate = apply {
        if (validated) {
            return@apply
        }

        conversionType().validate()
        day()
        month()
        year()
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
        (conversionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (day.asKnown().isPresent) 1 else 0) +
            (if (month.asKnown().isPresent) 1 else 0) +
            (if (year.asKnown().isPresent) 1 else 0)

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

            @JvmField val CONVERSION_DATE = of("CONVERSION_DATE")

            @JvmStatic fun of(value: String) = ConversionType(JsonField.of(value))
        }

        /** An enum containing [ConversionType]'s known values. */
        enum class Known {
            CONVERSION_DATE
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
            CONVERSION_DATE,
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
                CONVERSION_DATE -> Value.CONVERSION_DATE
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
                CONVERSION_DATE -> Known.CONVERSION_DATE
                else -> throw HubspotInvalidDataException("Unknown ConversionType: $value")
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

            return other is ConversionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicListConversionDate &&
            conversionType == other.conversionType &&
            day == other.day &&
            month == other.month &&
            year == other.year &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(conversionType, day, month, year, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicListConversionDate{conversionType=$conversionType, day=$day, month=$month, year=$year, additionalProperties=$additionalProperties}"
}
