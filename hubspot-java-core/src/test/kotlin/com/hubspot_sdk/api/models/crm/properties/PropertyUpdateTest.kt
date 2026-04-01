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
                .currencyPropertyName("currencyPropertyName")
                .description("description")
                .displayOrder(0)
                .fieldType(PropertyUpdate.FieldType.BOOLEANCHECKBOX)
                .formField(true)
                .groupName("groupName")
                .hidden(true)
                .label("label")
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .showCurrencySymbol(true)
                .type(PropertyUpdate.Type.BOOL)
                .build()

        assertThat(propertyUpdate.calculationFormula()).contains("calculationFormula")
        assertThat(propertyUpdate.currencyPropertyName()).contains("currencyPropertyName")
        assertThat(propertyUpdate.description()).contains("description")
        assertThat(propertyUpdate.displayOrder()).contains(0)
        assertThat(propertyUpdate.fieldType()).contains(PropertyUpdate.FieldType.BOOLEANCHECKBOX)
        assertThat(propertyUpdate.formField()).contains(true)
        assertThat(propertyUpdate.groupName()).contains("groupName")
        assertThat(propertyUpdate.hidden()).contains(true)
        assertThat(propertyUpdate.label()).contains("label")
        assertThat(propertyUpdate.options().getOrNull())
            .containsExactly(
                OptionInput.builder()
                    .displayOrder(0)
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(propertyUpdate.showCurrencySymbol()).contains(true)
        assertThat(propertyUpdate.type()).contains(PropertyUpdate.Type.BOOL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyUpdate =
            PropertyUpdate.builder()
                .calculationFormula("calculationFormula")
                .currencyPropertyName("currencyPropertyName")
                .description("description")
                .displayOrder(0)
                .fieldType(PropertyUpdate.FieldType.BOOLEANCHECKBOX)
                .formField(true)
                .groupName("groupName")
                .hidden(true)
                .label("label")
                .addOption(
                    OptionInput.builder()
                        .displayOrder(0)
                        .hidden(true)
                        .label("label")
                        .value("value")
                        .description("description")
                        .build()
                )
                .showCurrencySymbol(true)
                .type(PropertyUpdate.Type.BOOL)
                .build()

        val roundtrippedPropertyUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyUpdate),
                jacksonTypeRef<PropertyUpdate>(),
            )

        assertThat(roundtrippedPropertyUpdate).isEqualTo(propertyUpdate)
    }
}
