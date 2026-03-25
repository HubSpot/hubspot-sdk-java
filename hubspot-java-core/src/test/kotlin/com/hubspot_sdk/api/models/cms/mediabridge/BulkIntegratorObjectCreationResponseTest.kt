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
                                                        "description" to "description",
                                                        "fieldType" to "fieldType",
                                                        "groupName" to "groupName",
                                                        "label" to "label",
                                                        "name" to "name",
                                                        "options" to
                                                            listOf(
                                                                mapOf(
                                                                    "hidden" to true,
                                                                    "label" to "label",
                                                                    "value" to "value",
                                                                    "description" to "description",
                                                                    "displayOrder" to 0,
                                                                )
                                                            ),
                                                        "type" to "type",
                                                        "archived" to true,
                                                        "archivedAt" to "2019-12-27T18:11:19.117Z",
                                                        "calculated" to true,
                                                        "calculationFormula" to
                                                            "calculationFormula",
                                                        "createdAt" to "2019-12-27T18:11:19.117Z",
                                                        "createdUserId" to "createdUserId",
                                                        "dataSensitivity" to "highly_sensitive",
                                                        "dateDisplayHint" to "absolute",
                                                        "displayOrder" to 0,
                                                        "externalOptions" to true,
                                                        "formField" to true,
                                                        "hasUniqueValue" to true,
                                                        "hidden" to false,
                                                        "hubspotDefined" to true,
                                                        "modificationMetadata" to
                                                            mapOf(
                                                                "archivable" to true,
                                                                "readOnlyDefinition" to true,
                                                                "readOnlyValue" to true,
                                                                "readOnlyOptions" to true,
                                                            ),
                                                        "referencedObjectType" to
                                                            "referencedObjectType",
                                                        "sensitiveDataCategories" to
                                                            listOf("string"),
                                                        "showCurrencySymbol" to true,
                                                        "updatedAt" to "2019-12-27T18:11:19.117Z",
                                                        "updatedUserId" to "updatedUserId",
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
                                                    "description" to "description",
                                                    "fieldType" to "fieldType",
                                                    "groupName" to "groupName",
                                                    "label" to "label",
                                                    "name" to "name",
                                                    "options" to
                                                        listOf(
                                                            mapOf(
                                                                "hidden" to true,
                                                                "label" to "label",
                                                                "value" to "value",
                                                                "description" to "description",
                                                                "displayOrder" to 0,
                                                            )
                                                        ),
                                                    "type" to "type",
                                                    "archived" to true,
                                                    "archivedAt" to "2019-12-27T18:11:19.117Z",
                                                    "calculated" to true,
                                                    "calculationFormula" to "calculationFormula",
                                                    "createdAt" to "2019-12-27T18:11:19.117Z",
                                                    "createdUserId" to "createdUserId",
                                                    "dataSensitivity" to "highly_sensitive",
                                                    "dateDisplayHint" to "absolute",
                                                    "displayOrder" to 0,
                                                    "externalOptions" to true,
                                                    "formField" to true,
                                                    "hasUniqueValue" to true,
                                                    "hidden" to false,
                                                    "hubspotDefined" to true,
                                                    "modificationMetadata" to
                                                        mapOf(
                                                            "archivable" to true,
                                                            "readOnlyDefinition" to true,
                                                            "readOnlyValue" to true,
                                                            "readOnlyOptions" to true,
                                                        ),
                                                    "referencedObjectType" to
                                                        "referencedObjectType",
                                                    "sensitiveDataCategories" to listOf("string"),
                                                    "showCurrencySymbol" to true,
                                                    "updatedAt" to "2019-12-27T18:11:19.117Z",
                                                    "updatedUserId" to "updatedUserId",
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
                                                        "description" to "description",
                                                        "fieldType" to "fieldType",
                                                        "groupName" to "groupName",
                                                        "label" to "label",
                                                        "name" to "name",
                                                        "options" to
                                                            listOf(
                                                                mapOf(
                                                                    "hidden" to true,
                                                                    "label" to "label",
                                                                    "value" to "value",
                                                                    "description" to "description",
                                                                    "displayOrder" to 0,
                                                                )
                                                            ),
                                                        "type" to "type",
                                                        "archived" to true,
                                                        "archivedAt" to "2019-12-27T18:11:19.117Z",
                                                        "calculated" to true,
                                                        "calculationFormula" to
                                                            "calculationFormula",
                                                        "createdAt" to "2019-12-27T18:11:19.117Z",
                                                        "createdUserId" to "createdUserId",
                                                        "dataSensitivity" to "highly_sensitive",
                                                        "dateDisplayHint" to "absolute",
                                                        "displayOrder" to 0,
                                                        "externalOptions" to true,
                                                        "formField" to true,
                                                        "hasUniqueValue" to true,
                                                        "hidden" to false,
                                                        "hubspotDefined" to true,
                                                        "modificationMetadata" to
                                                            mapOf(
                                                                "archivable" to true,
                                                                "readOnlyDefinition" to true,
                                                                "readOnlyValue" to true,
                                                                "readOnlyOptions" to true,
                                                            ),
                                                        "referencedObjectType" to
                                                            "referencedObjectType",
                                                        "sensitiveDataCategories" to
                                                            listOf("string"),
                                                        "showCurrencySymbol" to true,
                                                        "updatedAt" to "2019-12-27T18:11:19.117Z",
                                                        "updatedUserId" to "updatedUserId",
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
