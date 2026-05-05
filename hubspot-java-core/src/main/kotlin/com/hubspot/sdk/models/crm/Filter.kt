// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Defines a single condition for searching CRM objects, specifying the property to filter on, the
 * operator to use (such as equals, greater than, or contains), and the value(s) to compare against.
 */
class Filter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val operator: JsonField<Operator>,
    private val propertyName: JsonField<String>,
    private val highValue: JsonField<String>,
    private val value: JsonField<String>,
    private val values: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("highValue") @ExcludeMissing highValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<List<String>> = JsonMissing.of(),
    ) : this(operator, propertyName, highValue, value, values, mutableMapOf())

    /**
     * The comparison operator used in the filter, such as "EQ" or "GT".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * The name of the property to apply the filter to.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyName(): String = propertyName.getRequired("propertyName")

    /**
     * The upper boundary value when using ranged-based filters.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun highValue(): Optional<String> = highValue.getOptional("highValue")

    /**
     * The value to match against the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<String> = value.getOptional("value")

    /**
     * The values to match against the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun values(): Optional<List<String>> = values.getOptional("values")

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [propertyName].
     *
     * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyName")
    @ExcludeMissing
    fun _propertyName(): JsonField<String> = propertyName

    /**
     * Returns the raw JSON value of [highValue].
     *
     * Unlike [highValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("highValue") @ExcludeMissing fun _highValue(): JsonField<String> = highValue

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
         * Returns a mutable builder for constructing an instance of [Filter].
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .propertyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Filter]. */
    class Builder internal constructor() {

        private var operator: JsonField<Operator>? = null
        private var propertyName: JsonField<String>? = null
        private var highValue: JsonField<String> = JsonMissing.of()
        private var value: JsonField<String> = JsonMissing.of()
        private var values: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filter: Filter) = apply {
            operator = filter.operator
            propertyName = filter.propertyName
            highValue = filter.highValue
            value = filter.value
            values = filter.values.map { it.toMutableList() }
            additionalProperties = filter.additionalProperties.toMutableMap()
        }

        /** The comparison operator used in the filter, such as "EQ" or "GT". */
        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        /** The name of the property to apply the filter to. */
        fun propertyName(propertyName: String) = propertyName(JsonField.of(propertyName))

        /**
         * Sets [Builder.propertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propertyName(propertyName: JsonField<String>) = apply {
            this.propertyName = propertyName
        }

        /** The upper boundary value when using ranged-based filters. */
        fun highValue(highValue: String) = highValue(JsonField.of(highValue))

        /**
         * Sets [Builder.highValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun highValue(highValue: JsonField<String>) = apply { this.highValue = highValue }

        /** The value to match against the property. */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        /** The values to match against the property. */
        fun values(values: List<String>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<List<String>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: String) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
                }
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
         * Returns an immutable instance of [Filter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .propertyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Filter =
            Filter(
                checkRequired("operator", operator),
                checkRequired("propertyName", propertyName),
                highValue,
                value,
                (values ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Filter = apply {
        if (validated) {
            return@apply
        }

        operator().validate()
        propertyName()
        highValue()
        value()
        values()
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
        (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (propertyName.asKnown().isPresent) 1 else 0) +
            (if (highValue.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.size ?: 0)

    /** The comparison operator used in the filter, such as "EQ" or "GT". */
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

            @JvmField val BETWEEN = of("BETWEEN")

            @JvmField val CONTAINS_TOKEN = of("CONTAINS_TOKEN")

            @JvmField val EQ = of("EQ")

            @JvmField val GT = of("GT")

            @JvmField val GTE = of("GTE")

            @JvmField val HAS_PROPERTY = of("HAS_PROPERTY")

            @JvmField val IN = of("IN")

            @JvmField val LT = of("LT")

            @JvmField val LTE = of("LTE")

            @JvmField val NEQ = of("NEQ")

            @JvmField val NOT_CONTAINS_TOKEN = of("NOT_CONTAINS_TOKEN")

            @JvmField val NOT_HAS_PROPERTY = of("NOT_HAS_PROPERTY")

            @JvmField val NOT_IN = of("NOT_IN")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            BETWEEN,
            CONTAINS_TOKEN,
            EQ,
            GT,
            GTE,
            HAS_PROPERTY,
            IN,
            LT,
            LTE,
            NEQ,
            NOT_CONTAINS_TOKEN,
            NOT_HAS_PROPERTY,
            NOT_IN,
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
            BETWEEN,
            CONTAINS_TOKEN,
            EQ,
            GT,
            GTE,
            HAS_PROPERTY,
            IN,
            LT,
            LTE,
            NEQ,
            NOT_CONTAINS_TOKEN,
            NOT_HAS_PROPERTY,
            NOT_IN,
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
                BETWEEN -> Value.BETWEEN
                CONTAINS_TOKEN -> Value.CONTAINS_TOKEN
                EQ -> Value.EQ
                GT -> Value.GT
                GTE -> Value.GTE
                HAS_PROPERTY -> Value.HAS_PROPERTY
                IN -> Value.IN
                LT -> Value.LT
                LTE -> Value.LTE
                NEQ -> Value.NEQ
                NOT_CONTAINS_TOKEN -> Value.NOT_CONTAINS_TOKEN
                NOT_HAS_PROPERTY -> Value.NOT_HAS_PROPERTY
                NOT_IN -> Value.NOT_IN
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
                BETWEEN -> Known.BETWEEN
                CONTAINS_TOKEN -> Known.CONTAINS_TOKEN
                EQ -> Known.EQ
                GT -> Known.GT
                GTE -> Known.GTE
                HAS_PROPERTY -> Known.HAS_PROPERTY
                IN -> Known.IN
                LT -> Known.LT
                LTE -> Known.LTE
                NEQ -> Known.NEQ
                NOT_CONTAINS_TOKEN -> Known.NOT_CONTAINS_TOKEN
                NOT_HAS_PROPERTY -> Known.NOT_HAS_PROPERTY
                NOT_IN -> Known.NOT_IN
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Filter &&
            operator == other.operator &&
            propertyName == other.propertyName &&
            highValue == other.highValue &&
            value == other.value &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(operator, propertyName, highValue, value, values, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Filter{operator=$operator, propertyName=$propertyName, highValue=$highValue, value=$value, values=$values, additionalProperties=$additionalProperties}"
}
