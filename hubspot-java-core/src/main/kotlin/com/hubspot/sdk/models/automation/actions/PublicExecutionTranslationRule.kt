// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicExecutionTranslationRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val conditions: JsonField<Conditions>,
    private val labelName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<Conditions> = JsonMissing.of(),
        @JsonProperty("labelName") @ExcludeMissing labelName: JsonField<String> = JsonMissing.of(),
    ) : this(conditions, labelName, mutableMapOf())

    /**
     * Defines the conditions that must be met for the execution rule to apply.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conditions(): Conditions = conditions.getRequired("conditions")

    /**
     * Specifies the name of the label associated with the execution rule.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labelName(): String = labelName.getRequired("labelName")

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<Conditions> = conditions

    /**
     * Returns the raw JSON value of [labelName].
     *
     * Unlike [labelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labelName") @ExcludeMissing fun _labelName(): JsonField<String> = labelName

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
         * [PublicExecutionTranslationRule].
         *
         * The following fields are required:
         * ```java
         * .conditions()
         * .labelName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicExecutionTranslationRule]. */
    class Builder internal constructor() {

        private var conditions: JsonField<Conditions>? = null
        private var labelName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicExecutionTranslationRule: PublicExecutionTranslationRule) = apply {
            conditions = publicExecutionTranslationRule.conditions
            labelName = publicExecutionTranslationRule.labelName
            additionalProperties =
                publicExecutionTranslationRule.additionalProperties.toMutableMap()
        }

        /** Defines the conditions that must be met for the execution rule to apply. */
        fun conditions(conditions: Conditions) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed [Conditions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditions(conditions: JsonField<Conditions>) = apply { this.conditions = conditions }

        /** Specifies the name of the label associated with the execution rule. */
        fun labelName(labelName: String) = labelName(JsonField.of(labelName))

        /**
         * Sets [Builder.labelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun labelName(labelName: JsonField<String>) = apply { this.labelName = labelName }

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
         * Returns an immutable instance of [PublicExecutionTranslationRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .conditions()
         * .labelName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicExecutionTranslationRule =
            PublicExecutionTranslationRule(
                checkRequired("conditions", conditions),
                checkRequired("labelName", labelName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicExecutionTranslationRule = apply {
        if (validated) {
            return@apply
        }

        conditions().validate()
        labelName()
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
        (conditions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (labelName.asKnown().isPresent) 1 else 0)

    /** Defines the conditions that must be met for the execution rule to apply. */
    class Conditions
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Conditions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Conditions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(conditions: Conditions) = apply {
                additionalProperties = conditions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Conditions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Conditions = Conditions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Conditions = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Conditions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Conditions{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicExecutionTranslationRule &&
            conditions == other.conditions &&
            labelName == other.labelName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(conditions, labelName, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicExecutionTranslationRule{conditions=$conditions, labelName=$labelName, additionalProperties=$additionalProperties}"
}
