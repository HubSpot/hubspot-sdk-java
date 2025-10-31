// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.properties

import com.hubspot_sdk.api.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyUpdateParamsTest {

    @Test
    fun create() {
        PropertyUpdateParams.builder()
            .appId("appId")
            .objectType("objectType")
            .propertyName("propertyName")
            .calculationFormula("calculationFormula")
            .description("description")
            .displayOrder(0)
            .fieldType(PropertyUpdateParams.FieldType.BOOLEANCHECKBOX)
            .formField(true)
            .groupName("groupName")
            .hasUniqueValue(true)
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
            .type(PropertyUpdateParams.Type.BOOL)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyUpdateParams.builder()
                .appId("appId")
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PropertyUpdateParams.builder()
                .appId("appId")
                .objectType("objectType")
                .propertyName("propertyName")
                .calculationFormula("calculationFormula")
                .description("description")
                .displayOrder(0)
                .fieldType(PropertyUpdateParams.FieldType.BOOLEANCHECKBOX)
                .formField(true)
                .groupName("groupName")
                .hasUniqueValue(true)
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
                .type(PropertyUpdateParams.Type.BOOL)
                .build()

        val body = params._body()

        assertThat(body.calculationFormula()).contains("calculationFormula")
        assertThat(body.description()).contains("description")
        assertThat(body.displayOrder()).contains(0)
        assertThat(body.fieldType()).contains(PropertyUpdateParams.FieldType.BOOLEANCHECKBOX)
        assertThat(body.formField()).contains(true)
        assertThat(body.groupName()).contains("groupName")
        assertThat(body.hasUniqueValue()).contains(true)
        assertThat(body.hidden()).contains(true)
        assertThat(body.label()).contains("label")
        assertThat(body.options().getOrNull())
            .containsExactly(
                OptionInput.builder()
                    .displayOrder(0)
                    .hidden(true)
                    .label("label")
                    .value("value")
                    .description("description")
                    .build()
            )
        assertThat(body.type()).contains(PropertyUpdateParams.Type.BOOL)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PropertyUpdateParams.builder()
                .appId("appId")
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        val body = params._body()
    }
}
