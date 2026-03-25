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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ExternalLinkFormField
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldType: JsonField<String>,
    private val isCustom: JsonField<Boolean>,
    private val isRequired: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val options: JsonField<List<ExternalOption>>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fieldType") @ExcludeMissing fieldType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isCustom") @ExcludeMissing isCustom: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isRequired")
        @ExcludeMissing
        isRequired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<ExternalOption>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(fieldType, isCustom, isRequired, label, name, options, type, mutableMapOf())

    /**
     * The specific field type of the form field. Corresponds to property types (e.g., `select`,
     * `radio`, `date`, etc)
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldType(): String = fieldType.getRequired("fieldType")

    /**
     * Whether the form field is a custom field.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCustom(): Boolean = isCustom.getRequired("isCustom")

    /**
     * Whether the form field is mandatory.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRequired(): Boolean = isRequired.getRequired("isRequired")

    /**
     * The text label for the form field.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The name identifier for the form field.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<ExternalOption> = options.getRequired("options")

    /**
     * The data type of the form field accepts (e.g. `date`, `enumeration`, etc)
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<String> = fieldType

    /**
     * Returns the raw JSON value of [isCustom].
     *
     * Unlike [isCustom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isCustom") @ExcludeMissing fun _isCustom(): JsonField<Boolean> = isCustom

    /**
     * Returns the raw JSON value of [isRequired].
     *
     * Unlike [isRequired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isRequired") @ExcludeMissing fun _isRequired(): JsonField<Boolean> = isRequired

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
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options")
    @ExcludeMissing
    fun _options(): JsonField<List<ExternalOption>> = options

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [ExternalLinkFormField].
         *
         * The following fields are required:
         * ```java
         * .fieldType()
         * .isCustom()
         * .isRequired()
         * .label()
         * .name()
         * .options()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLinkFormField]. */
    class Builder internal constructor() {

        private var fieldType: JsonField<String>? = null
        private var isCustom: JsonField<Boolean>? = null
        private var isRequired: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var options: JsonField<MutableList<ExternalOption>>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLinkFormField: ExternalLinkFormField) = apply {
            fieldType = externalLinkFormField.fieldType
            isCustom = externalLinkFormField.isCustom
            isRequired = externalLinkFormField.isRequired
            label = externalLinkFormField.label
            name = externalLinkFormField.name
            options = externalLinkFormField.options.map { it.toMutableList() }
            type = externalLinkFormField.type
            additionalProperties = externalLinkFormField.additionalProperties.toMutableMap()
        }

        /**
         * The specific field type of the form field. Corresponds to property types (e.g., `select`,
         * `radio`, `date`, etc)
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

        /** Whether the form field is mandatory. */
        fun isRequired(isRequired: Boolean) = isRequired(JsonField.of(isRequired))

        /**
         * Sets [Builder.isRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRequired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRequired(isRequired: JsonField<Boolean>) = apply { this.isRequired = isRequired }

        /** The text label for the form field. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** The name identifier for the form field. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun options(options: List<ExternalOption>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<ExternalOption>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<List<ExternalOption>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalOption] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: ExternalOption) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        /** The data type of the form field accepts (e.g. `date`, `enumeration`, etc) */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [ExternalLinkFormField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fieldType()
         * .isCustom()
         * .isRequired()
         * .label()
         * .name()
         * .options()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLinkFormField =
            ExternalLinkFormField(
                checkRequired("fieldType", fieldType),
                checkRequired("isCustom", isCustom),
                checkRequired("isRequired", isRequired),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("options", options).map { it.toImmutable() },
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalLinkFormField = apply {
        if (validated) {
            return@apply
        }

        fieldType()
        isCustom()
        isRequired()
        label()
        name()
        options().forEach { it.validate() }
        type()
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
        (if (fieldType.asKnown().isPresent) 1 else 0) +
            (if (isCustom.asKnown().isPresent) 1 else 0) +
            (if (isRequired.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLinkFormField &&
            fieldType == other.fieldType &&
            isCustom == other.isCustom &&
            isRequired == other.isRequired &&
            label == other.label &&
            name == other.name &&
            options == other.options &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            fieldType,
            isCustom,
            isRequired,
            label,
            name,
            options,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLinkFormField{fieldType=$fieldType, isCustom=$isCustom, isRequired=$isRequired, label=$label, name=$name, options=$options, type=$type, additionalProperties=$additionalProperties}"
}
