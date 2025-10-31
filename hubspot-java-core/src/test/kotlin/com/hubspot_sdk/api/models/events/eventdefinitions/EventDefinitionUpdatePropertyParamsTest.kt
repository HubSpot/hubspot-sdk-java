// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.hubspot_sdk.api.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDefinitionUpdatePropertyParamsTest {

    @Test
    fun create() {
        EventDefinitionUpdatePropertyParams.builder()
            .eventName("eventName")
            .propertyName("propertyName")
            .description("description")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventDefinitionUpdatePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventDefinitionUpdatePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .description("description")
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
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventDefinitionUpdatePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .build()

        val body = params._body()
    }
}
