// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInputFieldDefinitionTest {

    @Test
    fun create() {
        val publicInputFieldDefinition =
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
                        .referencedObjectType(PublicFieldTypeDefinition.ReferencedObjectType.OWNER)
                        .build()
                )
                .addSupportedValueType(PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE)
                .build()

        assertThat(publicInputFieldDefinition.isRequired()).isEqualTo(true)
        assertThat(publicInputFieldDefinition.typeDefinition())
            .isEqualTo(
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
                    .referencedObjectType(PublicFieldTypeDefinition.ReferencedObjectType.OWNER)
                    .build()
            )
        assertThat(publicInputFieldDefinition.supportedValueTypes().getOrNull())
            .containsExactly(PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInputFieldDefinition =
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
                        .referencedObjectType(PublicFieldTypeDefinition.ReferencedObjectType.OWNER)
                        .build()
                )
                .addSupportedValueType(PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE)
                .build()

        val roundtrippedPublicInputFieldDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInputFieldDefinition),
                jacksonTypeRef<PublicInputFieldDefinition>(),
            )

        assertThat(roundtrippedPublicInputFieldDefinition).isEqualTo(publicInputFieldDefinition)
    }
}
