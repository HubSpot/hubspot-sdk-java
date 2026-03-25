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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CreateVideoObjectRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mediaType: JsonField<MediaType>,
    private val title: JsonField<String>,
    private val bearerToken: JsonField<String>,
    private val detailsPageLink: JsonField<String>,
    private val duration: JsonField<Long>,
    private val externalId: JsonField<String>,
    private val fileUrl: JsonField<String>,
    private val oembedUrl: JsonField<String>,
    private val posterUrl: JsonField<String>,
    private val thumbnailUrl: JsonField<String>,
    private val transcriptUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mediaType")
        @ExcludeMissing
        mediaType: JsonField<MediaType> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bearerToken")
        @ExcludeMissing
        bearerToken: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("transcriptUrl")
        @ExcludeMissing
        transcriptUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        mediaType,
        title,
        bearerToken,
        detailsPageLink,
        duration,
        externalId,
        fileUrl,
        oembedUrl,
        posterUrl,
        thumbnailUrl,
        transcriptUrl,
        mutableMapOf(),
    )

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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bearerToken(): Optional<String> = bearerToken.getOptional("bearerToken")

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
    fun transcriptUrl(): Optional<String> = transcriptUrl.getOptional("transcriptUrl")

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
     * Returns the raw JSON value of [bearerToken].
     *
     * Unlike [bearerToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bearerToken") @ExcludeMissing fun _bearerToken(): JsonField<String> = bearerToken

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
     * Returns the raw JSON value of [transcriptUrl].
     *
     * Unlike [transcriptUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transcriptUrl")
    @ExcludeMissing
    fun _transcriptUrl(): JsonField<String> = transcriptUrl

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
         * Returns a mutable builder for constructing an instance of [CreateVideoObjectRequest].
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateVideoObjectRequest]. */
    class Builder internal constructor() {

        private var mediaType: JsonField<MediaType>? = null
        private var title: JsonField<String>? = null
        private var bearerToken: JsonField<String> = JsonMissing.of()
        private var detailsPageLink: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<Long> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var fileUrl: JsonField<String> = JsonMissing.of()
        private var oembedUrl: JsonField<String> = JsonMissing.of()
        private var posterUrl: JsonField<String> = JsonMissing.of()
        private var thumbnailUrl: JsonField<String> = JsonMissing.of()
        private var transcriptUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createVideoObjectRequest: CreateVideoObjectRequest) = apply {
            mediaType = createVideoObjectRequest.mediaType
            title = createVideoObjectRequest.title
            bearerToken = createVideoObjectRequest.bearerToken
            detailsPageLink = createVideoObjectRequest.detailsPageLink
            duration = createVideoObjectRequest.duration
            externalId = createVideoObjectRequest.externalId
            fileUrl = createVideoObjectRequest.fileUrl
            oembedUrl = createVideoObjectRequest.oembedUrl
            posterUrl = createVideoObjectRequest.posterUrl
            thumbnailUrl = createVideoObjectRequest.thumbnailUrl
            transcriptUrl = createVideoObjectRequest.transcriptUrl
            additionalProperties = createVideoObjectRequest.additionalProperties.toMutableMap()
        }

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

        fun bearerToken(bearerToken: String) = bearerToken(JsonField.of(bearerToken))

        /**
         * Sets [Builder.bearerToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bearerToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bearerToken(bearerToken: JsonField<String>) = apply { this.bearerToken = bearerToken }

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

        fun transcriptUrl(transcriptUrl: String) = transcriptUrl(JsonField.of(transcriptUrl))

        /**
         * Sets [Builder.transcriptUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transcriptUrl(transcriptUrl: JsonField<String>) = apply {
            this.transcriptUrl = transcriptUrl
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
         * Returns an immutable instance of [CreateVideoObjectRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateVideoObjectRequest =
            CreateVideoObjectRequest(
                checkRequired("mediaType", mediaType),
                checkRequired("title", title),
                bearerToken,
                detailsPageLink,
                duration,
                externalId,
                fileUrl,
                oembedUrl,
                posterUrl,
                thumbnailUrl,
                transcriptUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreateVideoObjectRequest = apply {
        if (validated) {
            return@apply
        }

        mediaType().validate()
        title()
        bearerToken()
        detailsPageLink()
        duration()
        externalId()
        fileUrl()
        oembedUrl()
        posterUrl()
        thumbnailUrl()
        transcriptUrl()
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
        (mediaType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (bearerToken.asKnown().isPresent) 1 else 0) +
            (if (detailsPageLink.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (fileUrl.asKnown().isPresent) 1 else 0) +
            (if (oembedUrl.asKnown().isPresent) 1 else 0) +
            (if (posterUrl.asKnown().isPresent) 1 else 0) +
            (if (thumbnailUrl.asKnown().isPresent) 1 else 0) +
            (if (transcriptUrl.asKnown().isPresent) 1 else 0)

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

            @JvmField val VIDEO = of("VIDEO")

            @JvmStatic fun of(value: String) = MediaType(JsonField.of(value))
        }

        /** An enum containing [MediaType]'s known values. */
        enum class Known {
            VIDEO
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

        return other is CreateVideoObjectRequest &&
            mediaType == other.mediaType &&
            title == other.title &&
            bearerToken == other.bearerToken &&
            detailsPageLink == other.detailsPageLink &&
            duration == other.duration &&
            externalId == other.externalId &&
            fileUrl == other.fileUrl &&
            oembedUrl == other.oembedUrl &&
            posterUrl == other.posterUrl &&
            thumbnailUrl == other.thumbnailUrl &&
            transcriptUrl == other.transcriptUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            mediaType,
            title,
            bearerToken,
            detailsPageLink,
            duration,
            externalId,
            fileUrl,
            oembedUrl,
            posterUrl,
            thumbnailUrl,
            transcriptUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateVideoObjectRequest{mediaType=$mediaType, title=$title, bearerToken=$bearerToken, detailsPageLink=$detailsPageLink, duration=$duration, externalId=$externalId, fileUrl=$fileUrl, oembedUrl=$oembedUrl, posterUrl=$posterUrl, thumbnailUrl=$thumbnailUrl, transcriptUrl=$transcriptUrl, additionalProperties=$additionalProperties}"
}
