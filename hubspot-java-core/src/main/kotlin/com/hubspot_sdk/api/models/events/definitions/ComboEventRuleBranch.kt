// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

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

class ComboEventRuleBranch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val composingRules: JsonField<List<ComboEventRule>>,
    private val operationType: JsonField<OperationType>,
    private val ruleBranches: JsonField<List<ComboEventRuleBranch>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("composingRules")
        @ExcludeMissing
        composingRules: JsonField<List<ComboEventRule>> = JsonMissing.of(),
        @JsonProperty("operationType")
        @ExcludeMissing
        operationType: JsonField<OperationType> = JsonMissing.of(),
        @JsonProperty("ruleBranches")
        @ExcludeMissing
        ruleBranches: JsonField<List<ComboEventRuleBranch>> = JsonMissing.of(),
    ) : this(composingRules, operationType, ruleBranches, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun composingRules(): List<ComboEventRule> = composingRules.getRequired("composingRules")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): OperationType = operationType.getRequired("operationType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleBranches(): List<ComboEventRuleBranch> = ruleBranches.getRequired("ruleBranches")

    /**
     * Returns the raw JSON value of [composingRules].
     *
     * Unlike [composingRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("composingRules")
    @ExcludeMissing
    fun _composingRules(): JsonField<List<ComboEventRule>> = composingRules

    /**
     * Returns the raw JSON value of [operationType].
     *
     * Unlike [operationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operationType")
    @ExcludeMissing
    fun _operationType(): JsonField<OperationType> = operationType

    /**
     * Returns the raw JSON value of [ruleBranches].
     *
     * Unlike [ruleBranches], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleBranches")
    @ExcludeMissing
    fun _ruleBranches(): JsonField<List<ComboEventRuleBranch>> = ruleBranches

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
         * Returns a mutable builder for constructing an instance of [ComboEventRuleBranch].
         *
         * The following fields are required:
         * ```java
         * .composingRules()
         * .operationType()
         * .ruleBranches()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComboEventRuleBranch]. */
    class Builder internal constructor() {

        private var composingRules: JsonField<MutableList<ComboEventRule>>? = null
        private var operationType: JsonField<OperationType>? = null
        private var ruleBranches: JsonField<MutableList<ComboEventRuleBranch>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(comboEventRuleBranch: ComboEventRuleBranch) = apply {
            composingRules = comboEventRuleBranch.composingRules.map { it.toMutableList() }
            operationType = comboEventRuleBranch.operationType
            ruleBranches = comboEventRuleBranch.ruleBranches.map { it.toMutableList() }
            additionalProperties = comboEventRuleBranch.additionalProperties.toMutableMap()
        }

        fun composingRules(composingRules: List<ComboEventRule>) =
            composingRules(JsonField.of(composingRules))

        /**
         * Sets [Builder.composingRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.composingRules] with a well-typed `List<ComboEventRule>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun composingRules(composingRules: JsonField<List<ComboEventRule>>) = apply {
            this.composingRules = composingRules.map { it.toMutableList() }
        }

        /**
         * Adds a single [ComboEventRule] to [composingRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addComposingRule(composingRule: ComboEventRule) = apply {
            composingRules =
                (composingRules ?: JsonField.of(mutableListOf())).also {
                    checkKnown("composingRules", it).add(composingRule)
                }
        }

        fun operationType(operationType: OperationType) = operationType(JsonField.of(operationType))

        /**
         * Sets [Builder.operationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationType] with a well-typed [OperationType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operationType(operationType: JsonField<OperationType>) = apply {
            this.operationType = operationType
        }

        fun ruleBranches(ruleBranches: List<ComboEventRuleBranch>) =
            ruleBranches(JsonField.of(ruleBranches))

        /**
         * Sets [Builder.ruleBranches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleBranches] with a well-typed
         * `List<ComboEventRuleBranch>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ruleBranches(ruleBranches: JsonField<List<ComboEventRuleBranch>>) = apply {
            this.ruleBranches = ruleBranches.map { it.toMutableList() }
        }

        /**
         * Adds a single [ComboEventRuleBranch] to [ruleBranches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRuleBranch(ruleBranch: ComboEventRuleBranch) = apply {
            ruleBranches =
                (ruleBranches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ruleBranches", it).add(ruleBranch)
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
         * Returns an immutable instance of [ComboEventRuleBranch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .composingRules()
         * .operationType()
         * .ruleBranches()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ComboEventRuleBranch =
            ComboEventRuleBranch(
                checkRequired("composingRules", composingRules).map { it.toImmutable() },
                checkRequired("operationType", operationType),
                checkRequired("ruleBranches", ruleBranches).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ComboEventRuleBranch = apply {
        if (validated) {
            return@apply
        }

        composingRules().forEach { it.validate() }
        operationType().validate()
        ruleBranches().forEach { it.validate() }
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
        (composingRules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (operationType.asKnown().getOrNull()?.validity() ?: 0) +
            (ruleBranches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class OperationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AND = of("AND")

            @JvmField val OR = of("OR")

            @JvmStatic fun of(value: String) = OperationType(JsonField.of(value))
        }

        /** An enum containing [OperationType]'s known values. */
        enum class Known {
            AND,
            OR,
        }

        /**
         * An enum containing [OperationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OperationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AND,
            OR,
            /**
             * An enum member indicating that [OperationType] was instantiated with an unknown
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
                else -> throw HubSpotInvalidDataException("Unknown OperationType: $value")
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

        fun validate(): OperationType = apply {
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

            return other is OperationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComboEventRuleBranch &&
            composingRules == other.composingRules &&
            operationType == other.operationType &&
            ruleBranches == other.ruleBranches &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(composingRules, operationType, ruleBranches, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ComboEventRuleBranch{composingRules=$composingRules, operationType=$operationType, ruleBranches=$ruleBranches, additionalProperties=$additionalProperties}"
}
