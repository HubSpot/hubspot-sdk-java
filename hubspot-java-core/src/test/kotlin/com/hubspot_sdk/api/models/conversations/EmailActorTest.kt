// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailActorTest {

    @Test
    fun create() {
        val emailActor =
            EmailActor.builder().id("id").email("email").type(EmailActor.Type.EMAIL).build()

        assertThat(emailActor.id()).isEqualTo("id")
        assertThat(emailActor.email()).isEqualTo("email")
        assertThat(emailActor.type()).isEqualTo(EmailActor.Type.EMAIL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailActor =
            EmailActor.builder().id("id").email("email").type(EmailActor.Type.EMAIL).build()

        val roundtrippedEmailActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailActor),
                jacksonTypeRef<EmailActor>(),
            )

        assertThat(roundtrippedEmailActor).isEqualTo(emailActor)
    }
}
