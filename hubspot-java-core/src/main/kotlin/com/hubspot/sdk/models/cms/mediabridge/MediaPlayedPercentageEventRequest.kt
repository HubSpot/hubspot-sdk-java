// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MediaPlayedPercentageEventRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mediaType: JsonField<MediaType>,
    private val occurredTimestamp: JsonField<Long>,
    private val playedPercent: JsonField<Int>,
    private val sessionId: JsonField<String>,
    private val _hsenc: JsonField<String>,
    private val contactId: JsonField<Long>,
    private val contactUtk: JsonField<String>,
    private val externalId: JsonField<String>,
    private val externalPlayContext: JsonField<ExternalPlayContext>,
    private val mediaBridgeId: JsonField<Long>,
    private val mediaName: JsonField<String>,
    private val mediaUrl: JsonField<String>,
    private val pageId: JsonField<Long>,
    private val pageName: JsonField<String>,
    private val pageUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mediaType")
        @ExcludeMissing
        mediaType: JsonField<MediaType> = JsonMissing.of(),
        @JsonProperty("occurredTimestamp")
        @ExcludeMissing
        occurredTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("playedPercent")
        @ExcludeMissing
        playedPercent: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sessionId") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("_hsenc") @ExcludeMissing _hsenc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contactId") @ExcludeMissing contactId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contactUtk")
        @ExcludeMissing
        contactUtk: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalPlayContext")
        @ExcludeMissing
        externalPlayContext: JsonField<ExternalPlayContext> = JsonMissing.of(),
        @JsonProperty("mediaBridgeId")
        @ExcludeMissing
        mediaBridgeId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mediaName") @ExcludeMissing mediaName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaUrl") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageId") @ExcludeMissing pageId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pageName") @ExcludeMissing pageName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageUrl") @ExcludeMissing pageUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        mediaType,
        occurredTimestamp,
        playedPercent,
        sessionId,
        _hsenc,
        contactId,
        contactUtk,
        externalId,
        externalPlayContext,
        mediaBridgeId,
        mediaName,
        mediaUrl,
        pageId,
        pageName,
        pageUrl,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaType(): MediaType = mediaType.getRequired("mediaType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredTimestamp(): Long = occurredTimestamp.getRequired("occurredTimestamp")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun playedPercent(): Int = playedPercent.getRequired("playedPercent")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("sessionId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun _hsenc(): Optional<String> = _hsenc.getOptional("_hsenc")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactId(): Optional<Long> = contactId.getOptional("contactId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactUtk(): Optional<String> = contactUtk.getOptional("contactUtk")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPlayContext(): Optional<ExternalPlayContext> =
        externalPlayContext.getOptional("externalPlayContext")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaBridgeId(): Optional<Long> = mediaBridgeId.getOptional("mediaBridgeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = mediaName.getOptional("mediaName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("mediaUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageId(): Optional<Long> = pageId.getOptional("pageId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageName(): Optional<String> = pageName.getOptional("pageName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageUrl(): Optional<String> = pageUrl.getOptional("pageUrl")

    /**
     * Returns the raw JSON value of [mediaType].
     *
     * Unlike [mediaType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaType") @ExcludeMissing fun _mediaType(): JsonField<MediaType> = mediaType

    /**
     * Returns the raw JSON value of [occurredTimestamp].
     *
     * Unlike [occurredTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("occurredTimestamp")
    @ExcludeMissing
    fun _occurredTimestamp(): JsonField<Long> = occurredTimestamp

    /**
     * Returns the raw JSON value of [playedPercent].
     *
     * Unlike [playedPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("playedPercent")
    @ExcludeMissing
    fun _playedPercent(): JsonField<Int> = playedPercent

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sessionId") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [_hsenc].
     *
     * Unlike [_hsenc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("_hsenc") @ExcludeMissing fun __hsenc(): JsonField<String> = _hsenc

    /**
     * Returns the raw JSON value of [contactId].
     *
     * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactId") @ExcludeMissing fun _contactId(): JsonField<Long> = contactId

    /**
     * Returns the raw JSON value of [contactUtk].
     *
     * Unlike [contactUtk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactUtk") @ExcludeMissing fun _contactUtk(): JsonField<String> = contactUtk

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [externalPlayContext].
     *
     * Unlike [externalPlayContext], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalPlayContext")
    @ExcludeMissing
    fun _externalPlayContext(): JsonField<ExternalPlayContext> = externalPlayContext

    /**
     * Returns the raw JSON value of [mediaBridgeId].
     *
     * Unlike [mediaBridgeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaBridgeId")
    @ExcludeMissing
    fun _mediaBridgeId(): JsonField<Long> = mediaBridgeId

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaName") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

    /**
     * Returns the raw JSON value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaUrl") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

    /**
     * Returns the raw JSON value of [pageId].
     *
     * Unlike [pageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageId") @ExcludeMissing fun _pageId(): JsonField<Long> = pageId

    /**
     * Returns the raw JSON value of [pageName].
     *
     * Unlike [pageName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageName") @ExcludeMissing fun _pageName(): JsonField<String> = pageName

    /**
     * Returns the raw JSON value of [pageUrl].
     *
     * Unlike [pageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageUrl") @ExcludeMissing fun _pageUrl(): JsonField<String> = pageUrl

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
         * Returns a mutable builder for constructing an instance of
         * [MediaPlayedPercentageEventRequest].
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * .occurredTimestamp()
         * .playedPercent()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaPlayedPercentageEventRequest]. */
    class Builder internal constructor() {

        private var mediaType: JsonField<MediaType>? = null
        private var occurredTimestamp: JsonField<Long>? = null
        private var playedPercent: JsonField<Int>? = null
        private var sessionId: JsonField<String>? = null
        private var _hsenc: JsonField<String> = JsonMissing.of()
        private var contactId: JsonField<Long> = JsonMissing.of()
        private var contactUtk: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var externalPlayContext: JsonField<ExternalPlayContext> = JsonMissing.of()
        private var mediaBridgeId: JsonField<Long> = JsonMissing.of()
        private var mediaName: JsonField<String> = JsonMissing.of()
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var pageId: JsonField<Long> = JsonMissing.of()
        private var pageName: JsonField<String> = JsonMissing.of()
        private var pageUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mediaPlayedPercentageEventRequest: MediaPlayedPercentageEventRequest) =
            apply {
                mediaType = mediaPlayedPercentageEventRequest.mediaType
                occurredTimestamp = mediaPlayedPercentageEventRequest.occurredTimestamp
                playedPercent = mediaPlayedPercentageEventRequest.playedPercent
                sessionId = mediaPlayedPercentageEventRequest.sessionId
                _hsenc = mediaPlayedPercentageEventRequest._hsenc
                contactId = mediaPlayedPercentageEventRequest.contactId
                contactUtk = mediaPlayedPercentageEventRequest.contactUtk
                externalId = mediaPlayedPercentageEventRequest.externalId
                externalPlayContext = mediaPlayedPercentageEventRequest.externalPlayContext
                mediaBridgeId = mediaPlayedPercentageEventRequest.mediaBridgeId
                mediaName = mediaPlayedPercentageEventRequest.mediaName
                mediaUrl = mediaPlayedPercentageEventRequest.mediaUrl
                pageId = mediaPlayedPercentageEventRequest.pageId
                pageName = mediaPlayedPercentageEventRequest.pageName
                pageUrl = mediaPlayedPercentageEventRequest.pageUrl
                additionalProperties =
                    mediaPlayedPercentageEventRequest.additionalProperties.toMutableMap()
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

        fun occurredTimestamp(occurredTimestamp: Long) =
            occurredTimestamp(JsonField.of(occurredTimestamp))

        /**
         * Sets [Builder.occurredTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurredTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occurredTimestamp(occurredTimestamp: JsonField<Long>) = apply {
            this.occurredTimestamp = occurredTimestamp
        }

        fun playedPercent(playedPercent: Int) = playedPercent(JsonField.of(playedPercent))

        /**
         * Sets [Builder.playedPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playedPercent] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun playedPercent(playedPercent: JsonField<Int>) = apply {
            this.playedPercent = playedPercent
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun _hsenc(_hsenc: String) = _hsenc(JsonField.of(_hsenc))

        /**
         * Sets [Builder._hsenc] to an arbitrary JSON value.
         *
         * You should usually call [Builder._hsenc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun _hsenc(_hsenc: JsonField<String>) = apply { this._hsenc = _hsenc }

        fun contactId(contactId: Long) = contactId(JsonField.of(contactId))

        /**
         * Sets [Builder.contactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contactId(contactId: JsonField<Long>) = apply { this.contactId = contactId }

        fun contactUtk(contactUtk: String) = contactUtk(JsonField.of(contactUtk))

        /**
         * Sets [Builder.contactUtk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactUtk] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactUtk(contactUtk: JsonField<String>) = apply { this.contactUtk = contactUtk }

        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        fun externalPlayContext(externalPlayContext: ExternalPlayContext) =
            externalPlayContext(JsonField.of(externalPlayContext))

        /**
         * Sets [Builder.externalPlayContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPlayContext] with a well-typed
         * [ExternalPlayContext] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun externalPlayContext(externalPlayContext: JsonField<ExternalPlayContext>) = apply {
            this.externalPlayContext = externalPlayContext
        }

        fun mediaBridgeId(mediaBridgeId: Long) = mediaBridgeId(JsonField.of(mediaBridgeId))

        /**
         * Sets [Builder.mediaBridgeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaBridgeId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaBridgeId(mediaBridgeId: JsonField<Long>) = apply {
            this.mediaBridgeId = mediaBridgeId
        }

        fun mediaName(mediaName: String) = mediaName(JsonField.of(mediaName))

        /**
         * Sets [Builder.mediaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        fun pageId(pageId: Long) = pageId(JsonField.of(pageId))

        /**
         * Sets [Builder.pageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageId(pageId: JsonField<Long>) = apply { this.pageId = pageId }

        fun pageName(pageName: String) = pageName(JsonField.of(pageName))

        /**
         * Sets [Builder.pageName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageName(pageName: JsonField<String>) = apply { this.pageName = pageName }

        fun pageUrl(pageUrl: String) = pageUrl(JsonField.of(pageUrl))

        /**
         * Sets [Builder.pageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageUrl(pageUrl: JsonField<String>) = apply { this.pageUrl = pageUrl }

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
         * Returns an immutable instance of [MediaPlayedPercentageEventRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * .occurredTimestamp()
         * .playedPercent()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MediaPlayedPercentageEventRequest =
            MediaPlayedPercentageEventRequest(
                checkRequired("mediaType", mediaType),
                checkRequired("occurredTimestamp", occurredTimestamp),
                checkRequired("playedPercent", playedPercent),
                checkRequired("sessionId", sessionId),
                _hsenc,
                contactId,
                contactUtk,
                externalId,
                externalPlayContext,
                mediaBridgeId,
                mediaName,
                mediaUrl,
                pageId,
                pageName,
                pageUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MediaPlayedPercentageEventRequest = apply {
        if (validated) {
            return@apply
        }

        mediaType().validate()
        occurredTimestamp()
        playedPercent()
        sessionId()
        _hsenc()
        contactId()
        contactUtk()
        externalId()
        externalPlayContext().ifPresent { it.validate() }
        mediaBridgeId()
        mediaName()
        mediaUrl()
        pageId()
        pageName()
        pageUrl()
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
        (mediaType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (occurredTimestamp.asKnown().isPresent) 1 else 0) +
            (if (playedPercent.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (_hsenc.asKnown().isPresent) 1 else 0) +
            (if (contactId.asKnown().isPresent) 1 else 0) +
            (if (contactUtk.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (externalPlayContext.asKnown().getOrNull()?.validity() ?: 0) +
            (if (mediaBridgeId.asKnown().isPresent) 1 else 0) +
            (if (mediaName.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (pageId.asKnown().isPresent) 1 else 0) +
            (if (pageName.asKnown().isPresent) 1 else 0) +
            (if (pageUrl.asKnown().isPresent) 1 else 0)

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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AUDIO -> Known.AUDIO
                DOCUMENT -> Known.DOCUMENT
                IMAGE -> Known.IMAGE
                OTHER -> Known.OTHER
                VIDEO -> Known.VIDEO
                else -> throw HubSpotInvalidDataException("Unknown MediaType: $value")
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

            return other is MediaType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExternalPlayContext
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

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val EXTERNAL_PAGE = of("EXTERNAL_PAGE")

            @JvmStatic fun of(value: String) = ExternalPlayContext(JsonField.of(value))
        }

        /** An enum containing [ExternalPlayContext]'s known values. */
        enum class Known {
            EMAIL,
            EXTERNAL_PAGE,
        }

        /**
         * An enum containing [ExternalPlayContext]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExternalPlayContext] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL,
            EXTERNAL_PAGE,
            /**
             * An enum member indicating that [ExternalPlayContext] was instantiated with an unknown
             * value.
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
                EMAIL -> Value.EMAIL
                EXTERNAL_PAGE -> Value.EXTERNAL_PAGE
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
                EMAIL -> Known.EMAIL
                EXTERNAL_PAGE -> Known.EXTERNAL_PAGE
                else -> throw HubSpotInvalidDataException("Unknown ExternalPlayContext: $value")
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

        fun validate(): ExternalPlayContext = apply {
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

            return other is ExternalPlayContext && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaPlayedPercentageEventRequest &&
            mediaType == other.mediaType &&
            occurredTimestamp == other.occurredTimestamp &&
            playedPercent == other.playedPercent &&
            sessionId == other.sessionId &&
            _hsenc == other._hsenc &&
            contactId == other.contactId &&
            contactUtk == other.contactUtk &&
            externalId == other.externalId &&
            externalPlayContext == other.externalPlayContext &&
            mediaBridgeId == other.mediaBridgeId &&
            mediaName == other.mediaName &&
            mediaUrl == other.mediaUrl &&
            pageId == other.pageId &&
            pageName == other.pageName &&
            pageUrl == other.pageUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            mediaType,
            occurredTimestamp,
            playedPercent,
            sessionId,
            _hsenc,
            contactId,
            contactUtk,
            externalId,
            externalPlayContext,
            mediaBridgeId,
            mediaName,
            mediaUrl,
            pageId,
            pageName,
            pageUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MediaPlayedPercentageEventRequest{mediaType=$mediaType, occurredTimestamp=$occurredTimestamp, playedPercent=$playedPercent, sessionId=$sessionId, _hsenc=$_hsenc, contactId=$contactId, contactUtk=$contactUtk, externalId=$externalId, externalPlayContext=$externalPlayContext, mediaBridgeId=$mediaBridgeId, mediaName=$mediaName, mediaUrl=$mediaUrl, pageId=$pageId, pageName=$pageName, pageUrl=$pageUrl, additionalProperties=$additionalProperties}"
}
