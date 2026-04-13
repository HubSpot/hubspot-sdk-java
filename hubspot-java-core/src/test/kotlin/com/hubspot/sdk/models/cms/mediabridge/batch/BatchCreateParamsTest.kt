// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge.batch

import com.hubspot.sdk.models.OptionInput
import com.hubspot.sdk.models.cms.mediabridge.BatchInputPropertyCreate
import com.hubspot.sdk.models.cms.mediabridge.PropertyCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .appId(0)
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
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchCreateParams.builder()
                .appId(0)
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

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .appId(0)
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
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
                .appId(0)
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
