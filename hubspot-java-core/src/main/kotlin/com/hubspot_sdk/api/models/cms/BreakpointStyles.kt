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

class BreakpointStyles
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hidden: JsonField<Boolean>,
    private val margin: JsonField<Margin>,
    private val padding: JsonField<Padding>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("margin") @ExcludeMissing margin: JsonField<Margin> = JsonMissing.of(),
        @JsonProperty("padding") @ExcludeMissing padding: JsonField<Padding> = JsonMissing.of(),
    ) : this(hidden, margin, padding, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hidden(): Boolean = hidden.getRequired("hidden")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun margin(): Margin = margin.getRequired("margin")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun padding(): Padding = padding.getRequired("padding")

    /**
     * Returns the raw JSON value of [hidden].
     *
     * Unlike [hidden], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hidden") @ExcludeMissing fun _hidden(): JsonField<Boolean> = hidden

    /**
     * Returns the raw JSON value of [margin].
     *
     * Unlike [margin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("margin") @ExcludeMissing fun _margin(): JsonField<Margin> = margin

    /**
     * Returns the raw JSON value of [padding].
     *
     * Unlike [padding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("padding") @ExcludeMissing fun _padding(): JsonField<Padding> = padding

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
         * Returns a mutable builder for constructing an instance of [BreakpointStyles].
         *
         * The following fields are required:
         * ```java
         * .hidden()
         * .margin()
         * .padding()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BreakpointStyles]. */
    class Builder internal constructor() {

        private var hidden: JsonField<Boolean>? = null
        private var margin: JsonField<Margin>? = null
        private var padding: JsonField<Padding>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(breakpointStyles: BreakpointStyles) = apply {
            hidden = breakpointStyles.hidden
            margin = breakpointStyles.margin
            padding = breakpointStyles.padding
            additionalProperties = breakpointStyles.additionalProperties.toMutableMap()
        }

        fun hidden(hidden: Boolean) = hidden(JsonField.of(hidden))

        /**
         * Sets [Builder.hidden] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hidden(hidden: JsonField<Boolean>) = apply { this.hidden = hidden }

        fun margin(margin: Margin) = margin(JsonField.of(margin))

        /**
         * Sets [Builder.margin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.margin] with a well-typed [Margin] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun margin(margin: JsonField<Margin>) = apply { this.margin = margin }

        fun padding(padding: Padding) = padding(JsonField.of(padding))

        /**
         * Sets [Builder.padding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.padding] with a well-typed [Padding] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun padding(padding: JsonField<Padding>) = apply { this.padding = padding }

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
         * Returns an immutable instance of [BreakpointStyles].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hidden()
         * .margin()
         * .padding()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BreakpointStyles =
            BreakpointStyles(
                checkRequired("hidden", hidden),
                checkRequired("margin", margin),
                checkRequired("padding", padding),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BreakpointStyles = apply {
        if (validated) {
            return@apply
        }

        hidden()
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
    @JvmSynthetic internal fun validity(): Int = (if (hidden.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BreakpointStyles &&
            hidden == other.hidden &&
            margin == other.margin &&
            padding == other.padding &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hidden, margin, padding, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BreakpointStyles{hidden=$hidden, margin=$margin, padding=$padding, additionalProperties=$additionalProperties}"
}
