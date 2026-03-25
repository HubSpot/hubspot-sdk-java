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

class CurrencyCodeInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currencyCode: JsonField<String>,
    private val currencyName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currencyCode")
        @ExcludeMissing
        currencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyName")
        @ExcludeMissing
        currencyName: JsonField<String> = JsonMissing.of(),
    ) : this(currencyCode, currencyName, mutableMapOf())

    /**
     * The three-letter code representing a specific currency (ex. USD).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyCode(): String = currencyCode.getRequired("currencyCode")

    /**
     * The full name of the currency (ex. US Dollar).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyName(): String = currencyName.getRequired("currencyName")

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyCode")
    @ExcludeMissing
    fun _currencyCode(): JsonField<String> = currencyCode

    /**
     * Returns the raw JSON value of [currencyName].
     *
     * Unlike [currencyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyName")
    @ExcludeMissing
    fun _currencyName(): JsonField<String> = currencyName

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
         * Returns a mutable builder for constructing an instance of [CurrencyCodeInfo].
         *
         * The following fields are required:
         * ```java
         * .currencyCode()
         * .currencyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyCodeInfo]. */
    class Builder internal constructor() {

        private var currencyCode: JsonField<String>? = null
        private var currencyName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(currencyCodeInfo: CurrencyCodeInfo) = apply {
            currencyCode = currencyCodeInfo.currencyCode
            currencyName = currencyCodeInfo.currencyName
            additionalProperties = currencyCodeInfo.additionalProperties.toMutableMap()
        }

        /** The three-letter code representing a specific currency (ex. USD). */
        fun currencyCode(currencyCode: String) = currencyCode(JsonField.of(currencyCode))

        /**
         * Sets [Builder.currencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyCode(currencyCode: JsonField<String>) = apply {
            this.currencyCode = currencyCode
        }

        /** The full name of the currency (ex. US Dollar). */
        fun currencyName(currencyName: String) = currencyName(JsonField.of(currencyName))

        /**
         * Sets [Builder.currencyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyName(currencyName: JsonField<String>) = apply {
            this.currencyName = currencyName
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
         * Returns an immutable instance of [CurrencyCodeInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .currencyCode()
         * .currencyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrencyCodeInfo =
            CurrencyCodeInfo(
                checkRequired("currencyCode", currencyCode),
                checkRequired("currencyName", currencyName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CurrencyCodeInfo = apply {
        if (validated) {
            return@apply
        }

        currencyCode()
        currencyName()
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
        (if (currencyCode.asKnown().isPresent) 1 else 0) +
            (if (currencyName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrencyCodeInfo &&
            currencyCode == other.currencyCode &&
            currencyName == other.currencyName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currencyCode, currencyName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CurrencyCodeInfo{currencyCode=$currencyCode, currencyName=$currencyName, additionalProperties=$additionalProperties}"
}
