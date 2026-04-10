// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.businessunits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicBusinessUnitLogoMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val logoAltText: JsonField<String>,
    private val logoUrl: JsonField<String>,
    private val resizedUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("logoAltText")
        @ExcludeMissing
        logoAltText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logoUrl") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resizedUrl") @ExcludeMissing resizedUrl: JsonField<String> = JsonMissing.of(),
    ) : this(logoAltText, logoUrl, resizedUrl, mutableMapOf())

    /**
     * The logo's alt text
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoAltText(): Optional<String> = logoAltText.getOptional("logoAltText")

    /**
     * The logo's url
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUrl(): Optional<String> = logoUrl.getOptional("logoUrl")

    /**
     * The logo's resized url
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resizedUrl(): Optional<String> = resizedUrl.getOptional("resizedUrl")

    /**
     * Returns the raw JSON value of [logoAltText].
     *
     * Unlike [logoAltText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logoAltText") @ExcludeMissing fun _logoAltText(): JsonField<String> = logoAltText

    /**
     * Returns the raw JSON value of [logoUrl].
     *
     * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logoUrl") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

    /**
     * Returns the raw JSON value of [resizedUrl].
     *
     * Unlike [resizedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resizedUrl") @ExcludeMissing fun _resizedUrl(): JsonField<String> = resizedUrl

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
         * [PublicBusinessUnitLogoMetadata].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicBusinessUnitLogoMetadata]. */
    class Builder internal constructor() {

        private var logoAltText: JsonField<String> = JsonMissing.of()
        private var logoUrl: JsonField<String> = JsonMissing.of()
        private var resizedUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicBusinessUnitLogoMetadata: PublicBusinessUnitLogoMetadata) = apply {
            logoAltText = publicBusinessUnitLogoMetadata.logoAltText
            logoUrl = publicBusinessUnitLogoMetadata.logoUrl
            resizedUrl = publicBusinessUnitLogoMetadata.resizedUrl
            additionalProperties =
                publicBusinessUnitLogoMetadata.additionalProperties.toMutableMap()
        }

        /** The logo's alt text */
        fun logoAltText(logoAltText: String) = logoAltText(JsonField.of(logoAltText))

        /**
         * Sets [Builder.logoAltText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoAltText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logoAltText(logoAltText: JsonField<String>) = apply { this.logoAltText = logoAltText }

        /** The logo's url */
        fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

        /** The logo's resized url */
        fun resizedUrl(resizedUrl: String) = resizedUrl(JsonField.of(resizedUrl))

        /**
         * Sets [Builder.resizedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resizedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resizedUrl(resizedUrl: JsonField<String>) = apply { this.resizedUrl = resizedUrl }

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
         * Returns an immutable instance of [PublicBusinessUnitLogoMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicBusinessUnitLogoMetadata =
            PublicBusinessUnitLogoMetadata(
                logoAltText,
                logoUrl,
                resizedUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicBusinessUnitLogoMetadata = apply {
        if (validated) {
            return@apply
        }

        logoAltText()
        logoUrl()
        resizedUrl()
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
        (if (logoAltText.asKnown().isPresent) 1 else 0) +
            (if (logoUrl.asKnown().isPresent) 1 else 0) +
            (if (resizedUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicBusinessUnitLogoMetadata &&
            logoAltText == other.logoAltText &&
            logoUrl == other.logoUrl &&
            resizedUrl == other.resizedUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(logoAltText, logoUrl, resizedUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicBusinessUnitLogoMetadata{logoAltText=$logoAltText, logoUrl=$logoUrl, resizedUrl=$resizedUrl, additionalProperties=$additionalProperties}"
}
