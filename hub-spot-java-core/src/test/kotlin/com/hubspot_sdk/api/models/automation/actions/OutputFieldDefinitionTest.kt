// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
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

        assertThat(outputFieldDefinition.typeDefinition())
            .isEqualTo(
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

        val roundtrippedOutputFieldDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outputFieldDefinition),
                jacksonTypeRef<OutputFieldDefinition>(),
            )

        assertThat(roundtrippedOutputFieldDefinition).isEqualTo(outputFieldDefinition)
    }
}
