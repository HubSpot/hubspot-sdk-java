// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SettingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val targetUrl: JsonField<String>,
    private val throttling: JsonField<ThrottlingSettings>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("targetUrl") @ExcludeMissing targetUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("throttling")
        @ExcludeMissing
        throttling: JsonField<ThrottlingSettings> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(createdAt, targetUrl, throttling, updatedAt, mutableMapOf())

    /**
     * The date and time when the webhook settings were created, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The URL to which the webhook events will be sent. It is a string.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetUrl(): String = targetUrl.getRequired("targetUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun throttling(): ThrottlingSettings = throttling.getRequired("throttling")

    /**
     * The date and time when the webhook settings were last updated, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [SettingsResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .targetUrl()
         * .throttling()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettingsResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var targetUrl: JsonField<String>? = null
        private var throttling: JsonField<ThrottlingSettings>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(settingsResponse: SettingsResponse) = apply {
            createdAt = settingsResponse.createdAt
            targetUrl = settingsResponse.targetUrl
            throttling = settingsResponse.throttling
            updatedAt = settingsResponse.updatedAt
            additionalProperties = settingsResponse.additionalProperties.toMutableMap()
        }

        /** The date and time when the webhook settings were created, in ISO 8601 format. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The URL to which the webhook events will be sent. It is a string. */
        fun targetUrl(targetUrl: String) = targetUrl(JsonField.of(targetUrl))

        /**
         * Sets [Builder.targetUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetUrl(targetUrl: JsonField<String>) = apply { this.targetUrl = targetUrl }

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

        /** The date and time when the webhook settings were last updated, in ISO 8601 format. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [SettingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .targetUrl()
         * .throttling()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettingsResponse =
            SettingsResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("targetUrl", targetUrl),
                checkRequired("throttling", throttling),
                updatedAt,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): SettingsResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        targetUrl()
        throttling().validate()
        updatedAt()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (targetUrl.asKnown().isPresent) 1 else 0) +
            (throttling.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingsResponse &&
            createdAt == other.createdAt &&
            targetUrl == other.targetUrl &&
            throttling == other.throttling &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, targetUrl, throttling, updatedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettingsResponse{createdAt=$createdAt, targetUrl=$targetUrl, throttling=$throttling, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
