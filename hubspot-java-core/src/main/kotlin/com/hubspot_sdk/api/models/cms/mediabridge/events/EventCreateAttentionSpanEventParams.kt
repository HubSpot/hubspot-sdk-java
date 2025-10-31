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
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an event containing the viewers attention span details for the media. */
class EventCreateAttentionSpanEventParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaType(): MediaType = body.mediaType()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredTimestamp(): Long = body.occurredTimestamp()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rawDataMap(): RawDataMap = body.rawDataMap()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = body.sessionId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun _hsenc(): Optional<String> = body._hsenc()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactId(): Optional<Long> = body.contactId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactUtk(): Optional<String> = body.contactUtk()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun derivedValues(): Optional<DerivedValues> = body.derivedValues()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = body.externalId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaBridgeId(): Optional<Long> = body.mediaBridgeId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = body.mediaUrl()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageId(): Optional<Long> = body.pageId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageName(): Optional<String> = body.pageName()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageUrl(): Optional<String> = body.pageUrl()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rawDataString(): Optional<String> = body.rawDataString()

    /**
     * Returns the raw JSON value of [mediaType].
     *
     * Unlike [mediaType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaType(): JsonField<MediaType> = body._mediaType()

    /**
     * Returns the raw JSON value of [occurredTimestamp].
     *
     * Unlike [occurredTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _occurredTimestamp(): JsonField<Long> = body._occurredTimestamp()

    /**
     * Returns the raw JSON value of [rawDataMap].
     *
     * Unlike [rawDataMap], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rawDataMap(): JsonField<RawDataMap> = body._rawDataMap()

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sessionId(): JsonField<String> = body._sessionId()

    /**
     * Returns the raw JSON value of [_hsenc].
     *
     * Unlike [_hsenc], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun __hsenc(): JsonField<String> = body.__hsenc()

    /**
     * Returns the raw JSON value of [contactId].
     *
     * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactId(): JsonField<Long> = body._contactId()

    /**
     * Returns the raw JSON value of [contactUtk].
     *
     * Unlike [contactUtk], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactUtk(): JsonField<String> = body._contactUtk()

    /**
     * Returns the raw JSON value of [derivedValues].
     *
     * Unlike [derivedValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _derivedValues(): JsonField<DerivedValues> = body._derivedValues()

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Returns the raw JSON value of [mediaBridgeId].
     *
     * Unlike [mediaBridgeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaBridgeId(): JsonField<Long> = body._mediaBridgeId()

    /**
     * Returns the raw JSON value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaName(): JsonField<String> = body._mediaName()

    /**
     * Returns the raw JSON value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaUrl(): JsonField<String> = body._mediaUrl()

    /**
     * Returns the raw JSON value of [pageId].
     *
     * Unlike [pageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageId(): JsonField<Long> = body._pageId()

    /**
     * Returns the raw JSON value of [pageName].
     *
     * Unlike [pageName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageName(): JsonField<String> = body._pageName()

    /**
     * Returns the raw JSON value of [pageUrl].
     *
     * Unlike [pageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageUrl(): JsonField<String> = body._pageUrl()

    /**
     * Returns the raw JSON value of [rawDataString].
     *
     * Unlike [rawDataString], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rawDataString(): JsonField<String> = body._rawDataString()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventCreateAttentionSpanEventParams].
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

    /** A builder for [EventCreateAttentionSpanEventParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            eventCreateAttentionSpanEventParams: EventCreateAttentionSpanEventParams
        ) = apply {
            body = eventCreateAttentionSpanEventParams.body.toBuilder()
            additionalHeaders = eventCreateAttentionSpanEventParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                eventCreateAttentionSpanEventParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [mediaType]
         * - [occurredTimestamp]
         * - [rawDataMap]
         * - [sessionId]
         * - [_hsenc]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun mediaType(mediaType: MediaType) = apply { body.mediaType(mediaType) }

        /**
         * Sets [Builder.mediaType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaType] with a well-typed [MediaType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaType(mediaType: JsonField<MediaType>) = apply { body.mediaType(mediaType) }

        fun occurredTimestamp(occurredTimestamp: Long) = apply {
            body.occurredTimestamp(occurredTimestamp)
        }

        /**
         * Sets [Builder.occurredTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurredTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occurredTimestamp(occurredTimestamp: JsonField<Long>) = apply {
            body.occurredTimestamp(occurredTimestamp)
        }

        fun rawDataMap(rawDataMap: RawDataMap) = apply { body.rawDataMap(rawDataMap) }

        /**
         * Sets [Builder.rawDataMap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawDataMap] with a well-typed [RawDataMap] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rawDataMap(rawDataMap: JsonField<RawDataMap>) = apply { body.rawDataMap(rawDataMap) }

        fun sessionId(sessionId: String) = apply { body.sessionId(sessionId) }

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { body.sessionId(sessionId) }

        fun _hsenc(_hsenc: String) = apply { body._hsenc(_hsenc) }

        /**
         * Sets [Builder._hsenc] to an arbitrary JSON value.
         *
         * You should usually call [Builder._hsenc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun _hsenc(_hsenc: JsonField<String>) = apply { body._hsenc(_hsenc) }

        fun contactId(contactId: Long) = apply { body.contactId(contactId) }

        /**
         * Sets [Builder.contactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contactId(contactId: JsonField<Long>) = apply { body.contactId(contactId) }

        fun contactUtk(contactUtk: String) = apply { body.contactUtk(contactUtk) }

        /**
         * Sets [Builder.contactUtk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactUtk] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactUtk(contactUtk: JsonField<String>) = apply { body.contactUtk(contactUtk) }

        fun derivedValues(derivedValues: DerivedValues) = apply {
            body.derivedValues(derivedValues)
        }

        /**
         * Sets [Builder.derivedValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derivedValues] with a well-typed [DerivedValues] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun derivedValues(derivedValues: JsonField<DerivedValues>) = apply {
            body.derivedValues(derivedValues)
        }

        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        fun mediaBridgeId(mediaBridgeId: Long) = apply { body.mediaBridgeId(mediaBridgeId) }

        /**
         * Sets [Builder.mediaBridgeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaBridgeId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaBridgeId(mediaBridgeId: JsonField<Long>) = apply {
            body.mediaBridgeId(mediaBridgeId)
        }

        fun mediaName(mediaName: String) = apply { body.mediaName(mediaName) }

        /**
         * Sets [Builder.mediaName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaName(mediaName: JsonField<String>) = apply { body.mediaName(mediaName) }

        fun mediaUrl(mediaUrl: String) = apply { body.mediaUrl(mediaUrl) }

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { body.mediaUrl(mediaUrl) }

        fun pageId(pageId: Long) = apply { body.pageId(pageId) }

        /**
         * Sets [Builder.pageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageId(pageId: JsonField<Long>) = apply { body.pageId(pageId) }

        fun pageName(pageName: String) = apply { body.pageName(pageName) }

        /**
         * Sets [Builder.pageName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageName(pageName: JsonField<String>) = apply { body.pageName(pageName) }

        fun pageUrl(pageUrl: String) = apply { body.pageUrl(pageUrl) }

        /**
         * Sets [Builder.pageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageUrl(pageUrl: JsonField<String>) = apply { body.pageUrl(pageUrl) }

        fun rawDataString(rawDataString: String) = apply { body.rawDataString(rawDataString) }

        /**
         * Sets [Builder.rawDataString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawDataString] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rawDataString(rawDataString: JsonField<String>) = apply {
            body.rawDataString(rawDataString)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EventCreateAttentionSpanEventParams].
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
        fun build(): EventCreateAttentionSpanEventParams =
            EventCreateAttentionSpanEventParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mediaType: JsonField<MediaType>,
        private val occurredTimestamp: JsonField<Long>,
        private val rawDataMap: JsonField<RawDataMap>,
        private val sessionId: JsonField<String>,
        private val _hsenc: JsonField<String>,
        private val contactId: JsonField<Long>,
        private val contactUtk: JsonField<String>,
        private val derivedValues: JsonField<DerivedValues>,
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
            @JsonProperty("sessionId")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("_hsenc") @ExcludeMissing _hsenc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contactId")
            @ExcludeMissing
            contactId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("contactUtk")
            @ExcludeMissing
            contactUtk: JsonField<String> = JsonMissing.of(),
            @JsonProperty("derivedValues")
            @ExcludeMissing
            derivedValues: JsonField<DerivedValues> = JsonMissing.of(),
            @JsonProperty("externalId")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mediaBridgeId")
            @ExcludeMissing
            mediaBridgeId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mediaName")
            @ExcludeMissing
            mediaName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mediaUrl")
            @ExcludeMissing
            mediaUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pageId") @ExcludeMissing pageId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pageName")
            @ExcludeMissing
            pageName: JsonField<String> = JsonMissing.of(),
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
        fun derivedValues(): Optional<DerivedValues> = derivedValues.getOptional("derivedValues")

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
        @JsonProperty("mediaType")
        @ExcludeMissing
        fun _mediaType(): JsonField<MediaType> = mediaType

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
        @JsonProperty("contactUtk")
        @ExcludeMissing
        fun _contactUtk(): JsonField<String> = contactUtk

        /**
         * Returns the raw JSON value of [derivedValues].
         *
         * Unlike [derivedValues], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("derivedValues")
        @ExcludeMissing
        fun _derivedValues(): JsonField<DerivedValues> = derivedValues

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [mediaBridgeId].
         *
         * Unlike [mediaBridgeId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [rawDataString], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Body].
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

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var mediaType: JsonField<MediaType>? = null
            private var occurredTimestamp: JsonField<Long>? = null
            private var rawDataMap: JsonField<RawDataMap>? = null
            private var sessionId: JsonField<String>? = null
            private var _hsenc: JsonField<String> = JsonMissing.of()
            private var contactId: JsonField<Long> = JsonMissing.of()
            private var contactUtk: JsonField<String> = JsonMissing.of()
            private var derivedValues: JsonField<DerivedValues> = JsonMissing.of()
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
            internal fun from(body: Body) = apply {
                mediaType = body.mediaType
                occurredTimestamp = body.occurredTimestamp
                rawDataMap = body.rawDataMap
                sessionId = body.sessionId
                _hsenc = body._hsenc
                contactId = body.contactId
                contactUtk = body.contactUtk
                derivedValues = body.derivedValues
                externalId = body.externalId
                mediaBridgeId = body.mediaBridgeId
                mediaName = body.mediaName
                mediaUrl = body.mediaUrl
                pageId = body.pageId
                pageName = body.pageName
                pageUrl = body.pageUrl
                rawDataString = body.rawDataString
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun mediaType(mediaType: MediaType) = mediaType(JsonField.of(mediaType))

            /**
             * Sets [Builder.mediaType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaType] with a well-typed [MediaType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun rawDataMap(rawDataMap: JsonField<RawDataMap>) = apply {
                this.rawDataMap = rawDataMap
            }

            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun _hsenc(_hsenc: String) = _hsenc(JsonField.of(_hsenc))

            /**
             * Sets [Builder._hsenc] to an arbitrary JSON value.
             *
             * You should usually call [Builder._hsenc] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun _hsenc(_hsenc: JsonField<String>) = apply { this._hsenc = _hsenc }

            fun contactId(contactId: Long) = contactId(JsonField.of(contactId))

            /**
             * Sets [Builder.contactId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactId(contactId: JsonField<Long>) = apply { this.contactId = contactId }

            fun contactUtk(contactUtk: String) = contactUtk(JsonField.of(contactUtk))

            /**
             * Sets [Builder.contactUtk] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactUtk] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactUtk(contactUtk: JsonField<String>) = apply { this.contactUtk = contactUtk }

            fun derivedValues(derivedValues: DerivedValues) =
                derivedValues(JsonField.of(derivedValues))

            /**
             * Sets [Builder.derivedValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.derivedValues] with a well-typed [DerivedValues]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun derivedValues(derivedValues: JsonField<DerivedValues>) = apply {
                this.derivedValues = derivedValues
            }

            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            fun mediaBridgeId(mediaBridgeId: Long) = mediaBridgeId(JsonField.of(mediaBridgeId))

            /**
             * Sets [Builder.mediaBridgeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaBridgeId] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaBridgeId(mediaBridgeId: JsonField<Long>) = apply {
                this.mediaBridgeId = mediaBridgeId
            }

            fun mediaName(mediaName: String) = mediaName(JsonField.of(mediaName))

            /**
             * Sets [Builder.mediaName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaName(mediaName: JsonField<String>) = apply { this.mediaName = mediaName }

            fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

            /**
             * Sets [Builder.mediaUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

            fun pageId(pageId: Long) = pageId(JsonField.of(pageId))

            /**
             * Sets [Builder.pageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageId] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pageId(pageId: JsonField<Long>) = apply { this.pageId = pageId }

            fun pageName(pageName: String) = pageName(JsonField.of(pageName))

            /**
             * Sets [Builder.pageName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageName(pageName: JsonField<String>) = apply { this.pageName = pageName }

            fun pageUrl(pageUrl: String) = pageUrl(JsonField.of(pageUrl))

            /**
             * Sets [Builder.pageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageUrl(pageUrl: JsonField<String>) = apply { this.pageUrl = pageUrl }

            fun rawDataString(rawDataString: String) = rawDataString(JsonField.of(rawDataString))

            /**
             * Sets [Builder.rawDataString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawDataString] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
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

        fun validate(): Body = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
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
            "Body{mediaType=$mediaType, occurredTimestamp=$occurredTimestamp, rawDataMap=$rawDataMap, sessionId=$sessionId, _hsenc=$_hsenc, contactId=$contactId, contactUtk=$contactUtk, derivedValues=$derivedValues, externalId=$externalId, mediaBridgeId=$mediaBridgeId, mediaName=$mediaName, mediaUrl=$mediaUrl, pageId=$pageId, pageName=$pageName, pageUrl=$pageUrl, rawDataString=$rawDataString, additionalProperties=$additionalProperties}"
    }

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

    class DerivedValues
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val totalPercentPlayed: JsonField<Double>,
        private val totalSecondsPlayed: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("totalPercentPlayed")
            @ExcludeMissing
            totalPercentPlayed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalSecondsPlayed")
            @ExcludeMissing
            totalSecondsPlayed: JsonField<Int> = JsonMissing.of(),
        ) : this(totalPercentPlayed, totalSecondsPlayed, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalPercentPlayed(): Double = totalPercentPlayed.getRequired("totalPercentPlayed")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalSecondsPlayed(): Int = totalSecondsPlayed.getRequired("totalSecondsPlayed")

        /**
         * Returns the raw JSON value of [totalPercentPlayed].
         *
         * Unlike [totalPercentPlayed], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("totalPercentPlayed")
        @ExcludeMissing
        fun _totalPercentPlayed(): JsonField<Double> = totalPercentPlayed

        /**
         * Returns the raw JSON value of [totalSecondsPlayed].
         *
         * Unlike [totalSecondsPlayed], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [DerivedValues].
             *
             * The following fields are required:
             * ```java
             * .totalPercentPlayed()
             * .totalSecondsPlayed()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DerivedValues]. */
        class Builder internal constructor() {

            private var totalPercentPlayed: JsonField<Double>? = null
            private var totalSecondsPlayed: JsonField<Int>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(derivedValues: DerivedValues) = apply {
                totalPercentPlayed = derivedValues.totalPercentPlayed
                totalSecondsPlayed = derivedValues.totalSecondsPlayed
                additionalProperties = derivedValues.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [DerivedValues].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .totalPercentPlayed()
             * .totalSecondsPlayed()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DerivedValues =
                DerivedValues(
                    checkRequired("totalPercentPlayed", totalPercentPlayed),
                    checkRequired("totalSecondsPlayed", totalSecondsPlayed),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DerivedValues = apply {
            if (validated) {
                return@apply
            }

            totalPercentPlayed()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (totalPercentPlayed.asKnown().isPresent) 1 else 0) +
                (if (totalSecondsPlayed.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DerivedValues &&
                totalPercentPlayed == other.totalPercentPlayed &&
                totalSecondsPlayed == other.totalSecondsPlayed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(totalPercentPlayed, totalSecondsPlayed, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DerivedValues{totalPercentPlayed=$totalPercentPlayed, totalSecondsPlayed=$totalSecondsPlayed, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventCreateAttentionSpanEventParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EventCreateAttentionSpanEventParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
