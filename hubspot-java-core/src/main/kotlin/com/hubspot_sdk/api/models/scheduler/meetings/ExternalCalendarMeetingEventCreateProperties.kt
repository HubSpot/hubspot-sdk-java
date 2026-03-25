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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalCalendarMeetingEventCreateProperties
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hsMeetingEndTime: JsonField<OffsetDateTime>,
    private val hsMeetingOutcome: JsonField<String>,
    private val hsMeetingStartTime: JsonField<OffsetDateTime>,
    private val hsMeetingTitle: JsonField<String>,
    private val hsTimestamp: JsonField<OffsetDateTime>,
    private val hubspotOwnerId: JsonField<String>,
    private val hsActivityType: JsonField<String>,
    private val hsAttachmentIds: JsonField<List<String>>,
    private val hsAttendeeOwnerIds: JsonField<List<String>>,
    private val hsInternalMeetingNotes: JsonField<String>,
    private val hsMeetingBody: JsonField<String>,
    private val hsMeetingLocation: JsonField<String>,
    private val hsMeetingLocationType: JsonField<HsMeetingLocationType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
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
        @JsonProperty("hubspot_owner_id")
        @ExcludeMissing
        hubspotOwnerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_activity_type")
        @ExcludeMissing
        hsActivityType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_attachment_ids")
        @ExcludeMissing
        hsAttachmentIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("hs_attendee_owner_ids")
        @ExcludeMissing
        hsAttendeeOwnerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("hs_internal_meeting_notes")
        @ExcludeMissing
        hsInternalMeetingNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_body")
        @ExcludeMissing
        hsMeetingBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_location")
        @ExcludeMissing
        hsMeetingLocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hs_meeting_location_type")
        @ExcludeMissing
        hsMeetingLocationType: JsonField<HsMeetingLocationType> = JsonMissing.of(),
    ) : this(
        hsMeetingEndTime,
        hsMeetingOutcome,
        hsMeetingStartTime,
        hsMeetingTitle,
        hsTimestamp,
        hubspotOwnerId,
        hsActivityType,
        hsAttachmentIds,
        hsAttendeeOwnerIds,
        hsInternalMeetingNotes,
        hsMeetingBody,
        hsMeetingLocation,
        hsMeetingLocationType,
        mutableMapOf(),
    )

    /**
     * The time that the meeting should end in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingEndTime(): OffsetDateTime = hsMeetingEndTime.getRequired("hs_meeting_end_time")

    /**
     * The outcome of the meeting. Acceptable default values are: SCHEDULED, COMPLETED, RESCHEDULED,
     * NO_SHOW, CANCELED. This property can be changed to include additional custom values.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingOutcome(): String = hsMeetingOutcome.getRequired("hs_meeting_outcome")

    /**
     * The time that the meeting should start in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingStartTime(): OffsetDateTime =
        hsMeetingStartTime.getRequired("hs_meeting_start_time")

    /**
     * The title of the meeting and calendar event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsMeetingTitle(): String = hsMeetingTitle.getRequired("hs_meeting_title")

    /**
     * The time that the meeting should start in ISO 8601 format. This value should be the same as
     * `hs_meeting_start_time`.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hsTimestamp(): OffsetDateTime = hsTimestamp.getRequired("hs_timestamp")

    /**
     * The ownerId of the HubSpot user who will host the meeting.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hubspotOwnerId(): String = hubspotOwnerId.getRequired("hubspot_owner_id")

    /**
     * The activity type of the meeting. Acceptable values are based on portal defined call and
     * meeting types.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsActivityType(): Optional<String> = hsActivityType.getOptional("hs_activity_type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsAttachmentIds(): Optional<List<String>> = hsAttachmentIds.getOptional("hs_attachment_ids")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsAttendeeOwnerIds(): Optional<List<String>> =
        hsAttendeeOwnerIds.getOptional("hs_attendee_owner_ids")

    /**
     * Internal notes related to the meeting.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsInternalMeetingNotes(): Optional<String> =
        hsInternalMeetingNotes.getOptional("hs_internal_meeting_notes")

    /**
     * The description of the meeting and calendar event.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingBody(): Optional<String> = hsMeetingBody.getOptional("hs_meeting_body")

    /**
     * The physical address, virtual location, or phone number where the meeting will take place.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingLocation(): Optional<String> = hsMeetingLocation.getOptional("hs_meeting_location")

    /**
     * The type of location for the meeting. Acceptable values are: ADDRESS, CUSTOM, PHONE.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsMeetingLocationType(): Optional<HsMeetingLocationType> =
        hsMeetingLocationType.getOptional("hs_meeting_location_type")

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
     * Returns the raw JSON value of [hubspotOwnerId].
     *
     * Unlike [hubspotOwnerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspot_owner_id")
    @ExcludeMissing
    fun _hubspotOwnerId(): JsonField<String> = hubspotOwnerId

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
         * [ExternalCalendarMeetingEventCreateProperties].
         *
         * The following fields are required:
         * ```java
         * .hsMeetingEndTime()
         * .hsMeetingOutcome()
         * .hsMeetingStartTime()
         * .hsMeetingTitle()
         * .hsTimestamp()
         * .hubspotOwnerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalCalendarMeetingEventCreateProperties]. */
    class Builder internal constructor() {

        private var hsMeetingEndTime: JsonField<OffsetDateTime>? = null
        private var hsMeetingOutcome: JsonField<String>? = null
        private var hsMeetingStartTime: JsonField<OffsetDateTime>? = null
        private var hsMeetingTitle: JsonField<String>? = null
        private var hsTimestamp: JsonField<OffsetDateTime>? = null
        private var hubspotOwnerId: JsonField<String>? = null
        private var hsActivityType: JsonField<String> = JsonMissing.of()
        private var hsAttachmentIds: JsonField<MutableList<String>>? = null
        private var hsAttendeeOwnerIds: JsonField<MutableList<String>>? = null
        private var hsInternalMeetingNotes: JsonField<String> = JsonMissing.of()
        private var hsMeetingBody: JsonField<String> = JsonMissing.of()
        private var hsMeetingLocation: JsonField<String> = JsonMissing.of()
        private var hsMeetingLocationType: JsonField<HsMeetingLocationType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalCalendarMeetingEventCreateProperties:
                ExternalCalendarMeetingEventCreateProperties
        ) = apply {
            hsMeetingEndTime = externalCalendarMeetingEventCreateProperties.hsMeetingEndTime
            hsMeetingOutcome = externalCalendarMeetingEventCreateProperties.hsMeetingOutcome
            hsMeetingStartTime = externalCalendarMeetingEventCreateProperties.hsMeetingStartTime
            hsMeetingTitle = externalCalendarMeetingEventCreateProperties.hsMeetingTitle
            hsTimestamp = externalCalendarMeetingEventCreateProperties.hsTimestamp
            hubspotOwnerId = externalCalendarMeetingEventCreateProperties.hubspotOwnerId
            hsActivityType = externalCalendarMeetingEventCreateProperties.hsActivityType
            hsAttachmentIds =
                externalCalendarMeetingEventCreateProperties.hsAttachmentIds.map {
                    it.toMutableList()
                }
            hsAttendeeOwnerIds =
                externalCalendarMeetingEventCreateProperties.hsAttendeeOwnerIds.map {
                    it.toMutableList()
                }
            hsInternalMeetingNotes =
                externalCalendarMeetingEventCreateProperties.hsInternalMeetingNotes
            hsMeetingBody = externalCalendarMeetingEventCreateProperties.hsMeetingBody
            hsMeetingLocation = externalCalendarMeetingEventCreateProperties.hsMeetingLocation
            hsMeetingLocationType =
                externalCalendarMeetingEventCreateProperties.hsMeetingLocationType
            additionalProperties =
                externalCalendarMeetingEventCreateProperties.additionalProperties.toMutableMap()
        }

        /** The time that the meeting should end in ISO 8601 format. */
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

        /** The time that the meeting should start in ISO 8601 format. */
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

        /** The ownerId of the HubSpot user who will host the meeting. */
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
         * Returns an immutable instance of [ExternalCalendarMeetingEventCreateProperties].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hsMeetingEndTime()
         * .hsMeetingOutcome()
         * .hsMeetingStartTime()
         * .hsMeetingTitle()
         * .hsTimestamp()
         * .hubspotOwnerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalCalendarMeetingEventCreateProperties =
            ExternalCalendarMeetingEventCreateProperties(
                checkRequired("hsMeetingEndTime", hsMeetingEndTime),
                checkRequired("hsMeetingOutcome", hsMeetingOutcome),
                checkRequired("hsMeetingStartTime", hsMeetingStartTime),
                checkRequired("hsMeetingTitle", hsMeetingTitle),
                checkRequired("hsTimestamp", hsTimestamp),
                checkRequired("hubspotOwnerId", hubspotOwnerId),
                hsActivityType,
                (hsAttachmentIds ?: JsonMissing.of()).map { it.toImmutable() },
                (hsAttendeeOwnerIds ?: JsonMissing.of()).map { it.toImmutable() },
                hsInternalMeetingNotes,
                hsMeetingBody,
                hsMeetingLocation,
                hsMeetingLocationType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalCalendarMeetingEventCreateProperties = apply {
        if (validated) {
            return@apply
        }

        hsMeetingEndTime()
        hsMeetingOutcome()
        hsMeetingStartTime()
        hsMeetingTitle()
        hsTimestamp()
        hubspotOwnerId()
        hsActivityType()
        hsAttachmentIds()
        hsAttendeeOwnerIds()
        hsInternalMeetingNotes()
        hsMeetingBody()
        hsMeetingLocation()
        hsMeetingLocationType().ifPresent { it.validate() }
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
        (if (hsMeetingEndTime.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingOutcome.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingStartTime.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingTitle.asKnown().isPresent) 1 else 0) +
            (if (hsTimestamp.asKnown().isPresent) 1 else 0) +
            (if (hubspotOwnerId.asKnown().isPresent) 1 else 0) +
            (if (hsActivityType.asKnown().isPresent) 1 else 0) +
            (hsAttachmentIds.asKnown().getOrNull()?.size ?: 0) +
            (hsAttendeeOwnerIds.asKnown().getOrNull()?.size ?: 0) +
            (if (hsInternalMeetingNotes.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingBody.asKnown().isPresent) 1 else 0) +
            (if (hsMeetingLocation.asKnown().isPresent) 1 else 0) +
            (hsMeetingLocationType.asKnown().getOrNull()?.validity() ?: 0)

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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ADDRESS -> Known.ADDRESS
                CUSTOM -> Known.CUSTOM
                PHONE -> Known.PHONE
                else -> throw HubspotInvalidDataException("Unknown HsMeetingLocationType: $value")
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

            return other is HsMeetingLocationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalCalendarMeetingEventCreateProperties &&
            hsMeetingEndTime == other.hsMeetingEndTime &&
            hsMeetingOutcome == other.hsMeetingOutcome &&
            hsMeetingStartTime == other.hsMeetingStartTime &&
            hsMeetingTitle == other.hsMeetingTitle &&
            hsTimestamp == other.hsTimestamp &&
            hubspotOwnerId == other.hubspotOwnerId &&
            hsActivityType == other.hsActivityType &&
            hsAttachmentIds == other.hsAttachmentIds &&
            hsAttendeeOwnerIds == other.hsAttendeeOwnerIds &&
            hsInternalMeetingNotes == other.hsInternalMeetingNotes &&
            hsMeetingBody == other.hsMeetingBody &&
            hsMeetingLocation == other.hsMeetingLocation &&
            hsMeetingLocationType == other.hsMeetingLocationType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            hsMeetingEndTime,
            hsMeetingOutcome,
            hsMeetingStartTime,
            hsMeetingTitle,
            hsTimestamp,
            hubspotOwnerId,
            hsActivityType,
            hsAttachmentIds,
            hsAttendeeOwnerIds,
            hsInternalMeetingNotes,
            hsMeetingBody,
            hsMeetingLocation,
            hsMeetingLocationType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalCalendarMeetingEventCreateProperties{hsMeetingEndTime=$hsMeetingEndTime, hsMeetingOutcome=$hsMeetingOutcome, hsMeetingStartTime=$hsMeetingStartTime, hsMeetingTitle=$hsMeetingTitle, hsTimestamp=$hsTimestamp, hubspotOwnerId=$hubspotOwnerId, hsActivityType=$hsActivityType, hsAttachmentIds=$hsAttachmentIds, hsAttendeeOwnerIds=$hsAttendeeOwnerIds, hsInternalMeetingNotes=$hsInternalMeetingNotes, hsMeetingBody=$hsMeetingBody, hsMeetingLocation=$hsMeetingLocation, hsMeetingLocationType=$hsMeetingLocationType, additionalProperties=$additionalProperties}"
}
