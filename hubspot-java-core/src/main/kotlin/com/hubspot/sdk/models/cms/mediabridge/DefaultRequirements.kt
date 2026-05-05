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
import kotlin.jvm.optionals.getOrNull

class DefaultRequirements
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val gates: JsonField<List<String>>,
    private val operator: JsonField<Operator>,
    private val scopeNames: JsonField<List<String>>,
    private val settings: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("gates") @ExcludeMissing gates: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("scopeNames")
        @ExcludeMissing
        scopeNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        settings: JsonField<List<String>> = JsonMissing.of(),
    ) : this(gates, operator, scopeNames, settings, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun gates(): List<String> = gates.getRequired("gates")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeNames(): List<String> = scopeNames.getRequired("scopeNames")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settings(): List<String> = settings.getRequired("settings")

    /**
     * Returns the raw JSON value of [gates].
     *
     * Unlike [gates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gates") @ExcludeMissing fun _gates(): JsonField<List<String>> = gates

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [scopeNames].
     *
     * Unlike [scopeNames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopeNames")
    @ExcludeMissing
    fun _scopeNames(): JsonField<List<String>> = scopeNames

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings") @ExcludeMissing fun _settings(): JsonField<List<String>> = settings

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
         * Returns a mutable builder for constructing an instance of [DefaultRequirements].
         *
         * The following fields are required:
         * ```java
         * .gates()
         * .operator()
         * .scopeNames()
         * .settings()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefaultRequirements]. */
    class Builder internal constructor() {

        private var gates: JsonField<MutableList<String>>? = null
        private var operator: JsonField<Operator>? = null
        private var scopeNames: JsonField<MutableList<String>>? = null
        private var settings: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(defaultRequirements: DefaultRequirements) = apply {
            gates = defaultRequirements.gates.map { it.toMutableList() }
            operator = defaultRequirements.operator
            scopeNames = defaultRequirements.scopeNames.map { it.toMutableList() }
            settings = defaultRequirements.settings.map { it.toMutableList() }
            additionalProperties = defaultRequirements.additionalProperties.toMutableMap()
        }

        fun gates(gates: List<String>) = gates(JsonField.of(gates))

        /**
         * Sets [Builder.gates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gates] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun gates(gates: JsonField<List<String>>) = apply {
            this.gates = gates.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [gates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGate(gate: String) = apply {
            gates =
                (gates ?: JsonField.of(mutableListOf())).also { checkKnown("gates", it).add(gate) }
        }

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        fun scopeNames(scopeNames: List<String>) = scopeNames(JsonField.of(scopeNames))

        /**
         * Sets [Builder.scopeNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopeNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scopeNames(scopeNames: JsonField<List<String>>) = apply {
            this.scopeNames = scopeNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [scopeNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScopeName(scopeName: String) = apply {
            scopeNames =
                (scopeNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopeNames", it).add(scopeName)
                }
        }

        fun settings(settings: List<String>) = settings(JsonField.of(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settings(settings: JsonField<List<String>>) = apply {
            this.settings = settings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [settings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSetting(setting: String) = apply {
            settings =
                (settings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("settings", it).add(setting)
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
         * Returns an immutable instance of [DefaultRequirements].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .gates()
         * .operator()
         * .scopeNames()
         * .settings()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DefaultRequirements =
            DefaultRequirements(
                checkRequired("gates", gates).map { it.toImmutable() },
                checkRequired("operator", operator),
                checkRequired("scopeNames", scopeNames).map { it.toImmutable() },
                checkRequired("settings", settings).map { it.toImmutable() },
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
    fun validate(): DefaultRequirements = apply {
        if (validated) {
            return@apply
        }

        gates()
        operator().validate()
        scopeNames()
        settings()
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
        (gates.asKnown().getOrNull()?.size ?: 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (scopeNames.asKnown().getOrNull()?.size ?: 0) +
            (settings.asKnown().getOrNull()?.size ?: 0)

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

            @JvmField val AND = of("AND")

            @JvmField val OR = of("OR")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            AND,
            OR,
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
            AND,
            OR,
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
                AND -> Value.AND
                OR -> Value.OR
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
                AND -> Known.AND
                OR -> Known.OR
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

        return other is DefaultRequirements &&
            gates == other.gates &&
            operator == other.operator &&
            scopeNames == other.scopeNames &&
            settings == other.settings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(gates, operator, scopeNames, settings, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DefaultRequirements{gates=$gates, operator=$operator, scopeNames=$scopeNames, settings=$settings, additionalProperties=$additionalProperties}"
}
