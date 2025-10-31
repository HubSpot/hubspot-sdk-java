// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VisitorActorTest {

    @Test
    fun create() {
        val visitorActor =
            VisitorActor.builder()
                .id("id")
                .type(VisitorActor.Type.VISITOR)
                .avatar("avatar")
                .email("email")
                .name("name")
                .build()

        assertThat(visitorActor.id()).isEqualTo("id")
        assertThat(visitorActor.type()).isEqualTo(VisitorActor.Type.VISITOR)
        assertThat(visitorActor.avatar()).contains("avatar")
        assertThat(visitorActor.email()).contains("email")
        assertThat(visitorActor.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val visitorActor =
            VisitorActor.builder()
                .id("id")
                .type(VisitorActor.Type.VISITOR)
                .avatar("avatar")
                .email("email")
                .name("name")
                .build()

        val roundtrippedVisitorActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(visitorActor),
                jacksonTypeRef<VisitorActor>(),
            )

        assertThat(roundtrippedVisitorActor).isEqualTo(visitorActor)
    }
}
