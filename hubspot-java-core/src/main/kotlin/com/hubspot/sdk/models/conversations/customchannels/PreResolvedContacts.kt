// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PreResolvedContacts
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contacts: JsonField<List<PreResolvedContact>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contacts")
        @ExcludeMissing
        contacts: JsonField<List<PreResolvedContact>> = JsonMissing.of()
    ) : this(contacts, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contacts(): List<PreResolvedContact> = contacts.getRequired("contacts")

    /**
     * Returns the raw JSON value of [contacts].
     *
     * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contacts")
    @ExcludeMissing
    fun _contacts(): JsonField<List<PreResolvedContact>> = contacts

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
         * Returns a mutable builder for constructing an instance of [PreResolvedContacts].
         *
         * The following fields are required:
         * ```java
         * .contacts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreResolvedContacts]. */
    class Builder internal constructor() {

        private var contacts: JsonField<MutableList<PreResolvedContact>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preResolvedContacts: PreResolvedContacts) = apply {
            contacts = preResolvedContacts.contacts.map { it.toMutableList() }
            additionalProperties = preResolvedContacts.additionalProperties.toMutableMap()
        }

        fun contacts(contacts: List<PreResolvedContact>) = contacts(JsonField.of(contacts))

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed `List<PreResolvedContact>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contacts(contacts: JsonField<List<PreResolvedContact>>) = apply {
            this.contacts = contacts.map { it.toMutableList() }
        }

        /**
         * Adds a single [PreResolvedContact] to [contacts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContact(contact: PreResolvedContact) = apply {
            contacts =
                (contacts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contacts", it).add(contact)
                }
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
         * Returns an immutable instance of [PreResolvedContacts].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contacts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreResolvedContacts =
            PreResolvedContacts(
                checkRequired("contacts", contacts).map { it.toImmutable() },
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
    fun validate(): PreResolvedContacts = apply {
        if (validated) {
            return@apply
        }

        contacts().forEach { it.validate() }
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
        (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreResolvedContacts &&
            contacts == other.contacts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(contacts, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreResolvedContacts{contacts=$contacts, additionalProperties=$additionalProperties}"
}
