// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionDefinitionPatchTest {

    @Test
    fun create() {
        val publicActionDefinitionPatch =
            PublicActionDefinitionPatch.builder()
                .actionUrl("actionUrl")
                .addExecutionRule(
                    PublicExecutionTranslationRule.builder()
                        .conditions(
                            PublicExecutionTranslationRule.Conditions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .labelName("labelName")
                        .build()
                )
                .addInputFieldDependency(
                    PublicSingleFieldDependency.builder()
                        .controllingFieldName("controllingFieldName")
                        .dependencyType(PublicSingleFieldDependency.DependencyType.SINGLE_FIELD)
                        .addDependentFieldName("string")
                        .build()
                )
                .addInputField(
                    InputFieldDefinition.builder()
                        .isRequired(true)
                        .typeDefinition(
                            FieldTypeDefinition.builder()
                                .externalOptions(true)
                                .name("name")
                                .addOption(
                                    Option.builder()
                                        .hidden(false)
                                        .label("Option A")
                                        .value("A")
                                        .description("Choice number one")
                                        .displayOrder(1)
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.BOOL)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART
                                )
                                .build()
                        )
                        .automationFieldType("automationFieldType")
                        .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                        .build()
                )
                .labels(
                    PublicActionDefinitionPatch.Labels.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "actionName" to "actionName",
                                    "actionCardContent" to "actionCardContent",
                                    "actionDescription" to "actionDescription",
                                    "appDisplayName" to "appDisplayName",
                                    "executionRules" to mapOf("foo" to "string"),
                                    "inputFieldDescriptions" to mapOf("foo" to "string"),
                                    "inputFieldLabels" to mapOf("foo" to "string"),
                                    "inputFieldOptionLabels" to
                                        mapOf("foo" to mapOf("foo" to "string")),
                                    "outputFieldLabels" to mapOf("foo" to "string"),
                                )
                            ),
                        )
                        .build()
                )
                .objectRequestOptions(
                    PublicObjectRequestOptions.builder().addProperty("string").build()
                )
                .addObjectType("string")
                .addOutputField(
                    OutputFieldDefinition.builder()
                        .typeDefinition(
                            FieldTypeDefinition.builder()
                                .externalOptions(true)
                                .name("name")
                                .addOption(
                                    Option.builder()
                                        .hidden(false)
                                        .label("Option A")
                                        .value("A")
                                        .description("Choice number one")
                                        .displayOrder(1)
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.BOOL)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART
                                )
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        assertThat(publicActionDefinitionPatch.actionUrl()).contains("actionUrl")
        assertThat(publicActionDefinitionPatch.executionRules().getOrNull())
            .containsExactly(
                PublicExecutionTranslationRule.builder()
                    .conditions(
                        PublicExecutionTranslationRule.Conditions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .labelName("labelName")
                    .build()
            )
        assertThat(publicActionDefinitionPatch.inputFieldDependencies().getOrNull())
            .containsExactly(
                PublicActionDefinitionPatch.InputFieldDependency.ofPublicSingle(
                    PublicSingleFieldDependency.builder()
                        .controllingFieldName("controllingFieldName")
                        .dependencyType(PublicSingleFieldDependency.DependencyType.SINGLE_FIELD)
                        .addDependentFieldName("string")
                        .build()
                )
            )
        assertThat(publicActionDefinitionPatch.inputFields().getOrNull())
            .containsExactly(
                InputFieldDefinition.builder()
                    .isRequired(true)
                    .typeDefinition(
                        FieldTypeDefinition.builder()
                            .externalOptions(true)
                            .name("name")
                            .addOption(
                                Option.builder()
                                    .hidden(false)
                                    .label("Option A")
                                    .value("A")
                                    .description("Choice number one")
                                    .displayOrder(1)
                                    .build()
                            )
                            .type(FieldTypeDefinition.Type.BOOL)
                            .description("description")
                            .externalOptionsReferenceType("externalOptionsReferenceType")
                            .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                            .helpText("helpText")
                            .label("label")
                            .optionsUrl("optionsUrl")
                            .referencedObjectType(
                                FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART
                            )
                            .build()
                    )
                    .automationFieldType("automationFieldType")
                    .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                    .build()
            )
        assertThat(publicActionDefinitionPatch.labels())
            .contains(
                PublicActionDefinitionPatch.Labels.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "actionName" to "actionName",
                                "actionCardContent" to "actionCardContent",
                                "actionDescription" to "actionDescription",
                                "appDisplayName" to "appDisplayName",
                                "executionRules" to mapOf("foo" to "string"),
                                "inputFieldDescriptions" to mapOf("foo" to "string"),
                                "inputFieldLabels" to mapOf("foo" to "string"),
                                "inputFieldOptionLabels" to
                                    mapOf("foo" to mapOf("foo" to "string")),
                                "outputFieldLabels" to mapOf("foo" to "string"),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(publicActionDefinitionPatch.objectRequestOptions())
            .contains(PublicObjectRequestOptions.builder().addProperty("string").build())
        assertThat(publicActionDefinitionPatch.objectTypes().getOrNull()).containsExactly("string")
        assertThat(publicActionDefinitionPatch.outputFields().getOrNull())
            .containsExactly(
                OutputFieldDefinition.builder()
                    .typeDefinition(
                        FieldTypeDefinition.builder()
                            .externalOptions(true)
                            .name("name")
                            .addOption(
                                Option.builder()
                                    .hidden(false)
                                    .label("Option A")
                                    .value("A")
                                    .description("Choice number one")
                                    .displayOrder(1)
                                    .build()
                            )
                            .type(FieldTypeDefinition.Type.BOOL)
                            .description("description")
                            .externalOptionsReferenceType("externalOptionsReferenceType")
                            .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                            .helpText("helpText")
                            .label("label")
                            .optionsUrl("optionsUrl")
                            .referencedObjectType(
                                FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(publicActionDefinitionPatch.published()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionDefinitionPatch =
            PublicActionDefinitionPatch.builder()
                .actionUrl("actionUrl")
                .addExecutionRule(
                    PublicExecutionTranslationRule.builder()
                        .conditions(
                            PublicExecutionTranslationRule.Conditions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .labelName("labelName")
                        .build()
                )
                .addInputFieldDependency(
                    PublicSingleFieldDependency.builder()
                        .controllingFieldName("controllingFieldName")
                        .dependencyType(PublicSingleFieldDependency.DependencyType.SINGLE_FIELD)
                        .addDependentFieldName("string")
                        .build()
                )
                .addInputField(
                    InputFieldDefinition.builder()
                        .isRequired(true)
                        .typeDefinition(
                            FieldTypeDefinition.builder()
                                .externalOptions(true)
                                .name("name")
                                .addOption(
                                    Option.builder()
                                        .hidden(false)
                                        .label("Option A")
                                        .value("A")
                                        .description("Choice number one")
                                        .displayOrder(1)
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.BOOL)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART
                                )
                                .build()
                        )
                        .automationFieldType("automationFieldType")
                        .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                        .build()
                )
                .labels(
                    PublicActionDefinitionPatch.Labels.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "actionName" to "actionName",
                                    "actionCardContent" to "actionCardContent",
                                    "actionDescription" to "actionDescription",
                                    "appDisplayName" to "appDisplayName",
                                    "executionRules" to mapOf("foo" to "string"),
                                    "inputFieldDescriptions" to mapOf("foo" to "string"),
                                    "inputFieldLabels" to mapOf("foo" to "string"),
                                    "inputFieldOptionLabels" to
                                        mapOf("foo" to mapOf("foo" to "string")),
                                    "outputFieldLabels" to mapOf("foo" to "string"),
                                )
                            ),
                        )
                        .build()
                )
                .objectRequestOptions(
                    PublicObjectRequestOptions.builder().addProperty("string").build()
                )
                .addObjectType("string")
                .addOutputField(
                    OutputFieldDefinition.builder()
                        .typeDefinition(
                            FieldTypeDefinition.builder()
                                .externalOptions(true)
                                .name("name")
                                .addOption(
                                    Option.builder()
                                        .hidden(false)
                                        .label("Option A")
                                        .value("A")
                                        .description("Choice number one")
                                        .displayOrder(1)
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.BOOL)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART
                                )
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        val roundtrippedPublicActionDefinitionPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionDefinitionPatch),
                jacksonTypeRef<PublicActionDefinitionPatch>(),
            )

        assertThat(roundtrippedPublicActionDefinitionPatch).isEqualTo(publicActionDefinitionPatch)
    }
}
