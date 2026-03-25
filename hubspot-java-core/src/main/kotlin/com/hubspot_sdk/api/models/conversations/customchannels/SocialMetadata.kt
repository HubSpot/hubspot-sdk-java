// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

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

class SocialMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mediaType: JsonField<MediaType>,
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val mediaTitle: JsonField<String>,
    private val mediaUrl: JsonField<String>,
    private val mediaUrlString: JsonField<String>,
    private val thumbnailUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mediaType")
        @ExcludeMissing
        mediaType: JsonField<MediaType> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaTitle")
        @ExcludeMissing
        mediaTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaUrl") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaUrlString")
        @ExcludeMissing
        mediaUrlString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thumbnailUrl")
        @ExcludeMissing
        thumbnailUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        mediaType,
        id,
        description,
        mediaTitle,
        mediaUrl,
        mediaUrlString,
        thumbnailUrl,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaType(): MediaType = mediaType.getRequired("mediaType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaTitle(): Optional<String> = mediaTitle.getOptional("mediaTitle")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("mediaUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrlString(): Optional<String> = mediaUrlString.getOptional("mediaUrlString")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thumbnailUrl(): Optional<String> = thumbnailUrl.getOptional("thumbnailUrl")

    /**
     * Returns the raw JSON value of [mediaType].
     *
     * Unlike [mediaType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaType") @ExcludeMissing fun _mediaType(): JsonField<MediaType> = mediaType

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [mediaTitle].
     *
     * Unlike [mediaTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaTitle") @ExcludeMissing fun _mediaTitle(): JsonField<String> = mediaTitle

    /**
     * Returns the raw JSON value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaUrl") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

    /**
     * Returns the raw JSON value of [mediaUrlString].
     *
     * Unlike [mediaUrlString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaUrlString")
    @ExcludeMissing
    fun _mediaUrlString(): JsonField<String> = mediaUrlString

    /**
     * Returns the raw JSON value of [thumbnailUrl].
     *
     * Unlike [thumbnailUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thumbnailUrl")
    @ExcludeMissing
    fun _thumbnailUrl(): JsonField<String> = thumbnailUrl

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
         * Returns a mutable builder for constructing an instance of [SocialMetadata].
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SocialMetadata]. */
    class Builder internal constructor() {

        private var mediaType: JsonField<MediaType>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var mediaTitle: JsonField<String> = JsonMissing.of()
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var mediaUrlString: JsonField<String> = JsonMissing.of()
        private var thumbnailUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(socialMetadata: SocialMetadata) = apply {
            mediaType = socialMetadata.mediaType
            id = socialMetadata.id
            description = socialMetadata.description
            mediaTitle = socialMetadata.mediaTitle
            mediaUrl = socialMetadata.mediaUrl
            mediaUrlString = socialMetadata.mediaUrlString
            thumbnailUrl = socialMetadata.thumbnailUrl
            additionalProperties = socialMetadata.additionalProperties.toMutableMap()
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

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun mediaTitle(mediaTitle: String) = mediaTitle(JsonField.of(mediaTitle))

        /**
         * Sets [Builder.mediaTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaTitle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaTitle(mediaTitle: JsonField<String>) = apply { this.mediaTitle = mediaTitle }

        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        fun mediaUrlString(mediaUrlString: String) = mediaUrlString(JsonField.of(mediaUrlString))

        /**
         * Sets [Builder.mediaUrlString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrlString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mediaUrlString(mediaUrlString: JsonField<String>) = apply {
            this.mediaUrlString = mediaUrlString
        }

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
         * Returns an immutable instance of [SocialMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SocialMetadata =
            SocialMetadata(
                checkRequired("mediaType", mediaType),
                id,
                description,
                mediaTitle,
                mediaUrl,
                mediaUrlString,
                thumbnailUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SocialMetadata = apply {
        if (validated) {
            return@apply
        }

        mediaType().validate()
        id()
        description()
        mediaTitle()
        mediaUrl()
        mediaUrlString()
        thumbnailUrl()
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
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (mediaTitle.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (mediaUrlString.asKnown().isPresent) 1 else 0) +
            (if (thumbnailUrl.asKnown().isPresent) 1 else 0)

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

            @JvmField val ARTICLE = of("ARTICLE")

            @JvmField val AUDIO = of("AUDIO")

            @JvmField val CAROUSEL = of("CAROUSEL")

            @JvmField val DOCUMENT = of("DOCUMENT")

            @JvmField val GIF = of("GIF")

            @JvmField val LINK = of("LINK")

            @JvmField val NONE = of("NONE")

            @JvmField val PHOTO = of("PHOTO")

            @JvmField val POLL = of("POLL")

            @JvmField val STORY = of("STORY")

            @JvmField val VIDEO = of("VIDEO")

            @JvmStatic fun of(value: String) = MediaType(JsonField.of(value))
        }

        /** An enum containing [MediaType]'s known values. */
        enum class Known {
            ARTICLE,
            AUDIO,
            CAROUSEL,
            DOCUMENT,
            GIF,
            LINK,
            NONE,
            PHOTO,
            POLL,
            STORY,
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
            ARTICLE,
            AUDIO,
            CAROUSEL,
            DOCUMENT,
            GIF,
            LINK,
            NONE,
            PHOTO,
            POLL,
            STORY,
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
                ARTICLE -> Value.ARTICLE
                AUDIO -> Value.AUDIO
                CAROUSEL -> Value.CAROUSEL
                DOCUMENT -> Value.DOCUMENT
                GIF -> Value.GIF
                LINK -> Value.LINK
                NONE -> Value.NONE
                PHOTO -> Value.PHOTO
                POLL -> Value.POLL
                STORY -> Value.STORY
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
                ARTICLE -> Known.ARTICLE
                AUDIO -> Known.AUDIO
                CAROUSEL -> Known.CAROUSEL
                DOCUMENT -> Known.DOCUMENT
                GIF -> Known.GIF
                LINK -> Known.LINK
                NONE -> Known.NONE
                PHOTO -> Known.PHOTO
                POLL -> Known.POLL
                STORY -> Known.STORY
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

        return other is SocialMetadata &&
            mediaType == other.mediaType &&
            id == other.id &&
            description == other.description &&
            mediaTitle == other.mediaTitle &&
            mediaUrl == other.mediaUrl &&
            mediaUrlString == other.mediaUrlString &&
            thumbnailUrl == other.thumbnailUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            mediaType,
            id,
            description,
            mediaTitle,
            mediaUrl,
            mediaUrlString,
            thumbnailUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SocialMetadata{mediaType=$mediaType, id=$id, description=$description, mediaTitle=$mediaTitle, mediaUrl=$mediaUrl, mediaUrlString=$mediaUrlString, thumbnailUrl=$thumbnailUrl, additionalProperties=$additionalProperties}"
}
