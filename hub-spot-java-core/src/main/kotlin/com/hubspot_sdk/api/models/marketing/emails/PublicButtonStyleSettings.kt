// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicButtonStyleSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val backgroundColor: JsonValue,
    private val cornerRadius: JsonField<Int>,
    private val fontStyle: JsonField<PublicFontStyle>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("backgroundColor")
        @ExcludeMissing
        backgroundColor: JsonValue = JsonMissing.of(),
        @JsonProperty("cornerRadius")
        @ExcludeMissing
        cornerRadius: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fontStyle")
        @ExcludeMissing
        fontStyle: JsonField<PublicFontStyle> = JsonMissing.of(),
    ) : this(backgroundColor, cornerRadius, fontStyle, mutableMapOf())

    @JsonProperty("backgroundColor")
    @ExcludeMissing
    fun _backgroundColor(): JsonValue = backgroundColor

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cornerRadius(): Optional<Int> = cornerRadius.getOptional("cornerRadius")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fontStyle(): Optional<PublicFontStyle> = fontStyle.getOptional("fontStyle")

    /**
     * Returns the raw JSON value of [cornerRadius].
     *
     * Unlike [cornerRadius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cornerRadius") @ExcludeMissing fun _cornerRadius(): JsonField<Int> = cornerRadius

    /**
     * Returns the raw JSON value of [fontStyle].
     *
     * Unlike [fontStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fontStyle")
    @ExcludeMissing
    fun _fontStyle(): JsonField<PublicFontStyle> = fontStyle

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
         * Returns a mutable builder for constructing an instance of [PublicButtonStyleSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicButtonStyleSettings]. */
    class Builder internal constructor() {

        private var backgroundColor: JsonValue = JsonMissing.of()
        private var cornerRadius: JsonField<Int> = JsonMissing.of()
        private var fontStyle: JsonField<PublicFontStyle> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicButtonStyleSettings: PublicButtonStyleSettings) = apply {
            backgroundColor = publicButtonStyleSettings.backgroundColor
            cornerRadius = publicButtonStyleSettings.cornerRadius
            fontStyle = publicButtonStyleSettings.fontStyle
            additionalProperties = publicButtonStyleSettings.additionalProperties.toMutableMap()
        }

        fun backgroundColor(backgroundColor: JsonValue) = apply {
            this.backgroundColor = backgroundColor
        }

        fun cornerRadius(cornerRadius: Int) = cornerRadius(JsonField.of(cornerRadius))

        /**
         * Sets [Builder.cornerRadius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cornerRadius] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cornerRadius(cornerRadius: JsonField<Int>) = apply { this.cornerRadius = cornerRadius }

        fun fontStyle(fontStyle: PublicFontStyle) = fontStyle(JsonField.of(fontStyle))

        /**
         * Sets [Builder.fontStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontStyle] with a well-typed [PublicFontStyle] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fontStyle(fontStyle: JsonField<PublicFontStyle>) = apply { this.fontStyle = fontStyle }

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
         * Returns an immutable instance of [PublicButtonStyleSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicButtonStyleSettings =
            PublicButtonStyleSettings(
                backgroundColor,
                cornerRadius,
                fontStyle,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicButtonStyleSettings = apply {
        if (validated) {
            return@apply
        }

        cornerRadius()
        fontStyle().ifPresent { it.validate() }
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
        (if (cornerRadius.asKnown().isPresent) 1 else 0) +
            (fontStyle.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicButtonStyleSettings &&
            backgroundColor == other.backgroundColor &&
            cornerRadius == other.cornerRadius &&
            fontStyle == other.fontStyle &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(backgroundColor, cornerRadius, fontStyle, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicButtonStyleSettings{backgroundColor=$backgroundColor, cornerRadius=$cornerRadius, fontStyle=$fontStyle, additionalProperties=$additionalProperties}"
}
