// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

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
import java.util.Collections
import java.util.Objects
import java.util.Optional

class FolderInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val parentFolderId: JsonField<String>,
    private val parentPath: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentFolderId")
        @ExcludeMissing
        parentFolderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentPath") @ExcludeMissing parentPath: JsonField<String> = JsonMissing.of(),
    ) : this(name, parentFolderId, parentPath, mutableMapOf())

    /**
     * Desired name for the folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * FolderId of the parent of the created folder. If not specified, the folder will be created at
     * the root level. parentFolderId and parentFolderPath cannot be set at the same time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentFolderId(): Optional<String> = parentFolderId.getOptional("parentFolderId")

    /**
     * Path of the parent of the created folder. If not specified the folder will be created at the
     * root level. parentFolderPath and parentFolderId cannot be set at the same time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentPath(): Optional<String> = parentPath.getOptional("parentPath")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [parentFolderId].
     *
     * Unlike [parentFolderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parentFolderId")
    @ExcludeMissing
    fun _parentFolderId(): JsonField<String> = parentFolderId

    /**
     * Returns the raw JSON value of [parentPath].
     *
     * Unlike [parentPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parentPath") @ExcludeMissing fun _parentPath(): JsonField<String> = parentPath

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
         * Returns a mutable builder for constructing an instance of [FolderInput].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderInput]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var parentFolderId: JsonField<String> = JsonMissing.of()
        private var parentPath: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(folderInput: FolderInput) = apply {
            name = folderInput.name
            parentFolderId = folderInput.parentFolderId
            parentPath = folderInput.parentPath
            additionalProperties = folderInput.additionalProperties.toMutableMap()
        }

        /** Desired name for the folder. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * FolderId of the parent of the created folder. If not specified, the folder will be
         * created at the root level. parentFolderId and parentFolderPath cannot be set at the same
         * time.
         */
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

        /**
         * Path of the parent of the created folder. If not specified the folder will be created at
         * the root level. parentFolderPath and parentFolderId cannot be set at the same time.
         */
        fun parentPath(parentPath: String) = parentPath(JsonField.of(parentPath))

        /**
         * Sets [Builder.parentPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentPath(parentPath: JsonField<String>) = apply { this.parentPath = parentPath }

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
         * Returns an immutable instance of [FolderInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FolderInput =
            FolderInput(
                checkRequired("name", name),
                parentFolderId,
                parentPath,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FolderInput = apply {
        if (validated) {
            return@apply
        }

        name()
        parentFolderId()
        parentPath()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (parentFolderId.asKnown().isPresent) 1 else 0) +
            (if (parentPath.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderInput &&
            name == other.name &&
            parentFolderId == other.parentFolderId &&
            parentPath == other.parentPath &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, parentFolderId, parentPath, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FolderInput{name=$name, parentFolderId=$parentFolderId, parentPath=$parentPath, additionalProperties=$additionalProperties}"
}
