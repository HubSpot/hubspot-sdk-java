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
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypeId(): String = eventTypeId.getRequired("eventTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranches(): List<FilterBranch> = filterBranches.getRequired("filterBranches")

    /**
     * The logical operator used to combine filters within the branch (AND).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranchOperator(): String = filterBranchOperator.getRequired("filterBranchOperator")

    /**
     * The type of the filter branch (UNIFIED_EVENTS).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranchType(): FilterBranchType = filterBranchType.getRequired("filterBranchType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<Filter> = filters.getRequired("filters")

    /**
     * Defines the operation to be applied within the filter branch (HAS_COMPLETED,
     * HAS_NOT_COMPLETED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * Specifies the criteria for refining the filter by coalescing.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coalescingRefineBy(): Optional<CoalescingRefineBy> =
        coalescingRefineBy.getOptional("coalescingRefineBy")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofOr(or)`. */
        fun addFilterBranch(or: PublicOrFilterBranch) = addFilterBranch(FilterBranch.ofOr(or))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofAnd(and)`. */
        fun addFilterBranch(and: PublicAndFilterBranch) = addFilterBranch(FilterBranch.ofAnd(and))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofNotAll(notAll)`. */
        fun addFilterBranch(notAll: PublicNotAllFilterBranch) =
            addFilterBranch(FilterBranch.ofNotAll(notAll))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofNotAny(notAny)`. */
        fun addFilterBranch(notAny: PublicNotAnyFilterBranch) =
            addFilterBranch(FilterBranch.ofNotAny(notAny))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofRestricted(restricted)`. */
        fun addFilterBranch(restricted: PublicRestrictedFilterBranch) =
            addFilterBranch(FilterBranch.ofRestricted(restricted))

        /**
         * Alias for calling [addFilterBranch] with `FilterBranch.ofUnifiedEvents(unifiedEvents)`.
         */
        fun addFilterBranch(unifiedEvents: PublicUnifiedEventsFilterBranch) =
            addFilterBranch(FilterBranch.ofUnifiedEvents(unifiedEvents))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofAssociation(association)`. */
        fun addFilterBranch(association: PublicAssociationFilterBranch) =
            addFilterBranch(FilterBranch.ofAssociation(association))

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

        /** Alias for calling [addFilter] with `Filter.ofProperty(property)`. */
        fun addFilter(property: PublicPropertyFilter) = addFilter(Filter.ofProperty(property))

        /** Alias for calling [addFilter] with `Filter.ofAssociation(association)`. */
        fun addFilter(association: PublicAssociationInListFilter) =
            addFilter(Filter.ofAssociation(association))

        /** Alias for calling [addFilter] with `Filter.ofPageView(pageView)`. */
        fun addFilter(pageView: PublicPageViewAnalyticsFilter) =
            addFilter(Filter.ofPageView(pageView))

        /** Alias for calling [addFilter] with `Filter.ofCta(cta)`. */
        fun addFilter(cta: PublicCtaAnalyticsFilter) = addFilter(Filter.ofCta(cta))

        /** Alias for calling [addFilter] with `Filter.ofEvent(event)`. */
        fun addFilter(event: PublicEventAnalyticsFilter) = addFilter(Filter.ofEvent(event))

        /** Alias for calling [addFilter] with `Filter.ofFormSubmission(formSubmission)`. */
        fun addFilter(formSubmission: PublicFormSubmissionFilter) =
            addFilter(Filter.ofFormSubmission(formSubmission))

        /**
         * Alias for calling [addFilter] with the following:
         * ```java
         * PublicFormSubmissionFilter.builder()
         *     .filterType(PublicFormSubmissionFilter.FilterType.FORM_SUBMISSION)
         *     .operator(operator)
         *     .build()
         * ```
         */
        fun addFormSubmissionFilter(operator: PublicFormSubmissionFilter.Operator) =
            addFilter(
                PublicFormSubmissionFilter.builder()
                    .filterType(PublicFormSubmissionFilter.FilterType.FORM_SUBMISSION)
                    .operator(operator)
                    .build()
            )

        /**
         * Alias for calling [addFilter] with `Filter.ofFormSubmissionOnPage(formSubmissionOnPage)`.
         */
        fun addFilter(formSubmissionOnPage: PublicFormSubmissionOnPageFilter) =
            addFilter(Filter.ofFormSubmissionOnPage(formSubmissionOnPage))

        /** Alias for calling [addFilter] with `Filter.ofIntegrationEvent(integrationEvent)`. */
        fun addFilter(integrationEvent: PublicIntegrationEventFilter) =
            addFilter(Filter.ofIntegrationEvent(integrationEvent))

        /** Alias for calling [addFilter] with `Filter.ofEmailSubscription(emailSubscription)`. */
        fun addFilter(emailSubscription: PublicEmailSubscriptionFilter) =
            addFilter(Filter.ofEmailSubscription(emailSubscription))

        /**
         * Alias for calling [addFilter] with
         * `Filter.ofCommunicationSubscription(communicationSubscription)`.
         */
        fun addFilter(communicationSubscription: PublicCommunicationSubscriptionFilter) =
            addFilter(Filter.ofCommunicationSubscription(communicationSubscription))

        /** Alias for calling [addFilter] with `Filter.ofSurveyMonkey(surveyMonkey)`. */
        fun addFilter(surveyMonkey: PublicSurveyMonkeyFilter) =
            addFilter(Filter.ofSurveyMonkey(surveyMonkey))

        /** Alias for calling [addFilter] with `Filter.ofSurveyMonkeyValue(surveyMonkeyValue)`. */
        fun addFilter(surveyMonkeyValue: PublicSurveyMonkeyValueFilter) =
            addFilter(Filter.ofSurveyMonkeyValue(surveyMonkeyValue))

        /** Alias for calling [addFilter] with `Filter.ofWebinar(webinar)`. */
        fun addFilter(webinar: PublicWebinarFilter) = addFilter(Filter.ofWebinar(webinar))

        /**
         * Alias for calling [addFilter] with the following:
         * ```java
         * PublicWebinarFilter.builder()
         *     .filterType(PublicWebinarFilter.FilterType.WEBINAR)
         *     .operator(operator)
         *     .build()
         * ```
         */
        fun addWebinarFilter(operator: String) =
            addFilter(
                PublicWebinarFilter.builder()
                    .filterType(PublicWebinarFilter.FilterType.WEBINAR)
                    .operator(operator)
                    .build()
            )

        /** Alias for calling [addFilter] with `Filter.ofEmailEvent(emailEvent)`. */
        fun addFilter(emailEvent: PublicEmailEventFilter) =
            addFilter(Filter.ofEmailEvent(emailEvent))

        /** Alias for calling [addFilter] with `Filter.ofPrivacy(privacy)`. */
        fun addFilter(privacy: PublicPrivacyAnalyticsFilter) = addFilter(Filter.ofPrivacy(privacy))

        /** Alias for calling [addFilter] with `Filter.ofAdsSearch(adsSearch)`. */
        fun addFilter(adsSearch: PublicAdsSearchFilter) = addFilter(Filter.ofAdsSearch(adsSearch))

        /** Alias for calling [addFilter] with `Filter.ofAdsTime(adsTime)`. */
        fun addFilter(adsTime: PublicAdsTimeFilter) = addFilter(Filter.ofAdsTime(adsTime))

        /**
         * Alias for calling [addFilter] with the following:
         * ```java
         * PublicAdsTimeFilter.builder()
         *     .filterType(PublicAdsTimeFilter.FilterType.ADS_TIME)
         *     .pruningRefineBy(pruningRefineBy)
         *     .build()
         * ```
         */
        fun addAdsTimeFilter(pruningRefineBy: PublicAdsTimeFilter.PruningRefineBy) =
            addFilter(
                PublicAdsTimeFilter.builder()
                    .filterType(PublicAdsTimeFilter.FilterType.ADS_TIME)
                    .pruningRefineBy(pruningRefineBy)
                    .build()
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofNumOccurrences(numOccurrences)`.
         */
        fun addAdsTimeFilter(numOccurrences: PublicNumOccurrencesRefineBy) =
            addAdsTimeFilter(PublicAdsTimeFilter.PruningRefineBy.ofNumOccurrences(numOccurrences))

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofSetOccurrences(setOccurrences)`.
         */
        fun addAdsTimeFilter(setOccurrences: PublicSetOccurrencesRefineBy) =
            addAdsTimeFilter(PublicAdsTimeFilter.PruningRefineBy.ofSetOccurrences(setOccurrences))

        /**
         * Alias for calling [addAdsTimeFilter] with the following:
         * ```java
         * PublicSetOccurrencesRefineBy.builder()
         *     .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
         *     .setType(setType)
         *     .build()
         * ```
         */
        fun addSetOccurrencesAdsTimeFilter(setType: String) =
            addAdsTimeFilter(
                PublicSetOccurrencesRefineBy.builder()
                    .type(PublicSetOccurrencesRefineBy.Type.SET_OCCURRENCES)
                    .setType(setType)
                    .build()
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofRelativeComparative(relativeComparative)`.
         */
        fun addAdsTimeFilter(relativeComparative: PublicRelativeComparativeTimestampRefineBy) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofRelativeComparative(relativeComparative)
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofRelativeRanged(relativeRanged)`.
         */
        fun addAdsTimeFilter(relativeRanged: PublicRelativeRangedTimestampRefineBy) =
            addAdsTimeFilter(PublicAdsTimeFilter.PruningRefineBy.ofRelativeRanged(relativeRanged))

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofAbsoluteComparative(absoluteComparative)`.
         */
        fun addAdsTimeFilter(absoluteComparative: PublicAbsoluteComparativeTimestampRefineBy) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofAbsoluteComparative(absoluteComparative)
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofAbsoluteRanged(absoluteRanged)`.
         */
        fun addAdsTimeFilter(absoluteRanged: PublicAbsoluteRangedTimestampRefineBy) =
            addAdsTimeFilter(PublicAdsTimeFilter.PruningRefineBy.ofAbsoluteRanged(absoluteRanged))

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofAllHistory(allHistory)`.
         */
        fun addAdsTimeFilter(allHistory: PublicAllHistoryRefineBy) =
            addAdsTimeFilter(PublicAdsTimeFilter.PruningRefineBy.ofAllHistory(allHistory))

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicTimePointOperation(publicTimePointOperation)`.
         */
        fun addAdsTimeFilter(publicTimePointOperation: PublicTimePointOperation) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicTimePointOperation(
                    publicTimePointOperation
                )
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofTimeRanged(timeRanged)`.
         */
        fun addAdsTimeFilter(timeRanged: PublicRangedTimeOperation) =
            addAdsTimeFilter(PublicAdsTimeFilter.PruningRefineBy.ofTimeRanged(timeRanged))

        /** Alias for calling [addFilter] with `Filter.ofInList(inList)`. */
        fun addFilter(inList: PublicInListFilter) = addFilter(Filter.ofInList(inList))

        /** Alias for calling [addFilter] with `Filter.ofUnifiedEvents(unifiedEvents)`. */
        fun addFilter(unifiedEvents: PublicUnifiedEventsFilter) =
            addFilter(Filter.ofUnifiedEvents(unifiedEvents))

        /**
         * Alias for calling [addFilter] with the following:
         * ```java
         * PublicUnifiedEventsFilter.builder()
         *     .filterType(PublicUnifiedEventsFilter.FilterType.UNIFIED_EVENTS)
         *     .filterLines(filterLines)
         *     .build()
         * ```
         */
        fun addUnifiedEventsFilter(filterLines: List<PublicEventFilterMetadata>) =
            addFilter(
                PublicUnifiedEventsFilter.builder()
                    .filterType(PublicUnifiedEventsFilter.FilterType.UNIFIED_EVENTS)
                    .filterLines(filterLines)
                    .build()
            )

        /** Alias for calling [addFilter] with `Filter.ofConstant(constant)`. */
        fun addFilter(constant: PublicConstantFilter) = addFilter(Filter.ofConstant(constant))

        /**
         * Alias for calling [addFilter] with the following:
         * ```java
         * PublicConstantFilter.builder()
         *     .filterType(PublicConstantFilter.FilterType.CONSTANT)
         *     .shouldAccept(shouldAccept)
         *     .build()
         * ```
         */
        fun addConstantFilter(shouldAccept: Boolean) =
            addFilter(
                PublicConstantFilter.builder()
                    .filterType(PublicConstantFilter.FilterType.CONSTANT)
                    .shouldAccept(shouldAccept)
                    .build()
            )

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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
        private val or: PublicOrFilterBranch? = null,
        private val and: PublicAndFilterBranch? = null,
        private val notAll: PublicNotAllFilterBranch? = null,
        private val notAny: PublicNotAnyFilterBranch? = null,
        private val restricted: PublicRestrictedFilterBranch? = null,
        private val unifiedEvents: PublicUnifiedEventsFilterBranch? = null,
        private val association: PublicAssociationFilterBranch? = null,
        private val _json: JsonValue? = null,
    ) {

        fun or(): Optional<PublicOrFilterBranch> = Optional.ofNullable(or)

        fun and(): Optional<PublicAndFilterBranch> = Optional.ofNullable(and)

        fun notAll(): Optional<PublicNotAllFilterBranch> = Optional.ofNullable(notAll)

        fun notAny(): Optional<PublicNotAnyFilterBranch> = Optional.ofNullable(notAny)

        fun restricted(): Optional<PublicRestrictedFilterBranch> = Optional.ofNullable(restricted)

        fun unifiedEvents(): Optional<PublicUnifiedEventsFilterBranch> =
            Optional.ofNullable(unifiedEvents)

        fun association(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(association)

        fun isOr(): Boolean = or != null

        fun isAnd(): Boolean = and != null

        fun isNotAll(): Boolean = notAll != null

        fun isNotAny(): Boolean = notAny != null

        fun isRestricted(): Boolean = restricted != null

        fun isUnifiedEvents(): Boolean = unifiedEvents != null

        fun isAssociation(): Boolean = association != null

        fun asOr(): PublicOrFilterBranch = or.getOrThrow("or")

        fun asAnd(): PublicAndFilterBranch = and.getOrThrow("and")

        fun asNotAll(): PublicNotAllFilterBranch = notAll.getOrThrow("notAll")

        fun asNotAny(): PublicNotAnyFilterBranch = notAny.getOrThrow("notAny")

        fun asRestricted(): PublicRestrictedFilterBranch = restricted.getOrThrow("restricted")

        fun asUnifiedEvents(): PublicUnifiedEventsFilterBranch =
            unifiedEvents.getOrThrow("unifiedEvents")

        fun asAssociation(): PublicAssociationFilterBranch = association.getOrThrow("association")

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
         * Optional<String> result = filterBranch.accept(new FilterBranch.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitOr(PublicOrFilterBranch or) {
         *         return Optional.of(or.toString());
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
                or != null -> visitor.visitOr(or)
                and != null -> visitor.visitAnd(and)
                notAll != null -> visitor.visitNotAll(notAll)
                notAny != null -> visitor.visitNotAny(notAny)
                restricted != null -> visitor.visitRestricted(restricted)
                unifiedEvents != null -> visitor.visitUnifiedEvents(unifiedEvents)
                association != null -> visitor.visitAssociation(association)
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
        fun validate(): FilterBranch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOr(or: PublicOrFilterBranch) {
                        or.validate()
                    }

                    override fun visitAnd(and: PublicAndFilterBranch) {
                        and.validate()
                    }

                    override fun visitNotAll(notAll: PublicNotAllFilterBranch) {
                        notAll.validate()
                    }

                    override fun visitNotAny(notAny: PublicNotAnyFilterBranch) {
                        notAny.validate()
                    }

                    override fun visitRestricted(restricted: PublicRestrictedFilterBranch) {
                        restricted.validate()
                    }

                    override fun visitUnifiedEvents(
                        unifiedEvents: PublicUnifiedEventsFilterBranch
                    ) {
                        unifiedEvents.validate()
                    }

                    override fun visitAssociation(association: PublicAssociationFilterBranch) {
                        association.validate()
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
                    override fun visitOr(or: PublicOrFilterBranch) = or.validity()

                    override fun visitAnd(and: PublicAndFilterBranch) = and.validity()

                    override fun visitNotAll(notAll: PublicNotAllFilterBranch) = notAll.validity()

                    override fun visitNotAny(notAny: PublicNotAnyFilterBranch) = notAny.validity()

                    override fun visitRestricted(restricted: PublicRestrictedFilterBranch) =
                        restricted.validity()

                    override fun visitUnifiedEvents(
                        unifiedEvents: PublicUnifiedEventsFilterBranch
                    ) = unifiedEvents.validity()

                    override fun visitAssociation(association: PublicAssociationFilterBranch) =
                        association.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FilterBranch &&
                or == other.or &&
                and == other.and &&
                notAll == other.notAll &&
                notAny == other.notAny &&
                restricted == other.restricted &&
                unifiedEvents == other.unifiedEvents &&
                association == other.association
        }

        override fun hashCode(): Int =
            Objects.hash(or, and, notAll, notAny, restricted, unifiedEvents, association)

        override fun toString(): String =
            when {
                or != null -> "FilterBranch{or=$or}"
                and != null -> "FilterBranch{and=$and}"
                notAll != null -> "FilterBranch{notAll=$notAll}"
                notAny != null -> "FilterBranch{notAny=$notAny}"
                restricted != null -> "FilterBranch{restricted=$restricted}"
                unifiedEvents != null -> "FilterBranch{unifiedEvents=$unifiedEvents}"
                association != null -> "FilterBranch{association=$association}"
                _json != null -> "FilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FilterBranch")
            }

        companion object {

            @JvmStatic fun ofOr(or: PublicOrFilterBranch) = FilterBranch(or = or)

            @JvmStatic fun ofAnd(and: PublicAndFilterBranch) = FilterBranch(and = and)

            @JvmStatic
            fun ofNotAll(notAll: PublicNotAllFilterBranch) = FilterBranch(notAll = notAll)

            @JvmStatic
            fun ofNotAny(notAny: PublicNotAnyFilterBranch) = FilterBranch(notAny = notAny)

            @JvmStatic
            fun ofRestricted(restricted: PublicRestrictedFilterBranch) =
                FilterBranch(restricted = restricted)

            @JvmStatic
            fun ofUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilterBranch) =
                FilterBranch(unifiedEvents = unifiedEvents)

            @JvmStatic
            fun ofAssociation(association: PublicAssociationFilterBranch) =
                FilterBranch(association = association)
        }

        /**
         * An interface that defines how to map each variant of [FilterBranch] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitOr(or: PublicOrFilterBranch): T

            fun visitAnd(and: PublicAndFilterBranch): T

            fun visitNotAll(notAll: PublicNotAllFilterBranch): T

            fun visitNotAny(notAny: PublicNotAnyFilterBranch): T

            fun visitRestricted(restricted: PublicRestrictedFilterBranch): T

            fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilterBranch): T

            fun visitAssociation(association: PublicAssociationFilterBranch): T

            /**
             * Maps an unknown variant of [FilterBranch] to a value of type [T].
             *
             * An instance of [FilterBranch] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown FilterBranch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FilterBranch>(FilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FilterBranch {
                val json = JsonValue.fromJsonNode(node)
                val filterBranchType =
                    json.asObject().getOrNull()?.get("filterBranchType")?.asString()?.getOrNull()

                when (filterBranchType) {
                    "OR" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                            FilterBranch(or = it, _json = json)
                        } ?: FilterBranch(_json = json)
                    }
                    "AND" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                            FilterBranch(and = it, _json = json)
                        } ?: FilterBranch(_json = json)
                    }
                    "NOT_ALL" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())
                            ?.let { FilterBranch(notAll = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "NOT_ANY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())
                            ?.let { FilterBranch(notAny = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "RESTRICTED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                            ?.let { FilterBranch(restricted = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "UNIFIED_EVENTS" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicUnifiedEventsFilterBranch>(),
                            )
                            ?.let { FilterBranch(unifiedEvents = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "ASSOCIATION" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                            ?.let { FilterBranch(association = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                }

                return FilterBranch(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<FilterBranch>(FilterBranch::class) {

            override fun serialize(
                value: FilterBranch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.or != null -> generator.writeObject(value.or)
                    value.and != null -> generator.writeObject(value.and)
                    value.notAll != null -> generator.writeObject(value.notAll)
                    value.notAny != null -> generator.writeObject(value.notAny)
                    value.restricted != null -> generator.writeObject(value.restricted)
                    value.unifiedEvents != null -> generator.writeObject(value.unifiedEvents)
                    value.association != null -> generator.writeObject(value.association)
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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                UNIFIED_EVENTS -> Known.UNIFIED_EVENTS
                else -> throw HubSpotInvalidDataException("Unknown FilterBranchType: $value")
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

            return other is FilterBranchType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Filter.Deserializer::class)
    @JsonSerialize(using = Filter.Serializer::class)
    class Filter
    private constructor(
        private val property: PublicPropertyFilter? = null,
        private val association: PublicAssociationInListFilter? = null,
        private val pageView: PublicPageViewAnalyticsFilter? = null,
        private val cta: PublicCtaAnalyticsFilter? = null,
        private val event: PublicEventAnalyticsFilter? = null,
        private val formSubmission: PublicFormSubmissionFilter? = null,
        private val formSubmissionOnPage: PublicFormSubmissionOnPageFilter? = null,
        private val integrationEvent: PublicIntegrationEventFilter? = null,
        private val emailSubscription: PublicEmailSubscriptionFilter? = null,
        private val communicationSubscription: PublicCommunicationSubscriptionFilter? = null,
        private val surveyMonkey: PublicSurveyMonkeyFilter? = null,
        private val surveyMonkeyValue: PublicSurveyMonkeyValueFilter? = null,
        private val webinar: PublicWebinarFilter? = null,
        private val emailEvent: PublicEmailEventFilter? = null,
        private val privacy: PublicPrivacyAnalyticsFilter? = null,
        private val adsSearch: PublicAdsSearchFilter? = null,
        private val adsTime: PublicAdsTimeFilter? = null,
        private val inList: PublicInListFilter? = null,
        private val unifiedEvents: PublicUnifiedEventsFilter? = null,
        private val constant: PublicConstantFilter? = null,
        private val _json: JsonValue? = null,
    ) {

        fun property(): Optional<PublicPropertyFilter> = Optional.ofNullable(property)

        fun association(): Optional<PublicAssociationInListFilter> =
            Optional.ofNullable(association)

        fun pageView(): Optional<PublicPageViewAnalyticsFilter> = Optional.ofNullable(pageView)

        fun cta(): Optional<PublicCtaAnalyticsFilter> = Optional.ofNullable(cta)

        fun event(): Optional<PublicEventAnalyticsFilter> = Optional.ofNullable(event)

        fun formSubmission(): Optional<PublicFormSubmissionFilter> =
            Optional.ofNullable(formSubmission)

        fun formSubmissionOnPage(): Optional<PublicFormSubmissionOnPageFilter> =
            Optional.ofNullable(formSubmissionOnPage)

        fun integrationEvent(): Optional<PublicIntegrationEventFilter> =
            Optional.ofNullable(integrationEvent)

        fun emailSubscription(): Optional<PublicEmailSubscriptionFilter> =
            Optional.ofNullable(emailSubscription)

        fun communicationSubscription(): Optional<PublicCommunicationSubscriptionFilter> =
            Optional.ofNullable(communicationSubscription)

        fun surveyMonkey(): Optional<PublicSurveyMonkeyFilter> = Optional.ofNullable(surveyMonkey)

        fun surveyMonkeyValue(): Optional<PublicSurveyMonkeyValueFilter> =
            Optional.ofNullable(surveyMonkeyValue)

        fun webinar(): Optional<PublicWebinarFilter> = Optional.ofNullable(webinar)

        fun emailEvent(): Optional<PublicEmailEventFilter> = Optional.ofNullable(emailEvent)

        fun privacy(): Optional<PublicPrivacyAnalyticsFilter> = Optional.ofNullable(privacy)

        fun adsSearch(): Optional<PublicAdsSearchFilter> = Optional.ofNullable(adsSearch)

        fun adsTime(): Optional<PublicAdsTimeFilter> = Optional.ofNullable(adsTime)

        fun inList(): Optional<PublicInListFilter> = Optional.ofNullable(inList)

        fun unifiedEvents(): Optional<PublicUnifiedEventsFilter> =
            Optional.ofNullable(unifiedEvents)

        fun constant(): Optional<PublicConstantFilter> = Optional.ofNullable(constant)

        fun isProperty(): Boolean = property != null

        fun isAssociation(): Boolean = association != null

        fun isPageView(): Boolean = pageView != null

        fun isCta(): Boolean = cta != null

        fun isEvent(): Boolean = event != null

        fun isFormSubmission(): Boolean = formSubmission != null

        fun isFormSubmissionOnPage(): Boolean = formSubmissionOnPage != null

        fun isIntegrationEvent(): Boolean = integrationEvent != null

        fun isEmailSubscription(): Boolean = emailSubscription != null

        fun isCommunicationSubscription(): Boolean = communicationSubscription != null

        fun isSurveyMonkey(): Boolean = surveyMonkey != null

        fun isSurveyMonkeyValue(): Boolean = surveyMonkeyValue != null

        fun isWebinar(): Boolean = webinar != null

        fun isEmailEvent(): Boolean = emailEvent != null

        fun isPrivacy(): Boolean = privacy != null

        fun isAdsSearch(): Boolean = adsSearch != null

        fun isAdsTime(): Boolean = adsTime != null

        fun isInList(): Boolean = inList != null

        fun isUnifiedEvents(): Boolean = unifiedEvents != null

        fun isConstant(): Boolean = constant != null

        fun asProperty(): PublicPropertyFilter = property.getOrThrow("property")

        fun asAssociation(): PublicAssociationInListFilter = association.getOrThrow("association")

        fun asPageView(): PublicPageViewAnalyticsFilter = pageView.getOrThrow("pageView")

        fun asCta(): PublicCtaAnalyticsFilter = cta.getOrThrow("cta")

        fun asEvent(): PublicEventAnalyticsFilter = event.getOrThrow("event")

        fun asFormSubmission(): PublicFormSubmissionFilter =
            formSubmission.getOrThrow("formSubmission")

        fun asFormSubmissionOnPage(): PublicFormSubmissionOnPageFilter =
            formSubmissionOnPage.getOrThrow("formSubmissionOnPage")

        fun asIntegrationEvent(): PublicIntegrationEventFilter =
            integrationEvent.getOrThrow("integrationEvent")

        fun asEmailSubscription(): PublicEmailSubscriptionFilter =
            emailSubscription.getOrThrow("emailSubscription")

        fun asCommunicationSubscription(): PublicCommunicationSubscriptionFilter =
            communicationSubscription.getOrThrow("communicationSubscription")

        fun asSurveyMonkey(): PublicSurveyMonkeyFilter = surveyMonkey.getOrThrow("surveyMonkey")

        fun asSurveyMonkeyValue(): PublicSurveyMonkeyValueFilter =
            surveyMonkeyValue.getOrThrow("surveyMonkeyValue")

        fun asWebinar(): PublicWebinarFilter = webinar.getOrThrow("webinar")

        fun asEmailEvent(): PublicEmailEventFilter = emailEvent.getOrThrow("emailEvent")

        fun asPrivacy(): PublicPrivacyAnalyticsFilter = privacy.getOrThrow("privacy")

        fun asAdsSearch(): PublicAdsSearchFilter = adsSearch.getOrThrow("adsSearch")

        fun asAdsTime(): PublicAdsTimeFilter = adsTime.getOrThrow("adsTime")

        fun asInList(): PublicInListFilter = inList.getOrThrow("inList")

        fun asUnifiedEvents(): PublicUnifiedEventsFilter = unifiedEvents.getOrThrow("unifiedEvents")

        fun asConstant(): PublicConstantFilter = constant.getOrThrow("constant")

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
         * Optional<String> result = filter.accept(new Filter.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitProperty(PublicPropertyFilter property) {
         *         return Optional.of(property.toString());
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
                property != null -> visitor.visitProperty(property)
                association != null -> visitor.visitAssociation(association)
                pageView != null -> visitor.visitPageView(pageView)
                cta != null -> visitor.visitCta(cta)
                event != null -> visitor.visitEvent(event)
                formSubmission != null -> visitor.visitFormSubmission(formSubmission)
                formSubmissionOnPage != null ->
                    visitor.visitFormSubmissionOnPage(formSubmissionOnPage)
                integrationEvent != null -> visitor.visitIntegrationEvent(integrationEvent)
                emailSubscription != null -> visitor.visitEmailSubscription(emailSubscription)
                communicationSubscription != null ->
                    visitor.visitCommunicationSubscription(communicationSubscription)
                surveyMonkey != null -> visitor.visitSurveyMonkey(surveyMonkey)
                surveyMonkeyValue != null -> visitor.visitSurveyMonkeyValue(surveyMonkeyValue)
                webinar != null -> visitor.visitWebinar(webinar)
                emailEvent != null -> visitor.visitEmailEvent(emailEvent)
                privacy != null -> visitor.visitPrivacy(privacy)
                adsSearch != null -> visitor.visitAdsSearch(adsSearch)
                adsTime != null -> visitor.visitAdsTime(adsTime)
                inList != null -> visitor.visitInList(inList)
                unifiedEvents != null -> visitor.visitUnifiedEvents(unifiedEvents)
                constant != null -> visitor.visitConstant(constant)
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
        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitProperty(property: PublicPropertyFilter) {
                        property.validate()
                    }

                    override fun visitAssociation(association: PublicAssociationInListFilter) {
                        association.validate()
                    }

                    override fun visitPageView(pageView: PublicPageViewAnalyticsFilter) {
                        pageView.validate()
                    }

                    override fun visitCta(cta: PublicCtaAnalyticsFilter) {
                        cta.validate()
                    }

                    override fun visitEvent(event: PublicEventAnalyticsFilter) {
                        event.validate()
                    }

                    override fun visitFormSubmission(formSubmission: PublicFormSubmissionFilter) {
                        formSubmission.validate()
                    }

                    override fun visitFormSubmissionOnPage(
                        formSubmissionOnPage: PublicFormSubmissionOnPageFilter
                    ) {
                        formSubmissionOnPage.validate()
                    }

                    override fun visitIntegrationEvent(
                        integrationEvent: PublicIntegrationEventFilter
                    ) {
                        integrationEvent.validate()
                    }

                    override fun visitEmailSubscription(
                        emailSubscription: PublicEmailSubscriptionFilter
                    ) {
                        emailSubscription.validate()
                    }

                    override fun visitCommunicationSubscription(
                        communicationSubscription: PublicCommunicationSubscriptionFilter
                    ) {
                        communicationSubscription.validate()
                    }

                    override fun visitSurveyMonkey(surveyMonkey: PublicSurveyMonkeyFilter) {
                        surveyMonkey.validate()
                    }

                    override fun visitSurveyMonkeyValue(
                        surveyMonkeyValue: PublicSurveyMonkeyValueFilter
                    ) {
                        surveyMonkeyValue.validate()
                    }

                    override fun visitWebinar(webinar: PublicWebinarFilter) {
                        webinar.validate()
                    }

                    override fun visitEmailEvent(emailEvent: PublicEmailEventFilter) {
                        emailEvent.validate()
                    }

                    override fun visitPrivacy(privacy: PublicPrivacyAnalyticsFilter) {
                        privacy.validate()
                    }

                    override fun visitAdsSearch(adsSearch: PublicAdsSearchFilter) {
                        adsSearch.validate()
                    }

                    override fun visitAdsTime(adsTime: PublicAdsTimeFilter) {
                        adsTime.validate()
                    }

                    override fun visitInList(inList: PublicInListFilter) {
                        inList.validate()
                    }

                    override fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter) {
                        unifiedEvents.validate()
                    }

                    override fun visitConstant(constant: PublicConstantFilter) {
                        constant.validate()
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
                    override fun visitProperty(property: PublicPropertyFilter) = property.validity()

                    override fun visitAssociation(association: PublicAssociationInListFilter) =
                        association.validity()

                    override fun visitPageView(pageView: PublicPageViewAnalyticsFilter) =
                        pageView.validity()

                    override fun visitCta(cta: PublicCtaAnalyticsFilter) = cta.validity()

                    override fun visitEvent(event: PublicEventAnalyticsFilter) = event.validity()

                    override fun visitFormSubmission(formSubmission: PublicFormSubmissionFilter) =
                        formSubmission.validity()

                    override fun visitFormSubmissionOnPage(
                        formSubmissionOnPage: PublicFormSubmissionOnPageFilter
                    ) = formSubmissionOnPage.validity()

                    override fun visitIntegrationEvent(
                        integrationEvent: PublicIntegrationEventFilter
                    ) = integrationEvent.validity()

                    override fun visitEmailSubscription(
                        emailSubscription: PublicEmailSubscriptionFilter
                    ) = emailSubscription.validity()

                    override fun visitCommunicationSubscription(
                        communicationSubscription: PublicCommunicationSubscriptionFilter
                    ) = communicationSubscription.validity()

                    override fun visitSurveyMonkey(surveyMonkey: PublicSurveyMonkeyFilter) =
                        surveyMonkey.validity()

                    override fun visitSurveyMonkeyValue(
                        surveyMonkeyValue: PublicSurveyMonkeyValueFilter
                    ) = surveyMonkeyValue.validity()

                    override fun visitWebinar(webinar: PublicWebinarFilter) = webinar.validity()

                    override fun visitEmailEvent(emailEvent: PublicEmailEventFilter) =
                        emailEvent.validity()

                    override fun visitPrivacy(privacy: PublicPrivacyAnalyticsFilter) =
                        privacy.validity()

                    override fun visitAdsSearch(adsSearch: PublicAdsSearchFilter) =
                        adsSearch.validity()

                    override fun visitAdsTime(adsTime: PublicAdsTimeFilter) = adsTime.validity()

                    override fun visitInList(inList: PublicInListFilter) = inList.validity()

                    override fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter) =
                        unifiedEvents.validity()

                    override fun visitConstant(constant: PublicConstantFilter) = constant.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                property == other.property &&
                association == other.association &&
                pageView == other.pageView &&
                cta == other.cta &&
                event == other.event &&
                formSubmission == other.formSubmission &&
                formSubmissionOnPage == other.formSubmissionOnPage &&
                integrationEvent == other.integrationEvent &&
                emailSubscription == other.emailSubscription &&
                communicationSubscription == other.communicationSubscription &&
                surveyMonkey == other.surveyMonkey &&
                surveyMonkeyValue == other.surveyMonkeyValue &&
                webinar == other.webinar &&
                emailEvent == other.emailEvent &&
                privacy == other.privacy &&
                adsSearch == other.adsSearch &&
                adsTime == other.adsTime &&
                inList == other.inList &&
                unifiedEvents == other.unifiedEvents &&
                constant == other.constant
        }

        override fun hashCode(): Int =
            Objects.hash(
                property,
                association,
                pageView,
                cta,
                event,
                formSubmission,
                formSubmissionOnPage,
                integrationEvent,
                emailSubscription,
                communicationSubscription,
                surveyMonkey,
                surveyMonkeyValue,
                webinar,
                emailEvent,
                privacy,
                adsSearch,
                adsTime,
                inList,
                unifiedEvents,
                constant,
            )

        override fun toString(): String =
            when {
                property != null -> "Filter{property=$property}"
                association != null -> "Filter{association=$association}"
                pageView != null -> "Filter{pageView=$pageView}"
                cta != null -> "Filter{cta=$cta}"
                event != null -> "Filter{event=$event}"
                formSubmission != null -> "Filter{formSubmission=$formSubmission}"
                formSubmissionOnPage != null -> "Filter{formSubmissionOnPage=$formSubmissionOnPage}"
                integrationEvent != null -> "Filter{integrationEvent=$integrationEvent}"
                emailSubscription != null -> "Filter{emailSubscription=$emailSubscription}"
                communicationSubscription != null ->
                    "Filter{communicationSubscription=$communicationSubscription}"
                surveyMonkey != null -> "Filter{surveyMonkey=$surveyMonkey}"
                surveyMonkeyValue != null -> "Filter{surveyMonkeyValue=$surveyMonkeyValue}"
                webinar != null -> "Filter{webinar=$webinar}"
                emailEvent != null -> "Filter{emailEvent=$emailEvent}"
                privacy != null -> "Filter{privacy=$privacy}"
                adsSearch != null -> "Filter{adsSearch=$adsSearch}"
                adsTime != null -> "Filter{adsTime=$adsTime}"
                inList != null -> "Filter{inList=$inList}"
                unifiedEvents != null -> "Filter{unifiedEvents=$unifiedEvents}"
                constant != null -> "Filter{constant=$constant}"
                _json != null -> "Filter{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Filter")
            }

        companion object {

            @JvmStatic fun ofProperty(property: PublicPropertyFilter) = Filter(property = property)

            @JvmStatic
            fun ofAssociation(association: PublicAssociationInListFilter) =
                Filter(association = association)

            @JvmStatic
            fun ofPageView(pageView: PublicPageViewAnalyticsFilter) = Filter(pageView = pageView)

            @JvmStatic fun ofCta(cta: PublicCtaAnalyticsFilter) = Filter(cta = cta)

            @JvmStatic fun ofEvent(event: PublicEventAnalyticsFilter) = Filter(event = event)

            @JvmStatic
            fun ofFormSubmission(formSubmission: PublicFormSubmissionFilter) =
                Filter(formSubmission = formSubmission)

            @JvmStatic
            fun ofFormSubmissionOnPage(formSubmissionOnPage: PublicFormSubmissionOnPageFilter) =
                Filter(formSubmissionOnPage = formSubmissionOnPage)

            @JvmStatic
            fun ofIntegrationEvent(integrationEvent: PublicIntegrationEventFilter) =
                Filter(integrationEvent = integrationEvent)

            @JvmStatic
            fun ofEmailSubscription(emailSubscription: PublicEmailSubscriptionFilter) =
                Filter(emailSubscription = emailSubscription)

            @JvmStatic
            fun ofCommunicationSubscription(
                communicationSubscription: PublicCommunicationSubscriptionFilter
            ) = Filter(communicationSubscription = communicationSubscription)

            @JvmStatic
            fun ofSurveyMonkey(surveyMonkey: PublicSurveyMonkeyFilter) =
                Filter(surveyMonkey = surveyMonkey)

            @JvmStatic
            fun ofSurveyMonkeyValue(surveyMonkeyValue: PublicSurveyMonkeyValueFilter) =
                Filter(surveyMonkeyValue = surveyMonkeyValue)

            @JvmStatic fun ofWebinar(webinar: PublicWebinarFilter) = Filter(webinar = webinar)

            @JvmStatic
            fun ofEmailEvent(emailEvent: PublicEmailEventFilter) = Filter(emailEvent = emailEvent)

            @JvmStatic
            fun ofPrivacy(privacy: PublicPrivacyAnalyticsFilter) = Filter(privacy = privacy)

            @JvmStatic
            fun ofAdsSearch(adsSearch: PublicAdsSearchFilter) = Filter(adsSearch = adsSearch)

            @JvmStatic fun ofAdsTime(adsTime: PublicAdsTimeFilter) = Filter(adsTime = adsTime)

            @JvmStatic fun ofInList(inList: PublicInListFilter) = Filter(inList = inList)

            @JvmStatic
            fun ofUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter) =
                Filter(unifiedEvents = unifiedEvents)

            @JvmStatic fun ofConstant(constant: PublicConstantFilter) = Filter(constant = constant)
        }

        /** An interface that defines how to map each variant of [Filter] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitProperty(property: PublicPropertyFilter): T

            fun visitAssociation(association: PublicAssociationInListFilter): T

            fun visitPageView(pageView: PublicPageViewAnalyticsFilter): T

            fun visitCta(cta: PublicCtaAnalyticsFilter): T

            fun visitEvent(event: PublicEventAnalyticsFilter): T

            fun visitFormSubmission(formSubmission: PublicFormSubmissionFilter): T

            fun visitFormSubmissionOnPage(formSubmissionOnPage: PublicFormSubmissionOnPageFilter): T

            fun visitIntegrationEvent(integrationEvent: PublicIntegrationEventFilter): T

            fun visitEmailSubscription(emailSubscription: PublicEmailSubscriptionFilter): T

            fun visitCommunicationSubscription(
                communicationSubscription: PublicCommunicationSubscriptionFilter
            ): T

            fun visitSurveyMonkey(surveyMonkey: PublicSurveyMonkeyFilter): T

            fun visitSurveyMonkeyValue(surveyMonkeyValue: PublicSurveyMonkeyValueFilter): T

            fun visitWebinar(webinar: PublicWebinarFilter): T

            fun visitEmailEvent(emailEvent: PublicEmailEventFilter): T

            fun visitPrivacy(privacy: PublicPrivacyAnalyticsFilter): T

            fun visitAdsSearch(adsSearch: PublicAdsSearchFilter): T

            fun visitAdsTime(adsTime: PublicAdsTimeFilter): T

            fun visitInList(inList: PublicInListFilter): T

            fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter): T

            fun visitConstant(constant: PublicConstantFilter): T

            /**
             * Maps an unknown variant of [Filter] to a value of type [T].
             *
             * An instance of [Filter] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Filter: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Filter>(Filter::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Filter {
                val json = JsonValue.fromJsonNode(node)
                val filterType =
                    json.asObject().getOrNull()?.get("filterType")?.asString()?.getOrNull()

                when (filterType) {
                    "PROPERTY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicPropertyFilter>())?.let {
                            Filter(property = it, _json = json)
                        } ?: Filter(_json = json)
                    }
                    "ASSOCIATION" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAssociationInListFilter>())
                            ?.let { Filter(association = it, _json = json) } ?: Filter(_json = json)
                    }
                    "PAGE_VIEW" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicPageViewAnalyticsFilter>())
                            ?.let { Filter(pageView = it, _json = json) } ?: Filter(_json = json)
                    }
                    "CTA" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicCtaAnalyticsFilter>())
                            ?.let { Filter(cta = it, _json = json) } ?: Filter(_json = json)
                    }
                    "EVENT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicEventAnalyticsFilter>())
                            ?.let { Filter(event = it, _json = json) } ?: Filter(_json = json)
                    }
                    "FORM_SUBMISSION" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicFormSubmissionFilter>())
                            ?.let { Filter(formSubmission = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "FORM_SUBMISSION_ON_PAGE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicFormSubmissionOnPageFilter>(),
                            )
                            ?.let { Filter(formSubmissionOnPage = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "INTEGRATION_EVENT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicIntegrationEventFilter>())
                            ?.let { Filter(integrationEvent = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "EMAIL_SUBSCRIPTION" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicEmailSubscriptionFilter>())
                            ?.let { Filter(emailSubscription = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "COMMUNICATION_SUBSCRIPTION" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicCommunicationSubscriptionFilter>(),
                            )
                            ?.let { Filter(communicationSubscription = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "SURVEY_MONKEY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicSurveyMonkeyFilter>())
                            ?.let { Filter(surveyMonkey = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "SURVEY_MONKEY_VALUE" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicSurveyMonkeyValueFilter>())
                            ?.let { Filter(surveyMonkeyValue = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "WEBINAR" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicWebinarFilter>())?.let {
                            Filter(webinar = it, _json = json)
                        } ?: Filter(_json = json)
                    }
                    "EMAIL_EVENT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicEmailEventFilter>())?.let {
                            Filter(emailEvent = it, _json = json)
                        } ?: Filter(_json = json)
                    }
                    "PRIVACY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicPrivacyAnalyticsFilter>())
                            ?.let { Filter(privacy = it, _json = json) } ?: Filter(_json = json)
                    }
                    "ADS_SEARCH" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAdsSearchFilter>())?.let {
                            Filter(adsSearch = it, _json = json)
                        } ?: Filter(_json = json)
                    }
                    "ADS_TIME" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAdsTimeFilter>())?.let {
                            Filter(adsTime = it, _json = json)
                        } ?: Filter(_json = json)
                    }
                    "IN_LIST" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicInListFilter>())?.let {
                            Filter(inList = it, _json = json)
                        } ?: Filter(_json = json)
                    }
                    "UNIFIED_EVENTS" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilter>())
                            ?.let { Filter(unifiedEvents = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "CONSTANT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicConstantFilter>())?.let {
                            Filter(constant = it, _json = json)
                        } ?: Filter(_json = json)
                    }
                }

                return Filter(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Filter>(Filter::class) {

            override fun serialize(
                value: Filter,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.property != null -> generator.writeObject(value.property)
                    value.association != null -> generator.writeObject(value.association)
                    value.pageView != null -> generator.writeObject(value.pageView)
                    value.cta != null -> generator.writeObject(value.cta)
                    value.event != null -> generator.writeObject(value.event)
                    value.formSubmission != null -> generator.writeObject(value.formSubmission)
                    value.formSubmissionOnPage != null ->
                        generator.writeObject(value.formSubmissionOnPage)
                    value.integrationEvent != null -> generator.writeObject(value.integrationEvent)
                    value.emailSubscription != null ->
                        generator.writeObject(value.emailSubscription)
                    value.communicationSubscription != null ->
                        generator.writeObject(value.communicationSubscription)
                    value.surveyMonkey != null -> generator.writeObject(value.surveyMonkey)
                    value.surveyMonkeyValue != null ->
                        generator.writeObject(value.surveyMonkeyValue)
                    value.webinar != null -> generator.writeObject(value.webinar)
                    value.emailEvent != null -> generator.writeObject(value.emailEvent)
                    value.privacy != null -> generator.writeObject(value.privacy)
                    value.adsSearch != null -> generator.writeObject(value.adsSearch)
                    value.adsTime != null -> generator.writeObject(value.adsTime)
                    value.inList != null -> generator.writeObject(value.inList)
                    value.unifiedEvents != null -> generator.writeObject(value.unifiedEvents)
                    value.constant != null -> generator.writeObject(value.constant)
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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HAS_COMPLETED -> Known.HAS_COMPLETED
                HAS_NOT_COMPLETED -> Known.HAS_NOT_COMPLETED
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

    /** Specifies the criteria for refining the filter by coalescing. */
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
