// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalMeetingsLinkSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val availability: JsonField<Availability>,
    private val durations: JsonField<List<Long>>,
    private val formFields: JsonField<List<ExternalLinkFormField>>,
    private val legalConsentEnabled: JsonField<Boolean>,
    private val meetingBufferTime: JsonField<Int>,
    private val ownerPrioritized: JsonField<Boolean>,
    private val startTimeIncrementMinutes: JsonField<String>,
    private val weeksToAdvertise: JsonField<Int>,
    private val customAvailabilityEndDate: JsonField<Long>,
    private val customAvailabilityStartDate: JsonField<Long>,
    private val displayInfo: JsonField<ExternalLinkDisplayInfo>,
    private val guestSettings: JsonField<ExternalGuestSettings>,
    private val language: JsonField<String>,
    private val legalConsentOptions: JsonField<ExternalLegalConsentOptions>,
    private val locale: JsonField<String>,
    private val location: JsonField<String>,
    private val redirectUrl: JsonField<String>,
    private val welcomeScreenInfo: JsonField<ExternalMeetingsWelcomeScreenInfo>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("availability")
        @ExcludeMissing
        availability: JsonField<Availability> = JsonMissing.of(),
        @JsonProperty("durations")
        @ExcludeMissing
        durations: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("formFields")
        @ExcludeMissing
        formFields: JsonField<List<ExternalLinkFormField>> = JsonMissing.of(),
        @JsonProperty("legalConsentEnabled")
        @ExcludeMissing
        legalConsentEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("meetingBufferTime")
        @ExcludeMissing
        meetingBufferTime: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("ownerPrioritized")
        @ExcludeMissing
        ownerPrioritized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("startTimeIncrementMinutes")
        @ExcludeMissing
        startTimeIncrementMinutes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("weeksToAdvertise")
        @ExcludeMissing
        weeksToAdvertise: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("customAvailabilityEndDate")
        @ExcludeMissing
        customAvailabilityEndDate: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("customAvailabilityStartDate")
        @ExcludeMissing
        customAvailabilityStartDate: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("displayInfo")
        @ExcludeMissing
        displayInfo: JsonField<ExternalLinkDisplayInfo> = JsonMissing.of(),
        @JsonProperty("guestSettings")
        @ExcludeMissing
        guestSettings: JsonField<ExternalGuestSettings> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legalConsentOptions")
        @ExcludeMissing
        legalConsentOptions: JsonField<ExternalLegalConsentOptions> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redirectUrl")
        @ExcludeMissing
        redirectUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("welcomeScreenInfo")
        @ExcludeMissing
        welcomeScreenInfo: JsonField<ExternalMeetingsWelcomeScreenInfo> = JsonMissing.of(),
    ) : this(
        availability,
        durations,
        formFields,
        legalConsentEnabled,
        meetingBufferTime,
        ownerPrioritized,
        startTimeIncrementMinutes,
        weeksToAdvertise,
        customAvailabilityEndDate,
        customAvailabilityStartDate,
        displayInfo,
        guestSettings,
        language,
        legalConsentOptions,
        locale,
        location,
        redirectUrl,
        welcomeScreenInfo,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availability(): Availability = availability.getRequired("availability")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun durations(): List<Long> = durations.getRequired("durations")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun formFields(): List<ExternalLinkFormField> = formFields.getRequired("formFields")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalConsentEnabled(): Boolean = legalConsentEnabled.getRequired("legalConsentEnabled")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meetingBufferTime(): Int = meetingBufferTime.getRequired("meetingBufferTime")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownerPrioritized(): Boolean = ownerPrioritized.getRequired("ownerPrioritized")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTimeIncrementMinutes(): String =
        startTimeIncrementMinutes.getRequired("startTimeIncrementMinutes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun weeksToAdvertise(): Int = weeksToAdvertise.getRequired("weeksToAdvertise")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customAvailabilityEndDate(): Optional<Long> =
        customAvailabilityEndDate.getOptional("customAvailabilityEndDate")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customAvailabilityStartDate(): Optional<Long> =
        customAvailabilityStartDate.getOptional("customAvailabilityStartDate")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayInfo(): Optional<ExternalLinkDisplayInfo> = displayInfo.getOptional("displayInfo")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guestSettings(): Optional<ExternalGuestSettings> =
        guestSettings.getOptional("guestSettings")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalConsentOptions(): Optional<ExternalLegalConsentOptions> =
        legalConsentOptions.getOptional("legalConsentOptions")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<String> = locale.getOptional("locale")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUrl(): Optional<String> = redirectUrl.getOptional("redirectUrl")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun welcomeScreenInfo(): Optional<ExternalMeetingsWelcomeScreenInfo> =
        welcomeScreenInfo.getOptional("welcomeScreenInfo")

    /**
     * Returns the raw JSON value of [availability].
     *
     * Unlike [availability], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("availability")
    @ExcludeMissing
    fun _availability(): JsonField<Availability> = availability

    /**
     * Returns the raw JSON value of [durations].
     *
     * Unlike [durations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("durations") @ExcludeMissing fun _durations(): JsonField<List<Long>> = durations

    /**
     * Returns the raw JSON value of [formFields].
     *
     * Unlike [formFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formFields")
    @ExcludeMissing
    fun _formFields(): JsonField<List<ExternalLinkFormField>> = formFields

    /**
     * Returns the raw JSON value of [legalConsentEnabled].
     *
     * Unlike [legalConsentEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalConsentEnabled")
    @ExcludeMissing
    fun _legalConsentEnabled(): JsonField<Boolean> = legalConsentEnabled

    /**
     * Returns the raw JSON value of [meetingBufferTime].
     *
     * Unlike [meetingBufferTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("meetingBufferTime")
    @ExcludeMissing
    fun _meetingBufferTime(): JsonField<Int> = meetingBufferTime

    /**
     * Returns the raw JSON value of [ownerPrioritized].
     *
     * Unlike [ownerPrioritized], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ownerPrioritized")
    @ExcludeMissing
    fun _ownerPrioritized(): JsonField<Boolean> = ownerPrioritized

    /**
     * Returns the raw JSON value of [startTimeIncrementMinutes].
     *
     * Unlike [startTimeIncrementMinutes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("startTimeIncrementMinutes")
    @ExcludeMissing
    fun _startTimeIncrementMinutes(): JsonField<String> = startTimeIncrementMinutes

    /**
     * Returns the raw JSON value of [weeksToAdvertise].
     *
     * Unlike [weeksToAdvertise], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("weeksToAdvertise")
    @ExcludeMissing
    fun _weeksToAdvertise(): JsonField<Int> = weeksToAdvertise

    /**
     * Returns the raw JSON value of [customAvailabilityEndDate].
     *
     * Unlike [customAvailabilityEndDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customAvailabilityEndDate")
    @ExcludeMissing
    fun _customAvailabilityEndDate(): JsonField<Long> = customAvailabilityEndDate

    /**
     * Returns the raw JSON value of [customAvailabilityStartDate].
     *
     * Unlike [customAvailabilityStartDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customAvailabilityStartDate")
    @ExcludeMissing
    fun _customAvailabilityStartDate(): JsonField<Long> = customAvailabilityStartDate

    /**
     * Returns the raw JSON value of [displayInfo].
     *
     * Unlike [displayInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayInfo")
    @ExcludeMissing
    fun _displayInfo(): JsonField<ExternalLinkDisplayInfo> = displayInfo

    /**
     * Returns the raw JSON value of [guestSettings].
     *
     * Unlike [guestSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guestSettings")
    @ExcludeMissing
    fun _guestSettings(): JsonField<ExternalGuestSettings> = guestSettings

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [legalConsentOptions].
     *
     * Unlike [legalConsentOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalConsentOptions")
    @ExcludeMissing
    fun _legalConsentOptions(): JsonField<ExternalLegalConsentOptions> = legalConsentOptions

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
     * Returns the raw JSON value of [redirectUrl].
     *
     * Unlike [redirectUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirectUrl") @ExcludeMissing fun _redirectUrl(): JsonField<String> = redirectUrl

    /**
     * Returns the raw JSON value of [welcomeScreenInfo].
     *
     * Unlike [welcomeScreenInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("welcomeScreenInfo")
    @ExcludeMissing
    fun _welcomeScreenInfo(): JsonField<ExternalMeetingsWelcomeScreenInfo> = welcomeScreenInfo

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
         * Returns a mutable builder for constructing an instance of [ExternalMeetingsLinkSettings].
         *
         * The following fields are required:
         * ```java
         * .availability()
         * .durations()
         * .formFields()
         * .legalConsentEnabled()
         * .meetingBufferTime()
         * .ownerPrioritized()
         * .startTimeIncrementMinutes()
         * .weeksToAdvertise()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMeetingsLinkSettings]. */
    class Builder internal constructor() {

        private var availability: JsonField<Availability>? = null
        private var durations: JsonField<MutableList<Long>>? = null
        private var formFields: JsonField<MutableList<ExternalLinkFormField>>? = null
        private var legalConsentEnabled: JsonField<Boolean>? = null
        private var meetingBufferTime: JsonField<Int>? = null
        private var ownerPrioritized: JsonField<Boolean>? = null
        private var startTimeIncrementMinutes: JsonField<String>? = null
        private var weeksToAdvertise: JsonField<Int>? = null
        private var customAvailabilityEndDate: JsonField<Long> = JsonMissing.of()
        private var customAvailabilityStartDate: JsonField<Long> = JsonMissing.of()
        private var displayInfo: JsonField<ExternalLinkDisplayInfo> = JsonMissing.of()
        private var guestSettings: JsonField<ExternalGuestSettings> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var legalConsentOptions: JsonField<ExternalLegalConsentOptions> = JsonMissing.of()
        private var locale: JsonField<String> = JsonMissing.of()
        private var location: JsonField<String> = JsonMissing.of()
        private var redirectUrl: JsonField<String> = JsonMissing.of()
        private var welcomeScreenInfo: JsonField<ExternalMeetingsWelcomeScreenInfo> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMeetingsLinkSettings: ExternalMeetingsLinkSettings) = apply {
            availability = externalMeetingsLinkSettings.availability
            durations = externalMeetingsLinkSettings.durations.map { it.toMutableList() }
            formFields = externalMeetingsLinkSettings.formFields.map { it.toMutableList() }
            legalConsentEnabled = externalMeetingsLinkSettings.legalConsentEnabled
            meetingBufferTime = externalMeetingsLinkSettings.meetingBufferTime
            ownerPrioritized = externalMeetingsLinkSettings.ownerPrioritized
            startTimeIncrementMinutes = externalMeetingsLinkSettings.startTimeIncrementMinutes
            weeksToAdvertise = externalMeetingsLinkSettings.weeksToAdvertise
            customAvailabilityEndDate = externalMeetingsLinkSettings.customAvailabilityEndDate
            customAvailabilityStartDate = externalMeetingsLinkSettings.customAvailabilityStartDate
            displayInfo = externalMeetingsLinkSettings.displayInfo
            guestSettings = externalMeetingsLinkSettings.guestSettings
            language = externalMeetingsLinkSettings.language
            legalConsentOptions = externalMeetingsLinkSettings.legalConsentOptions
            locale = externalMeetingsLinkSettings.locale
            location = externalMeetingsLinkSettings.location
            redirectUrl = externalMeetingsLinkSettings.redirectUrl
            welcomeScreenInfo = externalMeetingsLinkSettings.welcomeScreenInfo
            additionalProperties = externalMeetingsLinkSettings.additionalProperties.toMutableMap()
        }

        fun availability(availability: Availability) = availability(JsonField.of(availability))

        /**
         * Sets [Builder.availability] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availability] with a well-typed [Availability] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun availability(availability: JsonField<Availability>) = apply {
            this.availability = availability
        }

        fun durations(durations: List<Long>) = durations(JsonField.of(durations))

        /**
         * Sets [Builder.durations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durations] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durations(durations: JsonField<List<Long>>) = apply {
            this.durations = durations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [durations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDuration(duration: Long) = apply {
            durations =
                (durations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("durations", it).add(duration)
                }
        }

        fun formFields(formFields: List<ExternalLinkFormField>) =
            formFields(JsonField.of(formFields))

        /**
         * Sets [Builder.formFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formFields] with a well-typed
         * `List<ExternalLinkFormField>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun formFields(formFields: JsonField<List<ExternalLinkFormField>>) = apply {
            this.formFields = formFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalLinkFormField] to [formFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormField(formField: ExternalLinkFormField) = apply {
            formFields =
                (formFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("formFields", it).add(formField)
                }
        }

        fun legalConsentEnabled(legalConsentEnabled: Boolean) =
            legalConsentEnabled(JsonField.of(legalConsentEnabled))

        /**
         * Sets [Builder.legalConsentEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalConsentEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalConsentEnabled(legalConsentEnabled: JsonField<Boolean>) = apply {
            this.legalConsentEnabled = legalConsentEnabled
        }

        fun meetingBufferTime(meetingBufferTime: Int) =
            meetingBufferTime(JsonField.of(meetingBufferTime))

        /**
         * Sets [Builder.meetingBufferTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meetingBufferTime] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meetingBufferTime(meetingBufferTime: JsonField<Int>) = apply {
            this.meetingBufferTime = meetingBufferTime
        }

        fun ownerPrioritized(ownerPrioritized: Boolean) =
            ownerPrioritized(JsonField.of(ownerPrioritized))

        /**
         * Sets [Builder.ownerPrioritized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerPrioritized] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ownerPrioritized(ownerPrioritized: JsonField<Boolean>) = apply {
            this.ownerPrioritized = ownerPrioritized
        }

        fun startTimeIncrementMinutes(startTimeIncrementMinutes: String) =
            startTimeIncrementMinutes(JsonField.of(startTimeIncrementMinutes))

        /**
         * Sets [Builder.startTimeIncrementMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTimeIncrementMinutes] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startTimeIncrementMinutes(startTimeIncrementMinutes: JsonField<String>) = apply {
            this.startTimeIncrementMinutes = startTimeIncrementMinutes
        }

        fun weeksToAdvertise(weeksToAdvertise: Int) =
            weeksToAdvertise(JsonField.of(weeksToAdvertise))

        /**
         * Sets [Builder.weeksToAdvertise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weeksToAdvertise] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun weeksToAdvertise(weeksToAdvertise: JsonField<Int>) = apply {
            this.weeksToAdvertise = weeksToAdvertise
        }

        fun customAvailabilityEndDate(customAvailabilityEndDate: Long) =
            customAvailabilityEndDate(JsonField.of(customAvailabilityEndDate))

        /**
         * Sets [Builder.customAvailabilityEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customAvailabilityEndDate] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customAvailabilityEndDate(customAvailabilityEndDate: JsonField<Long>) = apply {
            this.customAvailabilityEndDate = customAvailabilityEndDate
        }

        fun customAvailabilityStartDate(customAvailabilityStartDate: Long) =
            customAvailabilityStartDate(JsonField.of(customAvailabilityStartDate))

        /**
         * Sets [Builder.customAvailabilityStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customAvailabilityStartDate] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customAvailabilityStartDate(customAvailabilityStartDate: JsonField<Long>) = apply {
            this.customAvailabilityStartDate = customAvailabilityStartDate
        }

        fun displayInfo(displayInfo: ExternalLinkDisplayInfo) =
            displayInfo(JsonField.of(displayInfo))

        /**
         * Sets [Builder.displayInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayInfo] with a well-typed [ExternalLinkDisplayInfo]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun displayInfo(displayInfo: JsonField<ExternalLinkDisplayInfo>) = apply {
            this.displayInfo = displayInfo
        }

        fun guestSettings(guestSettings: ExternalGuestSettings) =
            guestSettings(JsonField.of(guestSettings))

        /**
         * Sets [Builder.guestSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guestSettings] with a well-typed [ExternalGuestSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun guestSettings(guestSettings: JsonField<ExternalGuestSettings>) = apply {
            this.guestSettings = guestSettings
        }

        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        fun legalConsentOptions(legalConsentOptions: ExternalLegalConsentOptions) =
            legalConsentOptions(JsonField.of(legalConsentOptions))

        /**
         * Sets [Builder.legalConsentOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalConsentOptions] with a well-typed
         * [ExternalLegalConsentOptions] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun legalConsentOptions(legalConsentOptions: JsonField<ExternalLegalConsentOptions>) =
            apply {
                this.legalConsentOptions = legalConsentOptions
            }

        fun locale(locale: String) = locale(JsonField.of(locale))

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<String>) = apply { this.locale = locale }

        fun location(location: String) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

        fun redirectUrl(redirectUrl: String) = redirectUrl(JsonField.of(redirectUrl))

        /**
         * Sets [Builder.redirectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectUrl(redirectUrl: JsonField<String>) = apply { this.redirectUrl = redirectUrl }

        fun welcomeScreenInfo(welcomeScreenInfo: ExternalMeetingsWelcomeScreenInfo) =
            welcomeScreenInfo(JsonField.of(welcomeScreenInfo))

        /**
         * Sets [Builder.welcomeScreenInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.welcomeScreenInfo] with a well-typed
         * [ExternalMeetingsWelcomeScreenInfo] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun welcomeScreenInfo(welcomeScreenInfo: JsonField<ExternalMeetingsWelcomeScreenInfo>) =
            apply {
                this.welcomeScreenInfo = welcomeScreenInfo
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
         * Returns an immutable instance of [ExternalMeetingsLinkSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .availability()
         * .durations()
         * .formFields()
         * .legalConsentEnabled()
         * .meetingBufferTime()
         * .ownerPrioritized()
         * .startTimeIncrementMinutes()
         * .weeksToAdvertise()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMeetingsLinkSettings =
            ExternalMeetingsLinkSettings(
                checkRequired("availability", availability),
                checkRequired("durations", durations).map { it.toImmutable() },
                checkRequired("formFields", formFields).map { it.toImmutable() },
                checkRequired("legalConsentEnabled", legalConsentEnabled),
                checkRequired("meetingBufferTime", meetingBufferTime),
                checkRequired("ownerPrioritized", ownerPrioritized),
                checkRequired("startTimeIncrementMinutes", startTimeIncrementMinutes),
                checkRequired("weeksToAdvertise", weeksToAdvertise),
                customAvailabilityEndDate,
                customAvailabilityStartDate,
                displayInfo,
                guestSettings,
                language,
                legalConsentOptions,
                locale,
                location,
                redirectUrl,
                welcomeScreenInfo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalMeetingsLinkSettings = apply {
        if (validated) {
            return@apply
        }

        availability().validate()
        durations()
        formFields().forEach { it.validate() }
        legalConsentEnabled()
        meetingBufferTime()
        ownerPrioritized()
        startTimeIncrementMinutes()
        weeksToAdvertise()
        customAvailabilityEndDate()
        customAvailabilityStartDate()
        displayInfo().ifPresent { it.validate() }
        guestSettings().ifPresent { it.validate() }
        language()
        legalConsentOptions().ifPresent { it.validate() }
        locale()
        location()
        redirectUrl()
        welcomeScreenInfo().ifPresent { it.validate() }
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
        (availability.asKnown().getOrNull()?.validity() ?: 0) +
            (durations.asKnown().getOrNull()?.size ?: 0) +
            (formFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (legalConsentEnabled.asKnown().isPresent) 1 else 0) +
            (if (meetingBufferTime.asKnown().isPresent) 1 else 0) +
            (if (ownerPrioritized.asKnown().isPresent) 1 else 0) +
            (if (startTimeIncrementMinutes.asKnown().isPresent) 1 else 0) +
            (if (weeksToAdvertise.asKnown().isPresent) 1 else 0) +
            (if (customAvailabilityEndDate.asKnown().isPresent) 1 else 0) +
            (if (customAvailabilityStartDate.asKnown().isPresent) 1 else 0) +
            (displayInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (guestSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (legalConsentOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (locale.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0) +
            (if (redirectUrl.asKnown().isPresent) 1 else 0) +
            (welcomeScreenInfo.asKnown().getOrNull()?.validity() ?: 0)

    class Availability
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

            /** Returns a mutable builder for constructing an instance of [Availability]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Availability]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(availability: Availability) = apply {
                additionalProperties = availability.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Availability].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Availability = Availability(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Availability = apply {
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

            return other is Availability && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Availability{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalMeetingsLinkSettings &&
            availability == other.availability &&
            durations == other.durations &&
            formFields == other.formFields &&
            legalConsentEnabled == other.legalConsentEnabled &&
            meetingBufferTime == other.meetingBufferTime &&
            ownerPrioritized == other.ownerPrioritized &&
            startTimeIncrementMinutes == other.startTimeIncrementMinutes &&
            weeksToAdvertise == other.weeksToAdvertise &&
            customAvailabilityEndDate == other.customAvailabilityEndDate &&
            customAvailabilityStartDate == other.customAvailabilityStartDate &&
            displayInfo == other.displayInfo &&
            guestSettings == other.guestSettings &&
            language == other.language &&
            legalConsentOptions == other.legalConsentOptions &&
            locale == other.locale &&
            location == other.location &&
            redirectUrl == other.redirectUrl &&
            welcomeScreenInfo == other.welcomeScreenInfo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            availability,
            durations,
            formFields,
            legalConsentEnabled,
            meetingBufferTime,
            ownerPrioritized,
            startTimeIncrementMinutes,
            weeksToAdvertise,
            customAvailabilityEndDate,
            customAvailabilityStartDate,
            displayInfo,
            guestSettings,
            language,
            legalConsentOptions,
            locale,
            location,
            redirectUrl,
            welcomeScreenInfo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMeetingsLinkSettings{availability=$availability, durations=$durations, formFields=$formFields, legalConsentEnabled=$legalConsentEnabled, meetingBufferTime=$meetingBufferTime, ownerPrioritized=$ownerPrioritized, startTimeIncrementMinutes=$startTimeIncrementMinutes, weeksToAdvertise=$weeksToAdvertise, customAvailabilityEndDate=$customAvailabilityEndDate, customAvailabilityStartDate=$customAvailabilityStartDate, displayInfo=$displayInfo, guestSettings=$guestSettings, language=$language, legalConsentOptions=$legalConsentOptions, locale=$locale, location=$location, redirectUrl=$redirectUrl, welcomeScreenInfo=$welcomeScreenInfo, additionalProperties=$additionalProperties}"
}
