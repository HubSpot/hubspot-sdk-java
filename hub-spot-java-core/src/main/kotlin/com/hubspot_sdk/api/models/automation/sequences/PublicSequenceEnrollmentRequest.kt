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
import java.util.Optional

class PublicSequenceEnrollmentRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactId: JsonField<String>,
    private val senderEmail: JsonField<String>,
    private val sequenceId: JsonField<String>,
    private val senderAliasAddress: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contactId") @ExcludeMissing contactId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senderEmail")
        @ExcludeMissing
        senderEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sequenceId")
        @ExcludeMissing
        sequenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senderAliasAddress")
        @ExcludeMissing
        senderAliasAddress: JsonField<String> = JsonMissing.of(),
    ) : this(contactId, senderEmail, sequenceId, senderAliasAddress, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactId(): String = contactId.getRequired("contactId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderEmail(): String = senderEmail.getRequired("senderEmail")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sequenceId(): String = sequenceId.getRequired("sequenceId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderAliasAddress(): Optional<String> =
        senderAliasAddress.getOptional("senderAliasAddress")

    /**
     * Returns the raw JSON value of [contactId].
     *
     * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactId") @ExcludeMissing fun _contactId(): JsonField<String> = contactId

    /**
     * Returns the raw JSON value of [senderEmail].
     *
     * Unlike [senderEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderEmail") @ExcludeMissing fun _senderEmail(): JsonField<String> = senderEmail

    /**
     * Returns the raw JSON value of [sequenceId].
     *
     * Unlike [sequenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequenceId") @ExcludeMissing fun _sequenceId(): JsonField<String> = sequenceId

    /**
     * Returns the raw JSON value of [senderAliasAddress].
     *
     * Unlike [senderAliasAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("senderAliasAddress")
    @ExcludeMissing
    fun _senderAliasAddress(): JsonField<String> = senderAliasAddress

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
         * [PublicSequenceEnrollmentRequest].
         *
         * The following fields are required:
         * ```java
         * .contactId()
         * .senderEmail()
         * .sequenceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSequenceEnrollmentRequest]. */
    class Builder internal constructor() {

        private var contactId: JsonField<String>? = null
        private var senderEmail: JsonField<String>? = null
        private var sequenceId: JsonField<String>? = null
        private var senderAliasAddress: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSequenceEnrollmentRequest: PublicSequenceEnrollmentRequest) =
            apply {
                contactId = publicSequenceEnrollmentRequest.contactId
                senderEmail = publicSequenceEnrollmentRequest.senderEmail
                sequenceId = publicSequenceEnrollmentRequest.sequenceId
                senderAliasAddress = publicSequenceEnrollmentRequest.senderAliasAddress
                additionalProperties =
                    publicSequenceEnrollmentRequest.additionalProperties.toMutableMap()
            }

        fun contactId(contactId: String) = contactId(JsonField.of(contactId))

        /**
         * Sets [Builder.contactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactId(contactId: JsonField<String>) = apply { this.contactId = contactId }

        fun senderEmail(senderEmail: String) = senderEmail(JsonField.of(senderEmail))

        /**
         * Sets [Builder.senderEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderEmail(senderEmail: JsonField<String>) = apply { this.senderEmail = senderEmail }

        fun sequenceId(sequenceId: String) = sequenceId(JsonField.of(sequenceId))

        /**
         * Sets [Builder.sequenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sequenceId(sequenceId: JsonField<String>) = apply { this.sequenceId = sequenceId }

        fun senderAliasAddress(senderAliasAddress: String) =
            senderAliasAddress(JsonField.of(senderAliasAddress))

        /**
         * Sets [Builder.senderAliasAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAliasAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderAliasAddress(senderAliasAddress: JsonField<String>) = apply {
            this.senderAliasAddress = senderAliasAddress
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
         * Returns an immutable instance of [PublicSequenceEnrollmentRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contactId()
         * .senderEmail()
         * .sequenceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSequenceEnrollmentRequest =
            PublicSequenceEnrollmentRequest(
                checkRequired("contactId", contactId),
                checkRequired("senderEmail", senderEmail),
                checkRequired("sequenceId", sequenceId),
                senderAliasAddress,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSequenceEnrollmentRequest = apply {
        if (validated) {
            return@apply
        }

        contactId()
        senderEmail()
        sequenceId()
        senderAliasAddress()
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
        (if (contactId.asKnown().isPresent) 1 else 0) +
            (if (senderEmail.asKnown().isPresent) 1 else 0) +
            (if (sequenceId.asKnown().isPresent) 1 else 0) +
            (if (senderAliasAddress.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSequenceEnrollmentRequest &&
            contactId == other.contactId &&
            senderEmail == other.senderEmail &&
            sequenceId == other.sequenceId &&
            senderAliasAddress == other.senderAliasAddress &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contactId, senderEmail, sequenceId, senderAliasAddress, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSequenceEnrollmentRequest{contactId=$contactId, senderEmail=$senderEmail, sequenceId=$sequenceId, senderAliasAddress=$senderAliasAddress, additionalProperties=$additionalProperties}"
}
