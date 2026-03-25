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
import kotlin.jvm.optionals.getOrNull

class AbsoluteRangedTimestampRefineBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lowerTimestamp: JsonField<Int>,
    private val rangeType: JsonField<RangeType>,
    private val type: JsonField<Type>,
    private val upperTimestamp: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lowerTimestamp")
        @ExcludeMissing
        lowerTimestamp: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rangeType")
        @ExcludeMissing
        rangeType: JsonField<RangeType> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("upperTimestamp")
        @ExcludeMissing
        upperTimestamp: JsonField<Int> = JsonMissing.of(),
    ) : this(lowerTimestamp, rangeType, type, upperTimestamp, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerTimestamp(): Int = lowerTimestamp.getRequired("lowerTimestamp")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rangeType(): RangeType = rangeType.getRequired("rangeType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upperTimestamp(): Int = upperTimestamp.getRequired("upperTimestamp")

    /**
     * Returns the raw JSON value of [lowerTimestamp].
     *
     * Unlike [lowerTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lowerTimestamp")
    @ExcludeMissing
    fun _lowerTimestamp(): JsonField<Int> = lowerTimestamp

    /**
     * Returns the raw JSON value of [rangeType].
     *
     * Unlike [rangeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeType") @ExcludeMissing fun _rangeType(): JsonField<RangeType> = rangeType

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [upperTimestamp].
     *
     * Unlike [upperTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upperTimestamp")
    @ExcludeMissing
    fun _upperTimestamp(): JsonField<Int> = upperTimestamp

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
         * [AbsoluteRangedTimestampRefineBy].
         *
         * The following fields are required:
         * ```java
         * .lowerTimestamp()
         * .rangeType()
         * .type()
         * .upperTimestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AbsoluteRangedTimestampRefineBy]. */
    class Builder internal constructor() {

        private var lowerTimestamp: JsonField<Int>? = null
        private var rangeType: JsonField<RangeType>? = null
        private var type: JsonField<Type>? = null
        private var upperTimestamp: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(absoluteRangedTimestampRefineBy: AbsoluteRangedTimestampRefineBy) =
            apply {
                lowerTimestamp = absoluteRangedTimestampRefineBy.lowerTimestamp
                rangeType = absoluteRangedTimestampRefineBy.rangeType
                type = absoluteRangedTimestampRefineBy.type
                upperTimestamp = absoluteRangedTimestampRefineBy.upperTimestamp
                additionalProperties =
                    absoluteRangedTimestampRefineBy.additionalProperties.toMutableMap()
            }

        fun lowerTimestamp(lowerTimestamp: Int) = lowerTimestamp(JsonField.of(lowerTimestamp))

        /**
         * Sets [Builder.lowerTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerTimestamp] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lowerTimestamp(lowerTimestamp: JsonField<Int>) = apply {
            this.lowerTimestamp = lowerTimestamp
        }

        fun rangeType(rangeType: RangeType) = rangeType(JsonField.of(rangeType))

        /**
         * Sets [Builder.rangeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeType] with a well-typed [RangeType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeType(rangeType: JsonField<RangeType>) = apply { this.rangeType = rangeType }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun upperTimestamp(upperTimestamp: Int) = upperTimestamp(JsonField.of(upperTimestamp))

        /**
         * Sets [Builder.upperTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperTimestamp] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upperTimestamp(upperTimestamp: JsonField<Int>) = apply {
            this.upperTimestamp = upperTimestamp
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
         * Returns an immutable instance of [AbsoluteRangedTimestampRefineBy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lowerTimestamp()
         * .rangeType()
         * .type()
         * .upperTimestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AbsoluteRangedTimestampRefineBy =
            AbsoluteRangedTimestampRefineBy(
                checkRequired("lowerTimestamp", lowerTimestamp),
                checkRequired("rangeType", rangeType),
                checkRequired("type", type),
                checkRequired("upperTimestamp", upperTimestamp),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AbsoluteRangedTimestampRefineBy = apply {
        if (validated) {
            return@apply
        }

        lowerTimestamp()
        rangeType().validate()
        type().validate()
        upperTimestamp()
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
        (if (lowerTimestamp.asKnown().isPresent) 1 else 0) +
            (rangeType.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (upperTimestamp.asKnown().isPresent) 1 else 0)

    class RangeType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BETWEEN = of("BETWEEN")

            @JvmField val NOT_BETWEEN = of("NOT_BETWEEN")

            @JvmStatic fun of(value: String) = RangeType(JsonField.of(value))
        }

        /** An enum containing [RangeType]'s known values. */
        enum class Known {
            BETWEEN,
            NOT_BETWEEN,
        }

        /**
         * An enum containing [RangeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RangeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BETWEEN,
            NOT_BETWEEN,
            /**
             * An enum member indicating that [RangeType] was instantiated with an unknown value.
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
                BETWEEN -> Value.BETWEEN
                NOT_BETWEEN -> Value.NOT_BETWEEN
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
                NOT_BETWEEN -> Known.NOT_BETWEEN
                else -> throw HubspotInvalidDataException("Unknown RangeType: $value")
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

        fun validate(): RangeType = apply {
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

            return other is RangeType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField
            val ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY = of("AbsoluteRangedTimestampRefineBy")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY
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
            ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY,
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
                ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY -> Value.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY
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
                ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY -> Known.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AbsoluteRangedTimestampRefineBy &&
            lowerTimestamp == other.lowerTimestamp &&
            rangeType == other.rangeType &&
            type == other.type &&
            upperTimestamp == other.upperTimestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(lowerTimestamp, rangeType, type, upperTimestamp, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AbsoluteRangedTimestampRefineBy{lowerTimestamp=$lowerTimestamp, rangeType=$rangeType, type=$type, upperTimestamp=$upperTimestamp, additionalProperties=$additionalProperties}"
}
