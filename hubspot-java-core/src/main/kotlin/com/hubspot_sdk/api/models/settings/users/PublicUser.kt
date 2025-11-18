// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A user */
class PublicUser
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val primaryTeamId: JsonField<String>,
    private val roleId: JsonField<String>,
    private val roleIds: JsonField<List<String>>,
    private val secondaryTeamIds: JsonField<List<String>>,
    private val sendWelcomeEmail: JsonField<Boolean>,
    private val superAdmin: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryTeamId")
        @ExcludeMissing
        primaryTeamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roleId") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roleIds")
        @ExcludeMissing
        roleIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("secondaryTeamIds")
        @ExcludeMissing
        secondaryTeamIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sendWelcomeEmail")
        @ExcludeMissing
        sendWelcomeEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("superAdmin")
        @ExcludeMissing
        superAdmin: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        email,
        firstName,
        lastName,
        primaryTeamId,
        roleId,
        roleIds,
        secondaryTeamIds,
        sendWelcomeEmail,
        superAdmin,
        mutableMapOf(),
    )

    /**
     * The user's unique ID.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The user's email.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The user's first name.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The user's last name.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * The user's primary team
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryTeamId(): Optional<String> = primaryTeamId.getOptional("primaryTeamId")

    /**
     * The user's role.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleId(): Optional<String> = roleId.getOptional("roleId")

    /**
     * A list of role IDs assigned to the user.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleIds(): Optional<List<String>> = roleIds.getOptional("roleIds")

    /**
     * The user's additional teams.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondaryTeamIds(): Optional<List<String>> =
        secondaryTeamIds.getOptional("secondaryTeamIds")

    /**
     * Whether a welcome email was sent to the user. This value will only be populated in response
     * to a provisioning request. Subsequent queries will be false.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendWelcomeEmail(): Optional<Boolean> = sendWelcomeEmail.getOptional("sendWelcomeEmail")

    /**
     * Whether the user has super admin privileges.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun superAdmin(): Optional<Boolean> = superAdmin.getOptional("superAdmin")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
     * Returns the raw JSON value of [roleIds].
     *
     * Unlike [roleIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roleIds") @ExcludeMissing fun _roleIds(): JsonField<List<String>> = roleIds

    /**
     * Returns the raw JSON value of [secondaryTeamIds].
     *
     * Unlike [secondaryTeamIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondaryTeamIds")
    @ExcludeMissing
    fun _secondaryTeamIds(): JsonField<List<String>> = secondaryTeamIds

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
     * Returns the raw JSON value of [superAdmin].
     *
     * Unlike [superAdmin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("superAdmin") @ExcludeMissing fun _superAdmin(): JsonField<Boolean> = superAdmin

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
         * Returns a mutable builder for constructing an instance of [PublicUser].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .email()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicUser]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var primaryTeamId: JsonField<String> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var roleIds: JsonField<MutableList<String>>? = null
        private var secondaryTeamIds: JsonField<MutableList<String>>? = null
        private var sendWelcomeEmail: JsonField<Boolean> = JsonMissing.of()
        private var superAdmin: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicUser: PublicUser) = apply {
            id = publicUser.id
            email = publicUser.email
            firstName = publicUser.firstName
            lastName = publicUser.lastName
            primaryTeamId = publicUser.primaryTeamId
            roleId = publicUser.roleId
            roleIds = publicUser.roleIds.map { it.toMutableList() }
            secondaryTeamIds = publicUser.secondaryTeamIds.map { it.toMutableList() }
            sendWelcomeEmail = publicUser.sendWelcomeEmail
            superAdmin = publicUser.superAdmin
            additionalProperties = publicUser.additionalProperties.toMutableMap()
        }

        /** The user's unique ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The user's email. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

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

        /** The user's primary team */
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

        /** A list of role IDs assigned to the user. */
        fun roleIds(roleIds: List<String>) = roleIds(JsonField.of(roleIds))

        /**
         * Sets [Builder.roleIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roleIds(roleIds: JsonField<List<String>>) = apply {
            this.roleIds = roleIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [roleIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoleId(roleId: String) = apply {
            roleIds =
                (roleIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("roleIds", it).add(roleId)
                }
        }

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

        /**
         * Whether a welcome email was sent to the user. This value will only be populated in
         * response to a provisioning request. Subsequent queries will be false.
         */
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

        /** Whether the user has super admin privileges. */
        fun superAdmin(superAdmin: Boolean) = superAdmin(JsonField.of(superAdmin))

        /**
         * Sets [Builder.superAdmin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.superAdmin] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun superAdmin(superAdmin: JsonField<Boolean>) = apply { this.superAdmin = superAdmin }

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
         * Returns an immutable instance of [PublicUser].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .email()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicUser =
            PublicUser(
                checkRequired("id", id),
                checkRequired("email", email),
                firstName,
                lastName,
                primaryTeamId,
                roleId,
                (roleIds ?: JsonMissing.of()).map { it.toImmutable() },
                (secondaryTeamIds ?: JsonMissing.of()).map { it.toImmutable() },
                sendWelcomeEmail,
                superAdmin,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicUser = apply {
        if (validated) {
            return@apply
        }

        id()
        email()
        firstName()
        lastName()
        primaryTeamId()
        roleId()
        roleIds()
        secondaryTeamIds()
        sendWelcomeEmail()
        superAdmin()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubspotInvalidDataException) {
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
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (primaryTeamId.asKnown().isPresent) 1 else 0) +
            (if (roleId.asKnown().isPresent) 1 else 0) +
            (roleIds.asKnown().getOrNull()?.size ?: 0) +
            (secondaryTeamIds.asKnown().getOrNull()?.size ?: 0) +
            (if (sendWelcomeEmail.asKnown().isPresent) 1 else 0) +
            (if (superAdmin.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicUser &&
            id == other.id &&
            email == other.email &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            primaryTeamId == other.primaryTeamId &&
            roleId == other.roleId &&
            roleIds == other.roleIds &&
            secondaryTeamIds == other.secondaryTeamIds &&
            sendWelcomeEmail == other.sendWelcomeEmail &&
            superAdmin == other.superAdmin &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            email,
            firstName,
            lastName,
            primaryTeamId,
            roleId,
            roleIds,
            secondaryTeamIds,
            sendWelcomeEmail,
            superAdmin,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicUser{id=$id, email=$email, firstName=$firstName, lastName=$lastName, primaryTeamId=$primaryTeamId, roleId=$roleId, roleIds=$roleIds, secondaryTeamIds=$secondaryTeamIds, sendWelcomeEmail=$sendWelcomeEmail, superAdmin=$superAdmin, additionalProperties=$additionalProperties}"
}
