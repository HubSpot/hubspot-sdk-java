// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBehavioralEventTypeDefinitionPatchTest {

    @Test
    fun create() {
        val externalBehavioralEventTypeDefinitionPatch =
            ExternalBehavioralEventTypeDefinitionPatch.builder()
                .description("description")
                .label("label")
                .build()

        assertThat(externalBehavioralEventTypeDefinitionPatch.description()).contains("description")
        assertThat(externalBehavioralEventTypeDefinitionPatch.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBehavioralEventTypeDefinitionPatch =
            ExternalBehavioralEventTypeDefinitionPatch.builder()
                .description("description")
                .label("label")
                .build()

        val roundtrippedExternalBehavioralEventTypeDefinitionPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBehavioralEventTypeDefinitionPatch),
                jacksonTypeRef<ExternalBehavioralEventTypeDefinitionPatch>(),
            )

        assertThat(roundtrippedExternalBehavioralEventTypeDefinitionPatch)
            .isEqualTo(externalBehavioralEventTypeDefinitionPatch)
    }
}
