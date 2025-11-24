// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.subscriptions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PauseSubscriptionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pauseReason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pauseReason")
        @ExcludeMissing
        pauseReason: JsonField<String> = JsonMissing.of()
    ) : this(pauseReason, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pauseReason(): Optional<String> = pauseReason.getOptional("pauseReason")

    /**
     * Returns the raw JSON value of [pauseReason].
     *
     * Unlike [pauseReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pauseReason") @ExcludeMissing fun _pauseReason(): JsonField<String> = pauseReason

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

        /** Returns a mutable builder for constructing an instance of [PauseSubscriptionRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PauseSubscriptionRequest]. */
    class Builder internal constructor() {

        private var pauseReason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pauseSubscriptionRequest: PauseSubscriptionRequest) = apply {
            pauseReason = pauseSubscriptionRequest.pauseReason
            additionalProperties = pauseSubscriptionRequest.additionalProperties.toMutableMap()
        }

        fun pauseReason(pauseReason: String) = pauseReason(JsonField.of(pauseReason))

        /**
         * Sets [Builder.pauseReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pauseReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pauseReason(pauseReason: JsonField<String>) = apply { this.pauseReason = pauseReason }

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
         * Returns an immutable instance of [PauseSubscriptionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PauseSubscriptionRequest =
            PauseSubscriptionRequest(pauseReason, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PauseSubscriptionRequest = apply {
        if (validated) {
            return@apply
        }

        pauseReason()
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
    @JvmSynthetic internal fun validity(): Int = (if (pauseReason.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PauseSubscriptionRequest &&
            pauseReason == other.pauseReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(pauseReason, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PauseSubscriptionRequest{pauseReason=$pauseReason, additionalProperties=$additionalProperties}"
}
