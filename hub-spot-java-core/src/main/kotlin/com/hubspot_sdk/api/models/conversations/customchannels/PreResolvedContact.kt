// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PreResolvedContact
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactPropertiesLeadingToMatch: JsonField<List<String>>,
    private val contactVid: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contactPropertiesLeadingToMatch")
        @ExcludeMissing
        contactPropertiesLeadingToMatch: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("contactVid") @ExcludeMissing contactVid: JsonField<Int> = JsonMissing.of(),
    ) : this(contactPropertiesLeadingToMatch, contactVid, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactPropertiesLeadingToMatch(): List<String> =
        contactPropertiesLeadingToMatch.getRequired("contactPropertiesLeadingToMatch")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactVid(): Int = contactVid.getRequired("contactVid")

    /**
     * Returns the raw JSON value of [contactPropertiesLeadingToMatch].
     *
     * Unlike [contactPropertiesLeadingToMatch], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("contactPropertiesLeadingToMatch")
    @ExcludeMissing
    fun _contactPropertiesLeadingToMatch(): JsonField<List<String>> =
        contactPropertiesLeadingToMatch

    /**
     * Returns the raw JSON value of [contactVid].
     *
     * Unlike [contactVid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactVid") @ExcludeMissing fun _contactVid(): JsonField<Int> = contactVid

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
         * Returns a mutable builder for constructing an instance of [PreResolvedContact].
         *
         * The following fields are required:
         * ```java
         * .contactPropertiesLeadingToMatch()
         * .contactVid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreResolvedContact]. */
    class Builder internal constructor() {

        private var contactPropertiesLeadingToMatch: JsonField<MutableList<String>>? = null
        private var contactVid: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preResolvedContact: PreResolvedContact) = apply {
            contactPropertiesLeadingToMatch =
                preResolvedContact.contactPropertiesLeadingToMatch.map { it.toMutableList() }
            contactVid = preResolvedContact.contactVid
            additionalProperties = preResolvedContact.additionalProperties.toMutableMap()
        }

        fun contactPropertiesLeadingToMatch(contactPropertiesLeadingToMatch: List<String>) =
            contactPropertiesLeadingToMatch(JsonField.of(contactPropertiesLeadingToMatch))

        /**
         * Sets [Builder.contactPropertiesLeadingToMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPropertiesLeadingToMatch] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun contactPropertiesLeadingToMatch(
            contactPropertiesLeadingToMatch: JsonField<List<String>>
        ) = apply {
            this.contactPropertiesLeadingToMatch =
                contactPropertiesLeadingToMatch.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.contactPropertiesLeadingToMatch].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContactPropertiesLeadingToMatch(contactPropertiesLeadingToMatch: String) = apply {
            this.contactPropertiesLeadingToMatch =
                (this.contactPropertiesLeadingToMatch ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contactPropertiesLeadingToMatch", it)
                        .add(contactPropertiesLeadingToMatch)
                }
        }

        fun contactVid(contactVid: Int) = contactVid(JsonField.of(contactVid))

        /**
         * Sets [Builder.contactVid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactVid] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contactVid(contactVid: JsonField<Int>) = apply { this.contactVid = contactVid }

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
         * Returns an immutable instance of [PreResolvedContact].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contactPropertiesLeadingToMatch()
         * .contactVid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreResolvedContact =
            PreResolvedContact(
                checkRequired("contactPropertiesLeadingToMatch", contactPropertiesLeadingToMatch)
                    .map { it.toImmutable() },
                checkRequired("contactVid", contactVid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PreResolvedContact = apply {
        if (validated) {
            return@apply
        }

        contactPropertiesLeadingToMatch()
        contactVid()
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
        (contactPropertiesLeadingToMatch.asKnown().getOrNull()?.size ?: 0) +
            (if (contactVid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreResolvedContact &&
            contactPropertiesLeadingToMatch == other.contactPropertiesLeadingToMatch &&
            contactVid == other.contactVid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contactPropertiesLeadingToMatch, contactVid, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreResolvedContact{contactPropertiesLeadingToMatch=$contactPropertiesLeadingToMatch, contactVid=$contactVid, additionalProperties=$additionalProperties}"
}
