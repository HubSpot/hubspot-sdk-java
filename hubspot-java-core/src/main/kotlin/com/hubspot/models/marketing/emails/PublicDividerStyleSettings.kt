// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicDividerStyleSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val color: JsonValue,
    private val height: JsonField<Int>,
    private val lineType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("color") @ExcludeMissing color: JsonValue = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("lineType") @ExcludeMissing lineType: JsonField<String> = JsonMissing.of(),
    ) : this(color, height, lineType, mutableMapOf())

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = publicDividerStyleSettings.color().convert(MyClass.class);
     * ```
     */
    @JsonProperty("color") @ExcludeMissing fun _color(): JsonValue = color

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Int> = height.getOptional("height")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineType(): Optional<String> = lineType.getOptional("lineType")

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Int> = height

    /**
     * Returns the raw JSON value of [lineType].
     *
     * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineType") @ExcludeMissing fun _lineType(): JsonField<String> = lineType

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
         * Returns a mutable builder for constructing an instance of [PublicDividerStyleSettings].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicDividerStyleSettings]. */
    class Builder internal constructor() {

        private var color: JsonValue = JsonMissing.of()
        private var height: JsonField<Int> = JsonMissing.of()
        private var lineType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicDividerStyleSettings: PublicDividerStyleSettings) = apply {
            color = publicDividerStyleSettings.color
            height = publicDividerStyleSettings.height
            lineType = publicDividerStyleSettings.lineType
            additionalProperties = publicDividerStyleSettings.additionalProperties.toMutableMap()
        }

        fun color(color: JsonValue) = apply { this.color = color }

        fun height(height: Int) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Int>) = apply { this.height = height }

        fun lineType(lineType: String) = lineType(JsonField.of(lineType))

        /**
         * Sets [Builder.lineType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lineType(lineType: JsonField<String>) = apply { this.lineType = lineType }

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
         * Returns an immutable instance of [PublicDividerStyleSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicDividerStyleSettings =
            PublicDividerStyleSettings(color, height, lineType, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PublicDividerStyleSettings = apply {
        if (validated) {
            return@apply
        }

        height()
        lineType()
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
        (if (height.asKnown().isPresent) 1 else 0) + (if (lineType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDividerStyleSettings &&
            color == other.color &&
            height == other.height &&
            lineType == other.lineType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(color, height, lineType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicDividerStyleSettings{color=$color, height=$height, lineType=$lineType, additionalProperties=$additionalProperties}"
}
