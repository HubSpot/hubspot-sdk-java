// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyUpdateTest {

    @Test
    fun create() {
        val propertyUpdate =
            PropertyUpdate.builder()
                .calculationFormula("calculationFormula")
                .description("description")
                .displayOrder(2)
                .fieldType(PropertyUpdate.FieldType.SELECT)
                .formField(true)
                .groupName("contactinformation")
                .hidden(false)
                .label("My Contact Property")
                .addOption(
                    OptionInput.builder()
                        .displayOrder(1)
                        .hidden(false)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .build()
                )
                .addOption(
                    OptionInput.builder()
                        .displayOrder(2)
                        .hidden(false)
                        .label("Option B")
                        .value("B")
                        .description("Choice number two")
                        .build()
                )
                .type(PropertyUpdate.Type.ENUMERATION)
                .build()

        assertThat(propertyUpdate.calculationFormula()).contains("calculationFormula")
        assertThat(propertyUpdate.description()).contains("description")
        assertThat(propertyUpdate.displayOrder()).contains(2)
        assertThat(propertyUpdate.fieldType()).contains(PropertyUpdate.FieldType.SELECT)
        assertThat(propertyUpdate.formField()).contains(true)
        assertThat(propertyUpdate.groupName()).contains("contactinformation")
        assertThat(propertyUpdate.hidden()).contains(false)
        assertThat(propertyUpdate.label()).contains("My Contact Property")
        assertThat(propertyUpdate.options().getOrNull())
            .containsExactly(
                OptionInput.builder()
                    .displayOrder(1)
                    .hidden(false)
                    .label("Option A")
                    .value("A")
                    .description("Choice number one")
                    .build(),
                OptionInput.builder()
                    .displayOrder(2)
                    .hidden(false)
                    .label("Option B")
                    .value("B")
                    .description("Choice number two")
                    .build(),
            )
        assertThat(propertyUpdate.type()).contains(PropertyUpdate.Type.ENUMERATION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyUpdate =
            PropertyUpdate.builder()
                .calculationFormula("calculationFormula")
                .description("description")
                .displayOrder(2)
                .fieldType(PropertyUpdate.FieldType.SELECT)
                .formField(true)
                .groupName("contactinformation")
                .hidden(false)
                .label("My Contact Property")
                .addOption(
                    OptionInput.builder()
                        .displayOrder(1)
                        .hidden(false)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .build()
                )
                .addOption(
                    OptionInput.builder()
                        .displayOrder(2)
                        .hidden(false)
                        .label("Option B")
                        .value("B")
                        .description("Choice number two")
                        .build()
                )
                .type(PropertyUpdate.Type.ENUMERATION)
                .build()

        val roundtrippedPropertyUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyUpdate),
                jacksonTypeRef<PropertyUpdate>(),
            )

        assertThat(roundtrippedPropertyUpdate).isEqualTo(propertyUpdate)
    }
}
