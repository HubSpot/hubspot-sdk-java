// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class AttentionSpanCalculatedValues
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val totalPercentPlayed: JsonField<Double>,
    private val totalSecondsPlayed: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("totalPercentPlayed")
        @ExcludeMissing
        totalPercentPlayed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("totalSecondsPlayed")
        @ExcludeMissing
        totalSecondsPlayed: JsonField<Int> = JsonMissing.of(),
    ) : this(totalPercentPlayed, totalSecondsPlayed, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPercentPlayed(): Double = totalPercentPlayed.getRequired("totalPercentPlayed")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalSecondsPlayed(): Int = totalSecondsPlayed.getRequired("totalSecondsPlayed")

    /**
     * Returns the raw JSON value of [totalPercentPlayed].
     *
     * Unlike [totalPercentPlayed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalPercentPlayed")
    @ExcludeMissing
    fun _totalPercentPlayed(): JsonField<Double> = totalPercentPlayed

    /**
     * Returns the raw JSON value of [totalSecondsPlayed].
     *
     * Unlike [totalSecondsPlayed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalSecondsPlayed")
    @ExcludeMissing
    fun _totalSecondsPlayed(): JsonField<Int> = totalSecondsPlayed

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
         * [AttentionSpanCalculatedValues].
         *
         * The following fields are required:
         * ```java
         * .totalPercentPlayed()
         * .totalSecondsPlayed()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttentionSpanCalculatedValues]. */
    class Builder internal constructor() {

        private var totalPercentPlayed: JsonField<Double>? = null
        private var totalSecondsPlayed: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attentionSpanCalculatedValues: AttentionSpanCalculatedValues) = apply {
            totalPercentPlayed = attentionSpanCalculatedValues.totalPercentPlayed
            totalSecondsPlayed = attentionSpanCalculatedValues.totalSecondsPlayed
            additionalProperties = attentionSpanCalculatedValues.additionalProperties.toMutableMap()
        }

        fun totalPercentPlayed(totalPercentPlayed: Double) =
            totalPercentPlayed(JsonField.of(totalPercentPlayed))

        /**
         * Sets [Builder.totalPercentPlayed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPercentPlayed] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalPercentPlayed(totalPercentPlayed: JsonField<Double>) = apply {
            this.totalPercentPlayed = totalPercentPlayed
        }

        fun totalSecondsPlayed(totalSecondsPlayed: Int) =
            totalSecondsPlayed(JsonField.of(totalSecondsPlayed))

        /**
         * Sets [Builder.totalSecondsPlayed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSecondsPlayed] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalSecondsPlayed(totalSecondsPlayed: JsonField<Int>) = apply {
            this.totalSecondsPlayed = totalSecondsPlayed
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
         * Returns an immutable instance of [AttentionSpanCalculatedValues].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .totalPercentPlayed()
         * .totalSecondsPlayed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttentionSpanCalculatedValues =
            AttentionSpanCalculatedValues(
                checkRequired("totalPercentPlayed", totalPercentPlayed),
                checkRequired("totalSecondsPlayed", totalSecondsPlayed),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttentionSpanCalculatedValues = apply {
        if (validated) {
            return@apply
        }

        totalPercentPlayed()
        totalSecondsPlayed()
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
        (if (totalPercentPlayed.asKnown().isPresent) 1 else 0) +
            (if (totalSecondsPlayed.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttentionSpanCalculatedValues &&
            totalPercentPlayed == other.totalPercentPlayed &&
            totalSecondsPlayed == other.totalSecondsPlayed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(totalPercentPlayed, totalSecondsPlayed, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttentionSpanCalculatedValues{totalPercentPlayed=$totalPercentPlayed, totalSecondsPlayed=$totalSecondsPlayed, additionalProperties=$additionalProperties}"
}
