// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicRangedDatePropertyOperation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeObjectsWithNoValueSet: JsonField<Boolean>,
    private val lowerBound: JsonField<Long>,
    private val operationType: JsonField<OperationType>,
    private val operator: JsonField<String>,
    private val requiresTimeZoneConversion: JsonField<Boolean>,
    private val upperBound: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeObjectsWithNoValueSet")
        @ExcludeMissing
        includeObjectsWithNoValueSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lowerBound") @ExcludeMissing lowerBound: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("operationType")
        @ExcludeMissing
        operationType: JsonField<OperationType> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requiresTimeZoneConversion")
        @ExcludeMissing
        requiresTimeZoneConversion: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("upperBound") @ExcludeMissing upperBound: JsonField<Long> = JsonMissing.of(),
    ) : this(
        includeObjectsWithNoValueSet,
        lowerBound,
        operationType,
        operator,
        requiresTimeZoneConversion,
        upperBound,
        mutableMapOf(),
    )

    /**
     * Specifies whether objects without a set value should be included in the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeObjectsWithNoValueSet(): Boolean =
        includeObjectsWithNoValueSet.getRequired("includeObjectsWithNoValueSet")

    /**
     * The lower limit of the date range for the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerBound(): Long = lowerBound.getRequired("lowerBound")

    /**
     * Specifies the type of operation (RANGED_DATE).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationType(): OperationType = operationType.getRequired("operationType")

    /**
     * Defines the operation to be applied in the ranged date property operation (IS_BETWEEN,
     * IS_NOT_BETWEEN).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): String = operator.getRequired("operator")

    /**
     * Indicates whether the operation requires conversion to a different time zone.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiresTimeZoneConversion(): Boolean =
        requiresTimeZoneConversion.getRequired("requiresTimeZoneConversion")

    /**
     * The upper limit of the date range for the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upperBound(): Long = upperBound.getRequired("upperBound")

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
     * Returns the raw JSON value of [lowerBound].
     *
     * Unlike [lowerBound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lowerBound") @ExcludeMissing fun _lowerBound(): JsonField<Long> = lowerBound

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
     * Returns the raw JSON value of [requiresTimeZoneConversion].
     *
     * Unlike [requiresTimeZoneConversion], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("requiresTimeZoneConversion")
    @ExcludeMissing
    fun _requiresTimeZoneConversion(): JsonField<Boolean> = requiresTimeZoneConversion

    /**
     * Returns the raw JSON value of [upperBound].
     *
     * Unlike [upperBound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upperBound") @ExcludeMissing fun _upperBound(): JsonField<Long> = upperBound

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
         * [PublicRangedDatePropertyOperation].
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .lowerBound()
         * .operationType()
         * .operator()
         * .requiresTimeZoneConversion()
         * .upperBound()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicRangedDatePropertyOperation]. */
    class Builder internal constructor() {

        private var includeObjectsWithNoValueSet: JsonField<Boolean>? = null
        private var lowerBound: JsonField<Long>? = null
        private var operationType: JsonField<OperationType>? = null
        private var operator: JsonField<String>? = null
        private var requiresTimeZoneConversion: JsonField<Boolean>? = null
        private var upperBound: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicRangedDatePropertyOperation: PublicRangedDatePropertyOperation) =
            apply {
                includeObjectsWithNoValueSet =
                    publicRangedDatePropertyOperation.includeObjectsWithNoValueSet
                lowerBound = publicRangedDatePropertyOperation.lowerBound
                operationType = publicRangedDatePropertyOperation.operationType
                operator = publicRangedDatePropertyOperation.operator
                requiresTimeZoneConversion =
                    publicRangedDatePropertyOperation.requiresTimeZoneConversion
                upperBound = publicRangedDatePropertyOperation.upperBound
                additionalProperties =
                    publicRangedDatePropertyOperation.additionalProperties.toMutableMap()
            }

        /** Specifies whether objects without a set value should be included in the operation. */
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

        /** The lower limit of the date range for the operation. */
        fun lowerBound(lowerBound: Long) = lowerBound(JsonField.of(lowerBound))

        /**
         * Sets [Builder.lowerBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerBound] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lowerBound(lowerBound: JsonField<Long>) = apply { this.lowerBound = lowerBound }

        /** Specifies the type of operation (RANGED_DATE). */
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
         * Defines the operation to be applied in the ranged date property operation (IS_BETWEEN,
         * IS_NOT_BETWEEN).
         */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** Indicates whether the operation requires conversion to a different time zone. */
        fun requiresTimeZoneConversion(requiresTimeZoneConversion: Boolean) =
            requiresTimeZoneConversion(JsonField.of(requiresTimeZoneConversion))

        /**
         * Sets [Builder.requiresTimeZoneConversion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiresTimeZoneConversion] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requiresTimeZoneConversion(requiresTimeZoneConversion: JsonField<Boolean>) = apply {
            this.requiresTimeZoneConversion = requiresTimeZoneConversion
        }

        /** The upper limit of the date range for the operation. */
        fun upperBound(upperBound: Long) = upperBound(JsonField.of(upperBound))

        /**
         * Sets [Builder.upperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperBound] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun upperBound(upperBound: JsonField<Long>) = apply { this.upperBound = upperBound }

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
         * Returns an immutable instance of [PublicRangedDatePropertyOperation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .includeObjectsWithNoValueSet()
         * .lowerBound()
         * .operationType()
         * .operator()
         * .requiresTimeZoneConversion()
         * .upperBound()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicRangedDatePropertyOperation =
            PublicRangedDatePropertyOperation(
                checkRequired("includeObjectsWithNoValueSet", includeObjectsWithNoValueSet),
                checkRequired("lowerBound", lowerBound),
                checkRequired("operationType", operationType),
                checkRequired("operator", operator),
                checkRequired("requiresTimeZoneConversion", requiresTimeZoneConversion),
                checkRequired("upperBound", upperBound),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicRangedDatePropertyOperation = apply {
        if (validated) {
            return@apply
        }

        includeObjectsWithNoValueSet()
        lowerBound()
        operationType().validate()
        operator()
        requiresTimeZoneConversion()
        upperBound()
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
            (if (lowerBound.asKnown().isPresent) 1 else 0) +
            (operationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (requiresTimeZoneConversion.asKnown().isPresent) 1 else 0) +
            (if (upperBound.asKnown().isPresent) 1 else 0)

    /** Specifies the type of operation (RANGED_DATE). */
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

            @JvmField val RANGED_DATE = of("RANGED_DATE")

            @JvmStatic fun of(value: String) = OperationType(JsonField.of(value))
        }

        /** An enum containing [OperationType]'s known values. */
        enum class Known {
            RANGED_DATE
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
            RANGED_DATE,
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
                RANGED_DATE -> Value.RANGED_DATE
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
                RANGED_DATE -> Known.RANGED_DATE
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

        return other is PublicRangedDatePropertyOperation &&
            includeObjectsWithNoValueSet == other.includeObjectsWithNoValueSet &&
            lowerBound == other.lowerBound &&
            operationType == other.operationType &&
            operator == other.operator &&
            requiresTimeZoneConversion == other.requiresTimeZoneConversion &&
            upperBound == other.upperBound &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            includeObjectsWithNoValueSet,
            lowerBound,
            operationType,
            operator,
            requiresTimeZoneConversion,
            upperBound,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicRangedDatePropertyOperation{includeObjectsWithNoValueSet=$includeObjectsWithNoValueSet, lowerBound=$lowerBound, operationType=$operationType, operator=$operator, requiresTimeZoneConversion=$requiresTimeZoneConversion, upperBound=$upperBound, additionalProperties=$additionalProperties}"
}
