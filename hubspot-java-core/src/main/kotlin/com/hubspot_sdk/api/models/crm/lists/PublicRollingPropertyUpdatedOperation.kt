// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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
import kotlin.jvm.optionals.getOrNull

class PublicRollingPropertyUpdatedOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val numberOfDays: JsonField<Int>,
    private val operationType: JsonField<OperationType>,
    private val operator: JsonField<String>,
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
        operationType: JsonField<OperationType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
    ) : this(includeObjectsWithNoValueSet, numberOfDays, operationType, operator, mutableMapOf())

    /**
     * Indicates whether objects with no value set for the property should be included in the
     * operation.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeObjectsWithNoValueSet(): Boolean =
        includeObjectsWithNoValueSet.getRequired("includeObjectsWithNoValueSet")

    /**
     * The number of days to be considered in the rolling property updated operation.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberOfDays(): Int = numberOfDays.getRequired("numberOfDays")

    /**
     * Specifies the type of operation (ROLLING_PROPERTY_UPDATED).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): OperationType = operationType.getRequired("operationType")

    /**
     * Defines the operation to be applied within the rolling property updated operation
     * (UPDATED_IN_LAST_X_DAYS, NOT_UPDATED_IN_LAST_X_DAYS).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

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
    fun _operationType(): JsonField<OperationType> = operationType

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

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
         * [PublicRollingPropertyUpdatedOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .numberOfDays()
         * .operationType()
         * .operator()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicRollingPropertyUpdatedOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var numberOfDays: JsonField<Int>? = null
        private var operationType: JsonField<OperationType>? = null
        private var operator: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicRollingPropertyUpdatedOperation: PublicRollingPropertyUpdatedOperation
        ) = apply {
            includeObjectsWithNoValueSet =
                publicRollingPropertyUpdatedOperation.includeObjectsWithNoValueSet
            numberOfDays = publicRollingPropertyUpdatedOperation.numberOfDays
            operationType = publicRollingPropertyUpdatedOperation.operationType
            operator = publicRollingPropertyUpdatedOperation.operator
            additionalProperties =
                publicRollingPropertyUpdatedOperation.additionalProperties.toMutableMap()
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

        /** The number of days to be considered in the rolling property updated operation. */
        fun numberOfDays(numberOfDays: Int) = numberOfDays(JsonField.of(numberOfDays))

        /**
         * Sets [Builder.numberOfDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfDays] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numberOfDays(numberOfDays: JsonField<Int>) = apply { this.numberOfDays = numberOfDays }

        /** Specifies the type of operation (ROLLING_PROPERTY_UPDATED). */
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
         * Defines the operation to be applied within the rolling property updated operation
         * (UPDATED_IN_LAST_X_DAYS, NOT_UPDATED_IN_LAST_X_DAYS).
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

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
         * Returns an immutable instance of [PublicRollingPropertyUpdatedOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .numberOfDays()
         * .operationType()
         * .operator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicRollingPropertyUpdatedOperation =
            PublicRollingPropertyUpdatedOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("numberOfDays", numberOfDays),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicRollingPropertyUpdatedOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        numberOfDays()
        operationType().validate()
        operator()
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
            (operationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0)

    /** Specifies the type of operation (ROLLING_PROPERTY_UPDATED). */
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

            @JvmField val ROLLING_PROPERTY_UPDATED = of("ROLLING_PROPERTY_UPDATED")

            @JvmStatic fun of(value: String) = OperationType(JsonField.of(value))
        }

        /** An enum containing [OperationType]'s known values. */
        enum class Known {
            ROLLING_PROPERTY_UPDATED
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
            ROLLING_PROPERTY_UPDATED,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicRollingPropertyUpdatedOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            numberOfDays == other.numberOfDays &&
            operationType == other.operationType &&
            operator == other.operator &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            numberOfDays,
            operationType,
            operator,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicRollingPropertyUpdatedOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, numberOfDays=$numberOfDays, operationType=$operationType, operator=$operator, additionalProperties=$additionalProperties}"
}
