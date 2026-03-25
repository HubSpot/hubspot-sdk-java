// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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

class InboundDbObjectType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Int>,
    private val allowsSensitiveProperties: JsonField<Boolean>,
    private val createDatePropertyName: JsonField<String>,
    private val defaultSearchPropertyNames: JsonField<List<String>>,
    private val deleted: JsonField<Boolean>,
    private val fullyQualifiedName: JsonField<String>,
    private val hasCustomProperties: JsonField<Boolean>,
    private val hasDefaultProperties: JsonField<Boolean>,
    private val hasExternalObjectIds: JsonField<Boolean>,
    private val hasOwners: JsonField<Boolean>,
    private val hasPipelines: JsonField<Boolean>,
    private val indexedForFiltersAndReports: JsonField<Boolean>,
    private val lastModifiedPropertyName: JsonField<String>,
    private val metaType: JsonField<MetaType>,
    private val metaTypeId: JsonField<Int>,
    private val name: JsonField<String>,
    private val objectTypeId: JsonField<String>,
    private val permissioningType: JsonField<PermissioningType>,
    private val pipelinePropertyName: JsonField<String>,
    private val pipelineStagePropertyName: JsonField<String>,
    private val requiredProperties: JsonField<List<String>>,
    private val restorable: JsonField<Boolean>,
    private val scopeMappings: JsonField<List<ScopeMapping>>,
    private val secondaryDisplayLabelPropertyNames: JsonField<List<String>>,
    private val accessScopeName: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val description: JsonField<String>,
    private val integrationAppId: JsonField<Int>,
    private val janusGroup: JsonField<String>,
    private val ownerPortalId: JsonField<Int>,
    private val pipelineCloseDatePropertyName: JsonField<String>,
    private val pipelineTimeToClosePropertyName: JsonField<String>,
    private val pluralForm: JsonField<String>,
    private val primaryDisplayLabelPropertyName: JsonField<String>,
    private val readScopeName: JsonField<String>,
    private val singularForm: JsonField<String>,
    private val status: JsonField<Status>,
    private val visibility: JsonField<Visibility>,
    private val writeScopeName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("allowsSensitiveProperties")
        @ExcludeMissing
        allowsSensitiveProperties: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createDatePropertyName")
        @ExcludeMissing
        createDatePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultSearchPropertyNames")
        @ExcludeMissing
        defaultSearchPropertyNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("deleted") @ExcludeMissing deleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("fullyQualifiedName")
        @ExcludeMissing
        fullyQualifiedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasCustomProperties")
        @ExcludeMissing
        hasCustomProperties: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasDefaultProperties")
        @ExcludeMissing
        hasDefaultProperties: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasExternalObjectIds")
        @ExcludeMissing
        hasExternalObjectIds: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasOwners") @ExcludeMissing hasOwners: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hasPipelines")
        @ExcludeMissing
        hasPipelines: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("indexedForFiltersAndReports")
        @ExcludeMissing
        indexedForFiltersAndReports: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastModifiedPropertyName")
        @ExcludeMissing
        lastModifiedPropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metaType") @ExcludeMissing metaType: JsonField<MetaType> = JsonMissing.of(),
        @JsonProperty("metaTypeId") @ExcludeMissing metaTypeId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissioningType")
        @ExcludeMissing
        permissioningType: JsonField<PermissioningType> = JsonMissing.of(),
        @JsonProperty("pipelinePropertyName")
        @ExcludeMissing
        pipelinePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pipelineStagePropertyName")
        @ExcludeMissing
        pipelineStagePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requiredProperties")
        @ExcludeMissing
        requiredProperties: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("restorable")
        @ExcludeMissing
        restorable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("scopeMappings")
        @ExcludeMissing
        scopeMappings: JsonField<List<ScopeMapping>> = JsonMissing.of(),
        @JsonProperty("secondaryDisplayLabelPropertyNames")
        @ExcludeMissing
        secondaryDisplayLabelPropertyNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("accessScopeName")
        @ExcludeMissing
        accessScopeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integrationAppId")
        @ExcludeMissing
        integrationAppId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("janusGroup")
        @ExcludeMissing
        janusGroup: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ownerPortalId")
        @ExcludeMissing
        ownerPortalId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pipelineCloseDatePropertyName")
        @ExcludeMissing
        pipelineCloseDatePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pipelineTimeToClosePropertyName")
        @ExcludeMissing
        pipelineTimeToClosePropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pluralForm")
        @ExcludeMissing
        pluralForm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryDisplayLabelPropertyName")
        @ExcludeMissing
        primaryDisplayLabelPropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("readScopeName")
        @ExcludeMissing
        readScopeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("singularForm")
        @ExcludeMissing
        singularForm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("visibility")
        @ExcludeMissing
        visibility: JsonField<Visibility> = JsonMissing.of(),
        @JsonProperty("writeScopeName")
        @ExcludeMissing
        writeScopeName: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        allowsSensitiveProperties,
        createDatePropertyName,
        defaultSearchPropertyNames,
        deleted,
        fullyQualifiedName,
        hasCustomProperties,
        hasDefaultProperties,
        hasExternalObjectIds,
        hasOwners,
        hasPipelines,
        indexedForFiltersAndReports,
        lastModifiedPropertyName,
        metaType,
        metaTypeId,
        name,
        objectTypeId,
        permissioningType,
        pipelinePropertyName,
        pipelineStagePropertyName,
        requiredProperties,
        restorable,
        scopeMappings,
        secondaryDisplayLabelPropertyNames,
        accessScopeName,
        createdAt,
        description,
        integrationAppId,
        janusGroup,
        ownerPortalId,
        pipelineCloseDatePropertyName,
        pipelineTimeToClosePropertyName,
        pluralForm,
        primaryDisplayLabelPropertyName,
        readScopeName,
        singularForm,
        status,
        visibility,
        writeScopeName,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Int = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowsSensitiveProperties(): Boolean =
        allowsSensitiveProperties.getRequired("allowsSensitiveProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createDatePropertyName(): String =
        createDatePropertyName.getRequired("createDatePropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultSearchPropertyNames(): List<String> =
        defaultSearchPropertyNames.getRequired("defaultSearchPropertyNames")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deleted(): Boolean = deleted.getRequired("deleted")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullyQualifiedName(): String = fullyQualifiedName.getRequired("fullyQualifiedName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasCustomProperties(): Boolean = hasCustomProperties.getRequired("hasCustomProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasDefaultProperties(): Boolean = hasDefaultProperties.getRequired("hasDefaultProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasExternalObjectIds(): Boolean = hasExternalObjectIds.getRequired("hasExternalObjectIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasOwners(): Boolean = hasOwners.getRequired("hasOwners")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasPipelines(): Boolean = hasPipelines.getRequired("hasPipelines")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indexedForFiltersAndReports(): Boolean =
        indexedForFiltersAndReports.getRequired("indexedForFiltersAndReports")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastModifiedPropertyName(): String =
        lastModifiedPropertyName.getRequired("lastModifiedPropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metaType(): MetaType = metaType.getRequired("metaType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metaTypeId(): Int = metaTypeId.getRequired("metaTypeId")

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
    fun permissioningType(): PermissioningType = permissioningType.getRequired("permissioningType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelinePropertyName(): String = pipelinePropertyName.getRequired("pipelinePropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineStagePropertyName(): String =
        pipelineStagePropertyName.getRequired("pipelineStagePropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredProperties(): List<String> = requiredProperties.getRequired("requiredProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun restorable(): Boolean = restorable.getRequired("restorable")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeMappings(): List<ScopeMapping> = scopeMappings.getRequired("scopeMappings")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secondaryDisplayLabelPropertyNames(): List<String> =
        secondaryDisplayLabelPropertyNames.getRequired("secondaryDisplayLabelPropertyNames")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessScopeName(): Optional<String> = accessScopeName.getOptional("accessScopeName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationAppId(): Optional<Int> = integrationAppId.getOptional("integrationAppId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun janusGroup(): Optional<String> = janusGroup.getOptional("janusGroup")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ownerPortalId(): Optional<Int> = ownerPortalId.getOptional("ownerPortalId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelineCloseDatePropertyName(): Optional<String> =
        pipelineCloseDatePropertyName.getOptional("pipelineCloseDatePropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pipelineTimeToClosePropertyName(): Optional<String> =
        pipelineTimeToClosePropertyName.getOptional("pipelineTimeToClosePropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pluralForm(): Optional<String> = pluralForm.getOptional("pluralForm")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryDisplayLabelPropertyName(): Optional<String> =
        primaryDisplayLabelPropertyName.getOptional("primaryDisplayLabelPropertyName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readScopeName(): Optional<String> = readScopeName.getOptional("readScopeName")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun singularForm(): Optional<String> = singularForm.getOptional("singularForm")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun visibility(): Optional<Visibility> = visibility.getOptional("visibility")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun writeScopeName(): Optional<String> = writeScopeName.getOptional("writeScopeName")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Int> = id

    /**
     * Returns the raw JSON value of [allowsSensitiveProperties].
     *
     * Unlike [allowsSensitiveProperties], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowsSensitiveProperties")
    @ExcludeMissing
    fun _allowsSensitiveProperties(): JsonField<Boolean> = allowsSensitiveProperties

    /**
     * Returns the raw JSON value of [createDatePropertyName].
     *
     * Unlike [createDatePropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("createDatePropertyName")
    @ExcludeMissing
    fun _createDatePropertyName(): JsonField<String> = createDatePropertyName

    /**
     * Returns the raw JSON value of [defaultSearchPropertyNames].
     *
     * Unlike [defaultSearchPropertyNames], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("defaultSearchPropertyNames")
    @ExcludeMissing
    fun _defaultSearchPropertyNames(): JsonField<List<String>> = defaultSearchPropertyNames

    /**
     * Returns the raw JSON value of [deleted].
     *
     * Unlike [deleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted") @ExcludeMissing fun _deleted(): JsonField<Boolean> = deleted

    /**
     * Returns the raw JSON value of [fullyQualifiedName].
     *
     * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fullyQualifiedName")
    @ExcludeMissing
    fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

    /**
     * Returns the raw JSON value of [hasCustomProperties].
     *
     * Unlike [hasCustomProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasCustomProperties")
    @ExcludeMissing
    fun _hasCustomProperties(): JsonField<Boolean> = hasCustomProperties

    /**
     * Returns the raw JSON value of [hasDefaultProperties].
     *
     * Unlike [hasDefaultProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasDefaultProperties")
    @ExcludeMissing
    fun _hasDefaultProperties(): JsonField<Boolean> = hasDefaultProperties

    /**
     * Returns the raw JSON value of [hasExternalObjectIds].
     *
     * Unlike [hasExternalObjectIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasExternalObjectIds")
    @ExcludeMissing
    fun _hasExternalObjectIds(): JsonField<Boolean> = hasExternalObjectIds

    /**
     * Returns the raw JSON value of [hasOwners].
     *
     * Unlike [hasOwners], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasOwners") @ExcludeMissing fun _hasOwners(): JsonField<Boolean> = hasOwners

    /**
     * Returns the raw JSON value of [hasPipelines].
     *
     * Unlike [hasPipelines], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasPipelines")
    @ExcludeMissing
    fun _hasPipelines(): JsonField<Boolean> = hasPipelines

    /**
     * Returns the raw JSON value of [indexedForFiltersAndReports].
     *
     * Unlike [indexedForFiltersAndReports], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("indexedForFiltersAndReports")
    @ExcludeMissing
    fun _indexedForFiltersAndReports(): JsonField<Boolean> = indexedForFiltersAndReports

    /**
     * Returns the raw JSON value of [lastModifiedPropertyName].
     *
     * Unlike [lastModifiedPropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("lastModifiedPropertyName")
    @ExcludeMissing
    fun _lastModifiedPropertyName(): JsonField<String> = lastModifiedPropertyName

    /**
     * Returns the raw JSON value of [metaType].
     *
     * Unlike [metaType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metaType") @ExcludeMissing fun _metaType(): JsonField<MetaType> = metaType

    /**
     * Returns the raw JSON value of [metaTypeId].
     *
     * Unlike [metaTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metaTypeId") @ExcludeMissing fun _metaTypeId(): JsonField<Int> = metaTypeId

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
     * Returns the raw JSON value of [permissioningType].
     *
     * Unlike [permissioningType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("permissioningType")
    @ExcludeMissing
    fun _permissioningType(): JsonField<PermissioningType> = permissioningType

    /**
     * Returns the raw JSON value of [pipelinePropertyName].
     *
     * Unlike [pipelinePropertyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pipelinePropertyName")
    @ExcludeMissing
    fun _pipelinePropertyName(): JsonField<String> = pipelinePropertyName

    /**
     * Returns the raw JSON value of [pipelineStagePropertyName].
     *
     * Unlike [pipelineStagePropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("pipelineStagePropertyName")
    @ExcludeMissing
    fun _pipelineStagePropertyName(): JsonField<String> = pipelineStagePropertyName

    /**
     * Returns the raw JSON value of [requiredProperties].
     *
     * Unlike [requiredProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requiredProperties")
    @ExcludeMissing
    fun _requiredProperties(): JsonField<List<String>> = requiredProperties

    /**
     * Returns the raw JSON value of [restorable].
     *
     * Unlike [restorable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restorable") @ExcludeMissing fun _restorable(): JsonField<Boolean> = restorable

    /**
     * Returns the raw JSON value of [scopeMappings].
     *
     * Unlike [scopeMappings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopeMappings")
    @ExcludeMissing
    fun _scopeMappings(): JsonField<List<ScopeMapping>> = scopeMappings

    /**
     * Returns the raw JSON value of [secondaryDisplayLabelPropertyNames].
     *
     * Unlike [secondaryDisplayLabelPropertyNames], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("secondaryDisplayLabelPropertyNames")
    @ExcludeMissing
    fun _secondaryDisplayLabelPropertyNames(): JsonField<List<String>> =
        secondaryDisplayLabelPropertyNames

    /**
     * Returns the raw JSON value of [accessScopeName].
     *
     * Unlike [accessScopeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessScopeName")
    @ExcludeMissing
    fun _accessScopeName(): JsonField<String> = accessScopeName

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [integrationAppId].
     *
     * Unlike [integrationAppId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("integrationAppId")
    @ExcludeMissing
    fun _integrationAppId(): JsonField<Int> = integrationAppId

    /**
     * Returns the raw JSON value of [janusGroup].
     *
     * Unlike [janusGroup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("janusGroup") @ExcludeMissing fun _janusGroup(): JsonField<String> = janusGroup

    /**
     * Returns the raw JSON value of [ownerPortalId].
     *
     * Unlike [ownerPortalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ownerPortalId")
    @ExcludeMissing
    fun _ownerPortalId(): JsonField<Int> = ownerPortalId

    /**
     * Returns the raw JSON value of [pipelineCloseDatePropertyName].
     *
     * Unlike [pipelineCloseDatePropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("pipelineCloseDatePropertyName")
    @ExcludeMissing
    fun _pipelineCloseDatePropertyName(): JsonField<String> = pipelineCloseDatePropertyName

    /**
     * Returns the raw JSON value of [pipelineTimeToClosePropertyName].
     *
     * Unlike [pipelineTimeToClosePropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("pipelineTimeToClosePropertyName")
    @ExcludeMissing
    fun _pipelineTimeToClosePropertyName(): JsonField<String> = pipelineTimeToClosePropertyName

    /**
     * Returns the raw JSON value of [pluralForm].
     *
     * Unlike [pluralForm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pluralForm") @ExcludeMissing fun _pluralForm(): JsonField<String> = pluralForm

    /**
     * Returns the raw JSON value of [primaryDisplayLabelPropertyName].
     *
     * Unlike [primaryDisplayLabelPropertyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primaryDisplayLabelPropertyName")
    @ExcludeMissing
    fun _primaryDisplayLabelPropertyName(): JsonField<String> = primaryDisplayLabelPropertyName

    /**
     * Returns the raw JSON value of [readScopeName].
     *
     * Unlike [readScopeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readScopeName")
    @ExcludeMissing
    fun _readScopeName(): JsonField<String> = readScopeName

    /**
     * Returns the raw JSON value of [singularForm].
     *
     * Unlike [singularForm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("singularForm")
    @ExcludeMissing
    fun _singularForm(): JsonField<String> = singularForm

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visibility")
    @ExcludeMissing
    fun _visibility(): JsonField<Visibility> = visibility

    /**
     * Returns the raw JSON value of [writeScopeName].
     *
     * Unlike [writeScopeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("writeScopeName")
    @ExcludeMissing
    fun _writeScopeName(): JsonField<String> = writeScopeName

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
         * Returns a mutable builder for constructing an instance of [InboundDbObjectType].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowsSensitiveProperties()
         * .createDatePropertyName()
         * .defaultSearchPropertyNames()
         * .deleted()
         * .fullyQualifiedName()
         * .hasCustomProperties()
         * .hasDefaultProperties()
         * .hasExternalObjectIds()
         * .hasOwners()
         * .hasPipelines()
         * .indexedForFiltersAndReports()
         * .lastModifiedPropertyName()
         * .metaType()
         * .metaTypeId()
         * .name()
         * .objectTypeId()
         * .permissioningType()
         * .pipelinePropertyName()
         * .pipelineStagePropertyName()
         * .requiredProperties()
         * .restorable()
         * .scopeMappings()
         * .secondaryDisplayLabelPropertyNames()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundDbObjectType]. */
    class Builder internal constructor() {

        private var id: JsonField<Int>? = null
        private var allowsSensitiveProperties: JsonField<Boolean>? = null
        private var createDatePropertyName: JsonField<String>? = null
        private var defaultSearchPropertyNames: JsonField<MutableList<String>>? = null
        private var deleted: JsonField<Boolean>? = null
        private var fullyQualifiedName: JsonField<String>? = null
        private var hasCustomProperties: JsonField<Boolean>? = null
        private var hasDefaultProperties: JsonField<Boolean>? = null
        private var hasExternalObjectIds: JsonField<Boolean>? = null
        private var hasOwners: JsonField<Boolean>? = null
        private var hasPipelines: JsonField<Boolean>? = null
        private var indexedForFiltersAndReports: JsonField<Boolean>? = null
        private var lastModifiedPropertyName: JsonField<String>? = null
        private var metaType: JsonField<MetaType>? = null
        private var metaTypeId: JsonField<Int>? = null
        private var name: JsonField<String>? = null
        private var objectTypeId: JsonField<String>? = null
        private var permissioningType: JsonField<PermissioningType>? = null
        private var pipelinePropertyName: JsonField<String>? = null
        private var pipelineStagePropertyName: JsonField<String>? = null
        private var requiredProperties: JsonField<MutableList<String>>? = null
        private var restorable: JsonField<Boolean>? = null
        private var scopeMappings: JsonField<MutableList<ScopeMapping>>? = null
        private var secondaryDisplayLabelPropertyNames: JsonField<MutableList<String>>? = null
        private var accessScopeName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var integrationAppId: JsonField<Int> = JsonMissing.of()
        private var janusGroup: JsonField<String> = JsonMissing.of()
        private var ownerPortalId: JsonField<Int> = JsonMissing.of()
        private var pipelineCloseDatePropertyName: JsonField<String> = JsonMissing.of()
        private var pipelineTimeToClosePropertyName: JsonField<String> = JsonMissing.of()
        private var pluralForm: JsonField<String> = JsonMissing.of()
        private var primaryDisplayLabelPropertyName: JsonField<String> = JsonMissing.of()
        private var readScopeName: JsonField<String> = JsonMissing.of()
        private var singularForm: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var visibility: JsonField<Visibility> = JsonMissing.of()
        private var writeScopeName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundDbObjectType: InboundDbObjectType) = apply {
            id = inboundDbObjectType.id
            allowsSensitiveProperties = inboundDbObjectType.allowsSensitiveProperties
            createDatePropertyName = inboundDbObjectType.createDatePropertyName
            defaultSearchPropertyNames =
                inboundDbObjectType.defaultSearchPropertyNames.map { it.toMutableList() }
            deleted = inboundDbObjectType.deleted
            fullyQualifiedName = inboundDbObjectType.fullyQualifiedName
            hasCustomProperties = inboundDbObjectType.hasCustomProperties
            hasDefaultProperties = inboundDbObjectType.hasDefaultProperties
            hasExternalObjectIds = inboundDbObjectType.hasExternalObjectIds
            hasOwners = inboundDbObjectType.hasOwners
            hasPipelines = inboundDbObjectType.hasPipelines
            indexedForFiltersAndReports = inboundDbObjectType.indexedForFiltersAndReports
            lastModifiedPropertyName = inboundDbObjectType.lastModifiedPropertyName
            metaType = inboundDbObjectType.metaType
            metaTypeId = inboundDbObjectType.metaTypeId
            name = inboundDbObjectType.name
            objectTypeId = inboundDbObjectType.objectTypeId
            permissioningType = inboundDbObjectType.permissioningType
            pipelinePropertyName = inboundDbObjectType.pipelinePropertyName
            pipelineStagePropertyName = inboundDbObjectType.pipelineStagePropertyName
            requiredProperties = inboundDbObjectType.requiredProperties.map { it.toMutableList() }
            restorable = inboundDbObjectType.restorable
            scopeMappings = inboundDbObjectType.scopeMappings.map { it.toMutableList() }
            secondaryDisplayLabelPropertyNames =
                inboundDbObjectType.secondaryDisplayLabelPropertyNames.map { it.toMutableList() }
            accessScopeName = inboundDbObjectType.accessScopeName
            createdAt = inboundDbObjectType.createdAt
            description = inboundDbObjectType.description
            integrationAppId = inboundDbObjectType.integrationAppId
            janusGroup = inboundDbObjectType.janusGroup
            ownerPortalId = inboundDbObjectType.ownerPortalId
            pipelineCloseDatePropertyName = inboundDbObjectType.pipelineCloseDatePropertyName
            pipelineTimeToClosePropertyName = inboundDbObjectType.pipelineTimeToClosePropertyName
            pluralForm = inboundDbObjectType.pluralForm
            primaryDisplayLabelPropertyName = inboundDbObjectType.primaryDisplayLabelPropertyName
            readScopeName = inboundDbObjectType.readScopeName
            singularForm = inboundDbObjectType.singularForm
            status = inboundDbObjectType.status
            visibility = inboundDbObjectType.visibility
            writeScopeName = inboundDbObjectType.writeScopeName
            additionalProperties = inboundDbObjectType.additionalProperties.toMutableMap()
        }

        fun id(id: Int) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Int>) = apply { this.id = id }

        fun allowsSensitiveProperties(allowsSensitiveProperties: Boolean) =
            allowsSensitiveProperties(JsonField.of(allowsSensitiveProperties))

        /**
         * Sets [Builder.allowsSensitiveProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowsSensitiveProperties] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowsSensitiveProperties(allowsSensitiveProperties: JsonField<Boolean>) = apply {
            this.allowsSensitiveProperties = allowsSensitiveProperties
        }

        fun createDatePropertyName(createDatePropertyName: String) =
            createDatePropertyName(JsonField.of(createDatePropertyName))

        /**
         * Sets [Builder.createDatePropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createDatePropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createDatePropertyName(createDatePropertyName: JsonField<String>) = apply {
            this.createDatePropertyName = createDatePropertyName
        }

        fun defaultSearchPropertyNames(defaultSearchPropertyNames: List<String>) =
            defaultSearchPropertyNames(JsonField.of(defaultSearchPropertyNames))

        /**
         * Sets [Builder.defaultSearchPropertyNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultSearchPropertyNames] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun defaultSearchPropertyNames(defaultSearchPropertyNames: JsonField<List<String>>) =
            apply {
                this.defaultSearchPropertyNames =
                    defaultSearchPropertyNames.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [defaultSearchPropertyNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDefaultSearchPropertyName(defaultSearchPropertyName: String) = apply {
            defaultSearchPropertyNames =
                (defaultSearchPropertyNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("defaultSearchPropertyNames", it).add(defaultSearchPropertyName)
                }
        }

        fun deleted(deleted: Boolean) = deleted(JsonField.of(deleted))

        /**
         * Sets [Builder.deleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deleted(deleted: JsonField<Boolean>) = apply { this.deleted = deleted }

        fun fullyQualifiedName(fullyQualifiedName: String) =
            fullyQualifiedName(JsonField.of(fullyQualifiedName))

        /**
         * Sets [Builder.fullyQualifiedName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullyQualifiedName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
            this.fullyQualifiedName = fullyQualifiedName
        }

        fun hasCustomProperties(hasCustomProperties: Boolean) =
            hasCustomProperties(JsonField.of(hasCustomProperties))

        /**
         * Sets [Builder.hasCustomProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCustomProperties] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasCustomProperties(hasCustomProperties: JsonField<Boolean>) = apply {
            this.hasCustomProperties = hasCustomProperties
        }

        fun hasDefaultProperties(hasDefaultProperties: Boolean) =
            hasDefaultProperties(JsonField.of(hasDefaultProperties))

        /**
         * Sets [Builder.hasDefaultProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasDefaultProperties] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasDefaultProperties(hasDefaultProperties: JsonField<Boolean>) = apply {
            this.hasDefaultProperties = hasDefaultProperties
        }

        fun hasExternalObjectIds(hasExternalObjectIds: Boolean) =
            hasExternalObjectIds(JsonField.of(hasExternalObjectIds))

        /**
         * Sets [Builder.hasExternalObjectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasExternalObjectIds] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasExternalObjectIds(hasExternalObjectIds: JsonField<Boolean>) = apply {
            this.hasExternalObjectIds = hasExternalObjectIds
        }

        fun hasOwners(hasOwners: Boolean) = hasOwners(JsonField.of(hasOwners))

        /**
         * Sets [Builder.hasOwners] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasOwners] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasOwners(hasOwners: JsonField<Boolean>) = apply { this.hasOwners = hasOwners }

        fun hasPipelines(hasPipelines: Boolean) = hasPipelines(JsonField.of(hasPipelines))

        /**
         * Sets [Builder.hasPipelines] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasPipelines] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasPipelines(hasPipelines: JsonField<Boolean>) = apply {
            this.hasPipelines = hasPipelines
        }

        fun indexedForFiltersAndReports(indexedForFiltersAndReports: Boolean) =
            indexedForFiltersAndReports(JsonField.of(indexedForFiltersAndReports))

        /**
         * Sets [Builder.indexedForFiltersAndReports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexedForFiltersAndReports] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun indexedForFiltersAndReports(indexedForFiltersAndReports: JsonField<Boolean>) = apply {
            this.indexedForFiltersAndReports = indexedForFiltersAndReports
        }

        fun lastModifiedPropertyName(lastModifiedPropertyName: String) =
            lastModifiedPropertyName(JsonField.of(lastModifiedPropertyName))

        /**
         * Sets [Builder.lastModifiedPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModifiedPropertyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastModifiedPropertyName(lastModifiedPropertyName: JsonField<String>) = apply {
            this.lastModifiedPropertyName = lastModifiedPropertyName
        }

        fun metaType(metaType: MetaType) = metaType(JsonField.of(metaType))

        /**
         * Sets [Builder.metaType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metaType] with a well-typed [MetaType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metaType(metaType: JsonField<MetaType>) = apply { this.metaType = metaType }

        fun metaTypeId(metaTypeId: Int) = metaTypeId(JsonField.of(metaTypeId))

        /**
         * Sets [Builder.metaTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metaTypeId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metaTypeId(metaTypeId: JsonField<Int>) = apply { this.metaTypeId = metaTypeId }

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

        fun permissioningType(permissioningType: PermissioningType) =
            permissioningType(JsonField.of(permissioningType))

        /**
         * Sets [Builder.permissioningType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissioningType] with a well-typed [PermissioningType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun permissioningType(permissioningType: JsonField<PermissioningType>) = apply {
            this.permissioningType = permissioningType
        }

        fun pipelinePropertyName(pipelinePropertyName: String) =
            pipelinePropertyName(JsonField.of(pipelinePropertyName))

        /**
         * Sets [Builder.pipelinePropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelinePropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pipelinePropertyName(pipelinePropertyName: JsonField<String>) = apply {
            this.pipelinePropertyName = pipelinePropertyName
        }

        fun pipelineStagePropertyName(pipelineStagePropertyName: String) =
            pipelineStagePropertyName(JsonField.of(pipelineStagePropertyName))

        /**
         * Sets [Builder.pipelineStagePropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineStagePropertyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pipelineStagePropertyName(pipelineStagePropertyName: JsonField<String>) = apply {
            this.pipelineStagePropertyName = pipelineStagePropertyName
        }

        fun requiredProperties(requiredProperties: List<String>) =
            requiredProperties(JsonField.of(requiredProperties))

        /**
         * Sets [Builder.requiredProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredProperties] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requiredProperties(requiredProperties: JsonField<List<String>>) = apply {
            this.requiredProperties = requiredProperties.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [requiredProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredProperty(requiredProperty: String) = apply {
            requiredProperties =
                (requiredProperties ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredProperties", it).add(requiredProperty)
                }
        }

        fun restorable(restorable: Boolean) = restorable(JsonField.of(restorable))

        /**
         * Sets [Builder.restorable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restorable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun restorable(restorable: JsonField<Boolean>) = apply { this.restorable = restorable }

        fun scopeMappings(scopeMappings: List<ScopeMapping>) =
            scopeMappings(JsonField.of(scopeMappings))

        /**
         * Sets [Builder.scopeMappings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopeMappings] with a well-typed `List<ScopeMapping>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scopeMappings(scopeMappings: JsonField<List<ScopeMapping>>) = apply {
            this.scopeMappings = scopeMappings.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScopeMapping] to [scopeMappings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScopeMapping(scopeMapping: ScopeMapping) = apply {
            scopeMappings =
                (scopeMappings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopeMappings", it).add(scopeMapping)
                }
        }

        fun secondaryDisplayLabelPropertyNames(secondaryDisplayLabelPropertyNames: List<String>) =
            secondaryDisplayLabelPropertyNames(JsonField.of(secondaryDisplayLabelPropertyNames))

        /**
         * Sets [Builder.secondaryDisplayLabelPropertyNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryDisplayLabelPropertyNames] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun secondaryDisplayLabelPropertyNames(
            secondaryDisplayLabelPropertyNames: JsonField<List<String>>
        ) = apply {
            this.secondaryDisplayLabelPropertyNames =
                secondaryDisplayLabelPropertyNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [secondaryDisplayLabelPropertyNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecondaryDisplayLabelPropertyName(secondaryDisplayLabelPropertyName: String) =
            apply {
                secondaryDisplayLabelPropertyNames =
                    (secondaryDisplayLabelPropertyNames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("secondaryDisplayLabelPropertyNames", it)
                            .add(secondaryDisplayLabelPropertyName)
                    }
            }

        fun accessScopeName(accessScopeName: String) =
            accessScopeName(JsonField.of(accessScopeName))

        /**
         * Sets [Builder.accessScopeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessScopeName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accessScopeName(accessScopeName: JsonField<String>) = apply {
            this.accessScopeName = accessScopeName
        }

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun integrationAppId(integrationAppId: Int) =
            integrationAppId(JsonField.of(integrationAppId))

        /**
         * Sets [Builder.integrationAppId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationAppId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun integrationAppId(integrationAppId: JsonField<Int>) = apply {
            this.integrationAppId = integrationAppId
        }

        fun janusGroup(janusGroup: String) = janusGroup(JsonField.of(janusGroup))

        /**
         * Sets [Builder.janusGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.janusGroup] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun janusGroup(janusGroup: JsonField<String>) = apply { this.janusGroup = janusGroup }

        fun ownerPortalId(ownerPortalId: Int) = ownerPortalId(JsonField.of(ownerPortalId))

        /**
         * Sets [Builder.ownerPortalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownerPortalId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ownerPortalId(ownerPortalId: JsonField<Int>) = apply {
            this.ownerPortalId = ownerPortalId
        }

        fun pipelineCloseDatePropertyName(pipelineCloseDatePropertyName: String) =
            pipelineCloseDatePropertyName(JsonField.of(pipelineCloseDatePropertyName))

        /**
         * Sets [Builder.pipelineCloseDatePropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineCloseDatePropertyName] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun pipelineCloseDatePropertyName(pipelineCloseDatePropertyName: JsonField<String>) =
            apply {
                this.pipelineCloseDatePropertyName = pipelineCloseDatePropertyName
            }

        fun pipelineTimeToClosePropertyName(pipelineTimeToClosePropertyName: String) =
            pipelineTimeToClosePropertyName(JsonField.of(pipelineTimeToClosePropertyName))

        /**
         * Sets [Builder.pipelineTimeToClosePropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineTimeToClosePropertyName] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun pipelineTimeToClosePropertyName(pipelineTimeToClosePropertyName: JsonField<String>) =
            apply {
                this.pipelineTimeToClosePropertyName = pipelineTimeToClosePropertyName
            }

        fun pluralForm(pluralForm: String) = pluralForm(JsonField.of(pluralForm))

        /**
         * Sets [Builder.pluralForm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pluralForm] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pluralForm(pluralForm: JsonField<String>) = apply { this.pluralForm = pluralForm }

        fun primaryDisplayLabelPropertyName(primaryDisplayLabelPropertyName: String) =
            primaryDisplayLabelPropertyName(JsonField.of(primaryDisplayLabelPropertyName))

        /**
         * Sets [Builder.primaryDisplayLabelPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryDisplayLabelPropertyName] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun primaryDisplayLabelPropertyName(primaryDisplayLabelPropertyName: JsonField<String>) =
            apply {
                this.primaryDisplayLabelPropertyName = primaryDisplayLabelPropertyName
            }

        fun readScopeName(readScopeName: String) = readScopeName(JsonField.of(readScopeName))

        /**
         * Sets [Builder.readScopeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readScopeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readScopeName(readScopeName: JsonField<String>) = apply {
            this.readScopeName = readScopeName
        }

        fun singularForm(singularForm: String) = singularForm(JsonField.of(singularForm))

        /**
         * Sets [Builder.singularForm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.singularForm] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun singularForm(singularForm: JsonField<String>) = apply {
            this.singularForm = singularForm
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun visibility(visibility: Visibility) = visibility(JsonField.of(visibility))

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed [Visibility] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun visibility(visibility: JsonField<Visibility>) = apply { this.visibility = visibility }

        fun writeScopeName(writeScopeName: String) = writeScopeName(JsonField.of(writeScopeName))

        /**
         * Sets [Builder.writeScopeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.writeScopeName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun writeScopeName(writeScopeName: JsonField<String>) = apply {
            this.writeScopeName = writeScopeName
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
         * Returns an immutable instance of [InboundDbObjectType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowsSensitiveProperties()
         * .createDatePropertyName()
         * .defaultSearchPropertyNames()
         * .deleted()
         * .fullyQualifiedName()
         * .hasCustomProperties()
         * .hasDefaultProperties()
         * .hasExternalObjectIds()
         * .hasOwners()
         * .hasPipelines()
         * .indexedForFiltersAndReports()
         * .lastModifiedPropertyName()
         * .metaType()
         * .metaTypeId()
         * .name()
         * .objectTypeId()
         * .permissioningType()
         * .pipelinePropertyName()
         * .pipelineStagePropertyName()
         * .requiredProperties()
         * .restorable()
         * .scopeMappings()
         * .secondaryDisplayLabelPropertyNames()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundDbObjectType =
            InboundDbObjectType(
                checkRequired("id", id),
                checkRequired("allowsSensitiveProperties", allowsSensitiveProperties),
                checkRequired("createDatePropertyName", createDatePropertyName),
                checkRequired("defaultSearchPropertyNames", defaultSearchPropertyNames).map {
                    it.toImmutable()
                },
                checkRequired("deleted", deleted),
                checkRequired("fullyQualifiedName", fullyQualifiedName),
                checkRequired("hasCustomProperties", hasCustomProperties),
                checkRequired("hasDefaultProperties", hasDefaultProperties),
                checkRequired("hasExternalObjectIds", hasExternalObjectIds),
                checkRequired("hasOwners", hasOwners),
                checkRequired("hasPipelines", hasPipelines),
                checkRequired("indexedForFiltersAndReports", indexedForFiltersAndReports),
                checkRequired("lastModifiedPropertyName", lastModifiedPropertyName),
                checkRequired("metaType", metaType),
                checkRequired("metaTypeId", metaTypeId),
                checkRequired("name", name),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("permissioningType", permissioningType),
                checkRequired("pipelinePropertyName", pipelinePropertyName),
                checkRequired("pipelineStagePropertyName", pipelineStagePropertyName),
                checkRequired("requiredProperties", requiredProperties).map { it.toImmutable() },
                checkRequired("restorable", restorable),
                checkRequired("scopeMappings", scopeMappings).map { it.toImmutable() },
                checkRequired(
                        "secondaryDisplayLabelPropertyNames",
                        secondaryDisplayLabelPropertyNames,
                    )
                    .map { it.toImmutable() },
                accessScopeName,
                createdAt,
                description,
                integrationAppId,
                janusGroup,
                ownerPortalId,
                pipelineCloseDatePropertyName,
                pipelineTimeToClosePropertyName,
                pluralForm,
                primaryDisplayLabelPropertyName,
                readScopeName,
                singularForm,
                status,
                visibility,
                writeScopeName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundDbObjectType = apply {
        if (validated) {
            return@apply
        }

        id()
        allowsSensitiveProperties()
        createDatePropertyName()
        defaultSearchPropertyNames()
        deleted()
        fullyQualifiedName()
        hasCustomProperties()
        hasDefaultProperties()
        hasExternalObjectIds()
        hasOwners()
        hasPipelines()
        indexedForFiltersAndReports()
        lastModifiedPropertyName()
        metaType().validate()
        metaTypeId()
        name()
        objectTypeId()
        permissioningType().validate()
        pipelinePropertyName()
        pipelineStagePropertyName()
        requiredProperties()
        restorable()
        scopeMappings().forEach { it.validate() }
        secondaryDisplayLabelPropertyNames()
        accessScopeName()
        createdAt()
        description()
        integrationAppId()
        janusGroup()
        ownerPortalId()
        pipelineCloseDatePropertyName()
        pipelineTimeToClosePropertyName()
        pluralForm()
        primaryDisplayLabelPropertyName()
        readScopeName()
        singularForm()
        status().ifPresent { it.validate() }
        visibility().ifPresent { it.validate() }
        writeScopeName()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (allowsSensitiveProperties.asKnown().isPresent) 1 else 0) +
            (if (createDatePropertyName.asKnown().isPresent) 1 else 0) +
            (defaultSearchPropertyNames.asKnown().getOrNull()?.size ?: 0) +
            (if (deleted.asKnown().isPresent) 1 else 0) +
            (if (fullyQualifiedName.asKnown().isPresent) 1 else 0) +
            (if (hasCustomProperties.asKnown().isPresent) 1 else 0) +
            (if (hasDefaultProperties.asKnown().isPresent) 1 else 0) +
            (if (hasExternalObjectIds.asKnown().isPresent) 1 else 0) +
            (if (hasOwners.asKnown().isPresent) 1 else 0) +
            (if (hasPipelines.asKnown().isPresent) 1 else 0) +
            (if (indexedForFiltersAndReports.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedPropertyName.asKnown().isPresent) 1 else 0) +
            (metaType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (metaTypeId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (permissioningType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pipelinePropertyName.asKnown().isPresent) 1 else 0) +
            (if (pipelineStagePropertyName.asKnown().isPresent) 1 else 0) +
            (requiredProperties.asKnown().getOrNull()?.size ?: 0) +
            (if (restorable.asKnown().isPresent) 1 else 0) +
            (scopeMappings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (secondaryDisplayLabelPropertyNames.asKnown().getOrNull()?.size ?: 0) +
            (if (accessScopeName.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (integrationAppId.asKnown().isPresent) 1 else 0) +
            (if (janusGroup.asKnown().isPresent) 1 else 0) +
            (if (ownerPortalId.asKnown().isPresent) 1 else 0) +
            (if (pipelineCloseDatePropertyName.asKnown().isPresent) 1 else 0) +
            (if (pipelineTimeToClosePropertyName.asKnown().isPresent) 1 else 0) +
            (if (pluralForm.asKnown().isPresent) 1 else 0) +
            (if (primaryDisplayLabelPropertyName.asKnown().isPresent) 1 else 0) +
            (if (readScopeName.asKnown().isPresent) 1 else 0) +
            (if (singularForm.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (visibility.asKnown().getOrNull()?.validity() ?: 0) +
            (if (writeScopeName.asKnown().isPresent) 1 else 0)

    class MetaType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CMS_HUBDB = of("CMS_HUBDB")

            @JvmField val HUBSPOT = of("HUBSPOT")

            @JvmField val HUBSPOT_EVENT = of("HUBSPOT_EVENT")

            @JvmField val INTEGRATION = of("INTEGRATION")

            @JvmField val INTEGRATION_EVENT = of("INTEGRATION_EVENT")

            @JvmField val PORTAL_SPECIFIC = of("PORTAL_SPECIFIC")

            @JvmField val PORTAL_SPECIFIC_EVENT = of("PORTAL_SPECIFIC_EVENT")

            @JvmField val WORK = of("WORK")

            @JvmField val WORK_SUB = of("WORK_SUB")

            @JvmStatic fun of(value: String) = MetaType(JsonField.of(value))
        }

        /** An enum containing [MetaType]'s known values. */
        enum class Known {
            CMS_HUBDB,
            HUBSPOT,
            HUBSPOT_EVENT,
            INTEGRATION,
            INTEGRATION_EVENT,
            PORTAL_SPECIFIC,
            PORTAL_SPECIFIC_EVENT,
            WORK,
            WORK_SUB,
        }

        /**
         * An enum containing [MetaType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MetaType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CMS_HUBDB,
            HUBSPOT,
            HUBSPOT_EVENT,
            INTEGRATION,
            INTEGRATION_EVENT,
            PORTAL_SPECIFIC,
            PORTAL_SPECIFIC_EVENT,
            WORK,
            WORK_SUB,
            /** An enum member indicating that [MetaType] was instantiated with an unknown value. */
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
                CMS_HUBDB -> Value.CMS_HUBDB
                HUBSPOT -> Value.HUBSPOT
                HUBSPOT_EVENT -> Value.HUBSPOT_EVENT
                INTEGRATION -> Value.INTEGRATION
                INTEGRATION_EVENT -> Value.INTEGRATION_EVENT
                PORTAL_SPECIFIC -> Value.PORTAL_SPECIFIC
                PORTAL_SPECIFIC_EVENT -> Value.PORTAL_SPECIFIC_EVENT
                WORK -> Value.WORK
                WORK_SUB -> Value.WORK_SUB
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
                CMS_HUBDB -> Known.CMS_HUBDB
                HUBSPOT -> Known.HUBSPOT
                HUBSPOT_EVENT -> Known.HUBSPOT_EVENT
                INTEGRATION -> Known.INTEGRATION
                INTEGRATION_EVENT -> Known.INTEGRATION_EVENT
                PORTAL_SPECIFIC -> Known.PORTAL_SPECIFIC
                PORTAL_SPECIFIC_EVENT -> Known.PORTAL_SPECIFIC_EVENT
                WORK -> Known.WORK
                WORK_SUB -> Known.WORK_SUB
                else -> throw HubspotInvalidDataException("Unknown MetaType: $value")
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

        fun validate(): MetaType = apply {
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

            return other is MetaType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PermissioningType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALL_OR_NONE = of("ALL_OR_NONE")

            @JvmField val DO_NOT_CHECK_PERMISSIONS = of("DO_NOT_CHECK_PERMISSIONS")

            @JvmField val EXPLICIT = of("EXPLICIT")

            @JvmField val OWNER_BASED = of("OWNER_BASED")

            @JvmField val TEAM_BASED = of("TEAM_BASED")

            @JvmStatic fun of(value: String) = PermissioningType(JsonField.of(value))
        }

        /** An enum containing [PermissioningType]'s known values. */
        enum class Known {
            ALL_OR_NONE,
            DO_NOT_CHECK_PERMISSIONS,
            EXPLICIT,
            OWNER_BASED,
            TEAM_BASED,
        }

        /**
         * An enum containing [PermissioningType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PermissioningType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL_OR_NONE,
            DO_NOT_CHECK_PERMISSIONS,
            EXPLICIT,
            OWNER_BASED,
            TEAM_BASED,
            /**
             * An enum member indicating that [PermissioningType] was instantiated with an unknown
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
                ALL_OR_NONE -> Value.ALL_OR_NONE
                DO_NOT_CHECK_PERMISSIONS -> Value.DO_NOT_CHECK_PERMISSIONS
                EXPLICIT -> Value.EXPLICIT
                OWNER_BASED -> Value.OWNER_BASED
                TEAM_BASED -> Value.TEAM_BASED
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
                ALL_OR_NONE -> Known.ALL_OR_NONE
                DO_NOT_CHECK_PERMISSIONS -> Known.DO_NOT_CHECK_PERMISSIONS
                EXPLICIT -> Known.EXPLICIT
                OWNER_BASED -> Known.OWNER_BASED
                TEAM_BASED -> Known.TEAM_BASED
                else -> throw HubspotInvalidDataException("Unknown PermissioningType: $value")
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

        fun validate(): PermissioningType = apply {
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

            return other is PermissioningType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEPRECATED = of("Deprecated")

            @JvmField val IN_DEVELOPMENT = of("In development")

            @JvmField val LIVE = of("Live")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DEPRECATED,
            IN_DEVELOPMENT,
            LIVE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEPRECATED,
            IN_DEVELOPMENT,
            LIVE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                DEPRECATED -> Value.DEPRECATED
                IN_DEVELOPMENT -> Value.IN_DEVELOPMENT
                LIVE -> Value.LIVE
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
                DEPRECATED -> Known.DEPRECATED
                IN_DEVELOPMENT -> Known.IN_DEVELOPMENT
                LIVE -> Known.LIVE
                else -> throw HubspotInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Visibility @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CUSTOMER_FACING = of("Customer-facing")

            @JvmField val CUSTOMER_FACING_PUBLIC_API = of("Customer-facing public API")

            @JvmField val CUSTOMER_FACING_UI = of("Customer-facing UI")

            @JvmField val INTERNAL_ONLY = of("Internal only")

            @JvmStatic fun of(value: String) = Visibility(JsonField.of(value))
        }

        /** An enum containing [Visibility]'s known values. */
        enum class Known {
            CUSTOMER_FACING,
            CUSTOMER_FACING_PUBLIC_API,
            CUSTOMER_FACING_UI,
            INTERNAL_ONLY,
        }

        /**
         * An enum containing [Visibility]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Visibility] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER_FACING,
            CUSTOMER_FACING_PUBLIC_API,
            CUSTOMER_FACING_UI,
            INTERNAL_ONLY,
            /**
             * An enum member indicating that [Visibility] was instantiated with an unknown value.
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
                CUSTOMER_FACING -> Value.CUSTOMER_FACING
                CUSTOMER_FACING_PUBLIC_API -> Value.CUSTOMER_FACING_PUBLIC_API
                CUSTOMER_FACING_UI -> Value.CUSTOMER_FACING_UI
                INTERNAL_ONLY -> Value.INTERNAL_ONLY
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
                CUSTOMER_FACING -> Known.CUSTOMER_FACING
                CUSTOMER_FACING_PUBLIC_API -> Known.CUSTOMER_FACING_PUBLIC_API
                CUSTOMER_FACING_UI -> Known.CUSTOMER_FACING_UI
                INTERNAL_ONLY -> Known.INTERNAL_ONLY
                else -> throw HubspotInvalidDataException("Unknown Visibility: $value")
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

        fun validate(): Visibility = apply {
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

            return other is Visibility && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundDbObjectType &&
            id == other.id &&
            allowsSensitiveProperties == other.allowsSensitiveProperties &&
            createDatePropertyName == other.createDatePropertyName &&
            defaultSearchPropertyNames == other.defaultSearchPropertyNames &&
            deleted == other.deleted &&
            fullyQualifiedName == other.fullyQualifiedName &&
            hasCustomProperties == other.hasCustomProperties &&
            hasDefaultProperties == other.hasDefaultProperties &&
            hasExternalObjectIds == other.hasExternalObjectIds &&
            hasOwners == other.hasOwners &&
            hasPipelines == other.hasPipelines &&
            indexedForFiltersAndReports == other.indexedForFiltersAndReports &&
            lastModifiedPropertyName == other.lastModifiedPropertyName &&
            metaType == other.metaType &&
            metaTypeId == other.metaTypeId &&
            name == other.name &&
            objectTypeId == other.objectTypeId &&
            permissioningType == other.permissioningType &&
            pipelinePropertyName == other.pipelinePropertyName &&
            pipelineStagePropertyName == other.pipelineStagePropertyName &&
            requiredProperties == other.requiredProperties &&
            restorable == other.restorable &&
            scopeMappings == other.scopeMappings &&
            secondaryDisplayLabelPropertyNames == other.secondaryDisplayLabelPropertyNames &&
            accessScopeName == other.accessScopeName &&
            createdAt == other.createdAt &&
            description == other.description &&
            integrationAppId == other.integrationAppId &&
            janusGroup == other.janusGroup &&
            ownerPortalId == other.ownerPortalId &&
            pipelineCloseDatePropertyName == other.pipelineCloseDatePropertyName &&
            pipelineTimeToClosePropertyName == other.pipelineTimeToClosePropertyName &&
            pluralForm == other.pluralForm &&
            primaryDisplayLabelPropertyName == other.primaryDisplayLabelPropertyName &&
            readScopeName == other.readScopeName &&
            singularForm == other.singularForm &&
            status == other.status &&
            visibility == other.visibility &&
            writeScopeName == other.writeScopeName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            allowsSensitiveProperties,
            createDatePropertyName,
            defaultSearchPropertyNames,
            deleted,
            fullyQualifiedName,
            hasCustomProperties,
            hasDefaultProperties,
            hasExternalObjectIds,
            hasOwners,
            hasPipelines,
            indexedForFiltersAndReports,
            lastModifiedPropertyName,
            metaType,
            metaTypeId,
            name,
            objectTypeId,
            permissioningType,
            pipelinePropertyName,
            pipelineStagePropertyName,
            requiredProperties,
            restorable,
            scopeMappings,
            secondaryDisplayLabelPropertyNames,
            accessScopeName,
            createdAt,
            description,
            integrationAppId,
            janusGroup,
            ownerPortalId,
            pipelineCloseDatePropertyName,
            pipelineTimeToClosePropertyName,
            pluralForm,
            primaryDisplayLabelPropertyName,
            readScopeName,
            singularForm,
            status,
            visibility,
            writeScopeName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundDbObjectType{id=$id, allowsSensitiveProperties=$allowsSensitiveProperties, createDatePropertyName=$createDatePropertyName, defaultSearchPropertyNames=$defaultSearchPropertyNames, deleted=$deleted, fullyQualifiedName=$fullyQualifiedName, hasCustomProperties=$hasCustomProperties, hasDefaultProperties=$hasDefaultProperties, hasExternalObjectIds=$hasExternalObjectIds, hasOwners=$hasOwners, hasPipelines=$hasPipelines, indexedForFiltersAndReports=$indexedForFiltersAndReports, lastModifiedPropertyName=$lastModifiedPropertyName, metaType=$metaType, metaTypeId=$metaTypeId, name=$name, objectTypeId=$objectTypeId, permissioningType=$permissioningType, pipelinePropertyName=$pipelinePropertyName, pipelineStagePropertyName=$pipelineStagePropertyName, requiredProperties=$requiredProperties, restorable=$restorable, scopeMappings=$scopeMappings, secondaryDisplayLabelPropertyNames=$secondaryDisplayLabelPropertyNames, accessScopeName=$accessScopeName, createdAt=$createdAt, description=$description, integrationAppId=$integrationAppId, janusGroup=$janusGroup, ownerPortalId=$ownerPortalId, pipelineCloseDatePropertyName=$pipelineCloseDatePropertyName, pipelineTimeToClosePropertyName=$pipelineTimeToClosePropertyName, pluralForm=$pluralForm, primaryDisplayLabelPropertyName=$primaryDisplayLabelPropertyName, readScopeName=$readScopeName, singularForm=$singularForm, status=$status, visibility=$visibility, writeScopeName=$writeScopeName, additionalProperties=$additionalProperties}"
}
