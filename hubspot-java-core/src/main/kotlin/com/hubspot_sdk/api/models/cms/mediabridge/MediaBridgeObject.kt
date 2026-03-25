// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MediaBridgeObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val mediaType: JsonField<MediaType>,
    private val title: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val detailsPageLink: JsonField<String>,
    private val duration: JsonField<Long>,
    private val externalId: JsonField<String>,
    private val fileUrl: JsonField<String>,
    private val oembedUrl: JsonField<String>,
    private val posterUrl: JsonField<String>,
    private val thumbnailUrl: JsonField<String>,
    private val video: JsonField<VideoObject>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("mediaType")
        @ExcludeMissing
        mediaType: JsonField<MediaType> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detailsPageLink")
        @ExcludeMissing
        detailsPageLink: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileUrl") @ExcludeMissing fileUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oembedUrl") @ExcludeMissing oembedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("posterUrl") @ExcludeMissing posterUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thumbnailUrl")
        @ExcludeMissing
        thumbnailUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("video") @ExcludeMissing video: JsonField<VideoObject> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        mediaType,
        title,
        updatedAt,
        detailsPageLink,
        duration,
        externalId,
        fileUrl,
        oembedUrl,
        posterUrl,
        thumbnailUrl,
        video,
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
    fun mediaType(): MediaType = mediaType.getRequired("mediaType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detailsPageLink(): Optional<String> = detailsPageLink.getOptional("detailsPageLink")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<Long> = duration.getOptional("duration")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileUrl(): Optional<String> = fileUrl.getOptional("fileUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oembedUrl(): Optional<String> = oembedUrl.getOptional("oembedUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun posterUrl(): Optional<String> = posterUrl.getOptional("posterUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thumbnailUrl(): Optional<String> = thumbnailUrl.getOptional("thumbnailUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun video(): Optional<VideoObject> = video.getOptional("video")

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
     * Returns the raw JSON value of [mediaType].
     *
     * Unlike [mediaType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaType") @ExcludeMissing fun _mediaType(): JsonField<MediaType> = mediaType

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [detailsPageLink].
     *
     * Unlike [detailsPageLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detailsPageLink")
    @ExcludeMissing
    fun _detailsPageLink(): JsonField<String> = detailsPageLink

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [fileUrl].
     *
     * Unlike [fileUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileUrl") @ExcludeMissing fun _fileUrl(): JsonField<String> = fileUrl

    /**
     * Returns the raw JSON value of [oembedUrl].
     *
     * Unlike [oembedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oembedUrl") @ExcludeMissing fun _oembedUrl(): JsonField<String> = oembedUrl

    /**
     * Returns the raw JSON value of [posterUrl].
     *
     * Unlike [posterUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posterUrl") @ExcludeMissing fun _posterUrl(): JsonField<String> = posterUrl

    /**
     * Returns the raw JSON value of [thumbnailUrl].
     *
     * Unlike [thumbnailUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thumbnailUrl")
    @ExcludeMissing
    fun _thumbnailUrl(): JsonField<String> = thumbnailUrl

    /**
     * Returns the raw JSON value of [video].
     *
     * Unlike [video], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("video") @ExcludeMissing fun _video(): JsonField<VideoObject> = video

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
         * Returns a mutable builder for constructing an instance of [MediaBridgeObject].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .mediaType()
         * .title()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaBridgeObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var mediaType: JsonField<MediaType>? = null
        private var title: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var detailsPageLink: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<Long> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var fileUrl: JsonField<String> = JsonMissing.of()
        private var oembedUrl: JsonField<String> = JsonMissing.of()
        private var posterUrl: JsonField<String> = JsonMissing.of()
        private var thumbnailUrl: JsonField<String> = JsonMissing.of()
        private var video: JsonField<VideoObject> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mediaBridgeObject: MediaBridgeObject) = apply {
            id = mediaBridgeObject.id
            createdAt = mediaBridgeObject.createdAt
            mediaType = mediaBridgeObject.mediaType
            title = mediaBridgeObject.title
            updatedAt = mediaBridgeObject.updatedAt
            detailsPageLink = mediaBridgeObject.detailsPageLink
            duration = mediaBridgeObject.duration
            externalId = mediaBridgeObject.externalId
            fileUrl = mediaBridgeObject.fileUrl
            oembedUrl = mediaBridgeObject.oembedUrl
            posterUrl = mediaBridgeObject.posterUrl
            thumbnailUrl = mediaBridgeObject.thumbnailUrl
            video = mediaBridgeObject.video
            additionalProperties = mediaBridgeObject.additionalProperties.toMutableMap()
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

        fun mediaType(mediaType: MediaType) = mediaType(JsonField.of(mediaType))

        /**
         * Sets [Builder.mediaType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaType] with a well-typed [MediaType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaType(mediaType: JsonField<MediaType>) = apply { this.mediaType = mediaType }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun detailsPageLink(detailsPageLink: String) =
            detailsPageLink(JsonField.of(detailsPageLink))

        /**
         * Sets [Builder.detailsPageLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detailsPageLink] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detailsPageLink(detailsPageLink: JsonField<String>) = apply {
            this.detailsPageLink = detailsPageLink
        }

        fun duration(duration: Long) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        fun fileUrl(fileUrl: String) = fileUrl(JsonField.of(fileUrl))

        /**
         * Sets [Builder.fileUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileUrl(fileUrl: JsonField<String>) = apply { this.fileUrl = fileUrl }

        fun oembedUrl(oembedUrl: String) = oembedUrl(JsonField.of(oembedUrl))

        /**
         * Sets [Builder.oembedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oembedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun oembedUrl(oembedUrl: JsonField<String>) = apply { this.oembedUrl = oembedUrl }

        fun posterUrl(posterUrl: String) = posterUrl(JsonField.of(posterUrl))

        /**
         * Sets [Builder.posterUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posterUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun posterUrl(posterUrl: JsonField<String>) = apply { this.posterUrl = posterUrl }

        fun thumbnailUrl(thumbnailUrl: String) = thumbnailUrl(JsonField.of(thumbnailUrl))

        /**
         * Sets [Builder.thumbnailUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thumbnailUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thumbnailUrl(thumbnailUrl: JsonField<String>) = apply {
            this.thumbnailUrl = thumbnailUrl
        }

        fun video(video: VideoObject) = video(JsonField.of(video))

        /**
         * Sets [Builder.video] to an arbitrary JSON value.
         *
         * You should usually call [Builder.video] with a well-typed [VideoObject] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun video(video: JsonField<VideoObject>) = apply { this.video = video }

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
         * Returns an immutable instance of [MediaBridgeObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .mediaType()
         * .title()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaBridgeObject =
            MediaBridgeObject(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("mediaType", mediaType),
                checkRequired("title", title),
                checkRequired("updatedAt", updatedAt),
                detailsPageLink,
                duration,
                externalId,
                fileUrl,
                oembedUrl,
                posterUrl,
                thumbnailUrl,
                video,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MediaBridgeObject = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        mediaType().validate()
        title()
        updatedAt()
        detailsPageLink()
        duration()
        externalId()
        fileUrl()
        oembedUrl()
        posterUrl()
        thumbnailUrl()
        video().ifPresent { it.validate() }
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
            (mediaType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (detailsPageLink.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (fileUrl.asKnown().isPresent) 1 else 0) +
            (if (oembedUrl.asKnown().isPresent) 1 else 0) +
            (if (posterUrl.asKnown().isPresent) 1 else 0) +
            (if (thumbnailUrl.asKnown().isPresent) 1 else 0) +
            (video.asKnown().getOrNull()?.validity() ?: 0)

    class MediaType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUDIO = of("AUDIO")

            @JvmField val DOCUMENT = of("DOCUMENT")

            @JvmField val IMAGE = of("IMAGE")

            @JvmField val OTHER = of("OTHER")

            @JvmField val VIDEO = of("VIDEO")

            @JvmStatic fun of(value: String) = MediaType(JsonField.of(value))
        }

        /** An enum containing [MediaType]'s known values. */
        enum class Known {
            AUDIO,
            DOCUMENT,
            IMAGE,
            OTHER,
            VIDEO,
        }

        /**
         * An enum containing [MediaType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MediaType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUDIO,
            DOCUMENT,
            IMAGE,
            OTHER,
            VIDEO,
            /**
             * An enum member indicating that [MediaType] was instantiated with an unknown value.
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
                AUDIO -> Value.AUDIO
                DOCUMENT -> Value.DOCUMENT
                IMAGE -> Value.IMAGE
                OTHER -> Value.OTHER
                VIDEO -> Value.VIDEO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AUDIO -> Known.AUDIO
                DOCUMENT -> Known.DOCUMENT
                IMAGE -> Known.IMAGE
                OTHER -> Known.OTHER
                VIDEO -> Known.VIDEO
                else -> throw HubspotInvalidDataException("Unknown MediaType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): MediaType = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is MediaType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgeObject &&
            id == other.id &&
            createdAt == other.createdAt &&
            mediaType == other.mediaType &&
            title == other.title &&
            updatedAt == other.updatedAt &&
            detailsPageLink == other.detailsPageLink &&
            duration == other.duration &&
            externalId == other.externalId &&
            fileUrl == other.fileUrl &&
            oembedUrl == other.oembedUrl &&
            posterUrl == other.posterUrl &&
            thumbnailUrl == other.thumbnailUrl &&
            video == other.video &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            mediaType,
            title,
            updatedAt,
            detailsPageLink,
            duration,
            externalId,
            fileUrl,
            oembedUrl,
            posterUrl,
            thumbnailUrl,
            video,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MediaBridgeObject{id=$id, createdAt=$createdAt, mediaType=$mediaType, title=$title, updatedAt=$updatedAt, detailsPageLink=$detailsPageLink, duration=$duration, externalId=$externalId, fileUrl=$fileUrl, oembedUrl=$oembedUrl, posterUrl=$posterUrl, thumbnailUrl=$thumbnailUrl, video=$video, additionalProperties=$additionalProperties}"
}
