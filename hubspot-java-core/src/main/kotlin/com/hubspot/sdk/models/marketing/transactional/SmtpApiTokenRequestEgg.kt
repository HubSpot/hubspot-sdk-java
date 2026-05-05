// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.transactional

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
import java.util.Collections
import java.util.Objects

class SmtpApiTokenRequestEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val campaignName: JsonField<String>,
    private val createContact: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("campaignName")
        @ExcludeMissing
        campaignName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createContact")
        @ExcludeMissing
        createContact: JsonField<Boolean> = JsonMissing.of(),
    ) : this(campaignName, createContact, mutableMapOf())

    /**
     * A name for the campaign tied to the SMTP API token.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun campaignName(): String = campaignName.getRequired("campaignName")

    /**
     * Indicates whether a contact should be created for email recipients.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createContact(): Boolean = createContact.getRequired("createContact")

    /**
     * Returns the raw JSON value of [campaignName].
     *
     * Unlike [campaignName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("campaignName")
    @ExcludeMissing
    fun _campaignName(): JsonField<String> = campaignName

    /**
     * Returns the raw JSON value of [createContact].
     *
     * Unlike [createContact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createContact")
    @ExcludeMissing
    fun _createContact(): JsonField<Boolean> = createContact

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
         * Returns a mutable builder for constructing an instance of [SmtpApiTokenRequestEgg].
         *
         * The following fields are required:
         * ```java
         * .campaignName()
         * .createContact()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SmtpApiTokenRequestEgg]. */
    class Builder internal constructor() {

        private var campaignName: JsonField<String>? = null
        private var createContact: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg) = apply {
            campaignName = smtpApiTokenRequestEgg.campaignName
            createContact = smtpApiTokenRequestEgg.createContact
            additionalProperties = smtpApiTokenRequestEgg.additionalProperties.toMutableMap()
        }

        /** A name for the campaign tied to the SMTP API token. */
        fun campaignName(campaignName: String) = campaignName(JsonField.of(campaignName))

        /**
         * Sets [Builder.campaignName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.campaignName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun campaignName(campaignName: JsonField<String>) = apply {
            this.campaignName = campaignName
        }

        /** Indicates whether a contact should be created for email recipients. */
        fun createContact(createContact: Boolean) = createContact(JsonField.of(createContact))

        /**
         * Sets [Builder.createContact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createContact] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createContact(createContact: JsonField<Boolean>) = apply {
            this.createContact = createContact
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
         * Returns an immutable instance of [SmtpApiTokenRequestEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .campaignName()
         * .createContact()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SmtpApiTokenRequestEgg =
            SmtpApiTokenRequestEgg(
                checkRequired("campaignName", campaignName),
                checkRequired("createContact", createContact),
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
    fun validate(): SmtpApiTokenRequestEgg = apply {
        if (validated) {
            return@apply
        }

        campaignName()
        createContact()
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
        (if (campaignName.asKnown().isPresent) 1 else 0) +
            (if (createContact.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SmtpApiTokenRequestEgg &&
            campaignName == other.campaignName &&
            createContact == other.createContact &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(campaignName, createContact, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SmtpApiTokenRequestEgg{campaignName=$campaignName, createContact=$createContact, additionalProperties=$additionalProperties}"
}
