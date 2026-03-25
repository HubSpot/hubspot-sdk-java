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

class RelativeRangedTimestampRefineBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lowerBoundOffset: JsonField<TimeOffset>,
    private val rangeType: JsonField<RangeType>,
    private val type: JsonField<Type>,
    private val upperBoundOffset: JsonField<TimeOffset>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lowerBoundOffset")
        @ExcludeMissing
        lowerBoundOffset: JsonField<TimeOffset> = JsonMissing.of(),
        @JsonProperty("rangeType")
        @ExcludeMissing
        rangeType: JsonField<RangeType> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("upperBoundOffset")
        @ExcludeMissing
        upperBoundOffset: JsonField<TimeOffset> = JsonMissing.of(),
    ) : this(lowerBoundOffset, rangeType, type, upperBoundOffset, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerBoundOffset(): TimeOffset = lowerBoundOffset.getRequired("lowerBoundOffset")

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
    fun upperBoundOffset(): TimeOffset = upperBoundOffset.getRequired("upperBoundOffset")

    /**
     * Returns the raw JSON value of [lowerBoundOffset].
     *
     * Unlike [lowerBoundOffset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lowerBoundOffset")
    @ExcludeMissing
    fun _lowerBoundOffset(): JsonField<TimeOffset> = lowerBoundOffset

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
     * Returns the raw JSON value of [upperBoundOffset].
     *
     * Unlike [upperBoundOffset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upperBoundOffset")
    @ExcludeMissing
    fun _upperBoundOffset(): JsonField<TimeOffset> = upperBoundOffset

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
         * [RelativeRangedTimestampRefineBy].
         *
         * The following fields are required:
         * ```java
         * .lowerBoundOffset()
         * .rangeType()
         * .type()
         * .upperBoundOffset()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RelativeRangedTimestampRefineBy]. */
    class Builder internal constructor() {

        private var lowerBoundOffset: JsonField<TimeOffset>? = null
        private var rangeType: JsonField<RangeType>? = null
        private var type: JsonField<Type>? = null
        private var upperBoundOffset: JsonField<TimeOffset>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(relativeRangedTimestampRefineBy: RelativeRangedTimestampRefineBy) =
            apply {
                lowerBoundOffset = relativeRangedTimestampRefineBy.lowerBoundOffset
                rangeType = relativeRangedTimestampRefineBy.rangeType
                type = relativeRangedTimestampRefineBy.type
                upperBoundOffset = relativeRangedTimestampRefineBy.upperBoundOffset
                additionalProperties =
                    relativeRangedTimestampRefineBy.additionalProperties.toMutableMap()
            }

        fun lowerBoundOffset(lowerBoundOffset: TimeOffset) =
            lowerBoundOffset(JsonField.of(lowerBoundOffset))

        /**
         * Sets [Builder.lowerBoundOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerBoundOffset] with a well-typed [TimeOffset] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lowerBoundOffset(lowerBoundOffset: JsonField<TimeOffset>) = apply {
            this.lowerBoundOffset = lowerBoundOffset
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

        fun upperBoundOffset(upperBoundOffset: TimeOffset) =
            upperBoundOffset(JsonField.of(upperBoundOffset))

        /**
         * Sets [Builder.upperBoundOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperBoundOffset] with a well-typed [TimeOffset] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun upperBoundOffset(upperBoundOffset: JsonField<TimeOffset>) = apply {
            this.upperBoundOffset = upperBoundOffset
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
         * Returns an immutable instance of [RelativeRangedTimestampRefineBy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lowerBoundOffset()
         * .rangeType()
         * .type()
         * .upperBoundOffset()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RelativeRangedTimestampRefineBy =
            RelativeRangedTimestampRefineBy(
                checkRequired("lowerBoundOffset", lowerBoundOffset),
                checkRequired("rangeType", rangeType),
                checkRequired("type", type),
                checkRequired("upperBoundOffset", upperBoundOffset),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RelativeRangedTimestampRefineBy = apply {
        if (validated) {
            return@apply
        }

        lowerBoundOffset().validate()
        rangeType().validate()
        type().validate()
        upperBoundOffset().validate()
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
        (lowerBoundOffset.asKnown().getOrNull()?.validity() ?: 0) +
            (rangeType.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (upperBoundOffset.asKnown().getOrNull()?.validity() ?: 0)

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
            val RELATIVE_RANGED_TIMESTAMP_REFINE_BY = of("RelativeRangedTimestampRefineBy")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            RELATIVE_RANGED_TIMESTAMP_REFINE_BY
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
            RELATIVE_RANGED_TIMESTAMP_REFINE_BY,
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
                RELATIVE_RANGED_TIMESTAMP_REFINE_BY -> Value.RELATIVE_RANGED_TIMESTAMP_REFINE_BY
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
                RELATIVE_RANGED_TIMESTAMP_REFINE_BY -> Known.RELATIVE_RANGED_TIMESTAMP_REFINE_BY
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

        return other is RelativeRangedTimestampRefineBy &&
            lowerBoundOffset == other.lowerBoundOffset &&
            rangeType == other.rangeType &&
            type == other.type &&
            upperBoundOffset == other.upperBoundOffset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(lowerBoundOffset, rangeType, type, upperBoundOffset, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RelativeRangedTimestampRefineBy{lowerBoundOffset=$lowerBoundOffset, rangeType=$rangeType, type=$type, upperBoundOffset=$upperBoundOffset, additionalProperties=$additionalProperties}"
}
