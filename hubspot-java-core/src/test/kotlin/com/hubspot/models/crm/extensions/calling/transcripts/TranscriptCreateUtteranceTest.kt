// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptCreateUtteranceTest {

    @Test
    fun create() {
        val transcriptCreateUtterance =
            TranscriptCreateUtterance.builder()
                .endTimeMillis(0)
                .speaker(Speaker.builder().id("id").name("name").email("email").build())
                .startTimeMillis(0)
                .text("text")
                .languageCode("languageCode")
                .build()

        assertThat(transcriptCreateUtterance.endTimeMillis()).isEqualTo(0)
        assertThat(transcriptCreateUtterance.speaker())
            .isEqualTo(Speaker.builder().id("id").name("name").email("email").build())
        assertThat(transcriptCreateUtterance.startTimeMillis()).isEqualTo(0)
        assertThat(transcriptCreateUtterance.text()).isEqualTo("text")
        assertThat(transcriptCreateUtterance.languageCode()).contains("languageCode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptCreateUtterance =
            TranscriptCreateUtterance.builder()
                .endTimeMillis(0)
                .speaker(Speaker.builder().id("id").name("name").email("email").build())
                .startTimeMillis(0)
                .text("text")
                .languageCode("languageCode")
                .build()

        val roundtrippedTranscriptCreateUtterance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptCreateUtterance),
                jacksonTypeRef<TranscriptCreateUtterance>(),
            )

        assertThat(roundtrippedTranscriptCreateUtterance).isEqualTo(transcriptCreateUtterance)
    }
}
