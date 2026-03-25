// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BehavioralEventTypeDefinitionLabelsTest {

    @Test
    fun create() {
        val behavioralEventTypeDefinitionLabels =
            BehavioralEventTypeDefinitionLabels.builder()
                .singular("singular")
                .plural("plural")
                .build()

        assertThat(behavioralEventTypeDefinitionLabels.singular()).isEqualTo("singular")
        assertThat(behavioralEventTypeDefinitionLabels.plural()).contains("plural")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val behavioralEventTypeDefinitionLabels =
            BehavioralEventTypeDefinitionLabels.builder()
                .singular("singular")
                .plural("plural")
                .build()

        val roundtrippedBehavioralEventTypeDefinitionLabels =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(behavioralEventTypeDefinitionLabels),
                jacksonTypeRef<BehavioralEventTypeDefinitionLabels>(),
            )

        assertThat(roundtrippedBehavioralEventTypeDefinitionLabels)
            .isEqualTo(behavioralEventTypeDefinitionLabels)
    }
}
