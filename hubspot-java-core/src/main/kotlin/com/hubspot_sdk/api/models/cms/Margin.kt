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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class Margin
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bottom: JsonField<Size>,
    private val top: JsonField<Size>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bottom") @ExcludeMissing bottom: JsonField<Size> = JsonMissing.of(),
        @JsonProperty("top") @ExcludeMissing top: JsonField<Size> = JsonMissing.of(),
    ) : this(bottom, top, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bottom(): Size = bottom.getRequired("bottom")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun top(): Size = top.getRequired("top")

    /**
     * Returns the raw JSON value of [bottom].
     *
     * Unlike [bottom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bottom") @ExcludeMissing fun _bottom(): JsonField<Size> = bottom

    /**
     * Returns the raw JSON value of [top].
     *
     * Unlike [top], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top") @ExcludeMissing fun _top(): JsonField<Size> = top

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
         * Returns a mutable builder for constructing an instance of [Margin].
         *
         * The following fields are required:
         * ```java
         * .bottom()
         * .top()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Margin]. */
    class Builder internal constructor() {

        private var bottom: JsonField<Size>? = null
        private var top: JsonField<Size>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(margin: Margin) = apply {
            bottom = margin.bottom
            top = margin.top
            additionalProperties = margin.additionalProperties.toMutableMap()
        }

        fun bottom(bottom: Size) = bottom(JsonField.of(bottom))

        /**
         * Sets [Builder.bottom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bottom] with a well-typed [Size] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bottom(bottom: JsonField<Size>) = apply { this.bottom = bottom }

        fun top(top: Size) = top(JsonField.of(top))

        /**
         * Sets [Builder.top] to an arbitrary JSON value.
         *
         * You should usually call [Builder.top] with a well-typed [Size] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun top(top: JsonField<Size>) = apply { this.top = top }

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
         * Returns an immutable instance of [Margin].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bottom()
         * .top()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Margin =
            Margin(
                checkRequired("bottom", bottom),
                checkRequired("top", top),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Margin = apply {
        if (validated) {
            return@apply
        }

        bottom().validate()
        top().validate()
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
        (bottom.asKnown().getOrNull()?.validity() ?: 0) +
            (top.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Margin &&
            bottom == other.bottom &&
            top == other.top &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(bottom, top, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Margin{bottom=$bottom, top=$top, additionalProperties=$additionalProperties}"
}
