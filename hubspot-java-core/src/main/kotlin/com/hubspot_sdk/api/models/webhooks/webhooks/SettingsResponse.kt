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
     * When this subscription was created. Formatted as milliseconds from the [Unix epoch](#).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * A publicly available URL for Hubspot to call where event payloads will be delivered. See
     * [link-so-some-doc](#) for details about the format of these event payloads.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetUrl(): String = targetUrl.getRequired("targetUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun throttling(): ThrottlingSettings = throttling.getRequired("throttling")

    /**
     * When this subscription was last updated. Formatted as milliseconds from the [Unix epoch](#).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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

        /**
         * When this subscription was created. Formatted as milliseconds from the [Unix epoch](#).
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * A publicly available URL for Hubspot to call where event payloads will be delivered. See
         * [link-so-some-doc](#) for details about the format of these event payloads.
         */
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

        /**
         * When this subscription was last updated. Formatted as milliseconds from the
         * [Unix epoch](#).
         */
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
