// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.currencies

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

class CentralExchangeRatesInformation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val centralExchangeRatesEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("centralExchangeRatesEnabled")
        @ExcludeMissing
        centralExchangeRatesEnabled: JsonField<Boolean> = JsonMissing.of()
    ) : this(centralExchangeRatesEnabled, mutableMapOf())

    /**
     * Indicates if central exchange rates is enabled for the portal or not.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun centralExchangeRatesEnabled(): Boolean =
        centralExchangeRatesEnabled.getRequired("centralExchangeRatesEnabled")

    /**
     * Returns the raw JSON value of [centralExchangeRatesEnabled].
     *
     * Unlike [centralExchangeRatesEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("centralExchangeRatesEnabled")
    @ExcludeMissing
    fun _centralExchangeRatesEnabled(): JsonField<Boolean> = centralExchangeRatesEnabled

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
         * [CentralExchangeRatesInformation].
         *
         * The following fields are required:
         * ```java
         * .centralExchangeRatesEnabled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CentralExchangeRatesInformation]. */
    class Builder internal constructor() {

        private var centralExchangeRatesEnabled: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(centralExchangeRatesInformation: CentralExchangeRatesInformation) =
            apply {
                centralExchangeRatesEnabled =
                    centralExchangeRatesInformation.centralExchangeRatesEnabled
                additionalProperties =
                    centralExchangeRatesInformation.additionalProperties.toMutableMap()
            }

        /** Indicates if central exchange rates is enabled for the portal or not. */
        fun centralExchangeRatesEnabled(centralExchangeRatesEnabled: Boolean) =
            centralExchangeRatesEnabled(JsonField.of(centralExchangeRatesEnabled))

        /**
         * Sets [Builder.centralExchangeRatesEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centralExchangeRatesEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun centralExchangeRatesEnabled(centralExchangeRatesEnabled: JsonField<Boolean>) = apply {
            this.centralExchangeRatesEnabled = centralExchangeRatesEnabled
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
         * Returns an immutable instance of [CentralExchangeRatesInformation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .centralExchangeRatesEnabled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CentralExchangeRatesInformation =
            CentralExchangeRatesInformation(
                checkRequired("centralExchangeRatesEnabled", centralExchangeRatesEnabled),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CentralExchangeRatesInformation = apply {
        if (validated) {
            return@apply
        }

        centralExchangeRatesEnabled()
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
    internal fun validity(): Int = (if (centralExchangeRatesEnabled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CentralExchangeRatesInformation &&
            centralExchangeRatesEnabled == other.centralExchangeRatesEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(centralExchangeRatesEnabled, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CentralExchangeRatesInformation{centralExchangeRatesEnabled=$centralExchangeRatesEnabled, additionalProperties=$additionalProperties}"
}
