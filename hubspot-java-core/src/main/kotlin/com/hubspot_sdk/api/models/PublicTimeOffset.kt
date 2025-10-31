// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

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

class PublicTimeOffset
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val offsetDirection: JsonField<String>,
    private val timeUnit: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offsetDirection")
        @ExcludeMissing
        offsetDirection: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeUnit") @ExcludeMissing timeUnit: JsonField<String> = JsonMissing.of(),
    ) : this(amount, offsetDirection, timeUnit, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offsetDirection(): String = offsetDirection.getRequired("offsetDirection")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeUnit(): String = timeUnit.getRequired("timeUnit")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [offsetDirection].
     *
     * Unlike [offsetDirection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offsetDirection")
    @ExcludeMissing
    fun _offsetDirection(): JsonField<String> = offsetDirection

    /**
     * Returns the raw JSON value of [timeUnit].
     *
     * Unlike [timeUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeUnit") @ExcludeMissing fun _timeUnit(): JsonField<String> = timeUnit

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
         * Returns a mutable builder for constructing an instance of [PublicTimeOffset].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .offsetDirection()
         * .timeUnit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicTimeOffset]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var offsetDirection: JsonField<String>? = null
        private var timeUnit: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicTimeOffset: PublicTimeOffset) = apply {
            amount = publicTimeOffset.amount
            offsetDirection = publicTimeOffset.offsetDirection
            timeUnit = publicTimeOffset.timeUnit
            additionalProperties = publicTimeOffset.additionalProperties.toMutableMap()
        }

        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun offsetDirection(offsetDirection: String) =
            offsetDirection(JsonField.of(offsetDirection))

        /**
         * Sets [Builder.offsetDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offsetDirection] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun offsetDirection(offsetDirection: JsonField<String>) = apply {
            this.offsetDirection = offsetDirection
        }

        fun timeUnit(timeUnit: String) = timeUnit(JsonField.of(timeUnit))

        /**
         * Sets [Builder.timeUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUnit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeUnit(timeUnit: JsonField<String>) = apply { this.timeUnit = timeUnit }

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
         * Returns an immutable instance of [PublicTimeOffset].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .offsetDirection()
         * .timeUnit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicTimeOffset =
            PublicTimeOffset(
                checkRequired("amount", amount),
                checkRequired("offsetDirection", offsetDirection),
                checkRequired("timeUnit", timeUnit),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicTimeOffset = apply {
        if (validated) {
            return@apply
        }

        amount()
        offsetDirection()
        timeUnit()
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
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (offsetDirection.asKnown().isPresent) 1 else 0) +
            (if (timeUnit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicTimeOffset &&
            amount == other.amount &&
            offsetDirection == other.offsetDirection &&
            timeUnit == other.timeUnit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(amount, offsetDirection, timeUnit, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicTimeOffset{amount=$amount, offsetDirection=$offsetDirection, timeUnit=$timeUnit, additionalProperties=$additionalProperties}"
}
