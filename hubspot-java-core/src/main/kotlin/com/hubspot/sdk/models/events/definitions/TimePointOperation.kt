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
import com.hubspot.sdk.core.allMaxBy
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TimePointOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endpointBehavior: JsonField<EndpointBehavior>,
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val operationType: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val operatorName: JsonField<String>,
    private val propertyParser: JsonField<PropertyParser>,
    private val propertyType: JsonField<PropertyType>,
    private val timePoint: JsonField<TimePoint>,
    private val type: JsonField<String>,
    private val defaultValue: JsonField<String>,
    private val renderSpec: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("endpointBehavior")
        @ExcludeMissing
        endpointBehavior: JsonField<EndpointBehavior> = JsonMissing.of(),
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("operationType")
        @ExcludeMissing
        operationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("operatorName")
        @ExcludeMissing
        operatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyParser")
        @ExcludeMissing
        propertyParser: JsonField<PropertyParser> = JsonMissing.of(),
        @JsonProperty("propertyType")
        @ExcludeMissing
        propertyType: JsonField<PropertyType> = JsonMissing.of(),
        @JsonProperty("timePoint")
        @ExcludeMissing
        timePoint: JsonField<TimePoint> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultValue")
        @ExcludeMissing
        defaultValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("renderSpec") @ExcludeMissing renderSpec: JsonField<String> = JsonMissing.of(),
    ) : this(
        endpointBehavior,
        includeObjectsWithNoValueSet,
        operationType,
        operator,
        operatorName,
        propertyParser,
        propertyType,
        timePoint,
        type,
        defaultValue,
        renderSpec,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endpointBehavior(): EndpointBehavior = endpointBehavior.getRequired("endpointBehavior")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeObjectsWithNoValueSet(): Boolean =
        includeObjectsWithNoValueSet.getRequired("includeObjectsWithNoValueSet")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): String = operationType.getRequired("operationType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operatorName(): String = operatorName.getRequired("operatorName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyParser(): PropertyParser = propertyParser.getRequired("propertyParser")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyType(): PropertyType = propertyType.getRequired("propertyType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timePoint(): TimePoint = timePoint.getRequired("timePoint")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultValue(): Optional<String> = defaultValue.getOptional("defaultValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun renderSpec(): Optional<String> = renderSpec.getOptional("renderSpec")

    /**
     * Returns the raw JSON value of [endpointBehavior].
     *
     * Unlike [endpointBehavior], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("endpointBehavior")
    @ExcludeMissing
    fun _endpointBehavior(): JsonField<EndpointBehavior> = endpointBehavior

    /**
     * Returns the raw JSON value of [includeObjectsWithNoValueSet].
     *
     * Unlike [includeObjectsWithNoValueSet], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeObjectsWithNoValueSet")
    @ExcludeMissing
    fun _includeObjectsWithNoValueSet(): JsonField<Boolean> = includeObjectsWithNoValueSet

    /**
     * Returns the raw JSON value of [operationType].
     *
     * Unlike [operationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operationType")
    @ExcludeMissing
    fun _operationType(): JsonField<String> = operationType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [operatorName].
     *
     * Unlike [operatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatorName")
    @ExcludeMissing
    fun _operatorName(): JsonField<String> = operatorName

    /**
     * Returns the raw JSON value of [propertyParser].
     *
     * Unlike [propertyParser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyParser")
    @ExcludeMissing
    fun _propertyParser(): JsonField<PropertyParser> = propertyParser

    /**
     * Returns the raw JSON value of [propertyType].
     *
     * Unlike [propertyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyType")
    @ExcludeMissing
    fun _propertyType(): JsonField<PropertyType> = propertyType

    /**
     * Returns the raw JSON value of [timePoint].
     *
     * Unlike [timePoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timePoint") @ExcludeMissing fun _timePoint(): JsonField<TimePoint> = timePoint

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [defaultValue].
     *
     * Unlike [defaultValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultValue")
    @ExcludeMissing
    fun _defaultValue(): JsonField<String> = defaultValue

    /**
     * Returns the raw JSON value of [renderSpec].
     *
     * Unlike [renderSpec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("renderSpec") @ExcludeMissing fun _renderSpec(): JsonField<String> = renderSpec

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
         * Returns a mutable builder for constructing an instance of [TimePointOperation].
         *
         * The following fields are required:
         * ```java
         * .endpointBehavior()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyParser()
         * .propertyType()
         * .timePoint()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TimePointOperation]. */
    class Builder internal constructor() {

        private var endpointBehavior: JsonField<EndpointBehavior>? = null
        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var operationType: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var operatorName: JsonField<String>? = null
        private var propertyParser: JsonField<PropertyParser>? = null
        private var propertyType: JsonField<PropertyType>? = null
        private var timePoint: JsonField<TimePoint>? = null
        private var type: JsonField<String>? = null
        private var defaultValue: JsonField<String> = JsonMissing.of()
        private var renderSpec: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(timePointOperation: TimePointOperation) = apply {
            endpointBehavior = timePointOperation.endpointBehavior
            includeObjectsWithNoValueSet = timePointOperation.includeObjectsWithNoValueSet
            operationType = timePointOperation.operationType
            operator = timePointOperation.operator
            operatorName = timePointOperation.operatorName
            propertyParser = timePointOperation.propertyParser
            propertyType = timePointOperation.propertyType
            timePoint = timePointOperation.timePoint
            type = timePointOperation.type
            defaultValue = timePointOperation.defaultValue
            renderSpec = timePointOperation.renderSpec
            additionalProperties = timePointOperation.additionalProperties.toMutableMap()
        }

        fun endpointBehavior(endpointBehavior: EndpointBehavior) =
            endpointBehavior(JsonField.of(endpointBehavior))

        /**
         * Sets [Builder.endpointBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpointBehavior] with a well-typed [EndpointBehavior]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun endpointBehavior(endpointBehavior: JsonField<EndpointBehavior>) = apply {
            this.endpointBehavior = endpointBehavior
        }

        fun includeObjectsWithNoValueSet(includeObjectsWithNoValueSet: Boolean) =
            includeObjectsWithNoValueSet(JsonField.of(includeObjectsWithNoValueSet))

        /**
         * Sets [Builder.includeObjectsWithNoValueSet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeObjectsWithNoValueSet] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun includeObjectsWithNoValueSet(includeObjectsWithNoValueSet: JsonField<Boolean>) = apply {
            this.includeObjectsWithNoValueSet = includeObjectsWithNoValueSet
        }

        fun operationType(operationType: String) = operationType(JsonField.of(operationType))

        /**
         * Sets [Builder.operationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operationType(operationType: JsonField<String>) = apply {
            this.operationType = operationType
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

        fun operatorName(operatorName: String) = operatorName(JsonField.of(operatorName))

        /**
         * Sets [Builder.operatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operatorName(operatorName: JsonField<String>) = apply {
            this.operatorName = operatorName
        }

        fun propertyParser(propertyParser: PropertyParser) =
            propertyParser(JsonField.of(propertyParser))

        /**
         * Sets [Builder.propertyParser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyParser] with a well-typed [PropertyParser] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun propertyParser(propertyParser: JsonField<PropertyParser>) = apply {
            this.propertyParser = propertyParser
        }

        fun propertyType(propertyType: PropertyType) = propertyType(JsonField.of(propertyType))

        /**
         * Sets [Builder.propertyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyType] with a well-typed [PropertyType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun propertyType(propertyType: JsonField<PropertyType>) = apply {
            this.propertyType = propertyType
        }

        fun timePoint(timePoint: TimePoint) = timePoint(JsonField.of(timePoint))

        /**
         * Sets [Builder.timePoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timePoint] with a well-typed [TimePoint] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timePoint(timePoint: JsonField<TimePoint>) = apply { this.timePoint = timePoint }

        /** Alias for calling [timePoint] with `TimePoint.ofDate(date)`. */
        fun timePoint(date: DatePoint) = timePoint(TimePoint.ofDate(date))

        /** Alias for calling [timePoint] with `TimePoint.ofIndexed(indexed)`. */
        fun timePoint(indexed: IndexedTimePoint) = timePoint(TimePoint.ofIndexed(indexed))

        /**
         * Alias for calling [timePoint] with
         * `TimePoint.ofPropertyReferencedTime(propertyReferencedTime)`.
         */
        fun timePoint(propertyReferencedTime: PropertyReferencedTime) =
            timePoint(TimePoint.ofPropertyReferencedTime(propertyReferencedTime))

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun defaultValue(defaultValue: String) = defaultValue(JsonField.of(defaultValue))

        /**
         * Sets [Builder.defaultValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultValue(defaultValue: JsonField<String>) = apply {
            this.defaultValue = defaultValue
        }

        fun renderSpec(renderSpec: String) = renderSpec(JsonField.of(renderSpec))

        /**
         * Sets [Builder.renderSpec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.renderSpec] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun renderSpec(renderSpec: JsonField<String>) = apply { this.renderSpec = renderSpec }

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
         * Returns an immutable instance of [TimePointOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endpointBehavior()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyParser()
         * .propertyType()
         * .timePoint()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TimePointOperation =
            TimePointOperation(
                checkRequired("endpointBehavior", endpointBehavior),
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("operatorName", operatorName),
                checkRequired("propertyParser", propertyParser),
                checkRequired("propertyType", propertyType),
                checkRequired("timePoint", timePoint),
                checkRequired("type", type),
                defaultValue,
                renderSpec,
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
    fun validate(): TimePointOperation = apply {
        if (validated) {
            return@apply
        }

        endpointBehavior().validate()
        includeObjectsWithNoValueSet()
        operationType()
        operator().validate()
        operatorName()
        propertyParser().validate()
        propertyType().validate()
        timePoint().validate()
        type()
        defaultValue()
        renderSpec()
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
        (endpointBehavior.asKnown().getOrNull()?.validity() ?: 0) +
            (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (if (operationType.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatorName.asKnown().isPresent) 1 else 0) +
            (propertyParser.asKnown().getOrNull()?.validity() ?: 0) +
            (propertyType.asKnown().getOrNull()?.validity() ?: 0) +
            (timePoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (defaultValue.asKnown().isPresent) 1 else 0) +
            (if (renderSpec.asKnown().isPresent) 1 else 0)

    class EndpointBehavior @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val EXCLUSIVE = of("EXCLUSIVE")

            @JvmField val INCLUSIVE = of("INCLUSIVE")

            @JvmStatic fun of(value: String) = EndpointBehavior(JsonField.of(value))
        }

        /** An enum containing [EndpointBehavior]'s known values. */
        enum class Known {
            EXCLUSIVE,
            INCLUSIVE,
        }

        /**
         * An enum containing [EndpointBehavior]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EndpointBehavior] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXCLUSIVE,
            INCLUSIVE,
            /**
             * An enum member indicating that [EndpointBehavior] was instantiated with an unknown
             * value.
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
                EXCLUSIVE -> Value.EXCLUSIVE
                INCLUSIVE -> Value.INCLUSIVE
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
                EXCLUSIVE -> Known.EXCLUSIVE
                INCLUSIVE -> Known.INCLUSIVE
                else -> throw HubSpotInvalidDataException("Unknown EndpointBehavior: $value")
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
        fun validate(): EndpointBehavior = apply {
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

            return other is EndpointBehavior && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            @JvmField val IS_AFTER = of("IS_AFTER")

            @JvmField val IS_BEFORE = of("IS_BEFORE")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IS_AFTER,
            IS_BEFORE,
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
            IS_AFTER,
            IS_BEFORE,
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
                IS_AFTER -> Value.IS_AFTER
                IS_BEFORE -> Value.IS_BEFORE
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
                IS_AFTER -> Known.IS_AFTER
                IS_BEFORE -> Known.IS_BEFORE
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class PropertyParser @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ANNIVERSARY = of("ANNIVERSARY")

            @JvmField
            val ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION =
                of("ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION")

            @JvmField val UPDATED_AT = of("UPDATED_AT")

            @JvmField val VALUE = of("VALUE")

            @JvmField
            val VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION = of("VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION")

            @JvmStatic fun of(value: String) = PropertyParser(JsonField.of(value))
        }

        /** An enum containing [PropertyParser]'s known values. */
        enum class Known {
            ANNIVERSARY,
            ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION,
            UPDATED_AT,
            VALUE,
            VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION,
        }

        /**
         * An enum containing [PropertyParser]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PropertyParser] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANNIVERSARY,
            ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION,
            UPDATED_AT,
            VALUE,
            VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION,
            /**
             * An enum member indicating that [PropertyParser] was instantiated with an unknown
             * value.
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
                ANNIVERSARY -> Value.ANNIVERSARY
                ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION ->
                    Value.ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION
                UPDATED_AT -> Value.UPDATED_AT
                VALUE -> Value.VALUE
                VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION -> Value.VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION
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
                ANNIVERSARY -> Known.ANNIVERSARY
                ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION ->
                    Known.ANNIVERSARY_WITH_ZONE_SAME_LOCAL_CONVERSION
                UPDATED_AT -> Known.UPDATED_AT
                VALUE -> Known.VALUE
                VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION -> Known.VALUE_WITH_ZONE_SAME_LOCAL_CONVERSION
                else -> throw HubSpotInvalidDataException("Unknown PropertyParser: $value")
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
        fun validate(): PropertyParser = apply {
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

            return other is PropertyParser && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PropertyType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val TIMEPOINT = of("timepoint")

            @JvmStatic fun of(value: String) = PropertyType(JsonField.of(value))
        }

        /** An enum containing [PropertyType]'s known values. */
        enum class Known {
            TIMEPOINT
        }

        /**
         * An enum containing [PropertyType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PropertyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TIMEPOINT,
            /**
             * An enum member indicating that [PropertyType] was instantiated with an unknown value.
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
                TIMEPOINT -> Value.TIMEPOINT
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
                TIMEPOINT -> Known.TIMEPOINT
                else -> throw HubSpotInvalidDataException("Unknown PropertyType: $value")
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
        fun validate(): PropertyType = apply {
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

            return other is PropertyType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = TimePoint.Deserializer::class)
    @JsonSerialize(using = TimePoint.Serializer::class)
    class TimePoint
    private constructor(
        private val date: DatePoint? = null,
        private val indexed: IndexedTimePoint? = null,
        private val propertyReferencedTime: PropertyReferencedTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun date(): Optional<DatePoint> = Optional.ofNullable(date)

        fun indexed(): Optional<IndexedTimePoint> = Optional.ofNullable(indexed)

        fun propertyReferencedTime(): Optional<PropertyReferencedTime> =
            Optional.ofNullable(propertyReferencedTime)

        fun isDate(): Boolean = date != null

        fun isIndexed(): Boolean = indexed != null

        fun isPropertyReferencedTime(): Boolean = propertyReferencedTime != null

        fun asDate(): DatePoint = date.getOrThrow("date")

        fun asIndexed(): IndexedTimePoint = indexed.getOrThrow("indexed")

        fun asPropertyReferencedTime(): PropertyReferencedTime =
            propertyReferencedTime.getOrThrow("propertyReferencedTime")

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
         * Optional<String> result = timePoint.accept(new TimePoint.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitDate(DatePoint date) {
         *         return Optional.of(date.toString());
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
                date != null -> visitor.visitDate(date)
                indexed != null -> visitor.visitIndexed(indexed)
                propertyReferencedTime != null ->
                    visitor.visitPropertyReferencedTime(propertyReferencedTime)
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
        fun validate(): TimePoint = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDate(date: DatePoint) {
                        date.validate()
                    }

                    override fun visitIndexed(indexed: IndexedTimePoint) {
                        indexed.validate()
                    }

                    override fun visitPropertyReferencedTime(
                        propertyReferencedTime: PropertyReferencedTime
                    ) {
                        propertyReferencedTime.validate()
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
                    override fun visitDate(date: DatePoint) = date.validity()

                    override fun visitIndexed(indexed: IndexedTimePoint) = indexed.validity()

                    override fun visitPropertyReferencedTime(
                        propertyReferencedTime: PropertyReferencedTime
                    ) = propertyReferencedTime.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TimePoint &&
                date == other.date &&
                indexed == other.indexed &&
                propertyReferencedTime == other.propertyReferencedTime
        }

        override fun hashCode(): Int = Objects.hash(date, indexed, propertyReferencedTime)

        override fun toString(): String =
            when {
                date != null -> "TimePoint{date=$date}"
                indexed != null -> "TimePoint{indexed=$indexed}"
                propertyReferencedTime != null ->
                    "TimePoint{propertyReferencedTime=$propertyReferencedTime}"
                _json != null -> "TimePoint{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TimePoint")
            }

        companion object {

            @JvmStatic fun ofDate(date: DatePoint) = TimePoint(date = date)

            @JvmStatic fun ofIndexed(indexed: IndexedTimePoint) = TimePoint(indexed = indexed)

            @JvmStatic
            fun ofPropertyReferencedTime(propertyReferencedTime: PropertyReferencedTime) =
                TimePoint(propertyReferencedTime = propertyReferencedTime)
        }

        /**
         * An interface that defines how to map each variant of [TimePoint] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitDate(date: DatePoint): T

            fun visitIndexed(indexed: IndexedTimePoint): T

            fun visitPropertyReferencedTime(propertyReferencedTime: PropertyReferencedTime): T

            /**
             * Maps an unknown variant of [TimePoint] to a value of type [T].
             *
             * An instance of [TimePoint] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown TimePoint: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TimePoint>(TimePoint::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TimePoint {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DatePoint>())?.let {
                                TimePoint(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IndexedTimePoint>())?.let {
                                TimePoint(indexed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PropertyReferencedTime>())?.let {
                                TimePoint(propertyReferencedTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> TimePoint(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<TimePoint>(TimePoint::class) {

            override fun serialize(
                value: TimePoint,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.date != null -> generator.writeObject(value.date)
                    value.indexed != null -> generator.writeObject(value.indexed)
                    value.propertyReferencedTime != null ->
                        generator.writeObject(value.propertyReferencedTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TimePoint")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimePointOperation &&
            endpointBehavior == other.endpointBehavior &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            operationType == other.operationType &&
            operator == other.operator &&
            operatorName == other.operatorName &&
            propertyParser == other.propertyParser &&
            propertyType == other.propertyType &&
            timePoint == other.timePoint &&
            type == other.type &&
            defaultValue == other.defaultValue &&
            renderSpec == other.renderSpec &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            endpointBehavior,
            includeObjectsWithNoValueSet,
            operationType,
            operator,
            operatorName,
            propertyParser,
            propertyType,
            timePoint,
            type,
            defaultValue,
            renderSpec,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimePointOperation{endpointBehavior=$endpointBehavior, includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, operationType=$operationType, operator=$operator, operatorName=$operatorName, propertyParser=$propertyParser, propertyType=$propertyType, timePoint=$timePoint, type=$type, defaultValue=$defaultValue, renderSpec=$renderSpec, additionalProperties=$additionalProperties}"
}
