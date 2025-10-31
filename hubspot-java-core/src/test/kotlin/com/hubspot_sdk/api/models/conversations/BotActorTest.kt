// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BotActorTest {

    @Test
    fun create() {
        val botActor =
            BotActor.builder()
                .id("id")
                .type(BotActor.Type.BOT)
                .avatar("avatar")
                .name("name")
                .build()

        assertThat(botActor.id()).isEqualTo("id")
        assertThat(botActor.type()).isEqualTo(BotActor.Type.BOT)
        assertThat(botActor.avatar()).contains("avatar")
        assertThat(botActor.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val botActor =
            BotActor.builder()
                .id("id")
                .type(BotActor.Type.BOT)
                .avatar("avatar")
                .name("name")
                .build()

        val roundtrippedBotActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(botActor),
                jacksonTypeRef<BotActor>(),
            )

        assertThat(roundtrippedBotActor).isEqualTo(botActor)
    }
}
