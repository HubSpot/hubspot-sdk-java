// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

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

class EventCreateAttentionSpanEventResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactId: JsonField<Long>,
    private val mediaBridgeId: JsonField<Long>,
    private val mediaBridgeObjectCoordinates: JsonField<String>,
    private val mediaBridgeObjectTypeId: JsonField<String>,
    private val mediaName: JsonField<String>,
    private val mediaType: JsonField<MediaType>,
    private val occurredTimestamp: JsonField<Long>,
    private val percentRange: JsonField<String>,
    private val portalId: JsonField<Int>,
    private val providerId: JsonField<Int>,
    private val sessionId: JsonField<String>,
    private val totalPercentPlayed: JsonField<Double>,
    private val mediaUrl: JsonField<String>,
    private val pageId: JsonField<Long>,
    private val pageName: JsonField<String>,
    private val pageObjectCoordinates: JsonField<String>,
    private val pageUrl: JsonField<String>,
    private val rawData: JsonField<String>,
    private val totalSecondsPlayed: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contactId") @ExcludeMissing contactId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mediaBridgeId")
        @ExcludeMissing
        mediaBridgeId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mediaBridgeObjectCoordinates")
        @ExcludeMissing
        mediaBridgeObjectCoordinates: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaBridgeObjectTypeId")
        @ExcludeMissing
        mediaBridgeObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaName") @ExcludeMissing mediaName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaType")
        @ExcludeMissing
        mediaType: JsonField<MediaType> = JsonMissing.of(),
        @JsonProperty("occurredTimestamp")
        @ExcludeMissing
        occurredTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("percentRange")
        @ExcludeMissing
        percentRange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("providerId") @ExcludeMissing providerId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sessionId") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalPercentPlayed")
        @ExcludeMissing
        totalPercentPlayed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mediaUrl") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageId") @ExcludeMissing pageId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pageName") @ExcludeMissing pageName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageObjectCoordinates")
        @ExcludeMissing
        pageObjectCoordinates: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageUrl") @ExcludeMissing pageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rawData") @ExcludeMissing rawData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalSecondsPlayed")
        @ExcludeMissing
        totalSecondsPlayed: JsonField<Int> = JsonMissing.of(),
    ) : this(
        contactId,
        mediaBridgeId,
        mediaBridgeObjectCoordinates,
        mediaBridgeObjectTypeId,
        mediaName,
        mediaType,
        occurredTimestamp,
        percentRange,
        portalId,
        providerId,
        sessionId,
        totalPercentPlayed,
        mediaUrl,
        pageId,
        pageName,
        pageObjectCoordinates,
        pageUrl,
        rawData,
        totalSecondsPlayed,
        mutableMapOf(),
    )

    /**
     * The ID of the contact in HubSpot’s system that consumed the media. This can be fetched using
     * HubSpot's Get contact by usertoken (utk) API. The API also supports supplying a usertoken,
     * and will handle converting this into a contact ID automatically.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactId(): Long = contactId.getRequired("contactId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaBridgeId(): Long = mediaBridgeId.getRequired("mediaBridgeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaBridgeObjectCoordinates(): String =
        mediaBridgeObjectCoordinates.getRequired("mediaBridgeObjectCoordinates")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaBridgeObjectTypeId(): String =
        mediaBridgeObjectTypeId.getRequired("mediaBridgeObjectTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaName(): String = mediaName.getRequired("mediaName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaType(): MediaType = mediaType.getRequired("mediaType")

    /**
     * The timestamp at which this event occurred, in milliseconds since the epoch.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredTimestamp(): Long = occurredTimestamp.getRequired("occurredTimestamp")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentRange(): String = percentRange.getRequired("percentRange")

    /**
     * The ID of the HubSpot account.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Int = portalId.getRequired("portalId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): Int = providerId.getRequired("providerId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("sessionId")

    /**
     * The percent of the media that the user consumed. Providers may calculate this differently
     * depending on how they consider repeated views of the same portion of media. For this reason,
     * the API will not attempt to validate totalPercentWatched against the attention span
     * information for the event. If it is missing, HubSpot will calculate this from the attention
     * span map as follows: (number of spans with a value of 1 or more)/(Total number of spans).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPercentPlayed(): Double = totalPercentPlayed.getRequired("totalPercentPlayed")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("mediaUrl")

    /**
     * The ID of the page, if hosted on HubSpot. Required for HubSpot pages.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageId(): Optional<Long> = pageId.getOptional("pageId")

    /**
     * The name of the page. Required if the page is not hosted on HubSpot.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageName(): Optional<String> = pageName.getOptional("pageName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageObjectCoordinates(): Optional<String> =
        pageObjectCoordinates.getOptional("pageObjectCoordinates")

    /**
     * The URL of the page that an event happened on. Required if the page is not hosted on HubSpot.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageUrl(): Optional<String> = pageUrl.getOptional("pageUrl")

    /**
     * This is the raw data which provides the most granular data about spans of the media, and how
     * many times each span was consumed by the user. For example, for a 10 second video where each
     * second is a span, if a visitor watches the first 5 seconds of the video, then restarts the
     * video and watches the first 2 seconds again, the resulting `rawDataString` would be
     * `“0=2;1=2;2=1;3=1;4=1;5=0;6=0;7=0;8=0;9=0;”`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rawData(): Optional<String> = rawData.getOptional("rawData")

    /**
     * The seconds that a user spent consuming the media. The media bridge calculates this as
     * `totalPercentPlayed`*`mediaDuration`. If a provider would like this to be calculated
     * differently, they can provide the pre-calculated value when they create the event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSecondsPlayed(): Optional<Int> = totalSecondsPlayed.getOptional("totalSecondsPlayed")

    /**
     * Returns the raw JSON value of [contactId].
     *
     * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactId") @ExcludeMissing fun _contactId(): JsonField<Long> = contactId

    /**
     * Returns the raw JSON value of [mediaBridgeId].
     *
     * Unlike [mediaBridgeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaBridgeId")
    @ExcludeMissing
    fun _mediaBridgeId(): JsonField<Long> = mediaBridgeId

    /**
     * Returns the raw JSON value of [mediaBridgeObjectCoordinates].
     *
     * Unlike [mediaBridgeObjectCoordinates], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("mediaBridgeObjectCoordinates")
    @ExcludeMissing
    fun _mediaBridgeObjectCoordinates(): JsonField<String> = mediaBridgeObjectCoordinates

    /**
     * Returns the raw JSON value of [mediaBridgeObjectTypeId].
     *
     * Unlike [mediaBridgeObjectTypeId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("mediaBridgeObjectTypeId")
    @ExcludeMissing
    fun _mediaBridgeObjectTypeId(): JsonField<String> = mediaBridgeObjectTypeId

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaName") @ExcludeMissing fun _mediaName(): JsonField<String> = mediaName

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
     * Returns the raw JSON value of [percentRange].
     *
     * Unlike [percentRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percentRange")
    @ExcludeMissing
    fun _percentRange(): JsonField<String> = percentRange

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providerId") @ExcludeMissing fun _providerId(): JsonField<Int> = providerId

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sessionId") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [totalPercentPlayed].
     *
     * Unlike [totalPercentPlayed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalPercentPlayed")
    @ExcludeMissing
    fun _totalPercentPlayed(): JsonField<Double> = totalPercentPlayed

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
     * Returns the raw JSON value of [pageObjectCoordinates].
     *
     * Unlike [pageObjectCoordinates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pageObjectCoordinates")
    @ExcludeMissing
    fun _pageObjectCoordinates(): JsonField<String> = pageObjectCoordinates

    /**
     * Returns the raw JSON value of [pageUrl].
     *
     * Unlike [pageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageUrl") @ExcludeMissing fun _pageUrl(): JsonField<String> = pageUrl

    /**
     * Returns the raw JSON value of [rawData].
     *
     * Unlike [rawData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawData") @ExcludeMissing fun _rawData(): JsonField<String> = rawData

    /**
     * Returns the raw JSON value of [totalSecondsPlayed].
     *
     * Unlike [totalSecondsPlayed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalSecondsPlayed")
    @ExcludeMissing
    fun _totalSecondsPlayed(): JsonField<Int> = totalSecondsPlayed

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
         * [EventCreateAttentionSpanEventResponse].
         *
         * The following fields are required:
         * ```java
         * .contactId()
         * .mediaBridgeId()
         * .mediaBridgeObjectCoordinates()
         * .mediaBridgeObjectTypeId()
         * .mediaName()
         * .mediaType()
         * .occurredTimestamp()
         * .percentRange()
         * .portalId()
         * .providerId()
         * .sessionId()
         * .totalPercentPlayed()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventCreateAttentionSpanEventResponse]. */
    class Builder internal constructor() {

        private var contactId: JsonField<Long>? = null
        private var mediaBridgeId: JsonField<Long>? = null
        private var mediaBridgeObjectCoordinates: JsonField<String>? = null
        private var mediaBridgeObjectTypeId: JsonField<String>? = null
        private var mediaName: JsonField<String>? = null
        private var mediaType: JsonField<MediaType>? = null
        private var occurredTimestamp: JsonField<Long>? = null
        private var percentRange: JsonField<String>? = null
        private var portalId: JsonField<Int>? = null
        private var providerId: JsonField<Int>? = null
        private var sessionId: JsonField<String>? = null
        private var totalPercentPlayed: JsonField<Double>? = null
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var pageId: JsonField<Long> = JsonMissing.of()
        private var pageName: JsonField<String> = JsonMissing.of()
        private var pageObjectCoordinates: JsonField<String> = JsonMissing.of()
        private var pageUrl: JsonField<String> = JsonMissing.of()
        private var rawData: JsonField<String> = JsonMissing.of()
        private var totalSecondsPlayed: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            eventCreateAttentionSpanEventResponse: EventCreateAttentionSpanEventResponse
        ) = apply {
            contactId = eventCreateAttentionSpanEventResponse.contactId
            mediaBridgeId = eventCreateAttentionSpanEventResponse.mediaBridgeId
            mediaBridgeObjectCoordinates =
                eventCreateAttentionSpanEventResponse.mediaBridgeObjectCoordinates
            mediaBridgeObjectTypeId = eventCreateAttentionSpanEventResponse.mediaBridgeObjectTypeId
            mediaName = eventCreateAttentionSpanEventResponse.mediaName
            mediaType = eventCreateAttentionSpanEventResponse.mediaType
            occurredTimestamp = eventCreateAttentionSpanEventResponse.occurredTimestamp
            percentRange = eventCreateAttentionSpanEventResponse.percentRange
            portalId = eventCreateAttentionSpanEventResponse.portalId
            providerId = eventCreateAttentionSpanEventResponse.providerId
            sessionId = eventCreateAttentionSpanEventResponse.sessionId
            totalPercentPlayed = eventCreateAttentionSpanEventResponse.totalPercentPlayed
            mediaUrl = eventCreateAttentionSpanEventResponse.mediaUrl
            pageId = eventCreateAttentionSpanEventResponse.pageId
            pageName = eventCreateAttentionSpanEventResponse.pageName
            pageObjectCoordinates = eventCreateAttentionSpanEventResponse.pageObjectCoordinates
            pageUrl = eventCreateAttentionSpanEventResponse.pageUrl
            rawData = eventCreateAttentionSpanEventResponse.rawData
            totalSecondsPlayed = eventCreateAttentionSpanEventResponse.totalSecondsPlayed
            additionalProperties =
                eventCreateAttentionSpanEventResponse.additionalProperties.toMutableMap()
        }

        /**
         * The ID of the contact in HubSpot’s system that consumed the media. This can be fetched
         * using HubSpot's Get contact by usertoken (utk) API. The API also supports supplying a
         * usertoken, and will handle converting this into a contact ID automatically.
         */
        fun contactId(contactId: Long) = contactId(JsonField.of(contactId))

        /**
         * Sets [Builder.contactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contactId(contactId: JsonField<Long>) = apply { this.contactId = contactId }

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

        fun mediaBridgeObjectCoordinates(mediaBridgeObjectCoordinates: String) =
            mediaBridgeObjectCoordinates(JsonField.of(mediaBridgeObjectCoordinates))

        /**
         * Sets [Builder.mediaBridgeObjectCoordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaBridgeObjectCoordinates] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mediaBridgeObjectCoordinates(mediaBridgeObjectCoordinates: JsonField<String>) = apply {
            this.mediaBridgeObjectCoordinates = mediaBridgeObjectCoordinates
        }

        fun mediaBridgeObjectTypeId(mediaBridgeObjectTypeId: String) =
            mediaBridgeObjectTypeId(JsonField.of(mediaBridgeObjectTypeId))

        /**
         * Sets [Builder.mediaBridgeObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaBridgeObjectTypeId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mediaBridgeObjectTypeId(mediaBridgeObjectTypeId: JsonField<String>) = apply {
            this.mediaBridgeObjectTypeId = mediaBridgeObjectTypeId
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

        fun mediaType(mediaType: MediaType) = mediaType(JsonField.of(mediaType))

        /**
         * Sets [Builder.mediaType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaType] with a well-typed [MediaType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaType(mediaType: JsonField<MediaType>) = apply { this.mediaType = mediaType }

        /** The timestamp at which this event occurred, in milliseconds since the epoch. */
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

        fun percentRange(percentRange: String) = percentRange(JsonField.of(percentRange))

        /**
         * Sets [Builder.percentRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentRange] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentRange(percentRange: JsonField<String>) = apply {
            this.percentRange = percentRange
        }

        /** The ID of the HubSpot account. */
        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

        fun providerId(providerId: Int) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun providerId(providerId: JsonField<Int>) = apply { this.providerId = providerId }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /**
         * The percent of the media that the user consumed. Providers may calculate this differently
         * depending on how they consider repeated views of the same portion of media. For this
         * reason, the API will not attempt to validate totalPercentWatched against the attention
         * span information for the event. If it is missing, HubSpot will calculate this from the
         * attention span map as follows: (number of spans with a value of 1 or more)/(Total number
         * of spans).
         */
        fun totalPercentPlayed(totalPercentPlayed: Double) =
            totalPercentPlayed(JsonField.of(totalPercentPlayed))

        /**
         * Sets [Builder.totalPercentPlayed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPercentPlayed] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalPercentPlayed(totalPercentPlayed: JsonField<Double>) = apply {
            this.totalPercentPlayed = totalPercentPlayed
        }

        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        /** The ID of the page, if hosted on HubSpot. Required for HubSpot pages. */
        fun pageId(pageId: Long) = pageId(JsonField.of(pageId))

        /**
         * Sets [Builder.pageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageId(pageId: JsonField<Long>) = apply { this.pageId = pageId }

        /** The name of the page. Required if the page is not hosted on HubSpot. */
        fun pageName(pageName: String) = pageName(JsonField.of(pageName))

        /**
         * Sets [Builder.pageName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageName(pageName: JsonField<String>) = apply { this.pageName = pageName }

        fun pageObjectCoordinates(pageObjectCoordinates: String) =
            pageObjectCoordinates(JsonField.of(pageObjectCoordinates))

        /**
         * Sets [Builder.pageObjectCoordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageObjectCoordinates] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pageObjectCoordinates(pageObjectCoordinates: JsonField<String>) = apply {
            this.pageObjectCoordinates = pageObjectCoordinates
        }

        /**
         * The URL of the page that an event happened on. Required if the page is not hosted on
         * HubSpot.
         */
        fun pageUrl(pageUrl: String) = pageUrl(JsonField.of(pageUrl))

        /**
         * Sets [Builder.pageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageUrl(pageUrl: JsonField<String>) = apply { this.pageUrl = pageUrl }

        /**
         * This is the raw data which provides the most granular data about spans of the media, and
         * how many times each span was consumed by the user. For example, for a 10 second video
         * where each second is a span, if a visitor watches the first 5 seconds of the video, then
         * restarts the video and watches the first 2 seconds again, the resulting `rawDataString`
         * would be `“0=2;1=2;2=1;3=1;4=1;5=0;6=0;7=0;8=0;9=0;”`.
         */
        fun rawData(rawData: String) = rawData(JsonField.of(rawData))

        /**
         * Sets [Builder.rawData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawData] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rawData(rawData: JsonField<String>) = apply { this.rawData = rawData }

        /**
         * The seconds that a user spent consuming the media. The media bridge calculates this as
         * `totalPercentPlayed`*`mediaDuration`. If a provider would like this to be calculated
         * differently, they can provide the pre-calculated value when they create the event.
         */
        fun totalSecondsPlayed(totalSecondsPlayed: Int) =
            totalSecondsPlayed(JsonField.of(totalSecondsPlayed))

        /**
         * Sets [Builder.totalSecondsPlayed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSecondsPlayed] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalSecondsPlayed(totalSecondsPlayed: JsonField<Int>) = apply {
            this.totalSecondsPlayed = totalSecondsPlayed
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
         * Returns an immutable instance of [EventCreateAttentionSpanEventResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contactId()
         * .mediaBridgeId()
         * .mediaBridgeObjectCoordinates()
         * .mediaBridgeObjectTypeId()
         * .mediaName()
         * .mediaType()
         * .occurredTimestamp()
         * .percentRange()
         * .portalId()
         * .providerId()
         * .sessionId()
         * .totalPercentPlayed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventCreateAttentionSpanEventResponse =
            EventCreateAttentionSpanEventResponse(
                checkRequired("contactId", contactId),
                checkRequired("mediaBridgeId", mediaBridgeId),
                checkRequired("mediaBridgeObjectCoordinates", mediaBridgeObjectCoordinates),
                checkRequired("mediaBridgeObjectTypeId", mediaBridgeObjectTypeId),
                checkRequired("mediaName", mediaName),
                checkRequired("mediaType", mediaType),
                checkRequired("occurredTimestamp", occurredTimestamp),
                checkRequired("percentRange", percentRange),
                checkRequired("portalId", portalId),
                checkRequired("providerId", providerId),
                checkRequired("sessionId", sessionId),
                checkRequired("totalPercentPlayed", totalPercentPlayed),
                mediaUrl,
                pageId,
                pageName,
                pageObjectCoordinates,
                pageUrl,
                rawData,
                totalSecondsPlayed,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventCreateAttentionSpanEventResponse = apply {
        if (validated) {
            return@apply
        }

        contactId()
        mediaBridgeId()
        mediaBridgeObjectCoordinates()
        mediaBridgeObjectTypeId()
        mediaName()
        mediaType().validate()
        occurredTimestamp()
        percentRange()
        portalId()
        providerId()
        sessionId()
        totalPercentPlayed()
        mediaUrl()
        pageId()
        pageName()
        pageObjectCoordinates()
        pageUrl()
        rawData()
        totalSecondsPlayed()
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
        (if (contactId.asKnown().isPresent) 1 else 0) +
            (if (mediaBridgeId.asKnown().isPresent) 1 else 0) +
            (if (mediaBridgeObjectCoordinates.asKnown().isPresent) 1 else 0) +
            (if (mediaBridgeObjectTypeId.asKnown().isPresent) 1 else 0) +
            (if (mediaName.asKnown().isPresent) 1 else 0) +
            (mediaType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (occurredTimestamp.asKnown().isPresent) 1 else 0) +
            (if (percentRange.asKnown().isPresent) 1 else 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (totalPercentPlayed.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (pageId.asKnown().isPresent) 1 else 0) +
            (if (pageName.asKnown().isPresent) 1 else 0) +
            (if (pageObjectCoordinates.asKnown().isPresent) 1 else 0) +
            (if (pageUrl.asKnown().isPresent) 1 else 0) +
            (if (rawData.asKnown().isPresent) 1 else 0) +
            (if (totalSecondsPlayed.asKnown().isPresent) 1 else 0)

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

            @JvmField val AUDIO = of("AUDIO")

            @JvmField val DOCUMENT = of("DOCUMENT")

            @JvmField val OTHER = of("OTHER")

            @JvmField val IMAGE = of("IMAGE")

            @JvmStatic fun of(value: String) = MediaType(JsonField.of(value))
        }

        /** An enum containing [MediaType]'s known values. */
        enum class Known {
            VIDEO,
            AUDIO,
            DOCUMENT,
            OTHER,
            IMAGE,
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
            AUDIO,
            DOCUMENT,
            OTHER,
            IMAGE,
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
                AUDIO -> Value.AUDIO
                DOCUMENT -> Value.DOCUMENT
                OTHER -> Value.OTHER
                IMAGE -> Value.IMAGE
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
                AUDIO -> Known.AUDIO
                DOCUMENT -> Known.DOCUMENT
                OTHER -> Known.OTHER
                IMAGE -> Known.IMAGE
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

        return other is EventCreateAttentionSpanEventResponse &&
            contactId == other.contactId &&
            mediaBridgeId == other.mediaBridgeId &&
            mediaBridgeObjectCoordinates == other.mediaBridgeObjectCoordinates &&
            mediaBridgeObjectTypeId == other.mediaBridgeObjectTypeId &&
            mediaName == other.mediaName &&
            mediaType == other.mediaType &&
            occurredTimestamp == other.occurredTimestamp &&
            percentRange == other.percentRange &&
            portalId == other.portalId &&
            providerId == other.providerId &&
            sessionId == other.sessionId &&
            totalPercentPlayed == other.totalPercentPlayed &&
            mediaUrl == other.mediaUrl &&
            pageId == other.pageId &&
            pageName == other.pageName &&
            pageObjectCoordinates == other.pageObjectCoordinates &&
            pageUrl == other.pageUrl &&
            rawData == other.rawData &&
            totalSecondsPlayed == other.totalSecondsPlayed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contactId,
            mediaBridgeId,
            mediaBridgeObjectCoordinates,
            mediaBridgeObjectTypeId,
            mediaName,
            mediaType,
            occurredTimestamp,
            percentRange,
            portalId,
            providerId,
            sessionId,
            totalPercentPlayed,
            mediaUrl,
            pageId,
            pageName,
            pageObjectCoordinates,
            pageUrl,
            rawData,
            totalSecondsPlayed,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventCreateAttentionSpanEventResponse{contactId=$contactId, mediaBridgeId=$mediaBridgeId, mediaBridgeObjectCoordinates=$mediaBridgeObjectCoordinates, mediaBridgeObjectTypeId=$mediaBridgeObjectTypeId, mediaName=$mediaName, mediaType=$mediaType, occurredTimestamp=$occurredTimestamp, percentRange=$percentRange, portalId=$portalId, providerId=$providerId, sessionId=$sessionId, totalPercentPlayed=$totalPercentPlayed, mediaUrl=$mediaUrl, pageId=$pageId, pageName=$pageName, pageObjectCoordinates=$pageObjectCoordinates, pageUrl=$pageUrl, rawData=$rawData, totalSecondsPlayed=$totalSecondsPlayed, additionalProperties=$additionalProperties}"
}
