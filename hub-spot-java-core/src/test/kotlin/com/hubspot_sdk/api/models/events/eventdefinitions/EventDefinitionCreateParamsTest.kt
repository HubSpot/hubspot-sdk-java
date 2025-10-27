// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.hubspot_sdk.api.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDefinitionCreateParamsTest {

    @Test
    fun create() {
        EventDefinitionCreateParams.builder()
            .externalBehavioralEventTypeDefinitionEgg(
                ExternalBehavioralEventTypeDefinitionEgg.builder()
                    .label("label")
                    .addPropertyDefinition(
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
                    .description("description")
                    .name("name")
                    .primaryObject("primaryObject")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EventDefinitionCreateParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(
                    ExternalBehavioralEventTypeDefinitionEgg.builder()
                        .label("label")
                        .addPropertyDefinition(
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
                        .description("description")
                        .name("name")
                        .primaryObject("primaryObject")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalBehavioralEventTypeDefinitionEgg.builder()
                    .label("label")
                    .addPropertyDefinition(
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
                    .description("description")
                    .name("name")
                    .primaryObject("primaryObject")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventDefinitionCreateParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(
                    ExternalBehavioralEventTypeDefinitionEgg.builder()
                        .label("label")
                        .addPropertyDefinition(
                            ExternalBehavioralEventPropertyCreate.builder()
                                .label("label")
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalBehavioralEventTypeDefinitionEgg.builder()
                    .label("label")
                    .addPropertyDefinition(
                        ExternalBehavioralEventPropertyCreate.builder()
                            .label("label")
                            .type("type")
                            .build()
                    )
                    .build()
            )
    }
}
