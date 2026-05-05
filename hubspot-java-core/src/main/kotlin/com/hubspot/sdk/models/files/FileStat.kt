// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FileStat
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val file: JsonField<File>,
    private val folder: JsonField<Folder>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("file") @ExcludeMissing file: JsonField<File> = JsonMissing.of(),
        @JsonProperty("folder") @ExcludeMissing folder: JsonField<Folder> = JsonMissing.of(),
    ) : this(file, folder, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun file(): Optional<File> = file.getOptional("file")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folder(): Optional<Folder> = folder.getOptional("folder")

    /**
     * Returns the raw JSON value of [file].
     *
     * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<File> = file

    /**
     * Returns the raw JSON value of [folder].
     *
     * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonField<Folder> = folder

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

        /** Returns a mutable builder for constructing an instance of [FileStat]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileStat]. */
    class Builder internal constructor() {

        private var file: JsonField<File> = JsonMissing.of()
        private var folder: JsonField<Folder> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileStat: FileStat) = apply {
            file = fileStat.file
            folder = fileStat.folder
            additionalProperties = fileStat.additionalProperties.toMutableMap()
        }

        fun file(file: File) = file(JsonField.of(file))

        /**
         * Sets [Builder.file] to an arbitrary JSON value.
         *
         * You should usually call [Builder.file] with a well-typed [File] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun file(file: JsonField<File>) = apply { this.file = file }

        fun folder(folder: Folder) = folder(JsonField.of(folder))

        /**
         * Sets [Builder.folder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folder] with a well-typed [Folder] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folder(folder: JsonField<Folder>) = apply { this.folder = folder }

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
         * Returns an immutable instance of [FileStat].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileStat = FileStat(file, folder, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): FileStat = apply {
        if (validated) {
            return@apply
        }

        file().ifPresent { it.validate() }
        folder().ifPresent { it.validate() }
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
        (file.asKnown().getOrNull()?.validity() ?: 0) +
            (folder.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileStat &&
            file == other.file &&
            folder == other.folder &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(file, folder, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileStat{file=$file, folder=$folder, additionalProperties=$additionalProperties}"
}
