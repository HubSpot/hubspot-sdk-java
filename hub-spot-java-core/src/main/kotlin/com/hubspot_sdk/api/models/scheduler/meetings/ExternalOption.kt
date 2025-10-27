// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

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

class ExternalOption
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val displayOrder: JsonField<Int>,
    private val doubleData: JsonField<Double>,
    private val hidden: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("doubleData")
        @ExcludeMissing
        doubleData: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("readOnly") @ExcludeMissing readOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(description, displayOrder, doubleData, hidden, label, readOnly, value, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayOrder(): Int = displayOrder.getRequired("displayOrder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun doubleData(): Double = doubleData.getRequired("doubleData")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hidden(): Boolean = hidden.getRequired("hidden")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readOnly(): Boolean = readOnly.getRequired("readOnly")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayOrder") @ExcludeMissing fun _displayOrder(): JsonField<Int> = displayOrder

    /**
     * Returns the raw JSON value of [doubleData].
     *
     * Unlike [doubleData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doubleData") @ExcludeMissing fun _doubleData(): JsonField<Double> = doubleData

    /**
     * Returns the raw JSON value of [hidden].
     *
     * Unlike [hidden], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hidden") @ExcludeMissing fun _hidden(): JsonField<Boolean> = hidden

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [readOnly].
     *
     * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readOnly") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [ExternalOption].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .displayOrder()
         * .doubleData()
         * .hidden()
         * .label()
         * .readOnly()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalOption]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var displayOrder: JsonField<Int>? = null
        private var doubleData: JsonField<Double>? = null
        private var hidden: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var readOnly: JsonField<Boolean>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalOption: ExternalOption) = apply {
            description = externalOption.description
            displayOrder = externalOption.displayOrder
            doubleData = externalOption.doubleData
            hidden = externalOption.hidden
            label = externalOption.label
            readOnly = externalOption.readOnly
            value = externalOption.value
            additionalProperties = externalOption.additionalProperties.toMutableMap()
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        fun doubleData(doubleData: Double) = doubleData(JsonField.of(doubleData))

        /**
         * Sets [Builder.doubleData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doubleData] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun doubleData(doubleData: JsonField<Double>) = apply { this.doubleData = doubleData }

        fun hidden(hidden: Boolean) = hidden(JsonField.of(hidden))

        /**
         * Sets [Builder.hidden] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hidden(hidden: JsonField<Boolean>) = apply { this.hidden = hidden }

        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

        /**
         * Sets [Builder.readOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [ExternalOption].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .displayOrder()
         * .doubleData()
         * .hidden()
         * .label()
         * .readOnly()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalOption =
            ExternalOption(
                checkRequired("description", description),
                checkRequired("displayOrder", displayOrder),
                checkRequired("doubleData", doubleData),
                checkRequired("hidden", hidden),
                checkRequired("label", label),
                checkRequired("readOnly", readOnly),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalOption = apply {
        if (validated) {
            return@apply
        }

        description()
        displayOrder()
        doubleData()
        hidden()
        label()
        readOnly()
        value()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (if (doubleData.asKnown().isPresent) 1 else 0) +
            (if (hidden.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (readOnly.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalOption &&
            description == other.description &&
            displayOrder == other.displayOrder &&
            doubleData == other.doubleData &&
            hidden == other.hidden &&
            label == other.label &&
            readOnly == other.readOnly &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            displayOrder,
            doubleData,
            hidden,
            label,
            readOnly,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalOption{description=$description, displayOrder=$displayOrder, doubleData=$doubleData, hidden=$hidden, label=$label, readOnly=$readOnly, value=$value, additionalProperties=$additionalProperties}"
}
