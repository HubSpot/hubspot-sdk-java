// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions.definitions

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.AutomationActionsOption
import com.hubspot.sdk.models.automation.actions.FieldTypeDefinition
import com.hubspot.sdk.models.automation.actions.IntegerFieldSchema
import com.hubspot.sdk.models.automation.actions.OutputFieldDefinition
import com.hubspot.sdk.models.automation.actions.PublicActionDefinitionEgg
import com.hubspot.sdk.models.automation.actions.PublicActionFunction
import com.hubspot.sdk.models.automation.actions.PublicExecutionTranslationRule
import com.hubspot.sdk.models.automation.actions.PublicFieldTypeDefinition
import com.hubspot.sdk.models.automation.actions.PublicInputFieldDefinition
import com.hubspot.sdk.models.automation.actions.PublicObjectRequestOptions
import com.hubspot.sdk.models.automation.actions.PublicOption
import com.hubspot.sdk.models.automation.actions.PublicSingleFieldDependency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionCreateParamsTest {

    @Test
    fun create() {
        DefinitionCreateParams.builder()
            .appId(0)
            .publicActionDefinitionEgg(
                PublicActionDefinitionEgg.builder()
                    .actionUrl("actionUrl")
                    .addFunction(
                        PublicActionFunction.builder()
                            .functionSource("functionSource")
                            .functionType(PublicActionFunction.FunctionType.POST_ACTION_EXECUTION)
                            .id("id")
                            .build()
                    )
                    .addInputField(
                        PublicInputFieldDefinition.builder()
                            .isRequired(true)
                            .typeDefinition(
                                PublicFieldTypeDefinition.builder()
                                    .name("name")
                                    .addOption(
                                        PublicOption.builder()
                                            .label("label")
                                            .value("value")
                                            .description("description")
                                            .displayOrder(0)
                                            .build()
                                    )
                                    .type(PublicFieldTypeDefinition.Type.BOOL)
                                    .description("description")
                                    .fieldType(PublicFieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                    .helpText("helpText")
                                    .label("label")
                                    .optionsUrl("optionsUrl")
                                    .referencedObjectType(
                                        PublicFieldTypeDefinition.ReferencedObjectType.OWNER
                                    )
                                    .build()
                            )
                            .addSupportedValueType(
                                PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE
                            )
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
                                        AutomationActionsOption.builder()
                                            .description("description")
                                            .displayOrder(0)
                                            .doubleData(0.0)
                                            .hidden(true)
                                            .label("label")
                                            .readOnly(true)
                                            .value("value")
                                            .build()
                                    )
                                    .schema(
                                        IntegerFieldSchema.builder()
                                            .type(IntegerFieldSchema.Type.INTEGER)
                                            .maximum(0)
                                            .minimum(0)
                                            .build()
                                    )
                                    .type(FieldTypeDefinition.Type.BOOL)
                                    .useChirp(true)
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
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionCreateParams.builder()
                .appId(0)
                .publicActionDefinitionEgg(
                    PublicActionDefinitionEgg.builder()
                        .actionUrl("actionUrl")
                        .addFunction(
                            PublicActionFunction.builder()
                                .functionSource("functionSource")
                                .functionType(
                                    PublicActionFunction.FunctionType.POST_ACTION_EXECUTION
                                )
                                .build()
                        )
                        .addInputField(
                            PublicInputFieldDefinition.builder()
                                .isRequired(true)
                                .typeDefinition(
                                    PublicFieldTypeDefinition.builder()
                                        .name("name")
                                        .addOption(
                                            PublicOption.builder()
                                                .label("label")
                                                .value("value")
                                                .build()
                                        )
                                        .type(PublicFieldTypeDefinition.Type.BOOL)
                                        .build()
                                )
                                .build()
                        )
                        .labels(
                            PublicActionDefinitionEgg.Labels.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("actionName" to "actionName")),
                                )
                                .build()
                        )
                        .addObjectType("string")
                        .published(true)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DefinitionCreateParams.builder()
                .appId(0)
                .publicActionDefinitionEgg(
                    PublicActionDefinitionEgg.builder()
                        .actionUrl("actionUrl")
                        .addFunction(
                            PublicActionFunction.builder()
                                .functionSource("functionSource")
                                .functionType(
                                    PublicActionFunction.FunctionType.POST_ACTION_EXECUTION
                                )
                                .id("id")
                                .build()
                        )
                        .addInputField(
                            PublicInputFieldDefinition.builder()
                                .isRequired(true)
                                .typeDefinition(
                                    PublicFieldTypeDefinition.builder()
                                        .name("name")
                                        .addOption(
                                            PublicOption.builder()
                                                .label("label")
                                                .value("value")
                                                .description("description")
                                                .displayOrder(0)
                                                .build()
                                        )
                                        .type(PublicFieldTypeDefinition.Type.BOOL)
                                        .description("description")
                                        .fieldType(
                                            PublicFieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                        )
                                        .helpText("helpText")
                                        .label("label")
                                        .optionsUrl("optionsUrl")
                                        .referencedObjectType(
                                            PublicFieldTypeDefinition.ReferencedObjectType.OWNER
                                        )
                                        .build()
                                )
                                .addSupportedValueType(
                                    PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE
                                )
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
                                            AutomationActionsOption.builder()
                                                .description("description")
                                                .displayOrder(0)
                                                .doubleData(0.0)
                                                .hidden(true)
                                                .label("label")
                                                .readOnly(true)
                                                .value("value")
                                                .build()
                                        )
                                        .schema(
                                            IntegerFieldSchema.builder()
                                                .type(IntegerFieldSchema.Type.INTEGER)
                                                .maximum(0)
                                                .minimum(0)
                                                .build()
                                        )
                                        .type(FieldTypeDefinition.Type.BOOL)
                                        .useChirp(true)
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicActionDefinitionEgg.builder()
                    .actionUrl("actionUrl")
                    .addFunction(
                        PublicActionFunction.builder()
                            .functionSource("functionSource")
                            .functionType(PublicActionFunction.FunctionType.POST_ACTION_EXECUTION)
                            .id("id")
                            .build()
                    )
                    .addInputField(
                        PublicInputFieldDefinition.builder()
                            .isRequired(true)
                            .typeDefinition(
                                PublicFieldTypeDefinition.builder()
                                    .name("name")
                                    .addOption(
                                        PublicOption.builder()
                                            .label("label")
                                            .value("value")
                                            .description("description")
                                            .displayOrder(0)
                                            .build()
                                    )
                                    .type(PublicFieldTypeDefinition.Type.BOOL)
                                    .description("description")
                                    .fieldType(PublicFieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                                    .helpText("helpText")
                                    .label("label")
                                    .optionsUrl("optionsUrl")
                                    .referencedObjectType(
                                        PublicFieldTypeDefinition.ReferencedObjectType.OWNER
                                    )
                                    .build()
                            )
                            .addSupportedValueType(
                                PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE
                            )
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
                                        AutomationActionsOption.builder()
                                            .description("description")
                                            .displayOrder(0)
                                            .doubleData(0.0)
                                            .hidden(true)
                                            .label("label")
                                            .readOnly(true)
                                            .value("value")
                                            .build()
                                    )
                                    .schema(
                                        IntegerFieldSchema.builder()
                                            .type(IntegerFieldSchema.Type.INTEGER)
                                            .maximum(0)
                                            .minimum(0)
                                            .build()
                                    )
                                    .type(FieldTypeDefinition.Type.BOOL)
                                    .useChirp(true)
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
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DefinitionCreateParams.builder()
                .appId(0)
                .publicActionDefinitionEgg(
                    PublicActionDefinitionEgg.builder()
                        .actionUrl("actionUrl")
                        .addFunction(
                            PublicActionFunction.builder()
                                .functionSource("functionSource")
                                .functionType(
                                    PublicActionFunction.FunctionType.POST_ACTION_EXECUTION
                                )
                                .build()
                        )
                        .addInputField(
                            PublicInputFieldDefinition.builder()
                                .isRequired(true)
                                .typeDefinition(
                                    PublicFieldTypeDefinition.builder()
                                        .name("name")
                                        .addOption(
                                            PublicOption.builder()
                                                .label("label")
                                                .value("value")
                                                .build()
                                        )
                                        .type(PublicFieldTypeDefinition.Type.BOOL)
                                        .build()
                                )
                                .build()
                        )
                        .labels(
                            PublicActionDefinitionEgg.Labels.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("actionName" to "actionName")),
                                )
                                .build()
                        )
                        .addObjectType("string")
                        .published(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicActionDefinitionEgg.builder()
                    .actionUrl("actionUrl")
                    .addFunction(
                        PublicActionFunction.builder()
                            .functionSource("functionSource")
                            .functionType(PublicActionFunction.FunctionType.POST_ACTION_EXECUTION)
                            .build()
                    )
                    .addInputField(
                        PublicInputFieldDefinition.builder()
                            .isRequired(true)
                            .typeDefinition(
                                PublicFieldTypeDefinition.builder()
                                    .name("name")
                                    .addOption(
                                        PublicOption.builder().label("label").value("value").build()
                                    )
                                    .type(PublicFieldTypeDefinition.Type.BOOL)
                                    .build()
                            )
                            .build()
                    )
                    .labels(
                        PublicActionDefinitionEgg.Labels.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("actionName" to "actionName")),
                            )
                            .build()
                    )
                    .addObjectType("string")
                    .published(true)
                    .build()
            )
    }
}
