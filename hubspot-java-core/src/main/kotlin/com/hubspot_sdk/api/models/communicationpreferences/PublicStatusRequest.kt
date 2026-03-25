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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicStatusRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channel: JsonField<Channel>,
    private val statusState: JsonField<StatusState>,
    private val subscriberIdString: JsonField<String>,
    private val subscriptionId: JsonField<Int>,
    private val legalBasis: JsonField<LegalBasis>,
    private val legalBasisExplanation: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
        @JsonProperty("statusState")
        @ExcludeMissing
        statusState: JsonField<StatusState> = JsonMissing.of(),
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionId")
        @ExcludeMissing
        subscriptionId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("legalBasis")
        @ExcludeMissing
        legalBasis: JsonField<LegalBasis> = JsonMissing.of(),
        @JsonProperty("legalBasisExplanation")
        @ExcludeMissing
        legalBasisExplanation: JsonField<String> = JsonMissing.of(),
    ) : this(
        channel,
        statusState,
        subscriberIdString,
        subscriptionId,
        legalBasis,
        legalBasisExplanation,
        mutableMapOf(),
    )

    /**
     * The type of communication channel. Currently, only `EMAIL` is supported.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): Channel = channel.getRequired("channel")

    /**
     * The status of the contact's subscription.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusState(): StatusState = statusState.getRequired("statusState")

    /**
     * The contact's email address.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * The ID of the subscription to update.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): Int = subscriptionId.getRequired("subscriptionId")

    /**
     * The legal basis for communication.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasis(): Optional<LegalBasis> = legalBasis.getOptional("legalBasis")

    /**
     * The explanation for the legal basis.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasisExplanation(): Optional<String> =
        legalBasisExplanation.getOptional("legalBasisExplanation")

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

    /**
     * Returns the raw JSON value of [statusState].
     *
     * Unlike [statusState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusState")
    @ExcludeMissing
    fun _statusState(): JsonField<StatusState> = statusState

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
         * Returns a mutable builder for constructing an instance of [PublicStatusRequest].
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .statusState()
         * .subscriberIdString()
         * .subscriptionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicStatusRequest]. */
    class Builder internal constructor() {

        private var channel: JsonField<Channel>? = null
        private var statusState: JsonField<StatusState>? = null
        private var subscriberIdString: JsonField<String>? = null
        private var subscriptionId: JsonField<Int>? = null
        private var legalBasis: JsonField<LegalBasis> = JsonMissing.of()
        private var legalBasisExplanation: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicStatusRequest: PublicStatusRequest) = apply {
            channel = publicStatusRequest.channel
            statusState = publicStatusRequest.statusState
            subscriberIdString = publicStatusRequest.subscriberIdString
            subscriptionId = publicStatusRequest.subscriptionId
            legalBasis = publicStatusRequest.legalBasis
            legalBasisExplanation = publicStatusRequest.legalBasisExplanation
            additionalProperties = publicStatusRequest.additionalProperties.toMutableMap()
        }

        /** The type of communication channel. Currently, only `EMAIL` is supported. */
        fun channel(channel: Channel) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [Channel] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

        /** The status of the contact's subscription. */
        fun statusState(statusState: StatusState) = statusState(JsonField.of(statusState))

        /**
         * Sets [Builder.statusState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusState] with a well-typed [StatusState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusState(statusState: JsonField<StatusState>) = apply {
            this.statusState = statusState
        }

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

        /** The ID of the subscription to update. */
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

        /** The legal basis for communication. */
        fun legalBasis(legalBasis: LegalBasis) = legalBasis(JsonField.of(legalBasis))

        /**
         * Sets [Builder.legalBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBasis] with a well-typed [LegalBasis] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBasis(legalBasis: JsonField<LegalBasis>) = apply { this.legalBasis = legalBasis }

        /** The explanation for the legal basis. */
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
         * Returns an immutable instance of [PublicStatusRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .statusState()
         * .subscriberIdString()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicStatusRequest =
            PublicStatusRequest(
                checkRequired("channel", channel),
                checkRequired("statusState", statusState),
                checkRequired("subscriberIdString", subscriberIdString),
                checkRequired("subscriptionId", subscriptionId),
                legalBasis,
                legalBasisExplanation,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicStatusRequest = apply {
        if (validated) {
            return@apply
        }

        channel().validate()
        statusState().validate()
        subscriberIdString()
        subscriptionId()
        legalBasis().ifPresent { it.validate() }
        legalBasisExplanation()
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
            (statusState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriberIdString.asKnown().isPresent) 1 else 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0) +
            (legalBasis.asKnown().getOrNull()?.validity() ?: 0) +
            (if (legalBasisExplanation.asKnown().isPresent) 1 else 0)

    /** The type of communication channel. Currently, only `EMAIL` is supported. */
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

    /** The status of the contact's subscription. */
    class StatusState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NOT_SPECIFIED = of("NOT_SPECIFIED")

            @JvmField val SUBSCRIBED = of("SUBSCRIBED")

            @JvmField val UNSUBSCRIBED = of("UNSUBSCRIBED")

            @JvmStatic fun of(value: String) = StatusState(JsonField.of(value))
        }

        /** An enum containing [StatusState]'s known values. */
        enum class Known {
            NOT_SPECIFIED,
            SUBSCRIBED,
            UNSUBSCRIBED,
        }

        /**
         * An enum containing [StatusState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatusState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_SPECIFIED,
            SUBSCRIBED,
            UNSUBSCRIBED,
            /**
             * An enum member indicating that [StatusState] was instantiated with an unknown value.
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
                else -> throw HubspotInvalidDataException("Unknown StatusState: $value")
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

        fun validate(): StatusState = apply {
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

            return other is StatusState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The legal basis for communication. */
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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
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
                else -> throw HubspotInvalidDataException("Unknown LegalBasis: $value")
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

            return other is LegalBasis && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicStatusRequest &&
            channel == other.channel &&
            statusState == other.statusState &&
            subscriberIdString == other.subscriberIdString &&
            subscriptionId == other.subscriptionId &&
            legalBasis == other.legalBasis &&
            legalBasisExplanation == other.legalBasisExplanation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channel,
            statusState,
            subscriberIdString,
            subscriptionId,
            legalBasis,
            legalBasisExplanation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicStatusRequest{channel=$channel, statusState=$statusState, subscriberIdString=$subscriberIdString, subscriptionId=$subscriptionId, legalBasis=$legalBasis, legalBasisExplanation=$legalBasisExplanation, additionalProperties=$additionalProperties}"
}
