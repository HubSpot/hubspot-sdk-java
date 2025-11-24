// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
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
                .referencedObjectType(FieldTypeDefinition.ReferencedObjectType.ABANDONED_CART)
                .build()

        assertThat(fieldTypeDefinition.externalOptions()).isEqualTo(true)
        assertThat(fieldTypeDefinition.name()).isEqualTo("name")
        assertThat(fieldTypeDefinition.options())
            .containsExactly(
                Option.builder()
                    .hidden(false)
                    .label("Option A")
                    .value("A")
                    .description("Choice number one")
                    .displayOrder(1)
                    .build()
            )
        assertThat(fieldTypeDefinition.type()).isEqualTo(FieldTypeDefinition.Type.BOOL)
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
