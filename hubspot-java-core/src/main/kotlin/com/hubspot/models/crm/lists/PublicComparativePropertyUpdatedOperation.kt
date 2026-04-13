// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicComparativePropertyUpdatedOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val comparisonPropertyName: JsonField<String>,
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val operationType: JsonField<OperationType>,
    private val operator: JsonField<String>,
    private val defaultComparisonValue: JsonField<String>,
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
        operationType: JsonField<OperationType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultComparisonValue")
        @ExcludeMissing
        defaultComparisonValue: JsonField<String> = JsonMissing.of(),
    ) : this(
        comparisonPropertyName,
        includeObjectsWithNoValueSet,
        operationType,
        operator,
        defaultComparisonValue,
        mutableMapOf(),
    )

    /**
     * The name of the property to compare against in the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun comparisonPropertyName(): String =
        comparisonPropertyName.getRequired("comparisonPropertyName")

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
     * Specifies the type of operation (COMPARATIVE_PROPERTY_UPDATED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): OperationType = operationType.getRequired("operationType")

    /**
     * Defines the operation to be applied, such as comparison operators (IS_BEFORE, IS_AFTER).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * The default value used for comparison if the actual comparison property value is not set.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultComparisonValue(): Optional<String> =
        defaultComparisonValue.getOptional("defaultComparisonValue")

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
    fun _operationType(): JsonField<OperationType> = operationType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [defaultComparisonValue].
     *
     * Unlike [defaultComparisonValue], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("defaultComparisonValue")
    @ExcludeMissing
    fun _defaultComparisonValue(): JsonField<String> = defaultComparisonValue

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
         * [PublicComparativePropertyUpdatedOperation].
         *
         * The following fields are required:
         * ```java
         * .comparisonPropertyName()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicComparativePropertyUpdatedOperation]. */
    class Builder internal constructor() {

        private var comparisonPropertyName: JsonField<String>? = null
        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var operationType: JsonField<OperationType>? = null
        private var operator: JsonField<String>? = null
        private var defaultComparisonValue: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicComparativePropertyUpdatedOperation: PublicComparativePropertyUpdatedOperation
        ) = apply {
            comparisonPropertyName =
                publicComparativePropertyUpdatedOperation.comparisonPropertyName
            includeObjectsWithNoValueSet =
                publicComparativePropertyUpdatedOperation.includeObjectsWithNoValueSet
            operationType = publicComparativePropertyUpdatedOperation.operationType
            operator = publicComparativePropertyUpdatedOperation.operator
            defaultComparisonValue =
                publicComparativePropertyUpdatedOperation.defaultComparisonValue
            additionalProperties =
                publicComparativePropertyUpdatedOperation.additionalProperties.toMutableMap()
        }

        /** The name of the property to compare against in the operation. */
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

        /** Specifies the type of operation (COMPARATIVE_PROPERTY_UPDATED). */
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
         * Defines the operation to be applied, such as comparison operators (IS_BEFORE, IS_AFTER).
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
         * The default value used for comparison if the actual comparison property value is not set.
         */
        fun defaultComparisonValue(defaultComparisonValue: String) =
            defaultComparisonValue(JsonField.of(defaultComparisonValue))

        /**
         * Sets [Builder.defaultComparisonValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultComparisonValue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultComparisonValue(defaultComparisonValue: JsonField<String>) = apply {
            this.defaultComparisonValue = defaultComparisonValue
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
         * Returns an immutable instance of [PublicComparativePropertyUpdatedOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .comparisonPropertyName()
         * .includeObjectsWithNoValueSet()
         * .operationType()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicComparativePropertyUpdatedOperation =
            PublicComparativePropertyUpdatedOperation(
                checkRequired("comparisonPropertyName", comparisonPropertyName),
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                defaultComparisonValue,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicComparativePropertyUpdatedOperation = apply {
        if (validated) {
            return@apply
        }

        comparisonPropertyName()
        includeObjectsWithNoValueSet()
        operationType().validate()
        operator()
        defaultComparisonValue()
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
        (if (comparisonPropertyName.asKnown().isPresent) 1 else 0) +
            (if (includeObjectsWithNoValueSet.asKnown().isPresent) 1 else 0) +
            (operationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (defaultComparisonValue.asKnown().isPresent) 1 else 0)

    /** Specifies the type of operation (COMPARATIVE_PROPERTY_UPDATED). */
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

            @JvmField val COMPARATIVE_PROPERTY_UPDATED = of("COMPARATIVE_PROPERTY_UPDATED")

            @JvmStatic fun of(value: String) = OperationType(JsonField.of(value))
        }

        /** An enum containing [OperationType]'s known values. */
        enum class Known {
            COMPARATIVE_PROPERTY_UPDATED
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
            COMPARATIVE_PROPERTY_UPDATED,
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
                COMPARATIVE_PROPERTY_UPDATED -> Value.COMPARATIVE_PROPERTY_UPDATED
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
                COMPARATIVE_PROPERTY_UPDATED -> Known.COMPARATIVE_PROPERTY_UPDATED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicComparativePropertyUpdatedOperation &&
            comparisonPropertyName == other.comparisonPropertyName &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            operationType == other.operationType &&
            operator == other.operator &&
            defaultComparisonValue == other.defaultComparisonValue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            comparisonPropertyName,
            includeObjectsWithNoValueSet,
            operationType,
            operator,
            defaultComparisonValue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicComparativePropertyUpdatedOperation{comparisonPropertyName=$comparisonPropertyName, includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, operationType=$operationType, operator=$operator, defaultComparisonValue=$defaultComparisonValue, additionalProperties=$additionalProperties}"
}
