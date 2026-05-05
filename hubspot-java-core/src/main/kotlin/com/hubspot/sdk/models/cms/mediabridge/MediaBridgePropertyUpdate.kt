// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.OptionInput
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MediaBridgePropertyUpdate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val calculationFormula: JsonField<String>,
    private val currencyPropertyName: JsonField<String>,
    private val description: JsonField<String>,
    private val displayOrder: JsonField<Int>,
    private val fieldType: JsonField<FieldType>,
    private val formField: JsonField<Boolean>,
    private val groupName: JsonField<String>,
    private val hasUniqueValue: JsonField<Boolean>,
    private val hidden: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val numberDisplayHint: JsonField<NumberDisplayHint>,
    private val options: JsonField<List<OptionInput>>,
    private val showCurrencySymbol: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("calculationFormula")
        @ExcludeMissing
        calculationFormula: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyPropertyName")
        @ExcludeMissing
        currencyPropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fieldType")
        @ExcludeMissing
        fieldType: JsonField<FieldType> = JsonMissing.of(),
        @JsonProperty("formField") @ExcludeMissing formField: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("groupName") @ExcludeMissing groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasUniqueValue")
        @ExcludeMissing
        hasUniqueValue: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numberDisplayHint")
        @ExcludeMissing
        numberDisplayHint: JsonField<NumberDisplayHint> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<OptionInput>> = JsonMissing.of(),
        @JsonProperty("showCurrencySymbol")
        @ExcludeMissing
        showCurrencySymbol: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        calculationFormula,
        currencyPropertyName,
        description,
        displayOrder,
        fieldType,
        formField,
        groupName,
        hasUniqueValue,
        hidden,
        label,
        numberDisplayHint,
        options,
        showCurrencySymbol,
        type,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calculationFormula(): Optional<String> =
        calculationFormula.getOptional("calculationFormula")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyPropertyName(): Optional<String> =
        currencyPropertyName.getOptional("currencyPropertyName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOrder(): Optional<Int> = displayOrder.getOptional("displayOrder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldType(): Optional<FieldType> = fieldType.getOptional("fieldType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formField(): Optional<Boolean> = formField.getOptional("formField")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupName(): Optional<String> = groupName.getOptional("groupName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasUniqueValue(): Optional<Boolean> = hasUniqueValue.getOptional("hasUniqueValue")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hidden(): Optional<Boolean> = hidden.getOptional("hidden")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberDisplayHint(): Optional<NumberDisplayHint> =
        numberDisplayHint.getOptional("numberDisplayHint")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<List<OptionInput>> = options.getOptional("options")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showCurrencySymbol(): Optional<Boolean> =
        showCurrencySymbol.getOptional("showCurrencySymbol")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [calculationFormula].
     *
     * Unlike [calculationFormula], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("calculationFormula")
    @ExcludeMissing
    fun _calculationFormula(): JsonField<String> = calculationFormula

    /**
     * Returns the raw JSON value of [currencyPropertyName].
     *
     * Unlike [currencyPropertyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currencyPropertyName")
    @ExcludeMissing
    fun _currencyPropertyName(): JsonField<String> = currencyPropertyName

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
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<FieldType> = fieldType

    /**
     * Returns the raw JSON value of [formField].
     *
     * Unlike [formField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formField") @ExcludeMissing fun _formField(): JsonField<Boolean> = formField

    /**
     * Returns the raw JSON value of [groupName].
     *
     * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groupName") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

    /**
     * Returns the raw JSON value of [hasUniqueValue].
     *
     * Unlike [hasUniqueValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasUniqueValue")
    @ExcludeMissing
    fun _hasUniqueValue(): JsonField<Boolean> = hasUniqueValue

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
     * Returns the raw JSON value of [numberDisplayHint].
     *
     * Unlike [numberDisplayHint], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numberDisplayHint")
    @ExcludeMissing
    fun _numberDisplayHint(): JsonField<NumberDisplayHint> = numberDisplayHint

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<OptionInput>> = options

    /**
     * Returns the raw JSON value of [showCurrencySymbol].
     *
     * Unlike [showCurrencySymbol], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("showCurrencySymbol")
    @ExcludeMissing
    fun _showCurrencySymbol(): JsonField<Boolean> = showCurrencySymbol

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [MediaBridgePropertyUpdate].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MediaBridgePropertyUpdate]. */
    class Builder internal constructor() {

        private var calculationFormula: JsonField<String> = JsonMissing.of()
        private var currencyPropertyName: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var displayOrder: JsonField<Int> = JsonMissing.of()
        private var fieldType: JsonField<FieldType> = JsonMissing.of()
        private var formField: JsonField<Boolean> = JsonMissing.of()
        private var groupName: JsonField<String> = JsonMissing.of()
        private var hasUniqueValue: JsonField<Boolean> = JsonMissing.of()
        private var hidden: JsonField<Boolean> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var numberDisplayHint: JsonField<NumberDisplayHint> = JsonMissing.of()
        private var options: JsonField<MutableList<OptionInput>>? = null
        private var showCurrencySymbol: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mediaBridgePropertyUpdate: MediaBridgePropertyUpdate) = apply {
            calculationFormula = mediaBridgePropertyUpdate.calculationFormula
            currencyPropertyName = mediaBridgePropertyUpdate.currencyPropertyName
            description = mediaBridgePropertyUpdate.description
            displayOrder = mediaBridgePropertyUpdate.displayOrder
            fieldType = mediaBridgePropertyUpdate.fieldType
            formField = mediaBridgePropertyUpdate.formField
            groupName = mediaBridgePropertyUpdate.groupName
            hasUniqueValue = mediaBridgePropertyUpdate.hasUniqueValue
            hidden = mediaBridgePropertyUpdate.hidden
            label = mediaBridgePropertyUpdate.label
            numberDisplayHint = mediaBridgePropertyUpdate.numberDisplayHint
            options = mediaBridgePropertyUpdate.options.map { it.toMutableList() }
            showCurrencySymbol = mediaBridgePropertyUpdate.showCurrencySymbol
            type = mediaBridgePropertyUpdate.type
            additionalProperties = mediaBridgePropertyUpdate.additionalProperties.toMutableMap()
        }

        fun calculationFormula(calculationFormula: String) =
            calculationFormula(JsonField.of(calculationFormula))

        /**
         * Sets [Builder.calculationFormula] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculationFormula] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun calculationFormula(calculationFormula: JsonField<String>) = apply {
            this.calculationFormula = calculationFormula
        }

        fun currencyPropertyName(currencyPropertyName: String) =
            currencyPropertyName(JsonField.of(currencyPropertyName))

        /**
         * Sets [Builder.currencyPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyPropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencyPropertyName(currencyPropertyName: JsonField<String>) = apply {
            this.currencyPropertyName = currencyPropertyName
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

        fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [FieldType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

        fun formField(formField: Boolean) = formField(JsonField.of(formField))

        /**
         * Sets [Builder.formField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formField] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formField(formField: JsonField<Boolean>) = apply { this.formField = formField }

        fun groupName(groupName: String) = groupName(JsonField.of(groupName))

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

        fun hasUniqueValue(hasUniqueValue: Boolean) = hasUniqueValue(JsonField.of(hasUniqueValue))

        /**
         * Sets [Builder.hasUniqueValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasUniqueValue] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasUniqueValue(hasUniqueValue: JsonField<Boolean>) = apply {
            this.hasUniqueValue = hasUniqueValue
        }

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

        fun numberDisplayHint(numberDisplayHint: NumberDisplayHint) =
            numberDisplayHint(JsonField.of(numberDisplayHint))

        /**
         * Sets [Builder.numberDisplayHint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberDisplayHint] with a well-typed [NumberDisplayHint]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun numberDisplayHint(numberDisplayHint: JsonField<NumberDisplayHint>) = apply {
            this.numberDisplayHint = numberDisplayHint
        }

        fun options(options: List<OptionInput>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<OptionInput>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<List<OptionInput>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [OptionInput] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: OptionInput) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        fun showCurrencySymbol(showCurrencySymbol: Boolean) =
            showCurrencySymbol(JsonField.of(showCurrencySymbol))

        /**
         * Sets [Builder.showCurrencySymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showCurrencySymbol] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showCurrencySymbol(showCurrencySymbol: JsonField<Boolean>) = apply {
            this.showCurrencySymbol = showCurrencySymbol
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [MediaBridgePropertyUpdate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MediaBridgePropertyUpdate =
            MediaBridgePropertyUpdate(
                calculationFormula,
                currencyPropertyName,
                description,
                displayOrder,
                fieldType,
                formField,
                groupName,
                hasUniqueValue,
                hidden,
                label,
                numberDisplayHint,
                (options ?: JsonMissing.of()).map { it.toImmutable() },
                showCurrencySymbol,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): MediaBridgePropertyUpdate = apply {
        if (validated) {
            return@apply
        }

        calculationFormula()
        currencyPropertyName()
        description()
        displayOrder()
        fieldType().ifPresent { it.validate() }
        formField()
        groupName()
        hasUniqueValue()
        hidden()
        label()
        numberDisplayHint().ifPresent { it.validate() }
        options().ifPresent { it.forEach { it.validate() } }
        showCurrencySymbol()
        type().ifPresent { it.validate() }
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
        (if (calculationFormula.asKnown().isPresent) 1 else 0) +
            (if (currencyPropertyName.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (formField.asKnown().isPresent) 1 else 0) +
            (if (groupName.asKnown().isPresent) 1 else 0) +
            (if (hasUniqueValue.asKnown().isPresent) 1 else 0) +
            (if (hidden.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (numberDisplayHint.asKnown().getOrNull()?.validity() ?: 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (showCurrencySymbol.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val BOOLEANCHECKBOX = of("booleancheckbox")

            @JvmField val CALCULATION_EQUATION = of("calculation_equation")

            @JvmField val CHECKBOX = of("checkbox")

            @JvmField val DATE = of("date")

            @JvmField val FILE = of("file")

            @JvmField val HTML = of("html")

            @JvmField val NUMBER = of("number")

            @JvmField val PHONENUMBER = of("phonenumber")

            @JvmField val RADIO = of("radio")

            @JvmField val SELECT = of("select")

            @JvmField val TEXT = of("text")

            @JvmField val TEXTAREA = of("textarea")

            @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
        }

        /** An enum containing [FieldType]'s known values. */
        enum class Known {
            BOOLEANCHECKBOX,
            CALCULATION_EQUATION,
            CHECKBOX,
            DATE,
            FILE,
            HTML,
            NUMBER,
            PHONENUMBER,
            RADIO,
            SELECT,
            TEXT,
            TEXTAREA,
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
            BOOLEANCHECKBOX,
            CALCULATION_EQUATION,
            CHECKBOX,
            DATE,
            FILE,
            HTML,
            NUMBER,
            PHONENUMBER,
            RADIO,
            SELECT,
            TEXT,
            TEXTAREA,
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
                BOOLEANCHECKBOX -> Value.BOOLEANCHECKBOX
                CALCULATION_EQUATION -> Value.CALCULATION_EQUATION
                CHECKBOX -> Value.CHECKBOX
                DATE -> Value.DATE
                FILE -> Value.FILE
                HTML -> Value.HTML
                NUMBER -> Value.NUMBER
                PHONENUMBER -> Value.PHONENUMBER
                RADIO -> Value.RADIO
                SELECT -> Value.SELECT
                TEXT -> Value.TEXT
                TEXTAREA -> Value.TEXTAREA
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BOOLEANCHECKBOX -> Known.BOOLEANCHECKBOX
                CALCULATION_EQUATION -> Known.CALCULATION_EQUATION
                CHECKBOX -> Known.CHECKBOX
                DATE -> Known.DATE
                FILE -> Known.FILE
                HTML -> Known.HTML
                NUMBER -> Known.NUMBER
                PHONENUMBER -> Known.PHONENUMBER
                RADIO -> Known.RADIO
                SELECT -> Known.SELECT
                TEXT -> Known.TEXT
                TEXTAREA -> Known.TEXTAREA
                else -> throw HubSpotInvalidDataException("Unknown FieldType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
            } catch (e: HubSpotInvalidDataException) {
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

    class NumberDisplayHint @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CURRENCY = of("currency")

            @JvmField val DURATION = of("duration")

            @JvmField val FORMATTED = of("formatted")

            @JvmField val PERCENTAGE = of("percentage")

            @JvmField val PROBABILITY = of("probability")

            @JvmField val UNFORMATTED = of("unformatted")

            @JvmStatic fun of(value: String) = NumberDisplayHint(JsonField.of(value))
        }

        /** An enum containing [NumberDisplayHint]'s known values. */
        enum class Known {
            CURRENCY,
            DURATION,
            FORMATTED,
            PERCENTAGE,
            PROBABILITY,
            UNFORMATTED,
        }

        /**
         * An enum containing [NumberDisplayHint]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NumberDisplayHint] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CURRENCY,
            DURATION,
            FORMATTED,
            PERCENTAGE,
            PROBABILITY,
            UNFORMATTED,
            /**
             * An enum member indicating that [NumberDisplayHint] was instantiated with an unknown
             * value.
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
                CURRENCY -> Value.CURRENCY
                DURATION -> Value.DURATION
                FORMATTED -> Value.FORMATTED
                PERCENTAGE -> Value.PERCENTAGE
                PROBABILITY -> Value.PROBABILITY
                UNFORMATTED -> Value.UNFORMATTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CURRENCY -> Known.CURRENCY
                DURATION -> Known.DURATION
                FORMATTED -> Known.FORMATTED
                PERCENTAGE -> Known.PERCENTAGE
                PROBABILITY -> Known.PROBABILITY
                UNFORMATTED -> Known.UNFORMATTED
                else -> throw HubSpotInvalidDataException("Unknown NumberDisplayHint: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): NumberDisplayHint = apply {
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
            } catch (e: HubSpotInvalidDataException) {
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

            return other is NumberDisplayHint && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BOOL = of("bool")

            @JvmField val DATE = of("date")

            @JvmField val DATETIME = of("datetime")

            @JvmField val ENUMERATION = of("enumeration")

            @JvmField val NUMBER = of("number")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val STRING = of("string")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOL,
            DATE,
            DATETIME,
            ENUMERATION,
            NUMBER,
            PHONE_NUMBER,
            STRING,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOOL,
            DATE,
            DATETIME,
            ENUMERATION,
            NUMBER,
            PHONE_NUMBER,
            STRING,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                BOOL -> Value.BOOL
                DATE -> Value.DATE
                DATETIME -> Value.DATETIME
                ENUMERATION -> Value.ENUMERATION
                NUMBER -> Value.NUMBER
                PHONE_NUMBER -> Value.PHONE_NUMBER
                STRING -> Value.STRING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BOOL -> Known.BOOL
                DATE -> Known.DATE
                DATETIME -> Known.DATETIME
                ENUMERATION -> Known.ENUMERATION
                NUMBER -> Known.NUMBER
                PHONE_NUMBER -> Known.PHONE_NUMBER
                STRING -> Known.STRING
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
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
            } catch (e: HubSpotInvalidDataException) {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MediaBridgePropertyUpdate &&
            calculationFormula == other.calculationFormula &&
            currencyPropertyName == other.currencyPropertyName &&
            description == other.description &&
            displayOrder == other.displayOrder &&
            fieldType == other.fieldType &&
            formField == other.formField &&
            groupName == other.groupName &&
            hasUniqueValue == other.hasUniqueValue &&
            hidden == other.hidden &&
            label == other.label &&
            numberDisplayHint == other.numberDisplayHint &&
            options == other.options &&
            showCurrencySymbol == other.showCurrencySymbol &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            calculationFormula,
            currencyPropertyName,
            description,
            displayOrder,
            fieldType,
            formField,
            groupName,
            hasUniqueValue,
            hidden,
            label,
            numberDisplayHint,
            options,
            showCurrencySymbol,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MediaBridgePropertyUpdate{calculationFormula=$calculationFormula, currencyPropertyName=$currencyPropertyName, description=$description, displayOrder=$displayOrder, fieldType=$fieldType, formField=$formField, groupName=$groupName, hasUniqueValue=$hasUniqueValue, hidden=$hidden, label=$label, numberDisplayHint=$numberDisplayHint, options=$options, showCurrencySymbol=$showCurrencySymbol, type=$type, additionalProperties=$additionalProperties}"
}
