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
import com.hubspot.core.allMaxBy
import com.hubspot.core.checkRequired
import com.hubspot.core.getOrThrow
import com.hubspot.errors.HubSpotInvalidDataException
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

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicBoolPropertyOperation(publicBoolPropertyOperation)`.
         */
        fun valueComparison(publicBoolPropertyOperation: PublicBoolPropertyOperation) =
            valueComparison(
                ValueComparison.ofPublicBoolPropertyOperation(publicBoolPropertyOperation)
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicNumberPropertyOperation(publicNumberPropertyOperation)`.
         */
        fun valueComparison(publicNumberPropertyOperation: PublicNumberPropertyOperation) =
            valueComparison(
                ValueComparison.ofPublicNumberPropertyOperation(publicNumberPropertyOperation)
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicStringPropertyOperation(publicStringPropertyOperation)`.
         */
        fun valueComparison(publicStringPropertyOperation: PublicStringPropertyOperation) =
            valueComparison(
                ValueComparison.ofPublicStringPropertyOperation(publicStringPropertyOperation)
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicDateTimePropertyOperation(publicDateTimePropertyOperation)`.
         */
        fun valueComparison(publicDateTimePropertyOperation: PublicDateTimePropertyOperation) =
            valueComparison(
                ValueComparison.ofPublicDateTimePropertyOperation(publicDateTimePropertyOperation)
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicRangedDatePropertyOperation(publicRangedDatePropertyOperation)`.
         */
        fun valueComparison(publicRangedDatePropertyOperation: PublicRangedDatePropertyOperation) =
            valueComparison(
                ValueComparison.ofPublicRangedDatePropertyOperation(
                    publicRangedDatePropertyOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicComparativePropertyUpdatedOperation(publicComparativePropertyUpdatedOperation)`.
         */
        fun valueComparison(
            publicComparativePropertyUpdatedOperation: PublicComparativePropertyUpdatedOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicComparativePropertyUpdatedOperation(
                    publicComparativePropertyUpdatedOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicComparativeDatePropertyOperation(publicComparativeDatePropertyOperation)`.
         */
        fun valueComparison(
            publicComparativeDatePropertyOperation: PublicComparativeDatePropertyOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicComparativeDatePropertyOperation(
                    publicComparativeDatePropertyOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicRollingDateRangePropertyOperation(publicRollingDateRangePropertyOperation)`.
         */
        fun valueComparison(
            publicRollingDateRangePropertyOperation: PublicRollingDateRangePropertyOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicRollingDateRangePropertyOperation(
                    publicRollingDateRangePropertyOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicRollingPropertyUpdatedOperation(publicRollingPropertyUpdatedOperation)`.
         */
        fun valueComparison(
            publicRollingPropertyUpdatedOperation: PublicRollingPropertyUpdatedOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicRollingPropertyUpdatedOperation(
                    publicRollingPropertyUpdatedOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicEnumerationPropertyOperation(publicEnumerationPropertyOperation)`.
         */
        fun valueComparison(
            publicEnumerationPropertyOperation: PublicEnumerationPropertyOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicEnumerationPropertyOperation(
                    publicEnumerationPropertyOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicAllPropertyTypesOperation(publicAllPropertyTypesOperation)`.
         */
        fun valueComparison(publicAllPropertyTypesOperation: PublicAllPropertyTypesOperation) =
            valueComparison(
                ValueComparison.ofPublicAllPropertyTypesOperation(publicAllPropertyTypesOperation)
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicRangedNumberPropertyOperation(publicRangedNumberPropertyOperation)`.
         */
        fun valueComparison(
            publicRangedNumberPropertyOperation: PublicRangedNumberPropertyOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicRangedNumberPropertyOperation(
                    publicRangedNumberPropertyOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicMultiStringPropertyOperation(publicMultiStringPropertyOperation)`.
         */
        fun valueComparison(
            publicMultiStringPropertyOperation: PublicMultiStringPropertyOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicMultiStringPropertyOperation(
                    publicMultiStringPropertyOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicDatePropertyOperation(publicDatePropertyOperation)`.
         */
        fun valueComparison(publicDatePropertyOperation: PublicDatePropertyOperation) =
            valueComparison(
                ValueComparison.ofPublicDatePropertyOperation(publicDatePropertyOperation)
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicCalendarDatePropertyOperation(publicCalendarDatePropertyOperation)`.
         */
        fun valueComparison(
            publicCalendarDatePropertyOperation: PublicCalendarDatePropertyOperation
        ) =
            valueComparison(
                ValueComparison.ofPublicCalendarDatePropertyOperation(
                    publicCalendarDatePropertyOperation
                )
            )

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicTimePointOperation(publicTimePointOperation)`.
         */
        fun valueComparison(publicTimePointOperation: PublicTimePointOperation) =
            valueComparison(ValueComparison.ofPublicTimePointOperation(publicTimePointOperation))

        /**
         * Alias for calling [valueComparison] with
         * `ValueComparison.ofPublicRangedTimeOperation(publicRangedTimeOperation)`.
         */
        fun valueComparison(publicRangedTimeOperation: PublicRangedTimeOperation) =
            valueComparison(ValueComparison.ofPublicRangedTimeOperation(publicRangedTimeOperation))

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
        private val publicBoolPropertyOperation: PublicBoolPropertyOperation? = null,
        private val publicNumberPropertyOperation: PublicNumberPropertyOperation? = null,
        private val publicStringPropertyOperation: PublicStringPropertyOperation? = null,
        private val publicDateTimePropertyOperation: PublicDateTimePropertyOperation? = null,
        private val publicRangedDatePropertyOperation: PublicRangedDatePropertyOperation? = null,
        private val publicComparativePropertyUpdatedOperation:
            PublicComparativePropertyUpdatedOperation? =
            null,
        private val publicComparativeDatePropertyOperation:
            PublicComparativeDatePropertyOperation? =
            null,
        private val publicRollingDateRangePropertyOperation:
            PublicRollingDateRangePropertyOperation? =
            null,
        private val publicRollingPropertyUpdatedOperation: PublicRollingPropertyUpdatedOperation? =
            null,
        private val publicEnumerationPropertyOperation: PublicEnumerationPropertyOperation? = null,
        private val publicAllPropertyTypesOperation: PublicAllPropertyTypesOperation? = null,
        private val publicRangedNumberPropertyOperation: PublicRangedNumberPropertyOperation? =
            null,
        private val publicMultiStringPropertyOperation: PublicMultiStringPropertyOperation? = null,
        private val publicDatePropertyOperation: PublicDatePropertyOperation? = null,
        private val publicCalendarDatePropertyOperation: PublicCalendarDatePropertyOperation? =
            null,
        private val publicTimePointOperation: PublicTimePointOperation? = null,
        private val publicRangedTimeOperation: PublicRangedTimeOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicBoolPropertyOperation(): Optional<PublicBoolPropertyOperation> =
            Optional.ofNullable(publicBoolPropertyOperation)

        fun publicNumberPropertyOperation(): Optional<PublicNumberPropertyOperation> =
            Optional.ofNullable(publicNumberPropertyOperation)

        fun publicStringPropertyOperation(): Optional<PublicStringPropertyOperation> =
            Optional.ofNullable(publicStringPropertyOperation)

        fun publicDateTimePropertyOperation(): Optional<PublicDateTimePropertyOperation> =
            Optional.ofNullable(publicDateTimePropertyOperation)

        fun publicRangedDatePropertyOperation(): Optional<PublicRangedDatePropertyOperation> =
            Optional.ofNullable(publicRangedDatePropertyOperation)

        fun publicComparativePropertyUpdatedOperation():
            Optional<PublicComparativePropertyUpdatedOperation> =
            Optional.ofNullable(publicComparativePropertyUpdatedOperation)

        fun publicComparativeDatePropertyOperation():
            Optional<PublicComparativeDatePropertyOperation> =
            Optional.ofNullable(publicComparativeDatePropertyOperation)

        fun publicRollingDateRangePropertyOperation():
            Optional<PublicRollingDateRangePropertyOperation> =
            Optional.ofNullable(publicRollingDateRangePropertyOperation)

        fun publicRollingPropertyUpdatedOperation():
            Optional<PublicRollingPropertyUpdatedOperation> =
            Optional.ofNullable(publicRollingPropertyUpdatedOperation)

        fun publicEnumerationPropertyOperation(): Optional<PublicEnumerationPropertyOperation> =
            Optional.ofNullable(publicEnumerationPropertyOperation)

        fun publicAllPropertyTypesOperation(): Optional<PublicAllPropertyTypesOperation> =
            Optional.ofNullable(publicAllPropertyTypesOperation)

        fun publicRangedNumberPropertyOperation(): Optional<PublicRangedNumberPropertyOperation> =
            Optional.ofNullable(publicRangedNumberPropertyOperation)

        fun publicMultiStringPropertyOperation(): Optional<PublicMultiStringPropertyOperation> =
            Optional.ofNullable(publicMultiStringPropertyOperation)

        fun publicDatePropertyOperation(): Optional<PublicDatePropertyOperation> =
            Optional.ofNullable(publicDatePropertyOperation)

        fun publicCalendarDatePropertyOperation(): Optional<PublicCalendarDatePropertyOperation> =
            Optional.ofNullable(publicCalendarDatePropertyOperation)

        fun publicTimePointOperation(): Optional<PublicTimePointOperation> =
            Optional.ofNullable(publicTimePointOperation)

        fun publicRangedTimeOperation(): Optional<PublicRangedTimeOperation> =
            Optional.ofNullable(publicRangedTimeOperation)

        fun isPublicBoolPropertyOperation(): Boolean = publicBoolPropertyOperation != null

        fun isPublicNumberPropertyOperation(): Boolean = publicNumberPropertyOperation != null

        fun isPublicStringPropertyOperation(): Boolean = publicStringPropertyOperation != null

        fun isPublicDateTimePropertyOperation(): Boolean = publicDateTimePropertyOperation != null

        fun isPublicRangedDatePropertyOperation(): Boolean =
            publicRangedDatePropertyOperation != null

        fun isPublicComparativePropertyUpdatedOperation(): Boolean =
            publicComparativePropertyUpdatedOperation != null

        fun isPublicComparativeDatePropertyOperation(): Boolean =
            publicComparativeDatePropertyOperation != null

        fun isPublicRollingDateRangePropertyOperation(): Boolean =
            publicRollingDateRangePropertyOperation != null

        fun isPublicRollingPropertyUpdatedOperation(): Boolean =
            publicRollingPropertyUpdatedOperation != null

        fun isPublicEnumerationPropertyOperation(): Boolean =
            publicEnumerationPropertyOperation != null

        fun isPublicAllPropertyTypesOperation(): Boolean = publicAllPropertyTypesOperation != null

        fun isPublicRangedNumberPropertyOperation(): Boolean =
            publicRangedNumberPropertyOperation != null

        fun isPublicMultiStringPropertyOperation(): Boolean =
            publicMultiStringPropertyOperation != null

        fun isPublicDatePropertyOperation(): Boolean = publicDatePropertyOperation != null

        fun isPublicCalendarDatePropertyOperation(): Boolean =
            publicCalendarDatePropertyOperation != null

        fun isPublicTimePointOperation(): Boolean = publicTimePointOperation != null

        fun isPublicRangedTimeOperation(): Boolean = publicRangedTimeOperation != null

        fun asPublicBoolPropertyOperation(): PublicBoolPropertyOperation =
            publicBoolPropertyOperation.getOrThrow("publicBoolPropertyOperation")

        fun asPublicNumberPropertyOperation(): PublicNumberPropertyOperation =
            publicNumberPropertyOperation.getOrThrow("publicNumberPropertyOperation")

        fun asPublicStringPropertyOperation(): PublicStringPropertyOperation =
            publicStringPropertyOperation.getOrThrow("publicStringPropertyOperation")

        fun asPublicDateTimePropertyOperation(): PublicDateTimePropertyOperation =
            publicDateTimePropertyOperation.getOrThrow("publicDateTimePropertyOperation")

        fun asPublicRangedDatePropertyOperation(): PublicRangedDatePropertyOperation =
            publicRangedDatePropertyOperation.getOrThrow("publicRangedDatePropertyOperation")

        fun asPublicComparativePropertyUpdatedOperation():
            PublicComparativePropertyUpdatedOperation =
            publicComparativePropertyUpdatedOperation.getOrThrow(
                "publicComparativePropertyUpdatedOperation"
            )

        fun asPublicComparativeDatePropertyOperation(): PublicComparativeDatePropertyOperation =
            publicComparativeDatePropertyOperation.getOrThrow(
                "publicComparativeDatePropertyOperation"
            )

        fun asPublicRollingDateRangePropertyOperation(): PublicRollingDateRangePropertyOperation =
            publicRollingDateRangePropertyOperation.getOrThrow(
                "publicRollingDateRangePropertyOperation"
            )

        fun asPublicRollingPropertyUpdatedOperation(): PublicRollingPropertyUpdatedOperation =
            publicRollingPropertyUpdatedOperation.getOrThrow(
                "publicRollingPropertyUpdatedOperation"
            )

        fun asPublicEnumerationPropertyOperation(): PublicEnumerationPropertyOperation =
            publicEnumerationPropertyOperation.getOrThrow("publicEnumerationPropertyOperation")

        fun asPublicAllPropertyTypesOperation(): PublicAllPropertyTypesOperation =
            publicAllPropertyTypesOperation.getOrThrow("publicAllPropertyTypesOperation")

        fun asPublicRangedNumberPropertyOperation(): PublicRangedNumberPropertyOperation =
            publicRangedNumberPropertyOperation.getOrThrow("publicRangedNumberPropertyOperation")

        fun asPublicMultiStringPropertyOperation(): PublicMultiStringPropertyOperation =
            publicMultiStringPropertyOperation.getOrThrow("publicMultiStringPropertyOperation")

        fun asPublicDatePropertyOperation(): PublicDatePropertyOperation =
            publicDatePropertyOperation.getOrThrow("publicDatePropertyOperation")

        fun asPublicCalendarDatePropertyOperation(): PublicCalendarDatePropertyOperation =
            publicCalendarDatePropertyOperation.getOrThrow("publicCalendarDatePropertyOperation")

        fun asPublicTimePointOperation(): PublicTimePointOperation =
            publicTimePointOperation.getOrThrow("publicTimePointOperation")

        fun asPublicRangedTimeOperation(): PublicRangedTimeOperation =
            publicRangedTimeOperation.getOrThrow("publicRangedTimeOperation")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicBoolPropertyOperation != null ->
                    visitor.visitPublicBoolPropertyOperation(publicBoolPropertyOperation)
                publicNumberPropertyOperation != null ->
                    visitor.visitPublicNumberPropertyOperation(publicNumberPropertyOperation)
                publicStringPropertyOperation != null ->
                    visitor.visitPublicStringPropertyOperation(publicStringPropertyOperation)
                publicDateTimePropertyOperation != null ->
                    visitor.visitPublicDateTimePropertyOperation(publicDateTimePropertyOperation)
                publicRangedDatePropertyOperation != null ->
                    visitor.visitPublicRangedDatePropertyOperation(
                        publicRangedDatePropertyOperation
                    )
                publicComparativePropertyUpdatedOperation != null ->
                    visitor.visitPublicComparativePropertyUpdatedOperation(
                        publicComparativePropertyUpdatedOperation
                    )
                publicComparativeDatePropertyOperation != null ->
                    visitor.visitPublicComparativeDatePropertyOperation(
                        publicComparativeDatePropertyOperation
                    )
                publicRollingDateRangePropertyOperation != null ->
                    visitor.visitPublicRollingDateRangePropertyOperation(
                        publicRollingDateRangePropertyOperation
                    )
                publicRollingPropertyUpdatedOperation != null ->
                    visitor.visitPublicRollingPropertyUpdatedOperation(
                        publicRollingPropertyUpdatedOperation
                    )
                publicEnumerationPropertyOperation != null ->
                    visitor.visitPublicEnumerationPropertyOperation(
                        publicEnumerationPropertyOperation
                    )
                publicAllPropertyTypesOperation != null ->
                    visitor.visitPublicAllPropertyTypesOperation(publicAllPropertyTypesOperation)
                publicRangedNumberPropertyOperation != null ->
                    visitor.visitPublicRangedNumberPropertyOperation(
                        publicRangedNumberPropertyOperation
                    )
                publicMultiStringPropertyOperation != null ->
                    visitor.visitPublicMultiStringPropertyOperation(
                        publicMultiStringPropertyOperation
                    )
                publicDatePropertyOperation != null ->
                    visitor.visitPublicDatePropertyOperation(publicDatePropertyOperation)
                publicCalendarDatePropertyOperation != null ->
                    visitor.visitPublicCalendarDatePropertyOperation(
                        publicCalendarDatePropertyOperation
                    )
                publicTimePointOperation != null ->
                    visitor.visitPublicTimePointOperation(publicTimePointOperation)
                publicRangedTimeOperation != null ->
                    visitor.visitPublicRangedTimeOperation(publicRangedTimeOperation)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ValueComparison = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicBoolPropertyOperation(
                        publicBoolPropertyOperation: PublicBoolPropertyOperation
                    ) {
                        publicBoolPropertyOperation.validate()
                    }

                    override fun visitPublicNumberPropertyOperation(
                        publicNumberPropertyOperation: PublicNumberPropertyOperation
                    ) {
                        publicNumberPropertyOperation.validate()
                    }

                    override fun visitPublicStringPropertyOperation(
                        publicStringPropertyOperation: PublicStringPropertyOperation
                    ) {
                        publicStringPropertyOperation.validate()
                    }

                    override fun visitPublicDateTimePropertyOperation(
                        publicDateTimePropertyOperation: PublicDateTimePropertyOperation
                    ) {
                        publicDateTimePropertyOperation.validate()
                    }

                    override fun visitPublicRangedDatePropertyOperation(
                        publicRangedDatePropertyOperation: PublicRangedDatePropertyOperation
                    ) {
                        publicRangedDatePropertyOperation.validate()
                    }

                    override fun visitPublicComparativePropertyUpdatedOperation(
                        publicComparativePropertyUpdatedOperation:
                            PublicComparativePropertyUpdatedOperation
                    ) {
                        publicComparativePropertyUpdatedOperation.validate()
                    }

                    override fun visitPublicComparativeDatePropertyOperation(
                        publicComparativeDatePropertyOperation:
                            PublicComparativeDatePropertyOperation
                    ) {
                        publicComparativeDatePropertyOperation.validate()
                    }

                    override fun visitPublicRollingDateRangePropertyOperation(
                        publicRollingDateRangePropertyOperation:
                            PublicRollingDateRangePropertyOperation
                    ) {
                        publicRollingDateRangePropertyOperation.validate()
                    }

                    override fun visitPublicRollingPropertyUpdatedOperation(
                        publicRollingPropertyUpdatedOperation: PublicRollingPropertyUpdatedOperation
                    ) {
                        publicRollingPropertyUpdatedOperation.validate()
                    }

                    override fun visitPublicEnumerationPropertyOperation(
                        publicEnumerationPropertyOperation: PublicEnumerationPropertyOperation
                    ) {
                        publicEnumerationPropertyOperation.validate()
                    }

                    override fun visitPublicAllPropertyTypesOperation(
                        publicAllPropertyTypesOperation: PublicAllPropertyTypesOperation
                    ) {
                        publicAllPropertyTypesOperation.validate()
                    }

                    override fun visitPublicRangedNumberPropertyOperation(
                        publicRangedNumberPropertyOperation: PublicRangedNumberPropertyOperation
                    ) {
                        publicRangedNumberPropertyOperation.validate()
                    }

                    override fun visitPublicMultiStringPropertyOperation(
                        publicMultiStringPropertyOperation: PublicMultiStringPropertyOperation
                    ) {
                        publicMultiStringPropertyOperation.validate()
                    }

                    override fun visitPublicDatePropertyOperation(
                        publicDatePropertyOperation: PublicDatePropertyOperation
                    ) {
                        publicDatePropertyOperation.validate()
                    }

                    override fun visitPublicCalendarDatePropertyOperation(
                        publicCalendarDatePropertyOperation: PublicCalendarDatePropertyOperation
                    ) {
                        publicCalendarDatePropertyOperation.validate()
                    }

                    override fun visitPublicTimePointOperation(
                        publicTimePointOperation: PublicTimePointOperation
                    ) {
                        publicTimePointOperation.validate()
                    }

                    override fun visitPublicRangedTimeOperation(
                        publicRangedTimeOperation: PublicRangedTimeOperation
                    ) {
                        publicRangedTimeOperation.validate()
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
                    override fun visitPublicBoolPropertyOperation(
                        publicBoolPropertyOperation: PublicBoolPropertyOperation
                    ) = publicBoolPropertyOperation.validity()

                    override fun visitPublicNumberPropertyOperation(
                        publicNumberPropertyOperation: PublicNumberPropertyOperation
                    ) = publicNumberPropertyOperation.validity()

                    override fun visitPublicStringPropertyOperation(
                        publicStringPropertyOperation: PublicStringPropertyOperation
                    ) = publicStringPropertyOperation.validity()

                    override fun visitPublicDateTimePropertyOperation(
                        publicDateTimePropertyOperation: PublicDateTimePropertyOperation
                    ) = publicDateTimePropertyOperation.validity()

                    override fun visitPublicRangedDatePropertyOperation(
                        publicRangedDatePropertyOperation: PublicRangedDatePropertyOperation
                    ) = publicRangedDatePropertyOperation.validity()

                    override fun visitPublicComparativePropertyUpdatedOperation(
                        publicComparativePropertyUpdatedOperation:
                            PublicComparativePropertyUpdatedOperation
                    ) = publicComparativePropertyUpdatedOperation.validity()

                    override fun visitPublicComparativeDatePropertyOperation(
                        publicComparativeDatePropertyOperation:
                            PublicComparativeDatePropertyOperation
                    ) = publicComparativeDatePropertyOperation.validity()

                    override fun visitPublicRollingDateRangePropertyOperation(
                        publicRollingDateRangePropertyOperation:
                            PublicRollingDateRangePropertyOperation
                    ) = publicRollingDateRangePropertyOperation.validity()

                    override fun visitPublicRollingPropertyUpdatedOperation(
                        publicRollingPropertyUpdatedOperation: PublicRollingPropertyUpdatedOperation
                    ) = publicRollingPropertyUpdatedOperation.validity()

                    override fun visitPublicEnumerationPropertyOperation(
                        publicEnumerationPropertyOperation: PublicEnumerationPropertyOperation
                    ) = publicEnumerationPropertyOperation.validity()

                    override fun visitPublicAllPropertyTypesOperation(
                        publicAllPropertyTypesOperation: PublicAllPropertyTypesOperation
                    ) = publicAllPropertyTypesOperation.validity()

                    override fun visitPublicRangedNumberPropertyOperation(
                        publicRangedNumberPropertyOperation: PublicRangedNumberPropertyOperation
                    ) = publicRangedNumberPropertyOperation.validity()

                    override fun visitPublicMultiStringPropertyOperation(
                        publicMultiStringPropertyOperation: PublicMultiStringPropertyOperation
                    ) = publicMultiStringPropertyOperation.validity()

                    override fun visitPublicDatePropertyOperation(
                        publicDatePropertyOperation: PublicDatePropertyOperation
                    ) = publicDatePropertyOperation.validity()

                    override fun visitPublicCalendarDatePropertyOperation(
                        publicCalendarDatePropertyOperation: PublicCalendarDatePropertyOperation
                    ) = publicCalendarDatePropertyOperation.validity()

                    override fun visitPublicTimePointOperation(
                        publicTimePointOperation: PublicTimePointOperation
                    ) = publicTimePointOperation.validity()

                    override fun visitPublicRangedTimeOperation(
                        publicRangedTimeOperation: PublicRangedTimeOperation
                    ) = publicRangedTimeOperation.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ValueComparison &&
                publicBoolPropertyOperation == other.publicBoolPropertyOperation &&
                publicNumberPropertyOperation == other.publicNumberPropertyOperation &&
                publicStringPropertyOperation == other.publicStringPropertyOperation &&
                publicDateTimePropertyOperation == other.publicDateTimePropertyOperation &&
                publicRangedDatePropertyOperation == other.publicRangedDatePropertyOperation &&
                publicComparativePropertyUpdatedOperation ==
                    other.publicComparativePropertyUpdatedOperation &&
                publicComparativeDatePropertyOperation ==
                    other.publicComparativeDatePropertyOperation &&
                publicRollingDateRangePropertyOperation ==
                    other.publicRollingDateRangePropertyOperation &&
                publicRollingPropertyUpdatedOperation ==
                    other.publicRollingPropertyUpdatedOperation &&
                publicEnumerationPropertyOperation == other.publicEnumerationPropertyOperation &&
                publicAllPropertyTypesOperation == other.publicAllPropertyTypesOperation &&
                publicRangedNumberPropertyOperation == other.publicRangedNumberPropertyOperation &&
                publicMultiStringPropertyOperation == other.publicMultiStringPropertyOperation &&
                publicDatePropertyOperation == other.publicDatePropertyOperation &&
                publicCalendarDatePropertyOperation == other.publicCalendarDatePropertyOperation &&
                publicTimePointOperation == other.publicTimePointOperation &&
                publicRangedTimeOperation == other.publicRangedTimeOperation
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicBoolPropertyOperation,
                publicNumberPropertyOperation,
                publicStringPropertyOperation,
                publicDateTimePropertyOperation,
                publicRangedDatePropertyOperation,
                publicComparativePropertyUpdatedOperation,
                publicComparativeDatePropertyOperation,
                publicRollingDateRangePropertyOperation,
                publicRollingPropertyUpdatedOperation,
                publicEnumerationPropertyOperation,
                publicAllPropertyTypesOperation,
                publicRangedNumberPropertyOperation,
                publicMultiStringPropertyOperation,
                publicDatePropertyOperation,
                publicCalendarDatePropertyOperation,
                publicTimePointOperation,
                publicRangedTimeOperation,
            )

        override fun toString(): String =
            when {
                publicBoolPropertyOperation != null ->
                    "ValueComparison{publicBoolPropertyOperation=$publicBoolPropertyOperation}"
                publicNumberPropertyOperation != null ->
                    "ValueComparison{publicNumberPropertyOperation=$publicNumberPropertyOperation}"
                publicStringPropertyOperation != null ->
                    "ValueComparison{publicStringPropertyOperation=$publicStringPropertyOperation}"
                publicDateTimePropertyOperation != null ->
                    "ValueComparison{publicDateTimePropertyOperation=$publicDateTimePropertyOperation}"
                publicRangedDatePropertyOperation != null ->
                    "ValueComparison{publicRangedDatePropertyOperation=$publicRangedDatePropertyOperation}"
                publicComparativePropertyUpdatedOperation != null ->
                    "ValueComparison{publicComparativePropertyUpdatedOperation=$publicComparativePropertyUpdatedOperation}"
                publicComparativeDatePropertyOperation != null ->
                    "ValueComparison{publicComparativeDatePropertyOperation=$publicComparativeDatePropertyOperation}"
                publicRollingDateRangePropertyOperation != null ->
                    "ValueComparison{publicRollingDateRangePropertyOperation=$publicRollingDateRangePropertyOperation}"
                publicRollingPropertyUpdatedOperation != null ->
                    "ValueComparison{publicRollingPropertyUpdatedOperation=$publicRollingPropertyUpdatedOperation}"
                publicEnumerationPropertyOperation != null ->
                    "ValueComparison{publicEnumerationPropertyOperation=$publicEnumerationPropertyOperation}"
                publicAllPropertyTypesOperation != null ->
                    "ValueComparison{publicAllPropertyTypesOperation=$publicAllPropertyTypesOperation}"
                publicRangedNumberPropertyOperation != null ->
                    "ValueComparison{publicRangedNumberPropertyOperation=$publicRangedNumberPropertyOperation}"
                publicMultiStringPropertyOperation != null ->
                    "ValueComparison{publicMultiStringPropertyOperation=$publicMultiStringPropertyOperation}"
                publicDatePropertyOperation != null ->
                    "ValueComparison{publicDatePropertyOperation=$publicDatePropertyOperation}"
                publicCalendarDatePropertyOperation != null ->
                    "ValueComparison{publicCalendarDatePropertyOperation=$publicCalendarDatePropertyOperation}"
                publicTimePointOperation != null ->
                    "ValueComparison{publicTimePointOperation=$publicTimePointOperation}"
                publicRangedTimeOperation != null ->
                    "ValueComparison{publicRangedTimeOperation=$publicRangedTimeOperation}"
                _json != null -> "ValueComparison{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ValueComparison")
            }

        companion object {

            @JvmStatic
            fun ofPublicBoolPropertyOperation(
                publicBoolPropertyOperation: PublicBoolPropertyOperation
            ) = ValueComparison(publicBoolPropertyOperation = publicBoolPropertyOperation)

            @JvmStatic
            fun ofPublicNumberPropertyOperation(
                publicNumberPropertyOperation: PublicNumberPropertyOperation
            ) = ValueComparison(publicNumberPropertyOperation = publicNumberPropertyOperation)

            @JvmStatic
            fun ofPublicStringPropertyOperation(
                publicStringPropertyOperation: PublicStringPropertyOperation
            ) = ValueComparison(publicStringPropertyOperation = publicStringPropertyOperation)

            @JvmStatic
            fun ofPublicDateTimePropertyOperation(
                publicDateTimePropertyOperation: PublicDateTimePropertyOperation
            ) = ValueComparison(publicDateTimePropertyOperation = publicDateTimePropertyOperation)

            @JvmStatic
            fun ofPublicRangedDatePropertyOperation(
                publicRangedDatePropertyOperation: PublicRangedDatePropertyOperation
            ) =
                ValueComparison(
                    publicRangedDatePropertyOperation = publicRangedDatePropertyOperation
                )

            @JvmStatic
            fun ofPublicComparativePropertyUpdatedOperation(
                publicComparativePropertyUpdatedOperation: PublicComparativePropertyUpdatedOperation
            ) =
                ValueComparison(
                    publicComparativePropertyUpdatedOperation =
                        publicComparativePropertyUpdatedOperation
                )

            @JvmStatic
            fun ofPublicComparativeDatePropertyOperation(
                publicComparativeDatePropertyOperation: PublicComparativeDatePropertyOperation
            ) =
                ValueComparison(
                    publicComparativeDatePropertyOperation = publicComparativeDatePropertyOperation
                )

            @JvmStatic
            fun ofPublicRollingDateRangePropertyOperation(
                publicRollingDateRangePropertyOperation: PublicRollingDateRangePropertyOperation
            ) =
                ValueComparison(
                    publicRollingDateRangePropertyOperation =
                        publicRollingDateRangePropertyOperation
                )

            @JvmStatic
            fun ofPublicRollingPropertyUpdatedOperation(
                publicRollingPropertyUpdatedOperation: PublicRollingPropertyUpdatedOperation
            ) =
                ValueComparison(
                    publicRollingPropertyUpdatedOperation = publicRollingPropertyUpdatedOperation
                )

            @JvmStatic
            fun ofPublicEnumerationPropertyOperation(
                publicEnumerationPropertyOperation: PublicEnumerationPropertyOperation
            ) =
                ValueComparison(
                    publicEnumerationPropertyOperation = publicEnumerationPropertyOperation
                )

            @JvmStatic
            fun ofPublicAllPropertyTypesOperation(
                publicAllPropertyTypesOperation: PublicAllPropertyTypesOperation
            ) = ValueComparison(publicAllPropertyTypesOperation = publicAllPropertyTypesOperation)

            @JvmStatic
            fun ofPublicRangedNumberPropertyOperation(
                publicRangedNumberPropertyOperation: PublicRangedNumberPropertyOperation
            ) =
                ValueComparison(
                    publicRangedNumberPropertyOperation = publicRangedNumberPropertyOperation
                )

            @JvmStatic
            fun ofPublicMultiStringPropertyOperation(
                publicMultiStringPropertyOperation: PublicMultiStringPropertyOperation
            ) =
                ValueComparison(
                    publicMultiStringPropertyOperation = publicMultiStringPropertyOperation
                )

            @JvmStatic
            fun ofPublicDatePropertyOperation(
                publicDatePropertyOperation: PublicDatePropertyOperation
            ) = ValueComparison(publicDatePropertyOperation = publicDatePropertyOperation)

            @JvmStatic
            fun ofPublicCalendarDatePropertyOperation(
                publicCalendarDatePropertyOperation: PublicCalendarDatePropertyOperation
            ) =
                ValueComparison(
                    publicCalendarDatePropertyOperation = publicCalendarDatePropertyOperation
                )

            @JvmStatic
            fun ofPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation) =
                ValueComparison(publicTimePointOperation = publicTimePointOperation)

            @JvmStatic
            fun ofPublicRangedTimeOperation(publicRangedTimeOperation: PublicRangedTimeOperation) =
                ValueComparison(publicRangedTimeOperation = publicRangedTimeOperation)
        }

        /**
         * An interface that defines how to map each variant of [ValueComparison] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitPublicBoolPropertyOperation(
                publicBoolPropertyOperation: PublicBoolPropertyOperation
            ): T

            fun visitPublicNumberPropertyOperation(
                publicNumberPropertyOperation: PublicNumberPropertyOperation
            ): T

            fun visitPublicStringPropertyOperation(
                publicStringPropertyOperation: PublicStringPropertyOperation
            ): T

            fun visitPublicDateTimePropertyOperation(
                publicDateTimePropertyOperation: PublicDateTimePropertyOperation
            ): T

            fun visitPublicRangedDatePropertyOperation(
                publicRangedDatePropertyOperation: PublicRangedDatePropertyOperation
            ): T

            fun visitPublicComparativePropertyUpdatedOperation(
                publicComparativePropertyUpdatedOperation: PublicComparativePropertyUpdatedOperation
            ): T

            fun visitPublicComparativeDatePropertyOperation(
                publicComparativeDatePropertyOperation: PublicComparativeDatePropertyOperation
            ): T

            fun visitPublicRollingDateRangePropertyOperation(
                publicRollingDateRangePropertyOperation: PublicRollingDateRangePropertyOperation
            ): T

            fun visitPublicRollingPropertyUpdatedOperation(
                publicRollingPropertyUpdatedOperation: PublicRollingPropertyUpdatedOperation
            ): T

            fun visitPublicEnumerationPropertyOperation(
                publicEnumerationPropertyOperation: PublicEnumerationPropertyOperation
            ): T

            fun visitPublicAllPropertyTypesOperation(
                publicAllPropertyTypesOperation: PublicAllPropertyTypesOperation
            ): T

            fun visitPublicRangedNumberPropertyOperation(
                publicRangedNumberPropertyOperation: PublicRangedNumberPropertyOperation
            ): T

            fun visitPublicMultiStringPropertyOperation(
                publicMultiStringPropertyOperation: PublicMultiStringPropertyOperation
            ): T

            fun visitPublicDatePropertyOperation(
                publicDatePropertyOperation: PublicDatePropertyOperation
            ): T

            fun visitPublicCalendarDatePropertyOperation(
                publicCalendarDatePropertyOperation: PublicCalendarDatePropertyOperation
            ): T

            fun visitPublicTimePointOperation(publicTimePointOperation: PublicTimePointOperation): T

            fun visitPublicRangedTimeOperation(
                publicRangedTimeOperation: PublicRangedTimeOperation
            ): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicBoolPropertyOperation>())
                                ?.let {
                                    ValueComparison(publicBoolPropertyOperation = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicNumberPropertyOperation>())
                                ?.let {
                                    ValueComparison(
                                        publicNumberPropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicStringPropertyOperation>())
                                ?.let {
                                    ValueComparison(
                                        publicStringPropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicDateTimePropertyOperation>())
                                ?.let {
                                    ValueComparison(
                                        publicDateTimePropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRangedDatePropertyOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicRangedDatePropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicComparativePropertyUpdatedOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicComparativePropertyUpdatedOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicComparativeDatePropertyOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicComparativeDatePropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRollingDateRangePropertyOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicRollingDateRangePropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRollingPropertyUpdatedOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicRollingPropertyUpdatedOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicEnumerationPropertyOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicEnumerationPropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAllPropertyTypesOperation>())
                                ?.let {
                                    ValueComparison(
                                        publicAllPropertyTypesOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRangedNumberPropertyOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicRangedNumberPropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicMultiStringPropertyOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicMultiStringPropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicDatePropertyOperation>())
                                ?.let {
                                    ValueComparison(publicDatePropertyOperation = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicCalendarDatePropertyOperation>(),
                                )
                                ?.let {
                                    ValueComparison(
                                        publicCalendarDatePropertyOperation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())?.let {
                                ValueComparison(publicTimePointOperation = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())?.let {
                                ValueComparison(publicRangedTimeOperation = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ValueComparison(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ValueComparison>(ValueComparison::class) {

            override fun serialize(
                value: ValueComparison,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicBoolPropertyOperation != null ->
                        generator.writeObject(value.publicBoolPropertyOperation)
                    value.publicNumberPropertyOperation != null ->
                        generator.writeObject(value.publicNumberPropertyOperation)
                    value.publicStringPropertyOperation != null ->
                        generator.writeObject(value.publicStringPropertyOperation)
                    value.publicDateTimePropertyOperation != null ->
                        generator.writeObject(value.publicDateTimePropertyOperation)
                    value.publicRangedDatePropertyOperation != null ->
                        generator.writeObject(value.publicRangedDatePropertyOperation)
                    value.publicComparativePropertyUpdatedOperation != null ->
                        generator.writeObject(value.publicComparativePropertyUpdatedOperation)
                    value.publicComparativeDatePropertyOperation != null ->
                        generator.writeObject(value.publicComparativeDatePropertyOperation)
                    value.publicRollingDateRangePropertyOperation != null ->
                        generator.writeObject(value.publicRollingDateRangePropertyOperation)
                    value.publicRollingPropertyUpdatedOperation != null ->
                        generator.writeObject(value.publicRollingPropertyUpdatedOperation)
                    value.publicEnumerationPropertyOperation != null ->
                        generator.writeObject(value.publicEnumerationPropertyOperation)
                    value.publicAllPropertyTypesOperation != null ->
                        generator.writeObject(value.publicAllPropertyTypesOperation)
                    value.publicRangedNumberPropertyOperation != null ->
                        generator.writeObject(value.publicRangedNumberPropertyOperation)
                    value.publicMultiStringPropertyOperation != null ->
                        generator.writeObject(value.publicMultiStringPropertyOperation)
                    value.publicDatePropertyOperation != null ->
                        generator.writeObject(value.publicDatePropertyOperation)
                    value.publicCalendarDatePropertyOperation != null ->
                        generator.writeObject(value.publicCalendarDatePropertyOperation)
                    value.publicTimePointOperation != null ->
                        generator.writeObject(value.publicTimePointOperation)
                    value.publicRangedTimeOperation != null ->
                        generator.writeObject(value.publicRangedTimeOperation)
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
