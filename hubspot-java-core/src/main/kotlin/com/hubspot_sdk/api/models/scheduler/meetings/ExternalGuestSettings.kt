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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class ExternalGuestSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val canAddGuests: JsonField<Boolean>,
    private val maxGuestCount: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("canAddGuests")
        @ExcludeMissing
        canAddGuests: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maxGuestCount")
        @ExcludeMissing
        maxGuestCount: JsonField<Int> = JsonMissing.of(),
    ) : this(canAddGuests, maxGuestCount, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canAddGuests(): Boolean = canAddGuests.getRequired("canAddGuests")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxGuestCount(): Int = maxGuestCount.getRequired("maxGuestCount")

    /**
     * Returns the raw JSON value of [canAddGuests].
     *
     * Unlike [canAddGuests], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canAddGuests")
    @ExcludeMissing
    fun _canAddGuests(): JsonField<Boolean> = canAddGuests

    /**
     * Returns the raw JSON value of [maxGuestCount].
     *
     * Unlike [maxGuestCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxGuestCount")
    @ExcludeMissing
    fun _maxGuestCount(): JsonField<Int> = maxGuestCount

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
         * Returns a mutable builder for constructing an instance of [ExternalGuestSettings].
         *
         * The following fields are required:
         * ```java
         * .canAddGuests()
         * .maxGuestCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalGuestSettings]. */
    class Builder internal constructor() {

        private var canAddGuests: JsonField<Boolean>? = null
        private var maxGuestCount: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalGuestSettings: ExternalGuestSettings) = apply {
            canAddGuests = externalGuestSettings.canAddGuests
            maxGuestCount = externalGuestSettings.maxGuestCount
            additionalProperties = externalGuestSettings.additionalProperties.toMutableMap()
        }

        fun canAddGuests(canAddGuests: Boolean) = canAddGuests(JsonField.of(canAddGuests))

        /**
         * Sets [Builder.canAddGuests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canAddGuests] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canAddGuests(canAddGuests: JsonField<Boolean>) = apply {
            this.canAddGuests = canAddGuests
        }

        fun maxGuestCount(maxGuestCount: Int) = maxGuestCount(JsonField.of(maxGuestCount))

        /**
         * Sets [Builder.maxGuestCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxGuestCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxGuestCount(maxGuestCount: JsonField<Int>) = apply {
            this.maxGuestCount = maxGuestCount
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
         * Returns an immutable instance of [ExternalGuestSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .canAddGuests()
         * .maxGuestCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalGuestSettings =
            ExternalGuestSettings(
                checkRequired("canAddGuests", canAddGuests),
                checkRequired("maxGuestCount", maxGuestCount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalGuestSettings = apply {
        if (validated) {
            return@apply
        }

        canAddGuests()
        maxGuestCount()
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
        (if (canAddGuests.asKnown().isPresent) 1 else 0) +
            (if (maxGuestCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalGuestSettings &&
            canAddGuests == other.canAddGuests &&
            maxGuestCount == other.maxGuestCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(canAddGuests, maxGuestCount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalGuestSettings{canAddGuests=$canAddGuests, maxGuestCount=$maxGuestCount, additionalProperties=$additionalProperties}"
}
