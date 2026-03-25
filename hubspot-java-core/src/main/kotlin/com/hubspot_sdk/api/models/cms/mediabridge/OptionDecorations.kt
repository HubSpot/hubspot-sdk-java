// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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

class OptionDecorations
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val color: JsonField<Color>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("color") @ExcludeMissing color: JsonField<Color> = JsonMissing.of()
    ) : this(color, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun color(): Color = color.getRequired("color")

    /**
     * Returns the raw JSON value of [color].
     *
     * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<Color> = color

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
         * Returns a mutable builder for constructing an instance of [OptionDecorations].
         *
         * The following fields are required:
         * ```java
         * .color()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptionDecorations]. */
    class Builder internal constructor() {

        private var color: JsonField<Color>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(optionDecorations: OptionDecorations) = apply {
            color = optionDecorations.color
            additionalProperties = optionDecorations.additionalProperties.toMutableMap()
        }

        fun color(color: Color) = color(JsonField.of(color))

        /**
         * Sets [Builder.color] to an arbitrary JSON value.
         *
         * You should usually call [Builder.color] with a well-typed [Color] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun color(color: JsonField<Color>) = apply { this.color = color }

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
         * Returns an immutable instance of [OptionDecorations].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .color()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptionDecorations =
            OptionDecorations(checkRequired("color", color), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OptionDecorations = apply {
        if (validated) {
            return@apply
        }

        color().validate()
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
    @JvmSynthetic internal fun validity(): Int = (color.asKnown().getOrNull()?.validity() ?: 0)

    class Color @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BLACK = of("BLACK")

            @JvmField val BLUE = of("BLUE")

            @JvmField val BLUE_LIGHT = of("BLUE_LIGHT")

            @JvmField val GRAY = of("GRAY")

            @JvmField val GREEN = of("GREEN")

            @JvmField val GREEN_LIGHT = of("GREEN_LIGHT")

            @JvmField val ORANGE = of("ORANGE")

            @JvmField val ORANGE_LIGHT = of("ORANGE_LIGHT")

            @JvmField val PINK = of("PINK")

            @JvmField val PINK_LIGHT = of("PINK_LIGHT")

            @JvmField val PURPLE = of("PURPLE")

            @JvmField val PURPLE_LIGHT = of("PURPLE_LIGHT")

            @JvmField val RED = of("RED")

            @JvmField val RED_LIGHT = of("RED_LIGHT")

            @JvmField val TEAL = of("TEAL")

            @JvmField val TEAL_LIGHT = of("TEAL_LIGHT")

            @JvmField val YELLOW = of("YELLOW")

            @JvmField val YELLOW_LIGHT = of("YELLOW_LIGHT")

            @JvmStatic fun of(value: String) = Color(JsonField.of(value))
        }

        /** An enum containing [Color]'s known values. */
        enum class Known {
            BLACK,
            BLUE,
            BLUE_LIGHT,
            GRAY,
            GREEN,
            GREEN_LIGHT,
            ORANGE,
            ORANGE_LIGHT,
            PINK,
            PINK_LIGHT,
            PURPLE,
            PURPLE_LIGHT,
            RED,
            RED_LIGHT,
            TEAL,
            TEAL_LIGHT,
            YELLOW,
            YELLOW_LIGHT,
        }

        /**
         * An enum containing [Color]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Color] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BLACK,
            BLUE,
            BLUE_LIGHT,
            GRAY,
            GREEN,
            GREEN_LIGHT,
            ORANGE,
            ORANGE_LIGHT,
            PINK,
            PINK_LIGHT,
            PURPLE,
            PURPLE_LIGHT,
            RED,
            RED_LIGHT,
            TEAL,
            TEAL_LIGHT,
            YELLOW,
            YELLOW_LIGHT,
            /** An enum member indicating that [Color] was instantiated with an unknown value. */
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
                BLACK -> Value.BLACK
                BLUE -> Value.BLUE
                BLUE_LIGHT -> Value.BLUE_LIGHT
                GRAY -> Value.GRAY
                GREEN -> Value.GREEN
                GREEN_LIGHT -> Value.GREEN_LIGHT
                ORANGE -> Value.ORANGE
                ORANGE_LIGHT -> Value.ORANGE_LIGHT
                PINK -> Value.PINK
                PINK_LIGHT -> Value.PINK_LIGHT
                PURPLE -> Value.PURPLE
                PURPLE_LIGHT -> Value.PURPLE_LIGHT
                RED -> Value.RED
                RED_LIGHT -> Value.RED_LIGHT
                TEAL -> Value.TEAL
                TEAL_LIGHT -> Value.TEAL_LIGHT
                YELLOW -> Value.YELLOW
                YELLOW_LIGHT -> Value.YELLOW_LIGHT
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
                BLACK -> Known.BLACK
                BLUE -> Known.BLUE
                BLUE_LIGHT -> Known.BLUE_LIGHT
                GRAY -> Known.GRAY
                GREEN -> Known.GREEN
                GREEN_LIGHT -> Known.GREEN_LIGHT
                ORANGE -> Known.ORANGE
                ORANGE_LIGHT -> Known.ORANGE_LIGHT
                PINK -> Known.PINK
                PINK_LIGHT -> Known.PINK_LIGHT
                PURPLE -> Known.PURPLE
                PURPLE_LIGHT -> Known.PURPLE_LIGHT
                RED -> Known.RED
                RED_LIGHT -> Known.RED_LIGHT
                TEAL -> Known.TEAL
                TEAL_LIGHT -> Known.TEAL_LIGHT
                YELLOW -> Known.YELLOW
                YELLOW_LIGHT -> Known.YELLOW_LIGHT
                else -> throw HubspotInvalidDataException("Unknown Color: $value")
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

        fun validate(): Color = apply {
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

            return other is Color && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptionDecorations &&
            color == other.color &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(color, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OptionDecorations{color=$color, additionalProperties=$additionalProperties}"
}
