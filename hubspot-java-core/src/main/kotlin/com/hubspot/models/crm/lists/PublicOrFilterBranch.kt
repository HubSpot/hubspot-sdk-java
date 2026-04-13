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
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.getOrThrow
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicOrFilterBranch
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filterBranches: JsonField<List<FilterBranch>>,
    private val filterBranchOperator: JsonField<String>,
    private val filterBranchType: JsonField<FilterBranchType>,
    private val filters: JsonField<List<Filter>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filterBranches")
        @ExcludeMissing
        filterBranches: JsonField<List<FilterBranch>> = JsonMissing.of(),
        @JsonProperty("filterBranchOperator")
        @ExcludeMissing
        filterBranchOperator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filterBranchType")
        @ExcludeMissing
        filterBranchType: JsonField<FilterBranchType> = JsonMissing.of(),
        @JsonProperty("filters") @ExcludeMissing filters: JsonField<List<Filter>> = JsonMissing.of(),
    ) : this(filterBranches, filterBranchOperator, filterBranchType, filters, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranches(): List<FilterBranch> = filterBranches.getRequired("filterBranches")

    /**
     * The logical operator used to combine the filters within the branch (OR).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranchOperator(): String = filterBranchOperator.getRequired("filterBranchOperator")

    /**
     * The type of the filter branch (OR).
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
         * Returns a mutable builder for constructing an instance of [PublicOrFilterBranch].
         *
         * The following fields are required:
         * ```java
         * .filterBranches()
         * .filterBranchOperator()
         * .filterBranchType()
         * .filters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicOrFilterBranch]. */
    class Builder internal constructor() {

        private var filterBranches: JsonField<MutableList<FilterBranch>>? = null
        private var filterBranchOperator: JsonField<String>? = null
        private var filterBranchType: JsonField<FilterBranchType>? = null
        private var filters: JsonField<MutableList<Filter>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicOrFilterBranch: PublicOrFilterBranch) = apply {
            filterBranches = publicOrFilterBranch.filterBranches.map { it.toMutableList() }
            filterBranchOperator = publicOrFilterBranch.filterBranchOperator
            filterBranchType = publicOrFilterBranch.filterBranchType
            filters = publicOrFilterBranch.filters.map { it.toMutableList() }
            additionalProperties = publicOrFilterBranch.additionalProperties.toMutableMap()
        }

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

        /**
         * Alias for calling [addFilterBranch] with
         * `FilterBranch.ofPropertyAssociation(propertyAssociation)`.
         */
        fun addFilterBranch(propertyAssociation: PublicPropertyAssociationFilterBranch) =
            addFilterBranch(FilterBranch.ofPropertyAssociation(propertyAssociation))

        /** Alias for calling [addFilterBranch] with `FilterBranch.ofAssociation(association)`. */
        fun addFilterBranch(association: PublicAssociationFilterBranch) =
            addFilterBranch(FilterBranch.ofAssociation(association))

        /** The logical operator used to combine the filters within the branch (OR). */
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

        /** The type of the filter branch (OR). */
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

        /** Alias for calling [addFilter] with `Filter.ofCampaignInfluenced(campaignInfluenced)`. */
        fun addFilter(campaignInfluenced: PublicCampaignInfluencedFilter) =
            addFilter(Filter.ofCampaignInfluenced(campaignInfluenced))

        /**
         * Alias for calling [addFilter] with the following:
         * ```java
         * PublicCampaignInfluencedFilter.builder()
         *     .filterType(PublicCampaignInfluencedFilter.FilterType.CAMPAIGN_INFLUENCED)
         *     .campaignId(campaignId)
         *     .build()
         * ```
         */
        fun addCampaignInfluencedFilter(campaignId: String) =
            addFilter(
                PublicCampaignInfluencedFilter.builder()
                    .filterType(PublicCampaignInfluencedFilter.FilterType.CAMPAIGN_INFLUENCED)
                    .campaignId(campaignId)
                    .build()
            )

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
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicNumOccurrences(publicNumOccurrences)`.
         */
        fun addAdsTimeFilter(publicNumOccurrences: PublicNumOccurrencesRefineBy) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicNumOccurrences(publicNumOccurrences)
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicSetOccurrences(publicSetOccurrences)`.
         */
        fun addAdsTimeFilter(publicSetOccurrences: PublicSetOccurrencesRefineBy) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicSetOccurrences(publicSetOccurrences)
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicRelativeComparativeTimestamp(publicRelativeComparativeTimestamp)`.
         */
        fun addAdsTimeFilter(
            publicRelativeComparativeTimestamp: PublicRelativeComparativeTimestampRefineBy
        ) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicRelativeComparativeTimestamp(
                    publicRelativeComparativeTimestamp
                )
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicRelativeRangedTimestamp(publicRelativeRangedTimestamp)`.
         */
        fun addAdsTimeFilter(publicRelativeRangedTimestamp: PublicRelativeRangedTimestampRefineBy) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicRelativeRangedTimestamp(
                    publicRelativeRangedTimestamp
                )
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicAbsoluteComparativeTimestamp(publicAbsoluteComparativeTimestamp)`.
         */
        fun addAdsTimeFilter(
            publicAbsoluteComparativeTimestamp: PublicAbsoluteComparativeTimestampRefineBy
        ) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicAbsoluteComparativeTimestamp(
                    publicAbsoluteComparativeTimestamp
                )
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicAbsoluteRangedTimestamp(publicAbsoluteRangedTimestamp)`.
         */
        fun addAdsTimeFilter(publicAbsoluteRangedTimestamp: PublicAbsoluteRangedTimestampRefineBy) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicAbsoluteRangedTimestamp(
                    publicAbsoluteRangedTimestamp
                )
            )

        /**
         * Alias for calling [addAdsTimeFilter] with
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicAllHistory(publicAllHistory)`.
         */
        fun addAdsTimeFilter(publicAllHistory: PublicAllHistoryRefineBy) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicAllHistory(publicAllHistory)
            )

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
         * `PublicAdsTimeFilter.PruningRefineBy.ofPublicRangedTimeOperation(publicRangedTimeOperation)`.
         */
        fun addAdsTimeFilter(publicRangedTimeOperation: PublicRangedTimeOperation) =
            addAdsTimeFilter(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicRangedTimeOperation(
                    publicRangedTimeOperation
                )
            )

        /** Alias for calling [addFilter] with `Filter.ofInList(inList)`. */
        fun addFilter(inList: PublicInListFilter) = addFilter(Filter.ofInList(inList))

        /** Alias for calling [addFilter] with `Filter.ofNumAssociations(numAssociations)`. */
        fun addFilter(numAssociations: PublicNumAssociationsFilter) =
            addFilter(Filter.ofNumAssociations(numAssociations))

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

        /**
         * Alias for calling [addFilter] with `Filter.ofPropertyAssociation(propertyAssociation)`.
         */
        fun addFilter(propertyAssociation: PublicPropertyAssociationInListFilter) =
            addFilter(Filter.ofPropertyAssociation(propertyAssociation))

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
         * Returns an immutable instance of [PublicOrFilterBranch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filterBranches()
         * .filterBranchOperator()
         * .filterBranchType()
         * .filters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicOrFilterBranch =
            PublicOrFilterBranch(
                checkRequired("filterBranches", filterBranches).map { it.toImmutable() },
                checkRequired("filterBranchOperator", filterBranchOperator),
                checkRequired("filterBranchType", filterBranchType),
                checkRequired("filters", filters).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicOrFilterBranch = apply {
        if (validated) {
            return@apply
        }

        filterBranches().forEach { it.validate() }
        filterBranchOperator()
        filterBranchType().validate()
        filters().forEach { it.validate() }
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
        (filterBranches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (filterBranchOperator.asKnown().isPresent) 1 else 0) +
            (filterBranchType.asKnown().getOrNull()?.validity() ?: 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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
        private val propertyAssociation: PublicPropertyAssociationFilterBranch? = null,
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

        fun propertyAssociation(): Optional<PublicPropertyAssociationFilterBranch> =
            Optional.ofNullable(propertyAssociation)

        fun association(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(association)

        fun isOr(): Boolean = or != null

        fun isAnd(): Boolean = and != null

        fun isNotAll(): Boolean = notAll != null

        fun isNotAny(): Boolean = notAny != null

        fun isRestricted(): Boolean = restricted != null

        fun isUnifiedEvents(): Boolean = unifiedEvents != null

        fun isPropertyAssociation(): Boolean = propertyAssociation != null

        fun isAssociation(): Boolean = association != null

        fun asOr(): PublicOrFilterBranch = or.getOrThrow("or")

        fun asAnd(): PublicAndFilterBranch = and.getOrThrow("and")

        fun asNotAll(): PublicNotAllFilterBranch = notAll.getOrThrow("notAll")

        fun asNotAny(): PublicNotAnyFilterBranch = notAny.getOrThrow("notAny")

        fun asRestricted(): PublicRestrictedFilterBranch = restricted.getOrThrow("restricted")

        fun asUnifiedEvents(): PublicUnifiedEventsFilterBranch =
            unifiedEvents.getOrThrow("unifiedEvents")

        fun asPropertyAssociation(): PublicPropertyAssociationFilterBranch =
            propertyAssociation.getOrThrow("propertyAssociation")

        fun asAssociation(): PublicAssociationFilterBranch = association.getOrThrow("association")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                or != null -> visitor.visitOr(or)
                and != null -> visitor.visitAnd(and)
                notAll != null -> visitor.visitNotAll(notAll)
                notAny != null -> visitor.visitNotAny(notAny)
                restricted != null -> visitor.visitRestricted(restricted)
                unifiedEvents != null -> visitor.visitUnifiedEvents(unifiedEvents)
                propertyAssociation != null -> visitor.visitPropertyAssociation(propertyAssociation)
                association != null -> visitor.visitAssociation(association)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

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

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationFilterBranch
                    ) {
                        propertyAssociation.validate()
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

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationFilterBranch
                    ) = propertyAssociation.validity()

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
                propertyAssociation == other.propertyAssociation &&
                association == other.association
        }

        override fun hashCode(): Int =
            Objects.hash(
                or,
                and,
                notAll,
                notAny,
                restricted,
                unifiedEvents,
                propertyAssociation,
                association,
            )

        override fun toString(): String =
            when {
                or != null -> "FilterBranch{or=$or}"
                and != null -> "FilterBranch{and=$and}"
                notAll != null -> "FilterBranch{notAll=$notAll}"
                notAny != null -> "FilterBranch{notAny=$notAny}"
                restricted != null -> "FilterBranch{restricted=$restricted}"
                unifiedEvents != null -> "FilterBranch{unifiedEvents=$unifiedEvents}"
                propertyAssociation != null ->
                    "FilterBranch{propertyAssociation=$propertyAssociation}"
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
            fun ofPropertyAssociation(propertyAssociation: PublicPropertyAssociationFilterBranch) =
                FilterBranch(propertyAssociation = propertyAssociation)

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

            fun visitPropertyAssociation(
                propertyAssociation: PublicPropertyAssociationFilterBranch
            ): T

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
                    "PROPERTY_ASSOCIATION" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                            )
                            ?.let { FilterBranch(propertyAssociation = it, _json = json) }
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
                    value.propertyAssociation != null ->
                        generator.writeObject(value.propertyAssociation)
                    value.association != null -> generator.writeObject(value.association)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FilterBranch")
                }
            }
        }
    }

    /** The type of the filter branch (OR). */
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

            @JvmField val OR = of("OR")

            @JvmStatic fun of(value: String) = FilterBranchType(JsonField.of(value))
        }

        /** An enum containing [FilterBranchType]'s known values. */
        enum class Known {
            OR
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
            OR,
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
                OR -> Value.OR
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
                OR -> Known.OR
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
        private val campaignInfluenced: PublicCampaignInfluencedFilter? = null,
        private val surveyMonkey: PublicSurveyMonkeyFilter? = null,
        private val surveyMonkeyValue: PublicSurveyMonkeyValueFilter? = null,
        private val webinar: PublicWebinarFilter? = null,
        private val emailEvent: PublicEmailEventFilter? = null,
        private val privacy: PublicPrivacyAnalyticsFilter? = null,
        private val adsSearch: PublicAdsSearchFilter? = null,
        private val adsTime: PublicAdsTimeFilter? = null,
        private val inList: PublicInListFilter? = null,
        private val numAssociations: PublicNumAssociationsFilter? = null,
        private val unifiedEvents: PublicUnifiedEventsFilter? = null,
        private val propertyAssociation: PublicPropertyAssociationInListFilter? = null,
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

        fun campaignInfluenced(): Optional<PublicCampaignInfluencedFilter> =
            Optional.ofNullable(campaignInfluenced)

        fun surveyMonkey(): Optional<PublicSurveyMonkeyFilter> = Optional.ofNullable(surveyMonkey)

        fun surveyMonkeyValue(): Optional<PublicSurveyMonkeyValueFilter> =
            Optional.ofNullable(surveyMonkeyValue)

        fun webinar(): Optional<PublicWebinarFilter> = Optional.ofNullable(webinar)

        fun emailEvent(): Optional<PublicEmailEventFilter> = Optional.ofNullable(emailEvent)

        fun privacy(): Optional<PublicPrivacyAnalyticsFilter> = Optional.ofNullable(privacy)

        fun adsSearch(): Optional<PublicAdsSearchFilter> = Optional.ofNullable(adsSearch)

        fun adsTime(): Optional<PublicAdsTimeFilter> = Optional.ofNullable(adsTime)

        fun inList(): Optional<PublicInListFilter> = Optional.ofNullable(inList)

        fun numAssociations(): Optional<PublicNumAssociationsFilter> =
            Optional.ofNullable(numAssociations)

        fun unifiedEvents(): Optional<PublicUnifiedEventsFilter> =
            Optional.ofNullable(unifiedEvents)

        fun propertyAssociation(): Optional<PublicPropertyAssociationInListFilter> =
            Optional.ofNullable(propertyAssociation)

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

        fun isCampaignInfluenced(): Boolean = campaignInfluenced != null

        fun isSurveyMonkey(): Boolean = surveyMonkey != null

        fun isSurveyMonkeyValue(): Boolean = surveyMonkeyValue != null

        fun isWebinar(): Boolean = webinar != null

        fun isEmailEvent(): Boolean = emailEvent != null

        fun isPrivacy(): Boolean = privacy != null

        fun isAdsSearch(): Boolean = adsSearch != null

        fun isAdsTime(): Boolean = adsTime != null

        fun isInList(): Boolean = inList != null

        fun isNumAssociations(): Boolean = numAssociations != null

        fun isUnifiedEvents(): Boolean = unifiedEvents != null

        fun isPropertyAssociation(): Boolean = propertyAssociation != null

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

        fun asCampaignInfluenced(): PublicCampaignInfluencedFilter =
            campaignInfluenced.getOrThrow("campaignInfluenced")

        fun asSurveyMonkey(): PublicSurveyMonkeyFilter = surveyMonkey.getOrThrow("surveyMonkey")

        fun asSurveyMonkeyValue(): PublicSurveyMonkeyValueFilter =
            surveyMonkeyValue.getOrThrow("surveyMonkeyValue")

        fun asWebinar(): PublicWebinarFilter = webinar.getOrThrow("webinar")

        fun asEmailEvent(): PublicEmailEventFilter = emailEvent.getOrThrow("emailEvent")

        fun asPrivacy(): PublicPrivacyAnalyticsFilter = privacy.getOrThrow("privacy")

        fun asAdsSearch(): PublicAdsSearchFilter = adsSearch.getOrThrow("adsSearch")

        fun asAdsTime(): PublicAdsTimeFilter = adsTime.getOrThrow("adsTime")

        fun asInList(): PublicInListFilter = inList.getOrThrow("inList")

        fun asNumAssociations(): PublicNumAssociationsFilter =
            numAssociations.getOrThrow("numAssociations")

        fun asUnifiedEvents(): PublicUnifiedEventsFilter = unifiedEvents.getOrThrow("unifiedEvents")

        fun asPropertyAssociation(): PublicPropertyAssociationInListFilter =
            propertyAssociation.getOrThrow("propertyAssociation")

        fun asConstant(): PublicConstantFilter = constant.getOrThrow("constant")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

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
                campaignInfluenced != null -> visitor.visitCampaignInfluenced(campaignInfluenced)
                surveyMonkey != null -> visitor.visitSurveyMonkey(surveyMonkey)
                surveyMonkeyValue != null -> visitor.visitSurveyMonkeyValue(surveyMonkeyValue)
                webinar != null -> visitor.visitWebinar(webinar)
                emailEvent != null -> visitor.visitEmailEvent(emailEvent)
                privacy != null -> visitor.visitPrivacy(privacy)
                adsSearch != null -> visitor.visitAdsSearch(adsSearch)
                adsTime != null -> visitor.visitAdsTime(adsTime)
                inList != null -> visitor.visitInList(inList)
                numAssociations != null -> visitor.visitNumAssociations(numAssociations)
                unifiedEvents != null -> visitor.visitUnifiedEvents(unifiedEvents)
                propertyAssociation != null -> visitor.visitPropertyAssociation(propertyAssociation)
                constant != null -> visitor.visitConstant(constant)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

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

                    override fun visitCampaignInfluenced(
                        campaignInfluenced: PublicCampaignInfluencedFilter
                    ) {
                        campaignInfluenced.validate()
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

                    override fun visitNumAssociations(
                        numAssociations: PublicNumAssociationsFilter
                    ) {
                        numAssociations.validate()
                    }

                    override fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter) {
                        unifiedEvents.validate()
                    }

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationInListFilter
                    ) {
                        propertyAssociation.validate()
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

                    override fun visitCampaignInfluenced(
                        campaignInfluenced: PublicCampaignInfluencedFilter
                    ) = campaignInfluenced.validity()

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

                    override fun visitNumAssociations(
                        numAssociations: PublicNumAssociationsFilter
                    ) = numAssociations.validity()

                    override fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter) =
                        unifiedEvents.validity()

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationInListFilter
                    ) = propertyAssociation.validity()

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
                campaignInfluenced == other.campaignInfluenced &&
                surveyMonkey == other.surveyMonkey &&
                surveyMonkeyValue == other.surveyMonkeyValue &&
                webinar == other.webinar &&
                emailEvent == other.emailEvent &&
                privacy == other.privacy &&
                adsSearch == other.adsSearch &&
                adsTime == other.adsTime &&
                inList == other.inList &&
                numAssociations == other.numAssociations &&
                unifiedEvents == other.unifiedEvents &&
                propertyAssociation == other.propertyAssociation &&
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
                campaignInfluenced,
                surveyMonkey,
                surveyMonkeyValue,
                webinar,
                emailEvent,
                privacy,
                adsSearch,
                adsTime,
                inList,
                numAssociations,
                unifiedEvents,
                propertyAssociation,
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
                campaignInfluenced != null -> "Filter{campaignInfluenced=$campaignInfluenced}"
                surveyMonkey != null -> "Filter{surveyMonkey=$surveyMonkey}"
                surveyMonkeyValue != null -> "Filter{surveyMonkeyValue=$surveyMonkeyValue}"
                webinar != null -> "Filter{webinar=$webinar}"
                emailEvent != null -> "Filter{emailEvent=$emailEvent}"
                privacy != null -> "Filter{privacy=$privacy}"
                adsSearch != null -> "Filter{adsSearch=$adsSearch}"
                adsTime != null -> "Filter{adsTime=$adsTime}"
                inList != null -> "Filter{inList=$inList}"
                numAssociations != null -> "Filter{numAssociations=$numAssociations}"
                unifiedEvents != null -> "Filter{unifiedEvents=$unifiedEvents}"
                propertyAssociation != null -> "Filter{propertyAssociation=$propertyAssociation}"
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
            fun ofCampaignInfluenced(campaignInfluenced: PublicCampaignInfluencedFilter) =
                Filter(campaignInfluenced = campaignInfluenced)

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
            fun ofNumAssociations(numAssociations: PublicNumAssociationsFilter) =
                Filter(numAssociations = numAssociations)

            @JvmStatic
            fun ofUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter) =
                Filter(unifiedEvents = unifiedEvents)

            @JvmStatic
            fun ofPropertyAssociation(propertyAssociation: PublicPropertyAssociationInListFilter) =
                Filter(propertyAssociation = propertyAssociation)

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

            fun visitCampaignInfluenced(campaignInfluenced: PublicCampaignInfluencedFilter): T

            fun visitSurveyMonkey(surveyMonkey: PublicSurveyMonkeyFilter): T

            fun visitSurveyMonkeyValue(surveyMonkeyValue: PublicSurveyMonkeyValueFilter): T

            fun visitWebinar(webinar: PublicWebinarFilter): T

            fun visitEmailEvent(emailEvent: PublicEmailEventFilter): T

            fun visitPrivacy(privacy: PublicPrivacyAnalyticsFilter): T

            fun visitAdsSearch(adsSearch: PublicAdsSearchFilter): T

            fun visitAdsTime(adsTime: PublicAdsTimeFilter): T

            fun visitInList(inList: PublicInListFilter): T

            fun visitNumAssociations(numAssociations: PublicNumAssociationsFilter): T

            fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilter): T

            fun visitPropertyAssociation(
                propertyAssociation: PublicPropertyAssociationInListFilter
            ): T

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
                    "CAMPAIGN_INFLUENCED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicCampaignInfluencedFilter>(),
                            )
                            ?.let { Filter(campaignInfluenced = it, _json = json) }
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
                    "NUM_ASSOCIATIONS" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNumAssociationsFilter>())
                            ?.let { Filter(numAssociations = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "UNIFIED_EVENTS" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilter>())
                            ?.let { Filter(unifiedEvents = it, _json = json) }
                            ?: Filter(_json = json)
                    }
                    "PROPERTY_ASSOCIATION" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicPropertyAssociationInListFilter>(),
                            )
                            ?.let { Filter(propertyAssociation = it, _json = json) }
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
                    value.campaignInfluenced != null ->
                        generator.writeObject(value.campaignInfluenced)
                    value.surveyMonkey != null -> generator.writeObject(value.surveyMonkey)
                    value.surveyMonkeyValue != null ->
                        generator.writeObject(value.surveyMonkeyValue)
                    value.webinar != null -> generator.writeObject(value.webinar)
                    value.emailEvent != null -> generator.writeObject(value.emailEvent)
                    value.privacy != null -> generator.writeObject(value.privacy)
                    value.adsSearch != null -> generator.writeObject(value.adsSearch)
                    value.adsTime != null -> generator.writeObject(value.adsTime)
                    value.inList != null -> generator.writeObject(value.inList)
                    value.numAssociations != null -> generator.writeObject(value.numAssociations)
                    value.unifiedEvents != null -> generator.writeObject(value.unifiedEvents)
                    value.propertyAssociation != null ->
                        generator.writeObject(value.propertyAssociation)
                    value.constant != null -> generator.writeObject(value.constant)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Filter")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicOrFilterBranch &&
            filterBranches == other.filterBranches &&
            filterBranchOperator == other.filterBranchOperator &&
            filterBranchType == other.filterBranchType &&
            filters == other.filters &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            filterBranches,
            filterBranchOperator,
            filterBranchType,
            filters,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicOrFilterBranch{filterBranches=$filterBranches, filterBranchOperator=$filterBranchOperator, filterBranchType=$filterBranchType, filters=$filters, additionalProperties=$additionalProperties}"
}
