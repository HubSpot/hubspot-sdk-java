// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.definitions

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.automation.actions.FieldTypeDefinition
import com.hubspot_sdk.api.models.automation.actions.InputFieldDefinition
import com.hubspot_sdk.api.models.automation.actions.OutputFieldDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionPatch
import com.hubspot_sdk.api.models.automation.actions.PublicExecutionTranslationRule
import com.hubspot_sdk.api.models.automation.actions.PublicObjectRequestOptions
import com.hubspot_sdk.api.models.automation.actions.PublicSingleFieldDependency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionUpdateParamsTest {

    @Test
    fun create() {
        DefinitionUpdateParams.builder()
            .appId(0)
            .definitionId("definitionId")
            .publicActionDefinitionPatch(
                PublicActionDefinitionPatch.builder()
                    .actionUrl("actionUrl")
                    .addExecutionRule(
                        PublicExecutionTranslationRule.builder()
                            .conditions(
                                PublicExecutionTranslationRule.Conditions.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
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
                            .addSupportedValueType(
                                InputFieldDefinition.SupportedValueType.STATIC_VALUE
                            )
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionUpdateParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .publicActionDefinitionPatch(PublicActionDefinitionPatch.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DefinitionUpdateParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .publicActionDefinitionPatch(
                    PublicActionDefinitionPatch.builder()
                        .actionUrl("actionUrl")
                        .addExecutionRule(
                            PublicExecutionTranslationRule.builder()
                                .conditions(
                                    PublicExecutionTranslationRule.Conditions.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .labelName("labelName")
                                .build()
                        )
                        .addInputFieldDependency(
                            PublicSingleFieldDependency.builder()
                                .controllingFieldName("controllingFieldName")
                                .dependencyType(
                                    PublicSingleFieldDependency.DependencyType.SINGLE_FIELD
                                )
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
                                        .externalOptionsReferenceType(
                                            "externalOptionsReferenceType"
                                        )
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
                                .addSupportedValueType(
                                    InputFieldDefinition.SupportedValueType.STATIC_VALUE
                                )
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
                                        .externalOptionsReferenceType(
                                            "externalOptionsReferenceType"
                                        )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicActionDefinitionPatch.builder()
                    .actionUrl("actionUrl")
                    .addExecutionRule(
                        PublicExecutionTranslationRule.builder()
                            .conditions(
                                PublicExecutionTranslationRule.Conditions.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
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
                            .addSupportedValueType(
                                InputFieldDefinition.SupportedValueType.STATIC_VALUE
                            )
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DefinitionUpdateParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .publicActionDefinitionPatch(PublicActionDefinitionPatch.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PublicActionDefinitionPatch.builder().build())
    }
}
