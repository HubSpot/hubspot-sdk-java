// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.hubspot_sdk.api.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDefinitionCreatePropertyParamsTest {

    @Test
    fun create() {
        EventDefinitionCreatePropertyParams.builder()
            .eventName("eventName")
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
    }

    @Test
    fun pathParams() {
        val params =
            EventDefinitionCreatePropertyParams.builder()
                .eventName("eventName")
                .label("label")
                .type("type")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventDefinitionCreatePropertyParams.builder()
                .eventName("eventName")
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

        val body = params._body()

        assertThat(body.label()).isEqualTo("label")
        assertThat(body.type()).isEqualTo("type")
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventDefinitionCreatePropertyParams.builder()
                .eventName("eventName")
                .label("label")
                .type("type")
                .build()

        val body = params._body()

        assertThat(body.label()).isEqualTo("label")
        assertThat(body.type()).isEqualTo("type")
    }
}
