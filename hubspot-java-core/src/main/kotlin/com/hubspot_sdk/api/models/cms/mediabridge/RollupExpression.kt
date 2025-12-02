// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.AssociationSpec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RollupExpression
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associationTypes: JsonField<List<AssociationSpec>>,
    private val rollupOperator: JsonField<String>,
    private val sourceObjectTypeId: JsonField<String>,
    private val sourcePropertyName: JsonField<String>,
    private val conditionalExpression: JsonField<Expression>,
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
        rollupOperator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceObjectTypeId")
        @ExcludeMissing
        sourceObjectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourcePropertyName")
        @ExcludeMissing
        sourcePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditionalExpression")
        @ExcludeMissing
        conditionalExpression: JsonField<Expression> = JsonMissing.of(),
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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associationTypes(): List<AssociationSpec> = associationTypes.getRequired("associationTypes")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rollupOperator(): String = rollupOperator.getRequired("rollupOperator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceObjectTypeId(): String = sourceObjectTypeId.getRequired("sourceObjectTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourcePropertyName(): String = sourcePropertyName.getRequired("sourcePropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditionalExpression(): Optional<Expression> =
        conditionalExpression.getOptional("conditionalExpression")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditionalFormula(): Optional<String> =
        conditionalFormula.getOptional("conditionalFormula")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emptyRollupValue(): Optional<String> = emptyRollupValue.getOptional("emptyRollupValue")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
    fun _rollupOperator(): JsonField<String> = rollupOperator

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
    fun _conditionalExpression(): JsonField<Expression> = conditionalExpression

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
        private var rollupOperator: JsonField<String>? = null
        private var sourceObjectTypeId: JsonField<String>? = null
        private var sourcePropertyName: JsonField<String>? = null
        private var conditionalExpression: JsonField<Expression> = JsonMissing.of()
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

        fun rollupOperator(rollupOperator: String) = rollupOperator(JsonField.of(rollupOperator))

        /**
         * Sets [Builder.rollupOperator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rollupOperator] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rollupOperator(rollupOperator: JsonField<String>) = apply {
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

        fun conditionalExpression(conditionalExpression: Expression) =
            conditionalExpression(JsonField.of(conditionalExpression))

        /**
         * Sets [Builder.conditionalExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionalExpression] with a well-typed [Expression]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conditionalExpression(conditionalExpression: JsonField<Expression>) = apply {
            this.conditionalExpression = conditionalExpression
        }

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofConstantBoolean(constantBoolean)`.
         */
        fun conditionalExpression(constantBoolean: ConstantBoolean) =
            conditionalExpression(Expression.ofConstantBoolean(constantBoolean))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofConstantNumber(constantNumber)`.
         */
        fun conditionalExpression(constantNumber: ConstantNumber) =
            conditionalExpression(Expression.ofConstantNumber(constantNumber))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofConstantString(constantString)`.
         */
        fun conditionalExpression(constantString: ConstantString) =
            conditionalExpression(Expression.ofConstantString(constantString))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun conditionalExpression(booleanPropertyVariable: BooleanPropertyVariable) =
            conditionalExpression(Expression.ofBooleanPropertyVariable(booleanPropertyVariable))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun conditionalExpression(stringPropertyVariable: StringPropertyVariable) =
            conditionalExpression(Expression.ofStringPropertyVariable(stringPropertyVariable))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun conditionalExpression(numberPropertyVariable: NumberPropertyVariable) =
            conditionalExpression(Expression.ofNumberPropertyVariable(numberPropertyVariable))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun conditionalExpression(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            conditionalExpression(
                Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun conditionalExpression(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            conditionalExpression(
                Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun conditionalExpression(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            conditionalExpression(
                Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun conditionalExpression(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            conditionalExpression(
                Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun conditionalExpression(
            timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
        ) =
            conditionalExpression(
                Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)
            )

        /** Alias for calling [conditionalExpression] with `Expression.ofAddNumbers(addNumbers)`. */
        fun conditionalExpression(addNumbers: AddNumbers) =
            conditionalExpression(Expression.ofAddNumbers(addNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofSubtractNumbers(subtractNumbers)`.
         */
        fun conditionalExpression(subtractNumbers: SubtractNumbers) =
            conditionalExpression(Expression.ofSubtractNumbers(subtractNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofMultiplyNumbers(multiplyNumbers)`.
         */
        fun conditionalExpression(multiplyNumbers: MultiplyNumbers) =
            conditionalExpression(Expression.ofMultiplyNumbers(multiplyNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofDivideNumbers(divideNumbers)`.
         */
        fun conditionalExpression(divideNumbers: DivideNumbers) =
            conditionalExpression(Expression.ofDivideNumbers(divideNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofRoundDownNumbers(roundDownNumbers)`.
         */
        fun conditionalExpression(roundDownNumbers: RoundDownNumbers) =
            conditionalExpression(Expression.ofRoundDownNumbers(roundDownNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofRoundUpNumbers(roundUpNumbers)`.
         */
        fun conditionalExpression(roundUpNumbers: RoundUpNumbers) =
            conditionalExpression(Expression.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun conditionalExpression(roundNearestNumbers: RoundNearestNumbers) =
            conditionalExpression(Expression.ofRoundNearestNumbers(roundNearestNumbers))

        /** Alias for calling [conditionalExpression] with `Expression.ofUpperCase(upperCase)`. */
        fun conditionalExpression(upperCase: UpperCase) =
            conditionalExpression(Expression.ofUpperCase(upperCase))

        /** Alias for calling [conditionalExpression] with `Expression.ofLowerCase(lowerCase)`. */
        fun conditionalExpression(lowerCase: LowerCase) =
            conditionalExpression(Expression.ofLowerCase(lowerCase))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofConcatStrings(concatStrings)`.
         */
        fun conditionalExpression(concatStrings: ConcatStrings) =
            conditionalExpression(Expression.ofConcatStrings(concatStrings))

        /** Alias for calling [conditionalExpression] with `Expression.ofContains(contains)`. */
        fun conditionalExpression(contains: Contains) =
            conditionalExpression(Expression.ofContains(contains))

        /** Alias for calling [conditionalExpression] with `Expression.ofBeginsWith(beginsWith)`. */
        fun conditionalExpression(beginsWith: BeginsWith) =
            conditionalExpression(Expression.ofBeginsWith(beginsWith))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofNumberToString(numberToString)`.
         */
        fun conditionalExpression(numberToString: NumberToString) =
            conditionalExpression(Expression.ofNumberToString(numberToString))

        /**
         * Alias for calling [conditionalExpression] with `Expression.ofParseNumber(parseNumber)`.
         */
        fun conditionalExpression(parseNumber: ParseNumber) =
            conditionalExpression(Expression.ofParseNumber(parseNumber))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun conditionalExpression(fetchExchangeRate: FetchExchangeRate) =
            conditionalExpression(Expression.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun conditionalExpression(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            conditionalExpression(
                Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun conditionalExpression(
            fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
        ) =
            conditionalExpression(
                Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun conditionalExpression(datedExchangeRate: DatedExchangeRate) =
            conditionalExpression(Expression.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofPipelineProbability(pipelineProbability)`.
         */
        fun conditionalExpression(pipelineProbability: PipelineProbability) =
            conditionalExpression(Expression.ofPipelineProbability(pipelineProbability))

        /** Alias for calling [conditionalExpression] with `Expression.ofMaxNumbers(maxNumbers)`. */
        fun conditionalExpression(maxNumbers: MaxNumbers) =
            conditionalExpression(Expression.ofMaxNumbers(maxNumbers))

        /** Alias for calling [conditionalExpression] with `Expression.ofMinNumbers(minNumbers)`. */
        fun conditionalExpression(minNumbers: MinNumbers) =
            conditionalExpression(Expression.ofMinNumbers(minNumbers))

        /** Alias for calling [conditionalExpression] with `Expression.ofLessThan(lessThan)`. */
        fun conditionalExpression(lessThan: LessThan) =
            conditionalExpression(Expression.ofLessThan(lessThan))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofLessThanOrEqual(lessThanOrEqual)`.
         */
        fun conditionalExpression(lessThanOrEqual: LessThanOrEqual) =
            conditionalExpression(Expression.ofLessThanOrEqual(lessThanOrEqual))

        /** Alias for calling [conditionalExpression] with `Expression.ofMoreThan(moreThan)`. */
        fun conditionalExpression(moreThan: MoreThan) =
            conditionalExpression(Expression.ofMoreThan(moreThan))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofMoreThanOrEqual(moreThanOrEqual)`.
         */
        fun conditionalExpression(moreThanOrEqual: MoreThanOrEqual) =
            conditionalExpression(Expression.ofMoreThanOrEqual(moreThanOrEqual))

        /**
         * Alias for calling [conditionalExpression] with `Expression.ofNumberEquals(numberEquals)`.
         */
        fun conditionalExpression(numberEquals: NumberEquals) =
            conditionalExpression(Expression.ofNumberEquals(numberEquals))

        /**
         * Alias for calling [conditionalExpression] with `Expression.ofStringEquals(stringEquals)`.
         */
        fun conditionalExpression(stringEquals: StringEquals) =
            conditionalExpression(Expression.ofStringEquals(stringEquals))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun conditionalExpression(isPipelineStageClosed: IsPipelineStageClosed) =
            conditionalExpression(Expression.ofIsPipelineStageClosed(isPipelineStageClosed))

        /** Alias for calling [conditionalExpression] with `Expression.ofNot(not)`. */
        fun conditionalExpression(not: Not) = conditionalExpression(Expression.ofNot(not))

        /** Alias for calling [conditionalExpression] with `Expression.ofDate(date)`. */
        fun conditionalExpression(date: Date) = conditionalExpression(Expression.ofDate(date))

        /** Alias for calling [conditionalExpression] with `Expression.ofMonth(month)`. */
        fun conditionalExpression(month: Month) = conditionalExpression(Expression.ofMonth(month))

        /** Alias for calling [conditionalExpression] with `Expression.ofYear(year)`. */
        fun conditionalExpression(year: Year) = conditionalExpression(Expression.ofYear(year))

        /** Alias for calling [conditionalExpression] with `Expression.ofNow(now)`. */
        fun conditionalExpression(now: Now) = conditionalExpression(Expression.ofNow(now))

        /**
         * Alias for calling [conditionalExpression] with `Expression.ofTimeBetween(timeBetween)`.
         */
        fun conditionalExpression(timeBetween: TimeBetween) =
            conditionalExpression(Expression.ofTimeBetween(timeBetween))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofPeriodToMonths(periodToMonths)`.
         */
        fun conditionalExpression(periodToMonths: PeriodToMonths) =
            conditionalExpression(Expression.ofPeriodToMonths(periodToMonths))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofPeriodToWeeks(periodToWeeks)`.
         */
        fun conditionalExpression(periodToWeeks: PeriodToWeeks) =
            conditionalExpression(Expression.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [conditionalExpression] with `Expression.ofAnd(and)`. */
        fun conditionalExpression(and: And) = conditionalExpression(Expression.ofAnd(and))

        /** Alias for calling [conditionalExpression] with `Expression.ofOr(or)`. */
        fun conditionalExpression(or: Or) = conditionalExpression(Expression.ofOr(or))

        /** Alias for calling [conditionalExpression] with `Expression.ofXor(xor)`. */
        fun conditionalExpression(xor: Xor) = conditionalExpression(Expression.ofXor(xor))

        /** Alias for calling [conditionalExpression] with `Expression.ofIfString(ifString)`. */
        fun conditionalExpression(ifString: IfString) =
            conditionalExpression(Expression.ofIfString(ifString))

        /** Alias for calling [conditionalExpression] with `Expression.ofIfNumber(ifNumber)`. */
        fun conditionalExpression(ifNumber: IfNumber) =
            conditionalExpression(Expression.ofIfNumber(ifNumber))

        /** Alias for calling [conditionalExpression] with `Expression.ofIfBoolean(ifBoolean)`. */
        fun conditionalExpression(ifBoolean: IfBoolean) =
            conditionalExpression(Expression.ofIfBoolean(ifBoolean))

        /** Alias for calling [conditionalExpression] with `Expression.ofIsPresent(isPresent)`. */
        fun conditionalExpression(isPresent: IsPresent) =
            conditionalExpression(Expression.ofIsPresent(isPresent))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofHasEmailReply(hasEmailReply)`.
         */
        fun conditionalExpression(hasEmailReply: HasEmailReply) =
            conditionalExpression(Expression.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun conditionalExpression(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            conditionalExpression(Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun conditionalExpression(
            extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
        ) =
            conditionalExpression(
                Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun conditionalExpression(
            extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
        ) =
            conditionalExpression(
                Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun conditionalExpression(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) =
            conditionalExpression(
                Expression.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofSetContainsString(setContainsString)`.
         */
        fun conditionalExpression(setContainsString: SetContainsString) =
            conditionalExpression(Expression.ofSetContainsString(setContainsString))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofIsEngagementType(isEngagementType)`.
         */
        fun conditionalExpression(isEngagementType: IsEngagementType) =
            conditionalExpression(Expression.ofIsEngagementType(isEngagementType))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofFormatFullName(formatFullName)`.
         */
        fun conditionalExpression(formatFullName: FormatFullName) =
            conditionalExpression(Expression.ofFormatFullName(formatFullName))

        /**
         * Alias for calling [conditionalExpression] with
         * `Expression.ofAbsoluteValue(absoluteValue)`.
         */
        fun conditionalExpression(absoluteValue: AbsoluteValue) =
            conditionalExpression(Expression.ofAbsoluteValue(absoluteValue))

        /** Alias for calling [conditionalExpression] with `Expression.ofSquareRoot(squareRoot)`. */
        fun conditionalExpression(squareRoot: SquareRoot) =
            conditionalExpression(Expression.ofSquareRoot(squareRoot))

        /** Alias for calling [conditionalExpression] with `Expression.ofPower(power)`. */
        fun conditionalExpression(power: Power) = conditionalExpression(Expression.ofPower(power))

        /** Alias for calling [conditionalExpression] with `Expression.ofSubstring(substring)`. */
        fun conditionalExpression(substring: Substring) =
            conditionalExpression(Expression.ofSubstring(substring))

        /** Alias for calling [conditionalExpression] with `Expression.ofEuler(euler)`. */
        fun conditionalExpression(euler: Euler) = conditionalExpression(Expression.ofEuler(euler))

        /**
         * Alias for calling [conditionalExpression] with `Expression.ofStringLength(stringLength)`.
         */
        fun conditionalExpression(stringLength: StringLength) =
            conditionalExpression(Expression.ofStringLength(stringLength))

        /** Alias for calling [conditionalExpression] with `Expression.ofAddTime(addTime)`. */
        fun conditionalExpression(addTime: AddTime) =
            conditionalExpression(Expression.ofAddTime(addTime))

        /**
         * Alias for calling [conditionalExpression] with `Expression.ofSubtractTime(subtractTime)`.
         */
        fun conditionalExpression(subtractTime: SubtractTime) =
            conditionalExpression(Expression.ofSubtractTime(subtractTime))

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
        rollupOperator()
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
        (associationTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (rollupOperator.asKnown().isPresent) 1 else 0) +
            (if (sourceObjectTypeId.asKnown().isPresent) 1 else 0) +
            (if (sourcePropertyName.asKnown().isPresent) 1 else 0) +
            (conditionalExpression.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conditionalFormula.asKnown().isPresent) 1 else 0) +
            (if (emptyRollupValue.asKnown().isPresent) 1 else 0) +
            (if (sourceCompareByPropertyName.asKnown().isPresent) 1 else 0)

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
