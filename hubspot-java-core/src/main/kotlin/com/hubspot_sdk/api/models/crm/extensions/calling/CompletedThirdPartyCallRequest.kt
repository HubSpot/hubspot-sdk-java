// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

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

class CompletedThirdPartyCallRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createEngagement: JsonField<Boolean>,
    private val engagementProperties: JsonField<EngagementProperties>,
    private val externalCallId: JsonField<String>,
    private val finalCallStatus: JsonField<FinalCallStatus>,
    private val fromNumber: JsonField<FormattedPhoneNumber>,
    private val potentialRecipientUserIds: JsonField<List<Int>>,
    private val toNumber: JsonField<FormattedPhoneNumber>,
    private val callStartedTimestamp: JsonField<OffsetDateTime>,
    private val durationSeconds: JsonField<Int>,
    private val userId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createEngagement")
        @ExcludeMissing
        createEngagement: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("engagementProperties")
        @ExcludeMissing
        engagementProperties: JsonField<EngagementProperties> = JsonMissing.of(),
        @JsonProperty("externalCallId")
        @ExcludeMissing
        externalCallId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("finalCallStatus")
        @ExcludeMissing
        finalCallStatus: JsonField<FinalCallStatus> = JsonMissing.of(),
        @JsonProperty("fromNumber")
        @ExcludeMissing
        fromNumber: JsonField<FormattedPhoneNumber> = JsonMissing.of(),
        @JsonProperty("potentialRecipientUserIds")
        @ExcludeMissing
        potentialRecipientUserIds: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("toNumber")
        @ExcludeMissing
        toNumber: JsonField<FormattedPhoneNumber> = JsonMissing.of(),
        @JsonProperty("callStartedTimestamp")
        @ExcludeMissing
        callStartedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("durationSeconds")
        @ExcludeMissing
        durationSeconds: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        createEngagement,
        engagementProperties,
        externalCallId,
        finalCallStatus,
        fromNumber,
        potentialRecipientUserIds,
        toNumber,
        callStartedTimestamp,
        durationSeconds,
        userId,
        mutableMapOf(),
    )

    /**
     * Indicates whether an engagement should be created for the call.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createEngagement(): Boolean = createEngagement.getRequired("createEngagement")

    /**
     * Contains additional properties related to the engagement.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun engagementProperties(): EngagementProperties =
        engagementProperties.getRequired("engagementProperties")

    /**
     * The unique identifier for the call from an external system.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalCallId(): String = externalCallId.getRequired("externalCallId")

    /**
     * The final status of the call, with accepted values including: BUSY, CALLING_CRM_USER,
     * CANCELED, COMPLETED, CONNECTING, FAILED, HOLD, IN_PROGRESS, MISSED, NO_ANSWER, QUEUED,
     * RINGING, UNKNOWN.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun finalCallStatus(): FinalCallStatus = finalCallStatus.getRequired("finalCallStatus")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromNumber(): FormattedPhoneNumber = fromNumber.getRequired("fromNumber")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun potentialRecipientUserIds(): List<Int> =
        potentialRecipientUserIds.getRequired("potentialRecipientUserIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toNumber(): FormattedPhoneNumber = toNumber.getRequired("toNumber")

    /**
     * The timestamp indicating when the call started, formatted as a date-time string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callStartedTimestamp(): Optional<OffsetDateTime> =
        callStartedTimestamp.getOptional("callStartedTimestamp")

    /**
     * The duration of the call in seconds.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationSeconds(): Optional<Int> = durationSeconds.getOptional("durationSeconds")

    /**
     * The ID of the user associated with the call.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<Int> = userId.getOptional("userId")

    /**
     * Returns the raw JSON value of [createEngagement].
     *
     * Unlike [createEngagement], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("createEngagement")
    @ExcludeMissing
    fun _createEngagement(): JsonField<Boolean> = createEngagement

    /**
     * Returns the raw JSON value of [engagementProperties].
     *
     * Unlike [engagementProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("engagementProperties")
    @ExcludeMissing
    fun _engagementProperties(): JsonField<EngagementProperties> = engagementProperties

    /**
     * Returns the raw JSON value of [externalCallId].
     *
     * Unlike [externalCallId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalCallId")
    @ExcludeMissing
    fun _externalCallId(): JsonField<String> = externalCallId

    /**
     * Returns the raw JSON value of [finalCallStatus].
     *
     * Unlike [finalCallStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finalCallStatus")
    @ExcludeMissing
    fun _finalCallStatus(): JsonField<FinalCallStatus> = finalCallStatus

    /**
     * Returns the raw JSON value of [fromNumber].
     *
     * Unlike [fromNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fromNumber")
    @ExcludeMissing
    fun _fromNumber(): JsonField<FormattedPhoneNumber> = fromNumber

    /**
     * Returns the raw JSON value of [potentialRecipientUserIds].
     *
     * Unlike [potentialRecipientUserIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("potentialRecipientUserIds")
    @ExcludeMissing
    fun _potentialRecipientUserIds(): JsonField<List<Int>> = potentialRecipientUserIds

    /**
     * Returns the raw JSON value of [toNumber].
     *
     * Unlike [toNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toNumber")
    @ExcludeMissing
    fun _toNumber(): JsonField<FormattedPhoneNumber> = toNumber

    /**
     * Returns the raw JSON value of [callStartedTimestamp].
     *
     * Unlike [callStartedTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("callStartedTimestamp")
    @ExcludeMissing
    fun _callStartedTimestamp(): JsonField<OffsetDateTime> = callStartedTimestamp

    /**
     * Returns the raw JSON value of [durationSeconds].
     *
     * Unlike [durationSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("durationSeconds")
    @ExcludeMissing
    fun _durationSeconds(): JsonField<Int> = durationSeconds

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<Int> = userId

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
         * [CompletedThirdPartyCallRequest].
         *
         * The following fields are required:
         * ```java
         * .createEngagement()
         * .engagementProperties()
         * .externalCallId()
         * .finalCallStatus()
         * .fromNumber()
         * .potentialRecipientUserIds()
         * .toNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompletedThirdPartyCallRequest]. */
    class Builder internal constructor() {

        private var createEngagement: JsonField<Boolean>? = null
        private var engagementProperties: JsonField<EngagementProperties>? = null
        private var externalCallId: JsonField<String>? = null
        private var finalCallStatus: JsonField<FinalCallStatus>? = null
        private var fromNumber: JsonField<FormattedPhoneNumber>? = null
        private var potentialRecipientUserIds: JsonField<MutableList<Int>>? = null
        private var toNumber: JsonField<FormattedPhoneNumber>? = null
        private var callStartedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var durationSeconds: JsonField<Int> = JsonMissing.of()
        private var userId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(completedThirdPartyCallRequest: CompletedThirdPartyCallRequest) = apply {
            createEngagement = completedThirdPartyCallRequest.createEngagement
            engagementProperties = completedThirdPartyCallRequest.engagementProperties
            externalCallId = completedThirdPartyCallRequest.externalCallId
            finalCallStatus = completedThirdPartyCallRequest.finalCallStatus
            fromNumber = completedThirdPartyCallRequest.fromNumber
            potentialRecipientUserIds =
                completedThirdPartyCallRequest.potentialRecipientUserIds.map { it.toMutableList() }
            toNumber = completedThirdPartyCallRequest.toNumber
            callStartedTimestamp = completedThirdPartyCallRequest.callStartedTimestamp
            durationSeconds = completedThirdPartyCallRequest.durationSeconds
            userId = completedThirdPartyCallRequest.userId
            additionalProperties =
                completedThirdPartyCallRequest.additionalProperties.toMutableMap()
        }

        /** Indicates whether an engagement should be created for the call. */
        fun createEngagement(createEngagement: Boolean) =
            createEngagement(JsonField.of(createEngagement))

        /**
         * Sets [Builder.createEngagement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createEngagement] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createEngagement(createEngagement: JsonField<Boolean>) = apply {
            this.createEngagement = createEngagement
        }

        /** Contains additional properties related to the engagement. */
        fun engagementProperties(engagementProperties: EngagementProperties) =
            engagementProperties(JsonField.of(engagementProperties))

        /**
         * Sets [Builder.engagementProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engagementProperties] with a well-typed
         * [EngagementProperties] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun engagementProperties(engagementProperties: JsonField<EngagementProperties>) = apply {
            this.engagementProperties = engagementProperties
        }

        /** The unique identifier for the call from an external system. */
        fun externalCallId(externalCallId: String) = externalCallId(JsonField.of(externalCallId))

        /**
         * Sets [Builder.externalCallId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalCallId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalCallId(externalCallId: JsonField<String>) = apply {
            this.externalCallId = externalCallId
        }

        /**
         * The final status of the call, with accepted values including: BUSY, CALLING_CRM_USER,
         * CANCELED, COMPLETED, CONNECTING, FAILED, HOLD, IN_PROGRESS, MISSED, NO_ANSWER, QUEUED,
         * RINGING, UNKNOWN.
         */
        fun finalCallStatus(finalCallStatus: FinalCallStatus) =
            finalCallStatus(JsonField.of(finalCallStatus))

        /**
         * Sets [Builder.finalCallStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finalCallStatus] with a well-typed [FinalCallStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun finalCallStatus(finalCallStatus: JsonField<FinalCallStatus>) = apply {
            this.finalCallStatus = finalCallStatus
        }

        fun fromNumber(fromNumber: FormattedPhoneNumber) = fromNumber(JsonField.of(fromNumber))

        /**
         * Sets [Builder.fromNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromNumber] with a well-typed [FormattedPhoneNumber]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fromNumber(fromNumber: JsonField<FormattedPhoneNumber>) = apply {
            this.fromNumber = fromNumber
        }

        fun potentialRecipientUserIds(potentialRecipientUserIds: List<Int>) =
            potentialRecipientUserIds(JsonField.of(potentialRecipientUserIds))

        /**
         * Sets [Builder.potentialRecipientUserIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.potentialRecipientUserIds] with a well-typed `List<Int>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun potentialRecipientUserIds(potentialRecipientUserIds: JsonField<List<Int>>) = apply {
            this.potentialRecipientUserIds = potentialRecipientUserIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [potentialRecipientUserIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPotentialRecipientUserId(potentialRecipientUserId: Int) = apply {
            potentialRecipientUserIds =
                (potentialRecipientUserIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("potentialRecipientUserIds", it).add(potentialRecipientUserId)
                }
        }

        fun toNumber(toNumber: FormattedPhoneNumber) = toNumber(JsonField.of(toNumber))

        /**
         * Sets [Builder.toNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toNumber] with a well-typed [FormattedPhoneNumber] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toNumber(toNumber: JsonField<FormattedPhoneNumber>) = apply { this.toNumber = toNumber }

        /** The timestamp indicating when the call started, formatted as a date-time string. */
        fun callStartedTimestamp(callStartedTimestamp: OffsetDateTime) =
            callStartedTimestamp(JsonField.of(callStartedTimestamp))

        /**
         * Sets [Builder.callStartedTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callStartedTimestamp] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callStartedTimestamp(callStartedTimestamp: JsonField<OffsetDateTime>) = apply {
            this.callStartedTimestamp = callStartedTimestamp
        }

        /** The duration of the call in seconds. */
        fun durationSeconds(durationSeconds: Int) = durationSeconds(JsonField.of(durationSeconds))

        /**
         * Sets [Builder.durationSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationSeconds] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durationSeconds(durationSeconds: JsonField<Int>) = apply {
            this.durationSeconds = durationSeconds
        }

        /** The ID of the user associated with the call. */
        fun userId(userId: Int) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<Int>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [CompletedThirdPartyCallRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createEngagement()
         * .engagementProperties()
         * .externalCallId()
         * .finalCallStatus()
         * .fromNumber()
         * .potentialRecipientUserIds()
         * .toNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompletedThirdPartyCallRequest =
            CompletedThirdPartyCallRequest(
                checkRequired("createEngagement", createEngagement),
                checkRequired("engagementProperties", engagementProperties),
                checkRequired("externalCallId", externalCallId),
                checkRequired("finalCallStatus", finalCallStatus),
                checkRequired("fromNumber", fromNumber),
                checkRequired("potentialRecipientUserIds", potentialRecipientUserIds).map {
                    it.toImmutable()
                },
                checkRequired("toNumber", toNumber),
                callStartedTimestamp,
                durationSeconds,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CompletedThirdPartyCallRequest = apply {
        if (validated) {
            return@apply
        }

        createEngagement()
        engagementProperties().validate()
        externalCallId()
        finalCallStatus().validate()
        fromNumber().validate()
        potentialRecipientUserIds()
        toNumber().validate()
        callStartedTimestamp()
        durationSeconds()
        userId()
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
        (if (createEngagement.asKnown().isPresent) 1 else 0) +
            (engagementProperties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalCallId.asKnown().isPresent) 1 else 0) +
            (finalCallStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (fromNumber.asKnown().getOrNull()?.validity() ?: 0) +
            (potentialRecipientUserIds.asKnown().getOrNull()?.size ?: 0) +
            (toNumber.asKnown().getOrNull()?.validity() ?: 0) +
            (if (callStartedTimestamp.asKnown().isPresent) 1 else 0) +
            (if (durationSeconds.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    /** Contains additional properties related to the engagement. */
    class EngagementProperties
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

            /** Returns a mutable builder for constructing an instance of [EngagementProperties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EngagementProperties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(engagementProperties: EngagementProperties) = apply {
                additionalProperties = engagementProperties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [EngagementProperties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EngagementProperties =
                EngagementProperties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): EngagementProperties = apply {
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

            return other is EngagementProperties &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "EngagementProperties{additionalProperties=$additionalProperties}"
    }

    /**
     * The final status of the call, with accepted values including: BUSY, CALLING_CRM_USER,
     * CANCELED, COMPLETED, CONNECTING, FAILED, HOLD, IN_PROGRESS, MISSED, NO_ANSWER, QUEUED,
     * RINGING, UNKNOWN.
     */
    class FinalCallStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BUSY = of("BUSY")

            @JvmField val CALLING_CRM_USER = of("CALLING_CRM_USER")

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmField val CONNECTING = of("CONNECTING")

            @JvmField val FAILED = of("FAILED")

            @JvmField val HOLD = of("HOLD")

            @JvmField val IN_PROGRESS = of("IN_PROGRESS")

            @JvmField val MISSED = of("MISSED")

            @JvmField val NO_ANSWER = of("NO_ANSWER")

            @JvmField val QUEUED = of("QUEUED")

            @JvmField val RINGING = of("RINGING")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = FinalCallStatus(JsonField.of(value))
        }

        /** An enum containing [FinalCallStatus]'s known values. */
        enum class Known {
            BUSY,
            CALLING_CRM_USER,
            CANCELED,
            COMPLETED,
            CONNECTING,
            FAILED,
            HOLD,
            IN_PROGRESS,
            MISSED,
            NO_ANSWER,
            QUEUED,
            RINGING,
            UNKNOWN,
        }

        /**
         * An enum containing [FinalCallStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FinalCallStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSY,
            CALLING_CRM_USER,
            CANCELED,
            COMPLETED,
            CONNECTING,
            FAILED,
            HOLD,
            IN_PROGRESS,
            MISSED,
            NO_ANSWER,
            QUEUED,
            RINGING,
            UNKNOWN,
            /**
             * An enum member indicating that [FinalCallStatus] was instantiated with an unknown
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
                BUSY -> Value.BUSY
                CALLING_CRM_USER -> Value.CALLING_CRM_USER
                CANCELED -> Value.CANCELED
                COMPLETED -> Value.COMPLETED
                CONNECTING -> Value.CONNECTING
                FAILED -> Value.FAILED
                HOLD -> Value.HOLD
                IN_PROGRESS -> Value.IN_PROGRESS
                MISSED -> Value.MISSED
                NO_ANSWER -> Value.NO_ANSWER
                QUEUED -> Value.QUEUED
                RINGING -> Value.RINGING
                UNKNOWN -> Value.UNKNOWN
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
                BUSY -> Known.BUSY
                CALLING_CRM_USER -> Known.CALLING_CRM_USER
                CANCELED -> Known.CANCELED
                COMPLETED -> Known.COMPLETED
                CONNECTING -> Known.CONNECTING
                FAILED -> Known.FAILED
                HOLD -> Known.HOLD
                IN_PROGRESS -> Known.IN_PROGRESS
                MISSED -> Known.MISSED
                NO_ANSWER -> Known.NO_ANSWER
                QUEUED -> Known.QUEUED
                RINGING -> Known.RINGING
                UNKNOWN -> Known.UNKNOWN
                else -> throw HubspotInvalidDataException("Unknown FinalCallStatus: $value")
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

        fun validate(): FinalCallStatus = apply {
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

            return other is FinalCallStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompletedThirdPartyCallRequest &&
            createEngagement == other.createEngagement &&
            engagementProperties == other.engagementProperties &&
            externalCallId == other.externalCallId &&
            finalCallStatus == other.finalCallStatus &&
            fromNumber == other.fromNumber &&
            potentialRecipientUserIds == other.potentialRecipientUserIds &&
            toNumber == other.toNumber &&
            callStartedTimestamp == other.callStartedTimestamp &&
            durationSeconds == other.durationSeconds &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createEngagement,
            engagementProperties,
            externalCallId,
            finalCallStatus,
            fromNumber,
            potentialRecipientUserIds,
            toNumber,
            callStartedTimestamp,
            durationSeconds,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompletedThirdPartyCallRequest{createEngagement=$createEngagement, engagementProperties=$engagementProperties, externalCallId=$externalCallId, finalCallStatus=$finalCallStatus, fromNumber=$fromNumber, potentialRecipientUserIds=$potentialRecipientUserIds, toNumber=$toNumber, callStartedTimestamp=$callStartedTimestamp, durationSeconds=$durationSeconds, userId=$userId, additionalProperties=$additionalProperties}"
}
