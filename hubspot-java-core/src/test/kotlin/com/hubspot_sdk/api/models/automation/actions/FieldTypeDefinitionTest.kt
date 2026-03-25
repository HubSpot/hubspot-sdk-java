// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.events.send.Option
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

        assertThat(fieldTypeDefinition.externalOptions()).isEqualTo(true)
        assertThat(fieldTypeDefinition.name()).isEqualTo("name")
        assertThat(fieldTypeDefinition.options())
            .containsExactly(
                Option.builder()
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .displayOrder(0)
                    .build()
            )
        assertThat(fieldTypeDefinition.schema())
            .isEqualTo(
                FieldTypeDefinition.Schema.ofIntegerField(
                    IntegerFieldSchema.builder()
                        .type(IntegerFieldSchema.Type.INTEGER)
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

        val roundtrippedFieldTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fieldTypeDefinition),
                jacksonTypeRef<FieldTypeDefinition>(),
            )

        assertThat(roundtrippedFieldTypeDefinition).isEqualTo(fieldTypeDefinition)
    }
}
