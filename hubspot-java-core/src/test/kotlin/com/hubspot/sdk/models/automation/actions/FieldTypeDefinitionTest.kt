// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.AutomationActionsOption
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FieldTypeDefinitionTest {

    @Test
    fun create() {
        val fieldTypeDefinition =
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

        assertThat(fieldTypeDefinition.externalOptions()).isEqualTo(true)
        assertThat(fieldTypeDefinition.name()).isEqualTo("name")
        assertThat(fieldTypeDefinition.options())
            .containsExactly(
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
        assertThat(fieldTypeDefinition.schema())
            .isEqualTo(
                FieldTypeDefinition.Schema.ofIntegerField(
                    IntegerFieldSchema.builder()
                        .type(IntegerFieldSchema.Type.ARRAY)
                        .maximum(0)
                        .minimum(0)
                        .build()
                )
            )
        assertThat(fieldTypeDefinition.type()).isEqualTo(FieldTypeDefinition.Type.BOOL)
        assertThat(fieldTypeDefinition.useChirp()).isEqualTo(true)
        assertThat(fieldTypeDefinition.description()).contains("description")
        assertThat(fieldTypeDefinition.externalOptionsReferenceType())
            .contains("externalOptionsReferenceType")
        assertThat(fieldTypeDefinition.fieldType())
            .contains(FieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
        assertThat(fieldTypeDefinition.helpText()).contains("helpText")
        assertThat(fieldTypeDefinition.label()).contains("label")
        assertThat(fieldTypeDefinition.optionsUrl()).contains("optionsUrl")
        assertThat(fieldTypeDefinition.referencedObjectType())
            .contains(FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fieldTypeDefinition =
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

        val roundtrippedFieldTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fieldTypeDefinition),
                jacksonTypeRef<FieldTypeDefinition>(),
            )

        assertThat(roundtrippedFieldTypeDefinition).isEqualTo(fieldTypeDefinition)
    }
}
