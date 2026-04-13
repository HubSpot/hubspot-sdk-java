// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

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
import kotlin.jvm.optionals.getOrNull

class PublicEmailToDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactIds: JsonField<PublicEmailRecipients>,
    private val contactIlsLists: JsonField<PublicEmailRecipients>,
    private val contactLists: JsonField<PublicEmailRecipients>,
    private val limitSendFrequency: JsonField<Boolean>,
    private val suppressGraymail: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contactIds")
        @ExcludeMissing
        contactIds: JsonField<PublicEmailRecipients> = JsonMissing.of(),
        @JsonProperty("contactIlsLists")
        @ExcludeMissing
        contactIlsLists: JsonField<PublicEmailRecipients> = JsonMissing.of(),
        @JsonProperty("contactLists")
        @ExcludeMissing
        contactLists: JsonField<PublicEmailRecipients> = JsonMissing.of(),
        @JsonProperty("limitSendFrequency")
        @ExcludeMissing
        limitSendFrequency: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("suppressGraymail")
        @ExcludeMissing
        suppressGraymail: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        contactIds,
        contactIlsLists,
        contactLists,
        limitSendFrequency,
        suppressGraymail,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactIds(): Optional<PublicEmailRecipients> = contactIds.getOptional("contactIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactIlsLists(): Optional<PublicEmailRecipients> =
        contactIlsLists.getOptional("contactIlsLists")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactLists(): Optional<PublicEmailRecipients> = contactLists.getOptional("contactLists")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitSendFrequency(): Optional<Boolean> =
        limitSendFrequency.getOptional("limitSendFrequency")

    /**
     * Whether to send to unengaged contacts (false) or not (true).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suppressGraymail(): Optional<Boolean> = suppressGraymail.getOptional("suppressGraymail")

    /**
     * Returns the raw JSON value of [contactIds].
     *
     * Unlike [contactIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactIds")
    @ExcludeMissing
    fun _contactIds(): JsonField<PublicEmailRecipients> = contactIds

    /**
     * Returns the raw JSON value of [contactIlsLists].
     *
     * Unlike [contactIlsLists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactIlsLists")
    @ExcludeMissing
    fun _contactIlsLists(): JsonField<PublicEmailRecipients> = contactIlsLists

    /**
     * Returns the raw JSON value of [contactLists].
     *
     * Unlike [contactLists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactLists")
    @ExcludeMissing
    fun _contactLists(): JsonField<PublicEmailRecipients> = contactLists

    /**
     * Returns the raw JSON value of [limitSendFrequency].
     *
     * Unlike [limitSendFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("limitSendFrequency")
    @ExcludeMissing
    fun _limitSendFrequency(): JsonField<Boolean> = limitSendFrequency

    /**
     * Returns the raw JSON value of [suppressGraymail].
     *
     * Unlike [suppressGraymail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("suppressGraymail")
    @ExcludeMissing
    fun _suppressGraymail(): JsonField<Boolean> = suppressGraymail

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

        /** Returns a mutable builder for constructing an instance of [PublicEmailToDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailToDetails]. */
    class Builder internal constructor() {

        private var contactIds: JsonField<PublicEmailRecipients> = JsonMissing.of()
        private var contactIlsLists: JsonField<PublicEmailRecipients> = JsonMissing.of()
        private var contactLists: JsonField<PublicEmailRecipients> = JsonMissing.of()
        private var limitSendFrequency: JsonField<Boolean> = JsonMissing.of()
        private var suppressGraymail: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailToDetails: PublicEmailToDetails) = apply {
            contactIds = publicEmailToDetails.contactIds
            contactIlsLists = publicEmailToDetails.contactIlsLists
            contactLists = publicEmailToDetails.contactLists
            limitSendFrequency = publicEmailToDetails.limitSendFrequency
            suppressGraymail = publicEmailToDetails.suppressGraymail
            additionalProperties = publicEmailToDetails.additionalProperties.toMutableMap()
        }

        fun contactIds(contactIds: PublicEmailRecipients) = contactIds(JsonField.of(contactIds))

        /**
         * Sets [Builder.contactIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactIds] with a well-typed [PublicEmailRecipients]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contactIds(contactIds: JsonField<PublicEmailRecipients>) = apply {
            this.contactIds = contactIds
        }

        fun contactIlsLists(contactIlsLists: PublicEmailRecipients) =
            contactIlsLists(JsonField.of(contactIlsLists))

        /**
         * Sets [Builder.contactIlsLists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactIlsLists] with a well-typed
         * [PublicEmailRecipients] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun contactIlsLists(contactIlsLists: JsonField<PublicEmailRecipients>) = apply {
            this.contactIlsLists = contactIlsLists
        }

        fun contactLists(contactLists: PublicEmailRecipients) =
            contactLists(JsonField.of(contactLists))

        /**
         * Sets [Builder.contactLists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactLists] with a well-typed [PublicEmailRecipients]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contactLists(contactLists: JsonField<PublicEmailRecipients>) = apply {
            this.contactLists = contactLists
        }

        fun limitSendFrequency(limitSendFrequency: Boolean) =
            limitSendFrequency(JsonField.of(limitSendFrequency))

        /**
         * Sets [Builder.limitSendFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitSendFrequency] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun limitSendFrequency(limitSendFrequency: JsonField<Boolean>) = apply {
            this.limitSendFrequency = limitSendFrequency
        }

        /** Whether to send to unengaged contacts (false) or not (true). */
        fun suppressGraymail(suppressGraymail: Boolean) =
            suppressGraymail(JsonField.of(suppressGraymail))

        /**
         * Sets [Builder.suppressGraymail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suppressGraymail] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun suppressGraymail(suppressGraymail: JsonField<Boolean>) = apply {
            this.suppressGraymail = suppressGraymail
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
         * Returns an immutable instance of [PublicEmailToDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicEmailToDetails =
            PublicEmailToDetails(
                contactIds,
                contactIlsLists,
                contactLists,
                limitSendFrequency,
                suppressGraymail,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailToDetails = apply {
        if (validated) {
            return@apply
        }

        contactIds().ifPresent { it.validate() }
        contactIlsLists().ifPresent { it.validate() }
        contactLists().ifPresent { it.validate() }
        limitSendFrequency()
        suppressGraymail()
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
        (contactIds.asKnown().getOrNull()?.validity() ?: 0) +
            (contactIlsLists.asKnown().getOrNull()?.validity() ?: 0) +
            (contactLists.asKnown().getOrNull()?.validity() ?: 0) +
            (if (limitSendFrequency.asKnown().isPresent) 1 else 0) +
            (if (suppressGraymail.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailToDetails &&
            contactIds == other.contactIds &&
            contactIlsLists == other.contactIlsLists &&
            contactLists == other.contactLists &&
            limitSendFrequency == other.limitSendFrequency &&
            suppressGraymail == other.suppressGraymail &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contactIds,
            contactIlsLists,
            contactLists,
            limitSendFrequency,
            suppressGraymail,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailToDetails{contactIds=$contactIds, contactIlsLists=$contactIlsLists, contactLists=$contactLists, limitSendFrequency=$limitSendFrequency, suppressGraymail=$suppressGraymail, additionalProperties=$additionalProperties}"
}
