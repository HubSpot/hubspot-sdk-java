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
import com.hubspot.sdk.models.AutomationActionsOption
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A HubSpot property */
class Property
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowedObjectTypes: JsonField<List<ObjectTypeIdProto>>,
    private val calculated: JsonField<Boolean>,
    private val canArchive: JsonField<Boolean>,
    private val canRestore: JsonField<Boolean>,
    private val createdAt: JsonField<Long>,
    private val createdUserId: JsonField<Long>,
    private val currencyPropertyName: JsonField<String>,
    private val dataSensitivity: JsonField<DataSensitivity>,
    private val dateDisplayHint: JsonField<DateDisplayHint>,
    private val deleted: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val displayMode: JsonField<DisplayMode>,
    private val displayOrder: JsonField<Int>,
    private val enforceMultivalueUniqueness: JsonField<Boolean>,
    private val externalOptions: JsonField<Boolean>,
    private val externalOptionsReferenceType: JsonField<String>,
    private val favorited: JsonField<Boolean>,
    private val favoritedOrder: JsonField<Int>,
    private val fieldType: JsonField<String>,
    private val formField: JsonField<Boolean>,
    private val fromUserId: JsonField<Long>,
    private val groupName: JsonField<String>,
    private val hasUniqueValue: JsonField<Boolean>,
    private val hidden: JsonField<Boolean>,
    private val hubSpotDefined: JsonField<Boolean>,
    private val isCustomizedDefault: JsonField<Boolean>,
    private val isMultiValued: JsonField<Boolean>,
    private val isPartial: JsonField<Boolean>,
    private val label: JsonField<String>,
    private val mutableDefinitionNotDeletable: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val numberDisplayHint: JsonField<NumberDisplayHint>,
    private val options: JsonField<List<AutomationActionsOption>>,
    private val optionsAreMutable: JsonField<Boolean>,
    private val optionSortStrategy: JsonField<OptionSortStrategy>,
    private val owningAppId: JsonField<Long>,
    private val portalId: JsonField<Long>,
    private val readOnlyDefinition: JsonField<Boolean>,
    private val readOnlyValue: JsonField<Boolean>,
    private val referencedObjectType: JsonField<ReferencedObjectType>,
    private val searchableInGlobalSearch: JsonField<Boolean>,
    private val searchTextAnalysisMode: JsonField<SearchTextAnalysisMode>,
    private val sensitiveDataCategories: JsonField<List<String>>,
    private val showCurrencySymbol: JsonField<Boolean>,
    private val textDisplayHint: JsonField<TextDisplayHint>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowedObjectTypes")
        @ExcludeMissing
        allowedObjectTypes: JsonField<List<ObjectTypeIdProto>> = JsonMissing.of(),
        @JsonProperty("calculated")
        @ExcludeMissing
        calculated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("canArchive")
        @ExcludeMissing
        canArchive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("canRestore")
        @ExcludeMissing
        canRestore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdUserId")
        @ExcludeMissing
        createdUserId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currencyPropertyName")
        @ExcludeMissing
        currencyPropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataSensitivity")
        @ExcludeMissing
        dataSensitivity: JsonField<DataSensitivity> = JsonMissing.of(),
        @JsonProperty("dateDisplayHint")
        @ExcludeMissing
        dateDisplayHint: JsonField<DateDisplayHint> = JsonMissing.of(),
        @JsonProperty("deleted") @ExcludeMissing deleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("displayMode")
        @ExcludeMissing
        displayMode: JsonField<DisplayMode> = JsonMissing.of(),
        @JsonProperty("displayOrder")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("enforceMultivalueUniqueness")
        @ExcludeMissing
        enforceMultivalueUniqueness: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("externalOptions")
        @ExcludeMissing
        externalOptions: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("externalOptionsReferenceType")
        @ExcludeMissing
        externalOptionsReferenceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("favorited") @ExcludeMissing favorited: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("favoritedOrder")
        @ExcludeMissing
        favoritedOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fieldType") @ExcludeMissing fieldType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("formField") @ExcludeMissing formField: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("fromUserId") @ExcludeMissing fromUserId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("groupName") @ExcludeMissing groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasUniqueValue")
        @ExcludeMissing
        hasUniqueValue: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hidden") @ExcludeMissing hidden: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hubspotDefined")
        @ExcludeMissing
        hubSpotDefined: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isCustomizedDefault")
        @ExcludeMissing
        isCustomizedDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isMultiValued")
        @ExcludeMissing
        isMultiValued: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isPartial") @ExcludeMissing isPartial: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mutableDefinitionNotDeletable")
        @ExcludeMissing
        mutableDefinitionNotDeletable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numberDisplayHint")
        @ExcludeMissing
        numberDisplayHint: JsonField<NumberDisplayHint> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<AutomationActionsOption>> = JsonMissing.of(),
        @JsonProperty("optionsAreMutable")
        @ExcludeMissing
        optionsAreMutable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("optionSortStrategy")
        @ExcludeMissing
        optionSortStrategy: JsonField<OptionSortStrategy> = JsonMissing.of(),
        @JsonProperty("owningAppId")
        @ExcludeMissing
        owningAppId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("readOnlyDefinition")
        @ExcludeMissing
        readOnlyDefinition: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("readOnlyValue")
        @ExcludeMissing
        readOnlyValue: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("referencedObjectType")
        @ExcludeMissing
        referencedObjectType: JsonField<ReferencedObjectType> = JsonMissing.of(),
        @JsonProperty("searchableInGlobalSearch")
        @ExcludeMissing
        searchableInGlobalSearch: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("searchTextAnalysisMode")
        @ExcludeMissing
        searchTextAnalysisMode: JsonField<SearchTextAnalysisMode> = JsonMissing.of(),
        @JsonProperty("sensitiveDataCategories")
        @ExcludeMissing
        sensitiveDataCategories: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("showCurrencySymbol")
        @ExcludeMissing
        showCurrencySymbol: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("textDisplayHint")
        @ExcludeMissing
        textDisplayHint: JsonField<TextDisplayHint> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(
        allowedObjectTypes,
        calculated,
        canArchive,
        canRestore,
        createdAt,
        createdUserId,
        currencyPropertyName,
        dataSensitivity,
        dateDisplayHint,
        deleted,
        description,
        displayMode,
        displayOrder,
        enforceMultivalueUniqueness,
        externalOptions,
        externalOptionsReferenceType,
        favorited,
        favoritedOrder,
        fieldType,
        formField,
        fromUserId,
        groupName,
        hasUniqueValue,
        hidden,
        hubSpotDefined,
        isCustomizedDefault,
        isMultiValued,
        isPartial,
        label,
        mutableDefinitionNotDeletable,
        name,
        numberDisplayHint,
        options,
        optionsAreMutable,
        optionSortStrategy,
        owningAppId,
        portalId,
        readOnlyDefinition,
        readOnlyValue,
        referencedObjectType,
        searchableInGlobalSearch,
        searchTextAnalysisMode,
        sensitiveDataCategories,
        showCurrencySymbol,
        textDisplayHint,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Object types permitted to use this property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowedObjectTypes(): List<ObjectTypeIdProto> =
        allowedObjectTypes.getRequired("allowedObjectTypes")

    /**
     * Whether the property is a calculated field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun calculated(): Boolean = calculated.getRequired("calculated")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canArchive(): Boolean = canArchive.getRequired("canArchive")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canRestore(): Boolean = canRestore.getRequired("canRestore")

    /**
     * The timestamp when the property was created, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("createdAt")

    /**
     * The ID of the user who created the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdUserId(): Long = createdUserId.getRequired("createdUserId")

    /**
     * The name of the related currency property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyPropertyName(): String = currencyPropertyName.getRequired("currencyPropertyName")

    /**
     * Indicates the sensitivity level of the property, such as "non_sensitive", "sensitive", or
     * "highly_sensitive".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataSensitivity(): DataSensitivity = dataSensitivity.getRequired("dataSensitivity")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateDisplayHint(): DateDisplayHint = dateDisplayHint.getRequired("dateDisplayHint")

    /**
     * Whether the property has been deleted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deleted(): Boolean = deleted.getRequired("deleted")

    /**
     * A summary of the property's purpose.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The mode in which the property is displayed. Can be: "current_value" or
     * "all_unique_versions".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayMode(): DisplayMode = displayMode.getRequired("displayMode")

    /**
     * The position of the item relative to others in the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayOrder(): Int = displayOrder.getRequired("displayOrder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enforceMultivalueUniqueness(): Boolean =
        enforceMultivalueUniqueness.getRequired("enforceMultivalueUniqueness")

    /**
     * Applicable only for enumeration type properties. Should be set to true with a
     * 'referencedObjectType' of 'OWNER'. Otherwise false.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalOptions(): Boolean = externalOptions.getRequired("externalOptions")

    /**
     * When externalOptions is true, indicates the property's option values will be populated from
     * other systems (e.g., "OWNER" for the hubspot_owner_id property).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalOptionsReferenceType(): String =
        externalOptionsReferenceType.getRequired("externalOptionsReferenceType")

    /**
     * Deprecated. Whether the property is marked as a favorite.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun favorited(): Boolean = favorited.getRequired("favorited")

    /**
     * Deprecated. The order position when marked as favorited.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun favoritedOrder(): Int = favoritedOrder.getRequired("favoritedOrder")

    /**
     * Determines how the property will appear in HubSpot's UI or on a form. Learn more in the
     * properties API guide.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldType(): String = fieldType.getRequired("fieldType")

    /**
     * Whether the property can appear on forms.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun formField(): Boolean = formField.getRequired("formField")

    /**
     * The ID of the user who last updated the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromUserId(): Long = fromUserId.getRequired("fromUserId")

    /**
     * The name of the group to which the property is assigned.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupName(): String = groupName.getRequired("groupName")

    /**
     * Whether the property is a unique identifier property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasUniqueValue(): Boolean = hasUniqueValue.getRequired("hasUniqueValue")

    /**
     * Whether or not the property will be hidden from the HubSpot UI. It's recommended that this be
     * set to false for custom properties.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hidden(): Boolean = hidden.getRequired("hidden")

    /**
     * A boolean value set to true for HubSpot default properties.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hubSpotDefined(): Boolean = hubSpotDefined.getRequired("hubspotDefined")

    /**
     * For default properties, whether the property has been customized. Equivalent to the
     * 'isCustomizedDefault' field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCustomizedDefault(): Boolean = isCustomizedDefault.getRequired("isCustomizedDefault")

    /**
     * Whether the property can contain multiple values.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isMultiValued(): Boolean = isMultiValued.getRequired("isMultiValued")

    /**
     * For default properties, whether the property has been customized. Equivalent to the
     * 'isCustomizedDefault' field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPartial(): Boolean = isPartial.getRequired("isPartial")

    /**
     * The display label for the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Whether the property definition can be customized but not deleted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mutableDefinitionNotDeletable(): Boolean =
        mutableDefinitionNotDeletable.getRequired("mutableDefinitionNotDeletable")

    /**
     * The internal name for the property.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Hint for how a number property is displayed and validated in HubSpot's UI. Can be:
     * "unformatted", "formatted", "currency", "percentage", "duration", or "probability".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberDisplayHint(): NumberDisplayHint = numberDisplayHint.getRequired("numberDisplayHint")

    /**
     * A list of valid options for the property. This field is required for enumerated properties.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): List<AutomationActionsOption> = options.getRequired("options")

    /**
     * Whether options can be modified after creation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optionsAreMutable(): Boolean = optionsAreMutable.getRequired("optionsAreMutable")

    /**
     * Specifies how to sort property options. Can be either "DISPLAY_ORDER" to defer to the
     * displayOrder field, or "ALPHABETICAL".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optionSortStrategy(): OptionSortStrategy =
        optionSortStrategy.getRequired("optionSortStrategy")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun owningAppId(): Long = owningAppId.getRequired("owningAppId")

    /**
     * The ID of the HubSpot account where the property is defined.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalId(): Long = portalId.getRequired("portalId")

    /**
     * Whether the property's description is read-only.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readOnlyDefinition(): Boolean = readOnlyDefinition.getRequired("readOnlyDefinition")

    /**
     * Indicates if the property's value is read-only.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readOnlyValue(): Boolean = readOnlyValue.getRequired("readOnlyValue")

    /**
     * Deprecated. Use externalOptionsReferenceType instead.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referencedObjectType(): ReferencedObjectType =
        referencedObjectType.getRequired("referencedObjectType")

    /**
     * Whether the property is searchable globaly.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchableInGlobalSearch(): Boolean =
        searchableInGlobalSearch.getRequired("searchableInGlobalSearch")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun searchTextAnalysisMode(): SearchTextAnalysisMode =
        searchTextAnalysisMode.getRequired("searchTextAnalysisMode")

    /**
     * When sensitiveData is true, lists the type of sensitive data contained in the property (e.g.,
     * "HIPAA").
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sensitiveDataCategories(): List<String> =
        sensitiveDataCategories.getRequired("sensitiveDataCategories")

    /**
     * Whether to show the currency symbol in HubSpot's UI.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun showCurrencySymbol(): Boolean = showCurrencySymbol.getRequired("showCurrencySymbol")

    /**
     * Hint for how the text is displayed and validated in HubSpot's UI. Can be:
     * "unformatted_single_line", "multi_line", "email", "phone_number", "domain_name",
     * "ip_address", "physical_address", or "postal_code".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun textDisplayHint(): TextDisplayHint = textDisplayHint.getRequired("textDisplayHint")

    /**
     * The data type of the property, such as string or number.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The timestamp when the property was last updated, in ISO 8601 format.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Long = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [allowedObjectTypes].
     *
     * Unlike [allowedObjectTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowedObjectTypes")
    @ExcludeMissing
    fun _allowedObjectTypes(): JsonField<List<ObjectTypeIdProto>> = allowedObjectTypes

    /**
     * Returns the raw JSON value of [calculated].
     *
     * Unlike [calculated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calculated") @ExcludeMissing fun _calculated(): JsonField<Boolean> = calculated

    /**
     * Returns the raw JSON value of [canArchive].
     *
     * Unlike [canArchive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canArchive") @ExcludeMissing fun _canArchive(): JsonField<Boolean> = canArchive

    /**
     * Returns the raw JSON value of [canRestore].
     *
     * Unlike [canRestore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canRestore") @ExcludeMissing fun _canRestore(): JsonField<Boolean> = canRestore

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [createdUserId].
     *
     * Unlike [createdUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdUserId")
    @ExcludeMissing
    fun _createdUserId(): JsonField<Long> = createdUserId

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
     * Returns the raw JSON value of [deleted].
     *
     * Unlike [deleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted") @ExcludeMissing fun _deleted(): JsonField<Boolean> = deleted

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [displayMode].
     *
     * Unlike [displayMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayMode")
    @ExcludeMissing
    fun _displayMode(): JsonField<DisplayMode> = displayMode

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayOrder") @ExcludeMissing fun _displayOrder(): JsonField<Int> = displayOrder

    /**
     * Returns the raw JSON value of [enforceMultivalueUniqueness].
     *
     * Unlike [enforceMultivalueUniqueness], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enforceMultivalueUniqueness")
    @ExcludeMissing
    fun _enforceMultivalueUniqueness(): JsonField<Boolean> = enforceMultivalueUniqueness

    /**
     * Returns the raw JSON value of [externalOptions].
     *
     * Unlike [externalOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalOptions")
    @ExcludeMissing
    fun _externalOptions(): JsonField<Boolean> = externalOptions

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
     * Returns the raw JSON value of [favorited].
     *
     * Unlike [favorited], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("favorited") @ExcludeMissing fun _favorited(): JsonField<Boolean> = favorited

    /**
     * Returns the raw JSON value of [favoritedOrder].
     *
     * Unlike [favoritedOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("favoritedOrder")
    @ExcludeMissing
    fun _favoritedOrder(): JsonField<Int> = favoritedOrder

    /**
     * Returns the raw JSON value of [fieldType].
     *
     * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldType") @ExcludeMissing fun _fieldType(): JsonField<String> = fieldType

    /**
     * Returns the raw JSON value of [formField].
     *
     * Unlike [formField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formField") @ExcludeMissing fun _formField(): JsonField<Boolean> = formField

    /**
     * Returns the raw JSON value of [fromUserId].
     *
     * Unlike [fromUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fromUserId") @ExcludeMissing fun _fromUserId(): JsonField<Long> = fromUserId

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
     * Returns the raw JSON value of [hubSpotDefined].
     *
     * Unlike [hubSpotDefined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hubspotDefined")
    @ExcludeMissing
    fun _hubSpotDefined(): JsonField<Boolean> = hubSpotDefined

    /**
     * Returns the raw JSON value of [isCustomizedDefault].
     *
     * Unlike [isCustomizedDefault], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isCustomizedDefault")
    @ExcludeMissing
    fun _isCustomizedDefault(): JsonField<Boolean> = isCustomizedDefault

    /**
     * Returns the raw JSON value of [isMultiValued].
     *
     * Unlike [isMultiValued], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isMultiValued")
    @ExcludeMissing
    fun _isMultiValued(): JsonField<Boolean> = isMultiValued

    /**
     * Returns the raw JSON value of [isPartial].
     *
     * Unlike [isPartial], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPartial") @ExcludeMissing fun _isPartial(): JsonField<Boolean> = isPartial

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [mutableDefinitionNotDeletable].
     *
     * Unlike [mutableDefinitionNotDeletable], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("mutableDefinitionNotDeletable")
    @ExcludeMissing
    fun _mutableDefinitionNotDeletable(): JsonField<Boolean> = mutableDefinitionNotDeletable

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
    @JsonProperty("options")
    @ExcludeMissing
    fun _options(): JsonField<List<AutomationActionsOption>> = options

    /**
     * Returns the raw JSON value of [optionsAreMutable].
     *
     * Unlike [optionsAreMutable], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optionsAreMutable")
    @ExcludeMissing
    fun _optionsAreMutable(): JsonField<Boolean> = optionsAreMutable

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
     * Returns the raw JSON value of [owningAppId].
     *
     * Unlike [owningAppId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owningAppId") @ExcludeMissing fun _owningAppId(): JsonField<Long> = owningAppId

    /**
     * Returns the raw JSON value of [portalId].
     *
     * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Long> = portalId

    /**
     * Returns the raw JSON value of [readOnlyDefinition].
     *
     * Unlike [readOnlyDefinition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("readOnlyDefinition")
    @ExcludeMissing
    fun _readOnlyDefinition(): JsonField<Boolean> = readOnlyDefinition

    /**
     * Returns the raw JSON value of [readOnlyValue].
     *
     * Unlike [readOnlyValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readOnlyValue")
    @ExcludeMissing
    fun _readOnlyValue(): JsonField<Boolean> = readOnlyValue

    /**
     * Returns the raw JSON value of [referencedObjectType].
     *
     * Unlike [referencedObjectType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedObjectType")
    @ExcludeMissing
    fun _referencedObjectType(): JsonField<ReferencedObjectType> = referencedObjectType

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
     * Returns the raw JSON value of [searchTextAnalysisMode].
     *
     * Unlike [searchTextAnalysisMode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("searchTextAnalysisMode")
    @ExcludeMissing
    fun _searchTextAnalysisMode(): JsonField<SearchTextAnalysisMode> = searchTextAnalysisMode

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
     * Returns the raw JSON value of [textDisplayHint].
     *
     * Unlike [textDisplayHint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("textDisplayHint")
    @ExcludeMissing
    fun _textDisplayHint(): JsonField<TextDisplayHint> = textDisplayHint

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Property].
         *
         * The following fields are required:
         * ```java
         * .allowedObjectTypes()
         * .calculated()
         * .canArchive()
         * .canRestore()
         * .createdAt()
         * .createdUserId()
         * .currencyPropertyName()
         * .dataSensitivity()
         * .dateDisplayHint()
         * .deleted()
         * .description()
         * .displayMode()
         * .displayOrder()
         * .enforceMultivalueUniqueness()
         * .externalOptions()
         * .externalOptionsReferenceType()
         * .favorited()
         * .favoritedOrder()
         * .fieldType()
         * .formField()
         * .fromUserId()
         * .groupName()
         * .hasUniqueValue()
         * .hidden()
         * .hubSpotDefined()
         * .isCustomizedDefault()
         * .isMultiValued()
         * .isPartial()
         * .label()
         * .mutableDefinitionNotDeletable()
         * .name()
         * .numberDisplayHint()
         * .options()
         * .optionsAreMutable()
         * .optionSortStrategy()
         * .owningAppId()
         * .portalId()
         * .readOnlyDefinition()
         * .readOnlyValue()
         * .referencedObjectType()
         * .searchableInGlobalSearch()
         * .searchTextAnalysisMode()
         * .sensitiveDataCategories()
         * .showCurrencySymbol()
         * .textDisplayHint()
         * .type()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Property]. */
    class Builder internal constructor() {

        private var allowedObjectTypes: JsonField<MutableList<ObjectTypeIdProto>>? = null
        private var calculated: JsonField<Boolean>? = null
        private var canArchive: JsonField<Boolean>? = null
        private var canRestore: JsonField<Boolean>? = null
        private var createdAt: JsonField<Long>? = null
        private var createdUserId: JsonField<Long>? = null
        private var currencyPropertyName: JsonField<String>? = null
        private var dataSensitivity: JsonField<DataSensitivity>? = null
        private var dateDisplayHint: JsonField<DateDisplayHint>? = null
        private var deleted: JsonField<Boolean>? = null
        private var description: JsonField<String>? = null
        private var displayMode: JsonField<DisplayMode>? = null
        private var displayOrder: JsonField<Int>? = null
        private var enforceMultivalueUniqueness: JsonField<Boolean>? = null
        private var externalOptions: JsonField<Boolean>? = null
        private var externalOptionsReferenceType: JsonField<String>? = null
        private var favorited: JsonField<Boolean>? = null
        private var favoritedOrder: JsonField<Int>? = null
        private var fieldType: JsonField<String>? = null
        private var formField: JsonField<Boolean>? = null
        private var fromUserId: JsonField<Long>? = null
        private var groupName: JsonField<String>? = null
        private var hasUniqueValue: JsonField<Boolean>? = null
        private var hidden: JsonField<Boolean>? = null
        private var hubSpotDefined: JsonField<Boolean>? = null
        private var isCustomizedDefault: JsonField<Boolean>? = null
        private var isMultiValued: JsonField<Boolean>? = null
        private var isPartial: JsonField<Boolean>? = null
        private var label: JsonField<String>? = null
        private var mutableDefinitionNotDeletable: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var numberDisplayHint: JsonField<NumberDisplayHint>? = null
        private var options: JsonField<MutableList<AutomationActionsOption>>? = null
        private var optionsAreMutable: JsonField<Boolean>? = null
        private var optionSortStrategy: JsonField<OptionSortStrategy>? = null
        private var owningAppId: JsonField<Long>? = null
        private var portalId: JsonField<Long>? = null
        private var readOnlyDefinition: JsonField<Boolean>? = null
        private var readOnlyValue: JsonField<Boolean>? = null
        private var referencedObjectType: JsonField<ReferencedObjectType>? = null
        private var searchableInGlobalSearch: JsonField<Boolean>? = null
        private var searchTextAnalysisMode: JsonField<SearchTextAnalysisMode>? = null
        private var sensitiveDataCategories: JsonField<MutableList<String>>? = null
        private var showCurrencySymbol: JsonField<Boolean>? = null
        private var textDisplayHint: JsonField<TextDisplayHint>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(property: Property) = apply {
            allowedObjectTypes = property.allowedObjectTypes.map { it.toMutableList() }
            calculated = property.calculated
            canArchive = property.canArchive
            canRestore = property.canRestore
            createdAt = property.createdAt
            createdUserId = property.createdUserId
            currencyPropertyName = property.currencyPropertyName
            dataSensitivity = property.dataSensitivity
            dateDisplayHint = property.dateDisplayHint
            deleted = property.deleted
            description = property.description
            displayMode = property.displayMode
            displayOrder = property.displayOrder
            enforceMultivalueUniqueness = property.enforceMultivalueUniqueness
            externalOptions = property.externalOptions
            externalOptionsReferenceType = property.externalOptionsReferenceType
            favorited = property.favorited
            favoritedOrder = property.favoritedOrder
            fieldType = property.fieldType
            formField = property.formField
            fromUserId = property.fromUserId
            groupName = property.groupName
            hasUniqueValue = property.hasUniqueValue
            hidden = property.hidden
            hubSpotDefined = property.hubSpotDefined
            isCustomizedDefault = property.isCustomizedDefault
            isMultiValued = property.isMultiValued
            isPartial = property.isPartial
            label = property.label
            mutableDefinitionNotDeletable = property.mutableDefinitionNotDeletable
            name = property.name
            numberDisplayHint = property.numberDisplayHint
            options = property.options.map { it.toMutableList() }
            optionsAreMutable = property.optionsAreMutable
            optionSortStrategy = property.optionSortStrategy
            owningAppId = property.owningAppId
            portalId = property.portalId
            readOnlyDefinition = property.readOnlyDefinition
            readOnlyValue = property.readOnlyValue
            referencedObjectType = property.referencedObjectType
            searchableInGlobalSearch = property.searchableInGlobalSearch
            searchTextAnalysisMode = property.searchTextAnalysisMode
            sensitiveDataCategories = property.sensitiveDataCategories.map { it.toMutableList() }
            showCurrencySymbol = property.showCurrencySymbol
            textDisplayHint = property.textDisplayHint
            type = property.type
            updatedAt = property.updatedAt
            additionalProperties = property.additionalProperties.toMutableMap()
        }

        /** Object types permitted to use this property. */
        fun allowedObjectTypes(allowedObjectTypes: List<ObjectTypeIdProto>) =
            allowedObjectTypes(JsonField.of(allowedObjectTypes))

        /**
         * Sets [Builder.allowedObjectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedObjectTypes] with a well-typed
         * `List<ObjectTypeIdProto>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun allowedObjectTypes(allowedObjectTypes: JsonField<List<ObjectTypeIdProto>>) = apply {
            this.allowedObjectTypes = allowedObjectTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [ObjectTypeIdProto] to [allowedObjectTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedObjectType(allowedObjectType: ObjectTypeIdProto) = apply {
            allowedObjectTypes =
                (allowedObjectTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedObjectTypes", it).add(allowedObjectType)
                }
        }

        /** Whether the property is a calculated field. */
        fun calculated(calculated: Boolean) = calculated(JsonField.of(calculated))

        /**
         * Sets [Builder.calculated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calculated(calculated: JsonField<Boolean>) = apply { this.calculated = calculated }

        fun canArchive(canArchive: Boolean) = canArchive(JsonField.of(canArchive))

        /**
         * Sets [Builder.canArchive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canArchive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canArchive(canArchive: JsonField<Boolean>) = apply { this.canArchive = canArchive }

        fun canRestore(canRestore: Boolean) = canRestore(JsonField.of(canRestore))

        /**
         * Sets [Builder.canRestore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canRestore] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canRestore(canRestore: JsonField<Boolean>) = apply { this.canRestore = canRestore }

        /** The timestamp when the property was created, in ISO 8601 format. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** The ID of the user who created the property. */
        fun createdUserId(createdUserId: Long) = createdUserId(JsonField.of(createdUserId))

        /**
         * Sets [Builder.createdUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdUserId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdUserId(createdUserId: JsonField<Long>) = apply {
            this.createdUserId = createdUserId
        }

        /** The name of the related currency property. */
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

        /**
         * Indicates the sensitivity level of the property, such as "non_sensitive", "sensitive", or
         * "highly_sensitive".
         */
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

        /** Whether the property has been deleted. */
        fun deleted(deleted: Boolean) = deleted(JsonField.of(deleted))

        /**
         * Sets [Builder.deleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deleted(deleted: JsonField<Boolean>) = apply { this.deleted = deleted }

        /** A summary of the property's purpose. */
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
         * The mode in which the property is displayed. Can be: "current_value" or
         * "all_unique_versions".
         */
        fun displayMode(displayMode: DisplayMode) = displayMode(JsonField.of(displayMode))

        /**
         * Sets [Builder.displayMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayMode] with a well-typed [DisplayMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun displayMode(displayMode: JsonField<DisplayMode>) = apply {
            this.displayMode = displayMode
        }

        /** The position of the item relative to others in the list. */
        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        fun enforceMultivalueUniqueness(enforceMultivalueUniqueness: Boolean) =
            enforceMultivalueUniqueness(JsonField.of(enforceMultivalueUniqueness))

        /**
         * Sets [Builder.enforceMultivalueUniqueness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enforceMultivalueUniqueness] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enforceMultivalueUniqueness(enforceMultivalueUniqueness: JsonField<Boolean>) = apply {
            this.enforceMultivalueUniqueness = enforceMultivalueUniqueness
        }

        /**
         * Applicable only for enumeration type properties. Should be set to true with a
         * 'referencedObjectType' of 'OWNER'. Otherwise false.
         */
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

        /**
         * When externalOptions is true, indicates the property's option values will be populated
         * from other systems (e.g., "OWNER" for the hubspot_owner_id property).
         */
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

        /** Deprecated. Whether the property is marked as a favorite. */
        fun favorited(favorited: Boolean) = favorited(JsonField.of(favorited))

        /**
         * Sets [Builder.favorited] to an arbitrary JSON value.
         *
         * You should usually call [Builder.favorited] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun favorited(favorited: JsonField<Boolean>) = apply { this.favorited = favorited }

        /** Deprecated. The order position when marked as favorited. */
        fun favoritedOrder(favoritedOrder: Int) = favoritedOrder(JsonField.of(favoritedOrder))

        /**
         * Sets [Builder.favoritedOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.favoritedOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun favoritedOrder(favoritedOrder: JsonField<Int>) = apply {
            this.favoritedOrder = favoritedOrder
        }

        /**
         * Determines how the property will appear in HubSpot's UI or on a form. Learn more in the
         * properties API guide.
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

        /** Whether the property can appear on forms. */
        fun formField(formField: Boolean) = formField(JsonField.of(formField))

        /**
         * Sets [Builder.formField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formField] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formField(formField: JsonField<Boolean>) = apply { this.formField = formField }

        /** The ID of the user who last updated the property. */
        fun fromUserId(fromUserId: Long) = fromUserId(JsonField.of(fromUserId))

        /**
         * Sets [Builder.fromUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromUserId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fromUserId(fromUserId: JsonField<Long>) = apply { this.fromUserId = fromUserId }

        /** The name of the group to which the property is assigned. */
        fun groupName(groupName: String) = groupName(JsonField.of(groupName))

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

        /** Whether the property is a unique identifier property. */
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

        /**
         * Whether or not the property will be hidden from the HubSpot UI. It's recommended that
         * this be set to false for custom properties.
         */
        fun hidden(hidden: Boolean) = hidden(JsonField.of(hidden))

        /**
         * Sets [Builder.hidden] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hidden] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hidden(hidden: JsonField<Boolean>) = apply { this.hidden = hidden }

        /** A boolean value set to true for HubSpot default properties. */
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

        /**
         * For default properties, whether the property has been customized. Equivalent to the
         * 'isCustomizedDefault' field.
         */
        fun isCustomizedDefault(isCustomizedDefault: Boolean) =
            isCustomizedDefault(JsonField.of(isCustomizedDefault))

        /**
         * Sets [Builder.isCustomizedDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCustomizedDefault] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isCustomizedDefault(isCustomizedDefault: JsonField<Boolean>) = apply {
            this.isCustomizedDefault = isCustomizedDefault
        }

        /** Whether the property can contain multiple values. */
        fun isMultiValued(isMultiValued: Boolean) = isMultiValued(JsonField.of(isMultiValued))

        /**
         * Sets [Builder.isMultiValued] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMultiValued] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isMultiValued(isMultiValued: JsonField<Boolean>) = apply {
            this.isMultiValued = isMultiValued
        }

        /**
         * For default properties, whether the property has been customized. Equivalent to the
         * 'isCustomizedDefault' field.
         */
        fun isPartial(isPartial: Boolean) = isPartial(JsonField.of(isPartial))

        /**
         * Sets [Builder.isPartial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPartial] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPartial(isPartial: JsonField<Boolean>) = apply { this.isPartial = isPartial }

        /** The display label for the property. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Whether the property definition can be customized but not deleted. */
        fun mutableDefinitionNotDeletable(mutableDefinitionNotDeletable: Boolean) =
            mutableDefinitionNotDeletable(JsonField.of(mutableDefinitionNotDeletable))

        /**
         * Sets [Builder.mutableDefinitionNotDeletable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mutableDefinitionNotDeletable] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun mutableDefinitionNotDeletable(mutableDefinitionNotDeletable: JsonField<Boolean>) =
            apply {
                this.mutableDefinitionNotDeletable = mutableDefinitionNotDeletable
            }

        /** The internal name for the property. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Hint for how a number property is displayed and validated in HubSpot's UI. Can be:
         * "unformatted", "formatted", "currency", "percentage", "duration", or "probability".
         */
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
         * A list of valid options for the property. This field is required for enumerated
         * properties.
         */
        fun options(options: List<AutomationActionsOption>) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed
         * `List<AutomationActionsOption>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<List<AutomationActionsOption>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [AutomationActionsOption] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: AutomationActionsOption) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
                }
        }

        /** Whether options can be modified after creation. */
        fun optionsAreMutable(optionsAreMutable: Boolean) =
            optionsAreMutable(JsonField.of(optionsAreMutable))

        /**
         * Sets [Builder.optionsAreMutable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionsAreMutable] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optionsAreMutable(optionsAreMutable: JsonField<Boolean>) = apply {
            this.optionsAreMutable = optionsAreMutable
        }

        /**
         * Specifies how to sort property options. Can be either "DISPLAY_ORDER" to defer to the
         * displayOrder field, or "ALPHABETICAL".
         */
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

        fun owningAppId(owningAppId: Long) = owningAppId(JsonField.of(owningAppId))

        /**
         * Sets [Builder.owningAppId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owningAppId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun owningAppId(owningAppId: JsonField<Long>) = apply { this.owningAppId = owningAppId }

        /** The ID of the HubSpot account where the property is defined. */
        fun portalId(portalId: Long) = portalId(JsonField.of(portalId))

        /**
         * Sets [Builder.portalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portalId(portalId: JsonField<Long>) = apply { this.portalId = portalId }

        /** Whether the property's description is read-only. */
        fun readOnlyDefinition(readOnlyDefinition: Boolean) =
            readOnlyDefinition(JsonField.of(readOnlyDefinition))

        /**
         * Sets [Builder.readOnlyDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnlyDefinition] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readOnlyDefinition(readOnlyDefinition: JsonField<Boolean>) = apply {
            this.readOnlyDefinition = readOnlyDefinition
        }

        /** Indicates if the property's value is read-only. */
        fun readOnlyValue(readOnlyValue: Boolean) = readOnlyValue(JsonField.of(readOnlyValue))

        /**
         * Sets [Builder.readOnlyValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnlyValue] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readOnlyValue(readOnlyValue: JsonField<Boolean>) = apply {
            this.readOnlyValue = readOnlyValue
        }

        /** Deprecated. Use externalOptionsReferenceType instead. */
        fun referencedObjectType(referencedObjectType: ReferencedObjectType) =
            referencedObjectType(JsonField.of(referencedObjectType))

        /**
         * Sets [Builder.referencedObjectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedObjectType] with a well-typed
         * [ReferencedObjectType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun referencedObjectType(referencedObjectType: JsonField<ReferencedObjectType>) = apply {
            this.referencedObjectType = referencedObjectType
        }

        /** Whether the property is searchable globaly. */
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

        fun searchTextAnalysisMode(searchTextAnalysisMode: SearchTextAnalysisMode) =
            searchTextAnalysisMode(JsonField.of(searchTextAnalysisMode))

        /**
         * Sets [Builder.searchTextAnalysisMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchTextAnalysisMode] with a well-typed
         * [SearchTextAnalysisMode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun searchTextAnalysisMode(searchTextAnalysisMode: JsonField<SearchTextAnalysisMode>) =
            apply {
                this.searchTextAnalysisMode = searchTextAnalysisMode
            }

        /**
         * When sensitiveData is true, lists the type of sensitive data contained in the property
         * (e.g., "HIPAA").
         */
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

        /** Whether to show the currency symbol in HubSpot's UI. */
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

        /**
         * Hint for how the text is displayed and validated in HubSpot's UI. Can be:
         * "unformatted_single_line", "multi_line", "email", "phone_number", "domain_name",
         * "ip_address", "physical_address", or "postal_code".
         */
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

        /** The data type of the property, such as string or number. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The timestamp when the property was last updated, in ISO 8601 format. */
        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Property].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allowedObjectTypes()
         * .calculated()
         * .canArchive()
         * .canRestore()
         * .createdAt()
         * .createdUserId()
         * .currencyPropertyName()
         * .dataSensitivity()
         * .dateDisplayHint()
         * .deleted()
         * .description()
         * .displayMode()
         * .displayOrder()
         * .enforceMultivalueUniqueness()
         * .externalOptions()
         * .externalOptionsReferenceType()
         * .favorited()
         * .favoritedOrder()
         * .fieldType()
         * .formField()
         * .fromUserId()
         * .groupName()
         * .hasUniqueValue()
         * .hidden()
         * .hubSpotDefined()
         * .isCustomizedDefault()
         * .isMultiValued()
         * .isPartial()
         * .label()
         * .mutableDefinitionNotDeletable()
         * .name()
         * .numberDisplayHint()
         * .options()
         * .optionsAreMutable()
         * .optionSortStrategy()
         * .owningAppId()
         * .portalId()
         * .readOnlyDefinition()
         * .readOnlyValue()
         * .referencedObjectType()
         * .searchableInGlobalSearch()
         * .searchTextAnalysisMode()
         * .sensitiveDataCategories()
         * .showCurrencySymbol()
         * .textDisplayHint()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Property =
            Property(
                checkRequired("allowedObjectTypes", allowedObjectTypes).map { it.toImmutable() },
                checkRequired("calculated", calculated),
                checkRequired("canArchive", canArchive),
                checkRequired("canRestore", canRestore),
                checkRequired("createdAt", createdAt),
                checkRequired("createdUserId", createdUserId),
                checkRequired("currencyPropertyName", currencyPropertyName),
                checkRequired("dataSensitivity", dataSensitivity),
                checkRequired("dateDisplayHint", dateDisplayHint),
                checkRequired("deleted", deleted),
                checkRequired("description", description),
                checkRequired("displayMode", displayMode),
                checkRequired("displayOrder", displayOrder),
                checkRequired("enforceMultivalueUniqueness", enforceMultivalueUniqueness),
                checkRequired("externalOptions", externalOptions),
                checkRequired("externalOptionsReferenceType", externalOptionsReferenceType),
                checkRequired("favorited", favorited),
                checkRequired("favoritedOrder", favoritedOrder),
                checkRequired("fieldType", fieldType),
                checkRequired("formField", formField),
                checkRequired("fromUserId", fromUserId),
                checkRequired("groupName", groupName),
                checkRequired("hasUniqueValue", hasUniqueValue),
                checkRequired("hidden", hidden),
                checkRequired("hubSpotDefined", hubSpotDefined),
                checkRequired("isCustomizedDefault", isCustomizedDefault),
                checkRequired("isMultiValued", isMultiValued),
                checkRequired("isPartial", isPartial),
                checkRequired("label", label),
                checkRequired("mutableDefinitionNotDeletable", mutableDefinitionNotDeletable),
                checkRequired("name", name),
                checkRequired("numberDisplayHint", numberDisplayHint),
                checkRequired("options", options).map { it.toImmutable() },
                checkRequired("optionsAreMutable", optionsAreMutable),
                checkRequired("optionSortStrategy", optionSortStrategy),
                checkRequired("owningAppId", owningAppId),
                checkRequired("portalId", portalId),
                checkRequired("readOnlyDefinition", readOnlyDefinition),
                checkRequired("readOnlyValue", readOnlyValue),
                checkRequired("referencedObjectType", referencedObjectType),
                checkRequired("searchableInGlobalSearch", searchableInGlobalSearch),
                checkRequired("searchTextAnalysisMode", searchTextAnalysisMode),
                checkRequired("sensitiveDataCategories", sensitiveDataCategories).map {
                    it.toImmutable()
                },
                checkRequired("showCurrencySymbol", showCurrencySymbol),
                checkRequired("textDisplayHint", textDisplayHint),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Property = apply {
        if (validated) {
            return@apply
        }

        allowedObjectTypes().forEach { it.validate() }
        calculated()
        canArchive()
        canRestore()
        createdAt()
        createdUserId()
        currencyPropertyName()
        dataSensitivity().validate()
        dateDisplayHint().validate()
        deleted()
        description()
        displayMode().validate()
        displayOrder()
        enforceMultivalueUniqueness()
        externalOptions()
        externalOptionsReferenceType()
        favorited()
        favoritedOrder()
        fieldType()
        formField()
        fromUserId()
        groupName()
        hasUniqueValue()
        hidden()
        hubSpotDefined()
        isCustomizedDefault()
        isMultiValued()
        isPartial()
        label()
        mutableDefinitionNotDeletable()
        name()
        numberDisplayHint().validate()
        options().forEach { it.validate() }
        optionsAreMutable()
        optionSortStrategy().validate()
        owningAppId()
        portalId()
        readOnlyDefinition()
        readOnlyValue()
        referencedObjectType().validate()
        searchableInGlobalSearch()
        searchTextAnalysisMode().validate()
        sensitiveDataCategories()
        showCurrencySymbol()
        textDisplayHint().validate()
        type().validate()
        updatedAt()
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
        (allowedObjectTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (calculated.asKnown().isPresent) 1 else 0) +
            (if (canArchive.asKnown().isPresent) 1 else 0) +
            (if (canRestore.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdUserId.asKnown().isPresent) 1 else 0) +
            (if (currencyPropertyName.asKnown().isPresent) 1 else 0) +
            (dataSensitivity.asKnown().getOrNull()?.validity() ?: 0) +
            (dateDisplayHint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (deleted.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (displayMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (if (enforceMultivalueUniqueness.asKnown().isPresent) 1 else 0) +
            (if (externalOptions.asKnown().isPresent) 1 else 0) +
            (if (externalOptionsReferenceType.asKnown().isPresent) 1 else 0) +
            (if (favorited.asKnown().isPresent) 1 else 0) +
            (if (favoritedOrder.asKnown().isPresent) 1 else 0) +
            (if (fieldType.asKnown().isPresent) 1 else 0) +
            (if (formField.asKnown().isPresent) 1 else 0) +
            (if (fromUserId.asKnown().isPresent) 1 else 0) +
            (if (groupName.asKnown().isPresent) 1 else 0) +
            (if (hasUniqueValue.asKnown().isPresent) 1 else 0) +
            (if (hidden.asKnown().isPresent) 1 else 0) +
            (if (hubSpotDefined.asKnown().isPresent) 1 else 0) +
            (if (isCustomizedDefault.asKnown().isPresent) 1 else 0) +
            (if (isMultiValued.asKnown().isPresent) 1 else 0) +
            (if (isPartial.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (mutableDefinitionNotDeletable.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (numberDisplayHint.asKnown().getOrNull()?.validity() ?: 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (optionsAreMutable.asKnown().isPresent) 1 else 0) +
            (optionSortStrategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (owningAppId.asKnown().isPresent) 1 else 0) +
            (if (portalId.asKnown().isPresent) 1 else 0) +
            (if (readOnlyDefinition.asKnown().isPresent) 1 else 0) +
            (if (readOnlyValue.asKnown().isPresent) 1 else 0) +
            (referencedObjectType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (searchableInGlobalSearch.asKnown().isPresent) 1 else 0) +
            (searchTextAnalysisMode.asKnown().getOrNull()?.validity() ?: 0) +
            (sensitiveDataCategories.asKnown().getOrNull()?.size ?: 0) +
            (if (showCurrencySymbol.asKnown().isPresent) 1 else 0) +
            (textDisplayHint.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * Indicates the sensitivity level of the property, such as "non_sensitive", "sensitive", or
     * "highly_sensitive".
     */
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

            @JvmField val HIGH = of("high")

            @JvmField val NONE = of("none")

            @JvmField val STANDARD = of("standard")

            @JvmStatic fun of(value: String) = DataSensitivity(JsonField.of(value))
        }

        /** An enum containing [DataSensitivity]'s known values. */
        enum class Known {
            HIGH,
            NONE,
            STANDARD,
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
            HIGH,
            NONE,
            STANDARD,
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
                HIGH -> Value.HIGH
                NONE -> Value.NONE
                STANDARD -> Value.STANDARD
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
                HIGH -> Known.HIGH
                NONE -> Known.NONE
                STANDARD -> Known.STANDARD
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

    /**
     * The mode in which the property is displayed. Can be: "current_value" or
     * "all_unique_versions".
     */
    class DisplayMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALL_UNIQUE_VERSIONS = of("all_unique_versions")

            @JvmField val CURRENT_VALUE = of("current_value")

            @JvmStatic fun of(value: String) = DisplayMode(JsonField.of(value))
        }

        /** An enum containing [DisplayMode]'s known values. */
        enum class Known {
            ALL_UNIQUE_VERSIONS,
            CURRENT_VALUE,
        }

        /**
         * An enum containing [DisplayMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DisplayMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL_UNIQUE_VERSIONS,
            CURRENT_VALUE,
            /**
             * An enum member indicating that [DisplayMode] was instantiated with an unknown value.
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
                ALL_UNIQUE_VERSIONS -> Value.ALL_UNIQUE_VERSIONS
                CURRENT_VALUE -> Value.CURRENT_VALUE
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
                ALL_UNIQUE_VERSIONS -> Known.ALL_UNIQUE_VERSIONS
                CURRENT_VALUE -> Known.CURRENT_VALUE
                else -> throw HubSpotInvalidDataException("Unknown DisplayMode: $value")
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

        fun validate(): DisplayMode = apply {
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

            return other is DisplayMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Hint for how a number property is displayed and validated in HubSpot's UI. Can be:
     * "unformatted", "formatted", "currency", "percentage", "duration", or "probability".
     */
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

    /**
     * Specifies how to sort property options. Can be either "DISPLAY_ORDER" to defer to the
     * displayOrder field, or "ALPHABETICAL".
     */
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

    /** Deprecated. Use externalOptionsReferenceType instead. */
    class ReferencedObjectType
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

            @JvmField val ABANDONED_CART = of("ABANDONED_CART")

            @JvmField val ACCEPTANCE_TEST = of("ACCEPTANCE_TEST")

            @JvmField val AD = of("AD")

            @JvmField val AD_ACCOUNT = of("AD_ACCOUNT")

            @JvmField val AD_CAMPAIGN = of("AD_CAMPAIGN")

            @JvmField val AD_GROUP = of("AD_GROUP")

            @JvmField val AI_FORECAST = of("AI_FORECAST")

            @JvmField val ALL_PAGES = of("ALL_PAGES")

            @JvmField val APPROVAL = of("APPROVAL")

            @JvmField val APPROVAL_STEP = of("APPROVAL_STEP")

            @JvmField val ATTRIBUTION = of("ATTRIBUTION")

            @JvmField val AUDIENCE = of("AUDIENCE")

            @JvmField val AUTOMATION_JOURNEY = of("AUTOMATION_JOURNEY")

            @JvmField val AUTOMATION_PLATFORM_FLOW = of("AUTOMATION_PLATFORM_FLOW")

            @JvmField val AUTOMATION_PLATFORM_FLOW_ACTION = of("AUTOMATION_PLATFORM_FLOW_ACTION")

            @JvmField val BET_ALERT = of("BET_ALERT")

            @JvmField val BET_DELIVERABLE_SERVICE = of("BET_DELIVERABLE_SERVICE")

            @JvmField val BLOG_LISTING_PAGE = of("BLOG_LISTING_PAGE")

            @JvmField val BLOG_POST = of("BLOG_POST")

            @JvmField val CALL = of("CALL")

            @JvmField val CAMPAIGN = of("CAMPAIGN")

            @JvmField val CAMPAIGN_BUDGET_ITEM = of("CAMPAIGN_BUDGET_ITEM")

            @JvmField val CAMPAIGN_SPEND_ITEM = of("CAMPAIGN_SPEND_ITEM")

            @JvmField val CAMPAIGN_STEP = of("CAMPAIGN_STEP")

            @JvmField val CAMPAIGN_TEMPLATE = of("CAMPAIGN_TEMPLATE")

            @JvmField val CAMPAIGN_TEMPLATE_STEP = of("CAMPAIGN_TEMPLATE_STEP")

            @JvmField val CART = of("CART")

            @JvmField val CASE_STUDY = of("CASE_STUDY")

            @JvmField val CHATFLOW = of("CHATFLOW")

            @JvmField val CLIP = of("CLIP")

            @JvmField val CMS_URL = of("CMS_URL")

            @JvmField val COMBO_EVENT_CONFIGURATION = of("COMBO_EVENT_CONFIGURATION")

            @JvmField val COMMERCE_PAYMENT = of("COMMERCE_PAYMENT")

            @JvmField val COMMUNICATION = of("COMMUNICATION")

            @JvmField val COMPANY = of("COMPANY")

            @JvmField val CONTACT = of("CONTACT")

            @JvmField val CONTACT_CREATE_ATTRIBUTION = of("CONTACT_CREATE_ATTRIBUTION")

            @JvmField val CONTENT = of("CONTENT")

            @JvmField val CONTENT_AUDIT = of("CONTENT_AUDIT")

            @JvmField val CONTENT_AUDIT_PAGE = of("CONTENT_AUDIT_PAGE")

            @JvmField val CONVERSATION = of("CONVERSATION")

            @JvmField val CONVERSATION_INBOX = of("CONVERSATION_INBOX")

            @JvmField val CONVERSATION_SESSION = of("CONVERSATION_SESSION")

            @JvmField val CRM_OBJECTS_DUMMY_TYPE = of("CRM_OBJECTS_DUMMY_TYPE")

            @JvmField val CRM_PIPELINES_DUMMY_TYPE = of("CRM_PIPELINES_DUMMY_TYPE")

            @JvmField val CTA = of("CTA")

            @JvmField val CTA_VARIANT = of("CTA_VARIANT")

            @JvmField val DATA_PRIVACY_CONSENT = of("DATA_PRIVACY_CONSENT")

            @JvmField val DATA_SYNC_STATE = of("DATA_SYNC_STATE")

            @JvmField val DEAL = of("DEAL")

            @JvmField val DEAL_CREATE_ATTRIBUTION = of("DEAL_CREATE_ATTRIBUTION")

            @JvmField val DEAL_REGISTRATION = of("DEAL_REGISTRATION")

            @JvmField val DEAL_SPLIT = of("DEAL_SPLIT")

            @JvmField val DISCOUNT = of("DISCOUNT")

            @JvmField val DISCOUNT_CODE = of("DISCOUNT_CODE")

            @JvmField val DISCOUNT_TEMPLATE = of("DISCOUNT_TEMPLATE")

            @JvmField val EMAIL = of("EMAIL")

            @JvmField val ENGAGEMENT = of("ENGAGEMENT")

            @JvmField val EXPORT = of("EXPORT")

            @JvmField val EXTERNAL_WEB_URL = of("EXTERNAL_WEB_URL")

            @JvmField val FEE = of("FEE")

            @JvmField val FEEDBACK_SUBMISSION = of("FEEDBACK_SUBMISSION")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val FILE_MANAGER_FILE = of("FILE_MANAGER_FILE")

            @JvmField val FILE_MANAGER_FOLDER = of("FILE_MANAGER_FOLDER")

            @JvmField val FOLDER = of("FOLDER")

            @JvmField val FORECAST = of("FORECAST")

            @JvmField val FORM = of("FORM")

            @JvmField val FORM_SUBMISSION_INBOUNDDB = of("FORM_SUBMISSION_INBOUNDDB")

            @JvmField val GOAL_TARGET = of("GOAL_TARGET")

            @JvmField val GOAL_TARGET_GROUP = of("GOAL_TARGET_GROUP")

            @JvmField val GOAL_TEMPLATE = of("GOAL_TEMPLATE")

            @JvmField val GSC_PROPERTY = of("GSC_PROPERTY")

            @JvmField val HUB = of("HUB")

            @JvmField val IMPORT = of("IMPORT")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val KEYWORD = of("KEYWORD")

            @JvmField val KNOWLEDGE_ARTICLE = of("KNOWLEDGE_ARTICLE")

            @JvmField val LANDING_PAGE = of("LANDING_PAGE")

            @JvmField val LEAD = of("LEAD")

            @JvmField val LINE_ITEM = of("LINE_ITEM")

            @JvmField val MARKETING_CALENDAR = of("MARKETING_CALENDAR")

            @JvmField val MARKETING_CAMPAIGN_UTM = of("MARKETING_CAMPAIGN_UTM")

            @JvmField val MARKETING_EMAIL = of("MARKETING_EMAIL")

            @JvmField val MARKETING_EVENT = of("MARKETING_EVENT")

            @JvmField val MARKETING_EVENT_ATTENDANCE = of("MARKETING_EVENT_ATTENDANCE")

            @JvmField val MARKETING_SMS = of("MARKETING_SMS")

            @JvmField val MEDIA_BRIDGE = of("MEDIA_BRIDGE")

            @JvmField val MEETING_EVENT = of("MEETING_EVENT")

            @JvmField val MIC = of("MIC")

            @JvmField val NOTE = of("NOTE")

            @JvmField val OBJECT_LIST = of("OBJECT_LIST")

            @JvmField val ORDER = of("ORDER")

            @JvmField val OWNER = of("OWNER")

            @JvmField val PARTNER_ACCOUNT = of("PARTNER_ACCOUNT")

            @JvmField val PARTNER_CLIENT = of("PARTNER_CLIENT")

            @JvmField val PARTNER_CLIENT_REVENUE = of("PARTNER_CLIENT_REVENUE")

            @JvmField val PARTNER_SERVICE = of("PARTNER_SERVICE")

            @JvmField val PAYMENT_LINK = of("PAYMENT_LINK")

            @JvmField val PAYMENT_SCHEDULE = of("PAYMENT_SCHEDULE")

            @JvmField val PAYMENT_SCHEDULE_INSTALLMENT = of("PAYMENT_SCHEDULE_INSTALLMENT")

            @JvmField val PERMISSIONS_TESTING = of("PERMISSIONS_TESTING")

            @JvmField val PLAYBOOK = of("PLAYBOOK")

            @JvmField val PLAYBOOK_QUESTION = of("PLAYBOOK_QUESTION")

            @JvmField val PLAYBOOK_SUBMISSION = of("PLAYBOOK_SUBMISSION")

            @JvmField val PLAYBOOK_SUBMISSION_ANSWER = of("PLAYBOOK_SUBMISSION_ANSWER")

            @JvmField val PLAYLIST = of("PLAYLIST")

            @JvmField val PLAYLIST_FOLDER = of("PLAYLIST_FOLDER")

            @JvmField val PODCAST_EPISODE = of("PODCAST_EPISODE")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val PORTAL_OBJECT_SYNC_MESSAGE = of("PORTAL_OBJECT_SYNC_MESSAGE")

            @JvmField val POSTAL_MAIL = of("POSTAL_MAIL")

            @JvmField val PRIVACY_SCANNER_COOKIE = of("PRIVACY_SCANNER_COOKIE")

            @JvmField val PRODUCT = of("PRODUCT")

            @JvmField val PRODUCT_OR_FOLDER = of("PRODUCT_OR_FOLDER")

            @JvmField val PROPERTY_INFO = of("PROPERTY_INFO")

            @JvmField
            val PROSPECTING_AGENT_CONTACT_ASSIGNMENT = of("PROSPECTING_AGENT_CONTACT_ASSIGNMENT")

            @JvmField val PUBLISHING_TASK = of("PUBLISHING_TASK")

            @JvmField val QUARANTINED_SUBMISSION = of("QUARANTINED_SUBMISSION")

            @JvmField val QUOTA = of("QUOTA")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val QUOTE_FIELD = of("QUOTE_FIELD")

            @JvmField val QUOTE_MODULE = of("QUOTE_MODULE")

            @JvmField val QUOTE_MODULE_FIELD = of("QUOTE_MODULE_FIELD")

            @JvmField val QUOTE_TEMPLATE = of("QUOTE_TEMPLATE")

            @JvmField val RESTORABLE_CRM_OBJECT = of("RESTORABLE_CRM_OBJECT")

            @JvmField val ROSTER = of("ROSTER")

            @JvmField val ROSTER_MEMBER = of("ROSTER_MEMBER")

            @JvmField val SALES_DOCUMENT = of("SALES_DOCUMENT")

            @JvmField val SALES_TASK = of("SALES_TASK")

            @JvmField val SALES_WORKLOAD = of("SALES_WORKLOAD")

            @JvmField val SALESFORCE_SYNC_ERROR = of("SALESFORCE_SYNC_ERROR")

            @JvmField val SCHEDULING_PAGE = of("SCHEDULING_PAGE")

            @JvmField val SCHEMAS_BACKEND_TEST = of("SCHEMAS_BACKEND_TEST")

            @JvmField val SCORE_CONFIGURATION = of("SCORE_CONFIGURATION")

            @JvmField val SEQUENCE = of("SEQUENCE")

            @JvmField val SEQUENCE_ENROLLMENT = of("SEQUENCE_ENROLLMENT")

            @JvmField val SEQUENCE_STEP = of("SEQUENCE_STEP")

            @JvmField val SEQUENCE_STEP_ENROLLMENT = of("SEQUENCE_STEP_ENROLLMENT")

            @JvmField val SERVICE = of("SERVICE")

            @JvmField val SITE_PAGE = of("SITE_PAGE")

            @JvmField val SNIPPET = of("SNIPPET")

            @JvmField val SOCIAL_BROADCAST = of("SOCIAL_BROADCAST")

            @JvmField val SOCIAL_CHANNEL = of("SOCIAL_CHANNEL")

            @JvmField val SOCIAL_POST = of("SOCIAL_POST")

            @JvmField val SOCIAL_PROFILE = of("SOCIAL_PROFILE")

            @JvmField val SOX_PROTECTED_DUMMY_TYPE = of("SOX_PROTECTED_DUMMY_TYPE")

            @JvmField val SOX_PROTECTED_TEST_TYPE = of("SOX_PROTECTED_TEST_TYPE")

            @JvmField val SUBMISSION_TAG = of("SUBMISSION_TAG")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val TASK = of("TASK")

            @JvmField val TASK_TEMPLATE = of("TASK_TEMPLATE")

            @JvmField val TAX = of("TAX")

            @JvmField val TEMPLATE = of("TEMPLATE")

            @JvmField val TICKET = of("TICKET")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val UNSUBSCRIBE = of("UNSUBSCRIBE")

            @JvmField val USER = of("USER")

            @JvmField val VIEW = of("VIEW")

            @JvmField val VIEW_BLOCK = of("VIEW_BLOCK")

            @JvmField val WEB_INTERACTIVE = of("WEB_INTERACTIVE")

            @JvmStatic fun of(value: String) = ReferencedObjectType(JsonField.of(value))
        }

        /** An enum containing [ReferencedObjectType]'s known values. */
        enum class Known {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
        }

        /**
         * An enum containing [ReferencedObjectType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ReferencedObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABANDONED_CART,
            ACCEPTANCE_TEST,
            AD,
            AD_ACCOUNT,
            AD_CAMPAIGN,
            AD_GROUP,
            AI_FORECAST,
            ALL_PAGES,
            APPROVAL,
            APPROVAL_STEP,
            ATTRIBUTION,
            AUDIENCE,
            AUTOMATION_JOURNEY,
            AUTOMATION_PLATFORM_FLOW,
            AUTOMATION_PLATFORM_FLOW_ACTION,
            BET_ALERT,
            BET_DELIVERABLE_SERVICE,
            BLOG_LISTING_PAGE,
            BLOG_POST,
            CALL,
            CAMPAIGN,
            CAMPAIGN_BUDGET_ITEM,
            CAMPAIGN_SPEND_ITEM,
            CAMPAIGN_STEP,
            CAMPAIGN_TEMPLATE,
            CAMPAIGN_TEMPLATE_STEP,
            CART,
            CASE_STUDY,
            CHATFLOW,
            CLIP,
            CMS_URL,
            COMBO_EVENT_CONFIGURATION,
            COMMERCE_PAYMENT,
            COMMUNICATION,
            COMPANY,
            CONTACT,
            CONTACT_CREATE_ATTRIBUTION,
            CONTENT,
            CONTENT_AUDIT,
            CONTENT_AUDIT_PAGE,
            CONVERSATION,
            CONVERSATION_INBOX,
            CONVERSATION_SESSION,
            CRM_OBJECTS_DUMMY_TYPE,
            CRM_PIPELINES_DUMMY_TYPE,
            CTA,
            CTA_VARIANT,
            DATA_PRIVACY_CONSENT,
            DATA_SYNC_STATE,
            DEAL,
            DEAL_CREATE_ATTRIBUTION,
            DEAL_REGISTRATION,
            DEAL_SPLIT,
            DISCOUNT,
            DISCOUNT_CODE,
            DISCOUNT_TEMPLATE,
            EMAIL,
            ENGAGEMENT,
            EXPORT,
            EXTERNAL_WEB_URL,
            FEE,
            FEEDBACK_SUBMISSION,
            FEEDBACK_SURVEY,
            FILE_MANAGER_FILE,
            FILE_MANAGER_FOLDER,
            FOLDER,
            FORECAST,
            FORM,
            FORM_SUBMISSION_INBOUNDDB,
            GOAL_TARGET,
            GOAL_TARGET_GROUP,
            GOAL_TEMPLATE,
            GSC_PROPERTY,
            HUB,
            IMPORT,
            INVOICE,
            KEYWORD,
            KNOWLEDGE_ARTICLE,
            LANDING_PAGE,
            LEAD,
            LINE_ITEM,
            MARKETING_CALENDAR,
            MARKETING_CAMPAIGN_UTM,
            MARKETING_EMAIL,
            MARKETING_EVENT,
            MARKETING_EVENT_ATTENDANCE,
            MARKETING_SMS,
            MEDIA_BRIDGE,
            MEETING_EVENT,
            MIC,
            NOTE,
            OBJECT_LIST,
            ORDER,
            OWNER,
            PARTNER_ACCOUNT,
            PARTNER_CLIENT,
            PARTNER_CLIENT_REVENUE,
            PARTNER_SERVICE,
            PAYMENT_LINK,
            PAYMENT_SCHEDULE,
            PAYMENT_SCHEDULE_INSTALLMENT,
            PERMISSIONS_TESTING,
            PLAYBOOK,
            PLAYBOOK_QUESTION,
            PLAYBOOK_SUBMISSION,
            PLAYBOOK_SUBMISSION_ANSWER,
            PLAYLIST,
            PLAYLIST_FOLDER,
            PODCAST_EPISODE,
            PORTAL,
            PORTAL_OBJECT_SYNC_MESSAGE,
            POSTAL_MAIL,
            PRIVACY_SCANNER_COOKIE,
            PRODUCT,
            PRODUCT_OR_FOLDER,
            PROPERTY_INFO,
            PROSPECTING_AGENT_CONTACT_ASSIGNMENT,
            PUBLISHING_TASK,
            QUARANTINED_SUBMISSION,
            QUOTA,
            QUOTE,
            QUOTE_FIELD,
            QUOTE_MODULE,
            QUOTE_MODULE_FIELD,
            QUOTE_TEMPLATE,
            RESTORABLE_CRM_OBJECT,
            ROSTER,
            ROSTER_MEMBER,
            SALES_DOCUMENT,
            SALES_TASK,
            SALES_WORKLOAD,
            SALESFORCE_SYNC_ERROR,
            SCHEDULING_PAGE,
            SCHEMAS_BACKEND_TEST,
            SCORE_CONFIGURATION,
            SEQUENCE,
            SEQUENCE_ENROLLMENT,
            SEQUENCE_STEP,
            SEQUENCE_STEP_ENROLLMENT,
            SERVICE,
            SITE_PAGE,
            SNIPPET,
            SOCIAL_BROADCAST,
            SOCIAL_CHANNEL,
            SOCIAL_POST,
            SOCIAL_PROFILE,
            SOX_PROTECTED_DUMMY_TYPE,
            SOX_PROTECTED_TEST_TYPE,
            SUBMISSION_TAG,
            SUBSCRIPTION,
            TASK,
            TASK_TEMPLATE,
            TAX,
            TEMPLATE,
            TICKET,
            UNKNOWN,
            UNSUBSCRIBE,
            USER,
            VIEW,
            VIEW_BLOCK,
            WEB_INTERACTIVE,
            /**
             * An enum member indicating that [ReferencedObjectType] was instantiated with an
             * unknown value.
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
                ABANDONED_CART -> Value.ABANDONED_CART
                ACCEPTANCE_TEST -> Value.ACCEPTANCE_TEST
                AD -> Value.AD
                AD_ACCOUNT -> Value.AD_ACCOUNT
                AD_CAMPAIGN -> Value.AD_CAMPAIGN
                AD_GROUP -> Value.AD_GROUP
                AI_FORECAST -> Value.AI_FORECAST
                ALL_PAGES -> Value.ALL_PAGES
                APPROVAL -> Value.APPROVAL
                APPROVAL_STEP -> Value.APPROVAL_STEP
                ATTRIBUTION -> Value.ATTRIBUTION
                AUDIENCE -> Value.AUDIENCE
                AUTOMATION_JOURNEY -> Value.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Value.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Value.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Value.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Value.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Value.BLOG_LISTING_PAGE
                BLOG_POST -> Value.BLOG_POST
                CALL -> Value.CALL
                CAMPAIGN -> Value.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Value.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Value.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Value.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Value.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Value.CAMPAIGN_TEMPLATE_STEP
                CART -> Value.CART
                CASE_STUDY -> Value.CASE_STUDY
                CHATFLOW -> Value.CHATFLOW
                CLIP -> Value.CLIP
                CMS_URL -> Value.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Value.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Value.COMMERCE_PAYMENT
                COMMUNICATION -> Value.COMMUNICATION
                COMPANY -> Value.COMPANY
                CONTACT -> Value.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Value.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Value.CONTENT
                CONTENT_AUDIT -> Value.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Value.CONTENT_AUDIT_PAGE
                CONVERSATION -> Value.CONVERSATION
                CONVERSATION_INBOX -> Value.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Value.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Value.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Value.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Value.CTA
                CTA_VARIANT -> Value.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Value.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Value.DATA_SYNC_STATE
                DEAL -> Value.DEAL
                DEAL_CREATE_ATTRIBUTION -> Value.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Value.DEAL_REGISTRATION
                DEAL_SPLIT -> Value.DEAL_SPLIT
                DISCOUNT -> Value.DISCOUNT
                DISCOUNT_CODE -> Value.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Value.DISCOUNT_TEMPLATE
                EMAIL -> Value.EMAIL
                ENGAGEMENT -> Value.ENGAGEMENT
                EXPORT -> Value.EXPORT
                EXTERNAL_WEB_URL -> Value.EXTERNAL_WEB_URL
                FEE -> Value.FEE
                FEEDBACK_SUBMISSION -> Value.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Value.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Value.FILE_MANAGER_FOLDER
                FOLDER -> Value.FOLDER
                FORECAST -> Value.FORECAST
                FORM -> Value.FORM
                FORM_SUBMISSION_INBOUNDDB -> Value.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Value.GOAL_TARGET
                GOAL_TARGET_GROUP -> Value.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Value.GOAL_TEMPLATE
                GSC_PROPERTY -> Value.GSC_PROPERTY
                HUB -> Value.HUB
                IMPORT -> Value.IMPORT
                INVOICE -> Value.INVOICE
                KEYWORD -> Value.KEYWORD
                KNOWLEDGE_ARTICLE -> Value.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Value.LANDING_PAGE
                LEAD -> Value.LEAD
                LINE_ITEM -> Value.LINE_ITEM
                MARKETING_CALENDAR -> Value.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Value.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Value.MARKETING_EMAIL
                MARKETING_EVENT -> Value.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Value.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Value.MARKETING_SMS
                MEDIA_BRIDGE -> Value.MEDIA_BRIDGE
                MEETING_EVENT -> Value.MEETING_EVENT
                MIC -> Value.MIC
                NOTE -> Value.NOTE
                OBJECT_LIST -> Value.OBJECT_LIST
                ORDER -> Value.ORDER
                OWNER -> Value.OWNER
                PARTNER_ACCOUNT -> Value.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Value.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Value.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Value.PARTNER_SERVICE
                PAYMENT_LINK -> Value.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Value.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Value.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Value.PERMISSIONS_TESTING
                PLAYBOOK -> Value.PLAYBOOK
                PLAYBOOK_QUESTION -> Value.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Value.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Value.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Value.PLAYLIST
                PLAYLIST_FOLDER -> Value.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Value.PODCAST_EPISODE
                PORTAL -> Value.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Value.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Value.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Value.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Value.PRODUCT
                PRODUCT_OR_FOLDER -> Value.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Value.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Value.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Value.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Value.QUARANTINED_SUBMISSION
                QUOTA -> Value.QUOTA
                QUOTE -> Value.QUOTE
                QUOTE_FIELD -> Value.QUOTE_FIELD
                QUOTE_MODULE -> Value.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Value.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Value.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Value.RESTORABLE_CRM_OBJECT
                ROSTER -> Value.ROSTER
                ROSTER_MEMBER -> Value.ROSTER_MEMBER
                SALES_DOCUMENT -> Value.SALES_DOCUMENT
                SALES_TASK -> Value.SALES_TASK
                SALES_WORKLOAD -> Value.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Value.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Value.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Value.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Value.SCORE_CONFIGURATION
                SEQUENCE -> Value.SEQUENCE
                SEQUENCE_ENROLLMENT -> Value.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Value.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Value.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Value.SERVICE
                SITE_PAGE -> Value.SITE_PAGE
                SNIPPET -> Value.SNIPPET
                SOCIAL_BROADCAST -> Value.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Value.SOCIAL_CHANNEL
                SOCIAL_POST -> Value.SOCIAL_POST
                SOCIAL_PROFILE -> Value.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Value.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Value.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Value.SUBMISSION_TAG
                SUBSCRIPTION -> Value.SUBSCRIPTION
                TASK -> Value.TASK
                TASK_TEMPLATE -> Value.TASK_TEMPLATE
                TAX -> Value.TAX
                TEMPLATE -> Value.TEMPLATE
                TICKET -> Value.TICKET
                UNKNOWN -> Value.UNKNOWN
                UNSUBSCRIBE -> Value.UNSUBSCRIBE
                USER -> Value.USER
                VIEW -> Value.VIEW
                VIEW_BLOCK -> Value.VIEW_BLOCK
                WEB_INTERACTIVE -> Value.WEB_INTERACTIVE
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
                ABANDONED_CART -> Known.ABANDONED_CART
                ACCEPTANCE_TEST -> Known.ACCEPTANCE_TEST
                AD -> Known.AD
                AD_ACCOUNT -> Known.AD_ACCOUNT
                AD_CAMPAIGN -> Known.AD_CAMPAIGN
                AD_GROUP -> Known.AD_GROUP
                AI_FORECAST -> Known.AI_FORECAST
                ALL_PAGES -> Known.ALL_PAGES
                APPROVAL -> Known.APPROVAL
                APPROVAL_STEP -> Known.APPROVAL_STEP
                ATTRIBUTION -> Known.ATTRIBUTION
                AUDIENCE -> Known.AUDIENCE
                AUTOMATION_JOURNEY -> Known.AUTOMATION_JOURNEY
                AUTOMATION_PLATFORM_FLOW -> Known.AUTOMATION_PLATFORM_FLOW
                AUTOMATION_PLATFORM_FLOW_ACTION -> Known.AUTOMATION_PLATFORM_FLOW_ACTION
                BET_ALERT -> Known.BET_ALERT
                BET_DELIVERABLE_SERVICE -> Known.BET_DELIVERABLE_SERVICE
                BLOG_LISTING_PAGE -> Known.BLOG_LISTING_PAGE
                BLOG_POST -> Known.BLOG_POST
                CALL -> Known.CALL
                CAMPAIGN -> Known.CAMPAIGN
                CAMPAIGN_BUDGET_ITEM -> Known.CAMPAIGN_BUDGET_ITEM
                CAMPAIGN_SPEND_ITEM -> Known.CAMPAIGN_SPEND_ITEM
                CAMPAIGN_STEP -> Known.CAMPAIGN_STEP
                CAMPAIGN_TEMPLATE -> Known.CAMPAIGN_TEMPLATE
                CAMPAIGN_TEMPLATE_STEP -> Known.CAMPAIGN_TEMPLATE_STEP
                CART -> Known.CART
                CASE_STUDY -> Known.CASE_STUDY
                CHATFLOW -> Known.CHATFLOW
                CLIP -> Known.CLIP
                CMS_URL -> Known.CMS_URL
                COMBO_EVENT_CONFIGURATION -> Known.COMBO_EVENT_CONFIGURATION
                COMMERCE_PAYMENT -> Known.COMMERCE_PAYMENT
                COMMUNICATION -> Known.COMMUNICATION
                COMPANY -> Known.COMPANY
                CONTACT -> Known.CONTACT
                CONTACT_CREATE_ATTRIBUTION -> Known.CONTACT_CREATE_ATTRIBUTION
                CONTENT -> Known.CONTENT
                CONTENT_AUDIT -> Known.CONTENT_AUDIT
                CONTENT_AUDIT_PAGE -> Known.CONTENT_AUDIT_PAGE
                CONVERSATION -> Known.CONVERSATION
                CONVERSATION_INBOX -> Known.CONVERSATION_INBOX
                CONVERSATION_SESSION -> Known.CONVERSATION_SESSION
                CRM_OBJECTS_DUMMY_TYPE -> Known.CRM_OBJECTS_DUMMY_TYPE
                CRM_PIPELINES_DUMMY_TYPE -> Known.CRM_PIPELINES_DUMMY_TYPE
                CTA -> Known.CTA
                CTA_VARIANT -> Known.CTA_VARIANT
                DATA_PRIVACY_CONSENT -> Known.DATA_PRIVACY_CONSENT
                DATA_SYNC_STATE -> Known.DATA_SYNC_STATE
                DEAL -> Known.DEAL
                DEAL_CREATE_ATTRIBUTION -> Known.DEAL_CREATE_ATTRIBUTION
                DEAL_REGISTRATION -> Known.DEAL_REGISTRATION
                DEAL_SPLIT -> Known.DEAL_SPLIT
                DISCOUNT -> Known.DISCOUNT
                DISCOUNT_CODE -> Known.DISCOUNT_CODE
                DISCOUNT_TEMPLATE -> Known.DISCOUNT_TEMPLATE
                EMAIL -> Known.EMAIL
                ENGAGEMENT -> Known.ENGAGEMENT
                EXPORT -> Known.EXPORT
                EXTERNAL_WEB_URL -> Known.EXTERNAL_WEB_URL
                FEE -> Known.FEE
                FEEDBACK_SUBMISSION -> Known.FEEDBACK_SUBMISSION
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                FILE_MANAGER_FILE -> Known.FILE_MANAGER_FILE
                FILE_MANAGER_FOLDER -> Known.FILE_MANAGER_FOLDER
                FOLDER -> Known.FOLDER
                FORECAST -> Known.FORECAST
                FORM -> Known.FORM
                FORM_SUBMISSION_INBOUNDDB -> Known.FORM_SUBMISSION_INBOUNDDB
                GOAL_TARGET -> Known.GOAL_TARGET
                GOAL_TARGET_GROUP -> Known.GOAL_TARGET_GROUP
                GOAL_TEMPLATE -> Known.GOAL_TEMPLATE
                GSC_PROPERTY -> Known.GSC_PROPERTY
                HUB -> Known.HUB
                IMPORT -> Known.IMPORT
                INVOICE -> Known.INVOICE
                KEYWORD -> Known.KEYWORD
                KNOWLEDGE_ARTICLE -> Known.KNOWLEDGE_ARTICLE
                LANDING_PAGE -> Known.LANDING_PAGE
                LEAD -> Known.LEAD
                LINE_ITEM -> Known.LINE_ITEM
                MARKETING_CALENDAR -> Known.MARKETING_CALENDAR
                MARKETING_CAMPAIGN_UTM -> Known.MARKETING_CAMPAIGN_UTM
                MARKETING_EMAIL -> Known.MARKETING_EMAIL
                MARKETING_EVENT -> Known.MARKETING_EVENT
                MARKETING_EVENT_ATTENDANCE -> Known.MARKETING_EVENT_ATTENDANCE
                MARKETING_SMS -> Known.MARKETING_SMS
                MEDIA_BRIDGE -> Known.MEDIA_BRIDGE
                MEETING_EVENT -> Known.MEETING_EVENT
                MIC -> Known.MIC
                NOTE -> Known.NOTE
                OBJECT_LIST -> Known.OBJECT_LIST
                ORDER -> Known.ORDER
                OWNER -> Known.OWNER
                PARTNER_ACCOUNT -> Known.PARTNER_ACCOUNT
                PARTNER_CLIENT -> Known.PARTNER_CLIENT
                PARTNER_CLIENT_REVENUE -> Known.PARTNER_CLIENT_REVENUE
                PARTNER_SERVICE -> Known.PARTNER_SERVICE
                PAYMENT_LINK -> Known.PAYMENT_LINK
                PAYMENT_SCHEDULE -> Known.PAYMENT_SCHEDULE
                PAYMENT_SCHEDULE_INSTALLMENT -> Known.PAYMENT_SCHEDULE_INSTALLMENT
                PERMISSIONS_TESTING -> Known.PERMISSIONS_TESTING
                PLAYBOOK -> Known.PLAYBOOK
                PLAYBOOK_QUESTION -> Known.PLAYBOOK_QUESTION
                PLAYBOOK_SUBMISSION -> Known.PLAYBOOK_SUBMISSION
                PLAYBOOK_SUBMISSION_ANSWER -> Known.PLAYBOOK_SUBMISSION_ANSWER
                PLAYLIST -> Known.PLAYLIST
                PLAYLIST_FOLDER -> Known.PLAYLIST_FOLDER
                PODCAST_EPISODE -> Known.PODCAST_EPISODE
                PORTAL -> Known.PORTAL
                PORTAL_OBJECT_SYNC_MESSAGE -> Known.PORTAL_OBJECT_SYNC_MESSAGE
                POSTAL_MAIL -> Known.POSTAL_MAIL
                PRIVACY_SCANNER_COOKIE -> Known.PRIVACY_SCANNER_COOKIE
                PRODUCT -> Known.PRODUCT
                PRODUCT_OR_FOLDER -> Known.PRODUCT_OR_FOLDER
                PROPERTY_INFO -> Known.PROPERTY_INFO
                PROSPECTING_AGENT_CONTACT_ASSIGNMENT -> Known.PROSPECTING_AGENT_CONTACT_ASSIGNMENT
                PUBLISHING_TASK -> Known.PUBLISHING_TASK
                QUARANTINED_SUBMISSION -> Known.QUARANTINED_SUBMISSION
                QUOTA -> Known.QUOTA
                QUOTE -> Known.QUOTE
                QUOTE_FIELD -> Known.QUOTE_FIELD
                QUOTE_MODULE -> Known.QUOTE_MODULE
                QUOTE_MODULE_FIELD -> Known.QUOTE_MODULE_FIELD
                QUOTE_TEMPLATE -> Known.QUOTE_TEMPLATE
                RESTORABLE_CRM_OBJECT -> Known.RESTORABLE_CRM_OBJECT
                ROSTER -> Known.ROSTER
                ROSTER_MEMBER -> Known.ROSTER_MEMBER
                SALES_DOCUMENT -> Known.SALES_DOCUMENT
                SALES_TASK -> Known.SALES_TASK
                SALES_WORKLOAD -> Known.SALES_WORKLOAD
                SALESFORCE_SYNC_ERROR -> Known.SALESFORCE_SYNC_ERROR
                SCHEDULING_PAGE -> Known.SCHEDULING_PAGE
                SCHEMAS_BACKEND_TEST -> Known.SCHEMAS_BACKEND_TEST
                SCORE_CONFIGURATION -> Known.SCORE_CONFIGURATION
                SEQUENCE -> Known.SEQUENCE
                SEQUENCE_ENROLLMENT -> Known.SEQUENCE_ENROLLMENT
                SEQUENCE_STEP -> Known.SEQUENCE_STEP
                SEQUENCE_STEP_ENROLLMENT -> Known.SEQUENCE_STEP_ENROLLMENT
                SERVICE -> Known.SERVICE
                SITE_PAGE -> Known.SITE_PAGE
                SNIPPET -> Known.SNIPPET
                SOCIAL_BROADCAST -> Known.SOCIAL_BROADCAST
                SOCIAL_CHANNEL -> Known.SOCIAL_CHANNEL
                SOCIAL_POST -> Known.SOCIAL_POST
                SOCIAL_PROFILE -> Known.SOCIAL_PROFILE
                SOX_PROTECTED_DUMMY_TYPE -> Known.SOX_PROTECTED_DUMMY_TYPE
                SOX_PROTECTED_TEST_TYPE -> Known.SOX_PROTECTED_TEST_TYPE
                SUBMISSION_TAG -> Known.SUBMISSION_TAG
                SUBSCRIPTION -> Known.SUBSCRIPTION
                TASK -> Known.TASK
                TASK_TEMPLATE -> Known.TASK_TEMPLATE
                TAX -> Known.TAX
                TEMPLATE -> Known.TEMPLATE
                TICKET -> Known.TICKET
                UNKNOWN -> Known.UNKNOWN
                UNSUBSCRIBE -> Known.UNSUBSCRIBE
                USER -> Known.USER
                VIEW -> Known.VIEW
                VIEW_BLOCK -> Known.VIEW_BLOCK
                WEB_INTERACTIVE -> Known.WEB_INTERACTIVE
                else -> throw HubSpotInvalidDataException("Unknown ReferencedObjectType: $value")
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

        fun validate(): ReferencedObjectType = apply {
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

            return other is ReferencedObjectType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SearchTextAnalysisMode
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

            @JvmField val NONE = of("NONE")

            @JvmField val NOT_ANALYZED_TEXT = of("NOT_ANALYZED_TEXT")

            @JvmStatic fun of(value: String) = SearchTextAnalysisMode(JsonField.of(value))
        }

        /** An enum containing [SearchTextAnalysisMode]'s known values. */
        enum class Known {
            NONE,
            NOT_ANALYZED_TEXT,
        }

        /**
         * An enum containing [SearchTextAnalysisMode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [SearchTextAnalysisMode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            NOT_ANALYZED_TEXT,
            /**
             * An enum member indicating that [SearchTextAnalysisMode] was instantiated with an
             * unknown value.
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
                NONE -> Value.NONE
                NOT_ANALYZED_TEXT -> Value.NOT_ANALYZED_TEXT
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
                NONE -> Known.NONE
                NOT_ANALYZED_TEXT -> Known.NOT_ANALYZED_TEXT
                else -> throw HubSpotInvalidDataException("Unknown SearchTextAnalysisMode: $value")
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

        fun validate(): SearchTextAnalysisMode = apply {
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

            return other is SearchTextAnalysisMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Hint for how the text is displayed and validated in HubSpot's UI. Can be:
     * "unformatted_single_line", "multi_line", "email", "phone_number", "domain_name",
     * "ip_address", "physical_address", or "postal_code".
     */
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

    /** The data type of the property, such as string or number. */
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

            @JvmField val CURRENCY_NUMBER = of("currency_number")

            @JvmField val DATE = of("date")

            @JvmField val DATETIME = of("datetime")

            @JvmField val ENUMERATION = of("enumeration")

            @JvmField val JSON = of("json")

            @JvmField val NUMBER = of("number")

            @JvmField val OBJECT_COORDINATES = of("object_coordinates")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val STRING = of("string")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOL,
            CURRENCY_NUMBER,
            DATE,
            DATETIME,
            ENUMERATION,
            JSON,
            NUMBER,
            OBJECT_COORDINATES,
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
            CURRENCY_NUMBER,
            DATE,
            DATETIME,
            ENUMERATION,
            JSON,
            NUMBER,
            OBJECT_COORDINATES,
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
                CURRENCY_NUMBER -> Value.CURRENCY_NUMBER
                DATE -> Value.DATE
                DATETIME -> Value.DATETIME
                ENUMERATION -> Value.ENUMERATION
                JSON -> Value.JSON
                NUMBER -> Value.NUMBER
                OBJECT_COORDINATES -> Value.OBJECT_COORDINATES
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
                CURRENCY_NUMBER -> Known.CURRENCY_NUMBER
                DATE -> Known.DATE
                DATETIME -> Known.DATETIME
                ENUMERATION -> Known.ENUMERATION
                JSON -> Known.JSON
                NUMBER -> Known.NUMBER
                OBJECT_COORDINATES -> Known.OBJECT_COORDINATES
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

        return other is Property &&
            allowedObjectTypes == other.allowedObjectTypes &&
            calculated == other.calculated &&
            canArchive == other.canArchive &&
            canRestore == other.canRestore &&
            createdAt == other.createdAt &&
            createdUserId == other.createdUserId &&
            currencyPropertyName == other.currencyPropertyName &&
            dataSensitivity == other.dataSensitivity &&
            dateDisplayHint == other.dateDisplayHint &&
            deleted == other.deleted &&
            description == other.description &&
            displayMode == other.displayMode &&
            displayOrder == other.displayOrder &&
            enforceMultivalueUniqueness == other.enforceMultivalueUniqueness &&
            externalOptions == other.externalOptions &&
            externalOptionsReferenceType == other.externalOptionsReferenceType &&
            favorited == other.favorited &&
            favoritedOrder == other.favoritedOrder &&
            fieldType == other.fieldType &&
            formField == other.formField &&
            fromUserId == other.fromUserId &&
            groupName == other.groupName &&
            hasUniqueValue == other.hasUniqueValue &&
            hidden == other.hidden &&
            hubSpotDefined == other.hubSpotDefined &&
            isCustomizedDefault == other.isCustomizedDefault &&
            isMultiValued == other.isMultiValued &&
            isPartial == other.isPartial &&
            label == other.label &&
            mutableDefinitionNotDeletable == other.mutableDefinitionNotDeletable &&
            name == other.name &&
            numberDisplayHint == other.numberDisplayHint &&
            options == other.options &&
            optionsAreMutable == other.optionsAreMutable &&
            optionSortStrategy == other.optionSortStrategy &&
            owningAppId == other.owningAppId &&
            portalId == other.portalId &&
            readOnlyDefinition == other.readOnlyDefinition &&
            readOnlyValue == other.readOnlyValue &&
            referencedObjectType == other.referencedObjectType &&
            searchableInGlobalSearch == other.searchableInGlobalSearch &&
            searchTextAnalysisMode == other.searchTextAnalysisMode &&
            sensitiveDataCategories == other.sensitiveDataCategories &&
            showCurrencySymbol == other.showCurrencySymbol &&
            textDisplayHint == other.textDisplayHint &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowedObjectTypes,
            calculated,
            canArchive,
            canRestore,
            createdAt,
            createdUserId,
            currencyPropertyName,
            dataSensitivity,
            dateDisplayHint,
            deleted,
            description,
            displayMode,
            displayOrder,
            enforceMultivalueUniqueness,
            externalOptions,
            externalOptionsReferenceType,
            favorited,
            favoritedOrder,
            fieldType,
            formField,
            fromUserId,
            groupName,
            hasUniqueValue,
            hidden,
            hubSpotDefined,
            isCustomizedDefault,
            isMultiValued,
            isPartial,
            label,
            mutableDefinitionNotDeletable,
            name,
            numberDisplayHint,
            options,
            optionsAreMutable,
            optionSortStrategy,
            owningAppId,
            portalId,
            readOnlyDefinition,
            readOnlyValue,
            referencedObjectType,
            searchableInGlobalSearch,
            searchTextAnalysisMode,
            sensitiveDataCategories,
            showCurrencySymbol,
            textDisplayHint,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Property{allowedObjectTypes=$allowedObjectTypes, calculated=$calculated, canArchive=$canArchive, canRestore=$canRestore, createdAt=$createdAt, createdUserId=$createdUserId, currencyPropertyName=$currencyPropertyName, dataSensitivity=$dataSensitivity, dateDisplayHint=$dateDisplayHint, deleted=$deleted, description=$description, displayMode=$displayMode, displayOrder=$displayOrder, enforceMultivalueUniqueness=$enforceMultivalueUniqueness, externalOptions=$externalOptions, externalOptionsReferenceType=$externalOptionsReferenceType, favorited=$favorited, favoritedOrder=$favoritedOrder, fieldType=$fieldType, formField=$formField, fromUserId=$fromUserId, groupName=$groupName, hasUniqueValue=$hasUniqueValue, hidden=$hidden, hubSpotDefined=$hubSpotDefined, isCustomizedDefault=$isCustomizedDefault, isMultiValued=$isMultiValued, isPartial=$isPartial, label=$label, mutableDefinitionNotDeletable=$mutableDefinitionNotDeletable, name=$name, numberDisplayHint=$numberDisplayHint, options=$options, optionsAreMutable=$optionsAreMutable, optionSortStrategy=$optionSortStrategy, owningAppId=$owningAppId, portalId=$portalId, readOnlyDefinition=$readOnlyDefinition, readOnlyValue=$readOnlyValue, referencedObjectType=$referencedObjectType, searchableInGlobalSearch=$searchableInGlobalSearch, searchTextAnalysisMode=$searchTextAnalysisMode, sensitiveDataCategories=$sensitiveDataCategories, showCurrencySymbol=$showCurrencySymbol, textDisplayHint=$textDisplayHint, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
