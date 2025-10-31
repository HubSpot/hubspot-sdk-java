// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PaymentLinkRadioField
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultValues: JsonField<List<String>>,
    private val dependentFields: JsonField<List<DependentField>>,
    private val fieldType: JsonField<FieldType>,
    private val hidden: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val options: JsonField<List<EnumeratedFieldOption>>,
    private val required: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("defaultValues")
        @ExcludeMissing
        defaultValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("dependentFields")
        @ExcludeMissing
        dependentFields: JsonField<List<DependentField>> = JsonMissing.of(),
        @JsonProperty("fieldType")
        @ExcludeMissing
        fieldType: JsonField<FieldType> = JsonMissing.of(),
        @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<EnumeratedFieldOption>> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
    ) : this(
        defaultValues,
        dependentFields,
        fieldType,
        hidden,
        label,
        name,
        objectTypeId,
        options,
        required,
        description,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultValues(): List<String> = defaultValues.getRequired("defaultValues")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependentFields(): List<DependentField> = dependentFields.getRequired("dependentFields")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldType(): FieldType = fieldType.getRequired("fieldType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hidden(): Boolean = hidden.getRequired("hidden")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<EnumeratedFieldOption> = options.getRequired("options")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun required(): Boolean = required.getRequired("required")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Returns the raw JSON value of [defaultValues].
     *
     * Unlike [defaultValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultValues")
    @ExcludeMissing
    fun _defaultValues(): JsonField<List<String>> = defaultValues

    /**
     * Returns the raw JSON value of [dependentFields].
     *
     * Unlike [dependentFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dependentFields")
    @ExcludeMissing
    fun _dependentFields(): JsonField<List<DependentField>> = dependentFields

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<FieldType> = fieldType

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options")
    @ExcludeMissing
    fun _options(): JsonField<List<EnumeratedFieldOption>> = options

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [PaymentLinkRadioField].
         *
         * The following fields are required:
         * ```java
         * .defaultValues()
         * .dependentFields()
         * .fieldType()
         * .hidden()
         * .label()
         * .name()
         * .objectTypeId()
         * .options()
         * .required()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentLinkRadioField]. */
    class Builder internal constructor() {

        private var defaultValues: JsonField<MutableList<String>>? = null
        private var dependentFields: JsonField<MutableList<DependentField>>? = null
        private var fieldType: JsonField<FieldType>? = null
        private var hidden: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var options: JsonField<MutableList<EnumeratedFieldOption>>? = null
        private var required: JsonField<Boolean>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentLinkRadioField: PaymentLinkRadioField) = apply {
            defaultValues = paymentLinkRadioField.defaultValues.map { it.toMutableList() }
            dependentFields = paymentLinkRadioField.dependentFields.map { it.toMutableList() }
            fieldType = paymentLinkRadioField.fieldType
            hidden = paymentLinkRadioField.hidden
            label = paymentLinkRadioField.label
            name = paymentLinkRadioField.name
            objectTypeId = paymentLinkRadioField.objectTypeId
            options = paymentLinkRadioField.options.map { it.toMutableList() }
            required = paymentLinkRadioField.required
            description = paymentLinkRadioField.description
            additionalProperties = paymentLinkRadioField.additionalProperties.toMutableMap()
        }

        fun defaultValues(defaultValues: List<String>) = defaultValues(JsonField.of(defaultValues))

        /**
         * Sets [Builder.defaultValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultValues(defaultValues: JsonField<List<String>>) = apply {
            this.defaultValues = defaultValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [defaultValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDefaultValue(defaultValue: String) = apply {
            defaultValues =
                (defaultValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("defaultValues", it).add(defaultValue)
                }
        }

        fun dependentFields(dependentFields: List<DependentField>) =
            dependentFields(JsonField.of(dependentFields))

        /**
         * Sets [Builder.dependentFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependentFields] with a well-typed
         * `List<DependentField>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun dependentFields(dependentFields: JsonField<List<DependentField>>) = apply {
            this.dependentFields = dependentFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [DependentField] to [dependentFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDependentField(dependentField: DependentField) = apply {
            dependentFields =
                (dependentFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dependentFields", it).add(dependentField)
                }
        }

        fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [FieldType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
        }

        fun options(options: List<EnumeratedFieldOption>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<EnumeratedFieldOption>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun options(options: JsonField<List<EnumeratedFieldOption>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [EnumeratedFieldOption] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: EnumeratedFieldOption) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * Returns an immutable instance of [PaymentLinkRadioField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .defaultValues()
         * .dependentFields()
         * .fieldType()
         * .hidden()
         * .label()
         * .name()
         * .objectTypeId()
         * .options()
         * .required()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentLinkRadioField =
            PaymentLinkRadioField(
                checkRequired("defaultValues", defaultValues).map { it.toImmutable() },
                checkRequired("dependentFields", dependentFields).map { it.toImmutable() },
                checkRequired("fieldType", fieldType),
                checkRequired("hidden", hidden),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("options", options).map { it.toImmutable() },
                checkRequired("required", required),
                description,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentLinkRadioField = apply {
        if (validated) {
            return@apply
        }

        defaultValues()
        dependentFields().forEach { it.validate() }
        fieldType().validate()
        hidden()
        label()
        name()
        objectTypeId()
        options().forEach { it.validate() }
        required()
        description()
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
        (defaultValues.asKnown().getOrNull()?.size ?: 0) +
            (dependentFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hidden.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (required.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0)

    class FieldType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PAYMENT_LINK_RADIO = of("payment_link_radio")

            @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
        }

        /** An enum containing [FieldType]'s known values. */
        enum class Known {
            PAYMENT_LINK_RADIO
        }

        /**
         * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FieldType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT_LINK_RADIO,
            /**
             * An enum member indicating that [FieldType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PAYMENT_LINK_RADIO -> Value.PAYMENT_LINK_RADIO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PAYMENT_LINK_RADIO -> Known.PAYMENT_LINK_RADIO
                else -> throw HubspotInvalidDataException("Unknown FieldType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): FieldType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FieldType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentLinkRadioField &&
            defaultValues == other.defaultValues &&
            dependentFields == other.dependentFields &&
            fieldType == other.fieldType &&
            hidden == other.hidden &&
            label == other.label &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            options == other.options &&
            required == other.required &&
            description == other.description &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultValues,
            dependentFields,
            fieldType,
            hidden,
            label,
            name,
            objectTypeId,
            options,
            required,
            description,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentLinkRadioField{defaultValues=$defaultValues, dependentFields=$dependentFields, fieldType=$fieldType, hidden=$hidden, label=$label, name=$name, objectTypeId=$objectTypeId, options=$options, required=$required, description=$description, additionalProperties=$additionalProperties}"
}
