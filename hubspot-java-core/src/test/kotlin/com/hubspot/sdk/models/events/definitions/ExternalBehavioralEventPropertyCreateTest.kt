// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBehavioralEventPropertyCreateTest {

    @Test
    fun create() {
        val externalBehavioralEventPropertyCreate =
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

        assertThat(externalBehavioralEventPropertyCreate.label()).isEqualTo("label")
        assertThat(externalBehavioralEventPropertyCreate.type()).isEqualTo("type")
        assertThat(externalBehavioralEventPropertyCreate.description()).contains("description")
        assertThat(externalBehavioralEventPropertyCreate.name()).contains("name")
        assertThat(externalBehavioralEventPropertyCreate.options().getOrNull())
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
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBehavioralEventPropertyCreate =
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

        val roundtrippedExternalBehavioralEventPropertyCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBehavioralEventPropertyCreate),
                jacksonTypeRef<ExternalBehavioralEventPropertyCreate>(),
            )

        assertThat(roundtrippedExternalBehavioralEventPropertyCreate)
            .isEqualTo(externalBehavioralEventPropertyCreate)
    }
}
