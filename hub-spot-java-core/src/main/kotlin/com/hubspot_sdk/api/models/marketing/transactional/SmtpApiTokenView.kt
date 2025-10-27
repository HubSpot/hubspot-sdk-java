// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.transactional

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * A SMTP API token provides both an ID and password that can be used to send email through the
 * HubSpot SMTP API.
 */
class SmtpApiTokenView
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val campaignName: JsonField<String>,
    private val createContact: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val emailCampaignId: JsonField<String>,
    private val password: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("campaignName")
        @ExcludeMissing
        campaignName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createContact")
        @ExcludeMissing
        createContact: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailCampaignId")
        @ExcludeMissing
        emailCampaignId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        campaignName,
        createContact,
        createdAt,
        createdBy,
        emailCampaignId,
        password,
        mutableMapOf(),
    )

    /**
     * User name to log into the HubSpot SMTP server.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A name for the campaign tied to the token.
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
     * Timestamp generated when a token is created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Email address of the user that sent the token creation request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): String = createdBy.getRequired("createdBy")

    /**
     * Identifier assigned to the campaign provided in the token creation request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailCampaignId(): String = emailCampaignId.getRequired("emailCampaignId")

    /**
     * Password used to log into the HubSpot SMTP server.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = password.getOptional("password")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [emailCampaignId].
     *
     * Unlike [emailCampaignId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailCampaignId")
    @ExcludeMissing
    fun _emailCampaignId(): JsonField<String> = emailCampaignId

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

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
         * Returns a mutable builder for constructing an instance of [SmtpApiTokenView].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .campaignName()
         * .createContact()
         * .createdAt()
         * .createdBy()
         * .emailCampaignId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SmtpApiTokenView]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var campaignName: JsonField<String>? = null
        private var createContact: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<String>? = null
        private var emailCampaignId: JsonField<String>? = null
        private var password: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(smtpApiTokenView: SmtpApiTokenView) = apply {
            id = smtpApiTokenView.id
            campaignName = smtpApiTokenView.campaignName
            createContact = smtpApiTokenView.createContact
            createdAt = smtpApiTokenView.createdAt
            createdBy = smtpApiTokenView.createdBy
            emailCampaignId = smtpApiTokenView.emailCampaignId
            password = smtpApiTokenView.password
            additionalProperties = smtpApiTokenView.additionalProperties.toMutableMap()
        }

        /** User name to log into the HubSpot SMTP server. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** A name for the campaign tied to the token. */
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

        /** Timestamp generated when a token is created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Email address of the user that sent the token creation request. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** Identifier assigned to the campaign provided in the token creation request. */
        fun emailCampaignId(emailCampaignId: String) =
            emailCampaignId(JsonField.of(emailCampaignId))

        /**
         * Sets [Builder.emailCampaignId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailCampaignId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailCampaignId(emailCampaignId: JsonField<String>) = apply {
            this.emailCampaignId = emailCampaignId
        }

        /** Password used to log into the HubSpot SMTP server. */
        fun password(password: String) = password(JsonField.of(password))

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

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
         * Returns an immutable instance of [SmtpApiTokenView].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .campaignName()
         * .createContact()
         * .createdAt()
         * .createdBy()
         * .emailCampaignId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SmtpApiTokenView =
            SmtpApiTokenView(
                checkRequired("id", id),
                checkRequired("campaignName", campaignName),
                checkRequired("createContact", createContact),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("emailCampaignId", emailCampaignId),
                password,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SmtpApiTokenView = apply {
        if (validated) {
            return@apply
        }

        id()
        campaignName()
        createContact()
        createdAt()
        createdBy()
        emailCampaignId()
        password()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (campaignName.asKnown().isPresent) 1 else 0) +
            (if (createContact.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (emailCampaignId.asKnown().isPresent) 1 else 0) +
            (if (password.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SmtpApiTokenView &&
            id == other.id &&
            campaignName == other.campaignName &&
            createContact == other.createContact &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            emailCampaignId == other.emailCampaignId &&
            password == other.password &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            campaignName,
            createContact,
            createdAt,
            createdBy,
            emailCampaignId,
            password,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SmtpApiTokenView{id=$id, campaignName=$campaignName, createContact=$createContact, createdAt=$createdAt, createdBy=$createdBy, emailCampaignId=$emailCampaignId, password=$password, additionalProperties=$additionalProperties}"
}
