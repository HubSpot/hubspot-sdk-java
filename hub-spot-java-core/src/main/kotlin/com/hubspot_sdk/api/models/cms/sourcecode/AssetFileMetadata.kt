// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sourcecode

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AssetFileMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val folder: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<Long>,
    private val archivedAt: JsonField<Long>,
    private val children: JsonField<List<String>>,
    private val hash: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("folder") @ExcludeMissing folder: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("archivedAt") @ExcludeMissing archivedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("children")
        @ExcludeMissing
        children: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("hash") @ExcludeMissing hash: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, folder, name, updatedAt, archivedAt, children, hash, mutableMapOf())

    /**
     * The path of the file in the CMS Developer File System.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Timestamp of when the object was first created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("createdAt")

    /**
     * Determines whether or not this path points to a folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun folder(): Boolean = folder.getRequired("folder")

    /**
     * The name of the file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Timestamp of when the object was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Long = updatedAt.getRequired("updatedAt")

    /**
     * Timestamp of when the object was archived (deleted).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<Long> = archivedAt.getOptional("archivedAt")

    /**
     * If the object is a folder, contains the filenames of the files within the folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun children(): Optional<List<String>> = children.getOptional("children")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hash(): Optional<String> = hash.getOptional("hash")

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
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [folder].
     *
     * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonField<Boolean> = folder

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
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivedAt") @ExcludeMissing fun _archivedAt(): JsonField<Long> = archivedAt

    /**
     * Returns the raw JSON value of [children].
     *
     * Unlike [children], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("children") @ExcludeMissing fun _children(): JsonField<List<String>> = children

    /**
     * Returns the raw JSON value of [hash].
     *
     * Unlike [hash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hash") @ExcludeMissing fun _hash(): JsonField<String> = hash

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
         * Returns a mutable builder for constructing an instance of [AssetFileMetadata].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .folder()
         * .name()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetFileMetadata]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<Long>? = null
        private var folder: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<Long>? = null
        private var archivedAt: JsonField<Long> = JsonMissing.of()
        private var children: JsonField<MutableList<String>>? = null
        private var hash: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assetFileMetadata: AssetFileMetadata) = apply {
            id = assetFileMetadata.id
            createdAt = assetFileMetadata.createdAt
            folder = assetFileMetadata.folder
            name = assetFileMetadata.name
            updatedAt = assetFileMetadata.updatedAt
            archivedAt = assetFileMetadata.archivedAt
            children = assetFileMetadata.children.map { it.toMutableList() }
            hash = assetFileMetadata.hash
            additionalProperties = assetFileMetadata.additionalProperties.toMutableMap()
        }

        /** The path of the file in the CMS Developer File System. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Timestamp of when the object was first created. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** Determines whether or not this path points to a folder. */
        fun folder(folder: Boolean) = folder(JsonField.of(folder))

        /**
         * Sets [Builder.folder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folder] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folder(folder: JsonField<Boolean>) = apply { this.folder = folder }

        /** The name of the file. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Timestamp of when the object was last updated. */
        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

        /** Timestamp of when the object was archived (deleted). */
        fun archivedAt(archivedAt: Long) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun archivedAt(archivedAt: JsonField<Long>) = apply { this.archivedAt = archivedAt }

        /** If the object is a folder, contains the filenames of the files within the folder. */
        fun children(children: List<String>) = children(JsonField.of(children))

        /**
         * Sets [Builder.children] to an arbitrary JSON value.
         *
         * You should usually call [Builder.children] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun children(children: JsonField<List<String>>) = apply {
            this.children = children.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [children].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChild(child: String) = apply {
            children =
                (children ?: JsonField.of(mutableListOf())).also {
                    checkKnown("children", it).add(child)
                }
        }

        fun hash(hash: String) = hash(JsonField.of(hash))

        /**
         * Sets [Builder.hash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hash] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hash(hash: JsonField<String>) = apply { this.hash = hash }

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
         * Returns an immutable instance of [AssetFileMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .folder()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssetFileMetadata =
            AssetFileMetadata(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("folder", folder),
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                archivedAt,
                (children ?: JsonMissing.of()).map { it.toImmutable() },
                hash,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssetFileMetadata = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        folder()
        name()
        updatedAt()
        archivedAt()
        children()
        hash()
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
            (if (folder.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (children.asKnown().getOrNull()?.size ?: 0) +
            (if (hash.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AssetFileMetadata &&
            id == other.id &&
            createdAt == other.createdAt &&
            folder == other.folder &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            archivedAt == other.archivedAt &&
            children == other.children &&
            hash == other.hash &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            folder,
            name,
            updatedAt,
            archivedAt,
            children,
            hash,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssetFileMetadata{id=$id, createdAt=$createdAt, folder=$folder, name=$name, updatedAt=$updatedAt, archivedAt=$archivedAt, children=$children, hash=$hash, additionalProperties=$additionalProperties}"
}
