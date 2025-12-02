// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Contains
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val operator: JsonField<Operator>,
    private val stringToCheck: JsonField<Expression>,
    private val inputs: JsonField<List<Expression>>,
    private val propertyName: JsonField<String>,
    private val value: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("stringToCheck")
        @ExcludeMissing
        stringToCheck: JsonField<Expression> = JsonMissing.of(),
        @JsonProperty("inputs")
        @ExcludeMissing
        inputs: JsonField<List<Expression>> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Boolean> = JsonMissing.of(),
    ) : this(operator, stringToCheck, inputs, propertyName, value, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stringToCheck(): Expression = stringToCheck.getRequired("stringToCheck")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputs(): Optional<List<Expression>> = inputs.getOptional("inputs")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyName(): Optional<String> = propertyName.getOptional("propertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Boolean> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [stringToCheck].
     *
     * Unlike [stringToCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stringToCheck")
    @ExcludeMissing
    fun _stringToCheck(): JsonField<Expression> = stringToCheck

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<Expression>> = inputs

    /**
     * Returns the raw JSON value of [propertyName].
     *
     * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyName")
    @ExcludeMissing
    fun _propertyName(): JsonField<String> = propertyName

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Boolean> = value

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
         * Returns a mutable builder for constructing an instance of [Contains].
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .stringToCheck()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Contains]. */
    class Builder internal constructor() {

        private var operator: JsonField<Operator>? = null
        private var stringToCheck: JsonField<Expression>? = null
        private var inputs: JsonField<MutableList<Expression>>? = null
        private var propertyName: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contains: Contains) = apply {
            operator = contains.operator
            stringToCheck = contains.stringToCheck
            inputs = contains.inputs.map { it.toMutableList() }
            propertyName = contains.propertyName
            value = contains.value
            additionalProperties = contains.additionalProperties.toMutableMap()
        }

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        fun stringToCheck(stringToCheck: Expression) = stringToCheck(JsonField.of(stringToCheck))

        /**
         * Sets [Builder.stringToCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stringToCheck] with a well-typed [Expression] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stringToCheck(stringToCheck: JsonField<Expression>) = apply {
            this.stringToCheck = stringToCheck
        }

        /**
         * Alias for calling [stringToCheck] with `Expression.ofConstantBoolean(constantBoolean)`.
         */
        fun stringToCheck(constantBoolean: ConstantBoolean) =
            stringToCheck(Expression.ofConstantBoolean(constantBoolean))

        /** Alias for calling [stringToCheck] with `Expression.ofConstantNumber(constantNumber)`. */
        fun stringToCheck(constantNumber: ConstantNumber) =
            stringToCheck(Expression.ofConstantNumber(constantNumber))

        /** Alias for calling [stringToCheck] with `Expression.ofConstantString(constantString)`. */
        fun stringToCheck(constantString: ConstantString) =
            stringToCheck(Expression.ofConstantString(constantString))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun stringToCheck(booleanPropertyVariable: BooleanPropertyVariable) =
            stringToCheck(Expression.ofBooleanPropertyVariable(booleanPropertyVariable))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun stringToCheck(stringPropertyVariable: StringPropertyVariable) =
            stringToCheck(Expression.ofStringPropertyVariable(stringPropertyVariable))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun stringToCheck(numberPropertyVariable: NumberPropertyVariable) =
            stringToCheck(Expression.ofNumberPropertyVariable(numberPropertyVariable))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun stringToCheck(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            stringToCheck(Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun stringToCheck(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            stringToCheck(Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun stringToCheck(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            stringToCheck(Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun stringToCheck(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            stringToCheck(Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun stringToCheck(timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable) =
            stringToCheck(
                Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)
            )

        /** Alias for calling [stringToCheck] with `Expression.ofAddNumbers(addNumbers)`. */
        fun stringToCheck(addNumbers: AddNumbers) =
            stringToCheck(Expression.ofAddNumbers(addNumbers))

        /**
         * Alias for calling [stringToCheck] with `Expression.ofSubtractNumbers(subtractNumbers)`.
         */
        fun stringToCheck(subtractNumbers: SubtractNumbers) =
            stringToCheck(Expression.ofSubtractNumbers(subtractNumbers))

        /**
         * Alias for calling [stringToCheck] with `Expression.ofMultiplyNumbers(multiplyNumbers)`.
         */
        fun stringToCheck(multiplyNumbers: MultiplyNumbers) =
            stringToCheck(Expression.ofMultiplyNumbers(multiplyNumbers))

        /** Alias for calling [stringToCheck] with `Expression.ofDivideNumbers(divideNumbers)`. */
        fun stringToCheck(divideNumbers: DivideNumbers) =
            stringToCheck(Expression.ofDivideNumbers(divideNumbers))

        /**
         * Alias for calling [stringToCheck] with `Expression.ofRoundDownNumbers(roundDownNumbers)`.
         */
        fun stringToCheck(roundDownNumbers: RoundDownNumbers) =
            stringToCheck(Expression.ofRoundDownNumbers(roundDownNumbers))

        /** Alias for calling [stringToCheck] with `Expression.ofRoundUpNumbers(roundUpNumbers)`. */
        fun stringToCheck(roundUpNumbers: RoundUpNumbers) =
            stringToCheck(Expression.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun stringToCheck(roundNearestNumbers: RoundNearestNumbers) =
            stringToCheck(Expression.ofRoundNearestNumbers(roundNearestNumbers))

        /** Alias for calling [stringToCheck] with `Expression.ofUpperCase(upperCase)`. */
        fun stringToCheck(upperCase: UpperCase) = stringToCheck(Expression.ofUpperCase(upperCase))

        /** Alias for calling [stringToCheck] with `Expression.ofLowerCase(lowerCase)`. */
        fun stringToCheck(lowerCase: LowerCase) = stringToCheck(Expression.ofLowerCase(lowerCase))

        /** Alias for calling [stringToCheck] with `Expression.ofConcatStrings(concatStrings)`. */
        fun stringToCheck(concatStrings: ConcatStrings) =
            stringToCheck(Expression.ofConcatStrings(concatStrings))

        /** Alias for calling [stringToCheck] with `Expression.ofContains(contains)`. */
        fun stringToCheck(contains: Contains) = stringToCheck(Expression.ofContains(contains))

        /** Alias for calling [stringToCheck] with `Expression.ofBeginsWith(beginsWith)`. */
        fun stringToCheck(beginsWith: BeginsWith) =
            stringToCheck(Expression.ofBeginsWith(beginsWith))

        /** Alias for calling [stringToCheck] with `Expression.ofNumberToString(numberToString)`. */
        fun stringToCheck(numberToString: NumberToString) =
            stringToCheck(Expression.ofNumberToString(numberToString))

        /** Alias for calling [stringToCheck] with `Expression.ofParseNumber(parseNumber)`. */
        fun stringToCheck(parseNumber: ParseNumber) =
            stringToCheck(Expression.ofParseNumber(parseNumber))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun stringToCheck(fetchExchangeRate: FetchExchangeRate) =
            stringToCheck(Expression.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun stringToCheck(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            stringToCheck(Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun stringToCheck(fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency) =
            stringToCheck(
                Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)
            )

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun stringToCheck(datedExchangeRate: DatedExchangeRate) =
            stringToCheck(Expression.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofPipelineProbability(pipelineProbability)`.
         */
        fun stringToCheck(pipelineProbability: PipelineProbability) =
            stringToCheck(Expression.ofPipelineProbability(pipelineProbability))

        /** Alias for calling [stringToCheck] with `Expression.ofMaxNumbers(maxNumbers)`. */
        fun stringToCheck(maxNumbers: MaxNumbers) =
            stringToCheck(Expression.ofMaxNumbers(maxNumbers))

        /** Alias for calling [stringToCheck] with `Expression.ofMinNumbers(minNumbers)`. */
        fun stringToCheck(minNumbers: MinNumbers) =
            stringToCheck(Expression.ofMinNumbers(minNumbers))

        /** Alias for calling [stringToCheck] with `Expression.ofLessThan(lessThan)`. */
        fun stringToCheck(lessThan: LessThan) = stringToCheck(Expression.ofLessThan(lessThan))

        /**
         * Alias for calling [stringToCheck] with `Expression.ofLessThanOrEqual(lessThanOrEqual)`.
         */
        fun stringToCheck(lessThanOrEqual: LessThanOrEqual) =
            stringToCheck(Expression.ofLessThanOrEqual(lessThanOrEqual))

        /** Alias for calling [stringToCheck] with `Expression.ofMoreThan(moreThan)`. */
        fun stringToCheck(moreThan: MoreThan) = stringToCheck(Expression.ofMoreThan(moreThan))

        /**
         * Alias for calling [stringToCheck] with `Expression.ofMoreThanOrEqual(moreThanOrEqual)`.
         */
        fun stringToCheck(moreThanOrEqual: MoreThanOrEqual) =
            stringToCheck(Expression.ofMoreThanOrEqual(moreThanOrEqual))

        /** Alias for calling [stringToCheck] with `Expression.ofNumberEquals(numberEquals)`. */
        fun stringToCheck(numberEquals: NumberEquals) =
            stringToCheck(Expression.ofNumberEquals(numberEquals))

        /** Alias for calling [stringToCheck] with `Expression.ofStringEquals(stringEquals)`. */
        fun stringToCheck(stringEquals: StringEquals) =
            stringToCheck(Expression.ofStringEquals(stringEquals))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun stringToCheck(isPipelineStageClosed: IsPipelineStageClosed) =
            stringToCheck(Expression.ofIsPipelineStageClosed(isPipelineStageClosed))

        /** Alias for calling [stringToCheck] with `Expression.ofNot(not)`. */
        fun stringToCheck(not: Not) = stringToCheck(Expression.ofNot(not))

        /** Alias for calling [stringToCheck] with `Expression.ofDate(date)`. */
        fun stringToCheck(date: Date) = stringToCheck(Expression.ofDate(date))

        /** Alias for calling [stringToCheck] with `Expression.ofMonth(month)`. */
        fun stringToCheck(month: Month) = stringToCheck(Expression.ofMonth(month))

        /** Alias for calling [stringToCheck] with `Expression.ofYear(year)`. */
        fun stringToCheck(year: Year) = stringToCheck(Expression.ofYear(year))

        /** Alias for calling [stringToCheck] with `Expression.ofNow(now)`. */
        fun stringToCheck(now: Now) = stringToCheck(Expression.ofNow(now))

        /** Alias for calling [stringToCheck] with `Expression.ofTimeBetween(timeBetween)`. */
        fun stringToCheck(timeBetween: TimeBetween) =
            stringToCheck(Expression.ofTimeBetween(timeBetween))

        /** Alias for calling [stringToCheck] with `Expression.ofPeriodToMonths(periodToMonths)`. */
        fun stringToCheck(periodToMonths: PeriodToMonths) =
            stringToCheck(Expression.ofPeriodToMonths(periodToMonths))

        /** Alias for calling [stringToCheck] with `Expression.ofPeriodToWeeks(periodToWeeks)`. */
        fun stringToCheck(periodToWeeks: PeriodToWeeks) =
            stringToCheck(Expression.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [stringToCheck] with `Expression.ofAnd(and)`. */
        fun stringToCheck(and: And) = stringToCheck(Expression.ofAnd(and))

        /** Alias for calling [stringToCheck] with `Expression.ofOr(or)`. */
        fun stringToCheck(or: Or) = stringToCheck(Expression.ofOr(or))

        /** Alias for calling [stringToCheck] with `Expression.ofXor(xor)`. */
        fun stringToCheck(xor: Xor) = stringToCheck(Expression.ofXor(xor))

        /** Alias for calling [stringToCheck] with `Expression.ofIfString(ifString)`. */
        fun stringToCheck(ifString: IfString) = stringToCheck(Expression.ofIfString(ifString))

        /** Alias for calling [stringToCheck] with `Expression.ofIfNumber(ifNumber)`. */
        fun stringToCheck(ifNumber: IfNumber) = stringToCheck(Expression.ofIfNumber(ifNumber))

        /** Alias for calling [stringToCheck] with `Expression.ofIfBoolean(ifBoolean)`. */
        fun stringToCheck(ifBoolean: IfBoolean) = stringToCheck(Expression.ofIfBoolean(ifBoolean))

        /** Alias for calling [stringToCheck] with `Expression.ofIsPresent(isPresent)`. */
        fun stringToCheck(isPresent: IsPresent) = stringToCheck(Expression.ofIsPresent(isPresent))

        /** Alias for calling [stringToCheck] with `Expression.ofHasEmailReply(hasEmailReply)`. */
        fun stringToCheck(hasEmailReply: HasEmailReply) =
            stringToCheck(Expression.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun stringToCheck(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            stringToCheck(Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply))

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun stringToCheck(extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml) =
            stringToCheck(
                Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)
            )

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun stringToCheck(extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText) =
            stringToCheck(
                Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)
            )

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun stringToCheck(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) =
            stringToCheck(
                Expression.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [stringToCheck] with
         * `Expression.ofSetContainsString(setContainsString)`.
         */
        fun stringToCheck(setContainsString: SetContainsString) =
            stringToCheck(Expression.ofSetContainsString(setContainsString))

        /**
         * Alias for calling [stringToCheck] with `Expression.ofIsEngagementType(isEngagementType)`.
         */
        fun stringToCheck(isEngagementType: IsEngagementType) =
            stringToCheck(Expression.ofIsEngagementType(isEngagementType))

        /** Alias for calling [stringToCheck] with `Expression.ofFormatFullName(formatFullName)`. */
        fun stringToCheck(formatFullName: FormatFullName) =
            stringToCheck(Expression.ofFormatFullName(formatFullName))

        /** Alias for calling [stringToCheck] with `Expression.ofAbsoluteValue(absoluteValue)`. */
        fun stringToCheck(absoluteValue: AbsoluteValue) =
            stringToCheck(Expression.ofAbsoluteValue(absoluteValue))

        /** Alias for calling [stringToCheck] with `Expression.ofSquareRoot(squareRoot)`. */
        fun stringToCheck(squareRoot: SquareRoot) =
            stringToCheck(Expression.ofSquareRoot(squareRoot))

        /** Alias for calling [stringToCheck] with `Expression.ofPower(power)`. */
        fun stringToCheck(power: Power) = stringToCheck(Expression.ofPower(power))

        /** Alias for calling [stringToCheck] with `Expression.ofSubstring(substring)`. */
        fun stringToCheck(substring: Substring) = stringToCheck(Expression.ofSubstring(substring))

        /** Alias for calling [stringToCheck] with `Expression.ofEuler(euler)`. */
        fun stringToCheck(euler: Euler) = stringToCheck(Expression.ofEuler(euler))

        /** Alias for calling [stringToCheck] with `Expression.ofStringLength(stringLength)`. */
        fun stringToCheck(stringLength: StringLength) =
            stringToCheck(Expression.ofStringLength(stringLength))

        /** Alias for calling [stringToCheck] with `Expression.ofAddTime(addTime)`. */
        fun stringToCheck(addTime: AddTime) = stringToCheck(Expression.ofAddTime(addTime))

        /** Alias for calling [stringToCheck] with `Expression.ofSubtractTime(subtractTime)`. */
        fun stringToCheck(subtractTime: SubtractTime) =
            stringToCheck(Expression.ofSubtractTime(subtractTime))

        fun inputs(inputs: List<Expression>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<Expression>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputs(inputs: JsonField<List<Expression>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Expression] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: Expression) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
                }
        }

        /** Alias for calling [addInput] with `Expression.ofConstantBoolean(constantBoolean)`. */
        fun addInput(constantBoolean: ConstantBoolean) =
            addInput(Expression.ofConstantBoolean(constantBoolean))

        /** Alias for calling [addInput] with `Expression.ofConstantNumber(constantNumber)`. */
        fun addInput(constantNumber: ConstantNumber) =
            addInput(Expression.ofConstantNumber(constantNumber))

        /** Alias for calling [addInput] with `Expression.ofConstantString(constantString)`. */
        fun addInput(constantString: ConstantString) =
            addInput(Expression.ofConstantString(constantString))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun addInput(booleanPropertyVariable: BooleanPropertyVariable) =
            addInput(Expression.ofBooleanPropertyVariable(booleanPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun addInput(stringPropertyVariable: StringPropertyVariable) =
            addInput(Expression.ofStringPropertyVariable(stringPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun addInput(numberPropertyVariable: NumberPropertyVariable) =
            addInput(Expression.ofNumberPropertyVariable(numberPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun addInput(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            addInput(Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun addInput(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            addInput(Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun addInput(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            addInput(Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun addInput(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            addInput(Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun addInput(timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable) =
            addInput(
                Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)
            )

        /** Alias for calling [addInput] with `Expression.ofAddNumbers(addNumbers)`. */
        fun addInput(addNumbers: AddNumbers) = addInput(Expression.ofAddNumbers(addNumbers))

        /** Alias for calling [addInput] with `Expression.ofSubtractNumbers(subtractNumbers)`. */
        fun addInput(subtractNumbers: SubtractNumbers) =
            addInput(Expression.ofSubtractNumbers(subtractNumbers))

        /** Alias for calling [addInput] with `Expression.ofMultiplyNumbers(multiplyNumbers)`. */
        fun addInput(multiplyNumbers: MultiplyNumbers) =
            addInput(Expression.ofMultiplyNumbers(multiplyNumbers))

        /** Alias for calling [addInput] with `Expression.ofDivideNumbers(divideNumbers)`. */
        fun addInput(divideNumbers: DivideNumbers) =
            addInput(Expression.ofDivideNumbers(divideNumbers))

        /** Alias for calling [addInput] with `Expression.ofRoundDownNumbers(roundDownNumbers)`. */
        fun addInput(roundDownNumbers: RoundDownNumbers) =
            addInput(Expression.ofRoundDownNumbers(roundDownNumbers))

        /** Alias for calling [addInput] with `Expression.ofRoundUpNumbers(roundUpNumbers)`. */
        fun addInput(roundUpNumbers: RoundUpNumbers) =
            addInput(Expression.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun addInput(roundNearestNumbers: RoundNearestNumbers) =
            addInput(Expression.ofRoundNearestNumbers(roundNearestNumbers))

        /** Alias for calling [addInput] with `Expression.ofUpperCase(upperCase)`. */
        fun addInput(upperCase: UpperCase) = addInput(Expression.ofUpperCase(upperCase))

        /** Alias for calling [addInput] with `Expression.ofLowerCase(lowerCase)`. */
        fun addInput(lowerCase: LowerCase) = addInput(Expression.ofLowerCase(lowerCase))

        /** Alias for calling [addInput] with `Expression.ofConcatStrings(concatStrings)`. */
        fun addInput(concatStrings: ConcatStrings) =
            addInput(Expression.ofConcatStrings(concatStrings))

        /** Alias for calling [addInput] with `Expression.ofContains(contains)`. */
        fun addInput(contains: Contains) = addInput(Expression.ofContains(contains))

        /** Alias for calling [addInput] with `Expression.ofBeginsWith(beginsWith)`. */
        fun addInput(beginsWith: BeginsWith) = addInput(Expression.ofBeginsWith(beginsWith))

        /** Alias for calling [addInput] with `Expression.ofNumberToString(numberToString)`. */
        fun addInput(numberToString: NumberToString) =
            addInput(Expression.ofNumberToString(numberToString))

        /** Alias for calling [addInput] with `Expression.ofParseNumber(parseNumber)`. */
        fun addInput(parseNumber: ParseNumber) = addInput(Expression.ofParseNumber(parseNumber))

        /**
         * Alias for calling [addInput] with `Expression.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun addInput(fetchExchangeRate: FetchExchangeRate) =
            addInput(Expression.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun addInput(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            addInput(Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun addInput(fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency) =
            addInput(
                Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)
            )

        /**
         * Alias for calling [addInput] with `Expression.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun addInput(datedExchangeRate: DatedExchangeRate) =
            addInput(Expression.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofPipelineProbability(pipelineProbability)`.
         */
        fun addInput(pipelineProbability: PipelineProbability) =
            addInput(Expression.ofPipelineProbability(pipelineProbability))

        /** Alias for calling [addInput] with `Expression.ofMaxNumbers(maxNumbers)`. */
        fun addInput(maxNumbers: MaxNumbers) = addInput(Expression.ofMaxNumbers(maxNumbers))

        /** Alias for calling [addInput] with `Expression.ofMinNumbers(minNumbers)`. */
        fun addInput(minNumbers: MinNumbers) = addInput(Expression.ofMinNumbers(minNumbers))

        /** Alias for calling [addInput] with `Expression.ofLessThan(lessThan)`. */
        fun addInput(lessThan: LessThan) = addInput(Expression.ofLessThan(lessThan))

        /** Alias for calling [addInput] with `Expression.ofLessThanOrEqual(lessThanOrEqual)`. */
        fun addInput(lessThanOrEqual: LessThanOrEqual) =
            addInput(Expression.ofLessThanOrEqual(lessThanOrEqual))

        /** Alias for calling [addInput] with `Expression.ofMoreThan(moreThan)`. */
        fun addInput(moreThan: MoreThan) = addInput(Expression.ofMoreThan(moreThan))

        /** Alias for calling [addInput] with `Expression.ofMoreThanOrEqual(moreThanOrEqual)`. */
        fun addInput(moreThanOrEqual: MoreThanOrEqual) =
            addInput(Expression.ofMoreThanOrEqual(moreThanOrEqual))

        /** Alias for calling [addInput] with `Expression.ofNumberEquals(numberEquals)`. */
        fun addInput(numberEquals: NumberEquals) = addInput(Expression.ofNumberEquals(numberEquals))

        /** Alias for calling [addInput] with `Expression.ofStringEquals(stringEquals)`. */
        fun addInput(stringEquals: StringEquals) = addInput(Expression.ofStringEquals(stringEquals))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun addInput(isPipelineStageClosed: IsPipelineStageClosed) =
            addInput(Expression.ofIsPipelineStageClosed(isPipelineStageClosed))

        /** Alias for calling [addInput] with `Expression.ofNot(not)`. */
        fun addInput(not: Not) = addInput(Expression.ofNot(not))

        /** Alias for calling [addInput] with `Expression.ofDate(date)`. */
        fun addInput(date: Date) = addInput(Expression.ofDate(date))

        /** Alias for calling [addInput] with `Expression.ofMonth(month)`. */
        fun addInput(month: Month) = addInput(Expression.ofMonth(month))

        /** Alias for calling [addInput] with `Expression.ofYear(year)`. */
        fun addInput(year: Year) = addInput(Expression.ofYear(year))

        /** Alias for calling [addInput] with `Expression.ofNow(now)`. */
        fun addInput(now: Now) = addInput(Expression.ofNow(now))

        /** Alias for calling [addInput] with `Expression.ofTimeBetween(timeBetween)`. */
        fun addInput(timeBetween: TimeBetween) = addInput(Expression.ofTimeBetween(timeBetween))

        /** Alias for calling [addInput] with `Expression.ofPeriodToMonths(periodToMonths)`. */
        fun addInput(periodToMonths: PeriodToMonths) =
            addInput(Expression.ofPeriodToMonths(periodToMonths))

        /** Alias for calling [addInput] with `Expression.ofPeriodToWeeks(periodToWeeks)`. */
        fun addInput(periodToWeeks: PeriodToWeeks) =
            addInput(Expression.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [addInput] with `Expression.ofAnd(and)`. */
        fun addInput(and: And) = addInput(Expression.ofAnd(and))

        /** Alias for calling [addInput] with `Expression.ofOr(or)`. */
        fun addInput(or: Or) = addInput(Expression.ofOr(or))

        /** Alias for calling [addInput] with `Expression.ofXor(xor)`. */
        fun addInput(xor: Xor) = addInput(Expression.ofXor(xor))

        /** Alias for calling [addInput] with `Expression.ofIfString(ifString)`. */
        fun addInput(ifString: IfString) = addInput(Expression.ofIfString(ifString))

        /** Alias for calling [addInput] with `Expression.ofIfNumber(ifNumber)`. */
        fun addInput(ifNumber: IfNumber) = addInput(Expression.ofIfNumber(ifNumber))

        /** Alias for calling [addInput] with `Expression.ofIfBoolean(ifBoolean)`. */
        fun addInput(ifBoolean: IfBoolean) = addInput(Expression.ofIfBoolean(ifBoolean))

        /** Alias for calling [addInput] with `Expression.ofIsPresent(isPresent)`. */
        fun addInput(isPresent: IsPresent) = addInput(Expression.ofIsPresent(isPresent))

        /** Alias for calling [addInput] with `Expression.ofHasEmailReply(hasEmailReply)`. */
        fun addInput(hasEmailReply: HasEmailReply) =
            addInput(Expression.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun addInput(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            addInput(Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun addInput(extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml) =
            addInput(Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun addInput(extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText) =
            addInput(Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText))

        /**
         * Alias for calling [addInput] with
         * `Expression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun addInput(extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply) =
            addInput(
                Expression.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [addInput] with `Expression.ofSetContainsString(setContainsString)`.
         */
        fun addInput(setContainsString: SetContainsString) =
            addInput(Expression.ofSetContainsString(setContainsString))

        /** Alias for calling [addInput] with `Expression.ofIsEngagementType(isEngagementType)`. */
        fun addInput(isEngagementType: IsEngagementType) =
            addInput(Expression.ofIsEngagementType(isEngagementType))

        /** Alias for calling [addInput] with `Expression.ofFormatFullName(formatFullName)`. */
        fun addInput(formatFullName: FormatFullName) =
            addInput(Expression.ofFormatFullName(formatFullName))

        /** Alias for calling [addInput] with `Expression.ofAbsoluteValue(absoluteValue)`. */
        fun addInput(absoluteValue: AbsoluteValue) =
            addInput(Expression.ofAbsoluteValue(absoluteValue))

        /** Alias for calling [addInput] with `Expression.ofSquareRoot(squareRoot)`. */
        fun addInput(squareRoot: SquareRoot) = addInput(Expression.ofSquareRoot(squareRoot))

        /** Alias for calling [addInput] with `Expression.ofPower(power)`. */
        fun addInput(power: Power) = addInput(Expression.ofPower(power))

        /** Alias for calling [addInput] with `Expression.ofSubstring(substring)`. */
        fun addInput(substring: Substring) = addInput(Expression.ofSubstring(substring))

        /** Alias for calling [addInput] with `Expression.ofEuler(euler)`. */
        fun addInput(euler: Euler) = addInput(Expression.ofEuler(euler))

        /** Alias for calling [addInput] with `Expression.ofStringLength(stringLength)`. */
        fun addInput(stringLength: StringLength) = addInput(Expression.ofStringLength(stringLength))

        /** Alias for calling [addInput] with `Expression.ofAddTime(addTime)`. */
        fun addInput(addTime: AddTime) = addInput(Expression.ofAddTime(addTime))

        /** Alias for calling [addInput] with `Expression.ofSubtractTime(subtractTime)`. */
        fun addInput(subtractTime: SubtractTime) = addInput(Expression.ofSubtractTime(subtractTime))

        fun propertyName(propertyName: String) = propertyName(JsonField.of(propertyName))

        /**
         * Sets [Builder.propertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun propertyName(propertyName: JsonField<String>) = apply {
            this.propertyName = propertyName
        }

        fun value(value: Boolean) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Boolean>) = apply { this.value = value }

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
         * Returns an immutable instance of [Contains].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .stringToCheck()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Contains =
            Contains(
                checkRequired("operator", operator),
                checkRequired("stringToCheck", stringToCheck),
                (inputs ?: JsonMissing.of()).map { it.toImmutable() },
                propertyName,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Contains = apply {
        if (validated) {
            return@apply
        }

        operator().validate()
        stringToCheck().validate()
        inputs().ifPresent { it.forEach { it.validate() } }
        propertyName()
        value()
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
        (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (stringToCheck.asKnown().getOrNull()?.validity() ?: 0) +
            (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (propertyName.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

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

            @JvmField val CONTAINS = of("CONTAINS")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            CONTAINS
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
            CONTAINS,
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
                CONTAINS -> Value.CONTAINS
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
                CONTAINS -> Known.CONTAINS
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Contains &&
            operator == other.operator &&
            stringToCheck == other.stringToCheck &&
            inputs == other.inputs &&
            propertyName == other.propertyName &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(operator, stringToCheck, inputs, propertyName, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Contains{operator=$operator, stringToCheck=$stringToCheck, inputs=$inputs, propertyName=$propertyName, value=$value, additionalProperties=$additionalProperties}"
}
