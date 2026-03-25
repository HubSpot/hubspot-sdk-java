// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.events.send.Option
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

        assertThat(outputFieldDefinition.typeDefinition())
            .isEqualTo(
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

        val roundtrippedOutputFieldDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outputFieldDefinition),
                jacksonTypeRef<OutputFieldDefinition>(),
            )

        assertThat(roundtrippedOutputFieldDefinition).isEqualTo(outputFieldDefinition)
    }
}
