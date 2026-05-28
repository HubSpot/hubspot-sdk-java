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

class PublicAssociationInListFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationCategory: JsonField<String>,
    private val associationTypeId: JsonField<Int>,
    private val coalescingRefineBy: JsonField<CoalescingRefineBy>,
    private val filterType: JsonField<FilterType>,
    private val listId: JsonField<String>,
    private val operator: JsonField<String>,
    private val toObjectType: JsonField<String>,
    private val toObjectTypeId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationCategory")
        @ExcludeMissing
        associationCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("associationTypeId")
        @ExcludeMissing
        associationTypeId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("coalescingRefineBy")
        @ExcludeMissing
        coalescingRefineBy: JsonField<CoalescingRefineBy> = JsonMissing.of(),
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toObjectType")
        @ExcludeMissing
        toObjectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toObjectTypeId")
        @ExcludeMissing
        toObjectTypeId: JsonField<String> = JsonMissing.of(),
    ) : this(
        associationCategory,
        associationTypeId,
        coalescingRefineBy,
        filterType,
        listId,
        operator,
        toObjectType,
        toObjectTypeId,
        mutableMapOf(),
    )

    /**
     * Defines the category of the association, such as (HUBSPOT_DEFINED, USER_DEFINED,
     * INTEGRATOR_DEFINED, WORK).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationCategory(): String = associationCategory.getRequired("associationCategory")

    /**
     * The ID representing the type of association being filtered.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypeId(): Int = associationTypeId.getRequired("associationTypeId")

    /**
     * Specifies the criteria for refining the association filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun coalescingRefineBy(): CoalescingRefineBy =
        coalescingRefineBy.getRequired("coalescingRefineBy")

    /**
     * Indicates the type of filter being applied, which is 'ASSOCIATION' by default.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * The ID of the list used in the association filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * Specifies the operation to be performed by the filter, such as 'IN_LIST' or 'NOT_IN_LIST'.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * The type of object that the association filter is targeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toObjectType(): Optional<String> = toObjectType.getOptional("toObjectType")

    /**
     * The ID representing the type of object that the association filter is targeting.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toObjectTypeId(): Optional<String> = toObjectTypeId.getOptional("toObjectTypeId")

    /**
     * Returns the raw JSON value of [associationCategory].
     *
     * Unlike [associationCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationCategory")
    @ExcludeMissing
    fun _associationCategory(): JsonField<String> = associationCategory

    /**
     * Returns the raw JSON value of [associationTypeId].
     *
     * Unlike [associationTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationTypeId")
    @ExcludeMissing
    fun _associationTypeId(): JsonField<Int> = associationTypeId

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
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterType")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [toObjectType].
     *
     * Unlike [toObjectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectType")
    @ExcludeMissing
    fun _toObjectType(): JsonField<String> = toObjectType

    /**
     * Returns the raw JSON value of [toObjectTypeId].
     *
     * Unlike [toObjectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toObjectTypeId")
    @ExcludeMissing
    fun _toObjectTypeId(): JsonField<String> = toObjectTypeId

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
         * [PublicAssociationInListFilter].
         *
         * The following fields are required:
         * ```java
         * .associationCategory()
         * .associationTypeId()
         * .coalescingRefineBy()
         * .filterType()
         * .listId()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicAssociationInListFilter]. */
    class Builder internal constructor() {

        private var associationCategory: JsonField<String>? = null
        private var associationTypeId: JsonField<Int>? = null
        private var coalescingRefineBy: JsonField<CoalescingRefineBy>? = null
        private var filterType: JsonField<FilterType>? = null
        private var listId: JsonField<String>? = null
        private var operator: JsonField<String>? = null
        private var toObjectType: JsonField<String> = JsonMissing.of()
        private var toObjectTypeId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicAssociationInListFilter: PublicAssociationInListFilter) = apply {
            associationCategory = publicAssociationInListFilter.associationCategory
            associationTypeId = publicAssociationInListFilter.associationTypeId
            coalescingRefineBy = publicAssociationInListFilter.coalescingRefineBy
            filterType = publicAssociationInListFilter.filterType
            listId = publicAssociationInListFilter.listId
            operator = publicAssociationInListFilter.operator
            toObjectType = publicAssociationInListFilter.toObjectType
            toObjectTypeId = publicAssociationInListFilter.toObjectTypeId
            additionalProperties = publicAssociationInListFilter.additionalProperties.toMutableMap()
        }

        /**
         * Defines the category of the association, such as (HUBSPOT_DEFINED, USER_DEFINED,
         * INTEGRATOR_DEFINED, WORK).
         */
        fun associationCategory(associationCategory: String) =
            associationCategory(JsonField.of(associationCategory))

        /**
         * Sets [Builder.associationCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationCategory] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associationCategory(associationCategory: JsonField<String>) = apply {
            this.associationCategory = associationCategory
        }

        /** The ID representing the type of association being filtered. */
        fun associationTypeId(associationTypeId: Int) =
            associationTypeId(JsonField.of(associationTypeId))

        /**
         * Sets [Builder.associationTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationTypeId] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associationTypeId(associationTypeId: JsonField<Int>) = apply {
            this.associationTypeId = associationTypeId
        }

        /** Specifies the criteria for refining the association filter. */
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
         * `CoalescingRefineBy.ofNumOccurrences(numOccurrences)`.
         */
        fun coalescingRefineBy(numOccurrences: PublicNumOccurrencesRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofNumOccurrences(numOccurrences))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofSetOccurrences(setOccurrences)`.
         */
        fun coalescingRefineBy(setOccurrences: PublicSetOccurrencesRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofSetOccurrences(setOccurrences))

        /**
         * Alias for calling [coalescingRefineBy] with the following:
         * ```java
         * PublicSetOccurrencesRefineBy.builder()
         *     .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
         *     .setType(setType)
         *     .build()
         * ```
         */
        fun setOccurrencesCoalescingRefineBy(setType: String) =
            coalescingRefineBy(
                PublicSetOccurrencesRefineBy.builder()
                    .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
                    .setType(setType)
                    .build()
            )

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofRelativeComparative(relativeComparative)`.
         */
        fun coalescingRefineBy(relativeComparative: PublicRelativeComparativeTimestampRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofRelativeComparative(relativeComparative))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofRelativeRanged(relativeRanged)`.
         */
        fun coalescingRefineBy(relativeRanged: PublicRelativeRangedTimestampRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofRelativeRanged(relativeRanged))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofAbsoluteComparative(absoluteComparative)`.
         */
        fun coalescingRefineBy(absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofAbsoluteComparative(absoluteComparative))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofAbsoluteRanged(absoluteRanged)`.
         */
        fun coalescingRefineBy(absoluteRanged: PublicAbsoluteRangedTimestampRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofAbsoluteRanged(absoluteRanged))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofAllHistory(allHistory)`.
         */
        fun coalescingRefineBy(allHistory: PublicAllHistoryRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofAllHistory(allHistory))

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
         * `CoalescingRefineBy.ofTimeRanged(timeRanged)`.
         */
        fun coalescingRefineBy(timeRanged: PublicRangedTimeOperation) =
            coalescingRefineBy(CoalescingRefineBy.ofTimeRanged(timeRanged))

        /** Indicates the type of filter being applied, which is 'ASSOCIATION' by default. */
        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        /** The ID of the list used in the association filter. */
        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        /**
         * Specifies the operation to be performed by the filter, such as 'IN_LIST' or
         * 'NOT_IN_LIST'.
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** The type of object that the association filter is targeting. */
        fun toObjectType(toObjectType: String) = toObjectType(JsonField.of(toObjectType))

        /**
         * Sets [Builder.toObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toObjectType(toObjectType: JsonField<String>) = apply {
            this.toObjectType = toObjectType
        }

        /** The ID representing the type of object that the association filter is targeting. */
        fun toObjectTypeId(toObjectTypeId: String) = toObjectTypeId(JsonField.of(toObjectTypeId))

        /**
         * Sets [Builder.toObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toObjectTypeId(toObjectTypeId: JsonField<String>) = apply {
            this.toObjectTypeId = toObjectTypeId
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
         * Returns an immutable instance of [PublicAssociationInListFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationCategory()
         * .associationTypeId()
         * .coalescingRefineBy()
         * .filterType()
         * .listId()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicAssociationInListFilter =
            PublicAssociationInListFilter(
                checkRequired("associationCategory", associationCategory),
                checkRequired("associationTypeId", associationTypeId),
                checkRequired("coalescingRefineBy", coalescingRefineBy),
                checkRequired("filterType", filterType),
                checkRequired("listId", listId),
                checkRequired("operator", operator),
                toObjectType,
                toObjectTypeId,
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
    fun validate(): PublicAssociationInListFilter = apply {
        if (validated) {
            return@apply
        }

        associationCategory()
        associationTypeId()
        coalescingRefineBy().validate()
        filterType().validate()
        listId()
        operator()
        toObjectType()
        toObjectTypeId()
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
        (if (associationCategory.asKnown().isPresent) 1 else 0) +
            (if (associationTypeId.asKnown().isPresent) 1 else 0) +
            (coalescingRefineBy.asKnown().getOrNull()?.validity() ?: 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (listId.asKnown().isPresent) 1 else 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (toObjectType.asKnown().isPresent) 1 else 0) +
            (if (toObjectTypeId.asKnown().isPresent) 1 else 0)

    /** Specifies the criteria for refining the association filter. */
    @JsonDeserialize(using = CoalescingRefineBy.Deserializer::class)
    @JsonSerialize(using = CoalescingRefineBy.Serializer::class)
    class CoalescingRefineBy
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
         * Optional<String> result = coalescingRefineBy.accept(new CoalescingRefineBy.Visitor<Optional<String>>() {
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
        fun validate(): CoalescingRefineBy = apply {
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

            return other is CoalescingRefineBy &&
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
                numOccurrences != null -> "CoalescingRefineBy{numOccurrences=$numOccurrences}"
                setOccurrences != null -> "CoalescingRefineBy{setOccurrences=$setOccurrences}"
                relativeComparative != null ->
                    "CoalescingRefineBy{relativeComparative=$relativeComparative}"
                relativeRanged != null -> "CoalescingRefineBy{relativeRanged=$relativeRanged}"
                absoluteComparative != null ->
                    "CoalescingRefineBy{absoluteComparative=$absoluteComparative}"
                absoluteRanged != null -> "CoalescingRefineBy{absoluteRanged=$absoluteRanged}"
                allHistory != null -> "CoalescingRefineBy{allHistory=$allHistory}"
                publicTimePointOperation != null ->
                    "CoalescingRefineBy{publicTimePointOperation=$publicTimePointOperation}"
                timeRanged != null -> "CoalescingRefineBy{timeRanged=$timeRanged}"
                _json != null -> "CoalescingRefineBy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CoalescingRefineBy")
            }

        companion object {

            @JvmStatic
            fun ofNumOccurrences(numOccurrences: PublicNumOccurrencesRefineBy) =
                CoalescingRefineBy(numOccurrences = numOccurrences)

            @JvmStatic
            fun ofSetOccurrences(setOccurrences: PublicSetOccurrencesRefineBy) =
                CoalescingRefineBy(setOccurrences = setOccurrences)

            @JvmStatic
            fun ofRelativeComparative(
                relativeComparative: PublicRelativeComparativeTimestampRefineBy
            ) = CoalescingRefineBy(relativeComparative = relativeComparative)

            @JvmStatic
            fun ofRelativeRanged(relativeRanged: PublicRelativeRangedTimestampRefineBy) =
                CoalescingRefineBy(relativeRanged = relativeRanged)

            @JvmStatic
            fun ofAbsoluteComparative(
                absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy
            ) = CoalescingRefineBy(absoluteComparative = absoluteComparative)

            @JvmStatic
            fun ofAbsoluteRanged(absoluteRanged: PublicAbsoluteRangedTimestampRefineBy) =
                CoalescingRefineBy(absoluteRanged = absoluteRanged)

            @JvmStatic
            fun ofAllHistory(allHistory: PublicAllHistoryRefineBy) =
                CoalescingRefineBy(allHistory = allHistory)

            @JvmStatic
            fun ofPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation) =
                CoalescingRefineBy(publicTimePointOperation = publicTimePointOperation)

            @JvmStatic
            fun ofTimeRanged(timeRanged: PublicRangedTimeOperation) =
                CoalescingRefineBy(timeRanged = timeRanged)
        }

        /**
         * An interface that defines how to map each variant of [CoalescingRefineBy] to a value of
         * type [T].
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
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "NUM_OCCURRENCES" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNumOccurrencesRefineBy>())
                            ?.let { CoalescingRefineBy(numOccurrences = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                    "SET_OCCURRENCES" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicSetOccurrencesRefineBy>())
                            ?.let { CoalescingRefineBy(setOccurrences = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                    "RELATIVE_COMPARATIVE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRelativeComparativeTimestampRefineBy>(),
                            )
                            ?.let { CoalescingRefineBy(relativeComparative = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                    "RELATIVE_RANGED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRelativeRangedTimestampRefineBy>(),
                            )
                            ?.let { CoalescingRefineBy(relativeRanged = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                    "ABSOLUTE_COMPARATIVE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicAbsoluteComparativeTimestampRefineBy>(),
                            )
                            ?.let { CoalescingRefineBy(absoluteComparative = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                    "ABSOLUTE_RANGED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicAbsoluteRangedTimestampRefineBy>(),
                            )
                            ?.let { CoalescingRefineBy(absoluteRanged = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                    "ALL_HISTORY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAllHistoryRefineBy>())
                            ?.let { CoalescingRefineBy(allHistory = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                    "TIME_RANGED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())
                            ?.let { CoalescingRefineBy(timeRanged = it, _json = json) }
                            ?: CoalescingRefineBy(_json = json)
                    }
                }

                return tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())?.let {
                    CoalescingRefineBy(publicTimePointOperation = it, _json = json)
                } ?: CoalescingRefineBy(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<CoalescingRefineBy>(CoalescingRefineBy::class) {

            override fun serialize(
                value: CoalescingRefineBy,
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
                    else -> throw IllegalStateException("Invalid CoalescingRefineBy")
                }
            }
        }
    }

    /** Indicates the type of filter being applied, which is 'ASSOCIATION' by default. */
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

            @JvmField val ASSOCIATION = of("ASSOCIATION")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            ASSOCIATION
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
            ASSOCIATION,
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
                ASSOCIATION -> Value.ASSOCIATION
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
                ASSOCIATION -> Known.ASSOCIATION
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAssociationInListFilter &&
            associationCategory == other.associationCategory &&
            associationTypeId == other.associationTypeId &&
            coalescingRefineBy == other.coalescingRefineBy &&
            filterType == other.filterType &&
            listId == other.listId &&
            operator == other.operator &&
            toObjectType == other.toObjectType &&
            toObjectTypeId == other.toObjectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associationCategory,
            associationTypeId,
            coalescingRefineBy,
            filterType,
            listId,
            operator,
            toObjectType,
            toObjectTypeId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicAssociationInListFilter{associationCategory=$associationCategory, associationTypeId=$associationTypeId, coalescingRefineBy=$coalescingRefineBy, filterType=$filterType, listId=$listId, operator=$operator, toObjectType=$toObjectType, toObjectTypeId=$toObjectTypeId, additionalProperties=$additionalProperties}"
}
