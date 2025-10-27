// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Object for updating files. */
class FileUpdateInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val access: JsonField<Access>,
    private val clearExpires: JsonField<Boolean>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val isUsableInContent: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val parentFolderId: JsonField<String>,
    private val parentFolderPath: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
        @JsonProperty("clearExpires")
        @ExcludeMissing
        clearExpires: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("isUsableInContent")
        @ExcludeMissing
        isUsableInContent: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentFolderId")
        @ExcludeMissing
        parentFolderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentFolderPath")
        @ExcludeMissing
        parentFolderPath: JsonField<String> = JsonMissing.of(),
    ) : this(
        access,
        clearExpires,
        expiresAt,
        isUsableInContent,
        name,
        parentFolderId,
        parentFolderPath,
        mutableMapOf(),
    )

    /**
     * NONE: Do not run any duplicate validation. REJECT: Reject the upload if a duplicate is found.
     * RETURN_EXISTING: If a duplicate file is found, do not upload a new file and return the found
     * duplicate instead.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun access(): Optional<Access> = access.getOptional("access")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clearExpires(): Optional<Boolean> = clearExpires.getOptional("clearExpires")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

    /**
     * Mark whether the file should be used in new content or not.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isUsableInContent(): Optional<Boolean> = isUsableInContent.getOptional("isUsableInContent")

    /**
     * New name for the file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * FolderId where the file should be moved to. folderId and folderPath parameters cannot be set
     * at the same time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentFolderId(): Optional<String> = parentFolderId.getOptional("parentFolderId")

    /**
     * Folder path where the file should be moved to. folderId and folderPath parameters cannot be
     * set at the same time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentFolderPath(): Optional<String> = parentFolderPath.getOptional("parentFolderPath")

    /**
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

    /**
     * Returns the raw JSON value of [clearExpires].
     *
     * Unlike [clearExpires], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clearExpires")
    @ExcludeMissing
    fun _clearExpires(): JsonField<Boolean> = clearExpires

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [isUsableInContent].
     *
     * Unlike [isUsableInContent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isUsableInContent")
    @ExcludeMissing
    fun _isUsableInContent(): JsonField<Boolean> = isUsableInContent

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
     * Returns the raw JSON value of [parentFolderPath].
     *
     * Unlike [parentFolderPath], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parentFolderPath")
    @ExcludeMissing
    fun _parentFolderPath(): JsonField<String> = parentFolderPath

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

        /** Returns a mutable builder for constructing an instance of [FileUpdateInput]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileUpdateInput]. */
    class Builder internal constructor() {

        private var access: JsonField<Access> = JsonMissing.of()
        private var clearExpires: JsonField<Boolean> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var isUsableInContent: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var parentFolderId: JsonField<String> = JsonMissing.of()
        private var parentFolderPath: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileUpdateInput: FileUpdateInput) = apply {
            access = fileUpdateInput.access
            clearExpires = fileUpdateInput.clearExpires
            expiresAt = fileUpdateInput.expiresAt
            isUsableInContent = fileUpdateInput.isUsableInContent
            name = fileUpdateInput.name
            parentFolderId = fileUpdateInput.parentFolderId
            parentFolderPath = fileUpdateInput.parentFolderPath
            additionalProperties = fileUpdateInput.additionalProperties.toMutableMap()
        }

        /**
         * NONE: Do not run any duplicate validation. REJECT: Reject the upload if a duplicate is
         * found. RETURN_EXISTING: If a duplicate file is found, do not upload a new file and return
         * the found duplicate instead.
         */
        fun access(access: Access) = access(JsonField.of(access))

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { this.access = access }

        fun clearExpires(clearExpires: Boolean) = clearExpires(JsonField.of(clearExpires))

        /**
         * Sets [Builder.clearExpires] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clearExpires] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clearExpires(clearExpires: JsonField<Boolean>) = apply {
            this.clearExpires = clearExpires
        }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Mark whether the file should be used in new content or not. */
        fun isUsableInContent(isUsableInContent: Boolean) =
            isUsableInContent(JsonField.of(isUsableInContent))

        /**
         * Sets [Builder.isUsableInContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUsableInContent] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isUsableInContent(isUsableInContent: JsonField<Boolean>) = apply {
            this.isUsableInContent = isUsableInContent
        }

        /** New name for the file. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * FolderId where the file should be moved to. folderId and folderPath parameters cannot be
         * set at the same time.
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
         * Folder path where the file should be moved to. folderId and folderPath parameters cannot
         * be set at the same time.
         */
        fun parentFolderPath(parentFolderPath: String) =
            parentFolderPath(JsonField.of(parentFolderPath))

        /**
         * Sets [Builder.parentFolderPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentFolderPath] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentFolderPath(parentFolderPath: JsonField<String>) = apply {
            this.parentFolderPath = parentFolderPath
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
         * Returns an immutable instance of [FileUpdateInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileUpdateInput =
            FileUpdateInput(
                access,
                clearExpires,
                expiresAt,
                isUsableInContent,
                name,
                parentFolderId,
                parentFolderPath,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileUpdateInput = apply {
        if (validated) {
            return@apply
        }

        access().ifPresent { it.validate() }
        clearExpires()
        expiresAt()
        isUsableInContent()
        name()
        parentFolderId()
        parentFolderPath()
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
        (access.asKnown().getOrNull()?.validity() ?: 0) +
            (if (clearExpires.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (isUsableInContent.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (parentFolderId.asKnown().isPresent) 1 else 0) +
            (if (parentFolderPath.asKnown().isPresent) 1 else 0)

    /**
     * NONE: Do not run any duplicate validation. REJECT: Reject the upload if a duplicate is found.
     * RETURN_EXISTING: If a duplicate file is found, do not upload a new file and return the found
     * duplicate instead.
     */
    class Access @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PUBLIC_INDEXABLE = of("PUBLIC_INDEXABLE")

            @JvmField val PUBLIC_NOT_INDEXABLE = of("PUBLIC_NOT_INDEXABLE")

            @JvmField val HIDDEN_INDEXABLE = of("HIDDEN_INDEXABLE")

            @JvmField val HIDDEN_NOT_INDEXABLE = of("HIDDEN_NOT_INDEXABLE")

            @JvmField val HIDDEN_PRIVATE = of("HIDDEN_PRIVATE")

            @JvmField val PRIVATE = of("PRIVATE")

            @JvmField val HIDDEN_SENSITIVE = of("HIDDEN_SENSITIVE")

            @JvmField val SENSITIVE = of("SENSITIVE")

            @JvmStatic fun of(value: String) = Access(JsonField.of(value))
        }

        /** An enum containing [Access]'s known values. */
        enum class Known {
            PUBLIC_INDEXABLE,
            PUBLIC_NOT_INDEXABLE,
            HIDDEN_INDEXABLE,
            HIDDEN_NOT_INDEXABLE,
            HIDDEN_PRIVATE,
            PRIVATE,
            HIDDEN_SENSITIVE,
            SENSITIVE,
        }

        /**
         * An enum containing [Access]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Access] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PUBLIC_INDEXABLE,
            PUBLIC_NOT_INDEXABLE,
            HIDDEN_INDEXABLE,
            HIDDEN_NOT_INDEXABLE,
            HIDDEN_PRIVATE,
            PRIVATE,
            HIDDEN_SENSITIVE,
            SENSITIVE,
            /** An enum member indicating that [Access] was instantiated with an unknown value. */
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
                PUBLIC_INDEXABLE -> Value.PUBLIC_INDEXABLE
                PUBLIC_NOT_INDEXABLE -> Value.PUBLIC_NOT_INDEXABLE
                HIDDEN_INDEXABLE -> Value.HIDDEN_INDEXABLE
                HIDDEN_NOT_INDEXABLE -> Value.HIDDEN_NOT_INDEXABLE
                HIDDEN_PRIVATE -> Value.HIDDEN_PRIVATE
                PRIVATE -> Value.PRIVATE
                HIDDEN_SENSITIVE -> Value.HIDDEN_SENSITIVE
                SENSITIVE -> Value.SENSITIVE
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
                PUBLIC_INDEXABLE -> Known.PUBLIC_INDEXABLE
                PUBLIC_NOT_INDEXABLE -> Known.PUBLIC_NOT_INDEXABLE
                HIDDEN_INDEXABLE -> Known.HIDDEN_INDEXABLE
                HIDDEN_NOT_INDEXABLE -> Known.HIDDEN_NOT_INDEXABLE
                HIDDEN_PRIVATE -> Known.HIDDEN_PRIVATE
                PRIVATE -> Known.PRIVATE
                HIDDEN_SENSITIVE -> Known.HIDDEN_SENSITIVE
                SENSITIVE -> Known.SENSITIVE
                else -> throw HubSpotInvalidDataException("Unknown Access: $value")
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

        fun validate(): Access = apply {
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

            return other is Access && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileUpdateInput &&
            access == other.access &&
            clearExpires == other.clearExpires &&
            expiresAt == other.expiresAt &&
            isUsableInContent == other.isUsableInContent &&
            name == other.name &&
            parentFolderId == other.parentFolderId &&
            parentFolderPath == other.parentFolderPath &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            access,
            clearExpires,
            expiresAt,
            isUsableInContent,
            name,
            parentFolderId,
            parentFolderPath,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileUpdateInput{access=$access, clearExpires=$clearExpires, expiresAt=$expiresAt, isUsableInContent=$isUsableInContent, name=$name, parentFolderId=$parentFolderId, parentFolderPath=$parentFolderPath, additionalProperties=$additionalProperties}"
}
