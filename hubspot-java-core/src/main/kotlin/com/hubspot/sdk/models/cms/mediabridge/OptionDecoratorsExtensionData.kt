// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

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
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class OptionDecoratorsExtensionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val optionDecorators: JsonField<OptionDecorators>,
    private val optionDecoratorStyle: JsonField<OptionDecoratorStyle>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("optionDecorators")
        @ExcludeMissing
        optionDecorators: JsonField<OptionDecorators> = JsonMissing.of(),
        @JsonProperty("optionDecoratorStyle")
        @ExcludeMissing
        optionDecoratorStyle: JsonField<OptionDecoratorStyle> = JsonMissing.of(),
    ) : this(optionDecorators, optionDecoratorStyle, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optionDecorators(): OptionDecorators = optionDecorators.getRequired("optionDecorators")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optionDecoratorStyle(): OptionDecoratorStyle =
        optionDecoratorStyle.getRequired("optionDecoratorStyle")

    /**
     * Returns the raw JSON value of [optionDecorators].
     *
     * Unlike [optionDecorators], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optionDecorators")
    @ExcludeMissing
    fun _optionDecorators(): JsonField<OptionDecorators> = optionDecorators

    /**
     * Returns the raw JSON value of [optionDecoratorStyle].
     *
     * Unlike [optionDecoratorStyle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optionDecoratorStyle")
    @ExcludeMissing
    fun _optionDecoratorStyle(): JsonField<OptionDecoratorStyle> = optionDecoratorStyle

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
         * [OptionDecoratorsExtensionData].
         *
         * The following fields are required:
         * ```java
         * .optionDecorators()
         * .optionDecoratorStyle()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptionDecoratorsExtensionData]. */
    class Builder internal constructor() {

        private var optionDecorators: JsonField<OptionDecorators>? = null
        private var optionDecoratorStyle: JsonField<OptionDecoratorStyle>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(optionDecoratorsExtensionData: OptionDecoratorsExtensionData) = apply {
            optionDecorators = optionDecoratorsExtensionData.optionDecorators
            optionDecoratorStyle = optionDecoratorsExtensionData.optionDecoratorStyle
            additionalProperties = optionDecoratorsExtensionData.additionalProperties.toMutableMap()
        }

        fun optionDecorators(optionDecorators: OptionDecorators) =
            optionDecorators(JsonField.of(optionDecorators))

        /**
         * Sets [Builder.optionDecorators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionDecorators] with a well-typed [OptionDecorators]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun optionDecorators(optionDecorators: JsonField<OptionDecorators>) = apply {
            this.optionDecorators = optionDecorators
        }

        fun optionDecoratorStyle(optionDecoratorStyle: OptionDecoratorStyle) =
            optionDecoratorStyle(JsonField.of(optionDecoratorStyle))

        /**
         * Sets [Builder.optionDecoratorStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionDecoratorStyle] with a well-typed
         * [OptionDecoratorStyle] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun optionDecoratorStyle(optionDecoratorStyle: JsonField<OptionDecoratorStyle>) = apply {
            this.optionDecoratorStyle = optionDecoratorStyle
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
         * Returns an immutable instance of [OptionDecoratorsExtensionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .optionDecorators()
         * .optionDecoratorStyle()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptionDecoratorsExtensionData =
            OptionDecoratorsExtensionData(
                checkRequired("optionDecorators", optionDecorators),
                checkRequired("optionDecoratorStyle", optionDecoratorStyle),
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
    fun validate(): OptionDecoratorsExtensionData = apply {
        if (validated) {
            return@apply
        }

        optionDecorators().validate()
        optionDecoratorStyle().validate()
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
        (optionDecorators.asKnown().getOrNull()?.validity() ?: 0) +
            (optionDecoratorStyle.asKnown().getOrNull()?.validity() ?: 0)

    class OptionDecorators
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OptionDecorators]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OptionDecorators]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(optionDecorators: OptionDecorators) = apply {
                additionalProperties = optionDecorators.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OptionDecorators].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OptionDecorators = OptionDecorators(additionalProperties.toImmutable())
        }

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
        fun validate(): OptionDecorators = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OptionDecorators && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OptionDecorators{additionalProperties=$additionalProperties}"
    }

    class OptionDecoratorStyle
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LABEL_ONLY = of("LABEL_ONLY")

            @JvmField val LABEL_WITH_BADGE = of("LABEL_WITH_BADGE")

            @JvmField val LABEL_WITH_COLOR = of("LABEL_WITH_COLOR")

            @JvmStatic fun of(value: String) = OptionDecoratorStyle(JsonField.of(value))
        }

        /** An enum containing [OptionDecoratorStyle]'s known values. */
        enum class Known {
            LABEL_ONLY,
            LABEL_WITH_BADGE,
            LABEL_WITH_COLOR,
        }

        /**
         * An enum containing [OptionDecoratorStyle]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [OptionDecoratorStyle] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LABEL_ONLY,
            LABEL_WITH_BADGE,
            LABEL_WITH_COLOR,
            /**
             * An enum member indicating that [OptionDecoratorStyle] was instantiated with an
             * unknown value.
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
                LABEL_ONLY -> Value.LABEL_ONLY
                LABEL_WITH_BADGE -> Value.LABEL_WITH_BADGE
                LABEL_WITH_COLOR -> Value.LABEL_WITH_COLOR
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
                LABEL_ONLY -> Known.LABEL_ONLY
                LABEL_WITH_BADGE -> Known.LABEL_WITH_BADGE
                LABEL_WITH_COLOR -> Known.LABEL_WITH_COLOR
                else -> throw HubSpotInvalidDataException("Unknown OptionDecoratorStyle: $value")
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
        fun validate(): OptionDecoratorStyle = apply {
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

            return other is OptionDecoratorStyle && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptionDecoratorsExtensionData &&
            optionDecorators == other.optionDecorators &&
            optionDecoratorStyle == other.optionDecoratorStyle &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(optionDecorators, optionDecoratorStyle, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OptionDecoratorsExtensionData{optionDecorators=$optionDecorators, optionDecoratorStyle=$optionDecoratorStyle, additionalProperties=$additionalProperties}"
}
