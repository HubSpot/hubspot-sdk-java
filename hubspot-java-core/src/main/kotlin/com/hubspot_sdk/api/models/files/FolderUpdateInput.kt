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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class FolderUpdateInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val parentFolderId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentFolderId")
        @ExcludeMissing
        parentFolderId: JsonField<Long> = JsonMissing.of(),
    ) : this(name, parentFolderId, mutableMapOf())

    /**
     * New name. If specified the folder's name and fullPath will change. All children of the folder
     * will be updated accordingly.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * New parent folderId. If changed, the folder and all it's children will be moved into the
     * specified folder. parentFolderId and parentFolderPath cannot be specified at the same time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentFolderId(): Optional<Long> = parentFolderId.getOptional("parentFolderId")

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
    fun _parentFolderId(): JsonField<Long> = parentFolderId

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

        /** Returns a mutable builder for constructing an instance of [FolderUpdateInput]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderUpdateInput]. */
    class Builder internal constructor() {

        private var name: JsonField<String> = JsonMissing.of()
        private var parentFolderId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(folderUpdateInput: FolderUpdateInput) = apply {
            name = folderUpdateInput.name
            parentFolderId = folderUpdateInput.parentFolderId
            additionalProperties = folderUpdateInput.additionalProperties.toMutableMap()
        }

        /**
         * New name. If specified the folder's name and fullPath will change. All children of the
         * folder will be updated accordingly.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * New parent folderId. If changed, the folder and all it's children will be moved into the
         * specified folder. parentFolderId and parentFolderPath cannot be specified at the same
         * time.
         */
        fun parentFolderId(parentFolderId: Long) = parentFolderId(JsonField.of(parentFolderId))

        /**
         * Sets [Builder.parentFolderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentFolderId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentFolderId(parentFolderId: JsonField<Long>) = apply {
            this.parentFolderId = parentFolderId
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
         * Returns an immutable instance of [FolderUpdateInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FolderUpdateInput =
            FolderUpdateInput(name, parentFolderId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): FolderUpdateInput = apply {
        if (validated) {
            return@apply
        }

        name()
        parentFolderId()
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
            (if (parentFolderId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderUpdateInput &&
            name == other.name &&
            parentFolderId == other.parentFolderId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(name, parentFolderId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FolderUpdateInput{name=$name, parentFolderId=$parentFolderId, additionalProperties=$additionalProperties}"
}
