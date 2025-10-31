// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

/** Describes how a numeric value should be validated. */
class NumberFieldValidation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val maxAllowedDigits: JsonField<Int>,
    private val minAllowedDigits: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("maxAllowedDigits")
        @ExcludeMissing
        maxAllowedDigits: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minAllowedDigits")
        @ExcludeMissing
        minAllowedDigits: JsonField<Int> = JsonMissing.of(),
    ) : this(maxAllowedDigits, minAllowedDigits, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxAllowedDigits(): Int = maxAllowedDigits.getRequired("maxAllowedDigits")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minAllowedDigits(): Int = minAllowedDigits.getRequired("minAllowedDigits")

    /**
     * Returns the raw JSON value of [maxAllowedDigits].
     *
     * Unlike [maxAllowedDigits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxAllowedDigits")
    @ExcludeMissing
    fun _maxAllowedDigits(): JsonField<Int> = maxAllowedDigits

    /**
     * Returns the raw JSON value of [minAllowedDigits].
     *
     * Unlike [minAllowedDigits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minAllowedDigits")
    @ExcludeMissing
    fun _minAllowedDigits(): JsonField<Int> = minAllowedDigits

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
         * Returns a mutable builder for constructing an instance of [NumberFieldValidation].
         *
         * The following fields are required:
         * ```java
         * .maxAllowedDigits()
         * .minAllowedDigits()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberFieldValidation]. */
    class Builder internal constructor() {

        private var maxAllowedDigits: JsonField<Int>? = null
        private var minAllowedDigits: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(numberFieldValidation: NumberFieldValidation) = apply {
            maxAllowedDigits = numberFieldValidation.maxAllowedDigits
            minAllowedDigits = numberFieldValidation.minAllowedDigits
            additionalProperties = numberFieldValidation.additionalProperties.toMutableMap()
        }

        fun maxAllowedDigits(maxAllowedDigits: Int) =
            maxAllowedDigits(JsonField.of(maxAllowedDigits))

        /**
         * Sets [Builder.maxAllowedDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAllowedDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxAllowedDigits(maxAllowedDigits: JsonField<Int>) = apply {
            this.maxAllowedDigits = maxAllowedDigits
        }

        fun minAllowedDigits(minAllowedDigits: Int) =
            minAllowedDigits(JsonField.of(minAllowedDigits))

        /**
         * Sets [Builder.minAllowedDigits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minAllowedDigits] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minAllowedDigits(minAllowedDigits: JsonField<Int>) = apply {
            this.minAllowedDigits = minAllowedDigits
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
         * Returns an immutable instance of [NumberFieldValidation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .maxAllowedDigits()
         * .minAllowedDigits()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NumberFieldValidation =
            NumberFieldValidation(
                checkRequired("maxAllowedDigits", maxAllowedDigits),
                checkRequired("minAllowedDigits", minAllowedDigits),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NumberFieldValidation = apply {
        if (validated) {
            return@apply
        }

        maxAllowedDigits()
        minAllowedDigits()
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
        (if (maxAllowedDigits.asKnown().isPresent) 1 else 0) +
            (if (minAllowedDigits.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberFieldValidation &&
            maxAllowedDigits == other.maxAllowedDigits &&
            minAllowedDigits == other.minAllowedDigits &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(maxAllowedDigits, minAllowedDigits, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NumberFieldValidation{maxAllowedDigits=$maxAllowedDigits, minAllowedDigits=$minAllowedDigits, additionalProperties=$additionalProperties}"
}
