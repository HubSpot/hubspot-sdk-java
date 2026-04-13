// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeakerTest {

    @Test
    fun create() {
        val speaker = Speaker.builder().id("id").name("name").email("email").build()

        assertThat(speaker.id()).isEqualTo("id")
        assertThat(speaker.name()).isEqualTo("name")
        assertThat(speaker.email()).contains("email")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speaker = Speaker.builder().id("id").name("name").email("email").build()

        val roundtrippedSpeaker =
            jsonMapper.readValue(jsonMapper.writeValueAsString(speaker), jacksonTypeRef<Speaker>())

        assertThat(roundtrippedSpeaker).isEqualTo(speaker)
    }
}
