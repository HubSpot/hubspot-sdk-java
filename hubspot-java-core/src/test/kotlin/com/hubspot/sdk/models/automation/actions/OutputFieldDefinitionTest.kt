// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.AutomationActionsOption
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutputFieldDefinitionTest {

    @Test
    fun create() {
        val outputFieldDefinition =
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

        assertThat(outputFieldDefinition.typeDefinition())
            .isEqualTo(
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
                    .externalOptionsReferenceType("externalOptionsReferenceType")
                    .fieldType(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
                    .helpText("helpText")
                    .label("label")
                    .optionsUrl("optionsUrl")
                    .referencedObjectType(FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outputFieldDefinition =
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

        val roundtrippedOutputFieldDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outputFieldDefinition),
                jacksonTypeRef<OutputFieldDefinition>(),
            )

        assertThat(roundtrippedOutputFieldDefinition).isEqualTo(outputFieldDefinition)
    }
}
