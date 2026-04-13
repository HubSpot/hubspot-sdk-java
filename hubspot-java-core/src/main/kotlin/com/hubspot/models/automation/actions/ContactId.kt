// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

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
import java.util.Optional

class ContactId
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val portalId: JsonField<Int>,
    private val email: JsonField<String>,
    private val vid: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vid") @ExcludeMissing vid: JsonField<Long> = JsonMissing.of(),
    ) : this(portalId, email, vid, mutableMapOf())

    /**
     * The ID of the portal associated with the contact.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Int = portalId.getRequired("portalId")

    /**
     * The email address of the contact.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The unique identifier for the contact.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vid(): Optional<Long> = vid.getOptional("vid")

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [vid].
     *
     * Unlike [vid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vid") @ExcludeMissing fun _vid(): JsonField<Long> = vid

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
         * Returns a mutable builder for constructing an instance of [ContactId].
         *
         * The following fields are required:
         * ```java
         * .portalId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactId]. */
    class Builder internal constructor() {

        private var portalId: JsonField<Int>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var vid: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactId: ContactId) = apply {
            portalId = contactId.portalId
            email = contactId.email
            vid = contactId.vid
            additionalProperties = contactId.additionalProperties.toMutableMap()
        }

        /** The ID of the portal associated with the contact. */
        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

        /** The email address of the contact. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The unique identifier for the contact. */
        fun vid(vid: Long) = vid(JsonField.of(vid))

        /**
         * Sets [Builder.vid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vid] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vid(vid: JsonField<Long>) = apply { this.vid = vid }

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
         * Returns an immutable instance of [ContactId].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .portalId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactId =
            ContactId(
                checkRequired("portalId", portalId),
                email,
                vid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactId = apply {
        if (validated) {
            return@apply
        }

        portalId()
        email()
        vid()
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
        (if (portalId.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (vid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactId &&
            portalId == other.portalId &&
            email == other.email &&
            vid == other.vid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(portalId, email, vid, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactId{portalId=$portalId, email=$email, vid=$vid, additionalProperties=$additionalProperties}"
}
