// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBehavioralEventTypeDefinitionEggTest {

    @Test
    fun create() {
        val externalBehavioralEventTypeDefinitionEgg =
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

        assertThat(externalBehavioralEventTypeDefinitionEgg.label()).isEqualTo("label")
        assertThat(externalBehavioralEventTypeDefinitionEgg.propertyDefinitions())
            .containsExactly(
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
        assertThat(externalBehavioralEventTypeDefinitionEgg.description()).contains("description")
        assertThat(externalBehavioralEventTypeDefinitionEgg.name()).contains("name")
        assertThat(externalBehavioralEventTypeDefinitionEgg.primaryObject())
            .contains("primaryObject")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBehavioralEventTypeDefinitionEgg =
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

        val roundtrippedExternalBehavioralEventTypeDefinitionEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBehavioralEventTypeDefinitionEgg),
                jacksonTypeRef<ExternalBehavioralEventTypeDefinitionEgg>(),
            )

        assertThat(roundtrippedExternalBehavioralEventTypeDefinitionEgg)
            .isEqualTo(externalBehavioralEventTypeDefinitionEgg)
    }
}
