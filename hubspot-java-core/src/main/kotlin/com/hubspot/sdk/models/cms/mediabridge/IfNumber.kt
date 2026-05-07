// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

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

class IfNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enclosedInParentheses: JsonField<Boolean>,
    private val ifExpression: JsonValue,
    private val operator: JsonField<Operator>,
    private val elseExpression: JsonValue,
    private val inputs: JsonField<List<JsonValue>>,
    private val propertyName: JsonField<String>,
    private val value: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enclosedInParentheses")
        @ExcludeMissing
        enclosedInParentheses: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ifExpression") @ExcludeMissing ifExpression: JsonValue = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("elseExpression")
        @ExcludeMissing
        elseExpression: JsonValue = JsonMissing.of(),
        @JsonProperty("inputs")
        @ExcludeMissing
        inputs: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
    ) : this(
        enclosedInParentheses,
        ifExpression,
        operator,
        elseExpression,
        inputs,
        propertyName,
        value,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enclosedInParentheses(): Boolean =
        enclosedInParentheses.getRequired("enclosedInParentheses")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = ifNumber.ifExpression().convert(MyClass.class);
     * ```
     */
    @JsonProperty("ifExpression") @ExcludeMissing fun _ifExpression(): JsonValue = ifExpression

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = ifNumber.elseExpression().convert(MyClass.class);
     * ```
     */
    @JsonProperty("elseExpression")
    @ExcludeMissing
    fun _elseExpression(): JsonValue = elseExpression

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputs(): Optional<List<JsonValue>> = inputs.getOptional("inputs")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyName(): Optional<String> = propertyName.getOptional("propertyName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Double> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [enclosedInParentheses].
     *
     * Unlike [enclosedInParentheses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enclosedInParentheses")
    @ExcludeMissing
    fun _enclosedInParentheses(): JsonField<Boolean> = enclosedInParentheses

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<JsonValue>> = inputs

    /**
     * Returns the raw JSON value of [propertyName].
     *
     * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyName")
    @ExcludeMissing
    fun _propertyName(): JsonField<String> = propertyName

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
         * Returns a mutable builder for constructing an instance of [IfNumber].
         *
         * The following fields are required:
         * ```java
         * .enclosedInParentheses()
         * .ifExpression()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IfNumber]. */
    class Builder internal constructor() {

        private var enclosedInParentheses: JsonField<Boolean>? = null
        private var ifExpression: JsonValue? = null
        private var operator: JsonField<Operator>? = null
        private var elseExpression: JsonValue = JsonMissing.of()
        private var inputs: JsonField<MutableList<JsonValue>>? = null
        private var propertyName: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ifNumber: IfNumber) = apply {
            enclosedInParentheses = ifNumber.enclosedInParentheses
            ifExpression = ifNumber.ifExpression
            operator = ifNumber.operator
            elseExpression = ifNumber.elseExpression
            inputs = ifNumber.inputs.map { it.toMutableList() }
            propertyName = ifNumber.propertyName
            value = ifNumber.value
            additionalProperties = ifNumber.additionalProperties.toMutableMap()
        }

        fun enclosedInParentheses(enclosedInParentheses: Boolean) =
            enclosedInParentheses(JsonField.of(enclosedInParentheses))

        /**
         * Sets [Builder.enclosedInParentheses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enclosedInParentheses] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enclosedInParentheses(enclosedInParentheses: JsonField<Boolean>) = apply {
            this.enclosedInParentheses = enclosedInParentheses
        }

        fun ifExpression(ifExpression: JsonValue) = apply { this.ifExpression = ifExpression }

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        fun elseExpression(elseExpression: JsonValue) = apply {
            this.elseExpression = elseExpression
        }

        fun inputs(inputs: List<JsonValue>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputs(inputs: JsonField<List<JsonValue>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: JsonValue) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
                }
        }

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

        fun value(value: Double) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Double>) = apply { this.value = value }

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
         * Returns an immutable instance of [IfNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enclosedInParentheses()
         * .ifExpression()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IfNumber =
            IfNumber(
                checkRequired("enclosedInParentheses", enclosedInParentheses),
                checkRequired("ifExpression", ifExpression),
                checkRequired("operator", operator),
                elseExpression,
                (inputs ?: JsonMissing.of()).map { it.toImmutable() },
                propertyName,
                value,
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
    fun validate(): IfNumber = apply {
        if (validated) {
            return@apply
        }

        enclosedInParentheses()
        operator().validate()
        inputs()
        propertyName()
        value()
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
        (if (enclosedInParentheses.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (inputs.asKnown().getOrNull()?.size ?: 0) +
            (if (propertyName.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

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

            @JvmField val IF_NUMBER = of("IF_NUMBER")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IF_NUMBER
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
            IF_NUMBER,
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
                IF_NUMBER -> Value.IF_NUMBER
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
                IF_NUMBER -> Known.IF_NUMBER
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

        return other is IfNumber &&
            enclosedInParentheses == other.enclosedInParentheses &&
            ifExpression == other.ifExpression &&
            operator == other.operator &&
            elseExpression == other.elseExpression &&
            inputs == other.inputs &&
            propertyName == other.propertyName &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            enclosedInParentheses,
            ifExpression,
            operator,
            elseExpression,
            inputs,
            propertyName,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IfNumber{enclosedInParentheses=$enclosedInParentheses, ifExpression=$ifExpression, operator=$operator, elseExpression=$elseExpression, inputs=$inputs, propertyName=$propertyName, value=$value, additionalProperties=$additionalProperties}"
}
