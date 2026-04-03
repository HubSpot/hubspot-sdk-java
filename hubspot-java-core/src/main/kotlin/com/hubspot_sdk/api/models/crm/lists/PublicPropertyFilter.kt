// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicPropertyFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filterType: JsonField<FilterType>,
    private val operation: JsonField<Operation>,
    private val property: JsonField<String>,
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
    ) : this(filterType, operation, property, mutableMapOf())

    /**
     * Indicates that the filter (PROPERTY).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterType(): FilterType = filterType.getRequired("filterType")

    /**
     * Defines the operation to be performed on the property, such as comparison or value matching.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operation(): Operation = operation.getRequired("operation")

    /**
     * Specifies the name of the property that the filter is applied to.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun property(): String = property.getRequired("property")

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
         * Returns a mutable builder for constructing an instance of [PublicPropertyFilter].
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

    /** A builder for [PublicPropertyFilter]. */
    class Builder internal constructor() {

        private var filterType: JsonField<FilterType>? = null
        private var operation: JsonField<Operation>? = null
        private var property: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicPropertyFilter: PublicPropertyFilter) = apply {
            filterType = publicPropertyFilter.filterType
            operation = publicPropertyFilter.operation
            property = publicPropertyFilter.property
            additionalProperties = publicPropertyFilter.additionalProperties.toMutableMap()
        }

        /** Indicates that the filter (PROPERTY). */
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
         * Defines the operation to be performed on the property, such as comparison or value
         * matching.
         */
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
        fun operation(bool: PublicBoolPropertyOperation) = operation(Operation.ofBool(bool))

        /** Alias for calling [operation] with `Operation.ofNumber(number)`. */
        fun operation(number: PublicNumberPropertyOperation) = operation(Operation.ofNumber(number))

        /** Alias for calling [operation] with `Operation.ofString(string)`. */
        fun operation(string: PublicStringPropertyOperation) = operation(Operation.ofString(string))

        /** Alias for calling [operation] with `Operation.ofDatetime(datetime)`. */
        fun operation(datetime: PublicDateTimePropertyOperation) =
            operation(Operation.ofDatetime(datetime))

        /** Alias for calling [operation] with `Operation.ofRangedDate(rangedDate)`. */
        fun operation(rangedDate: PublicRangedDatePropertyOperation) =
            operation(Operation.ofRangedDate(rangedDate))

        /**
         * Alias for calling [operation] with
         * `Operation.ofComparativePropertyUpdated(comparativePropertyUpdated)`.
         */
        fun operation(comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation) =
            operation(Operation.ofComparativePropertyUpdated(comparativePropertyUpdated))

        /** Alias for calling [operation] with `Operation.ofComparativeDate(comparativeDate)`. */
        fun operation(comparativeDate: PublicComparativeDatePropertyOperation) =
            operation(Operation.ofComparativeDate(comparativeDate))

        /** Alias for calling [operation] with `Operation.ofRollingDateRange(rollingDateRange)`. */
        fun operation(rollingDateRange: PublicRollingDateRangePropertyOperation) =
            operation(Operation.ofRollingDateRange(rollingDateRange))

        /**
         * Alias for calling [operation] with
         * `Operation.ofRollingPropertyUpdated(rollingPropertyUpdated)`.
         */
        fun operation(rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation) =
            operation(Operation.ofRollingPropertyUpdated(rollingPropertyUpdated))

        /** Alias for calling [operation] with `Operation.ofEnumeration(enumeration)`. */
        fun operation(enumeration: PublicEnumerationPropertyOperation) =
            operation(Operation.ofEnumeration(enumeration))

        /** Alias for calling [operation] with `Operation.ofAllProperty(allProperty)`. */
        fun operation(allProperty: PublicAllPropertyTypesOperation) =
            operation(Operation.ofAllProperty(allProperty))

        /** Alias for calling [operation] with `Operation.ofNumberRanged(numberRanged)`. */
        fun operation(numberRanged: PublicRangedNumberPropertyOperation) =
            operation(Operation.ofNumberRanged(numberRanged))

        /** Alias for calling [operation] with `Operation.ofMultistring(multistring)`. */
        fun operation(multistring: PublicMultiStringPropertyOperation) =
            operation(Operation.ofMultistring(multistring))

        /** Alias for calling [operation] with `Operation.ofDate(date)`. */
        fun operation(date: PublicDatePropertyOperation) = operation(Operation.ofDate(date))

        /** Alias for calling [operation] with `Operation.ofCalendarDate(calendarDate)`. */
        fun operation(calendarDate: PublicCalendarDatePropertyOperation) =
            operation(Operation.ofCalendarDate(calendarDate))

        /** Alias for calling [operation] with `Operation.ofTimePoint(timePoint)`. */
        fun operation(timePoint: PublicTimePointOperation) =
            operation(Operation.ofTimePoint(timePoint))

        /** Alias for calling [operation] with `Operation.ofPublicRangedTime(publicRangedTime)`. */
        fun operation(publicRangedTime: PublicRangedTimeOperation) =
            operation(Operation.ofPublicRangedTime(publicRangedTime))

        /** Specifies the name of the property that the filter is applied to. */
        fun property(property: String) = property(JsonField.of(property))

        /**
         * Sets [Builder.property] to an arbitrary JSON value.
         *
         * You should usually call [Builder.property] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun property(property: JsonField<String>) = apply { this.property = property }

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
         * Returns an immutable instance of [PublicPropertyFilter].
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
        fun build(): PublicPropertyFilter =
            PublicPropertyFilter(
                checkRequired("filterType", filterType),
                checkRequired("operation", operation),
                checkRequired("property", property),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicPropertyFilter = apply {
        if (validated) {
            return@apply
        }

        filterType().validate()
        operation().validate()
        property()
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
            (if (property.asKnown().isPresent) 1 else 0)

    /** Indicates that the filter (PROPERTY). */
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

    /**
     * Defines the operation to be performed on the property, such as comparison or value matching.
     */
    @JsonDeserialize(using = Operation.Deserializer::class)
    @JsonSerialize(using = Operation.Serializer::class)
    class Operation
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
        private val publicRangedTime: PublicRangedTimeOperation? = null,
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

        fun publicRangedTime(): Optional<PublicRangedTimeOperation> =
            Optional.ofNullable(publicRangedTime)

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

        fun isPublicRangedTime(): Boolean = publicRangedTime != null

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

        fun asPublicRangedTime(): PublicRangedTimeOperation =
            publicRangedTime.getOrThrow("publicRangedTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

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
                publicRangedTime != null -> visitor.visitPublicRangedTime(publicRangedTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Operation = apply {
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

                    override fun visitPublicRangedTime(
                        publicRangedTime: PublicRangedTimeOperation
                    ) {
                        publicRangedTime.validate()
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

                    override fun visitPublicRangedTime(
                        publicRangedTime: PublicRangedTimeOperation
                    ) = publicRangedTime.validity()

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
                publicRangedTime == other.publicRangedTime
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
                publicRangedTime,
            )

        override fun toString(): String =
            when {
                bool != null -> "Operation{bool=$bool}"
                number != null -> "Operation{number=$number}"
                string != null -> "Operation{string=$string}"
                datetime != null -> "Operation{datetime=$datetime}"
                rangedDate != null -> "Operation{rangedDate=$rangedDate}"
                comparativePropertyUpdated != null ->
                    "Operation{comparativePropertyUpdated=$comparativePropertyUpdated}"
                comparativeDate != null -> "Operation{comparativeDate=$comparativeDate}"
                rollingDateRange != null -> "Operation{rollingDateRange=$rollingDateRange}"
                rollingPropertyUpdated != null ->
                    "Operation{rollingPropertyUpdated=$rollingPropertyUpdated}"
                enumeration != null -> "Operation{enumeration=$enumeration}"
                allProperty != null -> "Operation{allProperty=$allProperty}"
                numberRanged != null -> "Operation{numberRanged=$numberRanged}"
                multistring != null -> "Operation{multistring=$multistring}"
                date != null -> "Operation{date=$date}"
                calendarDate != null -> "Operation{calendarDate=$calendarDate}"
                timePoint != null -> "Operation{timePoint=$timePoint}"
                publicRangedTime != null -> "Operation{publicRangedTime=$publicRangedTime}"
                _json != null -> "Operation{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Operation")
            }

        companion object {

            @JvmStatic fun ofBool(bool: PublicBoolPropertyOperation) = Operation(bool = bool)

            @JvmStatic
            fun ofNumber(number: PublicNumberPropertyOperation) = Operation(number = number)

            @JvmStatic
            fun ofString(string: PublicStringPropertyOperation) = Operation(string = string)

            @JvmStatic
            fun ofDatetime(datetime: PublicDateTimePropertyOperation) =
                Operation(datetime = datetime)

            @JvmStatic
            fun ofRangedDate(rangedDate: PublicRangedDatePropertyOperation) =
                Operation(rangedDate = rangedDate)

            @JvmStatic
            fun ofComparativePropertyUpdated(
                comparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
            ) = Operation(comparativePropertyUpdated = comparativePropertyUpdated)

            @JvmStatic
            fun ofComparativeDate(comparativeDate: PublicComparativeDatePropertyOperation) =
                Operation(comparativeDate = comparativeDate)

            @JvmStatic
            fun ofRollingDateRange(rollingDateRange: PublicRollingDateRangePropertyOperation) =
                Operation(rollingDateRange = rollingDateRange)

            @JvmStatic
            fun ofRollingPropertyUpdated(
                rollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
            ) = Operation(rollingPropertyUpdated = rollingPropertyUpdated)

            @JvmStatic
            fun ofEnumeration(enumeration: PublicEnumerationPropertyOperation) =
                Operation(enumeration = enumeration)

            @JvmStatic
            fun ofAllProperty(allProperty: PublicAllPropertyTypesOperation) =
                Operation(allProperty = allProperty)

            @JvmStatic
            fun ofNumberRanged(numberRanged: PublicRangedNumberPropertyOperation) =
                Operation(numberRanged = numberRanged)

            @JvmStatic
            fun ofMultistring(multistring: PublicMultiStringPropertyOperation) =
                Operation(multistring = multistring)

            @JvmStatic fun ofDate(date: PublicDatePropertyOperation) = Operation(date = date)

            @JvmStatic
            fun ofCalendarDate(calendarDate: PublicCalendarDatePropertyOperation) =
                Operation(calendarDate = calendarDate)

            @JvmStatic
            fun ofTimePoint(timePoint: PublicTimePointOperation) = Operation(timePoint = timePoint)

            @JvmStatic
            fun ofPublicRangedTime(publicRangedTime: PublicRangedTimeOperation) =
                Operation(publicRangedTime = publicRangedTime)
        }

        /**
         * An interface that defines how to map each variant of [Operation] to a value of type [T].
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

            fun visitPublicRangedTime(publicRangedTime: PublicRangedTimeOperation): T

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
                val operationType =
                    json.asObject().getOrNull()?.get("operationType")?.asString()?.getOrNull()

                when (operationType) {
                    "BOOL" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicBoolPropertyOperation>())
                            ?.let { Operation(bool = it, _json = json) } ?: Operation(_json = json)
                    }
                    "NUMBER" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNumberPropertyOperation>())
                            ?.let { Operation(number = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "STRING" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicStringPropertyOperation>())
                            ?.let { Operation(string = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "DATETIME" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicDateTimePropertyOperation>(),
                            )
                            ?.let { Operation(datetime = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "RANGED_DATE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRangedDatePropertyOperation>(),
                            )
                            ?.let { Operation(rangedDate = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "COMPARATIVE_PROPERTY_UPDATED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicComparativePropertyUpdatedOperation>(),
                            )
                            ?.let { Operation(comparativePropertyUpdated = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "COMPARATIVE_DATE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicComparativeDatePropertyOperation>(),
                            )
                            ?.let { Operation(comparativeDate = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "ROLLING_DATE_RANGE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRollingDateRangePropertyOperation>(),
                            )
                            ?.let { Operation(rollingDateRange = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "ROLLING_PROPERTY_UPDATED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRollingPropertyUpdatedOperation>(),
                            )
                            ?.let { Operation(rollingPropertyUpdated = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "ENUMERATION" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicEnumerationPropertyOperation>(),
                            )
                            ?.let { Operation(enumeration = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "ALL_PROPERTY" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicAllPropertyTypesOperation>(),
                            )
                            ?.let { Operation(allProperty = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "NUMBER_RANGED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicRangedNumberPropertyOperation>(),
                            )
                            ?.let { Operation(numberRanged = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "MULTISTRING" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicMultiStringPropertyOperation>(),
                            )
                            ?.let { Operation(multistring = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "DATE" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicDatePropertyOperation>())
                            ?.let { Operation(date = it, _json = json) } ?: Operation(_json = json)
                    }
                    "CALENDAR_DATE" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicCalendarDatePropertyOperation>(),
                            )
                            ?.let { Operation(calendarDate = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                    "TIME_POINT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())
                            ?.let { Operation(timePoint = it, _json = json) }
                            ?: Operation(_json = json)
                    }
                }

                return tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())?.let {
                    Operation(publicRangedTime = it, _json = json)
                } ?: Operation(_json = json)
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
                    value.publicRangedTime != null -> generator.writeObject(value.publicRangedTime)
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

        return other is PublicPropertyFilter &&
            filterType == other.filterType &&
            operation == other.operation &&
            property == other.property &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(filterType, operation, property, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicPropertyFilter{filterType=$filterType, operation=$operation, property=$property, additionalProperties=$additionalProperties}"
}
