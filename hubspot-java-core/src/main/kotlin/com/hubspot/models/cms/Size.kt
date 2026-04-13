// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

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

class Size
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val units: JsonField<Units>,
    private val value: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("units") @ExcludeMissing units: JsonField<Units> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
    ) : this(units, value, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun units(): Units = units.getRequired("units")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): Double = value.getRequired("value")

    /**
     * Returns the raw JSON value of [units].
     *
     * Unlike [units], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<Units> = units

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
         * Returns a mutable builder for constructing an instance of [Size].
         *
         * The following fields are required:
         * ```java
         * .units()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Size]. */
    class Builder internal constructor() {

        private var units: JsonField<Units>? = null
        private var value: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(size: Size) = apply {
            units = size.units
            value = size.value
            additionalProperties = size.additionalProperties.toMutableMap()
        }

        fun units(units: Units) = units(JsonField.of(units))

        /**
         * Sets [Builder.units] to an arbitrary JSON value.
         *
         * You should usually call [Builder.units] with a well-typed [Units] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun units(units: JsonField<Units>) = apply { this.units = units }

        fun value(value: Double) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Double>) = apply { this.value = value }

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
         * Returns an immutable instance of [Size].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .units()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Size =
            Size(
                checkRequired("units", units),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Size = apply {
        if (validated) {
            return@apply
        }

        units().validate()
        value()
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
        (units.asKnown().getOrNull()?.validity() ?: 0) + (if (value.asKnown().isPresent) 1 else 0)

    class Units @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PERCENT = of("%")

            @JvmField val CH = of("ch")

            @JvmField val CM = of("cm")

            @JvmField val EM = of("em")

            @JvmField val EX = of("ex")

            @JvmField val IN = of("in")

            @JvmField val LH = of("lh")

            @JvmField val MM = of("mm")

            @JvmField val PC = of("pc")

            @JvmField val PT = of("pt")

            @JvmField val PX = of("px")

            @JvmField val Q = of("Q")

            @JvmField val REM = of("rem")

            @JvmField val VH = of("vh")

            @JvmField val VMAX = of("vmax")

            @JvmField val VMIN = of("vmin")

            @JvmField val VW = of("vw")

            @JvmStatic fun of(value: String) = Units(JsonField.of(value))
        }

        /** An enum containing [Units]'s known values. */
        enum class Known {
            PERCENT,
            CH,
            CM,
            EM,
            EX,
            IN,
            LH,
            MM,
            PC,
            PT,
            PX,
            Q,
            REM,
            VH,
            VMAX,
            VMIN,
            VW,
        }

        /**
         * An enum containing [Units]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Units] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERCENT,
            CH,
            CM,
            EM,
            EX,
            IN,
            LH,
            MM,
            PC,
            PT,
            PX,
            Q,
            REM,
            VH,
            VMAX,
            VMIN,
            VW,
            /** An enum member indicating that [Units] was instantiated with an unknown value. */
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
                PERCENT -> Value.PERCENT
                CH -> Value.CH
                CM -> Value.CM
                EM -> Value.EM
                EX -> Value.EX
                IN -> Value.IN
                LH -> Value.LH
                MM -> Value.MM
                PC -> Value.PC
                PT -> Value.PT
                PX -> Value.PX
                Q -> Value.Q
                REM -> Value.REM
                VH -> Value.VH
                VMAX -> Value.VMAX
                VMIN -> Value.VMIN
                VW -> Value.VW
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
                PERCENT -> Known.PERCENT
                CH -> Known.CH
                CM -> Known.CM
                EM -> Known.EM
                EX -> Known.EX
                IN -> Known.IN
                LH -> Known.LH
                MM -> Known.MM
                PC -> Known.PC
                PT -> Known.PT
                PX -> Known.PX
                Q -> Known.Q
                REM -> Known.REM
                VH -> Known.VH
                VMAX -> Known.VMAX
                VMIN -> Known.VMIN
                VW -> Known.VW
                else -> throw HubSpotInvalidDataException("Unknown Units: $value")
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

        fun validate(): Units = apply {
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

            return other is Units && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Size &&
            units == other.units &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(units, value, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Size{units=$units, value=$value, additionalProperties=$additionalProperties}"
}
