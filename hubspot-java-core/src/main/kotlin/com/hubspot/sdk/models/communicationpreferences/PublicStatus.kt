// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channel: JsonField<Channel>,
    private val source: JsonField<String>,
    private val status: JsonField<Status>,
    private val subscriberIdString: JsonField<String>,
    private val subscriptionId: JsonField<Int>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val businessUnitId: JsonField<Long>,
    private val legalBasis: JsonField<LegalBasis>,
    private val legalBasisExplanation: JsonField<String>,
    private val setStatusSuccessReason: JsonField<SetStatusSuccessReason>,
    private val subscriptionName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        subscriptionId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("businessUnitId")
        @ExcludeMissing
        businessUnitId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("legalBasis")
        @ExcludeMissing
        legalBasis: JsonField<LegalBasis> = JsonMissing.of(),
        @JsonProperty("legalBasisExplanation")
        @ExcludeMissing
        legalBasisExplanation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("setStatusSuccessReason")
        @ExcludeMissing
        setStatusSuccessReason: JsonField<SetStatusSuccessReason> = JsonMissing.of(),
        @JsonProperty("subscriptionName")
        @ExcludeMissing
        subscriptionName: JsonField<String> = JsonMissing.of(),
    ) : this(
        channel,
        source,
        status,
        subscriberIdString,
        subscriptionId,
        timestamp,
        businessUnitId,
        legalBasis,
        legalBasisExplanation,
        setStatusSuccessReason,
        subscriptionName,
        mutableMapOf(),
    )

    /**
     * The type of communication channel, with 'EMAIL' as the only supported option.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): Channel = channel.getRequired("channel")

    /**
     * The origin or method through which the subscription status was set.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The current subscription status of the contact, which can be 'SUBSCRIBED', 'UNSUBSCRIBED', or
     * 'NOT_SPECIFIED'.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The contact's email address.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * The unique identifier of the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): Int = subscriptionId.getRequired("subscriptionId")

    /**
     * The date and time when the subscription status was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The ID of the business unit associated with the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessUnitId(): Optional<Long> = businessUnitId.getOptional("businessUnitId")

    /**
     * The legal basis for communication, with options including 'LEGITIMATE_INTEREST_PQL',
     * 'LEGITIMATE_INTEREST_CLIENT', 'PERFORMANCE_OF_CONTRACT', 'CONSENT_WITH_NOTICE', 'NON_GDPR',
     * 'PROCESS_AND_STORE', and 'LEGITIMATE_INTEREST_OTHER'.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasis(): Optional<LegalBasis> = legalBasis.getOptional("legalBasis")

    /**
     * An explanation for the legal basis used for communication.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasisExplanation(): Optional<String> =
        legalBasisExplanation.getOptional("legalBasisExplanation")

    /**
     * The reason for the successful change in subscription status, such as 'RESUBSCRIBE_OCCURRED'
     * or 'NO_STATUS_CHANGE'.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun setStatusSuccessReason(): Optional<SetStatusSuccessReason> =
        setStatusSuccessReason.getOptional("setStatusSuccessReason")

    /**
     * The name of the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionName(): Optional<String> = subscriptionName.getOptional("subscriptionName")

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subscriberIdString].
     *
     * Unlike [subscriberIdString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriberIdString")
    @ExcludeMissing
    fun _subscriberIdString(): JsonField<String> = subscriberIdString

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriptionId")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<Int> = subscriptionId

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [businessUnitId].
     *
     * Unlike [businessUnitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessUnitId")
    @ExcludeMissing
    fun _businessUnitId(): JsonField<Long> = businessUnitId

    /**
     * Returns the raw JSON value of [legalBasis].
     *
     * Unlike [legalBasis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legalBasis")
    @ExcludeMissing
    fun _legalBasis(): JsonField<LegalBasis> = legalBasis

    /**
     * Returns the raw JSON value of [legalBasisExplanation].
     *
     * Unlike [legalBasisExplanation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalBasisExplanation")
    @ExcludeMissing
    fun _legalBasisExplanation(): JsonField<String> = legalBasisExplanation

    /**
     * Returns the raw JSON value of [setStatusSuccessReason].
     *
     * Unlike [setStatusSuccessReason], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("setStatusSuccessReason")
    @ExcludeMissing
    fun _setStatusSuccessReason(): JsonField<SetStatusSuccessReason> = setStatusSuccessReason

    /**
     * Returns the raw JSON value of [subscriptionName].
     *
     * Unlike [subscriptionName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptionName")
    @ExcludeMissing
    fun _subscriptionName(): JsonField<String> = subscriptionName

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
         * Returns a mutable builder for constructing an instance of [PublicStatus].
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .source()
         * .status()
         * .subscriberIdString()
         * .subscriptionId()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicStatus]. */
    class Builder internal constructor() {

        private var channel: JsonField<Channel>? = null
        private var source: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var subscriberIdString: JsonField<String>? = null
        private var subscriptionId: JsonField<Int>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var businessUnitId: JsonField<Long> = JsonMissing.of()
        private var legalBasis: JsonField<LegalBasis> = JsonMissing.of()
        private var legalBasisExplanation: JsonField<String> = JsonMissing.of()
        private var setStatusSuccessReason: JsonField<SetStatusSuccessReason> = JsonMissing.of()
        private var subscriptionName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicStatus: PublicStatus) = apply {
            channel = publicStatus.channel
            source = publicStatus.source
            status = publicStatus.status
            subscriberIdString = publicStatus.subscriberIdString
            subscriptionId = publicStatus.subscriptionId
            timestamp = publicStatus.timestamp
            businessUnitId = publicStatus.businessUnitId
            legalBasis = publicStatus.legalBasis
            legalBasisExplanation = publicStatus.legalBasisExplanation
            setStatusSuccessReason = publicStatus.setStatusSuccessReason
            subscriptionName = publicStatus.subscriptionName
            additionalProperties = publicStatus.additionalProperties.toMutableMap()
        }

        /** The type of communication channel, with 'EMAIL' as the only supported option. */
        fun channel(channel: Channel) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [Channel] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

        /** The origin or method through which the subscription status was set. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /**
         * The current subscription status of the contact, which can be 'SUBSCRIBED',
         * 'UNSUBSCRIBED', or 'NOT_SPECIFIED'.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The contact's email address. */
        fun subscriberIdString(subscriberIdString: String) =
            subscriberIdString(JsonField.of(subscriberIdString))

        /**
         * Sets [Builder.subscriberIdString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberIdString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberIdString(subscriberIdString: JsonField<String>) = apply {
            this.subscriberIdString = subscriberIdString
        }

        /** The unique identifier of the subscription. */
        fun subscriptionId(subscriptionId: Int) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subscriptionId(subscriptionId: JsonField<Int>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** The date and time when the subscription status was last updated. */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** The ID of the business unit associated with the subscription. */
        fun businessUnitId(businessUnitId: Long) = businessUnitId(JsonField.of(businessUnitId))

        /**
         * Sets [Builder.businessUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessUnitId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessUnitId(businessUnitId: JsonField<Long>) = apply {
            this.businessUnitId = businessUnitId
        }

        /**
         * The legal basis for communication, with options including 'LEGITIMATE_INTEREST_PQL',
         * 'LEGITIMATE_INTEREST_CLIENT', 'PERFORMANCE_OF_CONTRACT', 'CONSENT_WITH_NOTICE',
         * 'NON_GDPR', 'PROCESS_AND_STORE', and 'LEGITIMATE_INTEREST_OTHER'.
         */
        fun legalBasis(legalBasis: LegalBasis) = legalBasis(JsonField.of(legalBasis))

        /**
         * Sets [Builder.legalBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBasis] with a well-typed [LegalBasis] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBasis(legalBasis: JsonField<LegalBasis>) = apply { this.legalBasis = legalBasis }

        /** An explanation for the legal basis used for communication. */
        fun legalBasisExplanation(legalBasisExplanation: String) =
            legalBasisExplanation(JsonField.of(legalBasisExplanation))

        /**
         * Sets [Builder.legalBasisExplanation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBasisExplanation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBasisExplanation(legalBasisExplanation: JsonField<String>) = apply {
            this.legalBasisExplanation = legalBasisExplanation
        }

        /**
         * The reason for the successful change in subscription status, such as
         * 'RESUBSCRIBE_OCCURRED' or 'NO_STATUS_CHANGE'.
         */
        fun setStatusSuccessReason(setStatusSuccessReason: SetStatusSuccessReason) =
            setStatusSuccessReason(JsonField.of(setStatusSuccessReason))

        /**
         * Sets [Builder.setStatusSuccessReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setStatusSuccessReason] with a well-typed
         * [SetStatusSuccessReason] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun setStatusSuccessReason(setStatusSuccessReason: JsonField<SetStatusSuccessReason>) =
            apply {
                this.setStatusSuccessReason = setStatusSuccessReason
            }

        /** The name of the subscription. */
        fun subscriptionName(subscriptionName: String) =
            subscriptionName(JsonField.of(subscriptionName))

        /**
         * Sets [Builder.subscriptionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionName(subscriptionName: JsonField<String>) = apply {
            this.subscriptionName = subscriptionName
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
         * Returns an immutable instance of [PublicStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .source()
         * .status()
         * .subscriberIdString()
         * .subscriptionId()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicStatus =
            PublicStatus(
                checkRequired("channel", channel),
                checkRequired("source", source),
                checkRequired("status", status),
                checkRequired("subscriberIdString", subscriberIdString),
                checkRequired("subscriptionId", subscriptionId),
                checkRequired("timestamp", timestamp),
                businessUnitId,
                legalBasis,
                legalBasisExplanation,
                setStatusSuccessReason,
                subscriptionName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicStatus = apply {
        if (validated) {
            return@apply
        }

        channel().validate()
        source()
        status().validate()
        subscriberIdString()
        subscriptionId()
        timestamp()
        businessUnitId()
        legalBasis().ifPresent { it.validate() }
        legalBasisExplanation()
        setStatusSuccessReason().ifPresent { it.validate() }
        subscriptionName()
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
        (channel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriberIdString.asKnown().isPresent) 1 else 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (businessUnitId.asKnown().isPresent) 1 else 0) +
            (legalBasis.asKnown().getOrNull()?.validity() ?: 0) +
            (if (legalBasisExplanation.asKnown().isPresent) 1 else 0) +
            (setStatusSuccessReason.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriptionName.asKnown().isPresent) 1 else 0)

    /** The type of communication channel, with 'EMAIL' as the only supported option. */
    class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EMAIL = of("EMAIL")

            @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
        }

        /** An enum containing [Channel]'s known values. */
        enum class Known {
            EMAIL
        }

        /**
         * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL,
            /** An enum member indicating that [Channel] was instantiated with an unknown value. */
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
                EMAIL -> Value.EMAIL
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
                EMAIL -> Known.EMAIL
                else -> throw HubSpotInvalidDataException("Unknown Channel: $value")
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

        fun validate(): Channel = apply {
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

            return other is Channel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The current subscription status of the contact, which can be 'SUBSCRIBED', 'UNSUBSCRIBED', or
     * 'NOT_SPECIFIED'.
     */
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

            @JvmField val NOT_SPECIFIED = of("NOT_SPECIFIED")

            @JvmField val SUBSCRIBED = of("SUBSCRIBED")

            @JvmField val UNSUBSCRIBED = of("UNSUBSCRIBED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            NOT_SPECIFIED,
            SUBSCRIBED,
            UNSUBSCRIBED,
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
            NOT_SPECIFIED,
            SUBSCRIBED,
            UNSUBSCRIBED,
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
                NOT_SPECIFIED -> Value.NOT_SPECIFIED
                SUBSCRIBED -> Value.SUBSCRIBED
                UNSUBSCRIBED -> Value.UNSUBSCRIBED
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
                NOT_SPECIFIED -> Known.NOT_SPECIFIED
                SUBSCRIBED -> Known.SUBSCRIBED
                UNSUBSCRIBED -> Known.UNSUBSCRIBED
                else -> throw HubSpotInvalidDataException("Unknown Status: $value")
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The legal basis for communication, with options including 'LEGITIMATE_INTEREST_PQL',
     * 'LEGITIMATE_INTEREST_CLIENT', 'PERFORMANCE_OF_CONTRACT', 'CONSENT_WITH_NOTICE', 'NON_GDPR',
     * 'PROCESS_AND_STORE', and 'LEGITIMATE_INTEREST_OTHER'.
     */
    class LegalBasis @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CONSENT_WITH_NOTICE = of("CONSENT_WITH_NOTICE")

            @JvmField val LEGITIMATE_INTEREST_CLIENT = of("LEGITIMATE_INTEREST_CLIENT")

            @JvmField val LEGITIMATE_INTEREST_OTHER = of("LEGITIMATE_INTEREST_OTHER")

            @JvmField val LEGITIMATE_INTEREST_PQL = of("LEGITIMATE_INTEREST_PQL")

            @JvmField val NON_GDPR = of("NON_GDPR")

            @JvmField val PERFORMANCE_OF_CONTRACT = of("PERFORMANCE_OF_CONTRACT")

            @JvmField val PROCESS_AND_STORE = of("PROCESS_AND_STORE")

            @JvmStatic fun of(value: String) = LegalBasis(JsonField.of(value))
        }

        /** An enum containing [LegalBasis]'s known values. */
        enum class Known {
            CONSENT_WITH_NOTICE,
            LEGITIMATE_INTEREST_CLIENT,
            LEGITIMATE_INTEREST_OTHER,
            LEGITIMATE_INTEREST_PQL,
            NON_GDPR,
            PERFORMANCE_OF_CONTRACT,
            PROCESS_AND_STORE,
        }

        /**
         * An enum containing [LegalBasis]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LegalBasis] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONSENT_WITH_NOTICE,
            LEGITIMATE_INTEREST_CLIENT,
            LEGITIMATE_INTEREST_OTHER,
            LEGITIMATE_INTEREST_PQL,
            NON_GDPR,
            PERFORMANCE_OF_CONTRACT,
            PROCESS_AND_STORE,
            /**
             * An enum member indicating that [LegalBasis] was instantiated with an unknown value.
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
                CONSENT_WITH_NOTICE -> Value.CONSENT_WITH_NOTICE
                LEGITIMATE_INTEREST_CLIENT -> Value.LEGITIMATE_INTEREST_CLIENT
                LEGITIMATE_INTEREST_OTHER -> Value.LEGITIMATE_INTEREST_OTHER
                LEGITIMATE_INTEREST_PQL -> Value.LEGITIMATE_INTEREST_PQL
                NON_GDPR -> Value.NON_GDPR
                PERFORMANCE_OF_CONTRACT -> Value.PERFORMANCE_OF_CONTRACT
                PROCESS_AND_STORE -> Value.PROCESS_AND_STORE
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
                CONSENT_WITH_NOTICE -> Known.CONSENT_WITH_NOTICE
                LEGITIMATE_INTEREST_CLIENT -> Known.LEGITIMATE_INTEREST_CLIENT
                LEGITIMATE_INTEREST_OTHER -> Known.LEGITIMATE_INTEREST_OTHER
                LEGITIMATE_INTEREST_PQL -> Known.LEGITIMATE_INTEREST_PQL
                NON_GDPR -> Known.NON_GDPR
                PERFORMANCE_OF_CONTRACT -> Known.PERFORMANCE_OF_CONTRACT
                PROCESS_AND_STORE -> Known.PROCESS_AND_STORE
                else -> throw HubSpotInvalidDataException("Unknown LegalBasis: $value")
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

        fun validate(): LegalBasis = apply {
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

            return other is LegalBasis && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The reason for the successful change in subscription status, such as 'RESUBSCRIBE_OCCURRED'
     * or 'NO_STATUS_CHANGE'.
     */
    class SetStatusSuccessReason
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

            @JvmField val NO_STATUS_CHANGE = of("NO_STATUS_CHANGE")

            @JvmField val REQUESTED_CHANGE_OCCURRED = of("REQUESTED_CHANGE_OCCURRED")

            @JvmField val RESUBSCRIBE_OCCURRED = of("RESUBSCRIBE_OCCURRED")

            @JvmField val UNSUBSCRIBE_FROM_ALL_OCCURRED = of("UNSUBSCRIBE_FROM_ALL_OCCURRED")

            @JvmStatic fun of(value: String) = SetStatusSuccessReason(JsonField.of(value))
        }

        /** An enum containing [SetStatusSuccessReason]'s known values. */
        enum class Known {
            NO_STATUS_CHANGE,
            REQUESTED_CHANGE_OCCURRED,
            RESUBSCRIBE_OCCURRED,
            UNSUBSCRIBE_FROM_ALL_OCCURRED,
        }

        /**
         * An enum containing [SetStatusSuccessReason]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SetStatusSuccessReason] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NO_STATUS_CHANGE,
            REQUESTED_CHANGE_OCCURRED,
            RESUBSCRIBE_OCCURRED,
            UNSUBSCRIBE_FROM_ALL_OCCURRED,
            /**
             * An enum member indicating that [SetStatusSuccessReason] was instantiated with an
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
                NO_STATUS_CHANGE -> Value.NO_STATUS_CHANGE
                REQUESTED_CHANGE_OCCURRED -> Value.REQUESTED_CHANGE_OCCURRED
                RESUBSCRIBE_OCCURRED -> Value.RESUBSCRIBE_OCCURRED
                UNSUBSCRIBE_FROM_ALL_OCCURRED -> Value.UNSUBSCRIBE_FROM_ALL_OCCURRED
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
                NO_STATUS_CHANGE -> Known.NO_STATUS_CHANGE
                REQUESTED_CHANGE_OCCURRED -> Known.REQUESTED_CHANGE_OCCURRED
                RESUBSCRIBE_OCCURRED -> Known.RESUBSCRIBE_OCCURRED
                UNSUBSCRIBE_FROM_ALL_OCCURRED -> Known.UNSUBSCRIBE_FROM_ALL_OCCURRED
                else -> throw HubSpotInvalidDataException("Unknown SetStatusSuccessReason: $value")
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

        fun validate(): SetStatusSuccessReason = apply {
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

            return other is SetStatusSuccessReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicStatus &&
            channel == other.channel &&
            source == other.source &&
            status == other.status &&
            subscriberIdString == other.subscriberIdString &&
            subscriptionId == other.subscriptionId &&
            timestamp == other.timestamp &&
            businessUnitId == other.businessUnitId &&
            legalBasis == other.legalBasis &&
            legalBasisExplanation == other.legalBasisExplanation &&
            setStatusSuccessReason == other.setStatusSuccessReason &&
            subscriptionName == other.subscriptionName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channel,
            source,
            status,
            subscriberIdString,
            subscriptionId,
            timestamp,
            businessUnitId,
            legalBasis,
            legalBasisExplanation,
            setStatusSuccessReason,
            subscriptionName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicStatus{channel=$channel, source=$source, status=$status, subscriberIdString=$subscriberIdString, subscriptionId=$subscriptionId, timestamp=$timestamp, businessUnitId=$businessUnitId, legalBasis=$legalBasis, legalBasisExplanation=$legalBasisExplanation, setStatusSuccessReason=$setStatusSuccessReason, subscriptionName=$subscriptionName, additionalProperties=$additionalProperties}"
}
