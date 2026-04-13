// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class ExternalCommunicationConsentCheckbox
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val communicationTypeId: JsonField<String>,
    private val label: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("communicationTypeId")
        @ExcludeMissing
        communicationTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
    ) : this(communicationTypeId, label, required, mutableMapOf())

    /**
     * The ID of the communication consent form being recorded.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun communicationTypeId(): String = communicationTypeId.getRequired("communicationTypeId")

    /**
     * The text label describing the consent being given.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Whether the consent checkbox is required.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun required(): Boolean = required.getRequired("required")

    /**
     * Returns the raw JSON value of [communicationTypeId].
     *
     * Unlike [communicationTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("communicationTypeId")
    @ExcludeMissing
    fun _communicationTypeId(): JsonField<String> = communicationTypeId

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

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
         * [ExternalCommunicationConsentCheckbox].
         *
         * The following fields are required:
         * ```java
         * .communicationTypeId()
         * .label()
         * .required()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalCommunicationConsentCheckbox]. */
    class Builder internal constructor() {

        private var communicationTypeId: JsonField<String>? = null
        private var label: JsonField<String>? = null
        private var required: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalCommunicationConsentCheckbox: ExternalCommunicationConsentCheckbox
        ) = apply {
            communicationTypeId = externalCommunicationConsentCheckbox.communicationTypeId
            label = externalCommunicationConsentCheckbox.label
            required = externalCommunicationConsentCheckbox.required
            additionalProperties =
                externalCommunicationConsentCheckbox.additionalProperties.toMutableMap()
        }

        /** The ID of the communication consent form being recorded. */
        fun communicationTypeId(communicationTypeId: String) =
            communicationTypeId(JsonField.of(communicationTypeId))

        /**
         * Sets [Builder.communicationTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communicationTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun communicationTypeId(communicationTypeId: JsonField<String>) = apply {
            this.communicationTypeId = communicationTypeId
        }

        /** The text label describing the consent being given. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Whether the consent checkbox is required. */
        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

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
         * Returns an immutable instance of [ExternalCommunicationConsentCheckbox].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .communicationTypeId()
         * .label()
         * .required()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalCommunicationConsentCheckbox =
            ExternalCommunicationConsentCheckbox(
                checkRequired("communicationTypeId", communicationTypeId),
                checkRequired("label", label),
                checkRequired("required", required),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalCommunicationConsentCheckbox = apply {
        if (validated) {
            return@apply
        }

        communicationTypeId()
        label()
        required()
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
        (if (communicationTypeId.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (required.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalCommunicationConsentCheckbox &&
            communicationTypeId == other.communicationTypeId &&
            label == other.label &&
            required == other.required &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(communicationTypeId, label, required, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalCommunicationConsentCheckbox{communicationTypeId=$communicationTypeId, label=$label, required=$required, additionalProperties=$additionalProperties}"
}
