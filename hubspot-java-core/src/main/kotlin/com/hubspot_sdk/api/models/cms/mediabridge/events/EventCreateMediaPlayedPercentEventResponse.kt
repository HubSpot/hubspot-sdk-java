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

class EventCreateMediaPlayedPercentEventResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactId: JsonField<Long>,
    private val mediaBridgeId: JsonField<Long>,
    private val mediaBridgeObjectCoordinates: JsonField<String>,
    private val mediaBridgeObjectTypeId: JsonField<String>,
    private val mediaName: JsonField<String>,
    private val mediaType: JsonField<MediaType>,
    private val occurredTimestamp: JsonField<Long>,
    private val playedPercent: JsonField<Int>,
    private val portalId: JsonField<Int>,
    private val providerId: JsonField<Int>,
    private val sessionId: JsonField<String>,
    private val mediaUrl: JsonField<String>,
    private val pageId: JsonField<Long>,
    private val pageName: JsonField<String>,
    private val pageObjectCoordinates: JsonField<String>,
    private val pageUrl: JsonField<String>,
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
        @JsonProperty("playedPercent")
        @ExcludeMissing
        playedPercent: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("providerId") @ExcludeMissing providerId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sessionId") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaUrl") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageId") @ExcludeMissing pageId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pageName") @ExcludeMissing pageName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageObjectCoordinates")
        @ExcludeMissing
        pageObjectCoordinates: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageUrl") @ExcludeMissing pageUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        contactId,
        mediaBridgeId,
        mediaBridgeObjectCoordinates,
        mediaBridgeObjectTypeId,
        mediaName,
        mediaType,
        occurredTimestamp,
        playedPercent,
        portalId,
        providerId,
        sessionId,
        mediaUrl,
        pageId,
        pageName,
        pageObjectCoordinates,
        pageUrl,
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredTimestamp(): Long = occurredTimestamp.getRequired("occurredTimestamp")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun playedPercent(): Int = playedPercent.getRequired("playedPercent")

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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("mediaUrl")

    /**
     * The content ID of the page that an event happened on, for HubSpot pages. Required if the page
     * is a HubSpot page.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageId(): Optional<Long> = pageId.getOptional("pageId")

    /**
     * The name or title of the page that an event happened on. Required for non-HubSpot pages.
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
     * The URL of the page that an event happened on. Required for non-HubSpot pages.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageUrl(): Optional<String> = pageUrl.getOptional("pageUrl")

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
     * Returns the raw JSON value of [playedPercent].
     *
     * Unlike [playedPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("playedPercent")
    @ExcludeMissing
    fun _playedPercent(): JsonField<Int> = playedPercent

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
         * [EventCreateMediaPlayedPercentEventResponse].
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
         * .playedPercent()
         * .portalId()
         * .providerId()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventCreateMediaPlayedPercentEventResponse]. */
    class Builder internal constructor() {

        private var contactId: JsonField<Long>? = null
        private var mediaBridgeId: JsonField<Long>? = null
        private var mediaBridgeObjectCoordinates: JsonField<String>? = null
        private var mediaBridgeObjectTypeId: JsonField<String>? = null
        private var mediaName: JsonField<String>? = null
        private var mediaType: JsonField<MediaType>? = null
        private var occurredTimestamp: JsonField<Long>? = null
        private var playedPercent: JsonField<Int>? = null
        private var portalId: JsonField<Int>? = null
        private var providerId: JsonField<Int>? = null
        private var sessionId: JsonField<String>? = null
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var pageId: JsonField<Long> = JsonMissing.of()
        private var pageName: JsonField<String> = JsonMissing.of()
        private var pageObjectCoordinates: JsonField<String> = JsonMissing.of()
        private var pageUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            eventCreateMediaPlayedPercentEventResponse: EventCreateMediaPlayedPercentEventResponse
        ) = apply {
            contactId = eventCreateMediaPlayedPercentEventResponse.contactId
            mediaBridgeId = eventCreateMediaPlayedPercentEventResponse.mediaBridgeId
            mediaBridgeObjectCoordinates =
                eventCreateMediaPlayedPercentEventResponse.mediaBridgeObjectCoordinates
            mediaBridgeObjectTypeId =
                eventCreateMediaPlayedPercentEventResponse.mediaBridgeObjectTypeId
            mediaName = eventCreateMediaPlayedPercentEventResponse.mediaName
            mediaType = eventCreateMediaPlayedPercentEventResponse.mediaType
            occurredTimestamp = eventCreateMediaPlayedPercentEventResponse.occurredTimestamp
            playedPercent = eventCreateMediaPlayedPercentEventResponse.playedPercent
            portalId = eventCreateMediaPlayedPercentEventResponse.portalId
            providerId = eventCreateMediaPlayedPercentEventResponse.providerId
            sessionId = eventCreateMediaPlayedPercentEventResponse.sessionId
            mediaUrl = eventCreateMediaPlayedPercentEventResponse.mediaUrl
            pageId = eventCreateMediaPlayedPercentEventResponse.pageId
            pageName = eventCreateMediaPlayedPercentEventResponse.pageName
            pageObjectCoordinates = eventCreateMediaPlayedPercentEventResponse.pageObjectCoordinates
            pageUrl = eventCreateMediaPlayedPercentEventResponse.pageUrl
            additionalProperties =
                eventCreateMediaPlayedPercentEventResponse.additionalProperties.toMutableMap()
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

        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        /**
         * The content ID of the page that an event happened on, for HubSpot pages. Required if the
         * page is a HubSpot page.
         */
        fun pageId(pageId: Long) = pageId(JsonField.of(pageId))

        /**
         * Sets [Builder.pageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageId(pageId: JsonField<Long>) = apply { this.pageId = pageId }

        /**
         * The name or title of the page that an event happened on. Required for non-HubSpot pages.
         */
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

        /** The URL of the page that an event happened on. Required for non-HubSpot pages. */
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
         * Returns an immutable instance of [EventCreateMediaPlayedPercentEventResponse].
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
         * .playedPercent()
         * .portalId()
         * .providerId()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventCreateMediaPlayedPercentEventResponse =
            EventCreateMediaPlayedPercentEventResponse(
                checkRequired("contactId", contactId),
                checkRequired("mediaBridgeId", mediaBridgeId),
                checkRequired("mediaBridgeObjectCoordinates", mediaBridgeObjectCoordinates),
                checkRequired("mediaBridgeObjectTypeId", mediaBridgeObjectTypeId),
                checkRequired("mediaName", mediaName),
                checkRequired("mediaType", mediaType),
                checkRequired("occurredTimestamp", occurredTimestamp),
                checkRequired("playedPercent", playedPercent),
                checkRequired("portalId", portalId),
                checkRequired("providerId", providerId),
                checkRequired("sessionId", sessionId),
                mediaUrl,
                pageId,
                pageName,
                pageObjectCoordinates,
                pageUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EventCreateMediaPlayedPercentEventResponse = apply {
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
        playedPercent()
        portalId()
        providerId()
        sessionId()
        mediaUrl()
        pageId()
        pageName()
        pageObjectCoordinates()
        pageUrl()
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
            (if (playedPercent.asKnown().isPresent) 1 else 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (pageId.asKnown().isPresent) 1 else 0) +
            (if (pageName.asKnown().isPresent) 1 else 0) +
            (if (pageObjectCoordinates.asKnown().isPresent) 1 else 0) +
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

        return other is EventCreateMediaPlayedPercentEventResponse &&
            contactId == other.contactId &&
            mediaBridgeId == other.mediaBridgeId &&
            mediaBridgeObjectCoordinates == other.mediaBridgeObjectCoordinates &&
            mediaBridgeObjectTypeId == other.mediaBridgeObjectTypeId &&
            mediaName == other.mediaName &&
            mediaType == other.mediaType &&
            occurredTimestamp == other.occurredTimestamp &&
            playedPercent == other.playedPercent &&
            portalId == other.portalId &&
            providerId == other.providerId &&
            sessionId == other.sessionId &&
            mediaUrl == other.mediaUrl &&
            pageId == other.pageId &&
            pageName == other.pageName &&
            pageObjectCoordinates == other.pageObjectCoordinates &&
            pageUrl == other.pageUrl &&
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
            playedPercent,
            portalId,
            providerId,
            sessionId,
            mediaUrl,
            pageId,
            pageName,
            pageObjectCoordinates,
            pageUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventCreateMediaPlayedPercentEventResponse{contactId=$contactId, mediaBridgeId=$mediaBridgeId, mediaBridgeObjectCoordinates=$mediaBridgeObjectCoordinates, mediaBridgeObjectTypeId=$mediaBridgeObjectTypeId, mediaName=$mediaName, mediaType=$mediaType, occurredTimestamp=$occurredTimestamp, playedPercent=$playedPercent, portalId=$portalId, providerId=$providerId, sessionId=$sessionId, mediaUrl=$mediaUrl, pageId=$pageId, pageName=$pageName, pageObjectCoordinates=$pageObjectCoordinates, pageUrl=$pageUrl, additionalProperties=$additionalProperties}"
}
