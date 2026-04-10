// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

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

class ContactAssociation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactId: JsonField<String>,
    private val email: JsonField<String>,
    private val firstname: JsonField<String>,
    private val lastname: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contactId") @ExcludeMissing contactId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstname") @ExcludeMissing firstname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastname") @ExcludeMissing lastname: JsonField<String> = JsonMissing.of(),
    ) : this(contactId, email, firstname, lastname, mutableMapOf())

    /**
     * The internal ID of the contact in HubSpot
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactId(): String = contactId.getRequired("contactId")

    /**
     * The email of the contact in HubSpot
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The first name of the contact in HubSpot
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstname(): Optional<String> = firstname.getOptional("firstname")

    /**
     * The last name of the contact in HubSpot
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastname(): Optional<String> = lastname.getOptional("lastname")

    /**
     * Returns the raw JSON value of [contactId].
     *
     * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactId") @ExcludeMissing fun _contactId(): JsonField<String> = contactId

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstname].
     *
     * Unlike [firstname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstname") @ExcludeMissing fun _firstname(): JsonField<String> = firstname

    /**
     * Returns the raw JSON value of [lastname].
     *
     * Unlike [lastname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastname") @ExcludeMissing fun _lastname(): JsonField<String> = lastname

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
         * Returns a mutable builder for constructing an instance of [ContactAssociation].
         *
         * The following fields are required:
         * ```java
         * .contactId()
         * .email()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactAssociation]. */
    class Builder internal constructor() {

        private var contactId: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var firstname: JsonField<String> = JsonMissing.of()
        private var lastname: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactAssociation: ContactAssociation) = apply {
            contactId = contactAssociation.contactId
            email = contactAssociation.email
            firstname = contactAssociation.firstname
            lastname = contactAssociation.lastname
            additionalProperties = contactAssociation.additionalProperties.toMutableMap()
        }

        /** The internal ID of the contact in HubSpot */
        fun contactId(contactId: String) = contactId(JsonField.of(contactId))

        /**
         * Sets [Builder.contactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactId(contactId: JsonField<String>) = apply { this.contactId = contactId }

        /** The email of the contact in HubSpot */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The first name of the contact in HubSpot */
        fun firstname(firstname: String) = firstname(JsonField.of(firstname))

        /**
         * Sets [Builder.firstname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstname] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstname(firstname: JsonField<String>) = apply { this.firstname = firstname }

        /** The last name of the contact in HubSpot */
        fun lastname(lastname: String) = lastname(JsonField.of(lastname))

        /**
         * Sets [Builder.lastname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastname(lastname: JsonField<String>) = apply { this.lastname = lastname }

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
         * Returns an immutable instance of [ContactAssociation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contactId()
         * .email()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactAssociation =
            ContactAssociation(
                checkRequired("contactId", contactId),
                checkRequired("email", email),
                firstname,
                lastname,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactAssociation = apply {
        if (validated) {
            return@apply
        }

        contactId()
        email()
        firstname()
        lastname()
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
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstname.asKnown().isPresent) 1 else 0) +
            (if (lastname.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactAssociation &&
            contactId == other.contactId &&
            email == other.email &&
            firstname == other.firstname &&
            lastname == other.lastname &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contactId, email, firstname, lastname, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactAssociation{contactId=$contactId, email=$email, firstname=$firstname, lastname=$lastname, additionalProperties=$additionalProperties}"
}
