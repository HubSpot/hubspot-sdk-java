// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SystemActorTest {

    @Test
    fun create() {
        val systemActor = SystemActor.builder().id("id").type(SystemActor.Type.SYSTEM).build()

        assertThat(systemActor.id()).isEqualTo("id")
        assertThat(systemActor.type()).isEqualTo(SystemActor.Type.SYSTEM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val systemActor = SystemActor.builder().id("id").type(SystemActor.Type.SYSTEM).build()

        val roundtrippedSystemActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(systemActor),
                jacksonTypeRef<SystemActor>(),
            )

        assertThat(roundtrippedSystemActor).isEqualTo(systemActor)
    }
}
