// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

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
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeObjectsWithNoValueSet(): Boolean =
        includeObjectsWithNoValueSet.getRequired("includeObjectsWithNoValueSet")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): OperationType = operationType.getRequired("operationType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timePoint(): TimePoint = timePoint.getRequired("timePoint")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endpointBehavior(): Optional<String> = endpointBehavior.getOptional("endpointBehavior")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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

        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        fun timePoint(timePoint: TimePoint) = timePoint(JsonField.of(timePoint))

        /**
         * Sets [Builder.timePoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timePoint] with a well-typed [TimePoint] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timePoint(timePoint: JsonField<TimePoint>) = apply { this.timePoint = timePoint }

        /** Alias for calling [timePoint] with `TimePoint.ofPublicDate(publicDate)`. */
        fun timePoint(publicDate: PublicDatePoint) = timePoint(TimePoint.ofPublicDate(publicDate))

        /** Alias for calling [timePoint] with `TimePoint.ofPublicIndexed(publicIndexed)`. */
        fun timePoint(publicIndexed: PublicIndexedTimePoint) =
            timePoint(TimePoint.ofPublicIndexed(publicIndexed))

        /**
         * Alias for calling [timePoint] with
         * `TimePoint.ofPublicPropertyReferencedTime(publicPropertyReferencedTime)`.
         */
        fun timePoint(publicPropertyReferencedTime: PublicPropertyReferencedTime) =
            timePoint(TimePoint.ofPublicPropertyReferencedTime(publicPropertyReferencedTime))

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
        (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (operationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (timePoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (endpointBehavior.asKnown().isPresent) 1 else 0) +
            (if (propertyParser.asKnown().isPresent) 1 else 0)

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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TIME_POINT -> Known.TIME_POINT
                else -> throw HubspotInvalidDataException("Unknown OperationType: $value")
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

            return other is OperationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = TimePoint.Deserializer::class)
    @JsonSerialize(using = TimePoint.Serializer::class)
    class TimePoint
    private constructor(
        private val publicDate: PublicDatePoint? = null,
        private val publicIndexed: PublicIndexedTimePoint? = null,
        private val publicPropertyReferencedTime: PublicPropertyReferencedTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicDate(): Optional<PublicDatePoint> = Optional.ofNullable(publicDate)

        fun publicIndexed(): Optional<PublicIndexedTimePoint> = Optional.ofNullable(publicIndexed)

        fun publicPropertyReferencedTime(): Optional<PublicPropertyReferencedTime> =
            Optional.ofNullable(publicPropertyReferencedTime)

        fun isPublicDate(): Boolean = publicDate != null

        fun isPublicIndexed(): Boolean = publicIndexed != null

        fun isPublicPropertyReferencedTime(): Boolean = publicPropertyReferencedTime != null

        fun asPublicDate(): PublicDatePoint = publicDate.getOrThrow("publicDate")

        fun asPublicIndexed(): PublicIndexedTimePoint = publicIndexed.getOrThrow("publicIndexed")

        fun asPublicPropertyReferencedTime(): PublicPropertyReferencedTime =
            publicPropertyReferencedTime.getOrThrow("publicPropertyReferencedTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicDate != null -> visitor.visitPublicDate(publicDate)
                publicIndexed != null -> visitor.visitPublicIndexed(publicIndexed)
                publicPropertyReferencedTime != null ->
                    visitor.visitPublicPropertyReferencedTime(publicPropertyReferencedTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): TimePoint = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicDate(publicDate: PublicDatePoint) {
                        publicDate.validate()
                    }

                    override fun visitPublicIndexed(publicIndexed: PublicIndexedTimePoint) {
                        publicIndexed.validate()
                    }

                    override fun visitPublicPropertyReferencedTime(
                        publicPropertyReferencedTime: PublicPropertyReferencedTime
                    ) {
                        publicPropertyReferencedTime.validate()
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
                    override fun visitPublicDate(publicDate: PublicDatePoint) =
                        publicDate.validity()

                    override fun visitPublicIndexed(publicIndexed: PublicIndexedTimePoint) =
                        publicIndexed.validity()

                    override fun visitPublicPropertyReferencedTime(
                        publicPropertyReferencedTime: PublicPropertyReferencedTime
                    ) = publicPropertyReferencedTime.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TimePoint &&
                publicDate == other.publicDate &&
                publicIndexed == other.publicIndexed &&
                publicPropertyReferencedTime == other.publicPropertyReferencedTime
        }

        override fun hashCode(): Int =
            Objects.hash(publicDate, publicIndexed, publicPropertyReferencedTime)

        override fun toString(): String =
            when {
                publicDate != null -> "TimePoint{publicDate=$publicDate}"
                publicIndexed != null -> "TimePoint{publicIndexed=$publicIndexed}"
                publicPropertyReferencedTime != null ->
                    "TimePoint{publicPropertyReferencedTime=$publicPropertyReferencedTime}"
                _json != null -> "TimePoint{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TimePoint")
            }

        companion object {

            @JvmStatic
            fun ofPublicDate(publicDate: PublicDatePoint) = TimePoint(publicDate = publicDate)

            @JvmStatic
            fun ofPublicIndexed(publicIndexed: PublicIndexedTimePoint) =
                TimePoint(publicIndexed = publicIndexed)

            @JvmStatic
            fun ofPublicPropertyReferencedTime(
                publicPropertyReferencedTime: PublicPropertyReferencedTime
            ) = TimePoint(publicPropertyReferencedTime = publicPropertyReferencedTime)
        }

        /**
         * An interface that defines how to map each variant of [TimePoint] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitPublicDate(publicDate: PublicDatePoint): T

            fun visitPublicIndexed(publicIndexed: PublicIndexedTimePoint): T

            fun visitPublicPropertyReferencedTime(
                publicPropertyReferencedTime: PublicPropertyReferencedTime
            ): T

            /**
             * Maps an unknown variant of [TimePoint] to a value of type [T].
             *
             * An instance of [TimePoint] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown TimePoint: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TimePoint>(TimePoint::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TimePoint {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicDatePoint>())?.let {
                                TimePoint(publicDate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicIndexedTimePoint>())?.let {
                                TimePoint(publicIndexed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicPropertyReferencedTime>())
                                ?.let { TimePoint(publicPropertyReferencedTime = it, _json = json) },
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
                    value.publicDate != null -> generator.writeObject(value.publicDate)
                    value.publicIndexed != null -> generator.writeObject(value.publicIndexed)
                    value.publicPropertyReferencedTime != null ->
                        generator.writeObject(value.publicPropertyReferencedTime)
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
