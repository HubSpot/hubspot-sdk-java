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
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicRangedTimeOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val lowerBoundTimePoint: JsonField<LowerBoundTimePoint>,
    private val operationType: JsonField<String>,
    private val operator: JsonField<String>,
    private val type: JsonField<Type>,
    private val upperBoundTimePoint: JsonField<UpperBoundTimePoint>,
    private val lowerBoundEndpointBehavior: JsonField<String>,
    private val propertyParser: JsonField<String>,
    private val upperBoundEndpointBehavior: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lowerBoundTimePoint")
        @ExcludeMissing
        lowerBoundTimePoint: JsonField<LowerBoundTimePoint> = JsonMissing.of(),
        @JsonProperty("operationType")
        @ExcludeMissing
        operationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("upperBoundTimePoint")
        @ExcludeMissing
        upperBoundTimePoint: JsonField<UpperBoundTimePoint> = JsonMissing.of(),
        @JsonProperty("lowerBoundEndpointBehavior")
        @ExcludeMissing
        lowerBoundEndpointBehavior: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertyParser")
        @ExcludeMissing
        propertyParser: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upperBoundEndpointBehavior")
        @ExcludeMissing
        upperBoundEndpointBehavior: JsonField<String> = JsonMissing.of(),
    ) : this(
        includeObjectsWithNoValueSet,
        lowerBoundTimePoint,
        operationType,
        operator,
        type,
        upperBoundTimePoint,
        lowerBoundEndpointBehavior,
        propertyParser,
        upperBoundEndpointBehavior,
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
     * Defines the lower bound time point for the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerBoundTimePoint(): LowerBoundTimePoint =
        lowerBoundTimePoint.getRequired("lowerBoundTimePoint")

    /**
     * Specifies the type of operation (TIME_RANGED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): String = operationType.getRequired("operationType")

    /**
     * Defines the operation to be applied within the time range (IS_BETWEEN, IS_NOT_BETWEEN).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * Specifies the type of operation (TIME_RANGED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Defines the upper bound time point for the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upperBoundTimePoint(): UpperBoundTimePoint =
        upperBoundTimePoint.getRequired("upperBoundTimePoint")

    /**
     * Describes the behavior at the lower bound endpoint of the time range.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lowerBoundEndpointBehavior(): Optional<String> =
        lowerBoundEndpointBehavior.getOptional("lowerBoundEndpointBehavior")

    /**
     * Specifies the parser used for the property in the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyParser(): Optional<String> = propertyParser.getOptional("propertyParser")

    /**
     * Describes the behavior at the upper bound endpoint of the time range.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upperBoundEndpointBehavior(): Optional<String> =
        upperBoundEndpointBehavior.getOptional("upperBoundEndpointBehavior")

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
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
     * Returns the raw JSON value of [lowerBoundEndpointBehavior].
     *
     * Unlike [lowerBoundEndpointBehavior], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("lowerBoundEndpointBehavior")
    @ExcludeMissing
    fun _lowerBoundEndpointBehavior(): JsonField<String> = lowerBoundEndpointBehavior

    /**
     * Returns the raw JSON value of [propertyParser].
     *
     * Unlike [propertyParser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyParser")
    @ExcludeMissing
    fun _propertyParser(): JsonField<String> = propertyParser

    /**
     * Returns the raw JSON value of [upperBoundEndpointBehavior].
     *
     * Unlike [upperBoundEndpointBehavior], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("upperBoundEndpointBehavior")
    @ExcludeMissing
    fun _upperBoundEndpointBehavior(): JsonField<String> = upperBoundEndpointBehavior

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
         * Returns a mutable builder for constructing an instance of [PublicRangedTimeOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .lowerBoundTimePoint()
         * .operationType()
         * .operator()
         * .type()
         * .upperBoundTimePoint()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicRangedTimeOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var lowerBoundTimePoint: JsonField<LowerBoundTimePoint>? = null
        private var operationType: JsonField<String>? = null
        private var operator: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var upperBoundTimePoint: JsonField<UpperBoundTimePoint>? = null
        private var lowerBoundEndpointBehavior: JsonField<String> = JsonMissing.of()
        private var propertyParser: JsonField<String> = JsonMissing.of()
        private var upperBoundEndpointBehavior: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicRangedTimeOperation: PublicRangedTimeOperation) = apply {
            includeObjectsWithNoValueSet = publicRangedTimeOperation.includeObjectsWithNoValueSet
            lowerBoundTimePoint = publicRangedTimeOperation.lowerBoundTimePoint
            operationType = publicRangedTimeOperation.operationType
            operator = publicRangedTimeOperation.operator
            type = publicRangedTimeOperation.type
            upperBoundTimePoint = publicRangedTimeOperation.upperBoundTimePoint
            lowerBoundEndpointBehavior = publicRangedTimeOperation.lowerBoundEndpointBehavior
            propertyParser = publicRangedTimeOperation.propertyParser
            upperBoundEndpointBehavior = publicRangedTimeOperation.upperBoundEndpointBehavior
            additionalProperties = publicRangedTimeOperation.additionalProperties.toMutableMap()
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

        /** Defines the lower bound time point for the operation. */
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

        /**
         * Alias for calling [lowerBoundTimePoint] with
         * `LowerBoundTimePoint.ofPublicDate(publicDate)`.
         */
        fun lowerBoundTimePoint(publicDate: PublicDatePoint) =
            lowerBoundTimePoint(LowerBoundTimePoint.ofPublicDate(publicDate))

        /**
         * Alias for calling [lowerBoundTimePoint] with
         * `LowerBoundTimePoint.ofPublicIndexed(publicIndexed)`.
         */
        fun lowerBoundTimePoint(publicIndexed: PublicIndexedTimePoint) =
            lowerBoundTimePoint(LowerBoundTimePoint.ofPublicIndexed(publicIndexed))

        /**
         * Alias for calling [lowerBoundTimePoint] with
         * `LowerBoundTimePoint.ofPublicPropertyReferencedTime(publicPropertyReferencedTime)`.
         */
        fun lowerBoundTimePoint(publicPropertyReferencedTime: PublicPropertyReferencedTime) =
            lowerBoundTimePoint(
                LowerBoundTimePoint.ofPublicPropertyReferencedTime(publicPropertyReferencedTime)
            )

        /** Specifies the type of operation (TIME_RANGED). */
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

        /**
         * Defines the operation to be applied within the time range (IS_BETWEEN, IS_NOT_BETWEEN).
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** Specifies the type of operation (TIME_RANGED). */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Defines the upper bound time point for the operation. */
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

        /**
         * Alias for calling [upperBoundTimePoint] with
         * `UpperBoundTimePoint.ofPublicDate(publicDate)`.
         */
        fun upperBoundTimePoint(publicDate: PublicDatePoint) =
            upperBoundTimePoint(UpperBoundTimePoint.ofPublicDate(publicDate))

        /**
         * Alias for calling [upperBoundTimePoint] with
         * `UpperBoundTimePoint.ofPublicIndexed(publicIndexed)`.
         */
        fun upperBoundTimePoint(publicIndexed: PublicIndexedTimePoint) =
            upperBoundTimePoint(UpperBoundTimePoint.ofPublicIndexed(publicIndexed))

        /**
         * Alias for calling [upperBoundTimePoint] with
         * `UpperBoundTimePoint.ofPublicPropertyReferencedTime(publicPropertyReferencedTime)`.
         */
        fun upperBoundTimePoint(publicPropertyReferencedTime: PublicPropertyReferencedTime) =
            upperBoundTimePoint(
                UpperBoundTimePoint.ofPublicPropertyReferencedTime(publicPropertyReferencedTime)
            )

        /** Describes the behavior at the lower bound endpoint of the time range. */
        fun lowerBoundEndpointBehavior(lowerBoundEndpointBehavior: String) =
            lowerBoundEndpointBehavior(JsonField.of(lowerBoundEndpointBehavior))

        /**
         * Sets [Builder.lowerBoundEndpointBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerBoundEndpointBehavior] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lowerBoundEndpointBehavior(lowerBoundEndpointBehavior: JsonField<String>) = apply {
            this.lowerBoundEndpointBehavior = lowerBoundEndpointBehavior
        }

        /** Specifies the parser used for the property in the operation. */
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

        /** Describes the behavior at the upper bound endpoint of the time range. */
        fun upperBoundEndpointBehavior(upperBoundEndpointBehavior: String) =
            upperBoundEndpointBehavior(JsonField.of(upperBoundEndpointBehavior))

        /**
         * Sets [Builder.upperBoundEndpointBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperBoundEndpointBehavior] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun upperBoundEndpointBehavior(upperBoundEndpointBehavior: JsonField<String>) = apply {
            this.upperBoundEndpointBehavior = upperBoundEndpointBehavior
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
         * Returns an immutable instance of [PublicRangedTimeOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .lowerBoundTimePoint()
         * .operationType()
         * .operator()
         * .type()
         * .upperBoundTimePoint()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicRangedTimeOperation =
            PublicRangedTimeOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("lowerBoundTimePoint", lowerBoundTimePoint),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("type", type),
                checkRequired("upperBoundTimePoint", upperBoundTimePoint),
                lowerBoundEndpointBehavior,
                propertyParser,
                upperBoundEndpointBehavior,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicRangedTimeOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        lowerBoundTimePoint().validate()
        operationType()
        operator()
        type().validate()
        upperBoundTimePoint().validate()
        lowerBoundEndpointBehavior()
        propertyParser()
        upperBoundEndpointBehavior()
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
            (lowerBoundTimePoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operationType.asKnown().isPresent) 1 else 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (upperBoundTimePoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lowerBoundEndpointBehavior.asKnown().isPresent) 1 else 0) +
            (if (propertyParser.asKnown().isPresent) 1 else 0) +
            (if (upperBoundEndpointBehavior.asKnown().isPresent) 1 else 0)

    /** Defines the lower bound time point for the operation. */
    @JsonDeserialize(using = LowerBoundTimePoint.Deserializer::class)
    @JsonSerialize(using = LowerBoundTimePoint.Serializer::class)
    class LowerBoundTimePoint
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

        fun validate(): LowerBoundTimePoint = apply {
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

            return other is LowerBoundTimePoint &&
                publicDate == other.publicDate &&
                publicIndexed == other.publicIndexed &&
                publicPropertyReferencedTime == other.publicPropertyReferencedTime
        }

        override fun hashCode(): Int =
            Objects.hash(publicDate, publicIndexed, publicPropertyReferencedTime)

        override fun toString(): String =
            when {
                publicDate != null -> "LowerBoundTimePoint{publicDate=$publicDate}"
                publicIndexed != null -> "LowerBoundTimePoint{publicIndexed=$publicIndexed}"
                publicPropertyReferencedTime != null ->
                    "LowerBoundTimePoint{publicPropertyReferencedTime=$publicPropertyReferencedTime}"
                _json != null -> "LowerBoundTimePoint{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid LowerBoundTimePoint")
            }

        companion object {

            @JvmStatic
            fun ofPublicDate(publicDate: PublicDatePoint) =
                LowerBoundTimePoint(publicDate = publicDate)

            @JvmStatic
            fun ofPublicIndexed(publicIndexed: PublicIndexedTimePoint) =
                LowerBoundTimePoint(publicIndexed = publicIndexed)

            @JvmStatic
            fun ofPublicPropertyReferencedTime(
                publicPropertyReferencedTime: PublicPropertyReferencedTime
            ) = LowerBoundTimePoint(publicPropertyReferencedTime = publicPropertyReferencedTime)
        }

        /**
         * An interface that defines how to map each variant of [LowerBoundTimePoint] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitPublicDate(publicDate: PublicDatePoint): T

            fun visitPublicIndexed(publicIndexed: PublicIndexedTimePoint): T

            fun visitPublicPropertyReferencedTime(
                publicPropertyReferencedTime: PublicPropertyReferencedTime
            ): T

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
                            tryDeserialize(node, jacksonTypeRef<PublicDatePoint>())?.let {
                                LowerBoundTimePoint(publicDate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicIndexedTimePoint>())?.let {
                                LowerBoundTimePoint(publicIndexed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicPropertyReferencedTime>())
                                ?.let {
                                    LowerBoundTimePoint(
                                        publicPropertyReferencedTime = it,
                                        _json = json,
                                    )
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
                    value.publicDate != null -> generator.writeObject(value.publicDate)
                    value.publicIndexed != null -> generator.writeObject(value.publicIndexed)
                    value.publicPropertyReferencedTime != null ->
                        generator.writeObject(value.publicPropertyReferencedTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid LowerBoundTimePoint")
                }
            }
        }
    }

    /** Specifies the type of operation (TIME_RANGED). */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TIME_RANGED = of("TIME_RANGED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TIME_RANGED
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TIME_RANGED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                TIME_RANGED -> Value.TIME_RANGED
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
                TIME_RANGED -> Known.TIME_RANGED
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Defines the upper bound time point for the operation. */
    @JsonDeserialize(using = UpperBoundTimePoint.Deserializer::class)
    @JsonSerialize(using = UpperBoundTimePoint.Serializer::class)
    class UpperBoundTimePoint
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

        fun validate(): UpperBoundTimePoint = apply {
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

            return other is UpperBoundTimePoint &&
                publicDate == other.publicDate &&
                publicIndexed == other.publicIndexed &&
                publicPropertyReferencedTime == other.publicPropertyReferencedTime
        }

        override fun hashCode(): Int =
            Objects.hash(publicDate, publicIndexed, publicPropertyReferencedTime)

        override fun toString(): String =
            when {
                publicDate != null -> "UpperBoundTimePoint{publicDate=$publicDate}"
                publicIndexed != null -> "UpperBoundTimePoint{publicIndexed=$publicIndexed}"
                publicPropertyReferencedTime != null ->
                    "UpperBoundTimePoint{publicPropertyReferencedTime=$publicPropertyReferencedTime}"
                _json != null -> "UpperBoundTimePoint{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid UpperBoundTimePoint")
            }

        companion object {

            @JvmStatic
            fun ofPublicDate(publicDate: PublicDatePoint) =
                UpperBoundTimePoint(publicDate = publicDate)

            @JvmStatic
            fun ofPublicIndexed(publicIndexed: PublicIndexedTimePoint) =
                UpperBoundTimePoint(publicIndexed = publicIndexed)

            @JvmStatic
            fun ofPublicPropertyReferencedTime(
                publicPropertyReferencedTime: PublicPropertyReferencedTime
            ) = UpperBoundTimePoint(publicPropertyReferencedTime = publicPropertyReferencedTime)
        }

        /**
         * An interface that defines how to map each variant of [UpperBoundTimePoint] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitPublicDate(publicDate: PublicDatePoint): T

            fun visitPublicIndexed(publicIndexed: PublicIndexedTimePoint): T

            fun visitPublicPropertyReferencedTime(
                publicPropertyReferencedTime: PublicPropertyReferencedTime
            ): T

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
                            tryDeserialize(node, jacksonTypeRef<PublicDatePoint>())?.let {
                                UpperBoundTimePoint(publicDate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicIndexedTimePoint>())?.let {
                                UpperBoundTimePoint(publicIndexed = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicPropertyReferencedTime>())
                                ?.let {
                                    UpperBoundTimePoint(
                                        publicPropertyReferencedTime = it,
                                        _json = json,
                                    )
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
                    value.publicDate != null -> generator.writeObject(value.publicDate)
                    value.publicIndexed != null -> generator.writeObject(value.publicIndexed)
                    value.publicPropertyReferencedTime != null ->
                        generator.writeObject(value.publicPropertyReferencedTime)
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

        return other is PublicRangedTimeOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            lowerBoundTimePoint == other.lowerBoundTimePoint &&
            operationType == other.operationType &&
            operator == other.operator &&
            type == other.type &&
            upperBoundTimePoint == other.upperBoundTimePoint &&
            lowerBoundEndpointBehavior == other.lowerBoundEndpointBehavior &&
            propertyParser == other.propertyParser &&
            upperBoundEndpointBehavior == other.upperBoundEndpointBehavior &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            lowerBoundTimePoint,
            operationType,
            operator,
            type,
            upperBoundTimePoint,
            lowerBoundEndpointBehavior,
            propertyParser,
            upperBoundEndpointBehavior,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicRangedTimeOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, lowerBoundTimePoint=$lowerBoundTimePoint, operationType=$operationType, operator=$operator, type=$type, upperBoundTimePoint=$upperBoundTimePoint, lowerBoundEndpointBehavior=$lowerBoundEndpointBehavior, propertyParser=$propertyParser, upperBoundEndpointBehavior=$upperBoundEndpointBehavior, additionalProperties=$additionalProperties}"
}
