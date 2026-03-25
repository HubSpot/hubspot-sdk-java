// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

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

class NumOccurrencesRefineBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonField<Type>,
    private val maxOccurrences: JsonField<Int>,
    private val minOccurrences: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("maxOccurrences")
        @ExcludeMissing
        maxOccurrences: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minOccurrences")
        @ExcludeMissing
        minOccurrences: JsonField<Int> = JsonMissing.of(),
    ) : this(type, maxOccurrences, minOccurrences, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxOccurrences(): Optional<Int> = maxOccurrences.getOptional("maxOccurrences")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minOccurrences(): Optional<Int> = minOccurrences.getOptional("minOccurrences")

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [maxOccurrences].
     *
     * Unlike [maxOccurrences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxOccurrences")
    @ExcludeMissing
    fun _maxOccurrences(): JsonField<Int> = maxOccurrences

    /**
     * Returns the raw JSON value of [minOccurrences].
     *
     * Unlike [minOccurrences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minOccurrences")
    @ExcludeMissing
    fun _minOccurrences(): JsonField<Int> = minOccurrences

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
         * Returns a mutable builder for constructing an instance of [NumOccurrencesRefineBy].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumOccurrencesRefineBy]. */
    class Builder internal constructor() {

        private var type: JsonField<Type>? = null
        private var maxOccurrences: JsonField<Int> = JsonMissing.of()
        private var minOccurrences: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numOccurrencesRefineBy: NumOccurrencesRefineBy) = apply {
            type = numOccurrencesRefineBy.type
            maxOccurrences = numOccurrencesRefineBy.maxOccurrences
            minOccurrences = numOccurrencesRefineBy.minOccurrences
            additionalProperties = numOccurrencesRefineBy.additionalProperties.toMutableMap()
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun maxOccurrences(maxOccurrences: Int) = maxOccurrences(JsonField.of(maxOccurrences))

        /**
         * Sets [Builder.maxOccurrences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxOccurrences] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxOccurrences(maxOccurrences: JsonField<Int>) = apply {
            this.maxOccurrences = maxOccurrences
        }

        fun minOccurrences(minOccurrences: Int) = minOccurrences(JsonField.of(minOccurrences))

        /**
         * Sets [Builder.minOccurrences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minOccurrences] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minOccurrences(minOccurrences: JsonField<Int>) = apply {
            this.minOccurrences = minOccurrences
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
         * Returns an immutable instance of [NumOccurrencesRefineBy].
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
        fun build(): NumOccurrencesRefineBy =
            NumOccurrencesRefineBy(
                checkRequired("type", type),
                maxOccurrences,
                minOccurrences,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NumOccurrencesRefineBy = apply {
        if (validated) {
            return@apply
        }

        type().validate()
        maxOccurrences()
        minOccurrences()
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
        (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxOccurrences.asKnown().isPresent) 1 else 0) +
            (if (minOccurrences.asKnown().isPresent) 1 else 0)

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

            @JvmField val NUM_OCCURRENCES_REFINE_BY = of("NumOccurrencesRefineBy")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            NUM_OCCURRENCES_REFINE_BY
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
            NUM_OCCURRENCES_REFINE_BY,
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
                NUM_OCCURRENCES_REFINE_BY -> Value.NUM_OCCURRENCES_REFINE_BY
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
                NUM_OCCURRENCES_REFINE_BY -> Known.NUM_OCCURRENCES_REFINE_BY
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

        return other is NumOccurrencesRefineBy &&
            type == other.type &&
            maxOccurrences == other.maxOccurrences &&
            minOccurrences == other.minOccurrences &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(type, maxOccurrences, minOccurrences, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumOccurrencesRefineBy{type=$type, maxOccurrences=$maxOccurrences, minOccurrences=$minOccurrences, additionalProperties=$additionalProperties}"
}
