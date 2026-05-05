// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ChannelConnectionSettingsPatchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isReady: JsonField<Boolean>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isReady") @ExcludeMissing isReady: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(isReady, url, mutableMapOf())

    /**
     * Indicates whether the channel connection settings are ready.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isReady(): Optional<Boolean> = isReady.getOptional("isReady")

    /**
     * The URL for the channel connection settings.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [isReady].
     *
     * Unlike [isReady], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isReady") @ExcludeMissing fun _isReady(): JsonField<Boolean> = isReady

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * [ChannelConnectionSettingsPatchRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelConnectionSettingsPatchRequest]. */
    class Builder internal constructor() {

        private var isReady: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            channelConnectionSettingsPatchRequest: ChannelConnectionSettingsPatchRequest
        ) = apply {
            isReady = channelConnectionSettingsPatchRequest.isReady
            url = channelConnectionSettingsPatchRequest.url
            additionalProperties =
                channelConnectionSettingsPatchRequest.additionalProperties.toMutableMap()
        }

        /** Indicates whether the channel connection settings are ready. */
        fun isReady(isReady: Boolean) = isReady(JsonField.of(isReady))

        /**
         * Sets [Builder.isReady] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isReady] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isReady(isReady: JsonField<Boolean>) = apply { this.isReady = isReady }

        /** The URL for the channel connection settings. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [ChannelConnectionSettingsPatchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChannelConnectionSettingsPatchRequest =
            ChannelConnectionSettingsPatchRequest(isReady, url, additionalProperties.toMutableMap())
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
    fun validate(): ChannelConnectionSettingsPatchRequest = apply {
        if (validated) {
            return@apply
        }

        isReady()
        url()
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
        (if (isReady.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelConnectionSettingsPatchRequest &&
            isReady == other.isReady &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(isReady, url, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChannelConnectionSettingsPatchRequest{isReady=$isReady, url=$url, additionalProperties=$additionalProperties}"
}
