// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.urlmappings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class UrlMappingsUrlMapping
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val cdnPurgeEmbargoTime: JsonField<Long>,
    private val contentGroupId: JsonField<Long>,
    private val cosObjectType: JsonField<CosObjectType>,
    private val created: JsonField<Long>,
    private val createdById: JsonField<Int>,
    private val deletedAt: JsonField<Long>,
    private val destination: JsonField<String>,
    private val internallyCreated: JsonField<Boolean>,
    private val isActive: JsonField<Boolean>,
    private val isMatchFullUrl: JsonField<Boolean>,
    private val isMatchQueryString: JsonField<Boolean>,
    private val isOnlyAfterNotFound: JsonField<Boolean>,
    private val isPattern: JsonField<Boolean>,
    private val isProtocolAgnostic: JsonField<Boolean>,
    private val isRegex: JsonField<Boolean>,
    private val isTrailingSlashOptional: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val note: JsonField<String>,
    private val portalId: JsonField<Int>,
    private val precedence: JsonField<Int>,
    private val redirectStyle: JsonField<Int>,
    private val routePrefix: JsonField<String>,
    private val updated: JsonField<Long>,
    private val updatedById: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cdnPurgeEmbargoTime")
        @ExcludeMissing
        cdnPurgeEmbargoTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contentGroupId")
        @ExcludeMissing
        contentGroupId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cosObjectType")
        @ExcludeMissing
        cosObjectType: JsonField<CosObjectType> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdById") @ExcludeMissing createdById: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("deletedAt") @ExcludeMissing deletedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("internallyCreated")
        @ExcludeMissing
        internallyCreated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isMatchFullUrl")
        @ExcludeMissing
        isMatchFullUrl: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isMatchQueryString")
        @ExcludeMissing
        isMatchQueryString: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isOnlyAfterNotFound")
        @ExcludeMissing
        isOnlyAfterNotFound: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isPattern") @ExcludeMissing isPattern: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isProtocolAgnostic")
        @ExcludeMissing
        isProtocolAgnostic: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isRegex") @ExcludeMissing isRegex: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isTrailingSlashOptional")
        @ExcludeMissing
        isTrailingSlashOptional: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("precedence") @ExcludeMissing precedence: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("redirectStyle")
        @ExcludeMissing
        redirectStyle: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("routePrefix")
        @ExcludeMissing
        routePrefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedById") @ExcludeMissing updatedById: JsonField<Int> = JsonMissing.of(),
    ) : this(
        id,
        cdnPurgeEmbargoTime,
        contentGroupId,
        cosObjectType,
        created,
        createdById,
        deletedAt,
        destination,
        internallyCreated,
        isActive,
        isMatchFullUrl,
        isMatchQueryString,
        isOnlyAfterNotFound,
        isPattern,
        isProtocolAgnostic,
        isRegex,
        isTrailingSlashOptional,
        label,
        name,
        note,
        portalId,
        precedence,
        redirectStyle,
        routePrefix,
        updated,
        updatedById,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the URL mapping, represented as a 64-bit integer.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * A Unix timestamp in milliseconds indicating the embargo time for CDN purge related to the URL
     * mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cdnPurgeEmbargoTime(): Long = cdnPurgeEmbargoTime.getRequired("cdnPurgeEmbargoTime")

    /**
     * A 64-bit integer representing the content group associated with the URL mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentGroupId(): Long = contentGroupId.getRequired("contentGroupId")

    /**
     * A string representing the type of content object associated with the URL mapping. Valid
     * values include various content types such as 'CONTENT', 'LAYOUT', 'FILE', etc.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cosObjectType(): CosObjectType = cosObjectType.getRequired("cosObjectType")

    /**
     * A Unix timestamp in milliseconds indicating when the URL mapping was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): Long = created.getRequired("created")

    /**
     * The identifier of the user who created the URL mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdById(): Int = createdById.getRequired("createdById")

    /**
     * A Unix timestamp in milliseconds indicating when the URL mapping was deleted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deletedAt(): Long = deletedAt.getRequired("deletedAt")

    /**
     * The destination URL to which the routePrefix is redirected.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): String = destination.getRequired("destination")

    /**
     * A boolean indicating if the URL mapping was created internally by the system.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internallyCreated(): Boolean = internallyCreated.getRequired("internallyCreated")

    /**
     * A boolean indicating if the URL mapping is currently active.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("isActive")

    /**
     * A boolean indicating if the full URL should be matched.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isMatchFullUrl(): Boolean = isMatchFullUrl.getRequired("isMatchFullUrl")

    /**
     * A boolean indicating if the query string should be matched.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isMatchQueryString(): Boolean = isMatchQueryString.getRequired("isMatchQueryString")

    /**
     * A boolean indicating if the mapping should only be applied after a 404 Not Found response.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isOnlyAfterNotFound(): Boolean = isOnlyAfterNotFound.getRequired("isOnlyAfterNotFound")

    /**
     * A boolean indicating if the routePrefix is a pattern.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPattern(): Boolean = isPattern.getRequired("isPattern")

    /**
     * A boolean indicating if the mapping should ignore the URL protocol (http/https).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isProtocolAgnostic(): Boolean = isProtocolAgnostic.getRequired("isProtocolAgnostic")

    /**
     * A boolean indicating if the routePrefix should be treated as a regular expression.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRegex(): Boolean = isRegex.getRequired("isRegex")

    /**
     * A boolean indicating if the trailing slash in the URL is optional.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isTrailingSlashOptional(): Boolean =
        isTrailingSlashOptional.getRequired("isTrailingSlashOptional")

    /**
     * A label for the URL mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The name of the URL mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * A string containing notes about the URL mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun note(): String = note.getRequired("note")

    /**
     * The identifier for the HubSpot portal associated with this URL mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Int = portalId.getRequired("portalId")

    /**
     * An integer representing the precedence of the URL mapping, used to determine order of
     * evaluation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun precedence(): Int = precedence.getRequired("precedence")

    /**
     * An integer representing the style of redirection used.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redirectStyle(): Int = redirectStyle.getRequired("redirectStyle")

    /**
     * The prefix of the URL path that is being mapped.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routePrefix(): String = routePrefix.getRequired("routePrefix")

    /**
     * A Unix timestamp in milliseconds indicating when the URL mapping was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): Long = updated.getRequired("updated")

    /**
     * The identifier of the user who last updated the URL mapping.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedById(): Int = updatedById.getRequired("updatedById")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [cdnPurgeEmbargoTime].
     *
     * Unlike [cdnPurgeEmbargoTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cdnPurgeEmbargoTime")
    @ExcludeMissing
    fun _cdnPurgeEmbargoTime(): JsonField<Long> = cdnPurgeEmbargoTime

    /**
     * Returns the raw JSON value of [contentGroupId].
     *
     * Unlike [contentGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentGroupId")
    @ExcludeMissing
    fun _contentGroupId(): JsonField<Long> = contentGroupId

    /**
     * Returns the raw JSON value of [cosObjectType].
     *
     * Unlike [cosObjectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cosObjectType")
    @ExcludeMissing
    fun _cosObjectType(): JsonField<CosObjectType> = cosObjectType

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    /**
     * Returns the raw JSON value of [createdById].
     *
     * Unlike [createdById], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdById") @ExcludeMissing fun _createdById(): JsonField<Int> = createdById

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deletedAt") @ExcludeMissing fun _deletedAt(): JsonField<Long> = deletedAt

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [internallyCreated].
     *
     * Unlike [internallyCreated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("internallyCreated")
    @ExcludeMissing
    fun _internallyCreated(): JsonField<Boolean> = internallyCreated

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [isMatchFullUrl].
     *
     * Unlike [isMatchFullUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isMatchFullUrl")
    @ExcludeMissing
    fun _isMatchFullUrl(): JsonField<Boolean> = isMatchFullUrl

    /**
     * Returns the raw JSON value of [isMatchQueryString].
     *
     * Unlike [isMatchQueryString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isMatchQueryString")
    @ExcludeMissing
    fun _isMatchQueryString(): JsonField<Boolean> = isMatchQueryString

    /**
     * Returns the raw JSON value of [isOnlyAfterNotFound].
     *
     * Unlike [isOnlyAfterNotFound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isOnlyAfterNotFound")
    @ExcludeMissing
    fun _isOnlyAfterNotFound(): JsonField<Boolean> = isOnlyAfterNotFound

    /**
     * Returns the raw JSON value of [isPattern].
     *
     * Unlike [isPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPattern") @ExcludeMissing fun _isPattern(): JsonField<Boolean> = isPattern

    /**
     * Returns the raw JSON value of [isProtocolAgnostic].
     *
     * Unlike [isProtocolAgnostic], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isProtocolAgnostic")
    @ExcludeMissing
    fun _isProtocolAgnostic(): JsonField<Boolean> = isProtocolAgnostic

    /**
     * Returns the raw JSON value of [isRegex].
     *
     * Unlike [isRegex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isRegex") @ExcludeMissing fun _isRegex(): JsonField<Boolean> = isRegex

    /**
     * Returns the raw JSON value of [isTrailingSlashOptional].
     *
     * Unlike [isTrailingSlashOptional], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("isTrailingSlashOptional")
    @ExcludeMissing
    fun _isTrailingSlashOptional(): JsonField<Boolean> = isTrailingSlashOptional

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [note].
     *
     * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

    /**
     * Returns the raw JSON value of [precedence].
     *
     * Unlike [precedence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("precedence") @ExcludeMissing fun _precedence(): JsonField<Int> = precedence

    /**
     * Returns the raw JSON value of [redirectStyle].
     *
     * Unlike [redirectStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirectStyle")
    @ExcludeMissing
    fun _redirectStyle(): JsonField<Int> = redirectStyle

    /**
     * Returns the raw JSON value of [routePrefix].
     *
     * Unlike [routePrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routePrefix") @ExcludeMissing fun _routePrefix(): JsonField<String> = routePrefix

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<Long> = updated

    /**
     * Returns the raw JSON value of [updatedById].
     *
     * Unlike [updatedById], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedById") @ExcludeMissing fun _updatedById(): JsonField<Int> = updatedById

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
         * Returns a mutable builder for constructing an instance of [UrlMappingsUrlMapping].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cdnPurgeEmbargoTime()
         * .contentGroupId()
         * .cosObjectType()
         * .created()
         * .createdById()
         * .deletedAt()
         * .destination()
         * .internallyCreated()
         * .isActive()
         * .isMatchFullUrl()
         * .isMatchQueryString()
         * .isOnlyAfterNotFound()
         * .isPattern()
         * .isProtocolAgnostic()
         * .isRegex()
         * .isTrailingSlashOptional()
         * .label()
         * .name()
         * .note()
         * .portalId()
         * .precedence()
         * .redirectStyle()
         * .routePrefix()
         * .updated()
         * .updatedById()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UrlMappingsUrlMapping]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var cdnPurgeEmbargoTime: JsonField<Long>? = null
        private var contentGroupId: JsonField<Long>? = null
        private var cosObjectType: JsonField<CosObjectType>? = null
        private var created: JsonField<Long>? = null
        private var createdById: JsonField<Int>? = null
        private var deletedAt: JsonField<Long>? = null
        private var destination: JsonField<String>? = null
        private var internallyCreated: JsonField<Boolean>? = null
        private var isActive: JsonField<Boolean>? = null
        private var isMatchFullUrl: JsonField<Boolean>? = null
        private var isMatchQueryString: JsonField<Boolean>? = null
        private var isOnlyAfterNotFound: JsonField<Boolean>? = null
        private var isPattern: JsonField<Boolean>? = null
        private var isProtocolAgnostic: JsonField<Boolean>? = null
        private var isRegex: JsonField<Boolean>? = null
        private var isTrailingSlashOptional: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var note: JsonField<String>? = null
        private var portalId: JsonField<Int>? = null
        private var precedence: JsonField<Int>? = null
        private var redirectStyle: JsonField<Int>? = null
        private var routePrefix: JsonField<String>? = null
        private var updated: JsonField<Long>? = null
        private var updatedById: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(urlMappingsUrlMapping: UrlMappingsUrlMapping) = apply {
            id = urlMappingsUrlMapping.id
            cdnPurgeEmbargoTime = urlMappingsUrlMapping.cdnPurgeEmbargoTime
            contentGroupId = urlMappingsUrlMapping.contentGroupId
            cosObjectType = urlMappingsUrlMapping.cosObjectType
            created = urlMappingsUrlMapping.created
            createdById = urlMappingsUrlMapping.createdById
            deletedAt = urlMappingsUrlMapping.deletedAt
            destination = urlMappingsUrlMapping.destination
            internallyCreated = urlMappingsUrlMapping.internallyCreated
            isActive = urlMappingsUrlMapping.isActive
            isMatchFullUrl = urlMappingsUrlMapping.isMatchFullUrl
            isMatchQueryString = urlMappingsUrlMapping.isMatchQueryString
            isOnlyAfterNotFound = urlMappingsUrlMapping.isOnlyAfterNotFound
            isPattern = urlMappingsUrlMapping.isPattern
            isProtocolAgnostic = urlMappingsUrlMapping.isProtocolAgnostic
            isRegex = urlMappingsUrlMapping.isRegex
            isTrailingSlashOptional = urlMappingsUrlMapping.isTrailingSlashOptional
            label = urlMappingsUrlMapping.label
            name = urlMappingsUrlMapping.name
            note = urlMappingsUrlMapping.note
            portalId = urlMappingsUrlMapping.portalId
            precedence = urlMappingsUrlMapping.precedence
            redirectStyle = urlMappingsUrlMapping.redirectStyle
            routePrefix = urlMappingsUrlMapping.routePrefix
            updated = urlMappingsUrlMapping.updated
            updatedById = urlMappingsUrlMapping.updatedById
            additionalProperties = urlMappingsUrlMapping.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the URL mapping, represented as a 64-bit integer. */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /**
         * A Unix timestamp in milliseconds indicating the embargo time for CDN purge related to the
         * URL mapping.
         */
        fun cdnPurgeEmbargoTime(cdnPurgeEmbargoTime: Long) =
            cdnPurgeEmbargoTime(JsonField.of(cdnPurgeEmbargoTime))

        /**
         * Sets [Builder.cdnPurgeEmbargoTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cdnPurgeEmbargoTime] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cdnPurgeEmbargoTime(cdnPurgeEmbargoTime: JsonField<Long>) = apply {
            this.cdnPurgeEmbargoTime = cdnPurgeEmbargoTime
        }

        /** A 64-bit integer representing the content group associated with the URL mapping. */
        fun contentGroupId(contentGroupId: Long) = contentGroupId(JsonField.of(contentGroupId))

        /**
         * Sets [Builder.contentGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentGroupId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentGroupId(contentGroupId: JsonField<Long>) = apply {
            this.contentGroupId = contentGroupId
        }

        /**
         * A string representing the type of content object associated with the URL mapping. Valid
         * values include various content types such as 'CONTENT', 'LAYOUT', 'FILE', etc.
         */
        fun cosObjectType(cosObjectType: CosObjectType) = cosObjectType(JsonField.of(cosObjectType))

        /**
         * Sets [Builder.cosObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cosObjectType] with a well-typed [CosObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cosObjectType(cosObjectType: JsonField<CosObjectType>) = apply {
            this.cosObjectType = cosObjectType
        }

        /** A Unix timestamp in milliseconds indicating when the URL mapping was created. */
        fun created(created: Long) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** The identifier of the user who created the URL mapping. */
        fun createdById(createdById: Int) = createdById(JsonField.of(createdById))

        /**
         * Sets [Builder.createdById] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdById] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdById(createdById: JsonField<Int>) = apply { this.createdById = createdById }

        /** A Unix timestamp in milliseconds indicating when the URL mapping was deleted. */
        fun deletedAt(deletedAt: Long) = deletedAt(JsonField.of(deletedAt))

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deletedAt(deletedAt: JsonField<Long>) = apply { this.deletedAt = deletedAt }

        /** The destination URL to which the routePrefix is redirected. */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** A boolean indicating if the URL mapping was created internally by the system. */
        fun internallyCreated(internallyCreated: Boolean) =
            internallyCreated(JsonField.of(internallyCreated))

        /**
         * Sets [Builder.internallyCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internallyCreated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internallyCreated(internallyCreated: JsonField<Boolean>) = apply {
            this.internallyCreated = internallyCreated
        }

        /** A boolean indicating if the URL mapping is currently active. */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** A boolean indicating if the full URL should be matched. */
        fun isMatchFullUrl(isMatchFullUrl: Boolean) = isMatchFullUrl(JsonField.of(isMatchFullUrl))

        /**
         * Sets [Builder.isMatchFullUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMatchFullUrl] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMatchFullUrl(isMatchFullUrl: JsonField<Boolean>) = apply {
            this.isMatchFullUrl = isMatchFullUrl
        }

        /** A boolean indicating if the query string should be matched. */
        fun isMatchQueryString(isMatchQueryString: Boolean) =
            isMatchQueryString(JsonField.of(isMatchQueryString))

        /**
         * Sets [Builder.isMatchQueryString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMatchQueryString] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMatchQueryString(isMatchQueryString: JsonField<Boolean>) = apply {
            this.isMatchQueryString = isMatchQueryString
        }

        /**
         * A boolean indicating if the mapping should only be applied after a 404 Not Found
         * response.
         */
        fun isOnlyAfterNotFound(isOnlyAfterNotFound: Boolean) =
            isOnlyAfterNotFound(JsonField.of(isOnlyAfterNotFound))

        /**
         * Sets [Builder.isOnlyAfterNotFound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOnlyAfterNotFound] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isOnlyAfterNotFound(isOnlyAfterNotFound: JsonField<Boolean>) = apply {
            this.isOnlyAfterNotFound = isOnlyAfterNotFound
        }

        /** A boolean indicating if the routePrefix is a pattern. */
        fun isPattern(isPattern: Boolean) = isPattern(JsonField.of(isPattern))

        /**
         * Sets [Builder.isPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPattern] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPattern(isPattern: JsonField<Boolean>) = apply { this.isPattern = isPattern }

        /** A boolean indicating if the mapping should ignore the URL protocol (http/https). */
        fun isProtocolAgnostic(isProtocolAgnostic: Boolean) =
            isProtocolAgnostic(JsonField.of(isProtocolAgnostic))

        /**
         * Sets [Builder.isProtocolAgnostic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isProtocolAgnostic] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isProtocolAgnostic(isProtocolAgnostic: JsonField<Boolean>) = apply {
            this.isProtocolAgnostic = isProtocolAgnostic
        }

        /** A boolean indicating if the routePrefix should be treated as a regular expression. */
        fun isRegex(isRegex: Boolean) = isRegex(JsonField.of(isRegex))

        /**
         * Sets [Builder.isRegex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRegex] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isRegex(isRegex: JsonField<Boolean>) = apply { this.isRegex = isRegex }

        /** A boolean indicating if the trailing slash in the URL is optional. */
        fun isTrailingSlashOptional(isTrailingSlashOptional: Boolean) =
            isTrailingSlashOptional(JsonField.of(isTrailingSlashOptional))

        /**
         * Sets [Builder.isTrailingSlashOptional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTrailingSlashOptional] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun isTrailingSlashOptional(isTrailingSlashOptional: JsonField<Boolean>) = apply {
            this.isTrailingSlashOptional = isTrailingSlashOptional
        }

        /** A label for the URL mapping. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** The name of the URL mapping. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** A string containing notes about the URL mapping. */
        fun note(note: String) = note(JsonField.of(note))

        /**
         * Sets [Builder.note] to an arbitrary JSON value.
         *
         * You should usually call [Builder.note] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun note(note: JsonField<String>) = apply { this.note = note }

        /** The identifier for the HubSpot portal associated with this URL mapping. */
        fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

        /**
         * An integer representing the precedence of the URL mapping, used to determine order of
         * evaluation.
         */
        fun precedence(precedence: Int) = precedence(JsonField.of(precedence))

        /**
         * Sets [Builder.precedence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precedence] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun precedence(precedence: JsonField<Int>) = apply { this.precedence = precedence }

        /** An integer representing the style of redirection used. */
        fun redirectStyle(redirectStyle: Int) = redirectStyle(JsonField.of(redirectStyle))

        /**
         * Sets [Builder.redirectStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectStyle] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectStyle(redirectStyle: JsonField<Int>) = apply {
            this.redirectStyle = redirectStyle
        }

        /** The prefix of the URL path that is being mapped. */
        fun routePrefix(routePrefix: String) = routePrefix(JsonField.of(routePrefix))

        /**
         * Sets [Builder.routePrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routePrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routePrefix(routePrefix: JsonField<String>) = apply { this.routePrefix = routePrefix }

        /** A Unix timestamp in milliseconds indicating when the URL mapping was last updated. */
        fun updated(updated: Long) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<Long>) = apply { this.updated = updated }

        /** The identifier of the user who last updated the URL mapping. */
        fun updatedById(updatedById: Int) = updatedById(JsonField.of(updatedById))

        /**
         * Sets [Builder.updatedById] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedById] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedById(updatedById: JsonField<Int>) = apply { this.updatedById = updatedById }

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
         * Returns an immutable instance of [UrlMappingsUrlMapping].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cdnPurgeEmbargoTime()
         * .contentGroupId()
         * .cosObjectType()
         * .created()
         * .createdById()
         * .deletedAt()
         * .destination()
         * .internallyCreated()
         * .isActive()
         * .isMatchFullUrl()
         * .isMatchQueryString()
         * .isOnlyAfterNotFound()
         * .isPattern()
         * .isProtocolAgnostic()
         * .isRegex()
         * .isTrailingSlashOptional()
         * .label()
         * .name()
         * .note()
         * .portalId()
         * .precedence()
         * .redirectStyle()
         * .routePrefix()
         * .updated()
         * .updatedById()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UrlMappingsUrlMapping =
            UrlMappingsUrlMapping(
                checkRequired("id", id),
                checkRequired("cdnPurgeEmbargoTime", cdnPurgeEmbargoTime),
                checkRequired("contentGroupId", contentGroupId),
                checkRequired("cosObjectType", cosObjectType),
                checkRequired("created", created),
                checkRequired("createdById", createdById),
                checkRequired("deletedAt", deletedAt),
                checkRequired("destination", destination),
                checkRequired("internallyCreated", internallyCreated),
                checkRequired("isActive", isActive),
                checkRequired("isMatchFullUrl", isMatchFullUrl),
                checkRequired("isMatchQueryString", isMatchQueryString),
                checkRequired("isOnlyAfterNotFound", isOnlyAfterNotFound),
                checkRequired("isPattern", isPattern),
                checkRequired("isProtocolAgnostic", isProtocolAgnostic),
                checkRequired("isRegex", isRegex),
                checkRequired("isTrailingSlashOptional", isTrailingSlashOptional),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("note", note),
                checkRequired("portalId", portalId),
                checkRequired("precedence", precedence),
                checkRequired("redirectStyle", redirectStyle),
                checkRequired("routePrefix", routePrefix),
                checkRequired("updated", updated),
                checkRequired("updatedById", updatedById),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UrlMappingsUrlMapping = apply {
        if (validated) {
            return@apply
        }

        id()
        cdnPurgeEmbargoTime()
        contentGroupId()
        cosObjectType().validate()
        created()
        createdById()
        deletedAt()
        destination()
        internallyCreated()
        isActive()
        isMatchFullUrl()
        isMatchQueryString()
        isOnlyAfterNotFound()
        isPattern()
        isProtocolAgnostic()
        isRegex()
        isTrailingSlashOptional()
        label()
        name()
        note()
        portalId()
        precedence()
        redirectStyle()
        routePrefix()
        updated()
        updatedById()
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
            (if (cdnPurgeEmbargoTime.asKnown().isPresent) 1 else 0) +
            (if (contentGroupId.asKnown().isPresent) 1 else 0) +
            (cosObjectType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (createdById.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (if (destination.asKnown().isPresent) 1 else 0) +
            (if (internallyCreated.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (isMatchFullUrl.asKnown().isPresent) 1 else 0) +
            (if (isMatchQueryString.asKnown().isPresent) 1 else 0) +
            (if (isOnlyAfterNotFound.asKnown().isPresent) 1 else 0) +
            (if (isPattern.asKnown().isPresent) 1 else 0) +
            (if (isProtocolAgnostic.asKnown().isPresent) 1 else 0) +
            (if (isRegex.asKnown().isPresent) 1 else 0) +
            (if (isTrailingSlashOptional.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (note.asKnown().isPresent) 1 else 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (if (precedence.asKnown().isPresent) 1 else 0) +
            (if (redirectStyle.asKnown().isPresent) 1 else 0) +
            (if (routePrefix.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (updatedById.asKnown().isPresent) 1 else 0)

    /**
     * A string representing the type of content object associated with the URL mapping. Valid
     * values include various content types such as 'CONTENT', 'LAYOUT', 'FILE', etc.
     */
    class CosObjectType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ACCESS_GROUP_MEMBERSHIP = of("ACCESS_GROUP_MEMBERSHIP")

            @JvmField val APP_PAGE = of("APP_PAGE")

            @JvmField val BLOCK = of("BLOCK")

            @JvmField val BLOG = of("BLOG")

            @JvmField val BLOG_AUTHOR = of("BLOG_AUTHOR")

            @JvmField val BRAND_BUSINESS_UNIT = of("BRAND_BUSINESS_UNIT")

            @JvmField val BRAND_SETTINGS = of("BRAND_SETTINGS")

            @JvmField val CONTACT_MEMBERSHIP = of("CONTACT_MEMBERSHIP")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONTENT_EMBED = of("CONTENT_EMBED")

            @JvmField val CONTENT_FOLDER = of("CONTENT_FOLDER")

            @JvmField val CONTENT_GROUP = of("CONTENT_GROUP")

            @JvmField val CRM_OBJECT = of("CRM_OBJECT")

            @JvmField val CRM_OBJECT_TYPE = of("CRM_OBJECT_TYPE")

            @JvmField val CUSTOM_WIDGET = of("CUSTOM_WIDGET")

            @JvmField val CUSTOMER_PORTAL = of("CUSTOMER_PORTAL")

            @JvmField val DATA_QUERY = of("DATA_QUERY")

            @JvmField val DESIGN_FOLDER = of("DESIGN_FOLDER")

            @JvmField val DOMAIN = of("DOMAIN")

            @JvmField val DOMAIN_SETTINGS = of("DOMAIN_SETTINGS")

            @JvmField val EMAIL_ADDRESS = of("EMAIL_ADDRESS")

            @JvmField val EXTENSION_RESOURCE = of("EXTENSION_RESOURCE")

            @JvmField val FILE = of("FILE")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val FOLLOW_ME = of("FOLLOW_ME")

            @JvmField val FORM = of("FORM")

            @JvmField val GLOBAL_CONTENT = of("GLOBAL_CONTENT")

            @JvmField val HUBDB_TABLE = of("HUBDB_TABLE")

            @JvmField val HUBDB_TABLE_ROW = of("HUBDB_TABLE_ROW")

            @JvmField val IMAGE = of("IMAGE")

            @JvmField val JS_PROJECT_COMPONENT = of("JS_PROJECT_COMPONENT")

            @JvmField val KNOWLEDGE_BASE = of("KNOWLEDGE_BASE")

            @JvmField val KNOWLEDGE_CATEGORY = of("KNOWLEDGE_CATEGORY")

            @JvmField val KNOWLEDGE_CATEGORY_TRANSLATION = of("KNOWLEDGE_CATEGORY_TRANSLATION")

            @JvmField val KNOWLEDGE_HOMEPAGE_CATEGORY = of("KNOWLEDGE_HOMEPAGE_CATEGORY")

            @JvmField val LAYOUT = of("LAYOUT")

            @JvmField val LAYOUT_SECTION = of("LAYOUT_SECTION")

            @JvmField val LIST_MEMBERSHIP = of("LIST_MEMBERSHIP")

            @JvmField val MARKETPLACE_LISTING = of("MARKETPLACE_LISTING")

            @JvmField val PASSWORD_PROTECTED = of("PASSWORD_PROTECTED")

            @JvmField val PAYMENT = of("PAYMENT")

            @JvmField val PERSONALIZATION_TOKEN = of("PERSONALIZATION_TOKEN")

            @JvmField val PLACEMENT = of("PLACEMENT")

            @JvmField val PROJECT = of("PROJECT")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val RAW_ASSET = of("RAW_ASSET")

            @JvmField val REDIRECT_URL = of("REDIRECT_URL")

            @JvmField val SECTION = of("SECTION")

            @JvmField val SERVERLESS_FUNCTION = of("SERVERLESS_FUNCTION")

            @JvmField val SITE_MAP = of("SITE_MAP")

            @JvmField val SITE_MENU = of("SITE_MENU")

            @JvmField val SITE_SETTINGS = of("SITE_SETTINGS")

            @JvmField val SUBSCRIPTIONS_SETTINGS = of("SUBSCRIPTIONS_SETTINGS")

            @JvmField val TAG = of("TAG")

            @JvmField val THEME = of("THEME")

            @JvmField val THEME_SETTINGS = of("THEME_SETTINGS")

            @JvmField val UNRESTRICTED_ACCESS = of("UNRESTRICTED_ACCESS")

            @JvmField val URL_MAPPING = of("URL_MAPPING")

            @JvmField val VIDEO_PLAYER = of("VIDEO_PLAYER")

            @JvmField val WIDGET = of("WIDGET")

            @JvmField val WORKFLOW = of("WORKFLOW")

            @JvmStatic fun of(value: String) = CosObjectType(JsonField.of(value))
        }

        /** An enum containing [CosObjectType]'s known values. */
        enum class Known {
            ACCESS_GROUP_MEMBERSHIP,
            APP_PAGE,
            BLOCK,
            BLOG,
            BLOG_AUTHOR,
            BRAND_BUSINESS_UNIT,
            BRAND_SETTINGS,
            CONTACT_MEMBERSHIP,
            CONTENT,
            CONTENT_EMBED,
            CONTENT_FOLDER,
            CONTENT_GROUP,
            CRM_OBJECT,
            CRM_OBJECT_TYPE,
            CUSTOM_WIDGET,
            CUSTOMER_PORTAL,
            DATA_QUERY,
            DESIGN_FOLDER,
            DOMAIN,
            DOMAIN_SETTINGS,
            EMAIL_ADDRESS,
            EXTENSION_RESOURCE,
            FILE,
            FOLDER,
            FOLLOW_ME,
            FORM,
            GLOBAL_CONTENT,
            HUBDB_TABLE,
            HUBDB_TABLE_ROW,
            IMAGE,
            JS_PROJECT_COMPONENT,
            KNOWLEDGE_BASE,
            KNOWLEDGE_CATEGORY,
            KNOWLEDGE_CATEGORY_TRANSLATION,
            KNOWLEDGE_HOMEPAGE_CATEGORY,
            LAYOUT,
            LAYOUT_SECTION,
            LIST_MEMBERSHIP,
            MARKETPLACE_LISTING,
            PASSWORD_PROTECTED,
            PAYMENT,
            PERSONALIZATION_TOKEN,
            PLACEMENT,
            PROJECT,
            QUOTE_TEMPLATE,
            RAW_ASSET,
            REDIRECT_URL,
            SECTION,
            SERVERLESS_FUNCTION,
            SITE_MAP,
            SITE_MENU,
            SITE_SETTINGS,
            SUBSCRIPTIONS_SETTINGS,
            TAG,
            THEME,
            THEME_SETTINGS,
            UNRESTRICTED_ACCESS,
            URL_MAPPING,
            VIDEO_PLAYER,
            WIDGET,
            WORKFLOW,
        }

        /**
         * An enum containing [CosObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CosObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCESS_GROUP_MEMBERSHIP,
            APP_PAGE,
            BLOCK,
            BLOG,
            BLOG_AUTHOR,
            BRAND_BUSINESS_UNIT,
            BRAND_SETTINGS,
            CONTACT_MEMBERSHIP,
            CONTENT,
            CONTENT_EMBED,
            CONTENT_FOLDER,
            CONTENT_GROUP,
            CRM_OBJECT,
            CRM_OBJECT_TYPE,
            CUSTOM_WIDGET,
            CUSTOMER_PORTAL,
            DATA_QUERY,
            DESIGN_FOLDER,
            DOMAIN,
            DOMAIN_SETTINGS,
            EMAIL_ADDRESS,
            EXTENSION_RESOURCE,
            FILE,
            FOLDER,
            FOLLOW_ME,
            FORM,
            GLOBAL_CONTENT,
            HUBDB_TABLE,
            HUBDB_TABLE_ROW,
            IMAGE,
            JS_PROJECT_COMPONENT,
            KNOWLEDGE_BASE,
            KNOWLEDGE_CATEGORY,
            KNOWLEDGE_CATEGORY_TRANSLATION,
            KNOWLEDGE_HOMEPAGE_CATEGORY,
            LAYOUT,
            LAYOUT_SECTION,
            LIST_MEMBERSHIP,
            MARKETPLACE_LISTING,
            PASSWORD_PROTECTED,
            PAYMENT,
            PERSONALIZATION_TOKEN,
            PLACEMENT,
            PROJECT,
            QUOTE_TEMPLATE,
            RAW_ASSET,
            REDIRECT_URL,
            SECTION,
            SERVERLESS_FUNCTION,
            SITE_MAP,
            SITE_MENU,
            SITE_SETTINGS,
            SUBSCRIPTIONS_SETTINGS,
            TAG,
            THEME,
            THEME_SETTINGS,
            UNRESTRICTED_ACCESS,
            URL_MAPPING,
            VIDEO_PLAYER,
            WIDGET,
            WORKFLOW,
            /**
             * An enum member indicating that [CosObjectType] was instantiated with an unknown
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
                ACCESS_GROUP_MEMBERSHIP -> Value.ACCESS_GROUP_MEMBERSHIP
                APP_PAGE -> Value.APP_PAGE
                BLOCK -> Value.BLOCK
                BLOG -> Value.BLOG
                BLOG_AUTHOR -> Value.BLOG_AUTHOR
                BRAND_BUSINESS_UNIT -> Value.BRAND_BUSINESS_UNIT
                BRAND_SETTINGS -> Value.BRAND_SETTINGS
                CONTACT_MEMBERSHIP -> Value.CONTACT_MEMBERSHIP
                CONTENT -> Value.CONTENT
                CONTENT_EMBED -> Value.CONTENT_EMBED
                CONTENT_FOLDER -> Value.CONTENT_FOLDER
                CONTENT_GROUP -> Value.CONTENT_GROUP
                CRM_OBJECT -> Value.CRM_OBJECT
                CRM_OBJECT_TYPE -> Value.CRM_OBJECT_TYPE
                CUSTOM_WIDGET -> Value.CUSTOM_WIDGET
                CUSTOMER_PORTAL -> Value.CUSTOMER_PORTAL
                DATA_QUERY -> Value.DATA_QUERY
                DESIGN_FOLDER -> Value.DESIGN_FOLDER
                DOMAIN -> Value.DOMAIN
                DOMAIN_SETTINGS -> Value.DOMAIN_SETTINGS
                EMAIL_ADDRESS -> Value.EMAIL_ADDRESS
                EXTENSION_RESOURCE -> Value.EXTENSION_RESOURCE
                FILE -> Value.FILE
                FOLDER -> Value.FOLDER
                FOLLOW_ME -> Value.FOLLOW_ME
                FORM -> Value.FORM
                GLOBAL_CONTENT -> Value.GLOBAL_CONTENT
                HUBDB_TABLE -> Value.HUBDB_TABLE
                HUBDB_TABLE_ROW -> Value.HUBDB_TABLE_ROW
                IMAGE -> Value.IMAGE
                JS_PROJECT_COMPONENT -> Value.JS_PROJECT_COMPONENT
                KNOWLEDGE_BASE -> Value.KNOWLEDGE_BASE
                KNOWLEDGE_CATEGORY -> Value.KNOWLEDGE_CATEGORY
                KNOWLEDGE_CATEGORY_TRANSLATION -> Value.KNOWLEDGE_CATEGORY_TRANSLATION
                KNOWLEDGE_HOMEPAGE_CATEGORY -> Value.KNOWLEDGE_HOMEPAGE_CATEGORY
                LAYOUT -> Value.LAYOUT
                LAYOUT_SECTION -> Value.LAYOUT_SECTION
                LIST_MEMBERSHIP -> Value.LIST_MEMBERSHIP
                MARKETPLACE_LISTING -> Value.MARKETPLACE_LISTING
                PASSWORD_PROTECTED -> Value.PASSWORD_PROTECTED
                PAYMENT -> Value.PAYMENT
                PERSONALIZATION_TOKEN -> Value.PERSONALIZATION_TOKEN
                PLACEMENT -> Value.PLACEMENT
                PROJECT -> Value.PROJECT
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                RAW_ASSET -> Value.RAW_ASSET
                REDIRECT_URL -> Value.REDIRECT_URL
                SECTION -> Value.SECTION
                SERVERLESS_FUNCTION -> Value.SERVERLESS_FUNCTION
                SITE_MAP -> Value.SITE_MAP
                SITE_MENU -> Value.SITE_MENU
                SITE_SETTINGS -> Value.SITE_SETTINGS
                SUBSCRIPTIONS_SETTINGS -> Value.SUBSCRIPTIONS_SETTINGS
                TAG -> Value.TAG
                THEME -> Value.THEME
                THEME_SETTINGS -> Value.THEME_SETTINGS
                UNRESTRICTED_ACCESS -> Value.UNRESTRICTED_ACCESS
                URL_MAPPING -> Value.URL_MAPPING
                VIDEO_PLAYER -> Value.VIDEO_PLAYER
                WIDGET -> Value.WIDGET
                WORKFLOW -> Value.WORKFLOW
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
                ACCESS_GROUP_MEMBERSHIP -> Known.ACCESS_GROUP_MEMBERSHIP
                APP_PAGE -> Known.APP_PAGE
                BLOCK -> Known.BLOCK
                BLOG -> Known.BLOG
                BLOG_AUTHOR -> Known.BLOG_AUTHOR
                BRAND_BUSINESS_UNIT -> Known.BRAND_BUSINESS_UNIT
                BRAND_SETTINGS -> Known.BRAND_SETTINGS
                CONTACT_MEMBERSHIP -> Known.CONTACT_MEMBERSHIP
                CONTENT -> Known.CONTENT
                CONTENT_EMBED -> Known.CONTENT_EMBED
                CONTENT_FOLDER -> Known.CONTENT_FOLDER
                CONTENT_GROUP -> Known.CONTENT_GROUP
                CRM_OBJECT -> Known.CRM_OBJECT
                CRM_OBJECT_TYPE -> Known.CRM_OBJECT_TYPE
                CUSTOM_WIDGET -> Known.CUSTOM_WIDGET
                CUSTOMER_PORTAL -> Known.CUSTOMER_PORTAL
                DATA_QUERY -> Known.DATA_QUERY
                DESIGN_FOLDER -> Known.DESIGN_FOLDER
                DOMAIN -> Known.DOMAIN
                DOMAIN_SETTINGS -> Known.DOMAIN_SETTINGS
                EMAIL_ADDRESS -> Known.EMAIL_ADDRESS
                EXTENSION_RESOURCE -> Known.EXTENSION_RESOURCE
                FILE -> Known.FILE
                FOLDER -> Known.FOLDER
                FOLLOW_ME -> Known.FOLLOW_ME
                FORM -> Known.FORM
                GLOBAL_CONTENT -> Known.GLOBAL_CONTENT
                HUBDB_TABLE -> Known.HUBDB_TABLE
                HUBDB_TABLE_ROW -> Known.HUBDB_TABLE_ROW
                IMAGE -> Known.IMAGE
                JS_PROJECT_COMPONENT -> Known.JS_PROJECT_COMPONENT
                KNOWLEDGE_BASE -> Known.KNOWLEDGE_BASE
                KNOWLEDGE_CATEGORY -> Known.KNOWLEDGE_CATEGORY
                KNOWLEDGE_CATEGORY_TRANSLATION -> Known.KNOWLEDGE_CATEGORY_TRANSLATION
                KNOWLEDGE_HOMEPAGE_CATEGORY -> Known.KNOWLEDGE_HOMEPAGE_CATEGORY
                LAYOUT -> Known.LAYOUT
                LAYOUT_SECTION -> Known.LAYOUT_SECTION
                LIST_MEMBERSHIP -> Known.LIST_MEMBERSHIP
                MARKETPLACE_LISTING -> Known.MARKETPLACE_LISTING
                PASSWORD_PROTECTED -> Known.PASSWORD_PROTECTED
                PAYMENT -> Known.PAYMENT
                PERSONALIZATION_TOKEN -> Known.PERSONALIZATION_TOKEN
                PLACEMENT -> Known.PLACEMENT
                PROJECT -> Known.PROJECT
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                RAW_ASSET -> Known.RAW_ASSET
                REDIRECT_URL -> Known.REDIRECT_URL
                SECTION -> Known.SECTION
                SERVERLESS_FUNCTION -> Known.SERVERLESS_FUNCTION
                SITE_MAP -> Known.SITE_MAP
                SITE_MENU -> Known.SITE_MENU
                SITE_SETTINGS -> Known.SITE_SETTINGS
                SUBSCRIPTIONS_SETTINGS -> Known.SUBSCRIPTIONS_SETTINGS
                TAG -> Known.TAG
                THEME -> Known.THEME
                THEME_SETTINGS -> Known.THEME_SETTINGS
                UNRESTRICTED_ACCESS -> Known.UNRESTRICTED_ACCESS
                URL_MAPPING -> Known.URL_MAPPING
                VIDEO_PLAYER -> Known.VIDEO_PLAYER
                WIDGET -> Known.WIDGET
                WORKFLOW -> Known.WORKFLOW
                else -> throw HubSpotInvalidDataException("Unknown CosObjectType: $value")
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

        fun validate(): CosObjectType = apply {
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

            return other is CosObjectType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlMappingsUrlMapping &&
            id == other.id &&
            cdnPurgeEmbargoTime == other.cdnPurgeEmbargoTime &&
            contentGroupId == other.contentGroupId &&
            cosObjectType == other.cosObjectType &&
            created == other.created &&
            createdById == other.createdById &&
            deletedAt == other.deletedAt &&
            destination == other.destination &&
            internallyCreated == other.internallyCreated &&
            isActive == other.isActive &&
            isMatchFullUrl == other.isMatchFullUrl &&
            isMatchQueryString == other.isMatchQueryString &&
            isOnlyAfterNotFound == other.isOnlyAfterNotFound &&
            isPattern == other.isPattern &&
            isProtocolAgnostic == other.isProtocolAgnostic &&
            isRegex == other.isRegex &&
            isTrailingSlashOptional == other.isTrailingSlashOptional &&
            label == other.label &&
            name == other.name &&
            note == other.note &&
            portalId == other.portalId &&
            precedence == other.precedence &&
            redirectStyle == other.redirectStyle &&
            routePrefix == other.routePrefix &&
            updated == other.updated &&
            updatedById == other.updatedById &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cdnPurgeEmbargoTime,
            contentGroupId,
            cosObjectType,
            created,
            createdById,
            deletedAt,
            destination,
            internallyCreated,
            isActive,
            isMatchFullUrl,
            isMatchQueryString,
            isOnlyAfterNotFound,
            isPattern,
            isProtocolAgnostic,
            isRegex,
            isTrailingSlashOptional,
            label,
            name,
            note,
            portalId,
            precedence,
            redirectStyle,
            routePrefix,
            updated,
            updatedById,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UrlMappingsUrlMapping{id=$id, cdnPurgeEmbargoTime=$cdnPurgeEmbargoTime, contentGroupId=$contentGroupId, cosObjectType=$cosObjectType, created=$created, createdById=$createdById, deletedAt=$deletedAt, destination=$destination, internallyCreated=$internallyCreated, isActive=$isActive, isMatchFullUrl=$isMatchFullUrl, isMatchQueryString=$isMatchQueryString, isOnlyAfterNotFound=$isOnlyAfterNotFound, isPattern=$isPattern, isProtocolAgnostic=$isProtocolAgnostic, isRegex=$isRegex, isTrailingSlashOptional=$isTrailingSlashOptional, label=$label, name=$name, note=$note, portalId=$portalId, precedence=$precedence, redirectStyle=$redirectStyle, routePrefix=$routePrefix, updated=$updated, updatedById=$updatedById, additionalProperties=$additionalProperties}"
}
