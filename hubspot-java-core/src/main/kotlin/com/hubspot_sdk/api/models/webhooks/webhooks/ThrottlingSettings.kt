// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

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

class ThrottlingSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val maxConcurrentRequests: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("maxConcurrentRequests")
        @ExcludeMissing
        maxConcurrentRequests: JsonField<Int> = JsonMissing.of()
    ) : this(maxConcurrentRequests, mutableMapOf())

    /**
     * The maximum number of HTTP requests HubSpot will attempt to make to your app in a given time
     * frame determined by `period`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxConcurrentRequests(): Int = maxConcurrentRequests.getRequired("maxConcurrentRequests")

    /**
     * Returns the raw JSON value of [maxConcurrentRequests].
     *
     * Unlike [maxConcurrentRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxConcurrentRequests")
    @ExcludeMissing
    fun _maxConcurrentRequests(): JsonField<Int> = maxConcurrentRequests

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
         * Returns a mutable builder for constructing an instance of [ThrottlingSettings].
         *
         * The following fields are required:
         * ```java
         * .maxConcurrentRequests()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThrottlingSettings]. */
    class Builder internal constructor() {

        private var maxConcurrentRequests: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(throttlingSettings: ThrottlingSettings) = apply {
            maxConcurrentRequests = throttlingSettings.maxConcurrentRequests
            additionalProperties = throttlingSettings.additionalProperties.toMutableMap()
        }

        /**
         * The maximum number of HTTP requests HubSpot will attempt to make to your app in a given
         * time frame determined by `period`.
         */
        fun maxConcurrentRequests(maxConcurrentRequests: Int) =
            maxConcurrentRequests(JsonField.of(maxConcurrentRequests))

        /**
         * Sets [Builder.maxConcurrentRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxConcurrentRequests] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxConcurrentRequests(maxConcurrentRequests: JsonField<Int>) = apply {
            this.maxConcurrentRequests = maxConcurrentRequests
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
         * Returns an immutable instance of [ThrottlingSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .maxConcurrentRequests()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThrottlingSettings =
            ThrottlingSettings(
                checkRequired("maxConcurrentRequests", maxConcurrentRequests),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ThrottlingSettings = apply {
        if (validated) {
            return@apply
        }

        maxConcurrentRequests()
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
    internal fun validity(): Int = (if (maxConcurrentRequests.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThrottlingSettings &&
            maxConcurrentRequests == other.maxConcurrentRequests &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(maxConcurrentRequests, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThrottlingSettings{maxConcurrentRequests=$maxConcurrentRequests, additionalProperties=$additionalProperties}"
}
