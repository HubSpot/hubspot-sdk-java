// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.properties

import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgePropertyUpdate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyUpdateParamsTest {

    @Test
    fun create() {
        PropertyUpdateParams.builder()
            .appId(0)
            .objectType("objectType")
            .propertyName("propertyName")
            .mediaBridgePropertyUpdate(
                MediaBridgePropertyUpdate.builder()
                    .calculationFormula("calculationFormula")
                    .description("description")
                    .displayOrder(0)
                    .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
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
                    .type(MediaBridgePropertyUpdate.Type.BOOL)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyUpdateParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyName("propertyName")
                .mediaBridgePropertyUpdate(MediaBridgePropertyUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PropertyUpdateParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyName("propertyName")
                .mediaBridgePropertyUpdate(
                    MediaBridgePropertyUpdate.builder()
                        .calculationFormula("calculationFormula")
                        .description("description")
                        .displayOrder(0)
                        .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
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
                        .type(MediaBridgePropertyUpdate.Type.BOOL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MediaBridgePropertyUpdate.builder()
                    .calculationFormula("calculationFormula")
                    .description("description")
                    .displayOrder(0)
                    .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
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
                    .type(MediaBridgePropertyUpdate.Type.BOOL)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PropertyUpdateParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyName("propertyName")
                .mediaBridgePropertyUpdate(MediaBridgePropertyUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(MediaBridgePropertyUpdate.builder().build())
    }
}
