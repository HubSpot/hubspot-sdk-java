// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.users

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserProvisionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val email: JsonField<String>,
    private val sendWelcomeEmail: JsonField<Boolean>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val primaryTeamId: JsonField<String>,
    private val roleId: JsonField<String>,
    private val secondaryTeamIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sendWelcomeEmail")
        @ExcludeMissing
        sendWelcomeEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryTeamId")
        @ExcludeMissing
        primaryTeamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roleId") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryTeamIds")
        @ExcludeMissing
        secondaryTeamIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        email,
        sendWelcomeEmail,
        firstName,
        lastName,
        primaryTeamId,
        roleId,
        secondaryTeamIds,
        mutableMapOf(),
    )

    /**
     * The user's email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * Whether to send a welcome email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendWelcomeEmail(): Boolean = sendWelcomeEmail.getRequired("sendWelcomeEmail")

    /**
     * The user's first name.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The user's last name.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * The user's primary team.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryTeamId(): Optional<String> = primaryTeamId.getOptional("primaryTeamId")

    /**
     * The user's role.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleId(): Optional<String> = roleId.getOptional("roleId")

    /**
     * The user's additional teams.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryTeamIds(): Optional<List<String>> =
        secondaryTeamIds.getOptional("secondaryTeamIds")

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [sendWelcomeEmail].
     *
     * Unlike [sendWelcomeEmail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sendWelcomeEmail")
    @ExcludeMissing
    fun _sendWelcomeEmail(): JsonField<Boolean> = sendWelcomeEmail

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [primaryTeamId].
     *
     * Unlike [primaryTeamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryTeamId")
    @ExcludeMissing
    fun _primaryTeamId(): JsonField<String> = primaryTeamId

    /**
     * Returns the raw JSON value of [roleId].
     *
     * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roleId") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

    /**
     * Returns the raw JSON value of [secondaryTeamIds].
     *
     * Unlike [secondaryTeamIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondaryTeamIds")
    @ExcludeMissing
    fun _secondaryTeamIds(): JsonField<List<String>> = secondaryTeamIds

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
         * Returns a mutable builder for constructing an instance of [UserProvisionRequest].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .sendWelcomeEmail()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserProvisionRequest]. */
    class Builder internal constructor() {

        private var email: JsonField<String>? = null
        private var sendWelcomeEmail: JsonField<Boolean>? = null
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var primaryTeamId: JsonField<String> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var secondaryTeamIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userProvisionRequest: UserProvisionRequest) = apply {
            email = userProvisionRequest.email
            sendWelcomeEmail = userProvisionRequest.sendWelcomeEmail
            firstName = userProvisionRequest.firstName
            lastName = userProvisionRequest.lastName
            primaryTeamId = userProvisionRequest.primaryTeamId
            roleId = userProvisionRequest.roleId
            secondaryTeamIds = userProvisionRequest.secondaryTeamIds.map { it.toMutableList() }
            additionalProperties = userProvisionRequest.additionalProperties.toMutableMap()
        }

        /** The user's email. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Whether to send a welcome email. */
        fun sendWelcomeEmail(sendWelcomeEmail: Boolean) =
            sendWelcomeEmail(JsonField.of(sendWelcomeEmail))

        /**
         * Sets [Builder.sendWelcomeEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendWelcomeEmail] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendWelcomeEmail(sendWelcomeEmail: JsonField<Boolean>) = apply {
            this.sendWelcomeEmail = sendWelcomeEmail
        }

        /** The user's first name. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The user's last name. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The user's primary team. */
        fun primaryTeamId(primaryTeamId: String) = primaryTeamId(JsonField.of(primaryTeamId))

        /**
         * Sets [Builder.primaryTeamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryTeamId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryTeamId(primaryTeamId: JsonField<String>) = apply {
            this.primaryTeamId = primaryTeamId
        }

        /** The user's role. */
        fun roleId(roleId: String) = roleId(JsonField.of(roleId))

        /**
         * Sets [Builder.roleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

        /** The user's additional teams. */
        fun secondaryTeamIds(secondaryTeamIds: List<String>) =
            secondaryTeamIds(JsonField.of(secondaryTeamIds))

        /**
         * Sets [Builder.secondaryTeamIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryTeamIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryTeamIds(secondaryTeamIds: JsonField<List<String>>) = apply {
            this.secondaryTeamIds = secondaryTeamIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [secondaryTeamIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecondaryTeamId(secondaryTeamId: String) = apply {
            secondaryTeamIds =
                (secondaryTeamIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("secondaryTeamIds", it).add(secondaryTeamId)
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
         * Returns an immutable instance of [UserProvisionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .sendWelcomeEmail()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserProvisionRequest =
            UserProvisionRequest(
                checkRequired("email", email),
                checkRequired("sendWelcomeEmail", sendWelcomeEmail),
                firstName,
                lastName,
                primaryTeamId,
                roleId,
                (secondaryTeamIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserProvisionRequest = apply {
        if (validated) {
            return@apply
        }

        email()
        sendWelcomeEmail()
        firstName()
        lastName()
        primaryTeamId()
        roleId()
        secondaryTeamIds()
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
        (if (email.asKnown().isPresent) 1 else 0) +
            (if (sendWelcomeEmail.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (primaryTeamId.asKnown().isPresent) 1 else 0) +
            (if (roleId.asKnown().isPresent) 1 else 0) +
            (secondaryTeamIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserProvisionRequest &&
            email == other.email &&
            sendWelcomeEmail == other.sendWelcomeEmail &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            primaryTeamId == other.primaryTeamId &&
            roleId == other.roleId &&
            secondaryTeamIds == other.secondaryTeamIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            email,
            sendWelcomeEmail,
            firstName,
            lastName,
            primaryTeamId,
            roleId,
            secondaryTeamIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserProvisionRequest{email=$email, sendWelcomeEmail=$sendWelcomeEmail, firstName=$firstName, lastName=$lastName, primaryTeamId=$primaryTeamId, roleId=$roleId, secondaryTeamIds=$secondaryTeamIds, additionalProperties=$additionalProperties}"
}
