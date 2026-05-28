// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operation(): Operation = operation.getRequired("operation")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun property(): String = property.getRequired("property")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<PropertyFilterContext> = context.getOptional("context")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterInsightsId(): Optional<Int> = filterInsightsId.getOptional("filterInsightsId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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

        /** Alias for calling [operation] with `Operation.ofBool(bool)`. */
        fun operation(bool: BoolPropertyOperation) = operation(Operation.ofBool(bool))

        /** Alias for calling [operation] with `Operation.ofNumber(number)`. */
        fun operation(number: NumberPropertyOperation) = operation(Operation.ofNumber(number))

        /** Alias for calling [operation] with `Operation.ofString(string)`. */
        fun operation(string: StringPropertyOperation) = operation(Operation.ofString(string))

        /** Alias for calling [operation] with `Operation.ofDatetime(datetime)`. */
        fun operation(datetime: DateTimePropertyOperation) =
            operation(Operation.ofDatetime(datetime))

        /** Alias for calling [operation] with `Operation.ofDatetimeRanged(datetimeRanged)`. */
        fun operation(datetimeRanged: RangedDatePropertyOperation) =
            operation(Operation.ofDatetimeRanged(datetimeRanged))

        /**
         * Alias for calling [operation] with
         * `Operation.ofDatetimeComparative(datetimeComparative)`.
         */
        fun operation(datetimeComparative: ComparativeDatePropertyOperation) =
            operation(Operation.ofDatetimeComparative(datetimeComparative))

        /** Alias for calling [operation] with `Operation.ofBoolComparative(boolComparative)`. */
        fun operation(boolComparative: ComparativeBoolPropertyOperation) =
            operation(Operation.ofBoolComparative(boolComparative))

        /**
         * Alias for calling [operation] with `Operation.ofNumberComparative(numberComparative)`.
         */
        fun operation(numberComparative: ComparativeNumberPropertyOperation) =
            operation(Operation.ofNumberComparative(numberComparative))

        /**
         * Alias for calling [operation] with `Operation.ofStringComparative(stringComparative)`.
         */
        fun operation(stringComparative: ComparativeStringPropertyOperation) =
            operation(Operation.ofStringComparative(stringComparative))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPropertyUpdatedComparative(propertyUpdatedComparative)`.
         */
        fun operation(propertyUpdatedComparative: ComparativePropertyUpdatedOperation) =
            operation(Operation.ofPropertyUpdatedComparative(propertyUpdatedComparative))

        /** Alias for calling [operation] with `Operation.ofDatetimeRolling(datetimeRolling)`. */
        fun operation(datetimeRolling: RollingDateRangePropertyOperation) =
            operation(Operation.ofDatetimeRolling(datetimeRolling))

        /**
         * Alias for calling [operation] with
         * `Operation.ofRollingPropertyUpdated(rollingPropertyUpdated)`.
         */
        fun operation(rollingPropertyUpdated: RollingPropertyUpdatedOperation) =
            operation(Operation.ofRollingPropertyUpdated(rollingPropertyUpdated))

        /** Alias for calling [operation] with `Operation.ofEnumeration(enumeration)`. */
        fun operation(enumeration: EnumerationPropertyOperation) =
            operation(Operation.ofEnumeration(enumeration))

        /** Alias for calling [operation] with `Operation.ofAlltypes(alltypes)`. */
        fun operation(alltypes: AllPropertyTypesOperation) =
            operation(Operation.ofAlltypes(alltypes))

        /** Alias for calling [operation] with `Operation.ofNumberRanged(numberRanged)`. */
        fun operation(numberRanged: RangedNumberPropertyOperation) =
            operation(Operation.ofNumberRanged(numberRanged))

        /** Alias for calling [operation] with `Operation.ofMultistring(multistring)`. */
        fun operation(multistring: MultiStringPropertyOperation) =
            operation(Operation.ofMultistring(multistring))

        /** Alias for calling [operation] with `Operation.ofDate(date)`. */
        fun operation(date: DatePropertyOperation) = operation(Operation.ofDate(date))

        /** Alias for calling [operation] with `Operation.ofCalendarDate(calendarDate)`. */
        fun operation(calendarDate: CalendarDatePropertyOperation) =
            operation(Operation.ofCalendarDate(calendarDate))

        /** Alias for calling [operation] with `Operation.ofTimepoint(timepoint)`. */
        fun operation(timepoint: TimePointOperation) = operation(Operation.ofTimepoint(timepoint))

        /** Alias for calling [operation] with `Operation.ofRangedtime(rangedtime)`. */
        fun operation(rangedtime: RangedTimeOperation) =
            operation(Operation.ofRangedtime(rangedtime))

        /** Alias for calling [operation] with `Operation.ofRegex(regex)`. */
        fun operation(regex: RegexPropertyOperation) = operation(Operation.ofRegex(regex))

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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PROPERTY -> Known.PROPERTY
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

    @JsonDeserialize(using = Operation.Deserializer::class)
    @JsonSerialize(using = Operation.Serializer::class)
    class Operation
    private constructor(
        private val bool: BoolPropertyOperation? = null,
        private val number: NumberPropertyOperation? = null,
        private val string: StringPropertyOperation? = null,
        private val datetime: DateTimePropertyOperation? = null,
        private val datetimeRanged: RangedDatePropertyOperation? = null,
        private val datetimeComparative: ComparativeDatePropertyOperation? = null,
        private val boolComparative: ComparativeBoolPropertyOperation? = null,
        private val numberComparative: ComparativeNumberPropertyOperation? = null,
        private val stringComparative: ComparativeStringPropertyOperation? = null,
        private val propertyUpdatedComparative: ComparativePropertyUpdatedOperation? = null,
        private val datetimeRolling: RollingDateRangePropertyOperation? = null,
        private val rollingPropertyUpdated: RollingPropertyUpdatedOperation? = null,
        private val enumeration: EnumerationPropertyOperation? = null,
        private val alltypes: AllPropertyTypesOperation? = null,
        private val numberRanged: RangedNumberPropertyOperation? = null,
        private val multistring: MultiStringPropertyOperation? = null,
        private val date: DatePropertyOperation? = null,
        private val calendarDate: CalendarDatePropertyOperation? = null,
        private val timepoint: TimePointOperation? = null,
        private val rangedtime: RangedTimeOperation? = null,
        private val regex: RegexPropertyOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bool(): Optional<BoolPropertyOperation> = Optional.ofNullable(bool)

        fun number(): Optional<NumberPropertyOperation> = Optional.ofNullable(number)

        fun string(): Optional<StringPropertyOperation> = Optional.ofNullable(string)

        fun datetime(): Optional<DateTimePropertyOperation> = Optional.ofNullable(datetime)

        fun datetimeRanged(): Optional<RangedDatePropertyOperation> =
            Optional.ofNullable(datetimeRanged)

        fun datetimeComparative(): Optional<ComparativeDatePropertyOperation> =
            Optional.ofNullable(datetimeComparative)

        fun boolComparative(): Optional<ComparativeBoolPropertyOperation> =
            Optional.ofNullable(boolComparative)

        fun numberComparative(): Optional<ComparativeNumberPropertyOperation> =
            Optional.ofNullable(numberComparative)

        fun stringComparative(): Optional<ComparativeStringPropertyOperation> =
            Optional.ofNullable(stringComparative)

        fun propertyUpdatedComparative(): Optional<ComparativePropertyUpdatedOperation> =
            Optional.ofNullable(propertyUpdatedComparative)

        fun datetimeRolling(): Optional<RollingDateRangePropertyOperation> =
            Optional.ofNullable(datetimeRolling)

        fun rollingPropertyUpdated(): Optional<RollingPropertyUpdatedOperation> =
            Optional.ofNullable(rollingPropertyUpdated)

        fun enumeration(): Optional<EnumerationPropertyOperation> = Optional.ofNullable(enumeration)

        fun alltypes(): Optional<AllPropertyTypesOperation> = Optional.ofNullable(alltypes)

        fun numberRanged(): Optional<RangedNumberPropertyOperation> =
            Optional.ofNullable(numberRanged)

        fun multistring(): Optional<MultiStringPropertyOperation> = Optional.ofNullable(multistring)

        fun date(): Optional<DatePropertyOperation> = Optional.ofNullable(date)

        fun calendarDate(): Optional<CalendarDatePropertyOperation> =
            Optional.ofNullable(calendarDate)

        fun timepoint(): Optional<TimePointOperation> = Optional.ofNullable(timepoint)

        fun rangedtime(): Optional<RangedTimeOperation> = Optional.ofNullable(rangedtime)

        fun regex(): Optional<RegexPropertyOperation> = Optional.ofNullable(regex)

        fun isBool(): Boolean = bool != null

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun isDatetime(): Boolean = datetime != null

        fun isDatetimeRanged(): Boolean = datetimeRanged != null

        fun isDatetimeComparative(): Boolean = datetimeComparative != null

        fun isBoolComparative(): Boolean = boolComparative != null

        fun isNumberComparative(): Boolean = numberComparative != null

        fun isStringComparative(): Boolean = stringComparative != null

        fun isPropertyUpdatedComparative(): Boolean = propertyUpdatedComparative != null

        fun isDatetimeRolling(): Boolean = datetimeRolling != null

        fun isRollingPropertyUpdated(): Boolean = rollingPropertyUpdated != null

        fun isEnumeration(): Boolean = enumeration != null

        fun isAlltypes(): Boolean = alltypes != null

        fun isNumberRanged(): Boolean = numberRanged != null

        fun isMultistring(): Boolean = multistring != null

        fun isDate(): Boolean = date != null

        fun isCalendarDate(): Boolean = calendarDate != null

        fun isTimepoint(): Boolean = timepoint != null

        fun isRangedtime(): Boolean = rangedtime != null

        fun isRegex(): Boolean = regex != null

        fun asBool(): BoolPropertyOperation = bool.getOrThrow("bool")

        fun asNumber(): NumberPropertyOperation = number.getOrThrow("number")

        fun asString(): StringPropertyOperation = string.getOrThrow("string")

        fun asDatetime(): DateTimePropertyOperation = datetime.getOrThrow("datetime")

        fun asDatetimeRanged(): RangedDatePropertyOperation =
            datetimeRanged.getOrThrow("datetimeRanged")

        fun asDatetimeComparative(): ComparativeDatePropertyOperation =
            datetimeComparative.getOrThrow("datetimeComparative")

        fun asBoolComparative(): ComparativeBoolPropertyOperation =
            boolComparative.getOrThrow("boolComparative")

        fun asNumberComparative(): ComparativeNumberPropertyOperation =
            numberComparative.getOrThrow("numberComparative")

        fun asStringComparative(): ComparativeStringPropertyOperation =
            stringComparative.getOrThrow("stringComparative")

        fun asPropertyUpdatedComparative(): ComparativePropertyUpdatedOperation =
            propertyUpdatedComparative.getOrThrow("propertyUpdatedComparative")

        fun asDatetimeRolling(): RollingDateRangePropertyOperation =
            datetimeRolling.getOrThrow("datetimeRolling")

        fun asRollingPropertyUpdated(): RollingPropertyUpdatedOperation =
            rollingPropertyUpdated.getOrThrow("rollingPropertyUpdated")

        fun asEnumeration(): EnumerationPropertyOperation = enumeration.getOrThrow("enumeration")

        fun asAlltypes(): AllPropertyTypesOperation = alltypes.getOrThrow("alltypes")

        fun asNumberRanged(): RangedNumberPropertyOperation =
            numberRanged.getOrThrow("numberRanged")

        fun asMultistring(): MultiStringPropertyOperation = multistring.getOrThrow("multistring")

        fun asDate(): DatePropertyOperation = date.getOrThrow("date")

        fun asCalendarDate(): CalendarDatePropertyOperation =
            calendarDate.getOrThrow("calendarDate")

        fun asTimepoint(): TimePointOperation = timepoint.getOrThrow("timepoint")

        fun asRangedtime(): RangedTimeOperation = rangedtime.getOrThrow("rangedtime")

        fun asRegex(): RegexPropertyOperation = regex.getOrThrow("regex")

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
         * Optional<String> result = operation.accept(new Operation.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitBool(BoolPropertyOperation bool) {
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
                datetimeRanged != null -> visitor.visitDatetimeRanged(datetimeRanged)
                datetimeComparative != null -> visitor.visitDatetimeComparative(datetimeComparative)
                boolComparative != null -> visitor.visitBoolComparative(boolComparative)
                numberComparative != null -> visitor.visitNumberComparative(numberComparative)
                stringComparative != null -> visitor.visitStringComparative(stringComparative)
                propertyUpdatedComparative != null ->
                    visitor.visitPropertyUpdatedComparative(propertyUpdatedComparative)
                datetimeRolling != null -> visitor.visitDatetimeRolling(datetimeRolling)
                rollingPropertyUpdated != null ->
                    visitor.visitRollingPropertyUpdated(rollingPropertyUpdated)
                enumeration != null -> visitor.visitEnumeration(enumeration)
                alltypes != null -> visitor.visitAlltypes(alltypes)
                numberRanged != null -> visitor.visitNumberRanged(numberRanged)
                multistring != null -> visitor.visitMultistring(multistring)
                date != null -> visitor.visitDate(date)
                calendarDate != null -> visitor.visitCalendarDate(calendarDate)
                timepoint != null -> visitor.visitTimepoint(timepoint)
                rangedtime != null -> visitor.visitRangedtime(rangedtime)
                regex != null -> visitor.visitRegex(regex)
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
        fun validate(): Operation = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBool(bool: BoolPropertyOperation) {
                        bool.validate()
                    }

                    override fun visitNumber(number: NumberPropertyOperation) {
                        number.validate()
                    }

                    override fun visitString(string: StringPropertyOperation) {
                        string.validate()
                    }

                    override fun visitDatetime(datetime: DateTimePropertyOperation) {
                        datetime.validate()
                    }

                    override fun visitDatetimeRanged(datetimeRanged: RangedDatePropertyOperation) {
                        datetimeRanged.validate()
                    }

                    override fun visitDatetimeComparative(
                        datetimeComparative: ComparativeDatePropertyOperation
                    ) {
                        datetimeComparative.validate()
                    }

                    override fun visitBoolComparative(
                        boolComparative: ComparativeBoolPropertyOperation
                    ) {
                        boolComparative.validate()
                    }

                    override fun visitNumberComparative(
                        numberComparative: ComparativeNumberPropertyOperation
                    ) {
                        numberComparative.validate()
                    }

                    override fun visitStringComparative(
                        stringComparative: ComparativeStringPropertyOperation
                    ) {
                        stringComparative.validate()
                    }

                    override fun visitPropertyUpdatedComparative(
                        propertyUpdatedComparative: ComparativePropertyUpdatedOperation
                    ) {
                        propertyUpdatedComparative.validate()
                    }

                    override fun visitDatetimeRolling(
                        datetimeRolling: RollingDateRangePropertyOperation
                    ) {
                        datetimeRolling.validate()
                    }

                    override fun visitRollingPropertyUpdated(
                        rollingPropertyUpdated: RollingPropertyUpdatedOperation
                    ) {
                        rollingPropertyUpdated.validate()
                    }

                    override fun visitEnumeration(enumeration: EnumerationPropertyOperation) {
                        enumeration.validate()
                    }

                    override fun visitAlltypes(alltypes: AllPropertyTypesOperation) {
                        alltypes.validate()
                    }

                    override fun visitNumberRanged(numberRanged: RangedNumberPropertyOperation) {
                        numberRanged.validate()
                    }

                    override fun visitMultistring(multistring: MultiStringPropertyOperation) {
                        multistring.validate()
                    }

                    override fun visitDate(date: DatePropertyOperation) {
                        date.validate()
                    }

                    override fun visitCalendarDate(calendarDate: CalendarDatePropertyOperation) {
                        calendarDate.validate()
                    }

                    override fun visitTimepoint(timepoint: TimePointOperation) {
                        timepoint.validate()
                    }

                    override fun visitRangedtime(rangedtime: RangedTimeOperation) {
                        rangedtime.validate()
                    }

                    override fun visitRegex(regex: RegexPropertyOperation) {
                        regex.validate()
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
                    override fun visitBool(bool: BoolPropertyOperation) = bool.validity()

                    override fun visitNumber(number: NumberPropertyOperation) = number.validity()

                    override fun visitString(string: StringPropertyOperation) = string.validity()

                    override fun visitDatetime(datetime: DateTimePropertyOperation) =
                        datetime.validity()

                    override fun visitDatetimeRanged(datetimeRanged: RangedDatePropertyOperation) =
                        datetimeRanged.validity()

                    override fun visitDatetimeComparative(
                        datetimeComparative: ComparativeDatePropertyOperation
                    ) = datetimeComparative.validity()

                    override fun visitBoolComparative(
                        boolComparative: ComparativeBoolPropertyOperation
                    ) = boolComparative.validity()

                    override fun visitNumberComparative(
                        numberComparative: ComparativeNumberPropertyOperation
                    ) = numberComparative.validity()

                    override fun visitStringComparative(
                        stringComparative: ComparativeStringPropertyOperation
                    ) = stringComparative.validity()

                    override fun visitPropertyUpdatedComparative(
                        propertyUpdatedComparative: ComparativePropertyUpdatedOperation
                    ) = propertyUpdatedComparative.validity()

                    override fun visitDatetimeRolling(
                        datetimeRolling: RollingDateRangePropertyOperation
                    ) = datetimeRolling.validity()

                    override fun visitRollingPropertyUpdated(
                        rollingPropertyUpdated: RollingPropertyUpdatedOperation
                    ) = rollingPropertyUpdated.validity()

                    override fun visitEnumeration(enumeration: EnumerationPropertyOperation) =
                        enumeration.validity()

                    override fun visitAlltypes(alltypes: AllPropertyTypesOperation) =
                        alltypes.validity()

                    override fun visitNumberRanged(numberRanged: RangedNumberPropertyOperation) =
                        numberRanged.validity()

                    override fun visitMultistring(multistring: MultiStringPropertyOperation) =
                        multistring.validity()

                    override fun visitDate(date: DatePropertyOperation) = date.validity()

                    override fun visitCalendarDate(calendarDate: CalendarDatePropertyOperation) =
                        calendarDate.validity()

                    override fun visitTimepoint(timepoint: TimePointOperation) =
                        timepoint.validity()

                    override fun visitRangedtime(rangedtime: RangedTimeOperation) =
                        rangedtime.validity()

                    override fun visitRegex(regex: RegexPropertyOperation) = regex.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Operation &&
                bool == other.bool &&
                number == other.number &&
                string == other.string &&
                datetime == other.datetime &&
                datetimeRanged == other.datetimeRanged &&
                datetimeComparative == other.datetimeComparative &&
                boolComparative == other.boolComparative &&
                numberComparative == other.numberComparative &&
                stringComparative == other.stringComparative &&
                propertyUpdatedComparative == other.propertyUpdatedComparative &&
                datetimeRolling == other.datetimeRolling &&
                rollingPropertyUpdated == other.rollingPropertyUpdated &&
                enumeration == other.enumeration &&
                alltypes == other.alltypes &&
                numberRanged == other.numberRanged &&
                multistring == other.multistring &&
                date == other.date &&
                calendarDate == other.calendarDate &&
                timepoint == other.timepoint &&
                rangedtime == other.rangedtime &&
                regex == other.regex
        }

        override fun hashCode(): Int =
            Objects.hash(
                bool,
                number,
                string,
                datetime,
                datetimeRanged,
                datetimeComparative,
                boolComparative,
                numberComparative,
                stringComparative,
                propertyUpdatedComparative,
                datetimeRolling,
                rollingPropertyUpdated,
                enumeration,
                alltypes,
                numberRanged,
                multistring,
                date,
                calendarDate,
                timepoint,
                rangedtime,
                regex,
            )

        override fun toString(): String =
            when {
                bool != null -> "Operation{bool=$bool}"
                number != null -> "Operation{number=$number}"
                string != null -> "Operation{string=$string}"
                datetime != null -> "Operation{datetime=$datetime}"
                datetimeRanged != null -> "Operation{datetimeRanged=$datetimeRanged}"
                datetimeComparative != null -> "Operation{datetimeComparative=$datetimeComparative}"
                boolComparative != null -> "Operation{boolComparative=$boolComparative}"
                numberComparative != null -> "Operation{numberComparative=$numberComparative}"
                stringComparative != null -> "Operation{stringComparative=$stringComparative}"
                propertyUpdatedComparative != null ->
                    "Operation{propertyUpdatedComparative=$propertyUpdatedComparative}"
                datetimeRolling != null -> "Operation{datetimeRolling=$datetimeRolling}"
                rollingPropertyUpdated != null ->
                    "Operation{rollingPropertyUpdated=$rollingPropertyUpdated}"
                enumeration != null -> "Operation{enumeration=$enumeration}"
                alltypes != null -> "Operation{alltypes=$alltypes}"
                numberRanged != null -> "Operation{numberRanged=$numberRanged}"
                multistring != null -> "Operation{multistring=$multistring}"
                date != null -> "Operation{date=$date}"
                calendarDate != null -> "Operation{calendarDate=$calendarDate}"
                timepoint != null -> "Operation{timepoint=$timepoint}"
                rangedtime != null -> "Operation{rangedtime=$rangedtime}"
                regex != null -> "Operation{regex=$regex}"
                _json != null -> "Operation{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Operation")
            }

        companion object {

            @JvmStatic fun ofBool(bool: BoolPropertyOperation) = Operation(bool = bool)

            @JvmStatic fun ofNumber(number: NumberPropertyOperation) = Operation(number = number)

            @JvmStatic fun ofString(string: StringPropertyOperation) = Operation(string = string)

            @JvmStatic
            fun ofDatetime(datetime: DateTimePropertyOperation) = Operation(datetime = datetime)

            @JvmStatic
            fun ofDatetimeRanged(datetimeRanged: RangedDatePropertyOperation) =
                Operation(datetimeRanged = datetimeRanged)

            @JvmStatic
            fun ofDatetimeComparative(datetimeComparative: ComparativeDatePropertyOperation) =
                Operation(datetimeComparative = datetimeComparative)

            @JvmStatic
            fun ofBoolComparative(boolComparative: ComparativeBoolPropertyOperation) =
                Operation(boolComparative = boolComparative)

            @JvmStatic
            fun ofNumberComparative(numberComparative: ComparativeNumberPropertyOperation) =
                Operation(numberComparative = numberComparative)

            @JvmStatic
            fun ofStringComparative(stringComparative: ComparativeStringPropertyOperation) =
                Operation(stringComparative = stringComparative)

            @JvmStatic
            fun ofPropertyUpdatedComparative(
                propertyUpdatedComparative: ComparativePropertyUpdatedOperation
            ) = Operation(propertyUpdatedComparative = propertyUpdatedComparative)

            @JvmStatic
            fun ofDatetimeRolling(datetimeRolling: RollingDateRangePropertyOperation) =
                Operation(datetimeRolling = datetimeRolling)

            @JvmStatic
            fun ofRollingPropertyUpdated(rollingPropertyUpdated: RollingPropertyUpdatedOperation) =
                Operation(rollingPropertyUpdated = rollingPropertyUpdated)

            @JvmStatic
            fun ofEnumeration(enumeration: EnumerationPropertyOperation) =
                Operation(enumeration = enumeration)

            @JvmStatic
            fun ofAlltypes(alltypes: AllPropertyTypesOperation) = Operation(alltypes = alltypes)

            @JvmStatic
            fun ofNumberRanged(numberRanged: RangedNumberPropertyOperation) =
                Operation(numberRanged = numberRanged)

            @JvmStatic
            fun ofMultistring(multistring: MultiStringPropertyOperation) =
                Operation(multistring = multistring)

            @JvmStatic fun ofDate(date: DatePropertyOperation) = Operation(date = date)

            @JvmStatic
            fun ofCalendarDate(calendarDate: CalendarDatePropertyOperation) =
                Operation(calendarDate = calendarDate)

            @JvmStatic
            fun ofTimepoint(timepoint: TimePointOperation) = Operation(timepoint = timepoint)

            @JvmStatic
            fun ofRangedtime(rangedtime: RangedTimeOperation) = Operation(rangedtime = rangedtime)

            @JvmStatic fun ofRegex(regex: RegexPropertyOperation) = Operation(regex = regex)
        }

        /**
         * An interface that defines how to map each variant of [Operation] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitBool(bool: BoolPropertyOperation): T

            fun visitNumber(number: NumberPropertyOperation): T

            fun visitString(string: StringPropertyOperation): T

            fun visitDatetime(datetime: DateTimePropertyOperation): T

            fun visitDatetimeRanged(datetimeRanged: RangedDatePropertyOperation): T

            fun visitDatetimeComparative(datetimeComparative: ComparativeDatePropertyOperation): T

            fun visitBoolComparative(boolComparative: ComparativeBoolPropertyOperation): T

            fun visitNumberComparative(numberComparative: ComparativeNumberPropertyOperation): T

            fun visitStringComparative(stringComparative: ComparativeStringPropertyOperation): T

            fun visitPropertyUpdatedComparative(
                propertyUpdatedComparative: ComparativePropertyUpdatedOperation
            ): T

            fun visitDatetimeRolling(datetimeRolling: RollingDateRangePropertyOperation): T

            fun visitRollingPropertyUpdated(
                rollingPropertyUpdated: RollingPropertyUpdatedOperation
            ): T

            fun visitEnumeration(enumeration: EnumerationPropertyOperation): T

            fun visitAlltypes(alltypes: AllPropertyTypesOperation): T

            fun visitNumberRanged(numberRanged: RangedNumberPropertyOperation): T

            fun visitMultistring(multistring: MultiStringPropertyOperation): T

            fun visitDate(date: DatePropertyOperation): T

            fun visitCalendarDate(calendarDate: CalendarDatePropertyOperation): T

            fun visitTimepoint(timepoint: TimePointOperation): T

            fun visitRangedtime(rangedtime: RangedTimeOperation): T

            fun visitRegex(regex: RegexPropertyOperation): T

            /**
             * Maps an unknown variant of [Operation] to a value of type [T].
             *
             * An instance of [Operation] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Operation: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Operation>(Operation::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Operation {
                val json = JsonValue.fromJsonNode(node)
                val propertyType =
                    json.asObject().getOrNull()?.get("propertyType")?.asString()?.getOrNull()

                when (propertyType) {
                    "bool" -> {
                        return tryDeserialize(node, jacksonTypeRef<BoolPropertyOperation>())?.let {
                            Operation(bool = it, _json = json)
                        } ?: Operation(_json = json)
                    }
                    "number" -> {
                        return tryDeserialize(node, jacksonTypeRef<NumberPropertyOperation>())
                            ?.let { Operation(number = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "string" -> {
                        return tryDeserialize(node, jacksonTypeRef<StringPropertyOperation>())
                            ?.let { Operation(string = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "datetime" -> {
                        return tryDeserialize(node, jacksonTypeRef<DateTimePropertyOperation>())
                            ?.let { Operation(datetime = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "datetime-ranged" -> {
                        return tryDeserialize(node, jacksonTypeRef<RangedDatePropertyOperation>())
                            ?.let { Operation(datetimeRanged = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "datetime-comparative" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ComparativeDatePropertyOperation>(),
                            )
                            ?.let { Operation(datetimeComparative = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "bool-comparative" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ComparativeBoolPropertyOperation>(),
                            )
                            ?.let { Operation(boolComparative = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "number-comparative" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ComparativeNumberPropertyOperation>(),
                            )
                            ?.let { Operation(numberComparative = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "string-comparative" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ComparativeStringPropertyOperation>(),
                            )
                            ?.let { Operation(stringComparative = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "property-updated-comparative" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ComparativePropertyUpdatedOperation>(),
                            )
                            ?.let { Operation(propertyUpdatedComparative = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "datetime-rolling" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<RollingDateRangePropertyOperation>(),
                            )
                            ?.let { Operation(datetimeRolling = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "rolling-property-updated" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<RollingPropertyUpdatedOperation>(),
                            )
                            ?.let { Operation(rollingPropertyUpdated = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "enumeration" -> {
                        return tryDeserialize(node, jacksonTypeRef<EnumerationPropertyOperation>())
                            ?.let { Operation(enumeration = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "alltypes" -> {
                        return tryDeserialize(node, jacksonTypeRef<AllPropertyTypesOperation>())
                            ?.let { Operation(alltypes = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "number-ranged" -> {
                        return tryDeserialize(node, jacksonTypeRef<RangedNumberPropertyOperation>())
                            ?.let { Operation(numberRanged = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "multistring" -> {
                        return tryDeserialize(node, jacksonTypeRef<MultiStringPropertyOperation>())
                            ?.let { Operation(multistring = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "date" -> {
                        return tryDeserialize(node, jacksonTypeRef<DatePropertyOperation>())?.let {
                            Operation(date = it, _json = json)
                        } ?: Operation(_json = json)
                    }
                    "calendar-date" -> {
                        return tryDeserialize(node, jacksonTypeRef<CalendarDatePropertyOperation>())
                            ?.let { Operation(calendarDate = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "timepoint" -> {
                        return tryDeserialize(node, jacksonTypeRef<TimePointOperation>())?.let {
                            Operation(timepoint = it, _json = json)
                        } ?: Operation(_json = json)
                    }
                    "rangedtime" -> {
                        return tryDeserialize(node, jacksonTypeRef<RangedTimeOperation>())?.let {
                            Operation(rangedtime = it, _json = json)
                        } ?: Operation(_json = json)
                    }
                    "regex" -> {
                        return tryDeserialize(node, jacksonTypeRef<RegexPropertyOperation>())?.let {
                            Operation(regex = it, _json = json)
                        } ?: Operation(_json = json)
                    }
                }

                return Operation(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Operation>(Operation::class) {

            override fun serialize(
                value: Operation,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bool != null -> generator.writeObject(value.bool)
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value.datetime != null -> generator.writeObject(value.datetime)
                    value.datetimeRanged != null -> generator.writeObject(value.datetimeRanged)
                    value.datetimeComparative != null ->
                        generator.writeObject(value.datetimeComparative)
                    value.boolComparative != null -> generator.writeObject(value.boolComparative)
                    value.numberComparative != null ->
                        generator.writeObject(value.numberComparative)
                    value.stringComparative != null ->
                        generator.writeObject(value.stringComparative)
                    value.propertyUpdatedComparative != null ->
                        generator.writeObject(value.propertyUpdatedComparative)
                    value.datetimeRolling != null -> generator.writeObject(value.datetimeRolling)
                    value.rollingPropertyUpdated != null ->
                        generator.writeObject(value.rollingPropertyUpdated)
                    value.enumeration != null -> generator.writeObject(value.enumeration)
                    value.alltypes != null -> generator.writeObject(value.alltypes)
                    value.numberRanged != null -> generator.writeObject(value.numberRanged)
                    value.multistring != null -> generator.writeObject(value.multistring)
                    value.date != null -> generator.writeObject(value.date)
                    value.calendarDate != null -> generator.writeObject(value.calendarDate)
                    value.timepoint != null -> generator.writeObject(value.timepoint)
                    value.rangedtime != null -> generator.writeObject(value.rangedtime)
                    value.regex != null -> generator.writeObject(value.regex)
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
