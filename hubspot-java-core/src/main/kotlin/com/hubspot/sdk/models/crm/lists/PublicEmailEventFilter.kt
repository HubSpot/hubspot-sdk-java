// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
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
         * `PruningRefineBy.ofNumOccurrences(numOccurrences)`.
         */
        fun pruningRefineBy(numOccurrences: PublicNumOccurrencesRefineBy) =
            pruningRefineBy(PruningRefineBy.ofNumOccurrences(numOccurrences))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofSetOccurrences(setOccurrences)`.
         */
        fun pruningRefineBy(setOccurrences: PublicSetOccurrencesRefineBy) =
            pruningRefineBy(PruningRefineBy.ofSetOccurrences(setOccurrences))

        /**
         * Alias for calling [pruningRefineBy] with the following:
         * ```java
         * PublicSetOccurrencesRefineBy.builder()
         *     .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
         *     .setType(setType)
         *     .build()
         * ```
         */
        fun setOccurrencesPruningRefineBy(setType: String) =
            pruningRefineBy(
                PublicSetOccurrencesRefineBy.builder()
                    .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
                    .setType(setType)
                    .build()
            )

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofRelativeComparative(relativeComparative)`.
         */
        fun pruningRefineBy(relativeComparative: PublicRelativeComparativeTimestampRefineBy) =
            pruningRefineBy(PruningRefineBy.ofRelativeComparative(relativeComparative))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofRelativeRanged(relativeRanged)`.
         */
        fun pruningRefineBy(relativeRanged: PublicRelativeRangedTimestampRefineBy) =
            pruningRefineBy(PruningRefineBy.ofRelativeRanged(relativeRanged))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofAbsoluteComparative(absoluteComparative)`.
         */
        fun pruningRefineBy(absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy) =
            pruningRefineBy(PruningRefineBy.ofAbsoluteComparative(absoluteComparative))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofAbsoluteRanged(absoluteRanged)`.
         */
        fun pruningRefineBy(absoluteRanged: PublicAbsoluteRangedTimestampRefineBy) =
            pruningRefineBy(PruningRefineBy.ofAbsoluteRanged(absoluteRanged))

        /** Alias for calling [pruningRefineBy] with `PruningRefineBy.ofAllHistory(allHistory)`. */
        fun pruningRefineBy(allHistory: PublicAllHistoryRefineBy) =
            pruningRefineBy(PruningRefineBy.ofAllHistory(allHistory))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofPublicTimePointOperation(publicTimePointOperation)`.
         */
        fun pruningRefineBy(publicTimePointOperation: PublicTimePointOperation) =
            pruningRefineBy(PruningRefineBy.ofPublicTimePointOperation(publicTimePointOperation))

        /** Alias for calling [pruningRefineBy] with `PruningRefineBy.ofTimeRanged(timeRanged)`. */
        fun pruningRefineBy(timeRanged: PublicRangedTimeOperation) =
            pruningRefineBy(PruningRefineBy.ofTimeRanged(timeRanged))

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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
        private val numOccurrences: PublicNumOccurrencesRefineBy? = null,
        private val setOccurrences: PublicSetOccurrencesRefineBy? = null,
        private val relativeComparative: PublicRelativeComparativeTimestampRefineBy? = null,
        private val relativeRanged: PublicRelativeRangedTimestampRefineBy? = null,
        private val absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy? = null,
        private val absoluteRanged: PublicAbsoluteRangedTimestampRefineBy? = null,
        private val allHistory: PublicAllHistoryRefineBy? = null,
        private val publicTimePointOperation: PublicTimePointOperation? = null,
        private val timeRanged: PublicRangedTimeOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun numOccurrences(): Optional<PublicNumOccurrencesRefineBy> =
            Optional.ofNullable(numOccurrences)

        fun setOccurrences(): Optional<PublicSetOccurrencesRefineBy> =
            Optional.ofNullable(setOccurrences)

        fun relativeComparative(): Optional<PublicRelativeComparativeTimestampRefineBy> =
            Optional.ofNullable(relativeComparative)

        fun relativeRanged(): Optional<PublicRelativeRangedTimestampRefineBy> =
            Optional.ofNullable(relativeRanged)

        fun absoluteComparative(): Optional<PublicAbsoluteComparativeTimestampRefineBy> =
            Optional.ofNullable(absoluteComparative)

        fun absoluteRanged(): Optional<PublicAbsoluteRangedTimestampRefineBy> =
            Optional.ofNullable(absoluteRanged)

        fun allHistory(): Optional<PublicAllHistoryRefineBy> = Optional.ofNullable(allHistory)

        fun publicTimePointOperation(): Optional<PublicTimePointOperation> =
            Optional.ofNullable(publicTimePointOperation)

        fun timeRanged(): Optional<PublicRangedTimeOperation> = Optional.ofNullable(timeRanged)

        fun isNumOccurrences(): Boolean = numOccurrences != null

        fun isSetOccurrences(): Boolean = setOccurrences != null

        fun isRelativeComparative(): Boolean = relativeComparative != null

        fun isRelativeRanged(): Boolean = relativeRanged != null

        fun isAbsoluteComparative(): Boolean = absoluteComparative != null

        fun isAbsoluteRanged(): Boolean = absoluteRanged != null

        fun isAllHistory(): Boolean = allHistory != null

        fun isPublicTimePointOperation(): Boolean = publicTimePointOperation != null

        fun isTimeRanged(): Boolean = timeRanged != null

        fun asNumOccurrences(): PublicNumOccurrencesRefineBy =
            numOccurrences.getOrThrow("numOccurrences")

        fun asSetOccurrences(): PublicSetOccurrencesRefineBy =
            setOccurrences.getOrThrow("setOccurrences")

        fun asRelativeComparative(): PublicRelativeComparativeTimestampRefineBy =
            relativeComparative.getOrThrow("relativeComparative")

        fun asRelativeRanged(): PublicRelativeRangedTimestampRefineBy =
            relativeRanged.getOrThrow("relativeRanged")

        fun asAbsoluteComparative(): PublicAbsoluteComparativeTimestampRefineBy =
            absoluteComparative.getOrThrow("absoluteComparative")

        fun asAbsoluteRanged(): PublicAbsoluteRangedTimestampRefineBy =
            absoluteRanged.getOrThrow("absoluteRanged")

        fun asAllHistory(): PublicAllHistoryRefineBy = allHistory.getOrThrow("allHistory")

        fun asPublicTimePointOperation(): PublicTimePointOperation =
            publicTimePointOperation.getOrThrow("publicTimePointOperation")

        fun asTimeRanged(): PublicRangedTimeOperation = timeRanged.getOrThrow("timeRanged")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.hubspot.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = pruningRefineBy.accept(new PruningRefineBy.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNumOccurrences(PublicNumOccurrencesRefineBy numOccurrences) {
         *         return Optional.of(numOccurrences.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws HubSpotInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                numOccurrences != null -> visitor.visitNumOccurrences(numOccurrences)
                setOccurrences != null -> visitor.visitSetOccurrences(setOccurrences)
                relativeComparative != null -> visitor.visitRelativeComparative(relativeComparative)
                relativeRanged != null -> visitor.visitRelativeRanged(relativeRanged)
                absoluteComparative != null -> visitor.visitAbsoluteComparative(absoluteComparative)
                absoluteRanged != null -> visitor.visitAbsoluteRanged(absoluteRanged)
                allHistory != null -> visitor.visitAllHistory(allHistory)
                publicTimePointOperation != null ->
                    visitor.visitPublicTimePointOperation(publicTimePointOperation)
                timeRanged != null -> visitor.visitTimeRanged(timeRanged)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PruningRefineBy = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumOccurrences(numOccurrences: PublicNumOccurrencesRefineBy) {
                        numOccurrences.validate()
                    }

                    override fun visitSetOccurrences(setOccurrences: PublicSetOccurrencesRefineBy) {
                        setOccurrences.validate()
                    }

                    override fun visitRelativeComparative(
                        relativeComparative: PublicRelativeComparativeTimestampRefineBy
                    ) {
                        relativeComparative.validate()
                    }

                    override fun visitRelativeRanged(
                        relativeRanged: PublicRelativeRangedTimestampRefineBy
                    ) {
                        relativeRanged.validate()
                    }

                    override fun visitAbsoluteComparative(
                        absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy
                    ) {
                        absoluteComparative.validate()
                    }

                    override fun visitAbsoluteRanged(
                        absoluteRanged: PublicAbsoluteRangedTimestampRefineBy
                    ) {
                        absoluteRanged.validate()
                    }

                    override fun visitAllHistory(allHistory: PublicAllHistoryRefineBy) {
                        allHistory.validate()
                    }

                    override fun visitPublicTimePointOperation(
                        publicTimePointOperation: PublicTimePointOperation
                    ) {
                        publicTimePointOperation.validate()
                    }

                    override fun visitTimeRanged(timeRanged: PublicRangedTimeOperation) {
                        timeRanged.validate()
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
                    override fun visitNumOccurrences(numOccurrences: PublicNumOccurrencesRefineBy) =
                        numOccurrences.validity()

                    override fun visitSetOccurrences(setOccurrences: PublicSetOccurrencesRefineBy) =
                        setOccurrences.validity()

                    override fun visitRelativeComparative(
                        relativeComparative: PublicRelativeComparativeTimestampRefineBy
                    ) = relativeComparative.validity()

                    override fun visitRelativeRanged(
                        relativeRanged: PublicRelativeRangedTimestampRefineBy
                    ) = relativeRanged.validity()

                    override fun visitAbsoluteComparative(
                        absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy
                    ) = absoluteComparative.validity()

                    override fun visitAbsoluteRanged(
                        absoluteRanged: PublicAbsoluteRangedTimestampRefineBy
                    ) = absoluteRanged.validity()

                    override fun visitAllHistory(allHistory: PublicAllHistoryRefineBy) =
                        allHistory.validity()

                    override fun visitPublicTimePointOperation(
                        publicTimePointOperation: PublicTimePointOperation
                    ) = publicTimePointOperation.validity()

                    override fun visitTimeRanged(timeRanged: PublicRangedTimeOperation) =
                        timeRanged.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PruningRefineBy &&
                numOccurrences == other.numOccurrences &&
                setOccurrences == other.setOccurrences &&
                relativeComparative == other.relativeComparative &&
                relativeRanged == other.relativeRanged &&
                absoluteComparative == other.absoluteComparative &&
                absoluteRanged == other.absoluteRanged &&
                allHistory == other.allHistory &&
                publicTimePointOperation == other.publicTimePointOperation &&
                timeRanged == other.timeRanged
        }

        override fun hashCode(): Int =
            Objects.hash(
                numOccurrences,
                setOccurrences,
                relativeComparative,
                relativeRanged,
                absoluteComparative,
                absoluteRanged,
                allHistory,
                publicTimePointOperation,
                timeRanged,
            )

        override fun toString(): String =
            when {
                numOccurrences != null -> "PruningRefineBy{numOccurrences=$numOccurrences}"
                setOccurrences != null -> "PruningRefineBy{setOccurrences=$setOccurrences}"
                relativeComparative != null ->
                    "PruningRefineBy{relativeComparative=$relativeComparative}"
                relativeRanged != null -> "PruningRefineBy{relativeRanged=$relativeRanged}"
                absoluteComparative != null ->
                    "PruningRefineBy{absoluteComparative=$absoluteComparative}"
                absoluteRanged != null -> "PruningRefineBy{absoluteRanged=$absoluteRanged}"
                allHistory != null -> "PruningRefineBy{allHistory=$allHistory}"
                publicTimePointOperation != null ->
                    "PruningRefineBy{publicTimePointOperation=$publicTimePointOperation}"
                timeRanged != null -> "PruningRefineBy{timeRanged=$timeRanged}"
                _json != null -> "PruningRefineBy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PruningRefineBy")
            }

        companion object {

            @JvmStatic
            fun ofNumOccurrences(numOccurrences: PublicNumOccurrencesRefineBy) =
                PruningRefineBy(numOccurrences = numOccurrences)

            @JvmStatic
            fun ofSetOccurrences(setOccurrences: PublicSetOccurrencesRefineBy) =
                PruningRefineBy(setOccurrences = setOccurrences)

            @JvmStatic
            fun ofRelativeComparative(
                relativeComparative: PublicRelativeComparativeTimestampRefineBy
            ) = PruningRefineBy(relativeComparative = relativeComparative)

            @JvmStatic
            fun ofRelativeRanged(relativeRanged: PublicRelativeRangedTimestampRefineBy) =
                PruningRefineBy(relativeRanged = relativeRanged)

            @JvmStatic
            fun ofAbsoluteComparative(
                absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy
            ) = PruningRefineBy(absoluteComparative = absoluteComparative)

            @JvmStatic
            fun ofAbsoluteRanged(absoluteRanged: PublicAbsoluteRangedTimestampRefineBy) =
                PruningRefineBy(absoluteRanged = absoluteRanged)

            @JvmStatic
            fun ofAllHistory(allHistory: PublicAllHistoryRefineBy) =
                PruningRefineBy(allHistory = allHistory)

            @JvmStatic
            fun ofPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation) =
                PruningRefineBy(publicTimePointOperation = publicTimePointOperation)

            @JvmStatic
            fun ofTimeRanged(timeRanged: PublicRangedTimeOperation) =
                PruningRefineBy(timeRanged = timeRanged)
        }

        /**
         * An interface that defines how to map each variant of [PruningRefineBy] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNumOccurrences(numOccurrences: PublicNumOccurrencesRefineBy): T

            fun visitSetOccurrences(setOccurrences: PublicSetOccurrencesRefineBy): T

            fun visitRelativeComparative(
                relativeComparative: PublicRelativeComparativeTimestampRefineBy
            ): T

            fun visitRelativeRanged(relativeRanged: PublicRelativeRangedTimestampRefineBy): T

            fun visitAbsoluteComparative(
                absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy
            ): T

            fun visitAbsoluteRanged(absoluteRanged: PublicAbsoluteRangedTimestampRefineBy): T

            fun visitAllHistory(allHistory: PublicAllHistoryRefineBy): T

            fun visitPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation): T

            fun visitTimeRanged(timeRanged: PublicRangedTimeOperation): T

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
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "NUM_OCCURRENCES" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNumOccurrencesRefineBy>())
                            ?.let { PruningRefineBy(numOccurrences = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                    "SET_OCCURRENCES" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicSetOccurrencesRefineBy>())
                            ?.let { PruningRefineBy(setOccurrences = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                    "RELATIVE_COMPARATIVE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRelativeComparativeTimestampRefineBy>(),
                            )
                            ?.let { PruningRefineBy(relativeComparative = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                    "RELATIVE_RANGED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRelativeRangedTimestampRefineBy>(),
                            )
                            ?.let { PruningRefineBy(relativeRanged = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                    "ABSOLUTE_COMPARATIVE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicAbsoluteComparativeTimestampRefineBy>(),
                            )
                            ?.let { PruningRefineBy(absoluteComparative = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                    "ABSOLUTE_RANGED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicAbsoluteRangedTimestampRefineBy>(),
                            )
                            ?.let { PruningRefineBy(absoluteRanged = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                    "ALL_HISTORY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAllHistoryRefineBy>())
                            ?.let { PruningRefineBy(allHistory = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                    "TIME_RANGED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())
                            ?.let { PruningRefineBy(timeRanged = it, _json = json) }
                            ?: PruningRefineBy(_json = json)
                    }
                }

                return tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())?.let {
                    PruningRefineBy(publicTimePointOperation = it, _json = json)
                } ?: PruningRefineBy(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<PruningRefineBy>(PruningRefineBy::class) {

            override fun serialize(
                value: PruningRefineBy,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.numOccurrences != null -> generator.writeObject(value.numOccurrences)
                    value.setOccurrences != null -> generator.writeObject(value.setOccurrences)
                    value.relativeComparative != null ->
                        generator.writeObject(value.relativeComparative)
                    value.relativeRanged != null -> generator.writeObject(value.relativeRanged)
                    value.absoluteComparative != null ->
                        generator.writeObject(value.absoluteComparative)
                    value.absoluteRanged != null -> generator.writeObject(value.absoluteRanged)
                    value.allHistory != null -> generator.writeObject(value.allHistory)
                    value.publicTimePointOperation != null ->
                        generator.writeObject(value.publicTimePointOperation)
                    value.timeRanged != null -> generator.writeObject(value.timeRanged)
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
