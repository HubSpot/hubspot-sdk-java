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
import java.util.Optional

class ExternalValidatedFormField
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isCustom: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val value: JsonField<String>,
    private val fieldType: JsonField<String>,
    private val translatedLabel: JsonField<String>,
    private val valueLabel: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isCustom") @ExcludeMissing isCustom: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fieldType") @ExcludeMissing fieldType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("translatedLabel")
        @ExcludeMissing
        translatedLabel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valueLabel") @ExcludeMissing valueLabel: JsonField<String> = JsonMissing.of(),
    ) : this(isCustom, label, name, value, fieldType, translatedLabel, valueLabel, mutableMapOf())

    /**
     * Whether the form field is a custom field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCustom(): Boolean = isCustom.getRequired("isCustom")

    /**
     * The text label associated with the form field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The name identifier for the form field, includes underscores in place of spaces (e.g., the
     * label `my form` is converted to `my_form`).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The value associated with the form field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * The specific input type of the form field. Corresponds to property types (e.g., `select`,
     * `radio`, `date`, etc).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldType(): Optional<String> = fieldType.getOptional("fieldType")

    /**
     * The translated text label for the form field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun translatedLabel(): Optional<String> = translatedLabel.getOptional("translatedLabel")

    /**
     * The text label associated to a form field selection or option.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valueLabel(): Optional<String> = valueLabel.getOptional("valueLabel")

    /**
     * Returns the raw JSON value of [isCustom].
     *
     * Unlike [isCustom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isCustom") @ExcludeMissing fun _isCustom(): JsonField<Boolean> = isCustom

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<String> = fieldType

    /**
     * Returns the raw JSON value of [translatedLabel].
     *
     * Unlike [translatedLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("translatedLabel")
    @ExcludeMissing
    fun _translatedLabel(): JsonField<String> = translatedLabel

    /**
     * Returns the raw JSON value of [valueLabel].
     *
     * Unlike [valueLabel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valueLabel") @ExcludeMissing fun _valueLabel(): JsonField<String> = valueLabel

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
         * Returns a mutable builder for constructing an instance of [ExternalValidatedFormField].
         *
         * The following fields are required:
         * ```java
         * .isCustom()
         * .label()
         * .name()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalValidatedFormField]. */
    class Builder internal constructor() {

        private var isCustom: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var value: JsonField<String>? = null
        private var fieldType: JsonField<String> = JsonMissing.of()
        private var translatedLabel: JsonField<String> = JsonMissing.of()
        private var valueLabel: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalValidatedFormField: ExternalValidatedFormField) = apply {
            isCustom = externalValidatedFormField.isCustom
            label = externalValidatedFormField.label
            name = externalValidatedFormField.name
            value = externalValidatedFormField.value
            fieldType = externalValidatedFormField.fieldType
            translatedLabel = externalValidatedFormField.translatedLabel
            valueLabel = externalValidatedFormField.valueLabel
            additionalProperties = externalValidatedFormField.additionalProperties.toMutableMap()
        }

        /** Whether the form field is a custom field. */
        fun isCustom(isCustom: Boolean) = isCustom(JsonField.of(isCustom))

        /**
         * Sets [Builder.isCustom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCustom] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCustom(isCustom: JsonField<Boolean>) = apply { this.isCustom = isCustom }

        /** The text label associated with the form field. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * The name identifier for the form field, includes underscores in place of spaces (e.g.,
         * the label `my form` is converted to `my_form`).
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The value associated with the form field. */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        /**
         * The specific input type of the form field. Corresponds to property types (e.g., `select`,
         * `radio`, `date`, etc).
         */
        fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<String>) = apply { this.fieldType = fieldType }

        /** The translated text label for the form field. */
        fun translatedLabel(translatedLabel: String) =
            translatedLabel(JsonField.of(translatedLabel))

        /**
         * Sets [Builder.translatedLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.translatedLabel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun translatedLabel(translatedLabel: JsonField<String>) = apply {
            this.translatedLabel = translatedLabel
        }

        /** The text label associated to a form field selection or option. */
        fun valueLabel(valueLabel: String) = valueLabel(JsonField.of(valueLabel))

        /**
         * Sets [Builder.valueLabel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueLabel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun valueLabel(valueLabel: JsonField<String>) = apply { this.valueLabel = valueLabel }

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
         * Returns an immutable instance of [ExternalValidatedFormField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isCustom()
         * .label()
         * .name()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalValidatedFormField =
            ExternalValidatedFormField(
                checkRequired("isCustom", isCustom),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("value", value),
                fieldType,
                translatedLabel,
                valueLabel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalValidatedFormField = apply {
        if (validated) {
            return@apply
        }

        isCustom()
        label()
        name()
        value()
        fieldType()
        translatedLabel()
        valueLabel()
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
        (if (isCustom.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (if (fieldType.asKnown().isPresent) 1 else 0) +
            (if (translatedLabel.asKnown().isPresent) 1 else 0) +
            (if (valueLabel.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalValidatedFormField &&
            isCustom == other.isCustom &&
            label == other.label &&
            name == other.name &&
            value == other.value &&
            fieldType == other.fieldType &&
            translatedLabel == other.translatedLabel &&
            valueLabel == other.valueLabel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            isCustom,
            label,
            name,
            value,
            fieldType,
            translatedLabel,
            valueLabel,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalValidatedFormField{isCustom=$isCustom, label=$label, name=$name, value=$value, fieldType=$fieldType, translatedLabel=$translatedLabel, valueLabel=$valueLabel, additionalProperties=$additionalProperties}"
}
