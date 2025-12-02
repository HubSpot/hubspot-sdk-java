// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.PropertyModificationMetadata
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyDefinitionTest {

    @Test
    fun create() {
        val propertyDefinition =
            PropertyDefinition.builder()
                .objectTypeId("objectTypeId")
                .property(
                    Property.builder()
                        .description("description")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option B")
                                .value("B")
                                .description("Choice number two")
                                .displayOrder(2)
                                .build()
                        )
                        .type("enumeration")
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(true)
                        .calculationFormula("calculationFormula")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("createdUserId")
                        .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                        .displayOrder(2)
                        .externalOptions(true)
                        .formField(true)
                        .hasUniqueValue(false)
                        .hidden(true)
                        .hubspotDefined(true)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(false)
                                .readOnlyValue(false)
                                .readOnlyOptions(false)
                                .build()
                        )
                        .referencedObjectType("referencedObjectType")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .calculationExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .addInput(JsonValue.from(mapOf<String, Any>()))
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .calculationFormula("calculationFormula")
                .definitionSource(
                    PropertyDefinitionSource.builder()
                        .type(PropertyDefinitionSource.Type.GLOBAL)
                        .name("name")
                        .build()
                )
                .extensionData(
                    ExtensionData.builder()
                        .extensionStatusMap(
                            ExtensionData.ExtensionStatusMap.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTag("string")
                        .caseChangeTestExtensionData(
                            CaseChangeTestExtensionData.builder().mood("mood").build()
                        )
                        .optionDecoratorsExtensionData(
                            OptionDecoratorsExtensionData.builder()
                                .optionDecorators(
                                    OptionDecoratorsExtensionData.OptionDecorators.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("color" to "color")),
                                        )
                                        .build()
                                )
                                .optionDecoratorStyle("optionDecoratorStyle")
                                .build()
                        )
                        .requiredPropertiesExtensionData(
                            RequiredPropertiesExtensionData.builder()
                                .isRequiredProperty(true)
                                .build()
                        )
                        .softRequiredPropertiesExtensionData(
                            SoftRequiredPropertiesExtensionData.builder()
                                .isSoftRequiredProperty(true)
                                .build()
                        )
                        .build()
                )
                .externalOptionsMetaData(
                    ExternalOptionsMetaData.builder()
                        .filter(
                            FilteringMetaData.builder()
                                .includeUnconfirmedUsers(true)
                                .addPipelineId("string")
                                .build()
                        )
                        .relatedObjectTypeId("relatedObjectTypeId")
                        .build()
                )
                .fulcrumPortalId(0)
                .fulcrumTimestamp(0L)
                .janusGroup("janusGroup")
                .permission(FieldLevelPermission.builder().accessLevel("accessLevel").build())
                .propertyDefinitionSource(
                    DefinitionSource.builder().type("type").name("name").build()
                )
                .propertyRequirements(
                    DefaultRequirements.builder()
                        .addGate("string")
                        .operator(DefaultRequirements.Operator.AND)
                        .addScopeName("string")
                        .addSetting("string")
                        .build()
                )
                .rollupExpression(
                    RollupExpression.builder()
                        .addAssociationType(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .rollupOperator("rollupOperator")
                        .sourceObjectTypeId("sourceObjectTypeId")
                        .sourcePropertyName("sourcePropertyName")
                        .conditionalExpression(
                            ConstantNumber.builder()
                                .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                                .addInput(JsonValue.from(mapOf<String, Any>()))
                                .propertyName("propertyName")
                                .value(0.0)
                                .build()
                        )
                        .conditionalFormula("conditionalFormula")
                        .emptyRollupValue("emptyRollupValue")
                        .sourceCompareByPropertyName("sourceCompareByPropertyName")
                        .build()
                )
                .build()

        assertThat(propertyDefinition.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(propertyDefinition.property())
            .isEqualTo(
                Property.builder()
                    .description("description")
                    .fieldType("select")
                    .groupName("my_object_information")
                    .label("My object property")
                    .name("my_object_property")
                    .addOption(
                        Option.builder()
                            .hidden(false)
                            .label("Option A")
                            .value("A")
                            .description("Choice number one")
                            .displayOrder(1)
                            .build()
                    )
                    .addOption(
                        Option.builder()
                            .hidden(false)
                            .label("Option B")
                            .value("B")
                            .description("Choice number two")
                            .displayOrder(2)
                            .build()
                    )
                    .type("enumeration")
                    .archived(true)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .calculated(true)
                    .calculationFormula("calculationFormula")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdUserId("createdUserId")
                    .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                    .displayOrder(2)
                    .externalOptions(true)
                    .formField(true)
                    .hasUniqueValue(false)
                    .hidden(true)
                    .hubspotDefined(true)
                    .modificationMetadata(
                        PropertyModificationMetadata.builder()
                            .archivable(true)
                            .readOnlyDefinition(false)
                            .readOnlyValue(false)
                            .readOnlyOptions(false)
                            .build()
                    )
                    .referencedObjectType("referencedObjectType")
                    .addSensitiveDataCategory("string")
                    .showCurrencySymbol(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedUserId("updatedUserId")
                    .build()
            )
        assertThat(propertyDefinition.calculationExpression())
            .contains(
                PropertyDefinition.CalculationExpression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .addInput(JsonValue.from(mapOf<String, Any>()))
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(propertyDefinition.calculationFormula()).contains("calculationFormula")
        assertThat(propertyDefinition.definitionSource())
            .contains(
                PropertyDefinitionSource.builder()
                    .type(PropertyDefinitionSource.Type.GLOBAL)
                    .name("name")
                    .build()
            )
        assertThat(propertyDefinition.extensionData())
            .contains(
                ExtensionData.builder()
                    .extensionStatusMap(
                        ExtensionData.ExtensionStatusMap.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTag("string")
                    .caseChangeTestExtensionData(
                        CaseChangeTestExtensionData.builder().mood("mood").build()
                    )
                    .optionDecoratorsExtensionData(
                        OptionDecoratorsExtensionData.builder()
                            .optionDecorators(
                                OptionDecoratorsExtensionData.OptionDecorators.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("color" to "color")),
                                    )
                                    .build()
                            )
                            .optionDecoratorStyle("optionDecoratorStyle")
                            .build()
                    )
                    .requiredPropertiesExtensionData(
                        RequiredPropertiesExtensionData.builder().isRequiredProperty(true).build()
                    )
                    .softRequiredPropertiesExtensionData(
                        SoftRequiredPropertiesExtensionData.builder()
                            .isSoftRequiredProperty(true)
                            .build()
                    )
                    .build()
            )
        assertThat(propertyDefinition.externalOptionsMetaData())
            .contains(
                ExternalOptionsMetaData.builder()
                    .filter(
                        FilteringMetaData.builder()
                            .includeUnconfirmedUsers(true)
                            .addPipelineId("string")
                            .build()
                    )
                    .relatedObjectTypeId("relatedObjectTypeId")
                    .build()
            )
        assertThat(propertyDefinition.fulcrumPortalId()).contains(0)
        assertThat(propertyDefinition.fulcrumTimestamp()).contains(0L)
        assertThat(propertyDefinition.janusGroup()).contains("janusGroup")
        assertThat(propertyDefinition.permission())
            .contains(FieldLevelPermission.builder().accessLevel("accessLevel").build())
        assertThat(propertyDefinition.propertyDefinitionSource())
            .contains(DefinitionSource.builder().type("type").name("name").build())
        assertThat(propertyDefinition.propertyRequirements())
            .contains(
                DefaultRequirements.builder()
                    .addGate("string")
                    .operator(DefaultRequirements.Operator.AND)
                    .addScopeName("string")
                    .addSetting("string")
                    .build()
            )
        assertThat(propertyDefinition.rollupExpression())
            .contains(
                RollupExpression.builder()
                    .addAssociationType(
                        AssociationSpec.builder()
                            .associationCategory(
                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .rollupOperator("rollupOperator")
                    .sourceObjectTypeId("sourceObjectTypeId")
                    .sourcePropertyName("sourcePropertyName")
                    .conditionalExpression(
                        ConstantNumber.builder()
                            .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .propertyName("propertyName")
                            .value(0.0)
                            .build()
                    )
                    .conditionalFormula("conditionalFormula")
                    .emptyRollupValue("emptyRollupValue")
                    .sourceCompareByPropertyName("sourceCompareByPropertyName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyDefinition =
            PropertyDefinition.builder()
                .objectTypeId("objectTypeId")
                .property(
                    Property.builder()
                        .description("description")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option B")
                                .value("B")
                                .description("Choice number two")
                                .displayOrder(2)
                                .build()
                        )
                        .type("enumeration")
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(true)
                        .calculationFormula("calculationFormula")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("createdUserId")
                        .dataSensitivity(Property.DataSensitivity.HIGHLY_SENSITIVE)
                        .displayOrder(2)
                        .externalOptions(true)
                        .formField(true)
                        .hasUniqueValue(false)
                        .hidden(true)
                        .hubspotDefined(true)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(false)
                                .readOnlyValue(false)
                                .readOnlyOptions(false)
                                .build()
                        )
                        .referencedObjectType("referencedObjectType")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .calculationExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .addInput(JsonValue.from(mapOf<String, Any>()))
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .calculationFormula("calculationFormula")
                .definitionSource(
                    PropertyDefinitionSource.builder()
                        .type(PropertyDefinitionSource.Type.GLOBAL)
                        .name("name")
                        .build()
                )
                .extensionData(
                    ExtensionData.builder()
                        .extensionStatusMap(
                            ExtensionData.ExtensionStatusMap.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addTag("string")
                        .caseChangeTestExtensionData(
                            CaseChangeTestExtensionData.builder().mood("mood").build()
                        )
                        .optionDecoratorsExtensionData(
                            OptionDecoratorsExtensionData.builder()
                                .optionDecorators(
                                    OptionDecoratorsExtensionData.OptionDecorators.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("color" to "color")),
                                        )
                                        .build()
                                )
                                .optionDecoratorStyle("optionDecoratorStyle")
                                .build()
                        )
                        .requiredPropertiesExtensionData(
                            RequiredPropertiesExtensionData.builder()
                                .isRequiredProperty(true)
                                .build()
                        )
                        .softRequiredPropertiesExtensionData(
                            SoftRequiredPropertiesExtensionData.builder()
                                .isSoftRequiredProperty(true)
                                .build()
                        )
                        .build()
                )
                .externalOptionsMetaData(
                    ExternalOptionsMetaData.builder()
                        .filter(
                            FilteringMetaData.builder()
                                .includeUnconfirmedUsers(true)
                                .addPipelineId("string")
                                .build()
                        )
                        .relatedObjectTypeId("relatedObjectTypeId")
                        .build()
                )
                .fulcrumPortalId(0)
                .fulcrumTimestamp(0L)
                .janusGroup("janusGroup")
                .permission(FieldLevelPermission.builder().accessLevel("accessLevel").build())
                .propertyDefinitionSource(
                    DefinitionSource.builder().type("type").name("name").build()
                )
                .propertyRequirements(
                    DefaultRequirements.builder()
                        .addGate("string")
                        .operator(DefaultRequirements.Operator.AND)
                        .addScopeName("string")
                        .addSetting("string")
                        .build()
                )
                .rollupExpression(
                    RollupExpression.builder()
                        .addAssociationType(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .rollupOperator("rollupOperator")
                        .sourceObjectTypeId("sourceObjectTypeId")
                        .sourcePropertyName("sourcePropertyName")
                        .conditionalExpression(
                            ConstantNumber.builder()
                                .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                                .addInput(JsonValue.from(mapOf<String, Any>()))
                                .propertyName("propertyName")
                                .value(0.0)
                                .build()
                        )
                        .conditionalFormula("conditionalFormula")
                        .emptyRollupValue("emptyRollupValue")
                        .sourceCompareByPropertyName("sourceCompareByPropertyName")
                        .build()
                )
                .build()

        val roundtrippedPropertyDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyDefinition),
                jacksonTypeRef<PropertyDefinition>(),
            )

        assertThat(roundtrippedPropertyDefinition).isEqualTo(propertyDefinition)
    }
}
