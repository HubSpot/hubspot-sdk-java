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

class ExternalLegalConsentResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val communicationTypeId: JsonField<String>,
    private val consented: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("communicationTypeId")
        @ExcludeMissing
        communicationTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consented") @ExcludeMissing consented: JsonField<Boolean> = JsonMissing.of(),
    ) : this(communicationTypeId, consented, mutableMapOf())

    /**
     * The ID of communication consent form being recorded.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun communicationTypeId(): String = communicationTypeId.getRequired("communicationTypeId")

    /**
     * Whether the user has given consent for the specified communication type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun consented(): Boolean = consented.getRequired("consented")

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
     * Returns the raw JSON value of [consented].
     *
     * Unlike [consented], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("consented") @ExcludeMissing fun _consented(): JsonField<Boolean> = consented

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
         * Returns a mutable builder for constructing an instance of [ExternalLegalConsentResponse].
         *
         * The following fields are required:
         * ```java
         * .communicationTypeId()
         * .consented()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLegalConsentResponse]. */
    class Builder internal constructor() {

        private var communicationTypeId: JsonField<String>? = null
        private var consented: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLegalConsentResponse: ExternalLegalConsentResponse) = apply {
            communicationTypeId = externalLegalConsentResponse.communicationTypeId
            consented = externalLegalConsentResponse.consented
            additionalProperties = externalLegalConsentResponse.additionalProperties.toMutableMap()
        }

        /** The ID of communication consent form being recorded. */
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

        /** Whether the user has given consent for the specified communication type. */
        fun consented(consented: Boolean) = consented(JsonField.of(consented))

        /**
         * Sets [Builder.consented] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consented] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun consented(consented: JsonField<Boolean>) = apply { this.consented = consented }

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
         * Returns an immutable instance of [ExternalLegalConsentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .communicationTypeId()
         * .consented()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLegalConsentResponse =
            ExternalLegalConsentResponse(
                checkRequired("communicationTypeId", communicationTypeId),
                checkRequired("consented", consented),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalLegalConsentResponse = apply {
        if (validated) {
            return@apply
        }

        communicationTypeId()
        consented()
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
            (if (consented.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLegalConsentResponse &&
            communicationTypeId == other.communicationTypeId &&
            consented == other.consented &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(communicationTypeId, consented, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLegalConsentResponse{communicationTypeId=$communicationTypeId, consented=$consented, additionalProperties=$additionalProperties}"
}
