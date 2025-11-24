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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiStaticDateAnchor
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dayOfMonth: JsonField<Int>,
    private val month: JsonField<Month>,
    private val type: JsonField<Type>,
    private val year: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dayOfMonth") @ExcludeMissing dayOfMonth: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("month") @ExcludeMissing month: JsonField<Month> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing year: JsonField<Int> = JsonMissing.of(),
    ) : this(dayOfMonth, month, type, year, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dayOfMonth(): Int = dayOfMonth.getRequired("dayOfMonth")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun month(): Month = month.getRequired("month")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun year(): Optional<Int> = year.getOptional("year")

    /**
     * Returns the raw JSON value of [dayOfMonth].
     *
     * Unlike [dayOfMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dayOfMonth") @ExcludeMissing fun _dayOfMonth(): JsonField<Int> = dayOfMonth

    /**
     * Returns the raw JSON value of [month].
     *
     * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Month> = month

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [ApiStaticDateAnchor].
         *
         * The following fields are required:
         * ```java
         * .dayOfMonth()
         * .month()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiStaticDateAnchor]. */
    class Builder internal constructor() {

        private var dayOfMonth: JsonField<Int>? = null
        private var month: JsonField<Month>? = null
        private var type: JsonField<Type>? = null
        private var year: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiStaticDateAnchor: ApiStaticDateAnchor) = apply {
            dayOfMonth = apiStaticDateAnchor.dayOfMonth
            month = apiStaticDateAnchor.month
            type = apiStaticDateAnchor.type
            year = apiStaticDateAnchor.year
            additionalProperties = apiStaticDateAnchor.additionalProperties.toMutableMap()
        }

        fun dayOfMonth(dayOfMonth: Int) = dayOfMonth(JsonField.of(dayOfMonth))

        /**
         * Sets [Builder.dayOfMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayOfMonth] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dayOfMonth(dayOfMonth: JsonField<Int>) = apply { this.dayOfMonth = dayOfMonth }

        fun month(month: Month) = month(JsonField.of(month))

        /**
         * Sets [Builder.month] to an arbitrary JSON value.
         *
         * You should usually call [Builder.month] with a well-typed [Month] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun month(month: JsonField<Month>) = apply { this.month = month }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [ApiStaticDateAnchor].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dayOfMonth()
         * .month()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiStaticDateAnchor =
            ApiStaticDateAnchor(
                checkRequired("dayOfMonth", dayOfMonth),
                checkRequired("month", month),
                checkRequired("type", type),
                year,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiStaticDateAnchor = apply {
        if (validated) {
            return@apply
        }

        dayOfMonth()
        month().validate()
        type().validate()
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
        (if (dayOfMonth.asKnown().isPresent) 1 else 0) +
            (month.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (year.asKnown().isPresent) 1 else 0)

    class Month @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Month(JsonField.of(value))
        }

        /** An enum containing [Month]'s known values. */
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
         * An enum containing [Month]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Month] can contain an unknown value in a couple of cases:
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
            /** An enum member indicating that [Month] was instantiated with an unknown value. */
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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
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
                else -> throw HubspotInvalidDataException("Unknown Month: $value")
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

        fun validate(): Month = apply {
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

            return other is Month && value == other.value
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

            @JvmField val STATIC_DATE_ANCHOR = of("STATIC_DATE_ANCHOR")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            STATIC_DATE_ANCHOR
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
            STATIC_DATE_ANCHOR,
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
                STATIC_DATE_ANCHOR -> Value.STATIC_DATE_ANCHOR
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
                STATIC_DATE_ANCHOR -> Known.STATIC_DATE_ANCHOR
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

        return other is ApiStaticDateAnchor &&
            dayOfMonth == other.dayOfMonth &&
            month == other.month &&
            type == other.type &&
            year == other.year &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dayOfMonth, month, type, year, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiStaticDateAnchor{dayOfMonth=$dayOfMonth, month=$month, type=$type, year=$year, additionalProperties=$additionalProperties}"
}
