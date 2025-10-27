// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.hubspot_sdk.api.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyUpdateParamsTest {

    @Test
    fun create() {
        PropertyUpdateParams.builder()
            .objectType("objectType")
            .propertyName("propertyName")
            .propertyUpdate(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyUpdateParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .propertyUpdate(PropertyUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PropertyUpdateParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .propertyUpdate(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PropertyUpdateParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .propertyUpdate(PropertyUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PropertyUpdate.builder().build())
    }
}
