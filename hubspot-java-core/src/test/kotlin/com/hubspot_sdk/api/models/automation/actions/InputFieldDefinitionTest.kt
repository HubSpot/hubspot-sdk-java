// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InputFieldDefinitionTest {

    @Test
    fun create() {
        val inputFieldDefinition =
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
                .automationFieldType("automationFieldType")
                .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                .build()

        assertThat(inputFieldDefinition.isRequired()).isEqualTo(true)
        assertThat(inputFieldDefinition.typeDefinition())
            .isEqualTo(
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
        assertThat(inputFieldDefinition.automationFieldType()).contains("automationFieldType")
        assertThat(inputFieldDefinition.supportedValueTypes().getOrNull())
            .containsExactly(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inputFieldDefinition =
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
                .automationFieldType("automationFieldType")
                .addSupportedValueType(InputFieldDefinition.SupportedValueType.STATIC_VALUE)
                .build()

        val roundtrippedInputFieldDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inputFieldDefinition),
                jacksonTypeRef<InputFieldDefinition>(),
            )

        assertThat(roundtrippedInputFieldDefinition).isEqualTo(inputFieldDefinition)
    }
}
