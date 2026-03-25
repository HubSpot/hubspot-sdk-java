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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Date
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val operator: JsonField<Operator>,
    private val inputs: JsonField<List<Input>>,
    private val propertyName: JsonField<String>,
    private val value: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonField<List<Input>> = JsonMissing.of(),
        @JsonProperty("propertyName")
        @ExcludeMissing
        propertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
    ) : this(operator, inputs, propertyName, value, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputs(): Optional<List<Input>> = inputs.getOptional("inputs")

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
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<Input>> = inputs

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
         * Returns a mutable builder for constructing an instance of [Date].
         *
         * The following fields are required:
         * ```java
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Date]. */
    class Builder internal constructor() {

        private var operator: JsonField<Operator>? = null
        private var inputs: JsonField<MutableList<Input>>? = null
        private var propertyName: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(date: Date) = apply {
            operator = date.operator
            inputs = date.inputs.map { it.toMutableList() }
            propertyName = date.propertyName
            value = date.value
            additionalProperties = date.additionalProperties.toMutableMap()
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

        fun inputs(inputs: List<Input>) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<Input>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputs(inputs: JsonField<List<Input>>) = apply {
            this.inputs = inputs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Input] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: Input) = apply {
            inputs =
                (inputs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputs", it).add(input)
                }
        }

        /** Alias for calling [addInput] with `Input.ofConstantBoolean(constantBoolean)`. */
        fun addInput(constantBoolean: ConstantBoolean) =
            addInput(Input.ofConstantBoolean(constantBoolean))

        /** Alias for calling [addInput] with `Input.ofConstantNumber(constantNumber)`. */
        fun addInput(constantNumber: ConstantNumber) =
            addInput(Input.ofConstantNumber(constantNumber))

        /** Alias for calling [addInput] with `Input.ofConstantString(constantString)`. */
        fun addInput(constantString: ConstantString) =
            addInput(Input.ofConstantString(constantString))

        /**
         * Alias for calling [addInput] with
         * `Input.ofBooleanPropertyVariable(booleanPropertyVariable)`.
         */
        fun addInput(booleanPropertyVariable: BooleanPropertyVariable) =
            addInput(Input.ofBooleanPropertyVariable(booleanPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Input.ofStringPropertyVariable(stringPropertyVariable)`.
         */
        fun addInput(stringPropertyVariable: StringPropertyVariable) =
            addInput(Input.ofStringPropertyVariable(stringPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Input.ofNumberPropertyVariable(numberPropertyVariable)`.
         */
        fun addInput(numberPropertyVariable: NumberPropertyVariable) =
            addInput(Input.ofNumberPropertyVariable(numberPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Input.ofTimestampOfPropertyVariable(timestampOfPropertyVariable)`.
         */
        fun addInput(timestampOfPropertyVariable: TimestampOfPropertyVariable) =
            addInput(Input.ofTimestampOfPropertyVariable(timestampOfPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Input.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable)`.
         */
        fun addInput(booleanTargetPropertyVariable: BooleanTargetPropertyVariable) =
            addInput(Input.ofBooleanTargetPropertyVariable(booleanTargetPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Input.ofStringTargetPropertyVariable(stringTargetPropertyVariable)`.
         */
        fun addInput(stringTargetPropertyVariable: StringTargetPropertyVariable) =
            addInput(Input.ofStringTargetPropertyVariable(stringTargetPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Input.ofNumberTargetPropertyVariable(numberTargetPropertyVariable)`.
         */
        fun addInput(numberTargetPropertyVariable: NumberTargetPropertyVariable) =
            addInput(Input.ofNumberTargetPropertyVariable(numberTargetPropertyVariable))

        /**
         * Alias for calling [addInput] with
         * `Input.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)`.
         */
        fun addInput(timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable) =
            addInput(Input.ofTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable))

        /** Alias for calling [addInput] with `Input.ofAddNumbers(addNumbers)`. */
        fun addInput(addNumbers: AddNumbers) = addInput(Input.ofAddNumbers(addNumbers))

        /** Alias for calling [addInput] with `Input.ofSubtractNumbers(subtractNumbers)`. */
        fun addInput(subtractNumbers: SubtractNumbers) =
            addInput(Input.ofSubtractNumbers(subtractNumbers))

        /** Alias for calling [addInput] with `Input.ofMultiplyNumbers(multiplyNumbers)`. */
        fun addInput(multiplyNumbers: MultiplyNumbers) =
            addInput(Input.ofMultiplyNumbers(multiplyNumbers))

        /** Alias for calling [addInput] with `Input.ofDivideNumbers(divideNumbers)`. */
        fun addInput(divideNumbers: DivideNumbers) = addInput(Input.ofDivideNumbers(divideNumbers))

        /** Alias for calling [addInput] with `Input.ofRoundDownNumbers(roundDownNumbers)`. */
        fun addInput(roundDownNumbers: RoundDownNumbers) =
            addInput(Input.ofRoundDownNumbers(roundDownNumbers))

        /** Alias for calling [addInput] with `Input.ofRoundUpNumbers(roundUpNumbers)`. */
        fun addInput(roundUpNumbers: RoundUpNumbers) =
            addInput(Input.ofRoundUpNumbers(roundUpNumbers))

        /** Alias for calling [addInput] with `Input.ofRoundNearestNumbers(roundNearestNumbers)`. */
        fun addInput(roundNearestNumbers: RoundNearestNumbers) =
            addInput(Input.ofRoundNearestNumbers(roundNearestNumbers))

        /** Alias for calling [addInput] with `Input.ofUpperCase(upperCase)`. */
        fun addInput(upperCase: UpperCase) = addInput(Input.ofUpperCase(upperCase))

        /** Alias for calling [addInput] with `Input.ofLowerCase(lowerCase)`. */
        fun addInput(lowerCase: LowerCase) = addInput(Input.ofLowerCase(lowerCase))

        /** Alias for calling [addInput] with `Input.ofConcatStrings(concatStrings)`. */
        fun addInput(concatStrings: ConcatStrings) = addInput(Input.ofConcatStrings(concatStrings))

        /** Alias for calling [addInput] with `Input.ofContains(contains)`. */
        fun addInput(contains: Contains) = addInput(Input.ofContains(contains))

        /** Alias for calling [addInput] with `Input.ofBeginsWith(beginsWith)`. */
        fun addInput(beginsWith: BeginsWith) = addInput(Input.ofBeginsWith(beginsWith))

        /** Alias for calling [addInput] with `Input.ofNumberToString(numberToString)`. */
        fun addInput(numberToString: NumberToString) =
            addInput(Input.ofNumberToString(numberToString))

        /** Alias for calling [addInput] with `Input.ofParseNumber(parseNumber)`. */
        fun addInput(parseNumber: ParseNumber) = addInput(Input.ofParseNumber(parseNumber))

        /** Alias for calling [addInput] with `Input.ofFetchExchangeRate(fetchExchangeRate)`. */
        fun addInput(fetchExchangeRate: FetchExchangeRate) =
            addInput(Input.ofFetchExchangeRate(fetchExchangeRate))

        /**
         * Alias for calling [addInput] with
         * `Input.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces)`.
         */
        fun addInput(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            addInput(Input.ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces))

        /**
         * Alias for calling [addInput] with
         * `Input.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)`.
         */
        fun addInput(fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency) =
            addInput(Input.ofFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency))

        /** Alias for calling [addInput] with `Input.ofDatedExchangeRate(datedExchangeRate)`. */
        fun addInput(datedExchangeRate: DatedExchangeRate) =
            addInput(Input.ofDatedExchangeRate(datedExchangeRate))

        /** Alias for calling [addInput] with `Input.ofPipelineProbability(pipelineProbability)`. */
        fun addInput(pipelineProbability: PipelineProbability) =
            addInput(Input.ofPipelineProbability(pipelineProbability))

        /** Alias for calling [addInput] with `Input.ofMaxNumbers(maxNumbers)`. */
        fun addInput(maxNumbers: MaxNumbers) = addInput(Input.ofMaxNumbers(maxNumbers))

        /** Alias for calling [addInput] with `Input.ofMinNumbers(minNumbers)`. */
        fun addInput(minNumbers: MinNumbers) = addInput(Input.ofMinNumbers(minNumbers))

        /** Alias for calling [addInput] with `Input.ofLessThan(lessThan)`. */
        fun addInput(lessThan: LessThan) = addInput(Input.ofLessThan(lessThan))

        /** Alias for calling [addInput] with `Input.ofLessThanOrEqual(lessThanOrEqual)`. */
        fun addInput(lessThanOrEqual: LessThanOrEqual) =
            addInput(Input.ofLessThanOrEqual(lessThanOrEqual))

        /** Alias for calling [addInput] with `Input.ofMoreThan(moreThan)`. */
        fun addInput(moreThan: MoreThan) = addInput(Input.ofMoreThan(moreThan))

        /** Alias for calling [addInput] with `Input.ofMoreThanOrEqual(moreThanOrEqual)`. */
        fun addInput(moreThanOrEqual: MoreThanOrEqual) =
            addInput(Input.ofMoreThanOrEqual(moreThanOrEqual))

        /** Alias for calling [addInput] with `Input.ofNumberEquals(numberEquals)`. */
        fun addInput(numberEquals: NumberEquals) = addInput(Input.ofNumberEquals(numberEquals))

        /** Alias for calling [addInput] with `Input.ofStringEquals(stringEquals)`. */
        fun addInput(stringEquals: StringEquals) = addInput(Input.ofStringEquals(stringEquals))

        /**
         * Alias for calling [addInput] with `Input.ofIsPipelineStageClosed(isPipelineStageClosed)`.
         */
        fun addInput(isPipelineStageClosed: IsPipelineStageClosed) =
            addInput(Input.ofIsPipelineStageClosed(isPipelineStageClosed))

        /** Alias for calling [addInput] with `Input.ofNot(not)`. */
        fun addInput(not: Not) = addInput(Input.ofNot(not))

        /** Alias for calling [addInput] with `Input.ofDate(date)`. */
        fun addInput(date: Date) = addInput(Input.ofDate(date))

        /** Alias for calling [addInput] with `Input.ofMonth(month)`. */
        fun addInput(month: Month) = addInput(Input.ofMonth(month))

        /** Alias for calling [addInput] with `Input.ofYear(year)`. */
        fun addInput(year: Year) = addInput(Input.ofYear(year))

        /** Alias for calling [addInput] with `Input.ofNow(now)`. */
        fun addInput(now: Now) = addInput(Input.ofNow(now))

        /** Alias for calling [addInput] with `Input.ofTimeBetween(timeBetween)`. */
        fun addInput(timeBetween: TimeBetween) = addInput(Input.ofTimeBetween(timeBetween))

        /**
         * Alias for calling [addInput] with
         * `Input.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends)`.
         */
        fun addInput(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
            addInput(Input.ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends))

        /** Alias for calling [addInput] with `Input.ofPeriodToMonths(periodToMonths)`. */
        fun addInput(periodToMonths: PeriodToMonths) =
            addInput(Input.ofPeriodToMonths(periodToMonths))

        /** Alias for calling [addInput] with `Input.ofPeriodToWeeks(periodToWeeks)`. */
        fun addInput(periodToWeeks: PeriodToWeeks) = addInput(Input.ofPeriodToWeeks(periodToWeeks))

        /** Alias for calling [addInput] with `Input.ofAnd(and)`. */
        fun addInput(and: And) = addInput(Input.ofAnd(and))

        /** Alias for calling [addInput] with `Input.ofOr(or)`. */
        fun addInput(or: Or) = addInput(Input.ofOr(or))

        /** Alias for calling [addInput] with `Input.ofXor(xor)`. */
        fun addInput(xor: Xor) = addInput(Input.ofXor(xor))

        /** Alias for calling [addInput] with `Input.ofIfString(ifString)`. */
        fun addInput(ifString: IfString) = addInput(Input.ofIfString(ifString))

        /** Alias for calling [addInput] with `Input.ofIfNumber(ifNumber)`. */
        fun addInput(ifNumber: IfNumber) = addInput(Input.ofIfNumber(ifNumber))

        /** Alias for calling [addInput] with `Input.ofIfBoolean(ifBoolean)`. */
        fun addInput(ifBoolean: IfBoolean) = addInput(Input.ofIfBoolean(ifBoolean))

        /** Alias for calling [addInput] with `Input.ofIsPresent(isPresent)`. */
        fun addInput(isPresent: IsPresent) = addInput(Input.ofIsPresent(isPresent))

        /** Alias for calling [addInput] with `Input.ofHasEmailReply(hasEmailReply)`. */
        fun addInput(hasEmailReply: HasEmailReply) = addInput(Input.ofHasEmailReply(hasEmailReply))

        /**
         * Alias for calling [addInput] with
         * `Input.ofHasPlainTextEmailReply(hasPlainTextEmailReply)`.
         */
        fun addInput(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            addInput(Input.ofHasPlainTextEmailReply(hasPlainTextEmailReply))

        /**
         * Alias for calling [addInput] with
         * `Input.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml)`.
         */
        fun addInput(extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml) =
            addInput(Input.ofExtractMostRecentEmailReplyHtml(extractMostRecentEmailReplyHtml))

        /**
         * Alias for calling [addInput] with
         * `Input.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText)`.
         */
        fun addInput(extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText) =
            addInput(Input.ofExtractMostRecentEmailReplyText(extractMostRecentEmailReplyText))

        /**
         * Alias for calling [addInput] with
         * `Input.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)`.
         */
        fun addInput(extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply) =
            addInput(
                Input.ofExtractMostRecentPlainTextEmailReply(extractMostRecentPlainTextEmailReply)
            )

        /** Alias for calling [addInput] with `Input.ofSetContainsString(setContainsString)`. */
        fun addInput(setContainsString: SetContainsString) =
            addInput(Input.ofSetContainsString(setContainsString))

        /** Alias for calling [addInput] with `Input.ofIsEngagementType(isEngagementType)`. */
        fun addInput(isEngagementType: IsEngagementType) =
            addInput(Input.ofIsEngagementType(isEngagementType))

        /** Alias for calling [addInput] with `Input.ofFormatFullName(formatFullName)`. */
        fun addInput(formatFullName: FormatFullName) =
            addInput(Input.ofFormatFullName(formatFullName))

        /** Alias for calling [addInput] with `Input.ofFormatPhoneNumber(formatPhoneNumber)`. */
        fun addInput(formatPhoneNumber: FormatPhoneNumber) =
            addInput(Input.ofFormatPhoneNumber(formatPhoneNumber))

        /**
         * Alias for calling [addInput] with
         * `Input.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber)`.
         */
        fun addInput(formatSearchablePhoneNumber: FormatSearchablePhoneNumber) =
            addInput(Input.ofFormatSearchablePhoneNumber(formatSearchablePhoneNumber))

        /** Alias for calling [addInput] with `Input.ofAbsoluteValue(absoluteValue)`. */
        fun addInput(absoluteValue: AbsoluteValue) = addInput(Input.ofAbsoluteValue(absoluteValue))

        /** Alias for calling [addInput] with `Input.ofSquareRoot(squareRoot)`. */
        fun addInput(squareRoot: SquareRoot) = addInput(Input.ofSquareRoot(squareRoot))

        /** Alias for calling [addInput] with `Input.ofPower(power)`. */
        fun addInput(power: Power) = addInput(Input.ofPower(power))

        /** Alias for calling [addInput] with `Input.ofSubstring(substring)`. */
        fun addInput(substring: Substring) = addInput(Input.ofSubstring(substring))

        /** Alias for calling [addInput] with `Input.ofEuler(euler)`. */
        fun addInput(euler: Euler) = addInput(Input.ofEuler(euler))

        /** Alias for calling [addInput] with `Input.ofStringLength(stringLength)`. */
        fun addInput(stringLength: StringLength) = addInput(Input.ofStringLength(stringLength))

        /** Alias for calling [addInput] with `Input.ofAddTime(addTime)`. */
        fun addInput(addTime: AddTime) = addInput(Input.ofAddTime(addTime))

        /** Alias for calling [addInput] with `Input.ofSubtractTime(subtractTime)`. */
        fun addInput(subtractTime: SubtractTime) = addInput(Input.ofSubtractTime(subtractTime))

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
         * Returns an immutable instance of [Date].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Date =
            Date(
                checkRequired("operator", operator),
                (inputs ?: JsonMissing.of()).map { it.toImmutable() },
                propertyName,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Date = apply {
        if (validated) {
            return@apply
        }

        operator().validate()
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

            @JvmField val DATE = of("DATE")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            DATE
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
            DATE,
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
                DATE -> Value.DATE
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
                DATE -> Known.DATE
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

    @JsonDeserialize(using = Input.Deserializer::class)
    @JsonSerialize(using = Input.Serializer::class)
    class Input
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

        fun validate(): Input = apply {
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

            return other is Input &&
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
                constantBoolean != null -> "Input{constantBoolean=$constantBoolean}"
                constantNumber != null -> "Input{constantNumber=$constantNumber}"
                constantString != null -> "Input{constantString=$constantString}"
                booleanPropertyVariable != null ->
                    "Input{booleanPropertyVariable=$booleanPropertyVariable}"
                stringPropertyVariable != null ->
                    "Input{stringPropertyVariable=$stringPropertyVariable}"
                numberPropertyVariable != null ->
                    "Input{numberPropertyVariable=$numberPropertyVariable}"
                timestampOfPropertyVariable != null ->
                    "Input{timestampOfPropertyVariable=$timestampOfPropertyVariable}"
                booleanTargetPropertyVariable != null ->
                    "Input{booleanTargetPropertyVariable=$booleanTargetPropertyVariable}"
                stringTargetPropertyVariable != null ->
                    "Input{stringTargetPropertyVariable=$stringTargetPropertyVariable}"
                numberTargetPropertyVariable != null ->
                    "Input{numberTargetPropertyVariable=$numberTargetPropertyVariable}"
                timestampOfTargetPropertyVariable != null ->
                    "Input{timestampOfTargetPropertyVariable=$timestampOfTargetPropertyVariable}"
                addNumbers != null -> "Input{addNumbers=$addNumbers}"
                subtractNumbers != null -> "Input{subtractNumbers=$subtractNumbers}"
                multiplyNumbers != null -> "Input{multiplyNumbers=$multiplyNumbers}"
                divideNumbers != null -> "Input{divideNumbers=$divideNumbers}"
                roundDownNumbers != null -> "Input{roundDownNumbers=$roundDownNumbers}"
                roundUpNumbers != null -> "Input{roundUpNumbers=$roundUpNumbers}"
                roundNearestNumbers != null -> "Input{roundNearestNumbers=$roundNearestNumbers}"
                upperCase != null -> "Input{upperCase=$upperCase}"
                lowerCase != null -> "Input{lowerCase=$lowerCase}"
                concatStrings != null -> "Input{concatStrings=$concatStrings}"
                contains != null -> "Input{contains=$contains}"
                beginsWith != null -> "Input{beginsWith=$beginsWith}"
                numberToString != null -> "Input{numberToString=$numberToString}"
                parseNumber != null -> "Input{parseNumber=$parseNumber}"
                fetchExchangeRate != null -> "Input{fetchExchangeRate=$fetchExchangeRate}"
                fetchCurrencyDecimalPlaces != null ->
                    "Input{fetchCurrencyDecimalPlaces=$fetchCurrencyDecimalPlaces}"
                fetchSingleCurrencyPortalCurrency != null ->
                    "Input{fetchSingleCurrencyPortalCurrency=$fetchSingleCurrencyPortalCurrency}"
                datedExchangeRate != null -> "Input{datedExchangeRate=$datedExchangeRate}"
                pipelineProbability != null -> "Input{pipelineProbability=$pipelineProbability}"
                maxNumbers != null -> "Input{maxNumbers=$maxNumbers}"
                minNumbers != null -> "Input{minNumbers=$minNumbers}"
                lessThan != null -> "Input{lessThan=$lessThan}"
                lessThanOrEqual != null -> "Input{lessThanOrEqual=$lessThanOrEqual}"
                moreThan != null -> "Input{moreThan=$moreThan}"
                moreThanOrEqual != null -> "Input{moreThanOrEqual=$moreThanOrEqual}"
                numberEquals != null -> "Input{numberEquals=$numberEquals}"
                stringEquals != null -> "Input{stringEquals=$stringEquals}"
                isPipelineStageClosed != null ->
                    "Input{isPipelineStageClosed=$isPipelineStageClosed}"
                not != null -> "Input{not=$not}"
                date != null -> "Input{date=$date}"
                month != null -> "Input{month=$month}"
                year != null -> "Input{year=$year}"
                now != null -> "Input{now=$now}"
                timeBetween != null -> "Input{timeBetween=$timeBetween}"
                timeBetweenSkipWeekends != null ->
                    "Input{timeBetweenSkipWeekends=$timeBetweenSkipWeekends}"
                periodToMonths != null -> "Input{periodToMonths=$periodToMonths}"
                periodToWeeks != null -> "Input{periodToWeeks=$periodToWeeks}"
                and != null -> "Input{and=$and}"
                or != null -> "Input{or=$or}"
                xor != null -> "Input{xor=$xor}"
                ifString != null -> "Input{ifString=$ifString}"
                ifNumber != null -> "Input{ifNumber=$ifNumber}"
                ifBoolean != null -> "Input{ifBoolean=$ifBoolean}"
                isPresent != null -> "Input{isPresent=$isPresent}"
                hasEmailReply != null -> "Input{hasEmailReply=$hasEmailReply}"
                hasPlainTextEmailReply != null ->
                    "Input{hasPlainTextEmailReply=$hasPlainTextEmailReply}"
                extractMostRecentEmailReplyHtml != null ->
                    "Input{extractMostRecentEmailReplyHtml=$extractMostRecentEmailReplyHtml}"
                extractMostRecentEmailReplyText != null ->
                    "Input{extractMostRecentEmailReplyText=$extractMostRecentEmailReplyText}"
                extractMostRecentPlainTextEmailReply != null ->
                    "Input{extractMostRecentPlainTextEmailReply=$extractMostRecentPlainTextEmailReply}"
                setContainsString != null -> "Input{setContainsString=$setContainsString}"
                isEngagementType != null -> "Input{isEngagementType=$isEngagementType}"
                formatFullName != null -> "Input{formatFullName=$formatFullName}"
                formatPhoneNumber != null -> "Input{formatPhoneNumber=$formatPhoneNumber}"
                formatSearchablePhoneNumber != null ->
                    "Input{formatSearchablePhoneNumber=$formatSearchablePhoneNumber}"
                absoluteValue != null -> "Input{absoluteValue=$absoluteValue}"
                squareRoot != null -> "Input{squareRoot=$squareRoot}"
                power != null -> "Input{power=$power}"
                substring != null -> "Input{substring=$substring}"
                euler != null -> "Input{euler=$euler}"
                stringLength != null -> "Input{stringLength=$stringLength}"
                addTime != null -> "Input{addTime=$addTime}"
                subtractTime != null -> "Input{subtractTime=$subtractTime}"
                _json != null -> "Input{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Input")
            }

        companion object {

            @JvmStatic
            fun ofConstantBoolean(constantBoolean: ConstantBoolean) =
                Input(constantBoolean = constantBoolean)

            @JvmStatic
            fun ofConstantNumber(constantNumber: ConstantNumber) =
                Input(constantNumber = constantNumber)

            @JvmStatic
            fun ofConstantString(constantString: ConstantString) =
                Input(constantString = constantString)

            @JvmStatic
            fun ofBooleanPropertyVariable(booleanPropertyVariable: BooleanPropertyVariable) =
                Input(booleanPropertyVariable = booleanPropertyVariable)

            @JvmStatic
            fun ofStringPropertyVariable(stringPropertyVariable: StringPropertyVariable) =
                Input(stringPropertyVariable = stringPropertyVariable)

            @JvmStatic
            fun ofNumberPropertyVariable(numberPropertyVariable: NumberPropertyVariable) =
                Input(numberPropertyVariable = numberPropertyVariable)

            @JvmStatic
            fun ofTimestampOfPropertyVariable(
                timestampOfPropertyVariable: TimestampOfPropertyVariable
            ) = Input(timestampOfPropertyVariable = timestampOfPropertyVariable)

            @JvmStatic
            fun ofBooleanTargetPropertyVariable(
                booleanTargetPropertyVariable: BooleanTargetPropertyVariable
            ) = Input(booleanTargetPropertyVariable = booleanTargetPropertyVariable)

            @JvmStatic
            fun ofStringTargetPropertyVariable(
                stringTargetPropertyVariable: StringTargetPropertyVariable
            ) = Input(stringTargetPropertyVariable = stringTargetPropertyVariable)

            @JvmStatic
            fun ofNumberTargetPropertyVariable(
                numberTargetPropertyVariable: NumberTargetPropertyVariable
            ) = Input(numberTargetPropertyVariable = numberTargetPropertyVariable)

            @JvmStatic
            fun ofTimestampOfTargetPropertyVariable(
                timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
            ) = Input(timestampOfTargetPropertyVariable = timestampOfTargetPropertyVariable)

            @JvmStatic fun ofAddNumbers(addNumbers: AddNumbers) = Input(addNumbers = addNumbers)

            @JvmStatic
            fun ofSubtractNumbers(subtractNumbers: SubtractNumbers) =
                Input(subtractNumbers = subtractNumbers)

            @JvmStatic
            fun ofMultiplyNumbers(multiplyNumbers: MultiplyNumbers) =
                Input(multiplyNumbers = multiplyNumbers)

            @JvmStatic
            fun ofDivideNumbers(divideNumbers: DivideNumbers) = Input(divideNumbers = divideNumbers)

            @JvmStatic
            fun ofRoundDownNumbers(roundDownNumbers: RoundDownNumbers) =
                Input(roundDownNumbers = roundDownNumbers)

            @JvmStatic
            fun ofRoundUpNumbers(roundUpNumbers: RoundUpNumbers) =
                Input(roundUpNumbers = roundUpNumbers)

            @JvmStatic
            fun ofRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers) =
                Input(roundNearestNumbers = roundNearestNumbers)

            @JvmStatic fun ofUpperCase(upperCase: UpperCase) = Input(upperCase = upperCase)

            @JvmStatic fun ofLowerCase(lowerCase: LowerCase) = Input(lowerCase = lowerCase)

            @JvmStatic
            fun ofConcatStrings(concatStrings: ConcatStrings) = Input(concatStrings = concatStrings)

            @JvmStatic fun ofContains(contains: Contains) = Input(contains = contains)

            @JvmStatic fun ofBeginsWith(beginsWith: BeginsWith) = Input(beginsWith = beginsWith)

            @JvmStatic
            fun ofNumberToString(numberToString: NumberToString) =
                Input(numberToString = numberToString)

            @JvmStatic
            fun ofParseNumber(parseNumber: ParseNumber) = Input(parseNumber = parseNumber)

            @JvmStatic
            fun ofFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) =
                Input(fetchExchangeRate = fetchExchangeRate)

            @JvmStatic
            fun ofFetchCurrencyDecimalPlaces(
                fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces
            ) = Input(fetchCurrencyDecimalPlaces = fetchCurrencyDecimalPlaces)

            @JvmStatic
            fun ofFetchSingleCurrencyPortalCurrency(
                fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
            ) = Input(fetchSingleCurrencyPortalCurrency = fetchSingleCurrencyPortalCurrency)

            @JvmStatic
            fun ofDatedExchangeRate(datedExchangeRate: DatedExchangeRate) =
                Input(datedExchangeRate = datedExchangeRate)

            @JvmStatic
            fun ofPipelineProbability(pipelineProbability: PipelineProbability) =
                Input(pipelineProbability = pipelineProbability)

            @JvmStatic fun ofMaxNumbers(maxNumbers: MaxNumbers) = Input(maxNumbers = maxNumbers)

            @JvmStatic fun ofMinNumbers(minNumbers: MinNumbers) = Input(minNumbers = minNumbers)

            @JvmStatic fun ofLessThan(lessThan: LessThan) = Input(lessThan = lessThan)

            @JvmStatic
            fun ofLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
                Input(lessThanOrEqual = lessThanOrEqual)

            @JvmStatic fun ofMoreThan(moreThan: MoreThan) = Input(moreThan = moreThan)

            @JvmStatic
            fun ofMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
                Input(moreThanOrEqual = moreThanOrEqual)

            @JvmStatic
            fun ofNumberEquals(numberEquals: NumberEquals) = Input(numberEquals = numberEquals)

            @JvmStatic
            fun ofStringEquals(stringEquals: StringEquals) = Input(stringEquals = stringEquals)

            @JvmStatic
            fun ofIsPipelineStageClosed(isPipelineStageClosed: IsPipelineStageClosed) =
                Input(isPipelineStageClosed = isPipelineStageClosed)

            @JvmStatic fun ofNot(not: Not) = Input(not = not)

            @JvmStatic fun ofDate(date: Date) = Input(date = date)

            @JvmStatic fun ofMonth(month: Month) = Input(month = month)

            @JvmStatic fun ofYear(year: Year) = Input(year = year)

            @JvmStatic fun ofNow(now: Now) = Input(now = now)

            @JvmStatic
            fun ofTimeBetween(timeBetween: TimeBetween) = Input(timeBetween = timeBetween)

            @JvmStatic
            fun ofTimeBetweenSkipWeekends(timeBetweenSkipWeekends: TimeBetweenSkipWeekends) =
                Input(timeBetweenSkipWeekends = timeBetweenSkipWeekends)

            @JvmStatic
            fun ofPeriodToMonths(periodToMonths: PeriodToMonths) =
                Input(periodToMonths = periodToMonths)

            @JvmStatic
            fun ofPeriodToWeeks(periodToWeeks: PeriodToWeeks) = Input(periodToWeeks = periodToWeeks)

            @JvmStatic fun ofAnd(and: And) = Input(and = and)

            @JvmStatic fun ofOr(or: Or) = Input(or = or)

            @JvmStatic fun ofXor(xor: Xor) = Input(xor = xor)

            @JvmStatic fun ofIfString(ifString: IfString) = Input(ifString = ifString)

            @JvmStatic fun ofIfNumber(ifNumber: IfNumber) = Input(ifNumber = ifNumber)

            @JvmStatic fun ofIfBoolean(ifBoolean: IfBoolean) = Input(ifBoolean = ifBoolean)

            @JvmStatic fun ofIsPresent(isPresent: IsPresent) = Input(isPresent = isPresent)

            @JvmStatic
            fun ofHasEmailReply(hasEmailReply: HasEmailReply) = Input(hasEmailReply = hasEmailReply)

            @JvmStatic
            fun ofHasPlainTextEmailReply(hasPlainTextEmailReply: HasPlainTextEmailReply) =
                Input(hasPlainTextEmailReply = hasPlainTextEmailReply)

            @JvmStatic
            fun ofExtractMostRecentEmailReplyHtml(
                extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
            ) = Input(extractMostRecentEmailReplyHtml = extractMostRecentEmailReplyHtml)

            @JvmStatic
            fun ofExtractMostRecentEmailReplyText(
                extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
            ) = Input(extractMostRecentEmailReplyText = extractMostRecentEmailReplyText)

            @JvmStatic
            fun ofExtractMostRecentPlainTextEmailReply(
                extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
            ) = Input(extractMostRecentPlainTextEmailReply = extractMostRecentPlainTextEmailReply)

            @JvmStatic
            fun ofSetContainsString(setContainsString: SetContainsString) =
                Input(setContainsString = setContainsString)

            @JvmStatic
            fun ofIsEngagementType(isEngagementType: IsEngagementType) =
                Input(isEngagementType = isEngagementType)

            @JvmStatic
            fun ofFormatFullName(formatFullName: FormatFullName) =
                Input(formatFullName = formatFullName)

            @JvmStatic
            fun ofFormatPhoneNumber(formatPhoneNumber: FormatPhoneNumber) =
                Input(formatPhoneNumber = formatPhoneNumber)

            @JvmStatic
            fun ofFormatSearchablePhoneNumber(
                formatSearchablePhoneNumber: FormatSearchablePhoneNumber
            ) = Input(formatSearchablePhoneNumber = formatSearchablePhoneNumber)

            @JvmStatic
            fun ofAbsoluteValue(absoluteValue: AbsoluteValue) = Input(absoluteValue = absoluteValue)

            @JvmStatic fun ofSquareRoot(squareRoot: SquareRoot) = Input(squareRoot = squareRoot)

            @JvmStatic fun ofPower(power: Power) = Input(power = power)

            @JvmStatic fun ofSubstring(substring: Substring) = Input(substring = substring)

            @JvmStatic fun ofEuler(euler: Euler) = Input(euler = euler)

            @JvmStatic
            fun ofStringLength(stringLength: StringLength) = Input(stringLength = stringLength)

            @JvmStatic fun ofAddTime(addTime: AddTime) = Input(addTime = addTime)

            @JvmStatic
            fun ofSubtractTime(subtractTime: SubtractTime) = Input(subtractTime = subtractTime)
        }

        /** An interface that defines how to map each variant of [Input] to a value of type [T]. */
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
             * Maps an unknown variant of [Input] to a value of type [T].
             *
             * An instance of [Input] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Input: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Input>(Input::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Input {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ConstantBoolean>())?.let {
                                Input(constantBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantNumber>())?.let {
                                Input(constantNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConstantString>())?.let {
                                Input(constantString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BooleanPropertyVariable>())?.let {
                                Input(booleanPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringPropertyVariable>())?.let {
                                Input(stringPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberPropertyVariable>())?.let {
                                Input(numberPropertyVariable = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimestampOfPropertyVariable>())
                                ?.let { Input(timestampOfPropertyVariable = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<BooleanTargetPropertyVariable>())
                                ?.let { Input(booleanTargetPropertyVariable = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<StringTargetPropertyVariable>())
                                ?.let { Input(stringTargetPropertyVariable = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<NumberTargetPropertyVariable>())
                                ?.let { Input(numberTargetPropertyVariable = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<TimestampOfTargetPropertyVariable>(),
                                )
                                ?.let {
                                    Input(timestampOfTargetPropertyVariable = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<AddNumbers>())?.let {
                                Input(addNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractNumbers>())?.let {
                                Input(subtractNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultiplyNumbers>())?.let {
                                Input(multiplyNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DivideNumbers>())?.let {
                                Input(divideNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundDownNumbers>())?.let {
                                Input(roundDownNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundUpNumbers>())?.let {
                                Input(roundUpNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RoundNearestNumbers>())?.let {
                                Input(roundNearestNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UpperCase>())?.let {
                                Input(upperCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LowerCase>())?.let {
                                Input(lowerCase = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ConcatStrings>())?.let {
                                Input(concatStrings = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Contains>())?.let {
                                Input(contains = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BeginsWith>())?.let {
                                Input(beginsWith = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberToString>())?.let {
                                Input(numberToString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ParseNumber>())?.let {
                                Input(parseNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchExchangeRate>())?.let {
                                Input(fetchExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FetchCurrencyDecimalPlaces>())
                                ?.let { Input(fetchCurrencyDecimalPlaces = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<FetchSingleCurrencyPortalCurrency>(),
                                )
                                ?.let {
                                    Input(fetchSingleCurrencyPortalCurrency = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<DatedExchangeRate>())?.let {
                                Input(datedExchangeRate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PipelineProbability>())?.let {
                                Input(pipelineProbability = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MaxNumbers>())?.let {
                                Input(maxNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MinNumbers>())?.let {
                                Input(minNumbers = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThan>())?.let {
                                Input(lessThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LessThanOrEqual>())?.let {
                                Input(lessThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThan>())?.let {
                                Input(moreThan = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MoreThanOrEqual>())?.let {
                                Input(moreThanOrEqual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberEquals>())?.let {
                                Input(numberEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringEquals>())?.let {
                                Input(stringEquals = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPipelineStageClosed>())?.let {
                                Input(isPipelineStageClosed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Not>())?.let {
                                Input(not = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Date>())?.let {
                                Input(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Month>())?.let {
                                Input(month = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Year>())?.let {
                                Input(year = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Now>())?.let {
                                Input(now = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetween>())?.let {
                                Input(timeBetween = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimeBetweenSkipWeekends>())?.let {
                                Input(timeBetweenSkipWeekends = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToMonths>())?.let {
                                Input(periodToMonths = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PeriodToWeeks>())?.let {
                                Input(periodToWeeks = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<And>())?.let {
                                Input(and = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Or>())?.let {
                                Input(or = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Xor>())?.let {
                                Input(xor = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfString>())?.let {
                                Input(ifString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfNumber>())?.let {
                                Input(ifNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IfBoolean>())?.let {
                                Input(ifBoolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsPresent>())?.let {
                                Input(isPresent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasEmailReply>())?.let {
                                Input(hasEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<HasPlainTextEmailReply>())?.let {
                                Input(hasPlainTextEmailReply = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyHtml>())
                                ?.let { Input(extractMostRecentEmailReplyHtml = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyText>())
                                ?.let { Input(extractMostRecentEmailReplyText = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ExtractMostRecentPlainTextEmailReply>(),
                                )
                                ?.let {
                                    Input(extractMostRecentPlainTextEmailReply = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<SetContainsString>())?.let {
                                Input(setContainsString = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IsEngagementType>())?.let {
                                Input(isEngagementType = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatFullName>())?.let {
                                Input(formatFullName = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatPhoneNumber>())?.let {
                                Input(formatPhoneNumber = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FormatSearchablePhoneNumber>())
                                ?.let { Input(formatSearchablePhoneNumber = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<AbsoluteValue>())?.let {
                                Input(absoluteValue = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SquareRoot>())?.let {
                                Input(squareRoot = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Power>())?.let {
                                Input(power = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Substring>())?.let {
                                Input(substring = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Euler>())?.let {
                                Input(euler = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringLength>())?.let {
                                Input(stringLength = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AddTime>())?.let {
                                Input(addTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SubtractTime>())?.let {
                                Input(subtractTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Input(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Input>(Input::class) {

            override fun serialize(
                value: Input,
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
                    else -> throw IllegalStateException("Invalid Input")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Date &&
            operator == other.operator &&
            inputs == other.inputs &&
            propertyName == other.propertyName &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(operator, inputs, propertyName, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Date{operator=$operator, inputs=$inputs, propertyName=$propertyName, value=$value, additionalProperties=$additionalProperties}"
}
