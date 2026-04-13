// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.BaseDeserializer
import com.hubspot.core.BaseSerializer
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.allMaxBy
import com.hubspot.core.checkRequired
import com.hubspot.core.getOrThrow
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicEmailEventFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appId: JsonField<String>,
    private val emailId: JsonField<String>,
    private val filterType: JsonField<FilterType>,
    private val level: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val clickUrl: JsonField<String>,
    private val pruningRefineBy: JsonField<PruningRefineBy>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("appId") @ExcludeMissing appId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailId") @ExcludeMissing emailId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("level") @ExcludeMissing level: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("clickUrl") @ExcludeMissing clickUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pruningRefineBy")
        @ExcludeMissing
        pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of(),
    ) : this(appId, emailId, filterType, level, operator, clickUrl, pruningRefineBy, mutableMapOf())

    /**
     * The ID of the application associated with the email event filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): String = appId.getRequired("appId")

    /**
     * The ID of the email associated with the event filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailId(): String = emailId.getRequired("emailId")

    /**
     * Indicates the type of filter (EMAIL_EVENT).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * Specifies the level of the email event, such as EMAIL_API_CAMPAIGN_GROUP.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun level(): String = level.getRequired("level")

    /**
     * Defines the operation to be applied within the filter (BOUNCED, LINK_CLICKED, MARKED_SPAM,
     * OPENED, OPENED_BUT_LINK_NOT_CLICKED, OPENED_BUT_NOT_REPLIED, RECEIVED,
     * RECEIVED_BUT_NOT_OPENED, REPLIED, SENT, SENT_BUT_LINK_NOT_CLICKED, SENT_BUT_NOT_RECEIVED,
     * UNSUBSCRIBED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * The URL that was clicked in the email event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clickUrl(): Optional<String> = clickUrl.getOptional("clickUrl")

    /**
     * Specifies the criteria for refining the filter by pruning.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pruningRefineBy(): Optional<PruningRefineBy> =
        pruningRefineBy.getOptional("pruningRefineBy")

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appId") @ExcludeMissing fun _appId(): JsonField<String> = appId

    /**
     * Returns the raw JSON value of [emailId].
     *
     * Unlike [emailId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailId") @ExcludeMissing fun _emailId(): JsonField<String> = emailId

    /**
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterType")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [level].
     *
     * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<String> = level

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [clickUrl].
     *
     * Unlike [clickUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clickUrl") @ExcludeMissing fun _clickUrl(): JsonField<String> = clickUrl

    /**
     * Returns the raw JSON value of [pruningRefineBy].
     *
     * Unlike [pruningRefineBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pruningRefineBy")
    @ExcludeMissing
    fun _pruningRefineBy(): JsonField<PruningRefineBy> = pruningRefineBy

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
         * Returns a mutable builder for constructing an instance of [PublicEmailEventFilter].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .emailId()
         * .filterType()
         * .level()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailEventFilter]. */
    class Builder internal constructor() {

        private var appId: JsonField<String>? = null
        private var emailId: JsonField<String>? = null
        private var filterType: JsonField<FilterType>? = null
        private var level: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var clickUrl: JsonField<String> = JsonMissing.of()
        private var pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailEventFilter: PublicEmailEventFilter) = apply {
            appId = publicEmailEventFilter.appId
            emailId = publicEmailEventFilter.emailId
            filterType = publicEmailEventFilter.filterType
            level = publicEmailEventFilter.level
            operator = publicEmailEventFilter.operator
            clickUrl = publicEmailEventFilter.clickUrl
            pruningRefineBy = publicEmailEventFilter.pruningRefineBy
            additionalProperties = publicEmailEventFilter.additionalProperties.toMutableMap()
        }

        /** The ID of the application associated with the email event filter. */
        fun appId(appId: String) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<String>) = apply { this.appId = appId }

        /** The ID of the email associated with the event filter. */
        fun emailId(emailId: String) = emailId(JsonField.of(emailId))

        /**
         * Sets [Builder.emailId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emailId(emailId: JsonField<String>) = apply { this.emailId = emailId }

        /** Indicates the type of filter (EMAIL_EVENT). */
        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        /** Specifies the level of the email event, such as EMAIL_API_CAMPAIGN_GROUP. */
        fun level(level: String) = level(JsonField.of(level))

        /**
         * Sets [Builder.level] to an arbitrary JSON value.
         *
         * You should usually call [Builder.level] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun level(level: JsonField<String>) = apply { this.level = level }

        /**
         * Defines the operation to be applied within the filter (BOUNCED, LINK_CLICKED,
         * MARKED_SPAM, OPENED, OPENED_BUT_LINK_NOT_CLICKED, OPENED_BUT_NOT_REPLIED, RECEIVED,
         * RECEIVED_BUT_NOT_OPENED, REPLIED, SENT, SENT_BUT_LINK_NOT_CLICKED, SENT_BUT_NOT_RECEIVED,
         * UNSUBSCRIBED).
         */
        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        /** The URL that was clicked in the email event. */
        fun clickUrl(clickUrl: String) = clickUrl(JsonField.of(clickUrl))

        /**
         * Sets [Builder.clickUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clickUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clickUrl(clickUrl: JsonField<String>) = apply { this.clickUrl = clickUrl }

        /** Specifies the criteria for refining the filter by pruning. */
        fun pruningRefineBy(pruningRefineBy: PruningRefineBy) =
            pruningRefineBy(JsonField.of(pruningRefineBy))

        /**
         * Sets [Builder.pruningRefineBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pruningRefineBy] with a well-typed [PruningRefineBy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pruningRefineBy(pruningRefineBy: JsonField<PruningRefineBy>) = apply {
            this.pruningRefineBy = pruningRefineBy
        }

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicNumOccurrences(publicNumOccurrences)`.
         */
        fun pruningRefineBy(publicNumOccurrences: PublicNumOccurrencesRefineBy) =
            pruningRefineBy(PruningRefineBy.ofPublicNumOccurrences(publicNumOccurrences))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicSetOccurrences(publicSetOccurrences)`.
         */
        fun pruningRefineBy(publicSetOccurrences: PublicSetOccurrencesRefineBy) =
            pruningRefineBy(PruningRefineBy.ofPublicSetOccurrences(publicSetOccurrences))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicRelativeComparativeTimestamp(publicRelativeComparativeTimestamp)`.
         */
        fun pruningRefineBy(
            publicRelativeComparativeTimestamp: PublicRelativeComparativeTimestampRefineBy
        ) =
            pruningRefineBy(
                PruningRefineBy.ofPublicRelativeComparativeTimestamp(
                    publicRelativeComparativeTimestamp
                )
            )

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicRelativeRangedTimestamp(publicRelativeRangedTimestamp)`.
         */
        fun pruningRefineBy(publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy) =
            pruningRefineBy(
                PruningRefineBy.ofPublicRelativeRangedTimestamp(publicRelativeRangedTimestamp)
            )

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicAbsoluteComparativeTimestamp(publicAbsoluteComparativeTimestamp)`.
         */
        fun pruningRefineBy(
            publicAbsoluteComparativeTimestamp: PublicAbsoluteComparativeTimestampRefineBy
        ) =
            pruningRefineBy(
                PruningRefineBy.ofPublicAbsoluteComparativeTimestamp(
                    publicAbsoluteComparativeTimestamp
                )
            )

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicAbsoluteRangedTimestamp(publicAbsoluteRangedTimestamp)`.
         */
        fun pruningRefineBy(publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy) =
            pruningRefineBy(
                PruningRefineBy.ofPublicAbsoluteRangedTimestamp(publicAbsoluteRangedTimestamp)
            )

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicAllHistory(publicAllHistory)`.
         */
        fun pruningRefineBy(publicAllHistory: PublicAllHistoryRefineBy) =
            pruningRefineBy(PruningRefineBy.ofPublicAllHistory(publicAllHistory))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicTimePointOperation(publicTimePointOperation)`.
         */
        fun pruningRefineBy(publicTimePointOperation: PublicTimePointOperation) =
            pruningRefineBy(PruningRefineBy.ofPublicTimePointOperation(publicTimePointOperation))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicRangedTimeOperation(publicRangedTimeOperation)`.
         */
        fun pruningRefineBy(publicRangedTimeOperation: PublicRangedTimeOperation) =
            pruningRefineBy(PruningRefineBy.ofPublicRangedTimeOperation(publicRangedTimeOperation))

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
         * Returns an immutable instance of [PublicEmailEventFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .emailId()
         * .filterType()
         * .level()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicEmailEventFilter =
            PublicEmailEventFilter(
                checkRequired("appId", appId),
                checkRequired("emailId", emailId),
                checkRequired("filterType", filterType),
                checkRequired("level", level),
                checkRequired("operator", operator),
                clickUrl,
                pruningRefineBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailEventFilter = apply {
        if (validated) {
            return@apply
        }

        appId()
        emailId()
        filterType().validate()
        level()
        operator().validate()
        clickUrl()
        pruningRefineBy().ifPresent { it.validate() }
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
        (if (appId.asKnown().isPresent) 1 else 0) +
            (if (emailId.asKnown().isPresent) 1 else 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (level.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (clickUrl.asKnown().isPresent) 1 else 0) +
            (pruningRefineBy.asKnown().getOrNull()?.validity() ?: 0)

    /** Indicates the type of filter (EMAIL_EVENT). */
    class FilterType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EMAIL_EVENT = of("EMAIL_EVENT")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            EMAIL_EVENT
        }

        /**
         * An enum containing [FilterType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL_EVENT,
            /**
             * An enum member indicating that [FilterType] was instantiated with an unknown value.
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
                EMAIL_EVENT -> Value.EMAIL_EVENT
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
                EMAIL_EVENT -> Known.EMAIL_EVENT
                else -> throw HubSpotInvalidDataException("Unknown FilterType: $value")
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

        fun validate(): FilterType = apply {
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

            return other is FilterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Defines the operation to be applied within the filter (BOUNCED, LINK_CLICKED, MARKED_SPAM,
     * OPENED, OPENED_BUT_LINK_NOT_CLICKED, OPENED_BUT_NOT_REPLIED, RECEIVED,
     * RECEIVED_BUT_NOT_OPENED, REPLIED, SENT, SENT_BUT_LINK_NOT_CLICKED, SENT_BUT_NOT_RECEIVED,
     * UNSUBSCRIBED).
     */
    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BOUNCED = of("BOUNCED")

            @JvmField val LINK_CLICKED = of("LINK_CLICKED")

            @JvmField val MARKED_SPAM = of("MARKED_SPAM")

            @JvmField val OPENED = of("OPENED")

            @JvmField val OPENED_BUT_LINK_NOT_CLICKED = of("OPENED_BUT_LINK_NOT_CLICKED")

            @JvmField val OPENED_BUT_NOT_REPLIED = of("OPENED_BUT_NOT_REPLIED")

            @JvmField val RECEIVED = of("RECEIVED")

            @JvmField val RECEIVED_BUT_NOT_OPENED = of("RECEIVED_BUT_NOT_OPENED")

            @JvmField val REPLIED = of("REPLIED")

            @JvmField val SENT = of("SENT")

            @JvmField val SENT_BUT_LINK_NOT_CLICKED = of("SENT_BUT_LINK_NOT_CLICKED")

            @JvmField val SENT_BUT_NOT_RECEIVED = of("SENT_BUT_NOT_RECEIVED")

            @JvmField val UNSUBSCRIBED = of("UNSUBSCRIBED")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            BOUNCED,
            LINK_CLICKED,
            MARKED_SPAM,
            OPENED,
            OPENED_BUT_LINK_NOT_CLICKED,
            OPENED_BUT_NOT_REPLIED,
            RECEIVED,
            RECEIVED_BUT_NOT_OPENED,
            REPLIED,
            SENT,
            SENT_BUT_LINK_NOT_CLICKED,
            SENT_BUT_NOT_RECEIVED,
            UNSUBSCRIBED,
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOUNCED,
            LINK_CLICKED,
            MARKED_SPAM,
            OPENED,
            OPENED_BUT_LINK_NOT_CLICKED,
            OPENED_BUT_NOT_REPLIED,
            RECEIVED,
            RECEIVED_BUT_NOT_OPENED,
            REPLIED,
            SENT,
            SENT_BUT_LINK_NOT_CLICKED,
            SENT_BUT_NOT_RECEIVED,
            UNSUBSCRIBED,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
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
                BOUNCED -> Value.BOUNCED
                LINK_CLICKED -> Value.LINK_CLICKED
                MARKED_SPAM -> Value.MARKED_SPAM
                OPENED -> Value.OPENED
                OPENED_BUT_LINK_NOT_CLICKED -> Value.OPENED_BUT_LINK_NOT_CLICKED
                OPENED_BUT_NOT_REPLIED -> Value.OPENED_BUT_NOT_REPLIED
                RECEIVED -> Value.RECEIVED
                RECEIVED_BUT_NOT_OPENED -> Value.RECEIVED_BUT_NOT_OPENED
                REPLIED -> Value.REPLIED
                SENT -> Value.SENT
                SENT_BUT_LINK_NOT_CLICKED -> Value.SENT_BUT_LINK_NOT_CLICKED
                SENT_BUT_NOT_RECEIVED -> Value.SENT_BUT_NOT_RECEIVED
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
                BOUNCED -> Known.BOUNCED
                LINK_CLICKED -> Known.LINK_CLICKED
                MARKED_SPAM -> Known.MARKED_SPAM
                OPENED -> Known.OPENED
                OPENED_BUT_LINK_NOT_CLICKED -> Known.OPENED_BUT_LINK_NOT_CLICKED
                OPENED_BUT_NOT_REPLIED -> Known.OPENED_BUT_NOT_REPLIED
                RECEIVED -> Known.RECEIVED
                RECEIVED_BUT_NOT_OPENED -> Known.RECEIVED_BUT_NOT_OPENED
                REPLIED -> Known.REPLIED
                SENT -> Known.SENT
                SENT_BUT_LINK_NOT_CLICKED -> Known.SENT_BUT_LINK_NOT_CLICKED
                SENT_BUT_NOT_RECEIVED -> Known.SENT_BUT_NOT_RECEIVED
                UNSUBSCRIBED -> Known.UNSUBSCRIBED
                else -> throw HubSpotInvalidDataException("Unknown Operator: $value")
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

        fun validate(): Operator = apply {
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

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies the criteria for refining the filter by pruning. */
    @JsonDeserialize(using = PruningRefineBy.Deserializer::class)
    @JsonSerialize(using = PruningRefineBy.Serializer::class)
    class PruningRefineBy
    private constructor(
        private val publicNumOccurrences: PublicNumOccurrencesRefineBy? = null,
        private val publicSetOccurrences: PublicSetOccurrencesRefineBy? = null,
        private val publicRelativeComparativeTimestamp:
            PublicRelativeComparativeTimestampRefineBy? =
            null,
        private val publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy? = null,
        private val publicAbsoluteComparativeTimestamp:
            PublicAbsoluteComparativeTimestampRefineBy? =
            null,
        private val publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy? = null,
        private val publicAllHistory: PublicAllHistoryRefineBy? = null,
        private val publicTimePointOperation: PublicTimePointOperation? = null,
        private val publicRangedTimeOperation: PublicRangedTimeOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicNumOccurrences(): Optional<PublicNumOccurrencesRefineBy> =
            Optional.ofNullable(publicNumOccurrences)

        fun publicSetOccurrences(): Optional<PublicSetOccurrencesRefineBy> =
            Optional.ofNullable(publicSetOccurrences)

        fun publicRelativeComparativeTimestamp():
            Optional<PublicRelativeComparativeTimestampRefineBy> =
            Optional.ofNullable(publicRelativeComparativeTimestamp)

        fun publicRelativeRangedTimestamp(): Optional<PublicRelativeRangedTimestampRefineBy> =
            Optional.ofNullable(publicRelativeRangedTimestamp)

        fun publicAbsoluteComparativeTimestamp():
            Optional<PublicAbsoluteComparativeTimestampRefineBy> =
            Optional.ofNullable(publicAbsoluteComparativeTimestamp)

        fun publicAbsoluteRangedTimestamp(): Optional<PublicAbsoluteRangedTimestampRefineBy> =
            Optional.ofNullable(publicAbsoluteRangedTimestamp)

        fun publicAllHistory(): Optional<PublicAllHistoryRefineBy> =
            Optional.ofNullable(publicAllHistory)

        fun publicTimePointOperation(): Optional<PublicTimePointOperation> =
            Optional.ofNullable(publicTimePointOperation)

        fun publicRangedTimeOperation(): Optional<PublicRangedTimeOperation> =
            Optional.ofNullable(publicRangedTimeOperation)

        fun isPublicNumOccurrences(): Boolean = publicNumOccurrences != null

        fun isPublicSetOccurrences(): Boolean = publicSetOccurrences != null

        fun isPublicRelativeComparativeTimestamp(): Boolean =
            publicRelativeComparativeTimestamp != null

        fun isPublicRelativeRangedTimestamp(): Boolean = publicRelativeRangedTimestamp != null

        fun isPublicAbsoluteComparativeTimestamp(): Boolean =
            publicAbsoluteComparativeTimestamp != null

        fun isPublicAbsoluteRangedTimestamp(): Boolean = publicAbsoluteRangedTimestamp != null

        fun isPublicAllHistory(): Boolean = publicAllHistory != null

        fun isPublicTimePointOperation(): Boolean = publicTimePointOperation != null

        fun isPublicRangedTimeOperation(): Boolean = publicRangedTimeOperation != null

        fun asPublicNumOccurrences(): PublicNumOccurrencesRefineBy =
            publicNumOccurrences.getOrThrow("publicNumOccurrences")

        fun asPublicSetOccurrences(): PublicSetOccurrencesRefineBy =
            publicSetOccurrences.getOrThrow("publicSetOccurrences")

        fun asPublicRelativeComparativeTimestamp(): PublicRelativeComparativeTimestampRefineBy =
            publicRelativeComparativeTimestamp.getOrThrow("publicRelativeComparativeTimestamp")

        fun asPublicRelativeRangedTimestamp(): PublicRelativeRangedTimestampRefineBy =
            publicRelativeRangedTimestamp.getOrThrow("publicRelativeRangedTimestamp")

        fun asPublicAbsoluteComparativeTimestamp(): PublicAbsoluteComparativeTimestampRefineBy =
            publicAbsoluteComparativeTimestamp.getOrThrow("publicAbsoluteComparativeTimestamp")

        fun asPublicAbsoluteRangedTimestamp(): PublicAbsoluteRangedTimestampRefineBy =
            publicAbsoluteRangedTimestamp.getOrThrow("publicAbsoluteRangedTimestamp")

        fun asPublicAllHistory(): PublicAllHistoryRefineBy =
            publicAllHistory.getOrThrow("publicAllHistory")

        fun asPublicTimePointOperation(): PublicTimePointOperation =
            publicTimePointOperation.getOrThrow("publicTimePointOperation")

        fun asPublicRangedTimeOperation(): PublicRangedTimeOperation =
            publicRangedTimeOperation.getOrThrow("publicRangedTimeOperation")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicNumOccurrences != null ->
                    visitor.visitPublicNumOccurrences(publicNumOccurrences)
                publicSetOccurrences != null ->
                    visitor.visitPublicSetOccurrences(publicSetOccurrences)
                publicRelativeComparativeTimestamp != null ->
                    visitor.visitPublicRelativeComparativeTimestamp(
                        publicRelativeComparativeTimestamp
                    )
                publicRelativeRangedTimestamp != null ->
                    visitor.visitPublicRelativeRangedTimestamp(publicRelativeRangedTimestamp)
                publicAbsoluteComparativeTimestamp != null ->
                    visitor.visitPublicAbsoluteComparativeTimestamp(
                        publicAbsoluteComparativeTimestamp
                    )
                publicAbsoluteRangedTimestamp != null ->
                    visitor.visitPublicAbsoluteRangedTimestamp(publicAbsoluteRangedTimestamp)
                publicAllHistory != null -> visitor.visitPublicAllHistory(publicAllHistory)
                publicTimePointOperation != null ->
                    visitor.visitPublicTimePointOperation(publicTimePointOperation)
                publicRangedTimeOperation != null ->
                    visitor.visitPublicRangedTimeOperation(publicRangedTimeOperation)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): PruningRefineBy = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicNumOccurrences(
                        publicNumOccurrences: PublicNumOccurrencesRefineBy
                    ) {
                        publicNumOccurrences.validate()
                    }

                    override fun visitPublicSetOccurrences(
                        publicSetOccurrences: PublicSetOccurrencesRefineBy
                    ) {
                        publicSetOccurrences.validate()
                    }

                    override fun visitPublicRelativeComparativeTimestamp(
                        publicRelativeComparativeTimestamp:
                            PublicRelativeComparativeTimestampRefineBy
                    ) {
                        publicRelativeComparativeTimestamp.validate()
                    }

                    override fun visitPublicRelativeRangedTimestamp(
                        publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy
                    ) {
                        publicRelativeRangedTimestamp.validate()
                    }

                    override fun visitPublicAbsoluteComparativeTimestamp(
                        publicAbsoluteComparativeTimestamp:
                            PublicAbsoluteComparativeTimestampRefineBy
                    ) {
                        publicAbsoluteComparativeTimestamp.validate()
                    }

                    override fun visitPublicAbsoluteRangedTimestamp(
                        publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy
                    ) {
                        publicAbsoluteRangedTimestamp.validate()
                    }

                    override fun visitPublicAllHistory(publicAllHistory: PublicAllHistoryRefineBy) {
                        publicAllHistory.validate()
                    }

                    override fun visitPublicTimePointOperation(
                        publicTimePointOperation: PublicTimePointOperation
                    ) {
                        publicTimePointOperation.validate()
                    }

                    override fun visitPublicRangedTimeOperation(
                        publicRangedTimeOperation: PublicRangedTimeOperation
                    ) {
                        publicRangedTimeOperation.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitPublicNumOccurrences(
                        publicNumOccurrences: PublicNumOccurrencesRefineBy
                    ) = publicNumOccurrences.validity()

                    override fun visitPublicSetOccurrences(
                        publicSetOccurrences: PublicSetOccurrencesRefineBy
                    ) = publicSetOccurrences.validity()

                    override fun visitPublicRelativeComparativeTimestamp(
                        publicRelativeComparativeTimestamp:
                            PublicRelativeComparativeTimestampRefineBy
                    ) = publicRelativeComparativeTimestamp.validity()

                    override fun visitPublicRelativeRangedTimestamp(
                        publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy
                    ) = publicRelativeRangedTimestamp.validity()

                    override fun visitPublicAbsoluteComparativeTimestamp(
                        publicAbsoluteComparativeTimestamp:
                            PublicAbsoluteComparativeTimestampRefineBy
                    ) = publicAbsoluteComparativeTimestamp.validity()

                    override fun visitPublicAbsoluteRangedTimestamp(
                        publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy
                    ) = publicAbsoluteRangedTimestamp.validity()

                    override fun visitPublicAllHistory(publicAllHistory: PublicAllHistoryRefineBy) =
                        publicAllHistory.validity()

                    override fun visitPublicTimePointOperation(
                        publicTimePointOperation: PublicTimePointOperation
                    ) = publicTimePointOperation.validity()

                    override fun visitPublicRangedTimeOperation(
                        publicRangedTimeOperation: PublicRangedTimeOperation
                    ) = publicRangedTimeOperation.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PruningRefineBy &&
                publicNumOccurrences == other.publicNumOccurrences &&
                publicSetOccurrences == other.publicSetOccurrences &&
                publicRelativeComparativeTimestamp == other.publicRelativeComparativeTimestamp &&
                publicRelativeRangedTimestamp == other.publicRelativeRangedTimestamp &&
                publicAbsoluteComparativeTimestamp == other.publicAbsoluteComparativeTimestamp &&
                publicAbsoluteRangedTimestamp == other.publicAbsoluteRangedTimestamp &&
                publicAllHistory == other.publicAllHistory &&
                publicTimePointOperation == other.publicTimePointOperation &&
                publicRangedTimeOperation == other.publicRangedTimeOperation
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicNumOccurrences,
                publicSetOccurrences,
                publicRelativeComparativeTimestamp,
                publicRelativeRangedTimestamp,
                publicAbsoluteComparativeTimestamp,
                publicAbsoluteRangedTimestamp,
                publicAllHistory,
                publicTimePointOperation,
                publicRangedTimeOperation,
            )

        override fun toString(): String =
            when {
                publicNumOccurrences != null ->
                    "PruningRefineBy{publicNumOccurrences=$publicNumOccurrences}"
                publicSetOccurrences != null ->
                    "PruningRefineBy{publicSetOccurrences=$publicSetOccurrences}"
                publicRelativeComparativeTimestamp != null ->
                    "PruningRefineBy{publicRelativeComparativeTimestamp=$publicRelativeComparativeTimestamp}"
                publicRelativeRangedTimestamp != null ->
                    "PruningRefineBy{publicRelativeRangedTimestamp=$publicRelativeRangedTimestamp}"
                publicAbsoluteComparativeTimestamp != null ->
                    "PruningRefineBy{publicAbsoluteComparativeTimestamp=$publicAbsoluteComparativeTimestamp}"
                publicAbsoluteRangedTimestamp != null ->
                    "PruningRefineBy{publicAbsoluteRangedTimestamp=$publicAbsoluteRangedTimestamp}"
                publicAllHistory != null -> "PruningRefineBy{publicAllHistory=$publicAllHistory}"
                publicTimePointOperation != null ->
                    "PruningRefineBy{publicTimePointOperation=$publicTimePointOperation}"
                publicRangedTimeOperation != null ->
                    "PruningRefineBy{publicRangedTimeOperation=$publicRangedTimeOperation}"
                _json != null -> "PruningRefineBy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PruningRefineBy")
            }

        companion object {

            @JvmStatic
            fun ofPublicNumOccurrences(publicNumOccurrences: PublicNumOccurrencesRefineBy) =
                PruningRefineBy(publicNumOccurrences = publicNumOccurrences)

            @JvmStatic
            fun ofPublicSetOccurrences(publicSetOccurrences: PublicSetOccurrencesRefineBy) =
                PruningRefineBy(publicSetOccurrences = publicSetOccurrences)

            @JvmStatic
            fun ofPublicRelativeComparativeTimestamp(
                publicRelativeComparativeTimestamp: PublicRelativeComparativeTimestampRefineBy
            ) =
                PruningRefineBy(
                    publicRelativeComparativeTimestamp = publicRelativeComparativeTimestamp
                )

            @JvmStatic
            fun ofPublicRelativeRangedTimestamp(
                publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy
            ) = PruningRefineBy(publicRelativeRangedTimestamp = publicRelativeRangedTimestamp)

            @JvmStatic
            fun ofPublicAbsoluteComparativeTimestamp(
                publicAbsoluteComparativeTimestamp: PublicAbsoluteComparativeTimestampRefineBy
            ) =
                PruningRefineBy(
                    publicAbsoluteComparativeTimestamp = publicAbsoluteComparativeTimestamp
                )

            @JvmStatic
            fun ofPublicAbsoluteRangedTimestamp(
                publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy
            ) = PruningRefineBy(publicAbsoluteRangedTimestamp = publicAbsoluteRangedTimestamp)

            @JvmStatic
            fun ofPublicAllHistory(publicAllHistory: PublicAllHistoryRefineBy) =
                PruningRefineBy(publicAllHistory = publicAllHistory)

            @JvmStatic
            fun ofPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation) =
                PruningRefineBy(publicTimePointOperation = publicTimePointOperation)

            @JvmStatic
            fun ofPublicRangedTimeOperation(publicRangedTimeOperation: PublicRangedTimeOperation) =
                PruningRefineBy(publicRangedTimeOperation = publicRangedTimeOperation)
        }

        /**
         * An interface that defines how to map each variant of [PruningRefineBy] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitPublicNumOccurrences(publicNumOccurrences: PublicNumOccurrencesRefineBy): T

            fun visitPublicSetOccurrences(publicSetOccurrences: PublicSetOccurrencesRefineBy): T

            fun visitPublicRelativeComparativeTimestamp(
                publicRelativeComparativeTimestamp: PublicRelativeComparativeTimestampRefineBy
            ): T

            fun visitPublicRelativeRangedTimestamp(
                publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy
            ): T

            fun visitPublicAbsoluteComparativeTimestamp(
                publicAbsoluteComparativeTimestamp: PublicAbsoluteComparativeTimestampRefineBy
            ): T

            fun visitPublicAbsoluteRangedTimestamp(
                publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy
            ): T

            fun visitPublicAllHistory(publicAllHistory: PublicAllHistoryRefineBy): T

            fun visitPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation): T

            fun visitPublicRangedTimeOperation(
                publicRangedTimeOperation: PublicRangedTimeOperation
            ): T

            /**
             * Maps an unknown variant of [PruningRefineBy] to a value of type [T].
             *
             * An instance of [PruningRefineBy] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown PruningRefineBy: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<PruningRefineBy>(PruningRefineBy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PruningRefineBy {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicNumOccurrencesRefineBy>())
                                ?.let { PruningRefineBy(publicNumOccurrences = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicSetOccurrencesRefineBy>())
                                ?.let { PruningRefineBy(publicSetOccurrences = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRelativeComparativeTimestampRefineBy>(),
                                )
                                ?.let {
                                    PruningRefineBy(
                                        publicRelativeComparativeTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRelativeRangedTimestampRefineBy>(),
                                )
                                ?.let {
                                    PruningRefineBy(
                                        publicRelativeRangedTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicAbsoluteComparativeTimestampRefineBy>(),
                                )
                                ?.let {
                                    PruningRefineBy(
                                        publicAbsoluteComparativeTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicAbsoluteRangedTimestampRefineBy>(),
                                )
                                ?.let {
                                    PruningRefineBy(
                                        publicAbsoluteRangedTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAllHistoryRefineBy>())?.let {
                                PruningRefineBy(publicAllHistory = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())?.let {
                                PruningRefineBy(publicTimePointOperation = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())?.let {
                                PruningRefineBy(publicRangedTimeOperation = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> PruningRefineBy(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<PruningRefineBy>(PruningRefineBy::class) {

            override fun serialize(
                value: PruningRefineBy,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicNumOccurrences != null ->
                        generator.writeObject(value.publicNumOccurrences)
                    value.publicSetOccurrences != null ->
                        generator.writeObject(value.publicSetOccurrences)
                    value.publicRelativeComparativeTimestamp != null ->
                        generator.writeObject(value.publicRelativeComparativeTimestamp)
                    value.publicRelativeRangedTimestamp != null ->
                        generator.writeObject(value.publicRelativeRangedTimestamp)
                    value.publicAbsoluteComparativeTimestamp != null ->
                        generator.writeObject(value.publicAbsoluteComparativeTimestamp)
                    value.publicAbsoluteRangedTimestamp != null ->
                        generator.writeObject(value.publicAbsoluteRangedTimestamp)
                    value.publicAllHistory != null -> generator.writeObject(value.publicAllHistory)
                    value.publicTimePointOperation != null ->
                        generator.writeObject(value.publicTimePointOperation)
                    value.publicRangedTimeOperation != null ->
                        generator.writeObject(value.publicRangedTimeOperation)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PruningRefineBy")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailEventFilter &&
            appId == other.appId &&
            emailId == other.emailId &&
            filterType == other.filterType &&
            level == other.level &&
            operator == other.operator &&
            clickUrl == other.clickUrl &&
            pruningRefineBy == other.pruningRefineBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            appId,
            emailId,
            filterType,
            level,
            operator,
            clickUrl,
            pruningRefineBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailEventFilter{appId=$appId, emailId=$emailId, filterType=$filterType, level=$level, operator=$operator, clickUrl=$clickUrl, pruningRefineBy=$pruningRefineBy, additionalProperties=$additionalProperties}"
}
