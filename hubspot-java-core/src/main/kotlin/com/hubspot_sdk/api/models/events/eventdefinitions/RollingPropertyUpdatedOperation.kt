// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

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

class RollingPropertyUpdatedOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val numberOfDays: JsonField<Int>,
    private val operationType: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val operatorName: JsonField<String>,
    private val propertyType: JsonField<PropertyType>,
    private val defaultValue: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("numberOfDays")
        @ExcludeMissing
        numberOfDays: JsonField<Int> = JsonMissing.of(),
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
    ) : this(
        includeObjectsWithNoValueSet,
        numberOfDays,
        operationType,
        operator,
        operatorName,
        propertyType,
        defaultValue,
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
    fun numberOfDays(): Int = numberOfDays.getRequired("numberOfDays")

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
     * Returns the raw JSON value of [includeObjectsWithNoValueSet].
     *
     * Unlike [includeObjectsWithNoValueSet], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("includeObjectsWithNoValueSet")
    @ExcludeMissing
    fun _includeObjectsWithNoValueSet(): JsonField<Boolean> = includeObjectsWithNoValueSet

    /**
     * Returns the raw JSON value of [numberOfDays].
     *
     * Unlike [numberOfDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numberOfDays") @ExcludeMissing fun _numberOfDays(): JsonField<Int> = numberOfDays

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
         * [RollingPropertyUpdatedOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .numberOfDays()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RollingPropertyUpdatedOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var numberOfDays: JsonField<Int>? = null
        private var operationType: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var operatorName: JsonField<String>? = null
        private var propertyType: JsonField<PropertyType>? = null
        private var defaultValue: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rollingPropertyUpdatedOperation: RollingPropertyUpdatedOperation) =
            apply {
                includeObjectsWithNoValueSet =
                    rollingPropertyUpdatedOperation.includeObjectsWithNoValueSet
                numberOfDays = rollingPropertyUpdatedOperation.numberOfDays
                operationType = rollingPropertyUpdatedOperation.operationType
                operator = rollingPropertyUpdatedOperation.operator
                operatorName = rollingPropertyUpdatedOperation.operatorName
                propertyType = rollingPropertyUpdatedOperation.propertyType
                defaultValue = rollingPropertyUpdatedOperation.defaultValue
                additionalProperties =
                    rollingPropertyUpdatedOperation.additionalProperties.toMutableMap()
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

        fun numberOfDays(numberOfDays: Int) = numberOfDays(JsonField.of(numberOfDays))

        /**
         * Sets [Builder.numberOfDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfDays] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numberOfDays(numberOfDays: JsonField<Int>) = apply { this.numberOfDays = numberOfDays }

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
         * Returns an immutable instance of [RollingPropertyUpdatedOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .numberOfDays()
         * .operationType()
         * .operator()
         * .operatorName()
         * .propertyType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RollingPropertyUpdatedOperation =
            RollingPropertyUpdatedOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("numberOfDays", numberOfDays),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("operatorName", operatorName),
                checkRequired("propertyType", propertyType),
                defaultValue,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RollingPropertyUpdatedOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        numberOfDays()
        operationType()
        operator().validate()
        operatorName()
        propertyType().validate()
        defaultValue()
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
            (if (numberOfDays.asKnown().isPresent) 1 else 0) +
            (if (operationType.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operatorName.asKnown().isPresent) 1 else 0) +
            (propertyType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultValue.asKnown().isPresent) 1 else 0)

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

            @JvmField val UPDATED_IN_LAST_X_DAYS = of("UPDATED_IN_LAST_X_DAYS")

            @JvmField val NOT_UPDATED_IN_LAST_X_DAYS = of("NOT_UPDATED_IN_LAST_X_DAYS")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            UPDATED_IN_LAST_X_DAYS,
            NOT_UPDATED_IN_LAST_X_DAYS,
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
            UPDATED_IN_LAST_X_DAYS,
            NOT_UPDATED_IN_LAST_X_DAYS,
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
                UPDATED_IN_LAST_X_DAYS -> Value.UPDATED_IN_LAST_X_DAYS
                NOT_UPDATED_IN_LAST_X_DAYS -> Value.NOT_UPDATED_IN_LAST_X_DAYS
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
                UPDATED_IN_LAST_X_DAYS -> Known.UPDATED_IN_LAST_X_DAYS
                NOT_UPDATED_IN_LAST_X_DAYS -> Known.NOT_UPDATED_IN_LAST_X_DAYS
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

            @JvmField val ROLLING_PROPERTY_UPDATED = of("rolling-property-updated")

            @JvmStatic fun of(value: String) = PropertyType(JsonField.of(value))
        }

        /** An enum containing [PropertyType]'s known values. */
        enum class Known {
            ROLLING_PROPERTY_UPDATED
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
            ROLLING_PROPERTY_UPDATED,
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
                ROLLING_PROPERTY_UPDATED -> Value.ROLLING_PROPERTY_UPDATED
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
                ROLLING_PROPERTY_UPDATED -> Known.ROLLING_PROPERTY_UPDATED
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

        return other is RollingPropertyUpdatedOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            numberOfDays == other.numberOfDays &&
            operationType == other.operationType &&
            operator == other.operator &&
            operatorName == other.operatorName &&
            propertyType == other.propertyType &&
            defaultValue == other.defaultValue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            numberOfDays,
            operationType,
            operator,
            operatorName,
            propertyType,
            defaultValue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RollingPropertyUpdatedOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, numberOfDays=$numberOfDays, operationType=$operationType, operator=$operator, operatorName=$operatorName, propertyType=$propertyType, defaultValue=$defaultValue, additionalProperties=$additionalProperties}"
}
