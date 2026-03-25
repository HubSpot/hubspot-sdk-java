// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PropertyFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filterType: JsonField<FilterType>,
    private val operation: JsonField<Operation>,
    private val property: JsonField<String>,
    private val context: JsonField<PropertyFilterContext>,
    private val filterInsightsId: JsonField<Int>,
    private val frameworkFilterId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filterType")
        @ExcludeMissing
        filterType: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("operation")
        @ExcludeMissing
        operation: JsonField<Operation> = JsonMissing.of(),
        @JsonProperty("property") @ExcludeMissing property: JsonField<String> = JsonMissing.of(),
        @JsonProperty("context")
        @ExcludeMissing
        context: JsonField<PropertyFilterContext> = JsonMissing.of(),
        @JsonProperty("filterInsightsId")
        @ExcludeMissing
        filterInsightsId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("frameworkFilterId")
        @ExcludeMissing
        frameworkFilterId: JsonField<Long> = JsonMissing.of(),
    ) : this(
        filterType,
        operation,
        property,
        context,
        filterInsightsId,
        frameworkFilterId,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operation(): Operation = operation.getRequired("operation")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun property(): String = property.getRequired("property")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<PropertyFilterContext> = context.getOptional("context")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterInsightsId(): Optional<Int> = filterInsightsId.getOptional("filterInsightsId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frameworkFilterId(): Optional<Long> = frameworkFilterId.getOptional("frameworkFilterId")

    /**
     * Returns the raw JSON value of [filterType].
     *
     * Unlike [filterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterType")
    @ExcludeMissing
    fun _filterType(): JsonField<FilterType> = filterType

    /**
     * Returns the raw JSON value of [operation].
     *
     * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<Operation> = operation

    /**
     * Returns the raw JSON value of [property].
     *
     * Unlike [property], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("property") @ExcludeMissing fun _property(): JsonField<String> = property

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context")
    @ExcludeMissing
    fun _context(): JsonField<PropertyFilterContext> = context

    /**
     * Returns the raw JSON value of [filterInsightsId].
     *
     * Unlike [filterInsightsId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("filterInsightsId")
    @ExcludeMissing
    fun _filterInsightsId(): JsonField<Int> = filterInsightsId

    /**
     * Returns the raw JSON value of [frameworkFilterId].
     *
     * Unlike [frameworkFilterId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frameworkFilterId")
    @ExcludeMissing
    fun _frameworkFilterId(): JsonField<Long> = frameworkFilterId

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
         * Returns a mutable builder for constructing an instance of [PropertyFilter].
         *
         * The following fields are required:
         * ```java
         * .filterType()
         * .operation()
         * .property()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyFilter]. */
    class Builder internal constructor() {

        private var filterType: JsonField<FilterType>? = null
        private var operation: JsonField<Operation>? = null
        private var property: JsonField<String>? = null
        private var context: JsonField<PropertyFilterContext> = JsonMissing.of()
        private var filterInsightsId: JsonField<Int> = JsonMissing.of()
        private var frameworkFilterId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyFilter: PropertyFilter) = apply {
            filterType = propertyFilter.filterType
            operation = propertyFilter.operation
            property = propertyFilter.property
            context = propertyFilter.context
            filterInsightsId = propertyFilter.filterInsightsId
            frameworkFilterId = propertyFilter.frameworkFilterId
            additionalProperties = propertyFilter.additionalProperties.toMutableMap()
        }

        fun filterType(filterType: FilterType) = filterType(JsonField.of(filterType))

        /**
         * Sets [Builder.filterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterType] with a well-typed [FilterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterType(filterType: JsonField<FilterType>) = apply { this.filterType = filterType }

        fun operation(operation: Operation) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [Operation] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

        /** Alias for calling [operation] with `Operation.ofBoolProperty(boolProperty)`. */
        fun operation(boolProperty: BoolPropertyOperation) =
            operation(Operation.ofBoolProperty(boolProperty))

        /** Alias for calling [operation] with `Operation.ofNumberProperty(numberProperty)`. */
        fun operation(numberProperty: NumberPropertyOperation) =
            operation(Operation.ofNumberProperty(numberProperty))

        /** Alias for calling [operation] with `Operation.ofStringProperty(stringProperty)`. */
        fun operation(stringProperty: StringPropertyOperation) =
            operation(Operation.ofStringProperty(stringProperty))

        /** Alias for calling [operation] with `Operation.ofDateTimeProperty(dateTimeProperty)`. */
        fun operation(dateTimeProperty: DateTimePropertyOperation) =
            operation(Operation.ofDateTimeProperty(dateTimeProperty))

        /**
         * Alias for calling [operation] with `Operation.ofRangedDateProperty(rangedDateProperty)`.
         */
        fun operation(rangedDateProperty: RangedDatePropertyOperation) =
            operation(Operation.ofRangedDateProperty(rangedDateProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofComparativeDateProperty(comparativeDateProperty)`.
         */
        fun operation(comparativeDateProperty: ComparativeDatePropertyOperation) =
            operation(Operation.ofComparativeDateProperty(comparativeDateProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofComparativeBoolProperty(comparativeBoolProperty)`.
         */
        fun operation(comparativeBoolProperty: ComparativeBoolPropertyOperation) =
            operation(Operation.ofComparativeBoolProperty(comparativeBoolProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofComparativeNumberProperty(comparativeNumberProperty)`.
         */
        fun operation(comparativeNumberProperty: ComparativeNumberPropertyOperation) =
            operation(Operation.ofComparativeNumberProperty(comparativeNumberProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofComparativeStringProperty(comparativeStringProperty)`.
         */
        fun operation(comparativeStringProperty: ComparativeStringPropertyOperation) =
            operation(Operation.ofComparativeStringProperty(comparativeStringProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofComparativePropertyUpdated(comparativePropertyUpdated)`.
         */
        fun operation(comparativePropertyUpdated: ComparativePropertyUpdatedOperation) =
            operation(Operation.ofComparativePropertyUpdated(comparativePropertyUpdated))

        /**
         * Alias for calling [operation] with
         * `Operation.ofRollingDateRangeProperty(rollingDateRangeProperty)`.
         */
        fun operation(rollingDateRangeProperty: RollingDateRangePropertyOperation) =
            operation(Operation.ofRollingDateRangeProperty(rollingDateRangeProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofRollingPropertyUpdated(rollingPropertyUpdated)`.
         */
        fun operation(rollingPropertyUpdated: RollingPropertyUpdatedOperation) =
            operation(Operation.ofRollingPropertyUpdated(rollingPropertyUpdated))

        /**
         * Alias for calling [operation] with
         * `Operation.ofEnumerationProperty(enumerationProperty)`.
         */
        fun operation(enumerationProperty: EnumerationPropertyOperation) =
            operation(Operation.ofEnumerationProperty(enumerationProperty))

        /** Alias for calling [operation] with `Operation.ofAllPropertyTypes(allPropertyTypes)`. */
        fun operation(allPropertyTypes: AllPropertyTypesOperation) =
            operation(Operation.ofAllPropertyTypes(allPropertyTypes))

        /**
         * Alias for calling [operation] with
         * `Operation.ofRangedNumberProperty(rangedNumberProperty)`.
         */
        fun operation(rangedNumberProperty: RangedNumberPropertyOperation) =
            operation(Operation.ofRangedNumberProperty(rangedNumberProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofMultiStringProperty(multiStringProperty)`.
         */
        fun operation(multiStringProperty: MultiStringPropertyOperation) =
            operation(Operation.ofMultiStringProperty(multiStringProperty))

        /** Alias for calling [operation] with `Operation.ofDateProperty(dateProperty)`. */
        fun operation(dateProperty: DatePropertyOperation) =
            operation(Operation.ofDateProperty(dateProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofCalendarDateProperty(calendarDateProperty)`.
         */
        fun operation(calendarDateProperty: CalendarDatePropertyOperation) =
            operation(Operation.ofCalendarDateProperty(calendarDateProperty))

        /** Alias for calling [operation] with `Operation.ofTimePoint(timePoint)`. */
        fun operation(timePoint: TimePointOperation) = operation(Operation.ofTimePoint(timePoint))

        /** Alias for calling [operation] with `Operation.ofRangedTime(rangedTime)`. */
        fun operation(rangedTime: RangedTimeOperation) =
            operation(Operation.ofRangedTime(rangedTime))

        /** Alias for calling [operation] with `Operation.ofRegexProperty(regexProperty)`. */
        fun operation(regexProperty: RegexPropertyOperation) =
            operation(Operation.ofRegexProperty(regexProperty))

        fun property(property: String) = property(JsonField.of(property))

        /**
         * Sets [Builder.property] to an arbitrary JSON value.
         *
         * You should usually call [Builder.property] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun property(property: JsonField<String>) = apply { this.property = property }

        fun context(context: PropertyFilterContext) = context(JsonField.of(context))

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [PropertyFilterContext] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun context(context: JsonField<PropertyFilterContext>) = apply { this.context = context }

        fun filterInsightsId(filterInsightsId: Int) =
            filterInsightsId(JsonField.of(filterInsightsId))

        /**
         * Sets [Builder.filterInsightsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterInsightsId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filterInsightsId(filterInsightsId: JsonField<Int>) = apply {
            this.filterInsightsId = filterInsightsId
        }

        fun frameworkFilterId(frameworkFilterId: Long) =
            frameworkFilterId(JsonField.of(frameworkFilterId))

        /**
         * Sets [Builder.frameworkFilterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameworkFilterId] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frameworkFilterId(frameworkFilterId: JsonField<Long>) = apply {
            this.frameworkFilterId = frameworkFilterId
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
         * Returns an immutable instance of [PropertyFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filterType()
         * .operation()
         * .property()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyFilter =
            PropertyFilter(
                checkRequired("filterType", filterType),
                checkRequired("operation", operation),
                checkRequired("property", property),
                context,
                filterInsightsId,
                frameworkFilterId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PropertyFilter = apply {
        if (validated) {
            return@apply
        }

        filterType().validate()
        operation().validate()
        property()
        context().ifPresent { it.validate() }
        filterInsightsId()
        frameworkFilterId()
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
        (filterType.asKnown().getOrNull()?.validity() ?: 0) +
            (operation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (property.asKnown().isPresent) 1 else 0) +
            (context.asKnown().getOrNull()?.validity() ?: 0) +
            (if (filterInsightsId.asKnown().isPresent) 1 else 0) +
            (if (frameworkFilterId.asKnown().isPresent) 1 else 0)

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

            @JvmField val PROPERTY = of("PROPERTY")

            @JvmStatic fun of(value: String) = FilterType(JsonField.of(value))
        }

        /** An enum containing [FilterType]'s known values. */
        enum class Known {
            PROPERTY
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
            PROPERTY,
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
                PROPERTY -> Value.PROPERTY
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
                PROPERTY -> Known.PROPERTY
                else -> throw HubspotInvalidDataException("Unknown FilterType: $value")
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

            return other is FilterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Operation.Deserializer::class)
    @JsonSerialize(using = Operation.Serializer::class)
    class Operation
    private constructor(
        private val boolProperty: BoolPropertyOperation? = null,
        private val numberProperty: NumberPropertyOperation? = null,
        private val stringProperty: StringPropertyOperation? = null,
        private val dateTimeProperty: DateTimePropertyOperation? = null,
        private val rangedDateProperty: RangedDatePropertyOperation? = null,
        private val comparativeDateProperty: ComparativeDatePropertyOperation? = null,
        private val comparativeBoolProperty: ComparativeBoolPropertyOperation? = null,
        private val comparativeNumberProperty: ComparativeNumberPropertyOperation? = null,
        private val comparativeStringProperty: ComparativeStringPropertyOperation? = null,
        private val comparativePropertyUpdated: ComparativePropertyUpdatedOperation? = null,
        private val rollingDateRangeProperty: RollingDateRangePropertyOperation? = null,
        private val rollingPropertyUpdated: RollingPropertyUpdatedOperation? = null,
        private val enumerationProperty: EnumerationPropertyOperation? = null,
        private val allPropertyTypes: AllPropertyTypesOperation? = null,
        private val rangedNumberProperty: RangedNumberPropertyOperation? = null,
        private val multiStringProperty: MultiStringPropertyOperation? = null,
        private val dateProperty: DatePropertyOperation? = null,
        private val calendarDateProperty: CalendarDatePropertyOperation? = null,
        private val timePoint: TimePointOperation? = null,
        private val rangedTime: RangedTimeOperation? = null,
        private val regexProperty: RegexPropertyOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun boolProperty(): Optional<BoolPropertyOperation> = Optional.ofNullable(boolProperty)

        fun numberProperty(): Optional<NumberPropertyOperation> =
            Optional.ofNullable(numberProperty)

        fun stringProperty(): Optional<StringPropertyOperation> =
            Optional.ofNullable(stringProperty)

        fun dateTimeProperty(): Optional<DateTimePropertyOperation> =
            Optional.ofNullable(dateTimeProperty)

        fun rangedDateProperty(): Optional<RangedDatePropertyOperation> =
            Optional.ofNullable(rangedDateProperty)

        fun comparativeDateProperty(): Optional<ComparativeDatePropertyOperation> =
            Optional.ofNullable(comparativeDateProperty)

        fun comparativeBoolProperty(): Optional<ComparativeBoolPropertyOperation> =
            Optional.ofNullable(comparativeBoolProperty)

        fun comparativeNumberProperty(): Optional<ComparativeNumberPropertyOperation> =
            Optional.ofNullable(comparativeNumberProperty)

        fun comparativeStringProperty(): Optional<ComparativeStringPropertyOperation> =
            Optional.ofNullable(comparativeStringProperty)

        fun comparativePropertyUpdated(): Optional<ComparativePropertyUpdatedOperation> =
            Optional.ofNullable(comparativePropertyUpdated)

        fun rollingDateRangeProperty(): Optional<RollingDateRangePropertyOperation> =
            Optional.ofNullable(rollingDateRangeProperty)

        fun rollingPropertyUpdated(): Optional<RollingPropertyUpdatedOperation> =
            Optional.ofNullable(rollingPropertyUpdated)

        fun enumerationProperty(): Optional<EnumerationPropertyOperation> =
            Optional.ofNullable(enumerationProperty)

        fun allPropertyTypes(): Optional<AllPropertyTypesOperation> =
            Optional.ofNullable(allPropertyTypes)

        fun rangedNumberProperty(): Optional<RangedNumberPropertyOperation> =
            Optional.ofNullable(rangedNumberProperty)

        fun multiStringProperty(): Optional<MultiStringPropertyOperation> =
            Optional.ofNullable(multiStringProperty)

        fun dateProperty(): Optional<DatePropertyOperation> = Optional.ofNullable(dateProperty)

        fun calendarDateProperty(): Optional<CalendarDatePropertyOperation> =
            Optional.ofNullable(calendarDateProperty)

        fun timePoint(): Optional<TimePointOperation> = Optional.ofNullable(timePoint)

        fun rangedTime(): Optional<RangedTimeOperation> = Optional.ofNullable(rangedTime)

        fun regexProperty(): Optional<RegexPropertyOperation> = Optional.ofNullable(regexProperty)

        fun isBoolProperty(): Boolean = boolProperty != null

        fun isNumberProperty(): Boolean = numberProperty != null

        fun isStringProperty(): Boolean = stringProperty != null

        fun isDateTimeProperty(): Boolean = dateTimeProperty != null

        fun isRangedDateProperty(): Boolean = rangedDateProperty != null

        fun isComparativeDateProperty(): Boolean = comparativeDateProperty != null

        fun isComparativeBoolProperty(): Boolean = comparativeBoolProperty != null

        fun isComparativeNumberProperty(): Boolean = comparativeNumberProperty != null

        fun isComparativeStringProperty(): Boolean = comparativeStringProperty != null

        fun isComparativePropertyUpdated(): Boolean = comparativePropertyUpdated != null

        fun isRollingDateRangeProperty(): Boolean = rollingDateRangeProperty != null

        fun isRollingPropertyUpdated(): Boolean = rollingPropertyUpdated != null

        fun isEnumerationProperty(): Boolean = enumerationProperty != null

        fun isAllPropertyTypes(): Boolean = allPropertyTypes != null

        fun isRangedNumberProperty(): Boolean = rangedNumberProperty != null

        fun isMultiStringProperty(): Boolean = multiStringProperty != null

        fun isDateProperty(): Boolean = dateProperty != null

        fun isCalendarDateProperty(): Boolean = calendarDateProperty != null

        fun isTimePoint(): Boolean = timePoint != null

        fun isRangedTime(): Boolean = rangedTime != null

        fun isRegexProperty(): Boolean = regexProperty != null

        fun asBoolProperty(): BoolPropertyOperation = boolProperty.getOrThrow("boolProperty")

        fun asNumberProperty(): NumberPropertyOperation =
            numberProperty.getOrThrow("numberProperty")

        fun asStringProperty(): StringPropertyOperation =
            stringProperty.getOrThrow("stringProperty")

        fun asDateTimeProperty(): DateTimePropertyOperation =
            dateTimeProperty.getOrThrow("dateTimeProperty")

        fun asRangedDateProperty(): RangedDatePropertyOperation =
            rangedDateProperty.getOrThrow("rangedDateProperty")

        fun asComparativeDateProperty(): ComparativeDatePropertyOperation =
            comparativeDateProperty.getOrThrow("comparativeDateProperty")

        fun asComparativeBoolProperty(): ComparativeBoolPropertyOperation =
            comparativeBoolProperty.getOrThrow("comparativeBoolProperty")

        fun asComparativeNumberProperty(): ComparativeNumberPropertyOperation =
            comparativeNumberProperty.getOrThrow("comparativeNumberProperty")

        fun asComparativeStringProperty(): ComparativeStringPropertyOperation =
            comparativeStringProperty.getOrThrow("comparativeStringProperty")

        fun asComparativePropertyUpdated(): ComparativePropertyUpdatedOperation =
            comparativePropertyUpdated.getOrThrow("comparativePropertyUpdated")

        fun asRollingDateRangeProperty(): RollingDateRangePropertyOperation =
            rollingDateRangeProperty.getOrThrow("rollingDateRangeProperty")

        fun asRollingPropertyUpdated(): RollingPropertyUpdatedOperation =
            rollingPropertyUpdated.getOrThrow("rollingPropertyUpdated")

        fun asEnumerationProperty(): EnumerationPropertyOperation =
            enumerationProperty.getOrThrow("enumerationProperty")

        fun asAllPropertyTypes(): AllPropertyTypesOperation =
            allPropertyTypes.getOrThrow("allPropertyTypes")

        fun asRangedNumberProperty(): RangedNumberPropertyOperation =
            rangedNumberProperty.getOrThrow("rangedNumberProperty")

        fun asMultiStringProperty(): MultiStringPropertyOperation =
            multiStringProperty.getOrThrow("multiStringProperty")

        fun asDateProperty(): DatePropertyOperation = dateProperty.getOrThrow("dateProperty")

        fun asCalendarDateProperty(): CalendarDatePropertyOperation =
            calendarDateProperty.getOrThrow("calendarDateProperty")

        fun asTimePoint(): TimePointOperation = timePoint.getOrThrow("timePoint")

        fun asRangedTime(): RangedTimeOperation = rangedTime.getOrThrow("rangedTime")

        fun asRegexProperty(): RegexPropertyOperation = regexProperty.getOrThrow("regexProperty")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                boolProperty != null -> visitor.visitBoolProperty(boolProperty)
                numberProperty != null -> visitor.visitNumberProperty(numberProperty)
                stringProperty != null -> visitor.visitStringProperty(stringProperty)
                dateTimeProperty != null -> visitor.visitDateTimeProperty(dateTimeProperty)
                rangedDateProperty != null -> visitor.visitRangedDateProperty(rangedDateProperty)
                comparativeDateProperty != null ->
                    visitor.visitComparativeDateProperty(comparativeDateProperty)
                comparativeBoolProperty != null ->
                    visitor.visitComparativeBoolProperty(comparativeBoolProperty)
                comparativeNumberProperty != null ->
                    visitor.visitComparativeNumberProperty(comparativeNumberProperty)
                comparativeStringProperty != null ->
                    visitor.visitComparativeStringProperty(comparativeStringProperty)
                comparativePropertyUpdated != null ->
                    visitor.visitComparativePropertyUpdated(comparativePropertyUpdated)
                rollingDateRangeProperty != null ->
                    visitor.visitRollingDateRangeProperty(rollingDateRangeProperty)
                rollingPropertyUpdated != null ->
                    visitor.visitRollingPropertyUpdated(rollingPropertyUpdated)
                enumerationProperty != null -> visitor.visitEnumerationProperty(enumerationProperty)
                allPropertyTypes != null -> visitor.visitAllPropertyTypes(allPropertyTypes)
                rangedNumberProperty != null ->
                    visitor.visitRangedNumberProperty(rangedNumberProperty)
                multiStringProperty != null -> visitor.visitMultiStringProperty(multiStringProperty)
                dateProperty != null -> visitor.visitDateProperty(dateProperty)
                calendarDateProperty != null ->
                    visitor.visitCalendarDateProperty(calendarDateProperty)
                timePoint != null -> visitor.visitTimePoint(timePoint)
                rangedTime != null -> visitor.visitRangedTime(rangedTime)
                regexProperty != null -> visitor.visitRegexProperty(regexProperty)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Operation = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBoolProperty(boolProperty: BoolPropertyOperation) {
                        boolProperty.validate()
                    }

                    override fun visitNumberProperty(numberProperty: NumberPropertyOperation) {
                        numberProperty.validate()
                    }

                    override fun visitStringProperty(stringProperty: StringPropertyOperation) {
                        stringProperty.validate()
                    }

                    override fun visitDateTimeProperty(
                        dateTimeProperty: DateTimePropertyOperation
                    ) {
                        dateTimeProperty.validate()
                    }

                    override fun visitRangedDateProperty(
                        rangedDateProperty: RangedDatePropertyOperation
                    ) {
                        rangedDateProperty.validate()
                    }

                    override fun visitComparativeDateProperty(
                        comparativeDateProperty: ComparativeDatePropertyOperation
                    ) {
                        comparativeDateProperty.validate()
                    }

                    override fun visitComparativeBoolProperty(
                        comparativeBoolProperty: ComparativeBoolPropertyOperation
                    ) {
                        comparativeBoolProperty.validate()
                    }

                    override fun visitComparativeNumberProperty(
                        comparativeNumberProperty: ComparativeNumberPropertyOperation
                    ) {
                        comparativeNumberProperty.validate()
                    }

                    override fun visitComparativeStringProperty(
                        comparativeStringProperty: ComparativeStringPropertyOperation
                    ) {
                        comparativeStringProperty.validate()
                    }

                    override fun visitComparativePropertyUpdated(
                        comparativePropertyUpdated: ComparativePropertyUpdatedOperation
                    ) {
                        comparativePropertyUpdated.validate()
                    }

                    override fun visitRollingDateRangeProperty(
                        rollingDateRangeProperty: RollingDateRangePropertyOperation
                    ) {
                        rollingDateRangeProperty.validate()
                    }

                    override fun visitRollingPropertyUpdated(
                        rollingPropertyUpdated: RollingPropertyUpdatedOperation
                    ) {
                        rollingPropertyUpdated.validate()
                    }

                    override fun visitEnumerationProperty(
                        enumerationProperty: EnumerationPropertyOperation
                    ) {
                        enumerationProperty.validate()
                    }

                    override fun visitAllPropertyTypes(
                        allPropertyTypes: AllPropertyTypesOperation
                    ) {
                        allPropertyTypes.validate()
                    }

                    override fun visitRangedNumberProperty(
                        rangedNumberProperty: RangedNumberPropertyOperation
                    ) {
                        rangedNumberProperty.validate()
                    }

                    override fun visitMultiStringProperty(
                        multiStringProperty: MultiStringPropertyOperation
                    ) {
                        multiStringProperty.validate()
                    }

                    override fun visitDateProperty(dateProperty: DatePropertyOperation) {
                        dateProperty.validate()
                    }

                    override fun visitCalendarDateProperty(
                        calendarDateProperty: CalendarDatePropertyOperation
                    ) {
                        calendarDateProperty.validate()
                    }

                    override fun visitTimePoint(timePoint: TimePointOperation) {
                        timePoint.validate()
                    }

                    override fun visitRangedTime(rangedTime: RangedTimeOperation) {
                        rangedTime.validate()
                    }

                    override fun visitRegexProperty(regexProperty: RegexPropertyOperation) {
                        regexProperty.validate()
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
                    override fun visitBoolProperty(boolProperty: BoolPropertyOperation) =
                        boolProperty.validity()

                    override fun visitNumberProperty(numberProperty: NumberPropertyOperation) =
                        numberProperty.validity()

                    override fun visitStringProperty(stringProperty: StringPropertyOperation) =
                        stringProperty.validity()

                    override fun visitDateTimeProperty(
                        dateTimeProperty: DateTimePropertyOperation
                    ) = dateTimeProperty.validity()

                    override fun visitRangedDateProperty(
                        rangedDateProperty: RangedDatePropertyOperation
                    ) = rangedDateProperty.validity()

                    override fun visitComparativeDateProperty(
                        comparativeDateProperty: ComparativeDatePropertyOperation
                    ) = comparativeDateProperty.validity()

                    override fun visitComparativeBoolProperty(
                        comparativeBoolProperty: ComparativeBoolPropertyOperation
                    ) = comparativeBoolProperty.validity()

                    override fun visitComparativeNumberProperty(
                        comparativeNumberProperty: ComparativeNumberPropertyOperation
                    ) = comparativeNumberProperty.validity()

                    override fun visitComparativeStringProperty(
                        comparativeStringProperty: ComparativeStringPropertyOperation
                    ) = comparativeStringProperty.validity()

                    override fun visitComparativePropertyUpdated(
                        comparativePropertyUpdated: ComparativePropertyUpdatedOperation
                    ) = comparativePropertyUpdated.validity()

                    override fun visitRollingDateRangeProperty(
                        rollingDateRangeProperty: RollingDateRangePropertyOperation
                    ) = rollingDateRangeProperty.validity()

                    override fun visitRollingPropertyUpdated(
                        rollingPropertyUpdated: RollingPropertyUpdatedOperation
                    ) = rollingPropertyUpdated.validity()

                    override fun visitEnumerationProperty(
                        enumerationProperty: EnumerationPropertyOperation
                    ) = enumerationProperty.validity()

                    override fun visitAllPropertyTypes(
                        allPropertyTypes: AllPropertyTypesOperation
                    ) = allPropertyTypes.validity()

                    override fun visitRangedNumberProperty(
                        rangedNumberProperty: RangedNumberPropertyOperation
                    ) = rangedNumberProperty.validity()

                    override fun visitMultiStringProperty(
                        multiStringProperty: MultiStringPropertyOperation
                    ) = multiStringProperty.validity()

                    override fun visitDateProperty(dateProperty: DatePropertyOperation) =
                        dateProperty.validity()

                    override fun visitCalendarDateProperty(
                        calendarDateProperty: CalendarDatePropertyOperation
                    ) = calendarDateProperty.validity()

                    override fun visitTimePoint(timePoint: TimePointOperation) =
                        timePoint.validity()

                    override fun visitRangedTime(rangedTime: RangedTimeOperation) =
                        rangedTime.validity()

                    override fun visitRegexProperty(regexProperty: RegexPropertyOperation) =
                        regexProperty.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Operation &&
                boolProperty == other.boolProperty &&
                numberProperty == other.numberProperty &&
                stringProperty == other.stringProperty &&
                dateTimeProperty == other.dateTimeProperty &&
                rangedDateProperty == other.rangedDateProperty &&
                comparativeDateProperty == other.comparativeDateProperty &&
                comparativeBoolProperty == other.comparativeBoolProperty &&
                comparativeNumberProperty == other.comparativeNumberProperty &&
                comparativeStringProperty == other.comparativeStringProperty &&
                comparativePropertyUpdated == other.comparativePropertyUpdated &&
                rollingDateRangeProperty == other.rollingDateRangeProperty &&
                rollingPropertyUpdated == other.rollingPropertyUpdated &&
                enumerationProperty == other.enumerationProperty &&
                allPropertyTypes == other.allPropertyTypes &&
                rangedNumberProperty == other.rangedNumberProperty &&
                multiStringProperty == other.multiStringProperty &&
                dateProperty == other.dateProperty &&
                calendarDateProperty == other.calendarDateProperty &&
                timePoint == other.timePoint &&
                rangedTime == other.rangedTime &&
                regexProperty == other.regexProperty
        }

        override fun hashCode(): Int =
            Objects.hash(
                boolProperty,
                numberProperty,
                stringProperty,
                dateTimeProperty,
                rangedDateProperty,
                comparativeDateProperty,
                comparativeBoolProperty,
                comparativeNumberProperty,
                comparativeStringProperty,
                comparativePropertyUpdated,
                rollingDateRangeProperty,
                rollingPropertyUpdated,
                enumerationProperty,
                allPropertyTypes,
                rangedNumberProperty,
                multiStringProperty,
                dateProperty,
                calendarDateProperty,
                timePoint,
                rangedTime,
                regexProperty,
            )

        override fun toString(): String =
            when {
                boolProperty != null -> "Operation{boolProperty=$boolProperty}"
                numberProperty != null -> "Operation{numberProperty=$numberProperty}"
                stringProperty != null -> "Operation{stringProperty=$stringProperty}"
                dateTimeProperty != null -> "Operation{dateTimeProperty=$dateTimeProperty}"
                rangedDateProperty != null -> "Operation{rangedDateProperty=$rangedDateProperty}"
                comparativeDateProperty != null ->
                    "Operation{comparativeDateProperty=$comparativeDateProperty}"
                comparativeBoolProperty != null ->
                    "Operation{comparativeBoolProperty=$comparativeBoolProperty}"
                comparativeNumberProperty != null ->
                    "Operation{comparativeNumberProperty=$comparativeNumberProperty}"
                comparativeStringProperty != null ->
                    "Operation{comparativeStringProperty=$comparativeStringProperty}"
                comparativePropertyUpdated != null ->
                    "Operation{comparativePropertyUpdated=$comparativePropertyUpdated}"
                rollingDateRangeProperty != null ->
                    "Operation{rollingDateRangeProperty=$rollingDateRangeProperty}"
                rollingPropertyUpdated != null ->
                    "Operation{rollingPropertyUpdated=$rollingPropertyUpdated}"
                enumerationProperty != null -> "Operation{enumerationProperty=$enumerationProperty}"
                allPropertyTypes != null -> "Operation{allPropertyTypes=$allPropertyTypes}"
                rangedNumberProperty != null ->
                    "Operation{rangedNumberProperty=$rangedNumberProperty}"
                multiStringProperty != null -> "Operation{multiStringProperty=$multiStringProperty}"
                dateProperty != null -> "Operation{dateProperty=$dateProperty}"
                calendarDateProperty != null ->
                    "Operation{calendarDateProperty=$calendarDateProperty}"
                timePoint != null -> "Operation{timePoint=$timePoint}"
                rangedTime != null -> "Operation{rangedTime=$rangedTime}"
                regexProperty != null -> "Operation{regexProperty=$regexProperty}"
                _json != null -> "Operation{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Operation")
            }

        companion object {

            @JvmStatic
            fun ofBoolProperty(boolProperty: BoolPropertyOperation) =
                Operation(boolProperty = boolProperty)

            @JvmStatic
            fun ofNumberProperty(numberProperty: NumberPropertyOperation) =
                Operation(numberProperty = numberProperty)

            @JvmStatic
            fun ofStringProperty(stringProperty: StringPropertyOperation) =
                Operation(stringProperty = stringProperty)

            @JvmStatic
            fun ofDateTimeProperty(dateTimeProperty: DateTimePropertyOperation) =
                Operation(dateTimeProperty = dateTimeProperty)

            @JvmStatic
            fun ofRangedDateProperty(rangedDateProperty: RangedDatePropertyOperation) =
                Operation(rangedDateProperty = rangedDateProperty)

            @JvmStatic
            fun ofComparativeDateProperty(
                comparativeDateProperty: ComparativeDatePropertyOperation
            ) = Operation(comparativeDateProperty = comparativeDateProperty)

            @JvmStatic
            fun ofComparativeBoolProperty(
                comparativeBoolProperty: ComparativeBoolPropertyOperation
            ) = Operation(comparativeBoolProperty = comparativeBoolProperty)

            @JvmStatic
            fun ofComparativeNumberProperty(
                comparativeNumberProperty: ComparativeNumberPropertyOperation
            ) = Operation(comparativeNumberProperty = comparativeNumberProperty)

            @JvmStatic
            fun ofComparativeStringProperty(
                comparativeStringProperty: ComparativeStringPropertyOperation
            ) = Operation(comparativeStringProperty = comparativeStringProperty)

            @JvmStatic
            fun ofComparativePropertyUpdated(
                comparativePropertyUpdated: ComparativePropertyUpdatedOperation
            ) = Operation(comparativePropertyUpdated = comparativePropertyUpdated)

            @JvmStatic
            fun ofRollingDateRangeProperty(
                rollingDateRangeProperty: RollingDateRangePropertyOperation
            ) = Operation(rollingDateRangeProperty = rollingDateRangeProperty)

            @JvmStatic
            fun ofRollingPropertyUpdated(rollingPropertyUpdated: RollingPropertyUpdatedOperation) =
                Operation(rollingPropertyUpdated = rollingPropertyUpdated)

            @JvmStatic
            fun ofEnumerationProperty(enumerationProperty: EnumerationPropertyOperation) =
                Operation(enumerationProperty = enumerationProperty)

            @JvmStatic
            fun ofAllPropertyTypes(allPropertyTypes: AllPropertyTypesOperation) =
                Operation(allPropertyTypes = allPropertyTypes)

            @JvmStatic
            fun ofRangedNumberProperty(rangedNumberProperty: RangedNumberPropertyOperation) =
                Operation(rangedNumberProperty = rangedNumberProperty)

            @JvmStatic
            fun ofMultiStringProperty(multiStringProperty: MultiStringPropertyOperation) =
                Operation(multiStringProperty = multiStringProperty)

            @JvmStatic
            fun ofDateProperty(dateProperty: DatePropertyOperation) =
                Operation(dateProperty = dateProperty)

            @JvmStatic
            fun ofCalendarDateProperty(calendarDateProperty: CalendarDatePropertyOperation) =
                Operation(calendarDateProperty = calendarDateProperty)

            @JvmStatic
            fun ofTimePoint(timePoint: TimePointOperation) = Operation(timePoint = timePoint)

            @JvmStatic
            fun ofRangedTime(rangedTime: RangedTimeOperation) = Operation(rangedTime = rangedTime)

            @JvmStatic
            fun ofRegexProperty(regexProperty: RegexPropertyOperation) =
                Operation(regexProperty = regexProperty)
        }

        /**
         * An interface that defines how to map each variant of [Operation] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitBoolProperty(boolProperty: BoolPropertyOperation): T

            fun visitNumberProperty(numberProperty: NumberPropertyOperation): T

            fun visitStringProperty(stringProperty: StringPropertyOperation): T

            fun visitDateTimeProperty(dateTimeProperty: DateTimePropertyOperation): T

            fun visitRangedDateProperty(rangedDateProperty: RangedDatePropertyOperation): T

            fun visitComparativeDateProperty(
                comparativeDateProperty: ComparativeDatePropertyOperation
            ): T

            fun visitComparativeBoolProperty(
                comparativeBoolProperty: ComparativeBoolPropertyOperation
            ): T

            fun visitComparativeNumberProperty(
                comparativeNumberProperty: ComparativeNumberPropertyOperation
            ): T

            fun visitComparativeStringProperty(
                comparativeStringProperty: ComparativeStringPropertyOperation
            ): T

            fun visitComparativePropertyUpdated(
                comparativePropertyUpdated: ComparativePropertyUpdatedOperation
            ): T

            fun visitRollingDateRangeProperty(
                rollingDateRangeProperty: RollingDateRangePropertyOperation
            ): T

            fun visitRollingPropertyUpdated(
                rollingPropertyUpdated: RollingPropertyUpdatedOperation
            ): T

            fun visitEnumerationProperty(enumerationProperty: EnumerationPropertyOperation): T

            fun visitAllPropertyTypes(allPropertyTypes: AllPropertyTypesOperation): T

            fun visitRangedNumberProperty(rangedNumberProperty: RangedNumberPropertyOperation): T

            fun visitMultiStringProperty(multiStringProperty: MultiStringPropertyOperation): T

            fun visitDateProperty(dateProperty: DatePropertyOperation): T

            fun visitCalendarDateProperty(calendarDateProperty: CalendarDatePropertyOperation): T

            fun visitTimePoint(timePoint: TimePointOperation): T

            fun visitRangedTime(rangedTime: RangedTimeOperation): T

            fun visitRegexProperty(regexProperty: RegexPropertyOperation): T

            /**
             * Maps an unknown variant of [Operation] to a value of type [T].
             *
             * An instance of [Operation] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Operation: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Operation>(Operation::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Operation {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<BoolPropertyOperation>())?.let {
                                Operation(boolProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberPropertyOperation>())?.let {
                                Operation(numberProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringPropertyOperation>())?.let {
                                Operation(stringProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DateTimePropertyOperation>())?.let {
                                Operation(dateTimeProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RangedDatePropertyOperation>())
                                ?.let { Operation(rangedDateProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ComparativeDatePropertyOperation>())
                                ?.let { Operation(comparativeDateProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ComparativeBoolPropertyOperation>())
                                ?.let { Operation(comparativeBoolProperty = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ComparativeNumberPropertyOperation>(),
                                )
                                ?.let { Operation(comparativeNumberProperty = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ComparativeStringPropertyOperation>(),
                                )
                                ?.let { Operation(comparativeStringProperty = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ComparativePropertyUpdatedOperation>(),
                                )
                                ?.let { Operation(comparativePropertyUpdated = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<RollingDateRangePropertyOperation>(),
                                )
                                ?.let { Operation(rollingDateRangeProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<RollingPropertyUpdatedOperation>())
                                ?.let { Operation(rollingPropertyUpdated = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<EnumerationPropertyOperation>())
                                ?.let { Operation(enumerationProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<AllPropertyTypesOperation>())?.let {
                                Operation(allPropertyTypes = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RangedNumberPropertyOperation>())
                                ?.let { Operation(rangedNumberProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<MultiStringPropertyOperation>())
                                ?.let { Operation(multiStringProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<DatePropertyOperation>())?.let {
                                Operation(dateProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CalendarDatePropertyOperation>())
                                ?.let { Operation(calendarDateProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<TimePointOperation>())?.let {
                                Operation(timePoint = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RangedTimeOperation>())?.let {
                                Operation(rangedTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RegexPropertyOperation>())?.let {
                                Operation(regexProperty = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Operation(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Operation>(Operation::class) {

            override fun serialize(
                value: Operation,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.boolProperty != null -> generator.writeObject(value.boolProperty)
                    value.numberProperty != null -> generator.writeObject(value.numberProperty)
                    value.stringProperty != null -> generator.writeObject(value.stringProperty)
                    value.dateTimeProperty != null -> generator.writeObject(value.dateTimeProperty)
                    value.rangedDateProperty != null ->
                        generator.writeObject(value.rangedDateProperty)
                    value.comparativeDateProperty != null ->
                        generator.writeObject(value.comparativeDateProperty)
                    value.comparativeBoolProperty != null ->
                        generator.writeObject(value.comparativeBoolProperty)
                    value.comparativeNumberProperty != null ->
                        generator.writeObject(value.comparativeNumberProperty)
                    value.comparativeStringProperty != null ->
                        generator.writeObject(value.comparativeStringProperty)
                    value.comparativePropertyUpdated != null ->
                        generator.writeObject(value.comparativePropertyUpdated)
                    value.rollingDateRangeProperty != null ->
                        generator.writeObject(value.rollingDateRangeProperty)
                    value.rollingPropertyUpdated != null ->
                        generator.writeObject(value.rollingPropertyUpdated)
                    value.enumerationProperty != null ->
                        generator.writeObject(value.enumerationProperty)
                    value.allPropertyTypes != null -> generator.writeObject(value.allPropertyTypes)
                    value.rangedNumberProperty != null ->
                        generator.writeObject(value.rangedNumberProperty)
                    value.multiStringProperty != null ->
                        generator.writeObject(value.multiStringProperty)
                    value.dateProperty != null -> generator.writeObject(value.dateProperty)
                    value.calendarDateProperty != null ->
                        generator.writeObject(value.calendarDateProperty)
                    value.timePoint != null -> generator.writeObject(value.timePoint)
                    value.rangedTime != null -> generator.writeObject(value.rangedTime)
                    value.regexProperty != null -> generator.writeObject(value.regexProperty)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Operation")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyFilter &&
            filterType == other.filterType &&
            operation == other.operation &&
            property == other.property &&
            context == other.context &&
            filterInsightsId == other.filterInsightsId &&
            frameworkFilterId == other.frameworkFilterId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            filterType,
            operation,
            property,
            context,
            filterInsightsId,
            frameworkFilterId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyFilter{filterType=$filterType, operation=$operation, property=$property, context=$context, filterInsightsId=$filterInsightsId, frameworkFilterId=$frameworkFilterId, additionalProperties=$additionalProperties}"
}
