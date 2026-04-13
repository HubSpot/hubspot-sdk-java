// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
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
    private val hubSpotOwnerId: JsonField<String>,
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
        hubSpotOwnerId: JsonField<String> = JsonMissing.of(),
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
        hubSpotOwnerId,
        mutableMapOf(),
    )

    /**
     * The source of the engagement, will always be `MEETINGS`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsEngagementSource(): HsEngagementSource =
        hsEngagementSource.getRequired("hs_engagement_source")

    /**
     * The ID associated with the process created the engagement. Should always be empty when
     * creating meeting events through this API.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsEngagementSourceId(): String = hsEngagementSourceId.getRequired("hs_engagement_source_id")

    /**
     * The end time of the meeting in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingEndTime(): OffsetDateTime = hsMeetingEndTime.getRequired("hs_meeting_end_time")

    /**
     * The outcome of the meeting. Acceptable default values are: SCHEDULED, COMPLETED, RESCHEDULED,
     * NO_SHOW, CANCELED. This property can be changed to include additional custom values.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingOutcome(): String = hsMeetingOutcome.getRequired("hs_meeting_outcome")

    /**
     * The start time of the meeting in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingStartTime(): OffsetDateTime =
        hsMeetingStartTime.getRequired("hs_meeting_start_time")

    /**
     * The title of the meeting and calendar event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingTitle(): String = hsMeetingTitle.getRequired("hs_meeting_title")

    /**
     * The time that the meeting should start in ISO 8601 format. This value should be the same as
     * `hs_meeting_start_time`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsTimestamp(): OffsetDateTime = hsTimestamp.getRequired("hs_timestamp")

    /**
     * The activity type of the meeting. Acceptable values are based on portal defined call and
     * meeting types.
     *
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
     * Whether to include the meeting description in the reminder.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsIncludeDescriptionInReminder(): Optional<String> =
        hsIncludeDescriptionInReminder.getOptional("hs_include_description_in_reminder")

    /**
     * Internal notes related to the meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsInternalMeetingNotes(): Optional<String> =
        hsInternalMeetingNotes.getOptional("hs_internal_meeting_notes")

    /**
     * The description of the meeting and calendar event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingBody(): Optional<String> = hsMeetingBody.getOptional("hs_meeting_body")

    /**
     * The calendar event URL for the meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingExternalUrl(): Optional<String> =
        hsMeetingExternalUrl.getOptional("hs_meeting_external_url")

    /**
     * The physical address, virtual location, or phone number where the meeting will take place.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingLocation(): Optional<String> = hsMeetingLocation.getOptional("hs_meeting_location")

    /**
     * The type of location for the meeting. Acceptable values are: ADDRESS, CUSTOM, PHONE.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingLocationType(): Optional<HsMeetingLocationType> =
        hsMeetingLocationType.getOptional("hs_meeting_location_type")

    /**
     * The unique ID of the created calendar event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsUniqueId(): Optional<String> = hsUniqueId.getOptional("hs_unique_id")

    /**
     * The owner ID of the HubSpot user hosting the meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hubSpotOwnerId(): Optional<String> = hubSpotOwnerId.getOptional("hubspot_owner_id")

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
     * Returns the raw JSON value of [hubSpotOwnerId].
     *
     * Unlike [hubSpotOwnerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspot_owner_id")
    @ExcludeMissing
    fun _hubSpotOwnerId(): JsonField<String> = hubSpotOwnerId

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
        private var hubSpotOwnerId: JsonField<String> = JsonMissing.of()
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
            hubSpotOwnerId = externalCalendarMeetingEventResponseProperties.hubSpotOwnerId
            additionalProperties =
                externalCalendarMeetingEventResponseProperties.additionalProperties.toMutableMap()
        }

        /** The source of the engagement, will always be `MEETINGS`. */
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

        /**
         * The ID associated with the process created the engagement. Should always be empty when
         * creating meeting events through this API.
         */
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

        /** The end time of the meeting in ISO 8601 format. */
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

        /**
         * The outcome of the meeting. Acceptable default values are: SCHEDULED, COMPLETED,
         * RESCHEDULED, NO_SHOW, CANCELED. This property can be changed to include additional custom
         * values.
         */
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

        /** The start time of the meeting in ISO 8601 format. */
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

        /** The title of the meeting and calendar event. */
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

        /**
         * The time that the meeting should start in ISO 8601 format. This value should be the same
         * as `hs_meeting_start_time`.
         */
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

        /**
         * The activity type of the meeting. Acceptable values are based on portal defined call and
         * meeting types.
         */
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

        /** Whether to include the meeting description in the reminder. */
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

        /** Internal notes related to the meeting. */
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

        /** The description of the meeting and calendar event. */
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

        /** The calendar event URL for the meeting. */
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

        /**
         * The physical address, virtual location, or phone number where the meeting will take
         * place.
         */
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

        /** The type of location for the meeting. Acceptable values are: ADDRESS, CUSTOM, PHONE. */
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

        /** The unique ID of the created calendar event. */
        fun hsUniqueId(hsUniqueId: String) = hsUniqueId(JsonField.of(hsUniqueId))

        /**
         * Sets [Builder.hsUniqueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsUniqueId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hsUniqueId(hsUniqueId: JsonField<String>) = apply { this.hsUniqueId = hsUniqueId }

        /** The owner ID of the HubSpot user hosting the meeting. */
        fun hubSpotOwnerId(hubSpotOwnerId: String) = hubSpotOwnerId(JsonField.of(hubSpotOwnerId))

        /**
         * Sets [Builder.hubSpotOwnerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubSpotOwnerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hubSpotOwnerId(hubSpotOwnerId: JsonField<String>) = apply {
            this.hubSpotOwnerId = hubSpotOwnerId
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
                hubSpotOwnerId,
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
        hubSpotOwnerId()
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
            (if (hubSpotOwnerId.asKnown().isPresent) 1 else 0)

    /** The source of the engagement, will always be `MEETINGS`. */
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

            @JvmField val ACADEMY = of("ACADEMY")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val ACTIVITY_AUTO_ASSOCIATE = of("ACTIVITY_AUTO_ASSOCIATE")

            @JvmField val ACTIVITY_LOG_REVERT = of("ACTIVITY_LOG_REVERT")

            @JvmField val ADS = of("ADS")

            @JvmField val AI_GROUP = of("AI_GROUP")

            @JvmField val ANALYTICS = of("ANALYTICS")

            @JvmField val API = of("API")

            @JvmField val APPROVALS = of("APPROVALS")

            @JvmField val ASSISTS = of("ASSISTS")

            @JvmField val ASSOCIATIONS = of("ASSOCIATIONS")

            @JvmField val AUTO_ASSOCIATE_BY_DOMAIN = of("AUTO_ASSOCIATE_BY_DOMAIN")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val AUTOMATION_PLATFORM = of("AUTOMATION_PLATFORM")

            @JvmField val AVATARS_SERVICE = of("AVATARS_SERVICE")

            @JvmField val BATCH_UPDATE = of("BATCH_UPDATE")

            @JvmField val BCC_TO_CRM = of("BCC_TO_CRM")

            @JvmField val BEHAVIORAL_EVENTS = of("BEHAVIORAL_EVENTS")

            @JvmField val BET_ASSIGNMENT = of("BET_ASSIGNMENT")

            @JvmField val BET_CRM_CONNECTOR = of("BET_CRM_CONNECTOR")

            @JvmField val BIDEN = of("BIDEN")

            @JvmField val BILLING = of("BILLING")

            @JvmField val BOT = of("BOT")

            @JvmField val CALCULATED = of("CALCULATED")

            @JvmField val CENTRAL_EXCHANGE_RATES = of("CENTRAL_EXCHANGE_RATES")

            @JvmField val CHATSPOT = of("CHATSPOT")

            @JvmField val CLONE_OBJECTS = of("CLONE_OBJECTS")

            @JvmField val COMMUNICATOR = of("COMMUNICATOR")

            @JvmField val COMPANIES = of("COMPANIES")

            @JvmField val COMPANY_FAMILIES = of("COMPANY_FAMILIES")

            @JvmField val COMPANY_INSIGHTS = of("COMPANY_INSIGHTS")

            @JvmField val CONTACTS = of("CONTACTS")

            @JvmField val CONTACTS_WEB = of("CONTACTS_WEB")

            @JvmField val CONTENT_MEMBERSHIP = of("CONTENT_MEMBERSHIP")

            @JvmField val CONVERSATIONAL_ENRICHMENT = of("CONVERSATIONAL_ENRICHMENT")

            @JvmField val CONVERSATIONS = of("CONVERSATIONS")

            @JvmField val CRM_PROCESSES_PLATFORM = of("CRM_PROCESSES_PLATFORM")

            @JvmField val CRM_UI = of("CRM_UI")

            @JvmField val CRM_UI_BULK_ACTION = of("CRM_UI_BULK_ACTION")

            @JvmField val CUSTOMER_AGENT = of("CUSTOMER_AGENT")

            @JvmField val DATA_ENRICHMENT = of("DATA_ENRICHMENT")

            @JvmField val DATA_QUALITY = of("DATA_QUALITY")

            @JvmField val DATASET = of("DATASET")

            @JvmField val DEALS = of("DEALS")

            @JvmField val DEFAULT = of("DEFAULT")

            @JvmField val DELETE_OBJECTS = of("DELETE_OBJECTS")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val EMAIL_INBOX_IMPORT = of("EMAIL_INBOX_IMPORT")

            @JvmField val EMAIL_INTEGRATION = of("EMAIL_INTEGRATION")

            @JvmField val ENGAGEMENTS = of("ENGAGEMENTS")

            @JvmField val EXTENSION = of("EXTENSION")

            @JvmField val FILE_MANAGER = of("FILE_MANAGER")

            @JvmField val FLYWHEEL_PRODUCT_DATA_SYNC = of("FLYWHEEL_PRODUCT_DATA_SYNC")

            @JvmField val FORECASTING = of("FORECASTING")

            @JvmField val FORM = of("FORM")

            @JvmField val FORWARD_TO_CRM = of("FORWARD_TO_CRM")

            @JvmField val GMAIL_INTEGRATION = of("GMAIL_INTEGRATION")

            @JvmField val GOALS = of("GOALS")

            @JvmField val HEISENBERG = of("HEISENBERG")

            @JvmField val HELP_DESK = of("HELP_DESK")

            @JvmField val HELP_DESK_AI = of("HELP_DESK_AI")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INTEGRATION = of("INTEGRATION")

            @JvmField val INTEGRATIONS_PLATFORM = of("INTEGRATIONS_PLATFORM")

            @JvmField val INTEGRATIONS_SYNC = of("INTEGRATIONS_SYNC")

            @JvmField val INTENT = of("INTENT")

            @JvmField val INTERNAL_PROCESSING = of("INTERNAL_PROCESSING")

            @JvmField val LEADIN = of("LEADIN")

            @JvmField val LEGAL_BASIS_REMEDIATION = of("LEGAL_BASIS_REMEDIATION")

            @JvmField val MARKET_SOURCING = of("MARKET_SOURCING")

            @JvmField val MARKETPLACE = of("MARKETPLACE")

            @JvmField val MEETINGS = of("MEETINGS")

            @JvmField val MERGE_COMPANIES = of("MERGE_COMPANIES")

            @JvmField val MERGE_CONTACTS = of("MERGE_CONTACTS")

            @JvmField val MERGE_OBJECTS = of("MERGE_OBJECTS")

            @JvmField val MERGE_REVERT_OBJECTS = of("MERGE_REVERT_OBJECTS")

            @JvmField val MICROAPPS = of("MICROAPPS")

            @JvmField val MIGRATION = of("MIGRATION")

            @JvmField val MOBILE_ANDROID = of("MOBILE_ANDROID")

            @JvmField val MOBILE_IOS = of("MOBILE_IOS")

            @JvmField val PAYMENTS = of("PAYMENTS")

            @JvmField val PIPELINE_SETTINGS = of("PIPELINE_SETTINGS")

            @JvmField val PLAYBOOKS = of("PLAYBOOKS")

            @JvmField val PORTAL_OBJECT_SYNC = of("PORTAL_OBJECT_SYNC")

            @JvmField val PORTAL_USER_ASSOCIATOR = of("PORTAL_USER_ASSOCIATOR")

            @JvmField val PRESENTATIONS = of("PRESENTATIONS")

            @JvmField val PRIMARY_AUTOMATION = of("PRIMARY_AUTOMATION")

            @JvmField val PROPERTY_DEFAULT_VALUE = of("PROPERTY_DEFAULT_VALUE")

            @JvmField val PROPERTY_RESTORE = of("PROPERTY_RESTORE")

            @JvmField val PROPERTY_SETTINGS = of("PROPERTY_SETTINGS")

            @JvmField val PROSPECTING_AGENT = of("PROSPECTING_AGENT")

            @JvmField val QUOTAS = of("QUOTAS")

            @JvmField val QUOTES = of("QUOTES")

            @JvmField val RECYCLING_BIN = of("RECYCLING_BIN")

            @JvmField val RESTORE_OBJECTS = of("RESTORE_OBJECTS")

            @JvmField val SALES = of("SALES")

            @JvmField val SALES_MESSAGES = of("SALES_MESSAGES")

            @JvmField val SALESFORCE = of("SALESFORCE")

            @JvmField val SEQUENCES = of("SEQUENCES")

            @JvmField val SETTINGS = of("SETTINGS")

            @JvmField val SIDEKICK = of("SIDEKICK")

            @JvmField val SIGNALS = of("SIGNALS")

            @JvmField val SLACK_INTEGRATION = of("SLACK_INTEGRATION")

            @JvmField val SMART_DATA_CAPTURE = of("SMART_DATA_CAPTURE")

            @JvmField val SOCIAL = of("SOCIAL")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmField val TALLY = of("TALLY")

            @JvmField val TASK = of("TASK")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val WAL_INCREMENTAL = of("WAL_INCREMENTAL")

            @JvmField val WORK_UI = of("WORK_UI")

            @JvmField val WORKFLOW_CONTACT_DELETE_ACTION = of("WORKFLOW_CONTACT_DELETE_ACTION")

            @JvmField val WORKFLOWS = of("WORKFLOWS")

            @JvmStatic fun of(value: String) = HsEngagementSource(JsonField.of(value))
        }

        /** An enum containing [HsEngagementSource]'s known values. */
        enum class Known {
            ACADEMY,
            ACCEPTANCE_TEST,
            ACTIVITY_AUTO_ASSOCIATE,
            ACTIVITY_LOG_REVERT,
            ADS,
            AI_GROUP,
            ANALYTICS,
            API,
            APPROVALS,
            ASSISTS,
            ASSOCIATIONS,
            AUTO_ASSOCIATE_BY_DOMAIN,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM,
            AVATARS_SERVICE,
            BATCH_UPDATE,
            BCC_TO_CRM,
            BEHAVIORAL_EVENTS,
            BET_ASSIGNMENT,
            BET_CRM_CONNECTOR,
            BIDEN,
            BILLING,
            BOT,
            CALCULATED,
            CENTRAL_EXCHANGE_RATES,
            CHATSPOT,
            CLONE_OBJECTS,
            COMMUNICATOR,
            COMPANIES,
            COMPANY_FAMILIES,
            COMPANY_INSIGHTS,
            CONTACTS,
            CONTACTS_WEB,
            CONTENT_MEMBERSHIP,
            CONVERSATIONAL_ENRICHMENT,
            CONVERSATIONS,
            CRM_PROCESSES_PLATFORM,
            CRM_UI,
            CRM_UI_BULK_ACTION,
            CUSTOMER_AGENT,
            DATA_ENRICHMENT,
            DATA_QUALITY,
            DATASET,
            DEALS,
            DEFAULT,
            DELETE_OBJECTS,
            EMAIL,
            EMAIL_INBOX_IMPORT,
            EMAIL_INTEGRATION,
            ENGAGEMENTS,
            EXTENSION,
            FILE_MANAGER,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            FORECASTING,
            FORM,
            FORWARD_TO_CRM,
            GMAIL_INTEGRATION,
            GOALS,
            HEISENBERG,
            HELP_DESK,
            HELP_DESK_AI,
            IMPORT,
            INTEGRATION,
            INTEGRATIONS_PLATFORM,
            INTEGRATIONS_SYNC,
            INTENT,
            INTERNAL_PROCESSING,
            LEADIN,
            LEGAL_BASIS_REMEDIATION,
            MARKET_SOURCING,
            MARKETPLACE,
            MEETINGS,
            MERGE_COMPANIES,
            MERGE_CONTACTS,
            MERGE_OBJECTS,
            MERGE_REVERT_OBJECTS,
            MICROAPPS,
            MIGRATION,
            MOBILE_ANDROID,
            MOBILE_IOS,
            PAYMENTS,
            PIPELINE_SETTINGS,
            PLAYBOOKS,
            PORTAL_OBJECT_SYNC,
            PORTAL_USER_ASSOCIATOR,
            PRESENTATIONS,
            PRIMARY_AUTOMATION,
            PROPERTY_DEFAULT_VALUE,
            PROPERTY_RESTORE,
            PROPERTY_SETTINGS,
            PROSPECTING_AGENT,
            QUOTAS,
            QUOTES,
            RECYCLING_BIN,
            RESTORE_OBJECTS,
            SALES,
            SALES_MESSAGES,
            SALESFORCE,
            SEQUENCES,
            SETTINGS,
            SIDEKICK,
            SIGNALS,
            SLACK_INTEGRATION,
            SMART_DATA_CAPTURE,
            SOCIAL,
            SUCCESS,
            TALLY,
            TASK,
            UNKNOWN,
            WAL_INCREMENTAL,
            WORK_UI,
            WORKFLOW_CONTACT_DELETE_ACTION,
            WORKFLOWS,
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
            ACADEMY,
            ACCEPTANCE_TEST,
            ACTIVITY_AUTO_ASSOCIATE,
            ACTIVITY_LOG_REVERT,
            ADS,
            AI_GROUP,
            ANALYTICS,
            API,
            APPROVALS,
            ASSISTS,
            ASSOCIATIONS,
            AUTO_ASSOCIATE_BY_DOMAIN,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM,
            AVATARS_SERVICE,
            BATCH_UPDATE,
            BCC_TO_CRM,
            BEHAVIORAL_EVENTS,
            BET_ASSIGNMENT,
            BET_CRM_CONNECTOR,
            BIDEN,
            BILLING,
            BOT,
            CALCULATED,
            CENTRAL_EXCHANGE_RATES,
            CHATSPOT,
            CLONE_OBJECTS,
            COMMUNICATOR,
            COMPANIES,
            COMPANY_FAMILIES,
            COMPANY_INSIGHTS,
            CONTACTS,
            CONTACTS_WEB,
            CONTENT_MEMBERSHIP,
            CONVERSATIONAL_ENRICHMENT,
            CONVERSATIONS,
            CRM_PROCESSES_PLATFORM,
            CRM_UI,
            CRM_UI_BULK_ACTION,
            CUSTOMER_AGENT,
            DATA_ENRICHMENT,
            DATA_QUALITY,
            DATASET,
            DEALS,
            DEFAULT,
            DELETE_OBJECTS,
            EMAIL,
            EMAIL_INBOX_IMPORT,
            EMAIL_INTEGRATION,
            ENGAGEMENTS,
            EXTENSION,
            FILE_MANAGER,
            FLYWHEEL_PRODUCT_DATA_SYNC,
            FORECASTING,
            FORM,
            FORWARD_TO_CRM,
            GMAIL_INTEGRATION,
            GOALS,
            HEISENBERG,
            HELP_DESK,
            HELP_DESK_AI,
            IMPORT,
            INTEGRATION,
            INTEGRATIONS_PLATFORM,
            INTEGRATIONS_SYNC,
            INTENT,
            INTERNAL_PROCESSING,
            LEADIN,
            LEGAL_BASIS_REMEDIATION,
            MARKET_SOURCING,
            MARKETPLACE,
            MEETINGS,
            MERGE_COMPANIES,
            MERGE_CONTACTS,
            MERGE_OBJECTS,
            MERGE_REVERT_OBJECTS,
            MICROAPPS,
            MIGRATION,
            MOBILE_ANDROID,
            MOBILE_IOS,
            PAYMENTS,
            PIPELINE_SETTINGS,
            PLAYBOOKS,
            PORTAL_OBJECT_SYNC,
            PORTAL_USER_ASSOCIATOR,
            PRESENTATIONS,
            PRIMARY_AUTOMATION,
            PROPERTY_DEFAULT_VALUE,
            PROPERTY_RESTORE,
            PROPERTY_SETTINGS,
            PROSPECTING_AGENT,
            QUOTAS,
            QUOTES,
            RECYCLING_BIN,
            RESTORE_OBJECTS,
            SALES,
            SALES_MESSAGES,
            SALESFORCE,
            SEQUENCES,
            SETTINGS,
            SIDEKICK,
            SIGNALS,
            SLACK_INTEGRATION,
            SMART_DATA_CAPTURE,
            SOCIAL,
            SUCCESS,
            TALLY,
            TASK,
            UNKNOWN,
            WAL_INCREMENTAL,
            WORK_UI,
            WORKFLOW_CONTACT_DELETE_ACTION,
            WORKFLOWS,
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
                ACADEMY -> Value.ACADEMY
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                ACTIVITY_AUTO_ASSOCIATE -> Value.ACTIVITY_AUTO_ASSOCIATE
                ACTIVITY_LOG_REVERT -> Value.ACTIVITY_LOG_REVERT
                ADS -> Value.ADS
                AI_GROUP -> Value.AI_GROUP
                ANALYTICS -> Value.ANALYTICS
                API -> Value.API
                APPROVALS -> Value.APPROVALS
                ASSISTS -> Value.ASSISTS
                ASSOCIATIONS -> Value.ASSOCIATIONS
                AUTO_ASSOCIATE_BY_DOMAIN -> Value.AUTO_ASSOCIATE_BY_DOMAIN
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM -> Value.AUTOMATION_PLATFORM
                AVATARS_SERVICE -> Value.AVATARS_SERVICE
                BATCH_UPDATE -> Value.BATCH_UPDATE
                BCC_TO_CRM -> Value.BCC_TO_CRM
                BEHAVIORAL_EVENTS -> Value.BEHAVIORAL_EVENTS
                BET_ASSIGNMENT -> Value.BET_ASSIGNMENT
                BET_CRM_CONNECTOR -> Value.BET_CRM_CONNECTOR
                BIDEN -> Value.BIDEN
                BILLING -> Value.BILLING
                BOT -> Value.BOT
                CALCULATED -> Value.CALCULATED
                CENTRAL_EXCHANGE_RATES -> Value.CENTRAL_EXCHANGE_RATES
                CHATSPOT -> Value.CHATSPOT
                CLONE_OBJECTS -> Value.CLONE_OBJECTS
                COMMUNICATOR -> Value.COMMUNICATOR
                COMPANIES -> Value.COMPANIES
                COMPANY_FAMILIES -> Value.COMPANY_FAMILIES
                COMPANY_INSIGHTS -> Value.COMPANY_INSIGHTS
                CONTACTS -> Value.CONTACTS
                CONTACTS_WEB -> Value.CONTACTS_WEB
                CONTENT_MEMBERSHIP -> Value.CONTENT_MEMBERSHIP
                CONVERSATIONAL_ENRICHMENT -> Value.CONVERSATIONAL_ENRICHMENT
                CONVERSATIONS -> Value.CONVERSATIONS
                CRM_PROCESSES_PLATFORM -> Value.CRM_PROCESSES_PLATFORM
                CRM_UI -> Value.CRM_UI
                CRM_UI_BULK_ACTION -> Value.CRM_UI_BULK_ACTION
                CUSTOMER_AGENT -> Value.CUSTOMER_AGENT
                DATA_ENRICHMENT -> Value.DATA_ENRICHMENT
                DATA_QUALITY -> Value.DATA_QUALITY
                DATASET -> Value.DATASET
                DEALS -> Value.DEALS
                DEFAULT -> Value.DEFAULT
                DELETE_OBJECTS -> Value.DELETE_OBJECTS
                EMAIL -> Value.EMAIL
                EMAIL_INBOX_IMPORT -> Value.EMAIL_INBOX_IMPORT
                EMAIL_INTEGRATION -> Value.EMAIL_INTEGRATION
                ENGAGEMENTS -> Value.ENGAGEMENTS
                EXTENSION -> Value.EXTENSION
                FILE_MANAGER -> Value.FILE_MANAGER
                FLYWHEEL_PRODUCT_DATA_SYNC -> Value.FLYWHEEL_PRODUCT_DATA_SYNC
                FORECASTING -> Value.FORECASTING
                FORM -> Value.FORM
                FORWARD_TO_CRM -> Value.FORWARD_TO_CRM
                GMAIL_INTEGRATION -> Value.GMAIL_INTEGRATION
                GOALS -> Value.GOALS
                HEISENBERG -> Value.HEISENBERG
                HELP_DESK -> Value.HELP_DESK
                HELP_DESK_AI -> Value.HELP_DESK_AI
                IMPORT -> Value.IMPORT
                INTEGRATION -> Value.INTEGRATION
                INTEGRATIONS_PLATFORM -> Value.INTEGRATIONS_PLATFORM
                INTEGRATIONS_SYNC -> Value.INTEGRATIONS_SYNC
                INTENT -> Value.INTENT
                INTERNAL_PROCESSING -> Value.INTERNAL_PROCESSING
                LEADIN -> Value.LEADIN
                LEGAL_BASIS_REMEDIATION -> Value.LEGAL_BASIS_REMEDIATION
                MARKET_SOURCING -> Value.MARKET_SOURCING
                MARKETPLACE -> Value.MARKETPLACE
                MEETINGS -> Value.MEETINGS
                MERGE_COMPANIES -> Value.MERGE_COMPANIES
                MERGE_CONTACTS -> Value.MERGE_CONTACTS
                MERGE_OBJECTS -> Value.MERGE_OBJECTS
                MERGE_REVERT_OBJECTS -> Value.MERGE_REVERT_OBJECTS
                MICROAPPS -> Value.MICROAPPS
                MIGRATION -> Value.MIGRATION
                MOBILE_ANDROID -> Value.MOBILE_ANDROID
                MOBILE_IOS -> Value.MOBILE_IOS
                PAYMENTS -> Value.PAYMENTS
                PIPELINE_SETTINGS -> Value.PIPELINE_SETTINGS
                PLAYBOOKS -> Value.PLAYBOOKS
                PORTAL_OBJECT_SYNC -> Value.PORTAL_OBJECT_SYNC
                PORTAL_USER_ASSOCIATOR -> Value.PORTAL_USER_ASSOCIATOR
                PRESENTATIONS -> Value.PRESENTATIONS
                PRIMARY_AUTOMATION -> Value.PRIMARY_AUTOMATION
                PROPERTY_DEFAULT_VALUE -> Value.PROPERTY_DEFAULT_VALUE
                PROPERTY_RESTORE -> Value.PROPERTY_RESTORE
                PROPERTY_SETTINGS -> Value.PROPERTY_SETTINGS
                PROSPECTING_AGENT -> Value.PROSPECTING_AGENT
                QUOTAS -> Value.QUOTAS
                QUOTES -> Value.QUOTES
                RECYCLING_BIN -> Value.RECYCLING_BIN
                RESTORE_OBJECTS -> Value.RESTORE_OBJECTS
                SALES -> Value.SALES
                SALES_MESSAGES -> Value.SALES_MESSAGES
                SALESFORCE -> Value.SALESFORCE
                SEQUENCES -> Value.SEQUENCES
                SETTINGS -> Value.SETTINGS
                SIDEKICK -> Value.SIDEKICK
                SIGNALS -> Value.SIGNALS
                SLACK_INTEGRATION -> Value.SLACK_INTEGRATION
                SMART_DATA_CAPTURE -> Value.SMART_DATA_CAPTURE
                SOCIAL -> Value.SOCIAL
                SUCCESS -> Value.SUCCESS
                TALLY -> Value.TALLY
                TASK -> Value.TASK
                UNKNOWN -> Value.UNKNOWN
                WAL_INCREMENTAL -> Value.WAL_INCREMENTAL
                WORK_UI -> Value.WORK_UI
                WORKFLOW_CONTACT_DELETE_ACTION -> Value.WORKFLOW_CONTACT_DELETE_ACTION
                WORKFLOWS -> Value.WORKFLOWS
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
                ACADEMY -> Known.ACADEMY
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                ACTIVITY_AUTO_ASSOCIATE -> Known.ACTIVITY_AUTO_ASSOCIATE
                ACTIVITY_LOG_REVERT -> Known.ACTIVITY_LOG_REVERT
                ADS -> Known.ADS
                AI_GROUP -> Known.AI_GROUP
                ANALYTICS -> Known.ANALYTICS
                API -> Known.API
                APPROVALS -> Known.APPROVALS
                ASSISTS -> Known.ASSISTS
                ASSOCIATIONS -> Known.ASSOCIATIONS
                AUTO_ASSOCIATE_BY_DOMAIN -> Known.AUTO_ASSOCIATE_BY_DOMAIN
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM -> Known.AUTOMATION_PLATFORM
                AVATARS_SERVICE -> Known.AVATARS_SERVICE
                BATCH_UPDATE -> Known.BATCH_UPDATE
                BCC_TO_CRM -> Known.BCC_TO_CRM
                BEHAVIORAL_EVENTS -> Known.BEHAVIORAL_EVENTS
                BET_ASSIGNMENT -> Known.BET_ASSIGNMENT
                BET_CRM_CONNECTOR -> Known.BET_CRM_CONNECTOR
                BIDEN -> Known.BIDEN
                BILLING -> Known.BILLING
                BOT -> Known.BOT
                CALCULATED -> Known.CALCULATED
                CENTRAL_EXCHANGE_RATES -> Known.CENTRAL_EXCHANGE_RATES
                CHATSPOT -> Known.CHATSPOT
                CLONE_OBJECTS -> Known.CLONE_OBJECTS
                COMMUNICATOR -> Known.COMMUNICATOR
                COMPANIES -> Known.COMPANIES
                COMPANY_FAMILIES -> Known.COMPANY_FAMILIES
                COMPANY_INSIGHTS -> Known.COMPANY_INSIGHTS
                CONTACTS -> Known.CONTACTS
                CONTACTS_WEB -> Known.CONTACTS_WEB
                CONTENT_MEMBERSHIP -> Known.CONTENT_MEMBERSHIP
                CONVERSATIONAL_ENRICHMENT -> Known.CONVERSATIONAL_ENRICHMENT
                CONVERSATIONS -> Known.CONVERSATIONS
                CRM_PROCESSES_PLATFORM -> Known.CRM_PROCESSES_PLATFORM
                CRM_UI -> Known.CRM_UI
                CRM_UI_BULK_ACTION -> Known.CRM_UI_BULK_ACTION
                CUSTOMER_AGENT -> Known.CUSTOMER_AGENT
                DATA_ENRICHMENT -> Known.DATA_ENRICHMENT
                DATA_QUALITY -> Known.DATA_QUALITY
                DATASET -> Known.DATASET
                DEALS -> Known.DEALS
                DEFAULT -> Known.DEFAULT
                DELETE_OBJECTS -> Known.DELETE_OBJECTS
                EMAIL -> Known.EMAIL
                EMAIL_INBOX_IMPORT -> Known.EMAIL_INBOX_IMPORT
                EMAIL_INTEGRATION -> Known.EMAIL_INTEGRATION
                ENGAGEMENTS -> Known.ENGAGEMENTS
                EXTENSION -> Known.EXTENSION
                FILE_MANAGER -> Known.FILE_MANAGER
                FLYWHEEL_PRODUCT_DATA_SYNC -> Known.FLYWHEEL_PRODUCT_DATA_SYNC
                FORECASTING -> Known.FORECASTING
                FORM -> Known.FORM
                FORWARD_TO_CRM -> Known.FORWARD_TO_CRM
                GMAIL_INTEGRATION -> Known.GMAIL_INTEGRATION
                GOALS -> Known.GOALS
                HEISENBERG -> Known.HEISENBERG
                HELP_DESK -> Known.HELP_DESK
                HELP_DESK_AI -> Known.HELP_DESK_AI
                IMPORT -> Known.IMPORT
                INTEGRATION -> Known.INTEGRATION
                INTEGRATIONS_PLATFORM -> Known.INTEGRATIONS_PLATFORM
                INTEGRATIONS_SYNC -> Known.INTEGRATIONS_SYNC
                INTENT -> Known.INTENT
                INTERNAL_PROCESSING -> Known.INTERNAL_PROCESSING
                LEADIN -> Known.LEADIN
                LEGAL_BASIS_REMEDIATION -> Known.LEGAL_BASIS_REMEDIATION
                MARKET_SOURCING -> Known.MARKET_SOURCING
                MARKETPLACE -> Known.MARKETPLACE
                MEETINGS -> Known.MEETINGS
                MERGE_COMPANIES -> Known.MERGE_COMPANIES
                MERGE_CONTACTS -> Known.MERGE_CONTACTS
                MERGE_OBJECTS -> Known.MERGE_OBJECTS
                MERGE_REVERT_OBJECTS -> Known.MERGE_REVERT_OBJECTS
                MICROAPPS -> Known.MICROAPPS
                MIGRATION -> Known.MIGRATION
                MOBILE_ANDROID -> Known.MOBILE_ANDROID
                MOBILE_IOS -> Known.MOBILE_IOS
                PAYMENTS -> Known.PAYMENTS
                PIPELINE_SETTINGS -> Known.PIPELINE_SETTINGS
                PLAYBOOKS -> Known.PLAYBOOKS
                PORTAL_OBJECT_SYNC -> Known.PORTAL_OBJECT_SYNC
                PORTAL_USER_ASSOCIATOR -> Known.PORTAL_USER_ASSOCIATOR
                PRESENTATIONS -> Known.PRESENTATIONS
                PRIMARY_AUTOMATION -> Known.PRIMARY_AUTOMATION
                PROPERTY_DEFAULT_VALUE -> Known.PROPERTY_DEFAULT_VALUE
                PROPERTY_RESTORE -> Known.PROPERTY_RESTORE
                PROPERTY_SETTINGS -> Known.PROPERTY_SETTINGS
                PROSPECTING_AGENT -> Known.PROSPECTING_AGENT
                QUOTAS -> Known.QUOTAS
                QUOTES -> Known.QUOTES
                RECYCLING_BIN -> Known.RECYCLING_BIN
                RESTORE_OBJECTS -> Known.RESTORE_OBJECTS
                SALES -> Known.SALES
                SALES_MESSAGES -> Known.SALES_MESSAGES
                SALESFORCE -> Known.SALESFORCE
                SEQUENCES -> Known.SEQUENCES
                SETTINGS -> Known.SETTINGS
                SIDEKICK -> Known.SIDEKICK
                SIGNALS -> Known.SIGNALS
                SLACK_INTEGRATION -> Known.SLACK_INTEGRATION
                SMART_DATA_CAPTURE -> Known.SMART_DATA_CAPTURE
                SOCIAL -> Known.SOCIAL
                SUCCESS -> Known.SUCCESS
                TALLY -> Known.TALLY
                TASK -> Known.TASK
                UNKNOWN -> Known.UNKNOWN
                WAL_INCREMENTAL -> Known.WAL_INCREMENTAL
                WORK_UI -> Known.WORK_UI
                WORKFLOW_CONTACT_DELETE_ACTION -> Known.WORKFLOW_CONTACT_DELETE_ACTION
                WORKFLOWS -> Known.WORKFLOWS
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

    /** The type of location for the meeting. Acceptable values are: ADDRESS, CUSTOM, PHONE. */
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

            @JvmField val ADDRESS = of("ADDRESS")

            @JvmField val CUSTOM = of("CUSTOM")

            @JvmField val PHONE = of("PHONE")

            @JvmStatic fun of(value: String) = HsMeetingLocationType(JsonField.of(value))
        }

        /** An enum containing [HsMeetingLocationType]'s known values. */
        enum class Known {
            ADDRESS,
            CUSTOM,
            PHONE,
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
            ADDRESS,
            CUSTOM,
            PHONE,
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
                ADDRESS -> Value.ADDRESS
                CUSTOM -> Value.CUSTOM
                PHONE -> Value.PHONE
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
                ADDRESS -> Known.ADDRESS
                CUSTOM -> Known.CUSTOM
                PHONE -> Known.PHONE
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
            hubSpotOwnerId == other.hubSpotOwnerId &&
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
            hubSpotOwnerId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalCalendarMeetingEventResponseProperties{hsEngagementSource=$hsEngagementSource, hsEngagementSourceId=$hsEngagementSourceId, hsMeetingEndTime=$hsMeetingEndTime, hsMeetingOutcome=$hsMeetingOutcome, hsMeetingStartTime=$hsMeetingStartTime, hsMeetingTitle=$hsMeetingTitle, hsTimestamp=$hsTimestamp, hsActivityType=$hsActivityType, hsAttachmentIds=$hsAttachmentIds, hsAttendeeOwnerIds=$hsAttendeeOwnerIds, hsIncludeDescriptionInReminder=$hsIncludeDescriptionInReminder, hsInternalMeetingNotes=$hsInternalMeetingNotes, hsMeetingBody=$hsMeetingBody, hsMeetingExternalUrl=$hsMeetingExternalUrl, hsMeetingLocation=$hsMeetingLocation, hsMeetingLocationType=$hsMeetingLocationType, hsUniqueId=$hsUniqueId, hubSpotOwnerId=$hubSpotOwnerId, additionalProperties=$additionalProperties}"
}
