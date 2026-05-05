// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.dealsplits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class PublicDealSplitInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ownerId: JsonField<Int>,
    private val percentage: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ownerId") @ExcludeMissing ownerId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("percentage") @ExcludeMissing percentage: JsonField<Double> = JsonMissing.of(),
    ) : this(ownerId, percentage, mutableMapOf())

    /**
     * The unique identifier of the owner receiving the deal split.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownerId(): Int = ownerId.getRequired("ownerId")

    /**
     * The portion of the deal assigned to the owner, expressed as a percentage. The total
     * percentage for all splits in a deal must sum up to 1.0 (100%) and can have up to 8 decimal
     * places.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentage(): Double = percentage.getRequired("percentage")

    /**
     * Returns the raw JSON value of [ownerId].
     *
     * Unlike [ownerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ownerId") @ExcludeMissing fun _ownerId(): JsonField<Int> = ownerId

    /**
     * Returns the raw JSON value of [percentage].
     *
     * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percentage") @ExcludeMissing fun _percentage(): JsonField<Double> = percentage

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
         * Returns a mutable builder for constructing an instance of [PublicDealSplitInput].
         *
         * The following fields are required:
         * ```java
         * .ownerId()
         * .percentage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicDealSplitInput]. */
    class Builder internal constructor() {

        private var ownerId: JsonField<Int>? = null
        private var percentage: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicDealSplitInput: PublicDealSplitInput) = apply {
            ownerId = publicDealSplitInput.ownerId
            percentage = publicDealSplitInput.percentage
            additionalProperties = publicDealSplitInput.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the owner receiving the deal split. */
        fun ownerId(ownerId: Int) = ownerId(JsonField.of(ownerId))

        /**
         * Sets [Builder.ownerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ownerId(ownerId: JsonField<Int>) = apply { this.ownerId = ownerId }

        /**
         * The portion of the deal assigned to the owner, expressed as a percentage. The total
         * percentage for all splits in a deal must sum up to 1.0 (100%) and can have up to 8
         * decimal places.
         */
        fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

        /**
         * Sets [Builder.percentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentage(percentage: JsonField<Double>) = apply { this.percentage = percentage }

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
         * Returns an immutable instance of [PublicDealSplitInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ownerId()
         * .percentage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicDealSplitInput =
            PublicDealSplitInput(
                checkRequired("ownerId", ownerId),
                checkRequired("percentage", percentage),
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
    fun validate(): PublicDealSplitInput = apply {
        if (validated) {
            return@apply
        }

        ownerId()
        percentage()
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
        (if (ownerId.asKnown().isPresent) 1 else 0) + (if (percentage.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDealSplitInput &&
            ownerId == other.ownerId &&
            percentage == other.percentage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(ownerId, percentage, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicDealSplitInput{ownerId=$ownerId, percentage=$percentage, additionalProperties=$additionalProperties}"
}
