// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingCreateObjectDefinitionResponseTest {

    @Test
    fun create() {
        val integratorSettingCreateObjectDefinitionResponse =
            IntegratorSettingCreateObjectDefinitionResponse.builder()
                .createdObjects(
                    IntegratorSettingCreateObjectDefinitionResponse.CreatedObjects.builder()
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
                                            "metaType" to "HUBSPOT",
                                            "metaTypeId" to 0,
                                            "name" to "name",
                                            "objectTypeId" to "objectTypeId",
                                            "permissioningType" to "permissioningType",
                                            "pipelinePropertyName" to "pipelinePropertyName",
                                            "pipelineStagePropertyName" to
                                                "pipelineStagePropertyName",
                                            "requiredProperties" to listOf("string"),
                                            "restorable" to true,
                                            "scopeMappings" to
                                                listOf(
                                                    mapOf(
                                                        "accessLevel" to "accessLevel",
                                                        "requestAction" to "requestAction",
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
                                            "status" to "status",
                                            "visibility" to "visibility",
                                            "writeScopeName" to "writeScopeName",
                                        ),
                                    "properties" to
                                        listOf(
                                            mapOf(
                                                "objectTypeId" to "objectTypeId",
                                                "property" to
                                                    mapOf(
                                                        "description" to "",
                                                        "fieldType" to "select",
                                                        "groupName" to "my_object_information",
                                                        "label" to "My object property",
                                                        "name" to "my_object_property",
                                                        "options" to
                                                            listOf(
                                                                mapOf(
                                                                    "description" to
                                                                        "Choice number one",
                                                                    "displayOrder" to 1,
                                                                    "doubleData" to 0,
                                                                    "hidden" to false,
                                                                    "label" to "Option A",
                                                                    "readOnly" to false,
                                                                    "value" to "A",
                                                                ),
                                                                mapOf(
                                                                    "description" to
                                                                        "Choice number two",
                                                                    "displayOrder" to 2,
                                                                    "doubleData" to 0,
                                                                    "hidden" to false,
                                                                    "label" to "Option B",
                                                                    "readOnly" to false,
                                                                    "value" to "B",
                                                                ),
                                                            ),
                                                        "type" to "enumeration",
                                                        "archived" to false,
                                                        "archivedAt" to "2019-12-27T18:11:19.117Z",
                                                        "calculated" to false,
                                                        "calculationFormula" to "",
                                                        "createdAt" to "2019-12-27T18:11:19.117Z",
                                                        "createdUserId" to "",
                                                        "dataSensitivity" to "non_sensitive",
                                                        "displayOrder" to 2,
                                                        "externalOptions" to false,
                                                        "formField" to false,
                                                        "hasUniqueValue" to false,
                                                        "hidden" to false,
                                                        "hubspotDefined" to false,
                                                        "modificationMetadata" to
                                                            mapOf(
                                                                "archivable" to true,
                                                                "readOnlyDefinition" to false,
                                                                "readOnlyValue" to false,
                                                                "readOnlyOptions" to false,
                                                            ),
                                                        "referencedObjectType" to "",
                                                        "sensitiveDataCategories" to
                                                            listOf("string"),
                                                        "showCurrencySymbol" to false,
                                                        "updatedAt" to "2019-12-27T18:11:19.117Z",
                                                        "updatedUserId" to "updatedUserId",
                                                    ),
                                                "calculationExpression" to
                                                    mapOf(
                                                        "operator" to "CONSTANT_BOOLEAN",
                                                        "inputs" to listOf(mapOf<String, Any>()),
                                                        "propertyName" to "propertyName",
                                                        "value" to true,
                                                    ),
                                                "calculationFormula" to "calculationFormula",
                                                "definitionSource" to
                                                    mapOf("type" to "GLOBAL", "name" to "name"),
                                                "extensionData" to
                                                    mapOf(
                                                        "extensionStatusMap" to
                                                            mapOf("foo" to "string"),
                                                        "tags" to listOf("string"),
                                                        "caseChangeTestExtensionData" to
                                                            mapOf("mood" to "mood"),
                                                        "optionDecoratorsExtensionData" to
                                                            mapOf(
                                                                "optionDecorators" to
                                                                    mapOf(
                                                                        "foo" to
                                                                            mapOf(
                                                                                "color" to "color"
                                                                            )
                                                                    ),
                                                                "optionDecoratorStyle" to
                                                                    "optionDecoratorStyle",
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
                                                                "includeUnconfirmedUsers" to true,
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
                                                    mapOf("type" to "type", "name" to "name"),
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
                                                        "rollupOperator" to "rollupOperator",
                                                        "sourceObjectTypeId" to
                                                            "sourceObjectTypeId",
                                                        "sourcePropertyName" to
                                                            "sourcePropertyName",
                                                        "conditionalExpression" to
                                                            mapOf(
                                                                "operator" to "CONSTANT_BOOLEAN",
                                                                "inputs" to
                                                                    listOf(mapOf<String, Any>()),
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

        assertThat(integratorSettingCreateObjectDefinitionResponse.createdObjects())
            .isEqualTo(
                IntegratorSettingCreateObjectDefinitionResponse.CreatedObjects.builder()
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
                                        "metaType" to "HUBSPOT",
                                        "metaTypeId" to 0,
                                        "name" to "name",
                                        "objectTypeId" to "objectTypeId",
                                        "permissioningType" to "permissioningType",
                                        "pipelinePropertyName" to "pipelinePropertyName",
                                        "pipelineStagePropertyName" to "pipelineStagePropertyName",
                                        "requiredProperties" to listOf("string"),
                                        "restorable" to true,
                                        "scopeMappings" to
                                            listOf(
                                                mapOf(
                                                    "accessLevel" to "accessLevel",
                                                    "requestAction" to "requestAction",
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
                                        "status" to "status",
                                        "visibility" to "visibility",
                                        "writeScopeName" to "writeScopeName",
                                    ),
                                "properties" to
                                    listOf(
                                        mapOf(
                                            "objectTypeId" to "objectTypeId",
                                            "property" to
                                                mapOf(
                                                    "description" to "",
                                                    "fieldType" to "select",
                                                    "groupName" to "my_object_information",
                                                    "label" to "My object property",
                                                    "name" to "my_object_property",
                                                    "options" to
                                                        listOf(
                                                            mapOf(
                                                                "description" to
                                                                    "Choice number one",
                                                                "displayOrder" to 1,
                                                                "doubleData" to 0,
                                                                "hidden" to false,
                                                                "label" to "Option A",
                                                                "readOnly" to false,
                                                                "value" to "A",
                                                            ),
                                                            mapOf(
                                                                "description" to
                                                                    "Choice number two",
                                                                "displayOrder" to 2,
                                                                "doubleData" to 0,
                                                                "hidden" to false,
                                                                "label" to "Option B",
                                                                "readOnly" to false,
                                                                "value" to "B",
                                                            ),
                                                        ),
                                                    "type" to "enumeration",
                                                    "archived" to false,
                                                    "archivedAt" to "2019-12-27T18:11:19.117Z",
                                                    "calculated" to false,
                                                    "calculationFormula" to "",
                                                    "createdAt" to "2019-12-27T18:11:19.117Z",
                                                    "createdUserId" to "",
                                                    "dataSensitivity" to "non_sensitive",
                                                    "displayOrder" to 2,
                                                    "externalOptions" to false,
                                                    "formField" to false,
                                                    "hasUniqueValue" to false,
                                                    "hidden" to false,
                                                    "hubspotDefined" to false,
                                                    "modificationMetadata" to
                                                        mapOf(
                                                            "archivable" to true,
                                                            "readOnlyDefinition" to false,
                                                            "readOnlyValue" to false,
                                                            "readOnlyOptions" to false,
                                                        ),
                                                    "referencedObjectType" to "",
                                                    "sensitiveDataCategories" to listOf("string"),
                                                    "showCurrencySymbol" to false,
                                                    "updatedAt" to "2019-12-27T18:11:19.117Z",
                                                    "updatedUserId" to "updatedUserId",
                                                ),
                                            "calculationExpression" to
                                                mapOf(
                                                    "operator" to "CONSTANT_BOOLEAN",
                                                    "inputs" to listOf(mapOf<String, Any>()),
                                                    "propertyName" to "propertyName",
                                                    "value" to true,
                                                ),
                                            "calculationFormula" to "calculationFormula",
                                            "definitionSource" to
                                                mapOf("type" to "GLOBAL", "name" to "name"),
                                            "extensionData" to
                                                mapOf(
                                                    "extensionStatusMap" to
                                                        mapOf("foo" to "string"),
                                                    "tags" to listOf("string"),
                                                    "caseChangeTestExtensionData" to
                                                        mapOf("mood" to "mood"),
                                                    "optionDecoratorsExtensionData" to
                                                        mapOf(
                                                            "optionDecorators" to
                                                                mapOf(
                                                                    "foo" to
                                                                        mapOf("color" to "color")
                                                                ),
                                                            "optionDecoratorStyle" to
                                                                "optionDecoratorStyle",
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
                                                            "includeUnconfirmedUsers" to true,
                                                            "pipelineIds" to listOf("string"),
                                                        ),
                                                    "relatedObjectTypeId" to "relatedObjectTypeId",
                                                ),
                                            "fulcrumPortalId" to 0,
                                            "fulcrumTimestamp" to 0,
                                            "janusGroup" to "janusGroup",
                                            "permission" to mapOf("accessLevel" to "accessLevel"),
                                            "propertyDefinitionSource" to
                                                mapOf("type" to "type", "name" to "name"),
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
                                                    "rollupOperator" to "rollupOperator",
                                                    "sourceObjectTypeId" to "sourceObjectTypeId",
                                                    "sourcePropertyName" to "sourcePropertyName",
                                                    "conditionalExpression" to
                                                        mapOf(
                                                            "operator" to "CONSTANT_BOOLEAN",
                                                            "inputs" to
                                                                listOf(mapOf<String, Any>()),
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
        val integratorSettingCreateObjectDefinitionResponse =
            IntegratorSettingCreateObjectDefinitionResponse.builder()
                .createdObjects(
                    IntegratorSettingCreateObjectDefinitionResponse.CreatedObjects.builder()
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
                                            "metaType" to "HUBSPOT",
                                            "metaTypeId" to 0,
                                            "name" to "name",
                                            "objectTypeId" to "objectTypeId",
                                            "permissioningType" to "permissioningType",
                                            "pipelinePropertyName" to "pipelinePropertyName",
                                            "pipelineStagePropertyName" to
                                                "pipelineStagePropertyName",
                                            "requiredProperties" to listOf("string"),
                                            "restorable" to true,
                                            "scopeMappings" to
                                                listOf(
                                                    mapOf(
                                                        "accessLevel" to "accessLevel",
                                                        "requestAction" to "requestAction",
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
                                            "status" to "status",
                                            "visibility" to "visibility",
                                            "writeScopeName" to "writeScopeName",
                                        ),
                                    "properties" to
                                        listOf(
                                            mapOf(
                                                "objectTypeId" to "objectTypeId",
                                                "property" to
                                                    mapOf(
                                                        "description" to "",
                                                        "fieldType" to "select",
                                                        "groupName" to "my_object_information",
                                                        "label" to "My object property",
                                                        "name" to "my_object_property",
                                                        "options" to
                                                            listOf(
                                                                mapOf(
                                                                    "description" to
                                                                        "Choice number one",
                                                                    "displayOrder" to 1,
                                                                    "doubleData" to 0,
                                                                    "hidden" to false,
                                                                    "label" to "Option A",
                                                                    "readOnly" to false,
                                                                    "value" to "A",
                                                                ),
                                                                mapOf(
                                                                    "description" to
                                                                        "Choice number two",
                                                                    "displayOrder" to 2,
                                                                    "doubleData" to 0,
                                                                    "hidden" to false,
                                                                    "label" to "Option B",
                                                                    "readOnly" to false,
                                                                    "value" to "B",
                                                                ),
                                                            ),
                                                        "type" to "enumeration",
                                                        "archived" to false,
                                                        "archivedAt" to "2019-12-27T18:11:19.117Z",
                                                        "calculated" to false,
                                                        "calculationFormula" to "",
                                                        "createdAt" to "2019-12-27T18:11:19.117Z",
                                                        "createdUserId" to "",
                                                        "dataSensitivity" to "non_sensitive",
                                                        "displayOrder" to 2,
                                                        "externalOptions" to false,
                                                        "formField" to false,
                                                        "hasUniqueValue" to false,
                                                        "hidden" to false,
                                                        "hubspotDefined" to false,
                                                        "modificationMetadata" to
                                                            mapOf(
                                                                "archivable" to true,
                                                                "readOnlyDefinition" to false,
                                                                "readOnlyValue" to false,
                                                                "readOnlyOptions" to false,
                                                            ),
                                                        "referencedObjectType" to "",
                                                        "sensitiveDataCategories" to
                                                            listOf("string"),
                                                        "showCurrencySymbol" to false,
                                                        "updatedAt" to "2019-12-27T18:11:19.117Z",
                                                        "updatedUserId" to "updatedUserId",
                                                    ),
                                                "calculationExpression" to
                                                    mapOf(
                                                        "operator" to "CONSTANT_BOOLEAN",
                                                        "inputs" to listOf(mapOf<String, Any>()),
                                                        "propertyName" to "propertyName",
                                                        "value" to true,
                                                    ),
                                                "calculationFormula" to "calculationFormula",
                                                "definitionSource" to
                                                    mapOf("type" to "GLOBAL", "name" to "name"),
                                                "extensionData" to
                                                    mapOf(
                                                        "extensionStatusMap" to
                                                            mapOf("foo" to "string"),
                                                        "tags" to listOf("string"),
                                                        "caseChangeTestExtensionData" to
                                                            mapOf("mood" to "mood"),
                                                        "optionDecoratorsExtensionData" to
                                                            mapOf(
                                                                "optionDecorators" to
                                                                    mapOf(
                                                                        "foo" to
                                                                            mapOf(
                                                                                "color" to "color"
                                                                            )
                                                                    ),
                                                                "optionDecoratorStyle" to
                                                                    "optionDecoratorStyle",
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
                                                                "includeUnconfirmedUsers" to true,
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
                                                    mapOf("type" to "type", "name" to "name"),
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
                                                        "rollupOperator" to "rollupOperator",
                                                        "sourceObjectTypeId" to
                                                            "sourceObjectTypeId",
                                                        "sourcePropertyName" to
                                                            "sourcePropertyName",
                                                        "conditionalExpression" to
                                                            mapOf(
                                                                "operator" to "CONSTANT_BOOLEAN",
                                                                "inputs" to
                                                                    listOf(mapOf<String, Any>()),
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

        val roundtrippedIntegratorSettingCreateObjectDefinitionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingCreateObjectDefinitionResponse),
                jacksonTypeRef<IntegratorSettingCreateObjectDefinitionResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingCreateObjectDefinitionResponse)
            .isEqualTo(integratorSettingCreateObjectDefinitionResponse)
    }
}
