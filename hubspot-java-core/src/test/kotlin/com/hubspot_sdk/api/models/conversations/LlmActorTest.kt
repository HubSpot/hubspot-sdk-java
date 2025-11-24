// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LlmActorTest {

    @Test
    fun create() {
        val llmActor =
            LlmActor.builder()
                .id("id")
                .type(LlmActor.Type.LLM)
                .avatar("avatar")
                .name("name")
                .build()

        assertThat(llmActor.id()).isEqualTo("id")
        assertThat(llmActor.type()).isEqualTo(LlmActor.Type.LLM)
        assertThat(llmActor.avatar()).contains("avatar")
        assertThat(llmActor.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val llmActor =
            LlmActor.builder()
                .id("id")
                .type(LlmActor.Type.LLM)
                .avatar("avatar")
                .name("name")
                .build()

        val roundtrippedLlmActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(llmActor),
                jacksonTypeRef<LlmActor>(),
            )

        assertThat(roundtrippedLlmActor).isEqualTo(llmActor)
    }
}
