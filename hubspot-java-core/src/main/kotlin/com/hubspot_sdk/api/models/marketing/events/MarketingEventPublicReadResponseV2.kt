// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MarketingEventPublicReadResponseV2
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val customProperties: JsonField<List<CrmPropertyWrapper>>,
    private val eventName: JsonField<String>,
    private val objectId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val appInfo: JsonField<AppInfo>,
    private val attendees: JsonField<Int>,
    private val cancellations: JsonField<Int>,
    private val endDateTime: JsonField<OffsetDateTime>,
    private val eventCancelled: JsonField<Boolean>,
    private val eventCompleted: JsonField<Boolean>,
    private val eventDescription: JsonField<String>,
    private val eventOrganizer: JsonField<String>,
    private val eventStatus: JsonField<String>,
    private val eventType: JsonField<String>,
    private val eventUrl: JsonField<String>,
    private val externalEventId: JsonField<String>,
    private val noShows: JsonField<Int>,
    private val registrants: JsonField<Int>,
    private val startDateTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customProperties")
        @ExcludeMissing
        customProperties: JsonField<List<CrmPropertyWrapper>> = JsonMissing.of(),
        @JsonProperty("eventName") @ExcludeMissing eventName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("appInfo") @ExcludeMissing appInfo: JsonField<AppInfo> = JsonMissing.of(),
        @JsonProperty("attendees") @ExcludeMissing attendees: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cancellations")
        @ExcludeMissing
        cancellations: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("endDateTime")
        @ExcludeMissing
        endDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eventCancelled")
        @ExcludeMissing
        eventCancelled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("eventCompleted")
        @ExcludeMissing
        eventCompleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("eventDescription")
        @ExcludeMissing
        eventDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventOrganizer")
        @ExcludeMissing
        eventOrganizer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventStatus")
        @ExcludeMissing
        eventStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventType") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventUrl") @ExcludeMissing eventUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalEventId")
        @ExcludeMissing
        externalEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("noShows") @ExcludeMissing noShows: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("registrants") @ExcludeMissing registrants: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("startDateTime")
        @ExcludeMissing
        startDateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        createdAt,
        customProperties,
        eventName,
        objectId,
        updatedAt,
        appInfo,
        attendees,
        cancellations,
        endDateTime,
        eventCancelled,
        eventCompleted,
        eventDescription,
        eventOrganizer,
        eventStatus,
        eventType,
        eventUrl,
        externalEventId,
        noShows,
        registrants,
        startDateTime,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customProperties(): List<CrmPropertyWrapper> =
        customProperties.getRequired("customProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventName(): String = eventName.getRequired("eventName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appInfo(): Optional<AppInfo> = appInfo.getOptional("appInfo")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attendees(): Optional<Int> = attendees.getOptional("attendees")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellations(): Optional<Int> = cancellations.getOptional("cancellations")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDateTime(): Optional<OffsetDateTime> = endDateTime.getOptional("endDateTime")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventCancelled(): Optional<Boolean> = eventCancelled.getOptional("eventCancelled")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventCompleted(): Optional<Boolean> = eventCompleted.getOptional("eventCompleted")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventDescription(): Optional<String> = eventDescription.getOptional("eventDescription")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventOrganizer(): Optional<String> = eventOrganizer.getOptional("eventOrganizer")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventStatus(): Optional<String> = eventStatus.getOptional("eventStatus")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): Optional<String> = eventType.getOptional("eventType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventUrl(): Optional<String> = eventUrl.getOptional("eventUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalEventId(): Optional<String> = externalEventId.getOptional("externalEventId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noShows(): Optional<Int> = noShows.getOptional("noShows")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registrants(): Optional<Int> = registrants.getOptional("registrants")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDateTime(): Optional<OffsetDateTime> = startDateTime.getOptional("startDateTime")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customProperties].
     *
     * Unlike [customProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customProperties")
    @ExcludeMissing
    fun _customProperties(): JsonField<List<CrmPropertyWrapper>> = customProperties

    /**
     * Returns the raw JSON value of [eventName].
     *
     * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventName") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [appInfo].
     *
     * Unlike [appInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appInfo") @ExcludeMissing fun _appInfo(): JsonField<AppInfo> = appInfo

    /**
     * Returns the raw JSON value of [attendees].
     *
     * Unlike [attendees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attendees") @ExcludeMissing fun _attendees(): JsonField<Int> = attendees

    /**
     * Returns the raw JSON value of [cancellations].
     *
     * Unlike [cancellations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancellations")
    @ExcludeMissing
    fun _cancellations(): JsonField<Int> = cancellations

    /**
     * Returns the raw JSON value of [endDateTime].
     *
     * Unlike [endDateTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDateTime")
    @ExcludeMissing
    fun _endDateTime(): JsonField<OffsetDateTime> = endDateTime

    /**
     * Returns the raw JSON value of [eventCancelled].
     *
     * Unlike [eventCancelled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventCancelled")
    @ExcludeMissing
    fun _eventCancelled(): JsonField<Boolean> = eventCancelled

    /**
     * Returns the raw JSON value of [eventCompleted].
     *
     * Unlike [eventCompleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventCompleted")
    @ExcludeMissing
    fun _eventCompleted(): JsonField<Boolean> = eventCompleted

    /**
     * Returns the raw JSON value of [eventDescription].
     *
     * Unlike [eventDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eventDescription")
    @ExcludeMissing
    fun _eventDescription(): JsonField<String> = eventDescription

    /**
     * Returns the raw JSON value of [eventOrganizer].
     *
     * Unlike [eventOrganizer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventOrganizer")
    @ExcludeMissing
    fun _eventOrganizer(): JsonField<String> = eventOrganizer

    /**
     * Returns the raw JSON value of [eventStatus].
     *
     * Unlike [eventStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventStatus") @ExcludeMissing fun _eventStatus(): JsonField<String> = eventStatus

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    /**
     * Returns the raw JSON value of [eventUrl].
     *
     * Unlike [eventUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventUrl") @ExcludeMissing fun _eventUrl(): JsonField<String> = eventUrl

    /**
     * Returns the raw JSON value of [externalEventId].
     *
     * Unlike [externalEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalEventId")
    @ExcludeMissing
    fun _externalEventId(): JsonField<String> = externalEventId

    /**
     * Returns the raw JSON value of [noShows].
     *
     * Unlike [noShows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("noShows") @ExcludeMissing fun _noShows(): JsonField<Int> = noShows

    /**
     * Returns the raw JSON value of [registrants].
     *
     * Unlike [registrants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("registrants") @ExcludeMissing fun _registrants(): JsonField<Int> = registrants

    /**
     * Returns the raw JSON value of [startDateTime].
     *
     * Unlike [startDateTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDateTime")
    @ExcludeMissing
    fun _startDateTime(): JsonField<OffsetDateTime> = startDateTime

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
         * [MarketingEventPublicReadResponseV2].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .customProperties()
         * .eventName()
         * .objectId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventPublicReadResponseV2]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customProperties: JsonField<MutableList<CrmPropertyWrapper>>? = null
        private var eventName: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var appInfo: JsonField<AppInfo> = JsonMissing.of()
        private var attendees: JsonField<Int> = JsonMissing.of()
        private var cancellations: JsonField<Int> = JsonMissing.of()
        private var endDateTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventCancelled: JsonField<Boolean> = JsonMissing.of()
        private var eventCompleted: JsonField<Boolean> = JsonMissing.of()
        private var eventDescription: JsonField<String> = JsonMissing.of()
        private var eventOrganizer: JsonField<String> = JsonMissing.of()
        private var eventStatus: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<String> = JsonMissing.of()
        private var eventUrl: JsonField<String> = JsonMissing.of()
        private var externalEventId: JsonField<String> = JsonMissing.of()
        private var noShows: JsonField<Int> = JsonMissing.of()
        private var registrants: JsonField<Int> = JsonMissing.of()
        private var startDateTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketingEventPublicReadResponseV2: MarketingEventPublicReadResponseV2) =
            apply {
                createdAt = marketingEventPublicReadResponseV2.createdAt
                customProperties =
                    marketingEventPublicReadResponseV2.customProperties.map { it.toMutableList() }
                eventName = marketingEventPublicReadResponseV2.eventName
                objectId = marketingEventPublicReadResponseV2.objectId
                updatedAt = marketingEventPublicReadResponseV2.updatedAt
                appInfo = marketingEventPublicReadResponseV2.appInfo
                attendees = marketingEventPublicReadResponseV2.attendees
                cancellations = marketingEventPublicReadResponseV2.cancellations
                endDateTime = marketingEventPublicReadResponseV2.endDateTime
                eventCancelled = marketingEventPublicReadResponseV2.eventCancelled
                eventCompleted = marketingEventPublicReadResponseV2.eventCompleted
                eventDescription = marketingEventPublicReadResponseV2.eventDescription
                eventOrganizer = marketingEventPublicReadResponseV2.eventOrganizer
                eventStatus = marketingEventPublicReadResponseV2.eventStatus
                eventType = marketingEventPublicReadResponseV2.eventType
                eventUrl = marketingEventPublicReadResponseV2.eventUrl
                externalEventId = marketingEventPublicReadResponseV2.externalEventId
                noShows = marketingEventPublicReadResponseV2.noShows
                registrants = marketingEventPublicReadResponseV2.registrants
                startDateTime = marketingEventPublicReadResponseV2.startDateTime
                additionalProperties =
                    marketingEventPublicReadResponseV2.additionalProperties.toMutableMap()
            }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customProperties(customProperties: List<CrmPropertyWrapper>) =
            customProperties(JsonField.of(customProperties))

        /**
         * Sets [Builder.customProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customProperties] with a well-typed
         * `List<CrmPropertyWrapper>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun customProperties(customProperties: JsonField<List<CrmPropertyWrapper>>) = apply {
            this.customProperties = customProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [CrmPropertyWrapper] to [customProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomProperty(customProperty: CrmPropertyWrapper) = apply {
            customProperties =
                (customProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customProperties", it).add(customProperty)
                }
        }

        fun eventName(eventName: String) = eventName(JsonField.of(eventName))

        /**
         * Sets [Builder.eventName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun appInfo(appInfo: AppInfo) = appInfo(JsonField.of(appInfo))

        /**
         * Sets [Builder.appInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appInfo] with a well-typed [AppInfo] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appInfo(appInfo: JsonField<AppInfo>) = apply { this.appInfo = appInfo }

        fun attendees(attendees: Int) = attendees(JsonField.of(attendees))

        /**
         * Sets [Builder.attendees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendees] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun attendees(attendees: JsonField<Int>) = apply { this.attendees = attendees }

        fun cancellations(cancellations: Int) = cancellations(JsonField.of(cancellations))

        /**
         * Sets [Builder.cancellations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellations] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cancellations(cancellations: JsonField<Int>) = apply {
            this.cancellations = cancellations
        }

        fun endDateTime(endDateTime: OffsetDateTime) = endDateTime(JsonField.of(endDateTime))

        /**
         * Sets [Builder.endDateTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDateTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDateTime(endDateTime: JsonField<OffsetDateTime>) = apply {
            this.endDateTime = endDateTime
        }

        fun eventCancelled(eventCancelled: Boolean) = eventCancelled(JsonField.of(eventCancelled))

        /**
         * Sets [Builder.eventCancelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventCancelled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventCancelled(eventCancelled: JsonField<Boolean>) = apply {
            this.eventCancelled = eventCancelled
        }

        fun eventCompleted(eventCompleted: Boolean) = eventCompleted(JsonField.of(eventCompleted))

        /**
         * Sets [Builder.eventCompleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventCompleted] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventCompleted(eventCompleted: JsonField<Boolean>) = apply {
            this.eventCompleted = eventCompleted
        }

        fun eventDescription(eventDescription: String) =
            eventDescription(JsonField.of(eventDescription))

        /**
         * Sets [Builder.eventDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventDescription(eventDescription: JsonField<String>) = apply {
            this.eventDescription = eventDescription
        }

        fun eventOrganizer(eventOrganizer: String) = eventOrganizer(JsonField.of(eventOrganizer))

        /**
         * Sets [Builder.eventOrganizer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventOrganizer] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventOrganizer(eventOrganizer: JsonField<String>) = apply {
            this.eventOrganizer = eventOrganizer
        }

        fun eventStatus(eventStatus: String) = eventStatus(JsonField.of(eventStatus))

        /**
         * Sets [Builder.eventStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventStatus(eventStatus: JsonField<String>) = apply { this.eventStatus = eventStatus }

        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        fun eventUrl(eventUrl: String) = eventUrl(JsonField.of(eventUrl))

        /**
         * Sets [Builder.eventUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventUrl(eventUrl: JsonField<String>) = apply { this.eventUrl = eventUrl }

        fun externalEventId(externalEventId: String) =
            externalEventId(JsonField.of(externalEventId))

        /**
         * Sets [Builder.externalEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalEventId(externalEventId: JsonField<String>) = apply {
            this.externalEventId = externalEventId
        }

        fun noShows(noShows: Int) = noShows(JsonField.of(noShows))

        /**
         * Sets [Builder.noShows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noShows] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun noShows(noShows: JsonField<Int>) = apply { this.noShows = noShows }

        fun registrants(registrants: Int) = registrants(JsonField.of(registrants))

        /**
         * Sets [Builder.registrants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrants] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun registrants(registrants: JsonField<Int>) = apply { this.registrants = registrants }

        fun startDateTime(startDateTime: OffsetDateTime) =
            startDateTime(JsonField.of(startDateTime))

        /**
         * Sets [Builder.startDateTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDateTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDateTime(startDateTime: JsonField<OffsetDateTime>) = apply {
            this.startDateTime = startDateTime
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
         * Returns an immutable instance of [MarketingEventPublicReadResponseV2].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .customProperties()
         * .eventName()
         * .objectId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventPublicReadResponseV2 =
            MarketingEventPublicReadResponseV2(
                checkRequired("createdAt", createdAt),
                checkRequired("customProperties", customProperties).map { it.toImmutable() },
                checkRequired("eventName", eventName),
                checkRequired("objectId", objectId),
                checkRequired("updatedAt", updatedAt),
                appInfo,
                attendees,
                cancellations,
                endDateTime,
                eventCancelled,
                eventCompleted,
                eventDescription,
                eventOrganizer,
                eventStatus,
                eventType,
                eventUrl,
                externalEventId,
                noShows,
                registrants,
                startDateTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketingEventPublicReadResponseV2 = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        customProperties().forEach { it.validate() }
        eventName()
        objectId()
        updatedAt()
        appInfo().ifPresent { it.validate() }
        attendees()
        cancellations()
        endDateTime()
        eventCancelled()
        eventCompleted()
        eventDescription()
        eventOrganizer()
        eventStatus()
        eventType()
        eventUrl()
        externalEventId()
        noShows()
        registrants()
        startDateTime()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (customProperties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (eventName.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (appInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (attendees.asKnown().isPresent) 1 else 0) +
            (if (cancellations.asKnown().isPresent) 1 else 0) +
            (if (endDateTime.asKnown().isPresent) 1 else 0) +
            (if (eventCancelled.asKnown().isPresent) 1 else 0) +
            (if (eventCompleted.asKnown().isPresent) 1 else 0) +
            (if (eventDescription.asKnown().isPresent) 1 else 0) +
            (if (eventOrganizer.asKnown().isPresent) 1 else 0) +
            (if (eventStatus.asKnown().isPresent) 1 else 0) +
            (if (eventType.asKnown().isPresent) 1 else 0) +
            (if (eventUrl.asKnown().isPresent) 1 else 0) +
            (if (externalEventId.asKnown().isPresent) 1 else 0) +
            (if (noShows.asKnown().isPresent) 1 else 0) +
            (if (registrants.asKnown().isPresent) 1 else 0) +
            (if (startDateTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventPublicReadResponseV2 &&
            createdAt == other.createdAt &&
            customProperties == other.customProperties &&
            eventName == other.eventName &&
            objectId == other.objectId &&
            updatedAt == other.updatedAt &&
            appInfo == other.appInfo &&
            attendees == other.attendees &&
            cancellations == other.cancellations &&
            endDateTime == other.endDateTime &&
            eventCancelled == other.eventCancelled &&
            eventCompleted == other.eventCompleted &&
            eventDescription == other.eventDescription &&
            eventOrganizer == other.eventOrganizer &&
            eventStatus == other.eventStatus &&
            eventType == other.eventType &&
            eventUrl == other.eventUrl &&
            externalEventId == other.externalEventId &&
            noShows == other.noShows &&
            registrants == other.registrants &&
            startDateTime == other.startDateTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            customProperties,
            eventName,
            objectId,
            updatedAt,
            appInfo,
            attendees,
            cancellations,
            endDateTime,
            eventCancelled,
            eventCompleted,
            eventDescription,
            eventOrganizer,
            eventStatus,
            eventType,
            eventUrl,
            externalEventId,
            noShows,
            registrants,
            startDateTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventPublicReadResponseV2{createdAt=$createdAt, customProperties=$customProperties, eventName=$eventName, objectId=$objectId, updatedAt=$updatedAt, appInfo=$appInfo, attendees=$attendees, cancellations=$cancellations, endDateTime=$endDateTime, eventCancelled=$eventCancelled, eventCompleted=$eventCompleted, eventDescription=$eventDescription, eventOrganizer=$eventOrganizer, eventStatus=$eventStatus, eventType=$eventType, eventUrl=$eventUrl, externalEventId=$externalEventId, noShows=$noShows, registrants=$registrants, startDateTime=$startDateTime, additionalProperties=$additionalProperties}"
}
