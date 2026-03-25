// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendCreateEventDefinitionPropertyParamsTest {

    @Test
    fun create() {
        SendCreateEventDefinitionPropertyParams.builder()
            .eventName("eventName")
            .externalBehavioralEventPropertyCreate(
                ExternalBehavioralEventPropertyCreate.builder()
                    .label("label")
                    .type("type")
                    .description("description")
                    .name("name")
                    .addOption(
                        OptionInput.builder()
                            .displayOrder(0)
                            .hidden(true)
                            .label("label")
                            .value("value")
                            .description("description")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SendCreateEventDefinitionPropertyParams.builder()
                .eventName("eventName")
                .externalBehavioralEventPropertyCreate(
                    ExternalBehavioralEventPropertyCreate.builder()
                        .label("label")
                        .type("type")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SendCreateEventDefinitionPropertyParams.builder()
                .eventName("eventName")
                .externalBehavioralEventPropertyCreate(
                    ExternalBehavioralEventPropertyCreate.builder()
                        .label("label")
                        .type("type")
                        .description("description")
                        .name("name")
                        .addOption(
                            OptionInput.builder()
                                .displayOrder(0)
                                .hidden(true)
                                .label("label")
                                .value("value")
                                .description("description")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalBehavioralEventPropertyCreate.builder()
                    .label("label")
                    .type("type")
                    .description("description")
                    .name("name")
                    .addOption(
                        OptionInput.builder()
                            .displayOrder(0)
                            .hidden(true)
                            .label("label")
                            .value("value")
                            .description("description")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SendCreateEventDefinitionPropertyParams.builder()
                .eventName("eventName")
                .externalBehavioralEventPropertyCreate(
                    ExternalBehavioralEventPropertyCreate.builder()
                        .label("label")
                        .type("type")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalBehavioralEventPropertyCreate.builder().label("label").type("type").build()
            )
    }
}
