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

class PublicAbsoluteRangedTimestampRefineBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lowerTimestamp: JsonField<Long>,
    private val rangeType: JsonField<String>,
    private val type: JsonField<Type>,
    private val upperTimestamp: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lowerTimestamp")
        @ExcludeMissing
        lowerTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rangeType") @ExcludeMissing rangeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("upperTimestamp")
        @ExcludeMissing
        upperTimestamp: JsonField<Long> = JsonMissing.of(),
    ) : this(lowerTimestamp, rangeType, type, upperTimestamp, mutableMapOf())

    /**
     * Lower range timestamp of refinement criteria
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerTimestamp(): Long = lowerTimestamp.getRequired("lowerTimestamp")

    /**
     * Type of range of refinement critaria (BETWEEN, NOT_BETWEEN)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rangeType(): String = rangeType.getRequired("rangeType")

    /**
     * type of refine by criteria (ABSOLUTE_RANGED)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Upper range timestamp of refinement criteria
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upperTimestamp(): Long = upperTimestamp.getRequired("upperTimestamp")

    /**
     * Returns the raw JSON value of [lowerTimestamp].
     *
     * Unlike [lowerTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lowerTimestamp")
    @ExcludeMissing
    fun _lowerTimestamp(): JsonField<Long> = lowerTimestamp

    /**
     * Returns the raw JSON value of [rangeType].
     *
     * Unlike [rangeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rangeType") @ExcludeMissing fun _rangeType(): JsonField<String> = rangeType

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
    fun _upperTimestamp(): JsonField<Long> = upperTimestamp

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
         * [PublicAbsoluteRangedTimestampRefineBy].
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

    /** A builder for [PublicAbsoluteRangedTimestampRefineBy]. */
    class Builder internal constructor() {

        private var lowerTimestamp: JsonField<Long>? = null
        private var rangeType: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var upperTimestamp: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicAbsoluteRangedTimestampRefineBy: PublicAbsoluteRangedTimestampRefineBy
        ) = apply {
            lowerTimestamp = publicAbsoluteRangedTimestampRefineBy.lowerTimestamp
            rangeType = publicAbsoluteRangedTimestampRefineBy.rangeType
            type = publicAbsoluteRangedTimestampRefineBy.type
            upperTimestamp = publicAbsoluteRangedTimestampRefineBy.upperTimestamp
            additionalProperties =
                publicAbsoluteRangedTimestampRefineBy.additionalProperties.toMutableMap()
        }

        /** Lower range timestamp of refinement criteria */
        fun lowerTimestamp(lowerTimestamp: Long) = lowerTimestamp(JsonField.of(lowerTimestamp))

        /**
         * Sets [Builder.lowerTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerTimestamp] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lowerTimestamp(lowerTimestamp: JsonField<Long>) = apply {
            this.lowerTimestamp = lowerTimestamp
        }

        /** Type of range of refinement critaria (BETWEEN, NOT_BETWEEN) */
        fun rangeType(rangeType: String) = rangeType(JsonField.of(rangeType))

        /**
         * Sets [Builder.rangeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeType(rangeType: JsonField<String>) = apply { this.rangeType = rangeType }

        /** type of refine by criteria (ABSOLUTE_RANGED) */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Upper range timestamp of refinement criteria */
        fun upperTimestamp(upperTimestamp: Long) = upperTimestamp(JsonField.of(upperTimestamp))

        /**
         * Sets [Builder.upperTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperTimestamp] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upperTimestamp(upperTimestamp: JsonField<Long>) = apply {
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
         * Returns an immutable instance of [PublicAbsoluteRangedTimestampRefineBy].
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
        fun build(): PublicAbsoluteRangedTimestampRefineBy =
            PublicAbsoluteRangedTimestampRefineBy(
                checkRequired("lowerTimestamp", lowerTimestamp),
                checkRequired("rangeType", rangeType),
                checkRequired("type", type),
                checkRequired("upperTimestamp", upperTimestamp),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PublicAbsoluteRangedTimestampRefineBy = apply {
        if (validated) {
            return@apply
        }

        lowerTimestamp()
        rangeType()
        type().validate()
        upperTimestamp()
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
        (if (lowerTimestamp.asKnown().isPresent) 1 else 0) +
            (if (rangeType.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (upperTimestamp.asKnown().isPresent) 1 else 0)

    /** type of refine by criteria (ABSOLUTE_RANGED) */
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

            @JvmField val ABSOLUTE_RANGED = of("ABSOLUTE_RANGED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ABSOLUTE_RANGED
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
            ABSOLUTE_RANGED,
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
                ABSOLUTE_RANGED -> Value.ABSOLUTE_RANGED
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
                ABSOLUTE_RANGED -> Known.ABSOLUTE_RANGED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicAbsoluteRangedTimestampRefineBy &&
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
        "PublicAbsoluteRangedTimestampRefineBy{lowerTimestamp=$lowerTimestamp, rangeType=$rangeType, type=$type, upperTimestamp=$upperTimestamp, additionalProperties=$additionalProperties}"
}
