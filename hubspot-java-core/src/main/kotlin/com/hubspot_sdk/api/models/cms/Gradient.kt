// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class Gradient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val angle: JsonField<Angle>,
    private val colors: JsonField<List<ColorStop>>,
    private val sideOrCorner: JsonField<SideOrCorner>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("angle") @ExcludeMissing angle: JsonField<Angle> = JsonMissing.of(),
        @JsonProperty("colors")
        @ExcludeMissing
        colors: JsonField<List<ColorStop>> = JsonMissing.of(),
        @JsonProperty("sideOrCorner")
        @ExcludeMissing
        sideOrCorner: JsonField<SideOrCorner> = JsonMissing.of(),
    ) : this(angle, colors, sideOrCorner, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun angle(): Angle = angle.getRequired("angle")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun colors(): List<ColorStop> = colors.getRequired("colors")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sideOrCorner(): SideOrCorner = sideOrCorner.getRequired("sideOrCorner")

    /**
     * Returns the raw JSON value of [angle].
     *
     * Unlike [angle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("angle") @ExcludeMissing fun _angle(): JsonField<Angle> = angle

    /**
     * Returns the raw JSON value of [colors].
     *
     * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<List<ColorStop>> = colors

    /**
     * Returns the raw JSON value of [sideOrCorner].
     *
     * Unlike [sideOrCorner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sideOrCorner")
    @ExcludeMissing
    fun _sideOrCorner(): JsonField<SideOrCorner> = sideOrCorner

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
         * Returns a mutable builder for constructing an instance of [Gradient].
         *
         * The following fields are required:
         * ```java
         * .angle()
         * .colors()
         * .sideOrCorner()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Gradient]. */
    class Builder internal constructor() {

        private var angle: JsonField<Angle>? = null
        private var colors: JsonField<MutableList<ColorStop>>? = null
        private var sideOrCorner: JsonField<SideOrCorner>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(gradient: Gradient) = apply {
            angle = gradient.angle
            colors = gradient.colors.map { it.toMutableList() }
            sideOrCorner = gradient.sideOrCorner
            additionalProperties = gradient.additionalProperties.toMutableMap()
        }

        fun angle(angle: Angle) = angle(JsonField.of(angle))

        /**
         * Sets [Builder.angle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.angle] with a well-typed [Angle] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun angle(angle: JsonField<Angle>) = apply { this.angle = angle }

        fun colors(colors: List<ColorStop>) = colors(JsonField.of(colors))

        /**
         * Sets [Builder.colors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colors] with a well-typed `List<ColorStop>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun colors(colors: JsonField<List<ColorStop>>) = apply {
            this.colors = colors.map { it.toMutableList() }
        }

        /**
         * Adds a single [ColorStop] to [colors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColor(color: ColorStop) = apply {
            colors =
                (colors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("colors", it).add(color)
                }
        }

        fun sideOrCorner(sideOrCorner: SideOrCorner) = sideOrCorner(JsonField.of(sideOrCorner))

        /**
         * Sets [Builder.sideOrCorner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sideOrCorner] with a well-typed [SideOrCorner] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sideOrCorner(sideOrCorner: JsonField<SideOrCorner>) = apply {
            this.sideOrCorner = sideOrCorner
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
         * Returns an immutable instance of [Gradient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .angle()
         * .colors()
         * .sideOrCorner()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Gradient =
            Gradient(
                checkRequired("angle", angle),
                checkRequired("colors", colors).map { it.toImmutable() },
                checkRequired("sideOrCorner", sideOrCorner),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Gradient = apply {
        if (validated) {
            return@apply
        }

        angle().validate()
        colors().forEach { it.validate() }
        sideOrCorner().validate()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (angle.asKnown().getOrNull()?.validity() ?: 0) +
            (colors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (sideOrCorner.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Gradient &&
            angle == other.angle &&
            colors == other.colors &&
            sideOrCorner == other.sideOrCorner &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(angle, colors, sideOrCorner, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Gradient{angle=$angle, colors=$colors, sideOrCorner=$sideOrCorner, additionalProperties=$additionalProperties}"
}
