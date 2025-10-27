// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties.batch

import com.hubspot_sdk.api.models.BatchInputPropertyCreate
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.PropertyCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .objectType("objectType")
            .batchInputPropertyCreate(
                BatchInputPropertyCreate.builder()
                    .addInput(
                        PropertyCreate.builder()
                            .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                            .groupName("groupName")
                            .label("label")
                            .name("name")
                            .type(PropertyCreate.Type.BOOL)
                            .calculationFormula("calculationFormula")
                            .dataSensitivity(PropertyCreate.DataSensitivity.NON_SENSITIVE)
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
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchCreateParams.builder()
                .objectType("objectType")
                .batchInputPropertyCreate(
                    BatchInputPropertyCreate.builder()
                        .addInput(
                            PropertyCreate.builder()
                                .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                                .groupName("groupName")
                                .label("label")
                                .name("name")
                                .type(PropertyCreate.Type.BOOL)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .objectType("objectType")
                .batchInputPropertyCreate(
                    BatchInputPropertyCreate.builder()
                        .addInput(
                            PropertyCreate.builder()
                                .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                                .groupName("groupName")
                                .label("label")
                                .name("name")
                                .type(PropertyCreate.Type.BOOL)
                                .calculationFormula("calculationFormula")
                                .dataSensitivity(PropertyCreate.DataSensitivity.NON_SENSITIVE)
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
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPropertyCreate.builder()
                    .addInput(
                        PropertyCreate.builder()
                            .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                            .groupName("groupName")
                            .label("label")
                            .name("name")
                            .type(PropertyCreate.Type.BOOL)
                            .calculationFormula("calculationFormula")
                            .dataSensitivity(PropertyCreate.DataSensitivity.NON_SENSITIVE)
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
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
                .objectType("objectType")
                .batchInputPropertyCreate(
                    BatchInputPropertyCreate.builder()
                        .addInput(
                            PropertyCreate.builder()
                                .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                                .groupName("groupName")
                                .label("label")
                                .name("name")
                                .type(PropertyCreate.Type.BOOL)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPropertyCreate.builder()
                    .addInput(
                        PropertyCreate.builder()
                            .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                            .groupName("groupName")
                            .label("label")
                            .name("name")
                            .type(PropertyCreate.Type.BOOL)
                            .build()
                    )
                    .build()
            )
    }
}
