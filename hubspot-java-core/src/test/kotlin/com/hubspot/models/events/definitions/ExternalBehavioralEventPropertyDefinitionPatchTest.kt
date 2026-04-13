// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.OptionInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBehavioralEventPropertyDefinitionPatchTest {

    @Test
    fun create() {
        val externalBehavioralEventPropertyDefinitionPatch =
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

        assertThat(externalBehavioralEventPropertyDefinitionPatch.description())
            .contains("description")
        assertThat(externalBehavioralEventPropertyDefinitionPatch.label()).contains("label")
        assertThat(externalBehavioralEventPropertyDefinitionPatch.options().getOrNull())
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
        val externalBehavioralEventPropertyDefinitionPatch =
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

        val roundtrippedExternalBehavioralEventPropertyDefinitionPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBehavioralEventPropertyDefinitionPatch),
                jacksonTypeRef<ExternalBehavioralEventPropertyDefinitionPatch>(),
            )

        assertThat(roundtrippedExternalBehavioralEventPropertyDefinitionPatch)
            .isEqualTo(externalBehavioralEventPropertyDefinitionPatch)
    }
}
