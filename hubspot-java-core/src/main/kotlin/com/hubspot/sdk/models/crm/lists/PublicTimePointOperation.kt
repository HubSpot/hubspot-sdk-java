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

class PublicTimePointOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val operationType: JsonField<OperationType>,
    private val operator: JsonField<String>,
    private val timePoint: JsonField<TimePoint>,
    private val type: JsonField<String>,
    private val endpointBehavior: JsonField<String>,
    private val propertyParser: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("operationType")
        @ExcludeMissing
        operationType: JsonField<OperationType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timePoint")
        @ExcludeMissing
        timePoint: JsonField<TimePoint> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endpointBehavior")
        @ExcludeMissing
        endpointBehavior: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyParser")
        @ExcludeMissing
        propertyParser: JsonField<String> = JsonMissing.of(),
    ) : this(
        includeObjectsWithNoValueSet,
        operationType,
        operator,
        timePoint,
        type,
        endpointBehavior,
        propertyParser,
        mutableMapOf(),
    )

    /**
     * Indicates whether objects with no value set for the property should be included in the
     * operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeObjectsWithNoValueSet(): Boolean =
        includeObjectsWithNoValueSet.getRequired("includeObjectsWithNoValueSet")

    /**
     * Specifies the type of operation (TIME_POINT).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): OperationType = operationType.getRequired("operationType")

    /**
     * Specifies the operation to be applied within the time point operation (IS_BEFORE, IS_AFTER).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * Defines the specific point in time for the operation, which can be a date, indexed time, or
     * property-referenced time.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timePoint(): TimePoint = timePoint.getRequired("timePoint")

    /**
     * Defines the type of operation being performed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Describes the behavior at the endpoint of the time point operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endpointBehavior(): Optional<String> = endpointBehavior.getOptional("endpointBehavior")

    /**
     * Specifies the parser used for interpreting the property in the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyParser(): Optional<String> = propertyParser.getOptional("propertyParser")

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
    fun _operationType(): JsonField<OperationType> = operationType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

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
     * Returns the raw JSON value of [endpointBehavior].
     *
     * Unlike [endpointBehavior], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("endpointBehavior")
    @ExcludeMissing
    fun _endpointBehavior(): JsonField<String> = endpointBehavior

    /**
     * Returns the raw JSON value of [propertyParser].
     *
     * Unlike [propertyParser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyParser")
    @ExcludeMissing
    fun _propertyParser(): JsonField<String> = propertyParser

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
         * Returns a mutable builder for constructing an instance of [PublicTimePointOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .timePoint()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicTimePointOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var operationType: JsonField<OperationType>? = null
        private var operator: JsonField<String>? = null
        private var timePoint: JsonField<TimePoint>? = null
        private var type: JsonField<String>? = null
        private var endpointBehavior: JsonField<String> = JsonMissing.of()
        private var propertyParser: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicTimePointOperation: PublicTimePointOperation) = apply {
            includeObjectsWithNoValueSet = publicTimePointOperation.includeObjectsWithNoValueSet
            operationType = publicTimePointOperation.operationType
            operator = publicTimePointOperation.operator
            timePoint = publicTimePointOperation.timePoint
            type = publicTimePointOperation.type
            endpointBehavior = publicTimePointOperation.endpointBehavior
            propertyParser = publicTimePointOperation.propertyParser
            additionalProperties = publicTimePointOperation.additionalProperties.toMutableMap()
        }

        /**
         * Indicates whether objects with no value set for the property should be included in the
         * operation.
         */
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

        /** Specifies the type of operation (TIME_POINT). */
        fun operationType(operationType: OperationType) = operationType(JsonField.of(operationType))

        /**
         * Sets [Builder.operationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationType] with a well-typed [OperationType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operationType(operationType: JsonField<OperationType>) = apply {
            this.operationType = operationType
        }

        /**
         * Specifies the operation to be applied within the time point operation (IS_BEFORE,
         * IS_AFTER).
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /**
         * Defines the specific point in time for the operation, which can be a date, indexed time,
         * or property-referenced time.
         */
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
        fun timePoint(date: PublicDatePoint) = timePoint(TimePoint.ofDate(date))

        /** Alias for calling [timePoint] with `TimePoint.ofIndexed(indexed)`. */
        fun timePoint(indexed: PublicIndexedTimePoint) = timePoint(TimePoint.ofIndexed(indexed))

        /**
         * Alias for calling [timePoint] with `TimePoint.ofPropertyReferenced(propertyReferenced)`.
         */
        fun timePoint(propertyReferenced: PublicPropertyReferencedTime) =
            timePoint(TimePoint.ofPropertyReferenced(propertyReferenced))

        /** Defines the type of operation being performed. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Describes the behavior at the endpoint of the time point operation. */
        fun endpointBehavior(endpointBehavior: String) =
            endpointBehavior(JsonField.of(endpointBehavior))

        /**
         * Sets [Builder.endpointBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpointBehavior] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endpointBehavior(endpointBehavior: JsonField<String>) = apply {
            this.endpointBehavior = endpointBehavior
        }

        /** Specifies the parser used for interpreting the property in the operation. */
        fun propertyParser(propertyParser: String) = propertyParser(JsonField.of(propertyParser))

        /**
         * Sets [Builder.propertyParser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyParser] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun propertyParser(propertyParser: JsonField<String>) = apply {
            this.propertyParser = propertyParser
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
         * Returns an immutable instance of [PublicTimePointOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .timePoint()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicTimePointOperation =
            PublicTimePointOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("timePoint", timePoint),
                checkRequired("type", type),
                endpointBehavior,
                propertyParser,
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
    fun validate(): PublicTimePointOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        operationType().validate()
        operator()
        timePoint().validate()
        type()
        endpointBehavior()
        propertyParser()
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
        (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (operationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (timePoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (endpointBehavior.asKnown().isPresent) 1 else 0) +
            (if (propertyParser.asKnown().isPresent) 1 else 0)

    /** Specifies the type of operation (TIME_POINT). */
    class OperationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TIME_POINT = of("TIME_POINT")

            @JvmStatic fun of(value: String) = OperationType(JsonField.of(value))
        }

        /** An enum containing [OperationType]'s known values. */
        enum class Known {
            TIME_POINT
        }

        /**
         * An enum containing [OperationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OperationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TIME_POINT,
            /**
             * An enum member indicating that [OperationType] was instantiated with an unknown
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
                TIME_POINT -> Value.TIME_POINT
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
                TIME_POINT -> Known.TIME_POINT
                else -> throw HubSpotInvalidDataException("Unknown OperationType: $value")
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
        fun validate(): OperationType = apply {
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

            return other is OperationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Defines the specific point in time for the operation, which can be a date, indexed time, or
     * property-referenced time.
     */
    @JsonDeserialize(using = TimePoint.Deserializer::class)
    @JsonSerialize(using = TimePoint.Serializer::class)
    class TimePoint
    private constructor(
        private val date: PublicDatePoint? = null,
        private val indexed: PublicIndexedTimePoint? = null,
        private val propertyReferenced: PublicPropertyReferencedTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun date(): Optional<PublicDatePoint> = Optional.ofNullable(date)

        fun indexed(): Optional<PublicIndexedTimePoint> = Optional.ofNullable(indexed)

        fun propertyReferenced(): Optional<PublicPropertyReferencedTime> =
            Optional.ofNullable(propertyReferenced)

        fun isDate(): Boolean = date != null

        fun isIndexed(): Boolean = indexed != null

        fun isPropertyReferenced(): Boolean = propertyReferenced != null

        fun asDate(): PublicDatePoint = date.getOrThrow("date")

        fun asIndexed(): PublicIndexedTimePoint = indexed.getOrThrow("indexed")

        fun asPropertyReferenced(): PublicPropertyReferencedTime =
            propertyReferenced.getOrThrow("propertyReferenced")

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
         *     public Optional<String> visitDate(PublicDatePoint date) {
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
                propertyReferenced != null -> visitor.visitPropertyReferenced(propertyReferenced)
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
                    override fun visitDate(date: PublicDatePoint) {
                        date.validate()
                    }

                    override fun visitIndexed(indexed: PublicIndexedTimePoint) {
                        indexed.validate()
                    }

                    override fun visitPropertyReferenced(
                        propertyReferenced: PublicPropertyReferencedTime
                    ) {
                        propertyReferenced.validate()
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
                    override fun visitDate(date: PublicDatePoint) = date.validity()

                    override fun visitIndexed(indexed: PublicIndexedTimePoint) = indexed.validity()

                    override fun visitPropertyReferenced(
                        propertyReferenced: PublicPropertyReferencedTime
                    ) = propertyReferenced.validity()

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
                propertyReferenced == other.propertyReferenced
        }

        override fun hashCode(): Int = Objects.hash(date, indexed, propertyReferenced)

        override fun toString(): String =
            when {
                date != null -> "TimePoint{date=$date}"
                indexed != null -> "TimePoint{indexed=$indexed}"
                propertyReferenced != null -> "TimePoint{propertyReferenced=$propertyReferenced}"
                _json != null -> "TimePoint{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TimePoint")
            }

        companion object {

            @JvmStatic fun ofDate(date: PublicDatePoint) = TimePoint(date = date)

            @JvmStatic fun ofIndexed(indexed: PublicIndexedTimePoint) = TimePoint(indexed = indexed)

            @JvmStatic
            fun ofPropertyReferenced(propertyReferenced: PublicPropertyReferencedTime) =
                TimePoint(propertyReferenced = propertyReferenced)
        }

        /**
         * An interface that defines how to map each variant of [TimePoint] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitDate(date: PublicDatePoint): T

            fun visitIndexed(indexed: PublicIndexedTimePoint): T

            fun visitPropertyReferenced(propertyReferenced: PublicPropertyReferencedTime): T

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
                val timeType = json.asObject().getOrNull()?.get("timeType")?.asString()?.getOrNull()

                when (timeType) {
                    "DATE" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicDatePoint>())?.let {
                            TimePoint(date = it, _json = json)
                        } ?: TimePoint(_json = json)
                    }
                    "INDEXED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicIndexedTimePoint>())?.let {
                            TimePoint(indexed = it, _json = json)
                        } ?: TimePoint(_json = json)
                    }
                    "PROPERTY_REFERENCED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicPropertyReferencedTime>())
                            ?.let { TimePoint(propertyReferenced = it, _json = json) }
                            ?: TimePoint(_json = json)
                    }
                }

                return TimePoint(_json = json)
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
                    value.propertyReferenced != null ->
                        generator.writeObject(value.propertyReferenced)
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

        return other is PublicTimePointOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            operationType == other.operationType &&
            operator == other.operator &&
            timePoint == other.timePoint &&
            type == other.type &&
            endpointBehavior == other.endpointBehavior &&
            propertyParser == other.propertyParser &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            operationType,
            operator,
            timePoint,
            type,
            endpointBehavior,
            propertyParser,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicTimePointOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, operationType=$operationType, operator=$operator, timePoint=$timePoint, type=$type, endpointBehavior=$endpointBehavior, propertyParser=$propertyParser, additionalProperties=$additionalProperties}"
}
