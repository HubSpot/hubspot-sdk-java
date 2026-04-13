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

class File
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val access: JsonField<Access>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val defaultHostingUrl: JsonField<String>,
    private val encoding: JsonField<String>,
    private val expiresAt: JsonField<Long>,
    private val extension: JsonField<String>,
    private val fileMd5: JsonField<String>,
    private val height: JsonField<Int>,
    private val isUsableInContent: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val parentFolderId: JsonField<String>,
    private val path: JsonField<String>,
    private val size: JsonField<Long>,
    private val sourceGroup: JsonField<SourceGroup>,
    private val type: JsonField<String>,
    private val url: JsonField<String>,
    private val width: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
        @JsonProperty("archivedAt")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("defaultHostingUrl")
        @ExcludeMissing
        defaultHostingUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("encoding") @ExcludeMissing encoding: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiresAt") @ExcludeMissing expiresAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("extension") @ExcludeMissing extension: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileMd5") @ExcludeMissing fileMd5: JsonField<String> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("isUsableInContent")
        @ExcludeMissing
        isUsableInContent: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentFolderId")
        @ExcludeMissing
        parentFolderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sourceGroup")
        @ExcludeMissing
        sourceGroup: JsonField<SourceGroup> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        archived,
        createdAt,
        updatedAt,
        access,
        archivedAt,
        defaultHostingUrl,
        encoding,
        expiresAt,
        extension,
        fileMd5,
        height,
        isUsableInContent,
        name,
        parentFolderId,
        path,
        size,
        sourceGroup,
        type,
        url,
        width,
        mutableMapOf(),
    )

    /**
     * File ID.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If the file is deleted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * Creation time of the file object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Timestamp of the latest update to the file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * File access. Can be PUBLIC_INDEXABLE, PUBLIC_NOT_INDEXABLE, PRIVATE.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun access(): Optional<Access> = access.getOptional("access")

    /**
     * Deletion time of the file object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archivedAt")

    /**
     * Default hosting URL of the file. This will use one of HubSpot's provided URLs to serve the
     * file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultHostingUrl(): Optional<String> = defaultHostingUrl.getOptional("defaultHostingUrl")

    /**
     * Encoding of the file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encoding(): Optional<String> = encoding.getOptional("encoding")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<Long> = expiresAt.getOptional("expiresAt")

    /**
     * Extension of the file. ex: .jpg, .png, .gif, .pdf, etc.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extension(): Optional<String> = extension.getOptional("extension")

    /**
     * The MD5 hash of the file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileMd5(): Optional<String> = fileMd5.getOptional("fileMd5")

    /**
     * For image and video files, the height of the content.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Int> = height.getOptional("height")

    /**
     * Previously "archied". Indicates if the file should be used when creating new content like web
     * pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isUsableInContent(): Optional<Boolean> = isUsableInContent.getOptional("isUsableInContent")

    /**
     * Name of the file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * ID of the folder the file is in.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentFolderId(): Optional<String> = parentFolderId.getOptional("parentFolderId")

    /**
     * Path of the file in the file manager.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * Size of the file in bytes.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun size(): Optional<Long> = size.getOptional("size")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceGroup(): Optional<SourceGroup> = sourceGroup.getOptional("sourceGroup")

    /**
     * Type of the file. Can be IMG, DOCUMENT, AUDIO, MOVIE, or OTHER.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * URL of the given file. This URL can change depending on the domain settings of the account.
     * Will use the select file hosting domain.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * For image and video files, the width of the content.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<Int> = width.getOptional("width")

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivedAt")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [defaultHostingUrl].
     *
     * Unlike [defaultHostingUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("defaultHostingUrl")
    @ExcludeMissing
    fun _defaultHostingUrl(): JsonField<String> = defaultHostingUrl

    /**
     * Returns the raw JSON value of [encoding].
     *
     * Unlike [encoding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encoding") @ExcludeMissing fun _encoding(): JsonField<String> = encoding

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt") @ExcludeMissing fun _expiresAt(): JsonField<Long> = expiresAt

    /**
     * Returns the raw JSON value of [extension].
     *
     * Unlike [extension], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extension") @ExcludeMissing fun _extension(): JsonField<String> = extension

    /**
     * Returns the raw JSON value of [fileMd5].
     *
     * Unlike [fileMd5], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileMd5") @ExcludeMissing fun _fileMd5(): JsonField<String> = fileMd5

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Int> = height

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
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

    /**
     * Returns the raw JSON value of [sourceGroup].
     *
     * Unlike [sourceGroup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceGroup")
    @ExcludeMissing
    fun _sourceGroup(): JsonField<SourceGroup> = sourceGroup

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Int> = width

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
         * Returns a mutable builder for constructing an instance of [File].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .createdAt()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [File]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archived: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var access: JsonField<Access> = JsonMissing.of()
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var defaultHostingUrl: JsonField<String> = JsonMissing.of()
        private var encoding: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<Long> = JsonMissing.of()
        private var extension: JsonField<String> = JsonMissing.of()
        private var fileMd5: JsonField<String> = JsonMissing.of()
        private var height: JsonField<Int> = JsonMissing.of()
        private var isUsableInContent: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var parentFolderId: JsonField<String> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var size: JsonField<Long> = JsonMissing.of()
        private var sourceGroup: JsonField<SourceGroup> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var width: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(file: File) = apply {
            id = file.id
            archived = file.archived
            createdAt = file.createdAt
            updatedAt = file.updatedAt
            access = file.access
            archivedAt = file.archivedAt
            defaultHostingUrl = file.defaultHostingUrl
            encoding = file.encoding
            expiresAt = file.expiresAt
            extension = file.extension
            fileMd5 = file.fileMd5
            height = file.height
            isUsableInContent = file.isUsableInContent
            name = file.name
            parentFolderId = file.parentFolderId
            path = file.path
            size = file.size
            sourceGroup = file.sourceGroup
            type = file.type
            url = file.url
            width = file.width
            additionalProperties = file.additionalProperties.toMutableMap()
        }

        /** File ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** If the file is deleted. */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** Creation time of the file object. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Timestamp of the latest update to the file. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** File access. Can be PUBLIC_INDEXABLE, PUBLIC_NOT_INDEXABLE, PRIVATE. */
        fun access(access: Access) = access(JsonField.of(access))

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { this.access = access }

        /** Deletion time of the file object. */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        /**
         * Default hosting URL of the file. This will use one of HubSpot's provided URLs to serve
         * the file.
         */
        fun defaultHostingUrl(defaultHostingUrl: String) =
            defaultHostingUrl(JsonField.of(defaultHostingUrl))

        /**
         * Sets [Builder.defaultHostingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultHostingUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultHostingUrl(defaultHostingUrl: JsonField<String>) = apply {
            this.defaultHostingUrl = defaultHostingUrl
        }

        /** Encoding of the file. */
        fun encoding(encoding: String) = encoding(JsonField.of(encoding))

        /**
         * Sets [Builder.encoding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encoding] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun encoding(encoding: JsonField<String>) = apply { this.encoding = encoding }

        fun expiresAt(expiresAt: Long) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresAt(expiresAt: JsonField<Long>) = apply { this.expiresAt = expiresAt }

        /** Extension of the file. ex: .jpg, .png, .gif, .pdf, etc. */
        fun extension(extension: String) = extension(JsonField.of(extension))

        /**
         * Sets [Builder.extension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extension] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extension(extension: JsonField<String>) = apply { this.extension = extension }

        /** The MD5 hash of the file. */
        fun fileMd5(fileMd5: String) = fileMd5(JsonField.of(fileMd5))

        /**
         * Sets [Builder.fileMd5] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileMd5] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileMd5(fileMd5: JsonField<String>) = apply { this.fileMd5 = fileMd5 }

        /** For image and video files, the height of the content. */
        fun height(height: Int) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Int>) = apply { this.height = height }

        /**
         * Previously "archied". Indicates if the file should be used when creating new content like
         * web pages.
         */
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

        /** Name of the file. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** ID of the folder the file is in. */
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

        /** Path of the file in the file manager. */
        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /** Size of the file in bytes. */
        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

        fun sourceGroup(sourceGroup: SourceGroup) = sourceGroup(JsonField.of(sourceGroup))

        /**
         * Sets [Builder.sourceGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceGroup] with a well-typed [SourceGroup] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceGroup(sourceGroup: JsonField<SourceGroup>) = apply {
            this.sourceGroup = sourceGroup
        }

        /** Type of the file. Can be IMG, DOCUMENT, AUDIO, MOVIE, or OTHER. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * URL of the given file. This URL can change depending on the domain settings of the
         * account. Will use the select file hosting domain.
         */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** For image and video files, the width of the content. */
        fun width(width: Int) = width(JsonField.of(width))

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Int>) = apply { this.width = width }

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
         * Returns an immutable instance of [File].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .createdAt()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): File =
            File(
                checkRequired("id", id),
                checkRequired("archived", archived),
                checkRequired("createdAt", createdAt),
                checkRequired("updatedAt", updatedAt),
                access,
                archivedAt,
                defaultHostingUrl,
                encoding,
                expiresAt,
                extension,
                fileMd5,
                height,
                isUsableInContent,
                name,
                parentFolderId,
                path,
                size,
                sourceGroup,
                type,
                url,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): File = apply {
        if (validated) {
            return@apply
        }

        id()
        archived()
        createdAt()
        updatedAt()
        access().ifPresent { it.validate() }
        archivedAt()
        defaultHostingUrl()
        encoding()
        expiresAt()
        extension()
        fileMd5()
        height()
        isUsableInContent()
        name()
        parentFolderId()
        path()
        size()
        sourceGroup().ifPresent { it.validate() }
        type()
        url()
        width()
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
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (access.asKnown().getOrNull()?.validity() ?: 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (if (defaultHostingUrl.asKnown().isPresent) 1 else 0) +
            (if (encoding.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (extension.asKnown().isPresent) 1 else 0) +
            (if (fileMd5.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (isUsableInContent.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (parentFolderId.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (sourceGroup.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    /** File access. Can be PUBLIC_INDEXABLE, PUBLIC_NOT_INDEXABLE, PRIVATE. */
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

    class SourceGroup @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONVERSATIONS = of("CONVERSATIONS")

            @JvmField val FORMS = of("FORMS")

            @JvmField val UI_EXTENSIONS = of("UI_EXTENSIONS")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = SourceGroup(JsonField.of(value))
        }

        /** An enum containing [SourceGroup]'s known values. */
        enum class Known {
            CONTENT,
            CONVERSATIONS,
            FORMS,
            UI_EXTENSIONS,
            UNKNOWN,
        }

        /**
         * An enum containing [SourceGroup]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceGroup] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTENT,
            CONVERSATIONS,
            FORMS,
            UI_EXTENSIONS,
            UNKNOWN,
            /**
             * An enum member indicating that [SourceGroup] was instantiated with an unknown value.
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
                CONTENT -> Value.CONTENT
                CONVERSATIONS -> Value.CONVERSATIONS
                FORMS -> Value.FORMS
                UI_EXTENSIONS -> Value.UI_EXTENSIONS
                UNKNOWN -> Value.UNKNOWN
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
                CONTENT -> Known.CONTENT
                CONVERSATIONS -> Known.CONVERSATIONS
                FORMS -> Known.FORMS
                UI_EXTENSIONS -> Known.UI_EXTENSIONS
                UNKNOWN -> Known.UNKNOWN
                else -> throw HubSpotInvalidDataException("Unknown SourceGroup: $value")
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

        fun validate(): SourceGroup = apply {
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

            return other is SourceGroup && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is File &&
            id == other.id &&
            archived == other.archived &&
            createdAt == other.createdAt &&
            updatedAt == other.updatedAt &&
            access == other.access &&
            archivedAt == other.archivedAt &&
            defaultHostingUrl == other.defaultHostingUrl &&
            encoding == other.encoding &&
            expiresAt == other.expiresAt &&
            extension == other.extension &&
            fileMd5 == other.fileMd5 &&
            height == other.height &&
            isUsableInContent == other.isUsableInContent &&
            name == other.name &&
            parentFolderId == other.parentFolderId &&
            path == other.path &&
            size == other.size &&
            sourceGroup == other.sourceGroup &&
            type == other.type &&
            url == other.url &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archived,
            createdAt,
            updatedAt,
            access,
            archivedAt,
            defaultHostingUrl,
            encoding,
            expiresAt,
            extension,
            fileMd5,
            height,
            isUsableInContent,
            name,
            parentFolderId,
            path,
            size,
            sourceGroup,
            type,
            url,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "File{id=$id, archived=$archived, createdAt=$createdAt, updatedAt=$updatedAt, access=$access, archivedAt=$archivedAt, defaultHostingUrl=$defaultHostingUrl, encoding=$encoding, expiresAt=$expiresAt, extension=$extension, fileMd5=$fileMd5, height=$height, isUsableInContent=$isUsableInContent, name=$name, parentFolderId=$parentFolderId, path=$path, size=$size, sourceGroup=$sourceGroup, type=$type, url=$url, width=$width, additionalProperties=$additionalProperties}"
}
