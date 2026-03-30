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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class RgbaColor
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val a: JsonField<Double>,
    private val b: JsonField<Int>,
    private val g: JsonField<Int>,
    private val r: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("a") @ExcludeMissing a: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("b") @ExcludeMissing b: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("g") @ExcludeMissing g: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("r") @ExcludeMissing r: JsonField<Int> = JsonMissing.of(),
    ) : this(a, b, g, r, mutableMapOf())

    /**
     * Alpha.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun a(): Double = a.getRequired("a")

    /**
     * Blue.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun b(): Int = b.getRequired("b")

    /**
     * Green.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun g(): Int = g.getRequired("g")

    /**
     * Red.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun r(): Int = r.getRequired("r")

    /**
     * Returns the raw JSON value of [a].
     *
     * Unlike [a], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("a") @ExcludeMissing fun _a(): JsonField<Double> = a

    /**
     * Returns the raw JSON value of [b].
     *
     * Unlike [b], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("b") @ExcludeMissing fun _b(): JsonField<Int> = b

    /**
     * Returns the raw JSON value of [g].
     *
     * Unlike [g], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("g") @ExcludeMissing fun _g(): JsonField<Int> = g

    /**
     * Returns the raw JSON value of [r].
     *
     * Unlike [r], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("r") @ExcludeMissing fun _r(): JsonField<Int> = r

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
         * Returns a mutable builder for constructing an instance of [RgbaColor].
         *
         * The following fields are required:
         * ```java
         * .a()
         * .b()
         * .g()
         * .r()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RgbaColor]. */
    class Builder internal constructor() {

        private var a: JsonField<Double>? = null
        private var b: JsonField<Int>? = null
        private var g: JsonField<Int>? = null
        private var r: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rgbaColor: RgbaColor) = apply {
            a = rgbaColor.a
            b = rgbaColor.b
            g = rgbaColor.g
            r = rgbaColor.r
            additionalProperties = rgbaColor.additionalProperties.toMutableMap()
        }

        /** Alpha. */
        fun a(a: Double) = a(JsonField.of(a))

        /**
         * Sets [Builder.a] to an arbitrary JSON value.
         *
         * You should usually call [Builder.a] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun a(a: JsonField<Double>) = apply { this.a = a }

        /** Blue. */
        fun b(b: Int) = b(JsonField.of(b))

        /**
         * Sets [Builder.b] to an arbitrary JSON value.
         *
         * You should usually call [Builder.b] with a well-typed [Int] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun b(b: JsonField<Int>) = apply { this.b = b }

        /** Green. */
        fun g(g: Int) = g(JsonField.of(g))

        /**
         * Sets [Builder.g] to an arbitrary JSON value.
         *
         * You should usually call [Builder.g] with a well-typed [Int] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun g(g: JsonField<Int>) = apply { this.g = g }

        /** Red. */
        fun r(r: Int) = r(JsonField.of(r))

        /**
         * Sets [Builder.r] to an arbitrary JSON value.
         *
         * You should usually call [Builder.r] with a well-typed [Int] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun r(r: JsonField<Int>) = apply { this.r = r }

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
         * Returns an immutable instance of [RgbaColor].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .a()
         * .b()
         * .g()
         * .r()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RgbaColor =
            RgbaColor(
                checkRequired("a", a),
                checkRequired("b", b),
                checkRequired("g", g),
                checkRequired("r", r),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RgbaColor = apply {
        if (validated) {
            return@apply
        }

        a()
        b()
        g()
        r()
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
        (if (a.asKnown().isPresent) 1 else 0) +
            (if (b.asKnown().isPresent) 1 else 0) +
            (if (g.asKnown().isPresent) 1 else 0) +
            (if (r.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RgbaColor &&
            a == other.a &&
            b == other.b &&
            g == other.g &&
            r == other.r &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(a, b, g, r, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RgbaColor{a=$a, b=$b, g=$g, r=$r, additionalProperties=$additionalProperties}"
}
