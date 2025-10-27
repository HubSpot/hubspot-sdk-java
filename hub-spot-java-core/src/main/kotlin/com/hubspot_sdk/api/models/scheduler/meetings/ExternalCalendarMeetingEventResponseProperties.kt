// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalCalendarMeetingEventResponseProperties
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hsEngagementSource: JsonField<HsEngagementSource>,
    private val hsEngagementSourceId: JsonField<String>,
    private val hsMeetingEndTime: JsonField<OffsetDateTime>,
    private val hsMeetingOutcome: JsonField<String>,
    private val hsMeetingStartTime: JsonField<OffsetDateTime>,
    private val hsMeetingTitle: JsonField<String>,
    private val hsTimestamp: JsonField<OffsetDateTime>,
    private val hsActivityType: JsonField<String>,
    private val hsAttachmentIds: JsonField<List<String>>,
    private val hsAttendeeOwnerIds: JsonField<List<String>>,
    private val hsIncludeDescriptionInReminder: JsonField<String>,
    private val hsInternalMeetingNotes: JsonField<String>,
    private val hsMeetingBody: JsonField<String>,
    private val hsMeetingExternalUrl: JsonField<String>,
    private val hsMeetingLocation: JsonField<String>,
    private val hsMeetingLocationType: JsonField<HsMeetingLocationType>,
    private val hsUniqueId: JsonField<String>,
    private val hubspotOwnerId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hs_engagement_source")
        @ExcludeMissing
        hsEngagementSource: JsonField<HsEngagementSource> = JsonMissing.of(),
        @JsonProperty("hs_engagement_source_id")
        @ExcludeMissing
        hsEngagementSourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_end_time")
        @ExcludeMissing
        hsMeetingEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hs_meeting_outcome")
        @ExcludeMissing
        hsMeetingOutcome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_start_time")
        @ExcludeMissing
        hsMeetingStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hs_meeting_title")
        @ExcludeMissing
        hsMeetingTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_timestamp")
        @ExcludeMissing
        hsTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hs_activity_type")
        @ExcludeMissing
        hsActivityType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_attachment_ids")
        @ExcludeMissing
        hsAttachmentIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("hs_attendee_owner_ids")
        @ExcludeMissing
        hsAttendeeOwnerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("hs_include_description_in_reminder")
        @ExcludeMissing
        hsIncludeDescriptionInReminder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_internal_meeting_notes")
        @ExcludeMissing
        hsInternalMeetingNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_body")
        @ExcludeMissing
        hsMeetingBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_external_url")
        @ExcludeMissing
        hsMeetingExternalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_location")
        @ExcludeMissing
        hsMeetingLocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_location_type")
        @ExcludeMissing
        hsMeetingLocationType: JsonField<HsMeetingLocationType> = JsonMissing.of(),
        @JsonProperty("hs_unique_id")
        @ExcludeMissing
        hsUniqueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hubspot_owner_id")
        @ExcludeMissing
        hubspotOwnerId: JsonField<String> = JsonMissing.of(),
    ) : this(
        hsEngagementSource,
        hsEngagementSourceId,
        hsMeetingEndTime,
        hsMeetingOutcome,
        hsMeetingStartTime,
        hsMeetingTitle,
        hsTimestamp,
        hsActivityType,
        hsAttachmentIds,
        hsAttendeeOwnerIds,
        hsIncludeDescriptionInReminder,
        hsInternalMeetingNotes,
        hsMeetingBody,
        hsMeetingExternalUrl,
        hsMeetingLocation,
        hsMeetingLocationType,
        hsUniqueId,
        hubspotOwnerId,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsEngagementSource(): HsEngagementSource =
        hsEngagementSource.getRequired("hs_engagement_source")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsEngagementSourceId(): String = hsEngagementSourceId.getRequired("hs_engagement_source_id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingEndTime(): OffsetDateTime = hsMeetingEndTime.getRequired("hs_meeting_end_time")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingOutcome(): String = hsMeetingOutcome.getRequired("hs_meeting_outcome")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingStartTime(): OffsetDateTime =
        hsMeetingStartTime.getRequired("hs_meeting_start_time")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingTitle(): String = hsMeetingTitle.getRequired("hs_meeting_title")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsTimestamp(): OffsetDateTime = hsTimestamp.getRequired("hs_timestamp")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsActivityType(): Optional<String> = hsActivityType.getOptional("hs_activity_type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsAttachmentIds(): Optional<List<String>> = hsAttachmentIds.getOptional("hs_attachment_ids")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsAttendeeOwnerIds(): Optional<List<String>> =
        hsAttendeeOwnerIds.getOptional("hs_attendee_owner_ids")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsIncludeDescriptionInReminder(): Optional<String> =
        hsIncludeDescriptionInReminder.getOptional("hs_include_description_in_reminder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsInternalMeetingNotes(): Optional<String> =
        hsInternalMeetingNotes.getOptional("hs_internal_meeting_notes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingBody(): Optional<String> = hsMeetingBody.getOptional("hs_meeting_body")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingExternalUrl(): Optional<String> =
        hsMeetingExternalUrl.getOptional("hs_meeting_external_url")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingLocation(): Optional<String> = hsMeetingLocation.getOptional("hs_meeting_location")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingLocationType(): Optional<HsMeetingLocationType> =
        hsMeetingLocationType.getOptional("hs_meeting_location_type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsUniqueId(): Optional<String> = hsUniqueId.getOptional("hs_unique_id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubspotOwnerId(): Optional<String> = hubspotOwnerId.getOptional("hubspot_owner_id")

    /**
     * Returns the raw JSON value of [hsEngagementSource].
     *
     * Unlike [hsEngagementSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_engagement_source")
    @ExcludeMissing
    fun _hsEngagementSource(): JsonField<HsEngagementSource> = hsEngagementSource

    /**
     * Returns the raw JSON value of [hsEngagementSourceId].
     *
     * Unlike [hsEngagementSourceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_engagement_source_id")
    @ExcludeMissing
    fun _hsEngagementSourceId(): JsonField<String> = hsEngagementSourceId

    /**
     * Returns the raw JSON value of [hsMeetingEndTime].
     *
     * Unlike [hsMeetingEndTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_meeting_end_time")
    @ExcludeMissing
    fun _hsMeetingEndTime(): JsonField<OffsetDateTime> = hsMeetingEndTime

    /**
     * Returns the raw JSON value of [hsMeetingOutcome].
     *
     * Unlike [hsMeetingOutcome], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_meeting_outcome")
    @ExcludeMissing
    fun _hsMeetingOutcome(): JsonField<String> = hsMeetingOutcome

    /**
     * Returns the raw JSON value of [hsMeetingStartTime].
     *
     * Unlike [hsMeetingStartTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_meeting_start_time")
    @ExcludeMissing
    fun _hsMeetingStartTime(): JsonField<OffsetDateTime> = hsMeetingStartTime

    /**
     * Returns the raw JSON value of [hsMeetingTitle].
     *
     * Unlike [hsMeetingTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hs_meeting_title")
    @ExcludeMissing
    fun _hsMeetingTitle(): JsonField<String> = hsMeetingTitle

    /**
     * Returns the raw JSON value of [hsTimestamp].
     *
     * Unlike [hsTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hs_timestamp")
    @ExcludeMissing
    fun _hsTimestamp(): JsonField<OffsetDateTime> = hsTimestamp

    /**
     * Returns the raw JSON value of [hsActivityType].
     *
     * Unlike [hsActivityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hs_activity_type")
    @ExcludeMissing
    fun _hsActivityType(): JsonField<String> = hsActivityType

    /**
     * Returns the raw JSON value of [hsAttachmentIds].
     *
     * Unlike [hsAttachmentIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hs_attachment_ids")
    @ExcludeMissing
    fun _hsAttachmentIds(): JsonField<List<String>> = hsAttachmentIds

    /**
     * Returns the raw JSON value of [hsAttendeeOwnerIds].
     *
     * Unlike [hsAttendeeOwnerIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_attendee_owner_ids")
    @ExcludeMissing
    fun _hsAttendeeOwnerIds(): JsonField<List<String>> = hsAttendeeOwnerIds

    /**
     * Returns the raw JSON value of [hsIncludeDescriptionInReminder].
     *
     * Unlike [hsIncludeDescriptionInReminder], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hs_include_description_in_reminder")
    @ExcludeMissing
    fun _hsIncludeDescriptionInReminder(): JsonField<String> = hsIncludeDescriptionInReminder

    /**
     * Returns the raw JSON value of [hsInternalMeetingNotes].
     *
     * Unlike [hsInternalMeetingNotes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("hs_internal_meeting_notes")
    @ExcludeMissing
    fun _hsInternalMeetingNotes(): JsonField<String> = hsInternalMeetingNotes

    /**
     * Returns the raw JSON value of [hsMeetingBody].
     *
     * Unlike [hsMeetingBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hs_meeting_body")
    @ExcludeMissing
    fun _hsMeetingBody(): JsonField<String> = hsMeetingBody

    /**
     * Returns the raw JSON value of [hsMeetingExternalUrl].
     *
     * Unlike [hsMeetingExternalUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_meeting_external_url")
    @ExcludeMissing
    fun _hsMeetingExternalUrl(): JsonField<String> = hsMeetingExternalUrl

    /**
     * Returns the raw JSON value of [hsMeetingLocation].
     *
     * Unlike [hsMeetingLocation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_meeting_location")
    @ExcludeMissing
    fun _hsMeetingLocation(): JsonField<String> = hsMeetingLocation

    /**
     * Returns the raw JSON value of [hsMeetingLocationType].
     *
     * Unlike [hsMeetingLocationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hs_meeting_location_type")
    @ExcludeMissing
    fun _hsMeetingLocationType(): JsonField<HsMeetingLocationType> = hsMeetingLocationType

    /**
     * Returns the raw JSON value of [hsUniqueId].
     *
     * Unlike [hsUniqueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hs_unique_id") @ExcludeMissing fun _hsUniqueId(): JsonField<String> = hsUniqueId

    /**
     * Returns the raw JSON value of [hubspotOwnerId].
     *
     * Unlike [hubspotOwnerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspot_owner_id")
    @ExcludeMissing
    fun _hubspotOwnerId(): JsonField<String> = hubspotOwnerId

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
         * [ExternalCalendarMeetingEventResponseProperties].
         *
         * The following fields are required:
         * ```java
         * .hsEngagementSource()
         * .hsEngagementSourceId()
         * .hsMeetingEndTime()
         * .hsMeetingOutcome()
         * .hsMeetingStartTime()
         * .hsMeetingTitle()
         * .hsTimestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalCalendarMeetingEventResponseProperties]. */
    class Builder internal constructor() {

        private var hsEngagementSource: JsonField<HsEngagementSource>? = null
        private var hsEngagementSourceId: JsonField<String>? = null
        private var hsMeetingEndTime: JsonField<OffsetDateTime>? = null
        private var hsMeetingOutcome: JsonField<String>? = null
        private var hsMeetingStartTime: JsonField<OffsetDateTime>? = null
        private var hsMeetingTitle: JsonField<String>? = null
        private var hsTimestamp: JsonField<OffsetDateTime>? = null
        private var hsActivityType: JsonField<String> = JsonMissing.of()
        private var hsAttachmentIds: JsonField<MutableList<String>>? = null
        private var hsAttendeeOwnerIds: JsonField<MutableList<String>>? = null
        private var hsIncludeDescriptionInReminder: JsonField<String> = JsonMissing.of()
        private var hsInternalMeetingNotes: JsonField<String> = JsonMissing.of()
        private var hsMeetingBody: JsonField<String> = JsonMissing.of()
        private var hsMeetingExternalUrl: JsonField<String> = JsonMissing.of()
        private var hsMeetingLocation: JsonField<String> = JsonMissing.of()
        private var hsMeetingLocationType: JsonField<HsMeetingLocationType> = JsonMissing.of()
        private var hsUniqueId: JsonField<String> = JsonMissing.of()
        private var hubspotOwnerId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalCalendarMeetingEventResponseProperties:
                ExternalCalendarMeetingEventResponseProperties
        ) = apply {
            hsEngagementSource = externalCalendarMeetingEventResponseProperties.hsEngagementSource
            hsEngagementSourceId =
                externalCalendarMeetingEventResponseProperties.hsEngagementSourceId
            hsMeetingEndTime = externalCalendarMeetingEventResponseProperties.hsMeetingEndTime
            hsMeetingOutcome = externalCalendarMeetingEventResponseProperties.hsMeetingOutcome
            hsMeetingStartTime = externalCalendarMeetingEventResponseProperties.hsMeetingStartTime
            hsMeetingTitle = externalCalendarMeetingEventResponseProperties.hsMeetingTitle
            hsTimestamp = externalCalendarMeetingEventResponseProperties.hsTimestamp
            hsActivityType = externalCalendarMeetingEventResponseProperties.hsActivityType
            hsAttachmentIds =
                externalCalendarMeetingEventResponseProperties.hsAttachmentIds.map {
                    it.toMutableList()
                }
            hsAttendeeOwnerIds =
                externalCalendarMeetingEventResponseProperties.hsAttendeeOwnerIds.map {
                    it.toMutableList()
                }
            hsIncludeDescriptionInReminder =
                externalCalendarMeetingEventResponseProperties.hsIncludeDescriptionInReminder
            hsInternalMeetingNotes =
                externalCalendarMeetingEventResponseProperties.hsInternalMeetingNotes
            hsMeetingBody = externalCalendarMeetingEventResponseProperties.hsMeetingBody
            hsMeetingExternalUrl =
                externalCalendarMeetingEventResponseProperties.hsMeetingExternalUrl
            hsMeetingLocation = externalCalendarMeetingEventResponseProperties.hsMeetingLocation
            hsMeetingLocationType =
                externalCalendarMeetingEventResponseProperties.hsMeetingLocationType
            hsUniqueId = externalCalendarMeetingEventResponseProperties.hsUniqueId
            hubspotOwnerId = externalCalendarMeetingEventResponseProperties.hubspotOwnerId
            additionalProperties =
                externalCalendarMeetingEventResponseProperties.additionalProperties.toMutableMap()
        }

        fun hsEngagementSource(hsEngagementSource: HsEngagementSource) =
            hsEngagementSource(JsonField.of(hsEngagementSource))

        /**
         * Sets [Builder.hsEngagementSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsEngagementSource] with a well-typed
         * [HsEngagementSource] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun hsEngagementSource(hsEngagementSource: JsonField<HsEngagementSource>) = apply {
            this.hsEngagementSource = hsEngagementSource
        }

        fun hsEngagementSourceId(hsEngagementSourceId: String) =
            hsEngagementSourceId(JsonField.of(hsEngagementSourceId))

        /**
         * Sets [Builder.hsEngagementSourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsEngagementSourceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsEngagementSourceId(hsEngagementSourceId: JsonField<String>) = apply {
            this.hsEngagementSourceId = hsEngagementSourceId
        }

        fun hsMeetingEndTime(hsMeetingEndTime: OffsetDateTime) =
            hsMeetingEndTime(JsonField.of(hsMeetingEndTime))

        /**
         * Sets [Builder.hsMeetingEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingEndTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hsMeetingEndTime(hsMeetingEndTime: JsonField<OffsetDateTime>) = apply {
            this.hsMeetingEndTime = hsMeetingEndTime
        }

        fun hsMeetingOutcome(hsMeetingOutcome: String) =
            hsMeetingOutcome(JsonField.of(hsMeetingOutcome))

        /**
         * Sets [Builder.hsMeetingOutcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingOutcome] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsMeetingOutcome(hsMeetingOutcome: JsonField<String>) = apply {
            this.hsMeetingOutcome = hsMeetingOutcome
        }

        fun hsMeetingStartTime(hsMeetingStartTime: OffsetDateTime) =
            hsMeetingStartTime(JsonField.of(hsMeetingStartTime))

        /**
         * Sets [Builder.hsMeetingStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hsMeetingStartTime(hsMeetingStartTime: JsonField<OffsetDateTime>) = apply {
            this.hsMeetingStartTime = hsMeetingStartTime
        }

        fun hsMeetingTitle(hsMeetingTitle: String) = hsMeetingTitle(JsonField.of(hsMeetingTitle))

        /**
         * Sets [Builder.hsMeetingTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingTitle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsMeetingTitle(hsMeetingTitle: JsonField<String>) = apply {
            this.hsMeetingTitle = hsMeetingTitle
        }

        fun hsTimestamp(hsTimestamp: OffsetDateTime) = hsTimestamp(JsonField.of(hsTimestamp))

        /**
         * Sets [Builder.hsTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsTimestamp(hsTimestamp: JsonField<OffsetDateTime>) = apply {
            this.hsTimestamp = hsTimestamp
        }

        fun hsActivityType(hsActivityType: String) = hsActivityType(JsonField.of(hsActivityType))

        /**
         * Sets [Builder.hsActivityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsActivityType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsActivityType(hsActivityType: JsonField<String>) = apply {
            this.hsActivityType = hsActivityType
        }

        fun hsAttachmentIds(hsAttachmentIds: List<String>) =
            hsAttachmentIds(JsonField.of(hsAttachmentIds))

        /**
         * Sets [Builder.hsAttachmentIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsAttachmentIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsAttachmentIds(hsAttachmentIds: JsonField<List<String>>) = apply {
            this.hsAttachmentIds = hsAttachmentIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [hsAttachmentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHsAttachmentId(hsAttachmentId: String) = apply {
            hsAttachmentIds =
                (hsAttachmentIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("hsAttachmentIds", it).add(hsAttachmentId)
                }
        }

        fun hsAttendeeOwnerIds(hsAttendeeOwnerIds: List<String>) =
            hsAttendeeOwnerIds(JsonField.of(hsAttendeeOwnerIds))

        /**
         * Sets [Builder.hsAttendeeOwnerIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsAttendeeOwnerIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hsAttendeeOwnerIds(hsAttendeeOwnerIds: JsonField<List<String>>) = apply {
            this.hsAttendeeOwnerIds = hsAttendeeOwnerIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [hsAttendeeOwnerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHsAttendeeOwnerId(hsAttendeeOwnerId: String) = apply {
            hsAttendeeOwnerIds =
                (hsAttendeeOwnerIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("hsAttendeeOwnerIds", it).add(hsAttendeeOwnerId)
                }
        }

        fun hsIncludeDescriptionInReminder(hsIncludeDescriptionInReminder: String) =
            hsIncludeDescriptionInReminder(JsonField.of(hsIncludeDescriptionInReminder))

        /**
         * Sets [Builder.hsIncludeDescriptionInReminder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsIncludeDescriptionInReminder] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun hsIncludeDescriptionInReminder(hsIncludeDescriptionInReminder: JsonField<String>) =
            apply {
                this.hsIncludeDescriptionInReminder = hsIncludeDescriptionInReminder
            }

        fun hsInternalMeetingNotes(hsInternalMeetingNotes: String) =
            hsInternalMeetingNotes(JsonField.of(hsInternalMeetingNotes))

        /**
         * Sets [Builder.hsInternalMeetingNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsInternalMeetingNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsInternalMeetingNotes(hsInternalMeetingNotes: JsonField<String>) = apply {
            this.hsInternalMeetingNotes = hsInternalMeetingNotes
        }

        fun hsMeetingBody(hsMeetingBody: String) = hsMeetingBody(JsonField.of(hsMeetingBody))

        /**
         * Sets [Builder.hsMeetingBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingBody] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hsMeetingBody(hsMeetingBody: JsonField<String>) = apply {
            this.hsMeetingBody = hsMeetingBody
        }

        fun hsMeetingExternalUrl(hsMeetingExternalUrl: String) =
            hsMeetingExternalUrl(JsonField.of(hsMeetingExternalUrl))

        /**
         * Sets [Builder.hsMeetingExternalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingExternalUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsMeetingExternalUrl(hsMeetingExternalUrl: JsonField<String>) = apply {
            this.hsMeetingExternalUrl = hsMeetingExternalUrl
        }

        fun hsMeetingLocation(hsMeetingLocation: String) =
            hsMeetingLocation(JsonField.of(hsMeetingLocation))

        /**
         * Sets [Builder.hsMeetingLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingLocation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hsMeetingLocation(hsMeetingLocation: JsonField<String>) = apply {
            this.hsMeetingLocation = hsMeetingLocation
        }

        fun hsMeetingLocationType(hsMeetingLocationType: HsMeetingLocationType) =
            hsMeetingLocationType(JsonField.of(hsMeetingLocationType))

        /**
         * Sets [Builder.hsMeetingLocationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsMeetingLocationType] with a well-typed
         * [HsMeetingLocationType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun hsMeetingLocationType(hsMeetingLocationType: JsonField<HsMeetingLocationType>) = apply {
            this.hsMeetingLocationType = hsMeetingLocationType
        }

        fun hsUniqueId(hsUniqueId: String) = hsUniqueId(JsonField.of(hsUniqueId))

        /**
         * Sets [Builder.hsUniqueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsUniqueId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hsUniqueId(hsUniqueId: JsonField<String>) = apply { this.hsUniqueId = hsUniqueId }

        fun hubspotOwnerId(hubspotOwnerId: String) = hubspotOwnerId(JsonField.of(hubspotOwnerId))

        /**
         * Sets [Builder.hubspotOwnerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubspotOwnerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hubspotOwnerId(hubspotOwnerId: JsonField<String>) = apply {
            this.hubspotOwnerId = hubspotOwnerId
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
         * Returns an immutable instance of [ExternalCalendarMeetingEventResponseProperties].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hsEngagementSource()
         * .hsEngagementSourceId()
         * .hsMeetingEndTime()
         * .hsMeetingOutcome()
         * .hsMeetingStartTime()
         * .hsMeetingTitle()
         * .hsTimestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalCalendarMeetingEventResponseProperties =
            ExternalCalendarMeetingEventResponseProperties(
                checkRequired("hsEngagementSource", hsEngagementSource),
                checkRequired("hsEngagementSourceId", hsEngagementSourceId),
                checkRequired("hsMeetingEndTime", hsMeetingEndTime),
                checkRequired("hsMeetingOutcome", hsMeetingOutcome),
                checkRequired("hsMeetingStartTime", hsMeetingStartTime),
                checkRequired("hsMeetingTitle", hsMeetingTitle),
                checkRequired("hsTimestamp", hsTimestamp),
                hsActivityType,
                (hsAttachmentIds ?: JsonMissing.of()).map { it.toImmutable() },
                (hsAttendeeOwnerIds ?: JsonMissing.of()).map { it.toImmutable() },
                hsIncludeDescriptionInReminder,
                hsInternalMeetingNotes,
                hsMeetingBody,
                hsMeetingExternalUrl,
                hsMeetingLocation,
                hsMeetingLocationType,
                hsUniqueId,
                hubspotOwnerId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalCalendarMeetingEventResponseProperties = apply {
        if (validated) {
            return@apply
        }

        hsEngagementSource().validate()
        hsEngagementSourceId()
        hsMeetingEndTime()
        hsMeetingOutcome()
        hsMeetingStartTime()
        hsMeetingTitle()
        hsTimestamp()
        hsActivityType()
        hsAttachmentIds()
        hsAttendeeOwnerIds()
        hsIncludeDescriptionInReminder()
        hsInternalMeetingNotes()
        hsMeetingBody()
        hsMeetingExternalUrl()
        hsMeetingLocation()
        hsMeetingLocationType().ifPresent { it.validate() }
        hsUniqueId()
        hubspotOwnerId()
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
        (hsEngagementSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hsEngagementSourceId.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingEndTime.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingOutcome.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingStartTime.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingTitle.asKnown().isPresent) 1 else 0) +
            (if (hsTimestamp.asKnown().isPresent) 1 else 0) +
            (if (hsActivityType.asKnown().isPresent) 1 else 0) +
            (hsAttachmentIds.asKnown().getOrNull()?.size ?: 0) +
            (hsAttendeeOwnerIds.asKnown().getOrNull()?.size ?: 0) +
            (if (hsIncludeDescriptionInReminder.asKnown().isPresent) 1 else 0) +
            (if (hsInternalMeetingNotes.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingBody.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingExternalUrl.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingLocation.asKnown().isPresent) 1 else 0) +
            (hsMeetingLocationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hsUniqueId.asKnown().isPresent) 1 else 0) +
            (if (hubspotOwnerId.asKnown().isPresent) 1 else 0)

    class HsEngagementSource
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

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val API = of("API")

            @JvmField val FORM = of("FORM")

            @JvmField val ANALYTICS = of("ANALYTICS")

            @JvmField val MIGRATION = of("MIGRATION")

            @JvmField val SALESFORCE = of("SALESFORCE")

            @JvmField val INTEGRATION = of("INTEGRATION")

            @JvmField val CONTACTS_WEB = of("CONTACTS_WEB")

            @JvmField val WAL_INCREMENTAL = of("WAL_INCREMENTAL")

            @JvmField val TASK = of("TASK")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val WORKFLOWS = of("WORKFLOWS")

            @JvmField val CALCULATED = of("CALCULATED")

            @JvmField val SOCIAL = of("SOCIAL")

            @JvmField val BATCH_UPDATE = of("BATCH_UPDATE")

            @JvmField val SIGNALS = of("SIGNALS")

            @JvmField val BIDEN = of("BIDEN")

            @JvmField val DEFAULT = of("DEFAULT")

            @JvmField val COMPANIES = of("COMPANIES")

            @JvmField val DEALS = of("DEALS")

            @JvmField val ASSISTS = of("ASSISTS")

            @JvmField val PRESENTATIONS = of("PRESENTATIONS")

            @JvmField val TALLY = of("TALLY")

            @JvmField val SIDEKICK = of("SIDEKICK")

            @JvmField val CRM_UI = of("CRM_UI")

            @JvmField val MERGE_CONTACTS = of("MERGE_CONTACTS")

            @JvmField val PORTAL_USER_ASSOCIATOR = of("PORTAL_USER_ASSOCIATOR")

            @JvmField val INTEGRATIONS_PLATFORM = of("INTEGRATIONS_PLATFORM")

            @JvmField val BCC_TO_CRM = of("BCC_TO_CRM")

            @JvmField val FORWARD_TO_CRM = of("FORWARD_TO_CRM")

            @JvmField val ENGAGEMENTS = of("ENGAGEMENTS")

            @JvmField val SALES = of("SALES")

            @JvmField val HEISENBERG = of("HEISENBERG")

            @JvmField val LEADIN = of("LEADIN")

            @JvmField val GMAIL_INTEGRATION = of("GMAIL_INTEGRATION")

            @JvmField val ACADEMY = of("ACADEMY")

            @JvmField val SALES_MESSAGES = of("SALES_MESSAGES")

            @JvmField val AVATARS_SERVICE = of("AVATARS_SERVICE")

            @JvmField val MERGE_COMPANIES = of("MERGE_COMPANIES")

            @JvmField val SEQUENCES = of("SEQUENCES")

            @JvmField val COMPANY_FAMILIES = of("COMPANY_FAMILIES")

            @JvmField val MOBILE_IOS = of("MOBILE_IOS")

            @JvmField val MOBILE_ANDROID = of("MOBILE_ANDROID")

            @JvmField val CONTACTS = of("CONTACTS")

            @JvmField val ASSOCIATIONS = of("ASSOCIATIONS")

            @JvmField val EXTENSION = of("EXTENSION")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmField val BOT = of("BOT")

            @JvmField val INTEGRATIONS_SYNC = of("INTEGRATIONS_SYNC")

            @JvmField val AUTOMATION_PLATFORM = of("AUTOMATION_PLATFORM")

            @JvmField val CONVERSATIONS = of("CONVERSATIONS")

            @JvmField val EMAIL_INTEGRATION = of("EMAIL_INTEGRATION")

            @JvmField val CONTENT_MEMBERSHIP = of("CONTENT_MEMBERSHIP")

            @JvmField val QUOTES = of("QUOTES")

            @JvmField val BET_ASSIGNMENT = of("BET_ASSIGNMENT")

            @JvmField val QUOTAS = of("QUOTAS")

            @JvmField val BET_CRM_CONNECTOR = of("BET_CRM_CONNECTOR")

            @JvmField val MEETINGS = of("MEETINGS")

            @JvmField val MERGE_OBJECTS = of("MERGE_OBJECTS")

            @JvmField val RECYCLING_BIN = of("RECYCLING_BIN")

            @JvmField val ADS = of("ADS")

            @JvmField val AI_GROUP = of("AI_GROUP")

            @JvmField val COMMUNICATOR = of("COMMUNICATOR")

            @JvmField val SETTINGS = of("SETTINGS")

            @JvmField val PROPERTY_SETTINGS = of("PROPERTY_SETTINGS")

            @JvmField val PIPELINE_SETTINGS = of("PIPELINE_SETTINGS")

            @JvmField val COMPANY_INSIGHTS = of("COMPANY_INSIGHTS")

            @JvmField val BEHAVIORAL_EVENTS = of("BEHAVIORAL_EVENTS")

            @JvmField val PAYMENTS = of("PAYMENTS")

            @JvmField val GOALS = of("GOALS")

            @JvmField val PORTAL_OBJECT_SYNC = of("PORTAL_OBJECT_SYNC")

            @JvmField val APPROVALS = of("APPROVALS")

            @JvmField val FILE_MANAGER = of("FILE_MANAGER")

            @JvmField val MARKETPLACE = of("MARKETPLACE")

            @JvmField val INTERNAL_PROCESSING = of("INTERNAL_PROCESSING")

            @JvmField val FORECASTING = of("FORECASTING")

            @JvmField val SLACK_INTEGRATION = of("SLACK_INTEGRATION")

            @JvmField val CRM_UI_BULK_ACTION = of("CRM_UI_BULK_ACTION")

            @JvmField val WORKFLOW_CONTACT_DELETE_ACTION = of("WORKFLOW_CONTACT_DELETE_ACTION")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val PLAYBOOKS = of("PLAYBOOKS")

            @JvmField val CHATSPOT = of("CHATSPOT")

            @JvmField val FLYWHEEL_PRODUCT_DATA_SYNC = of("FLYWHEEL_PRODUCT_DATA_SYNC")

            @JvmField val HELP_DESK = of("HELP_DESK")

            @JvmField val BILLING = of("BILLING")

            @JvmField val DATA_ENRICHMENT = of("DATA_ENRICHMENT")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val MICROAPPS = of("MICROAPPS")

            @JvmField val INTENT = of("INTENT")

            @JvmField val PROSPECTING_AGENT = of("PROSPECTING_AGENT")

            @JvmField val CENTRAL_EXCHANGE_RATES = of("CENTRAL_EXCHANGE_RATES")

            @JvmField val HELP_DESK_AI = of("HELP_DESK_AI")

            @JvmField val CONVERSATIONAL_ENRICHMENT = of("CONVERSATIONAL_ENRICHMENT")

            @JvmField val CRM_PROCESSES_PLATFORM = of("CRM_PROCESSES_PLATFORM")

            @JvmField val CLONE_OBJECTS = of("CLONE_OBJECTS")

            @JvmField val MARKET_SOURCING = of("MARKET_SOURCING")

            @JvmField val DATASET = of("DATASET")

            @JvmField val PROPERTY_RESTORE = of("PROPERTY_RESTORE")

            @JvmField val EMAIL_INBOX_IMPORT = of("EMAIL_INBOX_IMPORT")

            @JvmField val CUSTOMER_AGENT = of("CUSTOMER_AGENT")

            @JvmField val LEGAL_BASIS_REMEDIATION = of("LEGAL_BASIS_REMEDIATION")

            @JvmField val AUTO_ASSOCIATE_BY_DOMAIN = of("AUTO_ASSOCIATE_BY_DOMAIN")

            @JvmField val ACTIVITY_AUTO_ASSOCIATE = of("ACTIVITY_AUTO_ASSOCIATE")

            @JvmField val PRIMARY_AUTOMATION = of("PRIMARY_AUTOMATION")

            @JvmField val DELETE_OBJECTS = of("DELETE_OBJECTS")

            @JvmField val RESTORE_OBJECTS = of("RESTORE_OBJECTS")

            @JvmStatic fun of(value: String) = HsEngagementSource(JsonField.of(value))
        }

        /** An enum containing [HsEngagementSource]'s known values. */
        enum class Known {
            UNKNOWN,
            IMPORT,
            API,
            FORM,
            ANALYTICS,
            MIGRATION,
            SALESFORCE,
            INTEGRATION,
            CONTACTS_WEB,
            WAL_INCREMENTAL,
            TASK,
            EMAIL,
            WORKFLOWS,
            CALCULATED,
            SOCIAL,
            BATCH_UPDATE,
            SIGNALS,
            BIDEN,
            DEFAULT,
            COMPANIES,
            DEALS,
            ASSISTS,
            PRESENTATIONS,
            TALLY,
            SIDEKICK,
            CRM_UI,
            MERGE_CONTACTS,
            PORTAL_USER_ASSOCIATOR,
            INTEGRATIONS_PLATFORM,
            BCC_TO_CRM,
            FORWARD_TO_CRM,
            ENGAGEMENTS,
            SALES,
            HEISENBERG,
            LEADIN,
            GMAIL_INTEGRATION,
            ACADEMY,
            SALES_MESSAGES,
            AVATARS_SERVICE,
            MERGE_COMPANIES,
            SEQUENCES,
            COMPANY_FAMILIES,
            MOBILE_IOS,
            MOBILE_ANDROID,
            CONTACTS,
            ASSOCIATIONS,
            EXTENSION,
            SUCCESS,
            BOT,
            INTEGRATIONS_SYNC,
            AUTOMATION_PLATFORM,
            CONVERSATIONS,
            EMAIL_INTEGRATION,
            CONTENT_MEMBERSHIP,
            QUOTES,
            BET_ASSIGNMENT,
            QUOTAS,
            BET_CRM_CONNECTOR,
            MEETINGS,
            MERGE_OBJECTS,
            RECYCLING_BIN,
            ADS,
            AI_GROUP,
            COMMUNICATOR,
            SETTINGS,
            PROPERTY_SETTINGS,
            PIPELINE_SETTINGS,
            COMPANY_INSIGHTS,
            BEHAVIORAL_EVENTS,
            PAYMENTS,
            GOALS,
            PORTAL_OBJECT_SYNC,
            APPROVALS,
            FILE_MANAGER,
            MARKETPLACE,
            INTERNAL_PROCESSING,
            FORECASTING,
            SLACK_INTEGRATION,
            CRM_UI_BULK_ACTION,
            WORKFLOW_CONTACT_DELETE_ACTION,
            ACCEPTANCE_TEST,
            PLAYBOOKS,
            CHATSPOT,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            HELP_DESK,
            BILLING,
            DATA_ENRICHMENT,
            AUTOMATION_JOURNEY,
            MICROAPPS,
            INTENT,
            PROSPECTING_AGENT,
            CENTRAL_EXCHANGE_RATES,
            HELP_DESK_AI,
            CONVERSATIONAL_ENRICHMENT,
            CRM_PROCESSES_PLATFORM,
            CLONE_OBJECTS,
            MARKET_SOURCING,
            DATASET,
            PROPERTY_RESTORE,
            EMAIL_INBOX_IMPORT,
            CUSTOMER_AGENT,
            LEGAL_BASIS_REMEDIATION,
            AUTO_ASSOCIATE_BY_DOMAIN,
            ACTIVITY_AUTO_ASSOCIATE,
            PRIMARY_AUTOMATION,
            DELETE_OBJECTS,
            RESTORE_OBJECTS,
        }

        /**
         * An enum containing [HsEngagementSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HsEngagementSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNKNOWN,
            IMPORT,
            API,
            FORM,
            ANALYTICS,
            MIGRATION,
            SALESFORCE,
            INTEGRATION,
            CONTACTS_WEB,
            WAL_INCREMENTAL,
            TASK,
            EMAIL,
            WORKFLOWS,
            CALCULATED,
            SOCIAL,
            BATCH_UPDATE,
            SIGNALS,
            BIDEN,
            DEFAULT,
            COMPANIES,
            DEALS,
            ASSISTS,
            PRESENTATIONS,
            TALLY,
            SIDEKICK,
            CRM_UI,
            MERGE_CONTACTS,
            PORTAL_USER_ASSOCIATOR,
            INTEGRATIONS_PLATFORM,
            BCC_TO_CRM,
            FORWARD_TO_CRM,
            ENGAGEMENTS,
            SALES,
            HEISENBERG,
            LEADIN,
            GMAIL_INTEGRATION,
            ACADEMY,
            SALES_MESSAGES,
            AVATARS_SERVICE,
            MERGE_COMPANIES,
            SEQUENCES,
            COMPANY_FAMILIES,
            MOBILE_IOS,
            MOBILE_ANDROID,
            CONTACTS,
            ASSOCIATIONS,
            EXTENSION,
            SUCCESS,
            BOT,
            INTEGRATIONS_SYNC,
            AUTOMATION_PLATFORM,
            CONVERSATIONS,
            EMAIL_INTEGRATION,
            CONTENT_MEMBERSHIP,
            QUOTES,
            BET_ASSIGNMENT,
            QUOTAS,
            BET_CRM_CONNECTOR,
            MEETINGS,
            MERGE_OBJECTS,
            RECYCLING_BIN,
            ADS,
            AI_GROUP,
            COMMUNICATOR,
            SETTINGS,
            PROPERTY_SETTINGS,
            PIPELINE_SETTINGS,
            COMPANY_INSIGHTS,
            BEHAVIORAL_EVENTS,
            PAYMENTS,
            GOALS,
            PORTAL_OBJECT_SYNC,
            APPROVALS,
            FILE_MANAGER,
            MARKETPLACE,
            INTERNAL_PROCESSING,
            FORECASTING,
            SLACK_INTEGRATION,
            CRM_UI_BULK_ACTION,
            WORKFLOW_CONTACT_DELETE_ACTION,
            ACCEPTANCE_TEST,
            PLAYBOOKS,
            CHATSPOT,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            HELP_DESK,
            BILLING,
            DATA_ENRICHMENT,
            AUTOMATION_JOURNEY,
            MICROAPPS,
            INTENT,
            PROSPECTING_AGENT,
            CENTRAL_EXCHANGE_RATES,
            HELP_DESK_AI,
            CONVERSATIONAL_ENRICHMENT,
            CRM_PROCESSES_PLATFORM,
            CLONE_OBJECTS,
            MARKET_SOURCING,
            DATASET,
            PROPERTY_RESTORE,
            EMAIL_INBOX_IMPORT,
            CUSTOMER_AGENT,
            LEGAL_BASIS_REMEDIATION,
            AUTO_ASSOCIATE_BY_DOMAIN,
            ACTIVITY_AUTO_ASSOCIATE,
            PRIMARY_AUTOMATION,
            DELETE_OBJECTS,
            RESTORE_OBJECTS,
            /**
             * An enum member indicating that [HsEngagementSource] was instantiated with an unknown
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
                UNKNOWN -> Value.UNKNOWN
                IMPORT -> Value.IMPORT
                API -> Value.API
                FORM -> Value.FORM
                ANALYTICS -> Value.ANALYTICS
                MIGRATION -> Value.MIGRATION
                SALESFORCE -> Value.SALESFORCE
                INTEGRATION -> Value.INTEGRATION
                CONTACTS_WEB -> Value.CONTACTS_WEB
                WAL_INCREMENTAL -> Value.WAL_INCREMENTAL
                TASK -> Value.TASK
                EMAIL -> Value.EMAIL
                WORKFLOWS -> Value.WORKFLOWS
                CALCULATED -> Value.CALCULATED
                SOCIAL -> Value.SOCIAL
                BATCH_UPDATE -> Value.BATCH_UPDATE
                SIGNALS -> Value.SIGNALS
                BIDEN -> Value.BIDEN
                DEFAULT -> Value.DEFAULT
                COMPANIES -> Value.COMPANIES
                DEALS -> Value.DEALS
                ASSISTS -> Value.ASSISTS
                PRESENTATIONS -> Value.PRESENTATIONS
                TALLY -> Value.TALLY
                SIDEKICK -> Value.SIDEKICK
                CRM_UI -> Value.CRM_UI
                MERGE_CONTACTS -> Value.MERGE_CONTACTS
                PORTAL_USER_ASSOCIATOR -> Value.PORTAL_USER_ASSOCIATOR
                INTEGRATIONS_PLATFORM -> Value.INTEGRATIONS_PLATFORM
                BCC_TO_CRM -> Value.BCC_TO_CRM
                FORWARD_TO_CRM -> Value.FORWARD_TO_CRM
                ENGAGEMENTS -> Value.ENGAGEMENTS
                SALES -> Value.SALES
                HEISENBERG -> Value.HEISENBERG
                LEADIN -> Value.LEADIN
                GMAIL_INTEGRATION -> Value.GMAIL_INTEGRATION
                ACADEMY -> Value.ACADEMY
                SALES_MESSAGES -> Value.SALES_MESSAGES
                AVATARS_SERVICE -> Value.AVATARS_SERVICE
                MERGE_COMPANIES -> Value.MERGE_COMPANIES
                SEQUENCES -> Value.SEQUENCES
                COMPANY_FAMILIES -> Value.COMPANY_FAMILIES
                MOBILE_IOS -> Value.MOBILE_IOS
                MOBILE_ANDROID -> Value.MOBILE_ANDROID
                CONTACTS -> Value.CONTACTS
                ASSOCIATIONS -> Value.ASSOCIATIONS
                EXTENSION -> Value.EXTENSION
                SUCCESS -> Value.SUCCESS
                BOT -> Value.BOT
                INTEGRATIONS_SYNC -> Value.INTEGRATIONS_SYNC
                AUTOMATION_PLATFORM -> Value.AUTOMATION_PLATFORM
                CONVERSATIONS -> Value.CONVERSATIONS
                EMAIL_INTEGRATION -> Value.EMAIL_INTEGRATION
                CONTENT_MEMBERSHIP -> Value.CONTENT_MEMBERSHIP
                QUOTES -> Value.QUOTES
                BET_ASSIGNMENT -> Value.BET_ASSIGNMENT
                QUOTAS -> Value.QUOTAS
                BET_CRM_CONNECTOR -> Value.BET_CRM_CONNECTOR
                MEETINGS -> Value.MEETINGS
                MERGE_OBJECTS -> Value.MERGE_OBJECTS
                RECYCLING_BIN -> Value.RECYCLING_BIN
                ADS -> Value.ADS
                AI_GROUP -> Value.AI_GROUP
                COMMUNICATOR -> Value.COMMUNICATOR
                SETTINGS -> Value.SETTINGS
                PROPERTY_SETTINGS -> Value.PROPERTY_SETTINGS
                PIPELINE_SETTINGS -> Value.PIPELINE_SETTINGS
                COMPANY_INSIGHTS -> Value.COMPANY_INSIGHTS
                BEHAVIORAL_EVENTS -> Value.BEHAVIORAL_EVENTS
                PAYMENTS -> Value.PAYMENTS
                GOALS -> Value.GOALS
                PORTAL_OBJECT_SYNC -> Value.PORTAL_OBJECT_SYNC
                APPROVALS -> Value.APPROVALS
                FILE_MANAGER -> Value.FILE_MANAGER
                MARKETPLACE -> Value.MARKETPLACE
                INTERNAL_PROCESSING -> Value.INTERNAL_PROCESSING
                FORECASTING -> Value.FORECASTING
                SLACK_INTEGRATION -> Value.SLACK_INTEGRATION
                CRM_UI_BULK_ACTION -> Value.CRM_UI_BULK_ACTION
                WORKFLOW_CONTACT_DELETE_ACTION -> Value.WORKFLOW_CONTACT_DELETE_ACTION
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                PLAYBOOKS -> Value.PLAYBOOKS
                CHATSPOT -> Value.CHATSPOT
                FLYWHEEL_PRODUCT_DATA_SYNC -> Value.FLYWHEEL_PRODUCT_DATA_SYNC
                HELP_DESK -> Value.HELP_DESK
                BILLING -> Value.BILLING
                DATA_ENRICHMENT -> Value.DATA_ENRICHMENT
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                MICROAPPS -> Value.MICROAPPS
                INTENT -> Value.INTENT
                PROSPECTING_AGENT -> Value.PROSPECTING_AGENT
                CENTRAL_EXCHANGE_RATES -> Value.CENTRAL_EXCHANGE_RATES
                HELP_DESK_AI -> Value.HELP_DESK_AI
                CONVERSATIONAL_ENRICHMENT -> Value.CONVERSATIONAL_ENRICHMENT
                CRM_PROCESSES_PLATFORM -> Value.CRM_PROCESSES_PLATFORM
                CLONE_OBJECTS -> Value.CLONE_OBJECTS
                MARKET_SOURCING -> Value.MARKET_SOURCING
                DATASET -> Value.DATASET
                PROPERTY_RESTORE -> Value.PROPERTY_RESTORE
                EMAIL_INBOX_IMPORT -> Value.EMAIL_INBOX_IMPORT
                CUSTOMER_AGENT -> Value.CUSTOMER_AGENT
                LEGAL_BASIS_REMEDIATION -> Value.LEGAL_BASIS_REMEDIATION
                AUTO_ASSOCIATE_BY_DOMAIN -> Value.AUTO_ASSOCIATE_BY_DOMAIN
                ACTIVITY_AUTO_ASSOCIATE -> Value.ACTIVITY_AUTO_ASSOCIATE
                PRIMARY_AUTOMATION -> Value.PRIMARY_AUTOMATION
                DELETE_OBJECTS -> Value.DELETE_OBJECTS
                RESTORE_OBJECTS -> Value.RESTORE_OBJECTS
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
                UNKNOWN -> Known.UNKNOWN
                IMPORT -> Known.IMPORT
                API -> Known.API
                FORM -> Known.FORM
                ANALYTICS -> Known.ANALYTICS
                MIGRATION -> Known.MIGRATION
                SALESFORCE -> Known.SALESFORCE
                INTEGRATION -> Known.INTEGRATION
                CONTACTS_WEB -> Known.CONTACTS_WEB
                WAL_INCREMENTAL -> Known.WAL_INCREMENTAL
                TASK -> Known.TASK
                EMAIL -> Known.EMAIL
                WORKFLOWS -> Known.WORKFLOWS
                CALCULATED -> Known.CALCULATED
                SOCIAL -> Known.SOCIAL
                BATCH_UPDATE -> Known.BATCH_UPDATE
                SIGNALS -> Known.SIGNALS
                BIDEN -> Known.BIDEN
                DEFAULT -> Known.DEFAULT
                COMPANIES -> Known.COMPANIES
                DEALS -> Known.DEALS
                ASSISTS -> Known.ASSISTS
                PRESENTATIONS -> Known.PRESENTATIONS
                TALLY -> Known.TALLY
                SIDEKICK -> Known.SIDEKICK
                CRM_UI -> Known.CRM_UI
                MERGE_CONTACTS -> Known.MERGE_CONTACTS
                PORTAL_USER_ASSOCIATOR -> Known.PORTAL_USER_ASSOCIATOR
                INTEGRATIONS_PLATFORM -> Known.INTEGRATIONS_PLATFORM
                BCC_TO_CRM -> Known.BCC_TO_CRM
                FORWARD_TO_CRM -> Known.FORWARD_TO_CRM
                ENGAGEMENTS -> Known.ENGAGEMENTS
                SALES -> Known.SALES
                HEISENBERG -> Known.HEISENBERG
                LEADIN -> Known.LEADIN
                GMAIL_INTEGRATION -> Known.GMAIL_INTEGRATION
                ACADEMY -> Known.ACADEMY
                SALES_MESSAGES -> Known.SALES_MESSAGES
                AVATARS_SERVICE -> Known.AVATARS_SERVICE
                MERGE_COMPANIES -> Known.MERGE_COMPANIES
                SEQUENCES -> Known.SEQUENCES
                COMPANY_FAMILIES -> Known.COMPANY_FAMILIES
                MOBILE_IOS -> Known.MOBILE_IOS
                MOBILE_ANDROID -> Known.MOBILE_ANDROID
                CONTACTS -> Known.CONTACTS
                ASSOCIATIONS -> Known.ASSOCIATIONS
                EXTENSION -> Known.EXTENSION
                SUCCESS -> Known.SUCCESS
                BOT -> Known.BOT
                INTEGRATIONS_SYNC -> Known.INTEGRATIONS_SYNC
                AUTOMATION_PLATFORM -> Known.AUTOMATION_PLATFORM
                CONVERSATIONS -> Known.CONVERSATIONS
                EMAIL_INTEGRATION -> Known.EMAIL_INTEGRATION
                CONTENT_MEMBERSHIP -> Known.CONTENT_MEMBERSHIP
                QUOTES -> Known.QUOTES
                BET_ASSIGNMENT -> Known.BET_ASSIGNMENT
                QUOTAS -> Known.QUOTAS
                BET_CRM_CONNECTOR -> Known.BET_CRM_CONNECTOR
                MEETINGS -> Known.MEETINGS
                MERGE_OBJECTS -> Known.MERGE_OBJECTS
                RECYCLING_BIN -> Known.RECYCLING_BIN
                ADS -> Known.ADS
                AI_GROUP -> Known.AI_GROUP
                COMMUNICATOR -> Known.COMMUNICATOR
                SETTINGS -> Known.SETTINGS
                PROPERTY_SETTINGS -> Known.PROPERTY_SETTINGS
                PIPELINE_SETTINGS -> Known.PIPELINE_SETTINGS
                COMPANY_INSIGHTS -> Known.COMPANY_INSIGHTS
                BEHAVIORAL_EVENTS -> Known.BEHAVIORAL_EVENTS
                PAYMENTS -> Known.PAYMENTS
                GOALS -> Known.GOALS
                PORTAL_OBJECT_SYNC -> Known.PORTAL_OBJECT_SYNC
                APPROVALS -> Known.APPROVALS
                FILE_MANAGER -> Known.FILE_MANAGER
                MARKETPLACE -> Known.MARKETPLACE
                INTERNAL_PROCESSING -> Known.INTERNAL_PROCESSING
                FORECASTING -> Known.FORECASTING
                SLACK_INTEGRATION -> Known.SLACK_INTEGRATION
                CRM_UI_BULK_ACTION -> Known.CRM_UI_BULK_ACTION
                WORKFLOW_CONTACT_DELETE_ACTION -> Known.WORKFLOW_CONTACT_DELETE_ACTION
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                PLAYBOOKS -> Known.PLAYBOOKS
                CHATSPOT -> Known.CHATSPOT
                FLYWHEEL_PRODUCT_DATA_SYNC -> Known.FLYWHEEL_PRODUCT_DATA_SYNC
                HELP_DESK -> Known.HELP_DESK
                BILLING -> Known.BILLING
                DATA_ENRICHMENT -> Known.DATA_ENRICHMENT
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                MICROAPPS -> Known.MICROAPPS
                INTENT -> Known.INTENT
                PROSPECTING_AGENT -> Known.PROSPECTING_AGENT
                CENTRAL_EXCHANGE_RATES -> Known.CENTRAL_EXCHANGE_RATES
                HELP_DESK_AI -> Known.HELP_DESK_AI
                CONVERSATIONAL_ENRICHMENT -> Known.CONVERSATIONAL_ENRICHMENT
                CRM_PROCESSES_PLATFORM -> Known.CRM_PROCESSES_PLATFORM
                CLONE_OBJECTS -> Known.CLONE_OBJECTS
                MARKET_SOURCING -> Known.MARKET_SOURCING
                DATASET -> Known.DATASET
                PROPERTY_RESTORE -> Known.PROPERTY_RESTORE
                EMAIL_INBOX_IMPORT -> Known.EMAIL_INBOX_IMPORT
                CUSTOMER_AGENT -> Known.CUSTOMER_AGENT
                LEGAL_BASIS_REMEDIATION -> Known.LEGAL_BASIS_REMEDIATION
                AUTO_ASSOCIATE_BY_DOMAIN -> Known.AUTO_ASSOCIATE_BY_DOMAIN
                ACTIVITY_AUTO_ASSOCIATE -> Known.ACTIVITY_AUTO_ASSOCIATE
                PRIMARY_AUTOMATION -> Known.PRIMARY_AUTOMATION
                DELETE_OBJECTS -> Known.DELETE_OBJECTS
                RESTORE_OBJECTS -> Known.RESTORE_OBJECTS
                else -> throw HubSpotInvalidDataException("Unknown HsEngagementSource: $value")
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

        fun validate(): HsEngagementSource = apply {
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

            return other is HsEngagementSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class HsMeetingLocationType
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

            @JvmField val PHONE = of("PHONE")

            @JvmField val ADDRESS = of("ADDRESS")

            @JvmField val CUSTOM = of("CUSTOM")

            @JvmStatic fun of(value: String) = HsMeetingLocationType(JsonField.of(value))
        }

        /** An enum containing [HsMeetingLocationType]'s known values. */
        enum class Known {
            PHONE,
            ADDRESS,
            CUSTOM,
        }

        /**
         * An enum containing [HsMeetingLocationType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [HsMeetingLocationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PHONE,
            ADDRESS,
            CUSTOM,
            /**
             * An enum member indicating that [HsMeetingLocationType] was instantiated with an
             * unknown value.
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
                PHONE -> Value.PHONE
                ADDRESS -> Value.ADDRESS
                CUSTOM -> Value.CUSTOM
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
                PHONE -> Known.PHONE
                ADDRESS -> Known.ADDRESS
                CUSTOM -> Known.CUSTOM
                else -> throw HubSpotInvalidDataException("Unknown HsMeetingLocationType: $value")
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

        fun validate(): HsMeetingLocationType = apply {
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

            return other is HsMeetingLocationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalCalendarMeetingEventResponseProperties &&
            hsEngagementSource == other.hsEngagementSource &&
            hsEngagementSourceId == other.hsEngagementSourceId &&
            hsMeetingEndTime == other.hsMeetingEndTime &&
            hsMeetingOutcome == other.hsMeetingOutcome &&
            hsMeetingStartTime == other.hsMeetingStartTime &&
            hsMeetingTitle == other.hsMeetingTitle &&
            hsTimestamp == other.hsTimestamp &&
            hsActivityType == other.hsActivityType &&
            hsAttachmentIds == other.hsAttachmentIds &&
            hsAttendeeOwnerIds == other.hsAttendeeOwnerIds &&
            hsIncludeDescriptionInReminder == other.hsIncludeDescriptionInReminder &&
            hsInternalMeetingNotes == other.hsInternalMeetingNotes &&
            hsMeetingBody == other.hsMeetingBody &&
            hsMeetingExternalUrl == other.hsMeetingExternalUrl &&
            hsMeetingLocation == other.hsMeetingLocation &&
            hsMeetingLocationType == other.hsMeetingLocationType &&
            hsUniqueId == other.hsUniqueId &&
            hubspotOwnerId == other.hubspotOwnerId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            hsEngagementSource,
            hsEngagementSourceId,
            hsMeetingEndTime,
            hsMeetingOutcome,
            hsMeetingStartTime,
            hsMeetingTitle,
            hsTimestamp,
            hsActivityType,
            hsAttachmentIds,
            hsAttendeeOwnerIds,
            hsIncludeDescriptionInReminder,
            hsInternalMeetingNotes,
            hsMeetingBody,
            hsMeetingExternalUrl,
            hsMeetingLocation,
            hsMeetingLocationType,
            hsUniqueId,
            hubspotOwnerId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalCalendarMeetingEventResponseProperties{hsEngagementSource=$hsEngagementSource, hsEngagementSourceId=$hsEngagementSourceId, hsMeetingEndTime=$hsMeetingEndTime, hsMeetingOutcome=$hsMeetingOutcome, hsMeetingStartTime=$hsMeetingStartTime, hsMeetingTitle=$hsMeetingTitle, hsTimestamp=$hsTimestamp, hsActivityType=$hsActivityType, hsAttachmentIds=$hsAttachmentIds, hsAttendeeOwnerIds=$hsAttendeeOwnerIds, hsIncludeDescriptionInReminder=$hsIncludeDescriptionInReminder, hsInternalMeetingNotes=$hsInternalMeetingNotes, hsMeetingBody=$hsMeetingBody, hsMeetingExternalUrl=$hsMeetingExternalUrl, hsMeetingLocation=$hsMeetingLocation, hsMeetingLocationType=$hsMeetingLocationType, hsUniqueId=$hsUniqueId, hubspotOwnerId=$hubspotOwnerId, additionalProperties=$additionalProperties}"
}
