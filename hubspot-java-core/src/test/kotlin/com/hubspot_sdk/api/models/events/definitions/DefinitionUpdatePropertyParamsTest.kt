// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.events.ExternalBehavioralEventPropertyDefinitionPatch
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionUpdatePropertyParamsTest {

    @Test
    fun create() {
        DefinitionUpdatePropertyParams.builder()
            .eventName("eventName")
            .propertyName("propertyName")
            .externalBehavioralEventPropertyDefinitionPatch(
                ExternalBehavioralEventPropertyDefinitionPatch.builder()
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DefinitionUpdatePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .externalBehavioralEventPropertyDefinitionPatch(
                    ExternalBehavioralEventPropertyDefinitionPatch.builder().build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DefinitionUpdatePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .externalBehavioralEventPropertyDefinitionPatch(
                    ExternalBehavioralEventPropertyDefinitionPatch.builder()
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalBehavioralEventPropertyDefinitionPatch.builder()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DefinitionUpdatePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .externalBehavioralEventPropertyDefinitionPatch(
                    ExternalBehavioralEventPropertyDefinitionPatch.builder().build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ExternalBehavioralEventPropertyDefinitionPatch.builder().build())
    }
}
