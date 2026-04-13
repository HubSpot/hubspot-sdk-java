// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.owners

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicOwner
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val teams: JsonField<List<PublicTeam>>,
    private val userId: JsonField<Int>,
    private val userIdIncludingInactive: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("teams")
        @ExcludeMissing
        teams: JsonField<List<PublicTeam>> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("userIdIncludingInactive")
        @ExcludeMissing
        userIdIncludingInactive: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        archived,
        createdAt,
        type,
        updatedAt,
        email,
        firstName,
        lastName,
        teams,
        userId,
        userIdIncludingInactive,
        mutableMapOf(),
    )

    /**
     * The unique identifier of the owner.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Indicates whether the owner is archived.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * The date and time when the owner was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The type of the owner, which can be either PERSON or QUEUE.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The date and time when the owner was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The email address of the owner.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The first name of the owner.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The last name of the owner.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teams(): Optional<List<PublicTeam>> = teams.getOptional("teams")

    /**
     * The user ID of the owner.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<Int> = userId.getOptional("userId")

    /**
     * The user ID of the owner, including inactive users.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userIdIncludingInactive(): Optional<Int> =
        userIdIncludingInactive.getOptional("userIdIncludingInactive")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
     * Returns the raw JSON value of [teams].
     *
     * Unlike [teams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("teams") @ExcludeMissing fun _teams(): JsonField<List<PublicTeam>> = teams

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

    /**
     * Returns the raw JSON value of [userIdIncludingInactive].
     *
     * Unlike [userIdIncludingInactive], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("userIdIncludingInactive")
    @ExcludeMissing
    fun _userIdIncludingInactive(): JsonField<Int> = userIdIncludingInactive

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
         * Returns a mutable builder for constructing an instance of [PublicOwner].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .createdAt()
         * .type()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicOwner]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archived: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var teams: JsonField<MutableList<PublicTeam>>? = null
        private var userId: JsonField<Int> = JsonMissing.of()
        private var userIdIncludingInactive: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicOwner: PublicOwner) = apply {
            id = publicOwner.id
            archived = publicOwner.archived
            createdAt = publicOwner.createdAt
            type = publicOwner.type
            updatedAt = publicOwner.updatedAt
            email = publicOwner.email
            firstName = publicOwner.firstName
            lastName = publicOwner.lastName
            teams = publicOwner.teams.map { it.toMutableList() }
            userId = publicOwner.userId
            userIdIncludingInactive = publicOwner.userIdIncludingInactive
            additionalProperties = publicOwner.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the owner. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Indicates whether the owner is archived. */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** The date and time when the owner was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The type of the owner, which can be either PERSON or QUEUE. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The date and time when the owner was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The email address of the owner. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The first name of the owner. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The last name of the owner. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun teams(teams: List<PublicTeam>) = teams(JsonField.of(teams))

        /**
         * Sets [Builder.teams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teams] with a well-typed `List<PublicTeam>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teams(teams: JsonField<List<PublicTeam>>) = apply {
            this.teams = teams.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicTeam] to [teams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTeam(team: PublicTeam) = apply {
            teams =
                (teams ?: JsonField.of(mutableListOf())).also { checkKnown("teams", it).add(team) }
        }

        /** The user ID of the owner. */
        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

        /** The user ID of the owner, including inactive users. */
        fun userIdIncludingInactive(userIdIncludingInactive: Int) =
            userIdIncludingInactive(JsonField.of(userIdIncludingInactive))

        /**
         * Sets [Builder.userIdIncludingInactive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userIdIncludingInactive] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userIdIncludingInactive(userIdIncludingInactive: JsonField<Int>) = apply {
            this.userIdIncludingInactive = userIdIncludingInactive
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
         * Returns an immutable instance of [PublicOwner].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .createdAt()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicOwner =
            PublicOwner(
                checkRequired("id", id),
                checkRequired("archived", archived),
                checkRequired("createdAt", createdAt),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                email,
                firstName,
                lastName,
                (teams ?: JsonMissing.of()).map { it.toImmutable() },
                userId,
                userIdIncludingInactive,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicOwner = apply {
        if (validated) {
            return@apply
        }

        id()
        archived()
        createdAt()
        type().validate()
        updatedAt()
        email()
        firstName()
        lastName()
        teams().ifPresent { it.forEach { it.validate() } }
        userId()
        userIdIncludingInactive()
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
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (teams.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (userIdIncludingInactive.asKnown().isPresent) 1 else 0)

    /** The type of the owner, which can be either PERSON or QUEUE. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PERSON = of("PERSON")

            @JvmField val QUEUE = of("QUEUE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PERSON,
            QUEUE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERSON,
            QUEUE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PERSON -> Value.PERSON
                QUEUE -> Value.QUEUE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PERSON -> Known.PERSON
                QUEUE -> Known.QUEUE
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicOwner &&
            id == other.id &&
            archived == other.archived &&
            createdAt == other.createdAt &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            email == other.email &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            teams == other.teams &&
            userId == other.userId &&
            userIdIncludingInactive == other.userIdIncludingInactive &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archived,
            createdAt,
            type,
            updatedAt,
            email,
            firstName,
            lastName,
            teams,
            userId,
            userIdIncludingInactive,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicOwner{id=$id, archived=$archived, createdAt=$createdAt, type=$type, updatedAt=$updatedAt, email=$email, firstName=$firstName, lastName=$lastName, teams=$teams, userId=$userId, userIdIncludingInactive=$userIdIncludingInactive, additionalProperties=$additionalProperties}"
}
