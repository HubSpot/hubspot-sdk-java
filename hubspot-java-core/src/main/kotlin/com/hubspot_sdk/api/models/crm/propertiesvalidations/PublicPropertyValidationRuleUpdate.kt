// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertiesvalidations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicPropertyValidationRuleUpdate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ruleArguments: JsonField<List<String>>,
    private val shouldApplyNormalization: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ruleArguments")
        @ExcludeMissing
        ruleArguments: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("shouldApplyNormalization")
        @ExcludeMissing
        shouldApplyNormalization: JsonField<Boolean> = JsonMissing.of(),
    ) : this(ruleArguments, shouldApplyNormalization, mutableMapOf())

    /**
     * A list of arguments that define the constraints for the validation rule.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleArguments(): List<String> = ruleArguments.getRequired("ruleArguments")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shouldApplyNormalization(): Optional<Boolean> =
        shouldApplyNormalization.getOptional("shouldApplyNormalization")

    /**
     * Returns the raw JSON value of [ruleArguments].
     *
     * Unlike [ruleArguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleArguments")
    @ExcludeMissing
    fun _ruleArguments(): JsonField<List<String>> = ruleArguments

    /**
     * Returns the raw JSON value of [shouldApplyNormalization].
     *
     * Unlike [shouldApplyNormalization], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("shouldApplyNormalization")
    @ExcludeMissing
    fun _shouldApplyNormalization(): JsonField<Boolean> = shouldApplyNormalization

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
         * [PublicPropertyValidationRuleUpdate].
         *
         * The following fields are required:
         * ```java
         * .ruleArguments()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicPropertyValidationRuleUpdate]. */
    class Builder internal constructor() {

        private var ruleArguments: JsonField<MutableList<String>>? = null
        private var shouldApplyNormalization: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicPropertyValidationRuleUpdate: PublicPropertyValidationRuleUpdate) =
            apply {
                ruleArguments =
                    publicPropertyValidationRuleUpdate.ruleArguments.map { it.toMutableList() }
                shouldApplyNormalization =
                    publicPropertyValidationRuleUpdate.shouldApplyNormalization
                additionalProperties =
                    publicPropertyValidationRuleUpdate.additionalProperties.toMutableMap()
            }

        /** A list of arguments that define the constraints for the validation rule. */
        fun ruleArguments(ruleArguments: List<String>) = ruleArguments(JsonField.of(ruleArguments))

        /**
         * Sets [Builder.ruleArguments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleArguments] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ruleArguments(ruleArguments: JsonField<List<String>>) = apply {
            this.ruleArguments = ruleArguments.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [ruleArguments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRuleArgument(ruleArgument: String) = apply {
            ruleArguments =
                (ruleArguments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ruleArguments", it).add(ruleArgument)
                }
        }

        fun shouldApplyNormalization(shouldApplyNormalization: Boolean) =
            shouldApplyNormalization(JsonField.of(shouldApplyNormalization))

        /**
         * Sets [Builder.shouldApplyNormalization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shouldApplyNormalization] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shouldApplyNormalization(shouldApplyNormalization: JsonField<Boolean>) = apply {
            this.shouldApplyNormalization = shouldApplyNormalization
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
         * Returns an immutable instance of [PublicPropertyValidationRuleUpdate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ruleArguments()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicPropertyValidationRuleUpdate =
            PublicPropertyValidationRuleUpdate(
                checkRequired("ruleArguments", ruleArguments).map { it.toImmutable() },
                shouldApplyNormalization,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicPropertyValidationRuleUpdate = apply {
        if (validated) {
            return@apply
        }

        ruleArguments()
        shouldApplyNormalization()
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
        (ruleArguments.asKnown().getOrNull()?.size ?: 0) +
            (if (shouldApplyNormalization.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicPropertyValidationRuleUpdate &&
            ruleArguments == other.ruleArguments &&
            shouldApplyNormalization == other.shouldApplyNormalization &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(ruleArguments, shouldApplyNormalization, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicPropertyValidationRuleUpdate{ruleArguments=$ruleArguments, shouldApplyNormalization=$shouldApplyNormalization, additionalProperties=$additionalProperties}"
}
