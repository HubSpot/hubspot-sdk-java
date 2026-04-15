// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalMeetingBookingResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bookingTimezone: JsonField<String>,
    private val calendarEventId: JsonField<String>,
    private val contactId: JsonField<String>,
    private val duration: JsonField<Long>,
    private val end: JsonField<OffsetDateTime>,
    private val formFields: JsonField<List<ExternalValidatedFormField>>,
    private val guestEmails: JsonField<List<String>>,
    private val isOffline: JsonField<Boolean>,
    private val legalConsentResponses: JsonField<List<ExternalLegalConsentResponse>>,
    private val start: JsonField<OffsetDateTime>,
    private val subject: JsonField<String>,
    private val locale: JsonField<String>,
    private val location: JsonField<String>,
    private val webConferenceMeetingId: JsonField<String>,
    private val webConferenceUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bookingTimezone")
        @ExcludeMissing
        bookingTimezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calendarEventId")
        @ExcludeMissing
        calendarEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contactId") @ExcludeMissing contactId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("end") @ExcludeMissing end: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("formFields")
        @ExcludeMissing
        formFields: JsonField<List<ExternalValidatedFormField>> = JsonMissing.of(),
        @JsonProperty("guestEmails")
        @ExcludeMissing
        guestEmails: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("isOffline") @ExcludeMissing isOffline: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("legalConsentResponses")
        @ExcludeMissing
        legalConsentResponses: JsonField<List<ExternalLegalConsentResponse>> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webConferenceMeetingId")
        @ExcludeMissing
        webConferenceMeetingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webConferenceUrl")
        @ExcludeMissing
        webConferenceUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        bookingTimezone,
        calendarEventId,
        contactId,
        duration,
        end,
        formFields,
        guestEmails,
        isOffline,
        legalConsentResponses,
        start,
        subject,
        locale,
        location,
        webConferenceMeetingId,
        webConferenceUrl,
        mutableMapOf(),
    )

    /**
     * The timezone the meeting was booked from.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bookingTimezone(): String = bookingTimezone.getRequired("bookingTimezone")

    /**
     * The unique identifier for the meeting's calendar event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun calendarEventId(): String = calendarEventId.getRequired("calendarEventId")

    /**
     * The ID of the contact associated to the meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactId(): String = contactId.getRequired("contactId")

    /**
     * The duration of the meeting in milliseconds.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun duration(): Long = duration.getRequired("duration")

    /**
     * The date and time when the meeting is scheduled to end, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun end(): OffsetDateTime = end.getRequired("end")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun formFields(): List<ExternalValidatedFormField> = formFields.getRequired("formFields")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun guestEmails(): List<String> = guestEmails.getRequired("guestEmails")

    /**
     * Whether the meeting was booked offline and no associated calendar event was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isOffline(): Boolean = isOffline.getRequired("isOffline")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalConsentResponses(): List<ExternalLegalConsentResponse> =
        legalConsentResponses.getRequired("legalConsentResponses")

    /**
     * The date and time when the meeting is scheduled to start, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun start(): OffsetDateTime = start.getRequired("start")

    /**
     * The title of the meeting and calendar event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subject(): String = subject.getRequired("subject")

    /**
     * The locale the meeting was booked with, used to determine date formatting in calendar event
     * description.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<String> = locale.getOptional("locale")

    /**
     * The physical or virtual location where the meeting will take place.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * The unique identifier for the web conference meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webConferenceMeetingId(): Optional<String> =
        webConferenceMeetingId.getOptional("webConferenceMeetingId")

    /**
     * The URL for accessing the meeting's web conference.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webConferenceUrl(): Optional<String> = webConferenceUrl.getOptional("webConferenceUrl")

    /**
     * Returns the raw JSON value of [bookingTimezone].
     *
     * Unlike [bookingTimezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bookingTimezone")
    @ExcludeMissing
    fun _bookingTimezone(): JsonField<String> = bookingTimezone

    /**
     * Returns the raw JSON value of [calendarEventId].
     *
     * Unlike [calendarEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calendarEventId")
    @ExcludeMissing
    fun _calendarEventId(): JsonField<String> = calendarEventId

    /**
     * Returns the raw JSON value of [contactId].
     *
     * Unlike [contactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactId") @ExcludeMissing fun _contactId(): JsonField<String> = contactId

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

    /**
     * Returns the raw JSON value of [end].
     *
     * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

    /**
     * Returns the raw JSON value of [formFields].
     *
     * Unlike [formFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formFields")
    @ExcludeMissing
    fun _formFields(): JsonField<List<ExternalValidatedFormField>> = formFields

    /**
     * Returns the raw JSON value of [guestEmails].
     *
     * Unlike [guestEmails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guestEmails")
    @ExcludeMissing
    fun _guestEmails(): JsonField<List<String>> = guestEmails

    /**
     * Returns the raw JSON value of [isOffline].
     *
     * Unlike [isOffline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isOffline") @ExcludeMissing fun _isOffline(): JsonField<Boolean> = isOffline

    /**
     * Returns the raw JSON value of [legalConsentResponses].
     *
     * Unlike [legalConsentResponses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalConsentResponses")
    @ExcludeMissing
    fun _legalConsentResponses(): JsonField<List<ExternalLegalConsentResponse>> =
        legalConsentResponses

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

    /**
     * Returns the raw JSON value of [webConferenceMeetingId].
     *
     * Unlike [webConferenceMeetingId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("webConferenceMeetingId")
    @ExcludeMissing
    fun _webConferenceMeetingId(): JsonField<String> = webConferenceMeetingId

    /**
     * Returns the raw JSON value of [webConferenceUrl].
     *
     * Unlike [webConferenceUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webConferenceUrl")
    @ExcludeMissing
    fun _webConferenceUrl(): JsonField<String> = webConferenceUrl

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
         * [ExternalMeetingBookingResponse].
         *
         * The following fields are required:
         * ```java
         * .bookingTimezone()
         * .calendarEventId()
         * .contactId()
         * .duration()
         * .end()
         * .formFields()
         * .guestEmails()
         * .isOffline()
         * .legalConsentResponses()
         * .start()
         * .subject()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMeetingBookingResponse]. */
    class Builder internal constructor() {

        private var bookingTimezone: JsonField<String>? = null
        private var calendarEventId: JsonField<String>? = null
        private var contactId: JsonField<String>? = null
        private var duration: JsonField<Long>? = null
        private var end: JsonField<OffsetDateTime>? = null
        private var formFields: JsonField<MutableList<ExternalValidatedFormField>>? = null
        private var guestEmails: JsonField<MutableList<String>>? = null
        private var isOffline: JsonField<Boolean>? = null
        private var legalConsentResponses: JsonField<MutableList<ExternalLegalConsentResponse>>? =
            null
        private var start: JsonField<OffsetDateTime>? = null
        private var subject: JsonField<String>? = null
        private var locale: JsonField<String> = JsonMissing.of()
        private var location: JsonField<String> = JsonMissing.of()
        private var webConferenceMeetingId: JsonField<String> = JsonMissing.of()
        private var webConferenceUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMeetingBookingResponse: ExternalMeetingBookingResponse) = apply {
            bookingTimezone = externalMeetingBookingResponse.bookingTimezone
            calendarEventId = externalMeetingBookingResponse.calendarEventId
            contactId = externalMeetingBookingResponse.contactId
            duration = externalMeetingBookingResponse.duration
            end = externalMeetingBookingResponse.end
            formFields = externalMeetingBookingResponse.formFields.map { it.toMutableList() }
            guestEmails = externalMeetingBookingResponse.guestEmails.map { it.toMutableList() }
            isOffline = externalMeetingBookingResponse.isOffline
            legalConsentResponses =
                externalMeetingBookingResponse.legalConsentResponses.map { it.toMutableList() }
            start = externalMeetingBookingResponse.start
            subject = externalMeetingBookingResponse.subject
            locale = externalMeetingBookingResponse.locale
            location = externalMeetingBookingResponse.location
            webConferenceMeetingId = externalMeetingBookingResponse.webConferenceMeetingId
            webConferenceUrl = externalMeetingBookingResponse.webConferenceUrl
            additionalProperties =
                externalMeetingBookingResponse.additionalProperties.toMutableMap()
        }

        /** The timezone the meeting was booked from. */
        fun bookingTimezone(bookingTimezone: String) =
            bookingTimezone(JsonField.of(bookingTimezone))

        /**
         * Sets [Builder.bookingTimezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bookingTimezone] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bookingTimezone(bookingTimezone: JsonField<String>) = apply {
            this.bookingTimezone = bookingTimezone
        }

        /** The unique identifier for the meeting's calendar event. */
        fun calendarEventId(calendarEventId: String) =
            calendarEventId(JsonField.of(calendarEventId))

        /**
         * Sets [Builder.calendarEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calendarEventId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun calendarEventId(calendarEventId: JsonField<String>) = apply {
            this.calendarEventId = calendarEventId
        }

        /** The ID of the contact associated to the meeting. */
        fun contactId(contactId: String) = contactId(JsonField.of(contactId))

        /**
         * Sets [Builder.contactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactId(contactId: JsonField<String>) = apply { this.contactId = contactId }

        /** The duration of the meeting in milliseconds. */
        fun duration(duration: Long) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

        /** The date and time when the meeting is scheduled to end, in ISO 8601 format. */
        fun end(end: OffsetDateTime) = end(JsonField.of(end))

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

        fun formFields(formFields: List<ExternalValidatedFormField>) =
            formFields(JsonField.of(formFields))

        /**
         * Sets [Builder.formFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formFields] with a well-typed
         * `List<ExternalValidatedFormField>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun formFields(formFields: JsonField<List<ExternalValidatedFormField>>) = apply {
            this.formFields = formFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalValidatedFormField] to [formFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormField(formField: ExternalValidatedFormField) = apply {
            formFields =
                (formFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("formFields", it).add(formField)
                }
        }

        fun guestEmails(guestEmails: List<String>) = guestEmails(JsonField.of(guestEmails))

        /**
         * Sets [Builder.guestEmails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guestEmails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guestEmails(guestEmails: JsonField<List<String>>) = apply {
            this.guestEmails = guestEmails.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [guestEmails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuestEmail(guestEmail: String) = apply {
            guestEmails =
                (guestEmails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("guestEmails", it).add(guestEmail)
                }
        }

        /** Whether the meeting was booked offline and no associated calendar event was created. */
        fun isOffline(isOffline: Boolean) = isOffline(JsonField.of(isOffline))

        /**
         * Sets [Builder.isOffline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOffline] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isOffline(isOffline: JsonField<Boolean>) = apply { this.isOffline = isOffline }

        fun legalConsentResponses(legalConsentResponses: List<ExternalLegalConsentResponse>) =
            legalConsentResponses(JsonField.of(legalConsentResponses))

        /**
         * Sets [Builder.legalConsentResponses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalConsentResponses] with a well-typed
         * `List<ExternalLegalConsentResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun legalConsentResponses(
            legalConsentResponses: JsonField<List<ExternalLegalConsentResponse>>
        ) = apply { this.legalConsentResponses = legalConsentResponses.map { it.toMutableList() } }

        /**
         * Adds a single [ExternalLegalConsentResponse] to [legalConsentResponses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLegalConsentResponse(legalConsentResponse: ExternalLegalConsentResponse) = apply {
            legalConsentResponses =
                (legalConsentResponses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("legalConsentResponses", it).add(legalConsentResponse)
                }
        }

        /** The date and time when the meeting is scheduled to start, in ISO 8601 format. */
        fun start(start: OffsetDateTime) = start(JsonField.of(start))

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

        /** The title of the meeting and calendar event. */
        fun subject(subject: String) = subject(JsonField.of(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

        /**
         * The locale the meeting was booked with, used to determine date formatting in calendar
         * event description.
         */
        fun locale(locale: String) = locale(JsonField.of(locale))

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<String>) = apply { this.locale = locale }

        /** The physical or virtual location where the meeting will take place. */
        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        /** The unique identifier for the web conference meeting. */
        fun webConferenceMeetingId(webConferenceMeetingId: String) =
            webConferenceMeetingId(JsonField.of(webConferenceMeetingId))

        /**
         * Sets [Builder.webConferenceMeetingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webConferenceMeetingId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webConferenceMeetingId(webConferenceMeetingId: JsonField<String>) = apply {
            this.webConferenceMeetingId = webConferenceMeetingId
        }

        /** The URL for accessing the meeting's web conference. */
        fun webConferenceUrl(webConferenceUrl: String) =
            webConferenceUrl(JsonField.of(webConferenceUrl))

        /**
         * Sets [Builder.webConferenceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webConferenceUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webConferenceUrl(webConferenceUrl: JsonField<String>) = apply {
            this.webConferenceUrl = webConferenceUrl
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
         * Returns an immutable instance of [ExternalMeetingBookingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bookingTimezone()
         * .calendarEventId()
         * .contactId()
         * .duration()
         * .end()
         * .formFields()
         * .guestEmails()
         * .isOffline()
         * .legalConsentResponses()
         * .start()
         * .subject()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMeetingBookingResponse =
            ExternalMeetingBookingResponse(
                checkRequired("bookingTimezone", bookingTimezone),
                checkRequired("calendarEventId", calendarEventId),
                checkRequired("contactId", contactId),
                checkRequired("duration", duration),
                checkRequired("end", end),
                checkRequired("formFields", formFields).map { it.toImmutable() },
                checkRequired("guestEmails", guestEmails).map { it.toImmutable() },
                checkRequired("isOffline", isOffline),
                checkRequired("legalConsentResponses", legalConsentResponses).map {
                    it.toImmutable()
                },
                checkRequired("start", start),
                checkRequired("subject", subject),
                locale,
                location,
                webConferenceMeetingId,
                webConferenceUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalMeetingBookingResponse = apply {
        if (validated) {
            return@apply
        }

        bookingTimezone()
        calendarEventId()
        contactId()
        duration()
        end()
        formFields().forEach { it.validate() }
        guestEmails()
        isOffline()
        legalConsentResponses().forEach { it.validate() }
        start()
        subject()
        locale()
        location()
        webConferenceMeetingId()
        webConferenceUrl()
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
        (if (bookingTimezone.asKnown().isPresent) 1 else 0) +
            (if (calendarEventId.asKnown().isPresent) 1 else 0) +
            (if (contactId.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (end.asKnown().isPresent) 1 else 0) +
            (formFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (guestEmails.asKnown().getOrNull()?.size ?: 0) +
            (if (isOffline.asKnown().isPresent) 1 else 0) +
            (legalConsentResponses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (locale.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (webConferenceMeetingId.asKnown().isPresent) 1 else 0) +
            (if (webConferenceUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalMeetingBookingResponse &&
            bookingTimezone == other.bookingTimezone &&
            calendarEventId == other.calendarEventId &&
            contactId == other.contactId &&
            duration == other.duration &&
            end == other.end &&
            formFields == other.formFields &&
            guestEmails == other.guestEmails &&
            isOffline == other.isOffline &&
            legalConsentResponses == other.legalConsentResponses &&
            start == other.start &&
            subject == other.subject &&
            locale == other.locale &&
            location == other.location &&
            webConferenceMeetingId == other.webConferenceMeetingId &&
            webConferenceUrl == other.webConferenceUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bookingTimezone,
            calendarEventId,
            contactId,
            duration,
            end,
            formFields,
            guestEmails,
            isOffline,
            legalConsentResponses,
            start,
            subject,
            locale,
            location,
            webConferenceMeetingId,
            webConferenceUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMeetingBookingResponse{bookingTimezone=$bookingTimezone, calendarEventId=$calendarEventId, contactId=$contactId, duration=$duration, end=$end, formFields=$formFields, guestEmails=$guestEmails, isOffline=$isOffline, legalConsentResponses=$legalConsentResponses, start=$start, subject=$subject, locale=$locale, location=$location, webConferenceMeetingId=$webConferenceMeetingId, webConferenceUrl=$webConferenceUrl, additionalProperties=$additionalProperties}"
}
