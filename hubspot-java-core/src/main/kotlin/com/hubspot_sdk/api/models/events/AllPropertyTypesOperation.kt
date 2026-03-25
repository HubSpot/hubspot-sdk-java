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

class AllPropertyTypesOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val coalescingRefineBy: JsonField<CoalescingRefineBy>,
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val operationType: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val operatorName: JsonField<String>,
    private val propertyType: JsonField<PropertyType>,
    private val defaultValue: JsonField<String>,
    private val pruningRefineBy: JsonField<PruningRefineBy>,
    private val renderSpec: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("coalescingRefineBy")
        @ExcludeMissing
        coalescingRefineBy: JsonField<CoalescingRefineBy> = JsonMissing.of(),
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
        @JsonProperty("propertyType")
        @ExcludeMissing
        propertyType: JsonField<PropertyType> = JsonMissing.of(),
        @JsonProperty("defaultValue")
        @ExcludeMissing
        defaultValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pruningRefineBy")
        @ExcludeMissing
        pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of(),
        @JsonProperty("renderSpec") @ExcludeMissing renderSpec: JsonField<String> = JsonMissing.of(),
    ) : this(
        coalescingRefineBy,
        includeObjectsWithNoValueSet,
        operationType,
        operator,
        operatorName,
        propertyType,
        defaultValue,
        pruningRefineBy,
        renderSpec,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun coalescingRefineBy(): CoalescingRefineBy =
        coalescingRefineBy.getRequired("coalescingRefineBy")

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
    fun operationType(): String = operationType.getRequired("operationType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operatorName(): String = operatorName.getRequired("operatorName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun propertyType(): PropertyType = propertyType.getRequired("propertyType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultValue(): Optional<String> = defaultValue.getOptional("defaultValue")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pruningRefineBy(): Optional<PruningRefineBy> =
        pruningRefineBy.getOptional("pruningRefineBy")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun renderSpec(): Optional<String> = renderSpec.getOptional("renderSpec")

    /**
     * Returns the raw JSON value of [coalescingRefineBy].
     *
     * Unlike [coalescingRefineBy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("coalescingRefineBy")
    @ExcludeMissing
    fun _coalescingRefineBy(): JsonField<CoalescingRefineBy> = coalescingRefineBy

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
     * Returns the raw JSON value of [propertyType].
     *
     * Unlike [propertyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propertyType")
    @ExcludeMissing
    fun _propertyType(): JsonField<PropertyType> = propertyType

    /**
     * Returns the raw JSON value of [defaultValue].
     *
     * Unlike [defaultValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultValue")
    @ExcludeMissing
    fun _defaultValue(): JsonField<String> = defaultValue

    /**
     * Returns the raw JSON value of [pruningRefineBy].
     *
     * Unlike [pruningRefineBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pruningRefineBy")
    @ExcludeMissing
    fun _pruningRefineBy(): JsonField<PruningRefineBy> = pruningRefineBy

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
         * Returns a mutable builder for constructing an instance of [AllPropertyTypesOperation].
         *
         * The following fields are required:
         * ```java
         * .coalescingRefineBy()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AllPropertyTypesOperation]. */
    class Builder internal constructor() {

        private var coalescingRefineBy: JsonField<CoalescingRefineBy>? = null
        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var operationType: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var operatorName: JsonField<String>? = null
        private var propertyType: JsonField<PropertyType>? = null
        private var defaultValue: JsonField<String> = JsonMissing.of()
        private var pruningRefineBy: JsonField<PruningRefineBy> = JsonMissing.of()
        private var renderSpec: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(allPropertyTypesOperation: AllPropertyTypesOperation) = apply {
            coalescingRefineBy = allPropertyTypesOperation.coalescingRefineBy
            includeObjectsWithNoValueSet = allPropertyTypesOperation.includeObjectsWithNoValueSet
            operationType = allPropertyTypesOperation.operationType
            operator = allPropertyTypesOperation.operator
            operatorName = allPropertyTypesOperation.operatorName
            propertyType = allPropertyTypesOperation.propertyType
            defaultValue = allPropertyTypesOperation.defaultValue
            pruningRefineBy = allPropertyTypesOperation.pruningRefineBy
            renderSpec = allPropertyTypesOperation.renderSpec
            additionalProperties = allPropertyTypesOperation.additionalProperties.toMutableMap()
        }

        fun coalescingRefineBy(coalescingRefineBy: CoalescingRefineBy) =
            coalescingRefineBy(JsonField.of(coalescingRefineBy))

        /**
         * Sets [Builder.coalescingRefineBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coalescingRefineBy] with a well-typed
         * [CoalescingRefineBy] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun coalescingRefineBy(coalescingRefineBy: JsonField<CoalescingRefineBy>) = apply {
            this.coalescingRefineBy = coalescingRefineBy
        }

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofNumOccurrences(numOccurrences)`.
         */
        fun coalescingRefineBy(numOccurrences: NumOccurrencesRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofNumOccurrences(numOccurrences))

        /**
         * Alias for calling [coalescingRefineBy] with
         * `CoalescingRefineBy.ofSetOccurrences(setOccurrences)`.
         */
        fun coalescingRefineBy(setOccurrences: SetOccurrencesRefineBy) =
            coalescingRefineBy(CoalescingRefineBy.ofSetOccurrences(setOccurrences))

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

        fun pruningRefineBy(pruningRefineBy: PruningRefineBy) =
            pruningRefineBy(JsonField.of(pruningRefineBy))

        /**
         * Sets [Builder.pruningRefineBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pruningRefineBy] with a well-typed [PruningRefineBy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pruningRefineBy(pruningRefineBy: JsonField<PruningRefineBy>) = apply {
            this.pruningRefineBy = pruningRefineBy
        }

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofRelativeComparativeTimestamp(relativeComparativeTimestamp)`.
         */
        fun pruningRefineBy(relativeComparativeTimestamp: RelativeComparativeTimestampRefineBy) =
            pruningRefineBy(
                PruningRefineBy.ofRelativeComparativeTimestamp(relativeComparativeTimestamp)
            )

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofRelativeRangedTimestamp(relativeRangedTimestamp)`.
         */
        fun pruningRefineBy(relativeRangedTimestamp: RelativeRangedTimestampRefineBy) =
            pruningRefineBy(PruningRefineBy.ofRelativeRangedTimestamp(relativeRangedTimestamp))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofAbsoluteComparativeTimestamp(absoluteComparativeTimestamp)`.
         */
        fun pruningRefineBy(absoluteComparativeTimestamp: AbsoluteComparativeTimestampRefineBy) =
            pruningRefineBy(
                PruningRefineBy.ofAbsoluteComparativeTimestamp(absoluteComparativeTimestamp)
            )

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofAbsoluteRangedTimestamp(absoluteRangedTimestamp)`.
         */
        fun pruningRefineBy(absoluteRangedTimestamp: AbsoluteRangedTimestampRefineBy) =
            pruningRefineBy(PruningRefineBy.ofAbsoluteRangedTimestamp(absoluteRangedTimestamp))

        /** Alias for calling [pruningRefineBy] with `PruningRefineBy.ofAllHistory(allHistory)`. */
        fun pruningRefineBy(allHistory: AllHistoryRefineBy) =
            pruningRefineBy(PruningRefineBy.ofAllHistory(allHistory))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofTimePointOperation(timePointOperation)`.
         */
        fun pruningRefineBy(timePointOperation: TimePointOperation) =
            pruningRefineBy(PruningRefineBy.ofTimePointOperation(timePointOperation))

        /**
         * Alias for calling [pruningRefineBy] with
         * `PruningRefineBy.ofRangedTimeOperation(rangedTimeOperation)`.
         */
        fun pruningRefineBy(rangedTimeOperation: RangedTimeOperation) =
            pruningRefineBy(PruningRefineBy.ofRangedTimeOperation(rangedTimeOperation))

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
         * Returns an immutable instance of [AllPropertyTypesOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .coalescingRefineBy()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AllPropertyTypesOperation =
            AllPropertyTypesOperation(
                checkRequired("coalescingRefineBy", coalescingRefineBy),
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("operatorName", operatorName),
                checkRequired("propertyType", propertyType),
                defaultValue,
                pruningRefineBy,
                renderSpec,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AllPropertyTypesOperation = apply {
        if (validated) {
            return@apply
        }

        coalescingRefineBy().validate()
        includeObjectsWithNoValueSet()
        operationType()
        operator().validate()
        operatorName()
        propertyType().validate()
        defaultValue()
        pruningRefineBy().ifPresent { it.validate() }
        renderSpec()
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
        (coalescingRefineBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (if (operationType.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatorName.asKnown().isPresent) 1 else 0) +
            (propertyType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultValue.asKnown().isPresent) 1 else 0) +
            (pruningRefineBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (renderSpec.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = CoalescingRefineBy.Deserializer::class)
    @JsonSerialize(using = CoalescingRefineBy.Serializer::class)
    class CoalescingRefineBy
    private constructor(
        private val numOccurrences: NumOccurrencesRefineBy? = null,
        private val setOccurrences: SetOccurrencesRefineBy? = null,
        private val _json: JsonValue? = null,
    ) {

        fun numOccurrences(): Optional<NumOccurrencesRefineBy> = Optional.ofNullable(numOccurrences)

        fun setOccurrences(): Optional<SetOccurrencesRefineBy> = Optional.ofNullable(setOccurrences)

        fun isNumOccurrences(): Boolean = numOccurrences != null

        fun isSetOccurrences(): Boolean = setOccurrences != null

        fun asNumOccurrences(): NumOccurrencesRefineBy = numOccurrences.getOrThrow("numOccurrences")

        fun asSetOccurrences(): SetOccurrencesRefineBy = setOccurrences.getOrThrow("setOccurrences")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                numOccurrences != null -> visitor.visitNumOccurrences(numOccurrences)
                setOccurrences != null -> visitor.visitSetOccurrences(setOccurrences)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CoalescingRefineBy = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumOccurrences(numOccurrences: NumOccurrencesRefineBy) {
                        numOccurrences.validate()
                    }

                    override fun visitSetOccurrences(setOccurrences: SetOccurrencesRefineBy) {
                        setOccurrences.validate()
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
                    override fun visitNumOccurrences(numOccurrences: NumOccurrencesRefineBy) =
                        numOccurrences.validity()

                    override fun visitSetOccurrences(setOccurrences: SetOccurrencesRefineBy) =
                        setOccurrences.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CoalescingRefineBy &&
                numOccurrences == other.numOccurrences &&
                setOccurrences == other.setOccurrences
        }

        override fun hashCode(): Int = Objects.hash(numOccurrences, setOccurrences)

        override fun toString(): String =
            when {
                numOccurrences != null -> "CoalescingRefineBy{numOccurrences=$numOccurrences}"
                setOccurrences != null -> "CoalescingRefineBy{setOccurrences=$setOccurrences}"
                _json != null -> "CoalescingRefineBy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CoalescingRefineBy")
            }

        companion object {

            @JvmStatic
            fun ofNumOccurrences(numOccurrences: NumOccurrencesRefineBy) =
                CoalescingRefineBy(numOccurrences = numOccurrences)

            @JvmStatic
            fun ofSetOccurrences(setOccurrences: SetOccurrencesRefineBy) =
                CoalescingRefineBy(setOccurrences = setOccurrences)
        }

        /**
         * An interface that defines how to map each variant of [CoalescingRefineBy] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitNumOccurrences(numOccurrences: NumOccurrencesRefineBy): T

            fun visitSetOccurrences(setOccurrences: SetOccurrencesRefineBy): T

            /**
             * Maps an unknown variant of [CoalescingRefineBy] to a value of type [T].
             *
             * An instance of [CoalescingRefineBy] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown CoalescingRefineBy: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<CoalescingRefineBy>(CoalescingRefineBy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CoalescingRefineBy {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<NumOccurrencesRefineBy>())?.let {
                                CoalescingRefineBy(numOccurrences = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SetOccurrencesRefineBy>())?.let {
                                CoalescingRefineBy(setOccurrences = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CoalescingRefineBy(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CoalescingRefineBy>(CoalescingRefineBy::class) {

            override fun serialize(
                value: CoalescingRefineBy,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.numOccurrences != null -> generator.writeObject(value.numOccurrences)
                    value.setOccurrences != null -> generator.writeObject(value.setOccurrences)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CoalescingRefineBy")
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

            @JvmField val IS_BLANK = of("IS_BLANK")

            @JvmField val IS_KNOWN = of("IS_KNOWN")

            @JvmField val IS_NOT_BLANK = of("IS_NOT_BLANK")

            @JvmField val IS_UNKNOWN = of("IS_UNKNOWN")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IS_BLANK,
            IS_KNOWN,
            IS_NOT_BLANK,
            IS_UNKNOWN,
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
            IS_BLANK,
            IS_KNOWN,
            IS_NOT_BLANK,
            IS_UNKNOWN,
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
                IS_BLANK -> Value.IS_BLANK
                IS_KNOWN -> Value.IS_KNOWN
                IS_NOT_BLANK -> Value.IS_NOT_BLANK
                IS_UNKNOWN -> Value.IS_UNKNOWN
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
                IS_BLANK -> Known.IS_BLANK
                IS_KNOWN -> Known.IS_KNOWN
                IS_NOT_BLANK -> Known.IS_NOT_BLANK
                IS_UNKNOWN -> Known.IS_UNKNOWN
                else -> throw HubspotInvalidDataException("Unknown Operator: $value")
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

            return other is Operator && value == other.value
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

            @JvmField val ALLTYPES = of("alltypes")

            @JvmStatic fun of(value: String) = PropertyType(JsonField.of(value))
        }

        /** An enum containing [PropertyType]'s known values. */
        enum class Known {
            ALLTYPES
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
            ALLTYPES,
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
                ALLTYPES -> Value.ALLTYPES
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
                ALLTYPES -> Known.ALLTYPES
                else -> throw HubspotInvalidDataException("Unknown PropertyType: $value")
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

            return other is PropertyType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = PruningRefineBy.Deserializer::class)
    @JsonSerialize(using = PruningRefineBy.Serializer::class)
    class PruningRefineBy
    private constructor(
        private val relativeComparativeTimestamp: RelativeComparativeTimestampRefineBy? = null,
        private val relativeRangedTimestamp: RelativeRangedTimestampRefineBy? = null,
        private val absoluteComparativeTimestamp: AbsoluteComparativeTimestampRefineBy? = null,
        private val absoluteRangedTimestamp: AbsoluteRangedTimestampRefineBy? = null,
        private val allHistory: AllHistoryRefineBy? = null,
        private val timePointOperation: TimePointOperation? = null,
        private val rangedTimeOperation: RangedTimeOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun relativeComparativeTimestamp(): Optional<RelativeComparativeTimestampRefineBy> =
            Optional.ofNullable(relativeComparativeTimestamp)

        fun relativeRangedTimestamp(): Optional<RelativeRangedTimestampRefineBy> =
            Optional.ofNullable(relativeRangedTimestamp)

        fun absoluteComparativeTimestamp(): Optional<AbsoluteComparativeTimestampRefineBy> =
            Optional.ofNullable(absoluteComparativeTimestamp)

        fun absoluteRangedTimestamp(): Optional<AbsoluteRangedTimestampRefineBy> =
            Optional.ofNullable(absoluteRangedTimestamp)

        fun allHistory(): Optional<AllHistoryRefineBy> = Optional.ofNullable(allHistory)

        fun timePointOperation(): Optional<TimePointOperation> =
            Optional.ofNullable(timePointOperation)

        fun rangedTimeOperation(): Optional<RangedTimeOperation> =
            Optional.ofNullable(rangedTimeOperation)

        fun isRelativeComparativeTimestamp(): Boolean = relativeComparativeTimestamp != null

        fun isRelativeRangedTimestamp(): Boolean = relativeRangedTimestamp != null

        fun isAbsoluteComparativeTimestamp(): Boolean = absoluteComparativeTimestamp != null

        fun isAbsoluteRangedTimestamp(): Boolean = absoluteRangedTimestamp != null

        fun isAllHistory(): Boolean = allHistory != null

        fun isTimePointOperation(): Boolean = timePointOperation != null

        fun isRangedTimeOperation(): Boolean = rangedTimeOperation != null

        fun asRelativeComparativeTimestamp(): RelativeComparativeTimestampRefineBy =
            relativeComparativeTimestamp.getOrThrow("relativeComparativeTimestamp")

        fun asRelativeRangedTimestamp(): RelativeRangedTimestampRefineBy =
            relativeRangedTimestamp.getOrThrow("relativeRangedTimestamp")

        fun asAbsoluteComparativeTimestamp(): AbsoluteComparativeTimestampRefineBy =
            absoluteComparativeTimestamp.getOrThrow("absoluteComparativeTimestamp")

        fun asAbsoluteRangedTimestamp(): AbsoluteRangedTimestampRefineBy =
            absoluteRangedTimestamp.getOrThrow("absoluteRangedTimestamp")

        fun asAllHistory(): AllHistoryRefineBy = allHistory.getOrThrow("allHistory")

        fun asTimePointOperation(): TimePointOperation =
            timePointOperation.getOrThrow("timePointOperation")

        fun asRangedTimeOperation(): RangedTimeOperation =
            rangedTimeOperation.getOrThrow("rangedTimeOperation")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                relativeComparativeTimestamp != null ->
                    visitor.visitRelativeComparativeTimestamp(relativeComparativeTimestamp)
                relativeRangedTimestamp != null ->
                    visitor.visitRelativeRangedTimestamp(relativeRangedTimestamp)
                absoluteComparativeTimestamp != null ->
                    visitor.visitAbsoluteComparativeTimestamp(absoluteComparativeTimestamp)
                absoluteRangedTimestamp != null ->
                    visitor.visitAbsoluteRangedTimestamp(absoluteRangedTimestamp)
                allHistory != null -> visitor.visitAllHistory(allHistory)
                timePointOperation != null -> visitor.visitTimePointOperation(timePointOperation)
                rangedTimeOperation != null -> visitor.visitRangedTimeOperation(rangedTimeOperation)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): PruningRefineBy = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitRelativeComparativeTimestamp(
                        relativeComparativeTimestamp: RelativeComparativeTimestampRefineBy
                    ) {
                        relativeComparativeTimestamp.validate()
                    }

                    override fun visitRelativeRangedTimestamp(
                        relativeRangedTimestamp: RelativeRangedTimestampRefineBy
                    ) {
                        relativeRangedTimestamp.validate()
                    }

                    override fun visitAbsoluteComparativeTimestamp(
                        absoluteComparativeTimestamp: AbsoluteComparativeTimestampRefineBy
                    ) {
                        absoluteComparativeTimestamp.validate()
                    }

                    override fun visitAbsoluteRangedTimestamp(
                        absoluteRangedTimestamp: AbsoluteRangedTimestampRefineBy
                    ) {
                        absoluteRangedTimestamp.validate()
                    }

                    override fun visitAllHistory(allHistory: AllHistoryRefineBy) {
                        allHistory.validate()
                    }

                    override fun visitTimePointOperation(timePointOperation: TimePointOperation) {
                        timePointOperation.validate()
                    }

                    override fun visitRangedTimeOperation(
                        rangedTimeOperation: RangedTimeOperation
                    ) {
                        rangedTimeOperation.validate()
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
                    override fun visitRelativeComparativeTimestamp(
                        relativeComparativeTimestamp: RelativeComparativeTimestampRefineBy
                    ) = relativeComparativeTimestamp.validity()

                    override fun visitRelativeRangedTimestamp(
                        relativeRangedTimestamp: RelativeRangedTimestampRefineBy
                    ) = relativeRangedTimestamp.validity()

                    override fun visitAbsoluteComparativeTimestamp(
                        absoluteComparativeTimestamp: AbsoluteComparativeTimestampRefineBy
                    ) = absoluteComparativeTimestamp.validity()

                    override fun visitAbsoluteRangedTimestamp(
                        absoluteRangedTimestamp: AbsoluteRangedTimestampRefineBy
                    ) = absoluteRangedTimestamp.validity()

                    override fun visitAllHistory(allHistory: AllHistoryRefineBy) =
                        allHistory.validity()

                    override fun visitTimePointOperation(timePointOperation: TimePointOperation) =
                        timePointOperation.validity()

                    override fun visitRangedTimeOperation(
                        rangedTimeOperation: RangedTimeOperation
                    ) = rangedTimeOperation.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PruningRefineBy &&
                relativeComparativeTimestamp == other.relativeComparativeTimestamp &&
                relativeRangedTimestamp == other.relativeRangedTimestamp &&
                absoluteComparativeTimestamp == other.absoluteComparativeTimestamp &&
                absoluteRangedTimestamp == other.absoluteRangedTimestamp &&
                allHistory == other.allHistory &&
                timePointOperation == other.timePointOperation &&
                rangedTimeOperation == other.rangedTimeOperation
        }

        override fun hashCode(): Int =
            Objects.hash(
                relativeComparativeTimestamp,
                relativeRangedTimestamp,
                absoluteComparativeTimestamp,
                absoluteRangedTimestamp,
                allHistory,
                timePointOperation,
                rangedTimeOperation,
            )

        override fun toString(): String =
            when {
                relativeComparativeTimestamp != null ->
                    "PruningRefineBy{relativeComparativeTimestamp=$relativeComparativeTimestamp}"
                relativeRangedTimestamp != null ->
                    "PruningRefineBy{relativeRangedTimestamp=$relativeRangedTimestamp}"
                absoluteComparativeTimestamp != null ->
                    "PruningRefineBy{absoluteComparativeTimestamp=$absoluteComparativeTimestamp}"
                absoluteRangedTimestamp != null ->
                    "PruningRefineBy{absoluteRangedTimestamp=$absoluteRangedTimestamp}"
                allHistory != null -> "PruningRefineBy{allHistory=$allHistory}"
                timePointOperation != null ->
                    "PruningRefineBy{timePointOperation=$timePointOperation}"
                rangedTimeOperation != null ->
                    "PruningRefineBy{rangedTimeOperation=$rangedTimeOperation}"
                _json != null -> "PruningRefineBy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PruningRefineBy")
            }

        companion object {

            @JvmStatic
            fun ofRelativeComparativeTimestamp(
                relativeComparativeTimestamp: RelativeComparativeTimestampRefineBy
            ) = PruningRefineBy(relativeComparativeTimestamp = relativeComparativeTimestamp)

            @JvmStatic
            fun ofRelativeRangedTimestamp(
                relativeRangedTimestamp: RelativeRangedTimestampRefineBy
            ) = PruningRefineBy(relativeRangedTimestamp = relativeRangedTimestamp)

            @JvmStatic
            fun ofAbsoluteComparativeTimestamp(
                absoluteComparativeTimestamp: AbsoluteComparativeTimestampRefineBy
            ) = PruningRefineBy(absoluteComparativeTimestamp = absoluteComparativeTimestamp)

            @JvmStatic
            fun ofAbsoluteRangedTimestamp(
                absoluteRangedTimestamp: AbsoluteRangedTimestampRefineBy
            ) = PruningRefineBy(absoluteRangedTimestamp = absoluteRangedTimestamp)

            @JvmStatic
            fun ofAllHistory(allHistory: AllHistoryRefineBy) =
                PruningRefineBy(allHistory = allHistory)

            @JvmStatic
            fun ofTimePointOperation(timePointOperation: TimePointOperation) =
                PruningRefineBy(timePointOperation = timePointOperation)

            @JvmStatic
            fun ofRangedTimeOperation(rangedTimeOperation: RangedTimeOperation) =
                PruningRefineBy(rangedTimeOperation = rangedTimeOperation)
        }

        /**
         * An interface that defines how to map each variant of [PruningRefineBy] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitRelativeComparativeTimestamp(
                relativeComparativeTimestamp: RelativeComparativeTimestampRefineBy
            ): T

            fun visitRelativeRangedTimestamp(
                relativeRangedTimestamp: RelativeRangedTimestampRefineBy
            ): T

            fun visitAbsoluteComparativeTimestamp(
                absoluteComparativeTimestamp: AbsoluteComparativeTimestampRefineBy
            ): T

            fun visitAbsoluteRangedTimestamp(
                absoluteRangedTimestamp: AbsoluteRangedTimestampRefineBy
            ): T

            fun visitAllHistory(allHistory: AllHistoryRefineBy): T

            fun visitTimePointOperation(timePointOperation: TimePointOperation): T

            fun visitRangedTimeOperation(rangedTimeOperation: RangedTimeOperation): T

            /**
             * Maps an unknown variant of [PruningRefineBy] to a value of type [T].
             *
             * An instance of [PruningRefineBy] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown PruningRefineBy: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<PruningRefineBy>(PruningRefineBy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PruningRefineBy {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<RelativeComparativeTimestampRefineBy>(),
                                )
                                ?.let {
                                    PruningRefineBy(relativeComparativeTimestamp = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<RelativeRangedTimestampRefineBy>())
                                ?.let {
                                    PruningRefineBy(relativeRangedTimestamp = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<AbsoluteComparativeTimestampRefineBy>(),
                                )
                                ?.let {
                                    PruningRefineBy(absoluteComparativeTimestamp = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<AbsoluteRangedTimestampRefineBy>())
                                ?.let {
                                    PruningRefineBy(absoluteRangedTimestamp = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<AllHistoryRefineBy>())?.let {
                                PruningRefineBy(allHistory = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TimePointOperation>())?.let {
                                PruningRefineBy(timePointOperation = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RangedTimeOperation>())?.let {
                                PruningRefineBy(rangedTimeOperation = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> PruningRefineBy(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<PruningRefineBy>(PruningRefineBy::class) {

            override fun serialize(
                value: PruningRefineBy,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.relativeComparativeTimestamp != null ->
                        generator.writeObject(value.relativeComparativeTimestamp)
                    value.relativeRangedTimestamp != null ->
                        generator.writeObject(value.relativeRangedTimestamp)
                    value.absoluteComparativeTimestamp != null ->
                        generator.writeObject(value.absoluteComparativeTimestamp)
                    value.absoluteRangedTimestamp != null ->
                        generator.writeObject(value.absoluteRangedTimestamp)
                    value.allHistory != null -> generator.writeObject(value.allHistory)
                    value.timePointOperation != null ->
                        generator.writeObject(value.timePointOperation)
                    value.rangedTimeOperation != null ->
                        generator.writeObject(value.rangedTimeOperation)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PruningRefineBy")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AllPropertyTypesOperation &&
            coalescingRefineBy == other.coalescingRefineBy &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            operationType == other.operationType &&
            operator == other.operator &&
            operatorName == other.operatorName &&
            propertyType == other.propertyType &&
            defaultValue == other.defaultValue &&
            pruningRefineBy == other.pruningRefineBy &&
            renderSpec == other.renderSpec &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            coalescingRefineBy,
            includeObjectsWithNoValueSet,
            operationType,
            operator,
            operatorName,
            propertyType,
            defaultValue,
            pruningRefineBy,
            renderSpec,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AllPropertyTypesOperation{coalescingRefineBy=$coalescingRefineBy, includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, operationType=$operationType, operator=$operator, operatorName=$operatorName, propertyType=$propertyType, defaultValue=$defaultValue, pruningRefineBy=$pruningRefineBy, renderSpec=$renderSpec, additionalProperties=$additionalProperties}"
}
