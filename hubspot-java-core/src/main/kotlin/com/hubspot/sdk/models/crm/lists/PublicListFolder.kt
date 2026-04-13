// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicListFolder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val childLists: JsonField<List<Int>>,
    private val childNodes: JsonField<List<PublicListFolder>>,
    private val parentFolderId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedContentsAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("childLists")
        @ExcludeMissing
        childLists: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("childNodes")
        @ExcludeMissing
        childNodes: JsonField<List<PublicListFolder>> = JsonMissing.of(),
        @JsonProperty("parentFolderId")
        @ExcludeMissing
        parentFolderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedContentsAt")
        @ExcludeMissing
        updatedContentsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        childLists,
        childNodes,
        parentFolderId,
        createdAt,
        name,
        updatedAt,
        updatedContentsAt,
        userId,
        mutableMapOf(),
    )

    /**
     * The Id of the folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An array of list Id's contained in this folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun childLists(): List<Int> = childLists.getRequired("childLists")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun childNodes(): List<PublicListFolder> = childNodes.getRequired("childNodes")

    /**
     * The Id of the folder this folder is in, the root folder is represented as 0.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parentFolderId(): String = parentFolderId.getRequired("parentFolderId")

    /**
     * The time the folder was created at.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * The name of the folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The time the folder was last updated at.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * The time that the contents of the folder was last updated at.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedContentsAt(): Optional<OffsetDateTime> =
        updatedContentsAt.getOptional("updatedContentsAt")

    /**
     * The user Id of the owner of the folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<Int> = userId.getOptional("userId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [childLists].
     *
     * Unlike [childLists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("childLists") @ExcludeMissing fun _childLists(): JsonField<List<Int>> = childLists

    /**
     * Returns the raw JSON value of [childNodes].
     *
     * Unlike [childNodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("childNodes")
    @ExcludeMissing
    fun _childNodes(): JsonField<List<PublicListFolder>> = childNodes

    /**
     * Returns the raw JSON value of [parentFolderId].
     *
     * Unlike [parentFolderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parentFolderId")
    @ExcludeMissing
    fun _parentFolderId(): JsonField<String> = parentFolderId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

    /**
     * Returns the raw JSON value of [updatedContentsAt].
     *
     * Unlike [updatedContentsAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("updatedContentsAt")
    @ExcludeMissing
    fun _updatedContentsAt(): JsonField<OffsetDateTime> = updatedContentsAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

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
         * Returns a mutable builder for constructing an instance of [PublicListFolder].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .childLists()
         * .childNodes()
         * .parentFolderId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicListFolder]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var childLists: JsonField<MutableList<Int>>? = null
        private var childNodes: JsonField<MutableList<PublicListFolder>>? = null
        private var parentFolderId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedContentsAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicListFolder: PublicListFolder) = apply {
            id = publicListFolder.id
            childLists = publicListFolder.childLists.map { it.toMutableList() }
            childNodes = publicListFolder.childNodes.map { it.toMutableList() }
            parentFolderId = publicListFolder.parentFolderId
            createdAt = publicListFolder.createdAt
            name = publicListFolder.name
            updatedAt = publicListFolder.updatedAt
            updatedContentsAt = publicListFolder.updatedContentsAt
            userId = publicListFolder.userId
            additionalProperties = publicListFolder.additionalProperties.toMutableMap()
        }

        /** The Id of the folder. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An array of list Id's contained in this folder. */
        fun childLists(childLists: List<Int>) = childLists(JsonField.of(childLists))

        /**
         * Sets [Builder.childLists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childLists] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun childLists(childLists: JsonField<List<Int>>) = apply {
            this.childLists = childLists.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [childLists].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChildList(childList: Int) = apply {
            childLists =
                (childLists ?: JsonField.of(mutableListOf())).also {
                    checkKnown("childLists", it).add(childList)
                }
        }

        fun childNodes(childNodes: List<PublicListFolder>) = childNodes(JsonField.of(childNodes))

        /**
         * Sets [Builder.childNodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childNodes] with a well-typed `List<PublicListFolder>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun childNodes(childNodes: JsonField<List<PublicListFolder>>) = apply {
            this.childNodes = childNodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicListFolder] to [childNodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChildNode(childNode: PublicListFolder) = apply {
            childNodes =
                (childNodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("childNodes", it).add(childNode)
                }
        }

        /** The Id of the folder this folder is in, the root folder is represented as 0. */
        fun parentFolderId(parentFolderId: String) = parentFolderId(JsonField.of(parentFolderId))

        /**
         * Sets [Builder.parentFolderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentFolderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentFolderId(parentFolderId: JsonField<String>) = apply {
            this.parentFolderId = parentFolderId
        }

        /** The time the folder was created at. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name of the folder. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The time the folder was last updated at. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The time that the contents of the folder was last updated at. */
        fun updatedContentsAt(updatedContentsAt: OffsetDateTime) =
            updatedContentsAt(JsonField.of(updatedContentsAt))

        /**
         * Sets [Builder.updatedContentsAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedContentsAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun updatedContentsAt(updatedContentsAt: JsonField<OffsetDateTime>) = apply {
            this.updatedContentsAt = updatedContentsAt
        }

        /** The user Id of the owner of the folder. */
        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [PublicListFolder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .childLists()
         * .childNodes()
         * .parentFolderId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicListFolder =
            PublicListFolder(
                checkRequired("id", id),
                checkRequired("childLists", childLists).map { it.toImmutable() },
                checkRequired("childNodes", childNodes).map { it.toImmutable() },
                checkRequired("parentFolderId", parentFolderId),
                createdAt,
                name,
                updatedAt,
                updatedContentsAt,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicListFolder = apply {
        if (validated) {
            return@apply
        }

        id()
        childLists()
        childNodes().forEach { it.validate() }
        parentFolderId()
        createdAt()
        name()
        updatedAt()
        updatedContentsAt()
        userId()
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
            (childLists.asKnown().getOrNull()?.size ?: 0) +
            (childNodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (parentFolderId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedContentsAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicListFolder &&
            id == other.id &&
            childLists == other.childLists &&
            childNodes == other.childNodes &&
            parentFolderId == other.parentFolderId &&
            createdAt == other.createdAt &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            updatedContentsAt == other.updatedContentsAt &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            childLists,
            childNodes,
            parentFolderId,
            createdAt,
            name,
            updatedAt,
            updatedContentsAt,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicListFolder{id=$id, childLists=$childLists, childNodes=$childNodes, parentFolderId=$parentFolderId, createdAt=$createdAt, name=$name, updatedAt=$updatedAt, updatedContentsAt=$updatedContentsAt, userId=$userId, additionalProperties=$additionalProperties}"
}
