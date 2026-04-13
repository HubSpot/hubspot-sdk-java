// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.properties

import com.hubspot.models.OptionInput
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
