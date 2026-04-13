// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

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
import kotlin.jvm.optionals.getOrNull

class PublicSequenceSettingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val eligibleFollowUpDays: JsonField<EligibleFollowUpDays>,
    private val individualTaskRemindersEnabled: JsonField<Boolean>,
    private val sellingStrategy: JsonField<SellingStrategy>,
    private val sendWindowEndMinute: JsonField<Int>,
    private val sendWindowStartMinute: JsonField<Int>,
    private val taskReminderMinute: JsonField<Int>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eligibleFollowUpDays")
        @ExcludeMissing
        eligibleFollowUpDays: JsonField<EligibleFollowUpDays> = JsonMissing.of(),
        @JsonProperty("individualTaskRemindersEnabled")
        @ExcludeMissing
        individualTaskRemindersEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sellingStrategy")
        @ExcludeMissing
        sellingStrategy: JsonField<SellingStrategy> = JsonMissing.of(),
        @JsonProperty("sendWindowEndMinute")
        @ExcludeMissing
        sendWindowEndMinute: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sendWindowStartMinute")
        @ExcludeMissing
        sendWindowStartMinute: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("taskReminderMinute")
        @ExcludeMissing
        taskReminderMinute: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        eligibleFollowUpDays,
        individualTaskRemindersEnabled,
        sellingStrategy,
        sendWindowEndMinute,
        sendWindowStartMinute,
        taskReminderMinute,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the sequence settings.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The timestamp of when the sequence settings were created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Specifies the days on which follow-up actions are allowed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eligibleFollowUpDays(): EligibleFollowUpDays =
        eligibleFollowUpDays.getRequired("eligibleFollowUpDays")

    /**
     * Indicates whether individual task reminders are enabled.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun individualTaskRemindersEnabled(): Boolean =
        individualTaskRemindersEnabled.getRequired("individualTaskRemindersEnabled")

    /**
     * (deprecated) Defines the unenrollment strategy, with accepted values being ACCOUNT_BASED or
     * LEAD_BASED. If ACCOUNT_BASED is used, all contacts associated with the same company will be
     * unenrolled if one contact meets any of the unenrollment criteria.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sellingStrategy(): SellingStrategy = sellingStrategy.getRequired("sellingStrategy")

    /**
     * Indicates the end minute of the time window during which automated emails can be sent.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendWindowEndMinute(): Int = sendWindowEndMinute.getRequired("sendWindowEndMinute")

    /**
     * Indicates the start minute of the time window during which automated emails can be sent.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendWindowStartMinute(): Int = sendWindowStartMinute.getRequired("sendWindowStartMinute")

    /**
     * Specifies the minute of day at which task reminders are triggered.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskReminderMinute(): Int = taskReminderMinute.getRequired("taskReminderMinute")

    /**
     * The timestamp of when the sequence settings were last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [eligibleFollowUpDays].
     *
     * Unlike [eligibleFollowUpDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eligibleFollowUpDays")
    @ExcludeMissing
    fun _eligibleFollowUpDays(): JsonField<EligibleFollowUpDays> = eligibleFollowUpDays

    /**
     * Returns the raw JSON value of [individualTaskRemindersEnabled].
     *
     * Unlike [individualTaskRemindersEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("individualTaskRemindersEnabled")
    @ExcludeMissing
    fun _individualTaskRemindersEnabled(): JsonField<Boolean> = individualTaskRemindersEnabled

    /**
     * Returns the raw JSON value of [sellingStrategy].
     *
     * Unlike [sellingStrategy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sellingStrategy")
    @ExcludeMissing
    fun _sellingStrategy(): JsonField<SellingStrategy> = sellingStrategy

    /**
     * Returns the raw JSON value of [sendWindowEndMinute].
     *
     * Unlike [sendWindowEndMinute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sendWindowEndMinute")
    @ExcludeMissing
    fun _sendWindowEndMinute(): JsonField<Int> = sendWindowEndMinute

    /**
     * Returns the raw JSON value of [sendWindowStartMinute].
     *
     * Unlike [sendWindowStartMinute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sendWindowStartMinute")
    @ExcludeMissing
    fun _sendWindowStartMinute(): JsonField<Int> = sendWindowStartMinute

    /**
     * Returns the raw JSON value of [taskReminderMinute].
     *
     * Unlike [taskReminderMinute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("taskReminderMinute")
    @ExcludeMissing
    fun _taskReminderMinute(): JsonField<Int> = taskReminderMinute

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * [PublicSequenceSettingsResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .eligibleFollowUpDays()
         * .individualTaskRemindersEnabled()
         * .sellingStrategy()
         * .sendWindowEndMinute()
         * .sendWindowStartMinute()
         * .taskReminderMinute()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSequenceSettingsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var eligibleFollowUpDays: JsonField<EligibleFollowUpDays>? = null
        private var individualTaskRemindersEnabled: JsonField<Boolean>? = null
        private var sellingStrategy: JsonField<SellingStrategy>? = null
        private var sendWindowEndMinute: JsonField<Int>? = null
        private var sendWindowStartMinute: JsonField<Int>? = null
        private var taskReminderMinute: JsonField<Int>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSequenceSettingsResponse: PublicSequenceSettingsResponse) = apply {
            id = publicSequenceSettingsResponse.id
            createdAt = publicSequenceSettingsResponse.createdAt
            eligibleFollowUpDays = publicSequenceSettingsResponse.eligibleFollowUpDays
            individualTaskRemindersEnabled =
                publicSequenceSettingsResponse.individualTaskRemindersEnabled
            sellingStrategy = publicSequenceSettingsResponse.sellingStrategy
            sendWindowEndMinute = publicSequenceSettingsResponse.sendWindowEndMinute
            sendWindowStartMinute = publicSequenceSettingsResponse.sendWindowStartMinute
            taskReminderMinute = publicSequenceSettingsResponse.taskReminderMinute
            updatedAt = publicSequenceSettingsResponse.updatedAt
            additionalProperties =
                publicSequenceSettingsResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the sequence settings. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The timestamp of when the sequence settings were created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Specifies the days on which follow-up actions are allowed. */
        fun eligibleFollowUpDays(eligibleFollowUpDays: EligibleFollowUpDays) =
            eligibleFollowUpDays(JsonField.of(eligibleFollowUpDays))

        /**
         * Sets [Builder.eligibleFollowUpDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eligibleFollowUpDays] with a well-typed
         * [EligibleFollowUpDays] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun eligibleFollowUpDays(eligibleFollowUpDays: JsonField<EligibleFollowUpDays>) = apply {
            this.eligibleFollowUpDays = eligibleFollowUpDays
        }

        /** Indicates whether individual task reminders are enabled. */
        fun individualTaskRemindersEnabled(individualTaskRemindersEnabled: Boolean) =
            individualTaskRemindersEnabled(JsonField.of(individualTaskRemindersEnabled))

        /**
         * Sets [Builder.individualTaskRemindersEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualTaskRemindersEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun individualTaskRemindersEnabled(individualTaskRemindersEnabled: JsonField<Boolean>) =
            apply {
                this.individualTaskRemindersEnabled = individualTaskRemindersEnabled
            }

        /**
         * (deprecated) Defines the unenrollment strategy, with accepted values being ACCOUNT_BASED
         * or LEAD_BASED. If ACCOUNT_BASED is used, all contacts associated with the same company
         * will be unenrolled if one contact meets any of the unenrollment criteria.
         */
        fun sellingStrategy(sellingStrategy: SellingStrategy) =
            sellingStrategy(JsonField.of(sellingStrategy))

        /**
         * Sets [Builder.sellingStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sellingStrategy] with a well-typed [SellingStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sellingStrategy(sellingStrategy: JsonField<SellingStrategy>) = apply {
            this.sellingStrategy = sellingStrategy
        }

        /**
         * Indicates the end minute of the time window during which automated emails can be sent.
         */
        fun sendWindowEndMinute(sendWindowEndMinute: Int) =
            sendWindowEndMinute(JsonField.of(sendWindowEndMinute))

        /**
         * Sets [Builder.sendWindowEndMinute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendWindowEndMinute] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendWindowEndMinute(sendWindowEndMinute: JsonField<Int>) = apply {
            this.sendWindowEndMinute = sendWindowEndMinute
        }

        /**
         * Indicates the start minute of the time window during which automated emails can be sent.
         */
        fun sendWindowStartMinute(sendWindowStartMinute: Int) =
            sendWindowStartMinute(JsonField.of(sendWindowStartMinute))

        /**
         * Sets [Builder.sendWindowStartMinute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendWindowStartMinute] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendWindowStartMinute(sendWindowStartMinute: JsonField<Int>) = apply {
            this.sendWindowStartMinute = sendWindowStartMinute
        }

        /** Specifies the minute of day at which task reminders are triggered. */
        fun taskReminderMinute(taskReminderMinute: Int) =
            taskReminderMinute(JsonField.of(taskReminderMinute))

        /**
         * Sets [Builder.taskReminderMinute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskReminderMinute] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taskReminderMinute(taskReminderMinute: JsonField<Int>) = apply {
            this.taskReminderMinute = taskReminderMinute
        }

        /** The timestamp of when the sequence settings were last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PublicSequenceSettingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .eligibleFollowUpDays()
         * .individualTaskRemindersEnabled()
         * .sellingStrategy()
         * .sendWindowEndMinute()
         * .sendWindowStartMinute()
         * .taskReminderMinute()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSequenceSettingsResponse =
            PublicSequenceSettingsResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("eligibleFollowUpDays", eligibleFollowUpDays),
                checkRequired("individualTaskRemindersEnabled", individualTaskRemindersEnabled),
                checkRequired("sellingStrategy", sellingStrategy),
                checkRequired("sendWindowEndMinute", sendWindowEndMinute),
                checkRequired("sendWindowStartMinute", sendWindowStartMinute),
                checkRequired("taskReminderMinute", taskReminderMinute),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSequenceSettingsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        eligibleFollowUpDays().validate()
        individualTaskRemindersEnabled()
        sellingStrategy().validate()
        sendWindowEndMinute()
        sendWindowStartMinute()
        taskReminderMinute()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (eligibleFollowUpDays.asKnown().getOrNull()?.validity() ?: 0) +
            (if (individualTaskRemindersEnabled.asKnown().isPresent) 1 else 0) +
            (sellingStrategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sendWindowEndMinute.asKnown().isPresent) 1 else 0) +
            (if (sendWindowStartMinute.asKnown().isPresent) 1 else 0) +
            (if (taskReminderMinute.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Specifies the days on which follow-up actions are allowed. */
    class EligibleFollowUpDays
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

            @JvmField val BUSINESS_DAYS = of("BUSINESS_DAYS")

            @JvmField val EVERYDAY = of("EVERYDAY")

            @JvmField val WEEKDAYS_ONLY = of("WEEKDAYS_ONLY")

            @JvmStatic fun of(value: String) = EligibleFollowUpDays(JsonField.of(value))
        }

        /** An enum containing [EligibleFollowUpDays]'s known values. */
        enum class Known {
            BUSINESS_DAYS,
            EVERYDAY,
            WEEKDAYS_ONLY,
        }

        /**
         * An enum containing [EligibleFollowUpDays]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [EligibleFollowUpDays] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS_DAYS,
            EVERYDAY,
            WEEKDAYS_ONLY,
            /**
             * An enum member indicating that [EligibleFollowUpDays] was instantiated with an
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
                BUSINESS_DAYS -> Value.BUSINESS_DAYS
                EVERYDAY -> Value.EVERYDAY
                WEEKDAYS_ONLY -> Value.WEEKDAYS_ONLY
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
                BUSINESS_DAYS -> Known.BUSINESS_DAYS
                EVERYDAY -> Known.EVERYDAY
                WEEKDAYS_ONLY -> Known.WEEKDAYS_ONLY
                else -> throw HubSpotInvalidDataException("Unknown EligibleFollowUpDays: $value")
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

        fun validate(): EligibleFollowUpDays = apply {
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

            return other is EligibleFollowUpDays && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * (deprecated) Defines the unenrollment strategy, with accepted values being ACCOUNT_BASED or
     * LEAD_BASED. If ACCOUNT_BASED is used, all contacts associated with the same company will be
     * unenrolled if one contact meets any of the unenrollment criteria.
     */
    class SellingStrategy @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ACCOUNT_BASED = of("ACCOUNT_BASED")

            @JvmField val LEAD_BASED = of("LEAD_BASED")

            @JvmStatic fun of(value: String) = SellingStrategy(JsonField.of(value))
        }

        /** An enum containing [SellingStrategy]'s known values. */
        enum class Known {
            ACCOUNT_BASED,
            LEAD_BASED,
        }

        /**
         * An enum containing [SellingStrategy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SellingStrategy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_BASED,
            LEAD_BASED,
            /**
             * An enum member indicating that [SellingStrategy] was instantiated with an unknown
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
                ACCOUNT_BASED -> Value.ACCOUNT_BASED
                LEAD_BASED -> Value.LEAD_BASED
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
                ACCOUNT_BASED -> Known.ACCOUNT_BASED
                LEAD_BASED -> Known.LEAD_BASED
                else -> throw HubSpotInvalidDataException("Unknown SellingStrategy: $value")
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

        fun validate(): SellingStrategy = apply {
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

            return other is SellingStrategy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSequenceSettingsResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            eligibleFollowUpDays == other.eligibleFollowUpDays &&
            individualTaskRemindersEnabled == other.individualTaskRemindersEnabled &&
            sellingStrategy == other.sellingStrategy &&
            sendWindowEndMinute == other.sendWindowEndMinute &&
            sendWindowStartMinute == other.sendWindowStartMinute &&
            taskReminderMinute == other.taskReminderMinute &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            eligibleFollowUpDays,
            individualTaskRemindersEnabled,
            sellingStrategy,
            sendWindowEndMinute,
            sendWindowStartMinute,
            taskReminderMinute,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSequenceSettingsResponse{id=$id, createdAt=$createdAt, eligibleFollowUpDays=$eligibleFollowUpDays, individualTaskRemindersEnabled=$individualTaskRemindersEnabled, sellingStrategy=$sellingStrategy, sendWindowEndMinute=$sendWindowEndMinute, sendWindowStartMinute=$sendWindowStartMinute, taskReminderMinute=$taskReminderMinute, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
