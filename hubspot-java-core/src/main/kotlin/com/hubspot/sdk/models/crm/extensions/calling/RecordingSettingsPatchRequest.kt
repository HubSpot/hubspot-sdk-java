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

class RecordingSettingsPatchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val urlToRetrieveAuthedRecording: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("urlToRetrieveAuthedRecording")
        @ExcludeMissing
        urlToRetrieveAuthedRecording: JsonField<String> = JsonMissing.of()
    ) : this(urlToRetrieveAuthedRecording, mutableMapOf())

    /**
     * The URL used to access authenticated call recordings.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urlToRetrieveAuthedRecording(): Optional<String> =
        urlToRetrieveAuthedRecording.getOptional("urlToRetrieveAuthedRecording")

    /**
     * Returns the raw JSON value of [urlToRetrieveAuthedRecording].
     *
     * Unlike [urlToRetrieveAuthedRecording], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("urlToRetrieveAuthedRecording")
    @ExcludeMissing
    fun _urlToRetrieveAuthedRecording(): JsonField<String> = urlToRetrieveAuthedRecording

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
         * [RecordingSettingsPatchRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordingSettingsPatchRequest]. */
    class Builder internal constructor() {

        private var urlToRetrieveAuthedRecording: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordingSettingsPatchRequest: RecordingSettingsPatchRequest) = apply {
            urlToRetrieveAuthedRecording =
                recordingSettingsPatchRequest.urlToRetrieveAuthedRecording
            additionalProperties = recordingSettingsPatchRequest.additionalProperties.toMutableMap()
        }

        /** The URL used to access authenticated call recordings. */
        fun urlToRetrieveAuthedRecording(urlToRetrieveAuthedRecording: String) =
            urlToRetrieveAuthedRecording(JsonField.of(urlToRetrieveAuthedRecording))

        /**
         * Sets [Builder.urlToRetrieveAuthedRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urlToRetrieveAuthedRecording] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun urlToRetrieveAuthedRecording(urlToRetrieveAuthedRecording: JsonField<String>) = apply {
            this.urlToRetrieveAuthedRecording = urlToRetrieveAuthedRecording
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
         * Returns an immutable instance of [RecordingSettingsPatchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RecordingSettingsPatchRequest =
            RecordingSettingsPatchRequest(
                urlToRetrieveAuthedRecording,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecordingSettingsPatchRequest = apply {
        if (validated) {
            return@apply
        }

        urlToRetrieveAuthedRecording()
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
    internal fun validity(): Int = (if (urlToRetrieveAuthedRecording.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordingSettingsPatchRequest &&
            urlToRetrieveAuthedRecording == other.urlToRetrieveAuthedRecording &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(urlToRetrieveAuthedRecording, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecordingSettingsPatchRequest{urlToRetrieveAuthedRecording=$urlToRetrieveAuthedRecording, additionalProperties=$additionalProperties}"
}
