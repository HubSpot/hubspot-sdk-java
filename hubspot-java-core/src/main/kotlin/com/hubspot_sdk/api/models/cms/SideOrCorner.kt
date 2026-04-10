// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SideOrCorner
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val horizontalSide: JsonField<HorizontalSide>,
    private val verticalSide: JsonField<VerticalSide>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("horizontalSide")
        @ExcludeMissing
        horizontalSide: JsonField<HorizontalSide> = JsonMissing.of(),
        @JsonProperty("verticalSide")
        @ExcludeMissing
        verticalSide: JsonField<VerticalSide> = JsonMissing.of(),
    ) : this(horizontalSide, verticalSide, mutableMapOf())

    /**
     * Specifies the horizontal side of an element.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun horizontalSide(): HorizontalSide = horizontalSide.getRequired("horizontalSide")

    /**
     * Specifies the vertical side of an element.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verticalSide(): VerticalSide = verticalSide.getRequired("verticalSide")

    /**
     * Returns the raw JSON value of [horizontalSide].
     *
     * Unlike [horizontalSide], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("horizontalSide")
    @ExcludeMissing
    fun _horizontalSide(): JsonField<HorizontalSide> = horizontalSide

    /**
     * Returns the raw JSON value of [verticalSide].
     *
     * Unlike [verticalSide], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verticalSide")
    @ExcludeMissing
    fun _verticalSide(): JsonField<VerticalSide> = verticalSide

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
         * Returns a mutable builder for constructing an instance of [SideOrCorner].
         *
         * The following fields are required:
         * ```java
         * .horizontalSide()
         * .verticalSide()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SideOrCorner]. */
    class Builder internal constructor() {

        private var horizontalSide: JsonField<HorizontalSide>? = null
        private var verticalSide: JsonField<VerticalSide>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sideOrCorner: SideOrCorner) = apply {
            horizontalSide = sideOrCorner.horizontalSide
            verticalSide = sideOrCorner.verticalSide
            additionalProperties = sideOrCorner.additionalProperties.toMutableMap()
        }

        /** Specifies the horizontal side of an element. */
        fun horizontalSide(horizontalSide: HorizontalSide) =
            horizontalSide(JsonField.of(horizontalSide))

        /**
         * Sets [Builder.horizontalSide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.horizontalSide] with a well-typed [HorizontalSide] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun horizontalSide(horizontalSide: JsonField<HorizontalSide>) = apply {
            this.horizontalSide = horizontalSide
        }

        /** Specifies the vertical side of an element. */
        fun verticalSide(verticalSide: VerticalSide) = verticalSide(JsonField.of(verticalSide))

        /**
         * Sets [Builder.verticalSide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verticalSide] with a well-typed [VerticalSide] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verticalSide(verticalSide: JsonField<VerticalSide>) = apply {
            this.verticalSide = verticalSide
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
         * Returns an immutable instance of [SideOrCorner].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .horizontalSide()
         * .verticalSide()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SideOrCorner =
            SideOrCorner(
                checkRequired("horizontalSide", horizontalSide),
                checkRequired("verticalSide", verticalSide),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SideOrCorner = apply {
        if (validated) {
            return@apply
        }

        horizontalSide().validate()
        verticalSide().validate()
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
        (horizontalSide.asKnown().getOrNull()?.validity() ?: 0) +
            (verticalSide.asKnown().getOrNull()?.validity() ?: 0)

    /** Specifies the horizontal side of an element. */
    class HorizontalSide @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CENTER = of("CENTER")

            @JvmField val LEFT = of("LEFT")

            @JvmField val RIGHT = of("RIGHT")

            @JvmStatic fun of(value: String) = HorizontalSide(JsonField.of(value))
        }

        /** An enum containing [HorizontalSide]'s known values. */
        enum class Known {
            CENTER,
            LEFT,
            RIGHT,
        }

        /**
         * An enum containing [HorizontalSide]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HorizontalSide] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CENTER,
            LEFT,
            RIGHT,
            /**
             * An enum member indicating that [HorizontalSide] was instantiated with an unknown
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
                CENTER -> Value.CENTER
                LEFT -> Value.LEFT
                RIGHT -> Value.RIGHT
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
                CENTER -> Known.CENTER
                LEFT -> Known.LEFT
                RIGHT -> Known.RIGHT
                else -> throw HubSpotInvalidDataException("Unknown HorizontalSide: $value")
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

        fun validate(): HorizontalSide = apply {
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

            return other is HorizontalSide && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specifies the vertical side of an element. */
    class VerticalSide @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val BOTTOM = of("BOTTOM")

            @JvmField val MIDDLE = of("MIDDLE")

            @JvmField val TOP = of("TOP")

            @JvmStatic fun of(value: String) = VerticalSide(JsonField.of(value))
        }

        /** An enum containing [VerticalSide]'s known values. */
        enum class Known {
            BOTTOM,
            MIDDLE,
            TOP,
        }

        /**
         * An enum containing [VerticalSide]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerticalSide] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOTTOM,
            MIDDLE,
            TOP,
            /**
             * An enum member indicating that [VerticalSide] was instantiated with an unknown value.
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
                BOTTOM -> Value.BOTTOM
                MIDDLE -> Value.MIDDLE
                TOP -> Value.TOP
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
                BOTTOM -> Known.BOTTOM
                MIDDLE -> Known.MIDDLE
                TOP -> Known.TOP
                else -> throw HubSpotInvalidDataException("Unknown VerticalSide: $value")
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

        fun validate(): VerticalSide = apply {
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

            return other is VerticalSide && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SideOrCorner &&
            horizontalSide == other.horizontalSide &&
            verticalSide == other.verticalSide &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(horizontalSide, verticalSide, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SideOrCorner{horizontalSide=$horizontalSide, verticalSide=$verticalSide, additionalProperties=$additionalProperties}"
}
