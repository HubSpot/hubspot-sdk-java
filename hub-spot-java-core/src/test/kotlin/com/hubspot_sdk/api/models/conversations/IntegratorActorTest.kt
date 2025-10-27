// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorActorTest {

    @Test
    fun create() {
        val integratorActor =
            IntegratorActor.builder()
                .id("id")
                .name("name")
                .type(IntegratorActor.Type.INTEGRATOR)
                .avatar("avatar")
                .build()

        assertThat(integratorActor.id()).isEqualTo("id")
        assertThat(integratorActor.name()).isEqualTo("name")
        assertThat(integratorActor.type()).isEqualTo(IntegratorActor.Type.INTEGRATOR)
        assertThat(integratorActor.avatar()).contains("avatar")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorActor =
            IntegratorActor.builder()
                .id("id")
                .name("name")
                .type(IntegratorActor.Type.INTEGRATOR)
                .avatar("avatar")
                .build()

        val roundtrippedIntegratorActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorActor),
                jacksonTypeRef<IntegratorActor>(),
            )

        assertThat(roundtrippedIntegratorActor).isEqualTo(integratorActor)
    }
}
