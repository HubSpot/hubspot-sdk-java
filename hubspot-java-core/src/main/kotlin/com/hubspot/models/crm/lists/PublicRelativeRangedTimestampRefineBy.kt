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
import kotlin.jvm.optionals.getOrNull

class PublicRelativeRangedTimestampRefineBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lowerBoundOffset: JsonField<PublicTimeOffset>,
    private val rangeType: JsonField<String>,
    private val type: JsonField<Type>,
    private val upperBoundOffset: JsonField<PublicTimeOffset>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lowerBoundOffset")
        @ExcludeMissing
        lowerBoundOffset: JsonField<PublicTimeOffset> = JsonMissing.of(),
        @JsonProperty("rangeType") @ExcludeMissing rangeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("upperBoundOffset")
        @ExcludeMissing
        upperBoundOffset: JsonField<PublicTimeOffset> = JsonMissing.of(),
    ) : this(lowerBoundOffset, rangeType, type, upperBoundOffset, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerBoundOffset(): PublicTimeOffset = lowerBoundOffset.getRequired("lowerBoundOffset")

    /**
     * Specifies the type of range for the refinement criteria (BETWEEN, NOT_BETWEEN).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rangeType(): String = rangeType.getRequired("rangeType")

    /**
     * Indicates the type of refinement (RELATIVE_RANGED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun upperBoundOffset(): PublicTimeOffset = upperBoundOffset.getRequired("upperBoundOffset")

    /**
     * Returns the raw JSON value of [lowerBoundOffset].
     *
     * Unlike [lowerBoundOffset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lowerBoundOffset")
    @ExcludeMissing
    fun _lowerBoundOffset(): JsonField<PublicTimeOffset> = lowerBoundOffset

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
     * Returns the raw JSON value of [upperBoundOffset].
     *
     * Unlike [upperBoundOffset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upperBoundOffset")
    @ExcludeMissing
    fun _upperBoundOffset(): JsonField<PublicTimeOffset> = upperBoundOffset

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
         * [PublicRelativeRangedTimestampRefineBy].
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

    /** A builder for [PublicRelativeRangedTimestampRefineBy]. */
    class Builder internal constructor() {

        private var lowerBoundOffset: JsonField<PublicTimeOffset>? = null
        private var rangeType: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var upperBoundOffset: JsonField<PublicTimeOffset>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicRelativeRangedTimestampRefineBy: PublicRelativeRangedTimestampRefineBy
        ) = apply {
            lowerBoundOffset = publicRelativeRangedTimestampRefineBy.lowerBoundOffset
            rangeType = publicRelativeRangedTimestampRefineBy.rangeType
            type = publicRelativeRangedTimestampRefineBy.type
            upperBoundOffset = publicRelativeRangedTimestampRefineBy.upperBoundOffset
            additionalProperties =
                publicRelativeRangedTimestampRefineBy.additionalProperties.toMutableMap()
        }

        fun lowerBoundOffset(lowerBoundOffset: PublicTimeOffset) =
            lowerBoundOffset(JsonField.of(lowerBoundOffset))

        /**
         * Sets [Builder.lowerBoundOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerBoundOffset] with a well-typed [PublicTimeOffset]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lowerBoundOffset(lowerBoundOffset: JsonField<PublicTimeOffset>) = apply {
            this.lowerBoundOffset = lowerBoundOffset
        }

        /** Specifies the type of range for the refinement criteria (BETWEEN, NOT_BETWEEN). */
        fun rangeType(rangeType: String) = rangeType(JsonField.of(rangeType))

        /**
         * Sets [Builder.rangeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rangeType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rangeType(rangeType: JsonField<String>) = apply { this.rangeType = rangeType }

        /** Indicates the type of refinement (RELATIVE_RANGED). */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun upperBoundOffset(upperBoundOffset: PublicTimeOffset) =
            upperBoundOffset(JsonField.of(upperBoundOffset))

        /**
         * Sets [Builder.upperBoundOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upperBoundOffset] with a well-typed [PublicTimeOffset]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun upperBoundOffset(upperBoundOffset: JsonField<PublicTimeOffset>) = apply {
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
         * Returns an immutable instance of [PublicRelativeRangedTimestampRefineBy].
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
        fun build(): PublicRelativeRangedTimestampRefineBy =
            PublicRelativeRangedTimestampRefineBy(
                checkRequired("lowerBoundOffset", lowerBoundOffset),
                checkRequired("rangeType", rangeType),
                checkRequired("type", type),
                checkRequired("upperBoundOffset", upperBoundOffset),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicRelativeRangedTimestampRefineBy = apply {
        if (validated) {
            return@apply
        }

        lowerBoundOffset().validate()
        rangeType()
        type().validate()
        upperBoundOffset().validate()
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
        (lowerBoundOffset.asKnown().getOrNull()?.validity() ?: 0) +
            (if (rangeType.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (upperBoundOffset.asKnown().getOrNull()?.validity() ?: 0)

    /** Indicates the type of refinement (RELATIVE_RANGED). */
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

            @JvmField val RELATIVE_RANGED = of("RELATIVE_RANGED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            RELATIVE_RANGED
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
            RELATIVE_RANGED,
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
                RELATIVE_RANGED -> Value.RELATIVE_RANGED
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
                RELATIVE_RANGED -> Known.RELATIVE_RANGED
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

        return other is PublicRelativeRangedTimestampRefineBy &&
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
        "PublicRelativeRangedTimestampRefineBy{lowerBoundOffset=$lowerBoundOffset, rangeType=$rangeType, type=$type, upperBoundOffset=$upperBoundOffset, additionalProperties=$additionalProperties}"
}
