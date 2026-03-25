// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ComparativeNumberPropertyOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val comparisonPropertyName: JsonField<String>,
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val operationType: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val operatorName: JsonField<String>,
    private val propertyType: JsonField<PropertyType>,
    private val defaultValue: JsonField<String>,
    private val renderSpec: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("comparisonPropertyName")
        @ExcludeMissing
        comparisonPropertyName: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("renderSpec") @ExcludeMissing renderSpec: JsonField<String> = JsonMissing.of(),
    ) : this(
        comparisonPropertyName,
        includeObjectsWithNoValueSet,
        operationType,
        operator,
        operatorName,
        propertyType,
        defaultValue,
        renderSpec,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun comparisonPropertyName(): String =
        comparisonPropertyName.getRequired("comparisonPropertyName")

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
    fun renderSpec(): Optional<String> = renderSpec.getOptional("renderSpec")

    /**
     * Returns the raw JSON value of [comparisonPropertyName].
     *
     * Unlike [comparisonPropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("comparisonPropertyName")
    @ExcludeMissing
    fun _comparisonPropertyName(): JsonField<String> = comparisonPropertyName

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
         * Returns a mutable builder for constructing an instance of
         * [ComparativeNumberPropertyOperation].
         *
         * The following fields are required:
         * ```java
         * .comparisonPropertyName()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComparativeNumberPropertyOperation]. */
    class Builder internal constructor() {

        private var comparisonPropertyName: JsonField<String>? = null
        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var operationType: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var operatorName: JsonField<String>? = null
        private var propertyType: JsonField<PropertyType>? = null
        private var defaultValue: JsonField<String> = JsonMissing.of()
        private var renderSpec: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(comparativeNumberPropertyOperation: ComparativeNumberPropertyOperation) =
            apply {
                comparisonPropertyName = comparativeNumberPropertyOperation.comparisonPropertyName
                includeObjectsWithNoValueSet =
                    comparativeNumberPropertyOperation.includeObjectsWithNoValueSet
                operationType = comparativeNumberPropertyOperation.operationType
                operator = comparativeNumberPropertyOperation.operator
                operatorName = comparativeNumberPropertyOperation.operatorName
                propertyType = comparativeNumberPropertyOperation.propertyType
                defaultValue = comparativeNumberPropertyOperation.defaultValue
                renderSpec = comparativeNumberPropertyOperation.renderSpec
                additionalProperties =
                    comparativeNumberPropertyOperation.additionalProperties.toMutableMap()
            }

        fun comparisonPropertyName(comparisonPropertyName: String) =
            comparisonPropertyName(JsonField.of(comparisonPropertyName))

        /**
         * Sets [Builder.comparisonPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparisonPropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun comparisonPropertyName(comparisonPropertyName: JsonField<String>) = apply {
            this.comparisonPropertyName = comparisonPropertyName
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
         * Returns an immutable instance of [ComparativeNumberPropertyOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .comparisonPropertyName()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ComparativeNumberPropertyOperation =
            ComparativeNumberPropertyOperation(
                checkRequired("comparisonPropertyName", comparisonPropertyName),
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("operatorName", operatorName),
                checkRequired("propertyType", propertyType),
                defaultValue,
                renderSpec,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ComparativeNumberPropertyOperation = apply {
        if (validated) {
            return@apply
        }

        comparisonPropertyName()
        includeObjectsWithNoValueSet()
        operationType()
        operator().validate()
        operatorName()
        propertyType().validate()
        defaultValue()
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
        (if (comparisonPropertyName.asKnown().isPresent) 1 else 0) +
            (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (if (operationType.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatorName.asKnown().isPresent) 1 else 0) +
            (propertyType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultValue.asKnown().isPresent) 1 else 0) +
            (if (renderSpec.asKnown().isPresent) 1 else 0)

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

            @JvmField val IS_EQUAL_TO = of("IS_EQUAL_TO")

            @JvmField val IS_GREATER_THAN = of("IS_GREATER_THAN")

            @JvmField val IS_GREATER_THAN_OR_EQUAL_TO = of("IS_GREATER_THAN_OR_EQUAL_TO")

            @JvmField val IS_LESS_THAN = of("IS_LESS_THAN")

            @JvmField val IS_LESS_THAN_OR_EQUAL_TO = of("IS_LESS_THAN_OR_EQUAL_TO")

            @JvmField val IS_NOT_EQUAL_TO = of("IS_NOT_EQUAL_TO")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            IS_EQUAL_TO,
            IS_GREATER_THAN,
            IS_GREATER_THAN_OR_EQUAL_TO,
            IS_LESS_THAN,
            IS_LESS_THAN_OR_EQUAL_TO,
            IS_NOT_EQUAL_TO,
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
            IS_EQUAL_TO,
            IS_GREATER_THAN,
            IS_GREATER_THAN_OR_EQUAL_TO,
            IS_LESS_THAN,
            IS_LESS_THAN_OR_EQUAL_TO,
            IS_NOT_EQUAL_TO,
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
                IS_EQUAL_TO -> Value.IS_EQUAL_TO
                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                IS_GREATER_THAN_OR_EQUAL_TO -> Value.IS_GREATER_THAN_OR_EQUAL_TO
                IS_LESS_THAN -> Value.IS_LESS_THAN
                IS_LESS_THAN_OR_EQUAL_TO -> Value.IS_LESS_THAN_OR_EQUAL_TO
                IS_NOT_EQUAL_TO -> Value.IS_NOT_EQUAL_TO
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
                IS_EQUAL_TO -> Known.IS_EQUAL_TO
                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                IS_GREATER_THAN_OR_EQUAL_TO -> Known.IS_GREATER_THAN_OR_EQUAL_TO
                IS_LESS_THAN -> Known.IS_LESS_THAN
                IS_LESS_THAN_OR_EQUAL_TO -> Known.IS_LESS_THAN_OR_EQUAL_TO
                IS_NOT_EQUAL_TO -> Known.IS_NOT_EQUAL_TO
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

            @JvmField val NUMBER_COMPARATIVE = of("number-comparative")

            @JvmStatic fun of(value: String) = PropertyType(JsonField.of(value))
        }

        /** An enum containing [PropertyType]'s known values. */
        enum class Known {
            NUMBER_COMPARATIVE
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
            NUMBER_COMPARATIVE,
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
                NUMBER_COMPARATIVE -> Value.NUMBER_COMPARATIVE
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
                NUMBER_COMPARATIVE -> Known.NUMBER_COMPARATIVE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComparativeNumberPropertyOperation &&
            comparisonPropertyName == other.comparisonPropertyName &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            operationType == other.operationType &&
            operator == other.operator &&
            operatorName == other.operatorName &&
            propertyType == other.propertyType &&
            defaultValue == other.defaultValue &&
            renderSpec == other.renderSpec &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            comparisonPropertyName,
            includeObjectsWithNoValueSet,
            operationType,
            operator,
            operatorName,
            propertyType,
            defaultValue,
            renderSpec,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ComparativeNumberPropertyOperation{comparisonPropertyName=$comparisonPropertyName, includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, operationType=$operationType, operator=$operator, operatorName=$operatorName, propertyType=$propertyType, defaultValue=$defaultValue, renderSpec=$renderSpec, additionalProperties=$additionalProperties}"
}
