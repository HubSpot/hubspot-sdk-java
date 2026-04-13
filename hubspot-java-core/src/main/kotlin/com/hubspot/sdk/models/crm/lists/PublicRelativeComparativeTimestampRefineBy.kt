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

class PublicRelativeComparativeTimestampRefineBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val comparison: JsonField<String>,
    private val timeOffset: JsonField<PublicTimeOffset>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("comparison")
        @ExcludeMissing
        comparison: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeOffset")
        @ExcludeMissing
        timeOffset: JsonField<PublicTimeOffset> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(comparison, timeOffset, type, mutableMapOf())

    /**
     * Defines the comparison operation to be used in the refinement (BEFORE, AFTER).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun comparison(): String = comparison.getRequired("comparison")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeOffset(): PublicTimeOffset = timeOffset.getRequired("timeOffset")

    /**
     * Specifies the type of refinement, (RELATIVE_COMPARATIVE).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [comparison].
     *
     * Unlike [comparison], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comparison") @ExcludeMissing fun _comparison(): JsonField<String> = comparison

    /**
     * Returns the raw JSON value of [timeOffset].
     *
     * Unlike [timeOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeOffset")
    @ExcludeMissing
    fun _timeOffset(): JsonField<PublicTimeOffset> = timeOffset

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [PublicRelativeComparativeTimestampRefineBy].
         *
         * The following fields are required:
         * ```java
         * .comparison()
         * .timeOffset()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicRelativeComparativeTimestampRefineBy]. */
    class Builder internal constructor() {

        private var comparison: JsonField<String>? = null
        private var timeOffset: JsonField<PublicTimeOffset>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicRelativeComparativeTimestampRefineBy: PublicRelativeComparativeTimestampRefineBy
        ) = apply {
            comparison = publicRelativeComparativeTimestampRefineBy.comparison
            timeOffset = publicRelativeComparativeTimestampRefineBy.timeOffset
            type = publicRelativeComparativeTimestampRefineBy.type
            additionalProperties =
                publicRelativeComparativeTimestampRefineBy.additionalProperties.toMutableMap()
        }

        /** Defines the comparison operation to be used in the refinement (BEFORE, AFTER). */
        fun comparison(comparison: String) = comparison(JsonField.of(comparison))

        /**
         * Sets [Builder.comparison] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparison] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun comparison(comparison: JsonField<String>) = apply { this.comparison = comparison }

        fun timeOffset(timeOffset: PublicTimeOffset) = timeOffset(JsonField.of(timeOffset))

        /**
         * Sets [Builder.timeOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeOffset] with a well-typed [PublicTimeOffset] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeOffset(timeOffset: JsonField<PublicTimeOffset>) = apply {
            this.timeOffset = timeOffset
        }

        /** Specifies the type of refinement, (RELATIVE_COMPARATIVE). */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [PublicRelativeComparativeTimestampRefineBy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .comparison()
         * .timeOffset()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicRelativeComparativeTimestampRefineBy =
            PublicRelativeComparativeTimestampRefineBy(
                checkRequired("comparison", comparison),
                checkRequired("timeOffset", timeOffset),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicRelativeComparativeTimestampRefineBy = apply {
        if (validated) {
            return@apply
        }

        comparison()
        timeOffset().validate()
        type().validate()
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
        (if (comparison.asKnown().isPresent) 1 else 0) +
            (timeOffset.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Specifies the type of refinement, (RELATIVE_COMPARATIVE). */
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

            @JvmField val RELATIVE_COMPARATIVE = of("RELATIVE_COMPARATIVE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            RELATIVE_COMPARATIVE
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
            RELATIVE_COMPARATIVE,
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
                RELATIVE_COMPARATIVE -> Value.RELATIVE_COMPARATIVE
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
                RELATIVE_COMPARATIVE -> Known.RELATIVE_COMPARATIVE
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

        return other is PublicRelativeComparativeTimestampRefineBy &&
            comparison == other.comparison &&
            timeOffset == other.timeOffset &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(comparison, timeOffset, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicRelativeComparativeTimestampRefineBy{comparison=$comparison, timeOffset=$timeOffset, type=$type, additionalProperties=$additionalProperties}"
}
