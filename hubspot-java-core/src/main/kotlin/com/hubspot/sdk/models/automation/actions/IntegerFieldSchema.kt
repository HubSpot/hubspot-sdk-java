// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IntegerFieldSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonField<Type>,
    private val maximum: JsonField<Int>,
    private val minimum: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("maximum") @ExcludeMissing maximum: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Int> = JsonMissing.of(),
    ) : this(type, maximum, minimum, mutableMapOf())

    /**
     * The type of the field, which is set to INTEGER.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The maximum value allowed for the integer field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maximum(): Optional<Int> = maximum.getOptional("maximum")

    /**
     * The minimum value allowed for the integer field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimum(): Optional<Int> = minimum.getOptional("minimum")

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [maximum].
     *
     * Unlike [maximum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Int> = maximum

    /**
     * Returns the raw JSON value of [minimum].
     *
     * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Int> = minimum

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
         * Returns a mutable builder for constructing an instance of [IntegerFieldSchema].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegerFieldSchema]. */
    class Builder internal constructor() {

        private var type: JsonField<Type>? = null
        private var maximum: JsonField<Int> = JsonMissing.of()
        private var minimum: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(integerFieldSchema: IntegerFieldSchema) = apply {
            type = integerFieldSchema.type
            maximum = integerFieldSchema.maximum
            minimum = integerFieldSchema.minimum
            additionalProperties = integerFieldSchema.additionalProperties.toMutableMap()
        }

        /** The type of the field, which is set to INTEGER. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The maximum value allowed for the integer field. */
        fun maximum(maximum: Int) = maximum(JsonField.of(maximum))

        /**
         * Sets [Builder.maximum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximum] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maximum(maximum: JsonField<Int>) = apply { this.maximum = maximum }

        /** The minimum value allowed for the integer field. */
        fun minimum(minimum: Int) = minimum(JsonField.of(minimum))

        /**
         * Sets [Builder.minimum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimum] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minimum(minimum: JsonField<Int>) = apply { this.minimum = minimum }

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
         * Returns an immutable instance of [IntegerFieldSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegerFieldSchema =
            IntegerFieldSchema(
                checkRequired("type", type),
                maximum,
                minimum,
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
    fun validate(): IntegerFieldSchema = apply {
        if (validated) {
            return@apply
        }

        type().validate()
        maximum()
        minimum()
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
        (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maximum.asKnown().isPresent) 1 else 0) +
            (if (minimum.asKnown().isPresent) 1 else 0)

    /** The type of the field, which is set to INTEGER. */
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

            @JvmField val ARRAY = of("ARRAY")

            @JvmField val BOOLEAN = of("BOOLEAN")

            @JvmField val DOUBLE = of("DOUBLE")

            @JvmField val INTEGER = of("INTEGER")

            @JvmField val LONG = of("LONG")

            @JvmField val OBJECT = of("OBJECT")

            @JvmField val STRING = of("STRING")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ARRAY,
            BOOLEAN,
            DOUBLE,
            INTEGER,
            LONG,
            OBJECT,
            STRING,
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
            ARRAY,
            BOOLEAN,
            DOUBLE,
            INTEGER,
            LONG,
            OBJECT,
            STRING,
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
                ARRAY -> Value.ARRAY
                BOOLEAN -> Value.BOOLEAN
                DOUBLE -> Value.DOUBLE
                INTEGER -> Value.INTEGER
                LONG -> Value.LONG
                OBJECT -> Value.OBJECT
                STRING -> Value.STRING
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
                ARRAY -> Known.ARRAY
                BOOLEAN -> Known.BOOLEAN
                DOUBLE -> Known.DOUBLE
                INTEGER -> Known.INTEGER
                LONG -> Known.LONG
                OBJECT -> Known.OBJECT
                STRING -> Known.STRING
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is IntegerFieldSchema &&
            type == other.type &&
            maximum == other.maximum &&
            minimum == other.minimum &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(type, maximum, minimum, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegerFieldSchema{type=$type, maximum=$maximum, minimum=$minimum, additionalProperties=$additionalProperties}"
}
