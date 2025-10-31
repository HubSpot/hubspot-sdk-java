// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

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
import kotlin.jvm.optionals.getOrNull

class PublicPropertyValidationRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ruleArguments: JsonField<List<String>>,
    private val ruleType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ruleArguments")
        @ExcludeMissing
        ruleArguments: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ruleType") @ExcludeMissing ruleType: JsonField<String> = JsonMissing.of(),
    ) : this(ruleArguments, ruleType, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleArguments(): List<String> = ruleArguments.getRequired("ruleArguments")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleType(): String = ruleType.getRequired("ruleType")

    /**
     * Returns the raw JSON value of [ruleArguments].
     *
     * Unlike [ruleArguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleArguments")
    @ExcludeMissing
    fun _ruleArguments(): JsonField<List<String>> = ruleArguments

    /**
     * Returns the raw JSON value of [ruleType].
     *
     * Unlike [ruleType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleType") @ExcludeMissing fun _ruleType(): JsonField<String> = ruleType

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
         * Returns a mutable builder for constructing an instance of [PublicPropertyValidationRule].
         *
         * The following fields are required:
         * ```java
         * .ruleArguments()
         * .ruleType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicPropertyValidationRule]. */
    class Builder internal constructor() {

        private var ruleArguments: JsonField<MutableList<String>>? = null
        private var ruleType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicPropertyValidationRule: PublicPropertyValidationRule) = apply {
            ruleArguments = publicPropertyValidationRule.ruleArguments.map { it.toMutableList() }
            ruleType = publicPropertyValidationRule.ruleType
            additionalProperties = publicPropertyValidationRule.additionalProperties.toMutableMap()
        }

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

        fun ruleType(ruleType: String) = ruleType(JsonField.of(ruleType))

        /**
         * Sets [Builder.ruleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ruleType(ruleType: JsonField<String>) = apply { this.ruleType = ruleType }

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
         * Returns an immutable instance of [PublicPropertyValidationRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ruleArguments()
         * .ruleType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicPropertyValidationRule =
            PublicPropertyValidationRule(
                checkRequired("ruleArguments", ruleArguments).map { it.toImmutable() },
                checkRequired("ruleType", ruleType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicPropertyValidationRule = apply {
        if (validated) {
            return@apply
        }

        ruleArguments()
        ruleType()
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
            (if (ruleType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicPropertyValidationRule &&
            ruleArguments == other.ruleArguments &&
            ruleType == other.ruleType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(ruleArguments, ruleType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicPropertyValidationRule{ruleArguments=$ruleArguments, ruleType=$ruleType, additionalProperties=$additionalProperties}"
}
