// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyCreateTest {

    @Test
    fun create() {
        val propertyCreate =
            PropertyCreate.builder()
                .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                .groupName("groupName")
                .label("label")
                .name("name")
                .type(PropertyCreate.Type.BOOL)
                .calculationFormula("calculationFormula")
                .dataSensitivity(PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE)
                .description("description")
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(true)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .referencedObjectType("referencedObjectType")
                .build()

        assertThat(propertyCreate.fieldType()).isEqualTo(PropertyCreate.FieldType.BOOLEANCHECKBOX)
        assertThat(propertyCreate.groupName()).isEqualTo("groupName")
        assertThat(propertyCreate.label()).isEqualTo("label")
        assertThat(propertyCreate.name()).isEqualTo("name")
        assertThat(propertyCreate.type()).isEqualTo(PropertyCreate.Type.BOOL)
        assertThat(propertyCreate.calculationFormula()).contains("calculationFormula")
        assertThat(propertyCreate.dataSensitivity())
            .contains(PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE)
        assertThat(propertyCreate.description()).contains("description")
        assertThat(propertyCreate.displayOrder()).contains(0)
        assertThat(propertyCreate.externalOptions()).contains(true)
        assertThat(propertyCreate.formField()).contains(true)
        assertThat(propertyCreate.hasUniqueValue()).contains(true)
        assertThat(propertyCreate.hidden()).contains(true)
        assertThat(propertyCreate.options().getOrNull())
            .containsExactly(
                OptionInput.builder()
                    .displayOrder(0)
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(propertyCreate.referencedObjectType()).contains("referencedObjectType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyCreate =
            PropertyCreate.builder()
                .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                .groupName("groupName")
                .label("label")
                .name("name")
                .type(PropertyCreate.Type.BOOL)
                .calculationFormula("calculationFormula")
                .dataSensitivity(PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE)
                .description("description")
                .displayOrder(0)
                .externalOptions(true)
                .formField(true)
                .hasUniqueValue(true)
                .hidden(true)
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .referencedObjectType("referencedObjectType")
                .build()

        val roundtrippedPropertyCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyCreate),
                jacksonTypeRef<PropertyCreate>(),
            )

        assertThat(roundtrippedPropertyCreate).isEqualTo(propertyCreate)
    }
}
