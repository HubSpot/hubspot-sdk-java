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
import com.hubspot.sdk.core.allMaxBy
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicEventAnalyticsFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventId: JsonField<String>,
    private val filterType: JsonField<FilterType>,
    private val operator: JsonField<String>,
    private val coalescingRefineBy: JsonField<CoalescingRefineBy>,
    private val pruningRefineBy: JsonField<PruningRefineBy>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eventId") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("coalescingRefineBy")
        @ExcludeMissing
        coalescingRefineBy: JsonField<CoalescingRefineBy> = JsonMissing.of(),
        @JsonProperty("pruningRefineBy")
        @ExcludeMissing
        pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of(),
    ) : this(eventId, filterType, operator, coalescingRefineBy, pruningRefineBy, mutableMapOf())

    /**
     * The ID of the event to be used in the filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventId(): String = eventId.getRequired("eventId")

    /**
     * Indicates the type of filter being applied (EVENT).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * Defines the operation to be applied within the event filter (HAS_EVENT, NOT_HAS_EVENT).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * Specifies the criteria for refining the event filter by coalescing.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coalescingRefineBy(): Optional<CoalescingRefineBy> =
        coalescingRefineBy.getOptional("coalescingRefineBy")

    /**
     * Specifies the criteria for refining the event filter by pruning.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pruningRefineBy(): Optional<PruningRefineBy> =
        pruningRefineBy.getOptional("pruningRefineBy")

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterType")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [coalescingRefineBy].
     *
     * Unlike [coalescingRefineBy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("coalescingRefineBy")
    @ExcludeMissing
    fun _coalescingRefineBy(): JsonField<CoalescingRefineBy> = coalescingRefineBy

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
         * Returns a mutable builder for constructing an instance of [PublicEventAnalyticsFilter].
         *
         * The following fields are required:
         * ```java
         * .eventId()
         * .filterType()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEventAnalyticsFilter]. */
    class Builder internal constructor() {

        private var eventId: JsonField<String>? = null
        private var filterType: JsonField<FilterType>? = null
        private var operator: JsonField<String>? = null
        private var coalescingRefineBy: JsonField<CoalescingRefineBy> = JsonMissing.of()
        private var pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEventAnalyticsFilter: PublicEventAnalyticsFilter) = apply {
            eventId = publicEventAnalyticsFilter.eventId
            filterType = publicEventAnalyticsFilter.filterType
            operator = publicEventAnalyticsFilter.operator
            coalescingRefineBy = publicEventAnalyticsFilter.coalescingRefineBy
            pruningRefineBy = publicEventAnalyticsFilter.pruningRefineBy
            additionalProperties = publicEventAnalyticsFilter.additionalProperties.toMutableMap()
        }

        /** The ID of the event to be used in the filter. */
        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /** Indicates the type of filter being applied (EVENT). */
        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        /**
         * Defines the operation to be applied within the event filter (HAS_EVENT, NOT_HAS_EVENT).
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** Specifies the criteria for refining the event filter by coalescing. */
        fun coalescingRefineBy(coalescingRefineBy: CoalescingRefineBy) =
            coalescingRefineBy(JsonField.of(coalescingRefineBy))

        /**
         * Sets [Builder.coalescingRefineBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coalescingRefineBy] with a well-typed
         * [CoalescingRefineBy] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun coalescingRefineBy(coalescingRefineBy: JsonField<CoalescingRefineBy>) = apply {
            this.coalescingRefineBy = coalescingRefineBy
        }

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicNumOccurrences(publicNumOccurrences)`.
         */
        fun coalescingRefineBy(publicNumOccurrences: PublicNumOccurrencesRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofPublicNumOccurrences(publicNumOccurrences))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicSetOccurrences(publicSetOccurrences)`.
         */
        fun coalescingRefineBy(publicSetOccurrences: PublicSetOccurrencesRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofPublicSetOccurrences(publicSetOccurrences))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicRelativeComparativeTimestamp(publicRelativeComparativeTimestamp)`.
         */
        fun coalescingRefineBy(
            publicRelativeComparativeTimestamp: PublicRelativeComparativeTimestampRefineBy
        ) =
            coalescingRefineBy(
                CoalescingRefineBy.ofPublicRelativeComparativeTimestamp(
                    publicRelativeComparativeTimestamp
                )
            )

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicRelativeRangedTimestamp(publicRelativeRangedTimestamp)`.
         */
        fun coalescingRefineBy(
            publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy
        ) =
            coalescingRefineBy(
                CoalescingRefineBy.ofPublicRelativeRangedTimestamp(publicRelativeRangedTimestamp)
            )

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicAbsoluteComparativeTimestamp(publicAbsoluteComparativeTimestamp)`.
         */
        fun coalescingRefineBy(
            publicAbsoluteComparativeTimestamp: PublicAbsoluteComparativeTimestampRefineBy
        ) =
            coalescingRefineBy(
                CoalescingRefineBy.ofPublicAbsoluteComparativeTimestamp(
                    publicAbsoluteComparativeTimestamp
                )
            )

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicAbsoluteRangedTimestamp(publicAbsoluteRangedTimestamp)`.
         */
        fun coalescingRefineBy(
            publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy
        ) =
            coalescingRefineBy(
                CoalescingRefineBy.ofPublicAbsoluteRangedTimestamp(publicAbsoluteRangedTimestamp)
            )

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicAllHistory(publicAllHistory)`.
         */
        fun coalescingRefineBy(publicAllHistory: PublicAllHistoryRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofPublicAllHistory(publicAllHistory))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicTimePointOperation(publicTimePointOperation)`.
         */
        fun coalescingRefineBy(publicTimePointOperation: PublicTimePointOperation) =
            coalescingRefineBy(
                CoalescingRefineBy.ofPublicTimePointOperation(publicTimePointOperation)
            )

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofPublicRangedTimeOperation(publicRangedTimeOperation)`.
         */
        fun coalescingRefineBy(publicRangedTimeOperation: PublicRangedTimeOperation) =
            coalescingRefineBy(
                CoalescingRefineBy.ofPublicRangedTimeOperation(publicRangedTimeOperation)
            )

        /** Specifies the criteria for refining the event filter by pruning. */
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
         * Returns an immutable instance of [PublicEventAnalyticsFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventId()
         * .filterType()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicEventAnalyticsFilter =
            PublicEventAnalyticsFilter(
                checkRequired("eventId", eventId),
                checkRequired("filterType", filterType),
                checkRequired("operator", operator),
                coalescingRefineBy,
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
    fun validate(): PublicEventAnalyticsFilter = apply {
        if (validated) {
            return@apply
        }

        eventId()
        filterType().validate()
        operator()
        coalescingRefineBy().ifPresent { it.validate() }
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
        (if (eventId.asKnown().isPresent) 1 else 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (coalescingRefineBy.asKnown().getOrNull()?.validity() ?: 0) +
            (pruningRefineBy.asKnown().getOrNull()?.validity() ?: 0)

    /** Indicates the type of filter being applied (EVENT). */
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

            @JvmField val EVENT = of("EVENT")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            EVENT
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
            EVENT,
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
                EVENT -> Value.EVENT
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
                EVENT -> Known.EVENT
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

    /** Specifies the criteria for refining the event filter by coalescing. */
    @JsonDeserialize(using = CoalescingRefineBy.Deserializer::class)
    @JsonSerialize(using = CoalescingRefineBy.Serializer::class)
    class CoalescingRefineBy
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
         * Optional<String> result = coalescingRefineBy.accept(new CoalescingRefineBy.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitPublicNumOccurrences(PublicNumOccurrencesRefineBy publicNumOccurrences) {
         *         return Optional.of(publicNumOccurrences.toString());
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CoalescingRefineBy = apply {
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

            return other is CoalescingRefineBy &&
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
                    "CoalescingRefineBy{publicNumOccurrences=$publicNumOccurrences}"
                publicSetOccurrences != null ->
                    "CoalescingRefineBy{publicSetOccurrences=$publicSetOccurrences}"
                publicRelativeComparativeTimestamp != null ->
                    "CoalescingRefineBy{publicRelativeComparativeTimestamp=$publicRelativeComparativeTimestamp}"
                publicRelativeRangedTimestamp != null ->
                    "CoalescingRefineBy{publicRelativeRangedTimestamp=$publicRelativeRangedTimestamp}"
                publicAbsoluteComparativeTimestamp != null ->
                    "CoalescingRefineBy{publicAbsoluteComparativeTimestamp=$publicAbsoluteComparativeTimestamp}"
                publicAbsoluteRangedTimestamp != null ->
                    "CoalescingRefineBy{publicAbsoluteRangedTimestamp=$publicAbsoluteRangedTimestamp}"
                publicAllHistory != null -> "CoalescingRefineBy{publicAllHistory=$publicAllHistory}"
                publicTimePointOperation != null ->
                    "CoalescingRefineBy{publicTimePointOperation=$publicTimePointOperation}"
                publicRangedTimeOperation != null ->
                    "CoalescingRefineBy{publicRangedTimeOperation=$publicRangedTimeOperation}"
                _json != null -> "CoalescingRefineBy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CoalescingRefineBy")
            }

        companion object {

            @JvmStatic
            fun ofPublicNumOccurrences(publicNumOccurrences: PublicNumOccurrencesRefineBy) =
                CoalescingRefineBy(publicNumOccurrences = publicNumOccurrences)

            @JvmStatic
            fun ofPublicSetOccurrences(publicSetOccurrences: PublicSetOccurrencesRefineBy) =
                CoalescingRefineBy(publicSetOccurrences = publicSetOccurrences)

            @JvmStatic
            fun ofPublicRelativeComparativeTimestamp(
                publicRelativeComparativeTimestamp: PublicRelativeComparativeTimestampRefineBy
            ) =
                CoalescingRefineBy(
                    publicRelativeComparativeTimestamp = publicRelativeComparativeTimestamp
                )

            @JvmStatic
            fun ofPublicRelativeRangedTimestamp(
                publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy
            ) = CoalescingRefineBy(publicRelativeRangedTimestamp = publicRelativeRangedTimestamp)

            @JvmStatic
            fun ofPublicAbsoluteComparativeTimestamp(
                publicAbsoluteComparativeTimestamp: PublicAbsoluteComparativeTimestampRefineBy
            ) =
                CoalescingRefineBy(
                    publicAbsoluteComparativeTimestamp = publicAbsoluteComparativeTimestamp
                )

            @JvmStatic
            fun ofPublicAbsoluteRangedTimestamp(
                publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy
            ) = CoalescingRefineBy(publicAbsoluteRangedTimestamp = publicAbsoluteRangedTimestamp)

            @JvmStatic
            fun ofPublicAllHistory(publicAllHistory: PublicAllHistoryRefineBy) =
                CoalescingRefineBy(publicAllHistory = publicAllHistory)

            @JvmStatic
            fun ofPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation) =
                CoalescingRefineBy(publicTimePointOperation = publicTimePointOperation)

            @JvmStatic
            fun ofPublicRangedTimeOperation(publicRangedTimeOperation: PublicRangedTimeOperation) =
                CoalescingRefineBy(publicRangedTimeOperation = publicRangedTimeOperation)
        }

        /**
         * An interface that defines how to map each variant of [CoalescingRefineBy] to a value of
         * type [T].
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
             * Maps an unknown variant of [CoalescingRefineBy] to a value of type [T].
             *
             * An instance of [CoalescingRefineBy] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown CoalescingRefineBy: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<CoalescingRefineBy>(CoalescingRefineBy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CoalescingRefineBy {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicNumOccurrencesRefineBy>())
                                ?.let {
                                    CoalescingRefineBy(publicNumOccurrences = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicSetOccurrencesRefineBy>())
                                ?.let {
                                    CoalescingRefineBy(publicSetOccurrences = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRelativeComparativeTimestampRefineBy>(),
                                )
                                ?.let {
                                    CoalescingRefineBy(
                                        publicRelativeComparativeTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRelativeRangedTimestampRefineBy>(),
                                )
                                ?.let {
                                    CoalescingRefineBy(
                                        publicRelativeRangedTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicAbsoluteComparativeTimestampRefineBy>(),
                                )
                                ?.let {
                                    CoalescingRefineBy(
                                        publicAbsoluteComparativeTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicAbsoluteRangedTimestampRefineBy>(),
                                )
                                ?.let {
                                    CoalescingRefineBy(
                                        publicAbsoluteRangedTimestamp = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAllHistoryRefineBy>())?.let {
                                CoalescingRefineBy(publicAllHistory = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())?.let {
                                CoalescingRefineBy(publicTimePointOperation = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())?.let {
                                CoalescingRefineBy(publicRangedTimeOperation = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CoalescingRefineBy(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CoalescingRefineBy>(CoalescingRefineBy::class) {

            override fun serialize(
                value: CoalescingRefineBy,
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
                    else -> throw IllegalStateException("Invalid CoalescingRefineBy")
                }
            }
        }
    }

    /** Specifies the criteria for refining the event filter by pruning. */
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
         *     public Optional<String> visitPublicNumOccurrences(PublicNumOccurrencesRefineBy publicNumOccurrences) {
         *         return Optional.of(publicNumOccurrences.toString());
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

        return other is PublicEventAnalyticsFilter &&
            eventId == other.eventId &&
            filterType == other.filterType &&
            operator == other.operator &&
            coalescingRefineBy == other.coalescingRefineBy &&
            pruningRefineBy == other.pruningRefineBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventId,
            filterType,
            operator,
            coalescingRefineBy,
            pruningRefineBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEventAnalyticsFilter{eventId=$eventId, filterType=$filterType, operator=$operator, coalescingRefineBy=$coalescingRefineBy, pruningRefineBy=$pruningRefineBy, additionalProperties=$additionalProperties}"
}
