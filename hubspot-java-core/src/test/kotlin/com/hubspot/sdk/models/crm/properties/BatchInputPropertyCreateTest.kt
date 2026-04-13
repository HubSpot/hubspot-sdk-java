// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPropertyCreateTest {

    @Test
    fun create() {
        val batchInputPropertyCreate =
            BatchInputPropertyCreate.builder()
                .addInput(
                    PropertyCreate.builder()
                        .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .type(PropertyCreate.Type.BOOL)
                        .calculationFormula("calculationFormula")
                        .currencyPropertyName("currencyPropertyName")
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
                        .showCurrencySymbol(true)
                        .build()
                )
                .build()

        assertThat(batchInputPropertyCreate.inputs())
            .containsExactly(
                PropertyCreate.builder()
                    .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                    .groupName("groupName")
                    .label("label")
                    .name("name")
                    .type(PropertyCreate.Type.BOOL)
                    .calculationFormula("calculationFormula")
                    .currencyPropertyName("currencyPropertyName")
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
                    .showCurrencySymbol(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPropertyCreate =
            BatchInputPropertyCreate.builder()
                .addInput(
                    PropertyCreate.builder()
                        .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .type(PropertyCreate.Type.BOOL)
                        .calculationFormula("calculationFormula")
                        .currencyPropertyName("currencyPropertyName")
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
                        .showCurrencySymbol(true)
                        .build()
                )
                .build()

        val roundtrippedBatchInputPropertyCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPropertyCreate),
                jacksonTypeRef<BatchInputPropertyCreate>(),
            )

        assertThat(roundtrippedBatchInputPropertyCreate).isEqualTo(batchInputPropertyCreate)
    }
}
