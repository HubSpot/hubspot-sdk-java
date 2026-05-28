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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicSurveyMonkeyValueFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filterType: JsonField<FilterType>,
    private val operator: JsonField<String>,
    private val surveyId: JsonField<String>,
    private val surveyQuestion: JsonField<String>,
    private val valueComparison: JsonField<ValueComparison>,
    private val surveyAnswerColId: JsonField<String>,
    private val surveyAnswerRowId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("surveyId") @ExcludeMissing surveyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("surveyQuestion")
        @ExcludeMissing
        surveyQuestion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valueComparison")
        @ExcludeMissing
        valueComparison: JsonField<ValueComparison> = JsonMissing.of(),
        @JsonProperty("surveyAnswerColId")
        @ExcludeMissing
        surveyAnswerColId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("surveyAnswerRowId")
        @ExcludeMissing
        surveyAnswerRowId: JsonField<String> = JsonMissing.of(),
    ) : this(
        filterType,
        operator,
        surveyId,
        surveyQuestion,
        valueComparison,
        surveyAnswerColId,
        surveyAnswerRowId,
        mutableMapOf(),
    )

    /**
     * Defines the type of filter (SURVEY_MONKEY_VALUE).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * Defines the operation to be applied within the filter
     * (HAS_ANSWERED_SURVEY_QUESTION_WITH_VALUE).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * The ID of the survey used in the filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun surveyId(): String = surveyId.getRequired("surveyId")

    /**
     * The question from the survey used in the filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun surveyQuestion(): String = surveyQuestion.getRequired("surveyQuestion")

    /**
     * Specifies the operation used to compare the survey answer value.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valueComparison(): ValueComparison = valueComparison.getRequired("valueComparison")

    /**
     * The column ID of the survey answer used in the filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun surveyAnswerColId(): Optional<String> = surveyAnswerColId.getOptional("surveyAnswerColId")

    /**
     * The row ID of the survey answer used in the filter.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun surveyAnswerRowId(): Optional<String> = surveyAnswerRowId.getOptional("surveyAnswerRowId")

    /**
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterType")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [surveyId].
     *
     * Unlike [surveyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surveyId") @ExcludeMissing fun _surveyId(): JsonField<String> = surveyId

    /**
     * Returns the raw JSON value of [surveyQuestion].
     *
     * Unlike [surveyQuestion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surveyQuestion")
    @ExcludeMissing
    fun _surveyQuestion(): JsonField<String> = surveyQuestion

    /**
     * Returns the raw JSON value of [valueComparison].
     *
     * Unlike [valueComparison], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valueComparison")
    @ExcludeMissing
    fun _valueComparison(): JsonField<ValueComparison> = valueComparison

    /**
     * Returns the raw JSON value of [surveyAnswerColId].
     *
     * Unlike [surveyAnswerColId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("surveyAnswerColId")
    @ExcludeMissing
    fun _surveyAnswerColId(): JsonField<String> = surveyAnswerColId

    /**
     * Returns the raw JSON value of [surveyAnswerRowId].
     *
     * Unlike [surveyAnswerRowId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("surveyAnswerRowId")
    @ExcludeMissing
    fun _surveyAnswerRowId(): JsonField<String> = surveyAnswerRowId

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
         * [PublicSurveyMonkeyValueFilter].
         *
         * The following fields are required:
         * ```java
         * .filterType()
         * .operator()
         * .surveyId()
         * .surveyQuestion()
         * .valueComparison()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSurveyMonkeyValueFilter]. */
    class Builder internal constructor() {

        private var filterType: JsonField<FilterType>? = null
        private var operator: JsonField<String>? = null
        private var surveyId: JsonField<String>? = null
        private var surveyQuestion: JsonField<String>? = null
        private var valueComparison: JsonField<ValueComparison>? = null
        private var surveyAnswerColId: JsonField<String> = JsonMissing.of()
        private var surveyAnswerRowId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSurveyMonkeyValueFilter: PublicSurveyMonkeyValueFilter) = apply {
            filterType = publicSurveyMonkeyValueFilter.filterType
            operator = publicSurveyMonkeyValueFilter.operator
            surveyId = publicSurveyMonkeyValueFilter.surveyId
            surveyQuestion = publicSurveyMonkeyValueFilter.surveyQuestion
            valueComparison = publicSurveyMonkeyValueFilter.valueComparison
            surveyAnswerColId = publicSurveyMonkeyValueFilter.surveyAnswerColId
            surveyAnswerRowId = publicSurveyMonkeyValueFilter.surveyAnswerRowId
            additionalProperties = publicSurveyMonkeyValueFilter.additionalProperties.toMutableMap()
        }

        /** Defines the type of filter (SURVEY_MONKEY_VALUE). */
        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        /**
         * Defines the operation to be applied within the filter
         * (HAS_ANSWERED_SURVEY_QUESTION_WITH_VALUE).
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** The ID of the survey used in the filter. */
        fun surveyId(surveyId: String) = surveyId(JsonField.of(surveyId))

        /**
         * Sets [Builder.surveyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surveyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun surveyId(surveyId: JsonField<String>) = apply { this.surveyId = surveyId }

        /** The question from the survey used in the filter. */
        fun surveyQuestion(surveyQuestion: String) = surveyQuestion(JsonField.of(surveyQuestion))

        /**
         * Sets [Builder.surveyQuestion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surveyQuestion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun surveyQuestion(surveyQuestion: JsonField<String>) = apply {
            this.surveyQuestion = surveyQuestion
        }

        /** Specifies the operation used to compare the survey answer value. */
        fun valueComparison(valueComparison: ValueComparison) =
            valueComparison(JsonField.of(valueComparison))

        /**
         * Sets [Builder.valueComparison] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueComparison] with a well-typed [ValueComparison]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun valueComparison(valueComparison: JsonField<ValueComparison>) = apply {
            this.valueComparison = valueComparison
        }

        /** Alias for calling [valueComparison] with `ValueComparison.ofBool(bool)`. */
        fun valueComparison(bool: PublicBoolPropertyOperation) =
            valueComparison(ValueComparison.ofBool(bool))

        /** Alias for calling [valueComparison] with `ValueComparison.ofNumber(number)`. */
        fun valueComparison(number: PublicNumberPropertyOperation) =
            valueComparison(ValueComparison.ofNumber(number))

        /** Alias for calling [valueComparison] with `ValueComparison.ofString(string)`. */
        fun valueComparison(string: PublicStringPropertyOperation) =
            valueComparison(ValueComparison.ofString(string))

        /** Alias for calling [valueComparison] with `ValueComparison.ofDatetime(datetime)`. */
        fun valueComparison(datetime: PublicDateTimePropertyOperation) =
            valueComparison(ValueComparison.ofDatetime(datetime))

        /** Alias for calling [valueComparison] with `ValueComparison.ofRangedDate(rangedDate)`. */
        fun valueComparison(rangedDate: PublicRangedDatePropertyOperation) =
            valueComparison(ValueComparison.ofRangedDate(rangedDate))

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofComparativePropertyUpdated(comparativePropertyUpdated)`.
         */
        fun valueComparison(comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation) =
            valueComparison(
                ValueComparison.ofComparativePropertyUpdated(comparativePropertyUpdated)
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofComparativeDate(comparativeDate)`.
         */
        fun valueComparison(comparativeDate: PublicComparativeDatePropertyOperation) =
            valueComparison(ValueComparison.ofComparativeDate(comparativeDate))

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofRollingDateRange(rollingDateRange)`.
         */
        fun valueComparison(rollingDateRange: PublicRollingDateRangePropertyOperation) =
            valueComparison(ValueComparison.ofRollingDateRange(rollingDateRange))

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofRollingPropertyUpdated(rollingPropertyUpdated)`.
         */
        fun valueComparison(rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation) =
            valueComparison(ValueComparison.ofRollingPropertyUpdated(rollingPropertyUpdated))

        /**
         * Alias for calling [valueComparison] with `ValueComparison.ofEnumeration(enumeration)`.
         */
        fun valueComparison(enumeration: PublicEnumerationPropertyOperation) =
            valueComparison(ValueComparison.ofEnumeration(enumeration))

        /**
         * Alias for calling [valueComparison] with `ValueComparison.ofAllProperty(allProperty)`.
         */
        fun valueComparison(allProperty: PublicAllPropertyTypesOperation) =
            valueComparison(ValueComparison.ofAllProperty(allProperty))

        /**
         * Alias for calling [valueComparison] with `ValueComparison.ofNumberRanged(numberRanged)`.
         */
        fun valueComparison(numberRanged: PublicRangedNumberPropertyOperation) =
            valueComparison(ValueComparison.ofNumberRanged(numberRanged))

        /**
         * Alias for calling [valueComparison] with `ValueComparison.ofMultistring(multistring)`.
         */
        fun valueComparison(multistring: PublicMultiStringPropertyOperation) =
            valueComparison(ValueComparison.ofMultistring(multistring))

        /** Alias for calling [valueComparison] with `ValueComparison.ofDate(date)`. */
        fun valueComparison(date: PublicDatePropertyOperation) =
            valueComparison(ValueComparison.ofDate(date))

        /**
         * Alias for calling [valueComparison] with `ValueComparison.ofCalendarDate(calendarDate)`.
         */
        fun valueComparison(calendarDate: PublicCalendarDatePropertyOperation) =
            valueComparison(ValueComparison.ofCalendarDate(calendarDate))

        /** Alias for calling [valueComparison] with `ValueComparison.ofTimePoint(timePoint)`. */
        fun valueComparison(timePoint: PublicTimePointOperation) =
            valueComparison(ValueComparison.ofTimePoint(timePoint))

        /** Alias for calling [valueComparison] with `ValueComparison.ofTimeRanged(timeRanged)`. */
        fun valueComparison(timeRanged: PublicRangedTimeOperation) =
            valueComparison(ValueComparison.ofTimeRanged(timeRanged))

        /** The column ID of the survey answer used in the filter. */
        fun surveyAnswerColId(surveyAnswerColId: String) =
            surveyAnswerColId(JsonField.of(surveyAnswerColId))

        /**
         * Sets [Builder.surveyAnswerColId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surveyAnswerColId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun surveyAnswerColId(surveyAnswerColId: JsonField<String>) = apply {
            this.surveyAnswerColId = surveyAnswerColId
        }

        /** The row ID of the survey answer used in the filter. */
        fun surveyAnswerRowId(surveyAnswerRowId: String) =
            surveyAnswerRowId(JsonField.of(surveyAnswerRowId))

        /**
         * Sets [Builder.surveyAnswerRowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surveyAnswerRowId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun surveyAnswerRowId(surveyAnswerRowId: JsonField<String>) = apply {
            this.surveyAnswerRowId = surveyAnswerRowId
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
         * Returns an immutable instance of [PublicSurveyMonkeyValueFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filterType()
         * .operator()
         * .surveyId()
         * .surveyQuestion()
         * .valueComparison()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSurveyMonkeyValueFilter =
            PublicSurveyMonkeyValueFilter(
                checkRequired("filterType", filterType),
                checkRequired("operator", operator),
                checkRequired("surveyId", surveyId),
                checkRequired("surveyQuestion", surveyQuestion),
                checkRequired("valueComparison", valueComparison),
                surveyAnswerColId,
                surveyAnswerRowId,
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
    fun validate(): PublicSurveyMonkeyValueFilter = apply {
        if (validated) {
            return@apply
        }

        filterType().validate()
        operator()
        surveyId()
        surveyQuestion()
        valueComparison().validate()
        surveyAnswerColId()
        surveyAnswerRowId()
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
        (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (surveyId.asKnown().isPresent) 1 else 0) +
            (if (surveyQuestion.asKnown().isPresent) 1 else 0) +
            (valueComparison.asKnown().getOrNull()?.validity() ?: 0) +
            (if (surveyAnswerColId.asKnown().isPresent) 1 else 0) +
            (if (surveyAnswerRowId.asKnown().isPresent) 1 else 0)

    /** Defines the type of filter (SURVEY_MONKEY_VALUE). */
    class FilterType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SURVEY_MONKEY_VALUE = of("SURVEY_MONKEY_VALUE")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            SURVEY_MONKEY_VALUE
        }

        /**
         * An enum containing [FilterType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SURVEY_MONKEY_VALUE,
            /**
             * An enum member indicating that [FilterType] was instantiated with an unknown value.
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
                SURVEY_MONKEY_VALUE -> Value.SURVEY_MONKEY_VALUE
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
                SURVEY_MONKEY_VALUE -> Known.SURVEY_MONKEY_VALUE
                else -> throw HubSpotInvalidDataException("Unknown FilterType: $value")
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
        fun validate(): FilterType = apply {
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

            return other is FilterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies the operation used to compare the survey answer value. */
    @JsonDeserialize(using = ValueComparison.Deserializer::class)
    @JsonSerialize(using = ValueComparison.Serializer::class)
    class ValueComparison
    private constructor(
        private val bool: PublicBoolPropertyOperation? = null,
        private val number: PublicNumberPropertyOperation? = null,
        private val string: PublicStringPropertyOperation? = null,
        private val datetime: PublicDateTimePropertyOperation? = null,
        private val rangedDate: PublicRangedDatePropertyOperation? = null,
        private val comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation? = null,
        private val comparativeDate: PublicComparativeDatePropertyOperation? = null,
        private val rollingDateRange: PublicRollingDateRangePropertyOperation? = null,
        private val rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation? = null,
        private val enumeration: PublicEnumerationPropertyOperation? = null,
        private val allProperty: PublicAllPropertyTypesOperation? = null,
        private val numberRanged: PublicRangedNumberPropertyOperation? = null,
        private val multistring: PublicMultiStringPropertyOperation? = null,
        private val date: PublicDatePropertyOperation? = null,
        private val calendarDate: PublicCalendarDatePropertyOperation? = null,
        private val timePoint: PublicTimePointOperation? = null,
        private val timeRanged: PublicRangedTimeOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bool(): Optional<PublicBoolPropertyOperation> = Optional.ofNullable(bool)

        fun number(): Optional<PublicNumberPropertyOperation> = Optional.ofNullable(number)

        fun string(): Optional<PublicStringPropertyOperation> = Optional.ofNullable(string)

        fun datetime(): Optional<PublicDateTimePropertyOperation> = Optional.ofNullable(datetime)

        fun rangedDate(): Optional<PublicRangedDatePropertyOperation> =
            Optional.ofNullable(rangedDate)

        fun comparativePropertyUpdated(): Optional<PublicComparativePropertyUpdatedOperation> =
            Optional.ofNullable(comparativePropertyUpdated)

        fun comparativeDate(): Optional<PublicComparativeDatePropertyOperation> =
            Optional.ofNullable(comparativeDate)

        fun rollingDateRange(): Optional<PublicRollingDateRangePropertyOperation> =
            Optional.ofNullable(rollingDateRange)

        fun rollingPropertyUpdated(): Optional<PublicRollingPropertyUpdatedOperation> =
            Optional.ofNullable(rollingPropertyUpdated)

        fun enumeration(): Optional<PublicEnumerationPropertyOperation> =
            Optional.ofNullable(enumeration)

        fun allProperty(): Optional<PublicAllPropertyTypesOperation> =
            Optional.ofNullable(allProperty)

        fun numberRanged(): Optional<PublicRangedNumberPropertyOperation> =
            Optional.ofNullable(numberRanged)

        fun multistring(): Optional<PublicMultiStringPropertyOperation> =
            Optional.ofNullable(multistring)

        fun date(): Optional<PublicDatePropertyOperation> = Optional.ofNullable(date)

        fun calendarDate(): Optional<PublicCalendarDatePropertyOperation> =
            Optional.ofNullable(calendarDate)

        fun timePoint(): Optional<PublicTimePointOperation> = Optional.ofNullable(timePoint)

        fun timeRanged(): Optional<PublicRangedTimeOperation> = Optional.ofNullable(timeRanged)

        fun isBool(): Boolean = bool != null

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun isDatetime(): Boolean = datetime != null

        fun isRangedDate(): Boolean = rangedDate != null

        fun isComparativePropertyUpdated(): Boolean = comparativePropertyUpdated != null

        fun isComparativeDate(): Boolean = comparativeDate != null

        fun isRollingDateRange(): Boolean = rollingDateRange != null

        fun isRollingPropertyUpdated(): Boolean = rollingPropertyUpdated != null

        fun isEnumeration(): Boolean = enumeration != null

        fun isAllProperty(): Boolean = allProperty != null

        fun isNumberRanged(): Boolean = numberRanged != null

        fun isMultistring(): Boolean = multistring != null

        fun isDate(): Boolean = date != null

        fun isCalendarDate(): Boolean = calendarDate != null

        fun isTimePoint(): Boolean = timePoint != null

        fun isTimeRanged(): Boolean = timeRanged != null

        fun asBool(): PublicBoolPropertyOperation = bool.getOrThrow("bool")

        fun asNumber(): PublicNumberPropertyOperation = number.getOrThrow("number")

        fun asString(): PublicStringPropertyOperation = string.getOrThrow("string")

        fun asDatetime(): PublicDateTimePropertyOperation = datetime.getOrThrow("datetime")

        fun asRangedDate(): PublicRangedDatePropertyOperation = rangedDate.getOrThrow("rangedDate")

        fun asComparativePropertyUpdated(): PublicComparativePropertyUpdatedOperation =
            comparativePropertyUpdated.getOrThrow("comparativePropertyUpdated")

        fun asComparativeDate(): PublicComparativeDatePropertyOperation =
            comparativeDate.getOrThrow("comparativeDate")

        fun asRollingDateRange(): PublicRollingDateRangePropertyOperation =
            rollingDateRange.getOrThrow("rollingDateRange")

        fun asRollingPropertyUpdated(): PublicRollingPropertyUpdatedOperation =
            rollingPropertyUpdated.getOrThrow("rollingPropertyUpdated")

        fun asEnumeration(): PublicEnumerationPropertyOperation =
            enumeration.getOrThrow("enumeration")

        fun asAllProperty(): PublicAllPropertyTypesOperation = allProperty.getOrThrow("allProperty")

        fun asNumberRanged(): PublicRangedNumberPropertyOperation =
            numberRanged.getOrThrow("numberRanged")

        fun asMultistring(): PublicMultiStringPropertyOperation =
            multistring.getOrThrow("multistring")

        fun asDate(): PublicDatePropertyOperation = date.getOrThrow("date")

        fun asCalendarDate(): PublicCalendarDatePropertyOperation =
            calendarDate.getOrThrow("calendarDate")

        fun asTimePoint(): PublicTimePointOperation = timePoint.getOrThrow("timePoint")

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
         * Optional<String> result = valueComparison.accept(new ValueComparison.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitBool(PublicBoolPropertyOperation bool) {
         *         return Optional.of(bool.toString());
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
                bool != null -> visitor.visitBool(bool)
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                datetime != null -> visitor.visitDatetime(datetime)
                rangedDate != null -> visitor.visitRangedDate(rangedDate)
                comparativePropertyUpdated != null ->
                    visitor.visitComparativePropertyUpdated(comparativePropertyUpdated)
                comparativeDate != null -> visitor.visitComparativeDate(comparativeDate)
                rollingDateRange != null -> visitor.visitRollingDateRange(rollingDateRange)
                rollingPropertyUpdated != null ->
                    visitor.visitRollingPropertyUpdated(rollingPropertyUpdated)
                enumeration != null -> visitor.visitEnumeration(enumeration)
                allProperty != null -> visitor.visitAllProperty(allProperty)
                numberRanged != null -> visitor.visitNumberRanged(numberRanged)
                multistring != null -> visitor.visitMultistring(multistring)
                date != null -> visitor.visitDate(date)
                calendarDate != null -> visitor.visitCalendarDate(calendarDate)
                timePoint != null -> visitor.visitTimePoint(timePoint)
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
        fun validate(): ValueComparison = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBool(bool: PublicBoolPropertyOperation) {
                        bool.validate()
                    }

                    override fun visitNumber(number: PublicNumberPropertyOperation) {
                        number.validate()
                    }

                    override fun visitString(string: PublicStringPropertyOperation) {
                        string.validate()
                    }

                    override fun visitDatetime(datetime: PublicDateTimePropertyOperation) {
                        datetime.validate()
                    }

                    override fun visitRangedDate(rangedDate: PublicRangedDatePropertyOperation) {
                        rangedDate.validate()
                    }

                    override fun visitComparativePropertyUpdated(
                        comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
                    ) {
                        comparativePropertyUpdated.validate()
                    }

                    override fun visitComparativeDate(
                        comparativeDate: PublicComparativeDatePropertyOperation
                    ) {
                        comparativeDate.validate()
                    }

                    override fun visitRollingDateRange(
                        rollingDateRange: PublicRollingDateRangePropertyOperation
                    ) {
                        rollingDateRange.validate()
                    }

                    override fun visitRollingPropertyUpdated(
                        rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
                    ) {
                        rollingPropertyUpdated.validate()
                    }

                    override fun visitEnumeration(enumeration: PublicEnumerationPropertyOperation) {
                        enumeration.validate()
                    }

                    override fun visitAllProperty(allProperty: PublicAllPropertyTypesOperation) {
                        allProperty.validate()
                    }

                    override fun visitNumberRanged(
                        numberRanged: PublicRangedNumberPropertyOperation
                    ) {
                        numberRanged.validate()
                    }

                    override fun visitMultistring(multistring: PublicMultiStringPropertyOperation) {
                        multistring.validate()
                    }

                    override fun visitDate(date: PublicDatePropertyOperation) {
                        date.validate()
                    }

                    override fun visitCalendarDate(
                        calendarDate: PublicCalendarDatePropertyOperation
                    ) {
                        calendarDate.validate()
                    }

                    override fun visitTimePoint(timePoint: PublicTimePointOperation) {
                        timePoint.validate()
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
                    override fun visitBool(bool: PublicBoolPropertyOperation) = bool.validity()

                    override fun visitNumber(number: PublicNumberPropertyOperation) =
                        number.validity()

                    override fun visitString(string: PublicStringPropertyOperation) =
                        string.validity()

                    override fun visitDatetime(datetime: PublicDateTimePropertyOperation) =
                        datetime.validity()

                    override fun visitRangedDate(rangedDate: PublicRangedDatePropertyOperation) =
                        rangedDate.validity()

                    override fun visitComparativePropertyUpdated(
                        comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
                    ) = comparativePropertyUpdated.validity()

                    override fun visitComparativeDate(
                        comparativeDate: PublicComparativeDatePropertyOperation
                    ) = comparativeDate.validity()

                    override fun visitRollingDateRange(
                        rollingDateRange: PublicRollingDateRangePropertyOperation
                    ) = rollingDateRange.validity()

                    override fun visitRollingPropertyUpdated(
                        rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
                    ) = rollingPropertyUpdated.validity()

                    override fun visitEnumeration(enumeration: PublicEnumerationPropertyOperation) =
                        enumeration.validity()

                    override fun visitAllProperty(allProperty: PublicAllPropertyTypesOperation) =
                        allProperty.validity()

                    override fun visitNumberRanged(
                        numberRanged: PublicRangedNumberPropertyOperation
                    ) = numberRanged.validity()

                    override fun visitMultistring(multistring: PublicMultiStringPropertyOperation) =
                        multistring.validity()

                    override fun visitDate(date: PublicDatePropertyOperation) = date.validity()

                    override fun visitCalendarDate(
                        calendarDate: PublicCalendarDatePropertyOperation
                    ) = calendarDate.validity()

                    override fun visitTimePoint(timePoint: PublicTimePointOperation) =
                        timePoint.validity()

                    override fun visitTimeRanged(timeRanged: PublicRangedTimeOperation) =
                        timeRanged.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ValueComparison &&
                bool == other.bool &&
                number == other.number &&
                string == other.string &&
                datetime == other.datetime &&
                rangedDate == other.rangedDate &&
                comparativePropertyUpdated == other.comparativePropertyUpdated &&
                comparativeDate == other.comparativeDate &&
                rollingDateRange == other.rollingDateRange &&
                rollingPropertyUpdated == other.rollingPropertyUpdated &&
                enumeration == other.enumeration &&
                allProperty == other.allProperty &&
                numberRanged == other.numberRanged &&
                multistring == other.multistring &&
                date == other.date &&
                calendarDate == other.calendarDate &&
                timePoint == other.timePoint &&
                timeRanged == other.timeRanged
        }

        override fun hashCode(): Int =
            Objects.hash(
                bool,
                number,
                string,
                datetime,
                rangedDate,
                comparativePropertyUpdated,
                comparativeDate,
                rollingDateRange,
                rollingPropertyUpdated,
                enumeration,
                allProperty,
                numberRanged,
                multistring,
                date,
                calendarDate,
                timePoint,
                timeRanged,
            )

        override fun toString(): String =
            when {
                bool != null -> "ValueComparison{bool=$bool}"
                number != null -> "ValueComparison{number=$number}"
                string != null -> "ValueComparison{string=$string}"
                datetime != null -> "ValueComparison{datetime=$datetime}"
                rangedDate != null -> "ValueComparison{rangedDate=$rangedDate}"
                comparativePropertyUpdated != null ->
                    "ValueComparison{comparativePropertyUpdated=$comparativePropertyUpdated}"
                comparativeDate != null -> "ValueComparison{comparativeDate=$comparativeDate}"
                rollingDateRange != null -> "ValueComparison{rollingDateRange=$rollingDateRange}"
                rollingPropertyUpdated != null ->
                    "ValueComparison{rollingPropertyUpdated=$rollingPropertyUpdated}"
                enumeration != null -> "ValueComparison{enumeration=$enumeration}"
                allProperty != null -> "ValueComparison{allProperty=$allProperty}"
                numberRanged != null -> "ValueComparison{numberRanged=$numberRanged}"
                multistring != null -> "ValueComparison{multistring=$multistring}"
                date != null -> "ValueComparison{date=$date}"
                calendarDate != null -> "ValueComparison{calendarDate=$calendarDate}"
                timePoint != null -> "ValueComparison{timePoint=$timePoint}"
                timeRanged != null -> "ValueComparison{timeRanged=$timeRanged}"
                _json != null -> "ValueComparison{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ValueComparison")
            }

        companion object {

            @JvmStatic fun ofBool(bool: PublicBoolPropertyOperation) = ValueComparison(bool = bool)

            @JvmStatic
            fun ofNumber(number: PublicNumberPropertyOperation) = ValueComparison(number = number)

            @JvmStatic
            fun ofString(string: PublicStringPropertyOperation) = ValueComparison(string = string)

            @JvmStatic
            fun ofDatetime(datetime: PublicDateTimePropertyOperation) =
                ValueComparison(datetime = datetime)

            @JvmStatic
            fun ofRangedDate(rangedDate: PublicRangedDatePropertyOperation) =
                ValueComparison(rangedDate = rangedDate)

            @JvmStatic
            fun ofComparativePropertyUpdated(
                comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
            ) = ValueComparison(comparativePropertyUpdated = comparativePropertyUpdated)

            @JvmStatic
            fun ofComparativeDate(comparativeDate: PublicComparativeDatePropertyOperation) =
                ValueComparison(comparativeDate = comparativeDate)

            @JvmStatic
            fun ofRollingDateRange(rollingDateRange: PublicRollingDateRangePropertyOperation) =
                ValueComparison(rollingDateRange = rollingDateRange)

            @JvmStatic
            fun ofRollingPropertyUpdated(
                rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
            ) = ValueComparison(rollingPropertyUpdated = rollingPropertyUpdated)

            @JvmStatic
            fun ofEnumeration(enumeration: PublicEnumerationPropertyOperation) =
                ValueComparison(enumeration = enumeration)

            @JvmStatic
            fun ofAllProperty(allProperty: PublicAllPropertyTypesOperation) =
                ValueComparison(allProperty = allProperty)

            @JvmStatic
            fun ofNumberRanged(numberRanged: PublicRangedNumberPropertyOperation) =
                ValueComparison(numberRanged = numberRanged)

            @JvmStatic
            fun ofMultistring(multistring: PublicMultiStringPropertyOperation) =
                ValueComparison(multistring = multistring)

            @JvmStatic fun ofDate(date: PublicDatePropertyOperation) = ValueComparison(date = date)

            @JvmStatic
            fun ofCalendarDate(calendarDate: PublicCalendarDatePropertyOperation) =
                ValueComparison(calendarDate = calendarDate)

            @JvmStatic
            fun ofTimePoint(timePoint: PublicTimePointOperation) =
                ValueComparison(timePoint = timePoint)

            @JvmStatic
            fun ofTimeRanged(timeRanged: PublicRangedTimeOperation) =
                ValueComparison(timeRanged = timeRanged)
        }

        /**
         * An interface that defines how to map each variant of [ValueComparison] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitBool(bool: PublicBoolPropertyOperation): T

            fun visitNumber(number: PublicNumberPropertyOperation): T

            fun visitString(string: PublicStringPropertyOperation): T

            fun visitDatetime(datetime: PublicDateTimePropertyOperation): T

            fun visitRangedDate(rangedDate: PublicRangedDatePropertyOperation): T

            fun visitComparativePropertyUpdated(
                comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
            ): T

            fun visitComparativeDate(comparativeDate: PublicComparativeDatePropertyOperation): T

            fun visitRollingDateRange(rollingDateRange: PublicRollingDateRangePropertyOperation): T

            fun visitRollingPropertyUpdated(
                rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
            ): T

            fun visitEnumeration(enumeration: PublicEnumerationPropertyOperation): T

            fun visitAllProperty(allProperty: PublicAllPropertyTypesOperation): T

            fun visitNumberRanged(numberRanged: PublicRangedNumberPropertyOperation): T

            fun visitMultistring(multistring: PublicMultiStringPropertyOperation): T

            fun visitDate(date: PublicDatePropertyOperation): T

            fun visitCalendarDate(calendarDate: PublicCalendarDatePropertyOperation): T

            fun visitTimePoint(timePoint: PublicTimePointOperation): T

            fun visitTimeRanged(timeRanged: PublicRangedTimeOperation): T

            /**
             * Maps an unknown variant of [ValueComparison] to a value of type [T].
             *
             * An instance of [ValueComparison] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown ValueComparison: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ValueComparison>(ValueComparison::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ValueComparison {
                val json = JsonValue.fromJsonNode(node)
                val operationType =
                    json.asObject().getOrNull()?.get("operationType")?.asString()?.getOrNull()

                when (operationType) {
                    "BOOL" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicBoolPropertyOperation>())
                            ?.let { ValueComparison(bool = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "NUMBER" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNumberPropertyOperation>())
                            ?.let { ValueComparison(number = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "STRING" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicStringPropertyOperation>())
                            ?.let { ValueComparison(string = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "DATETIME" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicDateTimePropertyOperation>(),
                            )
                            ?.let { ValueComparison(datetime = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "RANGED_DATE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRangedDatePropertyOperation>(),
                            )
                            ?.let { ValueComparison(rangedDate = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "COMPARATIVE_PROPERTY_UPDATED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicComparativePropertyUpdatedOperation>(),
                            )
                            ?.let { ValueComparison(comparativePropertyUpdated = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "COMPARATIVE_DATE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicComparativeDatePropertyOperation>(),
                            )
                            ?.let { ValueComparison(comparativeDate = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "ROLLING_DATE_RANGE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRollingDateRangePropertyOperation>(),
                            )
                            ?.let { ValueComparison(rollingDateRange = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "ROLLING_PROPERTY_UPDATED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRollingPropertyUpdatedOperation>(),
                            )
                            ?.let { ValueComparison(rollingPropertyUpdated = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "ENUMERATION" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicEnumerationPropertyOperation>(),
                            )
                            ?.let { ValueComparison(enumeration = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "ALL_PROPERTY" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicAllPropertyTypesOperation>(),
                            )
                            ?.let { ValueComparison(allProperty = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "NUMBER_RANGED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRangedNumberPropertyOperation>(),
                            )
                            ?.let { ValueComparison(numberRanged = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "MULTISTRING" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicMultiStringPropertyOperation>(),
                            )
                            ?.let { ValueComparison(multistring = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "DATE" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicDatePropertyOperation>())
                            ?.let { ValueComparison(date = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "CALENDAR_DATE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicCalendarDatePropertyOperation>(),
                            )
                            ?.let { ValueComparison(calendarDate = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "TIME_POINT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())
                            ?.let { ValueComparison(timePoint = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                    "TIME_RANGED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())
                            ?.let { ValueComparison(timeRanged = it, _json = json) }
                            ?: ValueComparison(_json = json)
                    }
                }

                return ValueComparison(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<ValueComparison>(ValueComparison::class) {

            override fun serialize(
                value: ValueComparison,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bool != null -> generator.writeObject(value.bool)
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value.datetime != null -> generator.writeObject(value.datetime)
                    value.rangedDate != null -> generator.writeObject(value.rangedDate)
                    value.comparativePropertyUpdated != null ->
                        generator.writeObject(value.comparativePropertyUpdated)
                    value.comparativeDate != null -> generator.writeObject(value.comparativeDate)
                    value.rollingDateRange != null -> generator.writeObject(value.rollingDateRange)
                    value.rollingPropertyUpdated != null ->
                        generator.writeObject(value.rollingPropertyUpdated)
                    value.enumeration != null -> generator.writeObject(value.enumeration)
                    value.allProperty != null -> generator.writeObject(value.allProperty)
                    value.numberRanged != null -> generator.writeObject(value.numberRanged)
                    value.multistring != null -> generator.writeObject(value.multistring)
                    value.date != null -> generator.writeObject(value.date)
                    value.calendarDate != null -> generator.writeObject(value.calendarDate)
                    value.timePoint != null -> generator.writeObject(value.timePoint)
                    value.timeRanged != null -> generator.writeObject(value.timeRanged)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ValueComparison")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSurveyMonkeyValueFilter &&
            filterType == other.filterType &&
            operator == other.operator &&
            surveyId == other.surveyId &&
            surveyQuestion == other.surveyQuestion &&
            valueComparison == other.valueComparison &&
            surveyAnswerColId == other.surveyAnswerColId &&
            surveyAnswerRowId == other.surveyAnswerRowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            filterType,
            operator,
            surveyId,
            surveyQuestion,
            valueComparison,
            surveyAnswerColId,
            surveyAnswerRowId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSurveyMonkeyValueFilter{filterType=$filterType, operator=$operator, surveyId=$surveyId, surveyQuestion=$surveyQuestion, valueComparison=$valueComparison, surveyAnswerColId=$surveyAnswerColId, surveyAnswerRowId=$surveyAnswerRowId, additionalProperties=$additionalProperties}"
}
