// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicFontStyle
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bold: JsonField<Boolean>,
    private val color: JsonField<String>,
    private val font: JsonField<String>,
    private val italic: JsonField<Boolean>,
    private val size: JsonField<Int>,
    private val underline: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bold") @ExcludeMissing bold: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
        @JsonProperty("font") @ExcludeMissing font: JsonField<String> = JsonMissing.of(),
        @JsonProperty("italic") @ExcludeMissing italic: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("underline") @ExcludeMissing underline: JsonField<Boolean> = JsonMissing.of(),
    ) : this(bold, color, font, italic, size, underline, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bold(): Optional<Boolean> = bold.getOptional("bold")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun color(): Optional<String> = color.getOptional("color")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun font(): Optional<String> = font.getOptional("font")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun italic(): Optional<Boolean> = italic.getOptional("italic")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun size(): Optional<Int> = size.getOptional("size")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun underline(): Optional<Boolean> = underline.getOptional("underline")

    /**
     * Returns the raw JSON value of [bold].
     *
     * Unlike [bold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bold") @ExcludeMissing fun _bold(): JsonField<Boolean> = bold

    /**
     * Returns the raw JSON value of [color].
     *
     * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

    /**
     * Returns the raw JSON value of [font].
     *
     * Unlike [font], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("font") @ExcludeMissing fun _font(): JsonField<String> = font

    /**
     * Returns the raw JSON value of [italic].
     *
     * Unlike [italic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("italic") @ExcludeMissing fun _italic(): JsonField<Boolean> = italic

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Int> = size

    /**
     * Returns the raw JSON value of [underline].
     *
     * Unlike [underline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("underline") @ExcludeMissing fun _underline(): JsonField<Boolean> = underline

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

        /** Returns a mutable builder for constructing an instance of [PublicFontStyle]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicFontStyle]. */
    class Builder internal constructor() {

        private var bold: JsonField<Boolean> = JsonMissing.of()
        private var color: JsonField<String> = JsonMissing.of()
        private var font: JsonField<String> = JsonMissing.of()
        private var italic: JsonField<Boolean> = JsonMissing.of()
        private var size: JsonField<Int> = JsonMissing.of()
        private var underline: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicFontStyle: PublicFontStyle) = apply {
            bold = publicFontStyle.bold
            color = publicFontStyle.color
            font = publicFontStyle.font
            italic = publicFontStyle.italic
            size = publicFontStyle.size
            underline = publicFontStyle.underline
            additionalProperties = publicFontStyle.additionalProperties.toMutableMap()
        }

        fun bold(bold: Boolean) = bold(JsonField.of(bold))

        /**
         * Sets [Builder.bold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bold] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bold(bold: JsonField<Boolean>) = apply { this.bold = bold }

        fun color(color: String) = color(JsonField.of(color))

        /**
         * Sets [Builder.color] to an arbitrary JSON value.
         *
         * You should usually call [Builder.color] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun color(color: JsonField<String>) = apply { this.color = color }

        fun font(font: String) = font(JsonField.of(font))

        /**
         * Sets [Builder.font] to an arbitrary JSON value.
         *
         * You should usually call [Builder.font] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun font(font: JsonField<String>) = apply { this.font = font }

        fun italic(italic: Boolean) = italic(JsonField.of(italic))

        /**
         * Sets [Builder.italic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.italic] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun italic(italic: JsonField<Boolean>) = apply { this.italic = italic }

        fun size(size: Int) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Int>) = apply { this.size = size }

        fun underline(underline: Boolean) = underline(JsonField.of(underline))

        /**
         * Sets [Builder.underline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underline] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun underline(underline: JsonField<Boolean>) = apply { this.underline = underline }

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
         * Returns an immutable instance of [PublicFontStyle].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicFontStyle =
            PublicFontStyle(
                bold,
                color,
                font,
                italic,
                size,
                underline,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicFontStyle = apply {
        if (validated) {
            return@apply
        }

        bold()
        color()
        font()
        italic()
        size()
        underline()
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
        (if (bold.asKnown().isPresent) 1 else 0) +
            (if (color.asKnown().isPresent) 1 else 0) +
            (if (font.asKnown().isPresent) 1 else 0) +
            (if (italic.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (if (underline.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicFontStyle &&
            bold == other.bold &&
            color == other.color &&
            font == other.font &&
            italic == other.italic &&
            size == other.size &&
            underline == other.underline &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bold, color, font, italic, size, underline, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicFontStyle{bold=$bold, color=$color, font=$font, italic=$italic, size=$size, underline=$underline, additionalProperties=$additionalProperties}"
}
