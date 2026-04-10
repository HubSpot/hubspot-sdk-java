// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalLinkMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val defaultLink: JsonField<Boolean>,
    private val link: JsonField<String>,
    private val organizerUserId: JsonField<String>,
    private val slug: JsonField<String>,
    private val type: JsonField<Type>,
    private val userIdsOfLinkMembers: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("defaultLink")
        @ExcludeMissing
        defaultLink: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organizerUserId")
        @ExcludeMissing
        organizerUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("userIdsOfLinkMembers")
        @ExcludeMissing
        userIdsOfLinkMembers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        defaultLink,
        link,
        organizerUserId,
        slug,
        type,
        userIdsOfLinkMembers,
        name,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the meeting link.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The Unix time in milliseconds when the meeting link was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Whether the meeting link is the user's default link.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultLink(): Boolean = defaultLink.getRequired("defaultLink")

    /**
     * The URL of the meeting link.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun link(): String = link.getRequired("link")

    /**
     * The user ID of the meeting link's organizer.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizerUserId(): String = organizerUserId.getRequired("organizerUserId")

    /**
     * The slug of the meeting link, located directly after the domain in the URL.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slug(): String = slug.getRequired("slug")

    /**
     * The type of the external meeting link. Accepted values are: PERSONAL_LINK, GROUP_CALENDAR,
     * ROUND_ROBIN_CALENDAR.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userIdsOfLinkMembers(): List<String> =
        userIdsOfLinkMembers.getRequired("userIdsOfLinkMembers")

    /**
     * The name of the meeting link.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The Unix time in milliseconds when the meeting link was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [defaultLink].
     *
     * Unlike [defaultLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultLink")
    @ExcludeMissing
    fun _defaultLink(): JsonField<Boolean> = defaultLink

    /**
     * Returns the raw JSON value of [link].
     *
     * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

    /**
     * Returns the raw JSON value of [organizerUserId].
     *
     * Unlike [organizerUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organizerUserId")
    @ExcludeMissing
    fun _organizerUserId(): JsonField<String> = organizerUserId

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [userIdsOfLinkMembers].
     *
     * Unlike [userIdsOfLinkMembers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("userIdsOfLinkMembers")
    @ExcludeMissing
    fun _userIdsOfLinkMembers(): JsonField<List<String>> = userIdsOfLinkMembers

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [ExternalLinkMetadata].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .defaultLink()
         * .link()
         * .organizerUserId()
         * .slug()
         * .type()
         * .userIdsOfLinkMembers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLinkMetadata]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var defaultLink: JsonField<Boolean>? = null
        private var link: JsonField<String>? = null
        private var organizerUserId: JsonField<String>? = null
        private var slug: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var userIdsOfLinkMembers: JsonField<MutableList<String>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLinkMetadata: ExternalLinkMetadata) = apply {
            id = externalLinkMetadata.id
            createdAt = externalLinkMetadata.createdAt
            defaultLink = externalLinkMetadata.defaultLink
            link = externalLinkMetadata.link
            organizerUserId = externalLinkMetadata.organizerUserId
            slug = externalLinkMetadata.slug
            type = externalLinkMetadata.type
            userIdsOfLinkMembers =
                externalLinkMetadata.userIdsOfLinkMembers.map { it.toMutableList() }
            name = externalLinkMetadata.name
            updatedAt = externalLinkMetadata.updatedAt
            additionalProperties = externalLinkMetadata.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the meeting link. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Unix time in milliseconds when the meeting link was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the meeting link is the user's default link. */
        fun defaultLink(defaultLink: Boolean) = defaultLink(JsonField.of(defaultLink))

        /**
         * Sets [Builder.defaultLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultLink] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultLink(defaultLink: JsonField<Boolean>) = apply { this.defaultLink = defaultLink }

        /** The URL of the meeting link. */
        fun link(link: String) = link(JsonField.of(link))

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<String>) = apply { this.link = link }

        /** The user ID of the meeting link's organizer. */
        fun organizerUserId(organizerUserId: String) =
            organizerUserId(JsonField.of(organizerUserId))

        /**
         * Sets [Builder.organizerUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizerUserId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizerUserId(organizerUserId: JsonField<String>) = apply {
            this.organizerUserId = organizerUserId
        }

        /** The slug of the meeting link, located directly after the domain in the URL. */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /**
         * The type of the external meeting link. Accepted values are: PERSONAL_LINK,
         * GROUP_CALENDAR, ROUND_ROBIN_CALENDAR.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun userIdsOfLinkMembers(userIdsOfLinkMembers: List<String>) =
            userIdsOfLinkMembers(JsonField.of(userIdsOfLinkMembers))

        /**
         * Sets [Builder.userIdsOfLinkMembers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userIdsOfLinkMembers] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun userIdsOfLinkMembers(userIdsOfLinkMembers: JsonField<List<String>>) = apply {
            this.userIdsOfLinkMembers = userIdsOfLinkMembers.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [userIdsOfLinkMembers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUserIdsOfLinkMember(userIdsOfLinkMember: String) = apply {
            userIdsOfLinkMembers =
                (userIdsOfLinkMembers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("userIdsOfLinkMembers", it).add(userIdsOfLinkMember)
                }
        }

        /** The name of the meeting link. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The Unix time in milliseconds when the meeting link was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ExternalLinkMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .defaultLink()
         * .link()
         * .organizerUserId()
         * .slug()
         * .type()
         * .userIdsOfLinkMembers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLinkMetadata =
            ExternalLinkMetadata(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("defaultLink", defaultLink),
                checkRequired("link", link),
                checkRequired("organizerUserId", organizerUserId),
                checkRequired("slug", slug),
                checkRequired("type", type),
                checkRequired("userIdsOfLinkMembers", userIdsOfLinkMembers).map {
                    it.toImmutable()
                },
                name,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalLinkMetadata = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        defaultLink()
        link()
        organizerUserId()
        slug()
        type().validate()
        userIdsOfLinkMembers()
        name()
        updatedAt()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (defaultLink.asKnown().isPresent) 1 else 0) +
            (if (link.asKnown().isPresent) 1 else 0) +
            (if (organizerUserId.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (userIdsOfLinkMembers.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * The type of the external meeting link. Accepted values are: PERSONAL_LINK, GROUP_CALENDAR,
     * ROUND_ROBIN_CALENDAR.
     */
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

            @JvmField val GROUP_CALENDAR = of("GROUP_CALENDAR")

            @JvmField val PERSONAL_LINK = of("PERSONAL_LINK")

            @JvmField val ROUND_ROBIN_CALENDAR = of("ROUND_ROBIN_CALENDAR")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            GROUP_CALENDAR,
            PERSONAL_LINK,
            ROUND_ROBIN_CALENDAR,
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
            GROUP_CALENDAR,
            PERSONAL_LINK,
            ROUND_ROBIN_CALENDAR,
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
                GROUP_CALENDAR -> Value.GROUP_CALENDAR
                PERSONAL_LINK -> Value.PERSONAL_LINK
                ROUND_ROBIN_CALENDAR -> Value.ROUND_ROBIN_CALENDAR
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
                GROUP_CALENDAR -> Known.GROUP_CALENDAR
                PERSONAL_LINK -> Known.PERSONAL_LINK
                ROUND_ROBIN_CALENDAR -> Known.ROUND_ROBIN_CALENDAR
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

        return other is ExternalLinkMetadata &&
            id == other.id &&
            createdAt == other.createdAt &&
            defaultLink == other.defaultLink &&
            link == other.link &&
            organizerUserId == other.organizerUserId &&
            slug == other.slug &&
            type == other.type &&
            userIdsOfLinkMembers == other.userIdsOfLinkMembers &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            defaultLink,
            link,
            organizerUserId,
            slug,
            type,
            userIdsOfLinkMembers,
            name,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLinkMetadata{id=$id, createdAt=$createdAt, defaultLink=$defaultLink, link=$link, organizerUserId=$organizerUserId, slug=$slug, type=$type, userIdsOfLinkMembers=$userIdsOfLinkMembers, name=$name, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
