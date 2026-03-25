// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendCreateEventDefinitionParamsTest {

    @Test
    fun create() {
        SendCreateEventDefinitionParams.builder()
            .externalBehavioralEventTypeDefinitionEgg(
                ExternalBehavioralEventTypeDefinitionEgg.builder()
                    .includeDefaultProperties(true)
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
                    .customMatchingId(
                        ExternalObjectResolutionMappingRequest.builder()
                            .primaryObjectRule(
                                ExternalPrimaryObjectResolutionRule.builder()
                                    .eventPropertyName("eventPropertyName")
                                    .targetObjectPropertyName("targetObjectPropertyName")
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
            SendCreateEventDefinitionParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(
                    ExternalBehavioralEventTypeDefinitionEgg.builder()
                        .includeDefaultProperties(true)
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
                        .customMatchingId(
                            ExternalObjectResolutionMappingRequest.builder()
                                .primaryObjectRule(
                                    ExternalPrimaryObjectResolutionRule.builder()
                                        .eventPropertyName("eventPropertyName")
                                        .targetObjectPropertyName("targetObjectPropertyName")
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
                    .includeDefaultProperties(true)
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
                    .customMatchingId(
                        ExternalObjectResolutionMappingRequest.builder()
                            .primaryObjectRule(
                                ExternalPrimaryObjectResolutionRule.builder()
                                    .eventPropertyName("eventPropertyName")
                                    .targetObjectPropertyName("targetObjectPropertyName")
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
            SendCreateEventDefinitionParams.builder()
                .externalBehavioralEventTypeDefinitionEgg(
                    ExternalBehavioralEventTypeDefinitionEgg.builder()
                        .includeDefaultProperties(true)
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
                    .includeDefaultProperties(true)
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
