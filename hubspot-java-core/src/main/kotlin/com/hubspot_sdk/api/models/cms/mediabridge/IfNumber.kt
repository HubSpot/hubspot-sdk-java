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

class IfNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enclosedInParentheses: JsonField<Boolean>,
    private val ifExpression: JsonField<Expression>,
    private val operator: JsonField<Operator>,
    private val elseExpression: JsonField<Expression>,
    private val inputs: JsonField<List<Expression>>,
    private val propertyName: JsonField<String>,
    private val value: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enclosedInParentheses")
        @ExcludeMissing
        enclosedInParentheses: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ifExpression")
        @ExcludeMissing
        ifExpression: JsonField<Expression> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("elseExpression")
        @ExcludeMissing
        elseExpression: JsonField<Expression> = JsonMissing.of(),
        @JsonProperty("inputs")
        @ExcludeMissing
        inputs: JsonField<List<Expression>> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
    ) : this(
        enclosedInParentheses,
        ifExpression,
        operator,
        elseExpression,
        inputs,
        propertyName,
        value,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enclosedInParentheses(): Boolean =
        enclosedInParentheses.getRequired("enclosedInParentheses")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ifExpression(): Expression = ifExpression.getRequired("ifExpression")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun elseExpression(): Optional<Expression> = elseExpression.getOptional("elseExpression")

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
    fun value(): Optional<Double> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [enclosedInParentheses].
     *
     * Unlike [enclosedInParentheses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enclosedInParentheses")
    @ExcludeMissing
    fun _enclosedInParentheses(): JsonField<Boolean> = enclosedInParentheses

    /**
     * Returns the raw JSON value of [ifExpression].
     *
     * Unlike [ifExpression], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ifExpression")
    @ExcludeMissing
    fun _ifExpression(): JsonField<Expression> = ifExpression

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [elseExpression].
     *
     * Unlike [elseExpression], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elseExpression")
    @ExcludeMissing
    fun _elseExpression(): JsonField<Expression> = elseExpression

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
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
         * Returns a mutable builder for constructing an instance of [IfNumber].
         *
         * The following fields are required:
         * ```java
         * .enclosedInParentheses()
         * .ifExpression()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IfNumber]. */
    class Builder internal constructor() {

        private var enclosedInParentheses: JsonField<Boolean>? = null
        private var ifExpression: JsonField<Expression>? = null
        private var operator: JsonField<Operator>? = null
        private var elseExpression: JsonField<Expression> = JsonMissing.of()
        private var inputs: JsonField<MutableList<Expression>>? = null
        private var propertyName: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ifNumber: IfNumber) = apply {
            enclosedInParentheses = ifNumber.enclosedInParentheses
            ifExpression = ifNumber.ifExpression
            operator = ifNumber.operator
            elseExpression = ifNumber.elseExpression
            inputs = ifNumber.inputs.map { it.toMutableList() }
            propertyName = ifNumber.propertyName
            value = ifNumber.value
            additionalProperties = ifNumber.additionalProperties.toMutableMap()
        }

        fun enclosedInParentheses(enclosedInParentheses: Boolean) =
            enclosedInParentheses(JsonField.of(enclosedInParentheses))

        /**
         * Sets [Builder.enclosedInParentheses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enclosedInParentheses] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enclosedInParentheses(enclosedInParentheses: JsonField<Boolean>) = apply {
            this.enclosedInParentheses = enclosedInParentheses
        }

        fun ifExpression(ifExpression: Expression) = ifExpression(JsonField.of(ifExpression))

        /**
         * Sets [Builder.ifExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ifExpression] with a well-typed [Expression] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ifExpression(ifExpression: JsonField<Expression>) = apply {
            this.ifExpression = ifExpression
        }

        /**
         * Alias for calling [ifExpression] with `Expression.ofConstantBoolean(constantBoolean)`.
         */
        fun ifExpression(constantBoolean: ConstantBoolean) =
            ifExpression(Expression.ofConstantBoolean(constantBoolean))

        /** Alias for calling [ifExpression] with `Expression.ofConstantNumber(constantNumber)`. */
        fun ifExpression(constantNumber: ConstantNumber) =
            ifExpression(Expression.ofConstantNumber(constantNumber))

        /** Alias for calling [ifExpression] with `Expression.ofConstantString(constantString)`. */
        fun ifExpression(constantString: ConstantString) =
            ifExpression(Expression.ofConstantString(constantString))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun ifExpression(booleanPropertyVariable: BooleanPropertyVariable) =
            ifExpression(Expression.ofBooleanPropertyVariable(booleanPropertyVariable))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun ifExpression(stringPropertyVariable: StringPropertyVariable) =
            ifExpression(Expression.ofStringPropertyVariable(stringPropertyVariable))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun ifExpression(numberPropertyVariable: NumberPropertyVariable) =
            ifExpression(Expression.ofNumberPropertyVariable(numberPropertyVariable))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun ifExpression(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            ifExpression(Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun ifExpression(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            ifExpression(Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun ifExpression(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            ifExpression(Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun ifExpression(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            ifExpression(Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun ifExpression(timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable) =
            ifExpression(
                Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)
            )

        /** Alias for calling [ifExpression] with `Expression.ofAddNumbers(addNumbers)`. */
        fun ifExpression(addNumbers: AddNumbers) = ifExpression(Expression.ofAddNumbers(addNumbers))

        /**
         * Alias for calling [ifExpression] with `Expression.ofSubtractNumbers(subtractNumbers)`.
         */
        fun ifExpression(subtractNumbers: SubtractNumbers) =
            ifExpression(Expression.ofSubtractNumbers(subtractNumbers))

        /**
         * Alias for calling [ifExpression] with `Expression.ofMultiplyNumbers(multiplyNumbers)`.
         */
        fun ifExpression(multiplyNumbers: MultiplyNumbers) =
            ifExpression(Expression.ofMultiplyNumbers(multiplyNumbers))

        /** Alias for calling [ifExpression] with `Expression.ofDivideNumbers(divideNumbers)`. */
        fun ifExpression(divideNumbers: DivideNumbers) =
            ifExpression(Expression.ofDivideNumbers(divideNumbers))

        /**
         * Alias for calling [ifExpression] with `Expression.ofRoundDownNumbers(roundDownNumbers)`.
         */
        fun ifExpression(roundDownNumbers: RoundDownNumbers) =
            ifExpression(Expression.ofRoundDownNumbers(roundDownNumbers))

        /** Alias for calling [ifExpression] with `Expression.ofRoundUpNumbers(roundUpNumbers)`. */
        fun ifExpression(roundUpNumbers: RoundUpNumbers) =
            ifExpression(Expression.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun ifExpression(roundNearestNumbers: RoundNearestNumbers) =
            ifExpression(Expression.ofRoundNearestNumbers(roundNearestNumbers))

        /** Alias for calling [ifExpression] with `Expression.ofUpperCase(upperCase)`. */
        fun ifExpression(upperCase: UpperCase) = ifExpression(Expression.ofUpperCase(upperCase))

        /** Alias for calling [ifExpression] with `Expression.ofLowerCase(lowerCase)`. */
        fun ifExpression(lowerCase: LowerCase) = ifExpression(Expression.ofLowerCase(lowerCase))

        /** Alias for calling [ifExpression] with `Expression.ofConcatStrings(concatStrings)`. */
        fun ifExpression(concatStrings: ConcatStrings) =
            ifExpression(Expression.ofConcatStrings(concatStrings))

        /** Alias for calling [ifExpression] with `Expression.ofContains(contains)`. */
        fun ifExpression(contains: Contains) = ifExpression(Expression.ofContains(contains))

        /** Alias for calling [ifExpression] with `Expression.ofBeginsWith(beginsWith)`. */
        fun ifExpression(beginsWith: BeginsWith) = ifExpression(Expression.ofBeginsWith(beginsWith))

        /** Alias for calling [ifExpression] with `Expression.ofNumberToString(numberToString)`. */
        fun ifExpression(numberToString: NumberToString) =
            ifExpression(Expression.ofNumberToString(numberToString))

        /** Alias for calling [ifExpression] with `Expression.ofParseNumber(parseNumber)`. */
        fun ifExpression(parseNumber: ParseNumber) =
            ifExpression(Expression.ofParseNumber(parseNumber))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun ifExpression(fetchExchangeRate: FetchExchangeRate) =
            ifExpression(Expression.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun ifExpression(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            ifExpression(Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun ifExpression(fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency) =
            ifExpression(
                Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)
            )

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun ifExpression(datedExchangeRate: DatedExchangeRate) =
            ifExpression(Expression.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofPipelineProbability(pipelineProbability)`.
         */
        fun ifExpression(pipelineProbability: PipelineProbability) =
            ifExpression(Expression.ofPipelineProbability(pipelineProbability))

        /** Alias for calling [ifExpression] with `Expression.ofMaxNumbers(maxNumbers)`. */
        fun ifExpression(maxNumbers: MaxNumbers) = ifExpression(Expression.ofMaxNumbers(maxNumbers))

        /** Alias for calling [ifExpression] with `Expression.ofMinNumbers(minNumbers)`. */
        fun ifExpression(minNumbers: MinNumbers) = ifExpression(Expression.ofMinNumbers(minNumbers))

        /** Alias for calling [ifExpression] with `Expression.ofLessThan(lessThan)`. */
        fun ifExpression(lessThan: LessThan) = ifExpression(Expression.ofLessThan(lessThan))

        /**
         * Alias for calling [ifExpression] with `Expression.ofLessThanOrEqual(lessThanOrEqual)`.
         */
        fun ifExpression(lessThanOrEqual: LessThanOrEqual) =
            ifExpression(Expression.ofLessThanOrEqual(lessThanOrEqual))

        /** Alias for calling [ifExpression] with `Expression.ofMoreThan(moreThan)`. */
        fun ifExpression(moreThan: MoreThan) = ifExpression(Expression.ofMoreThan(moreThan))

        /**
         * Alias for calling [ifExpression] with `Expression.ofMoreThanOrEqual(moreThanOrEqual)`.
         */
        fun ifExpression(moreThanOrEqual: MoreThanOrEqual) =
            ifExpression(Expression.ofMoreThanOrEqual(moreThanOrEqual))

        /** Alias for calling [ifExpression] with `Expression.ofNumberEquals(numberEquals)`. */
        fun ifExpression(numberEquals: NumberEquals) =
            ifExpression(Expression.ofNumberEquals(numberEquals))

        /** Alias for calling [ifExpression] with `Expression.ofStringEquals(stringEquals)`. */
        fun ifExpression(stringEquals: StringEquals) =
            ifExpression(Expression.ofStringEquals(stringEquals))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun ifExpression(isPipelineStageClosed: IsPipelineStageClosed) =
            ifExpression(Expression.ofIsPipelineStageClosed(isPipelineStageClosed))

        /** Alias for calling [ifExpression] with `Expression.ofNot(not)`. */
        fun ifExpression(not: Not) = ifExpression(Expression.ofNot(not))

        /** Alias for calling [ifExpression] with `Expression.ofDate(date)`. */
        fun ifExpression(date: Date) = ifExpression(Expression.ofDate(date))

        /** Alias for calling [ifExpression] with `Expression.ofMonth(month)`. */
        fun ifExpression(month: Month) = ifExpression(Expression.ofMonth(month))

        /** Alias for calling [ifExpression] with `Expression.ofYear(year)`. */
        fun ifExpression(year: Year) = ifExpression(Expression.ofYear(year))

        /** Alias for calling [ifExpression] with `Expression.ofNow(now)`. */
        fun ifExpression(now: Now) = ifExpression(Expression.ofNow(now))

        /** Alias for calling [ifExpression] with `Expression.ofTimeBetween(timeBetween)`. */
        fun ifExpression(timeBetween: TimeBetween) =
            ifExpression(Expression.ofTimeBetween(timeBetween))

        /** Alias for calling [ifExpression] with `Expression.ofPeriodToMonths(periodToMonths)`. */
        fun ifExpression(periodToMonths: PeriodToMonths) =
            ifExpression(Expression.ofPeriodToMonths(periodToMonths))

        /** Alias for calling [ifExpression] with `Expression.ofPeriodToWeeks(periodToWeeks)`. */
        fun ifExpression(periodToWeeks: PeriodToWeeks) =
            ifExpression(Expression.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [ifExpression] with `Expression.ofAnd(and)`. */
        fun ifExpression(and: And) = ifExpression(Expression.ofAnd(and))

        /** Alias for calling [ifExpression] with `Expression.ofOr(or)`. */
        fun ifExpression(or: Or) = ifExpression(Expression.ofOr(or))

        /** Alias for calling [ifExpression] with `Expression.ofXor(xor)`. */
        fun ifExpression(xor: Xor) = ifExpression(Expression.ofXor(xor))

        /** Alias for calling [ifExpression] with `Expression.ofIfString(ifString)`. */
        fun ifExpression(ifString: IfString) = ifExpression(Expression.ofIfString(ifString))

        /** Alias for calling [ifExpression] with `Expression.ofIfNumber(ifNumber)`. */
        fun ifExpression(ifNumber: IfNumber) = ifExpression(Expression.ofIfNumber(ifNumber))

        /** Alias for calling [ifExpression] with `Expression.ofIfBoolean(ifBoolean)`. */
        fun ifExpression(ifBoolean: IfBoolean) = ifExpression(Expression.ofIfBoolean(ifBoolean))

        /** Alias for calling [ifExpression] with `Expression.ofIsPresent(isPresent)`. */
        fun ifExpression(isPresent: IsPresent) = ifExpression(Expression.ofIsPresent(isPresent))

        /** Alias for calling [ifExpression] with `Expression.ofHasEmailReply(hasEmailReply)`. */
        fun ifExpression(hasEmailReply: HasEmailReply) =
            ifExpression(Expression.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun ifExpression(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            ifExpression(Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply))

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun ifExpression(extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml) =
            ifExpression(
                Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)
            )

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun ifExpression(extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText) =
            ifExpression(
                Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)
            )

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun ifExpression(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) =
            ifExpression(
                Expression.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [ifExpression] with
         * `Expression.ofSetContainsString(setContainsString)`.
         */
        fun ifExpression(setContainsString: SetContainsString) =
            ifExpression(Expression.ofSetContainsString(setContainsString))

        /**
         * Alias for calling [ifExpression] with `Expression.ofIsEngagementType(isEngagementType)`.
         */
        fun ifExpression(isEngagementType: IsEngagementType) =
            ifExpression(Expression.ofIsEngagementType(isEngagementType))

        /** Alias for calling [ifExpression] with `Expression.ofFormatFullName(formatFullName)`. */
        fun ifExpression(formatFullName: FormatFullName) =
            ifExpression(Expression.ofFormatFullName(formatFullName))

        /** Alias for calling [ifExpression] with `Expression.ofAbsoluteValue(absoluteValue)`. */
        fun ifExpression(absoluteValue: AbsoluteValue) =
            ifExpression(Expression.ofAbsoluteValue(absoluteValue))

        /** Alias for calling [ifExpression] with `Expression.ofSquareRoot(squareRoot)`. */
        fun ifExpression(squareRoot: SquareRoot) = ifExpression(Expression.ofSquareRoot(squareRoot))

        /** Alias for calling [ifExpression] with `Expression.ofPower(power)`. */
        fun ifExpression(power: Power) = ifExpression(Expression.ofPower(power))

        /** Alias for calling [ifExpression] with `Expression.ofSubstring(substring)`. */
        fun ifExpression(substring: Substring) = ifExpression(Expression.ofSubstring(substring))

        /** Alias for calling [ifExpression] with `Expression.ofEuler(euler)`. */
        fun ifExpression(euler: Euler) = ifExpression(Expression.ofEuler(euler))

        /** Alias for calling [ifExpression] with `Expression.ofStringLength(stringLength)`. */
        fun ifExpression(stringLength: StringLength) =
            ifExpression(Expression.ofStringLength(stringLength))

        /** Alias for calling [ifExpression] with `Expression.ofAddTime(addTime)`. */
        fun ifExpression(addTime: AddTime) = ifExpression(Expression.ofAddTime(addTime))

        /** Alias for calling [ifExpression] with `Expression.ofSubtractTime(subtractTime)`. */
        fun ifExpression(subtractTime: SubtractTime) =
            ifExpression(Expression.ofSubtractTime(subtractTime))

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        fun elseExpression(elseExpression: Expression) =
            elseExpression(JsonField.of(elseExpression))

        /**
         * Sets [Builder.elseExpression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elseExpression] with a well-typed [Expression] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elseExpression(elseExpression: JsonField<Expression>) = apply {
            this.elseExpression = elseExpression
        }

        /**
         * Alias for calling [elseExpression] with `Expression.ofConstantBoolean(constantBoolean)`.
         */
        fun elseExpression(constantBoolean: ConstantBoolean) =
            elseExpression(Expression.ofConstantBoolean(constantBoolean))

        /**
         * Alias for calling [elseExpression] with `Expression.ofConstantNumber(constantNumber)`.
         */
        fun elseExpression(constantNumber: ConstantNumber) =
            elseExpression(Expression.ofConstantNumber(constantNumber))

        /**
         * Alias for calling [elseExpression] with `Expression.ofConstantString(constantString)`.
         */
        fun elseExpression(constantString: ConstantString) =
            elseExpression(Expression.ofConstantString(constantString))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun elseExpression(booleanPropertyVariable: BooleanPropertyVariable) =
            elseExpression(Expression.ofBooleanPropertyVariable(booleanPropertyVariable))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun elseExpression(stringPropertyVariable: StringPropertyVariable) =
            elseExpression(Expression.ofStringPropertyVariable(stringPropertyVariable))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun elseExpression(numberPropertyVariable: NumberPropertyVariable) =
            elseExpression(Expression.ofNumberPropertyVariable(numberPropertyVariable))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun elseExpression(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            elseExpression(Expression.ofTimestampOfPropertyVariable(timestampOfPropertyVariable))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun elseExpression(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            elseExpression(
                Expression.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)
            )

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun elseExpression(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            elseExpression(Expression.ofStringTargetPropertyVariable(stringTargetPropertyVariable))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun elseExpression(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            elseExpression(Expression.ofNumberTargetPropertyVariable(numberTargetPropertyVariable))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun elseExpression(timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable) =
            elseExpression(
                Expression.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)
            )

        /** Alias for calling [elseExpression] with `Expression.ofAddNumbers(addNumbers)`. */
        fun elseExpression(addNumbers: AddNumbers) =
            elseExpression(Expression.ofAddNumbers(addNumbers))

        /**
         * Alias for calling [elseExpression] with `Expression.ofSubtractNumbers(subtractNumbers)`.
         */
        fun elseExpression(subtractNumbers: SubtractNumbers) =
            elseExpression(Expression.ofSubtractNumbers(subtractNumbers))

        /**
         * Alias for calling [elseExpression] with `Expression.ofMultiplyNumbers(multiplyNumbers)`.
         */
        fun elseExpression(multiplyNumbers: MultiplyNumbers) =
            elseExpression(Expression.ofMultiplyNumbers(multiplyNumbers))

        /** Alias for calling [elseExpression] with `Expression.ofDivideNumbers(divideNumbers)`. */
        fun elseExpression(divideNumbers: DivideNumbers) =
            elseExpression(Expression.ofDivideNumbers(divideNumbers))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofRoundDownNumbers(roundDownNumbers)`.
         */
        fun elseExpression(roundDownNumbers: RoundDownNumbers) =
            elseExpression(Expression.ofRoundDownNumbers(roundDownNumbers))

        /**
         * Alias for calling [elseExpression] with `Expression.ofRoundUpNumbers(roundUpNumbers)`.
         */
        fun elseExpression(roundUpNumbers: RoundUpNumbers) =
            elseExpression(Expression.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun elseExpression(roundNearestNumbers: RoundNearestNumbers) =
            elseExpression(Expression.ofRoundNearestNumbers(roundNearestNumbers))

        /** Alias for calling [elseExpression] with `Expression.ofUpperCase(upperCase)`. */
        fun elseExpression(upperCase: UpperCase) = elseExpression(Expression.ofUpperCase(upperCase))

        /** Alias for calling [elseExpression] with `Expression.ofLowerCase(lowerCase)`. */
        fun elseExpression(lowerCase: LowerCase) = elseExpression(Expression.ofLowerCase(lowerCase))

        /** Alias for calling [elseExpression] with `Expression.ofConcatStrings(concatStrings)`. */
        fun elseExpression(concatStrings: ConcatStrings) =
            elseExpression(Expression.ofConcatStrings(concatStrings))

        /** Alias for calling [elseExpression] with `Expression.ofContains(contains)`. */
        fun elseExpression(contains: Contains) = elseExpression(Expression.ofContains(contains))

        /** Alias for calling [elseExpression] with `Expression.ofBeginsWith(beginsWith)`. */
        fun elseExpression(beginsWith: BeginsWith) =
            elseExpression(Expression.ofBeginsWith(beginsWith))

        /**
         * Alias for calling [elseExpression] with `Expression.ofNumberToString(numberToString)`.
         */
        fun elseExpression(numberToString: NumberToString) =
            elseExpression(Expression.ofNumberToString(numberToString))

        /** Alias for calling [elseExpression] with `Expression.ofParseNumber(parseNumber)`. */
        fun elseExpression(parseNumber: ParseNumber) =
            elseExpression(Expression.ofParseNumber(parseNumber))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun elseExpression(fetchExchangeRate: FetchExchangeRate) =
            elseExpression(Expression.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun elseExpression(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            elseExpression(Expression.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun elseExpression(fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency) =
            elseExpression(
                Expression.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)
            )

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun elseExpression(datedExchangeRate: DatedExchangeRate) =
            elseExpression(Expression.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofPipelineProbability(pipelineProbability)`.
         */
        fun elseExpression(pipelineProbability: PipelineProbability) =
            elseExpression(Expression.ofPipelineProbability(pipelineProbability))

        /** Alias for calling [elseExpression] with `Expression.ofMaxNumbers(maxNumbers)`. */
        fun elseExpression(maxNumbers: MaxNumbers) =
            elseExpression(Expression.ofMaxNumbers(maxNumbers))

        /** Alias for calling [elseExpression] with `Expression.ofMinNumbers(minNumbers)`. */
        fun elseExpression(minNumbers: MinNumbers) =
            elseExpression(Expression.ofMinNumbers(minNumbers))

        /** Alias for calling [elseExpression] with `Expression.ofLessThan(lessThan)`. */
        fun elseExpression(lessThan: LessThan) = elseExpression(Expression.ofLessThan(lessThan))

        /**
         * Alias for calling [elseExpression] with `Expression.ofLessThanOrEqual(lessThanOrEqual)`.
         */
        fun elseExpression(lessThanOrEqual: LessThanOrEqual) =
            elseExpression(Expression.ofLessThanOrEqual(lessThanOrEqual))

        /** Alias for calling [elseExpression] with `Expression.ofMoreThan(moreThan)`. */
        fun elseExpression(moreThan: MoreThan) = elseExpression(Expression.ofMoreThan(moreThan))

        /**
         * Alias for calling [elseExpression] with `Expression.ofMoreThanOrEqual(moreThanOrEqual)`.
         */
        fun elseExpression(moreThanOrEqual: MoreThanOrEqual) =
            elseExpression(Expression.ofMoreThanOrEqual(moreThanOrEqual))

        /** Alias for calling [elseExpression] with `Expression.ofNumberEquals(numberEquals)`. */
        fun elseExpression(numberEquals: NumberEquals) =
            elseExpression(Expression.ofNumberEquals(numberEquals))

        /** Alias for calling [elseExpression] with `Expression.ofStringEquals(stringEquals)`. */
        fun elseExpression(stringEquals: StringEquals) =
            elseExpression(Expression.ofStringEquals(stringEquals))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun elseExpression(isPipelineStageClosed: IsPipelineStageClosed) =
            elseExpression(Expression.ofIsPipelineStageClosed(isPipelineStageClosed))

        /** Alias for calling [elseExpression] with `Expression.ofNot(not)`. */
        fun elseExpression(not: Not) = elseExpression(Expression.ofNot(not))

        /** Alias for calling [elseExpression] with `Expression.ofDate(date)`. */
        fun elseExpression(date: Date) = elseExpression(Expression.ofDate(date))

        /** Alias for calling [elseExpression] with `Expression.ofMonth(month)`. */
        fun elseExpression(month: Month) = elseExpression(Expression.ofMonth(month))

        /** Alias for calling [elseExpression] with `Expression.ofYear(year)`. */
        fun elseExpression(year: Year) = elseExpression(Expression.ofYear(year))

        /** Alias for calling [elseExpression] with `Expression.ofNow(now)`. */
        fun elseExpression(now: Now) = elseExpression(Expression.ofNow(now))

        /** Alias for calling [elseExpression] with `Expression.ofTimeBetween(timeBetween)`. */
        fun elseExpression(timeBetween: TimeBetween) =
            elseExpression(Expression.ofTimeBetween(timeBetween))

        /**
         * Alias for calling [elseExpression] with `Expression.ofPeriodToMonths(periodToMonths)`.
         */
        fun elseExpression(periodToMonths: PeriodToMonths) =
            elseExpression(Expression.ofPeriodToMonths(periodToMonths))

        /** Alias for calling [elseExpression] with `Expression.ofPeriodToWeeks(periodToWeeks)`. */
        fun elseExpression(periodToWeeks: PeriodToWeeks) =
            elseExpression(Expression.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [elseExpression] with `Expression.ofAnd(and)`. */
        fun elseExpression(and: And) = elseExpression(Expression.ofAnd(and))

        /** Alias for calling [elseExpression] with `Expression.ofOr(or)`. */
        fun elseExpression(or: Or) = elseExpression(Expression.ofOr(or))

        /** Alias for calling [elseExpression] with `Expression.ofXor(xor)`. */
        fun elseExpression(xor: Xor) = elseExpression(Expression.ofXor(xor))

        /** Alias for calling [elseExpression] with `Expression.ofIfString(ifString)`. */
        fun elseExpression(ifString: IfString) = elseExpression(Expression.ofIfString(ifString))

        /** Alias for calling [elseExpression] with `Expression.ofIfNumber(ifNumber)`. */
        fun elseExpression(ifNumber: IfNumber) = elseExpression(Expression.ofIfNumber(ifNumber))

        /** Alias for calling [elseExpression] with `Expression.ofIfBoolean(ifBoolean)`. */
        fun elseExpression(ifBoolean: IfBoolean) = elseExpression(Expression.ofIfBoolean(ifBoolean))

        /** Alias for calling [elseExpression] with `Expression.ofIsPresent(isPresent)`. */
        fun elseExpression(isPresent: IsPresent) = elseExpression(Expression.ofIsPresent(isPresent))

        /** Alias for calling [elseExpression] with `Expression.ofHasEmailReply(hasEmailReply)`. */
        fun elseExpression(hasEmailReply: HasEmailReply) =
            elseExpression(Expression.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun elseExpression(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            elseExpression(Expression.ofHasPlainTextEmailReply(hasPlainTextEmailReply))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun elseExpression(extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml) =
            elseExpression(
                Expression.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)
            )

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun elseExpression(extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText) =
            elseExpression(
                Expression.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)
            )

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun elseExpression(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) =
            elseExpression(
                Expression.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofSetContainsString(setContainsString)`.
         */
        fun elseExpression(setContainsString: SetContainsString) =
            elseExpression(Expression.ofSetContainsString(setContainsString))

        /**
         * Alias for calling [elseExpression] with
         * `Expression.ofIsEngagementType(isEngagementType)`.
         */
        fun elseExpression(isEngagementType: IsEngagementType) =
            elseExpression(Expression.ofIsEngagementType(isEngagementType))

        /**
         * Alias for calling [elseExpression] with `Expression.ofFormatFullName(formatFullName)`.
         */
        fun elseExpression(formatFullName: FormatFullName) =
            elseExpression(Expression.ofFormatFullName(formatFullName))

        /** Alias for calling [elseExpression] with `Expression.ofAbsoluteValue(absoluteValue)`. */
        fun elseExpression(absoluteValue: AbsoluteValue) =
            elseExpression(Expression.ofAbsoluteValue(absoluteValue))

        /** Alias for calling [elseExpression] with `Expression.ofSquareRoot(squareRoot)`. */
        fun elseExpression(squareRoot: SquareRoot) =
            elseExpression(Expression.ofSquareRoot(squareRoot))

        /** Alias for calling [elseExpression] with `Expression.ofPower(power)`. */
        fun elseExpression(power: Power) = elseExpression(Expression.ofPower(power))

        /** Alias for calling [elseExpression] with `Expression.ofSubstring(substring)`. */
        fun elseExpression(substring: Substring) = elseExpression(Expression.ofSubstring(substring))

        /** Alias for calling [elseExpression] with `Expression.ofEuler(euler)`. */
        fun elseExpression(euler: Euler) = elseExpression(Expression.ofEuler(euler))

        /** Alias for calling [elseExpression] with `Expression.ofStringLength(stringLength)`. */
        fun elseExpression(stringLength: StringLength) =
            elseExpression(Expression.ofStringLength(stringLength))

        /** Alias for calling [elseExpression] with `Expression.ofAddTime(addTime)`. */
        fun elseExpression(addTime: AddTime) = elseExpression(Expression.ofAddTime(addTime))

        /** Alias for calling [elseExpression] with `Expression.ofSubtractTime(subtractTime)`. */
        fun elseExpression(subtractTime: SubtractTime) =
            elseExpression(Expression.ofSubtractTime(subtractTime))

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

        fun value(value: Double) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Double>) = apply { this.value = value }

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
         * Returns an immutable instance of [IfNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enclosedInParentheses()
         * .ifExpression()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IfNumber =
            IfNumber(
                checkRequired("enclosedInParentheses", enclosedInParentheses),
                checkRequired("ifExpression", ifExpression),
                checkRequired("operator", operator),
                elseExpression,
                (inputs ?: JsonMissing.of()).map { it.toImmutable() },
                propertyName,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IfNumber = apply {
        if (validated) {
            return@apply
        }

        enclosedInParentheses()
        ifExpression().validate()
        operator().validate()
        elseExpression().ifPresent { it.validate() }
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
        (if (enclosedInParentheses.asKnown().isPresent) 1 else 0) +
            (ifExpression.asKnown().getOrNull()?.validity() ?: 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (elseExpression.asKnown().getOrNull()?.validity() ?: 0) +
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

            @JvmField val IF_NUMBER = of("IF_NUMBER")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IF_NUMBER
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
            IF_NUMBER,
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
                IF_NUMBER -> Value.IF_NUMBER
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
                IF_NUMBER -> Known.IF_NUMBER
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

        return other is IfNumber &&
            enclosedInParentheses == other.enclosedInParentheses &&
            ifExpression == other.ifExpression &&
            operator == other.operator &&
            elseExpression == other.elseExpression &&
            inputs == other.inputs &&
            propertyName == other.propertyName &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            enclosedInParentheses,
            ifExpression,
            operator,
            elseExpression,
            inputs,
            propertyName,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IfNumber{enclosedInParentheses=$enclosedInParentheses, ifExpression=$ifExpression, operator=$operator, elseExpression=$elseExpression, inputs=$inputs, propertyName=$propertyName, value=$value, additionalProperties=$additionalProperties}"
}
