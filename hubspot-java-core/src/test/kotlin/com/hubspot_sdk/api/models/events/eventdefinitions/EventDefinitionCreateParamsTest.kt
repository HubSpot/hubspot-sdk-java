// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.hubspot_sdk.api.models.OptionInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDefinitionCreateParamsTest {

    @Test
    fun create() {
        EventDefinitionCreateParams.builder()
            .label("label")
            .addPropertyDefinition(
                EventDefinitionCreateParams.PropertyDefinition.builder()
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
    }

    @Test
    fun body() {
        val params =
            EventDefinitionCreateParams.builder()
                .label("label")
                .addPropertyDefinition(
                    EventDefinitionCreateParams.PropertyDefinition.builder()
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

        val body = params._body()

        assertThat(body.label()).isEqualTo("label")
        assertThat(body.propertyDefinitions())
            .containsExactly(
                EventDefinitionCreateParams.PropertyDefinition.builder()
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
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.primaryObject()).contains("primaryObject")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventDefinitionCreateParams.builder()
                .label("label")
                .addPropertyDefinition(
                    EventDefinitionCreateParams.PropertyDefinition.builder()
                        .label("label")
                        .type("type")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.label()).isEqualTo("label")
        assertThat(body.propertyDefinitions())
            .containsExactly(
                EventDefinitionCreateParams.PropertyDefinition.builder()
                    .label("label")
                    .type("type")
                    .build()
            )
    }
}
