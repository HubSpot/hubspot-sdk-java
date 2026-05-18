// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.AutomationActionsOption
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicActionRevisionForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicActionRevisionForwardPaging =
            CollectionResponsePublicActionRevisionForwardPaging.builder()
                .addResult(
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
                                                    PublicFieldTypeDefinition.FieldType
                                                        .BOOLEANCHECKBOX
                                                )
                                                .helpText("helpText")
                                                .label("label")
                                                .optionsUrl("optionsUrl")
                                                .referencedObjectType(
                                                    PublicFieldTypeDefinition.ReferencedObjectType
                                                        .OWNER
                                                )
                                                .build()
                                        )
                                        .addSupportedValueType(
                                            PublicInputFieldDefinition.SupportedValueType
                                                .STATIC_VALUE
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
                                                    "inputFieldDescriptions" to
                                                        mapOf("foo" to "string"),
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
                                    PublicObjectRequestOptions.builder()
                                        .addProperty("string")
                                        .build()
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
                                                        .type(IntegerFieldSchema.Type.ARRAY)
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
                                                .fieldType(
                                                    FieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                                )
                                                .helpText("helpText")
                                                .label("label")
                                                .optionsUrl("optionsUrl")
                                                .referencedObjectType(
                                                    FieldTypeDefinition.ReferencedObjectType
                                                        .ABANDONED_CART
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .revisionId("revisionId")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicActionRevisionForwardPaging.results())
            .containsExactly(
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
                                                "inputFieldDescriptions" to
                                                    mapOf("foo" to "string"),
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
                                                    .type(IntegerFieldSchema.Type.ARRAY)
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
                                            .fieldType(
                                                FieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                            )
                                            .helpText("helpText")
                                            .label("label")
                                            .optionsUrl("optionsUrl")
                                            .referencedObjectType(
                                                FieldTypeDefinition.ReferencedObjectType
                                                    .ABANDONED_CART
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .revisionId("revisionId")
                    .build()
            )
        assertThat(collectionResponsePublicActionRevisionForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicActionRevisionForwardPaging =
            CollectionResponsePublicActionRevisionForwardPaging.builder()
                .addResult(
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
                                                    PublicFieldTypeDefinition.FieldType
                                                        .BOOLEANCHECKBOX
                                                )
                                                .helpText("helpText")
                                                .label("label")
                                                .optionsUrl("optionsUrl")
                                                .referencedObjectType(
                                                    PublicFieldTypeDefinition.ReferencedObjectType
                                                        .OWNER
                                                )
                                                .build()
                                        )
                                        .addSupportedValueType(
                                            PublicInputFieldDefinition.SupportedValueType
                                                .STATIC_VALUE
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
                                                    "inputFieldDescriptions" to
                                                        mapOf("foo" to "string"),
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
                                    PublicObjectRequestOptions.builder()
                                        .addProperty("string")
                                        .build()
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
                                                        .type(IntegerFieldSchema.Type.ARRAY)
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
                                                .fieldType(
                                                    FieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                                )
                                                .helpText("helpText")
                                                .label("label")
                                                .optionsUrl("optionsUrl")
                                                .referencedObjectType(
                                                    FieldTypeDefinition.ReferencedObjectType
                                                        .ABANDONED_CART
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .revisionId("revisionId")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicActionRevisionForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicActionRevisionForwardPaging),
                jacksonTypeRef<CollectionResponsePublicActionRevisionForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicActionRevisionForwardPaging)
            .isEqualTo(collectionResponsePublicActionRevisionForwardPaging)
    }
}
