// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkIntegratorObjectCreationResponseTest {

    @Test
    fun create() {
        val bulkIntegratorObjectCreationResponse =
            BulkIntegratorObjectCreationResponse.builder()
                .createdObjects(
                    BulkIntegratorObjectCreationResponse.CreatedObjects.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "objectType" to
                                        mapOf(
                                            "id" to 0,
                                            "allowsSensitiveProperties" to true,
                                            "createDatePropertyName" to "createDatePropertyName",
                                            "defaultSearchPropertyNames" to listOf("string"),
                                            "deleted" to true,
                                            "fullyQualifiedName" to "fullyQualifiedName",
                                            "hasCustomProperties" to true,
                                            "hasDefaultProperties" to true,
                                            "hasExternalObjectIds" to true,
                                            "hasOwners" to true,
                                            "hasPipelines" to true,
                                            "indexedForFiltersAndReports" to true,
                                            "lastModifiedPropertyName" to
                                                "lastModifiedPropertyName",
                                            "metaType" to "CMS_HUBDB",
                                            "metaTypeId" to 0,
                                            "name" to "name",
                                            "objectTypeId" to "objectTypeId",
                                            "permissioningType" to "ALL_OR_NONE",
                                            "pipelinePropertyName" to "pipelinePropertyName",
                                            "pipelineStagePropertyName" to
                                                "pipelineStagePropertyName",
                                            "requiredProperties" to listOf("string"),
                                            "restorable" to true,
                                            "scopeMappings" to
                                                listOf(
                                                    mapOf(
                                                        "accessLevel" to "ALL",
                                                        "requestAction" to "COMMUNICATE",
                                                        "scopeName" to "scopeName",
                                                    )
                                                ),
                                            "secondaryDisplayLabelPropertyNames" to
                                                listOf("string"),
                                            "accessScopeName" to "accessScopeName",
                                            "createdAt" to 0,
                                            "description" to "description",
                                            "integrationAppId" to 0,
                                            "janusGroup" to "janusGroup",
                                            "ownerPortalId" to 0,
                                            "pipelineCloseDatePropertyName" to
                                                "pipelineCloseDatePropertyName",
                                            "pipelineTimeToClosePropertyName" to
                                                "pipelineTimeToClosePropertyName",
                                            "pluralForm" to "pluralForm",
                                            "primaryDisplayLabelPropertyName" to
                                                "primaryDisplayLabelPropertyName",
                                            "readScopeName" to "readScopeName",
                                            "singularForm" to "singularForm",
                                            "status" to "Deprecated",
                                            "visibility" to "Customer-facing",
                                            "writeScopeName" to "writeScopeName",
                                        ),
                                    "properties" to
                                        listOf(
                                            mapOf(
                                                "objectTypeId" to "objectTypeId",
                                                "property" to
                                                    mapOf(
                                                        "allowedObjectTypes" to
                                                            listOf(
                                                                mapOf(
                                                                    "innerId" to 0,
                                                                    "metaTypeId" to 0,
                                                                )
                                                            ),
                                                        "calculated" to true,
                                                        "canArchive" to true,
                                                        "canRestore" to true,
                                                        "createdAt" to 0,
                                                        "createdUserId" to 0,
                                                        "currencyPropertyName" to
                                                            "currencyPropertyName",
                                                        "dataSensitivity" to "high",
                                                        "dateDisplayHint" to "absolute",
                                                        "deleted" to true,
                                                        "description" to "description",
                                                        "displayMode" to "all_unique_versions",
                                                        "displayOrder" to 0,
                                                        "enforceMultivalueUniqueness" to true,
                                                        "externalOptions" to true,
                                                        "externalOptionsReferenceType" to
                                                            "externalOptionsReferenceType",
                                                        "favorited" to true,
                                                        "favoritedOrder" to 0,
                                                        "fieldType" to "fieldType",
                                                        "formField" to true,
                                                        "fromUserId" to 0,
                                                        "groupName" to "groupName",
                                                        "hasUniqueValue" to true,
                                                        "hidden" to false,
                                                        "hubspotDefined" to true,
                                                        "isCustomizedDefault" to true,
                                                        "isMultiValued" to true,
                                                        "isPartial" to true,
                                                        "label" to "label",
                                                        "mutableDefinitionNotDeletable" to true,
                                                        "name" to "name",
                                                        "numberDisplayHint" to "currency",
                                                        "options" to
                                                            listOf(
                                                                mapOf(
                                                                    "description" to "description",
                                                                    "displayOrder" to 0,
                                                                    "doubleData" to 0,
                                                                    "hidden" to true,
                                                                    "label" to "label",
                                                                    "readOnly" to true,
                                                                    "value" to "value",
                                                                )
                                                            ),
                                                        "optionsAreMutable" to true,
                                                        "optionSortStrategy" to "ALPHABETICAL",
                                                        "owningAppId" to 0,
                                                        "portalId" to 0,
                                                        "readOnlyDefinition" to true,
                                                        "readOnlyValue" to true,
                                                        "referencedObjectType" to "ABANDONED_CART",
                                                        "searchableInGlobalSearch" to true,
                                                        "searchTextAnalysisMode" to "NONE",
                                                        "sensitiveDataCategories" to
                                                            listOf("string"),
                                                        "showCurrencySymbol" to true,
                                                        "textDisplayHint" to "domain_name",
                                                        "type" to "bool",
                                                        "updatedAt" to 0,
                                                    ),
                                                "calculationExpression" to
                                                    mapOf(
                                                        "operator" to "CONSTANT_BOOLEAN",
                                                        "propertyName" to "propertyName",
                                                        "value" to true,
                                                    ),
                                                "calculationFormula" to "calculationFormula",
                                                "definitionSource" to
                                                    mapOf("type" to "GLOBAL", "name" to "name"),
                                                "extensionData" to
                                                    mapOf(
                                                        "extensionStatusMap" to
                                                            mapOf("foo" to "OK"),
                                                        "tags" to listOf("string"),
                                                        "caseChangeTestExtensionData" to
                                                            mapOf("mood" to "ANGRY"),
                                                        "optionDecoratorsExtensionData" to
                                                            mapOf(
                                                                "optionDecorators" to
                                                                    mapOf(
                                                                        "foo" to
                                                                            mapOf(
                                                                                "color" to "BLACK"
                                                                            )
                                                                    ),
                                                                "optionDecoratorStyle" to
                                                                    "LABEL_ONLY",
                                                            ),
                                                        "requiredPropertiesExtensionData" to
                                                            mapOf("isRequiredProperty" to true),
                                                        "softRequiredPropertiesExtensionData" to
                                                            mapOf("isSoftRequiredProperty" to true),
                                                    ),
                                                "externalOptionsMetaData" to
                                                    mapOf(
                                                        "filter" to
                                                            mapOf(
                                                                "includeHelpdeskRoutableTeamsOnly" to
                                                                    true,
                                                                "includeUnconfirmedUsers" to true,
                                                                "listProcessingTypes" to
                                                                    listOf("string"),
                                                                "pipelineIds" to listOf("string"),
                                                            ),
                                                        "relatedObjectTypeId" to
                                                            "relatedObjectTypeId",
                                                    ),
                                                "fulcrumPortalId" to 0,
                                                "fulcrumTimestamp" to 0,
                                                "janusGroup" to "janusGroup",
                                                "permission" to
                                                    mapOf("accessLevel" to "accessLevel"),
                                                "propertyDefinitionSource" to
                                                    mapOf("type" to "GLOBAL", "name" to "name"),
                                                "propertyRequirements" to
                                                    mapOf(
                                                        "gates" to listOf("string"),
                                                        "operator" to "AND",
                                                        "scopeNames" to listOf("string"),
                                                        "settings" to listOf("string"),
                                                    ),
                                                "rollupExpression" to
                                                    mapOf(
                                                        "associationTypes" to
                                                            listOf(
                                                                mapOf(
                                                                    "associationCategory" to
                                                                        "HUBSPOT_DEFINED",
                                                                    "associationTypeId" to 0,
                                                                )
                                                            ),
                                                        "rollupOperator" to "AVERAGE",
                                                        "sourceObjectTypeId" to
                                                            "sourceObjectTypeId",
                                                        "sourcePropertyName" to
                                                            "sourcePropertyName",
                                                        "conditionalExpression" to
                                                            mapOf(
                                                                "operator" to "CONSTANT_BOOLEAN",
                                                                "propertyName" to "propertyName",
                                                                "value" to true,
                                                            ),
                                                        "conditionalFormula" to
                                                            "conditionalFormula",
                                                        "emptyRollupValue" to "emptyRollupValue",
                                                        "sourceCompareByPropertyName" to
                                                            "sourceCompareByPropertyName",
                                                    ),
                                            )
                                        ),
                                    "propertyGroups" to
                                        listOf(
                                            mapOf(
                                                "deleted" to true,
                                                "displayName" to "displayName",
                                                "displayOrder" to 0,
                                                "fulcrumPortalId" to 0,
                                                "fulcrumTimestamp" to 0,
                                                "hubspotDefined" to true,
                                                "name" to "name",
                                                "portalId" to 0,
                                            )
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(bulkIntegratorObjectCreationResponse.createdObjects())
            .isEqualTo(
                BulkIntegratorObjectCreationResponse.CreatedObjects.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "objectType" to
                                    mapOf(
                                        "id" to 0,
                                        "allowsSensitiveProperties" to true,
                                        "createDatePropertyName" to "createDatePropertyName",
                                        "defaultSearchPropertyNames" to listOf("string"),
                                        "deleted" to true,
                                        "fullyQualifiedName" to "fullyQualifiedName",
                                        "hasCustomProperties" to true,
                                        "hasDefaultProperties" to true,
                                        "hasExternalObjectIds" to true,
                                        "hasOwners" to true,
                                        "hasPipelines" to true,
                                        "indexedForFiltersAndReports" to true,
                                        "lastModifiedPropertyName" to "lastModifiedPropertyName",
                                        "metaType" to "CMS_HUBDB",
                                        "metaTypeId" to 0,
                                        "name" to "name",
                                        "objectTypeId" to "objectTypeId",
                                        "permissioningType" to "ALL_OR_NONE",
                                        "pipelinePropertyName" to "pipelinePropertyName",
                                        "pipelineStagePropertyName" to "pipelineStagePropertyName",
                                        "requiredProperties" to listOf("string"),
                                        "restorable" to true,
                                        "scopeMappings" to
                                            listOf(
                                                mapOf(
                                                    "accessLevel" to "ALL",
                                                    "requestAction" to "COMMUNICATE",
                                                    "scopeName" to "scopeName",
                                                )
                                            ),
                                        "secondaryDisplayLabelPropertyNames" to listOf("string"),
                                        "accessScopeName" to "accessScopeName",
                                        "createdAt" to 0,
                                        "description" to "description",
                                        "integrationAppId" to 0,
                                        "janusGroup" to "janusGroup",
                                        "ownerPortalId" to 0,
                                        "pipelineCloseDatePropertyName" to
                                            "pipelineCloseDatePropertyName",
                                        "pipelineTimeToClosePropertyName" to
                                            "pipelineTimeToClosePropertyName",
                                        "pluralForm" to "pluralForm",
                                        "primaryDisplayLabelPropertyName" to
                                            "primaryDisplayLabelPropertyName",
                                        "readScopeName" to "readScopeName",
                                        "singularForm" to "singularForm",
                                        "status" to "Deprecated",
                                        "visibility" to "Customer-facing",
                                        "writeScopeName" to "writeScopeName",
                                    ),
                                "properties" to
                                    listOf(
                                        mapOf(
                                            "objectTypeId" to "objectTypeId",
                                            "property" to
                                                mapOf(
                                                    "allowedObjectTypes" to
                                                        listOf(
                                                            mapOf("innerId" to 0, "metaTypeId" to 0)
                                                        ),
                                                    "calculated" to true,
                                                    "canArchive" to true,
                                                    "canRestore" to true,
                                                    "createdAt" to 0,
                                                    "createdUserId" to 0,
                                                    "currencyPropertyName" to
                                                        "currencyPropertyName",
                                                    "dataSensitivity" to "high",
                                                    "dateDisplayHint" to "absolute",
                                                    "deleted" to true,
                                                    "description" to "description",
                                                    "displayMode" to "all_unique_versions",
                                                    "displayOrder" to 0,
                                                    "enforceMultivalueUniqueness" to true,
                                                    "externalOptions" to true,
                                                    "externalOptionsReferenceType" to
                                                        "externalOptionsReferenceType",
                                                    "favorited" to true,
                                                    "favoritedOrder" to 0,
                                                    "fieldType" to "fieldType",
                                                    "formField" to true,
                                                    "fromUserId" to 0,
                                                    "groupName" to "groupName",
                                                    "hasUniqueValue" to true,
                                                    "hidden" to false,
                                                    "hubspotDefined" to true,
                                                    "isCustomizedDefault" to true,
                                                    "isMultiValued" to true,
                                                    "isPartial" to true,
                                                    "label" to "label",
                                                    "mutableDefinitionNotDeletable" to true,
                                                    "name" to "name",
                                                    "numberDisplayHint" to "currency",
                                                    "options" to
                                                        listOf(
                                                            mapOf(
                                                                "description" to "description",
                                                                "displayOrder" to 0,
                                                                "doubleData" to 0,
                                                                "hidden" to true,
                                                                "label" to "label",
                                                                "readOnly" to true,
                                                                "value" to "value",
                                                            )
                                                        ),
                                                    "optionsAreMutable" to true,
                                                    "optionSortStrategy" to "ALPHABETICAL",
                                                    "owningAppId" to 0,
                                                    "portalId" to 0,
                                                    "readOnlyDefinition" to true,
                                                    "readOnlyValue" to true,
                                                    "referencedObjectType" to "ABANDONED_CART",
                                                    "searchableInGlobalSearch" to true,
                                                    "searchTextAnalysisMode" to "NONE",
                                                    "sensitiveDataCategories" to listOf("string"),
                                                    "showCurrencySymbol" to true,
                                                    "textDisplayHint" to "domain_name",
                                                    "type" to "bool",
                                                    "updatedAt" to 0,
                                                ),
                                            "calculationExpression" to
                                                mapOf(
                                                    "operator" to "CONSTANT_BOOLEAN",
                                                    "propertyName" to "propertyName",
                                                    "value" to true,
                                                ),
                                            "calculationFormula" to "calculationFormula",
                                            "definitionSource" to
                                                mapOf("type" to "GLOBAL", "name" to "name"),
                                            "extensionData" to
                                                mapOf(
                                                    "extensionStatusMap" to mapOf("foo" to "OK"),
                                                    "tags" to listOf("string"),
                                                    "caseChangeTestExtensionData" to
                                                        mapOf("mood" to "ANGRY"),
                                                    "optionDecoratorsExtensionData" to
                                                        mapOf(
                                                            "optionDecorators" to
                                                                mapOf(
                                                                    "foo" to
                                                                        mapOf("color" to "BLACK")
                                                                ),
                                                            "optionDecoratorStyle" to "LABEL_ONLY",
                                                        ),
                                                    "requiredPropertiesExtensionData" to
                                                        mapOf("isRequiredProperty" to true),
                                                    "softRequiredPropertiesExtensionData" to
                                                        mapOf("isSoftRequiredProperty" to true),
                                                ),
                                            "externalOptionsMetaData" to
                                                mapOf(
                                                    "filter" to
                                                        mapOf(
                                                            "includeHelpdeskRoutableTeamsOnly" to
                                                                true,
                                                            "includeUnconfirmedUsers" to true,
                                                            "listProcessingTypes" to
                                                                listOf("string"),
                                                            "pipelineIds" to listOf("string"),
                                                        ),
                                                    "relatedObjectTypeId" to "relatedObjectTypeId",
                                                ),
                                            "fulcrumPortalId" to 0,
                                            "fulcrumTimestamp" to 0,
                                            "janusGroup" to "janusGroup",
                                            "permission" to mapOf("accessLevel" to "accessLevel"),
                                            "propertyDefinitionSource" to
                                                mapOf("type" to "GLOBAL", "name" to "name"),
                                            "propertyRequirements" to
                                                mapOf(
                                                    "gates" to listOf("string"),
                                                    "operator" to "AND",
                                                    "scopeNames" to listOf("string"),
                                                    "settings" to listOf("string"),
                                                ),
                                            "rollupExpression" to
                                                mapOf(
                                                    "associationTypes" to
                                                        listOf(
                                                            mapOf(
                                                                "associationCategory" to
                                                                    "HUBSPOT_DEFINED",
                                                                "associationTypeId" to 0,
                                                            )
                                                        ),
                                                    "rollupOperator" to "AVERAGE",
                                                    "sourceObjectTypeId" to "sourceObjectTypeId",
                                                    "sourcePropertyName" to "sourcePropertyName",
                                                    "conditionalExpression" to
                                                        mapOf(
                                                            "operator" to "CONSTANT_BOOLEAN",
                                                            "propertyName" to "propertyName",
                                                            "value" to true,
                                                        ),
                                                    "conditionalFormula" to "conditionalFormula",
                                                    "emptyRollupValue" to "emptyRollupValue",
                                                    "sourceCompareByPropertyName" to
                                                        "sourceCompareByPropertyName",
                                                ),
                                        )
                                    ),
                                "propertyGroups" to
                                    listOf(
                                        mapOf(
                                            "deleted" to true,
                                            "displayName" to "displayName",
                                            "displayOrder" to 0,
                                            "fulcrumPortalId" to 0,
                                            "fulcrumTimestamp" to 0,
                                            "hubspotDefined" to true,
                                            "name" to "name",
                                            "portalId" to 0,
                                        )
                                    ),
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkIntegratorObjectCreationResponse =
            BulkIntegratorObjectCreationResponse.builder()
                .createdObjects(
                    BulkIntegratorObjectCreationResponse.CreatedObjects.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "objectType" to
                                        mapOf(
                                            "id" to 0,
                                            "allowsSensitiveProperties" to true,
                                            "createDatePropertyName" to "createDatePropertyName",
                                            "defaultSearchPropertyNames" to listOf("string"),
                                            "deleted" to true,
                                            "fullyQualifiedName" to "fullyQualifiedName",
                                            "hasCustomProperties" to true,
                                            "hasDefaultProperties" to true,
                                            "hasExternalObjectIds" to true,
                                            "hasOwners" to true,
                                            "hasPipelines" to true,
                                            "indexedForFiltersAndReports" to true,
                                            "lastModifiedPropertyName" to
                                                "lastModifiedPropertyName",
                                            "metaType" to "CMS_HUBDB",
                                            "metaTypeId" to 0,
                                            "name" to "name",
                                            "objectTypeId" to "objectTypeId",
                                            "permissioningType" to "ALL_OR_NONE",
                                            "pipelinePropertyName" to "pipelinePropertyName",
                                            "pipelineStagePropertyName" to
                                                "pipelineStagePropertyName",
                                            "requiredProperties" to listOf("string"),
                                            "restorable" to true,
                                            "scopeMappings" to
                                                listOf(
                                                    mapOf(
                                                        "accessLevel" to "ALL",
                                                        "requestAction" to "COMMUNICATE",
                                                        "scopeName" to "scopeName",
                                                    )
                                                ),
                                            "secondaryDisplayLabelPropertyNames" to
                                                listOf("string"),
                                            "accessScopeName" to "accessScopeName",
                                            "createdAt" to 0,
                                            "description" to "description",
                                            "integrationAppId" to 0,
                                            "janusGroup" to "janusGroup",
                                            "ownerPortalId" to 0,
                                            "pipelineCloseDatePropertyName" to
                                                "pipelineCloseDatePropertyName",
                                            "pipelineTimeToClosePropertyName" to
                                                "pipelineTimeToClosePropertyName",
                                            "pluralForm" to "pluralForm",
                                            "primaryDisplayLabelPropertyName" to
                                                "primaryDisplayLabelPropertyName",
                                            "readScopeName" to "readScopeName",
                                            "singularForm" to "singularForm",
                                            "status" to "Deprecated",
                                            "visibility" to "Customer-facing",
                                            "writeScopeName" to "writeScopeName",
                                        ),
                                    "properties" to
                                        listOf(
                                            mapOf(
                                                "objectTypeId" to "objectTypeId",
                                                "property" to
                                                    mapOf(
                                                        "allowedObjectTypes" to
                                                            listOf(
                                                                mapOf(
                                                                    "innerId" to 0,
                                                                    "metaTypeId" to 0,
                                                                )
                                                            ),
                                                        "calculated" to true,
                                                        "canArchive" to true,
                                                        "canRestore" to true,
                                                        "createdAt" to 0,
                                                        "createdUserId" to 0,
                                                        "currencyPropertyName" to
                                                            "currencyPropertyName",
                                                        "dataSensitivity" to "high",
                                                        "dateDisplayHint" to "absolute",
                                                        "deleted" to true,
                                                        "description" to "description",
                                                        "displayMode" to "all_unique_versions",
                                                        "displayOrder" to 0,
                                                        "enforceMultivalueUniqueness" to true,
                                                        "externalOptions" to true,
                                                        "externalOptionsReferenceType" to
                                                            "externalOptionsReferenceType",
                                                        "favorited" to true,
                                                        "favoritedOrder" to 0,
                                                        "fieldType" to "fieldType",
                                                        "formField" to true,
                                                        "fromUserId" to 0,
                                                        "groupName" to "groupName",
                                                        "hasUniqueValue" to true,
                                                        "hidden" to false,
                                                        "hubspotDefined" to true,
                                                        "isCustomizedDefault" to true,
                                                        "isMultiValued" to true,
                                                        "isPartial" to true,
                                                        "label" to "label",
                                                        "mutableDefinitionNotDeletable" to true,
                                                        "name" to "name",
                                                        "numberDisplayHint" to "currency",
                                                        "options" to
                                                            listOf(
                                                                mapOf(
                                                                    "description" to "description",
                                                                    "displayOrder" to 0,
                                                                    "doubleData" to 0,
                                                                    "hidden" to true,
                                                                    "label" to "label",
                                                                    "readOnly" to true,
                                                                    "value" to "value",
                                                                )
                                                            ),
                                                        "optionsAreMutable" to true,
                                                        "optionSortStrategy" to "ALPHABETICAL",
                                                        "owningAppId" to 0,
                                                        "portalId" to 0,
                                                        "readOnlyDefinition" to true,
                                                        "readOnlyValue" to true,
                                                        "referencedObjectType" to "ABANDONED_CART",
                                                        "searchableInGlobalSearch" to true,
                                                        "searchTextAnalysisMode" to "NONE",
                                                        "sensitiveDataCategories" to
                                                            listOf("string"),
                                                        "showCurrencySymbol" to true,
                                                        "textDisplayHint" to "domain_name",
                                                        "type" to "bool",
                                                        "updatedAt" to 0,
                                                    ),
                                                "calculationExpression" to
                                                    mapOf(
                                                        "operator" to "CONSTANT_BOOLEAN",
                                                        "propertyName" to "propertyName",
                                                        "value" to true,
                                                    ),
                                                "calculationFormula" to "calculationFormula",
                                                "definitionSource" to
                                                    mapOf("type" to "GLOBAL", "name" to "name"),
                                                "extensionData" to
                                                    mapOf(
                                                        "extensionStatusMap" to
                                                            mapOf("foo" to "OK"),
                                                        "tags" to listOf("string"),
                                                        "caseChangeTestExtensionData" to
                                                            mapOf("mood" to "ANGRY"),
                                                        "optionDecoratorsExtensionData" to
                                                            mapOf(
                                                                "optionDecorators" to
                                                                    mapOf(
                                                                        "foo" to
                                                                            mapOf(
                                                                                "color" to "BLACK"
                                                                            )
                                                                    ),
                                                                "optionDecoratorStyle" to
                                                                    "LABEL_ONLY",
                                                            ),
                                                        "requiredPropertiesExtensionData" to
                                                            mapOf("isRequiredProperty" to true),
                                                        "softRequiredPropertiesExtensionData" to
                                                            mapOf("isSoftRequiredProperty" to true),
                                                    ),
                                                "externalOptionsMetaData" to
                                                    mapOf(
                                                        "filter" to
                                                            mapOf(
                                                                "includeHelpdeskRoutableTeamsOnly" to
                                                                    true,
                                                                "includeUnconfirmedUsers" to true,
                                                                "listProcessingTypes" to
                                                                    listOf("string"),
                                                                "pipelineIds" to listOf("string"),
                                                            ),
                                                        "relatedObjectTypeId" to
                                                            "relatedObjectTypeId",
                                                    ),
                                                "fulcrumPortalId" to 0,
                                                "fulcrumTimestamp" to 0,
                                                "janusGroup" to "janusGroup",
                                                "permission" to
                                                    mapOf("accessLevel" to "accessLevel"),
                                                "propertyDefinitionSource" to
                                                    mapOf("type" to "GLOBAL", "name" to "name"),
                                                "propertyRequirements" to
                                                    mapOf(
                                                        "gates" to listOf("string"),
                                                        "operator" to "AND",
                                                        "scopeNames" to listOf("string"),
                                                        "settings" to listOf("string"),
                                                    ),
                                                "rollupExpression" to
                                                    mapOf(
                                                        "associationTypes" to
                                                            listOf(
                                                                mapOf(
                                                                    "associationCategory" to
                                                                        "HUBSPOT_DEFINED",
                                                                    "associationTypeId" to 0,
                                                                )
                                                            ),
                                                        "rollupOperator" to "AVERAGE",
                                                        "sourceObjectTypeId" to
                                                            "sourceObjectTypeId",
                                                        "sourcePropertyName" to
                                                            "sourcePropertyName",
                                                        "conditionalExpression" to
                                                            mapOf(
                                                                "operator" to "CONSTANT_BOOLEAN",
                                                                "propertyName" to "propertyName",
                                                                "value" to true,
                                                            ),
                                                        "conditionalFormula" to
                                                            "conditionalFormula",
                                                        "emptyRollupValue" to "emptyRollupValue",
                                                        "sourceCompareByPropertyName" to
                                                            "sourceCompareByPropertyName",
                                                    ),
                                            )
                                        ),
                                    "propertyGroups" to
                                        listOf(
                                            mapOf(
                                                "deleted" to true,
                                                "displayName" to "displayName",
                                                "displayOrder" to 0,
                                                "fulcrumPortalId" to 0,
                                                "fulcrumTimestamp" to 0,
                                                "hubspotDefined" to true,
                                                "name" to "name",
                                                "portalId" to 0,
                                            )
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val roundtrippedBulkIntegratorObjectCreationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkIntegratorObjectCreationResponse),
                jacksonTypeRef<BulkIntegratorObjectCreationResponse>(),
            )

        assertThat(roundtrippedBulkIntegratorObjectCreationResponse)
            .isEqualTo(bulkIntegratorObjectCreationResponse)
    }
}
