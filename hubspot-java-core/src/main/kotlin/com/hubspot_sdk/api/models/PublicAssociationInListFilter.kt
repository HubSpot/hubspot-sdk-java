// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

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
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationCategory(): String = associationCategory.getRequired("associationCategory")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypeId(): Int = associationTypeId.getRequired("associationTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun coalescingRefineBy(): CoalescingRefineBy =
        coalescingRefineBy.getRequired("coalescingRefineBy")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toObjectType(): Optional<String> = toObjectType.getOptional("toObjectType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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

        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

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
        (if (associationCategory.asKnown().isPresent) 1 else 0) +
            (if (associationTypeId.asKnown().isPresent) 1 else 0) +
            (coalescingRefineBy.asKnown().getOrNull()?.validity() ?: 0) +
            (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (listId.asKnown().isPresent) 1 else 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (toObjectType.asKnown().isPresent) 1 else 0) +
            (if (toObjectTypeId.asKnown().isPresent) 1 else 0)

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
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown CoalescingRefineBy: $json")
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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ASSOCIATION -> Known.ASSOCIATION
                else -> throw HubspotInvalidDataException("Unknown FilterType: $value")
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
