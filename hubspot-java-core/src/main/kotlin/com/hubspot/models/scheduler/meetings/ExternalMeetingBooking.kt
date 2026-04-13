// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ExternalMeetingBooking
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val duration: JsonField<Long>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val formFields: JsonField<List<ExternalBookingFormField>>,
    private val lastName: JsonField<String>,
    private val legalConsentResponses: JsonField<List<ExternalLegalConsentResponse>>,
    private val likelyAvailableUserIds: JsonField<List<String>>,
    private val slug: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val locale: JsonField<String>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("formFields")
        @ExcludeMissing
        formFields: JsonField<List<ExternalBookingFormField>> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalConsentResponses")
        @ExcludeMissing
        legalConsentResponses: JsonField<List<ExternalLegalConsentResponse>> = JsonMissing.of(),
        @JsonProperty("likelyAvailableUserIds")
        @ExcludeMissing
        likelyAvailableUserIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(
        duration,
        email,
        firstName,
        formFields,
        lastName,
        legalConsentResponses,
        likelyAvailableUserIds,
        slug,
        startTime,
        locale,
        timezone,
        mutableMapOf(),
    )

    /**
     * The duration of the meeting in milliseconds.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun duration(): Long = duration.getRequired("duration")

    /**
     * The email address of the person booking the meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The first name of the person booking the meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("firstName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun formFields(): List<ExternalBookingFormField> = formFields.getRequired("formFields")

    /**
     * The last name of the person booking the meeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = lastName.getRequired("lastName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalConsentResponses(): List<ExternalLegalConsentResponse> =
        legalConsentResponses.getRequired("legalConsentResponses")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun likelyAvailableUserIds(): List<String> =
        likelyAvailableUserIds.getRequired("likelyAvailableUserIds")

    /**
     * The unique path identifier for the meeting page.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slug(): String = slug.getRequired("slug")

    /**
     * The date and time when the meeting is scheduled to start, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * The locale used for formatting dates and times in the meeting booking.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<String> = locale.getOptional("locale")

    /**
     * The timezone in which the meeting is scheduled.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = timezone.getOptional("timezone")

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [formFields].
     *
     * Unlike [formFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formFields")
    @ExcludeMissing
    fun _formFields(): JsonField<List<ExternalBookingFormField>> = formFields

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
     * Returns the raw JSON value of [likelyAvailableUserIds].
     *
     * Unlike [likelyAvailableUserIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("likelyAvailableUserIds")
    @ExcludeMissing
    fun _likelyAvailableUserIds(): JsonField<List<String>> = likelyAvailableUserIds

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
         * Returns a mutable builder for constructing an instance of [ExternalMeetingBooking].
         *
         * The following fields are required:
         * ```java
         * .duration()
         * .email()
         * .firstName()
         * .formFields()
         * .lastName()
         * .legalConsentResponses()
         * .likelyAvailableUserIds()
         * .slug()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMeetingBooking]. */
    class Builder internal constructor() {

        private var duration: JsonField<Long>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var formFields: JsonField<MutableList<ExternalBookingFormField>>? = null
        private var lastName: JsonField<String>? = null
        private var legalConsentResponses: JsonField<MutableList<ExternalLegalConsentResponse>>? =
            null
        private var likelyAvailableUserIds: JsonField<MutableList<String>>? = null
        private var slug: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var locale: JsonField<String> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMeetingBooking: ExternalMeetingBooking) = apply {
            duration = externalMeetingBooking.duration
            email = externalMeetingBooking.email
            firstName = externalMeetingBooking.firstName
            formFields = externalMeetingBooking.formFields.map { it.toMutableList() }
            lastName = externalMeetingBooking.lastName
            legalConsentResponses =
                externalMeetingBooking.legalConsentResponses.map { it.toMutableList() }
            likelyAvailableUserIds =
                externalMeetingBooking.likelyAvailableUserIds.map { it.toMutableList() }
            slug = externalMeetingBooking.slug
            startTime = externalMeetingBooking.startTime
            locale = externalMeetingBooking.locale
            timezone = externalMeetingBooking.timezone
            additionalProperties = externalMeetingBooking.additionalProperties.toMutableMap()
        }

        /** The duration of the meeting in milliseconds. */
        fun duration(duration: Long) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

        /** The email address of the person booking the meeting. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The first name of the person booking the meeting. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun formFields(formFields: List<ExternalBookingFormField>) =
            formFields(JsonField.of(formFields))

        /**
         * Sets [Builder.formFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formFields] with a well-typed
         * `List<ExternalBookingFormField>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun formFields(formFields: JsonField<List<ExternalBookingFormField>>) = apply {
            this.formFields = formFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalBookingFormField] to [formFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormField(formField: ExternalBookingFormField) = apply {
            formFields =
                (formFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("formFields", it).add(formField)
                }
        }

        /** The last name of the person booking the meeting. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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

        fun likelyAvailableUserIds(likelyAvailableUserIds: List<String>) =
            likelyAvailableUserIds(JsonField.of(likelyAvailableUserIds))

        /**
         * Sets [Builder.likelyAvailableUserIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.likelyAvailableUserIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun likelyAvailableUserIds(likelyAvailableUserIds: JsonField<List<String>>) = apply {
            this.likelyAvailableUserIds = likelyAvailableUserIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [likelyAvailableUserIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLikelyAvailableUserId(likelyAvailableUserId: String) = apply {
            likelyAvailableUserIds =
                (likelyAvailableUserIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("likelyAvailableUserIds", it).add(likelyAvailableUserId)
                }
        }

        /** The unique path identifier for the meeting page. */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /** The date and time when the meeting is scheduled to start, in ISO 8601 format. */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** The locale used for formatting dates and times in the meeting booking. */
        fun locale(locale: String) = locale(JsonField.of(locale))

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<String>) = apply { this.locale = locale }

        /** The timezone in which the meeting is scheduled. */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [ExternalMeetingBooking].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .duration()
         * .email()
         * .firstName()
         * .formFields()
         * .lastName()
         * .legalConsentResponses()
         * .likelyAvailableUserIds()
         * .slug()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMeetingBooking =
            ExternalMeetingBooking(
                checkRequired("duration", duration),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("formFields", formFields).map { it.toImmutable() },
                checkRequired("lastName", lastName),
                checkRequired("legalConsentResponses", legalConsentResponses).map {
                    it.toImmutable()
                },
                checkRequired("likelyAvailableUserIds", likelyAvailableUserIds).map {
                    it.toImmutable()
                },
                checkRequired("slug", slug),
                checkRequired("startTime", startTime),
                locale,
                timezone,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalMeetingBooking = apply {
        if (validated) {
            return@apply
        }

        duration()
        email()
        firstName()
        formFields().forEach { it.validate() }
        lastName()
        legalConsentResponses().forEach { it.validate() }
        likelyAvailableUserIds()
        slug()
        startTime()
        locale()
        timezone()
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
        (if (duration.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (formFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (legalConsentResponses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (likelyAvailableUserIds.asKnown().getOrNull()?.size ?: 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (locale.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalMeetingBooking &&
            duration == other.duration &&
            email == other.email &&
            firstName == other.firstName &&
            formFields == other.formFields &&
            lastName == other.lastName &&
            legalConsentResponses == other.legalConsentResponses &&
            likelyAvailableUserIds == other.likelyAvailableUserIds &&
            slug == other.slug &&
            startTime == other.startTime &&
            locale == other.locale &&
            timezone == other.timezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            duration,
            email,
            firstName,
            formFields,
            lastName,
            legalConsentResponses,
            likelyAvailableUserIds,
            slug,
            startTime,
            locale,
            timezone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMeetingBooking{duration=$duration, email=$email, firstName=$firstName, formFields=$formFields, lastName=$lastName, legalConsentResponses=$legalConsentResponses, likelyAvailableUserIds=$likelyAvailableUserIds, slug=$slug, startTime=$startTime, locale=$locale, timezone=$timezone, additionalProperties=$additionalProperties}"
}
