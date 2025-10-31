// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentActorTest {

    @Test
    fun create() {
        val agentActor =
            AgentActor.builder()
                .id("id")
                .type(AgentActor.Type.AGENT)
                .avatar("avatar")
                .email("email")
                .name("name")
                .build()

        assertThat(agentActor.id()).isEqualTo("id")
        assertThat(agentActor.type()).isEqualTo(AgentActor.Type.AGENT)
        assertThat(agentActor.avatar()).contains("avatar")
        assertThat(agentActor.email()).contains("email")
        assertThat(agentActor.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentActor =
            AgentActor.builder()
                .id("id")
                .type(AgentActor.Type.AGENT)
                .avatar("avatar")
                .email("email")
                .name("name")
                .build()

        val roundtrippedAgentActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentActor),
                jacksonTypeRef<AgentActor>(),
            )

        assertThat(roundtrippedAgentActor).isEqualTo(agentActor)
    }
}
