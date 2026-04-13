// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptUtteranceTest {

    @Test
    fun create() {
        val transcriptUtterance =
            TranscriptUtterance.builder()
                .id("id")
                .endTimeMillis(0)
                .startTimeMillis(0)
                .text("text")
                .languageCode("languageCode")
                .speaker(Speaker.builder().id("id").name("name").email("email").build())
                .build()

        assertThat(transcriptUtterance.id()).isEqualTo("id")
        assertThat(transcriptUtterance.endTimeMillis()).isEqualTo(0)
        assertThat(transcriptUtterance.startTimeMillis()).isEqualTo(0)
        assertThat(transcriptUtterance.text()).isEqualTo("text")
        assertThat(transcriptUtterance.languageCode()).contains("languageCode")
        assertThat(transcriptUtterance.speaker())
            .contains(Speaker.builder().id("id").name("name").email("email").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptUtterance =
            TranscriptUtterance.builder()
                .id("id")
                .endTimeMillis(0)
                .startTimeMillis(0)
                .text("text")
                .languageCode("languageCode")
                .speaker(Speaker.builder().id("id").name("name").email("email").build())
                .build()

        val roundtrippedTranscriptUtterance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptUtterance),
                jacksonTypeRef<TranscriptUtterance>(),
            )

        assertThat(roundtrippedTranscriptUtterance).isEqualTo(transcriptUtterance)
    }
}
