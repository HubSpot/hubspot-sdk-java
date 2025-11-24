// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionRevisionTest {

    @Test
    fun create() {
        val publicActionRevision =
            PublicActionRevision.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .definition(
                    PublicActionDefinition.builder()
                        .id("id")
                        .actionUrl("actionUrl")
                        .addFunction(
                            PublicActionFunctionIdentifier.builder()
                                .functionType(
                                    PublicActionFunctionIdentifier.FunctionType
                                        .POST_ACTION_EXECUTION
                                )
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
                            PublicActionDefinition.Labels.builder()
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
                        .revisionId("revisionId")
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
                        .build()
                )
                .revisionId("revisionId")
                .build()

        assertThat(publicActionRevision.id()).isEqualTo("id")
        assertThat(publicActionRevision.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicActionRevision.definition())
            .isEqualTo(
                PublicActionDefinition.builder()
                    .id("id")
                    .actionUrl("actionUrl")
                    .addFunction(
                        PublicActionFunctionIdentifier.builder()
                            .functionType(
                                PublicActionFunctionIdentifier.FunctionType.POST_ACTION_EXECUTION
                            )
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
                        PublicActionDefinition.Labels.builder()
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
                    .revisionId("revisionId")
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
                    .build()
            )
        assertThat(publicActionRevision.revisionId()).isEqualTo("revisionId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionRevision =
            PublicActionRevision.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .definition(
                    PublicActionDefinition.builder()
                        .id("id")
                        .actionUrl("actionUrl")
                        .addFunction(
                            PublicActionFunctionIdentifier.builder()
                                .functionType(
                                    PublicActionFunctionIdentifier.FunctionType
                                        .POST_ACTION_EXECUTION
                                )
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
                            PublicActionDefinition.Labels.builder()
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
                        .revisionId("revisionId")
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
                        .build()
                )
                .revisionId("revisionId")
                .build()

        val roundtrippedPublicActionRevision =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionRevision),
                jacksonTypeRef<PublicActionRevision>(),
            )

        assertThat(roundtrippedPublicActionRevision).isEqualTo(publicActionRevision)
    }
}
