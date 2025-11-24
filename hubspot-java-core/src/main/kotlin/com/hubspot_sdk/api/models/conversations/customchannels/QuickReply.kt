// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

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
import java.util.Optional

class QuickReply
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val value: JsonField<String>,
    private val valueType: JsonField<String>,
    private val label: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valueType") @ExcludeMissing valueType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
    ) : this(value, valueType, label, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valueType(): String = valueType.getRequired("valueType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [valueType].
     *
     * Unlike [valueType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valueType") @ExcludeMissing fun _valueType(): JsonField<String> = valueType

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
         * Returns a mutable builder for constructing an instance of [QuickReply].
         *
         * The following fields are required:
         * ```java
         * .value()
         * .valueType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QuickReply]. */
    class Builder internal constructor() {

        private var value: JsonField<String>? = null
        private var valueType: JsonField<String>? = null
        private var label: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(quickReply: QuickReply) = apply {
            value = quickReply.value
            valueType = quickReply.valueType
            label = quickReply.label
            additionalProperties = quickReply.additionalProperties.toMutableMap()
        }

        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        fun valueType(valueType: String) = valueType(JsonField.of(valueType))

        /**
         * Sets [Builder.valueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun valueType(valueType: JsonField<String>) = apply { this.valueType = valueType }

        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

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
         * Returns an immutable instance of [QuickReply].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .value()
         * .valueType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuickReply =
            QuickReply(
                checkRequired("value", value),
                checkRequired("valueType", valueType),
                label,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QuickReply = apply {
        if (validated) {
            return@apply
        }

        value()
        valueType()
        label()
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
        (if (value.asKnown().isPresent) 1 else 0) +
            (if (valueType.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuickReply &&
            value == other.value &&
            valueType == other.valueType &&
            label == other.label &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(value, valueType, label, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QuickReply{value=$value, valueType=$valueType, label=$label, additionalProperties=$additionalProperties}"
}
