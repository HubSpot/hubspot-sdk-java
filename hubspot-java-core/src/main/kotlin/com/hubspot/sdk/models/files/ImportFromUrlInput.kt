// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ImportFromUrlInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val access: JsonField<Access>,
    private val duplicateValidationScope: JsonField<DuplicateValidationScope>,
    private val duplicateValidationStrategy: JsonField<DuplicateValidationStrategy>,
    private val overwrite: JsonField<Boolean>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val folderId: JsonField<String>,
    private val folderPath: JsonField<String>,
    private val name: JsonField<String>,
    private val ttl: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
        @JsonProperty("duplicateValidationScope")
        @ExcludeMissing
        duplicateValidationScope: JsonField<DuplicateValidationScope> = JsonMissing.of(),
        @JsonProperty("duplicateValidationStrategy")
        @ExcludeMissing
        duplicateValidationStrategy: JsonField<DuplicateValidationStrategy> = JsonMissing.of(),
        @JsonProperty("overwrite") @ExcludeMissing overwrite: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("folderId") @ExcludeMissing folderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folderPath")
        @ExcludeMissing
        folderPath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ttl") @ExcludeMissing ttl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        access,
        duplicateValidationScope,
        duplicateValidationStrategy,
        overwrite,
        expiresAt,
        folderId,
        folderPath,
        name,
        ttl,
        url,
        mutableMapOf(),
    )

    /**
     * PUBLIC_INDEXABLE: File is publicly accessible by anyone who has the URL. Search engines can
     * index the file. PUBLIC_NOT_INDEXABLE: File is publicly accessible by anyone who has the URL.
     * Search engines *can't* index the file. PRIVATE: File is NOT publicly accessible. Requires a
     * signed URL to see content. Search engines *can't* index the file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun access(): Access = access.getRequired("access")

    /**
     * ENTIRE_PORTAL: Look for a duplicate file in the entire account. EXACT_FOLDER: Look for a
     * duplicate file in the provided folder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun duplicateValidationScope(): DuplicateValidationScope =
        duplicateValidationScope.getRequired("duplicateValidationScope")

    /**
     * NONE: Do not run any duplicate validation. REJECT: Reject the upload if a duplicate is found.
     * RETURN_EXISTING: If a duplicate file is found, do not upload a new file and return the found
     * duplicate instead.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun duplicateValidationStrategy(): DuplicateValidationStrategy =
        duplicateValidationStrategy.getRequired("duplicateValidationStrategy")

    /**
     * If true, will overwrite existing file if one with the same name and extension exists in the
     * given folder. The overwritten file will be deleted and the uploaded file will take its place
     * with a new ID. If unset or set as false, the new file's name will be updated to prevent
     * colliding with existing file if one exists with the same path, name, and extension
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overwrite(): Boolean = overwrite.getRequired("overwrite")

    /**
     * Specifies the date and time when the file will expire.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

    /**
     * One of folderId or folderPath is required. Destination folderId for the uploaded file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderId(): Optional<String> = folderId.getOptional("folderId")

    /**
     * One of folderPath or folderId is required. Destination folder path for the uploaded file. If
     * the folder path does not exist, there will be an attempt to create the folder path.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderPath(): Optional<String> = folderPath.getOptional("folderPath")

    /**
     * Name to give the resulting file in the file manager.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Time to live. If specified the file will be deleted after the given time frame. If left
     * unset, the file will exist indefinitely
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttl(): Optional<String> = ttl.getOptional("ttl")

    /**
     * URL to download the new file from.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

    /**
     * Returns the raw JSON value of [duplicateValidationScope].
     *
     * Unlike [duplicateValidationScope], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("duplicateValidationScope")
    @ExcludeMissing
    fun _duplicateValidationScope(): JsonField<DuplicateValidationScope> = duplicateValidationScope

    /**
     * Returns the raw JSON value of [duplicateValidationStrategy].
     *
     * Unlike [duplicateValidationStrategy], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("duplicateValidationStrategy")
    @ExcludeMissing
    fun _duplicateValidationStrategy(): JsonField<DuplicateValidationStrategy> =
        duplicateValidationStrategy

    /**
     * Returns the raw JSON value of [overwrite].
     *
     * Unlike [overwrite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overwrite") @ExcludeMissing fun _overwrite(): JsonField<Boolean> = overwrite

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [folderId].
     *
     * Unlike [folderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folderId") @ExcludeMissing fun _folderId(): JsonField<String> = folderId

    /**
     * Returns the raw JSON value of [folderPath].
     *
     * Unlike [folderPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folderPath") @ExcludeMissing fun _folderPath(): JsonField<String> = folderPath

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [ttl].
     *
     * Unlike [ttl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttl") @ExcludeMissing fun _ttl(): JsonField<String> = ttl

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [ImportFromUrlInput].
         *
         * The following fields are required:
         * ```java
         * .access()
         * .duplicateValidationScope()
         * .duplicateValidationStrategy()
         * .overwrite()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ImportFromUrlInput]. */
    class Builder internal constructor() {

        private var access: JsonField<Access>? = null
        private var duplicateValidationScope: JsonField<DuplicateValidationScope>? = null
        private var duplicateValidationStrategy: JsonField<DuplicateValidationStrategy>? = null
        private var overwrite: JsonField<Boolean>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var folderId: JsonField<String> = JsonMissing.of()
        private var folderPath: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var ttl: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(importFromUrlInput: ImportFromUrlInput) = apply {
            access = importFromUrlInput.access
            duplicateValidationScope = importFromUrlInput.duplicateValidationScope
            duplicateValidationStrategy = importFromUrlInput.duplicateValidationStrategy
            overwrite = importFromUrlInput.overwrite
            expiresAt = importFromUrlInput.expiresAt
            folderId = importFromUrlInput.folderId
            folderPath = importFromUrlInput.folderPath
            name = importFromUrlInput.name
            ttl = importFromUrlInput.ttl
            url = importFromUrlInput.url
            additionalProperties = importFromUrlInput.additionalProperties.toMutableMap()
        }

        /**
         * PUBLIC_INDEXABLE: File is publicly accessible by anyone who has the URL. Search engines
         * can index the file. PUBLIC_NOT_INDEXABLE: File is publicly accessible by anyone who has
         * the URL. Search engines *can't* index the file. PRIVATE: File is NOT publicly accessible.
         * Requires a signed URL to see content. Search engines *can't* index the file.
         */
        fun access(access: Access) = access(JsonField.of(access))

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { this.access = access }

        /**
         * ENTIRE_PORTAL: Look for a duplicate file in the entire account. EXACT_FOLDER: Look for a
         * duplicate file in the provided folder.
         */
        fun duplicateValidationScope(duplicateValidationScope: DuplicateValidationScope) =
            duplicateValidationScope(JsonField.of(duplicateValidationScope))

        /**
         * Sets [Builder.duplicateValidationScope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duplicateValidationScope] with a well-typed
         * [DuplicateValidationScope] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun duplicateValidationScope(
            duplicateValidationScope: JsonField<DuplicateValidationScope>
        ) = apply { this.duplicateValidationScope = duplicateValidationScope }

        /**
         * NONE: Do not run any duplicate validation. REJECT: Reject the upload if a duplicate is
         * found. RETURN_EXISTING: If a duplicate file is found, do not upload a new file and return
         * the found duplicate instead.
         */
        fun duplicateValidationStrategy(duplicateValidationStrategy: DuplicateValidationStrategy) =
            duplicateValidationStrategy(JsonField.of(duplicateValidationStrategy))

        /**
         * Sets [Builder.duplicateValidationStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duplicateValidationStrategy] with a well-typed
         * [DuplicateValidationStrategy] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun duplicateValidationStrategy(
            duplicateValidationStrategy: JsonField<DuplicateValidationStrategy>
        ) = apply { this.duplicateValidationStrategy = duplicateValidationStrategy }

        /**
         * If true, will overwrite existing file if one with the same name and extension exists in
         * the given folder. The overwritten file will be deleted and the uploaded file will take
         * its place with a new ID. If unset or set as false, the new file's name will be updated to
         * prevent colliding with existing file if one exists with the same path, name, and
         * extension
         */
        fun overwrite(overwrite: Boolean) = overwrite(JsonField.of(overwrite))

        /**
         * Sets [Builder.overwrite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overwrite] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overwrite(overwrite: JsonField<Boolean>) = apply { this.overwrite = overwrite }

        /** Specifies the date and time when the file will expire. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * One of folderId or folderPath is required. Destination folderId for the uploaded file.
         */
        fun folderId(folderId: String) = folderId(JsonField.of(folderId))

        /**
         * Sets [Builder.folderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderId(folderId: JsonField<String>) = apply { this.folderId = folderId }

        /**
         * One of folderPath or folderId is required. Destination folder path for the uploaded file.
         * If the folder path does not exist, there will be an attempt to create the folder path.
         */
        fun folderPath(folderPath: String) = folderPath(JsonField.of(folderPath))

        /**
         * Sets [Builder.folderPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun folderPath(folderPath: JsonField<String>) = apply { this.folderPath = folderPath }

        /** Name to give the resulting file in the file manager. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Time to live. If specified the file will be deleted after the given time frame. If left
         * unset, the file will exist indefinitely
         */
        fun ttl(ttl: String) = ttl(JsonField.of(ttl))

        /**
         * Sets [Builder.ttl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttl(ttl: JsonField<String>) = apply { this.ttl = ttl }

        /** URL to download the new file from. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [ImportFromUrlInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .access()
         * .duplicateValidationScope()
         * .duplicateValidationStrategy()
         * .overwrite()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImportFromUrlInput =
            ImportFromUrlInput(
                checkRequired("access", access),
                checkRequired("duplicateValidationScope", duplicateValidationScope),
                checkRequired("duplicateValidationStrategy", duplicateValidationStrategy),
                checkRequired("overwrite", overwrite),
                expiresAt,
                folderId,
                folderPath,
                name,
                ttl,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ImportFromUrlInput = apply {
        if (validated) {
            return@apply
        }

        access().validate()
        duplicateValidationScope().validate()
        duplicateValidationStrategy().validate()
        overwrite()
        expiresAt()
        folderId()
        folderPath()
        name()
        ttl()
        url()
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
            (duplicateValidationScope.asKnown().getOrNull()?.validity() ?: 0) +
            (duplicateValidationStrategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (overwrite.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (folderId.asKnown().isPresent) 1 else 0) +
            (if (folderPath.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (ttl.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    /**
     * PUBLIC_INDEXABLE: File is publicly accessible by anyone who has the URL. Search engines can
     * index the file. PUBLIC_NOT_INDEXABLE: File is publicly accessible by anyone who has the URL.
     * Search engines *can't* index the file. PRIVATE: File is NOT publicly accessible. Requires a
     * signed URL to see content. Search engines *can't* index the file.
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

            @JvmField val HIDDEN_INDEXABLE = of("HIDDEN_INDEXABLE")

            @JvmField val HIDDEN_NOT_INDEXABLE = of("HIDDEN_NOT_INDEXABLE")

            @JvmField val HIDDEN_PRIVATE = of("HIDDEN_PRIVATE")

            @JvmField val HIDDEN_SENSITIVE = of("HIDDEN_SENSITIVE")

            @JvmField val PRIVATE = of("PRIVATE")

            @JvmField val PUBLIC_INDEXABLE = of("PUBLIC_INDEXABLE")

            @JvmField val PUBLIC_NOT_INDEXABLE = of("PUBLIC_NOT_INDEXABLE")

            @JvmField val SENSITIVE = of("SENSITIVE")

            @JvmStatic fun of(value: String) = Access(JsonField.of(value))
        }

        /** An enum containing [Access]'s known values. */
        enum class Known {
            HIDDEN_INDEXABLE,
            HIDDEN_NOT_INDEXABLE,
            HIDDEN_PRIVATE,
            HIDDEN_SENSITIVE,
            PRIVATE,
            PUBLIC_INDEXABLE,
            PUBLIC_NOT_INDEXABLE,
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
            HIDDEN_INDEXABLE,
            HIDDEN_NOT_INDEXABLE,
            HIDDEN_PRIVATE,
            HIDDEN_SENSITIVE,
            PRIVATE,
            PUBLIC_INDEXABLE,
            PUBLIC_NOT_INDEXABLE,
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
                HIDDEN_INDEXABLE -> Value.HIDDEN_INDEXABLE
                HIDDEN_NOT_INDEXABLE -> Value.HIDDEN_NOT_INDEXABLE
                HIDDEN_PRIVATE -> Value.HIDDEN_PRIVATE
                HIDDEN_SENSITIVE -> Value.HIDDEN_SENSITIVE
                PRIVATE -> Value.PRIVATE
                PUBLIC_INDEXABLE -> Value.PUBLIC_INDEXABLE
                PUBLIC_NOT_INDEXABLE -> Value.PUBLIC_NOT_INDEXABLE
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
                HIDDEN_INDEXABLE -> Known.HIDDEN_INDEXABLE
                HIDDEN_NOT_INDEXABLE -> Known.HIDDEN_NOT_INDEXABLE
                HIDDEN_PRIVATE -> Known.HIDDEN_PRIVATE
                HIDDEN_SENSITIVE -> Known.HIDDEN_SENSITIVE
                PRIVATE -> Known.PRIVATE
                PUBLIC_INDEXABLE -> Known.PUBLIC_INDEXABLE
                PUBLIC_NOT_INDEXABLE -> Known.PUBLIC_NOT_INDEXABLE
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

    /**
     * ENTIRE_PORTAL: Look for a duplicate file in the entire account. EXACT_FOLDER: Look for a
     * duplicate file in the provided folder.
     */
    class DuplicateValidationScope
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENTIRE_PORTAL = of("ENTIRE_PORTAL")

            @JvmField val EXACT_FOLDER = of("EXACT_FOLDER")

            @JvmStatic fun of(value: String) = DuplicateValidationScope(JsonField.of(value))
        }

        /** An enum containing [DuplicateValidationScope]'s known values. */
        enum class Known {
            ENTIRE_PORTAL,
            EXACT_FOLDER,
        }

        /**
         * An enum containing [DuplicateValidationScope]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DuplicateValidationScope] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENTIRE_PORTAL,
            EXACT_FOLDER,
            /**
             * An enum member indicating that [DuplicateValidationScope] was instantiated with an
             * unknown value.
             */
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
                ENTIRE_PORTAL -> Value.ENTIRE_PORTAL
                EXACT_FOLDER -> Value.EXACT_FOLDER
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
                ENTIRE_PORTAL -> Known.ENTIRE_PORTAL
                EXACT_FOLDER -> Known.EXACT_FOLDER
                else ->
                    throw HubSpotInvalidDataException("Unknown DuplicateValidationScope: $value")
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

        fun validate(): DuplicateValidationScope = apply {
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

            return other is DuplicateValidationScope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * NONE: Do not run any duplicate validation. REJECT: Reject the upload if a duplicate is found.
     * RETURN_EXISTING: If a duplicate file is found, do not upload a new file and return the found
     * duplicate instead.
     */
    class DuplicateValidationStrategy
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("NONE")

            @JvmField val REJECT = of("REJECT")

            @JvmField val RETURN_EXISTING = of("RETURN_EXISTING")

            @JvmStatic fun of(value: String) = DuplicateValidationStrategy(JsonField.of(value))
        }

        /** An enum containing [DuplicateValidationStrategy]'s known values. */
        enum class Known {
            NONE,
            REJECT,
            RETURN_EXISTING,
        }

        /**
         * An enum containing [DuplicateValidationStrategy]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DuplicateValidationStrategy] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            REJECT,
            RETURN_EXISTING,
            /**
             * An enum member indicating that [DuplicateValidationStrategy] was instantiated with an
             * unknown value.
             */
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
                NONE -> Value.NONE
                REJECT -> Value.REJECT
                RETURN_EXISTING -> Value.RETURN_EXISTING
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
                NONE -> Known.NONE
                REJECT -> Known.REJECT
                RETURN_EXISTING -> Known.RETURN_EXISTING
                else ->
                    throw HubSpotInvalidDataException("Unknown DuplicateValidationStrategy: $value")
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

        fun validate(): DuplicateValidationStrategy = apply {
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

            return other is DuplicateValidationStrategy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImportFromUrlInput &&
            access == other.access &&
            duplicateValidationScope == other.duplicateValidationScope &&
            duplicateValidationStrategy == other.duplicateValidationStrategy &&
            overwrite == other.overwrite &&
            expiresAt == other.expiresAt &&
            folderId == other.folderId &&
            folderPath == other.folderPath &&
            name == other.name &&
            ttl == other.ttl &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            access,
            duplicateValidationScope,
            duplicateValidationStrategy,
            overwrite,
            expiresAt,
            folderId,
            folderPath,
            name,
            ttl,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImportFromUrlInput{access=$access, duplicateValidationScope=$duplicateValidationScope, duplicateValidationStrategy=$duplicateValidationStrategy, overwrite=$overwrite, expiresAt=$expiresAt, folderId=$folderId, folderPath=$folderPath, name=$name, ttl=$ttl, url=$url, additionalProperties=$additionalProperties}"
}
