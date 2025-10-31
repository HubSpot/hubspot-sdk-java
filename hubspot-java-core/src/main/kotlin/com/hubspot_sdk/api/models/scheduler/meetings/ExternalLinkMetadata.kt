// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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
    private val type: JsonField<String>,
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
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultLink(): Boolean = defaultLink.getRequired("defaultLink")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun link(): String = link.getRequired("link")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizerUserId(): String = organizerUserId.getRequired("organizerUserId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slug(): String = slug.getRequired("slug")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userIdsOfLinkMembers(): List<String> =
        userIdsOfLinkMembers.getRequired("userIdsOfLinkMembers")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
        private var type: JsonField<String>? = null
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

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun defaultLink(defaultLink: Boolean) = defaultLink(JsonField.of(defaultLink))

        /**
         * Sets [Builder.defaultLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultLink] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultLink(defaultLink: JsonField<Boolean>) = apply { this.defaultLink = defaultLink }

        fun link(link: String) = link(JsonField.of(link))

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<String>) = apply { this.link = link }

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

        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
        type()
        userIdsOfLinkMembers()
        name()
        updatedAt()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (defaultLink.asKnown().isPresent) 1 else 0) +
            (if (link.asKnown().isPresent) 1 else 0) +
            (if (organizerUserId.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (userIdsOfLinkMembers.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

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
