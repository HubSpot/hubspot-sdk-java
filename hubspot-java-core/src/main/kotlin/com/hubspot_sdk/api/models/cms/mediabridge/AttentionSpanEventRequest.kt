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
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AttentionSpanEventRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mediaType: JsonField<MediaType>,
    private val occurredTimestamp: JsonField<Long>,
    private val rawDataMap: JsonField<RawDataMap>,
    private val sessionId: JsonField<String>,
    private val _hsenc: JsonField<String>,
    private val contactId: JsonField<Long>,
    private val contactUtk: JsonField<String>,
    private val derivedValues: JsonField<AttentionSpanCalculatedValues>,
    private val externalId: JsonField<String>,
    private val mediaBridgeId: JsonField<Long>,
    private val mediaName: JsonField<String>,
    private val mediaUrl: JsonField<String>,
    private val pageId: JsonField<Long>,
    private val pageName: JsonField<String>,
    private val pageUrl: JsonField<String>,
    private val rawDataString: JsonField<String>,
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
        @JsonProperty("rawDataMap")
        @ExcludeMissing
        rawDataMap: JsonField<RawDataMap> = JsonMissing.of(),
        @JsonProperty("sessionId") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("_hsenc") @ExcludeMissing _hsenc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contactId") @ExcludeMissing contactId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contactUtk")
        @ExcludeMissing
        contactUtk: JsonField<String> = JsonMissing.of(),
        @JsonProperty("derivedValues")
        @ExcludeMissing
        derivedValues: JsonField<AttentionSpanCalculatedValues> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaBridgeId")
        @ExcludeMissing
        mediaBridgeId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mediaName") @ExcludeMissing mediaName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaUrl") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageId") @ExcludeMissing pageId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pageName") @ExcludeMissing pageName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageUrl") @ExcludeMissing pageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rawDataString")
        @ExcludeMissing
        rawDataString: JsonField<String> = JsonMissing.of(),
    ) : this(
        mediaType,
        occurredTimestamp,
        rawDataMap,
        sessionId,
        _hsenc,
        contactId,
        contactUtk,
        derivedValues,
        externalId,
        mediaBridgeId,
        mediaName,
        mediaUrl,
        pageId,
        pageName,
        pageUrl,
        rawDataString,
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
    fun occurredTimestamp(): Long = occurredTimestamp.getRequired("occurredTimestamp")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rawDataMap(): RawDataMap = rawDataMap.getRequired("rawDataMap")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("sessionId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun _hsenc(): Optional<String> = _hsenc.getOptional("_hsenc")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactId(): Optional<Long> = contactId.getOptional("contactId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactUtk(): Optional<String> = contactUtk.getOptional("contactUtk")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun derivedValues(): Optional<AttentionSpanCalculatedValues> =
        derivedValues.getOptional("derivedValues")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaBridgeId(): Optional<Long> = mediaBridgeId.getOptional("mediaBridgeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = mediaName.getOptional("mediaName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("mediaUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageId(): Optional<Long> = pageId.getOptional("pageId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageName(): Optional<String> = pageName.getOptional("pageName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageUrl(): Optional<String> = pageUrl.getOptional("pageUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rawDataString(): Optional<String> = rawDataString.getOptional("rawDataString")

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
     * Returns the raw JSON value of [rawDataMap].
     *
     * Unlike [rawDataMap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawDataMap")
    @ExcludeMissing
    fun _rawDataMap(): JsonField<RawDataMap> = rawDataMap

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
     * Returns the raw JSON value of [derivedValues].
     *
     * Unlike [derivedValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("derivedValues")
    @ExcludeMissing
    fun _derivedValues(): JsonField<AttentionSpanCalculatedValues> = derivedValues

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

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

    /**
     * Returns the raw JSON value of [rawDataString].
     *
     * Unlike [rawDataString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawDataString")
    @ExcludeMissing
    fun _rawDataString(): JsonField<String> = rawDataString

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
         * Returns a mutable builder for constructing an instance of [AttentionSpanEventRequest].
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * .occurredTimestamp()
         * .rawDataMap()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttentionSpanEventRequest]. */
    class Builder internal constructor() {

        private var mediaType: JsonField<MediaType>? = null
        private var occurredTimestamp: JsonField<Long>? = null
        private var rawDataMap: JsonField<RawDataMap>? = null
        private var sessionId: JsonField<String>? = null
        private var _hsenc: JsonField<String> = JsonMissing.of()
        private var contactId: JsonField<Long> = JsonMissing.of()
        private var contactUtk: JsonField<String> = JsonMissing.of()
        private var derivedValues: JsonField<AttentionSpanCalculatedValues> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var mediaBridgeId: JsonField<Long> = JsonMissing.of()
        private var mediaName: JsonField<String> = JsonMissing.of()
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var pageId: JsonField<Long> = JsonMissing.of()
        private var pageName: JsonField<String> = JsonMissing.of()
        private var pageUrl: JsonField<String> = JsonMissing.of()
        private var rawDataString: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attentionSpanEventRequest: AttentionSpanEventRequest) = apply {
            mediaType = attentionSpanEventRequest.mediaType
            occurredTimestamp = attentionSpanEventRequest.occurredTimestamp
            rawDataMap = attentionSpanEventRequest.rawDataMap
            sessionId = attentionSpanEventRequest.sessionId
            _hsenc = attentionSpanEventRequest._hsenc
            contactId = attentionSpanEventRequest.contactId
            contactUtk = attentionSpanEventRequest.contactUtk
            derivedValues = attentionSpanEventRequest.derivedValues
            externalId = attentionSpanEventRequest.externalId
            mediaBridgeId = attentionSpanEventRequest.mediaBridgeId
            mediaName = attentionSpanEventRequest.mediaName
            mediaUrl = attentionSpanEventRequest.mediaUrl
            pageId = attentionSpanEventRequest.pageId
            pageName = attentionSpanEventRequest.pageName
            pageUrl = attentionSpanEventRequest.pageUrl
            rawDataString = attentionSpanEventRequest.rawDataString
            additionalProperties = attentionSpanEventRequest.additionalProperties.toMutableMap()
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

        fun rawDataMap(rawDataMap: RawDataMap) = rawDataMap(JsonField.of(rawDataMap))

        /**
         * Sets [Builder.rawDataMap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawDataMap] with a well-typed [RawDataMap] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rawDataMap(rawDataMap: JsonField<RawDataMap>) = apply { this.rawDataMap = rawDataMap }

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

        fun derivedValues(derivedValues: AttentionSpanCalculatedValues) =
            derivedValues(JsonField.of(derivedValues))

        /**
         * Sets [Builder.derivedValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derivedValues] with a well-typed
         * [AttentionSpanCalculatedValues] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun derivedValues(derivedValues: JsonField<AttentionSpanCalculatedValues>) = apply {
            this.derivedValues = derivedValues
        }

        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

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

        fun rawDataString(rawDataString: String) = rawDataString(JsonField.of(rawDataString))

        /**
         * Sets [Builder.rawDataString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawDataString] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rawDataString(rawDataString: JsonField<String>) = apply {
            this.rawDataString = rawDataString
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
         * Returns an immutable instance of [AttentionSpanEventRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mediaType()
         * .occurredTimestamp()
         * .rawDataMap()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttentionSpanEventRequest =
            AttentionSpanEventRequest(
                checkRequired("mediaType", mediaType),
                checkRequired("occurredTimestamp", occurredTimestamp),
                checkRequired("rawDataMap", rawDataMap),
                checkRequired("sessionId", sessionId),
                _hsenc,
                contactId,
                contactUtk,
                derivedValues,
                externalId,
                mediaBridgeId,
                mediaName,
                mediaUrl,
                pageId,
                pageName,
                pageUrl,
                rawDataString,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttentionSpanEventRequest = apply {
        if (validated) {
            return@apply
        }

        mediaType().validate()
        occurredTimestamp()
        rawDataMap().validate()
        sessionId()
        _hsenc()
        contactId()
        contactUtk()
        derivedValues().ifPresent { it.validate() }
        externalId()
        mediaBridgeId()
        mediaName()
        mediaUrl()
        pageId()
        pageName()
        pageUrl()
        rawDataString()
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
            (if (occurredTimestamp.asKnown().isPresent) 1 else 0) +
            (rawDataMap.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (_hsenc.asKnown().isPresent) 1 else 0) +
            (if (contactId.asKnown().isPresent) 1 else 0) +
            (if (contactUtk.asKnown().isPresent) 1 else 0) +
            (derivedValues.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (mediaBridgeId.asKnown().isPresent) 1 else 0) +
            (if (mediaName.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (pageId.asKnown().isPresent) 1 else 0) +
            (if (pageName.asKnown().isPresent) 1 else 0) +
            (if (pageUrl.asKnown().isPresent) 1 else 0) +
            (if (rawDataString.asKnown().isPresent) 1 else 0)

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

    class RawDataMap
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [RawDataMap]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RawDataMap]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rawDataMap: RawDataMap) = apply {
                additionalProperties = rawDataMap.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RawDataMap].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RawDataMap = RawDataMap(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): RawDataMap = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RawDataMap && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RawDataMap{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttentionSpanEventRequest &&
            mediaType == other.mediaType &&
            occurredTimestamp == other.occurredTimestamp &&
            rawDataMap == other.rawDataMap &&
            sessionId == other.sessionId &&
            _hsenc == other._hsenc &&
            contactId == other.contactId &&
            contactUtk == other.contactUtk &&
            derivedValues == other.derivedValues &&
            externalId == other.externalId &&
            mediaBridgeId == other.mediaBridgeId &&
            mediaName == other.mediaName &&
            mediaUrl == other.mediaUrl &&
            pageId == other.pageId &&
            pageName == other.pageName &&
            pageUrl == other.pageUrl &&
            rawDataString == other.rawDataString &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            mediaType,
            occurredTimestamp,
            rawDataMap,
            sessionId,
            _hsenc,
            contactId,
            contactUtk,
            derivedValues,
            externalId,
            mediaBridgeId,
            mediaName,
            mediaUrl,
            pageId,
            pageName,
            pageUrl,
            rawDataString,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttentionSpanEventRequest{mediaType=$mediaType, occurredTimestamp=$occurredTimestamp, rawDataMap=$rawDataMap, sessionId=$sessionId, _hsenc=$_hsenc, contactId=$contactId, contactUtk=$contactUtk, derivedValues=$derivedValues, externalId=$externalId, mediaBridgeId=$mediaBridgeId, mediaName=$mediaName, mediaUrl=$mediaUrl, pageId=$pageId, pageName=$pageName, pageUrl=$pageUrl, rawDataString=$rawDataString, additionalProperties=$additionalProperties}"
}
