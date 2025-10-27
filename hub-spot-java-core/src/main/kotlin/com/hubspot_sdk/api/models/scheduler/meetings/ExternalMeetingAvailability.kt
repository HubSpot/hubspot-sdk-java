// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class ExternalMeetingAvailability
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endMillisUtc: JsonField<Int>,
    private val startMillisUtc: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("endMillisUtc")
        @ExcludeMissing
        endMillisUtc: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("startMillisUtc")
        @ExcludeMissing
        startMillisUtc: JsonField<Int> = JsonMissing.of(),
    ) : this(endMillisUtc, startMillisUtc, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endMillisUtc(): Int = endMillisUtc.getRequired("endMillisUtc")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startMillisUtc(): Int = startMillisUtc.getRequired("startMillisUtc")

    /**
     * Returns the raw JSON value of [endMillisUtc].
     *
     * Unlike [endMillisUtc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endMillisUtc") @ExcludeMissing fun _endMillisUtc(): JsonField<Int> = endMillisUtc

    /**
     * Returns the raw JSON value of [startMillisUtc].
     *
     * Unlike [startMillisUtc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startMillisUtc")
    @ExcludeMissing
    fun _startMillisUtc(): JsonField<Int> = startMillisUtc

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
         * Returns a mutable builder for constructing an instance of [ExternalMeetingAvailability].
         *
         * The following fields are required:
         * ```java
         * .endMillisUtc()
         * .startMillisUtc()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMeetingAvailability]. */
    class Builder internal constructor() {

        private var endMillisUtc: JsonField<Int>? = null
        private var startMillisUtc: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMeetingAvailability: ExternalMeetingAvailability) = apply {
            endMillisUtc = externalMeetingAvailability.endMillisUtc
            startMillisUtc = externalMeetingAvailability.startMillisUtc
            additionalProperties = externalMeetingAvailability.additionalProperties.toMutableMap()
        }

        fun endMillisUtc(endMillisUtc: Int) = endMillisUtc(JsonField.of(endMillisUtc))

        /**
         * Sets [Builder.endMillisUtc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endMillisUtc] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endMillisUtc(endMillisUtc: JsonField<Int>) = apply { this.endMillisUtc = endMillisUtc }

        fun startMillisUtc(startMillisUtc: Int) = startMillisUtc(JsonField.of(startMillisUtc))

        /**
         * Sets [Builder.startMillisUtc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startMillisUtc] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startMillisUtc(startMillisUtc: JsonField<Int>) = apply {
            this.startMillisUtc = startMillisUtc
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
         * Returns an immutable instance of [ExternalMeetingAvailability].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endMillisUtc()
         * .startMillisUtc()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMeetingAvailability =
            ExternalMeetingAvailability(
                checkRequired("endMillisUtc", endMillisUtc),
                checkRequired("startMillisUtc", startMillisUtc),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalMeetingAvailability = apply {
        if (validated) {
            return@apply
        }

        endMillisUtc()
        startMillisUtc()
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
        (if (endMillisUtc.asKnown().isPresent) 1 else 0) +
            (if (startMillisUtc.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalMeetingAvailability &&
            endMillisUtc == other.endMillisUtc &&
            startMillisUtc == other.startMillisUtc &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endMillisUtc, startMillisUtc, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMeetingAvailability{endMillisUtc=$endMillisUtc, startMillisUtc=$startMillisUtc, additionalProperties=$additionalProperties}"
}
