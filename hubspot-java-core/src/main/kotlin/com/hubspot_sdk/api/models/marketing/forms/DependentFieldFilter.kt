// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A condition based on customer input */
class DependentFieldFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val operator: JsonField<Operator>,
    private val rangeEnd: JsonField<String>,
    private val rangeStart: JsonField<String>,
    private val value: JsonField<String>,
    private val values: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("rangeEnd") @ExcludeMissing rangeEnd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rangeStart")
        @ExcludeMissing
        rangeStart: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<List<String>> = JsonMissing.of(),
    ) : this(operator, rangeEnd, rangeStart, value, values, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rangeEnd(): String = rangeEnd.getRequired("rangeEnd")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rangeStart(): String = rangeStart.getRequired("rangeStart")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun values(): List<String> = values.getRequired("values")

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [rangeEnd].
     *
     * Unlike [rangeEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeEnd") @ExcludeMissing fun _rangeEnd(): JsonField<String> = rangeEnd

    /**
     * Returns the raw JSON value of [rangeStart].
     *
     * Unlike [rangeStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeStart") @ExcludeMissing fun _rangeStart(): JsonField<String> = rangeStart

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
         * Returns a mutable builder for constructing an instance of [DependentFieldFilter].
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .rangeEnd()
         * .rangeStart()
         * .value()
         * .values()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DependentFieldFilter]. */
    class Builder internal constructor() {

        private var operator: JsonField<Operator>? = null
        private var rangeEnd: JsonField<String>? = null
        private var rangeStart: JsonField<String>? = null
        private var value: JsonField<String>? = null
        private var values: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dependentFieldFilter: DependentFieldFilter) = apply {
            operator = dependentFieldFilter.operator
            rangeEnd = dependentFieldFilter.rangeEnd
            rangeStart = dependentFieldFilter.rangeStart
            value = dependentFieldFilter.value
            values = dependentFieldFilter.values.map { it.toMutableList() }
            additionalProperties = dependentFieldFilter.additionalProperties.toMutableMap()
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

        fun rangeEnd(rangeEnd: String) = rangeEnd(JsonField.of(rangeEnd))

        /**
         * Sets [Builder.rangeEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeEnd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rangeEnd(rangeEnd: JsonField<String>) = apply { this.rangeEnd = rangeEnd }

        fun rangeStart(rangeStart: String) = rangeStart(JsonField.of(rangeStart))

        /**
         * Sets [Builder.rangeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeStart] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeStart(rangeStart: JsonField<String>) = apply { this.rangeStart = rangeStart }

        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        fun values(values: List<String>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<List<String>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: String) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
                }
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
         * Returns an immutable instance of [DependentFieldFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .rangeEnd()
         * .rangeStart()
         * .value()
         * .values()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DependentFieldFilter =
            DependentFieldFilter(
                checkRequired("operator", operator),
                checkRequired("rangeEnd", rangeEnd),
                checkRequired("rangeStart", rangeStart),
                checkRequired("value", value),
                checkRequired("values", values).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DependentFieldFilter = apply {
        if (validated) {
            return@apply
        }

        operator().validate()
        rangeEnd()
        rangeStart()
        value()
        values()
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
        (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (rangeEnd.asKnown().isPresent) 1 else 0) +
            (if (rangeStart.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.size ?: 0)

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

            @JvmField val BETWEEN = of("between")

            @JvmField val CONTAINS = of("contains")

            @JvmField val DOESNT_CONTAIN = of("doesnt_contain")

            @JvmField val EQ = of("eq")

            @JvmField val GT = of("gt")

            @JvmField val GTE = of("gte")

            @JvmField val IS_NOT_EMPTY = of("is_not_empty")

            @JvmField val LT = of("lt")

            @JvmField val LTE = of("lte")

            @JvmField val NEQ = of("neq")

            @JvmField val NOT_BETWEEN = of("not_between")

            @JvmField val SET_ALL = of("set_all")

            @JvmField val SET_ANY = of("set_any")

            @JvmField val SET_EQ = of("set_eq")

            @JvmField val SET_NEQ = of("set_neq")

            @JvmField val SET_NOT_ALL = of("set_not_all")

            @JvmField val SET_NOT_ANY = of("set_not_any")

            @JvmField val STR_ENDS_WITH = of("str_ends_with")

            @JvmField val STR_STARTS_WITH = of("str_starts_with")

            @JvmField val WITHIN_TIME = of("within_time")

            @JvmField val WITHIN_TIME_REVERSE = of("within_time_reverse")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            BETWEEN,
            CONTAINS,
            DOESNT_CONTAIN,
            EQ,
            GT,
            GTE,
            IS_NOT_EMPTY,
            LT,
            LTE,
            NEQ,
            NOT_BETWEEN,
            SET_ALL,
            SET_ANY,
            SET_EQ,
            SET_NEQ,
            SET_NOT_ALL,
            SET_NOT_ANY,
            STR_ENDS_WITH,
            STR_STARTS_WITH,
            WITHIN_TIME,
            WITHIN_TIME_REVERSE,
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
            BETWEEN,
            CONTAINS,
            DOESNT_CONTAIN,
            EQ,
            GT,
            GTE,
            IS_NOT_EMPTY,
            LT,
            LTE,
            NEQ,
            NOT_BETWEEN,
            SET_ALL,
            SET_ANY,
            SET_EQ,
            SET_NEQ,
            SET_NOT_ALL,
            SET_NOT_ANY,
            STR_ENDS_WITH,
            STR_STARTS_WITH,
            WITHIN_TIME,
            WITHIN_TIME_REVERSE,
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
                BETWEEN -> Value.BETWEEN
                CONTAINS -> Value.CONTAINS
                DOESNT_CONTAIN -> Value.DOESNT_CONTAIN
                EQ -> Value.EQ
                GT -> Value.GT
                GTE -> Value.GTE
                IS_NOT_EMPTY -> Value.IS_NOT_EMPTY
                LT -> Value.LT
                LTE -> Value.LTE
                NEQ -> Value.NEQ
                NOT_BETWEEN -> Value.NOT_BETWEEN
                SET_ALL -> Value.SET_ALL
                SET_ANY -> Value.SET_ANY
                SET_EQ -> Value.SET_EQ
                SET_NEQ -> Value.SET_NEQ
                SET_NOT_ALL -> Value.SET_NOT_ALL
                SET_NOT_ANY -> Value.SET_NOT_ANY
                STR_ENDS_WITH -> Value.STR_ENDS_WITH
                STR_STARTS_WITH -> Value.STR_STARTS_WITH
                WITHIN_TIME -> Value.WITHIN_TIME
                WITHIN_TIME_REVERSE -> Value.WITHIN_TIME_REVERSE
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
                BETWEEN -> Known.BETWEEN
                CONTAINS -> Known.CONTAINS
                DOESNT_CONTAIN -> Known.DOESNT_CONTAIN
                EQ -> Known.EQ
                GT -> Known.GT
                GTE -> Known.GTE
                IS_NOT_EMPTY -> Known.IS_NOT_EMPTY
                LT -> Known.LT
                LTE -> Known.LTE
                NEQ -> Known.NEQ
                NOT_BETWEEN -> Known.NOT_BETWEEN
                SET_ALL -> Known.SET_ALL
                SET_ANY -> Known.SET_ANY
                SET_EQ -> Known.SET_EQ
                SET_NEQ -> Known.SET_NEQ
                SET_NOT_ALL -> Known.SET_NOT_ALL
                SET_NOT_ANY -> Known.SET_NOT_ANY
                STR_ENDS_WITH -> Known.STR_ENDS_WITH
                STR_STARTS_WITH -> Known.STR_STARTS_WITH
                WITHIN_TIME -> Known.WITHIN_TIME
                WITHIN_TIME_REVERSE -> Known.WITHIN_TIME_REVERSE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DependentFieldFilter &&
            operator == other.operator &&
            rangeEnd == other.rangeEnd &&
            rangeStart == other.rangeStart &&
            value == other.value &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(operator, rangeEnd, rangeStart, value, values, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DependentFieldFilter{operator=$operator, rangeEnd=$rangeEnd, rangeStart=$rangeStart, value=$value, values=$values, additionalProperties=$additionalProperties}"
}
