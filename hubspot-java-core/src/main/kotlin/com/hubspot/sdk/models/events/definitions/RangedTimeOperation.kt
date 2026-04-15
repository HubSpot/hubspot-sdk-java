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

class RangedTimeOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val lowerBoundEndpointBehavior: JsonField<LowerBoundEndpointBehavior>,
    private val lowerBoundTimePoint: JsonField<LowerBoundTimePoint>,
    private val operationType: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val operatorName: JsonField<String>,
    private val propertyParser: JsonField<PropertyParser>,
    private val propertyType: JsonField<PropertyType>,
    private val type: JsonField<String>,
    private val upperBoundEndpointBehavior: JsonField<UpperBoundEndpointBehavior>,
    private val upperBoundTimePoint: JsonField<UpperBoundTimePoint>,
    private val defaultValue: JsonField<String>,
    private val renderSpec: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lowerBoundEndpointBehavior")
        @ExcludeMissing
        lowerBoundEndpointBehavior: JsonField<LowerBoundEndpointBehavior> = JsonMissing.of(),
        @JsonProperty("lowerBoundTimePoint")
        @ExcludeMissing
        lowerBoundTimePoint: JsonField<LowerBoundTimePoint> = JsonMissing.of(),
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
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upperBoundEndpointBehavior")
        @ExcludeMissing
        upperBoundEndpointBehavior: JsonField<UpperBoundEndpointBehavior> = JsonMissing.of(),
        @JsonProperty("upperBoundTimePoint")
        @ExcludeMissing
        upperBoundTimePoint: JsonField<UpperBoundTimePoint> = JsonMissing.of(),
        @JsonProperty("defaultValue")
        @ExcludeMissing
        defaultValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("renderSpec") @ExcludeMissing renderSpec: JsonField<String> = JsonMissing.of(),
    ) : this(
        includeObjectsWithNoValueSet,
        lowerBoundEndpointBehavior,
        lowerBoundTimePoint,
        operationType,
        operator,
        operatorName,
        propertyParser,
        propertyType,
        type,
        upperBoundEndpointBehavior,
        upperBoundTimePoint,
        defaultValue,
        renderSpec,
        mutableMapOf(),
    )

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
    fun lowerBoundEndpointBehavior(): LowerBoundEndpointBehavior =
        lowerBoundEndpointBehavior.getRequired("lowerBoundEndpointBehavior")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerBoundTimePoint(): LowerBoundTimePoint =
        lowerBoundTimePoint.getRequired("lowerBoundTimePoint")

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
    fun type(): String = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upperBoundEndpointBehavior(): UpperBoundEndpointBehavior =
        upperBoundEndpointBehavior.getRequired("upperBoundEndpointBehavior")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upperBoundTimePoint(): UpperBoundTimePoint =
        upperBoundTimePoint.getRequired("upperBoundTimePoint")

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
     * Returns the raw JSON value of [includeObjectsWithNoValueSet].
     *
     * Unlike [includeObjectsWithNoValueSet], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeObjectsWithNoValueSet")
    @ExcludeMissing
    fun _includeObjectsWithNoValueSet(): JsonField<Boolean> = includeObjectsWithNoValueSet

    /**
     * Returns the raw JSON value of [lowerBoundEndpointBehavior].
     *
     * Unlike [lowerBoundEndpointBehavior], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("lowerBoundEndpointBehavior")
    @ExcludeMissing
    fun _lowerBoundEndpointBehavior(): JsonField<LowerBoundEndpointBehavior> =
        lowerBoundEndpointBehavior

    /**
     * Returns the raw JSON value of [lowerBoundTimePoint].
     *
     * Unlike [lowerBoundTimePoint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lowerBoundTimePoint")
    @ExcludeMissing
    fun _lowerBoundTimePoint(): JsonField<LowerBoundTimePoint> = lowerBoundTimePoint

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [upperBoundEndpointBehavior].
     *
     * Unlike [upperBoundEndpointBehavior], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("upperBoundEndpointBehavior")
    @ExcludeMissing
    fun _upperBoundEndpointBehavior(): JsonField<UpperBoundEndpointBehavior> =
        upperBoundEndpointBehavior

    /**
     * Returns the raw JSON value of [upperBoundTimePoint].
     *
     * Unlike [upperBoundTimePoint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upperBoundTimePoint")
    @ExcludeMissing
    fun _upperBoundTimePoint(): JsonField<UpperBoundTimePoint> = upperBoundTimePoint

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
         * Returns a mutable builder for constructing an instance of [RangedTimeOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .lowerBoundEndpointBehavior()
         * .lowerBoundTimePoint()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyParser()
         * .propertyType()
         * .type()
         * .upperBoundEndpointBehavior()
         * .upperBoundTimePoint()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RangedTimeOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var lowerBoundEndpointBehavior: JsonField<LowerBoundEndpointBehavior>? = null
        private var lowerBoundTimePoint: JsonField<LowerBoundTimePoint>? = null
        private var operationType: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var operatorName: JsonField<String>? = null
        private var propertyParser: JsonField<PropertyParser>? = null
        private var propertyType: JsonField<PropertyType>? = null
        private var type: JsonField<String>? = null
        private var upperBoundEndpointBehavior: JsonField<UpperBoundEndpointBehavior>? = null
        private var upperBoundTimePoint: JsonField<UpperBoundTimePoint>? = null
        private var defaultValue: JsonField<String> = JsonMissing.of()
        private var renderSpec: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rangedTimeOperation: RangedTimeOperation) = apply {
            includeObjectsWithNoValueSet = rangedTimeOperation.includeObjectsWithNoValueSet
            lowerBoundEndpointBehavior = rangedTimeOperation.lowerBoundEndpointBehavior
            lowerBoundTimePoint = rangedTimeOperation.lowerBoundTimePoint
            operationType = rangedTimeOperation.operationType
            operator = rangedTimeOperation.operator
            operatorName = rangedTimeOperation.operatorName
            propertyParser = rangedTimeOperation.propertyParser
            propertyType = rangedTimeOperation.propertyType
            type = rangedTimeOperation.type
            upperBoundEndpointBehavior = rangedTimeOperation.upperBoundEndpointBehavior
            upperBoundTimePoint = rangedTimeOperation.upperBoundTimePoint
            defaultValue = rangedTimeOperation.defaultValue
            renderSpec = rangedTimeOperation.renderSpec
            additionalProperties = rangedTimeOperation.additionalProperties.toMutableMap()
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

        fun lowerBoundEndpointBehavior(lowerBoundEndpointBehavior: LowerBoundEndpointBehavior) =
            lowerBoundEndpointBehavior(JsonField.of(lowerBoundEndpointBehavior))

        /**
         * Sets [Builder.lowerBoundEndpointBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerBoundEndpointBehavior] with a well-typed
         * [LowerBoundEndpointBehavior] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun lowerBoundEndpointBehavior(
            lowerBoundEndpointBehavior: JsonField<LowerBoundEndpointBehavior>
        ) = apply { this.lowerBoundEndpointBehavior = lowerBoundEndpointBehavior }

        fun lowerBoundTimePoint(lowerBoundTimePoint: LowerBoundTimePoint) =
            lowerBoundTimePoint(JsonField.of(lowerBoundTimePoint))

        /**
         * Sets [Builder.lowerBoundTimePoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerBoundTimePoint] with a well-typed
         * [LowerBoundTimePoint] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun lowerBoundTimePoint(lowerBoundTimePoint: JsonField<LowerBoundTimePoint>) = apply {
            this.lowerBoundTimePoint = lowerBoundTimePoint
        }

        /** Alias for calling [lowerBoundTimePoint] with `LowerBoundTimePoint.ofDate(date)`. */
        fun lowerBoundTimePoint(date: DatePoint) =
            lowerBoundTimePoint(LowerBoundTimePoint.ofDate(date))

        /**
         * Alias for calling [lowerBoundTimePoint] with `LowerBoundTimePoint.ofIndexed(indexed)`.
         */
        fun lowerBoundTimePoint(indexed: IndexedTimePoint) =
            lowerBoundTimePoint(LowerBoundTimePoint.ofIndexed(indexed))

        /**
         * Alias for calling [lowerBoundTimePoint] with
         * `LowerBoundTimePoint.ofPropertyReferencedTime(propertyReferencedTime)`.
         */
        fun lowerBoundTimePoint(propertyReferencedTime: PropertyReferencedTime) =
            lowerBoundTimePoint(
                LowerBoundTimePoint.ofPropertyReferencedTime(propertyReferencedTime)
            )

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

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun upperBoundEndpointBehavior(upperBoundEndpointBehavior: UpperBoundEndpointBehavior) =
            upperBoundEndpointBehavior(JsonField.of(upperBoundEndpointBehavior))

        /**
         * Sets [Builder.upperBoundEndpointBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperBoundEndpointBehavior] with a well-typed
         * [UpperBoundEndpointBehavior] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun upperBoundEndpointBehavior(
            upperBoundEndpointBehavior: JsonField<UpperBoundEndpointBehavior>
        ) = apply { this.upperBoundEndpointBehavior = upperBoundEndpointBehavior }

        fun upperBoundTimePoint(upperBoundTimePoint: UpperBoundTimePoint) =
            upperBoundTimePoint(JsonField.of(upperBoundTimePoint))

        /**
         * Sets [Builder.upperBoundTimePoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperBoundTimePoint] with a well-typed
         * [UpperBoundTimePoint] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun upperBoundTimePoint(upperBoundTimePoint: JsonField<UpperBoundTimePoint>) = apply {
            this.upperBoundTimePoint = upperBoundTimePoint
        }

        /** Alias for calling [upperBoundTimePoint] with `UpperBoundTimePoint.ofDate(date)`. */
        fun upperBoundTimePoint(date: DatePoint) =
            upperBoundTimePoint(UpperBoundTimePoint.ofDate(date))

        /**
         * Alias for calling [upperBoundTimePoint] with `UpperBoundTimePoint.ofIndexed(indexed)`.
         */
        fun upperBoundTimePoint(indexed: IndexedTimePoint) =
            upperBoundTimePoint(UpperBoundTimePoint.ofIndexed(indexed))

        /**
         * Alias for calling [upperBoundTimePoint] with
         * `UpperBoundTimePoint.ofPropertyReferencedTime(propertyReferencedTime)`.
         */
        fun upperBoundTimePoint(propertyReferencedTime: PropertyReferencedTime) =
            upperBoundTimePoint(
                UpperBoundTimePoint.ofPropertyReferencedTime(propertyReferencedTime)
            )

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
         * Returns an immutable instance of [RangedTimeOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .lowerBoundEndpointBehavior()
         * .lowerBoundTimePoint()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyParser()
         * .propertyType()
         * .type()
         * .upperBoundEndpointBehavior()
         * .upperBoundTimePoint()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RangedTimeOperation =
            RangedTimeOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("lowerBoundEndpointBehavior", lowerBoundEndpointBehavior),
                checkRequired("lowerBoundTimePoint", lowerBoundTimePoint),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("operatorName", operatorName),
                checkRequired("propertyParser", propertyParser),
                checkRequired("propertyType", propertyType),
                checkRequired("type", type),
                checkRequired("upperBoundEndpointBehavior", upperBoundEndpointBehavior),
                checkRequired("upperBoundTimePoint", upperBoundTimePoint),
                defaultValue,
                renderSpec,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RangedTimeOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        lowerBoundEndpointBehavior().validate()
        lowerBoundTimePoint().validate()
        operationType()
        operator().validate()
        operatorName()
        propertyParser().validate()
        propertyType().validate()
        type()
        upperBoundEndpointBehavior().validate()
        upperBoundTimePoint().validate()
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
        (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (lowerBoundEndpointBehavior.asKnown().getOrNull()?.validity() ?: 0) +
            (lowerBoundTimePoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operationType.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatorName.asKnown().isPresent) 1 else 0) +
            (propertyParser.asKnown().getOrNull()?.validity() ?: 0) +
            (propertyType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (upperBoundEndpointBehavior.asKnown().getOrNull()?.validity() ?: 0) +
            (upperBoundTimePoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultValue.asKnown().isPresent) 1 else 0) +
            (if (renderSpec.asKnown().isPresent) 1 else 0)

    class LowerBoundEndpointBehavior
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = LowerBoundEndpointBehavior(JsonField.of(value))
        }

        /** An enum containing [LowerBoundEndpointBehavior]'s known values. */
        enum class Known {
            EXCLUSIVE,
            INCLUSIVE,
        }

        /**
         * An enum containing [LowerBoundEndpointBehavior]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [LowerBoundEndpointBehavior] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXCLUSIVE,
            INCLUSIVE,
            /**
             * An enum member indicating that [LowerBoundEndpointBehavior] was instantiated with an
             * unknown value.
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
                else ->
                    throw HubSpotInvalidDataException("Unknown LowerBoundEndpointBehavior: $value")
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

        fun validate(): LowerBoundEndpointBehavior = apply {
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

            return other is LowerBoundEndpointBehavior && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = LowerBoundTimePoint.Deserializer::class)
    @JsonSerialize(using = LowerBoundTimePoint.Serializer::class)
    class LowerBoundTimePoint
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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                date != null -> visitor.visitDate(date)
                indexed != null -> visitor.visitIndexed(indexed)
                propertyReferencedTime != null ->
                    visitor.visitPropertyReferencedTime(propertyReferencedTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): LowerBoundTimePoint = apply {
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

            return other is LowerBoundTimePoint &&
                date == other.date &&
                indexed == other.indexed &&
                propertyReferencedTime == other.propertyReferencedTime
        }

        override fun hashCode(): Int = Objects.hash(date, indexed, propertyReferencedTime)

        override fun toString(): String =
            when {
                date != null -> "LowerBoundTimePoint{date=$date}"
                indexed != null -> "LowerBoundTimePoint{indexed=$indexed}"
                propertyReferencedTime != null ->
                    "LowerBoundTimePoint{propertyReferencedTime=$propertyReferencedTime}"
                _json != null -> "LowerBoundTimePoint{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid LowerBoundTimePoint")
            }

        companion object {

            @JvmStatic fun ofDate(date: DatePoint) = LowerBoundTimePoint(date = date)

            @JvmStatic
            fun ofIndexed(indexed: IndexedTimePoint) = LowerBoundTimePoint(indexed = indexed)

            @JvmStatic
            fun ofPropertyReferencedTime(propertyReferencedTime: PropertyReferencedTime) =
                LowerBoundTimePoint(propertyReferencedTime = propertyReferencedTime)
        }

        /**
         * An interface that defines how to map each variant of [LowerBoundTimePoint] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitDate(date: DatePoint): T

            fun visitIndexed(indexed: IndexedTimePoint): T

            fun visitPropertyReferencedTime(propertyReferencedTime: PropertyReferencedTime): T

            /**
             * Maps an unknown variant of [LowerBoundTimePoint] to a value of type [T].
             *
             * An instance of [LowerBoundTimePoint] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown LowerBoundTimePoint: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<LowerBoundTimePoint>(LowerBoundTimePoint::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): LowerBoundTimePoint {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DatePoint>())?.let {
                                LowerBoundTimePoint(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IndexedTimePoint>())?.let {
                                LowerBoundTimePoint(indexed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PropertyReferencedTime>())?.let {
                                LowerBoundTimePoint(propertyReferencedTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> LowerBoundTimePoint(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<LowerBoundTimePoint>(LowerBoundTimePoint::class) {

            override fun serialize(
                value: LowerBoundTimePoint,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.date != null -> generator.writeObject(value.date)
                    value.indexed != null -> generator.writeObject(value.indexed)
                    value.propertyReferencedTime != null ->
                        generator.writeObject(value.propertyReferencedTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid LowerBoundTimePoint")
                }
            }
        }
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

            @JvmField val IS_BETWEEN = of("IS_BETWEEN")

            @JvmField val IS_NOT_BETWEEN = of("IS_NOT_BETWEEN")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IS_BETWEEN,
            IS_NOT_BETWEEN,
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
            IS_BETWEEN,
            IS_NOT_BETWEEN,
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
                IS_BETWEEN -> Value.IS_BETWEEN
                IS_NOT_BETWEEN -> Value.IS_NOT_BETWEEN
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
                IS_BETWEEN -> Known.IS_BETWEEN
                IS_NOT_BETWEEN -> Known.IS_NOT_BETWEEN
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

            @JvmField val RANGEDTIME = of("rangedtime")

            @JvmStatic fun of(value: String) = PropertyType(JsonField.of(value))
        }

        /** An enum containing [PropertyType]'s known values. */
        enum class Known {
            RANGEDTIME
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
            RANGEDTIME,
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
                RANGEDTIME -> Value.RANGEDTIME
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
                RANGEDTIME -> Known.RANGEDTIME
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

    class UpperBoundEndpointBehavior
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = UpperBoundEndpointBehavior(JsonField.of(value))
        }

        /** An enum containing [UpperBoundEndpointBehavior]'s known values. */
        enum class Known {
            EXCLUSIVE,
            INCLUSIVE,
        }

        /**
         * An enum containing [UpperBoundEndpointBehavior]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [UpperBoundEndpointBehavior] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXCLUSIVE,
            INCLUSIVE,
            /**
             * An enum member indicating that [UpperBoundEndpointBehavior] was instantiated with an
             * unknown value.
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
                else ->
                    throw HubSpotInvalidDataException("Unknown UpperBoundEndpointBehavior: $value")
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

        fun validate(): UpperBoundEndpointBehavior = apply {
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

            return other is UpperBoundEndpointBehavior && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = UpperBoundTimePoint.Deserializer::class)
    @JsonSerialize(using = UpperBoundTimePoint.Serializer::class)
    class UpperBoundTimePoint
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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                date != null -> visitor.visitDate(date)
                indexed != null -> visitor.visitIndexed(indexed)
                propertyReferencedTime != null ->
                    visitor.visitPropertyReferencedTime(propertyReferencedTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): UpperBoundTimePoint = apply {
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

            return other is UpperBoundTimePoint &&
                date == other.date &&
                indexed == other.indexed &&
                propertyReferencedTime == other.propertyReferencedTime
        }

        override fun hashCode(): Int = Objects.hash(date, indexed, propertyReferencedTime)

        override fun toString(): String =
            when {
                date != null -> "UpperBoundTimePoint{date=$date}"
                indexed != null -> "UpperBoundTimePoint{indexed=$indexed}"
                propertyReferencedTime != null ->
                    "UpperBoundTimePoint{propertyReferencedTime=$propertyReferencedTime}"
                _json != null -> "UpperBoundTimePoint{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid UpperBoundTimePoint")
            }

        companion object {

            @JvmStatic fun ofDate(date: DatePoint) = UpperBoundTimePoint(date = date)

            @JvmStatic
            fun ofIndexed(indexed: IndexedTimePoint) = UpperBoundTimePoint(indexed = indexed)

            @JvmStatic
            fun ofPropertyReferencedTime(propertyReferencedTime: PropertyReferencedTime) =
                UpperBoundTimePoint(propertyReferencedTime = propertyReferencedTime)
        }

        /**
         * An interface that defines how to map each variant of [UpperBoundTimePoint] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitDate(date: DatePoint): T

            fun visitIndexed(indexed: IndexedTimePoint): T

            fun visitPropertyReferencedTime(propertyReferencedTime: PropertyReferencedTime): T

            /**
             * Maps an unknown variant of [UpperBoundTimePoint] to a value of type [T].
             *
             * An instance of [UpperBoundTimePoint] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown UpperBoundTimePoint: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<UpperBoundTimePoint>(UpperBoundTimePoint::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): UpperBoundTimePoint {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DatePoint>())?.let {
                                UpperBoundTimePoint(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IndexedTimePoint>())?.let {
                                UpperBoundTimePoint(indexed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PropertyReferencedTime>())?.let {
                                UpperBoundTimePoint(propertyReferencedTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> UpperBoundTimePoint(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<UpperBoundTimePoint>(UpperBoundTimePoint::class) {

            override fun serialize(
                value: UpperBoundTimePoint,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.date != null -> generator.writeObject(value.date)
                    value.indexed != null -> generator.writeObject(value.indexed)
                    value.propertyReferencedTime != null ->
                        generator.writeObject(value.propertyReferencedTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid UpperBoundTimePoint")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RangedTimeOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            lowerBoundEndpointBehavior == other.lowerBoundEndpointBehavior &&
            lowerBoundTimePoint == other.lowerBoundTimePoint &&
            operationType == other.operationType &&
            operator == other.operator &&
            operatorName == other.operatorName &&
            propertyParser == other.propertyParser &&
            propertyType == other.propertyType &&
            type == other.type &&
            upperBoundEndpointBehavior == other.upperBoundEndpointBehavior &&
            upperBoundTimePoint == other.upperBoundTimePoint &&
            defaultValue == other.defaultValue &&
            renderSpec == other.renderSpec &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            lowerBoundEndpointBehavior,
            lowerBoundTimePoint,
            operationType,
            operator,
            operatorName,
            propertyParser,
            propertyType,
            type,
            upperBoundEndpointBehavior,
            upperBoundTimePoint,
            defaultValue,
            renderSpec,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RangedTimeOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, lowerBoundEndpointBehavior=$lowerBoundEndpointBehavior, lowerBoundTimePoint=$lowerBoundTimePoint, operationType=$operationType, operator=$operator, operatorName=$operatorName, propertyParser=$propertyParser, propertyType=$propertyType, type=$type, upperBoundEndpointBehavior=$upperBoundEndpointBehavior, upperBoundTimePoint=$upperBoundTimePoint, defaultValue=$defaultValue, renderSpec=$renderSpec, additionalProperties=$additionalProperties}"
}
