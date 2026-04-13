// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

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
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.AssociationSpec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RollupExpression
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationTypes: JsonField<List<AssociationSpec>>,
    private val rollupOperator: JsonField<RollupOperator>,
    private val sourceObjectTypeId: JsonField<String>,
    private val sourcePropertyName: JsonField<String>,
    private val conditionalExpression: JsonField<ConditionalExpression>,
    private val conditionalFormula: JsonField<String>,
    private val emptyRollupValue: JsonField<String>,
    private val sourceCompareByPropertyName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associationTypes")
        @ExcludeMissing
        associationTypes: JsonField<List<AssociationSpec>> = JsonMissing.of(),
        @JsonProperty("rollupOperator")
        @ExcludeMissing
        rollupOperator: JsonField<RollupOperator> = JsonMissing.of(),
        @JsonProperty("sourceObjectTypeId")
        @ExcludeMissing
        sourceObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourcePropertyName")
        @ExcludeMissing
        sourcePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditionalExpression")
        @ExcludeMissing
        conditionalExpression: JsonField<ConditionalExpression> = JsonMissing.of(),
        @JsonProperty("conditionalFormula")
        @ExcludeMissing
        conditionalFormula: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emptyRollupValue")
        @ExcludeMissing
        emptyRollupValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceCompareByPropertyName")
        @ExcludeMissing
        sourceCompareByPropertyName: JsonField<String> = JsonMissing.of(),
    ) : this(
        associationTypes,
        rollupOperator,
        sourceObjectTypeId,
        sourcePropertyName,
        conditionalExpression,
        conditionalFormula,
        emptyRollupValue,
        sourceCompareByPropertyName,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypes(): List<AssociationSpec> = associationTypes.getRequired("associationTypes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rollupOperator(): RollupOperator = rollupOperator.getRequired("rollupOperator")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceObjectTypeId(): String = sourceObjectTypeId.getRequired("sourceObjectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourcePropertyName(): String = sourcePropertyName.getRequired("sourcePropertyName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditionalExpression(): Optional<ConditionalExpression> =
        conditionalExpression.getOptional("conditionalExpression")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditionalFormula(): Optional<String> =
        conditionalFormula.getOptional("conditionalFormula")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emptyRollupValue(): Optional<String> = emptyRollupValue.getOptional("emptyRollupValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceCompareByPropertyName(): Optional<String> =
        sourceCompareByPropertyName.getOptional("sourceCompareByPropertyName")

    /**
     * Returns the raw JSON value of [associationTypes].
     *
     * Unlike [associationTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associationTypes")
    @ExcludeMissing
    fun _associationTypes(): JsonField<List<AssociationSpec>> = associationTypes

    /**
     * Returns the raw JSON value of [rollupOperator].
     *
     * Unlike [rollupOperator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rollupOperator")
    @ExcludeMissing
    fun _rollupOperator(): JsonField<RollupOperator> = rollupOperator

    /**
     * Returns the raw JSON value of [sourceObjectTypeId].
     *
     * Unlike [sourceObjectTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sourceObjectTypeId")
    @ExcludeMissing
    fun _sourceObjectTypeId(): JsonField<String> = sourceObjectTypeId

    /**
     * Returns the raw JSON value of [sourcePropertyName].
     *
     * Unlike [sourcePropertyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sourcePropertyName")
    @ExcludeMissing
    fun _sourcePropertyName(): JsonField<String> = sourcePropertyName

    /**
     * Returns the raw JSON value of [conditionalExpression].
     *
     * Unlike [conditionalExpression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conditionalExpression")
    @ExcludeMissing
    fun _conditionalExpression(): JsonField<ConditionalExpression> = conditionalExpression

    /**
     * Returns the raw JSON value of [conditionalFormula].
     *
     * Unlike [conditionalFormula], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conditionalFormula")
    @ExcludeMissing
    fun _conditionalFormula(): JsonField<String> = conditionalFormula

    /**
     * Returns the raw JSON value of [emptyRollupValue].
     *
     * Unlike [emptyRollupValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("emptyRollupValue")
    @ExcludeMissing
    fun _emptyRollupValue(): JsonField<String> = emptyRollupValue

    /**
     * Returns the raw JSON value of [sourceCompareByPropertyName].
     *
     * Unlike [sourceCompareByPropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sourceCompareByPropertyName")
    @ExcludeMissing
    fun _sourceCompareByPropertyName(): JsonField<String> = sourceCompareByPropertyName

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
         * Returns a mutable builder for constructing an instance of [RollupExpression].
         *
         * The following fields are required:
         * ```java
         * .associationTypes()
         * .rollupOperator()
         * .sourceObjectTypeId()
         * .sourcePropertyName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RollupExpression]. */
    class Builder internal constructor() {

        private var associationTypes: JsonField<MutableList<AssociationSpec>>? = null
        private var rollupOperator: JsonField<RollupOperator>? = null
        private var sourceObjectTypeId: JsonField<String>? = null
        private var sourcePropertyName: JsonField<String>? = null
        private var conditionalExpression: JsonField<ConditionalExpression> = JsonMissing.of()
        private var conditionalFormula: JsonField<String> = JsonMissing.of()
        private var emptyRollupValue: JsonField<String> = JsonMissing.of()
        private var sourceCompareByPropertyName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rollupExpression: RollupExpression) = apply {
            associationTypes = rollupExpression.associationTypes.map { it.toMutableList() }
            rollupOperator = rollupExpression.rollupOperator
            sourceObjectTypeId = rollupExpression.sourceObjectTypeId
            sourcePropertyName = rollupExpression.sourcePropertyName
            conditionalExpression = rollupExpression.conditionalExpression
            conditionalFormula = rollupExpression.conditionalFormula
            emptyRollupValue = rollupExpression.emptyRollupValue
            sourceCompareByPropertyName = rollupExpression.sourceCompareByPropertyName
            additionalProperties = rollupExpression.additionalProperties.toMutableMap()
        }

        fun associationTypes(associationTypes: List<AssociationSpec>) =
            associationTypes(JsonField.of(associationTypes))

        /**
         * Sets [Builder.associationTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associationTypes] with a well-typed
         * `List<AssociationSpec>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun associationTypes(associationTypes: JsonField<List<AssociationSpec>>) = apply {
            this.associationTypes = associationTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [AssociationSpec] to [associationTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociationType(associationType: AssociationSpec) = apply {
            associationTypes =
                (associationTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associationTypes", it).add(associationType)
                }
        }

        fun rollupOperator(rollupOperator: RollupOperator) =
            rollupOperator(JsonField.of(rollupOperator))

        /**
         * Sets [Builder.rollupOperator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rollupOperator] with a well-typed [RollupOperator] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rollupOperator(rollupOperator: JsonField<RollupOperator>) = apply {
            this.rollupOperator = rollupOperator
        }

        fun sourceObjectTypeId(sourceObjectTypeId: String) =
            sourceObjectTypeId(JsonField.of(sourceObjectTypeId))

        /**
         * Sets [Builder.sourceObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceObjectTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceObjectTypeId(sourceObjectTypeId: JsonField<String>) = apply {
            this.sourceObjectTypeId = sourceObjectTypeId
        }

        fun sourcePropertyName(sourcePropertyName: String) =
            sourcePropertyName(JsonField.of(sourcePropertyName))

        /**
         * Sets [Builder.sourcePropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourcePropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourcePropertyName(sourcePropertyName: JsonField<String>) = apply {
            this.sourcePropertyName = sourcePropertyName
        }

        fun conditionalExpression(conditionalExpression: ConditionalExpression) =
            conditionalExpression(JsonField.of(conditionalExpression))

        /**
         * Sets [Builder.conditionalExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionalExpression] with a well-typed
         * [ConditionalExpression] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun conditionalExpression(conditionalExpression: JsonField<ConditionalExpression>) = apply {
            this.conditionalExpression = conditionalExpression
        }

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofConstantBoolean(constantBoolean)`.
         */
        fun conditionalExpression(constantBoolean: ConstantBoolean) =
            conditionalExpression(ConditionalExpression.ofConstantBoolean(constantBoolean))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofConstantNumber(constantNumber)`.
         */
        fun conditionalExpression(constantNumber: ConstantNumber) =
            conditionalExpression(ConditionalExpression.ofConstantNumber(constantNumber))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofConstantString(constantString)`.
         */
        fun conditionalExpression(constantString: ConstantString) =
            conditionalExpression(ConditionalExpression.ofConstantString(constantString))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun conditionalExpression(booleanPropertyVariable: BooleanPropertyVariable) =
            conditionalExpression(
                ConditionalExpression.ofBooleanPropertyVariable(booleanPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun conditionalExpression(stringPropertyVariable: StringPropertyVariable) =
            conditionalExpression(
                ConditionalExpression.ofStringPropertyVariable(stringPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun conditionalExpression(numberPropertyVariable: NumberPropertyVariable) =
            conditionalExpression(
                ConditionalExpression.ofNumberPropertyVariable(numberPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun conditionalExpression(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            conditionalExpression(
                ConditionalExpression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun conditionalExpression(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            conditionalExpression(
                ConditionalExpression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun conditionalExpression(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            conditionalExpression(
                ConditionalExpression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun conditionalExpression(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            conditionalExpression(
                ConditionalExpression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun conditionalExpression(
            timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
        ) =
            conditionalExpression(
                ConditionalExpression.ofTimestampOfTargetPropertyVariable(
                    timestampOfTargetPropertyVariable
                )
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofAddNumbers(addNumbers)`.
         */
        fun conditionalExpression(addNumbers: AddNumbers) =
            conditionalExpression(ConditionalExpression.ofAddNumbers(addNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofSubtractNumbers(subtractNumbers)`.
         */
        fun conditionalExpression(subtractNumbers: SubtractNumbers) =
            conditionalExpression(ConditionalExpression.ofSubtractNumbers(subtractNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofMultiplyNumbers(multiplyNumbers)`.
         */
        fun conditionalExpression(multiplyNumbers: MultiplyNumbers) =
            conditionalExpression(ConditionalExpression.ofMultiplyNumbers(multiplyNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofDivideNumbers(divideNumbers)`.
         */
        fun conditionalExpression(divideNumbers: DivideNumbers) =
            conditionalExpression(ConditionalExpression.ofDivideNumbers(divideNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofRoundDownNumbers(roundDownNumbers)`.
         */
        fun conditionalExpression(roundDownNumbers: RoundDownNumbers) =
            conditionalExpression(ConditionalExpression.ofRoundDownNumbers(roundDownNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofRoundUpNumbers(roundUpNumbers)`.
         */
        fun conditionalExpression(roundUpNumbers: RoundUpNumbers) =
            conditionalExpression(ConditionalExpression.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun conditionalExpression(roundNearestNumbers: RoundNearestNumbers) =
            conditionalExpression(ConditionalExpression.ofRoundNearestNumbers(roundNearestNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofUpperCase(upperCase)`.
         */
        fun conditionalExpression(upperCase: UpperCase) =
            conditionalExpression(ConditionalExpression.ofUpperCase(upperCase))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofLowerCase(lowerCase)`.
         */
        fun conditionalExpression(lowerCase: LowerCase) =
            conditionalExpression(ConditionalExpression.ofLowerCase(lowerCase))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofConcatStrings(concatStrings)`.
         */
        fun conditionalExpression(concatStrings: ConcatStrings) =
            conditionalExpression(ConditionalExpression.ofConcatStrings(concatStrings))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofContains(contains)`.
         */
        fun conditionalExpression(contains: Contains) =
            conditionalExpression(ConditionalExpression.ofContains(contains))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofBeginsWith(beginsWith)`.
         */
        fun conditionalExpression(beginsWith: BeginsWith) =
            conditionalExpression(ConditionalExpression.ofBeginsWith(beginsWith))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofNumberToString(numberToString)`.
         */
        fun conditionalExpression(numberToString: NumberToString) =
            conditionalExpression(ConditionalExpression.ofNumberToString(numberToString))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofParseNumber(parseNumber)`.
         */
        fun conditionalExpression(parseNumber: ParseNumber) =
            conditionalExpression(ConditionalExpression.ofParseNumber(parseNumber))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun conditionalExpression(fetchExchangeRate: FetchExchangeRate) =
            conditionalExpression(ConditionalExpression.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun conditionalExpression(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            conditionalExpression(
                ConditionalExpression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun conditionalExpression(
            fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
        ) =
            conditionalExpression(
                ConditionalExpression.ofFetchSingleCurrencyPortalCurrency(
                    fetchSingleCurrencyPortalCurrency
                )
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun conditionalExpression(datedExchangeRate: DatedExchangeRate) =
            conditionalExpression(ConditionalExpression.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofPipelineProbability(pipelineProbability)`.
         */
        fun conditionalExpression(pipelineProbability: PipelineProbability) =
            conditionalExpression(ConditionalExpression.ofPipelineProbability(pipelineProbability))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofMaxNumbers(maxNumbers)`.
         */
        fun conditionalExpression(maxNumbers: MaxNumbers) =
            conditionalExpression(ConditionalExpression.ofMaxNumbers(maxNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofMinNumbers(minNumbers)`.
         */
        fun conditionalExpression(minNumbers: MinNumbers) =
            conditionalExpression(ConditionalExpression.ofMinNumbers(minNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofLessThan(lessThan)`.
         */
        fun conditionalExpression(lessThan: LessThan) =
            conditionalExpression(ConditionalExpression.ofLessThan(lessThan))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofLessThanOrEqual(lessThanOrEqual)`.
         */
        fun conditionalExpression(lessThanOrEqual: LessThanOrEqual) =
            conditionalExpression(ConditionalExpression.ofLessThanOrEqual(lessThanOrEqual))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofMoreThan(moreThan)`.
         */
        fun conditionalExpression(moreThan: MoreThan) =
            conditionalExpression(ConditionalExpression.ofMoreThan(moreThan))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofMoreThanOrEqual(moreThanOrEqual)`.
         */
        fun conditionalExpression(moreThanOrEqual: MoreThanOrEqual) =
            conditionalExpression(ConditionalExpression.ofMoreThanOrEqual(moreThanOrEqual))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofNumberEquals(numberEquals)`.
         */
        fun conditionalExpression(numberEquals: NumberEquals) =
            conditionalExpression(ConditionalExpression.ofNumberEquals(numberEquals))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofStringEquals(stringEquals)`.
         */
        fun conditionalExpression(stringEquals: StringEquals) =
            conditionalExpression(ConditionalExpression.ofStringEquals(stringEquals))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun conditionalExpression(isPipelineStageClosed: IsPipelineStageClosed) =
            conditionalExpression(
                ConditionalExpression.ofIsPipelineStageClosed(isPipelineStageClosed)
            )

        /** Alias for calling [conditionalExpression] with `ConditionalExpression.ofNot(not)`. */
        fun conditionalExpression(not: Not) =
            conditionalExpression(ConditionalExpression.ofNot(not))

        /** Alias for calling [conditionalExpression] with `ConditionalExpression.ofDate(date)`. */
        fun conditionalExpression(date: Date) =
            conditionalExpression(ConditionalExpression.ofDate(date))

        /**
         * Alias for calling [conditionalExpression] with `ConditionalExpression.ofMonth(month)`.
         */
        fun conditionalExpression(month: Month) =
            conditionalExpression(ConditionalExpression.ofMonth(month))

        /** Alias for calling [conditionalExpression] with `ConditionalExpression.ofYear(year)`. */
        fun conditionalExpression(year: Year) =
            conditionalExpression(ConditionalExpression.ofYear(year))

        /** Alias for calling [conditionalExpression] with `ConditionalExpression.ofNow(now)`. */
        fun conditionalExpression(now: Now) =
            conditionalExpression(ConditionalExpression.ofNow(now))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofTimeBetween(timeBetween)`.
         */
        fun conditionalExpression(timeBetween: TimeBetween) =
            conditionalExpression(ConditionalExpression.ofTimeBetween(timeBetween))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends)`.
         */
        fun conditionalExpression(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
            conditionalExpression(
                ConditionalExpression.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofPeriodToMonths(periodToMonths)`.
         */
        fun conditionalExpression(periodToMonths: PeriodToMonths) =
            conditionalExpression(ConditionalExpression.ofPeriodToMonths(periodToMonths))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofPeriodToWeeks(periodToWeeks)`.
         */
        fun conditionalExpression(periodToWeeks: PeriodToWeeks) =
            conditionalExpression(ConditionalExpression.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [conditionalExpression] with `ConditionalExpression.ofAnd(and)`. */
        fun conditionalExpression(and: And) =
            conditionalExpression(ConditionalExpression.ofAnd(and))

        /** Alias for calling [conditionalExpression] with `ConditionalExpression.ofOr(or)`. */
        fun conditionalExpression(or: Or) = conditionalExpression(ConditionalExpression.ofOr(or))

        /** Alias for calling [conditionalExpression] with `ConditionalExpression.ofXor(xor)`. */
        fun conditionalExpression(xor: Xor) =
            conditionalExpression(ConditionalExpression.ofXor(xor))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofIfString(ifString)`.
         */
        fun conditionalExpression(ifString: IfString) =
            conditionalExpression(ConditionalExpression.ofIfString(ifString))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofIfNumber(ifNumber)`.
         */
        fun conditionalExpression(ifNumber: IfNumber) =
            conditionalExpression(ConditionalExpression.ofIfNumber(ifNumber))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofIfBoolean(ifBoolean)`.
         */
        fun conditionalExpression(ifBoolean: IfBoolean) =
            conditionalExpression(ConditionalExpression.ofIfBoolean(ifBoolean))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofIsPresent(isPresent)`.
         */
        fun conditionalExpression(isPresent: IsPresent) =
            conditionalExpression(ConditionalExpression.ofIsPresent(isPresent))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofHasEmailReply(hasEmailReply)`.
         */
        fun conditionalExpression(hasEmailReply: HasEmailReply) =
            conditionalExpression(ConditionalExpression.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun conditionalExpression(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            conditionalExpression(
                ConditionalExpression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun conditionalExpression(
            extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
        ) =
            conditionalExpression(
                ConditionalExpression.ofExtractMostRecentEmailReplyHtml(
                    extractMostRecentEmailReplyHtml
                )
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun conditionalExpression(
            extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
        ) =
            conditionalExpression(
                ConditionalExpression.ofExtractMostRecentEmailReplyText(
                    extractMostRecentEmailReplyText
                )
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun conditionalExpression(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) =
            conditionalExpression(
                ConditionalExpression.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofSetContainsString(setContainsString)`.
         */
        fun conditionalExpression(setContainsString: SetContainsString) =
            conditionalExpression(ConditionalExpression.ofSetContainsString(setContainsString))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofIsEngagementType(isEngagementType)`.
         */
        fun conditionalExpression(isEngagementType: IsEngagementType) =
            conditionalExpression(ConditionalExpression.ofIsEngagementType(isEngagementType))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofFormatFullName(formatFullName)`.
         */
        fun conditionalExpression(formatFullName: FormatFullName) =
            conditionalExpression(ConditionalExpression.ofFormatFullName(formatFullName))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofFormatPhoneNumber(formatPhoneNumber)`.
         */
        fun conditionalExpression(formatPhoneNumber: FormatPhoneNumber) =
            conditionalExpression(ConditionalExpression.ofFormatPhoneNumber(formatPhoneNumber))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber)`.
         */
        fun conditionalExpression(formatSearchablePhoneNumber: FormatSearchablePhoneNumber) =
            conditionalExpression(
                ConditionalExpression.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofAbsoluteValue(absoluteValue)`.
         */
        fun conditionalExpression(absoluteValue: AbsoluteValue) =
            conditionalExpression(ConditionalExpression.ofAbsoluteValue(absoluteValue))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofSquareRoot(squareRoot)`.
         */
        fun conditionalExpression(squareRoot: SquareRoot) =
            conditionalExpression(ConditionalExpression.ofSquareRoot(squareRoot))

        /**
         * Alias for calling [conditionalExpression] with `ConditionalExpression.ofPower(power)`.
         */
        fun conditionalExpression(power: Power) =
            conditionalExpression(ConditionalExpression.ofPower(power))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofSubstring(substring)`.
         */
        fun conditionalExpression(substring: Substring) =
            conditionalExpression(ConditionalExpression.ofSubstring(substring))

        /**
         * Alias for calling [conditionalExpression] with `ConditionalExpression.ofEuler(euler)`.
         */
        fun conditionalExpression(euler: Euler) =
            conditionalExpression(ConditionalExpression.ofEuler(euler))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofStringLength(stringLength)`.
         */
        fun conditionalExpression(stringLength: StringLength) =
            conditionalExpression(ConditionalExpression.ofStringLength(stringLength))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofAddTime(addTime)`.
         */
        fun conditionalExpression(addTime: AddTime) =
            conditionalExpression(ConditionalExpression.ofAddTime(addTime))

        /**
         * Alias for calling [conditionalExpression] with
         * `ConditionalExpression.ofSubtractTime(subtractTime)`.
         */
        fun conditionalExpression(subtractTime: SubtractTime) =
            conditionalExpression(ConditionalExpression.ofSubtractTime(subtractTime))

        fun conditionalFormula(conditionalFormula: String) =
            conditionalFormula(JsonField.of(conditionalFormula))

        /**
         * Sets [Builder.conditionalFormula] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionalFormula] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditionalFormula(conditionalFormula: JsonField<String>) = apply {
            this.conditionalFormula = conditionalFormula
        }

        fun emptyRollupValue(emptyRollupValue: String) =
            emptyRollupValue(JsonField.of(emptyRollupValue))

        /**
         * Sets [Builder.emptyRollupValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emptyRollupValue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emptyRollupValue(emptyRollupValue: JsonField<String>) = apply {
            this.emptyRollupValue = emptyRollupValue
        }

        fun sourceCompareByPropertyName(sourceCompareByPropertyName: String) =
            sourceCompareByPropertyName(JsonField.of(sourceCompareByPropertyName))

        /**
         * Sets [Builder.sourceCompareByPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceCompareByPropertyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sourceCompareByPropertyName(sourceCompareByPropertyName: JsonField<String>) = apply {
            this.sourceCompareByPropertyName = sourceCompareByPropertyName
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
         * Returns an immutable instance of [RollupExpression].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associationTypes()
         * .rollupOperator()
         * .sourceObjectTypeId()
         * .sourcePropertyName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RollupExpression =
            RollupExpression(
                checkRequired("associationTypes", associationTypes).map { it.toImmutable() },
                checkRequired("rollupOperator", rollupOperator),
                checkRequired("sourceObjectTypeId", sourceObjectTypeId),
                checkRequired("sourcePropertyName", sourcePropertyName),
                conditionalExpression,
                conditionalFormula,
                emptyRollupValue,
                sourceCompareByPropertyName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RollupExpression = apply {
        if (validated) {
            return@apply
        }

        associationTypes().forEach { it.validate() }
        rollupOperator().validate()
        sourceObjectTypeId()
        sourcePropertyName()
        conditionalExpression().ifPresent { it.validate() }
        conditionalFormula()
        emptyRollupValue()
        sourceCompareByPropertyName()
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
        (associationTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (rollupOperator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceObjectTypeId.asKnown().isPresent) 1 else 0) +
            (if (sourcePropertyName.asKnown().isPresent) 1 else 0) +
            (conditionalExpression.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conditionalFormula.asKnown().isPresent) 1 else 0) +
            (if (emptyRollupValue.asKnown().isPresent) 1 else 0) +
            (if (sourceCompareByPropertyName.asKnown().isPresent) 1 else 0)

    class RollupOperator @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AVERAGE = of("AVERAGE")

            @JvmField val COUNT = of("COUNT")

            @JvmField val EARLIEST_VALUE = of("EARLIEST_VALUE")

            @JvmField val LATEST_VALUE = of("LATEST_VALUE")

            @JvmField val MAX = of("MAX")

            @JvmField val MAX_BY = of("MAX_BY")

            @JvmField val MIN = of("MIN")

            @JvmField val MIN_BY = of("MIN_BY")

            @JvmField val REFERENCED_ID_SET = of("REFERENCED_ID_SET")

            @JvmField val REFERENCED_STRING_SET = of("REFERENCED_STRING_SET")

            @JvmField
            val REFERENCED_STRING_SET_INTERSECTION = of("REFERENCED_STRING_SET_INTERSECTION")

            @JvmField val SUM = of("SUM")

            @JvmField val SYNC_MAX_BY = of("SYNC_MAX_BY")

            @JvmField val SYNC_MIN_BY = of("SYNC_MIN_BY")

            @JvmField val SYNC_VALUE = of("SYNC_VALUE")

            @JvmField val UNKNOWN_ROLLUP_OPERATOR = of("UNKNOWN_ROLLUP_OPERATOR")

            @JvmStatic fun of(value: String) = RollupOperator(JsonField.of(value))
        }

        /** An enum containing [RollupOperator]'s known values. */
        enum class Known {
            AVERAGE,
            COUNT,
            EARLIEST_VALUE,
            LATEST_VALUE,
            MAX,
            MAX_BY,
            MIN,
            MIN_BY,
            REFERENCED_ID_SET,
            REFERENCED_STRING_SET,
            REFERENCED_STRING_SET_INTERSECTION,
            SUM,
            SYNC_MAX_BY,
            SYNC_MIN_BY,
            SYNC_VALUE,
            UNKNOWN_ROLLUP_OPERATOR,
        }

        /**
         * An enum containing [RollupOperator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RollupOperator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AVERAGE,
            COUNT,
            EARLIEST_VALUE,
            LATEST_VALUE,
            MAX,
            MAX_BY,
            MIN,
            MIN_BY,
            REFERENCED_ID_SET,
            REFERENCED_STRING_SET,
            REFERENCED_STRING_SET_INTERSECTION,
            SUM,
            SYNC_MAX_BY,
            SYNC_MIN_BY,
            SYNC_VALUE,
            UNKNOWN_ROLLUP_OPERATOR,
            /**
             * An enum member indicating that [RollupOperator] was instantiated with an unknown
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
                AVERAGE -> Value.AVERAGE
                COUNT -> Value.COUNT
                EARLIEST_VALUE -> Value.EARLIEST_VALUE
                LATEST_VALUE -> Value.LATEST_VALUE
                MAX -> Value.MAX
                MAX_BY -> Value.MAX_BY
                MIN -> Value.MIN
                MIN_BY -> Value.MIN_BY
                REFERENCED_ID_SET -> Value.REFERENCED_ID_SET
                REFERENCED_STRING_SET -> Value.REFERENCED_STRING_SET
                REFERENCED_STRING_SET_INTERSECTION -> Value.REFERENCED_STRING_SET_INTERSECTION
                SUM -> Value.SUM
                SYNC_MAX_BY -> Value.SYNC_MAX_BY
                SYNC_MIN_BY -> Value.SYNC_MIN_BY
                SYNC_VALUE -> Value.SYNC_VALUE
                UNKNOWN_ROLLUP_OPERATOR -> Value.UNKNOWN_ROLLUP_OPERATOR
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
                AVERAGE -> Known.AVERAGE
                COUNT -> Known.COUNT
                EARLIEST_VALUE -> Known.EARLIEST_VALUE
                LATEST_VALUE -> Known.LATEST_VALUE
                MAX -> Known.MAX
                MAX_BY -> Known.MAX_BY
                MIN -> Known.MIN
                MIN_BY -> Known.MIN_BY
                REFERENCED_ID_SET -> Known.REFERENCED_ID_SET
                REFERENCED_STRING_SET -> Known.REFERENCED_STRING_SET
                REFERENCED_STRING_SET_INTERSECTION -> Known.REFERENCED_STRING_SET_INTERSECTION
                SUM -> Known.SUM
                SYNC_MAX_BY -> Known.SYNC_MAX_BY
                SYNC_MIN_BY -> Known.SYNC_MIN_BY
                SYNC_VALUE -> Known.SYNC_VALUE
                UNKNOWN_ROLLUP_OPERATOR -> Known.UNKNOWN_ROLLUP_OPERATOR
                else -> throw HubSpotInvalidDataException("Unknown RollupOperator: $value")
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

        fun validate(): RollupOperator = apply {
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

            return other is RollupOperator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = ConditionalExpression.Deserializer::class)
    @JsonSerialize(using = ConditionalExpression.Serializer::class)
    class ConditionalExpression
    private constructor(
        private val constantBoolean: ConstantBoolean? = null,
        private val constantNumber: ConstantNumber? = null,
        private val constantString: ConstantString? = null,
        private val booleanPropertyVariable: BooleanPropertyVariable? = null,
        private val stringPropertyVariable: StringPropertyVariable? = null,
        private val numberPropertyVariable: NumberPropertyVariable? = null,
        private val timestampOfPropertyVariable: TimestampOfPropertyVariable? = null,
        private val booleanTargetPropertyVariable: BooleanTargetPropertyVariable? = null,
        private val stringTargetPropertyVariable: StringTargetPropertyVariable? = null,
        private val numberTargetPropertyVariable: NumberTargetPropertyVariable? = null,
        private val timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable? = null,
        private val addNumbers: AddNumbers? = null,
        private val subtractNumbers: SubtractNumbers? = null,
        private val multiplyNumbers: MultiplyNumbers? = null,
        private val divideNumbers: DivideNumbers? = null,
        private val roundDownNumbers: RoundDownNumbers? = null,
        private val roundUpNumbers: RoundUpNumbers? = null,
        private val roundNearestNumbers: RoundNearestNumbers? = null,
        private val upperCase: UpperCase? = null,
        private val lowerCase: LowerCase? = null,
        private val concatStrings: ConcatStrings? = null,
        private val contains: Contains? = null,
        private val beginsWith: BeginsWith? = null,
        private val numberToString: NumberToString? = null,
        private val parseNumber: ParseNumber? = null,
        private val fetchExchangeRate: FetchExchangeRate? = null,
        private val fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces? = null,
        private val fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency? = null,
        private val datedExchangeRate: DatedExchangeRate? = null,
        private val pipelineProbability: PipelineProbability? = null,
        private val maxNumbers: MaxNumbers? = null,
        private val minNumbers: MinNumbers? = null,
        private val lessThan: LessThan? = null,
        private val lessThanOrEqual: LessThanOrEqual? = null,
        private val moreThan: MoreThan? = null,
        private val moreThanOrEqual: MoreThanOrEqual? = null,
        private val numberEquals: NumberEquals? = null,
        private val stringEquals: StringEquals? = null,
        private val isPipelineStageClosed: IsPipelineStageClosed? = null,
        private val not: Not? = null,
        private val date: Date? = null,
        private val month: Month? = null,
        private val year: Year? = null,
        private val now: Now? = null,
        private val timeBetween: TimeBetween? = null,
        private val timeBetweenSkipWeekends: TimeBetweenSkipWeekends? = null,
        private val periodToMonths: PeriodToMonths? = null,
        private val periodToWeeks: PeriodToWeeks? = null,
        private val and: And? = null,
        private val or: Or? = null,
        private val xor: Xor? = null,
        private val ifString: IfString? = null,
        private val ifNumber: IfNumber? = null,
        private val ifBoolean: IfBoolean? = null,
        private val isPresent: IsPresent? = null,
        private val hasEmailReply: HasEmailReply? = null,
        private val hasPlainTextEmailReply: HasPlainTextEmailReply? = null,
        private val extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml? = null,
        private val extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText? = null,
        private val extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply? =
            null,
        private val setContainsString: SetContainsString? = null,
        private val isEngagementType: IsEngagementType? = null,
        private val formatFullName: FormatFullName? = null,
        private val formatPhoneNumber: FormatPhoneNumber? = null,
        private val formatSearchablePhoneNumber: FormatSearchablePhoneNumber? = null,
        private val absoluteValue: AbsoluteValue? = null,
        private val squareRoot: SquareRoot? = null,
        private val power: Power? = null,
        private val substring: Substring? = null,
        private val euler: Euler? = null,
        private val stringLength: StringLength? = null,
        private val addTime: AddTime? = null,
        private val subtractTime: SubtractTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun constantBoolean(): Optional<ConstantBoolean> = Optional.ofNullable(constantBoolean)

        fun constantNumber(): Optional<ConstantNumber> = Optional.ofNullable(constantNumber)

        fun constantString(): Optional<ConstantString> = Optional.ofNullable(constantString)

        fun booleanPropertyVariable(): Optional<BooleanPropertyVariable> =
            Optional.ofNullable(booleanPropertyVariable)

        fun stringPropertyVariable(): Optional<StringPropertyVariable> =
            Optional.ofNullable(stringPropertyVariable)

        fun numberPropertyVariable(): Optional<NumberPropertyVariable> =
            Optional.ofNullable(numberPropertyVariable)

        fun timestampOfPropertyVariable(): Optional<TimestampOfPropertyVariable> =
            Optional.ofNullable(timestampOfPropertyVariable)

        fun booleanTargetPropertyVariable(): Optional<BooleanTargetPropertyVariable> =
            Optional.ofNullable(booleanTargetPropertyVariable)

        fun stringTargetPropertyVariable(): Optional<StringTargetPropertyVariable> =
            Optional.ofNullable(stringTargetPropertyVariable)

        fun numberTargetPropertyVariable(): Optional<NumberTargetPropertyVariable> =
            Optional.ofNullable(numberTargetPropertyVariable)

        fun timestampOfTargetPropertyVariable(): Optional<TimestampOfTargetPropertyVariable> =
            Optional.ofNullable(timestampOfTargetPropertyVariable)

        fun addNumbers(): Optional<AddNumbers> = Optional.ofNullable(addNumbers)

        fun subtractNumbers(): Optional<SubtractNumbers> = Optional.ofNullable(subtractNumbers)

        fun multiplyNumbers(): Optional<MultiplyNumbers> = Optional.ofNullable(multiplyNumbers)

        fun divideNumbers(): Optional<DivideNumbers> = Optional.ofNullable(divideNumbers)

        fun roundDownNumbers(): Optional<RoundDownNumbers> = Optional.ofNullable(roundDownNumbers)

        fun roundUpNumbers(): Optional<RoundUpNumbers> = Optional.ofNullable(roundUpNumbers)

        fun roundNearestNumbers(): Optional<RoundNearestNumbers> =
            Optional.ofNullable(roundNearestNumbers)

        fun upperCase(): Optional<UpperCase> = Optional.ofNullable(upperCase)

        fun lowerCase(): Optional<LowerCase> = Optional.ofNullable(lowerCase)

        fun concatStrings(): Optional<ConcatStrings> = Optional.ofNullable(concatStrings)

        fun contains(): Optional<Contains> = Optional.ofNullable(contains)

        fun beginsWith(): Optional<BeginsWith> = Optional.ofNullable(beginsWith)

        fun numberToString(): Optional<NumberToString> = Optional.ofNullable(numberToString)

        fun parseNumber(): Optional<ParseNumber> = Optional.ofNullable(parseNumber)

        fun fetchExchangeRate(): Optional<FetchExchangeRate> =
            Optional.ofNullable(fetchExchangeRate)

        fun fetchCurrencyDecimalPlaces(): Optional<FetchCurrencyDecimalPlaces> =
            Optional.ofNullable(fetchCurrencyDecimalPlaces)

        fun fetchSingleCurrencyPortalCurrency(): Optional<FetchSingleCurrencyPortalCurrency> =
            Optional.ofNullable(fetchSingleCurrencyPortalCurrency)

        fun datedExchangeRate(): Optional<DatedExchangeRate> =
            Optional.ofNullable(datedExchangeRate)

        fun pipelineProbability(): Optional<PipelineProbability> =
            Optional.ofNullable(pipelineProbability)

        fun maxNumbers(): Optional<MaxNumbers> = Optional.ofNullable(maxNumbers)

        fun minNumbers(): Optional<MinNumbers> = Optional.ofNullable(minNumbers)

        fun lessThan(): Optional<LessThan> = Optional.ofNullable(lessThan)

        fun lessThanOrEqual(): Optional<LessThanOrEqual> = Optional.ofNullable(lessThanOrEqual)

        fun moreThan(): Optional<MoreThan> = Optional.ofNullable(moreThan)

        fun moreThanOrEqual(): Optional<MoreThanOrEqual> = Optional.ofNullable(moreThanOrEqual)

        fun numberEquals(): Optional<NumberEquals> = Optional.ofNullable(numberEquals)

        fun stringEquals(): Optional<StringEquals> = Optional.ofNullable(stringEquals)

        fun isPipelineStageClosed(): Optional<IsPipelineStageClosed> =
            Optional.ofNullable(isPipelineStageClosed)

        fun not(): Optional<Not> = Optional.ofNullable(not)

        fun date(): Optional<Date> = Optional.ofNullable(date)

        fun month(): Optional<Month> = Optional.ofNullable(month)

        fun year(): Optional<Year> = Optional.ofNullable(year)

        fun now(): Optional<Now> = Optional.ofNullable(now)

        fun timeBetween(): Optional<TimeBetween> = Optional.ofNullable(timeBetween)

        fun timeBetweenSkipWeekends(): Optional<TimeBetweenSkipWeekends> =
            Optional.ofNullable(timeBetweenSkipWeekends)

        fun periodToMonths(): Optional<PeriodToMonths> = Optional.ofNullable(periodToMonths)

        fun periodToWeeks(): Optional<PeriodToWeeks> = Optional.ofNullable(periodToWeeks)

        fun and(): Optional<And> = Optional.ofNullable(and)

        fun or(): Optional<Or> = Optional.ofNullable(or)

        fun xor(): Optional<Xor> = Optional.ofNullable(xor)

        fun ifString(): Optional<IfString> = Optional.ofNullable(ifString)

        fun ifNumber(): Optional<IfNumber> = Optional.ofNullable(ifNumber)

        fun ifBoolean(): Optional<IfBoolean> = Optional.ofNullable(ifBoolean)

        fun isPresent(): Optional<IsPresent> = Optional.ofNullable(isPresent)

        fun hasEmailReply(): Optional<HasEmailReply> = Optional.ofNullable(hasEmailReply)

        fun hasPlainTextEmailReply(): Optional<HasPlainTextEmailReply> =
            Optional.ofNullable(hasPlainTextEmailReply)

        fun extractMostRecentEmailReplyHtml(): Optional<ExtractMostRecentEmailReplyHtml> =
            Optional.ofNullable(extractMostRecentEmailReplyHtml)

        fun extractMostRecentEmailReplyText(): Optional<ExtractMostRecentEmailReplyText> =
            Optional.ofNullable(extractMostRecentEmailReplyText)

        fun extractMostRecentPlainTextEmailReply(): Optional<ExtractMostRecentPlainTextEmailReply> =
            Optional.ofNullable(extractMostRecentPlainTextEmailReply)

        fun setContainsString(): Optional<SetContainsString> =
            Optional.ofNullable(setContainsString)

        fun isEngagementType(): Optional<IsEngagementType> = Optional.ofNullable(isEngagementType)

        fun formatFullName(): Optional<FormatFullName> = Optional.ofNullable(formatFullName)

        fun formatPhoneNumber(): Optional<FormatPhoneNumber> =
            Optional.ofNullable(formatPhoneNumber)

        fun formatSearchablePhoneNumber(): Optional<FormatSearchablePhoneNumber> =
            Optional.ofNullable(formatSearchablePhoneNumber)

        fun absoluteValue(): Optional<AbsoluteValue> = Optional.ofNullable(absoluteValue)

        fun squareRoot(): Optional<SquareRoot> = Optional.ofNullable(squareRoot)

        fun power(): Optional<Power> = Optional.ofNullable(power)

        fun substring(): Optional<Substring> = Optional.ofNullable(substring)

        fun euler(): Optional<Euler> = Optional.ofNullable(euler)

        fun stringLength(): Optional<StringLength> = Optional.ofNullable(stringLength)

        fun addTime(): Optional<AddTime> = Optional.ofNullable(addTime)

        fun subtractTime(): Optional<SubtractTime> = Optional.ofNullable(subtractTime)

        fun isConstantBoolean(): Boolean = constantBoolean != null

        fun isConstantNumber(): Boolean = constantNumber != null

        fun isConstantString(): Boolean = constantString != null

        fun isBooleanPropertyVariable(): Boolean = booleanPropertyVariable != null

        fun isStringPropertyVariable(): Boolean = stringPropertyVariable != null

        fun isNumberPropertyVariable(): Boolean = numberPropertyVariable != null

        fun isTimestampOfPropertyVariable(): Boolean = timestampOfPropertyVariable != null

        fun isBooleanTargetPropertyVariable(): Boolean = booleanTargetPropertyVariable != null

        fun isStringTargetPropertyVariable(): Boolean = stringTargetPropertyVariable != null

        fun isNumberTargetPropertyVariable(): Boolean = numberTargetPropertyVariable != null

        fun isTimestampOfTargetPropertyVariable(): Boolean =
            timestampOfTargetPropertyVariable != null

        fun isAddNumbers(): Boolean = addNumbers != null

        fun isSubtractNumbers(): Boolean = subtractNumbers != null

        fun isMultiplyNumbers(): Boolean = multiplyNumbers != null

        fun isDivideNumbers(): Boolean = divideNumbers != null

        fun isRoundDownNumbers(): Boolean = roundDownNumbers != null

        fun isRoundUpNumbers(): Boolean = roundUpNumbers != null

        fun isRoundNearestNumbers(): Boolean = roundNearestNumbers != null

        fun isUpperCase(): Boolean = upperCase != null

        fun isLowerCase(): Boolean = lowerCase != null

        fun isConcatStrings(): Boolean = concatStrings != null

        fun isContains(): Boolean = contains != null

        fun isBeginsWith(): Boolean = beginsWith != null

        fun isNumberToString(): Boolean = numberToString != null

        fun isParseNumber(): Boolean = parseNumber != null

        fun isFetchExchangeRate(): Boolean = fetchExchangeRate != null

        fun isFetchCurrencyDecimalPlaces(): Boolean = fetchCurrencyDecimalPlaces != null

        fun isFetchSingleCurrencyPortalCurrency(): Boolean =
            fetchSingleCurrencyPortalCurrency != null

        fun isDatedExchangeRate(): Boolean = datedExchangeRate != null

        fun isPipelineProbability(): Boolean = pipelineProbability != null

        fun isMaxNumbers(): Boolean = maxNumbers != null

        fun isMinNumbers(): Boolean = minNumbers != null

        fun isLessThan(): Boolean = lessThan != null

        fun isLessThanOrEqual(): Boolean = lessThanOrEqual != null

        fun isMoreThan(): Boolean = moreThan != null

        fun isMoreThanOrEqual(): Boolean = moreThanOrEqual != null

        fun isNumberEquals(): Boolean = numberEquals != null

        fun isStringEquals(): Boolean = stringEquals != null

        fun isIsPipelineStageClosed(): Boolean = isPipelineStageClosed != null

        fun isNot(): Boolean = not != null

        fun isDate(): Boolean = date != null

        fun isMonth(): Boolean = month != null

        fun isYear(): Boolean = year != null

        fun isNow(): Boolean = now != null

        fun isTimeBetween(): Boolean = timeBetween != null

        fun isTimeBetweenSkipWeekends(): Boolean = timeBetweenSkipWeekends != null

        fun isPeriodToMonths(): Boolean = periodToMonths != null

        fun isPeriodToWeeks(): Boolean = periodToWeeks != null

        fun isAnd(): Boolean = and != null

        fun isOr(): Boolean = or != null

        fun isXor(): Boolean = xor != null

        fun isIfString(): Boolean = ifString != null

        fun isIfNumber(): Boolean = ifNumber != null

        fun isIfBoolean(): Boolean = ifBoolean != null

        fun isIsPresent(): Boolean = isPresent != null

        fun isHasEmailReply(): Boolean = hasEmailReply != null

        fun isHasPlainTextEmailReply(): Boolean = hasPlainTextEmailReply != null

        fun isExtractMostRecentEmailReplyHtml(): Boolean = extractMostRecentEmailReplyHtml != null

        fun isExtractMostRecentEmailReplyText(): Boolean = extractMostRecentEmailReplyText != null

        fun isExtractMostRecentPlainTextEmailReply(): Boolean =
            extractMostRecentPlainTextEmailReply != null

        fun isSetContainsString(): Boolean = setContainsString != null

        fun isIsEngagementType(): Boolean = isEngagementType != null

        fun isFormatFullName(): Boolean = formatFullName != null

        fun isFormatPhoneNumber(): Boolean = formatPhoneNumber != null

        fun isFormatSearchablePhoneNumber(): Boolean = formatSearchablePhoneNumber != null

        fun isAbsoluteValue(): Boolean = absoluteValue != null

        fun isSquareRoot(): Boolean = squareRoot != null

        fun isPower(): Boolean = power != null

        fun isSubstring(): Boolean = substring != null

        fun isEuler(): Boolean = euler != null

        fun isStringLength(): Boolean = stringLength != null

        fun isAddTime(): Boolean = addTime != null

        fun isSubtractTime(): Boolean = subtractTime != null

        fun asConstantBoolean(): ConstantBoolean = constantBoolean.getOrThrow("constantBoolean")

        fun asConstantNumber(): ConstantNumber = constantNumber.getOrThrow("constantNumber")

        fun asConstantString(): ConstantString = constantString.getOrThrow("constantString")

        fun asBooleanPropertyVariable(): BooleanPropertyVariable =
            booleanPropertyVariable.getOrThrow("booleanPropertyVariable")

        fun asStringPropertyVariable(): StringPropertyVariable =
            stringPropertyVariable.getOrThrow("stringPropertyVariable")

        fun asNumberPropertyVariable(): NumberPropertyVariable =
            numberPropertyVariable.getOrThrow("numberPropertyVariable")

        fun asTimestampOfPropertyVariable(): TimestampOfPropertyVariable =
            timestampOfPropertyVariable.getOrThrow("timestampOfPropertyVariable")

        fun asBooleanTargetPropertyVariable(): BooleanTargetPropertyVariable =
            booleanTargetPropertyVariable.getOrThrow("booleanTargetPropertyVariable")

        fun asStringTargetPropertyVariable(): StringTargetPropertyVariable =
            stringTargetPropertyVariable.getOrThrow("stringTargetPropertyVariable")

        fun asNumberTargetPropertyVariable(): NumberTargetPropertyVariable =
            numberTargetPropertyVariable.getOrThrow("numberTargetPropertyVariable")

        fun asTimestampOfTargetPropertyVariable(): TimestampOfTargetPropertyVariable =
            timestampOfTargetPropertyVariable.getOrThrow("timestampOfTargetPropertyVariable")

        fun asAddNumbers(): AddNumbers = addNumbers.getOrThrow("addNumbers")

        fun asSubtractNumbers(): SubtractNumbers = subtractNumbers.getOrThrow("subtractNumbers")

        fun asMultiplyNumbers(): MultiplyNumbers = multiplyNumbers.getOrThrow("multiplyNumbers")

        fun asDivideNumbers(): DivideNumbers = divideNumbers.getOrThrow("divideNumbers")

        fun asRoundDownNumbers(): RoundDownNumbers = roundDownNumbers.getOrThrow("roundDownNumbers")

        fun asRoundUpNumbers(): RoundUpNumbers = roundUpNumbers.getOrThrow("roundUpNumbers")

        fun asRoundNearestNumbers(): RoundNearestNumbers =
            roundNearestNumbers.getOrThrow("roundNearestNumbers")

        fun asUpperCase(): UpperCase = upperCase.getOrThrow("upperCase")

        fun asLowerCase(): LowerCase = lowerCase.getOrThrow("lowerCase")

        fun asConcatStrings(): ConcatStrings = concatStrings.getOrThrow("concatStrings")

        fun asContains(): Contains = contains.getOrThrow("contains")

        fun asBeginsWith(): BeginsWith = beginsWith.getOrThrow("beginsWith")

        fun asNumberToString(): NumberToString = numberToString.getOrThrow("numberToString")

        fun asParseNumber(): ParseNumber = parseNumber.getOrThrow("parseNumber")

        fun asFetchExchangeRate(): FetchExchangeRate =
            fetchExchangeRate.getOrThrow("fetchExchangeRate")

        fun asFetchCurrencyDecimalPlaces(): FetchCurrencyDecimalPlaces =
            fetchCurrencyDecimalPlaces.getOrThrow("fetchCurrencyDecimalPlaces")

        fun asFetchSingleCurrencyPortalCurrency(): FetchSingleCurrencyPortalCurrency =
            fetchSingleCurrencyPortalCurrency.getOrThrow("fetchSingleCurrencyPortalCurrency")

        fun asDatedExchangeRate(): DatedExchangeRate =
            datedExchangeRate.getOrThrow("datedExchangeRate")

        fun asPipelineProbability(): PipelineProbability =
            pipelineProbability.getOrThrow("pipelineProbability")

        fun asMaxNumbers(): MaxNumbers = maxNumbers.getOrThrow("maxNumbers")

        fun asMinNumbers(): MinNumbers = minNumbers.getOrThrow("minNumbers")

        fun asLessThan(): LessThan = lessThan.getOrThrow("lessThan")

        fun asLessThanOrEqual(): LessThanOrEqual = lessThanOrEqual.getOrThrow("lessThanOrEqual")

        fun asMoreThan(): MoreThan = moreThan.getOrThrow("moreThan")

        fun asMoreThanOrEqual(): MoreThanOrEqual = moreThanOrEqual.getOrThrow("moreThanOrEqual")

        fun asNumberEquals(): NumberEquals = numberEquals.getOrThrow("numberEquals")

        fun asStringEquals(): StringEquals = stringEquals.getOrThrow("stringEquals")

        fun asIsPipelineStageClosed(): IsPipelineStageClosed =
            isPipelineStageClosed.getOrThrow("isPipelineStageClosed")

        fun asNot(): Not = not.getOrThrow("not")

        fun asDate(): Date = date.getOrThrow("date")

        fun asMonth(): Month = month.getOrThrow("month")

        fun asYear(): Year = year.getOrThrow("year")

        fun asNow(): Now = now.getOrThrow("now")

        fun asTimeBetween(): TimeBetween = timeBetween.getOrThrow("timeBetween")

        fun asTimeBetweenSkipWeekends(): TimeBetweenSkipWeekends =
            timeBetweenSkipWeekends.getOrThrow("timeBetweenSkipWeekends")

        fun asPeriodToMonths(): PeriodToMonths = periodToMonths.getOrThrow("periodToMonths")

        fun asPeriodToWeeks(): PeriodToWeeks = periodToWeeks.getOrThrow("periodToWeeks")

        fun asAnd(): And = and.getOrThrow("and")

        fun asOr(): Or = or.getOrThrow("or")

        fun asXor(): Xor = xor.getOrThrow("xor")

        fun asIfString(): IfString = ifString.getOrThrow("ifString")

        fun asIfNumber(): IfNumber = ifNumber.getOrThrow("ifNumber")

        fun asIfBoolean(): IfBoolean = ifBoolean.getOrThrow("ifBoolean")

        fun asIsPresent(): IsPresent = isPresent.getOrThrow("isPresent")

        fun asHasEmailReply(): HasEmailReply = hasEmailReply.getOrThrow("hasEmailReply")

        fun asHasPlainTextEmailReply(): HasPlainTextEmailReply =
            hasPlainTextEmailReply.getOrThrow("hasPlainTextEmailReply")

        fun asExtractMostRecentEmailReplyHtml(): ExtractMostRecentEmailReplyHtml =
            extractMostRecentEmailReplyHtml.getOrThrow("extractMostRecentEmailReplyHtml")

        fun asExtractMostRecentEmailReplyText(): ExtractMostRecentEmailReplyText =
            extractMostRecentEmailReplyText.getOrThrow("extractMostRecentEmailReplyText")

        fun asExtractMostRecentPlainTextEmailReply(): ExtractMostRecentPlainTextEmailReply =
            extractMostRecentPlainTextEmailReply.getOrThrow("extractMostRecentPlainTextEmailReply")

        fun asSetContainsString(): SetContainsString =
            setContainsString.getOrThrow("setContainsString")

        fun asIsEngagementType(): IsEngagementType = isEngagementType.getOrThrow("isEngagementType")

        fun asFormatFullName(): FormatFullName = formatFullName.getOrThrow("formatFullName")

        fun asFormatPhoneNumber(): FormatPhoneNumber =
            formatPhoneNumber.getOrThrow("formatPhoneNumber")

        fun asFormatSearchablePhoneNumber(): FormatSearchablePhoneNumber =
            formatSearchablePhoneNumber.getOrThrow("formatSearchablePhoneNumber")

        fun asAbsoluteValue(): AbsoluteValue = absoluteValue.getOrThrow("absoluteValue")

        fun asSquareRoot(): SquareRoot = squareRoot.getOrThrow("squareRoot")

        fun asPower(): Power = power.getOrThrow("power")

        fun asSubstring(): Substring = substring.getOrThrow("substring")

        fun asEuler(): Euler = euler.getOrThrow("euler")

        fun asStringLength(): StringLength = stringLength.getOrThrow("stringLength")

        fun asAddTime(): AddTime = addTime.getOrThrow("addTime")

        fun asSubtractTime(): SubtractTime = subtractTime.getOrThrow("subtractTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                constantBoolean != null -> visitor.visitConstantBoolean(constantBoolean)
                constantNumber != null -> visitor.visitConstantNumber(constantNumber)
                constantString != null -> visitor.visitConstantString(constantString)
                booleanPropertyVariable != null ->
                    visitor.visitBooleanPropertyVariable(booleanPropertyVariable)
                stringPropertyVariable != null ->
                    visitor.visitStringPropertyVariable(stringPropertyVariable)
                numberPropertyVariable != null ->
                    visitor.visitNumberPropertyVariable(numberPropertyVariable)
                timestampOfPropertyVariable != null ->
                    visitor.visitTimestampOfPropertyVariable(timestampOfPropertyVariable)
                booleanTargetPropertyVariable != null ->
                    visitor.visitBooleanTargetPropertyVariable(booleanTargetPropertyVariable)
                stringTargetPropertyVariable != null ->
                    visitor.visitStringTargetPropertyVariable(stringTargetPropertyVariable)
                numberTargetPropertyVariable != null ->
                    visitor.visitNumberTargetPropertyVariable(numberTargetPropertyVariable)
                timestampOfTargetPropertyVariable != null ->
                    visitor.visitTimestampOfTargetPropertyVariable(
                        timestampOfTargetPropertyVariable
                    )
                addNumbers != null -> visitor.visitAddNumbers(addNumbers)
                subtractNumbers != null -> visitor.visitSubtractNumbers(subtractNumbers)
                multiplyNumbers != null -> visitor.visitMultiplyNumbers(multiplyNumbers)
                divideNumbers != null -> visitor.visitDivideNumbers(divideNumbers)
                roundDownNumbers != null -> visitor.visitRoundDownNumbers(roundDownNumbers)
                roundUpNumbers != null -> visitor.visitRoundUpNumbers(roundUpNumbers)
                roundNearestNumbers != null -> visitor.visitRoundNearestNumbers(roundNearestNumbers)
                upperCase != null -> visitor.visitUpperCase(upperCase)
                lowerCase != null -> visitor.visitLowerCase(lowerCase)
                concatStrings != null -> visitor.visitConcatStrings(concatStrings)
                contains != null -> visitor.visitContains(contains)
                beginsWith != null -> visitor.visitBeginsWith(beginsWith)
                numberToString != null -> visitor.visitNumberToString(numberToString)
                parseNumber != null -> visitor.visitParseNumber(parseNumber)
                fetchExchangeRate != null -> visitor.visitFetchExchangeRate(fetchExchangeRate)
                fetchCurrencyDecimalPlaces != null ->
                    visitor.visitFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)
                fetchSingleCurrencyPortalCurrency != null ->
                    visitor.visitFetchSingleCurrencyPortalCurrency(
                        fetchSingleCurrencyPortalCurrency
                    )
                datedExchangeRate != null -> visitor.visitDatedExchangeRate(datedExchangeRate)
                pipelineProbability != null -> visitor.visitPipelineProbability(pipelineProbability)
                maxNumbers != null -> visitor.visitMaxNumbers(maxNumbers)
                minNumbers != null -> visitor.visitMinNumbers(minNumbers)
                lessThan != null -> visitor.visitLessThan(lessThan)
                lessThanOrEqual != null -> visitor.visitLessThanOrEqual(lessThanOrEqual)
                moreThan != null -> visitor.visitMoreThan(moreThan)
                moreThanOrEqual != null -> visitor.visitMoreThanOrEqual(moreThanOrEqual)
                numberEquals != null -> visitor.visitNumberEquals(numberEquals)
                stringEquals != null -> visitor.visitStringEquals(stringEquals)
                isPipelineStageClosed != null ->
                    visitor.visitIsPipelineStageClosed(isPipelineStageClosed)
                not != null -> visitor.visitNot(not)
                date != null -> visitor.visitDate(date)
                month != null -> visitor.visitMonth(month)
                year != null -> visitor.visitYear(year)
                now != null -> visitor.visitNow(now)
                timeBetween != null -> visitor.visitTimeBetween(timeBetween)
                timeBetweenSkipWeekends != null ->
                    visitor.visitTimeBetweenSkipWeekends(timeBetweenSkipWeekends)
                periodToMonths != null -> visitor.visitPeriodToMonths(periodToMonths)
                periodToWeeks != null -> visitor.visitPeriodToWeeks(periodToWeeks)
                and != null -> visitor.visitAnd(and)
                or != null -> visitor.visitOr(or)
                xor != null -> visitor.visitXor(xor)
                ifString != null -> visitor.visitIfString(ifString)
                ifNumber != null -> visitor.visitIfNumber(ifNumber)
                ifBoolean != null -> visitor.visitIfBoolean(ifBoolean)
                isPresent != null -> visitor.visitIsPresent(isPresent)
                hasEmailReply != null -> visitor.visitHasEmailReply(hasEmailReply)
                hasPlainTextEmailReply != null ->
                    visitor.visitHasPlainTextEmailReply(hasPlainTextEmailReply)
                extractMostRecentEmailReplyHtml != null ->
                    visitor.visitExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)
                extractMostRecentEmailReplyText != null ->
                    visitor.visitExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)
                extractMostRecentPlainTextEmailReply != null ->
                    visitor.visitExtractMostRecentPlainTextEmailReply(
                        extractMostRecentPlainTextEmailReply
                    )
                setContainsString != null -> visitor.visitSetContainsString(setContainsString)
                isEngagementType != null -> visitor.visitIsEngagementType(isEngagementType)
                formatFullName != null -> visitor.visitFormatFullName(formatFullName)
                formatPhoneNumber != null -> visitor.visitFormatPhoneNumber(formatPhoneNumber)
                formatSearchablePhoneNumber != null ->
                    visitor.visitFormatSearchablePhoneNumber(formatSearchablePhoneNumber)
                absoluteValue != null -> visitor.visitAbsoluteValue(absoluteValue)
                squareRoot != null -> visitor.visitSquareRoot(squareRoot)
                power != null -> visitor.visitPower(power)
                substring != null -> visitor.visitSubstring(substring)
                euler != null -> visitor.visitEuler(euler)
                stringLength != null -> visitor.visitStringLength(stringLength)
                addTime != null -> visitor.visitAddTime(addTime)
                subtractTime != null -> visitor.visitSubtractTime(subtractTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ConditionalExpression = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitConstantBoolean(constantBoolean: ConstantBoolean) {
                        constantBoolean.validate()
                    }

                    override fun visitConstantNumber(constantNumber: ConstantNumber) {
                        constantNumber.validate()
                    }

                    override fun visitConstantString(constantString: ConstantString) {
                        constantString.validate()
                    }

                    override fun visitBooleanPropertyVariable(
                        booleanPropertyVariable: BooleanPropertyVariable
                    ) {
                        booleanPropertyVariable.validate()
                    }

                    override fun visitStringPropertyVariable(
                        stringPropertyVariable: StringPropertyVariable
                    ) {
                        stringPropertyVariable.validate()
                    }

                    override fun visitNumberPropertyVariable(
                        numberPropertyVariable: NumberPropertyVariable
                    ) {
                        numberPropertyVariable.validate()
                    }

                    override fun visitTimestampOfPropertyVariable(
                        timestampOfPropertyVariable: TimestampOfPropertyVariable
                    ) {
                        timestampOfPropertyVariable.validate()
                    }

                    override fun visitBooleanTargetPropertyVariable(
                        booleanTargetPropertyVariable: BooleanTargetPropertyVariable
                    ) {
                        booleanTargetPropertyVariable.validate()
                    }

                    override fun visitStringTargetPropertyVariable(
                        stringTargetPropertyVariable: StringTargetPropertyVariable
                    ) {
                        stringTargetPropertyVariable.validate()
                    }

                    override fun visitNumberTargetPropertyVariable(
                        numberTargetPropertyVariable: NumberTargetPropertyVariable
                    ) {
                        numberTargetPropertyVariable.validate()
                    }

                    override fun visitTimestampOfTargetPropertyVariable(
                        timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
                    ) {
                        timestampOfTargetPropertyVariable.validate()
                    }

                    override fun visitAddNumbers(addNumbers: AddNumbers) {
                        addNumbers.validate()
                    }

                    override fun visitSubtractNumbers(subtractNumbers: SubtractNumbers) {
                        subtractNumbers.validate()
                    }

                    override fun visitMultiplyNumbers(multiplyNumbers: MultiplyNumbers) {
                        multiplyNumbers.validate()
                    }

                    override fun visitDivideNumbers(divideNumbers: DivideNumbers) {
                        divideNumbers.validate()
                    }

                    override fun visitRoundDownNumbers(roundDownNumbers: RoundDownNumbers) {
                        roundDownNumbers.validate()
                    }

                    override fun visitRoundUpNumbers(roundUpNumbers: RoundUpNumbers) {
                        roundUpNumbers.validate()
                    }

                    override fun visitRoundNearestNumbers(
                        roundNearestNumbers: RoundNearestNumbers
                    ) {
                        roundNearestNumbers.validate()
                    }

                    override fun visitUpperCase(upperCase: UpperCase) {
                        upperCase.validate()
                    }

                    override fun visitLowerCase(lowerCase: LowerCase) {
                        lowerCase.validate()
                    }

                    override fun visitConcatStrings(concatStrings: ConcatStrings) {
                        concatStrings.validate()
                    }

                    override fun visitContains(contains: Contains) {
                        contains.validate()
                    }

                    override fun visitBeginsWith(beginsWith: BeginsWith) {
                        beginsWith.validate()
                    }

                    override fun visitNumberToString(numberToString: NumberToString) {
                        numberToString.validate()
                    }

                    override fun visitParseNumber(parseNumber: ParseNumber) {
                        parseNumber.validate()
                    }

                    override fun visitFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) {
                        fetchExchangeRate.validate()
                    }

                    override fun visitFetchCurrencyDecimalPlaces(
                        fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
                    ) {
                        fetchCurrencyDecimalPlaces.validate()
                    }

                    override fun visitFetchSingleCurrencyPortalCurrency(
                        fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
                    ) {
                        fetchSingleCurrencyPortalCurrency.validate()
                    }

                    override fun visitDatedExchangeRate(datedExchangeRate: DatedExchangeRate) {
                        datedExchangeRate.validate()
                    }

                    override fun visitPipelineProbability(
                        pipelineProbability: PipelineProbability
                    ) {
                        pipelineProbability.validate()
                    }

                    override fun visitMaxNumbers(maxNumbers: MaxNumbers) {
                        maxNumbers.validate()
                    }

                    override fun visitMinNumbers(minNumbers: MinNumbers) {
                        minNumbers.validate()
                    }

                    override fun visitLessThan(lessThan: LessThan) {
                        lessThan.validate()
                    }

                    override fun visitLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) {
                        lessThanOrEqual.validate()
                    }

                    override fun visitMoreThan(moreThan: MoreThan) {
                        moreThan.validate()
                    }

                    override fun visitMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) {
                        moreThanOrEqual.validate()
                    }

                    override fun visitNumberEquals(numberEquals: NumberEquals) {
                        numberEquals.validate()
                    }

                    override fun visitStringEquals(stringEquals: StringEquals) {
                        stringEquals.validate()
                    }

                    override fun visitIsPipelineStageClosed(
                        isPipelineStageClosed: IsPipelineStageClosed
                    ) {
                        isPipelineStageClosed.validate()
                    }

                    override fun visitNot(not: Not) {
                        not.validate()
                    }

                    override fun visitDate(date: Date) {
                        date.validate()
                    }

                    override fun visitMonth(month: Month) {
                        month.validate()
                    }

                    override fun visitYear(year: Year) {
                        year.validate()
                    }

                    override fun visitNow(now: Now) {
                        now.validate()
                    }

                    override fun visitTimeBetween(timeBetween: TimeBetween) {
                        timeBetween.validate()
                    }

                    override fun visitTimeBetweenSkipWeekends(
                        timeBetweenSkipWeekends: TimeBetweenSkipWeekends
                    ) {
                        timeBetweenSkipWeekends.validate()
                    }

                    override fun visitPeriodToMonths(periodToMonths: PeriodToMonths) {
                        periodToMonths.validate()
                    }

                    override fun visitPeriodToWeeks(periodToWeeks: PeriodToWeeks) {
                        periodToWeeks.validate()
                    }

                    override fun visitAnd(and: And) {
                        and.validate()
                    }

                    override fun visitOr(or: Or) {
                        or.validate()
                    }

                    override fun visitXor(xor: Xor) {
                        xor.validate()
                    }

                    override fun visitIfString(ifString: IfString) {
                        ifString.validate()
                    }

                    override fun visitIfNumber(ifNumber: IfNumber) {
                        ifNumber.validate()
                    }

                    override fun visitIfBoolean(ifBoolean: IfBoolean) {
                        ifBoolean.validate()
                    }

                    override fun visitIsPresent(isPresent: IsPresent) {
                        isPresent.validate()
                    }

                    override fun visitHasEmailReply(hasEmailReply: HasEmailReply) {
                        hasEmailReply.validate()
                    }

                    override fun visitHasPlainTextEmailReply(
                        hasPlainTextEmailReply: HasPlainTextEmailReply
                    ) {
                        hasPlainTextEmailReply.validate()
                    }

                    override fun visitExtractMostRecentEmailReplyHtml(
                        extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
                    ) {
                        extractMostRecentEmailReplyHtml.validate()
                    }

                    override fun visitExtractMostRecentEmailReplyText(
                        extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
                    ) {
                        extractMostRecentEmailReplyText.validate()
                    }

                    override fun visitExtractMostRecentPlainTextEmailReply(
                        extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
                    ) {
                        extractMostRecentPlainTextEmailReply.validate()
                    }

                    override fun visitSetContainsString(setContainsString: SetContainsString) {
                        setContainsString.validate()
                    }

                    override fun visitIsEngagementType(isEngagementType: IsEngagementType) {
                        isEngagementType.validate()
                    }

                    override fun visitFormatFullName(formatFullName: FormatFullName) {
                        formatFullName.validate()
                    }

                    override fun visitFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) {
                        formatPhoneNumber.validate()
                    }

                    override fun visitFormatSearchablePhoneNumber(
                        formatSearchablePhoneNumber: FormatSearchablePhoneNumber
                    ) {
                        formatSearchablePhoneNumber.validate()
                    }

                    override fun visitAbsoluteValue(absoluteValue: AbsoluteValue) {
                        absoluteValue.validate()
                    }

                    override fun visitSquareRoot(squareRoot: SquareRoot) {
                        squareRoot.validate()
                    }

                    override fun visitPower(power: Power) {
                        power.validate()
                    }

                    override fun visitSubstring(substring: Substring) {
                        substring.validate()
                    }

                    override fun visitEuler(euler: Euler) {
                        euler.validate()
                    }

                    override fun visitStringLength(stringLength: StringLength) {
                        stringLength.validate()
                    }

                    override fun visitAddTime(addTime: AddTime) {
                        addTime.validate()
                    }

                    override fun visitSubtractTime(subtractTime: SubtractTime) {
                        subtractTime.validate()
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
                    override fun visitConstantBoolean(constantBoolean: ConstantBoolean) =
                        constantBoolean.validity()

                    override fun visitConstantNumber(constantNumber: ConstantNumber) =
                        constantNumber.validity()

                    override fun visitConstantString(constantString: ConstantString) =
                        constantString.validity()

                    override fun visitBooleanPropertyVariable(
                        booleanPropertyVariable: BooleanPropertyVariable
                    ) = booleanPropertyVariable.validity()

                    override fun visitStringPropertyVariable(
                        stringPropertyVariable: StringPropertyVariable
                    ) = stringPropertyVariable.validity()

                    override fun visitNumberPropertyVariable(
                        numberPropertyVariable: NumberPropertyVariable
                    ) = numberPropertyVariable.validity()

                    override fun visitTimestampOfPropertyVariable(
                        timestampOfPropertyVariable: TimestampOfPropertyVariable
                    ) = timestampOfPropertyVariable.validity()

                    override fun visitBooleanTargetPropertyVariable(
                        booleanTargetPropertyVariable: BooleanTargetPropertyVariable
                    ) = booleanTargetPropertyVariable.validity()

                    override fun visitStringTargetPropertyVariable(
                        stringTargetPropertyVariable: StringTargetPropertyVariable
                    ) = stringTargetPropertyVariable.validity()

                    override fun visitNumberTargetPropertyVariable(
                        numberTargetPropertyVariable: NumberTargetPropertyVariable
                    ) = numberTargetPropertyVariable.validity()

                    override fun visitTimestampOfTargetPropertyVariable(
                        timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
                    ) = timestampOfTargetPropertyVariable.validity()

                    override fun visitAddNumbers(addNumbers: AddNumbers) = addNumbers.validity()

                    override fun visitSubtractNumbers(subtractNumbers: SubtractNumbers) =
                        subtractNumbers.validity()

                    override fun visitMultiplyNumbers(multiplyNumbers: MultiplyNumbers) =
                        multiplyNumbers.validity()

                    override fun visitDivideNumbers(divideNumbers: DivideNumbers) =
                        divideNumbers.validity()

                    override fun visitRoundDownNumbers(roundDownNumbers: RoundDownNumbers) =
                        roundDownNumbers.validity()

                    override fun visitRoundUpNumbers(roundUpNumbers: RoundUpNumbers) =
                        roundUpNumbers.validity()

                    override fun visitRoundNearestNumbers(
                        roundNearestNumbers: RoundNearestNumbers
                    ) = roundNearestNumbers.validity()

                    override fun visitUpperCase(upperCase: UpperCase) = upperCase.validity()

                    override fun visitLowerCase(lowerCase: LowerCase) = lowerCase.validity()

                    override fun visitConcatStrings(concatStrings: ConcatStrings) =
                        concatStrings.validity()

                    override fun visitContains(contains: Contains) = contains.validity()

                    override fun visitBeginsWith(beginsWith: BeginsWith) = beginsWith.validity()

                    override fun visitNumberToString(numberToString: NumberToString) =
                        numberToString.validity()

                    override fun visitParseNumber(parseNumber: ParseNumber) = parseNumber.validity()

                    override fun visitFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) =
                        fetchExchangeRate.validity()

                    override fun visitFetchCurrencyDecimalPlaces(
                        fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
                    ) = fetchCurrencyDecimalPlaces.validity()

                    override fun visitFetchSingleCurrencyPortalCurrency(
                        fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
                    ) = fetchSingleCurrencyPortalCurrency.validity()

                    override fun visitDatedExchangeRate(datedExchangeRate: DatedExchangeRate) =
                        datedExchangeRate.validity()

                    override fun visitPipelineProbability(
                        pipelineProbability: PipelineProbability
                    ) = pipelineProbability.validity()

                    override fun visitMaxNumbers(maxNumbers: MaxNumbers) = maxNumbers.validity()

                    override fun visitMinNumbers(minNumbers: MinNumbers) = minNumbers.validity()

                    override fun visitLessThan(lessThan: LessThan) = lessThan.validity()

                    override fun visitLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
                        lessThanOrEqual.validity()

                    override fun visitMoreThan(moreThan: MoreThan) = moreThan.validity()

                    override fun visitMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
                        moreThanOrEqual.validity()

                    override fun visitNumberEquals(numberEquals: NumberEquals) =
                        numberEquals.validity()

                    override fun visitStringEquals(stringEquals: StringEquals) =
                        stringEquals.validity()

                    override fun visitIsPipelineStageClosed(
                        isPipelineStageClosed: IsPipelineStageClosed
                    ) = isPipelineStageClosed.validity()

                    override fun visitNot(not: Not) = not.validity()

                    override fun visitDate(date: Date) = date.validity()

                    override fun visitMonth(month: Month) = month.validity()

                    override fun visitYear(year: Year) = year.validity()

                    override fun visitNow(now: Now) = now.validity()

                    override fun visitTimeBetween(timeBetween: TimeBetween) = timeBetween.validity()

                    override fun visitTimeBetweenSkipWeekends(
                        timeBetweenSkipWeekends: TimeBetweenSkipWeekends
                    ) = timeBetweenSkipWeekends.validity()

                    override fun visitPeriodToMonths(periodToMonths: PeriodToMonths) =
                        periodToMonths.validity()

                    override fun visitPeriodToWeeks(periodToWeeks: PeriodToWeeks) =
                        periodToWeeks.validity()

                    override fun visitAnd(and: And) = and.validity()

                    override fun visitOr(or: Or) = or.validity()

                    override fun visitXor(xor: Xor) = xor.validity()

                    override fun visitIfString(ifString: IfString) = ifString.validity()

                    override fun visitIfNumber(ifNumber: IfNumber) = ifNumber.validity()

                    override fun visitIfBoolean(ifBoolean: IfBoolean) = ifBoolean.validity()

                    override fun visitIsPresent(isPresent: IsPresent) = isPresent.validity()

                    override fun visitHasEmailReply(hasEmailReply: HasEmailReply) =
                        hasEmailReply.validity()

                    override fun visitHasPlainTextEmailReply(
                        hasPlainTextEmailReply: HasPlainTextEmailReply
                    ) = hasPlainTextEmailReply.validity()

                    override fun visitExtractMostRecentEmailReplyHtml(
                        extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
                    ) = extractMostRecentEmailReplyHtml.validity()

                    override fun visitExtractMostRecentEmailReplyText(
                        extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
                    ) = extractMostRecentEmailReplyText.validity()

                    override fun visitExtractMostRecentPlainTextEmailReply(
                        extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
                    ) = extractMostRecentPlainTextEmailReply.validity()

                    override fun visitSetContainsString(setContainsString: SetContainsString) =
                        setContainsString.validity()

                    override fun visitIsEngagementType(isEngagementType: IsEngagementType) =
                        isEngagementType.validity()

                    override fun visitFormatFullName(formatFullName: FormatFullName) =
                        formatFullName.validity()

                    override fun visitFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) =
                        formatPhoneNumber.validity()

                    override fun visitFormatSearchablePhoneNumber(
                        formatSearchablePhoneNumber: FormatSearchablePhoneNumber
                    ) = formatSearchablePhoneNumber.validity()

                    override fun visitAbsoluteValue(absoluteValue: AbsoluteValue) =
                        absoluteValue.validity()

                    override fun visitSquareRoot(squareRoot: SquareRoot) = squareRoot.validity()

                    override fun visitPower(power: Power) = power.validity()

                    override fun visitSubstring(substring: Substring) = substring.validity()

                    override fun visitEuler(euler: Euler) = euler.validity()

                    override fun visitStringLength(stringLength: StringLength) =
                        stringLength.validity()

                    override fun visitAddTime(addTime: AddTime) = addTime.validity()

                    override fun visitSubtractTime(subtractTime: SubtractTime) =
                        subtractTime.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConditionalExpression &&
                constantBoolean == other.constantBoolean &&
                constantNumber == other.constantNumber &&
                constantString == other.constantString &&
                booleanPropertyVariable == other.booleanPropertyVariable &&
                stringPropertyVariable == other.stringPropertyVariable &&
                numberPropertyVariable == other.numberPropertyVariable &&
                timestampOfPropertyVariable == other.timestampOfPropertyVariable &&
                booleanTargetPropertyVariable == other.booleanTargetPropertyVariable &&
                stringTargetPropertyVariable == other.stringTargetPropertyVariable &&
                numberTargetPropertyVariable == other.numberTargetPropertyVariable &&
                timestampOfTargetPropertyVariable == other.timestampOfTargetPropertyVariable &&
                addNumbers == other.addNumbers &&
                subtractNumbers == other.subtractNumbers &&
                multiplyNumbers == other.multiplyNumbers &&
                divideNumbers == other.divideNumbers &&
                roundDownNumbers == other.roundDownNumbers &&
                roundUpNumbers == other.roundUpNumbers &&
                roundNearestNumbers == other.roundNearestNumbers &&
                upperCase == other.upperCase &&
                lowerCase == other.lowerCase &&
                concatStrings == other.concatStrings &&
                contains == other.contains &&
                beginsWith == other.beginsWith &&
                numberToString == other.numberToString &&
                parseNumber == other.parseNumber &&
                fetchExchangeRate == other.fetchExchangeRate &&
                fetchCurrencyDecimalPlaces == other.fetchCurrencyDecimalPlaces &&
                fetchSingleCurrencyPortalCurrency == other.fetchSingleCurrencyPortalCurrency &&
                datedExchangeRate == other.datedExchangeRate &&
                pipelineProbability == other.pipelineProbability &&
                maxNumbers == other.maxNumbers &&
                minNumbers == other.minNumbers &&
                lessThan == other.lessThan &&
                lessThanOrEqual == other.lessThanOrEqual &&
                moreThan == other.moreThan &&
                moreThanOrEqual == other.moreThanOrEqual &&
                numberEquals == other.numberEquals &&
                stringEquals == other.stringEquals &&
                isPipelineStageClosed == other.isPipelineStageClosed &&
                not == other.not &&
                date == other.date &&
                month == other.month &&
                year == other.year &&
                now == other.now &&
                timeBetween == other.timeBetween &&
                timeBetweenSkipWeekends == other.timeBetweenSkipWeekends &&
                periodToMonths == other.periodToMonths &&
                periodToWeeks == other.periodToWeeks &&
                and == other.and &&
                or == other.or &&
                xor == other.xor &&
                ifString == other.ifString &&
                ifNumber == other.ifNumber &&
                ifBoolean == other.ifBoolean &&
                isPresent == other.isPresent &&
                hasEmailReply == other.hasEmailReply &&
                hasPlainTextEmailReply == other.hasPlainTextEmailReply &&
                extractMostRecentEmailReplyHtml == other.extractMostRecentEmailReplyHtml &&
                extractMostRecentEmailReplyText == other.extractMostRecentEmailReplyText &&
                extractMostRecentPlainTextEmailReply ==
                    other.extractMostRecentPlainTextEmailReply &&
                setContainsString == other.setContainsString &&
                isEngagementType == other.isEngagementType &&
                formatFullName == other.formatFullName &&
                formatPhoneNumber == other.formatPhoneNumber &&
                formatSearchablePhoneNumber == other.formatSearchablePhoneNumber &&
                absoluteValue == other.absoluteValue &&
                squareRoot == other.squareRoot &&
                power == other.power &&
                substring == other.substring &&
                euler == other.euler &&
                stringLength == other.stringLength &&
                addTime == other.addTime &&
                subtractTime == other.subtractTime
        }

        override fun hashCode(): Int =
            Objects.hash(
                constantBoolean,
                constantNumber,
                constantString,
                booleanPropertyVariable,
                stringPropertyVariable,
                numberPropertyVariable,
                timestampOfPropertyVariable,
                booleanTargetPropertyVariable,
                stringTargetPropertyVariable,
                numberTargetPropertyVariable,
                timestampOfTargetPropertyVariable,
                addNumbers,
                subtractNumbers,
                multiplyNumbers,
                divideNumbers,
                roundDownNumbers,
                roundUpNumbers,
                roundNearestNumbers,
                upperCase,
                lowerCase,
                concatStrings,
                contains,
                beginsWith,
                numberToString,
                parseNumber,
                fetchExchangeRate,
                fetchCurrencyDecimalPlaces,
                fetchSingleCurrencyPortalCurrency,
                datedExchangeRate,
                pipelineProbability,
                maxNumbers,
                minNumbers,
                lessThan,
                lessThanOrEqual,
                moreThan,
                moreThanOrEqual,
                numberEquals,
                stringEquals,
                isPipelineStageClosed,
                not,
                date,
                month,
                year,
                now,
                timeBetween,
                timeBetweenSkipWeekends,
                periodToMonths,
                periodToWeeks,
                and,
                or,
                xor,
                ifString,
                ifNumber,
                ifBoolean,
                isPresent,
                hasEmailReply,
                hasPlainTextEmailReply,
                extractMostRecentEmailReplyHtml,
                extractMostRecentEmailReplyText,
                extractMostRecentPlainTextEmailReply,
                setContainsString,
                isEngagementType,
                formatFullName,
                formatPhoneNumber,
                formatSearchablePhoneNumber,
                absoluteValue,
                squareRoot,
                power,
                substring,
                euler,
                stringLength,
                addTime,
                subtractTime,
            )

        override fun toString(): String =
            when {
                constantBoolean != null -> "ConditionalExpression{constantBoolean=$constantBoolean}"
                constantNumber != null -> "ConditionalExpression{constantNumber=$constantNumber}"
                constantString != null -> "ConditionalExpression{constantString=$constantString}"
                booleanPropertyVariable != null ->
                    "ConditionalExpression{booleanPropertyVariable=$booleanPropertyVariable}"
                stringPropertyVariable != null ->
                    "ConditionalExpression{stringPropertyVariable=$stringPropertyVariable}"
                numberPropertyVariable != null ->
                    "ConditionalExpression{numberPropertyVariable=$numberPropertyVariable}"
                timestampOfPropertyVariable != null ->
                    "ConditionalExpression{timestampOfPropertyVariable=$timestampOfPropertyVariable}"
                booleanTargetPropertyVariable != null ->
                    "ConditionalExpression{booleanTargetPropertyVariable=$booleanTargetPropertyVariable}"
                stringTargetPropertyVariable != null ->
                    "ConditionalExpression{stringTargetPropertyVariable=$stringTargetPropertyVariable}"
                numberTargetPropertyVariable != null ->
                    "ConditionalExpression{numberTargetPropertyVariable=$numberTargetPropertyVariable}"
                timestampOfTargetPropertyVariable != null ->
                    "ConditionalExpression{timestampOfTargetPropertyVariable=$timestampOfTargetPropertyVariable}"
                addNumbers != null -> "ConditionalExpression{addNumbers=$addNumbers}"
                subtractNumbers != null -> "ConditionalExpression{subtractNumbers=$subtractNumbers}"
                multiplyNumbers != null -> "ConditionalExpression{multiplyNumbers=$multiplyNumbers}"
                divideNumbers != null -> "ConditionalExpression{divideNumbers=$divideNumbers}"
                roundDownNumbers != null ->
                    "ConditionalExpression{roundDownNumbers=$roundDownNumbers}"
                roundUpNumbers != null -> "ConditionalExpression{roundUpNumbers=$roundUpNumbers}"
                roundNearestNumbers != null ->
                    "ConditionalExpression{roundNearestNumbers=$roundNearestNumbers}"
                upperCase != null -> "ConditionalExpression{upperCase=$upperCase}"
                lowerCase != null -> "ConditionalExpression{lowerCase=$lowerCase}"
                concatStrings != null -> "ConditionalExpression{concatStrings=$concatStrings}"
                contains != null -> "ConditionalExpression{contains=$contains}"
                beginsWith != null -> "ConditionalExpression{beginsWith=$beginsWith}"
                numberToString != null -> "ConditionalExpression{numberToString=$numberToString}"
                parseNumber != null -> "ConditionalExpression{parseNumber=$parseNumber}"
                fetchExchangeRate != null ->
                    "ConditionalExpression{fetchExchangeRate=$fetchExchangeRate}"
                fetchCurrencyDecimalPlaces != null ->
                    "ConditionalExpression{fetchCurrencyDecimalPlaces=$fetchCurrencyDecimalPlaces}"
                fetchSingleCurrencyPortalCurrency != null ->
                    "ConditionalExpression{fetchSingleCurrencyPortalCurrency=$fetchSingleCurrencyPortalCurrency}"
                datedExchangeRate != null ->
                    "ConditionalExpression{datedExchangeRate=$datedExchangeRate}"
                pipelineProbability != null ->
                    "ConditionalExpression{pipelineProbability=$pipelineProbability}"
                maxNumbers != null -> "ConditionalExpression{maxNumbers=$maxNumbers}"
                minNumbers != null -> "ConditionalExpression{minNumbers=$minNumbers}"
                lessThan != null -> "ConditionalExpression{lessThan=$lessThan}"
                lessThanOrEqual != null -> "ConditionalExpression{lessThanOrEqual=$lessThanOrEqual}"
                moreThan != null -> "ConditionalExpression{moreThan=$moreThan}"
                moreThanOrEqual != null -> "ConditionalExpression{moreThanOrEqual=$moreThanOrEqual}"
                numberEquals != null -> "ConditionalExpression{numberEquals=$numberEquals}"
                stringEquals != null -> "ConditionalExpression{stringEquals=$stringEquals}"
                isPipelineStageClosed != null ->
                    "ConditionalExpression{isPipelineStageClosed=$isPipelineStageClosed}"
                not != null -> "ConditionalExpression{not=$not}"
                date != null -> "ConditionalExpression{date=$date}"
                month != null -> "ConditionalExpression{month=$month}"
                year != null -> "ConditionalExpression{year=$year}"
                now != null -> "ConditionalExpression{now=$now}"
                timeBetween != null -> "ConditionalExpression{timeBetween=$timeBetween}"
                timeBetweenSkipWeekends != null ->
                    "ConditionalExpression{timeBetweenSkipWeekends=$timeBetweenSkipWeekends}"
                periodToMonths != null -> "ConditionalExpression{periodToMonths=$periodToMonths}"
                periodToWeeks != null -> "ConditionalExpression{periodToWeeks=$periodToWeeks}"
                and != null -> "ConditionalExpression{and=$and}"
                or != null -> "ConditionalExpression{or=$or}"
                xor != null -> "ConditionalExpression{xor=$xor}"
                ifString != null -> "ConditionalExpression{ifString=$ifString}"
                ifNumber != null -> "ConditionalExpression{ifNumber=$ifNumber}"
                ifBoolean != null -> "ConditionalExpression{ifBoolean=$ifBoolean}"
                isPresent != null -> "ConditionalExpression{isPresent=$isPresent}"
                hasEmailReply != null -> "ConditionalExpression{hasEmailReply=$hasEmailReply}"
                hasPlainTextEmailReply != null ->
                    "ConditionalExpression{hasPlainTextEmailReply=$hasPlainTextEmailReply}"
                extractMostRecentEmailReplyHtml != null ->
                    "ConditionalExpression{extractMostRecentEmailReplyHtml=$extractMostRecentEmailReplyHtml}"
                extractMostRecentEmailReplyText != null ->
                    "ConditionalExpression{extractMostRecentEmailReplyText=$extractMostRecentEmailReplyText}"
                extractMostRecentPlainTextEmailReply != null ->
                    "ConditionalExpression{extractMostRecentPlainTextEmailReply=$extractMostRecentPlainTextEmailReply}"
                setContainsString != null ->
                    "ConditionalExpression{setContainsString=$setContainsString}"
                isEngagementType != null ->
                    "ConditionalExpression{isEngagementType=$isEngagementType}"
                formatFullName != null -> "ConditionalExpression{formatFullName=$formatFullName}"
                formatPhoneNumber != null ->
                    "ConditionalExpression{formatPhoneNumber=$formatPhoneNumber}"
                formatSearchablePhoneNumber != null ->
                    "ConditionalExpression{formatSearchablePhoneNumber=$formatSearchablePhoneNumber}"
                absoluteValue != null -> "ConditionalExpression{absoluteValue=$absoluteValue}"
                squareRoot != null -> "ConditionalExpression{squareRoot=$squareRoot}"
                power != null -> "ConditionalExpression{power=$power}"
                substring != null -> "ConditionalExpression{substring=$substring}"
                euler != null -> "ConditionalExpression{euler=$euler}"
                stringLength != null -> "ConditionalExpression{stringLength=$stringLength}"
                addTime != null -> "ConditionalExpression{addTime=$addTime}"
                subtractTime != null -> "ConditionalExpression{subtractTime=$subtractTime}"
                _json != null -> "ConditionalExpression{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ConditionalExpression")
            }

        companion object {

            @JvmStatic
            fun ofConstantBoolean(constantBoolean: ConstantBoolean) =
                ConditionalExpression(constantBoolean = constantBoolean)

            @JvmStatic
            fun ofConstantNumber(constantNumber: ConstantNumber) =
                ConditionalExpression(constantNumber = constantNumber)

            @JvmStatic
            fun ofConstantString(constantString: ConstantString) =
                ConditionalExpression(constantString = constantString)

            @JvmStatic
            fun ofBooleanPropertyVariable(booleanPropertyVariable: BooleanPropertyVariable) =
                ConditionalExpression(booleanPropertyVariable = booleanPropertyVariable)

            @JvmStatic
            fun ofStringPropertyVariable(stringPropertyVariable: StringPropertyVariable) =
                ConditionalExpression(stringPropertyVariable = stringPropertyVariable)

            @JvmStatic
            fun ofNumberPropertyVariable(numberPropertyVariable: NumberPropertyVariable) =
                ConditionalExpression(numberPropertyVariable = numberPropertyVariable)

            @JvmStatic
            fun ofTimestampOfPropertyVariable(
                timestampOfPropertyVariable: TimestampOfPropertyVariable
            ) = ConditionalExpression(timestampOfPropertyVariable = timestampOfPropertyVariable)

            @JvmStatic
            fun ofBooleanTargetPropertyVariable(
                booleanTargetPropertyVariable: BooleanTargetPropertyVariable
            ) = ConditionalExpression(booleanTargetPropertyVariable = booleanTargetPropertyVariable)

            @JvmStatic
            fun ofStringTargetPropertyVariable(
                stringTargetPropertyVariable: StringTargetPropertyVariable
            ) = ConditionalExpression(stringTargetPropertyVariable = stringTargetPropertyVariable)

            @JvmStatic
            fun ofNumberTargetPropertyVariable(
                numberTargetPropertyVariable: NumberTargetPropertyVariable
            ) = ConditionalExpression(numberTargetPropertyVariable = numberTargetPropertyVariable)

            @JvmStatic
            fun ofTimestampOfTargetPropertyVariable(
                timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
            ) =
                ConditionalExpression(
                    timestampOfTargetPropertyVariable = timestampOfTargetPropertyVariable
                )

            @JvmStatic
            fun ofAddNumbers(addNumbers: AddNumbers) =
                ConditionalExpression(addNumbers = addNumbers)

            @JvmStatic
            fun ofSubtractNumbers(subtractNumbers: SubtractNumbers) =
                ConditionalExpression(subtractNumbers = subtractNumbers)

            @JvmStatic
            fun ofMultiplyNumbers(multiplyNumbers: MultiplyNumbers) =
                ConditionalExpression(multiplyNumbers = multiplyNumbers)

            @JvmStatic
            fun ofDivideNumbers(divideNumbers: DivideNumbers) =
                ConditionalExpression(divideNumbers = divideNumbers)

            @JvmStatic
            fun ofRoundDownNumbers(roundDownNumbers: RoundDownNumbers) =
                ConditionalExpression(roundDownNumbers = roundDownNumbers)

            @JvmStatic
            fun ofRoundUpNumbers(roundUpNumbers: RoundUpNumbers) =
                ConditionalExpression(roundUpNumbers = roundUpNumbers)

            @JvmStatic
            fun ofRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers) =
                ConditionalExpression(roundNearestNumbers = roundNearestNumbers)

            @JvmStatic
            fun ofUpperCase(upperCase: UpperCase) = ConditionalExpression(upperCase = upperCase)

            @JvmStatic
            fun ofLowerCase(lowerCase: LowerCase) = ConditionalExpression(lowerCase = lowerCase)

            @JvmStatic
            fun ofConcatStrings(concatStrings: ConcatStrings) =
                ConditionalExpression(concatStrings = concatStrings)

            @JvmStatic
            fun ofContains(contains: Contains) = ConditionalExpression(contains = contains)

            @JvmStatic
            fun ofBeginsWith(beginsWith: BeginsWith) =
                ConditionalExpression(beginsWith = beginsWith)

            @JvmStatic
            fun ofNumberToString(numberToString: NumberToString) =
                ConditionalExpression(numberToString = numberToString)

            @JvmStatic
            fun ofParseNumber(parseNumber: ParseNumber) =
                ConditionalExpression(parseNumber = parseNumber)

            @JvmStatic
            fun ofFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) =
                ConditionalExpression(fetchExchangeRate = fetchExchangeRate)

            @JvmStatic
            fun ofFetchCurrencyDecimalPlaces(
                fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
            ) = ConditionalExpression(fetchCurrencyDecimalPlaces = fetchCurrencyDecimalPlaces)

            @JvmStatic
            fun ofFetchSingleCurrencyPortalCurrency(
                fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
            ) =
                ConditionalExpression(
                    fetchSingleCurrencyPortalCurrency = fetchSingleCurrencyPortalCurrency
                )

            @JvmStatic
            fun ofDatedExchangeRate(datedExchangeRate: DatedExchangeRate) =
                ConditionalExpression(datedExchangeRate = datedExchangeRate)

            @JvmStatic
            fun ofPipelineProbability(pipelineProbability: PipelineProbability) =
                ConditionalExpression(pipelineProbability = pipelineProbability)

            @JvmStatic
            fun ofMaxNumbers(maxNumbers: MaxNumbers) =
                ConditionalExpression(maxNumbers = maxNumbers)

            @JvmStatic
            fun ofMinNumbers(minNumbers: MinNumbers) =
                ConditionalExpression(minNumbers = minNumbers)

            @JvmStatic
            fun ofLessThan(lessThan: LessThan) = ConditionalExpression(lessThan = lessThan)

            @JvmStatic
            fun ofLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
                ConditionalExpression(lessThanOrEqual = lessThanOrEqual)

            @JvmStatic
            fun ofMoreThan(moreThan: MoreThan) = ConditionalExpression(moreThan = moreThan)

            @JvmStatic
            fun ofMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
                ConditionalExpression(moreThanOrEqual = moreThanOrEqual)

            @JvmStatic
            fun ofNumberEquals(numberEquals: NumberEquals) =
                ConditionalExpression(numberEquals = numberEquals)

            @JvmStatic
            fun ofStringEquals(stringEquals: StringEquals) =
                ConditionalExpression(stringEquals = stringEquals)

            @JvmStatic
            fun ofIsPipelineStageClosed(isPipelineStageClosed: IsPipelineStageClosed) =
                ConditionalExpression(isPipelineStageClosed = isPipelineStageClosed)

            @JvmStatic fun ofNot(not: Not) = ConditionalExpression(not = not)

            @JvmStatic fun ofDate(date: Date) = ConditionalExpression(date = date)

            @JvmStatic fun ofMonth(month: Month) = ConditionalExpression(month = month)

            @JvmStatic fun ofYear(year: Year) = ConditionalExpression(year = year)

            @JvmStatic fun ofNow(now: Now) = ConditionalExpression(now = now)

            @JvmStatic
            fun ofTimeBetween(timeBetween: TimeBetween) =
                ConditionalExpression(timeBetween = timeBetween)

            @JvmStatic
            fun ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
                ConditionalExpression(timeBetweenSkipWeekends = timeBetweenSkipWeekends)

            @JvmStatic
            fun ofPeriodToMonths(periodToMonths: PeriodToMonths) =
                ConditionalExpression(periodToMonths = periodToMonths)

            @JvmStatic
            fun ofPeriodToWeeks(periodToWeeks: PeriodToWeeks) =
                ConditionalExpression(periodToWeeks = periodToWeeks)

            @JvmStatic fun ofAnd(and: And) = ConditionalExpression(and = and)

            @JvmStatic fun ofOr(or: Or) = ConditionalExpression(or = or)

            @JvmStatic fun ofXor(xor: Xor) = ConditionalExpression(xor = xor)

            @JvmStatic
            fun ofIfString(ifString: IfString) = ConditionalExpression(ifString = ifString)

            @JvmStatic
            fun ofIfNumber(ifNumber: IfNumber) = ConditionalExpression(ifNumber = ifNumber)

            @JvmStatic
            fun ofIfBoolean(ifBoolean: IfBoolean) = ConditionalExpression(ifBoolean = ifBoolean)

            @JvmStatic
            fun ofIsPresent(isPresent: IsPresent) = ConditionalExpression(isPresent = isPresent)

            @JvmStatic
            fun ofHasEmailReply(hasEmailReply: HasEmailReply) =
                ConditionalExpression(hasEmailReply = hasEmailReply)

            @JvmStatic
            fun ofHasPlainTextEmailReply(hasPlainTextEmailReply: HasPlainTextEmailReply) =
                ConditionalExpression(hasPlainTextEmailReply = hasPlainTextEmailReply)

            @JvmStatic
            fun ofExtractMostRecentEmailReplyHtml(
                extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
            ) =
                ConditionalExpression(
                    extractMostRecentEmailReplyHtml = extractMostRecentEmailReplyHtml
                )

            @JvmStatic
            fun ofExtractMostRecentEmailReplyText(
                extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
            ) =
                ConditionalExpression(
                    extractMostRecentEmailReplyText = extractMostRecentEmailReplyText
                )

            @JvmStatic
            fun ofExtractMostRecentPlainTextEmailReply(
                extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
            ) =
                ConditionalExpression(
                    extractMostRecentPlainTextEmailReply = extractMostRecentPlainTextEmailReply
                )

            @JvmStatic
            fun ofSetContainsString(setContainsString: SetContainsString) =
                ConditionalExpression(setContainsString = setContainsString)

            @JvmStatic
            fun ofIsEngagementType(isEngagementType: IsEngagementType) =
                ConditionalExpression(isEngagementType = isEngagementType)

            @JvmStatic
            fun ofFormatFullName(formatFullName: FormatFullName) =
                ConditionalExpression(formatFullName = formatFullName)

            @JvmStatic
            fun ofFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) =
                ConditionalExpression(formatPhoneNumber = formatPhoneNumber)

            @JvmStatic
            fun ofFormatSearchablePhoneNumber(
                formatSearchablePhoneNumber: FormatSearchablePhoneNumber
            ) = ConditionalExpression(formatSearchablePhoneNumber = formatSearchablePhoneNumber)

            @JvmStatic
            fun ofAbsoluteValue(absoluteValue: AbsoluteValue) =
                ConditionalExpression(absoluteValue = absoluteValue)

            @JvmStatic
            fun ofSquareRoot(squareRoot: SquareRoot) =
                ConditionalExpression(squareRoot = squareRoot)

            @JvmStatic fun ofPower(power: Power) = ConditionalExpression(power = power)

            @JvmStatic
            fun ofSubstring(substring: Substring) = ConditionalExpression(substring = substring)

            @JvmStatic fun ofEuler(euler: Euler) = ConditionalExpression(euler = euler)

            @JvmStatic
            fun ofStringLength(stringLength: StringLength) =
                ConditionalExpression(stringLength = stringLength)

            @JvmStatic fun ofAddTime(addTime: AddTime) = ConditionalExpression(addTime = addTime)

            @JvmStatic
            fun ofSubtractTime(subtractTime: SubtractTime) =
                ConditionalExpression(subtractTime = subtractTime)
        }

        /**
         * An interface that defines how to map each variant of [ConditionalExpression] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitConstantBoolean(constantBoolean: ConstantBoolean): T

            fun visitConstantNumber(constantNumber: ConstantNumber): T

            fun visitConstantString(constantString: ConstantString): T

            fun visitBooleanPropertyVariable(booleanPropertyVariable: BooleanPropertyVariable): T

            fun visitStringPropertyVariable(stringPropertyVariable: StringPropertyVariable): T

            fun visitNumberPropertyVariable(numberPropertyVariable: NumberPropertyVariable): T

            fun visitTimestampOfPropertyVariable(
                timestampOfPropertyVariable: TimestampOfPropertyVariable
            ): T

            fun visitBooleanTargetPropertyVariable(
                booleanTargetPropertyVariable: BooleanTargetPropertyVariable
            ): T

            fun visitStringTargetPropertyVariable(
                stringTargetPropertyVariable: StringTargetPropertyVariable
            ): T

            fun visitNumberTargetPropertyVariable(
                numberTargetPropertyVariable: NumberTargetPropertyVariable
            ): T

            fun visitTimestampOfTargetPropertyVariable(
                timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
            ): T

            fun visitAddNumbers(addNumbers: AddNumbers): T

            fun visitSubtractNumbers(subtractNumbers: SubtractNumbers): T

            fun visitMultiplyNumbers(multiplyNumbers: MultiplyNumbers): T

            fun visitDivideNumbers(divideNumbers: DivideNumbers): T

            fun visitRoundDownNumbers(roundDownNumbers: RoundDownNumbers): T

            fun visitRoundUpNumbers(roundUpNumbers: RoundUpNumbers): T

            fun visitRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers): T

            fun visitUpperCase(upperCase: UpperCase): T

            fun visitLowerCase(lowerCase: LowerCase): T

            fun visitConcatStrings(concatStrings: ConcatStrings): T

            fun visitContains(contains: Contains): T

            fun visitBeginsWith(beginsWith: BeginsWith): T

            fun visitNumberToString(numberToString: NumberToString): T

            fun visitParseNumber(parseNumber: ParseNumber): T

            fun visitFetchExchangeRate(fetchExchangeRate: FetchExchangeRate): T

            fun visitFetchCurrencyDecimalPlaces(
                fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
            ): T

            fun visitFetchSingleCurrencyPortalCurrency(
                fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
            ): T

            fun visitDatedExchangeRate(datedExchangeRate: DatedExchangeRate): T

            fun visitPipelineProbability(pipelineProbability: PipelineProbability): T

            fun visitMaxNumbers(maxNumbers: MaxNumbers): T

            fun visitMinNumbers(minNumbers: MinNumbers): T

            fun visitLessThan(lessThan: LessThan): T

            fun visitLessThanOrEqual(lessThanOrEqual: LessThanOrEqual): T

            fun visitMoreThan(moreThan: MoreThan): T

            fun visitMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual): T

            fun visitNumberEquals(numberEquals: NumberEquals): T

            fun visitStringEquals(stringEquals: StringEquals): T

            fun visitIsPipelineStageClosed(isPipelineStageClosed: IsPipelineStageClosed): T

            fun visitNot(not: Not): T

            fun visitDate(date: Date): T

            fun visitMonth(month: Month): T

            fun visitYear(year: Year): T

            fun visitNow(now: Now): T

            fun visitTimeBetween(timeBetween: TimeBetween): T

            fun visitTimeBetweenSkipWeekends(timeBetweenSkipWeekends: TimeBetweenSkipWeekends): T

            fun visitPeriodToMonths(periodToMonths: PeriodToMonths): T

            fun visitPeriodToWeeks(periodToWeeks: PeriodToWeeks): T

            fun visitAnd(and: And): T

            fun visitOr(or: Or): T

            fun visitXor(xor: Xor): T

            fun visitIfString(ifString: IfString): T

            fun visitIfNumber(ifNumber: IfNumber): T

            fun visitIfBoolean(ifBoolean: IfBoolean): T

            fun visitIsPresent(isPresent: IsPresent): T

            fun visitHasEmailReply(hasEmailReply: HasEmailReply): T

            fun visitHasPlainTextEmailReply(hasPlainTextEmailReply: HasPlainTextEmailReply): T

            fun visitExtractMostRecentEmailReplyHtml(
                extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
            ): T

            fun visitExtractMostRecentEmailReplyText(
                extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
            ): T

            fun visitExtractMostRecentPlainTextEmailReply(
                extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
            ): T

            fun visitSetContainsString(setContainsString: SetContainsString): T

            fun visitIsEngagementType(isEngagementType: IsEngagementType): T

            fun visitFormatFullName(formatFullName: FormatFullName): T

            fun visitFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber): T

            fun visitFormatSearchablePhoneNumber(
                formatSearchablePhoneNumber: FormatSearchablePhoneNumber
            ): T

            fun visitAbsoluteValue(absoluteValue: AbsoluteValue): T

            fun visitSquareRoot(squareRoot: SquareRoot): T

            fun visitPower(power: Power): T

            fun visitSubstring(substring: Substring): T

            fun visitEuler(euler: Euler): T

            fun visitStringLength(stringLength: StringLength): T

            fun visitAddTime(addTime: AddTime): T

            fun visitSubtractTime(subtractTime: SubtractTime): T

            /**
             * Maps an unknown variant of [ConditionalExpression] to a value of type [T].
             *
             * An instance of [ConditionalExpression] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown ConditionalExpression: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<ConditionalExpression>(ConditionalExpression::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ConditionalExpression {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ConstantBoolean>())?.let {
                                ConditionalExpression(constantBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantNumber>())?.let {
                                ConditionalExpression(constantNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantString>())?.let {
                                ConditionalExpression(constantString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BooleanPropertyVariable>())?.let {
                                ConditionalExpression(booleanPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringPropertyVariable>())?.let {
                                ConditionalExpression(stringPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberPropertyVariable>())?.let {
                                ConditionalExpression(numberPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimestampOfPropertyVariable>())
                                ?.let {
                                    ConditionalExpression(
                                        timestampOfPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<BooleanTargetPropertyVariable>())
                                ?.let {
                                    ConditionalExpression(
                                        booleanTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<StringTargetPropertyVariable>())
                                ?.let {
                                    ConditionalExpression(
                                        stringTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<NumberTargetPropertyVariable>())
                                ?.let {
                                    ConditionalExpression(
                                        numberTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<TimestampOfTargetPropertyVariable>(),
                                )
                                ?.let {
                                    ConditionalExpression(
                                        timestampOfTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<AddNumbers>())?.let {
                                ConditionalExpression(addNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractNumbers>())?.let {
                                ConditionalExpression(subtractNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultiplyNumbers>())?.let {
                                ConditionalExpression(multiplyNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DivideNumbers>())?.let {
                                ConditionalExpression(divideNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundDownNumbers>())?.let {
                                ConditionalExpression(roundDownNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundUpNumbers>())?.let {
                                ConditionalExpression(roundUpNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundNearestNumbers>())?.let {
                                ConditionalExpression(roundNearestNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UpperCase>())?.let {
                                ConditionalExpression(upperCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LowerCase>())?.let {
                                ConditionalExpression(lowerCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConcatStrings>())?.let {
                                ConditionalExpression(concatStrings = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Contains>())?.let {
                                ConditionalExpression(contains = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BeginsWith>())?.let {
                                ConditionalExpression(beginsWith = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberToString>())?.let {
                                ConditionalExpression(numberToString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ParseNumber>())?.let {
                                ConditionalExpression(parseNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchExchangeRate>())?.let {
                                ConditionalExpression(fetchExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchCurrencyDecimalPlaces>())
                                ?.let {
                                    ConditionalExpression(
                                        fetchCurrencyDecimalPlaces = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<FetchSingleCurrencyPortalCurrency>(),
                                )
                                ?.let {
                                    ConditionalExpression(
                                        fetchSingleCurrencyPortalCurrency = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<DatedExchangeRate>())?.let {
                                ConditionalExpression(datedExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PipelineProbability>())?.let {
                                ConditionalExpression(pipelineProbability = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MaxNumbers>())?.let {
                                ConditionalExpression(maxNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MinNumbers>())?.let {
                                ConditionalExpression(minNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThan>())?.let {
                                ConditionalExpression(lessThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThanOrEqual>())?.let {
                                ConditionalExpression(lessThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThan>())?.let {
                                ConditionalExpression(moreThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThanOrEqual>())?.let {
                                ConditionalExpression(moreThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberEquals>())?.let {
                                ConditionalExpression(numberEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringEquals>())?.let {
                                ConditionalExpression(stringEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPipelineStageClosed>())?.let {
                                ConditionalExpression(isPipelineStageClosed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Not>())?.let {
                                ConditionalExpression(not = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Date>())?.let {
                                ConditionalExpression(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Month>())?.let {
                                ConditionalExpression(month = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Year>())?.let {
                                ConditionalExpression(year = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Now>())?.let {
                                ConditionalExpression(now = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetween>())?.let {
                                ConditionalExpression(timeBetween = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetweenSkipWeekends>())?.let {
                                ConditionalExpression(timeBetweenSkipWeekends = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToMonths>())?.let {
                                ConditionalExpression(periodToMonths = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToWeeks>())?.let {
                                ConditionalExpression(periodToWeeks = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<And>())?.let {
                                ConditionalExpression(and = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Or>())?.let {
                                ConditionalExpression(or = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Xor>())?.let {
                                ConditionalExpression(xor = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfString>())?.let {
                                ConditionalExpression(ifString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfNumber>())?.let {
                                ConditionalExpression(ifNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfBoolean>())?.let {
                                ConditionalExpression(ifBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPresent>())?.let {
                                ConditionalExpression(isPresent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasEmailReply>())?.let {
                                ConditionalExpression(hasEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasPlainTextEmailReply>())?.let {
                                ConditionalExpression(hasPlainTextEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyHtml>())
                                ?.let {
                                    ConditionalExpression(
                                        extractMostRecentEmailReplyHtml = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyText>())
                                ?.let {
                                    ConditionalExpression(
                                        extractMostRecentEmailReplyText = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ExtractMostRecentPlainTextEmailReply>(),
                                )
                                ?.let {
                                    ConditionalExpression(
                                        extractMostRecentPlainTextEmailReply = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<SetContainsString>())?.let {
                                ConditionalExpression(setContainsString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsEngagementType>())?.let {
                                ConditionalExpression(isEngagementType = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatFullName>())?.let {
                                ConditionalExpression(formatFullName = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatPhoneNumber>())?.let {
                                ConditionalExpression(formatPhoneNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatSearchablePhoneNumber>())
                                ?.let {
                                    ConditionalExpression(
                                        formatSearchablePhoneNumber = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<AbsoluteValue>())?.let {
                                ConditionalExpression(absoluteValue = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SquareRoot>())?.let {
                                ConditionalExpression(squareRoot = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Power>())?.let {
                                ConditionalExpression(power = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Substring>())?.let {
                                ConditionalExpression(substring = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Euler>())?.let {
                                ConditionalExpression(euler = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringLength>())?.let {
                                ConditionalExpression(stringLength = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AddTime>())?.let {
                                ConditionalExpression(addTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractTime>())?.let {
                                ConditionalExpression(subtractTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ConditionalExpression(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<ConditionalExpression>(ConditionalExpression::class) {

            override fun serialize(
                value: ConditionalExpression,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.constantBoolean != null -> generator.writeObject(value.constantBoolean)
                    value.constantNumber != null -> generator.writeObject(value.constantNumber)
                    value.constantString != null -> generator.writeObject(value.constantString)
                    value.booleanPropertyVariable != null ->
                        generator.writeObject(value.booleanPropertyVariable)
                    value.stringPropertyVariable != null ->
                        generator.writeObject(value.stringPropertyVariable)
                    value.numberPropertyVariable != null ->
                        generator.writeObject(value.numberPropertyVariable)
                    value.timestampOfPropertyVariable != null ->
                        generator.writeObject(value.timestampOfPropertyVariable)
                    value.booleanTargetPropertyVariable != null ->
                        generator.writeObject(value.booleanTargetPropertyVariable)
                    value.stringTargetPropertyVariable != null ->
                        generator.writeObject(value.stringTargetPropertyVariable)
                    value.numberTargetPropertyVariable != null ->
                        generator.writeObject(value.numberTargetPropertyVariable)
                    value.timestampOfTargetPropertyVariable != null ->
                        generator.writeObject(value.timestampOfTargetPropertyVariable)
                    value.addNumbers != null -> generator.writeObject(value.addNumbers)
                    value.subtractNumbers != null -> generator.writeObject(value.subtractNumbers)
                    value.multiplyNumbers != null -> generator.writeObject(value.multiplyNumbers)
                    value.divideNumbers != null -> generator.writeObject(value.divideNumbers)
                    value.roundDownNumbers != null -> generator.writeObject(value.roundDownNumbers)
                    value.roundUpNumbers != null -> generator.writeObject(value.roundUpNumbers)
                    value.roundNearestNumbers != null ->
                        generator.writeObject(value.roundNearestNumbers)
                    value.upperCase != null -> generator.writeObject(value.upperCase)
                    value.lowerCase != null -> generator.writeObject(value.lowerCase)
                    value.concatStrings != null -> generator.writeObject(value.concatStrings)
                    value.contains != null -> generator.writeObject(value.contains)
                    value.beginsWith != null -> generator.writeObject(value.beginsWith)
                    value.numberToString != null -> generator.writeObject(value.numberToString)
                    value.parseNumber != null -> generator.writeObject(value.parseNumber)
                    value.fetchExchangeRate != null ->
                        generator.writeObject(value.fetchExchangeRate)
                    value.fetchCurrencyDecimalPlaces != null ->
                        generator.writeObject(value.fetchCurrencyDecimalPlaces)
                    value.fetchSingleCurrencyPortalCurrency != null ->
                        generator.writeObject(value.fetchSingleCurrencyPortalCurrency)
                    value.datedExchangeRate != null ->
                        generator.writeObject(value.datedExchangeRate)
                    value.pipelineProbability != null ->
                        generator.writeObject(value.pipelineProbability)
                    value.maxNumbers != null -> generator.writeObject(value.maxNumbers)
                    value.minNumbers != null -> generator.writeObject(value.minNumbers)
                    value.lessThan != null -> generator.writeObject(value.lessThan)
                    value.lessThanOrEqual != null -> generator.writeObject(value.lessThanOrEqual)
                    value.moreThan != null -> generator.writeObject(value.moreThan)
                    value.moreThanOrEqual != null -> generator.writeObject(value.moreThanOrEqual)
                    value.numberEquals != null -> generator.writeObject(value.numberEquals)
                    value.stringEquals != null -> generator.writeObject(value.stringEquals)
                    value.isPipelineStageClosed != null ->
                        generator.writeObject(value.isPipelineStageClosed)
                    value.not != null -> generator.writeObject(value.not)
                    value.date != null -> generator.writeObject(value.date)
                    value.month != null -> generator.writeObject(value.month)
                    value.year != null -> generator.writeObject(value.year)
                    value.now != null -> generator.writeObject(value.now)
                    value.timeBetween != null -> generator.writeObject(value.timeBetween)
                    value.timeBetweenSkipWeekends != null ->
                        generator.writeObject(value.timeBetweenSkipWeekends)
                    value.periodToMonths != null -> generator.writeObject(value.periodToMonths)
                    value.periodToWeeks != null -> generator.writeObject(value.periodToWeeks)
                    value.and != null -> generator.writeObject(value.and)
                    value.or != null -> generator.writeObject(value.or)
                    value.xor != null -> generator.writeObject(value.xor)
                    value.ifString != null -> generator.writeObject(value.ifString)
                    value.ifNumber != null -> generator.writeObject(value.ifNumber)
                    value.ifBoolean != null -> generator.writeObject(value.ifBoolean)
                    value.isPresent != null -> generator.writeObject(value.isPresent)
                    value.hasEmailReply != null -> generator.writeObject(value.hasEmailReply)
                    value.hasPlainTextEmailReply != null ->
                        generator.writeObject(value.hasPlainTextEmailReply)
                    value.extractMostRecentEmailReplyHtml != null ->
                        generator.writeObject(value.extractMostRecentEmailReplyHtml)
                    value.extractMostRecentEmailReplyText != null ->
                        generator.writeObject(value.extractMostRecentEmailReplyText)
                    value.extractMostRecentPlainTextEmailReply != null ->
                        generator.writeObject(value.extractMostRecentPlainTextEmailReply)
                    value.setContainsString != null ->
                        generator.writeObject(value.setContainsString)
                    value.isEngagementType != null -> generator.writeObject(value.isEngagementType)
                    value.formatFullName != null -> generator.writeObject(value.formatFullName)
                    value.formatPhoneNumber != null ->
                        generator.writeObject(value.formatPhoneNumber)
                    value.formatSearchablePhoneNumber != null ->
                        generator.writeObject(value.formatSearchablePhoneNumber)
                    value.absoluteValue != null -> generator.writeObject(value.absoluteValue)
                    value.squareRoot != null -> generator.writeObject(value.squareRoot)
                    value.power != null -> generator.writeObject(value.power)
                    value.substring != null -> generator.writeObject(value.substring)
                    value.euler != null -> generator.writeObject(value.euler)
                    value.stringLength != null -> generator.writeObject(value.stringLength)
                    value.addTime != null -> generator.writeObject(value.addTime)
                    value.subtractTime != null -> generator.writeObject(value.subtractTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ConditionalExpression")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RollupExpression &&
            associationTypes == other.associationTypes &&
            rollupOperator == other.rollupOperator &&
            sourceObjectTypeId == other.sourceObjectTypeId &&
            sourcePropertyName == other.sourcePropertyName &&
            conditionalExpression == other.conditionalExpression &&
            conditionalFormula == other.conditionalFormula &&
            emptyRollupValue == other.emptyRollupValue &&
            sourceCompareByPropertyName == other.sourceCompareByPropertyName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            associationTypes,
            rollupOperator,
            sourceObjectTypeId,
            sourcePropertyName,
            conditionalExpression,
            conditionalFormula,
            emptyRollupValue,
            sourceCompareByPropertyName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RollupExpression{associationTypes=$associationTypes, rollupOperator=$rollupOperator, sourceObjectTypeId=$sourceObjectTypeId, sourcePropertyName=$sourcePropertyName, conditionalExpression=$conditionalExpression, conditionalFormula=$conditionalFormula, emptyRollupValue=$emptyRollupValue, sourceCompareByPropertyName=$sourceCompareByPropertyName, additionalProperties=$additionalProperties}"
}
