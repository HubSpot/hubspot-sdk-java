// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.hubspot.sdk.models.OptionInput
import com.hubspot.sdk.models.PropertyCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeCreatePropertyParamsTest {

    @Test
    fun create() {
        MediaBridgeCreatePropertyParams.builder()
            .appId(0)
            .objectType("objectType")
            .propertyCreate(
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
                    .numberDisplayHint(PropertyCreate.NumberDisplayHint.CURRENCY)
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
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeCreatePropertyParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyCreate(
                    PropertyCreate.builder()
                        .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .type(PropertyCreate.Type.BOOL)
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
            MediaBridgeCreatePropertyParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyCreate(
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
                        .numberDisplayHint(PropertyCreate.NumberDisplayHint.CURRENCY)
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .numberDisplayHint(PropertyCreate.NumberDisplayHint.CURRENCY)
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
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeCreatePropertyParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyCreate(
                    PropertyCreate.builder()
                        .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                        .groupName("groupName")
                        .label("label")
                        .name("name")
                        .type(PropertyCreate.Type.BOOL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PropertyCreate.builder()
                    .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                    .groupName("groupName")
                    .label("label")
                    .name("name")
                    .type(PropertyCreate.Type.BOOL)
                    .build()
            )
    }
}
