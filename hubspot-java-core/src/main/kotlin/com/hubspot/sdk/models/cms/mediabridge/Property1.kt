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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.PropertyModificationMetadata
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Property1
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val fieldType: JsonField<String>,
    private val groupName: JsonField<String>,
    private val label: JsonField<String>,
    private val name: JsonField<String>,
    private val options: JsonField<List<Option1>>,
    private val type: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val calculated: JsonField<Boolean>,
    private val calculationFormula: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdUserId: JsonField<String>,
    private val currencyPropertyName: JsonField<String>,
    private val dataSensitivity: JsonField<DataSensitivity>,
    private val dateDisplayHint: JsonField<DateDisplayHint>,
    private val displayOrder: JsonField<Int>,
    private val externalOptions: JsonField<Boolean>,
    private val formField: JsonField<Boolean>,
    private val hasUniqueValue: JsonField<Boolean>,
    private val hidden: JsonField<Boolean>,
    private val hubSpotDefined: JsonField<Boolean>,
    private val modificationMetadata: JsonField<PropertyModificationMetadata>,
    private val numberDisplayHint: JsonField<NumberDisplayHint>,
    private val referencedObjectType: JsonField<String>,
    private val sensitiveDataCategories: JsonField<List<String>>,
    private val showCurrencySymbol: JsonField<Boolean>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedUserId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fieldType") @ExcludeMissing fieldType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groupName") @ExcludeMissing groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<Option1>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("archivedAt")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("calculated")
        @ExcludeMissing
        calculated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("calculationFormula")
        @ExcludeMissing
        calculationFormula: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdUserId")
        @ExcludeMissing
        createdUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyPropertyName")
        @ExcludeMissing
        currencyPropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataSensitivity")
        @ExcludeMissing
        dataSensitivity: JsonField<DataSensitivity> = JsonMissing.of(),
        @JsonProperty("dateDisplayHint")
        @ExcludeMissing
        dateDisplayHint: JsonField<DateDisplayHint> = JsonMissing.of(),
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("externalOptions")
        @ExcludeMissing
        externalOptions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("formField") @ExcludeMissing formField: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasUniqueValue")
        @ExcludeMissing
        hasUniqueValue: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hubspotDefined")
        @ExcludeMissing
        hubSpotDefined: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("modificationMetadata")
        @ExcludeMissing
        modificationMetadata: JsonField<PropertyModificationMetadata> = JsonMissing.of(),
        @JsonProperty("numberDisplayHint")
        @ExcludeMissing
        numberDisplayHint: JsonField<NumberDisplayHint> = JsonMissing.of(),
        @JsonProperty("referencedObjectType")
        @ExcludeMissing
        referencedObjectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sensitiveDataCategories")
        @ExcludeMissing
        sensitiveDataCategories: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("showCurrencySymbol")
        @ExcludeMissing
        showCurrencySymbol: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedUserId")
        @ExcludeMissing
        updatedUserId: JsonField<String> = JsonMissing.of(),
    ) : this(
        description,
        fieldType,
        groupName,
        label,
        name,
        options,
        type,
        archived,
        archivedAt,
        calculated,
        calculationFormula,
        createdAt,
        createdUserId,
        currencyPropertyName,
        dataSensitivity,
        dateDisplayHint,
        displayOrder,
        externalOptions,
        formField,
        hasUniqueValue,
        hidden,
        hubSpotDefined,
        modificationMetadata,
        numberDisplayHint,
        referencedObjectType,
        sensitiveDataCategories,
        showCurrencySymbol,
        updatedAt,
        updatedUserId,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldType(): String = fieldType.getRequired("fieldType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupName(): String = groupName.getRequired("groupName")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<Option1> = options.getRequired("options")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archivedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calculated(): Optional<Boolean> = calculated.getOptional("calculated")

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
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdUserId(): Optional<String> = createdUserId.getOptional("createdUserId")

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
    fun dataSensitivity(): Optional<DataSensitivity> =
        dataSensitivity.getOptional("dataSensitivity")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateDisplayHint(): Optional<DateDisplayHint> =
        dateDisplayHint.getOptional("dateDisplayHint")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOrder(): Optional<Int> = displayOrder.getOptional("displayOrder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalOptions(): Optional<Boolean> = externalOptions.getOptional("externalOptions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formField(): Optional<Boolean> = formField.getOptional("formField")

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
    fun hubSpotDefined(): Optional<Boolean> = hubSpotDefined.getOptional("hubspotDefined")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modificationMetadata(): Optional<PropertyModificationMetadata> =
        modificationMetadata.getOptional("modificationMetadata")

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
    fun referencedObjectType(): Optional<String> =
        referencedObjectType.getOptional("referencedObjectType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sensitiveDataCategories(): Optional<List<String>> =
        sensitiveDataCategories.getOptional("sensitiveDataCategories")

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
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedUserId(): Optional<String> = updatedUserId.getOptional("updatedUserId")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<String> = fieldType

    /**
     * Returns the raw JSON value of [groupName].
     *
     * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groupName") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

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
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<Option1>> = options

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivedAt")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [calculated].
     *
     * Unlike [calculated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calculated") @ExcludeMissing fun _calculated(): JsonField<Boolean> = calculated

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdUserId].
     *
     * Unlike [createdUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdUserId")
    @ExcludeMissing
    fun _createdUserId(): JsonField<String> = createdUserId

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
     * Returns the raw JSON value of [dataSensitivity].
     *
     * Unlike [dataSensitivity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataSensitivity")
    @ExcludeMissing
    fun _dataSensitivity(): JsonField<DataSensitivity> = dataSensitivity

    /**
     * Returns the raw JSON value of [dateDisplayHint].
     *
     * Unlike [dateDisplayHint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateDisplayHint")
    @ExcludeMissing
    fun _dateDisplayHint(): JsonField<DateDisplayHint> = dateDisplayHint

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayOrder") @ExcludeMissing fun _displayOrder(): JsonField<Int> = displayOrder

    /**
     * Returns the raw JSON value of [externalOptions].
     *
     * Unlike [externalOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalOptions")
    @ExcludeMissing
    fun _externalOptions(): JsonField<Boolean> = externalOptions

    /**
     * Returns the raw JSON value of [formField].
     *
     * Unlike [formField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formField") @ExcludeMissing fun _formField(): JsonField<Boolean> = formField

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
     * Returns the raw JSON value of [hubSpotDefined].
     *
     * Unlike [hubSpotDefined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspotDefined")
    @ExcludeMissing
    fun _hubSpotDefined(): JsonField<Boolean> = hubSpotDefined

    /**
     * Returns the raw JSON value of [modificationMetadata].
     *
     * Unlike [modificationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("modificationMetadata")
    @ExcludeMissing
    fun _modificationMetadata(): JsonField<PropertyModificationMetadata> = modificationMetadata

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
     * Returns the raw JSON value of [referencedObjectType].
     *
     * Unlike [referencedObjectType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedObjectType")
    @ExcludeMissing
    fun _referencedObjectType(): JsonField<String> = referencedObjectType

    /**
     * Returns the raw JSON value of [sensitiveDataCategories].
     *
     * Unlike [sensitiveDataCategories], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sensitiveDataCategories")
    @ExcludeMissing
    fun _sensitiveDataCategories(): JsonField<List<String>> = sensitiveDataCategories

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedUserId].
     *
     * Unlike [updatedUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedUserId")
    @ExcludeMissing
    fun _updatedUserId(): JsonField<String> = updatedUserId

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
         * Returns a mutable builder for constructing an instance of [Property1].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .fieldType()
         * .groupName()
         * .label()
         * .name()
         * .options()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Property1]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var fieldType: JsonField<String>? = null
        private var groupName: JsonField<String>? = null
        private var label: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var options: JsonField<MutableList<Option1>>? = null
        private var type: JsonField<String>? = null
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var calculated: JsonField<Boolean> = JsonMissing.of()
        private var calculationFormula: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdUserId: JsonField<String> = JsonMissing.of()
        private var currencyPropertyName: JsonField<String> = JsonMissing.of()
        private var dataSensitivity: JsonField<DataSensitivity> = JsonMissing.of()
        private var dateDisplayHint: JsonField<DateDisplayHint> = JsonMissing.of()
        private var displayOrder: JsonField<Int> = JsonMissing.of()
        private var externalOptions: JsonField<Boolean> = JsonMissing.of()
        private var formField: JsonField<Boolean> = JsonMissing.of()
        private var hasUniqueValue: JsonField<Boolean> = JsonMissing.of()
        private var hidden: JsonField<Boolean> = JsonMissing.of()
        private var hubSpotDefined: JsonField<Boolean> = JsonMissing.of()
        private var modificationMetadata: JsonField<PropertyModificationMetadata> = JsonMissing.of()
        private var numberDisplayHint: JsonField<NumberDisplayHint> = JsonMissing.of()
        private var referencedObjectType: JsonField<String> = JsonMissing.of()
        private var sensitiveDataCategories: JsonField<MutableList<String>>? = null
        private var showCurrencySymbol: JsonField<Boolean> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedUserId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(property1: Property1) = apply {
            description = property1.description
            fieldType = property1.fieldType
            groupName = property1.groupName
            label = property1.label
            name = property1.name
            options = property1.options.map { it.toMutableList() }
            type = property1.type
            archived = property1.archived
            archivedAt = property1.archivedAt
            calculated = property1.calculated
            calculationFormula = property1.calculationFormula
            createdAt = property1.createdAt
            createdUserId = property1.createdUserId
            currencyPropertyName = property1.currencyPropertyName
            dataSensitivity = property1.dataSensitivity
            dateDisplayHint = property1.dateDisplayHint
            displayOrder = property1.displayOrder
            externalOptions = property1.externalOptions
            formField = property1.formField
            hasUniqueValue = property1.hasUniqueValue
            hidden = property1.hidden
            hubSpotDefined = property1.hubSpotDefined
            modificationMetadata = property1.modificationMetadata
            numberDisplayHint = property1.numberDisplayHint
            referencedObjectType = property1.referencedObjectType
            sensitiveDataCategories = property1.sensitiveDataCategories.map { it.toMutableList() }
            showCurrencySymbol = property1.showCurrencySymbol
            updatedAt = property1.updatedAt
            updatedUserId = property1.updatedUserId
            additionalProperties = property1.additionalProperties.toMutableMap()
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

        fun fieldType(fieldType: String) = fieldType(JsonField.of(fieldType))

        /**
         * Sets [Builder.fieldType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldType(fieldType: JsonField<String>) = apply { this.fieldType = fieldType }

        fun groupName(groupName: String) = groupName(JsonField.of(groupName))

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

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

        fun options(options: List<Option1>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed `List<Option1>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<List<Option1>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [Option1] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: Option1) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        fun calculated(calculated: Boolean) = calculated(JsonField.of(calculated))

        /**
         * Sets [Builder.calculated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calculated(calculated: JsonField<Boolean>) = apply { this.calculated = calculated }

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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdUserId(createdUserId: String) = createdUserId(JsonField.of(createdUserId))

        /**
         * Sets [Builder.createdUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdUserId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdUserId(createdUserId: JsonField<String>) = apply {
            this.createdUserId = createdUserId
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

        fun dataSensitivity(dataSensitivity: DataSensitivity) =
            dataSensitivity(JsonField.of(dataSensitivity))

        /**
         * Sets [Builder.dataSensitivity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSensitivity] with a well-typed [DataSensitivity]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataSensitivity(dataSensitivity: JsonField<DataSensitivity>) = apply {
            this.dataSensitivity = dataSensitivity
        }

        fun dateDisplayHint(dateDisplayHint: DateDisplayHint) =
            dateDisplayHint(JsonField.of(dateDisplayHint))

        /**
         * Sets [Builder.dateDisplayHint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateDisplayHint] with a well-typed [DateDisplayHint]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateDisplayHint(dateDisplayHint: JsonField<DateDisplayHint>) = apply {
            this.dateDisplayHint = dateDisplayHint
        }

        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        fun externalOptions(externalOptions: Boolean) =
            externalOptions(JsonField.of(externalOptions))

        /**
         * Sets [Builder.externalOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalOptions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalOptions(externalOptions: JsonField<Boolean>) = apply {
            this.externalOptions = externalOptions
        }

        fun formField(formField: Boolean) = formField(JsonField.of(formField))

        /**
         * Sets [Builder.formField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formField] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formField(formField: JsonField<Boolean>) = apply { this.formField = formField }

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

        fun hubSpotDefined(hubSpotDefined: Boolean) = hubSpotDefined(JsonField.of(hubSpotDefined))

        /**
         * Sets [Builder.hubSpotDefined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hubSpotDefined] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hubSpotDefined(hubSpotDefined: JsonField<Boolean>) = apply {
            this.hubSpotDefined = hubSpotDefined
        }

        fun modificationMetadata(modificationMetadata: PropertyModificationMetadata) =
            modificationMetadata(JsonField.of(modificationMetadata))

        /**
         * Sets [Builder.modificationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modificationMetadata] with a well-typed
         * [PropertyModificationMetadata] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun modificationMetadata(modificationMetadata: JsonField<PropertyModificationMetadata>) =
            apply {
                this.modificationMetadata = modificationMetadata
            }

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

        fun sensitiveDataCategories(sensitiveDataCategories: List<String>) =
            sensitiveDataCategories(JsonField.of(sensitiveDataCategories))

        /**
         * Sets [Builder.sensitiveDataCategories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sensitiveDataCategories] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun sensitiveDataCategories(sensitiveDataCategories: JsonField<List<String>>) = apply {
            this.sensitiveDataCategories = sensitiveDataCategories.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [sensitiveDataCategories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSensitiveDataCategory(sensitiveDataCategory: String) = apply {
            sensitiveDataCategories =
                (sensitiveDataCategories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sensitiveDataCategories", it).add(sensitiveDataCategory)
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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun updatedUserId(updatedUserId: String) = updatedUserId(JsonField.of(updatedUserId))

        /**
         * Sets [Builder.updatedUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedUserId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedUserId(updatedUserId: JsonField<String>) = apply {
            this.updatedUserId = updatedUserId
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
         * Returns an immutable instance of [Property1].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .fieldType()
         * .groupName()
         * .label()
         * .name()
         * .options()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Property1 =
            Property1(
                checkRequired("description", description),
                checkRequired("fieldType", fieldType),
                checkRequired("groupName", groupName),
                checkRequired("label", label),
                checkRequired("name", name),
                checkRequired("options", options).map { it.toImmutable() },
                checkRequired("type", type),
                archived,
                archivedAt,
                calculated,
                calculationFormula,
                createdAt,
                createdUserId,
                currencyPropertyName,
                dataSensitivity,
                dateDisplayHint,
                displayOrder,
                externalOptions,
                formField,
                hasUniqueValue,
                hidden,
                hubSpotDefined,
                modificationMetadata,
                numberDisplayHint,
                referencedObjectType,
                (sensitiveDataCategories ?: JsonMissing.of()).map { it.toImmutable() },
                showCurrencySymbol,
                updatedAt,
                updatedUserId,
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
    fun validate(): Property1 = apply {
        if (validated) {
            return@apply
        }

        description()
        fieldType()
        groupName()
        label()
        name()
        options().forEach { it.validate() }
        type()
        archived()
        archivedAt()
        calculated()
        calculationFormula()
        createdAt()
        createdUserId()
        currencyPropertyName()
        dataSensitivity().ifPresent { it.validate() }
        dateDisplayHint().ifPresent { it.validate() }
        displayOrder()
        externalOptions()
        formField()
        hasUniqueValue()
        hidden()
        hubSpotDefined()
        modificationMetadata().ifPresent { it.validate() }
        numberDisplayHint().ifPresent { it.validate() }
        referencedObjectType()
        sensitiveDataCategories()
        showCurrencySymbol()
        updatedAt()
        updatedUserId()
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
            (if (fieldType.asKnown().isPresent) 1 else 0) +
            (if (groupName.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (if (calculated.asKnown().isPresent) 1 else 0) +
            (if (calculationFormula.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdUserId.asKnown().isPresent) 1 else 0) +
            (if (currencyPropertyName.asKnown().isPresent) 1 else 0) +
            (dataSensitivity.asKnown().getOrNull()?.validity() ?: 0) +
            (dateDisplayHint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (if (externalOptions.asKnown().isPresent) 1 else 0) +
            (if (formField.asKnown().isPresent) 1 else 0) +
            (if (hasUniqueValue.asKnown().isPresent) 1 else 0) +
            (if (hidden.asKnown().isPresent) 1 else 0) +
            (if (hubSpotDefined.asKnown().isPresent) 1 else 0) +
            (modificationMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (numberDisplayHint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (referencedObjectType.asKnown().isPresent) 1 else 0) +
            (sensitiveDataCategories.asKnown().getOrNull()?.size ?: 0) +
            (if (showCurrencySymbol.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedUserId.asKnown().isPresent) 1 else 0)

    class DataSensitivity @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val HIGHLY_SENSITIVE = of("highly_sensitive")

            @JvmField val NON_SENSITIVE = of("non_sensitive")

            @JvmField val SENSITIVE = of("sensitive")

            @JvmStatic fun of(value: String) = DataSensitivity(JsonField.of(value))
        }

        /** An enum containing [DataSensitivity]'s known values. */
        enum class Known {
            HIGHLY_SENSITIVE,
            NON_SENSITIVE,
            SENSITIVE,
        }

        /**
         * An enum containing [DataSensitivity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataSensitivity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGHLY_SENSITIVE,
            NON_SENSITIVE,
            SENSITIVE,
            /**
             * An enum member indicating that [DataSensitivity] was instantiated with an unknown
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
                HIGHLY_SENSITIVE -> Value.HIGHLY_SENSITIVE
                NON_SENSITIVE -> Value.NON_SENSITIVE
                SENSITIVE -> Value.SENSITIVE
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
                HIGHLY_SENSITIVE -> Known.HIGHLY_SENSITIVE
                NON_SENSITIVE -> Known.NON_SENSITIVE
                SENSITIVE -> Known.SENSITIVE
                else -> throw HubSpotInvalidDataException("Unknown DataSensitivity: $value")
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
        fun validate(): DataSensitivity = apply {
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

            return other is DataSensitivity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class DateDisplayHint @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ABSOLUTE = of("absolute")

            @JvmField val ABSOLUTE_WITH_RELATIVE = of("absolute_with_relative")

            @JvmField val TIME_SINCE = of("time_since")

            @JvmField val TIME_UNTIL = of("time_until")

            @JvmStatic fun of(value: String) = DateDisplayHint(JsonField.of(value))
        }

        /** An enum containing [DateDisplayHint]'s known values. */
        enum class Known {
            ABSOLUTE,
            ABSOLUTE_WITH_RELATIVE,
            TIME_SINCE,
            TIME_UNTIL,
        }

        /**
         * An enum containing [DateDisplayHint]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DateDisplayHint] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABSOLUTE,
            ABSOLUTE_WITH_RELATIVE,
            TIME_SINCE,
            TIME_UNTIL,
            /**
             * An enum member indicating that [DateDisplayHint] was instantiated with an unknown
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
                ABSOLUTE -> Value.ABSOLUTE
                ABSOLUTE_WITH_RELATIVE -> Value.ABSOLUTE_WITH_RELATIVE
                TIME_SINCE -> Value.TIME_SINCE
                TIME_UNTIL -> Value.TIME_UNTIL
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
                ABSOLUTE -> Known.ABSOLUTE
                ABSOLUTE_WITH_RELATIVE -> Known.ABSOLUTE_WITH_RELATIVE
                TIME_SINCE -> Known.TIME_SINCE
                TIME_UNTIL -> Known.TIME_UNTIL
                else -> throw HubSpotInvalidDataException("Unknown DateDisplayHint: $value")
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
        fun validate(): DateDisplayHint = apply {
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

            return other is DateDisplayHint && value == other.value
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Property1 &&
            description == other.description &&
            fieldType == other.fieldType &&
            groupName == other.groupName &&
            label == other.label &&
            name == other.name &&
            options == other.options &&
            type == other.type &&
            archived == other.archived &&
            archivedAt == other.archivedAt &&
            calculated == other.calculated &&
            calculationFormula == other.calculationFormula &&
            createdAt == other.createdAt &&
            createdUserId == other.createdUserId &&
            currencyPropertyName == other.currencyPropertyName &&
            dataSensitivity == other.dataSensitivity &&
            dateDisplayHint == other.dateDisplayHint &&
            displayOrder == other.displayOrder &&
            externalOptions == other.externalOptions &&
            formField == other.formField &&
            hasUniqueValue == other.hasUniqueValue &&
            hidden == other.hidden &&
            hubSpotDefined == other.hubSpotDefined &&
            modificationMetadata == other.modificationMetadata &&
            numberDisplayHint == other.numberDisplayHint &&
            referencedObjectType == other.referencedObjectType &&
            sensitiveDataCategories == other.sensitiveDataCategories &&
            showCurrencySymbol == other.showCurrencySymbol &&
            updatedAt == other.updatedAt &&
            updatedUserId == other.updatedUserId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            fieldType,
            groupName,
            label,
            name,
            options,
            type,
            archived,
            archivedAt,
            calculated,
            calculationFormula,
            createdAt,
            createdUserId,
            currencyPropertyName,
            dataSensitivity,
            dateDisplayHint,
            displayOrder,
            externalOptions,
            formField,
            hasUniqueValue,
            hidden,
            hubSpotDefined,
            modificationMetadata,
            numberDisplayHint,
            referencedObjectType,
            sensitiveDataCategories,
            showCurrencySymbol,
            updatedAt,
            updatedUserId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Property1{description=$description, fieldType=$fieldType, groupName=$groupName, label=$label, name=$name, options=$options, type=$type, archived=$archived, archivedAt=$archivedAt, calculated=$calculated, calculationFormula=$calculationFormula, createdAt=$createdAt, createdUserId=$createdUserId, currencyPropertyName=$currencyPropertyName, dataSensitivity=$dataSensitivity, dateDisplayHint=$dateDisplayHint, displayOrder=$displayOrder, externalOptions=$externalOptions, formField=$formField, hasUniqueValue=$hasUniqueValue, hidden=$hidden, hubSpotDefined=$hubSpotDefined, modificationMetadata=$modificationMetadata, numberDisplayHint=$numberDisplayHint, referencedObjectType=$referencedObjectType, sensitiveDataCategories=$sensitiveDataCategories, showCurrencySymbol=$showCurrencySymbol, updatedAt=$updatedAt, updatedUserId=$updatedUserId, additionalProperties=$additionalProperties}"
}
