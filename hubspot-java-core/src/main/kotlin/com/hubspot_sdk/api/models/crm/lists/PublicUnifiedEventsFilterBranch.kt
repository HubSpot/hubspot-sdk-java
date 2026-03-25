// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicUnifiedEventsFilterBranch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventTypeId: JsonField<String>,
    private val filterBranches: JsonField<List<FilterBranch>>,
    private val filterBranchOperator: JsonField<String>,
    private val filterBranchType: JsonField<FilterBranchType>,
    private val filters: JsonField<List<Filter>>,
    private val operator: JsonField<Operator>,
    private val coalescingRefineBy: JsonField<CoalescingRefineBy>,
    private val pruningRefineBy: JsonField<PruningRefineBy>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eventTypeId")
        @ExcludeMissing
        eventTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterBranches")
        @ExcludeMissing
        filterBranches: JsonField<List<FilterBranch>> = JsonMissing.of(),
        @JsonProperty("filterBranchOperator")
        @ExcludeMissing
        filterBranchOperator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterBranchType")
        @ExcludeMissing
        filterBranchType: JsonField<FilterBranchType> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<Filter>> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("coalescingRefineBy")
        @ExcludeMissing
        coalescingRefineBy: JsonField<CoalescingRefineBy> = JsonMissing.of(),
        @JsonProperty("pruningRefineBy")
        @ExcludeMissing
        pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of(),
    ) : this(
        eventTypeId,
        filterBranches,
        filterBranchOperator,
        filterBranchType,
        filters,
        operator,
        coalescingRefineBy,
        pruningRefineBy,
        mutableMapOf(),
    )

    /**
     * The identifier for the type of event associated with the filter branch.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypeId(): String = eventTypeId.getRequired("eventTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranches(): List<FilterBranch> = filterBranches.getRequired("filterBranches")

    /**
     * The logical operator used to combine filters within the branch (AND).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranchOperator(): String = filterBranchOperator.getRequired("filterBranchOperator")

    /**
     * The type of the filter branch (UNIFIED_EVENTS).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranchType(): FilterBranchType = filterBranchType.getRequired("filterBranchType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<Filter> = filters.getRequired("filters")

    /**
     * Defines the operation to be applied within the filter branch (HAS_COMPLETED,
     * HAS_NOT_COMPLETED).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * Specifies the criteria for refining the filter by coalescing.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coalescingRefineBy(): Optional<CoalescingRefineBy> =
        coalescingRefineBy.getOptional("coalescingRefineBy")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pruningRefineBy(): Optional<PruningRefineBy> =
        pruningRefineBy.getOptional("pruningRefineBy")

    /**
     * Returns the raw JSON value of [eventTypeId].
     *
     * Unlike [eventTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTypeId") @ExcludeMissing fun _eventTypeId(): JsonField<String> = eventTypeId

    /**
     * Returns the raw JSON value of [filterBranches].
     *
     * Unlike [filterBranches], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterBranches")
    @ExcludeMissing
    fun _filterBranches(): JsonField<List<FilterBranch>> = filterBranches

    /**
     * Returns the raw JSON value of [filterBranchOperator].
     *
     * Unlike [filterBranchOperator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("filterBranchOperator")
    @ExcludeMissing
    fun _filterBranchOperator(): JsonField<String> = filterBranchOperator

    /**
     * Returns the raw JSON value of [filterBranchType].
     *
     * Unlike [filterBranchType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("filterBranchType")
    @ExcludeMissing
    fun _filterBranchType(): JsonField<FilterBranchType> = filterBranchType

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

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
         * Returns a mutable builder for constructing an instance of
         * [PublicUnifiedEventsFilterBranch].
         *
         * The following fields are required:
         * ```java
         * .eventTypeId()
         * .filterBranches()
         * .filterBranchOperator()
         * .filterBranchType()
         * .filters()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicUnifiedEventsFilterBranch]. */
    class Builder internal constructor() {

        private var eventTypeId: JsonField<String>? = null
        private var filterBranches: JsonField<MutableList<FilterBranch>>? = null
        private var filterBranchOperator: JsonField<String>? = null
        private var filterBranchType: JsonField<FilterBranchType>? = null
        private var filters: JsonField<MutableList<Filter>>? = null
        private var operator: JsonField<Operator>? = null
        private var coalescingRefineBy: JsonField<CoalescingRefineBy> = JsonMissing.of()
        private var pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicUnifiedEventsFilterBranch: PublicUnifiedEventsFilterBranch) =
            apply {
                eventTypeId = publicUnifiedEventsFilterBranch.eventTypeId
                filterBranches =
                    publicUnifiedEventsFilterBranch.filterBranches.map { it.toMutableList() }
                filterBranchOperator = publicUnifiedEventsFilterBranch.filterBranchOperator
                filterBranchType = publicUnifiedEventsFilterBranch.filterBranchType
                filters = publicUnifiedEventsFilterBranch.filters.map { it.toMutableList() }
                operator = publicUnifiedEventsFilterBranch.operator
                coalescingRefineBy = publicUnifiedEventsFilterBranch.coalescingRefineBy
                pruningRefineBy = publicUnifiedEventsFilterBranch.pruningRefineBy
                additionalProperties =
                    publicUnifiedEventsFilterBranch.additionalProperties.toMutableMap()
            }

        /** The identifier for the type of event associated with the filter branch. */
        fun eventTypeId(eventTypeId: String) = eventTypeId(JsonField.of(eventTypeId))

        /**
         * Sets [Builder.eventTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTypeId(eventTypeId: JsonField<String>) = apply { this.eventTypeId = eventTypeId }

        fun filterBranches(filterBranches: List<FilterBranch>) =
            filterBranches(JsonField.of(filterBranches))

        /**
         * Sets [Builder.filterBranches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterBranches] with a well-typed `List<FilterBranch>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filterBranches(filterBranches: JsonField<List<FilterBranch>>) = apply {
            this.filterBranches = filterBranches.map { it.toMutableList() }
        }

        /**
         * Adds a single [FilterBranch] to [filterBranches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilterBranch(filterBranch: FilterBranch) = apply {
            filterBranches =
                (filterBranches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filterBranches", it).add(filterBranch)
                }
        }

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofPublicOr(publicOr)`. */
        fun addFilterBranch(publicOr: PublicOrFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicOr(publicOr))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofPublicAnd(publicAnd)`. */
        fun addFilterBranch(publicAnd: PublicAndFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicAnd(publicAnd))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofPublicNotAll(publicNotAll)`. */
        fun addFilterBranch(publicNotAll: PublicNotAllFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicNotAll(publicNotAll))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofPublicNotAny(publicNotAny)`. */
        fun addFilterBranch(publicNotAny: PublicNotAnyFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicNotAny(publicNotAny))

        /**
         * Alias for calling [addFilterBranch] with
         * `FilterBranch.ofPublicRestricted(publicRestricted)`.
         */
        fun addFilterBranch(publicRestricted: PublicRestrictedFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicRestricted(publicRestricted))

        /**
         * Alias for calling [addFilterBranch] with
         * `FilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun addFilterBranch(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents))

        /**
         * Alias for calling [addFilterBranch] with
         * `FilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)`.
         */
        fun addFilterBranch(publicPropertyAssociation: PublicPropertyAssociationFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation))

        /**
         * Alias for calling [addFilterBranch] with
         * `FilterBranch.ofPublicAssociation(publicAssociation)`.
         */
        fun addFilterBranch(publicAssociation: PublicAssociationFilterBranch) =
            addFilterBranch(FilterBranch.ofPublicAssociation(publicAssociation))

        /** The logical operator used to combine filters within the branch (AND). */
        fun filterBranchOperator(filterBranchOperator: String) =
            filterBranchOperator(JsonField.of(filterBranchOperator))

        /**
         * Sets [Builder.filterBranchOperator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterBranchOperator] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterBranchOperator(filterBranchOperator: JsonField<String>) = apply {
            this.filterBranchOperator = filterBranchOperator
        }

        /** The type of the filter branch (UNIFIED_EVENTS). */
        fun filterBranchType(filterBranchType: FilterBranchType) =
            filterBranchType(JsonField.of(filterBranchType))

        /**
         * Sets [Builder.filterBranchType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterBranchType] with a well-typed [FilterBranchType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filterBranchType(filterBranchType: JsonField<FilterBranchType>) = apply {
            this.filterBranchType = filterBranchType
        }

        fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<Filter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filters(filters: JsonField<List<Filter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Filter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: Filter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /** Alias for calling [addFilter] with `Filter.ofPublicProperty(publicProperty)`. */
        fun addFilter(publicProperty: PublicPropertyFilter) =
            addFilter(Filter.ofPublicProperty(publicProperty))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicAssociationInList(publicAssociationInList)`.
         */
        fun addFilter(publicAssociationInList: PublicAssociationInListFilter) =
            addFilter(Filter.ofPublicAssociationInList(publicAssociationInList))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicPageViewAnalytics(publicPageViewAnalytics)`.
         */
        fun addFilter(publicPageViewAnalytics: PublicPageViewAnalyticsFilter) =
            addFilter(Filter.ofPublicPageViewAnalytics(publicPageViewAnalytics))

        /** Alias for calling [addFilter] with `Filter.ofPublicCtaAnalytics(publicCtaAnalytics)`. */
        fun addFilter(publicCtaAnalytics: PublicCtaAnalyticsFilter) =
            addFilter(Filter.ofPublicCtaAnalytics(publicCtaAnalytics))

        /**
         * Alias for calling [addFilter] with `Filter.ofPublicEventAnalytics(publicEventAnalytics)`.
         */
        fun addFilter(publicEventAnalytics: PublicEventAnalyticsFilter) =
            addFilter(Filter.ofPublicEventAnalytics(publicEventAnalytics))

        /**
         * Alias for calling [addFilter] with `Filter.ofPublicFormSubmission(publicFormSubmission)`.
         */
        fun addFilter(publicFormSubmission: PublicFormSubmissionFilter) =
            addFilter(Filter.ofPublicFormSubmission(publicFormSubmission))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicFormSubmissionOnPage(publicFormSubmissionOnPage)`.
         */
        fun addFilter(publicFormSubmissionOnPage: PublicFormSubmissionOnPageFilter) =
            addFilter(Filter.ofPublicFormSubmissionOnPage(publicFormSubmissionOnPage))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicIntegrationEvent(publicIntegrationEvent)`.
         */
        fun addFilter(publicIntegrationEvent: PublicIntegrationEventFilter) =
            addFilter(Filter.ofPublicIntegrationEvent(publicIntegrationEvent))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicEmailSubscription(publicEmailSubscription)`.
         */
        fun addFilter(publicEmailSubscription: PublicEmailSubscriptionFilter) =
            addFilter(Filter.ofPublicEmailSubscription(publicEmailSubscription))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicCommunicationSubscription(publicCommunicationSubscription)`.
         */
        fun addFilter(publicCommunicationSubscription: PublicCommunicationSubscriptionFilter) =
            addFilter(Filter.ofPublicCommunicationSubscription(publicCommunicationSubscription))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicCampaignInfluenced(publicCampaignInfluenced)`.
         */
        fun addFilter(publicCampaignInfluenced: PublicCampaignInfluencedFilter) =
            addFilter(Filter.ofPublicCampaignInfluenced(publicCampaignInfluenced))

        /** Alias for calling [addFilter] with `Filter.ofPublicSurveyMonkey(publicSurveyMonkey)`. */
        fun addFilter(publicSurveyMonkey: PublicSurveyMonkeyFilter) =
            addFilter(Filter.ofPublicSurveyMonkey(publicSurveyMonkey))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicSurveyMonkeyValue(publicSurveyMonkeyValue)`.
         */
        fun addFilter(publicSurveyMonkeyValue: PublicSurveyMonkeyValueFilter) =
            addFilter(Filter.ofPublicSurveyMonkeyValue(publicSurveyMonkeyValue))

        /** Alias for calling [addFilter] with `Filter.ofPublicWebinar(publicWebinar)`. */
        fun addFilter(publicWebinar: PublicWebinarFilter) =
            addFilter(Filter.ofPublicWebinar(publicWebinar))

        /** Alias for calling [addFilter] with `Filter.ofPublicEmailEvent(publicEmailEvent)`. */
        fun addFilter(publicEmailEvent: PublicEmailEventFilter) =
            addFilter(Filter.ofPublicEmailEvent(publicEmailEvent))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicPrivacyAnalytics(publicPrivacyAnalytics)`.
         */
        fun addFilter(publicPrivacyAnalytics: PublicPrivacyAnalyticsFilter) =
            addFilter(Filter.ofPublicPrivacyAnalytics(publicPrivacyAnalytics))

        /** Alias for calling [addFilter] with `Filter.ofPublicAdsSearch(publicAdsSearch)`. */
        fun addFilter(publicAdsSearch: PublicAdsSearchFilter) =
            addFilter(Filter.ofPublicAdsSearch(publicAdsSearch))

        /** Alias for calling [addFilter] with `Filter.ofPublicAdsTime(publicAdsTime)`. */
        fun addFilter(publicAdsTime: PublicAdsTimeFilter) =
            addFilter(Filter.ofPublicAdsTime(publicAdsTime))

        /** Alias for calling [addFilter] with `Filter.ofPublicInList(publicInList)`. */
        fun addFilter(publicInList: PublicInListFilter) =
            addFilter(Filter.ofPublicInList(publicInList))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicNumAssociations(publicNumAssociations)`.
         */
        fun addFilter(publicNumAssociations: PublicNumAssociationsFilter) =
            addFilter(Filter.ofPublicNumAssociations(publicNumAssociations))

        /**
         * Alias for calling [addFilter] with `Filter.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun addFilter(publicUnifiedEvents: PublicUnifiedEventsFilter) =
            addFilter(Filter.ofPublicUnifiedEvents(publicUnifiedEvents))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofPublicPropertyAssociationInList(publicPropertyAssociationInList)`.
         */
        fun addFilter(publicPropertyAssociationInList: PublicPropertyAssociationInListFilter) =
            addFilter(Filter.ofPublicPropertyAssociationInList(publicPropertyAssociationInList))

        /** Alias for calling [addFilter] with `Filter.ofPublicConstant(publicConstant)`. */
        fun addFilter(publicConstant: PublicConstantFilter) =
            addFilter(Filter.ofPublicConstant(publicConstant))

        /**
         * Defines the operation to be applied within the filter branch (HAS_COMPLETED,
         * HAS_NOT_COMPLETED).
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

        /** Specifies the criteria for refining the filter by coalescing. */
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
         * Returns an immutable instance of [PublicUnifiedEventsFilterBranch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventTypeId()
         * .filterBranches()
         * .filterBranchOperator()
         * .filterBranchType()
         * .filters()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicUnifiedEventsFilterBranch =
            PublicUnifiedEventsFilterBranch(
                checkRequired("eventTypeId", eventTypeId),
                checkRequired("filterBranches", filterBranches).map { it.toImmutable() },
                checkRequired("filterBranchOperator", filterBranchOperator),
                checkRequired("filterBranchType", filterBranchType),
                checkRequired("filters", filters).map { it.toImmutable() },
                checkRequired("operator", operator),
                coalescingRefineBy,
                pruningRefineBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicUnifiedEventsFilterBranch = apply {
        if (validated) {
            return@apply
        }

        eventTypeId()
        filterBranches().forEach { it.validate() }
        filterBranchOperator()
        filterBranchType().validate()
        filters().forEach { it.validate() }
        operator().validate()
        coalescingRefineBy().ifPresent { it.validate() }
        pruningRefineBy().ifPresent { it.validate() }
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
        (if (eventTypeId.asKnown().isPresent) 1 else 0) +
            (filterBranches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (filterBranchOperator.asKnown().isPresent) 1 else 0) +
            (filterBranchType.asKnown().getOrNull()?.validity() ?: 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (coalescingRefineBy.asKnown().getOrNull()?.validity() ?: 0) +
            (pruningRefineBy.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = FilterBranch.Deserializer::class)
    @JsonSerialize(using = FilterBranch.Serializer::class)
    class FilterBranch
    private constructor(
        private val publicOr: PublicOrFilterBranch? = null,
        private val publicAnd: PublicAndFilterBranch? = null,
        private val publicNotAll: PublicNotAllFilterBranch? = null,
        private val publicNotAny: PublicNotAnyFilterBranch? = null,
        private val publicRestricted: PublicRestrictedFilterBranch? = null,
        private val publicUnifiedEvents: PublicUnifiedEventsFilterBranch? = null,
        private val publicPropertyAssociation: PublicPropertyAssociationFilterBranch? = null,
        private val publicAssociation: PublicAssociationFilterBranch? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicOr(): Optional<PublicOrFilterBranch> = Optional.ofNullable(publicOr)

        fun publicAnd(): Optional<PublicAndFilterBranch> = Optional.ofNullable(publicAnd)

        fun publicNotAll(): Optional<PublicNotAllFilterBranch> = Optional.ofNullable(publicNotAll)

        fun publicNotAny(): Optional<PublicNotAnyFilterBranch> = Optional.ofNullable(publicNotAny)

        fun publicRestricted(): Optional<PublicRestrictedFilterBranch> =
            Optional.ofNullable(publicRestricted)

        fun publicUnifiedEvents(): Optional<PublicUnifiedEventsFilterBranch> =
            Optional.ofNullable(publicUnifiedEvents)

        fun publicPropertyAssociation(): Optional<PublicPropertyAssociationFilterBranch> =
            Optional.ofNullable(publicPropertyAssociation)

        fun publicAssociation(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(publicAssociation)

        fun isPublicOr(): Boolean = publicOr != null

        fun isPublicAnd(): Boolean = publicAnd != null

        fun isPublicNotAll(): Boolean = publicNotAll != null

        fun isPublicNotAny(): Boolean = publicNotAny != null

        fun isPublicRestricted(): Boolean = publicRestricted != null

        fun isPublicUnifiedEvents(): Boolean = publicUnifiedEvents != null

        fun isPublicPropertyAssociation(): Boolean = publicPropertyAssociation != null

        fun isPublicAssociation(): Boolean = publicAssociation != null

        fun asPublicOr(): PublicOrFilterBranch = publicOr.getOrThrow("publicOr")

        fun asPublicAnd(): PublicAndFilterBranch = publicAnd.getOrThrow("publicAnd")

        fun asPublicNotAll(): PublicNotAllFilterBranch = publicNotAll.getOrThrow("publicNotAll")

        fun asPublicNotAny(): PublicNotAnyFilterBranch = publicNotAny.getOrThrow("publicNotAny")

        fun asPublicRestricted(): PublicRestrictedFilterBranch =
            publicRestricted.getOrThrow("publicRestricted")

        fun asPublicUnifiedEvents(): PublicUnifiedEventsFilterBranch =
            publicUnifiedEvents.getOrThrow("publicUnifiedEvents")

        fun asPublicPropertyAssociation(): PublicPropertyAssociationFilterBranch =
            publicPropertyAssociation.getOrThrow("publicPropertyAssociation")

        fun asPublicAssociation(): PublicAssociationFilterBranch =
            publicAssociation.getOrThrow("publicAssociation")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicOr != null -> visitor.visitPublicOr(publicOr)
                publicAnd != null -> visitor.visitPublicAnd(publicAnd)
                publicNotAll != null -> visitor.visitPublicNotAll(publicNotAll)
                publicNotAny != null -> visitor.visitPublicNotAny(publicNotAny)
                publicRestricted != null -> visitor.visitPublicRestricted(publicRestricted)
                publicUnifiedEvents != null -> visitor.visitPublicUnifiedEvents(publicUnifiedEvents)
                publicPropertyAssociation != null ->
                    visitor.visitPublicPropertyAssociation(publicPropertyAssociation)
                publicAssociation != null -> visitor.visitPublicAssociation(publicAssociation)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): FilterBranch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicOr(publicOr: PublicOrFilterBranch) {
                        publicOr.validate()
                    }

                    override fun visitPublicAnd(publicAnd: PublicAndFilterBranch) {
                        publicAnd.validate()
                    }

                    override fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch) {
                        publicNotAll.validate()
                    }

                    override fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) {
                        publicNotAny.validate()
                    }

                    override fun visitPublicRestricted(
                        publicRestricted: PublicRestrictedFilterBranch
                    ) {
                        publicRestricted.validate()
                    }

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilterBranch
                    ) {
                        publicUnifiedEvents.validate()
                    }

                    override fun visitPublicPropertyAssociation(
                        publicPropertyAssociation: PublicPropertyAssociationFilterBranch
                    ) {
                        publicPropertyAssociation.validate()
                    }

                    override fun visitPublicAssociation(
                        publicAssociation: PublicAssociationFilterBranch
                    ) {
                        publicAssociation.validate()
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
                    override fun visitPublicOr(publicOr: PublicOrFilterBranch) = publicOr.validity()

                    override fun visitPublicAnd(publicAnd: PublicAndFilterBranch) =
                        publicAnd.validity()

                    override fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                        publicNotAll.validity()

                    override fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                        publicNotAny.validity()

                    override fun visitPublicRestricted(
                        publicRestricted: PublicRestrictedFilterBranch
                    ) = publicRestricted.validity()

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilterBranch
                    ) = publicUnifiedEvents.validity()

                    override fun visitPublicPropertyAssociation(
                        publicPropertyAssociation: PublicPropertyAssociationFilterBranch
                    ) = publicPropertyAssociation.validity()

                    override fun visitPublicAssociation(
                        publicAssociation: PublicAssociationFilterBranch
                    ) = publicAssociation.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FilterBranch &&
                publicOr == other.publicOr &&
                publicAnd == other.publicAnd &&
                publicNotAll == other.publicNotAll &&
                publicNotAny == other.publicNotAny &&
                publicRestricted == other.publicRestricted &&
                publicUnifiedEvents == other.publicUnifiedEvents &&
                publicPropertyAssociation == other.publicPropertyAssociation &&
                publicAssociation == other.publicAssociation
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicOr,
                publicAnd,
                publicNotAll,
                publicNotAny,
                publicRestricted,
                publicUnifiedEvents,
                publicPropertyAssociation,
                publicAssociation,
            )

        override fun toString(): String =
            when {
                publicOr != null -> "FilterBranch{publicOr=$publicOr}"
                publicAnd != null -> "FilterBranch{publicAnd=$publicAnd}"
                publicNotAll != null -> "FilterBranch{publicNotAll=$publicNotAll}"
                publicNotAny != null -> "FilterBranch{publicNotAny=$publicNotAny}"
                publicRestricted != null -> "FilterBranch{publicRestricted=$publicRestricted}"
                publicUnifiedEvents != null ->
                    "FilterBranch{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociation != null ->
                    "FilterBranch{publicPropertyAssociation=$publicPropertyAssociation}"
                publicAssociation != null -> "FilterBranch{publicAssociation=$publicAssociation}"
                _json != null -> "FilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FilterBranch")
            }

        companion object {

            @JvmStatic
            fun ofPublicOr(publicOr: PublicOrFilterBranch) = FilterBranch(publicOr = publicOr)

            @JvmStatic
            fun ofPublicAnd(publicAnd: PublicAndFilterBranch) = FilterBranch(publicAnd = publicAnd)

            @JvmStatic
            fun ofPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                FilterBranch(publicNotAll = publicNotAll)

            @JvmStatic
            fun ofPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                FilterBranch(publicNotAny = publicNotAny)

            @JvmStatic
            fun ofPublicRestricted(publicRestricted: PublicRestrictedFilterBranch) =
                FilterBranch(publicRestricted = publicRestricted)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
                FilterBranch(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ) = FilterBranch(publicPropertyAssociation = publicPropertyAssociation)

            @JvmStatic
            fun ofPublicAssociation(publicAssociation: PublicAssociationFilterBranch) =
                FilterBranch(publicAssociation = publicAssociation)
        }

        /**
         * An interface that defines how to map each variant of [FilterBranch] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitPublicOr(publicOr: PublicOrFilterBranch): T

            fun visitPublicAnd(publicAnd: PublicAndFilterBranch): T

            fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch): T

            fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch): T

            fun visitPublicRestricted(publicRestricted: PublicRestrictedFilterBranch): T

            fun visitPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch): T

            fun visitPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ): T

            fun visitPublicAssociation(publicAssociation: PublicAssociationFilterBranch): T

            /**
             * Maps an unknown variant of [FilterBranch] to a value of type [T].
             *
             * An instance of [FilterBranch] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown FilterBranch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FilterBranch>(FilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FilterBranch {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                FilterBranch(publicOr = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                FilterBranch(publicAnd = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                FilterBranch(publicNotAll = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                FilterBranch(publicNotAny = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let { FilterBranch(publicRestricted = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let { FilterBranch(publicUnifiedEvents = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    FilterBranch(publicPropertyAssociation = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let { FilterBranch(publicAssociation = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> FilterBranch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<FilterBranch>(FilterBranch::class) {

            override fun serialize(
                value: FilterBranch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicOr != null -> generator.writeObject(value.publicOr)
                    value.publicAnd != null -> generator.writeObject(value.publicAnd)
                    value.publicNotAll != null -> generator.writeObject(value.publicNotAll)
                    value.publicNotAny != null -> generator.writeObject(value.publicNotAny)
                    value.publicRestricted != null -> generator.writeObject(value.publicRestricted)
                    value.publicUnifiedEvents != null ->
                        generator.writeObject(value.publicUnifiedEvents)
                    value.publicPropertyAssociation != null ->
                        generator.writeObject(value.publicPropertyAssociation)
                    value.publicAssociation != null ->
                        generator.writeObject(value.publicAssociation)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FilterBranch")
                }
            }
        }
    }

    /** The type of the filter branch (UNIFIED_EVENTS). */
    class FilterBranchType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UNIFIED_EVENTS = of("UNIFIED_EVENTS")

            @JvmStatic fun of(value: String) = FilterBranchType(JsonField.of(value))
        }

        /** An enum containing [FilterBranchType]'s known values. */
        enum class Known {
            UNIFIED_EVENTS
        }

        /**
         * An enum containing [FilterBranchType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterBranchType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNIFIED_EVENTS,
            /**
             * An enum member indicating that [FilterBranchType] was instantiated with an unknown
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
                UNIFIED_EVENTS -> Value.UNIFIED_EVENTS
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
                UNIFIED_EVENTS -> Known.UNIFIED_EVENTS
                else -> throw HubspotInvalidDataException("Unknown FilterBranchType: $value")
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

        fun validate(): FilterBranchType = apply {
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

            return other is FilterBranchType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Filter.Deserializer::class)
    @JsonSerialize(using = Filter.Serializer::class)
    class Filter
    private constructor(
        private val publicProperty: PublicPropertyFilter? = null,
        private val publicAssociationInList: PublicAssociationInListFilter? = null,
        private val publicPageViewAnalytics: PublicPageViewAnalyticsFilter? = null,
        private val publicCtaAnalytics: PublicCtaAnalyticsFilter? = null,
        private val publicEventAnalytics: PublicEventAnalyticsFilter? = null,
        private val publicFormSubmission: PublicFormSubmissionFilter? = null,
        private val publicFormSubmissionOnPage: PublicFormSubmissionOnPageFilter? = null,
        private val publicIntegrationEvent: PublicIntegrationEventFilter? = null,
        private val publicEmailSubscription: PublicEmailSubscriptionFilter? = null,
        private val publicCommunicationSubscription: PublicCommunicationSubscriptionFilter? = null,
        private val publicCampaignInfluenced: PublicCampaignInfluencedFilter? = null,
        private val publicSurveyMonkey: PublicSurveyMonkeyFilter? = null,
        private val publicSurveyMonkeyValue: PublicSurveyMonkeyValueFilter? = null,
        private val publicWebinar: PublicWebinarFilter? = null,
        private val publicEmailEvent: PublicEmailEventFilter? = null,
        private val publicPrivacyAnalytics: PublicPrivacyAnalyticsFilter? = null,
        private val publicAdsSearch: PublicAdsSearchFilter? = null,
        private val publicAdsTime: PublicAdsTimeFilter? = null,
        private val publicInList: PublicInListFilter? = null,
        private val publicNumAssociations: PublicNumAssociationsFilter? = null,
        private val publicUnifiedEvents: PublicUnifiedEventsFilter? = null,
        private val publicPropertyAssociationInList: PublicPropertyAssociationInListFilter? = null,
        private val publicConstant: PublicConstantFilter? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicProperty(): Optional<PublicPropertyFilter> = Optional.ofNullable(publicProperty)

        fun publicAssociationInList(): Optional<PublicAssociationInListFilter> =
            Optional.ofNullable(publicAssociationInList)

        fun publicPageViewAnalytics(): Optional<PublicPageViewAnalyticsFilter> =
            Optional.ofNullable(publicPageViewAnalytics)

        fun publicCtaAnalytics(): Optional<PublicCtaAnalyticsFilter> =
            Optional.ofNullable(publicCtaAnalytics)

        fun publicEventAnalytics(): Optional<PublicEventAnalyticsFilter> =
            Optional.ofNullable(publicEventAnalytics)

        fun publicFormSubmission(): Optional<PublicFormSubmissionFilter> =
            Optional.ofNullable(publicFormSubmission)

        fun publicFormSubmissionOnPage(): Optional<PublicFormSubmissionOnPageFilter> =
            Optional.ofNullable(publicFormSubmissionOnPage)

        fun publicIntegrationEvent(): Optional<PublicIntegrationEventFilter> =
            Optional.ofNullable(publicIntegrationEvent)

        fun publicEmailSubscription(): Optional<PublicEmailSubscriptionFilter> =
            Optional.ofNullable(publicEmailSubscription)

        fun publicCommunicationSubscription(): Optional<PublicCommunicationSubscriptionFilter> =
            Optional.ofNullable(publicCommunicationSubscription)

        fun publicCampaignInfluenced(): Optional<PublicCampaignInfluencedFilter> =
            Optional.ofNullable(publicCampaignInfluenced)

        fun publicSurveyMonkey(): Optional<PublicSurveyMonkeyFilter> =
            Optional.ofNullable(publicSurveyMonkey)

        fun publicSurveyMonkeyValue(): Optional<PublicSurveyMonkeyValueFilter> =
            Optional.ofNullable(publicSurveyMonkeyValue)

        fun publicWebinar(): Optional<PublicWebinarFilter> = Optional.ofNullable(publicWebinar)

        fun publicEmailEvent(): Optional<PublicEmailEventFilter> =
            Optional.ofNullable(publicEmailEvent)

        fun publicPrivacyAnalytics(): Optional<PublicPrivacyAnalyticsFilter> =
            Optional.ofNullable(publicPrivacyAnalytics)

        fun publicAdsSearch(): Optional<PublicAdsSearchFilter> =
            Optional.ofNullable(publicAdsSearch)

        fun publicAdsTime(): Optional<PublicAdsTimeFilter> = Optional.ofNullable(publicAdsTime)

        fun publicInList(): Optional<PublicInListFilter> = Optional.ofNullable(publicInList)

        fun publicNumAssociations(): Optional<PublicNumAssociationsFilter> =
            Optional.ofNullable(publicNumAssociations)

        fun publicUnifiedEvents(): Optional<PublicUnifiedEventsFilter> =
            Optional.ofNullable(publicUnifiedEvents)

        fun publicPropertyAssociationInList(): Optional<PublicPropertyAssociationInListFilter> =
            Optional.ofNullable(publicPropertyAssociationInList)

        fun publicConstant(): Optional<PublicConstantFilter> = Optional.ofNullable(publicConstant)

        fun isPublicProperty(): Boolean = publicProperty != null

        fun isPublicAssociationInList(): Boolean = publicAssociationInList != null

        fun isPublicPageViewAnalytics(): Boolean = publicPageViewAnalytics != null

        fun isPublicCtaAnalytics(): Boolean = publicCtaAnalytics != null

        fun isPublicEventAnalytics(): Boolean = publicEventAnalytics != null

        fun isPublicFormSubmission(): Boolean = publicFormSubmission != null

        fun isPublicFormSubmissionOnPage(): Boolean = publicFormSubmissionOnPage != null

        fun isPublicIntegrationEvent(): Boolean = publicIntegrationEvent != null

        fun isPublicEmailSubscription(): Boolean = publicEmailSubscription != null

        fun isPublicCommunicationSubscription(): Boolean = publicCommunicationSubscription != null

        fun isPublicCampaignInfluenced(): Boolean = publicCampaignInfluenced != null

        fun isPublicSurveyMonkey(): Boolean = publicSurveyMonkey != null

        fun isPublicSurveyMonkeyValue(): Boolean = publicSurveyMonkeyValue != null

        fun isPublicWebinar(): Boolean = publicWebinar != null

        fun isPublicEmailEvent(): Boolean = publicEmailEvent != null

        fun isPublicPrivacyAnalytics(): Boolean = publicPrivacyAnalytics != null

        fun isPublicAdsSearch(): Boolean = publicAdsSearch != null

        fun isPublicAdsTime(): Boolean = publicAdsTime != null

        fun isPublicInList(): Boolean = publicInList != null

        fun isPublicNumAssociations(): Boolean = publicNumAssociations != null

        fun isPublicUnifiedEvents(): Boolean = publicUnifiedEvents != null

        fun isPublicPropertyAssociationInList(): Boolean = publicPropertyAssociationInList != null

        fun isPublicConstant(): Boolean = publicConstant != null

        fun asPublicProperty(): PublicPropertyFilter = publicProperty.getOrThrow("publicProperty")

        fun asPublicAssociationInList(): PublicAssociationInListFilter =
            publicAssociationInList.getOrThrow("publicAssociationInList")

        fun asPublicPageViewAnalytics(): PublicPageViewAnalyticsFilter =
            publicPageViewAnalytics.getOrThrow("publicPageViewAnalytics")

        fun asPublicCtaAnalytics(): PublicCtaAnalyticsFilter =
            publicCtaAnalytics.getOrThrow("publicCtaAnalytics")

        fun asPublicEventAnalytics(): PublicEventAnalyticsFilter =
            publicEventAnalytics.getOrThrow("publicEventAnalytics")

        fun asPublicFormSubmission(): PublicFormSubmissionFilter =
            publicFormSubmission.getOrThrow("publicFormSubmission")

        fun asPublicFormSubmissionOnPage(): PublicFormSubmissionOnPageFilter =
            publicFormSubmissionOnPage.getOrThrow("publicFormSubmissionOnPage")

        fun asPublicIntegrationEvent(): PublicIntegrationEventFilter =
            publicIntegrationEvent.getOrThrow("publicIntegrationEvent")

        fun asPublicEmailSubscription(): PublicEmailSubscriptionFilter =
            publicEmailSubscription.getOrThrow("publicEmailSubscription")

        fun asPublicCommunicationSubscription(): PublicCommunicationSubscriptionFilter =
            publicCommunicationSubscription.getOrThrow("publicCommunicationSubscription")

        fun asPublicCampaignInfluenced(): PublicCampaignInfluencedFilter =
            publicCampaignInfluenced.getOrThrow("publicCampaignInfluenced")

        fun asPublicSurveyMonkey(): PublicSurveyMonkeyFilter =
            publicSurveyMonkey.getOrThrow("publicSurveyMonkey")

        fun asPublicSurveyMonkeyValue(): PublicSurveyMonkeyValueFilter =
            publicSurveyMonkeyValue.getOrThrow("publicSurveyMonkeyValue")

        fun asPublicWebinar(): PublicWebinarFilter = publicWebinar.getOrThrow("publicWebinar")

        fun asPublicEmailEvent(): PublicEmailEventFilter =
            publicEmailEvent.getOrThrow("publicEmailEvent")

        fun asPublicPrivacyAnalytics(): PublicPrivacyAnalyticsFilter =
            publicPrivacyAnalytics.getOrThrow("publicPrivacyAnalytics")

        fun asPublicAdsSearch(): PublicAdsSearchFilter =
            publicAdsSearch.getOrThrow("publicAdsSearch")

        fun asPublicAdsTime(): PublicAdsTimeFilter = publicAdsTime.getOrThrow("publicAdsTime")

        fun asPublicInList(): PublicInListFilter = publicInList.getOrThrow("publicInList")

        fun asPublicNumAssociations(): PublicNumAssociationsFilter =
            publicNumAssociations.getOrThrow("publicNumAssociations")

        fun asPublicUnifiedEvents(): PublicUnifiedEventsFilter =
            publicUnifiedEvents.getOrThrow("publicUnifiedEvents")

        fun asPublicPropertyAssociationInList(): PublicPropertyAssociationInListFilter =
            publicPropertyAssociationInList.getOrThrow("publicPropertyAssociationInList")

        fun asPublicConstant(): PublicConstantFilter = publicConstant.getOrThrow("publicConstant")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicProperty != null -> visitor.visitPublicProperty(publicProperty)
                publicAssociationInList != null ->
                    visitor.visitPublicAssociationInList(publicAssociationInList)
                publicPageViewAnalytics != null ->
                    visitor.visitPublicPageViewAnalytics(publicPageViewAnalytics)
                publicCtaAnalytics != null -> visitor.visitPublicCtaAnalytics(publicCtaAnalytics)
                publicEventAnalytics != null ->
                    visitor.visitPublicEventAnalytics(publicEventAnalytics)
                publicFormSubmission != null ->
                    visitor.visitPublicFormSubmission(publicFormSubmission)
                publicFormSubmissionOnPage != null ->
                    visitor.visitPublicFormSubmissionOnPage(publicFormSubmissionOnPage)
                publicIntegrationEvent != null ->
                    visitor.visitPublicIntegrationEvent(publicIntegrationEvent)
                publicEmailSubscription != null ->
                    visitor.visitPublicEmailSubscription(publicEmailSubscription)
                publicCommunicationSubscription != null ->
                    visitor.visitPublicCommunicationSubscription(publicCommunicationSubscription)
                publicCampaignInfluenced != null ->
                    visitor.visitPublicCampaignInfluenced(publicCampaignInfluenced)
                publicSurveyMonkey != null -> visitor.visitPublicSurveyMonkey(publicSurveyMonkey)
                publicSurveyMonkeyValue != null ->
                    visitor.visitPublicSurveyMonkeyValue(publicSurveyMonkeyValue)
                publicWebinar != null -> visitor.visitPublicWebinar(publicWebinar)
                publicEmailEvent != null -> visitor.visitPublicEmailEvent(publicEmailEvent)
                publicPrivacyAnalytics != null ->
                    visitor.visitPublicPrivacyAnalytics(publicPrivacyAnalytics)
                publicAdsSearch != null -> visitor.visitPublicAdsSearch(publicAdsSearch)
                publicAdsTime != null -> visitor.visitPublicAdsTime(publicAdsTime)
                publicInList != null -> visitor.visitPublicInList(publicInList)
                publicNumAssociations != null ->
                    visitor.visitPublicNumAssociations(publicNumAssociations)
                publicUnifiedEvents != null -> visitor.visitPublicUnifiedEvents(publicUnifiedEvents)
                publicPropertyAssociationInList != null ->
                    visitor.visitPublicPropertyAssociationInList(publicPropertyAssociationInList)
                publicConstant != null -> visitor.visitPublicConstant(publicConstant)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicProperty(publicProperty: PublicPropertyFilter) {
                        publicProperty.validate()
                    }

                    override fun visitPublicAssociationInList(
                        publicAssociationInList: PublicAssociationInListFilter
                    ) {
                        publicAssociationInList.validate()
                    }

                    override fun visitPublicPageViewAnalytics(
                        publicPageViewAnalytics: PublicPageViewAnalyticsFilter
                    ) {
                        publicPageViewAnalytics.validate()
                    }

                    override fun visitPublicCtaAnalytics(
                        publicCtaAnalytics: PublicCtaAnalyticsFilter
                    ) {
                        publicCtaAnalytics.validate()
                    }

                    override fun visitPublicEventAnalytics(
                        publicEventAnalytics: PublicEventAnalyticsFilter
                    ) {
                        publicEventAnalytics.validate()
                    }

                    override fun visitPublicFormSubmission(
                        publicFormSubmission: PublicFormSubmissionFilter
                    ) {
                        publicFormSubmission.validate()
                    }

                    override fun visitPublicFormSubmissionOnPage(
                        publicFormSubmissionOnPage: PublicFormSubmissionOnPageFilter
                    ) {
                        publicFormSubmissionOnPage.validate()
                    }

                    override fun visitPublicIntegrationEvent(
                        publicIntegrationEvent: PublicIntegrationEventFilter
                    ) {
                        publicIntegrationEvent.validate()
                    }

                    override fun visitPublicEmailSubscription(
                        publicEmailSubscription: PublicEmailSubscriptionFilter
                    ) {
                        publicEmailSubscription.validate()
                    }

                    override fun visitPublicCommunicationSubscription(
                        publicCommunicationSubscription: PublicCommunicationSubscriptionFilter
                    ) {
                        publicCommunicationSubscription.validate()
                    }

                    override fun visitPublicCampaignInfluenced(
                        publicCampaignInfluenced: PublicCampaignInfluencedFilter
                    ) {
                        publicCampaignInfluenced.validate()
                    }

                    override fun visitPublicSurveyMonkey(
                        publicSurveyMonkey: PublicSurveyMonkeyFilter
                    ) {
                        publicSurveyMonkey.validate()
                    }

                    override fun visitPublicSurveyMonkeyValue(
                        publicSurveyMonkeyValue: PublicSurveyMonkeyValueFilter
                    ) {
                        publicSurveyMonkeyValue.validate()
                    }

                    override fun visitPublicWebinar(publicWebinar: PublicWebinarFilter) {
                        publicWebinar.validate()
                    }

                    override fun visitPublicEmailEvent(publicEmailEvent: PublicEmailEventFilter) {
                        publicEmailEvent.validate()
                    }

                    override fun visitPublicPrivacyAnalytics(
                        publicPrivacyAnalytics: PublicPrivacyAnalyticsFilter
                    ) {
                        publicPrivacyAnalytics.validate()
                    }

                    override fun visitPublicAdsSearch(publicAdsSearch: PublicAdsSearchFilter) {
                        publicAdsSearch.validate()
                    }

                    override fun visitPublicAdsTime(publicAdsTime: PublicAdsTimeFilter) {
                        publicAdsTime.validate()
                    }

                    override fun visitPublicInList(publicInList: PublicInListFilter) {
                        publicInList.validate()
                    }

                    override fun visitPublicNumAssociations(
                        publicNumAssociations: PublicNumAssociationsFilter
                    ) {
                        publicNumAssociations.validate()
                    }

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilter
                    ) {
                        publicUnifiedEvents.validate()
                    }

                    override fun visitPublicPropertyAssociationInList(
                        publicPropertyAssociationInList: PublicPropertyAssociationInListFilter
                    ) {
                        publicPropertyAssociationInList.validate()
                    }

                    override fun visitPublicConstant(publicConstant: PublicConstantFilter) {
                        publicConstant.validate()
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
                    override fun visitPublicProperty(publicProperty: PublicPropertyFilter) =
                        publicProperty.validity()

                    override fun visitPublicAssociationInList(
                        publicAssociationInList: PublicAssociationInListFilter
                    ) = publicAssociationInList.validity()

                    override fun visitPublicPageViewAnalytics(
                        publicPageViewAnalytics: PublicPageViewAnalyticsFilter
                    ) = publicPageViewAnalytics.validity()

                    override fun visitPublicCtaAnalytics(
                        publicCtaAnalytics: PublicCtaAnalyticsFilter
                    ) = publicCtaAnalytics.validity()

                    override fun visitPublicEventAnalytics(
                        publicEventAnalytics: PublicEventAnalyticsFilter
                    ) = publicEventAnalytics.validity()

                    override fun visitPublicFormSubmission(
                        publicFormSubmission: PublicFormSubmissionFilter
                    ) = publicFormSubmission.validity()

                    override fun visitPublicFormSubmissionOnPage(
                        publicFormSubmissionOnPage: PublicFormSubmissionOnPageFilter
                    ) = publicFormSubmissionOnPage.validity()

                    override fun visitPublicIntegrationEvent(
                        publicIntegrationEvent: PublicIntegrationEventFilter
                    ) = publicIntegrationEvent.validity()

                    override fun visitPublicEmailSubscription(
                        publicEmailSubscription: PublicEmailSubscriptionFilter
                    ) = publicEmailSubscription.validity()

                    override fun visitPublicCommunicationSubscription(
                        publicCommunicationSubscription: PublicCommunicationSubscriptionFilter
                    ) = publicCommunicationSubscription.validity()

                    override fun visitPublicCampaignInfluenced(
                        publicCampaignInfluenced: PublicCampaignInfluencedFilter
                    ) = publicCampaignInfluenced.validity()

                    override fun visitPublicSurveyMonkey(
                        publicSurveyMonkey: PublicSurveyMonkeyFilter
                    ) = publicSurveyMonkey.validity()

                    override fun visitPublicSurveyMonkeyValue(
                        publicSurveyMonkeyValue: PublicSurveyMonkeyValueFilter
                    ) = publicSurveyMonkeyValue.validity()

                    override fun visitPublicWebinar(publicWebinar: PublicWebinarFilter) =
                        publicWebinar.validity()

                    override fun visitPublicEmailEvent(publicEmailEvent: PublicEmailEventFilter) =
                        publicEmailEvent.validity()

                    override fun visitPublicPrivacyAnalytics(
                        publicPrivacyAnalytics: PublicPrivacyAnalyticsFilter
                    ) = publicPrivacyAnalytics.validity()

                    override fun visitPublicAdsSearch(publicAdsSearch: PublicAdsSearchFilter) =
                        publicAdsSearch.validity()

                    override fun visitPublicAdsTime(publicAdsTime: PublicAdsTimeFilter) =
                        publicAdsTime.validity()

                    override fun visitPublicInList(publicInList: PublicInListFilter) =
                        publicInList.validity()

                    override fun visitPublicNumAssociations(
                        publicNumAssociations: PublicNumAssociationsFilter
                    ) = publicNumAssociations.validity()

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilter
                    ) = publicUnifiedEvents.validity()

                    override fun visitPublicPropertyAssociationInList(
                        publicPropertyAssociationInList: PublicPropertyAssociationInListFilter
                    ) = publicPropertyAssociationInList.validity()

                    override fun visitPublicConstant(publicConstant: PublicConstantFilter) =
                        publicConstant.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                publicProperty == other.publicProperty &&
                publicAssociationInList == other.publicAssociationInList &&
                publicPageViewAnalytics == other.publicPageViewAnalytics &&
                publicCtaAnalytics == other.publicCtaAnalytics &&
                publicEventAnalytics == other.publicEventAnalytics &&
                publicFormSubmission == other.publicFormSubmission &&
                publicFormSubmissionOnPage == other.publicFormSubmissionOnPage &&
                publicIntegrationEvent == other.publicIntegrationEvent &&
                publicEmailSubscription == other.publicEmailSubscription &&
                publicCommunicationSubscription == other.publicCommunicationSubscription &&
                publicCampaignInfluenced == other.publicCampaignInfluenced &&
                publicSurveyMonkey == other.publicSurveyMonkey &&
                publicSurveyMonkeyValue == other.publicSurveyMonkeyValue &&
                publicWebinar == other.publicWebinar &&
                publicEmailEvent == other.publicEmailEvent &&
                publicPrivacyAnalytics == other.publicPrivacyAnalytics &&
                publicAdsSearch == other.publicAdsSearch &&
                publicAdsTime == other.publicAdsTime &&
                publicInList == other.publicInList &&
                publicNumAssociations == other.publicNumAssociations &&
                publicUnifiedEvents == other.publicUnifiedEvents &&
                publicPropertyAssociationInList == other.publicPropertyAssociationInList &&
                publicConstant == other.publicConstant
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicProperty,
                publicAssociationInList,
                publicPageViewAnalytics,
                publicCtaAnalytics,
                publicEventAnalytics,
                publicFormSubmission,
                publicFormSubmissionOnPage,
                publicIntegrationEvent,
                publicEmailSubscription,
                publicCommunicationSubscription,
                publicCampaignInfluenced,
                publicSurveyMonkey,
                publicSurveyMonkeyValue,
                publicWebinar,
                publicEmailEvent,
                publicPrivacyAnalytics,
                publicAdsSearch,
                publicAdsTime,
                publicInList,
                publicNumAssociations,
                publicUnifiedEvents,
                publicPropertyAssociationInList,
                publicConstant,
            )

        override fun toString(): String =
            when {
                publicProperty != null -> "Filter{publicProperty=$publicProperty}"
                publicAssociationInList != null ->
                    "Filter{publicAssociationInList=$publicAssociationInList}"
                publicPageViewAnalytics != null ->
                    "Filter{publicPageViewAnalytics=$publicPageViewAnalytics}"
                publicCtaAnalytics != null -> "Filter{publicCtaAnalytics=$publicCtaAnalytics}"
                publicEventAnalytics != null -> "Filter{publicEventAnalytics=$publicEventAnalytics}"
                publicFormSubmission != null -> "Filter{publicFormSubmission=$publicFormSubmission}"
                publicFormSubmissionOnPage != null ->
                    "Filter{publicFormSubmissionOnPage=$publicFormSubmissionOnPage}"
                publicIntegrationEvent != null ->
                    "Filter{publicIntegrationEvent=$publicIntegrationEvent}"
                publicEmailSubscription != null ->
                    "Filter{publicEmailSubscription=$publicEmailSubscription}"
                publicCommunicationSubscription != null ->
                    "Filter{publicCommunicationSubscription=$publicCommunicationSubscription}"
                publicCampaignInfluenced != null ->
                    "Filter{publicCampaignInfluenced=$publicCampaignInfluenced}"
                publicSurveyMonkey != null -> "Filter{publicSurveyMonkey=$publicSurveyMonkey}"
                publicSurveyMonkeyValue != null ->
                    "Filter{publicSurveyMonkeyValue=$publicSurveyMonkeyValue}"
                publicWebinar != null -> "Filter{publicWebinar=$publicWebinar}"
                publicEmailEvent != null -> "Filter{publicEmailEvent=$publicEmailEvent}"
                publicPrivacyAnalytics != null ->
                    "Filter{publicPrivacyAnalytics=$publicPrivacyAnalytics}"
                publicAdsSearch != null -> "Filter{publicAdsSearch=$publicAdsSearch}"
                publicAdsTime != null -> "Filter{publicAdsTime=$publicAdsTime}"
                publicInList != null -> "Filter{publicInList=$publicInList}"
                publicNumAssociations != null ->
                    "Filter{publicNumAssociations=$publicNumAssociations}"
                publicUnifiedEvents != null -> "Filter{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociationInList != null ->
                    "Filter{publicPropertyAssociationInList=$publicPropertyAssociationInList}"
                publicConstant != null -> "Filter{publicConstant=$publicConstant}"
                _json != null -> "Filter{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Filter")
            }

        companion object {

            @JvmStatic
            fun ofPublicProperty(publicProperty: PublicPropertyFilter) =
                Filter(publicProperty = publicProperty)

            @JvmStatic
            fun ofPublicAssociationInList(publicAssociationInList: PublicAssociationInListFilter) =
                Filter(publicAssociationInList = publicAssociationInList)

            @JvmStatic
            fun ofPublicPageViewAnalytics(publicPageViewAnalytics: PublicPageViewAnalyticsFilter) =
                Filter(publicPageViewAnalytics = publicPageViewAnalytics)

            @JvmStatic
            fun ofPublicCtaAnalytics(publicCtaAnalytics: PublicCtaAnalyticsFilter) =
                Filter(publicCtaAnalytics = publicCtaAnalytics)

            @JvmStatic
            fun ofPublicEventAnalytics(publicEventAnalytics: PublicEventAnalyticsFilter) =
                Filter(publicEventAnalytics = publicEventAnalytics)

            @JvmStatic
            fun ofPublicFormSubmission(publicFormSubmission: PublicFormSubmissionFilter) =
                Filter(publicFormSubmission = publicFormSubmission)

            @JvmStatic
            fun ofPublicFormSubmissionOnPage(
                publicFormSubmissionOnPage: PublicFormSubmissionOnPageFilter
            ) = Filter(publicFormSubmissionOnPage = publicFormSubmissionOnPage)

            @JvmStatic
            fun ofPublicIntegrationEvent(publicIntegrationEvent: PublicIntegrationEventFilter) =
                Filter(publicIntegrationEvent = publicIntegrationEvent)

            @JvmStatic
            fun ofPublicEmailSubscription(publicEmailSubscription: PublicEmailSubscriptionFilter) =
                Filter(publicEmailSubscription = publicEmailSubscription)

            @JvmStatic
            fun ofPublicCommunicationSubscription(
                publicCommunicationSubscription: PublicCommunicationSubscriptionFilter
            ) = Filter(publicCommunicationSubscription = publicCommunicationSubscription)

            @JvmStatic
            fun ofPublicCampaignInfluenced(
                publicCampaignInfluenced: PublicCampaignInfluencedFilter
            ) = Filter(publicCampaignInfluenced = publicCampaignInfluenced)

            @JvmStatic
            fun ofPublicSurveyMonkey(publicSurveyMonkey: PublicSurveyMonkeyFilter) =
                Filter(publicSurveyMonkey = publicSurveyMonkey)

            @JvmStatic
            fun ofPublicSurveyMonkeyValue(publicSurveyMonkeyValue: PublicSurveyMonkeyValueFilter) =
                Filter(publicSurveyMonkeyValue = publicSurveyMonkeyValue)

            @JvmStatic
            fun ofPublicWebinar(publicWebinar: PublicWebinarFilter) =
                Filter(publicWebinar = publicWebinar)

            @JvmStatic
            fun ofPublicEmailEvent(publicEmailEvent: PublicEmailEventFilter) =
                Filter(publicEmailEvent = publicEmailEvent)

            @JvmStatic
            fun ofPublicPrivacyAnalytics(publicPrivacyAnalytics: PublicPrivacyAnalyticsFilter) =
                Filter(publicPrivacyAnalytics = publicPrivacyAnalytics)

            @JvmStatic
            fun ofPublicAdsSearch(publicAdsSearch: PublicAdsSearchFilter) =
                Filter(publicAdsSearch = publicAdsSearch)

            @JvmStatic
            fun ofPublicAdsTime(publicAdsTime: PublicAdsTimeFilter) =
                Filter(publicAdsTime = publicAdsTime)

            @JvmStatic
            fun ofPublicInList(publicInList: PublicInListFilter) =
                Filter(publicInList = publicInList)

            @JvmStatic
            fun ofPublicNumAssociations(publicNumAssociations: PublicNumAssociationsFilter) =
                Filter(publicNumAssociations = publicNumAssociations)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilter) =
                Filter(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociationInList(
                publicPropertyAssociationInList: PublicPropertyAssociationInListFilter
            ) = Filter(publicPropertyAssociationInList = publicPropertyAssociationInList)

            @JvmStatic
            fun ofPublicConstant(publicConstant: PublicConstantFilter) =
                Filter(publicConstant = publicConstant)
        }

        /** An interface that defines how to map each variant of [Filter] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitPublicProperty(publicProperty: PublicPropertyFilter): T

            fun visitPublicAssociationInList(
                publicAssociationInList: PublicAssociationInListFilter
            ): T

            fun visitPublicPageViewAnalytics(
                publicPageViewAnalytics: PublicPageViewAnalyticsFilter
            ): T

            fun visitPublicCtaAnalytics(publicCtaAnalytics: PublicCtaAnalyticsFilter): T

            fun visitPublicEventAnalytics(publicEventAnalytics: PublicEventAnalyticsFilter): T

            fun visitPublicFormSubmission(publicFormSubmission: PublicFormSubmissionFilter): T

            fun visitPublicFormSubmissionOnPage(
                publicFormSubmissionOnPage: PublicFormSubmissionOnPageFilter
            ): T

            fun visitPublicIntegrationEvent(publicIntegrationEvent: PublicIntegrationEventFilter): T

            fun visitPublicEmailSubscription(
                publicEmailSubscription: PublicEmailSubscriptionFilter
            ): T

            fun visitPublicCommunicationSubscription(
                publicCommunicationSubscription: PublicCommunicationSubscriptionFilter
            ): T

            fun visitPublicCampaignInfluenced(
                publicCampaignInfluenced: PublicCampaignInfluencedFilter
            ): T

            fun visitPublicSurveyMonkey(publicSurveyMonkey: PublicSurveyMonkeyFilter): T

            fun visitPublicSurveyMonkeyValue(
                publicSurveyMonkeyValue: PublicSurveyMonkeyValueFilter
            ): T

            fun visitPublicWebinar(publicWebinar: PublicWebinarFilter): T

            fun visitPublicEmailEvent(publicEmailEvent: PublicEmailEventFilter): T

            fun visitPublicPrivacyAnalytics(publicPrivacyAnalytics: PublicPrivacyAnalyticsFilter): T

            fun visitPublicAdsSearch(publicAdsSearch: PublicAdsSearchFilter): T

            fun visitPublicAdsTime(publicAdsTime: PublicAdsTimeFilter): T

            fun visitPublicInList(publicInList: PublicInListFilter): T

            fun visitPublicNumAssociations(publicNumAssociations: PublicNumAssociationsFilter): T

            fun visitPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilter): T

            fun visitPublicPropertyAssociationInList(
                publicPropertyAssociationInList: PublicPropertyAssociationInListFilter
            ): T

            fun visitPublicConstant(publicConstant: PublicConstantFilter): T

            /**
             * Maps an unknown variant of [Filter] to a value of type [T].
             *
             * An instance of [Filter] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Filter: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Filter>(Filter::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Filter {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicPropertyFilter>())?.let {
                                Filter(publicProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationInListFilter>())
                                ?.let { Filter(publicAssociationInList = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicPageViewAnalyticsFilter>())
                                ?.let { Filter(publicPageViewAnalytics = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicCtaAnalyticsFilter>())?.let {
                                Filter(publicCtaAnalytics = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicEventAnalyticsFilter>())
                                ?.let { Filter(publicEventAnalytics = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicFormSubmissionFilter>())
                                ?.let { Filter(publicFormSubmission = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicFormSubmissionOnPageFilter>())
                                ?.let { Filter(publicFormSubmissionOnPage = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicIntegrationEventFilter>())
                                ?.let { Filter(publicIntegrationEvent = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicEmailSubscriptionFilter>())
                                ?.let { Filter(publicEmailSubscription = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicCommunicationSubscriptionFilter>(),
                                )
                                ?.let {
                                    Filter(publicCommunicationSubscription = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicCampaignInfluencedFilter>())
                                ?.let { Filter(publicCampaignInfluenced = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicSurveyMonkeyFilter>())?.let {
                                Filter(publicSurveyMonkey = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicSurveyMonkeyValueFilter>())
                                ?.let { Filter(publicSurveyMonkeyValue = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicWebinarFilter>())?.let {
                                Filter(publicWebinar = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicEmailEventFilter>())?.let {
                                Filter(publicEmailEvent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicPrivacyAnalyticsFilter>())
                                ?.let { Filter(publicPrivacyAnalytics = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicAdsSearchFilter>())?.let {
                                Filter(publicAdsSearch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAdsTimeFilter>())?.let {
                                Filter(publicAdsTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicInListFilter>())?.let {
                                Filter(publicInList = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNumAssociationsFilter>())
                                ?.let { Filter(publicNumAssociations = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilter>())?.let {
                                Filter(publicUnifiedEvents = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationInListFilter>(),
                                )
                                ?.let {
                                    Filter(publicPropertyAssociationInList = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicConstantFilter>())?.let {
                                Filter(publicConstant = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Filter(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Filter>(Filter::class) {

            override fun serialize(
                value: Filter,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicProperty != null -> generator.writeObject(value.publicProperty)
                    value.publicAssociationInList != null ->
                        generator.writeObject(value.publicAssociationInList)
                    value.publicPageViewAnalytics != null ->
                        generator.writeObject(value.publicPageViewAnalytics)
                    value.publicCtaAnalytics != null ->
                        generator.writeObject(value.publicCtaAnalytics)
                    value.publicEventAnalytics != null ->
                        generator.writeObject(value.publicEventAnalytics)
                    value.publicFormSubmission != null ->
                        generator.writeObject(value.publicFormSubmission)
                    value.publicFormSubmissionOnPage != null ->
                        generator.writeObject(value.publicFormSubmissionOnPage)
                    value.publicIntegrationEvent != null ->
                        generator.writeObject(value.publicIntegrationEvent)
                    value.publicEmailSubscription != null ->
                        generator.writeObject(value.publicEmailSubscription)
                    value.publicCommunicationSubscription != null ->
                        generator.writeObject(value.publicCommunicationSubscription)
                    value.publicCampaignInfluenced != null ->
                        generator.writeObject(value.publicCampaignInfluenced)
                    value.publicSurveyMonkey != null ->
                        generator.writeObject(value.publicSurveyMonkey)
                    value.publicSurveyMonkeyValue != null ->
                        generator.writeObject(value.publicSurveyMonkeyValue)
                    value.publicWebinar != null -> generator.writeObject(value.publicWebinar)
                    value.publicEmailEvent != null -> generator.writeObject(value.publicEmailEvent)
                    value.publicPrivacyAnalytics != null ->
                        generator.writeObject(value.publicPrivacyAnalytics)
                    value.publicAdsSearch != null -> generator.writeObject(value.publicAdsSearch)
                    value.publicAdsTime != null -> generator.writeObject(value.publicAdsTime)
                    value.publicInList != null -> generator.writeObject(value.publicInList)
                    value.publicNumAssociations != null ->
                        generator.writeObject(value.publicNumAssociations)
                    value.publicUnifiedEvents != null ->
                        generator.writeObject(value.publicUnifiedEvents)
                    value.publicPropertyAssociationInList != null ->
                        generator.writeObject(value.publicPropertyAssociationInList)
                    value.publicConstant != null -> generator.writeObject(value.publicConstant)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Filter")
                }
            }
        }
    }

    /**
     * Defines the operation to be applied within the filter branch (HAS_COMPLETED,
     * HAS_NOT_COMPLETED).
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

            @JvmField val HAS_COMPLETED = of("HAS_COMPLETED")

            @JvmField val HAS_NOT_COMPLETED = of("HAS_NOT_COMPLETED")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            HAS_COMPLETED,
            HAS_NOT_COMPLETED,
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
            HAS_COMPLETED,
            HAS_NOT_COMPLETED,
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
                HAS_COMPLETED -> Value.HAS_COMPLETED
                HAS_NOT_COMPLETED -> Value.HAS_NOT_COMPLETED
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
                HAS_COMPLETED -> Known.HAS_COMPLETED
                HAS_NOT_COMPLETED -> Known.HAS_NOT_COMPLETED
                else -> throw HubspotInvalidDataException("Unknown Operator: $value")
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

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies the criteria for refining the filter by coalescing. */
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
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown PruningRefineBy: $json")
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

        return other is PublicUnifiedEventsFilterBranch &&
            eventTypeId == other.eventTypeId &&
            filterBranches == other.filterBranches &&
            filterBranchOperator == other.filterBranchOperator &&
            filterBranchType == other.filterBranchType &&
            filters == other.filters &&
            operator == other.operator &&
            coalescingRefineBy == other.coalescingRefineBy &&
            pruningRefineBy == other.pruningRefineBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventTypeId,
            filterBranches,
            filterBranchOperator,
            filterBranchType,
            filters,
            operator,
            coalescingRefineBy,
            pruningRefineBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicUnifiedEventsFilterBranch{eventTypeId=$eventTypeId, filterBranches=$filterBranches, filterBranchOperator=$filterBranchOperator, filterBranchType=$filterBranchType, filters=$filters, operator=$operator, coalescingRefineBy=$coalescingRefineBy, pruningRefineBy=$pruningRefineBy, additionalProperties=$additionalProperties}"
}
