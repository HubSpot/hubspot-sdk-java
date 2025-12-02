// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = Expression.Deserializer::class)
@JsonSerialize(using = Expression.Serializer::class)
class Expression
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
    private val extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply? = null,
    private val setContainsString: SetContainsString? = null,
    private val isEngagementType: IsEngagementType? = null,
    private val formatFullName: FormatFullName? = null,
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

    fun fetchExchangeRate(): Optional<FetchExchangeRate> = Optional.ofNullable(fetchExchangeRate)

    fun fetchCurrencyDecimalPlaces(): Optional<FetchCurrencyDecimalPlaces> =
        Optional.ofNullable(fetchCurrencyDecimalPlaces)

    fun fetchSingleCurrencyPortalCurrency(): Optional<FetchSingleCurrencyPortalCurrency> =
        Optional.ofNullable(fetchSingleCurrencyPortalCurrency)

    fun datedExchangeRate(): Optional<DatedExchangeRate> = Optional.ofNullable(datedExchangeRate)

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

    fun setContainsString(): Optional<SetContainsString> = Optional.ofNullable(setContainsString)

    fun isEngagementType(): Optional<IsEngagementType> = Optional.ofNullable(isEngagementType)

    fun formatFullName(): Optional<FormatFullName> = Optional.ofNullable(formatFullName)

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

    fun isTimestampOfTargetPropertyVariable(): Boolean = timestampOfTargetPropertyVariable != null

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

    fun isFetchSingleCurrencyPortalCurrency(): Boolean = fetchSingleCurrencyPortalCurrency != null

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

    fun asFetchExchangeRate(): FetchExchangeRate = fetchExchangeRate.getOrThrow("fetchExchangeRate")

    fun asFetchCurrencyDecimalPlaces(): FetchCurrencyDecimalPlaces =
        fetchCurrencyDecimalPlaces.getOrThrow("fetchCurrencyDecimalPlaces")

    fun asFetchSingleCurrencyPortalCurrency(): FetchSingleCurrencyPortalCurrency =
        fetchSingleCurrencyPortalCurrency.getOrThrow("fetchSingleCurrencyPortalCurrency")

    fun asDatedExchangeRate(): DatedExchangeRate = datedExchangeRate.getOrThrow("datedExchangeRate")

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

    fun asSetContainsString(): SetContainsString = setContainsString.getOrThrow("setContainsString")

    fun asIsEngagementType(): IsEngagementType = isEngagementType.getOrThrow("isEngagementType")

    fun asFormatFullName(): FormatFullName = formatFullName.getOrThrow("formatFullName")

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
                visitor.visitTimestampOfTargetPropertyVariable(timestampOfTargetPropertyVariable)
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
                visitor.visitFetchSingleCurrencyPortalCurrency(fetchSingleCurrencyPortalCurrency)
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

    fun validate(): Expression = apply {
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

                override fun visitRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers) {
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

                override fun visitPipelineProbability(pipelineProbability: PipelineProbability) {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

                override fun visitRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers) =
                    roundNearestNumbers.validity()

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

                override fun visitPipelineProbability(pipelineProbability: PipelineProbability) =
                    pipelineProbability.validity()

                override fun visitMaxNumbers(maxNumbers: MaxNumbers) = maxNumbers.validity()

                override fun visitMinNumbers(minNumbers: MinNumbers) = minNumbers.validity()

                override fun visitLessThan(lessThan: LessThan) = lessThan.validity()

                override fun visitLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
                    lessThanOrEqual.validity()

                override fun visitMoreThan(moreThan: MoreThan) = moreThan.validity()

                override fun visitMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
                    moreThanOrEqual.validity()

                override fun visitNumberEquals(numberEquals: NumberEquals) = numberEquals.validity()

                override fun visitStringEquals(stringEquals: StringEquals) = stringEquals.validity()

                override fun visitIsPipelineStageClosed(
                    isPipelineStageClosed: IsPipelineStageClosed
                ) = isPipelineStageClosed.validity()

                override fun visitNot(not: Not) = not.validity()

                override fun visitDate(date: Date) = date.validity()

                override fun visitMonth(month: Month) = month.validity()

                override fun visitYear(year: Year) = year.validity()

                override fun visitNow(now: Now) = now.validity()

                override fun visitTimeBetween(timeBetween: TimeBetween) = timeBetween.validity()

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

                override fun visitAbsoluteValue(absoluteValue: AbsoluteValue) =
                    absoluteValue.validity()

                override fun visitSquareRoot(squareRoot: SquareRoot) = squareRoot.validity()

                override fun visitPower(power: Power) = power.validity()

                override fun visitSubstring(substring: Substring) = substring.validity()

                override fun visitEuler(euler: Euler) = euler.validity()

                override fun visitStringLength(stringLength: StringLength) = stringLength.validity()

                override fun visitAddTime(addTime: AddTime) = addTime.validity()

                override fun visitSubtractTime(subtractTime: SubtractTime) = subtractTime.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Expression &&
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
            extractMostRecentPlainTextEmailReply == other.extractMostRecentPlainTextEmailReply &&
            setContainsString == other.setContainsString &&
            isEngagementType == other.isEngagementType &&
            formatFullName == other.formatFullName &&
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
            constantBoolean != null -> "Expression{constantBoolean=$constantBoolean}"
            constantNumber != null -> "Expression{constantNumber=$constantNumber}"
            constantString != null -> "Expression{constantString=$constantString}"
            booleanPropertyVariable != null ->
                "Expression{booleanPropertyVariable=$booleanPropertyVariable}"
            stringPropertyVariable != null ->
                "Expression{stringPropertyVariable=$stringPropertyVariable}"
            numberPropertyVariable != null ->
                "Expression{numberPropertyVariable=$numberPropertyVariable}"
            timestampOfPropertyVariable != null ->
                "Expression{timestampOfPropertyVariable=$timestampOfPropertyVariable}"
            booleanTargetPropertyVariable != null ->
                "Expression{booleanTargetPropertyVariable=$booleanTargetPropertyVariable}"
            stringTargetPropertyVariable != null ->
                "Expression{stringTargetPropertyVariable=$stringTargetPropertyVariable}"
            numberTargetPropertyVariable != null ->
                "Expression{numberTargetPropertyVariable=$numberTargetPropertyVariable}"
            timestampOfTargetPropertyVariable != null ->
                "Expression{timestampOfTargetPropertyVariable=$timestampOfTargetPropertyVariable}"
            addNumbers != null -> "Expression{addNumbers=$addNumbers}"
            subtractNumbers != null -> "Expression{subtractNumbers=$subtractNumbers}"
            multiplyNumbers != null -> "Expression{multiplyNumbers=$multiplyNumbers}"
            divideNumbers != null -> "Expression{divideNumbers=$divideNumbers}"
            roundDownNumbers != null -> "Expression{roundDownNumbers=$roundDownNumbers}"
            roundUpNumbers != null -> "Expression{roundUpNumbers=$roundUpNumbers}"
            roundNearestNumbers != null -> "Expression{roundNearestNumbers=$roundNearestNumbers}"
            upperCase != null -> "Expression{upperCase=$upperCase}"
            lowerCase != null -> "Expression{lowerCase=$lowerCase}"
            concatStrings != null -> "Expression{concatStrings=$concatStrings}"
            contains != null -> "Expression{contains=$contains}"
            beginsWith != null -> "Expression{beginsWith=$beginsWith}"
            numberToString != null -> "Expression{numberToString=$numberToString}"
            parseNumber != null -> "Expression{parseNumber=$parseNumber}"
            fetchExchangeRate != null -> "Expression{fetchExchangeRate=$fetchExchangeRate}"
            fetchCurrencyDecimalPlaces != null ->
                "Expression{fetchCurrencyDecimalPlaces=$fetchCurrencyDecimalPlaces}"
            fetchSingleCurrencyPortalCurrency != null ->
                "Expression{fetchSingleCurrencyPortalCurrency=$fetchSingleCurrencyPortalCurrency}"
            datedExchangeRate != null -> "Expression{datedExchangeRate=$datedExchangeRate}"
            pipelineProbability != null -> "Expression{pipelineProbability=$pipelineProbability}"
            maxNumbers != null -> "Expression{maxNumbers=$maxNumbers}"
            minNumbers != null -> "Expression{minNumbers=$minNumbers}"
            lessThan != null -> "Expression{lessThan=$lessThan}"
            lessThanOrEqual != null -> "Expression{lessThanOrEqual=$lessThanOrEqual}"
            moreThan != null -> "Expression{moreThan=$moreThan}"
            moreThanOrEqual != null -> "Expression{moreThanOrEqual=$moreThanOrEqual}"
            numberEquals != null -> "Expression{numberEquals=$numberEquals}"
            stringEquals != null -> "Expression{stringEquals=$stringEquals}"
            isPipelineStageClosed != null ->
                "Expression{isPipelineStageClosed=$isPipelineStageClosed}"
            not != null -> "Expression{not=$not}"
            date != null -> "Expression{date=$date}"
            month != null -> "Expression{month=$month}"
            year != null -> "Expression{year=$year}"
            now != null -> "Expression{now=$now}"
            timeBetween != null -> "Expression{timeBetween=$timeBetween}"
            periodToMonths != null -> "Expression{periodToMonths=$periodToMonths}"
            periodToWeeks != null -> "Expression{periodToWeeks=$periodToWeeks}"
            and != null -> "Expression{and=$and}"
            or != null -> "Expression{or=$or}"
            xor != null -> "Expression{xor=$xor}"
            ifString != null -> "Expression{ifString=$ifString}"
            ifNumber != null -> "Expression{ifNumber=$ifNumber}"
            ifBoolean != null -> "Expression{ifBoolean=$ifBoolean}"
            isPresent != null -> "Expression{isPresent=$isPresent}"
            hasEmailReply != null -> "Expression{hasEmailReply=$hasEmailReply}"
            hasPlainTextEmailReply != null ->
                "Expression{hasPlainTextEmailReply=$hasPlainTextEmailReply}"
            extractMostRecentEmailReplyHtml != null ->
                "Expression{extractMostRecentEmailReplyHtml=$extractMostRecentEmailReplyHtml}"
            extractMostRecentEmailReplyText != null ->
                "Expression{extractMostRecentEmailReplyText=$extractMostRecentEmailReplyText}"
            extractMostRecentPlainTextEmailReply != null ->
                "Expression{extractMostRecentPlainTextEmailReply=$extractMostRecentPlainTextEmailReply}"
            setContainsString != null -> "Expression{setContainsString=$setContainsString}"
            isEngagementType != null -> "Expression{isEngagementType=$isEngagementType}"
            formatFullName != null -> "Expression{formatFullName=$formatFullName}"
            absoluteValue != null -> "Expression{absoluteValue=$absoluteValue}"
            squareRoot != null -> "Expression{squareRoot=$squareRoot}"
            power != null -> "Expression{power=$power}"
            substring != null -> "Expression{substring=$substring}"
            euler != null -> "Expression{euler=$euler}"
            stringLength != null -> "Expression{stringLength=$stringLength}"
            addTime != null -> "Expression{addTime=$addTime}"
            subtractTime != null -> "Expression{subtractTime=$subtractTime}"
            _json != null -> "Expression{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Expression")
        }

    companion object {

        @JvmStatic
        fun ofConstantBoolean(constantBoolean: ConstantBoolean) =
            Expression(constantBoolean = constantBoolean)

        @JvmStatic
        fun ofConstantNumber(constantNumber: ConstantNumber) =
            Expression(constantNumber = constantNumber)

        @JvmStatic
        fun ofConstantString(constantString: ConstantString) =
            Expression(constantString = constantString)

        @JvmStatic
        fun ofBooleanPropertyVariable(booleanPropertyVariable: BooleanPropertyVariable) =
            Expression(booleanPropertyVariable = booleanPropertyVariable)

        @JvmStatic
        fun ofStringPropertyVariable(stringPropertyVariable: StringPropertyVariable) =
            Expression(stringPropertyVariable = stringPropertyVariable)

        @JvmStatic
        fun ofNumberPropertyVariable(numberPropertyVariable: NumberPropertyVariable) =
            Expression(numberPropertyVariable = numberPropertyVariable)

        @JvmStatic
        fun ofTimestampOfPropertyVariable(
            timestampOfPropertyVariable: TimestampOfPropertyVariable
        ) = Expression(timestampOfPropertyVariable = timestampOfPropertyVariable)

        @JvmStatic
        fun ofBooleanTargetPropertyVariable(
            booleanTargetPropertyVariable: BooleanTargetPropertyVariable
        ) = Expression(booleanTargetPropertyVariable = booleanTargetPropertyVariable)

        @JvmStatic
        fun ofStringTargetPropertyVariable(
            stringTargetPropertyVariable: StringTargetPropertyVariable
        ) = Expression(stringTargetPropertyVariable = stringTargetPropertyVariable)

        @JvmStatic
        fun ofNumberTargetPropertyVariable(
            numberTargetPropertyVariable: NumberTargetPropertyVariable
        ) = Expression(numberTargetPropertyVariable = numberTargetPropertyVariable)

        @JvmStatic
        fun ofTimestampOfTargetPropertyVariable(
            timestampOfTargetPropertyVariable: TimestampOfTargetPropertyVariable
        ) = Expression(timestampOfTargetPropertyVariable = timestampOfTargetPropertyVariable)

        @JvmStatic fun ofAddNumbers(addNumbers: AddNumbers) = Expression(addNumbers = addNumbers)

        @JvmStatic
        fun ofSubtractNumbers(subtractNumbers: SubtractNumbers) =
            Expression(subtractNumbers = subtractNumbers)

        @JvmStatic
        fun ofMultiplyNumbers(multiplyNumbers: MultiplyNumbers) =
            Expression(multiplyNumbers = multiplyNumbers)

        @JvmStatic
        fun ofDivideNumbers(divideNumbers: DivideNumbers) =
            Expression(divideNumbers = divideNumbers)

        @JvmStatic
        fun ofRoundDownNumbers(roundDownNumbers: RoundDownNumbers) =
            Expression(roundDownNumbers = roundDownNumbers)

        @JvmStatic
        fun ofRoundUpNumbers(roundUpNumbers: RoundUpNumbers) =
            Expression(roundUpNumbers = roundUpNumbers)

        @JvmStatic
        fun ofRoundNearestNumbers(roundNearestNumbers: RoundNearestNumbers) =
            Expression(roundNearestNumbers = roundNearestNumbers)

        @JvmStatic fun ofUpperCase(upperCase: UpperCase) = Expression(upperCase = upperCase)

        @JvmStatic fun ofLowerCase(lowerCase: LowerCase) = Expression(lowerCase = lowerCase)

        @JvmStatic
        fun ofConcatStrings(concatStrings: ConcatStrings) =
            Expression(concatStrings = concatStrings)

        @JvmStatic fun ofContains(contains: Contains) = Expression(contains = contains)

        @JvmStatic fun ofBeginsWith(beginsWith: BeginsWith) = Expression(beginsWith = beginsWith)

        @JvmStatic
        fun ofNumberToString(numberToString: NumberToString) =
            Expression(numberToString = numberToString)

        @JvmStatic
        fun ofParseNumber(parseNumber: ParseNumber) = Expression(parseNumber = parseNumber)

        @JvmStatic
        fun ofFetchExchangeRate(fetchExchangeRate: FetchExchangeRate) =
            Expression(fetchExchangeRate = fetchExchangeRate)

        @JvmStatic
        fun ofFetchCurrencyDecimalPlaces(fetchCurrencyDecimalPlaces: FetchCurrencyDecimalPlaces) =
            Expression(fetchCurrencyDecimalPlaces = fetchCurrencyDecimalPlaces)

        @JvmStatic
        fun ofFetchSingleCurrencyPortalCurrency(
            fetchSingleCurrencyPortalCurrency: FetchSingleCurrencyPortalCurrency
        ) = Expression(fetchSingleCurrencyPortalCurrency = fetchSingleCurrencyPortalCurrency)

        @JvmStatic
        fun ofDatedExchangeRate(datedExchangeRate: DatedExchangeRate) =
            Expression(datedExchangeRate = datedExchangeRate)

        @JvmStatic
        fun ofPipelineProbability(pipelineProbability: PipelineProbability) =
            Expression(pipelineProbability = pipelineProbability)

        @JvmStatic fun ofMaxNumbers(maxNumbers: MaxNumbers) = Expression(maxNumbers = maxNumbers)

        @JvmStatic fun ofMinNumbers(minNumbers: MinNumbers) = Expression(minNumbers = minNumbers)

        @JvmStatic fun ofLessThan(lessThan: LessThan) = Expression(lessThan = lessThan)

        @JvmStatic
        fun ofLessThanOrEqual(lessThanOrEqual: LessThanOrEqual) =
            Expression(lessThanOrEqual = lessThanOrEqual)

        @JvmStatic fun ofMoreThan(moreThan: MoreThan) = Expression(moreThan = moreThan)

        @JvmStatic
        fun ofMoreThanOrEqual(moreThanOrEqual: MoreThanOrEqual) =
            Expression(moreThanOrEqual = moreThanOrEqual)

        @JvmStatic
        fun ofNumberEquals(numberEquals: NumberEquals) = Expression(numberEquals = numberEquals)

        @JvmStatic
        fun ofStringEquals(stringEquals: StringEquals) = Expression(stringEquals = stringEquals)

        @JvmStatic
        fun ofIsPipelineStageClosed(isPipelineStageClosed: IsPipelineStageClosed) =
            Expression(isPipelineStageClosed = isPipelineStageClosed)

        @JvmStatic fun ofNot(not: Not) = Expression(not = not)

        @JvmStatic fun ofDate(date: Date) = Expression(date = date)

        @JvmStatic fun ofMonth(month: Month) = Expression(month = month)

        @JvmStatic fun ofYear(year: Year) = Expression(year = year)

        @JvmStatic fun ofNow(now: Now) = Expression(now = now)

        @JvmStatic
        fun ofTimeBetween(timeBetween: TimeBetween) = Expression(timeBetween = timeBetween)

        @JvmStatic
        fun ofPeriodToMonths(periodToMonths: PeriodToMonths) =
            Expression(periodToMonths = periodToMonths)

        @JvmStatic
        fun ofPeriodToWeeks(periodToWeeks: PeriodToWeeks) =
            Expression(periodToWeeks = periodToWeeks)

        @JvmStatic fun ofAnd(and: And) = Expression(and = and)

        @JvmStatic fun ofOr(or: Or) = Expression(or = or)

        @JvmStatic fun ofXor(xor: Xor) = Expression(xor = xor)

        @JvmStatic fun ofIfString(ifString: IfString) = Expression(ifString = ifString)

        @JvmStatic fun ofIfNumber(ifNumber: IfNumber) = Expression(ifNumber = ifNumber)

        @JvmStatic fun ofIfBoolean(ifBoolean: IfBoolean) = Expression(ifBoolean = ifBoolean)

        @JvmStatic fun ofIsPresent(isPresent: IsPresent) = Expression(isPresent = isPresent)

        @JvmStatic
        fun ofHasEmailReply(hasEmailReply: HasEmailReply) =
            Expression(hasEmailReply = hasEmailReply)

        @JvmStatic
        fun ofHasPlainTextEmailReply(hasPlainTextEmailReply: HasPlainTextEmailReply) =
            Expression(hasPlainTextEmailReply = hasPlainTextEmailReply)

        @JvmStatic
        fun ofExtractMostRecentEmailReplyHtml(
            extractMostRecentEmailReplyHtml: ExtractMostRecentEmailReplyHtml
        ) = Expression(extractMostRecentEmailReplyHtml = extractMostRecentEmailReplyHtml)

        @JvmStatic
        fun ofExtractMostRecentEmailReplyText(
            extractMostRecentEmailReplyText: ExtractMostRecentEmailReplyText
        ) = Expression(extractMostRecentEmailReplyText = extractMostRecentEmailReplyText)

        @JvmStatic
        fun ofExtractMostRecentPlainTextEmailReply(
            extractMostRecentPlainTextEmailReply: ExtractMostRecentPlainTextEmailReply
        ) = Expression(extractMostRecentPlainTextEmailReply = extractMostRecentPlainTextEmailReply)

        @JvmStatic
        fun ofSetContainsString(setContainsString: SetContainsString) =
            Expression(setContainsString = setContainsString)

        @JvmStatic
        fun ofIsEngagementType(isEngagementType: IsEngagementType) =
            Expression(isEngagementType = isEngagementType)

        @JvmStatic
        fun ofFormatFullName(formatFullName: FormatFullName) =
            Expression(formatFullName = formatFullName)

        @JvmStatic
        fun ofAbsoluteValue(absoluteValue: AbsoluteValue) =
            Expression(absoluteValue = absoluteValue)

        @JvmStatic fun ofSquareRoot(squareRoot: SquareRoot) = Expression(squareRoot = squareRoot)

        @JvmStatic fun ofPower(power: Power) = Expression(power = power)

        @JvmStatic fun ofSubstring(substring: Substring) = Expression(substring = substring)

        @JvmStatic fun ofEuler(euler: Euler) = Expression(euler = euler)

        @JvmStatic
        fun ofStringLength(stringLength: StringLength) = Expression(stringLength = stringLength)

        @JvmStatic fun ofAddTime(addTime: AddTime) = Expression(addTime = addTime)

        @JvmStatic
        fun ofSubtractTime(subtractTime: SubtractTime) = Expression(subtractTime = subtractTime)
    }

    /** An interface that defines how to map each variant of [Expression] to a value of type [T]. */
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

        fun visitAbsoluteValue(absoluteValue: AbsoluteValue): T

        fun visitSquareRoot(squareRoot: SquareRoot): T

        fun visitPower(power: Power): T

        fun visitSubstring(substring: Substring): T

        fun visitEuler(euler: Euler): T

        fun visitStringLength(stringLength: StringLength): T

        fun visitAddTime(addTime: AddTime): T

        fun visitSubtractTime(subtractTime: SubtractTime): T

        /**
         * Maps an unknown variant of [Expression] to a value of type [T].
         *
         * An instance of [Expression] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown Expression: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Expression>(Expression::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Expression {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ConstantBoolean>())?.let {
                            Expression(constantBoolean = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConstantNumber>())?.let {
                            Expression(constantNumber = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConstantString>())?.let {
                            Expression(constantString = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BooleanPropertyVariable>())?.let {
                            Expression(booleanPropertyVariable = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<StringPropertyVariable>())?.let {
                            Expression(stringPropertyVariable = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NumberPropertyVariable>())?.let {
                            Expression(numberPropertyVariable = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TimestampOfPropertyVariable>())?.let {
                            Expression(timestampOfPropertyVariable = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BooleanTargetPropertyVariable>())?.let {
                            Expression(booleanTargetPropertyVariable = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<StringTargetPropertyVariable>())?.let {
                            Expression(stringTargetPropertyVariable = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NumberTargetPropertyVariable>())?.let {
                            Expression(numberTargetPropertyVariable = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TimestampOfTargetPropertyVariable>())
                            ?.let {
                                Expression(timestampOfTargetPropertyVariable = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<AddNumbers>())?.let {
                            Expression(addNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SubtractNumbers>())?.let {
                            Expression(subtractNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MultiplyNumbers>())?.let {
                            Expression(multiplyNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DivideNumbers>())?.let {
                            Expression(divideNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RoundDownNumbers>())?.let {
                            Expression(roundDownNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RoundUpNumbers>())?.let {
                            Expression(roundUpNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RoundNearestNumbers>())?.let {
                            Expression(roundNearestNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UpperCase>())?.let {
                            Expression(upperCase = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LowerCase>())?.let {
                            Expression(lowerCase = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ConcatStrings>())?.let {
                            Expression(concatStrings = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Contains>())?.let {
                            Expression(contains = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BeginsWith>())?.let {
                            Expression(beginsWith = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NumberToString>())?.let {
                            Expression(numberToString = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ParseNumber>())?.let {
                            Expression(parseNumber = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FetchExchangeRate>())?.let {
                            Expression(fetchExchangeRate = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FetchCurrencyDecimalPlaces>())?.let {
                            Expression(fetchCurrencyDecimalPlaces = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FetchSingleCurrencyPortalCurrency>())
                            ?.let {
                                Expression(fetchSingleCurrencyPortalCurrency = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<DatedExchangeRate>())?.let {
                            Expression(datedExchangeRate = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PipelineProbability>())?.let {
                            Expression(pipelineProbability = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MaxNumbers>())?.let {
                            Expression(maxNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MinNumbers>())?.let {
                            Expression(minNumbers = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LessThan>())?.let {
                            Expression(lessThan = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LessThanOrEqual>())?.let {
                            Expression(lessThanOrEqual = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MoreThan>())?.let {
                            Expression(moreThan = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MoreThanOrEqual>())?.let {
                            Expression(moreThanOrEqual = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NumberEquals>())?.let {
                            Expression(numberEquals = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<StringEquals>())?.let {
                            Expression(stringEquals = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IsPipelineStageClosed>())?.let {
                            Expression(isPipelineStageClosed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Not>())?.let {
                            Expression(not = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Date>())?.let {
                            Expression(date = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Month>())?.let {
                            Expression(month = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Year>())?.let {
                            Expression(year = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Now>())?.let {
                            Expression(now = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TimeBetween>())?.let {
                            Expression(timeBetween = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PeriodToMonths>())?.let {
                            Expression(periodToMonths = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PeriodToWeeks>())?.let {
                            Expression(periodToWeeks = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<And>())?.let {
                            Expression(and = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Or>())?.let {
                            Expression(or = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Xor>())?.let {
                            Expression(xor = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IfString>())?.let {
                            Expression(ifString = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IfNumber>())?.let {
                            Expression(ifNumber = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IfBoolean>())?.let {
                            Expression(ifBoolean = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IsPresent>())?.let {
                            Expression(isPresent = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<HasEmailReply>())?.let {
                            Expression(hasEmailReply = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<HasPlainTextEmailReply>())?.let {
                            Expression(hasPlainTextEmailReply = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyHtml>())
                            ?.let {
                                Expression(extractMostRecentEmailReplyHtml = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<ExtractMostRecentEmailReplyText>())
                            ?.let {
                                Expression(extractMostRecentEmailReplyText = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<ExtractMostRecentPlainTextEmailReply>())
                            ?.let {
                                Expression(extractMostRecentPlainTextEmailReply = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SetContainsString>())?.let {
                            Expression(setContainsString = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IsEngagementType>())?.let {
                            Expression(isEngagementType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FormatFullName>())?.let {
                            Expression(formatFullName = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AbsoluteValue>())?.let {
                            Expression(absoluteValue = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SquareRoot>())?.let {
                            Expression(squareRoot = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Power>())?.let {
                            Expression(power = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Substring>())?.let {
                            Expression(substring = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Euler>())?.let {
                            Expression(euler = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<StringLength>())?.let {
                            Expression(stringLength = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AddTime>())?.let {
                            Expression(addTime = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SubtractTime>())?.let {
                            Expression(subtractTime = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Expression(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Expression>(Expression::class) {

        override fun serialize(
            value: Expression,
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
                value.fetchExchangeRate != null -> generator.writeObject(value.fetchExchangeRate)
                value.fetchCurrencyDecimalPlaces != null ->
                    generator.writeObject(value.fetchCurrencyDecimalPlaces)
                value.fetchSingleCurrencyPortalCurrency != null ->
                    generator.writeObject(value.fetchSingleCurrencyPortalCurrency)
                value.datedExchangeRate != null -> generator.writeObject(value.datedExchangeRate)
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
                value.setContainsString != null -> generator.writeObject(value.setContainsString)
                value.isEngagementType != null -> generator.writeObject(value.isEngagementType)
                value.formatFullName != null -> generator.writeObject(value.formatFullName)
                value.absoluteValue != null -> generator.writeObject(value.absoluteValue)
                value.squareRoot != null -> generator.writeObject(value.squareRoot)
                value.power != null -> generator.writeObject(value.power)
                value.substring != null -> generator.writeObject(value.substring)
                value.euler != null -> generator.writeObject(value.euler)
                value.stringLength != null -> generator.writeObject(value.stringLength)
                value.addTime != null -> generator.writeObject(value.addTime)
                value.subtractTime != null -> generator.writeObject(value.subtractTime)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Expression")
            }
        }
    }
}
