// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFieldTypeDefinitionTest {

    @Test
    fun create() {
        val publicFieldTypeDefinition =
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

        assertThat(publicFieldTypeDefinition.name()).isEqualTo("name")
        assertThat(publicFieldTypeDefinition.options())
            .containsExactly(
                PublicOption.builder()
                    .label("label")
                    .value("value")
                    .description("description")
                    .displayOrder(0)
                    .build()
            )
        assertThat(publicFieldTypeDefinition.type()).isEqualTo(PublicFieldTypeDefinition.Type.BOOL)
        assertThat(publicFieldTypeDefinition.description()).contains("description")
        assertThat(publicFieldTypeDefinition.fieldType())
            .contains(PublicFieldTypeDefinition.FieldType.BOOLEANCHECKBOX)
        assertThat(publicFieldTypeDefinition.helpText()).contains("helpText")
        assertThat(publicFieldTypeDefinition.label()).contains("label")
        assertThat(publicFieldTypeDefinition.optionsUrl()).contains("optionsUrl")
        assertThat(publicFieldTypeDefinition.referencedObjectType())
            .contains(PublicFieldTypeDefinition.ReferencedObjectType.OWNER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicFieldTypeDefinition =
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

        val roundtrippedPublicFieldTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFieldTypeDefinition),
                jacksonTypeRef<PublicFieldTypeDefinition>(),
            )

        assertThat(roundtrippedPublicFieldTypeDefinition).isEqualTo(publicFieldTypeDefinition)
    }
}
