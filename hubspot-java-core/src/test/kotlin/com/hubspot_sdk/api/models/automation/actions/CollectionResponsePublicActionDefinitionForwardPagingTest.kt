// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Option
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicActionDefinitionForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicActionDefinitionForwardPaging =
            CollectionResponsePublicActionDefinitionForwardPaging.builder()
                .addResult(
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
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicActionDefinitionForwardPaging.results())
            .containsExactly(
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
                    .build()
            )
        assertThat(collectionResponsePublicActionDefinitionForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicActionDefinitionForwardPaging =
            CollectionResponsePublicActionDefinitionForwardPaging.builder()
                .addResult(
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
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicActionDefinitionForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicActionDefinitionForwardPaging
                ),
                jacksonTypeRef<CollectionResponsePublicActionDefinitionForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicActionDefinitionForwardPaging)
            .isEqualTo(collectionResponsePublicActionDefinitionForwardPaging)
    }
}
