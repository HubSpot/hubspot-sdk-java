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
                                        .hidden(true)
                                        .label("label")
                                        .value("value")
                                        .description("description")
                                        .displayOrder(0)
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
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .displayOrder(0)
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
                                        .hidden(true)
                                        .label("label")
                                        .value("value")
                                        .description("description")
                                        .displayOrder(0)
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
