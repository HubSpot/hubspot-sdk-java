// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectschemas

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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.OptionInput
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ObjectTypePropertyCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldType: JsonField<String>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<Type>,
    private val description: JsonField<String>,
    private val displayOrder: JsonField<Int>,
    private val externalOptionsReferenceType: JsonField<String>,
    private val formField: JsonField<Boolean>,
    private val groupName: JsonField<String>,
    private val hasUniqueValue: JsonField<Boolean>,
    private val hidden: JsonField<Boolean>,
    private val numberDisplayHint: JsonField<NumberDisplayHint>,
    private val options: JsonField<List<OptionInput>>,
    private val optionSortStrategy: JsonField<OptionSortStrategy>,
    private val referencedObjectType: JsonField<String>,
    private val searchableInGlobalSearch: JsonField<Boolean>,
    private val showCurrencySymbol: JsonField<Boolean>,
    private val textDisplayHint: JsonField<TextDisplayHint>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fieldType") @ExcludeMissing fieldType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("externalOptionsReferenceType")
        @ExcludeMissing
        externalOptionsReferenceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("formField") @ExcludeMissing formField: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("groupName") @ExcludeMissing groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasUniqueValue")
        @ExcludeMissing
        hasUniqueValue: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("numberDisplayHint")
        @ExcludeMissing
        numberDisplayHint: JsonField<NumberDisplayHint> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<OptionInput>> = JsonMissing.of(),
        @JsonProperty("optionSortStrategy")
        @ExcludeMissing
        optionSortStrategy: JsonField<OptionSortStrategy> = JsonMissing.of(),
        @JsonProperty("referencedObjectType")
        @ExcludeMissing
        referencedObjectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("searchableInGlobalSearch")
        @ExcludeMissing
        searchableInGlobalSearch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("showCurrencySymbol")
        @ExcludeMissing
        showCurrencySymbol: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("textDisplayHint")
        @ExcludeMissing
        textDisplayHint: JsonField<TextDisplayHint> = JsonMissing.of(),
    ) : this(
        fieldType,
        label,
        name,
        type,
        description,
        displayOrder,
        externalOptionsReferenceType,
        formField,
        groupName,
        hasUniqueValue,
        hidden,
        numberDisplayHint,
        options,
        optionSortStrategy,
        referencedObjectType,
        searchableInGlobalSearch,
        showCurrencySymbol,
        textDisplayHint,
        mutableMapOf(),
    )

    /**
     * Controls how the property appears in HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldType(): String = fieldType.getRequired("fieldType")

    /**
     * A human-readable property label that will be shown in HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The internal property name, which must be used when referencing the property from the API.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The data type of the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * A description of the property that will be shown as help text in HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The order that this property should be displayed in the HubSpot UI relative to other
     * properties for this object type. Properties are displayed in order starting with the lowest
     * positive integer value. A value of -1 will cause the property to be displayed **after** any
     * positive values.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOrder(): Optional<Int> = displayOrder.getOptional("displayOrder")

    /**
     * Specifies the reference type for external options associated with the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalOptionsReferenceType(): Optional<String> =
        externalOptionsReferenceType.getOptional("externalOptionsReferenceType")

    /**
     * Whether the property can be used in a HubSpot form.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formField(): Optional<Boolean> = formField.getOptional("formField")

    /**
     * The name of the group this property belongs to.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupName(): Optional<String> = groupName.getOptional("groupName")

    /**
     * Whether or not the property's value must be unique. Once set, this can't be changed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasUniqueValue(): Optional<Boolean> = hasUniqueValue.getOptional("hasUniqueValue")

    /**
     * Hidden options won't be shown in HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hidden(): Optional<Boolean> = hidden.getOptional("hidden")

    /**
     * Controls how numeric properties are formatted in the HubSpot UI
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberDisplayHint(): Optional<NumberDisplayHint> =
        numberDisplayHint.getOptional("numberDisplayHint")

    /**
     * A list of available options for the property. This field is only required for enumerated
     * properties.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<List<OptionInput>> = options.getOptional("options")

    /**
     * Controls how the property options will be sorted in the HubSpot UI.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optionSortStrategy(): Optional<OptionSortStrategy> =
        optionSortStrategy.getOptional("optionSortStrategy")

    /**
     * Defines the options this property will return, e.g. OWNER would return name of users on the
     * portal.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referencedObjectType(): Optional<String> =
        referencedObjectType.getOptional("referencedObjectType")

    /**
     * Allow users to search for information entered to this field (limited to 3 properties)
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchableInGlobalSearch(): Optional<Boolean> =
        searchableInGlobalSearch.getOptional("searchableInGlobalSearch")

    /**
     * Whether the property will display the currency symbol in the HubSpot UI.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showCurrencySymbol(): Optional<Boolean> =
        showCurrencySymbol.getOptional("showCurrencySymbol")

    /**
     * Controls how text properties are formatted in the HubSpot UI
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textDisplayHint(): Optional<TextDisplayHint> =
        textDisplayHint.getOptional("textDisplayHint")

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<String> = fieldType

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
     * Returns the raw JSON value of [externalOptionsReferenceType].
     *
     * Unlike [externalOptionsReferenceType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("externalOptionsReferenceType")
    @ExcludeMissing
    fun _externalOptionsReferenceType(): JsonField<String> = externalOptionsReferenceType

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
     * Returns the raw JSON value of [optionSortStrategy].
     *
     * Unlike [optionSortStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optionSortStrategy")
    @ExcludeMissing
    fun _optionSortStrategy(): JsonField<OptionSortStrategy> = optionSortStrategy

    /**
     * Returns the raw JSON value of [referencedObjectType].
     *
     * Unlike [referencedObjectType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedObjectType")
    @ExcludeMissing
    fun _referencedObjectType(): JsonField<String> = referencedObjectType

    /**
     * Returns the raw JSON value of [searchableInGlobalSearch].
     *
     * Unlike [searchableInGlobalSearch], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("searchableInGlobalSearch")
    @ExcludeMissing
    fun _searchableInGlobalSearch(): JsonField<Boolean> = searchableInGlobalSearch

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
     * Returns the raw JSON value of [textDisplayHint].
     *
     * Unlike [textDisplayHint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("textDisplayHint")
    @ExcludeMissing
    fun _textDisplayHint(): JsonField<TextDisplayHint> = textDisplayHint

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
         * Returns a mutable builder for constructing an instance of [ObjectTypePropertyCreate].
         *
         * The following fields are required:
         * ```java
         * .fieldType()
         * .label()
         * .name()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectTypePropertyCreate]. */
    class Builder internal constructor() {

        private var fieldType: JsonField<String>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var displayOrder: JsonField<Int> = JsonMissing.of()
        private var externalOptionsReferenceType: JsonField<String> = JsonMissing.of()
        private var formField: JsonField<Boolean> = JsonMissing.of()
        private var groupName: JsonField<String> = JsonMissing.of()
        private var hasUniqueValue: JsonField<Boolean> = JsonMissing.of()
        private var hidden: JsonField<Boolean> = JsonMissing.of()
        private var numberDisplayHint: JsonField<NumberDisplayHint> = JsonMissing.of()
        private var options: JsonField<MutableList<OptionInput>>? = null
        private var optionSortStrategy: JsonField<OptionSortStrategy> = JsonMissing.of()
        private var referencedObjectType: JsonField<String> = JsonMissing.of()
        private var searchableInGlobalSearch: JsonField<Boolean> = JsonMissing.of()
        private var showCurrencySymbol: JsonField<Boolean> = JsonMissing.of()
        private var textDisplayHint: JsonField<TextDisplayHint> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectTypePropertyCreate: ObjectTypePropertyCreate) = apply {
            fieldType = objectTypePropertyCreate.fieldType
            label = objectTypePropertyCreate.label
            name = objectTypePropertyCreate.name
            type = objectTypePropertyCreate.type
            description = objectTypePropertyCreate.description
            displayOrder = objectTypePropertyCreate.displayOrder
            externalOptionsReferenceType = objectTypePropertyCreate.externalOptionsReferenceType
            formField = objectTypePropertyCreate.formField
            groupName = objectTypePropertyCreate.groupName
            hasUniqueValue = objectTypePropertyCreate.hasUniqueValue
            hidden = objectTypePropertyCreate.hidden
            numberDisplayHint = objectTypePropertyCreate.numberDisplayHint
            options = objectTypePropertyCreate.options.map { it.toMutableList() }
            optionSortStrategy = objectTypePropertyCreate.optionSortStrategy
            referencedObjectType = objectTypePropertyCreate.referencedObjectType
            searchableInGlobalSearch = objectTypePropertyCreate.searchableInGlobalSearch
            showCurrencySymbol = objectTypePropertyCreate.showCurrencySymbol
            textDisplayHint = objectTypePropertyCreate.textDisplayHint
            additionalProperties = objectTypePropertyCreate.additionalProperties.toMutableMap()
        }

        /** Controls how the property appears in HubSpot. */
        fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<String>) = apply { this.fieldType = fieldType }

        /** A human-readable property label that will be shown in HubSpot. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * The internal property name, which must be used when referencing the property from the
         * API.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The data type of the property. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** A description of the property that will be shown as help text in HubSpot. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The order that this property should be displayed in the HubSpot UI relative to other
         * properties for this object type. Properties are displayed in order starting with the
         * lowest positive integer value. A value of -1 will cause the property to be displayed
         * **after** any positive values.
         */
        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        /** Specifies the reference type for external options associated with the property. */
        fun externalOptionsReferenceType(externalOptionsReferenceType: String) =
            externalOptionsReferenceType(JsonField.of(externalOptionsReferenceType))

        /**
         * Sets [Builder.externalOptionsReferenceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalOptionsReferenceType] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalOptionsReferenceType(externalOptionsReferenceType: JsonField<String>) = apply {
            this.externalOptionsReferenceType = externalOptionsReferenceType
        }

        /** Whether the property can be used in a HubSpot form. */
        fun formField(formField: Boolean) = formField(JsonField.of(formField))

        /**
         * Sets [Builder.formField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formField] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formField(formField: JsonField<Boolean>) = apply { this.formField = formField }

        /** The name of the group this property belongs to. */
        fun groupName(groupName: String) = groupName(JsonField.of(groupName))

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

        /** Whether or not the property's value must be unique. Once set, this can't be changed. */
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

        /** Hidden options won't be shown in HubSpot. */
        fun hidden(hidden: Boolean) = hidden(JsonField.of(hidden))

        /**
         * Sets [Builder.hidden] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hidden(hidden: JsonField<Boolean>) = apply { this.hidden = hidden }

        /** Controls how numeric properties are formatted in the HubSpot UI */
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

        /**
         * A list of available options for the property. This field is only required for enumerated
         * properties.
         */
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

        /** Controls how the property options will be sorted in the HubSpot UI. */
        fun optionSortStrategy(optionSortStrategy: OptionSortStrategy) =
            optionSortStrategy(JsonField.of(optionSortStrategy))

        /**
         * Sets [Builder.optionSortStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionSortStrategy] with a well-typed
         * [OptionSortStrategy] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun optionSortStrategy(optionSortStrategy: JsonField<OptionSortStrategy>) = apply {
            this.optionSortStrategy = optionSortStrategy
        }

        /**
         * Defines the options this property will return, e.g. OWNER would return name of users on
         * the portal.
         */
        fun referencedObjectType(referencedObjectType: String) =
            referencedObjectType(JsonField.of(referencedObjectType))

        /**
         * Sets [Builder.referencedObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedObjectType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referencedObjectType(referencedObjectType: JsonField<String>) = apply {
            this.referencedObjectType = referencedObjectType
        }

        /** Allow users to search for information entered to this field (limited to 3 properties) */
        fun searchableInGlobalSearch(searchableInGlobalSearch: Boolean) =
            searchableInGlobalSearch(JsonField.of(searchableInGlobalSearch))

        /**
         * Sets [Builder.searchableInGlobalSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchableInGlobalSearch] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun searchableInGlobalSearch(searchableInGlobalSearch: JsonField<Boolean>) = apply {
            this.searchableInGlobalSearch = searchableInGlobalSearch
        }

        /** Whether the property will display the currency symbol in the HubSpot UI. */
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

        /** Controls how text properties are formatted in the HubSpot UI */
        fun textDisplayHint(textDisplayHint: TextDisplayHint) =
            textDisplayHint(JsonField.of(textDisplayHint))

        /**
         * Sets [Builder.textDisplayHint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textDisplayHint] with a well-typed [TextDisplayHint]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun textDisplayHint(textDisplayHint: JsonField<TextDisplayHint>) = apply {
            this.textDisplayHint = textDisplayHint
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
         * Returns an immutable instance of [ObjectTypePropertyCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fieldType()
         * .label()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectTypePropertyCreate =
            ObjectTypePropertyCreate(
                checkRequired("fieldType", fieldType),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("type", type),
                description,
                displayOrder,
                externalOptionsReferenceType,
                formField,
                groupName,
                hasUniqueValue,
                hidden,
                numberDisplayHint,
                (options ?: JsonMissing.of()).map { it.toImmutable() },
                optionSortStrategy,
                referencedObjectType,
                searchableInGlobalSearch,
                showCurrencySymbol,
                textDisplayHint,
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
    fun validate(): ObjectTypePropertyCreate = apply {
        if (validated) {
            return@apply
        }

        fieldType()
        label()
        name()
        type().validate()
        description()
        displayOrder()
        externalOptionsReferenceType()
        formField()
        groupName()
        hasUniqueValue()
        hidden()
        numberDisplayHint().ifPresent { it.validate() }
        options().ifPresent { it.forEach { it.validate() } }
        optionSortStrategy().ifPresent { it.validate() }
        referencedObjectType()
        searchableInGlobalSearch()
        showCurrencySymbol()
        textDisplayHint().ifPresent { it.validate() }
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
        (if (fieldType.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (if (externalOptionsReferenceType.asKnown().isPresent) 1 else 0) +
            (if (formField.asKnown().isPresent) 1 else 0) +
            (if (groupName.asKnown().isPresent) 1 else 0) +
            (if (hasUniqueValue.asKnown().isPresent) 1 else 0) +
            (if (hidden.asKnown().isPresent) 1 else 0) +
            (numberDisplayHint.asKnown().getOrNull()?.validity() ?: 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (optionSortStrategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (referencedObjectType.asKnown().isPresent) 1 else 0) +
            (if (searchableInGlobalSearch.asKnown().isPresent) 1 else 0) +
            (if (showCurrencySymbol.asKnown().isPresent) 1 else 0) +
            (textDisplayHint.asKnown().getOrNull()?.validity() ?: 0)

    /** The data type of the property. */
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

    /** Controls how numeric properties are formatted in the HubSpot UI */
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

    /** Controls how the property options will be sorted in the HubSpot UI. */
    class OptionSortStrategy
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALPHABETICAL = of("ALPHABETICAL")

            @JvmField val DISPLAY_ORDER = of("DISPLAY_ORDER")

            @JvmStatic fun of(value: String) = OptionSortStrategy(JsonField.of(value))
        }

        /** An enum containing [OptionSortStrategy]'s known values. */
        enum class Known {
            ALPHABETICAL,
            DISPLAY_ORDER,
        }

        /**
         * An enum containing [OptionSortStrategy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OptionSortStrategy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALPHABETICAL,
            DISPLAY_ORDER,
            /**
             * An enum member indicating that [OptionSortStrategy] was instantiated with an unknown
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
                ALPHABETICAL -> Value.ALPHABETICAL
                DISPLAY_ORDER -> Value.DISPLAY_ORDER
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
                ALPHABETICAL -> Known.ALPHABETICAL
                DISPLAY_ORDER -> Known.DISPLAY_ORDER
                else -> throw HubSpotInvalidDataException("Unknown OptionSortStrategy: $value")
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
        fun validate(): OptionSortStrategy = apply {
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

            return other is OptionSortStrategy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Controls how text properties are formatted in the HubSpot UI */
    class TextDisplayHint @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DOMAIN_NAME = of("domain_name")

            @JvmField val EMAIL = of("email")

            @JvmField val IP_ADDRESS = of("ip_address")

            @JvmField val MULTI_LINE = of("multi_line")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val PHYSICAL_ADDRESS = of("physical_address")

            @JvmField val POSTAL_CODE = of("postal_code")

            @JvmField val UNFORMATTED_SINGLE_LINE = of("unformatted_single_line")

            @JvmStatic fun of(value: String) = TextDisplayHint(JsonField.of(value))
        }

        /** An enum containing [TextDisplayHint]'s known values. */
        enum class Known {
            DOMAIN_NAME,
            EMAIL,
            IP_ADDRESS,
            MULTI_LINE,
            PHONE_NUMBER,
            PHYSICAL_ADDRESS,
            POSTAL_CODE,
            UNFORMATTED_SINGLE_LINE,
        }

        /**
         * An enum containing [TextDisplayHint]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TextDisplayHint] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DOMAIN_NAME,
            EMAIL,
            IP_ADDRESS,
            MULTI_LINE,
            PHONE_NUMBER,
            PHYSICAL_ADDRESS,
            POSTAL_CODE,
            UNFORMATTED_SINGLE_LINE,
            /**
             * An enum member indicating that [TextDisplayHint] was instantiated with an unknown
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
                DOMAIN_NAME -> Value.DOMAIN_NAME
                EMAIL -> Value.EMAIL
                IP_ADDRESS -> Value.IP_ADDRESS
                MULTI_LINE -> Value.MULTI_LINE
                PHONE_NUMBER -> Value.PHONE_NUMBER
                PHYSICAL_ADDRESS -> Value.PHYSICAL_ADDRESS
                POSTAL_CODE -> Value.POSTAL_CODE
                UNFORMATTED_SINGLE_LINE -> Value.UNFORMATTED_SINGLE_LINE
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
                DOMAIN_NAME -> Known.DOMAIN_NAME
                EMAIL -> Known.EMAIL
                IP_ADDRESS -> Known.IP_ADDRESS
                MULTI_LINE -> Known.MULTI_LINE
                PHONE_NUMBER -> Known.PHONE_NUMBER
                PHYSICAL_ADDRESS -> Known.PHYSICAL_ADDRESS
                POSTAL_CODE -> Known.POSTAL_CODE
                UNFORMATTED_SINGLE_LINE -> Known.UNFORMATTED_SINGLE_LINE
                else -> throw HubSpotInvalidDataException("Unknown TextDisplayHint: $value")
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
        fun validate(): TextDisplayHint = apply {
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

            return other is TextDisplayHint && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectTypePropertyCreate &&
            fieldType == other.fieldType &&
            label == other.label &&
            name == other.name &&
            type == other.type &&
            description == other.description &&
            displayOrder == other.displayOrder &&
            externalOptionsReferenceType == other.externalOptionsReferenceType &&
            formField == other.formField &&
            groupName == other.groupName &&
            hasUniqueValue == other.hasUniqueValue &&
            hidden == other.hidden &&
            numberDisplayHint == other.numberDisplayHint &&
            options == other.options &&
            optionSortStrategy == other.optionSortStrategy &&
            referencedObjectType == other.referencedObjectType &&
            searchableInGlobalSearch == other.searchableInGlobalSearch &&
            showCurrencySymbol == other.showCurrencySymbol &&
            textDisplayHint == other.textDisplayHint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            fieldType,
            label,
            name,
            type,
            description,
            displayOrder,
            externalOptionsReferenceType,
            formField,
            groupName,
            hasUniqueValue,
            hidden,
            numberDisplayHint,
            options,
            optionSortStrategy,
            referencedObjectType,
            searchableInGlobalSearch,
            showCurrencySymbol,
            textDisplayHint,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectTypePropertyCreate{fieldType=$fieldType, label=$label, name=$name, type=$type, description=$description, displayOrder=$displayOrder, externalOptionsReferenceType=$externalOptionsReferenceType, formField=$formField, groupName=$groupName, hasUniqueValue=$hasUniqueValue, hidden=$hidden, numberDisplayHint=$numberDisplayHint, options=$options, optionSortStrategy=$optionSortStrategy, referencedObjectType=$referencedObjectType, searchableInGlobalSearch=$searchableInGlobalSearch, showCurrencySymbol=$showCurrencySymbol, textDisplayHint=$textDisplayHint, additionalProperties=$additionalProperties}"
}
