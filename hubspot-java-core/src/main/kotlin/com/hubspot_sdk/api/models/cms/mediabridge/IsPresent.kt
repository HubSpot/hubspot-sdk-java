// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IsPresent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expressionToEvaluate: JsonField<ExpressionToEvaluate>,
    private val operator: JsonField<Operator>,
    private val propertyName: JsonField<String>,
    private val value: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expressionToEvaluate")
        @ExcludeMissing
        expressionToEvaluate: JsonField<ExpressionToEvaluate> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Boolean> = JsonMissing.of(),
    ) : this(expressionToEvaluate, operator, propertyName, value, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expressionToEvaluate(): ExpressionToEvaluate =
        expressionToEvaluate.getRequired("expressionToEvaluate")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyName(): Optional<String> = propertyName.getOptional("propertyName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Boolean> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [expressionToEvaluate].
     *
     * Unlike [expressionToEvaluate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expressionToEvaluate")
    @ExcludeMissing
    fun _expressionToEvaluate(): JsonField<ExpressionToEvaluate> = expressionToEvaluate

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

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
         * Returns a mutable builder for constructing an instance of [IsPresent].
         *
         * The following fields are required:
         * ```java
         * .expressionToEvaluate()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IsPresent]. */
    class Builder internal constructor() {

        private var expressionToEvaluate: JsonField<ExpressionToEvaluate>? = null
        private var operator: JsonField<Operator>? = null
        private var propertyName: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(isPresent: IsPresent) = apply {
            expressionToEvaluate = isPresent.expressionToEvaluate
            operator = isPresent.operator
            propertyName = isPresent.propertyName
            value = isPresent.value
            additionalProperties = isPresent.additionalProperties.toMutableMap()
        }

        fun expressionToEvaluate(expressionToEvaluate: ExpressionToEvaluate) =
            expressionToEvaluate(JsonField.of(expressionToEvaluate))

        /**
         * Sets [Builder.expressionToEvaluate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressionToEvaluate] with a well-typed
         * [ExpressionToEvaluate] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun expressionToEvaluate(expressionToEvaluate: JsonField<ExpressionToEvaluate>) = apply {
            this.expressionToEvaluate = expressionToEvaluate
        }

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofConstantBoolean(constantBoolean)`.
         */
        fun expressionToEvaluate(constantBoolean: ConstantBoolean) =
            expressionToEvaluate(ExpressionToEvaluate.ofConstantBoolean(constantBoolean))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofConstantNumber(constantNumber)`.
         */
        fun expressionToEvaluate(constantNumber: ConstantNumber) =
            expressionToEvaluate(ExpressionToEvaluate.ofConstantNumber(constantNumber))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofConstantString(constantString)`.
         */
        fun expressionToEvaluate(constantString: ConstantString) =
            expressionToEvaluate(ExpressionToEvaluate.ofConstantString(constantString))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun expressionToEvaluate(booleanPropertyVariable: BooleanPropertyVariable) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofBooleanPropertyVariable(booleanPropertyVariable)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun expressionToEvaluate(stringPropertyVariable: StringPropertyVariable) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofStringPropertyVariable(stringPropertyVariable)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun expressionToEvaluate(numberPropertyVariable: NumberPropertyVariable) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofNumberPropertyVariable(numberPropertyVariable)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun expressionToEvaluate(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun expressionToEvaluate(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun expressionToEvaluate(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofStringTargetPropertyVariable(stringTargetPropertyVariable)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun expressionToEvaluate(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun expressionToEvaluate(
            timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
        ) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofTimestampOfTargetPropertyVariable(
                    timestampOfTargetPropertyVariable
                )
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofAddNumbers(addNumbers)`.
         */
        fun expressionToEvaluate(addNumbers: AddNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofAddNumbers(addNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofSubtractNumbers(subtractNumbers)`.
         */
        fun expressionToEvaluate(subtractNumbers: SubtractNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofSubtractNumbers(subtractNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofMultiplyNumbers(multiplyNumbers)`.
         */
        fun expressionToEvaluate(multiplyNumbers: MultiplyNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofMultiplyNumbers(multiplyNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofDivideNumbers(divideNumbers)`.
         */
        fun expressionToEvaluate(divideNumbers: DivideNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofDivideNumbers(divideNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofRoundDownNumbers(roundDownNumbers)`.
         */
        fun expressionToEvaluate(roundDownNumbers: RoundDownNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofRoundDownNumbers(roundDownNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofRoundUpNumbers(roundUpNumbers)`.
         */
        fun expressionToEvaluate(roundUpNumbers: RoundUpNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofRoundUpNumbers(roundUpNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofRoundNearestNumbers(roundNearestNumbers)`.
         */
        fun expressionToEvaluate(roundNearestNumbers: RoundNearestNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofRoundNearestNumbers(roundNearestNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofUpperCase(upperCase)`.
         */
        fun expressionToEvaluate(upperCase: UpperCase) =
            expressionToEvaluate(ExpressionToEvaluate.ofUpperCase(upperCase))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofLowerCase(lowerCase)`.
         */
        fun expressionToEvaluate(lowerCase: LowerCase) =
            expressionToEvaluate(ExpressionToEvaluate.ofLowerCase(lowerCase))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofConcatStrings(concatStrings)`.
         */
        fun expressionToEvaluate(concatStrings: ConcatStrings) =
            expressionToEvaluate(ExpressionToEvaluate.ofConcatStrings(concatStrings))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofContains(contains)`.
         */
        fun expressionToEvaluate(contains: Contains) =
            expressionToEvaluate(ExpressionToEvaluate.ofContains(contains))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofBeginsWith(beginsWith)`.
         */
        fun expressionToEvaluate(beginsWith: BeginsWith) =
            expressionToEvaluate(ExpressionToEvaluate.ofBeginsWith(beginsWith))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofNumberToString(numberToString)`.
         */
        fun expressionToEvaluate(numberToString: NumberToString) =
            expressionToEvaluate(ExpressionToEvaluate.ofNumberToString(numberToString))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofParseNumber(parseNumber)`.
         */
        fun expressionToEvaluate(parseNumber: ParseNumber) =
            expressionToEvaluate(ExpressionToEvaluate.ofParseNumber(parseNumber))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofFetchExchangeRate(fetchExchangeRate)`.
         */
        fun expressionToEvaluate(fetchExchangeRate: FetchExchangeRate) =
            expressionToEvaluate(ExpressionToEvaluate.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun expressionToEvaluate(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun expressionToEvaluate(
            fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
        ) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofFetchSingleCurrencyPortalCurrency(
                    fetchSingleCurrencyPortalCurrency
                )
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofDatedExchangeRate(datedExchangeRate)`.
         */
        fun expressionToEvaluate(datedExchangeRate: DatedExchangeRate) =
            expressionToEvaluate(ExpressionToEvaluate.ofDatedExchangeRate(datedExchangeRate))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofPipelineProbability(pipelineProbability)`.
         */
        fun expressionToEvaluate(pipelineProbability: PipelineProbability) =
            expressionToEvaluate(ExpressionToEvaluate.ofPipelineProbability(pipelineProbability))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofMaxNumbers(maxNumbers)`.
         */
        fun expressionToEvaluate(maxNumbers: MaxNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofMaxNumbers(maxNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofMinNumbers(minNumbers)`.
         */
        fun expressionToEvaluate(minNumbers: MinNumbers) =
            expressionToEvaluate(ExpressionToEvaluate.ofMinNumbers(minNumbers))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofLessThan(lessThan)`.
         */
        fun expressionToEvaluate(lessThan: LessThan) =
            expressionToEvaluate(ExpressionToEvaluate.ofLessThan(lessThan))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofLessThanOrEqual(lessThanOrEqual)`.
         */
        fun expressionToEvaluate(lessThanOrEqual: LessThanOrEqual) =
            expressionToEvaluate(ExpressionToEvaluate.ofLessThanOrEqual(lessThanOrEqual))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofMoreThan(moreThan)`.
         */
        fun expressionToEvaluate(moreThan: MoreThan) =
            expressionToEvaluate(ExpressionToEvaluate.ofMoreThan(moreThan))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofMoreThanOrEqual(moreThanOrEqual)`.
         */
        fun expressionToEvaluate(moreThanOrEqual: MoreThanOrEqual) =
            expressionToEvaluate(ExpressionToEvaluate.ofMoreThanOrEqual(moreThanOrEqual))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofNumberEquals(numberEquals)`.
         */
        fun expressionToEvaluate(numberEquals: NumberEquals) =
            expressionToEvaluate(ExpressionToEvaluate.ofNumberEquals(numberEquals))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofStringEquals(stringEquals)`.
         */
        fun expressionToEvaluate(stringEquals: StringEquals) =
            expressionToEvaluate(ExpressionToEvaluate.ofStringEquals(stringEquals))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun expressionToEvaluate(isPipelineStageClosed: IsPipelineStageClosed) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofIsPipelineStageClosed(isPipelineStageClosed)
            )

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofNot(not)`. */
        fun expressionToEvaluate(not: Not) = expressionToEvaluate(ExpressionToEvaluate.ofNot(not))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofDate(date)`. */
        fun expressionToEvaluate(date: Date) =
            expressionToEvaluate(ExpressionToEvaluate.ofDate(date))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofMonth(month)`. */
        fun expressionToEvaluate(month: Month) =
            expressionToEvaluate(ExpressionToEvaluate.ofMonth(month))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofYear(year)`. */
        fun expressionToEvaluate(year: Year) =
            expressionToEvaluate(ExpressionToEvaluate.ofYear(year))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofNow(now)`. */
        fun expressionToEvaluate(now: Now) = expressionToEvaluate(ExpressionToEvaluate.ofNow(now))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofTimeBetween(timeBetween)`.
         */
        fun expressionToEvaluate(timeBetween: TimeBetween) =
            expressionToEvaluate(ExpressionToEvaluate.ofTimeBetween(timeBetween))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends)`.
         */
        fun expressionToEvaluate(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofPeriodToMonths(periodToMonths)`.
         */
        fun expressionToEvaluate(periodToMonths: PeriodToMonths) =
            expressionToEvaluate(ExpressionToEvaluate.ofPeriodToMonths(periodToMonths))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofPeriodToWeeks(periodToWeeks)`.
         */
        fun expressionToEvaluate(periodToWeeks: PeriodToWeeks) =
            expressionToEvaluate(ExpressionToEvaluate.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofAnd(and)`. */
        fun expressionToEvaluate(and: And) = expressionToEvaluate(ExpressionToEvaluate.ofAnd(and))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofOr(or)`. */
        fun expressionToEvaluate(or: Or) = expressionToEvaluate(ExpressionToEvaluate.ofOr(or))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofXor(xor)`. */
        fun expressionToEvaluate(xor: Xor) = expressionToEvaluate(ExpressionToEvaluate.ofXor(xor))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofIfString(ifString)`.
         */
        fun expressionToEvaluate(ifString: IfString) =
            expressionToEvaluate(ExpressionToEvaluate.ofIfString(ifString))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofIfNumber(ifNumber)`.
         */
        fun expressionToEvaluate(ifNumber: IfNumber) =
            expressionToEvaluate(ExpressionToEvaluate.ofIfNumber(ifNumber))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofIfBoolean(ifBoolean)`.
         */
        fun expressionToEvaluate(ifBoolean: IfBoolean) =
            expressionToEvaluate(ExpressionToEvaluate.ofIfBoolean(ifBoolean))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofIsPresent(isPresent)`.
         */
        fun expressionToEvaluate(isPresent: IsPresent) =
            expressionToEvaluate(ExpressionToEvaluate.ofIsPresent(isPresent))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofHasEmailReply(hasEmailReply)`.
         */
        fun expressionToEvaluate(hasEmailReply: HasEmailReply) =
            expressionToEvaluate(ExpressionToEvaluate.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun expressionToEvaluate(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofHasPlainTextEmailReply(hasPlainTextEmailReply)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun expressionToEvaluate(extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofExtractMostRecentEmailReplyHtml(
                    extractMostRecentEmailReplyHtml
                )
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun expressionToEvaluate(extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofExtractMostRecentEmailReplyText(
                    extractMostRecentEmailReplyText
                )
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun expressionToEvaluate(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofExtractMostRecentPlainTextEmailReply(
                    extractMostRecentPlainTextEmailReply
                )
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofSetContainsString(setContainsString)`.
         */
        fun expressionToEvaluate(setContainsString: SetContainsString) =
            expressionToEvaluate(ExpressionToEvaluate.ofSetContainsString(setContainsString))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofIsEngagementType(isEngagementType)`.
         */
        fun expressionToEvaluate(isEngagementType: IsEngagementType) =
            expressionToEvaluate(ExpressionToEvaluate.ofIsEngagementType(isEngagementType))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofFormatFullName(formatFullName)`.
         */
        fun expressionToEvaluate(formatFullName: FormatFullName) =
            expressionToEvaluate(ExpressionToEvaluate.ofFormatFullName(formatFullName))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofFormatPhoneNumber(formatPhoneNumber)`.
         */
        fun expressionToEvaluate(formatPhoneNumber: FormatPhoneNumber) =
            expressionToEvaluate(ExpressionToEvaluate.ofFormatPhoneNumber(formatPhoneNumber))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber)`.
         */
        fun expressionToEvaluate(formatSearchablePhoneNumber: FormatSearchablePhoneNumber) =
            expressionToEvaluate(
                ExpressionToEvaluate.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber)
            )

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofAbsoluteValue(absoluteValue)`.
         */
        fun expressionToEvaluate(absoluteValue: AbsoluteValue) =
            expressionToEvaluate(ExpressionToEvaluate.ofAbsoluteValue(absoluteValue))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofSquareRoot(squareRoot)`.
         */
        fun expressionToEvaluate(squareRoot: SquareRoot) =
            expressionToEvaluate(ExpressionToEvaluate.ofSquareRoot(squareRoot))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofPower(power)`. */
        fun expressionToEvaluate(power: Power) =
            expressionToEvaluate(ExpressionToEvaluate.ofPower(power))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofSubstring(substring)`.
         */
        fun expressionToEvaluate(substring: Substring) =
            expressionToEvaluate(ExpressionToEvaluate.ofSubstring(substring))

        /** Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofEuler(euler)`. */
        fun expressionToEvaluate(euler: Euler) =
            expressionToEvaluate(ExpressionToEvaluate.ofEuler(euler))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofStringLength(stringLength)`.
         */
        fun expressionToEvaluate(stringLength: StringLength) =
            expressionToEvaluate(ExpressionToEvaluate.ofStringLength(stringLength))

        /**
         * Alias for calling [expressionToEvaluate] with `ExpressionToEvaluate.ofAddTime(addTime)`.
         */
        fun expressionToEvaluate(addTime: AddTime) =
            expressionToEvaluate(ExpressionToEvaluate.ofAddTime(addTime))

        /**
         * Alias for calling [expressionToEvaluate] with
         * `ExpressionToEvaluate.ofSubtractTime(subtractTime)`.
         */
        fun expressionToEvaluate(subtractTime: SubtractTime) =
            expressionToEvaluate(ExpressionToEvaluate.ofSubtractTime(subtractTime))

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

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
         * Returns an immutable instance of [IsPresent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expressionToEvaluate()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IsPresent =
            IsPresent(
                checkRequired("expressionToEvaluate", expressionToEvaluate),
                checkRequired("operator", operator),
                propertyName,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IsPresent = apply {
        if (validated) {
            return@apply
        }

        expressionToEvaluate().validate()
        operator().validate()
        propertyName()
        value()
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
        (expressionToEvaluate.asKnown().getOrNull()?.validity() ?: 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (propertyName.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = ExpressionToEvaluate.Deserializer::class)
    @JsonSerialize(using = ExpressionToEvaluate.Serializer::class)
    class ExpressionToEvaluate
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

        fun validate(): ExpressionToEvaluate = apply {
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

            return other is ExpressionToEvaluate &&
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
                constantBoolean != null -> "ExpressionToEvaluate{constantBoolean=$constantBoolean}"
                constantNumber != null -> "ExpressionToEvaluate{constantNumber=$constantNumber}"
                constantString != null -> "ExpressionToEvaluate{constantString=$constantString}"
                booleanPropertyVariable != null ->
                    "ExpressionToEvaluate{booleanPropertyVariable=$booleanPropertyVariable}"
                stringPropertyVariable != null ->
                    "ExpressionToEvaluate{stringPropertyVariable=$stringPropertyVariable}"
                numberPropertyVariable != null ->
                    "ExpressionToEvaluate{numberPropertyVariable=$numberPropertyVariable}"
                timestampOfPropertyVariable != null ->
                    "ExpressionToEvaluate{timestampOfPropertyVariable=$timestampOfPropertyVariable}"
                booleanTargetPropertyVariable != null ->
                    "ExpressionToEvaluate{booleanTargetPropertyVariable=$booleanTargetPropertyVariable}"
                stringTargetPropertyVariable != null ->
                    "ExpressionToEvaluate{stringTargetPropertyVariable=$stringTargetPropertyVariable}"
                numberTargetPropertyVariable != null ->
                    "ExpressionToEvaluate{numberTargetPropertyVariable=$numberTargetPropertyVariable}"
                timestampOfTargetPropertyVariable != null ->
                    "ExpressionToEvaluate{timestampOfTargetPropertyVariable=$timestampOfTargetPropertyVariable}"
                addNumbers != null -> "ExpressionToEvaluate{addNumbers=$addNumbers}"
                subtractNumbers != null -> "ExpressionToEvaluate{subtractNumbers=$subtractNumbers}"
                multiplyNumbers != null -> "ExpressionToEvaluate{multiplyNumbers=$multiplyNumbers}"
                divideNumbers != null -> "ExpressionToEvaluate{divideNumbers=$divideNumbers}"
                roundDownNumbers != null ->
                    "ExpressionToEvaluate{roundDownNumbers=$roundDownNumbers}"
                roundUpNumbers != null -> "ExpressionToEvaluate{roundUpNumbers=$roundUpNumbers}"
                roundNearestNumbers != null ->
                    "ExpressionToEvaluate{roundNearestNumbers=$roundNearestNumbers}"
                upperCase != null -> "ExpressionToEvaluate{upperCase=$upperCase}"
                lowerCase != null -> "ExpressionToEvaluate{lowerCase=$lowerCase}"
                concatStrings != null -> "ExpressionToEvaluate{concatStrings=$concatStrings}"
                contains != null -> "ExpressionToEvaluate{contains=$contains}"
                beginsWith != null -> "ExpressionToEvaluate{beginsWith=$beginsWith}"
                numberToString != null -> "ExpressionToEvaluate{numberToString=$numberToString}"
                parseNumber != null -> "ExpressionToEvaluate{parseNumber=$parseNumber}"
                fetchExchangeRate != null ->
                    "ExpressionToEvaluate{fetchExchangeRate=$fetchExchangeRate}"
                fetchCurrencyDecimalPlaces != null ->
                    "ExpressionToEvaluate{fetchCurrencyDecimalPlaces=$fetchCurrencyDecimalPlaces}"
                fetchSingleCurrencyPortalCurrency != null ->
                    "ExpressionToEvaluate{fetchSingleCurrencyPortalCurrency=$fetchSingleCurrencyPortalCurrency}"
                datedExchangeRate != null ->
                    "ExpressionToEvaluate{datedExchangeRate=$datedExchangeRate}"
                pipelineProbability != null ->
                    "ExpressionToEvaluate{pipelineProbability=$pipelineProbability}"
                maxNumbers != null -> "ExpressionToEvaluate{maxNumbers=$maxNumbers}"
                minNumbers != null -> "ExpressionToEvaluate{minNumbers=$minNumbers}"
                lessThan != null -> "ExpressionToEvaluate{lessThan=$lessThan}"
                lessThanOrEqual != null -> "ExpressionToEvaluate{lessThanOrEqual=$lessThanOrEqual}"
                moreThan != null -> "ExpressionToEvaluate{moreThan=$moreThan}"
                moreThanOrEqual != null -> "ExpressionToEvaluate{moreThanOrEqual=$moreThanOrEqual}"
                numberEquals != null -> "ExpressionToEvaluate{numberEquals=$numberEquals}"
                stringEquals != null -> "ExpressionToEvaluate{stringEquals=$stringEquals}"
                isPipelineStageClosed != null ->
                    "ExpressionToEvaluate{isPipelineStageClosed=$isPipelineStageClosed}"
                not != null -> "ExpressionToEvaluate{not=$not}"
                date != null -> "ExpressionToEvaluate{date=$date}"
                month != null -> "ExpressionToEvaluate{month=$month}"
                year != null -> "ExpressionToEvaluate{year=$year}"
                now != null -> "ExpressionToEvaluate{now=$now}"
                timeBetween != null -> "ExpressionToEvaluate{timeBetween=$timeBetween}"
                timeBetweenSkipWeekends != null ->
                    "ExpressionToEvaluate{timeBetweenSkipWeekends=$timeBetweenSkipWeekends}"
                periodToMonths != null -> "ExpressionToEvaluate{periodToMonths=$periodToMonths}"
                periodToWeeks != null -> "ExpressionToEvaluate{periodToWeeks=$periodToWeeks}"
                and != null -> "ExpressionToEvaluate{and=$and}"
                or != null -> "ExpressionToEvaluate{or=$or}"
                xor != null -> "ExpressionToEvaluate{xor=$xor}"
                ifString != null -> "ExpressionToEvaluate{ifString=$ifString}"
                ifNumber != null -> "ExpressionToEvaluate{ifNumber=$ifNumber}"
                ifBoolean != null -> "ExpressionToEvaluate{ifBoolean=$ifBoolean}"
                isPresent != null -> "ExpressionToEvaluate{isPresent=$isPresent}"
                hasEmailReply != null -> "ExpressionToEvaluate{hasEmailReply=$hasEmailReply}"
                hasPlainTextEmailReply != null ->
                    "ExpressionToEvaluate{hasPlainTextEmailReply=$hasPlainTextEmailReply}"
                extractMostRecentEmailReplyHtml != null ->
                    "ExpressionToEvaluate{extractMostRecentEmailReplyHtml=$extractMostRecentEmailReplyHtml}"
                extractMostRecentEmailReplyText != null ->
                    "ExpressionToEvaluate{extractMostRecentEmailReplyText=$extractMostRecentEmailReplyText}"
                extractMostRecentPlainTextEmailReply != null ->
                    "ExpressionToEvaluate{extractMostRecentPlainTextEmailReply=$extractMostRecentPlainTextEmailReply}"
                setContainsString != null ->
                    "ExpressionToEvaluate{setContainsString=$setContainsString}"
                isEngagementType != null ->
                    "ExpressionToEvaluate{isEngagementType=$isEngagementType}"
                formatFullName != null -> "ExpressionToEvaluate{formatFullName=$formatFullName}"
                formatPhoneNumber != null ->
                    "ExpressionToEvaluate{formatPhoneNumber=$formatPhoneNumber}"
                formatSearchablePhoneNumber != null ->
                    "ExpressionToEvaluate{formatSearchablePhoneNumber=$formatSearchablePhoneNumber}"
                absoluteValue != null -> "ExpressionToEvaluate{absoluteValue=$absoluteValue}"
                squareRoot != null -> "ExpressionToEvaluate{squareRoot=$squareRoot}"
                power != null -> "ExpressionToEvaluate{power=$power}"
                substring != null -> "ExpressionToEvaluate{substring=$substring}"
                euler != null -> "ExpressionToEvaluate{euler=$euler}"
                stringLength != null -> "ExpressionToEvaluate{stringLength=$stringLength}"
                addTime != null -> "ExpressionToEvaluate{addTime=$addTime}"
                subtractTime != null -> "ExpressionToEvaluate{subtractTime=$subtractTime}"
                _json != null -> "ExpressionToEvaluate{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ExpressionToEvaluate")
            }

        companion object {

            @JvmStatic
            fun ofConstantBoolean(constantBoolean: ConstantBoolean) =
                ExpressionToEvaluate(constantBoolean = constantBoolean)

            @JvmStatic
            fun ofConstantNumber(constantNumber: ConstantNumber) =
                ExpressionToEvaluate(constantNumber = constantNumber)

            @JvmStatic
            fun ofConstantString(constantString: ConstantString) =
                ExpressionToEvaluate(constantString = constantString)

            @JvmStatic
            fun ofBooleanPropertyVariable(booleanPropertyVariable: BooleanPropertyVariable) =
                ExpressionToEvaluate(booleanPropertyVariable = booleanPropertyVariable)

            @JvmStatic
            fun ofStringPropertyVariable(stringPropertyVariable: StringPropertyVariable) =
                ExpressionToEvaluate(stringPropertyVariable = stringPropertyVariable)

            @JvmStatic
            fun ofNumberPropertyVariable(numberPropertyVariable: NumberPropertyVariable) =
                ExpressionToEvaluate(numberPropertyVariable = numberPropertyVariable)

            @JvmStatic
            fun ofTimestampOfPropertyVariable(
                timestampOfPropertyVariable: TimestampOfPropertyVariable
            ) = ExpressionToEvaluate(timestampOfPropertyVariable = timestampOfPropertyVariable)

            @JvmStatic
            fun ofBooleanTargetPropertyVariable(
                booleanTargetPropertyVariable: BooleanTargetPropertyVariable
            ) = ExpressionToEvaluate(booleanTargetPropertyVariable = booleanTargetPropertyVariable)

            @JvmStatic
            fun ofStringTargetPropertyVariable(
                stringTargetPropertyVariable: StringTargetPropertyVariable
            ) = ExpressionToEvaluate(stringTargetPropertyVariable = stringTargetPropertyVariable)

            @JvmStatic
            fun ofNumberTargetPropertyVariable(
                numberTargetPropertyVariable: NumberTargetPropertyVariable
            ) = ExpressionToEvaluate(numberTargetPropertyVariable = numberTargetPropertyVariable)

            @JvmStatic
            fun ofTimestampOfTargetPropertyVariable(
                timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
            ) =
                ExpressionToEvaluate(
                    timestampOfTargetPropertyVariable = timestampOfTargetPropertyVariable
                )

            @JvmStatic
            fun ofAddNumbers(addNumbers: AddNumbers) = ExpressionToEvaluate(addNumbers = addNumbers)

            @JvmStatic
            fun ofSubtractNumbers(subtractNumbers: SubtractNumbers) =
                ExpressionToEvaluate(subtractNumbers = subtractNumbers)

            @JvmStatic
            fun ofMultiplyNumbers(multiplyNumbers: MultiplyNumbers) =
                ExpressionToEvaluate(multiplyNumbers = multiplyNumbers)

            @JvmStatic
            fun ofDivideNumbers(divideNumbers: DivideNumbers) =
                ExpressionToEvaluate(divideNumbers = divideNumbers)

            @JvmStatic
            fun ofRoundDownNumbers(roundDownNumbers: RoundDownNumbers) =
                ExpressionToEvaluate(roundDownNumbers = roundDownNumbers)

            @JvmStatic
            fun ofRoundUpNumbers(roundUpNumbers: RoundUpNumbers) =
                ExpressionToEvaluate(roundUpNumbers = roundUpNumbers)

            @JvmStatic
            fun ofRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers) =
                ExpressionToEvaluate(roundNearestNumbers = roundNearestNumbers)

            @JvmStatic
            fun ofUpperCase(upperCase: UpperCase) = ExpressionToEvaluate(upperCase = upperCase)

            @JvmStatic
            fun ofLowerCase(lowerCase: LowerCase) = ExpressionToEvaluate(lowerCase = lowerCase)

            @JvmStatic
            fun ofConcatStrings(concatStrings: ConcatStrings) =
                ExpressionToEvaluate(concatStrings = concatStrings)

            @JvmStatic
            fun ofContains(contains: Contains) = ExpressionToEvaluate(contains = contains)

            @JvmStatic
            fun ofBeginsWith(beginsWith: BeginsWith) = ExpressionToEvaluate(beginsWith = beginsWith)

            @JvmStatic
            fun ofNumberToString(numberToString: NumberToString) =
                ExpressionToEvaluate(numberToString = numberToString)

            @JvmStatic
            fun ofParseNumber(parseNumber: ParseNumber) =
                ExpressionToEvaluate(parseNumber = parseNumber)

            @JvmStatic
            fun ofFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) =
                ExpressionToEvaluate(fetchExchangeRate = fetchExchangeRate)

            @JvmStatic
            fun ofFetchCurrencyDecimalPlaces(
                fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
            ) = ExpressionToEvaluate(fetchCurrencyDecimalPlaces = fetchCurrencyDecimalPlaces)

            @JvmStatic
            fun ofFetchSingleCurrencyPortalCurrency(
                fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
            ) =
                ExpressionToEvaluate(
                    fetchSingleCurrencyPortalCurrency = fetchSingleCurrencyPortalCurrency
                )

            @JvmStatic
            fun ofDatedExchangeRate(datedExchangeRate: DatedExchangeRate) =
                ExpressionToEvaluate(datedExchangeRate = datedExchangeRate)

            @JvmStatic
            fun ofPipelineProbability(pipelineProbability: PipelineProbability) =
                ExpressionToEvaluate(pipelineProbability = pipelineProbability)

            @JvmStatic
            fun ofMaxNumbers(maxNumbers: MaxNumbers) = ExpressionToEvaluate(maxNumbers = maxNumbers)

            @JvmStatic
            fun ofMinNumbers(minNumbers: MinNumbers) = ExpressionToEvaluate(minNumbers = minNumbers)

            @JvmStatic
            fun ofLessThan(lessThan: LessThan) = ExpressionToEvaluate(lessThan = lessThan)

            @JvmStatic
            fun ofLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
                ExpressionToEvaluate(lessThanOrEqual = lessThanOrEqual)

            @JvmStatic
            fun ofMoreThan(moreThan: MoreThan) = ExpressionToEvaluate(moreThan = moreThan)

            @JvmStatic
            fun ofMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
                ExpressionToEvaluate(moreThanOrEqual = moreThanOrEqual)

            @JvmStatic
            fun ofNumberEquals(numberEquals: NumberEquals) =
                ExpressionToEvaluate(numberEquals = numberEquals)

            @JvmStatic
            fun ofStringEquals(stringEquals: StringEquals) =
                ExpressionToEvaluate(stringEquals = stringEquals)

            @JvmStatic
            fun ofIsPipelineStageClosed(isPipelineStageClosed: IsPipelineStageClosed) =
                ExpressionToEvaluate(isPipelineStageClosed = isPipelineStageClosed)

            @JvmStatic fun ofNot(not: Not) = ExpressionToEvaluate(not = not)

            @JvmStatic fun ofDate(date: Date) = ExpressionToEvaluate(date = date)

            @JvmStatic fun ofMonth(month: Month) = ExpressionToEvaluate(month = month)

            @JvmStatic fun ofYear(year: Year) = ExpressionToEvaluate(year = year)

            @JvmStatic fun ofNow(now: Now) = ExpressionToEvaluate(now = now)

            @JvmStatic
            fun ofTimeBetween(timeBetween: TimeBetween) =
                ExpressionToEvaluate(timeBetween = timeBetween)

            @JvmStatic
            fun ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
                ExpressionToEvaluate(timeBetweenSkipWeekends = timeBetweenSkipWeekends)

            @JvmStatic
            fun ofPeriodToMonths(periodToMonths: PeriodToMonths) =
                ExpressionToEvaluate(periodToMonths = periodToMonths)

            @JvmStatic
            fun ofPeriodToWeeks(periodToWeeks: PeriodToWeeks) =
                ExpressionToEvaluate(periodToWeeks = periodToWeeks)

            @JvmStatic fun ofAnd(and: And) = ExpressionToEvaluate(and = and)

            @JvmStatic fun ofOr(or: Or) = ExpressionToEvaluate(or = or)

            @JvmStatic fun ofXor(xor: Xor) = ExpressionToEvaluate(xor = xor)

            @JvmStatic
            fun ofIfString(ifString: IfString) = ExpressionToEvaluate(ifString = ifString)

            @JvmStatic
            fun ofIfNumber(ifNumber: IfNumber) = ExpressionToEvaluate(ifNumber = ifNumber)

            @JvmStatic
            fun ofIfBoolean(ifBoolean: IfBoolean) = ExpressionToEvaluate(ifBoolean = ifBoolean)

            @JvmStatic
            fun ofIsPresent(isPresent: IsPresent) = ExpressionToEvaluate(isPresent = isPresent)

            @JvmStatic
            fun ofHasEmailReply(hasEmailReply: HasEmailReply) =
                ExpressionToEvaluate(hasEmailReply = hasEmailReply)

            @JvmStatic
            fun ofHasPlainTextEmailReply(hasPlainTextEmailReply: HasPlainTextEmailReply) =
                ExpressionToEvaluate(hasPlainTextEmailReply = hasPlainTextEmailReply)

            @JvmStatic
            fun ofExtractMostRecentEmailReplyHtml(
                extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
            ) =
                ExpressionToEvaluate(
                    extractMostRecentEmailReplyHtml = extractMostRecentEmailReplyHtml
                )

            @JvmStatic
            fun ofExtractMostRecentEmailReplyText(
                extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
            ) =
                ExpressionToEvaluate(
                    extractMostRecentEmailReplyText = extractMostRecentEmailReplyText
                )

            @JvmStatic
            fun ofExtractMostRecentPlainTextEmailReply(
                extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
            ) =
                ExpressionToEvaluate(
                    extractMostRecentPlainTextEmailReply = extractMostRecentPlainTextEmailReply
                )

            @JvmStatic
            fun ofSetContainsString(setContainsString: SetContainsString) =
                ExpressionToEvaluate(setContainsString = setContainsString)

            @JvmStatic
            fun ofIsEngagementType(isEngagementType: IsEngagementType) =
                ExpressionToEvaluate(isEngagementType = isEngagementType)

            @JvmStatic
            fun ofFormatFullName(formatFullName: FormatFullName) =
                ExpressionToEvaluate(formatFullName = formatFullName)

            @JvmStatic
            fun ofFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) =
                ExpressionToEvaluate(formatPhoneNumber = formatPhoneNumber)

            @JvmStatic
            fun ofFormatSearchablePhoneNumber(
                formatSearchablePhoneNumber: FormatSearchablePhoneNumber
            ) = ExpressionToEvaluate(formatSearchablePhoneNumber = formatSearchablePhoneNumber)

            @JvmStatic
            fun ofAbsoluteValue(absoluteValue: AbsoluteValue) =
                ExpressionToEvaluate(absoluteValue = absoluteValue)

            @JvmStatic
            fun ofSquareRoot(squareRoot: SquareRoot) = ExpressionToEvaluate(squareRoot = squareRoot)

            @JvmStatic fun ofPower(power: Power) = ExpressionToEvaluate(power = power)

            @JvmStatic
            fun ofSubstring(substring: Substring) = ExpressionToEvaluate(substring = substring)

            @JvmStatic fun ofEuler(euler: Euler) = ExpressionToEvaluate(euler = euler)

            @JvmStatic
            fun ofStringLength(stringLength: StringLength) =
                ExpressionToEvaluate(stringLength = stringLength)

            @JvmStatic fun ofAddTime(addTime: AddTime) = ExpressionToEvaluate(addTime = addTime)

            @JvmStatic
            fun ofSubtractTime(subtractTime: SubtractTime) =
                ExpressionToEvaluate(subtractTime = subtractTime)
        }

        /**
         * An interface that defines how to map each variant of [ExpressionToEvaluate] to a value of
         * type [T].
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
             * Maps an unknown variant of [ExpressionToEvaluate] to a value of type [T].
             *
             * An instance of [ExpressionToEvaluate] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown ExpressionToEvaluate: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<ExpressionToEvaluate>(ExpressionToEvaluate::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ExpressionToEvaluate {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ConstantBoolean>())?.let {
                                ExpressionToEvaluate(constantBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantNumber>())?.let {
                                ExpressionToEvaluate(constantNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantString>())?.let {
                                ExpressionToEvaluate(constantString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BooleanPropertyVariable>())?.let {
                                ExpressionToEvaluate(booleanPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringPropertyVariable>())?.let {
                                ExpressionToEvaluate(stringPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberPropertyVariable>())?.let {
                                ExpressionToEvaluate(numberPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimestampOfPropertyVariable>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        timestampOfPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<BooleanTargetPropertyVariable>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        booleanTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<StringTargetPropertyVariable>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        stringTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<NumberTargetPropertyVariable>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        numberTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<TimestampOfTargetPropertyVariable>(),
                                )
                                ?.let {
                                    ExpressionToEvaluate(
                                        timestampOfTargetPropertyVariable = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<AddNumbers>())?.let {
                                ExpressionToEvaluate(addNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractNumbers>())?.let {
                                ExpressionToEvaluate(subtractNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultiplyNumbers>())?.let {
                                ExpressionToEvaluate(multiplyNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DivideNumbers>())?.let {
                                ExpressionToEvaluate(divideNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundDownNumbers>())?.let {
                                ExpressionToEvaluate(roundDownNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundUpNumbers>())?.let {
                                ExpressionToEvaluate(roundUpNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundNearestNumbers>())?.let {
                                ExpressionToEvaluate(roundNearestNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UpperCase>())?.let {
                                ExpressionToEvaluate(upperCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LowerCase>())?.let {
                                ExpressionToEvaluate(lowerCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConcatStrings>())?.let {
                                ExpressionToEvaluate(concatStrings = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Contains>())?.let {
                                ExpressionToEvaluate(contains = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BeginsWith>())?.let {
                                ExpressionToEvaluate(beginsWith = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberToString>())?.let {
                                ExpressionToEvaluate(numberToString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ParseNumber>())?.let {
                                ExpressionToEvaluate(parseNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchExchangeRate>())?.let {
                                ExpressionToEvaluate(fetchExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchCurrencyDecimalPlaces>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        fetchCurrencyDecimalPlaces = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<FetchSingleCurrencyPortalCurrency>(),
                                )
                                ?.let {
                                    ExpressionToEvaluate(
                                        fetchSingleCurrencyPortalCurrency = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<DatedExchangeRate>())?.let {
                                ExpressionToEvaluate(datedExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PipelineProbability>())?.let {
                                ExpressionToEvaluate(pipelineProbability = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MaxNumbers>())?.let {
                                ExpressionToEvaluate(maxNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MinNumbers>())?.let {
                                ExpressionToEvaluate(minNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThan>())?.let {
                                ExpressionToEvaluate(lessThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThanOrEqual>())?.let {
                                ExpressionToEvaluate(lessThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThan>())?.let {
                                ExpressionToEvaluate(moreThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThanOrEqual>())?.let {
                                ExpressionToEvaluate(moreThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberEquals>())?.let {
                                ExpressionToEvaluate(numberEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringEquals>())?.let {
                                ExpressionToEvaluate(stringEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPipelineStageClosed>())?.let {
                                ExpressionToEvaluate(isPipelineStageClosed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Not>())?.let {
                                ExpressionToEvaluate(not = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Date>())?.let {
                                ExpressionToEvaluate(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Month>())?.let {
                                ExpressionToEvaluate(month = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Year>())?.let {
                                ExpressionToEvaluate(year = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Now>())?.let {
                                ExpressionToEvaluate(now = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetween>())?.let {
                                ExpressionToEvaluate(timeBetween = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetweenSkipWeekends>())?.let {
                                ExpressionToEvaluate(timeBetweenSkipWeekends = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToMonths>())?.let {
                                ExpressionToEvaluate(periodToMonths = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToWeeks>())?.let {
                                ExpressionToEvaluate(periodToWeeks = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<And>())?.let {
                                ExpressionToEvaluate(and = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Or>())?.let {
                                ExpressionToEvaluate(or = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Xor>())?.let {
                                ExpressionToEvaluate(xor = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfString>())?.let {
                                ExpressionToEvaluate(ifString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfNumber>())?.let {
                                ExpressionToEvaluate(ifNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfBoolean>())?.let {
                                ExpressionToEvaluate(ifBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPresent>())?.let {
                                ExpressionToEvaluate(isPresent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasEmailReply>())?.let {
                                ExpressionToEvaluate(hasEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasPlainTextEmailReply>())?.let {
                                ExpressionToEvaluate(hasPlainTextEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyHtml>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        extractMostRecentEmailReplyHtml = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyText>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        extractMostRecentEmailReplyText = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ExtractMostRecentPlainTextEmailReply>(),
                                )
                                ?.let {
                                    ExpressionToEvaluate(
                                        extractMostRecentPlainTextEmailReply = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<SetContainsString>())?.let {
                                ExpressionToEvaluate(setContainsString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsEngagementType>())?.let {
                                ExpressionToEvaluate(isEngagementType = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatFullName>())?.let {
                                ExpressionToEvaluate(formatFullName = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatPhoneNumber>())?.let {
                                ExpressionToEvaluate(formatPhoneNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatSearchablePhoneNumber>())
                                ?.let {
                                    ExpressionToEvaluate(
                                        formatSearchablePhoneNumber = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<AbsoluteValue>())?.let {
                                ExpressionToEvaluate(absoluteValue = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SquareRoot>())?.let {
                                ExpressionToEvaluate(squareRoot = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Power>())?.let {
                                ExpressionToEvaluate(power = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Substring>())?.let {
                                ExpressionToEvaluate(substring = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Euler>())?.let {
                                ExpressionToEvaluate(euler = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringLength>())?.let {
                                ExpressionToEvaluate(stringLength = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AddTime>())?.let {
                                ExpressionToEvaluate(addTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractTime>())?.let {
                                ExpressionToEvaluate(subtractTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ExpressionToEvaluate(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<ExpressionToEvaluate>(ExpressionToEvaluate::class) {

            override fun serialize(
                value: ExpressionToEvaluate,
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
                    else -> throw IllegalStateException("Invalid ExpressionToEvaluate")
                }
            }
        }
    }

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

            @JvmField val IS_PRESENT = of("IS_PRESENT")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IS_PRESENT
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
            IS_PRESENT,
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
                IS_PRESENT -> Value.IS_PRESENT
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
                IS_PRESENT -> Known.IS_PRESENT
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IsPresent &&
            expressionToEvaluate == other.expressionToEvaluate &&
            operator == other.operator &&
            propertyName == other.propertyName &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expressionToEvaluate, operator, propertyName, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IsPresent{expressionToEvaluate=$expressionToEvaluate, operator=$operator, propertyName=$propertyName, value=$value, additionalProperties=$additionalProperties}"
}
