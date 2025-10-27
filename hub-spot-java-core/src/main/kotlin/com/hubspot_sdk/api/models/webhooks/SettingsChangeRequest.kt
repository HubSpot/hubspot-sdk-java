// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

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
import kotlin.jvm.optionals.getOrNull

/** New or updated webhook settings for an app. */
class SettingsChangeRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val targetUrl: JsonField<String>,
    private val throttling: JsonField<ThrottlingSettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("targetUrl") @ExcludeMissing targetUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("throttling")
        @ExcludeMissing
        throttling: JsonField<ThrottlingSettings> = JsonMissing.of(),
    ) : this(targetUrl, throttling, mutableMapOf())

    /**
     * A publicly available URL for HubSpot to call where event payloads will be delivered.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetUrl(): String = targetUrl.getRequired("targetUrl")

    /**
     * Configuration details for webhook throttling.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun throttling(): ThrottlingSettings = throttling.getRequired("throttling")

    /**
     * Returns the raw JSON value of [targetUrl].
     *
     * Unlike [targetUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetUrl") @ExcludeMissing fun _targetUrl(): JsonField<String> = targetUrl

    /**
     * Returns the raw JSON value of [throttling].
     *
     * Unlike [throttling], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("throttling")
    @ExcludeMissing
    fun _throttling(): JsonField<ThrottlingSettings> = throttling

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
         * Returns a mutable builder for constructing an instance of [SettingsChangeRequest].
         *
         * The following fields are required:
         * ```java
         * .targetUrl()
         * .throttling()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettingsChangeRequest]. */
    class Builder internal constructor() {

        private var targetUrl: JsonField<String>? = null
        private var throttling: JsonField<ThrottlingSettings>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settingsChangeRequest: SettingsChangeRequest) = apply {
            targetUrl = settingsChangeRequest.targetUrl
            throttling = settingsChangeRequest.throttling
            additionalProperties = settingsChangeRequest.additionalProperties.toMutableMap()
        }

        /** A publicly available URL for HubSpot to call where event payloads will be delivered. */
        fun targetUrl(targetUrl: String) = targetUrl(JsonField.of(targetUrl))

        /**
         * Sets [Builder.targetUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetUrl(targetUrl: JsonField<String>) = apply { this.targetUrl = targetUrl }

        /** Configuration details for webhook throttling. */
        fun throttling(throttling: ThrottlingSettings) = throttling(JsonField.of(throttling))

        /**
         * Sets [Builder.throttling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.throttling] with a well-typed [ThrottlingSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun throttling(throttling: JsonField<ThrottlingSettings>) = apply {
            this.throttling = throttling
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
         * Returns an immutable instance of [SettingsChangeRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .targetUrl()
         * .throttling()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettingsChangeRequest =
            SettingsChangeRequest(
                checkRequired("targetUrl", targetUrl),
                checkRequired("throttling", throttling),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SettingsChangeRequest = apply {
        if (validated) {
            return@apply
        }

        targetUrl()
        throttling().validate()
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
        (if (targetUrl.asKnown().isPresent) 1 else 0) +
            (throttling.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingsChangeRequest &&
            targetUrl == other.targetUrl &&
            throttling == other.throttling &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(targetUrl, throttling, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettingsChangeRequest{targetUrl=$targetUrl, throttling=$throttling, additionalProperties=$additionalProperties}"
}
