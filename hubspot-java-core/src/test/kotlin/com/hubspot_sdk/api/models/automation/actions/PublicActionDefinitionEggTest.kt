// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionDefinitionEggTest {

    @Test
    fun create() {
        val publicActionDefinitionEgg =
            PublicActionDefinitionEgg.builder()
                .actionUrl("actionUrl")
                .addFunction(
                    PublicActionFunction.builder()
                        .functionSource("functionSource")
                        .functionType(PublicActionFunction.FunctionType.PRE_ACTION_EXECUTION)
                        .id("id")
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
                                        .description("")
                                        .displayOrder(0)
                                        .doubleData(0.0)
                                        .hidden(false)
                                        .label("")
                                        .readOnly(false)
                                        .value("")
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.STRING)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.CONTACT
                                )
                                .build()
                        )
                        .automationFieldType("automationFieldType")
                        .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                        .build()
                )
                .labels(
                    PublicActionDefinitionEgg.Labels.builder()
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
                .addObjectType("string")
                .published(true)
                .archivedAt(0L)
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
                .objectRequestOptions(
                    PublicObjectRequestOptions.builder().addProperty("string").build()
                )
                .addOutputField(
                    OutputFieldDefinition.builder()
                        .typeDefinition(
                            FieldTypeDefinition.builder()
                                .externalOptions(true)
                                .name("name")
                                .addOption(
                                    Option.builder()
                                        .description("")
                                        .displayOrder(0)
                                        .doubleData(0.0)
                                        .hidden(false)
                                        .label("")
                                        .readOnly(false)
                                        .value("")
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.STRING)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.CONTACT
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(publicActionDefinitionEgg.actionUrl()).isEqualTo("actionUrl")
        assertThat(publicActionDefinitionEgg.functions())
            .containsExactly(
                PublicActionFunction.builder()
                    .functionSource("functionSource")
                    .functionType(PublicActionFunction.FunctionType.PRE_ACTION_EXECUTION)
                    .id("id")
                    .build()
            )
        assertThat(publicActionDefinitionEgg.inputFields())
            .containsExactly(
                InputFieldDefinition.builder()
                    .isRequired(true)
                    .typeDefinition(
                        FieldTypeDefinition.builder()
                            .externalOptions(true)
                            .name("name")
                            .addOption(
                                Option.builder()
                                    .description("")
                                    .displayOrder(0)
                                    .doubleData(0.0)
                                    .hidden(false)
                                    .label("")
                                    .readOnly(false)
                                    .value("")
                                    .build()
                            )
                            .type(FieldTypeDefinition.Type.STRING)
                            .description("description")
                            .externalOptionsReferenceType("externalOptionsReferenceType")
                            .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                            .helpText("helpText")
                            .label("label")
                            .optionsUrl("optionsUrl")
                            .referencedObjectType(FieldTypeDefinition.ReferencedObjectType.CONTACT)
                            .build()
                    )
                    .automationFieldType("automationFieldType")
                    .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                    .build()
            )
        assertThat(publicActionDefinitionEgg.labels())
            .isEqualTo(
                PublicActionDefinitionEgg.Labels.builder()
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
        assertThat(publicActionDefinitionEgg.objectTypes()).containsExactly("string")
        assertThat(publicActionDefinitionEgg.published()).isEqualTo(true)
        assertThat(publicActionDefinitionEgg.archivedAt()).contains(0L)
        assertThat(publicActionDefinitionEgg.executionRules().getOrNull())
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
        assertThat(publicActionDefinitionEgg.inputFieldDependencies().getOrNull())
            .containsExactly(
                PublicActionDefinitionEgg.InputFieldDependency.ofPublicSingle(
                    PublicSingleFieldDependency.builder()
                        .controllingFieldName("controllingFieldName")
                        .dependencyType(PublicSingleFieldDependency.DependencyType.SINGLE_FIELD)
                        .addDependentFieldName("string")
                        .build()
                )
            )
        assertThat(publicActionDefinitionEgg.objectRequestOptions())
            .contains(PublicObjectRequestOptions.builder().addProperty("string").build())
        assertThat(publicActionDefinitionEgg.outputFields().getOrNull())
            .containsExactly(
                OutputFieldDefinition.builder()
                    .typeDefinition(
                        FieldTypeDefinition.builder()
                            .externalOptions(true)
                            .name("name")
                            .addOption(
                                Option.builder()
                                    .description("")
                                    .displayOrder(0)
                                    .doubleData(0.0)
                                    .hidden(false)
                                    .label("")
                                    .readOnly(false)
                                    .value("")
                                    .build()
                            )
                            .type(FieldTypeDefinition.Type.STRING)
                            .description("description")
                            .externalOptionsReferenceType("externalOptionsReferenceType")
                            .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                            .helpText("helpText")
                            .label("label")
                            .optionsUrl("optionsUrl")
                            .referencedObjectType(FieldTypeDefinition.ReferencedObjectType.CONTACT)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionDefinitionEgg =
            PublicActionDefinitionEgg.builder()
                .actionUrl("actionUrl")
                .addFunction(
                    PublicActionFunction.builder()
                        .functionSource("functionSource")
                        .functionType(PublicActionFunction.FunctionType.PRE_ACTION_EXECUTION)
                        .id("id")
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
                                        .description("")
                                        .displayOrder(0)
                                        .doubleData(0.0)
                                        .hidden(false)
                                        .label("")
                                        .readOnly(false)
                                        .value("")
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.STRING)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.CONTACT
                                )
                                .build()
                        )
                        .automationFieldType("automationFieldType")
                        .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                        .build()
                )
                .labels(
                    PublicActionDefinitionEgg.Labels.builder()
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
                .addObjectType("string")
                .published(true)
                .archivedAt(0L)
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
                .objectRequestOptions(
                    PublicObjectRequestOptions.builder().addProperty("string").build()
                )
                .addOutputField(
                    OutputFieldDefinition.builder()
                        .typeDefinition(
                            FieldTypeDefinition.builder()
                                .externalOptions(true)
                                .name("name")
                                .addOption(
                                    Option.builder()
                                        .description("")
                                        .displayOrder(0)
                                        .doubleData(0.0)
                                        .hidden(false)
                                        .label("")
                                        .readOnly(false)
                                        .value("")
                                        .build()
                                )
                                .type(FieldTypeDefinition.Type.STRING)
                                .description("description")
                                .externalOptionsReferenceType("externalOptionsReferenceType")
                                .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                .helpText("helpText")
                                .label("label")
                                .optionsUrl("optionsUrl")
                                .referencedObjectType(
                                    FieldTypeDefinition.ReferencedObjectType.CONTACT
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPublicActionDefinitionEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionDefinitionEgg),
                jacksonTypeRef<PublicActionDefinitionEgg>(),
            )

        assertThat(roundtrippedPublicActionDefinitionEgg).isEqualTo(publicActionDefinitionEgg)
    }
}
