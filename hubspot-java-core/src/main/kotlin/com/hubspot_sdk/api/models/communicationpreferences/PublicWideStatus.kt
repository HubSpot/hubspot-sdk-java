// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

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

class PublicWideStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channel: JsonField<Channel>,
    private val status: JsonField<Status>,
    private val subscriberIdString: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val wideStatusType: JsonField<WideStatusType>,
    private val businessUnitId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("wideStatusType")
        @ExcludeMissing
        wideStatusType: JsonField<WideStatusType> = JsonMissing.of(),
        @JsonProperty("businessUnitId")
        @ExcludeMissing
        businessUnitId: JsonField<Long> = JsonMissing.of(),
    ) : this(
        channel,
        status,
        subscriberIdString,
        timestamp,
        wideStatusType,
        businessUnitId,
        mutableMapOf(),
    )

    /**
     * The type of communication channel, with 'EMAIL' as the only supported option.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): Channel = channel.getRequired("channel")

    /**
     * The subscription status of the contact, which can be 'SUBSCRIBED', 'UNSUBSCRIBED', or
     * 'NOT_SPECIFIED'.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The email address of the contact.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * The date and time when the status was recorded.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The type of wide status, which can be 'PORTAL_WIDE' or 'BUSINESS_UNIT_WIDE'.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun wideStatusType(): WideStatusType = wideStatusType.getRequired("wideStatusType")

    /**
     * The ID of the business unit associated with the status.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessUnitId(): Optional<Long> = businessUnitId.getOptional("businessUnitId")

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

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
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [wideStatusType].
     *
     * Unlike [wideStatusType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wideStatusType")
    @ExcludeMissing
    fun _wideStatusType(): JsonField<WideStatusType> = wideStatusType

    /**
     * Returns the raw JSON value of [businessUnitId].
     *
     * Unlike [businessUnitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessUnitId")
    @ExcludeMissing
    fun _businessUnitId(): JsonField<Long> = businessUnitId

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
         * Returns a mutable builder for constructing an instance of [PublicWideStatus].
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .status()
         * .subscriberIdString()
         * .timestamp()
         * .wideStatusType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicWideStatus]. */
    class Builder internal constructor() {

        private var channel: JsonField<Channel>? = null
        private var status: JsonField<Status>? = null
        private var subscriberIdString: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var wideStatusType: JsonField<WideStatusType>? = null
        private var businessUnitId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicWideStatus: PublicWideStatus) = apply {
            channel = publicWideStatus.channel
            status = publicWideStatus.status
            subscriberIdString = publicWideStatus.subscriberIdString
            timestamp = publicWideStatus.timestamp
            wideStatusType = publicWideStatus.wideStatusType
            businessUnitId = publicWideStatus.businessUnitId
            additionalProperties = publicWideStatus.additionalProperties.toMutableMap()
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

        /**
         * The subscription status of the contact, which can be 'SUBSCRIBED', 'UNSUBSCRIBED', or
         * 'NOT_SPECIFIED'.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The email address of the contact. */
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

        /** The date and time when the status was recorded. */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** The type of wide status, which can be 'PORTAL_WIDE' or 'BUSINESS_UNIT_WIDE'. */
        fun wideStatusType(wideStatusType: WideStatusType) =
            wideStatusType(JsonField.of(wideStatusType))

        /**
         * Sets [Builder.wideStatusType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wideStatusType] with a well-typed [WideStatusType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wideStatusType(wideStatusType: JsonField<WideStatusType>) = apply {
            this.wideStatusType = wideStatusType
        }

        /** The ID of the business unit associated with the status. */
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
         * Returns an immutable instance of [PublicWideStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .status()
         * .subscriberIdString()
         * .timestamp()
         * .wideStatusType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicWideStatus =
            PublicWideStatus(
                checkRequired("channel", channel),
                checkRequired("status", status),
                checkRequired("subscriberIdString", subscriberIdString),
                checkRequired("timestamp", timestamp),
                checkRequired("wideStatusType", wideStatusType),
                businessUnitId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicWideStatus = apply {
        if (validated) {
            return@apply
        }

        channel().validate()
        status().validate()
        subscriberIdString()
        timestamp()
        wideStatusType().validate()
        businessUnitId()
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
        (channel.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriberIdString.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (wideStatusType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (businessUnitId.asKnown().isPresent) 1 else 0)

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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                EMAIL -> Known.EMAIL
                else -> throw HubspotInvalidDataException("Unknown Channel: $value")
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

            return other is Channel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The subscription status of the contact, which can be 'SUBSCRIBED', 'UNSUBSCRIBED', or
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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NOT_SPECIFIED -> Known.NOT_SPECIFIED
                SUBSCRIBED -> Known.SUBSCRIBED
                UNSUBSCRIBED -> Known.UNSUBSCRIBED
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

    /** The type of wide status, which can be 'PORTAL_WIDE' or 'BUSINESS_UNIT_WIDE'. */
    class WideStatusType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BUSINESS_UNIT_WIDE = of("BUSINESS_UNIT_WIDE")

            @JvmField val PORTAL_WIDE = of("PORTAL_WIDE")

            @JvmStatic fun of(value: String) = WideStatusType(JsonField.of(value))
        }

        /** An enum containing [WideStatusType]'s known values. */
        enum class Known {
            BUSINESS_UNIT_WIDE,
            PORTAL_WIDE,
        }

        /**
         * An enum containing [WideStatusType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WideStatusType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS_UNIT_WIDE,
            PORTAL_WIDE,
            /**
             * An enum member indicating that [WideStatusType] was instantiated with an unknown
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
                BUSINESS_UNIT_WIDE -> Value.BUSINESS_UNIT_WIDE
                PORTAL_WIDE -> Value.PORTAL_WIDE
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
                BUSINESS_UNIT_WIDE -> Known.BUSINESS_UNIT_WIDE
                PORTAL_WIDE -> Known.PORTAL_WIDE
                else -> throw HubspotInvalidDataException("Unknown WideStatusType: $value")
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

        fun validate(): WideStatusType = apply {
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

            return other is WideStatusType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicWideStatus &&
            channel == other.channel &&
            status == other.status &&
            subscriberIdString == other.subscriberIdString &&
            timestamp == other.timestamp &&
            wideStatusType == other.wideStatusType &&
            businessUnitId == other.businessUnitId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channel,
            status,
            subscriberIdString,
            timestamp,
            wideStatusType,
            businessUnitId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicWideStatus{channel=$channel, status=$status, subscriberIdString=$subscriberIdString, timestamp=$timestamp, wideStatusType=$wideStatusType, businessUnitId=$businessUnitId, additionalProperties=$additionalProperties}"
}
