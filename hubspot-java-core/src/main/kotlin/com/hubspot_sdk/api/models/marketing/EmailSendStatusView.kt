// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailSendStatusView
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val status: JsonField<Status>,
    private val statusId: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val eventId: JsonField<EventIdView>,
    private val message: JsonField<String>,
    private val requestedAt: JsonField<OffsetDateTime>,
    private val sendResult: JsonField<SendResult>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("statusId") @ExcludeMissing statusId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completedAt")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eventId") @ExcludeMissing eventId: JsonField<EventIdView> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestedAt")
        @ExcludeMissing
        requestedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sendResult")
        @ExcludeMissing
        sendResult: JsonField<SendResult> = JsonMissing.of(),
        @JsonProperty("startedAt")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        status,
        statusId,
        completedAt,
        eventId,
        message,
        requestedAt,
        sendResult,
        startedAt,
        mutableMapOf(),
    )

    /**
     * Status of the send request.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Identifier used to query the status of the send.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusId(): String = statusId.getRequired("statusId")

    /**
     * Time when the send was completed.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventId(): Optional<EventIdView> = eventId.getOptional("eventId")

    /**
     * A human readable message describing the error along with remediation steps where appropriate
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Time when the send was requested.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestedAt(): Optional<OffsetDateTime> = requestedAt.getOptional("requestedAt")

    /**
     * Result of the send.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendResult(): Optional<SendResult> = sendResult.getOptional("sendResult")

    /**
     * Time when the send began processing.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("startedAt")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [statusId].
     *
     * Unlike [statusId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusId") @ExcludeMissing fun _statusId(): JsonField<String> = statusId

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completedAt")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<EventIdView> = eventId

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [requestedAt].
     *
     * Unlike [requestedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestedAt")
    @ExcludeMissing
    fun _requestedAt(): JsonField<OffsetDateTime> = requestedAt

    /**
     * Returns the raw JSON value of [sendResult].
     *
     * Unlike [sendResult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sendResult")
    @ExcludeMissing
    fun _sendResult(): JsonField<SendResult> = sendResult

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startedAt")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

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
         * Returns a mutable builder for constructing an instance of [EmailSendStatusView].
         *
         * The following fields are required:
         * ```java
         * .status()
         * .statusId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailSendStatusView]. */
    class Builder internal constructor() {

        private var status: JsonField<Status>? = null
        private var statusId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventId: JsonField<EventIdView> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var requestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sendResult: JsonField<SendResult> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailSendStatusView: EmailSendStatusView) = apply {
            status = emailSendStatusView.status
            statusId = emailSendStatusView.statusId
            completedAt = emailSendStatusView.completedAt
            eventId = emailSendStatusView.eventId
            message = emailSendStatusView.message
            requestedAt = emailSendStatusView.requestedAt
            sendResult = emailSendStatusView.sendResult
            startedAt = emailSendStatusView.startedAt
            additionalProperties = emailSendStatusView.additionalProperties.toMutableMap()
        }

        /** Status of the send request. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Identifier used to query the status of the send. */
        fun statusId(statusId: String) = statusId(JsonField.of(statusId))

        /**
         * Sets [Builder.statusId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statusId(statusId: JsonField<String>) = apply { this.statusId = statusId }

        /** Time when the send was completed. */
        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun eventId(eventId: EventIdView) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [EventIdView] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventId(eventId: JsonField<EventIdView>) = apply { this.eventId = eventId }

        /**
         * A human readable message describing the error along with remediation steps where
         * appropriate
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Time when the send was requested. */
        fun requestedAt(requestedAt: OffsetDateTime) = requestedAt(JsonField.of(requestedAt))

        /**
         * Sets [Builder.requestedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
            this.requestedAt = requestedAt
        }

        /** Result of the send. */
        fun sendResult(sendResult: SendResult) = sendResult(JsonField.of(sendResult))

        /**
         * Sets [Builder.sendResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendResult] with a well-typed [SendResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendResult(sendResult: JsonField<SendResult>) = apply { this.sendResult = sendResult }

        /** Time when the send began processing. */
        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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
         * Returns an immutable instance of [EmailSendStatusView].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * .statusId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailSendStatusView =
            EmailSendStatusView(
                checkRequired("status", status),
                checkRequired("statusId", statusId),
                completedAt,
                eventId,
                message,
                requestedAt,
                sendResult,
                startedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmailSendStatusView = apply {
        if (validated) {
            return@apply
        }

        status().validate()
        statusId()
        completedAt()
        eventId().ifPresent { it.validate() }
        message()
        requestedAt()
        sendResult().ifPresent { it.validate() }
        startedAt()
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
        (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (statusId.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (eventId.asKnown().getOrNull()?.validity() ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (requestedAt.asKnown().isPresent) 1 else 0) +
            (sendResult.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0)

    /** Status of the send request. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val PENDING = of("PENDING")

            @JvmField val PROCESSING = of("PROCESSING")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELED,
            COMPLETE,
            PENDING,
            PROCESSING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELED,
            COMPLETE,
            PENDING,
            PROCESSING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CANCELED -> Value.CANCELED
                COMPLETE -> Value.COMPLETE
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
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
                CANCELED -> Known.CANCELED
                COMPLETE -> Known.COMPLETE
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                else -> throw HubspotInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Result of the send. */
    class SendResult @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ADDRESS_LIST_BOMBED = of("ADDRESS_LIST_BOMBED")

            @JvmField val ADDRESS_ONLY_ACCEPTED_ON_PROD = of("ADDRESS_ONLY_ACCEPTED_ON_PROD")

            @JvmField val ADDRESS_OPTED_OUT = of("ADDRESS_OPTED_OUT")

            @JvmField val ATTACHMENT_DOWNLOAD_QUEUE_FULL = of("ATTACHMENT_DOWNLOAD_QUEUE_FULL")

            @JvmField val BLOCKED_ADDRESS = of("BLOCKED_ADDRESS")

            @JvmField val BLOCKED_DOMAIN = of("BLOCKED_DOMAIN")

            @JvmField
            val BRAND_RECIPIENT_FATIGUE_SUPPRESSED = of("BRAND_RECIPIENT_FATIGUE_SUPPRESSED")

            @JvmField val CAMPAIGN_CANCELLED = of("CAMPAIGN_CANCELLED")

            @JvmField val CANCELLED_ABUSE = of("CANCELLED_ABUSE")

            @JvmField val CORRUPT_INPUT = of("CORRUPT_INPUT")

            @JvmField val EMAIL_DISABLED = of("EMAIL_DISABLED")

            @JvmField val EMAIL_UNCONFIRMED = of("EMAIL_UNCONFIRMED")

            @JvmField val GDPR_DOI_ENABLED = of("GDPR_DOI_ENABLED")

            @JvmField val GRAYMAIL_SUPPRESSED = of("GRAYMAIL_SUPPRESSED")

            @JvmField val HUBL_LIMIT_EXCEEDED = of("HUBL_LIMIT_EXCEEDED")

            @JvmField val IDEMPOTENT_FAIL = of("IDEMPOTENT_FAIL")

            @JvmField val IDEMPOTENT_IGNORE = of("IDEMPOTENT_IGNORE")

            @JvmField val INVALID_APP_ID_ATTRIBUTION = of("INVALID_APP_ID_ATTRIBUTION")

            @JvmField val INVALID_FROM_ADDRESS = of("INVALID_FROM_ADDRESS")

            @JvmField val INVALID_TO_ADDRESS = of("INVALID_TO_ADDRESS")

            @JvmField val LOW_CONTACT_QUALITY_SCORE = of("LOW_CONTACT_QUALITY_SCORE")

            @JvmField val MISSING_CONTENT = of("MISSING_CONTENT")

            @JvmField val MISSING_REQUIRED_PARAMETER = of("MISSING_REQUIRED_PARAMETER")

            @JvmField val MISSING_TEMPLATE_PROPERTIES = of("MISSING_TEMPLATE_PROPERTIES")

            @JvmField val MTA_IGNORE = of("MTA_IGNORE")

            @JvmField val NON_MARKETABLE_CONTACT = of("NON_MARKETABLE_CONTACT")

            @JvmField val PORTAL_AUTHENTICATION_FAILURE = of("PORTAL_AUTHENTICATION_FAILURE")

            @JvmField val PORTAL_EXPIRED = of("PORTAL_EXPIRED")

            @JvmField val PORTAL_MISSING_MARKETING_SCOPE = of("PORTAL_MISSING_MARKETING_SCOPE")

            @JvmField
            val PORTAL_NOT_AUTHORIZED_FOR_APPLICATION = of("PORTAL_NOT_AUTHORIZED_FOR_APPLICATION")

            @JvmField val PORTAL_OVER_LIMIT = of("PORTAL_OVER_LIMIT")

            @JvmField val PORTAL_SUSPENDED = of("PORTAL_SUSPENDED")

            @JvmField val PREVIOUS_SPAM = of("PREVIOUS_SPAM")

            @JvmField val PREVIOUSLY_BOUNCED = of("PREVIOUSLY_BOUNCED")

            @JvmField val PREVIOUSLY_UNSUBSCRIBED_BRAND = of("PREVIOUSLY_UNSUBSCRIBED_BRAND")

            @JvmField
            val PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT = of("PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT")

            @JvmField val PREVIOUSLY_UNSUBSCRIBED_MESSAGE = of("PREVIOUSLY_UNSUBSCRIBED_MESSAGE")

            @JvmField val PREVIOUSLY_UNSUBSCRIBED_PORTAL = of("PREVIOUSLY_UNSUBSCRIBED_PORTAL")

            @JvmField val QUARANTINED_ADDRESS = of("QUARANTINED_ADDRESS")

            @JvmField val QUEUED = of("QUEUED")

            @JvmField val RECIPIENT_FATIGUE_SUPPRESSED = of("RECIPIENT_FATIGUE_SUPPRESSED")

            @JvmField val SENT = of("SENT")

            @JvmField val TEMPLATE_RENDER_EXCEPTION = of("TEMPLATE_RENDER_EXCEPTION")

            @JvmField val THROTTLED = of("THROTTLED")

            @JvmField val TOO_MANY_RECIPIENTS = of("TOO_MANY_RECIPIENTS")

            @JvmField val UBB_GOVERNANCE_MISSING = of("UBB_GOVERNANCE_MISSING")

            @JvmField val UNCONFIGURED_SENDING_DOMAIN = of("UNCONFIGURED_SENDING_DOMAIN")

            @JvmField val UNDELIVERABLE = of("UNDELIVERABLE")

            @JvmField val VALIDATION_FAILED = of("VALIDATION_FAILED")

            @JvmStatic fun of(value: String) = SendResult(JsonField.of(value))
        }

        /** An enum containing [SendResult]'s known values. */
        enum class Known {
            ADDRESS_LIST_BOMBED,
            ADDRESS_ONLY_ACCEPTED_ON_PROD,
            ADDRESS_OPTED_OUT,
            ATTACHMENT_DOWNLOAD_QUEUE_FULL,
            BLOCKED_ADDRESS,
            BLOCKED_DOMAIN,
            BRAND_RECIPIENT_FATIGUE_SUPPRESSED,
            CAMPAIGN_CANCELLED,
            CANCELLED_ABUSE,
            CORRUPT_INPUT,
            EMAIL_DISABLED,
            EMAIL_UNCONFIRMED,
            GDPR_DOI_ENABLED,
            GRAYMAIL_SUPPRESSED,
            HUBL_LIMIT_EXCEEDED,
            IDEMPOTENT_FAIL,
            IDEMPOTENT_IGNORE,
            INVALID_APP_ID_ATTRIBUTION,
            INVALID_FROM_ADDRESS,
            INVALID_TO_ADDRESS,
            LOW_CONTACT_QUALITY_SCORE,
            MISSING_CONTENT,
            MISSING_REQUIRED_PARAMETER,
            MISSING_TEMPLATE_PROPERTIES,
            MTA_IGNORE,
            NON_MARKETABLE_CONTACT,
            PORTAL_AUTHENTICATION_FAILURE,
            PORTAL_EXPIRED,
            PORTAL_MISSING_MARKETING_SCOPE,
            PORTAL_NOT_AUTHORIZED_FOR_APPLICATION,
            PORTAL_OVER_LIMIT,
            PORTAL_SUSPENDED,
            PREVIOUS_SPAM,
            PREVIOUSLY_BOUNCED,
            PREVIOUSLY_UNSUBSCRIBED_BRAND,
            PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT,
            PREVIOUSLY_UNSUBSCRIBED_MESSAGE,
            PREVIOUSLY_UNSUBSCRIBED_PORTAL,
            QUARANTINED_ADDRESS,
            QUEUED,
            RECIPIENT_FATIGUE_SUPPRESSED,
            SENT,
            TEMPLATE_RENDER_EXCEPTION,
            THROTTLED,
            TOO_MANY_RECIPIENTS,
            UBB_GOVERNANCE_MISSING,
            UNCONFIGURED_SENDING_DOMAIN,
            UNDELIVERABLE,
            VALIDATION_FAILED,
        }

        /**
         * An enum containing [SendResult]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SendResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADDRESS_LIST_BOMBED,
            ADDRESS_ONLY_ACCEPTED_ON_PROD,
            ADDRESS_OPTED_OUT,
            ATTACHMENT_DOWNLOAD_QUEUE_FULL,
            BLOCKED_ADDRESS,
            BLOCKED_DOMAIN,
            BRAND_RECIPIENT_FATIGUE_SUPPRESSED,
            CAMPAIGN_CANCELLED,
            CANCELLED_ABUSE,
            CORRUPT_INPUT,
            EMAIL_DISABLED,
            EMAIL_UNCONFIRMED,
            GDPR_DOI_ENABLED,
            GRAYMAIL_SUPPRESSED,
            HUBL_LIMIT_EXCEEDED,
            IDEMPOTENT_FAIL,
            IDEMPOTENT_IGNORE,
            INVALID_APP_ID_ATTRIBUTION,
            INVALID_FROM_ADDRESS,
            INVALID_TO_ADDRESS,
            LOW_CONTACT_QUALITY_SCORE,
            MISSING_CONTENT,
            MISSING_REQUIRED_PARAMETER,
            MISSING_TEMPLATE_PROPERTIES,
            MTA_IGNORE,
            NON_MARKETABLE_CONTACT,
            PORTAL_AUTHENTICATION_FAILURE,
            PORTAL_EXPIRED,
            PORTAL_MISSING_MARKETING_SCOPE,
            PORTAL_NOT_AUTHORIZED_FOR_APPLICATION,
            PORTAL_OVER_LIMIT,
            PORTAL_SUSPENDED,
            PREVIOUS_SPAM,
            PREVIOUSLY_BOUNCED,
            PREVIOUSLY_UNSUBSCRIBED_BRAND,
            PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT,
            PREVIOUSLY_UNSUBSCRIBED_MESSAGE,
            PREVIOUSLY_UNSUBSCRIBED_PORTAL,
            QUARANTINED_ADDRESS,
            QUEUED,
            RECIPIENT_FATIGUE_SUPPRESSED,
            SENT,
            TEMPLATE_RENDER_EXCEPTION,
            THROTTLED,
            TOO_MANY_RECIPIENTS,
            UBB_GOVERNANCE_MISSING,
            UNCONFIGURED_SENDING_DOMAIN,
            UNDELIVERABLE,
            VALIDATION_FAILED,
            /**
             * An enum member indicating that [SendResult] was instantiated with an unknown value.
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
                ADDRESS_LIST_BOMBED -> Value.ADDRESS_LIST_BOMBED
                ADDRESS_ONLY_ACCEPTED_ON_PROD -> Value.ADDRESS_ONLY_ACCEPTED_ON_PROD
                ADDRESS_OPTED_OUT -> Value.ADDRESS_OPTED_OUT
                ATTACHMENT_DOWNLOAD_QUEUE_FULL -> Value.ATTACHMENT_DOWNLOAD_QUEUE_FULL
                BLOCKED_ADDRESS -> Value.BLOCKED_ADDRESS
                BLOCKED_DOMAIN -> Value.BLOCKED_DOMAIN
                BRAND_RECIPIENT_FATIGUE_SUPPRESSED -> Value.BRAND_RECIPIENT_FATIGUE_SUPPRESSED
                CAMPAIGN_CANCELLED -> Value.CAMPAIGN_CANCELLED
                CANCELLED_ABUSE -> Value.CANCELLED_ABUSE
                CORRUPT_INPUT -> Value.CORRUPT_INPUT
                EMAIL_DISABLED -> Value.EMAIL_DISABLED
                EMAIL_UNCONFIRMED -> Value.EMAIL_UNCONFIRMED
                GDPR_DOI_ENABLED -> Value.GDPR_DOI_ENABLED
                GRAYMAIL_SUPPRESSED -> Value.GRAYMAIL_SUPPRESSED
                HUBL_LIMIT_EXCEEDED -> Value.HUBL_LIMIT_EXCEEDED
                IDEMPOTENT_FAIL -> Value.IDEMPOTENT_FAIL
                IDEMPOTENT_IGNORE -> Value.IDEMPOTENT_IGNORE
                INVALID_APP_ID_ATTRIBUTION -> Value.INVALID_APP_ID_ATTRIBUTION
                INVALID_FROM_ADDRESS -> Value.INVALID_FROM_ADDRESS
                INVALID_TO_ADDRESS -> Value.INVALID_TO_ADDRESS
                LOW_CONTACT_QUALITY_SCORE -> Value.LOW_CONTACT_QUALITY_SCORE
                MISSING_CONTENT -> Value.MISSING_CONTENT
                MISSING_REQUIRED_PARAMETER -> Value.MISSING_REQUIRED_PARAMETER
                MISSING_TEMPLATE_PROPERTIES -> Value.MISSING_TEMPLATE_PROPERTIES
                MTA_IGNORE -> Value.MTA_IGNORE
                NON_MARKETABLE_CONTACT -> Value.NON_MARKETABLE_CONTACT
                PORTAL_AUTHENTICATION_FAILURE -> Value.PORTAL_AUTHENTICATION_FAILURE
                PORTAL_EXPIRED -> Value.PORTAL_EXPIRED
                PORTAL_MISSING_MARKETING_SCOPE -> Value.PORTAL_MISSING_MARKETING_SCOPE
                PORTAL_NOT_AUTHORIZED_FOR_APPLICATION -> Value.PORTAL_NOT_AUTHORIZED_FOR_APPLICATION
                PORTAL_OVER_LIMIT -> Value.PORTAL_OVER_LIMIT
                PORTAL_SUSPENDED -> Value.PORTAL_SUSPENDED
                PREVIOUS_SPAM -> Value.PREVIOUS_SPAM
                PREVIOUSLY_BOUNCED -> Value.PREVIOUSLY_BOUNCED
                PREVIOUSLY_UNSUBSCRIBED_BRAND -> Value.PREVIOUSLY_UNSUBSCRIBED_BRAND
                PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT -> Value.PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT
                PREVIOUSLY_UNSUBSCRIBED_MESSAGE -> Value.PREVIOUSLY_UNSUBSCRIBED_MESSAGE
                PREVIOUSLY_UNSUBSCRIBED_PORTAL -> Value.PREVIOUSLY_UNSUBSCRIBED_PORTAL
                QUARANTINED_ADDRESS -> Value.QUARANTINED_ADDRESS
                QUEUED -> Value.QUEUED
                RECIPIENT_FATIGUE_SUPPRESSED -> Value.RECIPIENT_FATIGUE_SUPPRESSED
                SENT -> Value.SENT
                TEMPLATE_RENDER_EXCEPTION -> Value.TEMPLATE_RENDER_EXCEPTION
                THROTTLED -> Value.THROTTLED
                TOO_MANY_RECIPIENTS -> Value.TOO_MANY_RECIPIENTS
                UBB_GOVERNANCE_MISSING -> Value.UBB_GOVERNANCE_MISSING
                UNCONFIGURED_SENDING_DOMAIN -> Value.UNCONFIGURED_SENDING_DOMAIN
                UNDELIVERABLE -> Value.UNDELIVERABLE
                VALIDATION_FAILED -> Value.VALIDATION_FAILED
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
                ADDRESS_LIST_BOMBED -> Known.ADDRESS_LIST_BOMBED
                ADDRESS_ONLY_ACCEPTED_ON_PROD -> Known.ADDRESS_ONLY_ACCEPTED_ON_PROD
                ADDRESS_OPTED_OUT -> Known.ADDRESS_OPTED_OUT
                ATTACHMENT_DOWNLOAD_QUEUE_FULL -> Known.ATTACHMENT_DOWNLOAD_QUEUE_FULL
                BLOCKED_ADDRESS -> Known.BLOCKED_ADDRESS
                BLOCKED_DOMAIN -> Known.BLOCKED_DOMAIN
                BRAND_RECIPIENT_FATIGUE_SUPPRESSED -> Known.BRAND_RECIPIENT_FATIGUE_SUPPRESSED
                CAMPAIGN_CANCELLED -> Known.CAMPAIGN_CANCELLED
                CANCELLED_ABUSE -> Known.CANCELLED_ABUSE
                CORRUPT_INPUT -> Known.CORRUPT_INPUT
                EMAIL_DISABLED -> Known.EMAIL_DISABLED
                EMAIL_UNCONFIRMED -> Known.EMAIL_UNCONFIRMED
                GDPR_DOI_ENABLED -> Known.GDPR_DOI_ENABLED
                GRAYMAIL_SUPPRESSED -> Known.GRAYMAIL_SUPPRESSED
                HUBL_LIMIT_EXCEEDED -> Known.HUBL_LIMIT_EXCEEDED
                IDEMPOTENT_FAIL -> Known.IDEMPOTENT_FAIL
                IDEMPOTENT_IGNORE -> Known.IDEMPOTENT_IGNORE
                INVALID_APP_ID_ATTRIBUTION -> Known.INVALID_APP_ID_ATTRIBUTION
                INVALID_FROM_ADDRESS -> Known.INVALID_FROM_ADDRESS
                INVALID_TO_ADDRESS -> Known.INVALID_TO_ADDRESS
                LOW_CONTACT_QUALITY_SCORE -> Known.LOW_CONTACT_QUALITY_SCORE
                MISSING_CONTENT -> Known.MISSING_CONTENT
                MISSING_REQUIRED_PARAMETER -> Known.MISSING_REQUIRED_PARAMETER
                MISSING_TEMPLATE_PROPERTIES -> Known.MISSING_TEMPLATE_PROPERTIES
                MTA_IGNORE -> Known.MTA_IGNORE
                NON_MARKETABLE_CONTACT -> Known.NON_MARKETABLE_CONTACT
                PORTAL_AUTHENTICATION_FAILURE -> Known.PORTAL_AUTHENTICATION_FAILURE
                PORTAL_EXPIRED -> Known.PORTAL_EXPIRED
                PORTAL_MISSING_MARKETING_SCOPE -> Known.PORTAL_MISSING_MARKETING_SCOPE
                PORTAL_NOT_AUTHORIZED_FOR_APPLICATION -> Known.PORTAL_NOT_AUTHORIZED_FOR_APPLICATION
                PORTAL_OVER_LIMIT -> Known.PORTAL_OVER_LIMIT
                PORTAL_SUSPENDED -> Known.PORTAL_SUSPENDED
                PREVIOUS_SPAM -> Known.PREVIOUS_SPAM
                PREVIOUSLY_BOUNCED -> Known.PREVIOUSLY_BOUNCED
                PREVIOUSLY_UNSUBSCRIBED_BRAND -> Known.PREVIOUSLY_UNSUBSCRIBED_BRAND
                PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT -> Known.PREVIOUSLY_UNSUBSCRIBED_BUSINESS_UNIT
                PREVIOUSLY_UNSUBSCRIBED_MESSAGE -> Known.PREVIOUSLY_UNSUBSCRIBED_MESSAGE
                PREVIOUSLY_UNSUBSCRIBED_PORTAL -> Known.PREVIOUSLY_UNSUBSCRIBED_PORTAL
                QUARANTINED_ADDRESS -> Known.QUARANTINED_ADDRESS
                QUEUED -> Known.QUEUED
                RECIPIENT_FATIGUE_SUPPRESSED -> Known.RECIPIENT_FATIGUE_SUPPRESSED
                SENT -> Known.SENT
                TEMPLATE_RENDER_EXCEPTION -> Known.TEMPLATE_RENDER_EXCEPTION
                THROTTLED -> Known.THROTTLED
                TOO_MANY_RECIPIENTS -> Known.TOO_MANY_RECIPIENTS
                UBB_GOVERNANCE_MISSING -> Known.UBB_GOVERNANCE_MISSING
                UNCONFIGURED_SENDING_DOMAIN -> Known.UNCONFIGURED_SENDING_DOMAIN
                UNDELIVERABLE -> Known.UNDELIVERABLE
                VALIDATION_FAILED -> Known.VALIDATION_FAILED
                else -> throw HubspotInvalidDataException("Unknown SendResult: $value")
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

        fun validate(): SendResult = apply {
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

            return other is SendResult && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailSendStatusView &&
            status == other.status &&
            statusId == other.statusId &&
            completedAt == other.completedAt &&
            eventId == other.eventId &&
            message == other.message &&
            requestedAt == other.requestedAt &&
            sendResult == other.sendResult &&
            startedAt == other.startedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            status,
            statusId,
            completedAt,
            eventId,
            message,
            requestedAt,
            sendResult,
            startedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailSendStatusView{status=$status, statusId=$statusId, completedAt=$completedAt, eventId=$eventId, message=$message, requestedAt=$requestedAt, sendResult=$sendResult, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
