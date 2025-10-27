// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

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

class UnenrollmentSettingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val emailSettings: JsonField<EmailSettingsResponse>,
    private val meetingSettings: JsonField<MeetingSettingsResponse>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("emailSettings")
        @ExcludeMissing
        emailSettings: JsonField<EmailSettingsResponse> = JsonMissing.of(),
        @JsonProperty("meetingSettings")
        @ExcludeMissing
        meetingSettings: JsonField<MeetingSettingsResponse> = JsonMissing.of(),
    ) : this(emailSettings, meetingSettings, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailSettings(): EmailSettingsResponse = emailSettings.getRequired("emailSettings")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meetingSettings(): MeetingSettingsResponse = meetingSettings.getRequired("meetingSettings")

    /**
     * Returns the raw JSON value of [emailSettings].
     *
     * Unlike [emailSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailSettings")
    @ExcludeMissing
    fun _emailSettings(): JsonField<EmailSettingsResponse> = emailSettings

    /**
     * Returns the raw JSON value of [meetingSettings].
     *
     * Unlike [meetingSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meetingSettings")
    @ExcludeMissing
    fun _meetingSettings(): JsonField<MeetingSettingsResponse> = meetingSettings

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
         * Returns a mutable builder for constructing an instance of [UnenrollmentSettingsResponse].
         *
         * The following fields are required:
         * ```java
         * .emailSettings()
         * .meetingSettings()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UnenrollmentSettingsResponse]. */
    class Builder internal constructor() {

        private var emailSettings: JsonField<EmailSettingsResponse>? = null
        private var meetingSettings: JsonField<MeetingSettingsResponse>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(unenrollmentSettingsResponse: UnenrollmentSettingsResponse) = apply {
            emailSettings = unenrollmentSettingsResponse.emailSettings
            meetingSettings = unenrollmentSettingsResponse.meetingSettings
            additionalProperties = unenrollmentSettingsResponse.additionalProperties.toMutableMap()
        }

        fun emailSettings(emailSettings: EmailSettingsResponse) =
            emailSettings(JsonField.of(emailSettings))

        /**
         * Sets [Builder.emailSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailSettings] with a well-typed [EmailSettingsResponse]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun emailSettings(emailSettings: JsonField<EmailSettingsResponse>) = apply {
            this.emailSettings = emailSettings
        }

        fun meetingSettings(meetingSettings: MeetingSettingsResponse) =
            meetingSettings(JsonField.of(meetingSettings))

        /**
         * Sets [Builder.meetingSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meetingSettings] with a well-typed
         * [MeetingSettingsResponse] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun meetingSettings(meetingSettings: JsonField<MeetingSettingsResponse>) = apply {
            this.meetingSettings = meetingSettings
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
         * Returns an immutable instance of [UnenrollmentSettingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .emailSettings()
         * .meetingSettings()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UnenrollmentSettingsResponse =
            UnenrollmentSettingsResponse(
                checkRequired("emailSettings", emailSettings),
                checkRequired("meetingSettings", meetingSettings),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UnenrollmentSettingsResponse = apply {
        if (validated) {
            return@apply
        }

        emailSettings().validate()
        meetingSettings().validate()
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
        (emailSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (meetingSettings.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnenrollmentSettingsResponse &&
            emailSettings == other.emailSettings &&
            meetingSettings == other.meetingSettings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(emailSettings, meetingSettings, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UnenrollmentSettingsResponse{emailSettings=$emailSettings, meetingSettings=$meetingSettings, additionalProperties=$additionalProperties}"
}
